package mcframe.clientMGBE.MGBEP0200;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

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
 * 画面"MGBEP_FixStdUpriSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_FixStdUpriSrch_MC extends MGBEP_FixStdUpriSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_FixStdUpriSrch_MC() {
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
	public MGBEP_FixStdUpriSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0200_Srch01Caller<P extends MGBEP_FixStdUpriSrch, B extends MG_MGBEL0200_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0200_Srch01Caller(P p, B b) {
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
			for (RsltR row : bridge.down0()) {
				calcUnitElm(row);
			}
		}
		
		protected void calcUnitElm(RsltR row) {
			_cc.calcUnit(row, row.qty(), false);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBEL0200_Srch01();
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
		
		to.calc_grp_cd(r.calc_grp_cd());
		to.calc_no(r.calc_no());
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
	 * Panel[Btn]のボタン[open_MGBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0110(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0110(r);
	}
	protected void doBtn_open_MGBEP0110(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0110");
		mcframe.clientMGBE.MGBEP0110.MGBEP_StdUpriFix p = (mcframe.clientMGBE.MGBEP0110.MGBEP_StdUpriFix) aso.getPanel();
		mcframe.clientMGBE.MGBEP0110.CndR to = mcframe.clientMGBE.MGBEP0110.CndR.create();
		
		to.ope(p.Cnd_ope_CANCEL.getActionCommand());
		to.calc_grp_cd(r.calc_grp_cd());
		to.calc_no(r.calc_no());
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
	
	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_unit_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
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
		
		cc.putColumnBG(RsltTable.getColumnConfigs(), expnsSrchRsltColor);
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), expnsGBgColor);
		
		cc.putColumnBG(columnRslt_ttl, allTtlColor);
		cc.putColumnBG(columnRslt_ttl_unit, allTtlColor);
		cc.putColumnBG(columnRslt_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost_unit, varFxdColor);
		cc.putColumnBG(columnRslt_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt_var_cost_unit, varFxdColor);
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
		setBtnModeByFlg(Btn_open_MGBEP0010, isEnableBtn_open_MGBEP0010(r));
		setBtnModeByFlg(Btn_open_MGBEP0110, isEnableBtn_open_MGBEP0110(r));
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
	 * 標準単価確定画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0110(RsltR r) {
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
			if (isEnableBtn_open_MGBEP0010(r)) {
				doBtn_open_MGBEP0010(r);
			}
		}
	}
	
	@Override
	public void doLPnl_disp_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_unit_NC(info);
		displayUnitColumn();
	}
	
	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		displayUnitColumn();
	}
	
	protected void displayUnitColumn() {
		for (MCColumnConfig cc : new MCColumnConfig[] { columnRslt_qty, columnRslt_ttl, columnRslt_var_cost,
				columnRslt_fxd_cost }) {
			setColModeByFlg(cc, !getLPnlR().disp_unit());
		}
		for (MCColumnConfig cc : new MCColumnConfig[] { columnRslt_qty_unit, columnRslt_ttl_unit,
				columnRslt_var_cost_unit, columnRslt_fxd_cost_unit }) {
			setColModeByFlg(cc, getLPnlR().disp_unit());
		}
	}

}