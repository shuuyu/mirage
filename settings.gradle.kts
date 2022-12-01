@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
        maven("https://maven.fabricmc.net")
        maven("https://maven.architectury.dev/")
        maven("https://maven.minecraftforge.net/")
        maven("https://maven.quiltmc.org/repository/release")
        maven("https://repo.essential.gg/repository/maven-public")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

include(":client")
include(":ui")
include(":annotation-processor")

rootProject.name = "mirage"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            ktor()
        }
    }
}

fun VersionCatalogBuilder.ktor() {
    val ktorVersion = version("ktor", "2.1.3")

    library("ktor-client-json", "io.ktor", "ktor-client-json").versionRef(ktorVersion)
    library("ktor-client-websockets", "io.ktor", "ktor-client-websockets").versionRef(ktorVersion)
    library("ktor-server-core-jvm", "io.ktor", "ktor-server-core-jvm").versionRef(ktorVersion)
    library("ktor-client-core-jvm", "io.ktor", "ktor-client-core-jvm").versionRef(ktorVersion)
    library("ktor-client-cio-jvm", "io.ktor", "ktor-client-cio-jvm").versionRef(ktorVersion)
    library("ktor-client-content-negotiation-jvm", "io.ktor", "ktor-client-content-negotiation-jvm").versionRef(ktorVersion)

    bundle("ktor-bundle", listOf(
        "ktor-client-json",
        "ktor-client-websockets",
        "ktor-server-core-jvm",
        "ktor-client-core-jvm",
        "ktor-client-cio-jvm",
        "ktor-client-content-negotiation-jvm",
    ))
}