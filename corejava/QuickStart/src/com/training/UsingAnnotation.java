package com.training;

public class UsingAnnotation {

		@Example()
    public void show() {
         System.out.printf("Using Method Annotation");
     }

     public static void main(String arg[]) {
        
    	 UsingAnnotation obj = new UsingAnnotation();
    	 
    	   obj.show();
     }

}
