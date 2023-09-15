package sergio.moron.a01_ejemplointroduccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //VARIABLES DE LA INTERFAZ
    private TextView txtContador;
    private Button btnPulsar;

    //VARIABLES PARA LA LÓGICA
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO IRÁ AQUÍ DETRÁS
        inicializar();

        btnPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                txtContador.setText("Pulsado "+contador+" veces");
            }
        });
    }

    private void inicializar() {
        contador = 0;

        txtContador = findViewById(R.id.txtContadorMain);
        btnPulsar =  findViewById(R.id.btnPulsarMain);
    }
}