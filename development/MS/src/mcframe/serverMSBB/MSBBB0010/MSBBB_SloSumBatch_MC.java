package mcframe.serverMSBB.MSBBB0010;

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
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMAUC.MAUCL0140.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBB_SloSumBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBB_SloSumBatch_MC extends MSBBB_SloSumBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * SloSum_Upd01オペレーション.<p>
	 *
	 * 顧客期間内示・受注集計情報を更新する<br>
	 */
	public class SloSum_Upd01 extends MSBBB_SloSumBatch_MC_A.SloSum_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
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
			logger().writeStartLog(MSBBL0191);
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
			if (_exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			logger().writeEndLog(MSBBL0192);
			pushEndLog(logger());
		}

		/**
		 * バッチ用のメイン処理
		 */
		protected void execMain() {
			editCnd();
			execProcComm();
		}
		
		/**
		 * 実行条件の編集
		 */
		protected void editCnd() {
			if (isNull(up0().sum_st_ym())) {
				up0().sum_st_ym(getAcYm(getToday()).addMonth(-1));
			}
			else {
				up0().sum_st_ym(up0().sum_st_ym().trunc(MCDate.MONTH));
			}
		}
		
		/**
		 * プロシージャの実行
		 */
		protected void execProcComm() {
			String procId = "MSPA_FRCST_SLO_SUM$P_FRCST_SLO_SUM_MAIN";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":SUM_ST_YM, :SLS_DPT_CD");
		}
	}

	//FMCB CUSTOM END
}