package mcframe.clientMSBG.MSBGP0030;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_BillSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_BillSrch_MC extends MSBGP_BillSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillSrch_MC() {
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
	public MSBGP_BillSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0030_Srch01Caller<P extends MSBGP_BillSrch, B extends MS_MSBGL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0030_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkAtLeastOne(CndClTypPanel));
			msgList.addAll(checkAtLeastOne(CndPrntPanel));
			msgList.addAll(checkAtLeastOne(CntryTypPanel));
			msgList.addAll(checkAtLeastOne(RcvSchdAdjstPanel));
			msgList.addAll(checkBeforeAfter(Cnd_bill_cl_ym_from, Cnd_bill_cl_ym_to));
			msgList.addAll(checkBeforeAfter(Cnd_rcv_schd_dt_from, Cnd_rcv_schd_dt_to));
			msgList.addAll(checkAtLeastOne(Cnd_on_edi_flg, Cnd_off_edi_flg));
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_PRT.isSelected()) {
				setPRNTStatus();
			} else {
				setREFStatus();
			}
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_ope_PRT.isSelected()) {
				setPRNTStatus();
			} else {
				setREFStatus();
			}
		}
	}

	/**
	 * [MS_MSBGL0030_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0030_Prnt01Caller<P extends MSBGP_BillSrch, B extends MS_MSBGL0030_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBGL0030_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setCheckedRowMode(true);
		}
		
		@Override
		protected void show(){
			super.show();
			MCList<RsltR> l = getRsltL().subList(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.OK.value());
			l.setValue(RsltR.$check, false);
		}
		
		@Override
		protected void showEndMsg() {
			MCList<RsltR> checkedL = getRsltL().subList(r -> (Status.MODIFY.equals(r.getStatus())));
			if (!checkedL.subList(r -> r.edi_flg()).isEmpty()) {
				panel.dialog(new MCMessage(MSLAL0761));
			}
		}
		
		@Override
		protected void showNoDownPrintDataMsg() {
			MCList<RsltR> checkedL = getRsltL().subList(r -> (Status.MODIFY.equals(r.getStatus())));
			if (!checkedL.subList(r -> r.edi_flg()).isEmpty()) {
				panel.dialog(new MCMessage(MSLAL0761));
			}
			else {
				super.showNoDownPrintDataMsg();
			}
		}
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBGL0030_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBGL0030_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0040(MCEventInfo info) {


		RsltR selR = RsltTable.getSelectedMCRow();

		if (selR == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MCRow bind = MCRow.create();
		bind.addStringColumn("bill_no", selR.bill_no());
		bind.addStringColumn("bill_mng_no", selR.bill_mng_no());

		openPanel("MS", "MSBGP0040", T1, bind);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0080(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0080");
		aso.putCnd(crtOpenMSBGP0080CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MABGP0080]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0080.CndR crtOpenMSBGP0080CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBG.MSBGP0080.MSBGP_RcvSchdAdjstReg p = 
				(mcframe.clientMSBG.MSBGP0080.MSBGP_RcvSchdAdjstReg) aso.getPanel();
		mcframe.clientMSBG.MSBGP0080.CndR to = 
				mcframe.clientMSBG.MSBGP0080.CndR.create();
		
		to.ope(p.Cnd_ope_UPD.getActionCommand());
		to.bill_no(r.bill_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1370]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1370(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1370");
		aso.putCnd(crtOpenMSBBP1370CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MSBBP1370]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1370.CndR crtOpenMSBBP1370CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg p = 
				(mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1370.CndR to = 
				mcframe.clientMSBB.MSBBP1370.CndR.create();

		to.ope(p.Cnd_ope_UPD.getActionCommand());

		to.sls(true);
		to.sls_ret(true);
		to.sls_dscnt(true);
		to.iv_tgt_flg(true);
		to.iv_not_tgt_flg(true);
		to.interim_flg(true);
		to.acpt_flg(true);
		to.not_aprv_flg(true);

		to.bcst_cd(r.bcst_cd());
		to.iv_no(r.iv_no());
		to.wrk_no(r.wrk_no());
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
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBGL0030_Prnt01();
	}


	// ------------オープン時の処理実装------------
	@Override
	protected void valueInit(){
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub(){

		getCndR().ope(Cnd_ope_REF.getActionCommand());
		setValueEx(Cnd_not_cl_flg, true);
		setValueEx(Cnd_cl_batch_flg, true);
		setValueEx(Cnd_cl_scrn_flg, true);
		setValueEx(Cnd_each_sls_flg, true);
		setValueEx(Cnd_not_prnt_flg, true);
		setValueEx(Cnd_dmstic_flg, true);
		setValueEx(Cnd_not_adjst_flg, true);
		setValueEx(Cnd_adjst_flg, true);
		setValueEx(Cnd_on_edi_flg, true);
		setValueEx(Cnd_off_edi_flg, true);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_lastBillAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_rcvAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_setoffAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_bfwAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_slsAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_retAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_dscntAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_taxAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_swToAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_billAmt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);

		Rslt_billGrp_p_PPanel.setRelateBeans(Cnd_billGrp_p_PPanel);
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	// ------------セルの設定------------
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
			if (isPrntStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);

				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				
				if (column == columnRslt_check) {
					if (!r.sls_interim_cl_flg() && r.interim_flg()) {
						return MCMode.READ_ONLY;
					}
					else if (r.last_bill_amt().isZero() && r.d_cnt().isZero()) {
						return MCMode.READ_ONLY;
					} else if (MAC_STR.isNULL_VAL(r.bill_no()) && Cnd_ope_PRT.isSelected()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected boolean isPrntStatus() {
		return isSame(getStatus(), PRNT);
	}

	protected boolean isRefStatus() {
		return isSame(getStatus(), REF);
	}
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// REF（参照種別）では、クリア確認出さない
			if (isRefStatus() || isStatusNone(getRsltL())) {
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

		getRsltL().clear();
		
		if (isSame(info.getNewValue(), Cnd_ope_PRT.getActionCommand())) {
			setSRCH_PRNTStatus();
			setValueEx(Cnd_not_cl_flg, false);
			setValueEx(Cnd_not_prnt_ex_flg, true);
		}
		else if (isSame(info.getNewValue(), Cnd_ope_REF.getActionCommand())) {
			setSRCH_REFStatus();
			setValueEx(Cnd_not_cl_flg, true);
			setValueEx(Cnd_not_prnt_ex_flg, false);
		}
	}

	// ------------モード設定------------
	@Override
	public void setSRCH_REFStatus() {

		super.setSRCH_REFStatus();
		setFocus();
		setBtnMode();
	}

	@Override
	public void setSRCH_PRNTStatus() {

		super.setSRCH_PRNTStatus();
		setFocus();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {

		super.setREFStatus();
		setFocus();
		setBtnMode();
	}

	@Override
	public void setPRNTStatus() {

		super.setPRNTStatus();
		setFocus();
		setBtnMode();
	}

	protected void setFocus() {
		
		if(getRsltL().size() > 0){
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}else{
			CndPanel.focusFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		if (r == null) {
			Btn_open_MSBGP0040.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0080.setMode(MCMode.DISABLE);
			Btn_open_MSBBP1370.setMode(MCMode.DISABLE);
		}
		else {
			if(!MAC_STR.isNULL_VAL(r.bill_no())) {
				setDefaultMode(Btn_open_MSBGP0080);
			} else {
				Btn_open_MSBGP0040.setMode(MCMode.DISABLE);
				Btn_open_MSBBP1370.setMode(MCMode.DISABLE);
				Btn_open_MSBGP0080.setMode(MCMode.DISABLE);
			}

			setDefaultMode(Btn_open_MSBGP0040);
			setDefaultMode(Btn_open_MSBBP1370);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());

			if (r == null) {
				return;
			}
			if (Cnd_ope_REF.isSelected()) {
				if (!MSC_BILL_CL_STS_TYP.isCL_CAN(r.bill_cl_sts_typ())) {
					doBtn_open_MSBGP0040(info);
				}
			}
		}
	}

	@Override
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel, Map<String, String> args, MCList<R> list) {
		super.editListForOpenMBBCP0020(panel, args, list);

		MCIndexKey idxkey = list.createIndex(
					mcframe.clientMBBC.MBBCP0020.RsltR.$biz_key1,
					mcframe.clientMBBC.MBBCP0020.RsltR.$biz_key2);

		for (RsltR dispRow : getRsltL()) {
			R row = list.getFirst(idxkey, dispRow.bill_no(), dispRow.bill_rev().toString());
			if(MAC_BIZ_TYP.isPAY_NTC_RCPT(row.getString(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ))) {
				continue;
			}
			if(MAC_BIZ_TYP.isBILL(row.getString(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ))) {
				String bizTyp = dispRow.getBoolean(RsltR.$edi_flg) ? MAC_BIZ_TYP.BILL_EDI.value() : MAC_BIZ_TYP.BILL.value();
				row.setStringNE(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ, bizTyp);
				continue;
			}
		}
	}

}