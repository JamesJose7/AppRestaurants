package com.example.agua.pedidosrestaurantes.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.agua.pedidosrestaurantes.R;
import com.example.agua.pedidosrestaurantes.controller.Pedido;

public class Presentar extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentar);

        setTitle("Resumen pedido");

        double precioTotalN = 0;
        int cantidadTotalN = 0;

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

        TextView precio1 = (TextView) findViewById(R.id.precio1Presentar);
        TextView precio2 = (TextView) findViewById(R.id.precio2Presentar);
        TextView precio3 = (TextView) findViewById(R.id.precio3Presentar);
        TextView precio4 = (TextView) findViewById(R.id.precio4Presentar);
        TextView precio5 = (TextView) findViewById(R.id.precio5Presentar);
        TextView precio6 = (TextView) findViewById(R.id.precio6Presentar);

        TextView cantidad1 = (TextView) findViewById(R.id.cantidad1Presentar);
        TextView cantidad2 = (TextView) findViewById(R.id.cantidad2Presentar);
        TextView cantidad3 = (TextView) findViewById(R.id.cantidad3Presentar);
        TextView cantidad4 = (TextView) findViewById(R.id.cantidad4Presentar);
        TextView cantidad5 = (TextView) findViewById(R.id.cantidad5Presentar);
        TextView cantidad6 = (TextView) findViewById(R.id.cantidad6Presentar);

        TextView[] precioViews = {
                precio1,
                precio2,
                precio3,
                precio4,
                precio5,
                precio6
        };

        TextView[] cantidadViews = {
                cantidad1,
                cantidad2,
                cantidad3,
                cantidad4,
                cantidad5,
                cantidad6
        };

        TextView precioTotal = (TextView) findViewById(R.id.precioTotal);
        TextView cantidadTotal = (TextView) findViewById(R.id.cantidadTotal);
        TextView phoneNumber = (TextView) findViewById(R.id.phone_number);

        Intent intent = getIntent();
        Pedido pedido = intent.getParcelableExtra("pedido");

        //Presentar

        numero.setText("Pedido #" + pedido.getNumero());
        nombre.setText(pedido.getNombre());
        cedula.setText(pedido.getCedula() + "");
        fecha.setText(pedido.getFecha());
        mesa.setText(pedido.getMesa() + "");

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

        precio1.setText("$ " + pedido.getPrecios()[0] * pedido.getCantidad1());
        precio2.setText("$ " + pedido.getPrecios()[1] * pedido.getCantidad2());
        precio3.setText("$ " + pedido.getPrecios()[2] * pedido.getCantidad3());
        precio4.setText("$ " + pedido.getPrecios()[3] * pedido.getCantidad4());
        precio5.setText("$ " + pedido.getPrecios()[4] * pedido.getCantidad5());
        precio6.setText("$ " + pedido.getPrecios()[5] * pedido.getCantidad6());

        //Obtener totales
        for (TextView view : precioViews) {
            precioTotalN += getDouble(view.getText().toString());
        }

        for (TextView view : cantidadViews) {
            cantidadTotalN += Double.parseDouble(view.getText().toString());
        }

        precioTotal.setText("$ " + precioTotalN);
        cantidadTotal.setText("" + cantidadTotalN);
        phoneNumber.setText("Pagar a: " + intent.getStringExtra("phone"));

    }

    private Double getDouble(String number) {
        String[] splitString;
        String finalString = "";
        splitString = number.split("\\$");
        for (String character : splitString) {
            finalString += character;
        }
        finalString = finalString.trim();
        //System.out.println("FINAL STRING ====================================> " + finalString);

        return Double.parseDouble(finalString);
    }

    public void enviarPedido(View view) {
        Toast.makeText(this, "Pedido enviado!", Toast.LENGTH_LONG).show();
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
