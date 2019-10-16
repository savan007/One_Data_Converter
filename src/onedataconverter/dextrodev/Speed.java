package onedataconverter.dextrodev;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Speed extends Activity {
EditText select;
float mis_int,fs_int,ms_int,kms_int;
RadioButton r_btn;
RadioGroup r_grp;
TextView mis,fs,ms,kms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        select=(EditText)findViewById(R.id.editText1);
        r_grp=(RadioGroup)findViewById(R.id.radioGroup1);
        mis=(TextView)findViewById(R.id.textView2);
        fs=(TextView)findViewById(R.id.textView3);
        ms=(TextView)findViewById(R.id.textView4);
        kms=(TextView)findViewById(R.id.textView5);
        
        select.addTextChangedListener(new TextWatcher() {

        	   @Override
        	   public void afterTextChanged(Editable s) {}

        	   @Override    
        	   public void beforeTextChanged(CharSequence s, int start,
        	     int count, int after) {
        	   }

        	   @Override    
        	   public void onTextChanged(CharSequence s, int start,
        	     int before, int count) {
        		   /*
        	  Kg(Float.parseFloat(kg.getText().toString()));*/
        		   int r_id=r_grp.getCheckedRadioButtonId();    

	//  Toast.makeText(getApplicationContext(), String.valueOf(r_id),	Toast.LENGTH_SHORT).show();
        		  int a=0; r_btn=(RadioButton)findViewById(r_id);
       	        if(select.getText().length()>0)
       	        {
       	        	a=1;
       	        }
       	        else {
					a=0;
					 mis.setText("0.00");
					 fs.setText("0.00");
					 ms.setText("0.00");
					 kms.setText("0.00");
       	        		}
       	        
if (a==1) {
	if (r_id == 2131230723) {
		Mis(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230724) {
		Fs(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230725) {
		Ms(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230726) {
		Kms(Float.parseFloat(select.getText().toString()));
	}
	
}
        	  
        	   }
        	  });
        
    }


   void Mis(float mis1)
   {
	   fs_int=(float)(mis1*(5280));
	   ms_int=(float) (mis1*(1609.34));
	   kms_int=(float) (mis1*(5793.64));
	  
	   
	   mis.setText(String.valueOf(mis1)+" Mi/s");
	   fs.setText(String.valueOf(fs_int)+" Ft/s");
	   ms.setText(String.valueOf(ms_int)+" M/s");
	   kms.setText(String.valueOf(kms_int)+" Km/h");
	   
   }
   void Fs(float fs1)
   {
	   mis_int=(float)(fs1*(0.0001893939));
	   ms_int=(float) (fs1*(0.3048));
	   kms_int=(float) (fs1*(1.09728));
	  
	   
	   fs.setText(String.valueOf(fs1)+" Ft/s");
	   mis.setText(String.valueOf(mis_int)+" Mi/s");
	   ms.setText(String.valueOf(ms_int)+" M/s");
	   kms.setText(String.valueOf(kms_int)+" Ki/h");
	   
   }
   void Ms(float ms1)
   {
	   mis_int=(float)(ms1/(1609.34));
	   fs_int=(float) (ms1*(3.28084));
	   kms_int=(float) (ms1*(3.6));
	  
	   
	   ms.setText(String.valueOf(ms1)+" M/s");
	   mis.setText(String.valueOf(mis_int)+" Mi/s");
	   fs.setText(String.valueOf(fs_int)+" Ft/s");
	   kms.setText(String.valueOf(kms_int)+" Km/h");
	   
   }
   void Kms(float kms1)
   {
	   mis_int=(float)(kms1*(0.000172603));
	   fs_int=(float) (kms1/(1.09728));
	   ms_int=(float) (kms1*(0.277778));
	  
	   
	   kms.setText(String.valueOf(kms1)+" Km/h");
	   mis.setText(String.valueOf(mis_int)+" Mi/s");
	   fs.setText(String.valueOf(fs_int)+" Ft/s");
	   ms.setText(String.valueOf(ms_int)+" M/s");
	   
   }}
