package com.example.musicplayer

import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer

class AndroidMusicPlayer(context: Context) {
    private val exoPlayer: ExoPlayer = ExoPlayer.Builder(context.applicationContext).build()

    fun play(url: String) {
        val mediaItem = MediaItem.fromUri(url)

        exoPlayer.setMediaItem(mediaItem)
        exoPlayer.prepare()
        exoPlayer.play()
    }

    fun pause(){
        exoPlayer.pause()
    }

    fun resume(){
        exoPlayer.play()
    }

    fun isPlaying(): Boolean {
        return exoPlayer.isPlaying
    }

    fun release(){
        exoPlayer.release()
    }
}
