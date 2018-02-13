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
public class CarsFragment extends Fragment {
    GridView gridViewAllCars;

    public CarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_cars, container, false);
        /*gridViewAllCars = (GridView)rootView.findViewById(R.id.gridViewAllCars);
        ArrayAdapter<Image> arrayAdapterCarsImages = new ArrayAdapter<Image>(getContext(), android.R.layout.simple_list_item_1);
        ArrayAdapter<String> arrayAdapterCarsName = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1);
        gridViewAllCars.setAdapter(arrayAdapterCarsImages);*/

        return rootView;
    }

}
