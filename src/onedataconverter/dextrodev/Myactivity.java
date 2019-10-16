package onedataconverter.dextrodev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Myactivity extends Activity {
Button mass,length,volume,bits,temperature,speed,current,about,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myactivity);
        mass=(Button)findViewById(R.id.Button09);
        length=(Button)findViewById(R.id.Button08);
        volume=(Button)findViewById(R.id.Button07);
        bits=(Button)findViewById(R.id.Button06);
        temperature=(Button)findViewById(R.id.Button05);
        speed=(Button)findViewById(R.id.Button04);
        current=(Button)findViewById(R.id.Button03);
        about=(Button)findViewById(R.id.Button02);
        exit=(Button)findViewById(R.id.Button01);
        
        mass.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Electric.class);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
