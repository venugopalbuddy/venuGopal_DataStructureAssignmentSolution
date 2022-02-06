package com.Skyscraper.bussinesslogic;

import java.util.Collections;
import java.util.PriorityQueue;

public class Skyscraper {
	
	public void eachDay(int arr[]) {
		
		int len=arr.length;
		PriorityQueue <Integer> pqueue = new PriorityQueue <Integer> (Collections.reverseOrder());
		for( int i=0;i<arr.length;i++) {
			System.out.println("DAY "+(i+1)+":");
			pqueue.add(arr[i]);
			if (arr[i]==len) {
				int floor= pqueue.poll();
				System.out.print(floor+" ");
				len--;
				if (!pqueue.isEmpty()) {
					int top= pqueue.peek();
					while((floor-top)==1) {
						floor=pqueue.poll();
						System.out.print(floor+" ");
						len--;
						if(pqueue.isEmpty()) {
							break;
						}
						top=pqueue.peek();
					}
				}
				System.out.println();
			}
			else {
				System.out.println(" ");
			}
		}
	}

}
