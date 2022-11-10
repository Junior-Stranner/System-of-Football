package SistemaJogoFutebol;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		EstadioFutebol f = new EstadioFutebol();

		EstadioDaCasa(f);

		AcessaJogo(f);
	}



	private static void AcessaJogo(EstadioFutebol f ) {

		Scanner in = new Scanner(System.in);
		int op;
		int opcao;
		double novoValorVip1;
		double novoValorVip2;
		double novoValorVip3;
	//	double vip = 0;
		do {
			System.out.print("\n----------------------------------------");

			System.out.println(" \n !MENU DO JOGO! "
					+ "\n 1 - mostrar Cadastro "
					+ "\n 2 - Visualizar pacotes"
					+ "\n 3 - comprar pacotes "
					+ "\n 4 - Sobre ALIANZ ARENA"
					+ "\n 5 - Comprar Creditos"
					+ "\n 6 - VIRE SÓCIO"
					+ "\n 9 - finalizar Sistema /n Bom Jogo!!");

			System.out.print("\n----------------------------------------");
			op = Integer.parseInt(in.nextLine());

			switch(op) {

			case 1: System.out.println(" !!usuário Cadastrado!!\n "+f.mostrarDados());

			System.out.print("\n----------------------------------------");
			break;

			case 2 :System.out.println(" !!vizualizar  pacotes!! \n "+f.visualizaPacotes());

			System.out.print("\n----------------------------------------");
			break;

			case 3: System.out.println(" comprar Pacotes Promocionais \n"
					+ "+ \n Combo Familia :\n"
					+ "+ \n 1 - 4 pesoas combo bebida/comida 200 reais"
					+ "+ \n 2 - 4 pessoa combo bebida 150 reais"
					+ "+ \n ---------------------"
					+ "+ \n Combo Casal :"
					+ "+ \n 3 - 2 pessoas combo bebida/comida 120 reais"
					+ "+ \n 4 - 2 pessoas combo bebida 90 reais"
					+ "+ \n------------------------"
					+ "+\n                           ");
			opcao = Integer.parseInt(in.nextLine());
			if(opcao == 1) {
				System.out.println("Combo familia 1");
				String cf1 = in.nextLine();
				if(confirma(f)) {
					f.comprarPacotes(cf1);
				}
			}else if(opcao == 2) {
				System.out.println(" Combo familia 2");
				String cf2 = in.nextLine();
				if(confirma(f)) {
					f.comprarPacotes(cf2);
				}
			}else if(opcao == 3) {
				System.out.println(" Combo Casal 3");
				String cc3 = in.nextLine();
				if(confirma(f)) {
					f.comprarPacotes(cc3);
				}
			}else if(opcao == 4) {
				System.out.println(" Combo Casal 4");
				String cc4 = in.nextLine();
				if(confirma(f)) {
					f.comprarPacotes(cc4);
				}
			}
			System.out.print("\n----------------------------------------");
			break;

			case 4: System.out.println( f.AlianzArena());
			break;
			
			case 5: System.out.println(" Digite 1 - para comprar 2000 mil creditos "
					               + "\n Digite 2 - para comprar 5000 mil creditos "
					               + "\n Digite 3 - para comprar 10.000 mil creditos ");
			double valor = Double.parseDouble(in.nextLine());
			if(valor == 1) {
				System.out.println(" compra Finalizada ! Sua conta possui agora "+f.comprarCreditos(valor)+ "creditos");
			}else if(valor == 2) {
				System.out.println(" compra Finalizada ! Sua conta possui agora "+f.comprarCreditos(valor)+ "creditos");
			}else if(valor == 3) {
				System.out.println(" compra Finalizada ! Sua conta possui agora "+f.comprarCreditos(valor)+ "creditos");
			}
			break;

			case 6:System.out.println(" 1- Pacote Meia Temporada +BUNDESLIGA-> no Valor de 3000 Reais + 10% "
					+"\n 2- Pacote toda Temporada +BUNDESLIGA +DFB POKAL-> no Valor de 5000Reais + 15% "
					+"\n 3-Pacote toda Temporada +BUNDESLIGA +DFB POKAL +CHAMPIONS LEAGUE -> no Valor de 8000 Reais + 30% ");
			double vip = Double.parseDouble(in.nextLine());
			if(vip == 1) {
                System.out.println(" Valor a pagar e "+ +f.vireSocio(vip));
                if(f.getCreditos() >= f.vireSocio(vip));
                novoValorVip1 = f.getCreditos() - f.vireSocio(vip);
                System.out.println("Compra Realizada com Sucesso!"
                		+ "\n Seu Saldo atua e aproximadamente de "+novoValorVip1);
				System.out.print("\n----------------------------------------");
				break;
				
			}else if(vip == 1) {
                System.out.println(" Valor a pagar e "+ +f.vireSocio(vip));
                if(f.getCreditos() >= f.vireSocio(vip));
                novoValorVip1 = f.getCreditos() - f.vireSocio(vip);
                System.out.println("Compra Realizada com Sucesso!"
                		+ "\n Seu Saldo atua e aproximadamente de "+novoValorVip1);
				System.out.print("\n----------------------------------------");
				break;
			} else if(vip == 1) {
                System.out.println(" Valor a pagar e "+ +f.vireSocio(vip));
                if(f.getCreditos() >= f.vireSocio(vip));
                novoValorVip1 = f.getCreditos() - f.vireSocio(vip);
                System.out.println("Compra Realizada com Sucesso!"
                		+ "\n Seu Saldo atua e aproximadamente de "+novoValorVip1);
				System.out.print("\n----------------------------------------");
				break;
			}
			}
		}while(op != 9);
	}
	private static boolean confirma(EstadioFutebol f) {
		Scanner in = new Scanner(System.in);
		int resposta;

		System.out.println("Confirmar compra "
				+ "\n 1 - Sim"
				+ "\n 2 - Não"
				+ "\n------------");
		resposta = Integer.parseInt(in.nextLine());
		if(resposta == 1) {
			return true;
		}else
			return false;	
	}

	private static void EstadioDaCasa(EstadioFutebol f) {

		Scanner in = new Scanner(System.in);

		System.out.print("Nome do Torcedor  ");
		f.setNomeTorcedor(in.nextLine());
		System.out.print("Idade do Torcedor ");
		f.setIdadeTorcedor(Integer.parseInt(in.nextLine()));
		System.out.print(" Identidade do Torcedor  ");
		f.setId(in.nextLine());

		f.setCreditos(0);


	}

}
