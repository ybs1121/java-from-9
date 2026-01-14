package org.api;

import org.domain.service.StringRepository;

import java.util.ServiceLoader;

public class StringRepositoryLoader {

    private static final String DEFAULT = "DatabaseStringRepository";

    public static StringRepository getDefault() {
        return getRepository(DEFAULT);
    }

    private static StringRepository getRepository(String name) {
        ServiceLoader<StringRepository> load = ServiceLoader.load(StringRepository.class);
        for (StringRepository stringRepository : load) {
            if (stringRepository.getClass().getSimpleName().equals(name)) {
                return stringRepository;
            }
        }

        throw new IllegalArgumentException("원하는 서비스 X");
    }
}
