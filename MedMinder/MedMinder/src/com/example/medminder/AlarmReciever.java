package com.example.medminder;

import java.util.Timer;
import java.util.TimerTask;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.widget.PopupWindow;
import android.widget.Toast;

public class AlarmReciever extends BroadcastReceiver {
	Ringtone r;
	
	int delay = 5000;
    @Override
    public void onReceive(final Context k1, Intent k2) {
        // TODO Auto-generated method stub
         Toast.makeText(k1, "Don't forget to take your Medicine", Toast.LENGTH_LONG).show();
         
         
         
         Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
         r = RingtoneManager.getRingtone(k1, notification);
         r.play();
         
        
		
     
    
    Timer timer = new Timer();

    timer.schedule( new TimerTask(){
       public void run() { 
           r.stop();
        }
     }, delay);

    }
		
    

}
