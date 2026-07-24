package mcframe.clientMGBB.MGBBP0040;

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
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5310.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_InstOperReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_InstOperReg_MC extends MGBBP_InstOperReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_InstOperReg_MC() {
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
	public MGBBP_InstOperReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0040_Srch01Caller<P extends MGBBP_InstOperReg, B extends MG_MGBBL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_schd_st_dt_fr, Cnd_schd_st_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_schd_end_dt_fr, Cnd_schd_end_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_act_st_dt_fr, Cnd_act_st_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_act_end_dt_fr, Cnd_act_end_dt_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MG_MGBBL0040_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0040_Upd01Caller<P extends MGBBP_InstOperReg, B extends MG_MGBBL0040_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0040_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0040_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0040_Del01Caller<P extends MGBBP_InstOperReg, B extends MG_MGBBL0040_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0040_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0040_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0040_Del02Caller<P extends MGBBP_InstOperReg, B extends MG_MGBBL0040_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0040_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getDelCndR()));
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true ;
		}
	}

	/**
	 * [MG_MGBBL0040_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0040_Imp01Caller<P extends MGBBP_InstOperReg, B extends MG_MGBBL0040_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBBL0040_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBBL0040_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0040_Ins01Caller<P extends MGBBP_InstOperReg, B extends MG_MGBBL0040_Ins01Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0040_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0040_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0040_Ins02Caller<P extends MGBBP_InstOperReg, B extends MG_MGBBL0040_Ins02Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0040_Ins02Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBBL0040_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0030(r);
	}
	protected void doBtn_open_MGBBP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0030");
		mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg p = (mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0030.CndR to = mcframe.clientMGBB.MGBBP0030.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		aso.putCnd(to);
		aso.runValueInit();
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0100(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0100(r);
	}
	protected void doBtn_open_MGBBP0100(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0100");
		mcframe.clientMGBB.MGBBP0100.CndR to = mcframe.clientMGBB.MGBBP0100.CndR.create();
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.oper_act_no(r.oper_act_no());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBB.MGBBP0100.CndR.$ym_fr);
		list.add(mcframe.clientMGBB.MGBBP0100.CndR.$ym_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0120(r);
	}
	protected void doBtn_open_MGBBP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0120");
		mcframe.clientMGBB.MGBBP0120.CndR to = mcframe.clientMGBB.MGBBP0120.CndR.create();
		to.par_itm_cd(r.itm_cd());
		to.par_itm_sub1(r.itm_sub1());
		to.par_itm_sub2(r.itm_sub2());
		to.par_itm_sub3(r.itm_sub3());
		to.par_itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.oper_act_no(r.oper_act_no());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBB.MGBBP0120.CndR.$ym_fr);
		list.add(mcframe.clientMGBB.MGBBP0120.CndR.$ym_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0130(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0130(r);
	}
	protected void doBtn_open_MGBBP0130(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0130");
		mcframe.clientMGBB.MGBBP0130.CndR to = mcframe.clientMGBB.MGBBP0130.CndR.create();
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.oper_act_no(r.oper_act_no());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBB.MGBBP0130.CndR.$ym_fr);
		list.add(mcframe.clientMGBB.MGBBP0130.CndR.$ym_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0150]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0150(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0150(r);
	}
	protected void doBtn_open_MGBBP0150(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0150");
		mcframe.clientMGBB.MGBBP0150.CndR to = mcframe.clientMGBB.MGBBP0150.CndR.create();
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.oper_act_no(r.oper_act_no());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBB.MGBBP0150.CndR.$ym_fr);
		list.add(mcframe.clientMGBB.MGBBP0150.CndR.$ym_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0300]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0300(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0300(r);
	}
	protected void doBtn_open_MGBBP0300(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0300");
		mcframe.clientMGBB.MGBBP0300.MGBBP_ActMfgIfReg p = (mcframe.clientMGBB.MGBBP0300.MGBBP_ActMfgIfReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0300.CndR to = mcframe.clientMGBB.MGBBP0300.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.oper_act_no(r.oper_act_no());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBB.MGBBP0300.CndR.$ym_fr);
		list.add(mcframe.clientMGBB.MGBBP0300.CndR.$ym_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0320]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0320(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0320(r);
	}
	protected void doBtn_open_MGBBP0320(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0320");
		mcframe.clientMGBB.MGBBP0320.MGBBP_ActInptIfReg p = (mcframe.clientMGBB.MGBBP0320.MGBBP_ActInptIfReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0320.CndR to = mcframe.clientMGBB.MGBBP0320.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.par_itm_cd(r.itm_cd());
		to.par_itm_sub1(r.itm_sub1());
		to.par_itm_sub2(r.itm_sub2());
		to.par_itm_sub3(r.itm_sub3());
		to.par_itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.oper_act_no(r.oper_act_no());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBB.MGBBP0320.CndR.$ym_fr);
		list.add(mcframe.clientMGBB.MGBBP0320.CndR.$ym_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0330]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0330(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0330(r);
	}
	protected void doBtn_open_MGBBP0330(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0330");
		mcframe.clientMGBB.MGBBP0330.MGBBP_ActInstWkIfReg p = (mcframe.clientMGBB.MGBBP0330.MGBBP_ActInstWkIfReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0330.CndR to = mcframe.clientMGBB.MGBBP0330.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.oper_act_no(r.oper_act_no());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBB.MGBBP0330.CndR.$ym_fr);
		list.add(mcframe.clientMGBB.MGBBP0330.CndR.$ym_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0350]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0350(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0350(r);
	}
	protected void doBtn_open_MGBBP0350(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0350");
		mcframe.clientMGBB.MGBBP0350.MGBBP_ActInstWipIfReg p = (mcframe.clientMGBB.MGBBP0350.MGBBP_ActInstWipIfReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0350.CndR to = mcframe.clientMGBB.MGBBP0350.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.oper_act_no(r.oper_act_no());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBB.MGBBP0350.CndR.$ym_fr);
		list.add(mcframe.clientMGBB.MGBBP0350.CndR.$ym_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(RsltTable);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBBL0040_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[ins_in_file]の押下時の処理
	 */
	@Override
	public void doBtn_ins_in_file(MCEventInfo info) {
		callMG_MGBBL0040_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[ins_del_in_file]の押下時の処理
	 */
	@Override
	public void doBtn_ins_del_in_file(MCEventInfo info) {
		callMG_MGBBL0040_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBBL0040_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_bulk]の押下時の処理
	 */
	@Override
	public void doBtn_del_bulk(MCEventInfo info) {
		callMG_MGBBL0040_Del02();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit(){
		super.valueInit();
		getCndR().this_term(getTerm(this));
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		else if (Cnd_ope_DELBULK.isSelected()) {
			setDEL_BULKStatus();
		}
		else if (Cnd_ope_INS_FILE.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_INSDEL_FILE.isSelected()) {
			setINS_DELStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setStatusCom();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}

	@Override
	public void setDEL_BULKStatus() {
		super.setDEL_BULKStatus();
		setStatusCom();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	@Override
	public void setINS_DELStatus() {
		super.setINS_DELStatus();
		setStatusCom();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setStatusCom() {
		setTabMode();
		
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
	}

	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
		}
	}

	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else if (Cnd_ope_DELBULK.isSelected() || Cnd_ope_INSDEL_FILE.isSelected()) {
			setTabComponentEnable(FoldTab, Tab3Panel);
		}
		else {
			setTabComponentEnable(FoldTab);
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (!isNull(r.upd_cntr())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBBP0030, isEnableBtn_open_MGBBP0030(r));
		setBtnModeByFlg(Btn_open_MGBBP0100, isEnableBtn_open_MGBBP0100(r));
		setBtnModeByFlg(Btn_open_MGBBP0120, isEnableBtn_open_MGBBP0120(r));
		setBtnModeByFlg(Btn_open_MGBBP0130, isEnableBtn_open_MGBBP0130(r));
		setBtnModeByFlg(Btn_open_MGBBP0150, isEnableBtn_open_MGBBP0150(r));
		setBtnModeByFlg(Btn_open_MGBBP0300, isEnableBtn_open_MGBBP0300(r));
		setBtnModeByFlg(Btn_open_MGBBP0320, isEnableBtn_open_MGBBP0320(r));
		setBtnModeByFlg(Btn_open_MGBBP0330, isEnableBtn_open_MGBBP0330(r));
		setBtnModeByFlg(Btn_open_MGBBP0350, isEnableBtn_open_MGBBP0350(r));
	}

	/**
	 * 遷移先で検索を実行するか
	 */
	protected boolean isSearchForOpen(RsltR r) {
		if (r == null) {
			return false;
		}
		return Rslt_itm_p_PPanel.isItmFixLight(r.getGUIIndex()) && !isNull(r.itm_mfg_inst_no());
	}

	/**
	 * 品目製造指図情報一覧画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0030(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 製造実績一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0100(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 投入実績一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0120(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 指図工数実績一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0130(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 指図仕掛実績一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0150(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 製造実績ＩＦ一覧画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0300(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 投入実績ＩＦ一覧画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0320(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 指図工数実績ＩＦ一覧画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0330(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 指図仕掛実績ＩＦ一覧画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0350(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 操作種別によるステータスカラムの表示・非表示切替
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	/**
	 * デフォルト計算カテゴリを初期表示する
	 */
	protected void initCalcCtg() {
		if (Cnd_ope_DELBULK.isSelected()
				|| Cnd_ope_INSDEL_FILE.isSelected()) {
			setDefCalcCtg(DelCnd_calc_ctg_cd);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		initCalcCtg();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MGBBP0030(r)) {
				doBtn_open_MGBBP0030(r);
			}
		}
	}

	// -----------------------------------------------
	// File input
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		if (Cnd_ope_UPD.isSelected()) {
			callMG_MGBBL0040_Imp01();
		}
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			if (isUpdStatus()) {
				if (!isNull(r.upd_cntr()) && isKeyColumn(column, r)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}