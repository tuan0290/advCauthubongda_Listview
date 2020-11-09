package com.example.advcauthubongda_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FootballAdapter  extends BaseAdapter {

    Context context;
    int layout;
    List<football> list;

    public FootballAdapter(Context context, int layout, List<football> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=layoutInflater.inflate(R.layout.activity_football,null);
        ImageView imgplayer=convertView.findViewById(R.id.imgplayer);
        TextView txtvname =convertView.findViewById(R.id.txtvname);
        TextView txtvold=convertView.findViewById(R.id.txtvold);
        ImageView imgflag =convertView.findViewById(R.id.imgFlag);
        football Football =list.get(position);
        imgplayer.setImageResource(Football.getPlayer_photo());
        txtvname.setText(Football.getName());
        txtvold.setText("Tuổi "+Football.getOld());
        imgflag.setImageResource(Football.getFlag());
        return convertView;
    }
}
