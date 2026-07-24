package mcframe.clientMSBE.MSBEP0100;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_IoRecSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IoRecSrch_MC extends MSBEP_IoRecSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCIndexKey _dtlHideIndexkey = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IoRecSrch_MC() {
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
	public MSBEP_IoRecSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0100_Srch01Caller<P extends MSBEP_IoRecSrch, B extends MS_MSBEL0100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0100_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void clear() {
			super.clear();
			_dtlHideIndexkey = null;
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getDtlL());
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			
			msgList.addAll(checkBeforeAfter(Cnd_act_dt_fr, Cnd_act_dt_to));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}
		
		@Override
		protected void show() {
			super.show();
			setDtlHideIndexKey();
		}
		
		protected void setDtlHideIndexKey() {
			if (getDtlHideL().isEmpty()) {
				_dtlHideIndexkey = null;
			}
			else {
				_dtlHideIndexkey = getDtlHideL().createIndex(DtlR.$peg_no);
			}
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL0100_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0010(MCEventInfo info) {
		
		LotR r = LotTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0010");
		aso.putCnd(crtOpenMSBEP0010CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBE.MSBEP0010.CndR crtOpenMSBEP0010CndR(MAUCP_AppScreenOpener aso, LotR r) {
		mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch p = (mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0010.CndR to = mcframe.clientMSBE.MSBEP0010.CndR.create();

		aso.runValueInit();
		
		to.ope(p.Cnd_ope_STK.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.lot_no(r.lot_no());
		if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
			to.sublot_no(null);
		}
		else {
			to.sublot_no(r.sublot_no());
		}

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0070(MCEventInfo info) {
		LotR r = LotTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0070");
		aso.putCnd(crtOpenMSBEP0070CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBE.MSBEP0070.CndR crtOpenMSBEP0070CndR(MAUCP_AppScreenOpener aso, LotR r) {
		mcframe.clientMSBE.MSBEP0070.MSBEP_IoTrnsDtlSrch p = (mcframe.clientMSBE.MSBEP0070.MSBEP_IoTrnsDtlSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0070.CndR to = mcframe.clientMSBE.MSBEP0070.CndR.create();
		
		aso.runValueInit();

		to.ope(p.Cnd_ope_SRCH_STK.getActionCommand());
		if (Cnd_md_SITE.isSelected()) {
			to.disp_typ(p.Cnd_disp_typ_1.getActionCommand());
		}
		else {
			to.disp_typ(p.Cnd_disp_typ_0.getActionCommand());
		}
		to.site_cd(r.site_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());

		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBEP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0080(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0080");
		aso.putCnd(crtOpenMSBEP0080CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBE.MSBEP0080.CndR crtOpenMSBEP0080CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP0080.MSBEP_IoActSrch p = (mcframe.clientMSBE.MSBEP0080.MSBEP_IoActSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0080.CndR to = mcframe.clientMSBE.MSBEP0080.CndR.create();

		aso.runValueInit();
		
		to.ope(p.Cnd_ope_SRCH_NRML.getActionCommand());
		to.ac_dt_fr(r.ac_dt());
		to.ac_dt_to(r.ac_dt());
		to.slip_no(r.slip_no());
		to.slip_seq_no(r.slip_seq_no());

		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBFP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0120(MCEventInfo info) {
		LotR r = LotTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0120");
		aso.putCnd(crtOpenMSBFP0120CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBF.MSBFP0120.CndR crtOpenMSBFP0120CndR(MAUCP_AppScreenOpener aso, LotR r) {
		mcframe.clientMSBF.MSBFP0120.CndR to = mcframe.clientMSBF.MSBFP0120.CndR.create();
		
		aso.runValueInit();
		
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
			to.sublot_no(null);
		}
		else {
			to.sublot_no(r.sublot_no());
		}
		
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBFP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0130(MCEventInfo info) {
		LotR r = LotTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0130");
		aso.putCnd(crtOpenMSBFP0130CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBF.MSBFP0130.CndR crtOpenMSBFP0130CndR(MAUCP_AppScreenOpener aso, LotR r) {
		mcframe.clientMSBF.MSBFP0130.CndR to = mcframe.clientMSBF.MSBFP0130.CndR.create();
		
		aso.runValueInit();
		
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
			to.sublot_no(null);
		}
		else {
			to.sublot_no(r.sublot_no());
		}
		
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBFP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0060(MCEventInfo info) {
		LotR r = LotTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0060");
		aso.putCnd(crtOpenMSBFP0060CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBF.MSBFP0060.CndR crtOpenMSBFP0060CndR(MAUCP_AppScreenOpener aso, LotR r) {
		mcframe.clientMSBF.MSBFP0060.MSBFP_InspActLstReg p = (mcframe.clientMSBF.MSBFP0060.MSBFP_InspActLstReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0060.CndR to = mcframe.clientMSBF.MSBFP0060.CndR.create();
		
		aso.runValueInit();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.site_cd(r.site_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
			to.sublot_no(null);
		}
		else {
			to.sublot_no(r.sublot_no());
		}
		
		return to;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		// 版
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Lot_ver_no_p_PPanel.setRelateBeans(columnLot_itm_cd, columnLot_itm_sub1, columnLot_itm_sub2, columnLot_itm_sub3, columnLot_site_cd, null);
		Dtl_base_unit_gr_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_base_unit_gi_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_pack_unit_gr_qty_p_PPanel.setRelateBeans(columnDtl_pack_unit_cd, columnDtl_pack_unit_dec_place);
		Dtl_pack_unit_gi_qty_p_PPanel.setRelateBeans(columnDtl_pack_unit_cd, columnDtl_pack_unit_dec_place);
		
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.setSortable(false); // ソート不可
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlTable) {
			// 実績日順に在庫数を表示しているため、ソートは行えないようにする。
			conf.ignoreSortOrder(true);
			conf.ignoreTableSort(true);
		}
		return conf;
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getCndR().act_dt_fr(getToday().startOfMonth());
		getCndR().act_dt_to(getCndR().act_dt_fr().addMonth(1).addDay(-1));
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void doLot_NC(MCEventInfo info) {
		super.doLot_NC(info);
		LotR r = LotTable.getSelectedMCRow();
		if (!isNull(r)) {
			showDtlTable(r);
		}
		
	}
	
	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (hasSiteDefCd(this)) {
			setComponentInvisibleAllStatus(Cnd_md_SITE);
		}
		if (!isStrLnEnabled(this)) {
			setComponentInvisibleAllStatus(Cnd_md_STRLN);
		}
	}
	
	/**
	 * 入出庫実績テーブルにデータを表示する。
	 */
	protected void showDtlTable(LotR r) {
		if (isSetDtlTable(r)) {
			clearContainers(getDtlL());
			return;
		}
				
		MCList<DtlR> tmp = getDtlHideL().subList(_dtlHideIndexkey, r.peg_no());
		tmp.sort(DtlR.$srt_no);
		getDtlL().setAll(tmp);
		
		DtlTable.adjustWidth();
		DtlTable.selectLeftmostColumn(0);		
	}
	
	/**
	 * 入出庫実績テーブルにデータを表示するかどうか。
	 * @param r
	 * @return
	 */
	protected boolean isSetDtlTable(LotR r) {
		if (isNull(r)) {
			return true;
		}
		if (getDtlHideL().isEmpty()) {
			return true;
		}
		if (getDtlHideL().isEmpty()) {
			return true;
		}
		if (_dtlHideIndexkey == null) {
			return true;
		}
		return false;
	}
	
	
	
	@Override
	public void doCnd_md_NC(MCEventInfo info) {
		super.doCnd_md_NC(info);
		clearScreenWithSrchTypEvent();
		setSrchStatusSub();
	}
	
	/**
	 * 表示単位変更時のクリア処理
	 */
	protected void clearScreenWithSrchTypEvent() {
		getLotL().clear();
		getDtlL().clear();
		getDtlHideL().clear();
		_dtlHideIndexkey = null;
		if (Cnd_md_SITE.isSelected() || Cnd_md_SPPL.isSelected()) {
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_str_ln_cd, null);
		}
		else if (Cnd_md_LOC.isSelected()) {
			setValueEx(Cnd_str_ln_cd, null);
		}
	}
	
	/**
	 * 検索前ステータス設定
	 */
	protected void setSrchStatus() {
		setSrchStatusSub();
		FoldTab.focusActiveFirstComponent();
	}
	
	protected void setSrchStatusSub() {
		if (Cnd_md_SITE.isSelected()) {
			setSRCH_SITEStatus();
		}
		else if (Cnd_md_SPPL.isSelected()) {
			setSRCH_SPPLStatus();
		}
		else if (Cnd_md_LOC.isSelected()) {
			setSRCH_LOCStatus();
		}
		else if (Cnd_md_STRLN.isSelected()) {
			setSRCH_STRLNStatus();
		}
	}
	
	/**
	 * 検索後ステータス設定
	 */
	protected void setRefStatus() {
		if (Cnd_md_SITE.isSelected()) {
			setREF_SITEStatus();
		}
		else if (Cnd_md_SPPL.isSelected()) {
			setREF_SPPLStatus();
		}
		else if (Cnd_md_LOC.isSelected()) {
			setREF_LOCStatus();
		}
		else if (Cnd_md_STRLN.isSelected()) {
			setREF_STRLNStatus();
		}
		LotTable.selectLeftmostColumn(0);
	}
	
	// その他
	@Override
	public void screenClearBody() {
		super.screenClearBody();
		getDtlHideL().clear();
		_dtlHideIndexkey = null;
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == LotTable) {
			doBtn_open_MSBEP0010(info);
		}
		else if (compo == DtlTable) {
			doBtn_open_MSBEP0080(info);
		}
	}

}