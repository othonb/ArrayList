package arraylistcollection;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {
        
        // Instancia e cria um ArrayList com Strings
        ArrayList <String> vetorDinamico = new ArrayList <> ();
        
        // Adicionar um elemento ao vetorDinamico
        vetorDinamico.add("Vermelho");
        
        vetorDinamico.add (0, "Azul");
        
        exibeVetorDinamico (vetorDinamico);
        
        vetorDinamico.add (1, "Rosa Choque");
        
        vetorDinamico.add (1, "Bege");
        
        exibeVetorDinamico (vetorDinamico);
    }
    
    private static void exibeVetorDinamico (ArrayList <String> vetor) {
        System.out.print ("vetorDinamico = {");
        
        for (int i = 0; i < vetor.size(); ++ i)
            System.out.printf ("%s%s", vetor.get (i), i == (vetor.size() - 1) ? "" : ", ");
        
        System.out.println ("}");
    }
    
}
