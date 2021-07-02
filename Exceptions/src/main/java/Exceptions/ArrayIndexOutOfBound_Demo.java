/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author imrul
 */
// Java program to demonstrate ArrayIndexOutOfBoundException
class ArrayIndexOutOfBound_Demo
{
	public static void main(String args[])
	{
		try{
			int a[] = new int[5];
			a[6] = 9; // accessing 7th element in an array of
					// size 5
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println ("Array Index is Out Of Bounds");
		}
	}
}
