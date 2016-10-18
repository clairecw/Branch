package clairecw.roots;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button enter;
    RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = (Button)findViewById(R.id.button);
        enter.setOnClickListener(this);

        group = (RadioGroup)findViewById(R.id.radioGroup);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        int selectedId = group.getCheckedRadioButtonId();

        if (selectedId == R.id.radioButton3) {
            Intent i = new Intent(MainActivity.this, Registration.class);
            startActivity(i);
            return;
        }

        Intent i = new Intent(MainActivity.this, Dashboard.class);
        if (selectedId == R.id.radioButton2) i.putExtra("tier", "2");
        else if (selectedId == R.id.radioButton) i.putExtra("tier", "1");

        startActivity(i);
    }
}
