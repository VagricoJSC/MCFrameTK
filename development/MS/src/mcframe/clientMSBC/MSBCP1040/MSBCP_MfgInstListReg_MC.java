package mcframe.clientMSBC.MSBCP1040;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5370.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
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
import static mcframe.clientMSUC.MSUCP0030.MSUCP_ProdUtil.*;
import mcframe.clientCore.beans.list.*;
import java.util.*;
import mcframe.clientCore.container.io.MCCsvBinaryReader;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_MfgInstListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MfgInstListReg_MC extends MSBCP_MfgInstListReg_MC_A implements IfListRegPanel, MCResultViewerWithFile {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Map<String, MCList<RsltR>> _sameItmOrdMap = new HashMap<String, MCList<RsltR>>();
	protected Map<String, MCList<RsltR>> _sameItmMfgInstMap = new HashMap<String, MCList<RsltR>>();
	protected Map<String, MCList<RsltR>> _sameMfgInstMap = new HashMap<String, MCList<RsltR>>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MfgInstListReg_MC() {
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
	public MSBCP_MfgInstListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected void clearCache() {
		_sameItmOrdMap.clear();
		_sameItmMfgInstMap.clear();
		_sameMfgInstMap.clear();
	}

	/**
	 * Panel[Btn]のボタン[sprt_lot_no]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_lot_no(MCEventInfo info) {
		callMS_MSBCL1040_Sprt01();
	}
	/**
	 * [MS_MSBCL1040_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1040_Sprt01Caller<P extends MSBCP_MfgInstListReg, B extends MS_MSBCL1040_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1040_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1008);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!getBtnR().lot_issue_flg() && !getBtnR().sublot_issue_flg()) {
				msgList.add(new MCMessage(MSBCP1006));
			}
		}
		
		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			MCList<RsltR> l = MCList.create(RsltR.class);
			
			MCIndexKey idxkey = getRsltL().createIndex(RsltR.$itm_ord_no, RsltR.$itm_mfg_inst_no);
			for (RsltR r : getRsltL()) {
				if (!r.check()) {
					continue;
				}
				l.add(r);

				// 工程単位で表示している場合に、同一ヘッダで選択チェックがオフの行を上り電文に含める
				if (Cnd_srch_mode_OPER.isSelected()) {
					if (!isNull(r.mfg_inst_no()) && !r.frst_mfg_inst_flg()) {
						// 初回以外は発番不可
						continue;
					}
					MCList<RsltR> subL = getRsltL().subList(idxkey, r.itm_ord_no(), r.itm_mfg_inst_no());
					for (RsltR subR : subL) {
						if (subR != r && !subR.check()) {
							if (!l.contains(subR)) {
								l.add(subR);
							}
						}
					}
				}
			}
			return l;
		}
	}

	/**
	 * [MS_MSBCL1040_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1040_Del01Caller<P extends MSBCP_MfgInstListReg, B extends MS_MSBCL1040_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL1040_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[del_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv(MCEventInfo info) {
		callMS_MSBCL1040_Del02();
	}
	
	/**
	 * [MS_MSBCL1040_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1040_Del02Caller<P extends MSBCP_MfgInstListReg, B extends MS_MSBCL1040_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL1040_Del02Caller(P p, B b) {
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
			msgList.addAll(panel.checkReq(getAprvBulkSetR()));
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt_inst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_inst(MCEventInfo info) {
		callMS_MSBCL1040_Prnt01();
	}
	
	/**
	 * [MS_MSBCL1040_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1040_Prnt01Caller<P extends MSBCP_MfgInstListReg, B extends MS_MSBCL1040_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBCL1040_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			
			setFIXStatus();
		}
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		if (Cnd_srch_mode_HDR.isSelected()) {
			columnRslt_scheduler_frozen_flg.setMode(MCMode.READ_ONLY);
			columnRslt_scheduler_frozen_itm_flg.setMode(MCMode.INVISIBLE);
			columnRslt_scheduler_frozen_oper_flg.setMode(MCMode.INVISIBLE);
		}
		else {
			columnRslt_scheduler_frozen_flg.setMode(MCMode.INVISIBLE);
			columnRslt_scheduler_frozen_itm_flg.setMode(MCMode.READ_ONLY);
			columnRslt_scheduler_frozen_oper_flg.setMode(MCMode.READ_ONLY);
		}
	}
	
	@Override
	public String getResultViewParamID(MCResultInfo info) {
		return null;
	}
		
	@Override
	public boolean notificationSetResultViewParam(MCCallerPanelBridge bridge, MCBinary... files) {
		if (bridge instanceof MS_MSBCL1040_Upd01Bridge) {
			if (files != null && 3 <= files.length) {
				MS_MSBCL1040_Upd01Bridge upd01Bridge = (MS_MSBCL1040_Upd01Bridge) bridge;

				MCMessageList errMsgL = new MCMessageList();

				// 検索条件
				MCCsvBinaryReader<CndR> cndReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(CndR.class), files[0]);
				errMsgL.addAll(cndReader.read());

				// 一括設定
				MCCsvBinaryReader<InstBulkSetR> instBulkSetReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(InstBulkSetR.class), files[1]);
				errMsgL.addAll(instBulkSetReader.read());

				// 明細
				MCCsvBinaryReader<RsltR> rsltReader = 
						MCCsvBinaryReader.createCsvBinaryReader(MCList.create(RsltR.class), files[2]);
				errMsgL.addAll(rsltReader.read());

				// 読込正否判定
				if (errMsgL.isEmpty()) {
					openByAsyncRslt(upd01Bridge,
									cndReader.getDestFirstRow(), 
									instBulkSetReader.getDestFirstRow(), 
									rsltReader.getDestList());
				}
				else {
					message(errMsgL);
				}
			}
		}

		return false;
	}

	protected void openByAsyncRslt(MS_MSBCL1040_Upd01Bridge bridge, 
			CndR cndR, InstBulkSetR instBulkSetR, MCList<RsltR> rsltFileL) {
		openPanel(getModuleID(), getScreenID(), T1, null, bridge, cndR, instBulkSetR, rsltFileL);
	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (T1 == openTyp) {
			screenClear();
			
			MS_MSBCL1040_Upd01Bridge b = (MS_MSBCL1040_Upd01Bridge) args[0];
			restoreContainerBfrUpd(b, args);

			if(getParamEx(b) == null) {
				MS_MSBCL1040_Upd01Caller<MSBCP_MfgInstListReg, MS_MSBCL1040_Upd01Bridge> caller = createMS_MSBCL1040_Upd01();
				restoreCallerBfrUpd(caller, b);
				_isSkipStatusClear = true;
			}
			else {
				setStatusForAsyncEx();
			}
		}
	}

	@Override
	protected void afterOpenByInitParam(String openTyp, MCRow bind, Object... args) {
		super.afterOpenByInitParam(openTyp, bind, args);

		if (T1 == openTyp) {
			MS_MSBCL1040_Upd01Bridge b = (MS_MSBCL1040_Upd01Bridge) args[0];
			MCException ex = getParamEx(b);

			if (ex != null) {
				dialog(ex);
			}
			else if (_asyncResultMsg != null) {
				dialog(_asyncResultMsg);
				_asyncResultMsg = null;
			}
		}
	}

	/*** ステータスクリア処理をスキップするか */
	protected boolean _isSkipStatusClear = false;

	@Override
	public void statusClear() {
		// 非同期実行の結果確認時に下り電文から復元した行ステータスがクリアされないようにするために必要な処理。
		if (!_isSkipStatusClear) {
			super.statusClear();
		}

		// 実行後は、スキップ要否を元に戻しておく
		_isSkipStatusClear = false;
	}

	protected void restoreContainerBfrUpd(MS_MSBCL1040_Upd01Bridge b, Object... args) {
		// 検索条件
		CndR srcCndR = (CndR) args[1];
		CndR.copyvalue(getCndR(), srcCndR);

		// 一括設定
		InstBulkSetR srcInstBulkSetR = (InstBulkSetR) args[2];
		InstBulkSetR.copyvalue(getInstBulkSetR(), srcInstBulkSetR);

		// 明細
		MCList<RsltR> rsltL = (MCList<RsltR>) args[3];
		getRsltL().setAll(rsltL);
		setRowIndexForUp1(rsltL, b.down0());

		// キャッシュ生成
		createCache();
	}

	/*** 非同期実行終了メッセージ */
	protected MCMessage _asyncResultMsg = null;

	protected void restoreCallerBfrUpd(
			MS_MSBCL1040_Upd01Caller<MSBCP_MfgInstListReg, MS_MSBCL1040_Upd01Bridge> caller,
			MS_MSBCL1040_Upd01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());

		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, getParamMsg(b));
	}

	/***
	 * 上り電文0用INDEX設定
	 * 
	 * @param srcL CSVファイル取込データ
	 * @param down0L オペレーションからの下り電文
	 * @return 上り電文0リスト
	 */
	protected MCList<RsltR> setRowIndexForUp1(MCList<RsltR> srcL, MCList<RsltR> down0L) {
		MCList<RsltR> tgtL = srcL.subList(RsltR.$check, true);

		// paramIndexとparamRowIndexを設定
		tgtL.setParamIndex(1);
		for (int i = 0; i < tgtL.size(); i++) {
			RsltR r = tgtL.get(i);
			r.setParamIndex(1);
			r.setParamRowIndex(i);
		}

		return tgtL;
	}

	/***
	 * Bridgeから例外取得
	 * 
	 * @param b Bridge
	 * @return 発生例外
	 */
	protected MCException getParamEx(MS_MSBCL1040_Upd01Bridge b) {
		MCException result = null;

		if (!b.param().getExceptionParam().isEmpty()) {
			result = b.param().getExceptionParam().getException();
	    }

	    return result;
	}

	/***
	 * Bridgeからメッセ―ジ取得
	 * 
	 * @param b Bridge
	 * @return メッセージリスト
	 */
	protected MCMessageList getParamMsg(MS_MSBCL1040_Upd01Bridge b) {
		MCMessageList result = null;

		if (!b.param().getMessageParam().isEmpty()) {
			result = b.param().getMessageParam().getMessage();
		}

		return result;
	}

	/***
	 * 非同期実行例外発生時のステータス設定
	 * 
	 */
	protected void setStatusForAsyncEx() {
		setFIXStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	/***
	 * キャッシュ生成
	 */
	protected void createCache() {
		if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
			for (MCList<RsltR> gL : getRsltL().groupList(RsltR.$itm_ord_no)) {
				_sameItmOrdMap.put(gL.get(0).itm_ord_no(), gL);
			}
			
			for (MCList<RsltR> gL : getRsltL().groupList(RsltR.$itm_mfg_inst_no)) {
				if (!isNull(gL.get(0).itm_mfg_inst_no())) {
					_sameItmMfgInstMap.put(gL.get(0).itm_mfg_inst_no(), gL);
				}
			}
			
			for (MCList<RsltR> gL : getRsltL().groupList(RsltR.$mfg_inst_no)) {
				if (!isNull(gL.get(0).mfg_inst_no())) {
					_sameMfgInstMap.put(gL.get(0).mfg_inst_no(), gL);
				}
			}
		}
	}	
	/**
	 * [MS_MSBCL1040_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1040_Upd01Caller<P extends MSBCP_MfgInstListReg, B extends MS_MSBCL1040_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1040_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			if (getInstBulkSetR().inst_immed_prnt_flg()) {
				setPrint(true);
			}
			if (getInstBulkSetR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
			}
		}
		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			
			List<MCList<?>> containers = new ArrayList<MCList<?>>();

			// 検索条件
			MCList<CndR> cndL = MCList.create(CndR.class);
			cndL.add(getCndR());
			containers.add(cndL);

			// 一括設定
			MCList<InstBulkSetR> instBulkSetL = MCList.create(InstBulkSetR.class);
			instBulkSetL.add(getInstBulkSetR());
			containers.add(instBulkSetL);

			// 明細
			containers.add(getRsltL());
			
			return csvOutFromContainer(containers);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (isAsyncRsltMode()) {
				setRefStatus();
			}
			else if (isAsync()) {
				setFIXStatus();
			}
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			if (Cnd_srch_mode_OPER.isSelected()) {
				bridge.up0().oper_unit_flg(true);
			}
			else {
				bridge.up0().oper_unit_flg(false);
			}
			if (Cnd_ope_ALLOC.isSelected()) {
				bridge.up0().alloc_ope_flg(true);
			}
			else {
				bridge.up0().alloc_ope_flg(false);
			}
		}
	}
	
	/**
	 * Panel[Btn]のボタン[upd_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_upd_aprv(MCEventInfo info) {
		callMS_MSBCL1040_Upd02();
	}

	/**
	 * [MS_MSBCL1040_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1040_Upd02Caller<P extends MSBCP_MfgInstListReg, B extends MS_MSBCL1040_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1040_Upd02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			for (RsltR r : bridge.up0()) {				
				if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
					r.aprv_dt(getAprvBulkSetR().aprv_dt());
					r.aprv_usr_cd(getAprvBulkSetR().aprv_usr_cd());
				}
			}
		}
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		MCCaller caller = createMS_MSBCL1040_Srch01();
		caller.exec();
	}
	
	/**
	 * [MS_MSBCL1040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1040_Srch01Caller<P extends MSBCP_MfgInstListReg, B extends MS_MSBCL1040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1040_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();
			clearCache();
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
			if (Cnd_ope_UPD.isSelected() || Cnd_ope_ALLOC.isSelected()) {
				for (RsltR r : getRsltL()) {
					if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
						r.po_locked_flg(true);
					}
					r.mes_flg(r.mes_tgt_flg());
				}
			}
			createCache();

		}
	}
	
	protected void checkForCallStackSub(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(StsPanel));
		msgList.addAll(checkAtLeastOne(InstPrntPanel));
		msgList.addAll(checkAtLeastOne(StkLstPrntPanel));
		msgList.addAll(checkAtLeastOne(UnschdActSrchCndPanel));
		msgList.addAll(checkAtLeastOne(SchedLinkPanel));
		msgList.addAll(checkBeforeAfter(Cnd_inst_dt_fr, Cnd_inst_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_aprv_dt_fr, Cnd_aprv_dt_to));
		if (Cnd_srch_mode_OPER.isSelected()) {
			msgList.addAll(checkAtLeastOne(MesPanel));
		}
	}
	
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL1040_Srch01().execDL();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP1010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP1010(r);
	}
	
	protected void doBtn_open_MSBCP1010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1010");
		mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg msbcp1010 = 
				(mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1010.CndR to = mcframe.clientMSBC.MSBCP1010.CndR.create();
		//製造指図ＮＯがNOT NULL
		if (!isNull(r.mfg_inst_no())) {
			if (Cnd_ope_UPD.isSelected() || Cnd_ope_ALLOC.isSelected()) {
				to.ope(msbcp1010.Cnd_ope_UPD.getActionCommand());
			}
			else if (Cnd_ope_DEL.isSelected() || Cnd_ope_APRV_DEL.isSelected()) {
				to.ope(msbcp1010.Cnd_ope_DEL.getActionCommand());
			}
			else if (Cnd_ope_APRV.isSelected()) {
				to.ope(msbcp1010.Cnd_ope_APRV.getActionCommand());
			}
			else {
				to.ope(msbcp1010.Cnd_ope_REF.getActionCommand());
			}
			to.srch_tgt_no(r.mfg_inst_no());
		}
		//製造指図ＮＯがNULLかつ品目製造指図ＮＯがNOT NULL
		else if (isNull(r.mfg_inst_no()) && !isNull(r.itm_mfg_inst_no())) {
			to.ope(msbcp1010.Cnd_ope_INS.getActionCommand());
			to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.ITM_MFG_INST_NO.name());
			to.srch_tgt_no(r.itm_mfg_inst_no());
		}
		//製造指図ＮＯがNULLかつ品目製造指図ＮＯがNULL
		else if (isNull(r.mfg_inst_no()) && isNull(r.itm_mfg_inst_no())) {
			if (Cnd_ope_UPD.isSelected()) {
				to.ope(msbcp1010.Cnd_ope_INS.getActionCommand());
			}
			else if (Cnd_ope_REF.isSelected()) {
				to.ope(msbcp1010.Cnd_ope_INS.getActionCommand());
			}
			to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.ITM_ORD_NO.name());
			to.srch_tgt_no(r.itm_ord_no());
		}
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0040");
		mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg msbcp0040 = 
				(mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP0040.CndR to = mcframe.clientMSBC.MSBCP0040.CndR.create();
		to.itm_ord_no(r.itm_ord_no());
		to.ope(msbcp0040.Cnd_ope_SRCH.getActionCommand());
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0110(MCEventInfo info) {
		// 現品票発行画面への遷移
		MCList<RsltR> list = MCList.create(RsltR.class);
		for (RsltR r : getRsltL()) {
			if (r.check()) {
				list.add(r);
			}
		}
		if (list.isEmpty()) {
			dialog(msgNoSelectedRow());
			return;
		}
		openPanel("MS", "MSBEP0110", T5, list.get(0), list);
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL1040_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL1040_Del01();
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
		InstBulkSet_inst_usr_dpt_p_PPanel.setRelateBeans(InstBulkSet_mfg_inst_dt);
		AprvBulkSet_aprv_usr_dpt_p_PPanel.setRelateBeans(AprvBulkSet_aprv_dt);
		AprvBulkSet_aprv_rsn_p_PPanel.setMetaLength(mcframe.commonMS.meta.MS_META.APRV_RSN);
		
		Rslt_mfg_str_ln_p_PPanel.setRelateBeans(columnRslt_mfg_loc_cd, columnRslt_mfg_str_ln_tgt_flg);
		Rslt_strg_str_ln_p_PPanel.setRelateBeans(columnRslt_strg_loc_cd, columnRslt_strg_str_ln_tgt_flg);
		
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_yield_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_oper_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_ord_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_not_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		
		Rslt_oper_unit_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_oper_unit_dec_place);
		
		Rslt_oper_str_ln_p_PPanel.setRelateBeans(columnRslt_oper_loc_cd, columnRslt_oper_str_ln_tgt_flg);
		
		Rslt_lot_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_lot_mng_typ,
				columnRslt_lot_no_typ, columnRslt_sublot_mng_typ,
				columnRslt_sublot_no_typ, false);
		Rslt_sno_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2,
				columnRslt_itm_sub3, columnRslt_sno1_mng_typ, columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ,
				columnRslt_sno4_mng_typ);
		
		Rslt_inst_usr_dpt_p_PPanel.setRelateBeans(columnRslt_inst_dt);
		Rslt_aprv_usr_dpt_p_PPanel.setRelateBeans(columnRslt_aprv_dt);
		Rslt_aprv_rsn_p_PPanel.setMetaLength(mcframe.commonMS.meta.MS_META.APRV_RSN);
		
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
		clearCndWhenOpeChg();
		clearCndWhenSrchModeChg();
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearCache();
	}
	// -----------------------------------------------
	// status
	
	// 指図する(ヘッダ/検索前)
	@Override
	public void setSRCH_UPD_INST_HDRStatus() {
		super.setSRCH_UPD_INST_HDRStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setInstDtMode();
		setInstImmedPrntFlgMode();
	}

	// 指図する(工程/検索前)
	@Override
	public void setSRCH_UPD_INST_OPERStatus() {
		super.setSRCH_UPD_INST_OPERStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		setInstDtMode();
		setInstImmedPrntFlgMode();
	}

	// 指図する(ヘッダ/検索後)
	@Override
	public void setUPD_INST_HDRStatus() {
		super.setUPD_INST_HDRStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setInstDtMode();
		setInstImmedPrntFlgMode();
	}

	// 指図する(工程/検索後)
	@Override
	public void setUPD_INST_OPERStatus() {
		super.setUPD_INST_OPERStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		setInstDtMode();
		setInstImmedPrntFlgMode();
	}

	// 引当する(ヘッダ/検索前)
	@Override
	public void setSRCH_UPD_ALLOCStatus() {
		super.setSRCH_UPD_ALLOCStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	// 引当する(ヘッダ/検索後)
	@Override
	public void setUPD_ALLOCStatus() {
		super.setUPD_ALLOCStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	// 指図を取り消す(ヘッダ/検索前)
	@Override
	public void setSRCH_DEL_INSTStatus() {
		super.setSRCH_DEL_INSTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	// 指図を取り消す(ヘッダ/検索後)
	@Override
	public void setDEL_INSTStatus() {
		super.setDEL_INSTStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	// 承認する(ヘッダ/検索前)
	@Override
	public void setSRCH_UPD_APRVStatus() {
		super.setSRCH_UPD_APRVStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	// 承認する(ヘッダ/検索後)
	@Override
	public void setUPD_ARPV_HDRStatus() {
		super.setUPD_ARPV_HDRStatus();
		setAprvDptUsrDftVal();
		setAprvDptUsrMode();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	// 承認を取り消す(ヘッダ/検索前)
	@Override
	public void setSRCH_DEL_APRVStatus() {
		super.setSRCH_DEL_APRVStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	// 承認を取り消す(ヘッダ/検索後)
	@Override
	public void setDEL_APRVStatus() {
		super.setDEL_APRVStatus();
		AprvBulkSetPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	// 参照する(ヘッダ/検索前)
	@Override
	public void setSRCH_HDRStatus() {
		super.setSRCH_HDRStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	// 参照する(工程/検索前)
	@Override
	public void setSRCH_OPERStatus() {
		super.setSRCH_OPERStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	// 参照する(ヘッダ/検索後)
	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	// 参照する(工程/検索後)
	@Override
	public void setREF_OPERStatus() {
		super.setREF_OPERStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	// 指図書発行(ヘッダ/検索前)
	@Override
	public void setSRCH_PRNT_INSTStatus() {
		super.setSRCH_PRNT_INSTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	
	// 指図書発行(ヘッダ/検索後)
	@Override
	public void setPRNT_INSTStatus() {
		super.setPRNT_INSTStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	// 現品票発行(ヘッダ/検索前)
	@Override
	public void setSRCH_PRNT_STKLSTStatus() {
		super.setSRCH_PRNT_STKLSTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	
	// 現品票発行(ヘッダ/検索後)
	@Override
	public void setPRNT_STKLSTStatus() {
		super.setPRNT_STKLSTStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		if (r == null) {
			Btn_open_MSBCP1010.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0040.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBCP1010);
			if (r.unschd_inst_flg()){
				Btn_open_MSBCP0040.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBCP0040);
			}
		}
	}

	protected boolean isUpdActHdrStatus() {
		return isSame(getStatus(), UPD_INST_HDR);
	}

	protected boolean isUpdActOperStatus() {
		return isSame(getStatus(), UPD_INST_OPER);
	}

	protected boolean isUpdAllocStatus() {
		return isSame(getStatus(), UPD_ALLOC);
	}

	protected boolean isUpdAprvHdrStatus() {
		return isSame(getStatus(), UPD_ARPV_HDR);
	}

	protected boolean isUpdStatus() {
		return isUpdActHdrStatus() || isUpdActOperStatus() || isUpdAprvHdrStatus() || isUpdAllocStatus();
	}

	protected boolean isDelInstStatus() {
		return isSame(getStatus(), DEL_INST);
	}

	protected boolean isDelAprvStatus() {
		return isSame(getStatus(), DEL_APRV);
	}
	
	protected boolean isDelStatus() {
		return isDelInstStatus() || isDelAprvStatus();
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}
	
	// 検索前ステータス
	protected void setSrchStatus() {
		//　指図する
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setSRCH_UPD_INST_HDRStatus();
			}
			else {
				setSRCH_UPD_INST_OPERStatus();
			}
		}
		// 引当する
		else if (Cnd_ope_ALLOC.isSelected()) {
			setSRCH_UPD_ALLOCStatus();
		}
		// 指図を取り消す
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DEL_INSTStatus();
		}
		// 承認する
		else if (Cnd_ope_APRV.isSelected()) {
			setSRCH_UPD_APRVStatus();
		}
		// 承認を取り消す
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			setSRCH_DEL_APRVStatus();
		}
		// 指図書発行
		else if (Cnd_ope_PRNT_INST.isSelected()) {
			setSRCH_PRNT_INSTStatus();
		}
		// 現品票発行
		else if (Cnd_ope_PRNT_STKLST.isSelected()) {
			setSRCH_PRNT_STKLSTStatus();
		}
		//参照する
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setSRCH_HDRStatus();
			}
			else {
				setSRCH_OPERStatus();
			}
		}

		Ctrl_ctrl_PPanel.expand(true);
	}

	// 検索後ステータス
	protected void setRefStatus() {
		// 指図する
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setUPD_INST_HDRStatus();
			}
			else {
				setUPD_INST_OPERStatus();
			}
		}
		// 引当する
		else if (Cnd_ope_ALLOC.isSelected()) {
			setUPD_ALLOCStatus();
		}
		// 指図を取り消す
		else if (Cnd_ope_DEL.isSelected()) {
			setDEL_INSTStatus();
		}
		// 承認する
		else if (Cnd_ope_APRV.isSelected()) {
			setUPD_ARPV_HDRStatus();
		}
		// 承認を取り消す
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			setDEL_APRVStatus();
		}
		// 指図書発行
		else if (Cnd_ope_PRNT_INST.isSelected()) {
			setPRNT_INSTStatus();
		}
		// 現品票発行
		else if (Cnd_ope_PRNT_STKLST.isSelected()) {
			setPRNT_STKLSTStatus();
		}
		// 参照する
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setREF_HDRStatus();
			}
			else {
				setREF_OPERStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
	}	
	
	// -----------------------------------------------
	// event/listener
	
	// 製造状況区分の絞込み
	@Override
	public MCList getInstBulkSet_mfg_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispMfgStsTyp());
		return super.getInstBulkSet_mfg_sts_typ(row, info);
	}
	
	public MSC_MFG_STS_TYP[] getDispMfgStsTyp() {
		return new MSC_MFG_STS_TYP[] {
				MSC_MFG_STS_TYP.SAV, MSC_MFG_STS_TYP.ORD
		};
	}

	// 検索枠の製造承認状況区分の絞込み
	@Override
	public MCList getCnd_mfg_aprv_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispMfgAprvStsTyp());
		return super.getCnd_mfg_aprv_sts_typ(row, info);
	}
	
	public MSC_MFG_APRV_STS_TYP[] getDispMfgAprvStsTyp() {
		return new MSC_MFG_APRV_STS_TYP[] {
				MSC_MFG_APRV_STS_TYP.INST_OPN, MSC_MFG_APRV_STS_TYP.INST_ACPT,
				MSC_MFG_APRV_STS_TYP.ACT_ACPT
		};
	}
	
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
			// REF（検索モード）では、クリア確認出さない
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
		clearContainers(getRsltL(), getInstBulkSetR(), getAprvBulkSetR());
		setSrchStatus();
		clearCndWhenOpeChg();
		clearCompDtFromOperFlg();
	}
	
	@Override
	public void doCnd_srch_mode_NC(MCEventInfo info){
		super.doCnd_srch_mode_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		clearCndWhenSrchModeChg();
		clearCompDtFromOperFlg();
	}
	
	/**
	 * 種別変更時
	 */
	protected void clearCndWhenOpeChg() {
		if (Cnd_ope_UPD.isSelected()) {
			// 指図する
			setValueEx(Cnd_tmp_sts_yet_flg, true);
			setValueEx(Cnd_tmp_sts_sav_flg, true);
			setValueEx(Cnd_tmp_sts_ord_flg, false);
			setValueEx(Cnd_tmp_sts_stt_flg, false);
			setValueEx(Cnd_tmp_sts_cmpl_flg, false);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_before_frozen_flg, false);
			setValueEx(Cnd_frozen_flg, true);
			setValueEx(Cnd_abort_flg, false);
			setValueEx(Cnd_not_alloc_srch_flg, false);
			setMfgInstUnitTypForUpd();
			setValueEx(InstBulkSet_mfg_sts_typ, MSC_MFG_STS_TYP.ORD.value());
		}
		else if (Cnd_ope_ALLOC.isSelected()) {
			// 引当する
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_tmp_sts_yet_flg, false);
			setValueEx(Cnd_tmp_sts_sav_flg, true);
			setValueEx(Cnd_tmp_sts_ord_flg, true);
			setValueEx(Cnd_tmp_sts_stt_flg, true);
			setValueEx(Cnd_tmp_sts_cmpl_flg, false);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_before_frozen_flg, true);
			setValueEx(Cnd_frozen_flg, true);
			setValueEx(Cnd_abort_flg, false);
			setValueEx(Cnd_not_alloc_srch_flg, true);
			setValueEx(Cnd_mfg_inst_unit_typ, null);
			setValueEx(Cnd_not_srch_opn_flg, false);
			setValueEx(Cnd_not_srch_sav_flg, false);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			// 指図を取り消す
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_tmp_sts_yet_flg, false);
			setValueEx(Cnd_tmp_sts_sav_flg, true);
			setValueEx(Cnd_tmp_sts_ord_flg, true);
			setValueEx(Cnd_tmp_sts_stt_flg, false);
			setValueEx(Cnd_tmp_sts_cmpl_flg, false);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_before_frozen_flg, true);
			setValueEx(Cnd_frozen_flg, true);
			setValueEx(Cnd_abort_flg, false);
			setValueEx(Cnd_not_alloc_srch_flg, false);
			setValueEx(Cnd_mfg_inst_unit_typ, null);
			setValueEx(Cnd_not_srch_opn_flg, false);
			setValueEx(Cnd_not_srch_sav_flg, false);
		}
		else if (Cnd_ope_APRV.isSelected()) {
			// 承認する
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_tmp_sts_yet_flg, false);
			setValueEx(Cnd_tmp_sts_sav_flg, false);
			setValueEx(Cnd_tmp_sts_ord_flg, true);
			setValueEx(Cnd_tmp_sts_stt_flg, false);
			setValueEx(Cnd_tmp_sts_cmpl_flg, false);
			setValueEx(Cnd_mfg_aprv_sts_typ, MSC_MFG_APRV_STS_TYP.INST_OPN.value());
			setValueEx(Cnd_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_before_frozen_flg, true);
			setValueEx(Cnd_frozen_flg, true);
			setValueEx(Cnd_abort_flg, false);
			setValueEx(Cnd_not_alloc_srch_flg, false);
			setValueEx(Cnd_mfg_inst_unit_typ, null);
			setValueEx(Cnd_not_srch_opn_flg, false);
			setValueEx(Cnd_not_srch_sav_flg, false);
		}
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			// 承認を取り消す
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_tmp_sts_yet_flg, false);
			setValueEx(Cnd_tmp_sts_sav_flg, false);
			setValueEx(Cnd_tmp_sts_ord_flg, true);
			setValueEx(Cnd_tmp_sts_stt_flg, false);
			setValueEx(Cnd_tmp_sts_cmpl_flg, false);
			setValueEx(Cnd_mfg_aprv_sts_typ, MSC_MFG_APRV_STS_TYP.INST_ACPT.value());
			setValueEx(Cnd_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_before_frozen_flg, true);
			setValueEx(Cnd_frozen_flg, true);
			setValueEx(Cnd_abort_flg, false);
			setValueEx(Cnd_not_alloc_srch_flg, false);
			setValueEx(Cnd_mfg_inst_unit_typ, null);
			setValueEx(Cnd_not_srch_opn_flg, false);
			setValueEx(Cnd_not_srch_sav_flg, false);
		}
		else if (Cnd_ope_PRNT_INST.isSelected()) {
			// 指図書発行
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_tmp_sts_yet_flg, false);
			setValueEx(Cnd_tmp_sts_sav_flg, false);
			setValueEx(Cnd_tmp_sts_ord_flg, true);
			setValueEx(Cnd_tmp_sts_stt_flg, false);
			setValueEx(Cnd_tmp_sts_cmpl_flg, false);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_inst_prnt_flg, false);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_before_frozen_flg, true);
			setValueEx(Cnd_frozen_flg, true);
			setValueEx(Cnd_abort_flg, false);
			setValueEx(Cnd_not_alloc_srch_flg, false);
			setValueEx(Cnd_mfg_inst_unit_typ, null);
			setValueEx(Cnd_not_srch_opn_flg, false);
			setValueEx(Cnd_not_srch_sav_flg, false);
		}
		else if (Cnd_ope_PRNT_STKLST.isSelected()) {
			// 現品票発行
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setValueEx(Cnd_tmp_sts_yet_flg, false);
			setValueEx(Cnd_tmp_sts_sav_flg, false);
			setValueEx(Cnd_tmp_sts_ord_flg, true);
			setValueEx(Cnd_tmp_sts_stt_flg, false);
			setValueEx(Cnd_tmp_sts_cmpl_flg, false);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, false);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_before_frozen_flg, true);
			setValueEx(Cnd_frozen_flg, true);
			setValueEx(Cnd_abort_flg, false);
			setValueEx(Cnd_not_alloc_srch_flg, false);
			setValueEx(Cnd_mfg_inst_unit_typ, null);
			setValueEx(Cnd_not_srch_opn_flg, false);
			setValueEx(Cnd_not_srch_sav_flg, false);
		}
		else if (Cnd_ope_REF.isSelected()) {
			// 参照する
			setValueEx(Cnd_tmp_sts_yet_flg, true);
			setValueEx(Cnd_tmp_sts_sav_flg, true);
			setValueEx(Cnd_tmp_sts_ord_flg, true);
			setValueEx(Cnd_tmp_sts_stt_flg, true);
			setValueEx(Cnd_tmp_sts_cmpl_flg, true);
			setValueEx(Cnd_mfg_aprv_sts_typ, null);
			setValueEx(Cnd_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_not_inst_prnt_flg, true);
			setValueEx(Cnd_stk_lst_issue_flg, true);
			setValueEx(Cnd_not_stk_lst_issue_flg, true);
			setValueEx(Cnd_unschd_act_flg, true);
			setValueEx(Cnd_before_frozen_flg, true);
			setValueEx(Cnd_frozen_flg, true);
			setValueEx(Cnd_not_unschd_act_flg, true);
			setValueEx(Cnd_abort_flg, false);
			setValueEx(Cnd_not_alloc_srch_flg, false);
			setValueEx(Cnd_mfg_inst_unit_typ, null);
		}
	}

	/**
	 * 検索モード変更時
	 */
	protected void clearCndWhenSrchModeChg() {
		if (Cnd_srch_mode_HDR.isSelected()) {
			setValueEx(Cnd_oper_loc_cd, null);
			setValueEx(Cnd_oper_loc_nm, null);
			setValueEx(Cnd_oper_str_ln_cd, null);
			setValueEx(Cnd_oper_str_ln_nm, null);
			setValueEx(Cnd_oper_cd, null);
			setValueEx(Cnd_oper_nm, null);
			setValueEx(Cnd_oper_usr_cd, null);
			setValueEx(Cnd_oper_usr_nm, null);
			setValueEx(Cnd_oper_inst_no, null);
			setValueEx(Cnd_oper_ord_no, null);
			setValueEx(Cnd_oper_inst_rpt_rmrks, null);
			setValueEx(Cnd_oper_intr_rmrks, null);
			setValueEx(Cnd_oper_rsrc, null);
			setValueEx(Cnd_oper_inst_sub_char1, null);
			setValueEx(Cnd_oper_inst_sub_char2, null);
			setValueEx(Cnd_oper_inst_sub_char3, null);
			setValueEx(Cnd_mes_tgt_flg, true);
			setValueEx(Cnd_not_mes_tgt_flg, true);
		}
		
		setMfgInstUnitTypForUpd();
	}
	
	protected void setMfgInstUnitTypForUpd() {
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_srch_mode_HDR.isSelected()) {
				setValueEx(Cnd_mfg_inst_unit_typ, MAC_MFG_INST_UNIT_TYP.ITM.value());
			}
			else if (Cnd_srch_mode_OPER.isSelected()) {
				setValueEx(Cnd_mfg_inst_unit_typ, MAC_MFG_INST_UNIT_TYP.OPER.value());
			}
		}
	}
	
	protected void clearCompDtFromOperFlg() {
		// 操作種別、検索モード変更時、予定日補正は常にfalseにする
		setValueEx(Cnd_comp_dt_from_oper_flg, false);
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r == null) {
				dialog(msgNoSelectedRow());
				return;
			}
			doBtn_open_MSBCP1010(r);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnRslt_base_unit_inst_qty.addLCListener(this);
		columnRslt_base_unit_yield_qty.addLCListener(this);
		columnRslt_oper_base_unit_qty.addLCListener(this);
		columnRslt_mfg_str_ln_cd.addLCListener(this);
		
		AprvBulkSet_aprv_rsn.addLCListener(this);
		AprvBulkSet_aprv_usr_cd.addLCListener(this);
		AprvBulkSet_aprv_usr_dpt_cd.addLCListener(this);
		InstBulkSet_inst_usr_cd.addLCListener(this);
		InstBulkSet_inst_usr_dpt_cd.addLCListener(this);
		
		// 工程別製造指図の値連動用イベントのリスナーを追加
		for (MCColumnConfig column : getItmMfgInstColumn()) {
			if (isNotListBeans(column)) {
				column.addNCListener(this);
			}
			else {
				column.addLCListener(this);
			}
		}
		
		for (MCColumnConfig column : getMfgInstColumn()) {
			if (isNotListBeans(column)) {
				column.addNCListener(this);
			}
			else {
				column.addLCListener(this);
			}
		}
	}
	
	protected boolean isNotListBeans(MCColumnConfig column) {
		if (column.getDataType() == MCDataType.BOOLEAN) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
			if (nc instanceof MCColumnConfig) {
				MCColumnConfig column = (MCColumnConfig)nc;
				if (isNotListBeans(column)) {
					if (isItmMfgInstColumn(column)) {
						doLinkItmMfgInstVal(column, info);
					}
					else if (isMfgInstColumn(column)) {
						doLinkMfgInstVal(column, info);
					}
				}
			}
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnRslt_base_unit_inst_qty) {
			doRslt_base_unit_inst_qty_LC(info);
		}
		else if (lc == columnRslt_base_unit_yield_qty) {
			doRslt_base_unit_yield_qty_LC(info);
		}
		else if (lc == columnRslt_bom_ptn) {
			doRslt_bom_ptn_LC(info);
		}
		else if (lc == columnRslt_oper_base_unit_qty) {
			doRslt_oper_base_unit_qty_LC(info);
		}
		else if (lc == columnRslt_mfg_str_ln_cd) {
			doRslt_mfg_str_ln_cd_LC(info);
		}
		else if (lc == AprvBulkSet_aprv_usr_cd) {
			doAprvBulkSet_aprv_usr_cd_LC(info);
		}
		else if (lc == AprvBulkSet_aprv_usr_dpt_cd) {
			doAprvBulkSet_aprv_usr_dpt_cd_LC(info);
		}
		else if (lc == AprvBulkSet_aprv_rsn) {
			doAprvBulkSet_aprv_rsn_LC(info);
		}
		else if (lc == InstBulkSet_inst_usr_cd) {
			doInstBulkSet_inst_usr_cd_LC(info);
		}
		else if (lc == InstBulkSet_inst_usr_dpt_cd) {
			doInstBulkSet_inst_usr_dpt_cd_LC(info);
		}
		
		if (Cnd_ope_UPD.isSelected() && Cnd_srch_mode_OPER.isSelected()) {
			if (lc instanceof MCColumnConfig) {
				MCColumnConfig column = (MCColumnConfig)lc;
				if (!isNotListBeans(column)) {
					if (isItmMfgInstColumn(column)) {
						doLinkItmMfgInstVal(column, info);
					}
					else if (isMfgInstColumn(column)) {
						doLinkMfgInstVal(column, info);
					}
				}
			}
		}
	}
	
	// 工程単位の場合に、同一ヘッダとなりうる行に対して値を連動する処理
	protected boolean _isDuringItmMfgInstLinkEvent = false;
	
	protected void doLinkItmMfgInstVal(MCColumnConfig column, MCEventInfo info) {
		if (_isDuringItmMfgInstLinkEvent) {
			return;
		}
		try {
			_isDuringItmMfgInstLinkEvent = true;
			// イベントが発生した行
			RsltR srcR = getRsltL().get(info.getEventIndex());
			
			// 同一品目製造指図または品目オーダに紐付くリストを取得
			MCList<RsltR> sameL;
			if (!isNull(srcR.itm_mfg_inst_no())) {
				sameL = _sameItmMfgInstMap.get(srcR.itm_mfg_inst_no());
			}
			else {
				sameL = _sameItmOrdMap.get(srcR.itm_ord_no());
			}
			if (!isNull(sameL)) {
				for (RsltR sameR : sameL) {
					boolean bfrChk = sameR.check();
					// 他の行に値を連動する
					column.setValue(sameR.getGUIIndex(), info.getNewValue());
					if (!bfrChk && sameR != srcR) {
						// 品目単位製造指図で同じ値でなければならないものは値を連動するが、
						// 今回指図したくない行の選択チェックがオンになるのを防ぐため連動前の選択チェックがfalseの場合は、選択チェックを元に戻す
						if (isNull(srcR.oper_inst_grp()) || !isSame(srcR.oper_inst_grp(), sameR.oper_inst_grp())) {
							columnRslt_check.setValue(sameR.getGUIIndex(), bfrChk);
							// 後で選択チェック以外の項目を変更したときに、自動で選択チェックがオンになるようにするため、ステータスをNONEに戻す
							// ※親クラスの処理の仕様で、ステータスがNONEからNONE以外に変わったときに、選択チェックをオンにする仕様なので
							// NONEに戻しておかないと選択チェックがオンにならない
							sameR.setStatus(MCRow.Status.NONE);
						}
					}
				}
			}
		}
		finally {
			_isDuringItmMfgInstLinkEvent = false;
		}
	}
	
	protected boolean _isDuringMfgInstLinkEvent = false;
	
	protected void doLinkMfgInstVal(MCColumnConfig column, MCEventInfo info) {
		if (_isDuringMfgInstLinkEvent) {
			return;
		}
		try {
			_isDuringMfgInstLinkEvent = true;
			// イベントが発生した行
			RsltR srcR = getRsltL().get(info.getEventIndex());
			
			// 同一製造指図または品目オーダ＋工程指図Gに紐付くリストを取得
			MCList<RsltR> sameL;
			if (!isNull(srcR.mfg_inst_no())) {
				sameL = _sameMfgInstMap.get(srcR.mfg_inst_no());
			}
			else {
				// _sameItmOrdMapから製造指図ＮＯが設定されていない行のみを抽出
				sameL = MCList.create(RsltR.class);
				if (!isNull(srcR.oper_inst_grp())) {
					MCList<RsltR> tmpL = _sameItmOrdMap.get(srcR.itm_ord_no()).subList(RsltR.$oper_inst_grp, srcR.oper_inst_grp());
					for (RsltR tmpR : tmpL) {
						if (isNull(tmpR.mfg_inst_no()) && isSame(srcR.itm_mfg_inst_no(), tmpR.itm_mfg_inst_no())) {
							sameL.add(tmpR);
						}
					}
				}
			}
			if (!isNull(sameL)) {
				for (RsltR sameR : sameL) {
					boolean bfrChk = sameR.check();
					// 他の行に値を連動する
					column.setValue(sameR.getGUIIndex(), info.getNewValue());
					// 連動前の選択チェックがfalseの場合は、選択チェックを元に戻す
					if (!bfrChk && isNull(sameR.oper_inst_grp()) && isNull(sameR.mfg_inst_no())) {
						columnRslt_check.setValue(sameR.getGUIIndex(), bfrChk);
					}
				}
			}
		}
		finally {
			_isDuringMfgInstLinkEvent = false;
		}
	}
	
	@Override
	public void doAprvBulkSet_aprv_dt_LC(MCEventInfo info) {
		super.doAprvBulkSet_aprv_dt_LC(info);
		bulkSet(AprvBulkSet_aprv_dt);
	}

	protected void doAprvBulkSet_aprv_usr_cd_LC(MCEventInfo info) {
		bulkSet(AprvBulkSet_aprv_usr_cd);
	}

	protected void doAprvBulkSet_aprv_usr_dpt_cd_LC(MCEventInfo info) {
		bulkSet(AprvBulkSet_aprv_usr_dpt_cd);
	}
	
	protected void doAprvBulkSet_aprv_rsn_LC(MCEventInfo info) {
		bulkSet(AprvBulkSet_aprv_rsn);
	}

	@Override
	public void doInstBulkSet_mfg_inst_dt_LC(MCEventInfo info) {
		super.doInstBulkSet_mfg_inst_dt_LC(info);
		bulkSet(InstBulkSet_mfg_inst_dt);
	}

	protected void doInstBulkSet_inst_usr_cd_LC(MCEventInfo info) {
		bulkSet(InstBulkSet_inst_usr_cd);
	}

	protected void doInstBulkSet_inst_usr_dpt_cd_LC(MCEventInfo info) {
		bulkSet(InstBulkSet_inst_usr_dpt_cd);
	}
	
	@Override
	public void doInstBulkSet_mfg_sts_typ_LC(MCEventInfo info) {
		super.doInstBulkSet_mfg_sts_typ_LC(info);
		if (MSC_MFG_STS_TYP.isORD(getInstBulkSetR().mfg_sts_typ())) {
			setValueEx(InstBulkSet_mfg_inst_dt, getToday());
			if (getInstBulkSetR().async_flg()) {
				setValueEx(InstBulkSet_inst_immed_prnt_flg, false);
			} else {
				setValueEx(InstBulkSet_inst_immed_prnt_flg, true);
			}
		}
		setInstDtMode();
	}
	
	protected void setInstDtMode() {
		if (MSC_MFG_STS_TYP.isORD(getInstBulkSetR().mfg_sts_typ())) {
			InstBulkSet_mfg_inst_dt.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(InstBulkSet_mfg_inst_dt);
		}
	}

	public void doRslt_bom_ptn_LC(mcframe.clientCore.event.MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if(!isNull(r.base_unit_inst_qty())) {
			doRslt_base_unit_inst_qty_LC(info);
		}
		else if(!isNull(r.base_unit_yield_qty())) {
			doRslt_base_unit_yield_qty_LC(info);
		}
	}

	protected void doRslt_base_unit_inst_qty_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!r.not_qty_rlt_flg()) {
			// 出来高予定数と指図数は相互に連動しているため、イベントを発生させないようにsetValueExではなく直接コンテナに値を設定する。
			if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
				r.base_unit_yield_qty(r.base_unit_inst_qty());
			}
			else {
				r.base_unit_yield_qty(convQtyInstToYield(r.mst_mfg_inst_qty(),
						r.mst_yield_schd_qty(), r.base_unit_inst_qty(),
						r.base_unit_dec_place(), r.mst_fxd_rqmt_qty()));
			}
		}
		// 工程単位製造指図の場合、指図数量を基準単位指図数量（工程）に設定する。
		if (MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ())) {
			setValueEx(columnRslt_oper_base_unit_qty, r.getGUIIndex(),
					r.base_unit_inst_qty());
		}
	}
	
	protected void doRslt_base_unit_yield_qty_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!r.not_qty_rlt_flg()) {
			// 出来高予定数と指図数は相互に連動しているため、イベントを発生させないようにsetValueExではなく直接コンテナに値を設定する。
			r.base_unit_inst_qty(convQtyYieldToInst(r.mst_mfg_inst_qty(),
					r.mst_yield_schd_qty(), r.base_unit_yield_qty(),
					r.base_unit_dec_place(), r.mst_fxd_rqmt_qty()));
		}
	}

	protected void doRslt_oper_base_unit_qty_LC(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		setValueEx(columnRslt_oper_unit_qty, r.getGUIIndex(),
				convQtyBaseToOper(r.oper_base_unit_qty(), r.oper_conv_qty(), r.oper_std_qty(),
						r.oper_unit_dec_place(), r.oper_unit_conv_rnd_typ()));
	}

	// 製造棚・ライン
	protected void doRslt_mfg_str_ln_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index < 0) {
			return ;
		}
		RsltR r = getRsltL().get(index);
		if (r.ln_stk_flg()) {
			// 棚・ライン格納がオンの場合、製造棚・ラインを格納棚・ラインに連動する（同じ棚・ラインがマスタ設定されている想定）
			if (r.strg_str_ln_tgt_flg()) {
				setValueEx(columnRslt_strg_str_ln_cd, index, nullValToNull(r.mfg_str_ln_cd()));
			}
		}
	}

	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		if (srcRow instanceof RsltR) {
			RsltR r = (RsltR) srcRow;
			if (isNull(r.aprv_dt())) {
				bulkSet(AprvBulkSet_aprv_dt, r);
			}
			if (isNull(r.aprv_rsn())) {
				bulkSet(AprvBulkSet_aprv_rsn, r);
			}
			if (isNull(r.aprv_usr_cd())) {
				bulkSet(AprvBulkSet_aprv_usr_cd, r);
			}
			if (isNull(r.aprv_dpt_cd())) {
				bulkSet(AprvBulkSet_aprv_usr_dpt_cd, r);
			}
			if (isNull(r.inst_dt())) {
				bulkSet(InstBulkSet_mfg_inst_dt, r);
			}
			if (isNull(r.inst_usr_cd())) {
				bulkSet(InstBulkSet_inst_usr_cd, r);
			}
			if (isNull(r.inst_dpt_cd())) {
				bulkSet(InstBulkSet_inst_usr_dpt_cd, r);
			}
			
			doLinkCheck(r);
		}
	}

	protected boolean _isDuringCheckNCEvent = false;

	protected void doLinkCheck(RsltR r) {
		// 同一製造指図で選択チェックを連動
		// 同一製造指図または品目オーダ＋工程指図Gに紐付くリストを取得
		MCList<RsltR> sameL = MCList.create(RsltR.class);
		if (!isNull(r.mfg_inst_no())) {
			sameL = _sameMfgInstMap.get(r.mfg_inst_no());
		}
		else if (!isNull(r.oper_inst_grp())) {
			// _sameItmOrdMapから製造指図ＮＯが設定されていない行のみを抽出
			sameL = MCList.create(RsltR.class);
			MCList<RsltR> tmpL = _sameItmOrdMap.get(r.itm_ord_no()).subList(RsltR.$oper_inst_grp, r.oper_inst_grp());
			for (RsltR tmpR : tmpL) {
				if (isNull(tmpR.mfg_inst_no()) && isSame(r.itm_mfg_inst_no(), tmpR.itm_mfg_inst_no())) {
					sameL.add(tmpR);
				}
			}
		}
		if (!isNull(sameL)) {
			for (RsltR sameR : sameL) {
				if (sameR == r) {
					continue;
				}
				columnRslt_check.setValue(sameR.getGUIIndex(), r.check());
			}
		}

	}
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.check()) {
			bulkSet(AprvBulkSet_aprv_dt, r);
			bulkSet(AprvBulkSet_aprv_rsn, r);
			bulkSet(AprvBulkSet_aprv_usr_cd, r);
			bulkSet(AprvBulkSet_aprv_usr_dpt_cd, r);
			bulkSet(InstBulkSet_mfg_inst_dt, r);
			bulkSet(InstBulkSet_inst_usr_cd, r);
			bulkSet(InstBulkSet_inst_usr_dpt_cd, r);
		}
		try {
			if (!_isDuringCheckNCEvent) {
				_isDuringCheckNCEvent = true;
				// 他の行のcheck_NCイベントから呼ばれた場合は連動させない
				doLinkCheck(r);
			}
		}
		finally {
			_isDuringCheckNCEvent = false;
		}
	}

	@Override
	public void doInstBulkSet_async_flg_NC(MCEventInfo info) {
		super.doInstBulkSet_async_flg_NC(info);

		setInstImmedPrntFlgMode();
	}

	protected void setInstImmedPrntFlgMode() {
		if (getInstBulkSetR().async_flg()) {
			setValueEx(InstBulkSet_inst_immed_prnt_flg, false);
			InstBulkSet_inst_immed_prnt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(InstBulkSet_inst_immed_prnt_flg);
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
		if (isNull(r.mfg_inst_no()) || MSC_MFG_STS_TYP.isSAV(r.mfg_sts_typ())) {
			if (b == InstBulkSet_mfg_inst_dt
					&& isEditable(columnRslt_inst_dt, r.getGUIIndex())) {
				// setValueしてしまうと指図数量変更後の出来高予定数量の連動が動かないためコンテナに直接値を設定する
				r.inst_dt(getInstBulkSetR().mfg_inst_dt());
			}
			if (b == InstBulkSet_inst_usr_cd
					&& isEditable(columnRslt_inst_usr_cd, r.getGUIIndex())) {
				r.inst_usr_cd(getInstBulkSetR().inst_usr_cd());
				r.inst_usr_nm(getInstBulkSetR().inst_usr_nm());
			}
			if (b == InstBulkSet_inst_usr_dpt_cd
					&& isEditable(columnRslt_inst_dpt_cd, r.getGUIIndex())) {
				r.inst_dpt_cd(getInstBulkSetR().inst_usr_dpt_cd());
				r.inst_dpt_nm(getInstBulkSetR().inst_usr_dpt_nm());
			}
		}
		if (Cnd_ope_APRV.isSelected()) {
			if (b == AprvBulkSet_aprv_dt) {
				r.aprv_dt(getAprvBulkSetR().aprv_dt());
			}
			if (b == AprvBulkSet_aprv_usr_cd) {
				r.aprv_usr_cd(getAprvBulkSetR().aprv_usr_cd());
				r.aprv_usr_nm(getAprvBulkSetR().aprv_usr_nm());
			}
			if (b == AprvBulkSet_aprv_usr_dpt_cd) {
				r.aprv_dpt_cd(getAprvBulkSetR().aprv_usr_dpt_cd());
				r.aprv_dpt_nm(getAprvBulkSetR().aprv_usr_dpt_nm());
			}
			if (b == AprvBulkSet_aprv_rsn) {
				setValueEx(columnRslt_aprv_rsn, r.getGUIIndex(), getAprvBulkSetR().aprv_rsn());
			}
		}
		else if (Cnd_ope_APRV_DEL.isSelected()) {
			if (b == AprvBulkSet_aprv_rsn) {
				setValueEx(columnRslt_aprv_rsn, r.getGUIIndex(), getAprvBulkSetR().aprv_rsn());
			}
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
			
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) || MAC_RTN_STS_TYP.isWRN(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			// 操作種別が「引当する」の場合、計画外実績のフラグがONの行は、変更不可とする
			if (Cnd_ope_ALLOC.isSelected() && r.unschd_act_flg()) {
				return MCMode.READ_ONLY;
			}

			if (isDelInstStatus()) {
				// 工程単位の一括取消は将来対応
				if (MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ())) {
				}
				else {
					if (!isNull(r.mfg_aprv_sts_typ()) && !MSC_MFG_APRV_STS_TYP.isINST_OPN(r.mfg_aprv_sts_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			if (isUpdInstStatus()) {
				// 内製でRO
				if (isMfgReadOnlyColumn(column)) {
					if (MSC_MFG_MTD_TYP.isINTNL(r.mfg_mtd_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 外注でRO
				if (isOutSrcReadOnlyColumn(column)) {
					if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 外注かつ未発注の計画指図でRO
				if (isOutSrcReadOnlyColumnWhenPoNotReged(column)) {
					if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())
							&& isNull(r.po_d_no())
							&& !r.unschd_inst_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 外注かつ発注済みでRO
				if (isOutSrcReadOnlyColumnWhenPoReged(column)) {
					if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())
							&& !isNull(r.po_d_no())) {
						return MCMode.READ_ONLY;
					}
				}
				if (MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ()) && MSC_MFG_STS_TYP.isSAV(r.mfg_sts_typ())
						&& !r.frst_mfg_inst_flg()) {
					// 工程単位製造指図の指図保存で初回以外
					if (column == columnRslt_lot_no || column == columnRslt_sublot_no) {
						return MCMode.READ_ONLY;
					}
				}
				// 指図保存で任意
				if (MSC_MFG_STS_TYP.isSAV(getInstBulkSetR().mfg_sts_typ())) {
					if (column == columnRslt_lot_no) {
						if (MAC_LOT_ISSUE_TYP.isON_CMPL(r.lot_issue_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnRslt_sublot_no) {
						if (MAC_LOT_ISSUE_TYP.isON_CMPL(r.lot_issue_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else {
					if (column == columnRslt_lot_no) {
						if (MAC_LOT_ISSUE_TYP.isON_CMPL(r.lot_issue_typ())) {
							return MCMode.READ_ONLY;
						}
						if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())
								&& MAC_LOT_ISSUE_TYP.isON_INST(r.lot_issue_typ())
								&& MAC_LOT_NO_TYP.isMANUAL(r.lot_no_typ())) {
							return MCMode.REQUIRED;
						}
					}
					else if (column == columnRslt_sublot_no) {
						if (MAC_LOT_ISSUE_TYP.isON_CMPL(r.lot_issue_typ())) {
							return MCMode.READ_ONLY;
						}
						if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())
								&& MAC_LOT_ISSUE_TYP.isON_INST(r.lot_issue_typ())
								&& MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())) {
							return MCMode.REQUIRED;
						}
					}
					if (column == columnRslt_inst_dt) {
						return MCMode.REQUIRED;
					}
				}
				
				// 品目製造指図が登録済み（＝指図済み or 未指図の工程指図）
				if (!isNull(r.itm_mfg_inst_no())) {
					if (isReadOnlyColumnWhenItmInstExists(column)) {
						return MCMode.READ_ONLY;
					}
				}
				// 未指図の工程指図
				if (isYetOperInst(r)) {
					if (isYetOperReadOnlyColumn(column)) {
						return MCMode.READ_ONLY;
					}
				}
				// 工程単位製造指図の新規登録
				if (MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ())
						&& isNull(r.itm_mfg_inst_no())) {
					// 基準単位指図数量（工程）は指図数量から自動計算されるため入力不可
					if (column == columnRslt_oper_base_unit_qty) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_mes_flg) {
					if (isUpdActOperStatus()) {
						if (!r.mes_tgt_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
		
		protected boolean isMfgReadOnlyColumn(MCColumnConfig column) {
			if (column == columnRslt_rqst_dlv_rqst_dt
					|| column == columnRslt_rqst_dlv_rqst_hm
					|| column == columnRslt_po_locked_flg) {
				return true;
			}
			return false;
		}
		
		protected boolean isOutSrcReadOnlyColumn(MCColumnConfig column) {
			if (column == columnRslt_not_qty_rlt_flg
					|| column == columnRslt_ord_abort_flg
					|| column == columnRslt_base_unit_yield_qty) {
				return true;
			}
			return false;
		}

		protected boolean isOutSrcReadOnlyColumnWhenPoNotReged(MCColumnConfig column) {
			if (column == columnRslt_base_unit_inst_qty) {
				return true;
			}
			return false;
		}
		
		protected boolean isOutSrcReadOnlyColumnWhenPoReged(MCColumnConfig column) {
			if (column == columnRslt_mfg_loc_cd
					|| column == columnRslt_mfg_str_ln_cd
					|| column == columnRslt_mfg_str_ln_cd_none_flg
					|| column == columnRslt_bom_ptn
					|| column == columnRslt_strg_loc_cd
					|| column == columnRslt_strg_str_ln_cd
					|| column == columnRslt_strg_str_ln_cd_none_flg) {
				return true;
			}
			return false;
		}
		
		protected boolean isYetOperReadOnlyColumn(MCColumnConfig column) {
			if (isItmMfgInstColumn(column)) {
				return true;
			}
			return false;
		}
	}
	
	protected boolean isUpdInstStatus() {
		return isSame(getStatus(), UPD_INST_HDR) || isSame(getStatus(), UPD_INST_OPER);
	}
	
	protected boolean isUpdAprvStatus() {
		return isSame(getStatus(), UPD_ARPV_HDR);
	}

	/**
	 * 再展開が必要なカラムか否か
	 * @return
	 */
	protected boolean isReExtReqColumn(MCColumnConfig column) {
		// ※製造指図登録画面のクライアントや製造指図登録サービスにも同様の内容があるため、項目を変更する場合は注意すること
		if (column == columnRslt_mfg_loc_cd || column == columnRslt_oper_ptn
				|| column == columnRslt_bom_ptn || column == columnRslt_base_unit_inst_qty
				|| column == columnRslt_base_unit_yield_qty || column == columnRslt_sno1
				|| column == columnRslt_sno2 || column == columnRslt_sno3
				|| column == columnRslt_sno4 || column == columnRslt_st_schd_dt
				// 製造終了日と納入希望日はBOM展開では使用しないが、着手予定日を入力不可としているため、あわせて入力不可とする
				|| column == columnRslt_end_schd_dt || column == columnRslt_rqst_dlv_rqst_dt) {
			return true;
		}
		return false;
	}
	
	/**
	 * 品目製造指図が登録済みの行の場合に入力不可となるカラムか否か
	 * @param column
	 * @return
	 */
	protected boolean isReadOnlyColumnWhenItmInstExists(MCColumnConfig column) {
		if (Cnd_srch_mode_OPER.isSelected()) {
			// 工程単位製造指図の場合は日付を入力不可にしない
			if (column == columnRslt_st_schd_dt || column == columnRslt_end_schd_dt
					|| column == columnRslt_st_schd_hm
					|| column == columnRslt_end_schd_hm) {
				return false;
			}
		}
		else {
			// 品目単位製造指図の場合は日付が入力不可のため、時刻も入力不可
			if (column == columnRslt_st_schd_hm || column == columnRslt_end_schd_hm
					|| column == columnRslt_rqst_dlv_rqst_hm) {
				return true;
			}
		}
		// 指図数量、出来高予定数量が入力不可のため、数量連動不要も入力不可
		if (column == columnRslt_not_qty_rlt_flg) {
			return true;
		}
		if (isReExtReqColumn(column)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 未指図の工程指図行か否か
	 */
	protected boolean isYetOperInst(RsltR r) {
		return !isNull(r.oper_inst_no()) && isNull(r.mfg_inst_no());
	}
	
	protected Set<MCColumnConfig> _itmMfgInstColumn = null;
	
	protected Set<MCColumnConfig> getItmMfgInstColumn() {
		if (_itmMfgInstColumn == null) {
			Set<MCColumnConfig> ret = new HashSet<MCColumnConfig>();
			ret.add(columnRslt_not_qty_rlt_flg);
			ret.add(columnRslt_base_unit_inst_qty);
			ret.add(columnRslt_base_unit_yield_qty);
			ret.add(columnRslt_mfg_str_ln_cd);
			ret.add(columnRslt_mfg_str_ln_cd_none_flg);
			ret.add(columnRslt_strg_loc_cd);
			ret.add(columnRslt_strg_str_ln_cd);
			ret.add(columnRslt_strg_str_ln_cd_none_flg);
			ret.add(columnRslt_lot_no);
			ret.add(columnRslt_sublot_no);
			ret.add(columnRslt_sno1);
			ret.add(columnRslt_sno2);
			ret.add(columnRslt_sno3);
			ret.add(columnRslt_sno4);
			ret.add(columnRslt_itm_mfg_inst_sub_char1);
			ret.add(columnRslt_itm_mfg_inst_sub_char2);
			ret.add(columnRslt_itm_mfg_inst_sub_char3);
			ret.add(columnRslt_ord_abort_flg);
			_itmMfgInstColumn = ret;
		}
		return _itmMfgInstColumn;
	}

	protected boolean isItmMfgInstColumn(MCColumnConfig column) {
		return getItmMfgInstColumn().contains(column);
	}
	
	protected Set<MCColumnConfig> _mfgInstColumn = null;
	
	protected Set<MCColumnConfig> getMfgInstColumn() {
		if (_mfgInstColumn == null) {
			Set<MCColumnConfig> ret = new HashSet<MCColumnConfig>();
			ret.add(columnRslt_inst_dt);
			ret.add(columnRslt_inst_usr_cd);
			ret.add(columnRslt_inst_dpt_cd);
			ret.add(columnRslt_inst_rpt_rmrks);
			ret.add(columnRslt_intr_rmrks);
			ret.add(columnRslt_disp_pd);
			ret.add(columnRslt_mfg_inst_sub_char1);
			ret.add(columnRslt_mfg_inst_sub_char2);
			ret.add(columnRslt_mfg_inst_sub_char3);
			_mfgInstColumn = ret;
		}
		return _mfgInstColumn;
	}
	
	protected boolean isMfgInstColumn(MCColumnConfig column) {
		return getMfgInstColumn().contains(column);
	}
	
	protected void setAprvDptUsrDftVal() {
		AprvBulkSet_aprv_dt.setValue(getToday());
		if (isNull(getAprvBulkSetR().aprv_usr_cd())) {
			AprvBulkSet_aprv_usr_cd.setValue(mcframe.clientCore.sys.MCSys.user.ID());
		}
		AprvBulkSetPanel.focusFirstComponent();
	}
	
	protected void setAprvDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			AprvBulkSet_aprv_dt.setMode(MCMode.READ_ONLY);
			AprvBulkSet_aprv_usr_cd.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "0")) {
			setComponentInvisibleAllStatus(getInvisibleBeans());
		}
	}
	
	protected MCBeans[] getInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(new MCBeans[] {
				Cnd_ope_APRV, Cnd_ope_APRV_DEL, AprvBulkSetPanel
		}, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, AprvBulkSetPanel));
	}
	
	// 格納場所
	@Override
	public MCList getRslt_strg_loc_cd(MCRow row, MCEventInfo info) {
		int index = info.getEventIndex();
		setLocBind(row, index);
		return super.getRslt_strg_loc_cd(row, info);
	}
	
	@Override
	public MCList getRslt_oper_loc_cd(MCRow row, MCEventInfo info) {
		int index = info.getEventIndex();
		setLocBind(row, index);
		return super.getRslt_oper_loc_cd(row, info);
	}
	protected void setLocBind(MCRow row, int eventIndex) {
		RsltR rsltR = getRsltL().get(eventIndex);
		
		row.setStringNE(LocCols.$i_wg_cd , rsltR.mfg_loc_wg_cd());
		
		if (MSC_MFG_MTD_TYP.isEXTNL(rsltR.mfg_mtd_typ())) {
			// 外注の場合は、同一ＷＧであれば外注場所を設定可能
			row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.MFG_WG.value());
		}
		else {
			// 内製の場合は、格納先に外注場所を設定できない
			row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG.value());
		}
	}

	// 工程場所
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnRslt_oper_loc_cd
				|| beans == columnRslt_strg_loc_cd) {
			setLocBind(row, eventIndex);
		}
		return row;
	}

}