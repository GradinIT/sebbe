package org.example.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SystemHardware {


    public static void main(String[] args) {
        System.out.println(listFilesUsingDirectoryStream(System.getenv("HOMEBREW_REPOSITORY")));
        System.out.println(SystemInfo.builder()
                .cpuCoreCount(Runtime.getRuntime().availableProcessors())
                .freeMemmory(Runtime.getRuntime().freeMemory())
                .totalMemmory(Runtime.getRuntime().maxMemory())
                .fileSystemInfos(scanFilsystems(File.listRoots()))
                .build());


    }
    private static Set<String> listFilesUsingDirectoryStream(String dir) {
        System.out.println(dir);
        Set<String> fileSet = new HashSet<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir+"/bin"))) {
            for (Path path : stream) {
                fileSet.add(path.getFileName()
                            .toString());
            }
        } catch (IOException e) {
            return fileSet;
        }
        return fileSet;
    }
    private static List<FileSystemInfo> scanFilsystems(File[] files) {
        return Arrays.stream(files).map(file -> FileSystemInfo.builder()
                .absolutePath(file.getAbsolutePath())
                .getUsableSpace(file.getUsableSpace())
                .getTotalSpace(file.getTotalSpace())
                .getFreeSpace(file.getFreeSpace())
                .build()).collect(Collectors.toList());
    }
}
