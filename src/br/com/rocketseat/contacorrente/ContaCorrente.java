package br.com.rocketseat.contacorrente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    public Integer numeroConta;
    public Integer agencia;
    public String nome;
    public LocalDate dataNascimento;
    public double saldo;
    public boolean ativo = true;

    public void sacar(double valor){}
    public void transferir(ContaCorrente contaDestino,double valor){}
    public void cancelar(String justificativa){}
    public List<String> consultarExtrato(LocalDate dataInicial, LocalDate datafinal){return new ArrayList<>();}
    public double consultarSaldo(ContaCorrente contaCorrente){return saldo;}
}
