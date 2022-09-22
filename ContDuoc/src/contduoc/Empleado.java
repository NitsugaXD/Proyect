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
public class Empleado {
    //atributos
    private  String Nombres,apPaterno,apMaterno,dv,cargo;
    private  int rut,tipocargo,sueldobruto,cantidadhoras,dianac,mesnac,anonac,diacontr,mescontr,anocontr,descuentohorasnotrabajadas,sueldoimponible, descuentoprevisional,sueldoliquido;
    
//constructores

    public Empleado(String Nombres, String apPaterno, String apMaterno, String dv, String cargo, int rut, int tipocargo, int sueldobruto, int cantidadhoras, int dianac, int mesnac, int anonac, int diacontr, int mescontr, int anocontr, int descuentohorasnotrabajadas, int sueldoimponible, int descuentoprevisional, int sueldoliquido) {
        this.Nombres = Nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.dv = dv;
        this.cargo = cargo;
        this.rut = rut;
        this.tipocargo = tipocargo;
        this.sueldobruto = sueldobruto;
        this.cantidadhoras = cantidadhoras;
        this.dianac = dianac;
        this.mesnac = mesnac;
        this.anonac = anonac;
        this.diacontr = diacontr;
        this.mescontr = mescontr;
        this.anocontr = anocontr;
        this.descuentohorasnotrabajadas = descuentohorasnotrabajadas;
        this.sueldoimponible = sueldoimponible;
        this.descuentoprevisional = descuentoprevisional;
        this.sueldoliquido = sueldoliquido;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTipocargo() {
        return tipocargo;
    }

    public void setTipocargo(int tipocargo) {
        this.tipocargo = tipocargo;
    }

    public int getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(int sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    public int getCantidadhoras() {
        return cantidadhoras;
    }

    public void setCantidadhoras(int cantidadhoras) {
        this.cantidadhoras = cantidadhoras;
    }

    public int getDianac() {
        return dianac;
    }

    public void setDianac(int dianac) {
        this.dianac = dianac;
    }

    public int getMesnac() {
        return mesnac;
    }

    public void setMesnac(int mesnac) {
        this.mesnac = mesnac;
    }

    public int getAnonac() {
        return anonac;
    }

    public void setAnonac(int anonac) {
        this.anonac = anonac;
    }

    public int getDiacontr() {
        return diacontr;
    }

    public void setDiacontr(int diacontr) {
        this.diacontr = diacontr;
    }

    public int getMescontr() {
        return mescontr;
    }

    public void setMescontr(int mescontr) {
        this.mescontr = mescontr;
    }

    public int getAnocontr() {
        return anocontr;
    }

    public void setAnocontr(int anocontr) {
        this.anocontr = anocontr;
    }

    public int getDescuentohorasnotrabajadas() {
        return descuentohorasnotrabajadas;
    }

    public void setDescuentohorasnotrabajadas(int descuentohorasnotrabajadas) {
        this.descuentohorasnotrabajadas = descuentohorasnotrabajadas;
    }

    public int getSueldoimponible() {
        return sueldoimponible;
    }

    public void setSueldoimponible(int sueldoimponible) {
        this.sueldoimponible = sueldoimponible;
    }

    public int getDescuentoprevisional() {
        return descuentoprevisional;
    }

    public void setDescuentoprevisional(int descuentoprevisional) {
        this.descuentoprevisional = descuentoprevisional;
    }

    public int getSueldoliquido() {
        return sueldoliquido;
    }

    public void setSueldoliquido(int sueldoliquido) {
        this.sueldoliquido = sueldoliquido;
    }


}
    