package ourapp.com.example.work.ouraplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionaMeioAmbiente(View view){
        Intent intent = new Intent(this, MeioAmbiente.class);
        startActivity(intent);
    }

}
