package com.terazo.adapterpattern;

import com.terazo.adapterpattern.adapters.MediaPlayerAdapter;
import com.terazo.adapterpattern.exceptions.AudioFileFormatException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;

public class Application {
    public static void main(String[] args) {
        MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter();

        try {
            mediaPlayerAdapter.playFile("NeverGonnaGiveYouUp.mp3");
        } catch (JavaLayerException jle) {
            jle.printStackTrace();
        } catch (AudioFileFormatException affe) {
            affe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
