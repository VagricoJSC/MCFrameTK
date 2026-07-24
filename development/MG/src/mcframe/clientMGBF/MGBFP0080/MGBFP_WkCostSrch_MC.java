package mcframe.clientMGBF.MGBFP0080;

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
import mcframe.clientMAUB.MAUBP5340.*;
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
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_WkCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_WkCostSrch_MC extends MGBFP_WkCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	// 合計行の色
	protected Color _ttlColor = getVTtlColor(this);

	// 原単位追加表示桁
	protected int _defAddDispDigit = 2;

	// 検索時の検索条件
	protected CndR _cndR = CndR.create();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_WkCostSrch_MC() {
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
	public MGBFP_WkCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MGBFP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0120(r);
	}
	protected void doBtn_open_MGBFP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0120");
		mcframe.clientMGBF.MGBFP0120.CndR to = mcframe.clientMGBF.MGBFP0120.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	protected boolean isEnableBtn_open(RsltR r) {
		if (r == null) {
			return false;
		}
		return getRsltL().size() - 1 != r.getGUIIndex();
	}
	/**
	 * [MG_MGBFL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0080_Srch01Caller<P extends MGBFP_WkCostSrch, B extends MG_MGBFL0080_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0080_Srch01Caller(P p, B b) {
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

			// カラム表示に使用するため保持
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
		callMG_MGBFL0080_Srch01();
	}

	/**
	 * Panel[LPnl]のボタン[redisplay]の押下時の処理
	 */
	@Override
	public void doLPnl_redisplay(MCEventInfo info) {
		RsltCellConfig cc = (RsltCellConfig) RsltTable.getCellConfig();

		cc.setAddDigit(getLPnlR().add_disp_digit());

		RsltTable.adjustWidth();
	}

	// ------------------------------------------------
	// イベント
	// ------------------------------------------------

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
	public void doLPnl_add_disp_digit_LC(MCEventInfo info) {
		super.doLPnl_add_disp_digit_LC(info);

		if (isNull(getLPnlR().add_disp_digit())) {
			getLPnlR().add_disp_digit(MCNumber.ZERO);
		}
	}

	@Override
	public boolean doLPnl_add_disp_digit_VC(MCEventInfo info) {
		if (!isDecPlace((MCNumber) info.getNewValue())) {
			return false;
		}

		return super.doLPnl_add_disp_digit_VC(info);
	}

	// 原単位追加表示桁のチェック
	protected boolean isDecPlace(MCNumber n) {
		return MCNumber.ZERO.lte(n) && MCNumber.valueOf(8).gte(n);
	}
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		setBtnModeByFlg(Btn_open_MGBFP0120, isEnableBtn_open(r));
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

		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		displayColumn();

		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);

		_cc.displayColumn();

		doDispStdCng();
	}

	protected void doDispStdCng() {
		setColModeByFlg(columnRslt_diff_wk_cost, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_wk_cost, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_diff_upri, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_upri, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_diff_cost, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_cost, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_diff_base_ttl, getLPnlR().disp_std() && _cndR.qty_flg());
		setColModeByFlg(columnRslt_std_base_ttl, getLPnlR().disp_std() && _cndR.qty_flg());
		setColModeByFlg(columnRslt_diff_base_wk_cost, getLPnlR().disp_std() && _cndR.qty_flg());
		setColModeByFlg(columnRslt_std_base_wk_cost, getLPnlR().disp_std() && _cndR.qty_flg());
		setColModeByFlg(columnRslt_diff_rt, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_diff_wk, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_diff_a, getLPnlR().disp_std() && dispDiffN(1));
		setColModeByFlg(columnRslt_diff_b, getLPnlR().disp_std() && dispDiffN(2));
		setColModeByFlg(columnRslt_diff_c, getLPnlR().disp_std() && dispDiffN(3));
		setColModeByFlg(columnRslt_diff_d, getLPnlR().disp_std() && dispDiffN(4));
		setColModeByFlg(columnRslt_diff_e, getLPnlR().disp_std() && dispDiffN(5));
		setColModeByFlg(columnRslt_diff_oth, getLPnlR().disp_std());
	}
	protected boolean dispDiffN(int i) {
		String diffUseTyp = nvl(getCoParm().diff_use_typ(), MAC_DIFF_USE_TYP.DIFF5.value());
		if (MAC_DIFF_USE_TYP.isDIFF1(diffUseTyp)) {
			return i == 1;
		}
		else if (MAC_DIFF_USE_TYP.isDIFF2(diffUseTyp)) {
			return i <= 2;
		}
		else if (MAC_DIFF_USE_TYP.isDIFF3(diffUseTyp)) {
			return i <= 3;
		}
		else if (MAC_DIFF_USE_TYP.isDIFF4(diffUseTyp)) {
			return i <= 4;
		}
		else if (MAC_DIFF_USE_TYP.isDIFF5(diffUseTyp)) {
			return i <= 5;
		}
		return false;
	}

	// ------------------------------------------------
	// 値の設定
	// ------------------------------------------------

	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_oper_flg, true);
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
		setValueEx(LPnl_add_disp_digit, MCNumber.valueOf(_defAddDispDigit));

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
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
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

		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_var, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_fxd, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_std_wk_cost, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_std_cost, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_diff_wk_cost, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_upri, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_cost, getMoneyDiffColor(this));
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
		cc.putColumnBG(columnRslt_diff_base_ttl, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_base_ttl, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_diff_base_wk_cost, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_base_wk_cost, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_diff_rt, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_wk, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_a, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_b, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_c, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_d, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_e, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_oth, getMoneyDiffColor(this));
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_qty_dec_place);
		Rslt_odr_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_qty_dec_place);
		Rslt_diff_wk_cost_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm, columnRslt_dec_place);
		Rslt_std_wk_cost_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm, columnRslt_dec_place);
		Rslt_act_wk_cost_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm, columnRslt_dec_place);
		Rslt_wk1_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm, columnRslt_dec_place);
		Rslt_wk2_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm, columnRslt_dec_place);
		Rslt_wk3_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm, columnRslt_dec_place);
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

		// 追加表示桁の設定
		protected int _add_digit = _defAddDispDigit;

		public void setAddDigit(MCNumber digit) {
			if (isNull(digit)) {
				_add_digit = 0;
			}
			else {
				_add_digit = digit.intValueExact();
			}
		}

		@Override
		public int getPriorViewScale(int index, MCColumnConfig column, MCTable<?> table) {
			int vs = super.getPriorViewScale(index, column, table);
			String type = getPriorViewScaleType(index, column, table);

			if (isNull(type)) {
				return vs;
			}

			// 原単位(通常STDは標準原価用)
			if (isSame(type, IfViewScale.STD)) {
				RsltR r = RsltTable.getRow(index);
				if (isNull(r.dec_place())) {
					vs = _add_digit;
				}
				else {
					vs = r.dec_place().intValueExact() + _add_digit;
				}
			}
			// 原単位単価(通常INPUTは値入力用桁数)
			else if (isSame(type, IfViewScale.INPUT)) {
				vs = getCostUnitDispDigit((MGUDP_PanelBase) table.getBaseRootPanel())
						+ _add_digit;
			}

			return vs;
		}
	}

}