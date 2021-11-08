/*
* O MacPRONALTS está com uma super promoção, exclusivo para os competidores da primeira Seletiva
* do MaratonaTEC. Só que teve um problema, todos os maratonistas foram tentar comprar ao mesmo tempo,
*  com isso gerou uma fila muito grande. O pior é que a moça do caixa estava sem calculadora ou um
* programa para ajudá-la a calcular com maior agilidade, eis que surge você para fazer um programa
* para ajudar a coitada e aumentar a renda do MacPRONALTS. Segue o cardápio do dia contendo o número
* do produto e seu respectivo valor.

1001 | R$ 1.50

1002 | R$ 2.50

1003 | R$ 3.50

1004 | R$ 4.50

1005 | R$ 5.50

Entrada
A primeira entrada informada é a quantidade de produtos comprados (1 <= p <= 5). Para cada produto
* segue a quantidade (1 <= q <= 500) que o consumidor comprou.

Obs.: não poderão ser informados números de produtos repetidos.

Saída
Você deve imprimir o valor da compra com duas casas decimais.
* */

package desafios;

import java.util.Scanner;

public class MacPronalts {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double total = 0;
        int qteProdutos = leitor.nextInt();

        for (int i = 0; i < qteProdutos; i++) {
            int produto = leitor.nextInt();
            int compra = leitor.nextInt();

            if (produto == 1001){
                total += (1.50*compra);
            }else if (produto == 1002){
                total+= (2.50*compra);
            }else if (produto == 1003){
                total+= (3.50*compra);
            }else if (produto == 1004){
                total+= (4.50*compra);
            }else if (produto == 1005){
                total+= (5.50*compra);
            }

        }
        System.out.printf("%.2f",total);
        leitor.close();
    }
}
