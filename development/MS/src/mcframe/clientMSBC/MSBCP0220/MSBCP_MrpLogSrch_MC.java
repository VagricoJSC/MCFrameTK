package mcframe.clientMSBC.MSBCP0220;

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
import static mcframe.commonFSUA.FSUAC0010.FSUAC_List.GpBatchGrpCols;
import mcframe.commonFS.constant.FSC_MODULE_ID;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_MrpLogSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MrpLogSrch_MC extends MSBCP_MrpLogSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MrpLogSrch_MC() {
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
	public MSBCP_MrpLogSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0220_Srch01Caller<P extends MSBCP_MrpLogSrch, B extends MS_MSBCL0220_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0220_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();
			setValueEx(Msg_msg, null);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_log_time_fr, Cnd_log_time_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setDELStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	/**
	 * [MS_MSBCL0220_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0220_Del01Caller<P extends MSBCP_MrpLogSrch, B extends MS_MSBCL0220_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL0220_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_DStatus();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0220_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0220_Srch01().execDL();
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
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL0220_Del01();
	}

	// --------------------画面起動時の定型処理start-----------------
	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		// テキストフィールドを折り返し設定にする
		Msg_msg.setLineWrap(true);
	}

	// --------------------画面起動時の定型処理end-------------------

	// --------------------イベント処理start--------------------------
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			setValueEx(Msg_msg, null);
		}
		else {
			setValueEx(Msg_msg, r.msg());
		}
	}

	// --------------------イベント処理end-------------------------

	// --------------------モード設定start-------------------------
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		// N/A
	}

	protected void setFocus() {
		if(getStatus() == DEL && getRsltL().size() > 0) {
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			CndPanel.focusFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	// --------------------モード設定end---------------------------

	// --------------------リストロジック設定start---------------------------
	protected static String MRP_M_ID = FSC_MODULE_ID.SCM.value();
	protected static String MRP_L_ID = "MSBCB0010";
	protected static String MRP_O_ID = "MrpExecute_Upd01";
	protected static String P_MRP_L_ID = "MSBCB0020";
	protected static String P_MRP_O_ID = "PrcdMrpExecute_Upd01";
	public MCList getCnd_gp_batch_grp_cd(MCRow row, MCEventInfo info){
		row.addStringColumn(GpBatchGrpCols.$i_module_id, MRP_M_ID);
		row.addStringColumn(GpBatchGrpCols.$i_logic_id, MRP_L_ID);
		row.addStringColumn(GpBatchGrpCols.$i_operation_id, MRP_O_ID);

		MCList<MCRow> l = MCList.create(MCRow.class);
		l.addAll(super.getCnd_gp_batch_grp_cd(row, info));
		
		row.addStringColumn(GpBatchGrpCols.$i_logic_id, P_MRP_L_ID);
		row.addStringColumn(GpBatchGrpCols.$i_operation_id, P_MRP_O_ID);
		l.addAll(super.getCnd_gp_batch_grp_cd(row, info));
		
		return l.distinctNE(GpBatchGrpCols.$o_gp_batch_grp_cd, GpBatchGrpCols.$o_gp_batch_grp_nm);
	}

	// --------------------リストロジック設定end---------------------------
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}