
public class Ejercicio2 {

    public void tarea2() {
        int cont = 0;
        int[][] lista = new int[4][4];
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                lista[i][j] = i + j;
            }

        }
        System.out.println("Esta es la lista");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("");
            for (int j = 0; j < lista.length; j++) {
                lista[i][j] = i + j;
                System.out.print(lista[i][j] + " ");
            }
          
        }
        
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                lista[i][j] = i + j;
                if (lista[i][j] != lista[j][i]) {
                    cont++;

                }
               
            }
        } 
        if (cont == 0) {
                    System.out.println("son simetricas");
                    
                }else{
                    System.out.println("no son simetricas");
                }
    }
}
