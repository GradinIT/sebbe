package org.example.exercise;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class FileSystemInfo {
    private final String absolutePath;
    private final Long getTotalSpace;
    private final Long getFreeSpace;
    private final Long getUsableSpace;
}