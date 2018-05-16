package com.example.adades.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends android.support.v4.app.Fragment {

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflating the Layout in order to populate with objects
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Creating an ArrayList with Location objects
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.history_museum_name, R.drawable.history_museum, R.string.history_museum_address));
        locations.add(new Location(R.string.art_museum_name, R.drawable.art_museum, R.string.art_museum_address));
        locations.add(new Location(R.string.antipa_museum_name, R.drawable.antipa, R.string.antipa_museum_address));
        locations.add(new Location(R.string.village_museum_name, R.drawable.village, R.string.village_museum_address));

        //Creating a location adapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Assigning a listView to the location list layout
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Setting an adapter onto the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}
