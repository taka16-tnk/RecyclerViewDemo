package com.example.dpapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlansAdapter extends RecyclerView.Adapter<PlansAdapter.PlanViewHolder> {

    String plan[], desc[];
    int images[];
    Context context;

    public PlansAdapter(Context ct, String plans[], String description[], int img[]) {
        context = ct;
        plan = plans;
        desc = description;
        images = img;
    }

    @NonNull
    @Override
    public PlanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new PlanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanViewHolder holder, int position) {
        holder.plan.setText(plan[position]);
        holder.desc.setText(desc[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class PlanViewHolder extends RecyclerView.ViewHolder {

        TextView plan, desc;
        ImageView myImage;

        public PlanViewHolder(@NonNull View itemView) {
            super(itemView);
            plan = itemView.findViewById(R.id.plan_txt);
            desc = itemView.findViewById(R.id.desc_txt);
            myImage = itemView.findViewById(R.id.myImageView);
        }
    }
}
