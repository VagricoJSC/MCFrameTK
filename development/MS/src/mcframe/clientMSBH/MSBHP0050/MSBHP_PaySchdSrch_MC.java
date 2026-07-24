package mcframe.clientMSBH.MSBHP0050;

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
 * 画面"MSBHP_PaySchdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_PaySchdSrch_MC extends MSBHP_PaySchdSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_PaySchdSrch_MC() {
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
	public MSBHP_PaySchdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0050_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0050_Srch02Caller<P extends MSBHP_PaySchdSrch, B extends MS_MSBHL0050_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0050_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();

			setDLMode();
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
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		/**
		 * 検索条件項目のクライアントチェック処理
		 * 
		 * @param msgList メッセージ
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_pay_schd_act_dt_fr, Cnd_pay_schd_act_dt_to));
			msgList.addAll(checkAtLeastOne(AprvStsPanel));
		}
	}


	/**
	 * [MS_MSBHL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0050_Srch01Caller<P extends MSBHP_PaySchdSrch, B extends MS_MSBHL0050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0050_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setDLMode();
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
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		/**
		 * 検索条件項目のクライアントチェック処理
		 * 
		 * @param msgList メッセージ
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_pay_schd_act_dt_fr, Cnd_pay_schd_act_dt_to));
			msgList.addAll(checkAtLeastOne(AprvStsPanel));
		}
	}

	/**
	 * [MS_MSBHL0050_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0050_Prnt01Caller<P extends MSBHP_PaySchdSrch, B extends MS_MSBHL0050_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBHL0050_Prnt01Caller(P p, B b) {
			super(p, b);
			setCheckedRowMode(true);
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(Cnd2Panel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(Cnd2Panel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_mode_HDR.isSelected()) {
			callMS_MSBHL0050_Srch01();	
		}
		else {
			callMS_MSBHL0050_Srch02();
		}
		
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_mode_HDR.isSelected()) {
			createMS_MSBHL0050_Srch01().execDL();	
		}
		else {
			createMS_MSBHL0050_Srch02().execDL();	
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBHP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		doBtn_open_MSBHP0030(r);
	}
	
	/**
	 * MSBHP0030に遷移する
	 * 
	 * @param r
	 */
	protected void doBtn_open_MSBHP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0030");
		aso.putCnd(crtOpenMSBHP0030CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MSHP0030]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBH.MSBHP0030.CndR crtOpenMSBHP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBH.MSBHP0030.MSBHP_PaySchdReg p = 
				(mcframe.clientMSBH.MSBHP0030.MSBHP_PaySchdReg) aso.getPanel();
		mcframe.clientMSBH.MSBHP0030.CndR to = mcframe.clientMSBH.MSBHP0030.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.pay_chk_no(r.pay_chk_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBHP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0090(MCEventInfo info) {
		MCList<RsltR> subL = getRsltL().subList(RsltR.$check, true);
		if (subL.size() == 0) {
			dialog(msgNoSelectedRow());
			return;
		}
		MCDate dt = (MCDate) subL.max(RsltR.$pay_schd_act_dt);
		openPanel("MS", "MSBHP0090", T1, subL.getFirst(RsltR.$pay_schd_act_dt, dt), subL);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBHP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0010");	
		aso.putCnd(crtOpenMSBHP0010CndR(aso, r));	
		aso.runValueInit();
		aso.putSearchAction();	
		aso.show();	
	}

	/**
	 * 遷移先[MSHP0010]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBH.MSBHP0010.CndR crtOpenMSBHP0010CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBH.MSBHP0010.CndR to = mcframe.clientMSBH.MSBHP0010.CndR.create();
		to.pay_chk_no(r.pay_chk_no());
		to.chk_flg(true);
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[prnt_paySchdLst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_paySchdLst(MCEventInfo info) {
		callMS_MSBHL0050_Prnt01();
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
	protected void setupParts() {
		super.setupParts();

		Rslt_pay_schd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_pay_act_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		
		Rslt_bsppl_grp_p_PPanel.setRelateBeans(Cnd_bsppl_grp_p_PPanel);
		Rslt_psppl_grp_p_PPanel.setRelateBeans(Cnd_psppl_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
		setValueEx(Cnd_mode_Group, Cnd_mode_DTL.getActionCommand());
		setValueEx(Cnd_inc_com_paid_flg, true);
		setBoolean(Cnd2Panel, true);
		setBoolean(AprvStsPanel, true);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		
		RsltTable.setStatusColumnVisible(false);
	}
	
	/**
	 * 検索前ステータス
	 */
	public void setSrchStatus() {
		
		if (Cnd_ope_PRNT.isSelected()) {
			setSRCH_PRNTStatus();
		}
		else if (Cnd_mode_HDR.isSelected()) {
			setSRCH_REF_HDRStatus();
		}
		else {
			setSRCH_REF_DTLStatus();
		}
	}
	
	/**
	 * 検索後ステータス
	 */
	public void setRefStatus() {
		
		if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
		}
		else if (Cnd_mode_HDR.isSelected()) {
			setREF_HDRStatus();
		}
		else {
			setREF_DTLStatus();
		}
		
		changeDispMode();
	}
	
	@Override
	public void setSRCH_REF_HDRStatus() {
		super.setSRCH_REF_HDRStatus();
		setMode();
		// 初期値設定
		setValueEx(Cnd_dtl_flg, true);
		setValueEx(Cnd_rfrnc_dt, getToday());
		setValueEx(Cnd_pay_schd_print_rmrks, null);
		setValueEx(Cnd_trd_d_rmrks, null);
		setValueEx(Cnd_intr_rmrks, null);
		setValueEx(Cnd_sub_char1, null);
		setValueEx(Cnd_sub_char2, null);
		setValueEx(Cnd_sub_char3, null);

		// フォーカス制御
		FoldTab.focusActiveFirstComponent();
		// 検索枠を開く
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setSRCH_REF_DTLStatus() {
		super.setSRCH_REF_DTLStatus();
		setMode();
		// 初期値設定
		setValueEx(Cnd_dtl_flg, false);
		setValueEx(Cnd_rfrnc_dt, null);
		setValueEx(LPnl_key_flg, false);
		// フォーカス制御
		FoldTab.focusActiveFirstComponent();
		// 検索枠を開く
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		setMode();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	@Override
	public void setREF_DTLStatus() {
		super.setREF_DTLStatus();
		setMode();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_PRNTStatus() {
		super.setSRCH_PRNTStatus();

		setMode();
		// 初期値設定
		setValueEx(Cnd_dtl_flg, false);
		setValueEx(Cnd_rfrnc_dt, null);
		setValueEx(LPnl_key_flg, false);
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();

		setMode();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	@Override
	public void doCnd_mode_NC(MCEventInfo info) {
		super.doCnd_mode_NC(info);
		setSrchStatus();
		setMode();
		getRsltL().clear();
	}
	
	/**
	 * モード制御
	 */
	protected void setMode() {
		if (Cnd_mode_HDR.isSelected()) {
			setDefaultMode(Cnd_dtl_flg);
			setDefaultMode(LPnl_key_flg);
			Btn_open_MSBHP0090.setMode(MCMode.DISABLE);
			
			RsltTable.setSortable(false);

			setTabEnable();
		}
		else {
			Cnd_dtl_flg.setMode(MCMode.READ_ONLY);
			LPnl_key_flg.setMode(MCMode.READ_ONLY);
			if (Cnd_pay_schd_no_flg.getValue()) {
				setDefaultMode(Btn_open_MSBHP0090);	
			}
			else {
				Btn_open_MSBHP0090.setMode(MCMode.DISABLE);
			}
			
			
			RsltTable.setSortable(true);
			
			setTabEnable();
		}
	}
	
	protected void setTabEnable() {
		if (Cnd_ope_PRNT.isSelected() || Cnd_mode_HDR.isSelected()) {
			setBoolean(Cnd2Panel, true);
			FoldTab.setEnabledAt(FoldTab.indexOfComponent(Tab4Panel), false);

			// 表示中のタブが非表示になったら別のタブに切り替える
			if (!FoldTab.isEnabledAt(FoldTab.getSelectedIndex())) {
				for (int i=0; i < FoldTab.getTabCount(); i++) {
					if (FoldTab.isEnabledAt(i)) {
						FoldTab.setSelectedIndex(i);
						break;
					}
				}
			}
		}
		else {
			FoldTab.setEnabledAt(FoldTab.indexOfComponent(Tab4Panel), true);
		}
	}
	
	/**
	 * 集計単位の選択に応じてグループキーのモード制御を行う
	 * 
	 */
	protected void changeDispMode() {
		if (getCndR().bsppl_dpt_cd_flg()) {
			setDefaultMode(columnRslt_bsppl_dpt_cd);
		}
		else {
			columnRslt_bsppl_dpt_cd.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().bsppl_dpt_nm_flg()) {
			setDefaultMode(columnRslt_bsppl_dpt_nm);
		}
		else {
			columnRslt_bsppl_dpt_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().wg_cd_flg()) {
			setDefaultMode(columnRslt_wg_cd);
			setDefaultMode(columnRslt_wg_nm);
		}
		else {
			columnRslt_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_wg_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().bsppl_cd_flg()) {
			setDefaultMode(columnRslt_bsppl_cd);
			setDefaultMode(columnRslt_bsppl_nm);
		}
		else {
			columnRslt_bsppl_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_nm.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd1.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm1.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd2.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm2.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd3.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm3.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd4.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm4.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd5.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm5.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd6.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm6.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd7.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm7.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd8.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm8.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd9.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm9.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_cd10.setMode(MCMode.INVISIBLE);
			columnRslt_bsppl_grp_nm10.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().ap_typ_flg()) {
			setDefaultMode(columnRslt_ap_typ);
			setDefaultMode(columnRslt_ap_typ_nm);
		}
		else {
			columnRslt_ap_typ.setMode(MCMode.INVISIBLE);
			columnRslt_ap_typ_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().pay_schd_dt_flg()) {
			setDefaultMode(columnRslt_pay_schd_dt);
		}
		else {
			columnRslt_pay_schd_dt.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().ap_sttl_cd_flg()) {
			setDefaultMode(columnRslt_ap_sttl_cd);
			setDefaultMode(columnRslt_ap_sttl_nm);
		}
		else {
			columnRslt_ap_sttl_cd.setMode(MCMode.INVISIBLE);
			columnRslt_ap_sttl_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().ap_sttl_typ_flg()) {
			setDefaultMode(columnRslt_ap_sttl_typ);
			setDefaultMode(columnRslt_ap_sttl_typ_nm);
		}
		else {
			columnRslt_ap_sttl_typ.setMode(MCMode.INVISIBLE);
			columnRslt_ap_sttl_typ_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().bsppl_cl_ym_flg()) {
			setDefaultMode(columnRslt_bsppl_cl_ym);
		}
		else {
			columnRslt_bsppl_cl_ym.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().bsppl_cl_day_flg()) {
			setDefaultMode(columnRslt_bsppl_cl_day);
		}
		else {
			columnRslt_bsppl_cl_day.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().trd_cur_cd_flg()) {
			setDefaultMode(columnRslt_trd_cur_cd);
			setDefaultMode(columnRslt_trd_cur_nm);
		}
		else {
			columnRslt_trd_cur_cd.setMode(MCMode.INVISIBLE);
			columnRslt_trd_cur_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().pay_chk_no_flg()) {
			setDefaultMode(columnRslt_pay_chk_no);
		}
		else {
			columnRslt_pay_chk_no.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().pay_schd_no_flg()) {
			setDefaultMode(columnRslt_pay_schd_no);
			setDefaultMode(columnRslt_sw_flg);
		}
		else {
			columnRslt_pay_schd_no.setMode(MCMode.INVISIBLE);
			columnRslt_sw_flg.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().rcpt_iv_no_flg()) {
			setDefaultMode(columnRslt_rcpt_iv_no);
		}
		else {
			columnRslt_rcpt_iv_no.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().rcpt_iv_mng_no_flg()) {
			setDefaultMode(columnRslt_rcpt_iv_mng_no);
		}
		else {
			columnRslt_rcpt_iv_mng_no.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().purc_act_no_flg()) {
			setDefaultMode(columnRslt_purc_act_no);
		}
		else {
			columnRslt_purc_act_no.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().wrk_no_flg()) {
			setDefaultMode(columnRslt_wrk_no);
			setDefaultMode(columnRslt_wrk_nm);
		}
		else {
			columnRslt_wrk_no.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().psppl_cd_flg()) {
			setDefaultMode(columnRslt_psppl_cd);
			setDefaultMode(columnRslt_psppl_nm);
		}
		else {
			columnRslt_psppl_cd.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_nm.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd1.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm1.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd2.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm2.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd3.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm3.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd4.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm4.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd5.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm5.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd6.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm6.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd7.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm7.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd8.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm8.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd9.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm9.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_cd10.setMode(MCMode.INVISIBLE);
			columnRslt_psppl_grp_nm10.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().pay_dpt_cd_flg()) {
			setDefaultMode(columnRslt_pay_dpt_cd);
		}
		else {
			columnRslt_pay_dpt_cd.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().pay_dpt_nm_flg()) {
			setDefaultMode(columnRslt_pay_dpt_nm);
		}
		else {
			columnRslt_pay_dpt_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().asppl_cd_flg()) {
			setDefaultMode(columnRslt_asppl_cd);
			setDefaultMode(columnRslt_asppl_nm);
		}
		else {
			columnRslt_asppl_cd.setMode(MCMode.INVISIBLE);
			columnRslt_asppl_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().pay_sts_typ_flg()) {
			setDefaultMode(columnRslt_pay_sts_typ);
			setDefaultMode(columnRslt_pay_sts_typ_nm);
		}
		else {
			columnRslt_pay_sts_typ.setMode(MCMode.INVISIBLE);
			columnRslt_pay_sts_typ_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().ap_dpt_cd_flg()) {
			setDefaultMode(columnRslt_ap_dpt_cd);
		}
		else {
			columnRslt_ap_dpt_cd.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().ap_dpt_nm_flg()) {
			setDefaultMode(columnRslt_ap_dpt_nm);
		}
		else {
			columnRslt_ap_dpt_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().pay_bank_ac_cd_flg()) {
			setDefaultMode(columnRslt_pay_bank_ac_cd);
			setDefaultMode(columnRslt_pay_bank_ac_nm);
		}
		else {
			columnRslt_pay_bank_ac_cd.setMode(MCMode.INVISIBLE);
			columnRslt_pay_bank_ac_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().bank_ac_cd_flg()) {
			setDefaultMode(columnRslt_bank_ac_cd);
			setDefaultMode(columnRslt_bank_ac_nm);
		}
		else {
			columnRslt_bank_ac_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bank_ac_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().setoff_info_flg()) {
			setDefaultMode(columnRslt_ap_setoff_typ);
			setDefaultMode(columnRslt_ap_setoff_typ_nm);
			setDefaultMode(columnRslt_setoff_cd);
			setDefaultMode(columnRslt_setoff_nm);
			setDefaultMode(columnRslt_so_dpt_cd);
			setDefaultMode(columnRslt_so_dpt_nm);
		}
		else {
			columnRslt_ap_setoff_typ.setMode(MCMode.INVISIBLE);
			columnRslt_ap_setoff_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_setoff_cd.setMode(MCMode.INVISIBLE);
			columnRslt_setoff_nm.setMode(MCMode.INVISIBLE);
			columnRslt_so_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_so_dpt_nm.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().xrate_flg()) {
			setDefaultMode(columnRslt_xrate);
		}
		else {
			columnRslt_xrate.setMode(MCMode.INVISIBLE);
		}
		
		if (getCndR().com_paid_tax_cd_flg()) {
			setDefaultMode(columnRslt_com_paid_tax_cd);
			setDefaultMode(columnRslt_com_paid_tax_nm);
			setDefaultMode(columnRslt_com_paid_tax_rate);
		}
		else {
			columnRslt_com_paid_tax_cd.setMode(MCMode.INVISIBLE);
			columnRslt_com_paid_tax_nm.setMode(MCMode.INVISIBLE);
			columnRslt_com_paid_tax_rate.setMode(MCMode.INVISIBLE);
		}
		
		if (getCndR().rcv_bill_no_flg()) {
			setDefaultMode(columnRslt_rcv_bill_no);
		}
		else {
			columnRslt_rcv_bill_no.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().adv_pay_act_no_flg()) {
			setDefaultMode(columnRslt_adv_pay_act_no);
		}
		else {
			columnRslt_adv_pay_act_no.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().note_info_flg()) {
			setDefaultMode(columnRslt_note_no);
			setDefaultMode(columnRslt_note_typ);
			setDefaultMode(columnRslt_note_typ_nm);
			setDefaultMode(columnRslt_note_rsn_cd);
			setDefaultMode(columnRslt_note_rsn_nm);
			setDefaultMode(columnRslt_draw_dt);
			setDefaultMode(columnRslt_due_dt);
			setDefaultMode(columnRslt_note_days);
			setDefaultMode(columnRslt_drawer_nm);
			setDefaultMode(columnRslt_draw_bank_cd);
			setDefaultMode(columnRslt_draw_bank_nm);
			setDefaultMode(columnRslt_draw_branch_cd);
			setDefaultMode(columnRslt_draw_branch_nm);
			setDefaultMode(columnRslt_endrsr);
			setDefaultMode(columnRslt_accptr);
		}
		else {
			columnRslt_note_no.setMode(MCMode.INVISIBLE);
			columnRslt_note_typ.setMode(MCMode.INVISIBLE);
			columnRslt_note_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_note_rsn_cd.setMode(MCMode.INVISIBLE);
			columnRslt_note_rsn_nm.setMode(MCMode.INVISIBLE);
			columnRslt_draw_dt.setMode(MCMode.INVISIBLE);
			columnRslt_due_dt.setMode(MCMode.INVISIBLE);
			columnRslt_note_days.setMode(MCMode.INVISIBLE);
			columnRslt_drawer_nm.setMode(MCMode.INVISIBLE);
			columnRslt_draw_bank_cd.setMode(MCMode.INVISIBLE);
			columnRslt_draw_bank_nm.setMode(MCMode.INVISIBLE);
			columnRslt_draw_branch_cd.setMode(MCMode.INVISIBLE);
			columnRslt_draw_branch_nm.setMode(MCMode.INVISIBLE);
			columnRslt_endrsr.setMode(MCMode.INVISIBLE);
			columnRslt_accptr.setMode(MCMode.INVISIBLE);
		}
		if (getCndR().rmrks_flg()) {
			setDefaultMode(columnRslt_pay_schd_print_rmrks);
			setDefaultMode(columnRslt_trd_d_rmrks);
			setDefaultMode(columnRslt_intr_rmrks);
			setDefaultMode(columnRslt_sub_char1);
			setDefaultMode(columnRslt_sub_char2);
			setDefaultMode(columnRslt_sub_char3);
		}
		else {
			columnRslt_pay_schd_print_rmrks.setMode(MCMode.INVISIBLE);
			columnRslt_trd_d_rmrks.setMode(MCMode.INVISIBLE);
			columnRslt_intr_rmrks.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char1.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char2.setMode(MCMode.INVISIBLE);
			columnRslt_sub_char3.setMode(MCMode.INVISIBLE);
		}
		
		if (isAggregate()) {
			columnRslt_aprv_flg.setMode(MCMode.INVISIBLE);
			columnRslt_aprv_no.setMode(MCMode.INVISIBLE);
			columnRslt_aprv_sts_typ.setMode(MCMode.INVISIBLE);
			columnRslt_aprv_sts_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_srv_req_no.setMode(MCMode.INVISIBLE);
		}
		else {
			setDefaultMode(columnRslt_aprv_flg);
			setDefaultMode(columnRslt_aprv_no);
			setDefaultMode(columnRslt_aprv_sts_typ);
			setDefaultMode(columnRslt_aprv_sts_typ_nm);
			setDefaultMode(columnRslt_ins_usr_id);
			setDefaultMode(columnRslt_ins_usr_nm);
			setDefaultMode(columnRslt_ins_func_id);
			setDefaultMode(columnRslt_ins_func_nm);
			setDefaultMode(columnRslt_ins_ts);
			setDefaultMode(columnRslt_upd_usr_id);
			setDefaultMode(columnRslt_upd_usr_nm);
			setDefaultMode(columnRslt_upd_func_id);
			setDefaultMode(columnRslt_upd_func_nm);
			setDefaultMode(columnRslt_upd_ts);
			setDefaultMode(columnRslt_upd_srv_req_no);
		}
	}
	
	protected boolean isAggregate() {
		if (!getCndR().bsppl_dpt_cd_flg()) {
			return true;
		}
		if (!getCndR().bsppl_dpt_nm_flg()) {
			return true;
		}
		if (!getCndR().wg_cd_flg()) {
			return true;
		}
		if (!getCndR().bsppl_cd_flg()) {
			return true;
		}
		if (!getCndR().ap_typ_flg()) {
			return true;
		}
		if (!getCndR().pay_schd_dt_flg()) {
			return true;
		}
		if (!getCndR().ap_sttl_cd_flg()) {
			return true;
		}
		if (!getCndR().ap_sttl_typ_flg()) {
			return true;
		}
		if (!getCndR().bsppl_cl_ym_flg()) {
			return true;
		}
		if (!getCndR().bsppl_cl_day_flg()) {
			return true;
		}
		if (!getCndR().trd_cur_cd_flg()) {
			return true;
		}
		if (!getCndR().pay_chk_no_flg()) {
			return true;
		}
		if (!getCndR().pay_schd_no_flg()) {
			return true;
		}
		if (!getCndR().rcpt_iv_no_flg()) {
			return true;
		}
		if (!getCndR().rcpt_iv_mng_no_flg()) {
			return true;
		}
		if (!getCndR().purc_act_no_flg()) {
			return true;
		}
		if (!getCndR().wrk_no_flg()) {
			return true;
		}
		if (!getCndR().psppl_cd_flg()) {
			return true;
		}
		if (!getCndR().pay_dpt_cd_flg()) {
			return true;
		}
		if (!getCndR().pay_dpt_nm_flg()) {
			return true;
		}
		if (!getCndR().asppl_cd_flg()) {
			return true;
		}
		if (!getCndR().pay_sts_typ_flg()) {
			return true;
		}
		if (!getCndR().ap_dpt_cd_flg()) {
			return true;
		}
		if (!getCndR().ap_dpt_nm_flg()) {
			return true;
		}
		if (!getCndR().pay_bank_ac_cd_flg()) {
			return true;
		}
		if (!getCndR().bank_ac_cd_flg()) {
			return true;
		}
		if (!getCndR().setoff_info_flg()) {
			return true;
		}
		if (!getCndR().xrate_flg()) {
			return true;
		}
		if (!getCndR().com_paid_tax_cd_flg()) {
			return true;
		}
		if (!getCndR().rcv_bill_no_flg()) {
			return true;
		}
		if (!getCndR().adv_pay_act_no_flg()) {
			return true;
		}
		if (!getCndR().note_info_flg()) {
			return true;
		}
		if (!getCndR().rmrks_flg()) {
			return true;
		}
		return false;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		if (Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_mode_Group, Cnd_mode_DTL.getActionCommand());
			setValueEx(Cnd_opn_flg, false);
			setValueEx(Cnd_fix_flg, false);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_rjct_flg, false);
			setValueEx(Cnd_last_rjct_flg, false);
			setValueEx(Cnd_excld_flg, true);
		}
		else {
			setBoolean(AprvStsPanel, true);
		}
		
		setSrchStatus();
		getRsltL().clear();
	}

	@Override
	public void doRslt_NC(MCEventInfo info){
		super.doRslt_NC(info);
		
		setBtnMode();
	}
	
	/**
	 * ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		RsltR rsltR = RsltTable.getSelectedMCRow();
		
		if (isNull(rsltR) || isNull(rsltR.pay_chk_no())) {
			Btn_open_MSBHP0030.setMode(MCMode.DISABLE);
			Btn_open_MSBHP0010.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBHP0030);
			setDefaultMode(Btn_open_MSBHP0010);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			if (Btn_open_MSBHP0030.isEnabled()) {
				RsltR r = getRsltL().get(info.getEventIndex());
				doBtn_open_MSBHP0030(r);
			}
		}
	}

	@Override
	protected void setPopupConfig() {
		super.setPopupConfig();
		
		RsltTable.getPopupConfig().ignoreSortOrder(true);
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	/**
	 * セル設定クラス
	 */
	public class RsltCellConfig extends MAUDP_CellConfig {

		protected Color _HDR = getPgmSettingColor(
				MSBHP_PaySchdSrch.class, "color.cell.hdr.bg");
		protected Color _BDY = getPgmSettingColor(
				MSBHP_PaySchdSrch.class, "color.cell.bdy.bg");
		protected Color _COM_PAID = getPgmSettingColor(
				MSBHP_PaySchdSrch.class, "color.cell.com_paid.bg");
		protected Color _EMP = getPgmSettingColor(
				MSBHP_PaySchdSrch.class, "color.cell.emp.bg");

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (Cnd_mode_DTL.isSelected()) {
				return super.getPriorBG(index, column, table, mode);
			}

			RsltR r = getRsltL().get(index);

			if (isNull(r.pay_schd_act_dt()) && !isNull(r.not_appl_bal())) {
				return _HDR;
			}
			else  if (!isNull(r.not_appl_bal())) {
				return _BDY;
			}
			else if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
				return _COM_PAID;
			}
			else if(isNull(r.not_appl_bal())){
				return _EMP;
			}

			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (Cnd_mode_DTL.isSelected()) {
				return null;
			}
			if(!getLPnlR().key_flg() && !isNull(r.pay_schd_act_dt())){
				if (getInvisibleColumnConfigs().contains(column.getBaseRowColumnName())) {
					return true;
				}
			}
			return null;
		}

		protected ArrayList<String> _invisibleColumnConfigs = new ArrayList<String>();
		protected ArrayList<String> getInvisibleColumnConfigs() {
			if (_invisibleColumnConfigs.isEmpty()) {
				_invisibleColumnConfigs.add(columnRslt_bsppl_dpt_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_dpt_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_wg_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_wg_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_cl_ym.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_cl_day.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_trd_cur_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_trd_cur_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_pay_chk_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_rcpt_iv_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_rcpt_iv_mng_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_purc_act_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_wrk_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_wrk_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_pay_sts_typ.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_pay_sts_typ_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_aprv_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_aprv_sts_typ.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_aprv_sts_typ_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_aprv_flg.getBaseRowColumnName());
				
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd1.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm1.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd2.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm2.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd3.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm3.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd4.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm4.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd5.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm5.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd6.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm6.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd7.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm7.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd8.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm8.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd9.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm9.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_cd10.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bsppl_grp_nm10.getBaseRowColumnName());
				
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd1.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm1.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd2.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm2.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd3.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm3.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd4.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm4.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd5.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm5.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd6.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm6.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd7.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm7.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd8.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm8.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd9.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm9.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_cd10.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_psppl_grp_nm10.getBaseRowColumnName());
			}
			return _invisibleColumnConfigs;
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
				if (Cnd_ope_REF.isSelected()) {
					RsltR r = (RsltR) table.getBaseTable().getRow(index);
					if (Cnd_mode_HDR.isSelected()
							|| (r.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()))
							|| isAggregate()
							|| MSC_PAY_STS_TYP.isPAY(r.pay_sts_typ())) {
						return MCMode.READ_ONLY;
					}
					RsltR checked = getRsltL().getFirst(RsltR.$check, true);
					if (checked != null) {
						if (!isSame(checked.psppl_cd(), r.psppl_cd())
								|| !isSame(checked.trd_cur_cd(), r.trd_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			return super.getPriorMode(index, column, table);
		}
	}

}