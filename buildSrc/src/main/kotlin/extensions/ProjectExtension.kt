package extensions

import org.gradle.api.Project
import java.util.Properties

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



