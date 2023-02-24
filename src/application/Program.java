package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	
	public static void main (String[] args)  {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try{
		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Data do Check in: ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Data do check out: ");
		Date checkOut = sdf.parse(sc.next());
		
		Reservation reserv =new Reservation(number, checkIn, checkOut);
		System.out.println(reserv);
		
		System.out.println();
		System.out.println("Atualização de dada da reserva: ");
		System.out.println();
		System.out.println("Data do check in: ");
		checkIn =sdf.parse(sc.next());
		System.out.println("Data do check out: ");
		checkOut = sdf.parse(sc.next());
		
		reserv.updateDates(checkIn, checkOut);
		System.out.println(reserv);
		}
		catch(ParseException e) {
			System.out.println("Essa data é invalida");
		}
		catch(DomainException e ) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
