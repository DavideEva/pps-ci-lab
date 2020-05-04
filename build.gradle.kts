plugins {
	java
	scala
}

repositories {
	mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.2")
    testImplementation("org.scalatest:scalatest_2.13:3.1.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
}
