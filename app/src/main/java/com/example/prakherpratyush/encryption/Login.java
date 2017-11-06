package com.example.prakherpratyush.encryption;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {


    Button login;
    EditText user;
    EditText pass;
    String u = "root";
    String p = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        login = (Button)findViewById(R.id.login);
        user = (EditText)findViewById(R.id.user);
        pass = (EditText)findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(user.getText().toString().equals(u)&&pass.getText().toString().equals(p)) {
                startActivity(new Intent(Login.this, Index.class));

            }
            }
        });
    }
}
