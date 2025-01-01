import DependencyVersion.COMPOSE_NAVIGATION
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.exclude

object DependencyVersion {
    const val COMPOSE_NAVIGATION = "2.8.3"
    const val COMPOSE_DESTINATION = "2.1.0-beta14"
    const val RETROFIT = "2.11.0"
    const val OKHTTP_LOGGING_INTERCEPTOR = "4.12.0"
    const val SCALABLE_SIZE_UNIT_COMPOSE = "1.1.0"
    const val SCALABLE_SIZE_UNIT_XML = "1.1.0"
    const val KOIN = "3.5.6"
    const val EVENT_BUS = "3.3.1"
    const val GLIDE = "4.16.0"
    const val GLIDE_COMPOSE = "1.0.0-beta01"
    const val FIREBASE_PLATFORM = "33.7.0"
    const val COMPOSE_MATERIAL_DIALOGS = "0.9.0"
    const val SIGNALR_CLIENT = "8.0.8"
    const val HILT = "2.53.1"
}


fun DependencyHandler.provideComposeNavigation()
{
    implementation("androidx.navigation:navigation-compose:$COMPOSE_NAVIGATION")
}

fun DependencyHandler.provideComposeDestination()
{
    implementation("io.github.raamcosta.compose-destinations:core:${DependencyVersion.COMPOSE_DESTINATION}")
    ksp("io.github.raamcosta.compose-destinations:ksp:${DependencyVersion.COMPOSE_DESTINATION}")
    implementation("io.github.raamcosta.compose-destinations:bottom-sheet:${DependencyVersion.COMPOSE_DESTINATION}")
}

fun DependencyHandler.provideRetrofit()
{
    implementation("com.squareup.retrofit2:retrofit:${DependencyVersion.RETROFIT}")
    implementation("com.squareup.retrofit2:converter-gson:${DependencyVersion.RETROFIT}")
}

fun DependencyHandler.provideOkHttpLoggingInterceptor()
{
    implementation("com.squareup.okhttp3:logging-interceptor:${DependencyVersion.OKHTTP_LOGGING_INTERCEPTOR}")
}

fun DependencyHandler.provideScalableSizeUnitCompose() {
    implementation("com.github.Kaaveh:sdp-compose:${DependencyVersion.SCALABLE_SIZE_UNIT_COMPOSE}")
}

fun DependencyHandler.provideScalableSizeUnitXml()
{
    implementation("com.intuit.sdp:sdp-android:${DependencyVersion.SCALABLE_SIZE_UNIT_XML}")
    implementation("com.intuit.ssp:ssp-android:${DependencyVersion.SCALABLE_SIZE_UNIT_XML}")
}

fun DependencyHandler.provideKoin()
{
    implementation("io.insert-koin:koin-core:${DependencyVersion.KOIN}")
    implementation("io.insert-koin:koin-android:${DependencyVersion.KOIN}")
    implementation("io.insert-koin:koin-androidx-compose:${DependencyVersion.KOIN}")
    implementation("io.insert-koin:koin-androidx-navigation:${DependencyVersion.KOIN}")
}

fun DependencyHandler.provideEventBus()
{
    implementation("org.greenrobot:eventbus:${DependencyVersion.EVENT_BUS}")
}

fun DependencyHandler.provideGlide()
{
    implementation("com.github.bumptech.glide:glide:${DependencyVersion.GLIDE}")
}

fun DependencyHandler.provideGlideCompose()
{
    implementation("com.github.bumptech.glide:compose:${DependencyVersion.GLIDE_COMPOSE}")
}

fun DependencyHandler.provideReactiveX()
{
    implementation("io.reactivex.rxjava2:rxjava:2.2.21")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
}

fun DependencyHandler.providePdfReader()
{
    implementation("io.github.grizzi91:bouquet:1.1.2")
}

fun DependencyHandler.provideFirebaseBasics()
{
    implementPlatform("com.google.firebase:firebase-bom:${DependencyVersion.FIREBASE_PLATFORM}")
    implementation("com.google.firebase:firebase-analytics")
}

fun DependencyHandler.provideFirebaseMessaging()
{
    implementation("com.google.firebase:firebase-messaging")
}

fun DependencyHandler.provideComposeCompiler()
{
    implementation("androidx.compose.compiler:compiler:1.5.15")
}

fun DependencyHandler.provideComposeMaterialDialogs()
{
    implementation("io.github.vanpra.compose-material-dialogs:core:${DependencyVersion.COMPOSE_MATERIAL_DIALOGS}")
    implementation("io.github.vanpra.compose-material-dialogs:datetime:${DependencyVersion.COMPOSE_MATERIAL_DIALOGS}")
    implementation("io.github.vanpra.compose-material-dialogs:color:${DependencyVersion.COMPOSE_MATERIAL_DIALOGS}")
}

fun DependencyHandler.provideSignalRClient()
{
    implementation("com.microsoft.signalr:signalr:${DependencyVersion.SIGNALR_CLIENT}")
}

fun DependencyHandlerScope.provideQRCodeScanner()
{
    implementation("com.google.zxing:core:3.5.2")
    implementation("com.journeyapps:zxing-android-embedded:4.3.0")
    implementation("com.github.yuriy-budiyev:code-scanner:2.3.2")
}

fun DependencyHandler.providePrettyLoggingInterceptor()
{
    implementation("com.github.ihsanbal:LoggingInterceptor:3.1.0") {
        exclude(group = "org.json", module = "json")
    }
}

fun DependencyHandler.provideHilt()
{
    implementation("com.google.dagger:hilt-android:${DependencyVersion.HILT}")
    ksp("com.google.dagger:hilt-android-compiler:${DependencyVersion.HILT}")
}


