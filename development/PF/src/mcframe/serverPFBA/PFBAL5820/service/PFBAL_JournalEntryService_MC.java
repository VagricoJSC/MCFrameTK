package mcframe.serverPFBA.PFBAL5820.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;
import mcframe.commonMA.constant.MAC_IF_CTL_TYP;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;

public class PFBAL_JournalEntryService_MC<T> extends javax.xml.ws.Service {
	
	protected PFBAL_JournalEntryService_MC(URL wsdlDocumentLocation, QName serviceName) {
		super(wsdlDocumentLocation, serviceName);
	}

	protected String _wsdlLocation;
	protected String _serviceNameLocalPart;
	protected String _portNameLocalPart;
	protected String _nameSpaceURI;
	protected QName _serviceQName;
	protected QName _portQName;

	
	protected String getWsdlLocation() {
		return _wsdlLocation;
	}

	protected void setWsdlLocation(String wsdlLocation) {
		this._wsdlLocation = wsdlLocation;
	}

	protected String getServiceNameLocalPart() {
		return _serviceNameLocalPart;
	}

	protected void setServiceNameLocalPart(String serviceNameLocalPart) {
		this._serviceNameLocalPart = serviceNameLocalPart;
	}

	protected String getPortNameLocalPart() {
		return _portNameLocalPart;
	}

	protected void setPortNameLocalPart(String portNameLocalPart) {
		this._portNameLocalPart = portNameLocalPart;
	}

	protected String getNameSpaceURI() {
		return _nameSpaceURI;
	}

	protected void setNameSpaceURI(String nameSpaceURI) {
		this._nameSpaceURI = nameSpaceURI;
	}

	protected QName getServiceQName() {
		return _serviceQName;
	}

	protected void setServiceQName(QName serviceQName) {
		this._serviceQName = serviceQName;
	}

	protected QName getPortQName() {
		return _portQName;
	}

	protected void setPortQName(QName portQName) {
		this._portQName = portQName;
	}

	@SuppressWarnings("rawtypes")
	protected Class _clazz;
	
	@SuppressWarnings("rawtypes")
	protected void set_clazz(Class _clazz) {
		this._clazz = _clazz;
	}

	
	@SuppressWarnings("rawtypes")
	public static <T> PFBAL_JournalEntryService createJE2Service(String ifProcTyp, String extSysCd, Class clazz) {

		URL url;
		String wsdlLocation = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.WEB_URL, ifProcTyp);
		String serviceNameLocalPart = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR1, ifProcTyp);
		String nameSpaceURI = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR2, ifProcTyp);
		String portNameLocalPart = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR3, ifProcTyp);
		QName serviceQName = new QName(nameSpaceURI, serviceNameLocalPart);
		QName portQName = new QName(nameSpaceURI, portNameLocalPart);

		try {
			url = new URL(wsdlLocation);
		}
		catch (MalformedURLException ex) {
			throw new WebServiceException(ex);
		}

		PFBAL_JournalEntryService serviceInstance = new PFBAL_JournalEntryService(url, serviceQName);
		serviceInstance.setPortNameLocalPart(portNameLocalPart);
		serviceInstance.setNameSpaceURI(nameSpaceURI);
		serviceInstance.setPortQName(portQName);
		serviceInstance.setServiceQName(serviceQName);
		serviceInstance.setWsdlLocation(wsdlLocation);
		serviceInstance.set_clazz(clazz);
		return serviceInstance;
	}


	public T getBinding() {
		return (T)super.getPort(getPortQName(), _clazz);
	}
}
