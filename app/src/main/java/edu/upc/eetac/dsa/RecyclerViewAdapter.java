package edu.upc.eetac.dsa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.upc.eetac.dsa.models.*;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder>{

    private ArrayList<Item> itemList;

    public RecyclerViewAdapter (ArrayList<Item> itemList){
        this.itemList=itemList;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        private TextView nameText;

        public myViewHolder (final View view)
        {
            super(view);
            nameText = view.findViewById(R.id.textView2);
        }

    }
    @NonNull
    @Override
    public RecyclerViewAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shop,parent,false);
        return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.myViewHolder holder, int position) {
        String name = itemList.get(position).getName();
        holder.nameText.setText(name);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}