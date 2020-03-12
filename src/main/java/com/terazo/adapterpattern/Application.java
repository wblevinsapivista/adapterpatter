package com.terazo.adapterpattern;

import com.terazo.adapterpattern.adapters.MediaPlayerAdapter;
import com.terazo.adapterpattern.exceptions.AudioFileFormatException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javazoom.jl.decoder.JavaLayerException;

public class Application {
    public static void main(String[] args) {
        // prompting for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a filename:");
        String filename = sc.nextLine();
        System.out.println("Playing file " + filename);

        // use the adapter pattern to play the filename entered
        try {
            new MediaPlayerAdapter().playFile(filename);
        } catch (AudioFileFormatException afe) {
            afe.printStackTrace();
        } catch (JavaLayerException jle) {
            jle.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (LineUnavailableException lue) {
            lue.printStackTrace();
        } catch (UnsupportedAudioFileException use) {
            use.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
