package com.example.hamh96.holandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editPesos;
    private EditText editDolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPesos = (EditText) findViewById(R.id.editPesos);
        editDolares = (EditText) findViewById(R.id.editDolares);
    }
    public void convert(View view){
        String textPesos=editPesos.getText().toString();;
        String textDolares=editDolares.getText().toString();;
        double pesos;
        double dolares;
        double result;
        if(!(textPesos.equals(""))&&textDolares.equals("")){
            pesos=Double.parseDouble(textPesos);
            result= pesos/3000;
            editDolares.setText(Double.toString(result));
        }

        else if(textPesos.equals("")&&!(textDolares.equals(""))){
            dolares=Double.parseDouble(textDolares);
            result= dolares*3000;
            editPesos.setText(Double.toString(result));
        }
        else if(textPesos.equals("")&&textDolares.equals("")){
            Toast.makeText(getApplicationContext(),"Debe ingresar un valor a convertir",Toast.LENGTH_SHORT).show();
        }
        else if(!(textPesos.equals(""))&&!(textDolares.equals(""))){
            Toast.makeText(getApplicationContext(),"Debe dejar solamente un valor a convertir",Toast.LENGTH_SHORT).show();
        }
    }

    public void clear(View view){
        editPesos.setText("");
        editDolares.setText("");
    }
}
