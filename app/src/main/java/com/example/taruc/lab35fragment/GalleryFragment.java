package com.example.taruc.lab35fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {


    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView txtViewMsg = view.findViewById(R.id.txtViewGalley);
        Button btnShow = view.findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtViewMsg.setText("HELLO Gallery");
            }
        });


        return view;
    }


}
