package dominoproj;

import java.util.Scanner;

public class Main {
    public static String input(String title) {
        System.out.print(title);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static boolean checaPedrasIguais(String pedra1, String pedra2, String pedra3, String pedra4, String pedra5) {
        boolean retorno = true;
        // comparação de strings
        if (pedra1.equals(pedra2) || pedra1.equals(pedra3) || pedra1.equals(pedra4) || pedra1.equals(pedra5)
                || pedra2.equals(pedra3) || pedra2.equals(pedra4) || pedra2.equals(pedra5)
                || pedra3.equals(pedra4) || pedra3.equals(pedra5) || pedra4.equals(pedra5)) {
            retorno = false;
        }
        return retorno;
    }

    public static boolean checaPedrasIguaisInvertidas(String pedra1invertida, String pedra2, String pedra2invertida,
            String pedra3, String pedra4, String pedra5) {
        boolean retorno = true;
        // comparação de strings
        if (pedra1invertida.equals(pedra2) || pedra1invertida.equals(pedra3) || pedra1invertida.equals(pedra4) || pedra1invertida.equals(pedra5)
                || pedra2invertida.equals(pedra3) || pedra2invertida.equals(pedra4) || pedra2invertida.equals(pedra5)
                || pedra3.equals(pedra4) || pedra3.equals(pedra5) || pedra4.equals(pedra5)) {
            retorno = false;
        }
        return retorno;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int qtdePlayers;

        while (true) {
            qtdePlayers = Integer.parseInt(input("Quantos jogadores serão? [1 a 5]: "));
            if (qtdePlayers <= 5 && qtdePlayers >= 1) {
                break;
            }

            System.out.println("Quantidade inválida, digite novamente.");
        }

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();

        switch (qtdePlayers) {
            case 1:
                player1.setNome(input("Jogador 1, insira seu nome: "));
                player2.setNome("Bot 1");
                player3.setNome("Bot 2");
                player4.setNome("Bot 3");
                player5.setNome("Bot 4");
                break;
            case 2:
                player1.setNome(input("Jogador 1, insira seu nome: "));
                player2.setNome(input("Jogador 2, insira seu nome: "));
                player3.setNome("Bot 1");
                player4.setNome("Bot 2");
                player5.setNome("Bot 3");
                break;
            case 3:
                player1.setNome(input("Jogador 1, insira seu nome: "));
                player2.setNome(input("Jogador 2, insira seu nome: "));
                player3.setNome(input("Jogador 3, insira seu nome: "));
                player4.setNome("Bot 1");
                player5.setNome("Bot 2");
                break;
            case 4:
                player1.setNome(input("Jogador 1, insira seu nome: "));
                player2.setNome(input("Jogador 2, insira seu nome: "));
                player3.setNome(input("Jogador 3, insira seu nome: "));
                player4.setNome(input("Jogador 4, insira seu nome: "));
                player5.setNome("Bot 1");
                break;
            case 5:
                player1.setNome(input("Jogador 1, insira seu nome: "));
                player2.setNome(input("Jogador 2, insira seu nome: "));
                player3.setNome(input("Jogador 3, insira seu nome: "));
                player4.setNome(input("Jogador 4, insira seu nome: "));
                player5.setNome(input("Jogador 5, insira seu nome: "));
                break;
            
          	
        }
		System.out.print("Qual tipo de pedra você  quer usar?\n[digite 1 para normal\n 2 para ouro\n 3 para diamante] ");
        Scanner tp = new Scanner(System.in);
        int tipo_pedra = tp.nextInt();
		
		
        
        System.out.print("Quantas rodadas você irá jogar (3 a 7)? ");
        Scanner qq = new Scanner(System.in);
        int qtdRodada = qq.nextInt();
    
        if (qtdRodada > 7 || qtdRodada < 3) {
        	System.out.println("Número de rodadas inválido! Escolha entre 3 e 7");
        } else {

	        for (int i = 0; i <= (qtdRodada - 1); i++) {
	            System.out.println("\n-------------------------------------");
	            System.out.println("RODADA " + (i + 1));
	            System.out.println("-------------------------------------");
	
	            while (true) {
	                player1.setValorPontas();
	                player2.setValorPontas();
	                player3.setValorPontas();
	                player4.setValorPontas();
	                player5.setValorPontas();
	                if (checaPedrasIguais(player1.getPedraFormatada(), player2.getPedraFormatada(),
	                        player3.getPedraFormatada(), player4.getPedraFormatada(), player5.getPedraFormatada())) {
	                    if (checaPedrasIguaisInvertidas(player1.getPedraFormatadaInvertida(), player2.getPedraFormatada(),
	                            player2.getPedraFormatadaInvertida(), player3.getPedraFormatada(), player4.getPedraFormatada(), player5.getPedraFormatada())) {
	                        break;
	                    }
	                }
	            }
	
	            System.out.println("Pedra de " + player1.getNome() + ": " + player1.getPedraFormatada());
	            System.out.println("Avaliação da Pedra: " + player1.getValorPedra());
	            System.out.println("\nPedra de " + player2.getNome() + ": " + player2.getPedraFormatada());
	            System.out.println("Avaliação da Pedra: " + player2.getValorPedra());
	            System.out.println("\nPedra de " + player3.getNome() + ": " + player3.getPedraFormatada());
	            System.out.println("Avaliação da Pedra: " + player3.getValorPedra());
	            System.out.println("\nPedra de " + player4.getNome() + ": " + player4.getPedraFormatada());
	            System.out.println("Avaliação da Pedra: " + player4.getValorPedra());
	            System.out.println("\nPedra de " + player5.getNome() + ": " + player5.getPedraFormatada());
	            System.out.println("Avaliação da Pedra: " + player5.getValorPedra());
			if(tipo_pedra==1){
	            if (player1.getValorPedra() > player2.getValorPedra()
	                    && player1.getValorPedra() > player3.getValorPedra()
	                    && player1.getValorPedra() > player4.getValorPedra()
	                    && player1.getValorPedra() > player5.getValorPedra()
	                    && player2.getValorPedra() != player3.getValorPedra()
	                    && player2.getValorPedra() != player4.getValorPedra()
	                    && player2.getValorPedra() != player5.getValorPedra()
	                    && player3.getValorPedra() != player2.getValorPedra() 
	                    && player3.getValorPedra() != player4.getValorPedra()
	                    && player3.getValorPedra() != player5.getValorPedra()
	                    && player4.getValorPedra() != player2.getValorPedra()
	                    && player4.getValorPedra() != player3.getValorPedra()
	                    && player4.getValorPedra() != player5.getValorPedra()
	                    && player5.getValorPedra() != player2.getValorPedra()
	                    && player5.getValorPedra() != player3.getValorPedra()
	                    && player5.getValorPedra() != player4.getValorPedra()) {
	
	                player1.setPontos(i, 3);
	
	                if (player2.getValorPedra() > player3.getValorPedra()
	                		&& player2.getValorPedra() > player4.getValorPedra()
	                		&& player2.getValorPedra() > player5.getValorPedra()) {
	                    player2.setPontos(i, 2);
	                    player3.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                    
	                } else if (player3.getValorPedra() > player2.getValorPedra()
	                		&& player3.getValorPedra() > player4.getValorPedra()
	                		&& player3.getValorPedra() > player5.getValorPedra()){
	                    player3.setPontos(i, 2);
	                    player2.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                    
	                } else if (player4.getValorPedra() > player2.getValorPedra()
	                		&& player4.getValorPedra() > player3.getValorPedra()
	                		&& player4.getValorPedra() > player5.getValorPedra()) {
	                	player4.setPontos(i, 2);
	                	player3.setPontos(i, 1);
	                	player2.setPontos(i, 1);
	                	player5.setPontos(i, 1);
	                	
	                } else if (player5.getValorPedra() > player2.getValorPedra()
	                		&& player5.getValorPedra() > player3.getValorPedra()
	                		&& player5.getValorPedra() > player4.getValorPedra()) {
	                	player5.setPontos(i, 2);
	                	player2.setPontos(i, 1);
	                	player3.setPontos(i, 1);
	                	player4.setPontos(i, 1);
	                }
	
	            } else if (player2.getValorPedra() > player1.getValorPedra()
	                    && player2.getValorPedra() > player3.getValorPedra()
	                    && player2.getValorPedra() > player4.getValorPedra()
	                    && player2.getValorPedra() > player5.getValorPedra()
	                    && player1.getValorPedra() != player3.getValorPedra()
	                    && player1.getValorPedra() != player4.getValorPedra()
	                    && player1.getValorPedra() != player5.getValorPedra()
	                    && player3.getValorPedra() != player1.getValorPedra()
	                    && player3.getValorPedra() != player4.getValorPedra()
	                    && player3.getValorPedra() != player5.getValorPedra()
	                    && player4.getValorPedra() != player1.getValorPedra()
	                    && player4.getValorPedra() != player3.getValorPedra()
	                    && player4.getValorPedra() != player5.getValorPedra()
	                    && player5.getValorPedra() != player1.getValorPedra()
	                    && player5.getValorPedra() != player3.getValorPedra()
	                    && player5.getValorPedra() != player4.getValorPedra()) {
	
	                player2.setPontos(i, 3);
	                
	                if (player1.getValorPedra() > player3.getValorPedra()
	                		&& player1.getValorPedra() > player4.getValorPedra()
	                		&& player1.getValorPedra() > player5.getValorPedra()) {
	                    player1.setPontos(i, 2);
	                    player3.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                    
	                } else if (player3.getValorPedra() > player1.getValorPedra()
	                		&& player3.getValorPedra() > player4.getValorPedra()
	                		&& player3.getValorPedra() > player5.getValorPedra()){
	                    player3.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                    
	                } else if (player4.getValorPedra() > player1.getValorPedra()
	                		&& player4.getValorPedra() > player3.getValorPedra()
	                		&& player4.getValorPedra() > player5.getValorPedra()){
	                    player4.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player3.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                    
	                } else if (player5.getValorPedra() > player1.getValorPedra()
	                		&& player5.getValorPedra() > player3.getValorPedra()
	                		&& player5.getValorPedra() > player4.getValorPedra()){
	                    player5.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player3.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                }
	                
	            } else if (player3.getValorPedra() > player1.getValorPedra()
	                    && player3.getValorPedra() > player2.getValorPedra()
	                    && player3.getValorPedra() > player4.getValorPedra()
	                    && player3.getValorPedra() > player5.getValorPedra()
	                    && player1.getValorPedra() != player2.getValorPedra()
	                    && player1.getValorPedra() != player4.getValorPedra()
	                    && player1.getValorPedra() != player5.getValorPedra()
	                    && player2.getValorPedra() != player1.getValorPedra()
	                    && player2.getValorPedra() != player4.getValorPedra()
	                    && player2.getValorPedra() != player5.getValorPedra()
	                    && player4.getValorPedra() != player1.getValorPedra()
	                    && player4.getValorPedra() != player2.getValorPedra()
	                    && player4.getValorPedra() != player5.getValorPedra()
	                    && player5.getValorPedra() != player1.getValorPedra()
	                    && player5.getValorPedra() != player2.getValorPedra()
	                    && player5.getValorPedra() != player4.getValorPedra()) {
	
	                player3.setPontos(i, 3);
	                
	                if (player1.getValorPedra() > player2.getValorPedra()
	                		&& player1.getValorPedra() > player4.getValorPedra()
	                		&& player1.getValorPedra() > player5.getValorPedra()) {
	                    player1.setPontos(i, 2);
	                    player2.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                    
	                } else if (player2.getValorPedra() > player1.getValorPedra()
	                		&& player2.getValorPedra() > player4.getValorPedra()
	                		&& player2.getValorPedra() > player5.getValorPedra()){
	                    player2.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                    
	                } else if (player4.getValorPedra() > player1.getValorPedra()
	                		&& player4.getValorPedra() > player2.getValorPedra()
	                		&& player4.getValorPedra() > player5.getValorPedra()) {
	                	player4.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player2.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                    
	                } else if (player5.getValorPedra() > player1.getValorPedra()
	                		&& player5.getValorPedra() > player2.getValorPedra()
	                		&& player5.getValorPedra() > player4.getValorPedra()) {
	                	player5.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player2.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                } 
	            } else if (player4.getValorPedra() > player1.getValorPedra()
	                    && player4.getValorPedra() > player2.getValorPedra()
	                    && player4.getValorPedra() > player3.getValorPedra()
	                    && player4.getValorPedra() > player5.getValorPedra()
	                    && player1.getValorPedra() != player2.getValorPedra()
	                    && player1.getValorPedra() != player3.getValorPedra()
	                    && player1.getValorPedra() != player5.getValorPedra()
	                    && player2.getValorPedra() != player1.getValorPedra()
	                    && player2.getValorPedra() != player3.getValorPedra()
	                    && player2.getValorPedra() != player5.getValorPedra()
	                    && player3.getValorPedra() != player1.getValorPedra()
	                    && player3.getValorPedra() != player2.getValorPedra()
	                    && player3.getValorPedra() != player5.getValorPedra()
	                    && player5.getValorPedra() != player1.getValorPedra()
	                    && player5.getValorPedra() != player2.getValorPedra()
	                    && player5.getValorPedra() != player3.getValorPedra()) {
	            	
	            	 player4.setPontos(i, 3);
	            	 
	            	 if (player1.getValorPedra() > player2.getValorPedra()
	                 		&& player1.getValorPedra() > player3.getValorPedra()
	                 		&& player1.getValorPedra() > player5.getValorPedra()) {
	            		 player1.setPontos(i, 2);
	                     player2.setPontos(i, 1);
	                     player3.setPontos(i, 1);
	                     player5.setPontos(i, 1);
	                     
	            	 } else if (player2.getValorPedra() > player1.getValorPedra()
	                  		&& player2.getValorPedra() > player3.getValorPedra()
	                  		&& player2.getValorPedra() > player5.getValorPedra()) {
	            		 player2.setPontos(i, 2);
	                     player1.setPontos(i, 1);
	                     player3.setPontos(i, 1);
	                     player5.setPontos(i, 1);
	                     
	            	 } else if (player3.getValorPedra() > player1.getValorPedra()
	                   		&& player3.getValorPedra() > player2.getValorPedra()
	                   		&& player3.getValorPedra() > player5.getValorPedra()) {
	             		 player3.setPontos(i, 2);
	                     player1.setPontos(i, 1);
	                     player2.setPontos(i, 1);
	                     player5.setPontos(i, 1);
	                     
	            	 } else if (player5.getValorPedra() > player1.getValorPedra()
	                    	&& player5.getValorPedra() > player2.getValorPedra()
	                       	&& player5.getValorPedra() > player3.getValorPedra()) {
	            		 player5.setPontos(i, 2);
	                     player1.setPontos(i, 1);
	                     player2.setPontos(i, 1);
	                     player3.setPontos(i, 1);
	            	 }
	            
	            } else if (player5.getValorPedra() > player1.getValorPedra()
	                    && player5.getValorPedra() > player2.getValorPedra()
	                    && player5.getValorPedra() > player3.getValorPedra()
	                    && player5.getValorPedra() > player4.getValorPedra()
	                    && player1.getValorPedra() != player2.getValorPedra()
	                    && player1.getValorPedra() != player3.getValorPedra()
	                    && player1.getValorPedra() != player4.getValorPedra()
	                    && player2.getValorPedra() != player1.getValorPedra()
	                    && player2.getValorPedra() != player3.getValorPedra()
	                    && player2.getValorPedra() != player4.getValorPedra()
	                    && player3.getValorPedra() != player1.getValorPedra()
	                    && player3.getValorPedra() != player2.getValorPedra()
	                    && player3.getValorPedra() != player4.getValorPedra()
	                    && player4.getValorPedra() != player1.getValorPedra()
	                    && player4.getValorPedra() != player2.getValorPedra()
	                    && player4.getValorPedra() != player3.getValorPedra()) {
	            	
	            	player5.setPontos(i, 3);
	            	
	            	if (player1.getValorPedra() > player2.getValorPedra()
	                 		&& player1.getValorPedra() > player3.getValorPedra()
	                 		&& player1.getValorPedra() > player4.getValorPedra()) {
	            		player1.setPontos(i, 2);
	                    player2.setPontos(i, 1);
	                    player3.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    
	            	} else if (player2.getValorPedra() > player1.getValorPedra()
	                 		&& player2.getValorPedra() > player3.getValorPedra()
	                 		&& player2.getValorPedra() > player4.getValorPedra()) {
	            		player2.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player3.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    
	            	} else if (player3.getValorPedra() > player1.getValorPedra()
	                 		&& player3.getValorPedra() > player2.getValorPedra()
	                 		&& player3.getValorPedra() > player4.getValorPedra()) {
	            		player3.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player2.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    
	            	} else if (player4.getValorPedra() > player1.getValorPedra()
	                 		&& player4.getValorPedra() > player2.getValorPedra()
	                 		&& player4.getValorPedra() > player3.getValorPedra()) {
	            		player4.setPontos(i, 2);
	                    player1.setPontos(i, 1);
	                    player2.setPontos(i, 1);
	                    player3.setPontos(i, 1);
	            	}
	            	
	            } else {
	                if (player1.getValorPedra() == player2.getValorPedra()) {
	                    if (player1.getValorPedra() > player3.getValorPedra()
	                    		&& player1.getValorPedra() > player4.getValorPedra()
	                    		&& player1.getValorPedra() > player5.getValorPedra()) {
	                        player1.setPontos(i, 3);
	                        player2.setPontos(i, 3);
	                        player3.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    } else {
	                    	 player1.setPontos(i, 3);
	                         player2.setPontos(i, 2);
	                         player3.setPontos(i, 1);
	                         player4.setPontos(i, 1);
	                         player5.setPontos(i, 1);
	                    }
	                        
	                } else if (player1.getValorPedra() == player3.getValorPedra()) {
	                    if (player1.getValorPedra() > player2.getValorPedra()
	                    		&& player1.getValorPedra() > player4.getValorPedra()
	                    		&& player1.getValorPedra() > player5.getValorPedra()) {
	                    	player1.setPontos(i, 3);
	                        player3.setPontos(i, 3);
	                        player2.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    } else {
	                    	player1.setPontos(i, 3);
	                        player3.setPontos(i, 2);
	                        player2.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    }
	                    
	                } else if (player1.getValorPedra() == player4.getValorPedra()){
	                	if (player1.getValorPedra() > player2.getValorPedra()
	                     		&& player1.getValorPedra() > player3.getValorPedra()
	                     		&& player1.getValorPedra() > player5.getValorPedra()) {
	                     	player1.setPontos(i, 3);
	                        player4.setPontos(i, 3);
	                        player2.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                     } else {
	                     	player1.setPontos(i, 3);
	                        player3.setPontos(i, 2);
	                        player2.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                     }
	                	
	                } else if (player1.getValorPedra() == player5.getValorPedra()){
	                	if (player1.getValorPedra() > player2.getValorPedra()
	                     		&& player1.getValorPedra() > player3.getValorPedra()
	                     		&& player1.getValorPedra() > player4.getValorPedra()) {
	                     	player1.setPontos(i, 3);
	                        player5.setPontos(i, 3);
	                        player2.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                     } else {
	                     	player1.setPontos(i, 3);
	                        player5.setPontos(i, 2);
	                        player2.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                     }
	                    
	                } else if (player2.getValorPedra() == player3.getValorPedra()) {
	                    if (player2.getValorPedra() > player1.getValorPedra()
	                     		&& player2.getValorPedra() > player4.getValorPedra()
	                     		&& player2.getValorPedra() > player5.getValorPedra()) {
	                    	player2.setPontos(i, 3);
	                        player3.setPontos(i, 3);
	                        player1.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    } else {
	                    	player2.setPontos(i, 3);
	                        player3.setPontos(i, 2);
	                        player1.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    }
	                    
	                } else if (player2.getValorPedra() == player4.getValorPedra()) {
	                	if (player2.getValorPedra() > player1.getValorPedra()
	                     		&& player2.getValorPedra() > player3.getValorPedra()
	                     		&& player2.getValorPedra() > player5.getValorPedra()) {
	                    	player2.setPontos(i, 3);
	                        player4.setPontos(i, 3);
	                        player1.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    } else {
	                    	player2.setPontos(i, 3);
	                        player4.setPontos(i, 2);
	                        player1.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    }
	                	
	                } else if (player2.getValorPedra() == player5.getValorPedra()) {
	                	if (player2.getValorPedra() > player1.getValorPedra()
	                     		&& player2.getValorPedra() > player3.getValorPedra()
	                     		&& player2.getValorPedra() > player4.getValorPedra()) {
	                    	player2.setPontos(i, 3);
	                        player5.setPontos(i, 3);
	                        player1.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                    } else {
	                    	player2.setPontos(i, 3);
	                        player5.setPontos(i, 2);
	                        player1.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                    }
	                	
	                } else if (player3.getValorPedra() == player4.getValorPedra()) {
	                	if (player3.getValorPedra() > player1.getValorPedra()
	                     		&& player3.getValorPedra() > player2.getValorPedra()
	                     		&& player3.getValorPedra() > player5.getValorPedra()) {
	                    	player3.setPontos(i, 3);
	                        player4.setPontos(i, 3);
	                        player1.setPontos(i, 1);
	                        player2.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    } else {
	                    	player3.setPontos(i, 3);
	                        player4.setPontos(i, 2);
	                        player1.setPontos(i, 1);
	                        player2.setPontos(i, 1);
	                        player5.setPontos(i, 1);
	                    } 
	                	
	                } else if (player3.getValorPedra() == player5.getValorPedra()) {
	                	if (player3.getValorPedra() > player1.getValorPedra()
	                     		&& player3.getValorPedra() > player2.getValorPedra()
	                     		&& player3.getValorPedra() > player4.getValorPedra()) {
	                    	player3.setPontos(i, 3);
	                        player5.setPontos(i, 3);
	                        player1.setPontos(i, 1);
	                        player2.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                    } else {
	                    	player3.setPontos(i, 3);
	                        player5.setPontos(i, 2);
	                        player1.setPontos(i, 1);
	                        player2.setPontos(i, 1);
	                        player4.setPontos(i, 1);
	                    }
	                	
	                } else if (player4.getValorPedra() == player5.getValorPedra()) {
	                	if (player4.getValorPedra() > player1.getValorPedra()
	                     		&& player4.getValorPedra() > player2.getValorPedra()
	                     		&& player4.getValorPedra() > player3.getValorPedra()) {
	                    	player4.setPontos(i, 3);
	                        player5.setPontos(i, 3);
	                        player1.setPontos(i, 1);
	                        player2.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                    } else {
	                    	player4.setPontos(i, 3);
	                        player5.setPontos(i, 2);
	                        player1.setPontos(i, 1);
	                        player2.setPontos(i, 1);
	                        player3.setPontos(i, 1);
	                    }
	                	
	                } else {
	                    player1.setPontos(i, 1);
	                    player2.setPontos(i, 1);
	                    player3.setPontos(i, 1);
	                    player4.setPontos(i, 1);
	                    player5.setPontos(i, 1);
	                }
	            }
	
	            System.out.println("\n\nPONTUAÇÃO DA RODADA\n");
	            System.out.println(player1.getNome() + " ganhou " + player1.getPontos()[i] + " pontos.");
	            System.out.println(player2.getNome() + " ganhou " + player2.getPontos()[i] + " pontos.");
	            System.out.println(player3.getNome() + " ganhou " + player3.getPontos()[i] + " pontos.");
	            System.out.println(player4.getNome() + " ganhou " + player4.getPontos()[i] + " pontos.");
	            System.out.println(player5.getNome() + " ganhou " + player5.getPontos()[i] + " pontos.");
	
	            input("\nPressione ENTER para continuar.");
	        }
		
	        System.out.println("\n----PONTUAÇÃO FINAL----\n\n");
	        System.out.println(player1.getNome() + ": " + player1.getPontuacaoFinal());
	        System.out.println(player2.getNome() + ": " + player2.getPontuacaoFinal());
	        System.out.println(player3.getNome() + ": " + player3.getPontuacaoFinal());
	        System.out.println(player4.getNome() + ": " + player4.getPontuacaoFinal());
	        System.out.println(player5.getNome() + ": " + player5.getPontuacaoFinal());
	
	        if (player1.getPontuacaoFinal() > player2.getPontuacaoFinal()
	                && player1.getPontuacaoFinal() > player3.getPontuacaoFinal()
	                && player1.getPontuacaoFinal() > player4.getPontuacaoFinal()
	                && player1.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	            System.out.println("\n" + player1.getNome() + " venceu.");
	        } else if (player2.getPontuacaoFinal() > player1.getPontuacaoFinal()
	                && player2.getPontuacaoFinal() > player3.getPontuacaoFinal()
	                && player2.getPontuacaoFinal() > player4.getPontuacaoFinal()
	                && player2.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	            System.out.println("\n" + player2.getNome() + " venceu.");
	        } else if (player3.getPontuacaoFinal() > player1.getPontuacaoFinal()
	                && player3.getPontuacaoFinal() > player2.getPontuacaoFinal()
	                && player3.getPontuacaoFinal() > player4.getPontuacaoFinal()
	                && player3.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	            System.out.println("\n" + player3.getNome() + " venceu.");
	        } else if (player4.getPontuacaoFinal() > player1.getPontuacaoFinal()
	                && player4.getPontuacaoFinal() > player2.getPontuacaoFinal()
	                && player4.getPontuacaoFinal() > player3.getPontuacaoFinal()
	                && player4.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	            System.out.println("\n" + player4.getNome() + " venceu.");
	        } else if (player5.getPontuacaoFinal() > player1.getPontuacaoFinal()
	                && player5.getPontuacaoFinal() > player2.getPontuacaoFinal()
	                && player5.getPontuacaoFinal() > player3.getPontuacaoFinal()
	                && player5.getPontuacaoFinal() > player4.getPontuacaoFinal()) {
	            System.out.println("\n" + player5.getNome() + " venceu.");
	        } else {
	            System.out.println("\nHouve um empate!!");
	        }
		
	    



		if(tipo_pedra==2){
		if (player1.getValorPedra() > player2.getValorPedra()
			&& player1.getValorPedra() > player3.getValorPedra()
			&& player1.getValorPedra() > player4.getValorPedra()
			&& player1.getValorPedra() > player5.getValorPedra()
			&& player2.getValorPedra() != player3.getValorPedra()
			&& player2.getValorPedra() != player4.getValorPedra()
			&& player2.getValorPedra() != player5.getValorPedra()
			&& player3.getValorPedra() != player2.getValorPedra() 
			&& player3.getValorPedra() != player4.getValorPedra()
			&& player3.getValorPedra() != player5.getValorPedra()
			&& player4.getValorPedra() != player2.getValorPedra()
			&& player4.getValorPedra() != player3.getValorPedra()
			&& player4.getValorPedra() != player5.getValorPedra()
			&& player5.getValorPedra() != player2.getValorPedra()
			&& player5.getValorPedra() != player3.getValorPedra()
			&& player5.getValorPedra() != player4.getValorPedra()) {

		player1.setPontos(i, 3);

		if (player2.getValorPedra() > player3.getValorPedra()
				&& player2.getValorPedra() > player4.getValorPedra()
				&& player2.getValorPedra() > player5.getValorPedra()) {
			player2.setPontos(i, 2);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player3.getValorPedra() > player2.getValorPedra()
				&& player3.getValorPedra() > player4.getValorPedra()
				&& player3.getValorPedra() > player5.getValorPedra()){
			player3.setPontos(i, 2);
			player2.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player4.getValorPedra() > player2.getValorPedra()
				&& player4.getValorPedra() > player3.getValorPedra()
				&& player4.getValorPedra() > player5.getValorPedra()) {
			player4.setPontos(i, 2);
			player3.setPontos(i, 1);
			player2.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player5.getValorPedra() > player2.getValorPedra()
				&& player5.getValorPedra() > player3.getValorPedra()
				&& player5.getValorPedra() > player4.getValorPedra()) {
			player5.setPontos(i, 2);
			player2.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
		}

	} else if (player2.getValorPedra() > player1.getValorPedra()
			&& player2.getValorPedra() > player3.getValorPedra()
			&& player2.getValorPedra() > player4.getValorPedra()
			&& player2.getValorPedra() > player5.getValorPedra()
			&& player1.getValorPedra() != player3.getValorPedra()
			&& player1.getValorPedra() != player4.getValorPedra()
			&& player1.getValorPedra() != player5.getValorPedra()
			&& player3.getValorPedra() != player1.getValorPedra()
			&& player3.getValorPedra() != player4.getValorPedra()
			&& player3.getValorPedra() != player5.getValorPedra()
			&& player4.getValorPedra() != player1.getValorPedra()
			&& player4.getValorPedra() != player3.getValorPedra()
			&& player4.getValorPedra() != player5.getValorPedra()
			&& player5.getValorPedra() != player1.getValorPedra()
			&& player5.getValorPedra() != player3.getValorPedra()
			&& player5.getValorPedra() != player4.getValorPedra()) {

		player2.setPontos(i, 3);
		
		if (player1.getValorPedra() > player3.getValorPedra()
				&& player1.getValorPedra() > player4.getValorPedra()
				&& player1.getValorPedra() > player5.getValorPedra()) {
			player1.setPontos(i, 2);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player3.getValorPedra() > player1.getValorPedra()
				&& player3.getValorPedra() > player4.getValorPedra()
				&& player3.getValorPedra() > player5.getValorPedra()){
			player3.setPontos(i, 2);
			player1.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player4.getValorPedra() > player1.getValorPedra()
				&& player4.getValorPedra() > player3.getValorPedra()
				&& player4.getValorPedra() > player5.getValorPedra()){
			player4.setPontos(i, 2);
			player1.setPontos(i, 1);
			player3.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player5.getValorPedra() > player1.getValorPedra()
				&& player5.getValorPedra() > player3.getValorPedra()
				&& player5.getValorPedra() > player4.getValorPedra()){
			player5.setPontos(i, 2);
			player1.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
		}
		
	} else if (player3.getValorPedra() > player1.getValorPedra()
			&& player3.getValorPedra() > player2.getValorPedra()
			&& player3.getValorPedra() > player4.getValorPedra()
			&& player3.getValorPedra() > player5.getValorPedra()
			&& player1.getValorPedra() != player2.getValorPedra()
			&& player1.getValorPedra() != player4.getValorPedra()
			&& player1.getValorPedra() != player5.getValorPedra()
			&& player2.getValorPedra() != player1.getValorPedra()
			&& player2.getValorPedra() != player4.getValorPedra()
			&& player2.getValorPedra() != player5.getValorPedra()
			&& player4.getValorPedra() != player1.getValorPedra()
			&& player4.getValorPedra() != player2.getValorPedra()
			&& player4.getValorPedra() != player5.getValorPedra()
			&& player5.getValorPedra() != player1.getValorPedra()
			&& player5.getValorPedra() != player2.getValorPedra()
			&& player5.getValorPedra() != player4.getValorPedra()) {

		player3.setPontos(i, 3);
		
		if (player1.getValorPedra() > player2.getValorPedra()
				&& player1.getValorPedra() > player4.getValorPedra()
				&& player1.getValorPedra() > player5.getValorPedra()) {
			player1.setPontos(i, 2);
			player2.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player2.getValorPedra() > player1.getValorPedra()
				&& player2.getValorPedra() > player4.getValorPedra()
				&& player2.getValorPedra() > player5.getValorPedra()){
			player2.setPontos(i, 2);
			player1.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player4.getValorPedra() > player1.getValorPedra()
				&& player4.getValorPedra() > player2.getValorPedra()
				&& player4.getValorPedra() > player5.getValorPedra()) {
			player4.setPontos(i, 2);
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player5.getValorPedra() > player1.getValorPedra()
				&& player5.getValorPedra() > player2.getValorPedra()
				&& player5.getValorPedra() > player4.getValorPedra()) {
			player5.setPontos(i, 2);
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player4.setPontos(i, 1);
		} 
	} else if (player4.getValorPedra() > player1.getValorPedra()
			&& player4.getValorPedra() > player2.getValorPedra()
			&& player4.getValorPedra() > player3.getValorPedra()
			&& player4.getValorPedra() > player5.getValorPedra()
			&& player1.getValorPedra() != player2.getValorPedra()
			&& player1.getValorPedra() != player3.getValorPedra()
			&& player1.getValorPedra() != player5.getValorPedra()
			&& player2.getValorPedra() != player1.getValorPedra()
			&& player2.getValorPedra() != player3.getValorPedra()
			&& player2.getValorPedra() != player5.getValorPedra()
			&& player3.getValorPedra() != player1.getValorPedra()
			&& player3.getValorPedra() != player2.getValorPedra()
			&& player3.getValorPedra() != player5.getValorPedra()
			&& player5.getValorPedra() != player1.getValorPedra()
			&& player5.getValorPedra() != player2.getValorPedra()
			&& player5.getValorPedra() != player3.getValorPedra()) {
		
		 player4.setPontos(i, 3);
		 
		 if (player1.getValorPedra() > player2.getValorPedra()
				 && player1.getValorPedra() > player3.getValorPedra()
				 && player1.getValorPedra() > player5.getValorPedra()) {
			 player1.setPontos(i, 2);
			 player2.setPontos(i, 1);
			 player3.setPontos(i, 1);
			 player5.setPontos(i, 1);
			 
		 } else if (player2.getValorPedra() > player1.getValorPedra()
				  && player2.getValorPedra() > player3.getValorPedra()
				  && player2.getValorPedra() > player5.getValorPedra()) {
			 player2.setPontos(i, 2);
			 player1.setPontos(i, 1);
			 player3.setPontos(i, 1);
			 player5.setPontos(i, 1);
			 
		 } else if (player3.getValorPedra() > player1.getValorPedra()
				   && player3.getValorPedra() > player2.getValorPedra()
				   && player3.getValorPedra() > player5.getValorPedra()) {
			  player3.setPontos(i, 2);
			 player1.setPontos(i, 1);
			 player2.setPontos(i, 1);
			 player5.setPontos(i, 1);
			 
		 } else if (player5.getValorPedra() > player1.getValorPedra()
				&& player5.getValorPedra() > player2.getValorPedra()
				   && player5.getValorPedra() > player3.getValorPedra()) {
			 player5.setPontos(i, 2);
			 player1.setPontos(i, 1);
			 player2.setPontos(i, 1);
			 player3.setPontos(i, 1);
		 }
	
	} else if (player5.getValorPedra() > player1.getValorPedra()
			&& player5.getValorPedra() > player2.getValorPedra()
			&& player5.getValorPedra() > player3.getValorPedra()
			&& player5.getValorPedra() > player4.getValorPedra()
			&& player1.getValorPedra() != player2.getValorPedra()
			&& player1.getValorPedra() != player3.getValorPedra()
			&& player1.getValorPedra() != player4.getValorPedra()
			&& player2.getValorPedra() != player1.getValorPedra()
			&& player2.getValorPedra() != player3.getValorPedra()
			&& player2.getValorPedra() != player4.getValorPedra()
			&& player3.getValorPedra() != player1.getValorPedra()
			&& player3.getValorPedra() != player2.getValorPedra()
			&& player3.getValorPedra() != player4.getValorPedra()
			&& player4.getValorPedra() != player1.getValorPedra()
			&& player4.getValorPedra() != player2.getValorPedra()
			&& player4.getValorPedra() != player3.getValorPedra()) {
		
		player5.setPontos(i, 3);
		
		if (player1.getValorPedra() > player2.getValorPedra()
				 && player1.getValorPedra() > player3.getValorPedra()
				 && player1.getValorPedra() > player4.getValorPedra()) {
			player1.setPontos(i, 2);
			player2.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			
		} else if (player2.getValorPedra() > player1.getValorPedra()
				 && player2.getValorPedra() > player3.getValorPedra()
				 && player2.getValorPedra() > player4.getValorPedra()) {
			player2.setPontos(i, 2);
			player1.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			
		} else if (player3.getValorPedra() > player1.getValorPedra()
				 && player3.getValorPedra() > player2.getValorPedra()
				 && player3.getValorPedra() > player4.getValorPedra()) {
			player3.setPontos(i, 2);
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player4.setPontos(i, 1);
			
		} else if (player4.getValorPedra() > player1.getValorPedra()
				 && player4.getValorPedra() > player2.getValorPedra()
				 && player4.getValorPedra() > player3.getValorPedra()) {
			player4.setPontos(i, 2);
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player3.setPontos(i, 1);
		}
		
	} else {
		if (player1.getValorPedra() == player2.getValorPedra()) {
			if (player1.getValorPedra() > player3.getValorPedra()
					&& player1.getValorPedra() > player4.getValorPedra()
					&& player1.getValorPedra() > player5.getValorPedra()) {
				player1.setPontos(i, 3);
				player2.setPontos(i, 3);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				 player1.setPontos(i, 3);
				 player2.setPontos(i, 2);
				 player3.setPontos(i, 1);
				 player4.setPontos(i, 1);
				 player5.setPontos(i, 1);
			}
				
		} else if (player1.getValorPedra() == player3.getValorPedra()) {
			if (player1.getValorPedra() > player2.getValorPedra()
					&& player1.getValorPedra() > player4.getValorPedra()
					&& player1.getValorPedra() > player5.getValorPedra()) {
				player1.setPontos(i, 3);
				player3.setPontos(i, 3);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				player1.setPontos(i, 3);
				player3.setPontos(i, 2);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			}
			
		} else if (player1.getValorPedra() == player4.getValorPedra()){
			if (player1.getValorPedra() > player2.getValorPedra()
					 && player1.getValorPedra() > player3.getValorPedra()
					 && player1.getValorPedra() > player5.getValorPedra()) {
				 player1.setPontos(i, 3);
				player4.setPontos(i, 3);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
				player5.setPontos(i, 1);
			 } else {
				 player1.setPontos(i, 3);
				player3.setPontos(i, 2);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			 }
			
		} else if (player1.getValorPedra() == player5.getValorPedra()){
			if (player1.getValorPedra() > player2.getValorPedra()
					 && player1.getValorPedra() > player3.getValorPedra()
					 && player1.getValorPedra() > player4.getValorPedra()) {
				 player1.setPontos(i, 3);
				player5.setPontos(i, 3);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
			 } else {
				 player1.setPontos(i, 3);
				player5.setPontos(i, 2);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
			 }
			
		} else if (player2.getValorPedra() == player3.getValorPedra()) {
			if (player2.getValorPedra() > player1.getValorPedra()
					 && player2.getValorPedra() > player4.getValorPedra()
					 && player2.getValorPedra() > player5.getValorPedra()) {
				player2.setPontos(i, 3);
				player3.setPontos(i, 3);
				player1.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				player2.setPontos(i, 3);
				player3.setPontos(i, 2);
				player1.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			}
			
		} else if (player2.getValorPedra() == player4.getValorPedra()) {
			if (player2.getValorPedra() > player1.getValorPedra()
					 && player2.getValorPedra() > player3.getValorPedra()
					 && player2.getValorPedra() > player5.getValorPedra()) {
				player2.setPontos(i, 3);
				player4.setPontos(i, 3);
				player1.setPontos(i, 1);
				player3.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				player2.setPontos(i, 3);
				player4.setPontos(i, 2);
				player1.setPontos(i, 1);
				player3.setPontos(i, 1);
				player5.setPontos(i, 1);
			}
			
		} else if (player2.getValorPedra() == player5.getValorPedra()) {
			if (player2.getValorPedra() > player1.getValorPedra()
					 && player2.getValorPedra() > player3.getValorPedra()
					 && player2.getValorPedra() > player4.getValorPedra()) {
				player2.setPontos(i, 3);
				player5.setPontos(i, 3);
				player1.setPontos(i, 1);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
			} else {
				player2.setPontos(i, 3);
				player5.setPontos(i, 2);
				player1.setPontos(i, 1);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
			}
			
		} else if (player3.getValorPedra() == player4.getValorPedra()) {
			if (player3.getValorPedra() > player1.getValorPedra()
					 && player3.getValorPedra() > player2.getValorPedra()
					 && player3.getValorPedra() > player5.getValorPedra()) {
				player3.setPontos(i, 3);
				player4.setPontos(i, 3);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				player3.setPontos(i, 3);
				player4.setPontos(i, 2);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player5.setPontos(i, 1);
			} 
			
		} else if (player3.getValorPedra() == player5.getValorPedra()) {
			if (player3.getValorPedra() > player1.getValorPedra()
					 && player3.getValorPedra() > player2.getValorPedra()
					 && player3.getValorPedra() > player4.getValorPedra()) {
				player3.setPontos(i, 3);
				player5.setPontos(i, 3);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
			} else {
				player3.setPontos(i, 3);
				player5.setPontos(i, 2);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
			}
			
		} else if (player4.getValorPedra() == player5.getValorPedra()) {
			if (player4.getValorPedra() > player1.getValorPedra()
					 && player4.getValorPedra() > player2.getValorPedra()
					 && player4.getValorPedra() > player3.getValorPedra()) {
				player4.setPontos(i, 3);
				player5.setPontos(i, 3);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
			} else {
				player4.setPontos(i, 3);
				player5.setPontos(i, 2);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
			}
			
		} else {
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
		}
	}

	System.out.println("\n\nPONTUAÇÃO DA RODADA\n");
	System.out.println(player1.getNome() + " ganhou " + player1.getPontos()[i] + " pontos.");
	System.out.println(player2.getNome() + " ganhou " + player2.getPontos()[i] + " pontos.");
	System.out.println(player3.getNome() + " ganhou " + player3.getPontos()[i] + " pontos.");
	System.out.println(player4.getNome() + " ganhou " + player4.getPontos()[i] + " pontos.");
	System.out.println(player5.getNome() + " ganhou " + player5.getPontos()[i] + " pontos.");

	input("\nPressione ENTER para continuar.");
}

System.out.println("\n----PONTUAÇÃO FINAL----\n\n");
System.out.println(player1.getNome() + ": " + player1.getPontuacaoFinal());
System.out.println(player2.getNome() + ": " + player2.getPontuacaoFinal());
System.out.println(player3.getNome() + ": " + player3.getPontuacaoFinal());
System.out.println(player4.getNome() + ": " + player4.getPontuacaoFinal());
System.out.println(player5.getNome() + ": " + player5.getPontuacaoFinal());

if (player1.getPontuacaoFinal() > player2.getPontuacaoFinal()
		&& player1.getPontuacaoFinal() > player3.getPontuacaoFinal()
		&& player1.getPontuacaoFinal() > player4.getPontuacaoFinal()
		&& player1.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	System.out.println("\n" + player1.getNome() + " venceu.");
} else if (player2.getPontuacaoFinal() > player1.getPontuacaoFinal()
		&& player2.getPontuacaoFinal() > player3.getPontuacaoFinal()
		&& player2.getPontuacaoFinal() > player4.getPontuacaoFinal()
		&& player2.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	System.out.println("\n" + player2.getNome() + " venceu.");
} else if (player3.getPontuacaoFinal() > player1.getPontuacaoFinal()
		&& player3.getPontuacaoFinal() > player2.getPontuacaoFinal()
		&& player3.getPontuacaoFinal() > player4.getPontuacaoFinal()
		&& player3.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	System.out.println("\n" + player3.getNome() + " venceu.");
} else if (player4.getPontuacaoFinal() > player1.getPontuacaoFinal()
		&& player4.getPontuacaoFinal() > player2.getPontuacaoFinal()
		&& player4.getPontuacaoFinal() > player3.getPontuacaoFinal()
		&& player4.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	System.out.println("\n" + player4.getNome() + " venceu.");
} else if (player5.getPontuacaoFinal() > player1.getPontuacaoFinal()
		&& player5.getPontuacaoFinal() > player2.getPontuacaoFinal()
		&& player5.getPontuacaoFinal() > player3.getPontuacaoFinal()
		&& player5.getPontuacaoFinal() > player4.getPontuacaoFinal()) {
	System.out.println("\n" + player5.getNome() + " venceu.");
} else {
	System.out.println("\nHouve um empate!!");

}
if(tipo_pedra==3){
	if (player1.getValorPedra() > player2.getValorPedra()
			&& player1.getValorPedra() > player3.getValorPedra()
			&& player1.getValorPedra() > player4.getValorPedra()
			&& player1.getValorPedra() > player5.getValorPedra()
			&& player2.getValorPedra() != player3.getValorPedra()
			&& player2.getValorPedra() != player4.getValorPedra()
			&& player2.getValorPedra() != player5.getValorPedra()
			&& player3.getValorPedra() != player2.getValorPedra() 
			&& player3.getValorPedra() != player4.getValorPedra()
			&& player3.getValorPedra() != player5.getValorPedra()
			&& player4.getValorPedra() != player2.getValorPedra()
			&& player4.getValorPedra() != player3.getValorPedra()
			&& player4.getValorPedra() != player5.getValorPedra()
			&& player5.getValorPedra() != player2.getValorPedra()
			&& player5.getValorPedra() != player3.getValorPedra()
			&& player5.getValorPedra() != player4.getValorPedra()) {

		player1.setPontos(i, 3);

		if (player2.getValorPedra() > player3.getValorPedra()
				&& player2.getValorPedra() > player4.getValorPedra()
				&& player2.getValorPedra() > player5.getValorPedra()) {
			player2.setPontos(i, 2);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player3.getValorPedra() > player2.getValorPedra()
				&& player3.getValorPedra() > player4.getValorPedra()
				&& player3.getValorPedra() > player5.getValorPedra()){
			player3.setPontos(i, 2);
			player2.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player4.getValorPedra() > player2.getValorPedra()
				&& player4.getValorPedra() > player3.getValorPedra()
				&& player4.getValorPedra() > player5.getValorPedra()) {
			player4.setPontos(i, 2);
			player3.setPontos(i, 1);
			player2.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player5.getValorPedra() > player2.getValorPedra()
				&& player5.getValorPedra() > player3.getValorPedra()
				&& player5.getValorPedra() > player4.getValorPedra()) {
			player5.setPontos(i, 2);
			player2.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
		}

	} else if (player2.getValorPedra() > player1.getValorPedra()
			&& player2.getValorPedra() > player3.getValorPedra()
			&& player2.getValorPedra() > player4.getValorPedra()
			&& player2.getValorPedra() > player5.getValorPedra()
			&& player1.getValorPedra() != player3.getValorPedra()
			&& player1.getValorPedra() != player4.getValorPedra()
			&& player1.getValorPedra() != player5.getValorPedra()
			&& player3.getValorPedra() != player1.getValorPedra()
			&& player3.getValorPedra() != player4.getValorPedra()
			&& player3.getValorPedra() != player5.getValorPedra()
			&& player4.getValorPedra() != player1.getValorPedra()
			&& player4.getValorPedra() != player3.getValorPedra()
			&& player4.getValorPedra() != player5.getValorPedra()
			&& player5.getValorPedra() != player1.getValorPedra()
			&& player5.getValorPedra() != player3.getValorPedra()
			&& player5.getValorPedra() != player4.getValorPedra()) {

		player2.setPontos(i, 3);
		
		if (player1.getValorPedra() > player3.getValorPedra()
				&& player1.getValorPedra() > player4.getValorPedra()
				&& player1.getValorPedra() > player5.getValorPedra()) {
			player1.setPontos(i, 2);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player3.getValorPedra() > player1.getValorPedra()
				&& player3.getValorPedra() > player4.getValorPedra()
				&& player3.getValorPedra() > player5.getValorPedra()){
			player3.setPontos(i, 2);
			player1.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player4.getValorPedra() > player1.getValorPedra()
				&& player4.getValorPedra() > player3.getValorPedra()
				&& player4.getValorPedra() > player5.getValorPedra()){
			player4.setPontos(i, 2);
			player1.setPontos(i, 1);
			player3.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player5.getValorPedra() > player1.getValorPedra()
				&& player5.getValorPedra() > player3.getValorPedra()
				&& player5.getValorPedra() > player4.getValorPedra()){
			player5.setPontos(i, 2);
			player1.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
		}
		
	} else if (player3.getValorPedra() > player1.getValorPedra()
			&& player3.getValorPedra() > player2.getValorPedra()
			&& player3.getValorPedra() > player4.getValorPedra()
			&& player3.getValorPedra() > player5.getValorPedra()
			&& player1.getValorPedra() != player2.getValorPedra()
			&& player1.getValorPedra() != player4.getValorPedra()
			&& player1.getValorPedra() != player5.getValorPedra()
			&& player2.getValorPedra() != player1.getValorPedra()
			&& player2.getValorPedra() != player4.getValorPedra()
			&& player2.getValorPedra() != player5.getValorPedra()
			&& player4.getValorPedra() != player1.getValorPedra()
			&& player4.getValorPedra() != player2.getValorPedra()
			&& player4.getValorPedra() != player5.getValorPedra()
			&& player5.getValorPedra() != player1.getValorPedra()
			&& player5.getValorPedra() != player2.getValorPedra()
			&& player5.getValorPedra() != player4.getValorPedra()) {

		player3.setPontos(i, 3);
		
		if (player1.getValorPedra() > player2.getValorPedra()
				&& player1.getValorPedra() > player4.getValorPedra()
				&& player1.getValorPedra() > player5.getValorPedra()) {
			player1.setPontos(i, 2);
			player2.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player2.getValorPedra() > player1.getValorPedra()
				&& player2.getValorPedra() > player4.getValorPedra()
				&& player2.getValorPedra() > player5.getValorPedra()){
			player2.setPontos(i, 2);
			player1.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player4.getValorPedra() > player1.getValorPedra()
				&& player4.getValorPedra() > player2.getValorPedra()
				&& player4.getValorPedra() > player5.getValorPedra()) {
			player4.setPontos(i, 2);
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player5.setPontos(i, 1);
			
		} else if (player5.getValorPedra() > player1.getValorPedra()
				&& player5.getValorPedra() > player2.getValorPedra()
				&& player5.getValorPedra() > player4.getValorPedra()) {
			player5.setPontos(i, 2);
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player4.setPontos(i, 1);
		} 
	} else if (player4.getValorPedra() > player1.getValorPedra()
			&& player4.getValorPedra() > player2.getValorPedra()
			&& player4.getValorPedra() > player3.getValorPedra()
			&& player4.getValorPedra() > player5.getValorPedra()
			&& player1.getValorPedra() != player2.getValorPedra()
			&& player1.getValorPedra() != player3.getValorPedra()
			&& player1.getValorPedra() != player5.getValorPedra()
			&& player2.getValorPedra() != player1.getValorPedra()
			&& player2.getValorPedra() != player3.getValorPedra()
			&& player2.getValorPedra() != player5.getValorPedra()
			&& player3.getValorPedra() != player1.getValorPedra()
			&& player3.getValorPedra() != player2.getValorPedra()
			&& player3.getValorPedra() != player5.getValorPedra()
			&& player5.getValorPedra() != player1.getValorPedra()
			&& player5.getValorPedra() != player2.getValorPedra()
			&& player5.getValorPedra() != player3.getValorPedra()) {
		
		 player4.setPontos(i, 3);
		 
		 if (player1.getValorPedra() > player2.getValorPedra()
				 && player1.getValorPedra() > player3.getValorPedra()
				 && player1.getValorPedra() > player5.getValorPedra()) {
			 player1.setPontos(i, 2);
			 player2.setPontos(i, 1);
			 player3.setPontos(i, 1);
			 player5.setPontos(i, 1);
			 
		 } else if (player2.getValorPedra() > player1.getValorPedra()
				  && player2.getValorPedra() > player3.getValorPedra()
				  && player2.getValorPedra() > player5.getValorPedra()) {
			 player2.setPontos(i, 2);
			 player1.setPontos(i, 1);
			 player3.setPontos(i, 1);
			 player5.setPontos(i, 1);
			 
		 } else if (player3.getValorPedra() > player1.getValorPedra()
				   && player3.getValorPedra() > player2.getValorPedra()
				   && player3.getValorPedra() > player5.getValorPedra()) {
			  player3.setPontos(i, 2);
			 player1.setPontos(i, 1);
			 player2.setPontos(i, 1);
			 player5.setPontos(i, 1);
			 
		 } else if (player5.getValorPedra() > player1.getValorPedra()
				&& player5.getValorPedra() > player2.getValorPedra()
				   && player5.getValorPedra() > player3.getValorPedra()) {
			 player5.setPontos(i, 2);
			 player1.setPontos(i, 1);
			 player2.setPontos(i, 1);
			 player3.setPontos(i, 1);
		 }
	
	} else if (player5.getValorPedra() > player1.getValorPedra()
			&& player5.getValorPedra() > player2.getValorPedra()
			&& player5.getValorPedra() > player3.getValorPedra()
			&& player5.getValorPedra() > player4.getValorPedra()
			&& player1.getValorPedra() != player2.getValorPedra()
			&& player1.getValorPedra() != player3.getValorPedra()
			&& player1.getValorPedra() != player4.getValorPedra()
			&& player2.getValorPedra() != player1.getValorPedra()
			&& player2.getValorPedra() != player3.getValorPedra()
			&& player2.getValorPedra() != player4.getValorPedra()
			&& player3.getValorPedra() != player1.getValorPedra()
			&& player3.getValorPedra() != player2.getValorPedra()
			&& player3.getValorPedra() != player4.getValorPedra()
			&& player4.getValorPedra() != player1.getValorPedra()
			&& player4.getValorPedra() != player2.getValorPedra()
			&& player4.getValorPedra() != player3.getValorPedra()) {
		
		player5.setPontos(i, 3);
		
		if (player1.getValorPedra() > player2.getValorPedra()
				 && player1.getValorPedra() > player3.getValorPedra()
				 && player1.getValorPedra() > player4.getValorPedra()) {
			player1.setPontos(i, 2);
			player2.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			
		} else if (player2.getValorPedra() > player1.getValorPedra()
				 && player2.getValorPedra() > player3.getValorPedra()
				 && player2.getValorPedra() > player4.getValorPedra()) {
			player2.setPontos(i, 2);
			player1.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			
		} else if (player3.getValorPedra() > player1.getValorPedra()
				 && player3.getValorPedra() > player2.getValorPedra()
				 && player3.getValorPedra() > player4.getValorPedra()) {
			player3.setPontos(i, 2);
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player4.setPontos(i, 1);
			
		} else if (player4.getValorPedra() > player1.getValorPedra()
				 && player4.getValorPedra() > player2.getValorPedra()
				 && player4.getValorPedra() > player3.getValorPedra()) {
			player4.setPontos(i, 2);
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player3.setPontos(i, 1);
		}
		
	} else {
		if (player1.getValorPedra() == player2.getValorPedra()) {
			if (player1.getValorPedra() > player3.getValorPedra()
					&& player1.getValorPedra() > player4.getValorPedra()
					&& player1.getValorPedra() > player5.getValorPedra()) {
				player1.setPontos(i, 3);
				player2.setPontos(i, 3);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				 player1.setPontos(i, 3);
				 player2.setPontos(i, 2);
				 player3.setPontos(i, 1);
				 player4.setPontos(i, 1);
				 player5.setPontos(i, 1);
			}
				
		} else if (player1.getValorPedra() == player3.getValorPedra()) {
			if (player1.getValorPedra() > player2.getValorPedra()
					&& player1.getValorPedra() > player4.getValorPedra()
					&& player1.getValorPedra() > player5.getValorPedra()) {
				player1.setPontos(i, 3);
				player3.setPontos(i, 3);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				player1.setPontos(i, 3);
				player3.setPontos(i, 2);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			}
			
		} else if (player1.getValorPedra() == player4.getValorPedra()){
			if (player1.getValorPedra() > player2.getValorPedra()
					 && player1.getValorPedra() > player3.getValorPedra()
					 && player1.getValorPedra() > player5.getValorPedra()) {
				 player1.setPontos(i, 3);
				player4.setPontos(i, 3);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
				player5.setPontos(i, 1);
			 } else {
				 player1.setPontos(i, 3);
				player3.setPontos(i, 2);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			 }
			
		} else if (player1.getValorPedra() == player5.getValorPedra()){
			if (player1.getValorPedra() > player2.getValorPedra()
					 && player1.getValorPedra() > player3.getValorPedra()
					 && player1.getValorPedra() > player4.getValorPedra()) {
				 player1.setPontos(i, 3);
				player5.setPontos(i, 3);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
			 } else {
				 player1.setPontos(i, 3);
				player5.setPontos(i, 2);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
			 }
			
		} else if (player2.getValorPedra() == player3.getValorPedra()) {
			if (player2.getValorPedra() > player1.getValorPedra()
					 && player2.getValorPedra() > player4.getValorPedra()
					 && player2.getValorPedra() > player5.getValorPedra()) {
				player2.setPontos(i, 3);
				player3.setPontos(i, 3);
				player1.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				player2.setPontos(i, 3);
				player3.setPontos(i, 2);
				player1.setPontos(i, 1);
				player4.setPontos(i, 1);
				player5.setPontos(i, 1);
			}
			
		} else if (player2.getValorPedra() == player4.getValorPedra()) {
			if (player2.getValorPedra() > player1.getValorPedra()
					 && player2.getValorPedra() > player3.getValorPedra()
					 && player2.getValorPedra() > player5.getValorPedra()) {
				player2.setPontos(i, 3);
				player4.setPontos(i, 3);
				player1.setPontos(i, 1);
				player3.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				player2.setPontos(i, 3);
				player4.setPontos(i, 2);
				player1.setPontos(i, 1);
				player3.setPontos(i, 1);
				player5.setPontos(i, 1);
			}
			
		} else if (player2.getValorPedra() == player5.getValorPedra()) {
			if (player2.getValorPedra() > player1.getValorPedra()
					 && player2.getValorPedra() > player3.getValorPedra()
					 && player2.getValorPedra() > player4.getValorPedra()) {
				player2.setPontos(i, 3);
				player5.setPontos(i, 3);
				player1.setPontos(i, 1);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
			} else {
				player2.setPontos(i, 3);
				player5.setPontos(i, 2);
				player1.setPontos(i, 1);
				player3.setPontos(i, 1);
				player4.setPontos(i, 1);
			}
			
		} else if (player3.getValorPedra() == player4.getValorPedra()) {
			if (player3.getValorPedra() > player1.getValorPedra()
					 && player3.getValorPedra() > player2.getValorPedra()
					 && player3.getValorPedra() > player5.getValorPedra()) {
				player3.setPontos(i, 3);
				player4.setPontos(i, 3);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player5.setPontos(i, 1);
			} else {
				player3.setPontos(i, 3);
				player4.setPontos(i, 2);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player5.setPontos(i, 1);
			} 
			
		} else if (player3.getValorPedra() == player5.getValorPedra()) {
			if (player3.getValorPedra() > player1.getValorPedra()
					 && player3.getValorPedra() > player2.getValorPedra()
					 && player3.getValorPedra() > player4.getValorPedra()) {
				player3.setPontos(i, 3);
				player5.setPontos(i, 3);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
			} else {
				player3.setPontos(i, 3);
				player5.setPontos(i, 2);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player4.setPontos(i, 1);
			}
			
		} else if (player4.getValorPedra() == player5.getValorPedra()) {
			if (player4.getValorPedra() > player1.getValorPedra()
					 && player4.getValorPedra() > player2.getValorPedra()
					 && player4.getValorPedra() > player3.getValorPedra()) {
				player4.setPontos(i, 3);
				player5.setPontos(i, 3);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
			} else {
				player4.setPontos(i, 3);
				player5.setPontos(i, 2);
				player1.setPontos(i, 1);
				player2.setPontos(i, 1);
				player3.setPontos(i, 1);
			}
			
		} else {
			player1.setPontos(i, 1);
			player2.setPontos(i, 1);
			player3.setPontos(i, 1);
			player4.setPontos(i, 1);
			player5.setPontos(i, 1);
		}
	}

	System.out.println("\n\nPONTUAÇÃO DA RODADA\n");
	System.out.println(player1.getNome() + " ganhou " + player1.getPontos()[i] + " pontos.");
	System.out.println(player2.getNome() + " ganhou " + player2.getPontos()[i] + " pontos.");
	System.out.println(player3.getNome() + " ganhou " + player3.getPontos()[i] + " pontos.");
	System.out.println(player4.getNome() + " ganhou " + player4.getPontos()[i] + " pontos.");
	System.out.println(player5.getNome() + " ganhou " + player5.getPontos()[i] + " pontos.");

	input("\nPressione ENTER para continuar.");
}

System.out.println("\n----PONTUAÇÃO FINAL----\n\n");
System.out.println(player1.getNome() + ": " + player1.getPontuacaoFinal());
System.out.println(player2.getNome() + ": " + player2.getPontuacaoFinal());
System.out.println(player3.getNome() + ": " + player3.getPontuacaoFinal());
System.out.println(player4.getNome() + ": " + player4.getPontuacaoFinal());
System.out.println(player5.getNome() + ": " + player5.getPontuacaoFinal());

if (player1.getPontuacaoFinal() > player2.getPontuacaoFinal()
		&& player1.getPontuacaoFinal() > player3.getPontuacaoFinal()
		&& player1.getPontuacaoFinal() > player4.getPontuacaoFinal()
		&& player1.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	System.out.println("\n" + player1.getNome() + " venceu.");
} else if (player2.getPontuacaoFinal() > player1.getPontuacaoFinal()
		&& player2.getPontuacaoFinal() > player3.getPontuacaoFinal()
		&& player2.getPontuacaoFinal() > player4.getPontuacaoFinal()
		&& player2.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	System.out.println("\n" + player2.getNome() + " venceu.");
} else if (player3.getPontuacaoFinal() > player1.getPontuacaoFinal()
		&& player3.getPontuacaoFinal() > player2.getPontuacaoFinal()
		&& player3.getPontuacaoFinal() > player4.getPontuacaoFinal()
		&& player3.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	System.out.println("\n" + player3.getNome() + " venceu.");
} else if (player4.getPontuacaoFinal() > player1.getPontuacaoFinal()
		&& player4.getPontuacaoFinal() > player2.getPontuacaoFinal()
		&& player4.getPontuacaoFinal() > player3.getPontuacaoFinal()
		&& player4.getPontuacaoFinal() > player5.getPontuacaoFinal()) {
	System.out.println("\n" + player4.getNome() + " venceu.");
} else if (player5.getPontuacaoFinal() > player1.getPontuacaoFinal()
		&& player5.getPontuacaoFinal() > player2.getPontuacaoFinal()
		&& player5.getPontuacaoFinal() > player3.getPontuacaoFinal()
		&& player5.getPontuacaoFinal() > player4.getPontuacaoFinal()) {
	System.out.println("\n" + player5.getNome() + " venceu.");
} else {
	System.out.println("\nHouve um empate!!");
}


}
		}
	}
}




