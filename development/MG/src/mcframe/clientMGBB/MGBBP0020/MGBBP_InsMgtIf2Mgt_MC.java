package mcframe.clientMGBB.MGBBP0020;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_InsMgtIf2Mgt"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_InsMgtIf2Mgt_MC extends MGBBP_InsMgtIf2Mgt_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_InsMgtIf2Mgt_MC() {
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
	public MGBBP_InsMgtIf2Mgt_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Srch01Caller<P extends MGBBP_InsMgtIf2Mgt, B extends MG_MGBBL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			showMerge();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setOpenBtnMode();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}
	}

	/**
	 * [MG_MGBBL0020_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Srch02Caller<P extends MGBBP_InsMgtIf2Mgt, B extends MG_MGBBL0020_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0020_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void showNoDownDataMsg() {
			// 表示しない
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setScreenAsync(false);
		}
	}

	/**
	 * [MG_MGBBL0020_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Ins01Caller<P extends MGBBP_InsMgtIf2Mgt, B extends MG_MGBBL0020_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0020_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			//非同期実行にする設定
			setAsync(true);
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setOpenBtnMode();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			setFocus();
		}
	}

	/**
	 * [MG_MGBBL0020_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Ins02Caller<P extends MGBBP_InsMgtIf2Mgt, B extends MG_MGBBL0020_Ins02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0020_Ins02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			//非同期実行にする設定
			setAsync(true);
		}

		@Override
		protected void setupUpParam() {
			param().addUpBlock(getCndR());
			param().addUpBlock(getRsltL());
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setOpenBtnMode();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			setFocus();
		}
	}

	/**
	 * [MG_MGBBL0020_Ins03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Ins03Caller<P extends MGBBP_InsMgtIf2Mgt, B extends MG_MGBBL0020_Ins03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0020_Ins03Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			//非同期実行にする設定
			setAsync(true);
		}

		@Override
		protected void setupUpParam() {
			param().addUpBlock(getCndR());
			param().addUpBlock(getRsltL());
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setOpenBtnMode();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			setFocus();
		}
	}

	/**
	 * [MG_MGBBL0020_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0020_Del01Caller<P extends MGBBP_InsMgtIf2Mgt, B extends MG_MGBBL0020_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0020_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			//非同期実行にする設定
			setAsync(true);
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setOpenBtnMode();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			setFocus();
		}
	}


	/**
	 * Panel[Btn]のボタン[open_act_if]の押下時の処理
	 */
	@Override
	public void doBtn_open_act_if(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}

		doBtn_open_act_if(r);
	}
	protected void doBtn_open_act_if(RsltR r) {
		if (!MGC_IF_DATA_TYP.isINST(r.if_data_typ())) {
			MGC_COST_ACT_TYP typ = MGC_COST_ACT_TYP.getNE(r.cost_act_typ());
			if (typ != null) {
				MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener(typ.module_id1(), typ.screen_id1());

				MCRow to = MCRow.create();
				to.setStringNE("calc_ctg_cd", getCndR().calc_ctg_cd());
				to.setStringNE("wg_cd", getCndR().wg_cd());
				to.setDateNE("ym_fr", getCndR().ym());
				to.setDateNE("ym_to", getCndR().ym());

				aso.putCnd(to);
				aso.runValueInit();
				aso.show();
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[open_act]の押下時の処理
	 */
	@Override
	public void doBtn_open_act(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}

		doBtn_open_act(r);
	}
	protected void doBtn_open_act(RsltR r) {
		MGC_COST_ACT_TYP typ = MGC_COST_ACT_TYP.getNE(r.cost_act_typ());
		if (typ != null) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener(typ.module_id2(), typ.screen_id2());

			MCRow to = MCRow.create();
			to.setStringNE("calc_ctg_cd", getCndR().calc_ctg_cd());
			to.setStringNE("wg_cd", getCndR().wg_cd());
			to.setDateNE("ym_fr", getCndR().ym());
			to.setDateNE("ym_to", getCndR().ym());

			aso.putCnd(to);
			aso.runValueInit();
			aso.show();
		}
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
	 * Panel[Btn]のボタン[ins1]の押下時の処理
	 */
	@Override
	public void doBtn_ins1(MCEventInfo info) {
		callMG_MGBBL0020_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[ins2]の押下時の処理
	 */
	@Override
	public void doBtn_ins2(MCEventInfo info) {
		callMG_MGBBL0020_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[ins3]の押下時の処理
	 */
	@Override
	public void doBtn_ins3(MCEventInfo info) {
		callMG_MGBBL0020_Ins03();
	}
	/**
	 * Panel[Btn]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doBtn_srch(MCEventInfo info) {
		callMG_MGBBL0020_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBBL0020_Del01();
	}

	// -----------------------------------------------
	// table
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		RsltTable.setSortable(false);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		// 対象年月の初期値を設定
		setDefaultYm();

		// 計算カテゴリのデフォールト値設定
		setDefCalcCtg(Cnd_calc_ctg_cd);

		// Rsltテーブルの固定初期値を設定
		setDefaultRsltTableList();
		
		RsltTable.adjustAllWidth();
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndPanel.focusFirstComponent();
	}

	/**
	 * Rsltテーブルの固定初期値設定。
	 */
	protected void setDefaultRsltTableList() {
		for (MGC_COST_ACT_TYP costActTyp : MGC_COST_ACT_TYP.array()) {
			RsltR r = RsltR.create();
			
			r.cost_act_typ(costActTyp.value());
			r.cost_act_typ_nm(costActTyp.name());
			r.list_sort(costActTyp.list_sort());
			r.is_enable(costActTyp.is_enable());

			r.if_data_typ(costActTyp.if_data_typ());
			MGC_IF_DATA_TYP ifDataTyp = MGC_IF_DATA_TYP.getNE(costActTyp.if_data_typ());
			
			if(costActTyp.is_visible() && ifDataTyp != null) {
				r.if_data_typ_nm(ifDataTyp.name());
			}
			else {
				r.if_data_typ_nm(null);
			}
			getRsltL().add(r);
		}

		getRsltL().sort(RsltR.$list_sort);
	}

	/**
	 * 対象年月の初期値設定。
	 */
	protected void setDefaultYm() {
		callMG_MGBBL0020_Srch02();
		MCDate ym = getCndR().default_ym();
		if (isNull(ym)) {
			mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
			if (term != null) {
				setValueEx(Cnd_ym, term.term());
			}
		}
		else {
			setValueEx(Cnd_ym, ym.addMonth(1));
		}
	}

	// -----------------------------------------------
	// status
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	@Override
	public void setLUMP_INSStatus() {
		super.setLUMP_INSStatus();
		setStatusCom();
	}

	@Override
	public void setLUMP_RERUN_INSStatus() {
		super.setLUMP_RERUN_INSStatus();
		setStatusCom();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		setFocus();
	}

	protected void setFocus() {
		CndPanel.focusFirstComponent();
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setOpenBtnMode();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		setModeByOpe();
		setOpenBtnMode();
	}

	@Override
	public void doCnd_ym_NC(MCEventInfo info) {
		super.doCnd_ym_NC(info);
		clearRslt();
	}

	@Override
	public void doCnd_wg_cd_NC(MCEventInfo info) {
		super.doCnd_wg_cd_NC(info);
		clearRslt();
	}

	@Override
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info) {
		super.doCnd_calc_ctg_cd_LC(info);
		clearRslt();
	}

	protected void clearRslt() {
		for (RsltR r : getRsltL()) {
			r.if_last_upd_dt(null);
			r.last_upd_dt(null);
		}
	}
	
	protected void setModeByOpe() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_LUMP_INS.isSelected()) {
			setValueEx(columnRslt_check, false);
			setLUMP_INSStatus();
		}
		else if (Cnd_ope_LUMP_RERUN_INS.isSelected()) {
			setValueEx(columnRslt_check, false);
			setLUMP_RERUN_INSStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
	}

	protected void setOpenBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (!isNull(r) && MGC_IF_DATA_TYP.isINST(r.if_data_typ())) {
			Btn_open_act_if.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_act_if);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == RsltTable) {
			doRslt_DC(info);
		}
	}

	protected void doRslt_DC(MCEventInfo info) {
		if (info.getClickColumn() == columnRslt_cost_act_typ_nm) {
			doBtn_open_act(info);
		}
		else if (info.getClickColumn() == columnRslt_if_data_typ_nm) {
			doBtn_open_act_if(info);
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

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(), INS) || isSame(getStatus(), DEL)) {
				RsltR r = getRsltL().get(index);
				if (column == columnRslt_check) {
					if (!isCheckable(r)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected boolean isCheckable(RsltR r) {
		return r.is_enable();
	}

	// -----------------------------------------------
	// popup
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			conf.ignoreSortOrder(true);
		}
		return conf;
	}

}