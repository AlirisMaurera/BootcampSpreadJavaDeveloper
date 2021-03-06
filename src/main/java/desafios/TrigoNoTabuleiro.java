/*
*Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge,
* necessitando de alimentos, perguntou a rainha se o pagamento poderia ser feito em grãos de trigo
* dispostos em um tabuleiro de damas, de forma que o primeiro quadrado tivesse apenas um grão, e os
* quadrados subseqüentes, o dobro do quadrado anterior. A rainha considerou o pagamento barato e
* pediu que o serviço fosse executado, porém, um dos cavaleiros que estava presente e entendia um
*  pouco de matemática alertou-a que seria impossível executar o pagamento, pois a quantidade de
* grão seria muito alta. Curiosa, a rainha solicitou então a este cavaleiro que era bom em cálculo,
* que fizesse um programa que recebesse como entrada o número de quadrados a serem usados em um
* tabuleiro de damas e apresentasse a quantidade de kg de trigo correspondente, sabendo que cada 12
* grãos do cereal correspondem a uma grama. Finalmente, o cálculo da quantidade deverá caber em um
* valor inteiro de 64 bits sem sinal.

Entrada
A primeira linha de entrada contem um único inteiro N (1 ≤ N ≤ 100), indicando o número de casos de
* teste. Cada caso de teste contém um único inteiro X (1 ≤ X ≤ 64), indicando o número de casas do
* tabuleiro que serão utilizadas.

Saída
Para cada caso de teste, imprima a quantidade de kgs de trigo que o monge esperava receber.
* */

package desafios;


import java.math.BigInteger;
import java.util.Scanner;

public class TrigoNoTabuleiro {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int x;

        int n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            x = leitor.nextInt();
            BigInteger kg,graos=new BigInteger("1"), dois = new BigInteger("2");
            BigInteger gramas = new BigInteger("12000");
            for (int j = 0; j <x ; j++) {
                graos = graos.multiply(dois);
            }
            kg = graos.divide(gramas);
            System.out.println(kg + " kg");

        }
        leitor.close();
    }
}
