
package com.mycompany.poo;
import java.util.Scanner;
import java.util.ArrayList;
public class ReportarProducto {
    static Scanner linea = new Scanner(System.in);
    static ArrayList<Producto> product = new ArrayList<>();
    static String i;
    
    public static void main(String[] args) {
        System.out.println("-----PRODUCTOS-----");
        System.out.println("1. Producto Congelado");
        System.out.println("2. Producto Fresco");
        System.out.println("3. Producto Refrigerado");
        try {
            System.out.println("Elegir area deseada:");
            int o = linea.nextInt();
            switch(o){
                case 1:
                    System.out.println("Nombre:");
                    String n = linea.nextLine();
                    System.out.println("Fecha de caducidad:");
                    String f= linea.nextLine();
                    System.out.println("Numero de lote:");
                    int num = linea.nextInt();
                    System.out.println("Temperatura:");
                    double t = linea.nextDouble();
                    ProductoCongelado pc1 = new ProductoCongelado(n,f,num,t);
                    break;
                case 2:
                    System.out.println("Nombre:");
                    String n1 = linea.nextLine();
                    System.out.println("Fecha de caducidad:");
                    String fc = linea.nextLine();
                    System.out.println("Numero de lote:");
                    int num1 = linea.nextInt();
                    System.out.println("Fecha de embasado:");
                    String fe = linea.nextLine();
                    System.out.println("Pais de origen:");
                    String p = linea.nextLine();
                    ProductoFresco pf1 = new ProductoFresco(n1,fc,num1,fe,p);
                    break;
                case 3:
                    System.out.println("Nombre:");
                    String n2 = linea.nextLine();
                    System.out.println("Fecha de caducidad:");
                    String f2= linea.nextLine();
                    System.out.println("Numero de lote:");
                    int num2 = linea.nextInt();
                    System.out.println("Codigo digesa:");
                    String c = linea.nextLine();
                    ProductoRefrigerado pr1 = new ProductoRefrigerado(n2,f2,num2,c);
                    break;
                default:
                    System.out.println("Ingresar una opcion correcta");
                
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: La entrada no es un número entero válido.");
            linea.nextLine(); 
            System.out.print("Por favor, ingrese un valor válido: ");
            i = linea.nextLine();
        }
        
        /*Producto p1 = new Producto("Mortadela", "12/12/2025", 4);
        Producto p2 = new Producto("Helado", "28/06/2025", 2);
        Producto p3 = new Producto("Manzanas", "04/05/2025", 6);
        Producto p4 = new Producto("Carne", "30/04/2025", 4);
        
        product.add(p1);
        product.add(p2);
        product.add(p3);
        product.add(p4);
        
        System.out.println("LOS PRODUCTOS YA ESTAN INGRESADOS");
        System.out.println("Mostrando Productos: ");
        int c = 1;
        for (Producto p : product) {
            System.out.println(c + ". " + product);
            c++;
        }
        
        System.out.println("Elegir el producto para ingresar al araea deseada:");
        
        int o1 = linea.nextInt();
        for (int j = 0; j <= c; j++) {
            
        }
        System.out.println("Visualizar productos dependiendo del tipo de producto");
        System.out.println("1. Producto Congelado");
        System.out.println("2. Producto Fresco");
        System.out.println("3. Producto Refrigerado");
        System.out.println("Ingresar una opcion:");
        i = linea.nextLine();
        switch(i){
            case 1:
                    
                    break;
            case 2:
                    
                    break;
            case 3:
                    
                    break;
            default:
                System.out.println("Ingrese una opcion valida");
        }*/
                
        //ImprimirProductos(p1);
    }
    
    public static void ImprimirProductos(Producto p){
        
    }

    
}
