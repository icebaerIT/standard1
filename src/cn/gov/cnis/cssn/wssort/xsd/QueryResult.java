
/**
 * QueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
       package cn.gov.cnis.cssn.wssort.xsd;
            

            /**
            *  QueryResult bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class QueryResult implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = QueryResult
                Namespace URI = http://wssort.cssn.cnis.gov.cn/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for LoginErr
                        */

                        
                                    protected java.lang.String localLoginErr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoginErrTracker = false ;

                           public boolean isLoginErrSpecified(){
                               return localLoginErrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLoginErr(){
                               return localLoginErr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LoginErr
                               */
                               public void setLoginErr(java.lang.String param){
                            localLoginErrTracker = true;
                                   
                                            this.localLoginErr=param;
                                    

                               }
                            

                        /**
                        * field for PageIndex
                        */

                        
                                    protected int localPageIndex ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPageIndexTracker = false ;

                           public boolean isPageIndexSpecified(){
                               return localPageIndexTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPageIndex(){
                               return localPageIndex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PageIndex
                               */
                               public void setPageIndex(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localPageIndexTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localPageIndex=param;
                                    

                               }
                            

                        /**
                        * field for PageSize
                        */

                        
                                    protected int localPageSize ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPageSizeTracker = false ;

                           public boolean isPageSizeSpecified(){
                               return localPageSizeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPageSize(){
                               return localPageSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PageSize
                               */
                               public void setPageSize(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localPageSizeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localPageSize=param;
                                    

                               }
                            

                        /**
                        * field for ProductStandard
                        * This was an Array!
                        */

                        
                                    protected com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[] localProductStandard ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductStandardTracker = false ;

                           public boolean isProductStandardSpecified(){
                               return localProductStandardTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[]
                           */
                           public  com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[] getProductStandard(){
                               return localProductStandard;
                           }

                           
                        


                               
                              /**
                               * validate the array for ProductStandard
                               */
                              protected void validateProductStandard(com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ProductStandard
                              */
                              public void setProductStandard(com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[] param){
                              
                                   validateProductStandard(param);

                               localProductStandardTracker = true;
                                      
                                      this.localProductStandard=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard
                             */
                             public void addProductStandard(com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard param){
                                   if (localProductStandard == null){
                                   localProductStandard = new com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[]{};
                                   }

                            
                                 //update the setting tracker
                                localProductStandardTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProductStandard);
                               list.add(param);
                               this.localProductStandard =
                             (com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[])list.toArray(
                            new com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[list.size()]);

                             }
                             

                        /**
                        * field for RecordCount
                        */

                        
                                    protected long localRecordCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecordCountTracker = false ;

                           public boolean isRecordCountSpecified(){
                               return localRecordCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRecordCount(){
                               return localRecordCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RecordCount
                               */
                               public void setRecordCount(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localRecordCountTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localRecordCount=param;
                                    

                               }
                            

                        /**
                        * field for ResultList
                        * This was an Array!
                        */

                        
                                    protected cn.gov.cnis.cssn.wssort.xsd.TrsStandard[] localResultList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResultListTracker = false ;

                           public boolean isResultListSpecified(){
                               return localResultListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return cn.gov.cnis.cssn.wssort.xsd.TrsStandard[]
                           */
                           public  cn.gov.cnis.cssn.wssort.xsd.TrsStandard[] getResultList(){
                               return localResultList;
                           }

                           
                        


                               
                              /**
                               * validate the array for ResultList
                               */
                              protected void validateResultList(cn.gov.cnis.cssn.wssort.xsd.TrsStandard[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ResultList
                              */
                              public void setResultList(cn.gov.cnis.cssn.wssort.xsd.TrsStandard[] param){
                              
                                   validateResultList(param);

                               localResultListTracker = true;
                                      
                                      this.localResultList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param cn.gov.cnis.cssn.wssort.xsd.TrsStandard
                             */
                             public void addResultList(cn.gov.cnis.cssn.wssort.xsd.TrsStandard param){
                                   if (localResultList == null){
                                   localResultList = new cn.gov.cnis.cssn.wssort.xsd.TrsStandard[]{};
                                   }

                            
                                 //update the setting tracker
                                localResultListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localResultList);
                               list.add(param);
                               this.localResultList =
                             (cn.gov.cnis.cssn.wssort.xsd.TrsStandard[])list.toArray(
                            new cn.gov.cnis.cssn.wssort.xsd.TrsStandard[list.size()]);

                             }
                             

                        /**
                        * field for ResultStr
                        */

                        
                                    protected java.lang.String localResultStr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResultStrTracker = false ;

                           public boolean isResultStrSpecified(){
                               return localResultStrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResultStr(){
                               return localResultStr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResultStr
                               */
                               public void setResultStr(java.lang.String param){
                            localResultStrTracker = true;
                                   
                                            this.localResultStr=param;
                                    

                               }
                            

                        /**
                        * field for StandList
                        * This was an Array!
                        */

                        
                                    protected cn.gov.cnis.cssn.wssort.xsd.StandardList[] localStandList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStandListTracker = false ;

                           public boolean isStandListSpecified(){
                               return localStandListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return cn.gov.cnis.cssn.wssort.xsd.StandardList[]
                           */
                           public  cn.gov.cnis.cssn.wssort.xsd.StandardList[] getStandList(){
                               return localStandList;
                           }

                           
                        


                               
                              /**
                               * validate the array for StandList
                               */
                              protected void validateStandList(cn.gov.cnis.cssn.wssort.xsd.StandardList[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param StandList
                              */
                              public void setStandList(cn.gov.cnis.cssn.wssort.xsd.StandardList[] param){
                              
                                   validateStandList(param);

                               localStandListTracker = true;
                                      
                                      this.localStandList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param cn.gov.cnis.cssn.wssort.xsd.StandardList
                             */
                             public void addStandList(cn.gov.cnis.cssn.wssort.xsd.StandardList param){
                                   if (localStandList == null){
                                   localStandList = new cn.gov.cnis.cssn.wssort.xsd.StandardList[]{};
                                   }

                            
                                 //update the setting tracker
                                localStandListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localStandList);
                               list.add(param);
                               this.localStandList =
                             (cn.gov.cnis.cssn.wssort.xsd.StandardList[])list.toArray(
                            new cn.gov.cnis.cssn.wssort.xsd.StandardList[list.size()]);

                             }
                             

                        /**
                        * field for TotalPage
                        */

                        
                                    protected int localTotalPage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalPageTracker = false ;

                           public boolean isTotalPageSpecified(){
                               return localTotalPageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalPage(){
                               return localTotalPage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalPage
                               */
                               public void setTotalPage(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTotalPageTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTotalPage=param;
                                    

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
                           namespacePrefix+":QueryResult",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "QueryResult",
                           xmlWriter);
                   }

               
                   }
                if (localLoginErrTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "loginErr", xmlWriter);
                             

                                          if (localLoginErr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLoginErr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPageIndexTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "pageIndex", xmlWriter);
                             
                                               if (localPageIndex==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pageIndex cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageIndex));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPageSizeTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "pageSize", xmlWriter);
                             
                                               if (localPageSize==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pageSize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageSize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProductStandardTracker){
                                       if (localProductStandard!=null){
                                            for (int i = 0;i < localProductStandard.length;i++){
                                                if (localProductStandard[i] != null){
                                                 localProductStandard[i].serialize(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","productStandard"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "productStandard", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "productStandard", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localRecordCountTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "recordCount", xmlWriter);
                             
                                               if (localRecordCount==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("recordCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecordCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResultListTracker){
                                       if (localResultList!=null){
                                            for (int i = 0;i < localResultList.length;i++){
                                                if (localResultList[i] != null){
                                                 localResultList[i].serialize(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","resultList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "resultList", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "resultList", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localResultStrTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "resultStr", xmlWriter);
                             

                                          if (localResultStr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResultStr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStandListTracker){
                                       if (localStandList!=null){
                                            for (int i = 0;i < localStandList.length;i++){
                                                if (localStandList[i] != null){
                                                 localStandList[i].serialize(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","standList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "standList", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://wssort.cssn.cnis.gov.cn/xsd", "standList", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localTotalPageTracker){
                                    namespace = "http://wssort.cssn.cnis.gov.cn/xsd";
                                    writeStartElement(null, namespace, "totalPage", xmlWriter);
                             
                                               if (localTotalPage==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("totalPage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPage));
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

                 if (localLoginErrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "loginErr"));
                                 
                                         elementList.add(localLoginErr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginErr));
                                    } if (localPageIndexTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "pageIndex"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageIndex));
                            } if (localPageSizeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "pageSize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageSize));
                            } if (localProductStandardTracker){
                             if (localProductStandard!=null) {
                                 for (int i = 0;i < localProductStandard.length;i++){

                                    if (localProductStandard[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "productStandard"));
                                         elementList.add(localProductStandard[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "productStandard"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "productStandard"));
                                        elementList.add(localProductStandard);
                                    
                             }

                        } if (localRecordCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "recordCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecordCount));
                            } if (localResultListTracker){
                             if (localResultList!=null) {
                                 for (int i = 0;i < localResultList.length;i++){

                                    if (localResultList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "resultList"));
                                         elementList.add(localResultList[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "resultList"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "resultList"));
                                        elementList.add(localResultList);
                                    
                             }

                        } if (localResultStrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "resultStr"));
                                 
                                         elementList.add(localResultStr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResultStr));
                                    } if (localStandListTracker){
                             if (localStandList!=null) {
                                 for (int i = 0;i < localStandList.length;i++){

                                    if (localStandList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "standList"));
                                         elementList.add(localStandList[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "standList"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                          "standList"));
                                        elementList.add(localStandList);
                                    
                             }

                        } if (localTotalPageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd",
                                                                      "totalPage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPage));
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
        public static QueryResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            QueryResult object =
                new QueryResult();

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
                    
                            if (!"QueryResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (QueryResult)cn.gov.cnis.cssn.wssort.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","loginErr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLoginErr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","pageIndex").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pageIndex" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPageIndex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPageIndex(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","pageSize").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pageSize" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPageSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPageSize(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","productStandard").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list4.add(null);
                                                              reader.next();
                                                          } else {
                                                        list4.add(com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
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
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","productStandard").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list4.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list4.add(com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProductStandard((com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.estarcom.cnis.cssn.salesystem.order.service.xsd.TProductStandard.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","recordCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"recordCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRecordCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRecordCount(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","resultList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                              reader.next();
                                                          } else {
                                                        list6.add(cn.gov.cnis.cssn.wssort.xsd.TrsStandard.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
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
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","resultList").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list6.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list6.add(cn.gov.cnis.cssn.wssort.xsd.TrsStandard.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setResultList((cn.gov.cnis.cssn.wssort.xsd.TrsStandard[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                cn.gov.cnis.cssn.wssort.xsd.TrsStandard.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","resultStr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResultStr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","standList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                              reader.next();
                                                          } else {
                                                        list8.add(cn.gov.cnis.cssn.wssort.xsd.StandardList.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
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
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","standList").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list8.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list8.add(cn.gov.cnis.cssn.wssort.xsd.StandardList.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setStandList((cn.gov.cnis.cssn.wssort.xsd.StandardList[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                cn.gov.cnis.cssn.wssort.xsd.StandardList.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://wssort.cssn.cnis.gov.cn/xsd","totalPage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"totalPage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalPage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTotalPage(java.lang.Integer.MIN_VALUE);
                                           
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
           
    