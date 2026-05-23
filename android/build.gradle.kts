plugins {
    id("com.android.library")
}

group = "net.nfet.flutter.printing"
version = "1.0"

repositories {
    google()
    mavenCentral()
}

android {
    namespace = "net.nfet.flutter.printing"

    compileSdk = 37

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    defaultConfig {
        minSdk = 21
    }

    lint {
        disable += "InvalidPackage"
    }
}