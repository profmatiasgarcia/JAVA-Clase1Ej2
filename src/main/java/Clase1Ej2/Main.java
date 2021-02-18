package Clase1Ej2;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class Main {

    /** EJEMPLO OPERADORES EN JAVA */

    public static void main(String[] args) {
        /* Operadores Aritmeticos */
        System.out.println("<<< Operaciones con enteros >>>");
        int ia = 7, ib = 3;
        int iSuma, iResto;

        iSuma = ia + ib;
        System.out.println("El resultado de la suma es " + iSuma);

        int iProducto = ia * ib;
        System.out.println("El resultado del producto es " + iProducto);

        System.out.println("El resultado del cociente es " + (ia / ib));

        iResto = ia % ib;
        System.out.println("El resto de la división entera es " + iResto);

        System.out.println("*****************************************");
        System.out.println("<<< Operaciones con números decimales >>>");

        double da = 7.5, db = 3.0;

        double dSuma = da + db;
        System.out.println("El resultado de la suma es " + dSuma);

        double dProducto = da * db;
        System.out.println("El resultado del producto es " + dProducto);

        double dCociente = da / db;
        System.out.println("El resultado del cociente es " + dCociente);

        System.out.println("El resto de la división es " + (da % db));

        /* Operadores de asignación */
        System.out.println("*****************************************");
        System.out.println("<<< Operadores de asignacion >>>");
        int j = 5;
        System.out.println("Valor de J: " + j);
        j += 3;
        System.out.println("Valor de J: " + j);
        System.out.println("Valor de J: " + (j *= 2));

        int i = 8;
        int a, b, c;
        System.out.println("\tantes\tdurante\tdespués");
        i = 8;
        a = i;
        b = i++;
        c = i;
        System.out.println("i++\t" + a + '\t' + b + '\t' + c);
        i = 8;
        a = i;
        b = i--;
        c = i;
        System.out.println("i--\t" + a + '\t' + b + '\t' + c);

        i = 8;
        a = i;
        b = ++i;
        c = i;
        System.out.println("++i\t" + a + '\t' + b + '\t' + c);
        i = 8;
        a = i;
        b = --i;
        c = i;
        System.out.println("--i\t" + a + '\t' + b + '\t' + c);

    }
}
