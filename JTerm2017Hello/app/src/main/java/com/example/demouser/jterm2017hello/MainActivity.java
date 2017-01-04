package com.example.demouser.jterm2017hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static Map<String, String> countryCode = new HashMap<>();

    static
    {
        countryCode.put("GBR", "United Kingdom");
        countryCode.put("IDN", "Indonesia");
        countryCode.put("IND", "India");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.lookupButton)).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                lookup();
            }
        });
    }





    public void lookup()
    {
        String code = ((EditText)findViewById(R.id.editText)).getText().toString().toUpperCase(); // cast to edit text element
        String country;
                if (countryCode.containsKey(code))
                {
                    country = countryCode.get(code);
                }
                else
                {
                    country = code;
                }

        ((TextView)findViewById(R.id.countryCode)).setText(country);

    }
}
