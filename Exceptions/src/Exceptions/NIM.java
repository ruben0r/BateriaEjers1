package Exceptions;
import javax.swing.JOptionPane;

public class NIM {
	public int getI1() {
		return i1;
	}
	public void setI1(int i1) {
		this.i1 = i1;
	}
	public int getI2() {
		return i2;
	}
	public void setI2(int i2) {
		this.i2 = i2;
	}
	public boolean[][] getTablero() {
		return Tablero;
	}
	public void setTablero(boolean[][] tablero) {
		Tablero = tablero;
	}
	private int i1;
	private int i2;
	private boolean[][] Tablero;
	private int num=0;	
	private int cont=0;
	public NIM()
	{
		this.i1=21;
		this.i2=21;
		Tablero=new boolean[7][7];
	}
	public void CogerFichas() throws FichasMaximas, CeldaFake
	{
		
		for (int p=0;p<2;p++) {
			if(p==0) {
				num=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas fichas quieres mover, Jugador 1, es la jugada nº"+(cont+1)));
				//Queda poner que si le das a cancelar en los inputs se queda num==null y da error, excepción requerida.
			}
			else num=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas fichas quieres mover, Jugador 2, es la jugada nº"+(cont)));
			Comprobacion();
		for (int i=0;i<num;i++)
		{
			int[] fich=new int[2];
			int au=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición x de la ficha a coger"));
			int auxx=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición y de la ficha a coger"));
			if(au<=6 && au>=0 && auxx<=6 && auxx>=0) 
			{
				cont++;
			fich[0]=au;
			fich[1]=auxx;
			Win(p);
			}
			else throw new CeldaFake();
			if(Tablero[fich[0]][fich[1]]==false ) 
			{
				Tablero[fich[0]][fich[1]]=true;
				JOptionPane.showMessageDialog(null,"Has cogido la ficha de la posicion: "+fich[0]+","+fich[1]);
			}
			else JOptionPane.showMessageDialog(null,"No hay ninguna ficha donde has elegido");
		}
		}
	}
	public void ImprimirMatriz() 
	{
		String aux="";
		for (int i=0;i<Tablero.length;i++) 
		{
			for(int j=0;j<Tablero[0].length;j++)
			{
				if(Tablero[i][j]==true)
				{
				aux+="Q";
				}
				else if(Tablero[i][j]==false)aux+="H"; 
			}
			aux+="\n";
		}
		JOptionPane.showMessageDialog(null,aux);
	}
	public void Comprobacion() throws FichasMaximas
	{
		if (num<=3) 
		{
			
		}
		else throw new FichasMaximas();
	}
	public void Win(int p)
	{
		int aux=0;
		if(cont>=14) 
		{
			for (int i=0;i<Tablero.length;i++) 
			{
				for(int j=0;j<Tablero[0].length;j++)
				{
					if(Tablero[i][j]==false)
					{
						aux+=1;
					}
					else 
					{
						j=Tablero[0].length;
						i=Tablero.length;
					}
				}
			}
			if (aux==42)
			{
				JOptionPane.showMessageDialog(null,"Enhorabuena jugador número "+(p+1)+" eres un auténtico pro");
				System.exit(1);
			}
		}
	}
}