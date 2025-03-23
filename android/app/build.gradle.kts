plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.dxgorg.bluezone" // Add this line to specify the namespace
    compileSdk = 33

    defaultConfig {
        applicationId = "com.dxgorg.bluezone"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("com.google.firebase:firebase-analytics:21.2.0")
}