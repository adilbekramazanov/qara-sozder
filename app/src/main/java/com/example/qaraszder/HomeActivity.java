package com.example.qaraszder;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Locale;

import static com.example.qaraszder.ConstSharedPref.MyCurrentLanguageSharedPrefKey;

public class HomeActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private String languageDef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        languageDef = Locale.getDefault().getLanguage();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Button languageButton = findViewById(R.id.language_button);
        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sharedPref = sharedPreferences.getString(MyCurrentLanguageSharedPrefKey, languageDef);
                if (!sharedPref.equals("kk"))
                    changeLanguageToKaz();
                else
                    changeLanguageToRus();
            }
        });

        ListView listView = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getItems());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 30) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 31) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 32) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 33) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 34) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 35) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 36) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 37) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 38) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 39) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 40) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 41) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 42) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 43) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
                if (position == 44) {
                    Intent intent = new Intent(view.getContext(), SlovoActivity.class);
                    intent.putExtra("1", position + 1);
                    startActivity(intent);
                }
            }
        });
    }


    private void changeLanguageToRus() {
        Toast.makeText(this, "change language to Rus", Toast.LENGTH_LONG).show();
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString(MyCurrentLanguageSharedPrefKey, languageDef);
        myEdit.apply();
        restartActivity();
    }

    private void restartActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    }

    private void changeLanguageToKaz() {
        Toast.makeText(this, "change language to Kaz", Toast.LENGTH_LONG).show();
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString(MyCurrentLanguageSharedPrefKey, "kk");
        myEdit.apply();
        restartActivity();
    }

    private String[] getItems() {
        return new String[]{
                getString(R.string.slovo1_title),
                getString(R.string.slovo2_title),
                getString(R.string.slovo3_title),
                getString(R.string.slovo4_title),
                getString(R.string.slovo5_title),
                getString(R.string.slovo6_title),
                getString(R.string.slovo7_title),
                getString(R.string.slovo8_title),
                getString(R.string.slovo9_title),
                getString(R.string.slovo10_title),
                getString(R.string.slovo11_title),
                getString(R.string.slovo12_title),
                getString(R.string.slovo13_title),
                getString(R.string.slovo14_title),
                getString(R.string.slovo15_title),
                getString(R.string.slovo16_title),
                getString(R.string.slovo17_title),
                getString(R.string.slovo18_title),
                getString(R.string.slovo19_title),
                getString(R.string.slovo20_title),
                getString(R.string.slovo21_title),
                getString(R.string.slovo22_title),
                getString(R.string.slovo23_title),
                getString(R.string.slovo24_title),
                getString(R.string.slovo25_title),
                getString(R.string.slovo26_title),
                getString(R.string.slovo27_title),
                getString(R.string.slovo28_title),
                getString(R.string.slovo29_title),
                getString(R.string.slovo30_title),
                getString(R.string.slovo31_title),
                getString(R.string.slovo32_title),
                getString(R.string.slovo33_title),
                getString(R.string.slovo34_title),
                getString(R.string.slovo35_title),
                getString(R.string.slovo36_title),
                getString(R.string.slovo37_title),
                getString(R.string.slovo38_title),
                getString(R.string.slovo39_title),
                getString(R.string.slovo40_title),
                getString(R.string.slovo41_title),
                getString(R.string.slovo42_title),
                getString(R.string.slovo43_title),
                getString(R.string.slovo44_title),
                getString(R.string.slovo45_title)
        };
    }
}
