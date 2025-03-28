package extensions

import org.gradle.api.artifacts.ModuleDependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.add

/** Adding Dependencies **/
fun DependencyHandler.implementation(dependency: String, configuration: ModuleDependency.() -> Unit = {})
{
    add("implementation", dependency, configuration)
}

fun DependencyHandler.testImplementation(dependency: String, configuration: ModuleDependency.() -> Unit = {})
{
    add("testImplementation", dependency, configuration)
}

fun DependencyHandler.androidTestImplementation(dependency: String, configuration: ModuleDependency.() -> Unit = {})
{
    add("androidTestImplementation", dependency, configuration)
}

fun DependencyHandler.debugImplementation(dependency: String, configuration: ModuleDependency.() -> Unit = {})
{
    add("debugImplementation", dependency, configuration)
}

fun DependencyHandler.kapt(dependency: String, configuration: ModuleDependency.() -> Unit = {})
{
    add("kapt", dependency, configuration)
}


fun DependencyHandler.ksp(dependency: String, configuration: ModuleDependency.() -> Unit = {})
{
    add("ksp", dependency, configuration)
}

fun DependencyHandler.implementPlatform(dependency: String)
{
    add("implementation", platform(dependency))
}