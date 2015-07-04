package com.example.agua.pedidosrestaurantes.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.agua.pedidosrestaurantes.R;
import com.example.agua.pedidosrestaurantes.controller.Pedido;

public class Restaurante1 extends ActionBarActivity {

    private final double[] PRECIOS_R1 = {
            1,
            1.25,
            1.5,
            0.5,
            1,
            1.25
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante1);


        setTitle("Comida rapida las pitas");

        Button pedirButton = (Button) findViewById(R.id.pedirButton);
        pedirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre;
                int cedula;
                String fecha;
                int mesa;
                int numero;

                String item1;
                String item2;
                String item3;
                String item4;
                String item5;
                String item6;
                int cantidad1;
                int cantidad2;
                int cantidad3;
                int cantidad4;
                int cantidad5;
                int cantidad6;


                EditText tempEditText;
                TextView tempTextView;

                tempEditText = (EditText) findViewById(R.id.nombre);
                nombre = tempEditText.getText().toString();
                tempEditText = (EditText) findViewById(R.id.cedula);
                cedula = Integer.parseInt(tempEditText.getText().toString());
                tempEditText = (EditText) findViewById(R.id.fecha);
                fecha = tempEditText.getText().toString();
                tempEditText = (EditText) findViewById(R.id.mesa);
                mesa = Integer.parseInt(tempEditText.getText().toString());
                tempEditText = (EditText) findViewById(R.id.numero);
                numero = Integer.parseInt(tempEditText.getText().toString());

                //TextViews
                tempTextView = (TextView) findViewById(R.id.item1);
                item1 = tempTextView.getText().toString();
                tempTextView = (TextView) findViewById(R.id.item2);
                item2 = tempTextView.getText().toString();
                tempTextView = (TextView) findViewById(R.id.item3);
                item3 = tempTextView.getText().toString();
                tempTextView = (TextView) findViewById(R.id.item4);
                item4 = tempTextView.getText().toString();
                tempTextView = (TextView) findViewById(R.id.item5);
                item5 = tempTextView.getText().toString();
                tempTextView = (TextView) findViewById(R.id.item6);
                item6 = tempTextView.getText().toString();

                //EditTexts
                tempEditText = (EditText) findViewById(R.id.cantidad1);
                cantidad1 = Integer.parseInt(tempEditText.getText().toString());
                tempEditText = (EditText) findViewById(R.id.cantidad2);
                cantidad2 = Integer.parseInt(tempEditText.getText().toString());
                tempEditText = (EditText) findViewById(R.id.cantidad3);
                cantidad3 = Integer.parseInt(tempEditText.getText().toString());
                tempEditText = (EditText) findViewById(R.id.cantidad4);
                cantidad4 = Integer.parseInt(tempEditText.getText().toString());
                tempEditText = (EditText) findViewById(R.id.cantidad5);
                cantidad5 = Integer.parseInt(tempEditText.getText().toString());
                tempEditText = (EditText) findViewById(R.id.cantidad6);
                cantidad6 = Integer.parseInt(tempEditText.getText().toString());


                Pedido pedido = new Pedido(numero, nombre, cedula, fecha, mesa, item1,
                        cantidad1, item2, cantidad2, item3, cantidad3, item4, cantidad4, item5, cantidad5, item6, cantidad6, PRECIOS_R1);

                startPresentarActivity(pedido);
            }
        });



    }

    private void startPresentarActivity(Pedido pedido) {
        Intent intent = new Intent(this, Presentar.class);
        intent.putExtra("pedido", pedido);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pedidos, menu);
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
