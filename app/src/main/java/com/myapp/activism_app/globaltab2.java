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
public class globaltab2 extends Fragment {


    public globaltab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_globaltab2, container, false);

        TextView myDonation1 = myView.findViewById(R.id.gDonation1);
        myDonation1.setText("GreenPeace Volunteers");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://www.greenpeace.org/international/act/volunteer/";
        Linkify.addLinks(myDonation1, pattern1, scheme1);

        TextView myDonation2 = myView.findViewById(R.id.gDonation2);
        myDonation2.setText("GreenPeace Donations");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://engage.us.greenpeace.org/onlineactions/Qwf5Xj_ZxEejPr_BIHiYvQ2?&amp;;utm_source=website&amp;utm_medium=homepage&amp;utm_campaign=website_donation_form_(header)&amp;_ga=2.140894834.1942478446.1594342279-1540900807.1592162536";
        Linkify.addLinks(myDonation2, pattern2, scheme2);

        TextView myDonation3 = myView.findViewById(R.id.gDonation3);
        myDonation3.setText("GreenPeace Actions");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://www.greenpeace.org/usa/actions/";
        Linkify.addLinks(myDonation3, pattern3, scheme3);

        TextView myPetition1 = myView.findViewById(R.id.gPetition1);
        myPetition1.setText("GreenPeace Petitions");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://www.greenpeace.org/usa/take-action/";
        Linkify.addLinks(myPetition1, pattern4, scheme4);

        TextView myPetition2 = myView.findViewById(R.id.gPetition2);
        myPetition2.setText("Read, Debate, Engage");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://www.fairplanet.org/support/greenpeace-petition-%E2%80%98no-more-climate-wrecking-oil-ads%E2%80%99/";
        Linkify.addLinks(myPetition2, pattern5, scheme5);
        // Inflate the layout for this fragment
        return myView;
    }

}
