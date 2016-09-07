
/**
 * Register.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package cn.gov.cnis.cssn.ws;
            

            /**
            *  Register bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Register
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://ws.cssn.cnis.gov.cn",
                "register",
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
                        * field for Reg_loginName
                        */

                        
                                    protected java.lang.String localReg_loginName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_loginNameTracker = false ;

                           public boolean isReg_loginNameSpecified(){
                               return localReg_loginNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_loginName(){
                               return localReg_loginName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_loginName
                               */
                               public void setReg_loginName(java.lang.String param){
                            localReg_loginNameTracker = true;
                                   
                                            this.localReg_loginName=param;
                                    

                               }
                            

                        /**
                        * field for Reg_password
                        */

                        
                                    protected java.lang.String localReg_password ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_passwordTracker = false ;

                           public boolean isReg_passwordSpecified(){
                               return localReg_passwordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_password(){
                               return localReg_password;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_password
                               */
                               public void setReg_password(java.lang.String param){
                            localReg_passwordTracker = true;
                                   
                                            this.localReg_password=param;
                                    

                               }
                            

                        /**
                        * field for Reg_realName
                        */

                        
                                    protected java.lang.String localReg_realName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_realNameTracker = false ;

                           public boolean isReg_realNameSpecified(){
                               return localReg_realNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_realName(){
                               return localReg_realName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_realName
                               */
                               public void setReg_realName(java.lang.String param){
                            localReg_realNameTracker = true;
                                   
                                            this.localReg_realName=param;
                                    

                               }
                            

                        /**
                        * field for Reg_orgName
                        */

                        
                                    protected java.lang.String localReg_orgName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_orgNameTracker = false ;

                           public boolean isReg_orgNameSpecified(){
                               return localReg_orgNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_orgName(){
                               return localReg_orgName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_orgName
                               */
                               public void setReg_orgName(java.lang.String param){
                            localReg_orgNameTracker = true;
                                   
                                            this.localReg_orgName=param;
                                    

                               }
                            

                        /**
                        * field for Reg_email
                        */

                        
                                    protected java.lang.String localReg_email ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_emailTracker = false ;

                           public boolean isReg_emailSpecified(){
                               return localReg_emailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_email(){
                               return localReg_email;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_email
                               */
                               public void setReg_email(java.lang.String param){
                            localReg_emailTracker = true;
                                   
                                            this.localReg_email=param;
                                    

                               }
                            

                        /**
                        * field for Reg_province
                        */

                        
                                    protected java.lang.String localReg_province ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_provinceTracker = false ;

                           public boolean isReg_provinceSpecified(){
                               return localReg_provinceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_province(){
                               return localReg_province;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_province
                               */
                               public void setReg_province(java.lang.String param){
                            localReg_provinceTracker = true;
                                   
                                            this.localReg_province=param;
                                    

                               }
                            

                        /**
                        * field for Reg_city
                        */

                        
                                    protected java.lang.String localReg_city ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_cityTracker = false ;

                           public boolean isReg_citySpecified(){
                               return localReg_cityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_city(){
                               return localReg_city;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_city
                               */
                               public void setReg_city(java.lang.String param){
                            localReg_cityTracker = true;
                                   
                                            this.localReg_city=param;
                                    

                               }
                            

                        /**
                        * field for Reg_address
                        */

                        
                                    protected java.lang.String localReg_address ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_addressTracker = false ;

                           public boolean isReg_addressSpecified(){
                               return localReg_addressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_address(){
                               return localReg_address;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_address
                               */
                               public void setReg_address(java.lang.String param){
                            localReg_addressTracker = true;
                                   
                                            this.localReg_address=param;
                                    

                               }
                            

                        /**
                        * field for Reg_postCode
                        */

                        
                                    protected java.lang.String localReg_postCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_postCodeTracker = false ;

                           public boolean isReg_postCodeSpecified(){
                               return localReg_postCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_postCode(){
                               return localReg_postCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_postCode
                               */
                               public void setReg_postCode(java.lang.String param){
                            localReg_postCodeTracker = true;
                                   
                                            this.localReg_postCode=param;
                                    

                               }
                            

                        /**
                        * field for Reg_telephone
                        */

                        
                                    protected java.lang.String localReg_telephone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_telephoneTracker = false ;

                           public boolean isReg_telephoneSpecified(){
                               return localReg_telephoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_telephone(){
                               return localReg_telephone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_telephone
                               */
                               public void setReg_telephone(java.lang.String param){
                            localReg_telephoneTracker = true;
                                   
                                            this.localReg_telephone=param;
                                    

                               }
                            

                        /**
                        * field for Reg_fax
                        */

                        
                                    protected java.lang.String localReg_fax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_faxTracker = false ;

                           public boolean isReg_faxSpecified(){
                               return localReg_faxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_fax(){
                               return localReg_fax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_fax
                               */
                               public void setReg_fax(java.lang.String param){
                            localReg_faxTracker = true;
                                   
                                            this.localReg_fax=param;
                                    

                               }
                            

                        /**
                        * field for Reg_cellphone
                        */

                        
                                    protected java.lang.String localReg_cellphone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_cellphoneTracker = false ;

                           public boolean isReg_cellphoneSpecified(){
                               return localReg_cellphoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_cellphone(){
                               return localReg_cellphone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_cellphone
                               */
                               public void setReg_cellphone(java.lang.String param){
                            localReg_cellphoneTracker = true;
                                   
                                            this.localReg_cellphone=param;
                                    

                               }
                            

                        /**
                        * field for Reg_identificationType
                        */

                        
                                    protected java.lang.String localReg_identificationType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_identificationTypeTracker = false ;

                           public boolean isReg_identificationTypeSpecified(){
                               return localReg_identificationTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_identificationType(){
                               return localReg_identificationType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_identificationType
                               */
                               public void setReg_identificationType(java.lang.String param){
                            localReg_identificationTypeTracker = true;
                                   
                                            this.localReg_identificationType=param;
                                    

                               }
                            

                        /**
                        * field for Reg_identificationNum
                        */

                        
                                    protected java.lang.String localReg_identificationNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_identificationNumTracker = false ;

                           public boolean isReg_identificationNumSpecified(){
                               return localReg_identificationNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_identificationNum(){
                               return localReg_identificationNum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_identificationNum
                               */
                               public void setReg_identificationNum(java.lang.String param){
                            localReg_identificationNumTracker = true;
                                   
                                            this.localReg_identificationNum=param;
                                    

                               }
                            

                        /**
                        * field for Reg_userSex
                        */

                        
                                    protected java.lang.String localReg_userSex ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_userSexTracker = false ;

                           public boolean isReg_userSexSpecified(){
                               return localReg_userSexTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_userSex(){
                               return localReg_userSex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_userSex
                               */
                               public void setReg_userSex(java.lang.String param){
                            localReg_userSexTracker = true;
                                   
                                            this.localReg_userSex=param;
                                    

                               }
                            

                        /**
                        * field for Reg_userBirthday
                        */

                        
                                    protected java.lang.String localReg_userBirthday ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_userBirthdayTracker = false ;

                           public boolean isReg_userBirthdaySpecified(){
                               return localReg_userBirthdayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_userBirthday(){
                               return localReg_userBirthday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_userBirthday
                               */
                               public void setReg_userBirthday(java.lang.String param){
                            localReg_userBirthdayTracker = true;
                                   
                                            this.localReg_userBirthday=param;
                                    

                               }
                            

                        /**
                        * field for Reg_educLevel
                        */

                        
                                    protected java.lang.String localReg_educLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReg_educLevelTracker = false ;

                           public boolean isReg_educLevelSpecified(){
                               return localReg_educLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReg_educLevel(){
                               return localReg_educLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reg_educLevel
                               */
                               public void setReg_educLevel(java.lang.String param){
                            localReg_educLevelTracker = true;
                                   
                                            this.localReg_educLevel=param;
                                    

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
                           namespacePrefix+":register",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "register",
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
                             } if (localReg_loginNameTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_loginName", xmlWriter);
                             

                                          if (localReg_loginName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_loginName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_passwordTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_password", xmlWriter);
                             

                                          if (localReg_password==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_password);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_realNameTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_realName", xmlWriter);
                             

                                          if (localReg_realName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_realName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_orgNameTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_orgName", xmlWriter);
                             

                                          if (localReg_orgName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_orgName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_emailTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_email", xmlWriter);
                             

                                          if (localReg_email==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_email);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_provinceTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_province", xmlWriter);
                             

                                          if (localReg_province==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_province);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_cityTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_city", xmlWriter);
                             

                                          if (localReg_city==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_city);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_addressTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_address", xmlWriter);
                             

                                          if (localReg_address==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_address);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_postCodeTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_postCode", xmlWriter);
                             

                                          if (localReg_postCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_postCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_telephoneTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_telephone", xmlWriter);
                             

                                          if (localReg_telephone==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_telephone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_faxTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_fax", xmlWriter);
                             

                                          if (localReg_fax==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_fax);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_cellphoneTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_cellphone", xmlWriter);
                             

                                          if (localReg_cellphone==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_cellphone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_identificationTypeTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_identificationType", xmlWriter);
                             

                                          if (localReg_identificationType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_identificationType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_identificationNumTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_identificationNum", xmlWriter);
                             

                                          if (localReg_identificationNum==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_identificationNum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_userSexTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_userSex", xmlWriter);
                             

                                          if (localReg_userSex==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_userSex);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_userBirthdayTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_userBirthday", xmlWriter);
                             

                                          if (localReg_userBirthday==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_userBirthday);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReg_educLevelTracker){
                                    namespace = "http://ws.cssn.cnis.gov.cn";
                                    writeStartElement(null, namespace, "reg_educLevel", xmlWriter);
                             

                                          if (localReg_educLevel==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReg_educLevel);
                                            
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
                                    } if (localReg_loginNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_loginName"));
                                 
                                         elementList.add(localReg_loginName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_loginName));
                                    } if (localReg_passwordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_password"));
                                 
                                         elementList.add(localReg_password==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_password));
                                    } if (localReg_realNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_realName"));
                                 
                                         elementList.add(localReg_realName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_realName));
                                    } if (localReg_orgNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_orgName"));
                                 
                                         elementList.add(localReg_orgName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_orgName));
                                    } if (localReg_emailTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_email"));
                                 
                                         elementList.add(localReg_email==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_email));
                                    } if (localReg_provinceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_province"));
                                 
                                         elementList.add(localReg_province==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_province));
                                    } if (localReg_cityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_city"));
                                 
                                         elementList.add(localReg_city==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_city));
                                    } if (localReg_addressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_address"));
                                 
                                         elementList.add(localReg_address==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_address));
                                    } if (localReg_postCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_postCode"));
                                 
                                         elementList.add(localReg_postCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_postCode));
                                    } if (localReg_telephoneTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_telephone"));
                                 
                                         elementList.add(localReg_telephone==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_telephone));
                                    } if (localReg_faxTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_fax"));
                                 
                                         elementList.add(localReg_fax==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_fax));
                                    } if (localReg_cellphoneTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_cellphone"));
                                 
                                         elementList.add(localReg_cellphone==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_cellphone));
                                    } if (localReg_identificationTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_identificationType"));
                                 
                                         elementList.add(localReg_identificationType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_identificationType));
                                    } if (localReg_identificationNumTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_identificationNum"));
                                 
                                         elementList.add(localReg_identificationNum==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_identificationNum));
                                    } if (localReg_userSexTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_userSex"));
                                 
                                         elementList.add(localReg_userSex==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_userSex));
                                    } if (localReg_userBirthdayTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_userBirthday"));
                                 
                                         elementList.add(localReg_userBirthday==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_userBirthday));
                                    } if (localReg_educLevelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn",
                                                                      "reg_educLevel"));
                                 
                                         elementList.add(localReg_educLevel==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReg_educLevel));
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
        public static Register parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Register object =
                new Register();

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
                    
                            if (!"register".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Register)cn.gov.cnis.cssn.wssort.xsd.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_loginName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_loginName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_password").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_password(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_realName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_realName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_orgName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_orgName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_email").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_email(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_province").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_province(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_city").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_city(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_address").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_address(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_postCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_postCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_telephone").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_telephone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_fax").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_fax(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_cellphone").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_cellphone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_identificationType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_identificationType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_identificationNum").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_identificationNum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_userSex").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_userSex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_userBirthday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_userBirthday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ws.cssn.cnis.gov.cn","reg_educLevel").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReg_educLevel(
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
           
    