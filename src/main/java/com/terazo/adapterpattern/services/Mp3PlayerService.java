package com.terazo.adapterpattern.services;

import java.io.BufferedInputStream;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Mp3PlayerService {
    public void play(final String filename) throws JavaLayerException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        BufferedInputStream buffer = new BufferedInputStream(classLoader.getResourceAsStream(filename));
        Player player = new Player(buffer);
        player.play();
    }
}
