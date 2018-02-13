package com.example.user.gp_t1_xml;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ToursFragment extends Fragment {
    GridView gridViewAllTours;


    public ToursFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tours, container, false);
        /*gridViewAllTours = (GridView)rootView.findViewById(R.id.gridView_allHotels);
        ArrayAdapter<Image> arrayAdapterToursImages = new ArrayAdapter<Image>(getContext(), android.R.layout.simple_list_item_1);
        ArrayAdapter<String> arrayAdapterHotelNames = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1);
        gridViewAllTours.setAdapter(arrayAdapterToursImages);*/

        // Inflate the layout for this fragment
        return rootView;
    }

}
