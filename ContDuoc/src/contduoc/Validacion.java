/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contduoc;

/**
 *
 * @author duran_xa
 */
public class Validacion {
    public String validarTipoCargo(int tipoCargo){
        String cargo = null;
        switch(tipoCargo){
            case 1 :
                cargo="Ayudane contador";
                break;
            case 2 :
                cargo="Contador General";
                break;
            case 3 :
                cargo = "Contador Tributario";
                break;
            case 4 :
                cargo="Personal Administrativo";
                break;           
        }
        return cargo;
        
    }
   public int calcularDescuentoPorHorasNoTrabajadas(int sueldobruto,int horasnotrabajadas){
        int descuentohorasnotrabajadas=(sueldobruto/180)*horasnotrabajadas;
        return descuentohorasnotrabajadas;
        
   }
   public int calcularSueldoImponible(int sueldobruto,int descuentohorasnotrabajadas){
   int sueldoimponible= sueldobruto - descuentohorasnotrabajadas;
   return sueldoimponible;
   } 
   public int calcularDescuentoPrevisionales(int sueldoimponible) {
    int descuentoprevisional = (int) (sueldoimponible*0.20);
    return descuentoprevisional;
    
    

}
public int calcularSueldoLiquido(int sueldoimpoible, int descuentoprevisional){
int sueldoliquido=sueldoimpoible-descuentoprevisional;
return sueldoliquido;
}


    }
 

