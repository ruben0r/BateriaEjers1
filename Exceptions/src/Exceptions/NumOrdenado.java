package Exceptions;
import java.util.regex.*;

import javax.swing.JOptionPane;
public class NumOrdenado {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	private int z;
	public NumOrdenado(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public NumOrdenado() {
		x=0;
		y=0;
		z=0;
	}
	public boolean Ordenados() {
		boolean comp=false;
		if(x<y & y<z) {
			comp=true;
		}
			
		return comp;
	}
	public void Introducir() throws NumeroNoValido {
		Pattern pat=Pattern.compile("^([0-9])*$");
		String x=JOptionPane.showInputDialog("Introduzca x");
		Matcher m=pat.matcher(x);
		if(m.find()) {
			this.x=Integer.parseInt(x);
		}
		else throw new NumeroNoValido(x);
		String y=JOptionPane.showInputDialog("Introduzca y");
		Matcher m1=pat.matcher(y);
		if(m1.find()) {
			this.y=Integer.parseInt(y);
		}
		else throw new NumeroNoValido(y);
		String z=JOptionPane.showInputDialog("Introduzca z");
		Matcher m2=pat.matcher(z);
		if(m2.find()) {
			this.z=Integer.parseInt(z);
		}
		else throw new NumeroNoValido(z);
	}
}
