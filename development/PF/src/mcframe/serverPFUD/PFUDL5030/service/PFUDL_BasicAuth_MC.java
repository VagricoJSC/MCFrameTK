package mcframe.serverPFUD.PFUDL5030.service;

import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import javax.xml.soap.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import mcframe.serverMA.dbc.MAM_EXT_SYS_USR_R;
import mcframe.commonMA.constant.MAC_IF_CTL_TYP;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.getExtSysUsrNE;

public class PFUDL_BasicAuth_MC {

	protected static final Class<PFUDL_BasicAuth> CLAZZ = PFUDL_BasicAuth.class;
	private static final String USE_HEADERS_CLASS = "1";
	
	private String _userName = null;
	private String _password = null;

	/**
	 *createInstance(String userName, String passWord) あるいはcreateInstance(String extSysCd) を使用してインスタンスを生成する。
	 */
	@Deprecated
	public PFUDL_BasicAuth_MC() {}
	
	public static PFUDL_BasicAuth createInstance(String userName, String password) {
		return object(CLAZZ)._createInstance(userName, password);
	}

	protected PFUDL_BasicAuth _createInstance(String userName, String password) {
		PFUDL_BasicAuth instance = new PFUDL_BasicAuth();
		instance.setUserName(userName);
		instance.setPassword(password);
		return instance;
	}

	public static PFUDL_BasicAuth createInstance(String extSysCd) {
		return object(CLAZZ)._createInstance(extSysCd);
	}

	protected PFUDL_BasicAuth _createInstance(String extSysCd) {
		MAM_EXT_SYS_USR_R extSysUsrR = getExtSysUsr(extSysCd);
		return createInstance(extSysUsrR.ext_sys_usr_cd(), extSysUsrR.ext_sys_pass());
	}

	protected static MAM_EXT_SYS_USR_R getExtSysUsr(String extSysCd) {
		MAM_EXT_SYS_USR_R extSysUsrR = getExtSysUsrNE(extSysCd);
		if (extSysUsrR == null) {
			extSysUsrR = MAM_EXT_SYS_USR_R.create();
		}
		return extSysUsrR;
	}
	
	public String getUserName() {
		return _userName;
	}

	protected void setUserName(String _userName) {
		this._userName = _userName;
	}

	public String getPassword() {
		return _password;
	}

	protected void setPassword(String _password) {
		this._password = _password;
	}

	public String getBaseAuthStr() {
		String authStr = _userName + ":" + _password;
		String encodedAuth = Base64.getEncoder().encodeToString(authStr.getBytes(StandardCharsets.UTF_8));
		return "Basic " + encodedAuth;
	}

	
	public void addBasicAuth(SOAPMessage soapMessage) {
		MimeHeaders mh = soapMessage.getMimeHeaders();
		mh.addHeader("Authorization", getBaseAuthStr());
	}


	public void addBasicAuth(BindingProvider bp, String ifProcTyp) {

		Map<String, Object> requestContext = bp.getRequestContext();
		Object headerObj = null;

		if (isSame(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR5, ifProcTyp), USE_HEADERS_CLASS)) {
			try {
				Class<?> headersClass = Class.forName("com.sun.xml.ws.transport.Headers");
				Constructor<?> ctor = headersClass.getDeclaredConstructor();
				Object headers = ctor.newInstance();
				Method addMethod = headersClass.getMethod("add", String.class, String.class);
				addMethod.invoke(headers, "Authorization", getBaseAuthStr());
				headerObj = headers;
			}
			catch (ClassNotFoundException e) {
				headerObj = createMapAuthHdr();
			}
			catch (Exception e) {
				headerObj = createMapAuthHdr();
			}

		}
		else {
			headerObj = createMapAuthHdr();
		}
		
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headerObj);
	}

	protected Object createMapAuthHdr() {
		Map<String, List<String>> headers = new TreeMap<>();
		headers.put("Authorization", Collections.singletonList(getBaseAuthStr()));
		return headers;
	}

}
