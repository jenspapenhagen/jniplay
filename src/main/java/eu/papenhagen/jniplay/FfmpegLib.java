/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.papenhagen.jniplay;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

/**
 * Loading the FFmpeg.dll // http://ffmpeg.org/
 *
 * @author jens.papenhagen
 */
public interface FfmpegLib extends Library {

    public static final String JNA_LIBRARY_NAME = "Ffmpeg";
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(FfmpegLib.JNA_LIBRARY_NAME);
    public static final FfmpegLib INSTANCE = (FfmpegLib) Native.loadLibrary(FfmpegLib.JNA_LIBRARY_NAME, FfmpegLib.class);
    
    

}
