package com.br.zup.marvel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioMarvel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<String> listaDePersonagens = new ArrayList<String>();
		System.out.println(listaDePersonagens.isEmpty());

		String nomePersonagem;
		int controleA = 1;
		
		boolean teste1;

		while (controleA == 1) {
			Scanner scanW = new Scanner(System.in);
			System.out.println("");
			System.out.println("Didite 1 para verificar se o personagem ja esta cadastrado");
			System.out.println("Digite 2 para imprimir a lista");
			System.out.println("Digite 3 para alterar personagem");
			System.out.println("Digite 4 para excluir");
			System.out.println("Digite 5 para incluir");
			System.out.println("Digite 6 para sair");
			System.out.println("");

			int verifica = scan.nextInt();

			if (verifica == 1) {

				System.out.println("Digite um personagem Marvel");
				nomePersonagem = scanW.nextLine();
				teste1 = listaDePersonagens.contains(nomePersonagem);

				if (teste1 == true) {
					System.out.println("O personagem " + nomePersonagem + " ja foi incluido na lista");

				} else {
					System.out.println("O personagem " + nomePersonagem + " Não foi encontrado na lista");
					verifica = 1;

				}

			} else if (verifica == 2) {

				System.out.println("Os personagens da lista são: ");
				System.out.println("");
				System.out.println("---------------------------------");
				listaDePersonagens.sort(null);

				for (String string : listaDePersonagens) {
					System.out.println(string);

				}
				System.out.println("---------------------------------");
				System.out.println("");

			} else if (verifica == 3) {

				boolean teste3 = listaDePersonagens.isEmpty();

				if (teste3 == false) {

					System.out.println("Digite o personagem a ser alterado");
					String excluir = scanW.nextLine();

					boolean teste2 = listaDePersonagens.contains(excluir);

					if (teste2 == true) {

						System.out.println("");
						System.out.println("Por qual personagem:");
						String add = scanW.nextLine();

						listaDePersonagens.remove(excluir);
						listaDePersonagens.add(add);

					} else {

						System.out.println("O personegem " + excluir + " nao foi encontrado na lista:");
						System.out.println("");

					}

				} else {
					System.out.println("lista vazia.");

				}

			} else if (verifica == 4) {

				boolean teste3 = listaDePersonagens.isEmpty();

				if (teste3 == false) {

					System.out.println("Digite o personagem que será excluido da lista");
					String excluir = scanW.nextLine();

					boolean teste2 = listaDePersonagens.contains(excluir);

					if (teste2 == true) {

						listaDePersonagens.remove(excluir);

					} else {

						System.out.println("O personegem " + excluir + " nao foi encontrado na lista:");
						System.out.println("");

					}
				} else {
					System.out.println("A lista esta vazia.");

				}

			} else if (verifica == 5) {
				int condicao = 1;

				while (condicao == 1) {

					System.out.println("Digite o nome do personagem: ");
					nomePersonagem = scanW.nextLine();

					boolean teste2 = listaDePersonagens.contains(nomePersonagem);

					if (teste2 == false) {

						listaDePersonagens.add(nomePersonagem);

						System.out.println("O personagem " + nomePersonagem + " Foi adicionado a lista");
						System.out.println("");

					} else {

						System.out.println("O personagem " + nomePersonagem + " Ja foi adicionado na lista:");
						System.out.println("");

					}

					System.out.println("Digite 1 para tentar outro ");
					System.out.println("Ou 0 para voltar para o menu principal");
					condicao = scan.nextInt();

				}

			} else if (verifica == 6) {

				controleA = 0;

			}

		}

		scan.close();
	}

}
