package com.example.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;

    private String anoFormatura;
    private String instituicao;
    private String monografia;
    private String orientador;

    private String atualizacao;
    private String tipoTelefone;
    private String sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

        amb.celularSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (amb.celularSp.getSelectedItem().toString().equals("Adicionar")){
                    amb.celularLl.setVisibility(View.VISIBLE);
                }
                else{
                    amb.celularLl.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        amb.formacaoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(amb.formacaoSp.getSelectedItem().toString().equals("Fundamental") || amb.formacaoSp.getSelectedItem().toString().equals("Médio")){
                    amb.tipoFormacao1.setVisibility(View.VISIBLE);
                    amb.tipoFormacao2.setVisibility(View.GONE);
                    amb.tipoFormacao3.setVisibility(View.GONE);
                }
                else if(amb.formacaoSp.getSelectedItem().toString().equals("Graduação") || amb.formacaoSp.getSelectedItem().toString().equals("Especialização")){
                    amb.tipoFormacao2.setVisibility(View.VISIBLE);
                    amb.tipoFormacao1.setVisibility(View.GONE);
                    amb.tipoFormacao3.setVisibility(View.GONE);
                }
                else if(amb.formacaoSp.getSelectedItem().toString().equals("Mestrado") || amb.formacaoSp.getSelectedItem().toString().equals("Doutorado")){
                    amb.tipoFormacao3.setVisibility(View.VISIBLE);
                    amb.tipoFormacao1.setVisibility(View.GONE);
                    amb.tipoFormacao2.setVisibility(View.GONE);
                }
                else{
                    amb.tipoFormacao1.setVisibility(View.GONE);
                    amb.tipoFormacao2.setVisibility(View.GONE);
                    amb.tipoFormacao3.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        amb.salvarBtn.setOnClickListener(view ->{

            //Verifica checkbox de atualização de oportunidades
            atualizacao = (amb.atualizacaoCb.isChecked())? "Sim" : "Não";

            //Verifica o tipo de telefone
            tipoTelefone = (amb.residencialRb.isChecked())? "Residencial" : "Comercial";

            //Verifica o Sexo da Pessoa
            sexo = (amb.masculinoRb.isChecked())? "Masculino" : "Feminino";

            if(amb.formacaoSp.getSelectedItem().toString().equals("Fundamental") || amb.formacaoSp.getSelectedItem().toString().equals("Médio")){
                Toast.makeText(this, "Nome Completo: " + amb.nomeCompletoEt.getText().toString() + "\n" + "E-mail: " +
                        amb.emailEt.getText().toString() + "\n" + "Deseja receber e-mails com atualização de oportunidades ? " +
                        atualizacao + "\n" + "Telefone: " + amb.telefoneEt.getText().toString() + "\n" + "Tipo do Telefone: " + tipoTelefone + "\n" +
                        "Deseja Adicionar Celular: " + amb.celularSp.getSelectedItem().toString() + "\n" + "Telefone Celular: " + amb.celularEt.getText().toString() + "\n" +
                        "Sexo: " + sexo + "\n" + "Data de Nascimento: " + amb.dataNascimentoEt.getText().toString() + "\n" + "Formação: " +
                        amb.formacaoSp.getSelectedItem().toString() + "\n" + "Ano de Formatura: " + amb.anoFormaturaEt.getText().toString() + "\n" +
                        "Vagas de Interesse: " + amb.vagasInteresseEt.getText().toString(),Toast.LENGTH_SHORT).show();
            }
            else if(amb.formacaoSp.getSelectedItem().toString().equals("Graduação") || amb.formacaoSp.getSelectedItem().toString().equals("Especialização")){
                Toast.makeText(this, "Nome Completo: " + amb.nomeCompletoEt.getText().toString() + "\n" + "E-mail: " +
                        amb.emailEt.getText().toString() + "\n" + "Deseja receber e-mails com atualização de oportunidades ? " +
                        atualizacao + "\n" + "Telefone: " + amb.telefoneEt.getText().toString() + "\n" + "Tipo do Telefone: " + tipoTelefone + "\n" +
                        "Deseja Adicionar Celular: " + amb.celularSp.getSelectedItem().toString() + "\n" + "Telefone Celular: " + amb.celularEt.getText().toString() + "\n" +
                        "Sexo: " + sexo + "\n" + "Data de Nascimento: " + amb.dataNascimentoEt.getText().toString() + "\n" + "Formação: " +
                        amb.formacaoSp.getSelectedItem().toString() + "\n" + "Ano de Conclusão: " + amb.anoConclusaoEt.getText().toString()
                        + "\n" + "Instituição: " + amb.instituicaoEt.getText().toString() + "\n" + "Vagas de Interesse: "
                        + amb.vagasInteresseEt.getText().toString(),Toast.LENGTH_SHORT).show();
            }
            else if(amb.formacaoSp.getSelectedItem().toString().equals("Mestrado") || amb.formacaoSp.getSelectedItem().toString().equals("Doutorado")){
                Toast.makeText(this, "Nome Completo: " + amb.nomeCompletoEt.getText().toString() + "\n" + "E-mail: " +
                        amb.emailEt.getText().toString() + "\n" + "Deseja receber e-mails com atualização de oportunidades ? " +
                        atualizacao + "\n" + "Telefone: " + amb.telefoneEt.getText().toString() + "\n" + "Tipo do Telefone: " + tipoTelefone + "\n" +
                        "Deseja Adicionar Celular: " + amb.celularSp.getSelectedItem().toString() + "\n" + "Telefone Celular: " + amb.celularEt.getText().toString() + "\n" +
                        "Sexo: " + sexo + "\n" + "Data de Nascimento: " + amb.dataNascimentoEt.getText().toString() + "\n" + "Formação: " +
                        amb.formacaoSp.getSelectedItem().toString() + "\n" + "Ano de Conclusão: " + amb.anoConclusao2Et.getText().toString() + "\n"
                        + "Instituição: " + amb.instituicao2Et.getText().toString() + "\n" + "Monografia: " + amb.monografiaEt.getText().toString() +
                        "\n" + "Orientador: " + amb.orientadorEt.getText().toString() + "\n" + "Vagas de Interesse: " + amb.vagasInteresseEt.getText().toString(),Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Nome Completo: " + amb.nomeCompletoEt.getText().toString() + "\n" + "E-mail: " +
                        amb.emailEt.getText().toString() + "\n" + "Deseja receber e-mails com atualização de oportunidades ? " +
                        atualizacao + "\n" + "Telefone: " + amb.telefoneEt.getText().toString() + "\n" + "Tipo do Telefone: " + tipoTelefone + "\n" +
                        "Deseja Adicionar Celular: " + amb.celularSp.getSelectedItem().toString() + "\n" + "Telefone Celular: " + amb.celularEt.getText().toString() + "\n" +
                        "Sexo: " + sexo + "\n" + "Data de Nascimento: " + amb.dataNascimentoEt.getText().toString() + "\n" + "Formação: " +
                        amb.formacaoSp.getSelectedItem().toString() + "\n" + "Vagas de Interesse: " + amb.vagasInteresseEt.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        amb.limparBtn.setOnClickListener(view ->{
            amb.nomeCompletoEt.setText("");
            amb.emailEt.setText("");
            amb.atualizacaoCb.setChecked(false);
            amb.telefoneEt.setText("");
            amb.residencialRb.setChecked(true);
            amb.celularSp.setSelection(0);
            amb.celularEt.setText("");
            amb.masculinoRb.setChecked(true);
            amb.dataNascimentoEt.setText("");
            amb.formacaoSp.setSelection(0);
            amb.anoFormaturaEt.setText("");
            amb.anoConclusaoEt.setText("");
            amb.instituicaoEt.setText("");
            amb.anoConclusao2Et.setText("");
            amb.instituicao2Et.setText("");
            amb.monografiaEt.setText("");
            amb.orientadorEt.setText("");
            amb.vagasInteresseEt.setText("");
        });

    }
}