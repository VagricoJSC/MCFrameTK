package mcframe.serverMGLA.MGLAL5030;

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
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGPermColumn;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MGLAL_IoSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGLAL_IoSendIfService_MC extends MGLAL_IoSendIfService_MC_A{
	//FMCB CUSTOM START

	protected static final String ERR_STS = "err_sts";
	protected static final String NOT_EXE_STS = "not_exe_sts";
	protected static final String BI_NOT_SEND_FLG = "bi_not_send_flg";

	/** フェッチサイズを取得するリソースキー */
	protected static final String FETCH_SIZE_RKEY = "MG.MGLAL5030.fetch_size";

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルの登録処理を実行するオペレーションの基底クラスの実装<br>
	 */
	public class Upd01 extends MGLAL_IoSendIfService_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initProc() {
			// Upd01のloggerは不要
		}

		@Override
		protected void setUpd02Operation() {
			super._upd02ModuleId = "MG";
			super._upd02LogicId = "MGLAL5030";
			super._upd02OperationId = "Upd02";
		}

		@Override
		protected void chkUpItemsIndividual() {
			MCMessageList msgL = new MCMessageList();

			String[] cols = new String[] {
					Upd01_DtlR.$if_proc_typ,
					Upd01_DtlR.$ext_sys_cd,
					Upd01_DtlR.$calc_grp_cd
			};
			// 必須チェック
			for (String col : cols) {
				msgL.addAll(check(up0(), col, new FXUCL_RequiredValidater()));
			}
			if (isNull(up0().calc_no())) {
				msgL.addAll(check(up0(), Upd01_DtlR.$ym, new FXUCL_RequiredValidater()));
			}
			// IF処理区分チェック
			if (!(MAC_IF_PROC_TYP.isIO_SEND(up0().if_proc_typ())
					|| MAC_IF_PROC_TYP.isCFP_IO_SEND(up0().if_proc_typ()))) {
				msgL.add(new MCMessage(MGLAL0001, up0().if_proc_typ()));
			}
			// 確定フラグがtrueの場合、原価計算ＮＯを指定不可チェック
			if (up0().fix_flg() && !isNull(up0().calc_no())) {
				msgL.add(new MCMessage(MGLAL0002, up0().if_proc_typ()));
			}

			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}

		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MGLAL0012);
		}

		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MGLAL0013);
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * ＩＦテーブルにレコードを登録する処理の流れを定義したオペレーションの基底クラスの実装<br>
	 */
	public class Upd02 extends MGLAL_IoSendIfService_MC_A.Upd02 {

		/** 処理対象の原価計算ＮＯ */
		protected String _calcNo;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void setup() {
			MCRow bind = up0().clone();
			if (!isNull(up0().ym())) {
				bind.setDateNE(Upd02_DtlR.$ym, up0().ym().startOfMonth());
			}

			// 計算ＮＯの取得
			_calcNo  = up0().calc_no();
			if (up0().fix_flg()) {
				MGT_CALC_FIX_R calcFixR = MGT_CALC_FIX_R.create("T1");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(calcFixR);
				builder.setSelect(calcFixR.calc_no);
				MCRow result = MCRow.create();
				dbSelectKeyEx("MGLAL5030_MGT_CALC_FIX_S01", result, builder, bind);
				_calcNo = result.getStringNE(MGT_CALC_FIX_R.$calc_no);
			}
			else if (isNull(up0().calc_no())) {
				MGT_YM_NO_R ymNoR = MGT_YM_NO_R.create("T1");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(ymNoR);
				builder.setSelect(ymNoR.calc_no);
				MCRow result = MCRow.create();
				dbSelectKeyEx("MGLAL5030_MGT_YM_NO_S01", result, builder, bind);
				_calcNo = result.getStringNE(MGT_YM_NO_R.$calc_no);
			}

			// ＩＦテーブルのＢＩ送信対象外ＦＬＧを更新するのに必要な条件を追加
			bind.setStringNE(Upd02_DtlR.$ext_sys_cd, up0().ext_sys_cd());
			bind.setStringNE(Upd02_DtlR.$calc_no, _calcNo);
			bind.setBooleanNE(BI_NOT_SEND_FLG, false);
			bind.setStringNE(ERR_STS, MAC_EXE_STS_TYP.ERR.value());
			bind.setStringNE(NOT_EXE_STS, MAC_EXE_STS_TYP.NOT_EXE.value());
			super._updBiNotSendFlgBind = bind;

			MAM_CALC_GRP_R calcGrpR = MAM_CALC_GRP_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(calcGrpR);
			builder.setSelect(calcGrpR.sa_typ);
			MCRow result = MCRow.create();
			dbSelectKeyEx("MGLAL5030_MAM_CALC_GRP_S01", result, builder, bind);
			String saTyp = result.getStringNE(MAM_CALC_GRP_R.$sa_typ);

			super._ifTblUpdBiNotSendFlgBuilder = buildQueryIfTblUpdBiNotSendFlg(saTyp);
			super._sqlIdSelectBiNotSendFlg = getIdS01();
			super._sqlIdUpdBiNotSendFlg = getIdU01();
			super._ifTblContainerClassPath = getClassPath();
			super._fetchSize = MCConst.app.getInteger(FETCH_SIZE_RKEY, 1000);
			super._threadRecordCnt = 0;
		}

		@Override
		protected boolean insRecordToIFTable() {
			MCRow bind = up0().clone();
			if (!isNull(up0().ym())) {
				bind.setDateNE(Upd02_DtlR.$ym, up0().ym().startOfMonth());
			}
			bind.setStringNE(Upd02_DtlR.$calc_no, _calcNo);

			MGT_ARG_R r = MGT_ARG_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			dbSelectKeyForUpdateNoWaitNoFetch("MGLAL5030_MGT_ARG_S01", builder, bind);

			insert(bind);
			int insCnt = selectCount(bind);
			int updCnt = updateLogKey(bind);

			super._rsltTotalNum += insCnt;
			super._rsltOkNum += updCnt;
			super._rsltErrNum += insCnt - updCnt;
			if (insCnt != updCnt) {
				writeLogForProcessLog(MGLAL0005);
			}

			return false;
		}

		@Override
		protected void writeStartLog() {
			writeLogForStartLog(MGLAL0006, getCo().co_cd(), up0().if_proc_typ());
		}

		@Override
		protected void writeEndLog() {
			if (!super._exceptionFlg && super._rsltTotalNum == 0) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}
			writeLogForEndLog(MGLAL0007, getCo().co_cd(), super._rsltTotalNum,
					super._rsltOkNum, super._rsltErrNum, super._rsltSkipNum);
		}

		protected String getIdS01() {
			return "MGLAL5030_MGT_IO_IF_S01";
		}
		protected String getIdS02() {
			return "MGLAL5030_MTG_IO_IF_S02";
		}
		protected String getIdS03() {
			return "MGLAL5030_MGT_IO_IF_S03";
		}
		protected String getIdI01() {
			return "MGLAL5030_MGT_IO_IF_I01";
		}
		protected String getIdU01() {
			return "MGLAL5030_MGT_IO_IF_U01";
		}
		protected String getIdU02() {
			return "MGLAL5030_MGT_IO_IF_U02";
		}
		protected String getClassPath() {
			return "mcframe.serverMG.dbc.MGT_IO_IF_R";
		}
		protected String getSequenceName() {
			return "MGS_IO_IF_DATA_LNO";
		}
		/** ＩＦテーブルのＢＩ送信対象外ＦＬＧを更新するためのQueryを構築します。 */
		protected MCQueryApiBuilder buildQueryIfTblUpdBiNotSendFlg(String saTyp) {
			MGT_IO_IF_R r = MGT_IO_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addWhereWithAnd(r.ext_sys_cd.eq(bind(Upd02_DtlR.$ext_sys_cd)));
			builder.addWhereWithCutOffAnd(r.ym.eq(bind(Upd02_DtlR.$ym)));
			builder.addWhereWithAnd(r.calc_grp_cd.eq(bind(Upd02_DtlR.$calc_grp_cd)));
			if (isSame(saTyp, MAC_SA_TYP.PLN.value())) {
				builder.addWhereWithAnd(r.calc_no.eq(bind(Upd02_DtlR.$calc_no)));
			}
			builder.addWhereWithAnd(r.bi_not_send_flg.eq(bind(BI_NOT_SEND_FLG)));
			builder.addWhereWithAnd(r.exe_sts_typ.eq(bind(ERR_STS)).or(r.exe_sts_typ.eq(bind(NOT_EXE_STS))));
			return builder;
		}
		/** buildInsertSubQueryで抽出されるレコードをＩＦテーブルに登録します。 */
		protected void insert(MCRow bind) {
			MGT_IO_IF_R r = MGT_IO_IF_R.create("T1");
			MCFMAGPermColumn[] cols = {
					r.data_lno,
					r.data_no,
					r.exe_sts_typ,
					r.data_crud_typ,
					r.ext_sys_cd,
					r.bi_not_send_flg,
					r.calc_no,
					r.calc_grp_cd,
					r.fix_flg,
					r.wg_cd,
					r.term,
					r.ym,
					r.mng_dpt_cd,
					r.itm_cd,
					r.itm_sub1,
					r.itm_sub2,
					r.itm_sub3,
					r.lot_no,
					r.sublot_no,
					r.sno1,
					r.sno2,
					r.sno3,
					r.sno4,
					r.asst_typ,
					r.std_qty,
					r.base_cur_cd,
					r.ave_upri,
					r.std_upri,
					r.st_stk_qty,
					r.st_stk_amt,
					r.mfg_qty,
					r.mfg_amt,
					r.purc_qty,
					r.purc_amt,
					r.mfg_gr_qty,
					r.mfg_gr_amt,
					r.othr_gr_qty,
					r.othr_gr_amt,
					r.alc_amt,
					r.inpt_qty,
					r.inpt_amt,
					r.plnt_gi_qty,
					r.plnt_gi_amt,
					r.othr_gi_qty,
					r.othr_gi_amt,
					r.prov_qty,
					r.prov_amt,
					r.sls_qty,
					r.sls_amt,
					r.end_stk_qty,
					r.end_stk_amt,
					r.diff_qty,
					r.diff_amt,
					r.xpns_inpt_qty,
					r.xpns_inpt_amt
			};
			sql(getIdI01()).insert(r).columns(cols)
					.query(buildInsertSubQuery(bind.getBooleanNE(Upd02_DtlR.$fix_flg)))
					.executeUpdate(bind);
		}
		/** ＩＦテーブルに登録されたレコード件数を取得します。 */
		protected int selectCount(MCRow bind) {
			MGT_IO_IF_R r = MGT_IO_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addCount(value("X"), "cnt");
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));

			MCRow result = MCRow.create();
			dbSelect(getIdS02(), result, builder, bind);
			return result.getNumber("cnt").intValue();
		}
		/** ＩＦテーブルに登録されたレコードのバッチログＮＯ、ログサブキー１、ログサブキー２を更新します。 */
		protected int updateLogKey(MCRow bind) {
			MGT_IO_IF_R r = MGT_IO_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));
			// select用
			builder.setSelect(r.data_lno);
			// update用
			builder.setSet(r.batch_log_no);
			builder.addSet(r.log_sub_key1);
			builder.addSet(r.log_sub_key2);

			return executeUpdateLogKey(builder, bind);
		}
		/** ＩＦテーブルに登録されたレコードのバッチログＮＯ、ログサブキー１、ログサブキー２を更新します。 */
		protected int executeUpdateLogKey(MCQueryApiBuilder builder, MCRow bind) {
			MCCursor<MCRow> cursor = MCTransactionManager.dbTran().statement().openCursor(
					getIdS03(), builder.buildSelect(getIdS03()).toString(), bind, null, MCList.create(MCRow.class), MCRow.class);

			int fetchSize = MCConst.app.getInteger(FETCH_SIZE_RKEY, 1000);
			int updatedRecCnt = 0;
			try {
				while (cursor.dbFetch(fetchSize) > 0) {
					MCList<MCRow> rsltL = cursor.getList();
					logger().setLogKey(rsltL, "batch_log_no", "log_sub_key1", "log_sub_key2");
					dbUpdateKey(getIdU02(), rsltL, builder);
					updatedRecCnt += rsltL.size();
				}
			}
			catch (MCException ex) {
				writeLogForProcessLog(ex);
				return updatedRecCnt;
			}
			finally {
				cursor.close();
			}

			return updatedRecCnt;
		}
		/** ＩＦテーブルにレコードを登録するのに必要なデータを設定します。  */
		protected MCColumnSubQuery buildInsertSubQuery(boolean fix_flg) {

			MGT_IO_R S0T1 = MGT_IO_R.create("T1");
			MGT_ARG_R S0T2 = MGT_ARG_R.create("T2");
			MCColumnSubQuery subQuery = subQuery().select(
					MAPA_NUM$F_GET_SEQ(value(getSequenceName())).as("data_lno"),
					bind("data_no").as("data_no"),
					value(MAC_EXE_STS_TYP.NOT_EXE.value()).as("exe_sts_typ"),
					value(MAC_DATA_CRUD_TYP.CRT.value()).as("data_crud_typ"),
					bind("ext_sys_cd").as("ext_sys_cd"),
					value(false).as("bi_not_send_flg"),
					S0T1.calc_no,
					S0T1.calc_grp_cd,
					S0T2.fix_flg,
					S0T1.wg_cd,
					S0T2.term,
					S0T1.ym,
					S0T1.mng_dpt_cd,
					S0T1.itm_cd,
					S0T1.itm_sub1,
					S0T1.itm_sub2,
					S0T1.itm_sub3,
					S0T1.lot_no,
					S0T1.sublot_no,
					S0T1.sno1,
					S0T1.sno2,
					S0T1.sno3,
					S0T1.sno4,
					S0T1.asst_typ,
					S0T1.std_qty,
					MAPA_XCHNG$F_GET_BASE_CUR_CD().as("base_cur_cd"),
					S0T1.ave_upri,
					S0T1.std_upri,
					S0T1.st_stk_qty,
					S0T1.st_stk_amt,
					S0T1.mfg_qty,
					S0T1.mfg_amt,
					S0T1.purc_qty,
					S0T1.purc_amt,
					S0T1.mfg_gr_qty,
					S0T1.mfg_gr_amt,
					S0T1.othr_gr_qty,
					S0T1.othr_gr_amt,
					S0T1.alc_amt,
					S0T1.inpt_qty,
					S0T1.inpt_amt,
					S0T1.plnt_gi_qty,
					S0T1.plnt_gi_amt,
					S0T1.othr_gi_qty,
					S0T1.othr_gi_amt,
					S0T1.prov_qty,
					S0T1.prov_amt,
					S0T1.sls_qty,
					S0T1.sls_amt,
					S0T1.end_stk_qty,
					S0T1.end_stk_amt,
					S0T1.diff_qty,
					S0T1.diff_amt,
					S0T1.xpns_inpt_qty,
					S0T1.xpns_inpt_amt
				)
				.from(
						S0T1
						.innerJoin(S0T2).on(
							S0T1.calc_no.eq(S0T2.calc_no)
							.and(S0T1.calc_grp_cd.eq(S0T2.calc_grp_cd))
						)
					)
					.where(
						S0T1.calc_no.eq(bind("calc_no"))
						.and(S0T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.cutoff$and(S0T1.ym.eq(bind("ym")))
					);
			return subQuery;
		}
	}

	//FMCB CUSTOM END
}