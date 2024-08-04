plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "multimodule01"

include("multimodule01-api")

include("multimodule01-infrastructure-data")
include("multimodule01-infrastructure-data:jpa")
findProject(":multimodule01-infrastructure-data:jpa")?.name = "jpa"

include("multimodule01-batch")
