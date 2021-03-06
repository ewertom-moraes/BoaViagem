package com.casacodigo.boaviagem;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class DashboardActivity extends ActionBarActivity {


    public void selecionarOpcao(View view){

//        TextView textView = (TextView) view;
//        String opcao = "Opção: "+textView.getText().toString();
//        Toast.makeText(this,opcao,Toast.LENGTH_LONG).show();
        // comentario teste
        int id = view.getId();
        switch (id){
            case R.id.nova_viagem :
                startActivity(new Intent(this, ViagemListActivity.class));
                break;
            case R.id.novo_gasto:
                startActivity(new Intent(this, GastoActivity.class));
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
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
