package Exceptions;

import javax.swing.JOptionPane;

public class MainBateria {

	public static void main(String[] args) {
		Menu();
	}
	static NumOrdenado numO=new NumOrdenado();
	static Cifras cif=new Cifras();
	public static void Menu() {
		String opciones[]= {"Ejercicio 6","Ejercicio 7","Salir"};
		int opcion=JOptionPane.showOptionDialog(null, "¿Qué ejercicio desea realizar", "Menú ejercicios", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
		switch(opcion) {
		case 0:
		{
			Menu6();
		}
		Menu();
		break;
		case 1:
		{
			Menu7();
		}
		Menu();
		break;
		}
	}
	public static void Menu6() {
		String opc[]= {"Introducir datos","Ver datos"};
		int op=JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Menú Numeros ordenados Ejercicio 6", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc, null);
		switch(op) {
		case 0:
		{
			try {
				numO.Introducir();
			}
			catch(NumeroNoValido exc)
			{
				JOptionPane.showMessageDialog(null, exc.toString());
				//System.exit(1);
			}	
		}
		Menu6();
		break;
		case 1:
		{
			if(numO.Ordenados()==true) {
			JOptionPane.showMessageDialog(null, "los números introducidos son: "+numO.getX()+","+numO.getY()+","+numO.getZ()+" Y están ordenados.");
			}
			else JOptionPane.showMessageDialog(null, "los números introducidos son: "+numO.getX()+","+numO.getY()+","+numO.getZ()+" Y no están ordenados.");
		}
		Menu6();
		break;
		}
	}
	public static void Menu7() {
		String opc[]= {"Introducir número","Contar cifras"};
		int op=JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Menú Cifras Ejercicio 7", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc, null);
		switch(op) {
		case 0:
		{
			try {
				cif.Introducir();
			}
			catch(NumeroNoValido exc)
			{
				JOptionPane.showMessageDialog(null, exc.toString());
				//System.exit(1);
			}	
		}
		Menu7();
		break;
		case 1:
		{
			JOptionPane.showMessageDialog(null, "El número introducido ("+cif.getNum()+") tiene "+cif.Conteo()+" cifras");	
		}
		Menu7();
		break;
		}
	}
}
