package com.example.notebook.request;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Notebook on 23.02.2017.
 */


public class Tab2Text extends Fragment {
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.text, container, false);
        textView = (TextView) rootView.findViewById(R.id.textView);


        //siniy
        if(First1.number==11)
        {   textView.setText(R.string.politehtext);}
        else if (First1.number==12)
        {textView.setText(R.string.evseevtext);      }
        else if (First1.number==13)
        {textView.setText(getString(R.string.sleduypochta));      }
        else if (First1.number==14)
        {textView.setText(getString(R.string.detskiytext));      }
        else if (First1.number==15)
        {textView.setText(getString(R.string.chavaintext));      }
        else if (First1.number==16)
        {textView.setText(getString(R.string.kotomkintext));      }

        //fiolet
        if(First1.number==21)
        {   textView.setText(R.string.obshagatext);}
        else if (First1.number==22)
        {textView.setText(R.string.sleduyiso);      }
        else if (First1.number==23)
        {textView.setText(getString(R.string.teatrtext1));}
        else if (First1.number==24)
        {textView.setText(getString(R.string.hramtext1));}
        else if (First1.number==25)
        {textView.setText(getString(R.string.dramtext));      }
        else if (First1.number==26)
        {textView.setText(getString(R.string.korepovatext));      }

        //zelen
        if(First1.number==31)
        {   textView.setText(R.string.lenintext);}
        else if (First1.number==32)
        {textView.setText(R.string.margutext);      }
        else if (First1.number==33)
        {textView.setText(getString(R.string.recordtext));}
        else if (First1.number==34)
        {textView.setText(getString(R.string.sleduybiblioteka));}
        else if (First1.number==35)
        {textView.setText(getString(R.string.parktext));      }
        else if (First1.number==36)
        {textView.setText(getString(R.string.vosgodtext));      }
        else if (First1.number==37)
        {textView.setText(getString(R.string.gulagtext));      }

        //krasn
        if(First1.number==41)
        {   textView.setText(R.string.shketantext);}
        else if (First1.number==42)
        {textView.setText(R.string.shkolatext);      }
        else if (First1.number==43)
        {textView.setText(getString(R.string.maritext));}
        else if (First1.number==44)
        {textView.setText(getString(R.string.tihvinotext));}
        else if (First1.number==45)
        {textView.setText(getString(R.string.sleduysssr));      }
        else if (First1.number==46)
        {textView.setText(getString(R.string.naumovtext));      }
        else if (First1.number==47)
        {textView.setText(getString(R.string.exampletext));      }


        return rootView;
    }
}