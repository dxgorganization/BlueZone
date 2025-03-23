plugins {
    id("com.google.gms.google-services") version "4.4.2" apply false // Firebase plugin
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}