package com.example.activism_app;


import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 */
public class blmtab2 extends Fragment {


    public blmtab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_blmtab2, container, false);

        TextView myDonation1 = myView.findViewById(R.id.blmDonation1);
        myDonation1.setText("142 Ways to Donate to help BLM!");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://nymag.com/strategist/article/where-to-donate-for-black-lives-matter.html";
        Linkify.addLinks(myDonation1, pattern1, scheme1);

        TextView myDonation2 = myView.findViewById(R.id.blmDonation2);
        myDonation2.setText("24 organization to Donate to");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://www.allure.com/story/black-lives-matter-where-to-donate";
        Linkify.addLinks(myDonation2, pattern2, scheme2);

        TextView myDonation3 = myView.findViewById(R.id.blmDonation3);
        myDonation3.setText("Minnesota Freedom Fund");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://minnesotafreedomfund.org/";
        Linkify.addLinks(myDonation3, pattern3, scheme3);

        TextView myDonation4 = myView.findViewById(R.id.blmDonation4);
        myDonation4.setText("Campaign Zero");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://www.joincampaignzero.org/";
        Linkify.addLinks(myDonation4, pattern4, scheme4);

        TextView myPetition1 = myView.findViewById(R.id.blmPetition1);
        myPetition1.setText("Justice For Breonna Taylor");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://www.change.org/p/andy-beshear-justice-for-breonna-taylor?source_location=topic_page";
        Linkify.addLinks(myPetition1, pattern5, scheme5);

        TextView myPetition2 = myView.findViewById(R.id.blmPetition2);
        myPetition2.setText("Justice for Elijah McClain");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://www.change.org/p/aurora-colorado-district-attorney-justice-for-elijah-mcclain?source_location=topic_page";
        Linkify.addLinks(myPetition2, pattern6, scheme6);

        TextView myPetition3 = myView.findViewById(R.id.blmPetition3);
        myPetition3.setText("Justice for George Floyd");
        Pattern pattern7 = Pattern.compile("");
        String scheme7 = "https://www.change.org/p/mayor-jacob-frey-justice-for-george-floyd?source_location=topic_page";
        Linkify.addLinks(myPetition3, pattern7, scheme7);

        TextView myPetition4 = myView.findViewById(R.id.blmPetition4);
        myPetition4.setText("More BLM Petitions!");
        Pattern pattern8 = Pattern.compile("");
        String scheme8 = "https://www.change.org/";
        Linkify.addLinks(myPetition4, pattern8, scheme8);



        // Inflate the layout for this fragment
        return myView;
    }


}
