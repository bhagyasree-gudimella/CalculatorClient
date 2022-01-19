/**
 * CalculatorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lavanya.gudimella.Service;

public interface CalculatorService extends java.rmi.Remote {
    public int division(int a, int b) throws java.rmi.RemoteException;
    public int addition(int a, int b) throws java.rmi.RemoteException;
    public int multiplication(int a, int b) throws java.rmi.RemoteException;
    public int subtraction(int a, int b) throws java.rmi.RemoteException;
    public int modulus(int a, int b) throws java.rmi.RemoteException;
}
