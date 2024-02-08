package com.example.conversormoedas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.conversormoedas.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //COMEÇA AQUI

        resultado = findViewById(R.id.txt_resultado);

        Button botaoConverter = findViewById(R.id.btn_converter);
        botaoConverter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                converter();
            }

            private void converter() {
                RadioGroup opcoes = findViewById(R.id.radio_opcoes);
                int selecionada = opcoes.getCheckedRadioButtonId();
                EditText valor = findViewById(R.id.input_valor);

                double valorConvertido = 0.0;

                if (selecionada == R.id.radio_usd) {
                    double valorCalculado = Double.parseDouble(valor.getText().toString());
                    valorConvertido = valorCalculado * 4.87;

                } else if (selecionada == R.id.radio_eur) {
                    double valorCalculado = Double.parseDouble(valor.getText().toString());
                    valorConvertido = valorCalculado * 5.35;

                } else {
                    double valorCalculado = Double.parseDouble(valor.getText().toString());
                    valorConvertido = valorCalculado * 0.0054;
                }

                resultado.setText(String.valueOf(valorConvertido));
                resultado.setVisibility(View.VISIBLE);
            }

        });

    }
}