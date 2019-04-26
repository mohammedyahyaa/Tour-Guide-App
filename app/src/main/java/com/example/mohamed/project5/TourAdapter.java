package com.example.mohamed.project5;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour_data> {


    public static final String POSSSSSSSSSSSTION = "possssssssssstion";
    private int colors;

    public TourAdapter(Context context, ArrayList<Tour_data> resturant_datas, int colorResourceId) {
        super(context, 0, resturant_datas);
        colors = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.resturant_item_layout, parent, false);
        }

        Tour_data current_rest = getItem(position);

        Log.e(POSSSSSSSSSSSTION, current_rest.toString());

        TextView phone = (TextView) listItemView.findViewById(R.id.phone_txt);
        phone.setText(current_rest.getTour_phone());
        TextView address = (TextView) listItemView.findViewById(R.id.address_TXT);
        address.setText(current_rest.getTour_Adress());
        TextView NAME = (TextView) listItemView.findViewById(R.id.Name_txt);
        NAME.setText(current_rest.getTour_name());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView2);
        imageView.setImageResource(current_rest.getTour_img());

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(), colors);
        linearLayout.setBackgroundColor(color);

        return listItemView;
    }
}
