package mcframe.clientMSBE.MSBEP1450;

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
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
 * 画面"MSBEP_ShipActListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ShipActListReg_MC extends MSBEP_ShipActListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipActListReg_MC() {
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
	public MSBEP_ShipActListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[prnt_dlv_slip]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_dlv_slip(MCEventInfo info) {
		MCList<RsltR> checkedL = getRsltL().subList(RsltR.$check, true);
		if (checkedL.size() == 0) {
			dialog(msgNoSelectedRow());
			return;
		}
		checkedL.setBoolean(RsltR.$dlv_prnt_flg, true);
		checkedL.setBoolean(RsltR.$adv_prnt_flg, false);

		callMS_MSBEL1450_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_ship_adv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_ship_adv(MCEventInfo info) {
		MCList<RsltR> checkedL = getRsltL().subList(r -> r.check() && !r.can_flg());
		if (checkedL.size() == 0) {
			dialog(msgNoSelectedRow());
			return;
		}
		checkedL.setBoolean(RsltR.$dlv_prnt_flg, false);
		checkedL.setBoolean(RsltR.$adv_prnt_flg, true);

		callMS_MSBEL1450_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_stklst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_stklst(MCEventInfo info) {
		MCList<RsltR> checkedL = getRsltL().subList(r -> r.check() && !r.can_flg());
		if (checkedL.size() == 0) {
			dialog(msgNoSelectedRow());
			return;
		}

		openPanel("MS", "MSBEP0110", T2, checkedL.get(0), checkedL);
	}
	/**
	 * [MS_MSBEL1450_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1450_Srch01Caller<P extends MSBEP_ShipActListReg, B extends MS_MSBEL1450_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1450_Srch01Caller(P p, B b) {
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

		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(PrStsPanel));
			msgList.addAll(checkAtLeastOne(DlvPrntPanel));
			msgList.addAll(checkAtLeastOne(AdvPrntPanel));
			
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
			msgList.addAll(checkAtLeastOne(WmsTrgtPanel));
		}

		@Override
		protected void show() {
			super.show();
			if (Cnd_ope_UPD.isSelected()) {
				for (RsltR r : getRsltL()) {
					r.ship_dt(r.ship_schd_dt());
					r.ship_hm(r.ship_schd_hm());
					r.dlv_dt(r.dlv_schd_dt());
					r.dlv_hm(r.dlv_schd_hm());
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();

			setRefStatus();
			setBulkSetWMSInfo();
		}
		
		protected void setBulkSetWMSInfo() {
			getBulkSetR().wms_flg(getCndR().wms_flg());
			getBulkSetR().not_wms_flg(getCndR().not_wms_flg());
		}
	}

	/**
	 * [MS_MSBEL1450_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1450_Ins01Caller<P extends MSBEP_ShipActListReg, B extends MS_MSBEL1450_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1450_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void setupParam() {
			super.setupParam();

			bridge.up1().clear();
			MCIndexKey idx = getDtlL().createIndex(DtlR.$ship_inst_no);
			for (RsltR r : bridge.up0()) {
				bridge.up1().addAll(getDtlL().subList(idx, r.ship_inst_no()));
			}
		}
	}

	/**
	 * [MS_MSBEL1450_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1450_Del01Caller<P extends MSBEP_ShipActListReg, B extends MS_MSBEL1450_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1450_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void setupParam() {
			super.setupParam();

			bridge.up1().clear();
			MCIndexKey idx = getDtlL().createIndex(DtlR.$ship_act_no);
			for (RsltR r : bridge.up0()) {
				bridge.up1().addAll(getDtlL().subList(idx, r.ship_act_no()));
			}
		}
	}

	/**
	 * [MS_MSBEL1450_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1450_Prnt01Caller<P extends MSBEP_ShipActListReg, B extends MS_MSBEL1450_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1450_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			if (!bridge.up0().isEmpty()) {
				if (bridge.up0().get(0).dlv_prnt_flg()) {
					bridge.up0().removeAll(bridge.up0().subList(r -> r.non_dlv_prnt_flg()));
				}
			}
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
		callMS_MSBEL1450_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL1450_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1440]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1440(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP1440(r);
	}
	protected void doBtn_open_MSBEP1440(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1440");
		aso.putCnd(crtOpenMSBEP1440CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1440.CndR crtOpenMSBEP1440CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg pnl = 
				(mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1440.CndR bind = mcframe.clientMSBE.MSBEP1440.CndR.create();
		
		if (!isNull(r.ship_act_no())) {
			if (r.can_flg()) {
				bind.ope(pnl.Cnd_ope_REF.getActionCommand());
			}
			else {
				bind.ope(pnl.Cnd_ope_UPD.getActionCommand());
			}
			bind.srch_tgt_typ_nm(MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO.name(mcframe.clientCore.sys.MCSys.user.locale()));
			bind.srch_tgt_no(r.ship_act_no());
		} 
		else {
			bind.ope(pnl.Cnd_ope_INS.getActionCommand());
			bind.srch_tgt_typ_nm(MSC_STK_SRCH_TGT_TYP.SHIP_INST_NO.name(mcframe.clientCore.sys.MCSys.user.locale()));
			bind.srch_tgt_no(r.ship_inst_no());
		}
		return bind;
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1450_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1450_Del01();
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

		Rslt_ac_dt_p_PPanel.setRelateBeans(columnRslt_ship_dt);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_schd_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_act_cont_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_std_cont_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		BulkSet_ac_dt_p_PPanel.setRelateBeans(BulkSet_ship_dt);
		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_ac_dt);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_ac_dt);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
		Rslt_qty_p_PPanel.columnQty_qty.setName("qty_p.qty");
		Rslt_base_qty_p_PPanel.columnQty_qty.setName("base_qty_p.qty");
		Rslt_schd_qty_p_PPanel.columnQty_qty.setName("schd_qty_p.qty");
		Rslt_inst_qty_p_PPanel.columnQty_qty.setName("inst_qty_p.qty");
		Rslt_act_cont_p_PPanel.columnContQty_cont_qty.setName("act_cont_p.cont_qty");
		Rslt_std_cont_p_PPanel.columnContQty_cont_qty.setName("std_cont_p.cont_qty");
		Rslt_ship_p_PPanel.columnYmdHm_ymd.setName("ship_p.ymd");
		Rslt_ship_p_PPanel.columnYmdHm_hm.setName("ship_p.hm");
		Rslt_dlv_p_PPanel.columnYmdHm_ymd.setName("dlv_p.ymd");
		Rslt_dlv_p_PPanel.columnYmdHm_hm.setName("dlv_p.hm");
		Rslt_ship_inst_p_PPanel.columnYmdHm_ymd.setName("ship_inst_p.ymd");
		Rslt_ship_inst_p_PPanel.columnYmdHm_hm.setName("ship_inst_p.hm");
		Rslt_ship_schd_p_PPanel.columnYmdHm_ymd.setName("ship_schd_p.ymd");
		Rslt_ship_schd_p_PPanel.columnYmdHm_hm.setName("ship_schd_p.hm");
		Rslt_dlv_schd_p_PPanel.columnYmdHm_ymd.setName("dlv_schd_p.ymd");
		Rslt_dlv_schd_p_PPanel.columnYmdHm_hm.setName("dlv_schd_p.hm");
		Rslt_dlv_rqst_p_PPanel.columnYmdHm_ymd.setName("dlv_rqst_p.ymd");
		Rslt_dlv_rqst_p_PPanel.columnYmdHm_hm.setName("dlv_rqst_p.hm");
		Rslt_pd_inst_dlv_p_PPanel.columnYmdHm_ymd.setName("pd_inst_dlv_p.ymd");
		Rslt_pd_inst_dlv_p_PPanel.columnYmdHm_hm.setName("pd_inst_dlv_p.hm");
		Rslt_ship_rqst_p_PPanel.columnYmdHm_ymd.setName("ship_rqst_p.ymd");
		Rslt_ship_rqst_p_PPanel.columnYmdHm_hm.setName("ship_rqst_p.hm");
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
		setValueEx(Cnd_md_Group, Cnd_md_HDR.getActionCommand());

		setValueEx(Cnd_not_ship_flg, true);
		setValueEx(Cnd_dlv_not_prnted, true);
		setValueEx(Cnd_dlv_prnted, true);
		setValueEx(Cnd_adv_not_prnted, true);
		setValueEx(Cnd_adv_prnted, true);

		setValueEx(Cnd_ship_schd_dt_to, getToday());
		setValueEx(Cnd_ship_inst_dt_to, getToday());
		setValueEx(BulkSet_ship_dt, getToday());
		setValueEx(BulkSet_ac_dt, getToday());
		setValueEx(BulkSet_act_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
		setCndWmsTrgt();
	}
	/**
	 * 操作種別によるWMS対象の初期値を設定する
	 */
	protected void setCndWmsTrgt() {
		if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_wms_flg, false);
			setValueEx(Cnd_not_wms_flg, true);
		} else if (Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_wms_flg, false);
			setValueEx(Cnd_not_wms_flg, true);
		} else if (Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_wms_flg, true);
			setValueEx(Cnd_not_wms_flg, true);
		} else if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_wms_flg, true);
			setValueEx(Cnd_not_wms_flg, true);
		}
	}

	@Override
	protected void fillSpaceForOpen() {
	}

	protected void fillSpace() {
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public MCList getCnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info) {
		row.setDateNE("dt", BulkSet_ac_dt.getValue());
		return super.getCnd_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
	}
	
	@Override
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info) {
		row.setDateNE("dt", BulkSet_ac_dt.getValue());
		return super.getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
	}

	// -----------------------------------------------
	// status
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		getRsltL().setStatus(Status.NONE);
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setBtnMode();
	}
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		getRsltL().setStatus(Status.NONE);
	}
	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		Cnd_md_DTL.setMode(MCMode.READ_ONLY);
		setBtnMode();
	}
	@Override
	public void setSRCH_PRNT_DLVStatus() {
		super.setSRCH_PRNT_DLVStatus();
		Cnd_md_DTL.setMode(MCMode.READ_ONLY);
		setBtnMode();
	}
	@Override
	public void setPRNT_DLVStatus() {
		super.setPRNT_DLVStatus();
		Cnd_md_DTL.setMode(MCMode.READ_ONLY);
		setBtnMode();
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		setValueEx(Cnd_md_Group, Cnd_md_HDR.getActionCommand());
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		if (Cnd_ope_DEL.isSelected()) {
			// 帳票発行モードはENABLE
			Cnd_md_Group.setMode(MCMode.READ_ONLY);
			Cnd_dlv_not_prnted.setMode(MCMode.READ_ONLY);
			Cnd_dlv_prnted.setMode(MCMode.READ_ONLY);
			Cnd_adv_not_prnted.setMode(MCMode.READ_ONLY);
			Cnd_adv_prnted.setMode(MCMode.READ_ONLY);
			Cnd_can_disp_flg.setMode(MCMode.READ_ONLY);
			columnRslt_non_dlv_prnt_flg.setMode(MCMode.INVISIBLE);
		}
		else {
			// 帳票発行モードでは「ヘッダ」または「納品書」のみ
			Cnd_md_DTL.setMode(MCMode.READ_ONLY);
		}
		setValueEx(Cnd_md_Group, Cnd_md_HDR.getActionCommand());
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCH_REF_HDRStatus() {
		super.setSRCH_REF_HDRStatus();
		// 「納品書」は帳票発行モードのみ
		Cnd_md_DLV.setMode(MCMode.READ_ONLY);
		Cnd_not_ship_flg.setValue(true);
		Cnd_ship_flg.setValue(true);
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCH_REF_DTLStatus() {
		super.setSRCH_REF_DTLStatus();
		// 「納品書」は帳票発行モードのみ
		Cnd_md_DLV.setMode(MCMode.READ_ONLY);
		Cnd_not_ship_flg.setValue(true);
		Cnd_ship_flg.setValue(true);
		if (Cnd_md_DLV.isSelected()) {
			setValueEx(Cnd_md_Group, Cnd_md_HDR.getActionCommand());
		}
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		Cnd_md_DLV.setMode(MCMode.READ_ONLY);
		RsltTable.selectLeftmostColumn(0);
		setREF_cndMode();
		setBtnMode();
	}

	@Override
	public void setREF_DTLStatus() {
		super.setREF_DTLStatus();
		Cnd_md_DLV.setMode(MCMode.READ_ONLY);
		RsltTable.selectLeftmostColumn(0);
		setREF_cndMode();
		setBtnMode();
	}

	protected void setBtnMode() {
		if (isEnableBtn_open_MSBEP1440()) {
			setDefaultMode(Btn_open_MSBEP1440);
		}
		else {
			Btn_open_MSBEP1440.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 出荷実績登録画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP1440() {
		RsltR r = RsltTable.getSelectedMCRow();
		return r != null && (!isNull(r.ship_inst_no()) || !isNull(r.ship_act_no()));
	}

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

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()
				|| Cnd_ope_PRNT.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			if(Cnd_md_HDR.isSelected()) {
				setSRCH_REF_HDRStatus();
			}
			else {
				setSRCH_REF_DTLStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			if (Cnd_md_HDR.isSelected()) {
				setPRNTStatus();
			}
			else if (Cnd_md_DLV.isSelected()) {
				setPRNT_DLVStatus();
			}
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_md_HDR.isSelected()) {
				setREF_HDRStatus();
			}
			else if (Cnd_md_DTL.isSelected()) {
				setREF_DTLStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
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
			bulkSet(BulkSet_ship_dt, r);
			bulkSet(BulkSet_ship_hm, r);
			bulkSet(BulkSet_dlv_dt, r);
			bulkSet(BulkSet_dlv_hm, r);
			bulkSet(BulkSet_ac_dt, r);
			bulkSet(BulkSet_act_usr_cd, r);
			bulkSet(BulkSet_act_dpt_cd, r);
		}
		setBtnMode();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		BulkSet_ship_dt.addLCListener(this);
		BulkSet_ship_hm.addLCListener(this);
		BulkSet_dlv_dt.addLCListener(this);
		BulkSet_dlv_hm.addLCListener(this);
		BulkSet_ac_dt.addLCListener(this);
		BulkSet_act_usr_cd.addLCListener(this);
		BulkSet_act_dpt_cd.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == BulkSet_ship_dt) {
			bulkSet(BulkSet_ship_dt);
		}
		else if (lc == BulkSet_ship_hm) {
			bulkSet(BulkSet_ship_hm);
		}
		if (lc == BulkSet_dlv_dt) {
			bulkSet(BulkSet_dlv_dt);
		}
		else if (lc == BulkSet_dlv_hm) {
			bulkSet(BulkSet_dlv_hm);
		}
		else if (lc == BulkSet_ac_dt) {
			bulkSet(BulkSet_ac_dt);
		}
		else if (lc == BulkSet_act_usr_cd) {
			bulkSet(BulkSet_act_usr_cd);
		}
		else if (lc == BulkSet_act_dpt_cd) {
			bulkSet(BulkSet_act_dpt_cd);
		}
	}

	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;

		if (isNull(r.ship_dt())) {
			bulkSet(BulkSet_ship_dt, r);
		}
		if (isNull(r.ship_hm())) {
			bulkSet(BulkSet_ship_hm, r);
		}
		if (isNull(r.dlv_dt())) {
			bulkSet(BulkSet_dlv_dt, r);
		}
		if (isNull(r.dlv_hm())) {
			bulkSet(BulkSet_dlv_hm, r);
		}
		if (isNull(r.ac_dt())) {
			bulkSet(BulkSet_ac_dt, r);
		}
		if (isNull(r.act_usr_cd())) {
			bulkSet(BulkSet_act_usr_cd, r);
		}
		if (isNull(r.act_dpt_cd())) {
			bulkSet(BulkSet_act_dpt_cd, r);
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
		if (b == BulkSet_ship_dt && isEditable(columnRslt_ship_dt, r.getGUIIndex()) && !isNull(getBulkSetR().ship_dt())) {
			r.ship_dt(getBulkSetR().ship_dt());
		}
		else if (b == BulkSet_ship_hm && isEditable(columnRslt_ship_hm, r.getGUIIndex()) && !isNull(getBulkSetR().ship_hm())) {
			r.ship_hm(getBulkSetR().ship_hm());
		}
		if (b == BulkSet_dlv_dt && isEditable(columnRslt_dlv_dt, r.getGUIIndex()) && !isNull(getBulkSetR().dlv_dt())) {
			r.dlv_dt(getBulkSetR().dlv_dt());
		}
		else if (b == BulkSet_dlv_hm && isEditable(columnRslt_dlv_hm, r.getGUIIndex()) && !isNull(getBulkSetR().dlv_hm())) {
			r.dlv_hm(getBulkSetR().dlv_hm());
		}
		else if (b == BulkSet_ac_dt && isEditable(columnRslt_ac_dt, r.getGUIIndex())) {
			r.ac_dt(getBulkSetR().ac_dt());
		}
		else if (b == BulkSet_act_usr_cd && isEditable(columnRslt_act_usr_cd, r.getGUIIndex())) {
			r.act_usr_cd(getBulkSetR().act_usr_cd());
			r.act_usr_nm(getBulkSetR().act_usr_nm());
		}
		else if (b == BulkSet_act_dpt_cd && isEditable(columnRslt_act_dpt_cd, r.getGUIIndex())) {
			r.act_dpt_cd(getBulkSetR().act_dpt_cd());
			r.act_dpt_nm(getBulkSetR().act_dpt_nm());
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
		fillSpace();
		setSrchStatus();
		setStatusColumn();
		setGrpCnd();
		setCndWmsTrgt();
	}

	@Override
	public void doCnd_md_NC(MCEventInfo info) {
		super.doCnd_md_NC(info);

		clearContainers(getRsltL());
		setGrpCnd();
		
		if(Cnd_ope_REF.isSelected()) {
			clearCnd();
			if(Cnd_md_HDR.isSelected()) {
				setSRCH_REF_HDRStatus();
			}
			else {
				setSRCH_REF_DTLStatus();
			}
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			if(Cnd_md_HDR.isSelected()) {
				setSRCH_DELStatus();
			}
			else {
				setSRCH_PRNT_DLVStatus();
			}
		}
		setCndWmsTrgt();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void doCnd_ship_flg_NC(MCEventInfo info){
		super.doCnd_ship_flg_NC(info);

		setREF_cndMode();
	}

	protected void setREF_cndMode() {
		if(!Cnd_ship_flg.getValue()) {
			Cnd_act_usr_cd.clear();
			Cnd_act_dpt_cd.clear();
			Cnd_act_usr_cd.setMode(MCMode.READ_ONLY);
			Cnd_act_dpt_cd.setMode(MCMode.READ_ONLY);

			Cnd_ship_act_no.clear();
			Cnd_ship_act_no.clear();
			Cnd_ship_act_no.setMode(MCMode.READ_ONLY);
			Cnd_ship_act_no.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_act_usr_cd.setMode(MCMode.ENABLE);
			Cnd_act_dpt_cd.setMode(MCMode.ENABLE);
			
			Cnd_ship_act_no.setMode(MCMode.ENABLE);
			Cnd_ship_act_no.setMode(MCMode.ENABLE);
		}
	}
	protected void clearCnd() {
		if (Cnd_ope_UPD.isSelected()) {
			clearCndComm();
			setValueEx(Cnd_not_ship_flg, true);
			setValueEx(Cnd_ship_flg, false);
			setValueEx(Cnd_ship_dt_fr, null);
			setValueEx(Cnd_ship_dt_to, null);
			setValueEx(Cnd_ac_dt_fr, null);
			setValueEx(Cnd_ac_dt_to, null);
			setValueEx(Cnd_act_usr_cd, null);
			setValueEx(Cnd_act_dpt_cd, null);
			setValueEx(Cnd_ship_act_no, null);
			setValueEx(Cnd_intr_rmrks, null);
			setValueEx(Cnd_sub_char1, null);
			setValueEx(Cnd_sub_char2, null);
			setValueEx(Cnd_sub_char3, null);

			if (isNull(getCndR().ship_schd_dt_to())) {
				setValueEx(Cnd_ship_schd_dt_to, getToday());
			}
			if (isNull(getCndR().ship_inst_dt_to())) {
				setValueEx(Cnd_ship_inst_dt_to, getToday());
			}
			setValueEx(Cnd_ext_ship_act_no, null);
		}
		else if (Cnd_ope_DEL.isSelected() 
				|| Cnd_ope_PRNT.isSelected()) {
			clearCndComm();
			setValueEx(Cnd_not_ship_flg, false);
			setValueEx(Cnd_ship_flg, true);
			setValueEx(Cnd_ship_schd_dt_fr, null);
			setValueEx(Cnd_ship_schd_dt_to, null);
			setValueEx(Cnd_ship_inst_dt_fr, null);
			setValueEx(Cnd_ship_inst_dt_to, null);
			setValueEx(Cnd_dlv_schd_dt_fr, null);
			setValueEx(Cnd_dlv_schd_dt_to, null);
			setValueEx(Cnd_ship_inst_no, null);
			setValueEx(Cnd_iv_no, null);
			setValueEx(Cnd_ext_ship_act_no, null);
		}
		else if (Cnd_ope_REF.isSelected() && Cnd_md_HDR.isSelected()) {
			clearCndComm();
			setValueEx(Cnd_ext_ship_act_no, null);
		}
		else {
		}
	}
	protected void clearCndComm() {
		if(!Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_dlv_rqst_flg, false);
			setValueEx(Cnd_ship_rqst_flg, false);
			setValueEx(Cnd_pd_inst_dlv_flg, false);
		}
		if(!Cnd_ope_PRNT.isSelected()
			&& !Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_dlv_not_prnted, true);
			setValueEx(Cnd_dlv_prnted, true);
			setValueEx(Cnd_adv_not_prnted, true);
			setValueEx(Cnd_adv_prnted, true);
		}
		if(!Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_can_disp_flg, false);
		}
		setValueEx(Cnd_site_cd, null);
		setValueEx(Cnd_wg_cd, null);
		setValueEx(Cnd_ship_loc_cd, null);
		setValueEx(Cnd_ship_str_ln_cd, null);
		setValueEx(Cnd_alloc_grp_cd, null);
		setValueEx(Cnd_dlv_id_typ, null);
		setValueEx(Cnd_dlv_id_cd, null);
		setValueEx(Cnd_cst_cd, null);
		setValueEx(Cnd_trd_cd, null);
		setValueEx(Cnd_itm_typ, null);
		setValueEx(Cnd_itm_typ_d_cd, null);
		setValueEx(Cnd_itm_cd, null);
		setValueEx(Cnd_cst_itm_cd, null);
		setValueEx(Cnd_ship_schd_no, null);
		setValueEx(Cnd_ship_act_d_no, null);
		setValueEx(Cnd_dlv_slip_no, null);
		setValueEx(Cnd_slo_no, null);
		setValueEx(Cnd_intr_d_rmrks, null);
		setValueEx(Cnd_d_sub_char1, null);
		setValueEx(Cnd_d_sub_char2, null);
		setValueEx(Cnd_d_sub_char3, null);
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	protected void setGrpCnd() {
		if (!Cnd_ope_REF.isSelected() || !Cnd_md_DTL.isSelected()) {
			for (MCRowBeans b : getGrpFlgCols()) {
				setValueAndMode(b, false, MCMode.READ_ONLY);
			}
		}
		else {
			for (MCRowBeans b : getGrpFlgCols()) {
				setValueAndMode(b, null, MCMode.REQUIRED);
			}
		}
	}
	protected void setValueAndMode(MCRowBeans b, Comparable v, MCMode m) {
		if (!isNull(v)) {
			setValueEx(b, v);
		}
		((MCModeBeans) b).setMode(m);
	}
	protected MCRowBeans[] getGrpFlgCols() {
		return new MCRowBeans[] {
				Cnd_dlv_grp_flg1, Cnd_dlv_grp_flg2, Cnd_dlv_grp_flg3,
				Cnd_dlv_grp_flg4, Cnd_dlv_grp_flg5, Cnd_dlv_grp_flg6,
				Cnd_dlv_grp_flg7, Cnd_dlv_grp_flg8, Cnd_dlv_grp_flg9,
				Cnd_dlv_grp_flg10, Cnd_cst_grp_flg1, Cnd_cst_grp_flg2,
				Cnd_cst_grp_flg3, Cnd_cst_grp_flg4, Cnd_cst_grp_flg5,
				Cnd_cst_grp_flg6, Cnd_cst_grp_flg7, Cnd_cst_grp_flg8,
				Cnd_cst_grp_flg9, Cnd_cst_grp_flg10, Cnd_itm_grp_flg1,
				Cnd_itm_grp_flg2, Cnd_itm_grp_flg3, Cnd_itm_grp_flg4,
				Cnd_itm_grp_flg5, Cnd_itm_grp_flg6, Cnd_itm_grp_flg7,
				Cnd_itm_grp_flg8, Cnd_itm_grp_flg9, Cnd_itm_grp_flg10
		};
	}

	@Override
	public boolean doCnd_md_VC(MCEventInfo info) {
		if (!super.doCnd_md_VC(info)) {
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
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r == null) {
				return;
			}
			if (!Btn_open_MSBEP1440.isEnabled()) {
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1440");
			aso.putCnd(crtOpenMSBEP1440CndR(aso, r));
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
			return super.getPriorMode(index, column, table);
		}
	}

}