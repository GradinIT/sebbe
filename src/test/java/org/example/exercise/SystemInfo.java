package org.example.exercise;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SystemInfo {
    private final Integer cpuCoreCount;
    private final Long freeMemmory;
    private final Long totalMemmory;
    private final List<FileSystemInfo> fileSystemInfos;
}
