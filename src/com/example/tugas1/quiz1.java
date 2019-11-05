package com.example.tugas1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class quiz1 extends Activity{
	EditText enilaia;
	EditText enilaib;
	Button bhasil;
	TextView tquiza;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz1);
        enilaia = (EditText)findViewById(R.id.etnilaia);
        enilaib = (EditText)findViewById(R.id.etnilaib);
        bhasil = (Button)findViewById(R.id.btnhasil);
        tquiza = (TextView)findViewById(R.id.tvquiza);
        
        bhasil.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int angkaa = Integer.parseInt(enilaia.getText().toString());
				int angkab = Integer.parseInt(enilaib.getText().toString());
				if(angkaa > angkab){
					tquiza.setText("angka "+ angkaa +" lebih besar dari angka "+ angkab);
				}else if(angkaa == angkab){
					tquiza.setText("angka "+ angkaa +" sama dengan angka "+ angkab);
				}else{
					tquiza.setText("angka "+ angkaa +" lebih kecil dari angka "+ angkab);;
				}
			}
		});
    }

}
