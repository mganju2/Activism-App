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
public class metab2 extends Fragment {


    public metab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_metab2, container, false);

        TextView myDonation1 = myView.findViewById(R.id.meDonation1);
        myDonation1.setText("Me Too Donations");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://metoomvmt.org/donate/";
        Linkify.addLinks(myDonation1, pattern1, scheme1);

        TextView myDonation2 = myView.findViewById(R.id.meDonation2);
        myDonation1.setText("National Sexual Violence Resource Center");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://www.nsvrc.org/donate";
        Linkify.addLinks(myDonation2, pattern2, scheme2);

        TextView myDonation3 = myView.findViewById(R.id.meDonation3);
        myDonation1.setText("Rape, Abuse, and Incest National Network (RAINN)");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://www.rainn.org/donate";
        Linkify.addLinks(myDonation3, pattern3, scheme3);

        TextView myDonation4 = myView.findViewById(R.id.meDonation4);
        myDonation1.setText("End Rape On Campus (EROC)");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://endrapeoncampus.org/our-team-1/";
        Linkify.addLinks(myDonation4, pattern4, scheme4);

        TextView myDonation5 = myView.findViewById(R.id.meDonation5);
        myDonation1.setText("Time’s Up");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://timesupnow.org/";
        Linkify.addLinks(myDonation5, pattern5, scheme5);

        TextView myPetition1 = myView.findViewById(R.id.mePetition1);
        myDonation1.setText("Me Too Petitions");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://www.change.org/m/metoo";
        Linkify.addLinks(myPetition1, pattern6, scheme6);
        // Inflate the layout for this fragment
        return myView;
    }

}
