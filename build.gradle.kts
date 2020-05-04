plugins {
    java
    scala
    id("com.github.maiflai.scalatest") version "0.26"
}

repositories {
	mavenCentral()
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.2")
    testImplementation("org.scalatest:scalatest_2.13:3.1.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("com.vladsch.flexmark:flexmark-profile-pegdown:0.36.8")
}
