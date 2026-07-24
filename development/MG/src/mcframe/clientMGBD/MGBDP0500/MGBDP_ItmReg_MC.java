package mcframe.clientMGBD.MGBDP0500;

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
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5160.*;
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
 * 画面"MGBDP_ItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ItmReg_MC extends MGBDP_ItmReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ItmReg_MC() {
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
	public MGBDP_ItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0500_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0500_Srch01Caller<P extends MGBDP_ItmReg, B extends MG_MGBDL0500_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0500_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_off_non_calc_flg, Cnd_on_non_calc_flg));
			msgList.addAll(checkAtLeastOne(Cnd_off_fix_flg, Cnd_on_fix_flg));
			msgList.addAll(checkAtLeastOne(Cnd_off_del_flg, Cnd_on_del_flg));
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
	 * [MG_MGBDL0500_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0500_Upd01Caller<P extends MGBDP_ItmReg, B extends MG_MGBDL0500_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0500_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBDL0500_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0500_Del01Caller<P extends MGBDP_ItmReg, B extends MG_MGBDL0500_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0500_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * [MG_MGBDL0500_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0500_Ins01Caller<P extends MGBDP_ItmReg, B extends MG_MGBDL0500_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0500_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}
	}


	/**
	 * [MG_MGBDL0500_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0500_Imp01Caller<P extends MGBDP_ItmReg, B extends MG_MGBDL0500_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBDL0500_Imp01Caller(P p, B b) {
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
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0500_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0310]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0310(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABCP0310(r);
	}
	protected void doBtn_open_MABCP0310(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0310");
		mcframe.clientMABC.MABCP0310.MABCP_ItmReg p = (mcframe.clientMABC.MABCP0310.MABCP_ItmReg) aso.getPanel();
		mcframe.clientMABC.MABCP0310.CndR to = mcframe.clientMABC.MABCP0310.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MABCP0310(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0510]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0510(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0510(r);
	}
	protected void doBtn_open_MGBDP0510(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0510");
		mcframe.clientMGBD.MGBDP0510.CndR to = mcframe.clientMGBD.MGBDP0510.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0510(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0600]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0600(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0600(r);
	}
	protected void doBtn_open_MGBDP0600(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0600");
		mcframe.clientMGBD.MGBDP0600.CndR to = mcframe.clientMGBD.MGBDP0600.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0600(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0660]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0660(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0660(r);
	}
	protected void doBtn_open_MGBDP0660(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0660");
		mcframe.clientMGBD.MGBDP0660.CndR to = mcframe.clientMGBD.MGBDP0660.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0660(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0610]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0610(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0610(r);
	}
	protected void doBtn_open_MGBDP0610(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0610");
		mcframe.clientMGBD.MGBDP0610.CndR to = mcframe.clientMGBD.MGBDP0610.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0610(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0590]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0590(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0590(r);
	}
	protected void doBtn_open_MGBDP0590(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0590");
		mcframe.clientMGBD.MGBDP0590.CndR to = mcframe.clientMGBD.MGBDP0590.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0590(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0620]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0620(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0620(r);
	}
	protected void doBtn_open_MGBDP0620(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0620");
		mcframe.clientMGBD.MGBDP0620.CndR to = mcframe.clientMGBD.MGBDP0620.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0620(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0100(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABGP0100(r);
	}
	protected void doBtn_open_MABGP0100(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0100");
		mcframe.clientMABG.MABGP0100.CndR to = mcframe.clientMABG.MABGP0100.CndR.create();
		to.calc_ptn_cd(r.calc_ptn_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
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
		RsltR r = copyRow(RsltTable);
		if (r != null) {
			r.fix_flg(false);
			r.del_flg(false);
		}
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0500_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0500_Del01();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBDL0500_Ins01();
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
		Rslt_std_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_term_fr, term.term());
			setValueEx(Cnd_term_to, term.term());
		}
		setValueEx(Cnd_off_non_calc_flg, true);
		setValueEx(Cnd_on_non_calc_flg, true);
		setValueEx(Cnd_off_fix_flg, true);
		setValueEx(Cnd_on_fix_flg, true);
		
		setDefCalcCtg(Ins_calc_ctg_cd);
		setValueEx(Ins_ins_only_flg, true);
		setValueEx(Cnd_off_del_flg, true);
		setValueEx(Cnd_on_del_flg, true);
		setValueEx(Ins_with_no_release_flg, true);
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}
	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
		}
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
		else if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
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
		else if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
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
	public void setINSStatus() {
		super.setINSStatus();
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
	
	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else if (Cnd_ope_INS.isSelected()) {
			setTabComponentEnable(FoldTab, Tab3Panel, Tab4Panel);
			setInsTabMode();
		}
		else {
			setTabComponentEnable(FoldTab);
		}
	}

	protected void setInsTabMode() {
		if (getInsR().runtime_wg_flg()) {
			Ins_wg_cd.setMode(MCMode.ENABLE);
			setDefaultMode(Ins_runtime_wg_cd);
		}
		else {
			setDefaultMode(Ins_wg_cd);
			setValueEx(Ins_runtime_wg_cd, null);
			Ins_runtime_wg_cd.setMode(MCMode.READ_ONLY);
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
		setBtnModeByFlg(Btn_open_MABCP0310, isEnableBtn_open_MABCP0310(r));
		setBtnModeByFlg(Btn_open_MGBDP0510, isEnableBtn_open_MGBDP0510(r));
		setBtnModeByFlg(Btn_open_MGBDP0600, isEnableBtn_open_MGBDP0600(r));
		setBtnModeByFlg(Btn_open_MGBDP0660, isEnableBtn_open_MGBDP0660(r));
		setBtnModeByFlg(Btn_open_MGBDP0610, isEnableBtn_open_MGBDP0610(r));
		setBtnModeByFlg(Btn_open_MGBDP0590, isEnableBtn_open_MGBDP0590(r));
		setBtnModeByFlg(Btn_open_MGBDP0620, isEnableBtn_open_MGBDP0620(r));
		setBtnModeByFlg(Btn_open_MABGP0100, isEnableBtn_open_MABGP0100(r));
	}

	/**
	 * 品目マスタ登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABCP0310(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
	}

	/**
	 * 原価品目詳細登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0510(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.term());
	}

	/**
	 * 原価品目購買単価登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0600(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.term());
	}

	/**
	 * 原価品目加工単価登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0660(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.term());
	}

	/**
	 * 原価品目支給単価登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0610(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.term());
	}

	/**
	 * 原価品目販売単価登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0590(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.term());
	}

	/**
	 * 原価品目指値登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0620(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.term());
	}

	/**
	 * 計算パタンマスタ登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABGP0100(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.calc_ptn_cd());
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

	// -----------------------------------------------
	// Event
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Rslt_itm_p_PPanel.addItmLCListner(this);
		columnRslt_term.addLCListener(this);
	}

	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Rslt_itm_p_PPanel.isItm(lc)) {
			doRslt_itm_cd_LC(info);
		}
	}
	public void doRslt_itm_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);

		setValueEx(columnRslt_calc_ptn_cd, idx, r.calc_ptn_cd());
		setValueEx(columnRslt_std_qty, idx, r.std_qty());
	}
	public void doRslt_calc_ptn_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);

		setBtnModeByFlg(Btn_open_MABGP0100, isEnableBtn_open_MABGP0100(r));
	}

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
			if (isEnableBtn_open_MABCP0310(r)) {
				doBtn_open_MABCP0310(r);
			}
		}
	}

	@Override
	public void doIns_runtime_wg_flg_NC(MCEventInfo info) {
		super.doIns_runtime_wg_flg_NC(info);
		setInsTabMode();
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
			callMG_MGBDL0500_Imp01();
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
			if (isRegStatus()) {
				if (r.fix_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}