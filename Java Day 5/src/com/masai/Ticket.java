package com.masai;

public class Ticket {
	
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	public Ticket(int ticketid, int price) {
		this.ticketid = ticketid;
		this.price = price;
	}
	public Ticket() {

	}
	public int calculateTicketCost(int nooftickets) {
		if(Ticket.availableTickets - nooftickets >0) {
			Ticket.availableTickets = Ticket.availableTickets - nooftickets;
			int totalPrice = nooftickets*this.price;
			return totalPrice;
		}else {
			return -1;
		}
	}
	
}
