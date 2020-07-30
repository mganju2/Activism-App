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
public class pridetab3 extends Fragment {


    public pridetab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_pridetab3, container, false);

        TextView myInfo1 = myView.findViewById(R.id.pInfo1);
        myInfo1.setText("A Living History of the LGBT Movement Since The 1800s");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://www.youtube.com/watch?v=Q1D65SxzojI";
        Linkify.addLinks(myInfo1, pattern1, scheme1);

        TextView myInfo2 = myView.findViewById(R.id.pInfo2);
        myInfo2.setText("The History of LGBTQ+ Community");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://www.youtube.com/watch?v=wkzwDOCEDCo";
        Linkify.addLinks(myInfo2, pattern2, scheme2);

        TextView myInfo3 = myView.findViewById(R.id.pInfo3);
        myInfo3.setText("Stonewall Forever - A Documentary");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://www.youtube.com/watch?v=GjRv7dJTync";
        Linkify.addLinks(myInfo3, pattern3, scheme3);

        TextView myInfo4 = myView.findViewById(R.id.pInfo4);
        myInfo4.setText("Gay Rights Movement");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://www.britannica.com/topic/gay-rights-movement";
        Linkify.addLinks(myInfo4, pattern4, scheme4);

        TextView myInfo5 = myView.findViewById(R.id.pInfo5);
        myInfo5.setText("Overview of Social LGBTQIA+ Movements");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://en.wikipedia.org/wiki/LGBT_social_movements";
        Linkify.addLinks(myInfo5, pattern5, scheme5);

        TextView myInfo6 = myView.findViewById(R.id.pInfo6);
        myInfo6.setText("12 Podcasts for Queers");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://www.advocate.com/media/2019/5/17/12-gay-lgbtq-podcasts-you-should-be-listening#media-gallery-media-4";
        Linkify.addLinks(myInfo6, pattern6, scheme6);

        TextView myInfo7 = myView.findViewById(R.id.pInfo7);
        myInfo7.setText("Civil Rights Law Protects Gay and Transgender Workers");
        Pattern pattern7 = Pattern.compile("");
        String scheme7 = "https://www.nytimes.com/2020/06/15/us/gay-transgender-workers-supreme-court.html";
        Linkify.addLinks(myInfo7, pattern7, scheme7);

        TextView myInfo8 = myView.findViewById(R.id.pInfo8);
        myInfo8.setText("Adoption Agency should be able to Reject Gay Couples, Trump Administration Argues");
        Pattern pattern8 = Pattern.compile("");
        String scheme8 = "https://www.nytimes.com/2020/06/15/us/gay-transgender-workers-supreme-court.html";
        Linkify.addLinks(myInfo8, pattern8, scheme8);

        TextView myInfo9 = myView.findViewById(R.id.pInfo9);
        myInfo9.setText("Global Acceptance of LGBTQ On the Rise");
        Pattern pattern9 = Pattern.compile("");
        String scheme9 = "https://www.usnews.com/news/best-countries/articles/2020-06-25/lgbtq-acceptance-growing-in-us-and-other-countries-over-time";
        Linkify.addLinks(myInfo9, pattern9, scheme9);

        // Inflate the layout for this fragment
        return myView;
    }

}
