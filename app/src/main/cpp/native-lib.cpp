#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_homework19_App_apiKey(
        JNIEnv* env,
        jobject /* this */) {
    std::string key = "AIzaSyBhdMpcA5waFSM8A-srIFoWoulrMS-0Ptg";
    return env->NewStringUTF(key.c_str());
}