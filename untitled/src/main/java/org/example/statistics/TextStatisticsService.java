package org.example.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.example.statistics.model.TextStatistics;

public class TextStatisticsService {
    public TextStatistics getStatistics(String text) {
        // TODO
        // Please use Streams

       List<String> words =   Stream.of(text.split("[\\p{Punct}\\s]+")).map(element -> new String(element)).collect(Collectors.toList());



       System.out.println(words);

       return null;


    }
}
