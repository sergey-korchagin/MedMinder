//where buy(a_s4)
package com.example.medminder;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Screen4 extends Activity
{
	 @Override
	    protected void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.a_s4);
	    }
	 
	 
	 //SuperPharm
	 public void ClickListenerSP(View v)
		{
		//	switch (v.getId()) 
			//{
			  //  case R.id.imageButton1:
			        
			        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.super-pharm.co.il/")));
			        //break;
		   // }
			
		}
	 
	 //New Pharm
	 public void ClickListenerNP(View v)
		{
			
		startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.new-pharm.co.il/")));
			
		}
	 //Maccabi
	 public void ClickListenerMa(View v)
		{
			     
	        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.maccabi4u.co.il/")));
			
		}
	 //Med link
	 public void ClickListenerMl(View v)
		{
			     
	        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://medi-link.co.il/")));
			
		}
}

