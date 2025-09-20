plugins {
    id("java-library")
    id("chirp.kotlin-common")
    id("org.springframework.boot")
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}