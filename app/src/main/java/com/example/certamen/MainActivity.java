package com.example.certamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView number1;
    private TextView number2;

    private TextView result;

    private TextView parPrimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (TextView) findViewById(R.id.numero1);

        number2 = (TextView) findViewById(R.id.numero2);

        result = (TextView) findViewById(R.id.resultado);

        parPrimo = (TextView) findViewById(R.id.parPrimo);

        //Botones
        Button btnRandom = (Button) findViewById(R.id.btnGenerar);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Generar 2 numeros randomicos
                int random = (int) (Math.random() * 100);
                int random2 = (int) (Math.random() * 100);

                //Pasar al textView respectivo
                number1.setText(String.valueOf(random));
                number2.setText(String.valueOf(random2));
            }
        });

    }

    public void sumar(View view){
        String valor1 = number1.getText().toString();
        String valor2 = number2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int sum = num1 + num2;

        result.setText(String.valueOf(sum));
    }

    public void restar(View view){
        String valor1 = number1.getText().toString();
        String valor2 = number2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int sum = num1 - num2;

        result.setText(String.valueOf(sum));
    }

    public void limpiar(View view){

        int num1 = 0;

        number1.setText(String.valueOf(num1));
        number2.setText(String.valueOf(num1));
    }

    public void multiplicar(View view){
        String valor1 = number1.getText().toString();
        String valor2 = number2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int sum = num1 * num2;

        result.setText(String.valueOf(sum));
    }

    public void dividir(View view){
        String valor1 = number1.getText().toString();
        String valor2 = number2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if(num2 != 0){
            int sum = num1 / num2;
            result.setText(String.valueOf(sum));
        }
        else{
            result.setText("Error: division por cero");
        }

    }

    public void par(View view){

        if(result.getText() == null){
            result.setText("ERROR");
        }
        else{
            String valor1 = result.getText().toString();

            int num1 = Integer.parseInt(valor1);

            if((num1 % 2) == 0){
                result.setText("ES PAR");
            }
            else{
                result.setText("ES IMPAR");
            }
        }

    }

    public void primo(View view){

        if(result.getText()  == null){
            result.setText("ERROR");
        }
        else{
            String valor = result.getText().toString();
            int num1 = Integer.parseInt(valor);

            if((num1 % num1) == 0 && (num1 % (num1+1)) != 0){
                result.setText("ES PRIMO");
            }
            else{
                result.setText("NO ES PRIMO");
            }
        }

    }
}
