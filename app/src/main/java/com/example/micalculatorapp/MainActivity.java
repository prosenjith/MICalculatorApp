package com.example.micalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnmulti,btnadd,btndiv,btnmod,btnsub,btnac,btnc,btndot,btnequal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);

        btn0=findViewById(R.id.b0id);
        btn1=findViewById(R.id.b1id);
        btn1=findViewById(R.id.b2id);
        btn3=findViewById(R.id.b3id);
        btn4=findViewById(R.id.b4id);
        btn5=findViewById(R.id.b5id);
        btn6=findViewById(R.id.b6id);
        btn7=findViewById(R.id.b7id);
        btn8=findViewById(R.id.b8id);
        btn9=findViewById(R.id.b9id);
        btnac=findViewById(R.id.ac_id);
        btnc=findViewById(R.id.c_id);
        btnmod=findViewById(R.id.moduleid);
        btndiv=findViewById(R.id.divisionid);
        btnadd=findViewById(R.id.addid);
        btnsub=findViewById(R.id.subid);
        btnmulti=findViewById(R.id.mid);
        btnequal=findViewById(R.id.equalid);
        btndot=findViewById(R.id.dotid);
        btn0.setOnClickListener(new ButtonClick());
    }
    class ButtonClick implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.b0id:
                    Toast.makeText(getApplicationContext(),"0 is clicked.",Toast.LENGTH_LONG).show();

            }
        }
    }
}
