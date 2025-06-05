plugins {
    kotlin("jvm") version "1.9.24"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:5.8.0")      // motor de test
    testImplementation("io.kotest:kotest-assertions-core:5.8.0")    // matchers
    testImplementation("io.kotest:kotest-framework-engine:5.8.0")  // necesario para ejecución
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}