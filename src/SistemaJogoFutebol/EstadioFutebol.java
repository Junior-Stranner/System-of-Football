package SistemaJogoFutebol;

import java.util.Scanner;

public class EstadioFutebol{
	private String nomeTorcedor;
	private int idadeTorcedor;
	private String id;
	private double creditos;


	

	public EstadioFutebol() {
		super();
		this.nomeTorcedor = nomeTorcedor;
		this.idadeTorcedor = idadeTorcedor;
		this.id = id;
		this.creditos = creditos;
		
	}
	public double vireSocio(double vip) {
		double novoValor = 0;
		if( vip == 1) {
			vip = 3000 * 1.10;
			novoValor = vip;
			
		}else if (vip == 2) {
			vip = 5000 * 1.15;
			novoValor = vip;
			
		}else if(vip == 3) {
			vip = 8000 * 1.30;
			novoValor = vip;
			
		}
		
	    return novoValor;
	}
	
	public double creditos(  ) {
		return this.creditos;
		
	}
	
	public double comprarCreditos(double valor) {
		if(valor  == 1) {
			this .creditos += 2000;
			return creditos;
		}else if(valor == 2) {
			this.creditos += 5000;
			return creditos;
		}else if(valor == 3) {
			this.creditos += 10.000;
			return creditos;
		}
		return creditos;
	}

	public String mostrarDados() {
		return "nome do Estadioome do Torcedor : "+this.nomeTorcedor
				+"\n idade do Torcedor : "+this.idadeTorcedor
				+"\n identidade do torcedor  : "+this.id
				+"\n ver Creditos do Torcedor : "+this.creditos;
		        
	}

	public String visualizaPacotes() {
		return "\n Promocões !!"
				+ "\n Combo Familia :"
				+ "\n 1 - 4 pesoas combo bebida/comida 200 reais"
				+ "\n 2 - 4 pessoa combo bebida 150 reais "
				+ "\n ---------------------"
				+ "\n Combo Casal : "
				+ "\n 1 - 2 pessoas combo bebida/comida 120 reais"
				+ "\n 1 - 2 pessoas combo bebida 90 reais"
				+ "\n------------------------"
				+ "                          ";
	}
	
	public void comprarPacotes(String cf1 ) {
			
		}
	
	public String AlianzArena() {
		 return " Feito Para a Copa do Mundo de 2006 em Munique ,\n O Alianz Arena até os dias de hj\n é  um dos "
		 		+ "Estadios mais modernos e bonito do mundo\n com a capacidade de 75.000 mil torcedores "
		 		+ " O time da Casa Bayern de Munique \n  ou em alemão Bayern Munchen \n "
		 		+ "consegue lotar o estadio em todos os jogos oficiais e não oficiais\n"
		 		+ "Sendo que 95% dos ingressos da temporada inteira já estao esgotados \n"
		 		+ "na pré temporada todos os anos"
		 		+ "\n---------------------------------------"
		 		+ ""
		 		+ "";
	}
	
	public String getNomeTorcedor() {
		return nomeTorcedor;
	}

	public void setNomeTorcedor(String nomeTorcedor) {
		this.nomeTorcedor = nomeTorcedor;
	}

	public int getIdadeTorcedor() {
		return idadeTorcedor;
	}

	public void setIdadeTorcedor(int idadeTorcedor) {
		this.idadeTorcedor = idadeTorcedor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCreditos() {
		return creditos;
	}

	public double setCreditos(double creditos) {
		return this.creditos = creditos;
	}


	

	
}