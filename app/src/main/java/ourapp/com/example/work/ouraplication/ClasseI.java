package ourapp.com.example.work.ouraplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ClasseI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe_i);

        int indice = 1 ;
        String tagLocal = "Classe I";
        Tarefas.addTag();
    }

    public void selecionaOleosos(View view){
      Intent intent = new Intent(this,Oleosos.class);
        startActivity(intent);
    }
}
