package mcframe.clientMSBB.MSBBP1250;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5400.*;

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
 * 画面"MSBBP_DlvInstRcptListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_DlvInstRcptListReg_MC extends MSBBP_DlvInstRcptListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_DlvInstRcptListReg_MC() {
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
	public MSBBP_DlvInstRcptListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1250_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1250_Imp01Caller<P extends MSBBP_DlvInstRcptListReg, B extends MS_MSBBL1250_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBBL1250_Imp01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			setDayWeekTyp(getRsltL());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (hasErr()) {
				setFIXStatus();
			}
			else {
				setUPDStatus();
			}
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		protected boolean hasErr() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				if (!MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ()) && !r.after_exec_flg()) {
					r.check(true);
					if (!isNull(r.dlv_inst_rcpt_no())) {
						r.setStatus(Status.MODIFY);
					}
					else {
						r.setStatus(Status.CREATE);
					}
				}
				else {
					r.setStatus(Status.NONE);
				}
			}
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIXStatus();
		}
	}

	/**
	 * [MS_MSBBL1250_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1250_Srch01Caller<P extends MSBBP_DlvInstRcptListReg, B extends MS_MSBBL1250_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1250_Srch01Caller(P p, B b) {
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
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}
	
	/**
	 * [MS_MSBBL1250_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1250_Srch02Caller<P extends MSBBP_DlvInstRcptListReg, B extends MS_MSBBL1250_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1250_Srch02Caller(P p, B b) {
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
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up0().ref_flg(Cnd_ope_REF.isSelected());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBBL1250_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1250_Upd01Caller<P extends MSBBP_DlvInstRcptListReg, B extends MS_MSBBL1250_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1250_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setBtnMode();
		}
	}

	/**
	 * [MS_MSBBL1250_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1250_Del01Caller<P extends MSBBP_DlvInstRcptListReg, B extends MS_MSBBL1250_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1250_Del01Caller(P p, B b) {
			super(p, b);
		}
	}
	
	protected void setDayWeekTyp(MCList<RsltR> rsltL) {
		
		for (RsltR rsltR : rsltL) {
			
			if (!isNull(rsltR.dlv_day_week_typ_nm())) {
				
				for (MCRow r : MAC_DAY_WEEK_TYP.list()) {
					
					String dayWeekTypNm = r.getString("day_week_typ_nm");
					String dayWeekTyp = r.getString("day_week_typ");
					if (isSame(dayWeekTypNm, rsltR.dlv_day_week_typ_nm())) {
						rsltR.dlv_day_week_typ(dayWeekTyp);
					}
				}
			}
		}
	}
	
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_slo_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty);
		
		Rslt_dlv_p_PPanel.setRelateBeans(columnRslt_cst_cd);
		Rslt_tdlv_p_PPanel.setTdlvMode(true);
		
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		columnRslt_dlv_cd.addLCListener(this);
		columnRslt_tdlv_cd.addLCListener(this);
		
		getRslt_dlv_day_week_typ_nm_ListPutter().setColumns(
				DayWeekTypCols.$o_day_week_typ_nm, DayWeekTypCols.$o_day_week_typ);
	}
	
	@Override
	public MCList<?> getRslt_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		RsltR r = getRsltL().get(info.getEventIndex());
		
		row.setStringNE(BpCols.$i_cst_cd, r.cst_cd());
		row.setDateNE(BpCols.$i_dt, r.slo_dt());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getRslt_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	@Override
	public MCList<?> getRslt_tdlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		RsltR r = getRsltL().get(info.getEventIndex());
		
		row.setDateNE(BpCols.$i_dt, r.slo_dt());
		return super.getRslt_tdlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		valueInitSub();
	}
	
	/**
	 * 初期化処理を行う。
	 */
	protected void valueInitSub() {
		
		Cnd_dlv_inst_not_rcpt_flg.setValue(true);
		Cnd_dlv_inst_rcpt_flg.setValue(true);
		
		if (Cnd_ope_UPD.isSelected()) {
			Cnd_edi_flg.setValue(false);
		}
		else {
			Cnd_edi_flg.setValue(true);
		}
		Cnd_not_edi_flg.setValue(true);
	}
	
	@Override
	protected List<java.lang.String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		
		if (cont == getRsltL()) {
			
			list.add(RsltR.$dlv_inst_rcpt_no);
			list.add(RsltR.$dlv_inst_rcpt_rev);
			list.add(RsltR.$dlv_inst_rcpt_dt);
			
			list.remove(RsltR.$ship_pr_upd_cntr);
			list.remove(RsltR.$slo_upd_cntr);
		}
		
		return list;
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
	
	/**
	 * 操作種別変更時のイベント処理
	 */
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL());
		clearCnd();
		setSrchStatus();
		setStatusColumn();
	}
	
	protected void clearCnd() {
		
		if (Cnd_ope_UPD.isSelected()) {
			Cnd_dlv_inst_not_rcpt_flg.setValue(true);
			Cnd_dlv_inst_rcpt_flg.setValue(true);
			Cnd_edi_flg.setValue(false);
			Cnd_not_edi_flg.setValue(true);
		}
		else {
			Cnd_dlv_inst_not_rcpt_flg.setValue(false);
			Cnd_dlv_inst_rcpt_flg.setValue(true);
			Cnd_edi_flg.setValue(true);
			Cnd_not_edi_flg.setValue(true);
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == columnRslt_dlv_cd) doRslt_dlv_cd_LC(info);
		if (lc == columnRslt_tdlv_cd) doRslt_tdlv_cd_LC(info);
	}
	
	/**
	 * 明細の配送先ＣＤのＬＣイベント
	 * @param info MCEventInfo
	 */
	public void doRslt_tdlv_cd_LC(MCEventInfo info) {
		
		RsltR r = getRsltL().get(info.getEventIndex());
		
		setViaDlvTyp(r, r.mst_via_dlv_typ(), info.getEventIndex());
	}
	
	/**
	 * 得意先のインボイス対象取引がオフの場合は、配送先を入力しても、全明細の配送先経由区分を「経由しない」で固定する。
	 * 手配区分が仕入直送の場合も同様。
	 * @param dtlR 納入指示受領明細
	 * @param viaDlvtyp 配送先経由区分
	 * @param index インデックス
	 */
	protected void setViaDlvTyp(RsltR dtlR, String viaDlvtyp, int index) {
		
		if (isNull(dtlR.tdlv_cd())) {
			dtlR.mst_via_dlv_typ(null);
			setValueEx(columnRslt_via_dlv_typ, index, null);
		}
		else {
			if (!dtlR.cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
				setValueEx(columnRslt_via_dlv_typ, index, MAC_VIA_DLV_TYP.NOT_VIA.value());
			}
			else {
				setValueEx(columnRslt_via_dlv_typ, index, viaDlvtyp);
			}
		}
	}
	
	@Override
	public void doRslt_via_dlv_typ_LC(MCEventInfo info) {
		super.doRslt_via_dlv_typ_LC(info);
		
		RsltR r = getRsltL().get(info.getEventIndex());
		
		if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ()) 
				|| (isNull(r.via_dlv_typ()) && MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ()))) {
			setValueEx(columnRslt_dlv_day_week_typ_nm, info.getEventIndex(), null);
		}
	}
	
	/**
	 * 明細の納品先ＣＤのＬＣイベント
	 * @param info MCEventInfo
	 */
	public void doRslt_dlv_cd_LC(MCEventInfo info) {
		
		RsltR r = getRsltL().get(info.getEventIndex());
		
		if (MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
				|| r.vmi_flg()) {
			
			setValueEx(columnRslt_pri_prnt_flg, info.getEventIndex(), false);
		}
	}
	
	/**
	 * 変更可能な操作種別か判定する。
	 * @return 新規・訂正するまたは取り消すの場合はtrue
	 */
	protected boolean isRegStatus() {
		return isSame(getStatus(), UPD) || isSame(getStatus(), DEL);
	}
	
	/**
	 * ステータスカラムの表示を設定する。
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		
		if (Cnd_ope_UPD.isSelected()) {
			callMS_MSBBL1250_Srch01();
		}
		else {
			callMS_MSBBL1250_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		
		if (Cnd_ope_UPD.isSelected()) {
			createMS_MSBBL1250_Srch01().execDL();
		}
		else {
			createMS_MSBBL1250_Srch02().execDL();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1230]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1230(MCEventInfo info) {
		RsltR rsltR = RsltTable.getSelectedMCRow();
		if (rsltR == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1230");
		aso.putCnd(crtOpenMSBBP1230CndR(aso, rsltR));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 販売納期調整画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1230.CndR crtOpenMSBBP1230CndR(MAUCP_AppScreenOpener aso, RsltR rsltR) {
		
		mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg p = (mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1230.CndR to = mcframe.clientMSBB.MSBBP1230.CndR.create();
		if (Cnd_ope_REF.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		to.slo_no(rsltR.slo_no());
		
		return to;
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
		callMS_MSBBL1250_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1250_Del01();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		setDlvInstRcptStsMode();
	}
	
	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		
		setDlvInstRcptStsMode();
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	/**
	 * 削除ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		
		RsltR r = RsltTable.getSelectedMCRow();
		
		if (isSame(getStatus(), UPD)) {
			
			if (!isNull(r)) {
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())
						|| MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
					Btn_rdel.setMode(MCMode.DISABLE);
					Btn_rcopy.setMode(MCMode.DISABLE);
				}
				else if (!r.isStatusCreate() && isNull(r.dlv_inst_rcpt_no())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
					setDefaultMode(Btn_rcopy);
				}
			}
			else {
				setDefaultMode(Btn_rdel);
				setDefaultMode(Btn_rcopy);
			}
		}
	}
	
	/**
	 * 納入指示受領状況のモードを設定する。
	 */
	protected void setDlvInstRcptStsMode() {
		
		if (Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			Cnd_dlv_inst_not_rcpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_dlv_inst_rcpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_dlv_inst_not_rcpt_flg);
			setDefaultMode(Cnd_dlv_inst_rcpt_flg);	
		}
	}
	
	/**
	 * 検索前ステータスを設定。
	 */
	protected void setSrchStatus() {
		
		if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		else {
			setSRCHStatus();
		}
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	/**
	 * 検索後ステータスを設定
	 */
	protected void setStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	/**
	 * 検索前のチェックを行う。
	 * @param msgList メッセージリスト
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		
		msgList.addAll(checkBeforeAfter(Cnd_slo_dt_fr, Cnd_slo_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_dlv_inst_rcpt_dt_fr, Cnd_dlv_inst_rcpt_dt_to));
		msgList.addAll(checkAtLeastOne(DlvInstRcpStsTypPanel));
		msgList.addAll(checkAtLeastOne(EdiPanel));
	}
	
	// ///////////////////// File Input ///////////////////////////////////////
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return (Cnd_ope_UPD.isSelected());
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		
		if (Cnd_ope_UPD.isSelected()) {
			callMS_MSBBL1250_Imp01();
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isNull(r) || isNull(r.slo_no())) {
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1230");
			aso.putCnd(crtOpenMSBBP1230CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}
	
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

			RsltR rsltR = (RsltR) table.getBaseTable().getRow(index);
			
			if (MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			if (isSame(getStatus(), FIX)) {
				return MCMode.READ_ONLY;
			}
			
			if (isSame(getStatus(), UPD)) {
				
				if (MAC_SHIP_INST_TYP.isNO_PICK(rsltR.ship_inst_typ())) {
					return MCMode.READ_ONLY;
				}
				
				if (rsltR.after_exec_flg() && !isNull(rsltR.dlv_inst_rcpt_no())) {
					return MCMode.READ_ONLY;
				}
				
				if (MSC_SHIP_ASSORT_TYP.isAST(rsltR.assort_typ())
						|| !isNull(rsltR.set_itm_grp_no())) {
					if (column == columnRslt_dlv_cd
							|| column == columnRslt_pri_prnt_flg
							|| column == columnRslt_tdlv_cd
							|| column == columnRslt_via_dlv_typ
							|| column == columnRslt_dlv_day_week_typ_nm) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_tdlv_cd) {
					if ((MAC_VIA_DLV_TYP.isVIA(rsltR.via_dlv_typ()) || rsltR.tdlv_req_flg()) && isNull(rsltR.slo_tdlv_cd())) {
						return MCMode.REQUIRED;
					}
				}
				
				if (column == columnRslt_pri_prnt_flg) {
					if (isNull(rsltR.dlv_cd()) || MAC_TRD_PTN_TYP.isSHIP(rsltR.trd_ptn_typ()) || rsltR.vmi_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_via_dlv_typ) {
					if (!rsltR.cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(rsltR.proc_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_dlv_day_week_typ_nm) {
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(rsltR.proc_typ())
							|| MAC_VIA_DLV_TYP.isVIA(rsltR.via_dlv_typ())
							|| (isNull(rsltR.via_dlv_typ()) && MAC_VIA_DLV_TYP.isVIA(rsltR.slo_via_dlv_typ()))) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

}