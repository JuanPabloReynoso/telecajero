package cajero.java;

import java.util.Scanner;

public class telecajero {
	
	public static void main(String[] args) {

		System.out.println("Telecajero JPR");
		System.out.println("Bienvenido/a al Telecajero JPR");
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("Ingrese su Tarjeta");
	    String tarjeta = teclado.next();
	    System.out.println("Ingrese su Clave para acceder a la cuenta");
	    String clave = teclado.next();
	    if (clave.equals("1234")) {
	    	double saldo = 50000;
	    	String opcion = "0";
	    	
	    while (!opcion.equals("4")) {
	    	System.out.println("Cajero JPR");
	    	System.out.println("OPCION 1 - Consultar saldo");
	    	System.out.println("OPCION 2 - Realizar un deposito");
	    	System.out.println("OPCION 3 - Retirar efectivo");
	    	System.out.println("OPCION 4 - Salir");
	    	opcion = teclado.next();
	    	
	    	switch(opcion) {
	    	case "1" : {
	    		System.out.println("El saldo de la tarjeta es " + Double.toString(saldo));
	    		break;
	    	}
	    	case "2" : {
	    		System.out.println("Depositar efectivo");
	    		System.out.println("Ingrese el monto a depositar");
	    		double deposito = teclado.nextDouble();
	    		if (deposito>0) {
	    			saldo = saldo + deposito;
	    		} else {
	    			System.out.println("Error, monto incorrecto");
	    		}
	    		break;
	    	}
	    	case "3": {
	    		System.out.println("Retirar efectivo");
	    		double montoRet = teclado.nextDouble();
	    		if (montoRet<=saldo) {
	    			saldo = saldo - montoRet;
	    		} else {
	    			System.out.println("Saldo insuficiente");
	    		}
	    		break;
	    	}
	    	
	    	case "4": {	
	    	       System.out.println("Gracias por utilizar nuestros servicios");
	    	       break;
	    	}
	    	default: {
	    		System.out.println("Opcion incorrecta");
	    		break;
	    	}
	    	
	    
	    	}
	      }
	    } else {
	    	System.out.println("Clave incorrecta, vuelva a realizar el proceso");
	    }
	}
}
		
		
		
		

	