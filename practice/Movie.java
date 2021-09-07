package com.jonny.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movie implements Comparable<Movie> {
	
	
	private double rating;
	private String name;
	private int year;
	

	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}
	
	//constructor
	public Movie(String nm, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
		
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
	
	
}

//Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie>
{
 public int compare(Movie m1, Movie m2)
 {
     if (m1.getRating() < m2.getRating()) return -1;
     if (m1.getRating() > m2.getRating()) return 1;
     else return 0;
 }
}

//Class to compare Movies by name
class NameCompare implements Comparator<Movie>
{
 public int compare(Movie m1, Movie m2)
 {
     return m1.getName().compareTo(m2.getName());
 }
}

class Main {

	public static void main(String[] args) {
		
		
				
				ArrayList<Movie> list = new ArrayList<Movie>();
				list.add(new Movie("The Force Awakens", 8.3, 2015));
				list.add(new Movie("Star Wars", 8.7, 1977));
				list.add(new Movie("Empire Strikes Back", 8.8, 1980));
				list.add(new Movie("Return of the Jedi", 8.4, 1983));
				
				Collections.sort(list);
				
				System.out.println("Movies after sorting");
				for (Movie movie: list) {
					System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
				}
				
				// Call overloaded sort method with RatingCompare
		        // (Same three steps as above)
		        System.out.println("\nSorted by name");
		        NameCompare nameCompare = new NameCompare();
		        Collections.sort(list, nameCompare);
		        for (Movie movie: list)
		            System.out.println(movie.getName() + " " +
		                               movie.getRating() + " " +
		                               movie.getYear());
		 
		        // Uses Comparable to sort by year
		        System.out.println("\nSorted by year");
		        Collections.sort(list);
		        for (Movie movie: list)
		            System.out.println(movie.getYear() + " " +
		                               movie.getRating() + " " +
		                               movie.getName()+" ");
				
							
			}
			
		

}

