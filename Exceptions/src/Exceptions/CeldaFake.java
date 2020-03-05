package Exceptions;

public class CeldaFake extends Exception
{
	public CeldaFake()
	{
		super("El tablero solo llega hasta la celda 6, recuerda empieza en el 0");
	}
}
