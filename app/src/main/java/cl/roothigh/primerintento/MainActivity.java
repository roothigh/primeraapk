package cl.roothigh.primerintento;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button send = (Button) findViewById(R.id.Send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Resultados.class);
                TextInputEditText et = (TextInputEditText) findViewById(R.id.StartTime);
                TextInputEditText name = (TextInputEditText) findViewById(R.id.nameEt);
                TextInputEditText ubicacion = (TextInputEditText) findViewById(R.id.UbicacionEv);
                TextInputEditText date = (TextInputEditText) findViewById(R.id.FechaEv);
                TextInputEditText end = (TextInputEditText) findViewById(R.id.FinishTime);

                String result = name.getText().toString() + "\n" + ubicacion.getText().toString() + "\n " + date.getText().toString() + "\n " + et.getText().toString() + "\n" + end.getText().toString() ;
                intent.putExtra("pedrito", result);
                startActivity(intent);
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


}
