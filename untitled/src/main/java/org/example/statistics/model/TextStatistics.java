package org.example.statistics.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TextStatistics {
    private int wordCount;
    private String mostCommonWord;
    private int longestWordLength;
    private double averageWordLength;
}
