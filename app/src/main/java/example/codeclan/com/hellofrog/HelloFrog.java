package example.codeclan.com.hellofrog;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25/04/2016.
 */
public class HelloFrog extends AppCompatActivity{

    TextView mNameText;
    TextView mSpeciesText;
    EditText mNameEditText;
    Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("HelloFrog", "onCreate called");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mNameText = (TextView) findViewById(R.id.text_name);
        mSpeciesText =(TextView) findViewById(R.id.text_species);
        mNameEditText = (EditText) findViewById(R.id.name_input);
        mSubmitButton = (Button) findViewById(R.id.submit_button);

        mSubmitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("HelloFrog:", "submit button has been clicked");

                mNameText.setText("Hello my name is " + mNameEditText.getText());
            }
        });

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
//        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Bull Frog");
        categories.add("Titicaca Water Frog");
        categories.add("Demonic Poison Frog");
        categories.add("Long-Nosed Horn Frog");
        categories.add("Dusky Gopher Frog");
        categories.add("Archey's Frog");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
  }




