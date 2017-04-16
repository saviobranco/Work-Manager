package ourapp.com.example.work.ouraplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MeioAmbiente_Adm extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meio_ambiente__adm);

        lv = (ListView) findViewById(R.id.lista_tarefas);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Tarefas.tarefas_mostra );
        lv.setAdapter(arrayAdapter);



      // if(Tarefas.meioAmbiente_7_30.size()!=0){
      //     TextView tarefa1 = (TextView)findViewById(R.id.TextView_meioAmbiente_tarefa1);
      //     tarefa1.setText( Tarefas.meioAmbiente_7_30.get(0).get(0));
      // } else{

//       }

        //TextView tarefa2 = (TextView)findViewById(R.id.TextView_meioAmbiente_tarefa2);
        //tarefa2.setText(Tarefas.meioAmbiente_8_00.get(0).get(0));

     }

}
