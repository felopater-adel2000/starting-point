import com.android.build.api.dsl.ApplicationBuildType
import com.android.build.api.dsl.LibraryBuildType
import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.ExternalModuleDependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import java.util.Properties
import org.gradle.api.artifacts.ModuleDependency
import org.gradle.kotlin.dsl.add

/** Import Local Property in .properties file **/
fun Project.getLocalProperty(propertiesFileName: String, propertyName: String): String
{
    val localProperties = Properties().apply {
        val localPropertyFile = project.rootProject.file(propertiesFileName)

        if(localPropertyFile.exists())
        {
            load(localPropertyFile.inputStream())
        }
    }

    return localProperties.getProperty(propertyName) ?: throw Exception("Property $propertyName not found in $propertiesFileName")
}


/** Add Filed in BuildConfig File **/
fun ApplicationBuildType.addStringFieldBuildConfig(name: String, value: String)
{
    this.buildConfigField("String", name, value)
}

fun ApplicationBuildType.addIntFieldBuildConfig(name: String, value: String)
{
    this.buildConfigField("int", name, value)
}

fun ApplicationBuildType.addBooleanFieldBuildConfig(name: String, value: String)
{
    this.buildConfigField("boolean", name, value)
}

fun LibraryBuildType.addStringFieldBuildConfig(name: String, value: String)
{
    this.buildConfigField("String", name, value)
}

fun LibraryBuildType.addIntFieldBuildConfig(name: String, value: String)
{
    this.buildConfigField("int", name, value)
}

fun LibraryBuildType.addBooleanFieldBuildConfig(name: String, value: String)
{
    this.buildConfigField("boolean", name, value)
}


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
