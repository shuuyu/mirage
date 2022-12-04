import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("dev.architectury.loom")
    kotlin("plugin.serialization")
    id("com.github.johnrengelman.shadow")
    id("io.github.juuxel.loom-quiltflower")
}

java.withSourcesJar()

quiltflower {
    quiltflowerVersion.set("1.9.0")
}

loom {
    silentMojangMappingsLicense()
    runConfigs {
        getByName("client") {
            isIdeConfigGenerated = true
        }
        remove(getByName("server"))
    }
}

dependencies {
    implementation(project(":ui"))
    implementation(libs.bundles.ktor.bundle)
    implementation("com.github.cbyrneee:KDiscordIPC:2b18392114")

    minecraft("com.mojang:minecraft:1.19.2")
    mappings("net.fabricmc:yarn:1.19.2+build.28:v2")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.67.0+1.19.2")
    modImplementation("net.fabricmc:fabric-loader:0.14.10")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.8.7+kotlin.1.7.22")
}

tasks {
    "shadowJar"(ShadowJar::class) {
        archiveClassifier.set("mirage")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

    "compileKotlin"(KotlinCompile::class) {
        kotlinOptions {
            jvmTarget = "17"
            freeCompilerArgs = listOf(

            )
        }
    }
}