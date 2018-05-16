package com.example.adades.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends android.support.v4.app.Fragment {

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflating the Layout in order to populate with objects
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Creating an ArrayList with Location objects
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.herastrau_park_name, R.drawable.herastrau, R.string.herastrau_park_address));
        locations.add(new Location(R.string.cismigiu_park_name, R.drawable.cismigiu, R.string.cismigiu_park_address));
        locations.add(new Location(R.string.IOR_park_name, R.drawable.ior, R.string.IOR_park_address));
        locations.add(new Location(R.string.izvor_park_name, R.drawable.izvor, R.string.izvor_park_address));

        //Creating a location adapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Assigning a listView to the location list layout
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Setting an adapter onto the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}
