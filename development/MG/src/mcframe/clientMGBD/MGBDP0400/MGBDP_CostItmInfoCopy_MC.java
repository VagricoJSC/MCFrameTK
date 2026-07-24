package mcframe.clientMGBD.MGBDP0400;

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

import mcframe.clientMAUB.MAUBP0240.*;

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
 * 画面"MGBDP_CostItmInfoCopy"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CostItmInfoCopy_MC extends MGBDP_CostItmInfoCopy_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CostItmInfoCopy_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[Cnd]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * [MG_MGBDL0400_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0400_Ins01Caller<P extends MGBDP_CostItmInfoCopy, B extends MG_MGBDL0400_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0400_Ins01Caller(P p, B b) {
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
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
			msgList.addAll(checkAtLeastOne(TgtPanel));
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}
	}

	/**
	 * [MG_MGBDL0400_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0400_Del01Caller<P extends MGBDP_CostItmInfoCopy, B extends MG_MGBDL0400_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0400_Del01Caller(P p, B b) {
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
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
			msgList.addAll(checkAtLeastOne(TgtPanel));
		}
	}


	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		setBoolean(TgtPanel, true);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		setBoolean(TgtPanel, false);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0400_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0400_Del01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0510]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0510(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0510");
		mcframe.clientMGBD.MGBDP0510.CndR to = mcframe.clientMGBD.MGBDP0510.CndR.create();
		mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg p = (mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term_fr());
		to.term_to(getCndR().term_fr());
		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0510.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0510.CndR.$cmn_flg);
		}
		aso.putCnd(to,list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0560]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0560(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0560");
		mcframe.clientMGBD.MGBDP0560.CndR to = mcframe.clientMGBD.MGBDP0560.CndR.create();
		mcframe.clientMGBD.MGBDP0560.MGBDP_ItmOperReg p = (mcframe.clientMGBD.MGBDP0560.MGBDP_ItmOperReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term_fr());
		to.term_to(getCndR().term_fr());
		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0560.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0560.CndR.$cmn_flg);
		}
		aso.putCnd(to,list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0530]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0530(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0530");
		mcframe.clientMGBD.MGBDP0530.CndR to = mcframe.clientMGBD.MGBDP0530.CndR.create();
		mcframe.clientMGBD.MGBDP0530.MGBDP_BomLst p = (mcframe.clientMGBD.MGBDP0530.MGBDP_BomLst) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term_fr());
		to.term_to(getCndR().term_fr());
		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0530.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0530.CndR.$cmn_flg);
		}
		aso.putCnd(to,list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0580]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0580(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0580");
		mcframe.clientMGBD.MGBDP0580.CndR to = mcframe.clientMGBD.MGBDP0580.CndR.create();
		mcframe.clientMGBD.MGBDP0580.MGBDP_ItmWkReg p = (mcframe.clientMGBD.MGBDP0580.MGBDP_ItmWkReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term_fr());
		to.term_to(getCndR().term_fr());
		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0580.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0580.CndR.$cmn_flg);
		}
		aso.putCnd(to,list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0600]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0600(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0600");
		mcframe.clientMGBD.MGBDP0600.CndR to = mcframe.clientMGBD.MGBDP0600.CndR.create();
		mcframe.clientMGBD.MGBDP0600.MGBDP_ItmPurcReg p = (mcframe.clientMGBD.MGBDP0600.MGBDP_ItmPurcReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term_fr());
		to.term_to(getCndR().term_fr());
		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0600.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0600.CndR.$cmn_flg);
		}
		aso.putCnd(to,list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0660]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0660(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0660");
		mcframe.clientMGBD.MGBDP0660.CndR to = mcframe.clientMGBD.MGBDP0660.CndR.create();
		mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg p = (mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term_fr());
		to.term_to(getCndR().term_fr());
		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0660.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0660.CndR.$cmn_flg);
		}
		aso.putCnd(to,list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0610]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0610(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0610");
		mcframe.clientMGBD.MGBDP0610.CndR to = mcframe.clientMGBD.MGBDP0610.CndR.create();
		mcframe.clientMGBD.MGBDP0610.MGBDP_ItmProvReg p = (mcframe.clientMGBD.MGBDP0610.MGBDP_ItmProvReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term_fr());
		to.term_to(getCndR().term_fr());
		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0610.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0610.CndR.$cmn_flg);
		}
		aso.putCnd(to,list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0590]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0590(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0590");
		mcframe.clientMGBD.MGBDP0590.CndR to = mcframe.clientMGBD.MGBDP0590.CndR.create();
		mcframe.clientMGBD.MGBDP0590.MGBDP_ItmSlsReg p = (mcframe.clientMGBD.MGBDP0590.MGBDP_ItmSlsReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term_fr());
		to.term_to(getCndR().term_fr());
		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0590.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0590.CndR.$cmn_flg);
		}
		aso.putCnd(to,list);
		aso.runValueInit();
		aso.show();
	}


	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_term_p_PPanel.setDefault(false);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		setValueEx(Cnd_lump_flg, true);
		setValueEx(Cnd_dtl_flg, true);
		setValueEx(Cnd_oper_flg, true);
		setValueEx(Cnd_bom_flg, true);
		setValueEx(Cnd_wk_flg, true);
		setValueEx(Cnd_purc_flg, true);
		setValueEx(Cnd_proc_flg, true);
		setValueEx(Cnd_prov_flg, true);
		setValueEx(Cnd_sls_flg, true);
		initRegTgt();
		initCalcCtg();
		setDefaultTerm();
	}
	protected void initRegTgt() {
		if (!Cnd_srch_wg.authorize()) {
			setValueEx(Cnd_wg_flg, false);
		}
		if (!Cnd_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
		}
		if (getCndR().cmn_flg() && getCndR().wg_flg()) {
			setValueEx(Cnd_cmn_flg, false);
		}
		else if (!getCndR().cmn_flg() && !getCndR().wg_flg()) {
			if (Cnd_srch_wg.authorize()) {
				setValueEx(Cnd_wg_flg, true);
			}
			else if (Cnd_srch_cmn.authorize()) {
				setValueEx(Cnd_cmn_flg, true);
			}
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}
	protected void initCalcCtg() {
		setDefCalcCtg(Cnd_calc_ctg_cd);
	}
	protected void setDefaultTerm() {
		if (isNull(getCndR().term_fr())) {
			setValueEx(Cnd_term_fr, getTerm(this));
		}
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_term_to, null);
		}
		else {
			setValueEx(Cnd_term_to, getCndR().term_fr());
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
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}
	protected void setStatusCom() {
		setRegTgtMode();
		setModeByRegTgt();
		CndPanel.focusFirstComponent();
	}
	protected void setRegTgtMode() {
		if (!Cnd_srch_cmn.authorize()|| !Cnd_srch_wg.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.READ_ONLY);
			Cnd_wg_flg.setMode(MCMode.READ_ONLY);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void setModeByRegTgt() {
		if (!getCndR().wg_flg()) {
			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_ope_NC(MCEventInfo info){
		super.doCnd_ope_NC(info);
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if(Cnd_ope_DEL.isSelected()){
			setDELStatus();
			setValueEx(Cnd_sls_upri_imp_typ, null);
		}
		setDefaultTerm();
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		if (getCndR().cmn_flg() && getCndR().wg_flg()) {
			getCndR().wg_flg(false);
		}
		setStatusCom();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		if (getCndR().cmn_flg() && getCndR().wg_flg()) {
			getCndR().cmn_flg(false);
		}
		setStatusCom();
	}

}