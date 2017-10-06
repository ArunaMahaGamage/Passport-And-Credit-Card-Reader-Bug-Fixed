package com.palvision.passportandcreditcardreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateUsersList();
    }

    private void populateUsersList() {
        // Construct the data source
        ArrayList<User> arrayOfUsers = User.getUsers();
        // Create the adapter to convert the array to views
        CustomListAdapter adapter = new CustomListAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvUsers);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                        "possition " + i, Toast.LENGTH_LONG).show();
                if (i == 0) {
                    Intent creditCardReader = new Intent(MainActivity.this, PassportReader.class);
                    startActivity(creditCardReader);
                } else if (i == 1) {
                    Intent creditCardReader = new Intent(MainActivity.this, CreditCardReader.class);
                    startActivity(creditCardReader);
                }
            }
        });
    }
}

