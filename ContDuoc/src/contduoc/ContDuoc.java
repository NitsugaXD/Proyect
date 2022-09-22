/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contduoc;
import java.util.Scanner;
/**
 *
 * @author duran_xa
 */
public class ContDuoc {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner entrada = new Scanner(System.in);  
        int opcion;
        Empleado persona = null;
        do{
            System.out.println("  MENU  ");
        System.out.println("1. Crear Empleado con su tipo de cargo.");
        System.out.println("2. Listar informacion del empleado y ejecutar metodos personalizados.");
        System.out.println("3. Salir");    
            
            opcion=entrada.nextInt();
            switch(opcion){
                
                
            
            // ingreso datos
case 1 :{
                System.out.println("REGISTRO DE EMPLEADO");
        
                System.out.println("Ingrese sus nombres: ");
                String Nombres = entrada.next();
        
                System.out.println("Ingrese su apellido paterno: ");
                String apPaterno=entrada.next();
        
                System.out.println("Ingrese su apellido materno: ");
                String apMaterno=entrada.next();
        
                System.out.println("Ingrese su run: ");
                int rut=entrada.nextInt();
        
                System.out.println("Ingrese su dv: ");
                String dv=entrada.next();
        
                System.out.println("Ingrese dia de nacimiento: ");
                int dianac=entrada.nextInt();
        
                System.out.println("Ingrese mes de nacimiento: ");
                int mesnac=entrada.nextInt();
        
                System.out.println("Ingrese año de nacimiento: ");
                int anonac=entrada.nextInt();
        
                System.out.println("Ingrese su tipo de cargo numerico:(Ayudante contador,Contador General,Contador Tributario,Personal Administrativo) ");
                int tipocargo=entrada.nextInt();
                
                Validacion valida = new Validacion();
                String cargo=valida.validarTipoCargo(tipocargo);
                
                
                System.out.println("Ingrese su sueldo bruto: ");
                int sueldobruto=entrada.nextInt();
                while (sueldobruto<=0){
                    System.out.println("DEBE SER MAYOR A 0");
                    sueldobruto=entrada.nextInt();}
                System.out.println("Ingrese la cantidad de horas trabajadas: ");
                int cantidadhoras=entrada.nextInt();
            
                while(0==cantidadhoras || cantidadhoras>=180){
                
                    System.out.println("DEBE SER ENTRE 0 Y 180");
                
                    cantidadhoras=entrada.nextInt();}
            
        
                System.out.println("Ingrese dia de contratacion: ");
                int diacontr=entrada.nextInt();
        
                System.out.println("Ingrese mes de contratacion: ");
                int mescontr=entrada.nextInt();
        
                System.out.println("Ingrese año de contratacion: ");
                int anocontr=entrada.nextInt();
                
                //validaciones
                int cantidadhorasnotrabajadas = 180 - cantidadhoras;
                int descuentohorasnotrabajadas=valida.calcularDescuentoPorHorasNoTrabajadas(sueldobruto, cantidadhorasnotrabajadas);
                int sueldoimponible=valida.calcularSueldoImponible(sueldobruto, descuentohorasnotrabajadas);
                int descuentoprevisional = valida.calcularDescuentoPrevisionales(sueldoimponible);
                int sueldoliquido=valida.calcularSueldoLiquido(sueldoimponible, descuentoprevisional);
                
                
                
                
                
                persona=new Empleado(Nombres,apPaterno,apMaterno,dv,cargo,rut,tipocargo,sueldobruto,cantidadhoras,dianac,mesnac,anonac,diacontr,mescontr,anocontr,descuentohorasnotrabajadas,sueldoimponible, descuentoprevisional,sueldoliquido);    
                //datos empleado    
                break;}

case 2 :{
                
                
                System.out.println("---------------------DATO EMPLEADO----------------");
                System.out.println("Nombre:                        "+persona.getNombres()+" "+persona.getApPaterno()+" "+persona.getApMaterno());
                System.out.println("Fecha Nacimiento:              "+persona.getDianac()+"/"+persona.getMesnac()+"/"+persona.getAnonac());
                System.out.println("------------------------CARGO---------------------");
                System.out.println("Nombre:                        "+persona.getCargo());
                System.out.println("Sueldo Bruto:                  "+persona.getSueldobruto());
                System.out.println("Horas Laborales Trabajadas:    "+persona.getCantidadhoras());
                System.out.println("Descuento horas no trabajadas: "+persona.getDescuentohorasnotrabajadas());
                System.out.println("Sueldo imponible:              "+persona.getSueldoimponible());
                System.out.println("Descuentos Previsionales:      "+persona.getDescuentoprevisional());
                System.out.println("Sueldo Liquido:                "+persona.getSueldoliquido());
                break;
                
            
}case 3 : {
                break;}
 
            
                    
        }
        }while(opcion!=3);
                }
}


              