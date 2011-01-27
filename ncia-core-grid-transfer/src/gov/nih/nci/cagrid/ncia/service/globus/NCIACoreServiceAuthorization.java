package gov.nih.nci.cagrid.ncia.service.globus;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.Subject;
import javax.xml.namespace.QName;
import javax.xml.rpc.handler.MessageContext;

import org.globus.wsrf.config.ContainerConfig;
import org.globus.wsrf.impl.security.authorization.exceptions.AuthorizationException;
import org.globus.wsrf.impl.security.authorization.exceptions.CloseException;
import org.globus.wsrf.impl.security.authorization.exceptions.InitializeException;
import org.globus.wsrf.impl.security.authorization.exceptions.InvalidPolicyException;
import org.globus.wsrf.security.authorization.PDP;
import org.globus.wsrf.security.authorization.PDPConfig;
import org.w3c.dom.Node;


/** 
 * DO NOT EDIT:  This class is autogenerated!
 *
 * This is a PDP for use with the globus authorization callout.
 * This class will have a authorize method for each method on this grid service.
 * The method is responsibe for making any authorization callouts required to satisfy the 
 * authorization requirements placed on each method call.  Each method will either return
 * apon a successful authorization or will throw an exception apon a failed authorization.
 * 
 * @created by Introduce Toolkit version 1.3
 * 
 */
public class NCIACoreServiceAuthorization implements PDP {

	public static final String SERVICE_NAMESPACE = "http://ncia.cagrid.nci.nih.gov/NCIACoreService";
	
	Map authorizationClassMap = new HashMap();
	
	
	public NCIACoreServiceAuthorization() {
	}
	
	protected String getServiceNamespace(){
		return SERVICE_NAMESPACE;
	}
	
	public static String getCallerIdentity() {
		String caller = org.globus.wsrf.security.SecurityManager.getManager().getCaller();
		if ((caller == null) || (caller.equals("<anonymous>"))) {
			return null;
		} else {
			return caller;
		}
	}
					
	public void authorizeGetServiceSecurityMetadata(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeQuery(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveDicomData(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveDicomDataByPatientId(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveDicomDataBySeriesUID(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveDicomDataByStudyUID(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveDicomDataByPatientIds(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveDicomDataBySeriesUIDs(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveDicomDataByStudyUIDs(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeGetNumberOfStudyTimePointForPatient(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveDicomDataByNthStudyTimePointForPatient(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeGetRepresentativeImageBySeries(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeGetMultipleResourceProperties(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeGetResourceProperty(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeQueryResourceProperties(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeGetAvailableSearchTerms(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeSearchForPatients(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveStudyAndSeriesForPatient(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeRetrieveImagesForSeries(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeViewDicomHeader(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   				
	public void authorizeGetUsAvailableSearchTerms(Subject peerSubject, MessageContext context, QName operation) throws AuthorizationException {
		
	}
	   
	
	public boolean isPermitted(Subject peerSubject, MessageContext context, QName operation)
		throws AuthorizationException {
		
		if(!operation.getNamespaceURI().equals(getServiceNamespace())){
		  return false;
		}
		if(operation.getLocalPart().equals("getServiceSecurityMetadata")){
			authorizeGetServiceSecurityMetadata(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("query")){
			authorizeQuery(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveDicomData")){
			authorizeRetrieveDicomData(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveDicomDataByPatientId")){
			authorizeRetrieveDicomDataByPatientId(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveDicomDataBySeriesUID")){
			authorizeRetrieveDicomDataBySeriesUID(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveDicomDataByStudyUID")){
			authorizeRetrieveDicomDataByStudyUID(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveDicomDataByPatientIds")){
			authorizeRetrieveDicomDataByPatientIds(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveDicomDataBySeriesUIDs")){
			authorizeRetrieveDicomDataBySeriesUIDs(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveDicomDataByStudyUIDs")){
			authorizeRetrieveDicomDataByStudyUIDs(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("getNumberOfStudyTimePointForPatient")){
			authorizeGetNumberOfStudyTimePointForPatient(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveDicomDataByNthStudyTimePointForPatient")){
			authorizeRetrieveDicomDataByNthStudyTimePointForPatient(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("getRepresentativeImageBySeries")){
			authorizeGetRepresentativeImageBySeries(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("getMultipleResourceProperties")){
			authorizeGetMultipleResourceProperties(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("getResourceProperty")){
			authorizeGetResourceProperty(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("queryResourceProperties")){
			authorizeQueryResourceProperties(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("getAvailableSearchTerms")){
			authorizeGetAvailableSearchTerms(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("searchForPatients")){
			authorizeSearchForPatients(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveStudyAndSeriesForPatient")){
			authorizeRetrieveStudyAndSeriesForPatient(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("retrieveImagesForSeries")){
			authorizeRetrieveImagesForSeries(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("viewDicomHeader")){
			authorizeViewDicomHeader(peerSubject, context, operation);
			return true;
		} else if(operation.getLocalPart().equals("getUsAvailableSearchTerms")){
			authorizeGetUsAvailableSearchTerms(peerSubject, context, operation);
			return true;
		} 		
		return false;
	}
	

	public Node getPolicy(Node query) throws InvalidPolicyException {
		return null;
	}


	public String[] getPolicyNames() {
		return null;
	}


	public Node setPolicy(Node policy) throws InvalidPolicyException {
		return null;
	}


	public void close() throws CloseException {


	}


	public void initialize(PDPConfig config, String name, String id) throws InitializeException {
    	try{
    		String serviceName = (String)config.getProperty(name, "serviceName");
    	    String etcPath = ContainerConfig.getBaseDirectory() + File.separator + (String)config.getProperty(name, "etcDirectoryPath");

    	
    	} catch (Exception e){
        	throw new InitializeException(e.getMessage(),e);
		}
	}
	
	
}
