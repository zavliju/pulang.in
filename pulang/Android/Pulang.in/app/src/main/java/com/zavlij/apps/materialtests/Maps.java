package com.zavlij.apps.materialtests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by zetjede on 04/12/15.
 */
public class Maps extends Activity implements View.OnClickListener{

    Button bNav, bAlter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView( R.layout.maps );
        bNav = (Button) findViewById(R.id.nav);
        bAlter = (Button) findViewById(R.id.alter);


        bNav.setOnClickListener(this);
        bAlter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.nav:
//                startActivity(new Intent(this, Main1.class));
//                break;

            case R.id.alter:
                startActivity(new Intent(this, MapsAlter.class));
                break;        }
    }
}
