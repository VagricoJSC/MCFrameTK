package mcframe.clientMGBF.MGBFP0030;

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
import mcframe.clientMAUB.MAUBP5060.*;
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
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_OutCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_OutCostSrch_MC extends MGBFP_OutCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<RsltR> _cc1 = new MGUCP_CCtrl<>();
	protected MGUCP_CCtrl<DispDtlR> _cc2 = new MGUCP_CCtrl<>();
	protected CndR _cndR = null;

	protected Color _vTtlColor = getVTtlColor(this);
	protected Color _expnsTtlColor = getVttlExpnsColor(this);
	protected Color _expnsSrchRsltColor = getExpnsSrchRsltColor(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_OutCostSrch_MC() {
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
	public MGBFP_OutCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MGBFP0270]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0270(MCEventInfo info) {
		RsltR hRow = RsltTable.getSelectedMCRow();
		if (hRow == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0270(hRow);
	}
	protected void doBtn_open_MGBFP0270(RsltR hRow) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0270");
		mcframe.clientMGBF.MGBFP0270.CndR to = mcframe.clientMGBF.MGBFP0270.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(hRow.wg_cd());
		to.ym(hRow.ym());
		to.mng_dpt_cd(hRow.mng_dpt_cd());
		to.mng_dpt_nm(hRow.mng_dpt_nm());
		to.par_itm_cd(hRow.itm_cd());
		to.par_itm_sub1(hRow.itm_sub1());
		to.par_itm_sub2(hRow.itm_sub2());
		to.par_itm_sub3(hRow.itm_sub3());
		to.par_itm_typ(hRow.itm_typ());
		to.par_itm_typ_d_cd(hRow.itm_typ_d_cd());
		to.par_itm_jnl_cd(hRow.itm_jnl_cd());
		to.itm_mfg_inst_no(hRow.itm_mfg_inst_no());
		to.mfg_act_no(hRow.mfg_act_no());
		to.par_lot_no(hRow.lot_no());
		to.par_sublot_no(hRow.sublot_no());
		to.par_sno1(hRow.sno1());
		to.par_sno2(hRow.sno2());
		to.par_sno3(hRow.sno3());
		to.par_sno4(hRow.sno4());
		to.par_asst_typ(hRow.asst_typ());
		to.bp_cd(hRow.bp_cd());
		to.po_no(hRow.po_no());
		to.slo_no(hRow.slo_no());
		to.iv_no(hRow.iv_no());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * [MG_MGBFL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0030_Srch01Caller<P extends MGBFP_OutCostSrch, B extends MG_MGBFL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();
			getDispDtlL().clear();
		}

		@Override
		protected void setMode() {
			super.setMode();
			changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
			_cc1.displayColumn();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
			_cc1.displayColumn();
			setSrchStatus();
			setBtnMode();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			_cndR = getCndR().clone();
		}

	}

	/**
	 * [MG_MGBFL0030_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0030_Srch02Caller<P extends MGBFP_OutCostSrch, B extends MG_MGBFL0030_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0030_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DispDtlTable.selectRowNoFocus(0);
		}

		@Override
		protected void setMode() {
			super.setMode();
			changeColumnMode(DispDtlTable, getHdrR(), DispDtlR.$$SHOW);
			_cc2.displayColumn();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			changeColumnMode(DispDtlTable, getHdrR(), DispDtlR.$$SHOW);
			_cc2.displayColumn();
			setBtnMode();
		}

		@Override
		protected void showNoDownDataMsg() {
			// ダイアログ出さない
		}

		@Override
		protected void resultNoDataFound() {
		}

	}

	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
		setTtlMode();
	}

	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
		setTtlMode();
	}

	/**
	 * Panel[Hdr]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doHdr_select_all(MCEventInfo info) {
		setBoolean(ChdTtlPanel, true);
	}

	/**
	 * Panel[Hdr]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doHdr_deselect_all(MCEventInfo info) {
		setBoolean(ChdTtlPanel, false);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0030_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0100(MCEventInfo info) {
		RsltR hRow = RsltTable.getSelectedMCRow();
		DispDtlR dRow = DispDtlTable.getSelectedMCRow();

		if (hRow == null || dRow == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0100(hRow, dRow);
	}

	protected void doBtn_open_MGBFP0100(RsltR hRow, DispDtlR dRow) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0100");
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();

		to.calc_grp_cd(dRow.calc_grp_cd());
		to.calc_no(dRow.calc_no());
		to.mng_dpt_cd(dRow.mng_dpt_cd());
		to.mng_dpt_nm(dRow.mng_dpt_nm());
		to.wg_cd(dRow.wg_cd());
		to.itm_cd(dRow.itm_cd());
		to.itm_sub1(dRow.itm_sub1());
		to.itm_sub2(dRow.itm_sub2());
		to.itm_sub3(dRow.itm_sub3());
		to.itm_nm(dRow.itm_nm());
		to.itm_typ(dRow.itm_typ());
		to.itm_typ_d_cd(dRow.itm_typ_d_cd());
		to.itm_jnl_cd(dRow.itm_jnl_cd());
		to.lot_no(dRow.lot_no());
		to.sublot_no(dRow.sublot_no());
		to.sno1(dRow.sno1());
		to.sno2(dRow.sno2());
		to.sno3(dRow.sno3());
		to.sno4(dRow.sno4());
		to.bp_cd(hRow.bp_cd());
		to.st_stk_flg(true);
		to.st_wip_flg(true);
		to.end_stk_flg(true);
		to.end_wip_flg(true);
		to.asst_typ(dRow.asst_typ());

		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$adj_flg);

		aso.putCnd(to, list);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0060(MCEventInfo info) {
		RsltR hRow = RsltTable.getSelectedMCRow();
		DispDtlR dRow = DispDtlTable.getSelectedMCRow();

		if (hRow == null || dRow == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0060(hRow, dRow);
	}

	protected void doBtn_open_MGBFP0060(RsltR hRow, DispDtlR dRow) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0060");
		mcframe.clientMGBF.MGBFP0060.CndR to = mcframe.clientMGBF.MGBFP0060.CndR.create();

		to.calc_grp_cd(dRow.calc_grp_cd());
		to.calc_no(dRow.calc_no());
		to.mng_dpt_cd(dRow.mng_dpt_cd());
		to.mng_dpt_nm(dRow.mng_dpt_nm());
		to.wg_cd(dRow.wg_cd());
		to.itm_cd(dRow.itm_cd());
		to.itm_sub1(dRow.itm_sub1());
		to.itm_sub2(dRow.itm_sub2());
		to.itm_sub3(dRow.itm_sub3());
		to.itm_nm(dRow.itm_nm());
		to.itm_typ(dRow.itm_typ());
		to.itm_typ_d_cd(dRow.itm_typ_d_cd());
		to.itm_jnl_cd(dRow.itm_jnl_cd());
		to.lot_no(dRow.lot_no());
		to.sublot_no(dRow.sublot_no());
		to.sno1(dRow.sno1());
		to.sno2(dRow.sno2());
		to.sno3(dRow.sno3());
		to.sno4(dRow.sno4());
		to.bp_cd(hRow.bp_cd());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0150]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0150(MCEventInfo info) {
		RsltR hRow = RsltTable.getSelectedMCRow();
		DispDtlR dRow = DispDtlTable.getSelectedMCRow();
		
		if (hRow == null || dRow == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0150(hRow, dRow);
	}

	protected void doBtn_open_MGBFP0150(RsltR hRow, DispDtlR dRow) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0150");
		mcframe.clientMGBF.MGBFP0150.CndR to = mcframe.clientMGBF.MGBFP0150.CndR.create();

		to.calc_grp_cd(dRow.calc_grp_cd());
		to.calc_no(dRow.calc_no());
		to.mng_dpt_cd(dRow.mng_dpt_cd());
		to.mng_dpt_nm(dRow.mng_dpt_nm());
		to.wg_cd(dRow.wg_cd());
		to.itm_cd(dRow.itm_cd());
		to.itm_sub1(dRow.itm_sub1());
		to.itm_sub2(dRow.itm_sub2());
		to.itm_sub3(dRow.itm_sub3());
		to.itm_nm(dRow.itm_nm());
		to.itm_typ(dRow.itm_typ());
		to.itm_typ_d_cd(dRow.itm_typ_d_cd());
		to.itm_jnl_cd(dRow.itm_jnl_cd());
		to.lot_no(dRow.lot_no());
		to.sublot_no(dRow.sublot_no());
		to.sno1(dRow.sno1());
		to.sno2(dRow.sno2());
		to.sno3(dRow.sno3());
		to.sno4(dRow.sno4());
		to.bp_cd(hRow.bp_cd());

		if (MAC_ASST_TYP.isOTH(dRow.asst_typ())) {
			to.except_other_flg(false);
		}
		else {
			to.asst_typ(dRow.asst_typ());
		}

		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$except_other_flg);

		aso.putCnd(to, list);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	// セッティング ////////////////////////////////////////////////////////////

	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (table == RsltTable || table == DispDtlTable) {
			return sortWithoutBottom(table, policy);
		}
		return super.sort(table, policy);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_odr_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		DispDtl_qty_p_PPanel.setRelateBeans(columnDispDtl_unit_cd, columnDispDtl_dec_place);
		Rslt_trd_upri_gap_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_upri_dec_place);
		Rslt_std_trd_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_amt_gap_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_amt_dec_place);
		Rslt_std_trd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_amt_dec_place);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		Color varFxdColor = getVarFxdColor(this);
		Color allTtlColor = getAllTtlColor(this);

		TableCellConfig cc1 = (TableCellConfig) RsltTable.getCellConfig();
		TableCellConfig cc2 = (TableCellConfig) DispDtlTable.getCellConfig();

		cc1.putColumnBG(RsltTable.getColumnConfigs(), _expnsSrchRsltColor);
		cc1.putColumnBG(columnRslt_fxd_cost, varFxdColor);
		cc1.putColumnBG(columnRslt_var_cost, varFxdColor);
		cc1.putColumnBG(columnRslt_ttl, allTtlColor);
		cc1.putColumnBG(_cc1.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));

		cc2.putColumnBG(DispDtlTable.getColumnConfigs(), _expnsSrchRsltColor);
		cc2.putColumnBG(columnDispDtl_fxd_cost, varFxdColor);
		cc2.putColumnBG(columnDispDtl_var_cost, varFxdColor);
		cc2.putColumnBG(columnDispDtl_ttl, allTtlColor);
		cc2.putColumnBG(_cc2.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
		Color diffColor = getMoneyDiffColor(this);
		Color stdColor = getStdUpriColor(this);

		cc1.putColumnBG(columnRslt_trd_upri_gap, diffColor);
		cc1.putColumnBG(columnRslt_trd_amt_gap, diffColor);
		cc1.putColumnBG(columnRslt_xrate_gap, diffColor);
		cc1.putColumnBG(columnRslt_out_unit_gap, diffColor);
		cc1.putColumnBG(columnRslt_purc_upri_gap, diffColor);
		cc1.putColumnBG(columnRslt_out_diff, diffColor);
		cc1.putColumnBG(columnRslt_upri_diff, diffColor);
		cc1.putColumnBG(columnRslt_rate_diff, diffColor);
		cc1.putColumnBG(columnRslt_purc_amt_gap, diffColor);
		cc1.putColumnBG(columnRslt_purc_cost_gap, diffColor);
		cc1.putColumnBG(columnRslt_std_trd_upri, stdColor);
		cc1.putColumnBG(columnRslt_std_trd_amt, stdColor);
		cc1.putColumnBG(columnRslt_std_xrate, stdColor);
		cc1.putColumnBG(columnRslt_std_out_unit, stdColor);
		cc1.putColumnBG(columnRslt_std_purc_upri, stdColor);
		cc1.putColumnBG(columnRslt_std_out_amt, stdColor);
		cc1.putColumnBG(columnRslt_std_purc_amt, stdColor);
		cc1.putColumnBG(columnRslt_std_purc_cost, stdColor);

		cc2.putColumnBG(columnDispDtl_inpt_unit_gap, diffColor);
		cc2.putColumnBG(columnDispDtl_diff_up, diffColor);
		cc2.putColumnBG(columnDispDtl_std_inpt_unit, stdColor);
		cc2.putColumnBG(columnDispDtl_so_std_amt, stdColor);
		cc2.putColumnBG(columnDispDtl_std_cost, stdColor);
	}

	@Override
	protected void setCellConfig() {
		RsltTable.setCellConfig(createTableCellConfig());
		DispDtlTable.setCellConfig(createTableCellConfig());
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
		_cc1.init(this, RsltTable);
		_cc2.init(this, DispDtlTable);
		_cc1.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		_cc2.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
	}

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
	protected void valueInit() {
		super.valueInit();
		Cnd_wg_flg.setValue(true);
		Cnd_mng_dpt_flg.setValue(true);
		Cnd_bp_flg.setValue(true);
		Cnd_itm_flg.setValue(true);
		Hdr_chd_mng_dpt_flg.setValue(true);
		LPnl_disp_expns.setValue(true);
		LPnl_disp_expns_grp.setValue(true);
		
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		changeColumnMode(DispDtlTable, getHdrR(), DispDtlR.$$SHOW);
		_cc1.displayColumn();
		_cc2.displayColumn();
	}

	// イベント ////////////////////////////////////////////////////////////////
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL(), getDispDtlL());
		setSrchStatus();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		RsltR row = RsltTable.getSelectedMCRow();
		if (!isNull(row) && !isNull(row.calc_grp_cd())) {
			// 下一覧検索
			getHdrR().setValue(HdrR.$calc_grp_cd, row.calc_grp_cd());
			getHdrR().setValue(HdrR.$calc_no, row.calc_no());
			getHdrR().setValue(HdrR.$wg_cd, row.wg_cd());
			getHdrR().setValue(HdrR.$itm_typ, row.itm_typ());
			getHdrR().setValue(HdrR.$itm_typ_d_cd, row.itm_typ_d_cd());
			getHdrR().setValue(HdrR.$itm_jnl_cd, row.itm_jnl_cd());
			getHdrR().setValue(HdrR.$itm_cd, row.itm_cd());
			getHdrR().setValue(HdrR.$itm_sub1, row.itm_sub1());
			getHdrR().setValue(HdrR.$itm_sub2, row.itm_sub2());
			getHdrR().setValue(HdrR.$itm_sub3, row.itm_sub3());
			getHdrR().setValue(HdrR.$itm_mfg_inst_no, row.itm_mfg_inst_no());
			getHdrR().setValue(HdrR.$mfg_act_no, row.mfg_act_no());
			getHdrR().setValue(HdrR.$ym, row.ym());
			getHdrR().setValue(HdrR.$mng_dpt_cd, row.mng_dpt_cd());
			getHdrR().setValue(HdrR.$bp_cd, row.bp_cd());
			getHdrR().setValue(HdrR.$po_no, row.po_no());
			getHdrR().setValue(HdrR.$slo_no, row.slo_no());
			getHdrR().setValue(HdrR.$iv_no, row.iv_no());
			getHdrR().setValue(HdrR.$po_no_flg, _cndR.po_no_flg());
			getHdrR().setValue(HdrR.$slo_no_flg, _cndR.slo_no_flg());
			getHdrR().setValue(HdrR.$iv_no_flg, _cndR.iv_no_flg());

			callMG_MGBFL0030_Srch02();
		}
		else {
			getDispDtlL().clear();
		}
		setBtnMode();
	}

	@Override
	public void doDispDtl_NC(MCEventInfo info) {
		super.doDispDtl_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_itm_flg_NC(MCEventInfo info) {
		super.doCnd_itm_flg_NC(info);
		if (!getCndR().itm_flg()) {
			Cnd_itm_mfg_inst_flg.setValue(false);
			Cnd_mfg_act_flg.setValue(false);
			Cnd_odr_qty_flg.setValue(false);
		}
	}

	@Override
	public void doCnd_itm_mfg_inst_flg_NC(MCEventInfo info) {
		super.doCnd_itm_mfg_inst_flg_NC(info);
		if (getCndR().itm_mfg_inst_flg()) {
			Cnd_itm_flg.setValue(true);
		}
	}

	@Override
	public void doCnd_mfg_act_flg_NC(MCEventInfo info) {
		super.doCnd_mfg_act_flg_NC(info);
		if (getCndR().mfg_act_flg()) {
			Cnd_itm_flg.setValue(true);
		}
	}

	@Override
	public void doCnd_odr_qty_flg_NC(MCEventInfo info) {
		super.doCnd_odr_qty_flg_NC(info);
		if (getCndR().odr_qty_flg() == true) {
			Cnd_itm_flg.setValue(true);
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
	public void doLPnl_disp_std_NC(MCEventInfo info) {
		super.doLPnl_disp_std_NC(info);

		doDispStdCng();

		RsltTable.adjustWidth();
	}
	protected void doDispStdCng() {
		if (_cndR == null) {
			_cndR = getCndR().clone();
		}
		setColModeByFlg(columnRslt_out_diff, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_out_unit_gap, getLPnlR().disp_std() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_std_out_unit, getLPnlR().disp_std() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_out_unit, _cndR.itm_flg());
		setColModeByFlg(columnRslt_purc_upri_gap, getLPnlR().disp_std() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_std_purc_upri, getLPnlR().disp_std() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_std_out_amt, getLPnlR().disp_std() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_out_amt, _cndR.itm_flg());
		setColModeByFlg(columnRslt_purc_amt_gap, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_purc_amt, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_upri_diff, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_trd_upri_gap, getLPnlR().disp_std() && _cndR.trd_cur_flg() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_std_trd_upri, getLPnlR().disp_std() && _cndR.trd_cur_flg() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_trd_upri, _cndR.trd_cur_flg() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_trd_amt_gap, getLPnlR().disp_std() && _cndR.trd_cur_flg());
		setColModeByFlg(columnRslt_std_trd_amt, getLPnlR().disp_std() && _cndR.trd_cur_flg());
		setColModeByFlg(columnRslt_rate_diff, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_xrate_gap, getLPnlR().disp_std() && _cndR.xrate_flg());
		setColModeByFlg(columnRslt_std_xrate, getLPnlR().disp_std() && _cndR.xrate_flg());
		setColModeByFlg(columnRslt_purc_cost_gap, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_purc_cost, getLPnlR().disp_std());

		setColModeByFlg(columnDispDtl_diff_up, getLPnlR().disp_std());
		setColModeByFlg(columnDispDtl_inpt_unit_gap, getLPnlR().disp_std());
		setColModeByFlg(columnDispDtl_std_inpt_unit, getLPnlR().disp_std());
		setColModeByFlg(columnDispDtl_inpt_unit, getLPnlR().disp_std());
		setColModeByFlg(columnDispDtl_std_cost, getLPnlR().disp_std());
		setColModeByFlg(columnDispDtl_so_std_amt, getLPnlR().disp_std());

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
		setTabMode();
		setTtlMode();
		clearInvalidCnds();
		setCndMode();

		doDispStdCng();
		setBtnMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		doDispStdCng();
		RsltTable.selectLeftmostColumn(0);
	}

	protected void setTabMode() {
		if (Cnd_ope_ITM.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab4Panel, Tab5Panel);
		}
		else if (Cnd_ope_BP.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab3Panel, Tab4Panel, Tab5Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel, Tab4Panel, Tab5Panel);
		}
	}

	protected void setTtlMode() {
		if (Cnd_ope_DTL.isSelected()) {
			Cnd_itm_flg.setValue(true);
			Cnd_itm_typ_flg.setValue(true);
			Cnd_itm_typ_d_flg.setValue(true);
			Cnd_itm_jnl_flg.setValue(true);
			Cnd_itm_mfg_inst_flg.setValue(true);
			Cnd_mfg_act_flg.setValue(true);
			Cnd_itm_flg.setMode(MCMode.READ_ONLY);
			Cnd_itm_typ_flg.setMode(MCMode.READ_ONLY);
			Cnd_itm_typ_d_flg.setMode(MCMode.READ_ONLY);
			Cnd_itm_jnl_flg.setMode(MCMode.READ_ONLY);
			Cnd_itm_mfg_inst_flg.setMode(MCMode.READ_ONLY);
			Cnd_mfg_act_flg.setMode(MCMode.READ_ONLY);

			setDefaultMode(Cnd_lot_flg);
			setDefaultMode(Cnd_sublot_flg);
			setDefaultMode(Cnd_sno1_flg);
			setDefaultMode(Cnd_sno2_flg);
			setDefaultMode(Cnd_sno3_flg);
			setDefaultMode(Cnd_sno4_flg);
			setDefaultMode(Cnd_asst_typ_flg);
			setDefaultMode(Cnd_bp_flg);
		}
		else {
			setDefaultMode(Cnd_itm_flg);
			setDefaultMode(Cnd_itm_typ_flg);
			setDefaultMode(Cnd_itm_typ_d_flg);
			setDefaultMode(Cnd_itm_mfg_inst_flg);
			setDefaultMode(Cnd_mfg_act_flg);

			Cnd_lot_flg.setValue(false);
			Cnd_sublot_flg.setValue(false);
			Cnd_sno1_flg.setValue(false);
			Cnd_sno2_flg.setValue(false);
			Cnd_sno3_flg.setValue(false);
			Cnd_sno4_flg.setValue(false);
			Cnd_asst_typ_flg.setValue(false);
			Cnd_lot_flg.setMode(MCMode.READ_ONLY);
			Cnd_sublot_flg.setMode(MCMode.READ_ONLY);
			Cnd_sno1_flg.setMode(MCMode.READ_ONLY);
			Cnd_sno2_flg.setMode(MCMode.READ_ONLY);
			Cnd_sno3_flg.setMode(MCMode.READ_ONLY);
			Cnd_sno4_flg.setMode(MCMode.READ_ONLY);
			Cnd_asst_typ_flg.setMode(MCMode.READ_ONLY);

			if (Cnd_ope_ITM.isSelected()) {
				Cnd_itm_flg.setValue(true);
				Cnd_itm_typ_flg.setValue(true);
				Cnd_itm_typ_d_flg.setValue(true);
				Cnd_itm_jnl_flg.setValue(true);
				Cnd_itm_flg.setMode(MCMode.READ_ONLY);
				Cnd_itm_typ_flg.setMode(MCMode.READ_ONLY);
				Cnd_itm_typ_d_flg.setMode(MCMode.READ_ONLY);
				Cnd_itm_jnl_flg.setMode(MCMode.READ_ONLY);
				setDefaultMode(Cnd_bp_flg);
			}
			else {
				Cnd_bp_flg.setValue(true);
				Cnd_bp_flg.setMode(MCMode.READ_ONLY);
				setDefaultMode(Cnd_itm_flg);
				setDefaultMode(Cnd_itm_typ_flg);
				setDefaultMode(Cnd_itm_typ_d_flg);
			}
		}
	}

	protected void setCndMode() {
		if (Cnd_ope_DTL.isSelected()) {
			setDefaultMode(Cnd_itm_cd);
			setDefaultMode(Cnd_itm_sub1);
			setDefaultMode(Cnd_itm_sub2);
			setDefaultMode(Cnd_itm_sub3);
			setDefaultMode(Cnd_itm_nm);
			setDefaultMode(Cnd_itm_typ);
			setDefaultMode(Cnd_itm_typ_d_cd);
			setDefaultMode(Cnd_itm_typ_d_nm);
			setDefaultMode(Cnd_itm_jnl_cd);
			setDefaultMode(Cnd_itm_jnl_nm);

			setDefaultMode(Cnd_bp_cd);
			setDefaultMode(Cnd_bp_nm);
			setDefaultMode(Cnd_cntry_cd);
			setDefaultMode(Cnd_cntry_nm);
			setDefaultMode(Cnd_area_cd);
			setDefaultMode(Cnd_area_nm);

			setDefaultMode(Cnd_lot_no);
			setDefaultMode(Cnd_sublot_no);
			setDefaultMode(Cnd_sno1);
			setDefaultMode(Cnd_sno2);
			setDefaultMode(Cnd_sno3);
			setDefaultMode(Cnd_sno4);

			setDefaultMode(Cnd_mng_dpt_cd);
			setDefaultMode(Cnd_mng_dpt_nm);
			setDefaultMode(Cnd_asst_typ);
			setDefaultMode(Cnd_itm_mfg_inst_no);
			setDefaultMode(Cnd_mfg_act_no);
			setDefaultMode(Cnd_po_no);
			setDefaultMode(Cnd_no_po_no_flg);
			setDefaultMode(Cnd_slo_no);
			setDefaultMode(Cnd_no_slo_no_flg);
			setDefaultMode(Cnd_iv_no);
			setDefaultMode(Cnd_no_iv_no_flg);
		}
		else if (Cnd_ope_ITM.isSelected()) {
			setDefaultMode(Cnd_itm_cd);
			setDefaultMode(Cnd_itm_sub1);
			setDefaultMode(Cnd_itm_sub2);
			setDefaultMode(Cnd_itm_sub3);
			setDefaultMode(Cnd_itm_nm);
			setDefaultMode(Cnd_itm_typ);
			setDefaultMode(Cnd_itm_typ_d_cd);
			setDefaultMode(Cnd_itm_typ_d_nm);
			setDefaultMode(Cnd_itm_jnl_cd);
			setDefaultMode(Cnd_itm_jnl_nm);

			Cnd_bp_cd.setMode(MCMode.READ_ONLY);
			Cnd_bp_nm.setMode(MCMode.READ_ONLY);
			Cnd_cntry_cd.setMode(MCMode.READ_ONLY);
			Cnd_cntry_nm.setMode(MCMode.READ_ONLY);
			Cnd_area_cd.setMode(MCMode.READ_ONLY);
			Cnd_area_nm.setMode(MCMode.READ_ONLY);

			Cnd_lot_no.setMode(MCMode.READ_ONLY);
			Cnd_sublot_no.setMode(MCMode.READ_ONLY);
			Cnd_sno1.setMode(MCMode.READ_ONLY);
			Cnd_sno2.setMode(MCMode.READ_ONLY);
			Cnd_sno3.setMode(MCMode.READ_ONLY);
			Cnd_sno4.setMode(MCMode.READ_ONLY);

			Cnd_mng_dpt_cd.setMode(MCMode.READ_ONLY);
			Cnd_mng_dpt_nm.setMode(MCMode.READ_ONLY);
			Cnd_asst_typ.setMode(MCMode.READ_ONLY);
			Cnd_itm_mfg_inst_no.setMode(MCMode.READ_ONLY);
			Cnd_mfg_act_no.setMode(MCMode.READ_ONLY);
			Cnd_po_no.setMode(MCMode.READ_ONLY);
			Cnd_no_po_no_flg.setMode(MCMode.READ_ONLY);
			Cnd_slo_no.setMode(MCMode.READ_ONLY);
			Cnd_no_slo_no_flg.setMode(MCMode.READ_ONLY);
			Cnd_iv_no.setMode(MCMode.READ_ONLY);
			Cnd_no_iv_no_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_itm_cd.setMode(MCMode.READ_ONLY);
			Cnd_itm_sub1.setMode(MCMode.READ_ONLY);
			Cnd_itm_sub2.setMode(MCMode.READ_ONLY);
			Cnd_itm_sub3.setMode(MCMode.READ_ONLY);
			Cnd_itm_nm.setMode(MCMode.READ_ONLY);
			Cnd_itm_typ.setMode(MCMode.READ_ONLY);
			Cnd_itm_typ_d_cd.setMode(MCMode.READ_ONLY);
			Cnd_itm_typ_d_nm.setMode(MCMode.READ_ONLY);
			Cnd_itm_jnl_cd.setMode(MCMode.READ_ONLY);
			Cnd_itm_jnl_nm.setMode(MCMode.READ_ONLY);

			setDefaultMode(Cnd_bp_cd);
			setDefaultMode(Cnd_bp_nm);
			setDefaultMode(Cnd_cntry_cd);
			setDefaultMode(Cnd_cntry_nm);
			setDefaultMode(Cnd_area_cd);
			setDefaultMode(Cnd_area_nm);

			Cnd_lot_no.setMode(MCMode.READ_ONLY);
			Cnd_sublot_no.setMode(MCMode.READ_ONLY);
			Cnd_sno1.setMode(MCMode.READ_ONLY);
			Cnd_sno2.setMode(MCMode.READ_ONLY);
			Cnd_sno3.setMode(MCMode.READ_ONLY);
			Cnd_sno4.setMode(MCMode.READ_ONLY);

			Cnd_mng_dpt_cd.setMode(MCMode.READ_ONLY);
			Cnd_mng_dpt_nm.setMode(MCMode.READ_ONLY);
			Cnd_asst_typ.setMode(MCMode.READ_ONLY);
			Cnd_itm_mfg_inst_no.setMode(MCMode.READ_ONLY);
			Cnd_mfg_act_no.setMode(MCMode.READ_ONLY);
			Cnd_po_no.setMode(MCMode.READ_ONLY);
			Cnd_no_po_no_flg.setMode(MCMode.READ_ONLY);
			Cnd_slo_no.setMode(MCMode.READ_ONLY);
			Cnd_no_slo_no_flg.setMode(MCMode.READ_ONLY);
			Cnd_iv_no.setMode(MCMode.READ_ONLY);
			Cnd_no_iv_no_flg.setMode(MCMode.READ_ONLY);
		}
	}

	protected void clearInvalidCnds() {
		if (Cnd_ope_DTL.isSelected()) {
			// N.A.
		}
		else if (Cnd_ope_ITM.isSelected()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_cntry_cd, null);
			setValueEx(Cnd_area_cd, null);

			setValueEx(Cnd_lot_no, null);
			setValueEx(Cnd_sublot_no, null);
			setValueEx(Cnd_sno1, null);
			setValueEx(Cnd_sno2, null);
			setValueEx(Cnd_sno3, null);
			setValueEx(Cnd_sno4, null);

			setValueEx(Cnd_mng_dpt_cd, null);
			setValueEx(Cnd_asst_typ, null);
			setValueEx(Cnd_itm_mfg_inst_no, null);
			setValueEx(Cnd_mfg_act_no, null);
			setValueEx(Cnd_po_no, null);
			setValueEx(Cnd_no_po_no_flg, false);
			setValueEx(Cnd_slo_no, null);
			setValueEx(Cnd_no_slo_no_flg, false);
			setValueEx(Cnd_iv_no, null);
			setValueEx(Cnd_no_iv_no_flg, false);

			setValueEx(Cnd_bp_grp_cd1, null);
			setValueEx(Cnd_bp_grp_cd2, null);
			setValueEx(Cnd_bp_grp_cd3, null);
			setValueEx(Cnd_bp_grp_cd4, null);
			setValueEx(Cnd_bp_grp_cd5, null);
			setValueEx(Cnd_bp_grp_cd6, null);
			setValueEx(Cnd_bp_grp_cd7, null);
			setValueEx(Cnd_bp_grp_cd8, null);
			setValueEx(Cnd_bp_grp_cd9, null);
			setValueEx(Cnd_bp_grp_cd10, null);
		}
		else {
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_itm_typ, null);
			setValueEx(Cnd_itm_typ_d_cd, null);
			setValueEx(Cnd_itm_jnl_cd, null);

			setValueEx(Cnd_lot_no, null);
			setValueEx(Cnd_sublot_no, null);
			setValueEx(Cnd_sno1, null);
			setValueEx(Cnd_sno2, null);
			setValueEx(Cnd_sno3, null);
			setValueEx(Cnd_sno4, null);

			setValueEx(Cnd_mng_dpt_cd, null);
			setValueEx(Cnd_asst_typ, null);
			setValueEx(Cnd_itm_mfg_inst_no, null);
			setValueEx(Cnd_mfg_act_no, null);
			setValueEx(Cnd_po_no, null);
			setValueEx(Cnd_no_po_no_flg, false);
			setValueEx(Cnd_slo_no, null);
			setValueEx(Cnd_no_slo_no_flg, false);
			setValueEx(Cnd_iv_no, null);
			setValueEx(Cnd_no_iv_no_flg, false);

			setValueEx(Cnd_itm_grp_cd1, null);
			setValueEx(Cnd_itm_grp_cd2, null);
			setValueEx(Cnd_itm_grp_cd3, null);
			setValueEx(Cnd_itm_grp_cd4, null);
			setValueEx(Cnd_itm_grp_cd5, null);
			setValueEx(Cnd_itm_grp_cd6, null);
			setValueEx(Cnd_itm_grp_cd7, null);
			setValueEx(Cnd_itm_grp_cd8, null);
			setValueEx(Cnd_itm_grp_cd9, null);
			setValueEx(Cnd_itm_grp_cd10, null);
		}
	}

	/**
	 * 画面遷移ボタンの押下モードの設定
	 */
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		setBtnModeByFlg(Btn_open_MGBFP0100, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0060, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0150, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0270, isEnableBtn_open(r));
	}

	protected boolean isEnableBtn_open(RsltR r) {
		if (isNull(r) || isNull(r.itm_cd())) {
			return false;
		}
		return true;
	}

	// セルコンフィグ////////////////////////////////

	protected TableCellConfig createTableCellConfig() {
		return new TableCellConfig();
	}

	protected class TableCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (table.getBaseTable() == RsltTable) {
				if (isSame(index + 1, getRsltL().size())) {
					return _vTtlColor;
				}
			}
			else {
				if (isSame(index + 1, getDispDtlL().size())) {
					return _vTtlColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

}