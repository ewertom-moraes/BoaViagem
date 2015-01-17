package com.casacodigo.boaviagem;

import android.app.ListActivity;
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


public class GastoListAcivity extends ListActivity implements AdapterView.OnItemClickListener {


    @Override
    public void onItemClick(AdapterView<?> parent, View view,
                                int position, long id) {
         TextView textView = (TextView) view;
         Toast.makeText(this, "Gasto selecionado: " + textView.getText(),
                 Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.gasto_list);

        setListAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, listarGastos()));
        ListView listView = getListView();
        listView.setOnItemClickListener(this);
    }

    private List<String> listarGastos() {

        return Arrays.asList("Sanduiche 19.99",
                "taxi aeroporto - hotel 34.00",
                "revista 12.00");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gasto_list_acivity, menu);
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
