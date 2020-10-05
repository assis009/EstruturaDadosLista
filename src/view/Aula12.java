package view;

import java.util.ArrayList;

public class Aula12 {
	 public static void main(String[] args) {
		
		 ArrayList<String> arraylist = new ArrayList<String>();// utilizando Classe ArrayList
		 
		 arraylist.add("A");
		 arraylist.add("B");
		 
		 System.out.println(arraylist);
		 
		 boolean existe = arraylist.contains("A");
		 
		 if(existe){
			 System.out.println("Elemento existe no vetor");
		 }else{
			 System.out.println("Elemento não existe no vetor");
		 }
	}
}
