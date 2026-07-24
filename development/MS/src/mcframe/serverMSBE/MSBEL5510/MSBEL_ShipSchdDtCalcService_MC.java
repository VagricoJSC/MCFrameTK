package mcframe.serverMSBE.MSBEL5510;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipSchdDtCalcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipSchdDtCalcService_MC extends MSBEL_ShipSchdDtCalcService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ShipSchdDt_Srch01オペレーション.<p>
	 *
	 * 基準日、リードタイムから出荷予定日を計算する。<br>
	 */
	public class ShipSchdDt_Srch01 extends MSBEL_ShipSchdDtCalcService_MC_A.ShipSchdDt_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			delWk();
			insWk();
			doProc();
			setDown();
		}

		/**
		 * ワークテーブルを削除する
		 */
		protected void delWk() {
			MSW_SHIP_SCHD_DT_CALC_R S0T = MSW_SHIP_SCHD_DT_CALC_R.create("T");

			execDbWkDelete("MSBEL5510_MSW_SHIP_SCHD_DT_CALC_D01", S0T);
		}

		/**
		 * ワークテーブルに追加する
		 */
		protected void insWk() {
			MCList<MSW_SHIP_SCHD_DT_CALC_R>insL = MCList.create(MSW_SHIP_SCHD_DT_CALC_R.class);
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MSW_SHIP_SCHD_DT_CALC_R.create("T"));
			up0().forEach(r -> insL.add(r));
			dbInsert("MSBEL5510_MSW_SHIP_SCHD_DT_CALC_I01", insL, insL_bldr);
		}

		/**
		 * 出荷予定日計算処理を実行する
		 */
		protected void doProc() {
			execProc(createSqlId(LOGIC_ID, "MSPA_SHIP_SCHD_DT_CALC$P_CAL_SHIP_SCHD_DT", "01"),
					"MSPA_SHIP_SCHD_DT_CALC$P_CAL_SHIP_SCHD_DT");
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCList<MSW_SHIP_SCHD_DT_CALC_R> dbc = MCList.create(MSW_SHIP_SCHD_DT_CALC_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MSW_SHIP_SCHD_DT_CALC_R.create("T"));
			dbSelect("MSBEL5510_MSW_SHIP_SCHD_DT_CALC_S01", dbc, dbc_bldr);
			MCIndexKey idx = dbc.createIndex(MSW_SHIP_SCHD_DT_CALC_R.$peg_no);
			up0().forEach(r -> {
				MSW_SHIP_SCHD_DT_CALC_R wkR = dbc.getFirst(idx, r.peg_no());
				if (!isNull(wkR)) {
					r.ship_schd_tm(wkR.ship_schd_tm());
					r.dlv_schd_tm(wkR.dlv_schd_tm());
					r.ship_wk_grp_cd(wkR.ship_wk_grp_cd());
					r.ship_wk_cd(wkR.ship_wk_cd());
					chkDt(r);
				}
			});
			down0().setAll(up0());
		}

		/**
		 * 希望日時を満たす結果かチェックする
		 */
		protected void chkDt(MSW_SHIP_SCHD_DT_CALC_R r) {
			if (!isNull(r.dlv_schd_tm())
				&& !isNull(r.dlv_rqst_tm())
				&& r.dlv_schd_tm().gtDate(r.dlv_rqst_tm())) { 
				MCMessagePool.add(
					new MCMessage(
						r, null, MSBEL0162, toYMDHMString(r.dlv_schd_tm()), toYMDHMString(r.dlv_rqst_tm()), toDispGUIIndex(r)));
			}
			if (!isNull(r.ship_schd_tm())
				&& !isNull(r.ship_rqst_tm())
				&& r.ship_schd_tm().gtDate(r.ship_rqst_tm())) { 
				MCMessagePool.add(
					new MCMessage(
						r, null, MSBEL0163, toYMDHMString(r.ship_schd_tm()), toYMDHMString(r.ship_rqst_tm()), toDispGUIIndex(r)));
			}
		}
	}

	//FMCB CUSTOM END
}