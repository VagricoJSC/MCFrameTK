package mcframe.clientMSBH.MSBHP0110;

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
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5190.*;
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
import mcframe.clientMSUC.MSUCP0050.MSUCP_ClUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_MlyApBalSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_MlyApBalSrch_MC extends MSBHP_MlyApBalSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	MCDate _apClYm = MSUCP_ClUtil.getApClYm(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_MlyApBalSrch_MC() {
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
	public MSBHP_MlyApBalSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MSBHP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0120(MCEventInfo info) {
		openMSBHP0120(info);
	}
	
	/**
	 * 買掛元帳照会画面へ遷移します
	 * @param info
	 */
	protected void openMSBHP0120(MCEventInfo info) {
		RsltR rsltR = RsltTable.getSelectedMCRow();
		if (isNull(rsltR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0120");
		aso.putCnd(crtOpenMSBHP0120CndR(aso, rsltR));
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先（買掛元帳照会画面）の検索条件設定を行います。
	 * @param info
	 */
	protected mcframe.clientMSBH.MSBHP0120.CndR crtOpenMSBHP0120CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBH.MSBHP0120.MSBHP_ApLedgerSrch p = (mcframe.clientMSBH.MSBHP0120.MSBHP_ApLedgerSrch) aso.getPanel();
		mcframe.clientMSBH.MSBHP0120.CndR to = mcframe.clientMSBH.MSBHP0120.CndR.create();
		
		to.ac_ym(r.ac_ym());
		to.ap_dpt_cd(r.ap_dpt_cd());
		to.ap_dpt_nm(r.ap_dpt_nm());
		to.wg_cd(r.wg_cd());
		to.asppl_cd(r.asppl_cd());
		to.rcpt_iv_no(r.rcpt_iv_no());
		to.rcpt_iv_mng_no(r.rcpt_iv_mng_no());
		to.purc_act_no(r.purc_act_no());
		to.wrk_no(r.wrk_no());
		to.ap_typ(r.ap_typ());
		
		if (getCndR().trd_cur_flg()) {
			to.trd_cur_cd(r.trd_cur_cd());
			to.ope(p.Cnd_ope_TRD.getActionCommand());
			to.trd_cur_cd(r.trd_cur_cd());
		}
		else {
			to.ope(p.Cnd_ope_BASE.getActionCommand());
		}
		return to;
	}
	
	/**
	 * [MS_MSBHL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0110_Srch01Caller<P extends MSBHP_MlyApBalSrch, B extends MS_MSBHL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(ApPanel));
			msgList.addAll(checkBeforeAfter(Cnd_ac_ym_fr, Cnd_ac_ym_to));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(Cnd2Panel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(Cnd2Panel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBHL0110_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBHL0110_Srch01().execDL();
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_init_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_purc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ret_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_sw_to_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_cash_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_note_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_account_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_setoff_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_sw_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_end_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		
		Rslt_base_cur_init_bal_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_purc_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_ret_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_sw_to_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_cash_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_note_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_account_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_setoff_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_sw_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_end_bal_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		
		Rslt_exc_gain_loss_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_total_exc_gain_loss_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		
		Rslt_asppl_grp_p_PPanel.setRelateBeans(Cnd_asppl_grp_p_PPanel);
	}
	@Override
	protected void valueInit() {
		super.valueInit();
		cndRInit();
		dispRInit();
		setStatusColumn();
	}
	
	protected void setStatusColumn() {
		RsltTable.setStatusColumnVisible(false);
	}
	
	/**
	 * 債務区分、計上年月の初期値を設定します。
	 */
	protected void cndRInit() {
		setValueEx(Cnd_ap_typ_ap, true);
		setValueEx(Cnd_ap_typ_ac, true);
		if (!isNull(_apClYm)) {
			setValueEx(Cnd_ac_ym_fr, MSUCP_ClUtil.getApClYm(getRootPanel()).addMonth(-1));
			setValueEx(Cnd_ac_ym_to, MSUCP_ClUtil.getApClYm(getRootPanel()).addMonth(1));
		}
	}
	
	/**
	 * 集計単位の初期値を設定します。
	 */
	protected void dispRInit() {
		setBoolean(Cnd2Panel, true);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		changeDispMode();
		
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	/**
	 * 集計単位の選択に応じてグループキーのモード制御を行う
	 * 
	 */
	protected void changeDispMode() {
		// 債務部門別集計フラグ
		if (getCndR().ap_dpt_flg()) {
			setDefaultMode(columnRslt_ap_dpt_cd);
			setDefaultMode(columnRslt_ap_dpt_nm);
		}
		else {
			columnRslt_ap_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_ap_dpt_nm.setMode(MCMode.INVISIBLE);
		}
		
		// ＷＧ別集計フラグ
		if (getCndR().wg_flg()) {
			setDefaultMode(columnRslt_wg_cd);
			setDefaultMode(columnRslt_wg_nm);
		}
		else {
			columnRslt_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_wg_nm.setMode(MCMode.INVISIBLE);
		}
		
		// 買掛先別集計フラグ
		if (getCndR().asppl_flg()) {
			setDefaultMode(columnRslt_asppl_cd);
			setDefaultMode(columnRslt_asppl_nm);
		}
		else {
			columnRslt_asppl_cd.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_nm.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd1.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm1.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd2.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm2.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd3.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm3.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd4.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm4.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd5.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm5.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd6.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm6.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd7.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm7.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd8.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm8.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd9.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm9.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_cd10.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_grp_nm10.setMode(MCMode.INVISIBLE);
		}
		
		// 仕入実績ＮＯ別集計フラグ
		if (getCndR().purc_act_no_flg()) {
			setDefaultMode(columnRslt_purc_act_no);
		}
		else {
			columnRslt_purc_act_no.setMode(MCMode.INVISIBLE);
		}
		
		// 受領インボイスＮＯ別集計フラグ
		if (getCndR().rcpt_iv_no_flg()) {
			setDefaultMode(columnRslt_rcpt_iv_no);
		}
		else {
			columnRslt_rcpt_iv_no.setMode(MCMode.INVISIBLE);
		}
		
		// 受領インボイス管理ＮＯ別集計フラグ
		if (getCndR().rcpt_iv_mng_no_flg()) {
			setDefaultMode(columnRslt_rcpt_iv_mng_no);
		}
		else {
			columnRslt_rcpt_iv_mng_no.setMode(MCMode.INVISIBLE);
		}
		
		// 通貨別集計フラグ
		if (getCndR().trd_cur_flg()) {
			setDefaultMode(columnRslt_trd_cur_cd);
			setDefaultMode(columnRslt_trd_cur_nm);
			setDefaultMode(columnRslt_init_bal);
			setDefaultMode(columnRslt_purc_amt);
			setDefaultMode(columnRslt_ret_amt);
			setDefaultMode(columnRslt_dscnt_amt);
			setDefaultMode(columnRslt_sw_to_amt);
			setDefaultMode(columnRslt_tax_amt);
			setDefaultMode(columnRslt_cash_amt);
			setDefaultMode(columnRslt_note_amt);
			setDefaultMode(columnRslt_account_amt);
			setDefaultMode(columnRslt_setoff_amt);
			setDefaultMode(columnRslt_sw_amt);
			setDefaultMode(columnRslt_end_bal);
		}
		else {
			columnRslt_trd_cur_cd.setMode(MCMode.INVISIBLE);
			columnRslt_trd_cur_nm.setMode(MCMode.INVISIBLE);
			columnRslt_init_bal.setMode(MCMode.INVISIBLE);
			columnRslt_purc_amt.setMode(MCMode.INVISIBLE);
			columnRslt_ret_amt.setMode(MCMode.INVISIBLE);
			columnRslt_dscnt_amt.setMode(MCMode.INVISIBLE);
			columnRslt_sw_to_amt.setMode(MCMode.INVISIBLE);
			columnRslt_tax_amt.setMode(MCMode.INVISIBLE);
			columnRslt_cash_amt.setMode(MCMode.INVISIBLE);
			columnRslt_note_amt.setMode(MCMode.INVISIBLE);
			columnRslt_account_amt.setMode(MCMode.INVISIBLE);
			columnRslt_setoff_amt.setMode(MCMode.INVISIBLE);
			columnRslt_sw_amt.setMode(MCMode.INVISIBLE);
			columnRslt_end_bal.setMode(MCMode.INVISIBLE);
		}
		
		// 案件別集計フラグ
		if (getCndR().wrk_no_flg()) {
			setDefaultMode(columnRslt_wrk_no);
			setDefaultMode(columnRslt_wrk_nm);
		}
		else {
			columnRslt_wrk_no.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_nm.setMode(MCMode.INVISIBLE);
		}

		// 債務区分別集計フラグ
		if (getCndR().ap_typ_flg()) {
			setDefaultMode(columnRslt_ap_typ);
			setDefaultMode(columnRslt_ap_typ_nm);
		}
		else {
			columnRslt_ap_typ.setMode(MCMode.INVISIBLE);
			columnRslt_ap_typ_nm.setMode(MCMode.INVISIBLE);
		}
		changeDispExctrlCols();
	}
	
	protected void changeDispExctrlCols() {
		//ひとつでも集計されたら制御用カラムは非表示
		if (getCndR().ap_dpt_flg()
				&& getCndR().wg_flg()
				&& getCndR().asppl_flg()
				&& getCndR().purc_act_no_flg()
				&& getCndR().rcpt_iv_no_flg()
				&& getCndR().rcpt_iv_mng_no_flg()
				&& getCndR().trd_cur_flg()
				&& getCndR().wrk_no_flg()
				&& getCndR().ap_typ_flg()
				) {
			columnRslt_ins_usr_id.setMode(getDefaultMode(columnRslt_ins_usr_id));
			columnRslt_ins_usr_nm.setMode(getDefaultMode(columnRslt_ins_usr_nm));
			columnRslt_ins_func_id.setMode(getDefaultMode(columnRslt_ins_func_id));
			columnRslt_ins_func_nm.setMode(getDefaultMode(columnRslt_ins_func_nm));
			columnRslt_ins_ts.setMode(getDefaultMode(columnRslt_ins_ts));
			columnRslt_upd_usr_id.setMode(getDefaultMode(columnRslt_upd_usr_id));
			columnRslt_upd_usr_nm.setMode(getDefaultMode(columnRslt_upd_usr_nm));
			columnRslt_upd_func_id.setMode(getDefaultMode(columnRslt_upd_func_id));
			columnRslt_upd_func_nm.setMode(getDefaultMode(columnRslt_upd_func_nm));
			columnRslt_upd_ts.setMode(getDefaultMode(columnRslt_upd_ts));
			columnRslt_upd_srv_req_no.setMode(getDefaultMode(columnRslt_upd_srv_req_no));
		}
		else {
			columnRslt_ins_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_srv_req_no.setMode(MCMode.INVISIBLE);
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r == null) {
				return;
			}
			openMSBHP0120(info);
		}
	}

}