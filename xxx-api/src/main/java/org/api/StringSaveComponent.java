package org.api;

import org.domain.service.StringRepository;

public class StringSaveComponent {


    private static final StringRepository stringRepository = StringRepositoryLoader.getDefault();

    public static void main(String[] args) {
        stringRepository.save("s");
    }
}
