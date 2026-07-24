package mcframe.serverMAUC.MAUCL0030;

import mcframe.commonCore.container.MCList;
import mcframe.serverCore.event.MCWSLoginListener;
import mcframe.serverCore.event.MCWSLogoutListener;
import mcframe.serverCore.login.ExtAttrR;
import mcframe.serverCore.login.AppDataR;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.resource.MCConst;

import mcframe.serverMAUC.MAUCL0030.MAUCL_Dac;

public class MAUCL_BatchLogin_MC implements MCWSLoginListener, MCWSLogoutListener {

	/** リソース取得用キー */
	protected static final String _KEY_BATCH_DAC = "batch.dac";

	@Override
	public String getModuleID() {
		return "MA";
	}

	@Override
	public void doNLIEvent(ExtAttrR extAttrR, MCList<AppDataR> appDataL) {
		if(isMkDac()) {
			MAUCL_Dac.Srch09 srch09 = MAUCL_Dac.crtSrch09();
			srch09.up0().usr_cd(MCSys.user.ID());
			srch09.exec();
		}
	}

	@Override
	public void doNLOEvent() {
		if(isMkDac()) {
			MAUCL_Dac.Del09 del09 = MAUCL_Dac.crtDel09();
			del09.exec();
		}
	}

	/**
	 * バッチクライアントログイン時にＤＡＣ情報を作成するかをMCAppServerリソースから取得する。</br>
	 * リソースキー：batch.dac.[バッチＩＤ]</br>
	 * trueが設定されている場合は作成する。それ以外は作成しない。</br>
	 */
	protected boolean isMkDac() {
		String batchId = MCSys.request.reqSrcId();
		String key = MCConst.createKey(_KEY_BATCH_DAC, batchId);
		return MCConst.app.getBoolean(key);
	}

}