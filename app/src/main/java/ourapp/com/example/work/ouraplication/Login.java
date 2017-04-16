package ourapp.com.example.work.ouraplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void selecionaUsuario(View view){
        Intent intent = new Intent(this, Usuario.class);
        startActivity(intent);
    }

    public void selecionaAdm(View view){
        Intent intent = new Intent(this, Adm.class);
        startActivity(intent);
    }
}
