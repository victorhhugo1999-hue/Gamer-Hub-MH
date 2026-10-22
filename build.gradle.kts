plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.gamerhub.mh"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.gamerhub.mh"
        minSdk = 23
        targetSdk = 35
        versionCode = 2
        versionName = "0.2"
    }
}
