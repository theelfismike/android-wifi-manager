package com.starboardland.wifimanager;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class WifiListAdapter extends BaseAdapter {

    private List<WifiConfiguration> configurationList;
    private Context context;

    public WifiListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return configurationList == null ? 0 : configurationList.size();
    }

    @Override
    public Object getItem(int position) {
        return configurationList == null ? null : configurationList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView row = (TextView) LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        row.setText(configurationList.get(position).SSID);
        return row;
    }

    public void setConfigurationList(List<WifiConfiguration> configurationList) {
        this.configurationList = configurationList;
    }
}
