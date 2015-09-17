package com.example.testproj;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class StartService{

	public static void startService(Context context){
		PendingIntent pendingIntent;
		Intent intent=new Intent(context,AlaramReceiver.class);
		pendingIntent=PendingIntent.getBroadcast(context, 0, intent, 0);
		AlarmManager manager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        int interval = 1000;
        manager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), interval, pendingIntent);
        
	}
	
}
