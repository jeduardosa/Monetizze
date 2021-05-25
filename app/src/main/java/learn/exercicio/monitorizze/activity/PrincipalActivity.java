package learn.exercicio.monitorizze.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import learn.exercicio.monitorizze.R;



public class PrincipalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


    }

    public void adicionarDespesa(View view) {
        startActivity(new Intent(this, ReceitasActivity.class));
    }


    public void adicionarReceita(View view) {
        startActivity(new Intent(this, DespesaActivity.class));
    }

}