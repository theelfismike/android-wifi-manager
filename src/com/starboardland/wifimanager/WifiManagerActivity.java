package com.starboardland.wifimanager;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.ListView;

public class WifiManagerActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);

        ListView list = (ListView) findViewById(R.id.list);
        WifiListAdapter adapter = new WifiListAdapter(getApplicationContext());
        adapter.setConfigurationList(wifi.getConfiguredNetworks());
        list.setAdapter(adapter);
    }
}
