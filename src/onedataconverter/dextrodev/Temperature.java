package onedataconverter.dextrodev;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Temperature extends Activity {
EditText select;
float c_int,f_int,k_int;
RadioButton r_btn;
RadioGroup r_grp;
TextView c,f,k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        select=(EditText)findViewById(R.id.editText1);
        r_grp=(RadioGroup)findViewById(R.id.radioGroup1);
        c=(TextView)findViewById(R.id.textView2);
        f=(TextView)findViewById(R.id.textView3);
        k=(TextView)findViewById(R.id.textView4);
        
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
        		  int a=0; r_btn=(RadioButton)findViewById(r_id);
       	        if(select.getText().length()>0)
       	        {
       	        	a=1;
       	        }
       	        else {
					a=0;
					 c.setText("0.00");
					 f.setText("0.00");
					 k.setText("0.00");
					  	}
       	        
if (a==1) {
	if (r_id == 2131230723) {
		C(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230724) {
		F(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230725) {
		K(Float.parseFloat(select.getText().toString()));
	}
	
	
}
        	  
        	   }
        	  });
        
    }


   void C(float c1)
   {
	   f_int=(float) ((c1*1.8)+32);
	   k_int=(float) (c1+273.15);
	  
	   
	   
	   c.setText(String.valueOf(c1)+" C");
	   f.setText(String.valueOf(f_int)+" F");
	   k.setText(String.valueOf(k_int)+" K");
	  	   
   }
   void F(float f1)
   {
	   c_int=(float) (((f1-32)*5/9));
	   k_int=(float) ((((f1-32)/1.8))+273.15);
	  
	   
	   
	   f.setText(String.valueOf(f1)+" F");
	   c.setText(String.valueOf(c_int)+" C");
	   k.setText(String.valueOf(k_int)+" K");
   }
   void K(float k1)
   {
	   c_int=(float) (k1-(273.15));
	   f_int=(float) (((k1-273.15)*1.8)+32);
	  
	   
	   
	   k.setText(String.valueOf(k1)+" K");
	   c.setText(String.valueOf(c_int)+" C");
	   f.setText(String.valueOf(f_int)+" F");
   }
}
