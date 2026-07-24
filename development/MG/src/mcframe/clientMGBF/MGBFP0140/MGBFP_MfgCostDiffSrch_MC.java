package mcframe.clientMGBF.MGBFP0140;

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
import mcframe.clientMAUB.MAUBP0050.*;
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
import java.util.Set;
import java.util.Arrays;

import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;

import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_MfgCostDiffSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_MfgCostDiffSrch_MC extends MGBFP_MfgCostDiffSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<? extends MCConstRow> _cc = new MGUCP_CCtrl<>();
	protected MGUCP_CCtrl<? extends MCConstRow> _cc2 = new MGUCP_CCtrl<>();
	protected MGUCP_CCtrl<? extends MCConstRow> _cc3 = new MGUCP_CCtrl<>();

	protected MCList<Rslt2R> _rslt2L;
	protected MCList<Rslt10R> _rslt10L;

	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_MfgCostDiffSrch_MC() {
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
	public MGBFP_MfgCostDiffSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0140_Srch01Caller<P extends MGBFP_MfgCostDiffSrch, B extends MG_MGBFL0140_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0140_Srch01Caller(P p, B b) {
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
		protected void show() {
			super.show();

			_rslt2L = getRslt2L().clone();
			_rslt10L = getRslt10L().clone();
			_cndR = getCndR().clone();

			setSrch02Cnd();
		}
		protected void setSrch02Cnd() {
			getQtyR().calc_grp_cd(getCndR().calc_grp_cd());
			getQtyR().calc_no(getCndR().calc_no());
			getQtyR().itm_cd(getCndR().itm_cd());
			getQtyR().itm_sub1(getCndR().itm_sub1());
			getQtyR().itm_sub2(getCndR().itm_sub2());
			getQtyR().itm_sub3(getCndR().itm_sub3());
			getQtyR().itm_mfg_inst_no(getCndR().itm_mfg_inst_no());
			getQtyR().mfg_act_no(getCndR().mfg_act_no());
			getQtyR().ym(getCndR().ym());
			getQtyR().lot_no(getCndR().lot_no());
			getQtyR().sublot_no(getCndR().sublot_no());
			getQtyR().sno1(getCndR().sno1());
			getQtyR().sno2(getCndR().sno2());
			getQtyR().sno3(getCndR().sno3());
			getQtyR().sno4(getCndR().sno4());
			getQtyR().site_cd(getCndR().site_cd());
			getQtyR().site_nm(getCndR().site_nm());
			getQtyR().wg_cd(getCndR().wg_cd());
			getQtyR().wg_nm(getCndR().wg_nm());
			getQtyR().loc_cd(getCndR().loc_cd());
			getQtyR().loc_nm(getCndR().loc_nm());
			getQtyR().str_ln_cd(getCndR().str_ln_cd());
			getQtyR().str_ln_nm(getCndR().str_ln_nm());
		}
	}

	/**
	 * [MG_MGBFL0140_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0140_Srch02Caller<P extends MGBFP_MfgCostDiffSrch, B extends MG_MGBFL0140_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0140_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			Rslt10Table.selectRowNoFocus(0);
		}

		@Override
		protected void show() {
			super.show();
			setSumRow(getRslt10L());
		}

		protected <A extends MCRow> void setSumRow(MCList<A> list) {
			if (list.isEmpty()) {
				return;
			}
			String[] sumColNames = new String[] { Rslt10R.$diff_std_tgt_std_alc_amt, Rslt10R.$diff_std_tgt_alc_amt,
					Rslt10R.$diff_alc_amt, Rslt10R.$std_alc_amt, Rslt10R.$alc_amt, Rslt10R.$std_tgt_amt };
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(sumColNames);
			A sumRow = list.groupBy(policy).get(0);
			for (String nm : sumColNames) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			list.add(sumRow);
		}

		@Override
		protected void moveFocusNoDown() {
		}

		@Override
		protected void showNoDownDataMsg() {
		}

		@Override
		protected void resultNoDataFound() {
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0140_Srch01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);

		Qty_qty_p_PPanel.setRelateBeans(Qty_unit_cd, Qty_dec_place);
		Qty_inst_qty_p_PPanel.setRelateBeans(Qty_unit_cd, Qty_dec_place);

		Rslt2_qty_p_PPanel.setRelateBeans(columnRslt2_unit_cd, columnRslt2_dec_place);
		Rslt2_inst_qty_p_PPanel.setRelateBeans(columnRslt2_unit_cd, columnRslt2_dec_place);

		Rslt3_qty_diff_p_PPanel.setRelateBeans(columnRslt3_unit_cd, columnRslt3_dec_place);
		Rslt3_std_qty_p_PPanel.setRelateBeans(columnRslt3_unit_cd, columnRslt3_dec_place);
		Rslt3_act_qty_p_PPanel.setRelateBeans(columnRslt3_unit_cd, columnRslt3_dec_place);

		Rslt4_qty_diff_p_PPanel.setRelateBeans(columnRslt4_unit_cd, columnRslt4_dec_place);
		Rslt4_std_qty_p_PPanel.setRelateBeans(columnRslt4_unit_cd, columnRslt4_dec_place);
		Rslt4_act_qty_p_PPanel.setRelateBeans(columnRslt4_unit_cd, columnRslt4_dec_place);

		Rslt5_qty_p_PPanel.setRelateBeans(columnRslt5_unit_cd, columnRslt5_dec_place);
		Rslt5_inst_qty_p_PPanel.setRelateBeans(columnRslt5_unit_cd, columnRslt5_dec_place);

		Rslt6_qty_diff_p_PPanel.setRelateBeans(columnRslt6_unit_cd, columnRslt6_dec_place);
		Rslt6_std_qty_p_PPanel.setRelateBeans(columnRslt6_unit_cd, columnRslt6_dec_place);
		Rslt6_act_qty_p_PPanel.setRelateBeans(columnRslt6_unit_cd, columnRslt6_dec_place);

		Rslt7_qty_diff_p_PPanel.setRelateBeans(columnRslt7_wk_cost_cd, columnRslt7_dec_place);
		Rslt7_std_qty_p_PPanel.setRelateBeans(columnRslt7_wk_cost_cd, columnRslt7_dec_place);
		Rslt7_act_qty_p_PPanel.setRelateBeans(columnRslt7_wk_cost_cd, columnRslt7_dec_place);

		Rslt8_qty_diff_p_PPanel.setRelateBeans(columnRslt8_wk_cost_cd, columnRslt8_dec_place);
		Rslt8_std_qty_p_PPanel.setRelateBeans(columnRslt8_wk_cost_cd, columnRslt8_dec_place);
		Rslt8_act_qty_p_PPanel.setRelateBeans(columnRslt8_wk_cost_cd, columnRslt8_dec_place);

		Rslt9_qty_diff_p_PPanel.setRelateBeans(columnRslt9_wk_cost_cd, columnRslt9_dec_place);
		Rslt9_std_qty_p_PPanel.setRelateBeans(columnRslt9_wk_cost_cd, columnRslt9_dec_place);
		Rslt9_act_qty_p_PPanel.setRelateBeans(columnRslt9_wk_cost_cd, columnRslt9_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_cc.init(this, RsltTable, Rslt2Table, Rslt3Table, Rslt5Table, Rslt6Table, Rslt7Table);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		
		_cc2.init(this, Rslt4Table, Rslt9Table);
		_cc2.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp, null, 3);

		_cc3.init(this, Rslt8Table);
		_cc3.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp, LPnl_disp_std);
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
	protected void tableInit() {
		super.tableInit();
		RsltTable.setSortable(false);
		setColorInfo();
	}

	protected Color _expnsSrchRsltColor = getExpnsSrchRsltColor(this);
	protected Color _moneyDiffColor = getMoneyDiffColor(this);
	protected Color _expnsGSubTtlColor = getExpnsGSubTtlColor(this);

	protected void setColorInfo() {
		Color varFxdColor = getVarFxdColor(this);
		Color allTtlColor = getAllTtlColor(this);

		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		cc.putColumnBG(RsltTable.getColumnConfigs(), _expnsSrchRsltColor);
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs(RsltTable)) {
			cc.putColumnBG(c, _expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt_sub_ttl, varFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt_ttl, allTtlColor);

		cc = (MGUDP_CellConfig) Rslt2Table.getCellConfig();
		cc.putColumnBG(Rslt2Table.getColumnConfigs(), _expnsSrchRsltColor);
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs(Rslt2Table)) {
			cc.putColumnBG(c, _expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt2_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt2_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt2_ttl, allTtlColor);

		cc = (MGUDP_CellConfig) Rslt3Table.getCellConfig();
		cc.putColumnBG(Rslt3Table.getColumnConfigs(), _expnsSrchRsltColor);
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs(Rslt3Table)) {
			cc.putColumnBG(c, _expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt3_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt3_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt3_ttl, allTtlColor);

		cc = (MGUDP_CellConfig) Rslt4Table.getCellConfig();
		cc.putColumnBG(Rslt4Table.getColumnConfigs(), _expnsSrchRsltColor);
		setElmColorCC2(cc, _cc2.getExpnsGColumnConfigs(Rslt4Table), true);
		setElmColorCC2(cc, _cc2.getExpnsColumnConfigs(Rslt4Table), false);
		cc.putColumnBG(columnRslt4_qty_diff, _moneyDiffColor);
		cc.putColumnBG(columnRslt4_diff_upri, _moneyDiffColor);
		cc.putColumnBG(columnRslt4_diff_fxd_cost, _moneyDiffColor);
		cc.putColumnBG(columnRslt4_std_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt4_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt4_diff_var_cost, _moneyDiffColor);
		cc.putColumnBG(columnRslt4_std_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt4_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt4_diff_ttl, _moneyDiffColor);
		cc.putColumnBG(columnRslt4_std_ttl, allTtlColor);
		cc.putColumnBG(columnRslt4_ttl, allTtlColor);

		cc = (MGUDP_CellConfig) Rslt5Table.getCellConfig();
		cc.putColumnBG(Rslt5Table.getColumnConfigs(), _expnsSrchRsltColor);
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs(Rslt5Table)) {
			cc.putColumnBG(c, _expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt5_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt5_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt5_ttl, allTtlColor);
		cc.putColumnBG(columnRslt5_diff_upri, _moneyDiffColor);

		cc = (MGUDP_CellConfig) Rslt6Table.getCellConfig();
		cc.putColumnBG(Rslt6Table.getColumnConfigs(), _expnsSrchRsltColor);
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs(Rslt6Table)) {
			cc.putColumnBG(c, _expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt6_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt6_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt6_ttl, allTtlColor);
		cc.putColumnBG(columnRslt6_qty_diff, _moneyDiffColor);

		cc = (MGUDP_CellConfig) Rslt7Table.getCellConfig();
		cc.putColumnBG(Rslt7Table.getColumnConfigs(), _expnsSrchRsltColor);
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs(Rslt7Table)) {
			cc.putColumnBG(c, _expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt7_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt7_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt7_ttl, allTtlColor);
		cc.putColumnBG(columnRslt7_diff_wk_cost, _moneyDiffColor);

		cc = (MGUDP_CellConfig) Rslt8Table.getCellConfig();
		cc.putColumnBG(Rslt8Table.getColumnConfigs(), _expnsSrchRsltColor);
		for (MCColumnConfig c : _cc3.getExpnsGColumnConfigs(Rslt8Table)) {
			cc.putColumnBG(c, _expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt8_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt8_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt8_ttl, allTtlColor);
		cc.putColumnBG(columnRslt8_std_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt8_std_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt8_std_ttl, allTtlColor);

		cc = (MGUDP_CellConfig) Rslt9Table.getCellConfig();
		cc.putColumnBG(Rslt9Table.getColumnConfigs(), _expnsSrchRsltColor);
		setElmColorCC2(cc, _cc2.getExpnsGColumnConfigs(Rslt9Table), true);
		setElmColorCC2(cc, _cc2.getExpnsColumnConfigs(Rslt9Table), false);
		cc.putColumnBG(columnRslt9_diff_wk_cost, _moneyDiffColor);
		cc.putColumnBG(columnRslt9_diff_fxd_cost, _moneyDiffColor);
		cc.putColumnBG(columnRslt9_std_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt9_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt9_diff_var_cost, _moneyDiffColor);
		cc.putColumnBG(columnRslt9_std_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt9_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt9_diff_ttl, _moneyDiffColor);
		cc.putColumnBG(columnRslt9_std_ttl, allTtlColor);
		cc.putColumnBG(columnRslt9_ttl, allTtlColor);
	}
	protected void setElmColorCC2(MGUDP_CellConfig cc, MCColumnConfig[] cols, boolean expnsGrp) {
		for (int i = 0; i < cols.length; i++) {
			if (i % 3 == 0) {
				cc.putColumnBG(cols[i], _moneyDiffColor);
			}
			else if (expnsGrp) {
				cc.putColumnBG(cols[i], _expnsGSubTtlColor);
			}
		}
	}

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == RsltTable || tbl == Rslt8Table) {
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == RsltTable) {
			confSet.removeAll(Arrays.asList(RsltTable.getAllColumnConfigs()));
			confSet.addAll(Arrays.asList(RsltTable.getViewColumnConfigs()));
		}
		else if (table == Rslt8Table) {
			confSet.removeAll(Arrays.asList(Rslt8Table.getAllColumnConfigs()));
			confSet.addAll(Arrays.asList(Rslt8Table.getViewColumnConfigs()));
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			conf.ignoreSortOrder(true);
			conf.ignoreTableSort(true);
		}
		return conf;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
		displayColumn();
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
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		RsltTable.selectLeftmostColumn(0);
		Rslt2Table.selectLeftmostColumn(0);
	}

	public void setTabMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			return ;
		}

		if (r.getGUIIndex() == 0) {
			getRslt2L().setAll(_rslt2L);
			getLPnlR().disp_std(false);
			displayStdColumn();
			setTabComponentEnable(RsltTabTab, Rslt2Panel, Rslt8Panel);
			Rslt2Table.selectRowNoFocus(0);
		}
		else if (r.getGUIIndex() == 1) {
			getLPnlR().disp_std(true);
			displayStdColumn();
			setTabComponentEnable(RsltTabTab, Rslt3Panel, Rslt8Panel);
		}
		else if (r.getGUIIndex() == 2) {
			setTabComponentEnable(RsltTabTab, Rslt4Panel, Rslt9Panel);
		}
		else if (r.getGUIIndex() == 3) {
			setTabComponentEnable(RsltTabTab, Rslt5Panel);
		}
		else if (r.getGUIIndex() == 4) {
			setTabComponentEnable(RsltTabTab, Rslt6Panel);
		}
		else if (r.getGUIIndex() == 5) {
			setTabComponentEnable(RsltTabTab, Rslt7Panel, Rslt9Panel);
		}
		else {
			setTabComponentEnable(RsltTabTab, Rslt2Panel);
			Rslt2Table.clear();
			setTabComponentEnable(RsltTabTab, (Component[]) null);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setTabMode();

		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			return;
		}
		if (r.getGUIIndex() == 5 || r.getGUIIndex() <= 2) {
			if(RsltTabTab.getSelectedComponent() != Rslt7Panel
					&& RsltTabTab.getSelectedComponent() != Rslt8Panel
					&& RsltTabTab.getSelectedComponent() != Rslt9Panel) {
				Rslt10Table.clear();
			}
		}
		else {
			getRslt10L().setAll(getRslt10List());
			Rslt10Table.adjustWidth();
		}
	}

	protected MCList<Rslt10R> getRslt10List() {
		MCList<Rslt10R> list = MCList.create(Rslt10R.class);

		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r) == false && r.getGUIIndex() >= 3 && r.getGUIIndex() != 7) {

			if (r.getGUIIndex() == 3) {
				setRslt10List(list, MAC_DIFF_CALC_TYP.PRICE.value());
			}
			else if (r.getGUIIndex() == 4) {
				setRslt10List(list, MAC_DIFF_CALC_TYP.QTY.value());
			}
			else if (r.getGUIIndex() == 6) {
				setRslt10List(list, null);
			}
			else if (r.getGUIIndex() == 8) {
				setRslt10List(list, MAC_DIFF_CALC_TYP.DIFF1.value());
			}
			else if (r.getGUIIndex() == 9) {
				setRslt10List(list, MAC_DIFF_CALC_TYP.DIFF2.value());
			}
			else if (r.getGUIIndex() == 10) {
				setRslt10List(list, MAC_DIFF_CALC_TYP.DIFF3.value());
			}
			else if (r.getGUIIndex() == 11) {
				setRslt10List(list, MAC_DIFF_CALC_TYP.DIFF4.value());
			}
			else if (r.getGUIIndex() == 12) {
				setRslt10List(list, MAC_DIFF_CALC_TYP.DIFF5.value());
			}
		}
		return list;
	}
	protected void setRslt10List(MCList<Rslt10R> list, String diffCalcTyp) {
		for (Rslt10R r : _rslt10L) {
			if (isNull(diffCalcTyp) || isSame(r.diff_calc_typ(), diffCalcTyp)) {
				list.add(r);
			}
		}
		setSumRow(list);
	}
	protected <A extends MCRow> void setSumRow(MCList<A> list) {
		if (list.isEmpty()) {
			return;
		}

		String[] sumColNames = { Rslt10R.$diff_std_tgt_std_alc_amt, Rslt10R.$diff_std_tgt_alc_amt,
				Rslt10R.$diff_alc_amt, Rslt10R.$std_alc_amt, Rslt10R.$alc_amt, Rslt10R.$std_tgt_amt };

		MCGroupByPolicy policy = new MCGroupByPolicy();
		policy.sum(sumColNames);
		A sumRow = list.groupBy(policy).get(0);
		for (String nm : sumColNames) {
			if (isNull(sumRow.getValueNE(nm))) {
				sumRow.setValue(nm, MCNumber.ZERO);
			}
		}
		list.add(sumRow);
	}

	@Override
	public void doRslt7_NC(MCEventInfo info) {
		super.doRslt7_NC(info);
		if(RsltTabTab.getSelectedComponent() == Rslt7Panel) {
			setOperInfo();
		}
	}

	protected void setOperInfo() {
		Rslt7R r = Rslt7Table.getSelectedMCRow();
		if (isNull(r)) {
			getQtyR().oper_cd(null);
			getQtyR().wk_cost_cd(null);
			getQtyR().loc_cd2(null);
		}
		else {
			getQtyR().oper_cd(r.oper_cd());
			getQtyR().wk_cost_cd(r.wk_cost_cd());
			getQtyR().loc_cd2(r.loc_cd());
			callMG_MGBFL0140_Srch02();
		}
	}

	@Override
	public void doRslt8_NC(MCEventInfo info) {
		super.doRslt8_NC(info);
		if(RsltTabTab.getSelectedComponent() == Rslt8Panel) {
			setOperInfo8();
		}
	}

	protected void setOperInfo8() {
		Rslt8R r = Rslt8Table.getSelectedMCRow();
		if (isNull(r)) {
			getQtyR().oper_cd(null);
			getQtyR().wk_cost_cd(null);
			getQtyR().loc_cd2(null);
		}
		else {
			getQtyR().oper_cd(r.oper_cd());
			getQtyR().wk_cost_cd(r.wk_cost_cd());
			getQtyR().loc_cd2(r.loc_cd());
			callMG_MGBFL0140_Srch02();
		}
	}

	@Override
	public void doRslt9_NC(MCEventInfo info) {
		super.doRslt9_NC(info);
		if(RsltTabTab.getSelectedComponent() == Rslt9Panel) {
			setOperInfo9();
		}
	}

	protected void setOperInfo9() {
		Rslt9R r = Rslt9Table.getSelectedMCRow();
		if (isNull(r)) {
			getQtyR().oper_cd(null);
			getQtyR().wk_cost_cd(null);
			getQtyR().loc_cd2(null);
		}
		else {
			getQtyR().oper_cd(r.oper_cd());
			getQtyR().wk_cost_cd(r.wk_cost_cd());
			getQtyR().loc_cd2(r.loc_cd());
			callMG_MGBFL0140_Srch02();
		}
	}

	@Override
	public void doRsltTab_NC(MCEventInfo info) {
		super.doRsltTab_NC(info);
		if (RsltTabTab.getSelectedComponent() == Rslt3Panel) {
			if (Rslt3Table.getMCSelectedRow() < 0) {
				Rslt3Table.selectLeftmostColumn(0);
			}
		}
		else if (RsltTabTab.getSelectedComponent() == Rslt4Panel) {
			if (Rslt4Table.getMCSelectedRow() < 0) {
				Rslt4Table.selectLeftmostColumn(0);
			}
		}
		else if (RsltTabTab.getSelectedComponent() == Rslt5Panel) {
			if (Rslt5Table.getMCSelectedRow() < 0) {
				Rslt5Table.selectLeftmostColumn(0);
			}
		}
		else if (RsltTabTab.getSelectedComponent() == Rslt6Panel) {
			if (Rslt6Table.getMCSelectedRow() < 0) {
				Rslt6Table.selectLeftmostColumn(0);
			}
		}

		if(RsltTabTab.getSelectedComponent() == Rslt7Panel) {
			if (Rslt7Table.getMCSelectedRow() < 0) {
				Rslt7Table.selectLeftmostColumn(0);
			}
			setOperInfo();
		}
		else if(RsltTabTab.getSelectedComponent() == Rslt8Panel) {
			if (Rslt8Table.getMCSelectedRow() < 0) {
				Rslt8Table.selectLeftmostColumn(0);
			}
			setOperInfo8();
		}
		else if(RsltTabTab.getSelectedComponent() == Rslt9Panel) {
			if (Rslt9Table.getMCSelectedRow() < 0) {
				Rslt9Table.selectLeftmostColumn(0);
			}
			setOperInfo9();
		}
		else {
			Rslt10Table.clear();
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
	public void doCnd_po_no_LC(MCEventInfo info) {
		super.doCnd_po_no_LC(info);
		if (!isNull(getCndR().po_no())) {
			setValueEx(Cnd_no_po_no_flg, false);
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

	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		_cc.displayColumn();
		_cc2.displayColumn();
		displayInptColumn();
		displayStdColumn();
	}

	protected void displayInptColumn() {
		if (_cndR != null && _cndR.mfg_inpt_flg()) {
			setDefaultMode(columnRslt_mfg_inpt_cost);
			setDefaultMode(columnRslt_sub_ttl);
		}
		else {
			columnRslt_mfg_inpt_cost.setMode(MCMode.INVISIBLE);
			columnRslt_sub_ttl.setMode(MCMode.INVISIBLE);
		}
	}

	protected void displayStdColumn() {
		_cc3.displayColumn();
		for (MCColumnConfig cc : new MCColumnConfig[] { columnRslt8_std_wk_cost, columnRslt8_std_ttl,
				columnRslt8_std_var_cost, columnRslt8_std_fxd_cost }) {
			setColModeByFlg(cc, getLPnlR().disp_std());
		}
		for (MCColumnConfig cc : new MCColumnConfig[] { columnRslt8_act_wk_cost, columnRslt8_ttl, columnRslt8_var_cost,
				columnRslt8_fxd_cost }) {
			setColModeByFlg(cc, !getLPnlR().disp_std());
		}
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
		Rslt2Table.setCellConfig(createRsltCellConfig());
		Rslt3Table.setCellConfig(createRsltCellConfig());
		Rslt4Table.setCellConfig(createRsltCellConfig());
		Rslt5Table.setCellConfig(createRsltCellConfig());
		Rslt6Table.setCellConfig(createRsltCellConfig());
		Rslt7Table.setCellConfig(createRsltCellConfig());
		Rslt8Table.setCellConfig(createRsltCellConfig());
		Rslt9Table.setCellConfig(createRsltCellConfig());
		Rslt10Table.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected Color _vTtlColor = getVTtlColor(this);
	protected Color _expnsTtlColor = getVttlExpnsColor(this);

	protected class RsltCellConfig extends MGUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (table.getBaseTable() == RsltTable) {
				if (getRsltL().get(index).getGUIIndex() == 2) {
					return _moneyDiffColor;
				}
			}
			else if (table.getBaseTable() == Rslt2Table) {
				if (isSame(index + 1, getRslt2L().size())) {
					return _vTtlColor;
				}
				if (isNull(getRslt2L().get(index).lvl())) {
					return _expnsTtlColor;
				}
			}
			else if (table.getBaseTable() == Rslt3Table) {
				if (isSame(index + 1, getRslt3L().size())) {
					return _vTtlColor;
				}
				if (isNull(getRslt3L().get(index).lvl())) {
					return _expnsTtlColor;
				}
			}
			else if (table.getBaseTable() == Rslt4Table) {
				if (isSame(index + 1, getRslt4L().size())) {
					return _vTtlColor;
				}
				if (isNull(getRslt4L().get(index).lvl())) {
					return _expnsTtlColor;
				}
			}
			else if (table.getBaseTable() == Rslt5Table) {
				if (isSame(index + 1, getRslt5L().size())) {
					return _vTtlColor;
				}
				if (isNull(getRslt5L().get(index).lvl())) {
					return _expnsTtlColor;
				}
			}
			else if (table.getBaseTable() == Rslt6Table) {
				if (isSame(index + 1, getRslt6L().size())) {
					return _vTtlColor;
				}
				if (isNull(getRslt6L().get(index).lvl())) {
					return _expnsTtlColor;
				}
			}
			else if (table.getBaseTable() == Rslt7Table) {
				if (isSame(index + 1, getRslt7L().size())) {
					return _vTtlColor;
				}
			}
			else if (table.getBaseTable() == Rslt8Table) {
				if (isSame(index + 1, getRslt8L().size())) {
					return _vTtlColor;
				}
			}
			else if (table.getBaseTable() == Rslt9Table) {
				if (isSame(index + 1, getRslt9L().size())) {
					return _vTtlColor;
				}
			}
			else if (table.getBaseTable() == Rslt10Table) {
				if (isSame(index + 1, getRslt10L().size())) {
					return _vTtlColor;
				}
				if (column == columnRslt10_diff_alc_tgt_val
						|| column == columnRslt10_diff_alc_rate
						|| column == columnRslt10_diff_std_tgt_std_alc_amt
						|| column == columnRslt10_diff_std_tgt_alc_amt
						|| column == columnRslt10_diff_alc_amt) {
					return _moneyDiffColor;
				}
				else {
					return _expnsSrchRsltColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

}