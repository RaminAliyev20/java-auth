plugins {
    java
    id("org.springframework.boot") version "2.7.1"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_13

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    compileOnly("org.projectlombok:lombok")
    runtimeOnly("org.postgresql:postgresql")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
// https://mvnrepository.com/artifact/org.liquibase/liquibase-core
    implementation("org.liquibase:liquibase-core:4.21.1")
    implementation ("org.springframework.boot:spring-boot-starter-mail:2.7.5")
    implementation("org.mapstruct:mapstruct-jdk8:1.3.0.Final")
    annotationProcessor("org.mapstruct:mapstruct-jdk8:1.3.0.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.3.0.Final")
    implementation("net.javacrumbs.shedlock:shedlock-provider-jdbc-template:2.2.0")
    // https://mvnrepository.com/artifact/net.javacrumbs.shedlock/shedlock-spring
    implementation("net.javacrumbs.shedlock:shedlock-spring:5.2.0")
// https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui
    implementation("io.springfox:springfox-swagger-ui:3.0.0")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:3.1.1")
    implementation("io.github.openfeign:feign-httpclient:10.12")
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security
    implementation("org.springframework.boot:spring-boot-starter-security")


}

tasks.withType<Test> {
    useJUnitPlatform()
}
