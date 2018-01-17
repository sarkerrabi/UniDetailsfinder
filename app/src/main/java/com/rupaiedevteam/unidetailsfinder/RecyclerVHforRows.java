package com.rupaiedevteam.unidetailsfinder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Sarker Rabi on 17-01-18.
 */

public class RecyclerVHforRows extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView uniName,uniAddress;
    public RecyclerVHforRows(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        uniName = (TextView)itemView.findViewById(R.id.uniname);
        uniAddress = (TextView)itemView.findViewById(R.id.uniaddress);


    }

    @Override
    public void onClick(View v) {

    }
}
