package ourapp.com.example.work.ouraplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Oleosos extends AppCompatActivity {
    String test;
    ArrayList<String> tags;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oleosos);
    }

    public void criaOleosos07_30(View view) {
        Tarefas.tags.add("Meio Ambiente");
        Tarefas.tags.add("Descartes");
        Tarefas.tags.add("Classe I");
        Tarefas.tags.add("Oleosos");
        Tarefas.tags.add("07:30");
        Tarefas.criaTarefa(Tarefas.meioAmbiente_7_30);
        Tarefas.listaDeTarefas();
        Toast.makeText(this, Tarefas.tarefas_mostra.get(0), Toast.LENGTH_SHORT).show();
    }

    public void criaOleosos08_00(View view) {
        tags = new ArrayList<String>();
        tags.add("Meio Ambiente");
        tags.add("Descarte");
        tags.add("Classe I");
        tags.add("oleosos");
        tags.add("08:00");

        test = "tags: " + tags.get(0) + ", " + tags.get(1) + ", " + tags.get(2) + ", " + tags.get(3) + ", " + tags.get(4);

        Toast.makeText(this, test, Toast.LENGTH_LONG).show();

    }
}