module com.api {
    uses org.domain.service.StringRepository;
    exports org.api;
    requires com.domain;
}