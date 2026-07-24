package mcframe.clientMSBC.MSBCP1150;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5340.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientMAUD.MAUDP0110.MAUDP_ListListener;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_WkActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_WkActReg_MC extends MSBCP_WkActReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_WkActReg_MC() {
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
	public MSBCP_WkActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL1150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Srch01Caller<P extends MSBCP_WkActReg, B extends MS_MSBCL1150_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1150_Srch01Caller(P p, B b) {
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
			fillSpace();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			// 行追加ボタンがある画面は検索結果が無かった場合に、fillSpaceする
			setSrchStatus();
			fillSpace();
		}

	}

	/**
	 * [MS_MSBCL1150_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Srch02Caller<P extends MSBCP_WkActReg, B extends MS_MSBCL1150_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1150_Srch02Caller(P p, B b) {
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
	 * [MS_MSBCL1150_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Srch03Caller<P extends MSBCP_WkActReg, B extends MS_MSBCL1150_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1150_Srch03Caller(P p, B b) {
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
			msgList.addAll(checkSmallLarge(Cnd_pr_rate_fr, Cnd_pr_rate_to));
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
		msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		msgList.addAll(checkAtLeastOne(OperStsPanel));
		msgList.addAll(checkAtLeastOne(StsPanel));
		msgList.addAll(checkAtLeastOne(MesPanel));
	}


	/**
	 * [MS_MSBCL1150_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Imp01Caller<P extends MSBCP_WkActReg, B extends MS_MSBCL1150_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBCL1150_Imp01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			// 画面部品が着手時刻、終了時刻に00:00の日付を補完してしまうためファイル取込時にnullであったかどうかを保持しておく
			for (RsltR r : getRsltL()) {
				if (isNull(r.st_tm())) {
					r.is_file_st_tm_null_flg(true);
				}
				if (isNull(r.end_tm())) {
					r.is_file_end_tm_null_flg(true);
				}
			}
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();

			for (RsltR r : bridge.up0()) {
				// 部品がdummyのdt項目に時分を補完する仕様なので、サーバに上らせるのはst_tmやend_tmではなくdummyの日付である。
				// そのため、dummyの日付をnullにクリアする
				if (r.is_file_st_tm_null_flg()) {
					r.dummy_st_dt(null);
				}
				if (r.is_file_end_tm_null_flg()) {
					r.dummy_end_dt(null);
				}
			}
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
				setDummyDt(r);
			}
		}

		@Override
		protected void afterCallParts() {
			Rslt_st_tm_p_PPanel.setAfCompInvalid(true);
			Rslt_end_tm_p_PPanel.setAfCompInvalid(true);
			super.afterCallParts();
			Rslt_st_tm_p_PPanel.setAfCompInvalid(false);
			Rslt_end_tm_p_PPanel.setAfCompInvalid(false);
		}
		
		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}
	}

	/**
	 * [MS_MSBCL1150_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Upd01Caller<P extends MSBCP_WkActReg, B extends MS_MSBCL1150_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1150_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			for (RsltR r : getRsltL().subList(RsltR.$check, true)) {
				if (isNull(r.st_tm())) {
					r.dummy_st_dt(null);
				}
				if (isNull(r.end_tm())) {
					r.dummy_end_dt(null);
				}
			}
		}
		
		@Override
		protected void show() {
			super.show();
			
			for (RsltR r : getRsltL()) {
				if (!isNull(r.ac_dt()) && isNull(r.dummy_st_dt())) {
					setDummyDt(r);
				}
			}
		}
	}

	/**
	 * [MS_MSBCL1150_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Del01Caller<P extends MSBCP_WkActReg, B extends MS_MSBCL1150_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL1150_Del01Caller(P p, B b) {
			super(p, b);
		}
		
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (isSrch01()) {
			callMS_MSBCL1150_Srch01();
		}
		else if (isSrch02()) {
			callMS_MSBCL1150_Srch02();
		}
		else if (isSrch03()) {
			callMS_MSBCL1150_Srch03();
		}
	}
	
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (isSrch01()) {
			createMS_MSBCL1150_Srch01().execDL();
		}
		else if (isSrch02()) {
			createMS_MSBCL1150_Srch02().execDL();
		}
		else if (isSrch03()) {
			createMS_MSBCL1150_Srch03().execDL();
		}
	}
	
	
	protected boolean isSrch01() {
		if (Cnd_ope_UPD.isSelected()) {
			return true;
		}
		return false;
	}
	
	protected boolean isSrch02() {
		if (Cnd_ope_DEL.isSelected()) {
			return true;
		}
		else if (Cnd_ope_REF.isSelected() && Cnd_disp_unit_ACT.isSelected()) {
			return true;
		}
		return false;
	}
	
	protected boolean isSrch03() {
		if (Cnd_disp_unit_SCHD.isSelected()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP1010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP1010(r);
	}

	protected void doBtn_open_MSBCP1010(RsltR r) {
		if (!isNull(r.mfg_inst_no())) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1010");
			mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg msbcp1010 = 
					(mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg) aso.getPanel();
			mcframe.clientMSBC.MSBCP1010.CndR bind = mcframe.clientMSBC.MSBCP1010.CndR.create();
			bind.ope(msbcp1010.Cnd_ope_REF.getActionCommand());
			bind.srch_tgt_no(r.mfg_inst_no());
			bind.latest_flg(true);
			aso.putCnd(bind);
			aso.putSearchAction();
			aso.show();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP1100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1100(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP1100(r);
	}
	
	protected void doBtn_open_MSBCP1100(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1100");
		mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg msbcp1100 = 
				(mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1100.CndR to = mcframe.clientMSBC.MSBCP1100.CndR.create();

		if (Cnd_ope_UPD.isSelected()) {
			to.ope(msbcp1100.Cnd_ope_UPD.getActionCommand());
		}
		else if (Cnd_ope_DEL.isSelected()) {
			to.ope(msbcp1100.Cnd_ope_DEL.getActionCommand());
		}
		else {
			to.ope(msbcp1100.Cnd_ope_REF.getActionCommand());
		}
		to.div_seq(r.div_seq());
		to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.name());
		to.srch_tgt_no(r.mfg_inst_no());
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
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
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		RsltR r = copyRow(RsltTable);
		clearNotCopyCol(r.getGUIIndex());
	}
	
	protected void clearNotCopyCol(int index) {
		setValueEx(columnRslt_wk_act_no, index, null);
		setValueEx(columnRslt_ext_sys_cd, index, null);
		setValueEx(columnRslt_ext_sys_nm, index, null);
		setValueEx(columnRslt_ext_wk_act_no, index, null);
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL1150_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL1150_Del01();
	}
	
	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		// 登録項目の担当者・部門部品は、必ず日付を連携する
		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_ac_dt);
		
		// 工数には単位ＣＤの概念がない（単位名しかない）
		// ただし、部品上必須なので代わりに単位名を渡している※単位を変更するという仕様がないため特に問題ない
		Rslt_schd_sum_wk_cost_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm,
				columnRslt_wk_cost_dec_place);
		Rslt_schd_wk_cost_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm,
				columnRslt_wk_cost_dec_place);
		Rslt_schd_fxd_wk_cost_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm,
				columnRslt_wk_cost_dec_place);
		Rslt_act_wk_cost_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm,
				columnRslt_wk_cost_dec_place);
		Rslt_rem_wk_cost_p_PPanel.setRelateBeans(columnRslt_wk_cost_unit_nm,
				columnRslt_wk_cost_dec_place);				
		
		Rslt_str_ln_p_PPanel.setRelateBeans(columnRslt_loc_cd, columnRslt_str_ln_tgt_flg);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_ac_dt);
		Rslt_lot_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_lot_mng_typ,
				columnRslt_sublot_mng_typ);
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_sno1_mng_typ,
				columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ,
				columnRslt_sno4_mng_typ);
		
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		linkBeansToISPanelCustom(columnRslt_dpt_cd);
	}
	// -----------------------------------------------
	// init-screen
	
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_ACT.getActionCommand());

		
		setValueEx(BulkSet_ac_dt, getToday());
		clearCnd();
		setCndMesTrgt();
	}
	/**
	 * 操作種別によるWMS対象の初期値を設定する
	 */
	protected void setCndMesTrgt() {
		if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_mes_tgt_flg, false);
			setValueEx(Cnd_not_mes_tgt_flg, true);
		} else if (Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_mes_tgt_flg, false);
			setValueEx(Cnd_not_mes_tgt_flg, true);
		} else if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_mes_tgt_flg, true);
			setValueEx(Cnd_not_mes_tgt_flg, true);
		}
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
		}
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (list.contains(RsltR.$mfg_inst_upd_cntr)) {
			list.remove(RsltR.$mfg_inst_upd_cntr);
		}
		return list;
	}
	// -----------------------------------------------
	// status
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setBtnMode();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setSRCH_SCHDStatus() {
		super.setSRCH_SCHDStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREF_SCHDStatus() {
		super.setREF_SCHDStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setSRCH_ACTStatus() {
		super.setSRCH_ACTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREF_ACTStatus() {
		super.setREF_ACTStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (r.isStatusCreate() || isNullAnd(r.wk_act_no(), r.wk_schd_no())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
		
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBCP1010(r)) {
			setDefaultMode(Btn_open_MSBCP1010);
		}
		else {
			Btn_open_MSBCP1010.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBCP1100(r)) {
			setDefaultMode(Btn_open_MSBCP1100);
		}
		else {
			Btn_open_MSBCP1100.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 製造指図画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBCP1010(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.mfg_inst_no());
	}
	
	/**
	 * 製造実績画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBCP1100(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.mfg_inst_no()) && !isNull(r.div_seq());
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setSrchStatus() {
		
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_disp_unit_SCHD.isSelected()) {
				setSRCH_SCHDStatus();
			}
			else if (Cnd_disp_unit_ACT.isSelected()) {
				setSRCH_ACTStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(true);

	}

	protected void setRefStatus() {
		
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_disp_unit_SCHD.isSelected()) {
				setREF_SCHDStatus();
			}
			else if (Cnd_disp_unit_ACT.isSelected()) {
				setREF_ACTStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	// -----------------------------------------------
	// Event
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (r.check()) {
			bulkSet(BulkSet_ac_dt, r);
			bulkSet(BulkSet_wk_usr_cd, r);
			bulkSet(BulkSet_wk_usr_dpt_cd, r);
		}
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		setListListener(RsltTable, getAcDtRowListener());
		RsltTable.addListListener(getAcDtListListener());
		
		BulkSet_wk_usr_cd.addLCListener(this);
		BulkSet_wk_usr_dpt_cd.addLCListener(this);
		columnRslt_end_tm.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == BulkSet_wk_usr_cd) {
			bulkSet(BulkSet_wk_usr_cd);
		}
		else if (lc == BulkSet_wk_usr_dpt_cd) {
			bulkSet(BulkSet_wk_usr_dpt_cd);
		}
		else if (lc == columnRslt_end_tm) {
			doRslt_end_tm_LC(info);
		}
	}
	
	@Override
	public void doBulkSet_ac_dt_LC(MCEventInfo info) {
		super.doBulkSet_ac_dt_LC(info);
		bulkSet(BulkSet_ac_dt);
	}
	
	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
		if (isNull(r.ac_dt())) {
			bulkSet(BulkSet_ac_dt, r);
		}
		if (isNull(r.wk_usr_cd())) {
			bulkSet(BulkSet_wk_usr_cd, r);
		}
		if (isNull(r.wk_usr_dpt_cd())) {
			bulkSet(BulkSet_wk_usr_dpt_cd, r);
		}
	}
	
	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}
	
	protected void bulkSet(MCBeans b, RsltR r) {
		if (isNull(r.wk_act_no())) {
			if (b == BulkSet_ac_dt && isEditable(columnRslt_ac_dt, r.getGUIIndex())) {
				r.ac_dt(getBulkSetR().ac_dt());
			}
			else if (b == BulkSet_wk_usr_cd
					&& isEditable(columnRslt_wk_usr_cd, r.getGUIIndex())) {
				r.wk_usr_cd(getBulkSetR().wk_usr_cd());
				r.wk_usr_nm(getBulkSetR().wk_usr_nm());
			}
			else if (b == BulkSet_wk_usr_dpt_cd
					&& isEditable(columnRslt_wk_usr_dpt_cd, r.getGUIIndex())) {
				r.wk_usr_dpt_cd(getBulkSetR().wk_usr_dpt_cd());
				r.wk_usr_dpt_nm(getBulkSetR().wk_usr_dpt_nm());
			}
		}
	}
	
	@Override
	public void doRslt_inst_wk_act_flg_NC(MCEventInfo info) {
		super.doRslt_inst_wk_act_flg_NC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		if (!r.inst_wk_act_flg()) {
			setValueEx(columnRslt_mfg_inst_no, index, null);
		}
		else {
			// 製造指図に紐つく場合、サーバで補完される項目であるため、クリアする
			setValueEx(columnRslt_itm_cd, index, null);
			setValueEx(columnRslt_itm_sub1, index, null);
			setValueEx(columnRslt_itm_sub2, index, null);
			setValueEx(columnRslt_itm_sub3, index, null);
			setValueEx(columnRslt_lot_no, index, null);
			setValueEx(columnRslt_sublot_no, index, null);
			setValueEx(columnRslt_sno1, index, null);
			setValueEx(columnRslt_sno2, index, null);
			setValueEx(columnRslt_sno3, index, null);
			setValueEx(columnRslt_sno4, index, null);
			setValueEx(columnRslt_dpt_cd, index, null);
			setValueEx(columnRslt_loc_cd, index, null);
			setValueEx(columnRslt_str_ln_cd, index, null);
		}
	}
	
	@Override
	public void doRslt_wk_cost_calc_ctl_flg_NC(MCEventInfo info) {
		super.doRslt_wk_cost_calc_ctl_flg_NC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		if (isActWkCostRO(r)) {
			r.act_wk_cost(null);
		}
	}

	protected void doRslt_end_tm_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		if (isActWkCostRO(r)) {
			r.act_wk_cost(null);
		}
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MSBCP1100(r)) {
				doBtn_open_MSBCP1100(r);
			}
		}
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
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		clearCnd();
		fillSpace();
		setSrchStatus();
		setStatusColumn();
		setCndMesTrgt();
	}

	protected void clearCnd() {
		if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_ACT.getActionCommand());

			setValueEx(Cnd_oper_ord_flg, false);
			setValueEx(Cnd_oper_no_inst_flg, true);
			
			setValueEx(Cnd_oper_stt_flg, true);
			setValueEx(Cnd_oper_cmpl_flg, true);
			setValueEx(Cnd_stt_flg, true);
			setValueEx(Cnd_cmpl_flg, true);
			setValueEx(Cnd_ord_flg, true);
			setValueEx(Cnd_no_schd_flg, true);

			setValueEx(Cnd_pr_rate_fr, null);
			setValueEx(Cnd_pr_rate_to, null);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_ACT.getActionCommand());
			setValueEx(Cnd_oper_ord_flg, false);
			setValueEx(Cnd_oper_no_inst_flg, true);
			
			setValueEx(Cnd_oper_stt_flg, true);
			setValueEx(Cnd_oper_cmpl_flg, true);
			setValueEx(Cnd_stt_flg, true);
			setValueEx(Cnd_cmpl_flg, true);
			setValueEx(Cnd_ord_flg, false);
			setValueEx(Cnd_no_schd_flg, true);
			
			setValueEx(Cnd_pr_rate_fr, null);
			setValueEx(Cnd_pr_rate_to, null);
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_disp_unit_SCHD.isSelected()) {
				setValueEx(Cnd_oper_ord_flg, true);
				setValueEx(Cnd_oper_no_inst_flg, false);
				
				setValueEx(Cnd_oper_stt_flg, true);
				setValueEx(Cnd_oper_cmpl_flg, true);
				setValueEx(Cnd_stt_flg, true);
				setValueEx(Cnd_cmpl_flg, true);
				setValueEx(Cnd_ord_flg, true);
				setValueEx(Cnd_no_schd_flg, false);

				setValueEx(Cnd_no_mfg_inst_only_flg, false);
				setValueEx(Cnd_wk_rsn_cd, null);
				setValueEx(Cnd_wk_day_cd, null);
				setValueEx(Cnd_dpt_wg_cd, null);
				setValueEx(Cnd_wk_usr_cd, null);
				setValueEx(Cnd_wk_usr_dpt_cd, null);
				setValueEx(Cnd_wk_act_no, null);
				setValueEx(Cnd_mfg_act_no, null);
				setValueEx(Cnd_act_intr_rmrks, null);
				setValueEx(Cnd_act_sub_char1, null);
				setValueEx(Cnd_act_sub_char2, null);
				setValueEx(Cnd_act_sub_char3, null);
				setValueEx(Cnd_ext_wk_act_no, null);
			}
			else {
				setValueEx(Cnd_oper_ord_flg, false);
				setValueEx(Cnd_oper_no_inst_flg, true);

				setValueEx(Cnd_oper_stt_flg, true);
				setValueEx(Cnd_oper_cmpl_flg, true);
				setValueEx(Cnd_stt_flg, true);
				setValueEx(Cnd_cmpl_flg, true);
				setValueEx(Cnd_ord_flg, false);
				setValueEx(Cnd_no_schd_flg, true);
				
				setValueEx(Cnd_pr_rate_fr, null);
				setValueEx(Cnd_pr_rate_to, null);
			}
		}
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	@Override
	public void doCnd_disp_unit_NC(MCEventInfo info) {
		super.doCnd_disp_unit_NC(info);
		clearContainers(getRsltL());
		clearCnd();
		setSrchStatus();
		setCndMesTrgt();
	}
	
	// -----------------------------------------------
	// RowListener
	protected AcDtRowListener getAcDtRowListener() {
		return new AcDtRowListener();
	}
	
	/**
	 * 計上日に設定された値を、時刻と連動するダミーの日付に設定するためのRowListener
	 */
	protected class AcDtRowListener extends MAUDP_RowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			String col = event.getColumn();
			if (isSame(col, RsltR.$ac_dt)) {
				RsltR r = (RsltR)event.getSourceRow(); 
				setDummyDt(r);
			}
		}
	}
	
	protected AcDtListListener getAcDtListListener() {
		return new AcDtListListener();
	}
	
	/**
	 * 計上日に設定された値を、時刻と連動するダミーの日付に設定するためのListListener
	 */
	protected class AcDtListListener extends MAUDP_ListListener {
		@Override
		public void rowAdded(MCListEvent event) {
			super.rowAdded(event);
			int idx = event.getIndex();
			int cnt = event.getCount();
			for (int i=idx;i<idx + cnt;i++) {
				RsltR r = getRsltL().get(i);
				setDummyDt(r);
			}
		}
	}
	
	protected void setDummyDt(RsltR r) {
		r.dummy_st_dt(r.ac_dt());
		r.dummy_end_dt(r.ac_dt());
	}

	// -----------------------------------------------
	// CellConfig
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
			if (isUpdStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);
				
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				
				// 製造指図に紐つく工数実績の入力制御
				if (!isNull(r.wk_schd_no()) || !isNull(r.oper_act_no())) {
					// 工数予定に紐つくまたは、工程実績に紐つく工数実績の場合
					if (isWkSchdROCol(column) || isInstWkActROCol(column)) {
						return MCMode.READ_ONLY;
					}
				}
				else if (r.inst_wk_act_flg()) {
					// 製造指図に紐つくが工数予定にも、工程実績にも紐つかない工数実績の場合（本画面で製造指図ＮＯを指定して追加した工数実績の場合）
					if (isInstWkActROCol(column) || column == columnRslt_abort_flg) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					// 製造指図に紐つかない工数実績の場合
					if (column == columnRslt_mfg_inst_no || column == columnRslt_div_seq
							|| column == columnRslt_abort_flg) {
						return MCMode.READ_ONLY;
					}
					// 品目が指定されている場合
					if (!isNull(r.itm_cd())) {
						if (column == columnRslt_loc_cd) {
							return MCMode.REQUIRED;
						}
					}
				}
				
				if (!isNull(r.wk_act_no())) {
					// 実績登録済みの場合製造指図ＮＯ、分割連番の訂正は不可
					if (column == columnRslt_inst_wk_act_flg
							|| column == columnRslt_mfg_inst_no
							|| column == columnRslt_div_seq) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_act_wk_cost) {
					if (isActWkCostRO(r)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (isDelStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);

				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
		/**
		 * 工数予定に紐付く工数実績の場合にのみROになるカラム
		 * @param column
		 * @return
		 */
		protected boolean isWkSchdROCol(MCColumnConfig column) {
			if (column == columnRslt_mfg_inst_no || column == columnRslt_div_seq
					|| column == columnRslt_oper_cd
					|| column == columnRslt_inst_wk_act_flg) {
				return true;
			}
			return false;
		}
		
		/**
		 * 指図に紐つく場合にROになるカラム
		 * @param column
		 * @return
		 */
		protected boolean isInstWkActROCol(MCColumnConfig column) {
			if (column == columnRslt_dpt_cd || column == columnRslt_loc_cd
					|| column == columnRslt_itm_cd
					|| column == columnRslt_itm_sub1 || column == columnRslt_itm_sub2
					|| column == columnRslt_itm_sub3 || column == columnRslt_lot_no
					|| column == columnRslt_sublot_no || column == columnRslt_sno1
					|| column == columnRslt_sno2 || column == columnRslt_sno3
					|| column == columnRslt_sno4) {
				return true;
			}
			return false;
		}
	}
		
	protected boolean isActWkCostRO(RsltR r) {
		if (r.wk_cost_calc_ctl_flg() && isNotZeroTm(r.end_tm())) {
			// サーバで自動計算するためread_only
			return true;
		}
		return false;
	}
	
	protected boolean isNotZeroTm(MCDate d) {
		if (isNull(d)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void changeFileInRowStatus() {
		for (RsltR r : getRsltL()) {
			if (!isNull(r.wk_schd_no())) {
				r.setStatus(MCRow.Status.MODIFY);
			}
		}
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBCL1150_Imp01();
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}

}