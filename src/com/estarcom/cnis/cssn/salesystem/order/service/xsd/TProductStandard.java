
/**
 * TProductStandard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.estarcom.cnis.cssn.salesystem.order.service.xsd;
            

            /**
            *  TProductStandard bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TProductStandard extends com.estarcom.cnis.cssn.salesystem.order.service.xsd.AbstractTProductStandard
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TProductStandard
                Namespace URI = http://service.order.salesystem.cssn.cnis.estarcom.com/xsd
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for _tpartorg
                        */

                        
                                    protected com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard local_tpartorg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean local_tpartorgTracker = false ;

                           public boolean is_tpartorgSpecified(){
                               return local_tpartorgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard
                           */
                           public  com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard get_tpartorg(){
                               return local_tpartorg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param _tpartorg
                               */
                               public void set_tpartorg(com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard param){
                            local_tpartorgTracker = true;
                                   
                                            this.local_tpartorg=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://service.order.salesystem.cssn.cnis.estarcom.com/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":TProductStandard",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TProductStandard",
                           xmlWriter);
                   }

                if (localA000Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a000", xmlWriter);
                             

                                          if (localA000==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA000);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA001Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a001", xmlWriter);
                             
                                               if (localA001==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA001));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA003Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a003", xmlWriter);
                             

                                          if (localA003==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA003);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA010Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a010", xmlWriter);
                             

                                          if (localA010==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA010);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA011Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a011", xmlWriter);
                             

                                          if (localA011==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA011);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA100Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a100", xmlWriter);
                             

                                          if (localA100==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA100);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA101Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a101", xmlWriter);
                             

                                          if (localA101==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA101);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA102Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a102", xmlWriter);
                             

                                          if (localA102==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA102);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA103Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a103", xmlWriter);
                             

                                          if (localA103==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA103);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA104Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a104", xmlWriter);
                             

                                          if (localA104==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA104);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA200Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a200", xmlWriter);
                             

                                          if (localA200==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA200);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA203Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a203", xmlWriter);
                             

                                          if (localA203==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA203);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA205Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a205", xmlWriter);
                             

                                          if (localA205==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA205);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA206Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a206", xmlWriter);
                             

                                          if (localA206==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA206);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA207Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a207", xmlWriter);
                             

                                          if (localA207==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA207);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA208Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a208", xmlWriter);
                             

                                          if (localA208==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA208);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA209Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a209", xmlWriter);
                             

                                          if (localA209==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA209);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA210Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a210", xmlWriter);
                             

                                          if (localA210==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA210);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA298Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a298", xmlWriter);
                             

                                          if (localA298==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA298);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA300Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a300", xmlWriter);
                             

                                          if (localA300==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA300);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA301Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a301", xmlWriter);
                             

                                          if (localA301==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA301);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA302Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a302", xmlWriter);
                             

                                          if (localA302==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA302);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA305Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a305", xmlWriter);
                             

                                          if (localA305==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA305);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA309Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a309", xmlWriter);
                             

                                          if (localA309==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA309);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA310Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a310", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localA310)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA310));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA311Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a311", xmlWriter);
                             

                                          if (localA311==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA311);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA330Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a330", xmlWriter);
                             

                                          if (localA330==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA330);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA404Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a404", xmlWriter);
                             

                                          if (localA404==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA404);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA409Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a409", xmlWriter);
                             

                                          if (localA409==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA409);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA448Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a448", xmlWriter);
                             

                                          if (localA448==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA448);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA461Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a461", xmlWriter);
                             

                                          if (localA461==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA461);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA462Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a462", xmlWriter);
                             

                                          if (localA462==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA462);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA502Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a502", xmlWriter);
                             

                                          if (localA502==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA502);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA505Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a505", xmlWriter);
                             

                                          if (localA505==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA505);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA800Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a800", xmlWriter);
                             

                                          if (localA800==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA800);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA805Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a805", xmlWriter);
                             

                                          if (localA805==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA805);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA820Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a820", xmlWriter);
                             

                                          if (localA820==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA820);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA821Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a821", xmlWriter);
                             

                                          if (localA821==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA821);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA823Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a823", xmlWriter);
                             

                                          if (localA823==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA823);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA824Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a824", xmlWriter);
                             

                                          if (localA824==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA824);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA825Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a825", xmlWriter);
                             

                                          if (localA825==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA825);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA826Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a826", xmlWriter);
                             

                                          if (localA826==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA826);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA835Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a835", xmlWriter);
                             

                                          if (localA835==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA835);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA836Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a836", xmlWriter);
                             

                                          if (localA836==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA836);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA837Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a837", xmlWriter);
                             

                                          if (localA837==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA837);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA838Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a838", xmlWriter);
                             

                                          if (localA838==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA838);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA842Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a842", xmlWriter);
                             

                                          if (localA842==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA842);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA845Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a845", xmlWriter);
                             

                                          if (localA845==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA845);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA846Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a846", xmlWriter);
                             

                                          if (localA846==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA846);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA847Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a847", xmlWriter);
                             

                                          if (localA847==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA847);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA850Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a850", xmlWriter);
                             

                                          if (localA850==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA850);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA855Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a855", xmlWriter);
                             

                                          if (localA855==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA855);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA860Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a860", xmlWriter);
                             

                                          if (localA860==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA860);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA861Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a861", xmlWriter);
                             

                                          if (localA861==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA861);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA863Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a863", xmlWriter);
                             

                                          if (localA863==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA863);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA864Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a864", xmlWriter);
                             

                                          if (localA864==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA864);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localA885Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "a885", xmlWriter);
                             

                                          if (localA885==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localA885);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localC001Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "c001", xmlWriter);
                             

                                          if (localC001==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localC001);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDrm_a001Tracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "drm_a001", xmlWriter);
                             
                                               if (localDrm_a001==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDrm_a001));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFileNameTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "fileName", xmlWriter);
                             

                                          if (localFileName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFileName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFilesizeTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "filesize", xmlWriter);
                             
                                               if (localFilesize==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("filesize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFilesize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFunctionTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "function", xmlWriter);
                             

                                          if (localFunction==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFunction);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHasElecTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "hasElec", xmlWriter);
                             

                                          if (localHasElec==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHasElec);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHashValueTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "hashValue", xmlWriter);
                             
                                               if (localHashValue==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("hashValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHashValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "id", xmlWriter);
                             
                                               if (localId==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLanguageTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "language", xmlWriter);
                             

                                          if (localLanguage==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLanguage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLegal_fromTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "legal_from", xmlWriter);
                             

                                          if (localLegal_from==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLegal_from);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPagenumTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "pagenum", xmlWriter);
                             
                                               if (localPagenum==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pagenum cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPagenum));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTcTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "tc", xmlWriter);
                             

                                          if (localTc==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUnitPriceTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "unitPrice", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localUnitPrice)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUnitPrice));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdateDateTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "updateDate", xmlWriter);
                             

                                          if (localUpdateDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdateTypeTracker){
                                    namespace = "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd";
                                    writeStartElement(null, namespace, "updateType", xmlWriter);
                             

                                          if (localUpdateType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdateType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (local_tpartorgTracker){
                                    if (local_tpartorg==null){

                                        writeStartElement(null, "http://service.order.salesystem.cssn.cnis.estarcom.com/xsd", "_tpartorg", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     local_tpartorg.serialize(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","_tpartorg"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd")){
                return "ns3";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","TProductStandard"));
                 if (localA000Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a000"));
                                 
                                         elementList.add(localA000==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA000));
                                    } if (localA001Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a001"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA001));
                            } if (localA003Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a003"));
                                 
                                         elementList.add(localA003==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA003));
                                    } if (localA010Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a010"));
                                 
                                         elementList.add(localA010==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA010));
                                    } if (localA011Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a011"));
                                 
                                         elementList.add(localA011==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA011));
                                    } if (localA100Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a100"));
                                 
                                         elementList.add(localA100==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA100));
                                    } if (localA101Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a101"));
                                 
                                         elementList.add(localA101==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA101));
                                    } if (localA102Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a102"));
                                 
                                         elementList.add(localA102==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA102));
                                    } if (localA103Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a103"));
                                 
                                         elementList.add(localA103==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA103));
                                    } if (localA104Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a104"));
                                 
                                         elementList.add(localA104==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA104));
                                    } if (localA200Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a200"));
                                 
                                         elementList.add(localA200==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA200));
                                    } if (localA203Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a203"));
                                 
                                         elementList.add(localA203==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA203));
                                    } if (localA205Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a205"));
                                 
                                         elementList.add(localA205==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA205));
                                    } if (localA206Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a206"));
                                 
                                         elementList.add(localA206==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA206));
                                    } if (localA207Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a207"));
                                 
                                         elementList.add(localA207==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA207));
                                    } if (localA208Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a208"));
                                 
                                         elementList.add(localA208==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA208));
                                    } if (localA209Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a209"));
                                 
                                         elementList.add(localA209==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA209));
                                    } if (localA210Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a210"));
                                 
                                         elementList.add(localA210==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA210));
                                    } if (localA298Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a298"));
                                 
                                         elementList.add(localA298==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA298));
                                    } if (localA300Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a300"));
                                 
                                         elementList.add(localA300==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA300));
                                    } if (localA301Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a301"));
                                 
                                         elementList.add(localA301==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA301));
                                    } if (localA302Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a302"));
                                 
                                         elementList.add(localA302==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA302));
                                    } if (localA305Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a305"));
                                 
                                         elementList.add(localA305==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA305));
                                    } if (localA309Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a309"));
                                 
                                         elementList.add(localA309==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA309));
                                    } if (localA310Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a310"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA310));
                            } if (localA311Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a311"));
                                 
                                         elementList.add(localA311==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA311));
                                    } if (localA330Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a330"));
                                 
                                         elementList.add(localA330==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA330));
                                    } if (localA404Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a404"));
                                 
                                         elementList.add(localA404==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA404));
                                    } if (localA409Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a409"));
                                 
                                         elementList.add(localA409==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA409));
                                    } if (localA448Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a448"));
                                 
                                         elementList.add(localA448==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA448));
                                    } if (localA461Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a461"));
                                 
                                         elementList.add(localA461==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA461));
                                    } if (localA462Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a462"));
                                 
                                         elementList.add(localA462==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA462));
                                    } if (localA502Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a502"));
                                 
                                         elementList.add(localA502==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA502));
                                    } if (localA505Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a505"));
                                 
                                         elementList.add(localA505==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA505));
                                    } if (localA800Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a800"));
                                 
                                         elementList.add(localA800==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA800));
                                    } if (localA805Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a805"));
                                 
                                         elementList.add(localA805==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA805));
                                    } if (localA820Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a820"));
                                 
                                         elementList.add(localA820==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA820));
                                    } if (localA821Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a821"));
                                 
                                         elementList.add(localA821==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA821));
                                    } if (localA823Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a823"));
                                 
                                         elementList.add(localA823==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA823));
                                    } if (localA824Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a824"));
                                 
                                         elementList.add(localA824==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA824));
                                    } if (localA825Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a825"));
                                 
                                         elementList.add(localA825==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA825));
                                    } if (localA826Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a826"));
                                 
                                         elementList.add(localA826==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA826));
                                    } if (localA835Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a835"));
                                 
                                         elementList.add(localA835==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA835));
                                    } if (localA836Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a836"));
                                 
                                         elementList.add(localA836==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA836));
                                    } if (localA837Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a837"));
                                 
                                         elementList.add(localA837==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA837));
                                    } if (localA838Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a838"));
                                 
                                         elementList.add(localA838==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA838));
                                    } if (localA842Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a842"));
                                 
                                         elementList.add(localA842==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA842));
                                    } if (localA845Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a845"));
                                 
                                         elementList.add(localA845==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA845));
                                    } if (localA846Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a846"));
                                 
                                         elementList.add(localA846==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA846));
                                    } if (localA847Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a847"));
                                 
                                         elementList.add(localA847==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA847));
                                    } if (localA850Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a850"));
                                 
                                         elementList.add(localA850==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA850));
                                    } if (localA855Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a855"));
                                 
                                         elementList.add(localA855==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA855));
                                    } if (localA860Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a860"));
                                 
                                         elementList.add(localA860==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA860));
                                    } if (localA861Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a861"));
                                 
                                         elementList.add(localA861==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA861));
                                    } if (localA863Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a863"));
                                 
                                         elementList.add(localA863==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA863));
                                    } if (localA864Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a864"));
                                 
                                         elementList.add(localA864==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA864));
                                    } if (localA885Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "a885"));
                                 
                                         elementList.add(localA885==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localA885));
                                    } if (localC001Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "c001"));
                                 
                                         elementList.add(localC001==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localC001));
                                    } if (localDrm_a001Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "drm_a001"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDrm_a001));
                            } if (localFileNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "fileName"));
                                 
                                         elementList.add(localFileName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileName));
                                    } if (localFilesizeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "filesize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFilesize));
                            } if (localFunctionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "function"));
                                 
                                         elementList.add(localFunction==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFunction));
                                    } if (localHasElecTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "hasElec"));
                                 
                                         elementList.add(localHasElec==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasElec));
                                    } if (localHashValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "hashValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHashValue));
                            } if (localIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "id"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                            } if (localLanguageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "language"));
                                 
                                         elementList.add(localLanguage==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguage));
                                    } if (localLegal_fromTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "legal_from"));
                                 
                                         elementList.add(localLegal_from==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLegal_from));
                                    } if (localPagenumTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "pagenum"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPagenum));
                            } if (localTcTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "tc"));
                                 
                                         elementList.add(localTc==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTc));
                                    } if (localUnitPriceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "unitPrice"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUnitPrice));
                            } if (localUpdateDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "updateDate"));
                                 
                                         elementList.add(localUpdateDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate));
                                    } if (localUpdateTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "updateType"));
                                 
                                         elementList.add(localUpdateType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateType));
                                    } if (local_tpartorgTracker){
                            elementList.add(new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd",
                                                                      "_tpartorg"));
                            
                            
                                    elementList.add(local_tpartorg==null?null:
                                    local_tpartorg);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static TProductStandard parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TProductStandard object =
                new TProductStandard();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"TProductStandard".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TProductStandard)cn.gov.cnis.cssn.wssort.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a000").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA000(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a001").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA001(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setA001(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setA001(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a003").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA003(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a010").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA010(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a011").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA011(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a100").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA100(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a101").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA101(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a102").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA102(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a103").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA103(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a104").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA104(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a200").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA200(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a203").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA203(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a205").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA205(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a206").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA206(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a207").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA207(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a208").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA208(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a209").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA209(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a210").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA210(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a298").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA298(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a300").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA300(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a301").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA301(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a302").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA302(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a305").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA305(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a309").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA309(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a310").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA310(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setA310(java.lang.Float.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setA310(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a311").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA311(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a330").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA330(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a404").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA404(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a409").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA409(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a448").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA448(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a461").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA461(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a462").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA462(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a502").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA502(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a505").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA505(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a800").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA800(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a805").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA805(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a820").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA820(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a821").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA821(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a823").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA823(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a824").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA824(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a825").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA825(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a826").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA826(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a835").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA835(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a836").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA836(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a837").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA837(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a838").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA838(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a842").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA842(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a845").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA845(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a846").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA846(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a847").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA847(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a850").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA850(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a855").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA855(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a860").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA860(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a861").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA861(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a863").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA863(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a864").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA864(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","a885").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setA885(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","c001").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setC001(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","drm_a001").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDrm_a001(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setDrm_a001(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDrm_a001(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","fileName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFileName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","filesize").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"filesize" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFilesize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFilesize(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","function").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFunction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","hasElec").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHasElec(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","hashValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"hashValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHashValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setHashValue(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","id").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setId(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setId(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","language").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLanguage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","legal_from").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLegal_from(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","pagenum").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pagenum" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPagenum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPagenum(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","tc").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","unitPrice").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUnitPrice(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setUnitPrice(java.lang.Float.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setUnitPrice(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","updateDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","updateType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdateType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.order.salesystem.cssn.cnis.estarcom.com/xsd","_tpartorg").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.set_tpartorg(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.set_tpartorg(com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    