package mcframe.clientMSBG.MSBGP0190;

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
 * 画面"MSBGP_NoteSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_NoteSrch_MC extends MSBGP_NoteSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_NoteSrch_MC() {
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
	public MSBGP_NoteSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBGL0190_Srch01().execDL();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBGL0190_Srch01();
	}
	/**
	 * [MS_MSBGL0190_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0190_Srch01Caller<P extends MSBGP_NoteSrch, B extends MS_MSBGL0190_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0190_Srch01Caller(P p, B b) {
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
			checkForCallStackSub(msgList);
		}
		
		/**
		 * 検索条件項目のクライアントチェック処理（チェックボックス、日付項目）
		 * 
		 * @parama msgList メッセージ
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(ModePanel));
			msgList.addAll(checkAtLeastOne(FbTgtPanel));
			msgList.addAll(checkBeforeAfter(Cnd_rcv_dt_fr, Cnd_rcv_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_draw_dt_fr, Cnd_draw_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_due_dt_fr, Cnd_due_dt_to));
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
	 * Panel[Btn]のボタン[open_MSBGP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0140(MCEventInfo info) {
		RsltR row = RsltTable.getSelectedMCRow();						
		if (row == null) {						
			dialog(msgNoSelectedRow());					
			return;					
		}						
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0140");						
		aso.putCnd(crtOpenMSBGP0140CndR(aso, row));						
		aso.putSearchAction();						
		aso.show();	
	}
	protected void doBtn_open_MSBGP0140(RsltR r) {
		RsltR row = RsltTable.getSelectedMCRow();						
		if (row == null) {						
			dialog(msgNoSelectedRow());					
			return;					
		}						
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0140");						
		aso.putCnd(crtOpenMSBGP0140CndR(aso, row));						
		aso.putSearchAction();						
		aso.show();	
	}
		
	/**
	 * 入金登録画面の条件指定
	 * 
	 * @param aso 
	 * @param r 指定レコード情報
	 */
	protected mcframe.clientMSBG.MSBGP0140.CndR crtOpenMSBGP0140CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg p = (mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0140.CndR to = mcframe.clientMSBG.MSBGP0140.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.rcv_no(r.rcv_no());
		return to;				
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBGP0210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0210(MCEventInfo info) {
		RsltR row = RsltTable.getSelectedMCRow();						
		if (row == null) {						
			dialog(msgNoSelectedRow());					
			return;					
		}						
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0210");						
		aso.putCnd(crtOpenMSBGP0210CndR(aso, row));						
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
	 * 遷移先[MSBGP0210]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0210.CndR crtOpenMSBGP0210CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg p = (mcframe.clientMSBG.MSBGP0210.MSBGP_ArApplReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0210.CndR to = mcframe.clientMSBG.MSBGP0210.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.rcv_act_no(r.rcv_act_no());
		to.latest_flg(true);
		return to;
	}
	@Override
	protected void valueInit() {
		super.valueInit();
		setBoolean(ModePanel, true);
		setBoolean(FbTgtPanel, true);
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_rcv_grp_p_PPanel.setRelateBeans(Cnd_rcv_grp_PPanel);
		Rslt_bill_grp_p_PPanel.setRelateBeans(Cnd_bill_grp_PPanel);
		Rslt_rcv_amt_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
	}
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
		@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setFocus();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setFocus();
		Ctrl_ctrl_PPanel.expand(false);
	}
	protected void setFocus() {
		if (getRsltL().size() > 0) {
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			FoldTab.focusActiveFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		RsltR r = RsltTable.getSelectedMCRow();
		if (!isNull(r)) {
			setBtnMode(r.rcv_no(), r.rcv_act_no());
		}
	}

	/**
	 * 入金登録、売掛消込登録ボタンの制御
	 * 
	 * @param rcvNo 入金ＮＯ
	 * @param rcvActNo 入金実績ＮＯ
	 */
	protected void setBtnMode(String rcvNo, String rcvActNo) {
		
		// 入金ＮＯが設定されている場合
		if (!isNull(rcvNo)) {
			Btn_open_MSBGP0140.setMode(MCMode.ENABLE);
		} 
		else {
			Btn_open_MSBGP0140.setMode(MCMode.DISABLE);			
		}
		// 入金実績ＮＯが設定されている場合
		if (!isNull(rcvActNo)) {
			Btn_open_MSBGP0210.setMode(MCMode.ENABLE);
		}
		else {
			Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
		}
	}

	// --------------------画面イベント処理start--------------------------
	@Override			
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {			
		super.doDCEvent(compo, info);		
		if (compo == RsltTable) {		
			RsltR r = getRsltL().get(info.getEventIndex());	
			if (r == null) {	
				return;
			}	
			else if (!isNull(r.rcv_no())) {
				doBtn_open_MSBGP0140(r);
			}
			else if (!isNull(r.rcv_act_no())) {
				doBtn_open_MSBGP0210(r);
			}
			else {
				return;
			}	
		}		
	}	
	// --------------------画面イベント処理end--------------------------

}