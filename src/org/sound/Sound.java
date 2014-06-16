package org.sound;

import android.content.Context;
import android.media.MediaPlayer;

public class Sound {
	
	private static MediaPlayer mediaPlayer;

	/*
	 * Plays the sound of the media file with the given resid.
	 * If there is still a media file playing, it will be stopped.
	 */
	public static void playSound(Context context, int resid){
		// stop the media player if it is playing
		if(mediaPlayer != null && mediaPlayer.isPlaying())
		{
		    mediaPlayer.stop();
		}
		
		// set the context and the id of the media file
		mediaPlayer = MediaPlayer.create(context, resid);
		
		// play the file
		mediaPlayer.start();
	}
}
