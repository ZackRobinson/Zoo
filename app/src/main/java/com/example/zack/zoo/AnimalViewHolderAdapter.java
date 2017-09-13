package com.example.zack.zoo;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AnimalViewHolderAdapter extends ArrayAdapter<Animal> {

    public class ViewHolder {
        private TextView tvAnimalName;
        private TextView tvAnimalWeight;
        private TextView tvAnimalAge;
        private TextView tvAnimalCategory;
        private TextView tvAnimalViewType;
    }


    public AnimalViewHolderAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Animal> animalList) {
        super(context, resource, animalList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.custom_listview_item, null);
        }

        ViewHolder hldr = new ViewHolder();
        hldr.tvAnimalName = (TextView) view.findViewById(R.id.tvAnimalName);
        hldr.tvAnimalWeight = (TextView) view.findViewById(R.id.tvAnimalWeight);
        hldr.tvAnimalAge = (TextView) view.findViewById(R.id.tvAnimalAge);
        hldr.tvAnimalCategory = (TextView) view.findViewById(R.id.tvAnimalCategory);


        Animal animal = getItem(position);
        if (animal != null) {
            hldr.tvAnimalName.setText(animal.getName());
            hldr.tvAnimalWeight.setText(String.valueOf(animal.getWeight()));
            hldr.tvAnimalAge.setText(animal.getAge());
            hldr.tvAnimalCategory.setText(animal.getCategory());
            view.setTag(hldr);
        }


        return view;
    }
}
