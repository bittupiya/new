package com.maatic.harsh.practise.accessCollection;

public class Sorting {
	public static void main(String[] args) {
		int[] list = { 5, 8, 2, 0, 9 };
		int temp = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length -1; j++) {

				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		
		//for printing
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		for(int i = 0; i < list.length;i++) {
			if(list[i] == 2) {
				System.out.println(2 + "is found");
				break;
			}
			else {
				System.out.println(i + "is not found");
			}
		}
		
	}

}
