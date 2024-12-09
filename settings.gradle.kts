import org.gradle.api.tasks.testing.logging.TestExceptionFormat

rootProject.name = "MineAuth"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

buildCache {
    local {
        isEnabled = true
        directory = file("${rootDir}/.gradle/build-cache")
    }
}
include("core")
include("api")
include("addons:quickshop-hikari")