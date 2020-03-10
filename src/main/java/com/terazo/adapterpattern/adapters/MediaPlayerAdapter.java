package com.terazo.adapterpattern.adapters;

import com.terazo.adapterpattern.exceptions.AudioFileFormatException;
import com.terazo.adapterpattern.services.Mp3PlayerService;
import com.terazo.adapterpattern.services.WavPlayerService;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;

public class MediaPlayerAdapter {
    private Mp3PlayerService mp3PlayerService;
    private WavPlayerService wavPlayerService;

    public MediaPlayerAdapter() {
        this.mp3PlayerService = new Mp3PlayerService();
        this.wavPlayerService = new WavPlayerService();
    }

    public void playFile(String filename)
        throws IOException, JavaLayerException, AudioFileFormatException {
        if (filename.endsWith(".mp3")) {
            mp3PlayerService.play(filename);
        } else if (filename.endsWith(".wav")) {
            wavPlayerService.play(filename);
        } else {
            throw new AudioFileFormatException("Oops, dont know that file format");
        }
    }
}
