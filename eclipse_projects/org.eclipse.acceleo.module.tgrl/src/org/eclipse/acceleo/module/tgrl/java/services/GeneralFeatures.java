package org.eclipse.acceleo.module.tgrl.java.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class GeneralFeatures {
	public String getCurrentDate() {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("MM DD, YYY HH:mm:ss");// February 16, 2015 6:08:01 PM EST		
		return df.format(date);
	}
}
