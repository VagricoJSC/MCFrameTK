package mcframe.clientMGBB.MGBBP0170;

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
import mcframe.clientMAUB.MAUBP5050.*;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_ActSlsSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_ActSlsSrch_MC extends MGBBP_ActSlsSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ActSlsSrch_MC() {
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
	public MGBBP_ActSlsSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0170_Srch01Caller<P extends MGBBP_ActSlsSrch, B extends MG_MGBBL0170_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0170_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
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
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBBL0170_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0200(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0200(r);
	}
	protected void doBtn_open_MGBBP0200(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0200");
		mcframe.clientMGBB.MGBBP0200.CndR to = mcframe.clientMGBB.MGBBP0200.CndR.create();
		mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg p = (mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg) aso
				.getPanel();
		to.tar(p.Cnd_tar_SLS.getActionCommand());
		to.act_id(r.act_sls_id());
		to.act_id_sub(r.act_sls_id_sub());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_trd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		Rslt_expns_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_cur_cd, getBaseCur().cur_cd());
		setValueEx(Cnd_amt_dec_place, getBaseCur().amt_dec_place());

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}

		setValueEx(Cnd_calc_ctg_flg, true);
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_ym_flg, true);
		setValueEx(Cnd_ac_dt_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_lot_flg, true);
		setValueEx(Cnd_sublot_flg, true);
		setValueEx(Cnd_sno1_flg, true);
		setValueEx(Cnd_sno2_flg, true);
		setValueEx(Cnd_sno3_flg, true);
		setValueEx(Cnd_sno4_flg, true);
		setValueEx(Cnd_ac_slip_typ_flg, true);
		setValueEx(Cnd_ac_rsn_flg, true);
		setValueEx(Cnd_asst_typ_flg, true);
		setValueEx(Cnd_cst_flg, true);
		setValueEx(Cnd_dlv_flg, true);
		setValueEx(Cnd_slo_no_flg, true);
		setValueEx(Cnd_iv_no_flg, true);
		setValueEx(Cnd_sls_dpt_flg, true);
		setValueEx(Cnd_sls_usr_flg, true);
		setValueEx(Cnd_stk_bp_flg, true);
		setValueEx(Cnd_alc_dpt_flg, true);
		setValueEx(Cnd_cost_sls1_flg, true);
		setValueEx(Cnd_cost_sls2_flg, true);
		setValueEx(Cnd_cost_sls3_flg, true);
		setValueEx(Cnd_cost_sls4_flg, true);
		setValueEx(Cnd_cost_sls5_flg, true);
		setValueEx(Cnd_trd_cur_flg, true);
		setValueEx(Cnd_xrate_flg, true);
		setValueEx(Cnd_rec_eval_typ_flg, true);

		displayColumn();
	}

	@Override
	protected void listInit() {
		super.listInit();
		getCnd_ac_slip_typ_ListPutter().putBind(AcSlipTypCols.$i_ac_typ_atr, MAC_AC_SLIP_TYP.$IS_SLS_TYP);
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		setBtnMode();
		setFocus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		setBtnMode();
		setFocus();
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
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

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBBP0200, isEnableBtn_open_MGBBP0200(r));
	}

	/**
	 * 費目別原価画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MGBBP0200(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.act_sls_id());
	}
	

	// -----------------------------------------------
	// Event
	
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
			if (isEnableBtn_open_MGBBP0200(r)) {
				doBtn_open_MGBBP0200(r);
			}
		}
	}

	@Override
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd_no_ac_rsn_flg_NC(info);
		if (getCndR().no_ac_rsn_flg()) {
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);
		}
	}
	@Override
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_cd_LC(info);
		if (!isNull(getCndR().ac_rsn_cd())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}
	@Override
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_nm_LC(info);
		if (!isNull(getCndR().ac_rsn_nm())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd_no_iv_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_iv_no_flg_NC(info);
		if (getCndR().no_iv_no_flg()) {
			setValueEx(Cnd_iv_no, null);
		}
	}
	@Override
	public void doCnd_iv_no_LC(MCEventInfo info) {
		super.doCnd_iv_no_LC(info);
		if (!isNull(getCndR().iv_no())) {
			setValueEx(Cnd_no_iv_no_flg, false);
		}
	}

	@Override
	public void doCnd_no_slo_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_slo_no_flg_NC(info);
		if (getCndR().no_slo_no_flg()) {
			setValueEx(Cnd_slo_no, null);
		}
	}
	@Override
	public void doCnd_slo_no_LC(MCEventInfo info) {
		super.doCnd_slo_no_LC(info);
		if (!isNull(getCndR().slo_no())) {
			setValueEx(Cnd_no_slo_no_flg, false);
		}
	}

	@Override
	public void doCnd_no_stk_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_stk_bp_flg_NC(info);
		if (getCndR().no_stk_bp_flg()) {
			setValueEx(Cnd_stk_bp_cd, null);
			setValueEx(Cnd_stk_bp_nm, null);
		}
	}
	@Override
	public void doCnd_stk_bp_cd_LC(MCEventInfo info) {
		super.doCnd_stk_bp_cd_LC(info);
		if (!isNull(getCndR().stk_bp_cd())) {
			setValueEx(Cnd_no_stk_bp_flg, false);
		}
	}
	@Override
	public void doCnd_stk_bp_nm_LC(MCEventInfo info) {
		super.doCnd_stk_bp_nm_LC(info);
		if (!isNull(getCndR().stk_bp_nm())) {
			setValueEx(Cnd_no_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);

		if (!getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}
	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);

		if (getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
		}
	}


	// -----------------------------------------------
	// ListLogic

	@Override
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getAsstTyp(info));
		return super.getCnd_asst_typ(row, info);
	}
	/**
	 * 表示する資産区分を取得する
	 */
	protected MAC_ASST_TYP[] getAsstTyp(MCEventInfo info) {
			return new MAC_ASST_TYP[] { MAC_ASST_TYP.CO_PROD, MAC_ASST_TYP.CO_SLS };
	}

}