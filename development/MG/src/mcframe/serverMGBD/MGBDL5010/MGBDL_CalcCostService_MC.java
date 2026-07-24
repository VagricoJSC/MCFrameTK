package mcframe.serverMGBD.MGBDL5010;

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
import mcframe.serverMG.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBD.MGBDL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.sys.*;
import mcframe.serverCore.resource.MCConfig;
import static mcframe.serverMGBD.MGBDL5010.Query.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
import mcframe.serverCore.mcjdbc.MCConnectionPool;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CalcCostService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CalcCostService_MC extends MGBDL_CalcCostService_MC_A{
	//FMCB CUSTOM START
	protected static final String MGPA_SET_ITM_EXT = "MGPA_SET_ITM_EXT";
	protected static final String MGPA_IO = "MGPA_IO";
	protected static final String MGPA_WIP_LOC = "MGPA_WIP_LOC";
	protected static final String MGPA_SCA_POST = "MGPA_SCA_POST";
	protected static final String MGPA_RPT = "MGPA_RPT";
	protected static final String MGPA_COST_IO = "MGPA_COST_IO";
	protected static final String MGPA_CARRY_OVER = "MGPA_CARRY_OVER";

	/**
	 * CalcCost_Ins01オペレーション.<p>
	 *
	 * 原価計算を実行する。<br>
	 */
	public class CalcCost_Ins01 extends MGBDL_CalcCostService_MC_A.CalcCost_Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			int dataRefCtl = 0;
			for (CalcCost_CndR ur : up0()) {
				initLogger(dataRefCtl++);
				try {
					execMain(ur);
					if (ur.err_flg() && !ur.err_proceed_flg()) {
						break;
					}
				}
				finally {
					writeEndLogWithLogger(MGBDL0025);
					logger().close();
				}
			}
		}

		protected void execMain(CalcCost_CndR ur) {
			//上り電文を下り電文として設定する
			CalcCost_CndR dr = ur;
			down0().add(dr);

			//標準エラー出力内容
			String msg = null;
			try {
				execArg(ur, dr);
				//計算回数でループ
				int loopCnt = dr.getNumberNE("calc_cnt").intValue();
				for (int i = 0; i < loopCnt; i++) {
					//前処理
					execScaPrep(ur, dr);
					//エンジン起動処理
					msg = execSca(i, ur, dr);
					//後処理
					execScaPost(ur, dr);
					dbTran().commit();
				}
			}
			catch (MCException e) {
				dr.err_flg(true);
				dbTran().rollback();
				MCMessageList cause = new MCMessageList();
				if (exHandled()) {
					// handleExWithLoggerの中でメインのエラーは出力されているため
					addCauseTo(e.getCause(), cause);
				}
				else {
					addCauseTo(e, cause);
				}
				logger().writeProcessLog(cause);
				//サーバ処理管理にはエラーメッセージのみ表示する。
				MCMessagePool.add(e.getMCMessage());
				MCLog.write(e);
			}
			if (!dr.err_flg()) {
				MCMessagePool.add(new MCMessage(ur, null, MGBDL0003,
						ur.calc_grp_cd(), dr.calc_no(), msg, toDispGUIIndex(ur)));
			}
		}

		/**
		 * 例外と原因メッセージをメッセージリストに設定する。
		 * @param e 例外
		 */
		protected void addCauseTo(Throwable e, MCMessageList ml) {
			if (e == null) {
				return ;
			}
			if (e instanceof MCException) {
				MCException me = (MCException)e;
				ml.add(me.getMCMessage());
			}
			addCauseTo(e.getCause(), ml);
		}

		protected void initLogger(int dataRefCtl) {
			initBatchLogger(Integer.toString(dataRefCtl), autoCommitDBTran());
			writeStartLogWithLogger(MGBDL0024);
		}

		protected void execArg(CalcCost_CndR ur, CalcCost_CndR dr) {
			dr.addNumberColumn("calc_cnt");
			try {
				String procId = "MGPA_ARG$P_SET_ARG";
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"),
						procId,
						ur,
						dr,
						":term, "
						+ ":calc_grp_cd, "
						+ ":ym_fr, "
						+ ":ym_to, "
						+ ":xrate_cd, "
						+ ":itm_limit_flg, "
						+ ":data_check_flg, "
						+ ":carry_flg, "
						+ ":rmrks, "
						+ ":sub_char1, "
						+ ":sub_char2, "
						+ ":sub_char3, "
						+ ":calc_no, "
						+ ":calc_cnt", 
						"calc_no", "calc_cnt");
			}
			catch (Exception e) {
				callCalcErr(dr);
				throwCalcPlErr(e, ur, dr);
			}
		}

		protected void execScaPrep(CalcCost_CndR ur, CalcCost_CndR dr) {
			try {
				// 引数用
				dr.calc_grp_cd(ur.calc_grp_cd());
				String procId = "MGPA_SCA_PREP$P_MAIN";
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, dr, null, ":calc_grp_cd, :calc_no");
			}
			catch (Exception e) {
				callCalcErr(dr);
				throwCalcPlErr(e, ur, dr);
			}
		}

		protected void execScaPost(CalcCost_CndR ur, CalcCost_CndR dr) {
			try {
				execScaPost2(dr);
			}
			catch (Exception e) {
				callCalcErr(dr);
				throwCalcPlErr(e, ur, dr);
			}
		}
		
		/**
		 * 原価計算前、後処理用のPL/SQL処理でエラーが発生した場合の例外をthrowします。
		 */
		protected void throwCalcPlErr(Exception e, CalcCost_CndR ur, CalcCost_CndR dr) {
			MCAppException ex = new MCAppException(e, ur, null, MGBDL0002, 
					ur.calc_grp_cd(), dr.calc_no(), 
					toDispGUIIndex(ur));
			handleExWithLogger(ex);
		}

		/**
		 * プロシージャが例外を投げた場合の処理を実行します
		 */
		protected void callCalcErr(CalcCost_CndR dr) {
			try {
				String procId = "MGPA_ARG$P_CALC_ERR";
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, dr, null, ":calc_grp_cd, :calc_no");
			}
			catch (Exception e) {
				MCLog.write(e);
			}
		}

		protected String execSca(int i, CalcCost_CndR ur, CalcCost_CndR dr) {
			// 計算ログの最大文字数を取得する
			int limit = getParm(ur, dr);

			// コマンドの設定
			MCExec exe = new MCExec();
			exe.setStdEncode("UTF-8");
			exe.setCommand(getScaCommand(ur, dr, i));
			exe.setWait(true);
			if (limit == 0) {
				exe.keepStderr(false);
			}
			else {
				exe.keepStderr(true);
			}

			logger().writeProcessLog(new MCMessage(MGBDL0066, ur.calc_grp_cd(), dr.calc_no()));
			int ret = 0;
			try {
				ret = exe.execute();
			}
			catch (Exception e) {
				callCalcErr(dr);
				throwCalcExeErr(ur, dr, e);
			}
			logger().writeProcessLog(new MCMessage(MGBDL0067));

			String msg = null;
			if (0 < limit) {
				int len = exe.getStderr().length();
				if (limit * 2 < len) {
					msg = exe.getStderr().substring(0, limit);
					msg = msg.concat(MCStringUtil.LF_CODE);
					msg = msg.concat(MCStringUtil.LF_CODE);
					msg = msg.concat(exe.getStderr().substring(len - limit));
				}
				else {
					msg = exe.getStderr();
				}
			}
			else if (limit != 0) {
				msg = exe.getStderr();
			}

			if (ret != 0) {
				callCalcErr(dr);
				throwCalcExeErr(ur, dr, msg);
			}
			return msg;
		}

		/**
		 * 原価計算エンジンでエラーが発生した場合の例外をthrowします。
		 */
		protected void throwCalcExeErr(CalcCost_CndR ur, CalcCost_CndR dr, Exception e) {
			MCAppException ex = new MCAppException(e, getCalcExeErrMsg(ur, dr, e.getMessage()));
			handleExWithLogger(ex);
		}
		/**
		 * 原価計算エンジンでエラーが発生した場合の例外をthrowします。
		 */
		protected void throwCalcExeErr(CalcCost_CndR ur, CalcCost_CndR dr, String msg) {
			MCAppException ex = new MCAppException(getCalcExeErrMsg(ur, dr, msg));
			handleExWithLogger(ex);
		}
		protected MCMessage getCalcExeErrMsg(CalcCost_CndR ur, CalcCost_CndR dr, String msg) {
			return new MCMessage(ur, null, 
					MGBDL0001, ur.calc_grp_cd(), dr.calc_no(), 
					msg, toDispGUIIndex(ur));
		}
		
		protected String getScaCommand(CalcCost_CndR ur, CalcCost_CndR dr, int i) {
			
			String v = String.join(" ", 
					toStr(MCConfig.server.getString("MG.sca.command")),
					toStr(MCConfig.server.getString("MG.sca.home")),
					toStr(MCSys.user.coCD()), 
					toStr(MCSys.user.ID()),
					toStr(MCSys.user.locale().toString()), 
					toStr(ur.calc_grp_cd()),
					toStr(dr.calc_no()), 
					toStr(i),
					toStr(dr.getValueNE("calc_cnt")),
					toStr(MCConnectionPool.getDBInfo().getUsername()),
					toStr(MCConnectionPool.getDBInfo().getPassword()),
					toStr(MCConfig.server.getString("database.server")),
					toStr(MCConfig.server.getString("database.port")),
					toStr(MCConfig.server.getString("database.dbname")),
					toStr(MCConfig.server.getString("database.schema")),
					toStr(MCConfig.server.getString("database.sid")),
					toStr(mcframe.serverCore.sys.MCSys.env.MCF_HOME()),
					toStr(MCDatabaseManager.isOracle()),
					toStr(MCDatabaseManager.isPostgreSql())
					);
			
			return v;
		}
		/**
		 * 引数の文字列表現を返します。<p>
		 * nullの場合は"null"を返します。
		 * @param v 値
		 * @return　文字列 
		 */
		protected String toStr(Comparable<?> v) {
			return String.valueOf(v);
		}
		
		protected int getParm(CalcCost_CndR ur, CalcCost_CndR dr) {

			MGT_CALC_PARM_R dbc = MGT_CALC_PARM_R.create();
			MGT_CALC_PARM_R t = MGT_CALC_PARM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.calc_grp_cd.eq(bind("1")), ur.calc_grp_cd());
			dbc_bldr.addWhereWithAnd(t.calc_no.eq(bind("1")), dr.calc_no());
			dbc_bldr.addWhereWithAnd(t.parm_key.eq(bind("1")), "ETC_LIMIT_LOG");
			dbSelect("MGBDL5010_MGT_CALC_PARM_S01", dbc, dbc_bldr);

			try {
				if (isNull(dbc.parm_val())) {
					return -1;
				}
				int limit = Integer.valueOf(dbc.parm_val());
				if (limit <= 0) {
					return 0;
				}
				return limit;
			}
			catch (Exception e) {
				//数値に変換できないパラメータ値の場合
				MCLog.write(e);
				return -1;
			}
		}

		/**
		 * 品目ループ回避項目を指定しているかを返す。<p>
		 * 原価計算パラメータ「ETC_ITM_EXT」を参照する。
		 */
		protected boolean isEtcItmExt(CalcCost_CndR dr) {
			MGT_PARM_R dbc = MGT_PARM_R.create();
			MGT_PARM_R t = MGT_PARM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.calc_grp_cd.eq(bind("1")), dr.calc_grp_cd());
			dbc_bldr.addWhereWithAnd(t.parm_key.eq(value("ETC_ITM_EXT")));
			return dbSelect("MGBDL5010_MGT_PARM_S01", dbc, dbc_bldr) > 0 && (isSame(dbc.parm_val(), "1")
					|| isSame(dbc.parm_val(), "2") || isSame(dbc.parm_val(), "3")
					|| isSame(dbc.parm_val(), "4") || isSame(dbc.parm_val(), "5")
					|| isSame(dbc.parm_val(), "6"));
		}
		/**
		 * 原価計算後処理のマルチスレッド実行<p>
		 */
		protected void execScaPost2(CalcCost_CndR dr) {

			MGT_ARG_R arg = f_get_arg(dr.calc_grp_cd(), dr.calc_no());
			if (arg.calc_exec_cnt().lt(arg.calc_cnt())) {
				String procId = "MGPA_SCA_POST$P_MAIN";
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, dr, null, ":calc_grp_cd, :calc_no");
				return;
			}

			// 呼び出し元スレッドのDBトランザクションはマルチスレッドでは使わない
			MCServerThreadManager.setUseMainDBTran(false);
			MCServerThreadManager.setCommitAndRollback(true);

			if (isEtcItmExt(dr)) {
				for (int i=1; i <= 13; i++) {
					CalcCost_Ins02 ins02 = crtCalcCost_Ins02();
					ins02.up0().calc_grp_cd(arg.calc_grp_cd());
					ins02.up0().calc_no(arg.calc_no());
					ins02.up0().st_ym(arg.st_ym());
					ins02.up0().proc_typ(MGPA_SET_ITM_EXT);
					ins02.up0().sql_no(i);
					// オペレーションを作ったそばからマルチスレッドで実行
					MCServerThreadManager.invoke(ins02, FXBAL_BatchLogManager.class);
				}
			}

			// スレッドの終了を待つ
			MCServerThreadManager.joinAll();

			if (arg.data_check_flg()) {
				String procId = "MGPA_ARG$P_CALC_FIN";
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, arg, null, ":calc_grp_cd, :calc_no, '0'");
				return;
			}

			MCList<MGT_BATCH_OUT_R> dbc = MCList.create(MGT_BATCH_OUT_R.class);
			MGT_BATCH_OUT_R dbc_t = MGT_BATCH_OUT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbc_bldr.setWhere(dbc_t.calc_grp_cd.eq(bind("1")), arg.calc_grp_cd());
			dbSelect("MGBDL5010_MGT_BATCH_OUT_S01", dbc, dbc_bldr, arg);
			boolean wipLocFlg = true ;
			boolean ioFlg = true ;
			for (MGT_BATCH_OUT_R row :dbc) {
				if (MGC_BATCH_TYP.isWIP_LOC(row.batch_typ())) {
					wipLocFlg = false ;
				}
				else if (MGC_BATCH_TYP.isIO(row.batch_typ())){
					ioFlg = false ;
				}
			}

			// 呼び出すオペレーションの作成。
			if (MAC_COST_CALC_TYP.isCALC_STK(arg.cost_calc_typ())) {
				// P_SET_OTHER_TRDの処理
				executeUpdate(MGBDL5010_MGT_ACC_TOP_U01(), dr);
				dbTran().commit();

				// 受払表作成
				if (ioFlg) {
					// ワーキンググループ単位で実行
					MCList<MGT_ACC_TOP_R> accTop = MCList.create(MGT_ACC_TOP_R.class);
					MGT_ACC_TOP_R accTop_t = MGT_ACC_TOP_R.create("T");
					MCQueryApiBuilder accTop_bldr = MCQueryApiBuilder.create(accTop_t);
					accTop_bldr.setDistinct();
					accTop_bldr.setSelect(accTop_t.wg_cd);
					accTop_bldr.setWhere(accTop_t.calc_no.eq(bind("calc_no"))
							.and(accTop_t.calc_grp_cd.eq(bind("calc_grp_cd"))), arg);
					accTop_bldr.addWhereWithAnd(
							accTop_t.asst_typ.in(value(MAC_ASST_TYP.CO_PROD.value()), value(MAC_ASST_TYP.CO_SLS.value())));
					accTop_bldr.addWhereWithAnd(
							accTop_t.calc_rec_typ.in(
									value(MGC_CALC_REC_TYP.ST_STK.value()),
									value(MGC_CALC_REC_TYP.PURC.value()),
									value(MGC_CALC_REC_TYP.COMP.value()),
									value(MGC_CALC_REC_TYP.IO.value()),
									value(MGC_CALC_REC_TYP.INPT.value()),
									value(MGC_CALC_REC_TYP.SLS.value()),
									value(MGC_CALC_REC_TYP.END_STK.value()),
									value(MGC_CALC_REC_TYP.GP_ALC.value())));
					dbSelect("MGBDL5010_MGT_ACC_TOP_S01", accTop, accTop_bldr, arg);

					for (MGT_ACC_TOP_R row :accTop) {
						CalcCost_Ins02 ins02 = crtCalcCost_Ins02();
						ins02.up0().calc_grp_cd(arg.calc_grp_cd());
						ins02.up0().calc_no(arg.calc_no());
						ins02.up0().wg_cd(row.wg_cd());
						ins02.up0().proc_typ(MGPA_IO);
						// オペレーションを作ったそばからマルチスレッドで実行
						MCServerThreadManager.invoke(ins02, FXBAL_BatchLogManager.class);
					}
				}
			}

			if (MAC_COST_CALC_TYP.isCALC_STK(arg.cost_calc_typ())
					|| MAC_COST_CALC_TYP.isNOT_STK(arg.cost_calc_typ())) {
				if (wipLocFlg) {
					// ワーキンググループ単位で実行
					MCList<MCRow> wgL = MCList.create(MCRow.class);
					executeQuery(wgL, MGBDL5010_MGT_ACC_TOP_S01(), arg);

					for (MCRow row :wgL) {
						CalcCost_Ins02 ins02 = crtCalcCost_Ins02();
						ins02.up0().calc_grp_cd(arg.calc_grp_cd());
						ins02.up0().calc_no(arg.calc_no());
						ins02.up0().wg_cd(row.getString("wg_cd"));
						ins02.up0().proc_typ(MGPA_WIP_LOC);
						// オペレーションを作ったそばからマルチスレッドで実行
						MCServerThreadManager.invoke(ins02, FXBAL_BatchLogManager.class);
					}
				}
				CalcCost_Ins02 ins02 = crtCalcCost_Ins02();
				ins02.up0().calc_grp_cd(arg.calc_grp_cd());
				ins02.up0().calc_no(arg.calc_no());
				ins02.up0().st_ym(arg.st_ym());
				ins02.up0().end_ym(arg.end_ym());
				ins02.up0().proc_typ(MGPA_SCA_POST);
				// オペレーションを作ったそばからマルチスレッドで実行
				MCServerThreadManager.invoke(ins02, FXBAL_BatchLogManager.class);
			}

			MCList<MAM_CALC_RPT_PTN_R> dbc2 = MCList.create(MAM_CALC_RPT_PTN_R.class);
			MAM_CALC_RPT_PTN_R dbc2_t = MAM_CALC_RPT_PTN_R.create("T");
			MCQueryApiBuilder dbc2_bldr = MCQueryApiBuilder.create(dbc2_t);
			dbc2_bldr.setWhere(dbc2_t.calc_grp_cd.eq(bind("1"))
					.and(dbc2_t.auto_flg.eq(value(true))), arg.calc_grp_cd());
			dbSelect("MGBDL5010_MAM_CALC_RPT_PTN_S01", dbc2, dbc2_bldr, arg);
			for (MAM_CALC_RPT_PTN_R row : dbc2) {
				// データ単位で実行
				MCList<MAM_RPT_KEY_CONF_R> cnfL = MCList.create(MAM_RPT_KEY_CONF_R.class);
				executeQuery(cnfL, MGBDL5010_MAM_RPT_KEY_S01(), row);

				for (MAM_RPT_KEY_CONF_R row2 :cnfL) {
					CalcCost_Ins02 ins02 = crtCalcCost_Ins02();
					ins02.up0().calc_grp_cd(arg.calc_grp_cd());
					ins02.up0().calc_no(arg.calc_no());
					ins02.up0().rpt_ptn_cd(row.rpt_ptn_cd());
					ins02.up0().rpt_key_cd(row.rpt_key_cd());
					ins02.up0().dpt_cd(row2.dpt_cd());
					ins02.up0().wg_cd(row2.wg_cd());
					ins02.up0().itm_cd(row2.itm_cd());
					ins02.up0().itm_sub1(row2.itm_sub1());
					ins02.up0().itm_sub2(row2.itm_sub2());
					ins02.up0().itm_sub3(row2.itm_sub3());
					ins02.up0().itm_jnl_cd(row2.itm_jnl_cd());
					ins02.up0().itm_grp_typ(row2.itm_grp_typ());
					ins02.up0().itm_grp_cd(row2.itm_grp_cd());
					ins02.up0().proc_typ(MGPA_RPT);
					// オペレーションを作ったそばからマルチスレッドで実行
					MCServerThreadManager.invoke(ins02, FXBAL_BatchLogManager.class);
				}
			}

			// 受払表ＩＤ単位で実行
			MCList<MAM_CALC_COST_IO_R> dbc3 = MCList.create(MAM_CALC_COST_IO_R.class);
			MAM_CALC_COST_IO_R t = MAM_CALC_COST_IO_R.create("T");
			MCQueryApiBuilder dbc3_bldr = MCQueryApiBuilder.create(t);
			dbc3_bldr.setWhere(t.calc_grp_cd.eq(bind("1"))
					.and(t.auto_flg.eq(value(true))), arg.calc_grp_cd());
			dbSelect("MGBDL5010_MAM_CALC_COST_IO_S01", dbc3, dbc3_bldr, arg);
			for (MAM_CALC_COST_IO_R row :dbc3) {
				CalcCost_Ins02 ins02 = crtCalcCost_Ins02();
				ins02.up0().calc_grp_cd(arg.calc_grp_cd());
				ins02.up0().calc_no(arg.calc_no());
				ins02.up0().cost_io_id(row.cost_io_id());
				ins02.up0().proc_typ(MGPA_COST_IO);
				// オペレーションを作ったそばからマルチスレッドで実行
				MCServerThreadManager.invoke(ins02, FXBAL_BatchLogManager.class);
			}

			if (arg.carry_flg() &&
					(MAC_COST_CALC_TYP.isCALC_STK(arg.cost_calc_typ())
							|| MAC_COST_CALC_TYP.isNOT_STK(arg.cost_calc_typ()))) {
				for (int i=1; i <= 2; i++) {
					CalcCost_Ins02 ins02 = crtCalcCost_Ins02();
					ins02.up0().calc_grp_cd(arg.calc_grp_cd());
					ins02.up0().calc_no(arg.calc_no());
					ins02.up0().proc_typ(MGPA_CARRY_OVER);
					ins02.up0().sql_no(i);
					// オペレーションを作ったそばからマルチスレッドで実行
					MCServerThreadManager.invoke(ins02, FXBAL_BatchLogManager.class);
				}
			}

			// スレッドの終了を待つ
			MCServerThreadManager.joinAll();

			String procId = "MGPA_ARG$P_CALC_FIN";
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "02"), procId, arg, null, ":calc_grp_cd, :calc_no, '0'");
		}

		protected MGT_ARG_R f_get_arg_usr(MGT_ARG_R arg) {
			MGT_ARG_R retArg = MGT_ARG_R.create();
			int i = executeQuery(retArg, MGBDL5010_MGVT_ARG_USR_S01(), arg);
			if (i > 0) {
				return retArg;
			}
			throw new MCAppException(MGUCL0003, arg.calc_grp_cd(), arg.calc_no());
		}

		protected MGT_ARG_R f_get_arg(String calcGrpCd, String calcNo) {
			MGT_ARG_R arg = MGT_ARG_R.create();
			MGT_ARG_R retArg = MGT_ARG_R.create();
			arg.calc_grp_cd(calcGrpCd);
			arg.calc_no(calcNo);
			int i = dbSelectKey("MGBDL5010_MGT_ARG_S01", retArg, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), arg);
			if(i > 0) {
				return retArg;
			}
			else {
				return f_get_arg_usr(arg);
			}
		}

	}

	/**
	 * CalcRsltDel_Chk01オペレーション.<p>
	 *
	 * 原価計算結果削除前のチェックをする。<br>
	 */
	public class CalcRsltDel_Chk01 extends MGBDL_CalcCostService_MC_A.CalcRsltDel_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<MGT_ARG_R> locked = lock(up0());
			MCJoinKey<MCList<MGT_ARG_R>> a2b = up0().join(
					up0().createRow().getKeyColumn(), locked, locked.createRow().getKeyColumn());

			msgL.addAll(chkBase(up0(), a2b));

			if (!msgL.isEmpty()) {
				return msgL;
			}

			compBase(up0(), a2b);

			return msgL;
		}

		/**
		 * チェック処理
		 * @param up0 上り電文
		 * @param a2bLocked 上り電文からロックした行を取得するためのキー
		 * @return メッセージ
		 */
		protected MCMessageList chkBase(CalcRsltDel_DtlL<CalcRsltDel_DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {
			MCMessageList ml = new MCMessageList();
			ml.addAll(chkUpdCntrArg(up0, a2bLocked));
			if (!up1().del_admin_flg()) {
				ml.addAll(chkDel(up0, a2bLocked));
			}

			return ml;
		}

		/**
		 * 原価計算設定情報の排他制御
		 * @param list 上り電文
		 * @param a2bLocked 上り電文からロックした行を取得するためのキー
		 * @return メッセージ
		 */
		protected MCMessageList chkUpdCntrArg(CalcRsltDel_DtlL<CalcRsltDel_DtlR> list, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {
			MCMessageList ml = new MCMessageList();
			if (list.isEmpty()) {
				return ml;
			}

			list.forEach(ar -> {
				//ロックした変更前データ
				MGT_ARG_R lockedRow = ar.getJoinedRow(a2bLocked);
				ml.addAll(checkUpdCntrNE(ar, CalcRsltDel_DtlR.$upd_cntr, lockedRow));
			});
			return ml;
		}

		protected MCMessageList chkDel(CalcRsltDel_DtlL<CalcRsltDel_DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {
			MCMessageList ml = new MCMessageList();
			up0.forEach(ar -> {
				MGT_ARG_R br = ar.getJoinedRow(a2bLocked);
				if (br != null) {
					if (br.fix_flg() || br.non_del_flg()) {
						ml.add(new MCMessage(ar, null, MGBDL0019, toDispGUIIndex(ar)));
					}
				}
			});

			return ml;
		}

		/**
		 * 上り電文を修正する
		 * @param up0 上り電文
		 * @param a2b 上り電文からロックした行（変更前のデータ）を取得するためのキー
		 */
		protected void compBase(CalcRsltDel_DtlL<CalcRsltDel_DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {

		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * CalcRsltDel_Del01オペレーション.<p>
	 *
	 * 原価計算情報を削除する。<br>
	 */
	public class CalcRsltDel_Del01 extends MGBDL_CalcCostService_MC_A.CalcRsltDel_Del01 {

		@Override
		protected void call() {
			super.call();
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
			CalcRsltDel_DtlL<CalcRsltDel_DtlR> up = up0();
			editUp(up);
			callThisChk(up);
			@SuppressWarnings({"unchecked", "rawtypes"})
			CalcRsltDel_DtlL<CalcRsltDel_DtlR> list =(CalcRsltDel_DtlL)getChkList(up);
			del(list);
		}

		protected void editUp(MCList<CalcRsltDel_DtlR> up) {

		}

		protected void callThisChk(CalcRsltDel_DtlL<CalcRsltDel_DtlR> up) {
			MGBDL_CalcCostService.CalcRsltDel_Chk01 o = MGBDL_CalcCostService.crtCalcRsltDel_Chk01();
			o.up0().setAll(up);
			o.up1().del_admin_flg(up1().del_admin_flg());
			o.exec();
			up.setAll(o.down0());
		}

		protected void del(CalcRsltDel_DtlL<CalcRsltDel_DtlR> up) {
			if (up.isEmpty()) {
				return;
			}
			insWk(up);
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_DEL_CALC$P_MAIN", "01"), "MGPA_DEL_CALC$P_MAIN");
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * 削除用のＤＢＣを作成する。
	 * @param delList 削除対象のリスト
	 */
	protected MCList<MGW_DEL_CALC_R> createDbcDel(CalcRsltDel_DtlL<CalcRsltDel_DtlR> delList) {
		MCList<MGW_DEL_CALC_R> workL = MCList.create(MGW_DEL_CALC_R.class);
		for (MGT_ARG_R r : delList){
			MGW_DEL_CALC_R ins = MGW_DEL_CALC_R.create();
			ins.calc_grp_cd(r.calc_grp_cd());
			ins.calc_no(r.calc_no());
			workL.add(ins);
		}
		return workL;
	}

	protected void insWk(CalcRsltDel_DtlL<CalcRsltDel_DtlR> up) {
		MCList<MGW_DEL_CALC_R> workL = createDbcDel(up);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MGW_DEL_CALC_R.create("T"));
		dbc_bldr.buildDelete("MGBDL5010_MGW_DEL_CALC_D01").executeUpdate(autoCommitDBTran(), null, null, null);
		dbc_bldr.buildInsert("MGBDL5010_MGW_DEL_CALC_I01").executeBatchUpdate(autoCommitDBTran(), workL, null, null);
	}

	/**
	 * 更新対象をロックし、ロックした行を返す。
	 * @param list 更新対象
	 * @return ロックした行
	 */
	protected MCList<MGT_ARG_R> lock(CalcRsltDel_DtlL<CalcRsltDel_DtlR> list) {
		if (list.isEmpty()) {
			return null;
		}

		insWk(list);

		MGT_ARG_R t = MGT_ARG_R.create("T");
		MGW_DEL_CALC_R w = MGW_DEL_CALC_R.create("W");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addInnerJoin(w, t.calc_grp_cd.eq(w.calc_grp_cd).and(t.calc_no.eq(w.calc_no)));
		dbc_bldr.setOrderByAsc(t.getKeyColumn$());
		dbc_bldr.setSelectForUpdateNoWait();

		MCList<MGT_ARG_R> locked = MCList.create(MGT_ARG_R.class);
		dbc_bldr.buildSelect("MGBDL5010_MGT_ARG_S02").executeQuery(autoCommitDBTran(), null, null, locked);

		return locked;
	}

	/**
	 * CalcCost_Ins02オペレーション.<p>
	 *
	 * マルチスレッド実行の対象となるオペレーションを実行する。<br>
	 */
	public class CalcCost_Ins02 extends MGBDL_CalcCostService_MC_A.CalcCost_Ins02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			// バッチログ情報引継ぎ
			logger().inheritToPlsql(autoCommitDBTran());

			switch (up0().proc_typ()) {
			case MGPA_SET_ITM_EXT:
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_SET_ITM_EXT$P_ITM_EXT_NULL", "01"), "MGPA_SET_ITM_EXT$P_ITM_EXT_NULL", up0(), null, ":calc_grp_cd, :calc_no, :st_ym, :sql_no");
				break;
			case MGPA_IO:
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_IO$P_MAIN", "01"), "MGPA_IO$P_MAIN", up0(), null, ":calc_grp_cd, :calc_no, :wg_cd");
				break;
			case MGPA_WIP_LOC:
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_WIP_LOC$P_MAIN", "01"), "MGPA_WIP_LOC$P_MAIN", up0(), null, ":calc_grp_cd, :calc_no, :wg_cd");
				break;
			case MGPA_SCA_POST:
				Comparable<?> ret = execFunc(createSqlId(LOGIC_ID, "MGPA_CALC_FIX$F_CHK_FIX", "01"), MGPA_CALC_FIX$F_CHK_FIX( bind("calc_grp_cd"), bind("end_ym")), up0());
				if (isSame(ret, "0")) { 
					// 最終年月が未確定のときのみ参照用のレコード及び前月データを作成する
					execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_SCA_POST$P_SET_ST_DATA", "01"), "MGPA_SCA_POST$P_SET_ST_DATA", up0(), null, ":calc_grp_cd, :calc_no, :st_ym");
					execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_CALC_FIX$P_INS_YM_NO", "01"), "MGPA_CALC_FIX$P_INS_YM_NO", up0(), null, ":calc_grp_cd, :calc_no");
				}
				break;
			case MGPA_RPT:
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_RPT$P_MAIN", "01"), "MGPA_RPT$P_MAIN", up0(), null, ":calc_grp_cd, :calc_no, :rpt_ptn_cd, :rpt_key_cd, '0', "
						+ ":dpt_cd, :wg_cd, :itm_cd, :itm_sub1, :itm_sub2, :itm_sub3, :itm_jnl_cd, :itm_grp_typ, :itm_grp_cd");
				break;
			case MGPA_COST_IO:
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_COST_IO$P_MAIN", "01"), "MGPA_COST_IO$P_MAIN", up0(), null, ":calc_grp_cd, :calc_no, :cost_io_id, '0'");
				break;
			case MGPA_CARRY_OVER:
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_CARRY_OVER$P_MAIN", "01"), "MGPA_CARRY_OVER$P_MAIN", up0(), null, ":calc_grp_cd, :calc_no, :sql_no");
				break;
			default:
				CalcCost_CndR dr = CalcCost_CndR.create();
				dr.calc_grp_cd(up0().calc_grp_cd());
				dr.calc_no(up0().calc_no());
				crtCalcCost_Ins01().callCalcErr(dr);
				throw new MCAppException("", MGBDL0002, up0().calc_grp_cd(), up0().calc_no());
			}
		}
	}

	//FMCB CUSTOM END
}