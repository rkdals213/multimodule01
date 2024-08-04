plugins {
    id("org.springframework.boot")
}

dependencies {
    api(project(":multimodule01-infrastructure-data"))

    implementation("org.springframework.boot:spring-boot-starter-batch")
    testImplementation("org.springframework.batch:spring-batch-test")
}

allOpen {
    annotation("com.example.common.JobParameter")
}
