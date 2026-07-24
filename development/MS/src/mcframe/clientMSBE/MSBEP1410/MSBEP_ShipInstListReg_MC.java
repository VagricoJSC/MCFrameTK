package mcframe.clientMSBE.MSBEP1410;

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
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5360.*;
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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_ShipInstListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ShipInstListReg_MC extends MSBEP_ShipInstListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected final int _SRCH_UPD = 1;
	protected final int _SRCH_DEL = 2;
	protected final int _SRCH_PR = 3;
	protected final int _SRCH_PR_DLV = 6;
	protected final int _SRCH_REF_H = 4;
	protected final int _SRCH_REF_D = 5;
	protected boolean _picklist = false;
	protected boolean _instlist = false;
	protected boolean _dlvlist = false;
	protected boolean _advlist = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipInstListReg_MC() {
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
	public MSBEP_ShipInstListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1410_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1410_Srch01Caller<P extends MSBEP_ShipInstListReg, B extends MS_MSBEL1410_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1410_Srch01Caller(P p, B b) {
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
		}
	}
	
	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(PrStsPanel));
		msgList.addAll(checkAtLeastOne(PickPrntPanel));
		msgList.addAll(checkAtLeastOne(InstPrntPanel));
		msgList.addAll(checkAtLeastOne(DlvPrntPanel));
		msgList.addAll(checkAtLeastOne(AdvPrntPanel));
		switch (getSrchPtn()) {
			case _SRCH_UPD:
			case _SRCH_REF_D:
				msgList.addAll(checkAtLeastOne(AllocStsPanel));
				msgList.addAll(checkAtLeastOne(WmsTrgtPanel));
				break;
		}
	}

	/**
	 * [MS_MSBEL1410_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1410_Ins01Caller<P extends MSBEP_ShipInstListReg, B extends MS_MSBEL1410_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1410_Ins01Caller(P p, B b) {
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
			setBtnMode();
		}
	}

	/**
	 * [MS_MSBEL1410_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1410_Del01Caller<P extends MSBEP_ShipInstListReg, B extends MS_MSBEL1410_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1410_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBEL1410_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1410_Prnt01Caller<P extends MSBEP_ShipInstListReg, B extends MS_MSBEL1410_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1410_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			if (_picklist || _instlist || _advlist) {
				bridge.up0().removeAll(bridge.up0().subList(r -> r.can_flg()));
			}
			if (_dlvlist) {
				bridge.up0().removeAll(bridge.up0().subList(r -> r.non_dlv_prnt_flg()));
			}
			if (_advlist) {
				bridge.up0().removeAll(bridge.up0().subList(r -> r.non_adv_prnt_flg()));
			}
			
			bridge.up0().setBooleanNE(RsltR.$pick_prnt_flg, _picklist);
			bridge.up0().setBooleanNE(RsltR.$inst_prnt_flg, _instlist);
			bridge.up0().setBooleanNE(RsltR.$dlv_prnt_flg, _dlvlist);
			bridge.up0().setBooleanNE(RsltR.$adv_prnt_flg, _advlist);
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			if (getUpParamList(getUpParamBlockIndex(RsltTable)).isEmpty()) {
				return false;
			}
			return super.checkUpListParamEmpty();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
			callMS_MSBEL1410_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
			createMS_MSBEL1410_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1420]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1420(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1420");
		aso.putCnd(crtOpenMSBEP1420CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1420.CndR crtOpenMSBEP1420CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg p = (mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1420.CndR to = mcframe.clientMSBE.MSBEP1420.CndR.create();
		to.ope(p.Cnd_md_SHIP.getActionCommand());
		if (MSC_PR_STS_TYP.isSHIP(r.pr_sts_typ())) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.ship_flg(true);
		}
		else {
			if (isNull(r.ship_inst_no())) {
				to.ope(p.Cnd_ope_UPD.getActionCommand());
				to.not_inst_flg(true);
				to.inst_flg(false);
				to.part_ship_flg(false);
				to.ship_flg(false);
			}
			else {
				to.ope(p.Cnd_ope_REF.getActionCommand());
				to.not_inst_flg(false);
				to.inst_flg(true);
				to.part_ship_flg(true);
				to.ship_flg(true);
			}
		}
		to.not_alloc_flg(true);
		to.part_alloc_flg(true);
		to.all_alloc_flg(true);
		to.alloc_invalid_flg(true);
		to.ship_block_flg(false);
		to.not_ship_block_flg(true);
		to.lg_grp_cd(r.ship_fr_lg_grp_cd());
		if (!isNull(r.ship_schd_no())) {
			to.ship_schd_no(r.ship_schd_no());
		}
		else if (!isNull(r.ship_inst_d_no())) {
			to.ship_inst_d_no(r.ship_inst_d_no());
		}
		else if (!isNull(r.ship_inst_no())) {
			to.ship_inst_no(r.ship_inst_no());
		}
		else {
			to.ship_schd_dt_fr(r.ship_schd_dt());
			to.ship_schd_hm_fr(r.ship_schd_hm());
			to.ship_schd_dt_to(r.ship_schd_dt());
			to.ship_schd_hm_to(r.ship_schd_hm());
			to.dlv_schd_dt_fr(r.dlv_schd_dt());
			to.dlv_schd_hm_fr(r.dlv_schd_hm());
			to.dlv_schd_dt_to(r.dlv_schd_dt());
			to.dlv_schd_hm_to(r.dlv_schd_hm());
			to.ship_to_id_typ(r.ship_to_id_typ());
			to.ship_to_id_cd(r.ship_to_id_cd());
			to.ship_to_id_nm(r.ship_to_id_nm());
			to.ship_term_cd(r.ship_term_cd());
			to.ship_wk_cd(r.ship_wk_cd());
			to.dlv_id_typ(r.dlv_id_typ());
			to.via_dlv_typ(r.via_dlv_typ());
		}
		return to;	
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1400]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1400(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1400");
		aso.putCnd(crtOpenMSBEP1400CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1400.CndR crtOpenMSBEP1400CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg p = (mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1400.CndR to = mcframe.clientMSBE.MSBEP1400.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.ship_inst_no(r.ship_inst_no());
		to.ship_inst_rev(null);
		to.latest_flg(true);
		return to;	
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0110(MCEventInfo info) {
		MCList<RsltR> argL = getRsltL().subList("check", true);
		if (argL.size() <= 0) {
			dialog(msgNoSelectedRow());
			return;
		}

		openPanel("MS", "MSBEP0110", T3, argL.get(0), argL);
	}
	/**
	 * Panel[Btn]のボタン[prnt_pick]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_pick(MCEventInfo info) {
		_picklist = true;
		_instlist = false;
		_dlvlist = false;
		_advlist = false;
		callMS_MSBEL1410_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_inst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_inst(MCEventInfo info) {
		_picklist = false;
		_instlist = true;
		_dlvlist = false;
		_advlist = false;
		callMS_MSBEL1410_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_dlv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_dlv(MCEventInfo info) {
		_picklist = false;
		_instlist = false;
		_dlvlist = true;
		_advlist = false;
		callMS_MSBEL1410_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_adv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_adv(MCEventInfo info) {
		_picklist = false;
		_instlist = false;
		_dlvlist = false;
		_advlist = true;
		callMS_MSBEL1410_Prnt01();
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
	 * Panel[Btn]のボタン[alloc_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_alloc_select_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_alloc_tgt_flg);
	}
	/**
	 * Panel[Btn]のボタン[alloc_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_alloc_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_alloc_tgt_flg);
	}
	/**
	 * Panel[Btn]のボタン[lot_prop_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_lot_prop_select_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_lot_prop_flg);
	}
	/**
	 * Panel[Btn]のボタン[lot_prop_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_lot_prop_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_lot_prop_flg);
	}
	/**
	 * Panel[Btn]のボタン[pack_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_pack_select_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_pack_flg);
	}
	/**
	 * Panel[Btn]のボタン[pack_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_pack_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_pack_flg);
	}
	/**
	 * Panel[Btn]のボタン[pick_prnt_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_pick_prnt_select_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_pick_prnt_flg);
	}
	/**
	 * Panel[Btn]のボタン[pick_prnt_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_pick_prnt_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_pick_prnt_flg);
	}
	/**
	 * Panel[Btn]のボタン[inst_prnt_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_inst_prnt_select_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_inst_prnt_flg);
	}
	/**
	 * Panel[Btn]のボタン[inst_prnt_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_inst_prnt_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_inst_prnt_flg);
	}
	/**
	 * Panel[Btn]のボタン[dlv_prnt_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_dlv_prnt_select_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_dlv_prnt_flg);
	}
	/**
	 * Panel[Btn]のボタン[dlv_prnt_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_dlv_prnt_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_dlv_prnt_flg);
	}
	/**
	 * Panel[Btn]のボタン[adv_prnt_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_adv_prnt_select_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_adv_prnt_flg);
	}
	/**
	 * Panel[Btn]のボタン[adv_prnt_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_adv_prnt_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_adv_prnt_flg);
	}
	/**
	 * Panel[Btn]のボタン[ins01]の押下時の処理
	 */
	@Override
	public void doBtn_ins01(MCEventInfo info) {
		callMS_MSBEL1410_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del01]の押下時の処理
	 */
	@Override
	public void doBtn_del01(MCEventInfo info) {
		callMS_MSBEL1410_Del01();
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
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd,
				columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_ship_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		
		// 有効成分
		Rslt_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_unit_qty, columnRslt_std_cont_fctr, columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_unit_qty, columnRslt_std_cont_fctr, columnRslt_std_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);

		// 取引先分類、品目分類
		Rslt_ship_to_grp_p_PPanel.setRelateBeans(Cnd_ship_to_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
		// 住所
		Rslt_ship_to_addr_p_PPanel.setRelateBeans(columnRslt_ship_to_id_cd, columnRslt_ship_to_id_nm, columnRslt_ship_to_sundry_flg);
		
		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_ship_inst_dt);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_ship_inst_dt);
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
		setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_Hdr.getActionCommand());
		
		setCnd_pr_sts(true, false, false, false);
		setCnd_alloc_sts(true, true, true, true);
		
		setValueEx(Cnd_late_ship, false);
		setValueEx(Cnd_late_rqst, false);

		setPrntFlgOn();
		setWmsFlgOn();
		setValueEx(BulkSet_ship_inst_dt, getToday());
	}
	protected void setCnd_pr_sts(boolean uninst, boolean inst, boolean p_ship, boolean ship) {
		setValueEx(Cnd_uninst, uninst);
		setValueEx(Cnd_inst, inst);
		setValueEx(Cnd_p_ship, p_ship);
		setValueEx(Cnd_ship, ship);
	}
	protected void setCnd_alloc_sts(boolean not, boolean part, boolean all, boolean invalid) {
		setValueEx(Cnd_not_alloc_flg, not);
		setValueEx(Cnd_part_alloc_flg, part);
		setValueEx(Cnd_all_alloc_flg, all);
		setValueEx(Cnd_alloc_invalid_flg, invalid);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// status
	
	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_PRStatus() {
		super.setSRCH_PRStatus();
		Cnd_disp_unit_Dtl.setMode(MCMode.READ_ONLY);
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_PR_DLVStatus() {
		super.setSRCH_PR_DLVStatus();
		Cnd_disp_unit_Dtl.setMode(MCMode.READ_ONLY);
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_REF_HStatus() {
		super.setSRCH_REF_HStatus();
		Cnd_disp_unit_Dlv.setMode(MCMode.READ_ONLY);
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_REF_DStatus() {
		super.setSRCH_REF_DStatus();
		Cnd_disp_unit_Dlv.setMode(MCMode.READ_ONLY);
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		Cnd_disp_unit_Dtl.setMode(MCMode.READ_ONLY);
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setPRNT_DLVStatus() {
		super.setPRNT_DLVStatus();
		Cnd_disp_unit_Dtl.setMode(MCMode.READ_ONLY);
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setREF_HStatus() {
		super.setREF_HStatus();
		Cnd_disp_unit_Dlv.setMode(MCMode.READ_ONLY);
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setREF_DStatus() {
		super.setREF_DStatus();
		Cnd_disp_unit_Dlv.setMode(MCMode.READ_ONLY);
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP1420(r)) {
			setDefaultMode(Btn_open_MSBEP1420);
		}
		else {
			Btn_open_MSBEP1420.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBEP1400(r)) {
			setDefaultMode(Btn_open_MSBEP1400);
		}
		else {
			Btn_open_MSBEP1400.setMode(MCMode.DISABLE);
		}
	}
	protected boolean isEnableBtn_open_MSBEP1420(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	protected boolean isEnableBtn_open_MSBEP1400(RsltR r) {
		if (r == null) {
			return false;
		}
		if (isNull(r.ship_inst_no())) {
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
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (r.check()) {
			bulkSet(BulkSet_ship_inst_dt, r);
			bulkSet(BulkSet_ship_inst_hm, r);
			bulkSet(BulkSet_inst_dpt_cd, r);
			bulkSet(BulkSet_inst_usr_cd, r);
		}
		setBtnMode();
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_ship_inst_dt.addLCListener(this);
		BulkSet_ship_inst_hm.addLCListener(this);
		BulkSet_inst_usr_cd.addLCListener(this);
		BulkSet_inst_dpt_cd.addLCListener(this);
		
		columnRslt_ship_schd_hm.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == BulkSet_ship_inst_dt) {
			bulkSet(BulkSet_ship_inst_dt);
		}
		else if (lc == BulkSet_ship_inst_hm) {
			bulkSet(BulkSet_ship_inst_hm);
		}
		else if (lc == BulkSet_inst_usr_cd) {
			bulkSet(BulkSet_inst_usr_cd);
		}
		else if (lc == BulkSet_inst_dpt_cd) {
			bulkSet(BulkSet_inst_dpt_cd);
		}
		else if (lc == columnRslt_ship_schd_hm) {
			RsltR r = getRsltL().get(info.getEventIndex());
			setShipSchdTimeChar(r);
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
		if (b == BulkSet_ship_inst_dt
				&& isEditable(columnRslt_ship_inst_dt, r.getGUIIndex())) {
			r.ship_inst_dt(getBulkSetR().ship_inst_dt());
		}
		else if (b == BulkSet_ship_inst_hm
				&& isEditable(columnRslt_ship_inst_hm, r.getGUIIndex())) {
			r.ship_inst_hm(getBulkSetR().ship_inst_hm());
		}
		else if (b == BulkSet_inst_usr_cd
				&& isEditable(columnRslt_inst_usr_cd, r.getGUIIndex())) {
			r.inst_usr_cd(getBulkSetR().inst_usr_cd());
			r.inst_usr_nm(getBulkSetR().inst_usr_nm());
		}
		else if (b == BulkSet_inst_dpt_cd
				&& isEditable(columnRslt_inst_dpt_cd, r.getGUIIndex())) {
			r.inst_dpt_cd(getBulkSetR().inst_dpt_cd());
			r.inst_dpt_nm(getBulkSetR().inst_dpt_nm());
		}
	}

	protected void setShipSchdTimeChar(RsltR r) {
		if (!isNull(r.ship_schd_hm())) {
			r.ship_schd_time(lpad(r.ship_schd_hm().getHour(), 2, "0")
					+ lpad(r.ship_schd_hm().getMinute(), 2, "0"));
		}
	}
	
	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
		if (isNull(r.ship_inst_dt())) {
			bulkSet(BulkSet_ship_inst_dt, r);
		}
		if (isNull(r.ship_inst_hm())) {
			bulkSet(BulkSet_ship_inst_hm, r);
		}
		if (isNull(r.inst_usr_cd())) {
			bulkSet(BulkSet_inst_usr_cd, r);
		}
		if (isNull(r.inst_dpt_cd())) {
			bulkSet(BulkSet_inst_dpt_cd, r);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL());
		// 種別に応じて入力不可となる項目をクリアする
		clearCnd();
		setCnd();
		// 一覧をクリアしているため検索前ステータスに戻す
		setSrchStatus();
	}

	@Override
	public void doCnd_disp_unit_NC(MCEventInfo info) {
		super.doCnd_disp_unit_NC(info);
		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL());
		// 種別に応じて入力不可となる項目をクリアする
		clearCnd();
		setCnd();
		// 一覧をクリアしているため検索前ステータスに戻す
		setSrchStatus();
	}


	protected int getSrchPtn() {
		if (Cnd_ope_UPD.isSelected()) {
			return _SRCH_UPD;
		}
		else if (Cnd_ope_DEL.isSelected()) {
			return _SRCH_DEL;
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			if (Cnd_disp_unit_Dlv.isSelected()) {
				return _SRCH_PR_DLV;
			}
			else {
				return _SRCH_PR;
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_disp_unit_Dtl.isSelected()) {
				return _SRCH_REF_D;
			}
			else {
				return _SRCH_REF_H;
			}
		}
		return 0;
	}
	protected void setSrchStatus() {
		switch (getSrchPtn()) {
		case _SRCH_UPD:
			setSRCH_UPDStatus();
			break;
		case _SRCH_DEL:
			setSRCH_DELStatus();
			break;
		case _SRCH_PR:
			setSRCH_PRStatus();
			break;
		case _SRCH_PR_DLV:
			setSRCH_PR_DLVStatus();
			break;
		case _SRCH_REF_H:
			setSRCH_REF_HStatus();
			break;
		case _SRCH_REF_D:
			setSRCH_REF_DStatus();
			break;
		}
	}
	protected void clearCnd() {
		switch (getSrchPtn()) {
		case _SRCH_UPD:
		case _SRCH_DEL:
		case _SRCH_PR:
		case _SRCH_REF_H:
			setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_Hdr.getActionCommand());
			setValueEx(Cnd_late_ship, false);
			setValueEx(Cnd_late_rqst, false);
			setValueEx(Cnd_site_cd, null);
			setValueEx(Cnd_site_nm, null);
			setValueEx(Cnd_wg_cd, null);
			setValueEx(Cnd_wg_nm, null);
			setValueEx(Cnd_ship_loc_cd, null);
			setValueEx(Cnd_ship_loc_nm, null);
			setValueEx(Cnd_ship_str_ln_cd, null);
			setValueEx(Cnd_ship_str_ln_nm, null);
			setValueEx(Cnd_alloc_grp_cd, null);
			setValueEx(Cnd_alloc_grp_nm, null);
			setValueEx(Cnd_dlv_id_typ, null);
			setValueEx(Cnd_dlv_id_typ_nm, null);
			setValueEx(Cnd_dlv_id_cd, null);
			setValueEx(Cnd_dlv_id_nm, null);
			setValueEx(Cnd_cst_cd, null);
			setValueEx(Cnd_cst_nm, null);
			setValueEx(Cnd_trd_cd, null);
			setValueEx(Cnd_trd_nm, null);
			setValueEx(Cnd_itm_typ, null);
			setValueEx(Cnd_itm_typ_d_cd, null);
			setValueEx(Cnd_itm_typ_d_nm, null);
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_itm_sub1, null);
			setValueEx(Cnd_itm_sub2, null);
			setValueEx(Cnd_itm_sub3, null);
			setValueEx(Cnd_itm_nm, null);
			setValueEx(Cnd_cst_itm_cd, null);
			setValueEx(Cnd_iv_itm_nm, null);
			setValueEx(Cnd_ship_schd_no, null);
			setValueEx(Cnd_dlv_slip_no, null);
			setValueEx(Cnd_xfr_schd_no, null);
			setValueEx(Cnd_slo_d_no, null);
			setValueEx(Cnd_slo_no, null);

			if (Cnd_ope_UPD.isSelected()) {
				setValueEx(Cnd_ship_inst_dt_fr, null);
				setValueEx(Cnd_ship_inst_hm_fr, null);
				setValueEx(Cnd_ship_inst_dt_to, null);
				setValueEx(Cnd_ship_inst_hm_to, null);
				setValueEx(Cnd_ship_inst_no, null);
				setValueEx(Cnd_inst_usr_cd, null);
				setValueEx(Cnd_inst_usr_nm, null);
				setValueEx(Cnd_inst_dpt_cd, null);
				setValueEx(Cnd_inst_dpt_nm, null);
				setValueEx(Cnd_inst_rmrks, null);
				setValueEx(Cnd_intr_rmrks, null);
				setValueEx(Cnd_sub_char1, null);
				setValueEx(Cnd_sub_char2, null);
				setValueEx(Cnd_sub_char3, null);
			}
			if (!Cnd_ope_PRNT.isSelected()) {
				setValueEx(Cnd_can_disp_flg, false);
			}
			setValueEx(Cnd_intr_d_rmrks, null);
			setValueEx(Cnd_d_sub_char1, null);
			setValueEx(Cnd_d_sub_char2, null);
			setValueEx(Cnd_d_sub_char3, null);
			setValueEx(Cnd_dlv_grp_flg1, false);
			setValueEx(Cnd_dlv_grp_flg2, false);
			setValueEx(Cnd_dlv_grp_flg3, false);
			setValueEx(Cnd_dlv_grp_flg4, false);
			setValueEx(Cnd_dlv_grp_flg5, false);
			setValueEx(Cnd_dlv_grp_flg6, false);
			setValueEx(Cnd_dlv_grp_flg7, false);
			setValueEx(Cnd_dlv_grp_flg8, false);
			setValueEx(Cnd_dlv_grp_flg9, false);
			setValueEx(Cnd_dlv_grp_flg10, false);
			setValueEx(Cnd_cst_grp_flg1, false);
			setValueEx(Cnd_cst_grp_flg2, false);
			setValueEx(Cnd_cst_grp_flg3, false);
			setValueEx(Cnd_cst_grp_flg4, false);
			setValueEx(Cnd_cst_grp_flg5, false);
			setValueEx(Cnd_cst_grp_flg6, false);
			setValueEx(Cnd_cst_grp_flg7, false);
			setValueEx(Cnd_cst_grp_flg8, false);
			setValueEx(Cnd_cst_grp_flg9, false);
			setValueEx(Cnd_cst_grp_flg10, false);
			setValueEx(Cnd_itm_grp_flg1, false);
			setValueEx(Cnd_itm_grp_flg2, false);
			setValueEx(Cnd_itm_grp_flg3, false);
			setValueEx(Cnd_itm_grp_flg4, false);
			setValueEx(Cnd_itm_grp_flg5, false);
			setValueEx(Cnd_itm_grp_flg6, false);
			setValueEx(Cnd_itm_grp_flg7, false);
			setValueEx(Cnd_itm_grp_flg8, false);
			setValueEx(Cnd_itm_grp_flg9, false);
			setValueEx(Cnd_itm_grp_flg10, false);
			
			break;
		case _SRCH_REF_D:
			break;
		}
	}
	protected void setCnd() {
		switch (getSrchPtn()) {
		case _SRCH_UPD:
			setCnd_pr_sts(true, false, false, false);
			setCnd_alloc_sts(true, true, true, true);
			setPrntFlgOn();
			setWmsFlgOn();
			break;
		case _SRCH_DEL:
			setCnd_pr_sts(false, true, false, false);
			setCnd_alloc_sts(false, false, false, false);
			setPrntFlgOn();
			setWmsFlgOn();
			break;
		case _SRCH_PR:
			setCnd_pr_sts(false, true, true, true);
			setCnd_alloc_sts(false, false, false, false);
			setWmsFlgOn();
			break;
		case _SRCH_PR_DLV:
			setCnd_pr_sts(false, true, true, true);
			setCnd_alloc_sts(false, false, false, false);
			setWmsFlgOn();
			setPickPrntFlgOn();
			setInstPrntFlgOn();
			setValueEx(BulkSet_indiv_prnt_flg, false);
			break;
		case _SRCH_REF_H:
			setCnd_pr_sts(false, true, true, true);
			setCnd_alloc_sts(false, false, false, false);
			setWmsFlgOn();
			break;
		case _SRCH_REF_D:
			setCnd_pr_sts(false, true, true, true);
			setCnd_alloc_sts(true, false, true, true);
			break;
		}
	}
	protected void setPrntFlgOn() {
		setValueEx(Cnd_pick_not_prnted, true);
		setValueEx(Cnd_pick_prnted, true);
		setValueEx(Cnd_inst_not_prnted, true);
		setValueEx(Cnd_inst_prnted, true);
		setValueEx(Cnd_dlv_not_prnted, true);
		setValueEx(Cnd_dlv_prnted, true);
		setValueEx(Cnd_adv_not_prnted, true);
		setValueEx(Cnd_adv_prnted, true);
	}
	protected void setWmsFlgOn() {
		setValueEx(Cnd_not_wms_flg, true);
		setValueEx(Cnd_wms_flg, true);
	}
	protected void setPickPrntFlgOn() {
		setValueEx(Cnd_pick_not_prnted, true);
		setValueEx(Cnd_pick_prnted, true);
	}
	protected void setInstPrntFlgOn() {
		setValueEx(Cnd_inst_not_prnted, true);
		setValueEx(Cnd_inst_prnted, true);
	}
	protected void setRefStatus() {
		switch (getSrchPtn()) {
		case _SRCH_UPD:
			setUPDStatus();
			break;
		case _SRCH_DEL:
			setDELStatus();
			break;
		case _SRCH_PR:
			setPRNTStatus();
			break;
		case _SRCH_PR_DLV:
			setPRNT_DLVStatus();
			break;
		case _SRCH_REF_H:
			setREF_HStatus();
			break;
		case _SRCH_REF_D:
			setREF_DStatus();
			break;
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
			if (!Btn_open_MSBEP1420.isEnabled()) {
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1420");
			aso.putCnd(crtOpenMSBEP1420CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}
	
	// -----------------------------------------------
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
			if (column == columnRslt_pack_flg) {
				if (r.pack_disable_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}