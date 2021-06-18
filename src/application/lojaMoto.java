package application;

import javax.swing.JOptionPane;

import entities.Honda;
import entities.Moto;
import entities.Suzuki;
import entities.Yamaha;

public class lojaMoto {

	public static void main(String[] args) {

		while(true) {
			try {
				String nome = JOptionPane.showInputDialog("Informe a marca [Cancel] para sair :");
				System.out.print(fabricaMoto(nome));
				
	} catch (Exception e) {
		break;
	}
		}
		
		System.out.println("\nPROGRAMA FINALIZADO!");
	}
	
	private static boolean fabricaMoto(String nome) {
		
		if(nome.equalsIgnoreCase("Honda")) {
			Moto moto = new Honda();
			mostrarDadosMoto(moto);
			
		} else if (nome.equalsIgnoreCase("Yamaha")) {
			Yamaha moto = new Yamaha();
			mostrarDadosMoto(moto);
		}
		
		else if (nome.equalsIgnoreCase("Suzuki")) {
			Suzuki moto = new Suzuki();
			mostrarDadosMoto(moto);
		}	
		
		else  {
			JOptionPane.showMessageDialog(null,
					"Somente disponiveis na loja: Honda, Yamaha e Suzuki",
					"Mensagem do programa", JOptionPane.CLOSED_OPTION);
		}
		return false;	
	}
	private static void mostrarDadosMoto(Moto moto) {
		JOptionPane.showMessageDialog(null,
				"\n : "+ moto.nome + "\nCilindrada: "+ 
						moto.cilindrada + "\nCor: "+ moto.cor,
						"Dados da moto", JOptionPane.CLOSED_OPTION);
	}
}
