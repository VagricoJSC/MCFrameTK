package mcframe.serverMAUC.MAUCL5030;

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
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;

import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_IfCmnService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_IfCmnService_MC extends MAUCL_IfCmnService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MultiExec_Upd01オペレーション.<p>
	 *
	 * BI Linkバッチ制御(MAT_BLNK_BAT_CNTL)テーブルの「バッチ実行中フラグ」をtrueに更新する。<br>
	 */
	public class MultiExec_Upd01 extends MAUCL_IfCmnService_MC_A.MultiExec_Upd01 {
		
		/** ロガー作成ＦＬＧ */
		protected boolean _crtNewLogger = false;
		
		/** 処理を実行した結果、例外が発生したかを示すフラグ */
		protected boolean _exceptionFlg = false;
		/** 処理の実行結果が正常終了であるかを示すフラグ */
		protected boolean _execOKFlg = false;
		
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initProc();
				chkUpItems();
				exe();
				setDown();
			}
			finally {
				closeLogger();
			}
		}
		
		/**
		 * 初期化
		 */
		protected void initProc() {
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			
			if (isNull(up0().data_ref_ctl()) || up0().data_ref_ctl().isEmpty()) {
				getConcurrentLogger();
			}
			else {
				getConcurrentLogger(up0().data_ref_ctl());
			}
		}
		
		/**
		 * 上り電文の必須項目に値がセットされていることをチェック
		 * セットされていない場合は、プログラミングミスのため例外を投げる
		 */
		protected void chkUpItems() {
			MultiExec_Upd01_DtlR dtlR = up0();
			if (isNull(dtlR.if_proc_typ()) || isNull(dtlR.exec_co_cd())) {
				throw new MCAppException(up0(), null, MAUCL0119);
			}
		}
		
		/**
		 * 処理を実行
		 */
		protected void exe() {
			
			boolean trnNewSuccessFlg = false;
			MCDBTransaction currentTrnBackup = null;
			
			try {
				currentTrnBackup = MCTransactionManager.dbTran();
				
				// トランザクションの開始
				MCTransactionManager.createDBTran();
				trnNewSuccessFlg = true;
				
				_execOKFlg = updRecord();
				
				// トランザクションの終了
				MCTransactionManager.dbTran().commit();
			}
			catch (MCException ex) {
				// エラーハンドリング
				logger().writeProcessLog(ex);
				_exceptionFlg = true;
				
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
		}
		
		/**
		 * BI Linkバッチ制御テーブルの更新を行う
		 * 指定したPKのレコードが存在しない場合は、レコードのinsertを行う
		 * @return true  : 処理OK
		 *         false : 処理NG
		 */
		protected boolean updRecord() {
			
			// レコード取得
			MAT_BLNK_BAT_CNTL_R r = MAT_BLNK_BAT_CNTL_R.create();
			MCQueryApiBuilder srchbuilder = MCQueryApiBuilder.create(r);
			srchbuilder.addWhereWithAnd(r.if_proc_typ.eq(bind(MAT_BLNK_BAT_CNTL_R.$if_proc_typ)));
			
			MCRow srchBind = MCRow.create();
			srchBind.setStringNE(MAT_BLNK_BAT_CNTL_R.$if_proc_typ, up0().if_proc_typ());
			
			MAT_BLNK_BAT_CNTL_R srchRsltR = MAT_BLNK_BAT_CNTL_R.create();
			if (dbSelectKeyForUpdateNoWait("MAUCL5030_MAT_BLNK_BAT_CNTL_S01", srchRsltR, srchbuilder, srchBind) == 0) {
				// レコード登録
				MAT_BLNK_BAT_CNTL_R insR = MAT_BLNK_BAT_CNTL_R.create();
				insR.if_proc_typ(up0().if_proc_typ());
				insR.bat_exec_flg(true);
				insR.exec_co_cd(up0().exec_co_cd());
				
				MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(insR);
				dbInsert("MAUCL5030_MAT_BLNK_BAT_CNTL_I01", insR, insBuilder);
			}
			else {
				if (srchRsltR.bat_exec_flg()) {
					// 他のバッチにて実行中のため、falseを返す
					return false;
				}
				else {
					// レコード更新
					srchRsltR.bat_exec_flg(true);
					srchRsltR.exec_co_cd(up0().exec_co_cd());
					
					MAT_BLNK_BAT_CNTL_R updR = MAT_BLNK_BAT_CNTL_R.create();
					MCQueryApiBuilder updBuilder = MCQueryApiBuilder.create(updR);
					dbUpdateKey("MAUCL5030_MAT_BLNK_BAT_CNTL_U01", srchRsltR, updBuilder);
				}
			}
			
			return true;
		}
		
		/**
		 * 下り電文を作成
		 */
		protected void setDown() {
			MultiExec_Upd01_RsltR rsltR = down0();
			if (_execOKFlg && !_exceptionFlg) {
				rsltR.rslt_flg(true);
			}
			else {
				rsltR.rslt_flg(false);
			}
		}
		
		/**
		 * ログをclose
		 */
		protected void closeLogger() {
			if (_crtNewLogger) {
				logger().close();
			}
		}
	}
	/**
	 * MultiExec_Upd02オペレーション.<p>
	 *
	 * BI Linkバッチ制御(MAT_BLNK_BAT_CNTL)テーブルの「バッチ実行中フラグ」をfalseに更新する。<br>
	 */
	public class MultiExec_Upd02 extends MAUCL_IfCmnService_MC_A.MultiExec_Upd02 {
		
		/** ロガー作成ＦＬＧ */
		protected boolean _crtNewLogger = false;
		
		/** 処理を実行した結果、例外が発生したかを示すフラグ */
		protected boolean _exceptionFlg = false;
		/** 更新対象のレコードの実行会社CDが、登り電文で指定したものと異なっていたことを示すフラグ. */
		protected boolean _recordNotExecCoCdFlg = false;
		
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initProc();
				chkUpItems();
				exe();
				setDown();
			}
			finally {
				closeLogger();
			}
		}
		
		/**
		 * 初期化
		 */
		protected void initProc() {
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			
			if (isNull(up0().data_ref_ctl()) || up0().data_ref_ctl().isEmpty()) {
				getConcurrentLogger();
			}
			else {
				getConcurrentLogger(up0().data_ref_ctl());
			}
		}
		
		/**
		 * 上り電文の必須項目に値がセットされていることをチェック
		 * セットされていない場合は、プログラミングミスのため例外を投げる
		 */
		protected void chkUpItems() {
			MultiExec_Upd02_DtlR dtlR = up0();
			if (isNull(dtlR.if_proc_typ()) || isNull(dtlR.exec_co_cd())) {
				throw new MCAppException(up0(), null, MAUCL0119);
			}
		}
		
		/**
		 * 処理を実行
		 */
		protected void exe() {
			
			boolean trnNewSuccessFlg = false;
			MCDBTransaction currentTrnBackup = null;
			try {
				currentTrnBackup = MCTransactionManager.dbTran();
				
				// トランザクションの開始
				MCTransactionManager.createDBTran();
				trnNewSuccessFlg = true;
				
				updRecord();
				
				// トランザクションの終了
				MCTransactionManager.dbTran().commit();
			}
			catch (MCException ex) {
				// エラーハンドリング
				logger().writeProcessLog(ex);
				_exceptionFlg = true;
				MCMessagePool.add(new MCMessage(up0(), null, MAUCL0121, up0().if_proc_typ(), getUserCoCd(), up0().exec_co_cd()));
				
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
		}
		
		/**
		 * BI Linkバッチ制御テーブルの更新を行う
		 */
		protected void updRecord() {
			
			MAT_BLNK_BAT_CNTL_R r = MAT_BLNK_BAT_CNTL_R.create();
			MCQueryApiBuilder srchbuilder = MCQueryApiBuilder.create(r);
			srchbuilder.addWhereWithAnd(r.if_proc_typ.eq(bind(MAT_BLNK_BAT_CNTL_R.$if_proc_typ)));
			
			MCRow srchBind = MCRow.create();
			srchBind.setStringNE(MAT_BLNK_BAT_CNTL_R.$if_proc_typ, up0().if_proc_typ());
			
			// レコード取得
			MAT_BLNK_BAT_CNTL_R srchRsltR = MAT_BLNK_BAT_CNTL_R.create();
			if (dbSelectKeyForUpdateNoWait("MAUCL5030_MAT_BLNK_BAT_CNTL_S02", srchRsltR, srchbuilder, srchBind) > 0) {
				// 実行会社CDが同じであるかチェック
				if (up0().exec_co_cd().equals(srchRsltR.exec_co_cd())) {
					// レコード更新
					srchRsltR.bat_exec_flg(false);
					
					MAT_BLNK_BAT_CNTL_R updR = MAT_BLNK_BAT_CNTL_R.create();
					MCQueryApiBuilder updBuilder = MCQueryApiBuilder.create(updR);
					dbUpdateKey("MAUCL5030_MAT_BLNK_BAT_CNTL_U02", srchRsltR, updBuilder);
				}
				else {
					// 実行会社ＣＤが一致しない場合は、更新対象外とする
					_recordNotExecCoCdFlg = true;
					MCMessagePool.add(new MCMessage(up0(), null, MAUCL0120, up0().if_proc_typ(), getUserCoCd(), up0().exec_co_cd()));
				}
			}
		}
		
		/**
		 * 下り電文の作成
		 */
		protected void setDown() {
			MultiExec_Upd02_RsltR rsltR = down0();
			if (_exceptionFlg || _recordNotExecCoCdFlg) {
				rsltR.rslt_flg(false);
			}
			else {
				rsltR.rslt_flg(true);
			}
		}
		
		/**
		 * ログをclose
		 */
		protected void closeLogger() {
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		/**
		 * 処理を実行しているユーザーの会社ＣＤを取得する
		 * @return 会社ＣＤ
		 */
		protected String getUserCoCd() {
			return getCo().co_cd();
		}
		
	}

	//FMCB CUSTOM END
}