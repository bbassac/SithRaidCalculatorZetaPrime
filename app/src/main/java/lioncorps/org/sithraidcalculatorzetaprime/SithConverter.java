package lioncorps.org.sithraidcalculatorzetaprime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SithConverter extends AppCompatActivity {

    public static final int HP_P1 = 46888776;
    public static final int HP_P2 = 52105858;
    public static final int HP_P3 = 38371455;
    public static final int HP_P4 = 34499444;

    DecimalFormat formatter = new DecimalFormat("###,###.###");

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //ajoute les entrées de menu_test à l'ActionBar
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sith_converter);
        EditText dmgP1 = findViewById(R.id.editText2);
        dmgP1.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TextView percentP1 = findViewById(R.id.textView6);
                TextView percentP2 = findViewById(R.id.textView28);
                TextView percentP3 = findViewById(R.id.textView42);
                TextView percentP4 = findViewById(R.id.textView49);

                try {
                    percentP1.setText(formatter.format(Double.parseDouble(s.toString()) * 100 / HP_P1));
                    percentP2.setText(formatter.format(Double.parseDouble(s.toString()) * 100 / HP_P2));
                    percentP3.setText(formatter.format(Double.parseDouble(s.toString()) * 100 / HP_P3));
                    percentP4.setText(formatter.format(Double.parseDouble(s.toString()) * 100 / HP_P4));

                }catch(Exception e){
                    percentP1.setText("");
                }
            }
        });

        EditText percentP1 = findViewById(R.id.editText4);
        percentP1.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TextView damageP1 = findViewById(R.id.textView9);
                TextView damageP2 = findViewById(R.id.textView30);
                TextView damageP3 = findViewById(R.id.textView44);
                TextView damageP4 = findViewById(R.id.textView51);

                try {
                    damageP1.setText(formatter.format(Double.parseDouble(s.toString()) *HP_P1 / 100));
                    damageP2.setText(formatter.format(Double.parseDouble(s.toString()) *HP_P2 / 100));
                    damageP3.setText(formatter.format(Double.parseDouble(s.toString()) *HP_P3 / 100));
                    damageP4.setText(formatter.format(Double.parseDouble(s.toString()) *HP_P4 / 100));

                }catch(Exception e){
                    damageP1.setText("");
                }
            }
        });


    }
}
