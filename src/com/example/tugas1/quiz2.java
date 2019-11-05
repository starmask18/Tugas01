package com.example.tugas1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class quiz2 extends Activity{
	
	EditText enilaic;
	EditText enilaid;
	EditText enilaie;
	Button bhsl;
	TextView tquizb;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz2);
        enilaic = (EditText)findViewById(R.id.etnilaic);
        enilaid = (EditText)findViewById(R.id.etnilaid);
        enilaie = (EditText)findViewById(R.id.etnilaie);
        bhsl = (Button)findViewById(R.id.btnhsl);
        tquizb = (TextView)findViewById(R.id.tvquizb);
        
        bhsl.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int ac = Integer.parseInt(enilaic.getText().toString());
				int ad = Integer.parseInt(enilaid.getText().toString());
				int ae = Integer.parseInt(enilaie.getText().toString());
				if (ac > ad && ad > ae){
					tquizb.setText("angka "+ ac + " adalah angka paling besar dan angka "+ ae +" adalah angka paling kecil");
				}else if(ac> ae && ae > ad){
					tquizb.setText("angka "+ ac + " adalah angka paling besar dan angka "+ ad +" adalah angka paling kecil");
				}else if(ad> ac && ac > ae){
					tquizb.setText("angka "+ ad + " adalah angka paling besar dan angka "+ ae +" adalah angka paling kecil");
				}else if(ad> ae && ae > ac){
					tquizb.setText("angka "+ ad + " adalah angka paling besar dan angka "+ ac +" adalah angka paling kecil");
				}else if(ae> ac && ac > ad){
					tquizb.setText("angka "+ ae + " adalah angka paling besar dan angka "+ ad +" adalah angka paling kecil");
				}else if(ae> ad && ad > ac){
					tquizb.setText("angka "+ ae + " adalah angka paling besar dan angka "+ ac +" adalah angka paling kecil");
				}else{
					tquizb.setText("tidak diketahui");
				}
					
				}
		});
    }

}
