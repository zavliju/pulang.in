package com.zavlij.apps.materialtests;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by zetjede on 04/12/15.
 */

@SuppressWarnings("deprecation")
public class main2 extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        // create the TabHost that will contain the Tabs
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Tab");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected
        tab1.setIndicator("MAPS");
        tab1.setContent(new Intent(this,Maps.class));

        tab2.setIndicator("THREATS");
        tab2.setContent(new Intent(this,Threats.class));


        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
    }
}