package clairecw.roots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employment extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employment);

        lv = (ListView)findViewById(R.id.listView);

        ArrayList<String> titles = new ArrayList<String>();
        ArrayList<String> descriptions = new ArrayList<String>();
        ArrayList<String> urls = new ArrayList<String>();
        ArrayList<String> authors = new ArrayList<String>();

        titles.add("Project Engineer");
        titles.add("Evaluation and Learning Manager");
        titles.add("Speech-Language Pathologist");
        titles.add("Interior Designer/Jr. Interior Designer - Stanford Hotels");
        titles.add("Design Quality Assurance Manager Rail Transit");

        descriptions.add("We are looking to for a licensed Project Engineer experienced in structural and seismic design of buildings. Our work culture is enhanced by our diverse staff that nurtures the human spirit. SOHA provides paid vacation and sick days, health insurance, commute subsidy, and 401(k) plan.");
        descriptions.add("First 5 Monterey County (F5MC), also known as the Monterey County Children and Families Commission, was established by the Monterey County Board of Supervisors to promote and implement requirements of The Children and Families Commission Act of 1998 (also known as Proposition 10). Proposition 10 acknowledged a compelling need in California, to create and implement a comprehensive, integrated system of information and services to promote, support, and optimize early childhood development from the prenatal stage to five years of age. The measure is funded through a surtax on cigarette and tobacco based products, in which the proceeds are deposited into a special trust fund. Eighty percent of these funds are allocated to county commissions that develop and implement programs consistent with the goals of the Act. ");
        descriptions.add("Independent pediatric clinic seeking an SLP-CCC to serve children with autism, apraxia, speech, language, social communication, and cognitive disabilities in a bright, modern clinic setting. Opportunity to work as part of a collaborative, interdisciplinary team, which may include teachers, physicians, psychologists, physical and occupational therapists. Ideal candidate is interested in a diversified, manageable case load with amazing in-house support and the flexibility to be creative without an overload of paperwork and red tape. SpeechRighter is a private practice speech-language therapy and learning clinic near the beach in Capitola, serving the county of Santa Cruz. We are warm, close knit team seeking a like-minded SLP.");
        descriptions.add("Stanford Hotels Corporation (corporate office located in San Francisco, CA) is currently looking for an experienced Interior Designer as well as a Junior Interior Designer to join their dynamic team! Stanford Hotels Corporation is a mid-size, owner-operated company that specializes in the development and management of high quality, full service hotels using a variety of franchise brands. Stanford Hotels has 13 properties throughout the U.S. comprising three top global brands including Marriott, Starwood and Hilton.");
        descriptions.add("PGH Wong Engineering, Inc. has a proud and lengthy history of delivering innovative, challenging, and complex projects. From our origin as a two-person systems consulting firm in 1985 in San Francisco, California, PGH Wong is now a full service engineering, architecture, construction management, and program/project management consulting firm for public and private entities across the nation. Responsibilities Serve as the Design Quality Assurance Manager for major rail transit projects.");

        authors.add("Anushka R.");
        authors.add("Shelly M.");
        authors.add("Darrin S.");
        authors.add("Robert Z.");
        authors.add("Sally R.");

        urls.add("http://i.imgur.com/iZYueVR.png");
        urls.add("http://i.imgur.com/iZYueVR.png");
        urls.add("");
        urls.add("");
        urls.add("");

        lv.setAdapter(new PostAdapter(Employment.this, titles, urls, descriptions, authors));
    }
}
