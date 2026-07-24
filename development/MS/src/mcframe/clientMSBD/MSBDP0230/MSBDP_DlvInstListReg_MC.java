package mcframe.clientMSBD.MSBDP0230;

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
import mcframe.clientMAUB.MAUBP5120.*;
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
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_DlvInstListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_DlvInstListReg_MC extends MSBDP_DlvInstListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected String[] _dlvSlipKey = new String[] { RsltR.$dlv_slip_no, RsltR.$dlv_slip_seq };

	protected String[] _purcDDlvDlvSlipKey = new String[] { RsltR.$purc_ddlv_dlv_slip_no, RsltR.$purc_ddlv_dlv_slip_rev };
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_DlvInstListReg_MC() {
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
	public MSBDP_DlvInstListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	public void doBtn_dlv_inst_print_select_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (r.check()) {
				r.dlv_inst_print_flg(true);
				if (!Cnd_ope_PRNT.isSelected()) r.crnt_edi_dlv_inst_flg(false);
			}
		}
	}


	@Override
	public void doBtn_dlv_inst_print_deselect_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (r.check()) {
				r.dlv_inst_print_flg(false);
			}
		}
	}

	

	@Override
	public void doBtn_dlv_slip_print_select_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (isEditable(columnRslt_dlv_slip_print_flg, r.getGUIIndex()) && r.check()) {
				r.dlv_slip_print_flg(true);
			}
		}
	}


	@Override
	public void doBtn_dlv_slip_print_deselect_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (r.check()) {
				r.dlv_slip_print_flg(false);
			}
		}
	}


	@Override
	public void doBtn_purc_ddlv_dlv_slip_print_select_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (isEditable(columnRslt_purc_ddlv_dlv_slip_print_flg, r.getGUIIndex()) && r.check()) {
				r.purc_ddlv_dlv_slip_print_flg(true);
			}
		}
	}


	@Override
	public void doBtn_purc_ddlv_dlv_slip_print_deselect_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (r.check()) {
				r.purc_ddlv_dlv_slip_print_flg(false);
			}
		}
	}
	

	@Override
	public void doBtn_edi_dlv_inst_select_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (isEditable(columnRslt_crnt_edi_dlv_inst_flg, r.getGUIIndex()) && r.check()) {
				r.crnt_edi_dlv_inst_flg(true);
				if (!Cnd_ope_PRNT.isSelected()) r.dlv_inst_print_flg(false);
			}
		}
	}
	

	@Override
	public void doBtn_edi_dlv_inst_deselect_all(MCEventInfo info) {
		for (RsltR r : getRsltL()) {
			if (r.check()) {
				r.crnt_edi_dlv_inst_flg(false);
			}
		}
	}
	
	
	@Override
	public void doRslt_dlv_slip_print_flg_NC(MCEventInfo info) {
		super.doRslt_dlv_slip_print_flg_NC(info);
		setCheckForSameDlvSlipNo(info);
	}
	
	@Override
	public void doRslt_purc_ddlv_dlv_slip_print_flg_NC(MCEventInfo info) {
		super.doRslt_purc_ddlv_dlv_slip_print_flg_NC(info);
		setCheckForSamePurcDDlvDlvSlipNo(info);
	}
	
	@Override
	public void doRslt_dlv_inst_print_flg_NC(MCEventInfo info) {
		super.doRslt_dlv_inst_print_flg_NC(info);
		setCheckForSameDlvInstNo(info);
	}
	

	
	protected void setCheckForSameDlvSlipNo(MCEventInfo info) {

		RsltR selectedR = getRsltL().get(info.getNewIndex());
		
		if (Cnd_ope_PRNT.isSelected() && isNull(selectedR.dlv_slip_no())) return;

		MCList<RsltR> subL;
		if (Cnd_ope_INS.isSelected()) {
			subL = getRsltL().subList(RsltR.$po_d_no, selectedR.po_d_no());
		}
		else {
			subL = getRsltL().subList(_dlvSlipKey, selectedR.toArray(_dlvSlipKey));
		}

		for (RsltR subR : subL) {
			if (subR.check()) {
				subR.dlv_slip_print_flg(selectedR.dlv_slip_print_flg());
				setStatusModify(subR);
			}
		}
	}
	
	
	protected void setCheckForSamePurcDDlvDlvSlipNo(MCEventInfo info) {

		RsltR selectedR = getRsltL().get(info.getNewIndex());
		if (Cnd_ope_PRNT.isSelected() && isNull(selectedR.purc_ddlv_dlv_slip_no())) return;

		MCList<RsltR> subL;
		if (Cnd_ope_INS.isSelected()) {
			subL = getRsltL().subList(RsltR.$po_d_no, selectedR.po_d_no());
		}
		else {
			subL = getRsltL().subList(_purcDDlvDlvSlipKey, selectedR.toArray(_purcDDlvDlvSlipKey));
		}

		for (RsltR subR : subL) {
			if (subR.check()) {
				subR.purc_ddlv_dlv_slip_print_flg(selectedR.purc_ddlv_dlv_slip_print_flg());
				setStatusModify(subR);
			}
		}

	}

	protected void setStatusModify(RsltR r) {
		if (r.isStatusNone()) r.setStatus(Status.MODIFY);
	}
	
	protected void setCheckForSameDlvInstNo(MCEventInfo info) {

		RsltR selectedR = getRsltL().get(info.getNewIndex());
		
		
		MCList<RsltR> subL;
		if (Cnd_ope_INS.isSelected()) {
			subL = getRsltL().subList(RsltR.$po_d_no, selectedR.po_d_no());

		}
		else {
			subL = getRsltL().subList(RsltR.$dlv_inst_no, selectedR.dlv_inst_no());
		}

		for (RsltR subR : subL) {
			if (subR.check()) {
				subR.dlv_inst_print_flg(selectedR.dlv_inst_print_flg());
				if (!Cnd_ope_PRNT.isSelected() && selectedR.dlv_inst_print_flg()) subR.crnt_edi_dlv_inst_flg(false);
				setStatusModify(subR);
			}
		}
	}

	/**
	 * [MS_MSBDL0230_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Srch01Caller<P extends MSBDP_DlvInstListReg, B extends MS_MSBDL0230_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0230_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkAtLeastOne(EdiPanel));
		}
		
		@Override
		protected void show() {
			super.show();
			
			showSub();
			
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setSrchedStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBDL0230_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Srch02Caller<P extends MSBDP_DlvInstListReg, B extends MS_MSBDL0230_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0230_Srch02Caller(P p, B b) {
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
			msgList.addAll(checkAtLeastOne(EdiPanel));
			msgList.addAll(checkAtLeastOne(DlvInstPrntPanel));
		}
		
		@Override
		protected void show() {
			super.show();
			
			if (!Cnd_ope_REF.isSelected()) {
				showSub();
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setSrchedStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	protected void showSub() {

		for (RsltR r : getRsltL()) {
			r.crnt_edi_dlv_inst_flg(r.edi_tgt_flg());
			r.dlv_inst_print_flg(!r.edi_tgt_flg());
			r.dlv_slip_print_flg(r.dlv_inst_dlv_slip_flg());
			if (r.purc_ddlv_flg()) {
				r.purc_ddlv_dlv_slip_print_flg(r.dlv_inst_dlv_slip_flg());
			}
		}
	}
	
	/**
	 * [MS_MSBDL0230_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Imp01Caller<P extends MSBDP_DlvInstListReg, B extends MS_MSBDL0230_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBDL0230_Imp01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
		}
		
		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			List<MCList<?>> containers = new ArrayList<MCList<?>>();
			
			// 検索条件
			MCList<CndR> cndL = MCList.create(CndR.class);
			cndL.add(getCndR());
			containers.add(cndL);
			
			// 明細
			containers.add(getRsltL());
			
			return csvOutFromContainer(containers);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (isAsync()) {
				setFIX_IStatus();
			}
			else if (hasNg()) {
				setFIX_IStatus();
			}
			else {
				setINSStatus();
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

		@Override
		protected void show() {
			super.show();
			showSub();
		}

		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void handleMCEx(MCException ex){
			super.handleMCEx(ex);
			setFIX_IStatus();
		}
		
		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_IStatus();
		}
	}

	/**
	 * [MS_MSBDL0230_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Upd01Caller<P extends MSBDP_DlvInstListReg, B extends MS_MSBDL0230_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MCList<RsltR> _rsltL = MCList.create(RsltR.class);
		protected MS_MSBDL0230_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			_rsltL = getRsltL().clone();
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBDL0230_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Del01Caller<P extends MSBDP_DlvInstListReg, B extends MS_MSBDL0230_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0230_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBDL0230_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0230_Prnt01Caller<P extends MSBDP_DlvInstListReg, B extends MS_MSBDL0230_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBDL0230_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			
			for (RsltR r : getRsltL().subList(RsltR.$check, true)) {
				msgList.addAll(
						checkAtLeastOne(r, columnRslt_dlv_inst_print_flg, columnRslt_dlv_slip_print_flg, columnRslt_purc_ddlv_dlv_slip_print_flg));
			}
			
		}
	}


	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			callMS_MSBDL0230_Srch01();
		}
		else {
			callMS_MSBDL0230_Srch02();
		}
	}

	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			createMS_MSBDL0230_Srch01().execDL();
		}
		else {
			createMS_MSBDL0230_Srch02().execDL();
		}
	}

	@Override
	public void doBtn_open_MSBDP0120(MCEventInfo info) {
		openMSBDP0120(info);
	}

	@Override
	public void doBtn_open_MSBDP0250(MCEventInfo info) {
		openMSBDP0250(info);
	}

	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}

	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}

	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}

	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		RsltR dtlR = copyRow(RsltTable);
		if (!isNull(dtlR)) {
			clearNotCopyCol(dtlR);
		}
		setBtnMode(dtlR);
	}

	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBDL0230_Prnt01();
	}

	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0230_Upd01();
	}

	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0230_Del01();
	}

	protected void openMSBDP0120 (MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0120");
		aso.putCnd(crtOpenMSBDP0120CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0120.CndR crtOpenMSBDP0120CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBD.MSBDP0120.MSBDP_PurcDlvDtAdjstReg p = (mcframe.clientMSBD.MSBDP0120.MSBDP_PurcDlvDtAdjstReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0120.CndR to = mcframe.clientMSBD.MSBDP0120.CndR.create();
		to.po_no(r.po_no());
		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			to.ope(p.Cnd_ope_UPD_DLVINST.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		return to;
	}

	protected void openMSBDP0250 (MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0250");
		aso.putCnd(crtOpenMSBDP0250CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0250.CndR crtOpenMSBDP0250CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt p = (mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt) aso.getPanel();
		mcframe.clientMSBD.MSBDP0250.CndR to = mcframe.clientMSBD.MSBDP0250.CndR.create();
		to.po_no(r.po_no());
		to.ope(p.Cnd_ope_DLVSLIP.getActionCommand());
		return to;
	}
	// -----------------------------------------------
	// init
	// -----------------------------------------------
	@Override
	protected void valueInit() {
		super.valueInit();
		setSrchStatus();
		setCndModeByOpe();
		setHdrColByOpe();

		setValueEx(Cnd_edi_flg, true);
		setValueEx(Cnd_not_edi_flg, true);
		setValueEx(Btn_indiv_prnt_flg, true);
		setBtnMode(null);
	}
	// -----------------------------------------------
	// If
	// -----------------------------------------------
	@Override
	public MCTable<RsltR> getListRegTable() {
		return RsltTable;
	}
	// -----------------------------------------------
	// ファイル取り込み
	// -----------------------------------------------	
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_INS.isSelected();
		}
		return super.useFileIn(table);
	}
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBDL0230_Imp01();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		// 発注数量
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_src_trd_unit_cd, columnRslt_src_trd_unit_dec_place);

		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_trd_unit_cd,
				columnRslt_trd_unit_dec_place, columnRslt_trd_unit_rnd_typ,
				columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty, columnRslt_base_unit_cd);

		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty);

		Rslt_str_ln_p_PPanel.setRelateBeans(columnRslt_in_to_loc_cd, columnRslt_in_to_str_ln_tgt_flg);
		Rslt_rcpt_iv_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_arr_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_arr_act_abort_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_purc_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_purc_abort_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_accpt_dfct_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_accpt_dfct_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_purc_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		linkBeansToISPanelCustom(columnRslt_in_to_loc_cd);
	}
	
	// -----------------------------------------------
	// listener
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnRslt_trd_unit_qty.addNCListener(this);
		columnRslt_base_unit_qty.addNCListener(this);
		columnRslt_dlv_rqst_dt.addNCListener(this);
		columnRslt_dlv_inst_print_rmrks.addNCListener(this);	
		columnRslt_purc_schd_dt.addNCListener(this);	
		columnRslt_dlv_inst_dt.addNCListener(this);	
		columnRslt_dlv_inst_print_rmrks.addNCListener(this);
		columnRslt_intr_rmrks.addNCListener(this);
		columnRslt_sub_char1.addNCListener(this);
		columnRslt_sub_char2.addNCListener(this);
		columnRslt_sub_char3.addNCListener(this);
	}
	
	@Override
	public MCList getRslt_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		RsltR r = RsltTable.getSelectedMCRow();
		
		row.setStringNE(BpCols.$i_cst_cd, r.cst_cd());
		row.setDateNE(BpCols.$i_dt, r.slo_dt());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getRslt_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}	
	
	// -----------------------------------------------
	// VCEvent
	// -----------------------------------------------
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if (isChanged()) {
			return confirmRegDataClear();
		}
		return true;
	}
	// -----------------------------------------------
	// NCEvent
	// -----------------------------------------------
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnRslt_dlv_rqst_dt) {
			doRslt_dlv_rqst_dt_NC(info);
		}
		if (nc == columnRslt_purc_schd_dt) {
			doRslt_purc_schd_dt_NC(info);
		}
		if (nc == columnRslt_dlv_inst_dt) {
			doRslt_dlv_inst_dt_NC(info);
		}
		if (nc == columnRslt_dlv_inst_print_rmrks) {
			doRslt_dlv_inst_print_rmrks_NC(info);
		}
		if (nc == columnRslt_intr_rmrks) {
			doRslt_intr_rmrks_NC(info);
		}
		if (nc == columnRslt_sub_char1) {
			doRslt_sub_char1_NC(info);
		}
		if (nc == columnRslt_sub_char2) {
			doRslt_sub_char2_NC(info);
		}
		if (nc == columnRslt_sub_char3) {
			doRslt_sub_char3_NC(info);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub();
		setStatusColumn();
		setBtnMode(null);
	}
	protected void doCnd_ope_NCSub() {

		clearContainers(getRsltL());
		setSrchStatus();
		setCndModeByOpe();
		clearCndByOpe();
		setHdrColByOpe();
	}
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		if (info.getEventIndex() < 0) {
			return;
		}
		if (getRsltL().size() > 0) {
			RsltR r = getRsltL().get(info.getEventIndex());
			setBtnMode(r);
		}
	}
	public void doRslt_dlv_rqst_dt_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		// 仕入直送でない、下請対象の発注先でない、VMI、無償受給以外、入荷基準でない場合のみ日付計算
		if (!r.purc_ddlv_flg()
				&& !r.subcon_flg()
				&& !MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
				&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
				&& !MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
			String sysParm = getSysParm("MASTER_DT_BASE");
			if (!isNullOrNullVal(sysParm) && isSame(sysParm , "1")) {
				setSchdDt(r, callGetSchdDt(getSchdDtEditCnd(r, MSUCP_PurcUtil.$dlv_rqst_dt),r.dlv_rqst_dt(), sysParm));
			} else {
				setSchdDt(r, callGetSchdDt(getSchdDtEditCnd(r, MSUCP_PurcUtil.$dlv_rqst_dt),null, sysParm));
			}
		}
		else {
			if (!MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
					&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
				r.purc_schd_dt(r.dlv_rqst_dt());
			}
		}
		setSyncFlg(r);
	}
	public void doRslt_purc_schd_dt_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!isNull(r.purc_schd_dt())) {
			setSyncFlg(r);
		}
	}
	public void doRslt_dlv_inst_dt_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		getRsltL().forEach(rr -> {
			if (rr != r && !isNull(r.dlv_inst_no())
					&& isSame(rr.dlv_inst_no(), r.dlv_inst_no())) {
				setValueEx(columnRslt_dlv_inst_dt, rr.getGUIIndex(), r.dlv_inst_dt());
			}
		});
	}
	public void doRslt_dlv_inst_print_rmrks_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		getRsltL().forEach(rr -> {
			if (rr != r && !isNull(r.dlv_inst_no())
					&& isSame(rr.dlv_inst_no(), r.dlv_inst_no())) {
				setValueEx(columnRslt_dlv_inst_print_rmrks, rr.getGUIIndex(), r.dlv_inst_print_rmrks());
			}
		});
	}
	public void doRslt_intr_rmrks_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		getRsltL().forEach(rr -> {
			if (rr != r && !isNull(r.dlv_inst_no())
					&& isSame(rr.dlv_inst_no(), r.dlv_inst_no())) {
				setValueEx(columnRslt_intr_rmrks, rr.getGUIIndex(), r.intr_rmrks());
			}
		});
	}
	public void doRslt_sub_char1_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		getRsltL().forEach(rr -> {
			if (rr != r && !isNull(r.dlv_inst_no())
					&& isSame(rr.dlv_inst_no(), r.dlv_inst_no())) {
				setValueEx(columnRslt_sub_char1, rr.getGUIIndex(), r.sub_char1());
			}
		});
	}
	public void doRslt_sub_char2_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		getRsltL().forEach(rr -> {
			if (rr != r && !isNull(r.dlv_inst_no())
					&& isSame(rr.dlv_inst_no(), r.dlv_inst_no())) {
				setValueEx(columnRslt_sub_char2, rr.getGUIIndex(), r.sub_char2());
			}
		});
	}
	public void doRslt_sub_char3_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		getRsltL().forEach(rr -> {
			if (rr != r && !isNull(r.dlv_inst_no())
					&& isSame(rr.dlv_inst_no(), r.dlv_inst_no())) {
				setValueEx(columnRslt_sub_char3, rr.getGUIIndex(), r.sub_char3());
			}
		});
	}

	@Override
	public void doRslt_crnt_edi_dlv_inst_flg_NC(MCEventInfo info) {
		super.doRslt_crnt_edi_dlv_inst_flg_NC(info);

		RsltR dtlR = getRsltL().get(info.getEventIndex());
		// 同一発注明細NOのフラグを同期する
		String poDNo = dtlR.po_d_no();
		if (!isNull(poDNo)) {
			MCList<RsltR> l = getRsltL().subList(RsltR.$po_d_no, poDNo);
			l.forEach(r -> {
				r.crnt_edi_dlv_inst_flg(dtlR.crnt_edi_dlv_inst_flg());
				if (dtlR.crnt_edi_dlv_inst_flg()) r.dlv_inst_print_flg(false);
			});
		}
	}

	// -----------------------------------------------
	// DCEvent
	// -----------------------------------------------
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isNull(r) || isNull(r.po_no())) {
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0120");
			aso.putCnd(crtOpenMSBDP0120CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}
	// -----------------------------------------------
	// CellConfig
	// -----------------------------------------------
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
			RsltR RsltR = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(RsltR.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			if (column == columnRslt_purc_ddlv_dlv_slip_print_flg) {
				if (!RsltR.purc_ddlv_flg()) return MCMode.READ_ONLY;
				if (Cnd_ope_PRNT.isSelected() && isNull(RsltR.purc_ddlv_dlv_slip_no())) return MCMode.READ_ONLY;
			}

			if (column == columnRslt_dlv_slip_print_flg) {
				if (Cnd_ope_PRNT.isSelected() && isNull(RsltR.dlv_slip_no())) return MCMode.READ_ONLY;
			}
			
			
			if (isSame(getStatus(), INS) || isSame(getStatus(), UPD)) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);
				
				if (isDlvInstExistsAct(r)) {
					return MCMode.READ_ONLY;
				}
				if (isDlvInstExistsIvPart(r)) {
					if (column != columnRslt_trd_unit_qty && column != columnRslt_check) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 訂正でＮＯをセット・クリアする操作は更新処理が対応していないので読み取り専用
				// この場合は行削除、行追加で対応する
				if (!r.isStatusCreate() && !isNull(r.dlv_inst_no())) {
					if ((column == columnRslt_purc_act_d_no
							|| column == columnRslt_dlv_inst_d_no)
							|| column == columnRslt_mfg_inst_no) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 実績済の場合
				if (!r.isStatusCreate() && !isNull(r.dlv_inst_no())) {
					if ((!isNull(r.arr_qty()) && !r.arr_qty().isZero())
							|| (!isNull(r.purc_act_qty()) && !r.purc_act_qty().isZero())
							|| (!isNull(r.accpt_dfct_qty()) && !r.accpt_dfct_qty().isZero())) {
						if (column == columnRslt_in_to_loc_cd
								|| column == columnRslt_in_to_str_ln_cd
								|| column == columnRslt_in_to_str_ln_cd_none_flg
								|| column == columnRslt_purc_schd_dt
								|| column == columnRslt_dlv_rqst_dt
								|| column == columnRslt_dlv_rqst_hm
								|| column == columnRslt_sync_flg) {
							return MCMode.READ_ONLY;
						}
					}
				}
				
				if (column == columnRslt_mfg_inst_no) {
					if (!r.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_in_to_loc_cd) {
					if (r.purc_ddlv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_purc_schd_dt) {
					if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
						return MCMode.READ_ONLY;
					}
					if (r.subcon_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!isNull(r.purc_basis_typ()) && MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_inst_dlv_cd
						|| column == columnRslt_pri_prnt_flg
						|| column == columnRslt_tdlv_cd) {
					if (!r.purc_ddlv_flg()
							|| MSC_SHIP_ASSORT_TYP.isAST(r.assort_typ())
							|| !isNull(r.set_itm_grp_no())
							) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_pri_prnt_flg) {
					if (isNull(r.inst_dlv_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_tdlv_cd) {
					if (r.tdlv_req_flg() && isNull(r.tdlv_cd())) {
						return MCMode.REQUIRED;
					}
				}

				if (column == columnRslt_sync_flg) {
					if (isNullOr(r.dlv_rqst_dt(), r.purc_schd_dt())
							|| !r.dlv_rqst_dt().eqDate(r.purc_schd_dt())) {
						return MCMode.READ_ONLY;
					}
					if (r.purc_ddlv_flg()) {
						return MCMode.READ_ONLY;
					}
					if (r.subcon_flg()) {
						return MCMode.READ_ONLY;
					}
					if (r.arr_skip_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!isNull(r.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(r.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_trd_unit_cd || column == columnRslt_trd_unit_qty) {
					if (r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_in_to_str_ln_cd) {
					if (r.in_to_str_ln_tgt_flg() && !r.in_to_str_ln_cd_none_flg()) {
						return MCMode.REQUIRED;
					}
				}
			}
			if (isSame(getStatus(), INS) || isSame(getStatus(), UPD) || isSame(getStatus(), DEL)) {
				if (column == columnRslt_crnt_edi_dlv_inst_flg) {
					RsltR r = (RsltR) table.getBaseTable().getRow(index);
					if (r.edi_tgt_flg()) {
						return MCMode.ENABLE;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	
	

	protected boolean isDlvInstExistsAct(RsltR r) {
		return (r.rcpt_iv_cmpl_flg())
				|| (!isNull(r.act_abort_qty()) && !r.act_abort_qty().isZero())
				|| (!isNull(r.purc_abort_qty()) && !r.purc_abort_qty().isZero())
				|| (!r.non_purc_flg() && r.purc_cmpl_flg())
				|| (!r.arr_skip_flg() && r.arr_cmpl_flg());
	}
	

	protected boolean isDlvInstExistsIvPart(RsltR r) {
		return !isNull(r.rcpt_iv_qty()) && !r.rcpt_iv_qty().isZero() && !r.rcpt_iv_cmpl_flg();
	}
	
	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------

	public void setStatusColumn() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	

	protected void setBtnMode(RsltR r) {
		setBtnRcopyMode(r);
		setBtnRdelMode(r);
		setBtnOpnMSBDP0120(r);
		setBtnOpnMSBDP0250(r);
	}
	

	protected void setBtnRcopyMode(RsltR r) {
		if (isNull(r)) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else if (isDlvInstExistsAct(r)) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
	}
	

	protected void setBtnRdelMode(RsltR r) {
		if (isNull(r)) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else if (isDlvInstExistsAct(r)) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else if (!r.isStatusCreate() && isNull(r.dlv_inst_no())) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rdel);
		}
	}
	

	protected void setBtnOpnMSBDP0120(RsltR r) {
		if (!isNull(r) && !isNull(r.po_no())) {
			setDefaultMode(Btn_open_MSBDP0120);
		}
		else {
			Btn_open_MSBDP0120.setMode(MCMode.DISABLE);
		}
	}
	

	protected void setBtnOpnMSBDP0250(RsltR r) {
		if (!isNull(r) && !isNull(r.po_no())) {
			setDefaultMode(Btn_open_MSBDP0250);
		}
		else {
			Btn_open_MSBDP0250.setMode(MCMode.DISABLE);
		}
	}
	

	public void setSrchStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
		}
		else {
			setSRCHStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
		setStatusColumn();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		
		FoldTab.focusActiveFirstComponent();
	}

	public void setSrchedStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
		RsltTable.selectLeftmostColumn(0);
		setStatusColumn();
	}
	

	public void setCndModeByOpe() {
		if (Cnd_ope_INS.isSelected()) {
			Cnd_incl_can_flg.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_UPD.isSelected()) {
			Cnd_incl_can_flg.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			Cnd_incl_can_flg.setMode(MCMode.READ_ONLY);
		}
	}
	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------

	protected void setHdrColByOpe() {	

		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_dlv_inst_dt_fr, null);
			setValueEx(Cnd_dlv_inst_dt_to, null);
			setValueEx(Cnd_dlv_inst_grp_no, null);
			setValueEx(Cnd_dlv_inst_no, null);
			setValueEx(Cnd_dlv_inst_d_no, null);
		}

		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_incl_can_flg, false);
		}
	}

	// -----------------------------------------------
	// ユーティリティ使用準備
	// -----------------------------------------------
	protected RsltR getSchdDtEditCnd(RsltR r, String columnNm) {
		RsltR cnd = r.clone();
		if (isSame(columnNm, MSUCP_PurcUtil.$dlv_rqst_dt)) {
			cnd.purc_schd_dt(null);
		}
		else if (isSame(columnNm, MSUCP_PurcUtil.$purc_schd_dt)) {
			cnd.dlv_rqst_dt(null);
		}
		return cnd;
	}

	protected void clearCndByOpe() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_dlv_inst_dt_fr, null);
			setValueEx(Cnd_dlv_inst_dt_to, null);
			setValueEx(Cnd_dlv_inst_grp_no, null);
			setValueEx(Cnd_dlv_inst_no, null);
			setValueEx(Cnd_dlv_inst_d_no, null);
			setValueEx(Cnd_incl_can_flg, false);
			setValueEx(Cnd_dlv_inst_prnt_flg, false);
			setValueEx(Cnd_not_dlv_inst_prnt_flg, false);
			setValueEx(Cnd_dlv_inst_print_rmrks, null);
			setValueEx(Cnd_intr_rmrks, null);
			setValueEx(Cnd_dlv_inst_print_d_rmrks, null);
			setValueEx(Cnd_dtl_intr_rmrks, null);
			setValueEx(Cnd_dlv_slip_d_rmrks, null);
			setValueEx(Cnd_sub_char1, null);
			setValueEx(Cnd_sub_char2, null);
			setValueEx(Cnd_sub_char3, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_dlv_rqst_dt_fr, null);
			setValueEx(Cnd_dlv_rqst_hm_fr, null);
			setValueEx(Cnd_dlv_rqst_dt_to, null);
			setValueEx(Cnd_dlv_rqst_hm_to, null);
			setValueEx(Cnd_dlv_inst_no, null);
			setValueEx(Cnd_dlv_inst_d_no, null);
			setValueEx(Cnd_dlv_inst_rcpt_flg, false);
			setValueEx(Cnd_dlv_inst_prnt_flg, true);
			setValueEx(Cnd_not_dlv_inst_prnt_flg, true);
		}
		else {
			setValueEx(Cnd_dlv_inst_rcpt_flg, false);
			setValueEx(Cnd_dlv_inst_prnt_flg, true);
			setValueEx(Cnd_not_dlv_inst_prnt_flg, true);
		}
		setValueEx(Cnd_edi_flg, true);
		setValueEx(Cnd_not_edi_flg, true);
	}
	

	protected void clearNotCopyCol(RsltR r) {
		r.dlv_inst_d_no(null);
		r.act_abort_qty(null);
		r.purc_act_qty(null);
		r.purc_abort_qty(null);
		r.accpt_dfct_qty(null);
		r.rcpt_iv_no(null);
		r.arr_cmpl_flg(false);
		r.purc_cmpl_flg(false);
		r.setStatus(MCRow.CREATE);
	}
	

	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_arr_schd_dt_fr, Cnd_arr_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_po_dt_fr, Cnd_po_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_dlv_inst_dt_fr, Cnd_dlv_inst_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_dlv_rqst_dt_fr, Cnd_dlv_rqst_dt_to));
	}
	
	protected MCRow callGetSchdDt(RsltR r , MCDate baseDt , String sysParm) {
		if (isNullAnd(r.dlv_rqst_dt(), r.purc_schd_dt())) {
			return MCRow.create();
		}
		return MSUCP_PurcUtil.getSchdDt(
				MCNumber.ONE,
				null,
				r.dlv_rqst_dt(), 
				null,
				r.purc_schd_dt(), 
				r.sppl_cd(),
				r.itm_cd(),
				r.itm_sub1(),
				r.itm_sub2(), 
				r.itm_sub3(), 
				r.mfg_loc_cd(),
				r.maker_cd(),
				r.in_to_loc_wg_cd(),
				r.bom_ptn(),
				r.dlv_cd(),
				r.in_to_loc_cd(),
				r.site_cd(),
				r.outsrc_sppl_cd(),
				r.sppl_cal_cd(),
				r.in_to_loc_cal_cd(),
				r.dlv_cal_cd(),
				r.lg_grp_cd(),
				r.base_unit_qty(), 
				isSame(sysParm, "1") ? baseDt : null,
				this);
	}
	
	/**
	 * 予定日反映
	 * @param dlvInstDtlDataR
	 * @param src
	 */
	protected void setSchdDt(RsltR r, MCRow src) {
		if (isNull(src)) {
			return;
		}
		r.purc_schd_dt(src.getDateNE(MSUCP_PurcUtil.$purc_schd_dt));
		if (isNull(r.dlv_rqst_dt())) {
			r.dlv_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
		}
	}
	
	protected void setSyncFlg(RsltR r) {
		if (isNullOr(r.dlv_rqst_dt(), r.purc_schd_dt())) {
			setValueEx(columnRslt_sync_flg, r.getGUIIndex(), false);
		}
		else if (!r.purc_ddlv_flg() && r.arr_skip_flg()) {
			setValueEx(columnRslt_sync_flg, r.getGUIIndex(), false);
		}
		else if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
			setValueEx(columnRslt_sync_flg, r.getGUIIndex(), true);
		}
		else if (MAC_PURC_BASIS_TYP.isIN_BASIS(r.purc_basis_typ())) {
			setValueEx(columnRslt_sync_flg, r.getGUIIndex(), false);
		}
		else if (r.dlv_rqst_dt().eqDate(r.purc_schd_dt())) {
			setValueEx(columnRslt_sync_flg, r.getGUIIndex(), true);
		}
		else {
			setValueEx(columnRslt_sync_flg, r.getGUIIndex(), false);
		}
	}

}