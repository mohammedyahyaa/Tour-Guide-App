package com.example.mohamed.project5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class IslamicFragment extends Fragment {
    public static final String DA_DA_DA_DADAD_DA = "Da da da dadad da";

    public IslamicFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_islamic_fragment, container, false);


        final ArrayList<Tour_data> islamic_data = new ArrayList<Tour_data>();

        islamic_data.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.tatto));
        islamic_data.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.b));
        islamic_data.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.a));
        islamic_data.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.w));
        islamic_data.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.q));
        ListView listView = (ListView) rootView.findViewById(R.id.islamic_list_view);
        TourAdapter adapter = new TourAdapter(getActivity(), islamic_data, R.color.colorAccent);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Tour_data resturant_data = islamic_data.get(position);
                Toast.makeText(getContext(), resturant_data.getTour_name(),
                        Toast.LENGTH_SHORT).show();
                Log.v(DA_DA_DA_DADAD_DA, resturant_data.getTour_name().toString());
            }
        });
        return rootView;
    }
}
