module com.domain {
    exports org.domain;
    exports org.domain.service;
//    exports org.domain to com.api; // 특정 모듈에만 공개

    provides org.domain.service.StringRepository with
            org.domain.service.DatabaseStringRepository,
            org.domain.service.MemoryStringRepository;

}