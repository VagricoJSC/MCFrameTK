package mcframe.clientMSBH.MSBHP0020;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
import mcframe.clientMSUC.MSUCP0100.MSUCP_ApUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_PaySchdListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_PaySchdListReg_MC extends MSBHP_PaySchdListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected ArrayList<String[]> _oldAmtCols;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_PaySchdListReg_MC() {
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
	public MSBHP_PaySchdListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0020_Srch01Caller<P extends MSBHP_PaySchdListReg, B extends MS_MSBHL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
			if (Cnd_ope_INS.isSelected()) {
				setValueEx(Cnd_schd_flg, false);
				setValueEx(Cnd_act_flg, false);
			}
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(StsPanel));
			if (!Cnd_ope_INS.isSelected()) {
				msgList.addAll(checkAtLeastOne(AprvPanel));
				msgList.addAll(checkBeforeAfter(Cnd_reg_dt_fr, Cnd_reg_dt_to));
			}
			msgList.addAll(checkBeforeAfter(Cnd_bsppl_cl_dt_fr, Cnd_bsppl_cl_dt_to));
			msgList.addAll(checkAtLeastOne(Cnd_manual_flg, Cnd_pay_spot_flg, Cnd_batch_pay_schd_cl_flg));
		}

		@Override
		protected void show() {
			super.show();
			showSub();
		}
		
		protected void showSub() {
			for (RsltR r : getRsltL()) {
				r.old_bsppl_dpt_cd(r.bsppl_dpt_cd());
				r.old_bsppl_cl_dt(r.bsppl_cl_dt());
				r.tax_amt(nvl(r.tax_amt(), MCNumber.ZERO).subtract(nvl(r.setoff_tax_amt(), MCNumber.ZERO)));
				copyAmtDispToOld(r);
			}
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
	 * 検索時の支払金額関連項目のカラム <br>
	 * String[0] 表示値を保持するカラム <br>
	 * String[1] 検索時の値を保持するカラム
	 */
	protected ArrayList<String[]> getOldAmtCols() {
		if (_oldAmtCols == null) {
			_oldAmtCols = new ArrayList<>();
			_oldAmtCols.add(new String[]{RsltR.$last_pay_schd_amt, RsltR.$old_last_pay_schd_amt});
			_oldAmtCols.add(new String[]{RsltR.$bfw_amt, RsltR.$old_bfw_amt});
			_oldAmtCols.add(new String[]{RsltR.$account_amt, RsltR.$old_account_amt});
			_oldAmtCols.add(new String[]{RsltR.$cash_amt, RsltR.$old_cash_amt});
			_oldAmtCols.add(new String[]{RsltR.$note_amt, RsltR.$old_note_amt});
			_oldAmtCols.add(new String[]{RsltR.$setoff_amt, RsltR.$old_setoff_amt});
			_oldAmtCols.add(new String[]{RsltR.$schd_pay_amt, RsltR.$old_schd_pay_amt});
		}
		return _oldAmtCols;
	}
	
	protected void copyAmtDispToOld(RsltR r) {
		for (String[] cols : getOldAmtCols()) {
			r.setNumber(cols[1], r.getNumber(cols[0]));
		}
	}
	
	protected void copyAmtOldToDisp(RsltR r) {
		for (String[] cols : getOldAmtCols()) {
			r.setNumber(cols[0], r.getNumber(cols[1]));
		}
	}

	protected void clearAmtDisp(RsltR r) {
		for (String[] cols : getOldAmtCols()) {
			r.clear(cols[0]);
		}
	}
	
	/**
	 * [MS_MSBHL0020_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0020_Ins01Caller<P extends MSBHP_PaySchdListReg, B extends MS_MSBHL0020_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBHL0020_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			setupUpParamSub();
		}
		
		@SuppressWarnings("unchecked")
		protected void setupUpParamSub() {
			bridge.up1().clear();
			bridge.up2().clear();
			
			MCList<RsltR> l = getCheckedRows(panel);
			MCIndexKey idxOfApd = getApdL().createIndex(ApdR.$hdr_peg_no);
			MCIndexKey idxOfPayAct = getPayActL().createIndex(PayActR.$hdr_peg_no);
			MCIndexKey idxOfAdvPayAct = getAdvPayActL().createIndex(AdvPayActR.$hdr_peg_no);
			setPayActNotRefFlg(l);
			setAdvPayActRegTgt(l);
			for (RsltR r : l) {
				bridge.up1().addAll(getApdL().subList(idxOfApd, r.hdr_peg_no()));
				if (r.pay_act_not_ref_flg()) {
					bridge.up2().addAll(getPayActL().subList(idxOfPayAct, r.hdr_peg_no()));
				}
				if (r.adv_pay_act_tgt_flg()) {
					bridge.up3().addAll(getAdvPayActL().subList(idxOfAdvPayAct, r.hdr_peg_no()));
				}
			}
		}
		
		protected void setPayActNotRefFlg(MCList<RsltR> l) {
			for (RsltR r : l) {
				r.pay_act_not_ref_flg(true);
			}
		}
		
		protected void setAdvPayActRegTgt(MCList<RsltR> l) {
			l.forEach(r -> r.adv_pay_act_tgt_flg(true));
			l.sort(RsltR.$bsppl_cl_dt);
			for (RsltR r : l) {
				if (!r.adv_pay_act_tgt_flg()) {
					continue;
				}
				for (RsltR r2 : l) {
					if (isSameGrp(r, r2)) {
						r.adv_pay_act_tgt_flg(false);
						continue;
					}
				}
			}
		}
	}

	/**
	 * [MS_MSBHL0020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0020_Del01Caller<P extends MSBHP_PaySchdListReg, B extends MS_MSBHL0020_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBHL0020_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBHL0020_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0020_Prnt01Caller<P extends MSBHP_PaySchdListReg, B extends MS_MSBHL0020_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBHL0020_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBHL0020_Srch01();
	}
	
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBHL0020_Srch01().execDL();;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBHP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBHP0030(r);
	}
	
	protected void doBtn_open_MSBHP0030(RsltR r) {
		if (isNull(r.pay_chk_no())) {
			openPanel("MS", "MSBHP0030", T1, r);
		}
		else {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0030");
			aso.runValueInit();
			aso.putCnd(crtOpenMSBHP0030CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}
	
	protected mcframe.clientMSBH.MSBHP0030.CndR crtOpenMSBHP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBH.MSBHP0030.MSBHP_PaySchdReg p = (mcframe.clientMSBH.MSBHP0030.MSBHP_PaySchdReg) aso.getPanel();
		mcframe.clientMSBH.MSBHP0030.CndR to = mcframe.clientMSBH.MSBHP0030.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.pay_chk_no(r.pay_chk_no());
		
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBDP0190]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0190(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBDP0190(r);
	}
	protected void doBtn_open_MSBDP0190(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0190");
		aso.runValueInit();
		mcframe.clientMSBD.MSBDP0190.CndR cndR = crtOpenMSBDP0190CndR(aso, r);
		aso.putCnd(cndR, crtOpenMSBDP0190ClearCols(aso, r));
		if (!isNullOr(cndR.ac_dt_from(), cndR.ac_dt_to()) || !isNullAnd(cndR.purc_act_no(), cndR.rcpt_iv_no())) {
			aso.putSearchAction();
		}
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0190.CndR crtOpenMSBDP0190CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg p = (mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0190.CndR to = mcframe.clientMSBD.MSBDP0190.CndR.create();

		to.ope(p.Cnd_ope_UPD.getActionCommand());
		to.trd_cur_cd(r.trd_cur_cd());
		if (r.pay_spot_flg()) {
			to.purc_act_no(nullValToNull(r.purc_act_no()));
			to.rcpt_iv_no(nullValToNull(r.rcpt_iv_no()));
		}
		else {
			to.bsppl_cd(r.bsppl_cd());
			to.wrk_no(nullValToNull(r.wrk_no()));
			to.ac_dt_from(r.min_ac_dt());
			to.ac_dt_to(r.max_ac_dt());
		}

		return to;
	}
	protected List<String> crtOpenMSBDP0190ClearCols(MAUCP_AppScreenOpener aso, RsltR r) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBD.MSBDP0190.CndR.$upri_flg);
		return l;
	}
	
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBHL0020_Prnt01();
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
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBHL0020_Ins01();
	}
	
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBHL0020_Del01();
	}
	
	//////////////////////////////////////////////////////////////////////
	
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_bsppl_grp_p_PPanel.setRelateBeans(Cnd_bsppl_grp_p_PPanel);
		Rslt_psppl_grp_p_PPanel.setRelateBeans(Cnd_psppl_grp_p_PPanel);
		
		// 登録日変更時に支払予定管理先部門を維持する
		Rslt_bsppl_usr_dpt_p_PPanel.setRelateBeans(columnRslt_reg_dt, columnRslt_bsppl_cd);
		
		Rslt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_com_paid_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_last_pay_schd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_bfw_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_purc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_purc_ret_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_purc_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_sw_to_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_account_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_cash_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_note_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_setoff_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_setoff_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_sw_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_schd_pay_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_adv_pay_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		
		Rslt_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_base_cur_cd, columnRslt_xrate_cd, columnRslt_reg_dt, true);
		Rslt_pay_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_base_cur_cd, columnRslt_pay_xrate_cd, columnRslt_xrate_base_dt, true);

	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_unchk_flg, true);
		setValueEx(Cnd_aprv_none_flg, true);
		setValueEx(Cnd_manual_flg, true);
		setValueEx(Cnd_pay_spot_flg, true);
		setValueEx(Cnd_not_prnt_flg, true);
		setValueEx(Cnd_prnt_flg, false);
		setValueEx(Btn_prnt_out_flg, true);
		setValueEx(BulkSet_reg_dt, getToday());
	}

	@Override
	public void setSRCH_INSStatus() {
		super.setSRCH_INSStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setBtnMode();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		if (r == null) {
			Btn_open_MSBHP0030.setMode(MCMode.DISABLE);
			Btn_open_MSBDP0190.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBHP0030);
			setDefaultMode(Btn_open_MSBDP0190);
		}
	}
	
	protected boolean isEnableBtn_open_MSBHP0030(RsltR r) {
		return r != null;
	}

	protected boolean isInsStatus() {
		return isSame(getStatus(), INS);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isPrntStatus() {
		return isSame(getStatus(), PRNT);
	}

	protected boolean isRegStatus() {
		return isInsStatus() || isDelStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_INS.isSelected()) {
			setSRCH_INSStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_PRT.isSelected()) {
			setSRCH_PRNTStatus();
		}
		
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_PRT.isSelected()) {
			setPRNTStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
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
			// REF（検索モード）では、クリア確認出さない
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
		clearCnd();
		setSrchStatus();
	}

	protected void clearCnd() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_reg_dt_fr, null);
			setValueEx(Cnd_reg_dt_to, null);
			setValueEx(Cnd_pay_chk_no, null);
			setValueEx(Cnd_unchk_flg, true);
			setValueEx(Cnd_schd_flg, false);
			setValueEx(Cnd_act_flg, false);
			setValueEx(Cnd_aprv_opn_flg, false);
			setValueEx(Cnd_aprv_fix_flg, false);
			setValueEx(Cnd_aprv_acpt_flg, false);
			setValueEx(Cnd_aprv_rjct_flg, false);
			setValueEx(Cnd_aprv_last_rjct_flg, false);
			setValueEx(Cnd_aprv_none_flg, true);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, false);
			setValueEx(Cnd_inc_no_pay_flg, false);
			setValueEx(Cnd_new_flg, false);
			setValueEx(Cnd_batch_pay_schd_cl_flg, false);
			setValueEx(Cnd_pay_schd_d_print_rmrks, null);
			setValueEx(Cnd_intr_rmrks, null);
			setValueEx(Cnd_sub_char1, null);
			setValueEx(Cnd_sub_char2, null);
			setValueEx(Cnd_sub_char3, null);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_unchk_flg, false);
			setValueEx(Cnd_schd_flg, true);
			setValueEx(Cnd_act_flg, true);
			setValueEx(Cnd_aprv_opn_flg, true);
			setValueEx(Cnd_aprv_fix_flg, true);
			setValueEx(Cnd_aprv_acpt_flg, true);
			setValueEx(Cnd_aprv_rjct_flg, true);
			setValueEx(Cnd_aprv_last_rjct_flg, true);
			setValueEx(Cnd_aprv_none_flg, true);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, true);
			setValueEx(Cnd_inc_no_pay_flg, true);
			setValueEx(Cnd_inc_interim_flg, false);
			setValueEx(Cnd_new_flg, true);
			setValueEx(Cnd_batch_pay_schd_cl_flg, true);
		}
		else if (Cnd_ope_PRT.isSelected()) {
			setValueEx(Cnd_unchk_flg, false);
			setValueEx(Cnd_schd_flg, true);
			setValueEx(Cnd_act_flg, true);
			setValueEx(Cnd_aprv_opn_flg, true);
			setValueEx(Cnd_aprv_fix_flg, true);
			setValueEx(Cnd_aprv_acpt_flg, true);
			setValueEx(Cnd_aprv_rjct_flg, true);
			setValueEx(Cnd_aprv_last_rjct_flg, true);
			setValueEx(Cnd_aprv_none_flg, true);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, false);
			setValueEx(Cnd_inc_no_pay_flg, true);
			setValueEx(Cnd_inc_interim_flg, false);
			setValueEx(Cnd_new_flg, false);
			setValueEx(Cnd_batch_pay_schd_cl_flg, true);
		}
		else {
			setValueEx(Cnd_unchk_flg, true);
			setValueEx(Cnd_schd_flg, true);
			setValueEx(Cnd_act_flg, true);
			setValueEx(Cnd_aprv_opn_flg, true);
			setValueEx(Cnd_aprv_fix_flg, true);
			setValueEx(Cnd_aprv_acpt_flg, true);
			setValueEx(Cnd_aprv_rjct_flg, true);
			setValueEx(Cnd_aprv_last_rjct_flg, true);
			setValueEx(Cnd_aprv_none_flg, true);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, false);
			setValueEx(Cnd_inc_no_pay_flg, true);
			setValueEx(Cnd_inc_interim_flg, false);
			setValueEx(Cnd_new_flg, false);
			setValueEx(Cnd_batch_pay_schd_cl_flg, true);
		}
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_bsppl_usr_cd.addLCListener(this);
		BulkSet_bsppl_dpt_cd.addLCListener(this);
		columnRslt_bsppl_dpt_cd.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == BulkSet_bsppl_usr_cd) {
			doBulkSet_bsppl_usr_cd_LC(info);
		}
		else if (lc == BulkSet_bsppl_dpt_cd) {
			doBulkSet_bsppl_dpt_cd_LC(info);
		}
		else if (lc == columnRslt_bsppl_dpt_cd) {
			doRslt_bsppl_dpt_cd_LC(info);
		}
	}
	
	protected void doRslt_bsppl_dpt_cd_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		setAmtDisp(r);
	}
	
	protected void setAmtDisp(RsltR r) {
		MCList<RsltR> grpL = getRsltL().subList(x -> isSameGrp(x, r));
		boolean payActNotRefFlg = true;
		for (RsltR x : grpL) {
			if (!payActNotRefFlg(x)) {
				payActNotRefFlg = false;
				break;
			}
		}
		for (RsltR x : grpL) {
			if (payActNotRefFlg) {
				copyAmtOldToDisp(x);
			}
			else {
				clearAmtDisp(x);
			}
		}
	}
	
	protected boolean payActNotRefFlg(RsltR r) {
		return isSame(r.bsppl_dpt_cd(), r.old_bsppl_dpt_cd()) && isSame(r.bsppl_cl_dt(), r.old_bsppl_cl_dt());
	}
	
	protected boolean isSameGrp(RsltR row1, RsltR row2) {
		if (isColSame(row1, row2, 
				RsltR.$bsppl_cd, RsltR.$purc_act_no,
				RsltR.$rcpt_iv_mng_no, RsltR.$rcpt_iv_no,
				RsltR.$trd_cur_cd,RsltR.$wrk_no
				)) {
			if (isSame(row1.bsppl_dpt_cd(), row2.bsppl_dpt_cd())
					|| isSame(row1.old_bsppl_dpt_cd(), row2.old_bsppl_dpt_cd())
					|| isSame(row1.bsppl_dpt_cd(), row2.old_bsppl_dpt_cd())
					|| isSame(row1.old_bsppl_dpt_cd(), row2.bsppl_dpt_cd())
					) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void doRslt_reg_dt_LC(MCEventInfo info) {
		super.doRslt_reg_dt_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		setXrateBaseDt(r);
	}
	
	@Override
	public void doRslt_bsppl_cl_dt_LC(MCEventInfo info) {
		super.doRslt_bsppl_cl_dt_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		setAmtDisp(r);
		setXrateBaseDt(r);
	}
	
	@Override
	public void doRslt_bsppl_cl_ym_LC(MCEventInfo info) {
		super.doRslt_bsppl_cl_ym_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		setBspplDt(r);
	}
	
	@Override
	public void doRslt_bsppl_cl_day_LC(MCEventInfo info) {
		super.doRslt_bsppl_cl_day_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		setBspplDt(r);
	}
	
	protected void setBspplDt(RsltR r) {
		if (r != null) {
			MCDate dt = MSUCP_ApUtil.getClDt(r.bsppl_cl_ym(), r.bsppl_cl_day());
			setValueEx(columnRslt_bsppl_cl_dt, r.getGUIIndex(), dt);
		}
	}
	
	protected void setXrateBaseDt(RsltR r) {
		// 支払照合為替レートの基準日
		setValueEx(columnRslt_xrate_base_dt, r.getGUIIndex(), nvl(r.bsppl_cl_dt(), r.reg_dt()));
	}
	
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		if (srcRow instanceof RsltR) {
			RsltR r = (RsltR) srcRow;
			if (isNull(r.reg_dt())) {
				bulkSet(BulkSet_reg_dt, r);
			}
			if (isNull(r.bsppl_usr_cd())) {
				bulkSet(BulkSet_bsppl_usr_cd, r);
			}
			if (isNull(r.bsppl_dpt_cd())) {
				bulkSet(BulkSet_bsppl_dpt_cd, r);
			}
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.check()) {
			bulkSet(BulkSet_reg_dt, r);
			bulkSet(BulkSet_bsppl_usr_cd, r);
			bulkSet(BulkSet_bsppl_dpt_cd, r);
		}
	}

	@Override
	public void doBulkSet_reg_dt_LC(MCEventInfo info) {
		super.doBulkSet_reg_dt_LC(info);
		bulkSet(BulkSet_reg_dt);
	}

	protected void doBulkSet_bsppl_usr_cd_LC(MCEventInfo info) {
		bulkSet(BulkSet_bsppl_usr_cd);
	}
	
	protected void doBulkSet_bsppl_dpt_cd_LC(MCEventInfo info) {
		bulkSet(BulkSet_bsppl_dpt_cd);
	}
	
	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	protected void bulkSet(MCBeans b, RsltR r) {
		if (b == BulkSet_reg_dt && isEditable(columnRslt_reg_dt, r.getGUIIndex())) {
			if (!isNull(getBulkSetR().reg_dt())) {
				r.reg_dt(getBulkSetR().reg_dt());
				setXrateBaseDt(r);
			}
		}
		if (b == BulkSet_bsppl_usr_cd && isEditable(columnRslt_bsppl_usr_cd, r.getGUIIndex())) {
			if (!isNull(getBulkSetR().bsppl_usr_cd())) {
				r.bsppl_usr_cd(getBulkSetR().bsppl_usr_cd());
				r.bsppl_usr_nm(getBulkSetR().bsppl_usr_nm());
			}
		}
		if (b == BulkSet_bsppl_dpt_cd && isEditable(columnRslt_bsppl_dpt_cd, r.getGUIIndex())) {
			if (!isNull(getBulkSetR().bsppl_dpt_cd())) {
				r.bsppl_dpt_cd(getBulkSetR().bsppl_dpt_cd());
				r.bsppl_dpt_nm(getBulkSetR().bsppl_dpt_nm());
				r.wg_cd(getBulkSetR().wg_cd());
				r.wg_nm(getBulkSetR().wg_nm());
				setAmtDisp(r);
			}
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBHP0030(r)) {
				doBtn_open_MSBHP0030(r);
			}
		}
	}
	
	@Override
	public MCList getRslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info) {
		setBindRslt_bsppl_dpt_cd(row, info.getEventIndex());
		return super.getRslt_bsppl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
	}
	
	protected void setBindRslt_bsppl_dpt_cd(MCRow row, int eventIndex) {
		if (eventIndex >= 0) {
			RsltR r = getRsltL().get(eventIndex);
			if (!r.pay_spot_flg()) {
				row.setDateNE(DptCols.$i_dt, r.bsppl_cl_dt());
			}
		}
	}
	
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
			if (isRegStatus() || isPrntStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isInsStatus()) {
					if (column == columnRslt_bsppl_cl_ym
						|| column == columnRslt_bsppl_cl_day) {
						if (r.pay_spot_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnRslt_pay_xrate) {
						if (!getCo().pay_xrate_conv_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (isDelStatus()) {
					// 承認引戻
					if (column == columnRslt_aprv_rvrs_flg) {
						if (r.aprv_rvrs_flg() || !r.aprv_can_flg() || 
								!(MAC_APRV_STS_TYP.isFIX(r.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()))) {
							return MCMode.READ_ONLY;
						}
					}
					else {
						// 承認済の場合、承認引戻ＦＬＧをオンにしないと訂正不可
						if (!r.aprv_rvrs_flg() && (MAC_APRV_STS_TYP.isFIX(r.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()))) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}