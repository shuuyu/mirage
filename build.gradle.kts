import org.gradle.api.tasks.wrapper.Wrapper.DistributionType.ALL

plugins {
    kotlin("jvm") version "1.7.22" apply false
    kotlin("plugin.serialization") version "1.7.22" apply false
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false
    id("dev.architectury.loom") version "1.0-SNAPSHOT" apply false
    id("io.github.juuxel.loom-quiltflower") version "1.7.4" apply false
}

group = "live.shuuyu"

tasks.wrapper {
    version = "7.6"
    distributionType = ALL
}

allprojects {
    group = "live.shuuyu"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}