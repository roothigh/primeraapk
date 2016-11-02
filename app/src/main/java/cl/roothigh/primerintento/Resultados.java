package cl.roothigh.primerintento;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        final String result = getIntent().getExtras().getString("pedrito");
        Button mailbt = (Button) findViewById(R.id.MailBt);
        mailbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("*/*");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"sebastian.vidal.95@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Contacto");
                intent.putExtra(Intent.EXTRA_TEXT, result);
                startActivity(intent);

            }
        });

        Button whatsapp = (Button) findViewById(R.id.whatBtn);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, result);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });


    }




}
