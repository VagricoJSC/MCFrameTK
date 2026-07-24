package mcframe.serverMAUD.MAUDL5010;

import mcframe.commonCore.param.MCParam;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCDBTransactionListener;
import mcframe.serverMAUC.MAUCL5020.MAUCL_RevDataService;

public class MAUDL_TransactionListener_MC implements MCDBTransactionListener {

	@Override
	public void beforeCommit(MCParam param, MCDBTransaction tran) {
		MAUCL_RevDataService.RevData_Upd02 ope = MAUCL_RevDataService.crtRevData_Upd02();
		ope.exec();
	}
}
