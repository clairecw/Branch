package clairecw.roots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

public class Locations extends AppCompatActivity implements View.OnClickListener {

    ImageView img;
    Button search;
    RelativeLayout view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);

        img = (ImageView)findViewById(R.id.imageView);
        Picasso.with(this)
                .load(R.drawable.beach)
                .resize(200, 200)
                .centerCrop()
                .into(img);

        search = (Button)findViewById(R.id.search);
        search.setOnClickListener(this);

        view = (RelativeLayout)findViewById(R.id.view);
    }

    public void onClick(View v) {
        view.setVisibility(View.VISIBLE);
    }
}
