package onedataconverter.dextrodev;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Electric extends Activity {
EditText select;
float a_int,ma_int,na_int,gi_int;

RadioButton r_btn;
RadioGroup r_grp;
TextView a,ma,na,gi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric);
        select=(EditText)findViewById(R.id.editText1);
        r_grp=(RadioGroup)findViewById(R.id.radioGroup1);
        a=(TextView)findViewById(R.id.textView2);
        ma=(TextView)findViewById(R.id.textView3);
        na=(TextView)findViewById(R.id.textView4);
        gi=(TextView)findViewById(R.id.textView5);
        
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

        	//	  Toast.makeText(getApplicationContext(), String.valueOf(r_id),	Toast.LENGTH_SHORT).show();
        		  int b=0; r_btn=(RadioButton)findViewById(r_id);
       	        if(select.getText().length()>0)
       	        {
       	        	b=1;
       	        }
       	        else {
					b=0;
					 a.setText("0.00");
					   ma.setText("0.00");
					   na.setText("0.00");
					   gi.setText("0.00");
					   }
       	        
if (b==1) {
	if (r_id == 2131230723) {
		A(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230724) {
		Ma(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230725) {
		Na(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230726) {
		Gi(Float.parseFloat(select.getText().toString()));
	}
}
        	  
        	   }
        	  });
        
    }


   void A(float a1)
   {
	   ma_int=(float)(a1/(0.001));
	   na_int=(float) (a1*(1000000000));
	   gi_int=(float) (a1*(1.256637062));
	   
	   
	   a.setText(String.valueOf(a1)+" A");
	   ma.setText(String.valueOf(ma_int)+" mA");
	   na.setText(String.valueOf(na_int)+" nA");
	   gi.setText(String.valueOf(gi_int)+" GI");
	   
   }
   void Ma(float ma1)
   {
	   a_int=(float)(ma1/(1000));
	   na_int=(float) (ma1*(1000000));
	   gi_int=(float) (ma1*(0.012566370));
	   
	   
	   ma.setText(String.valueOf(ma1)+" mA");
	   a.setText(String.valueOf(a_int)+" A");
	   na.setText(String.valueOf(na_int)+" nA");
	   gi.setText(String.valueOf(gi_int)+" GI");
	   
   }
   
   void Na(float na1)
   {
	   ma_int=(float)(na1/(1000000));
	   a_int=(float) (na1/(1000000000));
	   gi_int=(float) (na1*(1.2566705/1000000000));
	   
	   
	   na.setText(String.valueOf(na1)+" nA");
	   ma.setText(String.valueOf(ma_int)+" mA");
	   a.setText(String.valueOf(a_int)+" A");
	   gi.setText(String.valueOf(gi_int)+" GI");
	   
   }
   
   void Gi(float gi1)
   {
	   ma_int=(float)(gi1*(795.774719));
	   na_int=(float) (gi1*(795774719.9973469));
	   a_int=(float) (gi1*(0.795774715));
	   
	   
	   gi.setText(String.valueOf(gi1)+" GI");
	   ma.setText(String.valueOf(ma_int)+" mA");
	   a.setText(String.valueOf(a_int)+" A");
	   na.setText(String.valueOf(na_int)+" nA");
	   
   }
}
