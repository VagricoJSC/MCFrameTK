package mcframe.clientMGBE.MGBEP0110;

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
import mcframe.clientMAUB.MAUBP0230.*;
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
import java.util.Arrays;
import java.util.Set;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_StdUpriFix"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_StdUpriFix_MC extends MGBEP_StdUpriFix_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	/** 検索条件キャッシュ*/
	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdUpriFix_MC() {
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
	public MGBEP_StdUpriFix_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0110_Srch01Caller<P extends MGBEP_StdUpriFix, B extends MG_MGBEL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0110_Srch01Caller(P p, B b) {
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
	 * [MG_MGBEL0110_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0110_Srch02Caller<P extends MGBEP_StdUpriFix, B extends MG_MGBEL0110_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0110_Srch02Caller(P p, B b) {
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
	 * [MG_MGBEL0110_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0110_Upd01Caller<P extends MGBEP_StdUpriFix, B extends MG_MGBEL0110_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBEL0110_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBEL0110_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0110_Upd02Caller<P extends MGBEP_StdUpriFix, B extends MG_MGBEL0110_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBEL0110_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_AStatus();
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}
	}

	/**
	 * [MG_MGBEL0110_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0110_Del01Caller<P extends MGBEP_StdUpriFix, B extends MG_MGBEL0110_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBEL0110_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBEL0110_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0110_Del02Caller<P extends MGBEP_StdUpriFix, B extends MG_MGBEL0110_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBEL0110_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(panel.checkAtLeastOneInput(BulkCnd_calc_no, BulkCnd_term));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_AStatus();
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_FIX.isSelected()) {
			callMG_MGBEL0110_Srch01();
		}
		else {
			callMG_MGBEL0110_Srch02();
		}
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
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBEL0110_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd2]の押下時の処理
	 */
	@Override
	public void doBtn_upd2(MCEventInfo info) {
		callMG_MGBEL0110_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBEL0110_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del2]の押下時の処理
	 */
	@Override
	public void doBtn_del2(MCEventInfo info) {
		callMG_MGBEL0110_Del02();
	}

	@Override
	protected boolean useDelMsg() {
		return false;
	}

	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		BulkCnd_calc_no_p_PPanel.setRelateBeans(BulkCnd_calc_grp_cd);
		BulkCnd_term_p_PPanel.setDefault(false);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_unit_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_calc_no.addLCListener(this);
		Cnd_calc_no.addVCListener(this);
	}

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
		_cc.setSum(RsltR.$ttl);
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
		Color diffColor = getMoneyDiffColor(this);
		Color rateColor = getStkrColor(this);

		cc.putColumnBG(RsltTable.getColumnConfigs(), expnsSrchRsltColor);
		cc.putColumnBG(columnRslt_check, null);
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), expnsGBgColor);
		cc.putColumnBG(columnRslt_ttl, allTtlColor);
		cc.putColumnBG(columnRslt_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt_ttl_unit, allTtlColor);
		cc.putColumnBG(columnRslt_var_cost_unit, varFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost_unit, varFxdColor);
		cc.putColumnBG(columnRslt_diff_ttl, diffColor);
		cc.putColumnBG(columnRslt_inc_per, rateColor);
		cc.putColumnBG(columnRslt_diff_ttl_unit, diffColor);
		cc.putColumnBG(columnRslt_inc_per_unit, rateColor);
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
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
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

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_FIX_ALL.isSelected()) {
			setFIX_ALLStatus();
		}
		else if (Cnd_ope_CANCEL_ALL.isSelected()) {
			setCANCEL_ALLStatus();
		}
		else if (Cnd_ope_FIX.isSelected() || Cnd_ope_CANCEL.isSelected()) {
			setSRCHStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_FIX.isSelected()) {
			setFIXStatus();
		}
		else if (Cnd_ope_CANCEL.isSelected()) {
			setCANCELStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setStatusCom();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setStatusCom();
	}

	@Override
	public void setCANCELStatus() {
		super.setCANCELStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_ALLStatus() {
		super.setFIX_ALLStatus();
		setStatusCom();
	}

	@Override
	public void setCANCEL_ALLStatus() {
		super.setCANCEL_ALLStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_AStatus() {
		super.setFIX_AStatus();
		setStatusCom();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), FIX) || isSame(getStatus(), CANCEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus();
	}

	protected void setStatusCom() {
		setCndMode();
		setTabMode();
		setBtnMode();
		setFocus();
		displayColumn();
	}

	protected void setCndMode() {
		setExcludeMode();
	}

	protected void setExcludeMode() {
		if (isNull(getCndR().amt_dcsn_typ())) {
			setValueEx(Cnd_exclude_flg, false);
			Cnd_exclude_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_exclude_flg.setMode(MCMode.REQUIRED);
		}
	}

	protected void setTabMode() {
		if (Cnd_ope_FIX_ALL.isSelected() || Cnd_ope_CANCEL_ALL.isSelected()) {
			setTabComponentEnable(FoldTab, Tab3Panel);
		}
		else  {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
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

	// -----------------------------------------------
	// Event
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_no) {
			doCnd_calc_no_LC(info);
		}
	}

	protected void doCnd_calc_no_LC(MCEventInfo info) {
		getRsltL().clear();
		setBtnMode();
	}

	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (vc == Cnd_calc_no && !doCnd_calc_no_VC(info)) {
			return false;
		}
		return super.doVCEvent(vc, info);
	}

	protected boolean doCnd_calc_no_VC(MCEventInfo info) {
		return confirmRegDataClearRslt();
	}

	protected boolean confirmRegDataClearRslt() {
		if (isChanged(RsltTable)) {
			boolean f = confirmRegDataClear();
			if (f) {
				RsltTable.getList().setStatus(MCRow.NONE);
			}
			return f;
		}
		return true;
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
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		setStatusCom();
		
		if (Cnd_ope_FIX_ALL.isSelected() || Cnd_ope_CANCEL_ALL.isSelected()) {
			copyComboValue(Cnd_calc_grp_cd, BulkCnd_calc_grp_cd);
			copyComboValue(Cnd_calc_no, BulkCnd_calc_no);
		}
		clearTerm();
	}

	protected void clearTerm() {
		if (Cnd_ope_FIX_ALL.isSelected()) {
			setValueEx(BulkCnd_term, null);
		}
	}

	protected void copyComboValue(MCTextComboBox from, MCTextComboBox to) {
		if (to.checkValue(from.getValue()).size() == 0) {
			setValueEx(to, from.getValue());
		}
		else {
			setValueEx(to, null);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info) {
		if (!confirmRegDataClearRslt()) {
			return false;
		}
		return super.doCnd_calc_grp_cd_VC(info);
	}

	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		getRsltL().clear();
		setBtnMode();
	}

	@Override
	public void doCnd_amt_dcsn_typ_LC(MCEventInfo info) {
		super.doCnd_amt_dcsn_typ_LC(info);
		setExcludeMode();
		if (Cnd_ope_FIX.isSelected() && isNull(info.getOldValue()) && !isNull(info.getNewValue())) {
			setValueEx(Cnd_exclude_flg, true);
		}
	}

	@Override
	public void doLPnl_disp_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_unit_NC(info);
		displayUnitColumn();
		displayDiffColumn();
	}

	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		_cc.displayColumn();
		displayUnitColumn();
		displayDiffColumn();
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

	protected void displayDiffColumn() {
		for (MCColumnConfig cc : new MCColumnConfig[] { columnRslt_diff_ttl, columnRslt_inc_per,
				columnRslt_pre_ttl }) {
			setColModeByFlg(cc, !isNull(_cndR) && _cndR.diff_flg() && !getLPnlR().disp_unit());
		}
		for (MCColumnConfig cc : new MCColumnConfig[] { columnRslt_diff_ttl_unit, columnRslt_inc_per_unit,
				columnRslt_pre_ttl_unit }) {
			setColModeByFlg(cc, !isNull(_cndR) && _cndR.diff_flg() && getLPnlR().disp_unit());
		}
	}

}