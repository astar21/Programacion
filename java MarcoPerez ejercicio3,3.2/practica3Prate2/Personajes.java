package practica3Prate2;

public class Personajes {
private String clase;
private String raza;
private int nivel;
private int  bGanadas;
private int bPerdidas;

double tirada1;
double tirada2;

public Personajes (){
	
}
public Personajes(String clase, String raza, int nivel, int bPanadas, int bPerdidas) {
	super();
	this.clase = clase;
	this.raza = raza;
	this.nivel = nivel;
	this.bGanadas = bGanadas;
	this.bPerdidas = bPerdidas;
}
public Personajes(Personajes c){
	this.clase =c. clase;
	this.raza = c.raza;
	this.nivel =c. nivel;
	this.bGanadas = c.bGanadas;
	this.bPerdidas =c. bPerdidas;
}
public String getClase() {
	return clase;
}
public void setClase(String clase) {
	this.clase = clase;
}
public String getRaza() {
	return raza;
}
public void setRaza(String raza) {
	this.raza = raza;
}
public int getNivel() {
	return nivel;
}
public void setNivel(int nivel) {
	this.nivel = nivel;
}
public int getbPanadas() {
	return bGanadas;
}
public void setbPanadas(int bPanadas) {
	this.bGanadas = bPanadas;
}
public int getbPerdidas() {
	return bPerdidas;
}
public void setbPerdidas(int bPerdidas) {
	this.bPerdidas = bPerdidas;
}
public void ganar() {
		nivel++;
		bGanadas ++;
	System.out.println("Tu nivel a subido!!");
}
public void perder() {
	nivel--;
	bPerdidas ++;
	System.out.println("Tu nivel a bajado!!");
}
public void batalla(){
	System.out.println("un nuevo guerrero apareció");
	tirada1= Math.random()*10+nivel;
	System.out.println("la tirada "+ " de  raza  "+  raza  + "  de  clase  " +  clase  + " a  sido de " + tirada1);
	tirada2= Math.random()*10;
	System.out.println("la tirada del enemigo "+ tirada2);
	if(tirada1>tirada2){
		System.out.println("Has ganado");
		ganar();
		
	}else{
		System.out.println("has perdido!! ");
		perder();
	}
	
	
}
public void entrenar() {
	nivel++;
System.out.println("grrr grr grrr");
System.out.println("grrr grr grrr");
System.out.println("grrr grr grrr");

System.out.println("Tu nivel a subido!!");
}

public void menu(){
	System.out.println("Elige una de las opciones");
	System.out.println("1. Entrenar");
	System.out.println("2. Mostrar personaje");
	System.out.println("3 ir a batalla");
	System.out.println("4.  salir ");
	
}
public void spacio(){
	System.out.println("      ");
	System.out.println("      ");
	System.out.println("      ");
	System.out.println("      ");
	
}


}
