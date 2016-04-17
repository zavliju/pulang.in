package com.zavlij.apps.materialtests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Zavli J on 8/26/2015.
 */
public class Login extends Activity implements View.OnClickListener {
    Button bLogin, bDaftar, bLupa;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        etUsername = (EditText) findViewById(R.id.user);
        etPassword = (EditText) findViewById(R.id.pwd);
        bLogin = (Button) findViewById(R.id.btnSignIn);
        bDaftar = (Button) findViewById(R.id.btnSignUp);
        bLupa = (Button) findViewById(R.id.btnLupa);

        bLogin.setOnClickListener(this);
        bDaftar.setOnClickListener(this);
        bLupa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSignIn:
                startActivity(new Intent(this, Main1.class));
                break;

            case R.id.btnSignUp:
                startActivity(new Intent(this, Register.class));
                break;
            case R.id.btnLupa:
                startActivity(new Intent(this, lupa.class));
        }
    }

}