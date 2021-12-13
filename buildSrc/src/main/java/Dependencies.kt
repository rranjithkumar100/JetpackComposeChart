@file:JvmName("Deps")

object Versions {
    const val kotlin = "1.5.21"
    const val composeCompilerVersion = kotlin
    const val compose = "1.0.1"
    const val targetSdk = 30
    const val buildVersion = "30.0.3"
}

object Compose {
    const val animation = "androidx.compose.animation:animation:${Versions.compose}"
    const val core = "androidx.compose.ui:ui:${Versions.compose}"
    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val layout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val materialIconsExt = "androidx.compose.material:material-icons-extended:${Versions.compose}"
    const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
}

object Android {
    const val activityCompose = "androidx.activity:activity-compose:1.3.1"
    const val appcompat = "androidx.appcompat:appcompat:1.3.1"
}

object Kotlin {
    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
}