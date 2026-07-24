package mcframe.clientMSBD.MSBDP0210;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;

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
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcFrcstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcFrcstReg_MC extends MSBDP_PurcFrcstReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCList<RsltR> _hdrList = MCList.create(RsltR.class);

	protected HashMap<String, MCList<RsltR>> _fixGrpMap = new HashMap<>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcFrcstReg_MC() {
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
	public MSBDP_PurcFrcstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Srch01Caller<P extends MSBDP_PurcFrcstReg, B extends MS_MSBDL0210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0210_Srch01Caller(P p, B b) {
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
			checkForCallStackSrch(msgList);
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
	 * [MS_MSBDL0210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Srch02Caller<P extends MSBDP_PurcFrcstReg, B extends MS_MSBDL0210_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0210_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void clear() {
			super.clear();
			clearSub();
		}

		protected void clearSub() {
			_hdrList.clear();
			_fixGrpMap.clear();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSrch(msgList);
		}

		@Override
		protected void show() {
			super.show();
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			showSub();
		}

		protected void showSub() {
			for (MCList<RsltR> l : getRsltL().groupList(RsltR.$purc_frcst_fix_no)) {
				_fixGrpMap.put(l.get(0).purc_frcst_fix_no(), l);
				for (RsltR r : l) {
					if (isFixRow(r)) {
						_hdrList.add(r);
						break;
					}
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

	protected void checkForCallStackSrch(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_pf_dt_fr, Cnd_pf_dt_to));
		msgList.addAll(checkAtLeastOne(FixStsPanel));
		msgList.addAll(checkAtLeastOne(RptStsPanel));
		msgList.addAll(checkAtLeastOne(DelStsPanel));
		msgList.addAll(checkAtLeastOne(SubconTgtPanel));
		msgList.addAll(checkAtLeastOne(PurcCommitTgtPanel));
	}


	/**
	 * [MS_MSBDL0210_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Imp01Caller<P extends MSBDP_PurcFrcstReg, B extends MS_MSBDL0210_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBDL0210_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();
			clearSub();
		}

		protected void clearSub() {
			_hdrList.clear();
			_fixGrpMap.clear();
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setDTL_FIX_UStatus();
			}
			else {
				setRefStatus();
			}

			Ctrl_ctrl_PPanel.expand(false);
		}

		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}

		@Override
		protected void show() {
			super.show();
			showSub();
		}

		protected void showSub() {
			for (MCList<RsltR> l : getRsltL().groupList(RsltR.$purc_frcst_fix_no)) {
				_fixGrpMap.put(l.get(0).purc_frcst_fix_no(), l);
				for (RsltR r : l) {
					if (isFixRow(r)) {
						_hdrList.add(r);
						break;
					}
					else {
						r.check(false);
					}
				}
			}
		}

	}

	/**
	 * [MS_MSBDL0210_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Upd01Caller<P extends MSBDP_PurcFrcstReg, B extends MS_MSBDL0210_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0210_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBDL0210_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Upd02Caller<P extends MSBDP_PurcFrcstReg, B extends MS_MSBDL0210_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0210_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			MCList<RsltR> l = MCList.create(RsltR.class);
			for (RsltR r : getRsltL()) {
				if (r.check() && isFixRow(r)) {
					l.addAll(_fixGrpMap.get(r.purc_frcst_fix_no()));
				}
			}
			return l;
		}

	}

	/**
	 * [MS_MSBDL0210_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Del01Caller<P extends MSBDP_PurcFrcstReg, B extends MS_MSBDL0210_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0210_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBDL0210_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Del02Caller<P extends MSBDP_PurcFrcstReg, B extends MS_MSBDL0210_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0210_Del02Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MS_MSBDL0210_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0210_Prnt01Caller<P extends MSBDP_PurcFrcstReg, B extends MS_MSBDL0210_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBDL0210_Prnt01Caller(P p, B b) {
			super(p, b);
		}

	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_disp_ope_HDR.isSelected()) {
			callMS_MSBDL0210_Srch01();
		}
		else if (Cnd_disp_ope_DTL.isSelected()) {
			callMS_MSBDL0210_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_disp_ope_HDR.isSelected()) {
			createMS_MSBDL0210_Srch01().execDL();
		}
		else if (Cnd_disp_ope_DTL.isSelected()) {
			createMS_MSBDL0210_Srch02().execDL();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0090(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBEP0090(r);
	}
	protected void doBtn_open_MSBEP0090(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0090");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0090CndR(aso, r), crtOpenMSBEP0090CndRClear(r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP0090.CndR crtOpenMSBEP0090CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0090.CndR to = mcframe.clientMSBE.MSBEP0090.CndR.create();

		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.sppl_cd(r.sppl_cd());
		to.schd_dt_fr(r.pf_period_st_dt());
		to.schd_dt_to(r.pf_period_end_dt());
		to.io_schd_sts_typ(MCStringUtil.arrayValueJoin(
				MSC_IO_SCHD_STS_TYP.OPN.value(),
				MSC_IO_SCHD_STS_TYP.ORD_SAV.value(),
				MSC_IO_SCHD_STS_TYP.FIX.value(),
				MSC_IO_SCHD_STS_TYP.SCHD.value()));
		
		return to;
	}
	protected List<String> crtOpenMSBEP0090CndRClear(RsltR r) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$slip_schd_no_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$avl_schd_dt_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$accpt_schd_dt_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$loc_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$str_ln_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$stk_arrv_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$site_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$lg_grp_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$alloc_grp_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$loc_grp_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$lot_no_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$sublot_no_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$sno1_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$sno2_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$sno3_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$sno4_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$pack_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$alt_grp_flg);
		l.add(mcframe.clientMSBE.MSBEP0090.CndR.$gd_flg);
		return l;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBDP0030(r);
	}
	protected void doBtn_open_MSBDP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0030");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBDP0030CndR(aso, r), crtOpenMSBDP0030CndRClear(r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0030.CndR crtOpenMSBDP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg p = (mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg) aso
				.getPanel();
		mcframe.clientMSBD.MSBDP0030.CndR to = mcframe.clientMSBD.MSBDP0030.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.sppl_cd(r.sppl_cd());
		to.wg_cd(r.wg_cd());
		to.dlv_rqst_dt_fr(r.pf_period_st_dt());
		to.dlv_rqst_dt_to(r.pf_period_end_dt());

		return to;
	}
	protected List<String> crtOpenMSBDP0030CndRClear(RsltR r) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBD.MSBDP0030.CndR.$po_flg);
		return l;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0050(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0050(r);
	}
	protected void doBtn_open_MSBCP0050(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0050CndR(aso, r), crtOpenMSBCP0050CndRClear(r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBC.MSBCP0050.CndR crtOpenMSBCP0050CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch p = (mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0050.CndR to = mcframe.clientMSBC.MSBCP0050.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.sppl_cd(r.sppl_cd());
		to.rqst_wg_cd(r.wg_cd());
		to.strg_schd_dt_fr(r.pf_period_st_dt());
		to.strg_schd_dt_to(r.pf_period_end_dt());

		return to;
	}
	protected List<String> crtOpenMSBCP0050CndRClear(RsltR r) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBC.MSBCP0050.CndR.$mfg_flg);
		l.add(mcframe.clientMSBC.MSBCP0050.CndR.$xfr_flg);
		l.add(mcframe.clientMSBC.MSBCP0050.CndR.$wg_xfr_flg);
		l.add(mcframe.clientMSBC.MSBCP0050.CndR.$inst_flg);
		l.add(mcframe.clientMSBC.MSBCP0050.CndR.$cmpl_flg);
		return l;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0130(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0130(r);
	}
	protected void doBtn_open_MSBCP0130(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0130");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0130CndR(aso, r), crtOpenMSBCP0130CndRClear(r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP0130.CndR crtOpenMSBCP0130CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP0130.MSBCP_PrcdOrdSrch p = (mcframe.clientMSBC.MSBCP0130.MSBCP_PrcdOrdSrch) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0130.CndR to = mcframe.clientMSBC.MSBCP0130.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.sppl_cd(r.sppl_cd());
		to.rqst_wg_cd(r.wg_cd());
		to.strg_schd_dt_fr(r.pf_period_st_dt());
		to.strg_schd_dt_to(r.pf_period_end_dt());

		return to;
	}
	protected List<String> crtOpenMSBCP0130CndRClear(RsltR r) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBC.MSBCP0130.CndR.$mfg_flg);
		l.add(mcframe.clientMSBC.MSBCP0130.CndR.$xfr_flg);
		l.add(mcframe.clientMSBC.MSBCP0130.CndR.$wg_xfr_flg);
		l.add(mcframe.clientMSBC.MSBCP0130.CndR.$fix_flg);
		return l;
	}


	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBDL0210_Prnt01();
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
	 * Panel[Btn]のボタン[fix_all]の押下時の処理
	 */
	@Override
	public void doBtn_fix_all(MCEventInfo info) {
		doSelectAll(RsltTable, columnRslt_fix_flg);
	}
	/**
	 * Panel[Btn]のボタン[unfix_all]の押下時の処理
	 */
	@Override
	public void doBtn_unfix_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_fix_flg);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_disp_ope_HDR.isSelected()) {
				callMS_MSBDL0210_Upd01();
			}
			else if (Cnd_disp_ope_DTL.isSelected()) {
				callMS_MSBDL0210_Upd02();
			}
		}
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		if (Cnd_disp_ope_HDR.isSelected()) {
			if (Cnd_ope_DEL.isSelected()) {
				callMS_MSBDL0210_Del01();
			}
			else if (Cnd_ope_DEL_CAN.isSelected()) {
				callMS_MSBDL0210_Del02();
			}
		}
	}

	/**
	 * Panel[BulkSet]のボタン[setting]の押下時の処理
	 */
	@Override
	public void doBulkSet_setting(MCEventInfo info) {
		MCList<RsltR> l = RsltTable.getViewRows();
		l = l.subList(r->r.check());
		if (isNull(l)) {
			dialog(msgNoCheckedRow());
			return ;
		}
		
		if (Cnd_ope_UPD.isSelected()) {
			for (RsltR r : l) {
				if (!isNull(getBulkSetR().pf_usr_cd())) {
					if (isEditable(columnRslt_pf_usr_cd, r.getGUIIndex())) {
						r.pf_usr_cd(getBulkSetR().pf_usr_cd());
						r.pf_usr_nm(getBulkSetR().pf_usr_nm());
						setRowStatus(r);
					}
				}
				if (!isNull(getBulkSetR().pf_dpt_cd())) {
					if (isEditable(columnRslt_pf_dpt_cd, r.getGUIIndex())) {
						r.pf_dpt_cd(getBulkSetR().pf_dpt_cd());
						r.pf_dpt_nm(getBulkSetR().pf_dpt_nm());
						setRowStatus(r);
					}
				}
			}
		}
	}

	protected void setRowStatus(RsltR r) {
		if (r.isStatusNone()) {
			r.setStatus(MCRow.MODIFY);
		}
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

		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_pf_dt);

		Rslt_trd_unit_schd_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_pf_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_prms_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_pre_trd_unit_pf_qty_p_PPanel.setRelateBeans(columnRslt_pre_trd_unit_cd, columnRslt_pre_trd_unit_dec_place);

		Rslt_base_unit_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_schd_qty, columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty);
		Rslt_base_unit_pf_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_pf_qty, columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty);
		Rslt_base_unit_prms_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_prms_qty, columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty);
		Rslt_base_unit_prms_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_pre_base_unit_pf_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);

		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);

	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == BulkSet_pf_usr_cd) {
			setBindBulkSet_pf_usr_cd(row);
		}
		return row;
	}

	@Override
	public MCList getBulkSet_pf_usr_cd(MCRow row, MCEventInfo info) {
		setBindBulkSet_pf_usr_cd(row);
		return super.getBulkSet_pf_usr_cd(row, info);
	}

	protected void setBindBulkSet_pf_usr_cd(MCRow row) {
		row.setDateNE(UsrCols.$i_dt, getToday());
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_rpt_f_flg, true);
		setValueEx(Cnd_rpt_t_flg, true);

		setValueEx(Cnd_fix_f_flg, true);
		setValueEx(Cnd_fix_t_flg, true);

		setValueEx(Cnd_del_f_flg, true);
		setValueEx(Cnd_del_t_flg, true);

		setValueEx(Cnd_subcon_f_flg, true);
		setValueEx(Cnd_subcon_t_flg, true);

		setValueEx(Cnd_purc_commit_f_flg, true);
		setValueEx(Cnd_purc_commit_t_flg, true);

		MCDate dtFr = getToday();
		MCDate dtTo = null;
		if (!isNull(dtFr)) {
			dtFr = dtFr.startOfMonth();
			dtTo = dtFr.endOfMonth();
		}
		setValueEx(Cnd_pf_dt_fr, dtFr);
		setValueEx(Cnd_pf_dt_to, dtTo);
		setValueEx(Cnd_latest_flg, true);
		setValueEx(Btn_prnt_flg, true);
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		for (MCColumnConfig col : RsltTable.getAllColumnConfigs()) {
			if (!isColSortable(col)) {
				col.setSortable(false);
			}
		}

	}

	protected boolean isColSortable(MCColumnConfig col) {
		if (col == columnRslt_del_flg) {
			return true;
		}
		if (col == columnRslt_itm_cd) {
			return true;
		}
		if (col == columnRslt_itm_sub1) {
			return true;
		}
		if (col == columnRslt_itm_sub2) {
			return true;
		}
		if (col == columnRslt_itm_sub3) {
			return true;
		}
		if (col == columnRslt_purc_commit_flg) {
			return true;
		}
		if (col == columnRslt_pf_dt) {
			return true;
		}
		if (col == columnRslt_sppl_cd) {
			return true;
		}
		if (col == columnRslt_sppl_nm) {
			return true;
		}
		if (col == columnRslt_subcon_flg) {
			return true;
		}
		if (col == columnRslt_wg_cd) {
			return true;
		}
		if (col == columnRslt_wg_nm) {
			return true;
		}
		if (col == columnRslt_pf_usr_cd) {
			return true;
		}
		if (col == columnRslt_pf_usr_nm) {
			return true;
		}
		if (col == columnRslt_pf_dpt_cd) {
			return true;
		}
		if (col == columnRslt_pf_dpt_nm) {
			return true;
		}
		if (col == columnRslt_pf_rpt_flg) {
			return true;
		}
		if (col == columnRslt_pf_rpt_dt) {
			return true;
		}
		if (col == columnRslt_pf_rpt_no) {
			return true;
		}
		if (col == columnRslt_del_pf_rpt_flg) {
			return true;
		}
		if (col == columnRslt_del_pf_rpt_dt) {
			return true;
		}
		if (col == columnRslt_hdr_rpt_rmrks) {
			return true;
		}
		if (col == columnRslt_hdr_intr_rmrks) {
			return true;
		}
		if (col == columnRslt_hdr_sub_char1) {
			return true;
		}
		if (col == columnRslt_hdr_sub_char2) {
			return true;
		}
		if (col == columnRslt_hdr_sub_char3) {
			return true;
		}
		if (col == columnRslt_itm_typ) {
			return true;
		}
		if (col == columnRslt_itm_typ_nm) {
			return true;
		}
		if (col == columnRslt_itm_typ_d_cd) {
			return true;
		}
		if (col == columnRslt_itm_typ_d_nm) {
			return true;
		}
		if (col == columnRslt_pre_fix_period_flg) {
			return true;
		}
		if (col == columnRslt_pre_trd_unit_pf_qty) {
			return true;
		}
		if (col == columnRslt_pre_base_unit_pf_qty) {
			return true;
		}
		if (isNull(col.getBaseRowColumnName())) {
			return false;
		}
		if (col.getBaseRowColumnName().startsWith("bp_grp")) {
			return true;
		}
		if (col.getBaseRowColumnName().startsWith("itm_grp")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (Cnd_disp_ope_DTL.isSelected()) {
			if (policy.size() != 0) {

				_hdrList.sort(policy);
				MCList<RsltR> l = MCList.create(RsltR.class);
				for (RsltR r : _hdrList) {
					l.addAll(_fixGrpMap.get(r.purc_frcst_fix_no()));
				}
				getRsltL().setAll(l);
				return true;
			}
		}
		return super.sort(table, policy);
	}

	// -----------------------------------------------
	// status

	@Override
	public void setHDR_SRCH_UPDStatus() {
		super.setHDR_SRCH_UPDStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setHDR_UPDStatus() {
		super.setHDR_UPDStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		setDispCtrlStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setHDR_SRCH_DELStatus() {
		super.setHDR_SRCH_DELStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setHDR_DELStatus() {
		super.setHDR_DELStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		setDispCtrlStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setHDR_SRCH_DEL_CANStatus() {
		super.setHDR_SRCH_DEL_CANStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setHDR_DEL_CANStatus() {
		super.setHDR_DEL_CANStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		RsltTable.selectLeftmostColumn(0);
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSRCH_RPTStatus() {
		super.setSRCH_RPTStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setRPTStatus() {
		super.setRPTStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		RsltTable.selectLeftmostColumn(0);
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setHDR_SRCHStatus() {
		super.setHDR_SRCHStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setHDR_REFStatus() {
		super.setHDR_REFStatus();
		setCndMode();
		BulkSetPanel.setVisible(true);
		RsltTable.selectLeftmostColumn(0);
		setDispCtrlStatus();
		setBtnMode();
	}


	@Override
	public void setDTL_SRCH_UPDStatus() {
		super.setDTL_SRCH_UPDStatus();
		setCndMode();
		BulkSetPanel.setVisible(false);
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setDTL_UPDStatus() {
		super.setDTL_UPDStatus();
		setCndMode();
		BulkSetPanel.setVisible(false);
		setDispCtrlStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setDTL_FIX_UStatus() {
		super.setDTL_FIX_UStatus();
		setCndMode();
		BulkSetPanel.setVisible(false);
		setDispCtrlStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setDTL_SRCHStatus() {
		super.setDTL_SRCHStatus();
		setCndMode();
		BulkSetPanel.setVisible(false);
		FoldTab.focusActiveFirstComponent();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setDTL_REFStatus() {
		super.setDTL_REFStatus();
		setCndMode();
		BulkSetPanel.setVisible(false);
		setDispCtrlStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setDispCtrlStatus() {
		boolean baseFlg = getCndR().show_base_unit_flg();
		setModeByFlg(columnRslt_base_unit_cd, baseFlg);
		setModeByFlg(columnRslt_base_unit_nm, baseFlg);
		setModeByFlg(columnRslt_base_unit_schd_qty, baseFlg);
		setModeByFlg(columnRslt_base_unit_pf_qty, baseFlg);
		setModeByFlg(columnRslt_base_unit_prms_qty, baseFlg);

		boolean preFlg = getCndR().show_pre_flg();
		setModeByFlg(columnRslt_pre_fix_period_flg, preFlg);
		setModeByFlg(columnRslt_pre_pf_dt, preFlg);
		setModeByFlg(columnRslt_pre_trd_unit_cd, preFlg);
		setModeByFlg(columnRslt_pre_trd_unit_nm, preFlg);
		setModeByFlg(columnRslt_pre_trd_unit_pf_qty, preFlg);
		setModeByFlg(columnRslt_pre_base_unit_pf_qty, preFlg && baseFlg);

	}

	protected void setModeByFlg(MCColumnConfig b, boolean flg) {
		if (flg) {
			setDefaultMode(b);
		}
		else {
			b.setMode(MCMode.INVISIBLE);
		}
	}

	protected void setCndMode() {
		if (Cnd_disp_ope_HDR.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else if (Cnd_disp_ope_DTL.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP0090(r)) {
			setDefaultMode(Btn_open_MSBEP0090);
		}
		else {
			Btn_open_MSBEP0090.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBDP0030(r)) {
			setDefaultMode(Btn_open_MSBDP0030);
		}
		else {
			Btn_open_MSBDP0030.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBCP0050(r)) {
			setDefaultMode(Btn_open_MSBCP0050);
		}
		else {
			Btn_open_MSBCP0050.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBCP0130(r)) {
			setDefaultMode(Btn_open_MSBCP0130);
		}
		else {
			Btn_open_MSBCP0130.setMode(MCMode.DISABLE);
		}
	}

	protected boolean isEnableBtn_open_MSBEP0090(RsltR r) {
		if (r == null) {
			return false;
		}
		if (isNullOr(r.pf_period_st_dt(), r.pf_period_end_dt())) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBDP0030(RsltR r) {
		if (r == null) {
			return false;
		}
		if (isNullOr(r.pf_period_st_dt(), r.pf_period_end_dt())) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBCP0050(RsltR r) {
		if (r == null) {
			return false;
		}
		if (isNullOr(r.pf_period_st_dt(), r.pf_period_end_dt())) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBCP0130(RsltR r) {
		if (r == null) {
			return false;
		}
		if (isNullOr(r.pf_period_st_dt(), r.pf_period_end_dt())) {
			return false;
		}
		return true;
	}

	protected boolean isUpdStatus() {
		return isHdrUpdStatus() || isDtlUpdStatus();
	}

	protected boolean isHdrUpdStatus() {
		return isSame(getStatus(), HDR_UPD);
	}

	protected boolean isDtlUpdStatus() {
		return isSame(getStatus(), DTL_UPD);
	}

	protected boolean isDelStatus() {
		return isHdrDelStatus() || isHdrDelCanStatus();
	}

	protected boolean isHdrDelStatus() {
		return isSame(getStatus(), HDR_DEL);
	}

	protected boolean isHdrDelCanStatus() {
		return isSame(getStatus(), HDR_DEL_CAN);
	}

	protected boolean isRptStatus() {
		return isSame(getStatus(), RPT);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_disp_ope_HDR.isSelected()) {
			if (Cnd_ope_UPD.isSelected()) {
				setHDR_SRCH_UPDStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setHDR_SRCH_DELStatus();
			}
			else if (Cnd_ope_DEL_CAN.isSelected()) {
				setHDR_SRCH_DEL_CANStatus();
			}
			else if (Cnd_ope_RPT.isSelected()) {
				setSRCH_RPTStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setHDR_SRCHStatus();
			}
		}
		else if (Cnd_disp_ope_DTL.isSelected()) {
			if (Cnd_ope_UPD.isSelected()) {
				setDTL_SRCH_UPDStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setDTL_SRCHStatus();
			}
		}

		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_disp_ope_HDR.isSelected()) {
			if (Cnd_ope_UPD.isSelected()) {
				setHDR_UPDStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setHDR_DELStatus();
			}
			else if (Cnd_ope_DEL_CAN.isSelected()) {
				setHDR_DEL_CANStatus();
			}
			else if (Cnd_ope_RPT.isSelected()) {
				setRPTStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setHDR_REFStatus();
			}
		}
		else if (Cnd_disp_ope_DTL.isSelected()) {
			if (Cnd_ope_UPD.isSelected()) {
				setDTL_UPDStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setDTL_REFStatus();
			}
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
		clearCnd();
		initCndByOpe();
		setSrchStatus();
	}

	protected void clearCnd() {
		if (Cnd_disp_ope_HDR.isSelected()) {
			setValueEx(Cnd_dtl_rpt_rmrks, null);
			setValueEx(Cnd_dtl_intr_rmrks, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);
			setValueEx(Cnd_show_base_unit_flg, false);
		}
	}

	protected void initCndByOpe() {
		if ((Cnd_ope_RPT.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_DEL_CAN
				.isSelected()) && !Cnd_disp_ope_HDR.isSelected()) {
			setValueEx(Cnd_disp_ope_Group, Cnd_disp_ope_HDR.getActionCommand());
		}

		if (Cnd_disp_ope_HDR.isSelected()) {
			if (Cnd_ope_DEL.isSelected() || Cnd_ope_RPT.isSelected() || Cnd_ope_UPD.isSelected()) {
				setValueEx(Btn_prnt_flg, true);
			}
			else {
				setValueEx(Btn_prnt_flg, false);
			}

			if (Cnd_ope_UPD.isSelected()) {
				// 何もしない
			}
			else {
				setValueEx(BulkSet_pf_usr_cd, null);
				setValueEx(BulkSet_pf_dpt_cd, null);
			}

			if (Cnd_ope_DEL.isSelected()) {
				setValueEx(Cnd_del_f_flg, true);
				setValueEx(Cnd_del_t_flg, false);
			}
			else if (Cnd_ope_DEL_CAN.isSelected()) {
				setValueEx(Cnd_del_f_flg, false);
				setValueEx(Cnd_del_t_flg, true);
			}
			else {
				setValueEx(Cnd_del_f_flg, true);
				setValueEx(Cnd_del_t_flg, true);
			}

			setValueEx(Cnd_itm_typ, null);
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_dtl_rpt_rmrks, null);
			setValueEx(Cnd_dtl_intr_rmrks, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);

		}

	}

	@Override
	public void doCnd_disp_ope_NC(MCEventInfo info) {
		super.doCnd_disp_ope_NC(info);
		clearContainers(getRsltL());
		clearCnd();
		initCndByOpe();
		setSrchStatus();
	}

	@Override
	public void doCnd_show_base_unit_flg_NC(MCEventInfo info) {
		super.doCnd_show_base_unit_flg_NC(info);
		setDispCtrlStatus();
		columnRslt_base_unit_cd.adjustWidth();
		columnRslt_base_unit_nm.adjustWidth();
		columnRslt_base_unit_schd_qty.adjustWidth();
		columnRslt_base_unit_pf_qty.adjustWidth();
		columnRslt_base_unit_prms_qty.adjustWidth();
	}

	@Override
	public void doCnd_show_pre_flg_NC(MCEventInfo info) {
		super.doCnd_show_pre_flg_NC(info);
		setDispCtrlStatus();
		columnRslt_pre_fix_period_flg.adjustWidth();
		columnRslt_pre_pf_dt.adjustWidth();
		columnRslt_pre_trd_unit_cd.adjustWidth();
		columnRslt_pre_trd_unit_nm.adjustWidth();
		columnRslt_pre_trd_unit_pf_qty.adjustWidth();
		columnRslt_pre_base_unit_pf_qty.adjustWidth();
	}



	@Override
	protected void setCheckOnWhenStatusChanged(MCConstRow row) {
		if (Cnd_disp_ope_DTL.isSelected()) {
			setCheckOnWhenStatusChangedSub((RsltR)row);
		}
		else {
			super.setCheckOnWhenStatusChanged(row);
		}
	}

	protected void setCheckOnWhenStatusChangedSub(RsltR row) {
		if (isDtlRow(row)) {
			MCList<RsltR> l = _fixGrpMap.get(row.purc_frcst_fix_no());
			for (RsltR r : l) {
				if (isFixRow(r)) {
					r.check(true);
					break;
				}
			}
		}
		else if (isFixRow(row)){
			row.check(true);
		}
	}


	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBEP0090(r)) {
				doBtn_open_MSBEP0090(r);
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

	protected Color _fixPeriodFgColor = getPgmSettingColorNE(this, Color.BLUE, "color.fix.fg");

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isDtlUpdStatus()) {

				if (isDtlRow(r)) {
					if (columnRslt_check == column || columnRslt_fix_flg == column) {
						return MCMode.READ_ONLY;
					}
					if (columnRslt_dtl_rpt_rmrks == column || columnRslt_dtl_intr_rmrks == column
							|| columnRslt_dtl_sub_char1 == column
							|| columnRslt_dtl_sub_char2 == column
							|| columnRslt_dtl_sub_char3 == column) {
						return MCMode.READ_ONLY;
					}
					if (columnRslt_trd_unit_pf_qty == column) {
						RsltR fixR = getFixRow(r);
						if (!isNull(fixR)) {
							if (r.del_flg() || r.pf_rpt_flg() || fixR.fix_flg() || r.fix_period_flg() && r.pre_fix_period_flg()) {
								return MCMode.READ_ONLY;
							}
						}

					}
					if (columnRslt_trd_unit_prms_qty == column) {
						if (r.del_flg()) {
							return MCMode.READ_ONLY;
						}

					}
				}
				else if (isFixRow(r)) {

					if (columnRslt_trd_unit_pf_qty == column
							|| columnRslt_trd_unit_prms_qty == column) {
						return MCMode.READ_ONLY;
					}
					if (columnRslt_fix_flg == column) {
						if (r.del_flg() || r.pf_rpt_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (columnRslt_dtl_rpt_rmrks == column) {
						if (r.del_flg() || r.pf_rpt_flg() || r.fix_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			else if (isHdrUpdStatus()) {

				if (columnRslt_pf_usr_cd == column
						|| columnRslt_pf_dpt_cd == column
						|| columnRslt_hdr_rpt_rmrks == column) {
					if (r.del_flg() || r.pf_rpt_flg()) {
						return MCMode.READ_ONLY;
					}
				}

			}
			else if (isRptStatus()) {

				if (columnRslt_pf_rpt_dt == column) {
					if (r.del_flg() || r.pf_rpt_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (columnRslt_del_pf_rpt_dt == column) {
					if (!r.del_flg() || !r.pf_rpt_flg()) {
						return MCMode.READ_ONLY;
					}
				}

			}
			else if (isHdrDelStatus()) {

				if (columnRslt_del_pf_rpt_dt == column) {
					if (!r.pf_rpt_flg() || r.del_pf_rpt_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column,
				MCTable<?> table, MCMode mode) {
			if (Cnd_disp_ope_DTL.isSelected()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);

				if (isDtlRow(r)) {
					if (columnRslt_itm_cd == column) {
						return Boolean.TRUE;
					}
					if (columnRslt_itm_sub1 == column) {
						return Boolean.TRUE;
					}
					if (columnRslt_itm_sub2 == column) {
						return Boolean.TRUE;
					}
					if (columnRslt_itm_sub3 == column) {
						return Boolean.TRUE;
					}
					if (columnRslt_itm_nm == column) {
						return Boolean.TRUE;
					}
				}

			}
			return super.getPriorReverseFG(index, column, table, mode);
		}

		@Override
		public Color getPriorFG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (Cnd_disp_ope_DTL.isSelected()) {

				RsltR r = (RsltR) table.getBaseTable().getRow(index);

				if (columnRslt_trd_unit_pf_qty == column
						|| columnRslt_base_unit_pf_qty == column) {
					if (r.fix_period_flg()) {
						return _fixPeriodFgColor;
					}
				}
				else if (columnRslt_pre_trd_unit_pf_qty == column
						|| columnRslt_pre_base_unit_pf_qty == column) {
					if (r.pre_fix_period_flg()) {
						return _fixPeriodFgColor;
					}
				}
			}
			return super.getPriorFG(index, column, table, mode);
		}
	}

	protected boolean isFixRow(RsltR r) {
		return !isNull(r.purc_frcst_fix_no()) && isNull(r.purc_frcst_d_no());
	}

	protected boolean isDtlRow(RsltR r) {
		if (isNull(r)) {
			return false;
		}
		return !isNull(r.purc_frcst_d_no());
	}

	protected RsltR getFixRow(RsltR r) {
		if (isNull(r)) {
			return null;
		}
		MCList<RsltR> l = _fixGrpMap.get(r.purc_frcst_fix_no());
		if (!isNull(l)) {
			for (RsltR v : l) {
				if (isFixRow(v)) {
					return v;
				}
			}
		}
		return null;
	}
	// -----------------------------------------------
	// fileImport
	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected() && Cnd_disp_ope_DTL.isSelected();
		}
		return super.useFileIn(table);
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		callMS_MSBDL0210_Imp01();
	}

	@Override
	protected void changeFileInRowStatus() {
		for (RsltR r : getRsltL()) {
			r.setStatus(MCRow.Status.MODIFY);
		}
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_UPD);
		}
		return config;
	}
	// -----------------------------------------------

}