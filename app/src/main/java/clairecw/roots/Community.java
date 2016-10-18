package clairecw.roots;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Community extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        lv = (ListView)findViewById(R.id.listView);

        ArrayList<String> titles = new ArrayList<String>();
        ArrayList<String> descriptions = new ArrayList<String>();
        ArrayList<String> urls = new ArrayList<String>();
        ArrayList<String> authors = new ArrayList<String>();

        titles.add("India Community Center");
        titles.add("Chinese Culture Foundation");
        titles.add("Little Saigon");
        titles.add("Japantown");
        titles.add("Calle 24 Latino Cultural District");

        descriptions.add("");
        descriptions.add("");
        descriptions.add("");
        descriptions.add("");
        descriptions.add("");

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

        lv.setAdapter(new PostAdapter(Community.this, titles, urls, descriptions, authors));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long l) {

                Intent intent = new Intent(Community.this, ViewGroup.class);
                intent.putExtra("num", "" + position);
                startActivity(intent);

            }


        });
    }
}
