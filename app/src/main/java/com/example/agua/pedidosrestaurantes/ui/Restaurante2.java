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

public class Restaurante2 extends ActionBarActivity {

    private final double[] PRECIOS_R2 = {
            1,
            1.25,
            0.75,
            0.5,
            1,
            1.5
    };

    private final String PHONE_NUMBER = "0998473525";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante2);

        setTitle("Cafetería París");

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

                try {
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
                    if (!isEmpty(tempEditText)) {
                        cantidad1 = Integer.parseInt(tempEditText.getText().toString());
                    } else {
                        cantidad1 = 0;
                    }
                    tempEditText = (EditText) findViewById(R.id.cantidad2);
                    if (!isEmpty(tempEditText)) {
                        cantidad2 = Integer.parseInt(tempEditText.getText().toString());
                    } else {
                        cantidad2 = 0;
                    }
                    tempEditText = (EditText) findViewById(R.id.cantidad3);
                    if (!isEmpty(tempEditText)) {
                        cantidad3 = Integer.parseInt(tempEditText.getText().toString());
                    } else {
                        cantidad3 = 0;
                    }
                    tempEditText = (EditText) findViewById(R.id.cantidad4);
                    if (!isEmpty(tempEditText)) {
                        cantidad4 = Integer.parseInt(tempEditText.getText().toString());
                    } else {
                        cantidad4 = 0;
                    }
                    tempEditText = (EditText) findViewById(R.id.cantidad5);
                    if (!isEmpty(tempEditText)) {
                        cantidad5 = Integer.parseInt(tempEditText.getText().toString());
                    } else {
                        cantidad5 = 0;
                    }
                    tempEditText = (EditText) findViewById(R.id.cantidad6);
                    if (!isEmpty(tempEditText)) {
                        cantidad6 = Integer.parseInt(tempEditText.getText().toString());
                    } else {
                        cantidad6 = 0;
                    }

                    Pedido pedido = new Pedido(numero, nombre, cedula, fecha, mesa, item1,
                            cantidad1, item2, cantidad2, item3, cantidad3, item4, cantidad4, item5, cantidad5, item6, cantidad6, PRECIOS_R2);

                    startPresentarActivity(pedido);
                } catch (Exception e) {
                    alertUserAboutError();
                    e.printStackTrace();
                }
            }
        });
    }

    private void startPresentarActivity(Pedido pedido) {
        Intent intent = new Intent(this, Presentar.class);
        intent.putExtra("pedido", pedido);
        intent.putExtra("phone", PHONE_NUMBER);
        startActivity(intent);
    }

    private void alertUserAboutError() {
        AlertDialogFragment dialog = new AlertDialogFragment();
        dialog.show(getFragmentManager(), "error_dialog");
    }

    private boolean isEmpty(EditText editText) {
        if (editText.getText().toString().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_restaurante2, menu);
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
