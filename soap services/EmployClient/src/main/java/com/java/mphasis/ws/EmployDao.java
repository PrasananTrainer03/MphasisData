/**
 * EmployDao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java.mphasis.ws;

public interface EmployDao extends java.rmi.Remote {
    public com.java.mphasis.ws.Employ[] showEmploy() throws java.rmi.RemoteException;
    public java.lang.String addEmploy(com.java.mphasis.ws.Employ employ) throws java.rmi.RemoteException;
}
