package mcframe.clientMSBD.MSBDP0220;

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
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcSlipSendIfSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcSlipSendIfSrch_MC extends MSBDP_PurcSlipSendIfSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcSlipSendIfSrch_MC() {
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
	public MSBDP_PurcSlipSendIfSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0220_Srch01Caller<P extends MSBDP_PurcSlipSendIfSrch, B extends MS_MSBDL0220_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0220_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_ac_ym_fr, Cnd_ac_ym_to));
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
			msgList.addAll(checkAtLeastOne(ReSndPanel));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatus();
		}
	}

	/**
	 * [MS_MSBDL0220_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0220_Upd01Caller<P extends MSBDP_PurcSlipSendIfSrch, B extends MS_MSBDL0220_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0220_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}
	}

	/**
	 * [MS_MSBDL0220_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0220_Upd02Caller<P extends MSBDP_PurcSlipSendIfSrch, B extends MS_MSBDL0220_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0220_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBDL0220_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MBBEP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBEP0080(MCEventInfo info) {
		MCList<RsltR> rows = RsltTable.getSelectedMCRows();
		String purcSlipNo = null;
		if (isNull(rows) || rows.isEmpty()) {
			dialog(msgNoSelectedRow());
			return;
		}
		else {
			List<String> slsSlipNoList = rows.groupBy(RsltR.$purc_slip_no).getString(RsltR.$purc_slip_no);
			purcSlipNo = MCStringUtil.arrayValueJoin(slsSlipNoList.toArray(new String[0]));
		}

		MCRow bindRow = MCRow.create();
		bindRow.addStringColumn(RsltR.$purc_slip_no, purcSlipNo);
		bindRow.addBooleanColumn("_not_init_flg", true);
		bindRow.addBooleanColumn("_doSrch_flg", true);
		openPanel("MB", "MBBEP0080", T2, bindRow, MAC_IF_PROC_TYP.upd_if_tbl(MAC_IF_PROC_TYP.AC_PURC_SLIP_SEND.value()));
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
	 * Panel[Btn]のボタン[resnd]の押下時の処理
	 */
	@Override
	public void doBtn_resnd(MCEventInfo info) {
		callMS_MSBDL0220_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0220_Upd02();
	}

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
		setValueEx(Cnd_ope_Group, Cnd_ope_RESND.getActionCommand());
		setValueEx(Cnd_re_snd_flg, true);
		setValueEx(Cnd_not_re_snd_flg, false);
		setValueEx(Cnd_new_flg, true);
		setValueEx(Cnd_snd_to_err_flg, true);
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (isSame(getStatus(), SRCH_RESND) || isSame(getStatus(), SRCH_UPD)
					|| isSame(getStatus(), SRCH_REF) || isStatusNone(getRsltL())) {
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

		setOpeTyp();
		clearContainers(getRsltL());
		setStatus();
	}

	protected void setOpeTyp(){

		if (Cnd_ope_UPD.isSelected() || Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_not_re_snd_flg, true);
		}
		else {
			setValueEx(Cnd_not_re_snd_flg, false);
		}

		if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_new_flg, false);
			setValueEx(Cnd_snd_to_err_flg, false);
		}
		else {
			setValueEx(Cnd_new_flg, true);
			setValueEx(Cnd_snd_to_err_flg, true);
		}

		setValueEx(Cnd_re_snd_flg, true);
	}

	@Override
	public void setSRCH_RESNDStatus() {
		super.setSRCH_RESNDStatus();
		setFocus();
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		setFocus();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setFocus();
	}

	protected void setStatus() {
		if (Cnd_ope_RESND.isSelected()) {
			setSRCH_RESNDStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
		}
		else {
			setSRCH_REFStatus();
		}
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_RESND.isSelected()) {
			setRESNDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else {
			setREFStatus();
			RsltTable.selectLeftmostColumn(0);
		}

		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setFocus() {

		if(getRsltL().size() > 0) {
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			Ctrl_ctrl_PPanel.expand(true);
			CndPanel.focusFirstComponent();
		}
	}

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
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			return super.getPriorMode(index, column, table);
		}
	}

}