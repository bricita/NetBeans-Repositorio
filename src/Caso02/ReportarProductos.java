
package Caso02;

import java.util.ArrayList;
import java.util.Scanner;

public class ReportarProductos {

    private static ArrayList<ProductoFresco>
            prodFresco = new ArrayList<>();
    private static ArrayList<ProductoRefrigerado>
            prodRefrigerado = new ArrayList<>();
    private static ArrayList<ProductoCongelado>
            prodCongelado= new ArrayList<>();
    public static void main(String[] args) {
        int op;
        do {
        
        Scanner linea = new Scanner(System.in);
        System.out.println("----------REPORTAR-PRODUCTOS----------");
        System.out.println("1.Producto congelado");
        System.out.println("2.Producto fresco");
        System.out.println("3.Producto refrigerado");
        System.out.println("4.Salir");
        System.out.println("--------------------------------------");
        System.out.println("Elegir opcion: ");
        op = linea.nextInt();
        
        switch(op){
            case 1:
                
                    int numeroLoteConge;
                    System.out.println("Ingresar nombre de producto: ");
                    String nombreConge = linea.next();
                    System.out.println("Ingresar fecha de caducidad: ");
                    String fechaConge = linea.next();
                    do {
                        System.out.println("Ingresar numero de lote: ");
                        numeroLoteConge = linea.nextInt();

                        if (numeroLoteConge < 0) {
                           System.out.println("Numero de lote no puede ser menor a cero!");
                            op = 1;
                        } else if (numeroLoteConge == 0) {
                           System.out.println("Numero de lote no puede ser igual a cero ");
                           op = 2;
                        } else {
                        op = 0;
                        }
                        } while (op != 0);
                    System.out.println("Ingrese temperatura de congelacion: ");
                    double temperaturaConge = linea.nextDouble();
                    ProductoCongelado PC = new ProductoCongelado(nombreConge,fechaConge,numeroLoteConge,temperaturaConge);
                    prodCongelado.add(PC);
                    break;
            case 2:
                    int numeroLoteFresco;
                    System.out.println("Ingresar nombre de producto: ");
                    String nombreFresco = linea.next();
                    System.out.println("Ingresar fecha de caducidad: ");
                    String fechaFresco = linea.next();
                    do {
                        System.out.println("Ingresar numero de lote: ");
                        numeroLoteFresco = linea.nextInt();
                        if (numeroLoteFresco < 0) {
                           System.out.println("Numero de lote no puede ser menor a cero!");
                            op = 1;
                        } else if (numeroLoteFresco== 0) {
                           System.out.println("Numero de lote no puede ser igual a cero ");
                           op = 2;
                        } else {
                        op = 0;
                        }
                    } while (op != 0);
                    
                    System.out.println("Ingrese fecha de envasado: ");
                    String fechaEnvasadoFresco = linea.next();
                    System.out.println("Ingrese pais de Origen");
                    String paisDeOrigenFresco = linea.next();
                    
                    ProductoFresco PF = new ProductoFresco(nombreFresco,fechaFresco,numeroLoteFresco,fechaEnvasadoFresco,paisDeOrigenFresco);
                    prodFresco.add(PF);
                break;
            case 3: 
                    int numeroLoteRefri;
                    System.out.println("Ingresar nombre de producto: ");
                    String nombreRefri = linea.next();
                    System.out.println("Ingresar fecha de caducidad: ");
                    String fechaRefri = linea.next();
                    do {
                        System.out.println("Ingresar numero de lote: ");
                        numeroLoteRefri = linea.nextInt();
                        if (numeroLoteRefri < 0) {
                           System.out.println("Numero de lote no puede ser menor a cero!");
                            op = 1;
                        } else if (numeroLoteRefri == 0) {
                           System.out.println("Numero de lote no puede ser igual a cero ");
                           op = 2;
                        } else {
                        op = 0;
                        }
                    } while (op != 0);
                    System.out.println("Ingrese codigo DIGESA: ");
                    String codigoDigesaRefri = linea.next();
                    
                    ProductoRefrigerado PR = new ProductoRefrigerado(nombreRefri,fechaRefri,numeroLoteRefri,codigoDigesaRefri);
                    prodRefrigerado.add(PR);
                break;
        }
        }while( op!= 0);
    }
}
