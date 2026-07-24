package mcframe.clientMSBC.MSBCP0010;

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
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientMSUC.MSUCP0030.MSUCP_ProdListLogic;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_RqmtReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_RqmtReg_MC extends MSBCP_RqmtReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_RqmtReg_MC() {
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
	public MSBCP_RqmtReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Srch01Caller<P extends MSBCP_RqmtReg, B extends MS_MSBCL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0010_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkBeforeAfter(Cnd_due_dt_fr, Cnd_due_dt_to));
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
	 * [MS_MSBCL0010_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Imp01Caller<P extends MSBCP_RqmtReg, B extends MS_MSBCL0010_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBCL0010_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setMrpTyp(getRsltL());
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasMessage()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}

			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			setFIX_UStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

	}

	/**
	 * [MS_MSBCL0010_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Sprt01Caller<P extends MSBCP_RqmtReg, B extends MS_MSBCL0010_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL0010_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP0001);
		}

		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			MCList<RsltR> l = MCList.create(RsltR.class);
			for (RsltR r : getRsltL()) {
				if (r.sno_sprt_flg() && isEditable(columnRslt_sno_sprt_flg, r.getGUIIndex())) {
					l.add(r);
				}
			}
			return l;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			MCList<RsltR> rsltL = getRsltL().subList(RsltR.$sno_sprt_flg, true);

			for (RsltR rsltR : rsltL) {
				msgList.addAll(panel.checkReq(rsltR.getGUIIndex(), columnRslt_due_dt));
				msgList.addAll(panel.checkReq(rsltR.getGUIIndex(), columnRslt_itm_cd));
				msgList.addAll(panel.checkReq(rsltR.getGUIIndex(), columnRslt_itm_sub1));
				msgList.addAll(panel.checkReq(rsltR.getGUIIndex(), columnRslt_itm_sub2));
				msgList.addAll(panel.checkReq(rsltR.getGUIIndex(), columnRslt_itm_sub3));
				msgList.addAll(panel.checkReq(rsltR.getGUIIndex(), columnRslt_strg_loc_cd));
			}
		}

	}

	/**
	 * [MS_MSBCL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Upd01Caller<P extends MSBCP_RqmtReg, B extends MS_MSBCL0010_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0010_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		@SuppressWarnings("unchecked")
		protected void initCallerSub() {
			setMrpTyp(getCheckedRows(panel));
		}

		@Override
		protected void show() {
			super.show();
			showSub();
		}

		protected void showSub() {
			for (RsltR r : getRsltL()) {
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					r.sno_sprt_flg(false);
				}
			}
		}

	}

	/**
	 * [MS_MSBCL0010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Del01Caller<P extends MSBCP_RqmtReg, B extends MS_MSBCL0010_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL0010_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		@SuppressWarnings("unchecked")
		protected void initCallerSub() {
			setMrpTyp(getCheckedRows(panel));
		}

	}

	protected String getMrpTyp() {
		if (Cnd_mrp_typ_r_NRML.isSelected()) {
			return MSC_MRP_TYP.MRP.value();
		}
		else {
			return MSC_MRP_TYP.PRCD.value();
		}
	}

	protected void setMrpTyp(MCList<RsltR> l) {
		String mrpTyp = getMrpTyp();
		for (RsltR r : l) {
			r.mrp_typ(mrpTyp);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0010_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0010_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0070(r);
	}
	protected void doBtn_open_MSBCP0070(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0070");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0070CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP0070.CndR crtOpenMSBCP0070CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP0070.MSBCP_OrdExtInfSrch p = (mcframe.clientMSBC.MSBCP0070.MSBCP_OrdExtInfSrch) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0070.CndR to = mcframe.clientMSBC.MSBCP0070.CndR.create();

		to.ope(p.Cnd_ope_RQMT.getActionCommand());
		to.rqmt_no(r.rqmt_no());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0080(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0080(r);
	}
	protected void doBtn_open_MSBCP0080(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0080");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0080CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP0080.CndR crtOpenMSBCP0080CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP0080.CndR to = mcframe.clientMSBC.MSBCP0080.CndR.create();

		to.rqmt_no(r.rqmt_no());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[sno_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_sno_select_all(MCEventInfo info) {
		for (RsltR r : RsltTable.getViewRows()) {
			int i = r.getGUIIndex();
			if (isEditable(columnRslt_sno_sprt_flg, i)) {
				setValueEx(columnRslt_sno_sprt_flg, i, r.check());
			}
		}
	}
	/**
	 * Panel[Btn]のボタン[sno_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_sno_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable, columnRslt_sno_sprt_flg);
	}
	/**
	 * Panel[Btn]のボタン[sprt_sno]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_sno(MCEventInfo info) {
		callMS_MSBCL0010_Sprt01();
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
			r.rqmt_no(null);
			r.fix_flg(false);
			r.rqmt_gnrt_typ(null);
			r.rqmt_gnrt_typ_nm(null);
		}
		setBtnMode();
	}
	/**
	 * Panel[Btn1]のボタン[upd_nrml]の押下時の処理
	 */
	@Override
	public void doBtn_upd_nrml(MCEventInfo info) {
		callMS_MSBCL0010_Upd01();
	}
	/**
	 * Panel[Btn1]のボタン[upd_prcd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_prcd(MCEventInfo info) {
		callMS_MSBCL0010_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_nrml]の押下時の処理
	 */
	@Override
	public void doBtn_del_nrml(MCEventInfo info) {
		callMS_MSBCL0010_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_prcd]の押下時の処理
	 */
	@Override
	public void doBtn_del_prcd(MCEventInfo info) {
		callMS_MSBCL0010_Del01();
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
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_sno1_mng_typ,
				columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ,
				columnRslt_sno4_mng_typ, columnRslt_sno1_num_typ,
				columnRslt_sno2_num_typ, columnRslt_sno3_num_typ,
				columnRslt_sno4_num_typ, columnRslt_rqmt_sno1_flg,
				columnRslt_rqmt_sno2_flg, columnRslt_rqmt_sno3_flg,
				columnRslt_rqmt_sno4_flg);
	}

	// -----------------------------------------------
	// init-screen
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
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (getSnoTyp(this) == 0) {
			setComponentInvisibleAllStatus(Btn_label_sno, Btn_sno_select_all, Btn_sno_deselect_all, Btn_sprt_sno);
		}
	}
	// -----------------------------------------------
	// status

	@Override
	public void setUPD_NRMLStatus() {
		super.setUPD_NRMLStatus();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setFIX_U_NRMLStatus() {
		super.setFIX_U_NRMLStatus();
		FoldTab.focusActiveFirstComponent();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_NRMLStatus() {
		super.setSRCH_DEL_NRMLStatus();
		FoldTab.focusActiveFirstComponent();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setDEL_NRMLStatus() {
		super.setDEL_NRMLStatus();
		setStatusColumn();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_NRMLStatus() {
		super.setSRCH_NRMLStatus();
		FoldTab.focusActiveFirstComponent();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setREF_NRMLStatus() {
		super.setREF_NRMLStatus();
		setStatusColumn();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setUPD_PRCDStatus() {
		super.setUPD_PRCDStatus();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setFIX_U_PRCDStatus() {
		super.setFIX_U_PRCDStatus();
		FoldTab.focusActiveFirstComponent();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_PRCDStatus() {
		super.setSRCH_DEL_PRCDStatus();
		FoldTab.focusActiveFirstComponent();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setDEL_PRCDStatus() {
		super.setDEL_PRCDStatus();
		setStatusColumn();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_PRCDStatus() {
		super.setSRCH_PRCDStatus();
		FoldTab.focusActiveFirstComponent();
		setStatusColumn();
		setBtnMode();
	}

	@Override
	public void setREF_PRCDStatus() {
		super.setREF_PRCDStatus();
		setStatusColumn();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
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
				if (r.isStatusCreate() || isNull(r.upd_cntr())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Btn_rcopy);
			}
		}

		// 画面遷移ボタン
		if (isEnableBtn_open_MSBCP0070(r)) {
			setDefaultMode(Btn_open_MSBCP0070);
		}
		else {
			Btn_open_MSBCP0070.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBCP0080(r)) {
			setDefaultMode(Btn_open_MSBCP0080);
		}
		else {
			Btn_open_MSBCP0080.setMode(MCMode.DISABLE);
		}
	}

	protected boolean isEnableBtn_open_MSBCP0070(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.rqmt_no());
	}

	protected boolean isEnableBtn_open_MSBCP0080(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.rqmt_no());
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD_NRML) || isSame(getStatus(), UPD_PRCD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL_NRML) || isSame(getStatus(), DEL_PRCD);
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
			setSRCHStatus();
		}
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
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
			setREFStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);

	}

	public void setUPDStatus() {
		if (Cnd_mrp_typ_r_NRML.isSelected()) {
			setUPD_NRMLStatus();
		}
		else {
			setUPD_PRCDStatus();
		}
	}

	public void setFIX_UStatus() {
		if (Cnd_mrp_typ_r_NRML.isSelected()) {
			setFIX_U_NRMLStatus();
		}
		else {
			setFIX_U_PRCDStatus();
		}
	}

	protected void setSRCH_DELStatus() {
		if (Cnd_mrp_typ_r_NRML.isSelected()) {
			setSRCH_DEL_NRMLStatus();
		}
		else {
			setSRCH_DEL_PRCDStatus();
		}
	}

	public void setDELStatus() {
		if (Cnd_mrp_typ_r_NRML.isSelected()) {
			setDEL_NRMLStatus();
		}
		else {
			setDEL_PRCDStatus();
		}
	}

	public void setSRCHStatus() {
		if (Cnd_mrp_typ_r_NRML.isSelected()) {
			setSRCH_NRMLStatus();
		}
		else {
			setSRCH_PRCDStatus();
		}
	}

	public void setREFStatus() {
		if (Cnd_mrp_typ_r_NRML.isSelected()) {
			setREF_NRMLStatus();
		}
		else {
			setREF_PRCDStatus();
		}
	}

	// -----------------------------------------------
	// event/listener

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（ファイル取込エラー時）、REF（検索モード）では、クリア確認出さない
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
		if (Cnd_mrp_typ_r_PRCD.isSelected()) {
			setValueEx(Cnd_fix_flg, false);
		}
	}

	// その他イベント
	@Override
	public boolean doCnd_mrp_typ_r_VC(MCEventInfo info) {
		if (!super.doCnd_mrp_typ_r_VC(info)) {
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
	public void doCnd_mrp_typ_r_NC(MCEventInfo info) {
		super.doCnd_mrp_typ_r_NC(info);
		clearContainers(getRsltL());
		clearCnd();
		fillSpace();
		setSrchStatus();
		setStatusColumn();
	}

	// その他イベント
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Rslt_itm_p_PPanel.addItmLCListner(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Rslt_itm_p_PPanel.isItm(lc)) {
			doRslt_itm_LC(info);
		}
	}

	protected void doRslt_itm_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		setValueEx(columnRslt_mfg_loc_cd, idx, null);
		setValueEx(columnRslt_sppl_cd, idx, null);
		setValueEx(columnRslt_rqst_loc_cd, idx, null);
		setRqmtTyp(idx);
	}

	@Override
	public void doRslt_wg_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		setValueEx(columnRslt_mfg_loc_cd, idx, null);
		setValueEx(columnRslt_sppl_cd, idx, null);
		setValueEx(columnRslt_rqst_loc_cd, idx, null);
		setRqmtTyp(idx);
	}
	protected void setRqmtTyp(int idx) {
		RsltR r = getRsltL().get(idx);
		MCRow ret = MSUCP_ProdListLogic.getRqmtTyp(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd(), this);
		setValueEx(columnRslt_rqmt_typ, idx, ret.getStringNE("rqmt_typ"));
	}

	@Override
	public void doRslt_mfg_loc_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		String val = (String)info.getNewValue();
		if (!isNullOrNullVal(val)) {
			setValueEx(columnRslt_sppl_cd, idx, null);
			setValueEx(columnRslt_rqst_loc_cd, idx, null);
		}
	}

	@Override
	public void doRslt_sppl_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		String val = (String)info.getNewValue();
		if (!isNullOrNullVal(val)) {
			setValueEx(columnRslt_mfg_loc_cd, idx, null);
			setValueEx(columnRslt_rqst_loc_cd, idx, null);
		}
	}

	@Override
	public void doRslt_rqst_loc_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		String val = (String)info.getNewValue();
		if (!isNullOrNullVal(val)) {
			setValueEx(columnRslt_mfg_loc_cd, idx, null);
			setValueEx(columnRslt_sppl_cd, idx, null);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBCP0070(r)) {
				doBtn_open_MSBCP0070(r);
			}
		}
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

				if (r.fix_flg()) {
					if (columnRslt_check == column || columnRslt_intr_rmrks == column
							|| columnRslt_sub_char1 == column
							|| columnRslt_sub_char2 == column
							|| columnRslt_sub_char3 == column) {
						return null;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				// 製造場所
				if (columnRslt_mfg_loc_cd == column) {
					if (!Rslt_itm_p_PPanel.isItmFixLight(index) || isNull(r.wg_cd())) {
						return MCMode.READ_ONLY;
					}
					else {
						return null;
					}
				}
				// 発注先
				if (columnRslt_sppl_cd == column) {
					if (!Rslt_itm_p_PPanel.isItmFixLight(index) || isNull(r.wg_cd())) {
						return MCMode.READ_ONLY;
					}
					else {
						return null;
					}
				}
				// 依頼先場所
				if (columnRslt_rqst_loc_cd == column) {
					if (!Rslt_itm_p_PPanel.isItmFixLight(index) || isNull(r.wg_cd())) {
						return MCMode.READ_ONLY;
					}
					else {
						return null;
					}
				}
			}
			else if (isDelStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);

				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				if (r.fix_flg()) {
					if (columnRslt_check == column){
						return MCMode.READ_ONLY;
					}
				}

			}
			return super.getPriorMode(index, column, table);
		}
	}

	// -----------------------------------------------
	// fileImport
	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
	  callMS_MSBCL0010_Imp01();
	}

	@Override
	protected void changeFileInRowStatus() {
		for (RsltR r : getRsltL()) {
			if (!isNull(r.rqmt_no())) {
				r.setStatus(MCRow.MODIFY);
			}
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

}