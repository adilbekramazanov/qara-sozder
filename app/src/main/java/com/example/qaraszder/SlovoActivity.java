package com.example.qaraszder;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SlovoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slovo);

        TextView tvDescription = findViewById(R.id.description);
        TextView tvTitle = findViewById(R.id.title);
        tvDescription.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
        int number = intent.getExtras().getInt("1");
        switch (number) {
            case 1:
                tvTitle.setText(getResources().getString(R.string.slovo1_title));
                tvDescription.setText(getResources().getString(R.string.slovo1_description));
                break;
            case 2:
                tvTitle.setText(getResources().getString(R.string.slovo2_title));
                tvDescription.setText(getResources().getString(R.string.slovo2_description));
                break;
            case 3:
                tvTitle.setText(getResources().getString(R.string.slovo3_title));
                tvDescription.setText(getResources().getString(R.string.slovo3_description));
                break;
            case 4:
                tvTitle.setText(getResources().getString(R.string.slovo4_title));
                tvDescription.setText(getResources().getString(R.string.slovo4_description));
                break;
            case 5:
                tvTitle.setText(getResources().getString(R.string.slovo5_title));
                tvDescription.setText(getResources().getString(R.string.slovo5_description));
                break;
            case 6:
                tvTitle.setText(getResources().getString(R.string.slovo6_title));
                tvDescription.setText(getResources().getString(R.string.slovo6_description));
                break;
            case 7:
                tvTitle.setText(getResources().getString(R.string.slovo7_title));
                tvDescription.setText(getResources().getString(R.string.slovo7_description));
                break;
            case 8:
                tvTitle.setText(getResources().getString(R.string.slovo8_title));
                tvDescription.setText(getResources().getString(R.string.slovo8_description));
                break;
            case 9:
                tvTitle.setText(getResources().getString(R.string.slovo9_title));
                tvDescription.setText(getResources().getString(R.string.slovo9_description));
                break;
            case 10:
                tvTitle.setText(getResources().getString(R.string.slovo10_title));
                tvDescription.setText(getResources().getString(R.string.slovo10_description));
                break;
            case 11:
                tvTitle.setText(getResources().getString(R.string.slovo11_title));
                tvDescription.setText(getResources().getString(R.string.slovo11_description));
                break;
            case 12:
                tvTitle.setText(getResources().getString(R.string.slovo12_title));
                tvDescription.setText(getResources().getString(R.string.slovo12_description));
                break;
            case 13:
                tvTitle.setText(getResources().getString(R.string.slovo13_title));
                tvDescription.setText(getResources().getString(R.string.slovo13_description));
                break;
            case 14:
                tvTitle.setText(getResources().getString(R.string.slovo14_title));
                tvDescription.setText(getResources().getString(R.string.slovo14_description));
                break;
            case 15:
                tvTitle.setText(getResources().getString(R.string.slovo15_title));
                tvDescription.setText(getResources().getString(R.string.slovo15_description));
                break;
            case 16:
                tvTitle.setText(getResources().getString(R.string.slovo16_title));
                tvDescription.setText(getResources().getString(R.string.slovo16_description));
                break;
            case 17:
                tvTitle.setText(getResources().getString(R.string.slovo17_title));
                tvDescription.setText(getResources().getString(R.string.slovo17_description));
                break;
            case 18:
                tvTitle.setText(getResources().getString(R.string.slovo18_title));
                tvDescription.setText(getResources().getString(R.string.slovo18_description));
                break;
            case 19:
                tvTitle.setText(getResources().getString(R.string.slovo19_title));
                tvDescription.setText(getResources().getString(R.string.slovo19_description));
                break;
            case 20:
                tvTitle.setText(getResources().getString(R.string.slovo20_title));
                tvDescription.setText(getResources().getString(R.string.slovo20_description));
                break;
            case 21:
                tvTitle.setText(getResources().getString(R.string.slovo21_title));
                tvDescription.setText(getResources().getString(R.string.slovo21_description));
                break;
            case 22:
                tvTitle.setText(getResources().getString(R.string.slovo22_title));
                tvDescription.setText(getResources().getString(R.string.slovo22_description));
                break;
            case 23:
                tvTitle.setText(getResources().getString(R.string.slovo23_title));
                tvDescription.setText(getResources().getString(R.string.slovo23_description));
                break;
            case 24:
                tvTitle.setText(getResources().getString(R.string.slovo24_title));
                tvDescription.setText(getResources().getString(R.string.slovo24_description));
                break;
            case 25:
                tvTitle.setText(getResources().getString(R.string.slovo25_title));
                tvDescription.setText(getResources().getString(R.string.slovo25_description));
                break;
            case 26:
                tvTitle.setText(getResources().getString(R.string.slovo26_title));
                tvDescription.setText(getResources().getString(R.string.slovo26_description));
                break;
            case 27:
                tvTitle.setText(getResources().getString(R.string.slovo27_title));
                tvDescription.setText(getResources().getString(R.string.slovo27_description));
                break;
            case 28:
                tvTitle.setText(getResources().getString(R.string.slovo28_title));
                tvDescription.setText(getResources().getString(R.string.slovo28_description));
                break;
            case 29:
                tvTitle.setText(getResources().getString(R.string.slovo29_title));
                tvDescription.setText(getResources().getString(R.string.slovo29_description));
                break;
            case 30:
                tvTitle.setText(getResources().getString(R.string.slovo30_title));
                tvDescription.setText(getResources().getString(R.string.slovo30_description));
                break;
            case 31:
                tvTitle.setText(getResources().getString(R.string.slovo31_title));
                tvDescription.setText(getResources().getString(R.string.slovo31_description));
                break;
            case 32:
                tvTitle.setText(getResources().getString(R.string.slovo32_title));
                tvDescription.setText(getResources().getString(R.string.slovo32_description));
                break;
            case 33:
                tvTitle.setText(getResources().getString(R.string.slovo33_title));
                tvDescription.setText(getResources().getString(R.string.slovo33_description));
                break;
            case 34:
                tvTitle.setText(getResources().getString(R.string.slovo34_title));
                tvDescription.setText(getResources().getString(R.string.slovo34_description));
                break;
            case 35:
                tvTitle.setText(getResources().getString(R.string.slovo35_title));
                tvDescription.setText(getResources().getString(R.string.slovo35_description));
                break;
            case 36:
                tvTitle.setText(getResources().getString(R.string.slovo36_title));
                tvDescription.setText(getResources().getString(R.string.slovo36_description));
                break;
            case 37:
                tvTitle.setText(getResources().getString(R.string.slovo37_title));
                tvDescription.setText(getResources().getString(R.string.slovo37_description));
                break;
            case 38:
                tvTitle.setText(getResources().getString(R.string.slovo38_title));
                tvDescription.setText(getResources().getString(R.string.slovo38_description));
                break;
            case 39:
                tvTitle.setText(getResources().getString(R.string.slovo39_title));
                tvDescription.setText(getResources().getString(R.string.slovo39_description));
                break;
            case 40:
                tvTitle.setText(getResources().getString(R.string.slovo40_title));
                tvDescription.setText(getResources().getString(R.string.slovo40_description));
                break;
            case 41:
                tvTitle.setText(getResources().getString(R.string.slovo41_title));
                tvDescription.setText(getResources().getString(R.string.slovo41_description));
                break;
            case 42:
                tvTitle.setText(getResources().getString(R.string.slovo42_title));
                tvDescription.setText(getResources().getString(R.string.slovo42_description));
                break;
            case 43:
                tvTitle.setText(getResources().getString(R.string.slovo43_title));
                tvDescription.setText(getResources().getString(R.string.slovo43_description));
                break;
            case 44:
                tvTitle.setText(getResources().getString(R.string.slovo44_title));
                tvDescription.setText(getResources().getString(R.string.slovo44_description));
                break;
            case 45:
                tvTitle.setText(getResources().getString(R.string.slovo45_title));
                tvDescription.setText(getResources().getString(R.string.slovo45_description));
                break;
        }
    }
}

