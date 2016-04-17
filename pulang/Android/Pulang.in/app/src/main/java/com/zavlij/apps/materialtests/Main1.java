package com.zavlij.apps.materialtests;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * Created by zetjede on 04/12/15.
 */
public class Main1 extends Activity implements View.OnClickListener {
    Button btnGo;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGo:
                startActivity(new Intent(this, main2.class));
                break;

        }
    }
}