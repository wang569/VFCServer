
/**
 * VFCSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
    package fhzvfc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
    /**
     *  VFCSkeleton java skeleton for the axisService
     */
    public class VFCSkeleton implements VFCSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__Logout
                                     * @param logout0 
             * @return logoutResponse1 
         */
        
                 public fhzvfc.LogoutResponse logout
                  (
                  fhzvfc.Logout logout0
                  )
            {
                //TODO : fill this with the necessary business logic
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#logout");
                	 
                	 System.out.println("logout interface is called!");
                	 String logout_server = logout0.getServerID();
                	 System.out.println(logout_server + " logout!");
                	 LogoutResponse logoutResponse = new LogoutResponse();
                	 TResult tResult = new TResult();
                	 tResult.setResultMsg("101");
                	 tResult.setResultDesc("Succeed");
                	 logoutResponse.setResult(tResult);
                	 return logoutResponse;
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__VssTaskControl
                                     * @param vssTaskControl2 
             * @return vssTaskControlResponse3 
         */
        
                 public fhzvfc.VssTaskControlResponse vssTaskControl
                  (
                  fhzvfc.VssTaskControl vssTaskControl2
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#vssTaskControl");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__StruSearchImageQuery
                                     * @param struSearchImageQuery4 
             * @return struSearchImageQueryResponse5 
         */
        
                 public fhzvfc.StruSearchImageQueryResponse struSearchImageQuery
                  (
                  fhzvfc.StruSearchImageQuery struSearchImageQuery4
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#struSearchImageQuery");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__VssSnapNotify
                                     * @param vssSnapNotify6 
             * @return vssSnapNotifyResponse7 
         */
        
                 public fhzvfc.VssSnapNotifyResponse vssSnapNotify
                  (
                  fhzvfc.VssSnapNotify vssSnapNotify6
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#vssSnapNotify");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__Register
                                     * @param register8 
             * @return registerResponse9 
         */
        
                 public fhzvfc.RegisterResponse register
                  (
                  fhzvfc.Register register8
                  )
            {
                //TODO : fill this with the necessary business logic
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#register");
                	 System.out.println("register interface is called!"+new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss").format(new Date()));
                	 TServerInfo tServerInfo = register8.getServerInfo();
//                	 System.out.println("FactoryName = " + tServerInfo.getFactoryName() + ", IPAddr = "+tServerInfo.getIPAddr()
//                			 + ", IPV6Addr = " + tServerInfo.getIPV6Addr()+",MacAddr = " + tServerInfo.getMacAddr()
//                			 + ",Port = "+tServerInfo.getPort()+",ServerID = "+tServerInfo.getServerID()
//                			 +",ServerName = "+tServerInfo.getServerName());
                	 RegisterResponse registerResponse = new RegisterResponse();
             		TResult result = new TResult();
             		//if(tServerInfo.getIPAddr() != null){
             			result.setResultMsg("101");
             			result.setResultDesc("Succeed");
             		//}else{
             		//	result.setResultMsg("1");
             		//	result.setResultDesc("Failed");
             		//}
             		registerResponse.setResult(result);
             		return registerResponse;
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__TaskControl
                                     * @param taskControl10 
             * @return taskControlResponse11 
         */
        
                 public fhzvfc.TaskControlResponse taskControl
                  (
                  fhzvfc.TaskControl taskControl10
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#taskControl");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__JobStartDownFile
                                     * @param jobStartDownFile12 
             * @return jobStartDownFileResponse13 
         */
        
                 public fhzvfc.JobStartDownFileResponse jobStartDownFile
                  (
                  fhzvfc.JobStartDownFile jobStartDownFile12
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#jobStartDownFile");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__SearchImageTaskControl
                                     * @param searchImageTaskControl14 
             * @return searchImageTaskControlResponse15 
         */
        
                 public fhzvfc.SearchImageTaskControlResponse searchImageTaskControl
                  (
                  fhzvfc.SearchImageTaskControl searchImageTaskControl14
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#searchImageTaskControl");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__SystemAbility
                                     * @param systemAbility16 
             * @return systemAbilityResponse17 
         */
        
                 public fhzvfc.SystemAbilityResponse systemAbility
                  (
                  fhzvfc.SystemAbility systemAbility16
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#systemAbility");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__JobDownFileResultReport
                                     * @param jobDownFileResultReport18 
             * @return jobDownFileResultReportResponse19 
         */
        
                 public fhzvfc.JobDownFileResultReportResponse jobDownFileResultReport
                  (
                  fhzvfc.JobDownFileResultReport jobDownFileResultReport18
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#jobDownFileResultReport");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__JobDownFileProcessReport
                                     * @param jobDownFileProcessReport20 
             * @return jobDownFileProcessReportResponse21 
         */
        
                 public fhzvfc.JobDownFileProcessReportResponse jobDownFileProcessReport
                  (
                  fhzvfc.JobDownFileProcessReport jobDownFileProcessReport20
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#jobDownFileProcessReport");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__JobProcessQuery
                                     * @param jobProcessQuery22 
             * @return jobProcessQueryResponse23 
         */
        
                 public fhzvfc.JobProcessQueryResponse jobProcessQuery
                  (
                  fhzvfc.JobProcessQuery jobProcessQuery22
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#jobProcessQuery");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__JobResultNotify
                                     * @param jobResultNotify24 
             * @return jobResultNotifyResponse25 
         */
        
                 public fhzvfc.JobResultNotifyResponse jobResultNotify
                  (
                  fhzvfc.JobResultNotify jobResultNotify24
                  )
            {
                //TODO : fill this with the necessary business logic
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#jobResultNotify");
                	 
                	 System.out.println("jobResultNotify interface is called! ");
                	 
                	 String ServerID = jobResultNotify24.getServerID();
                	 int num = jobResultNotify24.getNum();
                	 TJobResult[] jobResultList = jobResultNotify24.getJobResult();
                	 for(int i=0;i<num;i++){
                		 String JobID = jobResultList[i].getJobID();
                		 int JobType = jobResultList[i].getJobType();
                		 int State = jobResultList[i].getState();
                		 int SuspectNumber = jobResultList[i].getSuspectNumber();
                		 int VehicleNumber = jobResultList[i].getVehicleNumber();
                		 int ThingNumber = jobResultList[i].getThingNumber(); 
                		 System.out.println("ServerID = "+ServerID+"["+i+"] : { JobID = "+ JobID+",JobType = "+JobType
                				 +",State = "+State+",SuspectNumber = "+SuspectNumber+",VehicleNumber = "+VehicleNumber
                				 +",ThingNumber = "+ThingNumber+" }");
                	 }
                	 JobResultNotifyResponse jobResultNotifyResponse = new JobResultNotifyResponse();
                	 TResult tResult = new TResult();
                	 tResult.setResultMsg("101");
                	 tResult.setResultDesc("Succeed");
                	 
                	 jobResultNotifyResponse.setResult(tResult);
                	 return jobResultNotifyResponse;
            }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__HeartBeat
                                     * @param heartBeat26 
             * @return heartBeatResponse27 
         */
        
                 public fhzvfc.HeartBeatResponse heartBeat
                  (
                  fhzvfc.HeartBeat heartBeat26
                  )
            {
                //TODO : fill this with the necessary business logic
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#heartBeat");
                	 System.out.println("heartBeat interface is called!");
                	 String serverID = heartBeat26.getServerID();
                	 HeartBeatResponse heartBeatResponse =new HeartBeatResponse();
                	 TResult result = new TResult();
                     int timeMode = 1;//1、网络 2手动
                     SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");//设置日期格式
                     String localTime = df.format(new Date());
                     String timeZone = "UTC+08:00";
                     //String timeZone =TimeZone.getDefault().getDisplayName();
                 	if(serverID.equals("123456789")){
                 		System.out.println("heartBeat called succeed!");
                 		result.setResultMsg("101");
             			result.setResultDesc("Succeed");
                 	}else{
                 		result.setResultMsg("1");
             			result.setResultDesc("Failed");
                 	}
                 	THeartInfo tHeartInfo = new THeartInfo();
                 	tHeartInfo.setResult(result);
                 	tHeartInfo.setTimeMode(timeMode);
                 	tHeartInfo.setTimeZone(timeZone);
                 	tHeartInfo.setLocalTime(localTime);
                	 heartBeatResponse.setHeartInfo(tHeartInfo);
             		return heartBeatResponse;
            }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__QueryJobResult
                                     * @param queryJobResult28 
             * @return queryJobResultResponse29 
         */
        
                 public fhzvfc.QueryJobResultResponse queryJobResult
                  (
                  fhzvfc.QueryJobResult queryJobResult28
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#queryJobResult");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__QuerySnap
                                     * @param querySnap30 
             * @return querySnapResponse31 
         */
        
                 public fhzvfc.QuerySnapResponse querySnap
                  (
                  fhzvfc.QuerySnap querySnap30
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#querySnap");
        }
     
         
        /**
         * Auto generated method signature
         * Service definition of function ns1__JobProcessNotify
                                     * @param jobProcessNotify32 
             * @return jobProcessNotifyResponse33 
         */
        
                 public fhzvfc.JobProcessNotifyResponse jobProcessNotify
                  (
                  fhzvfc.JobProcessNotify jobProcessNotify32
                  )
            {
                //TODO : fill this with the necessary business logic
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#jobProcessNotify");
                	 System.out.println("jobProcessNotify interface is called!");
                	 String ServerID = jobProcessNotify32.getServerID();
                	 int num = jobProcessNotify32.getNum();
                	 TJobProcess[] jobProcessList = jobProcessNotify32.getJobProcess();
                	 for(int i=0;i<num;i++){
                		 String JobID = jobProcessList[i].getJobID();
                		 int JobType = jobProcessList[i].getJobType();
                		 int Process = jobProcessList[i].getProcess();
                		 int State = jobProcessList[i].getState();
                		 System.out.println("ServerID = "+ServerID+"["+i+"] : { JobID = "+ JobID+",JobType = "+JobType+",Process = "+Process+",State = "+State+" }");
                	 }
                	 JobProcessNotifyResponse jobProcessNotifyResponse = new JobProcessNotifyResponse();
                	 TResult tResult = new TResult();
                	 tResult.setResultMsg("101");
                	 tResult.setResultDesc("Succeed");
                	 jobProcessNotifyResponse.setResult(tResult);
                	 return jobProcessNotifyResponse;
            }
     
    }
    