package com.example.testproj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AutoBoot extends BroadcastReceiver {   

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Hello Tracker Starting....", Toast.LENGTH_LONG).show();
		StartService.startService(context);		
	}
}