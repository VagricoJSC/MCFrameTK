package mcframe.serverMSUD.MSUDL5010;

import mcframe.commonCore.param.MCParam;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCDBTransactionListener;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.commonMA.constant.MAC_EXT_SYS_TYP;
import mcframe.serverMA.dbc.MAM_EXT_SYS_R;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import mcframe.serverMSBB.MSBBL6260.*;
import mcframe.serverMSBD.MSBDL5300.*;

public class MSUDL_TransactionListener_MC implements MCDBTransactionListener {

	protected static final Class<MSUDL_TransactionListener> CLAZZ = MSUDL_TransactionListener.class;

	@Override
	public void beforeCommit(MCParam param, MCDBTransaction tran) {
		callGALink();
	}

	protected void callGALink() {
		callGALinkForSlsSlip();
		callGALinkForPurcSlip();
	}
	protected void callGALinkForSlsSlip() {
		if (isCallGALink("GA_SLS_SLIP_EXT_SYS_CD")) {
			MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd04
				o = MSBBL_SlsSlipSendIfService.crtSlsSlipSendIf_Upd04();
			o.exec();
		}
	}
	protected void callGALinkForPurcSlip() {
		if (isCallGALink("GA_PURC_SLIP_EXT_SYS_CD")) {
			MSBDL_PurcSlipSendIfService.PurcSlipSendIf_Upd04
				o = MSBDL_PurcSlipSendIfService.crtPurcSlipSendIf_Upd04();
			o.exec();
		}
	}
	protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSysCache;
	protected boolean isCallGALink(String key) {
		String parm = getSysParmNE(key);
		if (!isNull(parm)) {
			if (object(CLAZZ)._extSysCache == null) {
				MAM_EXT_SYS_R m = MAM_EXT_SYS_R.create("M");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(m);
				bldr.setSelect(m.ext_sys_cd, m.ext_sys_typ, m.web_api_flg);
				object(CLAZZ)._extSysCache = new FXUCL_MCDbcCache<>(bldr);
			}
			MAM_EXT_SYS_R r = object(CLAZZ)._extSysCache.get(parm);
			if (!isNull(r)
				&& !isNull(r.ext_sys_cd())
				&& MAC_EXT_SYS_TYP.isAC(r.ext_sys_typ())
				&& r.web_api_flg()) {
				return true;
			}
		}
		return false;
	}
}
