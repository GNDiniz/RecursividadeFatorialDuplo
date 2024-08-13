package view;

import javax.swing.JOptionPane;

import controller.FatorialDuploController;

public class Principal {

	public static void main(String[] args) {
		FatorialDuploController fdc = new FatorialDuploController();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("informe um número inteiro ímpar:" ));
		while ((num % 2) == 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Você precisa informar um número inteiro ímpar:" ));
		}
		int fatorialDuplo = fdc.fatorialDuplo(num);
		System.out.println("O resultado do fatorial duplo de"+num+" é igual a: "+fatorialDuplo);
	}
}
