plugins {
    `kotlin-dsl`

}
repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    //Kotlin Version
    val kotlinVersion = "2.1.0"
    val kspVersion = "2.1.0-1.0.29"
    val agpVersion = "8.7.3"
    api(kotlin("gradle-plugin:$kotlinVersion"))
    implementation("com.android.tools.build:gradle:$agpVersion")
    implementation("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:$kspVersion")
}
