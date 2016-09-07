
/**
 * OrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package cn.gov.cnis.cssn.wssort.xsd;
            

            /**
            *  OrderInfo bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class OrderInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = OrderInfo
                Namespace URI = http://wssort.cssn.cnis.gov.cn/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ActualPrice
                        */

                        
                                    protected java.lang.String localActualPrice ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActualPriceTracker = false ;

                           public boolean isActualPriceSpecified(){
                               return localActualPriceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getActualPrice(){
                               return localActualPrice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActualPrice
                               */
                               public void setActualPrice(java.lang.String param){
                            localActualPriceTracker = true;
                                   
                                            this.localActualPrice=param;
                                    

                               }
                            

                        /**
                        * field for ConfirmDate
                        */

                        
                                    protected java.lang.String localConfirmDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConfirmDateTracker = false ;

                           public boolean isConfirmDateSpecified(){
                               return localConfirmDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConfirmDate(){
                               return localConfirmDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConfirmDate
                               */
                               public void setConfirmDate(java.lang.String param){
                            localConfirmDateTracker = true;
                                   
                                            this.localConfirmDate=param;
                                    

                               }
                            

                        /**
                        * field for CreateDate
                        */

                        
                                    protected java.lang.String localCreateDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreateDateTracker = false ;

                           public boolean isCreateDateSpecified(){
                               return localCreateDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCreateDate(){
                               return localCreateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreateDate
                               */
                               public void setCreateDate(java.lang.String param){
                            localCreateDateTracker = true;
                                   
                                            this.localCreateDate=param;
                                    

                               }
                            

                        /**
                        * field for FinishDate
                        */

                        
                                    protected java.lang.String localFinishDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFinishDateTracker = false ;

                           public boolean isFinishDateSpecified(){
                               return localFinishDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFinishDate(){
                               return localFinishDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FinishDate
                               */
                               public void setFinishDate(java.lang.String param){
                            localFinishDateTracker = true;
                                   
                                            this.localFinishDate=param;
                                    

                               }
                            

                        /**
                        * field for LoginName
                        */

                        
                                    protected java.lang.String localLoginName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoginNameTracker = false ;

                           public boolean isLoginNameSpecified(){
                               return localLoginNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLoginName(){
                               return localLoginName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LoginName
                               */
                               public void setLoginName(java.lang.String param){
                            localLoginNameTracker = true;
                                   
                                            this.localLoginName=param;
                                    

                               }
                            

                        /**
                        * field for OrderId
                        */

                        
                                    protected java.lang.String localOrderId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderIdTracker = false ;

                           public boolean isOrderIdSpecified(){
                               return localOrderIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrderId(){
                               return localOrderId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrderId
                               */
                               public void setOrderId(java.lang.String param){
                            localOrderIdTracker = true;
                                   
                                            this.localOrderId=param;
                                    

                               }
                            

                        /**
                        * field for OrderItem
                        * This was an Array!
                        */

                        
                                    protected cn.gov.cnis.cssn.wssort.xsd.OrderItem[] localOrderItem ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderItemTracker = false ;

                           public boolean isOrderItemSpecified(){
                               return localOrderItemTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return cn.gov.cnis.cssn.wssort.xsd.OrderItem[]
                           */
                           public  cn.gov.cnis.cssn.wssort.xsd.OrderItem[] getOrderItem(){
                               return localOrderItem;
                           }

                           
                        


                               
                              /**
                               * validate the array for OrderItem
                               */
                              protected void validateOrderItem(cn.gov.cnis.cssn.wssort.xsd.OrderItem[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param OrderItem
                              */
                              public void setOrderItem(cn.gov.cnis.cssn.wssort.xsd.OrderItem[] param){
                              
                                   validateOrderItem(param);

                               localOrderItemTracker = true;
                                      
                                      this.localOrderItem=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param cn.gov.cnis.cssn.wssort.xsd.OrderItem
                             */
                             public void addOrderItem(cn.gov.cnis.cssn.wssort.xsd.OrderItem param){
                                   if (localOrderItem == null){
                                   localOrderItem = new cn.gov.cnis.cssn.wssort.xsd.OrderItem[]{};
                                   }

                            
                                 //update the setting tracker
                                localOrderItemTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localOrderItem);
                               list.add(param);
                               this.localOrderItem =
                             (cn.gov.cnis.cssn.wssort.xsd.OrderItem[])list.toArray(
                            new cn.gov.cnis.cssn.wssort.xsd.OrderItem[list.size()]);

                             }
                             

                        /**
                        * field for OrderStatus
                        */

                        
                                    protected java.lang.String localOrderStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderStatusTracker = false ;

                           public boolean isOrderStatusSpecified(){
                               return localOrderStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrderStatus(){
                               return localOrderStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrderStatus
                               */
                               public void setOrderStatus(java.lang.String param){
                            localOrderStatusTracker = true;
                                   
                                            this.localOrderStatus=param;
                                    

                               }
                            

                        /**
                        * field for OrderType
                        */

                        
                                    protected java.lang.String localOrderType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderTypeTracker = false ;

                           public boolean isOrderTypeSpecified(){
                               return localOrderTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrderType(){
                               return localOrderType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrderType
                               */
                               public void setOrderType(java.lang.String param){
                            localOrderTypeTracker = true;
                                   
                                            this.localOrderType=param;
                                    

                               }
                            

                        /**
                        * field for Pagination
                        */

                        
                                    protected cn.gov.cnis.cssn.wssort.xsd.Pagination localPagination ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPaginationTracker = false ;

                           public boolean isPaginationSpecified(){
                               return localPaginationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return cn.gov.cnis.cssn.wssort.xsd.Pagination
                           */
                           public  cn.gov.cnis.cssn.wssort.xsd.Pagination getPagination(){
                               return localPagination;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pagination
                               */
                               public void setPagination(cn.gov.cnis.cssn.wssort.xsd.Pagination param){
                            localPaginationTracker = true;
                                   
                                            this.localPagination=param;
                                    

                               }
                            

                        /**
                        * field for TotalPrice
                        */

                        
                                    protected java.lang.String localTotalPrice ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalPriceTracker = false ;

                           public boolean isTotalPriceSpecified(){
                               return localTotalPriceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTotalPrice(){
                               return localTotalPrice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalPrice
                               */
                               public void setTotalPrice(java.lang.String param){
                            localTotalPriceTracker = true;
                                   
                                            this.localTotalPrice=param;
                                    

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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://wssort.cssn.cnis.gov.cn/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":OrderInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "OrderInfo",
                           xmlWriter);
                   }

               
                   }
                if (localActualPriceTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "actualPrice", xmlWriter);
                             

                                          if (localActualPrice==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localActualPrice);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConfirmDateTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "confirmDate", xmlWriter);
                             

                                          if (localConfirmDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConfirmDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreateDateTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "createDate", xmlWriter);
                             

                                          if (localCreateDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCreateDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFinishDateTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "finishDate", xmlWriter);
                             

                                          if (localFinishDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFinishDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLoginNameTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "loginName", xmlWriter);
                             

                                          if (localLoginName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLoginName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrderIdTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "orderId", xmlWriter);
                             

                                          if (localOrderId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrderId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrderItemTracker){
                                       if (localOrderItem!=null){
                                            for (int i = 0;i < localOrderItem.length;i++){
                                                if (localOrderItem[i] != null){
                                                 localOrderItem[i].serialize(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","orderItem"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "orderItem", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "orderItem", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localOrderStatusTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "orderStatus", xmlWriter);
                             

                                          if (localOrderStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrderStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrderTypeTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "orderType", xmlWriter);
                             

                                          if (localOrderType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrderType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPaginationTracker){
                                    if (localPagination==null){

                                        writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "pagination", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPagination.serialize(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","pagination"),
                                        xmlWriter);
                                    }
                                } if (localTotalPriceTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "totalPrice", xmlWriter);
                             

                                          if (localTotalPrice==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTotalPrice);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://wssort.cssn.cnis.gov.cn/xsd")){
                return "ns1";
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

                 if (localActualPriceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "actualPrice"));
                                 
                                         elementList.add(localActualPrice==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActualPrice));
                                    } if (localConfirmDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "confirmDate"));
                                 
                                         elementList.add(localConfirmDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConfirmDate));
                                    } if (localCreateDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "createDate"));
                                 
                                         elementList.add(localCreateDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateDate));
                                    } if (localFinishDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "finishDate"));
                                 
                                         elementList.add(localFinishDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinishDate));
                                    } if (localLoginNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "loginName"));
                                 
                                         elementList.add(localLoginName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginName));
                                    } if (localOrderIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "orderId"));
                                 
                                         elementList.add(localOrderId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrderId));
                                    } if (localOrderItemTracker){
                             if (localOrderItem!=null) {
                                 for (int i = 0;i < localOrderItem.length;i++){

                                    if (localOrderItem[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "orderItem"));
                                         elementList.add(localOrderItem[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "orderItem"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "orderItem"));
                                        elementList.add(localOrderItem);
                                    
                             }

                        } if (localOrderStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "orderStatus"));
                                 
                                         elementList.add(localOrderStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrderStatus));
                                    } if (localOrderTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "orderType"));
                                 
                                         elementList.add(localOrderType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrderType));
                                    } if (localPaginationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "pagination"));
                            
                            
                                    elementList.add(localPagination==null?null:
                                    localPagination);
                                } if (localTotalPriceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "totalPrice"));
                                 
                                         elementList.add(localTotalPrice==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPrice));
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
        public static OrderInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OrderInfo object =
                new OrderInfo();

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
                    
                            if (!"OrderInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (OrderInfo)cn.gov.cnis.cssn.wssort.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","actualPrice").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setActualPrice(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","confirmDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConfirmDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","createDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","finishDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFinishDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","loginName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLoginName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","orderId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrderId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","orderItem").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list7.add(null);
                                                              reader.next();
                                                          } else {
                                                        list7.add(cn.gov.cnis.cssn.wssort.xsd.OrderItem.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","orderItem").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list7.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list7.add(cn.gov.cnis.cssn.wssort.xsd.OrderItem.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setOrderItem((cn.gov.cnis.cssn.wssort.xsd.OrderItem[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                cn.gov.cnis.cssn.wssort.xsd.OrderItem.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","orderStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrderStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","orderType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrderType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","pagination").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPagination(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPagination(cn.gov.cnis.cssn.wssort.xsd.Pagination.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","totalPrice").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalPrice(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
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
           
    