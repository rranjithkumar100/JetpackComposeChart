plugins {
  id("com.android.library")
  kotlin("android")
  `maven-publish`
}

apply(from = rootProject.file("gradle/configure-android.gradle"))
apply(from = rootProject.file("gradle/configure-compose.gradle"))
apply(from = rootProject.file("gradle/jitpack-publish.gradle"))

dependencies {
  api(project(":lib:common"))

  implementation(Kotlin.stdLib)

  implementation(Compose.animation)
  implementation(Compose.core)
  implementation(Compose.layout)
  implementation(Compose.foundation)
  implementation(Compose.runtime)

  // Previews weren't working when using debugImplementation
  implementation(Compose.tooling)
}