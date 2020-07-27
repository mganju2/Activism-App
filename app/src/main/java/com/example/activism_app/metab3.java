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
public class metab3 extends Fragment {


    public metab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_metab3, container, false);

        TextView myInfo1 = myView.findViewById(R.id.meInfo1);
        myInfo1.setText("How Tarana Burke started MeToo");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://www.businessinsider.com/how-the-metoo-movement-started-where-its-headed-tarana-burke-time-person-of-year-women-2017-12";
        Linkify.addLinks(myInfo1, pattern1, scheme1);

        TextView myInfo2 = myView.findViewById(R.id.meInfo2);
        myInfo2.setText("MeToo over a Decade");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://www.nbcnews.com/think/opinion/me-too-movement-s-success-took-decade-work-not-just-ncna1108206";
        Linkify.addLinks(myInfo2, pattern2, scheme2);

        TextView myInfo3 = myView.findViewById(R.id.meInfo3);
        myInfo3.setText("2018 the year of MeToo");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://www.cnn.com/videos/us/2018/12/23/me-too-2018-wrap-lc-me-cs-orig.cnn";
        Linkify.addLinks(myInfo3, pattern3, scheme3);

        TextView myInfo4 = myView.findViewById(R.id.meInfo4);
        myInfo4.setText("How MeToo is Changing American Culture");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://www.kjrh.com/news/national-politics/the-race-2020/how-the-metoo-movement-is-changing-culture";
        Linkify.addLinks(myInfo4, pattern4, scheme4);

        TextView myInfo5 = myView.findViewById(R.id.meInfo5);
        myInfo5.setText("How it's Changing the Modern World");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://www.youtube.com/watch?v=ATYK2svJ6eM";
        Linkify.addLinks(myInfo5, pattern5, scheme5);

        TextView myInfo6 = myView.findViewById(R.id.meInfo6);
        myInfo6.setText("NSVRC Podcast");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://www.nsvrc.org/podcasts";
        Linkify.addLinks(myInfo6, pattern6, scheme6);
        // Inflate the layout for this fragment
        return myView;

    }
}
