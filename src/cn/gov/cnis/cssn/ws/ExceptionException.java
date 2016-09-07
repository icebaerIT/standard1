
/**
 * ExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package cn.gov.cnis.cssn.ws;

public class ExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1467351174463L;
    
    private cn.gov.cnis.cssn.ws.ExceptionE faultMessage;

    
        public ExceptionException() {
            super("ExceptionException");
        }

        public ExceptionException(java.lang.String s) {
           super(s);
        }

        public ExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(cn.gov.cnis.cssn.ws.ExceptionE msg){
       faultMessage = msg;
    }
    
    public cn.gov.cnis.cssn.ws.ExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    