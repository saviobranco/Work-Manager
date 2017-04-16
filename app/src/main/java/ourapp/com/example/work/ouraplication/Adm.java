package ourapp.com.example.work.ouraplication;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class Adm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm);

    }

    public void selecionaMeioAmbiente_Adm(View view){
        Intent intent = new Intent(this, MeioAmbiente_Adm.class);
        startActivity(intent);
    }
}
