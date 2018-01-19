package com.rupaiedevteam.unidetailsfinder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Sarker Rabi on 18-01-18.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecyclerVHforRows> {

    List<University>  unilist;

    public RecycleViewAdapter(List<University> unilist) {
        this.unilist = unilist;
    }

    @Override
    public RecyclerVHforRows onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.uni_details_row,null);
        RecyclerVHforRows recyclerVHforRows = new RecyclerVHforRows(view);

        return recyclerVHforRows;
    }

    @Override
    public void onBindViewHolder(RecyclerVHforRows holder, int position) {
        holder.uniName.setText(unilist.get(position).getUniversity().get(0).getName());
        holder.uniAddress.setText(unilist.get(position).getUniversity().get(0).getAddress());

    }

    @Override
    public int getItemCount() {
        return unilist.size();
    }
}
