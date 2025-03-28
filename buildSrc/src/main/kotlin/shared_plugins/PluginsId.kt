package shared_plugins

object PluginsId {
    /** Development Plugins **/
    const val ANDROID_APPLICATION = "com.android.application"
    const val KOTLIN_ANDROID = "org.jetbrains.kotlin.android"
    const val KOTLIN_COMPOSE = "org.jetbrains.kotlin.plugin.compose"
    const val HILT = "com.google.dagger.hilt.android"
    const val KAPT = "org.jetbrains.kotlin.kapt"
    const val KSP = "com.google.devtools.ksp"
    const val KOTLIN_SERIALIZATION = "org.jetbrains.kotlin.plugin.serialization"
    const val GOOGLE_PROTOBUF = "com.google.protobuf"
    const val KOTLIN_PARCELIZE = "kotlin-parcelize"


    /** Tools Plugins **/
    const val FIREBASE_APP_DISTRIBUTION = "com.google.firebase.appdistribution"
    const val FIREBASE_CRASHLYTICS = "com.google.firebase.crashlytics"
    const val KTLINT = "ktlint-settings"
    const val SPOTLESS = "spotless-settings"
    const val DETEKT = "detekt-settings"
    const val UPDATE_DEPS_VERSIONS = "update-dependencies"
    const val DOKKA = "dokka-settings"
}