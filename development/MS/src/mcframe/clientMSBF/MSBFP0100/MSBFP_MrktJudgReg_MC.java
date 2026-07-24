package mcframe.clientMSBF.MSBFP0100;

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
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5370.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
 * 画面"MSBFP_MrktJudgReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_MrktJudgReg_MC extends MSBFP_MrktJudgReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_MrktJudgReg_MC() {
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
	public MSBFP_MrktJudgReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Srch01Caller<P extends MSBFP_MrktJudgReg, B extends MS_MSBFL0100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0100_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
			addDownContainer(getBulkSetR());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {

			msgList.addAll(checkAtLeastOne(JudgStsTypPanel));
			msgList.addAll(checkAtLeastOne(InputTypPanel));
			msgList.addAll(checkAtLeastOne(PrntFlgPanel));
			msgList.addAll(checkBeforeAfter(Cnd_vld_dt_fr, Cnd_vld_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_judg_dt_fr, Cnd_judg_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_upd_ts_fr, Cnd_upd_ts_to));
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			clearDownContainers();
		}

		protected void clearDownContainers() {
			if (isSelectedDel()) {
				bridge.down0().setAll(bridge.down0().subList(RsltR.$add_flg, true));
			}
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
	 * [MS_MSBFL0100_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Srch02Caller<P extends MSBFP_MrktJudgReg, B extends MS_MSBFL0100_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0100_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean execConfirm() {
			if (isNull(getRsltL().getFirst(RsltR.$check, true))) {
				dialog(msgNoSelectedRow());
				return false;
			}
			return confirm(MSBFL0075) == MCMessageBox.YES_OPTION;
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			checkForCallStackSub(msgList);
//			super.checkForCallStack(msgList);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			MCList<RsltTypR> upL = MCList.create(RsltTypR.class);
			for (RsltR r : getRsltL()) {
				if (r.check()) {
					RsltTypR typR = RsltTypR.create();
					typR.peg_no(r.getGUIIndex());
					typR.itm_cd(r.itm_cd());
					typR.itm_sub1(r.itm_sub1());
					typR.itm_sub2(r.itm_sub2());
					typR.itm_sub3(r.itm_sub3());
					typR.lot_no(r.lot_no());
					upL.add(typR);
				}
			}
			bridge.up0().setAll(upL);
		}

		@Override
		protected void show() {
			super.show();

			for (RsltR r :getRsltL()) {
				int idx = r.getGUIIndex();
				RsltTypR typR = getRsltTypL().getFirst(RsltTypR.$peg_no, MCNumber.valueOf(idx));
				if (!isNull(typR)) {
					setValueEx(columnRslt_quality_mng_typ, idx, typR.quality_mng_typ());
					setValueEx(columnRslt_mfg_so_aprv_typ, idx, typR.mfg_so_aprv_typ());
					setValueEx(columnRslt_mfg_mng_typ, idx, typR.mfg_mng_typ());
				}
			}
		}

		@Override
		protected void showEndMsg() {
			super.showEndMsg();
			panel.dialog(MSBFL0076);
		}

		/**
		 * 必須チェック
		 * @param msgList
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {

			for (RsltR r : getRsltL()) {
				if (r.check()) {
					if (isNull(r.itm_cd())) {
						msgList.add(msgNoDataAtReq(r, columnRslt_itm_cd));
					}
					if (isNull(r.itm_sub1())) {
						msgList.add(msgNoDataAtReq(r, columnRslt_itm_sub1));
					}
					if (isNull(r.itm_sub2())) {
						msgList.add(msgNoDataAtReq(r, columnRslt_itm_sub2));
					}
					if (isNull(r.itm_sub2())) {
						msgList.add(msgNoDataAtReq(r, columnRslt_itm_sub3));
					}
					if (isNull(r.lot_no())) {
						msgList.add(msgNoDataAtReq(r, columnRslt_lot_no));
					}
				}
			}
		}
		
	}
	/**
	 * [MS_MSBFL0100_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Imp01Caller<P extends MSBFP_MrktJudgReg, B extends MS_MSBFL0100_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBFL0100_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			// 検索前ステータスでは検索枠にフォーカスを飛ばす
			// （#T5-00113(【開発雛型】ファイル入力でのモード分岐の訂正)）の検討結果反映
			// ファイル入力の結果に応じてモードを切り替える
			if (hasNg()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}

			// ファイル入力後には、正常終了か以上終了かに関わらず一覧を広げる
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
		protected void handleMCEx(MCException ex){
			super.handleMCEx(ex);
			setFIX_UStatus();
		}
	}
	/**
	 * [MS_MSBFL0100_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Upd01Caller<P extends MSBFP_MrktJudgReg, B extends MS_MSBFL0100_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0100_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0100_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Upd02Caller<P extends MSBFP_MrktJudgReg, B extends MS_MSBFL0100_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0100_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			// 即時発行
			bridge.up0().setBooleanNE(RsltR.$prnt_flg, getBtnR().prnt_flg());
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			for (RsltR r : getRsltL()) {
				if (r.check()) {
					msgList.addAll(checkAtLeastOne(r, columnRslt_acpt_flg, columnRslt_not_acpt_flg));
				}
			}
		}
	}

	/**
	 * [MS_MSBFL0100_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Del01Caller<P extends MSBFP_MrktJudgReg, B extends MS_MSBFL0100_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0100_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0100_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Del02Caller<P extends MSBFP_MrktJudgReg, B extends MS_MSBFL0100_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0100_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);

			checkReqSub(msgList);
		}

		/**
		 * 共通項目の必須チェックを行っています。
		 * @param msgList
		 */
		protected void checkReqSub(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getBulkSetR()));
		}
	}

	/**
	 * [MS_MSBFL0100_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0100_Prnt01Caller<P extends MSBFP_MrktJudgReg, B extends MS_MSBFL0100_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBFL0100_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBFL0100_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBFL0100_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP1070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP1070(r);
	}
	protected void doBtn_open_MSBCP1070(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1070");
		aso.putCnd(crtOpenMSBCP1070CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP1070.CndR crtOpenMSBCP1070CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch p = (mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch) aso.getPanel();
		mcframe.clientMSBC.MSBCP1070.CndR to = mcframe.clientMSBC.MSBCP1070.CndR.create();
		to.disp_unit1(p.Cnd_disp_unit1_YIELD.getActionCommand());
		to.disp_unit2(p.Cnd_disp_unit2_ACT.getActionCommand());
		to.tmp_sts_stt_flg(true);
		to.tmp_sts_cmpl_flg(true);
		to.unschd_act_flg(true);
		to.not_unschd_act_flg(true);
		to.itm_p().itm_cd(r.itm_cd());
		to.itm_p().itm_sub1(r.itm_sub1());
		to.itm_p().itm_sub2(r.itm_sub2());
		to.itm_p().itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBFP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0060(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0060(r);
	}
	protected void doBtn_open_MSBFP0060(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0060");
		aso.putCnd(crtOpenMSBFP0060CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0060.CndR crtOpenMSBFP0060CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0060.MSBFP_InspActLstReg p = (mcframe.clientMSBF.MSBFP0060.MSBFP_InspActLstReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0060.CndR to = mcframe.clientMSBF.MSBFP0060.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_p().itm_cd(r.itm_cd());
		to.itm_p().itm_sub1(r.itm_sub1());
		to.itm_p().itm_sub2(r.itm_sub2());
		to.itm_p().itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBFP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0120(r);
	}

	protected void doBtn_open_MSBFP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0120");
		aso.putCnd(crtOpenMSBFP0120CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0120.CndR crtOpenMSBFP0120CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0120.CndR to = mcframe.clientMSBF.MSBFP0120.CndR.create();

		to.dupl_abl_flg(true);
		to.itm_p().itm_cd(r.itm_cd());
		to.itm_p().itm_sub1(r.itm_sub1());
		to.itm_p().itm_sub2(r.itm_sub2());
		to.itm_p().itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[auto_sel]の押下時の処理
	 */
	@Override
	public void doBtn_auto_sel(MCEventInfo info) {
		callMS_MSBFL0100_Srch02();
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBFL0100_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_acpt]の押下時の処理
	 */
	@Override
	public void doBtn_select_acpt(MCEventInfo info) {
		//出荷許可のチェックをオンにする
		for (RsltR row : RsltTable.getViewRows()) {
			if (isEditable(columnRslt_acpt_flg, row.getGUIIndex())){
				setValueEx(columnRslt_acpt_flg, row.getGUIIndex(), true);
			}
		}
	}
	/**
	 * Panel[Btn]のボタン[select_not_acpt]の押下時の処理
	 */
	@Override
	public void doBtn_select_not_acpt(MCEventInfo info) {
		//出荷禁止のチェックをオンにする
		for (RsltR row : RsltTable.getViewRows()) {
			if (isEditable(columnRslt_not_acpt_flg, row.getGUIIndex())){
				setValueEx(columnRslt_not_acpt_flg, row.getGUIIndex(), true);
			}
		}
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
		if (isSelectedJudg()) {
			for (RsltR row : RsltTable.getViewRows()) {
				if (isEditable(columnRslt_acpt_flg, row.getGUIIndex())){
					setValueEx(columnRslt_acpt_flg, row.getGUIIndex(), false);
				}
				if (isEditable(columnRslt_not_acpt_flg, row.getGUIIndex())){
					setValueEx(columnRslt_not_acpt_flg, row.getGUIIndex(), false);
				}
			}
		}
		else {
			doDeselectAll(RsltTable);
		}
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
		RsltR r = copyRow(RsltTable);
		clearNotCopyCol(r);
	}
	protected void clearNotCopyCol(RsltR r) {
		if (r.isEmpty()) {
			return;
		}
		r.mrkt_judg_no(null);
		r.mrkt_judg_sts_typ(null);
		r.mrkt_judg_sts_typ_nm(null);
		r.main_flg(false);
		r.mrkt_judg_prnt_flg(false);
		r.mfg_so_aprv_typ(null);
		r.mfg_so_aprv_typ_nm(null);
		r.quality_mng_typ(null);
		r.quality_mng_typ_nm(null);
		r.mfg_mng_typ(null);
		r.mfg_mng_typ_nm(null);
		r.deviant_typ(null);
		r.deviant_typ_nm(null);
		r.deviant_msr_typ(null);
		r.deviant_msr_typ_nm(null);
		r.prod_itm_info_typ(null);
		r.prod_itm_info_typ_nm(null);
		r.chd_itm_info_typ(null);
		r.chd_itm_info_typ_nm(null);
		r.input_flg(false);
		r.add_flg(true);
		r.sub_char1(null);
		r.sub_char2(null);
		r.sub_char3(null);
		r.ins_usr_id(null);
		r.ins_usr_nm(null);
		r.ins_func_id(null);
		r.ins_func_nm(null);
		r.ins_ts(null);
		r.upd_usr_id(null);
		r.upd_usr_nm(null);
		r.upd_func_id(null);
		r.upd_func_nm(null);
		r.upd_ts(null);
		r.upd_srv_req_no(null);
		r.upd_cntr(null);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBFL0100_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_judg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_judg(MCEventInfo info) {
		callMS_MSBFL0100_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBFL0100_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_judg]の押下時の処理
	 */
	@Override
	public void doBtn_del_judg(MCEventInfo info) {
		callMS_MSBFL0100_Del02();
	}

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_judg_dt);

		// ロットを新規に作成する機能がない画面の場合は、ロット作成FLGなどを要求しない引数のメソッドを利用する
		Rslt_lot_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_lot_mng_typ,
				columnRslt_sublot_mng_typ);
		Rslt_mrkt_upd_usr_dpt_p_PPanel.setRelateBeans(columnRslt_upd_dt);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_judg_dt);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_nm, columnRslt_base_unit_dec_place);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	// -----------------------------------------------
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		// 初期値設定
		// 市場出荷判定区分
		Cnd_opn_flg.setValue(true);
		Cnd_acpt_flg.setValue(false);
		Cnd_not_acpt_flg.setValue(false);
		// 主担当のみ
		Cnd_main_flg.setValue(true);
		// 未入力、入力済
		Cnd_not_input_flg.setValue(true);
		Cnd_input_flg.setValue(true);
		// 記録書
		Cnd_mrkt_judg_not_prnt_flg.setValue(true);
		Cnd_mrkt_judg_prnt_flg.setValue(true);
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		// 登録訂正種別の場合に行う。
		if (isSelectedUpd()) {
			RsltTable.fillSpace();
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	// -----------------------------------------------
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}

	@Override
	public void setUPD_JUDGStatus() {
		super.setUPD_JUDGStatus();
		setBulkSetVal();
		setBulkSetMode();
		setBtnMode();
	}

	/**
	 * 一括設定用項目の初期値設定
	 */
	protected void setBulkSetVal() {
		if (isSelectedJudg()) {
			setValueEx(BulkSet_judg_dt, getToday());
			if (isNull(getBulkSetR().judg_usr_cd())) {
				BulkSet_judg_usr_cd.setValue(mcframe.clientCore.sys.MCSys.user.ID());
			}
			BulkSet_usr_dpt_p_PPanel.focusFirstComponent();
		}
	}

	/**
	 * 一括設定項目制御を設定する。
	 */
	protected void setBulkSetMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			if (isSelectedJudg()) {
				BulkSet_judg_dt.setMode(MCMode.READ_ONLY);
				BulkSet_judg_usr_cd.setMode(MCMode.READ_ONLY);
			}
		}
	}
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
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
	public void setSRCH_UPD_JUDGStatus() {
		super.setSRCH_UPD_JUDGStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_JUDGStatus() {
		super.setSRCH_DEL_JUDGStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDEL_JUDGStatus() {
		super.setDEL_JUDGStatus();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_PRNTStatus() {
		super.setSRCH_PRNTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (r.isStatusCreate() || isNull(r.upd_cntr())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Btn_rcopy);
			}
		}

		// 画面遷移ボタン
		// 製造指図進捗一覧照会
		if (isEnableBtn_open_MSBCP1070(r)) {
			setDefaultMode(Btn_open_MSBCP1070);
		}
		else {
			Btn_open_MSBCP1070.setMode(MCMode.DISABLE);
		}
		// 検査実績一覧
		if (isEnableBtn_open_MSBFP0060(r)) {
			setDefaultMode(Btn_open_MSBFP0060);
		}
		else {
			Btn_open_MSBFP0060.setMode(MCMode.DISABLE);
		}
		// ロットトレース（原因調査）
		if (isEnableBtn_open_MSBFP0120(r)) {
			setDefaultMode(Btn_open_MSBFP0120);
		}
		else {
			Btn_open_MSBFP0120.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 製造指図進捗一覧照会画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBCP1070(RsltR r) {
		if (r == null || r.add_flg()) {
			return false;
		}
		return !isNull(r.itm_cd());
	}

	/**
	 * 検査実績一覧画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0060(RsltR r) {
		if (r == null || r.add_flg()) {
			return false;
		}
		
		return !isNull(r.itm_cd());
	}

	/**
	 * ロットトレース（原因調査）画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0120(RsltR r) {
		if (r == null || r.add_flg()) {
			return false;
		}
		
		return !isNull(r.itm_cd());
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isJudgStatus() {
		return isSame(getStatus(), UPD_JUDG);
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (isSelectedUpd()) {
			setUPDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedJudg()) {
			setSRCH_UPD_JUDGStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedDel()) {
			setSRCH_DELStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedDelJudg()) {
			setSRCH_DEL_JUDGStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedRef()) {
			setSRCHStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedPrnt()) {
			setSRCH_PRNTStatus();
			FoldTab.focusActiveFirstComponent();
		}

		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (isSelectedUpd()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedJudg()) {
			setUPD_JUDGStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedDel()) {
			setDELStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedDelJudg()) {
			setDEL_JUDGStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedRef()) {
			setREFStatus();
		}
		else if (isSelectedPrnt()) {
			setPRNTStatus();
			RsltTable.selectLeftmostColumn(0);
		}

		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	// -----------------------------------------------
	// event/listener
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
			// FIX（ファイル取込エラー時）、REF（検索モード）では、クリア確認出さない
			if (!isUpdStatus() || isStatusNone(getRsltL())) {
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
		clearContainers(getBulkSetR(), getRsltL());
		clearCnd();
		fillSpace();
		setSrchStatus();
		setStatusColumn();
	}

	protected void clearCnd() {
		// 登録・訂正
		if (isSelectedUpd()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_acpt_flg, false);
			setValueEx(Cnd_not_acpt_flg, false);
			setValueEx(Cnd_input_flg, true);
			setValueEx(Cnd_not_input_flg, true);
			setValueEx(Cnd_mrkt_judg_not_prnt_flg, true);
			setValueEx(Cnd_mrkt_judg_prnt_flg, true);
			setValueEx(Cnd_judg_dt_fr, null);
			setValueEx(Cnd_judg_dt_to, null);
			setValueEx(Cnd_judg_usr_cd, null);
			setValueEx(Cnd_judg_usr_nm, null);
			setValueEx(Cnd_judg_dpt_cd, null);
			setValueEx(Cnd_judg_dpt_nm, null);
			setValueEx(Btn_prnt_flg, false);
		}
		// 判定
		else if (isSelectedJudg()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_acpt_flg, false);
			setValueEx(Cnd_not_acpt_flg, false);
			setValueEx(Cnd_input_flg, true);
			setValueEx(Cnd_not_input_flg, true);
			setValueEx(Cnd_mrkt_judg_not_prnt_flg, true);
			setValueEx(Cnd_mrkt_judg_prnt_flg, true);
			setValueEx(Btn_prnt_flg, true);
		}
		// 取消
		else if (isSelectedDel()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_acpt_flg, false);
			setValueEx(Cnd_not_acpt_flg, false);
			setValueEx(Cnd_input_flg, false);
			setValueEx(Cnd_not_input_flg, true);
			setValueEx(Cnd_mrkt_judg_not_prnt_flg, true);
			setValueEx(Cnd_mrkt_judg_prnt_flg, true);
			setValueEx(Cnd_judg_dt_fr, null);
			setValueEx(Cnd_judg_dt_to, null);
			setValueEx(Cnd_judg_usr_cd, null);
			setValueEx(Cnd_judg_usr_nm, null);
			setValueEx(Cnd_judg_dpt_cd, null);
			setValueEx(Cnd_judg_dpt_nm, null);
			setValueEx(Btn_prnt_flg, false);
		}
		// 判定取消
		else if (isSelectedDelJudg()) {
			setValueEx(Cnd_opn_flg, false);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_not_acpt_flg, false);
			setValueEx(Cnd_input_flg, true);
			setValueEx(Cnd_not_input_flg, true);
			setValueEx(Cnd_mrkt_judg_not_prnt_flg, true);
			setValueEx(Cnd_mrkt_judg_prnt_flg, true);
			setValueEx(Btn_prnt_flg, false);
		}
		// 参照
		else if (isSelectedRef()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_not_acpt_flg, true);
			setValueEx(Cnd_input_flg, true);
			setValueEx(Cnd_not_input_flg, true);
			setValueEx(Cnd_mrkt_judg_not_prnt_flg, true);
			setValueEx(Cnd_mrkt_judg_prnt_flg, true);
			setValueEx(Btn_prnt_flg, false);
		}
		// 記録書発行
		else if (isSelectedPrnt()) {
			setValueEx(Cnd_opn_flg, false);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_not_acpt_flg, true);
			setValueEx(Cnd_input_flg, true);
			setValueEx(Cnd_not_input_flg, true);
			setValueEx(Cnd_mrkt_judg_not_prnt_flg, true);
			setValueEx(Cnd_mrkt_judg_prnt_flg, false);
			setValueEx(Btn_prnt_flg, false);
		}
	}

	protected void setStatusColumn() {
		// 行ステータスカラムの表示非表示。登録・訂正種別では表示、それ以外は非表示
		if (isSelectedUpd()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	/**
	 * 操作種別の登録・訂正を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedUpd(){
		return Cnd_ope_UPD.isSelected();
	}
	/**
	 * 操作種別の判定を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedJudg(){
		return Cnd_ope_UPD_JUDG.isSelected();
	}
	/**操作種別が取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDel() {
		return Cnd_ope_DEL.isSelected();
	}
	/**操作種別が判定取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDelJudg() {
		return Cnd_ope_DEL_JUDG.isSelected();
	}
	/**
	 * 操作種別の参照を選択しているかどうか
	 * @return 
	 */	
	protected boolean isSelectedRef(){
		return Cnd_ope_REF.isSelected();
	}
	/**操作種別が記録書発行を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedPrnt() {
		return Cnd_ope_PRNT.isSelected();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_judg_usr_cd.addLCListener(this);
		BulkSet_judg_usr_dpt_cd.addLCListener(this);
		BulkSet_judg_rsn.addNCListener(this);
		Rslt_itm_p_PPanel.addItmLCListner(this);
	}

	// 一括設定処理 
	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		if (!(srcRow instanceof RsltR)) {
			return;
		}

		if (!isSelectedJudg()) {
			return;
		}
		RsltR r = (RsltR)srcRow;

		if (isNull(r.judg_dt())) {
			bulkSet(BulkSet_judg_dt, r);
		}
		if (isNull(r.judg_usr_cd())) {
			bulkSet(BulkSet_judg_usr_cd, r);
		}
		if (isNull(r.judg_usr_dpt_cd())) {
			bulkSet(BulkSet_judg_usr_dpt_cd, r);
		}
		if (isNull(r.judg_rsn())) {
			bulkSet(BulkSet_judg_rsn, r);
		}
	}

	// 選択チェックオン時の設定
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.check()) {

			// 判定の場合
			if (isSelectedJudg() || isSelectedDelJudg()) {
				bulkSet(BulkSet_judg_dt, r);
				bulkSet(BulkSet_judg_usr_cd, r);
				bulkSet(BulkSet_judg_usr_dpt_cd, r);
				bulkSet(BulkSet_judg_rsn, r);
			}
			else if (isSelectedUpd()) {
				bulkSet(BulkSet_all_clear_flg, r);
			}
		}
	}

	@Override
	public void doRslt_mfg_so_aprv_typ_NC(MCEventInfo info) {
		super.doRslt_mfg_so_aprv_typ_NC(info);
		clearAcptFlg(info);
	}

	@Override
	public void doRslt_quality_mng_typ_NC(MCEventInfo info) {
		super.doRslt_quality_mng_typ_NC(info);
		clearAcptFlg(info);
	}

	@Override
	public void doRslt_mfg_mng_typ_NC(MCEventInfo info) {
		super.doRslt_mfg_mng_typ_NC(info);
		clearAcptFlg(info);
	}

	@Override
	public void doRslt_deviant_typ_NC(MCEventInfo info) {
		super.doRslt_deviant_typ_NC(info);
		clearAcptFlg(info);
		clearDeviantMsrTyp(info);
	}

	@Override
	public void doRslt_deviant_msr_typ_NC(MCEventInfo info) {
		super.doRslt_deviant_msr_typ_NC(info);
		clearAcptFlg(info);
		setDeviantTyp(info);
	}

	@Override
	public void doRslt_prod_itm_info_typ_NC(MCEventInfo info) {
		super.doRslt_prod_itm_info_typ_NC(info);
		clearAcptFlg(info);
		clearIntrRmrks(info);
	}

	@Override
	public void doRslt_chd_itm_info_typ_NC(MCEventInfo info) {
		super.doRslt_chd_itm_info_typ_NC(info);
		clearAcptFlg(info);
		clearIntrRmrks(info);
	}

	@Override
	public void doRslt_intr_rmrks_NC(MCEventInfo info) {
		super.doRslt_intr_rmrks_NC(info);
		clearAcptFlg(info);
	}

	public void clearAcptFlg(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		
		if (isJudgStatus() && !chkAcpt(r)) {
			setValueEx(columnRslt_acpt_flg, info.getEventIndex(), false);
		}
	}

	protected void clearIntrRmrks(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!MSC_PROD_ITM_INFO_TYP.isEXIST(r.prod_itm_info_typ()) && !MSC_CHD_ITM_INFO_TYP.isEXIST(r.chd_itm_info_typ())) {
			r.intr_rmrks(null);
		}
	}

	protected void clearDeviantMsrTyp(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (MSC_DEVIANT_TYP.isNO_EXIST(r.deviant_typ())) {
			setValueEx(columnRslt_deviant_msr_typ, info.getEventIndex(), null);
		}
	}

	protected void setDeviantTyp(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (isNull(r.deviant_typ()) && !isNull(r.deviant_msr_typ())) {
			setValueEx(columnRslt_deviant_typ, info.getEventIndex(), MSC_DEVIANT_TYP.EXIST.value());
		}
	}

	@Override
	public void doBulkSet_judg_dt_NC(MCEventInfo info) {
		super.doBulkSet_judg_dt_NC(info);

		bulkSet(BulkSet_judg_dt);
		setBulkSetMode();
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		
		if (nc == BulkSet_judg_rsn) {
			bulkSet(BulkSet_judg_rsn);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == BulkSet_judg_usr_cd) {
			bulkSet(BulkSet_judg_usr_cd);
		}
		else if (lc == BulkSet_judg_usr_dpt_cd) {
			bulkSet(BulkSet_judg_usr_dpt_cd);
		}
		else if (Rslt_itm_p_PPanel.isItm(lc)) {
			doRslt_itm_LC(info);
		}
	}

	@Override
	public void doBulkSet_intr_rmrks_NC(MCEventInfo info) {
		super.doBulkSet_intr_rmrks_NC(info);
		bulkSet(BulkSet_intr_rmrks);
	}

	@Override
	public void doBulkSet_all_clear_flg_NC(MCEventInfo info) {
		super.doBulkSet_all_clear_flg_NC(info);
		bulkSet(BulkSet_all_clear_flg);
	}

	public void doRslt_itm_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		RsltR r = getRsltL().get(index);
		if (isNull(r.itm_cd())) {
			r.add_flg(false);
		}
		else {
			r.add_flg(true);
		}
	}

	@Override
	public void doRslt_acpt_flg_NC(MCEventInfo info) {
		super.doRslt_acpt_flg_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		RsltR r = getRsltL().get(index);
		if (isEditable(columnRslt_acpt_flg, index) && r.acpt_flg()) {
			r.not_acpt_flg(false);
			r.check(false);
		}
		setCheck(r);
	}

	@Override
	public void doRslt_not_acpt_flg_NC(MCEventInfo info) {
		super.doRslt_not_acpt_flg_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		RsltR r = getRsltL().get(index);
		if (isEditable(columnRslt_not_acpt_flg, index) && r.not_acpt_flg()) {
			r.acpt_flg(false);
			r.check(false);
		}
		setCheck(r);
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			// 検査実績一覧登録
			if (isEnableBtn_open_MSBFP0060(r)) {
				doBtn_open_MSBFP0060(r);
			}
		}
	}

	/**
	 * 一覧の出荷許可FLG、出荷禁止FLGにあわせて、選択チェックを設定する。
	 */
	protected void setCheck(RsltR r) {
		if (r.acpt_flg() || r.not_acpt_flg()) {
			setValueEx(columnRslt_check, r.getGUIIndex(), true);
		}
		else {
			setValueEx(columnRslt_check, r.getGUIIndex(), false);
		}
	}

	/**
	 * 一括項目設定
	 * @param b
	 */
	protected void bulkSet(MCBeans b) {

		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	/**
	 * 指定した行の項目設定
	 * @param b
	 * @param r
	 */
	protected void bulkSet(MCBeans b, RsltR r) {
		if (isJudgStatus()) {
			if (b == BulkSet_judg_dt) {
				r.judg_dt(getBulkSetR().judg_dt());
			}
			else if (b == BulkSet_judg_usr_cd) {
				r.judg_usr_cd(getBulkSetR().judg_usr_cd());
				r.judg_usr_nm(getBulkSetR().judg_usr_nm());
			}
			else if (b == BulkSet_judg_usr_dpt_cd) {
				r.judg_usr_dpt_cd(getBulkSetR().judg_usr_dpt_cd());
				r.judg_usr_dpt_nm(getBulkSetR().judg_usr_dpt_nm());
			}
			else if (b == BulkSet_judg_rsn) {
				r.judg_rsn(getBulkSetR().judg_rsn());
			}
			else if (b == BulkSet_intr_rmrks
					&& isEditable(columnRslt_intr_rmrks, r.getGUIIndex())) {
				r.intr_rmrks(getBulkSetR().intr_rmrks());
			}
		}
		else if (isSelectedDelJudg()) {
			if (b == BulkSet_judg_rsn) {
				r.judg_rsn(getBulkSetR().judg_rsn());
			}
		}
		else if (isUpdStatus()) {
			if (b == BulkSet_all_clear_flg) {
				if (getBulkSetR().all_clear_flg()) {
					r.mfg_so_aprv_typ(null);
					r.mfg_so_aprv_typ_nm(null);
					r.quality_mng_typ(null);
					r.quality_mng_typ_nm(null);
					r.mfg_mng_typ(null);
					r.mfg_mng_typ_nm(null);
					r.deviant_typ(null);
					r.deviant_typ_nm(null);
					r.deviant_msr_typ(null);
					r.deviant_msr_typ_nm(null);
					r.prod_itm_info_typ(null);
					r.prod_itm_info_typ_nm(null);
					r.chd_itm_info_typ(null);
					r.chd_itm_info_typ_nm(null);
					r.intr_rmrks(null);
				}
			}
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
			if (isUpdStatus()) {
				// 既に登録された項目は入力不可とする
				if (!isNull(r.mrkt_judg_no())) {
					if (column == columnRslt_itm_cd
							|| column == columnRslt_itm_sub1
							|| column == columnRslt_itm_sub2
							|| column == columnRslt_itm_sub3
							|| column == columnRslt_lot_no
							|| column == columnRslt_site_cd) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_ntfy_nm) {
					if (!r.add_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (isJudgStatus()) {
				if (column == columnRslt_acpt_flg) {
					if (!chkAcpt(r)) {
						return MCMode.READ_ONLY;
					}
				}
				if (isTpyItms(column)) {
					if (r.not_acpt_flg()) {
						return MCMode.ENABLE;
					}
				}
			}
			
			if (isUpdStatus() || isJudgStatus()) {
				if (column == columnRslt_intr_rmrks) {
					if (!MSC_PROD_ITM_INFO_TYP.isEXIST(r.prod_itm_info_typ()) && !MSC_CHD_ITM_INFO_TYP.isEXIST(r.chd_itm_info_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						if (r.not_acpt_flg()) {
							return MCMode.ENABLE;
						}
					}
				}
				if (column == columnRslt_deviant_msr_typ) {
					if (MSC_DEVIANT_TYP.isNO_EXIST(r.deviant_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		/**
		 * 画面の入力区分項目を判定する。
		 * @param column
		 * @return
		 */
		protected boolean isTpyItms(MCColumnConfig column) {
			if (column == columnRslt_mfg_so_aprv_typ
					|| column == columnRslt_quality_mng_typ
					|| column == columnRslt_mfg_mng_typ
					|| column == columnRslt_deviant_typ
					|| column == columnRslt_deviant_msr_typ
					|| column == columnRslt_prod_itm_info_typ
					|| column == columnRslt_chd_itm_info_typ) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	/**
	 * 出荷許可の判定が可能かどうか判定する
	 * @return 出荷許可の判定が可能な場合はtrueを返す。
	 */
	protected boolean chkAcpt(RsltR r){
		if (isJudgStatus()){
			// 製造所からの出荷承認結果
			if (MSC_MFG_SO_APRV_TYP.isNG(r.mfg_so_aprv_typ())){
				return false;
			}
			// 品質管理結果
			else if (MSC_QUALITY_MNG_TYP.isNG(r.quality_mng_typ())){
				return false;
			}
			// 製造管理結果
			else if (MSC_MFG_MNG_TYP.isNG(r.mfg_mng_typ())){
				return false;
			}
			// 逸脱区分、逸脱措置
			else if(MSC_DEVIANT_TYP.isEXIST(r.deviant_typ())
				&& MSC_DEVIANT_MSR_TYP.isNOT_PROPER(r.deviant_msr_typ())){
				return false;
			}
			// 製品の品質・有効性・安全性の情報
			else if (MSC_PROD_ITM_INFO_TYP.isEXIST(r.prod_itm_info_typ())
				&& isNull(r.intr_rmrks())){
				return false;
			}
			// 原材料の品質・有効性・安全性の情報
			else if (MSC_CHD_ITM_INFO_TYP.isEXIST(r.chd_itm_info_typ())
				&& isNull(r.intr_rmrks())){
				return false;
			}

			return true;
		}

		return false;
	}

	// fileImport
	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return isSelectedUpd();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		callMS_MSBFL0100_Imp01();
	}

}