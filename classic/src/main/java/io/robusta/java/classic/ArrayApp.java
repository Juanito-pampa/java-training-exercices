package io.robusta.java.classic;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {



    String[] buildEmptyArray(int size){
        String[] emptyArray = new String[size];
    	return emptyArray;
    } 

    int[] buildArray(int a, int b, int c){
        int[] array = {a,b,c};
    	return array;
    }


    boolean equality(int[] array1, int[] array2){
    	
    	int a = array1.length;
    	int b = array2.length;
    	if(a==b){
    		for(int i=0; i<a; i++){
    			if (array1[i]!=array2[i])
    				return false;
    		}
    			return true;
    		}
    	else
    		return false;
    }

    String asString (int [] numbers){
    	int a = numbers.length;
    	String b ="";	
    	for(int i=0; i<a; i++){
    			b = b + numbers[i] +":";
    		}
    		return b;
    }

    String asStringJoin (int [] numbers){
    	int a = numbers.length;
    	String b ="";	
    	for(int i=0; i<a-1; i++){
    			b = b + numbers[i] +":";
    		}
    	b = b + numbers[a-1];
    	return b;
    	
    	/*
    	 * string = string = asString(numbers);
    	 * string = string.substring(0, string.length()-1);
    	 */
    }

    String asString (String [] strings){
    	String chaine="";
        for (int i=0; i<strings.length; i++){
        	chaine += strings[i] + " ";
        }
        if (chaine != null && chaine.length() > 0) {
            chaine = chaine.substring(0, chaine.length() - 1);
        }
        return chaine;
    }

    String asString (Card [] cards){
        
    	String chaine="[";
    	for (int i = 0; i<cards.length; i++){
    		chaine += cards[i] + " ";
    	}
    	if (chaine != null && chaine.length() > 0) {
            chaine = chaine.substring(0, chaine.length() - 1);
        }
    	chaine += "]";
    	return chaine;
    	
    }

}
