package mcframe.clientMGBB.MGBBP0300;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5390.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_ActMfgIfReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_ActMfgIfReg_MC extends MGBBP_ActMfgIfReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ActMfgIfReg_MC() {
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
	public MGBBP_ActMfgIfReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0300_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0300_Srch01Caller<P extends MGBBP_ActMfgIfReg, B extends MG_MGBBL0300_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0300_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
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
	 * [MG_MGBBL0300_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0300_Upd01Caller<P extends MGBBP_ActMfgIfReg, B extends MG_MGBBL0300_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0300_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0300_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0300_Del01Caller<P extends MGBBP_ActMfgIfReg, B extends MG_MGBBL0300_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0300_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0300_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0300_Del02Caller<P extends MGBBP_ActMfgIfReg, B extends MG_MGBBL0300_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0300_Del02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getDelCndR()));
		}
		
		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true ;
		}
	}

	/**
	 * [MG_MGBBL0300_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0300_Imp01Caller<P extends MGBBP_ActMfgIfReg, B extends MG_MGBBL0300_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBBL0300_Imp01Caller(P p, B b) {
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
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}
		
		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBBL0300_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0300_Ins01Caller<P extends MGBBP_ActMfgIfReg, B extends MG_MGBBL0300_Ins01Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0300_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0300_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0300_Ins02Caller<P extends MGBBP_ActMfgIfReg, B extends MG_MGBBL0300_Ins02Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0300_Ins02Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBBL0300_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0030(r);
	}
	protected void doBtn_open_MGBBP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0030");
		mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg p = (mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0030.CndR to = mcframe.clientMGBB.MGBBP0030.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		aso.putCnd(to);
		aso.runValueInit();
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBBP0040(r);
	}
	protected void doBtn_open_MGBBP0040(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0040");
		mcframe.clientMGBB.MGBBP0040.MGBBP_InstOperReg p = (mcframe.clientMGBB.MGBBP0040.MGBBP_InstOperReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0040.CndR to = mcframe.clientMGBB.MGBBP0040.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		aso.putCnd(to);
		aso.runValueInit();
		if (isSearchForOpen(r)) {
			aso.putSearchAction();
		}
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
		copyRow(RsltTable);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBBL0300_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[ins_in_file]の押下時の処理
	 */
	@Override
	public void doBtn_ins_in_file(MCEventInfo info) {
		callMG_MGBBL0300_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[ins_del_in_file]の押下時の処理
	 */
	@Override
	public void doBtn_ins_del_in_file(MCEventInfo info) {
		callMG_MGBBL0300_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBBL0300_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_bulk]の押下時の処理
	 */
	@Override
	public void doBtn_del_bulk(MCEventInfo info) {
		callMG_MGBBL0300_Del02();
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
		setupPartsSub();
	}
	
	protected void setupPartsSub() {
		Rslt_str_ln_p_PPanel.setRelateBeans(columnRslt_loc_cd, columnRslt_str_ln_tgt_flg);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_trd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place, columnRslt_trd_cur_amt, columnRslt_xrate);
		Rslt_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, Cnd_cur_cd, Cnd_purc_xrate_cd, columnRslt_ac_dt, true);
	}
	
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {

		setValueEx(Cnd_cur_cd, getBaseCur().cur_cd());
		setValueEx(Cnd_amt_dec_place, getBaseCur().amt_dec_place());
		setValueEx(Cnd_purc_xrate_cd, getCo().purc_xrate_cd());

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}
	}

	@Override
	protected void listInit() {
		super.listInit();
		getCnd_ac_slip_typ_ListPutter().putBind(AcSlipTypCols.$i_ac_typ_atr, MAC_AC_SLIP_TYP.$IS_PRODPURC_TYP);
		getRslt_ac_slip_typ_ListPutter().putBind(AcSlipTypCols.$i_ac_typ_atr, MAC_AC_SLIP_TYP.$IS_PRODPURC_TYP);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getRsltL()) {
			list.add(RsltR.$data_lno);
			list.add(RsltR.$slip_no);
			list.add(RsltR.$slip_seq_no);
		}
		return list;
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Rslt_itm_p_PPanel.addItmLCListner(this);
	}
	
	protected void initCalcCtg() {
		if (Cnd_ope_DELBULK.isSelected() || Cnd_ope_INSDEL_FILE.isSelected()) {
			setDefCalcCtg(DelCnd_calc_ctg_cd);
		}
	}
	
	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		else if (Cnd_ope_DELBULK.isSelected()) {
			setDEL_BULKStatus();
		}
		else if (Cnd_ope_INS_FILE.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_INSDEL_FILE.isSelected()) {
			setINS_DELStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setStatusCom();
	}
	
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setStatusCom();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}
	
	@Override
	public void setDEL_BULKStatus() {
		super.setDEL_BULKStatus();
		setStatusCom();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}
	
	@Override
	public void setINS_DELStatus() {
		super.setINS_DELStatus();
		setStatusCom();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
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
	
	protected void setStatusCom() {
		setTabMode();
		
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
	}
	
	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
		}
	}
	
	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else if (Cnd_ope_DELBULK.isSelected() || Cnd_ope_INSDEL_FILE.isSelected()) {
			setTabComponentEnable(FoldTab, Tab3Panel);
		}
		else {
			setTabComponentEnable(FoldTab);
		}
	}
	
	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
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
				if (!isNull(r.data_lno())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
		
		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBBP0030, isEnableBtn_open_MGBBP0030(r));
		setBtnModeByFlg(Btn_open_MGBBP0040, isEnableBtn_open_MGBBP0040(r));
	}

	/**
	 * 遷移先で検索を実行するか
	 */
	protected boolean isSearchForOpen(RsltR r) {
		if (r == null) {
			return false;
		}
		return Rslt_itm_p_PPanel.isItmFixLight(r.getGUIIndex()) && !isNull(r.itm_mfg_inst_no());
	}

	/**
	 * 品目製造指図情報一覧画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MGBBP0030(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 指図工程情報一覧画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MGBBP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	/**
	 * 操作種別によるステータスカラムの表示・非表示切替
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	
	// -----------------------------------------------
	// Event
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
		initCalcCtg();
		setSrchStatus();
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd_no_ac_rsn_flg_NC(info);
		if (getCndR().no_ac_rsn_flg()) {
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);
		}
	}
	@Override
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_cd_LC(info);
		if (!isNull(getCndR().ac_rsn_cd())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}
	@Override
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_nm_LC(info);
		if (!isNull(getCndR().ac_rsn_nm())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}
	
	@Override
	public void doRslt_wg_cd_LC(MCEventInfo info) {
		super.doRslt_wg_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		if (!isNull(r.loc_cd())) {
			setValueEx(columnRslt_loc_cd, index, null);
		}
	}
	
	@Override
	public void doDelCnd_wg_cd_LC(MCEventInfo info) {
		super.doDelCnd_wg_cd_LC(info);
		if (!isNull(getDelCndR().loc_cd())) {
			setValueEx(DelCnd_loc_cd, null);
		}
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MGBBP0030(r)) {
				doBtn_open_MGBBP0030(r);
			}
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (Rslt_itm_p_PPanel.isItm(lc)) {
			doRslt_itm_cd_LC(info);
		}
	}
	
	public void doRslt_itm_cd_LC(MCEventInfo info) {
		setBtnMode();
	}
	
	@Override
	public void doRslt_itm_mfg_inst_no_LC(MCEventInfo info) {
		super.doRslt_itm_mfg_inst_no_LC(info);
		setBtnMode();
	}
	
	// -----------------------------------------------
	// File input
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void setFileInStatus(MCRow r) {
		super.setFileInStatus(r);
		if (!isNull(r.getNumber(RsltR.$data_lno))) {
			r.setStatus(MCRow.Status.MODIFY);
		}
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		if (Cnd_ope_UPD.isSelected()) {
			callMG_MGBBL0300_Imp01();
		}
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}
	
	// -----------------------------------------------
	// ListLogic Custom
	@Override
	public MCList getRslt_expns_cd(MCRow row, MCEventInfo info) {
		row.setStringNE(ExpnsCols.$i_expns_typ, MAC_EXPNS_TYP.PROD.value());
		return super.getRslt_expns_cd(row, info);
	}
	
	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}
	
	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}
	
	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			// 登録・訂正
			if (isUpdStatus()) {
				if (column == columnRslt_loc_cd) {
					if (isNullOrNullVal(r.wg_cd()) && isNullOrNullVal(getSysParm("DEF_WG_CD"))) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}