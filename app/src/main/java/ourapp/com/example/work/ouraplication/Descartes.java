package ourapp.com.example.work.ouraplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Descartes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descartes);
    }

    public void selecionaClasseI(View view){
        Intent intent = new Intent(this, ClasseI.class);
        startActivity(intent);
    }
}
