import java.util.Random;
import java.util.Scanner;
import java.io.File;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    
    public static void main (String[] args){
        Random myRandom;
        myRandom= new Random();
        
        Scanner sc = new Scanner(System.in);
        int numerointentos=1;
        int ultimoinput=0;
        int mynumber=myRandom.nextInt(10) + 1;      
        System.out.println("El numero random es:" + mynumber); 
           
        int i = sc.nextInt();
        ultimoinput=i;
        
        System.out.println("El input value es:" + i);
        
        while (i != mynumber) {
             System.out.println("Numero de intentos: "+numerointentos);
            
                  
             if (i > mynumber) {
                 System.out.println("too large");
                }
                 else 
                 {
                    System.out.println("too small");
                     
                    }
                    
             i = sc.nextInt();
             System.out.println("El input value en el while es:" + i);
             
             if (i != ultimoinput) {   
             numerointentos++;
             
             ultimoinput=i;
            }
                    
                    
                    
                }
        
          
          
        System.out.println("correct guess");
  
            }
    }

