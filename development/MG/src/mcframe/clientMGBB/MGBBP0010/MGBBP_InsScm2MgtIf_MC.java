package mcframe.clientMGBB.MGBBP0010;

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
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_InsScm2MgtIf"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_InsScm2MgtIf_MC extends MGBBP_InsScm2MgtIf_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_InsScm2MgtIf_MC() {
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
	public MGBBP_InsScm2MgtIf_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0010_Srch01Caller<P extends MGBBP_InsScm2MgtIf, B extends MG_MGBBL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			showMerge();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setINSStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}
	}

	/**
	 * [MG_MGBBL0010_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0010_Srch02Caller<P extends MGBBP_InsScm2MgtIf, B extends MG_MGBBL0010_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0010_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void showNoDownDataMsg() {
			// 表示しない
		}

		protected void initCaller() {
			super.initCaller();
			setScreenAsync(false);
		}
	}

	/**
	 * [MG_MGBBL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0010_Ins01Caller<P extends MGBBP_InsScm2MgtIf, B extends MG_MGBBL0010_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0010_Ins01Caller(P p, B b) {
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
		public MCMessage msgUpdatedWithMessages() {
			return null;
		}
	}


	/**
	 * Panel[Btn]のボタン[open_g]の押下時の処理
	 */
	@Override
	public void doBtn_open_g(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_g(r);
	}
	protected void doBtn_open_g(RsltR r) {
		MGC_IF_DTL_TYP typ = MGC_IF_DTL_TYP.get(r.if_dtl_typ());
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener(typ.module_id2(), typ.screen_id2());
		MCRow bind = MCRow.create();
		bind.setDateNE("ym_fr", getCndR().ym());
		bind.setDateNE("ym_to", getCndR().ym());
		bind.setStringNE("calc_ctg_cd", getCndR().calc_ctg_cd());
		aso.putCnd(bind);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (isEditable(columnRslt_check, r.getGUIIndex())) {
				setValueEx(columnRslt_check, r.getGUIIndex(), true);
			}
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBBL0010_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doBtn_srch(MCEventInfo info) {
		callMG_MGBBL0010_Srch01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setDefaultYm();
		initCalcCtg();
		setDefaultDtlTableList();
	}
	protected void setDefaultYm() {
		callMG_MGBBL0010_Srch02();
		MCDate ym = getCndR().default_ym();
		if (isNull(ym)) {
			mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
			if (term != null) {
				getCndR().ym(term.term());
			}
		}
		else {
			getCndR().ym(ym.addMonth(1));
		}
	}
	protected void initCalcCtg() {
		setDefCalcCtg(Cnd_calc_ctg_cd);
	}
	protected void setDefaultDtlTableList() {
		if (!getRsltL().isEmpty()) {
			for (RsltR r : getRsltL()) {
				r.last_upd_dt(null);
				r.no_imp_cnt(null);
				r.if_last_upd_dt(null);
			}
			return ;
		}
		for (MGC_IF_DTL_TYP typ : MGC_IF_DTL_TYP.array()) {
			RsltR r = RsltR.create();
			r.if_dtl_typ(typ.value());
			r.if_dtl_typ_nm(typ.name());
			r.list_sort(typ.list_sort());
			r.is_enable(typ.is_enable());
			r.is_visible(typ.is_visible());

			MGC_CT_DATA_TYP ctTyp = MGC_CT_DATA_TYP.get(typ.ct_data_typ());
			r.ct_data_typ(ctTyp.value());
			if (r.is_enable()) {
					r.ct_data_typ_nm(ctTyp.name());
			}
			
			getRsltL().add(r);
		}
		getRsltL().sort(RsltR.$list_sort);
		RsltTable.adjustWidth();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		RsltTable.setSortable(false);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.ignoreSortOrder(true);
		}
		return config;
	}

	// -----------------------------------------------
	// status
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		CndPanel.focusFirstComponent();
	}

	// -----------------------------------------------
	// Event
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_g(r)) {
				doBtn_open_g(r);
			}
		}
	}
	protected boolean isEnableBtn_open_g(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	@Override
	public void doCnd_ym_LC(MCEventInfo info) {
		super.doCnd_ym_LC(info);
		setDefaultDtlTableList();
	}

	@Override
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info) {
		super.doCnd_calc_ctg_cd_LC(info);
		setDefaultDtlTableList();
	}
	@Override
	public void doCnd_non_mov_NC(MCEventInfo info) {
		super.doCnd_non_mov_NC(info);
		if (getCndR().non_mov()) {
			RsltR r = getRsltL().getFirst(RsltR.$if_dtl_typ, MGC_IF_DTL_TYP.STK.value());
			setValueEx(columnRslt_check, r.getGUIIndex(), true);
		}
	}
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!r.check() && MGC_IF_DTL_TYP.isSTK(r.if_dtl_typ())) {
			setValueEx(Cnd_non_mov, false);
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
			if (isSame(getStatus(), INS)) {
				RsltR r = getRsltL().get(index);
				if (column == columnRslt_check) {
					if (!r.is_enable()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}