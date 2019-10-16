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

public class Length extends Activity {
EditText select;
float mm_int,cm_int,m_int,km_int,ft_int,in_int;
RadioButton r_btn;
RadioGroup r_grp;
TextView mm,cm,m,km,ft,in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        select=(EditText)findViewById(R.id.editText1);
        r_grp=(RadioGroup)findViewById(R.id.radioGroup1);
        mm=(TextView)findViewById(R.id.textView2);
        cm=(TextView)findViewById(R.id.textView3);
        m=(TextView)findViewById(R.id.textView4);
        km=(TextView)findViewById(R.id.textView5);
        ft=(TextView)findViewById(R.id.TextView07);
        in=(TextView)findViewById(R.id.TextView05);
        
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
					 mm.setText("0.00");
					   cm.setText("0.00");
					   m.setText("0.00");
					   km.setText("0.00");
					   ft.setText("0.00");
					   in.setText("0.00");
				}
       	        
if (a==1) {
	if (r_id == 2131230723) {
		Mm(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230724) {
		Cm(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230725) {
		M(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230726) {
		Km(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230727) {
		Ft(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230758) {
		In(Float.parseFloat(select.getText().toString()));
	}
}
        	  
        	   }
        	  });
        
    }


   void Mm(float mm1)
   {
	   cm_int=(float)(mm1*(0.1000));
	   m_int=(float) (mm1/(1000));
	   km_int=(float) (mm1/(1000000));
	   ft_int=(float) (mm1*(0.0032808));
	   in_int=(float) (mm1*(0.039370));
	
	   mm.setText(String.valueOf(mm1)+" Mm");
	   cm.setText(String.valueOf(cm_int)+" Cm");
	   m.setText(String.valueOf(m_int)+" M");
	   km.setText(String.valueOf(km_int)+" Km");
	   ft.setText(String.valueOf(ft_int)+" Ft");
	   in.setText(String.valueOf(in_int)+" Inch");
	   
   }
   void Cm(float cm1)
   {
	   mm_int=(float)(cm1*(10));
	   m_int=(float) (cm1/(100));
	   km_int=(float) (cm1/(100000));
	   ft_int=(float) (cm1*(0.032808));
	   in_int=(float) (cm1*(0.39370));
	   
	   cm.setText(String.valueOf(cm1)+" Cm");
	   mm.setText(String.valueOf(mm_int)+" Mm");
	   m.setText(String.valueOf(m_int)+" M");
	   km.setText(String.valueOf(km_int)+" Km");
	   ft.setText(String.valueOf(ft_int)+" Ft");
	   in.setText(String.valueOf(in_int)+" Inch");
   }
   void M(float m1)
   {
	   mm_int=(float)(m1*(1000));
	   cm_int=(float) (m1*(100));
	   km_int=(float) (m1/(1000));
	   ft_int=(float) (m1*(3.2808));
	   in_int=(float) (m1*(39.370));
	   
	   m.setText(String.valueOf(m1)+" M");
	   mm.setText(String.valueOf(mm_int)+" Mm");
	   cm.setText(String.valueOf(cm_int)+" Cm");
	   km.setText(String.valueOf(km_int)+" Km");
	   ft.setText(String.valueOf(ft_int)+" Ft");
	   in.setText(String.valueOf(in_int)+" Inch");
   }
   void Km(float km1)
   {
	   mm_int=(float)(km1*(1000000));
	   cm_int=(float) (km1*(100000));
	   m_int=(float) (km1*(1000));
	   ft_int=(float) (km1*(3280.8));
	   in_int=(float) (km1*(39370));
	   
	   km.setText(String.valueOf(km1)+" Km");
	   mm.setText(String.valueOf(mm_int)+" Mm");
	   cm.setText(String.valueOf(cm_int)+" Cm");
	   m.setText(String.valueOf(m_int)+" M");
	   ft.setText(String.valueOf(ft_int)+" Ft");
	   in.setText(String.valueOf(in_int)+" Inch");
	   
   }
   void Ft(float ft1)
   {
	   mm_int=(float)(ft1/(0.0032808));
	   cm_int=(float) (ft1/(0.032808));
	   m_int=(float) (ft1*(3.2808));
	   km_int=(float) (ft1/(3280.8));
	   in_int=(float) (ft1*(12));
	   
	   ft.setText(String.valueOf(ft1)+" Ft");
	   mm.setText(String.valueOf(mm_int)+" Mm");
	   cm.setText(String.valueOf(cm_int)+" Cm");
	   m.setText(String.valueOf(m_int)+" M");
	   km.setText(String.valueOf(km_int)+" Km"); 
	   in.setText(String.valueOf(in_int)+" Inch");
	   
   }
   void In(float in1)
   {
	   mm_int=(float)(in1/(0.039370));
	   cm_int=(float) (in1/(0.39370));
	   m_int=(float) (in1/(39.370));
	   km_int=(float) (in1*(39370));
	   ft_int=(float) (in1/(12));
	   
	   in.setText(String.valueOf(in1)+" Inch");
	   mm.setText(String.valueOf(mm_int)+" Mm");
	   cm.setText(String.valueOf(cm_int)+" Cm");
	   m.setText(String.valueOf(m_int)+" M");
	   ft.setText(String.valueOf(ft_int)+" Ft");
	   km.setText(String.valueOf(km_int)+" Km");
	   
   }
}
