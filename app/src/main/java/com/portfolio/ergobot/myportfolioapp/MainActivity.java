package com.portfolio.ergobot.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openApplication(View view){
        String message = getString(R.string.toast_app_name, ((Button)view).getText().toString());
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}
