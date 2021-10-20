package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
return 0;
//        return returnnumbers.stream().reduce();
    }

    public String getLongest(List<String> words) {

        return words.stream().reduce("",(word1, word2) -> word1.length() > word2.length() ? word1 : word2);
    }

    public int getTotalLength(List<String> words) {
        return 0;
    }
}
