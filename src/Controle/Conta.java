package Controle;

import Utilidades.Data;

public class Conta {
    private int nroConta;
    private double saldo;
    private Data dataAbertura;
    private Correntista [] correntistas;

    public Conta (int nroConta, Data dataAbertura, Correntista [] correntistas, double montante){
        this.nroConta = nroConta;
        this.dataAbertura = dataAbertura;
        this.correntistas = correntistas;
        this.saldo = montante;
    }
    public String toString(){
        String resposta = "nroConta:" + nroConta +" saldo: "+ saldo + " dataAbertura: " + dataAbertura;
        for (int i=0; i<correntistas.length; i++){
            resposta=resposta+" "+correntistas[i];
        }
        return resposta;
    }

    public boolean fazerDeposito(double montante){
        if (montante>=0){
            saldo = saldo+montante;
            return  true;
        }
            else{
                return false;
        }


    }
    public boolean fazerSaque(double montante){
        if (saldo>montante){
            saldo = saldo - montante;
            return true;
        }
        else {
            return false;
        }

    }
    public double consultaSaldo(){
        return saldo;
    }
    public boolean fazerTransferencia(Conta destino, double montante){

        if(this.fazerSaque(montante)==true){
            destino.fazerDeposito(montante);
            return true;
        }
            else {
                return false;
            }
    }

}
