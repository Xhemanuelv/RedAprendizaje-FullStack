/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooguia.entities;

/**
 *
 * @author Xhemanuelv
 */
public class CuentaBancaria {

    private String nombreCliente;
    private long clientDNI;
    private int numeroCuenta;
    private float saldo;
    private float interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(long clientDNI, int numeroCuenta, float saldo, float interes) {
        this.clientDNI = clientDNI;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public CuentaBancaria(String nombreCliente, long clientDNI, int numeroCuenta, float saldo, float interes) {
        this.nombreCliente = nombreCliente;
        this.clientDNI = clientDNI;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getClientDNI() {
        return clientDNI;
    }

    public void setClientDNI(long clientDNI) {
        this.clientDNI = clientDNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nombreCliente=" + nombreCliente + ", clientDNI=" + clientDNI + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", interes=" + interes + '}';
    }

}
