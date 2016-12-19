package co.vd.dv.baseprova;

import java.util.ArrayList;

/**
 * Created by †††_David_K9_††† on 12/12/2016.
 */

public class Pessoa {

    private String nome;
    private String sexo;
    private int num;
    private String select;
    private ArrayList<String> checks;


    public Pessoa() {
        checks = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public ArrayList<String> getChecks() {
        return checks;
    }

    public void setChecks(ArrayList<String> checks) {
        this.checks = checks;
    }

    @Override
    public String toString() {
        String x ="";
        for (int i=0;i<checks.size();i++){
                x = x +"\n"+checks.get(i);
        }

        return "Nome: "+nome+
                "\nIdade: "+num+
                "\nSexo:"+sexo+
                "\nChecks:"+x+
                "\nSelect"+select+
                "\nVerificar Sexo: "+sexo;

    }
}
