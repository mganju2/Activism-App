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
public class mfoltab2 extends Fragment {


    public mfoltab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_mfoltab2, container, false);

        TextView myDonation1 = myView.findViewById(R.id.mfolDonation1);
        myDonation1.setText("March For Our Lives Donations");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://marchforourlives.com/";
        Linkify.addLinks(myDonation1, pattern1, scheme1);

        TextView myDonation2 = myView.findViewById(R.id.mfolDonation2);
        myDonation1.setText("Everytown for Gun Safety");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://everytown.org/";
        Linkify.addLinks(myDonation2, pattern2, scheme2);

        TextView myDonation3 = myView.findViewById(R.id.mfolDonation3);
        myDonation1.setText("Brady");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://www.bradyunited.org/";
        Linkify.addLinks(myDonation3, pattern3, scheme3);

        TextView myDonation4 = myView.findViewById(R.id.mfolDonation4);
        myDonation1.setText("Giffords");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://giffords.org/";
        Linkify.addLinks(myDonation4, pattern4, scheme4);

        TextView myDonation5 = myView.findViewById(R.id.mfolDonation5);
        myDonation1.setText("The Coalition to Stop Gun Violence (CSGV)");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://www.csgv.org/";
        Linkify.addLinks(myDonation5, pattern5, scheme5);

        TextView myPetition1 = myView.findViewById(R.id.mfolPetition1);
        myDonation1.setText("March For Our Lives Petition");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://www.change.org/p/march-for-our-lives-an-act-to-protect-save-your-children?signed=true";
        Linkify.addLinks(myPetition1, pattern6, scheme6);

        TextView myPetition2 = myView.findViewById(R.id.mfolPetition2);
        myDonation1.setText("Gun Control Petition");
        Pattern pattern7 = Pattern.compile("");
        String scheme7 = "https://sign.moveon.org/petitions/gun-control-now-1";
        Linkify.addLinks(myPetition2, pattern7, scheme7);

        TextView myPetition3 = myView.findViewById(R.id.mfolPetition3);
        myDonation1.setText("MoveOn Petition");
        Pattern pattern8 = Pattern.compile("");
        String scheme8 = "https://sign.moveon.org/petitions/gun-control-now-101";
        Linkify.addLinks(myPetition3, pattern8, scheme8);

        TextView myPetition4 = myView.findViewById(R.id.mfolPetition4);
        myDonation1.setText("More Petitions");
        Pattern pattern9 = Pattern.compile("");
        String scheme9 = "https://www.change.org/t/gun-control";
        Linkify.addLinks(myPetition4, pattern9, scheme9);
        // Inflate the layout for this fragment
        return myView;
    }

}
