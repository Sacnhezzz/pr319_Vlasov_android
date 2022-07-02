package com.example.pr319_vlasov_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text1 = (EditText) findViewById(R.id.LoginBox);
        EditText text2 = (EditText) findViewById(R.id.PassBox);
        Button sgn = (Button) findViewById(R.id.sign);

        sgn.setOnClickListener(new View.OnClickListener() {
            @Override //проверка на заполненость полей
            public void onClick(View view) {
                if(text1.getText().toString().equals("") || text2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent j = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(j);
                }
            }

        });


    }
}