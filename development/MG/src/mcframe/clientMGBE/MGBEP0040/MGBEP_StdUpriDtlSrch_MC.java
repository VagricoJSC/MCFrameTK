package mcframe.clientMGBE.MGBEP0040;

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
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_StdUpriDtlSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_StdUpriDtlSrch_MC extends MGBEP_StdUpriDtlSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<DispInptR> _ccInpt = new MGUCP_CCtrl<>();
	protected MGUCP_CCtrl<DispWkR> _ccWk = new MGUCP_CCtrl<>();
	protected Color _vTtlColor = getVTtlColor(this);
	protected MCColumnConfig[] _theoryCols;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdUpriDtlSrch_MC() {
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
	public MGBEP_StdUpriDtlSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0040_Srch01Caller<P extends MGBEP_StdUpriDtlSrch, B extends MG_MGBEL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			setOrgCd(bridge.down1());
		}
		
		@Override
		protected void show() {
			super.show();
			
			DtlOperR preR = null;
			for (DtlOperR r : getDtlOperL()) {
				if (isColSame(r, preR, DtlOperR.$org_loc_cd)) {
					r.loc_cd(null);
					r.loc_nm(null);
				}
				preR = r;
			}
			
			setGUIScale();
			setOperUnitQty();
		}
		
		protected void setOperUnitQty() {
			for (DtlOperR r : getDtlOperL()) {
				// 工程単位数量計算
				MCNumber operUnitQty = getOperUnitQty(
						r.std_qty(),
						r.oper_std_qty(),
						r.oper_conv_qty(),
						r.oper_unit_cd(),
						r.base_unit_cd(),
						r.getMeta(DtlOperR.$std_qty)
						);
				
				r.oper_qty(operUnitQty);
				
				// 理論工程単位数量計算
				MCNumber theOperUnitQty = getOperUnitQty(
						r.the_qty(),
						r.oper_std_qty(),
						r.oper_conv_qty(),
						r.oper_unit_cd(),
						r.base_unit_cd(),
						r.getMeta(DtlOperR.$the_qty)
						);
				
				r.the_oper_qty(theOperUnitQty);
				
				if (isNull(r.oper_unit_cd()) && !isNull(r.oper_qty()) && !isNull(r.base_unit_cd())) {
					r.oper_unit_cd(r.base_unit_cd());
					r.oper_unit_nm(r.base_unit_nm());
				}
			}
		}
		/**
		 * 単位数量を工程管理単位に換算する。
		 * 
		 * @param std_qty 基準単位数量
		 * @param oper_std_qty 工程基準単位数量
 		 * @param oper_conv_qty 工程換算単位数量
 		 * @param oper_unit_cd 工程単位ＣＤ
 		 * @param unit_cd 基準単位ＣＤ
		 * @return 工程管理単位に換算された数量
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
		
		@Override
		protected void setMode() {
			super.setMode();
			setSRCH_SELFStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_SELFStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	/**
	 * [MG_MGBEL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0040_Srch02Caller<P extends MGBEP_StdUpriDtlSrch, B extends MG_MGBEL0040_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		/**通信対象(選択行のみ)*/
		protected DtlOperR _upForCall;
		
		protected MG_MGBEL0040_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_upForCall = DtlOperTable.getSelectedMCRow();
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().clear();
			bridge.up0().add(_upForCall);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (!getDispInptL().isEmpty()) {
				DispInptTable.selectRowNoFocus(0);
			}
			if (!getDispWkL().isEmpty()) {
				DispWkTable.selectRowNoFocus(0);
			}
		}
		
		@Override
		protected void showNoDownDataMsg() {
		}
		
		@Override
		protected void resultNoDataFound() {
		}
	}

	/**
	 * [MG_MGBEL0040_Srch03]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0040_Srch03Caller<P extends MGBEP_StdUpriDtlSrch, B extends MG_MGBEL0040_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0040_Srch03Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			setOrgCd(bridge.down1());
		}
		
		@Override
		protected void show() {
			super.show();
			setGUIScale();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setSRCH_ALLStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_ALLStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	/**
	 * [MG_MGBEL0040_Srch04]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0040_Srch04Caller<P extends MGBEP_StdUpriDtlSrch, B extends MG_MGBEL0040_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		/**通信対象(選択行のみ)*/
		protected DtlOperR _upForCall;
		
		protected MG_MGBEL0040_Srch04Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_upForCall = DtlOperTable.getSelectedMCRow();
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().clear();
			bridge.up0().add(_upForCall);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (!getDispInptL().isEmpty()) {
				DispInptTable.selectRowNoFocus(0);
			}
			if (!getDispWkL().isEmpty()) {
				DispWkTable.selectRowNoFocus(0);
			}
		}
		
		@Override
		protected void showNoDownDataMsg() {
		}
		
		@Override
		protected void resultNoDataFound() {
		}
	}
	
	protected void setOrgCd(MCList<DtlOperR> dtlOper) {
		for (DtlOperR r : dtlOper) {
			r.org_loc_cd(r.loc_cd());
		}
	}
	
	protected void setGUIScale() {
		int dec = getHdrR().base_unit_dec_place().intValue();
		Hdr_base_qty.setScale(dec);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_SELF.isSelected()) {
			callMG_MGBEL0040_Srch01();
		}
		else {
			callMG_MGBEL0040_Srch03();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MGBEP0020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0020(MCEventInfo info) {
		DtlOperR oper = DtlOperTable.getSelectedMCRow();
		DispInptR inpt = DispInptTable.getSelectedMCRow();
		
		if (isNullOr(oper, inpt)) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0020(oper, inpt);
	}
	protected void doBtn_open_MGBEP0020(DtlOperR oper, DispInptR inpt) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0020");
		mcframe.clientMGBE.MGBEP0020.CndR to = mcframe.clientMGBE.MGBEP0020.CndR.create();
		
		to.calc_grp_cd(oper.calc_grp_cd());
		to.calc_no(oper.calc_no());
		to.wg_cd(oper.wg_cd());
		to.itm_cd(inpt.itm_cd());
		to.itm_sub1(inpt.itm_sub1());
		to.itm_sub2(inpt.itm_sub2());
		to.itm_sub3(inpt.itm_sub3());
		
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

		Hdr_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);

		DtlOper_std_qty_p_PPanel.setRelateBeans(columnDtlOper_base_unit_cd, columnDtlOper_base_unit_dec_place);
		DtlOper_the_qty_p_PPanel.setRelateBeans(columnDtlOper_base_unit_cd, columnDtlOper_base_unit_dec_place);
		DtlOper_oper_qty_p_PPanel.setRelateBeans(columnDtlOper_oper_unit_cd, columnDtlOper_oper_dec_place);
		DtlOper_the_oper_qty_p_PPanel.setRelateBeans(columnDtlOper_oper_unit_cd, columnDtlOper_oper_dec_place);

		DispInpt_std_qty_p_PPanel.setRelateBeans(columnDispInpt_base_unit_cd, Hdr_base_unit_dec_place);
		DispInpt_the_qty_p_PPanel.setRelateBeans(columnDispInpt_base_unit_cd, Hdr_base_unit_dec_place);

		DispWk_std_wk_cost_p_PPanel.setRelateBeans(columnDispWk_wk_cost_unit_nm, columnDispWk_dec_place);
		DispWk_the_wk_cost_p_PPanel.setRelateBeans(columnDispWk_wk_cost_unit_nm, columnDispWk_dec_place);
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
		_ccInpt.init(this, DispInptTable);
		_ccInpt.setExpns(getCustomExpnsL(), Disp_expns, Disp_expns_grp);
		_ccWk.init(this, DispWkTable);
		_ccWk.setExpns(getCustomExpnsL(), Disp_expns, Disp_expns_grp);
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
		DtlOperTable.setSortable(false);
		setColorInfo();
	}
	
	protected void setColorInfo() {
		MGUDP_CellConfig ccInpt = (MGUDP_CellConfig) DispInptTable.getCellConfig();
		MGUDP_CellConfig ccWk = (MGUDP_CellConfig) DispWkTable.getCellConfig();
		MGUDP_CellConfig ccOper = (MGUDP_CellConfig) DtlOperTable.getCellConfig();
		
		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color expnsGSubTtlColor = getExpnsGSubTtlColor(this);
		Color allTtlColor = getAllTtlColor(this);
		Color varFxdColor = getVarFxdColor(this);
		Color theoryColor = getTheoryColor(this);
		
		for (MCColumnConfig c : DispInptTable.getColumnConfigs()) {
			ccInpt.putColumnBG(c, expnsSrchRsltColor);
		}
		for (MCColumnConfig c : _ccInpt.getExpnsGColumnConfigs()) {
			ccInpt.putColumnBG(c, expnsGSubTtlColor);
		}
		for (MCColumnConfig c : DispWkTable.getColumnConfigs()) {
			ccWk.putColumnBG(c, expnsSrchRsltColor);
		}
		for (MCColumnConfig c : _ccWk.getExpnsGColumnConfigs()) {
			ccWk.putColumnBG(c, expnsGSubTtlColor);
		}
		
		ccInpt.putColumnBG(columnDispInpt_ttl, allTtlColor);
		ccInpt.putColumnBG(columnDispInpt_fxd_cost, varFxdColor);
		ccInpt.putColumnBG(columnDispInpt_var_cost, varFxdColor);
		ccWk.putColumnBG(columnDispWk_ttl, allTtlColor);
		ccWk.putColumnBG(columnDispWk_fxd_cost, varFxdColor);
		ccWk.putColumnBG(columnDispWk_var_cost, varFxdColor);
		
		ccOper.putColumnBG(columnDtlOper_the_qty, theoryColor);
		ccOper.putColumnBG(columnDtlOper_the_oper_qty, theoryColor);
		ccInpt.putColumnBG(columnDispInpt_the_upri, theoryColor);
		ccInpt.putColumnBG(columnDispInpt_the_cost, theoryColor);
		ccInpt.putColumnBG(columnDispInpt_the_qty, theoryColor);
		ccWk.putColumnBG(columnDispWk_the_upri, theoryColor);
		ccWk.putColumnBG(columnDispWk_the_cost, theoryColor);
		ccWk.putColumnBG(columnDispWk_the_wk_cost, theoryColor);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(LPnl_theory, false);
		setValueEx(Disp_expns, true);
		setValueEx(Disp_expns_grp, true);
		dispTheoryCol();
		displayColumn();
		dispTheoryCol();
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlOperTable) {
			conf.ignoreSortOrder(true);
			conf.ignoreTableSort(true);
		}
		return conf;
	}
	
	// -----------------------------------------------
	// status
	public void setSRCH_SELFStatus() {
		super.setSRCH_SELFStatus();
		
		if (getDtlOperL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			DtlOperTable.selectLeftmostColumn(0);
		}
		displayColumn();
		dispTheoryCol();
		setOpenButtonMode();
	}

	@Override
	public void setSRCH_ALLStatus() {
		super.setSRCH_ALLStatus();
		
		if (getDtlOperL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			DtlOperTable.selectLeftmostColumn(0);
		}
		displayColumn();
		dispTheoryCol();
	}
	
	protected void setOpenButtonMode() {
		if (Cnd_ope_SELF.isSelected()) {
			DispInptR r = DispInptTable.getSelectedMCRow();
			if (isNull(r) || isNull(r.itm_cd())) {
				Btn_open_MGBEP0020.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MGBEP0020);
			}
		}
	}
	
	/**
	 * 標準品目工程原価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0020(DtlOperR oper, DispInptR inpt) {
		if (isNullOr(oper, inpt) || !Btn_open_MGBEP0020.isEnabled()) {
			return false;
		}
		return true;
	}
	
	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		getHdrR().base_qty(null);
		getHdrR().base_unit_nm(null);
		getHdrR().base_unit_dec_place(null);
		getHdrR().std_upri(null);
		getHdrR().the_upri(null);
		getDtlOperL().clear();
		getDispInptL().clear();
		getDispWkL().clear();
		
		if (Cnd_ope_SELF.isSelected()) {
			setSRCH_SELFStatus();
		}
		else if (Cnd_ope_ALL.isSelected()) {
			setSRCH_ALLStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void doLPnl_theory_NC(MCEventInfo info) {
		super.doLPnl_theory_NC(info);
		dispTheoryCol();
	}
	protected void dispTheoryCol() {
		for (MCColumnConfig c : getTheoryCols()) {
			setColVisible(c, getLPnlR().theory());
		}
		DtlOperTable.adjustWidth();
		DispInptTable.adjustWidth();
		DispWkTable.adjustWidth();
	}
	
	protected MCColumnConfig[] getTheoryCols() {
		if (_theoryCols == null) {
			_theoryCols = new MCColumnConfig[] {
					columnDtlOper_the_qty, columnDtlOper_the_oper_qty,
					columnDispInpt_the_upri, columnDispInpt_the_cost,
					columnDispInpt_the_qty, columnDispWk_the_upri, columnDispWk_the_cost,
					columnDispWk_the_wk_cost
			};
		}
		return _theoryCols;
	}
	protected void setColVisible(MCColumnConfig col, boolean boo) {
		if (boo) {
			setDefaultMode(col);
		}
		else {
			col.setMode(MCMode.INVISIBLE);
		}
	}
	
	@Override
	public void doDtlOper_NC(MCEventInfo info) {
		super.doDtlOper_NC(info);
		srchInptWk();
	}
	
	protected void srchInptWk() {
		getDispInptL().clear();
		getDispWkL().clear();
		if (Cnd_ope_SELF.isSelected()) {
			callMG_MGBEL0040_Srch02();
			setOpenButtonMode();
		}
		else {
			callMG_MGBEL0040_Srch04();
		}
	}
	
	@Override
	public void doDispInpt_NC(MCEventInfo info) {
		super.doDispInpt_NC(info);
		setOpenButtonMode();
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		DtlOperR oper = DtlOperTable.getSelectedMCRow();
		if (compo == DispInptTable) {
			int index = info.getEventIndex();
			DispInptR inpt = getDispInptL().get(index);
			if (isEnableBtn_open_MGBEP0020(oper, inpt)) {
				doBtn_open_MGBEP0020(oper, inpt);
			}
		}
	}
	
	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		changeColumnMode(DispInptTable, getDispR(), DispInptR.$$SHOW);
		changeColumnMode(DispWkTable, getDispR(), DispWkR.$$SHOW);
		
		_ccInpt.displayColumn();
		_ccWk.displayColumn();
	}
	
	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispInptTable.setCellConfig(createTableCellConfig());
		DispWkTable.setCellConfig(createTableCellConfig());
	}
	
	protected TableCellConfig createTableCellConfig() {
		return new TableCellConfig();
	}
	
	protected class TableCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (table.getBaseTable() == DispInptTable) {
				if (isSame(index + 1, getDispInptL().size())) {
					return _vTtlColor;
				}
			}
			else if (table.getBaseTable() == DispWkTable) {
				if (isSame(index + 1, getDispWkL().size())) {
					return _vTtlColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

}