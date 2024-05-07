package principal;

import javax.swing.JOptionPane;
import model.Aluno;

public class Principal {

    Aluno objetoaluno = new Aluno();

    public static void main(String[] args) {
        Aluno objetoaluno = new Aluno();
//Insere um objeto completo de Aluno em MinhaLista
        //objetoaluno.InsertAlunoBD("João",17,"Sistemas",2);
        System.out.println("oi");
        
// Insere um SEGUNDO objeto completo de Aluno em MinhaLista
        //objetoaluno.InsertAlunoBD("elisa", 27, "Engenharia", 3);
        /*System.out.println("\n ##########----------TESTE 2--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
// APAGA um objeto de Aluno em MinhaLista Utilizando o campo ID como referência.
        objetoaluno.DeleteAlunoBD(1);
        System.out.println("\n ##########----------TESTE 3--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());*/
// EDITA um objeto de Aluno dentro de MinhaLista Utilizando o campo ID como referência e mandando outro objeto como modelo.
        objetoaluno.UpdateAlunoBD(2, "Pedro",37,"CCP",4);

    }
}
