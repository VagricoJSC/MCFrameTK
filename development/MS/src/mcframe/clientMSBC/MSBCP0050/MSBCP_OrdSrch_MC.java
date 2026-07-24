package mcframe.clientMSBC.MSBCP0050;

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
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
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
import mcframe.clientCore.container.io.MCCsvBinaryReader;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_OrdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_OrdSrch_MC extends MSBCP_OrdSrch_MC_A implements IfListRegPanel, MCResultViewerWithFile {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_OrdSrch_MC() {
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
	public MSBCP_OrdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Srch01Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0050_Srch01Caller(P p, B b) {
			super(p, b);
		}

		protected void initCaller() {
			super.initCaller();
			// 業務データD.L.用
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		/**
		 * 検索条件のチェック処理
		 * @param msgList
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_po_schd_dt_fr, Cnd_po_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_st_schd_dt_fr, Cnd_mfg_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_end_schd_dt_fr, Cnd_mfg_end_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_gi_schd_dt_fr, Cnd_gi_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_strg_schd_dt_fr, Cnd_strg_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_accpt_schd_dt_fr, Cnd_accpt_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_st_schd_dt_fr, Cnd_insp_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_end_schd_dt_fr, Cnd_insp_end_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_avl_schd_dt_fr, Cnd_avl_schd_dt_to));
			msgList.addAll(checkAtLeastOne(StsPanel));
			msgList.addAll(checkAtLeastOne(OrdTypPanel));
			msgList.addAll(checkAtLeastOne(FixFlgPanel));
			msgList.addAll(checkAtLeastOne(OrdRcvPanel));
			msgList.addAll(checkAtLeastOne(OrdSndPanel));
			msgList.addAll(checkAtLeastOne(SchedLinkPanel));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUpdStatusByOpe();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatusByOpe();
		}
	}

	/**
	 * [MS_MSBCL0050_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd01Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0050_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0050_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd02Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0050_Upd02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();

			if (getBtnR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
				// 非同期実行結果復元時のステータス設定用に、実行前の行ステータスを保持。
				setStatusFlg(getRsltL());
			}
		}

		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			return csvOutFromContainer(getContainersForOutCsv());
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (isAsync()) {
				setFIX_IStatus();
			}
			else if (isAsyncRsltMode()) {
				setUPD_FIXStatus();
				Ctrl_ctrl_PPanel.expand(false);
			}
		}
	}

	/**
	 * [MS_MSBCL0050_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd03Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Upd03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0050_Upd03Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0050_Upd04]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd04Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Upd04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0050_Upd04Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0050_Upd05]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd05Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Upd05Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0050_Upd05Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0050_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Del01Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL0050_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0050_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Imp01Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBCL0050_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			if (getBtnR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
			}
		}

		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			return csvOutFromContainer(getContainersForOutCsv());
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
		protected void handleMCEx(MCException ex){
			super.handleMCEx(ex);
			setFIX_IStatus();
		}
	}
	@Override
	public String getResultViewParamID(MCResultInfo info) {
		return null;
	}

	/***
	 * CSV出力用コンテナリスト取得
	 * 
	 * @return CSV出力用コンテナリスト
	 */
	protected List<MCList<?>> getContainersForOutCsv() {
		List<MCList<?>> containers = new ArrayList<MCList<?>>();

		// 検索条件
		MCList<CndR> cndL = MCList.create(CndR.class);
		cndL.add(getCndR());
		containers.add(cndL);

		// 明細
		containers.add(getRsltL());

		return containers;
	}

	@Override
	public boolean notificationSetResultViewParam(MCCallerPanelBridge bridge, MCBinary... files) {
		boolean result = false;

		if (!(bridge instanceof MS_MSBCL0050_Imp01Bridge) 
				&& !(bridge instanceof MS_MSBCL0050_Ins01Bridge)
				&& !(bridge instanceof MS_MSBCL0050_Upd02Bridge)) {
			return result;
		}

		if (files == null || files.length < 2) {
			return result;
		}

		MCMessageList errMsgL = new MCMessageList();

		// 検索条件
		MCCsvBinaryReader<CndR> cndReader = 
				MCCsvBinaryReader.createCsvBinaryReader(MCList.create(CndR.class), files[0]);
		errMsgL.addAll(cndReader.read());

		// 明細
		MCCsvBinaryReader<RsltR> rsltReader = 
				MCCsvBinaryReader.createCsvBinaryReader(MCList.create(RsltR.class), files[1]);
		errMsgL.addAll(rsltReader.read());

		if (errMsgL.isEmpty()) {
			if (bridge instanceof MS_MSBCL0050_Imp01Bridge) {
				openByAsyncRslt((MS_MSBCL0050_Imp01Bridge) bridge,
								cndReader.getDestFirstRow(), 
								rsltReader.getDestList());
			}
			else if (bridge instanceof MS_MSBCL0050_Ins01Bridge) {
				openByAsyncRslt((MS_MSBCL0050_Ins01Bridge) bridge,
								cndReader.getDestFirstRow(), 
								rsltReader.getDestList());
			}
			else if (bridge instanceof MS_MSBCL0050_Upd02Bridge) {
				openByAsyncRslt((MS_MSBCL0050_Upd02Bridge) bridge,
								cndReader.getDestFirstRow(), 
								rsltReader.getDestList());
			}
		}
		else {
			message(errMsgL);
		}

		return result;
	}

	/***
	 * 画面起動（ファイル入力オペレーション非同期実行用）
	 * 
	 * @param bridge ファイル入力オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param rsltFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBCL0050_Imp01Bridge bridge, 
			CndR cndR, MCList<RsltR> rsltFileL) {
		openPanel(getModuleID(), getScreenID(), T1, null, bridge, cndR, rsltFileL);
	}

	/***
	 * 画面起動（登録オペレーション非同期実行用）
	 * 
	 * @param bridge 登録オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param rsltFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBCL0050_Ins01Bridge bridge, 
			CndR cndR, MCList<RsltR> rsltFileL) {
		openPanel(getModuleID(), getScreenID(), T2, null, bridge, cndR, rsltFileL);
	}

	/***
	 * 画面起動（更新（確定）オペレーション非同期実行用）
	 * 
	 * @param bridge 更新（確定）オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param rsltFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBCL0050_Upd02Bridge bridge, 
			CndR cndR, MCList<RsltR> rsltFileL) {
		openPanel(getModuleID(), getScreenID(), T3, null, bridge, cndR, rsltFileL);
	}

	/*** 画面起動時のfillSpaceをスキップするか */
	protected boolean _isSkipFillSpaceForOpen = false;

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		MCException ex = null;
		if (T1 == openTyp) {
			screenClear();

			MS_MSBCL0050_Imp01Bridge b = (MS_MSBCL0050_Imp01Bridge) args[0];
			restoreContainer(b.down0(), 0, args);
			ex = getParamEx(b.param());

			if(getParamEx(b.param()) == null) {
				MS_MSBCL0050_Imp01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Imp01Bridge> caller = createMS_MSBCL0050_Imp01();
				restoreCaller(caller, b);
			}
		}
		else if (T2 == openTyp) {
			screenClear();

			MS_MSBCL0050_Ins01Bridge b = (MS_MSBCL0050_Ins01Bridge) args[0];
			restoreContainer(b.down0(), 0, args);
			ex = getParamEx(b.param());

			if(getParamEx(b.param()) == null) {
				MS_MSBCL0050_Ins01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Ins01Bridge> caller = createMS_MSBCL0050_Ins01();
				restoreCaller(caller, b);
			}
		}
		else if (T3 == openTyp) {
			screenClear();

			MS_MSBCL0050_Upd02Bridge b = (MS_MSBCL0050_Upd02Bridge) args[0];
			restoreContainer(b.down0(), 0, args);
			ex = getParamEx(b.param());

			if(getParamEx(b.param()) == null) {
				MS_MSBCL0050_Upd02Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd02Bridge> caller = createMS_MSBCL0050_Upd02();
				restoreCaller(caller, b);
				setStatusForNoCheckR(getRsltL());
			}
		}
		else {
			return;
		}

		if (ex == null) {
			_isSkipStatusClear = true;
		}
		else {
			setStatusForAsyncEx();
		}
		_isSkipFillSpaceForOpen = true;
	}

	/***
	 * ステータスＦＬＧ設定
	 * 
	 * @param rsltL 明細リスト
	 */
	protected void setStatusFlg(MCList<RsltR> rsltL) {
		for (RsltR rsltR : rsltL) {
			if (rsltR.upd_tgt_flg()) {
				rsltR.upd_tgt_flg(false);
			}
			rsltR.modify_tgt_flg(false);

			if (rsltR.check()) {
				rsltR.upd_tgt_flg(true);
			}

			if (rsltR.isStatusModify()) {
				rsltR.modify_tgt_flg(true);
			}
		}
	}

	/***
	 * 未チェック行ステータス設定
	 * 
	 * @param rsltL 明細リスト
	 */
	protected void setStatusForNoCheckR(MCList<RsltR> rsltL) {
		for (RsltR rsltR : rsltL) {
			if (rsltR.upd_tgt_flg()) {
				continue;
			}

			if (rsltR.modify_tgt_flg()) {
				rsltR.setStatus(Status.MODIFY);
				rsltR.check(false);
			}
		}
	}

	@Override
	protected void afterOpenByInitParam(String openTyp, MCRow bind, Object... args) {
		super.afterOpenByInitParam(openTyp, bind, args);

		MCException ex = null;
		if (T1 == openTyp) {
			MS_MSBCL0050_Imp01Bridge b = (MS_MSBCL0050_Imp01Bridge) args[0];
			ex = getParamEx(b.param());
		}
		else if (T2 == openTyp) {
			MS_MSBCL0050_Ins01Bridge b = (MS_MSBCL0050_Ins01Bridge) args[0];
			ex = getParamEx(b.param());
		}
		else if (T3 == openTyp) {
			MS_MSBCL0050_Upd02Bridge b = (MS_MSBCL0050_Upd02Bridge) args[0];
			ex = getParamEx(b.param());
		}
		else {
			return;
		}

		if (ex != null) {
			dialog(ex);
		}
		else if (_asyncResultMsg != null) {
			dialog(_asyncResultMsg);
			_asyncResultMsg = null;
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

	/***
	 * コンテナ値設定（ファイル入力オペレーション非同期実行用）
	 * 
	 * @param downL 下り電文リスト
	 * @param paramIndex 下り電文リスト
	 * @param args 画面起動引数
	 */
	protected void restoreContainer(MCList<RsltR> downL, int paramIndex, Object... args) {
		// 検索条件
		CndR srcCndR = (CndR) args[1];
		CndR.copyvalue(getCndR(), srcCndR);

		// 明細
		MCList<RsltR> rsltL = (MCList<RsltR>) args[2];
		getRsltL().setAll(rsltL);
		setRowIndexForUp(rsltL, paramIndex);

		// 非同期
		getBtnR().async_flg(true);
	}

	/*** 非同期実行終了メッセージ */
	protected MCMessage _asyncResultMsg = null;

	/***
	 * ファイル入力オペレーション通信後処理実行
	 * 
	 * @param caller ファイル入力オペレーションCaller
	 * @param b ファイル入力オペレーションBridge
	 */
	protected void restoreCaller(
			MS_MSBCL0050_Imp01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Imp01Bridge> caller,
			MS_MSBCL0050_Imp01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());

		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, getParamMsg(b.param()));
	}

	/***
	 * 登録オペレーション通信後処理実行
	 * 
	 * @param caller 登録オペレーションCaller
	 * @param b ファイル入力オペレーションBridge
	 */
	protected void restoreCaller(
			MS_MSBCL0050_Ins01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Ins01Bridge> caller,
			MS_MSBCL0050_Ins01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());

		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, getParamMsg(b.param()));
	}

	/***
	 * 更新（確定）オペレーション通信後処理実行
	 * 
	 * @param caller 更新（確定）オペレーションCaller
	 * @param b ファイル入力オペレーションBridge
	 */
	protected void restoreCaller(
			MS_MSBCL0050_Upd02Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd02Bridge> caller,
			MS_MSBCL0050_Upd02Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());

		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, getParamMsg(b.param()));
	}

	/***
	 * 上り電文用INDEX設定
	 * 
	 * @param srcL CSVファイル取込データ
	 * @param paramIndex paramインデックス
	 * @return INDEX設定済上り電文リスト
	 */
	protected MCList<RsltR> setRowIndexForUp(MCList<RsltR> srcL, int paramIndex) {
		MCList<RsltR> tgtL = srcL.subList(RsltR.$check, true);

		// paramIndexとparamRowIndexを設定
		srcL.setParamIndex(paramIndex);
		for (int i = 0; i < tgtL.size(); i++) {
			RsltR r = tgtL.get(i);
			r.setParamIndex(paramIndex);
			r.setParamRowIndex(i);
		}

		return tgtL;
	}

	/***
	 * パラメータから例外取得
	 * 
	 * @param param パラメータ
	 * @return 発生例外
	 */
	protected MCException getParamEx(MCParam param) {
		MCException result = null;

		if (!param.getExceptionParam().isEmpty()) {
			result = param.getExceptionParam().getException();
		}

		return result;
	}

	/***
	 * パラメータからメッセ―ジ取得
	 * 
	 * @param param パラメータ
	 * @return メッセージリスト
	 */
	protected MCMessageList getParamMsg(MCParam param) {
		MCMessageList result = null;

		if (!param.getMessageParam().isEmpty()) {
			result =param.getMessageParam().getMessage();
		}

		return result;
	}

	/***
	 * 非同期実行例外発生時のステータス設定
	 * 
	 */
	protected void setStatusForAsyncEx() {
		setFIX_IStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	/**
	 * [MS_MSBCL0050_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Ins01Caller<P extends MSBCP_OrdSrch, B extends MS_MSBCL0050_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0050_Ins01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();

			if (getBtnR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
			}
		}

		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();
			return csvOutFromContainer(getContainersForOutCsv());
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (isAsync()) {
				setFIX_IStatus();
			}
			else if (isAsyncRsltMode()) {
				setINSStatus();
				Ctrl_ctrl_PPanel.expand(false);
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0050_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0050_Srch01().execDL();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0040(MCEventInfo info) {
		// オーダ登録画面
		openMsbcp0040();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0080(MCEventInfo info) {
		// 品目オーダ進捗一覧
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0080ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0090(MCEventInfo info) {
		// 工程オーダ進捗一覧画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0090ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0070(MCEventInfo info) {
		// オーダ展開情報照会画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0070ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0060(MCEventInfo info) {
		// オーダ展開情報照会画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0060ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	//DCと画面遷移ボタンで共有
	protected void openMsbcp0040() {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0040ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	/** 遷移先(オーダ登録画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0040ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0040");
		mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg destP = 
			(mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg) so.getPanel();
		mcframe.clientMSBC.MSBCP0040.CndR cnd =
			mcframe.clientMSBC.MSBCP0040.CndR.create();

		String opeVal = destP.Cnd_ope_SRCH.getActionCommand();
		if (MSC_ITM_ORD_STS_TYP.isOPN(r.itm_ord_sts_typ())
				|| MSC_ITM_ORD_STS_TYP.isSAV(r.itm_ord_sts_typ())) {
			opeVal = destP.Cnd_ope_UPD.getActionCommand();
		}
		cnd.ope(opeVal);
		cnd.itm_ord_no(r.itm_ord_no());
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	/** 遷移先(品目オーダ進捗一覧画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0080ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0080");
		mcframe.clientMSBC.MSBCP0080.CndR cnd =
				mcframe.clientMSBC.MSBCP0080.CndR.create();

		cnd.itm_ord_no(r.itm_ord_no());
		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	/** 遷移先(工程オーダ進捗一覧画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0090ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0090");
		mcframe.clientMSBC.MSBCP0090.CndR cnd =
			mcframe.clientMSBC.MSBCP0090.CndR.create();

		cnd.itm_ord_no(r.itm_ord_no());
		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	/** 遷移先(オーダ展開情報照会画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0070ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0070");
		mcframe.clientMSBC.MSBCP0070.MSBCP_OrdExtInfSrch destP = 
			(mcframe.clientMSBC.MSBCP0070.MSBCP_OrdExtInfSrch) so.getPanel();
		mcframe.clientMSBC.MSBCP0070.CndR cnd =
			mcframe.clientMSBC.MSBCP0070.CndR.create();

		String opeVal = destP.Cnd_ope_ORD.getActionCommand();
		cnd.ope(opeVal);
		cnd.itm_ord_no(r.itm_ord_no());
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	/** 遷移先(オーダ逆展開情報照会画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0060ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0060");
		mcframe.clientMSBC.MSBCP0060.MSBCP_OrdRevExtInfSrch destP = 
			(mcframe.clientMSBC.MSBCP0060.MSBCP_OrdRevExtInfSrch) so.getPanel();
		mcframe.clientMSBC.MSBCP0060.CndR cnd =
			mcframe.clientMSBC.MSBCP0060.CndR.create();

		String opeVal = destP.Cnd_ope_ORD.getActionCommand();
		cnd.ope(opeVal);
		cnd.itm_ord_no(r.itm_ord_no());
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
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
		callMS_MSBCL0050_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd2]の押下時の処理
	 */
	@Override
	public void doBtn_upd2(MCEventInfo info) {
		callMS_MSBCL0050_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[upd3]の押下時の処理
	 */
	@Override
	public void doBtn_upd3(MCEventInfo info) {
		callMS_MSBCL0050_Upd03();
	}

	/**
	 * Panel[Btn]のボタン[upd4]の押下時の処理
	 */
	@Override
	public void doBtn_upd4(MCEventInfo info) {
		callMS_MSBCL0050_Upd04();
	}

	/**
	 * Panel[Btn]のボタン[upd5]の押下時の処理
	 */
	@Override
	public void doBtn_upd5(MCEventInfo info) {
		callMS_MSBCL0050_Upd05();
	}

	/**
	 * Panel[Btn]のボタン[ins01]の押下時の処理
	 */
	@Override
	public void doBtn_ins01(MCEventInfo info) {
		callMS_MSBCL0050_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL0050_Del01();
	}

	// ----------------------------------------------------

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltTableCellConfig());
	}

	@Override
	protected void setupParts() {
		super.setupParts();		
		setupPartsSub();
	}

	protected void setupPartsSub() {	
		Cnd_ver_no_p_PPanel.setRelateBeans(
				Cnd_itm_cd,
				Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3,
				null, null);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_inst_qty_p_PPanel.setRelateBeans(
				columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_yield_schd_qty_p_PPanel.setRelateBeans(
				columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_inst_cont_qty_p_PPanel.setRelateBeans(
				columnRslt_cont_fctr_flg,
				columnRslt_inst_qty,
				columnRslt_std_cont_fctr,
				null,
				columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_yield_cont_qty_p_PPanel.setRelateBeans(
				columnRslt_cont_fctr_flg,
				columnRslt_yield_schd_qty,
				columnRslt_std_cont_fctr,
				null,
				columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(
				columnRslt_itm_cd,
				columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
				null, null, null, null);
	}

	/** イベントリスナー設定 */
	@Override
	protected void listenerInit() {
		super.listenerInit();
		//NC
		columnRslt_inst_qty.addNCListener(this);
		columnRslt_yield_schd_qty.addNCListener(this);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	/** 画面起動時の初期化処理 */
	protected void valueInitSub() {
		// 操作種別
		setInitOpeTyp();
		// 品目状況
		setDefStsFlgByOpe();
		// オーダ区分、手配不許可フラグ
		setInitOrdTyp();
		setInitFixFlg();
		// オーダ受信対象フラグ、オーダ送信対象フラグ
		setInitOrdIfFlg();
		
		setInitSchedulerLinkageFlg();
	}

	/** 操作種別の初期値設定 */
	protected void setInitOpeTyp(){
		setValueEx(Cnd_ope_Group, Cnd_ope_SAV.getActionCommand());
	}

	/** 品目状況条件の初期値設定 */
	protected void setDefStsFlgByOpe() {
		setBoolean(StsPanel, false);
		if (Cnd_ope_SAV.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
		}
		else if (Cnd_ope_FIX.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_sav_flg, true);
		}
		else if (Cnd_ope_CANSAV.isSelected()) {
			setValueEx(Cnd_fix_flg, true);
		}
		else if (Cnd_ope_CANFIX.isSelected()) {
			setValueEx(Cnd_sav_flg, true);
			setValueEx(Cnd_fix_flg, true);
		}
		else if (Cnd_ope_MOD.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_sav_flg, true);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_sav_flg, true);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_sav_flg, true);
			setValueEx(Cnd_fix_flg, true);
			setValueEx(Cnd_part_inst_flg, true);
			setValueEx(Cnd_inst_flg, true);
			setValueEx(Cnd_cmpl_flg, true);
		}
		else if (Cnd_ope_IMP.isSelected()) {
			//検索しないので意味なし
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_sav_flg, true);
			setValueEx(Cnd_fix_flg, true);
			setValueEx(Cnd_part_inst_flg, true);
			setValueEx(Cnd_inst_flg, true);
			setValueEx(Cnd_cmpl_flg, true);
		}
	}

	/** オーダ区分検索条件の初期値設定 */
	protected void setInitOrdTyp() {
		getCndR().mfg_flg(true);
		getCndR().purc_flg(true);
		getCndR().outsrc_flg(true);
		getCndR().xfr_flg(true);
		getCndR().wg_xfr_flg(true);
	}

	/** 手配許可フラグ検索条件の初期値設定 */
	protected void setInitFixFlg() {
		getCndR().true_not_fix_flg(true);
		getCndR().false_not_fix_flg(true);
	}
	/** オーダ受信,送信対象フラグ検索条件の初期値設定 */
	protected void setInitOrdIfFlg() {
		getCndR().ord_rcv_tgt_flg(true);
		getCndR().not_ord_rcv_tgt_flg(true);
		getCndR().ord_snd_tgt_flg(true);
		getCndR().not_ord_snd_tgt_flg(true);
	}
	
	protected void setInitSchedulerLinkageFlg() {
		getCndR().before_frozen_flg(true);
		getCndR().frozen_flg(true);
	}
	
	protected void setSchedulerLinkageFlgByOpe() {
		if (Cnd_ope_FIX.isSelected()) {
			setValueEx(Cnd_before_frozen_flg, false);
			setValueEx(Cnd_frozen_flg, true);
		}
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable && !Cnd_ope_IMP.isSelected()) {
			openMsbcp0040();
		}
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if(isChanged()){
			return confirmRegDataClear();
		}
		return true;
	}

	// NCイベント
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnRslt_inst_qty) {
			doRslt_inst_qty_NC(info);
		}
		else if (nc == columnRslt_yield_schd_qty) {
			doRslt_yield_schd_qty_NC(info);
		}
	}

	protected void doRslt_inst_qty_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		//指図数→出来高数
		if (!isNull(r) && !MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())){
			setValueEx(columnRslt_yield_schd_qty, index, r.inst_qty());
		}
	}

	protected void doRslt_yield_schd_qty_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		//出来高数→指図数
		if (!isNull(r) && !MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())){
			setValueEx(columnRslt_inst_qty, index, r.yield_schd_qty());
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub(info);
	}

	/** 種別切替後のイベント */
	public void doCnd_ope_NCSub(MCEventInfo info) {
		// 一覧クリア
		clearContainers(getRsltL());
		// 検索前ステータス
		setSrchStatusByOpe();
		// ステータスカラム
		setStatusColumn();
		// 品目状況
		setDefStsFlgByOpe();
		// 非同期フラグ
		setDefAsyncFlgByOpe();
		
		setSchedulerLinkageFlgByOpe();
	}

	protected void setDefAsyncFlgByOpe() {
		if (!Cnd_ope_IMP.isSelected()) {
			setValueEx(Btn_async_flg, false);
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
		doRslt_check_NCSub(r);
	}

	// 選択チェックオン時
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		doRslt_check_NCSub((RsltR)srcRow);
	}

	/** 選択カラムがチェックオンになった時の初期値設定 */
	public void doRslt_check_NCSub(RsltR srcRow) {
		//特になし
	}

	protected void setSrchStatusByOpe() {
		if (Cnd_ope_SAV.isSelected()) {
			setSRCH_SAVStatus();
		}
		else if (Cnd_ope_FIX.isSelected()) {
			setSRCH_FIXStatus();
		}
		else if (Cnd_ope_CANSAV.isSelected()) {
			setSRCH_CANSAVStatus();
		}
		else if (Cnd_ope_CANFIX.isSelected()) {
			setSRCH_CANFIXStatus();
		}
		else if (Cnd_ope_MOD.isSelected()) {
			setSRCH_MODStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		else if (Cnd_ope_IMP.isSelected()) {
			setIMP_FILEStatus();
		}


		if (Cnd_ope_IMP.isSelected()){
			//fillSpace();
			Ctrl_ctrl_PPanel.expand(false);
			Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
		}
		else{
			Ctrl_ctrl_PPanel.expand(true);
			setDefaultMode(Ctrl_ctrl_PPanel.Ope_srch);
		}
	}

	protected void setUpdStatusByOpe() {
		if (Cnd_ope_SAV.isSelected()) {
			setUPD_SAVStatus();
		}
		else if (Cnd_ope_FIX.isSelected()) {
			setUPD_FIXStatus();
		}
		else if (Cnd_ope_CANSAV.isSelected()) {
			setUPD_CANSAVStatus();
		}
		else if (Cnd_ope_CANFIX.isSelected()) {
			setUPD_CANFIXStatus();
		}
		else if (Cnd_ope_MOD.isSelected()) {
			setUPD_MODStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setUPD_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);

		if (Cnd_ope_IMP.isSelected()){
			Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
		}
		else{
			setDefaultMode(Ctrl_ctrl_PPanel.Ope_srch);
		}
	}

	@Override
	public void setSRCH_SAVStatus() {
		super.setSRCH_SAVStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_FIXStatus() {
		super.setSRCH_FIXStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_CANSAVStatus() {
		super.setSRCH_CANSAVStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_CANFIXStatus() {
		super.setSRCH_CANFIXStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_MODStatus() {
		super.setSRCH_MODStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setSrchStatusCom();
	}

	@Override
	public void setIMP_FILEStatus() {
		super.setIMP_FILEStatus();
		setSrchStatusCom();
	}

	protected void setSrchStatusCom() {
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setUPD_SAVStatus() {
		super.setUPD_SAVStatus();
		setUpdStatusCom();
	}

	@Override
	public void setUPD_FIXStatus() {
		super.setUPD_FIXStatus();
		setUpdStatusCom();
	}

	@Override
	public void setUPD_CANSAVStatus() {
		super.setUPD_CANSAVStatus();
		setUpdStatusCom();
	}

	@Override
	public void setUPD_CANFIXStatus() {
		super.setUPD_CANFIXStatus();
		setUpdStatusCom();
	}

	@Override
	public void setUPD_MODStatus() {
		super.setUPD_MODStatus();
		setUpdStatusCom();
	}

	@Override
	public void setUPD_DELStatus() {
		super.setUPD_DELStatus();
		setUpdStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setUpdStatusCom();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setUpdStatusCom();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		if (Cnd_ope_IMP.isSelected()){
			Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
		}
		else{
			setDefaultMode(Ctrl_ctrl_PPanel.Ope_srch);
		}
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD_SAV) 
				|| isSame(getStatus(), UPD_FIX)
				|| isSame(getStatus(), UPD_CANSAV)
				|| isSame(getStatus(), UPD_CANFIX)
				|| isSame(getStatus(), UPD_MOD)
				|| isSame(getStatus(), UPD_DEL);
	}

	protected void setUpdStatusCom() {
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (!isNull(r) && !Cnd_ope_IMP.isSelected()) {
			setDefaultMode(Btn_open_MSBCP0040);
			setDefaultMode(Btn_open_MSBCP0080);
			setDefaultMode(Btn_open_MSBCP0070);
			setDefaultMode(Btn_open_MSBCP0060);

			if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())) {
				setDefaultMode(Btn_open_MSBCP0090);
				
			}
			else {
				Btn_open_MSBCP0090.setMode(MCMode.DISABLE);
			}
		}
		else {
			//setDefaultMode(BtnPanel);
			Btn_open_MSBCP0040.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0080.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0090.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0070.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0060.setMode(MCMode.DISABLE);
		}
	}

	protected void setStatusColumn() {
		if (Cnd_ope_DEL.isSelected()) {
			RsltTable.setStatusColumnVisible(false);
		}
		else {
			RsltTable.setStatusColumnVisible(true);
		}
	}

	protected RsltTableCellConfig crtRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	protected class RsltTableCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (isUpdStatus()) {
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				if(isSame(getStatus(), UPD_FIX)) {
					if(column == columnRslt_check){
						// 手配不許可のオーダは確定不可
						if(r.not_fix_flg()){
							return MCMode.READ_ONLY;
						}
					}
				}
				else if(isSame(getStatus(), UPD_DEL)) {
					if(column == columnRslt_check){
						// 工程保存の場合は取り消し不可
						if(r.oper_sav_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if(isSame(getStatus(), UPD_MOD)) {
					if(r.oper_sav_flg()) {
						return MCMode.READ_ONLY;
					}
					if (column == columnRslt_inst_qty
							|| column == columnRslt_yield_schd_qty
							|| column == columnRslt_intr_rmrks
							|| column == columnRslt_sub_char1
							|| column == columnRslt_sub_char2
							|| column == columnRslt_sub_char3) {
						// 
					}
					else if (column == columnRslt_po_schd_dt
							|| column == columnRslt_accpt_schd_dt) {
						// 発注予定日、検収予定日
						if(!MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
								&& !MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnRslt_mfg_st_schd_dt
							|| column == columnRslt_mfg_end_schd_dt) {
						// 製造着手・終了予定日
						if(!MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
								&& !MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnRslt_gi_schd_dt) {
						// 出庫予定日
						if(!MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())
								&& !MSC_ITM_ORD_TYP.isWG_XFR(r.itm_ord_typ())){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnRslt_insp_st_schd_dt
							|| column == columnRslt_insp_end_schd_dt) {
						// 検査着手・終了予定日
						if(!r.insp_flg()){
							return MCMode.READ_ONLY;
						}
					}
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
		callMS_MSBCL0050_Imp01();
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		if (!_isSkipFillSpaceForOpen) {
			fillSpace();
		}
	}

	protected void fillSpace() {
		if (Cnd_ope_IMP.isSelected()) {
			RsltTable.fillSpace();
		}
	}

	@Override
	public MCList<?> getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList<?> list =  super.getList(combo, row, info);
		if (combo == Cnd_ord_gnrt_typ) {
			// オーダ生成区分=計画外は検索対象外のため、検索条件からも除く
			list = list.subList(r -> !MSC_ORD_GNRT_TYP.isUPLND(r.getStringNE(MSC_ORD_GNRT_TYP.$VALUE)));
		}
		return list;
	}
}