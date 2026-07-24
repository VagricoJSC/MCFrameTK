package mcframe.clientMSBC.MSBCP0030;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_MlyRqmtReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MlyRqmtReg_MC extends MSBCP_MlyRqmtReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MlyRqmtReg_MC() {
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
	public MSBCP_MlyRqmtReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0030_Srch01Caller<P extends MSBCP_MlyRqmtReg, B extends MS_MSBCL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0030_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkBeforeAfter(Cnd_prod_ym_fr, Cnd_prod_ym_to));
		}

		@Override
		protected void show() {
			super.show();
			setKey();
		}

		protected void setKey() {
			for(RsltR r: getRsltL()) {
				r.ym_key(r.ym());
				r.prod_ym_key(r.prod_ym());
				r.mps_grp_cd_key(r.mps_grp_cd());
				r.itm_cd_key(r.itm_cd());
				r.itm_sub1_key(r.itm_sub1());
				r.itm_sub2_key(r.itm_sub2());
				r.itm_sub3_key(r.itm_sub3());
			}
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
			setSrchStatus();
			fillSpace();
		}
	}

	/**
	 * [MS_MSBCL0030_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0030_Imp01Caller<P extends MSBCP_MlyRqmtReg, B extends MS_MSBCL0030_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBCL0030_Imp01Caller(P p, B b) {
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

		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void setModeMCEx(MCException ex){
			  super.setModeMCEx(ex);
			  setFIX_UStatus();
		}
	}

	/**
	 * [MS_MSBCL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0030_Upd01Caller<P extends MSBCP_MlyRqmtReg, B extends MS_MSBCL0030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0030_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0030_Del01Caller<P extends MSBCP_MlyRqmtReg, B extends MS_MSBCL0030_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL0030_Del01Caller(P p, B b) {
			super(p, b);
		}
	}
	
	/**
	 * [MS_MSBCL0030_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0030_Upd02Caller<P extends MSBCP_MlyRqmtReg, B extends MS_MSBCL0030_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
	
		protected MS_MSBCL0030_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		MCDate toDay = getToday();
		setValueEx(BulkSet_ym, toDay.trunc(MCDate.MONTH));
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnRslt_itm_cd.addLCListener(this);
		columnRslt_itm_sub1.addLCListener(this);
		columnRslt_itm_sub2.addLCListener(this);
		columnRslt_itm_sub3.addLCListener(this);		
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

	protected void setStatusColumn() {
		if (Cnd_ope_DEL.isSelected()) {
			RsltTable.setStatusColumnVisible(false);
		}
		else {
			RsltTable.setStatusColumnVisible(true);
		}
	}
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0030_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0030_Srch01().execDL();
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
		if (r != null) {
			clearNotCopyCol(r.getGUIIndex());
		}
	}

	protected void clearNotCopyCol(int index) {
		setValueEx(columnRslt_ym_key, index, null);
		setValueEx(columnRslt_prod_ym_key, index, null);
		setValueEx(columnRslt_mps_grp_cd_key, index, null);
		setValueEx(columnRslt_itm_cd_key, index, null);
		setValueEx(columnRslt_itm_sub1_key, index, null);
		setValueEx(columnRslt_itm_sub2_key, index, null);
		setValueEx(columnRslt_itm_sub3_key, index, null);
		setValueEx(columnRslt_prod_ym, index, null);
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL0030_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[ins_rqmt]の押下時の処理
	 */
	@Override
	public void doBtn_ins_rqmt(MCEventInfo info) {
		callMS_MSBCL0030_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL0030_Del01();
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
	}

	protected void clearCnd() {
		if (Cnd_ope_UPD.isSelected()) {
			MCDate toDay = getToday();
			setValueEx(BulkSet_ym, toDay.trunc(MCDate.MONTH));
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setValueEx(BulkSet_ym, null);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setValueEx(BulkSet_ym, null);
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (r.check()) {
			bulkSet(BulkSet_ym, r);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnRslt_itm_cd
				|| lc == columnRslt_itm_sub1
				|| lc == columnRslt_itm_sub2
				|| lc == columnRslt_itm_sub3) {
			doRslt_itm_cd_LC(info);
		}
	}

	@Override
	public void doBulkSet_ym_LC(MCEventInfo info) {
		super.doBulkSet_ym_LC(info);
		bulkSet(BulkSet_ym);
	}


	@Override
	public void doRslt_ym_LC(MCEventInfo info){
		super.doRslt_ym_NC(info);
		clearMpsGrp(info.getEventIndex());
		
		int eventIdx = info.getEventIndex();
		String _defWgCd = getSysParm("DEF_WG_CD") ;
		if (!isNull(_defWgCd)) {
			setValueEx(columnRslt_wg_cd, eventIdx, _defWgCd);
		}
	}

	@Override
	public void doRslt_wg_cd_LC(MCEventInfo info){
		super.doRslt_wg_cd_LC(info);
		clearMpsGrp(info.getEventIndex());
	}

	public void doRslt_itm_cd_LC(MCEventInfo info){
		clearMpsGrp(info.getEventIndex());
		
		int eventIdx = info.getEventIndex();
		String _defWgCd = getSysParm("DEF_WG_CD") ;
		if (!isNull(_defWgCd)) {
			setValueEx(columnRslt_wg_cd, eventIdx, _defWgCd);
		}
	}

	protected void clearMpsGrp(int i) {
		if(i > -1){
			setValueEx(columnRslt_mps_grp_cd, i, null);
		}
	}

	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
		if (isNull(r.ym())) {
			bulkSet(BulkSet_ym, r);
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
		if (r.isStatusCreate()) {
			if (b == BulkSet_ym && isEditable(columnRslt_ym, r.getGUIIndex())) {
				r.ym(getBulkSetR().ym());
			}
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
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
				if (r.isStatusCreate() || isNull(r.ym_key())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
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
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_RQMT.isSelected()) {
			setRQMTStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
		setStatusColumn();
	}

	protected void setRefStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
		setStatusColumn();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setTabMode();
		FoldTab.focusActiveFirstComponent();
		setStatusColumn();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setTabMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setTabMode();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setTabMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setRQMTStatus() {
		super.setRQMTStatus();
		setTabMode();
		FoldTab.focusActiveFirstComponent();
	}

	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else if (Cnd_ope_RQMT.isSelected()) {
			setTabComponentEnable(FoldTab, Tab3Panel);
		}
	}
	
	
	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isUpdStatus()) {
				if (column == columnRslt_ym) {
					if (!isNull(r.ym_key())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnRslt_mps_grp_cd) {
					if (isNullOr(r.ym(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
	  callMS_MSBCL0030_Imp01();
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}