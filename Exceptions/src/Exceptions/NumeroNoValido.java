package Exceptions;

public class NumeroNoValido extends Exception 
{
	public NumeroNoValido(String num) 
	{
		super("No ha introducido un número ;( "+num);
	}
}
