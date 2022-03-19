package edu.upc.eetac.dsa.calculator;

import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CalculatorMainActivity extends AppCompatActivity {
    TextView text;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnSum,btnSub,btnProd,btnDiv,btnRes,btnDel;
    Switch radG;
    Operation op;
    Substraction sub;
    Sum sum;
    Division div;
    Product prod;
    Cosinus cos;
    Sinus sin;
    Tangent tan;
    double n1;
    boolean trig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_main);
        radG = findViewById(R.id.swRadG);
        text = findViewById(R.id.textView);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnProd = findViewById(R.id.btnProd);
        btnDiv = findViewById(R.id.btnDiv);
        btnRes = findViewById(R.id.btnRes);
        btnDel = findViewById(R.id.btnDel);
    }
    public void btn1Click(android.view.View v){
        text.setText(text.getText() + "1");
    }
    public void btn2Click(android.view.View v){
        text.setText(text.getText() + "2");
    }
    public void btn3Click(android.view.View v){
        text.setText(text.getText() + "3");
    }
    public void btn4Click(android.view.View v){
        text.setText(text.getText() + "4");
    }
    public void btn5Click(android.view.View v){
        text.setText(text.getText() + "5");
    }
    public void btn6Click(android.view.View v){
        text.setText(text.getText() + "6");
    }
    public void btn7Click(android.view.View v){
        text.setText(text.getText() + "7");
    }
    public void btn8Click(android.view.View v){
        text.setText(text.getText() + "8");
    }
    public void btn9Click(android.view.View v){
        text.setText(text.getText() + "9");
    }
    public void btn0Click(android.view.View v){
        text.setText(text.getText() + "0");
    }

    public void btnSumClick(android.view.View v){
        op = new Sum();
        sum = (Sum)op;
        n1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void btnDelClick(android.view.View v){
        text.setText(text.getText().toString().substring(0,text.getText().toString().length()-1));
    }
    public void btnSubClick(android.view.View v){
        op = new Substraction();
        sub = (Substraction)op;
        n1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void btnProdClick(android.view.View v){
        op = new Product();
        prod = (Product) op;
        n1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void btnDivClick(android.view.View v){
        op = new Division();
        div = (Division) op;
        n1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void btnCosClick(android.view.View v){
        op = new Cosinus();
        cos = (Cosinus) op;
        trig = true;
    }
    public void btnTanClick(android.view.View v){
        op = new Tangent();
        tan = (Tangent) op;
        trig = true;
    }
    public void btnSinClick(android.view.View v){
        op = new Sinus();
        sin = (Sinus) op;
        trig = true;

    }
    public void btnResClick(android.view.View v){
        double n2;
        if(op==null)
            return;
        if(trig){
            if(radG.isChecked())
                n2 = 1;
            else
                n2 = 0;
            trig = false;
        }
        else
            n2 = Double.parseDouble(text.getText().toString());
        double res = op.operation(n1,n2);
        text.setText(String.valueOf(res));
        //op = null;

    }
}