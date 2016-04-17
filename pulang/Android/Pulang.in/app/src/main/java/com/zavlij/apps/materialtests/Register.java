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
public class Register extends Activity implements View.OnClickListener{
    Button bRegist;
    EditText etUsername,etPhone,etPass,etRePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        etUsername = (EditText) findViewById(R.id.user);
        etPhone = (EditText) findViewById(R.id.telpon);
        etPass = (EditText) findViewById(R.id.pwd);
        etRePass = (EditText) findViewById(R.id.repwd);

        bRegist = (Button) findViewById(R.id.btnSignUp);
        bRegist.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSignUp:
                startActivity(new Intent(this, Main1.class));
                break;

        }
    }


}
