/**
Supuesto 1: Realiza un programa que lea un número entero e indique si es par.
Supuesto 2: Realiza un programa que lea un mes en formato numérico y un año e indique 
    el número de días de ese mes. Para realizar este ejercicio hay que tener en cuenta que 
    un año es bisiesto si es divisible por cuatro, excepto cuando es divisible por 100, 
    a no ser que sea divisible por 400.
Supuesto 3: Escribe un programa que lea un número y lo descomponga en factores primos.
Supuesto 4: Escribe un programa que solicite a un usuario su nombre y edad. Debe mostrarse 
cuantos años tendrá dentro de una década y clasificarle según su edad en A[0-25], B[26-50], C[51-...].
*/
    
package fernandez_sanchez_abraham_prog04_tarea;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abraham Fernandez Sanchez <brajanbb@gmail.com>
 */
public class Fernandez_sanchez_abraham_PROG04_Tarea {    
    
    public static void menu(){ 
        Scanner teclado = new Scanner(System.in);       
        int numMenu=0;
        System.out.println("***********************************");
        System.out.println("¿ Que supuesto quiere evaluar? \n* - Supuesto 1 : \"Pulsa 1\" \n* - Supuesto 2 : \"Pulsa 2\" "
                + "\n* - Supuesto 3 : \"Pulsa 3\" \n* - Supuesto 4 : \"Pulsa 4\" \n* - Salir      : \"Pulsa 5\"");
        System.out.println("***********************************");
        numMenu = teclado.nextInt();
        
        switch(numMenu){
            case 1: supuesto_01();
                break;
            case 2:supuesto_02();
                break;
            case 3:supuesto_03();
                break;    
            case 4:supuesto_04();              
                break;
            case 5: System.exit(0);  //metodo par salir del programa en ejecucion
                break;    
            default: System.err.println("No has elegido ninguna opcion valida");
                break; 
        }         
                    
      }
        
    public static void supuesto_01(){   
        int numSup01;String resEvalu=null;//variables
        Scanner teclado = new Scanner(System.in);// creacion de un objeto para poder utilizar los metodos de la clase Scanner
        System.out.println("Supuesto 1: Realiza un programa que lea un número entero e indique si es par.");  
        System.out.println("***********************************\nIntroduce el numero del que deseas averiguar si es par o impar");//Se realiza la consulta al usuario       
        numSup01 = teclado.nextInt();//introduccion de los datos por teclado en la variable asignada
        if(numSup01%2==0){ //si es par realizara las instrucciones suiguientes, de lo contrario realizara lo introducido en el else
            System.out.println("\nEl numero "+numSup01+" es un numero PAR");            
        }else{ System.out.println("\nEl numero "+numSup01+" es un numero IMPAR");  }
                
        System.err.println("\n¿Quiere evaluar otro numero ? S/N");    resEvalu=teclado.next();
        System.out.println("\n***********************************");
        if(resEvalu.equalsIgnoreCase("S")){
            supuesto_01();
        }else{  menu(); }
    }
    
    public static void supuesto_02(){
        int numSup02Year, numSup02Mes; String resEvalu; //variables        
        ArrayList<Integer> diasMeses = new ArrayList<Integer>();//arrayList con los dias corresponidentes a cada mes
            diasMeses.add(31);diasMeses.add(28);diasMeses.add(31);diasMeses.add(30);diasMeses.add(31);diasMeses.add(30);diasMeses.add(31);diasMeses.add(31);
            diasMeses.add(30);diasMeses.add(31);diasMeses.add(30);diasMeses.add(31);        
        ArrayList<String> nombreMeses = new ArrayList<String>();//array con los nombres de los meses
            nombreMeses.add("Enero");nombreMeses.add("Febrero");nombreMeses.add("Marzo");nombreMeses.add("Abril");nombreMeses.add("Mayo"); nombreMeses.add("Junio");
            nombreMeses.add("Julio");nombreMeses.add("Agosto"); nombreMeses.add("Septiembre");nombreMeses.add("Octubre");nombreMeses.add("Noviembre");nombreMeses.add("Diciembre");       
        
        Scanner teclado = new Scanner(System.in);// creacion de un objeto para poder utilizar los metodos de la clase Scanner
        System.out.println("Supuesto 2: Realiza un programa que lea un mes en formato numérico y un año e indique "
                + "\nel número de días de ese mes. Para realizar este ejercicio hay que tener en cuenta que "
                + "\nun año es bisiesto si es divisible por cuatro, excepto cuando es divisible por 100, "
                + "\na no ser que sea divisible por 400.");  
        System.out.println("***********************************\nIntroduce un año");//Se realiza la consulta al usuario 
        numSup02Year = teclado.nextInt();//introduccion de los datos por teclado en la variable asignada
        System.out.println("***********************************\nIntroduce un mes");//Se realiza la consulta al usuario 
        numSup02Mes = teclado.nextInt();//introduccion de los datos por teclado en la variable asignada
        System.out.println("\n***********************************"); 
        if(numSup02Year%4==0 && numSup02Year%100!=0){//si el año indicado es divisible entre 4 y no es divisible entre 100 realizara las siguientes sentencias    
            diasMeses.add(1,29);
            System.out.println("El año "+numSup02Year+ " es un año Bisiesto y el mes de "+nombreMeses.get(numSup02Mes-1)+" tiene "+diasMeses.get(numSup02Mes-1)+" dias");
        }else if(numSup02Year%100==0 && numSup02Year%400==0){//si el año es divisible entre 100 y entre 400 realizara las siguientes sentencias
            diasMeses.add(1,29);
            System.out.println("El año "+numSup02Year+ " es un año Bisiesto y el mes de "+nombreMeses.get(numSup02Mes-1)+" tiene "+diasMeses.get(numSup02Mes-1)+" dias");        
        }else{//si no cumple las condiciones anteriores realizara lo siguiente
            System.out.println("El año "+numSup02Year+ " no es un año Bisiesto y el mes de "+nombreMeses.get(numSup02Mes-1)+" tiene "+diasMeses.get(numSup02Mes-1)+" dias");
        } 
        System.out.println("\n***********************************");        
        System.err.println("¿Quiere evaluar otro mes y año ? S/N"); 
        resEvalu=teclado.next();
        System.out.println("\n***********************************");
        if(resEvalu.equalsIgnoreCase("S")){
            supuesto_02();
        }else{ menu(); }
    }
    
    public static void supuesto_03(){
        String resEvalu; int numSup03, contador = 0;//variables
        Scanner teclado = new Scanner(System.in);// creacion de un objeto para poder utilizar los metodos de la clase Scanner
        System.out.println("Supuesto 3: Escribe un programa que lea un número y lo descomponga en factores primos.");  
        System.out.println("***********************************\nIntroduce un numero a descomponer en numeros primos");//Se realiza la consulta al usuario      
        numSup03 = teclado.nextInt();//introduccion de los datos por teclado en la variable asignada         
            while(numSup03>1){
                 contador++;
                 if(numSup03%contador==0 && contador!=1){
                     System.err.println(numSup03+" | "+ contador);             
                     numSup03=numSup03/contador;
                     contador=0;  
                 }            
            }  
            System.err.println(1+" | ");  
        System.out.println("\n***********************************");        
        System.err.println("¿Quiere descomponer otro numero ? S/N"); resEvalu=teclado.next();       
        System.out.println("\n***********************************");
        if(resEvalu.equalsIgnoreCase("S")){
            supuesto_03();
        }else{  menu(); }  
    }
    
    public static void supuesto_04(){
        String nombre; int edad; String grupoEdad=null,resEvalu;//variables 
        Scanner teclado = new Scanner(System.in);// creacion de un objeto para poder utilizar los metodos de la clase Scanner
        System.out.println("Supuesto 4: Escribe un programa que solicite a un usuario su nombre y edad. Debe mostrarse \n" +
                            "cuantos años tendrá dentro de una década y clasificarle según su edad en A[0-25], B[26-50], C[51-...].");  
        System.out.println("***********************************\nIntroduce un nombre");//Se realiza la consulta al usuario   
        nombre = teclado.next();//introduccion de los datos por teclado en la variable asignada         
        System.out.println("\n***********************************");
        System.out.println("Introduce una edad");//Se realiza la consulta al usuario 
        edad = teclado.nextInt();//introduccion de los datos por teclado en la variable asignada         
        System.out.println("\n***********************************");
        if(edad>=0 && edad<=25){grupoEdad="A";}else if(edad>=26 && edad<=50){grupoEdad="B";}else if(edad>=51 ){grupoEdad="C";}//clasificacion de grupos por edades        
        switch(grupoEdad){//acciones a realizar segun el grupo de edad asignado
            case "A":System.err.println(nombre+" tiene actualmente "+edad+" años, dentro de 10 años tendra "+(edad+10)+"\ny segun su edad pertenece al grupo "+grupoEdad );
                break;
            case "B":System.err.println(nombre+" tiene actualmente "+edad+" años, dentro de 10 años tendra "+(edad+10)+"\ny segun su edad pertenece al grupo "+grupoEdad );
                break; 
            case "C":System.err.println(nombre+" tiene actualmente "+edad+" años, dentro de 10 años tendra "+(edad+10)+"\ny segun su edad pertenece al grupo "+grupoEdad );
                break;
            default:System.err.println("No se conoce el dato introducido");                
                break;        
        }  
        System.out.println("\n***********************************");        
        System.err.println("¿Quiere conocer los datos de otra persona? S/N"); resEvalu=teclado.next();       
        System.out.println("\n***********************************");
        if(resEvalu.equalsIgnoreCase("S")){
            supuesto_04();
        }else{  menu(); }        
    }   
        
    public static void main(String[] args) {
        menu();
    }    
}
