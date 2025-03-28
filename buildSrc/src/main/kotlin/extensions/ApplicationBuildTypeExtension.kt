package extensions

import com.android.build.api.dsl.ApplicationBuildType

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