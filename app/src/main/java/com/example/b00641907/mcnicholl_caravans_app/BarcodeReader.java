package com.example.b00641907.mcnicholl_caravans_app;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BarcodeReader extends AppCompatActivity{

    public static TextView resultTExtView;
    Button scan_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_reader);

        resultTExtView = (TextView)findViewById(R.id.result_text);
        scan_btn = (Button) findViewById(R.id.btn_scan);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),ScannerActivity.class));
            }
        });
    }
}
