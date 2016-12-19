package co.vd.dv.baseprova;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Tela2 extends AppCompatActivity {


    //Widgets
    private EditText etNome;
    private EditText etIdade;
    private RadioButton rdMasculino;
    private RadioButton rdFeminino;

    private RadioGroup grupoSexo;
    private Button btnCadastrar;

    private CheckBox chPortoAlegre;
    private CheckBox chBaixadaFluminence;
    private CheckBox chBrooklyn;

    private Spinner spSelect;

    private Pessoa pes; //pes>>>>fifa


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        //Refencias
        etNome = (EditText) findViewById(R.id.text_nome_tela2);
        etIdade = (EditText) findViewById(R.id.text_idade_tela2);
        rdMasculino = (RadioButton) findViewById(R.id.rd_masculino_tela2);
        rdFeminino = (RadioButton) findViewById(R.id.rd_feminino_tela2);

        grupoSexo = (RadioGroup) findViewById(R.id.radiogrupo);
        btnCadastrar = (Button) findViewById(R.id.btn_cadastar_tela2);

        chPortoAlegre = (CheckBox) findViewById(R.id.ch_check1);
        chBaixadaFluminence = (CheckBox) findViewById(R.id.ch_check2);
        chBrooklyn = (CheckBox) findViewById(R.id.ch_check3);

        spSelect = (Spinner) findViewById(R.id.spinner);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pes = new Pessoa();

                pes.setNome(etNome.getText().toString());
                pes.setNum(Integer.parseInt(etIdade.getText().toString()));

                if (grupoSexo.getCheckedRadioButtonId() == rdMasculino.getId()) {
                    pes.setSexo(rdMasculino.getText().toString());
                } else {
                    pes.setSexo(rdFeminino.getText().toString());
                }//fecha else

                pes.setSelect(spSelect.getSelectedItem().toString());

               /* if (spSelect.getSelectedItem().toString().equalsIgnoreCase("Selecione")){
                    AlertDialog.Builder msg = new AlertDialog().Builder (Tela2.this);
                    msg.setTitle("Erro");
                }*/


                ArrayList<String> checks = new ArrayList<String>();
                if (chPortoAlegre.isChecked()) {
                    checks.add(chPortoAlegre.getText().toString());
                } else {
                    checks.add("_");
                }
                if (chBaixadaFluminence.isChecked()) {
                    checks.add(chBaixadaFluminence.getText().toString());
                } else {
                    checks.add("_");
                }
                if (chBrooklyn.isChecked()) {
                    checks.add(chBrooklyn.getText().toString());
                } else {
                    checks.add("_");
                }

                pes.setChecks(checks);

                Toast.makeText(getBaseContext(), pes.toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}
