package com.example.nokiaxtheme;

import java.util.Locale;

import android.content.Context;
import android.os.Build;

public class Helpers {
	
	/**
	 * Sets the correct theme based on the device that the app is running on.
	 * You have two options for implementing this:
	 *  - set the theme on the Application object
	 *  - call this method at the beginning of onCreate in every Activity
	 * 
	 * @param c  context, e.g. an Application or Activity
	 */
	public static void setTheme(Context c) {
		if (!Build.MANUFACTURER.toLowerCase(Locale.US).contains("nokia")) {
			//c.setTheme(R.style.AppTheme);
			//c.setTheme(R.style.AppTheme_Light);
			c.setTheme(R.style.AppTheme_Light_DarkActionBar);
		} else {
			//c.setTheme(R.style.AppTheme_Nokia);
			//c.setTheme(R.style.AppTheme_Nokia_Light);
			c.setTheme(R.style.AppTheme_Nokia_Light_DarkActionBar);
		}
	}
	
}
