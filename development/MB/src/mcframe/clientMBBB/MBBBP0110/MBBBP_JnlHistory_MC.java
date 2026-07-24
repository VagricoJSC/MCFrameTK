package mcframe.clientMBBB.MBBBP0110;

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


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.resource.MCConst;
import static mcframe.commonFX.notice.FX_Msg.*;
import java.io.File;
import mcframe.clientCore.requester.MCDownloader;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBBP_JnlHistory"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBBP_JnlHistory_MC extends MBBBP_JnlHistory_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_JnlHistory_MC() {
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
	public MBBBP_JnlHistory_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBBL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Srch01Caller<P extends MBBBP_JnlHistory, B extends MB_MBBBL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBBL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCustom(msgList);
		}

		protected void checkForCallStackCustom(MCMessageList mL) {
			mL.addAll(checkBeforeAfter(Cnd_ac_ym_fr, Cnd_ac_ym_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUpdStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

	}
	/**
	 * [MB_MBBBL0110_Ins01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Ins01Caller<P extends MBBBP_JnlHistory, B extends MB_MBBBL0110_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBBL0110_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}
	/**
	 * [MB_MBBBL0110_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Upd01Caller<P extends MBBBP_JnlHistory, B extends MB_MBBBL0110_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBBL0110_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}
	/**
	 * [MB_MBBBL0110_Del01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Del01Caller<P extends MBBBP_JnlHistory, B extends MB_MBBBL0110_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MB_MBBBL0110_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}
	/**
	 * [MB_MBBBL0110_Del02]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Del02Caller<P extends MBBBP_JnlHistory, B extends MB_MBBBL0110_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MB_MBBBL0110_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMB_MBBBL0110_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MBBBP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBBP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MBBBP0120(r);
	}
	protected void doBtn_open_MBBBP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBBP0120");
		mcframe.clientMBBB.MBBBP0120.CndR to = mcframe.clientMBBB.MBBBP0120.CndR.create();
		to.jnl_grp_no(r.jnl_grp_no());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MBBBP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBBP0130(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MBBBP0130(r);
	}
	protected void doBtn_open_MBBBP0130(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBBP0130");
		mcframe.clientMBBB.MBBBP0130.CndR to = mcframe.clientMBBB.MBBBP0130.CndR.create();
		to.jnl_grp_no(r.jnl_grp_no());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MBBBP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBBP0140(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MBBBP0140(r);
	}
	protected void doBtn_open_MBBBP0140(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBBP0140");
		mcframe.clientMBBB.MBBBP0140.CndR to = mcframe.clientMBBB.MBBBP0140.CndR.create();
		to.jnl_grp_no(r.jnl_grp_no());
		aso.putCnd(to);
		aso.runValueInit();
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
	 * Panel[Btn]のボタン[upd_sd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sd(MCEventInfo info) {
		callMB_MBBBL0110_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd_rmrks]の押下時の処理
	 */
	@Override
	public void doBtn_upd_rmrks(MCEventInfo info) {
		callMB_MBBBL0110_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMB_MBBBL0110_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_can]の押下時の処理
	 */
	@Override
	public void doBtn_del_can(MCEventInfo info) {
		callMB_MBBBL0110_Del02();
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());

		MCDate acYm = getAcYm(getToday(), getCo().ac_cl_day(), getCo().ac_cl_mon_base());
		getCndR().ac_ym_fr(acYm);
		getCndR().ac_ym_to(acYm);
	}

	// -----------------------------------------------
	// event

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (isUpdStatus() && !isUpdContainerStatusNone()) {
			return confirmRegDataClear();
		}
		return super.doCnd_ope_VC(info);
	}

	protected boolean isUpdStatus() {
		String sts = getStatus();
		return isSame(sts, UPD_SD)
				|| isSame(sts, UPD_RMRKS)
				|| isSame(sts, DEL)
				|| isSame(sts, DEL_CAN);
	}

	protected boolean isUpdContainerStatusNone() {
		return getRsltL().isStatusNone();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		RsltTable.clear();
		setSrchStatus();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	protected void setBtnMode() {
		if (isUpdStatus()) {
			RsltR select = RsltTable.getSelectedMCRow();
			if (select == null) {
				Btn_open_MBBBP0130.setMode(MCMode.DISABLE);
				Btn_open_MBBBP0120.setMode(MCMode.DISABLE);
				Btn_open_MBBBP0140.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MBBBP0130);
				setDefaultMode(Btn_open_MBBBP0120);
				setDefaultMode(Btn_open_MBBBP0140);
			}
		}
	}

	// -----------------------------------------------
	// status
	/** 検索前ステータス変更 */
	protected void setSrchStatus() {
		if (Cnd_ope_SD.isSelected()) {
			setSRCH_SDStatus();
		}
		else if (Cnd_ope_CAN.isSelected()) {
			setSRCH_CANStatus();
		}
		else {
			setSRCHStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	/** 検索後ステータス変更 */
	protected void setUpdStatus() {
		if (Cnd_ope_SD.isSelected()) {
			setUPD_SDStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setUPD_RMRKSStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_CAN.isSelected()) {
			setDEL_CANStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	/** 更新後ステータス変更 */
	protected void setFixStatus() {
		setFIXStatus();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
		setDataTyp();
	}

	@Override
	public void setSRCH_SDStatus() {
		super.setSRCH_SDStatus();
		CndPanel.focusFirstComponent();
		setDataTyp();
	}

	@Override
	public void setSRCH_CANStatus() {
		super.setSRCH_CANStatus();
		CndPanel.focusFirstComponent();
		setDataTyp();
	}

	protected void setDataTyp() {
		if (Cnd_ope_SD.isSelected()) {
			setValueEx(Cnd_data_typ, MAC_DATA_TYP.JNL_MK.value());
		}
		else if (Cnd_ope_CAN.isSelected()) {
			setValueEx(Cnd_data_typ, MAC_DATA_TYP.AC_MK.value());
		}
		else {
			setValueEx(Cnd_data_typ, null);
		}
	}

	@Override
	public void setUPD_SDStatus() {
		super.setUPD_SDStatus();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setUPD_RMRKSStatus() {
		super.setUPD_RMRKSStatus();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setDEL_CANStatus() {
		super.setDEL_CANStatus();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		CndPanel.focusFirstComponent();
	}

	// -----------------------------------------------
	// cellconfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
//			if (RsltTable == table) {
//				RsltR r = getRsltL().get(index);
//				if (columnRslt_check == column) {
//					if (Cnd_ope_DEL.isSelected()) {
//						if (MAC_DATA_TYP.isAC_MK(r.data_typ()) && !r.jnl_del_flg()) {
//							return MCMode.READ_ONLY;
//						}
//					}
//				}
//			}
			return super.getPriorMode(index, column, table);
		}

	}

	@Override
	public MCMessage msgCancelConfirm() {
		if (Cnd_ope_CAN.isSelected()) {
			return super.msgCancelConfirm();
		}
		else {
			return new MCMessage(FXBAP0005);
		}
	}
	@Override
	public MCMessage msgCanceled() {
		if (Cnd_ope_CAN.isSelected()) {
			return super.msgCanceled();
		}
		return new MCMessage(FXBAP0022);
	}

}