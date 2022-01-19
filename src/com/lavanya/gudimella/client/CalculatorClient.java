package com.lavanya.gudimella.client;

import java.rmi.RemoteException;

import com.lavanya.gudimella.Service.CalculatorServiceProxy;

public class CalculatorClient {
	
	public static void main(String[] args) throws RemoteException {
		CalculatorServiceProxy calculatorServiceProxy = new CalculatorServiceProxy();
		
		int addition = calculatorServiceProxy.addition(3, 6);
		System.out.println("Addition : " +addition);	
	}
}
