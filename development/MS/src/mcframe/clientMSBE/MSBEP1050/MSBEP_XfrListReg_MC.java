package mcframe.clientMSBE.MSBEP1050;

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
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
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
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_XfrListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_XfrListReg_MC extends MSBEP_XfrListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _picklist = false;
	protected boolean _instlist = false;
	protected boolean _dlvlist = false;
	protected boolean _toggleAll = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_XfrListReg_MC() {
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
	public MSBEP_XfrListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1050_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Upd01Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1050_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1050_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Del01Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1050_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getBulkSetR().immd_dlv_prnt_flg());
		}
	}

	/**
	 * [MS_MSBEL1050_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Del02Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1050_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getBulkSetR().immd_dlv_prnt_flg());
		}
	}

	/**
	 * [MS_MSBEL1050_Alc01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Alc01Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Alc01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1050_Alc01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			// 引当対象は未指図の行のみ
			bridge.up0().setAll(bridge.up0().subList(RsltR.$pr_sts_typ, MSC_PR_STS_TYP.NOT_INST.value()));
		}
	}

	/**
	 * [MS_MSBEL1050_Alc02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Alc02Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Alc02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1050_Alc02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1050_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Prnt01Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1050_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			if (_dlvlist) {
				bridge.up0().removeAll(bridge.up0().subList(r -> r.non_dlv_prnt_flg()));
			}
			bridge.up1().setBooleanNE(BulkSetR.$immd_pick_prnt_flg, _picklist);
			bridge.up1().setBooleanNE(BulkSetR.$immd_inst_prnt_flg, _instlist);
			bridge.up1().setBooleanNE(BulkSetR.$immd_dlv_prnt_flg, _dlvlist);
		}
		@Override
		protected boolean checkUpListParamEmpty() {
			if (getUpParamList(getUpParamBlockIndex(RsltTable)).isEmpty()) {
				return false;
			}
			return super.checkUpListParamEmpty();
		}
	}

	/**
	 * [MS_MSBEL1050_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Prnt02Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Prnt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1050_Prnt02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().setBooleanNE(BulkSetR.$immd_dlv_prnt_flg, _dlvlist);
		}
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null){
			dialog(msgNoSelectedRow());
			return;
		}
		else {
			//コピー元も更新対象とする
			setValueEx(columnRslt_check, r.getGUIIndex(), true);
		}
		copyRow(RsltTable);
	}
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> cols = super.getNotInheritCols(type, cont);
		cols.remove(RsltR.$alloc_sts_upd_cntr);
		return cols;
	}

	/**
	 * [MS_MSBEL1050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Srch01Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1050_Srch01Caller(P p, B b) {
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
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

	}

	/**
	 * [MS_MSBEL1050_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Srch02Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1050_Srch02Caller(P p, B b) {
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
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBEL1050_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Srch03Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1050_Srch03Caller(P p, B b) {
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
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBEL1050_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Srch04Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1050_Srch04Caller(P p, B b) {
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
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBEL1050_Srch05]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Srch05Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Srch05Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1050_Srch05Caller(P p, B b) {
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
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBEL1050_Srch06]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Srch06Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Srch06Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1050_Srch06Caller(P p, B b) {
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
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_xfr_schd_dt_fr, Cnd_xfr_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_xfr_inst_dt_fr, Cnd_xfr_inst_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_xfr_act_dt_fr, Cnd_xfr_act_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_xfr_ac_dt_fr, Cnd_xfr_ac_dt_to));
		msgList.addAll(checkAtLeastOne(PrStsPanel));
		msgList.addAll(checkAtLeastOne(AllocPanel));
		msgList.addAll(checkAtLeastOne(SchdCmplPanel));
		msgList.addAll(checkAtLeastOne(PickPrntPanel));
		msgList.addAll(checkAtLeastOne(InstPrntPanel));
		msgList.addAll(checkAtLeastOne(DlvPrntPanel));
		msgList.addAll(checkAtLeastOne(WmsTrgtPanel));
	}

	/**
	 * [MS_MSBEL1050_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Ins01Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1050_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getBulkSetR().immd_pick_prnt_flg()
					|| getBulkSetR().immd_inst_prnt_flg()
					|| getBulkSetR().immd_dlv_prnt_flg());
		}
	}

	/**
	 * [MS_MSBEL1050_Ins02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1050_Ins02Caller<P extends MSBEP_XfrListReg, B extends MS_MSBEL1050_Ins02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1050_Ins02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getBulkSetR().immd_dlv_prnt_flg());
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {

		if (isSrch01()) {
			callMS_MSBEL1050_Srch01();
		}
		else if (isSrch02()) {
			callMS_MSBEL1050_Srch02();
		}
		else if (isSrch03()) {
			callMS_MSBEL1050_Srch03();
		}
		else if (isSrch04()) {
			callMS_MSBEL1050_Srch04();
		}
		else if (isSrch05()) {
			callMS_MSBEL1050_Srch05();
		}
		else if (isSrch06()) {
			callMS_MSBEL1050_Srch06();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {

		if (isSrch01()) {
			createMS_MSBEL1050_Srch01().execDL();
		}
		else if (isSrch02()) {
			createMS_MSBEL1050_Srch02().execDL();
		}
		else if (isSrch03()) {
			createMS_MSBEL1050_Srch03().execDL();
		}
		else if (isSrch04()) {
			createMS_MSBEL1050_Srch04().execDL();
		}
		else if (isSrch05()) {
			createMS_MSBEL1050_Srch05().execDL();
		}
		else if (isSrch06()) {
			createMS_MSBEL1050_Srch06().execDL();
		}
	}

	protected boolean isSrch01() {

		if (Cnd_md_DTL.isSelected()) {
			if (Cnd_ope_INS.isSelected()
					&& Cnd_tgt_INST.isSelected()) {
				return true;
			}
			if (Cnd_ope_UPD.isSelected() 
					&& Cnd_tgt_SCHD.isSelected()) {
				return true;
			}
		}
		return false;
	}

	protected boolean isSrch02() {

		if (Cnd_md_DTL.isSelected() 
			&& Cnd_ope_INS.isSelected()
			&& Cnd_tgt_ACT.isSelected()) {
			return true;
		}
		return false;
	}

	protected boolean isSrch03() {

		if (Cnd_md_HDR.isSelected()
				&& Cnd_tgt_INST.isSelected()) {

			if (Cnd_ope_DEL.isSelected() 
					|| Cnd_ope_REF.isSelected()
					|| Cnd_ope_PRNT.isSelected()) {
				return true;
			}
		}
		else if (Cnd_md_DLV.isSelected()
				&& Cnd_tgt_INST.isSelected()
				&& Cnd_ope_PRNT.isSelected()) {
			return true;
		}
		return false;
	}

	protected boolean isSrch04() {

		if (Cnd_md_HDR.isSelected()
				&& Cnd_tgt_ACT.isSelected()) {

			if (Cnd_ope_DEL.isSelected() 
					|| Cnd_ope_REF.isSelected()
					|| Cnd_ope_PRNT.isSelected()) {
				return true;
			}
		}
		else if (Cnd_md_DLV.isSelected()
				&& Cnd_tgt_ACT.isSelected()
				&& Cnd_ope_PRNT.isSelected()) {
			return true;
		}
		return false;
	}

	protected boolean isSrch05() {

		if (Cnd_md_DTL.isSelected()
				&& Cnd_tgt_SCHD.isSelected()
				&& Cnd_ope_REF.isSelected()) {
				return true;
		}
		return false;
	}

	protected boolean isSrch06() {

		if (Cnd_md_DTL.isSelected()
				&& Cnd_tgt_ACT.isSelected()
				&& Cnd_ope_REF.isSelected()) {
				return true;
		}
		return false;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP1010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1010(MCEventInfo info) {

		if (isINST_INS()){
			MCList<RsltR> l = getRsltL().subList("check", true);
			if (l.isEmpty()){
				throw new MCAppException(FXBAP0038);
			}

			openPanel("MS", "MSBEP1010", T1, createBindMSBEP1010H(l), createBindMSBEP1010D(l));

		}
		else if (isACT_INS()
					|| isINST_PRNT()
					|| isACT_PRNT()
					|| isINST_DEL()
					|| isSCHD_REF()
					|| isACT_REF_HDR()
					|| isACT_REF_DTL()) {

			RsltR r = RsltTable.getSelectedMCRow();
			if (r == null) {
				dialog(msgNoSelectedRow());
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1010");
			aso.putCnd(crtOpenMSBEP1010CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}

	protected mcframe.clientMSBE.MSBEP1010.CndR crtOpenMSBEP1010CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1010.MSBEP_XfrInstReg p = (mcframe.clientMSBE.MSBEP1010.MSBEP_XfrInstReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1010.CndR to = mcframe.clientMSBE.MSBEP1010.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.xfr_inst_no());

		return to;
	}

	protected MCRow createBindMSBEP1010H(MCList<RsltR> l) {
		RsltR r = l.get(0);
		MCRow b = MCRow.create();
		MCDate min_xfr_schd_dt = (MCDate)l.min(RsltR.$xfr_schd_dt);

		b.setStringNE("trd_cd", r.trd_cd());
		b.setStringNE("gr_loc_cd", r.gr_loc_cd());
		b.setStringNE("gr_stk_arrv_bp_cd", r.gr_stk_arrv_bp_cd());
		b.setStringNE("wg_cd", r.wg_cd());
		b.setStringNE("lg_grp_cd", r.lg_grp_cd());
		b.setDateNE("xfr_schd_dt", min_xfr_schd_dt);
		b.setBooleanNE("pick_print", r.immd_pick_prnt_flg());
		b.setBooleanNE("inst_print", r.immd_inst_prnt_flg());
		b.setBooleanNE("dlv_print", r.immd_dlv_prnt_flg());
		return b;
	}
	protected MCList<mcframe.clientMSBE.MSBEP1010.DtlR> createBindMSBEP1010D(MCList<RsltR> l) {
		MCList<mcframe.clientMSBE.MSBEP1010.DtlR> bL = MCList.create(mcframe.clientMSBE.MSBEP1010.DtlR.class);
		for (RsltR r : getRsltL().subList("check", true)) {
			mcframe.clientMSBE.MSBEP1010.DtlR b = mcframe.clientMSBE.MSBEP1010.DtlR.create();

			b.setStatus(Status.CREATE);
			b.pr_sts_typ(r.pr_sts_typ());
			b.pr_sts_typ_nm(r.pr_sts_typ_nm());
			b.itm_cd(r.itm_cd());
			b.itm_sub1(r.itm_sub1());
			b.itm_sub2(r.itm_sub2());
			b.itm_sub3(r.itm_sub3());
			b.itm_nm(r.itm_nm());
			b.lot_mng_typ(r.lot_mng_typ());
			b.sublot_mng_typ(r.sublot_mng_typ());
			b.sno1_mng_typ(r.sno1_mng_typ());
			b.sno2_mng_typ(r.sno2_mng_typ());
			b.sno3_mng_typ(r.sno3_mng_typ());
			b.sno4_mng_typ(r.sno4_mng_typ());
			b.alloc_flg(r.alloc_flg());
			b.not_lot_mix_flg(r.not_lot_mix_flg());
			b.not_sublot_mix_flg(r.not_sublot_mix_flg());
			b.lot_no(r.lot_no());
			b.sublot_no(r.sublot_no());
			b.def_ver_flg(r.def_ver_flg());
			b.ver_no(r.ver_no());
			b.trd_unit_cd(r.trd_unit_cd());
			b.trd_unit_nm(r.trd_unit_nm());
			b.trd_unit_dec_place(r.trd_unit_dec_place());
			b.trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
			b.trd_unit_conv_qty(r.trd_unit_conv_qty());
			b.trd_unit_qty(r.trd_unit_qty());
			b.schd_abort_flg(r.abort_flg());
			b.base_unit_cd(r.base_unit_cd());
			b.base_unit_nm(r.base_unit_nm());
			b.base_unit_dec_place(r.base_unit_dec_place());
			b.base_unit_rnd_typ(r.base_unit_rnd_typ());
			b.base_unit_qty(r.base_unit_qty());
			b.base_unit_act_qty(r.base_unit_act_qty());
			b.pckg_unit_cd(r.pckg_unit_cd());
			b.pckg_unit_nm(r.pckg_unit_nm());
			b.pckg_unit_dec_place(r.pckg_unit_dec_place());
			b.pckg_unit_conv_base_qty(r.pckg_unit_conv_base_qty());
			b.pckg_unit_conv_qty(r.pckg_unit_conv_qty());
			b.pckg_unit_qty(r.pckg_unit_qty());
			b.schd_unit_cd(r.schd_unit_cd());
			b.schd_unit_nm(r.schd_unit_nm());
			b.schd_unit_dec_place(r.schd_unit_dec_place());
			b.schd_qty(r.schd_qty());
			b.cont_fctr_flg(r.cont_fctr_flg());
			b.act_cont_qty(r.act_cont_qty());
			b.act_cont_fctr(r.act_cont_fctr());
			b.std_cont_qty(r.std_cont_qty());
			b.std_cont_fctr(r.std_cont_fctr());
			b.cont_fctr_unit_cd(r.cont_fctr_unit_cd());
			b.cont_fctr_unit_nm(r.cont_fctr_unit_nm());
			b.cont_fctr_dec_place(r.cont_fctr_dec_place());
			b.cont_fctr_rnd_typ(r.cont_fctr_rnd_typ());
			b.gi_loc_cd(r.gi_loc_cd());
			b.gi_loc_nm(r.gi_loc_nm());
			b.gi_str_ln_tgt_flg(r.gi_str_ln_tgt_flg());
			b.gi_site_cd(r.gi_site_cd());
			b.gi_sppl_cd(r.gi_sppl_cd());
			b.gi_stk_arrv_bp_cd(r.gi_stk_arrv_bp_cd());
			b.gi_stk_arrv_bp_nm(r.gi_stk_arrv_bp_nm());
			b.gi_str_ln_cd(r.gi_str_ln_cd());
			b.gi_str_ln_nm(r.gi_str_ln_nm());
			b.gi_str_ln_cd_none_flg(r.gi_str_ln_cd_none_flg());
			b.gr_str_ln_cd(r.gr_str_ln_cd());
			b.gr_str_ln_nm(r.gr_str_ln_nm());
			b.gr_str_ln_cd_none_flg(r.gr_str_ln_cd_none_flg());
			b.gd_cd(r.gd_cd());
			b.gd_nm(r.gd_nm());
			b.quality_typ(r.quality_typ());
			b.quality_typ_nm(r.quality_typ_nm());
			b.sno1(r.sno1());
			b.sno2(r.sno2());
			b.sno3(r.sno3());
			b.sno4(r.sno4());
			b.wrk_no(r.wrk_no());
			b.wrk_nm(r.wrk_nm());
			b.sno1_null_flg(r.sno1_null_flg());
			b.sno2_null_flg(r.sno2_null_flg());
			b.sno3_null_flg(r.sno3_null_flg());
			b.sno4_null_flg(r.sno4_null_flg());
			b.alloc_sno1(r.alloc_sno1());
			b.alloc_sno2(r.alloc_sno2());
			b.alloc_sno3(r.alloc_sno3());
			b.alloc_sno4(r.alloc_sno4());
			b.stk_id_typ(r.stk_id_typ());
			b.stk_id_typ_nm(r.stk_id_typ_nm());
			b.stk_bp_cd(r.stk_bp_cd());
			b.stk_bp_nm(r.stk_bp_nm());
			b.rsn_cd(r.rsn_cd());
			b.rsn_nm(r.rsn_nm());
			b.acxfr_gi_flg(r.acxfr_gi_flg());
			b.bd_dpt_cd(r.bd_dpt_cd());
			b.bd_dpt_nm(r.bd_dpt_nm());
			b.skip_chk_ship_flg(r.skip_chk_ship_flg());
			b.prov_typ(r.prov_typ());
			b.prov_typ_nm(r.prov_typ_nm());
			b.prov_basis_typ(r.prov_basis_typ());
			b.prov_basis_typ_nm(r.prov_basis_typ_nm());
			b.ret_prov_typ(r.ret_prov_typ());
			b.ret_prov_typ_nm(r.ret_prov_typ_nm());
			b.ret_prov_basis_typ(r.ret_prov_basis_typ());
			b.ret_prov_basis_typ_nm(r.ret_prov_basis_typ_nm());
			b.trd_d_rmrks(r.trd_d_rmrks());
			b.prov_schd_no(r.prov_schd_no());
			b.ret_prov_schd_no(r.ret_prov_schd_no());
			b.xfr_alloc_sts_no(r.xfr_alloc_sts_no());
			b.xfr_schd_no(r.xfr_schd_no());
			b.xfr_src_typ(r.xfr_src_typ());
			b.xfr_src_typ_nm(r.xfr_src_typ_nm());
			b.xfr_src_no(r.xfr_src_no());
			b.io_schd_pr_no(r.io_schd_pr_no());
			b.alloc_sts_upd_cntr(r.alloc_sts_upd_cntr());
			b.wms_flg(r.wms_flg());
			b.wms_tgt_flg(r.wms_tgt_flg());
			b.base_dlv_slip_no(r.base_dlv_slip_no());
			b.base_prov_act_no(r.base_prov_act_no());
			b.base_ac_dt(r.base_ac_dt());
			bL.add(b);
		}
		return bL;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP1020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1020(MCEventInfo info) {

		if (isACT_INS()){
			MCList<RsltR> l = getRsltL().subList("check", true);
			if (l.isEmpty()){
				throw new MCAppException(FXBAP0038);
			}
			openPanel("MS", "MSBEP1020", T1, createBindMSBEP1020H(l), createBindMSBEP1020D(l));

		}
		else if (isACT_PRNT()
					|| isACT_DEL()
					|| isACT_REF_HDR()
					|| isACT_REF_DTL()) {

			RsltR r = RsltTable.getSelectedMCRow();
			if (r == null) {
				dialog(msgNoSelectedRow());
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1020");
			aso.putCnd(crtOpenMSBEP1020CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}

	protected mcframe.clientMSBE.MSBEP1020.CndR crtOpenMSBEP1020CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg p = (mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1020.CndR to = mcframe.clientMSBE.MSBEP1020.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.xfr_act_no());

		return to;
	}

	protected MCRow createBindMSBEP1020H(MCList<RsltR> l) {
		RsltR r = l.get(0);
		MCRow b = MCRow.create();

		b.setStringNE("trd_cd", r.trd_cd());
		b.setStringNE("gr_loc_cd", r.gr_loc_cd());
		b.setStringNE("xfr_inst_no", r.xfr_inst_no());
		b.setStringNE("gr_stk_arrv_bp_cd", r.gr_stk_arrv_bp_cd());
		b.setStringNE("wg_cd", r.wg_cd());
		b.setStringNE("lg_grp_cd", r.lg_grp_cd());
		b.setStringNE("sppl_cd", r.gr_sppl_cd());

		return b;
	}
	protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> createBindMSBEP1020D(MCList<RsltR> l) {
		MCList<mcframe.clientMSBE.MSBEP1020.DtlR> bL = MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class);
		for (RsltR r : getRsltL().subList("check", true)) {
			mcframe.clientMSBE.MSBEP1020.DtlR b = mcframe.clientMSBE.MSBEP1020.DtlR.create();

			b.setStatus(Status.CREATE);
			b.pr_sts_typ(r.pr_sts_typ());
			b.pr_sts_typ_nm(r.pr_sts_typ_nm());
			b.itm_cd(r.itm_cd());
			b.itm_sub1(r.itm_sub1());
			b.itm_sub2(r.itm_sub2());
			b.itm_sub3(r.itm_sub3());
			b.itm_nm(r.itm_nm());
			b.lot_mng_typ(r.lot_mng_typ());
			b.sublot_mng_typ(r.sublot_mng_typ());
			b.lot_no(r.lot_no());
			b.sublot_no(r.sublot_no());
			b.ver_flg(r.def_ver_flg());
			b.ver_no(r.ver_no());
			b.not_lot_mix_flg(r.not_lot_mix_flg());
			b.not_sublot_mix_flg(r.not_sublot_mix_flg());
			b.trd_unit_cd(r.trd_unit_cd());
			b.trd_unit_nm(r.trd_unit_nm());
			b.trd_unit_dec_place(r.trd_unit_dec_place());
			b.trd_unit_conv_qty(r.trd_unit_conv_qty());
			b.trd_unit_rnd_typ(r.trd_unit_rnd_typ());
			b.trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
			b.trd_unit_qty(r.trd_unit_qty());
			b.abort_flg(r.abort_flg());
			b.base_unit_cd(r.base_unit_cd());
			b.base_unit_nm(r.base_unit_nm());
			b.base_unit_dec_place(r.base_unit_dec_place());
			b.base_unit_rnd_typ(r.base_unit_rnd_typ());
			b.base_unit_qty(r.base_unit_qty());
			b.base_unit_act_qty(r.base_unit_act_qty());
			b.base_unit_schd_qty(r.base_unit_schd_qty());
			b.base_unit_inst_qty(r.base_unit_inst_qty());
			b.act_cont_qty(r.act_cont_qty());
			b.act_cont_fctr(r.act_cont_fctr());
			b.std_cont_qty(r.std_cont_qty());
			b.std_cont_fctr(r.std_cont_fctr());
			b.cont_fctr_unit_cd(r.cont_fctr_unit_cd());
			b.cont_fctr_unit_nm(r.cont_fctr_unit_nm());
			b.gi_loc_cd(r.gi_loc_cd());
			b.gi_loc_nm(r.gi_loc_nm());
			b.gi_str_ln_tgt_flg(r.gi_str_ln_tgt_flg());
			b.gi_site_cd(r.gi_site_cd());
			b.gi_str_ln_cd(r.gi_str_ln_cd());
			b.gi_str_ln_nm(r.gi_str_ln_nm());
			b.gi_str_ln_cd_none_flg(r.gi_str_ln_cd_none_flg());
			b.gr_str_ln_tgt_flg(r.gr_str_ln_tgt_flg());
			b.gr_str_ln_cd(r.gr_str_ln_cd());
			b.gr_str_ln_nm(r.gr_str_ln_nm());
			b.gr_str_ln_cd_none_flg(r.gr_str_ln_cd_none_flg());
			b.quality_typ(r.quality_typ());
			b.quality_typ_nm(r.quality_typ_nm());
			b.gd_cd(r.gd_cd());
			b.gd_nm(r.gd_nm());
			b.stk_insp_typ(r.stk_insp_typ());
			b.stk_insp_typ_nm(r.stk_insp_typ_nm());
			b.sno1_mng_typ(r.sno1_mng_typ());
			b.sno2_mng_typ(r.sno2_mng_typ());
			b.sno3_mng_typ(r.sno3_mng_typ());
			b.sno4_mng_typ(r.sno4_mng_typ());
			b.sno1(r.alloc_sno1());
			b.sno2(r.alloc_sno2());
			b.sno3(r.alloc_sno3());
			b.sno4(r.alloc_sno4());
			b.schd_sno1(r.sno1());
			b.schd_sno2(r.sno2());
			b.schd_sno3(r.sno3());
			b.schd_sno4(r.sno4());
			b.sno1_null_flg(r.sno1_null_flg());
			b.sno2_null_flg(r.sno2_null_flg());
			b.sno3_null_flg(r.sno3_null_flg());
			b.sno4_null_flg(r.sno4_null_flg());
			b.wrk_no(r.wrk_no());
			b.wrk_nm(r.wrk_nm());
			b.stk_id_typ(r.stk_id_typ());
			b.stk_id_typ_nm(r.stk_id_typ_nm());
			b.stk_bp_cd(r.stk_bp_cd());
			b.stk_bp_nm(r.stk_bp_nm());
			b.gi_stk_arrv_bp_cd(r.gi_stk_arrv_bp_cd());
			b.gi_stk_arrv_bp_nm(r.gi_stk_arrv_bp_nm());
			b.gi_sppl_cd(r.gi_sppl_cd());
			b.rsn_cd(r.rsn_cd());
			b.rsn_nm(r.rsn_nm());
			b.acxfr_gi_flg(r.acxfr_gi_flg());
			b.bd_dpt_cd(r.bd_dpt_cd());
			b.bd_dpt_nm(r.bd_dpt_nm());
			b.skip_chk_ship_flg(r.skip_chk_ship_flg());
			b.prov_typ(r.prov_typ());
			b.prov_typ_nm(r.prov_typ_nm());
			b.prov_basis_typ(r.prov_basis_typ());
			b.prov_basis_typ_nm(r.prov_basis_typ_nm());
			b.ret_prov_typ(r.ret_prov_typ());
			b.ret_prov_typ_nm(r.ret_prov_typ_nm());
			b.ret_prov_basis_typ(r.ret_prov_basis_typ());
			b.ret_prov_basis_typ_nm(r.ret_prov_basis_typ_nm());
			b.prov_schd_no(r.prov_schd_no());
			b.ret_prov_schd_no(r.ret_prov_schd_no());
			b.trd_d_rmrks(r.trd_d_rmrks());
			b.xfr_src_typ(r.xfr_src_typ());
			b.xfr_src_typ_nm(r.xfr_src_typ_nm());
			b.xfr_src_no(r.xfr_src_no());
			b.xfr_schd_no(r.xfr_schd_no());
			b.xfr_alloc_sts_no(r.xfr_alloc_sts_no());
			b.xfr_inst_d_no(r.xfr_inst_d_no());
			b.xfr_act_d_no(r.xfr_act_d_no());
			b.dlv_slip_no(r.dlv_slip_no());
			b.dlv_slip_d_no(r.dlv_slip_d_no());
			b.disp_seq(r.inst_disp_seq());
			b.xfr_act_no(r.xfr_act_no());
			b.alloc_sts_upd_cntr(r.alloc_sts_upd_cntr());
			b.base_dlv_slip_no(r.base_dlv_slip_no());
			b.base_prov_act_no(r.base_prov_act_no());
			b.base_ac_dt(r.base_ac_dt());
			b.base_unit_qty_bef(MCNumber.ZERO);
			b.base_unit_act_qty_sum(r.base_unit_act_qty());
			bL.add(b);
		}
		return bL;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0060(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0060");
		aso.putCnd(crtOpenMSBEP0060CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0060.CndR crtOpenMSBEP0060CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0060.MSBEP_IoTrnsSrch p = (mcframe.clientMSBE.MSBEP0060.MSBEP_IoTrnsSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0060.CndR to = mcframe.clientMSBE.MSBEP0060.CndR.create();

		to.ope(p.Cnd_ope_SRCH_USE.getActionCommand());
		to.gr_prcd_flg(true);
		to.gr_sts_opn_grp_flg(true);
		to.gr_sts_ordsav_grp_flg(true);
		to.gr_sts_fix_grp_flg(true);
		to.gr_sts_schd_grp_flg(true);
		to.gr_sts_ord_grp_flg(true);
		to.gi_prcd_flg(true);
		to.gi_sts_opn_grp_flg(true);
		to.gi_sts_ordsav_grp_flg(true);
		to.gi_sts_fix_grp_flg(true);
		to.gi_sts_schd_grp_flg(true);
		to.gi_sts_ord_grp_flg(true);

		MCDate dt = r.xfr_act_dt();
		if(isNull(dt) || dt.gteDate(r.xfr_inst_dt())) {
			dt = r.xfr_inst_dt();
		}
		if(isNull(dt) || dt.gteDate(r.xfr_schd_dt())) {
			dt = r.xfr_schd_dt();
		}

		if(getToday().gtDate(dt)) {
			to.dt_fr(dt);
			to.dt_to(getToday());
		}
		else {
			to.dt_fr(getToday());
			to.dt_to(dt);
		}

		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.loc_cd(r.gi_loc_cd());
		to.sno1(r.alloc_sno1());
		to.sno2(r.alloc_sno2());
		to.sno3(r.alloc_sno3());
		to.sno4(r.alloc_sno4());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[prnt_pick]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_pick(MCEventInfo info) {
		_picklist = true;
		_instlist = false;
		_dlvlist = false;
		callMS_MSBEL1050_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_inst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_inst(MCEventInfo info) {
		_picklist = false;
		_instlist = true;
		_dlvlist = false;
		callMS_MSBEL1050_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_dlv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_dlv(MCEventInfo info) {
			if (isINST_PRNT()) {
				_picklist = false;
				_instlist = false;
				_dlvlist = true;
				callMS_MSBEL1050_Prnt01();
			}
			else if (isACT_PRNT()) {
				_dlvlist = true;
				callMS_MSBEL1050_Prnt02();
			}
	}
	/**
	 * Panel[Btn]のボタン[alloc]の押下時の処理
	 */
	@Override
	public void doBtn_alloc(MCEventInfo info) {
		callMS_MSBEL1050_Alc01();
	}
	/**
	 * Panel[Btn]のボタン[release_alloc]の押下時の処理
	 */
	@Override
	public void doBtn_release_alloc(MCEventInfo info) {
		callMS_MSBEL1050_Alc02();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		_toggleAll = true;
		doSelectAll(RsltTable);
		_toggleAll = false;
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		_toggleAll = true;
		doDeselectAll(RsltTable);
		_toggleAll = false;
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[pack_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_pack_select_all(MCEventInfo info) {
		_toggleAll = true;
		doSelectAll(RsltTable, columnRslt_pack_tgt_flg);
		_toggleAll = false;
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[pack_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_pack_deselect_all(MCEventInfo info) {
		_toggleAll = true;
		doDeselectAll(RsltTable, columnRslt_pack_tgt_flg);
		_toggleAll = false;
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd_inst]の押下時の処理
	 */
	@Override
	public void doBtn_upd_inst(MCEventInfo info) {
		callMS_MSBEL1050_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd_act]の押下時の処理
	 */
	@Override
	public void doBtn_upd_act(MCEventInfo info) {
		callMS_MSBEL1050_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[upd_schd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_schd(MCEventInfo info) {
		callMS_MSBEL1050_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_inst]の押下時の処理
	 */
	@Override
	public void doBtn_del_inst(MCEventInfo info) {
		callMS_MSBEL1050_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_act]の押下時の処理
	 */
	@Override
	public void doBtn_del_act(MCEventInfo info) {
		callMS_MSBEL1050_Del02();
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

		//数量項目
		Rslt_qty_p_PPanel.setRelateBeans(
			columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
			columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place, columnRslt_trd_unit_rnd_typ,
			columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty, columnRslt_base_unit_cd);

		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ, columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty);
		Rslt_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_pckg_qty_p_PPanel.setRelateBeans(columnRslt_pckg_unit_cd, columnRslt_pckg_unit_dec_place);
		Rslt_xfr_schd_qty_p_PPanel.setRelateBeans(columnRslt_schd_unit_cd, columnRslt_schd_unit_dec_place);

		//有効成分
		Rslt_act_cont_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_unit_qty, null,
												columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_std_cont_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_unit_qty, columnRslt_std_cont_fctr,
				null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);

		//品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);

		//版
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);

		//計上日
		BulkSet_ac_dt_p_PPanel.setRelateBeans(BulkSet_xfr_act_dt);

		//担当者部門
		BulkSet_inst_usr_dpt_p_PPanel.setRelateBeans(BulkSet_xfr_inst_dt);
		BulkSet_act_usr_dpt_p_PPanel.setRelateBeans(BulkSet_xfr_ac_dt);
		
		Rslt_qty_p_PPanel.columnQty_qty.setName("qty_p.qty");
		Rslt_base_unit_qty_p_PPanel.columnQty_qty.setName("base_unit_qty_p.qty");
		Rslt_schd_qty_p_PPanel.columnQty_qty.setName("schd_qty_p.qty");
		Rslt_inst_qty_p_PPanel.columnQty_qty.setName("inst_qty_p.qty");
		Rslt_act_qty_p_PPanel.columnQty_qty.setName("act_qty_p.qty");
		Rslt_pckg_qty_p_PPanel.columnQty_qty.setName("pckg_qty_p.qty");
		Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("gi_str_ln_p.str_ln_cd");
		Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("gi_str_ln_p.str_ln_nm");
		Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("gi_str_ln_p.str_ln_cd_none_flg");
		Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("gr_str_ln_p.str_ln_cd");
		Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("gr_str_ln_p.str_ln_nm");
		Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("gr_str_ln_p.str_ln_cd_none_flg");
		Rslt_act_cont_p_PPanel.columnContQty_cont_qty.setName("act_cont_p.cont_qty");
		Rslt_std_cont_p_PPanel.columnContQty_cont_qty.setName("std_cont_p.cont_qty");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno1.setName("sno_p.sno1");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.setName("sno_p.sno1_null_flg");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno2.setName("sno_p.sno2");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.setName("sno_p.sno2_null_flg");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno3.setName("sno_p.sno3");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.setName("sno_p.sno3_null_flg");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno4.setName("sno_p.sno4");
		Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.setName("sno_p.sno4_null_flg");
		Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_no.setName("sno_p.wrk_no");
		Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_nm.setName("sno_p.wrk_nm");
		Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_sno1.setName("alloc_sno_p.sno1");
		Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_sno2.setName("alloc_sno_p.sno2");
		Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_sno3.setName("alloc_sno_p.sno3");
		Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_sno4.setName("alloc_sno_p.sno4");
	}

	// -----------------------------------------------
	// init-screen

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
		setValueEx(Cnd_tgt_Group, Cnd_tgt_SCHD.getActionCommand());
		setValueEx(Cnd_md_Group, Cnd_md_DTL.getActionCommand());

		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, true);

		setValueEx(Cnd_not_alloc_flg, true);
		setValueEx(Cnd_alloc_flg, true);

		setValueEx(Cnd_schd_not_cmpl_flg, true);
		setValueEx(Cnd_schd_cmpl_flg, true);

		setValueEx(Cnd_pick_not_prnt_flg, true);
		setValueEx(Cnd_pick_prnt_flg, true);

		setValueEx(Cnd_inst_not_prnt_flg, true);
		setValueEx(Cnd_inst_prnt_flg, true);

		setValueEx(Cnd_dlv_not_prnt_flg, true);
		setValueEx(Cnd_dlv_prnt_flg, true);
	}

	@Override
	protected void fillSpaceForOpen() {
	}

	protected void fillSpace() {
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// status

	@Override
	public void setINST_INSStatus() {
		super.setINST_INSStatus();
		setBtnMode();
	}
	@Override
	public void setACT_INSStatus() {
		super.setACT_INSStatus();
		setBtnMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}

	@Override
	public void setINST_PRNTStatus() {
		super.setINST_PRNTStatus();
		setBtnMode();
	}
	
	@Override
	public void setINST_PRNT_DLVStatus() {
		super.setINST_PRNT_DLVStatus();
		setBtnMode();
	}

	@Override
	public void setACT_PRNTStatus() {
		super.setACT_PRNTStatus();
		setBtnMode();
	}
	
	@Override
	public void setACT_PRNT_DLVStatus() {
		super.setACT_PRNT_DLVStatus();
		setBtnMode();
	}

	@Override
	public void setINST_DELStatus() {
		super.setINST_DELStatus();
		setBtnMode();
	}

	@Override
	public void setACT_DELStatus() {
		super.setACT_DELStatus();
		setBtnMode();
	}

	@Override
	public void setACT_REF_HDRStatus() {
		super.setACT_REF_HDRStatus();
		setBtnMode();
	}

	@Override
	public void setACT_REFStatus() {
		super.setACT_REFStatus();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setBtnMode();
	}

	protected boolean isInsStatus() {
		return isSame(getStatus(), INST_INS) 
				|| isSame(getStatus(), ACT_INS);
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), INST_DEL) 
				|| isSame(getStatus(), ACT_DEL)
				;
	}

	protected boolean isPrntStatus() {
		return isSame(getStatus(), INST_PRNT)
				|| isSame(getStatus(), ACT_PRNT)
				;
	}

	protected boolean isRegStatus() {
		return isInsStatus() || isUpdStatus() || isDelStatus() || isPrntStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (isINST_INS()) {
			setINST_INSStatus();
		}
		else if (isACT_INS()) {
			setACT_INSStatus();
		}
		else if (isUPD()) {
			setUPDStatus();
		}
		else if (isINST_PRNT()) {
			if (Cnd_md_DLV.isSelected()) {
				setINST_PRNT_DLVStatus();
			}
			else {
				setINST_PRNTStatus();
			}
		}
		else if (isACT_PRNT()) {
			if (Cnd_md_DLV.isSelected()) {
				setACT_PRNT_DLVStatus();
			}
			else {
				setACT_PRNTStatus();
			}
		}
		else if (isINST_DEL()) {
			setINST_DELStatus();
		}
		else if (isACT_DEL()) {
			setACT_DELStatus();
		}
		else if (isACT_REF_DTL()) {
			setACT_REFStatus();
		}
		else if (isACT_REF_HDR()) {
			setACT_REF_HDRStatus();
		}
		else {
			setREFStatus();
		}

		setGroupStatus();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (isINST_INS()) {
			setINST_INSStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isACT_INS()) {
			setACT_INSStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isUPD()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isINST_PRNT()) {
			if (Cnd_md_DLV.isSelected()) {
				setINST_PRNT_DLVStatus();
			}
			else {
				setINST_PRNTStatus();
			}
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isACT_PRNT()) {
			if (Cnd_md_DLV.isSelected()) {
				setACT_PRNT_DLVStatus();
			}
			else {
				setACT_PRNTStatus();
			}
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isINST_DEL()) {
			setINST_DELStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isACT_DEL()) {
			setACT_DELStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isACT_REF_DTL()) {
			setACT_REFStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isACT_REF_HDR()) {
			setACT_REF_HDRStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else {
			setREFStatus();
			RsltTable.selectLeftmostColumn(0);
		}

		setGroupStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUPD()) {
			if (r == null) {
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_rdel);
				setDefaultMode(Btn_rcopy);
			}
		}

		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP1010(r)) {
			setDefaultMode(Btn_open_MSBEP1010);
		}
		else {
			Btn_open_MSBEP1010.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBEP1020(r)) {
			setDefaultMode(Btn_open_MSBEP1020);
		}
		else {
			Btn_open_MSBEP1020.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBEP0060(r)) {
			setDefaultMode(Btn_open_MSBEP0060);
		}
		else {
			Btn_open_MSBEP0060.setMode(MCMode.DISABLE);
		}

		//削除行が存在する場合は、引当、引当解除不可
		//追加行が存在する場合は、引当解除不可
		MCList<RsltR> l = getRsltL().subList("check", true);
		MCList<RsltR> delL = l.subList(delr -> delr.isStatusDelete());
		MCList<RsltR> insL = l.subList(insr -> insr.isStatusCreate());

		if (delL.size() > 0) {
			Btn_alloc.setMode(MCMode.DISABLE);
			Btn_release_alloc.setMode(MCMode.DISABLE);
		}
		else {
			if (insL.size() > 0) {
				setDefaultMode(Btn_alloc);
				Btn_release_alloc.setMode(MCMode.DISABLE);
			}
			else{
				setDefaultMode(Btn_alloc);
				setDefaultMode(Btn_release_alloc);
			}
		}
	}

	/**
	 * 移動指図登録画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP1010(RsltR row) {

		//指図登録時は行を引き継ぐ
		if (isINST_INS()){
			MCList<RsltR> l = getRsltL().subList("check", true);
			if (l.isEmpty()) {
				return false;
			}
			for (RsltR r : l) {
				if (MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())
						|| !MSC_PR_STS_TYP.isNOT_INST(r.pr_sts_typ())) {
					return false;
				}
			}
			if (!chkSameHeaderInst(l)) {
				return false;
			}
			return true;
		}
		else if (isACT_INS()
					|| isINST_PRNT()
					|| isACT_PRNT()
					|| isINST_DEL()
					|| isSCHD_REF()
					|| isACT_REF_HDR()
					|| isACT_REF_DTL()) {

			if (row == null) {
				return false;
			}

			return !MAC_STR.isNULL_VAL(row.xfr_inst_no()) && !isNull(row.xfr_inst_no());
		}
		return false;
	}

	protected boolean chkSameHeaderInst(MCList<RsltR> l) {

		//移動指図登録画面で移動予定日が変更可能なため、遷移条件から除く
		//異なる移動予定日の明細が選択されている場合は、最早の移動予定日を設定する
		return l.groupList(
				RsltR.$trd_cd,
				RsltR.$gr_loc_cd,
				RsltR.$gi_sppl_cd
				).length == 1;
	}

	/**
	 * 移動実績登録画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP1020(RsltR row) {

		//実績登録時は行を引き継ぐ
		if (isACT_INS()){
			MCList<RsltR> l = getRsltL().subList("check", true);
			if (l.isEmpty()) {
				return false;
			}
			for (RsltR r : l) {
				//指図対象外の場合は、指図済、完了の時は不可
				if (MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())
						&& (MSC_PR_STS_TYP.isINST(r.pr_sts_typ())
								|| MSC_PR_STS_TYP.isCOMP(r.pr_sts_typ()))) {
					return false;
				}
				//指図対象外でない場合は、未指図、完了の時は不可
				if (!MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())
						&& (MSC_PR_STS_TYP.isNOT_INST(r.pr_sts_typ())
								|| MSC_PR_STS_TYP.isCOMP(r.pr_sts_typ()))) {
					return false;
				}
			}
			if (!chkSameHeaderAct(l)) {
				return false;
			}
			return true;
		}
		else if (isACT_PRNT()
					|| isACT_DEL()
					|| isACT_REF_HDR()
					|| isACT_REF_DTL()) {

			if (row == null) {
				return false;
			}

			return !MAC_STR.isNULL_VAL(row.xfr_act_no()) && !isNull(row.xfr_act_no());
		}
		return false;
	}

	protected boolean chkSameHeaderAct(MCList<RsltR> l) {
		return l.groupList(
				RsltR.$trd_cd,
				RsltR.$xfr_inst_no,
				RsltR.$gr_loc_cd,
				RsltR.$gi_sppl_cd
				).length == 1;
	}

	/**
	 * 在庫推移照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0060(RsltR row) {

		if (Cnd_md_HDR.isSelected()) {
			return false;
		}

		if (row == null) {
			return false;
		}

		return true;
	}

	// -----------------------------------------------
	// Event

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
		clearBulkSet();
		setBulkSet();
		setSrchStatus();
		setStatusColumn();
	}

	protected void setGroupStatus() {
		//条件付きラジオボタンの入力制御
		if (Cnd_ope_INS.isSelected()) {
			Cnd_tgt_SCHD.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_UPD.isSelected()) {
		}
		else if (Cnd_ope_DEL.isSelected()) {
			Cnd_tgt_SCHD.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			Cnd_tgt_SCHD.setMode(MCMode.READ_ONLY);
			Cnd_md_DTL.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_REF.isSelected()) {
			Cnd_tgt_INST.setMode(MCMode.READ_ONLY);

			if (Cnd_tgt_SCHD.isSelected()) {
				Cnd_md_Group.setMode(MCMode.READ_ONLY);
			}
			else {
				Cnd_md_Group.setMode(MCMode.REQUIRED);
			}
			Cnd_md_DLV.setMode(MCMode.READ_ONLY);
		}
	}

	protected void clearCnd() {

		if (Cnd_ope_INS.isSelected()) {

			setValueEx(Cnd_md_Group, Cnd_md_DTL.getActionCommand());

			if (Cnd_tgt_SCHD.isSelected()) {
				setValueEx(Cnd_tgt_Group, Cnd_tgt_INST.getActionCommand());
			}

			if (Cnd_tgt_INST.isSelected()) {
				clearCndInstIns();
			}
			else if (Cnd_tgt_ACT.isSelected()) {
				clearCndActIns();
			}
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_tgt_Group, Cnd_tgt_SCHD.getActionCommand());
			setValueEx(Cnd_md_Group, Cnd_md_DTL.getActionCommand());
			clearCndUpd();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			if (Cnd_md_DTL.isSelected()) {
				setValueEx(Cnd_md_Group, Cnd_md_HDR.getActionCommand());
			}

			if (Cnd_tgt_SCHD.isSelected()) {
				setValueEx(Cnd_tgt_Group, Cnd_tgt_INST.getActionCommand());
			}

			if (Cnd_tgt_INST.isSelected()) {
				clearCndInsPrnt();
			}
			else if (Cnd_tgt_ACT.isSelected()) {
				clearCndActPrnt();
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {

			setValueEx(Cnd_md_Group, Cnd_md_HDR.getActionCommand());

			if (Cnd_tgt_SCHD.isSelected()) {
				setValueEx(Cnd_tgt_Group, Cnd_tgt_INST.getActionCommand());
			}

			if (Cnd_tgt_INST.isSelected()) {
				clearCndInstDel();
			}
			else if (Cnd_tgt_ACT.isSelected()) {
				clearCndActDel();
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_tgt_INST.isSelected()) {
				setValueEx(Cnd_tgt_Group, Cnd_tgt_SCHD.getActionCommand());
			}
			if (Cnd_tgt_SCHD.isSelected() || Cnd_md_DLV.isSelected()) {
				setValueEx(Cnd_md_Group, Cnd_md_DTL.getActionCommand());
			}

			if (isACT_REF_DTL()) {
				clearCndActRefDtl();
			}
			else if (isACT_REF_HDR()) {
				clearCndActRefHdr();
			}
			else {
				clearCndRef();
			}
		}
		setValueEx(Cnd_ext_xfr_act_no, null);
		clearCndWmsTrgt();

	}

	protected void clearCndWmsTrgt() {
		if (_bothWmsFlgs()) {
			setValueEx(Cnd_wms_flg, true);
			setValueEx(Cnd_not_wms_flg, true);

		}
		else if (_onlyOneWmsFlg()) {

			setValueEx(Cnd_wms_flg, false);
			setValueEx(Cnd_not_wms_flg, true);
		}
		else {
			//この条件下ではチェックボックスが入力不可になり
			//検索条件の上り電文では使用しないことが前提
			setValueEx(Cnd_wms_flg, true);
			setValueEx(Cnd_not_wms_flg, true);
		}
	}

	protected boolean _bothWmsFlgs() {
		return isINST_INS() || isUPD() ||  isSCHD_REF() || isACT_REF_DTL() || isACT_REF_HDR();
	}

	protected boolean _onlyOneWmsFlg() {
		return  isACT_INS() || isACT_PRNT() || isACT_DEL();
	}

	protected void clearCndInstIns() {
		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, false);
		setValueEx(Cnd_p_xfr_flg, false);
		setValueEx(Cnd_sts_cmpl_flg, false);

		setValueEx(Cnd_schd_not_cmpl_flg, true);
		setValueEx(Cnd_schd_cmpl_flg, true);
		setValueEx(Cnd_pick_not_prnt_flg, true);
		setValueEx(Cnd_pick_prnt_flg, true);
		setValueEx(Cnd_inst_not_prnt_flg, true);
		setValueEx(Cnd_inst_prnt_flg, true);
		setValueEx(Cnd_dlv_not_prnt_flg, true);
		setValueEx(Cnd_dlv_prnt_flg, true);

		setValueEx(Cnd_pr_rate_fr, null);
		setValueEx(Cnd_pr_rate_to, null);

		setValueEx(Cnd_abort_flg, false);

		setValueEx(Cnd_ship_inst_typ, null);

		clearCndInst();
		clearCndAct();
	}

	protected void clearCndActIns() {
		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, false);

		setValueEx(Cnd_schd_not_cmpl_flg, true);
		setValueEx(Cnd_schd_cmpl_flg, true);

		setValueEx(Cnd_pr_rate_fr, null);
		setValueEx(Cnd_pr_rate_to, null);

		setValueEx(Cnd_abort_flg, false);

		setValueEx(Cnd_ship_inst_typ, null);

		clearCndAct();
	}

	protected void clearCndUpd() {
		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, false);
		setValueEx(Cnd_p_xfr_flg, false);
		setValueEx(Cnd_sts_cmpl_flg, false);

		setValueEx(Cnd_schd_not_cmpl_flg, true);
		setValueEx(Cnd_schd_cmpl_flg, true);
		setValueEx(Cnd_pick_not_prnt_flg, true);
		setValueEx(Cnd_pick_prnt_flg, true);
		setValueEx(Cnd_inst_not_prnt_flg, true);
		setValueEx(Cnd_inst_prnt_flg, true);
		setValueEx(Cnd_dlv_not_prnt_flg, true);
		setValueEx(Cnd_dlv_prnt_flg, true);

		setValueEx(Cnd_pr_rate_fr, null);
		setValueEx(Cnd_pr_rate_to, null);

		setValueEx(Cnd_ship_inst_typ, null);

		clearCndInst();
		clearCndAct();
	}

	protected void clearCndInsPrnt() {

		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, true);
		if (Cnd_md_HDR.isSelected()) {
			setValueEx(Cnd_dlv_slip_no, null);
		}

		clearCndAct();
		clearCndDtl();
	}

	protected void clearCndActPrnt() {
		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, true);
		if (Cnd_md_HDR.isSelected()) {
			setValueEx(Cnd_dlv_slip_no, null);
		}

		clearCndDtl();
	}

	protected void clearCndInstDel() {
		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, true);
		setValueEx(Cnd_dlv_slip_no, null);

		clearCndAct();
		clearCndDtl();
	}

	protected void clearCndActDel() {
		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, true);
		setValueEx(Cnd_dlv_slip_no, null);

		clearCndDtl();
	}

	protected void clearCndActRefDtl() {

		setValueEx(Cnd_not_inst_flg, false);
		setValueEx(Cnd_inst_flg, false);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, true);
		setValueEx(Cnd_abort_flg, true);

		setValueEx(Cnd_not_alloc_flg, true);
		setValueEx(Cnd_alloc_flg, true);

		setValueEx(Cnd_pr_rate_fr, null);
		setValueEx(Cnd_pr_rate_to, null);

	}

	protected void clearCndActRefHdr() {

		setValueEx(Cnd_not_inst_flg, false);
		setValueEx(Cnd_inst_flg, false);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, true);
		setValueEx(Cnd_dlv_slip_no, null);

		clearCndDtl();
	}

	protected void clearCndRef() {

		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_p_xfr_flg, true);
		setValueEx(Cnd_sts_cmpl_flg, true);

		setValueEx(Cnd_schd_not_cmpl_flg, true);
		setValueEx(Cnd_schd_cmpl_flg, true);
		setValueEx(Cnd_pick_not_prnt_flg, true);
		setValueEx(Cnd_pick_prnt_flg, true);
		setValueEx(Cnd_inst_not_prnt_flg, true);
		setValueEx(Cnd_inst_prnt_flg, true);
		setValueEx(Cnd_dlv_not_prnt_flg, true);
		setValueEx(Cnd_dlv_prnt_flg, true);
		
		setValueEx(Cnd_abort_flg, false);

		clearCndAct();
	}

	protected void clearCndInst() {
		//指図に関する検索条件をクリアする
		setValueEx(Cnd_xfr_inst_dt_fr, null);
		setValueEx(Cnd_xfr_inst_dt_to, null);
		setValueEx(Cnd_inst_usr_cd, null);
		setValueEx(Cnd_inst_dpt_cd, null);

		setValueEx(Cnd_trd_rmrks, null);
		setValueEx(Cnd_inst_rmrks, null);
		setValueEx(Cnd_h_sub_char1, null);
		setValueEx(Cnd_h_sub_char2, null);
		setValueEx(Cnd_h_sub_char3, null);
		setValueEx(Cnd_intr_d_rmrks, null);
		setValueEx(Cnd_trd_d_rmrks, null);
		setValueEx(Cnd_inst_d_rmrks, null);
		setValueEx(Cnd_d_sub_char1, null);
		setValueEx(Cnd_d_sub_char2, null);
		setValueEx(Cnd_d_sub_char3, null);

		setValueEx(Cnd_dlv_slip_no, null);
		setValueEx(Cnd_dlv_slip_d_no, null);

		setValueEx(Cnd_xfr_inst_no, null);
		setValueEx(Cnd_xfr_inst_d_no, null);
	}

	protected void clearCndAct() {
		//実績に関する検索条件をクリアする
		setValueEx(Cnd_xfr_act_dt_fr, null);
		setValueEx(Cnd_xfr_act_dt_to, null);
		setValueEx(Cnd_xfr_ac_dt_fr, null);
		setValueEx(Cnd_xfr_ac_dt_to, null);

		setValueEx(Cnd_act_usr_cd, null);
		setValueEx(Cnd_act_dpt_cd, null);

		setValueEx(Cnd_intr_rmrks, null);

		setValueEx(Cnd_xfr_act_no, null);
		setValueEx(Cnd_xfr_act_d_no, null);
	}

	protected void clearCndDtl() {
		//明細に関する検索条件をクリアする

		setValueEx(Cnd_not_alloc_flg, true);
		setValueEx(Cnd_alloc_flg, true);
		setValueEx(Cnd_schd_not_cmpl_flg, true);
		setValueEx(Cnd_schd_cmpl_flg, true);

		setValueEx(Cnd_xfr_schd_dt_fr, null);
		setValueEx(Cnd_xfr_schd_dt_to, null);

		setValueEx(Cnd_pr_rate_fr, null);
		setValueEx(Cnd_pr_rate_to, null);

		setValueEx(Cnd_gi_loc_cd, null);
		setValueEx(Cnd_gi_loc_nm, null);
		setValueEx(Cnd_gi_str_ln_cd, null);
		setValueEx(Cnd_gi_str_ln_nm, null);
		setValueEx(Cnd_gi_site_cd, null);
		setValueEx(Cnd_gi_site_nm, null);
		setValueEx(Cnd_gi_stk_arrv_bp_cd, null);
		setValueEx(Cnd_gi_stk_arrv_bp_nm, null);
		setValueEx(Cnd_gr_str_ln_cd, null);
		setValueEx(Cnd_gr_str_ln_nm, null);
		setValueEx(Cnd_itm_typ, null);
		setValueEx(Cnd_itm_typ_d_cd, null);
		setValueEx(Cnd_itm_typ_d_nm, null);
		setValueEx(Cnd_itm_cd, null);
		setValueEx(Cnd_itm_sub1, null);
		setValueEx(Cnd_itm_sub2, null);
		setValueEx(Cnd_itm_sub3, null);
		setValueEx(Cnd_itm_nm, null);
		setValueEx(Cnd_ver_no, null);
		setValueEx(Cnd_lot_no, null);
		setValueEx(Cnd_sublot_no, null);
		setValueEx(Cnd_sno1, null);
		setValueEx(Cnd_sno2, null);
		setValueEx(Cnd_sno3, null);
		setValueEx(Cnd_sno4, null);
		setValueEx(Cnd_wrk_no, null);
		setValueEx(Cnd_wrk_nm, null);

		setValueEx(Cnd_abort_flg, false);

		setValueEx(Cnd_trd_unit_cd, null);
		setValueEx(Cnd_trd_unit_nm, null);
		setValueEx(Cnd_base_unit_cd, null);
		setValueEx(Cnd_base_unit_nm, null);
		setValueEx(Cnd_pckg_unit_cd, null);
		setValueEx(Cnd_pckg_unit_nm, null);
		setValueEx(Cnd_gd_cd, null);
		setValueEx(Cnd_gd_nm, null);
		setValueEx(Cnd_quality_typ, null);
		setValueEx(Cnd_stk_insp_typ, null);
		setValueEx(Cnd_stk_id_typ, null);
		setValueEx(Cnd_stk_bp_cd, null);
		setValueEx(Cnd_stk_bp_nm, null);
		setValueEx(Cnd_rqst_usr_cd, null);
		setValueEx(Cnd_rqst_usr_nm, null);
		setValueEx(Cnd_rqst_dpt_cd, null);
		setValueEx(Cnd_rqst_dpt_nm, null);
		setValueEx(Cnd_ship_inst_typ, null);
		setValueEx(Cnd_ship_inst_typ_nm, null);
		setValueEx(Cnd_rsn_cd, null);
		setValueEx(Cnd_rsn_nm, null);
		setValueEx(Cnd_bd_dpt_cd, null);
		setValueEx(Cnd_bd_dpt_nm, null);

		setValueEx(Cnd_rqst_mod_flg, false);

		setValueEx(Cnd_intr_d_rmrks, null);
		setValueEx(Cnd_trd_d_rmrks, null);
		setValueEx(Cnd_inst_d_rmrks, null);
		setValueEx(Cnd_d_sub_char1, null);
		setValueEx(Cnd_d_sub_char2, null);
		setValueEx(Cnd_d_sub_char3, null);
		setValueEx(Cnd_rqst_cnt_rmrks, null);
		setValueEx(Cnd_ship_cnt_rmrks, null);
		setValueEx(Cnd_schd_intr_rmrks, null);
		setValueEx(Cnd_xfr_src_typ, null);
		setValueEx(Cnd_xfr_src_no, null);
		setValueEx(Cnd_xfr_schd_no, null);
		setValueEx(Cnd_xfr_alloc_sts_no, null);

		setValueEx(Cnd_xfr_inst_d_no, null);
		setValueEx(Cnd_xfr_act_d_no, null);
		setValueEx(Cnd_slo_no, null);
		setValueEx(Cnd_mfg_inst_no, null);
		setValueEx(Cnd_oper_inst_no, null);
		setValueEx(Cnd_io_schd_pr_no, null);

		setValueEx(Cnd_itm_grp_flg1, false);
		setValueEx(Cnd_itm_grp_flg2, false);
		setValueEx(Cnd_itm_grp_flg3, false);
		setValueEx(Cnd_itm_grp_flg4, false);
		setValueEx(Cnd_itm_grp_flg5, false);
		setValueEx(Cnd_itm_grp_flg6, false);
		setValueEx(Cnd_itm_grp_flg7, false);
		setValueEx(Cnd_itm_grp_flg8, false);
		setValueEx(Cnd_itm_grp_flg9, false);
		setValueEx(Cnd_itm_grp_flg10, false);
	}

	protected void clearBulkSet() {
		//一括設定のクリア
		setValueEx(BulkSet_xfr_schd_dt, null);
		setValueEx(BulkSet_xfr_inst_dt, null);
		setValueEx(BulkSet_xfr_act_dt, null);
		setValueEx(BulkSet_xfr_ac_dt, null);
		setValueEx(BulkSet_inst_usr_cd, null);
		setValueEx(BulkSet_inst_dpt_cd, null);
		setValueEx(BulkSet_act_usr_cd, null);
		setValueEx(BulkSet_act_dpt_cd, null);

		setValueEx(BulkSet_immd_pick_prnt_flg, false);
		setValueEx(BulkSet_immd_inst_prnt_flg, false);
		setValueEx(BulkSet_immd_dlv_prnt_flg, false);
		setValueEx(BulkSet_agg_gi_loc_flg, false);
	}

	protected void setBulkSet() {
		//一括設定の初期設定

		if (isINST_INS()) {
			setValueEx(BulkSet_xfr_inst_dt, getToday());
			setValueEx(BulkSet_immd_pick_prnt_flg, true);
			setValueEx(BulkSet_immd_inst_prnt_flg, true);
			setValueEx(BulkSet_immd_dlv_prnt_flg, true);
		}
		else if (isACT_INS()) {
			setValueEx(BulkSet_xfr_act_dt, getToday());
			setValueEx(BulkSet_immd_dlv_prnt_flg, true);
		}
		else if (isINST_DEL()) {
			setValueEx(BulkSet_immd_dlv_prnt_flg, true);
		}
		else if (isACT_DEL()) {
			setValueEx(BulkSet_immd_dlv_prnt_flg, true);
		}
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	@Override
	public boolean doCnd_tgt_VC(MCEventInfo info) {
		if (!super.doCnd_tgt_VC(info)) {
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
	public void doCnd_tgt_NC(MCEventInfo info) {
		super.doCnd_tgt_NC(info);

		clearContainers(getRsltL());
		clearCnd();
		clearBulkSet();
		setBulkSet();
		setSrchStatus();
		setStatusColumn();
	}

	@Override
	public boolean doCnd_md_VC(MCEventInfo info) {
		if (!super.doCnd_md_VC(info)) {
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
	public void doCnd_md_NC(MCEventInfo info) {
		super.doCnd_md_NC(info);

		clearContainers(getRsltL());
		clearCnd();
		setSrchStatus();
		setStatusColumn();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);

			if (isSCHD_REF()
					&& isEnableBtn_open_MSBEP1010(r)) {
				doBtn_open_MSBEP1010(info);
			}
			else if ((isACT_REF_HDR() || isACT_REF_DTL())
					&& isEnableBtn_open_MSBEP1020(r)) {
				doBtn_open_MSBEP1020(info);
			}
		}

	}

	protected boolean isINST_INS() {
		return Cnd_ope_INS.isSelected() && Cnd_tgt_INST.isSelected();
	}

	protected boolean isACT_INS() {
		return Cnd_ope_INS.isSelected() && Cnd_tgt_ACT.isSelected();
	}

	protected boolean isUPD() {
		return Cnd_ope_UPD.isSelected();
	}

	protected boolean isINST_PRNT() {
		return Cnd_ope_PRNT.isSelected() && Cnd_tgt_INST.isSelected();
	}

	protected boolean isACT_PRNT() {
		return Cnd_ope_PRNT.isSelected() && Cnd_tgt_ACT.isSelected();
	}

	protected boolean isINST_DEL() {
		return Cnd_ope_DEL.isSelected() && Cnd_tgt_INST.isSelected();
	}

	protected boolean isACT_DEL() {
		return Cnd_ope_DEL.isSelected() && Cnd_tgt_ACT.isSelected();
	}

	protected boolean isSCHD_REF() {
		return Cnd_ope_REF.isSelected() && Cnd_tgt_SCHD.isSelected() && Cnd_md_DTL.isSelected();
	}

	protected boolean isACT_REF_DTL() {
		return Cnd_ope_REF.isSelected() && Cnd_tgt_ACT.isSelected() && Cnd_md_DTL.isSelected();
	}

	protected boolean isACT_REF_HDR() {
		return Cnd_ope_REF.isSelected() && Cnd_tgt_ACT.isSelected() && Cnd_md_HDR.isSelected();
	}

	@Override
	public void doRslt_pack_tgt_flg_NC(MCEventInfo info){
		super.doRslt_pack_tgt_flg_NC(info);

		if(!_toggleAll) {
			setBtnMode();
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info){
		super.doRslt_check_NC(info);

		if(!_toggleAll) {
			RsltR dtl = getRsltL().get(info.getEventIndex());
			if (dtl.check() && getBtnR().collect_flg()) {
				selectSameHeader(dtl);
			}

			if (isUPD()) {
				selectSameAllocSts(dtl);
			}
			setBtnMode();
		}
	}

	/**
	 * 指定された行とヘッダ項目名が同じ行を選択する。<br>
	 * それ以外の行の選択を解除する。
	 */
	protected void selectSameHeader(RsltR dtl) {
		for (RsltR data : RsltTable.getViewRows()) {
			if (isINST_INS()){
				//指図時のヘッダ条件は取引ＣＤ、移動予定日、入庫場所ＣＤ、出庫発注先ＣＤ、受注ＮＯ
				//出庫場所まとめがオンの場合は、出庫発注先ＣＤの代わりに出庫場所ＣＤを条件とする
				if (BulkSet_agg_gi_loc_flg.getValue()){
					data.check(isSame(dtl.trd_cd(), data.trd_cd())
							&& isSame(dtl.xfr_schd_dt(), data.xfr_schd_dt())
							&& isSame(dtl.gr_loc_cd(), data.gr_loc_cd())
							&& isSame(dtl.gi_loc_cd(), data.gi_loc_cd())
							&& isSame(dtl.slo_no(), data.slo_no())
							);
				}
				else {
					data.check(isSame(dtl.trd_cd(), data.trd_cd())
							&& isSame(dtl.xfr_schd_dt(), data.xfr_schd_dt())
							&& isSame(dtl.gr_loc_cd(), data.gr_loc_cd())
							&& isSame(dtl.gi_sppl_cd(), data.gi_sppl_cd())
							&& isSame(dtl.slo_no(), data.slo_no())
							);
				}
			}
			else if (isACT_INS()){
				//実績時のヘッダ条件は取引ＣＤ、指図ＮＯ、入庫場所ＣＤ、出庫発注先ＣＤ、受注ＮＯ
				//出庫場所まとめがオンの場合は、出庫発注先ＣＤの代わりに出庫場所ＣＤを条件とする
				if (BulkSet_agg_gi_loc_flg.getValue()){
					data.check(isSame(dtl.trd_cd(), data.trd_cd())
							&& isSame(dtl.xfr_inst_no(), data.xfr_inst_no())
							&& isSame(dtl.gr_loc_cd(), data.gr_loc_cd())
							&& isSame(dtl.gi_loc_cd(), data.gi_loc_cd())
							&& isSame(dtl.slo_no(), data.slo_no())
							);
				}
				else {
					data.check(isSame(dtl.trd_cd(), data.trd_cd())
							&& isSame(dtl.xfr_inst_no(), data.xfr_inst_no())
							&& isSame(dtl.gr_loc_cd(), data.gr_loc_cd())
							&& isSame(dtl.gi_sppl_cd(), data.gi_sppl_cd())
							&& isSame(dtl.slo_no(), data.slo_no())
							);
				}
			}
		}
	}

	/**
	 * 指定された行と同じ移動引当状況のレコードを選択する。
	 */
	protected void selectSameAllocSts(RsltR dtl) {
		if (dtl.check()) {
			for (RsltR data : RsltTable.getViewRows()) {
				if (isSame(dtl.xfr_alloc_sts_no(), data.xfr_alloc_sts_no())) {
					data.check(true);
				}
			}
		}
		else {
			for (RsltR data : RsltTable.getViewRows()) {
				if (isSame(dtl.xfr_alloc_sts_no(), data.xfr_alloc_sts_no())) {
					data.check(false);
				}
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
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if(isUPD() && !MSC_PR_STS_TYP.isNOT_INST(r.pr_sts_typ())) {
				if(!(column == columnRslt_check
						|| column == columnRslt_abort_flg)) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_pack_tgt_flg) {
				if (r.pack_disable_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}