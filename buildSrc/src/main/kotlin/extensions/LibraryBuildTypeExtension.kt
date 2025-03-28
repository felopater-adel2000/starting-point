package extensions

import com.android.build.api.dsl.LibraryBuildType

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