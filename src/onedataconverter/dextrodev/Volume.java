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

public class Volume extends Activity {
EditText select;
float l_int,ml_int,m3_int,in3_int,gal_int;
RadioButton r_btn;
RadioGroup r_grp;
TextView l,ml,m3,in3,gal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        select=(EditText)findViewById(R.id.editText1);
        r_grp=(RadioGroup)findViewById(R.id.radioGroup1);
        l=(TextView)findViewById(R.id.textView2);
        ml=(TextView)findViewById(R.id.textView3);
        m3=(TextView)findViewById(R.id.textView4);
        in3=(TextView)findViewById(R.id.textView5);
        gal=(TextView)findViewById(R.id.TextView07);
        
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

     // 	  Toast.makeText(getApplicationContext(), String.valueOf(r_id),	Toast.LENGTH_SHORT).show();
        		  int a=0; r_btn=(RadioButton)findViewById(r_id);
       	        if(select.getText().length()>0)
       	        {
       	        	a=1;
       	        }
       	        else {
					a=0;
					 l.setText("0.00");
					 ml.setText("0.00");
					 m3.setText("0.00");
					 in3.setText("0.00");
					 gal.setText("0.00");
					  	}
       	        
if (a==1) {
	if (r_id == 2131230723) {
		L(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230724) {
		Ml(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230725) {
		M3(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230726) {
		In3(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230727) {
		Gal(Float.parseFloat(select.getText().toString()));
	}
	
}
        	  
        	   }
        	  });
        
    }


   void L(float l1)
   {
	   ml_int=(float) (l1/(0.001));
	   m3_int=(float) (l1/(1000));
	   in3_int=(float) (l1*(61.024));
	   gal_int=(float) (l1*(0.21997));
	   
	   
	   l.setText(String.valueOf(l1)+" L");
	   ml.setText(String.valueOf(ml_int)+" mL");
	   m3.setText(String.valueOf(m3_int)+" M^3");
	   in3.setText(String.valueOf(in3_int)+" Inch^3");
	   gal.setText(String.valueOf(gal_int)+" GA");	   
   }
   void Ml(float ml1)
   {
	   l_int=(float) (ml1/(1000));
	   m3_int=(float) (ml1/(1000000));
	   in3_int=(float) (ml1*(0.061024));
	   gal_int=(float) (ml1*(4546.091879));
	   
	   
	   ml.setText(String.valueOf(ml1)+" mL");
	   l.setText(String.valueOf(l_int)+" L");
	   m3.setText(String.valueOf(m3_int)+" M^3");
	   in3.setText(String.valueOf(in3_int)+" Inch^3");
	   gal.setText(String.valueOf(gal_int)+" GA");
   }
   void In3(float in31)
   {
	   ml_int=(float) (in31/(0.061024));
	   m3_int=(float) (in31/(61024));
	   l_int=(float) (in31/(61.024));
	   gal_int=(float) (in31*(0.0036047));
	 
	   
	   in3.setText(String.valueOf(in31)+" Inch^3");
	   ml.setText(String.valueOf(ml_int)+" mL");
	   m3.setText(String.valueOf(m3_int)+" M^3");
	   l.setText(String.valueOf(l_int)+" L");
	   gal.setText(String.valueOf(gal_int)+" GA");   
   }
   
   void Gal(float gal1)
   {
	   ml_int=(float) (gal1/(0.00021997));
	   m3_int=(float) (gal1/(219.97));
	   l_int=(float) (gal1/(0.21997));
	   in3_int=(float) (gal1*(277.419547));
	 
	   
	   gal.setText(String.valueOf(gal1)+" GA");
	   ml.setText(String.valueOf(ml_int)+" mL");
	   m3.setText(String.valueOf(m3_int)+" M^3");
	   l.setText(String.valueOf(l_int)+" L");
	   in3.setText(String.valueOf(in3_int)+" Inch^3");   
   }
   void M3(float m31)
   {
	   ml_int=(float) (m31*(1000000));
	   gal_int=(float) (m31*(219.97));
	   l_int=(float) (m31/(0.001));
	   in3_int=(float) (m31*(61029));
	 
	   
	   m3.setText(String.valueOf(m31)+" M^3");
	   ml.setText(String.valueOf(ml_int)+" mL");
	   gal.setText(String.valueOf(gal_int)+" GA");
	   l.setText(String.valueOf(l_int)+" L");
	   in3.setText(String.valueOf(in3_int)+" Inch^3");   
   }
}
