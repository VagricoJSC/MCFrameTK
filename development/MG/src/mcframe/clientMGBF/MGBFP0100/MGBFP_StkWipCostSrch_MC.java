package mcframe.clientMGBF.MGBFP0100;

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
 * 画面"MGBFP_StkWipCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_StkWipCostSrch_MC extends MGBFP_StkWipCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	/** 合計行 */
	protected RsltR _sumRow = null;
	/** 合計行の色 */
	protected Color _ttlColor = getVTtlColor(this);
	/** 合計行の表示状態 */
	protected boolean _isSumDisplayed = false;
	/** 集計対象のカラム名 */
	protected String[] _sumColNames = null;
	/** 検索時の検索条件 */
	protected CndR _cndR = CndR.create();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_StkWipCostSrch_MC() {
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
	public MGBFP_StkWipCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0100_Srch01Caller<P extends MGBFP_StkWipCostSrch, B extends MG_MGBFL0100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0100_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_st_stk_flg, Cnd_st_wip_flg,
					Cnd_end_stk_flg, Cnd_end_wip_flg, Cnd_adj_flg));
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

			// カラム表示に使用するため保持
			_cndR = getCndR().clone();

			for (RsltR row : bridge.down0()) {
				calcUnitElm(row);
				row.diff_upri2(row.diff_upri());
				row.std_upri2(row.std_upri());
				row.act_upri2(row.act_upri());
			}
		}

		/**
		 * 費目と費目Ｇの単価を計算する
		 */
		protected void calcUnitElm(RsltR row) {
			_cc.calcUnit(row, row.qty(), false);
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();

			// 合計行を保持
			_sumRow = getRsltL().get(getRsltL().size() - 1);

			_isSumDisplayed = true;
			displaySumRow(getLPnlR().disp_sum_row() && !getLPnlR().disp_upri());
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
		callMG_MGBFL0100_Srch01();
	}

	// ------------------------------------------------
	// イベント
	// ------------------------------------------------
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
			setValueEx(Cnd_itm_flg, true);
		}
	}

	@Override
	public void doCnd_mfg_act_no_flg_NC(MCEventInfo info) {
		super.doCnd_mfg_act_no_flg_NC(info);
		if (getCndR().mfg_act_no_flg()) {
			setValueEx(Cnd_itm_flg, true);
		}
	}

	@Override
	public void doCnd_itm_flg_NC(MCEventInfo info) {
		super.doCnd_itm_flg_NC(info);
		if (!getCndR().itm_flg()) {
			setValueEx(Cnd_itm_mfg_inst_no_flg, false);
			setValueEx(Cnd_mfg_act_no_flg, false);
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

	@Override
	public void doCnd_qty_flg_NC(MCEventInfo info) {
		super.doCnd_qty_flg_NC(info);
		if (!getCndR().qty_flg()) {
			setValueEx(Cnd_odr_qty_flg, false);
		}
	}

	@Override
	public void doCnd_odr_qty_flg_NC(MCEventInfo info) {
		super.doCnd_odr_qty_flg_NC(info);
		if (getCndR().odr_qty_flg()) {
			setValueEx(Cnd_qty_flg, true);
		}
	}

	@Override
	public void doCnd_asst_typ_LC(MCEventInfo info) {
		if (!isNull(getCndR().asst_typ())) {
			setValueEx(Cnd_except_other_flg, false);
		}
	}

	@Override
	public void doCnd_except_other_flg_NC(MCEventInfo info) {
		super.doCnd_except_other_flg_NC(info);
		if (getCndR().except_other_flg()) {
			setValueEx(Cnd_asst_typ, null);
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
		if (!isNull(Cnd_bp_nm.getValue())) {
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
	public void doLPnl_disp_std_NC(MCEventInfo info) {
		super.doLPnl_disp_std_NC(info);
		_cc.displayColumn();
		doDispStdCng();
		RsltTable.adjustWidth();
	}

	@Override
	public void doLPnl_disp_upri_NC(MCEventInfo info) {
		super.doLPnl_disp_upri_NC(info);
		_cc.displayColumn();
		doDispStdCng();
		doDispLossCng();
		displaySumRow(getLPnlR().disp_sum_row() && !getLPnlR().disp_upri());
		RsltTable.adjustWidth();
	}

	@Override
	public void doLPnl_disp_sum_row_NC(MCEventInfo info) {
		super.doLPnl_disp_sum_row_NC(info);
		displaySumRow(getLPnlR().disp_sum_row() && !getLPnlR().disp_upri());
	}

	/**
	 * 合計行の表示・非表示を切り替えます。
	 */
	protected void displaySumRow(boolean boo) {
		if (getRsltL().size() <= 0) {
			return;
		}
		if (boo == _isSumDisplayed) {
			return;
		}
		if (boo) {
			getRsltL().add(_sumRow);
		}
		else {
			getRsltL().remove(getRsltL().size() - 1);
		}

		_isSumDisplayed = boo;
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
		setCndMode();
		displayColumn();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
		displayColumn();
		RsltTable.selectLeftmostColumn(0);
	}

	protected void setCndMode() {
		setDispUnitMode();
	}

	protected void setDispUnitMode() {
		if (getCndR().qty_flg()) {
			setDefaultMode(LPnl_disp_upri);
		}
		else {
			setValueEx(LPnl_disp_upri, false);
			LPnl_disp_upri.setMode(MCMode.READ_ONLY);
		}
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		doDispStdCng();
		doDispLossCng();
	}

	protected void doDispStdCng() {
		boolean dispStdUpri = getLPnlR().disp_std() && _cndR.qty_flg() && _cndR.wg_flg() && _cndR.itm_flg();
		setColModeByFlg(columnRslt_diff_upri, !getLPnlR().disp_upri() && dispStdUpri);
		setColModeByFlg(columnRslt_std_upri, !getLPnlR().disp_upri() && dispStdUpri);
		setColModeByFlg(columnRslt_act_upri, !getLPnlR().disp_upri() && _cndR.qty_flg());
		setColModeByFlg(columnRslt_diff_upri2, getLPnlR().disp_upri() && dispStdUpri);
		setColModeByFlg(columnRslt_std_upri2, getLPnlR().disp_upri() && dispStdUpri);
		setColModeByFlg(columnRslt_act_upri2, getLPnlR().disp_upri() && _cndR.qty_flg());

		setColModeByFlg(columnRslt_upri_var, getLPnlR().disp_upri() && _cndR.qty_flg());
		setColModeByFlg(columnRslt_upri_fxd, getLPnlR().disp_upri() && _cndR.qty_flg());
		setColModeByFlg(columnRslt_diff_cost, !getLPnlR().disp_upri() && getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_cost, !getLPnlR().disp_upri() && getLPnlR().disp_std());
		setColModeByFlg(columnRslt_ttl, !getLPnlR().disp_upri());
		setColModeByFlg(columnRslt_var_cost, !getLPnlR().disp_upri());
		setColModeByFlg(columnRslt_fxd_cost, !getLPnlR().disp_upri());
		setColModeByFlg(columnRslt_odr_upri, !getLPnlR().disp_upri() && _cndR.odr_qty_flg());
	}

	protected void doDispLossCng() {
		setColModeByFlg(columnRslt_ttl_loss_upri, !getLPnlR().disp_upri() && _cndR.qty_flg() && _cndR.loss_flg());
		setColModeByFlg(columnRslt_ttl_loss_upri2, getLPnlR().disp_upri() && _cndR.qty_flg() && _cndR.loss_flg());
		setColModeByFlg(columnRslt_loss_upri, getLPnlR().disp_upri() && _cndR.qty_flg() && _cndR.loss_flg());
		setColModeByFlg(columnRslt_ttl_loss, !getLPnlR().disp_upri() && _cndR.loss_flg());
		setColModeByFlg(columnRslt_loss, !getLPnlR().disp_upri() && _cndR.loss_flg());
	}

	// ------------------------------------------------
	// 値の設定
	// ------------------------------------------------

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_st_stk_flg, true);
		setValueEx(Cnd_st_wip_flg, true);
		setValueEx(Cnd_end_stk_flg, true);
		setValueEx(Cnd_end_wip_flg, true);
		setValueEx(Cnd_adj_flg, true);
		setValueEx(Cnd_asst_typ_flg, true);
		setValueEx(Cnd_qty_flg, true);
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
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp, LPnl_disp_upri);
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())
					|| MAC_EXPNS_TYP.isSPPL(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (!getLPnlR().disp_upri() && getLPnlR().disp_sum_row()) {
			return sortWithoutBottom(table, policy);
		}
		return super.sort(table, policy);
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
		cc.putColumnBG(columnRslt_diff_upri, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_cost, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_std_cost, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_fxd_cost, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_var_cost, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_diff_upri2, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_upri2, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_act_upri2, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_upri_fxd, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_upri_var, getVarFxdColor(this));
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_odr_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
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
			if (getLPnlR().disp_sum_row() && !getLPnlR().disp_upri()) {
				if (index == getRsltL().size() - 1) {
					return _ttlColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

}