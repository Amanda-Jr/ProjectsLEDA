package atividade02;
import java.util.Scanner;

public class Main {
	
	private static long idFixo = 1;
	

	public static void main(String[] args) throws Exception {
		
		Fila fila = new Fila();
		TabelaHash tab = new TabelaHash();
		AVL avl = new AVL();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gerenciador de Filmes");
		
		System.out.println("\nEscolha a estrutura que deseja utilizar para gerenciar os filmes:"
				+ "\n[1] Fila\n[2] Tabela Hash\n[3] Árvore Binária de Busca \n[0] Sair");
		
		int escolha = sc.nextInt();
		int operacao = 0;
		
		while(escolha>0) {
			switch(escolha) {
				case 1:
					
					System.out.println("\nQual operacao deseja realizar?"
							+ "\n[1] Inserir\n[2] Remover\n[3] Buscar\n[4] Exibir Filmes Ordenados \n[0] Sair");
					
					operacao = sc.nextInt();
					if(operacao == 0) escolha = 0;
					
					switch(operacao) {
						case 1:
							
							System.out.println("Digite o nome do filme");
							String nome = sc.next();
							System.out.println("Digite o ano do filme");
							int ano = sc.nextInt();
							System.out.println("Digite a nota do filme");
							int nota = sc.nextInt();
							long id = idFixo;
						    idFixo++;
						    
						    Filme_IF filmeAdd = new Filme(nome, ano, nota, id);
						    fila.enqueue(filmeAdd);
						    System.out.println("Filme adicionado: " + fila.head());
							
							break;
							
						case 2:
							
							Filme_IF filmeRemov = fila.dequeue();
							System.out.println("Filme removido: " + filmeRemov);
							
							break;
							
						case 3:
							System.out.println("Digite o id do filme que deseja buscar: ");
							long idBuscar = sc.nextLong();
							
							try {
								System.out.println("Filme encontrado: " + fila.search(idBuscar));
								
							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
							
							break;
						
						case 4:
							

							try {
								fila.head();
								
								System.out.println(fila.print());
								
							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
							
							break;
						
					}
					
					break;
					
				case 2:

					System.out.println("\nQual operacao deseja realizar?"
							+ "\n[1] Inserir\n[2] Remover\n[3] Buscar\n[4] Exibir Filmes Ordenados \n[0] Sair");
					
					operacao = sc.nextInt();
					if(operacao == 0) escolha = 0;
					
					switch(operacao) {
						case 1:
							
							System.out.println("Digite o nome do filme");
							String nome = sc.next();
							System.out.println("Digite o ano do filme");
							int ano = sc.nextInt();
							System.out.println("Digite a nota do filme");
							int nota = sc.nextInt();
							long id = idFixo;
						    idFixo++;
						    
						    Filme_IF filmeAdd = new Filme(nome, ano, nota, id);
						    tab.insert(filmeAdd);
						    System.out.println("Filme adicionado: " + tab.search(id));
							
							break;
							
						case 2:
							System.out.println("Digite o id do filme que deseja remover:");
							long idRemov = sc.nextLong();
							Filme_IF filmeRemov = tab.remove(idRemov);
							System.out.println("Filme removido: " + filmeRemov);
							
							break;
							
						case 3:
							System.out.println("Digite o id do filme que deseja buscar: ");
							long idBuscar = sc.nextLong();
							
							try {
								System.out.println("Filme encontrado: " + tab.search(idBuscar));
								
							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
							
							break;
						
						case 4:

							try {
								tab.ordenar();
								
								System.out.println(tab.print());
								
							} catch (Exception e) {
								System.err.println(e.getMessage());
								
							break;
					
						}
							
						break;
					}
					
					case 3:
						System.out.println("\nQual operacao deseja realizar?"
								+ "\n[1] Inserir\n[2] Remover\n[3] Buscar\n[4] Exibir Filmes Ordenados \n[5]Verificar se a Arvore esta completa \n[0] Sair");
						
						operacao = sc.nextInt();
						if(operacao == 0) escolha = 0;
						
						switch(operacao) {
							case 1:
								
								System.out.println("Digite o nome do filme");
								String nome = sc.next();
								System.out.println("Digite o ano do filme");
								int ano = sc.nextInt();
								System.out.println("Digite a nota do filme");
								int nota = sc.nextInt();
								long id = idFixo;
							    idFixo++;
							    
							    Filme_IF filmeAdd = new Filme(nome, ano, nota, id);
							    avl.insert(filmeAdd);
							    System.out.println("Filme adicionado: " + avl.search(id));
								
								break;
								
							case 2:
								System.out.println("Digite o id do filme que deseja remover:");
								long idRemov = sc.nextLong();
								Filme_IF filmeRemov = avl.remove(idRemov);
								System.out.println("Filme removido: " + filmeRemov);
								
								break;
								
							case 3:
								System.out.println("Digite o id do filme que deseja buscar: ");
								long idBuscar = sc.nextLong();
								
								try {
									System.out.println("Filme encontrado: " + avl.search(idBuscar));
									
								} catch (Exception e) {
									System.err.println(e.getMessage());
								}
								
								break;
							
							case 4:

								try {
									Filme_IF[] avlOrdenada = avl.order();
									
									for (Filme_IF f: avlOrdenada){
										System.out.println(f);
									}
									
									
								} catch (Exception e) {
									System.err.println(e.getMessage());	
						
								}
								
								break;
							case 5:
								if(avl.isComplete()) {
									 System.out.println("Arvore Completa");
								} else {
									System.out.println("Arvore Incompleta");
								}
								
								
								break;
						}
								
						break;
									
							
				
			}
			
					
		}
		
		
	}
	

}
