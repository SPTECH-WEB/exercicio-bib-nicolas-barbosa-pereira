package com.school.sptech;

public class Biblioteca {
    private String nome = "Villa Lobos";
    private Double multaDiaria = 20.0;
    private Integer qtdLivros=0;
    private Boolean ativa=true;


    public Biblioteca(String nome, Double multaDiaria) {
        this.nome = nome;
        this.multaDiaria = multaDiaria;
    }

    public void registrarLivro(Integer quantidade){
    if(quantidade != null && quantidade>0 && ativa){
        qtdLivros+=quantidade;
    }
    }

    public Integer emprestar(Integer quantidade){
        if(ativa&&  quantidade!= null&& quantidade > 0&&quantidade <= qtdLivros){
            qtdLivros-=quantidade;
        }else {
            quantidade=null;
        }
        return quantidade;
    }

    public Integer devolver(Integer quantidade){
        if(ativa && quantidade!= null&& quantidade>0){
            qtdLivros+=quantidade;
        }

        return quantidade;
    }

    public Integer desativar(){
        Integer qtdAnterior;
        if(ativa){
            ativa=false;
            qtdAnterior=qtdLivros;
           qtdLivros=0;

        }else{
            return null;
        }
        return qtdAnterior;
    }

    public void transferir(Biblioteca destino, Integer quantidade){
        if(ativa && destino.ativa && quantidade != null && quantidade>0&& quantidade <= qtdLivros){
            qtdLivros-=quantidade;
            destino.qtdLivros+=quantidade;

        }
    }

    public Boolean reajustarMulta(Double percentual){
        if  (percentual != null && percentual>0) {
            multaDiaria+=multaDiaria*percentual;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public Double getMultaDiaria() {
        return multaDiaria;
    }

    public Integer getQtdLivros() {
        return qtdLivros;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
