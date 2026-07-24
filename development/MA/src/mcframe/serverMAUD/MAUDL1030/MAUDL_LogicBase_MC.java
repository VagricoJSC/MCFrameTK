package mcframe.serverMAUD.MAUDL1030;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.HashMap;

import mcframe.commonCore.sys.MCFactory;

import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;

import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;

import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.mcjdbc.MCCursor;

import mcframe.serverCore.requester.cooperate.MCCooperateInvokeManager;
import mcframe.serverCore.requester.MCServerThreadManager;

import mcframe.serverMAUC.MAUCL5030.MAUCL_IfCmnService;
import mcframe.serverMAUC.MAUCL5030.MultiExec_Upd01_DtlR;
import mcframe.serverMAUC.MAUCL5030.MultiExec_Upd02_DtlR;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUDL_LogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUDL_LogicBase_MC extends MAUDL_LogicBase_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * BILinkのDBにレコードを登録する処理を実行する。<br>
	 */
	public class Upd01 extends MAUDL_LogicBase_MC_A.Upd01 {
		
		/** ロガー作成ＦＬＧ **/
		protected boolean _crtNewLogger;
		/** 例外が発生したかどうかのＦＬＧ */
		protected boolean _exceptionFlg;
		/** 採番を行ったデータNo */
		protected MCNumber _issueDataNo;
		
		/** 処理対象の会社ＣＤ */
		protected List<String> _multiCompanyCdL = new ArrayList<String>();
		/** 登録を行った合計レコード数. */
		protected MCNumber _registerCnt = new MCNumber(0);
		
		// 以下の項目を子クラスにてセットする
		/** Upd02のモジュールID. */
		protected String _upd02ModuleId;
		/** Upd02のロジックID */
		protected String _upd02LogicId;
		/** Upd02のオペレーションID */
		protected String _upd02OperationId;
		
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			try {
				// 初期化
				initProc();
				// 開始ログを出力
				writeStartLog();
				// 共通ロジックベースUpd02（メイン処理）を継承した送信IFサービスのオペレーションを設定
				setUpd02Operation();
				// 権限のある会社ＣＤ一覧を取得
				_multiCompanyCdL.addAll(getTgtCoCd());
				// 共通チェック処理
				chkUpItemsCommon();
				// 個別チェック処理
				chkUpItemsIndividual();
				// 入力チェックエラーハンドリング
				if (hasErrChkUpItems()) {
					// 入力チェックエラーありの場合は、処理をやめる
					return;
				}
				// データＮＯ採番
				issueDataNo();
				// 共通ロジックベースUpd02（メイン処理）を継承したオペレーションを実行
				execUpd02();
				// 登録件数判定
				if (isExistTgt()) {
					// 送受信IF作成
					registerSdrvIf();
				}
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				// 終了ログを出力
				writeEndLog();
				
				// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
				if (_crtNewLogger) {
					logger().close();
				}
			}
		}
		
		/**
		 * 初期化処理
		 */
		protected void initProc() {
			// ログの初期化
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			getConcurrentLogger();
		}
		
		/**
		 * 処理対象の会社ＣＤを取得
		 * @return 処理対象の会社ＣＤのリスト
		 */
		protected List<String> getTgtCoCd() {
			List<String> cdL = new ArrayList<String>();
			
			if (!isNull(up0().co_cd())) {
				// 上り電文に会社ＣＤ有りの場合は、その会社ＣＤのみを使用する
				cdL.add(up0().co_cd());
			}
			else {
				// ログインユーザが実行可能な会社のリストを取得する
				MCList<? extends MCRow> execCoL = MCCooperateInvokeManager.getExecutableCoList(_upd02ModuleId, _upd02LogicId, _upd02OperationId);
				List<String> coCdL = execCoL.getString(MCCooperateInvokeManager.$co_cd);
				cdL.addAll(coCdL);
			}
			
			return cdL;
		}
		
		/**
		 * 共通の入力チェック
		 */
		protected void chkUpItemsCommon() {
			// ＩＦ処理区分
			MCMessagePool.addAll(check(up0(), Upd01_DtlR.$if_proc_typ, new FXUCL_RequiredValidater()));
			// 外部システムＣＤ
			chkExistExtSysCd(up0().ext_sys_cd());
			// 会社CD
			if (!isNull(up0().co_cd())) {
				if (!_multiCompanyCdL.contains(up0().co_cd())) {
					MCMessagePool.add(new MCMessage(MAUDL0411, up0().co_cd()));
				}
			}
		}
		
		/**
		 * 外部システムＣＤに対する入力チェック
		 * @param extSysCd 外部システムＣＤ
		 */
		protected void chkExistExtSysCd(String extSysCd) {
			// 必須チェック
			MCMessageList requiredErrMsgL = check(up0(), Upd01_DtlR.$ext_sys_cd, new FXUCL_RequiredValidater());
			if (!requiredErrMsgL.isEmpty()) {
				MCMessagePool.addAll(requiredErrMsgL);
				return;
			}
			
			// マスタ存在チェック
			MCRow bind = MCRow.create();
			bind.setStringNE(MAM_EXT_SYS_R.$ext_sys_cd, extSysCd);
			MAM_EXT_SYS_R srchRslt = MAM_EXT_SYS_R.create();
			if (dbSelectKey("MAUDL1030_MAM_EXT_SYS_S01", srchRslt, MAM_EXT_SYS_R.create(), bind) < 1) {
				MCMessagePool.add(new MCMessage(MAUDL0412, extSysCd));
				return;
			}
			
			// 外部システム区分チェック
			if (!MAC_EXT_SYS_TYP.isBI(srchRslt.ext_sys_typ())) {
				MCMessagePool.add(new MCMessage(MAUDL0413, extSysCd, srchRslt.ext_sys_typ()));
				return;
			}
		}
		
		/**
		 * 個別の入力チェック
		 * 子クラスにて実装する
		 */
		protected void chkUpItemsIndividual() {
			
		}
		
		/**
		 * 入力チェック処理でNGがある場合の処理
		 * @return true  : チェックNGあり
		 *         false : チェックNGなし
		 */
		protected boolean hasErrChkUpItems() {
			return hasErrMsg();
		}
		
		/**
		 * Upd02のモジュールＩＤ、ロジックＩＤ、オペレーションＩＤをセット
		 * 子クラスにて実装する
		 */
		protected void setUpd02Operation() {
			
		}
		
		/**
		 * データNoの発番処理
		 */
		protected void issueDataNo() {
			// データNOを発番する
			_issueDataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
		}
		
		/**
		 * Upd02を実行
		 */
		protected void execUpd02() {
			
			Map<String, MCOperation> operationMap = new HashMap<String, MCOperation>();
			for (String coCd : _multiCompanyCdL) {
				MCOperation ope = createOperation(_upd02ModuleId, _upd02LogicId, _upd02OperationId, MCOperation.class);
				((MCRow)ope.up(0)).setByName(up0());
				((MCRow)ope.up(0)).setNumberNE("data_no", _issueDataNo);
				((MCRow)ope.up(0)).setStringNE("exec_co_cd", getUserCoCd());
				operationMap.put(coCd, ope);
			}
			
			try {
				Map<String, MCMessageList> msgMap = MCCooperateInvokeManager.exec(operationMap);
				for (String coCd : msgMap.keySet()) {
					MCMessagePool.addAll(msgMap.get(coCd));
				}
			}
			catch (MCException ex) {
				MCMessagePool.add(ex.getMCMessage());
			}
			
			// 各会社の、登録を行った件数をカウントする
			for (String coCd : _multiCompanyCdL) {
				MCOperation ope = operationMap.get(coCd);
				MCRow down0Row= (MCRow)ope.down(0);
				
				MCNumber okNum = down0Row.getNumberNE("ok_num");
				if (!isNull(okNum)) {
					_registerCnt = _registerCnt.add(okNum);
				}
				
				MCNumber cancelNum = down0Row.getNumberNE("cancel_num");
				if (!isNull(cancelNum)) {
					_registerCnt = _registerCnt.add(cancelNum);
				}
			}
		}
		
		/**
		 * 登録を行ったレコードが存在するかをチェック
		 * @return true : 登録したレコード有り
		 *              : 登録したレコード無し
		 */
		protected boolean isExistTgt() {
			if (_registerCnt.isZero()) {
				return false;
			}
			return true;
		}
		
		/**
		 * 送受信ＩＦに登録を行う
		 */
		protected void registerSdrvIf() {
			String modId = "PF";
			String lgcId = "PFBZL9050";
			String opeId = "Ins01";
			
			MCOperation ope = createOperation(modId, lgcId, opeId, MCOperation.class);
			MCList<MCRow> up0 = (MCList<MCRow>) ope.up(0);
			MCRow r = up0.createRow();
			r.setStringNE("if_proc_typ", up0().if_proc_typ());
			r.setNumberNE("data_no", _issueDataNo);
			r.setStringNE("ext_sys_cd", up0().ext_sys_cd());
			r.setStringNE("sdrv_sts_typ", MAC_SDRV_STS_TYP.NOTYET.value());
			up0.add(r);
			ope.exec();
		}
		
		/**
		 * エラーハンドリング処理
		 * @param ex 例外オブジェクト
		 */
		protected void handleEx(Exception ex) {
			MCException mcEx;
			
			if (ex instanceof MCException) {
				mcEx = (MCException) ex;
			}
			else {
				mcEx = new MCException(ex);
			}
			
			_exceptionFlg = true;
			throw mcEx;
		}
		
		/**
		 * 開始ログの出力
		 */
		protected void writeStartLog() {
			
		}
		
		/**
		 * 終了ログを出力する
		 */
		protected void writeEndLog() {
			
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * BILinkのDBに対し、レコードのinsertとupdateを行うオペレーションの呼び出しを行う。<br>
	 */
	public class Upd02 extends MAUDL_LogicBase_MC_A.Upd02 {
		
		/** ロガー作成ＦＬＧ **/
		protected boolean _crtNewLogger;
		/** 例外が発生したかどうかのＦＬＧ */
		protected boolean _exceptionFlg;
		
		/** 処理対象レコードの合計件数 */
		protected int _rsltTotalNum;
		/** 処理結果がOKであったレコードの件数 */
		protected int _rsltOkNum;
		/** 処理結果がエラーであったレコードの件数 */
		protected int _rsltErrNum;
		/** 処理結果がスキップであったレコードの件数 */
		protected int _rsltSkipNum;
		/** 登録した削除レコードの件数. */
		protected int _rsltCancelNum;
		
		/** スレッドの同時実行数 */
		protected int _limitThreadSize;
		
		// -----------------------------------------
		// 以下のフィールドは、子クラスにてセットする
		
		/** フェッチ件数 */
		protected int _fetchSize;
		/** 1スレッドあたりの処理レコード数 */
		protected int _threadRecordCnt;
		
		// DBCのクラスパス
		/** IFテーブルのDBCクラスパス */
		protected String _ifTblContainerClassPath;
		/** トランテーブルのDBCクラスパス */
		protected String _trnTblContainerClassPath;
		
		// 以下は、ＢＩ送信対象外ＦＬＧのupdate処理に使用する
		/** ＢＩ送信対象外ＦＬＧを更新する対象をselectするSQLID */
		protected String _sqlIdSelectBiNotSendFlg;
		/** ＢＩ送信対象外ＦＬＧを更新するSQLID. */
		protected String _sqlIdUpdBiNotSendFlg;
		/** ＢＩ送信対象外ＦＬＧを更新するためのQueryBuilder */
		protected MCQueryApiBuilder _ifTblUpdBiNotSendFlgBuilder;
		/** _ifTblUpdBiNotSendFlgBuilderの条件句用のbind */
		protected MCRow _updBiNotSendFlgBind;
		
		// 以下は、IFテーブルへのinsert処理に使用する(mcframeにて、新規、もしくは変更されたレコード)
		/** ＩＦテーブルに登録する対象を抽出するselectのSQLID */
		protected String _sqlIdSelectExtractTrn;
		/** IFテーブルへのinsertのSQLID. */
		protected String _sqlIdInsExtractTrn;
		/** IFテーブルに登録する対象を、mcframeのテーブルから抽出するためのQueryBuilder */
		protected MCQueryApiBuilder _trnTblExtractBuilder;
		/** _trnTblExtractBuilderの条件句用のbind */
		protected MCRow _trnTblExtractBind;
		
		// 以下は、IFテーブルへのinsert処理に使用する(mcframeにて、削除されたレコード)
		/** ＩＦテーブルに登録する対象を抽出するselectのSQLID（削除レコード） */
		protected String _sqlIdSelectExtractDltTrn;
		/** IFテーブルへのinsertのSQLID（削除レコード） */
		protected String _sqlIdInsExtractDltTrn;
		/** IFテーブルに登録する対象を、mcframeのテーブルから抽出するためのQueryBuilder（削除レコード） */
		protected MCQueryApiBuilder _trnTblExtractDltBuilder;
		/** _trnTblExtractDltBuilderの条件句用のbind */
		protected MCRow _trnTblExtractDltBind;
		/** IFテーブルにおいて、同一キーレコードと判定するためのキー項目一覧 */
		protected String[] _ifTblCmpKeys;
		// -----------------------------------------
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			boolean batchLockFlg = false;
			
			try {
				// 初期化
				initProc();
				// 開始ログ出力
				writeStartLog();
				// ＤＢＣと検索条件の設定
				setup();
				// バッチ多重起動ロック
				lockMultiExec();
				batchLockFlg = true;
				// 未処理データの更新
				if (updBINotSendFlg()) {
					handleErr();
					return;
				}
				// IFテーブルへレコードの登録
				if(insRecordToIFTable()) {
					handleErr();
					return;
				}
				// 削除レコードの登録の実行判定
				if (isExecInsCancelRecord()) {
					// 削除レコードの登録
					if(insCancelRecordToIFTable()) {
						handleErr();
						return;
					}
				}
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				try {
					if (batchLockFlg) {
						// バッチ多重起動ロックの解放
						unlockMultiExec();
					}
				}
				finally {
					// 下り電文をセット
					setDown();
					
					// 終了ログ出力
					writeEndLog();
					// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
					if (_crtNewLogger) {
						logger().close();
					}
				}
			}
		}
		
		/**
		 * 初期化処理
		 */
		protected void initProc() {
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			
			String dataRefCtl = getDataRefCtl();
			if (isNull(dataRefCtl) || dataRefCtl.isEmpty()) {
				getConcurrentLogger();
			}
			else {
				getConcurrentLogger(dataRefCtl);
			}
			
			// スレッドの実行上限数
			_limitThreadSize = MCServerThreadManager.getLimitThreadSize();
		}
		
		/**
		 * ログに登録するdataRefCtlを返す
		 * 必要な場合のみ、オーバーライドして値を返してください
		 * @return dataRefCtl
		 */
		protected String getDataRefCtl() {
			return null;
		}
		
		/**
		 * 開始ログの出力
		 * 子クラスでオーバーライドする
		 */
		protected void writeStartLog() {
			
		}
		
		/**
		 * 当クラスが処理実行に必要な情報をセット
		 * 子クラスにてオーバーライドする処理
		 */
		protected void setup() {
			
		}
		
		/**
		 * バッチ多重起動ロック
		 * BI Linkバッチ制御テーブルのレコードに対し、処理実行中であることを示すフラグをＯＮにする
		 */
		protected void lockMultiExec() {
			MAUCL_IfCmnService.MultiExec_Upd01 ope = MAUCL_IfCmnService.crtMultiExec_Upd01();
			MultiExec_Upd01_DtlR multiExeUpd01DtlR = ope.up0();
			multiExeUpd01DtlR.if_proc_typ(up0().if_proc_typ());
			multiExeUpd01DtlR.exec_co_cd(up0().exec_co_cd());
			multiExeUpd01DtlR.data_ref_ctl(getDataRefCtl());
			
			ope.exec();
			if (!ope.down0().rslt_flg()) {
				throw new MCAppException(new MCMessage(MAUDL0414, up0().if_proc_typ(), getUserCoCd()));
			}
		}
		
		/**
		 * IFテーブルのＢＩ送信対象外ＦＬＧをtrueに更新を行う処理
		 * @return true  : エラーが発生している
		 *         false : エラーが発生していない
		 */
		protected boolean updBINotSendFlg() {
			
			// ＩＦテーブルのカーソルオブジェクトの作成
			MCCursor<MCRow> cursor = MCTransactionManager.dbTran().statement().openCursor(_sqlIdSelectBiNotSendFlg,
					_ifTblUpdBiNotSendFlgBuilder.buildSelect(_sqlIdSelectBiNotSendFlg).toString(),
					_updBiNotSendFlgBind,
					null,
					MCList.create(MCRow.class),
					MCRow.class);
			
			boolean occurOpeExceptionFlg = false;
			
			try {
				TreeSet<MCNumber> dataNoL = new TreeSet<MCNumber>();
				
				// IFテーブルの検索結果を取得
				while (cursor.dbFetch(_fetchSize) > 0) {
					MCList<MCRow> srchRsltL = cursor.getList();
					
					// BI送信対象外フラグをtrueに変更する
					srchRsltL.setString("bi_not_send_flg", "1");
					
					for (MCRow srchRsltR : srchRsltL) {
						MCNumber dataNo = srchRsltR.getNumberNE("data_no");
						dataNoL.add(dataNo);
					}
					
					if (_limitThreadSize <= 1) {
						// スレッドの同時実行上限が1の場合は、マルチスレッド実行を行わず、オペレーション呼び出しを行う
						occurOpeExceptionFlg = execUpd04Sngl(srchRsltL);
					}
					else {
						// マルチスレッドでオペレーションを実行する
						occurOpeExceptionFlg = execUpd04Multi(srchRsltL);
					}
					
					// Upd04の実行結果がエラーの場合、処理を中断する
					if (occurOpeExceptionFlg) {
						break;
					}
				}
				
				if (!dataNoL.isEmpty()) {
					MCList<MCRow> bindL = MCList.create(MCRow.class);
					for (MCNumber dataNo : dataNoL) {
						MCRow bindR = MCRow.create();
						bindR.setNumberNE("data_no", dataNo);
						bindL.add(bindR);
					}
					
					MCDBContainer dbc = _ifTblUpdBiNotSendFlgBuilder.getBaseDbc();
					_ifTblUpdBiNotSendFlgBuilder.setWhere(((MCNumberPermColumn) dbc.getColumn$("data_no")).eq(bind("data_no")));
					_ifTblUpdBiNotSendFlgBuilder.addConstWhereWithAnd(((MCBooleanPermColumn) dbc.getColumn$("bi_not_send_flg")).eq(value(false)));
					_ifTblUpdBiNotSendFlgBuilder.addConstWhereWithAnd(((MCStringPermColumn) dbc.getColumn$("exe_sts_typ")).eq(value(MAC_EXE_STS_TYP.ERR.value()))
							.or(((MCStringPermColumn) dbc.getColumn$("exe_sts_typ")).eq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))));
					_ifTblUpdBiNotSendFlgBuilder.addGroupBy(dbc.getColumn$("data_no"));
					
					MCList<MCRow> rsltL = MCList.create(MCRow.class);
					rsltL.addNumberColumn("data_no");
					dbSelect(createSqlId(LOGIC_ID, dbc, "S01"), rsltL, _ifTblUpdBiNotSendFlgBuilder, bindL);
					
					dataNoL.removeAll(rsltL.getNumberNE("data_no"));
					
					if (dataNoL.size() > 0) {
						MCNumber minDataNo = dataNoL.first();
						MCNumber maxDataNo = dataNoL.last();
						
						String modId = "PF";
						String lgcId = "PFBZL9050";
						String srchOpeId = "Srch01";
						String UpdOpeId = "Upd01";
						
						MCOperation srchOpe = createOperation(modId, lgcId, srchOpeId, MCOperation.class);
						MCRow srchUp0 = (MCRow) srchOpe.up(0);
						srchUp0.setNumberNE("data_no_fr", minDataNo);
						srchUp0.setNumberNE("data_no_to", maxDataNo);
						srchUp0.setStringNE("ext_sys_cd", up0().ext_sys_cd());
						srchUp0.setBooleanNE("notyet_flg", true);
						srchUp0.setBooleanNE("send_conv_err_flg", true);
						srchUp0.setBooleanNE("send_err_flg", true);
						
						srchOpe.exec();
						MCList<MCRow> srchDown0 = (MCList<MCRow>) srchOpe.down(0);
						MCIndexKey idxkey = srchDown0.createIndex("data_no");
						
						MCOperation updOpe = createOperation(modId, lgcId, UpdOpeId, MCOperation.class);
						MCList<MCRow> updUp0 = (MCList<MCRow>) updOpe.up(0);
						
						for (MCNumber dataNo : dataNoL) {
							if(isNull(srchDown0.getFirst(idxkey, dataNo))) {
								continue;
							}
							MCRow updR = updUp0.createRow();
							updR.setNumberNE("data_no", dataNo);
							updR.setBooleanNE("not_send_flg", true);
							MCRow srchDown0R = srchDown0.getFirst(idxkey, dataNo);
							updR.setBooleanNE("not_send_upd_flg", srchDown0R.getBoolean("not_send_upd_flg"));
							updR.setStringNE("sdrv_if_rmrks", srchDown0R.getStringNE("sdrv_if_rmrks"));
							updUp0.add(updR);
						}
						
						if(updUp0.size() >  0) {
							updOpe.exec();
						}
						
					}
				}
			}
			finally {
				cursor.close();
			}
			
			return occurOpeExceptionFlg;
		}
		
		/**
		 * Upd04を実行する(オペレーションを実行)
		 * @param srchRsltL 更新対象のデータ
		 * @return true  : エラーが発生した
		 *         false : エラーが発生せず、すべての処理が完了した
		 */
		protected boolean execUpd04Sngl(MCList<MCRow> srchRsltL) {
			
			boolean rsltFlg = false;
			boolean trnNewSuccessFlg = false;
			MCDBTransaction currentTrnBackup = null;
			
			try {
				currentTrnBackup = MCTransactionManager.dbTran();
				
				// トランザクションの開始
				MCTransactionManager.createDBTran();
				trnNewSuccessFlg = true;
				
				// Upd04を作成
				Upd04 upd04Ope = crtUpd04Ope(srchRsltL);
				// Upd04の実行
				upd04Ope.exec();
				
				// トランザクションの終了
				MCTransactionManager.dbTran().commit();
			}
			catch (MCException ex) {
				// エラーハンドリング
				writeLogForProcessLog(ex);
				_exceptionFlg = true;
				rsltFlg = true;
				
				if (trnNewSuccessFlg) {
					MCTransactionManager.dbTran().rollback();
				}
			}
			finally {
				if (trnNewSuccessFlg) {
					MCTransactionManager.releaseDBTran(MCTransactionManager.dbTran());
					MCTransactionManager.setCurrentDBTran(currentTrnBackup);
				}
			}
			
			return rsltFlg;
		}
		
		/**
		 * Upd04を実行する（マルチスレッドによる実行）
		 * @param srchRsltL 更新対象のデータ
		 * @return true  : エラーが発生した
		 *         false : エラーが発生せず、すべての処理が完了した
		 */
		protected boolean execUpd04Multi(MCList<MCRow> srchRsltL) {
			// Upd04を作成
			List<Upd04> upd04OpeL = crtUpd04OpeL(srchRsltL);
			// Upd04の実行
			MCServerThreadManager.setCommitAndRollback(true);
			try {
				MCServerThreadManager.invokeAndWait(upd04OpeL, FXBAL_BatchLogManager.class);
			}
			catch (MCException ex) {
				writeLogForProcessLog(ex);
			}
			
			boolean rsltFlg = false;
			for (Upd04 ope : upd04OpeL) {
				MCException ex = MCServerThreadManager.getException(ope);
				if (ex != null) {
					rsltFlg = true;
					writeLogForProcessLog(ex);
				}
			}
			
			return rsltFlg;
		}
		
		/**
		 * Upd04のオペレーションを作成する（マルチスレッド用）
		 * @param srchRsltL 更新対象のデータ
		 * @return Upd04オペレーションのリスト
		 */
		protected List<Upd04> crtUpd04OpeL(MCList<MCRow> srchRsltL) {
			
			List<Upd04> rsltLst = new ArrayList<Upd04>();
			
			// 1スレッドが処理するレコード毎に、リストを分割する
			List<MCList<MCRow>> rowLLst = divListForMultiThread(srchRsltL);
			
			for (MCList<MCRow> rowL : rowLLst) {
				rsltLst.add(crtUpd04Ope(rowL));
			}
			
			return rsltLst;
		}
		
		/**
		 * Upd04のオペレーションを作成する（オペレーションの実行用）
		 * @param srchRsltL 更新対象のデータ
		 * @return Upd04オペレーション
		 */
		protected Upd04 crtUpd04Ope(MCList<MCRow> srchRsltL) {
			
			// 1つのオペレーションに全件レコードをセットする
			Upd04 ope = crtUpd04();
			ope.setUpdRecordL(srchRsltL);
			ope.setIfTblContainerClassPath(_ifTblContainerClassPath);
			ope.setIfTblUpdSqlId(_sqlIdUpdBiNotSendFlg);
			
			return ope;
		}
		
		/**
		 * IFテーブルにレコードをinsertする処理
		 * @return true  : エラーが発生している
		 *         false : エラーが発生していない
		 */
		protected boolean insRecordToIFTable() {
			
			// 業務データ抽出のカーソルオブジェクト作成
			MCCursor<MCRow> cursor = MCTransactionManager.dbTran().statement().openCursor(_sqlIdSelectExtractTrn,
					_trnTblExtractBuilder.buildSelect(_sqlIdSelectExtractTrn).toString(),
					_trnTblExtractBind,
					null,
					MCList.create(MCRow.class),
					MCRow.class);
			
			boolean occurOpeExceptionFlg = false;
			
			try {
				// 検索結果の取得
				while (cursor.dbFetch(_fetchSize) > 0) {
					MCList<MCRow> srchRsltL = cursor.getList();
					// 検索後処理
					MCList<MCRow> insL = srchPostForInsRecord(srchRsltL);
					setBatchLogNo(insL);
					
					if (_limitThreadSize <= 1) {
						// スレッドの同時実行上限が1の場合は、マルチスレッド実行を行わず、オペレーション呼び出しを行う
						occurOpeExceptionFlg = execUpd03Sngl(insL);
					}
					else {
						// マルチスレッドでオペレーションを実行する
						occurOpeExceptionFlg = execUpd03Multi(insL);
					}
					
					// Upd03の実行結果がエラーの場合、処理を中断する
					if (occurOpeExceptionFlg) {
						break;
					}
				}
			}
			finally {
				cursor.close();
			}
			
			return occurOpeExceptionFlg;
		}
		
		/**
		 * Upd03を実行する(オペレーションを実行)
		 * @param srchRsltL 登録対象のデータ
		 * @return true  : エラーが発生した
		 *         false : エラーが発生せず、すべての処理が完了した
		 */
		protected boolean execUpd03Sngl(MCList<MCRow> insL) {
			
			boolean rsltFlg = false;
			boolean trnNewSuccessFlg = false;
			MCDBTransaction currentTrnBackup = null;
			
			try {
				_rsltTotalNum += insL.size();
				currentTrnBackup = MCTransactionManager.dbTran();
				
				// トランザクションの開始
				MCTransactionManager.createDBTran();
				trnNewSuccessFlg = true;
				
				// Upd03を作成
				Upd03 upd03Ope = crtUpd03Ope(insL);
				// Upd03の実行
				upd03Ope.exec();
				
				// トランザクションの終了
				MCTransactionManager.dbTran().commit();
				_rsltOkNum += insL.size();
			}
			catch (MCException ex) {
				// エラーハンドリング
				writeLogForProcessLog(ex);
				_exceptionFlg = true;
				rsltFlg = true;
				
				_rsltErrNum += insL.size();
				
				if (trnNewSuccessFlg) {
					MCTransactionManager.dbTran().rollback();
				}
			}
			finally {
				if (trnNewSuccessFlg) {
					MCTransactionManager.releaseDBTran(MCTransactionManager.dbTran());
					MCTransactionManager.setCurrentDBTran(currentTrnBackup);
				}
			}
			
			return rsltFlg;
		}
		
		/**
		 * Upd03を実行する（マルチスレッドによる実行）
		 * @param srchRsltL 登録対象のデータ
		 * @return true  : エラーが発生した
		 *         false : エラーが発生せず、すべての処理が完了した
		 */
		protected boolean execUpd03Multi(MCList<MCRow> insL) {
			// Upd03を作成
			List<Upd03> upd03OpeL = crtUpd03OpeL(insL);
			
			// Upd03の実行
			MCServerThreadManager.setCommitAndRollback(true);
			try {
				MCServerThreadManager.invokeAndWait(upd03OpeL, FXBAL_BatchLogManager.class);
			}
			catch (MCException ex) {
				writeLogForProcessLog(ex);
			}
			
			boolean errFlg = false;
			for (Upd03 ope : upd03OpeL) {
				MCException ex = MCServerThreadManager.getException(ope);
				if (ex != null) {
					errFlg = true;
					_rsltErrNum += ope.getInstRecordLCnt();
					_rsltTotalNum += ope.getInstRecordLCnt();
					
					writeLogForProcessLog(ex);
				}
				else {
					// オペレーションが実行されたもののみ加算を行う
					if (ope.isExecFlg()) {
						_rsltOkNum += ope.getInstRecordLCnt();
						_rsltTotalNum += ope.getInstRecordLCnt();
					}
				}
			}
			
			return errFlg;
		}
		
		/**
		 * Upd03のオペレーションを作成する（マルチスレッド用）
		 * @param srchRsltL 登録対象のデータ
		 * @return Upd03オペレーションのリスト
		 */
		protected List<Upd03> crtUpd03OpeL(MCList<MCRow> insL) {
			
			List<Upd03> rsltLst = new ArrayList<Upd03>();
			
			// 1スレッドが処理するレコード毎に、リストを分割する
			List<MCList<MCRow>> rowLLst = divListForMultiThread(insL);
			
			for (MCList<MCRow> rowL : rowLLst) {
				rsltLst.add(crtUpd03Ope(rowL));
			}
			
			return rsltLst;
		}
		
		/**
		 * Upd03のオペレーションを作成する（オペレーションの実行用）
		 * @param insL 登録対象のデータ
		 * @return Upd03オペレーション
		 */
		protected Upd03 crtUpd03Ope(MCList<MCRow> insL) {
			
			// 1つのオペレーションに全件レコードをセットする
			Upd03 ope = crtUpd03();
			ope.setInstRecordL(insL);
			ope.setIfTblContainerClassPath(_ifTblContainerClassPath);
			ope.setIfTblInsSqlId(_sqlIdInsExtractTrn);
			return ope;
		}
		
		/**
		 * IFテーブルに登録するレコードの抽出後の後処理
		 * レコードへの値設定などを実行する
		 * 子クラスでオーバーライドする処理
		 * @param srchRsltL 登録対象のデータ
		 * @return 必要なデータセットやレコードの追加を行った結果のリスト
		 */
		protected MCList<MCRow> srchPostForInsRecord(MCList<MCRow> srchRsltL) {
			return srchRsltL;
		}
		
		/**
		 * ＩＦテーブルへ削除レコードを登録する処理
		 * IFテーブルに登録済のデータが、mcframeにてデータ削除された場合、IFテーブルをmcframe側と同期させるために、削除レコードを登録する
		 * @return true  : エラーが発生している
		 *         false : エラーが発生していない
		 */
		protected boolean insCancelRecordToIFTable() {
			
			// 削除レコード検索カーソルオブジェクトの作成
			MCCursor<MCRow> cursor = MCTransactionManager.dbTran().statement().openCursor(_sqlIdSelectExtractDltTrn,
					_trnTblExtractDltBuilder.buildSelect(_sqlIdSelectExtractDltTrn).toString(),
					_trnTblExtractDltBind,
					null,
					MCList.create(MCRow.class),
					MCRow.class);
			
			boolean occurOpeExceptionFlg = false;
			MCList<MCRow> restRecordPoolL = MCList.create(MCRow.class);
			
			try {
				while (cursor.dbFetch(_fetchSize) > 0) {
					// フェッチしたレコードを取得
					MCList<MCRow> tgtL = cursor.getList();
					// フェッチ件数の都合で、同一キーレコードが途切れてしまっている可能性があるレコードを、リストから排除する
					MCList<MCRow> tgtRsltL = removeDiscontinuousKeyRecord(tgtL, restRecordPoolL);
					setBatchLogNo(tgtRsltL);
					
					if (!tgtRsltL.isEmpty()) {
						occurOpeExceptionFlg = execUpd03ForCancelRecord(tgtRsltL);
						// Upd03の実行結果がエラーの場合、処理を中断する
						if (occurOpeExceptionFlg) {
							break;
						}
					}
				}
			}
			finally {
				cursor.close();
			}
			
			// 処理対象レコードの残がある場合
			if (!restRecordPoolL.isEmpty() && !occurOpeExceptionFlg) {
				occurOpeExceptionFlg = execUpd03ForCancelRecord(restRecordPoolL);
			}
			
			_rsltTotalNum += _rsltCancelNum;
			return occurOpeExceptionFlg;
		}
		
		/**
		 * Upd03を呼び出し、IFテーブルに登録を行う（トランとIFテーブルを比較し、IFテーブルのみに存在するレコードに対する削除レコード）
		 * @param tgtRecordL 処理対象レコード
		 * @return true  : 例外が発生している
		 *         false : 例外が発生していない
		 */
		protected boolean execUpd03ForCancelRecord(MCList<MCRow> tgtRecordL) {
			
			boolean occurOpeExceptionFlg = false;
			
			// 削除レコード検索後処理
			MCList<MCRow> complementedL = srchPostForInsCancelRecord(tgtRecordL);
			if (_limitThreadSize <= 1) {
				// スレッドの同時実行上限が1の場合は、マルチスレッド実行を行わず、オペレーション呼び出しを行う
				occurOpeExceptionFlg = execUpd03DltSngl(complementedL);
			}
			else {
				// マルチスレッドでオペレーションを実行する
				occurOpeExceptionFlg = execUpd03DltMulti(complementedL);
			}
			
			return occurOpeExceptionFlg;
		}
		
		/**
		 * IFテーブルにおける同一キーレコードをフェッチした際、フェッチ数によっては、同一キーレコードを全件取得できないケースがある
		 * そのため、全件取得できていない可能性があるレコードを排除する
		 * @param srchRslt フェッチした結果
		 * @param outRestRecordPoolL 同一キーレコードにおいて、全件取得できていない可能性のあるレコード
		 * @return 全件取得できたレコードのリスト
		 */
		protected MCList<MCRow> removeDiscontinuousKeyRecord(MCList<MCRow> srchRslt, MCList<MCRow> outRestRecordPoolL) {
			
			MCList<MCRow> rsltL = MCList.create(MCRow.class);
			
			if (srchRslt.isEmpty()) {
				return rsltL;
			}
			
			MCRow currentKeyRow = null;
			if (outRestRecordPoolL.isEmpty()) {
				currentKeyRow = srchRslt.get(0);
			}
			else {
				currentKeyRow = outRestRecordPoolL.get(0);
			}
			
			MCRowComparator<MCRow> ifTblKeyComparator = new MCRowComparator.ASC<MCRow>(_ifTblCmpKeys);
			MCList<MCRow> tmpL = MCList.create(MCRow.class);
			for (MCRow row : srchRslt) {
				if (ifTblKeyComparator.compare(currentKeyRow, row) == 0) {
					tmpL.add(row);
				}
				else {
					rsltL.addAll(outRestRecordPoolL);
					outRestRecordPoolL.clear();
					
					rsltL.addAll(tmpL);
					tmpL.clear();
					
					currentKeyRow = row;
					tmpL.add(row);
				}
			}
			
			if (!tmpL.isEmpty()) {
				outRestRecordPoolL.addAll(tmpL);
			}
			
			return rsltL;
		}
		
		/**
		 * 削除データ登録用Upd03のオペレーションを実行する
		 * @param srchRsltL 登録対象のデータ
		 * @return true  : エラーが発生した
		 *         false : エラーが発生せず、すべての処理が完了した
		 */
		protected boolean execUpd03DltSngl(MCList<MCRow> insL) {
			
			boolean rsltFlg = false;
			boolean trnNewSuccessFlg = false;
			MCDBTransaction currentTrnBackup = null;
			
			try {
				currentTrnBackup = MCTransactionManager.dbTran();
				
				// トランザクションの開始
				MCTransactionManager.createDBTran();
				trnNewSuccessFlg = true;
				
				// 削除レコード用Upd03を作成
				Upd03 upd03Ope = crtUpd03Ope(insL);
				// 削除レコード用Upd03実行
				upd03Ope.exec();
				
				// トランザクションの終了
				MCTransactionManager.dbTran().commit();
				_rsltCancelNum += insL.size();
			}
			catch (MCException ex) {
				// エラーハンドリング
				writeLogForProcessLog(ex);
				_exceptionFlg = true;
				rsltFlg = true;
				
				if (trnNewSuccessFlg) {
					MCTransactionManager.dbTran().rollback();
				}
			}
			finally {
				if (trnNewSuccessFlg) {
					MCTransactionManager.releaseDBTran(MCTransactionManager.dbTran());
					MCTransactionManager.setCurrentDBTran(currentTrnBackup);
				}
			}
			
			return rsltFlg;
		}
		
		/**
		 * 削除データ登録用Upd03のオペレーションを実行する（マルチスレッド用）
		 * @param insL 登録対象のデータ
		 * @return true  : エラーが発生した
		 *         false : エラーが発生せず、すべての処理が完了した
		 */
		protected boolean execUpd03DltMulti(MCList<MCRow> insL) {
			// 削除レコード用Upd03を作成
			List<Upd03> upd03OpeL = crtUpd03OpeL(insL);
			// 削除レコード用Upd03実行
			MCServerThreadManager.setCommitAndRollback(true);
			try {
				MCServerThreadManager.invokeAndWait(upd03OpeL, FXBAL_BatchLogManager.class);
			}
			catch (MCException ex) {
				writeLogForProcessLog(ex);
			}
			
			// 削除レコード用Upd03のエラーハンドリング処理
			boolean rsltFlg = false;
			for (Upd03 ope : upd03OpeL) {
				MCException ex = MCServerThreadManager.getException(ope);
				if (ex != null) {
					writeLogForProcessLog(ex);
					rsltFlg = true;
				}
				else {
					if (ope.isExecFlg()) {
						_rsltCancelNum += insL.size();
					}
				}
			}
			
			return rsltFlg;
		}
		
		/**
		 * IFテーブルにのみ存在するレコードの抽出後の処理
		 * 子クラスでオーバーライドする処理
		 * @param srchRsltL 抽出後のデータ
		 * @return 必要なデータセットやレコードの追加を行った結果のリスト
		 */
		protected MCList<MCRow> srchPostForInsCancelRecord(MCList<MCRow> srchRsltL) {
			return srchRsltL;
		}
		
		/**
		 * バッチ多重起動ロックの解放
		 * BI Linkバッチ制御テーブルのレコードに対し、処理実行中であることを示すフラグをＯＦＦにする
		 */
		protected void unlockMultiExec() {
			MAUCL_IfCmnService.MultiExec_Upd02 ope = MAUCL_IfCmnService.crtMultiExec_Upd02();
			MultiExec_Upd02_DtlR multiExeUpd02DtlL = ope.up0();
			multiExeUpd02DtlL.if_proc_typ(up0().if_proc_typ());
			multiExeUpd02DtlL.exec_co_cd(up0().exec_co_cd());
			multiExeUpd02DtlL.data_ref_ctl(getDataRefCtl());
			
			ope.exec();
		}
		
		/**
		 * 下り電文の値をセット
		 */
		protected void setDown() {
			down0().total_num(_rsltTotalNum);
			down0().ok_num(_rsltOkNum);
			down0().err_num(_rsltErrNum);
			down0().skip_num(_rsltSkipNum);
			down0().cancel_num(_rsltCancelNum);
		}
		
		/**
		 * エラーハンドリング処理
		 * @param ex 例外オブジェクト
		 */
		protected void handleEx(Exception ex) {
			
			handleErr();
			
			MCException mcEx;
			if (ex instanceof MCException) {
				mcEx = (MCException) ex;
			}
			else {
				mcEx = new MCException(ex);
			}
			writeLogForProcessLog(mcEx);
		}
		
		/**
		 * エラー発生時の処理.
		 */
		protected void handleErr() {
			MCTransactionManager.dbTran().rollback();
			_exceptionFlg = true;
		}
		
		/**
		 * 終了ログを出力する
		 * 子クラスでオーバーライドする
		 */
		protected void writeEndLog() {
			
		}
		
		/**
		 * データ処理区分が「削除」のレコードを登録する処理が必要ならば、子クラスにてメソッドをオーバーライドしtrueを返す
		 * デフォルトでは実行を行わない
		 * @return true  : 実行する
		 *         false : 実行しない 
		 */
		protected boolean isExecInsCancelRecord() {
			return false;
		}
		
		/**
		 * マルチスレッドでオペレーションを実行するするために、処理対象のデータを各スレッド毎に分割する
		 * @param rowL 処理対象のデータ
		 * @return 分割した結果
		 */
		protected List<MCList<MCRow>> divListForMultiThread(MCList<MCRow> rowL) {
			
			List<MCList<MCRow>> rsltLst = new ArrayList<MCList<MCRow>>();
			
			// 1スレッドが処理するレコード件数が、0以下が設定されている場合、分割を行わない
			if (_threadRecordCnt <= 0) {
				rsltLst.add(rowL);
				return rsltLst;
			}
			
			int recordCnt = rowL.size();
			int beginIdx = 0;
			int endIdx = 0;
			while(endIdx < recordCnt) {
				beginIdx = endIdx;
				endIdx = beginIdx + _threadRecordCnt;
				if (endIdx > recordCnt) {
					endIdx = recordCnt;
				}
				
				MCList<MCRow> dataL = rowL.subList(beginIdx, endIdx);
				rsltLst.add(dataL);
			}
			
			return rsltLst;
		}
		
		/**
		 * IFテーブルに登録するレコードに対し、「ログＮＯ」「ログサブキー１」「ログサブキー２」の値をセットする
		 * @param rL IFテーブルに登録するレコードのリスト 
		 */
		protected void setBatchLogNo(MCList<MCRow> rL) {
			logger().setLogKey(rL, "batch_log_no", "log_sub_key1", "log_sub_key2");
		}
		
		/**
		 * 処理開始ログを出力する.
		 * @param msgId メッセージID
		 * @param binds メッセージのバインド値
		 */
		protected void writeLogForStartLog(String msgId, Object ...binds) {
			logger().writeStartLog(msgId, binds);
			MCMessagePool.add(msgId, binds);
		}
		
		/**
		 * 処理終了ログを出力する.
		 * @param msgId メッセージID
		 * @param binds メッセージのバインド値
		 */
		protected void writeLogForEndLog(String msgId, Object ...binds) {
			logger().writeEndLog(msgId, binds);
			MCMessagePool.add(msgId, binds);
		}
		
		/**
		 * プロセスログを出力する.
		 * @param msgId メッセージID
		 * @param binds メッセージのバインド値
		 */
		protected void writeLogForProcessLog(String msgId, Object ...binds) {
			logger().writeProcessLog(msgId, binds);
			MCMessagePool.add(msgId, binds);
		}
		
		/**
		 * プロセスログを出力する（例外）.
		 * @param e 例外
		 */
		protected void writeLogForProcessLog(MCException e) {
			logger().writeProcessLog(e);
			MCMessagePool.add(e.getMCMessage());
		}
	}
	/**
	 * Upd03オペレーション.<p>
	 *
	 * BILinkのDBに対し、レコードのinsertを行う。<br>
	 */
	public class Upd03 extends MAUDL_LogicBase_MC_A.Upd03 {
		
		/** insert対象のレコードリスト(オペレーションを実行する前にsetterメソッドで値をセットする) */
		protected MCList<MCRow> _instRecordL = MCList.create(MCRow.class);
		/** DBCのクラスパス(オペレーションを実行する前にsetterメソッドで値をセットする) */
		protected String _ifTblContainerClassPath;
		/** IFテーブルのinsertを行うSQLのSqlID */
		protected String _ifTblInsSqlId;
		/** 処理を実行したかどうかのフラグ */
		protected boolean execFlg;
		
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			if (!_instRecordL.isEmpty()) {
				MCDBContainer dbc = getDBC(_ifTblContainerClassPath);
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				
				dbInsert(_ifTblInsSqlId, _instRecordL, builder);
			}
			
			execFlg = true;
		}

		/**
		 * 登録対象のレコード数を取得
		 * @return 登録対象のレコード数
		 */
		public int getInstRecordLCnt() {
			return _instRecordL.size(); 
		}
		
		/**
		 * オペレーションが実行されたかどうか
		 * @return true  : オペレーションは実行済
		 *         false : オペレーションは未実行
		 */
		public boolean isExecFlg() {
			return execFlg;
		}
		
		/**
		 * 登録対象のレコードをセット
		 * @param instRecordL 登録対象のレコード
		 */
		public void setInstRecordL(MCList<MCRow> instRecordL) {
			this._instRecordL = instRecordL;
		}
		
		/**
		 * IFテーブルのＤＢコンテナのクラスパスをセット
		 * @param classPath IFテーブルのＤＢコンテナのクラスパス 
		 */
		public void setIfTblContainerClassPath(String classPath) {
			_ifTblContainerClassPath = classPath;
		}
		
		/**
		 * IFテーブルへ登録するDB処理のSQLIDをセット
		 * @param sqlId SQLID
		 */
		public void setIfTblInsSqlId(String sqlId) {
			_ifTblInsSqlId = sqlId;
		}
		
	}
	/**
	 * Upd04オペレーション.<p>
	 *
	 * BILinkのDBに対し、レコードのupdateを行う。<br>
	 */
	public class Upd04 extends MAUDL_LogicBase_MC_A.Upd04 {
		
		/** update対象のレコードリスト(オペレーションを実行する前にsetterメソッドで値をセットする). */
		protected MCList<MCRow> _updRecordL = MCList.create(MCRow.class);
		/** DBCのクラスパス(オペレーションを実行する前にsetterメソッドで値をセットする). */
		protected String _ifTblContainerClassPath;
		/** IFテーブルのupdateを行うSQLのSqlID. */
		protected String _ifTblUpdSqlId;
		
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			if (!_updRecordL.isEmpty()) {
				MCDBContainer dbc = getDBC(_ifTblContainerClassPath);
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				
				builder.setSet(dbc.getColumn$("bi_not_send_flg"));
				dbUpdateKey(_ifTblUpdSqlId, _updRecordL, builder);
			}
		}
		
		/**
		 * 更新対象のレコードをセット
		 * @param instRecordL 登録対象のレコード
		 */
		public void setUpdRecordL(MCList<MCRow> updRecordL) {
			this._updRecordL = updRecordL;
		}
		
		/**
		 * IFテーブルのＤＢコンテナのクラスパスをセット
		 * @param classPath IFテーブルのＤＢコンテナのクラスパス 
		 */
		public void setIfTblContainerClassPath(String ifTblContainerClassPath) {
			this._ifTblContainerClassPath = ifTblContainerClassPath;
		}
		
		/**
		 * IFテーブルへ更新するDB処理のSQLIDをセット
		 * @param sqlId SQLID
		 */
		public void setIfTblUpdSqlId(String ifTblUpdSqlId) {
			this._ifTblUpdSqlId = ifTblUpdSqlId;
		}
	}
	
	/**
	 * データ行NOを一括で発番し、各データにセットする.
	 * 
	 * @param typ 発番システム区分
	 * @param rowL セット対象のレコードリスト
	 */
	protected void setDataLNo(IfNumSysTyp typ, MCList<MCRow> rowL) {
		if (rowL.isEmpty()) {
			return;
		}
		
		doSeqCache(typ, rowL.size());
		for (MCRow row : rowL) {
			row.setNumberNE("data_lno", getSequence(typ.value()));
		}
	}
	
	/**
	 * ＤＢコンテナのクラスパスからインスタンスを生成
	 * @param name ＤＢコンテナのクラスパス
	 * @return ＤＢコンテナのインスタンス
	 */
	protected MCDBContainer getDBC(String classPath) {
		MCDBContainer dbcR = null;
		try {
			Class<?> clazz = Class.forName(classPath);
			dbcR = (MCDBContainer)MCFactory.invokeStatic(clazz, "create", null, null);
		}
		catch (Exception ex) {
			throw new MCAppException(new MCMessage(MAUDL0415, classPath));
		}
		
		return dbcR;
	}
	
	/**
	 * 処理を実行しているユーザーの会社ＣＤを取得する
	 * @return 会社ＣＤ
	 */
	protected String getUserCoCd() {
		return getCo().co_cd();
	}

	//FMCB CUSTOM END
}