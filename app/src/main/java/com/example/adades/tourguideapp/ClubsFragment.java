package com.example.adades.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ListView;

import java.util.ArrayList;

public class ClubsFragment extends android.support.v4.app.Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflating the Layout in order to populate with objects
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Creating an ArrayList with Location objects
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.nuba_name, R.drawable.nuba, R.string.nuba_address));
        locations.add(new Location(R.string.bamboo_name, R.drawable.bamboo, R.string.bamboo_address));
        locations.add(new Location(R.string.bellagio_name, R.drawable.bellagio, R.string.bellagio_address));
        locations.add(new Location(R.string.princess_name, R.drawable.princess, R.string.princess_address));

        //Creating a location adapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Assigning a listView to the location list layout
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Setting an adapter onto the listView
        listView.setAdapter(adapter);
        return rootView;
    }
}
