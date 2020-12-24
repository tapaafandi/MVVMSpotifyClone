package com.tapaafandi.mvvmspotifyclone.exoplayer

import android.support.v4.media.MediaMetadataCompat
import com.tapaafandi.mvvmspotifyclone.data.entities.Song

fun MediaMetadataCompat.toSong() : Song? {
    return description?.let {
        Song(
            it.mediaId ?: "",
            it.title.toString(),
            it.subtitle.toString(),
            it.mediaId.toString(),
            it.iconUri.toString()
        )
    }

}