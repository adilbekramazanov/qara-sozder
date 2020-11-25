package com.example.qaraszder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class HomeActivity extends AppCompatActivity {


    static Button languageButton;
    SearchView searchView;
    ListView listView;




    public String[] items = {"Слово Первое",
            "Слово Второе: шовинизм ничтожеств",
            "Слово Третье. Ленивые, но увертливые и ухватистые хитрецы",
            "Слово Четвёртое: бездарные проходимцы",
            "Слово Пятое: их система ценностей",
            "Слово Шестое: на вид удал, в душе холуй",
            "Слово Седьмое: невежды и кликуши",
            "Слово Восьмое: честь для них не дороже скота",
            "Слово Девятое: жизнь среди них - не жизнь",
            "Слово Десятое. Добытое собачьим путем и тратится по-собачьи",
            "Слово Одиннадцатое: воры среди воров",
            "Слово Двенадцатое: невежда в чалме",
            "Слово Тринадцатое: не называй ченого белым, а белого - черным",
            "Слово Четырнадцатое: человек ли он?",
            "Слово Пятнадцатое: чем ты живешь?",
            "Слово Шестнадцатое: притворное вместо истинного",
            "Слово Семнадцатое. Наука и человечьи свойства",
            "Слово Восемнадцатое: возвышение глупца",
            "Слово Девятнадцатое: лучше пасти свинью, которая признает тебя",
            "Слово Двадцатое: блажен глупый и беспечный",
            "Слово Двадцать Первое: хвастун уже не человек",
            "Слово Двадцать Второе: кого уважать среди казахов?",
            "Слово Двадцать Третье: единственные радость и утешение казаха",
            "Слово Двадцать Четвертое: жить, подстерегая друг друга",
            "Слово Двадцать Пятое. Учись русской грамоте",
            "Слово Двадцать Шестое: у казаха нет большего врага, чем другой казах",
            "Слово Двадцать Седьмое. Кто творец и кто твари?",
            "Слово Двадцать Восьмое: Правое дело не может бояться испытания разумом",
            "Слово Двадцать Девятое: пословицы, порожденные ханжеством",
            "Слово Тридцатое: бесстыжему лицу и челюсти неуемные даны",
            "Слово Тридцать Первое: четыре причины и четыре порока",
            "Слово Тридцать Второе. Пути науки",
            "Слово Тридцать Третье: на каждого хитреца есть свой обманщик",
            "Слово Тридцать Четвертое: разве это достойно звания человека?",
            "Слово Тридцать Пятое: суд Божий",
            "Слово Тридцать Шестое: что такое стыд?",
            "Слово Тридцать Седьмое. 23 истины",
            "Слово Тридцать Восьмое. Слова назидания детям",
            "Слово Тридцать Девятое: причины утраты национальных достоинств",
            "Слово Сороковое: откуда ваша нелюбовь?",
            "Слово Сорок Первое: невежество, доставшееся от отцов",
            "Слово Сорок Второе: любовь к безделью",
            "Слово Сорок Третье. Душа и тело",
            "Слово Сорок Четвертое: их стремления",
            "Слово Сорок Пятое: доказательство существования Бога"
    };




    private void changeLanguageToKaz(){


        Toast.makeText(this, "change language to Kaz", Toast.LENGTH_LONG).show();

        LocaleHelper.setLocale(this,"kk"); //kazakh


        Log.i("INFO" ,getResources().getString(R.string.slovo1_title));


        restartActivity();




    }
    private void changeLanguageToRus(){


        Toast.makeText(this, "change language to Rus", Toast.LENGTH_LONG).show();

        LocaleHelper.setLocale(this, "ru"); //russian


        restartActivity();



    }
    private void restartActivity() {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    private AdView mAdView;

//    public void update(ListView results){
//        items = new Array[]
//
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        searchView = findViewById(R.id.search_filter);





        languageButton = findViewById(R.id.language_button);
        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((LocaleHelper.getLanguage(getApplicationContext())).equals("ru")) {
                    changeLanguageToKaz();
                }else
                {
                    changeLanguageToRus();
                }


            }
        });


        listView =  findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 30) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 31) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 32) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 33) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 34) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 35) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 36) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 37) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 38) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 39) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 40) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 41) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 42) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 43) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }
                if (position == 44) {
                    Intent intent = new Intent(view.getContext(), Slovo.class);
                    intent.putExtra("1", position+1);
                    startActivity(intent);
                }


            }
        });
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.my_menu, menu); //inflates my meny xml and displays it in application
//
////        MenuItem menuItem = findViewById(R.id.search_filter);
////        SearchView searchView = (SearchView) menuItem.getActionView();
//
////        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
////            @Override
////            public boolean onQueryTextSubmit(String query) {
////                return false;
////            }
////
////            @Override
////            public boolean onQueryTextChange(String newText) {
////
////                ArrayList<String> results = new ArrayList<String>();
////
////                for (String x: items){
////                    if (x.contains(newText)){
////                        results.add(x);
////                    }
////                }
////
//////                listView.getAdapter().update(results);
////
////
////                return false;
////            }
////        });
//        return super.onCreateOptionsMenu(menu);
//
//    }

}
