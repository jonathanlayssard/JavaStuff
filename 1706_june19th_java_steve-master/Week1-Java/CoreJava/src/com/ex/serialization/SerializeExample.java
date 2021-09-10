package com.ex.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * FUN FACT:
 * It's important to note that if any exception is thrown during serialization
 * then that exception is written to the output stream.
 * 		If that happens, and you try to deserialize, then a WriteAbortedException
 * 		is thrown, specifying "CAUSED BY" to be the exception thrown during
 * 		serialization.
 */
public class SerializeExample {
	
	public static void main(String[] args) {
		String filename = "src/com/ex/serialization/sampleObjectFile.txt";
		Person person = new Student(3.0); //is-a rule, inheritance
		
//		writeObject(filename, person);	//Serialization
		readObject(filename);			//deserialization
		
	}

	//Read in a flatten Java Object back into Java Code
	static void readObject(String filename){
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			Object obj = ois.readObject(); //deserialization
			System.out.println(obj);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	static void writeObject(String filename, Object obj){
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			
			oos.writeObject(obj); //serialization
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
