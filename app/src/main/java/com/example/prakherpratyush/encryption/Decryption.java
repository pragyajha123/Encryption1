package com.example.prakherpratyush.encryption;

import android.os.Bundle;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;

public class Decryption extends Encryption {


    EditText text1;
    Editable t1;
    String t;
    Button de;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decryption);

        text1 = (EditText) findViewById(R.id.tv);
        de = (Button) findViewById(R.id.de);

        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1 = text1.getText();
                t = String.valueOf(t1);
                byte[] data = Base64.decode(t, Base64.DEFAULT);
                try {
                    String t2 = new String(data, "UTF-8");
                    text1.setText(t2);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

