package com.training;

import java.util.Scanner;

public class Solution {

	
	public static int findAvgBudgetByDirector() {
		
		return 0;
	}

	public static int findavgbudgetbydirector(Movie[] movies)
	{
	int sum=0;
			int count=0;
			int avg=0;

	for(int i=0;i<3;i++)
	{
	if(movies[i].getDirector().equals("GVM"))
	{
	count++;
	sum+=movies[i].getBudget();
	}
	
	if(sum>0)
	{
	avg= sum/count;
		}
	else
	{
	avg = 0;
	 }
	}
	return avg;
	}
	
	public static void main(String[] args) {
		
		Movie[] movies=new Movie[3];
		movies[0] = new Movie(1, "GVM", 2, 2000);
		movies[1] = new Movie(2, "ravi", 4, 5000);
		movies[2] = new Movie(3, "GVM", 12, 27000);
		
		int  result = findavgbudgetbydirector(movies);
		
		System.out.println(result);

	}
}
