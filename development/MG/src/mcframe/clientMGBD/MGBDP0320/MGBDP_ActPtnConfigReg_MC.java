package mcframe.clientMGBD.MGBDP0320;

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
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;

import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ActPtnConfigReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ActPtnConfigReg_MC extends MGBDP_ActPtnConfigReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ActPtnConfigReg_MC() {
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
	public MGBDP_ActPtnConfigReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0320_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0320_Srch01Caller<P extends MGBDP_ActPtnConfigReg, B extends MG_MGBDL0320_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0320_Srch01Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBDL0320_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0320_Upd01Caller<P extends MGBDP_ActPtnConfigReg, B extends MG_MGBDL0320_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0320_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			MCList<RsltR> rsltL = getRsltL().subList(rsltR -> rsltR.check());

			rsltL.forEach(rsltR -> {
				msgList.addAll(
						checkBeforeAfter(columnRslt_st_ym, columnRslt_end_ym, rsltR));
			});
		}

	}

	/**
	 * [MG_MGBDL0320_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0320_Del01Caller<P extends MGBDP_ActPtnConfigReg, B extends MG_MGBDL0320_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0320_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBDL0320_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0320_Imp01Caller<P extends MGBDP_ActPtnConfigReg, B extends MG_MGBDL0320_Imp01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBDL0320_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (hasErr()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}

			Ctrl_ctrl_PPanel.expand(false);
		}

		protected boolean hasErr() {
			return !isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ,
					MAC_RTN_STS_TYP.ERR.value()));
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			for (RsltR rsltR : bridge.down0()) {
				rsltR.check(true);
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
		callMG_MGBDL0320_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0030(MCEventInfo info) {
		RsltR rsltR = RsltTable.getSelectedMCRow();

		if (isNull(rsltR)) {
			dialog(msgNoSelectedRow());

			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0030");

		aso.putCnd(crtOpenMGBDP0030(aso, rsltR));
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
		copyRow(RsltTable);
		setBtnMode();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0320_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0320_Del01();
	}

	// ///////////////////// INIT /////////////////////////////////////////////
	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
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

	@Override
	protected void listInit() {
		super.listInit();

		getRslt_st_ym_ListPutter().putBind(YmCols.$i_st_ym, columnRslt_term);
		getRslt_st_ym_ListPutter().putBind(YmCols.$i_end_ym, columnRslt_term_end_ym);
		getRslt_end_ym_ListPutter().putBind(YmCols.$i_st_ym, columnRslt_term);
		getRslt_end_ym_ListPutter().putBind(YmCols.$i_end_ym, columnRslt_term_end_ym);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnRslt_term.addLCListener(this);
	}

	// ///////////////////// Validation Change ////////////////////////////////
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		// FIX（登録直後）、REF（参照種別）では、クリア確認出さない
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

	/** 更新（登録・更新ステータス、削除（検索後）ステータス）ステータスであるかどうかを返す */
	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	/** 登録・更新ステータスであるかどうかを返す */
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	/** 削除（検索後）ステータスであるかどうかを返す */
	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	// ///////////////////// Notification Change //////////////////////////////
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

	// ///////////////////// List Change //////////////////////////////
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == columnRslt_term) {
			doRslt_term_LC(info);
		}
	}

	protected void doRslt_term_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());

		if (!isNull(rsltR.st_ym())) {
			setValueEx(columnRslt_st_ym, info.getEventIndex(), rsltR.term());
		}

		if (!isNull(rsltR.end_ym())) {
			setValueEx(columnRslt_end_ym, info.getEventIndex(), rsltR.term());
		}
	}

	@Override
	public void doRslt_calc_grp_cd_LC(MCEventInfo info) {
		super.doRslt_calc_grp_cd_LC(info);

		RsltR rsltR = getRsltL().get(info.getEventIndex());

		if (isNull(info.getNewValue())) {
			setValueEx(columnRslt_st_ym, info.getEventIndex(), null);
		}
		else {
			setValueEx(columnRslt_st_ym, info.getEventIndex(), rsltR.term());
			setEndYm(info, columnRslt_end_ym);
		}
	}

	@Override
	public void doRslt_st_ym_LC(MCEventInfo info) {
		super.doRslt_st_ym_LC(info);

		RsltR rsltR = getRsltL().get(info.getEventIndex());

		if (isNull(info.getNewValue())) {
			setValueEx(columnRslt_end_ym, info.getEventIndex(), null);
		}
		else {
			if (!isNull(rsltR.end_ym())) {
				setValueEx(columnRslt_end_ym, info.getEventIndex(), rsltR.st_ym());
			}
		}
	}

	protected void setEndYm(MCEventInfo info, MCColumnConfig colConf) {
		if (isEnableSetValue(info, colConf)) {
			// 何もしない
		}
		else {
			setValueEx(colConf, info.getEventIndex(), null);
		}
	}

	protected boolean isEnableSetValue(MCEventInfo info, MCColumnConfig colConf) {
		int index = info.getEventIndex();

		if (colConf == columnRslt_end_ym) {
			return colConf.checkValue(getRsltL().get(index).end_ym(), index);
		}
		else {
			return false;
		}
	}

	// ///////////////////// ListLogic ////////////////////////////////////////
	@Override
	public MCList getRslt_end_ym(MCRow row, MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());

		if (isNull(rsltR.max_mons())) {
			setValueEx(columnRslt_max_mons, info.getEventIndex(), MCNumber.ZERO);
		}

		if (!rsltR.max_mons().isZero()) {
			row.setDate(YmCols.$i_end_ym,
					row.getDate(RsltR.$st_ym).addMonth(rsltR.max_mons()));
		}

		return super.getRslt_end_ym(row, info);
	}

	// ///////////////////// Status ///////////////////////////////////////////
	/** 検索前ステータスに設定する */
	protected void setSrchStatus() {
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

	/** 検索後ステータスに設定する */
	protected void setRefStatus() {
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

	protected void setStatusCom() {
		setStatusColumn();
		setFocus();
		fillSpace();
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

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setBtnMode() {
		RsltR rsltR = RsltTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (rsltR == null) {
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行と空行のみ、行削除可能
				if (!isNull(rsltR.upd_cntr())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}

				// 現在のステータスにおける実装仕様書のモードとする場合は、setDefaultModeメソッドを呼ぶ
				setDefaultMode(Btn_rcopy);
			}
		}

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBDP0030, isEnableBtn_open_MGBDP0030(rsltR));
	}

	protected boolean isEnableBtn_open_MGBDP0030(RsltR rsltR) {
		if (rsltR == null) {
			return false;
		}

		return !isNullOr(rsltR.term(), rsltR.calc_grp_cd());
	}

	//参照（検索前）
	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();

		setStatusCom();
	}

	// 削除（検索前）
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();

		setStatusCom();
	}

	// 登録・更新
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		setStatusCom();
	}

	// ファイル取り込み
	@Override
	public void setINSStatus() {
		super.setINSStatus();

		setStatusCom();
	}

	// 参照（検索後）
	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setStatusCom();
	}

	// 削除（検索後）
	@Override
	public void setDELStatus() {
		super.setDELStatus();

		setStatusCom();
	}

	// 登録後
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();

		setStatusCom();
	}

	// ///////////////////// Screen Open ///////////////////////////////////////
	protected mcframe.clientMGBD.MGBDP0030.CndR crtOpenMGBDP0030(
			MAUCP_AppScreenOpener aso, RsltR rsltR) {
		mcframe.clientMGBD.MGBDP0030.MGBDP_ArgSrch panel = (mcframe.clientMGBD.MGBDP0030.MGBDP_ArgSrch) aso
				.getPanel();
		mcframe.clientMGBD.MGBDP0030.CndR toCndR = mcframe.clientMGBD.MGBDP0030.CndR
				.create();

		toCndR.ope(panel.Cnd_ope_REF.getActionCommand());
		toCndR.term(rsltR.term());
		toCndR.calc_grp_cd(rsltR.calc_grp_cd());
		toCndR.st_ym(rsltR.st_ym());
		toCndR.end_ym(rsltR.end_ym());
		toCndR.rmrks(rsltR.rmrks());

		toCndR.fix_true_flg(true);
		toCndR.fix_false_flg(true);
		toCndR.non_del_true_flg(true);
		toCndR.non_del_false_flg(true);
		toCndR.calc_err_true_flg(true);
		toCndR.calc_err_false_flg(true);

		return toCndR;
	}

	// ///////////////////// File Input ///////////////////////////////////////
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

		// ファイル入力後の処理
		if (Cnd_ope_UPD.isSelected()) {
			callMG_MGBDL0320_Imp01();
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

	// ///////////////////// CellConfig ///////////////////////////////////////
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
			RsltR rsltR = (RsltR) table.getBaseTable().getRow(index);

			if (column == columnRslt_end_ym && isNull(rsltR.st_ym())) {
				return MCMode.READ_ONLY;
			}

			if (MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (!isNull(rsltR.upd_cntr()) && isKeyColumn(column, rsltR)) {
				return MCMode.READ_ONLY;
			}

			return super.getPriorMode(index, column, table);
		}
	}

	// ///////////////////// IfListRegPanel ///////////////////////////////////
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}