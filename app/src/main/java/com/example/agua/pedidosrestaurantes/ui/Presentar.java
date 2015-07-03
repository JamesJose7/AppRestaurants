package com.example.agua.pedidosrestaurantes.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.example.agua.pedidosrestaurantes.R;
import com.example.agua.pedidosrestaurantes.controller.Pedido;

public class Presentar extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentar);

        TextView numero = (TextView) findViewById(R.id.numeroPedido);
        TextView nombre = (TextView) findViewById(R.id.nombrePresentar);
        TextView cedula = (TextView) findViewById(R.id.cedulaPresentar);
        TextView fecha = (TextView) findViewById(R.id.fechaPresentar);
        TextView mesa = (TextView) findViewById(R.id.mesaPresentar);

        //TextViews
        TextView item1 = (TextView) findViewById(R.id.item1Presentar);
        TextView item2 = (TextView) findViewById(R.id.item2Presentar);
        TextView item3 = (TextView) findViewById(R.id.item3Presentar);
        TextView item4 = (TextView) findViewById(R.id.item4Presentar);
        TextView item5 = (TextView) findViewById(R.id.item5Presentar);
        TextView item6 = (TextView) findViewById(R.id.item6Presentar);

        //EditTexts
        TextView cantidad1 = (TextView) findViewById(R.id.cantidad1Presentar);
        TextView cantidad2 = (TextView) findViewById(R.id.cantidad2Presentar);
        TextView cantidad3 = (TextView) findViewById(R.id.cantidad3Presentar);
        TextView cantidad4 = (TextView) findViewById(R.id.cantidad4Presentar);
        TextView cantidad5 = (TextView) findViewById(R.id.cantidad5Presentar);
        TextView cantidad6 = (TextView) findViewById(R.id.cantidad6Presentar);

        Intent intent = getIntent();
        Pedido pedido = intent.getParcelableExtra("pedido");

        numero.setText("Pedido #" + pedido.getNumero());
        nombre.setText(pedido.getNombre());
        cedula.setText(pedido.getCedula() + "");
        fecha.setText(pedido.getFecha());
        mesa.setText(pedido.getMesa() + "");

        //Presentar
        item1.setText(pedido.getItem1());
        item2.setText(pedido.getItem2());
        item3.setText(pedido.getItem3());
        item4.setText(pedido.getItem4());
        item5.setText(pedido.getItem5());
        item6.setText(pedido.getItem6());

        cantidad1.setText(pedido.getCantidad1() + "");
        cantidad2.setText(pedido.getCantidad2() + "");
        cantidad3.setText(pedido.getCantidad3() + "");
        cantidad4.setText(pedido.getCantidad4() + "");
        cantidad5.setText(pedido.getCantidad5() + "");
        cantidad6.setText(pedido.getCantidad6() + "");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_presentar, menu);
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
