plugins {
    id("chirp.kotlin-common")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    /*
     * 不是類安全存取子用法，應該要可以用安全的方式
     * https://docs.gradle.org/current/userguide/kotlin_dsl.html?utm_source=chatgpt.com#sec:kotlin_using_standard_api
     */
    "implementation"(libraries.findLibrary("kotlin-reflect").get())
    "implementation"(libraries.findLibrary("kotlin-stdlib").get())
    "implementation"(libraries.findLibrary("spring-boot-starter-web").get())

    "testImplementation"(libraries.findLibrary("spring-boot-starter-test").get())
    "testImplementation"(libraries.findLibrary("kotlin-test-junit5").get())
    "testRuntimeOnly"(libraries.findLibrary("junit-platform-launcher").get())
}