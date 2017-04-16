package ourapp.com.example.work.ouraplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static ourapp.com.example.work.ouraplication.Tarefas.tags;

public class MeioAmbiente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meio_ambiente);

        int indice = 0 ;
        String tagLocal = "Meio ambiente" ;
        Tarefas.addTag();
    }

    public void selecionaDescartes(View view){
        Intent intent = new Intent(this, Descartes.class);
        startActivity(intent);
    }


}
