package volume;

import javax.swing.JOptionPane;

public class volume {
		private int base;
		private int altura;
		private int comprimento;
		
		public void imprimeTela() {
			
			int base1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base: "));
			int altura1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura: "));
			int comprimento1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o comprimento: "));
			
			this.base = base1;
			this.altura = altura1;
			this.comprimento = comprimento1;
					
			JOptionPane.showMessageDialog(null, "O volume é: " + this.base * this.altura * this.comprimento);
			
		}
	}

