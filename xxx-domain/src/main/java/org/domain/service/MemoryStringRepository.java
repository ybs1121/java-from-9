package org.domain.service;

import java.util.ArrayList;
import java.util.List;

public class MemoryStringRepository implements StringRepository {

    private final List<String> stringList = new ArrayList<>();

    @Override
    public void save(String data) {
        stringList.add(data);
        System.out.println("저장");
    }
}
