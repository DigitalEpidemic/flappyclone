package com.jeffpolasz.flappyclone.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jeffpolasz.flappyclone.FlappyClone;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlappyClone.WIDTH;
		config.height = FlappyClone.HEIGHT;
		config.title = FlappyClone.TITLE;
		new LwjglApplication(new FlappyClone(), config);
	}
}
