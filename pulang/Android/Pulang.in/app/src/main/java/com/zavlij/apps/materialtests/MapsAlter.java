package com.zavlij.apps.materialtests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by zetjede on 04/12/15.
 */
public class MapsAlter extends Activity implements View.OnClickListener{
    Button bNav2, bBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView( R.layout.mapsalter );
        bNav2 = (Button) findViewById(R.id.nav2);
        bBack = (Button) findViewById(R.id.btnBalik);


        bNav2.setOnClickListener(this);
        bBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.nav:
//                startActivity(new Intent(this, Main1.class));
//                break;

            case R.id.btnBalik:
                startActivity(new Intent(this, Maps.class));
                break;        }
    }
}
