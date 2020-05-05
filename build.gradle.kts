plugins {
    java
    scala
}

repositories {
	mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Javadoc> {
    source += sourceSets["main"].allJava
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}
