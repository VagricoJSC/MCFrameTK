package mcframe.clientMGBF.MGBFP0210;

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

import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_WipLocSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_WipLocSrch_MC extends MGBFP_WipLocSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	/** 検索条件キャッシュ*/
	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_WipLocSrch_MC() {
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
	public MGBFP_WipLocSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0210_Srch01Caller<P extends MGBFP_WipLocSrch, B extends MG_MGBFL0210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0210_Srch01Caller(P p, B b) {
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

			_cndR = getCndR().clone();
		}
	}

	/**
	 * [MG_MGBFL0210_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0210_Srch02Caller<P extends MGBFP_WipLocSrch, B extends MG_MGBFL0210_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0210_Srch02Caller(P p, B b) {
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
		if (Cnd_ope_LOC.isSelected()) {
			callMG_MGBFL0210_Srch01();
		}
		else {
			callMG_MGBFL0210_Srch02();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0020(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0020(r);
	}
	protected void doBtn_open_MGBFP0020(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0020");
		mcframe.clientMGBF.MGBFP0020.CndR to = mcframe.clientMGBF.MGBFP0020.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.ym(r.ym());
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0070(r);
	}
	protected void doBtn_open_MGBFP0070(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0070");
		mcframe.clientMGBF.MGBFP0070.CndR to = mcframe.clientMGBF.MGBFP0070.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.ym(r.ym());
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0080(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0080(r);
	}
	protected void doBtn_open_MGBFP0080(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0080");
		mcframe.clientMGBF.MGBFP0080.CndR to = mcframe.clientMGBF.MGBFP0080.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.ym(r.ym());
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
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
		doBtn_open_MGBFP0090(r);
	}
	protected void doBtn_open_MGBFP0090(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0090");
		mcframe.clientMGBF.MGBFP0090.CndR to = mcframe.clientMGBF.MGBFP0090.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.ym(r.ym());
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
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
		to.ym(r.ym());
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0100(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0100(r);
	}
	protected void doBtn_open_MGBFP0100(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0100");
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.ym(r.ym());
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.st_wip_flg(true);
		to.end_wip_flg(true);
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_stk_flg);
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$end_stk_flg);
		list.add(mcframe.clientMGBF.MGBFP0100.CndR.$adj_flg);
		aso.putCnd(to, list);
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
	protected void tableInit() {
		super.tableInit();

		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();

		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color expnsGBgColor = getExpnsGSubTtlColor(this);
		Color allTtlColor = getAllTtlColor(this);
		Color varFxdColor = getVarFxdColor(this);

		cc.putColumnBG(RsltTable.getAllColumnConfigs(), expnsSrchRsltColor);
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs()) {
			cc.putColumnBG(c, expnsGBgColor);
		}
		cc.putColumnBG(columnRslt_ttl, allTtlColor);
		cc.putColumnBG(columnRslt_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost, varFxdColor);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == RsltTable) {
			confSet.removeAll(Arrays.asList(RsltTable.getAllColumnConfigs()));
			confSet.addAll(Arrays.asList(RsltTable.getViewColumnConfigs()));
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);

		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_loc_flg, true);

		displayColumn();
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_LOC.isSelected()) {
			setSRCH_LOCStatus();
		}
		else if (Cnd_ope_DPT.isSelected()) {
			setSRCH_DPTStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_LOC.isSelected()) {
			setREF_LOCStatus();
		}
		else if (Cnd_ope_DPT.isSelected()) {
			setREF_DPTStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_LOCStatus() {
		super.setSRCH_LOCStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_DPTStatus() {
		super.setSRCH_DPTStatus();
		setStatusCom();
	}

	@Override
	public void setREF_LOCStatus() {
		super.setREF_LOCStatus();
		setStatusCom();
	}

	@Override
	public void setREF_DPTStatus() {
		super.setREF_DPTStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		setBtnMode();
		setFocus();
		setTabMode();
		displayColumn();
	}

	protected void displayColumn() {
		_cc.displayColumn();
		getCndR().disp_wg_flg(Cnd_ope_DPT.isSelected() || getCndR().wg_flg());
		getCndR().disp_mng_dpt_flg(Cnd_ope_DPT.isSelected() || getCndR().mng_dpt_flg());
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setTabMode() {
		if (Cnd_ope_LOC.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBFP0020, isEnableBtn_open_MGBFP0020(r));
		setBtnModeByFlg(Btn_open_MGBFP0070, isEnableBtn_open_MGBFP0070(r));
		setBtnModeByFlg(Btn_open_MGBFP0080, isEnableBtn_open_MGBFP0080(r));
		setBtnModeByFlg(Btn_open_MGBFP0090, isEnableBtn_open_MGBFP0090(r));
		setBtnModeByFlg(Btn_open_MGBFP0120, isEnableBtn_open_MGBFP0120(r));
		setBtnModeByFlg(Btn_open_MGBFP0100, isEnableBtn_open_MGBFP0100(r));
	}

	/**
	 * 完成原価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0020(RsltR r) {
		if (r == null || !Cnd_ope_LOC.isSelected()) {
			return false;
		}
		return true;
	}

	/**
	 * 工程原価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0070(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 工数原価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0080(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 投入原価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0090(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 配賦額一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0120(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 在庫仕掛原価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0100(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
	}

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
			if (isEnableBtn_open_MGBFP0020(r)) {
				doBtn_open_MGBFP0020(r);
			}
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
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

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected Color _topColor = getTopColor(this);

	protected class RsltCellConfig extends MGUDP_CellConfig {
		
		static final String TOP_KEY = "st_wip_amt";

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (isSame(r.key(), TOP_KEY)) {
				return _topColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (!isSame(r.key(), TOP_KEY) && !getLPnlR().disp_key()) {
				if (getInvisibleColumnConfigs().contains(column)) {
					return true;
				}
			}
			return null;
		}

		protected ArrayList<MCColumnConfig> _invisibleColumnConfigs = null;

		protected ArrayList<MCColumnConfig> getInvisibleColumnConfigs() {
			if (_invisibleColumnConfigs == null) {
				_invisibleColumnConfigs = getGroupColumnConfigs(RsltTable, RsltR.$$CLEAR);
			}
			return _invisibleColumnConfigs;
		}
	}

}