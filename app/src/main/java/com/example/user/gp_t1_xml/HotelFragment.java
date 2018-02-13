package com.example.user.gp_t1_xml;


import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.MessageFormat;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {
    GridView gridViewallHotels;
    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);
        /*gridViewallHotels = (GridView)rootView.findViewById(R.id.gridView_allHotels);
        ArrayAdapter<Image> arrayAdapterImages = new ArrayAdapter<Image>(getContext(), android.R.layout.simple_list_item_1);
        ArrayAdapter<String> arrayAdapterHotelNames = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1);
        gridViewallHotels.setAdapter(arrayAdapterImages);*/
        Button trial = (Button)rootView.findViewById(R.id.buttonGoToSpecificTrial);
        trial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), SpecificHotelMapsActivity.class);
                startActivity(i);
            }
        });

        return rootView;
    }

}
