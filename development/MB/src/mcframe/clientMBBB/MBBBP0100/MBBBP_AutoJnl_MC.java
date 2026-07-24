package mcframe.clientMBBB.MBBBP0100;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBBP_AutoJnl"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBBP_AutoJnl_MC extends MBBBP_AutoJnl_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_AutoJnl_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBBL0100_Ins01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0100_Ins01Caller<P extends MBBBP_AutoJnl, B extends MB_MBBBL0100_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_BatchCaller<P, B> {

		protected MB_MBBBL0100_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMB_MBBBL0100_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[open_MBBBP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBBP0110(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBBP0110");
		mcframe.clientMBBB.MBBBP0110.CndR to = mcframe.clientMBBB.MBBBP0110.CndR.create();
		to.ac_ym_fr(getCndR().ac_ym());
		to.ac_ym_to(getCndR().ac_ym());
		to.ac_slip_dt(getCndR().ac_slip_dt());
		to.jnl_act_cd(getCndR().jnl_act_cd());
		to.jnl_rmrks(getCndR().jnl_rmrks());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMBBB.MBBBP0110.CndR.$ac_ym_fr);
		list.add(mcframe.clientMBBB.MBBBP0110.CndR.$ac_ym_to);
		aso.putCnd(to, list);
		aso.runValueInit();
		aso.show();
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void valueInit(){
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		getCndR().ac_ym(getAcYm(getToday(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
		getCndR().ac_slip_dt(getToday());
	}

}