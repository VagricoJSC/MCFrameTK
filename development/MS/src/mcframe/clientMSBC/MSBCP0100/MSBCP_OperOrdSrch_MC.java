package mcframe.clientMSBC.MSBCP0100;

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
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_OperOrdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_OperOrdSrch_MC extends MSBCP_OperOrdSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_OperOrdSrch_MC() {
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
	public MSBCP_OperOrdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0100_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0100_Imp01Caller<P extends MSBCP_OperOrdSrch, B extends MS_MSBCL0100_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBCL0100_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (hasNg()) {
				setFIX_IStatus();
			}
			else {
				setINSStatus();
				Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
			}
			// ファイル入力後には、正常終了か異常終了かに関わらず一覧を広げる
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
		protected void handleMCEx(MCException ex) {
			super.handleMCEx(ex);
			setFIX_IStatus();
		}
	}

	/**
	 * [MS_MSBCL0100_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0100_Upd01Caller<P extends MSBCP_OperOrdSrch, B extends MS_MSBCL0100_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0100_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			bridge.up0().setAll(getRsltL().subList(r -> r.check()));
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			setFIX_UStatus();
			setButtonMode();
		}

		@Override
		protected void show() {
			super.show();

			getRsltL().subList(r -> MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())).subList(r -> r.check()).forEach(r -> {
				r.check(false);
			});
		}
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
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL0100_Upd01();
	}

	/**
	 * [MS_MSBCL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0100_Srch01Caller<P extends MSBCP_OperOrdSrch, B extends MS_MSBCL0100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0100_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkAtLeastOne(OperOrdStsPanel));
			msgList.addAll(checkAtLeastOne(OrdRcvPanel));
			msgList.addAll(checkAtLeastOne(OrdSndPanel));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_st_schd_dt_fr, Cnd_mfg_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_end_schd_dt_fr, Cnd_mfg_end_schd_dt_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		OperOrdStsPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0100_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0100_Srch01().execDL();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0080(MCEventInfo info) {
		MAUCP_AppScreenOpener screenOpener = createScreenOpener("MSBCP0080", mcframe.clientMSBC.MSBCP0080.CndR.create());
		if (screenOpener != null) screenOpener.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0090(MCEventInfo info) {
		MAUCP_AppScreenOpener screenOpener = createScreenOpener("MSBCP0090", mcframe.clientMSBC.MSBCP0090.CndR.create());
		if (screenOpener != null) screenOpener.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0060(MCEventInfo info) {
		MAUCP_AppScreenOpener screenOpener = createScreenOpener("MSBCP0060", mcframe.clientMSBC.MSBCP0090.CndR.create());
		if (screenOpener != null) screenOpener.show();
	}

	protected MAUCP_AppScreenOpener createScreenOpener(String screenId, MCRow cndR) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		MAUCP_AppScreenOpener screenOpener = new MAUCP_AppScreenOpener("MS", screenId);
		cndR.setStringNE("itm_ord_no", r.itm_ord_no());
		screenOpener.runValueInit();
		screenOpener.putCnd(cndR);
		screenOpener.putSearchAction();
		return screenOpener;
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		MCList<RsltR> rsltL = getRsltL();
		int idx = info.getEventIndex();
		if (rsltL.size() > 0 && idx > -1) {
			RsltR me = rsltL.get(idx);
			if (nc == columnRslt_check || nc == columnRslt_oper_ord_sts_typ || nc == columnRslt_st_schd_dt || nc == columnRslt_st_schd_hm || nc == columnRslt_end_schd_dt || nc == columnRslt_end_schd_hm || nc == columnRslt_oper_schd_qty
					|| nc == columnRslt_oper_rsrc || nc == columnRslt_rmrks || nc == columnRslt_sub_char1 || nc == columnRslt_sub_char2 || nc == columnRslt_sub_char3) {

				for (RsltR row : rsltL.subList(r -> isSame(r.itm_ord_no(), me.itm_ord_no()))) {
					row.setStatus(Status.MODIFY);
					row.check(!(nc == columnRslt_check) || me.check());
				}
			}
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable && !Cnd_ope_IMP.isSelected()) doBtn_open_MSBCP0080(null);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		if (Cnd_ope_UPD.isSelected()) setUPDStatus();
		else if (Cnd_ope_REF.isSelected()) setREFStatus();
		else if (Cnd_ope_IMP.isSelected()) setIMPStatus();
		initCndOrdSts();
		Ctrl_ctrl_PPanel.expand(!Cnd_ope_IMP.isSelected());
		setButtonMode();
	}

	@Override
	public void doCnd_gi_schd_flg_NC(MCEventInfo info) {
		boolean giSchd = Cnd_gi_schd_flg.getValue();
		Cnd_gi_schd_dt_fr.setMode(giSchd ? MCMode.ENABLE : MCMode.READ_ONLY);
		Cnd_gi_schd_dt_to.setMode(giSchd ? MCMode.ENABLE : MCMode.READ_ONLY);
		if (!giSchd) {
			Cnd_gi_schd_dt_fr.clear();
			Cnd_gi_schd_dt_to.clear();
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setButtonMode();
		setRCopyBtnMode();
	}

	protected void setButtonMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		MCButton[] searchButtons = {
				Ctrl_ctrl_PPanel.Ope_srch, RPnl_dwnld
		};
		for (MCButton button : searchButtons) {
			button.setMode(isSearchable() ? MCMode.ENABLE : MCMode.DISABLE);
		}
		Btn_upd.setMode(isUpdatable(r) ? MCMode.ENABLE : MCMode.DISABLE);
		MCButton[] changeButtonsByTable = {
				Btn_open_MSBCP0080, Btn_open_MSBCP0090, Btn_open_MSBCP0060
		};
		for (MCButton button : changeButtonsByTable) {
			button.setMode(!isSame(getStatus(), IMP) && !isSame(getStatus(), FIX_I) && !isNull(r) ? MCMode.ENABLE : MCMode.DISABLE);
		}
		Btn_rdel.setMode(isDeletable(r) ? MCMode.ENABLE : MCMode.DISABLE);
		Btn_rcopy.setMode(!isSame(getStatus(), IMP) && !isSame(getStatus(), FIX_I) && !isNull(r) ? MCMode.ENABLE : MCMode.DISABLE);
	}
	/** 行コピーボタンのモード制御を行う。 */
	protected void setRCopyBtnMode() {
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
		RsltR r = RsltTable.getSelectedMCRow();
		if (!isCopyableRow(r)) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			Btn_rcopy.setMode(MCMode.ENABLE);
		}
	}
	/** 行コピー可能かどうかを返す。 */
	protected boolean isCopyableRow(RsltR r) {
		if (isNull(r)) {
			return true;
		}

		if (!isNull(r.ext_oper_ord_no())) {
			//外部受信した工程オーダは行コピー不可
			return false;
		}
		return true;
	}

	protected boolean isSearchable() {
		return !Cnd_ope_IMP.isSelected();
	}

	protected boolean isUpdatable(RsltR r) {
		return !isNull(r) && !isSame(getStatus(), REF) && !isSame(getStatus(), FIX_I);
	}

	protected boolean isDeletable(RsltR r) {
		if (isNull(r)) return false;
		if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) return false;
		String screenSts = getStatus();
		if (!isSame(screenSts, UPD)) return false;
		if (r.isStatusDelete()) return true;
		String itmSts = r.itm_ord_sts_typ();
		if (!MSC_ITM_ORD_STS_TYP.isOPN(itmSts) && !MSC_ITM_ORD_STS_TYP.isSAV(itmSts)) return false;
		MCList<RsltR> l = exceptDeleteAndEmpty(getRsltL());
		if (l.subList(new String[] {
				RsltR.$itm_ord_no, RsltR.$oper_cd, RsltR.$oper_seq
		}, new Comparable[] {
				r.itm_ord_no(), r.oper_cd(), r.oper_seq()
		}).size() > 1) {
			return true;
		}
		return false;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		initCndOrdSts();
		initCndPlnIfTgt();
		doCnd_gi_schd_flg_NC(null);
	}

	protected void initCndOrdSts() {
		setValueEx(Cnd_opn_flg, true);
		setValueEx(Cnd_sav_flg, true);
		setValueEx(Cnd_fix_flg, !Cnd_ope_UPD.isSelected());
		setValueEx(Cnd_part_inst_flg, !Cnd_ope_UPD.isSelected());
		setValueEx(Cnd_inst_flg, !Cnd_ope_UPD.isSelected());
		setValueEx(Cnd_cmpl_flg, !Cnd_ope_UPD.isSelected());
	}
	protected void initCndPlnIfTgt() {
		setValueEx(Cnd_ord_rcv_tgt_flg, true);
		setValueEx(Cnd_not_ord_rcv_tgt_flg, true);
		setValueEx(Cnd_ord_snd_tgt_flg, true);
		setValueEx(Cnd_not_ord_snd_tgt_flg, true);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnRslt_oper_schd_qty.addNCListener(this);
		columnRslt_st_schd_dt.addNCListener(this);
		columnRslt_st_schd_hm.addNCListener(this);
		columnRslt_end_schd_dt.addNCListener(this);
		columnRslt_end_schd_hm.addNCListener(this);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_oper_schd_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_dec_place);
		Rslt_oper_unit_schd_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_dec_place);
		Rslt_oper_inst_schd_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_dec_place);
		Rslt_oper_act_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_dec_place);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	@Override
	public MCList getRslt_oper_ord_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, new MSC_OPER_ORD_STS_TYP[] {
				MSC_OPER_ORD_STS_TYP.OPN, MSC_OPER_ORD_STS_TYP.SAV
		});
		return super.getRslt_oper_ord_sts_typ(row, info);
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> l = super.getNotInheritCols(type, cont);
		if (cont == getRsltL()) {
			l.add(RsltR.$oper_ord_no);
			l.add(RsltR.$oper_ord_sts_typ);
			l.add(RsltR.$oper_ord_sts_typ_nm);
		}
		return l;
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(new ItmOperTableCellConfig());
	}

	public class ItmOperTableCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = getRsltL().get(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) return MCMode.READ_ONLY;

			if (column == columnRslt_check || column == columnRslt_oper_ord_sts_typ || column == columnRslt_st_schd_dt || column == columnRslt_st_schd_hm || column == columnRslt_end_schd_dt || column == columnRslt_end_schd_hm || column == columnRslt_oper_schd_qty
					|| column == columnRslt_rmrks || column == columnRslt_sub_char1 || column == columnRslt_sub_char2 || column == columnRslt_sub_char3) {
				String itmSts = r.itm_ord_sts_typ();
				if (!MSC_ITM_ORD_STS_TYP.isOPN(itmSts) && !MSC_ITM_ORD_STS_TYP.isSAV(itmSts)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	//--------------------------------------
	// IfListRegPanelの実装
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	//--------------------------------------
	//ファイル入力の実装
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_IMP.isSelected();
		}
		return super.useFileIn(table);
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBCL0100_Imp01();
	}

	protected void fillSpace() {
		if (Cnd_ope_IMP.isSelected()) {
			RsltTable.fillSpace();
		}
	}

}