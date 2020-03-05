package Exceptions;
import java.util.regex.*;
import javax.swing.JOptionPane;
public class Cifras {
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Cifras()
	{
		num=0;
	}
	public int Conteo() {
		String aux=String.valueOf(num);
		int res=aux.length();
		return res;
	}
	public void Introducir() throws NumeroNoValido
	{
		Pattern p=Pattern.compile("^([0-9])*$");
		String input=JOptionPane.showInputDialog("Introducir número");
		Matcher m=p.matcher(input);
		if(m.find()) 
		{
			num=Integer.parseInt(input);
		}
		else throw new NumeroNoValido(input);
	}
}
