package poltekpos.example.com.hitluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtLuas = (TextView) findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int panjang = Integer.parseInt(edtPanjang.getText().toString());
                    int lebar = Integer.parseInt(edtLebar.getText().toString());
                    int luas = panjang * lebar;

                    txtLuas.setText("Luas : "+luas);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}







