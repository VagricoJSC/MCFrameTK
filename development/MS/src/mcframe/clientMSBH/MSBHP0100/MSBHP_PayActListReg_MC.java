package mcframe.clientMSBH.MSBHP0100;

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
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5390.*;
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
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMSUC.MSUCP0100.MSUCP_ApUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_PayActListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_PayActListReg_MC extends MSBHP_PayActListReg_MC_A implements IfListRegPanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCIndexKey _ikPayActNo;
	protected Boolean _allBtn = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_PayActListReg_MC() {
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
	public MSBHP_PayActListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[prnt_sw]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_sw(MCEventInfo info) {
		callMS_MSBHL0100_Prnt01();
	}

	/**
	 * [MS_MSBHL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Srch01Caller<P extends MSBHP_PayActListReg, B extends MS_MSBHL0100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0100_Srch01Caller(P p, B b) {
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
			checkForCallStackForSrch(msgList);
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
	}
	
	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_pay_schd_dt_fr, Cnd_pay_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_pay_act_dt_fr, Cnd_pay_act_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_bsppl_cl_dt_fr, Cnd_bsppl_cl_dt_to));
	}

	/**
	 * [MS_MSBHL0100_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Srch02Caller<P extends MSBHP_PayActListReg, B extends MS_MSBHL0100_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0100_Srch02Caller(P p, B b) {
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
			checkForCallStackForSrch(msgList);
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

			for (RsltR rsltR : bridge.down0()) {
				// 計上日を取消計上日にコピー
				rsltR.can_ac_dt(rsltR.ac_dt());
			}
		}
		
		@Override
		protected void show() {
			super.show();
			_ikPayActNo = getRsltL().createIndex(RsltR.$pay_act_no);
		}
	}
	/**
	 * [MS_MSBHL0100_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Srch03Caller<P extends MSBHP_PayActListReg, B extends MS_MSBHL0100_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0100_Srch03Caller(P p, B b) {
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
	}

	/**
	 * [MS_MSBHL0100_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Ins01Caller<P extends MSBHP_PayActListReg, B extends MS_MSBHL0100_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBHL0100_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setBtnMode();
		}
	}

	/**
	 * [MS_MSBHL0100_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Del01Caller<P extends MSBHP_PayActListReg, B extends MS_MSBHL0100_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBHL0100_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			for (RsltR r : getRsltL()) {
				if (r.check()) {
					msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(), columnRslt_can_ac_dt_for_input));
				}
			}
		}
	}

	/**
	 * [MS_MSBHL0100_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Prnt01Caller<P extends MSBHP_PayActListReg, B extends MS_MSBHL0100_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBHL0100_Prnt01Caller(P p, B b) {
			super(p, b);
			setCheckedRowMode(true);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			callMS_MSBHL0100_Srch01();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			callMS_MSBHL0100_Srch03();
		}
		else {
			callMS_MSBHL0100_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			createMS_MSBHL0100_Srch01().execDL();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			createMS_MSBHL0100_Srch03().execDL();
		}
		else {
			createMS_MSBHL0100_Srch02().execDL();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBHP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0090(MCEventInfo info) {
		if (Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			RsltR r = RsltTable.getSelectedMCRow();
			if (r == null) {
				dialog(msgNoSelectedRow());
				return;
			}
			doBtn_open_MSBHP0090(r);
		}
		else if (Cnd_ope_INS.isSelected()) {
			RsltR r = RsltTable.getSelectedMCRow();
			if (r != null && !isNull(r.pay_act_no())) {
				doBtn_open_MSBHP0090(r);
			}
			else {
				MCList<RsltR> subL = getRsltL().subList(RsltR.$check, true);
				if (subL.size() == 0) {
					dialog(msgNoSelectedRow());
					return;
				}
				doBtn_open_MSBHP0090(subL);
			}
		}
	}

	protected void doBtn_open_MSBHP0090(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0090");
		mcframe.clientMSBH.MSBHP0090.MSBHP_PayActReg p = 
				(mcframe.clientMSBH.MSBHP0090.MSBHP_PayActReg) aso.getPanel();
		mcframe.clientMSBH.MSBHP0090.CndR to = mcframe.clientMSBH.MSBHP0090.CndR.create();

		if (Cnd_ope_INS.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		else if (Cnd_ope_DEL.isSelected()) {
			to.ope(p.Cnd_ope_DEL.getActionCommand());
		}
		else if (Cnd_ope_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.pay_act_rev(r.pay_act_rev());
		}
		to.pay_act_no(r.pay_act_no());
		
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	
	protected void doBtn_open_MSBHP0090(MCList<RsltR> subL) {
		MCDate dt = (MCDate) subL.max(RsltR.$pay_schd_dt);
		openPanel("MS", "MSBHP0090", T1, subL.getFirst(RsltR.$pay_schd_dt, dt), subL);
	}
	
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		_allBtn = true;
		doSelectAll(RsltTable);
		setBtnMode();
		_allBtn = false;
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		_allBtn = true;
		doDeselectAll(RsltTable);
		setBtnMode();
		_allBtn = false;
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBHL0100_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBHL0100_Del01();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		BulkSet_ac_dt_p_PPanel.setRelateBeans(BulkSet_pay_act_dt);
		BulkSet_pay_usr_dpt_p_PPanel.setRelateBeans(BulkSet_ac_dt);

		Rslt_ac_dt_p_PPanel.setRelateBeans(columnRslt_pay_act_dt);
		Rslt_pay_usr_dpt_p_PPanel.setRelateBeans(columnRslt_ac_dt);
		Rslt_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_base_cur_cd, columnRslt_xrate_cd, columnRslt_pay_act_dt, true);
		Rslt_pay_schd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_amt, columnRslt_xrate);
		Rslt_base_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_com_paid_tax_amt, columnRslt_xrate);
		
		Rslt_psppl_grp_p_PPanel.setRelateBeans(Cnd_psppl_grp_p_PPanel);
		Rslt_bsppl_grp_p_PPanel.setRelateBeans(Cnd_bsppl_grp_p_PPanel);
		Rslt_asppl_grp_p_PPanel.setRelateBeans(Cnd_asppl_grp_p_PPanel);
	}
	
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return columnRslt_ac_dt;
	}

	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}

	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_DEL.isSelected()) {
			return true;
		}
		return false;
	}

	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return columnRslt_check;
	}
	
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_ac_dt.addLCListener(this);
		BulkSet_pay_usr_cd.addLCListener(this);
		BulkSet_pay_dpt_cd.addLCListener(this);
		
		columnRslt_can_ac_dt_for_input.addLCListener(this);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		setValueEx(Cnd_mode_Group, Cnd_mode_PAYSCHD.getActionCommand());
		setValueEx(BulkSet_pay_act_dt, getToday());
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}
	
	@Override
	public boolean doCnd_mode_VC(MCEventInfo info) {
		if (!super.doCnd_mode_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}
	
	/**
	 * 操作種別変更時のイベント処理
	 */
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		clearContainers(getRsltL());
		setDefModeOpe(info);
		clearCnd(info);
	}
	
	/**
	 * 操作種別変更時の検索条件のクリア処理
	 * 
	 * @param info
	 */
	protected void clearCnd(MCEventInfo info) {
		
		// 登録する選択時
		if (Cnd_ope_INS.isSelected()) {
			Cnd_pay_act_dt_fr.clear();
			Cnd_pay_act_dt_to.clear();
			Cnd_ac_dt_fr.clear();
			Cnd_ac_dt_to.clear();
			Cnd_pay_usr_cd.clear();
			Cnd_pay_usr_nm.clear();
			Cnd_pay_act_no.clear();
			Cnd_trd_rmrks.clear();
			Cnd_intr_rmrks.clear();
			Cnd_intr_d_rmrks.clear();
			Cnd_sub_char1.clear();
			Cnd_sub_char2.clear();
			Cnd_sub_char3.clear();
			Cnd_dtl_sub_char1.clear();
			Cnd_dtl_sub_char2.clear();
			Cnd_dtl_sub_char3.clear();
		}
		// 登録する、または、取り消す選択時
		if (Cnd_ope_INS.isSelected() || Cnd_ope_DEL.isSelected()) {
			Cnd_inc_can_flg.clear();
			Cnd_inc_schd_act_flg.clear();
			Cnd_inc_sw_flg.clear();
		}
		if (Cnd_ope_REF.isSelected()) {
			Cnd_inc_sw_flg.setValue(true);
		}
		// 帳票発行する選択時
		if (Cnd_ope_PRNT.isSelected()) {
			Cnd_pay_schd_dt_fr.clear();
			Cnd_pay_schd_dt_to.clear();
			Cnd_bsppl_cl_dt_fr.clear();
			Cnd_bsppl_cl_dt_to.clear();
			Cnd_bsppl_usr_cd.clear();
			Cnd_bsppl_usr_nm.clear();
			Cnd_bsppl_dpt_cd.clear();
			Cnd_bsppl_dpt_nm.clear();
			Cnd_purc_act_no.clear();
			Cnd_rcpt_iv_no.clear();
			Cnd_rcpt_iv_mng_no.clear();
			Cnd_wrk_no.clear();
			Cnd_wrk_nm.clear();
			Cnd_pay_chk_no.clear();
			Cnd_pay_schd_no.clear();
			Cnd_note_no.clear();
			Cnd_intr_rmrks.clear();
			Cnd_trd_d_rmrks.clear();
			Cnd_intr_d_rmrks.clear();
			Cnd_dtl_sub_char1.clear();
			Cnd_dtl_sub_char2.clear();
			Cnd_dtl_sub_char3.clear();
			Cnd_inc_can_flg.clear();
			Cnd_inc_schd_act_flg.clear();
			Cnd_inc_sw_flg.clear();
			Cnd_asppl_grp_flg1.clear();
			Cnd_asppl_grp_flg2.clear();
			Cnd_asppl_grp_flg3.clear();
			Cnd_asppl_grp_flg4.clear();
			Cnd_asppl_grp_flg5.clear();
			Cnd_asppl_grp_flg6.clear();
			Cnd_asppl_grp_flg7.clear();
			Cnd_asppl_grp_flg8.clear();
			Cnd_asppl_grp_flg9.clear();
			Cnd_asppl_grp_flg10.clear();
		}
	}
	
	/**
	 * 操作種別変更時の画面設定
	 * 
	 * @param info
	 */
	protected void setDefModeOpe(MCEventInfo info) {
		String beforeOpe = (String)info.getOldValue();
		
		// 登録する、取り消すを選択した場合
		if (Cnd_ope_INS.isSelected() || Cnd_ope_DEL.isSelected()) {
			// 選択前の種別が参照する、もしくは帳票発行だった場合
			if (isSame(beforeOpe, Cnd_ope_REF.getActionCommand()) && Cnd_mode_PAYACTD.isSelected()
				|| isSame(beforeOpe, Cnd_ope_PRNT.getActionCommand())) {
				// 検索モードを支払予定にする
				setValueEx(Cnd_mode_Group, Cnd_mode_PAYSCHD.getActionCommand());
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_mode_SW.isSelected()) {
				setValueEx(Cnd_mode_Group, Cnd_mode_PAYSCHD.getActionCommand());
			}
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_mode_Group, Cnd_mode_SW.getActionCommand());
		}
		
		// 操作種別に応じたモード設定
		if (Cnd_ope_INS.isSelected()) {
			setSRCH_INSStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREF_SCHDStatus();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
		}
	}
	
	/**
	 * 検索モード変更時のイベント処理
	 */
	@Override
	public void doCnd_mode_NC(MCEventInfo info) {
		super.doCnd_mode_NC(info);
		
		clearContainers(getRsltL());
		setDefModeMode(info);
	}
	
	/**
	 * 検索モード変更時の画面設定
	 * 
	 * @param info
	 */
	protected void setDefModeMode(MCEventInfo info) {
		
		// 検索モードに応じたモード設定
		if (Cnd_mode_PAYSCHD.isSelected()) {
			setREF_SCHDStatus();
		}
		else if (Cnd_mode_SW.isSelected()) {
			setPRNTStatus();
		}
		else {
			setREF_ACTStatus();
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		if (lc == BulkSet_ac_dt) {
			doBulkSet_ac_dt_LC(info);
		}
		else if (lc == BulkSet_pay_usr_cd) {
			doBulkSet_pay_usr_cd_LC(info);
		}
		else if (lc == BulkSet_pay_dpt_cd) {
			doBulkSet_pay_dpt_cd_LC(info);
		}
		else if (lc == columnRslt_can_ac_dt_for_input) {
			doRslt_can_ac_dt_for_input_LC(info);
		}
		else {
			super.doLCEvent(lc, info);
		}
	}

	@Override
	public void doBulkSet_pay_act_dt_LC(MCEventInfo info) {
		super.doBulkSet_pay_act_dt_LC(info);
		bulkSet(columnRslt_pay_act_dt, getBulkSetR().pay_act_dt(), false);
	}

	/**
	 * [BulkSet]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ac_dt_LC(MCEventInfo info) {
		bulkSet(columnRslt_ac_dt, getBulkSetR().ac_dt(), false);
	}

	/**
	 * [BulkSet]パネルの[pay_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pay_usr_cd_LC(MCEventInfo info) {
		bulkSet(columnRslt_pay_usr_cd, getBulkSetR().pay_usr_cd(), true);
	}

	/**
	 * [BulkSet]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pay_dpt_cd_LC(MCEventInfo info) {
		bulkSet(columnRslt_pay_dpt_cd, getBulkSetR().pay_dpt_cd(), true);
	}

	/**
	 * 選択がオンになっている行に値を入力する
	 * 
	 * @param column カラムコンフィグ
	 * @param bulkValue 入力する値
	 * @param doEvent 値入力時に画面イベントを実行する場合true
	 */
	protected void bulkSet(MCColumnConfig column, Comparable<?> bulkValue, boolean doEvent) {
		if (!isNull(bulkValue)) {
			MCList<RsltR> bulkList = createRsltL();
			for (RsltR r : RsltTable.getViewRows()) {
				if (r.check() && isEditable(column, r.getGUIIndex())) {
					bulkList.add(r);
				}
			}
			if (!bulkList.isEmpty()) {
				if (doEvent) {
					bulkList.forEach(r -> {
						setValueEx(column, r.getGUIIndex(), bulkValue);
					});
				}
				else {
					bulkList.setValue(column.getBaseRowColumnName(), bulkValue);
				}
			}
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		if (_allBtn) {
			return;
		}
		setBtnMode();
	}
	
	protected void setBtnMode() {
		if (Cnd_ope_INS.isSelected()) {
			RsltR r = RsltTable.getSelectedMCRow();
			if (r != null && !isNull(r.pay_act_no())) {
				setDefaultMode(Btn_open_MSBHP0090);
			}
			else {
				MCList<RsltR> l = getRsltL().subList(RsltR.$check, true);
				if (l.isEmpty() || l.groupBy(RsltR.$psppl_cd, RsltR.$trd_cur_cd).size() > 1) {
					Btn_open_MSBHP0090.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_open_MSBHP0090);
				}
			}
		}
		if (Cnd_ope_REF.isSelected()) {
			RsltR r = RsltTable.getSelectedMCRow();
			if (r == null 
					|| r.schd_act_flg()
					|| MAC_AP_STTL_TYP.isAPSW_OUT_CHK(r.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(r.ap_sttl_typ())) {
				Btn_open_MSBHP0090.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBHP0090);
			}
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		if (Cnd_ope_INS.isSelected()) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r.check()) {
				if (!isNull(getBulkSetR().pay_act_dt())) {
					r.pay_act_dt(getBulkSetR().pay_act_dt());
				}
				if (!isNull(getBulkSetR().ac_dt())) {
					r.ac_dt(getBulkSetR().ac_dt());
				}
				if (!isNull(getBulkSetR().pay_usr_cd())) {
					r.pay_usr_cd(getBulkSetR().pay_usr_cd());
					r.pay_usr_nm(getBulkSetR().pay_usr_nm());
				}
				if (!isNull(getBulkSetR().pay_dpt_cd())) {
					r.pay_dpt_cd(getBulkSetR().pay_dpt_cd());
					r.pay_dpt_nm(getBulkSetR().pay_dpt_nm());
				}
			}
			if (_allBtn) {
				return;
			}
			setBtnMode();
		}
	}

	/**
	 * [Rslt]パネルの[can_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_ac_dt_for_input_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		MCList<RsltR> list = getRsltL().subList(_ikPayActNo, r.pay_act_no());
		list.setDate(RsltR.$can_ac_dt, r.can_ac_dt());
		list.setDate(RsltR.$can_ac_dt_for_input, r.can_ac_dt_for_input());
	}
	
	@Override
	public void doRslt_pay_act_dt_LC(MCEventInfo info) {
		super.doRslt_pay_act_dt_LC(info);
		
		setComPaidTaxCd(info.getEventIndex());
	}
	protected void setComPaidTaxCd(int index) {
		
		RsltR r = getRsltL().get(index);
		if (!isNull(r.pay_act_dt()) && canEditTaxCd(r.ap_sttl_typ())) {
			setValueEx(columnRslt_trd_cur_com_paid_tax_cd, index, MSUCP_ApUtil.getComPaidTaxCd(r.pay_act_dt(), this));
		}
		else {
			setValueEx(columnRslt_trd_cur_com_paid_tax_cd, index, null);
		}
	}
	protected boolean canEditTaxCd(String apSttlTyp) {
		return MAC_AP_STTL_TYP.is_com_paid(apSttlTyp) || MAC_AP_STTL_TYP.isSETOFF(apSttlTyp);
	}
	
	@Override
	public void doRslt_trd_cur_com_paid_tax_cd_LC(
			mcframe.clientCore.event.MCEventInfo info) {
		super.doRslt_trd_cur_com_paid_tax_cd_LC(info);
		setTaxAmt(info.getEventIndex());
	}
	
	/**
	 * 税込み金額から税金額を設定する。<br>
	 * 指定された行の税金額を設定する。
	 */
	protected void setTaxAmt(int index) {
		RsltR r = getRsltL().get(index);
		MCNumber amt = 
			MAUCP_AmtUtil.getIncTaxAmt(
				r.trd_cur_amt(), r.trd_cur_com_paid_tax_rate(),
				r.trd_cur_amt_dec_place(), getCo().com_paid_tax_rnd_typ());
		setValueEx(columnRslt_trd_cur_com_paid_tax_amt, index, amt);
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			if (Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
				if (Btn_open_MSBHP0090.isEnabled()) {
					RsltR r = getRsltL().get(info.getEventIndex());
					doBtn_open_MSBHP0090(r);
				}
			}
			else {
				RsltR r = getRsltL().get(info.getEventIndex());
				if (r != null && !isNull(r.pay_act_no())) {
					doBtn_open_MSBHP0090(r);
				}
			}
		}
	}

	// -----------------------------------------------
	// Status
	// -----------------------------------------------
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_INS.isSelected()) {
			setSRCH_INSStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_mode_PAYSCHD.isSelected()) {
				setREF_SCHDStatus();
			}
			else {
				setREF_ACTStatus();
			}
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
		}
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_mode_PAYSCHD.isSelected()) {
				setREF_SCHDStatus();
			}
			else {
				setREF_ACTStatus();
			}
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
		}
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	protected boolean isInsStatus() {
		return isSame(getStatus(), INS);
	}
	
	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}
	
	protected boolean isRegStatus() {
		return isInsStatus() || isDelStatus();
	}
	
	@Override
	public void setREF_SCHDStatus() {
		super.setREF_SCHDStatus();
		Cnd_mode_SW.setMode(MCMode.READ_ONLY);
	}	
	
	@Override
	public void setREF_ACTStatus() {
		super.setREF_SCHDStatus();
		Cnd_mode_SW.setMode(MCMode.READ_ONLY);
	}	
	// -----------------------------------------------
	// CellConfig
	// -----------------------------------------------	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}
	
	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}
	
	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
			}
			else if (isInsStatus()) {
				if (column == columnRslt_trd_cur_com_paid_tax_cd) {
					if (MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
						return MCMode.ENABLE;
					}
					else if (!MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else {
				if (r.sw_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	@SuppressWarnings({
			"rawtypes", "unchecked"
	})
	@Override
	public MCList getCnd_ap_sttl_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getCnd_ap_sttl_cd(row, info);
		MCList<MCRow> rList = list.createInstance();
		
		for (MCRow r : list) {
			String sttlTyp = r.getStringNE("ap_sttl_typ");
			if (MAC_AP_STTL_TYP.isAPSW_IN_CHK(sttlTyp)
					|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(sttlTyp)) {
				rList.add(r);
			}
			if (Cnd_ope_INS.isSelected() || Cnd_ope_DEL.isSelected()) {
				if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(sttlTyp)
						|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(sttlTyp)) {
					rList.add(r);
				}
			}
		}
		if (!rList.isEmpty()) {
			list.removeAll(rList);
		}
		return list;
	}

}