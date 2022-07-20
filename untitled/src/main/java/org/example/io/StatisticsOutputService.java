package org.example.io;

import org.example.statistics.model.TextStatistics;

public interface StatisticsOutputService {
    void save(TextStatistics statistics);
}
