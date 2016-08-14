package com.khtn.tapdoclophai.utility;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Debug;
import android.util.Log;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;

/**
 * Created by Sayuri Kurata on 2016/08/13.
 */
public class AudioPlayer {

    private MediaPlayer mediaPlayer;

    public AudioPlayer(String path, String fileName) {
        try {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(path + File.separator + fileName);
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AudioPlayer(FileDescriptor fd, long offset, long length) {
        try {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(fd, offset, length);
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void play() {
        mediaPlayer.start();
    }

    public void stop() {
        mediaPlayer.stop();
    }

    public void restart() {
        mediaPlayer.pause();
        mediaPlayer.seekTo(0);
    }

    public void reset() {
        mediaPlayer.reset();
    }

    public void release() {
        mediaPlayer.release();
        mediaPlayer = null;
    }

    public boolean isPlaying() {
        return mediaPlayer.isPlaying();
    }
}
