package mcframe.clientMSBC.MSBCP0360;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5070.*;

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
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_PssblPrdQtySrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_PssblPrdQtySrch_MC extends MSBCP_PssblPrdQtySrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_PssblPrdQtySrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_PssblPrdQtySrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0360_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0360_Srch01Caller<P extends MSBCP_PssblPrdQtySrch, B extends MS_MSBCL0360_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0360_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_dt_fr,Cnd_dt_to));
			msgList.addAll(checkAtLeastOne(CalcInvPanel));
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0360_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP1010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP1010(r);
	}
	protected void doBtn_open_MSBCP1010(RsltR r){
		if(!r.hrrchy().eq(MCNumber.ZERO)) {
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1010");
		mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg msbcp1010 = 
				(mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1010.CndR to = mcframe.clientMSBC.MSBCP1010.CndR.create();
		to.ope(msbcp1010.Cnd_ope_INS.getActionCommand());
		to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.ITM_ORD_NO.name());
		to.srch_tgt_no(r.itm_ord_no());
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0050(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP0050(r);
	}
	protected void doBtn_open_MSBCP0050(RsltR r){
		if(!r.hrrchy().eq(MCNumber.ZERO)) {
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
		mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch msbcp0050 = 
				(mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch) aso.getPanel();
		mcframe.clientMSBC.MSBCP0050.CndR to = mcframe.clientMSBC.MSBCP0050.CndR.create();
		aso.runValueInit();
		to.ope(msbcp0050.Cnd_ope_REF.getActionCommand());
		to.wg_cd(Cnd_wg_cd.getValue());
		to.mfg_end_schd_dt_fr(Cnd_dt_fr.getValue());
		to.mfg_end_schd_dt_to(Cnd_dt_to.getValue());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_ord_no(r.itm_ord_no());
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0290]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0290(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP0290(r);
	}
	protected void doBtn_open_MSBCP0290(RsltR r){
		if(!r.hrrchy().eq(MCNumber.ZERO)) {
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0290");
		mcframe.clientMSBC.MSBCP0290.MSBCP_ItmOrdGanttChart msbcp0290 = 
				(mcframe.clientMSBC.MSBCP0290.MSBCP_ItmOrdGanttChart) aso.getPanel();
		mcframe.clientMSBC.MSBCP0290.CndR to = mcframe.clientMSBC.MSBCP0290.CndR.create();
		to.opn_flg(true);
		to.sav_flg(true);
		to.fix_flg(true);
		to.inst_flg(true);
		to.dt_fr(getToday());
		to.dt_to(Cnd_dt_to.getValue());
		to.mfg_loc_cd(r.mfg_loc_cd());
		to.alloc_pln_r_view(msbcp0290.Cnd_alloc_pln_r_view_NRML.getActionCommand());
		to.wg_cd(Cnd_wg_cd.getValue());
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 初期表示
	 */
	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_stk, true);
		setValueEx(Cnd_plan_in, true);
		setValueEx(Cnd_unfirm_in, false);
		setValueEx(Cnd_plan_out, true);
		setValueEx(Cnd_unfirm_out, false);
		setValueEx(Cnd_dt_fr, getToday());
	}

}