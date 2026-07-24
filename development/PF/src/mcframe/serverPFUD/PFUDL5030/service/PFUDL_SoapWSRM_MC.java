package mcframe.serverPFUD.PFUDL5030.service;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import static mcframe.commonPF.notice.PF_Msg.*;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCMessage;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.requester.MCRequestObject.*;
import java.util.*;

import java.net.URL;

import java.util.UUID;
import java.util.Set;

public class PFUDL_SoapWSRM_MC {
	

	private static final String WSRM;
	private static final String WSA;
	private static final String ACK_CLIENT_ADDR;
	private static final String CREATE_SEQUENCE;
	private static final String HTTP_UNAUTHORIZED = "401";

	protected static final Class<PFUDL_SoapWSRM> CLAZZ = PFUDL_SoapWSRM.class;

	static {
		WSRM = MCConst.app.getString("PF.PFUDL5030.wsrm");
		WSA = MCConst.app.getString("PF.PFUDL5030.wsa");
		ACK_CLIENT_ADDR = MCConst.app.getString("PF.PFUDL5030.ack_client_addr");
		CREATE_SEQUENCE = MCConst.app.getString("PF.PFUDL5030.create_sequence");
	}

	private  PFUDL_BasicAuth _basicAuth;
	private BindingProvider _bp;
	
	protected PFUDL_BasicAuth getBasicAuth() {
		return _basicAuth;
	}

	public void setBasicAuth(PFUDL_BasicAuth basicAuth) {
		_basicAuth = basicAuth;
	}

	public BindingProvider getBp() {
		return _bp;
	}

	protected void setBp(BindingProvider bp) {
		_bp = bp;
	}

	/**
	 * ハンドラを生成する場合はcreateWSRMHandler(BindingProvider,PFUDL_BasicAuth) を使用する。
	 */
	@Deprecated
	protected PFUDL_SoapWSRM_MC() {
	}
	
	protected PFUDL_SoapWSRM createInstance(BindingProvider bp, PFUDL_BasicAuth basicAuth) {
		PFUDL_SoapWSRM wsrm = new PFUDL_SoapWSRM();
		wsrm.setBp(bp);
		wsrm.setBasicAuth(basicAuth);
		return wsrm;
	}
	
	public static SOAPHandler<SOAPMessageContext> createWSRMHandler(BindingProvider bp, PFUDL_BasicAuth basicAuth) {
		return object(CLAZZ)._createWSRMHandler(bp, basicAuth);
	}

	protected SOAPHandler<SOAPMessageContext> _createWSRMHandler(BindingProvider bp, PFUDL_BasicAuth basicAuth) {
		PFUDL_SoapWSRM wsrm = createInstance(bp, basicAuth);
		return wsrm.getWSRMHandler();
	}

	
	protected String sendCreqteSequenceMsg(SOAPMessage soapMessage) {
		String sequenceId="";
		String endpoint = "";
		
		try {
			SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection connection = soapConnFactory.createConnection();
			endpoint = (String) _bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
			
			
			addWSRMHeaders(soapMessage, endpoint);
			_basicAuth.addBasicAuth(soapMessage);
			URL url = new URL(endpoint);
			SOAPMessage response = connection.call(soapMessage, url);
			
			SOAPBody responseBody = response.getSOAPBody();
			QName createSequenceResponseName = new QName(WSRM, "CreateSequenceResponse", "wsrm");
			Iterator<?> iterator = responseBody.getChildElements(createSequenceResponseName);

			SOAPElement createSequenceResponse = (SOAPElement) iterator.next();

			QName identifierQName = new QName(WSRM, "Identifier", "wsrm");
			Iterator<?> idIterator = createSequenceResponse.getChildElements(identifierQName);

			SOAPElement identifierElem = (SOAPElement) idIterator.next();

			sequenceId = identifierElem.getValue();

			connection.close();
		}
		catch (Exception e) {
			if (isAuthError(e)) {
				throw new MCAppException(new MCMessage(PFUDL0102, endpoint));
			}
			throw new MCAppException(e);
		}
	
		return sequenceId;
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
	
	protected SOAPMessage createCreqteSequenceMsg() {
		SOAPMessage soapMessage = null;
		try {
			MessageFactory messageFactory = MessageFactory.newInstance();
			soapMessage = messageFactory.createMessage();
			SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();

			envelope.addNamespaceDeclaration("wsrm", WSRM);
			envelope.addNamespaceDeclaration("wsa", WSA);

			SOAPBody body = envelope.getBody();
			addCreateSequenceBody(body);

			soapMessage.saveChanges();
		}
		catch (Exception e) {
			throw new MCAppException(e);
		}
		return soapMessage;
	}
	
	protected String createSequence() {
		SOAPMessage soapMessage = createCreqteSequenceMsg();
		return sendCreqteSequenceMsg(soapMessage);
	}


	protected  void addWSRMHeaders(SOAPMessage soapMessage, String endPoint) throws SOAPException {
		SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
		SOAPHeader header = envelope.getHeader();
		
		
		SOAPElement action = header.addChildElement("Action", "wsa");
		action.addTextNode(CREATE_SEQUENCE);

		SOAPElement messageID = header.addChildElement("MessageID", "wsa");
		messageID.addTextNode("urn:uuid:" + UUID.randomUUID().toString());

		SOAPElement to = header.addChildElement("To", "wsa");
		to.addTextNode(endPoint);
	}

	protected void addCreateSequenceBody(SOAPBody body) throws SOAPException {
		SOAPElement createSequence = body.addChildElement("CreateSequence", "wsrm");

		SOAPElement acksTo = createSequence.addChildElement("AcksTo", "wsrm");
		SOAPElement address = acksTo.addChildElement("Address", "wsa");
		address.addTextNode(ACK_CLIENT_ADDR);

	}

	protected WSRMHandler getWSRMHandler() {
		String sequenceId = createSequence();
		return new WSRMHandler(sequenceId);
	}

	protected class WSRMHandler implements SOAPHandler<SOAPMessageContext> {

		private String _sequenceId;
		private int _messageNumber = 1;

		public String getSequenceId() {
			return _sequenceId;
		}

		public int getMessageNumber() {
			return _messageNumber;
		}
		
		protected WSRMHandler(String sequenceId) {
			_sequenceId = sequenceId;
		}

		@Override
		public boolean handleMessage(SOAPMessageContext context) {
			Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			if (Boolean.TRUE.equals(outbound)) {
				try {
					SOAPMessage soapMessage = context.getMessage();
					SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
					SOAPHeader header = envelope.getHeader();
					if (header == null) {
						header = envelope.addHeader();
					}

					Name sequenceName = envelope.createName("Sequence", "wsrm", WSRM);
					SOAPHeaderElement sequenceElement = header.addHeaderElement(sequenceName);


					Name identifierName = envelope.createName("Identifier", "wsrm", WSRM);
					SOAPElement identifierElement = sequenceElement.addChildElement(identifierName);
					identifierElement.addTextNode(this._sequenceId);

					Name messageNumberName = envelope.createName("MessageNumber", "wsrm", WSRM);
					SOAPElement messageNumberElement = sequenceElement.addChildElement(messageNumberName);
					messageNumberElement.addTextNode(String.valueOf(_messageNumber++));
					soapMessage.saveChanges();

				}

				catch (SOAPException e) {
					throw new MCAppException(e);
				}
			}
			return true;
		}

		@Override
		public boolean handleFault(SOAPMessageContext context) {
			return true;
		}

		@Override
		public void close(MessageContext context) {
			// 必要に応じてリソースの解放処理
		}

		@Override
		public Set<QName> getHeaders() {
			return null;
		}

	}
}



