package clairecw.roots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.squareup.picasso.Picasso;

public class Information extends AppCompatActivity implements View.OnClickListener {

    Spinner spnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        spnr = (Spinner)findViewById(R.id.spinner2);
    }

    public void onClick(View v) {

    }
}
