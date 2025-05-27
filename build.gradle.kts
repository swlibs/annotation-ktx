plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

object PackageInfo {
    const val PACKAGE_NAME = "com.swlibs.annotation-ktx"
    const val VERSION = "1.0"
	const val DESCRIPTION = "Annotation Library"
	
	val JVM = JavaVersion.VERSION_17
}

project.version = PackageInfo.VERSION

java {
    sourceCompatibility = PackageInfo.JVM
    targetCompatibility = PackageInfo.JVM
}
