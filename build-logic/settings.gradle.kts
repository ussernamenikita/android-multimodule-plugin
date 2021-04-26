rootProject.name = "build-logic"

includeBuild("../libraries")

include("kotlin-convention")
include("testing-convention")
include("static-analysis-convention")
include("idea-convention")

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}