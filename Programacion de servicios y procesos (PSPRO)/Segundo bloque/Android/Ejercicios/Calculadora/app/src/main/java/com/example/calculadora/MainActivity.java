package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int parentesisAbiertos = 0;
    private TextView textOperacion;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOperacion = findViewById(R.id.textOperacion);
        textOperacion.setText("");
        textResultado = findViewById(R.id.textResultado);
        textResultado.setText("");
    }
    public void onBtnClicked(View v) {
        String cadena="";
        String[] arr;
        switch (v.getId()) {
            case R.id.btn0:
                xNumeroantes();
                textOperacion.append("0");
                break;
            case R.id.btn1:
                xNumeroantes();
                textOperacion.append("1");
                break;
            case R.id.btn2:
                xNumeroantes();
                textOperacion.append("2");
                break;
            case R.id.btn3:
                xNumeroantes();
                textOperacion.append("3");
                break;
            case R.id.btn4:
                xNumeroantes();
                textOperacion.append("4");
                break;
            case R.id.btn5:
                xNumeroantes();
                textOperacion.append("5");
                break;
            case R.id.btn6:
                xNumeroantes();
                textOperacion.append("6");
                break;
            case R.id.btn7:
                xNumeroantes();
                textOperacion.append("7");
                break;
            case R.id.btn8:
                xNumeroantes();
                textOperacion.append("8");
                break;
            case R.id.btn9:
                xNumeroantes();
                textOperacion.append("9");
                break;
            case R.id.btnSumar:
                textOperacion.append("+");
                break;
            case R.id.btnRestar:
                if(!textOperacion.getText().equals("")){
                    textOperacion.append("-");
                }
                break;
            case R.id.btnMultiplicacion:
                textOperacion.append("x");
                break;
            case R.id.btnDivision:
                textOperacion.append("/");
                break;
            case R.id.btnPorciento:
                textOperacion.append("%");
                break;
            case R.id.btnParentesis:
                cadena = textOperacion.getText().toString();
                if(!cadena.equals("")) {
                    String ultimaCaracter = String.valueOf(cadena.charAt(cadena.length() - 1));
                    if(ultimaCaracter.matches("\\d") && parentesisAbiertos>0){
                        textOperacion.append(")");
                        parentesisAbiertos--;
                    }
                    else {
                        if(ultimaCaracter.matches("\\d") && parentesisAbiertos==0){
                            textOperacion.append("x(");
                            parentesisAbiertos++;
                        }
                        else{
                            if(ultimaCaracter.equals("(")){
                                textOperacion.append("(");
                                parentesisAbiertos++;
                            }else {
                                if(!ultimaCaracter.matches("\\d") && parentesisAbiertos>0){
                                    textOperacion.append(")");
                                    parentesisAbiertos--;
                                }
                                else{
                                    if(!ultimaCaracter.matches("\\d") && parentesisAbiertos==0){
                                        textOperacion.append("(");
                                        parentesisAbiertos++;
                                    }
                                }
                            }
                        }
                    }
                }
                else{
                    textOperacion.append("(");
                    parentesisAbiertos++;
                }
                break;
            case R.id.btnC:
                textOperacion.setText("");
                textResultado.setText("");
                break;
            case R.id.btnIgual:
                textResultado.setText(Calculadora.calcular(textOperacion.getText().toString()));
                textOperacion.setText("");
                break;
            case R.id.btnComa:
                textOperacion.append(",");
                break;
            case R.id.btnMasMenos:
                cadena = textOperacion.getText().toString();
                if(cadena.equals("")){
                    textOperacion.append("(-");
                }
                else{
                    boolean isNumero = true;
                    arr = cadena.split("");
                    int cont = cadena.length()-1;
                    int splitInicio = -1;

                    while (isNumero){
                        if(arr[cont].matches("\\d") || arr[cont].equals(",")){
                            splitInicio = cont;
                        }
                        else{
                            isNumero = false;
                        }
                        if(cont==0){
                            isNumero=false;
                        }
                        else{
                            cont--;
                        }
                    }
                    if(splitInicio==-1){
                        textOperacion.append("(-");
                    }
                    else
                    {
                        arr[splitInicio] = "(-"+arr[splitInicio];
                        cadena = "";
                        for (String c:arr) {
                            cadena += c;
                        }
                        textOperacion.setText(cadena);
                    }
                    parentesisAbiertos++;
                }
                break;
            default:
                break;
        }
    }

    private void xNumeroantes(){
        String cadena = textOperacion.getText().toString();
        if(!cadena.isEmpty()){
            String ultimaCaracter = String.valueOf(cadena.charAt(cadena.length()-1));
            if(ultimaCaracter.equals(")")){
                textOperacion.append("x");
            }
        }
    }
}