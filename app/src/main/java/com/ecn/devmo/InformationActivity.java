package com.ecn.devmo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private EditText infoAddress;
    private Spinner devTime;
    private Spinner infoPay;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imformation);

        infoAddress = findViewById(R.id.info_address);
        devTime = findViewById(R.id.dev_time);
        infoPay = findViewById(R.id.info_pay);
        btnSave = findViewById(R.id.saveInfo);
    }

    public void saveInfo(View view){
        String address = infoAddress.getText().toString();
        String pay = infoPay.getTransitionName().toString();
        String time = devTime.getTransitionName().toString();


    }

}