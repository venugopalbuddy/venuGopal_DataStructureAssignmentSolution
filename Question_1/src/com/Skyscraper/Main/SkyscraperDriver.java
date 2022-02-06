package com.Skyscraper.Main;

import java.util.Scanner;

import com.Skyscraper.bussinesslogic.Skyscraper;

public class SkyscraperDriver {

	static int arr[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Skyscraper skyscraper = new Skyscraper();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building:");
		int total_floors = sc.nextInt();
		arr= new int[total_floors];
		for(int i=0;i<total_floors;i++) {
			System.out.println("Enter the floor size given on day : "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("                                       ");
		System.out.println("The order of construction is as follows:");
		skyscraper.eachDay(arr);
		sc.close();
	}

}
