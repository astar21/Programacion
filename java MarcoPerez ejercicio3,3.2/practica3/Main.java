package practica3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//Cremos el scanner
Scanner sc=new Scanner(System.in);
//ponemos los onjetos
String nombreCliente,numeroCuenta;
double tipoInteres, saldo;
//cremos al primera cuenta 
Cuenta cuenta1 = new Cuenta();
//rellenamos la cuenta por consola
System.out.println("Dime tu nombre");
nombreCliente=sc.nextLine();
System.out.println("Dime tu cuenta");
numeroCuenta=sc.nextLine();
System.out.println("Escribe el tipo de interes");
tipoInteres=sc.nextDouble();
System.out.println("Escribe el saldo");
saldo=sc.nextDouble();

cuenta1.setNombreCliente(nombreCliente);

cuenta1.setNumeroCuenta(numeroCuenta);
cuenta1.setTipoInteres(tipoInteres);
cuenta1.setSaldo(saldo);
//cremos la  segunda cuenta
Cuenta cuenta2 = new Cuenta("Juan Ferrendez Rubio", "12345678901234567890", 1.75, 300);
//creamos la cipia de la 3 cuenta
Cuenta cuenta3 = new Cuenta(cuenta1);
System.out.println("Datos de la cuenta 1");
System.out.println("Nombre del titular: " + cuenta1.getNombreCliente());
System.out.println("Numero de cuenta: " + cuenta1.getNumeroCuenta());
System.out.println("Tipo de interes: " + cuenta1.getTipoInteres());
System.out.println("Saldo: " + cuenta1.getSaldo());
System.out.println();
//ingreso
cuenta1.ingreso(4000);
//Mostrar cuenta 1
System.out.println("Saldo: " + cuenta1.getSaldo());

System.out.println("Datos de la cuenta 2");
System.out.println("Nombre del titular: " + cuenta2.getNombreCliente());
System.out.println("Numero de cuenta: " + cuenta2.getNumeroCuenta());
System.out.println("Tipo de interes: " + cuenta2.getTipoInteres());
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();

System.out.println("Datos de la cuenta 3");
System.out.println("Nombre del titular: " + cuenta3.getNombreCliente());
System.out.println("Numero de cuenta: " + cuenta3.getNumeroCuenta());
System.out.println("Tipo de interes: " + cuenta3.getTipoInteres());
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();

cuenta3.transferencia(cuenta2, 10);

System.out.println("Saldo de la cuenta 2");
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();

System.out.println("Saldo de la cuenta 3");
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();



}





	}


