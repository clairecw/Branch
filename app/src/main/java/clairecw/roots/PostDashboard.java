package clairecw.roots;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PostDashboard extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;
    ImageButton refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_dashboard);

        refresh = (ImageButton)findViewById(R.id.refresh);
        refresh.setOnClickListener(this);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == refresh) {
            Intent i = new Intent(PostDashboard.this, PostDashboard.class);
            startActivity(i);
            finish();
            return;
        }
        if (v == button1) {
            Intent i = new Intent(PostDashboard.this, NewPost.class);
            i.putExtra("type", "housing");
            startActivity(i);
        }
        if (v == button2) {
            Intent i = new Intent(PostDashboard.this, NewPost.class);
            i.putExtra("type", "employment");
            startActivity(i);

        }
        if (v == button3) {
            Intent i = new Intent(PostDashboard.this, NewPost.class);
            i.putExtra("type", "education");
            startActivity(i);

        }
    }

}
