/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montoescrito;

import java.util.Scanner;

/**
 *
 * @author Jusot
 */
public class MontoEscrito {

    public static String montoUnidades(int d)
    {
        String Unidad="";
        if (d==1){
            Unidad="uno";
            return Unidad;
        }
        if (d==2)
            Unidad="dos";
        if (d==3)
            Unidad="tres";
        if (d==4)
            Unidad="cuatro";
        if (d==5)
            Unidad="cinco";
        if (d==6)
            Unidad="seis";
        if (d==7)
            Unidad="siete";
        if (d==8)
            Unidad="ocho";
        if (d==9)
            Unidad="nueve";
        return Unidad;
        
    }
    public static int tamanoNumero(int d)
    {
        int c=0;
        while (d>1){
            c=c+1;
            d=d/10;
        }
        return c;
    }
    public static String montoDecenas(int d)
    {
        int v=0;
        String Decenas="";
        String Unidades="";
        String Total="";
        if (d==10){
            Decenas="diez";
            Total=Decenas;
        }
        if (d==11){
            Decenas="once";
            Total=Decenas;
        }
        if (d==12){
            Decenas="doce";
            Total=Decenas;
        }
        if (d==13){
            Decenas="trece";
            Total=Decenas;
        }
        if (d==14){
            Decenas="catorce";
            Total=Decenas;
        }
        if (d==15){
            Decenas="quince";
            Total=Decenas;
        }
        if (d==16){
            Decenas="dieciseis";
            Total=Decenas;
        }
        if (d==17){
            Decenas="diecisiete";
            Total=Decenas;
        }
        if (d==18){
            Decenas="dieciocho";
            Total=Decenas;
        }
        if (d==19){
            Decenas="diecinueve";
            Total=Decenas;
        }
        if (d==20){
            Decenas="veinte";
            Total=Decenas;
        }
        if ((d>20) && (d<30)){
            Decenas="veinti";
            v=(int) (d%10);
            Unidades=montoUnidades(v);
            Total=Decenas+Unidades;
        }
        if (d==30){
            Decenas="teinta";
            Total=Decenas;
        }
        if ((d>30) && (d<40)){
            Decenas="treinta y ";
            v=(int) (d%10);
            Unidades=montoUnidades(v);
            Total=Decenas+Unidades;
        }
        if (d==40){
            Decenas="cuarenta";
            Total=Decenas;
        }
        if ((d>40) && (d<50)){
            Decenas="cuarenta y ";
            v=(int) (d%10);
            Unidades=montoUnidades(v);
            Total=Decenas+Unidades;
        }
        if (d==50){
            Decenas="cincuenta";
            Total=Decenas;
        }
        if ((d>50) && (d<60)){
            Decenas="cincuenta y ";
            v=(int) (d%10);
            Unidades=montoUnidades(v);
            Total=Decenas+Unidades;
        }
        if (d==60){
            Decenas="sesenta";
            Total=Decenas;
        }
        if ((d>60) && (d<70)){
            Decenas="sesenta y ";
            v=(int) (d%10);
            Unidades=montoUnidades(v);
            Total=Decenas+Unidades;
        }
        if (d==70){
            Decenas="setenta";
            Total=Decenas;
        }
        if ((d>70) && (d<80)){
            Decenas="setenta y ";
            v=(int) (d%10);
            Unidades=montoUnidades(v);
            Total=Decenas+Unidades;
        }
        if (d==80){
            Decenas="ochenta";
            Total=Decenas;
        }
        if ((d>80) && (d<90)){
            Decenas="ochenta y ";
            v=(int) (d%10);
            Unidades=montoUnidades(v);
            Total=Decenas+Unidades;
        }
        if (d==90){
            Decenas="noventa";
            Total=Decenas;
        }
        if ((d>90) && (d<100)){
            Decenas="noventa y ";
            v=(int) (d%10);
            Unidades=montoUnidades(v);
            Total=Decenas+Unidades;
        }
        if (d<10)
            Total=montoUnidades(d);
        return Total;
    }
        public static String montoCentenas(int d)
        {
        int u=0; int v=0;
        String Centenas="";
        String Decenas="";
        String Unidades="";
        String Total="";
        if (d==100)
            Centenas="cien ";
        if ((d>100) && (d<200)){
            Centenas="ciento ";
            v=(int) (d%100);
            Decenas=montoDecenas(v);
            Total=Centenas+Decenas;
        }
        if ((d>199) && (d<500)){
            u=(int) (d/100);
            Unidades=montoUnidades(u);
            Centenas="cientos ";
            v=(int) (d%100);
            Decenas=montoDecenas(v);
            Total=Unidades+Centenas+Decenas;
        }
        if ((d>499) && (d<600)){
            Centenas="quinientos ";
            v=(int) (d%100);
            Decenas=montoDecenas(v);
            Total=Centenas+Decenas;
        }
        if ((d>599) && (d<700)){
            u=(int) (d/100);
            Unidades=montoUnidades(u);
            Centenas="cientos ";
            v=(int) (d%100);
            Decenas=montoDecenas(v);
            Total=Unidades+Centenas+Decenas;
        }
        if ((d>699) && (d<800)){
            Centenas="setecientos ";
            v=(int) (d%100);
            Decenas=montoDecenas(v);
            Total=Centenas+Decenas;
        }
        if ((d>799) && (d<900)){
            u=(int) (d/100);
            Unidades=montoUnidades(u);
            Centenas="cientos ";
            v=(int) (d%100);
            Decenas=montoDecenas(v);
            Total=Unidades+Centenas+Decenas;
        }
        if ((d>899) && (d<1000)){
            Centenas="novecientos ";
           v=(int) (d%100);
            Decenas=montoDecenas(v);
            Total=Centenas+Decenas;
        }
        if (d<100)
           Total= montoDecenas(d);
        return Total;
        }

    public static String montoMil(int d)
    {
        int u=0; int v=0; int b=0;
        String Mil="";
        String Centenas=""; String Centenas1="";
        String Decenas=""; 
        String Total="";
        b=(int) d;
        if (b<100){
            Decenas=montoDecenas(b);
            Total=Mil+Decenas;
        }
        if ((b>99) && (b<1000)){
            Centenas=montoCentenas(b);
            Total=Mil+Centenas;
        }
        if (b==1000){
            Mil="mil";
            return Mil;
        }
        if ((b>1000) &&(b<2000)){
            v=(int) (d%1000);
            Mil=" mil ";
            Centenas=montoCentenas(v);
            Total=Mil+Centenas;           
        }
            
        if (b>1999){
            u=(int) (d/1000);
            v=(int) (d%1000);
            Centenas=montoCentenas(u);
            Mil=" mil ";
            Centenas1=montoCentenas(v);
            Total=Centenas+Mil+Centenas1;
        }
        return Total;
    }
    public static String montoMillo(int d)
    {
        int b=(int) d;
        String Millo="";
        String Mil="";
        String Decenas="";
        String Total="";
        if (b<1000000){
            Mil=montoMil(b);
            Total=Millo+Mil;
        }
        if (b>99999999){
            System.out.println("Error. Numero muy extenso");
            return Millo;
        }
        if (b==1000000)
        {
            Millo="un millon";
            return Millo;
        }
        if ((b>1000000) && (b<2000000))
        {
            int v=(int) (b%1000000);
            Millo="un millon ";
            Mil= montoMil(v);
            Total=Millo+Mil;
            return Total;
        }
        if (b>1999999){
        int u=(int) (b/1000000); 
        int v=(int) (b%1000000);
        Decenas=montoDecenas(u);
        Millo=" millones ";
        Mil=montoMil(v);
        Total=Decenas+Millo+Mil;
        }
        return Total;
    }
    public static String MontoEscrito(float n, int d, String unidad)
    {  
        int k=1;
        String Entero="";
        String Decimal="";
        String Unidades="";
        String Total="";
        String uni=unidad;
        int exponente=(int) Math.pow(10,d);
        float completo=(n*exponente);
        int decimal=(int) (completo%exponente);
        int entero=(int) n;
        int u=(tamanoNumero((int) decimal));
        int exp=(int) Math.pow(10,d);
        System.out.println("entero "+entero+"");
        System.out.println("decimal "+decimal+"");
        Entero=montoMillo(entero);
        if (decimal<1){
        Total=Entero+" || unidad de medida: "+uni;
        return Total;
        }
        if (decimal>0){
        while (exp>0){
        k=(decimal/exp);
        if (k==1)
        Decimal=Decimal+" "+"cero";
        Unidades=montoUnidades(k);
        Decimal=Decimal+" "+Unidades;
        decimal=(decimal%exp);
        exp=(exp/10);
        }
        }
        Total=Entero+" coma"+Decimal+" || unidad de medida: "+uni;
        return Total;
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("-----------------------");
        System.out.print("Escriba unidad de medida: ");
        String u= entrada.nextLine();
        System.out.println("-----------------------");
        System.out.println(" DIGITE UNA COMA PARA INDICAR DECIMAL ");
        System.out.print("Digite numero monto escrito: ");
        float d = entrada.nextFloat();
        System.out.print("Digite cantidad de decimales: ");
        int n = entrada.nextInt();
        System.out.println("-----------------------");
        System.out.println(""+MontoEscrito(d,n,u)+""); 
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("");
    }
    
}
