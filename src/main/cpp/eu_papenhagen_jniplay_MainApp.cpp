#include "eu_papenhagen_jniplay_MainApp.h"
#include <iostream>

JNIEXPORT void JNICALL Java_eu_papenhagen_jniplay_MainApp_output (JNIEnv *env, jclass cls){
	std::cout << "Output form C++" <<std:endl;
}