package mcframe.serverPFUD.PFUDL5030.service;

import mcframe.commonCore.container.MCList;

public interface IfSoapServiceBase<T, U, V extends javax.xml.ws.Service> {
	public V getService(String ifProcTyp, String extSysCd);

	public T getPort(V service);

	public U createMessage(MCList<?> ifL);

	public void sendMessage(T port, U message);
}
