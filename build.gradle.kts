import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    application
    alias(libs.plugins.spotless)
    alias(libs.plugins.versions)

}

group = "hexlet"
version = "1.0-SNAPSHOT"

application { mainClass.set("hexlet.App") }

repositories { mavenCentral() }

dependencies {
    implementation(libs.commons.lang3)
    implementation(libs.commons.collections4)
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter(libs.versions.junit.get())
        }
    }
}

tasks.test {
    testLogging {
        showStandardStreams = true

        // какие события показывать
        events(
            TestLogEvent.FAILED,
            TestLogEvent.PASSED,
            TestLogEvent.SKIPPED,
            TestLogEvent.STANDARD_OUT,
            TestLogEvent.STANDARD_ERROR,
        )

        exceptionFormat = TestExceptionFormat.FULL

        showExceptions = true
        showCauses = true
        showStackTraces = true
    }
}

spotless {
    java {
        importOrder()
        removeUnusedImports()
        googleJavaFormat().aosp()
        formatAnnotations()
        leadingTabsToSpaces(4)
        endWithNewline()
    }
}
