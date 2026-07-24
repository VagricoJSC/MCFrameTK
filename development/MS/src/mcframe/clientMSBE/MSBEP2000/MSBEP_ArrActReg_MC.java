package mcframe.clientMSBE.MSBEP2000;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5300.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5330.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5040.*;
import mcframe.clientMSUB.MSUBP5050.*;
import mcframe.clientMSUB.MSUBP5060.*;

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
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil.*;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.*;
import java.util.Map;
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_ArrActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ArrActReg_MC extends MSBEP_ArrActReg_MC_A implements IfListRegPanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _$org_lot_no = "__lot_no__";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ArrActReg_MC() {
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
	public MSBEP_ArrActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_dtl(r);
	}
	/**
	 * Panel[Btn]のボタン[open_schd]の押下時の処理
	 */
	@Override
	public void doBtn_open_schd(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_schd(r);
	}
	/**
	 * Panel[Btn]のボタン[open_act]の押下時の処理
	 */
	@Override
	public void doBtn_open_act(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_act(r);
	}
	/**
	 * [MS_MSBEL2000_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2000_Srch01Caller<P extends MSBEP_ArrActReg, B extends MS_MSBEL2000_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL2000_Srch01Caller(P p, B b) {
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
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
						|| (isNull(r.purc_act_no()) 
								&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())))) {
					// 売上返品、または、仕入・経費購買で仕入実績がない場合、在庫がまだないため在庫の情報はnullで表示
					r.quality_typ(null);
					r.quality_typ_nm(null);
					r.stk_id_typ(null);
					r.stk_id_typ_nm(null);
					r.stk_bp_cd(null);
					r.stk_bp_nm(null);
				}
				// 検索時の打切ＦＬＧの値を保持するため隠し項目へコピー
				r.init_abort_flg(r.abort_flg());
			}
		}
		@Override
		protected void show() {
			super.show();
			// ロット作成フラグのデフォルトを設定
			getRsltL().forEach(r -> {
				r.schd_sync_flg(r.sync_flg());
				if (r.subcon_flg()) {
					if (!MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
						&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
						r.sync_flg(true);
					}
				}
				r.setStringNE(_$org_lot_no, r.lot_no());
				r.crt_lot_flg(getDefCrtLotFlg(r));
			});
		}
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			fillSpace();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
			fillSpace();
		}
	}

	/**
	 * [MS_MSBEL2000_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2000_Srch02Caller<P extends MSBEP_ArrActReg, B extends MS_MSBEL2000_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL2000_Srch02Caller(P p, B b) {
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
		protected void setupParam() {
			super.setupParam();
			bridge.up0().stk_lst_prnt_flg(Cnd_ope_PRNT.isSelected());
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
		@Override
		protected void show() {
			super.show();
			setCanAcDt();
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				// 検索時の打切ＦＬＧの値を保持するため隠し項目へコピー
				r.init_abort_flg(r.abort_flg());
			}
		}
	}

	/**
	 * [MS_MSBEL2000_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2000_Srch03Caller<P extends MSBEP_ArrActReg, B extends MS_MSBEL2000_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL2000_Srch03Caller(P p, B b) {
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
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				// 検索時の打切ＦＬＧの値を保持するため隠し項目へコピー
				r.init_abort_flg(r.abort_flg());
			}
		}
	}
	/**
	 * [MS_MSBEL2000_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2000_Ins01Caller<P extends MSBEP_ArrActReg, B extends MS_MSBEL2000_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBEL2000_Ins01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			msgList.addAll(arrPtnChk());
			msgList.addAll(inptChk());
		}
//		@Override
//		protected void setMode() {
//			// FIX_I にされないようにO/Rする
//		}
		@Override
		protected void setMode() {
			super.setMode();
			setBtnMode();
		}
	}

	/**
	 * [MS_MSBEL2000_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2000_Upd01Caller<P extends MSBEP_ArrActReg, B extends MS_MSBEL2000_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBEL2000_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			// 入力値チェック
			msgList.addAll(inptChk());
		}
	}

	/**
	 * [MS_MSBEL2000_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2000_Del01Caller<P extends MSBEP_ArrActReg, B extends MS_MSBEL2000_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {
		protected MS_MSBEL2000_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected boolean keepDownAttributes() {
			// 属性は上書きしない
			return true;
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			for (RsltR r : getRsltL()) {
				if (r.check()) {
					msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(), columnRslt_can_ac_dt_for_input));
				}
			}
		}
	}

	/**
	 * [MS_MSBEL2000_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2000_Imp01Caller<P extends MSBEP_ArrActReg, B extends MS_MSBEL2000_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {
		protected MS_MSBEL2000_Imp01Caller(P p, B b) {
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
			}
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
			// ファイル入力前に一括設定用の項目に値が入っていると、全選択と同時に値が上書きされてしまうため
			// 全選択を行わなくても登録できるようにチェックをオンにしている
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_IStatus();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			callMS_MSBEL2000_Srch01();
		}
		else if (Cnd_ope_REF.isSelected()) {
			callMS_MSBEL2000_Srch03();
		}
		else {
			callMS_MSBEL2000_Srch02();
		}
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			createMS_MSBEL2000_Srch01().execDL();;
		}
		else if (Cnd_ope_REF.isSelected()) {
			createMS_MSBEL2000_Srch03().execDL();;
		}
		else {
			createMS_MSBEL2000_Srch02().execDL();;
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP1100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1100(MCEventInfo info) {
		RsltR fr = RsltTable.getSelectedMCRow();
		if (fr == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1100");
		MCRow asoRow = crtOpenMSBCP1100CndR(aso, fr);
		aso.putCnd(asoRow);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}
	private mcframe.clientMSBC.MSBCP1100.CndR crtOpenMSBCP1100CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg p = (mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1100.CndR to = mcframe.clientMSBC.MSBCP1100.CndR.create();
		if (isNull(fr.arr_act_no())) {
			to.ope(p.Cnd_ope_INS.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.div_seq(MCNumber.ONE);
		}
		to.srch_tgt_no(fr.mfg_inst_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0120(MCEventInfo info) {
		RsltR fr = RsltTable.getSelectedMCRow();
		if (fr == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0120");
		MCRow asoRow = crtOpenMSBDP0120CndR(aso, fr);
		aso.putCnd(asoRow);
		aso.putSearchAction();
		aso.show();
	}
	private mcframe.clientMSBD.MSBDP0120.CndR crtOpenMSBDP0120CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBD.MSBDP0120.CndR to = mcframe.clientMSBD.MSBDP0120.CndR.create();
		to.po_no(fr.po_no());
		return to;
	}

	/**
	 * Panel[Btn]のボタン[prnt_stklst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_stklst(MCEventInfo info) {
		MCList<RsltR> argL = getRsltL().subList("check", true);
		if (argL.size() <= 0) {
			dialog(msgNoSelectedRow());
			return;
		}
		openPanel("MS", "MSBEP0110", T1, argL.get(0), argL);
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
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBEL2000_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL2000_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL2000_Del01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_itm_p_PPanel.setRelateBeans(null);
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		BulkSet_ac_dt_p_PPanel.setRelateBeans(BulkSet_arr_dt);
		BulkSet_arr_usr_dpt_p_PPanel.setRelateBeans(BulkSet_ac_dt);
		Rslt_itm_p_PPanel.setRelateBeans(columnRslt_sundry_itm_flg);
		Rslt_arr_str_ln_p_PPanel.setRelateBeans(columnRslt_arr_loc_cd, columnRslt_arr_str_ln_tgt_flg);
		Rslt_ac_dt_p_PPanel.setRelateBeans(columnRslt_arr_dt);
		Rslt_ver_no_p_PPanel.setRelateBeans(
			columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
			null, columnRslt_ver_flg, columnRslt_crt_lot_flg);
		Rslt_lot_no_p_PPanel.setRelateBeans(
			columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
			columnRslt_lot_mng_typ, columnRslt_lot_no_typ, columnRslt_sublot_mng_typ, columnRslt_sublot_no_typ, true);
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(
			columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
			columnRslt_sno1_mng_typ, columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ, columnRslt_sno4_mng_typ);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(
			columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
			columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place, columnRslt_trd_unit_rnd_typ,
			columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty, columnRslt_base_unit_cd);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(
			columnRslt_base_unit_cd, columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
			columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty);
		Rslt_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_schd_unit_qty_p_PPanel.setRelateBeans(columnRslt_schd_unit_cd, columnRslt_schd_unit_dec_place);
		Rslt_purc_cont_qty_p_PPanel.setRelateBeans(
			columnRslt_cont_fctr_flg, columnRslt_base_unit_qty, columnRslt_std_cont_fctr, null,
			columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_std_cont_qty_p_PPanel.setRelateBeans(
			columnRslt_cont_fctr_flg, columnRslt_base_unit_qty, columnRslt_std_cont_fctr, null,
			columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_ret_stk_arrv_bp_p_PPanel.setRelateBeans(columnRslt_arr_loc_cd, null);	// 納品先or配送先
		Rslt_purc_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_sls_ret_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_po_grp_p_PPanel.setRelateBeans(Cnd_po_grp_p_PPanel);
		Rslt_sret_fr_grp_p_PPanel.setRelateBeans(Cnd_sret_fr_grp_p_PPanel);
		Rslt_ret_str_ln_p_PPanel.setRelateBeans(columnRslt_ret_loc_cd, columnRslt_ret_str_ln_tgt_flg);
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_prsppl_grp_p_PPanel.setRelateBeans(Cnd_prsppl_grp_p_PPanel);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_ac_dt);
		
		Rslt_trd_unit_qty_p_PPanel.columnQty_qty.setName("trd_unit_qty_p.qty");
		Rslt_base_unit_qty_p_PPanel.columnQty_qty.setName("base_unit_qty_p.qty");
		Rslt_schd_qty_p_PPanel.columnQty_qty.setName("schd_qty_p.qty");
		Rslt_act_qty_p_PPanel.columnQty_qty.setName("act_qty_p.qty");
		Rslt_schd_unit_qty_p_PPanel.columnQty_qty.setName("schd_unit_qty_p.qty");
		Rslt_purc_qty_p_PPanel.columnQty_qty.setName("purc_qty_p.qty");
		Rslt_sls_ret_qty_p_PPanel.columnQty_qty.setName("sls_ret_qty_p.qty");
		Rslt_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("arr_str_ln_p.str_ln_cd");
		Rslt_arr_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("arr_str_ln_p.str_ln_nm");
		Rslt_arr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("arr_str_ln_p.str_ln_cd_none_flg");
		Rslt_ret_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("ret_str_ln_p.str_ln_cd");
		Rslt_ret_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("ret_str_ln_p.str_ln_nm");
		Rslt_ret_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("ret_str_ln_p.str_ln_cd_none_flg");
		Rslt_rqst_dpt_p_PPanel.columnUsrDpt_usr_cd.setName("rqst_dpt_p.usr_cd");
		Rslt_rqst_dpt_p_PPanel.columnUsrDpt_usr_nm.setName("rqst_dpt_p.usr_nm");
		Rslt_rqst_dpt_p_PPanel.columnUsrDpt_dpt_cd.setName("rqst_dpt_p.dpt_cd");
		Rslt_rqst_dpt_p_PPanel.columnUsrDpt_dpt_nm.setName("rqst_dpt_p.dpt_nm");
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.setName("usr_dpt_p.usr_cd");
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm.setName("usr_dpt_p.usr_nm");
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setName("usr_dpt_p.dpt_cd");
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm.setName("usr_dpt_p.dpt_nm");
		Rslt_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd.setName("dlv_rqst_tm_p.ymd");
		Rslt_dlv_rqst_tm_p_PPanel.columnYmdHm_hm.setName("dlv_rqst_tm_p.hm");
		Rslt_arr_schd_tm_p_PPanel.columnYmdHm_ymd.setName("arr_schd_tm_p.ymd");
		Rslt_arr_schd_tm_p_PPanel.columnYmdHm_hm.setName("arr_schd_tm_p.hm");
		Rslt_arr_tm_p_PPanel.columnYmdHm_ymd.setName("arr_tm_p.ymd");
		Rslt_arr_tm_p_PPanel.columnYmdHm_hm.setName("arr_tm_p.hm");
		Rslt_ret_stk_arrv_bp_p_PPanel.columnStkArrvBp_stk_arrv_bp_cd.setName("ret_stk_arrv_bp_p.stk_arrv_bp_cd");
		Rslt_ret_stk_arrv_bp_p_PPanel.columnStkArrvBp_stk_arrv_bp_nm.setName("ret_stk_arrv_bp_p.stk_arrv_bp_nm");
	}
	
	@Override
	public void layoutInit() {
		// コンテナ属性によって支給品着荷一覧登録用の項目を隠す
		MCBeans[] items = getInvisibleBeans();
		setComponentInvisibleAllStatus(items);
		setInvisibleOther();

		super.layoutInit();
	}
	
	/**
	 * 非表示用の項目を返す
	 * @return
	 */
	protected MCBeans[] getInvisibleBeans() {
		List<MCBeans> l = new ArrayList<>();
		for (MCContainer c : this.getContainers()) {
			if (c instanceof MCConstRow) {
				MCConstRow r = (MCConstRow)((MCConstRow)c).createInstance();
				Map<String, String> m = r.getExtMap(getInvisibleKey());
				if (m == null || m.isEmpty()) {
					continue;
				}
				for (Map.Entry<String, String> e : m.entrySet()) {
					l.add((MCBeans)this.getComponent((MCRow)c, e.getKey()));
				}
			}
			else if (c instanceof MCList) {
				MCConstRow r = (MCConstRow)((MCList)c).createRow();
				Map<String, String> m = r.getExtMap(getInvisibleKey());
				if (m == null || m.isEmpty()) {
					continue;
				}
				
				MCTable table = null;
				for (MCTable t : MCBeansUtil.getComponents(MCTable.class, this)) {
					if (t.getList() == c) {
						table = t;
						break;
					}
				}
				if (table == null) {
					continue;
				}
				
				for (Map.Entry<String, String> e : m.entrySet()) {
					for (MCColumnConfig cc : table.getColumnConfigs()) {
						if (isSame(cc.getBaseRowColumnName(), e.getKey())) {
							l.add(cc);
						}
					}
				}
			}
		}
		return l.toArray(new MCBeans[0]);
	}
	
	/**
	 * コンテナ属性のキーを返す
	 * @return
	 */
	protected String getInvisibleKey() {
		return "PROV_ONLY_ITEM";
	}
	
	/**
	 * 枠などを独自に非表示にする
	 */
	protected void setInvisibleOther() {
		setComponentInvisibleAllStatus(Tab7Panel);
		setComponentInvisibleAllStatus(Btn_open_schd);
		setComponentInvisibleAllStatus(Btn_open_act);
	}

	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		msgList.addAll(checkAtLeastOne(ArrStsPanel));
		if (Cnd_ope_REF.isSelected()) {
			msgList.addAll(checkSmallLarge(Cnd_pr_rate_fr, Cnd_pr_rate_to));
		}
		if (Cnd_ope_PRNT.isSelected()) {
			msgList.addAll(checkAtLeastOne(StkLstPanel));
		}
		msgList.addAll(checkAtLeastOne(WmsTrgtPanel));
		msgList.addAll(checkAtLeastOne(EdiTrgtPanel));
	}

	/**
	 * 入荷パタンに沿っているかチェックする
	 */
	protected MCMessageList arrPtnChk() {
		MCMessageList msgL = new MCMessageList();
		for (MCList<RsltR> lst : getRsltL().subList(r -> r.check()).groupList(RsltR.$arr_schd_no)) {
			RsltR r = lst.get(0);

			if (isNull(r.arr_schd_no())
				|| !MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
				|| isNull(r.purc_schd_dt())) {
				continue;
			}
			if (!isSame(r.sync_flg(), r.schd_sync_flg())) {
				// 通常管理で予定から同時計上を変更
				msgL.add(new MCMessage(
					r, null, r.schd_sync_flg() ? MSBEP0030 : MSBEP0031));
			}
			else if (r.arr_schd_dt().gtDate(r.purc_schd_dt())) {
				if (isNull(r.purc_qty()) || r.purc_qty().isZero()) {
					// 未着管理で仕入計上されていない状態で入荷
					msgL.add(new MCMessage(r, null, MSBEP0016));
				}
			}
		}
		return msgL;
	}

	/**
	 * 入力値チェックの結果を特定する文字列
	 */
	protected final String _$inptChkKey = "__inptChkKey__";

	/**
	 * 入力値チェックマスタによる入力値チェックを行う
	 */
	protected MCMessageList inptChk() {
		MCMessageList msgL = new MCMessageList();

		MCList<RsltR> chkTargetForArrL = makeInptChkTargetListForArr();
		MCList<RsltR> chkTargetForXferL = makeInptChkTargetListForXfer();
		
		if (!chkTargetForArrL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.ARR.value(),
					columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
					columnRslt_arr_act_no, columnRslt_base_unit_qty_bef, columnRslt_base_unit_qty,
					columnRslt_arr_qty, columnRslt_arr_schd_qty, chkTargetForArrL,
					columnRslt_trd_unit_qty, columnRslt_arr_schd_no));
		}
		
		if (!chkTargetForXferL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.XFER.value(),
					columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
					columnRslt_arr_act_no, columnRslt_base_unit_qty_bef, columnRslt_base_unit_qty,
					columnRslt_arr_qty, columnRslt_arr_schd_qty, chkTargetForXferL,
					columnRslt_trd_unit_qty, columnRslt_arr_schd_no));
		}
		
		return msgL;
	}
	
	protected String[] getGrpColums() {
		return new String[] {
				RsltR.$arr_schd_no, RsltR.$trd_ptn_typ
		};
	}
	
	protected MCGroupByPolicy getInptChkGrpPolicy() {
		return new MCGroupByPolicy(getGrpColums());
	}
	
	protected MCList<RsltR> makeInptChkTargetListForArr() {
		MCList<RsltR> chkTargetL = MCList.create(RsltR.class);
		
		MCGroupByPolicy grpKey = getInptChkGrpPolicy();
		
		MCList<RsltR> targetDtlL = getRsltL().subList(r -> r.check());
		MCIndexKey targetIdxKey = targetDtlL.createIndex(RsltR.$arr_schd_no);
		
		MCList<RsltR> schdGroupL = targetDtlL.groupBy(grpKey);
		for (RsltR schdGroupR : schdGroupL) {
			if (isNull(schdGroupR.arr_schd_no())) {
				continue;
			}
			
			if (targetTrdPtnTypIsArrGroup(schdGroupR.trd_ptn_typ())) { 
				chkTargetL.addAll(targetDtlL.subList(targetIdxKey, schdGroupR.arr_schd_no()));
			}
		}
		
		return chkTargetL;
	}
	
	protected MCList<RsltR> makeInptChkTargetListForXfer() {
		MCList<RsltR> chkTargetL = MCList.create(RsltR.class);
		
		MCGroupByPolicy grpKey = getInptChkGrpPolicy();
		
		MCList<RsltR> targetDtlL = getRsltL().subList(r -> r.check());
		MCIndexKey targetIdxKey = targetDtlL.createIndex(RsltR.$arr_schd_no);
		
		MCList<RsltR> schdGroupL = targetDtlL.groupBy(grpKey);
		for (RsltR schdGroupR : schdGroupL) {
			if (isNull(schdGroupR.arr_schd_no())) {
				continue;
			}
			
			if (!targetTrdPtnTypIsArrGroup(schdGroupR.trd_ptn_typ())) { 
				chkTargetL.addAll(targetDtlL.subList(targetIdxKey, schdGroupR.arr_schd_no()));
			}
		}
		
		return chkTargetL;
	}
	
	protected boolean targetTrdPtnTypIsArrGroup(String trdPtnTyp) {
		if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp)
			|| MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)
			|| MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp)
			|| MAC_TRD_PTN_TYP.isSHIP_RTN(trdPtnTyp)
			) {
			return true;
		}
		return false;
	}

	/**
	 * 取消計上日を設定する<br>
	 * 取消計上日は、検索時点の計上日が設定される
	 */
	protected void setCanAcDt() {
		getRsltL().forEach(r -> r.can_ac_dt(r.ac_dt()));
	}

	/**
	 * 発注先品目・品名を設定する。
	 */
	protected void setSpplItm(boolean dtFlg, RsltR r) {
		
		if (!r.abort_flg()) {
			if(!dtFlg || (dtFlg && isNull(r.arr_schd_no()))) {
				setSpplItm(r);
			}
		}
	}
	
	/**
	 * 発注先品目・品名を設定する。
	 * @param dtlR 入荷明細
	 */
	protected void setSpplItm(RsltR r) {
		MCRow row = getBpItm(r.sppl_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.arr_dt(), this);
		if (isNull(row)) {
			setValueEx(columnRslt_sppl_itm_cd, r.getGUIIndex(), null);
			setValueEx(columnRslt_sppl_itm_nm, r.getGUIIndex(), null);
		}
		else {
			setValueEx(columnRslt_sppl_itm_cd, r.getGUIIndex(), row.getStringNE("bp_itm_cd"));
			setValueEx(columnRslt_sppl_itm_nm, r.getGUIIndex(), row.getStringNE("bp_itm_nm"));
		}
	}
	/**
	 * 検索前のステータスを設定する
	 */
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else {
			setSRCHStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
		if (!isNull(getCndR().dlv_slip_no())) {
			Cnd_dlv_slip_seq.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 検索後のステータスを設定する
	 */
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_INS.isSelected()) {
			RsltTable.selectLeftmostColumn(0);
			setINSStatus();
		}
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNT_STKStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
		if (!isNull(getCndR().dlv_slip_no())) {
			Cnd_dlv_slip_seq.setMode(MCMode.ENABLE);
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}


// モード
	protected boolean isInsStatus() {
		return isSame(getStatus(), INS);
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isInsStatus() || isUpdStatus() || isDelStatus();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setPRNT_STKStatus() {
		super.setPRNT_STKStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 行削除、行コピーボタン
		if (isInsStatus() || isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 新規追加行、空行のみ、行削除できる
				if ((r.isStatusCreate() && isNull(r.arr_act_no()))
					|| r.isStatusNone() && isNull(r.arr_schd_no()) && isNull(r.arr_act_no())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}

				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					// 移送、支給は行コピー不可
					Btn_rcopy.setMode(MCMode.DISABLE);
				}
				else if (isUpdStatus() && !isNull(r.arr_schd_no()) && r.init_abort_flg()) {
					Btn_rcopy.setMode(MCMode.DISABLE);
				}
				// 予定あり(値引品目以外)、または計画外の新規行のみ行コピーできる
				else if (!isNull(r.arr_schd_no()) && !r.dscnt_itm_flg() || isNull(r.arr_act_no())) {
					setDefaultMode(Btn_rcopy);
				}
				else {
					Btn_rcopy.setMode(MCMode.DISABLE);
				}
			}
		}
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBDP0120(r)) {
			setDefaultMode(Btn_open_MSBDP0120);
		}
		else {
			Btn_open_MSBDP0120.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBCP1100(r)) {
			setDefaultMode(Btn_open_MSBCP1100);
		}
		else {
			Btn_open_MSBCP1100.setMode(MCMode.DISABLE);
		}
		
		// [詳細情報]ボタン
		if (isEnableBtn_open_dtl(r)) {
			setDefaultMode(Btn_open_dtl);
		}
		else {
			Btn_open_dtl.setMode(MCMode.DISABLE);
		}
		
		// [明細訂正(予定)]ボタン
		if (isEnableBtn_open_schd(r)) {
			setDefaultMode(Btn_open_schd);
		}
		else {
			Btn_open_schd.setMode(MCMode.DISABLE);
		}
		
		// [明細訂正(実績)]ボタン
		if (isEnableBtn_open_act(r)) {
			setDefaultMode(Btn_open_act);
		}
		else {
			Btn_open_act.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 購買納期調整ボタンが押下可能か
	 */
	protected boolean isEnableBtn_open_MSBDP0120(RsltR r) {
		return !isNull(r) && !isNull(r.po_no());
	}

	/**
	 * 製造実績登録ボタンが押下可能か
	 */
	protected boolean isEnableBtn_open_MSBCP1100(RsltR r) {
		if (isNull(r)) {
			return false;
		}
		if (isNull(r.arr_act_no())) {
			return r.pre_outsrc_act_flg() && !isNull(r.mfg_inst_no());
		}
		else {
			return !isNull(r.mfg_inst_no());
		}
	}
	/**
	 * 対象行に対して、[詳細情報]ボタンが押せるかどうかを判定判定する。
	 * @param r　判定対象行
	 * @return　押せる場合はtrue。　以外は、false。 
	 * 
	 */
	private boolean isEnableBtn_open_dtl(RsltR r){
		// 選択対象が空行
		if(isNull(r) || r.isEmpty()){
			return false;
		}
		// 入荷予定ＮＯ、発注NO、仕入実績NO、出荷実績No、インボイスNO、売上返品予定ＮＯがいずれも未設定
		if(isNullAnd(r.arr_schd_no(), r.po_no(), r.purc_act_no(), r.ship_act_no(), r.iv_no(), r.sls_ret_schd_no())){
			return false;
		}
		
		return true;
	}
	/**
	 * 対象行に対して、[明細訂正(予定)]ボタンが押せるかどうかを判定判定する。
	 * @param r　判定対象行
	 * @return　押せる場合はtrue。　以外は、false。 
	 * 
	 */
	private boolean isEnableBtn_open_schd(RsltR r){
		// 選択対象が空行
		if(isNull(r) || r.isEmpty()){
			return false;
		}
		// 支給予定ＮＯが未設定
		if(isNull(r.prov_schd_no())){
			return false;
		}
		return true;
	}
	/**
	 * 対象行に対して、[明細訂正(実績)]ボタンが押せるかどうかを判定判定する。
	 * @param r　判定対象行
	 * @return　押せる場合はtrue。　以外は、false。 
	 * 
	 */
	private boolean isEnableBtn_open_act(RsltR r){
		// 選択対象が空行
		if(isNull(r) || r.isEmpty()){
			return false;
		}
		// 支給実績ＮＯが未設定
		if(isNull(r.prov_act_no())){
			return false;
		}
		return true;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		setValueEx(BulkSet_arr_dt, getToday());
		setValueEx(BulkSet_arr_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
		setValueEx(Cnd_prov_arrv_req_flg, false);
		clearCnd();
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super. doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		if (Cnd_ope_PRNT.isSelected()) {
			setPRNT_STKStatus();
		}
		clearCnd();
	}

	protected void clearCnd() {
		clearCndArrSts();
		clearCndStkLst();
		clearCndWmsTrgt();
		clearCndEdiTrgt();
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_arr_dt_fr, null);
			setValueEx(Cnd_arr_hm_fr, null);
			setValueEx(Cnd_arr_dt_to, null);
			setValueEx(Cnd_arr_hm_to, null);
			setValueEx(Cnd_ac_dt_fr, null);
			setValueEx(Cnd_ac_dt_to, null);
			setValueEx(Cnd_arr_dpt_cd, null);
			setValueEx(Cnd_arr_dpt_nm, null);
			setValueEx(Cnd_arr_usr_cd, null);
			setValueEx(Cnd_arr_usr_nm, null);
			setValueEx(Cnd_arr_act_no, null);
			setValueEx(Cnd_ext_arr_act_no, null);
			setValueEx(Cnd_sls_act_no, null);
			setValueEx(Cnd_prov_src_act_typ, null);
			setValueEx(Cnd_prov_src_act_no, null);
			setValueEx(Cnd_prov_act_no, null);
		}
		else {
			setValueEx(Cnd_purc_act_yet_flg, false);
		}
	}

	/**
	 * 操作種別による入荷状況の初期値を設定する
	 */
	protected void clearCndArrSts() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_arr_yet_flg, true);
			setValueEx(Cnd_arr_done_flg, false);
			setValueEx(Cnd_abort_flg, false);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_arr_yet_flg, true);
			setValueEx(Cnd_arr_done_flg, true);
			setValueEx(Cnd_abort_flg, true);
		}
		else {
			setValueEx(Cnd_arr_yet_flg, false);
			setValueEx(Cnd_arr_done_flg, true);
			setValueEx(Cnd_abort_flg, true);
		}
	}

	/**
	 * 操作種別による現品票の初期値を設定する
	 */
	protected void clearCndStkLst() {
		if (Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_prnt_yet_flg, true);
			setValueEx(Cnd_prnt_done_flg, false);
		}
		else {
			setValueEx(Cnd_prnt_yet_flg, true);
			setValueEx(Cnd_prnt_done_flg, true);
		}
	}
	/**
	 * 操作種別によるWMS対象の初期値を設定する
	 */
	protected void clearCndWmsTrgt() {
		if (Cnd_ope_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_wms_flg, true);
			setValueEx(Cnd_not_wms_flg, true);
		}
		else {
			setValueEx(Cnd_wms_flg, false);
			setValueEx(Cnd_not_wms_flg, true);
		}
	}
	/**
	 * 操作種別によるEDI対象の初期値を設定する
	 */
	protected void clearCndEdiTrgt() {
		if (Cnd_ope_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_edi_flg, true);
			setValueEx(Cnd_edi_invalid_flg, true);
		}
		else {
			setValueEx(Cnd_edi_flg, false);
			setValueEx(Cnd_edi_invalid_flg, true);
		}
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		if (Cnd_ope_INS.isSelected()) {
			RsltTable.fillSpace();
		}
	}

	protected void setStatusColumn() {
		if (Cnd_ope_INS.isSelected()
			|| Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> cols = super.getNotInheritCols(type, cont);
		cols.remove(RsltR.$arr_pr_upd_cntr);
		cols.remove(RsltR.$arr_act_upd_cntr);
		return cols;
	}
	@Override
	protected <E extends MCConstRow> void clearNotInheritInfo(MCTable<E> table, E row) {
		super.clearNotInheritInfo(table, row);
		RsltR r = (RsltR)row;
		r.crt_lot_flg(getDefCrtLotFlg(r));

		java.util.function.Function<MCColumnConfig, Boolean> fnc =
			config -> {
				MCMode mode = table.isCellEditable(row.getGUIIndex(), config);
				return mode == MCMode.ENABLE || mode == MCMode.REQUIRED;
			};
		if (fnc.apply(columnRslt_lot_no)) {
			r.lot_no(null);
		}
		if (fnc.apply(columnRslt_sublot_no)) {
			r.sublot_no(null);
		}
		r.trd_unit_qty(null);	// 数量はクリアする
		r.base_unit_qty(null);
		r.arr_act_no(null);
		r.prov_src_act_no(null);
		r.prov_act_no(null);
		r.can_ac_dt(null);
		r.can_ac_dt_for_input(null);
		r.ac_dt_after_srch(null);
		r.wms_flg(false);
		r.ext_sys_cd(null);
		r.ext_sys_nm(null);
		r.ext_arr_act_no(null);
	}

// イベント
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
		fillSpace();
		setSrchStatus();
		setStatusColumn();
	}
	
	@Override
	public void doCnd_dlv_slip_no_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dlv_slip_no_NC(info);
		if (!isNull(getCndR().dlv_slip_no()) && !getCndR().dlv_slip_no().isEmpty()) {
			Cnd_dlv_slip_seq.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_dlv_slip_seq.setValue(null);
			setDefaultMode(Cnd_dlv_slip_seq);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (r.check()) {
			bulkSet(BulkSet_ac_dt, r);
			bulkSet(BulkSet_arr_dt, r);
			bulkSet(BulkSet_arr_usr_cd, r);
			bulkSet(BulkSet_arr_dpt_cd, r);
		}
	}

	@Override
	public void doRslt_trd_cd_LC(MCEventInfo info) {
		super.doRslt_trd_cd_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		setValueEx(columnRslt_crt_lot_flg, r.getGUIIndex(), getDefCrtLotFlg(r));
		setValueEx(columnRslt_cst_cd, r.getGUIIndex() , null);
		setValueEx(columnRslt_sret_fr_cd, r.getGUIIndex(), null);
		setValueEx(columnRslt_sppl_cd, r.getGUIIndex(), null);
		setValueEx(columnRslt_purc_id_typ, r.getGUIIndex(), null);
		setValueEx(columnRslt_cststk_flg, r.getGUIIndex(), null);
		setValueEx(columnRslt_rsn_cd, r.getGUIIndex(), null);
	}

	public void doRslt_itm_cd(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		setValueEx(columnRslt_crt_lot_flg, r.getGUIIndex(), getDefCrtLotFlg(r));
		setValueEx(columnRslt_lot_no, r.getGUIIndex(), null);
		setValueEx(columnRslt_same_lot_flg, r.getGUIIndex(), false);
		setValueEx(columnRslt_trd_unit_cd, r.getGUIIndex(), null);
		setValueEx(columnRslt_cst_cd, r.getGUIIndex(), null);
		setValueEx(columnRslt_sret_fr_cd, r.getGUIIndex(), null);
		setValueEx(columnRslt_sppl_cd, r.getGUIIndex(), null);
		setValueEx(columnRslt_purc_id_typ, r.getGUIIndex(), null);
		setValueEx(columnRslt_gd_cd, r.getGUIIndex(), getDefGdCd(r));
		setValueEx(columnRslt_maker_cd, r.getGUIIndex(), null);
		setDefStrLnCd(r);
	}

	/**
	 * ロット作成フラグのデフォルトを取得する
	 */
	protected boolean getDefCrtLotFlg(RsltR r) {
		if (isNull(r.itm_cd()) || r.cststk_flg()) {
			return false;
		}
		return MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ())
			&& (isPurcOrXpns(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()))
			&& isNull(r.getStringNE(_$org_lot_no));
	}

	/**
	 * 格付のデフォルトを取得する
	 * @param r
	 * @return
	 */
	protected String getDefGdCd(RsltR r) {
		if (isNull(r.itm_cd())
			|| MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
			return null;
		}
		return getDefaultFeedStkGd().gd_cd();
	}
	
	/**
	 * 良品区分のデフォルトを取得する
	 * @param r
	 * @return
	 */
	protected String getDefQualityTyp(RsltR r) {
		if (isNull(r.itm_cd())) {
			return null;
		}
		return MAC_QUALITY_TYP.GOOD.value();
	}

	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(RsltR rsltR) {
		if (isNull(rsltR.arr_loc_cd()) || !rsltR.arr_str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				rsltR.itm_cd(),
				rsltR.itm_sub1(),
				rsltR.itm_sub2(),
				rsltR.itm_sub3(),
				rsltR.arr_loc_cd(),
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnRslt_arr_str_ln_cd_none_flg, rsltR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnRslt_arr_str_ln_cd, rsltR.getGUIIndex(), StrLnCd);
		}
	}

	@Override
	public void doRslt_abort_flg_NC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		// 入荷予定単位にフラグ制御する
		getRsltL().forEach(rr -> {
			if (rr != r
				&& isSame(rr.arr_schd_no(), r.arr_schd_no())) {
				setValueEx(columnRslt_abort_flg, rr.getGUIIndex(), r.abort_flg());
			}
		});
	}

	public void doRslt_purc_cont_qty(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.cont_fctr_flg()) {
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !r.cststk_flg()) {
				setValueEx(
					columnRslt_purc_cont_fctr, r.getGUIIndex(),
					calcContFctr(r.base_unit_qty(), r.purc_cont_qty(), r.cont_fctr_dec_place()));
			}
			else {
				setValueEx(columnRslt_purc_cont_qty, r.getGUIIndex(), null);
				setValueEx(columnRslt_purc_cont_fctr, r.getGUIIndex(), null);
			}
		}
	}

	@Override
	public void doRslt_purc_id_typ_LC(MCEventInfo info) {
		super.doRslt_purc_id_typ_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
			|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
			setValueEx(columnRslt_cststk_flg, r.getGUIIndex(), false);
		}
		setValueEx(columnRslt_rsn_cd, r.getGUIIndex(), null);
	}

	public void doRslt_crt_lot_flg(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!r.crt_lot_flg()) {
			setValueEx(columnRslt_same_lot_flg, r.getGUIIndex(), false);
		}
	}

	@Override
	public void doRslt_cststk_flg_NC(MCEventInfo info) {
		super.doRslt_cststk_flg_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.cststk_flg()) {
			setValueEx(columnRslt_crt_lot_flg, r.getGUIIndex(), null);
			setValueEx(columnRslt_sppl_cd, r.getGUIIndex(), null);
			setValueEx(columnRslt_purc_id_typ, r.getGUIIndex(), null);
			setValueEx(columnRslt_purc_cont_qty, r.getGUIIndex(), null);
			setValueEx(columnRslt_purc_cont_fctr, r.getGUIIndex(), null);
			setValueEx(columnRslt_bp_dlv_slip_no, r.getGUIIndex(), null);
			setValueEx(columnRslt_bp_dlv_slip_d_no, r.getGUIIndex(), null);
			setValueEx(columnRslt_ship_fr_valid_dt, r.getGUIIndex(), null);
			setValueEx(columnRslt_maker_cd, r.getGUIIndex(), null);
			setValueEx(columnRslt_sppl_itm_cd, r.getGUIIndex(), null);
			setValueEx(columnRslt_sppl_itm_nm, r.getGUIIndex(), null);
		}
		else {
			setValueEx(columnRslt_cst_cd, r.getGUIIndex(), null);
		}
		setValueEx(columnRslt_rsn_cd, null);
	}

	@Override
	public void doRslt_sppl_cd_LC(MCEventInfo info) {
		super.doRslt_sppl_cd_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		setSpplItm(false, r);
	}

	public void doRslt_arr_dt_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		setSpplItm(true, r);
	}
	@Override
	public void doRslt_sret_fr_cd_LC(MCEventInfo info) {
		super.doRslt_sret_fr_cd_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		r.ret_stk_arrv_bp_cd(r.sret_fr_cd());
		r.ret_stk_arrv_bp_nm(r.sret_fr_nm());
	}

	@Override
	public void doRslt_rsn_cd_LC(MCEventInfo info) {
		super.doRslt_rsn_cd_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!r.acxfr_gi_flg() && !r.xpns_purc_flg()) {
			setValueEx(columnRslt_bd_dpt_cd, r.getGUIIndex(), null);
		}
	}

	public void doRslt_lot_no(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.ver_flg()) {
			if (!r.crt_lot_flg()) {
				setValueEx(columnRslt_ver_no, r.getGUIIndex(), r.org_ver_no());
			}
		}
	}
	@Override
	public void doRslt_rcpt_iv_no_LC(MCEventInfo info) {
		super.doRslt_rcpt_iv_no_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		setValueEx(columnRslt_rcpt_iv_temp_ent_flg, r.getGUIIndex(), !isNull(r.rcpt_iv_no()));
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_ac_dt.addLCListener(this);
		BulkSet_arr_dt.addLCListener(this);
		BulkSet_arr_hm.addLCListener(this);
		BulkSet_arr_usr_cd.addLCListener(this);
		BulkSet_arr_dpt_cd.addLCListener(this);
		Rslt_itm_p_PPanel.addItmLCListner(this);
		columnRslt_base_unit_qty.addLCListener(this);
		columnRslt_purc_cont_qty.addLCListener(this);
		columnRslt_lot_no.addLCListener(this);
		columnRslt_sublot_no.addLCListener(this);
		columnRslt_arr_dt.addLCListener(this);

		columnRslt_crt_lot_flg.addNCListener(this);
		columnRslt_rcpt_iv_no.addNCListener(this);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		// 発注先、メーカ、引取先は入力補助も使用可能とする。
		linkBeansToISPanelCustom(columnRslt_sppl_cd);
		linkBeansToISPanelCustom(columnRslt_maker_cd);
	    linkBeansToISPanelCustom(columnRslt_sret_fr_cd);
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnRslt_cst_cd ) {
			RsltR r = getRsltL().get(eventIndex);
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
				row.setBooleanNE(BpCols.$i_cst_iv_flg, false);
			}
		}
		return row;
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == columnRslt_crt_lot_flg) {
			doRslt_crt_lot_flg(info);
		}
	}
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == BulkSet_ac_dt) {
			bulkSet(BulkSet_ac_dt);
		}
		else if (lc == BulkSet_arr_dt || lc == BulkSet_arr_hm) {
			bulkSet(BulkSet_arr_dt);
		}
		else if (lc == BulkSet_arr_usr_cd) {
			bulkSet(BulkSet_arr_usr_cd);
		}
		else if (lc == BulkSet_arr_dpt_cd) {
			bulkSet(BulkSet_arr_dpt_cd);
		}
		else if (lc == columnRslt_itm_cd
					|| lc == columnRslt_itm_sub1
					|| lc == columnRslt_itm_sub2
					|| lc == columnRslt_itm_sub3) {
			doRslt_itm_cd(info);
		}
		else if (lc == columnRslt_purc_cont_qty
					|| lc == columnRslt_base_unit_qty) {
			doRslt_purc_cont_qty(info);
		}
		else if (lc == columnRslt_lot_no
					|| lc == columnRslt_sublot_no) {
			doRslt_lot_no(info);
		}
		if (lc == columnRslt_arr_dt) {
			doRslt_arr_dt_LC(info);
		}
		if (lc == columnRslt_rcpt_iv_no) {
			doRslt_rcpt_iv_no_LC(info);
		}
	}

	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	protected void bulkSet(MCBeans b, RsltR r) {
		if (isNull(r.arr_act_no())) {
			if (b == BulkSet_ac_dt && isEditable(columnRslt_ac_dt, r.getGUIIndex())) {
				r.ac_dt(getBulkSetR().ac_dt());
			}
			else if (b == BulkSet_arr_dt && isEditable(columnRslt_arr_dt, r.getGUIIndex())) {
				if (!isSame(r.arr_dt(), getBulkSetR().arr_dt())
					|| !isSame(r.arr_hm(), getBulkSetR().arr_hm())) {

					// 入荷日時の変更による発注先の再設定
					r.arr_dt(getBulkSetR().arr_dt());
					r.arr_hm(getBulkSetR().arr_hm());
					if (isEditable(columnRslt_sppl_cd, r.getGUIIndex())) {
						String spplCd = r.sppl_cd();	// 退避
						setValueEx(columnRslt_sppl_cd, r.getGUIIndex(), null);
						setValueEx(columnRslt_sppl_cd, r.getGUIIndex(), spplCd);
					}
				}
			}
			else if (b == BulkSet_arr_usr_cd
					&& isEditable(columnRslt_arr_usr_cd, r.getGUIIndex())) {
				r.arr_usr_cd(getBulkSetR().arr_usr_cd());
				r.arr_usr_nm(getBulkSetR().arr_usr_nm());
			}
			else if (b == BulkSet_arr_dpt_cd
					&& isEditable(columnRslt_arr_dpt_cd, r.getGUIIndex())) {
				r.arr_dpt_cd(getBulkSetR().arr_dpt_cd());
				r.arr_dpt_nm(getBulkSetR().arr_dpt_nm());
			}
		}
	}

	@Override
	public MCList getRslt_trd_cd(MCRow row, MCEventInfo info) {
		// 取引パタン区分を「入荷」「出荷返品」に限定
		MCList<MCRow> lst = super.getRslt_trd_cd(row, info), retL = lst.createInstance();
		for (MCRow r : lst) {
			String typ = r.getString("trd_ptn_typ");
			if (isAvailableTrd(typ)) {
				retL.add(r);
			}
		}
		return retL;
	}
	
	/**
	 * 使用可能な取引パタンか判断する
	 * @param typ
	 * @return
	 */
	protected boolean isAvailableTrd(String typ) {
		if (MAC_TRD_PTN_TYP.isARR(typ) || MAC_TRD_PTN_TYP.isSHIP_RTN(typ)) {
			return true;
		}
		return false;
	}

	@Override
	public MCList getRslt_purc_id_typ(MCRow row, MCEventInfo info) {
		setAvailablePurcId(row, info);
		return super.getRslt_purc_id_typ(row, info);
	}

	/**
	 * 使用可能な購買識別区分を制御する
	 * @param row
	 * @param info
	 */
	protected void setAvailablePurcId(MCRow row, MCEventInfo info) {
		row.addBooleanColumn(MAC_PURC_ID_TYP.FFR_RCV.key(), true);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
			row.addBooleanColumn(MAC_PURC_ID_TYP.VMI.key(), true);
		}
	}

	@Override
	public MCList getRslt_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.crt_lot_flg()) {
			// ロット作成時は工場・物流倉庫で絞り込む
			row.addStringColumn(ItmVerCols.$i_site_cd, r.arr_site_cd());
		}
		return super.getRslt_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
	}

	@Override
	public MCList getRslt_trd_unit_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> lst = super.getRslt_trd_unit_cd(row, info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ()) && isNull(r.arr_schd_no())) {
			// 計画外の貸出返品では荷姿のみ選択可
			lst.removeAll(lst.subList(ItmUnitCols.$o_pack_flg, false));
		}
		return lst;
	}

	@Override
	public MCList<?> getRslt_sret_fr_cd(MCRow row, MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		row.setStringNE(BpCols.$i_cst_cd, r.cst_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getRslt_sret_fr_cd(row, info);
	}

	@Override
	public MCList getRslt_rsn_cd(MCRow row, MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
			if (!r.cststk_flg()) {
				if (MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())) {
					row.setBooleanNE("xpns_purc_flg", true);
				}
				else{
					row.setBooleanNE("not_xpns_purc_flg", true);
				}
				return getPurcBizRsn(row, info);
			}
		}
		else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
			row.addBooleanColumn(ArrBizRsnCols.$i_sls_rtn_flg, true);
		}
		else {
			row.addBooleanColumn(ArrBizRsnCols.$i_xfr_flg, true);
		}

		// 販売他勘定、移送以外の他勘定出庫の理由を除外する
		MCList<MCRow> lst = super.getRslt_rsn_cd(row, info), rmL = lst.createInstance();
		for (MCRow rr : lst) {
			if (rr.getBooleanNE("sls_acxfr_flg")
				|| !MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ()) && rr.getBooleanNE("acxfr_gi_flg")) {
				rmL.add(rr);
			}
		}
		if (!rmL.isEmpty()) {
			lst.removeAll(rmL);
		}
		return lst;
	}
	
	/**
	 * 理由のリストロジック<br>
	 * 入荷(預り以外)で利用する
	 */
	protected MCList<MCRow> getPurcBizRsn(MCRow row, MCEventInfo info) {
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)
			MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBizRsn(row, info);
	}
	
	@Override
	public MCList getRslt_arr_loc_cd(MCRow row, MCEventInfo info) {
		setAvailableArrLoc(row, info);
		return super.getRslt_arr_loc_cd(row, info);
	}
	
	/**
	 * 使用可能な入庫場所を制御する
	 * @param row
	 * @param info
	 */
	protected void setAvailableArrLoc(MCRow row, MCEventInfo info) {
		row.setStringNE("LOC_IS_SRCH_TYP", MAC_LOC_IS_SRCH_TYP.HOUSE.value());
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r == null) {
				return;
			}

			if (!isEnableBtn_open_dtl(r)) {
				return;
			}
			doBtn_open_dtl(r);
		}
	}

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

			// 計画あり
			if (!isNull(r.arr_schd_no())) {
				if (isSchdROCol(column)) {
					return MCMode.READ_ONLY;
				}
				if (column == columnRslt_trd_unit_cd
					|| column == columnRslt_trd_unit_qty
					|| column == columnRslt_abort_flg
					|| column == columnRslt_sync_flg
					|| column == columnRslt_gd_cd) {
					if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_trd_unit_cd
					|| column == columnRslt_trd_unit_qty
					|| column == columnRslt_abort_flg) {
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
						&& !isNull(r.ret_dlv_slip_d_no()) && r.cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
					else if (r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_quality_typ) {
					if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_lot_no
					|| column == columnRslt_sublot_no
					|| column == columnRslt_ver_no) {
					if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_rsn_cd) {
					if (isNull(r.ship_act_no()) || !r.ship_uplnd_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_bd_dpt_cd) {
					if (isNull(r.ship_act_no()) || !r.acxfr_gi_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_abort_flg) {
					if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ()) && !isNull(r.purc_act_io_no())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_rcpt_iv_no) {
					if (!r.sppl_iv_flg()
						|| !isNull(r.rcpt_iv_mng_no())
						|| r.rcpt_iv_multi_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			// 計画外
			else {
				if (column == columnRslt_abort_flg) {
					return MCMode.READ_ONLY;
				}
				if (column == columnRslt_purc_id_typ) {
					if (!MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
							&& !MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_cststk_flg) {
					if (!MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_cst_cd) {
					if (!MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
						 && !MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
					 	|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !r.cststk_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_sret_fr_cd
					|| column == columnRslt_ret_loc_cd
					|| column == columnRslt_ret_gd_cd) {
					if (!MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_sppl_cd) {
					if ((!MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
							&& !MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ()))
							|| r.cststk_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_rsn_cd) {
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
						&& (isInsStatus() || isUpdStatus())) {
						return MCMode.REQUIRED;
					}
					else if (!MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) || r.cststk_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_rcpt_iv_no) {
					return MCMode.READ_ONLY;
				}
			}

			if (isPurcOrXpnsROCol(column)) {
				if ( !(isPurcOrXpns(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !r.cststk_flg()) ) {
					return MCMode.READ_ONLY;
				}
				if (column == columnRslt_bp_lot_no) {
					if (r.bp_lot_flg() && (isInsStatus() || isUpdStatus())) {
						return MCMode.REQUIRED;
					}
				}
			}
			if (column == columnRslt_sync_flg) {
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
					|| MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ()) && !isNull(r.purc_act_io_no())
					|| r.subcon_flg()
					|| MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
					|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
					|| Cnd_ope_UPD.isSelected() && r.isStatusCreate()
					|| isNull(r.arr_schd_no())
					|| !isNull(r.arr_act_no())
					|| (!isNull(r.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(r.purc_basis_typ()))) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_crt_lot_flg) {
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && r.cststk_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_same_lot_flg) {
				if (!isPurcOrXpns(r.trd_ptn_typ())
					 || !(MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isUNIQ(r.sublot_mng_typ()))
					 || !r.crt_lot_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_gd_cd) {
				if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())
					&& (isInsStatus() || isUpdStatus())) {
					return MCMode.REQUIRED;
				}
				else {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_bd_dpt_cd) {
				if ((MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())&&r.acxfr_gi_flg()) && (isInsStatus() || isUpdStatus())) {
					return MCMode.REQUIRED;
				}
				else {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_can_ac_dt_for_input) {
				if (r.isStatusCreate()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_insp_cnt_rmrks) {
				if ((isInsStatus() || isUpdStatus())
						&& !MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}

		/**
		 * 取引パタン区分が「仕入」または「経費購買」の場合に入力可になる項目
		 */
		protected boolean isPurcOrXpnsROCol(MCColumnConfig column) {
			return column == columnRslt_ship_fr_valid_dt
						|| column == columnRslt_maker_cd
						|| column == columnRslt_bp_lot_no
						|| column == columnRslt_bp_dlv_slip_no
						|| column == columnRslt_bp_dlv_slip_d_no
						|| column == columnRslt_sppl_itm_cd
						|| column == columnRslt_sppl_itm_nm
						|| column == columnRslt_purc_cont_qty;
		}

		/**
		 * 入荷予定ありの場合に入力不可になる項目
		 */
		protected boolean isSchdROCol(MCColumnConfig column) {
			return  column == columnRslt_trd_cd
						|| column == columnRslt_purc_id_typ
						|| column == columnRslt_cststk_flg
						|| column == columnRslt_itm_cd
						|| column == columnRslt_itm_sub1
						|| column == columnRslt_itm_sub2
						|| column == columnRslt_itm_sub3
						|| column == columnRslt_itm_nm
						|| column == columnRslt_rcpt_iv_itm_nm
						|| column == columnRslt_sno1
						|| column == columnRslt_sno2
						|| column == columnRslt_sno3
						|| column == columnRslt_sno4
						|| column == columnRslt_cst_cd
						|| column == columnRslt_sppl_cd
						|| column == columnRslt_sret_fr_cd
						|| column == columnRslt_maker_cd
						|| column == columnRslt_ret_loc_cd
						|| column == columnRslt_ret_str_ln_cd
						|| column == columnRslt_ret_str_ln_cd_none_flg
						|| column == columnRslt_ret_gd_cd
						|| column == columnRslt_sppl_itm_cd
						|| column == columnRslt_sppl_itm_nm
						|| column == columnRslt_rqst_dpt_cd
						|| column == columnRslt_rqst_usr_cd;
		}
	}

	/**
	 * 取引パタン区分が「仕入」または「経費購買」かを判定する
	 */
	protected boolean isPurcOrXpns(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isPURC(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp);
	}

	/**
	 * 取引パタン区分が「売上返品」または「出荷返品」かを判定する
	 */
	protected boolean isSRet(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(trdPtnTyp);
	}

	// ------------ 画面遷移 : START------------		
	/**
	 * 指定された情報に応じた詳細画面を開く。
	 * @param r 遷移元行
	 */
	protected void doBtn_open_dtl(RsltR r){
		//  仕入、経費購買
		if (isPurcOrXpns(r.trd_ptn_typ())) {
			// 未着管理
			if (isNotYetArr(r)) {
				// [仕入実績登録]画面へ
				OpenMSBDP0140(r);
			}
			// 通常管理
			else {
				// [発注登録]画面へ
				OpenMSBDP0080(r);
			}
		}
		// 売上返品、出荷返品
		else if (isSRet(r.trd_ptn_typ())) {
			// [売上返品予定登録]画面へ
			OpenMSBBP1330(r);
		}
		//仕入直送支給以外
		else{
			// 国内
			if(isInternal(r)){
				// [出荷実績登録]画面へ
				OpenMSBEP1440(r);
			}
			// 国外
			else{
				// [輸出実績一覧登録]画面へ
				OpenMSBEP1760(r);
			}
		}
	}
	
	/**
	 * 指定された情報に応じた予定の明細訂正画面を開く。
	 * @param r 遷移元行
	 */
	protected void doBtn_open_schd(RsltR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1160");
		aso.runValueInit();
		mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg p = (mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1160.CndR to = mcframe.clientMSBE.MSBEP1160.CndR.create();
		to.ope(p.Cnd_ope_REF_SCHD.getActionCommand());
		to.prov_schd_no(r.prov_schd_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 指定された情報に応じた実績の明細訂正画面を開く。
	 * @param r 遷移元行
	 */
	protected void doBtn_open_act(RsltR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1160");
		aso.runValueInit();
		mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg p = (mcframe.clientMSBE.MSBEP1160.MSBEP_ProvDtlModReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1160.CndR to = mcframe.clientMSBE.MSBEP1160.CndR.create();
		to.ope(p.Cnd_ope_REF_ACT.getActionCommand());
		to.prov_act_no(r.prov_act_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 売上返品予定登録画面(MSBD1330)へ画面遷移する。
	 * @param r　遷移元行
	 */
	protected void OpenMSBBP1330( RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1330");

		mcframe.clientMSBB.MSBBP1330.MSBBP_SlsRetSchdReg p = (mcframe.clientMSBB.MSBBP1330.MSBBP_SlsRetSchdReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1330.CndR to = mcframe.clientMSBB.MSBBP1330.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.sls_ret_schd_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 発注登録画面(MSBD0080)へ画面遷移する。
	 * @param r　遷移元行
	 */
	protected void OpenMSBDP0080( RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0080");

		mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg p = (mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0080.CndR to = mcframe.clientMSBD.MSBDP0080.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.po_no(r.po_no());
		to.latest_flg(true);

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 仕入実績登録画面(MSBDP0140)へ画面遷移する。
	 * @param r　遷移元行
	 */
	protected void OpenMSBDP0140( RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0140");

		mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg p = (mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0140.CndR to = mcframe.clientMSBD.MSBDP0140.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.purc_act_no());
		to.newest_flg(true);

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 輸出実績一覧登録画面(MSBEP1760)へ画面遷移する。
	 * @param r　遷移元行
	 */
	protected void OpenMSBEP1760( RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1760");
		mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg p = (mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1760.CndR to = mcframe.clientMSBE.MSBEP1760.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.iv_no(r.iv_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 出荷実績登録](MSBEP1440)へ画面遷移する。
	 * @param r　遷移元行
	 */
	protected void OpenMSBEP1440( RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1440");

		mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg p = (mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1440.CndR to = mcframe.clientMSBE.MSBEP1440.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.ship_act_no());
		to.latest_flg(true);

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	// ------------ 画面遷移 : END------------

	// ------------ その他 : START------------
	/**
	 * 未着かどうかを判定する。
	 * @param r　判定対象
	 * @return 未着の場合、true。　以外は、false。 
	 */
	protected boolean isNotYetArr(RsltR r) {
		if(!isNull(r.purc_act_no())) {
			return true;
		}
		return false;
	}
	/**
	 * 国内取引かどうかを判定する。
	 * @param r　判定対象
	 * @return 国内取引の場合、true。　以外は、false。 
	 */
	protected boolean isInternal(RsltR r){
		//　輸出FLGがオフの場合、国内取引と判定
		if(!r.ship_ex_flg()){
			return true;
		}
		return false;
	}



// IfListRegPanel
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
		if (isNull(r.ac_dt())) {
			bulkSet(BulkSet_ac_dt, r);
		}
		if (isNull(r.arr_dt())) {
			bulkSet(BulkSet_arr_dt, r);
		}
		if (isNull(r.arr_usr_cd())) {
			bulkSet(BulkSet_arr_usr_cd, r);
		}
		if (isNull(r.arr_dpt_cd())) {
			bulkSet(BulkSet_arr_dpt_cd, r);
		}
		if (!r.isStatusCreate()) {
			Rslt_can_ac_dt_p_PPanel.canAcDtValueInit(r);
		}
	}


// ファイル入力
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
		callMS_MSBEL2000_Imp01();
	}
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return columnRslt_ac_dt;
	}
	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}
	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || (Cnd_ope_DEL.isSelected())) {
			return true;
		}
		return false;
	}
	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return columnRslt_check;
	}

}