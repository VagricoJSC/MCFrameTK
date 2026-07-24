package mcframe.clientMSBG.MSBGP0150;

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
 * 画面"MSBGP_NotApplSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_NotApplSrch_MC extends MSBGP_NotApplSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_NotApplSrch_MC() {
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
	public MSBGP_NotApplSrch_MC(String name) {
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
		createMS_MSBGL0150_Srch01().execDL();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBGL0150_Srch01();
	}
	/**
	 * [MS_MSBGL0150_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0150_Prnt01Caller<P extends MSBGP_NotApplSrch, B extends MS_MSBGL0150_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBGL0150_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setCheckedRowMode(true);
		}
	}

	/**
	 * [MS_MSBGL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0150_Srch01Caller<P extends MSBGP_NotApplSrch, B extends MS_MSBGL0150_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0150_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			if (isSame(Cnd_ope_PRNT.getActionCommand(), Cnd_ope_Group.getValue())) {
				bridge.up0().scr_ope_flg(true);				
			}
			else {
				bridge.up0().scr_ope_flg(false);
			}
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
			msgList.addAll(checkAtLeastOne(RcvIfTypPanel));
			msgList.addAll(checkAtLeastOne(RcvPrntPanel));
			msgList.addAll(checkAtLeastOne(FbTgtPanel));
			msgList.addAll(checkBeforeAfter(Cnd_rcv_dt_fr, Cnd_rcv_dt_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			//　帳票発行する場合
			if (isSame(Cnd_ope_PRNT.getActionCommand(), Cnd_ope_Group.getValue())) {
				setPRNTStatus();
			}
			//　参照する場合
			else {
				setREFStatus();
			}
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (isSame(Cnd_ope_PRNT.getActionCommand(), Cnd_ope_Group.getValue())) {
				setSRCH_PRNTStatus();
			}
			//　参照する場合
			else {
				setSRCHStatus();
			}
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0250]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0250(MCEventInfo info) {
		RsltR row = RsltTable.getSelectedMCRow();						
		if (row == null) {						
			dialog(msgNoSelectedRow());					
			return;					
		}						
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0250");						
		aso.putCnd(crtOpenMSBGP0250CndR(aso, row));				
		aso.putSearchAction();						
		aso.show();						

	}
	
	/**
	 * 入金実績一覧画面の条件指定
	 * 
	 * @param aso 
	 * @param r 指定レコード情報
	 */
	protected mcframe.clientMSBG.MSBGP0250.CndR crtOpenMSBGP0250CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0250.MSBGP_RcvActSrch p = (mcframe.clientMSBG.MSBGP0250.MSBGP_RcvActSrch) aso.getPanel();
		mcframe.clientMSBG.MSBGP0250.CndR to = mcframe.clientMSBG.MSBGP0250.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.ar_appl_flg(true);
		to.susp_adv_flg(true);
		to.sw_flg(true);
		to.tax_diff_flg(true);
		to.not_prnt_flg(true);
		to.prnt_flg(true);
		to.rcv_no(r.rcv_no());		
		return to;
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
		
		MCRow bind = MCRow.create();
		bind.addStringColumn("rcv_no", r.rcv_no());
		bind.addStringColumn("dat_typ", r.rcv_dat_typ());
		
		openPanel("MS", "MSBGP0210", T1, bind);
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
		
		MCRow bind = MCRow.create();
		bind.addStringColumn("rcv_no", r.rcv_no());
		bind.addStringColumn("dat_typ", r.rcv_dat_typ());
		
		openPanel("MS", "MSBGP0200", T1, bind);
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
	
	/**
	 * 遷移先[MSBGP0140]の検索条件Rowコンテナを返します。
	 * 
	 * @param aso 
	 * @param r 指定レコード情報
	 */
	protected mcframe.clientMSBG.MSBGP0140.CndR crtOpenMSBGP0140CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg p = (mcframe.clientMSBG.MSBGP0140.MSBGP_RcvReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0140.CndR to = mcframe.clientMSBG.MSBGP0140.CndR.create();				
		to.rcv_no(r.rcv_no());	
		to.ope(p.Cnd_ope_REF.getActionCommand());
		return to;				
	}

	/**
	 * Panel[Btn]のボタン[open_MSBGP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0160(MCEventInfo info) {
		RsltR row = RsltTable.getSelectedMCRow();						
		if (row == null) {						
			dialog(msgNoSelectedRow());					
			return;					
		}						
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0160");						
		aso.putCnd(crtOpenMSBGP0160CndR(aso, row));						
		aso.putSearchAction();						
		aso.show();	
	}
	
	/**
	 * 遷移先[MSBGP0160]の検索条件Rowコンテナを返します。
	 * 
	 * @param aso 
	 * @param r 指定レコード情報
	 */
	protected mcframe.clientMSBG.MSBGP0160.CndR crtOpenMSBGP0160CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0160.MSBGP_RcvDivReg p = (mcframe.clientMSBG.MSBGP0160.MSBGP_RcvDivReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0160.CndR to = mcframe.clientMSBG.MSBGP0160.CndR.create();				
		to.rcv_no(r.rcv_no());	
		to.ope(p.Cnd_ope_REF.getActionCommand());
		return to;				
	}

	
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBGL0150_Prnt01();
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
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		setBoolean(RcvIfTypPanel, true);
		setBoolean(RcvPrntPanel, true);
		setBoolean(FbTgtPanel, true);
		getCndR().ope(Cnd_ope_REF.getActionCommand());
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
	@Override
	public void setSRCH_PRNTStatus() {
		super.setSRCH_PRNTStatus();
		setFocus();
	}
	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
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
	protected void setupParts() {
		super.setupParts();
		Rslt_rcv_grp_p_PPanel.setRelateBeans(Cnd_rcv_grp_PPanel);
		Rslt_bill_grp_p_PPanel.setRelateBeans(Cnd_bill_grp_PPanel);
		Rslt_rcv_amt_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
		Rslt_roc_bal_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (isStatusNone(getRsltL())) {
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
		if (isSame(Cnd_ope_PRNT.getActionCommand(), Cnd_ope_Group.getValue())) {
			setPrntInitCnd();			
		}
		else {
			setSrchInitCnd();
		}
	}
	
	/**
	 * 操作種別が参照時の初期検索条件の設定
	 * 
	 */
	protected void setSrchInitCnd() {
		setBoolean(RcvIfTypPanel, true);
		setSRCHStatus();
	}

	/**
	 * 操作種別が帳票発行時の初期検索条件の設定
	 * 
	 */
	protected void setPrntInitCnd() {
		setValueEx(Cnd_rcv_flg, true);
		setValueEx(Cnd_susp_flg, false);
		setValueEx(Cnd_adv_flg, false);
		setValueEx(Cnd_ap_flg, false);
		setSRCH_PRNTStatus();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		RsltR r = RsltTable.getSelectedMCRow();
		if (!isNull(r)) {
			setBtnMode(r);
		}
	}

	/**
	 * 前受収納、売掛消込及び収納一覧照会ボタンの制御
	 * 
	 */
	protected void setBtnMode(RsltR r) {
		String rcvDatTyp = r.rcv_dat_typ();
		String divSrcRcvNo = r.div_src_rcv_no();
		// 前受金
		if (MSC_RCV_DAT_TYP.isADV(rcvDatTyp)) {
			Btn_open_MSBGP0140.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0160.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0200.setMode(MCMode.ENABLE);
			Btn_open_MSBGP0210.setMode(MCMode.ENABLE);
			Btn_open_MSBGP0250.setMode(MCMode.ENABLE);
		}
		// 入金登録
		else if (MSC_RCV_DAT_TYP.isRCV(rcvDatTyp)) {
			Btn_open_MSBGP0140.setMode(MCMode.ENABLE);
			if(divSrcRcvNo == null){
				Btn_open_MSBGP0160.setMode(MCMode.ENABLE);
			}
			else{
				Btn_open_MSBGP0160.setMode(MCMode.DISABLE);
			}
			Btn_open_MSBGP0200.setMode(MCMode.ENABLE);
			Btn_open_MSBGP0210.setMode(MCMode.ENABLE);
			Btn_open_MSBGP0250.setMode(MCMode.ENABLE);
		}
		// 仮受金
		else if (MSC_RCV_DAT_TYP.isSUSP(rcvDatTyp)) {
			Btn_open_MSBGP0140.setMode(MCMode.DISABLE);
			if(divSrcRcvNo == null){
				Btn_open_MSBGP0160.setMode(MCMode.ENABLE);
			}
			else{
				Btn_open_MSBGP0160.setMode(MCMode.DISABLE);
			}
			Btn_open_MSBGP0200.setMode(MCMode.ENABLE);
			Btn_open_MSBGP0210.setMode(MCMode.ENABLE);
			Btn_open_MSBGP0250.setMode(MCMode.ENABLE);
		}
		// 買掛金相殺
		else if (MSC_RCV_DAT_TYP.isAP(rcvDatTyp)) {
			Btn_open_MSBGP0140.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0160.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0200.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0210.setMode(MCMode.ENABLE);
			Btn_open_MSBGP0250.setMode(MCMode.ENABLE);
		}
		// その他
		else {
			Btn_open_MSBGP0140.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0160.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0200.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0250.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());

			if (r == null) {
				return;
			}
			if (MSC_RCV_DAT_TYP.isRCV(r.rcv_dat_typ())) {
				doBtn_open_MSBGP0140(info);
			}
		}
	}

}