package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	
	public static void main (String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		System.out.println("Qual o numero do quarto");
		int number = sc.nextInt();
		System.out.println("Data do check-in (dd/MM/yyyy) :");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Data do check-out (dd/MM/yyyy) :");
		Date checkOut =sdf.parse(sc.next());
		
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			System.out.println("Erro de reserva - Reserva so pode ser realizada para datas futuras");
		}else {
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Essa data é invalida");
		}
		else {
			Reservation reserv = new Reservation(number, checkIn, checkOut);
			System.out.println(reserv);
			
			System.out.println("Entre com as informaçoes para atualizar a reserva :");
			System.out.println("Data do check-in (dd/MM/yyyy) :");
			checkIn = sdf.parse(sc.next());
			System.out.println("Data do check-out (dd/MM/yyyy) :");
			checkOut =sdf.parse(sc.next());
				
				String error = reserv.updateDates(checkIn, checkOut);
			
				if(error != null) {		 
				reserv.updateDates(checkIn, checkOut);
				System.out.println("Essa data é invalida");
				
				}else {
				System.out.println(reserv);
			
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}}
