package clairecw.roots;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class Login extends AppCompatActivity implements View.OnClickListener, View.OnFocusChangeListener {

    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(this);

        username = (EditText)findViewById(R.id.username);
        username.setTextColor(Color.WHITE);
        username.setOnFocusChangeListener(this);
        password = (EditText)findViewById(R.id.password);
        password.setTextColor(Color.WHITE);
        password.setOnFocusChangeListener(this);
    }

    public void onClick(View v) {


        final Firebase myFirebaseRef = new Firebase("https://branchapp.firebaseio.com/");

        myFirebaseRef.authWithPassword(username.getText().toString(), password.getText().toString(), new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                Intent intent = new Intent(Login.this, PostDashboard.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAuthenticationError(FirebaseError firebaseError) {
                Toast.makeText(Login.this, "Error logging in. Please try again.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onFocusChange(View v, boolean hasFocus) {
        if (!hasFocus) {
            if (username.hasFocus() == false && password.hasFocus() == false) hideKeyboard(v);
        }
    }

    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
