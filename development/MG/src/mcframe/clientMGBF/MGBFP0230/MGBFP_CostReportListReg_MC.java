package mcframe.clientMGBF.MGBFP0230;

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
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMGUB.MGUBP0010.*;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_CostReportListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_CostReportListReg_MC extends MGBFP_CostReportListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_CostReportListReg_MC() {
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
	public MGBFP_CostReportListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MGBFP0240]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0240(MCEventInfo info) {
		RsltR rsltR = RsltTable.getSelectedMCRow();

		if (isNull(rsltR)) {
			dialog(msgNoSelectedRow());

			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0240");

		aso.putCnd(crtOpenMGBFP0240(rsltR));
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MABGP0420]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0420(MCEventInfo info) {
		RsltR rsltR = RsltTable.getSelectedMCRow();

		if (isNull(rsltR)) {
			dialog(msgNoSelectedRow());

			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0420");

		aso.putCnd(crtOpenMABGP0420(rsltR));
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MABGP0400]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0400(MCEventInfo info) {
		RsltR rsltR = RsltTable.getSelectedMCRow();

		if (isNull(rsltR)) {
			dialog(msgNoSelectedRow());

			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0400");

		aso.putCnd(crtOpenMABGP0400(rsltR));
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}

	/**
	 * [MG_MGBFL0230_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0230_Srch01Caller<P extends MGBFP_CostReportListReg, B extends MG_MGBFL0230_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0230_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			msgList.addAll(panel.checkAtLeastOne(Cnd_unmake_flg, Cnd_made_flg));
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
	 * [MG_MGBFL0230_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0230_Upd01Caller<P extends MGBFP_CostReportListReg, B extends MG_MGBFL0230_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBFL0230_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}

		@Override
		protected void setMode() {
			super.setMode();

			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBFL0230_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0230_Del01Caller<P extends MGBFP_CostReportListReg, B extends MG_MGBFL0230_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBFL0230_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0230_Srch01();
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBFL0230_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBFL0230_Del01();
	}

	// ///////////////////// INIT /////////////////////////////////////////////
	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
		setDefaultFlg();
	}

	protected void setDefaultFlg() {
		getCndR().made_flg(true);

		if (isSrchDelStatus() || isDelStatus()) {
			getCndR().unmake_flg(false);
		}
		else if (isSrchRefStatus() || isSrchUpdStatus()) {
			getCndR().unmake_flg(true);
		}
	}

	protected boolean isSrchRefStatus() {
		return isSame(getStatus(), SRCH_REF);
	}

	protected boolean isSrchUpdStatus() {
		return isSame(getStatus(), SRCH_UPD);
	}

	protected boolean isSrchDelStatus() {
		return isSame(getStatus(), SRCH_DEL);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		CndPanel.focusFirstComponent();
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
		setDefaultFlg();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		setBtnMode();
	}

	// ///////////////////// DoubleClick Event //////////////////////////////
	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);

		if (dc == RsltTable) {
			doRslt_DC(info);
		}
	}

	public void doRslt_DC(MCEventInfo info) {
		doBtn_open_MGBFP0240(info);
	}

	// ///////////////////// ListLogic ////////////////////////////////////////
	@Override
	public MCList getCnd_rpt_ptn_cd(MCRow row, MCEventInfo info) {
		row.setStringNE(RptPtnInCalcRptPtnCols.$i_calc_grp_cd, getCndR().calc_grp_cd());

		return super.getCnd_rpt_ptn_cd(row, info);
	}

	// ///////////////////// Status ///////////////////////////////////////////
	/** 検索前ステータスに設定する */
	protected void setSrchStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
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
		setBtnMode();
		setCalcNoMode();
	}

	protected void setStatusColumn() {
		RsltTable.setStatusColumnVisible(false);
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	/** 検索枠の原価計算ＮＯ入力可否制御 */
	protected void setCalcNoMode() {
		if (isNull(getCndR().calc_grp_cd())) {
			Cnd_calc_no.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_calc_no.setMode(MCMode.REQUIRED);
		}
	}

	protected void setBtnMode() {
		RsltR rsltR = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBFP0240, isEnableBtn_open_MGBFP0240(rsltR));
		setBtnModeByFlg(Btn_open_MABGP0420, isEnableBtn_open_MABGP0420(rsltR));
		setBtnModeByFlg(Btn_open_MABGP0400, isEnableBtn_open_MABGP0400(rsltR));
	}

	protected boolean isEnableBtn_open_MGBFP0240(RsltR rsltR) {
		if (rsltR == null) {
			return false;
		}

		return true;
	}

	protected boolean isEnableBtn_open_MABGP0420(RsltR rsltR) {
		if (rsltR == null) {
			return false;
		}

		return true;
	}

	protected boolean isEnableBtn_open_MABGP0400(RsltR rsltR) {
		if (rsltR == null) {
			return false;
		}

		return true;
	}

	//参照（検索前）
	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();

		setStatusCom();
	}

	// 作成（検索前）
	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();

		setStatusCom();
	}

	// 削除（検索前）
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();

		setStatusCom();
	}

	// 作成（検索後）
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

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
	protected mcframe.clientMGBF.MGBFP0240.CndR crtOpenMGBFP0240(RsltR rsltR) {
		mcframe.clientMGBF.MGBFP0240.CndR toCndR = mcframe.clientMGBF.MGBFP0240.CndR
				.create();

		toCndR.calc_grp_cd(rsltR.calc_grp_cd());
		toCndR.calc_no(rsltR.calc_no());
		toCndR.ym(rsltR.ym());
		toCndR.rpt_ptn_cd(rsltR.rpt_ptn_cd());
		toCndR.rpt_key_cd(rsltR.rpt_key_cd());

		return toCndR;
	}

	protected mcframe.clientMABG.MABGP0420.CndR crtOpenMABGP0420(RsltR rsltR) {
		mcframe.clientMABG.MABGP0420.MABGP_RptConfReg panel = mcframe.clientMABG.MABGP0420.MABGP_RptConfReg
				.create();
		mcframe.clientMABG.MABGP0420.CndR toCndR = mcframe.clientMABG.MABGP0420.CndR
				.create();

		toCndR.ope(panel.Cnd_ope_REF.getActionCommand());
		toCndR.rpt_ptn_cd(rsltR.rpt_ptn_cd());

		return toCndR;
	}

	protected mcframe.clientMABG.MABGP0400.CndR crtOpenMABGP0400(RsltR rsltR) {
		mcframe.clientMABG.MABGP0400.MABGP_RptKeyConfReg panel = mcframe.clientMABG.MABGP0400.MABGP_RptKeyConfReg
				.create();
		mcframe.clientMABG.MABGP0400.CndR toCndR = mcframe.clientMABG.MABGP0400.CndR
				.create();

		toCndR.ope(panel.Cnd_ope_REF.getActionCommand());
		toCndR.rpt_key_cd(rsltR.rpt_key_cd());

		return toCndR;
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

			if (MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())) {
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