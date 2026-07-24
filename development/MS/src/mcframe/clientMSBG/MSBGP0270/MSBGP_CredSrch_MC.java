package mcframe.clientMSBG.MSBGP0270;

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
 * 画面"MSBGP_CredSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_CredSrch_MC extends MSBGP_CredSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_CredSrch_MC() {
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
	public MSBGP_CredSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0270_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0270_Srch01Caller<P extends MSBGP_CredSrch, B extends MS_MSBGL0270_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0270_Srch01Caller(P p, B b) {
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

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkSmallLarge(Cnd_cred_use_fr, Cnd_cred_use_to));
			msgList.addAll(checkSmallLarge(Cnd_cred_amt_fr, Cnd_cred_amt_to));
		}

		@Override
		protected void setModeNoDown() {
			setSRCHStatus();
		}

		@Override
		protected void setMode() {
			setREFStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBGL0270_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBGL0270_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0280]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0280(MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBGP0280(r);
	}
	
	/**
	 * MSBGP0280への遷移
	 * 
	 * @param r
	 */
	protected void doBtn_open_MSBGP0280 (RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0280");
		MCRow asoRow = crtOpenMSBGP0280CndR(aso, r);
		aso.putCnd(asoRow);
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBGP0280]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0280.CndR crtOpenMSBGP0280CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0280.CndR to = mcframe.clientMSBG.MSBGP0280.CndR.create();
		to.cred_cd(r.cred_cd());
		to.cur_cd(r.cur_cd());
		return to;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_cred_limit_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
		Rslt_cred_amt_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
		Rslt_ar_cred_amt_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
		Rslt_ap_cred_amt_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
		Rslt_cred_bal_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
		Rslt_alarm_amt_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_amt_dec_place);
		Rslt_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {

		super.doRslt_NC(info);
		if (!isNull(RsltTable.getSelectedMCRow())) {
			Btn_open_MSBGP0280.setMode(MCMode.ENABLE);
		}
		else {
			Btn_open_MSBGP0280.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			doBtn_open_MSBGP0280(r);
		}
	}

	@Override
	public void setREFStatus() {

		super.setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setSRCHStatus() {

		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		FoldTab.focusActiveFirstComponent();
	}

}