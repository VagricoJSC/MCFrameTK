package mcframe.clientMGBD.MGBDP0530;

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
 * 画面"MGBDP_BomLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_BomLst_MC extends MGBDP_BomLst_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_BomLst_MC() {
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
	public MGBDP_BomLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0530_Cnv01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0530_Cnv01Caller<P extends MGBDP_BomLst, B extends MG_MGBDL0530_Cnv01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0530_Cnv01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOneInput(Tab4_par_itm_cd, Tab4_chd_itm_cd, Tab4_bom_ptn));
			checkForCallStackCustom(msgList);
		}
		
		protected void checkForCallStackCustom(MCMessageList msgList) {
			if (!isNull(getTab4R().par_itm_cd()) && !isNull(getTab4R().chd_itm_cd())) {
				if (isSame(getTab4R().par_itm_cd(), getTab4R().chd_itm_cd()) &&
					isSame(getTab4R().par_itm_sub1(), getTab4R().chd_itm_sub1()) &&
					isSame(getTab4R().par_itm_sub2(), getTab4R().chd_itm_sub2()) &&
					isSame(getTab4R().par_itm_sub3(), getTab4R().chd_itm_sub3())){
					msgList.add(new MCMessage(getTab4R(), Tab4R.$par_itm_cd, MGBDP0006,
						toDispItm(getTab4R().par_itm_cd(), getTab4R().par_itm_sub1(), getTab4R().par_itm_sub2(), getTab4R().par_itm_sub3(), panel)));
				}
			}
		}
	}

	/**
	 * [MG_MGBDL0530_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0530_Srch01Caller<P extends MGBDP_BomLst, B extends MG_MGBDL0530_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0530_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
			msgList.addAll(checkAtLeastOne(Cnd_off_non_calc_flg, Cnd_on_non_calc_flg));
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
	 * [MG_MGBDL0530_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0530_Upd01Caller<P extends MGBDP_BomLst, B extends MG_MGBDL0530_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0530_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
		}
	}

	/**
	 * [MG_MGBDL0530_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0530_Del01Caller<P extends MGBDP_BomLst, B extends MG_MGBDL0530_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0530_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
		}
	}

	/**
	 * [MG_MGBDL0530_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0530_Imp01Caller<P extends MGBDP_BomLst, B extends MG_MGBDL0530_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBDL0530_Imp01Caller(P p, B b) {
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
	 * Panel[Cnd]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[Cnd]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0530_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0520]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0520(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0520(r);
	}
	protected void doBtn_open_MGBDP0520(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0520");
		mcframe.clientMGBD.MGBDP0520.CndR to = mcframe.clientMGBD.MGBDP0520.CndR.create();
		mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg p = (mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.term(r.term());
		to.par_itm_cd(r.par_itm_cd());
		to.par_itm_sub1(r.par_itm_sub1());
		to.par_itm_sub2(r.par_itm_sub2());
		to.par_itm_sub3(r.par_itm_sub3());
		to.bom_ptn(r.bom_ptn());
		
		if (isSame(MAC_STR.NULL_VAL.value(), r.wg_cd())) {
			to.cmn_flg(true);
		}
		else {
			to.wg_cd(r.wg_cd());
			to.wg_flg(true);
		}
		
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBD.MGBDP0520.CndR.$cmn_flg);
		list.add(mcframe.clientMGBD.MGBDP0520.CndR.$wg_flg);
		
		aso.putCnd(to, list);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0520(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0510_par]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0510_par(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0510_par(r);
	}
	protected void doBtn_open_MGBDP0510_par(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0510");
		mcframe.clientMGBD.MGBDP0510.CndR to = mcframe.clientMGBD.MGBDP0510.CndR.create();
		mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg p = (mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.par_itm_cd());
		to.itm_sub1(r.par_itm_sub1());
		to.itm_sub2(r.par_itm_sub2());
		to.itm_sub3(r.par_itm_sub3());
		
		if (getCndR().cmn_flg()) {
			to.cmn_flg(true);
		}
		if (getCndR().wg_flg()) {
			if (!isSame(MAC_STR.NULL_VAL.value(), r.wg_cd())) {
				to.wg_cd(r.wg_cd());
			}
			to.wg_flg(true);
		}
		
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBD.MGBDP0510.CndR.$cmn_flg);
		list.add(mcframe.clientMGBD.MGBDP0510.CndR.$wg_flg);
		
		aso.putCnd(to, list);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0510_par(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0510_chd]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0510_chd(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0510_chd(r);
	}
	protected void doBtn_open_MGBDP0510_chd(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0510");
		mcframe.clientMGBD.MGBDP0510.CndR to = mcframe.clientMGBD.MGBDP0510.CndR.create();
		mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg p = (mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.chd_itm_cd());
		to.itm_sub1(r.chd_itm_sub1());
		to.itm_sub2(r.chd_itm_sub2());
		to.itm_sub3(r.chd_itm_sub3());
		to.calc_ctg_cd(r.calc_ctg_cd());
		
		if (getCndR().cmn_flg()) {
			to.cmn_flg(true);
		}
		if (getCndR().wg_flg()) {
			if (!isSame(MAC_STR.NULL_VAL.value(), r.wg_cd())) {
				to.wg_cd(r.wg_cd());
			}
			to.wg_flg(true);
		}
		
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBD.MGBDP0510.CndR.$cmn_flg);
		list.add(mcframe.clientMGBD.MGBDP0510.CndR.$wg_flg);
		
		aso.putCnd(to, list);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0510_chd(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0500_chd]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0500_chd(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0500_chd(r);
	}
	protected void doBtn_open_MGBDP0500_chd(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0500");
		mcframe.clientMGBD.MGBDP0500.CndR to = mcframe.clientMGBD.MGBDP0500.CndR.create();
		mcframe.clientMGBD.MGBDP0500.MGBDP_ItmReg p = (mcframe.clientMGBD.MGBDP0500.MGBDP_ItmReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(r.calc_ctg_cd());
		if (!isSame(MAC_STR.NULL_VAL.value(), r.wg_cd())) {
			to.wg_cd(r.wg_cd());
		}
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.chd_itm_cd());
		to.itm_sub1(r.chd_itm_sub1());
		to.itm_sub2(r.chd_itm_sub2());
		to.itm_sub3(r.chd_itm_sub3());
		to.calc_ctg_cd(r.calc_ctg_cd());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0500_chd(r)) {
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
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMG_MGBDL0530_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMG_MGBDL0530_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[cnv_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_cnv_cmn(MCEventInfo info) {
		callMG_MGBDL0530_Cnv01();
	}
	/**
	 * Panel[Btn]のボタン[cnv_wg]の押下時の処理
	 */
	@Override
	public void doBtn_cnv_wg(MCEventInfo info) {
		callMG_MGBDL0530_Cnv01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMG_MGBDL0530_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMG_MGBDL0530_Del01();
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
		Rslt_par_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_par_base_unit_cd, columnRslt_par_dec_place);
		Rslt_chd_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_chd_base_unit_cd, columnRslt_chd_dec_place);
		Rslt_chd_base_qty_p_PPanel.setRelateBeans(columnRslt_chd_base_unit_cd, columnRslt_chd_dec_place);
		Rslt_fxd_chd_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_chd_base_unit_cd, columnRslt_chd_dec_place);
		Rslt_chd_min_qty_p_PPanel.setRelateBeans(columnRslt_chd_base_unit_cd, columnRslt_chd_dec_place);
		Rslt_chd_batch_qty_p_PPanel.setRelateBeans(columnRslt_chd_base_unit_cd, columnRslt_chd_dec_place);
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
		initRegTgt();

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_term_fr, term.term());
			setValueEx(Cnd_term_to, term.term());
		}

		setValueEx(Cnd_on_non_calc_flg, true);
		setValueEx(Cnd_off_non_calc_flg, true);
	}

	protected void initRegTgt() {
		if (!Cnd_srch_wg.authorize()) {
			setValueEx(Cnd_wg_flg, false);
		}
		if (!Cnd_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
		}
		if (!Cnd_ope_REF.isSelected()) {
			if (getCndR().cmn_flg() && getCndR().wg_flg()) {
				setValueEx(Cnd_cmn_flg, false);
			}
			else if (!getCndR().cmn_flg() && !getCndR().wg_flg()) {
				if (Cnd_srch_wg.authorize()) {
					setValueEx(Cnd_wg_flg, true);
				}
				else if (Cnd_srch_cmn.authorize()) {
					setValueEx(Cnd_cmn_flg, true);
				}
			}
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
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
		else if (Cnd_ope_CNV.isSelected()) {
			setSRCH_CNVStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		boolean expnd_flg = false;
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
		else if (Cnd_ope_CNV.isSelected()) {
			expnd_flg = true;
			setCNVStatus();
		}
		Ctrl_ctrl_PPanel.expand(expnd_flg);
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
	public void setSRCH_CNVStatus() {
		super.setSRCH_CNVStatus();
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

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setStatusCom();
	}

	@Override
	public void setCNVStatus() {
		super.setCNVStatus();
		if (Cnd_ope_CNV.isSelected()) {
			setTabComponentEnable(FoldTab, Tab4Panel);
		}
		else {
			setTabMode();
		}
		setRegTgtMode();
		setModeByRegTgt();
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
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

	protected boolean isCnvStatus() {
		return isSame(getStatus(), CNV);
	}

	protected void setStatusCom() {
		setTabMode();
		setRegTgtMode();
		setModeByRegTgt();
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
	}
	
	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
		}
		else if (Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected() || Cnd_ope_CNV.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
		}
		else {
			setTabComponentEnable(FoldTab);
		}
	}

	protected void setRegTgtMode() {
		if (!Cnd_srch_cmn.authorize() || !Cnd_srch_wg.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.READ_ONLY);
			Cnd_wg_flg.setMode(MCMode.READ_ONLY);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void setModeByRegTgt() {
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
			setDefaultMode(Btn_upd_wg);
			setDefaultMode(Btn_cnv_wg);
			setDefaultMode(Btn_del_wg);
			Btn_upd_cmn.setMode(MCMode.INVISIBLE);
			Btn_cnv_cmn.setMode(MCMode.INVISIBLE);
			Btn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			setValueEx(Cnd_wg_nm, null);

			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			setDefaultMode(Btn_upd_cmn);
			setDefaultMode(Btn_cnv_cmn);
			setDefaultMode(Btn_del_cmn);
			Btn_upd_wg.setMode(MCMode.INVISIBLE);
			Btn_cnv_wg.setMode(MCMode.INVISIBLE);
			Btn_del_wg.setMode(MCMode.INVISIBLE);
		}
		boolean ref_or_wg_flg = Cnd_ope_REF.isSelected() || getCndR().wg_flg();
		setColModeByFlg(columnRslt_wg_cd, ref_or_wg_flg);
		setColModeByFlg(columnRslt_wg_nm, ref_or_wg_flg);
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
		else if (isCnvStatus()) {
			Btn_select_all.setMode(MCMode.ENABLE);
			Btn_deselect_all.setMode(MCMode.ENABLE);
		}

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBDP0520, isEnableBtn_open_MGBDP0520(r));
		setBtnModeByFlg(Btn_open_MGBDP0510_par, isEnableBtn_open_MGBDP0510_par(r));
		setBtnModeByFlg(Btn_open_MGBDP0510_chd, isEnableBtn_open_MGBDP0510_chd(r));
		setBtnModeByFlg(Btn_open_MGBDP0500_chd, isEnableBtn_open_MGBDP0500_chd(r));
	}

	/**
	 * 原価ＢＯＭ登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0520(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.calc_ctg_cd(), r.term(), r.par_itm_cd(), r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3())
				&& !isNullOrNullVal(r.bom_ptn());
	}

	/**
	 * 原価品目詳細登録(親)画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0510_par(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.calc_ctg_cd(), r.term(), r.par_itm_cd(), r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3())
				&& !isNullOrNullVal(r.bom_ptn());
	}

	/**
	 * 原価品目詳細登録(子)画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0510_chd(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.calc_ctg_cd(), r.term(), r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3())
				&& !isNullOrNullVal(r.bom_ptn());
	}

	/**
	 * 原価品目情報登録(子)画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0500_chd(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.calc_ctg_cd(), r.term(), r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3());
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
		Rslt_par_itm_p_PPanel.addItmLCListner(this);
		Rslt_chd_itm_p_PPanel.addItmLCListner(this);
		columnRslt_chd_rqmt_qty.addLCListener(this);
		columnRslt_term.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Rslt_par_itm_p_PPanel.isItm(lc)) {
			doRslt_par_itm_cd_LC(info);
		}
		else if (Rslt_chd_itm_p_PPanel.isItm(lc)) {
			doRslt_chd_itm_cd_LC(info);
		}
		else if (lc == columnRslt_chd_rqmt_qty) {
			doRslt_chd_rqmt_qty_LC(info);
		}
		else if (lc == columnRslt_term) {
			doRslt_term_LC(info);
		}
	}
	public void doRslt_par_itm_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);

		doClearPtn(idx);
		if (Rslt_par_itm_p_PPanel.isItmFix(idx)) {
			if (isNull(r.par_rqmt_qty())) {
				setValueEx(columnRslt_par_rqmt_qty, idx, r.cost_std_qty());
			}
		}
	}
	public void doRslt_chd_itm_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);

		if (Rslt_chd_itm_p_PPanel.isItmFix(idx)) {
			if (isNull(r.fxd_chd_rqmt_qty())) {
				setValueEx(columnRslt_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
			if (isNull(r.chd_min_qty())) {
				setValueEx(columnRslt_chd_min_qty, idx, MCNumber.ZERO);
			}
			if (isNull(r.chd_batch_qty())) {
				setValueEx(columnRslt_chd_batch_qty, idx, MCNumber.ZERO);
			}
		}
	}

	public void doRslt_term_LC(MCEventInfo info) {
		doClearPtn(info.getEventIndex());
	}

	protected void doClearPtn(int idx) {
		setValueEx(columnRslt_bom_ptn, idx, null);
	}
	
	protected void doRslt_chd_rqmt_qty_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (isNull(r.chd_base_qty())) {
			setValueEx(columnRslt_chd_base_qty, info.getEventIndex(), r.chd_rqmt_qty());
		}
	}
	// 代替Ｇをクリアしたら関連項目をクリア
	@Override
	public void doRslt_alt_grp_cd_LC(MCEventInfo info) {
		super.doRslt_alt_grp_cd_LC(info);
		if (isNull(RsltTable.getSelectedMCRow().alt_grp_cd())) {
			setValueEx(columnRslt_alt_itm_ratio, info.getEventIndex(), null);
		}
	}

	// 工程をクリアしたら関連項目をクリア
	@Override
	public void doRslt_oper_cd_LC(MCEventInfo info) {
		super.doRslt_oper_cd_LC(info);
		if (isNull(RsltTable.getSelectedMCRow().oper_cd())) {
			setValueEx(columnRslt_oper_seq, info.getEventIndex(), null);
		}
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
		initRegTgt();
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
			if (isEnableBtn_open_MGBDP0520(r)) {
				doBtn_open_MGBDP0520(r);
			}
		}
	}

	@Override
	public boolean doCnd_cmn_flg_VC(MCEventInfo info) {
		if (!confirmRegDataClear()) {
			return false;
		}
		return super.doCnd_cmn_flg_VC(info);
	}
	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		clearContainers(getRsltL());
		setRegTgtValue(info);
		setSrchStatus();
	}

	@Override
	public boolean doCnd_wg_flg_VC(MCEventInfo info) {
		if (!confirmRegDataClear()) {
			return false;
		}
		return super.doCnd_wg_flg_VC(info);
	}
	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		clearContainers(getRsltL());
		setRegTgtValue(info);
		setSrchStatus();
	}

	protected void setRegTgtValue(MCEventInfo info) {
		if (info == null || Cnd_ope_REF.isSelected()) {
			return;
		}
		if (getCndR().cmn_flg() && getCndR().wg_flg()) {
			if (info.getComponent() == Cnd_cmn_flg) {
				getCndR().wg_flg(false);
			}
			else if (info.getComponent() == Cnd_wg_flg) {
				getCndR().cmn_flg(false);
			}
		}
	}
	
	@Override
	public void doCnd_no_alt_grp_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_no_alt_grp_flg_NC(info);
		if (getCndR().no_alt_grp_flg()) {
			setValueEx(Cnd_alt_grp_cd, null);
		}
	}
	@Override
	public void doCnd_alt_grp_cd_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_alt_grp_cd_NC(info);
		if (!isNull(getCndR().alt_grp_cd())) {
			setValueEx(Cnd_no_alt_grp_flg, false);
		}
	}
	
	@Override
	public void doCnd_no_expns_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_no_expns_flg_NC(info);
		if (getCndR().no_expns_flg()) {
			setValueEx(Cnd_expns_cd, null);
			setValueEx(Cnd_expns_nm, null);
		}
	}
	@Override
	public void doCnd_expns_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_expns_cd_LC(info);
		if (!isNull(getCndR().expns_cd())) {
			setValueEx(Cnd_no_expns_flg, false);
		}
	}
	@Override
	public void doCnd_expns_nm_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_expns_nm_NC(info);
		if (!isNull(getCndR().expns_nm())) {
			setValueEx(Cnd_no_expns_flg, false);
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
			callMG_MGBDL0530_Imp01();
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

	@Override
	protected void checkCustomFileInAction(MCTable<?> table, MCList list, MCMessageList msgList) {
		super.checkCustomFileInAction(table, list, msgList);
		if (table == RsltTable) {

			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));

			if (getCndR().cmn_flg()) {
				if (list.subList(r -> !isNull(((RsltR)r).wg_cd())).size() > 0) {
					msgList.add(msgRegTgtCmnInvalidCol(columnRslt_wg_cd));
				}
			}
		}
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
				if(column == columnRslt_alt_itm_ratio){
					// 代替ＧがNULLのとき入力不可
					if (isNull(r.alt_grp_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if(column == columnRslt_oper_seq){
					if (isNull(r.oper_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}