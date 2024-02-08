package com.example.imc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.imc.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView resultadoCalculo = findViewById(R.id.txt_resultCalculo);
        TextView resuladoDiagnostico = findViewById(R.id.txt_resultDiagnostico);
        Button botao = findViewById(R.id.btn_calcular);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
            }

            private void calcular() {
                EditText altura = findViewById(R.id.input_altura);
                EditText peso = findViewById(R.id.input_peso);

                double imc = peso / (altura * altura);


                if(imc < 18.5){
                    return "Filezinho!!!";

                }else if(imc < 25){
                    return "Diliça!!!"

                }else if (imc < 30) {
                    return "Ta Top!!!"

                }else{
                    return "Oh la em casa!!!"
                }
            }

                }



            }
        });

    }
}