plugins {
    id("org.springframework.boot") version "3.3.2"
}

dependencies {
    api(project(":multimodule01-infrastructure-data"))
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
}
