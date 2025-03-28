package shared_plugins

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.kotlinExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class SharedLibraryConfiguration : Plugin<Project> {
    override fun apply(project: Project) {
        project.applyPlugins()
        project.setAndroidConfigurations()
        project.setKotlinOptions()
    }

    private fun Project.applyPlugins() {

    }

    private fun Project.setAndroidConfigurations() {
        pluginManager.apply {
            extensions.getByType<LibraryExtension>().apply {
                compileSdk = DefaultConfig.compileSdk

                defaultConfig {
                    minSdk = DefaultConfig.minSdk
                }

                buildTypes {
                    release {

                    }

                    debug {

                    }
                }

                buildFeatures {
                    compose = true
                    buildConfig = true
                }

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_11
                    targetCompatibility = JavaVersion.VERSION_11
                }

            }
        }
    }

    private fun Project.setKotlinOptions() {
        tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_11.toString()
            }
        }
    }
}