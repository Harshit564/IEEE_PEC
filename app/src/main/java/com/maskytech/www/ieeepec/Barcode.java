package com.maskytech.www.ieeepec;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Barcode extends AppCompatActivity {

    private Button scan;
    private ImageView qrcode;
    private TextView textb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barcodescn);
        scan = findViewById(R.id.scan);
        qrcode = findViewById(R.id.qrcode);
        textb=findViewById(R.id.textb);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator intentIntegrator = new IntentIntegrator(Barcode.this);
                intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                intentIntegrator.setCameraId(0);
                intentIntegrator.setOrientationLocked(false);
                intentIntegrator.setPrompt("Scanning");
                intentIntegrator.setBeepEnabled(true);
                intentIntegrator.setBarcodeImageEnabled(true);
                intentIntegrator.initiateScan();


            }
        });
    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            final IntentResult result=IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
            if (result!=null&&result.getContents()!=null){
                new AlertDialog.Builder(Barcode.this)
                        .setTitle("SCAN RESULTS")
                        .setMessage(result.getContents())
                        .setPositiveButton("Copy", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                ClipboardManager manager=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                                ClipData data=ClipData.newPlainText("result",result.getContents());
                                manager.setPrimaryClip(data);
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create().show();
            }


            super.onActivityResult(requestCode, resultCode, data);

        }
    }
