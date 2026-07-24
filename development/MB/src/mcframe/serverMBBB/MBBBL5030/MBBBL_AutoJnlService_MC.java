package mcframe.serverMBBB.MBBBL5030;

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


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBB.MBBBL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheCW;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverMBBB.MBBBL5030.Query.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_AutoJnlService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_AutoJnlService_MC extends MBBBL_AutoJnlService_MC_A{
	//FMCB CUSTOM START

	/**
	 * AutoJnl_Chk01オペレーション.<p>
	 *
	 * 自動仕訳作成前チェック<br>
	 */
	public class AutoJnl_Chk01 extends MBBBL_AutoJnlService_MC_A.AutoJnl_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}


		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * AutoJnl_Upd01オペレーション.<p>
	 *
	 * 自動で仕訳を作成する。<br>
	 */
	public class AutoJnl_Upd01 extends MBBBL_AutoJnlService_MC_A.AutoJnl_Upd01 {
		
		protected int _rc = 0;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initLogger();
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
		protected void initLogger() {
			getConcurrentLogger();
		}
		
		protected void execMain() {
			callThisChk01();
			throwUpdErr();
			prep();
			lock();
			insJnlHistory();
			jnlPrep();
			jnlMain();
			postMain();
		}

		protected void callThisChk01() {
			MBBBL_AutoJnlService.AutoJnl_Chk01 o = MBBBL_AutoJnlService.crtAutoJnl_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void prep() {
			up0().addStringColumn("jnl_grp_no", getJnlGrpNo());
			up0().addDateColumn("ac_ym_next", up0().ac_ym().addMonth(1));
			up0().addNumberColumn("mon", MCNumber.valueOf(up0().ac_ym().toString("MM")));
		}

		protected void lock() {
			try {
				lockAcIo();
				lockAcStk();
				lockAcCost();
				lockAcRcv();
				lockAcPay();
			}
			catch (Exception e) {
				throw new MCAppException(MBBBD0003);
			}
		}

		protected void lockAcIo() {
			MBT_AC_IO_R t = MBT_AC_IO_R.create("T");
			MAM_SLIP_JNL_R m = MAM_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.data_no);
			bldr.addInnerJoin(m, t.ac_slip_typ.eq(m.ac_slip_typ)
					.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
					.and(m.del_flg.eq(value(false))));
			bldr.setLockTable(t.data_no);
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			bldr.setOrderBy(t.data_no.asc());

			dbSelectForUpdateNoWaitNoFetch(createSqlId(LOGIC_ID, t, "S01"), bldr, up0());
		}

		protected void lockAcStk() {
			MBT_AC_STK_R t = MBT_AC_STK_R.create("T");
			MAM_SLIP_JNL_R m = MAM_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.data_no);
			bldr.addInnerJoin(m, t.ac_slip_typ.eq(m.ac_slip_typ)
					.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
					.and(m.del_flg.eq(value(false))));
			bldr.setLockTable(t.data_no);
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			bldr.setOrderBy(t.data_no.asc());

			dbSelectForUpdateNoWaitNoFetch(createSqlId(LOGIC_ID, t, "S01"), bldr, up0());
		}

		protected void lockAcCost() {
			MBT_AC_COST_R t = MBT_AC_COST_R.create("T");
			MAM_COST_SLIP_JNL_R m = MAM_COST_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.data_no);
			bldr.addInnerJoin(m, t.calc_grp_cd.eq(m.calc_grp_cd)
					.and(t.ac_slip_typ.eq(m.ac_slip_typ))
					.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
					.and(m.del_flg.eq(value(false))));
			bldr.setLockTable(t.data_no);
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			bldr.setOrderBy(t.data_no.asc());

			dbSelectForUpdateNoWaitNoFetch(createSqlId(LOGIC_ID, t, "S01"), bldr, up0());
		}

		protected void lockAcRcv() {
			MBT_AC_RCV_R t = MBT_AC_RCV_R.create("T");
			MAM_SLIP_JNL_R m = MAM_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.data_no);
			bldr.addInnerJoin(m, t.ac_slip_typ.eq(m.ac_slip_typ)
					.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
					.and(m.del_flg.eq(value(false))));
			bldr.setLockTable(t.data_no);
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			bldr.setOrderBy(t.data_no.asc());

			dbSelectForUpdateNoWaitNoFetch(createSqlId(LOGIC_ID, t, "S01"), bldr, up0());
		}

		protected void lockAcPay() {
			MBT_AC_PAY_R t = MBT_AC_PAY_R.create("T");
			MAM_SLIP_JNL_R m = MAM_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.data_no);
			bldr.addInnerJoin(m, t.ac_slip_typ.eq(m.ac_slip_typ)
					.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
					.and(m.del_flg.eq(value(false))));
			bldr.setLockTable(t.data_no);
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			bldr.setOrderBy(t.data_no.asc());

			dbSelectForUpdateNoWaitNoFetch(createSqlId(LOGIC_ID, t, "S01"), bldr, up0());
		}

		protected void insJnlHistory() {
			MBT_JNL_HISTORY_R t = MBT_JNL_HISTORY_R.create("T");
			MBT_JNL_HISTORY_R r = MBT_JNL_HISTORY_R.create();
			r.jnl_grp_no(up0().getString("jnl_grp_no"));
			r.ac_ym(up0().ac_ym());
			MCDate stDt = getYmStDt(up0().ac_ym());
			MCDate endDt = getYmEndDt(up0().ac_ym());
			r.st_dt((isNull(up0().dt_fr()) ? (stDt) : up0().dt_fr()).trunc(MCDateFieldType.DAY));
			r.end_dt((isNull(up0().dt_to()) ? endDt : up0().dt_fr()).trunc(MCDateFieldType.DAY));
			r.ac_slip_dt(up0().ac_slip_dt().trunc(MCDateFieldType.DAY));
			r.jnl_act_cd(up0().jnl_act_cd());
			r.data_typ(MAC_DATA_TYP.ERR.value());
			r.rerun_flg(up0().rerun_flg());
			r.jnl_rmrks(up0().jnl_rmrks());
			dbInsert(createSqlId(LOGIC_ID, t, "I01"), r, MCQueryApiBuilder.create(t));
		}

		protected void jnlPrep() {
			setBind();
			delPreJournal();
			insPreJournal();
			insJnlHistoryD();
		}

		protected void setBind() {
			up0().addStringColumn("base_cur_cd", getBaseCur().cur_cd());
			up0().addStringColumn("cntry_cd", getCo().cntry_cd());
			up0().addDateColumn("g_end_dt", getYmEndDt(up0().ac_ym()));
			up0().addStringColumn("g_end_dt_str", up0().getDate("g_end_dt").toString("yyyyMMdd"));
			up0().addStringColumn("sum_non", MAC_SUMMARY_TYP.NON.value());
			up0().addStringColumn("sum_slip", MAC_SUMMARY_TYP.SLIP.value());
			up0().addStringColumn("sum_dd", MAC_SUMMARY_TYP.DD.value());
			up0().addStringColumn("sum_mm", MAC_SUMMARY_TYP.MM.value());
			up0().addStringColumn("ac_io", MAC_AC_TABLE_TYP.AC_IO.value());
			up0().addStringColumn("ac_stk", MAC_AC_TABLE_TYP.AC_STK.value());
			up0().addStringColumn("ac_cost", MAC_AC_TABLE_TYP.AC_COST.value());
			up0().addStringColumn("ac_rcv", MAC_AC_TABLE_TYP.AC_RCV.value());
			up0().addStringColumn("ac_pay", MAC_AC_TABLE_TYP.AC_PAY.value());
			up0().addStringColumn("null_val", MAC_STR.NULL_VAL.value());
			up0().addNumberColumn("rec_cnt", MCNumber.valueOf(0));

			// 対象期間の設定
			up0().addDateColumn("st_dt", (isNull(up0().dt_fr()) ? MCDate.valueOf("10000101", "yyyyMMdd") : up0().dt_fr()).trunc(MCDateFieldType.DAY));
			up0().addDateColumn("end_dt", (isNull(up0().dt_to()) ? MCDate.valueOf("29991231", "yyyyMMdd") : up0().dt_to()).trunc(MCDateFieldType.DAY));
			up0().ac_slip_dt(isNull(up0().ac_slip_dt()) ? up0().getDate("end_dt") : up0().ac_slip_dt().trunc(MCDateFieldType.DAY));

			// 集計コード・プロジェクトコードの設定
			MAM_COL_MAP_R t = MAM_COL_MAP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.sum_col_typ, t.set_col_typ, t.default_cd);
			bldr.setWhere(t.del_flg.eq(value(false)));
			MCList<MAM_COL_MAP_R> result = MCList.create(MAM_COL_MAP_R.class);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), result, bldr);
			
			up0().addStringColumn("prj_set_col_typ", MAC_STR.NULL_VAL.value());
			up0().addStringColumn("prj_default_cd", null);
			up0().addStringColumn("sum0_set_col_typ", MAC_STR.NULL_VAL.value());
			up0().addStringColumn("sum0_default_cd", null);
			up0().addStringColumn("sum1_set_col_typ", MAC_STR.NULL_VAL.value());
			up0().addStringColumn("sum1_default_cd", null);
			up0().addStringColumn("sum2_set_col_typ", MAC_STR.NULL_VAL.value());
			up0().addStringColumn("sum2_default_cd", null);
			up0().addStringColumn("sum3_set_col_typ", MAC_STR.NULL_VAL.value());
			up0().addStringColumn("sum3_default_cd", null);
			up0().addStringColumn("sum4_set_col_typ", MAC_STR.NULL_VAL.value());
			up0().addStringColumn("sum4_default_cd", null);
			up0().addStringColumn("sum5_set_col_typ", MAC_STR.NULL_VAL.value());
			up0().addStringColumn("sum5_default_cd", null);
			
			for (MAM_COL_MAP_R r : result) {
				if (MAC_SUM_COL_TYP.isPROJ(r.sum_col_typ())) {
					up0().addStringColumn("prj_set_col_typ", r.set_col_typ());
					up0().addStringColumn("prj_default_cd", r.default_cd());
				}
				else if (MAC_SUM_COL_TYP.isSUM0(r.sum_col_typ())) {
					up0().addStringColumn("sum0_set_col_typ", r.set_col_typ());
					up0().addStringColumn("sum0_default_cd", r.default_cd());
				}
				else if (MAC_SUM_COL_TYP.isSUM1(r.sum_col_typ())) {
					up0().addStringColumn("sum1_set_col_typ", r.set_col_typ());
					up0().addStringColumn("sum1_default_cd", r.default_cd());
				}
				else if (MAC_SUM_COL_TYP.isSUM2(r.sum_col_typ())) {
					up0().addStringColumn("sum2_set_col_typ", r.set_col_typ());
					up0().addStringColumn("sum2_default_cd", r.default_cd());
				}
				else if (MAC_SUM_COL_TYP.isSUM3(r.sum_col_typ())) {
					up0().addStringColumn("sum3_set_col_typ", r.set_col_typ());
					up0().addStringColumn("sum3_default_cd", r.default_cd());
				}
				else if (MAC_SUM_COL_TYP.isSUM4(r.sum_col_typ())) {
					up0().addStringColumn("sum4_set_col_typ", r.set_col_typ());
					up0().addStringColumn("sum4_default_cd", r.default_cd());
				}
				else if (MAC_SUM_COL_TYP.isSUM5(r.sum_col_typ())) {
					up0().addStringColumn("sum5_set_col_typ", r.set_col_typ());
					up0().addStringColumn("sum5_default_cd", r.default_cd());
				}
			}

			// 金額符号区分の存在チェック
			MAM_SLIP_JNL_R m1 = MAM_SLIP_JNL_R.create("M1");
			MAM_AUTO_JNL_R m2 = MAM_AUTO_JNL_R.create("M2");
			MAM_JNL_PTN_R m3 = MAM_JNL_PTN_R.create("M3");
			bldr = MCQueryApiBuilder.create(m1);
			bldr.addCount(value("X"), "cnt");
			bldr.addInnerJoin(m2, m1.ac_slip_typ.eq(m2.ac_slip_typ)
					.and(nvl(m1.auto_jnl_key_cd, value(MAC_STR.NULL_VAL.value())).eq(nvl(m2.auto_jnl_key_cd, value(MAC_STR.NULL_VAL.value()))))
					.and(m2.del_flg.eq(value(false))));
			bldr.addInnerJoin(m3, m2.jnl_ptn_cd.eq(m3.jnl_ptn_cd)
					.and(m3.amt_sign_typ.isNotNull())
					.and(m3.del_flg.eq(value(false))));
			bldr.addWhereWithAnd(m1.jnl_act_cd.eq(bind("jnl_act_cd")));
			bldr.addWhereWithAnd(m1.del_flg.eq(value(false)));
			MCRow resultR = MCRow.create();
			dbSelect(createSqlId(LOGIC_ID, m1, "S01"), resultR, bldr, up0());
			up0().addBooleanColumn("tmp_num_flg", !resultR.getNumber("cnt").isZero());
		}

		protected void delPreJournal() {
			MBW_PRE_JOURNAL_R t = MBW_PRE_JOURNAL_R.create("T");
			execDbDelete(createSqlId(LOGIC_ID, t, "D01"), t, t.jnl_grp_no.eq(bind("jnl_grp_no")), up0());
		}

		protected void insPreJournal() {
			executeUpdate(MBBBL5030_MBW_PRE_JOURNAL_I01(), up0());
			up0().setNumber("rec_cnt", getPreJournalCnt());
			executeUpdate(MBBBL5030_MBW_PRE_JOURNAL_I02(), up0());
			up0().setNumber("rec_cnt", getPreJournalCnt());
			executeUpdate(MBBBL5030_MBW_PRE_JOURNAL_I03(), up0());
			up0().setNumber("rec_cnt", getPreJournalCnt());
			executeUpdate(MBBBL5030_MBW_PRE_JOURNAL_I04(), up0());
			up0().setNumber("rec_cnt", getPreJournalCnt());
			executeUpdate(MBBBL5030_MBW_PRE_JOURNAL_I05(), up0());
			logger().writeProcessLog(new MCMessage(MBBBD0024, getPreJournalCnt()));
		}
		protected void insJnlHistoryD() {
			executeUpdate(MBBBL5030_MBT_JNL_HISTORYD_I01(), up0());
			executeUpdate(MBBBL5030_MBT_JNL_HISTORYD_I02(), up0());
			executeUpdate(MBBBL5030_MBT_JNL_HISTORYD_I03(), up0());
			executeUpdate(MBBBL5030_MBT_JNL_HISTORYD_I04(), up0());
			executeUpdate(MBBBL5030_MBT_JNL_HISTORYD_I05(), up0());
		}
		protected int getPreJournalCnt() {
			MBW_PRE_JOURNAL_R t = MBW_PRE_JOURNAL_R.create("T");
			return execDbCount(createSqlId(LOGIC_ID, t, "S01"), t);
		}

		protected void jnlMain() {
			if (getPreJournalCnt() == 0) {
				return;
			}
			initJnlNoCtlCache(up0());
			execUpd02();
			mergeJnlNoCtl();
			chkDrCr();
		}
		/**
		 * フェッチサイズ、かつ一度のマルチスレッド処理（doOpeL）で処理するレコード件数<p>
		 */
		protected int getFetchSize() {
			return MCConst.app.getInteger("MB.MBBBL5030.fetch_size", 10000);
		}
		/**
		 * １スレッドで処理するレコード件数<p>
		 */
		protected int getThreadRecordCnt() {
			return MCConst.app.getInteger("MB.MBBBL5030.thread_record_cnt", 1000);
		}
		protected void execUpd02() {
			int threadRecordCnt = getThreadRecordCnt();
			List<AutoJnl_Upd02> opeL = new ArrayList<>();
			MCList<AutoJnl_Upd02_DtlR> upL = MCList.create(AutoJnl_Upd02_DtlR.class);
			AutoJnl_Upd02_DtlR preR = null;
			MCCursor<AutoJnl_Upd02_DtlR> cur = null;
			
			MCServerThreadManager.setUseMainDBTran(false);
			MCServerThreadManager.setCommitAndRollback(true);
			
			// マスタ不備のデータをログ出力
			try {
				cur = openCursor(AutoJnl_Upd02_DtlR.class, MBBBL5030_MBW_PRE_JOURNAL_S02(), up0(), null, getFetchSize());
				
				while (cur.dbFetch() > 0) {
					for (AutoJnl_Upd02_DtlR r : cur.getList()) {
						_rc = 1;
						logger().writeDataLog(new MCMessage(MBBBD0020, r.ac_slip_typ(), r.auto_jnl_key_cd(), toYMDString(r.ac_dt())));
					}
				}
			}
			finally {
				cur.dbCloseCur();
			}
			
			try {
				int i = 0;
				cur = openCursor(AutoJnl_Upd02_DtlR.class, MBBBL5030_MBW_PRE_JOURNAL_S01(), up0(), null, getFetchSize());
				
				while (cur.dbFetch() > 0) {
					for (AutoJnl_Upd02_DtlR r : cur.getList()) {
						if (!isNull(preR)
								&& !isColSame(preR, r, MBW_PRE_JOURNAL_R.$jnl_unit,
										MBW_PRE_JOURNAL_R.$ac_slip_typ,
										MBW_PRE_JOURNAL_R.$auto_jnl_key_cd)) {
							
							if (upL.size() >= threadRecordCnt) {
								opeL.add(getOpe(upL));
								upL = MCList.create(AutoJnl_Upd02_DtlR.class);
								
								if (i >= getFetchSize()) {
									doOpeL(opeL);
									i = 0;
								}
							}
						}
						upL.add(r);
						preR = r;
						i++;
					}
				}
				if (upL.size() > 0) {
					opeL.add(getOpe(upL));
					doOpeL(opeL);
				}
			}
			finally {
				if (cur != null) {
					cur.dbCloseCur();
				}
			}
		}
		protected AutoJnl_Upd02 getOpe(MCList<AutoJnl_Upd02_DtlR> upL) {
			AutoJnl_Upd02 upd02 = crtAutoJnl_Upd02();
			upd02.up0().jnl_grp_no(up0().getString("jnl_grp_no"));
			upd02.up0().ac_ym(up0().ac_ym());
			upd02.up0().ac_ym_next(up0().getDate("ac_ym_next"));
			upd02.up0().end_dt(up0().getDate("g_end_dt"));
			upd02.up0().mon(up0().getNumber("mon"));
			upd02.up1().addAll(upL);
			return upd02;
		}
		protected void doOpeL(List<AutoJnl_Upd02> opeL) {
			if (opeL.size() > 0) {
				MCServerThreadManager.invokeAndWait(opeL, CLAZZ, FXBAL_BatchLogManager.class);

				for (AutoJnl_Upd02 o : opeL) {
					if (o.down0().rc().eq(1)) {
						_rc = 1;
					}
				}
			}
			opeL.clear();
		}
		protected void mergeJnlNoCtl() {
			executeUpdate(MBBBL5030_MBT_JNL_NO_CTL_U01(), up0());
			executeUpdate(MBBBL5030_MBT_JNL_NO_CTL_I01(), up0());
		}
		protected void chkDrCr() {
			MCList<MCRow> rsltL = MCList.create(MCRow.class);
			executeQuery(rsltL, MBBBL5030_MBT_JOURNAL_S02(), up0());
			for (MCRow r : rsltL) {
				_rc = 1;
				logger().writeDataLog(new MCMessage(MBBBD0005, r.getString("jnl_ptn"),
						r.getNumber("dr_base_cur_sum_amt"),
						r.getNumber("cr_base_cur_sum_amt")));
			}
		}

		protected void postMain() {
			chkCount();
			if (_rc == 0) {
				executeUpdate(MBBBL5030_MBT_JNL_HISTORY_U01(), up0());
			}
			if (_rc == 0 || !isSame(getSysParm("AC_JNL_ERR_CNT"),"1")) {
				updAcIo();
				updAcStk();
				updAcCost();
				updAcRcv();
				updAcPay();
			}
			if (_rc != 0) {
				dbTran().commit();
				throw new MCAppException(MBBBD0004);
			}
		}
		protected void chkCount() {
			MCRow rsltR = MCRow.create();
			executeQuery(rsltR, MBBBL5030_MBT_JOURNAL_S01(), up0());
			MBT_JOURNAL_R t = MBT_JOURNAL_R.create("T");
			int drCnt = execDbCount(createSqlId(LOGIC_ID, t, "S01"), t, t.jnl_grp_no.eq(bind("jnl_grp_no")).and(t.dc_typ.eq(value(MAC_DC_TYP.DR.value()))), up0());
			int crCnt = execDbCount(createSqlId(LOGIC_ID, t, "S02"), t, t.jnl_grp_no.eq(bind("jnl_grp_no")).and(t.dc_typ.eq(value(MAC_DC_TYP.CR.value()))), up0());
			logger().writeProcessLog(new MCMessage(MBBBD0025, rsltR.getNumber("cnt"), drCnt+crCnt, drCnt, crCnt));
		}
		protected void updAcIo() {
			MBT_AC_IO_R t = MBT_AC_IO_R.create("T");
			MAM_SLIP_JNL_R m = MAM_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSetVL(t.jnl_fin_cnt, t.jnl_fin_cnt.add(value(1)));
			bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(m)
					.where(t.ac_slip_typ.eq(m.ac_slip_typ)
							.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
							.and(m.del_flg.eq(value(false)))
					)));
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),	MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			dbUpdate(createSqlId(LOGIC_ID, t, "U01"), t, bldr, up0());
		}
		protected void updAcStk() {
			MBT_AC_STK_R t = MBT_AC_STK_R.create("T");
			MAM_SLIP_JNL_R m = MAM_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSetVL(t.jnl_fin_cnt, t.jnl_fin_cnt.add(value(1)));
			bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(m)
					.where(t.ac_slip_typ.eq(m.ac_slip_typ)
							.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
							.and(m.del_flg.eq(value(false)))
					)));
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),	MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			dbUpdate(createSqlId(LOGIC_ID, t, "U01"), t, bldr, up0());
		}
		protected void updAcCost() {
			MBT_AC_COST_R t = MBT_AC_COST_R.create("T");
			MAM_COST_SLIP_JNL_R m = MAM_COST_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSetVL(t.jnl_fin_cnt, t.jnl_fin_cnt.add(value(1)));
			bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(m)
					.where(t.calc_grp_cd.eq(m.calc_grp_cd)
							.and(t.ac_slip_typ.eq(m.ac_slip_typ))
							.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
							.and(m.del_flg.eq(value(false)))
					)));
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),	MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			dbUpdate(createSqlId(LOGIC_ID, t, "U01"), t, bldr, up0());
		}
		protected void updAcRcv() {
			MBT_AC_RCV_R t = MBT_AC_RCV_R.create("T");
			MAM_SLIP_JNL_R m = MAM_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSetVL(t.jnl_fin_cnt, t.jnl_fin_cnt.add(value(1)));
			bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(m)
					.where(t.ac_slip_typ.eq(m.ac_slip_typ)
							.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
							.and(m.del_flg.eq(value(false)))
					)));
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),	MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			dbUpdate(createSqlId(LOGIC_ID, t, "U01"), t, bldr, up0());
		}
		protected void updAcPay() {
			MBT_AC_PAY_R t = MBT_AC_PAY_R.create("T");
			MAM_SLIP_JNL_R m = MAM_SLIP_JNL_R.create("M");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSetVL(t.jnl_fin_cnt, t.jnl_fin_cnt.add(value(1)));
			bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(m)
					.where(t.ac_slip_typ.eq(m.ac_slip_typ)
							.and(m.jnl_act_cd.eq(bind("jnl_act_cd")))
							.and(m.del_flg.eq(value(false)))
					)));
			bldr.addWhereWithAnd(t.ac_ym.eq(bind("ac_ym")));
			bldr.addWhereWithAnd(t.ac_dt.between(
					nvl(trunc(bind("dt_fr"),	MCDateFmt.DD), toDate(value("10000101"),MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD)), 
					nvl(trunc(bind("dt_to"),MCDateFmt.DD), toDate(value("29991231"),MCDateTimeFmt.YYYY,MCDateTimeFmt.MM,MCDateTimeFmt.DD))));
			bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")).or(bind("wg_cd").isNull()));
			bldr.addWhereWithAnd(bind("rerun_flg").eq(value(true)).or(t.jnl_fin_cnt.eq(value(0))));
			dbUpdate(createSqlId(LOGIC_ID, t, "U01"), t, bldr, up0());
		}
		
		protected String getJnlGrpNo() {
			String jnlGrpNo = null;
			boolean err_flg = false;
			
			MBT_JNL_GRP_NO_CTL_R t = MBT_JNL_GRP_NO_CTL_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.jnl_grp_no);
			MBT_JNL_GRP_NO_CTL_R result = MBT_JNL_GRP_NO_CTL_R.create();
			int cnt = dbSelect(createSqlId(LOGIC_ID, t, "S01"), result, bldr);
			
			if (cnt == 0) {
				jnlGrpNo = lpad(1, mcframe.commonMA.meta.MA_META.JNL_GRP_NO.length(), "0");
				try {
					MBT_JNL_GRP_NO_CTL_R r = MBT_JNL_GRP_NO_CTL_R.create();
					r.jnl_grp_no(jnlGrpNo);
					dbInsert(createSqlId(LOGIC_ID, t, "I01"), r, MCQueryApiBuilder.create(t));
				}
				catch (MCException ex) {
					err_flg = true;
				}
			}
			if (cnt > 0 || err_flg) {
				dbSelectForUpdateNoWait(createSqlId(LOGIC_ID, t, "S01"), result, bldr);
				jnlGrpNo = lpad(MCNumber.valueOf(result.jnl_grp_no()).add(1).intValue(), mcframe.commonMA.meta.MA_META.JNL_GRP_NO.length(), "0");
				
				bldr = MCQueryApiBuilder.create(t);
				bldr.setSet(t.jnl_grp_no);
				MBT_JNL_GRP_NO_CTL_R r = MBT_JNL_GRP_NO_CTL_R.create();
				r.jnl_grp_no(jnlGrpNo);
				dbUpdate(createSqlId(LOGIC_ID, t, "U01"), r, bldr);
				
				dbTran().commit();
			}
			return jnlGrpNo;
		}
	}

	/**
	 * AutoJnl_Upd02オペレーション.<p>
	 *
	 * 仕訳処理を行う。マルチスレッド処理。<br>
	 */
	public class AutoJnl_Upd02 extends MBBBL_AutoJnlService_MC_A.AutoJnl_Upd02 {
		
		protected FXBAL_BatchLogger _logger = null;
		protected int _jnlUnitLength = mcframe.commonMA.meta.MA_META.JNL_UNIT.length();
		protected int _absLength = mcframe.commonMA.meta.MA_META.ABSTRACT_T.length();
		protected MCList<MBW_JOURNAL_R> _wJnlL;
		protected MCIndexKey _wJnlIdxKey;
		
		protected String _jnlUnit;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initLogger();
				jnlPrep();
				jnlMain();
				jnlEndDt();
			}
			finally {
				closeLogger();
				clearCache();
			}
		}
		
		protected void initLogger() {
			if (MCServerThreadManager.isUseMainDBTran()) {
				_logger = logger();
			}
			else {
				_logger = logger().clone();
			}
		}
		
		protected void closeLogger() {
			if (!MCServerThreadManager.isUseMainDBTran()) {
				_logger.close();
			}
		}

		protected void clearCache() {
			_logger = null;
			_wJnlL = null;
			_wJnlIdxKey = null;
			_autoJnlCache = null;
			_autoJnlIdxKey = null;
			_acDptCache = null;
			_jnlPtnCache = null;
			_jnlPtnIdxKey = null;
			_rsnAcCache = null;
			_rsnAcIdxKey = null;
			_jnlAcCache = null;
			_jnlAcIdxKey = null;
			_bacAcCache = null;
			_bacAcIdxKey = null;
			_accountCache = null;
			_acTaxCache = null;
			_stdCostCache = null;
			_bankAcCache = null;
			_bpCache = null;
			_curCache = null;
			up1().clear();
		}
		
		protected void jnlPrep() {
			down0().rc(0);
			setTerm();
			setDigit();
			setCache();
		}
		protected void setTerm() {
			MAM_TERM_R t = MAM_TERM_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(nvl(
					min(t.term),
					toDate(
						value("29991231"),
						MCDateTimeFmt.YYYY,
						MCDateTimeFmt.MM,
						MCDateTimeFmt.DD
					)
				).as(MAM_TERM_R.$term));
			bldr.setWhere(t.term.lte(bind("ac_ym")).and(t.term_end_ym.gt(bind("ac_ym"))));
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), t, bldr, up0());
			up0().addDateColumn("term", t.term());
		}
		protected void setDigit() {
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(nvl(
					min(t.amt_dec_place),
					value(0)
				).as(MAM_CUR_R.$amt_dec_place));
			bldr.setWhere(t.cur_cd.eq(value(getCo().base_cur_cd())));
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), t, bldr, up0());
			up0().addNumberColumn("digit", t.amt_dec_place());
		}
		protected void setCache() {
			initAutoJnlCache();
			initAcDptCache();
			initJnlPtnCache();
			initRsnAcCache();
			initJnlAcCache();
			initBacAcCache();
			initAccountCache();
		}
		
		protected void jnlMain() {
			AutoJnl_Upd02_DtlR preJnl = null;
			int jnlPtnCnt = 0;
			int jnlNoTmp;
			_wJnlL = MCList.create(MBW_JOURNAL_R.class);
			
			for (AutoJnl_Upd02_DtlR x : up1()) {
				String autoJnlGrp = null ;
				boolean jnlChk = false ;
				
				MCList<MAM_AUTO_JNL_R> y1L = getAutoJnlL(x.ac_slip_typ(), x.auto_jnl_key_cd(), x.ac_dt());
				for (MAM_AUTO_JNL_R y1 : y1L) {
					
					if (isNull(autoJnlGrp) || !isSame(autoJnlGrp, y1.auto_jnl_grp())) {
						if (!jnlChk && !isNull(autoJnlGrp)) {
							down0().rc(1);
							_logger.writeDataLog(new MCMessage(MBBBD0021, preJnl.ac_slip_typ(), preJnl.auto_jnl_key_cd(), autoJnlGrp,
									toDispItm(preJnl.itm_cd(), preJnl.itm_sub1(), preJnl.itm_sub2(), preJnl.itm_sub3()),
									preJnl.slip_no()));
						}
						autoJnlGrp = y1.auto_jnl_grp();
						preJnl = x;
						jnlChk = false ;
						
						jnlPtnCnt = y1L.subList(MAM_AUTO_JNL_R.$auto_jnl_grp, y1.auto_jnl_grp()).size();
					}
					if (jnlChk) {
						continue;
					}
					// 伝票ＩＤの設定
					String id = getSlipCntId(x, y1);
					if (isNull(id)) {
						continue;
					}
					
					jnlPtnCnt = jnlPtnCnt - 1;
					
					MCList<MBW_JOURNAL_R> wJnlDrL = MCList.create(MBW_JOURNAL_R.class);
					MCList<MBW_JOURNAL_R> wJnlCrL = MCList.create(MBW_JOURNAL_R.class);
					MCNumber sumD = MCNumber.ZERO;
					MCNumber sumC = MCNumber.ZERO;
					boolean amtChk = false;
					
					for (MAM_JNL_PTN_R y2 : getJnlPtnL(y1.jnl_ptn_cd())) {
						IF_BLOCK1:if (y1.default_flg()
								|| (isNull(y2.itm_cd()) || isSame(y2.itm_cd(), x.itm_cd()))
								&& (isNull(y2.itm_sub1()) || isSame(y2.itm_sub1(), x.itm_sub1()))
								&& (isNull(y2.itm_sub2()) || isSame(y2.itm_sub2(), x.itm_sub2()))
								&& (isNull(y2.itm_sub3()) || isSame(y2.itm_sub3(), x.itm_sub3()))
								&& (isNull(y2.itm_jnl_cd()) || isSame(y2.itm_jnl_cd(), x.itm_jnl_cd()))
								&& (isNull(y2.ac_rsn_cd()) || isSame(y2.ac_rsn_cd(), x.ac_rsn_cd()))
								&& (isNull(y2.purc_typ()) || isSame(y2.purc_typ(), x.purc_typ()))
								&& (isNull(y2.un_fix_typ())
										|| MAC_UN_FIX_TYP.isFIX(y2.un_fix_typ()) && !x.un_fix_flg() && !x.temp_ap_flg()
										|| MAC_UN_FIX_TYP.isUN_FIX(y2.un_fix_typ()) && x.un_fix_flg()
										|| MAC_UN_FIX_TYP.isTEMP_AP(y2.un_fix_typ()) && x.temp_ap_flg())
								&& (isNull(y2.foreign_typ()) || isSame(y2.foreign_typ(), MCBooleanUtil.booleanToDBString(x.foreign_flg())))
								&& (isNull(y2.cur_cd()) || isSame(y2.cur_cd(), x.trd_cur_cd()))
								&& (isNull(y2.asst_typ()) || isSame(y2.asst_typ(), x.asst_typ()))
								&& (isNull(y2.quality_typ()) || isSame(y2.quality_typ(), x.quality_typ()))
								&& (isNull(y2.inv_loc_typ()) || isSame(y2.inv_loc_typ(), x.inv_loc_typ()))
								&& (isNull(y2.jnl_key1()) || isMatches(x.jnl_key1(), y2.jnl_key1()))
								&& (isNull(y2.jnl_key2()) || isMatches(x.jnl_key2(), y2.jnl_key2()))
								&& (isNull(y2.jnl_key3()) || isMatches(x.jnl_key3(), y2.jnl_key3()))
								&& (isNull(y2.jnl_key4()) || isMatches(x.jnl_key4(), y2.jnl_key4()))
								&& (isNull(y2.jnl_key5()) || isMatches(x.jnl_key5(), y2.jnl_key5()))
								&& (isNull(y2.jnl_key6()) || isMatches(x.jnl_key6(), y2.jnl_key6()))
								&& (isNull(y2.jnl_key7()) || isMatches(x.jnl_key7(), y2.jnl_key7()))
								&& (isNull(y2.jnl_key8()) || isMatches(x.jnl_key8(), y2.jnl_key8()))
								&& (isNull(y2.jnl_key9()) || isMatches(x.jnl_key9(), y2.jnl_key9()))
								&& (isNull(y2.jnl_key10()) || isMatches(x.jnl_key10(), y2.jnl_key10()))
								&& (up0().mon().eq(1) && !y2.mon01_invalid_flg()
										|| up0().mon().eq(2) && !y2.mon02_invalid_flg()
										|| up0().mon().eq(3) && !y2.mon03_invalid_flg()
										|| up0().mon().eq(4) && !y2.mon04_invalid_flg()
										|| up0().mon().eq(5) && !y2.mon05_invalid_flg()
										|| up0().mon().eq(6) && !y2.mon06_invalid_flg()
										|| up0().mon().eq(7) && !y2.mon07_invalid_flg()
										|| up0().mon().eq(8) && !y2.mon08_invalid_flg()
										|| up0().mon().eq(9) && !y2.mon09_invalid_flg()
										|| up0().mon().eq(10) && !y2.mon10_invalid_flg()
										|| up0().mon().eq(11) && !y2.mon11_invalid_flg()
										|| up0().mon().eq(12) && !y2.mon12_invalid_flg()
								)
						) {
							editY2(y2, x);
							jnlNoTmp = getJnlNoTmp();
							_jnlUnit = null;
							int cnt = wJnlDrL.size();
							// 借方レコードの作成
							int rc = doProcJnl(x, y1, y2, MAC_DC_TYP.DR.value(), jnlNoTmp, jnlPtnCnt, id, wJnlDrL);
							if (rc != 0) {
								if (rc != 2) {
									down0().rc(1);
								}
								break IF_BLOCK1;
							}
							// 貸方レコードの作成
							rc = doProcJnl(x, y1, y2, MAC_DC_TYP.CR.value(), jnlNoTmp, jnlPtnCnt, id, wJnlCrL);
							if (rc != 0) {
								if (rc != 2) {
									down0().rc(1);
								}
								break IF_BLOCK1;
							}
							
							jnlChk = true;
							cnt = wJnlDrL.size() - cnt;
							
							if (wJnlDrL.size() == wJnlCrL.size()) {
								MBW_JOURNAL_R wJnlDrR = null;
								MBW_JOURNAL_R wJnlCrR = null;
								int idx = wJnlDrL.size() - 1;
								if (idx >= 0) {
									wJnlDrR = wJnlDrL.get(idx);
									wJnlCrR = wJnlCrL.get(idx);
								}
								if (cnt > 0) {
									if (!isNull(wJnlDrR.bp_cd()) || !isNull(wJnlCrR.bp_cd())) {
										_jnlUnit = subStr(_jnlUnit + ";" + nvl(wJnlDrR.bp_cd(), wJnlCrR.bp_cd()), _jnlUnitLength);
									}
									if (!isNull(wJnlDrR.xrate_cd())) {
										_jnlUnit = subStr(_jnlUnit + ";" + wJnlDrR.xrate_cd() + ";" + wJnlDrR.xrate(), _jnlUnitLength);
									}
									
									if (!isNull(wJnlDrR.bp_cd())
											&& !isNull(wJnlCrR.bp_cd())
											&& !isSame(wJnlDrR.bp_cd(), wJnlCrR.bp_cd())) {
										_jnlUnit = subStr(_jnlUnit + ";" + wJnlCrR.bp_cd(), _jnlUnitLength);
									}
									if (!isNull(wJnlCrR.xrate_cd())) {
										_jnlUnit = subStr(_jnlUnit + ";" + wJnlCrR.xrate_cd() + ";" + wJnlCrR.xrate(), _jnlUnitLength);
									}
									wJnlDrR.jnl_unit(_jnlUnit);
									wJnlCrR.jnl_unit(_jnlUnit);
								}
								if (cnt == 0) {
									// 何もしない
								}
								else if (wJnlDrR.base_cur_sum_amt().isZero() && wJnlCrR.base_cur_sum_amt().isZero()) {
									wJnlDrL.remove(idx);
									wJnlCrL.remove(idx);
								}
								else if (wJnlDrR.base_cur_sum_amt().eq(wJnlCrR.base_cur_sum_amt()) && chkJnl(wJnlDrR, wJnlCrR)) {
									wJnlDrL.remove(idx);
									wJnlCrL.remove(idx);
								}
								else {
									sumD = sumD.add(wJnlDrR.base_cur_sum_amt());
									sumC = sumC.add(wJnlCrR.base_cur_sum_amt());
									if (wJnlDrR.base_cur_sum_amt().neq(wJnlCrR.base_cur_sum_amt())) {
										amtChk = true;
									}
								}
							}
							else {
								if (wJnlDrL.size() > wJnlCrL.size()) {
									wJnlDrL.remove(wJnlDrL.size() - 1);
								}
								else {
									wJnlCrL.remove(wJnlCrL.size() - 1);
								}
							}
						} // IF_BLOCK1 END
						
						if (wJnlDrL.size() > wJnlCrL.size()) {
							wJnlDrL.remove(wJnlDrL.size() - 1);
						}
						else if (wJnlDrL.size() < wJnlCrL.size()) {
							wJnlCrL.remove(wJnlCrL.size() - 1);
						}
					}
					
					if (wJnlDrL.size() == 0 && wJnlCrL.size() == 0) {
						continue;
					}
					if (sumD.neq(sumC)) {
						down0().rc(1);
						_logger.writeDataLog(new MCMessage(MBBBD0005, y1.jnl_ptn_cd(), sumD, sumC));
						continue;
					}
					if (!amtChk) {
						sumD = null;
						sumC = null;
					}
					setMbwData(wJnlDrL, y1.rev_flg(), y1.minus_rev_flg(), sumD);
					setMbwData(wJnlCrL, y1.rev_flg(), y1.minus_rev_flg(), sumC);
				}
				if (!jnlChk && !isNull(autoJnlGrp)) {
					down0().rc(1);
					_logger.writeDataLog(new MCMessage(MBBBD0021, preJnl.ac_slip_typ(), preJnl.auto_jnl_key_cd(), autoJnlGrp,
							toDispItm(preJnl.itm_cd(), preJnl.itm_sub1(), preJnl.itm_sub2(), preJnl.itm_sub3()),
							preJnl.slip_no()));
				}
			}
		}
		
		protected boolean isMatches(String tgtStr, String chkStr) {
			if (isNull(tgtStr)) {
				return false;
			}
			String regex = chkStr.replaceAll("%", ".*").replaceAll("_", ".");
			return tgtStr.matches(regex);
		}
		
		protected void editY2(MAM_JNL_PTN_R y2, AutoJnl_Upd02_DtlR x) {
			// DR
			if (!MAC_PTN_TYP.isMST(y2.dr_ptn_typ())) {
				if (MAC_PTN_TYP.isRSN(y2.dr_ptn_typ())) {
					MAM_RSN_AC_R m = getRsnAcR(y2.dr_grp_cd(), x.ac_rsn_cd());
					y2.dr_ac_cd(m.ac_cd());
					y2.dr_sub_ac_cd(m.sub_ac_cd());
					y2.dr_bp_typ(m.bp_typ());
					y2.dr_bp_cd(m.bp_cd());
					y2.dr_itm_typ(m.itm_typ());
					y2.dr_amt_typ(m.amt_typ());
					y2.dr_abs_typ(m.abs_typ());
					y2.dr_abstract(m.abstract2());
					y2.dr_ac_tax_cd(m.ac_tax_cd());
				}
				else if (MAC_PTN_TYP.isJNL(y2.dr_ptn_typ())) {
					MAM_JNL_AC_R m = getJnlAcR(y2.dr_grp_cd(), x.itm_jnl_cd());
					y2.dr_ac_cd(m.ac_cd());
					y2.dr_sub_ac_cd(m.sub_ac_cd());
					y2.dr_bp_typ(m.bp_typ());
					y2.dr_bp_cd(m.bp_cd()); //c_fix
					y2.dr_itm_typ(m.itm_typ());
					y2.dr_amt_typ(m.amt_typ());
					y2.dr_abs_typ(m.abs_typ());
					y2.dr_abstract(m.abstract2());
					y2.dr_ac_tax_cd(m.ac_tax_cd());
				}
				else if (MAC_PTN_TYP.isAC(y2.dr_ptn_typ())) {
					MAM_BAC_AC_R m = getBacAcR(y2.dr_grp_cd(), x.bank_ac_cd());
					y2.dr_ac_cd(m.ac_cd());
					y2.dr_sub_ac_cd(m.sub_ac_cd());
					y2.dr_bp_typ(m.bp_typ());
					y2.dr_bp_cd(m.bp_cd()); //c_fix
					y2.dr_itm_typ(m.itm_typ());
					y2.dr_amt_typ(m.amt_typ());
					y2.dr_abs_typ(m.abs_typ());
					y2.dr_abstract(m.abstract2());
					y2.dr_ac_tax_cd(m.ac_tax_cd());
				}
			}
			// CR
			if (!MAC_PTN_TYP.isMST(y2.cr_ptn_typ())) {
				if (MAC_PTN_TYP.isRSN(y2.cr_ptn_typ())) {
					MAM_RSN_AC_R m = getRsnAcR(y2.cr_grp_cd(), x.ac_rsn_cd());
					y2.cr_ac_cd(m.ac_cd());
					y2.cr_sub_ac_cd(m.sub_ac_cd());
					y2.cr_bp_typ(m.bp_typ());
					y2.cr_bp_cd(m.bp_cd());
					y2.cr_itm_typ(m.itm_typ());
					y2.cr_amt_typ(m.amt_typ());
					y2.cr_abs_typ(m.abs_typ());
					y2.cr_abstract(m.abstract2());
					y2.cr_ac_tax_cd(m.ac_tax_cd());
				}
				else if (MAC_PTN_TYP.isJNL(y2.cr_ptn_typ())) {
					MAM_JNL_AC_R m = getJnlAcR(y2.cr_grp_cd(), x.itm_jnl_cd());
					y2.cr_ac_cd(m.ac_cd());
					y2.cr_sub_ac_cd(m.sub_ac_cd());
					y2.cr_bp_typ(m.bp_typ());
					y2.cr_bp_cd(m.bp_cd()); //c_fix
					y2.cr_itm_typ(m.itm_typ());
					y2.cr_amt_typ(m.amt_typ());
					y2.cr_abs_typ(m.abs_typ());
					y2.cr_abstract(m.abstract2());
					y2.cr_ac_tax_cd(m.ac_tax_cd());
				}
				else if (MAC_PTN_TYP.isAC(y2.cr_ptn_typ())) {
					MAM_BAC_AC_R m = getBacAcR(y2.cr_grp_cd(), x.bank_ac_cd());
					y2.cr_ac_cd(m.ac_cd());
					y2.cr_sub_ac_cd(m.sub_ac_cd());
					y2.cr_bp_typ(m.bp_typ());
					y2.cr_bp_cd(m.bp_cd()); //c_fix
					y2.cr_itm_typ(m.itm_typ());
					y2.cr_amt_typ(m.amt_typ());
					y2.cr_abs_typ(m.abs_typ());
					y2.cr_abstract(m.abstract2());
					y2.cr_ac_tax_cd(m.ac_tax_cd());
				}
			}
		}
		
		protected int doProcJnl(AutoJnl_Upd02_DtlR r, MAM_AUTO_JNL_R jnlR, MAM_JNL_PTN_R ptnR, String dcTyp, int jnlNoTmp, int jnlPtnCnt, String id, MCList<MBW_JOURNAL_R> ioList) {
			int rc = 0;
			MAM_JNL_PTN_R ptn = ptnR.clone();
			if (MAC_DC_TYP.isDR(dcTyp)) {
				// 何もしない
			}
			else {
				// あとの処理を共通とするため、CRの場合のみcr_**をdr_**に転記
				ptn.dr_dpt_typ(ptnR.cr_dpt_typ());
				ptn.dr_dpt_cd(ptnR.cr_dpt_cd());
				ptn.dr_ptn_typ(ptnR.cr_ptn_typ());
				ptn.dr_grp_cd(ptnR.cr_grp_cd());
				ptn.dr_ac_cd(ptnR.cr_ac_cd());
				ptn.dr_sub_ac_cd(ptnR.cr_sub_ac_cd());
				ptn.dr_bp_typ(ptnR.cr_bp_typ());
				ptn.dr_bp_cd(ptnR.cr_bp_cd());
				ptn.dr_itm_typ(ptnR.cr_itm_typ());
				ptn.dr_amt_typ(ptnR.cr_amt_typ());
				ptn.dr_abs_typ(ptnR.cr_abs_typ());
				ptn.dr_abstract(ptnR.cr_abstract());
				ptn.dr_ac_tax_cd(ptnR.cr_ac_tax_cd());
				ptn.dr_trd_sml_flg(ptnR.cr_trd_sml_flg());
				ptn.cr_dpt_typ(ptnR.dr_dpt_typ());
				ptn.cr_dpt_cd(ptnR.dr_dpt_cd());
				ptn.cr_ac_cd(ptnR.dr_ac_cd());
				ptn.cr_sub_ac_cd(ptnR.dr_sub_ac_cd());
			}
			// 以降、自動仕訳パタンマスタのレコードはptnのdr_**をメインに参照する

			if (isNull(ptn.dr_ac_cd()) && !MAC_PTN_TYP.isMST(ptn.dr_ptn_typ())) {
				if (jnlPtnCnt != 0 && !jnlR.default_flg()) {
					return 2;
				}
				if (MAC_PTN_TYP.isRSN(ptn.dr_ptn_typ())) {
					_logger.writeDataLog(new MCMessage(MBBBD0006, jnlR.jnl_ptn_cd(), ptn.jnl_seq(), r.ac_rsn_cd(), ptn.dr_grp_cd()));
				}
				else if (MAC_PTN_TYP.isJNL(ptn.dr_ptn_typ())) {
					_logger.writeDataLog(new MCMessage(MBBBD0007, jnlR.jnl_ptn_cd(), ptn.jnl_seq(), r.itm_jnl_cd(), ptn.dr_grp_cd()));
				}
				else if (MAC_PTN_TYP.isAC(ptn.dr_ptn_typ())) {
					_logger.writeDataLog(new MCMessage(MBBBD0008, jnlR.jnl_ptn_cd(), ptn.jnl_seq(), r.bank_ac_cd(), ptn.dr_grp_cd()));
				}
				else {
					_logger.writeDataLog(new MCMessage(MBBBD0009, jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
				}
				return 1;
			}
			MAM_ACCOUNT_R acR = getAccountR(ptn.dr_ac_cd());
			if (isNull(acR)) {
				_logger.writeDataLog(new MCMessage(MBBBD0010, jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
				return 1;
			}
			// 金額情報の作成
			MCNumber stdAmt = null; 
			if (!MAC_AMT_TYP.contains(ptn.dr_amt_typ())) {
				throw new MCAppException(MBBBD0011, jnlR.jnl_ptn_cd(), ptn.jnl_seq(), ptn.dr_amt_typ());
			}
			else if (MAC_AMT_TYP.isNON_JNL(ptn.dr_amt_typ())) {
				return 0;
			}
			if (MAC_AMT_TYP.isSTD(ptn.dr_amt_typ()) || MAC_AMT_TYP.isAMT_STD(ptn.dr_amt_typ())) {
				stdAmt = getStdCost(r, jnlR);
				if (isNull(stdAmt)) {
					_logger.writeDataLog(new MCMessage(MBBBD0012, toYMString(up0().getDate("term")),
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.wg_cd()));
					return 1;
				}
			}
			
			MCNumber amt = MCNumber.ZERO;
			MCNumber taxAmt = MCNumber.ZERO;
			MCNumber amtTr = MCNumber.ZERO;
			MCNumber taxAmtTr = MCNumber.ZERO;
			MCNumber amtPt = MCNumber.ZERO;
			MCNumber taxAmtPt = MCNumber.ZERO;
			MCNumber taxBaseAmt = MCNumber.ZERO;
			MCNumber taxBaseAmtTr = MCNumber.ZERO;
			MCNumber taxBaseAmtPt = MCNumber.ZERO;
			
			if (MAC_AMT_TYP.isZERO(ptn.dr_amt_typ())) {
				// 何もしない
			}
			else if (MAC_AMT_TYP.isNON_JNL(ptn.dr_amt_typ())) {
				// 何もしない
			}
			else if (MAC_AMT_TYP.isAMT_TAX(ptn.dr_amt_typ())) {
				amt = r.base_cur_amt();
				taxAmt = r.base_cur_tax_amt();
				amtTr = r.trd_cur_amt();
				taxAmtTr = r.trd_cur_tax_amt();
				amtPt = r.ptax_cur_amt();
				taxAmtPt = r.ptax_cur_tax_amt();
			}
			else if (MAC_AMT_TYP.isAMT_ONLY(ptn.dr_amt_typ())) {
				amt = r.base_cur_amt();
				amtTr = r.trd_cur_amt();
				amtPt = r.ptax_cur_amt();
			}
			else if (MAC_AMT_TYP.isTAX_IN_AMT(ptn.dr_amt_typ())) {
				amt = r.base_cur_tax_amt();
				amtTr = r.trd_cur_tax_amt();
				amtPt = r.ptax_cur_tax_amt();
				taxBaseAmt = r.base_cur_amt();
				taxBaseAmtTr = r.trd_cur_amt();
				taxBaseAmtPt = r.ptax_cur_amt();
			}
			else if (MAC_AMT_TYP.isTAX_IN_TAX(ptn.dr_amt_typ())) {
				taxAmt = r.base_cur_tax_amt();
				taxAmtTr = r.trd_cur_tax_amt();
				taxAmtPt = r.ptax_cur_tax_amt();
				taxBaseAmt = r.base_cur_amt();
				taxBaseAmtTr = r.trd_cur_amt();
				taxBaseAmtPt = r.ptax_cur_amt();
			}
			else if (MAC_AMT_TYP.isSML(ptn.dr_amt_typ())) {
				amt = r.base_cur_amt().add(r.base_cur_tax_amt());
				amtTr = r.trd_cur_amt().add(r.trd_cur_tax_amt());
				amtPt = r.ptax_cur_amt().add(r.ptax_cur_tax_amt());
			}
			else if (MAC_AMT_TYP.isSTD(ptn.dr_amt_typ())) {
				amt = stdAmt;
			}
			else if (MAC_AMT_TYP.isAMT_STD(ptn.dr_amt_typ())) {
				amt = r.base_cur_amt().subtract(stdAmt);
			}
			else if (MAC_AMT_TYP.isPROC_AMT_TAX(ptn.dr_amt_typ())) {
				amt = r.base_cur_proc_amt();
				taxAmt = r.base_cur_tax_amt();
				amtTr = r.trd_cur_proc_amt();
				taxAmtTr = r.trd_cur_tax_amt();
				amtPt = r.ptax_cur_proc_amt();
				taxAmtPt = r.ptax_cur_tax_amt();
			}
			else if (MAC_AMT_TYP.isPROC_AMT_ONLY(ptn.dr_amt_typ())) {
				amt = r.base_cur_proc_amt();
				amtTr = r.trd_cur_proc_amt();
				amtPt = r.ptax_cur_proc_amt();
			}
			else if (MAC_AMT_TYP.isPROC_SML(ptn.dr_amt_typ())) {
				amt = r.base_cur_proc_amt().add(r.base_cur_tax_amt());
				amtTr = r.trd_cur_proc_amt().add(r.trd_cur_tax_amt());
				amtPt = r.ptax_cur_proc_amt().add(r.ptax_cur_tax_amt());
			}
			else if (MAC_AMT_TYP.isONR_PROV_AMT(ptn.dr_amt_typ())) {
				amt = r.base_cur_onr_prov_amt();
				amtTr = r.trd_cur_onr_prov_amt();
				amtPt = r.ptax_cur_onr_prov_amt();
			}
			else {
				// 何もしない
			}
			
			MCNumber sum = r.base_cur_amt().add(r.base_cur_tax_amt());
			if (jnlR.default_flg()
					|| isNull(ptn.amt_sign_typ())
					|| MAC_AMT_SIGN_TYP.isPLS(ptn.amt_sign_typ()) && sum.gte(0) && !r.can_flg()
					|| MAC_AMT_SIGN_TYP.isPLS(ptn.amt_sign_typ()) && sum.lte(0) && r.can_flg()
					|| MAC_AMT_SIGN_TYP.isMNS(ptn.amt_sign_typ()) && sum.lte(0) && !r.can_flg()
					|| MAC_AMT_SIGN_TYP.isMNS(ptn.amt_sign_typ()) && sum.gte(0) && r.can_flg()) {
				// 何もしない
			}
			else {
				return 2;
			}
			
			MBW_JOURNAL_R ioRow = MBW_JOURNAL_R.create();
			ioList.add(ioRow);
			ioRow.jnl_grp_no(up0().jnl_grp_no());
			ioRow.ac_if_typ(jnlR.ac_if_typ());
			ioRow.slip_cnt_id(id);
			ioRow.jnl_ptn_cd(jnlR.jnl_ptn_cd());
			ioRow.jnl_seq(ptn.jnl_seq());
			ioRow.dc_typ(dcTyp);
			ioRow.jnl_no(String.valueOf(jnlNoTmp));
			ioRow.jnl_no_seq(1);
			if (ptn.carry_flg()) {
				ioRow.ac_ym(up0().ac_ym_next());
				ioRow.ac_slip_dt(up0().end_dt().addDay(1));
				ioRow.ac_dt(up0().end_dt().addDay(1));
			}
			else {
				ioRow.ac_ym(up0().ac_ym());
				ioRow.ac_slip_dt(r.ac_slip_dt());
				ioRow.ac_dt(r.ac_dt());
			}
			ioRow.slip_no(r.slip_no());
			ioRow.slip_seq_no(r.slip_seq_no());
			
			ioRow.ac_cd(ptn.dr_ac_cd());
			
			if (acR.sub_flg()) {
				if (isNull(ptn.dr_sub_ac_cd())) {
					_logger.writeDataLog(new MCMessage(MBBBD0013, ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
				ioRow.sub_ac_cd(ptn.dr_sub_ac_cd());
			}
			
			MCNumber qty = r.trd_unit_qty();
			String unitCd = r.trd_unit_cd();
			if (MAC_ITM_SET_TYP.isITM(ptn.dr_itm_typ())) {
				ioRow.itm_cd(r.itm_cd());
				ioRow.itm_sub1(r.itm_sub1());
				ioRow.itm_sub2(r.itm_sub2());
				ioRow.itm_sub3(r.itm_sub3());
				ioRow.itm_nm(r.itm_nm());
			}
			else if (MAC_ITM_SET_TYP.isCST(ptn.dr_itm_typ())) {
				if (isNull(r.cst_itm_cd())) {
					ioRow.itm_cd(r.itm_cd());
					ioRow.itm_sub1(r.itm_sub1());
					ioRow.itm_sub2(r.itm_sub2());
					ioRow.itm_sub3(r.itm_sub3());
				}
				else {
					ioRow.itm_cd(r.cst_itm_cd());
					ioRow.itm_sub1(null);
					ioRow.itm_sub2(null);
					ioRow.itm_sub3(null);
				}
				ioRow.itm_nm(nvl(r.cst_itm_nm(), r.itm_nm()));
			}
			else if (MAC_ITM_SET_TYP.isSPL(ptn.dr_itm_typ())) {
				if (isNull(r.sppl_itm_cd())) {
					ioRow.itm_cd(r.itm_cd());
					ioRow.itm_sub1(r.itm_sub1());
					ioRow.itm_sub2(r.itm_sub2());
					ioRow.itm_sub3(r.itm_sub3());
				}
				else {
					ioRow.itm_cd(r.sppl_itm_cd());
					ioRow.itm_sub1(null);
					ioRow.itm_sub2(null);
					ioRow.itm_sub3(null);
				}
				ioRow.itm_nm(nvl(r.sppl_itm_nm(), r.itm_nm()));
			}
			else if (MAC_ITM_SET_TYP.isTRD(ptn.dr_itm_typ())) {
				ioRow.itm_cd(r.trd_itm_cd());
				ioRow.itm_sub1(r.trd_itm_sub1());
				ioRow.itm_sub2(r.trd_itm_sub2());
				ioRow.itm_sub3(r.trd_itm_sub3());
				ioRow.itm_nm(r.trd_itm_nm());
				qty = MCNumber.ZERO;
				unitCd = null;
			}
			else {
				ioRow.itm_cd(null);
				ioRow.itm_sub1(null);
				ioRow.itm_sub2(null);
				ioRow.itm_sub3(null);
				ioRow.itm_nm(null);
				qty = MCNumber.ZERO;
				unitCd = null;
			}
			
			ioRow.bp_typ(null);
			ioRow.bp_cd(null);
			if (acR.bp_flg()) {
				if (MAC_BP_SET_TYP.isAR(ptn.dr_bp_typ())) {
					if (!isNull(r.acst_cd()) || !isNull(ptn.dr_bp_cd())) {
						ioRow.bp_typ(MAC_MASTER_TYP.CST.value());
						ioRow.bp_cd(nvl(r.acst_cd(), ptn.dr_bp_cd()));
					}
				}
				else if (MAC_BP_SET_TYP.isCST(ptn.dr_bp_typ())) {
					if (!isNull(r.cst_cd()) || !isNull(ptn.dr_bp_cd())) {
						ioRow.bp_typ(MAC_MASTER_TYP.CST.value());
						ioRow.bp_cd(nvl(r.cst_cd(), ptn.dr_bp_cd()));
					}
				}
				else if (MAC_BP_SET_TYP.isSPL(ptn.dr_bp_typ())) {
					if (!isNull(r.sppl_cd()) || !isNull(ptn.dr_bp_cd())) {
						ioRow.bp_typ(MAC_MASTER_TYP.SPL.value());
						ioRow.bp_cd(nvl(r.sppl_cd(), ptn.dr_bp_cd()));
					}
				}
				else if (MAC_BP_SET_TYP.isAP(ptn.dr_bp_typ())) {
					if (!isNull(r.asppl_cd()) || !isNull(ptn.dr_bp_cd())) {
						ioRow.bp_typ(MAC_MASTER_TYP.SPL.value());
						ioRow.bp_cd(nvl(r.asppl_cd(), ptn.dr_bp_cd()));
					}
				}
				else if (MAC_BP_SET_TYP.isFIX_CST(ptn.dr_bp_typ())) {
					if (!isNull(ptn.dr_bp_cd())) {
						ioRow.bp_typ(MAC_MASTER_TYP.CST.value());
						ioRow.bp_cd(ptn.dr_bp_cd());
					}
				}
				else if (MAC_BP_SET_TYP.isFIX_SPL(ptn.dr_bp_typ())) {
					if (!isNull(ptn.dr_bp_cd())) {
						ioRow.bp_typ(MAC_MASTER_TYP.SPL.value());
						ioRow.bp_cd(ptn.dr_bp_cd());
					}
				}
				else if (MAC_BP_SET_TYP.isCRE(ptn.dr_bp_typ())) {
					if (!isNull(r.rcst_cd()) || !isNull(ptn.dr_bp_cd())) {
						if (isNull(r.asppl_cd())) {
							ioRow.bp_typ(MAC_MASTER_TYP.CST.value());
						}
						else {
							ioRow.bp_typ(MAC_MASTER_TYP.SPL.value());
						}
						ioRow.bp_cd(nvl(r.rcst_cd(), ptn.dr_bp_cd()));
					}
				}
				else if (MAC_BP_SET_TYP.isSO_CST(ptn.dr_bp_typ())) {
					if (!isNull(r.setoff_cd()) || !isNull(ptn.dr_bp_cd())) {
						ioRow.bp_typ(MAC_MASTER_TYP.CST.value());
						ioRow.bp_cd(nvl(r.setoff_cd(), ptn.dr_bp_cd()));
					}
				}
				else if (MAC_BP_SET_TYP.isSO_SPL(ptn.dr_bp_typ())) {
					if (!isNull(r.setoff_cd()) || !isNull(ptn.dr_bp_cd())) {
						ioRow.bp_typ(MAC_MASTER_TYP.SPL.value());
						ioRow.bp_cd(nvl(r.setoff_cd(), ptn.dr_bp_cd()));
					}
				}
				else {
					ioRow.bp_cd(null);
				}
				if (isNull(ioRow.bp_cd())) {
					_logger.writeDataLog(new MCMessage(MBBBD0014, ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
			}
			
			ioRow.slo_no(r.slo_no());
			ioRow.po_no(r.po_no());
			
			if (acR.foreign_flg() && !isSame(r.trd_cur_cd(), r.base_cur_cd())) {
				ioRow.foreign_flg(true);
				ioRow.trd_cur_amt(amtTr);
				ioRow.trd_cur_tax_amt(taxAmtTr);
				ioRow.trd_cur_sum_amt(amtTr.add(taxAmtTr));
				ioRow.trd_cur_cd(r.trd_cur_cd());
				ioRow.xrate(nvl(r.xrate(), MCNumber.ONE));
				ioRow.xrate_cd(r.xrate_cd());
				ioRow.trd_cur_tax_base_amt(taxBaseAmtTr);
			}
			else {
				ioRow.foreign_flg(false);
				ioRow.trd_cur_amt(0);
				ioRow.trd_cur_tax_amt(0);
				ioRow.trd_cur_sum_amt(0);
				ioRow.trd_cur_cd(null);
				ioRow.xrate(null);
				ioRow.xrate_cd(null);
				ioRow.trd_cur_tax_base_amt(0);
			}
			
			if (!isNull(r.ptax_cur_cd())) {
				ioRow.ptax_cur_amt(amtPt);
				ioRow.ptax_cur_tax_amt(taxAmtPt);
				ioRow.ptax_cur_sum_amt(amtPt.add(taxAmtPt));
				ioRow.ptax_cur_cd(r.ptax_cur_cd());
				ioRow.ptax_xrate(nvl(r.ptax_xrate(), MCNumber.ONE));
				ioRow.ptax_xrate_cd(r.ptax_xrate_cd());
				ioRow.ptax_cur_tax_base_amt(taxBaseAmtPt);
			}
			else {
				ioRow.ptax_cur_amt(0);
				ioRow.ptax_cur_tax_amt(0);
				ioRow.ptax_cur_sum_amt(0);
				ioRow.ptax_cur_cd(null);
				ioRow.ptax_xrate(null);
				ioRow.ptax_xrate_cd(null);
				ioRow.ptax_cur_tax_base_amt(0);
			}
			
			ioRow.iv_no(r.iv_no());
			ioRow.bill_no(r.bill_no());
			ioRow.base_cur_cd(r.base_cur_cd());
			
			if (isNull(ioRow.itm_cd()) // 品目別に出力しないときは数量情報を出力しない
					// 金額区分が下記のときは数量情報を出力しない
					|| MAC_AMT_TYP.isZERO(ptn.dr_amt_typ())
					|| MAC_AMT_TYP.isTAX_IN_AMT(ptn.dr_amt_typ())
					|| MAC_AMT_TYP.isTAX_IN_TAX(ptn.dr_amt_typ())
					|| MAC_AMT_TYP.isAMT_STD(ptn.dr_amt_typ())) {
				ioRow.base_unit_qty(0);
			}
			else {
				ioRow.base_unit_qty(qty);
			}
			
			if (isNull(ioRow.itm_cd())) {
				ioRow.base_unit_cd(null);
			}
			else {
				ioRow.base_unit_cd(unitCd);
			}
			ioRow.base_cur_amt(amt);
			ioRow.base_cur_tax_amt(taxAmt);
			ioRow.base_cur_sum_amt(amt.add(taxAmt));
			ioRow.base_cur_tax_base_amt(taxBaseAmt);
			
			if (ptn.minus_flg() || jnlR.minus_flg()) {
				int sign = 1;
				if (ptn.minus_flg()) {
					sign = sign  * (-1);
				}
				if (jnlR.minus_flg()) {
					sign = sign  * (-1);
				}
				ioRow.base_unit_qty(ioRow.base_unit_qty().multiply(sign));
				ioRow.base_cur_amt(ioRow.base_cur_amt().multiply(sign));
				ioRow.base_cur_tax_amt(ioRow.base_cur_tax_amt().multiply(sign));
				ioRow.base_cur_sum_amt(ioRow.base_cur_sum_amt().multiply(sign));
				ioRow.trd_cur_amt(ioRow.trd_cur_amt().multiply(sign));
				ioRow.trd_cur_tax_amt(ioRow.trd_cur_tax_amt().multiply(sign));
				ioRow.trd_cur_sum_amt(ioRow.trd_cur_sum_amt().multiply(sign));
				ioRow.ptax_cur_amt(ioRow.ptax_cur_amt().multiply(sign));
				ioRow.ptax_cur_tax_amt(ioRow.ptax_cur_tax_amt().multiply(sign));
				ioRow.ptax_cur_sum_amt(ioRow.ptax_cur_sum_amt().multiply(sign));
				ioRow.base_cur_tax_base_amt(ioRow.base_cur_tax_base_amt().multiply(sign));
				ioRow.trd_cur_tax_base_amt(ioRow.trd_cur_tax_base_amt().multiply(sign));
				ioRow.ptax_cur_tax_base_amt(ioRow.ptax_cur_tax_base_amt().multiply(sign));
			}
			
			if (ioRow.trd_cur_amt().isZero()
					&& ioRow.trd_cur_tax_amt().isZero()
					&& ioRow.trd_cur_sum_amt().isZero()
					&& !MAC_AMT_TYP.isZERO(ptn.dr_amt_typ())) {
				ioRow.foreign_flg(false);
				ioRow.trd_cur_cd(null);
				ioRow.xrate(null);
				ioRow.xrate_cd(null);
			}
			
			// 部門コードの設定
			if (MAC_DPT_TYP.isFIX(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(ptn.dr_dpt_cd());
			}
			else if (MAC_DPT_TYP.isPURC(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.purc_dpt_cd());
			}
			else if (MAC_DPT_TYP.isAP(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.ap_dpt_cd());
			}
			else if (MAC_DPT_TYP.isSLS(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.sls_dpt_cd());
			}
			else if (MAC_DPT_TYP.isAR(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.ar_dpt_cd());
			}
			else if (MAC_DPT_TYP.isGI(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.gi_dpt_cd());
			}
			else if (MAC_DPT_TYP.isGR(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.gr_dpt_cd());
			}
			else if (MAC_DPT_TYP.isBD(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.bd_dpt_cd());
			}
			else if (MAC_DPT_TYP.isCR(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.rcv_dpt_cd());
			}
			else if (MAC_DPT_TYP.isSO(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.so_dpt_cd());
			}
			else if (MAC_DPT_TYP.isSUB1(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.sub_dpt_cd1());
			}
			else if (MAC_DPT_TYP.isSUB2(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.sub_dpt_cd2());
			}
			else if (MAC_DPT_TYP.isSUB3(ptn.dr_dpt_typ())) {
				ioRow.dpt_cd(r.sub_dpt_cd3());
			}
			else {
				ioRow.dpt_cd(null);
			}
			
			// 相手部門コードの設定
			if (MAC_DPT_TYP.isFIX(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(ptn.cr_dpt_cd());
			}
			else if (MAC_DPT_TYP.isPURC(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.purc_dpt_cd());
			}
			else if (MAC_DPT_TYP.isAP(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.ap_dpt_cd());
			}
			else if (MAC_DPT_TYP.isSLS(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.sls_dpt_cd());
			}
			else if (MAC_DPT_TYP.isAR(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.ar_dpt_cd());
			}
			else if (MAC_DPT_TYP.isGI(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.gi_dpt_cd());
			}
			else if (MAC_DPT_TYP.isGR(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.gr_dpt_cd());
			}
			else if (MAC_DPT_TYP.isBD(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.bd_dpt_cd());
			}
			else if (MAC_DPT_TYP.isCR(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.rcv_dpt_cd());
			}
			else if (MAC_DPT_TYP.isSO(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.so_dpt_cd());
			}
			else if (MAC_DPT_TYP.isSUB1(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.sub_dpt_cd1());
			}
			else if (MAC_DPT_TYP.isSUB2(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.sub_dpt_cd2());
			}
			else if (MAC_DPT_TYP.isSUB3(ptn.cr_dpt_typ())) {
				ioRow.other_dpt_cd(r.sub_dpt_cd3());
			}
			else {
				ioRow.other_dpt_cd(null);
			}
			
			if (isNull(ioRow.dpt_cd()) || isNull(ioRow.other_dpt_cd())) {
				_logger.writeDataLog(new MCMessage(MBBBD0015, r.ac_slip_typ(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
				rc = 1;
			}
			
			ioRow.other_ac_cd(ptn.cr_ac_cd());
			ioRow.other_sub_ac_cd(ptn.cr_sub_ac_cd());
			
			ioRow.tax_cd(nvl(ptn.dr_ac_tax_cd(), acR.ac_tax_cd()));
			ioRow.tax_typ(acR.ac_tax_typ());
			
			String taxCd = ioRow.tax_cd();
			MAM_AC_TAX_R taxR = getAcTaxR(taxCd);
			// トラン優先の税コードもしくはマスタから取得できないときはトランの税コードを設定
			if (!isNull(r.tax_cd()) && (isNull(taxCd) || (!isNull(taxR) && taxR.tran_flg()))) {
				ioRow.tax_cd(r.tax_cd());
				taxCd = r.tax_cd();
				taxR = getAcTaxR(taxCd);
			}
			
			// 税区分を税マスタから取得
			if (!isNull(taxR)) {
				ioRow.tax_typ(taxR.ac_tax_typ());
			}
			
			if (acR.usr_flg()) {
				if (isNull(r.usr_cd())) {
					_logger.writeDataLog(new MCMessage(MBBBD0016, ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
				ioRow.usr_cd(r.usr_cd());
			}
			else {
				ioRow.usr_cd(null);
			}
			
			ioRow.spot_flg(r.spot_flg());
			ioRow.sttl_schd_dt(r.sttl_schd_dt());
			ioRow.sttl_cd(r.sttl_cd());

			ioRow.cls_jnl_typ(jnlR.cls_jnl_typ());
			ioRow.alloc_jnl_flg(jnlR.alloc_jnl_flg());
			
			if (acR.bank_ac_flg()) {
				if (isNull(r.bank_ac_cd())) {
					_logger.writeDataLog(new MCMessage(MBBBD0017, ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
				ioRow.bank_ac_cd(r.bank_ac_cd());
			}
			else {
				ioRow.bank_ac_cd(null);
			}

			if (acR.project_flg()) {
				if (ptn.dr_trd_sml_flg()) {
					ioRow.project_cd(r.trd_project_cd());
				}
				else {
					ioRow.project_cd(r.project_cd());
				}
				if (isNull(ioRow.project_cd())) {
					_logger.writeDataLog(new MCMessage(MBBBD0018, ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
			}
			else {
				ioRow.project_cd(null);
			}

			if (acR.sum0_flg()) {
				if (ptn.dr_trd_sml_flg()) {
					ioRow.summary_cd0(r.trd_summary_cd0());
				}
				else {
					ioRow.summary_cd0(r.summary_cd0());
				}
				if (isNull(ioRow.summary_cd0())) {
					_logger.writeDataLog(new MCMessage(MBBBD0019, "0", ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
			}
			else {
				ioRow.summary_cd0(null);
			}

			if (acR.sum1_flg()) {
				if (ptn.dr_trd_sml_flg()) {
					ioRow.summary_cd1(r.trd_summary_cd1());
				}
				else {
					ioRow.summary_cd1(r.summary_cd1());
				}
				if (isNull(ioRow.summary_cd1())) {
					_logger.writeDataLog(new MCMessage(MBBBD0019, "1", ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
			}
			else {
				ioRow.summary_cd1(null);
			}

			if (acR.sum2_flg()) {
				if (ptn.dr_trd_sml_flg()) {
					ioRow.summary_cd2(r.trd_summary_cd2());
				}
				else {
					ioRow.summary_cd2(r.summary_cd2());
				}
				if (isNull(ioRow.summary_cd2())) {
					_logger.writeDataLog(new MCMessage(MBBBD0019, "2", ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
			}
			else {
				ioRow.summary_cd2(null);
			}

			if (acR.sum3_flg()) {
				if (ptn.dr_trd_sml_flg()) {
					ioRow.summary_cd3(r.trd_summary_cd3());
				}
				else {
					ioRow.summary_cd3(r.summary_cd3());
				}
				if (isNull(ioRow.summary_cd3())) {
					_logger.writeDataLog(new MCMessage(MBBBD0019, "3", ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
			}
			else {
				ioRow.summary_cd3(null);
			}

			if (acR.sum4_flg()) {
				if (ptn.dr_trd_sml_flg()) {
					ioRow.summary_cd4(r.trd_summary_cd4());
				}
				else {
					ioRow.summary_cd4(r.summary_cd4());
				}
				if (isNull(ioRow.summary_cd4())) {
					_logger.writeDataLog(new MCMessage(MBBBD0019, "4", ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
			}
			else {
				ioRow.summary_cd4(null);
			}

			if (acR.sum5_flg()) {
				if (ptn.dr_trd_sml_flg()) {
					ioRow.summary_cd5(r.trd_summary_cd5());
				}
				else {
					ioRow.summary_cd5(r.summary_cd5());
				}
				if (isNull(ioRow.summary_cd5())) {
					_logger.writeDataLog(new MCMessage(MBBBD0019, "5", ptn.dr_ac_cd(), jnlR.jnl_ptn_cd(), ptn.jnl_seq()));
					rc = 1;
				}
			}
			else {
				ioRow.summary_cd5(null);
			}
			
			// 摘要１の設定
			ioRow.abstract1(getAbstract(jnlR.abs_typ(), jnlR.abstract1(), r, jnlR));
			// 摘要２の設定
			ioRow.abstract2(getAbstract(ptn.dr_abs_typ(), ptn.dr_abstract(), r, jnlR));
			
			ioRow.compound_jnl_typ(jnlR.compound_jnl_typ());
			if (MAC_DC_TYP.isDR(dcTyp)) {
				_jnlUnit = r.jnl_unit();
			}
			ioRow.jnl_unit(_jnlUnit);
			
			return rc;
		}
		
		protected String getAbstract(String absTyp, String absStr, AutoJnl_Upd02_DtlR r, MAM_AUTO_JNL_R jnlR) {
			String abs = isNull(absStr) ? "" : absStr;
			if (MAC_ABS_TYP.isMST(absTyp)) {
				return subStr(abs, _absLength);
			}
			if (MAC_ABS_TYP.isSLIP(absTyp)) {
				return subStr(abs + nvl(r.slip_no(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isINV(absTyp)) {
				return subStr(abs + nvl(nvl(r.iv_no(), r.bill_no()), ""), _absLength);
			}
			if (MAC_ABS_TYP.isAC(absTyp)) {
				if (!isNull(r.bank_ac_cd())) {
					MAM_BANK_AC_R bankAcR = getBankAcR(r.bank_ac_cd());
					return subStr(abs + nvl(bankAcR.bank_ac_nm(), ""), _absLength);
				}
				else {
					return null;
				}
			}
			if (MAC_ABS_TYP.isTRANS(absTyp)) {
				return subStr(abs + nvl(r.xfr_psn(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isITM(absTyp)) {
				return subStr(abs + nvl(r.itm_nm(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isTRD(absTyp)) {
				return subStr(abs + nvl(r.trd_itm_nm(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isORD_NO(absTyp)) {
				return subStr(abs + nvl(nvl(r.po_no(), r.slo_no()), ""), _absLength);
			}
			if (MAC_ABS_TYP.isTRD_RMRKS(absTyp)) {
				return subStr(abs + nvl(r.trd_rmrks(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isTRD_D_RMRKS(absTyp)) {
				return subStr(abs + nvl(r.trd_d_rmrks(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isWRK(absTyp)) {
				return subStr(abs + nvl(r.wrk_no(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isSUB1(absTyp)) {
				return subStr(abs + nvl(r.sub_char1(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isSUB2(absTyp)) {
				return subStr(abs + nvl(r.sub_char2(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isSUB3(absTyp)) {
				return subStr(abs + nvl(r.sub_char3(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isSUB4(absTyp)) {
				return subStr(abs + nvl(r.sub_char4(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isSUB5(absTyp)) {
				return subStr(abs + nvl(r.sub_char5(), ""), _absLength);
			}
			if (MAC_ABS_TYP.isSO(absTyp) && (!isNull(r.setoff_nm()))) {
				return subStr(abs + nvl(r.setoff_nm(), ""), _absLength);
			}
			
			String nm = getAbsBpNm(absTyp, r);
			if (null != nm) {
				return subStr(abs + nm, _absLength);
			}
			
			return null;
		}
		
		protected String getAbsBpNm(String absTyp, AutoJnl_Upd02_DtlR r) {
			if (MAC_ABS_TYP.isAPAR(absTyp) && (!isNull(r.acst_cd()) || !isNull(r.asppl_cd()))) {
				ArrayList<String> l = new ArrayList<>();
				if (!isNull(r.acst_cd())) {
					MAM_BP_R m = getBpR(r.acst_cd());
					if (!isNull(m)) {
						l.add(m.bp_nm());
					}
				}
				if (!isNull(r.asppl_cd())) {
					MAM_BP_R m = getBpR(r.asppl_cd());
					if (!isNull(m)) {
						l.add(m.bp_nm());
					}
				}
				if (l.isEmpty()) {
					return "";
				}
				if (l.size() == 1) {
					return l.get(0);
				}
				String[] a = l.toArray(new String[l.size()]);
				Arrays.sort(a); // 名称でソートする
				return a[0];
			}
			if (MAC_ABS_TYP.isCSTSPL(absTyp) && (!isNull(r.cst_cd()) || !isNull(r.sppl_cd()))) {
				ArrayList<String> l = new ArrayList<>();
				if (!isNull(r.cst_cd())) {
					MAM_BP_R m = getBpR(r.cst_cd());
					if (!isNull(m)) {
						l.add(m.bp_nm());
					}
				}
				if (!isNull(r.sppl_cd())) {
					MAM_BP_R m = getBpR(r.sppl_cd());
					if (!isNull(m)) {
						l.add(m.bp_nm());
					}
				}
				if (l.isEmpty()) {
					return "";
				}
				if (l.size() == 1) {
					return l.get(0);
				}
				String[] a = l.toArray(new String[l.size()]);
				Arrays.sort(a); // 名称でソートする
				return a[0];
			}
			if (MAC_ABS_TYP.isCRE(absTyp) && !isNull(r.rcst_cd())) {
				MAM_BP_R m = getBpR(r.rcst_cd());
				return isNull(m) ? "" : m.bp_nm();
			}
			if (MAC_ABS_TYP.isSO(absTyp) && !isNull(r.setoff_cd())) {
				MAM_BP_R m = getBpR(r.setoff_cd());
				return isNull(m) ? "" : m.bp_nm();
			}
			return null;
		}
		
		protected void setMbwData(MCList<MBW_JOURNAL_R> list, boolean revFlg, boolean minusRevFlg, MCNumber sumAmt) {
			if (list.size() <= 0) {
				return;
			}
			for (MBW_JOURNAL_R r : list) {
				String dcTyp = r.dc_typ();
				if (revFlg) {
					if (MAC_DC_TYP.isDR(dcTyp)) {
						dcTyp = MAC_DC_TYP.CR.value();
					}
					else {
						dcTyp = MAC_DC_TYP.DR.value();
					}
				}
				
				int sign = 1;
				
				if (minusRevFlg && (isNull(sumAmt) && r.base_cur_sum_amt().lt(0) || !isNull(sumAmt) && sumAmt.lt(0))) {
					if (MAC_DC_TYP.isDR(dcTyp)) {
						dcTyp = MAC_DC_TYP.CR.value();
					}
					else {
						dcTyp = MAC_DC_TYP.DR.value();
					}
					sign = -1;
				}
				
				_wJnlL.add(r);
				
				r.base_unit_qty(r.base_unit_qty().multiply(sign));
				
				r.base_cur_sum_amt(r.base_cur_sum_amt().multiply(sign));
				r.base_cur_amt(r.base_cur_amt().multiply(sign));
				r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(sign));
				
				r.trd_cur_sum_amt(r.trd_cur_sum_amt().multiply(sign));
				r.trd_cur_amt(r.trd_cur_amt().multiply(sign));
				r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(sign));
				
				r.ptax_cur_sum_amt(r.ptax_cur_sum_amt().multiply(sign));
				r.ptax_cur_amt(r.ptax_cur_amt().multiply(sign));
				r.ptax_cur_tax_amt(r.ptax_cur_tax_amt().multiply(sign));

				r.base_cur_tax_base_amt(r.base_cur_tax_base_amt().multiply(sign));
				r.trd_cur_tax_base_amt(r.trd_cur_tax_base_amt().multiply(sign));
				r.ptax_cur_tax_base_amt(r.ptax_cur_tax_base_amt().multiply(sign));
				r.dc_typ(dcTyp);
				
				r.send_flg(false);
				
				if (sign == -1) {
					if (MAC_COMPOUND_JNL_TYP.isDNC1(r.compound_jnl_typ())) {
						r.compound_jnl_typ(MAC_COMPOUND_JNL_TYP.D1CN.value());
					}
					else if (MAC_COMPOUND_JNL_TYP.isD1CN(r.compound_jnl_typ())) {
						r.compound_jnl_typ(MAC_COMPOUND_JNL_TYP.DNC1.value());
					}
				}
			}
		}

		protected String getSlipCntId(AutoJnl_Upd02_DtlR x, MAM_AUTO_JNL_R y1) {
			if (MAC_ID_TYP.isMST(y1.id_typ())) {
				if (isNull(y1.slip_cnt_id())) {
					_logger.writeDataLog(new MCMessage(MBBBD0022, x.ac_slip_typ(),
							x.auto_jnl_key_cd(), y1.jnl_ptn_cd()));
					down0().rc(1);
					return null;
				}
				return y1.slip_cnt_id();
			}
			String dpt = geTgtDpt(x, y1);
			MAM_AC_DPT_R r = getAcDptR(dpt, x.ac_dt());
			if (isNull(r.slip_cnt_id()) && isNull(y1.slip_cnt_id())) {
				_logger.writeDataLog(
						new MCMessage(MBBBD0036, dpt, toYMDString(x.ac_dt()),
								x.ac_slip_typ(), x.auto_jnl_key_cd(), y1.jnl_ptn_cd()));
				down0().rc(1);
				return null;
			}
			return nvl(r.slip_cnt_id(), y1.slip_cnt_id());
		}
		
		protected String geTgtDpt(AutoJnl_Upd02_DtlR x, MAM_AUTO_JNL_R y1) {
			if (MAC_ID_TYP.isPURC(y1.id_typ())) return x.purc_dpt_cd();
			if (MAC_ID_TYP.isAP(y1.id_typ())) return x.ap_dpt_cd();
			if (MAC_ID_TYP.isSLS(y1.id_typ())) return x.sls_dpt_cd();
			if (MAC_ID_TYP.isAR(y1.id_typ())) return x.ar_dpt_cd();
			if (MAC_ID_TYP.isGI(y1.id_typ())) return x.gi_dpt_cd();
			if (MAC_ID_TYP.isGR(y1.id_typ())) return x.gr_dpt_cd();
			if (MAC_ID_TYP.isBD(y1.id_typ())) return x.bd_dpt_cd();
			if (MAC_ID_TYP.isCR(y1.id_typ())) return x.rcv_dpt_cd();
			if (MAC_ID_TYP.isSO(y1.id_typ())) return x.so_dpt_cd();
			if (MAC_ID_TYP.isSUB1(y1.id_typ())) return x.sub_dpt_cd1();
			if (MAC_ID_TYP.isSUB2(y1.id_typ())) return x.sub_dpt_cd2();
			if (MAC_ID_TYP.isSUB3(y1.id_typ())) return x.sub_dpt_cd3();
			return null;
		}
		
		protected boolean chkJnl(MBW_JOURNAL_R jnl1, MBW_JOURNAL_R jnl2) {
			String tmp = String.valueOf((char)1);
			MCDate tmpDt = MCDate.valueOf("29991231", "yyyyMMdd");
			
			return isSame(jnl1.jnl_unit(), jnl2.jnl_unit())
					&& isSame(jnl1.jnl_ptn_cd(), jnl2.jnl_ptn_cd())
					&& isSame(jnl1.ac_slip_dt(), jnl2.ac_slip_dt())
					&& isSame(jnl1.ac_dt(), jnl2.ac_dt())
					&& isSame(nvl(jnl1.slip_no(), tmp), nvl(jnl2.slip_no(), tmp))
					&& (isNull(jnl1.slip_seq_no()) && isNull(jnl2.slip_seq_no()) || isSame(jnl1.slip_seq_no(), jnl2.slip_seq_no()))
					&& isSame(jnl1.dpt_cd(), jnl2.dpt_cd())
					&& isSame(jnl1.ac_cd(), jnl2.ac_cd())
					&& isSame(nvl(jnl1.sub_ac_cd(), tmp), nvl(jnl2.sub_ac_cd(), tmp))
					&& isSame(nvl(jnl1.itm_cd(), tmp), nvl(jnl2.itm_cd(), tmp))
					&& isSame(nvl(jnl1.itm_sub1(), tmp), nvl(jnl2.itm_sub1(), tmp))
					&& isSame(nvl(jnl1.itm_sub2(), tmp), nvl(jnl2.itm_sub2(), tmp))
					&& isSame(nvl(jnl1.itm_sub3(), tmp), nvl(jnl2.itm_sub3(), tmp))
					&& isSame(nvl(jnl1.itm_nm(), tmp), nvl(jnl2.itm_nm(), tmp))
					&& isSame(nvl(jnl1.bp_cd(), tmp), nvl(jnl2.bp_cd(), tmp))
					&& isSame(nvl(jnl1.base_unit_cd(), tmp), nvl(jnl2.base_unit_cd(), tmp))
					&& isSame(jnl1.base_cur_cd(), jnl2.base_cur_cd())
					&& isSame(nvl(jnl1.trd_cur_cd(), tmp), nvl(jnl2.trd_cur_cd(), tmp))
					&& isSame(nvl(jnl1.ptax_cur_cd(), tmp), nvl(jnl2.ptax_cur_cd(), tmp))
					&& isSame(nvl(jnl1.tax_typ(), tmp), nvl(jnl2.tax_typ(), tmp))
					&& isSame(nvl(jnl1.tax_cd(), tmp), nvl(jnl2.tax_cd(), tmp))
					&& isSame(jnl1.foreign_flg(), jnl2.foreign_flg())
					&& isSame(nvl(jnl1.xrate_cd(), tmp), nvl(jnl2.xrate_cd(), tmp))
					&& isSame(nvl(jnl1.ptax_xrate_cd(), tmp), nvl(jnl2.ptax_xrate_cd(), tmp))
					&& isSame(nvl(jnl1.iv_no(), tmp), nvl(jnl2.iv_no(), tmp))
					&& isSame(nvl(jnl1.bill_no(), tmp), nvl(jnl2.bill_no(), tmp))
					&& isSame(nvl(jnl1.slo_no(), tmp), nvl(jnl2.slo_no(), tmp))
					&& isSame(nvl(jnl1.po_no(), tmp), nvl(jnl2.po_no(), tmp))
					&& isSame(nvl(jnl1.usr_cd(), tmp), nvl(jnl2.usr_cd(), tmp))
					&& isSame(jnl1.spot_flg(), jnl2.spot_flg())
					&& isSame(nvl(jnl1.cls_jnl_typ(), tmp), nvl(jnl2.cls_jnl_typ(), tmp))
					&& isSame(jnl1.alloc_jnl_flg(), jnl2.alloc_jnl_flg())
					&& isSame(nvl(jnl1.sttl_schd_dt(), tmpDt), nvl(jnl2.sttl_schd_dt(), tmpDt))
					&& isSame(nvl(jnl1.sttl_cd(), tmp), nvl(jnl2.sttl_cd(), tmp))
					&& isSame(nvl(jnl1.bank_ac_cd(), tmp), nvl(jnl2.bank_ac_cd(), tmp))
					&& isSame(nvl(jnl1.project_cd(), tmp), nvl(jnl2.project_cd(), tmp))
					&& isSame(nvl(jnl1.summary_cd0(), tmp), nvl(jnl2.summary_cd0(), tmp))
					&& isSame(nvl(jnl1.summary_cd1(), tmp), nvl(jnl2.summary_cd1(), tmp))
					&& isSame(nvl(jnl1.summary_cd2(), tmp), nvl(jnl2.summary_cd2(), tmp))
					&& isSame(nvl(jnl1.summary_cd3(), tmp), nvl(jnl2.summary_cd3(), tmp))
					&& isSame(nvl(jnl1.summary_cd4(), tmp), nvl(jnl2.summary_cd4(), tmp))
					&& isSame(nvl(jnl1.summary_cd5(), tmp), nvl(jnl2.summary_cd5(), tmp))
					&& isSame(nvl(jnl1.abstract1(), tmp), nvl(jnl2.abstract1(), tmp))
					&& isSame(nvl(jnl1.abstract2(), tmp), nvl(jnl2.abstract2(), tmp));
		}
		
		protected String subStr(String str, int length) {
			if (str.length() > length) {
				return  str.substring(0, length);
			}
			return str;
		}
		
		protected String _jnlNo;
		
		protected Map<List<String>, List<Integer>> _mapDrIdx;
		protected Map<List<String>, List<Integer>> _mapCrIdx;
		
		protected void jnlEndDt() {
			if (_wJnlL.isEmpty()) {
				return ;
			}
			
			_wJnlIdxKey = _wJnlL.createIndex(MBW_JOURNAL_R.$jnl_grp_no,
					MBW_JOURNAL_R.$ac_ym, MBW_JOURNAL_R.$ac_if_typ,
					MBW_JOURNAL_R.$slip_cnt_id, MBW_JOURNAL_R.$jnl_no);
			
			MCList<MBW_JOURNAL_R> wJnlDrL = MCList.create(MBW_JOURNAL_R.class);
			MCList<MBW_JOURNAL_R> wJnlCrL = MCList.create(MBW_JOURNAL_R.class);
			_mapDrIdx = new HashMap<List<String>, List<Integer>>();
			_mapCrIdx = new HashMap<List<String>, List<Integer>>();
			
			MCList<MBT_JOURNAL_R> tJnlL = MCList.create(MBT_JOURNAL_R.class);
			
			MBW_JOURNAL_R wJnlKeyR = null;
			boolean jnlChkDr = false;
			boolean jnlChkCr = false;
			MBW_JOURNAL_R tmpMbwJnl = null;
			for (MBW_JOURNAL_R x : getWJnlKeyL()) {
				if (wJnlDrL.size() == 0
						|| !isSame(wJnlKeyR.ac_ym(), x.ac_ym())
						|| !isSame(wJnlKeyR.ac_if_typ(), x.ac_if_typ())
						|| !isSame(wJnlKeyR.slip_cnt_id(), x.slip_cnt_id())
						|| !isSame(wJnlKeyR.jnl_unit(), x.jnl_unit())
						|| !isSame(wJnlKeyR.jnl_ptn_cd(), x.jnl_ptn_cd())
						|| !isSame(wJnlKeyR.compound_jnl_typ(), x.compound_jnl_typ())) {
					if (wJnlDrL.size() > 0) {
						insW2T(tJnlL, wJnlDrL, wJnlCrL);
						 wJnlDrL = MCList.create(MBW_JOURNAL_R.class);
						 wJnlCrL = MCList.create(MBW_JOURNAL_R.class);
						_mapDrIdx = new HashMap<List<String>, List<Integer>>();
						_mapCrIdx = new HashMap<List<String>, List<Integer>>();
						
						if (tJnlL.size() >= 10000) {
							insMbtJournal(tJnlL);
							tJnlL = MCList.create(MBT_JOURNAL_R.class);
						}
					}
					wJnlKeyR = x;
				}
				
				_jnlNo = null;
				for (MBW_JOURNAL_R x1 : getWJnlL(x)) {
					if (MAC_DC_TYP.isDR(x1.dc_typ())) {
						jnlChkDr = setWJnl(x1, wJnlDrL);
						if (MAC_COMPOUND_JNL_TYP.isD1C1(x1.compound_jnl_typ()) && jnlChkDr) {
							tmpMbwJnl = x1.clone();
						}
					}
					else {
						if (MAC_COMPOUND_JNL_TYP.isD1C1(x1.compound_jnl_typ()) && jnlChkDr) {
							jnlChkCr = false;
							for (int i = 0; i < wJnlDrL.size(); i++) {
								if (chkJnl(wJnlDrL.get(i), tmpMbwJnl) && chkJnl(wJnlCrL.get(i), x1)) {
									_jnlNo = wJnlDrL.get(i).jnl_no();
									jnlChkDr = setWJnl(tmpMbwJnl, wJnlDrL);
									jnlChkCr = setWJnl(x1, wJnlCrL);
									break;
								}
							}
							if (!jnlChkCr) {
								wJnlDrL.add(tmpMbwJnl);
								wJnlCrL.add(x1.clone());
								addMap(tmpMbwJnl, wJnlDrL.size() - 1);
								addMap(wJnlCrL.get(wJnlCrL.size() - 1), wJnlCrL.size() - 1);
								jnlChkDr = false;
								jnlChkCr = false;
							}
						}
						else {
							jnlChkCr = setWJnl(x1, wJnlCrL);
						}
					}
				}
				
				if (!jnlChkDr && jnlChkCr) {
					wJnlDrL.get(wJnlDrL.size()-1).jnl_no(_jnlNo);
				}
				else if (jnlChkDr && !jnlChkCr) {
					wJnlCrL.get(wJnlCrL.size()-1).jnl_no(_jnlNo);
				}
			}
			
			insW2T(tJnlL, wJnlDrL, wJnlCrL);
			 wJnlDrL = MCList.create(MBW_JOURNAL_R.class);
			 wJnlCrL = MCList.create(MBW_JOURNAL_R.class);
			 
			insMbtJournal(tJnlL);
			tJnlL = MCList.create(MBT_JOURNAL_R.class);
		}
		
		protected boolean setWJnl(MBW_JOURNAL_R x1, MCList<MBW_JOURNAL_R> ioList) {
			MBW_JOURNAL_R r = x1.clone();
			if (ioList.size() == 0) {
				ioList.add(r);
				addMap(r, ioList.size() - 1);
				return false;
			}
			if (isNull(_jnlNo)) {
				if (MAC_COMPOUND_JNL_TYP.isD1C1(r.compound_jnl_typ()) && MAC_DC_TYP.isCR(r.dc_typ())
						|| MAC_COMPOUND_JNL_TYP.isD1CN(r.compound_jnl_typ()) && MAC_DC_TYP.isCR(r.dc_typ())
						|| MAC_COMPOUND_JNL_TYP.isDNC1(r.compound_jnl_typ()) && MAC_DC_TYP.isDR(r.dc_typ())) {
					ioList.add(r);
					addMap(r, ioList.size() - 1);
					return false;
				}
			}
			
			MBW_JOURNAL_R w = null;
			if (isNull(_jnlNo)) {
				w = getSameKeyFirstRow(r, ioList, null);
			}
			else {
				w = getSameKeyFirstRow(r, ioList, _jnlNo);
			}
			if (!isNull(w)) {
				if (MAC_COMPOUND_JNL_TYP.isD1C1(r.compound_jnl_typ()) && MAC_DC_TYP.isDR(r.dc_typ()) && isNull(_jnlNo)) {
					_jnlNo = w.jnl_no();
					return true;
				}
				w.base_unit_qty(w.base_unit_qty().add(r.base_unit_qty()));
				
				w.base_cur_amt(w.base_cur_amt().add(r.base_cur_amt()));
				w.base_cur_tax_amt(w.base_cur_tax_amt().add(r.base_cur_tax_amt()));
				w.base_cur_sum_amt(w.base_cur_sum_amt().add(r.base_cur_sum_amt()));
				
				w.trd_cur_amt(w.trd_cur_amt().add(r.trd_cur_amt()));
				w.trd_cur_tax_amt(w.trd_cur_tax_amt().add(r.trd_cur_tax_amt()));
				w.trd_cur_sum_amt(w.trd_cur_sum_amt().add(r.trd_cur_sum_amt()));
				
				w.ptax_cur_amt(w.ptax_cur_amt().add(r.ptax_cur_amt()));
				w.ptax_cur_tax_amt(w.ptax_cur_tax_amt().add(r.ptax_cur_tax_amt()));
				w.ptax_cur_sum_amt(w.ptax_cur_sum_amt().add(r.ptax_cur_sum_amt()));
				
				w.base_cur_tax_base_amt(w.base_cur_tax_base_amt().add(r.base_cur_tax_base_amt()));
				w.trd_cur_tax_base_amt(w.trd_cur_tax_base_amt().add(r.trd_cur_tax_base_amt()));
				w.ptax_cur_tax_base_amt(w.ptax_cur_tax_base_amt().add(r.ptax_cur_tax_base_amt()));
				
				_jnlNo = w.jnl_no();
				return true;
			}
			
			ioList.add(r);
			addMap(r, ioList.size() - 1);
			return false;
		}

		/**
		 * ioList から r と同一キーのレコードを探して返す。<br>
		 * jnlNo が null の場合は、見つかった最初のレコードを返す。<br>
		 * jnlNo が not null の場合は、jnlNoも一致するレコードを返す。<br>
		 * @param r
		 * @param ioList
		 * @param jnlNo
		 * @return 見つかった ioList のレコード、なければ null を返す。
		 */
		protected MBW_JOURNAL_R getSameKeyFirstRow(MBW_JOURNAL_R r, MCList<MBW_JOURNAL_R> ioList, String jnlNo) {
			Map<List<String>, List<Integer>> map = getTgtMap(r);
			List<String> key = getMapKey(r);

			if (!map.containsKey(key)) {
				return null;
			}

			for (Integer i : map.get(key)) {
				if (isNull(jnlNo)) {
					return ioList.get(i);
				}
				if (isSame(ioList.get(i).jnl_no(), jnlNo)) {
					return ioList.get(i);
				}
			}
			return null;
		}
		/**
		 * マップ（_mapDrIdx、_mapCrIdx）に r の、キーとインデックスを追加する。<br>
		 * ioList（wJnlDrL、wJnlCrL）に add したタイミングで、当該メソッドも実行すること。<br>
		 * @param r
		 * @param anIndex
		 */
		protected void addMap(MBW_JOURNAL_R r, int anIndex) {
			Map<List<String>, List<Integer>> map = getTgtMap(r);
			List<Integer> value = new ArrayList<Integer>();
			List<String> key = getMapKey(r);

			if (map.containsKey(key)) {
				value = map.get(key);
			}
			else {
				value = new ArrayList<Integer>();
			}
			value.add(anIndex);
			map.put(key, value);
		}
		protected Map<List<String>, List<Integer>> getTgtMap(MBW_JOURNAL_R r) {
			if (MAC_DC_TYP.isDR(r.dc_typ())) {
				return _mapDrIdx;
			}
			else {
				return _mapCrIdx;
			}
		}
		protected List<String> getMapKey(MBW_JOURNAL_R r) {
			List<String> key = new ArrayList<String>();
			key.add(r.jnl_unit());
			key.add(r.jnl_ptn_cd());
			key.add(r.ac_slip_dt().toString());
			key.add(r.ac_dt().toString());
			key.add(r.slip_no());
			key.add(isNull(r.slip_seq_no()) ? "" : r.slip_seq_no().toString());
			key.add(r.dpt_cd());
			key.add(r.ac_cd());
			key.add(r.sub_ac_cd());
			key.add(r.itm_cd());
			key.add(r.itm_sub1());
			key.add(r.itm_sub2());
			key.add(r.itm_sub3());
			key.add(r.itm_nm());
			key.add(r.bp_cd());
			key.add(r.base_unit_cd());
			key.add(r.base_cur_cd());
			key.add(r.trd_cur_cd());
			key.add(r.ptax_cur_cd());
			key.add(r.tax_typ());
			key.add(r.tax_cd());
			key.add(MCBooleanUtil.booleanToDBString(r.foreign_flg()));
			key.add(r.xrate_cd());
			key.add(r.ptax_xrate_cd());
			key.add(r.iv_no());
			key.add(r.bill_no());
			key.add(r.slo_no());
			key.add(r.po_no());
			key.add(r.usr_cd());
			key.add(MCBooleanUtil.booleanToDBString(r.spot_flg()));
			key.add(r.cls_jnl_typ());
			key.add(MCBooleanUtil.booleanToDBString(r.alloc_jnl_flg()));
			key.add(isNull(r.sttl_schd_dt()) ? "" : r.sttl_schd_dt().toString());
			key.add(r.sttl_cd());
			key.add(r.bank_ac_cd());
			key.add(r.project_cd());
			key.add(r.summary_cd0());
			key.add(r.summary_cd1());
			key.add(r.summary_cd2());
			key.add(r.summary_cd3());
			key.add(r.summary_cd4());
			key.add(r.summary_cd5());
			key.add(r.abstract1());
			key.add(r.abstract2());
			return key;
		}
		
		protected void insW2T(MCList<MBT_JOURNAL_R> tJnlL, MCList<MBW_JOURNAL_R> wJnlDrL, MCList<MBW_JOURNAL_R> wJnlCrL) {
			MCIndexKey dKey = wJnlDrL.createIndex(MBW_JOURNAL_R.$jnl_no);
			MCIndexKey cKey = wJnlCrL.createIndex(MBW_JOURNAL_R.$jnl_no);
			Map<String, MCRow> matchMap = new HashMap<>();
			
			for (MBW_JOURNAL_R r : wJnlDrL) {
				String jnlNo = r.jnl_no();
				MCRow noSeqR = getNoSeqR();
				
				if (r.base_cur_sum_amt().isZero()) {
					boolean skipFlg = false;
					for (MBW_JOURNAL_R w : wJnlDrL.subList(dKey, jnlNo)) {
						if (!w.base_cur_sum_amt().isZero()) {
							// 自分以外で数量＜＞０のデータがあればそちらで処理する
							skipFlg = true;
							break;
						}
					}
					if (skipFlg) {
						continue;
					}
					for (MBW_JOURNAL_R w : wJnlCrL.subList(cKey, jnlNo)) {
						if (!w.base_cur_sum_amt().isZero()) {
							// 自分の数量が０でも、対応するCRのデータがあれば続行する
							noSeqR.setString(JNL_NO, "1");
							break;
						}
					}
					if (isNull(noSeqR.getString(JNL_NO))) {
						// 対応するCRのデータがなければスキップ
						continue;
					}
				}
				// 仕訳伝票ＮＯの再設定
				noSeqR.setString(JNL_NO, null);
				if (matchMap.containsKey(jnlNo)) {
					matchMap.get(jnlNo).setNumber(SEQ_DR, matchMap.get(jnlNo).getNumber(SEQ_DR).add(1));
					noSeqR = matchMap.get(jnlNo);
				}
				else {
					MCNumber n = object(CLAZZ).incrementAndGetJnlNo(r.ac_ym(), r.ac_if_typ(), r.slip_cnt_id());
					noSeqR.setString(JNL_NO, lpad(n.intValue(), getJnlNoLength(), "0"));
					noSeqR.setNumber(SEQ_DR, MCNumber.ONE);
					noSeqR.setNumber(SEQ_CR, MCNumber.ZERO);
					matchMap.put(jnlNo, noSeqR);
				}
				
				MBT_JOURNAL_R tJnlR = setAndGetTJnlR(r);
				tJnlR.jnl_no(noSeqR.getString(JNL_NO));
				tJnlR.jnl_no_seq(noSeqR.getNumber(SEQ_DR));
				tJnlL.add(tJnlR);
			}
			
			for (MBW_JOURNAL_R r : wJnlCrL) {
				// 仕訳伝票の再設定
				String jnlNo = r.jnl_no();
				MCRow noSeqR = getNoSeqR();
				if (matchMap.containsKey(jnlNo)) {
					if (r.base_cur_sum_amt().isZero()) {
						boolean skipFlg = false;
						for (MBW_JOURNAL_R w : wJnlCrL.subList(cKey, jnlNo)) {
							if (!w.base_cur_sum_amt().isZero()) {
								// 自分以外で数量＜＞０のデータがあればそちらで処理する
								skipFlg = true;
								break;
							}
						}
						if (skipFlg) {
							continue;
						}
					}
					matchMap.get(jnlNo).setNumber(SEQ_CR, matchMap.get(jnlNo).getNumber(SEQ_CR).add(1));
					noSeqR = matchMap.get(jnlNo);
				}
				
				if (isNull(noSeqR.getString(JNL_NO))) {
					continue;
				}
				
				MBT_JOURNAL_R tJnlR = setAndGetTJnlR(r);
				tJnlR.jnl_no(noSeqR.getString(JNL_NO));
				if (getCo().ac_slip_seq_flg()) {
					tJnlR.jnl_no_seq (noSeqR.getNumber(SEQ_DR).add(noSeqR.getNumber(SEQ_CR)));
				}
				else {
					tJnlR.jnl_no_seq (noSeqR.getNumber(SEQ_CR));
				}
				tJnlL.add(tJnlR);
			}
		}
		protected static final String JNL_NO = "jnl_no";
		protected static final String SEQ_DR = "seq_dr";
		protected static final String SEQ_CR = "seq_cr";
		protected MCRow getNoSeqR() {
			MCRow r = MCRow.create();
			r.addStringColumn(JNL_NO, null);
			r.addNumberColumn(SEQ_DR, null);
			r.addNumberColumn(SEQ_CR, null);
			return r;
		}
		protected int getJnlNoLength() {
			if (isNull(getCo().ac_slip_digit())) {
				return 5;
			}
			return getCo().ac_slip_digit().intValue();
		}
		protected MBT_JOURNAL_R setAndGetTJnlR(MBW_JOURNAL_R r) {
			MBT_JOURNAL_R tJnlR = MBT_JOURNAL_R.create();
			tJnlR.jnl_grp_no(r.jnl_grp_no());
			tJnlR.ac_ym(r.ac_ym());
			tJnlR.ac_if_typ(r.ac_if_typ());
			tJnlR.slip_cnt_id(r.slip_cnt_id());
			tJnlR.dc_typ(r.dc_typ());
			tJnlR.ac_slip_dt(r.ac_slip_dt());
			tJnlR.ac_dt(r.ac_dt());
			tJnlR.slip_no(r.slip_no());
			tJnlR.slip_seq_no(r.slip_seq_no());
			tJnlR.dpt_cd(r.dpt_cd());
			tJnlR.ac_cd(r.ac_cd());
			tJnlR.sub_ac_cd(r.sub_ac_cd());
			tJnlR.project_cd(r.project_cd());
			tJnlR.summary_cd0(r.summary_cd0());
			tJnlR.summary_cd1(r.summary_cd1());
			tJnlR.summary_cd2(r.summary_cd2());
			tJnlR.summary_cd3(r.summary_cd3());
			tJnlR.summary_cd4(r.summary_cd4());
			tJnlR.summary_cd5(r.summary_cd5());
			tJnlR.itm_cd(r.itm_cd());
			tJnlR.itm_sub1(r.itm_sub1());
			tJnlR.itm_sub2(r.itm_sub2());
			tJnlR.itm_sub3(r.itm_sub3());
			tJnlR.itm_nm(r.itm_nm());
			tJnlR.bp_typ(r.bp_typ());
			tJnlR.bp_cd(r.bp_cd());
			tJnlR.base_unit_qty(r.base_unit_qty());
			tJnlR.base_unit_cd(r.base_unit_cd());
			tJnlR.base_cur_sum_amt (r.base_cur_sum_amt());
			tJnlR.base_cur_amt(r.base_cur_amt());
			tJnlR.base_cur_tax_amt (r.base_cur_tax_amt());
			tJnlR.base_cur_cd(r.base_cur_cd());
			tJnlR.trd_cur_sum_amt (r.trd_cur_sum_amt());
			tJnlR.trd_cur_amt(r.trd_cur_amt());
			tJnlR.trd_cur_tax_amt (r.trd_cur_tax_amt());
			tJnlR.trd_cur_cd(r.trd_cur_cd());
			tJnlR.ptax_cur_sum_amt (r.ptax_cur_sum_amt());
			tJnlR.ptax_cur_amt(r.ptax_cur_amt());
			tJnlR.ptax_cur_tax_amt (r.ptax_cur_tax_amt());
			tJnlR.ptax_cur_cd(r.ptax_cur_cd());
			tJnlR.tax_typ(r.tax_typ());
			tJnlR.tax_cd(r.tax_cd());
			tJnlR.foreign_flg(r.foreign_flg());
			tJnlR.xrate(r.xrate());
			tJnlR.xrate_cd(r.xrate_cd());
			tJnlR.ptax_xrate(r.ptax_xrate());
			tJnlR.ptax_xrate_cd(r.ptax_xrate_cd());
			tJnlR.iv_no(r.iv_no());
			tJnlR.bill_no(r.bill_no());
			tJnlR.slo_no(r.slo_no());
			tJnlR.po_no(r.po_no());
			tJnlR.usr_cd(r.usr_cd());
			tJnlR.cls_jnl_typ(r.cls_jnl_typ());
			tJnlR.alloc_jnl_flg(r.alloc_jnl_flg());
			tJnlR.spot_flg(r.spot_flg());
			tJnlR.sttl_schd_dt(r.sttl_schd_dt());
			tJnlR.sttl_cd(r.sttl_cd());
			tJnlR.bank_ac_cd(r.bank_ac_cd());
			tJnlR.other_ac_cd(r.other_ac_cd());
			tJnlR.other_sub_ac_cd (r.other_sub_ac_cd());
			tJnlR.other_dpt_cd(r.other_dpt_cd());
			tJnlR.abstract1(r.abstract1());
			tJnlR.abstract2(r.abstract2());
			tJnlR.sub_char1(r.sub_char1());
			tJnlR.sub_char2(r.sub_char2());
			tJnlR.sub_char3(r.sub_char3());
			tJnlR.sub_char4(r.sub_char4());
			tJnlR.sub_char5(r.sub_char5());
			tJnlR.sub_char6(r.sub_char6());
			tJnlR.sub_char7(r.sub_char7());
			tJnlR.sub_char8(r.sub_char8());
			tJnlR.sub_char9(r.sub_char9());
			tJnlR.sub_char10(r.sub_char10());
			tJnlR.sub_num1(r.sub_num1());
			tJnlR.sub_num2(r.sub_num2());
			tJnlR.sub_num3(r.sub_num3());
			tJnlR.sub_dt1(r.sub_dt1());
			tJnlR.sub_dt2(r.sub_dt2());
			tJnlR.sub_dt3(r.sub_dt3());
			tJnlR.send_flg(r.send_flg());
			tJnlR.jnl_ptn(r.jnl_ptn_cd() + "-" + r.jnl_seq());
			
			if (!isNull(tJnlR.itm_cd())) {
				tJnlR.base_cur_upri(getUnit(tJnlR.base_cur_amt(), tJnlR.base_unit_qty(), tJnlR.base_cur_cd()));
				tJnlR.trd_cur_upri(getUnit(tJnlR.trd_cur_amt(), tJnlR.base_unit_qty(), tJnlR.trd_cur_cd()));
				tJnlR.ptax_cur_upri(getUnit(tJnlR.ptax_cur_amt(), tJnlR.base_unit_qty(), tJnlR.ptax_cur_cd()));
			}
			else {
				tJnlR.base_unit_qty(null);
				tJnlR.base_cur_upri(null);
				tJnlR.trd_cur_upri(null);
				tJnlR.ptax_cur_upri(null);
			}
			tJnlR.base_cur_tax_base_amt(r.base_cur_tax_base_amt());
			tJnlR.trd_cur_tax_base_amt(r.trd_cur_tax_base_amt());
			tJnlR.ptax_cur_tax_base_amt(r.ptax_cur_tax_base_amt());

			return tJnlR;
		}
		protected MCNumber getUnit(MCNumber amt, MCNumber qty, String curCd) {
			if (isNull(curCd) || qty.isZero()) {
				return MCNumber.ZERO;
			}
			int decPlace = 2;
			MAM_CUR_R r = getCurR(curCd);
			if (!isNull(r)) {
				decPlace = r.upri_dec_place().intValue();
			}
			return amt.divide(qty, decPlace, MAC_RND_TYP.RNDOFF.toMC());
		}
		
		protected void insMbtJournal(MCList<MBT_JOURNAL_R> tJnlL) {
			dbInsertEx("MBBBL5030_MBT_JOURNAL_I01", tJnlL, MCQueryApiBuilder.create(MBT_JOURNAL_R.create("T")));
		}
		
		protected MCList<MBW_JOURNAL_R> getWJnlKeyL() {
			MCList<MBW_JOURNAL_R> l = _wJnlL.subList(_wJnlIdxKey, up0().jnl_grp_no());

			l = l.groupBy(MBW_JOURNAL_R.$ac_ym, MBW_JOURNAL_R.$ac_if_typ,
					MBW_JOURNAL_R.$slip_cnt_id, MBW_JOURNAL_R.$jnl_unit,
					MBW_JOURNAL_R.$jnl_ptn_cd, MBW_JOURNAL_R.$compound_jnl_typ,
					MBW_JOURNAL_R.$jnl_no);
			l.forEach(r -> {
				// ソート用にNumber型に変換した仕訳伝票ＮＯを追加
				r.addNumberColumn(JNL_NO_NUM, MCNumber.valueOf(r.jnl_no()));
			});
			l.sort(MBW_JOURNAL_R.$ac_ym, MBW_JOURNAL_R.$ac_if_typ,
					MBW_JOURNAL_R.$slip_cnt_id, MBW_JOURNAL_R.$jnl_unit,
					MBW_JOURNAL_R.$jnl_ptn_cd, MBW_JOURNAL_R.$compound_jnl_typ,
					JNL_NO_NUM);
			return l;
		}
		protected MCList<MBW_JOURNAL_R> getWJnlL(MBW_JOURNAL_R x) {
			MCList<MBW_JOURNAL_R> l = _wJnlL.subList(_wJnlIdxKey, up0().jnl_grp_no(),
					x.ac_ym(), x.ac_if_typ(), x.slip_cnt_id(), x.jnl_no());
			if (MAC_COMPOUND_JNL_TYP.isDNC1(x.compound_jnl_typ())) {
				l.sort(MCList.SortType.DESC, MBW_JOURNAL_R.$dc_typ);
			}
			else {
				l.sort(MBW_JOURNAL_R.$dc_typ);
			}
			return l;
		}
		
		// マスタキャッシュ
		/*** 自動仕訳マスタ キャッシュ */
		protected MCList<MAM_AUTO_JNL_R> _autoJnlCache;
		protected MCIndexKey _autoJnlIdxKey;
		protected void initAutoJnlCache() {
			// 会計伝票区分と自動仕訳キーＣＤの条件だけで検索し、キャッシュ
			// 適用日の条件はgetAutoJnlLでチェックする
			_autoJnlCache = MCList.create(MAM_AUTO_JNL_R.class);
			MAM_AUTO_JNL_R t = MAM_AUTO_JNL_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.auto_jnl_grp);
			bldr.addSelect(t.ac_if_typ);
			bldr.addSelect(t.id_typ);
			bldr.addSelect(t.slip_cnt_id);
			bldr.addSelect(t.jnl_ptn_cd);
			bldr.addSelect(t.prio);
			bldr.addSelect(t.minus_flg);
			bldr.addSelect(t.rev_flg);
			bldr.addSelect(t.minus_rev_flg);
			bldr.addSelect(t.default_flg);
			bldr.addSelect(t.cls_jnl_typ);
			bldr.addSelect(t.alloc_jnl_flg);
			bldr.addSelect(t.abs_typ);
			bldr.addSelect(t.abstract1);
			bldr.addSelect(nvl(t.std_rnd_typ, value(MAC_RND_TYP.RNDOFF.value())).as("std_rnd_typ"));
			bldr.addSelect(nvl(t.compound_jnl_typ, value(MAC_COMPOUND_JNL_TYP.OTHER.value())).as("compound_jnl_typ"));
			bldr.addSelect(t.ac_slip_typ);
			bldr.addSelect(nvl(t.auto_jnl_key_cd, value(MAC_STR.NULL_VAL.value())).as("auto_jnl_key_cd"));
			bldr.addSelect(t.st_dt);
			bldr.addSelect(t.end_dt);
			bldr.setWhere(t.ac_slip_typ.eq(bind("ac_slip_typ"))
					.and(nvl(t.auto_jnl_key_cd, value(MAC_STR.NULL_VAL.value())).eq(nvl(
							bind("auto_jnl_key_cd"), value(MAC_STR.NULL_VAL.value()))))
					.and(t.del_flg.eq(value(false))));
			MCList<AutoJnl_Upd02_DtlR> bindL = up1().groupBy(MAM_AUTO_JNL_R.$ac_slip_typ, 	MAM_AUTO_JNL_R.$auto_jnl_key_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), _autoJnlCache, bldr, bindL);
			_autoJnlIdxKey = _autoJnlCache.createIndex(MAM_AUTO_JNL_R.$ac_slip_typ, MAM_AUTO_JNL_R.$auto_jnl_key_cd);
		}
		protected MCList<MAM_AUTO_JNL_R> getAutoJnlL(String acSlipTyp, String autoJnlKeyCd, MCDate ac_dt) {
			MCList<MAM_AUTO_JNL_R> l = MCList.create(MAM_AUTO_JNL_R.class);
			for (MAM_AUTO_JNL_R r : _autoJnlCache.subList(_autoJnlIdxKey, acSlipTyp, nvl(autoJnlKeyCd, MAC_STR.NULL_VAL.value()))) {
				MCDate stDt = r.st_dt();
				MCDate endDt = r.end_dt();
				if (ac_dt.gte(stDt) && ac_dt.lte(endDt)) {
					l.add(r);
				}
			}
			l.sort(MAM_AUTO_JNL_R.$auto_jnl_grp, MAM_AUTO_JNL_R.$default_flg, MAM_AUTO_JNL_R.$prio, MAM_AUTO_JNL_R.$jnl_ptn_cd);
			return l;
		}
		
		/*** 会計部門マスタキャッシュ */
		protected FXUCL_MCDbcCacheStEnd<MAM_AC_DPT_R> _acDptCache;
		protected void initAcDptCache() {
			MAM_AC_DPT_R t = MAM_AC_DPT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.ac_dpt_cd);
			bldr.addSelect(t.st_dt);
			bldr.addSelect(t.end_dt);
			bldr.addSelect(t.slip_cnt_id);
			_acDptCache = new FXUCL_MCDbcCacheStEnd<MAM_AC_DPT_R>(bldr, -1, getBindDptL(), MAM_AC_DPT_R.$ac_dpt_cd);
		}
		protected MAM_AC_DPT_R getAcDptR(String dptCd, MCDate dt) {
			return _acDptCache.get(dt, dptCd);
		}
		protected MCList<MAM_AC_DPT_R> getBindDptL() {
			MCList<MAM_AC_DPT_R> l = MCList.create(MAM_AC_DPT_R.class);
			for (String dptCol : new String[] {
					AutoJnl_Upd02_DtlR.$purc_dpt_cd, AutoJnl_Upd02_DtlR.$ap_dpt_cd,
					AutoJnl_Upd02_DtlR.$sls_dpt_cd, AutoJnl_Upd02_DtlR.$ar_dpt_cd,
					AutoJnl_Upd02_DtlR.$gi_dpt_cd, AutoJnl_Upd02_DtlR.$gr_dpt_cd,
					AutoJnl_Upd02_DtlR.$bd_dpt_cd, AutoJnl_Upd02_DtlR.$rcv_dpt_cd,
					AutoJnl_Upd02_DtlR.$so_dpt_cd, AutoJnl_Upd02_DtlR.$sub_dpt_cd1,
					AutoJnl_Upd02_DtlR.$sub_dpt_cd2, AutoJnl_Upd02_DtlR.$sub_dpt_cd3
			}) {
				up1().groupBy(dptCol).forEach(r -> {
					MAM_AC_DPT_R dbc = MAM_AC_DPT_R.create();
					dbc.ac_dpt_cd(r.getString(dptCol));
					l.add(dbc);
				});
			}
			return l;
		}
		
		/*** 自動仕訳パタンマスタ */
		protected MCList<MAM_JNL_PTN_R> _jnlPtnCache;
		protected MCIndexKey _jnlPtnIdxKey;
		protected void initJnlPtnCache() {
			_jnlPtnCache = MCList.create(MAM_JNL_PTN_R.class);
			MAM_JNL_PTN_R t = MAM_JNL_PTN_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.jnl_ptn_cd);
			bldr.addSelect(t.jnl_seq);
			bldr.addSelect(t.dr_dpt_typ);
			bldr.addSelect(t.dr_dpt_cd);
			bldr.addSelect(t.dr_ptn_typ);
			bldr.addSelect(t.dr_grp_cd);
			bldr.addSelect(t.dr_ac_cd );
			bldr.addSelect(t.dr_sub_ac_cd);
			bldr.addSelect(t.dr_bp_typ);
			bldr.addSelect(t.dr_bp_cd);
			bldr.addSelect(t.dr_itm_typ);
			bldr.addSelect(t.dr_amt_typ);
			bldr.addSelect(t.dr_abs_typ );
			bldr.addSelect(t.dr_abstract );
			bldr.addSelect(t.dr_ac_tax_cd);
			bldr.addSelect(t.cr_dpt_typ);
			bldr.addSelect(t.cr_dpt_cd);
			bldr.addSelect(t.cr_ptn_typ);
			bldr.addSelect(t.cr_grp_cd);
			bldr.addSelect(t.cr_ac_cd );
			bldr.addSelect(t.cr_sub_ac_cd);
			bldr.addSelect(t.cr_bp_typ);
			bldr.addSelect(t.cr_bp_cd);
			bldr.addSelect(t.cr_itm_typ);
			bldr.addSelect(t.cr_amt_typ);
			bldr.addSelect(t.cr_abs_typ );
			bldr.addSelect(t.cr_abstract );
			bldr.addSelect(t.cr_ac_tax_cd);
			bldr.addSelect(t.minus_flg);
			bldr.addSelect(t.carry_flg);
			bldr.addSelect(t.dr_trd_sml_flg);
			bldr.addSelect(t.cr_trd_sml_flg);
			bldr.addSelect(t.itm_cd);
			bldr.addSelect(t.itm_sub1);
			bldr.addSelect(t.itm_sub2);
			bldr.addSelect(t.itm_sub3);
			bldr.addSelect(t.itm_jnl_cd);
			bldr.addSelect(t.ac_rsn_cd);
			bldr.addSelect(t.purc_typ);
			bldr.addSelect(t.un_fix_typ);
			bldr.addSelect(decode(t.foreign_typ,
					value(MAC_FOREIGN_TYP.INTERNAL.value()), value("0"),
					value(MAC_FOREIGN_TYP.ABROAD.value()), value("1"),
					nullValue()).as("foreign_typ"));
			bldr.addSelect(t.cur_cd);
			bldr.addSelect(t.asst_typ);
			bldr.addSelect(t.quality_typ);
			bldr.addSelect(t.inv_loc_typ);
			bldr.addSelect(t.amt_sign_typ);
			bldr.addSelect(t.mon01_invalid_flg);
			bldr.addSelect(t.mon02_invalid_flg);
			bldr.addSelect(t.mon03_invalid_flg);
			bldr.addSelect(t.mon04_invalid_flg);
			bldr.addSelect(t.mon05_invalid_flg);
			bldr.addSelect(t.mon06_invalid_flg);
			bldr.addSelect(t.mon07_invalid_flg);
			bldr.addSelect(t.mon08_invalid_flg);
			bldr.addSelect(t.mon09_invalid_flg);
			bldr.addSelect(t.mon10_invalid_flg);
			bldr.addSelect(t.mon11_invalid_flg);
			bldr.addSelect(t.mon12_invalid_flg);
			bldr.addSelect(t.jnl_key1);
			bldr.addSelect(t.jnl_key2);
			bldr.addSelect(t.jnl_key3);
			bldr.addSelect(t.jnl_key4);
			bldr.addSelect(t.jnl_key5);
			bldr.addSelect(t.jnl_key6);
			bldr.addSelect(t.jnl_key7);
			bldr.addSelect(t.jnl_key8);
			bldr.addSelect(t.jnl_key9);
			bldr.addSelect(t.jnl_key10);
			bldr.setWhere(t.jnl_ptn_cd.eq(bind("jnl_ptn_cd")).and(t.del_flg.eq(value(false))));
			MCList<MAM_AUTO_JNL_R> bindL = _autoJnlCache.groupBy(MAM_AUTO_JNL_R.$jnl_ptn_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), _jnlPtnCache, bldr, bindL);
			_jnlPtnIdxKey = _jnlPtnCache.createIndex(MAM_JNL_PTN_R.$jnl_ptn_cd);
		}
		protected MCList<MAM_JNL_PTN_R> getJnlPtnL(String jnlPtnCd) {
			MCList<MAM_JNL_PTN_R> l = _jnlPtnCache.subList(_jnlPtnIdxKey, jnlPtnCd);
			l.sort(MAM_JNL_PTN_R.$jnl_seq);
			return l;
		}
		
		/*** 会計理由科目設定マスタキャッシュ */
		protected MCList<MAM_RSN_AC_R> _rsnAcCache;
		protected MCIndexKey _rsnAcIdxKey;
		protected void initRsnAcCache() {
			_rsnAcCache = MCList.create(MAM_RSN_AC_R.class);
			MAM_RSN_AC_R t = MAM_RSN_AC_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.jnl_grp_cd);
			bldr.addSelect(t.ac_rsn_cd);
			bldr.addSelect(t.ac_cd);
			bldr.addSelect(t.sub_ac_cd);
			bldr.addSelect(t.bp_typ);
			bldr.addSelect(t.bp_cd);
			bldr.addSelect(t.itm_typ);
			bldr.addSelect(t.amt_typ);
			bldr.addSelect(t.ac_tax_cd);
			bldr.addSelect(t.abs_typ);
			bldr.addSelect(t.abstract2);
			bldr.setWhere(t.ac_rsn_cd.eq(bind("ac_rsn_cd")).and(t.del_flg.eq(value(false))));
			MCList<AutoJnl_Upd02_DtlR> bindL = up1().groupBy(AutoJnl_Upd02_DtlR.$ac_rsn_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), _rsnAcCache, bldr, bindL);
			_rsnAcIdxKey = _rsnAcCache.createIndex(MAM_RSN_AC_R.$jnl_grp_cd, MAM_RSN_AC_R.$ac_rsn_cd);
		}
		protected MAM_RSN_AC_R getRsnAcR(String jnlGrpCd, String acRsnCd) {
			MAM_RSN_AC_R r = _rsnAcCache.getFirst(_rsnAcIdxKey, jnlGrpCd, acRsnCd);
			if (isNull(r)) {
				return MAM_RSN_AC_R.create();
			}
			return r;
		}
		
		/*** 品目仕訳科目設定マスタキャッシュ */
		protected MCList<MAM_JNL_AC_R> _jnlAcCache;
		protected MCIndexKey _jnlAcIdxKey;
		protected void initJnlAcCache() {
			_jnlAcCache = MCList.create(MAM_JNL_AC_R.class);
			MAM_JNL_AC_R t = MAM_JNL_AC_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.jnl_grp_cd);
			bldr.addSelect(t.itm_jnl_cd);
			bldr.addSelect(t.ac_cd);
			bldr.addSelect(t.sub_ac_cd);
			bldr.addSelect(t.bp_typ);
			bldr.addSelect(t.bp_cd);
			bldr.addSelect(t.itm_typ);
			bldr.addSelect(t.amt_typ);
			bldr.addSelect(t.ac_tax_cd);
			bldr.addSelect(t.abs_typ);
			bldr.addSelect(t.abstract2);
			bldr.setWhere(t.itm_jnl_cd.eq(bind("itm_jnl_cd")).and(t.del_flg.eq(value(false))));
			MCList<AutoJnl_Upd02_DtlR> bindL = up1().groupBy(AutoJnl_Upd02_DtlR.$itm_jnl_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), _jnlAcCache, bldr, bindL);
			_jnlAcIdxKey = _jnlAcCache.createIndex(MAM_JNL_AC_R.$jnl_grp_cd, MAM_JNL_AC_R.$itm_jnl_cd);
		}
		protected MAM_JNL_AC_R getJnlAcR(String jnlGrpCd, String itmJnlCd) {
			MAM_JNL_AC_R r = _jnlAcCache.getFirst(_jnlAcIdxKey, jnlGrpCd, itmJnlCd);
			if (isNull(r)) {
				return MAM_JNL_AC_R.create();
			}
			return r;
		}
		
		/*** 口座科目設定マスタキャッシュ */
		protected MCList<MAM_BAC_AC_R> _bacAcCache;
		protected MCIndexKey _bacAcIdxKey;
		protected void initBacAcCache() {
			_bacAcCache = MCList.create(MAM_BAC_AC_R.class);
			MAM_BAC_AC_R t = MAM_BAC_AC_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.jnl_grp_cd);
			bldr.addSelect(t.bank_ac_cd);
			bldr.addSelect(t.ac_cd);
			bldr.addSelect(t.sub_ac_cd);
			bldr.addSelect(t.bp_typ);
			bldr.addSelect(t.bp_cd);
			bldr.addSelect(t.itm_typ);
			bldr.addSelect(t.amt_typ);
			bldr.addSelect(t.ac_tax_cd);
			bldr.addSelect(t.abs_typ);
			bldr.addSelect(t.abstract2);
			bldr.setWhere(t.bank_ac_cd.eq(bind("bank_ac_cd")).and(t.del_flg.eq(value(false))));
			MCList<AutoJnl_Upd02_DtlR> bindL = up1().groupBy(AutoJnl_Upd02_DtlR.$bank_ac_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), _bacAcCache, bldr, bindL);
			_bacAcIdxKey = _bacAcCache.createIndex(MAM_BAC_AC_R.$jnl_grp_cd, MAM_BAC_AC_R.$bank_ac_cd);
		}
		protected MAM_BAC_AC_R getBacAcR(String jnlGrpCd, String bankAcCd) {
			MAM_BAC_AC_R r = _bacAcCache.getFirst(_bacAcIdxKey, jnlGrpCd, bankAcCd);
			if (isNull(r)) {
				return MAM_BAC_AC_R.create();
			}
			return r;
		}
		
		/*** 勘定科目マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_ACCOUNT_R> _accountCache;
		protected void initAccountCache() {
			MAM_ACCOUNT_R t = MAM_ACCOUNT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.ac_cd);
			bldr.addSelect(t.ac_nm);
			bldr.addSelect(t.sub_flg);
			bldr.addSelect(t.ac_tax_cd);
			bldr.addSelect(t.ac_tax_typ);
			bldr.addSelect(t.foreign_flg);
			bldr.addSelect(t.sum0_flg);
			bldr.addSelect(t.sum1_flg);
			bldr.addSelect(t.sum2_flg);
			bldr.addSelect(t.sum3_flg);
			bldr.addSelect(t.sum4_flg);
			bldr.addSelect(t.sum5_flg);
			bldr.addSelect(t.project_flg);
			bldr.addSelect(t.bp_flg);
			bldr.addSelect(t.bank_ac_flg);
			bldr.addSelect(t.usr_flg);
			_accountCache = new FXUCL_MCDbcCache<MAM_ACCOUNT_R>(bldr, getBindAcL(), MAM_ACCOUNT_R.$ac_cd);
		}
		protected MAM_ACCOUNT_R getAccountR(String acCd) {
			MAM_ACCOUNT_R m = _accountCache.get(acCd);
			if (m.isEmpty()) {
				return null;
			}
			return m;
		}
		protected MCList<MAM_ACCOUNT_R> getBindAcL() {
			MCList<MAM_ACCOUNT_R> l = MCList.create(MAM_ACCOUNT_R.class);
			for (String acCol : new String[] {
					MAM_JNL_PTN_R.$dr_ac_cd, MAM_JNL_PTN_R.$cr_ac_cd
			}) {
				_jnlPtnCache.groupBy(acCol).forEach(r -> {
					MAM_ACCOUNT_R dbc = MAM_ACCOUNT_R.create();
					dbc.ac_cd(r.getString(acCol));
					l.add(dbc);
				});
			}
			_rsnAcCache.groupBy(MAM_RSN_AC_R.$ac_cd).forEach(r -> {
				MAM_ACCOUNT_R dbc = MAM_ACCOUNT_R.create();
				dbc.ac_cd(r.getString(MAM_RSN_AC_R.$ac_cd));
				l.add(dbc);
			});
			_jnlAcCache.groupBy(MAM_JNL_AC_R.$ac_cd).forEach(r -> {
				MAM_ACCOUNT_R dbc = MAM_ACCOUNT_R.create();
				dbc.ac_cd(r.getString(MAM_JNL_AC_R.$ac_cd));
				l.add(dbc);
			});
			_bacAcCache.groupBy(MAM_BAC_AC_R.$ac_cd).forEach(r -> {
				MAM_ACCOUNT_R dbc = MAM_ACCOUNT_R.create();
				dbc.ac_cd(r.getString(MAM_BAC_AC_R.$ac_cd));
				l.add(dbc);
			});
			return l;
		}
		
		// 税情報
		protected FXUCL_MCDbcCache<MAM_AC_TAX_R> _acTaxCache;
		protected FXUCL_MCDbcCache<MAM_AC_TAX_R> acTaxCache() {
			if (_acTaxCache == null) {
				MAM_AC_TAX_R t = MAM_AC_TAX_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSelect(t.ac_tax_cd);
				bldr.addSelect(t.ac_tax_typ);
				bldr.addSelect(t.tran_flg);
				_acTaxCache = new FXUCL_MCDbcCache<MAM_AC_TAX_R>(bldr);
			}
			return _acTaxCache;
		}
		protected MAM_AC_TAX_R getAcTaxR(String acTaxCd) {
			MAM_AC_TAX_R m = acTaxCache().get(acTaxCd);
			if (m.isEmpty()) {
				return null;
			}
			return m;
		}
		
		/*** 標準単価マスタキャッシュ */
		protected FXUCL_MCDbcCacheCW<MAM_STDCOST_R> _stdCostCache;
		protected FXUCL_MCDbcCacheCW<MAM_STDCOST_R> stdCostCache() {
			if (_stdCostCache == null) {
				MAM_STDCOST_R t = MAM_STDCOST_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSelect(t.std_qty);
				bldr.addSelect(t.std_upri);
				bldr.setWhere(t.term.eq(bind("b1")));
				bldr.addWhereWithAnd(t.itm_cd.eq(bind("b2")));
				bldr.addWhereWithAnd(t.itm_sub1.eq(bind("b3")));
				bldr.addWhereWithAnd(t.itm_sub2.eq(bind("b4")));
				bldr.addWhereWithAnd(t.itm_sub3.eq(bind("b5")));
				bldr.addWhereWithAnd(t.wg_cd.eq(bind("b6")));
				bldr.addWhereWithAnd(t.std_qty.neq(value(0)));
				bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
				_stdCostCache = new FXUCL_MCDbcCacheCW<MAM_STDCOST_R>(bldr);
			}
			return _stdCostCache;
		}
		protected MCNumber getStdCost(AutoJnl_Upd02_DtlR r, MAM_AUTO_JNL_R jnlR) {
			MAM_STDCOST_R m = stdCostCache().get(up0().getDate("term"), r.itm_cd(),
					r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd());
			if (m.isEmpty()) {
				return null;
			}
			return m.std_upri().multiply(r.base_unit_qty()).divide(m.std_qty(),
					up0().getNumber("digit").intValue(),
					MAC_RND_TYP.toMC(jnlR.std_rnd_typ()));
		}
		
		/*** 口座マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_BANK_AC_R> _bankAcCache;
		protected FXUCL_MCDbcCache<MAM_BANK_AC_R> bankAcCache() {
			if (_bankAcCache == null) {
				MAM_BANK_AC_R t = MAM_BANK_AC_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSelect(t.bank_ac_cd);
				bldr.addSelect(t.bank_ac_nm);
				_bankAcCache = new FXUCL_MCDbcCache<MAM_BANK_AC_R>(bldr);
			}
			return _bankAcCache;
		}
		protected MAM_BANK_AC_R getBankAcR(String bankAcCd) {
			return bankAcCache().get(bankAcCd);
		}
		
		/*** 取引先マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
		protected FXUCL_MCDbcCache<MAM_BP_R> bpCache() {
			if (_bpCache == null) {
				MAM_BP_R t = MAM_BP_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSelect(t.bp_cd);
				bldr.addSelect(t.bp_nm);
				_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bldr);
			}
			return _bpCache;
		}
		protected MAM_BP_R getBpR(String bpCd) {
			MAM_BP_R m = bpCache().get(bpCd);
			if (m.isEmpty()) {
				return null;
			}
			return m;
		}
		
		/*** 通貨マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache;
		protected FXUCL_MCDbcCache<MAM_CUR_R> curCache() {
			if (_curCache == null) {
				MAM_CUR_R t = MAM_CUR_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSelect(t.cur_cd);
				bldr.addSelect(t.upri_dec_place);
				_curCache = new FXUCL_MCDbcCache<MAM_CUR_R>(bldr);
			}
			return _curCache;
		}
		protected MAM_CUR_R getCurR(String curCd) {
			MAM_CUR_R m = curCache().get(curCd);
			if (m.isEmpty()) {
				return null;
			}
			return m;
		}
	}

	protected static final Class<MBBBL_AutoJnlService> CLAZZ = MBBBL_AutoJnlService.class;

	// 仕訳伝票ＮＯ（仮）（AtomicInteger）
	protected AtomicInteger _jnlNoTmp = null;
	protected int getJnlNoTmp() {
		if (object(CLAZZ)._jnlNoTmp == null) {
			object(CLAZZ)._jnlNoTmp = new AtomicInteger();
		}
		return object(CLAZZ)._jnlNoTmp.getAndIncrement();
	}

	// 仕訳伝票ＮＯ発番用テーブルキャッシュ（synchronized）
	protected MCList<MBT_JNL_NO_CTL_R> _jnlNoCtlCache;
	protected MCIndexKey _jnlNoCtlIdxKey;
	protected static final String JNL_NO_NUM = "jnl_no_num";
	protected void initJnlNoCtlCache(AutoJnl_Chk01_CndR bindR) {
		object(CLAZZ)._jnlNoCtlCache = MCList.create(MBT_JNL_NO_CTL_R.class);
		MBT_JNL_NO_CTL_R t = MBT_JNL_NO_CTL_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.ac_ym);
		bldr.addSelect(t.ac_if_typ);
		bldr.addSelect(t.slip_cnt_id);
		bldr.addSelect(toNumber(t.jnl_no).as(JNL_NO_NUM));
		bldr.setWhere(t.ac_ym.between(bind("ac_ym"), bind("ac_ym_next")));
		bldr.setOrderByAsc(t.ac_ym, t.ac_if_typ, t.slip_cnt_id);
		dbSelectForUpdateNoWait(createSqlId(LOGIC_ID, t, "S01"), object(CLAZZ)._jnlNoCtlCache, bldr, bindR);
		object(CLAZZ)._jnlNoCtlIdxKey = object(CLAZZ)._jnlNoCtlCache.createIndex(MBT_JNL_NO_CTL_R.$ac_ym, MBT_JNL_NO_CTL_R.$ac_if_typ, MBT_JNL_NO_CTL_R.$slip_cnt_id);
	}
	protected synchronized MCNumber incrementAndGetJnlNo(MCDate acYm, String acIfTyp, String slipCntId) {
		MBT_JNL_NO_CTL_R r = object(CLAZZ)._jnlNoCtlCache.getFirst(object(CLAZZ)._jnlNoCtlIdxKey, acYm, acIfTyp, slipCntId);
		if (isNull(r)) {
			r = MBT_JNL_NO_CTL_R.create();
			r.ac_ym(acYm);
			r.ac_if_typ(acIfTyp);
			r.slip_cnt_id(slipCntId);
			r.addNumberColumn(JNL_NO_NUM, MCNumber.ONE);
			object(CLAZZ)._jnlNoCtlCache.add(r);
			object(CLAZZ)._jnlNoCtlIdxKey = object(CLAZZ)._jnlNoCtlCache.createIndex(MBT_JNL_NO_CTL_R.$ac_ym, MBT_JNL_NO_CTL_R.$ac_if_typ, MBT_JNL_NO_CTL_R.$slip_cnt_id);
		}
		else {
			r.setNumber(JNL_NO_NUM, r.getNumber(JNL_NO_NUM).add(1));
		}
		return r.getNumber(JNL_NO_NUM);
	}

	//FMCB CUSTOM END
}