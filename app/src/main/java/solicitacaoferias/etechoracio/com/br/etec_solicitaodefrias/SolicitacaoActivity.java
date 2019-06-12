package solicitacaoferias.etechoracio.com.br.etec_solicitaodefrias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class SolicitacaoActivity extends AppCompatActivity {

    private RadioGroup groupRadio;
    private Button  dtInicio;
    private Spinner qtDias;
    private Button  btnRegistrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacao);
    }
}
