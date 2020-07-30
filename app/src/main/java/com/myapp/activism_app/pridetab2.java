package com.myapp.activism_app;


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
public class pridetab2 extends Fragment {


    public pridetab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_pridetab2, container, false);

        TextView myDonation1 = myView.findViewById(R.id.pDonation1);
        myDonation1.setText("The Trevor Project");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://www.thetrevorproject.org/";
        Linkify.addLinks(myDonation1, pattern1, scheme1);

        TextView myDonation2 = myView.findViewById(R.id.pDonation2);
        myDonation2.setText("Point Foundation");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://pointfoundation.org/";
        Linkify.addLinks(myDonation2, pattern2, scheme2);

        TextView myDonation3 = myView.findViewById(R.id.pDonation3);
        myDonation3.setText("National Center for Transgender Equality");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://transequality.org/";
        Linkify.addLinks(myDonation3, pattern3, scheme3);

        TextView myDonation4 = myView.findViewById(R.id.pDonation4);
        myDonation4.setText("GLSEN");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://www.glsen.org/";
        Linkify.addLinks(myDonation4, pattern4, scheme4);

        TextView myDonation5 = myView.findViewById(R.id.pDonation5);
        myDonation5.setText("It Gets Better");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://itgetsbetter.org/";
        Linkify.addLinks(myDonation5, pattern5, scheme5);

        TextView myPetition1 = myView.findViewById(R.id.pPetition1);
        myPetition1.setText("LGBTQIA+ Petitions");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://www.thepetitionsite.com/lgbtq-rights/#hottest";
        Linkify.addLinks(myPetition1, pattern6, scheme6);

        TextView myPetition2 = myView.findViewById(R.id.pPetition2);
        myPetition2.setText("Change.org - LGBTQIA+ Petitions");
        Pattern pattern7 = Pattern.compile("");
        String scheme7 = "https://www.change.org/t/lgbt-rights-3";
        Linkify.addLinks(myPetition2, pattern7, scheme7);

        // Inflate the layout for this fragment
        return myView;
    }

}
