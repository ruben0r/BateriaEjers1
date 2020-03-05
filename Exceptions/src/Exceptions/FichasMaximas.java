package Exceptions;

public class FichasMaximas extends Exception 
{
	public FichasMaximas() 
	{
		super("No se pueden retirar más de 3 fichas, Regla 439/4 Aprenda a jugar :)");
	}
}
