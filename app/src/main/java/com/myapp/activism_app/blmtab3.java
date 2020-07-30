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
public class blmtab3 extends Fragment {


    public blmtab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_blmtab3, container, false);

        TextView myInfo1 = myView.findViewById(R.id.blmInfo1);
        myInfo1.setText("Black Lives Matter Protests");
        Pattern pattern1 = Pattern.compile("");
        String scheme1 = "https://www.nytimes.com/2020/06/05/sunday-review/black-lives-matter-protests-floyd.html";
        Linkify.addLinks(myInfo1, pattern1, scheme1);

        TextView myInfo2 = myView.findViewById(R.id.blmInfo2);
        myInfo2.setText("Black Lives Matter Explained");
        Pattern pattern2 = Pattern.compile("");
        String scheme2 = "https://www.youtube.com/watch?v=YG8GjlLbbvs";
        Linkify.addLinks(myInfo2, pattern2, scheme2);

        TextView myInfo3 = myView.findViewById(R.id.blmInfo3);
        myInfo3.setText("Black Lives Matter History");
        Pattern pattern3 = Pattern.compile("");
        String scheme3 = "https://www.youtube.com/watch?v=js6ERFDsQv4";
        Linkify.addLinks(myInfo3, pattern3, scheme3);

        TextView myInfo4 = myView.findViewById(R.id.blmInfo4);
        myInfo4.setText("Why You Can't Say the N-Word if You're Not Black");
        Pattern pattern4 = Pattern.compile("");
        String scheme4 = "https://www.dailytarheel.com/article/2019/09/why-you-cant-say-the-n-word-if-youre-not-black";
        Linkify.addLinks(myInfo4, pattern4, scheme4);

        TextView myInfo5 = myView.findViewById(R.id.blmInfo5);
        myInfo5.setText("Growing up Black in America");
        Pattern pattern5 = Pattern.compile("");
        String scheme5 = "https://www.theguardian.com/us-news/2018/jun/06/growing-up-black-in-america-racism-education";
        Linkify.addLinks(myInfo5, pattern5, scheme5);

        TextView myInfo6 = myView.findViewById(R.id.blmInfo6);
        myInfo6.setText("Being Black in America");
        Pattern pattern6 = Pattern.compile("");
        String scheme6 = "https://www.npr.org/2020/06/05/867060621/being-black-in-america-we-have-a-place-in-this-world-too";
        Linkify.addLinks(myInfo6, pattern6, scheme6);

        TextView myInfo7 = myView.findViewById(R.id.blmInfo7);
        myInfo7.setText("Google Doc");
        Pattern pattern7 = Pattern.compile("");
        String scheme7 = "https://drive.google.com/file/d/1inQrwtPHLReUmvCPUD5S67goCwPhSziw/view";
        Linkify.addLinks(myInfo7, pattern7, scheme7);

        // Inflate the layout for this fragment
        return myView;
    }

}
