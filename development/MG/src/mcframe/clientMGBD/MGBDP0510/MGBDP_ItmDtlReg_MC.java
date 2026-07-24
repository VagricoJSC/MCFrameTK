package mcframe.clientMGBD.MGBDP0510;

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
 * 画面"MGBDP_ItmDtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ItmDtlReg_MC extends MGBDP_ItmDtlReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ItmDtlReg_MC() {
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
	public MGBDP_ItmDtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

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
	 * [MG_MGBDL0510_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0510_Srch01Caller<P extends MGBDP_ItmDtlReg, B extends MG_MGBDL0510_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0510_Srch01Caller(P p, B b) {
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
	 * [MG_MGBDL0510_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0510_Upd01Caller<P extends MGBDP_ItmDtlReg, B extends MG_MGBDL0510_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0510_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
		}
	}

	/**
	 * [MG_MGBDL0510_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0510_Del01Caller<P extends MGBDP_ItmDtlReg, B extends MG_MGBDL0510_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0510_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
		}
	}

	/**
	 * [MG_MGBDL0510_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0510_Imp01Caller<P extends MGBDP_ItmDtlReg, B extends MG_MGBDL0510_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBDL0510_Imp01Caller(P p, B b) {
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
		callMG_MGBDL0510_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0560]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0560(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0560(r);
	}
	protected void doBtn_open_MGBDP0560(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0560");
		mcframe.clientMGBD.MGBDP0560.CndR to = mcframe.clientMGBD.MGBDP0560.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.oper_ptn(r.oper_ptn());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0560(r)) {
			aso.putSearchAction();
		}
		aso.show();
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
		to.wg_cd(r.wg_cd());
		to.term(r.term());
		to.par_itm_cd(r.itm_cd());
		to.par_itm_sub1(r.itm_sub1());
		to.par_itm_sub2(r.itm_sub2());
		to.par_itm_sub3(r.itm_sub3());
		to.bom_ptn(r.bom_ptn());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0520(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0580]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0580(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0580(r);
	}
	protected void doBtn_open_MGBDP0580(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0580");
		mcframe.clientMGBD.MGBDP0580.CndR to = mcframe.clientMGBD.MGBDP0580.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.term_fr(r.term());
		to.term_to(r.term());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.oper_ptn(r.oper_ptn());
		aso.putCnd(to);
		aso.runValueInit();
		if (isEnableBtn_open_MGBDP0580(r)) {
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
		RsltR r = copyRow(RsltTable);
		if (r != null && getCndR().cmn_flg()) {
			r.wg_cd(null);
		}
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMG_MGBDL0510_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMG_MGBDL0510_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMG_MGBDL0510_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMG_MGBDL0510_Del01();
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
		Rslt_min_lot_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_batch_lot_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_fxd_lot_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_fxd_yield_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_nmr_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_dnm_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_max_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
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
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
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
		setRegTgtMode();
		setModeByRegTgt();
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
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
			setDefaultMode(Btn_del_wg);
			Btn_upd_cmn.setMode(MCMode.INVISIBLE);
			Btn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			setValueEx(Cnd_wg_nm, null);

			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			setDefaultMode(Btn_upd_cmn);
			setDefaultMode(Btn_del_cmn);
			Btn_upd_wg.setMode(MCMode.INVISIBLE);
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

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBDP0560, isEnableBtn_open_MGBDP0560(r));
		setBtnModeByFlg(Btn_open_MGBDP0520, isEnableBtn_open_MGBDP0520(r));
		setBtnModeByFlg(Btn_open_MGBDP0580, isEnableBtn_open_MGBDP0580(r));
	}

	/**
	 * 原価品目工程登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0560(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.calc_ctg_cd(), r.term(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
				r.oper_ptn());
	}

	/**
	 * 原価ＢＯＭ登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0520(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.calc_ctg_cd(), r.term(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())
				&& !isNullOrNullVal(r.bom_ptn());
	}

	/**
	 * 原価品目工数登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0580(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.calc_ctg_cd(), r.term(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
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
		else if (lc == columnRslt_term) {
			doRslt_term_LC(info);
		}
	}
	public void doRslt_itm_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);

		doClearPtn(idx);
		setValueEx(columnRslt_loc_cd, idx, null);
		setValueEx(columnRslt_cost_ratio, idx, MCNumber.ONE);
		
		if (Rslt_itm_p_PPanel.isItmFix(idx)) {
			if (isNull(r.min_lot_qty())) {
				setValueEx(columnRslt_min_lot_qty, idx, MCNumber.ZERO);
			}
			if (isNull(r.batch_lot_qty())) {
				setValueEx(columnRslt_batch_lot_qty, idx, MCNumber.ZERO);
			}
			if (isNull(r.fxd_lot_qty())) {
				setValueEx(columnRslt_fxd_lot_qty, idx, MCNumber.ZERO);
			}
			if (isNull(r.fxd_yield_qty())) {
				setValueEx(columnRslt_fxd_yield_qty, idx, MCNumber.ZERO);
			}
		}
		else {
			setValueEx(columnRslt_min_lot_qty, idx, null);
			setValueEx(columnRslt_batch_lot_qty, idx, null);
			setValueEx(columnRslt_fxd_lot_qty, idx, null);
			setValueEx(columnRslt_fxd_yield_qty, idx, null);
		}
	}

	public void doRslt_term_LC(MCEventInfo info) {
		doClearPtn(info.getEventIndex());
	}

	protected void doClearPtn(int idx) {
		setValueEx(columnRslt_oper_ptn, idx, null);
		setValueEx(columnRslt_bom_ptn, idx, null);
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
			if (isEnableBtn_open_MGBDP0560(r)) {
				doBtn_open_MGBDP0560(r);
			}
			else if (isEnableBtn_open_MGBDP0520(r)) {
				doBtn_open_MGBDP0520(r);
			}
		}
	}

	@Override
	public void doRslt_wg_cd_LC(MCEventInfo info) {
		super.doRslt_wg_cd_LC(info);
		int idx = info.getEventIndex();

		setValueEx(columnRslt_loc_cd, idx, null);
	}

	@Override
	public void doRslt_loc_cd_LC(MCEventInfo info) {
		super.doRslt_loc_cd_LC(info);
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);

		setValueEx(columnRslt_alc_dpt_cd, idx, null);

		if(isNullOrNullVal(r.loc_cd()) || !isNull(r.loc_sppl_cd())) {
			doClearPtn(idx);
			setValueEx(columnRslt_nmr_qty, idx, null) ;
			setValueEx(columnRslt_dnm_qty, idx, null) ;
		}
		else {
			if (isNull(r.nmr_qty())) {
				setValueEx(columnRslt_nmr_qty, idx, MCNumber.ONE) ;
			}
			if (isNull(r.dnm_qty())) {
				setValueEx(columnRslt_dnm_qty, idx, MCNumber.ONE) ;
			}
		}
	}

	@Override
	public void doRslt_sppl_cd_LC(MCEventInfo info) {
		super.doRslt_sppl_cd_LC(info);
		doClearPtn(info.getEventIndex());
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
		setModeByRegTgt();
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
		setModeByRegTgt();
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
			callMG_MGBDL0510_Imp01();
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
				if (column == columnRslt_loc_cd) {
					if (isNull(r.asset_mng_typ()) || !MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (!isNullOrNullVal(r.sppl_cd()) || !isNullOrNullVal(r.rqst_wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_sppl_cd || column == columnRslt_alc_dpt_cd) {
					if (!isNullOrNullVal(r.loc_cd()) || !isNullOrNullVal(r.rqst_wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_rqst_wg_cd) {
					if (!isNullOrNullVal(r.loc_cd()) || !isNullOrNullVal(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_bom_ptn) {
					if (isNullOrNullVal(r.loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_oper_ptn) {
					if (isNullOrNullVal(r.loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_nmr_qty || column == columnRslt_dnm_qty) {
					if (isNullOrNullVal(r.loc_cd()) || !isNull(r.loc_sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}