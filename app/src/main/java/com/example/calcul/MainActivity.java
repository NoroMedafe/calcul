package com.example.calcul;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    EditText a;
    EditText b;
    EditText c;
    EditText d;

    TextView lc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.TextA);
        b = findViewById(R.id.TextB);
        lc = findViewById(R.id.TextResult);
        c = findViewById(R.id.Ttext);
        d = findViewById(R.id.Tdegree);



    }
public Integer tryParseInt(String value)
{
    try {
        return Integer.parseInt(value);
    } catch (NumberFormatException e){
        return 0;
    }
}
    public double tryParseDouble(String value)
    {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e){
            return 0;
        }
    }
    public float tryParseFloat(String value)
    {
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException e){
            return 0;
        }
    }
    public void my_add_click(View v)
    {
        String sa = a.getText().toString();
        String sb = b.getText().toString();
        if (sa.length() ==0 || sb.length()==0)
        {
            message();
        }
        else {
            int a = tryParseInt(sa);
            int b = tryParseInt(sb);
            if (a ==0 || b ==0)
            {
                message();
            }
            else {
                int c = a + b;
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_sub_click(View v)
    {
        String sa = a.getText().toString();
        String sb = b.getText().toString();
        if (sa.length() ==0 || sb.length()==0)
        {
            message();
        }
        else {
            int a = tryParseInt(sa);
            int b = tryParseInt(sb);
            if (a ==0 || b ==0)
            {
                message();

            }
            else {
                int c = a - b;
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_mul_click(View v)
    {
        String sa = a.getText().toString();
        String sb = b.getText().toString();
        if (sa.length() ==0 || sb.length()==0)
        {
            message();
        }
        else {
            int a = tryParseInt(sa);
            int b = tryParseInt(sb);
            if (a ==0 || b ==0)
            {
                message();

            }
            else
            {
                int c = a * b;
                String sc = String.valueOf(c);
                lc.setText(sc);
            }

        }
    }

    public void message()
    {
        AlertDialog.Builder bld = new AlertDialog.Builder(this);
        AlertDialog dlg = bld.create();
        dlg.setTitle("Аккуратно!");
        dlg.setMessage("Вводите нормальные числа!");
        dlg.show();
    }
    public void my_div_click(View v)
    {
        String sa = a.getText().toString();
        String sb = b.getText().toString();
        if (sa.length() ==0 || sb.length()==0)
        {
         message();
        }
        else {

            int a = tryParseInt(sa);
            int b = tryParseInt(sb);
            int c;
            if (a == 0 || b == 0) {
                message();
            } else {
                c = a / b;
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    boolean h,f = false;
    public void Lfloat_click(View v) {
        if (h == false) {
            LinearLayout lin = findViewById(R.id.Lfloat);
            lin.setVisibility(View.VISIBLE);
            LinearLayout num = findViewById(R.id.Pownumber);
            num.setVisibility(View.VISIBLE);
            LinearLayout deg = findViewById(R.id.Ldegree);
            deg.setVisibility(View.VISIBLE);
            h = true;
        }
        else{
            LinearLayout lin = findViewById(R.id.Lfloat);
            lin.setVisibility(View.INVISIBLE);
            LinearLayout num = findViewById(R.id.Pownumber);
            num.setVisibility(View.INVISIBLE);
            LinearLayout deg = findViewById(R.id.Ldegree);
            deg.setVisibility(View.INVISIBLE);
            h = false;
        }
    }
    public void Ltrig_click(View v)
    {
        if(f==false) {
            LinearLayout lin = findViewById(R.id.Ltrig);
            lin.setVisibility(View.VISIBLE);
            LinearLayout num = findViewById(R.id.Pownumber);
            num.setVisibility(View.VISIBLE);
            f = true;
        }
        else{
            LinearLayout lin = findViewById(R.id.Ltrig);
            lin.setVisibility(View.INVISIBLE);
            LinearLayout num = findViewById(R.id.Pownumber);
            num.setVisibility(View.INVISIBLE);
            f = false;
        }
    }
    public void my_fadd_click(View v) {
        String sa = a.getText().toString();
        String sb = b.getText().toString();
        if (sa.length() == 0 || sb.length() == 0) {
            message();
        }
        float a = tryParseFloat(sa);
        float b = tryParseFloat(sb);
        if (a == 0 || b == 0) {
            message();

        }
        else{
            float c = a + b;
            String sc = String.valueOf(c);
            lc.setText(sc);
        }
    }
    public void my_fsub_click(View v) {
        String sa = a.getText().toString();
        String sb = b.getText().toString();
        if (sa.length() == 0 || sb.length() == 0) {
            message();
        }
        else {
            float a = tryParseFloat(sa);
            float b = tryParseFloat(sb);
            if (a == 0 || b == 0) {
                message();

            }
            else{
                float c = a - b;
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_fmult_click(View v) {
        String sa = a.getText().toString();
        String sb = b.getText().toString();
        if (sa.length() == 0 || sb.length() == 0) {
            message();
        }
        else {
            float a = tryParseFloat(sa);
            float b = tryParseFloat(sb);
            if (a == 0 || b == 0) {
                message();

            }
            else{
                float c = a * b;
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_fdiv_click(View v) {
        String sa = a.getText().toString();
        String sb = b.getText().toString();
        if (sa.length() == 0 || sb.length() == 0) {
            message();
        }
        else {
            float a = tryParseFloat(sa);
            float b = tryParseFloat(sb);
            if (a == 0 || b == 0) {
                message();

            }
            else{
                float c = a / b;
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_tsin_click(View v) {
        String sa = c.getText().toString();
        if (sa.length() == 0) {
            message();
        }
        else {
            double a = tryParseDouble(sa);
            if (a == 0) {
                message();

            }
            else{
                double c = Math.sin(a);
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_tcos_click(View v) {
        String sa = c.getText().toString();
        if (sa.length() == 0) {
            message();
        }
        else {
            double a =tryParseDouble(sa);
            if (a == 0) {
                message();

            }
            else{
                double c = Math.cos(a);
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_ttan_click(View v) {
        String sa = c.getText().toString();
        if (sa.length() == 0) {
            message();
        }
        else {
            double a = tryParseDouble(sa);
            if (a == 0) {
                message();

            }
            else{
                double c = Math.tan(a);
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_tsqrt_click(View v) {
        String sa = c.getText().toString();
        if (sa.length() == 0) {
            message();
        }
        else {
            double a = tryParseDouble(sa);
            if (a == 0) {
                message();

            }
            else{
                double c = Math.sqrt(a);
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
    public void my_tpow_click(View v) {
        String sa = c.getText().toString();
        String sd = d.getText().toString();

        if (sa.length() == 0 || sd.length() ==0) {
            message();
        }
        else {
            double a = tryParseDouble(sa);
            double d = Double.parseDouble(sd);

            if (a == 0) {
                message();

            }
            else{
                double c = Math.pow(a,d);
                String sc = String.valueOf(c);
                lc.setText(sc);
            }
        }
    }
}