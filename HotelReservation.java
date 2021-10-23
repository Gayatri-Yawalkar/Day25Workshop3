package com.bridgelabz.hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class HotelReservation {
	ArrayList<Hotel> hotelList;
	Scanner sc;
	public HotelReservation() {
		hotelList=new ArrayList<>();
		sc=new Scanner(System.in);
	}
	public void add() {
		Hotel l=new Hotel("Lakewood",110,90,80,80);
		hotelList.add(l);
		Hotel b=new Hotel("Bridgewood",160,60,110,50);
		hotelList.add(b);
		Hotel r=new Hotel("Ridgewood",220,150,100,40);
		hotelList.add(r);
	}
	public static void main(String args[]) {
		HotelReservation reserve=new HotelReservation();
		System.out.println("Welcome to Hotel Reservation");
		reserve.add();
		System.out.println("Hotels are Added Successfully");
	}
}
