package de.hfu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static void main(String args[]) throws IOException{
		String input = System.console().readLine();//new BufferedReader(new InputStreamReader(System.in)).readLine();
		System.out.println(input.toUpperCase());}
	}
