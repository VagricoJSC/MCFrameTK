package mcframe.clientMSBF.MSBFP0010;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_LotInspSchdReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_LotInspSchdReg_MC extends MSBFP_LotInspSchdReg_MC_A implements IfListRegPanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_LotInspSchdReg_MC() {
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
	public MSBFP_LotInspSchdReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Srch01Caller<P extends MSBFP_LotInspSchdReg, B extends MS_MSBFL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0010_Srch01Caller(P p, B b) {
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
			// 最古入庫日
			msgList.addAll(checkBeforeAfter(Cnd_first_gr_dt_fr, Cnd_first_gr_dt_to));
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
	 * [MS_MSBFL0010_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Srch02Caller<P extends MSBFP_LotInspSchdReg, B extends MS_MSBFL0010_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0010_Srch02Caller(P p, B b) {
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
			// 最古入庫日
			msgList.addAll(checkBeforeAfter(Cnd_first_gr_dt_fr, Cnd_first_gr_dt_to));
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			if (!bridge.down0().isEmpty()) {
				bridge.down0().setValueNE(RsltR.$ac_dt, getToday());
			}
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
	 * [MS_MSBFL0010_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Srch03Caller<P extends MSBFP_LotInspSchdReg, B extends MS_MSBFL0010_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0010_Srch03Caller(P p, B b) {
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
	 * [MS_MSBFL0010_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Srch04Caller<P extends MSBFP_LotInspSchdReg, B extends MS_MSBFL0010_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0010_Srch04Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			bridge.down0().setColumnValueNE(RsltR.$can_ac_dt, RsltR.$ac_dt);
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
	 * [MS_MSBFL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Ins01Caller<P extends MSBFP_LotInspSchdReg, B extends MS_MSBFL0010_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0010_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0010_Ins02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Ins02Caller<P extends MSBFP_LotInspSchdReg, B extends MS_MSBFL0010_Ins02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0010_Ins02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Del01Caller<P extends MSBFP_LotInspSchdReg, B extends MS_MSBFL0010_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0010_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0010_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Del02Caller<P extends MSBFP_LotInspSchdReg, B extends MS_MSBFL0010_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0010_Del02Caller(P p, B b) {
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
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (isSelectedLmtUp()) {
			callMS_MSBFL0010_Srch01();
		}
		else if (isSelectedInspSchd()) {
			callMS_MSBFL0010_Srch02();
		}
		if (isSelectedDelLmtUp()) {
			callMS_MSBFL0010_Srch03();
		}
		else if (isSelectedDelInspSchd()) {
			callMS_MSBFL0010_Srch04();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (isSelectedLmtUp()) {
			createMS_MSBFL0010_Srch01().execDL();
		}
		else if (isSelectedInspSchd()) {
			createMS_MSBFL0010_Srch02().execDL();
		}
		if (isSelectedDelLmtUp()) {
			createMS_MSBFL0010_Srch03().execDL();
		}
		else if (isSelectedDelInspSchd()) {
			createMS_MSBFL0010_Srch04().execDL();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0030(r);
	}

	protected void doBtn_open_MSBFP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0030");
		aso.putCnd(crtOpenMSBFP0030CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0030.CndR crtOpenMSBFP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg p = (mcframe.clientMSBF.MSBFP0030.MSBFP_InspInstLstReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0030.CndR to = mcframe.clientMSBF.MSBFP0030.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.loc_cd(r.loc_cd());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.insp_typ(MSC_INSP_TYP.LOT.value());

		return to;
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
	 * Panel[Btn]のボタン[upd_lmt_schd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_lmt_schd(MCEventInfo info) {
		callMS_MSBFL0010_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd_schd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_schd(MCEventInfo info) {
		callMS_MSBFL0010_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[del_lmt_schdt]の押下時の処理
	 */
	@Override
	public void doBtn_del_lmt_schdt(MCEventInfo info) {
		callMS_MSBFL0010_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_schd]の押下時の処理
	 */
	@Override
	public void doBtn_del_schd(MCEventInfo info) {
		callMS_MSBFL0010_Del02();
	}

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
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
		if (Cnd_ope_DEL_INSP_SCHD.isSelected()) {
			return true;
		}
		return false;
	}

	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return columnRslt_check;
	}
	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_pack_unit_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_dec_place);
		Rslt_pack_insp_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_dec_place);
		Rslt_base_unit_insp_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_dec_place);
		Rslt_cont_fctr_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		// 初期値設定
		Cnd_today.setValue(getToday());
		Cnd_insp_schd_no.setValue(null);
		Cnd_insp_cnt_rmrks.setValue(null);
		Cnd_sub_char1.setValue(null);
		Cnd_sub_char2.setValue(null);
		Cnd_sub_char3.setValue(null);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	// -----------------------------------------------
	@Override
	public void setSRCH_LMT_UPStatus() {
		super.setSRCH_LMT_UPStatus();
		setBtnMode();
	}

	@Override
	public void setLMT_UPStatus() {
		super.setLMT_UPStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCH_INSP_SCHDStatus() {
		super.setSRCH_INSP_SCHDStatus();
		setBtnMode();
	}

	@Override
	public void setINSP_SCHDStatus() {
		super.setINSP_SCHDStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_LMT_UPStatus() {
		super.setSRCH_DEL_LMT_UPStatus();
		setBtnMode();
	}

	@Override
	public void setDEL_LMT_UPStatus() {
		super.setDEL_LMT_UPStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_INSP_SCHDStatus() {
		super.setSRCH_DEL_INSP_SCHDStatus();
		setBtnMode();
	}

	@Override
	public void setDEL_INSP_SCHDStatus() {
		super.setDEL_INSP_SCHDStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBFP0030(r)) {
			setDefaultMode(Btn_open_MSBFP0030);
		}
		else {
			Btn_open_MSBFP0030.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 先行検査予定登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0030(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.itm_cd());
	}
	protected boolean isLmtUpStatus() {
		return isSame(getStatus(), LMT_UP);
	}

	protected boolean isInspSchdStatus() {
		return isSame(getStatus(), INSP_SCHD);
	}

	protected boolean isDelLmtUpStatus() {
		return isSame(getStatus(), DEL_LMT_UP);
	}

	protected boolean isDelInspSchdStatus() {
		return isSame(getStatus(), DEL_INSP_SCHD);
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (isSelectedLmtUp()) {
			setSRCH_LMT_UPStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedInspSchd()) {
			setSRCH_INSP_SCHDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedDelLmtUp()) {
			setSRCH_DEL_LMT_UPStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedDelInspSchd()) {
			setSRCH_DEL_INSP_SCHDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (isSelectedLmtUp()) {
			setLMT_UPStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedInspSchd()) {
			setINSP_SCHDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedDelLmtUp()) {
			setDEL_LMT_UPStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedDelInspSchd()) {
			setDEL_INSP_SCHDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	// -----------------------------------------------
	// event/listener
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getBulkSetR(), getRsltL());
		clearCnd();
		setSrchStatus();
	}

	protected void clearCnd() {
		if (isSelectedLmtUp()) {
			valueInitSub();
		}
		else if (isSelectedInspSchd()) {
			valueInitSub();
		}
		else if (isSelectedDelLmtUp()) {
			setValueEx(Cnd_today, null);
			setValueEx(Cnd_rem_stk_vld_pd, null);
			setValueEx(Cnd_rem_stk_lmt_pd, null);
			setValueEx(Cnd_trg_stk_vld_dt, null);
			setValueEx(Cnd_trg_stk_lmt_dt, null);
			setValueEx(Cnd_unreg_lmt_flg, false);
			setValueEx(Cnd_pack_unit_cd, null);
			setValueEx(Cnd_stk_id_typ, null);
			setValueEx(Cnd_first_gr_dt_fr, null);
			setValueEx(Cnd_first_gr_dt_to, null);
			setValueEx(Cnd_disp_mrp_use_dt_flg, false);
			setValueEx(Cnd_lot_rmrks, null);
		}
		else if (isSelectedDelInspSchd()) {
			setValueEx(Cnd_today, null);
			setValueEx(Cnd_rem_stk_vld_pd, null);
			setValueEx(Cnd_rem_stk_lmt_pd, null);
			setValueEx(Cnd_trg_stk_vld_dt, null);
			setValueEx(Cnd_trg_stk_lmt_dt, null);
			setValueEx(Cnd_unreg_lmt_flg, false);
			setValueEx(Cnd_pack_unit_cd, null);
			setValueEx(Cnd_stk_id_typ, null);
			setValueEx(Cnd_first_gr_dt_fr, null);
			setValueEx(Cnd_first_gr_dt_to, null);
			setValueEx(Cnd_disp_mrp_use_dt_flg, false);
			setValueEx(Cnd_lot_rmrks, null);
		}
	}

	/**
	 * 操作種別の期限再検査予定登録を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedLmtUp(){
		return Cnd_ope_LMT_UP.isSelected();
	}
	/**
	 * 操作種別の検査予定登録を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedInspSchd(){
		return Cnd_ope_INSP_SCHD.isSelected();
	}
	/**操作種別が期限再検査予定取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDelLmtUp() {
		return Cnd_ope_DEL_LMT_UP.isSelected();
	}
	/**操作種別が検査予定取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDelInspSchd() {
		return Cnd_ope_DEL_INSP_SCHD.isSelected();
	}

	@Override
	public void doCnd_rem_stk_lmt_pd_LC(MCEventInfo info) {
		super.doCnd_rem_stk_lmt_pd_LC(info);

		setTrgStkLmtDt();
	}

	@Override
	public void doCnd_rem_stk_lmt_pd_typ_NC(MCEventInfo info) {
		super.doCnd_rem_stk_lmt_pd_typ_NC(info);

		setTrgStkLmtDt();
	}

	@Override
	public void doCnd_trg_stk_lmt_dt_LC(MCEventInfo info) {
		super.doCnd_trg_stk_lmt_dt_LC(info);

		getCndR().rem_stk_lmt_pd(null);
	}

	@Override
	public void doCnd_rem_stk_vld_pd_LC(MCEventInfo info) {
		super.doCnd_rem_stk_vld_pd_LC(info);

		setTrgStkVldDt();
	}

	@Override
	public void doCnd_rem_stk_vld_pd_typ_NC(MCEventInfo info) {
		super.doCnd_rem_stk_vld_pd_typ_NC(info);

		setTrgStkVldDt();
	}

	@Override
	public void doCnd_trg_stk_vld_dt_LC(MCEventInfo info) {
		super.doCnd_trg_stk_vld_dt_LC(info);

		getCndR().rem_stk_vld_pd(null);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_st_dt.addLCListener(this);
		BulkSet_st_hm.addLCListener(this);
		BulkSet_end_dt.addLCListener(this);
		BulkSet_end_hm.addLCListener(this);
		columnRslt_pack_insp_qty.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == BulkSet_st_dt) {
			bulkSet(BulkSet_st_dt);
		}
		else if (lc == BulkSet_st_hm) {
			bulkSet(BulkSet_st_hm);
		}
		else if (lc == BulkSet_end_dt) {
			bulkSet(BulkSet_end_dt);
		}
		else if (lc == BulkSet_end_hm) {
			bulkSet(BulkSet_end_hm);
		}
		else if (lc == columnRslt_pack_insp_qty) {
			doRslt_pack_insp_qty_LC(info);
		}
	}

	/**
	 * 荷姿検査数より基準単位検査数に変換する。
	 * @param info
	 */
	protected void doRslt_pack_insp_qty_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		if (isNull(r.pack_insp_qty())) {
			r.base_unit_insp_qty(null);
		}
		else {
			// 入力単位数量から基準単位数量への再計算
			MCNumber baseUnitNum = convToBaseUnit(r.pack_insp_qty(), r.pack_dmn_qty(), r.pack_conv_qty(), r.base_dec_place(),
					r.base_unit_rnd_typ());
			r.base_unit_insp_qty(baseUnitNum);
		}
	}

	// 一括設定処理
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
		// 一括設定枠の値よりも入力した値を優先するためのisNull判断をする
		if (isNull(r.st_dt())) {
			bulkSet(BulkSet_st_dt, r);
		}
		if (isNull(r.st_hm())) {
			bulkSet(BulkSet_st_hm, r);
		}
		if (isNull(r.end_dt())) {
			bulkSet(BulkSet_end_dt, r);
		}
		if (isNull(r.end_hm())) {
			bulkSet(BulkSet_end_hm, r);
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
		if (b == BulkSet_st_dt && isEditable(columnRslt_st_dt, r.getGUIIndex())) {
			r.st_dt(getBulkSetR().st_dt());
		}
		else if (b == BulkSet_st_hm && isEditable(columnRslt_st_hm, r.getGUIIndex())) {
			r.st_hm(getBulkSetR().st_hm());
		}
		else if (b == BulkSet_end_dt && isEditable(columnRslt_end_dt, r.getGUIIndex())) {
			r.end_dt(getBulkSetR().end_dt());
		}
		else if (b == BulkSet_end_hm && isEditable(columnRslt_end_hm, r.getGUIIndex())) {
			r.end_hm(getBulkSetR().end_hm());
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);

		int index = info.getEventIndex();
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.check()) {
			 bulkSet(BulkSet_st_dt, r);
			 bulkSet(BulkSet_st_hm, r);
			 bulkSet(BulkSet_end_dt, r);
			 bulkSet(BulkSet_end_hm, r);
			 if (isLmtUpStatus()) {
				 setValueEx(columnRslt_pack_insp_qty, index, r.pack_unit_qty());
			 }
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBFP0030(r)) {
				doBtn_open_MSBFP0030(r);
			}
		}
	}

	/**
	 * 使用期限の対象年月日を算出する
	 */
	protected void setTrgStkLmtDt() {
		
		MCDate tmpDt = null;
		MCDate today = getCndR().today();
		MCNumber pd = getCndR().rem_stk_lmt_pd();
		if (!isNullOr(today, pd)) {
			// 月
			if (Cnd_rem_stk_lmt_pd_typ_0.isSelected()) {
				tmpDt = today.addMonth(pd);
				tmpDt = tmpDt.endOfMonth();
			}
			// 日
			else if (Cnd_rem_stk_lmt_pd_typ_1.isSelected()) {
				tmpDt = today.addDay(pd);
			}
		}
		getCndR().trg_stk_lmt_dt(tmpDt);
	}
	
	/**
	 * 有効期限の対象年月日を算出する
	 */
	protected void setTrgStkVldDt () {

		MCDate tmpDt = null;
		MCDate today = getCndR().today();
		MCNumber pd = getCndR().rem_stk_vld_pd();
		if (!isNullOr(today, pd)) {
			// 月
			if (Cnd_rem_stk_vld_pd_typ_0.isSelected()) {
				tmpDt = today.addMonth(pd);
				tmpDt = tmpDt.endOfMonth();
			}
			// 日
			else if (Cnd_rem_stk_vld_pd_typ_1.isSelected()) {
				tmpDt = today.addDay(pd);
			}
		}
		getCndR().trg_stk_vld_dt(tmpDt);
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
			// 入力モード
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isSelectedLmtUp()) {
				// 使用期限が期限切れの場合
				if (!isNull(r.lmt_dt()) && r.lmt_dt().lt(getToday())) {
					return MCMode.READ_ONLY;
				}
				// 有効期限＝使用期限の場合(ただし、期限未設定TRUEの場合は入力可にする)
				if (!r.unreg_lmt_flg() && isSame(r.vld_dt(), r.lmt_dt())) {
					return MCMode.READ_ONLY;
				}
				if (column == columnRslt_pack_insp_qty) {
					return MCMode.READ_ONLY;
				}
			}
			else if (isSelectedInspSchd()) {
				if (!isNull(r.lmt_dt()) && r.lmt_dt().lt(getToday())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}