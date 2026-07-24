package mcframe.clientMGBF.MGBFP0060;

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
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_InOutCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_InOutCostSrch_MC extends MGBFP_InOutCostSrch_MC_A {

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
	public MGBFP_InOutCostSrch_MC() {
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
	public MGBFP_InOutCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0060_Srch01Caller<P extends MGBFP_InOutCostSrch, B extends MG_MGBFL0060_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0060_Srch01Caller(P p, B b) {
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
			showDtl();
		}
		
		protected void showDtl() {
			RsltR ttlR = createTtlRow();
			calcTtl2(ttlR);
			// 合計行を保持
			_sumRow = ttlR;
			// 合計表示
			if (getCndR().disp_ttl()) {
				getRsltL().add(_sumRow);
			}
		}
		
		protected RsltR createTtlRow() {
			RsltR r = RsltR.create();
			r.cost_diff(0);
			r.std_cost(0);
			r.std_profit(0);
			r.std_amt(0);
			r.profit(0);
			r.amt(0);
			r.ttl(0);
			r.var(0);
			r.fxd(0);
			for (String s : _cc.getViewColumns()) {
				r.setValueNE(s, MCNumber.ZERO);
			}
			return r;
		}

		protected void calcTtl2(RsltR ttlR) {
			ttlR.cost_diff(getRsltL().sum(RsltR.$cost_diff));
			ttlR.std_cost(getRsltL().sum(RsltR.$std_cost));
			ttlR.std_profit(getRsltL().sum(RsltR.$std_profit));
			ttlR.std_amt(getRsltL().sum(RsltR.$std_amt));
			ttlR.profit(getRsltL().sum(RsltR.$profit));
			ttlR.amt(getRsltL().sum(RsltR.$amt));
			ttlR.ttl(getRsltL().sum(RsltR.$ttl));
			ttlR.var(getRsltL().sum(RsltR.$var));
			ttlR.fxd(getRsltL().sum(RsltR.$fxd));
			for (String s : _cc.getViewColumns()) {
				ttlR.setValueNE(s, getRsltL().sum(s));
			}
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
		callMG_MGBFL0060_Srch01();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MGBFP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0160(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0160(r);
	}
	
	protected void doBtn_open_MGBFP0160(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0160");
		mcframe.clientMGBF.MGBFP0160.CndR to = mcframe.clientMGBF.MGBFP0160.CndR.create();
		
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.trd_grp(r.trd_grp());
		
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
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
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
		_cc.setExpns(getCustomExpnsL(), Cnd_disp_expns, Cnd_disp_expns_grp);
	}
	
	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ()) || MAC_EXPNS_TYP.isSPPL(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}
	
	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (getCndR().disp_ttl()) {
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
		cc.putColumnBG(columnRslt_std_amt, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_cost_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_std_profit, getStdUpriColor(this));
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
			if (index == getRsltL().size() - 1 && getCndR().disp_ttl()) {
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
		setValueEx(Cnd_ac_slip_typ_flg, true);
		setValueEx(Cnd_ac_rsn_flg, true);
		setValueEx(Cnd_disp_expns, true);
		setValueEx(Cnd_disp_expns_grp, true);
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
	
	protected boolean isEnableBtn_open_MGBFP0160(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.trd_grp());
	}
	
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		setBtnModeByFlg(Btn_open_MGBFP0160, isEnableBtn_open_MGBFP0160(r));
	}
	
	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
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
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);
		if (getCndR().no_bp_flg()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}
	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		super.doCnd_bp_cd_LC(info);
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
	public void doCnd_no_stk_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_stk_bp_flg_NC(info);
		if (getCndR().no_stk_bp_flg()) {
			setValueEx(Cnd_stk_bp_cd, null);
			setValueEx(Cnd_stk_bp_nm, null);
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
	public void doCnd_asst_typ_LC(MCEventInfo info) {
		super.doCnd_asst_typ_LC(info);
		if (!isNull((String) info.getNewValue())) {
			setValueEx(Cnd_except_other_flg, false);
		}
	}

	@Override
	public void doCnd_except_other_flg_NC(MCEventInfo info) {
		super.doCnd_except_other_flg_NC(info);
		if ((Boolean) info.getNewValue()) {
			setValueEx(Cnd_asst_typ, null);
		}
	}
	
	@Override
	public void doCnd_disp_std_NC(MCEventInfo info) {
		super.doCnd_disp_std_NC(info);
		_cc.displayColumn();
		displayStdAmtColumn();
		RsltTable.adjustWidth();
	}
	
	@Override
	public void doCnd_disp_amt_NC(MCEventInfo info) {
		super.doCnd_disp_amt_NC(info);
		_cc.displayColumn();
		displayStdAmtColumn();
		RsltTable.adjustWidth();
	}
	
	@Override
	public void doCnd_disp_ttl_NC(MCEventInfo info) {
		super.doCnd_disp_ttl_NC(info);
		displaySumRow();
		RsltTable.adjustWidth();
	}
	
	protected void displaySumRow() {

		if (getRsltL().size() > 0) {
			if (getCndR().disp_ttl()) {
				getRsltL().add(_sumRow);
			}
			else {
				getRsltL().remove(getRsltL().size() - 1);
			}
		}
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MGBFP0160(r)) {
				doBtn_open_MGBFP0160(r);
			}
		}
	}
	
	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		getCndR().std_and_itm_flg(getCndR().itm_flg() && getCndR().disp_std());
		getCndR().std_flg(getCndR().disp_std());
		getCndR().amt_flg(getCndR().disp_amt());
		getCndR().amt_and_std_flg(getCndR().disp_amt() && getCndR().disp_std());
		
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		displayStdAmtColumn();
	}

	// 標準表示・単価表示で表示制御する項目
	protected void displayStdAmtColumn() {

		// 金額表示で制御
		setColModeByFlg(columnRslt_amt, getCndR().disp_amt());
		setColModeByFlg(columnRslt_profit, getCndR().disp_amt());

		// 標準表示と集計品目フラグ
		setColModeByFlg(columnRslt_upri_diff, getCndR().disp_std() && _cndR.itm_flg() && _cndR.wg_flg());
		setColModeByFlg(columnRslt_std_upri, getCndR().disp_std() && _cndR.itm_flg() && _cndR.wg_flg());

		// 標準表示でフラグ
		setColModeByFlg(columnRslt_std_cost, getCndR().disp_std());
		setColModeByFlg(columnRslt_cost_diff, getCndR().disp_std());

		// 標準表示と金額表示
		setColModeByFlg(columnRslt_std_amt, getCndR().disp_std() && getCndR().disp_amt());
		setColModeByFlg(columnRslt_std_profit, getCndR().disp_std() && getCndR().disp_amt());
	}

}