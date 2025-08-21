// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Only needed for older plugin styles; kotlin plugin is applied in plugins block below
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    kotlin("android") version "1.9.10" apply false
    id("com.android.application") version "8.1.2" apply false
    id("com.google.gms.google-services") version "4.4.0" apply false
    id("com.google.firebase.crashlytics") version "2.9.5" apply false
    id("dagger.hilt.android.plugin") version "2.46" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
