plugins {
    /**
     * 有两种值
     * com.android.application表示应用模块,可以直接运行
     * com.android.library表示库模块,依附于其他应用模块运行
     */
    id("com.android.application")
    //使用Kotlin插件开发Android项目
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.android_sdk_learning"
    compileSdk = 33 //项目编译版本，33对应Android12

    defaultConfig {
        applicationId = "com.example.android_sdk_learning" //应用唯一标识符
        minSdk = 21 //最低兼容21SDK，对应Android 5
        targetSdk = 33 //启用33版本特性与功能
        versionCode = 1 //项目版本号
        versionName = "1.0" //项目版本名

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner" //启用junit测试
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    //生成安装文件的相关配置
    buildTypes {
        //一般只有两个子闭包:debug/release
        release {
            isMinifyEnabled = false //是否代码混淆
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") //若混淆，使用的规则文件
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}