/*
Vacina para alunos de uma escola.
- Determinar quem são os alunos acima de 15 anos de idade para receberem a vacina.
- Entrar o número de alunos.
- Inserir os nomes e idades dos alunos.
- Usar arrays.
 */

import java.util.Scanner;

public class Vacinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número de alunos: ");
        int numAlunos = sc.nextInt();
        String[] aluno = new String[numAlunos];
        int[] idade = new int[numAlunos];
        Scanner scanNome = new Scanner(System.in);
        Scanner scanIdade = new Scanner(System.in);

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Insira o nome do(a) aluno(a): ");
            aluno[i] = scanNome.nextLine();
            System.out.print("Insira a idade do(a) aluno(a): ");
            idade[i] = scanIdade.nextInt();
        }

        for (int i = 0; i < numAlunos; i++) {
            if (idade[i] >= 15) {
                System.out.println(aluno[i] + " pode tomar a vacina.");
            } else {
                System.out.println(aluno[i] + " nâo pode tomar a vacina.");
            }
        }
        sc.close();
        scanNome.close();
        scanIdade.close();

    }
}