package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String Name = sc.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		String LastName = sc.nextLine();
		
		System.out.print("Inserisci il tuo colore preferito: ");
		String FavouriteColor = sc.nextLine();
		
		System.out.print("Inserisci il giorno in cui sei nato: ");
		int DayOfBirth = sc.nextInt();
		
		System.out.print("Inserisci il mese in cui sei nato: ");
		int MonthOfBirth = sc.nextInt();
		
		System.out.print("Inserisci l'anno in cui sei nato: ");
		int YearOfBirth = sc.nextInt();
		
		sc.close();
		
		String Password = Name + "-" + LastName + "-" + FavouriteColor + "-" + (DayOfBirth + MonthOfBirth + YearOfBirth);
		
		System.out.print("La tua passowrd é: " + Password);
	}
}
