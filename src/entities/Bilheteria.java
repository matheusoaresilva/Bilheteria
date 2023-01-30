package Bilheteria.src.entities;

import java.util.ArrayList;
import java.util.List;

public class Bilheteria {

    private List<Shows> showsList =new ArrayList<>();


    public void cadastrarShows(Shows shows){
        this.showsList.add(shows);
    }

    public String consultaShows(){
        String list = " ";
        for (Shows s: showsList) {
            list += showsList;
        }
        return list;
    }

    public void vendasBilhete(Shows shows, Integer qtd){

        if (qtd > shows.getQtdDisponivel()){
            System.out.println("Não há ingressos suficientes disponiveis! \n A quantidade disponivel é: "
            + shows.getQtdDisponivel());
            return;
        }

        int ing = shows.getQtdDisponivel() - qtd; //SUBTRAINDO A QTD
        shows.setQtdDisponivel(ing); //ATUALIZANDO A QTD DE INGRESSOS DISPONIVEIS
        double valorTotal = qtd * shows.getPreco();
        this.showsList.add(shows); //IMPLEMENTANDO REGRA A LISTA
        System.out.println("Valor total da compra: " + valorTotal);

    }


}
