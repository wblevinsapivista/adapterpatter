package com.terazo.adapterpattern.services;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class WavPlayerService {
    public void play(final String filename) throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        AudioStream output = new AudioStream(classLoader.getResourceAsStream(filename));
        AudioPlayer.player.start(output);
    }
}
