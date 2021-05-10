package g1.ServiceDemo;

public class CalcProxy implements g1.ServiceDemo.Calc {
  private String _endpoint = null;
  private g1.ServiceDemo.Calc calc = null;
  
  public CalcProxy() {
    _initCalcProxy();
  }
  
  public CalcProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcProxy();
  }
  
  private void _initCalcProxy() {
    try {
      calc = (new g1.ServiceDemo.CalcServiceLocator()).getCalc();
      if (calc != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calc)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calc != null)
      ((javax.xml.rpc.Stub)calc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public g1.ServiceDemo.Calc getCalc() {
    if (calc == null)
      _initCalcProxy();
    return calc;
  }
  
  public int sum(int a, int b) throws java.rmi.RemoteException{
    if (calc == null)
      _initCalcProxy();
    return calc.sum(a, b);
  }
  
  public int sub(int a, int b) throws java.rmi.RemoteException{
    if (calc == null)
      _initCalcProxy();
    return calc.sub(a, b);
  }
  
  public int mult(int a, int b) throws java.rmi.RemoteException{
    if (calc == null)
      _initCalcProxy();
    return calc.mult(a, b);
  }
  
  
}