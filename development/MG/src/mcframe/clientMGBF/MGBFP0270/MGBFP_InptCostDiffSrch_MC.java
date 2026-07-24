package mcframe.clientMGBF.MGBFP0270;

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
import mcframe.clientMGUB.MGUBP0010.*;

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
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_InptCostDiffSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_InptCostDiffSrch_MC extends MGBFP_InptCostDiffSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	// 合計行の色
	protected Color _ttlColor = getVTtlColor(this);

	// 検索時の検索条件を保持
	protected CndR _cndR = CndR.create();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_InptCostDiffSrch_MC() {
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
	public MGBFP_InptCostDiffSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0270_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0270_Srch01Caller<P extends MGBFP_InptCostDiffSrch, B extends MG_MGBFL0270_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0270_Srch01Caller(P p, B b) {
			super(p, b);
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

		@Override
		protected void afterCall() {
			super.afterCall();

			_cndR = getCndR().clone();
		}

		@Override
		protected void show() {
			super.show();

			setSeqFlg();
		}

		protected void setSeqFlg() {
			getCndR().disp_oper_seq_flg(
					getCndR().oper_act_no_flg() && getCndR().oper_flg());
		}
	}


	/**
	 * Panel[Cnd]のボタン[par_select_all]の押下時の処理
	 */
	@Override
	public void doCnd_par_select_all(MCEventInfo info) {
		setBoolean(Ttl1Panel, true);
	}
	/**
	 * Panel[Cnd]のボタン[par_deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_par_deselect_all(MCEventInfo info) {
		setBoolean(Ttl1Panel, false);
	}
	/**
	 * Panel[Cnd]のボタン[chd_select_all]の押下時の処理
	 */
	@Override
	public void doCnd_chd_select_all(MCEventInfo info) {
		setBoolean(Ttl2Panel, true);
	}
	/**
	 * Panel[Cnd]のボタン[chd_deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_chd_deselect_all(MCEventInfo info) {
		setBoolean(Ttl2Panel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0270_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0090(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();

		if (r == null) {
			dialog(msgNoSelectedRow());

			return;
		}

		doBtn_open_CMN(r, "MGBFP0090");
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0270]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0270(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();

		if (r == null) {
			dialog(msgNoSelectedRow());

			return;
		}

		doBtn_open_CMN(r, "MGBFP0270");
	}

	protected void doBtn_open_CMN(RsltR r, String screenId) {
		if (!isEnableBtn_open(r)) {
			return ;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", screenId);
		mcframe.clientMGBF.MGBFP0090.CndR to = mcframe.clientMGBF.MGBFP0090.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.par_itm_cd(r.par_itm_cd());
		to.par_itm_sub1(r.par_itm_sub1());
		to.par_itm_sub2(r.par_itm_sub2());
		to.par_itm_sub3(r.par_itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.par_itm_typ(r.par_itm_typ());
		to.par_itm_typ_d_cd(r.par_itm_typ_d_cd());
		to.par_itm_jnl_cd(r.par_itm_jnl_cd());
		to.par_itm_grp_cd1(r.par_itm_grp_cd1());
		to.par_itm_grp_cd2(r.par_itm_grp_cd2());
		to.par_itm_grp_cd3(r.par_itm_grp_cd3());
		to.par_itm_grp_cd4(r.par_itm_grp_cd4());
		to.par_itm_grp_cd5(r.par_itm_grp_cd5());
		to.par_itm_grp_cd6(r.par_itm_grp_cd6());
		to.par_itm_grp_cd7(r.par_itm_grp_cd7());
		to.par_itm_grp_cd8(r.par_itm_grp_cd8());
		to.par_itm_grp_cd9(r.par_itm_grp_cd9());
		to.par_itm_grp_cd10(r.par_itm_grp_cd10());
		to.par_lot_no(r.par_lot_no());
		to.par_sublot_no(r.par_sublot_no());
		to.par_sno1(r.par_sno1());
		to.par_sno2(r.par_sno2());
		to.par_sno3(r.par_sno3());
		to.par_sno4(r.par_sno4());
		to.par_asst_typ(r.par_asst_typ());
		to.bp_cd(r.bp_cd());
		to.bp_grp_cd1(r.bp_grp_cd1());
		to.bp_grp_cd2(r.bp_grp_cd2());
		to.bp_grp_cd3(r.bp_grp_cd3());
		to.bp_grp_cd4(r.bp_grp_cd4());
		to.bp_grp_cd5(r.bp_grp_cd5());
		to.bp_grp_cd6(r.bp_grp_cd6());
		to.bp_grp_cd7(r.bp_grp_cd7());
		to.bp_grp_cd8(r.bp_grp_cd8());
		to.bp_grp_cd9(r.bp_grp_cd9());
		to.bp_grp_cd10(r.bp_grp_cd10());
		to.cntry_cd(r.cntry_cd());
		to.area_cd(r.area_cd());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		to.iv_no(r.iv_no());
		to.inpt_dpt_cd(r.inpt_dpt_cd());
		to.inpt_dpt_nm(r.inpt_dpt_nm());
		to.chd_itm_cd(r.chd_itm_cd());
		to.chd_itm_sub1(r.chd_itm_sub1());
		to.chd_itm_sub2(r.chd_itm_sub2());
		to.chd_itm_sub3(r.chd_itm_sub3());
		to.chd_itm_typ(r.chd_itm_typ());
		to.chd_itm_typ_d_cd(r.chd_itm_typ_d_cd());
		to.chd_itm_jnl_cd(r.chd_itm_jnl_cd());
		to.chd_itm_grp_cd1(r.chd_itm_grp_cd1());
		to.chd_itm_grp_cd2(r.chd_itm_grp_cd2());
		to.chd_itm_grp_cd3(r.chd_itm_grp_cd3());
		to.chd_itm_grp_cd4(r.chd_itm_grp_cd4());
		to.chd_itm_grp_cd5(r.chd_itm_grp_cd5());
		to.chd_itm_grp_cd6(r.chd_itm_grp_cd6());
		to.chd_itm_grp_cd7(r.chd_itm_grp_cd7());
		to.chd_itm_grp_cd8(r.chd_itm_grp_cd8());
		to.chd_itm_grp_cd9(r.chd_itm_grp_cd9());
		to.chd_itm_grp_cd10(r.chd_itm_grp_cd10());
		to.chd_lot_no(r.chd_lot_no());
		to.chd_sublot_no(r.chd_sublot_no());
		to.chd_sno1(r.chd_sno1());
		to.chd_sno2(r.chd_sno2());
		to.chd_sno3(r.chd_sno3());
		to.chd_sno4(r.chd_sno4());
		to.chd_asst_typ(r.chd_asst_typ());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.oper_act_no(r.oper_act_no());
		to.oper_cd(r.oper_cd());
		to.ac_slip_typ(r.ac_slip_typ());
		to.ac_rsn_cd(r.ac_rsn_cd());

		if (isNull(r.ac_rsn_cd()) && _cndR.ac_rsn_flg()) {
			to.no_ac_rsn_flg(true);
		}

		if (isNull(r.bp_cd()) && _cndR.bp_flg()) {
			to.no_bp_flg(true);
		}

		if (isNull(r.po_no()) && _cndR.po_no_flg()) {
			to.no_po_no_flg(true);
		}

		if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
			to.no_slo_no_flg(true);
		}

		if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
			to.no_iv_no_flg(true);
		}

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);

		if (dc == RsltTable) {
			doRslt_DC(info);
		}
	}

	public void doRslt_DC(MCEventInfo info) {
		doBtn_open_MGBFP0090(info);
	}

	// ------------------------------------------------
	// イベント
	// ------------------------------------------------

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		setBtnMode();
	}

	@Override
	public void doCnd_loc_cd_NC(MCEventInfo info) {
		super.doCnd_loc_cd_NC(info);

		if (isNull(getCndR().loc_cd())) {
			setValueEx(Cnd_str_ln_cd, null);
			setValueEx(Cnd_str_ln_nm, null);
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);

		if (!getCndR().loc_flg()) {
			setValueEx(Cnd_str_ln_flg, false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);

		if (getCndR().str_ln_flg()) {
			setValueEx(Cnd_loc_flg, true);
		}
	}

	@Override
	public void doCnd_itm_mfg_inst_no_flg_NC(MCEventInfo info) {
		super.doCnd_itm_mfg_inst_no_flg_NC(info);

		if (getCndR().itm_mfg_inst_no_flg()) {
			setValueEx(Cnd_par_itm_flg, true);
		}
	}

	@Override
	public void doCnd_mfg_act_no_flg_NC(MCEventInfo info) {
		super.doCnd_mfg_act_no_flg_NC(info);

		if (getCndR().mfg_act_no_flg()) {
			setValueEx(Cnd_par_itm_flg, true);
		}
	}

	@Override
	public void doCnd_par_itm_flg_NC(MCEventInfo info) {
		super.doCnd_par_itm_flg_NC(info);

		if (!getCndR().par_itm_flg()) {
			setValueEx(Cnd_itm_mfg_inst_no_flg, false);
			setValueEx(Cnd_mfg_act_no_flg, false);
		}
	}

	@Override
	public void doCnd_par_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_par_itm_typ_flg_NC(info);

		if (!getCndR().par_itm_typ_flg()) {
			setValueEx(Cnd_par_itm_typ_d_flg, false);
		}
	}

	@Override
	public void doCnd_par_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_par_itm_typ_d_flg_NC(info);

		if (getCndR().par_itm_typ_d_flg()) {
			setValueEx(Cnd_par_itm_typ_flg, true);
		}
	}

	@Override
	public void doCnd_chd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_chd_itm_typ_flg_NC(info);

		if (!getCndR().chd_itm_typ_flg()) {
			setValueEx(Cnd_chd_itm_typ_d_flg, false);
		}
	}

	@Override
	public void doCnd_chd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_chd_itm_typ_d_flg_NC(info);

		if (getCndR().chd_itm_typ_d_flg()) {
			setValueEx(Cnd_chd_itm_typ_flg, true);
		}
	}

	@Override
	public void doCnd_comp_qty_flg_NC(MCEventInfo info) {
		super.doCnd_comp_qty_flg_NC(info);

		if (!getCndR().comp_qty_flg()) {
			setValueEx(Cnd_odr_qty_flg, false);
		}
	}

	@Override
	public void doCnd_odr_qty_flg_NC(MCEventInfo info) {
		super.doCnd_odr_qty_flg_NC(info);

		if (getCndR().odr_qty_flg()) {
			setValueEx(Cnd_comp_qty_flg, true);
		}
	}

	@Override
	public void doCnd_chd_asst_typ_LC(MCEventInfo info) {
		if (!isNull(getCndR().chd_asst_typ())) {
			setValueEx(Cnd_except_other_flg, false);
		}
	}

	@Override
	public void doCnd_except_other_flg_NC(MCEventInfo info) {
		super.doCnd_except_other_flg_NC(info);

		if (getCndR().except_other_flg()) {
			setValueEx(Cnd_chd_asst_typ, null);
		}
	}

	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		if (!isNull(getCndR().bp_cd())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
		super.doCnd_bp_nm_LC(info);

		if (!isNull(getCndR().bp_nm())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);

		if (getCndR().no_bp_flg()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}

	@Override
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info) {
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
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd_no_ac_rsn_flg_NC(info);

		if (getCndR().no_ac_rsn_flg()) {
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);
		}
	}

	@Override
	public void doCnd_po_no_LC(MCEventInfo info) {
		if (!isNull(getCndR().po_no())) {
			setValueEx(Cnd_no_po_no_flg, false);
		}
	}

	@Override
	public void doCnd_no_po_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_po_no_flg_NC(info);

		if (getCndR().no_po_no_flg()) {
			setValueEx(Cnd_po_no, null);
		}
	}

	@Override
	public void doCnd_slo_no_LC(MCEventInfo info) {
		if (!isNull(getCndR().slo_no())) {
			setValueEx(Cnd_no_slo_no_flg, false);
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
	public void doCnd_iv_no_LC(MCEventInfo info) {
		if (!isNull(getCndR().iv_no())) {
			setValueEx(Cnd_no_iv_no_flg, false);
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
	public void doLPnl_disp_expns_NC(MCEventInfo info) {
		super.doLPnl_disp_expns_NC(info);

		displayColumn();
	}

	@Override
	public void doLPnl_disp_expns_grp_NC(MCEventInfo info) {
		super.doLPnl_disp_expns_grp_NC(info);

		displayColumn();
	}

	@Override
	public void doLPnl_disp_diff_NC(MCEventInfo info) {
		super.doLPnl_disp_diff_NC(info);

		displayColumn();
	}

	// ------------------------------------------------
	// ステータスの設定
	// ------------------------------------------------

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
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		displayColumn();
		setBtnMode();
		RsltTable.selectLeftmostColumn(0);
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		doDispStdCng();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		setBtnModeByFlg(Btn_open_MGBFP0090, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0270, isEnableBtn_open(r));
	}

	protected boolean isEnableBtn_open(RsltR r) {
		if (r == null) {
			return false;
		}

		return getRsltL().size() - 1 != r.getGUIIndex();
	}

	protected void doDispStdCng() {
		setColModeByFlg(columnRslt_upri_diff, _cndR.chd_itm_flg());
		setColModeByFlg(columnRslt_std_upri, _cndR.chd_itm_flg());
		setColModeByFlg(columnRslt_act_upri, _cndR.chd_itm_flg());
		setColModeByFlg(columnRslt_ttl, LPnl_disp_diff_TTL.isSelected());
		setColModeByFlg(columnRslt_var_cost, LPnl_disp_diff_TTL.isSelected());
		setColModeByFlg(columnRslt_fxd_cost, LPnl_disp_diff_TTL.isSelected());
		setColModeByFlg(columnRslt_ttl_qty, LPnl_disp_diff_QTY.isSelected());
		setColModeByFlg(columnRslt_var_cost_qty, LPnl_disp_diff_QTY.isSelected());
		setColModeByFlg(columnRslt_fxd_cost_qty, LPnl_disp_diff_QTY.isSelected());
		setColModeByFlg(columnRslt_ttl_up, LPnl_disp_diff_PRICE.isSelected());
		setColModeByFlg(columnRslt_var_cost_up, LPnl_disp_diff_PRICE.isSelected());
		setColModeByFlg(columnRslt_fxd_cost_up, LPnl_disp_diff_PRICE.isSelected());

		if (_cc.getExpns() == null) {
			return ;
		}

		int expnsIdx = 0, expnsGIdx = 0;
		String expnsGCd = null;
		MCColumnConfig[] expnsGL = _cc.getExpnsGColumnConfigs(RsltTable);
		MCColumnConfig[] expnsL = _cc.getExpnsColumnConfigs(RsltTable);
		for (ExpnsR r : _cc.getExpns()) {
			if (getLPnlR().disp_expns_grp()) {
				if (!isSame(expnsGCd, r.expns_grp_cd())) {
					expnsGCd = r.expns_grp_cd();
	
					setColModeByFlg(expnsGL[expnsGIdx++], LPnl_disp_diff_TTL.isSelected());
					setColModeByFlg(expnsGL[expnsGIdx++], LPnl_disp_diff_QTY.isSelected());
					setColModeByFlg(expnsGL[expnsGIdx++], LPnl_disp_diff_PRICE.isSelected());
				}
			}
			if (getLPnlR().disp_expns()) {
				setColModeByFlg(expnsL[expnsIdx++], LPnl_disp_diff_TTL.isSelected());
				setColModeByFlg(expnsL[expnsIdx++], LPnl_disp_diff_QTY.isSelected());
				setColModeByFlg(expnsL[expnsIdx++], LPnl_disp_diff_PRICE.isSelected());
			}
		}
	}

	// ------------------------------------------------
	// 値の設定
	// ------------------------------------------------

	@Override
	protected void valueInit() {
		super.valueInit();

		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_par_itm_flg, true);
		setValueEx(Cnd_par_itm_typ_flg, true);
		setValueEx(Cnd_par_itm_typ_d_flg, true);
		setValueEx(Cnd_par_itm_jnl_flg, true);
		setValueEx(Cnd_chd_itm_flg, true);
		setValueEx(Cnd_chd_itm_typ_flg, true);
		setValueEx(Cnd_chd_itm_typ_d_flg, true);
		setValueEx(Cnd_chd_itm_jnl_flg, true);
		setValueEx(Cnd_chd_asst_typ_flg, true);
		setValueEx(Cnd_ac_slip_typ_flg, true);
		setValueEx(Cnd_ac_rsn_flg, true);
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);

		displayColumn();
	}

	// ------------------------------------------------
	// 画面の初期化
	// ------------------------------------------------

	@Override
	public void mcInitStatus() {
		super.mcInitStatus();

		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_cc.init(this, RsltTable);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp, 3);

		int expnsIdx = 0, expnsGIdx = 0;
		String expnsGCd = null;
		for (ExpnsR r : _cc.getExpns()) {
			if (!isSame(expnsGCd, r.expns_grp_cd())) {
				expnsGCd = r.expns_grp_cd();
				for(int i=0; i<3; i++) {
					MCColumnConfig cc = _cc.getExpnsGColumnConfigs(RsltTable)[expnsGIdx++];
					cc.setHeaderName(r.expns_grp_nm());
					cc.setHeaderMessage(r.expns_grp_nm());
				}
			}
			for(int i=0; i<3; i++) {
				MCColumnConfig cc = _cc.getExpnsColumnConfigs(RsltTable)[expnsIdx++];
				cc.setHeaderName(r.expns_nm());
				cc.setHeaderMessage(r.expns_nm());
			}
		}

		// MGUCP_CCtrlでセットしているリスナーを削除する（費目系表示のイベントはこちら側でセットする）
		for (MCNCListener l : LPnl_disp_expns.getNCListeners()) {
			if (l != this) {
				LPnl_disp_expns.removeNCListener(l);
			}
		}
		for (MCNCListener l : LPnl_disp_expns_grp.getNCListeners()) {
			if (l != this) {
				LPnl_disp_expns_grp.removeNCListener(l);
			}
		}
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);

		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())) {
				retL.add(r);
			}
		}

		return retL;
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		Color rslt = getExpnsSrchRsltColor(this);

		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			cc.putColumnBG(c, rslt);
		}

		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
		cc.putColumnBG(columnRslt_qty_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_upri_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_cost_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_qty, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_up, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_qty, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_std_cost, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_fxd_cost, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_fxd_cost_qty, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_fxd_cost_up, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_var_cost, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_var_cost_qty, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_var_cost_up, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_ttl_qty, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_ttl_up, getAllTtlColor(this));
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Rslt_comp_qty_p_PPanel.setRelateBeans(columnRslt_par_unit_cd, columnRslt_par_dec_place);
		Rslt_odr_qty_p_PPanel.setRelateBeans(columnRslt_par_unit_cd, columnRslt_par_dec_place);
		Rslt_qty_diff_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_std_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_act_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// ------------------------------------------------
	// セルコンフィグ
	// ------------------------------------------------

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
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (getRsltL().size() == index + 1) {
				return _ttlColor;
			}

			return super.getPriorBG(index, column, table, mode);
		}
	}

}