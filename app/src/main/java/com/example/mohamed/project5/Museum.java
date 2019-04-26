package com.example.mohamed.project5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Museum extends Fragment {

    public static final String DA_DA_DA_DADAD_DA = "Da da da dadad da";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_museum, container, false);

        final ArrayList<Tour_data> museumlist = new ArrayList();
        museumlist.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.tatto));
        museumlist.add(new Tour_data(getString(R.string.NEW_YORK_MUSEUM), getString(R.string.NEW_YORK_MUSEUM), "01212260464", R.drawable.b));
        museumlist.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.a));
        museumlist.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.w));
        museumlist.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.q));


        ListView museum_LIstView = (ListView) rootView.findViewById(R.id.Resturant_List_view);
        TourAdapter adapter = new TourAdapter(getActivity(), museumlist, R.color.colorAccent);
        museum_LIstView.setAdapter(adapter);

        museum_LIstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Tour_data resturant_data = museumlist.get(position);
                Log.v(DA_DA_DA_DADAD_DA, resturant_data.getTour_name().toString());
            }
        });

        return rootView;
    }
}

