package mcframe.clientMSBD.MSBDP0020;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcFrcstBalReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcFrcstBalReg_MC extends MSBDP_PurcFrcstBalReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcFrcstBalReg_MC() {
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
	public MSBDP_PurcFrcstBalReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0020_Srch01Caller<P extends MSBDP_PurcFrcstBalReg, B extends MS_MSBDL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}
	
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkAtLeastOne(SubconTgtPanel));
			msgList.addAll(checkAtLeastOne(PurcCommitTgtPanel));
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
	 * [MS_MSBDL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0020_Upd01Caller<P extends MSBDP_PurcFrcstBalReg, B extends MS_MSBDL0020_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0020_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
	}

	/**
	 * [MS_MSBDL0020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0020_Del01Caller<P extends MSBDP_PurcFrcstBalReg, B extends MS_MSBDL0020_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0020_Del01Caller(P p, B b) {
			super(p, b);
		}
		
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBDL0020_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0080(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBDP0080(r);
	}
	protected void doBtn_open_MSBDP0080(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0080");
		aso.runValueInit();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0040(r);
	}
	protected void doBtn_open_MSBCP0040(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0040");
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[sprt_cf]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_cf(MCEventInfo info) {
		// 実行確認
		MCMessage msgExecConfirm = new MCMessage(MSBDP0010);
		if (confirm(msgExecConfirm) == MCMessageBox.YES_OPTION) {
			// 処理対象
			MCList<RsltR> cl = getRsltL().subList(
					r -> r.check() && !r.cmpl_flg() && isSame(r.ym(), getBtnR().cf_ym_fr()));
			if (isNull(cl)) {
				dialog(msgNoCheckedRow());
				return;
			}
			
			// チェック処理
			MCMessageList msgL = checkReq(Btn_cf_ym_fr);
			
			if (!msgL.isEmpty()) {
				message(msgL);
				return ;
			}
			
			doBtn_sprt_cf(cl);
			
		}
		
	}
	
	protected void doBtn_sprt_cf(MCList<RsltR> cl) {
		MCDate toYm = getBtnR().cf_ym_fr().addMonth(1);
		MCIndexKey idx = getRsltL().createIndex(RsltR.$itm_cd, RsltR.$itm_sub1,
				RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$sppl_cd, RsltR.$wg_cd,
				RsltR.$trd_unit_cd, RsltR.$ym);
		for (RsltR fr : cl) {
			RsltR to = getRsltL().getFirst(idx, new Comparable<?>[] {
					fr.itm_cd(), fr.itm_sub1(), fr.itm_sub2(), fr.itm_sub3(),
					fr.sppl_cd(), fr.wg_cd(), fr.trd_unit_cd(), toYm
			});
			if (to == null) {
				continue;
			}
			
			fr.cmpl_flg(true);
			MCNumber diffQty = fr.trd_unit_diff_qty(); 
			setDiffQty(fr);
			MCNumber bfQty = null;
			if (!isNull(diffQty) && MCNumber.ZERO.neq(diffQty)) {
				bfQty = diffQty.negate();
			}
			setValueEx(columnRslt_trd_unit_bf_qty, to.getGUIIndex(), bfQty);
			setValueEx(columnRslt_check, to.getGUIIndex(), true);
		}
		
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0020_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0020_Del01();
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
		
		Rslt_trd_unit_pf_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_monthly_pf_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_tendays_pf_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_weekly_pf_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_bf_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_po_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_monthly_po_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_weekly_po_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_diff_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		
		Rslt_base_unit_pf_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_monthly_pf_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_tendays_pf_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_weekly_pf_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_po_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_monthly_po_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_weekly_po_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_diff_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		
		Rslt_base_unit_bf_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_bf_qty, columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty);
		
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_subcon_t_flg, true);
		setValueEx(Cnd_subcon_f_flg, true);
		
		setValueEx(Cnd_purc_commit_t_flg, true);
		setValueEx(Cnd_purc_commit_f_flg, true);
		
		MCDate ymFr = getAcYm(getToday().addDay(-15), getCo().ac_cl_day(), getCo().ac_cl_mon_base());
		MCDate ymTo = isNull(ymFr) ? null : ymFr.addMonth(1);
		setValueEx(Cnd_ym_fr, ymFr);
		setValueEx(Cnd_ym_to, ymTo);
		
		setValueEx(Btn_cf_ym_fr, ymFr);
	}

	// -----------------------------------------------
	// status
	
	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setDispCtrlStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setDispCtrlStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setDispCtrlStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBBP0080(r)) {
			setDefaultMode(Btn_open_MSBDP0080);
		}
		else {
			Btn_open_MSBDP0080.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBCP0040(r)) {
			setDefaultMode(Btn_open_MSBCP0040);
		}
		else {
			Btn_open_MSBCP0040.setMode(MCMode.DISABLE);
		}
	}

	protected boolean isEnableBtn_open_MSBBP0080(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	protected boolean isEnableBtn_open_MSBCP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
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

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
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
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	protected void setDispCtrlStatus() {
		boolean monthlyFlg = getCndR().show_monthly_flg();
		boolean tendaysFlg = getCndR().show_tendays_flg();
		boolean weeklyFlg = getCndR().show_weekly_flg();
		
		setModeByFlg(columnRslt_trd_unit_monthly_pf_qty, monthlyFlg);
		setModeByFlg(columnRslt_trd_unit_monthly_po_qty, (monthlyFlg || tendaysFlg));
		setModeByFlg(columnRslt_trd_unit_tendays_pf_qty, tendaysFlg);
		setModeByFlg(columnRslt_trd_unit_weekly_pf_qty, weeklyFlg);
		setModeByFlg(columnRslt_trd_unit_weekly_po_qty, weeklyFlg);
		
		boolean baseFlg = getCndR().show_base_unit_flg();
		setModeByFlg(columnRslt_base_unit_cd, baseFlg);
		setModeByFlg(columnRslt_base_unit_nm, baseFlg);
		setModeByFlg(columnRslt_base_unit_pf_qty, baseFlg);
		setModeByFlg(columnRslt_base_unit_po_qty, baseFlg);
		setModeByFlg(columnRslt_base_unit_monthly_pf_qty, baseFlg && monthlyFlg);
		setModeByFlg(columnRslt_base_unit_monthly_po_qty, baseFlg && (monthlyFlg || tendaysFlg));
		setModeByFlg(columnRslt_base_unit_tendays_pf_qty, baseFlg && tendaysFlg);
		setModeByFlg(columnRslt_base_unit_weekly_pf_qty, baseFlg && weeklyFlg);
		setModeByFlg(columnRslt_base_unit_weekly_po_qty, baseFlg && weeklyFlg);
		setModeByFlg(columnRslt_base_unit_bf_qty, baseFlg);
		setModeByFlg(columnRslt_base_unit_diff_qty, baseFlg);
		
		boolean termFlg = getCndR().show_term_flg();
		setModeByFlg(columnRslt_ym_st_dt, termFlg);
		setModeByFlg(columnRslt_ym_end_dt, termFlg);
		setModeByFlg(columnRslt_monthly_ym_st_dt, termFlg && (monthlyFlg || tendaysFlg));
		setModeByFlg(columnRslt_monthly_ym_end_dt, termFlg && (monthlyFlg || tendaysFlg));
		setModeByFlg(columnRslt_week_ym_st_dt, termFlg && weeklyFlg);
		setModeByFlg(columnRslt_week_ym_end_dt, termFlg && weeklyFlg);
	}
	
	protected void setModeByFlg(MCColumnConfig b, boolean flg) {
		if (flg) {
			setDefaultMode(b);
		}
		else {
			b.setMode(MCMode.INVISIBLE);
		}
	}
	
	// -----------------------------------------------
	// event/listener
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（ファイル取込エラー時）、REF（検索モード）では、クリア確認出さない
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
	public void doCnd_show_monthly_flg_NC(MCEventInfo info) {
		super.doCnd_show_monthly_flg_NC(info);
		setDispCtrlStatus();
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			columnRslt_trd_unit_monthly_pf_qty.adjustWidth();
			columnRslt_trd_unit_monthly_po_qty.adjustWidth();
			columnRslt_base_unit_monthly_pf_qty.adjustWidth();
			columnRslt_base_unit_monthly_po_qty.adjustWidth();
		}
	}
	
	@Override
	public void doCnd_show_tendays_flg_NC(MCEventInfo info) {
		super.doCnd_show_tendays_flg_NC(info);
		setDispCtrlStatus();
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			columnRslt_trd_unit_tendays_pf_qty.adjustWidth();
			columnRslt_trd_unit_monthly_po_qty.adjustWidth();
			columnRslt_base_unit_tendays_pf_qty.adjustWidth();
			columnRslt_base_unit_monthly_po_qty.adjustWidth();
		}
	}
	
	@Override
	public void doCnd_show_weekly_flg_NC(MCEventInfo info) {
		super.doCnd_show_weekly_flg_NC(info);
		setDispCtrlStatus();
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			columnRslt_trd_unit_weekly_pf_qty.adjustWidth();
			columnRslt_trd_unit_weekly_po_qty.adjustWidth();
			columnRslt_base_unit_weekly_pf_qty.adjustWidth();
			columnRslt_base_unit_weekly_po_qty.adjustWidth();
		}
	}
	
	@Override
	public void doCnd_show_term_flg_NC(MCEventInfo info) {
		super.doCnd_show_term_flg_NC(info);
		setDispCtrlStatus();
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			columnRslt_ym_st_dt.adjustWidth();
			columnRslt_ym_end_dt.adjustWidth();
			columnRslt_monthly_ym_st_dt.adjustWidth();
			columnRslt_monthly_ym_end_dt.adjustWidth();
			columnRslt_week_ym_st_dt.adjustWidth();
			columnRslt_week_ym_end_dt.adjustWidth();
		}
	}
	
	@Override
	public void doCnd_show_base_unit_flg_NC(MCEventInfo info) {
		super.doCnd_show_base_unit_flg_NC(info);
		setDispCtrlStatus();
		boolean boo = (boolean)info.getNewValue();
		if (boo) {
			columnRslt_base_unit_cd.adjustWidth();
			columnRslt_base_unit_nm.adjustWidth();
			columnRslt_base_unit_pf_qty.adjustWidth();
			columnRslt_base_unit_po_qty.adjustWidth();
			columnRslt_base_unit_monthly_pf_qty.adjustWidth();
			columnRslt_base_unit_monthly_po_qty.adjustWidth();
			columnRslt_base_unit_tendays_pf_qty.adjustWidth();
			columnRslt_base_unit_weekly_pf_qty.adjustWidth();
			columnRslt_base_unit_weekly_po_qty.adjustWidth();
			columnRslt_base_unit_bf_qty.adjustWidth();
			columnRslt_base_unit_diff_qty.adjustWidth();
		}
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnRslt_trd_unit_bf_qty.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnRslt_trd_unit_bf_qty) {
			doRslt_trd_unit_bf_qty(info);
		}
		
	}
	
	protected void doRslt_trd_unit_bf_qty(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		setDiffQty(r);
	}
	
	@Override
	public void doRslt_cmpl_flg_NC(MCEventInfo info) {
		super.doRslt_cmpl_flg_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		setDiffQty(r);
	}
	
	protected void setDiffQty(RsltR r) {
		if (r == null) {
			return ;
		}
		
		// 差異数量計算、引取率計算
		MCNumber pfQty = null;
		MCNumber poQty = null;
		if (r.weekly_flg()) {
			pfQty = r.trd_unit_weekly_pf_qty();
			poQty = r.trd_unit_weekly_po_qty();
		}
		else if (r.tendays_flg()) {
			pfQty = r.trd_unit_tendays_pf_qty();
			poQty = r.trd_unit_monthly_po_qty();
		}
		else if (r.monthly_flg()) {
			pfQty = r.trd_unit_monthly_pf_qty();
			poQty = r.trd_unit_monthly_po_qty();
		}
		poQty = nvl(poQty, MCNumber.ZERO);
		pfQty = nvl(pfQty, MCNumber.ZERO);

		MCNumber bfQty = nvl(r.trd_unit_bf_qty(), MCNumber.ZERO);
		MCNumber commitQty = pfQty.add(bfQty);
		MCNumber diffQty = poQty.subtract(commitQty);
		MCNumber trdRate = null;
		if (MCNumber.ZERO.lt(commitQty)) {
			int scale = mcframe.commonMA.meta.MA_META.RATE.scale();
			trdRate = poQty.multiply(100).divide(commitQty, scale, java.math.RoundingMode.DOWN);
		}
		
		r.trd_rate(trdRate);
		if (r.cmpl_flg()) {
			r.trd_unit_diff_qty(null);
		}
		else {
			r.trd_unit_diff_qty(diffQty);
		}

		r.base_unit_diff_qty(convToBaseUnit(r.trd_unit_diff_qty(), r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()));
		
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBBP0080(r)) {
				doBtn_open_MSBDP0080(r);
			}
		}
	}
	
	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			if (Cnd_ope_DEL.isSelected()) {
				if (columnRslt_check == column) {
					if (isNull(r.upd_cntr())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

}