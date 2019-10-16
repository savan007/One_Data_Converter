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

public class Mass extends Activity {
EditText select;
float kg_int,gm_int,lb_int,mg_int;
RadioButton r_btn;
RadioGroup r_grp;
TextView kg,gm,mg,lb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        select=(EditText)findViewById(R.id.editText1);
        r_grp=(RadioGroup)findViewById(R.id.radioGroup1);
        kg=(TextView)findViewById(R.id.textView2);
        gm=(TextView)findViewById(R.id.textView3);
        lb=(TextView)findViewById(R.id.textView4);
        mg=(TextView)findViewById(R.id.textView5);
        
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

       	  Toast.makeText(getApplicationContext(), String.valueOf(r_id),	Toast.LENGTH_SHORT).show();
        		  int a=0; r_btn=(RadioButton)findViewById(r_id);
       	        if(select.getText().length()>0)
       	        {
       	        	a=1;
       	        }
       	        else {
					a=0;
					 gm.setText("0.00");
					   kg.setText("0.00");
					   lb.setText("0.00");
					   mg.setText("0.00");
				}
       	        
if (a==1) {
	if (r_id == 2131230723) {
		Kg(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230724) {
		Gm(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230725) {
		Lb(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230726) {
		Mg(Float.parseFloat(select.getText().toString()));
	}
}
        	  
        	   }
        	  });
        
    }


   void Kg(float kg1)
   {
	   gm_int=(float) (kg1*1000);
	   lb_int=(float) (kg1*2.20462);
	   mg_int=(float) (kg1*(1000000));
	  
	   kg.setText(String.valueOf(kg1)+" Kg");
	   gm.setText(String.valueOf(gm_int)+" Gm");
	   lb.setText(String.valueOf(lb_int)+" Lb");
	   mg.setText(String.valueOf(mg_int)+" Mg");
	   
   }
   void Gm(float gm1)
   {
	   kg_int=(float)gm1/1000;
	   lb_int=(float) (gm1*0.00220462);
	   mg_int=(float) (gm1/(0.001));
	   
	   gm.setText(String.valueOf(gm1)+" Gm");
	   kg.setText(String.valueOf(kg_int)+" Kg");
	   lb.setText(String.valueOf(lb_int)+" Lb");
	   mg.setText(String.valueOf(mg_int)+" Mg");
	   
   }
   void Lb(float lb1)
   {
	   gm_int=(float)(lb1/0.0022046);
	   kg_int=(float) (lb1/2.20462);
	   mg_int=(float) (lb1/(453592.37));
	   
	   lb.setText(String.valueOf(lb1)+" Lb");
	   gm.setText(String.valueOf(gm_int)+" Gm");
	   kg.setText(String.valueOf(kg_int)+" Kg");
	   mg.setText(String.valueOf(mg_int)+" Mg");
	   
   }
   void Mg(float mg1)
   {
	   gm_int=(float)(mg1/1000);
	   lb_int=(float) (mg1/453592.3);
	   kg_int=(float) (mg1/(1000000));
	   
	   mg.setText(String.valueOf(mg1)+" Mg");
	   gm.setText(String.valueOf(gm_int)+" Gm");
	   lb.setText(String.valueOf(lb_int)+" Lb");
	   kg.setText(String.valueOf(kg_int)+" Kg");
	   
   }
    
}
