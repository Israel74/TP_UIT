package com.example.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ListView lista = (ListView) findViewById(R.id.lvContatos);

        ArrayList<String> contatos = preencherLista();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos);
        lista.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencherLista(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Paulo");
        dados.add("João");
        dados.add("Filipe");
        dados.add("Simão");
        return dados;
    }
}
