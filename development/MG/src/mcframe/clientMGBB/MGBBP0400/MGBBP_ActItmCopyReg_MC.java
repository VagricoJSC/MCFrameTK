package mcframe.clientMGBB.MGBBP0400;

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

import mcframe.clientMAUB.MAUBP0230.*;

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
 * 画面"MGBBP_ActItmCopyReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_ActItmCopyReg_MC extends MGBBP_ActItmCopyReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ActItmCopyReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MGBDP0500]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0500(MCEventInfo info) {
		doBtn_open_MGBDP0500();
	}
	protected void doBtn_open_MGBDP0500() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0500");
		mcframe.clientMGBD.MGBDP0500.MGBDP_ItmReg p = (mcframe.clientMGBD.MGBDP0500.MGBDP_ItmReg) aso.getPanel();

		mcframe.clientMGBD.MGBDP0500.CndR to = mcframe.clientMGBD.MGBDP0500.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		
		aso.show();	
	}
	/**
	 * [MG_MGBBL0400_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0400_Ins01Caller<P extends MGBBP_ActItmCopyReg, B extends MG_MGBBL0400_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0400_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndPanel.focusFirstComponent();
		}
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		setBoolean(TgtPanel, true);
		setPtnSetTypMode();
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		setBoolean(TgtPanel, false);
		setPtnSetTypMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBBL0400_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0510]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0510(MCEventInfo info) {
		doBtn_open_MGBDP0510();
	}
	protected void doBtn_open_MGBDP0510() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0510");
		mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg p = (mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg) aso.getPanel();

		mcframe.clientMGBD.MGBDP0510.CndR to = mcframe.clientMGBD.MGBDP0510.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_cd(getCndR().wg_cd());
		}
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		
		aso.show();	
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0560]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0560(MCEventInfo info) {
		doBtn_open_MGBDP0560();
	}
	protected void doBtn_open_MGBDP0560() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0560");
		mcframe.clientMGBD.MGBDP0560.MGBDP_ItmOperReg p = (mcframe.clientMGBD.MGBDP0560.MGBDP_ItmOperReg) aso.getPanel();

		mcframe.clientMGBD.MGBDP0560.CndR to = mcframe.clientMGBD.MGBDP0560.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_cd(getCndR().wg_cd());
		}
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		
		aso.show();	
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0530]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0530(MCEventInfo info) {
		doBtn_open_MGBDP0530();
	}
	protected void doBtn_open_MGBDP0530() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0530");
		mcframe.clientMGBD.MGBDP0530.MGBDP_BomLst p = (mcframe.clientMGBD.MGBDP0530.MGBDP_BomLst) aso.getPanel();

		mcframe.clientMGBD.MGBDP0530.CndR to = mcframe.clientMGBD.MGBDP0530.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_cd(getCndR().wg_cd());
		}
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		
		aso.show();	
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0580]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0580(MCEventInfo info) {
		doBtn_open_MGBDP0580();
	}
	protected void doBtn_open_MGBDP0580() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0580");
		mcframe.clientMGBD.MGBDP0580.MGBDP_ItmWkReg p = (mcframe.clientMGBD.MGBDP0580.MGBDP_ItmWkReg) aso.getPanel();

		mcframe.clientMGBD.MGBDP0580.CndR to = mcframe.clientMGBD.MGBDP0580.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_cd(getCndR().wg_cd());
		}
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		
		aso.show();	
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0600]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0600(MCEventInfo info) {
		doBtn_open_MGBDP0600();
	}
	protected void doBtn_open_MGBDP0600() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0600");
		mcframe.clientMGBD.MGBDP0600.MGBDP_ItmPurcReg p = (mcframe.clientMGBD.MGBDP0600.MGBDP_ItmPurcReg) aso.getPanel();

		mcframe.clientMGBD.MGBDP0600.CndR to = mcframe.clientMGBD.MGBDP0600.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_cd(getCndR().wg_cd());
		}
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		
		aso.show();	
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0660]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0660(MCEventInfo info) {
		doBtn_open_MGBDP0660();
	}
	protected void doBtn_open_MGBDP0660() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0660");
		mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg p = (mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg) aso.getPanel();

		mcframe.clientMGBD.MGBDP0660.CndR to = mcframe.clientMGBD.MGBDP0660.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_cd(getCndR().wg_cd());
		}
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		
		aso.show();	
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0610]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0610(MCEventInfo info) {
		doBtn_open_MGBDP0610();
	}
	protected void doBtn_open_MGBDP0610() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0610");
		mcframe.clientMGBD.MGBDP0610.MGBDP_ItmProvReg p = (mcframe.clientMGBD.MGBDP0610.MGBDP_ItmProvReg) aso.getPanel();

		mcframe.clientMGBD.MGBDP0610.CndR to = mcframe.clientMGBD.MGBDP0610.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_cd(getCndR().wg_cd());
		}
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		
		aso.show();	
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0590]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0590(MCEventInfo info) {
		doBtn_open_MGBDP0590();
	}
	protected void doBtn_open_MGBDP0590() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0590");
		mcframe.clientMGBD.MGBDP0590.MGBDP_ItmSlsReg p = (mcframe.clientMGBD.MGBDP0590.MGBDP_ItmSlsReg) aso.getPanel();

		mcframe.clientMGBD.MGBDP0590.CndR to = mcframe.clientMGBD.MGBDP0590.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_cd(getCndR().wg_cd());
		}
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		to.ope(p.Cnd_ope_REF.getActionCommand());
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
		setBoolean(TgtPanel, true);
		
		initCalcCtg();
		
		setPtnSetTypMode();
	}

	protected void initCalcCtg() {
		setDefCalcCtg(
				Cnd_act_calc_ctg_cd, 
				Cnd_calc_ctg_cd);
	}
	
	// -----------------------------------------------
	// status
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		Cnd_term_p_PPanel.setDefault(false);

		setPtnSetTypMode();
		CndPanel.focusFirstComponent();
	}

	// -----------------------------------------------
	// Event

	@Override
	public void doCnd_dtl_flg_NC(MCEventInfo info) {
		super.doCnd_dtl_flg_NC(info);
		setPtnSetTypMode();
	}

	@Override
	public void doCnd_oper_flg_NC(MCEventInfo info) {
		super.doCnd_dtl_flg_NC(info);
		setPtnSetTypMode();
	}

	@Override
	public void doCnd_bom_flg_NC(MCEventInfo info) {
		super.doCnd_dtl_flg_NC(info);
		setPtnSetTypMode();
	}

	@Override
	public void doCnd_wk_flg_NC(MCEventInfo info) {
		super.doCnd_dtl_flg_NC(info);
		setPtnSetTypMode();
	}

	protected void setPtnSetTypMode(){
		if(isPtnSetTypMode()){
			setDefaultMode(Cnd_ptn_set_typ);
		}
		else {
			setValueEx(Cnd_ptn_set_typ, null);
			Cnd_ptn_set_typ.setMode(MCMode.READ_ONLY);
		}
	}

	protected boolean isPtnSetTypMode() {
		CndR r = getCndR();
		return r.dtl_flg() || r.oper_flg() || r.bom_flg() || r.wk_flg();
	}

	protected boolean isInstCalcCtg() {
		CndR r = getCndR();
		return r.dtl_flg() || r.oper_flg() || r.bom_flg() || r.wk_flg() || r.proc_flg() || r.prov_flg();
	}

	protected boolean isOperCalcCtg() {
		CndR r = getCndR();
		return r.oper_flg() || r.bom_flg() || r.wk_flg();
	}

}