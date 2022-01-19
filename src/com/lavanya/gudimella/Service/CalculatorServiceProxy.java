package com.lavanya.gudimella.Service;

public class CalculatorServiceProxy implements com.lavanya.gudimella.Service.CalculatorService {
  private String _endpoint = null;
  private com.lavanya.gudimella.Service.CalculatorService calculatorService = null;
  
  public CalculatorServiceProxy() {
    _initCalculatorServiceProxy();
  }
  
  public CalculatorServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorServiceProxy();
  }
  
  private void _initCalculatorServiceProxy() {
    try {
      calculatorService = (new com.lavanya.gudimella.Service.CalculatorServiceServiceLocator()).getCalculatorService();
      if (calculatorService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorService != null)
      ((javax.xml.rpc.Stub)calculatorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lavanya.gudimella.Service.CalculatorService getCalculatorService() {
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService;
  }
  
  public int division(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.division(a, b);
  }
  
  public int addition(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.addition(a, b);
  }
  
  public int multiplication(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.multiplication(a, b);
  }
  
  public int subtraction(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.subtraction(a, b);
  }
  
  public int modulus(int a, int b) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.modulus(a, b);
  }
}