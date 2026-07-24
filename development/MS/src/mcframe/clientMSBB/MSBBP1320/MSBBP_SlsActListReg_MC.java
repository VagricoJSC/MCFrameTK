package mcframe.clientMSBB.MSBBP1320;

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
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5070.*;

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
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMSBB.MSBBP1310.MSBBP_SlsActReg;
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.commonMA.meta.MA_META;
import mcframe.clientCore.beans.list.*;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.LotNoCols;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.clientMSUC.MSUCP0020.*;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import java.util.HashMap;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsActListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsActListReg_MC extends MSBBP_SlsActListReg_MC_A implements IfListRegPanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected static final String SRCH_MODE_DTL = "DTL";
	
	protected MCIndexKey _ikIv;
	protected MCIndexKey _ikSls;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsActListReg_MC() {
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
	public MSBBP_SlsActListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1320_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Del01Caller<P extends MSBBP_SlsActListReg, B extends MS_MSBBL1320_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1320_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
			setPrint(true);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0().setBooleanNE(RsltR.$prnt_out_flg, getBtnR().prnt_out_flg());
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
	 * [MS_MSBBL1320_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Upd01Caller<P extends MSBBP_SlsActListReg, B extends MS_MSBBL1320_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1320_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
			setPrint(true);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0().setBooleanNE(RsltR.$prnt_out_flg, getBtnR().prnt_out_flg());
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			// 入力値チェック
			msgList.addAll(inptChk());
		}
	}


	/**
	 * [MS_MSBBL1320_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Srch01Caller<P extends MSBBP_SlsActListReg, B extends MS_MSBBL1320_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1320_Srch01Caller(P p, B b) {
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
		protected void show() {
			super.show();

			_ikIv = getRsltL().createIndex(RsltR.$iv_no);
			copyAmtDataSchd();
			setOrgAmt();
			setPrntOutFlgTyp();
			for (RsltR r : getRsltL()) {
				r.org_xrate(r.xrate());
				r.org_ptax_xrate(r.ptax_xrate());
			}
		}
		protected void copyAmtDataSchd() {
			
		}
	}

	/**
	 * [MS_MSBBL1320_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Srch02Caller<P extends MSBBP_SlsActListReg, B extends MS_MSBBL1320_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1320_Srch02Caller(P p, B b) {
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
		protected void show() {
			super.show();

			if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
				_ikIv = getRsltL().createIndex(RsltR.$iv_no);
				_ikSls = getRsltL().createIndex(RsltR.$sls_act_no);
				
				setReadOnlyFlg();
			}
			copyAmtData();
			setOrgAmt();
			setPrntOutFlgTyp();
		}
		protected void copyAmtData() {
			for (RsltR r : exceptDeleteAndEmpty(getRsltL())) {
				r.db_trd_unit_cd(r.trd_unit_cd());
				r.db_trd_unit_conv_qty(r.trd_unit_conv_qty());
				r.db_trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
				r.db_trd_unit_dec_place(r.trd_unit_dec_place());
				r.db_trd_unit_rnd_typ(r.trd_unit_rnd_typ());
				r.db_trd_unit_qty(r.trd_unit_qty());
				r.db_trd_cur_amt(r.trd_cur_amt());
				r.db_trd_cur_dscnt_amt(r.trd_cur_dscnt_amt());
				r.db_trd_cur_tax_amt(r.trd_cur_tax_amt());
				r.db_trd_cur_upri(r.trd_cur_upri());
				r.db_wtax_rate(r.wtax_rate());
				r.db_tax_rate(r.tax_rate());
				r.db_inc_tax_flg(r.inc_tax_flg());
			}
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			for (RsltR rsltR : bridge.down0()) {
				// 計上日を取消計上日にコピー
				rsltR.can_ac_dt(rsltR.ac_dt());
			}
		}
	}

	protected void setReadOnlyFlg() {
		// ヘッダ項目の入力可否を判定するため、ＦＬＧを設定する
		// 同じ売上実績ＮＯが複数件ある場合、その中の売上実績明細の小さい行のみ入力可とし、
		// それ以外は入力不可とする。
		// インボイスＮＯと売上実績ＮＯも同じ制御を行う
		
		for (RsltR r : getRsltL()) {
			MCList<RsltR> ivL = getRsltL().subList(_ikIv, r.iv_no());
			MCList<RsltR> slsL = getRsltL().subList(_ikSls, r.sls_act_no());
			
			if (ivL.size() > 1) {
				String minIvDNo = (String)ivL.min(RsltR.$iv_d_no);
				if (isSame(minIvDNo, r.iv_d_no())) {
					r.iv_read_only_flg(false);
				}
				else {
					r.iv_read_only_flg(true);
				}
			}
			else {
				r.iv_read_only_flg(false);
			}

			if (slsL.size() > 1) {
				String minSlsActDNo = (String)slsL.min(RsltR.$sls_act_d_no);
				if (isSame(minSlsActDNo, r.sls_act_d_no())) {
					r.sls_read_only_flg(false);
				}
				else {
					r.sls_read_only_flg(true);
				}
			}
			else {
				r.sls_read_only_flg(false);
			}
		}
	}

	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_sls_schd_dt_fr, Cnd_sls_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_sls_dt_fr, Cnd_sls_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		msgList.addAll(checkAtLeastOne(OpeTypPanel));
		msgList.addAll(checkAtLeastOne(CstIvPanel));
		msgList.addAll(checkAtLeastOne(EdiPanel));
	}

	/**
	 * [MS_MSBBL1320_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1320_Ins01Caller<P extends MSBBP_SlsActListReg, B extends MS_MSBBL1320_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1320_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
			setPrint(true);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0().setBooleanNE(RsltR.$prnt_out_flg, getBtnR().prnt_out_flg());
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			// 入力値チェック
			msgList.addAll(inptChk());
		}
	}
	
	/**
	 * 入力値チェックマスタによる入力値チェックを行う
	 */
	protected MCMessageList inptChk() {
		
		MCMessageList msgL = new MCMessageList();
		
		MCList<RsltR> chkTargetL = makeInptChkTargetList();
		
		if (!chkTargetL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.SLS.value(),
					columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
					columnRslt_sls_act_d_no, columnRslt_base_unit_qty_bef, columnRslt_base_unit_qty,
					columnRslt_sls_qty, columnRslt_sls_schd_qty, 
					chkTargetL, columnRslt_trd_unit_qty, columnRslt_sls_schd_no));
		}
		return msgL;
	}
	
	protected String[] getGrpColums() {
		return new String[] {
				RsltR.$sls_schd_no
		};
	}
	
	protected MCGroupByPolicy getInptChkGrpPolicy() {
		return new MCGroupByPolicy(getGrpColums());
	}
	
	protected MCList<RsltR> makeInptChkTargetList() {
		MCList<RsltR> chkTargetL = MCList.create(RsltR.class);
		
		MCList<RsltR> targetRsltL = getRsltL().subList(r -> r.check());
		MCIndexKey targetRsltIdxKey = targetRsltL.createIndex(RsltR.$sls_schd_no);
		
		MCGroupByPolicy grpKey = getInptChkGrpPolicy();
		
		MCList<RsltR> slsSchdGroupL = targetRsltL.groupBy(grpKey);
		for (RsltR slsSchdGroupR : slsSchdGroupL) {
			
			if (isNull(slsSchdGroupR.sls_schd_no())) {
				continue;
			}
			
			chkTargetL.addAll(targetRsltL.subList(targetRsltIdxKey, slsSchdGroupR.sls_schd_no()));
		}
		
		return chkTargetL;
	}
	
	/**
	 * Panel[Btn]のボタン[open_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl(MCEventInfo info) {
		RsltR row = RsltTable.getSelectedMCRow();
		if (isNull(row)) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_dtl(row);
	}
	
	protected void doBtn_open_dtl(RsltR row) {
		
		MAUCP_AppScreenOpener aso;
		
		if (MSC_SLS_TGT_TYP.isDDLV_SLS(row.sls_tgt_typ()) || row.ddlv_sls_flg()) {
			aso = new MAUCP_AppScreenOpener("MS", "MSBBP1360");
			aso.putCnd(crtOpenMSBBP1360CndR(aso, row));
			aso.putSearchAction();
			aso.show();
			return;
		}
		
		aso = new MAUCP_AppScreenOpener("MS", "MSBBP1310");
		aso.putCnd(crtOpenMSBBP1310CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBBP1330]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1330(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1330");
		aso.putCnd(crtOpenMSBBP1330CndR(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MSBBP1330]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1330.CndR crtOpenMSBBP1330CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1330.MSBBP_SlsRetSchdReg p = 
				(mcframe.clientMSBB.MSBBP1330.MSBBP_SlsRetSchdReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1330.CndR to = mcframe.clientMSBB.MSBBP1330.CndR.create();

		to.ope(p.Cnd_ope_INS.getActionCommand());
		to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
		to.srch_tgt_no(r.sls_act_no());
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBBP1340]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1340(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1340");
		aso.putCnd(crtOpenMSBBP1340CndR(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MSBBP1340]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1340.CndR crtOpenMSBBP1340CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1340.MSBBP_SlsRetReg p = 
				(mcframe.clientMSBB.MSBBP1340.MSBBP_SlsRetReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1340.CndR to = mcframe.clientMSBB.MSBBP1340.CndR.create();

		to.ope(p.Cnd_ope_INS.getActionCommand());
		to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
		to.srch_tgt_no(r.sls_act_no());
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBBP1380]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1380(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1380");
		aso.putCnd(crtOpenMSBBP1380CndR(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MSBBP1380]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1380.CndR crtOpenMSBBP1380CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg p = 
				(mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1380.CndR to = mcframe.clientMSBB.MSBBP1380.CndR.create();

		to.ope(p.Cnd_ope_INS.getActionCommand());
		to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.REF_SLS_ACT_NO.name());
		to.srch_tgt_no(r.sls_act_no());
		return to;
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (isSrch01()) {
			callMS_MSBBL1320_Srch01();
		}
		else {
			callMS_MSBBL1320_Srch02();
		}
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (isSrch01()) {
			createMS_MSBBL1320_Srch01().execDL();
		}
		else {
			createMS_MSBBL1320_Srch02().execDL();
		}
	}

	protected boolean isSrch01() {
		if (Cnd_ope_INS.isSelected()) {
			return true;
		}
		return false;
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		try {
			_useXrateCacheFlg = true;
			doSelectAll(RsltTable);
		}
		finally {
			_useXrateCacheFlg = false;
			_xrateMap.clear();
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBBL1320_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1320_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1320_Del01();
	}

	// -----------------------------------------------
	// init-parts
	// 一覧登録系画面は原則IfListRegPanelをimplementsすること。implementsすることで、
	// ・一覧の何らかの項目に値を入れたら、選択チェックをオンにする
	// ・本画面の計上日など、一覧上部の一括設定用項目に値を設定した値を、
	//  一覧に設定するためのメソッドの呼び出し（setDefaultValueWhenChecked）
	// を行ってくれる。setDefaultValueWhenCheckedの実装内容は後述
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		// 担当者部門
		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_ac_dt);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_ac_dt, columnRslt_sls_tgt_typ); // 日付変更でクリアされないようにする
		
		// 計上日
		BulkSet_ac_dt_p_PPanel.setRelateBeans(BulkSet_sls_dt);
		Rslt_ac_dt_p_PPanel.setRelateBeans(columnRslt_sls_dt);

		// 為替レート
		Rslt_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_base_cur_cd,
				columnRslt_xrate_cd, columnRslt_sls_dt, true, columnRslt_xrate_inpt_flg, true);

		// 納税為替レート
		Rslt_ptax_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_ptax_cur_cd,
				columnRslt_xrate_cd, columnRslt_sls_dt, true, columnRslt_ptax_xrate_inpt_flg, true);

		// ロットＮＯ
		Rslt_lot_no_p_PPanel.setRelateBeans(columnRslt_itm_cd,
				columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
				columnRslt_lot_mng_typ, columnRslt_lot_no_typ,
				columnRslt_sublot_mng_typ, columnRslt_sublot_no_typ,
				true);
		
		// 数量
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2,columnRslt_itm_sub3, columnRslt_trd_unit_cd,
				columnRslt_trd_unit_dec_place, columnRslt_trd_unit_rnd_typ, 
				columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty,
				columnRslt_base_unit_cd);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty);
		
		Rslt_sls_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_abort_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_sls_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_trd_upri_amt_p_PPanel.setAmtToUpri(true);
		Rslt_trd_upri_amt_p_PPanel.setRelateBeans(
				columnRslt_trd_cur_cd,
				columnRslt_cst_cd,
				columnRslt_itm_cd,
				columnRslt_itm_sub1,
				columnRslt_itm_sub2,
				columnRslt_itm_sub3,
				columnRslt_trd_unit_cd,
				columnRslt_trd_unit_qty,
				columnRslt_trd_cur_amt_dec_place,
				columnRslt_trd_cur_upri_dec_place,
				columnRslt_sls_amt_rnd_typ,
				columnRslt_sls_tax_rnd_typ,
				columnRslt_bp_sls_upri_cng_flg,
				columnRslt_itm_sls_upri_cng_flg,
				columnRslt_dscnt_itm_flg,
				columnRslt_sls_schd_no,
				columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty,
				columnRslt_schd_trd_unit_conv_base_qty,
				columnRslt_schd_trd_unit_conv_qty,
				columnRslt_base_unit_dec_place,
				columnRslt_base_unit_rnd_typ);

		// 単価、金額
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_upri_dec_place, columnRslt_trd_cur_upri, columnRslt_xrate);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_amt, columnRslt_xrate);
		Rslt_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_inc_tax_amt, columnRslt_xrate);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_tax_amt, columnRslt_xrate);
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_dscnt_amt, columnRslt_xrate);
		
		Rslt_ptax_cur_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd,
				columnRslt_ptax_cur_upri_dec_place, columnRslt_trd_cur_upri, columnRslt_ptax_xrate);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd,
				columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_amt, columnRslt_ptax_xrate);
		Rslt_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd,
				columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_inc_tax_amt, columnRslt_ptax_xrate);
		Rslt_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd,
				columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_tax_amt, columnRslt_ptax_xrate);
		Rslt_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd,
				columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_dscnt_amt, columnRslt_ptax_xrate);

		Rslt_cost_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_upri_dec_place);
		Rslt_cost_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place);

		Rslt_ver_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, null, columnRslt_ver_flg);
		
		// 分類項目
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		Rslt_acst_grp_p_PPanel.setRelateBeans(Cnd_acst_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
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
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());

		setValueEx(Cnd_arrv_sls_flg, true);
		setValueEx(Cnd_sls_cststk_flg, true);
		setValueEx(Cnd_sls_ddlv_flg, true);
		setValueEx(Cnd_not_ship_ord_sls_flg, true);
		setValueEx(Cnd_iv_flg, true);
		setValueEx(Cnd_not_iv_flg, true);
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_edi_flg, false);
		}
		else {
			setValueEx(Cnd_edi_flg, true);
		}
		setValueEx(Cnd_not_edi_flg, true);

		setValueEx(Cnd_sls_schd_dt_to, getToday());

		setValueEx(BulkSet_sls_dt, getToday());
		setValueEx(BulkSet_ac_dt, getToday());
		setValueEx(BulkSet_bill_basis_dt, getToday());
		setValueEx(BulkSet_ship_dt, getToday());
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// 画面遷移
	protected mcframe.clientMSBB.MSBBP1310.CndR crtOpenMSBBP1310CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {

		MSBBP_SlsActReg p = (MSBBP_SlsActReg) aso.getPanel();

		mcframe.clientMSBB.MSBBP1310.CndR to = mcframe.clientMSBB.MSBBP1310.CndR.create();
		if (Cnd_ope_INS.isSelected()) {
			to.ope(p.Cnd_ope_INS.getActionCommand());
			if (r.cst_iv_flg()) {
				to.srch_tgt_no(r.iv_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.IV_NO.name());
			}
			else if (!isNull(r.slo_no()) && !MSC_SLS_TGT_TYP.isXFR_IN_SLS(r.sls_tgt_typ()) && !MSC_SLS_TGT_TYP.isARRIVAL_SLS(r.sls_tgt_typ())){
				to.srch_tgt_no(r.slo_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLO_NO.name());
			}
			else {
				to.srch_tgt_no(r.ship_dlv_slip_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.DLV_SLIP_NO.name());
			}
		}
		else if (Cnd_ope_UPD.isSelected()) {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
			if (r.cst_iv_flg()) {
				to.srch_tgt_no(r.iv_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.IV_NO.name());
			}
			else {
				to.srch_tgt_no(r.sls_act_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			to.ope(p.Cnd_ope_DEL.getActionCommand());
			if (r.cst_iv_flg()) {
				to.srch_tgt_no(r.iv_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.IV_NO.name());
			}
			else {
				to.srch_tgt_no(r.sls_act_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			if (r.cst_iv_flg()) {
				to.srch_tgt_no(r.iv_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.IV_NO.name());
			}
			else {
				to.srch_tgt_no(r.sls_act_no());
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
			}
			to.latest_flg(true);
		}
		return to;
	}

	protected mcframe.clientMSBB.MSBBP1360.CndR crtOpenMSBBP1360CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {

		MSBBP_PurcDdlvReg p = (MSBBP_PurcDdlvReg) aso.getPanel();

		mcframe.clientMSBB.MSBBP1360.CndR to = mcframe.clientMSBB.MSBBP1360.CndR.create();
		if (Cnd_ope_INS.isSelected()) {
			to.ope(p.Cnd_ope_INS.getActionCommand());
			if (!isNull(r.purc_ddlv_dlv_slip_no())) {
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.DLV_SLIP_NO.name());
				to.srch_tgt_no(r.purc_ddlv_dlv_slip_no());
			}
			else {
				to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLO_NO.name());
				to.srch_tgt_no(r.slo_no());
			}
		}
		else if (Cnd_ope_UPD.isSelected()) {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
			to.srch_tgt_no(r.sls_act_no());
		}
		else if (Cnd_ope_DEL.isSelected()) {
			to.ope(p.Cnd_ope_DEL.getActionCommand());
			to.srch_tgt_no(r.sls_act_no());
		}
		else if (Cnd_ope_REF.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.srch_tgt_no(r.sls_act_no());
			to.latest_flg(true);
		}
		return to;
	}

	protected mcframe.clientMSBE.MSBEP1730.CndR crtOpenMSBEP1730CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		
		MSBEP_IvReg p = (MSBEP_IvReg) aso.getPanel();
		
		mcframe.clientMSBE.MSBEP1730.CndR to = mcframe.clientMSBE.MSBEP1730.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.iv_no());
		return to;
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_INS.isSelected()) {
			setSRCH_INSStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_mode_DTL.isSelected()) {
				setREF_DTLStatus();
			}
			else {
				setREF_HDRStatus();
			}
			FoldTab.focusActiveFirstComponent();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_mode_DTL.isSelected()) {
				setREF_DTLStatus();
			}
			else {
				setREF_HDRStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

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

	// -----------------------------------------------
	// Event
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		BulkSet_ac_dt.addLCListener(this);
		BulkSet_sls_usr_cd.addLCListener(this);
		BulkSet_sls_dpt_cd.addLCListener(this);
		BulkSet_ship_dt.addLCListener(this);
		BulkSet_ship_hm.addLCListener(this);
		BulkSet_dlv_dt.addLCListener(this);
		BulkSet_dlv_hm.addLCListener(this);

		columnRslt_ac_dt.addLCListener(this);
		columnRslt_can_ac_dt_for_input.addLCListener(this);
		columnRslt_ship_dt.addLCListener(this);
		columnRslt_ship_hm.addLCListener(this);
		columnRslt_dlv_dt.addLCListener(this);
		columnRslt_dlv_hm.addLCListener(this);
		columnRslt_sls_usr_cd.addLCListener(this);
		columnRslt_sls_dpt_cd.addLCListener(this);
		columnRslt_trd_unit_qty.addLCListener(this);
		columnRslt_trd_cur_amt.addLCListener(this);
		columnRslt_xrate.addLCListener(this);
		columnRslt_ptax_xrate.addLCListener(this);
		columnRslt_trd_unit_qty.addNCListener(this);
		columnRslt_cost_upri.addLCListener(this);
		columnRslt_tax_cd.addLCListener(this);
		columnRslt_trd_cur_dscnt_amt.addLCListener(this);
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			doBtn_open_dtl(r);
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == BulkSet_ac_dt) {
			doBulkSet_ac_dt_LC(info);
		}
		if (lc == BulkSet_sls_usr_cd) {
			doBulkSet_sls_usr_cd_LC(info);
		}
		if (lc == BulkSet_sls_dpt_cd) {
			doBulkSet_sls_dpt_cd_LC(info);
		}
		if (lc == BulkSet_ship_dt) {
			doBulkSet_ship_dt_LC(info);
		}
		if (lc == BulkSet_ship_hm) {
			doBulkSet_ship_hm_LC(info);
		}
		if (lc == BulkSet_dlv_dt) {
			doBulkSet_dlv_dt_LC(info);
		}
		if (lc == BulkSet_dlv_hm) {
			doBulkSet_dlv_hm_LC(info);
		}
		
		if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		if (lc == columnRslt_can_ac_dt_for_input) doRslt_can_ac_dt_for_input_LC(info);
		if (lc == columnRslt_ship_dt) doRslt_ship_dt_LC(info);
		if (lc == columnRslt_ship_hm) doRslt_ship_hm_LC(info);
		if (lc == columnRslt_dlv_dt) doRslt_dlv_dt_LC(info);
		if (lc == columnRslt_dlv_hm) doRslt_dlv_hm_LC(info);
		if (lc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_LC(info);
		if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		if (lc == columnRslt_trd_unit_qty) doRslt_trd_unit_qty_LC(info);
		if (lc == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_LC(info);
		if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		if (lc == columnRslt_cost_upri) doRslt_cost_upri_LC(info); 
		if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info); 
	}
	protected void doRslt_cost_upri_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		setCostAmt(r);
	}
	@Override
	public void doRslt_trd_unit_cd_LC(MCEventInfo info) {
		super.doRslt_trd_unit_cd_LC(info);
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueForMoneyCols(rsltR);
	}
	@Override
	public void doRslt_trd_unit_cd_NC(MCEventInfo info) {
		super.doRslt_trd_unit_cd_NC(info);
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if (isNull(rsltR.sls_schd_no()) && isNull(rsltR.qtn_d_no())
				&& isNull(rsltR.sls_act_d_no())) {
			rsltR.trd_cur_dscnt_amt(null);
		}
	}

	protected void doRslt_trd_unit_qty_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setCostAmt(rsltR);
		setValueForMoneyCols(rsltR);
	}
	/**
	 * 数量、金額系項目に値をセットする
	 * @param dtlL 対象行
	 */
	protected void setValueForMoneyCols(RsltR rslt) {

		if ((isNull(rslt.sls_schd_no()) && isNull(rslt.qtn_d_no()))
				|| isNull(rslt.trd_unit_qty()) || isNull(rslt.trd_unit_cd())
				|| isNull(rslt.trd_cur_upri())) {
			return;
		}

		// 紐付NO
		int hdr_peg_no = 1;

		// ユーティリティ実行用ヘッダ
		MCList<ConvQtyAmtUtil_HdrR> utlHdrL = createUtilHdr(rslt, hdr_peg_no);

		// ユーティリティ実行用明細（上段）
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL = createUtilDtl(rslt, hdr_peg_no);

		// 明細の金額項目計算用ユーティリティ実行
		setAmtToDtlL(utlHdrL, utlDtlL);

		// ユーティリティの計算結果を明細に反映する
		ConvQtyAmtUtil_DtlR calcR = utlDtlL.get(0);
		rslt.trd_cur_upri(calcR.trd_cur_upri());
		rslt.trd_cur_dscnt_amt(calcR.trd_cur_dscnt_amt());
		rslt.trd_cur_amt(calcR.trd_cur_amt());
		rslt.trd_cur_tax_amt(calcR.trd_cur_tax_amt());
		rslt.trd_cur_inc_tax_amt(calcR.trd_cur_inc_tax_amt());
		rslt.trd_unit_conv_qty(calcR.trd_unit_conv_qty());
		rslt.trd_unit_conv_base_qty(calcR.trd_unit_conv_base_qty());
		rslt.wtax_amt(calcR.wtax_amt());

		// 単価・値引額・金額・税額
		rslt.base_cur_upri(convToBaseCur(rslt.trd_cur_upri(), rslt.xrate(),
				rslt.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		rslt.base_cur_dscnt_amt(convToBaseCur(rslt.trd_cur_dscnt_amt(), rslt.xrate(),
				rslt.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rslt.base_cur_amt(convToBaseCur(rslt.trd_cur_amt(), rslt.xrate(),
				rslt.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		rslt.base_cur_tax_amt(convToBaseCur(rslt.trd_cur_tax_amt(), rslt.xrate(),
				rslt.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		if (!isNull(rslt.xrate())) {
			rslt.base_cur_inc_tax_amt(rslt.base_cur_amt().add(rslt.base_cur_tax_amt()));
		}

		if (!isNull(rslt.ptax_cur_cd())) {
			rslt.ptax_cur_upri(convCur(rslt.trd_cur_upri(), rslt.ptax_xrate(),
					rslt.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			rslt.ptax_cur_dscnt_amt(convCur(rslt.trd_cur_dscnt_amt(), rslt.ptax_xrate(),
					rslt.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			rslt.ptax_cur_amt(convCur(rslt.trd_cur_amt(), rslt.ptax_xrate(),
					rslt.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			rslt.ptax_cur_tax_amt(convCur(rslt.trd_cur_tax_amt(), rslt.ptax_xrate(),
					rslt.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			if (!isNull(rslt.ptax_xrate())) {
				rslt.ptax_cur_inc_tax_amt(rslt.ptax_cur_amt().add(rslt.ptax_cur_tax_amt()));
			}
		}
	}
	protected MCList<ConvQtyAmtUtil_HdrR> createUtilHdr(RsltR dtl, int hdrPegNo) {
		MCList<ConvQtyAmtUtil_HdrR> l = MCList.create(ConvQtyAmtUtil_HdrR.class);
		ConvQtyAmtUtil_HdrR utlHdr = ConvQtyAmtUtil_HdrR.create();

		utlHdr.peg_no(hdrPegNo);
		utlHdr.wtax_amt(dtl.wtax_amt());
		utlHdr.base_unit_dec_place(dtl.base_unit_dec_place());
		utlHdr.base_unit_rnd_typ(dtl.base_unit_rnd_typ());
		utlHdr.trd_cur_cd(dtl.trd_cur_cd());
		utlHdr.wtax_rate(dtl.wtax_rate());
		utlHdr.act_tax_rate(dtl.tax_rate());
		utlHdr.act_inc_tax_flg(dtl.inc_tax_flg());
		utlHdr.amt_dec_place(dtl.trd_cur_amt_dec_place());
		utlHdr.upri_dec_place(dtl.trd_cur_upri_dec_place());
		utlHdr.amt_rnd_typ(dtl.sls_amt_rnd_typ());
		utlHdr.tax_rnd_typ(dtl.sls_tax_rnd_typ());
		utlHdr.wtax_rnd_typ(getCo().wtax_rnd_typ());
		utlHdr.schd_base_unit_qty(dtl.init_schd_qty());

		boolean useDbVal = dtl.sls_dtl_upd_flg()
				&& isSame(dtl.db_trd_unit_cd(), dtl.trd_unit_cd());

		if (useDbVal) {
			utlHdr.trd_unit_cd(dtl.db_trd_unit_cd());
			utlHdr.trd_unit_qty(dtl.db_trd_unit_qty());
			utlHdr.trd_cur_upri(dtl.db_trd_cur_upri());
			if (isSame(dtl.db_trd_unit_qty(), dtl.trd_unit_qty())) {
				utlHdr.trd_cur_dscnt_amt(dtl.db_trd_cur_dscnt_amt());
			}
			else {
				utlHdr.trd_cur_dscnt_amt(dtl.init_trd_cur_dscnt_amt());
			}
			utlHdr.trd_cur_amt(dtl.db_trd_cur_amt());
			utlHdr.trd_cur_tax_amt(dtl.db_trd_cur_tax_amt());
			utlHdr.trd_cur_inc_tax_amt(
					dtl.db_trd_cur_amt().add(dtl.db_trd_cur_tax_amt()));
			utlHdr.trd_unit_conv_qty(dtl.db_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(dtl.db_trd_unit_conv_base_qty());
			utlHdr.tax_rate(dtl.db_tax_rate());
			utlHdr.inc_tax_flg(dtl.db_inc_tax_flg());
		}
		else {
			utlHdr.trd_unit_cd(dtl.init_trd_unit_cd());
			utlHdr.trd_unit_qty(dtl.init_trd_unit_qty());
			utlHdr.trd_cur_upri(dtl.init_trd_cur_upri());
			utlHdr.trd_cur_dscnt_amt(dtl.init_trd_cur_dscnt_amt());
			MCRow rslt = getAmtAndTax(dtl.init_trd_cur_upri(), dtl.init_trd_unit_qty(),
					dtl.init_tax_rate(), dtl.init_inc_tax_flg(), dtl.trd_cur_amt_dec_place(),
					dtl.sls_amt_rnd_typ(), dtl.sls_tax_rnd_typ(),
					dtl.init_trd_cur_dscnt_amt());
			utlHdr.trd_cur_amt(rslt.getNumberNE("amt"));
			utlHdr.trd_cur_tax_amt(rslt.getNumberNE("tax_amt"));
			utlHdr.trd_cur_inc_tax_amt(rslt.getNumberNE("inc_tax_amt"));
			utlHdr.base_unit_dec_place(dtl.base_unit_dec_place());
			utlHdr.base_unit_rnd_typ(dtl.base_unit_rnd_typ());
			utlHdr.trd_unit_conv_qty(dtl.schd_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(dtl.schd_trd_unit_conv_base_qty());
			utlHdr.tax_rate(dtl.init_tax_rate());
			utlHdr.inc_tax_flg(dtl.init_inc_tax_flg());
		}
		l.add(utlHdr);
		return l;
	}
	protected MCList<ConvQtyAmtUtil_DtlR> createUtilDtl(RsltR dtl, int hdrPegNo) {
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL = MCList.create(ConvQtyAmtUtil_DtlR.class);

		ConvQtyAmtUtil_DtlR utlDtlR = ConvQtyAmtUtil_DtlR.create();

		utlDtlR.hdr_peg_no(hdrPegNo);
		utlDtlR.trd_unit_qty(dtl.trd_unit_qty());
		utlDtlR.trd_unit_cd(dtl.trd_unit_cd());
		utlDtlR.trd_unit_conv_qty(dtl.trd_unit_conv_qty());
		utlDtlR.trd_unit_conv_base_qty(dtl.trd_unit_conv_base_qty());
		utlDtlR.trd_cur_dscnt_amt(dtl.trd_cur_dscnt_amt());

		utlDtlL.add(utlDtlR);
		return utlDtlL;
	}

	protected void doRslt_trd_cur_amt_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		MCNumber wtaxAmt = getWtaxAmt(rsltR.trd_cur_amt(),
				rsltR.wtax_rate(), rsltR.trd_cur_amt_dec_place());
		rsltR.wtax_amt(wtaxAmt);
		
		setProfRate(rsltR);
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		try {
			_useXrateCacheFlg = true;
		// 一括設定枠の項目の値を設定する
		if (r.check()) {
			bulkSet(BulkSet_sls_dt, r);
			bulkSet(BulkSet_ac_dt, r);
			bulkSet(BulkSet_bill_basis_dt, r);
			bulkSet(BulkSet_rcv_schd_dt, r);
			bulkSet(BulkSet_sls_usr_cd, r);
			bulkSet(BulkSet_sls_dpt_cd, r);
			if ((Cnd_ope_DEL.isSelected() || Cnd_ope_UPD.isSelected()) && isNull(r.can_ac_dt_for_input())) {
				Rslt_can_ac_dt_p_PPanel.canAcDtValueInit(r);
			}
			if (MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(r.sls_tgt_typ())) {
				bulkSet(BulkSet_ship_dt, r);
				bulkSet(BulkSet_ship_hm, r);
				bulkSet(BulkSet_dlv_dt, r);
				bulkSet(BulkSet_dlv_hm, r);
			}
			if (MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())) {
				bulkSet(BulkSet_dlv_dt, r);
				bulkSet(BulkSet_dlv_hm, r);
				if (!isNull(getBulkSetR().dlv_dt())) {
					r.ship_dt(getBulkSetR().dlv_dt());
				}
				if (!isNull(getBulkSetR().dlv_hm())) {
					r.ship_hm(getBulkSetR().dlv_hm());
				}
			}
		}
		
		setValueIv(columnRslt_check, r, true);
		}
		finally {
			_useXrateCacheFlg = false;
			_xrateMap.clear();
		}
	}

	@Override
	public void doRslt_abort_flg_NC(MCEventInfo info) {
		super.doRslt_abort_flg_NC(info);
		boolean abort_flg = (boolean)info.getNewValue();
		RsltR r = getRsltL().get(info.getEventIndex());
		
		if ((Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) &&
				!isNull(r.sls_schd_no())) {
			for (RsltR rsltR : getRsltL()) {
				if (isSame(rsltR.sls_schd_no(), r.sls_schd_no())) {
					rsltR.abort_flg(abort_flg);
				}
				if (Cnd_ope_UPD.isSelected() && MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ()) && 
						((rsltR.sync_flg() && isSame(rsltR.purc_schd_no(), r.purc_schd_no()))
								|| (!rsltR.sync_flg() && isSame(rsltR.sls_schd_no(), r.sls_schd_no())))) {
					rsltR.abort_flg(abort_flg);
					rsltR.check(true);
				}
			}
		}
	}

	protected void doBulkSet_sls_usr_cd_LC(MCEventInfo info) {
		bulkSet(BulkSet_sls_usr_cd);
	}
	
	protected void doBulkSet_sls_dpt_cd_LC(MCEventInfo info) {
		bulkSet(BulkSet_sls_dpt_cd);
	}
	
	@Override
	public void doBulkSet_sls_dt_LC(MCEventInfo info) {
		super.doBulkSet_sls_dt_LC(info);
		try {
			_useXrateCacheFlg = true;
			bulkSet(BulkSet_sls_dt);
		}
		finally {
			_useXrateCacheFlg = false;
			_xrateMap.clear();
		}
	}
	
	protected void doBulkSet_ac_dt_LC(MCEventInfo info) {
		bulkSet(BulkSet_ac_dt);
	}
	
	@Override
	public void doBulkSet_bill_basis_dt_LC(MCEventInfo info) {
		super.doBulkSet_bill_basis_dt_LC(info);
		bulkSet(BulkSet_bill_basis_dt);
	}
	
	@Override
	public void doBulkSet_rcv_schd_dt_LC(MCEventInfo info) {
		super.doBulkSet_rcv_schd_dt_LC(info);
		bulkSet(BulkSet_rcv_schd_dt);
	}

	protected void doBulkSet_ship_dt_LC(MCEventInfo info) {
		bulkSet(BulkSet_ship_dt);
	}

	protected void doBulkSet_ship_hm_LC(MCEventInfo info) {
		bulkSet(BulkSet_ship_hm);
	}

	protected void doBulkSet_dlv_dt_LC(MCEventInfo info) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check() && !isNull(getBulkSetR().dlv_dt())) {
				if (MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())) {
					setValueEx(columnRslt_dlv_dt, r.getGUIIndex(), getBulkSetR().dlv_dt());
					setValueEx(columnRslt_ship_dt, r.getGUIIndex(), getBulkSetR().dlv_dt());
				}
				else {
					bulkSet(BulkSet_dlv_dt, r);
				}
			}
		}
	}

	protected void doBulkSet_dlv_hm_LC(MCEventInfo info) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check() && !isNull(getBulkSetR().dlv_hm())) {
				if (MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())) {
					setValueEx(columnRslt_dlv_hm, r.getGUIIndex(), getBulkSetR().dlv_hm());
					setValueEx(columnRslt_ship_hm, r.getGUIIndex(), getBulkSetR().dlv_hm());
				}
				else {
					bulkSet(BulkSet_dlv_hm, r);
				}
			}
		}
	}

	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
		if (!isNull(r.org_xrate()) && !isSame(r.xrate(), r.org_xrate())) {
			r.xrate_enter_flg(true);
		}
		if (!isNull(r.org_ptax_xrate()) && !isSame(r.ptax_xrate(), r.org_ptax_xrate())) {
			r.ptax_xrate_enter_flg(true);
		}
		if (isNull(r.sls_dt())) {
			bulkSet(BulkSet_sls_dt, r);
		}
		r.xrate_enter_flg(false);
		r.ptax_xrate_enter_flg(false);
		if (isNull(r.ac_dt())) {
			bulkSet(BulkSet_ac_dt, r);
		}
		if (isNull(r.bill_basis_dt())) {
			bulkSet(BulkSet_bill_basis_dt, r);
		}
		if (isNull(r.rcv_schd_dt())) {
			bulkSet(BulkSet_rcv_schd_dt, r);
		}
		if (isNull(r.ship_dt())) {
			bulkSet(BulkSet_ship_dt, r);
		}
		if (isNull(r.ship_hm())) {
			bulkSet(BulkSet_ship_hm, r);
		}
		if (isNull(r.dlv_dt())) {
			bulkSet(BulkSet_dlv_dt, r);
		}
		if (isNull(r.dlv_hm())) {
			bulkSet(BulkSet_dlv_hm, r);
		}
		if (isNull(r.sls_usr_cd())) {
			bulkSet(BulkSet_sls_usr_cd, r);
		}
		if (isNull(r.sls_dpt_cd())) {
			bulkSet(BulkSet_sls_dpt_cd, r);
		}
		if (isNull(r.can_ac_dt_for_input())) {
			Rslt_can_ac_dt_p_PPanel.canAcDtValueInit(r);
		}
	}

	protected void bulkSet(MCBeans b, RsltR r) {
		if (isNull(r.sls_act_no())) {
			if (b == BulkSet_sls_dt && !isNull(getBulkSetR().sls_dt()) && isEditable(columnRslt_sls_dt, r.getGUIIndex())) {
				boolean isSlsDtChanged = !isSame(r.sls_dt(), getBulkSetR().sls_dt());
				r.sls_dt(getBulkSetR().sls_dt());
				if (isSlsDtChanged) {
					setXrate(r);
					setPtaxXrate(r);
				}
			}
			if (b == BulkSet_ac_dt && !isNull(getBulkSetR().ac_dt())  && isEditable(columnRslt_ac_dt, r.getGUIIndex())) {
				r.ac_dt(getBulkSetR().ac_dt());
			}
			if (b == BulkSet_bill_basis_dt && !isNull(getBulkSetR().bill_basis_dt()) && isEditable(columnRslt_bill_basis_dt, r.getGUIIndex())) {
				r.bill_basis_dt(getBulkSetR().bill_basis_dt());
			}
			if (b == BulkSet_rcv_schd_dt && !isNull(getBulkSetR().rcv_schd_dt()) && isEditable(columnRslt_rcv_schd_dt, r.getGUIIndex())) {
				r.rcv_schd_dt(getBulkSetR().rcv_schd_dt());
			}
			if (b == BulkSet_ship_dt && !isNull(getBulkSetR().ship_dt()) && isEditable(columnRslt_ship_dt, r.getGUIIndex())) {
				r.ship_dt(getBulkSetR().ship_dt());
			}
			if (b == BulkSet_ship_hm && !isNull(getBulkSetR().ship_hm()) && isEditable(columnRslt_ship_hm, r.getGUIIndex())) {
				r.ship_hm(getBulkSetR().ship_hm());
			}
			if (b == BulkSet_dlv_dt && !isNull(getBulkSetR().dlv_dt()) && isEditable(columnRslt_dlv_dt, r.getGUIIndex())) {
				r.dlv_dt(getBulkSetR().dlv_dt());
			}
			if (b == BulkSet_dlv_hm && !isNull(getBulkSetR().dlv_hm()) && isEditable(columnRslt_dlv_hm, r.getGUIIndex())) {
				r.dlv_hm(getBulkSetR().dlv_hm());
			}
			if (b == BulkSet_sls_usr_cd && !isNull(getBulkSetR().sls_usr_cd()) && isEditable(columnRslt_sls_usr_cd, r.getGUIIndex())) {
				setValueEx(columnRslt_sls_usr_cd, r.getGUIIndex(), BulkSet_sls_usr_cd.getValue());
			}
			if (b == BulkSet_sls_dpt_cd && !isNull(getBulkSetR().sls_dpt_cd()) && isEditable(columnRslt_sls_dpt_cd, r.getGUIIndex())) {
				setValueEx(columnRslt_sls_dpt_cd, r.getGUIIndex(), BulkSet_sls_dpt_cd.getValue());
			}
		}
	}
	Map<List<Comparable<?>>, MCNumber> _xrateMap = new HashMap<List<Comparable<?>>, MCNumber>();
	boolean _useXrateCacheFlg = false;
	protected void setXrate(RsltR r) {
		if (!r.xrate_enter_flg() && isEditable(columnRslt_xrate, r.getGUIIndex()) && !r.xrate_inpt_flg()) {
			
			List<Comparable<?>> key = new ArrayList<Comparable<?>>();
			key.add(r.trd_cur_cd());
			key.add(r.base_cur_cd());
			key.add(r.xrate_cd());
			key.add(r.sls_dt());
			
			MCNumber xrate = null;
			
			if (_useXrateCacheFlg && _xrateMap.containsKey(key)) {
				xrate = _xrateMap.get(key);
			}
			else {
				xrate = MAUCP_AmtUtil.getDefXrateNE(r.trd_cur_cd(), r.base_cur_cd(), r.xrate_cd(), r.sls_dt(), this);
				if (_useXrateCacheFlg) {
					_xrateMap.put(key, xrate);
				}
			}
			
			setValueEx(columnRslt_xrate, r.getGUIIndex(), xrate);
		}
	}
	
	protected void setPtaxXrate(RsltR r) {
		if (!r.ptax_xrate_enter_flg() && isEditable(columnRslt_ptax_xrate, r.getGUIIndex()) && !r.ptax_xrate_inpt_flg()) {
			
			List<Comparable<?>> key = new ArrayList<Comparable<?>>();
			key.add(r.trd_cur_cd());
			key.add(r.ptax_cur_cd());
			key.add(r.xrate_cd());
			key.add(r.sls_dt());
			
			MCNumber xrate = null;
			
			if (_useXrateCacheFlg && _xrateMap.containsKey(key)) {
				xrate = _xrateMap.get(key);
			}
			else {
				xrate = MAUCP_AmtUtil.getDefXrateNE(r.trd_cur_cd(), r.ptax_cur_cd(), r.xrate_cd(), r.sls_dt(), this);
				if (_useXrateCacheFlg) {
					_xrateMap.put(key, xrate);
				}
			}
			
			setValueEx(columnRslt_ptax_xrate, r.getGUIIndex(), xrate);
		}
	}
	
	/**
	 * インボイス取引の場合に、同一インボイスＮＯの明細に、同じ値を設定する。
	 * （インボイスヘッダ項目を、全明細に反映する）
	 * 
	 * @param c
	 * @param r
	 * @param gui
	 */
	protected void setValueIv(MCColumnConfig c, RsltR r, boolean gui) {
		
		if (r.cst_iv_flg() && !isNullOrNullVal(r.iv_no())) {
			MCList<RsltR> ivL = getRsltL().subList(_ikIv, r.iv_no());
			Comparable<?> val = c.getValue(r.getGUIIndex());
			for (RsltR rsltR : ivL) {
				// イベントが発生した行の場合、設定しない
				if (isSame(r.getGUIIndex(), rsltR.getGUIIndex())) {
					continue;
				}
				if (gui) {
					setValueEx(c, rsltR.getGUIIndex(), val);
				}
				else {
					rsltR.setValue(c.getBaseRowColumnName(), val);
				}
			}
			// setValueExを使うと、イベント対象行が変わるため、最初にイベントが発生した行に戻す。
			if (gui) {
				setValueEx(c, r.getGUIIndex(), val);
			}
		}
	}
	
	/**
	 * インボイス取引でない場合に、同一売上実績ＮＯの明細に、同じ値を設定する。
	 * （売上実績ヘッダ項目を、全明細に反映する）
	 * 
	 * @param c
	 * @param r
	 */
	protected void setValueSls(MCColumnConfig c, RsltR r) {
		// インボイス対象であっても売上実績NO単位で制御したい項目があるので、インボイス対象かどうかの条件は付けない
		MCList<RsltR> slsL = getRsltL().subList(_ikSls, r.sls_act_no());
		Comparable<?> val = c.getValue(r.getGUIIndex());
		for (RsltR rsltR : slsL) {
			if (c == columnRslt_xrate || c == columnRslt_ptax_xrate) {
				setValueEx(c, rsltR.getGUIIndex(), val);
			}
			else {
				rsltR.setValue(c.getBaseRowColumnName(), val);
			}
		}
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
	public boolean doCnd_mode_VC(MCEventInfo info) {
		if (!super.doCnd_mode_VC(info)) {
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
		editSrchMode();
		clearCnd(info);
		setArrBaseSlsTyp();
		setOpeTyp();
		clearBulkSet();
		setSrchStatus();
		setIndivPrnt();
		setEdi();
		setValueEx(Btn_prnt_out_flg, false);
	}

	/**
	 * 検索モードの設定
	 */
	protected void editSrchMode() {
		getCndR().mode(SRCH_MODE_DTL);
	}

	/**
	 * 操作種別変更時の検索条件のクリア処理
	 * 
	 * @param info
	 */
	protected void clearCnd(MCEventInfo info) {
		String beforeOpe = (String)info.getOldValue();
		
		if (Cnd_mode_DTL.isSelected()) {
			
			// 操作種別「登録する」から他に変更した際の検索条件の編集
			if (isSame(beforeOpe, Cnd_ope_INS.getActionCommand())) {
				
				Cnd_sls_schd_dt_fr.clear();
				Cnd_sls_schd_dt_to.clear();
			}
			// 操作種別「登録する」選択時の検索条件の編集
			if (Cnd_ope_INS.isSelected()) {
				
				Cnd_sls_schd_dt_to.setValue(getToday());
				Cnd_dlv_slip_no.clear();
				Cnd_sls_act_no.clear();
				Cnd_sls_dt_fr.clear();
				Cnd_sls_dt_to.clear();
				Cnd_ac_dt_fr.clear();
				Cnd_ac_dt_to.clear();
				Cnd_intr_rmrks.clear();
				Cnd_intr_d_rmrks.clear();
				Cnd_sub_char1.clear();
				Cnd_sub_char2.clear();
				Cnd_sub_char3.clear();
				Cnd_dtl_sub_char1.clear();
				Cnd_dtl_sub_char2.clear();
				Cnd_dtl_sub_char3.clear();
				Cnd_ext_purc_act_d_no.clear();
			}
		}
		else if (Cnd_mode_HDR.isSelected()) {
			
			Cnd_dlv_cd.clear();
			Cnd_dest_cd1.clear();
			Cnd_dest_cd2.clear();
			Cnd_dest_cd3.clear();
			Cnd_sppl_cd.clear();
			Cnd_po_no.clear();
			Cnd_itm_typ.clear();
			Cnd_itm_typ_d_cd.clear();
			Cnd_itm_cd.clear();
			Cnd_itm_sub1.clear();
			Cnd_itm_sub2.clear();
			Cnd_itm_sub3.clear();
			Cnd_cst_itm_cd.clear();
			Cnd_sno1.clear();
			Cnd_sno2.clear();
			Cnd_sno3.clear();
			Cnd_sno4.clear();
			Cnd_wrk_no.clear();
			Cnd_wrk_nm.clear();
			Cnd_lot_no.clear();
			Cnd_sublot_no.clear();
			Cnd_trd_d_rmrks.clear();
			Cnd_intr_d_rmrks.clear();
			Cnd_dtl_sub_char1.clear();
			Cnd_dtl_sub_char2.clear();
			Cnd_dtl_sub_char3.clear();
			Cnd_ext_purc_act_d_no.clear();
			Cnd_purc_ddlv_dlv_slip_no.clear();
			
			setValueEx(Cnd_dlv_grp_flg1, false);
			setValueEx(Cnd_dlv_grp_cd1, null);
			setValueEx(Cnd_dlv_grp_flg2, false);
			setValueEx(Cnd_dlv_grp_cd2, null);
			setValueEx(Cnd_dlv_grp_flg3, false);
			setValueEx(Cnd_dlv_grp_cd3, null);
			setValueEx(Cnd_dlv_grp_flg4, false);
			setValueEx(Cnd_dlv_grp_cd4, null);
			setValueEx(Cnd_dlv_grp_flg5, false);
			setValueEx(Cnd_dlv_grp_cd5, null);
			setValueEx(Cnd_dlv_grp_flg6, false);
			setValueEx(Cnd_dlv_grp_cd6, null);
			setValueEx(Cnd_dlv_grp_flg7, false);
			setValueEx(Cnd_dlv_grp_cd7, null);
			setValueEx(Cnd_dlv_grp_flg8, false);
			setValueEx(Cnd_dlv_grp_cd8, null);
			setValueEx(Cnd_dlv_grp_flg9, false);
			setValueEx(Cnd_dlv_grp_cd9, null);
			setValueEx(Cnd_dlv_grp_flg10, false);
			setValueEx(Cnd_dlv_grp_cd10, null);
			
			setValueEx(Cnd_sppl_grp_flg1, false);
			setValueEx(Cnd_sppl_grp_cd1, null);
			setValueEx(Cnd_sppl_grp_flg2, false);
			setValueEx(Cnd_sppl_grp_cd2, null);
			setValueEx(Cnd_sppl_grp_flg3, false);
			setValueEx(Cnd_sppl_grp_cd3, null);
			setValueEx(Cnd_sppl_grp_flg4, false);
			setValueEx(Cnd_sppl_grp_cd4, null);
			setValueEx(Cnd_sppl_grp_flg5, false);
			setValueEx(Cnd_sppl_grp_cd5, null);
			setValueEx(Cnd_sppl_grp_flg6, false);
			setValueEx(Cnd_sppl_grp_cd6, null);
			setValueEx(Cnd_sppl_grp_flg7, false);
			setValueEx(Cnd_sppl_grp_cd7, null);
			setValueEx(Cnd_sppl_grp_flg8, false);
			setValueEx(Cnd_sppl_grp_cd8, null);
			setValueEx(Cnd_sppl_grp_flg9, false);
			setValueEx(Cnd_sppl_grp_cd9, null);
			setValueEx(Cnd_sppl_grp_flg10, false);
			setValueEx(Cnd_sppl_grp_cd10, null);
			
			setValueEx(Cnd_itm_grp_flg1, false);
			setValueEx(Cnd_itm_grp_cd1, null);
			setValueEx(Cnd_itm_grp_flg2, false);
			setValueEx(Cnd_itm_grp_cd2, null);
			setValueEx(Cnd_itm_grp_flg3, false);
			setValueEx(Cnd_itm_grp_cd3, null);
			setValueEx(Cnd_itm_grp_flg4, false);
			setValueEx(Cnd_itm_grp_cd4, null);
			setValueEx(Cnd_itm_grp_flg5, false);
			setValueEx(Cnd_itm_grp_cd5, null);
			setValueEx(Cnd_itm_grp_flg6, false);
			setValueEx(Cnd_itm_grp_cd6, null);
			setValueEx(Cnd_itm_grp_flg7, false);
			setValueEx(Cnd_itm_grp_cd7, null);
			setValueEx(Cnd_itm_grp_flg8, false);
			setValueEx(Cnd_itm_grp_cd8, null);
			setValueEx(Cnd_itm_grp_flg9, false);
			setValueEx(Cnd_itm_grp_cd9, null);
			setValueEx(Cnd_itm_grp_flg10, false);
			setValueEx(Cnd_itm_grp_cd10, null);
		}
	}

	protected void clearBulkSet() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			BulkSet_sls_dt.clear();
			BulkSet_ac_dt.clear();
			BulkSet_bill_basis_dt.clear();
			BulkSet_rcv_schd_dt.clear();
			BulkSet_ship_dt.clear();
			BulkSet_ship_hm.clear();
			BulkSet_dlv_dt.clear();
			BulkSet_dlv_hm.clear();
			BulkSet_sls_usr_cd.clear();
			BulkSet_sls_usr_nm.clear();
			BulkSet_sls_dpt_cd.clear();
			BulkSet_sls_dpt_nm.clear();
		}
		else if (Cnd_ope_INS.isSelected()) {
			setValueEx(BulkSet_sls_dt, getToday());
			setValueEx(BulkSet_ac_dt, getToday());
			setValueEx(BulkSet_bill_basis_dt, getToday());
			setValueEx(BulkSet_ship_dt, getToday());
		}
	}
	
	/**
	 * 着荷基準を設定する。
	 */
	protected void setArrBaseSlsTyp(){
		
		if (!Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_arrv_base_sls_flg, true);
		}
		else {
			setValueEx(Cnd_arrv_base_sls_flg, false);
		}
		
		setValueEx(Cnd_arrv_sls_flg, true);
		setValueEx(Cnd_sls_cststk_flg, true);
		setValueEx(Cnd_sls_ddlv_flg, true);
		setValueEx(Cnd_not_ship_ord_sls_flg, true);
	}
	/**
	 * 予定なしを設定する。
	 */
	protected void setOpeTyp(){
		
		if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_non_schd_flg, true);
			setValueEx(Cnd_ship_ord_sls_flg, true);
		}
		else {
			setValueEx(Cnd_non_schd_flg, false);
			setValueEx(Cnd_ship_ord_sls_flg, false);
		}
	}
	/**
	 * 着荷基準を設定する。
	 */
	protected void setEdi(){
		
		if (!Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_edi_flg, true);
			setValueEx(Cnd_not_edi_flg, true);
		}
		else {
			setValueEx(Cnd_edi_flg, false);
			setValueEx(Cnd_not_edi_flg, true);
		}
	}

	/**
	 * 個別発行を設定する。
	 */
	protected void setIndivPrnt(){
		setValueEx(Btn_indiv_prnt_flg, false);
	}
	/**
	 * 検索モード変更時のイベント処理
	 */
	@Override
	public void doCnd_mode_NC(MCEventInfo info) {
		super.doCnd_mode_NC(info);

		clearCnd(info);
		clearContainers(getRsltL());

		// ST変更
		if (Cnd_mode_DTL.isSelected()) {
			setREF_DTLStatus();
		}
		else if (Cnd_mode_HDR.isSelected()) {
			setREF_HDRStatus();
		}
	}

	@Override
	public MCList<?> getCnd_trd_cd(MCRow row, MCEventInfo info) {

		if (!isSame(getStatus(), REF_DTL) && !isSame(getStatus(), REF_HDR)) {
			row.setStringNE(TrdCols.$i_trd_ptn_typ, MAC_TRD_PTN_TYP.SLS.value());
		}

		return super.getCnd_trd_cd(row, info);
	}

	@Override
	public void doRslt_sls_rsn_cd_LC(MCEventInfo info) {
		super.doRslt_sls_rsn_cd_LC(info);
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if (!rsltR.sls_acxfr_flg()) {
			rsltR.bd_dpt_cd(null);
			rsltR.bd_dpt_nm(null);
		}
	}

	@Override
	public void doRslt_wtax_rate_NC(MCEventInfo info) {
		super.doRslt_wtax_rate_NC(info);
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		MCNumber wtaxAmt = getWtaxAmt(rsltR.trd_cur_amt(),
				rsltR.wtax_rate(), rsltR.trd_cur_amt_dec_place());
		rsltR.wtax_amt(wtaxAmt);
	}

	protected MCNumber getWtaxAmt(MCNumber trdCurAmt, MCNumber wtaxRate, MCNumber trdCurAmtDecPlace) {
		
		if (isNull(trdCurAmt) || trdCurAmt.isZero()) {
			return null;
		}
		if (isNull(wtaxRate) || wtaxRate.isZero()) {
			return null;
		}
		if (isNull(trdCurAmtDecPlace)) {
			return null;
		}
		
		// 源泉税額の算出
		MCNumber wtaxAmt = MAUCP_AmtUtil.getTaxAmt(trdCurAmt, wtaxRate,
				trdCurAmtDecPlace, getCo().wtax_rnd_typ(), MCNumber.ZERO);
		return wtaxAmt;
	}

	@Override
	public void doRslt_sls_dt_LC(MCEventInfo info) {
		super.doRslt_sls_dt_LC(info);

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueIv(columnRslt_sls_dt, rsltR, false);
		
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
		if (!rsltR.cst_iv_flg()) {
			setValueSls(columnRslt_sls_dt, rsltR);
		}
	}

	@Override
	public void doRslt_bill_basis_dt_LC(MCEventInfo info) {
		super.doRslt_bill_basis_dt_LC(info);

		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if (!rsltR.cst_iv_flg()) {
			setValueSls(columnRslt_bill_basis_dt, rsltR);
		}
	}
	

	@Override
	public void doRslt_rcv_schd_dt_LC(MCEventInfo info) {
		super.doRslt_rcv_schd_dt_LC(info);

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueIv(columnRslt_rcv_schd_dt, rsltR, false);

		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
	}


	protected void doRslt_ac_dt_LC(MCEventInfo info) {

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueIv(columnRslt_ac_dt, rsltR, false);
		
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		if (!rsltR.cst_iv_flg()) {
			setValueSls(columnRslt_ac_dt, rsltR);
		}
	}

	protected void doRslt_can_ac_dt_for_input_LC(MCEventInfo info) {

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueIv(columnRslt_can_ac_dt, rsltR, false);
		setValueIv(columnRslt_can_ac_dt_for_input, rsltR, false);
		setValueIv(columnRslt_ac_dt_after_srch, rsltR, false);
		
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
		if (!rsltR.cst_iv_flg()) {
			setValueSls(columnRslt_can_ac_dt, rsltR);
			setValueSls(columnRslt_can_ac_dt_for_input, rsltR);
			setValueSls(columnRslt_ac_dt_after_srch, rsltR);
		}
	}
	protected void doRslt_ship_dt_LC(MCEventInfo info) {

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueIv(columnRslt_ship_dt, rsltR, false);
		
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
		if (!rsltR.cst_iv_flg()) {
			setValueSls(columnRslt_ship_dt, rsltR);
		}
	}

	protected void doRslt_ship_hm_LC(MCEventInfo info) {

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueIv(columnRslt_ship_hm, rsltR, false);
		
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
		if (!rsltR.cst_iv_flg()) {
			setValueSls(columnRslt_ship_hm, rsltR);
		}
	}

	protected void doRslt_dlv_dt_LC(MCEventInfo info) {

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		
		if (MSC_SLS_TGT_TYP.isDDLV_SLS(rsltR.sls_tgt_typ())) {
			setValueEx(columnRslt_ship_dt, rsltR.getGUIIndex(), rsltR.dlv_dt());
		}
		
		setValueIv(columnRslt_dlv_dt, rsltR, false);
		
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
		if (!rsltR.cst_iv_flg()) {
			setValueSls(columnRslt_dlv_dt, rsltR);
		}
	}

	protected void doRslt_dlv_hm_LC(MCEventInfo info) {

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		
		if (MSC_SLS_TGT_TYP.isDDLV_SLS(rsltR.sls_tgt_typ())) {
			setValueEx(columnRslt_ship_hm, rsltR.getGUIIndex(), rsltR.dlv_hm());
		}
		
		setValueIv(columnRslt_dlv_hm, rsltR, false);
		
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		if (!rsltR.cst_iv_flg()) {
			setValueSls(columnRslt_dlv_hm, rsltR);
		}
	}

	protected void doRslt_sls_usr_cd_LC(MCEventInfo info) {

		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueSls(columnRslt_sls_usr_cd, rsltR);
		setValueSls(columnRslt_sls_usr_nm, rsltR);
	}

	protected void doRslt_sls_dpt_cd_LC(MCEventInfo info) {

		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueSls(columnRslt_sls_dpt_cd, rsltR);
		setValueSls(columnRslt_sls_dpt_nm, rsltR);
		setValueSls(columnRslt_wg_cd, rsltR);
		setValueSls(columnRslt_wg_nm, rsltR);
	}
	
	protected void doRslt_xrate_LC(MCEventInfo info) {
		
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		// 納税為替レートを入力した際に、納税為替レートのLCイベントよりも前に、為替レートのLCイベントが起きる場合がある。
		// (納税為替レートの入力で選択チェックがオンになり、売上日が設定されて為替レートが変わる場合）
		// このタイミングでは為替レートをインボイス単位で揃える処理を実行しない。
		if (!rsltR.ptax_xrate_enter_flg()) {
			setValueIv(columnRslt_xrate, rsltR, true);
		}
		
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
		setValueSls(columnRslt_xrate, rsltR);

	}

	protected void doRslt_ptax_xrate_LC(MCEventInfo info) {
		
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		// 為替レートを入力した際に、為替レートのLCイベントよりも前に、納税為替レートのLCイベントが起きる場合がある。
		// (為替レートの入力で選択チェックがオンになり、売上日が設定されて納税為替レートが変わる場合）
		// このタイミングでは納税為替レートをインボイス単位で揃える処理を実行しない。
		if (!rsltR.xrate_enter_flg()) {
			setValueIv(columnRslt_ptax_xrate, rsltR, true);
		}
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}
		setValueSls(columnRslt_ptax_xrate, rsltR);

	}

	@Override
	public void doRslt_ar_dpt_cd_LC(MCEventInfo info) {
		super.doRslt_ar_dpt_cd_LC(info);
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueSls(columnRslt_ar_dpt_cd, rsltR);
		setValueSls(columnRslt_ar_dpt_nm, rsltR);
	}

	@Override
	public void doRslt_trd_rmrks_LC(MCEventInfo info) {
		super.doRslt_trd_rmrks_LC(info);
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueSls(columnRslt_trd_rmrks, rsltR);
	}
	
	@Override
	public void doRslt_intr_rmrks_LC(MCEventInfo info) {
		super.doRslt_intr_rmrks_LC(info);
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueSls(columnRslt_intr_rmrks, rsltR);
	}
	
	@Override
	public void doRslt_sub_char1_LC(MCEventInfo info) {
		super.doRslt_sub_char1_LC(info);
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueSls(columnRslt_sub_char1, rsltR);
	}
	
	@Override
	public void doRslt_sub_char2_LC(MCEventInfo info) {
		super.doRslt_sub_char2_LC(info);
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueSls(columnRslt_sub_char2, rsltR);
	}
	
	@Override
	public void doRslt_sub_char3_LC(MCEventInfo info) {
		super.doRslt_sub_char3_LC(info);
		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueSls(columnRslt_sub_char3, rsltR);
	}
	
	public void doRslt_tax_cd_LC(MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		setValueForMoneyCols(rsltR);
	}
	
	/**
	 * 取引通貨単価を設定する。
	 * @param r 売上明細
	 */
	protected void setUpri(RsltR r) {
		
		if (isNull(r.init_schd_amt()) || isNull(r.init_schd_qty()) || isNull(r.base_unit_qty())) {
			return;
		}
		if (r.init_schd_qty().isZero() || r.trd_unit_qty().isZero()) {
			setValueEx(columnRslt_trd_cur_upri, r.getGUIIndex(), null);
			return;
		}
		// 値引額が未指定の場合はゼロとみなして計算
		MCNumber schdDscntAmt = MCNumber.ZERO;
		if (!isNull(r.init_schd_dscnt_amt())) {
			schdDscntAmt = r.init_schd_dscnt_amt();
		}
		
		// 単価を割り戻して設定する
		MCNumber tmpUpri = 
			(r.init_schd_amt().add(schdDscntAmt))
			.divide(r.init_schd_qty(), r.trd_cur_upri_dec_place().intValue(), toRoundingMode(r.sls_upri_rnd_typ()))
			.multiply(r.base_unit_qty())
			.divide(r.trd_unit_qty(), r.trd_cur_upri_dec_place().intValue(), toRoundingMode(r.sls_upri_rnd_typ()));
		setValueEx(columnRslt_trd_cur_upri, r.getGUIIndex(), tmpUpri);
	}
	
	protected void setCostAmt(RsltR r) {
		
		MCNumber cost_amt = null;
		if (!isNullOr(r.cost_upri(), r.base_unit_qty())) {
			cost_amt = MSUCP_SlsUtil.getCostAmt(r.cost_upri(), r.base_unit_qty(), r.base_cur_amt_dec_place());
		}
		setValueEx(columnRslt_cost_amt, r.getGUIIndex(), cost_amt);
		
		setProfRate(r);
	}
	
	protected void setDscntAmt(RsltR r) {
		
		if (isNull(r.init_schd_dscnt_amt())) {
			return;
		}
		if (isNull(r.base_unit_qty())) {
			return;
		}
		MCNumber dscntQty = r.base_unit_qty().divide(r.init_schd_qty(), MA_META.QTY.scale(), MAC_RND_TYP.RNDOFF.toMC());
		MCNumber tmpDscntAmt = MAUCP_AmtUtil.getAmt(r.init_schd_dscnt_amt(), dscntQty,
				r.trd_cur_amt_dec_place(), r.sls_amt_rnd_typ());
				
		setValueEx(columnRslt_trd_cur_dscnt_amt, r.getGUIIndex(), tmpDscntAmt);
	}
	
	protected java.math.RoundingMode toRoundingMode(String rndTyp) {
		MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
		if (typ == null) {
			return null;
		}
		else {
			return typ.toMC();
		}
	}
	
	protected void setProfRate(RsltR r) {
		r.prof_rate(MSUCP_SlsUtil.getProfRate(r.base_cur_amt(), r.cost_amt()));
	}

	@Override
	public MCList<?> getRslt_sls_rsn_cd(MCRow row, MCEventInfo info) {

		// 単価がゼロの場合のみ、販売他勘定ＦＬＧがオンのデータ抽出する
		int index = info.getEventIndex();
		RsltR RsltR = getRsltL().get(index);
		
		if (!isNull(RsltR.trd_cur_upri()) && RsltR.trd_cur_upri().isPositive()) {
			row.addBooleanColumn(SlsBizRsnCols.$i_not_sls_acxfr_flg, true);
		}
		return super.getRslt_sls_rsn_cd(row, info);
	}
	
	@Override
	protected void openISPanelSub(MCRootPanel inputSupportPanel, MCRow bind, MCListPutter putter, int idx) {
		
		if (columnRslt_lot_no == putter.getLinkBeans()) {
			setLotNoBind(bind, idx);
		}
		super.openISPanelSub(inputSupportPanel, bind, putter, idx);
	}
	
	/**
	 * ロットＮＯの引数設定
	 * 
	 * @param bind
	 * @param idx
	 */
	protected void setLotNoBind(MCRow bind, int idx) {
		
		boolean srch_no_stk_and_io_flg = true;
		RsltR rsltR = getRsltL().get(idx);
		if (!MSC_SLS_TGT_TYP.isDDLV_SLS(rsltR.sls_tgt_typ())) {
			srch_no_stk_and_io_flg = false;
		}
		bind.addBooleanColumn(LotNoCols.$i_srch_no_stk_and_io_flg, srch_no_stk_and_io_flg);
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
			
			if (isDelStatus()) {
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (isInsStatus() || isUpdStatus()) {
				// 一覧登録訂正では更新後画面を固めず、エラーのある行は引き続き訂正・更新できるようにする。
				// 更新処理後、処理結果がOKの行は入力不可にし、再度更新できないようにする。
				// （再度上り電文対象にならないようチェックをオフにするのは結果情報の埋め込み画面に実装されているため個々に実装しない）
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				if (column == columnRslt_trd_cur_amt || column == columnRslt_trd_cur_inc_tax_amt) {
					if (!r.itm_sls_upri_cng_flg() && !r.bp_sls_upri_cng_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_bd_dpt_cd) {
					if (r.sls_acxfr_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnRslt_sls_rsn_cd) {
					if (!isNull(r.trd_cur_upri()) && r.trd_cur_upri().isZero()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnRslt_wtax_rate) {
					// 取引通貨＝基準通貨＝納税通貨
					if (isSame(r.trd_cur_cd(), r.base_cur_cd()) && isSame(r.trd_cur_cd(), r.ptax_cur_cd())) {
						return MCMode.ENABLE;
					}
					// 取引通貨＝基準通貨、かつ、納税通貨がＮＵＬＬ
					if (isSame(r.trd_cur_cd(), r.base_cur_cd()) && isNull(r.ptax_cur_cd())) {
						return MCMode.ENABLE;
					}
				}
				
				if (MSC_SLS_TGT_TYP.isCSTSTK_SLS(r.sls_tgt_typ())) {
					if (column == columnRslt_trd_unit_cd || column == columnRslt_trd_unit_qty) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_crt_lot_flg || column == columnRslt_lot_no || column == columnRslt_sublot_no) {
					// 検収売上または仕入直送売上で、仕入済、入荷予定時にロット指定した場合は、ロットは決まっているので入力不可
					if (MSC_SLS_TGT_TYP.isXFR_IN_SLS(r.sls_tgt_typ()) 
							|| MSC_SLS_TGT_TYP.isARRIVAL_SLS(r.sls_tgt_typ())
							|| (MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ()) && (!r.sync_flg() || r.arr_schd_lot_fix_flg()))
							|| r.multi_io_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_crt_lot_flg) {
					if (!MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_sublot_no) {
					
					// サブロット管理区分：在庫のみサブロット管理の場合、必須ではなく、入力可能にする
					if (MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())
							&& MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())
							&& !MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())
							&& isDefaultModeEditable(columnRslt_sublot_no)) {
						return MCMode.ENABLE;
					}
				}
				
				if (column == columnRslt_trd_unit_cd || column == columnRslt_trd_unit_qty) {
					if (r.multi_io_flg()) {
						return MCMode.READ_ONLY;
					}
					else if (r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 版ＮＯ
				if (column == columnRslt_ver_no || column == columnRslt_ship_fr_valid_dt) {
					if (!r.sync_flg() || r.multi_io_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_bp_lot_no
						|| column == columnRslt_ptax_dt
						|| column == columnRslt_bp_dlv_slip_no
						|| column == columnRslt_bp_dlv_slip_d_no) {
					if (!MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (!r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
					if (column == columnRslt_bp_lot_no) {
						if (r.arr_schd_lot_fix_flg()) {
							return MCMode.READ_ONLY;	
						}
						else if (r.mrkt_judg_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (isUpdStatus()) {
					// インボイス取引対象
					if (r.cst_iv_flg()) {
						if (hdrColumnIv(column)) {
							if (r.iv_read_only_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						if (hdrColumnSlsForIv(column)) {
							if (r.sls_read_only_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						if (column == columnRslt_abort_flg) {
							return MCMode.READ_ONLY;
						}
						if (isIvReadOnlyColumn(column)) {
							return MCMode.READ_ONLY;
						}
					}
					// インボイス取引対象外
					else {
						if (hdrColumnSls(column)) {
							if (column == Rslt_dlv_p_PPanel.columnDlv_show_dtl) {
								return super.getPriorMode(index, column, table);
							}
							else if (r.sls_read_only_flg()) {
								return MCMode.READ_ONLY;
							}
						}
					}
				}
				
				if (isInsStatus()) {
					// インボイス取引対象
					if (r.cst_iv_flg()) {
						if (isIvReadOnlyColumn(column)) {
							return MCMode.READ_ONLY;
						}
					}
				}
				
				if (isInsStatus() || isUpdStatus()) {
					
					if (column == columnRslt_rcv_schd_dt){
						
						if (r.cst_iv_flg() && MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
							return MCMode.REQUIRED;	
							
						}
					}
					
					if (column == columnRslt_bill_basis_dt) {
						
						if (!MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
							
							return MCMode.REQUIRED;	
						}
					}
					
					if (column == columnRslt_ship_dt || column == columnRslt_ship_hm) {
						if (!MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(r.sls_tgt_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					
					if (column == columnRslt_dlv_dt || column == columnRslt_dlv_hm) {
						if (!MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(r.sls_tgt_typ()) &&
								!MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
		/**
		 * インボイス取引の場合に編集不可な項目
		 * 
		 * @param column
		 * @return
		 */
		protected boolean isIvReadOnlyColumn (MCColumnConfig column) {
			
			return column == columnRslt_abort_flg
					|| column == columnRslt_trd_unit_cd
					|| column == columnRslt_trd_unit_qty
					|| column == columnRslt_tax_cd
					|| column == columnRslt_trd_cur_upri
					|| column == columnRslt_trd_cur_amt
					|| column == columnRslt_trd_cur_inc_tax_amt
					|| column == columnRslt_interim_flg
					|| column == columnRslt_trd_cur_dscnt_amt;
		}

		protected boolean hdrColumnIv(MCColumnConfig column) {
			return column == columnRslt_sls_dt 
					|| column == columnRslt_ac_dt
					|| column == columnRslt_can_ac_dt_for_input
					|| column == columnRslt_bill_basis_dt
					|| column == columnRslt_rcv_schd_dt;
		}
		
		// インボイス対象のとき、売上実績NO単位で制御したい項目
		protected boolean hdrColumnSlsForIv(MCColumnConfig column) {
			return column == columnRslt_sls_usr_cd
					|| column == columnRslt_sls_dpt_cd
					|| column == columnRslt_xrate
					|| column == columnRslt_ptax_xrate
					|| column == columnRslt_ar_dpt_cd
					|| column == columnRslt_trd_rmrks
					|| column == columnRslt_intr_rmrks
					|| column == columnRslt_sub_char1
					|| column == columnRslt_sub_char2
					|| column == columnRslt_sub_char3;
		}
		protected boolean hdrColumnSls(MCColumnConfig column) {
			return column == columnRslt_sls_dt
					|| column == columnRslt_ac_dt
					|| column == columnRslt_can_ac_dt_for_input
					|| column == columnRslt_bill_basis_dt
					|| column == columnRslt_sls_usr_cd
					|| column == columnRslt_sls_dpt_cd
					|| column == columnRslt_xrate
					|| column == columnRslt_ptax_xrate
					|| column == columnRslt_ar_dpt_cd
					|| column == columnRslt_trd_rmrks
					|| column == columnRslt_intr_rmrks
					|| column == columnRslt_sub_char1
					|| column == columnRslt_sub_char2
					|| column == columnRslt_sub_char3;
			
		}
	}
	protected void setOrgAmt() {
		for (RsltR r : getRsltL()) {
			r.trd_upri_amt_p().org_trd_cur_dscnt_amt(r.init_trd_cur_dscnt_amt());
			r.trd_upri_amt_p().org_qty(r.init_trd_unit_qty());
		}
	}
	
	/**
	 * 納品書即時発行を設定する。
	 */
	protected void setPrntOutFlgTyp(){
		if (Cnd_ope_REF.isSelected()){
			setValueEx(Btn_prnt_out_flg, false);
		}
		else{
			setValueEx(Btn_prnt_out_flg, true);
		}
	}

}