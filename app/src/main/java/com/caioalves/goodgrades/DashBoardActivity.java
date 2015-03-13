package com.caioalves.goodgrades;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class DashBoardActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
    }

    public void selecionarFuncao(View view){
        switch (view.getId()){
            case R.id.novaMateriaButton:
                startActivity(new Intent(this, MateriaActivity.class));
                break;
            case R.id.materiasButton:
                Toast toast;
                toast = Toast.makeText(this, "Minhas matérias", Toast.LENGTH_SHORT);
                toast.show();
                //startActivity(new Intent(this, MateriaActivity.class));
                break;
            case R.id.calculaNotaButton:
                toast = Toast.makeText(this, "Calcular notas", Toast.LENGTH_SHORT);
                toast.show();
                //startActivity(new Intent(this, NotasActivity.class));
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dash_board, menu);
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
