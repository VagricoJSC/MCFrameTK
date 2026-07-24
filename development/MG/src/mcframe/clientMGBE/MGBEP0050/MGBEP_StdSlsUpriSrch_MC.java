package mcframe.clientMGBE.MGBEP0050;

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
 * 画面"MGBEP_StdSlsUpriSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_StdSlsUpriSrch_MC extends MGBEP_StdSlsUpriSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	
	// 検索時の検索条件
	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdSlsUpriSrch_MC() {
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
	public MGBEP_StdSlsUpriSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0050_Srch01Caller<P extends MGBEP_StdSlsUpriSrch, B extends MG_MGBEL0050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0050_Srch01Caller(P p, B b) {
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
			
			for (RsltR row : bridge.down0()) {
				calcUnitElm(row);
			}
		}
		
		protected void calcUnitElm(RsltR row) {
			_cc.calcUnit(row, row.qty(), false);
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
		callMG_MGBEL0050_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBEP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0030(r);
	}
	protected void doBtn_open_MGBEP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0030");
		mcframe.clientMGBE.MGBEP0030.CndR to = mcframe.clientMGBE.MGBEP0030.CndR.create();
		
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBEP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0040(r);
	}
	protected void doBtn_open_MGBEP0040(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0040");
		mcframe.clientMGBE.MGBEP0040.CndR to = mcframe.clientMGBE.MGBEP0040.CndR.create();
		
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0010(r);
	}
	protected void doBtn_open_MGBEP0010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0010");
		mcframe.clientMGBE.MGBEP0010.CndR to = mcframe.clientMGBE.MGBEP0010.CndR.create();
		
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBEP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0060(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0060(r);
	}
	protected void doBtn_open_MGBEP0060(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0060");
		mcframe.clientMGBE.MGBEP0060.CndR to = mcframe.clientMGBE.MGBEP0060.CndR.create();
		
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		if (_cndR.dpt_flg()) {
			if (isNull(r.dpt_cd())) {
				to.no_dpt_flg(true);
			}
			else {
				to.dpt_cd(r.dpt_cd());
				to.dpt_nm(r.dpt_nm());
			}
		}
		if (_cndR.cst_flg()) {
			if (isNull(r.cst_cd())) {
				to.no_cst_flg(true);
			}
			else {
				to.cst_cd(r.cst_cd());
			}
		}
		if (_cndR.dlv_flg()) {
			if (isNull(r.dlv_cd())) {
				to.no_dlv_flg(true);
			}
			else {
				to.dlv_cd(r.dlv_cd());
			}
		}
		if (_cndR.dest1_flg()) {
			if (isNull(r.dest_cd1())) {
				to.no_dest1_flg(true);
			}
			else {
				to.dest_cd1(r.dest_cd1());
			}
		}
		if (_cndR.dest2_flg()) {
			if (isNull(r.dest_cd2())) {
				to.no_dest2_flg(true);
			}
			else {
				to.dest_cd2(r.dest_cd2());
			}
		}
		if (_cndR.dest3_flg()) {
			if (isNull(r.dest_cd3())) {
				to.no_dest3_flg(true);
			}
			else {
				to.dest_cd3(r.dest_cd3());
			}
		}
		to.expns_typ(MAC_EXPNS_TYP.SGA.value());
		
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBE.MGBEP0060.CndR.$no_dpt_flg);
		list.add(mcframe.clientMGBE.MGBEP0060.CndR.$no_cst_flg);
		list.add(mcframe.clientMGBE.MGBEP0060.CndR.$no_dlv_flg);
		list.add(mcframe.clientMGBE.MGBEP0060.CndR.$no_dest1_flg);
		list.add(mcframe.clientMGBE.MGBEP0060.CndR.$no_dest2_flg);
		list.add(mcframe.clientMGBE.MGBEP0060.CndR.$no_dest3_flg);
		
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
		
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_unit_dec_place);
		Rslt_qty_unit_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_unit_dec_place);
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
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp, LPnl_disp_unit);
	}
	
	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ()) ||
				MAC_EXPNS_TYP.isSGA(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}
	
	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();

		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color expnsGBgColor = getExpnsGSubTtlColor(this);
		Color allTtlColor = getAllTtlColor(this);
		Color slsProfitColor = getProfitColor(this);
		Color slsVarFxdColor = getProfitColor(this);
		Color slsCostColor = getSlsCostColor(this);
		
		cc.putColumnBG(RsltTable.getColumnConfigs(), expnsSrchRsltColor);
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), expnsGBgColor);
		
		cc.putColumnBG(columnRslt_ttl, allTtlColor);
		cc.putColumnBG(columnRslt_lmt_prf, slsProfitColor);
		cc.putColumnBG(columnRslt_lmt_prf_per, slsProfitColor);
		cc.putColumnBG(columnRslt_var_cost, slsVarFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost, slsVarFxdColor);
		cc.putColumnBG(columnRslt_sls_cost, slsCostColor);
		cc.putColumnBG(columnRslt_sga, slsCostColor);
		cc.putColumnBG(columnRslt_ttl_unit, allTtlColor);
		cc.putColumnBG(columnRslt_lmt_prf_unit, slsProfitColor);
		cc.putColumnBG(columnRslt_var_cost_unit, slsVarFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost_unit, slsVarFxdColor);
		cc.putColumnBG(columnRslt_sls_cost_unit, slsCostColor);
		cc.putColumnBG(columnRslt_sga_unit, slsCostColor);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_cst_flg, true);
		setValueEx(Cnd_dlv_flg, true);
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
		setBtnModeByFlg(Btn_open_MGBEP0030, isEnableBtn_open_MGBEP0030(r));
		setBtnModeByFlg(Btn_open_MGBEP0040, isEnableBtn_open_MGBEP0040(r));
		setBtnModeByFlg(Btn_open_MGBEP0010, isEnableBtn_open_MGBEP0010(r));
		setBtnModeByFlg(Btn_open_MGBEP0060, isEnableBtn_open_MGBEP0060(r));
	}
	
	/**
	 * 標準内訳照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0030(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	/**
	 * 標準単価詳細画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	/**
	 * 標準単価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0010(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	/**
	 * 標準配賦額一覧照会照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0060(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
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
			if (isEnableBtn_open_MGBEP0030(r)) {
				doBtn_open_MGBEP0030(r);
			}
		}
	}
	
	@Override
	public void doCnd_no_dpt_flg_NC(MCEventInfo info) {
		super.doCnd_no_dpt_flg_NC(info);
		if (getCndR().no_dpt_flg()) {
			setValueEx(Cnd_dpt_cd, null);
			setValueEx(Cnd_dpt_nm, null);
		}
	}
	@Override
	public void doCnd_dpt_cd_LC(MCEventInfo info) {
		super.doCnd_dpt_cd_LC(info);
		if (!isNull(getCndR().dpt_cd())) {
			setValueEx(Cnd_no_dpt_flg, false);
		}
	}
	@Override
	public void doCnd_dpt_nm_LC(MCEventInfo info) {
		super.doCnd_dpt_nm_LC(info);
		if (!isNull(getCndR().dpt_nm())) {
			setValueEx(Cnd_no_dpt_flg, false);
		}
	}
	
	@Override
	public void doCnd_no_cst_flg_NC(MCEventInfo info) {
		super.doCnd_no_cst_flg_NC(info);
		if (getCndR().no_cst_flg()) {
			setValueEx(Cnd_cst_cd, null);
			setValueEx(Cnd_cst_nm, null);
		}
	}
	@Override
	public void doCnd_cst_cd_LC(MCEventInfo info) {
		super.doCnd_cst_cd_LC(info);
		if (!isNull(getCndR().cst_cd())) {
			setValueEx(Cnd_no_cst_flg, false);
		}
	}
	@Override
	public void doCnd_cst_nm_LC(MCEventInfo info) {
		super.doCnd_cst_nm_LC(info);
		if (!isNull(getCndR().cst_nm())) {
			setValueEx(Cnd_no_cst_flg, false);
		}
	}
	
	@Override
	public void doCnd_no_dlv_flg_NC(MCEventInfo info) {
		super.doCnd_no_dlv_flg_NC(info);
		if (getCndR().no_dlv_flg()) {
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_dlv_nm, null);
		}
	}
	@Override
	public void doCnd_dlv_cd_LC(MCEventInfo info) {
		super.doCnd_dlv_cd_LC(info);
		if (!isNull(getCndR().dlv_cd())) {
			setValueEx(Cnd_no_dlv_flg, false);
		}
	}
	@Override
	public void doCnd_dlv_nm_LC(MCEventInfo info) {
		super.doCnd_dlv_nm_LC(info);
		if (!isNull(getCndR().dlv_nm())) {
			setValueEx(Cnd_no_dlv_flg, false);
		}
	}
	
	@Override
	public void doCnd_no_dest1_flg_NC(MCEventInfo info) {
		super.doCnd_no_dest1_flg_NC(info);
		if (getCndR().no_dest1_flg()) {
			setValueEx(Cnd_dest_cd1, null);
			setValueEx(Cnd_dest_nm1, null);
		}
	}
	@Override
	public void doCnd_dest_cd1_LC(MCEventInfo info) {
		super.doCnd_dest_cd1_LC(info);
		if (!isNull(getCndR().dest_cd1())) {
			setValueEx(Cnd_no_dest1_flg, false);
		}
	}
	@Override
	public void doCnd_dest_nm1_LC(MCEventInfo info) {
		super.doCnd_dest_nm1_LC(info);
		if (!isNull(getCndR().dest_nm1())) {
			setValueEx(Cnd_no_dest1_flg, false);
		}
	}
	
	@Override
	public void doCnd_no_dest2_flg_NC(MCEventInfo info) {
		super.doCnd_no_dest2_flg_NC(info);
		if (getCndR().no_dest2_flg()) {
			setValueEx(Cnd_dest_cd2, null);
			setValueEx(Cnd_dest_nm2, null);
		}
	}
	@Override
	public void doCnd_dest_cd2_LC(MCEventInfo info) {
		super.doCnd_dest_cd2_LC(info);
		if (!isNull(getCndR().dest_cd2())) {
			setValueEx(Cnd_no_dest2_flg, false);
		}
	}
	@Override
	public void doCnd_dest_nm2_LC(MCEventInfo info) {
		super.doCnd_dest_nm2_LC(info);
		if (!isNull(getCndR().dest_nm2())) {
			setValueEx(Cnd_no_dest2_flg, false);
		}
	}
	
	@Override
	public void doCnd_no_dest3_flg_NC(MCEventInfo info) {
		super.doCnd_no_dest3_flg_NC(info);
		if (getCndR().no_dest3_flg()) {
			setValueEx(Cnd_dest_cd3, null);
			setValueEx(Cnd_dest_nm3, null);
		}
	}
	@Override
	public void doCnd_dest_cd3_LC(MCEventInfo info) {
		super.doCnd_dest_cd3_LC(info);
		if (!isNull(getCndR().dest_cd3())) {
			setValueEx(Cnd_no_dest3_flg, false);
		}
	}
	@Override
	public void doCnd_dest_nm3_LC(MCEventInfo info) {
		super.doCnd_dest_nm3_LC(info);
		if (!isNull(getCndR().dest_nm3())) {
			setValueEx(Cnd_no_dest3_flg, false);
		}
	}
	
	@Override
	public void doLPnl_sls_cost_NC(MCEventInfo info) {
		super.doLPnl_sls_cost_NC(info);
		displaySlsCostColumn();
		RsltTable.adjustWidth();
	}
	
	@Override
	public void doLPnl_lmt_prf_NC(MCEventInfo info) {
		super.doLPnl_lmt_prf_NC(info);
		displayLmtPrfColumn();
		RsltTable.adjustWidth();
	}
	
	@Override
	public void doLPnl_disp_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_unit_NC(info);
		displayUnitColumn();
		displaySlsCostColumn();
		displayLmtPrfColumn();		
	}
	
	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		displayUnitColumn();
		displaySlsCostColumn();
		displayLmtPrfColumn();
	}
	
	protected void displayUnitColumn() {
		for (MCColumnConfig cc : new MCColumnConfig[] {
				columnRslt_qty,
				columnRslt_sls_upri,
				columnRslt_prf,
				columnRslt_ttl,
				}) {
			setColModeByFlg(cc, !getLPnlR().disp_unit());
		}
		for (MCColumnConfig cc : new MCColumnConfig[] {
				columnRslt_qty_unit,
				columnRslt_sls_upri_unit,
				columnRslt_prf_unit,
				columnRslt_ttl_unit,
				}) {
			setColModeByFlg(cc, getLPnlR().disp_unit());
		}
	}
	
	protected void displaySlsCostColumn() {
		setColModeByFlg(columnRslt_sls_prf_unit, getLPnlR().sls_cost() && getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_sls_cost_unit, getLPnlR().sls_cost() && getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_sga_unit, getLPnlR().sls_cost() && getLPnlR().disp_unit());
		
		setColModeByFlg(columnRslt_sls_prf, getLPnlR().sls_cost() && !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_sls_cost, getLPnlR().sls_cost() && !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_sga, getLPnlR().sls_cost() && !getLPnlR().disp_unit());
		
		setColModeByFlg(columnRslt_sls_prf_per, getLPnlR().sls_cost());
	}
	
	protected void displayLmtPrfColumn() {
		setColModeByFlg(columnRslt_lmt_prf_unit, getLPnlR().lmt_prf() && getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_var_cost_unit, getLPnlR().lmt_prf() && getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_fxd_cost_unit, getLPnlR().lmt_prf() && getLPnlR().disp_unit());
		
		setColModeByFlg(columnRslt_lmt_prf, getLPnlR().lmt_prf() && !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_var_cost, getLPnlR().lmt_prf() && !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_fxd_cost, getLPnlR().lmt_prf() && !getLPnlR().disp_unit());
		
		setColModeByFlg(columnRslt_lmt_prf_per, getLPnlR().lmt_prf());
	}

}