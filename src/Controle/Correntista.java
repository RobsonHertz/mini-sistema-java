package Controle;

public class Correntista {
    private String nome;
    private String cpf;

    public Correntista(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString(){
        return "cpf: "+cpf+" nome: "+nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
