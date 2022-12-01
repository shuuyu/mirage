import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.api.file.DuplicatesStrategy.EXCLUDE

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("com.github.johnrengelman.shadow")
}

dependencies {

}

tasks {
    "shadowJar"(ShadowJar::class) {
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
