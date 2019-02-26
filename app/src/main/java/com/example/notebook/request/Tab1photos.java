package com.example.notebook.request;

/**
 * Created by Notebook on 23.02.2017.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Tab1photos extends Fragment {
    ImageView imageView, imageView2, imageView3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.photos, container, false);
        imageView = (ImageView)rootView.findViewById(R.id.imageView);
        imageView2 = (ImageView)rootView.findViewById(R.id.imageView2);
        imageView3 = (ImageView)rootView.findViewById(R.id.imageView3);
//Начало синего маршрута
        if(First1.number==11)
            {
                imageView.setImageResource(R.drawable.politeh1);
                imageView2.setImageResource(R.drawable.politeh2);
                imageView3.setImageResource(R.drawable.pgtuuu);}

        else if (First1.number==12)
        {

            imageView.setImageResource(R.drawable.muzei);
            imageView2.setImageResource(R.drawable.muzeii);
        }
        else if (First1.number==13)
        {

            imageView.setImageResource(R.drawable.glavpochtamt);
            imageView2.setImageResource(R.drawable.glavpochtamtt);
        }
        else if (First1.number==14)
        {

            imageView.setImageResource(R.drawable.detskiymir1);
            imageView2.setImageResource(R.drawable.detmir);
            imageView3.setImageResource(R.drawable.ryady);
        }
        else if (First1.number==15)
        {

            imageView.setImageResource(R.drawable.chavayn);
            imageView2.setImageResource(R.drawable.chavayn1);
        }
        else if (First1.number==16)
        {

            imageView.setImageResource(R.drawable.kotomkin);
            imageView2.setImageResource(R.drawable.kotomkinvkontsezh);
        }

        //Начало фиолтового маршрута
        if(First1.number==21)
        {
            imageView.setImageResource(R.drawable.obschaga1);}

        else if (First1.number==22)
        {

            imageView.setImageResource(R.drawable.izo);
        }
        else if (First1.number==23)
        {

            imageView.setImageResource(R.drawable.dokukulnyi);
            imageView2.setImageResource(R.drawable.kukulnyi);
        }
        else if (First1.number==24)
        {

            imageView.setImageResource(R.drawable.vhodoierus);
            imageView2.setImageResource(R.drawable.vhodoierus2);
            imageView3.setImageResource(R.drawable.vhodoieris2);
        }
        else if (First1.number==25)
        {

            imageView.setImageResource(R.drawable.dram);
        }
        else if (First1.number==26)
        {

            imageView.setImageResource(R.drawable.korepova1);
        }

        //Начало зеленого маршрута
        if(First1.number==31)
        {
            imageView.setImageResource(R.drawable.lenin);}

        else if (First1.number==32)
        {

            imageView.setImageResource(R.drawable.margu1);
            imageView2.setImageResource(R.drawable.margu2);
        }
        else if (First1.number==33)
        {

            imageView.setImageResource(R.drawable.record);
        }
        else if (First1.number==34)
        {

            imageView.setImageResource(R.drawable.biblioteka);
        }
        else if (First1.number==35)
        {

            imageView.setImageResource(R.drawable.park);
        }
        else if (First1.number==36)
        {

            imageView.setImageResource(R.drawable.voshod);
        }
        else if (First1.number==37)
        {

            imageView.setImageResource(R.drawable.gulag);
        }

        //Начало красного маршрута
        if(First1.number==41)
        {
            imageView.setImageResource(R.drawable.teatr);}

        else if (First1.number==42)
        {

            imageView.setImageResource(R.drawable.shkola);
        }
        else if (First1.number==43)
        {

            imageView.setImageResource(R.drawable.mari);
        }
        else if (First1.number==44)
        {

            imageView.setImageResource(R.drawable.tihvinskaya);
        }
        else if (First1.number==45)
        {

            imageView.setImageResource(R.drawable.domkrestyanina);
        }
        else if (First1.number==46)
        {

            imageView.setImageResource(R.drawable.naumov);
        }
        else if (First1.number==47)
        {

            imageView.setImageResource(R.drawable.plolenin);
        }


        return rootView;
    }
}

