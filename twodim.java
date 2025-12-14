package com.acharya.classes;
import java.util.Scanner;

public class twodim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int[][] arr=new int[3][3];
		int count1 =0;
		int count2=0;
		int count3=0;
		System.out.println("Enter 9 element:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]>=1 &&arr[i][j]<=50) {
					count1++;
				}else if(arr[i][j]>50 && arr[i][j]<=50) {
					count2++;
				}else if(arr[i][j]<100) {
					count3++;
					
				}
			}
		}
		System.out.println("thr  number between 1 to 50:"+count1);
		System.out.println("thr  number between 50 to 100:"+count2);
		System.out.println("thr  number above 100:"+count3);
		

				
			}
		}
		
		

	


