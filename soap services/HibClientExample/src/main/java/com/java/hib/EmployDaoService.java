/**
 * EmployDaoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java.hib;

public interface EmployDaoService extends javax.xml.rpc.Service {
    public java.lang.String getEmployDaoAddress();

    public com.java.hib.EmployDao getEmployDao() throws javax.xml.rpc.ServiceException;

    public com.java.hib.EmployDao getEmployDao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
