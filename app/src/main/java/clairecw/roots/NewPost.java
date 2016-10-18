package clairecw.roots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;

public class NewPost extends AppCompatActivity {

    EditText title, description;
    ImageView img;
    final Firebase myFirebaseRef = new Firebase("https://superclassy.firebaseio.com/");
    TextView author;
    Button post;
    AuthData user;
    ImageButton close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);


    }
}
