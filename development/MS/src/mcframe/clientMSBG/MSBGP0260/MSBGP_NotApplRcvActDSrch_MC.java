package mcframe.clientMSBG.MSBGP0260;

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
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
 * 画面"MSBGP_NotApplRcvActDSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_NotApplRcvActDSrch_MC extends MSBGP_NotApplRcvActDSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_NotApplRcvActDSrch_MC() {
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
	public MSBGP_NotApplRcvActDSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0260_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0260_Srch01Caller<P extends MSBGP_NotApplRcvActDSrch, B extends MS_MSBGL0260_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0260_Srch01Caller(P p, B b) {
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
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBGL0260_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBGL0260_Srch01().execDL();
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
	

	/**
	 * 遷移先[MABCP0210]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0210.CndR crtOpenMSBGP0210CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg p = 
				(mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0210.CndR to = 
				mcframe.clientMSBG.MSBGP0210.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.rcv_act_no(r.rcv_act_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0220]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0220(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0220");
		aso.putCnd(crtOpenMSBGP0220CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected void doBtn_open_MSBGP0220(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0220");
		aso.putCnd(crtOpenMSBGP0220CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MABCP0220]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0220.CndR crtOpenMSBGP0220CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0220.MSBGP_ArDtlApplReg_MC p = 
				(mcframe.clientMSBG.MSBGP0220.MSBGP_ArDtlApplReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0220.CndR to = 
				mcframe.clientMSBG.MSBGP0220.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.rcv_act_d_no(r.rcv_act_d_no());
		return to;
	}
	
	// --------------------画面初期値設定start--------------------
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_tgt_appl_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_appl_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_trd_cur_amt1_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_trd_cur_amt2_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_acst_grp_p_PPanel.setRelateBeans(Cnd_acst_grp_p_PPanel);
		Rslt_rcst_grp_p_PPanel.setRelateBeans(Cnd_rcst_grp_p_PPanel);
		Rslt_bcst_grp_p_PPanel.setRelateBeans(Cnd_bcst_grp_p_PPanel);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	// --------------------画面初期値設定end----------------------
	// --------------------画面ステータスstart----------------------
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
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
			else{
				doBtn_open_MSBGP0220(r);
			}		
		}		
	}	
	// --------------------画面イベント処理end--------------------------	

}