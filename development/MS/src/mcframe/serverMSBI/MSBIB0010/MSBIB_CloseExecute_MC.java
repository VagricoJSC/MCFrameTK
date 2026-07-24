package mcframe.serverMSBI.MSBIB0010;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk01_HdrR;
import mcframe.serverMSBI.MSBIL5010.Cl_Srch01_RsltR;
import mcframe.serverMSBI.MSBIL5010.MSBIL_ClService;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBIB_CloseExecute"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBIB_CloseExecute_MC extends MSBIB_CloseExecute_MC_A{
	//FMCB CUSTOM START

	/**
	 * CloseExecute_Upd01オペレーション.<p>
	 *
	 */
	public class CloseExecute_Upd01 extends MSBIB_CloseExecute_MC_A.CloseExecute_Upd01 {

		/** エラー件数 */
		protected int _errorCnt;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initLogger();
				writeStartLog();
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}
		
		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			getLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBIL0052);
			pushStartLog(logger());
		}

		/**
		 * 例外処理
		*
		 * @param ex
		 */
		protected void handleEx(Exception ex) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			logger().writeProcessLog(mcex);

			_exceptionFlg = true;

			throw mcex;
		}

		/**
		 * 終了ログを出力する。
		*/
		protected void writeEndLog() {
			logger().writeDataLog(MCMessagePool.getMessageList());
			if (_errorCnt > 0 || _exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			logger().writeEndLog(MSBIL0053);
			pushEndLog(logger());
		}
		
		/**
		 * メイン処理を実行する
		 */
		protected void execMain() {
			_errorCnt = 0;

			// 締処理提供サービス（本日締処理対象検索）
			Cl_Srch01_RsltR rslt = callClSrchSrv();
			
			// ロック、排他
			lockClose();
			
			// 年月度毎に検索結果を分割
			MCList<Cl_Chk01_HdrR> divL = getDivRslt(rslt);

			// 年月ごとに締処理を実行
			for (Cl_Chk01_HdrR r : divL) {
				try {
					// 締処理提供サービス（締処理前チェック）
					callClChkSrv(r);
					
					// エラー処理
					throwUpdErr();
					
					// 締処理提供サービス（締処理）
					callClUpdSrv(r);
				}
				catch (MCAppException e) {
					logger().writeProcessLog(MSBIL0051);
					logger().writeProcessLog(e.getMCMessage());
					_errorCnt++;
				}
			}
		}
		
		/**
		 * 締処理提供サービスの本日締処理対象取得を呼出す
		 */
		protected Cl_Srch01_RsltR callClSrchSrv() {
			MSBIL_ClService.Cl_Srch01 ope = MSBIL_ClService.crtCl_Srch01();
			ope.exec();
			
			return ope.down0();
		}
		
		/**
		 * 締処理情報のロックを実行する
		 */
		protected void lockClose() {
			MCList<MST_CLOSE_R> dbc = MCList.create(MST_CLOSE_R.class);
			MST_CLOSE_R t = MST_CLOSE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ym);
			dbc_bldr.setOrderByAsc(t.ym);
			dbSelectForUpdateNoWait("MSBIB0010_MST_CLOSE_S01", dbc, dbc_bldr);
		}
		
		/**
		 * 締対象を年月度毎に分割する
		 * @return
		 */
		protected MCList<Cl_Chk01_HdrR> getDivRslt(Cl_Srch01_RsltR rslt) {
			
			MCList<Cl_Chk01_HdrR> hdrL = MCList.create(Cl_Chk01_HdrR.class);
			
			// 売上締
			if (rslt.sls_cl_flg()) {
				Cl_Chk01_HdrR hdrR = hdrL.getFirst(Cl_Chk01_HdrR.$ym, rslt.sls_cl_ym());
				if (isNull(hdrR)) {
					Cl_Chk01_HdrR addRow = Cl_Chk01_HdrR.create();
					addRow.ym(rslt.sls_cl_ym());
					addRow.cl_flg(true);
					addRow.sls_cl_flg(true);
					hdrL.add(addRow);
				}
				else {
					hdrR.sls_cl_flg(true);
				}
			}
			
			// 入金締
			if (rslt.rcv_cl_flg()) {
				Cl_Chk01_HdrR hdrR = hdrL.getFirst(Cl_Chk01_HdrR.$ym, rslt.rcv_cl_ym());
				if (isNull(hdrR)) {
					Cl_Chk01_HdrR addRow = Cl_Chk01_HdrR.create();
					addRow.ym(rslt.rcv_cl_ym());
					addRow.cl_flg(true);
					addRow.rcv_cl_flg(true);
					hdrL.add(addRow);
				}
				else {
					hdrR.rcv_cl_flg(true);
				}
			}
			
			// 仕入締
			if (rslt.purc_cl_flg()) {
				Cl_Chk01_HdrR hdrR = hdrL.getFirst(Cl_Chk01_HdrR.$ym, rslt.purc_cl_ym());
				if (isNull(hdrR)) {
					Cl_Chk01_HdrR addRow = Cl_Chk01_HdrR.create();
					addRow.ym(rslt.purc_cl_ym());
					addRow.cl_flg(true);
					addRow.purc_cl_flg(true);
					hdrL.add(addRow);
				}
				else {
					hdrR.purc_cl_flg(true);
				}
			}
			
			// 支払締
			if (rslt.pay_cl_flg()) {
				Cl_Chk01_HdrR hdrR = hdrL.getFirst(Cl_Chk01_HdrR.$ym, rslt.pay_cl_ym());
				if (isNull(hdrR)) {
					Cl_Chk01_HdrR addRow = Cl_Chk01_HdrR.create();
					addRow.ym(rslt.pay_cl_ym());
					addRow.cl_flg(true);
					addRow.pay_cl_flg(true);
					hdrL.add(addRow);
				}
				else {
					hdrR.pay_cl_flg(true);
				}
			}
			
			// 在庫締
			if (rslt.stk_cl_flg()) {
				Cl_Chk01_HdrR hdrR = hdrL.getFirst(Cl_Chk01_HdrR.$ym, rslt.stk_cl_ym());
				if (isNull(hdrR)) {
					Cl_Chk01_HdrR addRow = Cl_Chk01_HdrR.create();
					addRow.ym(rslt.stk_cl_ym());
					addRow.cl_flg(true);
					addRow.stk_cl_flg(true);
					hdrL.add(addRow);
				}
				else {
					hdrR.stk_cl_flg(true);
				}
			}
			
			hdrL.sort(Cl_Chk01_HdrR.$ym);
			
			return hdrL;
		}
		
		/**
		 * 締処理提供サービスの締処理前チェックを呼出す
		 */
		protected void callClChkSrv(Cl_Chk01_HdrR hdrR) {
			MSBIL_ClService.Cl_Chk01 ope = MSBIL_ClService.crtCl_Chk01();
			MCRow.copyvalue(ope.up0(), hdrR);
			ope.exec();
			
			MCRow.copyall(hdrR, ope.down0());
		}
		
		protected void callClUpdSrv(Cl_Chk01_HdrR hdrR) {
			MSBIL_ClService.Cl_Upd01 ope = MSBIL_ClService.crtCl_Upd01();
			MCRow.copyall(ope.up0(), hdrR);
			ope.exec();
		}
		
	}

	//FMCB CUSTOM END
}