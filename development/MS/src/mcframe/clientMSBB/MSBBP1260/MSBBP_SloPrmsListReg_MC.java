package mcframe.clientMSBB.MSBBP1260;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SloPrmsListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SloPrmsListReg_MC extends MSBBP_SloPrmsListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCIndexKey _ikPrms;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SloPrmsListReg_MC() {
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
	public MSBBP_SloPrmsListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1260_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Srch01Caller<P extends MSBBP_SloPrmsListReg, B extends MS_MSBBL1260_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1260_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		@Override
		protected void show() {
			super.show();

			_ikPrms = getRsltL().createIndex(RsltR.$slo_prms_no);
			for (RsltR r : getRsltL()) {
				MCList<RsltR> prmsL = getRsltL()
						.subList(_ikPrms, r.slo_prms_no())
						.subList(row -> !isNull(row.slo_prms_no()));
				
				if (prmsL.size() > 1) {
					String minShipSchdNo = (String)prmsL.min(RsltR.$ship_schd_no);
					if (isSame(minShipSchdNo, r.ship_schd_no())) {
						r.read_only_flg(false);
					}
					else {
						r.read_only_flg(true);
					}
				}
				else {
					r.read_only_flg(false);
				}
			}
			
			for (RsltR r : getRsltL()) {
				if(r.read_only_flg()) {
					r.slo_prms_h_no(null);
					r.slo_prms_no(null);
					r.slo_prms_rev(null);
					r.prms_dlv_dt(null);
					r.prms_dlv_hm(null);
					r.prms_rmrks(null);
					r.intr_rmrks(null);
					r.sub_char1(null);
					r.sub_char2(null);
					r.sub_char3(null);
				}
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setRefStatus();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
			setBtnMode();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBBL1260_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Srch02Caller<P extends MSBBP_SloPrmsListReg, B extends MS_MSBBL1260_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1260_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setRefStatus();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBBL1260_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Upd01Caller<P extends MSBBP_SloPrmsListReg, B extends MS_MSBBL1260_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		MCList<RsltR> _tgtList;

		protected MS_MSBBL1260_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected void setMode() {
			super.setMode();

		}
	}

	/**
	 * [MS_MSBBL1260_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Del01Caller<P extends MSBBP_SloPrmsListReg, B extends MS_MSBBL1260_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1260_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBBL1260_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1260_Prnt01Caller<P extends MSBBP_SloPrmsListReg, B extends MS_MSBBL1260_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1260_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * 検索条件のチェックの共通処理。
	 * @param msgList メッセージリスト
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		
		msgList.addAll(checkAtLeastOne(EdiPanel));
		msgList.addAll(checkAtLeastOne(PrmsStsPanel));
		msgList.addAll(checkAtLeastOne(PrmsPrntPanel));
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		
		if (Cnd_ope_UPD.isSelected()) {
			
			callMS_MSBBL1260_Srch01();
		}
		else {
			
			callMS_MSBBL1260_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		
		if (Cnd_ope_UPD.isSelected()) {
			
			createMS_MSBBL1260_Srch01().execDL();
		}
		else {
			
			createMS_MSBBL1260_Srch02().execDL();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1230]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1230(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBBP1230(r);
	}
	protected void doBtn_open_MSBBP1230(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1230");
		aso.putCnd(crtOpenMSBBP1230CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 販売納期調整画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1230.CndR crtOpenMSBBP1230CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		
		mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg p = 
				(mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg)aso.getPanel();
		
		mcframe.clientMSBB.MSBBP1230.CndR to = mcframe.clientMSBB.MSBBP1230.CndR.create();
		if (Cnd_ope_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		to.slo_no(r.slo_no());
		
		return to;
	}

	/**
	 * Panel[Btn]のボタン[prnt_prms]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_prms(MCEventInfo info) {
		callMS_MSBBL1260_Prnt01();
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
	 * Panel[Btn]のボタン[edi_prms_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_edi_prms_select_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_edi_prms_flg);
	}
	/**
	 * Panel[Btn]のボタン[edi_prms_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_edi_prms_deselect_all(MCEventInfo info) {
		for (RsltR r : RsltTable.getViewRows()) {
			int i = r.getGUIIndex();
			if (isEditable(columnRslt_edi_prms_flg, i)) {
				setValueEx(columnRslt_edi_prms_flg, i, false);
				setValueEx(columnRslt_check, i, true);
			}
		}
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1260_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1260_Del01();
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

		// 数量
		Rslt_slo_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_slo_trd_unit_cd, columnRslt_slo_trd_unit_dec_place);
		Rslt_dlv_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_trd_unit_prms_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		// 分類項目
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
	}
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(Cnd_edi_flg, true);
		setValueEx(Cnd_not_edi_flg, true);
		setValueEx(Cnd_prms_flg, true);
		setValueEx(Cnd_not_prms_flg, true);
		setValueEx(Cnd_prms_not_prnted, true);
		setValueEx(Cnd_prms_prnted, true);
		setValueEx(Btn_prnt_out_flg, true);
		setValueEx(Btn_indiv_prnt_flg, true);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);

		RsltR dtlR = getRsltL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (dtlR.check()) {
			bulkSet(BulkSet_prms_dlv_dt, dtlR);
			bulkSet(BulkSet_prms_dlv_hm, dtlR);
			
			if (isNull(dtlR.slo_prms_no()) && isNull(getBulkSetR().prms_dlv_dt())) {
				dtlR.prms_dlv_dt(dtlR.dlv_schd_dt());
			}
			if (isNull(dtlR.slo_prms_no()) && isNull(getBulkSetR().prms_dlv_hm())) {
				dtlR.prms_dlv_hm(dtlR.dlv_schd_hm());
			}
		}

		if (Cnd_ope_PRNT.isSelected()) {
			getRsltL().forEach(r -> {
				if (r != dtlR && isSame(r.slo_d_no(), dtlR.slo_d_no())) {
					setValueEx(columnRslt_check, r.getGUIIndex(), dtlR.check());
				}
			});
		}
	}

	@Override
	public void doRslt_edi_prms_flg_NC(MCEventInfo info) {
		super.doRslt_edi_prms_flg_NC(info);

		RsltR dtlR = getRsltL().get(info.getEventIndex());
		// 同一受注明細NOのフラグを同期する
		String sloDNo = dtlR.slo_d_no();
		if (!isNull(sloDNo)) {
			MCList<RsltR> l = getRsltL().subList(RsltR.$slo_d_no, sloDNo);
			l.forEach(r -> {
				r.setValue(RsltR.$edi_prms_flg, dtlR.edi_prms_flg());
				setValueEx(columnRslt_check, r.getGUIIndex(), true);
			});
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		BulkSet_prms_dlv_dt.addLCListener(this);
		BulkSet_prms_dlv_hm.addLCListener(this);
		
		columnRslt_prms_dlv_dt.addLCListener(this);
		columnRslt_prms_dlv_hm.addLCListener(this);
		columnRslt_prms_rmrks.addLCListener(this);
		columnRslt_intr_rmrks.addLCListener(this);
		columnRslt_sub_char1.addLCListener(this);
		columnRslt_sub_char2.addLCListener(this);
		columnRslt_sub_char3.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == BulkSet_prms_dlv_dt) {
			bulkSet(BulkSet_prms_dlv_dt);
		}
		else if (lc == BulkSet_prms_dlv_hm) {
			bulkSet(BulkSet_prms_dlv_hm);
		}
	}

	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;

		if (isNull(r.prms_dlv_dt())) {
			bulkSet(BulkSet_prms_dlv_dt, r);
		}
		if (isNull(r.prms_dlv_hm())) {
			bulkSet(BulkSet_prms_dlv_hm, r);
		}
		
		if (isNull(r.slo_prms_no()) && isNull(getBulkSetR().prms_dlv_dt())) {
			r.prms_dlv_dt(r.dlv_schd_dt());
		}
		if (isNull(r.slo_prms_no()) && isNull(getBulkSetR().prms_dlv_hm())) {
			r.prms_dlv_hm(r.dlv_schd_hm());
		}
	}

	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	protected void bulkSet(MCBeans b, RsltR r) {
		if (b == BulkSet_prms_dlv_dt && isEditable(columnRslt_prms_dlv_dt, r.getGUIIndex()) && isNull(r.slo_prms_no())) {
			r.prms_dlv_dt(getBulkSetR().prms_dlv_dt());
		}
		else if (b == BulkSet_prms_dlv_hm && isEditable(columnRslt_prms_dlv_hm, r.getGUIIndex()) && isNull(r.slo_prms_no())) {
			r.prms_dlv_hm(getBulkSetR().prms_dlv_hm());
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
		clearCnd();
		setSrchStatus();
		setPrntFlg();
	}

	protected void clearCnd() {
		setBoolean(EdiPanel, true);
		setBoolean(PrmsPrntPanel, true);
		setValueEx(BulkSet_prms_dlv_dt, null);
		setValueEx(BulkSet_prms_dlv_hm, null);
		
		if (Cnd_ope_UPD.isSelected()) {
			setBoolean(PrmsStsPanel, true);
			setValueEx(Cnd_incl_can_flg, false);
		}
		else {
			if(Cnd_ope_DEL.isSelected()) {
				setValueEx(Cnd_incl_can_flg, false);
				setValueEx(Cnd_prms_flg, true);
				setValueEx(Cnd_not_prms_flg, false);
			}
			else {
				setValueEx(Cnd_prms_flg, true);
				setValueEx(Cnd_not_prms_flg, false);
			}
			
			setValueEx(Cnd_ship_rqst_dt_fr, null);
			setValueEx(Cnd_ship_rqst_hm_fr, null);
			setValueEx(Cnd_ship_rqst_dt_to, null);
			setValueEx(Cnd_ship_rqst_hm_to, null);
			setValueEx(Cnd_pd_inst_dlv_dt_fr, null);
			setValueEx(Cnd_pd_inst_dlv_hm_fr, null);
			setValueEx(Cnd_pd_inst_dlv_dt_to, null);
			setValueEx(Cnd_pd_inst_dlv_hm_to, null);
			setValueEx(Cnd_ship_schd_dt_fr, null);
			setValueEx(Cnd_ship_schd_hm_fr, null);
			setValueEx(Cnd_ship_schd_dt_to, null);
			setValueEx(Cnd_ship_schd_hm_to, null);
			setValueEx(Cnd_dlv_schd_dt_fr, null);
			setValueEx(Cnd_dlv_schd_hm_fr, null);
			setValueEx(Cnd_dlv_schd_dt_to, null);
			setValueEx(Cnd_dlv_schd_hm_to, null);
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_dlv_nm, null);
			setValueEx(Cnd_ship_schd_no, null);
			
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg1, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg2, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg3, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg4, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg5, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg6, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg7, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg8, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg9, false);
			setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg10, false);
		}
	}

	protected void setPrntFlg(){
		setValueEx(Btn_prnt_out_flg, true);
		setValueEx(Btn_indiv_prnt_flg, true);
	}

	/**
	 * 削除ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		
		RsltR r = RsltTable.getSelectedMCRow();
		
		if (isSame(getStatus(), UPD)) {
			if (!isNull(r) && isNull(r.slo_prms_no())) {
				Btn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_rdel);
			}
		}
	}
	// -----------------------------------------------
	// status

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isPrntStatus() {
		return isSame(getStatus(), PRNT);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus() || isPrntStatus();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		setEdiPrmsFlg();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		
		getRsltL().setStatus(Status.NONE);
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		
		setEdiPrmsFlg();
	}
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		
		getRsltL().setStatus(Status.NONE);
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		
		FoldTab.focusActiveFirstComponent();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
			RsltTable.setStatusColumnVisible(true);
		}
		else if (Cnd_ope_DEL.isSelected() || Cnd_ope_PRNT.isSelected()) {
			setSRCH_DELStatus();
			RsltTable.setStatusColumnVisible(false);
			if(Cnd_ope_PRNT.isSelected()) {
				Cnd_incl_can_flg.setMode(MCMode.ENABLE);
			}
		}
		else {
			setSRCH_REFStatus();
			RsltTable.setStatusColumnVisible(false);
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
			RsltTable.setStatusColumnVisible(true);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
			RsltTable.setStatusColumnVisible(false);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
			RsltTable.setStatusColumnVisible(false);
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
			RsltTable.setStatusColumnVisible(false);
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setEdiPrmsFlg() {
		for (RsltR r : getRsltL()) {
			// ＥＤＩ納期回答送信対象を今回ＥＤＩ納期回答にコピーする。
			r.edi_prms_flg(r.edi_send_flg());
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r == null) {
				return;
			}
			if (!Btn_open_MSBBP1230.isEnabled()) {
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1230");
			aso.putCnd(crtOpenMSBBP1230CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}

// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}
	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}
	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			if (isUpdStatus() || isDelStatus()) {
				
				if (r.after_exec_flg() && !isNull(r.slo_prms_no())) {
					return MCMode.READ_ONLY;
				}
				
				if (column == columnRslt_edi_prms_flg) {
					if (r.edi_send_flg()) {
						return MCMode.ENABLE;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}