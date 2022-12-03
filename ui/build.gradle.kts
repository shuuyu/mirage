import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.api.file.DuplicatesStrategy.EXCLUDE

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("com.github.johnrengelman.shadow")
}

val luv: Configuration by configurations.creating {
    configurations.implementation.get().extendsFrom(this)
    isTransitive = false
}

dependencies {
    val lwjgl = "3.3.1"
    luv("org.lwjgl:lwjgl:$lwjgl")
    luv("org.lwjgl:lwjgl:$lwjgl:natives-windows")
}

tasks {
    "shadowJar"(ShadowJar::class) {
        configurations = listOf(luv)
        duplicatesStrategy = EXCLUDE
    }

    "compileKotlin"(KotlinCompile::class) {
        kotlinOptions {
            jvmTarget = "17"
            freeCompilerArgs = listOf(

            )
        }
    }

    "compileJava"(JavaCompile::class) {
        sourceCompatibility = JavaVersion.VERSION_17.toString()
        targetCompatibility = JavaVersion.VERSION_17.toString()
    }
}

kotlin.jvmToolchain {
    this.languageVersion.set(JavaLanguageVersion.of(17))
}