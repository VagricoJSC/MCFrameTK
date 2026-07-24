package mcframe.clientMGBA.MGBAP0200;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBAP_ActPlnCopy"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBAP_ActPlnCopy_MC extends MGBAP_ActPlnCopy_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBAP_ActPlnCopy_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBAL0200_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0200_Ins01Caller<P extends MGBAP_ActPlnCopy, B extends MG_MGBAL0200_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBAL0200_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		protected void initCallerSub() {
			editCnd();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_act_ym_fr, Cnd_act_ym_to));
			msgList.addAll(checkAtLeastOne(TgtPanel));
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
		}
	}

	/**
	 * [MG_MGBAL0200_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0200_Ins02Caller<P extends MGBAP_ActPlnCopy, B extends MG_MGBAL0200_Ins02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBAL0200_Ins02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		protected void initCallerSub() {
			editCnd();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_act_ym_fr, Cnd_act_ym_to));
			msgList.addAll(checkAtLeastOne(TgtPanel));
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
		}
	}
	protected void editCnd(){
		getCndR().amt_flg_str(MCBooleanUtil.booleanToDBString(false));
		getCndR().trd_amt_flg_str(MCBooleanUtil.booleanToDBString(false));

		if(getCndR().amt_flg()){
			getCndR().amt_flg_str(MCBooleanUtil.booleanToDBString(true));
			if(Cnd_amt_TRD.isSelected()){
				getCndR().trd_amt_flg_str(MCBooleanUtil.booleanToDBString(true));
			}
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
	 * Panel[Btn]のボタン[upd_mly]の押下時の処理
	 */
	@Override
	public void doBtn_upd_mly(MCEventInfo info) {
		callMG_MGBAL0200_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd_smr]の押下時の処理
	 */
	@Override
	public void doBtn_upd_smr(MCEventInfo info) {
		callMG_MGBAL0200_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBAP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0030(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0030");
		mcframe.clientMGBA.MGBAP0030.CndR to = mcframe.clientMGBA.MGBAP0030.CndR.create();
		mcframe.clientMGBA.MGBAP0030.MGBAP_PlnMfgReg p = (mcframe.clientMGBA.MGBAP0030.MGBAP_PlnMfgReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().pln_calc_ctg_cd());
		to.ym_fr(getCndR().pln_ym_fr());
		to.ym_to(getCndR().pln_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBAP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0040(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0040");
		mcframe.clientMGBA.MGBAP0040.CndR to = mcframe.clientMGBA.MGBAP0040.CndR.create();
		mcframe.clientMGBA.MGBAP0040.MGBAP_PlnPurcReg p = (mcframe.clientMGBA.MGBAP0040.MGBAP_PlnPurcReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().pln_calc_ctg_cd());
		to.ym_fr(getCndR().pln_ym_fr());
		to.ym_to(getCndR().pln_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBAP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0070(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0070");
		mcframe.clientMGBA.MGBAP0070.CndR to = mcframe.clientMGBA.MGBAP0070.CndR.create();
		mcframe.clientMGBA.MGBAP0070.MGBAP_PlnInptReg p = (mcframe.clientMGBA.MGBAP0070.MGBAP_PlnInptReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().pln_calc_ctg_cd());
		to.ym_fr(getCndR().pln_ym_fr());
		to.ym_to(getCndR().pln_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBAP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0050(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0050");
		mcframe.clientMGBA.MGBAP0050.CndR to = mcframe.clientMGBA.MGBAP0050.CndR.create();
		mcframe.clientMGBA.MGBAP0050.MGBAP_PlnItmWkReg p = (mcframe.clientMGBA.MGBAP0050.MGBAP_PlnItmWkReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().pln_calc_ctg_cd());
		to.ym_fr(getCndR().pln_ym_fr());
		to.ym_to(getCndR().pln_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBAP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0060(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0060");
		mcframe.clientMGBA.MGBAP0060.CndR to = mcframe.clientMGBA.MGBAP0060.CndR.create();
		mcframe.clientMGBA.MGBAP0060.MGBAP_PlnOtherWkReg p = (mcframe.clientMGBA.MGBAP0060.MGBAP_PlnOtherWkReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().pln_calc_ctg_cd());
		to.ym_fr(getCndR().pln_ym_fr());
		to.ym_to(getCndR().pln_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBAP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0010(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0010");
		mcframe.clientMGBA.MGBAP0010.CndR to = mcframe.clientMGBA.MGBAP0010.CndR.create();
		mcframe.clientMGBA.MGBAP0010.MGBAP_PlnSlsReg p = (mcframe.clientMGBA.MGBAP0010.MGBAP_PlnSlsReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().pln_calc_ctg_cd());
		to.ym_fr(getCndR().pln_ym_fr());
		to.ym_to(getCndR().pln_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0300]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0300(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0300");
		mcframe.clientMGBB.MGBBP0300.CndR to = mcframe.clientMGBB.MGBBP0300.CndR.create();
		mcframe.clientMGBB.MGBBP0300.MGBBP_ActMfgIfReg p = (mcframe.clientMGBB.MGBBP0300.MGBBP_ActMfgIfReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().act_calc_ctg_cd());
		to.ym_fr(getCndR().act_ym_fr());
		to.ym_to(getCndR().act_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0310]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0310(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0310");
		mcframe.clientMGBB.MGBBP0310.CndR to = mcframe.clientMGBB.MGBBP0310.CndR.create();
		mcframe.clientMGBB.MGBBP0310.MGBBP_ActPurcIfReg p = (mcframe.clientMGBB.MGBBP0310.MGBBP_ActPurcIfReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().act_calc_ctg_cd());
		to.ym_fr(getCndR().act_ym_fr());
		to.ym_to(getCndR().act_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0320]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0320(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0320");
		mcframe.clientMGBB.MGBBP0320.CndR to = mcframe.clientMGBB.MGBBP0320.CndR.create();
		mcframe.clientMGBB.MGBBP0320.MGBBP_ActInptIfReg p = (mcframe.clientMGBB.MGBBP0320.MGBBP_ActInptIfReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().act_calc_ctg_cd());
		to.ym_fr(getCndR().act_ym_fr());
		to.ym_to(getCndR().act_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0330]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0330(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0330");
		mcframe.clientMGBB.MGBBP0330.CndR to = mcframe.clientMGBB.MGBBP0330.CndR.create();
		mcframe.clientMGBB.MGBBP0330.MGBBP_ActInstWkIfReg p = (mcframe.clientMGBB.MGBBP0330.MGBBP_ActInstWkIfReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().act_calc_ctg_cd());
		to.ym_fr(getCndR().act_ym_fr());
		to.ym_to(getCndR().act_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0340]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0340(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0340");
		mcframe.clientMGBB.MGBBP0340.CndR to = mcframe.clientMGBB.MGBBP0340.CndR.create();
		mcframe.clientMGBB.MGBBP0340.MGBBP_ActOtherWkIfReg p = (mcframe.clientMGBB.MGBBP0340.MGBBP_ActOtherWkIfReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().act_calc_ctg_cd());
		to.ym_fr(getCndR().act_ym_fr());
		to.ym_to(getCndR().act_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0370]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0370(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0370");
		mcframe.clientMGBB.MGBBP0370.CndR to = mcframe.clientMGBB.MGBBP0370.CndR.create();
		mcframe.clientMGBB.MGBBP0370.MGBBP_ActSlsIfReg p = (mcframe.clientMGBB.MGBBP0370.MGBBP_ActSlsIfReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().act_calc_ctg_cd());
		to.ym_fr(getCndR().act_ym_fr());
		to.ym_to(getCndR().act_ym_to());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}


	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_MLY.getActionCommand());
		initCalcCtg();
		setBoolean(TgtPanel, true);
	}

	protected void initCalcCtg() {
		setDefCalcCtg(Cnd_act_calc_ctg_cd);
		setDefCalcCtg(Cnd_pln_calc_ctg_cd);
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isBaseCurFlg(this)) {
			setComponentInvisibleAllStatus(Cnd_amt_TRD, Cnd_amt_BCUR);
		}
	}
	// -----------------------------------------------
	// status
	@Override
	public void setINS_MLYStatus() {
		super.setINS_MLYStatus();
		setStatusCom();
	}
	@Override
	public void setINS_SMRStatus() {
		super.setINS_SMRStatus();
		setStatusCom();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		ScreenOpePanel.focusFirstComponent();
	}
	protected void setStatusCom() {
		setAmtGroupMode();
		setPlnYmTo();
		CndPanel.focusFirstComponent();
	}
	protected void setAmtGroupMode() {
		if (getCndR().amt_flg()) {
			setDefaultMode(Cnd_amt_Group);
		}
		else {
			Cnd_amt_Group.setMode(MCMode.READ_ONLY);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_ope_NC(MCEventInfo info){
		super.doCnd_ope_NC(info);
		if (Cnd_ope_MLY.isSelected()) {
			setINS_MLYStatus();
		}
		else if(Cnd_ope_SMR.isSelected()){
			setINS_SMRStatus();
		}
	}

	@Override
	public void doCnd_amt_flg_NC(MCEventInfo info) {
		super.doCnd_amt_flg_NC(info);
		setAmtGroupMode();
	}

	@Override
	public void doCnd_act_ym_fr_LC(MCEventInfo info) {
		super.doCnd_act_ym_fr_LC(info);
		setPlnYmTo();
	}

	@Override
	public void doCnd_act_ym_to_LC(MCEventInfo info) {
		super.doCnd_act_ym_to_LC(info);
		setPlnYmTo();
	}

	@Override
	public void doCnd_pln_ym_fr_LC(MCEventInfo info) {
		super.doCnd_pln_ym_fr_LC(info);
		setPlnYmTo();
	}

	protected void setPlnYmTo(){
		if (Cnd_ope_MLY.isSelected()) {
			MCDate actYmFr = getCndR().act_ym_fr();
			MCDate actYmTo = getCndR().act_ym_to();
			MCDate plnYmFr = getCndR().pln_ym_fr();
			if(isNullOr(actYmFr, actYmTo, plnYmFr)){
				setValueEx(Cnd_pln_ym_to, null);
			}
			else{
				setValueEx(
					Cnd_pln_ym_to, 
					plnYmFr.addMonth(actYmTo.diffMonth(actYmFr)));
			}
		}
		else {
			setValueEx(Cnd_pln_ym_to, getCndR().pln_ym_fr());
		}
	}

}