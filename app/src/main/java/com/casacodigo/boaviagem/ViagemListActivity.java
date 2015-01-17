package com.casacodigo.boaviagem;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;


public class ViagemListActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.viagem_list);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listarViagens()));
        ListView listView = getListView();
        listView.setOnItemClickListener(this);
    }

    private List<String> listarViagens(){
        return Arrays.asList("Sao paulo", "Bonito", "Maceió");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_viagem_list, menu);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //quando uma viagem for clicada na lista de viagens, mostrar os gastos dessa viagem

        TextView textView = (TextView) view;
        String mensagem = "Viagem selecionada: "+ textView.getText();
        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, GastoListAcivity.class));

    }
}
