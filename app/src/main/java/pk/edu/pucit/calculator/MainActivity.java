package pk.edu.pucit.calculator;
import org.mariuszgromada.math.mxparser.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.MutableBoolean;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv_equation = findViewById(R.id.tv_equation);
        final TextView tv_result = findViewById(R.id.tv_result);

        tv_equation.setText("0");
        tv_result.setText("0");
        TextView btn_ac = findViewById(R.id.btn_ac);
        TextView btn_0 = findViewById(R.id.btn_0);
        TextView btn_1 = findViewById(R.id.btn_1);
        TextView btn_2 = findViewById(R.id.btn_2);
        TextView btn_3 = findViewById(R.id.btn_3);
        TextView btn_4 = findViewById(R.id.btn_4);
        TextView btn_5 = findViewById(R.id.btn_5);
        TextView btn_6 = findViewById(R.id.btn_6);
        TextView btn_7 = findViewById(R.id.btn_7);
        TextView btn_8 = findViewById(R.id.btn_8);
        TextView btn_9 = findViewById(R.id.btn_9);
        TextView btn_00 = findViewById(R.id.btn_double0);
        TextView btn_del = findViewById(R.id.btn_del);
        TextView btn_div = findViewById(R.id.btn_div);
        TextView btn_dot = findViewById(R.id.btn_dot);
        TextView btn_mul = findViewById(R.id.btn_mul);
        TextView btn_minus = findViewById(R.id.btn_minus);
        TextView btn_equal = findViewById(R.id.btn_equal);
        TextView btn_percent = findViewById(R.id.btn_percentage);
        TextView btn_plus = findViewById(R.id.btn_plus);
        final boolean[] dotAdded = {false};
        final boolean[] signAdded = {false};

        final View.OnClickListener listener_equal = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = tv_equation.getText().toString();
                for (int i=0; i<tv_equation.toString().length();i++)
                {
                    equation = equation.replace("%","*0.01");
                }
                if (!tv_equation.getText().toString().endsWith(".") && !tv_equation.getText().toString().endsWith("+") && !tv_equation.getText().toString().endsWith("-") && !tv_equation.getText().toString().endsWith("*") && !tv_equation.getText().toString().endsWith("/")) {
                    Expression exp= new Expression(equation);
                    tv_result.setText(""+(exp.calculate())+"");
                }
            }
        };
        btn_equal.setOnClickListener(listener_equal);


        View.OnClickListener listener_ac = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_equation.setText("0");
                tv_result.setText("0");
                dotAdded[0] =false;
                signAdded[0] =false;
            }
        };
        btn_ac.setOnClickListener(listener_ac);

        final View.OnClickListener listener_0 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "0");
                    listener_equal.onClick(v);
                }
                signAdded[0] =false;
            }
        };
        btn_0.setOnClickListener(listener_0);


        View.OnClickListener listener_1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "1");
                } else {
                    tv_equation.setText("1");
                }
                listener_equal.onClick(v);
                signAdded[0] =false;
            }
        };
        btn_1.setOnClickListener(listener_1);

        View.OnClickListener listener_2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "2");
                } else {
                    tv_equation.setText("2");
                }
                listener_equal.onClick(v);
                signAdded[0] =false;
            }
        };
        btn_2.setOnClickListener(listener_2);

        View.OnClickListener listener_3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "3");
                } else {
                    tv_equation.setText("3");
                }
                signAdded[0] =false;
                listener_equal.onClick(v);
            }
        };
        btn_3.setOnClickListener(listener_3);


        View.OnClickListener listener_4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "4");
                } else {
                    tv_equation.setText("4");
                }
                signAdded[0] =false;
                listener_equal.onClick(v);
            }
        };
        btn_4.setOnClickListener(listener_4);


        View.OnClickListener listener_5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "5");
                } else {
                    tv_equation.setText("5");
                }
                signAdded[0] =false;
                listener_equal.onClick(v);
            }
        };
        btn_5.setOnClickListener(listener_5);


        View.OnClickListener listener_6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "6");
                } else {
                    tv_equation.setText("6");
                }
                signAdded[0] =false;
                listener_equal.onClick(v);
            }
        };
        btn_6.setOnClickListener(listener_6);


        View.OnClickListener listener_7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "7");
                } else {
                    tv_equation.setText("7");
                }
                signAdded[0] =false;
                listener_equal.onClick(v);
            }
        };
        btn_7.setOnClickListener(listener_7);


        View.OnClickListener listener_8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "8");
                } else {
                    tv_equation.setText("8");
                }
                signAdded[0] =false;
                listener_equal.onClick(v);
            }
        };
        btn_8.setOnClickListener(listener_8);


        View.OnClickListener listener_9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "9");
                } else {
                    tv_equation.setText("9");
                }
                signAdded[0] =false;
                listener_equal.onClick(v);
            }
        };
        btn_9.setOnClickListener(listener_9);


        View.OnClickListener listener_00 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText() + "00");
                }
                signAdded[0] =false;
                listener_equal.onClick(v);
            }
        };
        btn_00.setOnClickListener(listener_00);


        final View.OnClickListener listener_del = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_equation.getText().toString().endsWith("."))
                {
                    dotAdded[0] = false;
                }
                else if (tv_equation.getText().toString().endsWith("+") || tv_equation.getText().toString().endsWith("-") || tv_equation.getText().toString().endsWith("*") || tv_equation.getText().toString().endsWith("/") || tv_equation.getText().toString().endsWith("%"))
                {
                    signAdded[0]=false;
                }
                if (tv_equation.getText().length()==1)
                {
                    tv_equation.setText("0");
                }
                else if (tv_equation.getText() != "0") {
                    tv_equation.setText(tv_equation.getText().toString().substring(0,tv_equation.getText().toString().length()-1));
                }
                listener_equal.onClick(v);
            }
        };
        btn_del.setOnClickListener(listener_del);

        View.OnClickListener listener_dot = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv_equation.getText().toString().endsWith(".") && !tv_equation.getText().toString().endsWith("+") && !tv_equation.getText().toString().endsWith("-") && !tv_equation.getText().toString().endsWith("*") && !tv_equation.getText().toString().endsWith("/") && !tv_equation.getText().toString().endsWith("%")) {
                    if (!dotAdded[0] && !signAdded[0]) {
                        tv_equation.setText(tv_equation.getText() + ".");
                        dotAdded[0] = true;
                    }
                }
            }
        };
        btn_dot.setOnClickListener(listener_dot);



        View.OnClickListener listener_plus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv_equation.getText().toString().endsWith(".")) {
                    if (tv_equation.getText().toString().endsWith("+") || tv_equation.getText().toString().endsWith("-") || tv_equation.getText().toString().endsWith("*") || tv_equation.getText().toString().endsWith("/") || tv_equation.getText().toString().endsWith("%")) {
                        listener_del.onClick(v);
                    }
                    else {
                        signAdded[0] = true;
                        dotAdded[0] = false;
                    }
                    tv_equation.setText(tv_equation.getText() + "+");

                }
            }
        };
        btn_plus.setOnClickListener(listener_plus);



        View.OnClickListener listener_minus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv_equation.getText().toString().endsWith(".")) {
                    if (tv_equation.getText().toString().endsWith("+") || tv_equation.getText().toString().endsWith("-") || tv_equation.getText().toString().endsWith("*") || tv_equation.getText().toString().endsWith("/") || tv_equation.getText().toString().endsWith("%")) {
                        listener_del.onClick(v);
                    }
                    else {
                        signAdded[0] = true;
                        dotAdded[0] = false;
                    }
                    tv_equation.setText(tv_equation.getText() + "-");
                }
            }
        };
        btn_minus.setOnClickListener(listener_minus);



        View.OnClickListener listener_div= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv_equation.getText().toString().endsWith(".")) {
                    if (tv_equation.getText().toString().endsWith("+") || tv_equation.getText().toString().endsWith("-") || tv_equation.getText().toString().endsWith("*") || tv_equation.getText().toString().endsWith("/") || tv_equation.getText().toString().endsWith("%")) {
                        listener_del.onClick(v);
                    }
                    else {
                        signAdded[0] = true;
                        dotAdded[0] = false;
                    }
                    tv_equation.setText(tv_equation.getText() + "/");
                }
            }
        };
        btn_div.setOnClickListener(listener_div);



        View.OnClickListener listener_mul = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv_equation.getText().toString().endsWith(".")) {
                    if (tv_equation.getText().toString().endsWith("+") || tv_equation.getText().toString().endsWith("-") || tv_equation.getText().toString().endsWith("*") || tv_equation.getText().toString().endsWith("/") || tv_equation.getText().toString().endsWith("%")) {
                        listener_del.onClick(v);
                    }
                    else {
                        signAdded[0] = true;
                        dotAdded[0] = false;
                    }
                    tv_equation.setText(tv_equation.getText() + "*");
                }
            }
        };
        btn_mul.setOnClickListener(listener_mul);



        View.OnClickListener listener_percent = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv_equation.getText().toString().endsWith(".")) {
                    if (tv_equation.getText().toString().endsWith("+") || tv_equation.getText().toString().endsWith("-") || tv_equation.getText().toString().endsWith("*") || tv_equation.getText().toString().endsWith("/") || tv_equation.getText().toString().endsWith("%")) {
                        listener_del.onClick(v);
                    }
                    else {
                        signAdded[0] = true;
                        dotAdded[0] = false;
                    }
                    String[] equations = tv_equation.getText().toString().split("\\+|\\*|/|-");
                    String equationExpression = tv_equation.getText().toString();
                    String lastExpression = equations[equations.length-1];
                    if (equations[equations.length-1].length()==0)
                    {
                        lastExpression = equations[equations.length-2];
                    }
                    double value = Double.parseDouble(lastExpression)*0.01;
                    equationExpression=equationExpression.substring(0,(equationExpression.length()-equations[equations.length-1].length()));
                    equationExpression+=value;
                    tv_equation.setText(equationExpression);
                    listener_equal.onClick(v);
                }
            }
        };
        btn_percent.setOnClickListener(listener_percent);





    }


}