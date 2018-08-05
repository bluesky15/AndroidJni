#include<jni.h>
#include<string.h>

jstring Java_com_kalinga_apps_androidjnidemo_MainActivity_helloWorld(JNIEnv* env, jobject obj){
return(*env)->NewStringUTF(env, "Hello Wrld native!!");
}