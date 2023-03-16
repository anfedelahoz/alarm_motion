# Alarm Motion Mobile

# App- Android

## IDE de desarrollo
Android Studio Dolphin | 2021.3.1

## Lenguaje de desarrollo
JAVA

## En el build.gradle (app)
Para asegurar que la aplicación pueda ejecutarse de manera correcta, la versiones utilizadas en las dependencias fueron:


dependencies {

    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    implementation 'androidx.navigation:navigation-fragment:2.4.1'
    implementation 'androidx.navigation:navigation-ui:2.4.1'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'com.nex3z:toggle-button-group:1.2.3'

}

Asegurarse que en Android/buildFeatures , este configurado a :

buildFeatures {

    viewBinding true
    
}


## Instrucciones ejecución del proyecto en Android Studio
- Clonar el respositorio, ingresar a la carpeta /Alarm_Motion_Mobile
- Ejecutar Android Studio en modo administrador y abrir la carpeta mencionada en el paso anterior
## APK
[alarm_motion_apk.zip](https://github.com/anfedelahoz/alarm_motion/files/10985986/alarm_motion_apk.zip)



