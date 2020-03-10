package com.terazo.adapterpattern.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class WavPlayerService {
    public void play(final String filename) throws IOException {
        // open the sound file as a Java input stream
        InputStream in = new AudioStream(getClass().getResourceAsStream(filename));

        // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }
}
