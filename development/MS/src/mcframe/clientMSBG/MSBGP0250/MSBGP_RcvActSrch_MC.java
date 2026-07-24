package mcframe.clientMSBG.MSBGP0250;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5190.*;
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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_RcvActSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_RcvActSrch_MC extends MSBGP_RcvActSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvActSrch_MC() {
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
	public MSBGP_RcvActSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0250_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0250_Prnt01Caller<P extends MSBGP_RcvActSrch, B extends MS_MSBGL0250_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBGL0250_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setCheckedRowMode(true);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setSRCH_PRNTStatus();
		}
	}


	/**
	 * [MS_MSBGL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0250_Srch01Caller<P extends MSBGP_RcvActSrch, B extends MS_MSBGL0250_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0250_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkBeforeAfter(Cnd_rcv_dt_fr, Cnd_rcv_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
			msgList.addAll(checkAtLeastOne(ModePanel));
			msgList.addAll(checkAtLeastOne(PrntPanel));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			if (Cnd_ope_REF.isSelected()) {
				setREFStatus();
			}
			else {
				setPRNTStatus();
			}
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_ope_REF.isSelected()) {
				setSRCH_REFStatus();
			}
			else {
				setSRCH_PRNTStatus();
			}
			
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBGL0250_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBGL0250_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0210(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0210");
		aso.putCnd(crtOpenMSBGP0210CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected void doBtn_open_MSBGP0210(RsltR r) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0210");
		aso.putCnd(crtOpenMSBGP0210CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABGP0210]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0210.CndR crtOpenMSBGP0210CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg p = 
				(mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0210.CndR to = 
				mcframe.clientMSBG.MSBGP0210.CndR.create();
	
		to.ope(p.Cnd_ope_REF.getActionCommand());	
		to.rcv_act_no(r.rcv_act_no());
		to.rcv_act_rev(r.rcv_act_rev());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0200(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0200");
		aso.putCnd(crtOpenMSBGP0200CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected void doBtn_open_MSBGP0200(RsltR r) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0200");
		aso.putCnd(crtOpenMSBGP0200CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}	

	/**
	 * 遷移先[MABGP0200]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0200.CndR crtOpenMSBGP0200CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0200.MSBGP_AdvRcvReg p = 
				(mcframe.clientMSBG.MSBGP0200.MSBGP_AdvRcvReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0200.CndR to = 
				mcframe.clientMSBG.MSBGP0200.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());		
		to.rcv_act_no(r.rcv_act_no());
		to.rcv_act_rev(r.rcv_act_rev());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBGL0250_Prnt01();
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
	
	// --------------------画面初期値設定start--------------------
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_subttl1_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_subttl2_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_tax_diff_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_base_cur_subttl1_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_subttl2_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_tax_diff_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_rcst_grp_p_PPanel.setRelateBeans(Cnd_rcst_grp_p_PPanel);
		Rslt_bcst_grp_p_PPanel.setRelateBeans(Cnd_bcst_grp_p_PPanel);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
		
		setBoolean(ModePanel, true);
		setBoolean(PrntPanel, true);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	// --------------------画面初期値設定end----------------------
	// --------------------画面ステータスstart----------------------
	@Override
	public void setSRCH_PRNTStatus() {
		super.setSRCH_PRNTStatus();
		setFocus();
	}
	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setFocus();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setFocus();
	}
	
	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		setFocus();
	}
	
	protected void setFocus() {
		
		if(getRsltL().size() > 0){
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}else{
			CndPanel.focusFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}
	// --------------------画面ステータスend------------------------
	// --------------------画面イベント処理start--------------------------
	@Override			
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {			
		super.doDCEvent(compo, info);		
		if (compo == RsltTable) {		
			RsltR r = getRsltL().get(info.getEventIndex());	
			if (r == null) {	
				return;
			}	
			else if (isArApplTrdTyp(r.trd_ptn_typ())) {
				doBtn_open_MSBGP0210(r);
			}
			else if (isSuspAdvTrdTyp(r.trd_ptn_typ())) {
				doBtn_open_MSBGP0200(r);
			}
		}		
	}	
	// --------------------画面イベント処理end--------------------------
	
	// --------------------イベント処理start------------------------
	protected boolean isRefStatus() {
		return isSame(getStatus(), REF);
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// REF（参照種別）では、クリア確認出さない
			if (isRefStatus() || isStatusNone(getRsltL())) {
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

		getRsltL().clear();
		
		if (isSame(info.getNewValue(), Cnd_ope_PRNT.getActionCommand())) {
			setSRCH_PRNTStatus();
		}
		else if (isSame(info.getNewValue(), Cnd_ope_REF.getActionCommand())) {
			setSRCH_REFStatus();
		}
	}
	@Override
	public void doRslt_NC(MCEventInfo info){
		super.doRslt_NC(info);
		RsltR r = RsltTable.getSelectedMCRow();
		
		if (!isNull(r)) {
			setBtnMode(r.trd_ptn_typ(), r.slip_sts_typ());
		}
		else {
			setBtnMode(null, null);
		}
	}
	
	/**
	 * 伝票の状況や取引パタン区分に応じてボタンのモードを設定する
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param slipStsTyp 伝票状況区分
	 */
	protected void setBtnMode(String trdPtnTyp, String slipStsTyp) {

		if (isArApplTrdTyp(trdPtnTyp)) {
			Btn_open_MSBGP0200.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0210.setMode(MCMode.ENABLE);
		}
		else if (isSuspAdvTrdTyp(trdPtnTyp)) {
			Btn_open_MSBGP0200.setMode(MCMode.ENABLE);
			Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBGP0200.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
		}

	}
	
	/**
	 * 取引パタン区分が売掛消込画面で使用されるものかを判定
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @return 使用可能される場合にtrue
	 */
	protected boolean isArApplTrdTyp(String trdPtnTyp) {

		if (MAC_TRD_PTN_TYP.isRCV_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(trdPtnTyp)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 取引パタン区分が仮受前受登録画面で使用されるものかを判定
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @return 使用可能される場合にtrue
	 */
	protected boolean isSuspAdvTrdTyp(String trdPtnTyp) {

		if (MAC_TRD_PTN_TYP.isRCV_SUSP(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isRCV_ADV(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp)					
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(trdPtnTyp)) {
			return true;
		}
		return false;
	}
	// --------------------イベント処理end--------------------------

}