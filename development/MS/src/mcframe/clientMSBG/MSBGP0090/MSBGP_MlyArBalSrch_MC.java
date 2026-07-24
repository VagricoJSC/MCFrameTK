package mcframe.clientMSBG.MSBGP0090;

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
 * 画面"MSBGP_MlyArBalSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_MlyArBalSrch_MC extends MSBGP_MlyArBalSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	MCDate _arClYm = MSUCP_ClUtil.getArClYm(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_MlyArBalSrch_MC() {
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
	public MSBGP_MlyArBalSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0090_Srch01Caller<P extends MSBGP_MlyArBalSrch, B extends MS_MSBGL0090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0090_Srch01Caller(P p, B b) {
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
		callMS_MSBGL0090_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBGL0090_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0100(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		doBtn_open_MSBGP0100(r);
	}		

	protected void doBtn_open_MSBGP0100(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0100");	
		aso.putCnd(crtOpenMSBGP0100CndR(aso, r));
		aso.putSearchAction();
		aso.show();	
	}
	
	/**
	 * 遷移先[MSBGP0100]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0100.CndR crtOpenMSBGP0100CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0100.MSBGP_ArLedgerSrch p = (mcframe.clientMSBG.MSBGP0100.MSBGP_ArLedgerSrch) aso.getPanel();
		mcframe.clientMSBG.MSBGP0100.CndR to = mcframe.clientMSBG.MSBGP0100.CndR.create();
		
		if (isNull(r.trd_cur_cd())) {
			to.ope((p.Cnd_ope_BASE.getActionCommand()));
		}
		to.ac_ym(r.ac_ym());
		to.acst_cd(r.acst_cd());
		to.ar_dpt_cd(r.ar_dpt_cd());
		to.ar_dpt_nm(r.ar_dpt_nm());
		to.trd_cur_cd(r.trd_cur_cd());
		to.iv_no(r.iv_no());
		to.wrk_no(r.wrk_no());
		if (isNull(r.wrk_no())) {
			to.wrk_null_flg(true);
		}
		to.wg_cd(r.wg_cd());
		to.ar_typ(r.ar_typ());
		return to;
	}

	// --------------------画面初期値設定start--------------------	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_init_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_bef_cl_sls_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_aft_cl_sls_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_end_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_not_appl_note_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_mly_not_appl_note_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_cash_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_note_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_xfr_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_setoff_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_sw_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		
		Rslt_base_cur_init_bal_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_bef_cl_sls_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_aft_cl_sls_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_end_bal_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_not_appl_note_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_mly_not_appl_note_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_cash_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_note_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_xfr_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_setoff_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_sw_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_exc_gain_loss_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_total_exc_gain_loss_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		
		Rslt_acst_grp_p_PPanel.setRelateBeans(Cnd_acst_grp_p_PPanel);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		if (!isNull(_arClYm)) {
			setValueEx(Cnd_ac_ym_fr, MSUCP_ClUtil.getArClYm(getRootPanel()).addMonth(-1));
			setValueEx(Cnd_ac_ym_to, MSUCP_ClUtil.getArClYm(getRootPanel()).addMonth(1));
		}
		
		setBoolean(Cnd2Panel, true);
	}
	// --------------------画面初期値設定end----------------------
	// --------------------画面ステータス処理start------------------------
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		changeDispMode();
		dispNotApplNote();
		
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
		
		// 債権部門別集計フラグ
		if (getCndR().ar_dpt_flg()) {
			setDefaultMode(columnRslt_ar_dpt_cd);
			setDefaultMode(columnRslt_ar_dpt_nm);
		}
		else {
			columnRslt_ar_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_ar_dpt_nm.setMode(MCMode.INVISIBLE);
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
		
		// 売掛先別集計フラグ
		if (getCndR().acst_flg()) {
			setDefaultMode(columnRslt_acst_cd);
			setDefaultMode(columnRslt_acst_nm);
			setDefaultMode(columnRslt_cl_day); // 締日は売掛先の属性とする
		}
		else {
			columnRslt_acst_cd.setMode(MCMode.INVISIBLE);
			columnRslt_acst_nm.setMode(MCMode.INVISIBLE);
			columnRslt_cl_day.setMode(MCMode.INVISIBLE);
		}

		// インボイスＮＯ別集計フラグ
		if (getCndR().iv_no_flg()) {
			setDefaultMode(columnRslt_iv_no);
		}
		else {
			columnRslt_iv_no.setMode(MCMode.INVISIBLE);
		}
		
		// 通貨別集計フラグ
		if (getCndR().trd_cur_flg()) {
			setDefaultMode(columnRslt_trd_cur_cd);
			setDefaultMode(columnRslt_trd_cur_nm);
			setDefaultMode(columnRslt_init_bal);
			setDefaultMode(columnRslt_amt);
			setDefaultMode(columnRslt_bef_cl_sls_amt);
			setDefaultMode(columnRslt_aft_cl_sls_amt);
			setDefaultMode(columnRslt_end_bal);
			setDefaultMode(columnRslt_not_appl_note);
			setDefaultMode(columnRslt_mly_not_appl_note);
			setDefaultMode(columnRslt_cash_amt);
			setDefaultMode(columnRslt_note_amt);
			setDefaultMode(columnRslt_xfr_amt);
			setDefaultMode(columnRslt_setoff_amt);
			setDefaultMode(columnRslt_sw_amt);
		}
		else {
			columnRslt_trd_cur_cd.setMode(MCMode.INVISIBLE);
			columnRslt_trd_cur_nm.setMode(MCMode.INVISIBLE);
			columnRslt_init_bal.setMode(MCMode.INVISIBLE);
			columnRslt_amt.setMode(MCMode.INVISIBLE);
			columnRslt_bef_cl_sls_amt.setMode(MCMode.INVISIBLE);
			columnRslt_aft_cl_sls_amt.setMode(MCMode.INVISIBLE);
			columnRslt_end_bal.setMode(MCMode.INVISIBLE);
			columnRslt_not_appl_note.setMode(MCMode.INVISIBLE);
			columnRslt_mly_not_appl_note.setMode(MCMode.INVISIBLE);
			columnRslt_cash_amt.setMode(MCMode.INVISIBLE);
			columnRslt_note_amt.setMode(MCMode.INVISIBLE);
			columnRslt_xfr_amt.setMode(MCMode.INVISIBLE);
			columnRslt_setoff_amt.setMode(MCMode.INVISIBLE);
			columnRslt_sw_amt.setMode(MCMode.INVISIBLE);
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

		// 債権区分別集計フラグ
		if (getCndR().ar_typ_flg()) {
			setDefaultMode(columnRslt_ar_typ);
			setDefaultMode(columnRslt_ar_typ_nm);
		}
		else {
			columnRslt_ar_typ.setMode(MCMode.INVISIBLE);
			columnRslt_ar_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}
	
	/**
	 * 取引未決済手形のモード処理
	 */
	protected void dispNotApplNote() {
		MCDate thisMon = _arClYm.addMonth(1);
		if (getCndR().ac_ym_fr().lte(thisMon) && thisMon.lte(getCndR().ac_ym_to())) {
			setDefaultMode(columnRslt_not_appl_note);
		}
		else {
			columnRslt_not_appl_note.setMode(MCMode.INVISIBLE);
		}
	}
	// --------------------画面ステータス処理end--------------------------
	// --------------------画面イベント処理start--------------------------
	@Override			
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {			
		super.doDCEvent(compo, info);		
		if (compo == RsltTable) {		
			RsltR r = getRsltL().get(info.getEventIndex());	
			if (r == null) {	
				return;
			}	
			doBtn_open_MSBGP0100(r);
		}		
	}	
	// --------------------画面イベント処理end--------------------------

}