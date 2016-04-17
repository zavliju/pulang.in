package com.zavlij.apps.materialtests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Zavli J on 8/29/2015.
 */
public class SplashScreen  extends Activity {

    private static int splashInterval = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(com.zavlij.apps.materialtests.R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, Login.class);
                startActivity(i);

                this.finish();
            }

            private void finish(){

            }
        }, splashInterval);
    }

}
