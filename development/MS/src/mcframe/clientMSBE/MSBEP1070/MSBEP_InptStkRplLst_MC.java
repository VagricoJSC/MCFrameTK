package mcframe.clientMSBE.MSBEP1070;

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
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
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
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_InptStkRplLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_InptStkRplLst_MC extends MSBEP_InptStkRplLst_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected HashMap<String, MCList<RsltR>> _altGrpMap = new HashMap<>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_InptStkRplLst_MC() {
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
	public MSBEP_InptStkRplLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1070_Srch01Caller<P extends MSBEP_InptStkRplLst, B extends MS_MSBEL1070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1070_Srch01Caller(P p, B b) {
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
		protected void show() {
			super.show();
			showSub();
		}
		
		protected void showSub() {
			_altGrpMap.clear();
			for (MCList<RsltR> grpL : getRsltL().groupList(RsltR.$alt_grp_id)) {
				String altGrpId = grpL.get(0).alt_grp_id();
				if (!isNull(altGrpId)) {
					_altGrpMap.put(altGrpId, grpL);
				}
			}
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
	 * [MS_MSBEL1070_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1070_Upd01Caller<P extends MSBEP_InptStkRplLst, B extends MS_MSBEL1070_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1070_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1070_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1070_Del01Caller<P extends MSBEP_InptStkRplLst, B extends MS_MSBEL1070_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1070_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1070_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1070_Upd02Caller<P extends MSBEP_InptStkRplLst, B extends MS_MSBEL1070_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1070_Upd02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			showSub();
		}
		
		protected void showSub() {
			MCList<RsltR> altL = bridge.up0().subList(r->isAlt(r));
			for (RsltR altR : altL.groupBy(RsltR.$alt_grp_id)) {
				MCList<RsltR> grpL = _altGrpMap.get(altR.alt_grp_id());
				boolean stopTrunFlg = false;
				for (RsltR r : grpL) {
					if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())
							|| MAC_RTN_STS_TYP.isWRN(r.rtn_sts_typ())) {
						stopTrunFlg = true;
						break;
					}
				}
				if (stopTrunFlg) {
					for (RsltR r : grpL) {
						r.check(false);
						r.stop_rerun_flg(true);
					}
				}
			}
		}
		
	}



	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1070_Srch01();
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

		to.loc_cd(r.loc_cd());
		to.loc_grp_cd(r.loc_grp_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.ver_no(r.ver_no());
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
		to.loc_grp_cd(r.loc_grp_cd());
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
	 * Panel[Btn]のボタン[open_MSBDP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0090(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBDP0090(r);
	}
	protected void doBtn_open_MSBDP0090(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0090");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBDP0090CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0090.CndR crtOpenMSBDP0090CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg p = (mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg) aso
				.getPanel();
		mcframe.clientMSBD.MSBDP0090.CndR to = mcframe.clientMSBD.MSBDP0090.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.dlv_rqst_dt_to(r.schd_dt());
		to.ver_no(r.ver_no());
		to.sno1(getSnoBind(r.sno1(), r.sno1_null_flg()));
		to.sno2(getSnoBind(r.sno2(), r.sno2_null_flg()));
		to.sno3(getSnoBind(r.sno3(), r.sno3_null_flg()));
		to.sno4(getSnoBind(r.sno4(), r.sno4_null_flg()));
		
		ArrayList<String> purcStsL = new ArrayList<>();
		for (MSC_PURC_STS_TYP typ :MSC_PURC_STS_TYP.array()) {
			if (!MSC_PURC_STS_TYP.isCOMPL(typ)) {
				purcStsL.add(typ.value());
			}
		}
		to.purc_sts_typ(MCStringUtil.arrayValueJoin(purcStsL.toArray(new String[0])));
		
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0040(r);
	}
	protected void doBtn_open_MSBCP0040(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0040");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0040CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP0040.CndR crtOpenMSBCP0040CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg p = (mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0040.CndR to = mcframe.clientMSBC.MSBCP0040.CndR.create();

		to.ope(p.Cnd_ope_SRCH.getActionCommand());
		to.itm_ord_no(r.itm_ord_no());
		
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP1010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP1010(r);
	}
	protected void doBtn_open_MSBCP1010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1010");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP1010CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP1010.CndR crtOpenMSBCP1010CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg p = (mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP1010.CndR to = mcframe.clientMSBC.MSBCP1010.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.mfg_inst_no());
		
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP1100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1100(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP1100(r);
	}
	protected void doBtn_open_MSBCP1100(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1100");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP1100CndR(aso, r));
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP1100.CndR crtOpenMSBCP1100CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg p = (mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP1100.CndR to = mcframe.clientMSBC.MSBCP1100.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.name());
		to.srch_tgt_no(r.mfg_inst_no());
		
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
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.ver_no(r.ver_no());
		
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
		callMS_MSBEL1070_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1070_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1070_Del01();
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
		Rslt_short_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_short_qty,
				columnRslt_std_cont_fctr, columnRslt_act_cont_fctr,
				columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_short_qty,
				columnRslt_std_cont_fctr, null,
				columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
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
		l.add(columnRslt_not_lot_mix_flg);
		l.add(columnRslt_not_sublot_mix_flg);
		l.add(columnRslt_alt_grp_id);
		l.add(columnRslt_alt_grp_seq);
		l.add(columnRslt_alt_itm_typ);
		l.add(columnRslt_alt_itm_typ_nm);
		l.add(columnRslt_alt_alloc_prio);
		l.add(columnRslt_vld_dt_fr);
		l.add(columnRslt_inpt_ctl_typ);
		l.add(columnRslt_inpt_ctl_typ_nm);
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
		setBtnMode(Btn_open_MSBDP0090, isEnableBtn_open_MSBDP0090(r));
		setBtnMode(Btn_open_MSBCP0040, isEnableBtn_open_MSBCP0040(r));
		setBtnMode(Btn_open_MSBCP1010, isEnableBtn_open_MSBCP1010(r));
		setBtnMode(Btn_open_MSBCP1100, isEnableBtn_open_MSBCP1100(r));
		setBtnMode(Btn_open_MSBEP1000, isEnableBtn_open_MSBEP1000(r));
		
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
	protected boolean isEnableBtn_open_MSBDP0090(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	protected boolean isEnableBtn_open_MSBCP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.itm_ord_no());
	}
	protected boolean isEnableBtn_open_MSBCP1010(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.mfg_inst_no());
	}
	protected boolean isEnableBtn_open_MSBCP1100(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.mfg_inst_no());
	}
	protected boolean isEnableBtn_open_MSBEP1000(RsltR r) {
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
			// FIX（ファイル取込エラー時）、REF（検索モード）では、クリア確認出さない
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
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		if (srcRow instanceof RsltR) {
			checkAltGrp((RsltR)srcRow, true);
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		checkAltGrp(r, r.check());
	}
	
	protected void checkAltGrp(RsltR r, boolean boo) {
		if (r == null) {
			return ;
		}
		if (isAlt(r)) {
			for (RsltR x : _altGrpMap.get(r.alt_grp_id())) {
				if (x.check() != boo) {
					x.check(boo);
					if (x.isStatusNone()) {
						x.setStatus(MCRow.MODIFY);
					}
				}
			}
		}
	}
	
	protected boolean isAlt(RsltR r) {
		return !isNull(r.alt_grp_id());
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
					|| MAC_RTN_STS_TYP.isWRN(r.rtn_sts_typ()) || r.stop_rerun_flg()) {
				return MCMode.READ_ONLY;
			}
			if (isUpdStatus()) {
				
				// 通常品
				if (isNull(r.alt_grp_id())) {
					if (columnRslt_alt_itm_fix_flg == column) {
						return MCMode.READ_ONLY;
					}
				}
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