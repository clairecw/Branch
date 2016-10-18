package clairecw.roots;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ViewGroup extends AppCompatActivity implements View.OnClickListener {

    TextView groupName, description, founder;
    String value;
    ImageButton close, refresh;
    ListView lv;
    boolean isMember;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_group);

        lv = (ListView)findViewById(R.id.listView);

        ArrayList<String> titles = new ArrayList<String>();
        ArrayList<String> descriptions = new ArrayList<String>();
        ArrayList<String> urls = new ArrayList<String>();
        ArrayList<String> authors = new ArrayList<String>();

        titles.add("India Community Center");
        titles.add("Chinese Culture Foundation");
        titles.add("Little Saigon");
        titles.add("Japantown");
        titles.add("Latino Cultural District");

        descriptions.add("The India Community Center was conceived as a place where every generation of the Indian Diaspora could find comfort in various facets of their culture, preserve and practice unique traditions and celebrate festivals and social milestones in a welcoming environment. It was also designed to be a center where people of other cultures can explore and experience Indian traditions and values.");
        descriptions.add("The Chinese Cultural Foundation sponsors and co-sponsors cultural and educational programs through art exhibitions, concerts, lectures, documentary films and other media events in New York City and around the world.");
        descriptions.add("Little Saigon is a name given to ethnic enclaves of expatriate Vietnamese mainly in English-speaking free countries. Alternate names include Little Vietnam and Little Hanoi (mainly in historically communist nations), depending on the enclave's political history. Saigon is the former name of the capital of the former South Vietnam, where a large number of first-generation Vietnamese immigrants arriving to the United States originate,[1] whereas Hanoi is the current capital of Vietnam.");
        descriptions.add("The neighborhood that is now Japantown (Nihonmachi) is approximately one mile west of Union Square and is part of San Francisco’s Western Addition, a subdivision that came into being with the writing of the Van Ness Ordinance in 1855. The land then was sandy and barren, and accommodated primarily bobcats, rabbits, quail, and chaparral.In the 1870s, San Franciscans began to move to this area. ");
        descriptions.add("MCCLA’S main objectives to present the best representative sample of contemporary and ancient artistic traditions of Latin America.");

        authors.add("Raj Desai, CEO");
        authors.add("Zhiyuan Cong, Professor");
        authors.add("Alfred Dinh, Resident");
        authors.add("Hikari Ochi, Resident");
        authors.add("Kathy Apodaca, Founder");

        urls.add("https://s3.amazonaws.com/playpass-discovery/production/organizers/logos/712/wide_ICC_logo.png?1452750222");
        urls.add("http://chineseculturalfoundation.org/ESW/Images/CCF-Logo2009x640.jpg");
        urls.add("http://farm6.static.flickr.com/5256/5403171246_2486d1fefc.jpg");
        urls.add("https://upload.wikimedia.org/wikipedia/commons/9/98/Japantown-plaza-14jul2005.jpg");
        urls.add("http://s3-media1.fl.yelpcdn.com/bphoto/GPkBY41L-c9V0fKHDa2NNA/348s.jpg");

        Bundle extras = getIntent().getExtras();
        index = Integer.parseInt(extras.getString("num"));

        close = (ImageButton)findViewById(R.id.close);
        close.setOnClickListener(this);

        refresh = (ImageButton)findViewById(R.id.refresh);
        refresh.setOnClickListener(this);

        groupName = (TextView)findViewById(R.id.groupName);
        description = (TextView)findViewById(R.id.description);
        founder = (TextView)findViewById(R.id.founder);

        groupName.setText(titles.get(index));
        description.setText(descriptions.get(index));
        founder.setText(authors.get(index));


        ArrayList<String> dtitles = new ArrayList<String>();
        ArrayList<String> ddescriptions = new ArrayList<String>();
        ArrayList<String> durls = new ArrayList<String>();
        ArrayList<String> dauthors = new ArrayList<String>();

        durls.add("");
        durls.add("");
        durls.add("");
        durls.add("");
        durls.add("");

        switch(index) {
            case 0:
                dtitles.add("ICC Table Tennis");
                dtitles.add("Teen Leadership Programs");

                ddescriptions.add("The ICC Table Tennis program has been growing exponentially since its launch in 2005. In 10 years it has opened North America's largest dedicated table tennis center and has produced the 2012 USA Olympic team. ");
                ddescriptions.add("ICC's Summer Camp Counselor Program for high school students is in its 10th year. This extraordinary program not only builds leadership but also allows Indo American youth to connect with their heritage. More Details & Apply Now!");
                break;
            case 1:
                dtitles.add("Gala Dinner");
                dtitles.add("Come celebrate the year of the tiger!");

                ddescriptions.add("The Chinese Cultural Foundation with CITIC Industrial Bank and Anda Resorts co-sponsored this special event celebrating the World Economic Forum China Business Summit. ");
                ddescriptions.add("The Chinese Cultural Foundation and Citibank co-sponsored a special Chinese New Year celebration featuring Xinle Ma, one of China's most prominent artists.");
                break;
            case 2:
                dtitles.add("Let's journey through Larkin Street!");

                ddescriptions.add("Venture past the dragons, duck through the Tenderloin’s doorways, and amble along its streets, and you’ll soon feel transported straight from San Francisco to Saigon. ");
                break;
            case 3:
                dtitles.add("Opening of the Kimochi Home was great!");

                ddescriptions.add("Since 1971, Kimochi has provided culturally sensitive, Japanese language-based programs and services to 3,000 Bay Area seniors and their families each year. Services include transportation; referral and outreach services.");
                break;
            case 4:
                dtitles.add("Excited for Carnaval!");
                dtitles.add("Join our Volunteer Staff");

                ddescriptions.add("JOIN MCCLA’S “Arraizando” CARNAVAL CONTINGENT DANCE IN CARNAVAL 2016 As we salute Mother Earth and celebrate 39 years of Arts & Culture in the Mission");
                ddescriptions.add("The MCCLA makes the arts accessiable as an essential element to the community development and well-being. The MCCLA strives to dissiminate and showcase the richness and diversity of Latino Arts by providing support and access to local and emergin artist. We also offer the community an array of culturally relevant and artistic experiences.");
                break;
        }

        dauthors.add("Martha S.");
        dauthors.add("Robert D.");
        dauthors.add("Dana L.");
        dauthors.add("Lexa S.");
        dauthors.add("Susan M.");

        lv.setAdapter(new PostAdapter(ViewGroup.this, dtitles, durls, ddescriptions, dauthors));
    }

    public void onClick(View v) {
        if (v == close) {
            finish();
        }
        if (v == refresh) {
            Intent intent = new Intent(this, ViewGroup.class);
            intent.putExtra("num", "" + index);
            startActivity(intent);
            finish();
        }
    }
}
