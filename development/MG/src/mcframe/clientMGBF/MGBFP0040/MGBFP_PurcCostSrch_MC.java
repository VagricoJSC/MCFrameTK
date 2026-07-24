package mcframe.clientMGBF.MGBFP0040;

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
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_PurcCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_PurcCostSrch_MC extends MGBFP_PurcCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	// 合計行
	protected RsltR _sumRow = null;

	// 合計行の色
	protected Color _ttlColor = getVTtlColor(this);

	// 検索時の検索条件
	protected CndR _cndR = CndR.create();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_PurcCostSrch_MC() {
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
	public MGBFP_PurcCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0040_Srch01Caller<P extends MGBFP_PurcCostSrch, B extends MG_MGBFL0040_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0040_Srch01Caller(P p, B b) {
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
		protected void showReplaceSub() {
			super.showReplaceSub();

			// 合計行を保持
			_sumRow = getRsltL().get(getRsltL().size() - 1);
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
		callMG_MGBFL0040_Srch01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);

		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_cur_upri_diff_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_upri_dec_place);
		Rslt_cur_std_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_upri_dec_place);
		Rslt_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_upri_dec_place);

		Rslt_cur_amt_diff_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_amt_dec_place);
		Rslt_cur_std_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd,
				columnRslt_trd_cur_amt_dec_place);
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

		cc.putColumnBG(columnRslt_purc_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_purc_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_purc_amt_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_amt_upri_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_amt_rate_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_amt, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_amt_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_xrate_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_xrate, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_cur_upri_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_cur_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_cur_amt_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_cur_std_amt, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_upri_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_cost, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_var, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_fxd, getVarFxdColor(this));

		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	public class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (index == getRsltL().size() - 1) {
				return _ttlColor;
			}

			return super.getPriorBG(index, column, table, mode);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_sppl_flg, true);
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

		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		displayColumn();

		RsltTable.selectLeftmostColumn(0);
	}

	// -----------------------------------------------
	// Event
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
	public void doCnd_po_no_LC(MCEventInfo info) {
		super.doCnd_po_no_LC(info);

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
		super.doCnd_slo_no_LC(info);

		if (!isNull(getCndR().slo_no())) {
			setValueEx(Cnd_no_slo_no_flg, false);
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
	public void doLPnl_disp_std_NC(MCEventInfo info) {
		super.doLPnl_disp_std_NC(info);

		_cc.displayColumn();
		displayStdColumn();

		RsltTable.adjustWidth();
	}

	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		getCndR().std_and_itm_flg(getCndR().itm_flg() && getLPnlR().disp_std());
		getCndR().std_and_itm_and_cur_flg(
				getCndR().itm_flg() && getCndR().trd_cur_flg() && getLPnlR().disp_std());
		getCndR().itm_and_cur_flg(getCndR().itm_flg() && getCndR().trd_cur_flg());
		getCndR().std_and_cur_flg(getCndR().trd_cur_flg() && getLPnlR().disp_std());
		getCndR().std_and_xrate_flg(getCndR().xrate_flg() && getLPnlR().disp_std());
		getCndR().std_flg(getLPnlR().disp_std());

		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);

		_cc.displayColumn();
		displayStdColumn();
	}

	// 標準表示・単価表示で表示制御する項目
	protected void displayStdColumn() {

		// 標準表示のみで制御
		setColModeByFlg(columnRslt_purc_amt_diff, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_amt, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_amt_diff, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_cost, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_amt_upri_diff, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_amt_rate_diff, getLPnlR().disp_std());

		// 標準表示と集計品目フラグ
		setColModeByFlg(columnRslt_purc_diff, getLPnlR().disp_std() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_std_purc_upri,
				getLPnlR().disp_std() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_upri_diff, getLPnlR().disp_std() && _cndR.wg_flg() && _cndR.itm_flg());
		setColModeByFlg(columnRslt_std_upri, getLPnlR().disp_std() && _cndR.wg_flg() && _cndR.itm_flg());

		// 標準表示と集計為替レートフラグ
		setColModeByFlg(columnRslt_xrate_diff,
				getLPnlR().disp_std() && _cndR.xrate_flg());
		setColModeByFlg(columnRslt_std_xrate, getLPnlR().disp_std() && _cndR.xrate_flg());
		setColModeByFlg(columnRslt_cur_amt_diff,
				getLPnlR().disp_std() && _cndR.xrate_flg());

		// 標準表示と集計取引通貨フラグ
		setColModeByFlg(columnRslt_cur_std_amt,
				getLPnlR().disp_std() && _cndR.trd_cur_flg());

		// 標準表示と集計品目フラグと集計取引通貨フラグ
		setColModeByFlg(columnRslt_cur_upri_diff,
				getLPnlR().disp_std() && _cndR.itm_flg() && _cndR.trd_cur_flg());
		setColModeByFlg(columnRslt_cur_std_upri,
				getLPnlR().disp_std() && _cndR.itm_flg() && _cndR.trd_cur_flg());

		// 集計品目フラグと集計取引通貨フラグ
		setColModeByFlg(columnRslt_cur_upri, _cndR.itm_flg() && _cndR.trd_cur_flg());
	}

}