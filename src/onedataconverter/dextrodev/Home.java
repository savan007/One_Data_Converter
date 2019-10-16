package onedataconverter.dextrodev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		

        Thread timer=new Thread(){
        	public void run(){
        	try{
        		sleep(3000);
        	}catch(InterruptedException e){
        		e.printStackTrace();
        	}finally{
        		Intent i = new Intent(getApplicationContext(),DataConversion.class);
        		startActivity(i);
        		
        	}
        }
       };
       timer.start();

	}

	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		finish();
		super.onPause();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
