
package onedataconverter.dextrodev;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class Bits extends Activity {
EditText select;
float bit_int,byt_int,mb_int,gb_int,tb_int;
RadioButton r_btn;
RadioGroup r_grp;
TextView bit,byt,mb,gb,tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bits);
        select=(EditText)findViewById(R.id.editText1);
        r_grp=(RadioGroup)findViewById(R.id.radioGroup1);
        bit=(TextView)findViewById(R.id.textView2);
        byt=(TextView)findViewById(R.id.textView3);
        mb=(TextView)findViewById(R.id.textView4);
        gb=(TextView)findViewById(R.id.textView5);
        tb=(TextView)findViewById(R.id.TextView07);
        
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
					 bit.setText("0.00");
					 byt.setText("0.00");
					 mb.setText("0.00");
					 gb.setText("0.00");
					 tb.setText("0.00");
					  	}
       	        
if (a==1) {
	if (r_id == 2131230723) {
		Bit(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230724) {
		Byt(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230725) {
		Mb(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230726) {
		Gb(Float.parseFloat(select.getText().toString()));
	}
	if (r_id == 2131230727) {
		Tb(Float.parseFloat(select.getText().toString()));
	}
	
}
        	  
        	   }
        	  });
        
    }


   void Bit(float bit1)
   {
	   byt_int=(float) (bit1/(8));
	   mb_int=(float) (bit1/(8000000));
	   gb_int=(float) (bit1/(8*(1000000000L)));
	   tb_int=(float) (bit1/(8*(1000000000000L)));
	   
	   
	   bit.setText(String.valueOf(bit1) +" Bit");
	   byt.setText(String.valueOf(byt_int)+" Byte");
	   mb.setText(String.valueOf(mb_int)+" Mb");
	   gb.setText(String.valueOf(gb_int)+" Gb");
	   tb.setText(String.valueOf(tb_int)+" Tb");	   
   }
   void Byt(float byt1)
   {
	   bit_int=(float) (byt1*(8));
	   mb_int=(float) (byt1/(1000000));
	   gb_int=(float) (byt1/(1000000L));
	   tb_int=(float) (byt1/(1000000000L));
	   
	   
	   byt.setText(String.valueOf(byt1)+" Byte");
	   bit.setText(String.valueOf(bit_int)+" Bit");
	   mb.setText(String.valueOf(mb_int)+" Mb");
	   gb.setText(String.valueOf(gb_int)+" Gb");
	   tb.setText(String.valueOf(tb_int)+" Tb");	   
   }
   void Mb(float mb1)
   {
	   bit_int=(float) (mb1*(8*(1000000)));
	   byt_int=(float) (mb1*(1000000L));
	   gb_int=(float) (mb1/(1000));
	   tb_int=(float) (mb1/(1000000L));
	   
	   
	   mb.setText(String.valueOf(mb1)+" Mb");
	   bit.setText(String.valueOf(bit_int)+" Bit");
	   byt.setText(String.valueOf(byt_int)+" Byte");
	   gb.setText(String.valueOf(gb_int)+" Gb");
	   tb.setText(String.valueOf(tb_int)+" Tb");	   
   }
   
   void Gb(float gb1)
   {
	   bit_int=(float) (gb1*(8*(1000000L)));
	   byt_int=(float) (gb1*(1000000L));
	   mb_int=(float) (gb1*(1000));
	   tb_int=(float) (gb1/(1000));
	   
	   
	   gb.setText(String.valueOf(gb1)+" Gb");
	   bit.setText(String.valueOf(bit_int)+" Bit");
	   byt.setText(String.valueOf(byt_int)+" Byte");
	   mb.setText(String.valueOf(mb_int)+" Mb");
	   tb.setText(String.valueOf(tb_int)+" Tb");	   
   }
   void Tb(float tb1)
   {
	   bit_int=(float) (tb1*(8*(1000000000L)));
	   byt_int=(float) (tb1*(1000000000L));
	   mb_int=(float) (tb1*(1000000L));
	   gb_int=(float) (tb1*(1000));
	   
	   
	   tb.setText(String.valueOf(tb1)+" Tb");
	   bit.setText(String.valueOf(bit_int)+" Bit");
	   byt.setText(String.valueOf(byt_int)+" Byte");
	   mb.setText(String.valueOf(mb_int)+" Mb");
	   gb.setText(String.valueOf(gb_int)+" Gb");	   
   }
}
