package mcframe.serverPFUD.PFUDL5030.service;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.UnsupportedEncodingException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCException;
import static mcframe.commonPF.notice.PF_Msg.*;

public  class PFUDL_SoapLoggingHandler_MC implements SOAPHandler<SOAPMessageContext> {
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isOutbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (isOutbound) {
			logSoapMessage(context.getMessage(), "=== SOAP Request Envelope ===");
		}
		else {
			logSoapMessage(context.getMessage(), "=== SOAP Response Envelope ===");
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		logSoapMessage(context.getMessage(), "=== SOAP Response Envelope (Fault) ===");
		return true;
	}

	@Override
	public void close(MessageContext context) {
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	protected void logSoapMessage(SOAPMessage message, String title) {
		if (null == message) return;
		
		StringBuffer msg = new StringBuffer();
		msg.append(title);
		msg.append(System.lineSeparator());
		
		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();

		try {
			message.writeTo(out);
		}
		catch (NullPointerException npe) {
			//何もしない。
			//Outboundメッセージの構築より先にハンドラが実行された場合はメッセージを取得できず、
			//NullPointerExceptionが発生する。これは制御不能。この場合はメッセージをログに出力せず（できない）処理を継続する。
		}
		catch (SOAPException | IOException e) {
			throw new MCException(e);
		}
		try {
			msg.append(out.toString("UTF-8"));
		}
		catch (UnsupportedEncodingException e) {
			throw new MCException(e);
		}
		
		MCLog.write(PFBAL0001, msg);
	}

}
