package id.ac.umn.uts_12003;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}