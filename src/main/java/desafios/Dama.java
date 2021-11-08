/*
*O jogo de xadrez possui várias peças com movimentos curiosos: uma delas é a dama, que pode
* se mover qualquer quantidade de casas na mesma linha, na mesma coluna, ou em uma das duas
* diagonais, conforme exemplifica a figura abaixo:

O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: dada a
* posição de uma dama em um tabuleiro de xadrez vazio (ou seja, um tabuleiro 8 × 8, com 64 casas),
*  de quantos movimentos, no mínimo, ela precisa para chegar em outra casa do tabuleiro?

Kary achou a solução para alguns desses problemas, mas teve dificuldade com outros, e por isso
* pediu que você escrevesse um programa que resolve esse tipo de problema.

Entrada
A entrada contém vários casos de teste. A primeira e única linha de cada caso de teste contém quatro
* inteiros X1, Y1, X2 e Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). A dama começa na casa de coordenadas (X1, Y1),
*  e a casa de destino é a casa de coordenadas(X2, Y2). No tabuleiro, as colunas são numeradas da
* esquerda para a direita de 1 a 8 e as linhas de cima para baixo também de 1 a 8. As coordenadas
* de uma casa na linha X e coluna Y são (X, Y ).

O final da entrada é indicado por uma linha contendo quatro zeros.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo um
* número inteiro, indicando o menor número de movimentos necessários para a dama chegar em sua casa
* de destino.
* */

package desafios;

import java.util.Scanner;

public class Dama {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int X1, Y1, X2, Y2, movimento=0;

        X1 = leitor.nextInt();
        Y1 = leitor.nextInt();
        X2 = leitor.nextInt();
        Y2 = leitor.nextInt();

        while(X1 !=0 && Y1 != 0 && X2 !=0 && Y2 != 0){

            if (X1==X2 && Y1==Y2){
                movimento = 0;
            }else if ((X1%2 == 0 && Y1%2 ==0) || (X1%2 != 0 && Y1%2 !=0)){
                if ((X2%2 == 0 && Y2%2 ==0) || (X2%2 != 0 && Y2%2 !=0)){
                    movimento = 1;
                }else if (X2 == X1 || Y2 ==Y1){
                    movimento = 1;
                }else movimento =2;
            }else if ((X1%2 == 0 && Y1%2 !=0) || (X1%2 != 0 && Y1%2 ==0)){
                if ((X2%2 == 0 && Y2%2 !=0) || (X2%2 != 0 && Y2%2 ==0)){
                    movimento = 1;
                }else if (X2 == X1 || Y2 ==Y1){
                    movimento = 1;
                }else movimento =2;
            }
            System.out.println(movimento);
            X1 = leitor.nextInt();
            Y1 = leitor.nextInt();
            X2 = leitor.nextInt();
            Y2 = leitor.nextInt();
        }
        leitor.close();
        }

    }

