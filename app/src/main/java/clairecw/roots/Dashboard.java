package clairecw.roots;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;
    int tier = 1;
    ImageButton refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent i = getIntent();
        tier = Integer.parseInt(i.getStringExtra("tier"));

        refresh = (ImageButton)findViewById(R.id.refresh);
        refresh.setOnClickListener(this);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        Picasso.with(this)
                .load(R.drawable.forms)
                .resize(360, 200)
                .centerCrop()
                .into(new Target() {

                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        button1.setBackground(new BitmapDrawable(Dashboard.this.getResources(), bitmap));
                    }

                    @Override
                    public void onBitmapFailed(final Drawable errorDrawable) {
                        Log.d("TAG", "FAILED");
                    }

                    @Override
                    public void onPrepareLoad(final Drawable placeHolderDrawable) {
                        Log.d("TAG", "Prepare Load");
                    }
                });

        Picasso.with(this)
                .load(R.drawable.houses)
                .resize(360, 200)
                .centerCrop()
                .into(new Target() {

                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        button2.setBackground(new BitmapDrawable(Dashboard.this.getResources(), bitmap));
                    }

                    @Override
                    public void onBitmapFailed(final Drawable errorDrawable) {
                        Log.d("TAG", "FAILED");
                    }

                    @Override
                    public void onPrepareLoad(final Drawable placeHolderDrawable) {
                        Log.d("TAG", "Prepare Load");
                    }
                });

        Picasso.with(this)
                .load(R.drawable.work)
                .resize(360, 200)
                .centerCrop()
                .into(new Target() {

                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        button3.setBackground(new BitmapDrawable(Dashboard.this.getResources(), bitmap));
                    }

                    @Override
                    public void onBitmapFailed(final Drawable errorDrawable) {
                        Log.d("TAG", "FAILED");
                    }

                    @Override
                    public void onPrepareLoad(final Drawable placeHolderDrawable) {
                        Log.d("TAG", "Prepare Load");
                    }
                });

        if (tier == 2) {
            button1.setText("Employment");
            button2.setText("Community");
            button3.setText("Education");

            Picasso.with(this)
                    .load(R.drawable.work)
                    .resize(360, 200)
                    .centerCrop()
                    .into(new Target() {

                        @Override
                        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                            button1.setBackground(new BitmapDrawable(Dashboard.this.getResources(), bitmap));
                        }

                        @Override
                        public void onBitmapFailed(final Drawable errorDrawable) {
                            Log.d("TAG", "FAILED");
                        }

                        @Override
                        public void onPrepareLoad(final Drawable placeHolderDrawable) {
                            Log.d("TAG", "Prepare Load");
                        }
                    });

            Picasso.with(this)
                    .load(R.drawable.people)
                    .resize(360, 200)
                    .centerCrop()
                    .into(new Target() {

                        @Override
                        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                            button2.setBackground(new BitmapDrawable(Dashboard.this.getResources(), bitmap));
                        }

                        @Override
                        public void onBitmapFailed(final Drawable errorDrawable) {
                            Log.d("TAG", "FAILED");
                        }

                        @Override
                        public void onPrepareLoad(final Drawable placeHolderDrawable) {
                            Log.d("TAG", "Prepare Load");
                        }
                    });

            Picasso.with(this)
                    .load(R.drawable.classroom)
                    .resize(360, 200)
                    .centerCrop()
                    .into(new Target() {

                        @Override
                        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                            button3.setBackground(new BitmapDrawable(Dashboard.this.getResources(), bitmap));
                        }

                        @Override
                        public void onBitmapFailed(final Drawable errorDrawable) {
                            Log.d("TAG", "FAILED");
                        }

                        @Override
                        public void onPrepareLoad(final Drawable placeHolderDrawable) {
                            Log.d("TAG", "Prepare Load");
                        }
                    });
        }
    }

    public void loadBtnImg(int i, Button b) {

    }

    public void onClick(View v) {
        if (v == refresh) {
            Intent i = new Intent(Dashboard.this, Dashboard.class);
            i.putExtra("tier", "" + tier);
            startActivity(i);
            finish();
            return;
        }
        if (tier == 1) {
            if (v == button1) {
                Intent i = new Intent(Dashboard.this, Information.class);
                startActivity(i);
            }
            if (v == button2) {
                Intent i = new Intent(Dashboard.this, Housing.class);
                startActivity(i);

            }
            if (v == button3) {
                Intent i = new Intent(Dashboard.this, Locations.class);
                startActivity(i);

            }
        }

        if (tier == 2) {
            if (v == button1) {
                Intent i = new Intent(Dashboard.this, Employment.class);
                startActivity(i);

            }
            if (v == button2) {
                Intent i = new Intent(Dashboard.this, Community.class);
                startActivity(i);

            }
            if (v == button3) {
                Intent i = new Intent(Dashboard.this, Education.class);
                startActivity(i);

            }
        }
    }
}
