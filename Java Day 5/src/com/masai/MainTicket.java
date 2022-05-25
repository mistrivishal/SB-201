package com.masai;

import java.util.Scanner;

public class MainTicket {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no of bookings: ");
		int noOfBookings = scan.nextInt();
		System.out.println("Enter the available tickets: ");
		int availTicket = scan.nextInt();
		Ticket.setAvailableTickets(availTicket);
		for(int i = 0; i<noOfBookings;i++) {
			System.out.println("Enter the ticketid: ");
			int ticketID = scan.nextInt();
			System.out.println("Enter the price: ");
			int ticketPrice = scan.nextInt();
			System.out.println("Enter the no of tickets : ");
			int nooftickets = scan.nextInt();
			Ticket t1 = new Ticket(ticketID,ticketPrice);
			int totalPrice = t1.calculateTicketCost(nooftickets);
			System.out.println("Total amount: " + totalPrice);
			System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());

		}
		
	}
}
