package onedataconverter.dextrodev;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataConversion extends Activity {
Button mass,length,volume,bits,temperature,speed,current,about,exit,share,rate,set;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myactivity);
        mass=(Button)findViewById(R.id.Button03);
        length=(Button)findViewById(R.id.Button02);
        volume=(Button)findViewById(R.id.Button01);
        bits=(Button)findViewById(R.id.Button04);
        temperature=(Button)findViewById(R.id.Button05);
        share=(Button)findViewById(R.id.Button10);
        rate=(Button)findViewById(R.id.button1);
        speed=(Button)findViewById(R.id.Button06);
        current=(Button)findViewById(R.id.Button07);
        about=(Button)findViewById(R.id.Button08);
        exit=(Button)findViewById(R.id.Button09);
        set=(Button)findViewById(R.id.action_settings);
        
     /*   set.setOnClickListener(new View.OnClickListener() {
			
			@Override
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
        
       */ 
        
        rate.setOnClickListener(new View.OnClickListener() {
        	
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		 Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=onedataconverter.dextrodev"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        	}
        });
       
        share.setOnClickListener(new View.OnClickListener() {
    		
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    		//	Toast.makeText(getApplicationContext(), "Please wait", Toast.LENGTH_LONG).show();
    			Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND); 
    		    sharingIntent.setType("text/plain");
    		    String shareBody = "One Dataconverter";
    		    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Check out 'Data Conversion' - https://play.google.com/store/apps/details?id=onedataconverter.dextrodev");
    		    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
    		startActivity(Intent.createChooser(sharingIntent, "Share via"));	
    		}
    	});
        mass.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Mass.class);
				startActivity(i);
			}
		});
        
        length.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(getApplicationContext(),Length.class);
			startActivity(i);
			}
		});
      
        volume.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Volume.class);
				startActivity(i);
				
			}
		});
        
        bits.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Bits.class);
				startActivity(i);
			}
		});
        
        
        temperature.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Temperature.class);
				startActivity(i);
			}
		});
        
        speed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent(getApplicationContext(),Speed.class);
			startActivity(i);
			}
		});
        
        current.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Electric.class);
				startActivity(i);
				
			}
		});
        
        about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),About.class);
				startActivity(i);
				
			}
		});
        
        exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
    }


   
    
}
