package com.example.activism_app;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 */
public class globaltab3 extends Fragment {


    public globaltab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_globaltab3, container, false);

        TextView myInfo1 = myView.findViewById(R.id.gInfo1);
        myInfo1.setText("GreenPeace");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://www.greenpeace.org/usa/";
        Linkify.addLinks(myInfo1, pattern1, scheme1);

        TextView myInfo2 = myView.findViewById(R.id.gInfo2);
        myInfo2.setText("GreenPeace Achievements");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://www.greenpeace.org/eastasia/achievements/";
        Linkify.addLinks(myInfo2, pattern2, scheme2);

        TextView myInfo3 = myView.findViewById(R.id.gInfo3);
        myInfo3.setText("Global Warming 101");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://www.nrdc.org/stories/global-warming-101";
        Linkify.addLinks(myInfo3, pattern3, scheme3);

        TextView myInfo4 = myView.findViewById(R.id.gInfo4);
        myInfo4.setText("Climate Sensitivity");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://www.washingtonpost.com/weather/2020/07/22/climate-sensitivity-co2";
        Linkify.addLinks(myInfo4, pattern4, scheme4);

        TextView myInfo5 = myView.findViewById(R.id.gInfo5);
        myInfo5.setText("Groundbreaking Study");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://www.scientificamerican.com/article/worst-and-best-case-scenarios-for-warming-less-likely-groundbreaking-study-finds/";
        Linkify.addLinks(myInfo5, pattern5, scheme5);

        TextView myInfo6 = myView.findViewById(R.id.gInfo6);
        myInfo6.setText("Greta Thunberg - 17 Year old Activist");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://time.com/person-of-the-year-2019-greta-thunberg/";
        Linkify.addLinks(myInfo6, pattern6, scheme6);


        // Inflate the layout for this fragment
        return myView;
    }

}
