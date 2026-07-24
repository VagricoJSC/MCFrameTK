package mcframe.clientMSBE.MSBEP1480;

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
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0020.*;
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
 * 画面"MSBEP_ShipStkRplLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ShipStkRplLst_MC extends MSBEP_ShipStkRplLst_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipStkRplLst_MC() {
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
	public MSBEP_ShipStkRplLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1480_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1480_Srch01Caller<P extends MSBEP_ShipStkRplLst, B extends MS_MSBEL1480_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1480_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgL) {
			msgL.addAll(checkBeforeAfter(Cnd_schd_dt_fr, Cnd_schd_dt_to));
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
	}

	/**
	 * [MS_MSBEL1480_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1480_Upd01Caller<P extends MSBEP_ShipStkRplLst, B extends MS_MSBEL1480_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1480_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1480_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1480_Del01Caller<P extends MSBEP_ShipStkRplLst, B extends MS_MSBEL1480_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1480_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1480_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1480_Upd02Caller<P extends MSBEP_ShipStkRplLst, B extends MS_MSBEL1480_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1480_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1480_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBEP0010(r);
	}
	protected void doBtn_open_MSBEP0010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0010");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0010CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP0010.CndR crtOpenMSBEP0010CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0010.CndR to = mcframe.clientMSBE.MSBEP0010.CndR.create();

		to.lg_grp_cd(r.lg_grp_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(getSnoBind(r.sno1(), r.sno1_null_flg()));
		to.sno2(getSnoBind(r.sno2(), r.sno2_null_flg()));
		to.sno3(getSnoBind(r.sno3(), r.sno3_null_flg()));
		to.sno4(getSnoBind(r.sno4(), r.sno4_null_flg()));
		
		return to;
	}
	protected String getSnoBind(String sno, boolean sno_null_flg) {
		if (isNull(sno) || MAC_STR.isNULL_VAL(sno) || !sno_null_flg) {
			return sno;
		}
		ArrayList<String> l = new ArrayList<>();
		l.add(sno);
		l.add(MAC_STR.NULL_VAL.value());
		return MCStringUtil.arrayValueJoin(l.toArray(new String[0]));
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBEP0070(r);
	}
	protected void doBtn_open_MSBEP0070(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0070");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0070CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP0070.CndR crtOpenMSBEP0070CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0070.MSBEP_IoTrnsDtlSrch p = (mcframe.clientMSBE.MSBEP0070.MSBEP_IoTrnsDtlSrch) aso
				.getPanel();
		mcframe.clientMSBE.MSBEP0070.CndR to = mcframe.clientMSBE.MSBEP0070.CndR.create();

		to.ope(p.Cnd_ope_SRCH_USE.getActionCommand());
		to.loc_cd(r.loc_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.dt_fr(getOpenDtFr(r));
		to.dt_to(r.schd_dt());
		to.ver_no(r.ver_no());
		to.sno1(getSnoBind(r.sno1(), r.sno1_null_flg()));
		to.sno2(getSnoBind(r.sno2(), r.sno2_null_flg()));
		to.sno3(getSnoBind(r.sno3(), r.sno3_null_flg()));
		to.sno4(getSnoBind(r.sno4(), r.sno4_null_flg()));
		
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1000]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1000(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBEP1000(r);
	}
	protected void doBtn_open_MSBEP1000(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1000");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1000CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1000.CndR crtOpenMSBEP1000CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg p = (mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg) aso
				.getPanel();
		mcframe.clientMSBE.MSBEP1000.CndR to = mcframe.clientMSBE.MSBEP1000.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.gr_loc_cd(r.loc_cd());
		to.gr_rqst_dt_fr(getOpenDtFr(r));
		to.gr_rqst_dt_to(r.schd_dt());
		to.sno1(getSnoBind(r.sno1(), r.sno1_null_flg()));
		to.sno2(getSnoBind(r.sno2(), r.sno2_null_flg()));
		to.sno3(getSnoBind(r.sno3(), r.sno3_null_flg()));
		to.sno4(getSnoBind(r.sno4(), r.sno4_null_flg()));
		to.ver_no(r.ver_no());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		
		return to;
	}
	
	protected MCDate getOpenDtFr(RsltR r) {
		int bf = -1 * getPgmSettingIntNE(this, 0, "open.bf_today");
		MCDate dt =  getToday().addDay(bf);
		if (dt.gt(r.schd_dt())) {
			dt = r.schd_dt();
		}
		return dt;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBBP1210(r);
	}
	protected void doBtn_open_MSBBP1210(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1210");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBBP1210CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBB.MSBBP1210.CndR crtOpenMSBBP1210CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {

		mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg p = (mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1210.CndR to = mcframe.clientMSBB.MSBBP1210.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.slo_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1420]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1420(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBEP1420(r);
	}
	protected void doBtn_open_MSBEP1420(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1420");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1420CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1420.CndR crtOpenMSBEP1420CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		
		mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg p = (mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1420.CndR to = mcframe.clientMSBE.MSBEP1420.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.ship_schd_no(r.ship_schd_no());
		to.not_inst_flg(true);
		to.inst_flg(true);
		to.not_ship_flg(true);
		to.part_ship_flg(true);
		to.ship_flg(true);
		return to;
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
	 * Panel[Btn]のボタン[upd_xfr]の押下時の処理
	 */
	@Override
	public void doBtn_upd_xfr(MCEventInfo info) {
		callMS_MSBEL1480_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1480_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1480_Del01();
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
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Rslt_pack_unit_short_qty_p_PPanel.setRelateBeans(columnRslt_itm_cd,
				columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
				columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place,
				columnRslt_pack_unit_rnd_typ, columnRslt_pack_unit_conv_base_qty,
				columnRslt_pack_unit_conv_qty, columnRslt_base_unit_cd);

		Rslt_base_unit_short_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_pack_unit_short_qty, columnRslt_pack_unit_conv_base_qty,
				columnRslt_pack_unit_conv_qty);
	}

	// -----------------------------------------------
	// status
	@Override
	public void setSRCH_XFRStatus() {
		super.setSRCH_XFRStatus();
		FoldTab.focusActiveFirstComponent();
		setDispCtrl();
		setBtnMode();
	}
	
	@Override
	public void setXFRStatus() {
		super.setXFRStatus();
		setDispCtrl();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		FoldTab.focusActiveFirstComponent();
		setDispCtrl();
		setBtnMode();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setDispCtrl();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		FoldTab.focusActiveFirstComponent();
		setDispCtrl();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setDispCtrl();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setDispCtrl();
		setBtnMode();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setDispCtrl();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	protected void setDispCtrl() {
		for (MCColumnConfig col : getDtlFlgCols()) {
			setModeByDisp(col, getLPnlR().dtl_flg());
		}
	}

	protected void setModeByDisp(MCColumnConfig column, boolean boo) {
		if (boo) {
			setDefaultMode(column);
		}
		else {
			column.setMode(MCMode.INVISIBLE);
		}
	}

	protected ArrayList<MCColumnConfig> getDtlFlgCols() {
		ArrayList<MCColumnConfig> l = new ArrayList<>();
		l.add(columnRslt_io_schd_typ);
		l.add(columnRslt_io_schd_typ_nm);
		l.add(columnRslt_io_schd_sts_typ);
		l.add(columnRslt_io_schd_sts_typ_nm);
		l.add(columnRslt_io_schd_no);
		l.add(columnRslt_io_schd_seq);
		l.add(columnRslt_slip_schd_no);
		l.add(columnRslt_io_schd_sub_typ1);
		l.add(columnRslt_io_schd_sub_typ_nm1);
		l.add(columnRslt_io_schd_sub_no1);
		l.add(columnRslt_io_schd_sub_typ2);
		l.add(columnRslt_io_schd_sub_typ_nm2);
		l.add(columnRslt_io_schd_sub_no2);
		l.add(columnRslt_io_schd_sub_typ3);
		l.add(columnRslt_io_schd_sub_typ_nm3);
		l.add(columnRslt_io_schd_sub_no3);
		l.add(columnRslt_io_schd_sub_typ_nm4);
		l.add(columnRslt_io_schd_sub_typ4);
		l.add(columnRslt_io_schd_sub_no4);
		l.add(columnRslt_io_schd_pr_no);
		
		l.add(columnRslt_gd_cd);
		l.add(columnRslt_gd_nm);
		l.add(columnRslt_stk_id_typ);
		l.add(columnRslt_stk_id_typ_nm);
		l.add(columnRslt_stk_bp_cd);
		l.add(columnRslt_stk_bp_nm);
		l.add(columnRslt_stk_arrv_bp_cd);
		l.add(columnRslt_stk_arrv_bp_nm);
		l.add(columnRslt_vld_dt_fr);
		l.add(columnRslt_alloc_flg);
		l.add(columnRslt_batch_log_no);
		l.add(columnRslt_batch_data_no);
		
		l.add(columnRslt_ins_usr_id);
		l.add(columnRslt_ins_usr_nm);
		l.add(columnRslt_ins_func_id);
		l.add(columnRslt_ins_func_nm);
		l.add(columnRslt_ins_ts);
		l.add(columnRslt_upd_usr_id);
		l.add(columnRslt_upd_usr_nm);
		l.add(columnRslt_upd_func_id);
		l.add(columnRslt_upd_func_nm);
		l.add(columnRslt_upd_ts);
		l.add(columnRslt_upd_srv_req_no);
		
		return l;
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		setBtnMode(Btn_open_MSBEP0010, isEnableBtn_open_MSBEP0010(r));
		setBtnMode(Btn_open_MSBEP0070, isEnableBtn_open_MSBEP0070(r));
		setBtnMode(Btn_open_MSBEP1000, isEnableBtn_open_MSBEP1000(r));
		setBtnMode(Btn_open_MSBBP1210, isEnableBtn_open_MSBBP1210(r));
		setBtnMode(Btn_open_MSBEP1420, isEnableBtn_open_MSBEP1420(r));
	}

	protected void setBtnMode(MCButton btn, boolean boo) {
		if (boo) {
			setDefaultMode(btn);
		}
		else {
			btn.setMode(MCMode.DISABLE);
		}
	}

	protected boolean isEnableBtn_open_MSBEP0010(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBEP0070(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBEP1000(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBBP1210(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBEP1420(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected boolean isXfrStatus() {
		return isSame(getStatus(), XFR);
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}
	
	protected boolean isRegStatus() {
		return isXfrStatus() || isUpdStatus() || isDelStatus();
	}
	
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_XFR.isSelected()) {
			setSRCH_XFRStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_XFR.isSelected()) {
			setXFRStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	// -----------------------------------------------
	// event/listener
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// REF（検索モード）では、クリア確認出さない
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
	}
	
	// その他イベント処理
	
	@Override
	public void doLPnl_dtl_flg_NC(MCEventInfo info) {
		super.doLPnl_dtl_flg_NC(info);
		setDispCtrl();
		for (MCColumnConfig col : getDtlFlgCols()) {
			col.adjustWidth();
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBEP0010(r)) {
				doBtn_open_MSBEP0010(r);
			}
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
			
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())
					|| MAC_RTN_STS_TYP.isWRN(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	// -----------------------------------------------
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (isSame(openTyp, T1)) {
			getCndR().batch_log_no(bind.getStringNE("batch_log_no"));
			addDoBehind(Ctrl_ctrl_PPanel.Ope_srch);
		}
		
	}
	// -----------------------------------------------

}