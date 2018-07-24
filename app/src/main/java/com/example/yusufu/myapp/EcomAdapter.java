package com.example.yusufu.myapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class EcomAdapter extends RecyclerView.Adapter<EcomAdapter.EcomViewHolder> {
    List<NewOrder> newOrderList;
    Context context;
    OrderListActivityItemClicklistener listActivityItemClicklistener;

    public EcomAdapter(Context context, OrderListActivityItemClicklistener Listener) {
        this.context = context;
        this.listActivityItemClicklistener = Listener;
    }

    public interface OrderListActivityItemClicklistener{
        void onItemClick(int itemId);
    }
    public class EcomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView itname;
        TextView ititem;
        TextView itquantity;
        TextView itmode;
        TextView itdate;
        TextView itlocation;
        TextView itcontact;
        TextView itemail;
        TextView itcomment;

        public EcomViewHolder(View itemView){
            super(itemView);
           itname = itemView.findViewById(R.id.etcustomer);
           ititem = itemView.findViewById(R.id.itpen);
           itquantity = itemView.findViewById(R.id.itQuantity);
           itmode = itemView.findViewById(R.id.modevalue);
           itlocation = itemView.findViewById(R.id.itlocation);
           itcontact = itemView.findViewById(R.id.contactvalue);
           itemail = itemView.findViewById(R.id.emailvalue);
           itcomment = itemView.findViewById(R.id.itcomment);
           itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int itemid = newOrderList.get(getAdapterPosition()).getId();
            listActivityItemClicklistener.onItemClick(itemid);
        }
    }

    @Override
    public EcomAdapter.EcomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_add_new,parent,false);

        return new EcomViewHolder(view);

    }



    @Override
    public void onBindViewHolder(@NonNull EcomAdapter.EcomViewHolder holder, int position) {
        NewOrder newOrder = newOrderList.get(position);
        holder.itname.setText(newOrder.getName());
        holder.ititem.setText(newOrder.getItem());
        holder.itquantity.setText(newOrder.getQuantity());
        holder.itdate.setText(newOrder.getDate());
        holder.itcomment.setText(newOrder.getComment());
        holder.itemail.setText(newOrder.getEmail());
        holder.itlocation.setText(newOrder.getLocation());
        holder.itcontact.setText(newOrder.getContact());
        holder.itmode.setText(newOrder.getAmount());
    }

    @Override
    public int getItemCount() {
        if (newOrderList == null) {
            return 0;
        }
        return newOrderList.size();
    }
}
