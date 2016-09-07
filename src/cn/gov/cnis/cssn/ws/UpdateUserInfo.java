
/**
 * UpdateUserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package cn.gov.cnis.cssn.ws;
            

            /**
            *  UpdateUserInfo bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class UpdateUserInfo
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://ws.cssn.cnis.gov.cn",
                "updateUserInfo",
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
                        * field for Update_loginName
                        */

                        
                                    protected java.lang.String localUpdate_loginName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_loginNameTracker = false ;

                           public boolean isUpdate_loginNameSpecified(){
                               return localUpdate_loginNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_loginName(){
                               return localUpdate_loginName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_loginName
                               */
                               public void setUpdate_loginName(java.lang.String param){
                            localUpdate_loginNameTracker = true;
                                   
                                            this.localUpdate_loginName=param;
                                    

                               }
                            

                        /**
                        * field for Update_password
                        */

                        
                                    protected java.lang.String localUpdate_password ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_passwordTracker = false ;

                           public boolean isUpdate_passwordSpecified(){
                               return localUpdate_passwordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_password(){
                               return localUpdate_password;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_password
                               */
                               public void setUpdate_password(java.lang.String param){
                            localUpdate_passwordTracker = true;
                                   
                                            this.localUpdate_password=param;
                                    

                               }
                            

                        /**
                        * field for Update_realName
                        */

                        
                                    protected java.lang.String localUpdate_realName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_realNameTracker = false ;

                           public boolean isUpdate_realNameSpecified(){
                               return localUpdate_realNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_realName(){
                               return localUpdate_realName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_realName
                               */
                               public void setUpdate_realName(java.lang.String param){
                            localUpdate_realNameTracker = true;
                                   
                                            this.localUpdate_realName=param;
                                    

                               }
                            

                        /**
                        * field for Update_orgName
                        */

                        
                                    protected java.lang.String localUpdate_orgName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_orgNameTracker = false ;

                           public boolean isUpdate_orgNameSpecified(){
                               return localUpdate_orgNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_orgName(){
                               return localUpdate_orgName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_orgName
                               */
                               public void setUpdate_orgName(java.lang.String param){
                            localUpdate_orgNameTracker = true;
                                   
                                            this.localUpdate_orgName=param;
                                    

                               }
                            

                        /**
                        * field for Update_email
                        */

                        
                                    protected java.lang.String localUpdate_email ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_emailTracker = false ;

                           public boolean isUpdate_emailSpecified(){
                               return localUpdate_emailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_email(){
                               return localUpdate_email;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_email
                               */
                               public void setUpdate_email(java.lang.String param){
                            localUpdate_emailTracker = true;
                                   
                                            this.localUpdate_email=param;
                                    

                               }
                            

                        /**
                        * field for Update_province
                        */

                        
                                    protected java.lang.String localUpdate_province ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_provinceTracker = false ;

                           public boolean isUpdate_provinceSpecified(){
                               return localUpdate_provinceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_province(){
                               return localUpdate_province;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_province
                               */
                               public void setUpdate_province(java.lang.String param){
                            localUpdate_provinceTracker = true;
                                   
                                            this.localUpdate_province=param;
                                    

                               }
                            

                        /**
                        * field for Update_city
                        */

                        
                                    protected java.lang.String localUpdate_city ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_cityTracker = false ;

                           public boolean isUpdate_citySpecified(){
                               return localUpdate_cityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_city(){
                               return localUpdate_city;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_city
                               */
                               public void setUpdate_city(java.lang.String param){
                            localUpdate_cityTracker = true;
                                   
                                            this.localUpdate_city=param;
                                    

                               }
                            

                        /**
                        * field for Update_address
                        */

                        
                                    protected java.lang.String localUpdate_address ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_addressTracker = false ;

                           public boolean isUpdate_addressSpecified(){
                               return localUpdate_addressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_address(){
                               return localUpdate_address;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_address
                               */
                               public void setUpdate_address(java.lang.String param){
                            localUpdate_addressTracker = true;
                                   
                                            this.localUpdate_address=param;
                                    

                               }
                            

                        /**
                        * field for Update_postCode
                        */

                        
                                    protected java.lang.String localUpdate_postCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_postCodeTracker = false ;

                           public boolean isUpdate_postCodeSpecified(){
                               return localUpdate_postCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_postCode(){
                               return localUpdate_postCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_postCode
                               */
                               public void setUpdate_postCode(java.lang.String param){
                            localUpdate_postCodeTracker = true;
                                   
                                            this.localUpdate_postCode=param;
                                    

                               }
                            

                        /**
                        * field for Update_telephone
                        */

                        
                                    protected java.lang.String localUpdate_telephone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_telephoneTracker = false ;

                           public boolean isUpdate_telephoneSpecified(){
                               return localUpdate_telephoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_telephone(){
                               return localUpdate_telephone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_telephone
                               */
                               public void setUpdate_telephone(java.lang.String param){
                            localUpdate_telephoneTracker = true;
                                   
                                            this.localUpdate_telephone=param;
                                    

                               }
                            

                        /**
                        * field for Update_fax
                        */

                        
                                    protected java.lang.String localUpdate_fax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_faxTracker = false ;

                           public boolean isUpdate_faxSpecified(){
                               return localUpdate_faxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_fax(){
                               return localUpdate_fax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_fax
                               */
                               public void setUpdate_fax(java.lang.String param){
                            localUpdate_faxTracker = true;
                                   
                                            this.localUpdate_fax=param;
                                    

                               }
                            

                        /**
                        * field for Update_cellphone
                        */

                        
                                    protected java.lang.String localUpdate_cellphone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_cellphoneTracker = false ;

                           public boolean isUpdate_cellphoneSpecified(){
                               return localUpdate_cellphoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_cellphone(){
                               return localUpdate_cellphone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_cellphone
                               */
                               public void setUpdate_cellphone(java.lang.String param){
                            localUpdate_cellphoneTracker = true;
                                   
                                            this.localUpdate_cellphone=param;
                                    

                               }
                            

                        /**
                        * field for Update_identificationType
                        */

                        
                                    protected java.lang.String localUpdate_identificationType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_identificationTypeTracker = false ;

                           public boolean isUpdate_identificationTypeSpecified(){
                               return localUpdate_identificationTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_identificationType(){
                               return localUpdate_identificationType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_identificationType
                               */
                               public void setUpdate_identificationType(java.lang.String param){
                            localUpdate_identificationTypeTracker = true;
                                   
                                            this.localUpdate_identificationType=param;
                                    

                               }
                            

                        /**
                        * field for Update_identificationNum
                        */

                        
                                    protected java.lang.String localUpdate_identificationNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_identificationNumTracker = false ;

                           public boolean isUpdate_identificationNumSpecified(){
                               return localUpdate_identificationNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_identificationNum(){
                               return localUpdate_identificationNum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_identificationNum
                               */
                               public void setUpdate_identificationNum(java.lang.String param){
                            localUpdate_identificationNumTracker = true;
                                   
                                            this.localUpdate_identificationNum=param;
                                    

                               }
                            

                        /**
                        * field for Update_userSex
                        */

                        
                                    protected java.lang.String localUpdate_userSex ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_userSexTracker = false ;

                           public boolean isUpdate_userSexSpecified(){
                               return localUpdate_userSexTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_userSex(){
                               return localUpdate_userSex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_userSex
                               */
                               public void setUpdate_userSex(java.lang.String param){
                            localUpdate_userSexTracker = true;
                                   
                                            this.localUpdate_userSex=param;
                                    

                               }
                            

                        /**
                        * field for Update_userBirthday
                        */

                        
                                    protected java.lang.String localUpdate_userBirthday ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_userBirthdayTracker = false ;

                           public boolean isUpdate_userBirthdaySpecified(){
                               return localUpdate_userBirthdayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_userBirthday(){
                               return localUpdate_userBirthday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_userBirthday
                               */
                               public void setUpdate_userBirthday(java.lang.String param){
                            localUpdate_userBirthdayTracker = true;
                                   
                                            this.localUpdate_userBirthday=param;
                                    

                               }
                            

                        /**
                        * field for Update_educLevel
                        */

                        
                                    protected java.lang.String localUpdate_educLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdate_educLevelTracker = false ;

                           public boolean isUpdate_educLevelSpecified(){
                               return localUpdate_educLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdate_educLevel(){
                               return localUpdate_educLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Update_educLevel
                               */
                               public void setUpdate_educLevel(java.lang.String param){
                            localUpdate_educLevelTracker = true;
                                   
                                            this.localUpdate_educLevel=param;
                                    

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
                           namespacePrefix+":updateUserInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "updateUserInfo",
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
                             } if (localUpdate_loginNameTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_loginName", xmlWriter);
                             

                                          if (localUpdate_loginName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_loginName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_passwordTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_password", xmlWriter);
                             

                                          if (localUpdate_password==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_password);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_realNameTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_realName", xmlWriter);
                             

                                          if (localUpdate_realName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_realName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_orgNameTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_orgName", xmlWriter);
                             

                                          if (localUpdate_orgName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_orgName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_emailTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_email", xmlWriter);
                             

                                          if (localUpdate_email==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_email);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_provinceTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_province", xmlWriter);
                             

                                          if (localUpdate_province==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_province);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_cityTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_city", xmlWriter);
                             

                                          if (localUpdate_city==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_city);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_addressTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_address", xmlWriter);
                             

                                          if (localUpdate_address==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_address);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_postCodeTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_postCode", xmlWriter);
                             

                                          if (localUpdate_postCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_postCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_telephoneTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_telephone", xmlWriter);
                             

                                          if (localUpdate_telephone==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_telephone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_faxTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_fax", xmlWriter);
                             

                                          if (localUpdate_fax==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_fax);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_cellphoneTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_cellphone", xmlWriter);
                             

                                          if (localUpdate_cellphone==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_cellphone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_identificationTypeTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_identificationType", xmlWriter);
                             

                                          if (localUpdate_identificationType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_identificationType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_identificationNumTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_identificationNum", xmlWriter);
                             

                                          if (localUpdate_identificationNum==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_identificationNum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_userSexTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_userSex", xmlWriter);
                             

                                          if (localUpdate_userSex==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_userSex);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_userBirthdayTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_userBirthday", xmlWriter);
                             

                                          if (localUpdate_userBirthday==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_userBirthday);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdate_educLevelTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "update_educLevel", xmlWriter);
                             

                                          if (localUpdate_educLevel==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdate_educLevel);
                                            
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
                                    } if (localUpdate_loginNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_loginName"));
                                 
                                         elementList.add(localUpdate_loginName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_loginName));
                                    } if (localUpdate_passwordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_password"));
                                 
                                         elementList.add(localUpdate_password==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_password));
                                    } if (localUpdate_realNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_realName"));
                                 
                                         elementList.add(localUpdate_realName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_realName));
                                    } if (localUpdate_orgNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_orgName"));
                                 
                                         elementList.add(localUpdate_orgName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_orgName));
                                    } if (localUpdate_emailTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_email"));
                                 
                                         elementList.add(localUpdate_email==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_email));
                                    } if (localUpdate_provinceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_province"));
                                 
                                         elementList.add(localUpdate_province==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_province));
                                    } if (localUpdate_cityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_city"));
                                 
                                         elementList.add(localUpdate_city==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_city));
                                    } if (localUpdate_addressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_address"));
                                 
                                         elementList.add(localUpdate_address==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_address));
                                    } if (localUpdate_postCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_postCode"));
                                 
                                         elementList.add(localUpdate_postCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_postCode));
                                    } if (localUpdate_telephoneTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_telephone"));
                                 
                                         elementList.add(localUpdate_telephone==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_telephone));
                                    } if (localUpdate_faxTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_fax"));
                                 
                                         elementList.add(localUpdate_fax==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_fax));
                                    } if (localUpdate_cellphoneTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_cellphone"));
                                 
                                         elementList.add(localUpdate_cellphone==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_cellphone));
                                    } if (localUpdate_identificationTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_identificationType"));
                                 
                                         elementList.add(localUpdate_identificationType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_identificationType));
                                    } if (localUpdate_identificationNumTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_identificationNum"));
                                 
                                         elementList.add(localUpdate_identificationNum==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_identificationNum));
                                    } if (localUpdate_userSexTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_userSex"));
                                 
                                         elementList.add(localUpdate_userSex==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_userSex));
                                    } if (localUpdate_userBirthdayTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_userBirthday"));
                                 
                                         elementList.add(localUpdate_userBirthday==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_userBirthday));
                                    } if (localUpdate_educLevelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "update_educLevel"));
                                 
                                         elementList.add(localUpdate_educLevel==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdate_educLevel));
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
        public static UpdateUserInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UpdateUserInfo object =
                new UpdateUserInfo();

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
                    
                            if (!"updateUserInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UpdateUserInfo)cn.gov.cnis.cssn.wssort.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_loginName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_loginName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_password").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_password(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_realName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_realName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_orgName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_orgName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_email").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_email(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_province").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_province(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_city").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_city(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_address").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_address(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_postCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_postCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_telephone").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_telephone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_fax").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_fax(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_cellphone").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_cellphone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_identificationType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_identificationType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_identificationNum").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_identificationNum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_userSex").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_userSex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_userBirthday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_userBirthday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","update_educLevel").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdate_educLevel(
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
           
    