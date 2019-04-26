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


public class Event_Fragment extends Fragment {
    public static final String DA_DA_DA_DADAD_DA = "Da da da dadad da";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_event__fragment, container, false);

        final ArrayList<Tour_data> event_list = new ArrayList();
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.tatto));
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.b));
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.a));
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.w));
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.q));


        ListView museum_LIstView = (ListView) rootView.findViewById(R.id.event_List_view);
        TourAdapter adapter = new TourAdapter(getActivity(), event_list, R.color.colorAccent);
        museum_LIstView.setAdapter(adapter);

        museum_LIstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Tour_data resturant_data = event_list.get(position);
                Log.v(DA_DA_DA_DADAD_DA, resturant_data.getTour_name().toString());
            }
        });

        return rootView;
    }

}

