package com.example.androidlab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private List<AnimalInfo> animalList;
    private Context context;

    AnimalAdapter(Context context,List<AnimalInfo> animalList) {
        this.animalList = animalList;
        this.context = context;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        AnimalInfo animal = animalList.get(position);
        holder.animalNameTextView.setText(animal.getName());
        String weight = context.getString(R.string.weight_textview);
        String height= context.getString(R.string.height_textview);
        String weightMeasure= context.getString(R.string.weight_measure);
        String heightMeasure= context.getString(R.string.height_measure);
        holder.animalWeightTextView.setText(GetCharacteristicMessage(weight, String.valueOf(animal.getWeight()), weightMeasure));
        holder.animalHeightTextView.setText(GetCharacteristicMessage(height, String.valueOf(animal.getHeight()), heightMeasure));
        holder.animalImageView.setImageResource(animal.getPictureResource());
    }
    private String GetCharacteristicMessage(String characteristic,String value, String measure){
        return characteristic + ": " + value + " "+ measure;
    }
    @Override
    public int getItemCount() {
        return animalList.size();
    }
    static class AnimalViewHolder extends RecyclerView.ViewHolder {
        TextView animalNameTextView;
        TextView animalHeightTextView;
        TextView animalWeightTextView;
        ImageView animalImageView;

        public AnimalViewHolder(View itemView) {
            super(itemView);
            animalNameTextView = itemView.findViewById(R.id.name);
            animalImageView = itemView.findViewById(R.id.picture);
            animalHeightTextView = itemView.findViewById(R.id.height);
            animalWeightTextView = itemView.findViewById(R.id.weight);
        }
    }
}