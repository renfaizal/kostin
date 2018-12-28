package com.example.renfa.kostin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_button= (Button)findViewById(R.id.btnLogin);
        login_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), beranda.class);
                        startActivity(myIntent);
                    }
                }
        );
    }

}
