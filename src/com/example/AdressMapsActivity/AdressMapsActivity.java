package com.example.AdressMapsActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TabHost;

public class AdressMapsActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTabs();
    }

    void setTabs(){
        TabHost host = getTabHost();

        TabHost.TabSpec lbl1 = host.newTabSpec("label1");
        Intent in1 = new Intent(this, AddContato.class);
        lbl1.setIndicator("Contatos");
        lbl1.setContent(in1);
        
        TabHost.TabSpec lbl2 = host.newTabSpec("label2");
        Intent in2 = new Intent(this, GridList.class);
        lbl2.setIndicator("Lista Todos");
        lbl2.setContent(in2);

        host.addTab(lbl1);
        host.addTab(lbl2);
    }
}
