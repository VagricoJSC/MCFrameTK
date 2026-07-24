package mcframe.serverPFUD.PFUDL5030.service;


import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.SOAPFaultException;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.MAC_IF_CTL_TYP;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverMB.dbc.MBT_JOURNAL_SND_IF_R;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import static mcframe.commonPF.notice.PF_Msg.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;

abstract public class PFUDL_SoapSendBase_MC extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase {

	abstract public class SoapSendBase_MC extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase {

		private static final String HTTP_UNAUTHORIZED = "401";
		private static final String USE_WSRM = "1";
		private PFUDL_BasicAuth _basicAuth;

		protected boolean useWSRM(String ifProcTyp) {
			if (isSame(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR4, ifProcTyp), USE_WSRM)) {
				return true;
			}
			else {
				return false;
			}
		}

		protected void setTimeOut(BindingProvider port, String ifProcTyp) {
			setConnectTimeOut(port, ifProcTyp);
			setRequestTimeOut(port, ifProcTyp);
		}

		protected void setConnectTimeOut(BindingProvider port, String ifProcTyp) {

			String connectResourceName = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR6, ifProcTyp);
			MCNumber connectMilSec = ifPrtclMgr().getIfCtlNumber(MAC_IF_CTL_TYP.EXT_SYS_STR6, ifProcTyp);

			if (!isNull(connectResourceName) && !isNull(connectMilSec)) {
				Map<String, Object> ctx = port.getRequestContext();
				ctx.put(connectResourceName, connectMilSec.intValue());
			}
		}

		protected void setRequestTimeOut(BindingProvider port, String ifProcTyp) {
			
			String requestResourceName = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR7, ifProcTyp);
			MCNumber requestMilSec = ifPrtclMgr().getIfCtlNumber(MAC_IF_CTL_TYP.EXT_SYS_STR7, ifProcTyp);

			if (!isNull(requestResourceName) && !isNull(requestMilSec)) {
				Map<String, Object> ctx = port.getRequestContext();
				ctx.put(requestResourceName, requestMilSec.intValue());
			}
		}
		
		protected IfSoapServiceBase _soapServiceBaseImplClass;

		public void setClazz(IfSoapServiceBase soapServiceBaseImplClass) {
			_soapServiceBaseImplClass = soapServiceBaseImplClass;
		}

		public PFUDL_BasicAuth getBasicAuth() {
			return _basicAuth;
		}

		protected void setBasicAuth(PFUDL_BasicAuth basicAuth) {
			_basicAuth = basicAuth;
		}

		
		protected void setHandler(Handler handler, BindingProvider port) {
			
		    if (handler == null || port == null) {
		        return;
		    }
		    
			List<Handler> handlerChain = port.getBinding().getHandlerChain();
			handlerChain.add(handler);
			port.getBinding().setHandlerChain(handlerChain);
		}

		protected void setSoapHandlers(BindingProvider port, String ifProcTyp) {
			setHandler(new PFUDL_SoapLoggingHandler(), port);
			if (useWSRM(ifProcTyp)) {
				setHandler(PFUDL_SoapWSRM.createWSRMHandler(port, _basicAuth), port);
			}
		}
	
		@SuppressWarnings("unchecked")
		public void doSoap(SdrvDtlR sdrvIfR, MCList<?> ifL) {
			try {
				setBasicAuth(PFUDL_BasicAuth.createInstance(sdrvIfR.ext_sys_cd()));

				BindingProvider port = (BindingProvider) _soapServiceBaseImplClass.getPort(_soapServiceBaseImplClass.getService(sdrvIfR.if_proc_typ(), sdrvIfR.ext_sys_cd()));

				setSoapHandlers(port, sdrvIfR.if_proc_typ());
				
				_basicAuth.addBasicAuth(port, sdrvIfR.if_proc_typ());
				
				setTimeOut(port, sdrvIfR.if_proc_typ());
				
				_soapServiceBaseImplClass.sendMessage( port, _soapServiceBaseImplClass.createMessage(ifL));

			}
			catch (SOAPFaultException sfe) {
				addSOAPFaultMsg(sfe, ifL,sdrvIfR);
				setSdrvIfErr(sfe.getFault().getFaultString());
			}
			catch (MCAppException mcae) {
				throw mcae;
			}
			catch (Exception e) {
				
				if (isAuthError(e)) {
					addAuthErrMsg(ifL, sdrvIfR);
				}
				else {
					addExceptionMessage(e, ifL, sdrvIfR);
				}
				setSdrvIfErr(e.getMessage());
			}

		}

		
		protected void addAuthErrMsg(MCList<?> ifL, SdrvDtlR sdrvIfR) {
			ifL.forEach(ifR -> {
				MCMessagePool.add(new MCMessage(ifR, null, PFUDL0103, sdrvIfR.ext_sys_cd(), sdrvIfR.if_proc_typ(),
						ifR.getNumberNE(MBT_JOURNAL_SND_IF_R.$data_no), ifR.getNumberNE(MBT_JOURNAL_SND_IF_R.$data_lno)));
			});
		}


		protected void setSdrvIfErr(String errMsg) {
			// 例外が発生したケースにおいて
			// 送受信ＩＦの送受信状況区分を設定する処理などを必要に応じてサブクラスで実装する。
		}
		
		protected void addExceptionMessage(Exception e, MCList<?> ifL, SdrvDtlR sdrvIfR) {
			addErrMsg(e.getMessage(), ifL, sdrvIfR);
		}

		protected void addErrMsg(String msg, MCList<?> ifL, SdrvDtlR sdrvIfR) {
			ifL.forEach(ifR -> {
				MCMessagePool.add(new MCMessage(ifR, null, PFUDL0104, sdrvIfR.ext_sys_cd(), sdrvIfR.if_proc_typ(),
						ifR.getNumberNE(MBT_JOURNAL_SND_IF_R.$data_no), ifR.getNumberNE(MBT_JOURNAL_SND_IF_R.$data_lno), msg));
			});
		}
		
		protected  void addSOAPFaultMsg(SOAPFaultException e,MCList<?> ifL, SdrvDtlR sdrvIfR) {
			StringBuffer msg = new StringBuffer();
			msg.append("Fault Code: " + e.getFault().getFaultCode());
			msg.append(System.lineSeparator());
			msg.append("Fault String: " + e.getFault().getFaultString());
			if (e.getFault().hasDetail()) {
				msg.append(System.lineSeparator());
				msg.append("Fault Details: " + e.getFault().getDetail().getTextContent());
			}
					
			addErrMsg(msg.toString(), ifL, sdrvIfR);
		}
		


		protected boolean isAuthError(Throwable e) {
			while (e != null) {
				String msg = e.getMessage();
				if (msg != null && msg.contains(HTTP_UNAUTHORIZED)) {
					return true;
				}
				e = e.getCause();
			}
			return false;
		}
		
	}

}