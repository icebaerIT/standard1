
/**
 * AdvencedSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
package cn.gov.cnis.cssn.ws;
            

            /**
            *  AdvencedSearch bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AdvencedSearch
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://ws.cssn.cnis.gov.cn",
                "advencedSearch",
                "ns2");

            

                        /**
                        * field for OrgLoginName
                        */

                        
                                    protected java.lang.String localOrgLoginName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgLoginNameTracker = false ;

                           public boolean isOrgLoginNameSpecified(){
                               return localOrgLoginNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrgLoginName(){
                               return localOrgLoginName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgLoginName
                               */
                               public void setOrgLoginName(java.lang.String param){
                            localOrgLoginNameTracker = true;
                                   
                                            this.localOrgLoginName=param;
                                    

                               }
                            

                        /**
                        * field for Password
                        */

                        
                                    protected java.lang.String localPassword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordTracker = false ;

                           public boolean isPasswordSpecified(){
                               return localPasswordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPassword(){
                               return localPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Password
                               */
                               public void setPassword(java.lang.String param){
                            localPasswordTracker = true;
                                   
                                            this.localPassword=param;
                                    

                               }
                            

                        /**
                        * field for UkeyId
                        */

                        
                                    protected java.lang.String localUkeyId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUkeyIdTracker = false ;

                           public boolean isUkeyIdSpecified(){
                               return localUkeyIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUkeyId(){
                               return localUkeyId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UkeyId
                               */
                               public void setUkeyId(java.lang.String param){
                            localUkeyIdTracker = true;
                                   
                                            this.localUkeyId=param;
                                    

                               }
                            

                        /**
                        * field for OrgCode
                        */

                        
                                    protected java.lang.String localOrgCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgCodeTracker = false ;

                           public boolean isOrgCodeSpecified(){
                               return localOrgCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrgCode(){
                               return localOrgCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgCode
                               */
                               public void setOrgCode(java.lang.String param){
                            localOrgCodeTracker = true;
                                   
                                            this.localOrgCode=param;
                                    

                               }
                            

                        /**
                        * field for Keyword
                        */

                        
                                    protected java.lang.String localKeyword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeywordTracker = false ;

                           public boolean isKeywordSpecified(){
                               return localKeywordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeyword(){
                               return localKeyword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Keyword
                               */
                               public void setKeyword(java.lang.String param){
                            localKeywordTracker = true;
                                   
                                            this.localKeyword=param;
                                    

                               }
                            

                        /**
                        * field for StandardId
                        */

                        
                                    protected java.lang.String localStandardId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStandardIdTracker = false ;

                           public boolean isStandardIdSpecified(){
                               return localStandardIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStandardId(){
                               return localStandardId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StandardId
                               */
                               public void setStandardId(java.lang.String param){
                            localStandardIdTracker = true;
                                   
                                            this.localStandardId=param;
                                    

                               }
                            

                        /**
                        * field for StandardSort
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localStandardSort ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStandardSortTracker = false ;

                           public boolean isStandardSortSpecified(){
                               return localStandardSortTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getStandardSort(){
                               return localStandardSort;
                           }

                           
                        


                               
                              /**
                               * validate the array for StandardSort
                               */
                              protected void validateStandardSort(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param StandardSort
                              */
                              public void setStandardSort(java.lang.String[] param){
                              
                                   validateStandardSort(param);

                               localStandardSortTracker = true;
                                      
                                      this.localStandardSort=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addStandardSort(java.lang.String param){
                                   if (localStandardSort == null){
                                   localStandardSort = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localStandardSortTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localStandardSort);
                               list.add(param);
                               this.localStandardSort =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for IcsNum
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localIcsNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIcsNumTracker = false ;

                           public boolean isIcsNumSpecified(){
                               return localIcsNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getIcsNum(){
                               return localIcsNum;
                           }

                           
                        


                               
                              /**
                               * validate the array for IcsNum
                               */
                              protected void validateIcsNum(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IcsNum
                              */
                              public void setIcsNum(java.lang.String[] param){
                              
                                   validateIcsNum(param);

                               localIcsNumTracker = true;
                                      
                                      this.localIcsNum=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addIcsNum(java.lang.String param){
                                   if (localIcsNum == null){
                                   localIcsNum = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localIcsNumTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localIcsNum);
                               list.add(param);
                               this.localIcsNum =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for CcsNum
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localCcsNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCcsNumTracker = false ;

                           public boolean isCcsNumSpecified(){
                               return localCcsNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getCcsNum(){
                               return localCcsNum;
                           }

                           
                        


                               
                              /**
                               * validate the array for CcsNum
                               */
                              protected void validateCcsNum(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CcsNum
                              */
                              public void setCcsNum(java.lang.String[] param){
                              
                                   validateCcsNum(param);

                               localCcsNumTracker = true;
                                      
                                      this.localCcsNum=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addCcsNum(java.lang.String param){
                                   if (localCcsNum == null){
                                   localCcsNum = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localCcsNumTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCcsNum);
                               list.add(param);
                               this.localCcsNum =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Adopt
                        */

                        
                                    protected java.lang.String localAdopt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdoptTracker = false ;

                           public boolean isAdoptSpecified(){
                               return localAdoptTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdopt(){
                               return localAdopt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Adopt
                               */
                               public void setAdopt(java.lang.String param){
                            localAdoptTracker = true;
                                   
                                            this.localAdopt=param;
                                    

                               }
                            

                        /**
                        * field for PubYearBegin
                        */

                        
                                    protected java.lang.String localPubYearBegin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubYearBeginTracker = false ;

                           public boolean isPubYearBeginSpecified(){
                               return localPubYearBeginTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPubYearBegin(){
                               return localPubYearBegin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubYearBegin
                               */
                               public void setPubYearBegin(java.lang.String param){
                            localPubYearBeginTracker = true;
                                   
                                            this.localPubYearBegin=param;
                                    

                               }
                            

                        /**
                        * field for PubYearEnd
                        */

                        
                                    protected java.lang.String localPubYearEnd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubYearEndTracker = false ;

                           public boolean isPubYearEndSpecified(){
                               return localPubYearEndTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPubYearEnd(){
                               return localPubYearEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubYearEnd
                               */
                               public void setPubYearEnd(java.lang.String param){
                            localPubYearEndTracker = true;
                                   
                                            this.localPubYearEnd=param;
                                    

                               }
                            

                        /**
                        * field for StandardStatus
                        */

                        
                                    protected java.lang.String localStandardStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStandardStatusTracker = false ;

                           public boolean isStandardStatusSpecified(){
                               return localStandardStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStandardStatus(){
                               return localStandardStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StandardStatus
                               */
                               public void setStandardStatus(java.lang.String param){
                            localStandardStatusTracker = true;
                                   
                                            this.localStandardStatus=param;
                                    

                               }
                            

                        /**
                        * field for OrderBy
                        */

                        
                                    protected java.lang.String localOrderBy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderByTracker = false ;

                           public boolean isOrderBySpecified(){
                               return localOrderByTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrderBy(){
                               return localOrderBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrderBy
                               */
                               public void setOrderBy(java.lang.String param){
                            localOrderByTracker = true;
                                   
                                            this.localOrderBy=param;
                                    

                               }
                            

                        /**
                        * field for Ordering
                        */

                        
                                    protected java.lang.String localOrdering ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderingTracker = false ;

                           public boolean isOrderingSpecified(){
                               return localOrderingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrdering(){
                               return localOrdering;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ordering
                               */
                               public void setOrdering(java.lang.String param){
                            localOrderingTracker = true;
                                   
                                            this.localOrdering=param;
                                    

                               }
                            

                        /**
                        * field for IPageIndex
                        */

                        
                                    protected java.lang.String localIPageIndex ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIPageIndexTracker = false ;

                           public boolean isIPageIndexSpecified(){
                               return localIPageIndexTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIPageIndex(){
                               return localIPageIndex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IPageIndex
                               */
                               public void setIPageIndex(java.lang.String param){
                            localIPageIndexTracker = true;
                                   
                                            this.localIPageIndex=param;
                                    

                               }
                            

                        /**
                        * field for IPageSize
                        */

                        
                                    protected java.lang.String localIPageSize ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIPageSizeTracker = false ;

                           public boolean isIPageSizeSpecified(){
                               return localIPageSizeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIPageSize(){
                               return localIPageSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IPageSize
                               */
                               public void setIPageSize(java.lang.String param){
                            localIPageSizeTracker = true;
                                   
                                            this.localIPageSize=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://ws.cssn.cnis.gov.cn");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":advencedSearch",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "advencedSearch",
                           xmlWriter);
                   }

               
                   }
                if (localOrgLoginNameTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "orgLoginName", xmlWriter);
                             

                                          if (localOrgLoginName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrgLoginName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "password", xmlWriter);
                             

                                          if (localPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUkeyIdTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "ukeyId", xmlWriter);
                             

                                          if (localUkeyId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUkeyId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrgCodeTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "orgCode", xmlWriter);
                             

                                          if (localOrgCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrgCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localKeywordTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "keyword", xmlWriter);
                             

                                          if (localKeyword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localKeyword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStandardIdTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "standardId", xmlWriter);
                             

                                          if (localStandardId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStandardId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStandardSortTracker){
                             if (localStandardSort!=null) {
                                   namespace = "http://ws.cssn.cnis.gov.cn";
                                   for (int i = 0;i < localStandardSort.length;i++){
                                        
                                            if (localStandardSort[i] != null){
                                        
                                                writeStartElement(null, namespace, "standardSort", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStandardSort[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://ws.cssn.cnis.gov.cn";
                                                            writeStartElement(null, namespace, "standardSort", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://ws.cssn.cnis.gov.cn", "standardSort", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localIcsNumTracker){
                             if (localIcsNum!=null) {
                                   namespace = "http://ws.cssn.cnis.gov.cn";
                                   for (int i = 0;i < localIcsNum.length;i++){
                                        
                                            if (localIcsNum[i] != null){
                                        
                                                writeStartElement(null, namespace, "icsNum", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIcsNum[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://ws.cssn.cnis.gov.cn";
                                                            writeStartElement(null, namespace, "icsNum", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://ws.cssn.cnis.gov.cn", "icsNum", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localCcsNumTracker){
                             if (localCcsNum!=null) {
                                   namespace = "http://ws.cssn.cnis.gov.cn";
                                   for (int i = 0;i < localCcsNum.length;i++){
                                        
                                            if (localCcsNum[i] != null){
                                        
                                                writeStartElement(null, namespace, "ccsNum", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCcsNum[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://ws.cssn.cnis.gov.cn";
                                                            writeStartElement(null, namespace, "ccsNum", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://ws.cssn.cnis.gov.cn", "ccsNum", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localAdoptTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "Adopt", xmlWriter);
                             

                                          if (localAdopt==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdopt);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPubYearBeginTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "pubYearBegin", xmlWriter);
                             

                                          if (localPubYearBegin==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPubYearBegin);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPubYearEndTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "pubYearEnd", xmlWriter);
                             

                                          if (localPubYearEnd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPubYearEnd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStandardStatusTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "standardStatus", xmlWriter);
                             

                                          if (localStandardStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStandardStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrderByTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "orderBy", xmlWriter);
                             

                                          if (localOrderBy==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrderBy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrderingTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "ordering", xmlWriter);
                             

                                          if (localOrdering==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrdering);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIPageIndexTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "iPageIndex", xmlWriter);
                             

                                          if (localIPageIndex==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIPageIndex);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIPageSizeTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "iPageSize", xmlWriter);
                             

                                          if (localIPageSize==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIPageSize);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://ws.cssn.cnis.gov.cn")){
                return "ns2";
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

                 if (localOrgLoginNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "orgLoginName"));
                                 
                                         elementList.add(localOrgLoginName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgLoginName));
                                    } if (localPasswordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "password"));
                                 
                                         elementList.add(localPassword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
                                    } if (localUkeyIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "ukeyId"));
                                 
                                         elementList.add(localUkeyId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUkeyId));
                                    } if (localOrgCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "orgCode"));
                                 
                                         elementList.add(localOrgCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgCode));
                                    } if (localKeywordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "keyword"));
                                 
                                         elementList.add(localKeyword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyword));
                                    } if (localStandardIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "standardId"));
                                 
                                         elementList.add(localStandardId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStandardId));
                                    } if (localStandardSortTracker){
                            if (localStandardSort!=null){
                                  for (int i = 0;i < localStandardSort.length;i++){
                                      
                                         if (localStandardSort[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "standardSort"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStandardSort[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "standardSort"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "standardSort"));
                                    elementList.add(null);
                                
                            }

                        } if (localIcsNumTracker){
                            if (localIcsNum!=null){
                                  for (int i = 0;i < localIcsNum.length;i++){
                                      
                                         if (localIcsNum[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "icsNum"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIcsNum[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "icsNum"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "icsNum"));
                                    elementList.add(null);
                                
                            }

                        } if (localCcsNumTracker){
                            if (localCcsNum!=null){
                                  for (int i = 0;i < localCcsNum.length;i++){
                                      
                                         if (localCcsNum[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "ccsNum"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCcsNum[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "ccsNum"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                              "ccsNum"));
                                    elementList.add(null);
                                
                            }

                        } if (localAdoptTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "Adopt"));
                                 
                                         elementList.add(localAdopt==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdopt));
                                    } if (localPubYearBeginTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "pubYearBegin"));
                                 
                                         elementList.add(localPubYearBegin==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPubYearBegin));
                                    } if (localPubYearEndTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "pubYearEnd"));
                                 
                                         elementList.add(localPubYearEnd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPubYearEnd));
                                    } if (localStandardStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "standardStatus"));
                                 
                                         elementList.add(localStandardStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStandardStatus));
                                    } if (localOrderByTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "orderBy"));
                                 
                                         elementList.add(localOrderBy==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrderBy));
                                    } if (localOrderingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "ordering"));
                                 
                                         elementList.add(localOrdering==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrdering));
                                    } if (localIPageIndexTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "iPageIndex"));
                                 
                                         elementList.add(localIPageIndex==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIPageIndex));
                                    } if (localIPageSizeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "iPageSize"));
                                 
                                         elementList.add(localIPageSize==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIPageSize));
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
        public static AdvencedSearch parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AdvencedSearch object =
                new AdvencedSearch();

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
                    
                            if (!"advencedSearch".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AdvencedSearch)cn.gov.cnis.cssn.wssort.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","orgLoginName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrgLoginName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","password").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","ukeyId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUkeyId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","orgCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrgCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","keyword").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setKeyword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","standardId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStandardId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","standardSort").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list7.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list7.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone7 = false;
                                            while(!loopDone7){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone7 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","standardSort").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list7.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list7.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setStandardSort((java.lang.String[])
                                                        list7.toArray(new java.lang.String[list7.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","icsNum").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list8.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list8.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone8 = false;
                                            while(!loopDone8){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone8 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","icsNum").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list8.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone8 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setIcsNum((java.lang.String[])
                                                        list8.toArray(new java.lang.String[list8.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","ccsNum").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list9.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list9.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone9 = false;
                                            while(!loopDone9){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone9 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","ccsNum").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list9.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list9.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone9 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setCcsNum((java.lang.String[])
                                                        list9.toArray(new java.lang.String[list9.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","Adopt").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdopt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","pubYearBegin").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPubYearBegin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","pubYearEnd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPubYearEnd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","standardStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStandardStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","orderBy").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrderBy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","ordering").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrdering(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","iPageIndex").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIPageIndex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","iPageSize").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIPageSize(
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
           
    