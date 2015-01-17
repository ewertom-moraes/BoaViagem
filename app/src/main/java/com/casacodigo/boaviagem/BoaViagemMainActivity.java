package com.casacodigo.boaviagem;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class BoaViagemMainActivity extends ActionBarActivity {

    private EditText usuario;
    private EditText senha;

    public void entrarOnClick(View v){

        String usuarioInformado = usuario.getText().toString();
        String senhaInformada   = senha.getText().toString();

        if(usuarioInformado.equals("tom")
                && senhaInformada.equals("senha")){
          startActivity(new Intent(this,DashboardActivity.class));
        }else{
            String mensagemErro = getString(R.string.erro_autenticao);
            Toast toast = Toast.makeText(this, mensagemErro,
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
