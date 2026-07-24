package mcframe.clientMGBD.MGBDP0240;

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
import mcframe.clientMAUB.MAUBP5030.*;
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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_PreAlcCalcSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_PreAlcCalcSrch_MC extends MGBDP_PreAlcCalcSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_PreAlcCalcSrch_MC() {
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
	public MGBDP_PreAlcCalcSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0240_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0240_Srch01Caller<P extends MGBDP_PreAlcCalcSrch, B extends MG_MGBDL0240_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0240_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
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
		protected void afterCall() {
			super.afterCall();
			_cndR = getCndR().clone();
		}
	}

	/**
	 * [MG_MGBDL0240_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0240_Ins01Caller<P extends MGBDP_PreAlcCalcSrch, B extends MG_MGBDL0240_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0240_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}
		
		@Override
		protected void moveFocus() {
			InsDelCndPanel.focusFirstComponent();
		}
	}

	/**
	 * [MG_MGBDL0240_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0240_Del01Caller<P extends MGBDP_PreAlcCalcSrch, B extends MG_MGBDL0240_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0240_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getInsDelCndR()));
		}
		
		@Override
		protected void moveFocus() {
			InsDelCndPanel.focusFirstComponent();
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0240_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0250]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0250(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0250(r);
	}
	protected void doBtn_open_MGBDP0250(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0250");
		mcframe.clientMGBD.MGBDP0250.MGBDP_PreAlcChk p = (mcframe.clientMGBD.MGBDP0250.MGBDP_PreAlcChk) aso.getPanel();
		mcframe.clientMGBD.MGBDP0250.CndR to = mcframe.clientMGBD.MGBDP0250.CndR.create();
		
		to.ope(p.Cnd_ope_SRC.getActionCommand());
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.dest_wg_cd(r.wg_cd());
		to.ym_fr(r.ym());
		to.ym_to(r.ym());
		to.dest_alc_ac_cd(r.alc_ac_cd());
		to.dpt_cd(r.dpt_cd());
		to.dpt_nm(r.dpt_nm());
		to.loc_cd(r.loc_cd());
		to.oper_cd(r.oper_cd());
		to.bp_cd(r.bp_cd());
		to.ctg_cd(r.ctg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.iv_no(r.iv_no());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBGP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0010(MCEventInfo info) {
		doBtn_open_MGBGP0010();
	}
	protected void doBtn_open_MGBGP0010() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBGP0010");
		mcframe.clientMGBG.MGBGP0010.MGBGP_PlnAlcAmtSrch p = (mcframe.clientMGBG.MGBGP0010.MGBGP_PlnAlcAmtSrch) aso.getPanel();
		mcframe.clientMGBG.MGBGP0010.CndR to = mcframe.clientMGBG.MGBGP0010.CndR.create();
		
		to.trd_calc_grp_cd(getInsDelCndR().calc_grp_cd());
		to.trd_calc_no(getInsDelCndR().calc_no());
		to.ym_fr(getInsDelCndR().st_ym());
		to.ym_to(getInsDelCndR().end_ym());
		to.pre_alc_typ(p.Cnd_pre_alc_typ_AFTER.getActionCommand());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBGP0020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0020(MCEventInfo info) {
		doBtn_open_MGBGP0020();
	}
	protected void doBtn_open_MGBGP0020() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBGP0020");
		mcframe.clientMGBG.MGBGP0020.MGBGP_ActAlcAmtSrch p = (mcframe.clientMGBG.MGBGP0020.MGBGP_ActAlcAmtSrch) aso.getPanel();
		mcframe.clientMGBG.MGBGP0020.CndR to = mcframe.clientMGBG.MGBGP0020.CndR.create();
		
		to.trd_calc_grp_cd(getInsDelCndR().calc_grp_cd());
		to.trd_calc_no(getInsDelCndR().calc_no());
		to.ym_fr(getInsDelCndR().st_ym());
		to.ym_to(getInsDelCndR().end_ym());
		to.pre_alc_typ(p.Cnd_pre_alc_typ_AFTER.getActionCommand());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0240_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0240_Del01();
	}
	
	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		InsDelCnd_calc_no_p_PPanel.setRelateBeans(InsDelCnd_calc_grp_cd);
	}
	
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_ym_flg, true);
		setValueEx(Cnd_alc_ac_flg, true);
		setValueEx(Cnd_dpt_flg, true);
		setValueEx(Cnd_src_wg_flg, true);

		displayColumn();
	}
	
	@Override
	protected boolean useDelMsg() {
		return false;
	}
	
	protected void initCalcCtg() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_DEL.isSelected()) {
			setDefCalcCtg(InsDelCnd_calc_ctg_cd);
		}
	}
	
	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setTabMode();
		displayColumn();
		setFocus();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setTabMode();
		displayColumn();
		setFocus();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setTabMode();
		setFocus();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setTabMode();
		setFocus();
	}
	
	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
	}
	
	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}
	
	protected void setTabMode() {
		if(Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel, Tab4Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab5Panel);
		}
	}
	
	protected void setBtnMode() {
		setDefaultMode(Btn_open_MGBGP0010);
		setDefaultMode(Btn_open_MGBGP0020);
		
		if(Cnd_ope_INS.isSelected() || Cnd_ope_DEL.isSelected()) {
			if (MAC_SA_TYP.isPLN(getInsDelCndR().sa_typ())) {
				Btn_open_MGBGP0010.setMode(MCMode.ENABLE);
			}
			else if (MAC_SA_TYP.isACT(getInsDelCndR().sa_typ())) {
				Btn_open_MGBGP0020.setMode(MCMode.ENABLE);
			}
		}
	}
	
	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		super.doCnd_ope_VC(info);
		String beforeOpe = (String)info.getOldValue();
		String afterOpe = (String)info.getNewValue();
		if (isSame(beforeOpe, Cnd_ope_REF.getActionCommand())) {
			if (isSame(afterOpe, Cnd_ope_INS.getActionCommand()) ||
				isSame(afterOpe, Cnd_ope_DEL.getActionCommand())) {
				copyComboValue(Cnd_calc_grp_cd, InsDelCnd_calc_grp_cd);
				copyComboValue(Cnd_calc_no, InsDelCnd_calc_no);
			}
		}
		return true;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		_cndR = null;
		initCalcCtg();
		setSrchStatus();
		setBtnMode();
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
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			doBtn_open_MGBDP0250(r);
		}
	}
	
	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);
		
		if (!getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}
	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);
		
		if (getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		if (lc == InsDelCnd_calc_grp_cd) {
			doInsDelCnd_calc_grp_cd_LC();
		}
		super.doLCEvent(lc, info);
	}
	
	protected void doInsDelCnd_calc_grp_cd_LC() {
		setBtnMode();
	}

}