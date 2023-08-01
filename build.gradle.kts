plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.spring") version "1.9.0"
    kotlin("plugin.jpa") version "1.9.0"
    kotlin("plugin.allopen") version "1.9.0"
    kotlin("plugin.noarg") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"
    id("org.springframework.boot") version "3.1.2"
    id("io.spring.dependency-management") version "1.1.2"
}

group = "studio.hcmc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":data-domain"))
    implementation(project(":data-transfer-object"))
    implementation(project(":data-value-object"))
    implementation(project(":jpa-converter-extension"))
    implementation(project(":kotlin-protocol-extension"))
    implementation(project(":spring-controller"))
    implementation(project(":spring-controller-extension"))
    implementation(project(":spring-entity"))
    implementation(project(":spring-repository"))
    implementation(project(":spring-repository-extension"))
    implementation(project(":spring-service"))

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.5.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-jvm:1.5.1")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("com.mysql:mysql-connector-j")
}

kotlin {
    jvmToolchain(17)
}