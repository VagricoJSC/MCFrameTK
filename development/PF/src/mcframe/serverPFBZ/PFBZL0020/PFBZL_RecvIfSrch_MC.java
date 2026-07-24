package mcframe.serverPFBZ.PFBZL0020;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPF.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFBZ.PFBZL0020.*;	// このimportはFrameManagerの自動生成で追加されました。

import mcframe.serverCore.dbc.FCT_BATCH_LOG_MSG_R;
import mcframe.serverCore.dbc.FCT_BATCH_LOG_H_R;
import mcframe.serverCore.dbc.FCW_BATCH_LOG_H_KEY_R;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZL_RecvIfSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZL_RecvIfSrch_MC extends PFBZL_RecvIfSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受信制御情報を検索する<br>
	 */
	public class Srch01 extends PFBZL_RecvIfSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();

			callSrch01();
		}

		protected void callSrch01() {
			mapUpContainers(CALL_OPE);
			srch01.exec();
			mapDownContainers(CALL_OPE);
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * バッチログメッセージを検索する<br>
	 */
	public class Srch02 extends PFBZL_RecvIfSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			FCT_BATCH_LOG_MSG_R dbc = FCT_BATCH_LOG_MSG_R.create("T");
			FCT_BATCH_LOG_H_R dbcH = FCT_BATCH_LOG_H_R.create("H");
			FCW_BATCH_LOG_H_KEY_R dbcWk = FCW_BATCH_LOG_H_KEY_R.create("W");
			String sqlid_s = createSqlId(LOGIC_ID,dbc, "S01");
			String sqlid_wk_d =createSqlId(LOGIC_ID, dbcH.getPkWorkDbc(), "D01");
			String sqlid_wk_i =createSqlId(LOGIC_ID, dbcH.getPkWorkDbc(), "I01");
			
			dbWkDelete(sqlid_wk_d, dbcH);

			MCList<FCW_BATCH_LOG_H_KEY_R> logHL = MCList.create(FCW_BATCH_LOG_H_KEY_R.class);
			for (Srch02_BatchLogKeyR r : up0()) {
				FCW_BATCH_LOG_H_KEY_R row = FCW_BATCH_LOG_H_KEY_R.create();
				row.batch_log_no(r.batch_log_no());
				logHL.add(row);
			}
			dbWkInsert(sqlid_wk_i, logHL, dbcH);

			sql(sqlid_s)
				.mainQuery()
				.select(
					dbc.batch_log_no,
					rowNumber().over().partitionBy(dbc.batch_log_no)
							.orderBy(dbc.batch_log_no.asc()).as(Srch02_BatchLogMsgR.$seq),
					dbc.log_sub_key1,
					dbc.log_sub_key2,
					dbc.batch_log_typ,
					dbc.msg_id,
					dbc.msg_lvl,
					dbc.msg_txt,
					dbc.log_ts
				)
				.from(
					dbc
					.innerJoin(dbcWk).on(dbc.batch_log_no.eq(dbcWk.batch_log_no))
				)
				.orderBy(
					dbc.batch_log_no.asc(),
					dbc.seq.asc()
				).executeQuery(down0());
			
			mcframe.commonFS.constant.FSC_BATCH_LOG_TYP.putNameNE(down0(),
					Srch02_BatchLogMsgR.$batch_log_typ,
					Srch02_BatchLogMsgR.$batch_log_typ_nm,
					mcframe.serverCore.sys.MCSys.user.locale());
		}
	}

	/**
	 * Conv01オペレーション.<p>
	 *
	 * 送受信IF情報のデータを変換する<br>
	 */
	public class Conv01 extends PFBZL_RecvIfSrch_MC_A.Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callUpd03();
		}

		protected void callUpd03() {
			mapUpContainers(CALL_OPE);
			upd03.exec();
			mapDownContainers(CALL_OPE);
		}
	}

	//FMCB CUSTOM END
}