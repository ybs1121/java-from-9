package org.domain.service;

public class DatabaseStringRepository implements StringRepository{
    @Override
    public void save(String data) {
        System.out.println("데이터베이스 저장");
    }
}
