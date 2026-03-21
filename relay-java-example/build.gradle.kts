plugins {
    id("relay.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":relay-java-core"))
    implementation(project(":relay-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :relay-java-example:run` to run `Main`
    // Use `./gradlew :relay-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "dev.relayapi.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
