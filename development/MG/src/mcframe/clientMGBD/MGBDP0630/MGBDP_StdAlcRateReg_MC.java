package mcframe.clientMGBD.MGBDP0630;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5160.*;
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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_StdAlcRateReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_StdAlcRateReg_MC extends MGBDP_StdAlcRateReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_StdAlcRateReg_MC() {
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
	public MGBDP_StdAlcRateReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0630_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0630_Srch01Caller<P extends MGBDP_StdAlcRateReg, B extends MG_MGBDL0630_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0630_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_off_fix_flg, Cnd_on_fix_flg));
			msgList.addAll(checkAtLeastOne(Cnd_off_non_calc_flg, Cnd_on_non_calc_flg));
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MG_MGBDL0630_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0630_Upd01Caller<P extends MGBDP_StdAlcRateReg, B extends MG_MGBDL0630_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0630_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBDL0630_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0630_Del01Caller<P extends MGBDP_StdAlcRateReg, B extends MG_MGBDL0630_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0630_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBDL0630_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0630_Imp01Caller<P extends MGBDP_StdAlcRateReg, B extends MG_MGBDL0630_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBDL0630_Imp01Caller(P p, B b) {
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
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0630_Srch01();
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
		if (r == null) return;
		r.fix_flg(false);
		r.fix_alc_ptn_cd(null);
		r.fix_alc_ptn_nm(null);
		r.fix_expns_cd(null);
		r.fix_expns_nm(null);
		r.calc_grp_cd(null);
		r.calc_grp_nm(null);
		r.calc_no(null);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0630_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0630_Del01();
	}
	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
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
		setValueEx(Cnd_on_non_calc_flg, true);
		setValueEx(Cnd_off_non_calc_flg, true);
		setValueEx(Cnd_on_fix_flg, true);
		setValueEx(Cnd_off_fix_flg, true);
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
		CndPanel.focusFirstComponent();
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
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setStatusCom();
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
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
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
				if (!isNull(r.upd_cntr())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
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
	protected void listenerInit() {
		super.listenerInit();
		Cnd_itm_p_PPanel.addItmLCListner(this);
		Cnd_itm_nm.addLCListener(this);
	}
	
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Cnd_itm_p_PPanel.isItm(lc) || lc == Cnd_itm_nm) {
			doCnd_itm_LC(info);
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
		setSrchStatus();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	// **無ＦＬＧがＯＮになったとき対象のＣＤをクリアする
	@Override
	public void doCnd_no_dpt_flg_NC(MCEventInfo info) {
		super.doCnd_no_dpt_flg_NC(info);
		if (Cnd_no_dpt_flg.getValue()) {
			setValueEx(Cnd_dpt_cd, null);
			setValueEx(Cnd_dpt_nm, null);
		}
	}

	@Override
	public void doCnd_no_loc_flg_NC(MCEventInfo info) {
		super.doCnd_no_loc_flg_NC(info);
		if (Cnd_no_loc_flg.getValue()) {
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_loc_nm, null);
		}
	}

	@Override
	public void doCnd_no_oper_flg_NC(MCEventInfo info) {
		super.doCnd_no_oper_flg_NC(info);
		if (Cnd_no_oper_flg.getValue()) {
			setValueEx(Cnd_oper_cd, null);
			setValueEx(Cnd_oper_nm, null);
		}
	}

	@Override
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);
		if (Cnd_no_bp_flg.getValue()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}

	@Override
	public void doCnd_no_ctg_flg_NC(MCEventInfo info) {
		super.doCnd_no_ctg_flg_NC(info);
		if (Cnd_no_ctg_flg.getValue()) {
			setValueEx(Cnd_ctg_cd, null);
			setValueEx(Cnd_ctg_nm, null);
		}
	}

	@Override
	public void doCnd_no_itm_flg_NC(MCEventInfo info) {
		super.doCnd_no_itm_flg_NC(info);
		if (Cnd_no_itm_flg.getValue()) {
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_itm_sub1, null);
			setValueEx(Cnd_itm_sub2, null);
			setValueEx(Cnd_itm_sub3, null);
			setValueEx(Cnd_itm_nm, null);
		}
	}

	// ＣＤ，名称が入力されたとき**無ＦＬＧをＯＦＦにする。
	@Override
	public void doCnd_dpt_cd_NC(MCEventInfo info) {
		super.doCnd_dpt_cd_NC(info);
		if (!isNull(Cnd_dpt_cd.getValue())) {
			setValueEx(Cnd_no_dpt_flg, false);
		}
	}

	@Override
	public void doCnd_dpt_nm_NC(MCEventInfo info) {
		super.doCnd_dpt_nm_NC(info);
		if (!isNull(Cnd_dpt_nm.getValue())) {
			setValueEx(Cnd_no_dpt_flg, false);
		}
	}

	@Override
	public void doCnd_ctg_cd_NC(MCEventInfo info) {
		super.doCnd_ctg_cd_NC(info);
		if (!isNull(Cnd_ctg_cd.getValue())) {
			setValueEx(Cnd_no_ctg_flg, false);
		}
	}

	@Override
	public void doCnd_ctg_nm_NC(MCEventInfo info) {
		super.doCnd_ctg_nm_NC(info);
		if (!isNull(Cnd_ctg_nm.getValue())) {
			setValueEx(Cnd_no_ctg_flg, false);
		}
	}

	@Override
	public void doCnd_oper_cd_NC(MCEventInfo info) {
		super.doCnd_oper_cd_NC(info);
		if (!isNull(Cnd_oper_cd.getValue())) {
			setValueEx(Cnd_no_oper_flg, false);
		}
	}

	@Override
	public void doCnd_oper_nm_NC(MCEventInfo info) {
		super.doCnd_oper_nm_NC(info);
		if (!isNull(Cnd_oper_nm.getValue())) {
			setValueEx(Cnd_no_oper_flg, false);
		}
	}

	public void doCnd_loc_cd_LC(MCEventInfo info) {
		if (!isNull(Cnd_loc_cd.getValue())) {
			setValueEx(Cnd_no_loc_flg, false);
		}
	}

	public void doCnd_loc_nm_LC(MCEventInfo info) {
		if (!isNull(Cnd_loc_nm.getValue())) {
			setValueEx(Cnd_no_loc_flg, false);
		}
	}

	public void doCnd_bp_cd_LC(MCEventInfo info) {
		if (!isNull(Cnd_bp_cd.getValue())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	public void doCnd_bp_nm_LC(MCEventInfo info) {
		if (!isNull(Cnd_bp_nm.getValue())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	public void doCnd_itm_LC(MCEventInfo info) {
		if (!isNull(info.getNewValue())) {
			setValueEx(Cnd_no_itm_flg, false);
		}
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
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		if (Cnd_ope_UPD.isSelected()) {
			callMG_MGBDL0630_Imp01();
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
			if (r.fix_flg()){
				return MCMode.READ_ONLY;
			} 
			if (isUpdStatus()) {
				if (!isNull(r.upd_cntr()) && isKeyColumn(column, r)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}