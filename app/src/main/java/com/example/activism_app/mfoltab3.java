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
public class mfoltab3 extends Fragment {


    public mfoltab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_mfoltab3, container, false);

        TextView myInfo1 = myView.findViewById(R.id.mfolInfo1);
        myInfo1.setText("March For Our Lives Explained");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://mashable.com/2018/03/22/march-for-our-lives-when-where-what-explained/";
        Linkify.addLinks(myInfo1, pattern1, scheme1);

        TextView myInfo2 = myView.findViewById(R.id.mfolInfo2);
        myInfo1.setText("Extra MFOL Info");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://libguides.com.edu/MarchLives";
        Linkify.addLinks(myInfo2, pattern2, scheme2);

        TextView myInfo3 = myView.findViewById(R.id.mfolInfo3);
        myInfo1.setText("The Students Behind the March");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://www.smithsonianmag.com/innovation/march-for-our-lives-student-activists-showed-meaning-tragedy-180970717/";
        Linkify.addLinks(myInfo3, pattern3, scheme3);

        TextView myInfo4 = myView.findViewById(R.id.mfolInfo4);
        myInfo1.setText("Parkland Students - Turning Grief into Action");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://www.cbsnews.com/news/march-for-our-lives-39-days-how-parkland-students-turned-grief-into-action/";
        Linkify.addLinks(myInfo4, pattern4, scheme4);

        TextView myInfo5 = myView.findViewById(R.id.mfolInfo5);
        myInfo1.setText("How America had Changed since MFOL");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://giffords.org/blog/2019/03/7-ways-america-changed-since-the-march-for-our-lives/";
        Linkify.addLinks(myInfo5, pattern5, scheme5);

        TextView myInfo6 = myView.findViewById(R.id.mfolInfo6);
        myInfo1.setText("How the Pandemic has Affected Gun Violence");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://www.cnn.com/2020/07/01/us/homicides-shootings-spike-us-cities/index.html";
        Linkify.addLinks(myInfo6, pattern6, scheme6);
        // Inflate the layout for this fragment
        return myView;
    }

}
