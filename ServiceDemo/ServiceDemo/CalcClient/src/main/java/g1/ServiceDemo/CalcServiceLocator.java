/**
 * CalcServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package g1.ServiceDemo;

public class CalcServiceLocator extends org.apache.axis.client.Service implements g1.ServiceDemo.CalcService {

    public CalcServiceLocator() {
    }


    public CalcServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalcServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Calc
    private java.lang.String Calc_address = "http://localhost:8080/ServiceDemo/services/Calc";

    public java.lang.String getCalcAddress() {
        return Calc_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalcWSDDServiceName = "Calc";

    public java.lang.String getCalcWSDDServiceName() {
        return CalcWSDDServiceName;
    }

    public void setCalcWSDDServiceName(java.lang.String name) {
        CalcWSDDServiceName = name;
    }

    public g1.ServiceDemo.Calc getCalc() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Calc_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalc(endpoint);
    }

    public g1.ServiceDemo.Calc getCalc(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            g1.ServiceDemo.CalcSoapBindingStub _stub = new g1.ServiceDemo.CalcSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalcWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalcEndpointAddress(java.lang.String address) {
        Calc_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (g1.ServiceDemo.Calc.class.isAssignableFrom(serviceEndpointInterface)) {
                g1.ServiceDemo.CalcSoapBindingStub _stub = new g1.ServiceDemo.CalcSoapBindingStub(new java.net.URL(Calc_address), this);
                _stub.setPortName(getCalcWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Calc".equals(inputPortName)) {
            return getCalc();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ServiceDemo.g1", "CalcService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ServiceDemo.g1", "Calc"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Calc".equals(portName)) {
            setCalcEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
