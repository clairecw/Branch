package clairecw.roots;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewClass extends AppCompatActivity {

    ArrayList<String> titles = new ArrayList<String>();
    ArrayList<String> descriptions = new ArrayList<String>();
    ArrayList<String> authors = new ArrayList<String>();
    ArrayList<String> urls = new ArrayList<String>();

    ArrayList<String> alltitles = new ArrayList<String>();
    ArrayList<String> alldescriptions = new ArrayList<String>();
    ArrayList<String> allauthors = new ArrayList<String>();
    ArrayList<String> allurls = new ArrayList<String>();

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_class);

        alltitles.add("Free English as a Second Language (ESL) classes");
        alltitles.add("Family Reunification Services");
        alltitles.add("Legal consultations every Thursday 9:00am-6:00pm");
        alltitles.add("Application for Employment Authorization");
        alltitles.add("Mobile Legal Clinic: Berryessa Library");

        alldescriptions.add("We offer free English as a Second Language (ESL) classes that emphasize speaking and cover United States government, history, and civics, all topics tested during the naturalization interview. ");
        alldescriptions.add("Our staff assists families with a wide range of family based immigration services, from the petition for alien relatives to consular processing.");
        alldescriptions.add("Legal services in citizenship, DACA, family immigration, green card renewals, work permits, and citizenship for minors.");
        alldescriptions.add("Individuals who have been granted certain types of temporary status in the U.S. or who have certain pending applications may apply for employment allauthorization (EAD or work permit), which gives them permission to work legally in the U.S.");
        alldescriptions.add("SIREN will have an attorney and a Board of Immigration Appeals (BIA) accredited representative to give free legal consultation to individuals with immigration questions or concerns.");

        allauthors.add("IIBA San Francisco");
        allauthors.add("IIBA San Francisco");
        allauthors.add("SIREN Bay Area");
        allauthors.add("IIBA San Francisco");
        allauthors.add("SIREN Bay Area");

        lv = (ListView)findViewById(R.id.listView);

        Intent i = getIntent();
        int index = Integer.parseInt(i.getStringExtra("num"));

        urls.add("http://imgur.com/eQE1U9l.png");
        urls.add("http://imgur.com/fYbYeuc.png");
        urls.add("http://imgur.com/eQE1U9l.png");
        urls.add("http://imgur.com/eQE1U9l.png");
        urls.add("http://imgur.com/seaKCCh.png");

        switch(index) {
            case 0:
                titles.add("Great class!");
                titles.add("Helpful in learning English as a Second Language");
                titles.add("Mr. Chung's level 2 class was a great help");
                titles.add("Very satisfied with the teachers");
                titles.add("Best English class I've had yet.");

                descriptions.add("I learned enough to get a job.");
                descriptions.add("The teachers were really understanding of everyone's backgrounds.");
                descriptions.add("Mr. Chung was very satisfying.");
                descriptions.add("All of the teachers were very clear and thorough in their teaching style.");
                descriptions.add("I loved the class! Had a great time.");
                break;
            case 1:
                titles.add("Reuniting with Mr. Chung was very satisfying!!");
                titles.add("Process was a little confusing...");
                titles.add("Finally with my family");
                titles.add("Very satisfied with the service");
                titles.add("Best reunification service I've had yet.");

                descriptions.add("I finally got to meet again with my long lost husband!");
                descriptions.add("But the workers were really understanding of everyone's backgrounds.");
                descriptions.add("Finally meeting them after half a year was very satisfying.");
                descriptions.add("All of the workers were very clear and thorough in walking us through the process");
                descriptions.add("I loved the service! Having a great time.");
                break;
            case 2:
                titles.add("Very helpful consulting sessions.");
                titles.add("Great timing");
                titles.add("Mr. Chung's DACA consultation was a great help");
                titles.add("Very satisfied with the legal counselors");
                titles.add("Helped my nephew get to citizen status!");

                descriptions.add("I learned enough to get a job.");
                descriptions.add("I like that they have their doors open almost all day.");
                descriptions.add("Mr. Chung was very satisfying.");
                descriptions.add("All of the counselors were very clear and thorough in their teaching style.");
                descriptions.add("");
                break;
            case 3:
                titles.add("IIBA was very resourceful");
                titles.add("Helpful in finally getting a management position");
                titles.add("Mr. Chung's work permit walkthrough was a great help");
                titles.add("Very satisfied with the workers");
                titles.add("Learned enough to get me a job!");

                descriptions.add("I learned enough to get a job.");
                descriptions.add("The workers gave advice for the application process.");
                descriptions.add("Mr. Chung was very clear in explanation.");
                descriptions.add("All very kind and understanding.");
                descriptions.add("Finally getting settled in.");
                break;
            case 4:
                titles.add("Very helpful consulting sessions.");
                titles.add("Great timing");
                titles.add("Mr. Chung's DACA consultation was a great help");
                titles.add("Very satisfied with the legal counselors");
                titles.add("Helped my nephew get to citizen status!");

                descriptions.add("I learned enough to get a job.");
                descriptions.add("I like that they have their doors open almost all day.");
                descriptions.add("Mr. Chung was very satisfying.");
                descriptions.add("All of the counselors were very clear and thorough in their teaching style.");
                descriptions.add("");
                break;
        }

        authors.add("Martha S.");
        authors.add("Robert D.");
        authors.add("Dana L.");
        authors.add("Lexa S.");
        authors.add("Susan M.");

        TextView title = (TextView)findViewById(R.id.textView11);
        TextView org = (TextView)findViewById(R.id.textView12);
        TextView desc = (TextView)findViewById(R.id.textView13);

        title.setText(alltitles.get(index));
        org.setText(allauthors.get(index));
        desc.setText(alldescriptions.get(index));

        lv.setAdapter(new PostAdapter(ViewClass.this, titles, urls, descriptions, authors));
    }
}
