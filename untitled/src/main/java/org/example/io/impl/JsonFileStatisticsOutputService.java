package org.example.io.impl;

import org.example.io.StatisticsOutputService;
import org.example.statistics.model.TextStatistics;

public class JsonFileStatisticsOutputService implements StatisticsOutputService {
    private final static String OUTPUT_FILE_NAME = "statistics.json";
    @Override
    public void save(TextStatistics statistics) {
        // TODO
    }
}
