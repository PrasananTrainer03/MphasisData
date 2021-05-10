/**
 * CalcService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package g1.ServiceDemo;

public interface CalcService extends javax.xml.rpc.Service {
    public java.lang.String getCalcAddress();

    public g1.ServiceDemo.Calc getCalc() throws javax.xml.rpc.ServiceException;

    public g1.ServiceDemo.Calc getCalc(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
