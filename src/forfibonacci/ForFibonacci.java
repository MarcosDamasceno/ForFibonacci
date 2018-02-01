/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forfibonacci;

/**
 *
 * @author meumd
 */
public class ForFibonacci {

    /**
     * @param args the command line arguments
     * Exercícios Apostila Caelum com 3 variáveis
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fibonacci = 1;
        int numAnterior = 0;
        System.out.print("A série Fibonacci compõe-se dos números: " + numAnterior + ", " + fibonacci + ", ");
        for (int i = 0; fibonacci <= 100; i++) {
            int resultado = numAnterior + fibonacci;
            numAnterior = fibonacci;
            fibonacci = resultado;

            System.out.print(resultado + ", ");

        }
        System.out.print("etc");
        System.out.println("");
    }

}
