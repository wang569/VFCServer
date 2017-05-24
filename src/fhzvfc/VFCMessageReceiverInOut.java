
/**
 * VFCMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
        package fhzvfc;

        /**
        *  VFCMessageReceiverInOut message receiver
        */

        public class VFCMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        VFCSkeletonInterface skel = (VFCSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("logout".equals(methodName)){
                
                fhzvfc.LogoutResponse logoutResponse103 = null;
	                        fhzvfc.Logout wrappedParam =
                                                             (fhzvfc.Logout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.Logout.class);
                                                
                                               logoutResponse103 =
                                                   
                                                   
                                                         skel.logout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), logoutResponse103, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "LogoutResponse"));
                                    } else 

            if("vssTaskControl".equals(methodName)){
                
                fhzvfc.VssTaskControlResponse vssTaskControlResponse105 = null;
	                        fhzvfc.VssTaskControl wrappedParam =
                                                             (fhzvfc.VssTaskControl)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.VssTaskControl.class);
                                                
                                               vssTaskControlResponse105 =
                                                   
                                                   
                                                         skel.vssTaskControl(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), vssTaskControlResponse105, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "VssTaskControlResponse"));
                                    } else 

            if("struSearchImageQuery".equals(methodName)){
                
                fhzvfc.StruSearchImageQueryResponse struSearchImageQueryResponse107 = null;
	                        fhzvfc.StruSearchImageQuery wrappedParam =
                                                             (fhzvfc.StruSearchImageQuery)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.StruSearchImageQuery.class);
                                                
                                               struSearchImageQueryResponse107 =
                                                   
                                                   
                                                         skel.struSearchImageQuery(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), struSearchImageQueryResponse107, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "StruSearchImageQueryResponse"));
                                    } else 

            if("vssSnapNotify".equals(methodName)){
                
                fhzvfc.VssSnapNotifyResponse vssSnapNotifyResponse109 = null;
	                        fhzvfc.VssSnapNotify wrappedParam =
                                                             (fhzvfc.VssSnapNotify)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.VssSnapNotify.class);
                                                
                                               vssSnapNotifyResponse109 =
                                                   
                                                   
                                                         skel.vssSnapNotify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), vssSnapNotifyResponse109, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "VssSnapNotifyResponse"));
                                    } else 

            if("register".equals(methodName)){
                
                fhzvfc.RegisterResponse registerResponse111 = null;
	                        fhzvfc.Register wrappedParam =
                                                             (fhzvfc.Register)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.Register.class);
                                                
                                               registerResponse111 =
                                                   
                                                   
                                                         skel.register(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerResponse111, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "RegisterResponse"));
                                    } else 

            if("taskControl".equals(methodName)){
                
                fhzvfc.TaskControlResponse taskControlResponse113 = null;
	                        fhzvfc.TaskControl wrappedParam =
                                                             (fhzvfc.TaskControl)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.TaskControl.class);
                                                
                                               taskControlResponse113 =
                                                   
                                                   
                                                         skel.taskControl(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), taskControlResponse113, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "TaskControlResponse"));
                                    } else 

            if("jobStartDownFile".equals(methodName)){
                
                fhzvfc.JobStartDownFileResponse jobStartDownFileResponse115 = null;
	                        fhzvfc.JobStartDownFile wrappedParam =
                                                             (fhzvfc.JobStartDownFile)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.JobStartDownFile.class);
                                                
                                               jobStartDownFileResponse115 =
                                                   
                                                   
                                                         skel.jobStartDownFile(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), jobStartDownFileResponse115, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "JobStartDownFileResponse"));
                                    } else 

            if("searchImageTaskControl".equals(methodName)){
                
                fhzvfc.SearchImageTaskControlResponse searchImageTaskControlResponse117 = null;
	                        fhzvfc.SearchImageTaskControl wrappedParam =
                                                             (fhzvfc.SearchImageTaskControl)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.SearchImageTaskControl.class);
                                                
                                               searchImageTaskControlResponse117 =
                                                   
                                                   
                                                         skel.searchImageTaskControl(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), searchImageTaskControlResponse117, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "SearchImageTaskControlResponse"));
                                    } else 

            if("systemAbility".equals(methodName)){
                
                fhzvfc.SystemAbilityResponse systemAbilityResponse119 = null;
	                        fhzvfc.SystemAbility wrappedParam =
                                                             (fhzvfc.SystemAbility)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.SystemAbility.class);
                                                
                                               systemAbilityResponse119 =
                                                   
                                                   
                                                         skel.systemAbility(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), systemAbilityResponse119, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "SystemAbilityResponse"));
                                    } else 

            if("jobDownFileResultReport".equals(methodName)){
                
                fhzvfc.JobDownFileResultReportResponse jobDownFileResultReportResponse121 = null;
	                        fhzvfc.JobDownFileResultReport wrappedParam =
                                                             (fhzvfc.JobDownFileResultReport)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.JobDownFileResultReport.class);
                                                
                                               jobDownFileResultReportResponse121 =
                                                   
                                                   
                                                         skel.jobDownFileResultReport(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), jobDownFileResultReportResponse121, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "JobDownFileResultReportResponse"));
                                    } else 

            if("jobDownFileProcessReport".equals(methodName)){
                
                fhzvfc.JobDownFileProcessReportResponse jobDownFileProcessReportResponse123 = null;
	                        fhzvfc.JobDownFileProcessReport wrappedParam =
                                                             (fhzvfc.JobDownFileProcessReport)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.JobDownFileProcessReport.class);
                                                
                                               jobDownFileProcessReportResponse123 =
                                                   
                                                   
                                                         skel.jobDownFileProcessReport(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), jobDownFileProcessReportResponse123, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "JobDownFileProcessReportResponse"));
                                    } else 

            if("jobProcessQuery".equals(methodName)){
                
                fhzvfc.JobProcessQueryResponse jobProcessQueryResponse125 = null;
	                        fhzvfc.JobProcessQuery wrappedParam =
                                                             (fhzvfc.JobProcessQuery)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.JobProcessQuery.class);
                                                
                                               jobProcessQueryResponse125 =
                                                   
                                                   
                                                         skel.jobProcessQuery(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), jobProcessQueryResponse125, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "JobProcessQueryResponse"));
                                    } else 

            if("jobResultNotify".equals(methodName)){
                
                fhzvfc.JobResultNotifyResponse jobResultNotifyResponse127 = null;
	                        fhzvfc.JobResultNotify wrappedParam =
                                                             (fhzvfc.JobResultNotify)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.JobResultNotify.class);
                                                
                                               jobResultNotifyResponse127 =
                                                   
                                                   
                                                         skel.jobResultNotify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), jobResultNotifyResponse127, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "JobResultNotifyResponse"));
                                    } else 

            if("heartBeat".equals(methodName)){
                
                fhzvfc.HeartBeatResponse heartBeatResponse129 = null;
	                        fhzvfc.HeartBeat wrappedParam =
                                                             (fhzvfc.HeartBeat)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.HeartBeat.class);
                                                
                                               heartBeatResponse129 =
                                                   
                                                   
                                                         skel.heartBeat(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), heartBeatResponse129, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "HeartBeatResponse"));
                                    } else 

            if("queryJobResult".equals(methodName)){
                
                fhzvfc.QueryJobResultResponse queryJobResultResponse131 = null;
	                        fhzvfc.QueryJobResult wrappedParam =
                                                             (fhzvfc.QueryJobResult)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.QueryJobResult.class);
                                                
                                               queryJobResultResponse131 =
                                                   
                                                   
                                                         skel.queryJobResult(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), queryJobResultResponse131, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "QueryJobResultResponse"));
                                    } else 

            if("querySnap".equals(methodName)){
                
                fhzvfc.QuerySnapResponse querySnapResponse133 = null;
	                        fhzvfc.QuerySnap wrappedParam =
                                                             (fhzvfc.QuerySnap)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.QuerySnap.class);
                                                
                                               querySnapResponse133 =
                                                   
                                                   
                                                         skel.querySnap(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), querySnapResponse133, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "QuerySnapResponse"));
                                    } else 

            if("jobProcessNotify".equals(methodName)){
                
                fhzvfc.JobProcessNotifyResponse jobProcessNotifyResponse135 = null;
	                        fhzvfc.JobProcessNotify wrappedParam =
                                                             (fhzvfc.JobProcessNotify)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    fhzvfc.JobProcessNotify.class);
                                                
                                               jobProcessNotifyResponse135 =
                                                   
                                                   
                                                         skel.jobProcessNotify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), jobProcessNotifyResponse135, false,
                                                    new javax.xml.namespace.QName("urn:fhzvfc", "JobProcessNotifyResponse"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.Logout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.Logout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.LogoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.LogoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.VssTaskControl param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.VssTaskControl.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.VssTaskControlResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.VssTaskControlResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.StruSearchImageQuery param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.StruSearchImageQuery.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.StruSearchImageQueryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.StruSearchImageQueryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.VssSnapNotify param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.VssSnapNotify.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.VssSnapNotifyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.VssSnapNotifyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.Register param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.Register.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.RegisterResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.RegisterResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.TaskControl param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.TaskControl.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.TaskControlResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.TaskControlResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobStartDownFile param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobStartDownFile.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobStartDownFileResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobStartDownFileResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.SearchImageTaskControl param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.SearchImageTaskControl.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.SearchImageTaskControlResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.SearchImageTaskControlResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.SystemAbility param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.SystemAbility.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.SystemAbilityResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.SystemAbilityResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobDownFileResultReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobDownFileResultReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobDownFileResultReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobDownFileResultReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobDownFileProcessReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobDownFileProcessReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobDownFileProcessReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobDownFileProcessReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobProcessQuery param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobProcessQuery.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobProcessQueryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobProcessQueryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobResultNotify param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobResultNotify.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobResultNotifyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobResultNotifyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.HeartBeat param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.HeartBeat.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.HeartBeatResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.HeartBeatResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.QueryJobResult param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.QueryJobResult.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.QueryJobResultResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.QueryJobResultResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.QuerySnap param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.QuerySnap.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.QuerySnapResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.QuerySnapResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobProcessNotify param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobProcessNotify.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(fhzvfc.JobProcessNotifyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(fhzvfc.JobProcessNotifyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.LogoutResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.LogoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.LogoutResponse wrapLogout(){
                                fhzvfc.LogoutResponse wrappedElement = new fhzvfc.LogoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.VssTaskControlResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.VssTaskControlResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.VssTaskControlResponse wrapVssTaskControl(){
                                fhzvfc.VssTaskControlResponse wrappedElement = new fhzvfc.VssTaskControlResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.StruSearchImageQueryResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.StruSearchImageQueryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.StruSearchImageQueryResponse wrapStruSearchImageQuery(){
                                fhzvfc.StruSearchImageQueryResponse wrappedElement = new fhzvfc.StruSearchImageQueryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.VssSnapNotifyResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.VssSnapNotifyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.VssSnapNotifyResponse wrapVssSnapNotify(){
                                fhzvfc.VssSnapNotifyResponse wrappedElement = new fhzvfc.VssSnapNotifyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.RegisterResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.RegisterResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.RegisterResponse wrapRegister(){
                                fhzvfc.RegisterResponse wrappedElement = new fhzvfc.RegisterResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.TaskControlResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.TaskControlResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.TaskControlResponse wrapTaskControl(){
                                fhzvfc.TaskControlResponse wrappedElement = new fhzvfc.TaskControlResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.JobStartDownFileResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.JobStartDownFileResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.JobStartDownFileResponse wrapJobStartDownFile(){
                                fhzvfc.JobStartDownFileResponse wrappedElement = new fhzvfc.JobStartDownFileResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.SearchImageTaskControlResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.SearchImageTaskControlResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.SearchImageTaskControlResponse wrapSearchImageTaskControl(){
                                fhzvfc.SearchImageTaskControlResponse wrappedElement = new fhzvfc.SearchImageTaskControlResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.SystemAbilityResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.SystemAbilityResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.SystemAbilityResponse wrapSystemAbility(){
                                fhzvfc.SystemAbilityResponse wrappedElement = new fhzvfc.SystemAbilityResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.JobDownFileResultReportResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.JobDownFileResultReportResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.JobDownFileResultReportResponse wrapJobDownFileResultReport(){
                                fhzvfc.JobDownFileResultReportResponse wrappedElement = new fhzvfc.JobDownFileResultReportResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.JobDownFileProcessReportResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.JobDownFileProcessReportResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.JobDownFileProcessReportResponse wrapJobDownFileProcessReport(){
                                fhzvfc.JobDownFileProcessReportResponse wrappedElement = new fhzvfc.JobDownFileProcessReportResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.JobProcessQueryResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.JobProcessQueryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.JobProcessQueryResponse wrapJobProcessQuery(){
                                fhzvfc.JobProcessQueryResponse wrappedElement = new fhzvfc.JobProcessQueryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.JobResultNotifyResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.JobResultNotifyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.JobResultNotifyResponse wrapJobResultNotify(){
                                fhzvfc.JobResultNotifyResponse wrappedElement = new fhzvfc.JobResultNotifyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.HeartBeatResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.HeartBeatResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.HeartBeatResponse wrapHeartBeat(){
                                fhzvfc.HeartBeatResponse wrappedElement = new fhzvfc.HeartBeatResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.QueryJobResultResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.QueryJobResultResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.QueryJobResultResponse wrapQueryJobResult(){
                                fhzvfc.QueryJobResultResponse wrappedElement = new fhzvfc.QueryJobResultResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.QuerySnapResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.QuerySnapResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.QuerySnapResponse wrapQuerySnap(){
                                fhzvfc.QuerySnapResponse wrappedElement = new fhzvfc.QuerySnapResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, fhzvfc.JobProcessNotifyResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(fhzvfc.JobProcessNotifyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private fhzvfc.JobProcessNotifyResponse wrapJobProcessNotify(){
                                fhzvfc.JobProcessNotifyResponse wrappedElement = new fhzvfc.JobProcessNotifyResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{

        try {
        
                if (fhzvfc.HeartBeat.class.equals(type)){
                
                        return fhzvfc.HeartBeat.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.HeartBeatResponse.class.equals(type)){
                
                        return fhzvfc.HeartBeatResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobDownFileProcessReport.class.equals(type)){
                
                        return fhzvfc.JobDownFileProcessReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobDownFileProcessReportResponse.class.equals(type)){
                
                        return fhzvfc.JobDownFileProcessReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobDownFileResultReport.class.equals(type)){
                
                        return fhzvfc.JobDownFileResultReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobDownFileResultReportResponse.class.equals(type)){
                
                        return fhzvfc.JobDownFileResultReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobProcessNotify.class.equals(type)){
                
                        return fhzvfc.JobProcessNotify.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobProcessNotifyResponse.class.equals(type)){
                
                        return fhzvfc.JobProcessNotifyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobProcessQuery.class.equals(type)){
                
                        return fhzvfc.JobProcessQuery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobProcessQueryResponse.class.equals(type)){
                
                        return fhzvfc.JobProcessQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobResultNotify.class.equals(type)){
                
                        return fhzvfc.JobResultNotify.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobResultNotifyResponse.class.equals(type)){
                
                        return fhzvfc.JobResultNotifyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobStartDownFile.class.equals(type)){
                
                        return fhzvfc.JobStartDownFile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.JobStartDownFileResponse.class.equals(type)){
                
                        return fhzvfc.JobStartDownFileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.Logout.class.equals(type)){
                
                        return fhzvfc.Logout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.LogoutResponse.class.equals(type)){
                
                        return fhzvfc.LogoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.QueryJobResult.class.equals(type)){
                
                        return fhzvfc.QueryJobResult.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.QueryJobResultResponse.class.equals(type)){
                
                        return fhzvfc.QueryJobResultResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.QuerySnap.class.equals(type)){
                
                        return fhzvfc.QuerySnap.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.QuerySnapResponse.class.equals(type)){
                
                        return fhzvfc.QuerySnapResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.Register.class.equals(type)){
                
                        return fhzvfc.Register.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.RegisterResponse.class.equals(type)){
                
                        return fhzvfc.RegisterResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.SearchImageTaskControl.class.equals(type)){
                
                        return fhzvfc.SearchImageTaskControl.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.SearchImageTaskControlResponse.class.equals(type)){
                
                        return fhzvfc.SearchImageTaskControlResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.StruSearchImageQuery.class.equals(type)){
                
                        return fhzvfc.StruSearchImageQuery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.StruSearchImageQueryResponse.class.equals(type)){
                
                        return fhzvfc.StruSearchImageQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.SystemAbility.class.equals(type)){
                
                        return fhzvfc.SystemAbility.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.SystemAbilityResponse.class.equals(type)){
                
                        return fhzvfc.SystemAbilityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.TaskControl.class.equals(type)){
                
                        return fhzvfc.TaskControl.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.TaskControlResponse.class.equals(type)){
                
                        return fhzvfc.TaskControlResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.VssSnapNotify.class.equals(type)){
                
                        return fhzvfc.VssSnapNotify.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.VssSnapNotifyResponse.class.equals(type)){
                
                        return fhzvfc.VssSnapNotifyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.VssTaskControl.class.equals(type)){
                
                        return fhzvfc.VssTaskControl.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (fhzvfc.VssTaskControlResponse.class.equals(type)){
                
                        return fhzvfc.VssTaskControlResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    