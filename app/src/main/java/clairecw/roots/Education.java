package clairecw.roots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Education extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        lv = (ListView)findViewById(R.id.listView);

        ArrayList<String> titles = new ArrayList<String>();
        ArrayList<String> descriptions = new ArrayList<String>();
        ArrayList<String> urls = new ArrayList<String>();
        ArrayList<String> authors = new ArrayList<String>();

        titles.add("Free English as a Second Language (ESL) classes");
        titles.add("Family Reunification Services");
        titles.add("Legal consultations every Thursday 9:00am-6:00pm");
        titles.add("Application for Employment Authorization");
        titles.add("Mobile Legal Clinic: Berryessa Library");

        descriptions.add("We offer free English as a Second Language (ESL) classes that emphasize speaking and cover United States government, history, and civics, all topics tested during the naturalization interview. ");
        descriptions.add("Our staff assists families with a wide range of family based immigration services, from the petition for alien relatives to consular processing.");
        descriptions.add("Legal services in citizenship, DACA, family immigration, green card renewals, work permits, and citizenship for minors.");
        descriptions.add("Individuals who have been granted certain types of temporary status in the U.S. or who have certain pending applications may apply for employment authorization (EAD or work permit), which gives them permission to work legally in the U.S.");
        descriptions.add("SIREN will have an attorney and a Board of Immigration Appeals (BIA) accredited representative to give free legal consultation to individuals with immigration questions or concerns.");

        authors.add("IIBA San Francisco");
        authors.add("IIBA San Francisco");
        authors.add("SIREN Bay Area");
        authors.add("IIBA San Francisco");
        authors.add("SIREN Bay Area");

        urls.add("");
        urls.add("");
        urls.add("");
        urls.add("");
        urls.add("");

        lv.setAdapter(new PostAdapter(Education.this, titles, urls, descriptions, authors));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long l) {

                Intent intent = new Intent(Education.this, ViewClass.class);
                intent.putExtra("num", "" + position);
                startActivity(intent);

            }


        });
    }
}
