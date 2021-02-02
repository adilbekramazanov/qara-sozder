package com.qarasozder.qaraszder;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.util.Random;

import static com.qarasozder.qaraszder.ConstSharedPref.MyCurrentLanguageSharedPrefKey;

public class MainActivity extends AppCompatActivity {

    private String getRandomQuote() {
        Random ran = new Random();
        // generating integer
        int randomNumber = ran.nextInt(8);

        String[] string = new String[]{
                getString(R.string.quote_one),
                getString(R.string.quote_two),
                getString(R.string.quote_three),
                getString(R.string.quote_four),
                getString(R.string.quote_five),
                getString(R.string.quote_six),
                getString(R.string.quote_seven),
                getString(R.string.quote_eight)
        };
        return string[randomNumber];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String languageDef = Locale.getDefault().getLanguage();
        String sharedLanguage = sharedPreferences.getString(MyCurrentLanguageSharedPrefKey, languageDef);

        Locale locale = new Locale(sharedLanguage);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        setContentView(R.layout.activity_main);
        TextView textViewQuote = findViewById(R.id.quote);
        TextView abaiKunanbayev = findViewById(R.id.abaiKunanbayev);
        FrameLayout myLayout = findViewById(R.id.main_activity_layout);
        textViewQuote.setText(getRandomQuote());
        textViewQuote.setAlpha(0f);
        abaiKunanbayev.setAlpha(0f);

        boolean startingPage = true;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textViewQuote.animate().alpha(1f).setDuration(600);
                textViewQuote.animate().scaleX(1.2f).setDuration(600);
                textViewQuote.animate().scaleY(1.2f).setDuration(600);
                textViewQuote.animate().scaleX(0.9f).setDuration(400);
                textViewQuote.animate().scaleY(0.9f).setDuration(400);

            }
        }, 600);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abaiKunanbayev.animate().alpha(1f).setDuration(1000);
            }
        }, 1800);

        textViewQuote.animate().scaleX(0.9f).setDuration(400);
        textViewQuote.animate().scaleY(0.9f).setDuration(400);



        int SPLASH_DISPLAY_LENGTH = 3400;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH);

    }

}
