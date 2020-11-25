package com.example.qaraszder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Window;
import android.widget.TextView;

public class Slovo extends AppCompatActivity {

    TextView textView_title;
    TextView textView_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_slovo);

        textView_description = findViewById(R.id.description);
        textView_title = findViewById(R.id.title);
        textView_description.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
        int number = intent.getExtras().getInt("1");

        switch (number){
            case 1:
                textView_title.setText(getResources().getString(R.string.slovo1_title));
                textView_description.setText(getResources().getString(R.string.slovo1_description));
                break;
            case 2:
                textView_title.setText(getResources().getString(R.string.slovo2_title));
                textView_description.setText(getResources().getString(R.string.slovo2_description));
                break;
            case 3:
                textView_title.setText(getResources().getString(R.string.slovo3_title));
                textView_description.setText(getResources().getString(R.string.slovo3_description));
                break;
            case 4:
                textView_title.setText(getResources().getString(R.string.slovo4_title));
                textView_description.setText(getResources().getString(R.string.slovo4_description));
                break;
            case 5:
                textView_title.setText(getResources().getString(R.string.slovo5_title));
                textView_description.setText(getResources().getString(R.string.slovo5_description));
                break;
            case 6:
                textView_title.setText(getResources().getString(R.string.slovo6_title));
                textView_description.setText(getResources().getString(R.string.slovo6_description));
                break;
            case 7:
                textView_title.setText(getResources().getString(R.string.slovo7_title));
                textView_description.setText(getResources().getString(R.string.slovo7_description));
                break;
            case 8:
                textView_title.setText(getResources().getString(R.string.slovo8_title));
                textView_description.setText(getResources().getString(R.string.slovo8_description));
                break;
            case 9:
                textView_title.setText(getResources().getString(R.string.slovo9_title));
                textView_description.setText(getResources().getString(R.string.slovo9_description));
                break;
            case 10:
                textView_title.setText(getResources().getString(R.string.slovo10_title));
                textView_description.setText(getResources().getString(R.string.slovo10_description));
                break;
            case 11:
                textView_title.setText(getResources().getString(R.string.slovo11_title));
                textView_description.setText(getResources().getString(R.string.slovo11_description));
                break;
            case 12:
                textView_title.setText(getResources().getString(R.string.slovo12_title));
                textView_description.setText(getResources().getString(R.string.slovo12_description));
                break;
            case 13:
                textView_title.setText(getResources().getString(R.string.slovo13_title));
                textView_description.setText(getResources().getString(R.string.slovo13_description));
                break;
            case 14:
                textView_title.setText(getResources().getString(R.string.slovo14_title));
                textView_description.setText(getResources().getString(R.string.slovo14_description));
                break;
            case 15:
                textView_title.setText(getResources().getString(R.string.slovo15_title));
                textView_description.setText(getResources().getString(R.string.slovo15_description));
                break;
            case 16:
                textView_title.setText(getResources().getString(R.string.slovo16_title));
                textView_description.setText(getResources().getString(R.string.slovo16_description));
                break;
            case 17:
                textView_title.setText(getResources().getString(R.string.slovo17_title));
                textView_description.setText(getResources().getString(R.string.slovo17_description));
                break;
            case 18:
                textView_title.setText(getResources().getString(R.string.slovo18_title));
                textView_description.setText(getResources().getString(R.string.slovo18_description));
                break;
            case 19:
                textView_title.setText(getResources().getString(R.string.slovo19_title));
                textView_description.setText(getResources().getString(R.string.slovo19_description));
                break;
            case 20:
                textView_title.setText(getResources().getString(R.string.slovo20_title));
                textView_description.setText(getResources().getString(R.string.slovo20_description));
                break;
            case 21:
                textView_title.setText(getResources().getString(R.string.slovo21_title));
                textView_description.setText(getResources().getString(R.string.slovo21_description));
                break;
            case 22:
                textView_title.setText(getResources().getString(R.string.slovo22_title));
                textView_description.setText(getResources().getString(R.string.slovo22_description));
                break;
            case 23:
                textView_title.setText(getResources().getString(R.string.slovo23_title));
                textView_description.setText(getResources().getString(R.string.slovo23_description));
                break;
            case 24:
                textView_title.setText(getResources().getString(R.string.slovo24_title));
                textView_description.setText(getResources().getString(R.string.slovo24_description));
                break;
            case 25:
                textView_title.setText(getResources().getString(R.string.slovo25_title));
                textView_description.setText(getResources().getString(R.string.slovo25_description));
                break;
            case 26:
                textView_title.setText(getResources().getString(R.string.slovo26_title));
                textView_description.setText(getResources().getString(R.string.slovo26_description));
                break;
            case 27:
                textView_title.setText(getResources().getString(R.string.slovo27_title));
                textView_description.setText(getResources().getString(R.string.slovo27_description));
                break;
            case 28:
                textView_title.setText(getResources().getString(R.string.slovo28_title));
                textView_description.setText(getResources().getString(R.string.slovo28_description));
                break;
            case 29:
                textView_title.setText(getResources().getString(R.string.slovo29_title));
                textView_description.setText(getResources().getString(R.string.slovo29_description));
                break;
            case 30:
                textView_title.setText(getResources().getString(R.string.slovo30_title));
                textView_description.setText(getResources().getString(R.string.slovo30_description));
                break;
            case 31:
                textView_title.setText(getResources().getString(R.string.slovo31_title));
                textView_description.setText(getResources().getString(R.string.slovo31_description));
                break;
            case 32:
                textView_title.setText(getResources().getString(R.string.slovo32_title));
                textView_description.setText(getResources().getString(R.string.slovo32_description));
                break;
            case 33:
                textView_title.setText(getResources().getString(R.string.slovo33_title));
                textView_description.setText(getResources().getString(R.string.slovo33_description));
                break;
            case 34:
                textView_title.setText(getResources().getString(R.string.slovo34_title));
                textView_description.setText(getResources().getString(R.string.slovo34_description));
                break;
            case 35:
                textView_title.setText(getResources().getString(R.string.slovo35_title));
                textView_description.setText(getResources().getString(R.string.slovo35_description));
                break;
            case 36:
                textView_title.setText(getResources().getString(R.string.slovo36_title));
                textView_description.setText(getResources().getString(R.string.slovo36_description));
                break;
            case 37:
                textView_title.setText(getResources().getString(R.string.slovo37_title));
                textView_description.setText(getResources().getString(R.string.slovo37_description));
                break;
            case 38:
                textView_title.setText(getResources().getString(R.string.slovo38_title));
                textView_description.setText(getResources().getString(R.string.slovo38_description));
                break;
            case 39:
                textView_title.setText(getResources().getString(R.string.slovo39_title));
                textView_description.setText(getResources().getString(R.string.slovo39_description));
                break;
            case 40:
                textView_title.setText(getResources().getString(R.string.slovo40_title));
                textView_description.setText(getResources().getString(R.string.slovo40_description));
                break;
            case 41:
                textView_title.setText(getResources().getString(R.string.slovo41_title));
                textView_description.setText(getResources().getString(R.string.slovo41_description));
                break;
            case 42:
                textView_title.setText(getResources().getString(R.string.slovo42_title));
                textView_description.setText(getResources().getString(R.string.slovo42_description));
                break;
            case 43:
                textView_title.setText(getResources().getString(R.string.slovo43_title));
                textView_description.setText(getResources().getString(R.string.slovo43_description));
                break;
            case 44:
                textView_title.setText(getResources().getString(R.string.slovo44_title));
                textView_description.setText(getResources().getString(R.string.slovo44_description));
                break;
            case 45:
                textView_title.setText(getResources().getString(R.string.slovo45_title));
                textView_description.setText(getResources().getString(R.string.slovo45_description));
                break;

        }




    }
}

