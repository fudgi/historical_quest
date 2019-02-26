package com.example.notebook.request;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Notebook on 23.02.2017.
 */

public class First1 extends AppCompatActivity {
    static int number=0;
    private Button checker;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        checker = (Button)findViewById(R.id.checker);
        password = (EditText)findViewById(R.id.password);
        checker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (password.getText().toString())
                {
                    //Начало синего маршрута
                    case "1482":
                        number=11;
                        send();
                        break;
                    case "8937":
                        number=12;
                        send();
                        break;
                    case "481934":
                        number=13;
                        send();
                        break;
                    case "9833":
                        number=14;
                        send();
                        break;
                    case "4555":
                        number=15;
                        send();
                        break;
                    case "7837":
                        number=16;
                        send();
                        break;

                    //Начало фиолетового маршрута
                    case "1483":
                        number=21;
                        send();
                        break;
                    case "19811514":
                        number=22;
                        send();
                        break;
                    case "5642":
                        number=23;
                        send();
                        break;
                    case "9834":
                        number=24;
                        send();
                        break;
                    case "4556":
                        number=25;
                        send();
                        break;
                    case "7838":
                        number=26;
                        send();
                        break;

                    //Начало зеленого маршрута
                    case "1484":
                        number=31;
                        send();
                        break;
                    case "8939":
                        number=32;
                        send();
                        break;
                    case "5643":
                        number=33;
                        send();
                        break;
                    case "1734":
                        number=34;
                        send();
                        break;
                    case "4557":
                        number=35;
                        send();
                        break;
                    case "7839":
                        number=36;
                        send();
                        break;
                    case "2541":
                        number=37;
                        send();
                        break;

                    //Начало красного маршрута
                    case "1485":
                        number=41;
                        send();
                        break;
                    case "8940":
                        number=42;
                        send();
                        break;
                    case "5644":
                        number=43;
                        send();
                        break;
                    case "9836":
                        number=44;
                        send();
                        break;
                    case "193030661932":
                        number=45;
                        send();
                        break;
                    case "7840":
                        number=46;
                        send();
                        break;

                    case "55555":
                        number=47;
                        send();
                        break;
                }


            }
        });


    }

    private void send() {
        Intent intent = new Intent(First1.this, Container.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(First1.this, Spravka.class);
                startActivity(intent);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
