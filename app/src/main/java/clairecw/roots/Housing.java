package clairecw.roots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Housing extends AppCompatActivity implements View.OnClickListener {

    ListView lv;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing);

        lv = (ListView)findViewById(R.id.listView);
        search = (Button)findViewById(R.id.search);
        search.setOnClickListener(this);

        ArrayList<String> titles = new ArrayList<String>();
        ArrayList<String> descriptions = new ArrayList<String>();
        ArrayList<String> urls = new ArrayList<String>();
        ArrayList<String> authors = new ArrayList<String>();

        titles.add("D.H. Home, utilities included");
        titles.add("Fully furnished apartment in downtown");
        titles.add("charming 3-room apt, top 2nd floor, sunny");
        titles.add("OPEN HOUSE SUNDAY 11:30AM-12PM Rossi Park w/spacious bonus room");
        titles.add("HUGE 1BR, Amazing Views of GG Bridge");

        descriptions.add("Great home in great location, walking distance to Safeway shopping center, transportation and in the middle of the city. Electricity, gas, water and garbage are included in the rent. View from balcony. Kitchen has all appliances. Washer and dryer. Garage. Garden. Carpeted bedrooms, living room, dining room and hall and stairs. No pets.");
        descriptions.add("Extremely spacious (840sq. ft.), light and modern two bedroom apartment in an exquisitely maintained building. A premier downtown location that can't be beat! Residents enjoy the luxury of a professional security desk available 24/7, their own private fitness center, and wireless high-speed DSL. This location is 'close to everything' in a vibrant urban setting, a community that offers practical luxuries and quality essentials. Conveniently located on Bush Street (cross street Taylor Street), 5 blocks from Union Square, Financial District and China Town. It is an easy walk to theaters, dining, museums, shopping, many other attractions or work.");
        descriptions.add("$2850/ includes water and garbage. One-year lease, then month to month. Charming 3-room apt. Located on top of two-story building. The front door is shared only by the first and second floor tenants. There is a separate door to the 2nd floor apt. which opens up to the living room. The living room has two large closets. It's very sunny. Hardwood floors, in excellent clean condition. There is a separate bedroom with attached bathroom with door, shower/tub. The eat-in kitchen has granite counter tops, dishwasher, gas stove. Small storage room off of kitchen.");
        descriptions.add("This beautiful home is located directly across the street from Rossi Park with park views in Lone Mountain. Easy access to transportation as well as shops and restaurants on Geary and Clement and California Streets. Blocks from Golden Gate Park, UCSF Medical Center. You are in the heart of the city! This lovely home boasts a gorgeous formal living room and formal dining with a decorative fireplace, pitched ceilings and beautiful turn of the century accents throughout. Additionally, the formal dining room has access to charming indoor atrium with sky lights, truly unique. The kitchen has been fully updated with stainless steel appliances, all new cabinetry and includes a lovely breakfast room with built in shelving and a large window looking out to the atrium.");
        descriptions.add("Hi, Welcome to the Marina! Your private bedroom in a 2B/1B apartment has the best location. You will be 1 block from 30x bus and Chariot stop. 3 blocks from Fort Mason Park, close walk to Chestnut street. 5 blocks to Union St shops & 2 blocks to Polk bars & restaurants. Your room is huge and has a view of the Golden Gate Bridge. Also large shared living room and big closets. About Me: 30, Single, F, Straight. Love yoga, hiking, wine and travel. I work in Content/Social Media Marketing and I am downtown Monday-Thursday and work from home on Fridays. My current roommate has lived here 4.5 years and is relocating to Florida. Also I like to volunteer, spend time with friends/family and strive to have a clean home. I have a small dog named Tucker who likes to watch Netflix, go on walks and is potty trained. Our building is very pet friendly. Looking For: working professional age 25-40 who is respectful and open minded.");

        authors.add("Martha S.");
        authors.add("Robert D.");
        authors.add("Dana L.");
        authors.add("Lexa S.");
        authors.add("Susan M.");

        urls.add("http://images.craigslist.org/00X0X_d1VilEti9Yh_600x450.jpg");
        urls.add("http://images.craigslist.org/00W0W_8o4dBnwvZu3_600x450.jpg");
        urls.add("http://images.craigslist.org/00o0o_lXeGRBBIOqT_600x450.jpg");
        urls.add("http://images.craigslist.org/00n0n_7Y4P2A9wmH9_600x450.jpg");
        urls.add("http://images.craigslist.org/01616_98Gnt0Gd6gE_600x450.jpg");

        lv.setAdapter(new PostAdapter(Housing.this, titles, urls, descriptions, authors));
    }

    public void onClick(View v) {
        lv.setVisibility(View.VISIBLE);
    }
}
