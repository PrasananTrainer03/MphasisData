package com.java.mphasis.ws;

public class EmployDaoProxy implements com.java.mphasis.ws.EmployDao {
  private String _endpoint = null;
  private com.java.mphasis.ws.EmployDao employDao = null;
  
  public EmployDaoProxy() {
    _initEmployDaoProxy();
  }
  
  public EmployDaoProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployDaoProxy();
  }
  
  private void _initEmployDaoProxy() {
    try {
      employDao = (new com.java.mphasis.ws.EmployDaoServiceLocator()).getEmployDao();
      if (employDao != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employDao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employDao)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employDao != null)
      ((javax.xml.rpc.Stub)employDao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.java.mphasis.ws.EmployDao getEmployDao() {
    if (employDao == null)
      _initEmployDaoProxy();
    return employDao;
  }
  
  public com.java.mphasis.ws.Employ[] showEmploy() throws java.rmi.RemoteException{
    if (employDao == null)
      _initEmployDaoProxy();
    return employDao.showEmploy();
  }
  
  public java.lang.String addEmploy(com.java.mphasis.ws.Employ employ) throws java.rmi.RemoteException{
    if (employDao == null)
      _initEmployDaoProxy();
    return employDao.addEmploy(employ);
  }
  
  
}