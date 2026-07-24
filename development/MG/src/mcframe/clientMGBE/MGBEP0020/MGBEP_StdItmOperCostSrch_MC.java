package mcframe.clientMGBE.MGBEP0020;

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
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_StdItmOperCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_StdItmOperCostSrch_MC extends MGBEP_StdItmOperCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdItmOperCostSrch_MC() {
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
	public MGBEP_StdItmOperCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0020_Srch01Caller<P extends MGBEP_StdItmOperCostSrch, B extends MG_MGBEL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0020_Srch01Caller(P p, B b) {
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
			setOperUnitQty();
		}
		
		protected void setOperUnitQty() {
			for (RsltR r : getRsltL()) {
				// 工程単位数量計算
				MCNumber operUnitQty = getOperUnitQty(
						r.std_qty(),
						r.oper_std_qty(),
						r.oper_conv_qty(),
						r.oper_unit_cd(),
						r.unit_cd(),
						r.getMeta(RsltR.$std_qty)
						);
				
				r.oper_qty(operUnitQty);
				
				if (isNull(r.oper_unit_cd()) && !isNull(r.oper_qty()) && !isNull(r.unit_cd())) {
					r.oper_unit_cd(r.unit_cd());
					r.oper_unit_nm(r.unit_nm());
				}
			}
		}
		
		/**
		 * 基準単位数量を工程単位に換算する。
		 * 
		 * @param std_qty 基準単位数量
		 * @param oper_std_qty 工程基準単位数量
 		 * @param oper_conv_qty 工程換算単位数量
 		 * @param oper_unit_cd 工程単位ＣＤ
 		 * @param unit_cd 基準単位ＣＤ
		 * @return 工程単位に換算された数量
		 */
		protected MCNumber getOperUnitQty(
				MCNumber std_qty,
				MCNumber oper_std_qty,
				MCNumber oper_conv_qty,
				String oper_unit_cd,
				String unit_cd,
				MCMeta meta) {
			if (isNull(std_qty)) {
				return null;
			}
			
			MCNumber std = oper_std_qty;
			MCNumber conv = oper_conv_qty;
			MCNumber dec = MCNumber.valueOf(meta.scale());
			String typ = MAC_RND_TYP.RNDOFF.value();
			
			String operUnit = oper_unit_cd;
			if (isNull(operUnit)) {
				return std_qty;
			}
			String baseUnit = unit_cd;
			
			if (!isNullOr(std, conv)) {
				if (std_qty.isZero() || std.isZero() || conv.isZero()) {
					return MCNumber.ZERO;
				}
				if (!isNull(dec) && MAC_RND_TYP.contains(typ)) {
					return std_qty.multiply(conv).divide(std, dec.intValue(),
							MAC_RND_TYP.toMC(typ));
				}
			}
			
			if (isSame(operUnit, baseUnit)) {
				return std_qty;
			}
			
			return null;
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBEL0020_Srch01();
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
		
		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();	
			return;
		}
		to.calc_grp_cd(_cndR.calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();	
			return;
		}
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.loc_cd(r.loc_cd());
		
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
		
		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();	
			return;
		}
		to.calc_grp_cd(_cndR.calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();	
			return;
		}
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
		
		if (!isSetCalcGrpCd()) {
			aso.runValueInit();
			aso.show();	
			return;
		}
		to.calc_grp_cd(_cndR.calc_grp_cd());
		if (!isSetCalcNo()) {
			aso.putCnd(to);
			aso.runValueInit();
			aso.show();	
			return;
		}
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.loc_cd(r.loc_cd());
		to.expns_typ(MAC_EXPNS_TYP.PROD.value());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	
	protected boolean isSetCalcGrpCd() {
		if (isNull(_cndR.calc_grp_cd())) {
			return false;
		}
		return true;
	}
	protected boolean isSetCalcNo() {
		if (isNull(_cndR.calc_no())) {
			return false;
		}
		return true;
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
		RsltTable.setSortable(false);
		setColorInfo();
	}
	
	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();

		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color expnsGSubTtlColor = getExpnsGSubTtlColor(this);
		Color genTtlColor = getGenTtlColor(this);
		Color allTtlColor = getAllTtlColor(this);
		Color varFxdColor = getVarFxdColor(this);

		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			cc.putColumnBG(c, expnsSrchRsltColor);
		}
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs()) {
			cc.putColumnBG(c, expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt_ttl, genTtlColor);
		cc.putColumnBG(columnRslt_all_ttl, allTtlColor);
		cc.putColumnBG(columnRslt_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt_var_cost, varFxdColor);
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
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			conf.ignoreSortOrder(true);
			conf.ignoreTableSort(true);
		}
		return conf;
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
	 * 標準配賦額一覧照会画面に遷移できるか
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
	
	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
	}
	
	// -----------------------------------------------
	// CellConfig
	protected Color _vTtlColor = getVTtlColor(this);
	
	protected ArrayList<MCColumnConfig> _invisibleColumnConfigs = null;
	
	protected ArrayList<MCColumnConfig> getInvisibleColumnConfigs() {
		if (_invisibleColumnConfigs == null) {
			_invisibleColumnConfigs = getGroupColumnConfigs(RsltTable, RsltR.$$CLEAR);
		}
		return _invisibleColumnConfigs;
	}
	
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
			if (isNull(getRsltL().get(index).oper_seq())) {
				return _vTtlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}
		
		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column,
				MCTable<?> table, MCMode mode) {
			RsltR row = (RsltR) table.getBaseTable().getRow(index);
			if (!isSame(row.column_id(), 0) && !getLPnlR().key()) {
				if (getInvisibleColumnConfigs().contains(column)) {
					return true;
				}
			}
			return null;
		}
	}

}