package com.example.agua.pedidosrestaurantes.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agua.pedidosrestaurantes.R;


public class Inicio extends ActionBarActivity {

    public static final String CODIGO_TAG = "CODIGO";

    private Button mPedidosButton;
    private EditText mInputCodigo;
    private String mCodigoRestaurante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        setTitle("Pedidos");

        mPedidosButton = (Button) findViewById(R.id.pedidosButton);
        mInputCodigo = (EditText) findViewById(R.id.codigoEditText);

        mPedidosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCodigoRestaurante = mInputCodigo.getText().toString();
                if (mCodigoRestaurante.equals("001")) {
                    startRestaurante1Activity(mCodigoRestaurante);
                } else if (mCodigoRestaurante.equals("003")) {
                    startRestaurante2Activity(mCodigoRestaurante);
                } else {
                    Toast.makeText(Inicio.this, "Restaurante incorrecto", Toast.LENGTH_LONG).show();
                }
            }
        });

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


    private void startRestaurante1Activity(String codigo) {
        Intent intent = new Intent(this, Restaurante1.class);
        intent.putExtra(CODIGO_TAG, codigo);
        startActivity(intent);
    }

    private void startRestaurante2Activity(String codigo) {
        Intent intent = new Intent(this, Restaurante2.class);
        intent.putExtra(CODIGO_TAG, codigo);
        startActivity(intent);
    }
}
