package mcframe.serverMGBD.MGBDL0060;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBD.MGBDL0060.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0060.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CalcCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CalcCostSrch_MC extends MGBDL_CalcCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 計算実行情報削除時のチェックをする。<br>
	 */
	public class Chk01 extends MGBDL_CalcCostSrch_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
			setDown();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 計算実行情報を削除する。<br>
	 */
	public class Del01 extends MGBDL_CalcCostSrch_MC_A.Del01 {

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				down0().setAll(up0());
			}
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(autoCommitDBTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			MCList<DtlR> up = up0();
			editUp(up);
			callThisChk(up);
			MCList<DtlR> list =getChkList(up);
			del(list);
		}

		protected void editUp(MCList<DtlR> up) {

		}

		protected void callThisChk(MCList<DtlR> up) {
			MGBDL_CalcCostSrch.Chk01 o = MGBDL_CalcCostSrch.crtChk01();
			o.up0().setAll(up);
			o.exec();
			up.setAll(o.down0());
		}

		protected void del(MCList<DtlR> up) {
			if (up.isEmpty()) {
				return;
			}

			saveWorkToEnd(up);
			delMain(up);
		}

		/**
		 * 計算中のデータを処理済にする。
		 */
		protected void saveWorkToEnd(MCList<DtlR> up) {
			for(DtlR row : up){
				executeUpdate(MGBDL0060_MGT_ARG_I01(), autoCommitDBTran(), row, null, null);
				executeUpdate(MGBDL0060_MGT_USR_ITM_D01(), autoCommitDBTran(), row, null, null);
				executeUpdate(MGBDL0060_MGVT_ARG_USR_D01(), autoCommitDBTran(), row, null, null);
			}
		}

		/**
		 * 該当データの削除を実行。
		 */
		protected void delMain(MCList<DtlR> up) {
			MCList<MGW_DEL_CALC_R> workL = createDbcDel(up);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MGW_DEL_CALC_R.create("T"));
			dbc_bldr.buildInsert("MGBDL0060_MGW_DEL_CALC_I01").executeBatchUpdate(autoCommitDBTran(), workL, null, null);

			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_DEL_CALC$P_MAIN", "01"), "MGPA_DEL_CALC$P_MAIN");
		}

		/**
		 * 削除用のＤＢＣを作成する。
		 * @param delList 削除対象のリスト
		 */
		protected MCList<MGW_DEL_CALC_R> createDbcDel(MCList<DtlR> delList) {
			MCList<MGW_DEL_CALC_R> workL = MCList.create(MGW_DEL_CALC_R.class);
			for (DtlR r : delList){
				MGW_DEL_CALC_R ins = MGW_DEL_CALC_R.create();
				ins.calc_grp_cd(r.calc_grp_cd());
				ins.calc_no(r.calc_no());
				workL.add(ins);
			}
			return workL;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算設定情報を検索する。<br>
	 */
	public class Srch01 extends MGBDL_CalcCostSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			executeQuery(down0(), MGBDL0060_MGVT_ARG_USR_S01(), up0());
		}

	}

	//FMCB CUSTOM END
}