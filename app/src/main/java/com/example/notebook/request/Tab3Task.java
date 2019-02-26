package com.example.notebook.request;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.INPUT_METHOD_SERVICE;

/**
 * Created by Notebook on 23.02.2017.
 */

public class Tab3Task extends Fragment {
    private TextView textView1, textView2,textView3;
    private Button button1 , button2, button3 ;
    private EditText editText1 , editText2, editText3;
    private int check1, check2, check3 = 0;
    private String otvet1, otvet2, otvet3;
    String nextpoint;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.task, container, false);


        return rootView;
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button1 = (Button)getActivity().findViewById(R.id.button1);
        button2 = (Button)getActivity().findViewById(R.id.button2);
        button3 = (Button)getActivity().findViewById(R.id.button3);
        editText1 = (EditText)getActivity().findViewById(R.id.editText1);
        editText2 = (EditText)getActivity().findViewById(R.id.editText2);
        editText3 = (EditText)getActivity().findViewById(R.id.editText3);

        textView1 = (TextView)getActivity().findViewById(R.id.textView1);
        textView2 = (TextView)getActivity().findViewById(R.id.textView2);
        textView3 = (TextView)getActivity().findViewById(R.id.textView3);
        textView3.setVisibility(View.GONE);
        editText3.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);
        if(check1==1){button1.setEnabled(false);}
        if(check2==1){button2.setEnabled(false);}
        if(check3==1){button3.setEnabled(false);}

        switch (First1.number){
            //Politeh
            case 11:
                otvet1="97";
                otvet2="300";
                otvet3="1950";
                break;
            //evseeva
            case 12:
                otvet1="Краснококшайск";
                otvet2="В левую";
                break;
            //detskiy
            case 14:
                otvet1="Пожар";
                otvet2="9";
                break;
            //chavain
            case 15:
                otvet1="37";
                otvet2="Ленинский проспект";
                break;
            //kotomkin
            case 16:
                otvet1="Гусли";
                otvet2="4";
                otvet3="Романов";
                break;
            /////////////////////////
            //Obshaga
            case 21:
                otvet1="Парикмахерская";
                otvet2="Нет";
                break;
            //teatrkukol
            case 23:
                otvet1="19";
                otvet2="7";
                otvet3="Радиоточка";
                break;
            //hram
            case 24:
                otvet1="Взорвали";
                otvet2="2013";
                break;
            //dram
            case 25:
                otvet1="1984";
                otvet2="800";
                break;
            //korepova
            case 26:
                otvet1="5";
                otvet2="1891";
                break;
            ///////////////////////////////
            //Lenin
            case 31:
                otvet1="Бронза";
                otvet2="Мир";
                break;
            //margu
            case 32:
                otvet1="35";
                otvet2="17";
                break;
            //racord
            case 33:
                otvet1="1939";
                otvet2="Пампалче";
                break;
            //park
            case 35:
                otvet1="Кладбище";
                otvet2="1940";
                break;
            //voshod
            case 36:
                otvet1="Зарубина";
                otvet2="Детский мир";
                break;
            //gulag
            case 37:
                otvet1="Овощехранилище";
                otvet2="20";
                break;
            //////////////////////////////
            //shket
            case 41:
                otvet1="Милютин";
                otvet2="1968";
                break;
            //shkola
            case 42:
                otvet1="1982";
                otvet2="Александрова";
                break;
            //mari
            case 43:
                otvet1="Нет";
                otvet2="2";
                break;
            //tihvino
            case 44:
                otvet1="6";
                otvet2="Игровые автоматы";
                break;
            //naumov
            case 46:
                otvet1="Ничего";
                otvet2="Нет";
                break;

            case 47:
                otvet1="Да";
                break;

        }


        switch (First1.number){
            //Politeh
            case 11:
                textView1.setText(R.string.politehV1);
                textView2.setText(R.string.politehV2);
                textView3.setText(R.string.politehV3);
                editText1.setHint(R.string.hint);
                editText2.setHint(R.string.hint);
                editText3.setHint("19ХХ");
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText3.setInputType(InputType.TYPE_CLASS_NUMBER);
                textView3.setVisibility(View.VISIBLE);
                editText3.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                zadanie();
                break;

             //Evseev
            case 12:
                textView1.setText(R.string.evseevV1);
                textView2.setText(R.string.evseevV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;

            //Detskiy
            case 14:
                textView1.setText(R.string.detskiyV1);
                textView2.setText(R.string.detskiyV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;

            //Chavain
            case 15:
                textView1.setText(R.string.chavainV1);
                textView2.setText(R.string.chavainV2);
                editText1.setHint("Две цифры ХХ");
                editText2.setHint("Полное наименование");
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;

            //Kotomkin
            case 16:
                textView1.setText(R.string.kotomkinV1);
                textView2.setText(R.string.kotomkinV2);
                textView3.setText(R.string.kotomkinV3);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.hint);
                editText3.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText3.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                textView3.setVisibility(View.VISIBLE);
                editText3.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                zadanie();
                break;

            ///////////////////////////////////////////
            //Obshaga
            case 21:
                textView1.setText(R.string.obshagaV1);
                textView2.setText(R.string.obshagaV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;

            //Kukol
            case 23:
                textView1.setText(R.string.kukolV1);
                textView2.setText(R.string.kukolV2);
                textView3.setText(R.string.kukolV3);
                editText1.setHint(R.string.hint);
                editText2.setHint(R.string.hint);
                editText3.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText3.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                textView3.setVisibility(View.VISIBLE);
                editText3.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                zadanie();
                break;

            //Hram
            case 24:
                textView1.setText(R.string.hramV1);
                textView2.setText(R.string.hramV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;
            //Dram
            case 25:
                textView1.setText(R.string.dramV1);
                textView2.setText(R.string.dramV2);
                editText1.setHint(R.string.hint);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;
            //Korapova
            case 26:
                textView1.setText(R.string.korepovaV1);
                textView2.setText(R.string.korepovaV2);
                editText1.setHint(R.string.hint);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;
            /////////////////////////////////////////////////////////////////////
            //Lenin
            case 31:
                textView1.setText(R.string.leninV1);
                textView2.setText(R.string.leninV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;
            //Margu
            case 32:
                textView1.setText(R.string.marguV1);
                textView2.setText(R.string.marguV2);
                editText1.setHint(R.string.hint);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;
            //Record
            case 33:
                textView1.setText(R.string.recordV1);
                textView2.setText(R.string.recordV2);
                editText1.setHint(R.string.hint);
                editText2.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;
            //Park
            case 35:
                textView1.setText(R.string.parkV1);
                textView2.setText(R.string.parkV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;
            //Voshod
            case 36:
                textView1.setText(R.string.voshodV1);
                textView2.setText(R.string.voshodV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;
            //Gulag
            case 37:
                textView1.setText(R.string.gulagV1);
                textView2.setText(R.string.gulagV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;
            //////////////////////////////////////////////////////////////
            //Shket
            case 41:
                textView1.setText(R.string.shketV1);
                textView2.setText(R.string.shketV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;
            //Shkola
            case 42:
                textView1.setText(R.string.shkolaV1);
                textView2.setText(R.string.shkolaV2);
                editText1.setHint(R.string.hint);
                editText2.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;
            //Mari
            case 43:
                textView1.setText(R.string.mariV1);
                textView2.setText(R.string.mariV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.hint);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                ++check3;
                zadanie();
                break;
            //Tihvno
            case 44:
                textView1.setText(R.string.tihvinoV1);
                textView2.setText(R.string.tihvinoV2);
                editText1.setHint(R.string.hint);
                editText2.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;
            //Naumov
            case 46:
                textView1.setText(R.string.naumovV1);
                textView2.setText(R.string.naumovV2);
                editText1.setHint(R.string.sbolshoy);
                editText2.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                ++check3;
                zadanie();
                break;

            case 47:
                textView1.setText(R.string.exampleV1);
                editText1.setHint(R.string.sbolshoy);
                editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                textView2.setVisibility(View.GONE);
                editText2.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                ++check2;
                ++check3;
                zadanie();
                break;

        }




        }

    private void zadanie() {

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().equals(otvet1)) {
                    pravilno();
                    ++check1;
                    button1.setEnabled(false);
                    keyboardoff();
                }
                if(check1==1 && check2==1 && check3 == 1) {
                    end1();
                }
            }});
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText2.getText().toString().equals(otvet2)){
                    pravilno();
                    ++check2;
                    button2.setEnabled(false);
                    keyboardoff();
                }
                if(check1==1 && check2==1 && check3 == 1) {
                    end1();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText3.getText().toString().equals(otvet3)){
                    pravilno();
                    ++check3;
                    button3.setEnabled(false);
                    keyboardoff();
                }
                if(check1==1 && check2==1 && check3 == 1) {
                    end1();
                }
            }
        });
    }


    private void end1() {
        switch (First1.number){
            case 11:
                nextpoint = getResources().getString(R.string.evseev1);
                break;
            case 12:
                nextpoint = getResources().getString(R.string.pochta1);
                break;
            case 14:
                nextpoint = getResources().getString(R.string.chavain1);
                break;
            case 15:
                nextpoint = getResources().getString(R.string.kotomkin1);
                break;
            case 16:
                nextpoint = getResources().getString(R.string.kreml);
                break;
            //////////////////////
            case 21:
                nextpoint = getResources().getString(R.string.iSO1);
                break;
            case 23:
                nextpoint = getResources().getString(R.string.hram1);
                break;
            case 24:
                nextpoint = getResources().getString(R.string.dram1);
                break;
            case 25:
                nextpoint = getResources().getString(R.string.korepova1);
                break;
            case 26:
                nextpoint = getResources().getString(R.string.kreml);
                break;
            ///////////////
            case 31:
                nextpoint = getResources().getString(R.string.margu1);
                break;
            case 32:
                nextpoint = getResources().getString(R.string.record1);
                break;
            case 33:
                nextpoint = getResources().getString(R.string.biblioteka1);
                break;
            case 35:
                nextpoint = getResources().getString(R.string.voshod1);
                break;
            case 36:
                nextpoint = getResources().getString(R.string.gulag1);
                break;
            case 37:
                nextpoint = getResources().getString(R.string.kreml);
                break;

            //////////
            case 41:
                nextpoint = getResources().getString(R.string.shkola1);
                break;
            case 42:
                nextpoint = getResources().getString(R.string.mari1);
                break;
            case 43:
                nextpoint = getResources().getString(R.string.tihvino1);
                break;
            case 44:
                nextpoint = getResources().getString(R.string.sssr1);
                break;
            case 46:
                nextpoint = getResources().getString(R.string.kreml);
                break;
            case 47:
                nextpoint = getResources().getString(R.string.exampleend);
                break;

        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Следующая точка:")
                        .setMessage(nextpoint)
                        .setCancelable(false)
                        .setNegativeButton("ОК", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Intent intent = new Intent(getActivity(), First1.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
        check1=0;
        check2=0;
        check3=0;
        keyboardoff();

    }

    private void pravilno() {
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),R.string.pravilno,Toast.LENGTH_SHORT);
        toast.show();
    }

    //Отключение клавы
    private void keyboardoff() {
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
                INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
    }
}
