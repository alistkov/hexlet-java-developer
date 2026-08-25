plugins {
    id("java")
    id("io.github.ben-manes.versions") version "0.61.0"
}

group = "hexlet"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.20.0")
}
