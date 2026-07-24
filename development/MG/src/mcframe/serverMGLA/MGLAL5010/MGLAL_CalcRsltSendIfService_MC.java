package mcframe.serverMGLA.MGLAL5010;

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
 * "MGLAL_CalcRsltSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGLAL_CalcRsltSendIfService_MC extends MGLAL_CalcRsltSendIfService_MC_A{
	//FMCB CUSTOM START

	protected static final String ERR_STS = "err_sts";
	protected static final String NOT_EXE_STS = "not_exe_sts";
	protected static final String BI_NOT_SEND_FLG = "bi_not_send_flg";

	/** フェッチサイズを取得するリソースキー */
	protected static final String FETCH_SIZE_RKEY = "MG.MGLAL5010.fetch_size";

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルの登録処理を実行するオペレーションの基底クラスの実装<br>
	 */
	public class Upd01 extends MGLAL_CalcRsltSendIfService_MC_A.Upd01 {
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
			super._upd02LogicId = "MGLAL5010";
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
			if (!isAccCostSend(up0().if_proc_typ())) {
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

		protected boolean isAccCostSend(String if_proc_typ) {
			return MAC_IF_PROC_TYP.isACC_COST1_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_COST2_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_COST3_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_COST4_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_COST5_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_CFP1_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_CFP2_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_CFP3_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_CFP4_SEND(if_proc_typ)
					|| MAC_IF_PROC_TYP.isACC_CFP5_SEND(if_proc_typ);
		}

		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MGLAL0010);
		}

		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MGLAL0011);
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * ＩＦテーブルにレコードを登録する処理の流れを定義したオペレーションの基底クラスの実装<br>
	 */
	public class Upd02 extends MGLAL_CalcRsltSendIfService_MC_A.Upd02 {

		/** 更新対象のＩＦテーブル */
		protected MGT_ACC_SML_COST_IF _table;

		/** 処理対象の原価計算ＮＯ */
		protected String _calcNo;

		@Override
		protected void call() {
			String val = up0().if_proc_typ();
			if (MAC_IF_PROC_TYP.isACC_COST1_SEND(val) || MAC_IF_PROC_TYP.isACC_CFP1_SEND(val)) {
				_table = new MGT_ACC_SML_COST1_IF();
			}
			else if (MAC_IF_PROC_TYP.isACC_COST2_SEND(val) || MAC_IF_PROC_TYP.isACC_CFP2_SEND(val)) {
				_table = new MGT_ACC_SML_COST2_IF();
			}
			else if (MAC_IF_PROC_TYP.isACC_COST3_SEND(val) || MAC_IF_PROC_TYP.isACC_CFP3_SEND(val)) {
				_table = new MGT_ACC_SML_COST3_IF();
			}
			else if (MAC_IF_PROC_TYP.isACC_COST4_SEND(val) || MAC_IF_PROC_TYP.isACC_CFP4_SEND(val)) {
				_table = new MGT_ACC_SML_COST4_IF();
			}
			else if (MAC_IF_PROC_TYP.isACC_COST5_SEND(val) || MAC_IF_PROC_TYP.isACC_CFP5_SEND(val)) {
				_table = new MGT_ACC_SML_COST5_IF();
			}

			super.call();
		}

		@Override
		protected String getDataRefCtl() {
			return _table.getDataRefCtl();
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
				dbSelectKeyEx("MGLAL5010_MGT_CALC_FIX_S01", result, builder, bind);
				_calcNo = result.getStringNE(MGT_CALC_FIX_R.$calc_no);
			}
			else if (isNull(up0().calc_no())) {
				MGT_YM_NO_R ymNoR = MGT_YM_NO_R.create("T1");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(ymNoR);
				builder.setSelect(ymNoR.calc_no);
				MCRow result = MCRow.create();
				dbSelectKeyEx("MGLAL5010_MGT_YM_NO_S01", result, builder, bind);
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
			dbSelectKeyEx("MGLAL5010_MAM_CALC_GRP_S01", result, builder, bind);
			String saTyp = result.getStringNE(MAM_CALC_GRP_R.$sa_typ);

			super._ifTblUpdBiNotSendFlgBuilder = _table.buildQueryIfTblUpdBiNotSendFlg(saTyp);
			super._sqlIdSelectBiNotSendFlg = _table.getIdS01();
			super._sqlIdUpdBiNotSendFlg = _table.getIdU01();
			super._ifTblContainerClassPath = _table.getClassPath();
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
			dbSelectKeyForUpdateNoWaitNoFetch("MGLAL5010_MGT_ARG_S01", builder, bind);

			_table.insert(bind);
			int insCnt = _table.selectCount(bind);
			int updCnt = _table.updateLogKey(bind);
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
			writeLogForStartLog(MGLAL0003, getCo().co_cd(), up0().if_proc_typ());
		}

		@Override
		protected void writeEndLog() {
			if (!super._exceptionFlg && super._rsltTotalNum == 0) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}
			writeLogForEndLog(MGLAL0004, getCo().co_cd(), super._rsltTotalNum,
					super._rsltOkNum, super._rsltErrNum, super._rsltSkipNum);
		}
	}

	protected interface MGT_ACC_SML_COST_IF {
		String getDataRefCtl();
		String getIdS01();
		String getIdS02();
		String getIdS03();
		String getIdI01();
		String getIdU01();
		String getIdU02();
		String getClassPath();
		String getSequenceName();
		/** ＩＦテーブルのＢＩ送信対象外ＦＬＧを更新するためのQueryを構築します。 */
		MCQueryApiBuilder buildQueryIfTblUpdBiNotSendFlg(String saTyp);
		/** buildInsertSubQueryで抽出されるレコードをＩＦテーブルに登録します。 */
		void insert(MCRow bind);
		/** ＩＦテーブルに登録されたレコード件数を取得します。 */
		int selectCount(MCRow bind);
		/** ＩＦテーブルに登録されたレコードのバッチログＮＯ、ログサブキー１、ログサブキー２を更新します。 */
		int updateLogKey(MCRow bind);
		/** ＩＦテーブルに登録されたレコードのバッチログＮＯ、ログサブキー１、ログサブキー２を更新します。 */
		default int executeUpdateLogKey(MCQueryApiBuilder builder, MCRow bind) {
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
				logger().writeProcessLog(ex);
				MCMessagePool.add(ex.getMCMessage());
				return updatedRecCnt;
			}
			finally {
				cursor.close();
			}

			return updatedRecCnt;
		}
		/** ＩＦテーブルにレコードを登録するのに必要なデータを設定します。  */
		default MCColumnSubQuery buildInsertSubQuery(boolean fix_flg) {
			MCTempView S0T1 = createTempView("T1");
			MGT_CALC_SLS_R S0T2 = MGT_CALC_SLS_R.create("T2");
			MGT_CALC_ITM_MFG_INST_R S0T3 = MGT_CALC_ITM_MFG_INST_R.create("T3");
			MCTempView S1L1 = createTempView("L1");
			MGT_ARG_R S2W1 = MGT_ARG_R.create("W1");
			MGT_ACC_TOP_R S2W2 = MGT_ACC_TOP_R.create("W2");
			MGT_ACC_SML_COST_R S2W3 = MGT_ACC_SML_COST_R.create("W3");
			MCTempView S2M1 = createTempView("M1");
			MAM_EXPNS_R S3MW1 = MAM_EXPNS_R.create("MW1");
			MAM_EXPNS_GRP_R S3MW2 = MAM_EXPNS_GRP_R.create("MW2");

			MCColumnSubQuery subQuery = subQuery()
					.select(
							MAPA_NUM$F_GET_SEQ(value(getSequenceName())).as("data_lno"),
							bind("data_no").as("data_no"),
							value(MAC_EXE_STS_TYP.NOT_EXE.value()).as("exe_sts_typ"),
							value(MAC_DATA_CRUD_TYP.CRT.value()).as("data_crud_typ"),
							bind("ext_sys_cd").as("ext_sys_cd"),
							value(false).as("bi_not_send_flg"),
							S0T1.pr(S2W2.calc_no),
							S0T1.pr(S2W2.calc_grp_cd),
							S0T1.pr(S2W1.fix_flg),
							S0T1.pr(S2W2.calc_rec_typ),
							S0T1.pr(S2W2.wg_cd),
							S0T1.pr(S2W1.term),
							S0T1.pr(S2W2.ym),
							S0T1.pr(S2W2.ac_dt),
							S0T1.pr(S2W2.mng_dpt_cd),
							S0T1.pr(S2W2.itm_cd),
							S0T1.pr(S2W2.itm_sub1),
							S0T1.pr(S2W2.itm_sub2),
							S0T1.pr(S2W2.itm_sub3),
							S0T1.pr(S2W2.mfg_purc_typ),
							S0T1.pr(S2W2.lot_no),
							S0T1.pr(S2W2.sublot_no),
							S0T1.pr(S2W2.sno1),
							S0T1.pr(S2W2.sno2),
							S0T1.pr(S2W2.sno3),
							S0T1.pr(S2W2.sno4),
							S0T1.pr(S2W2.cost_io_typ),
							S0T1.pr(S2W2.ac_slip_typ),
							S0T1.pr(S2W2.ac_rsn_cd),
							S0T1.pr(S2W2.itm_mfg_inst_no),
							S0T1.pr(S2W2.mfg_act_no),
							S0T1.pr(S2W2.loc_cd),
							S0T1.pr(S2W2.str_ln_cd),
							S0T1.pr(S2W2.oper_act_no),
							S0T1.pr(S2W2.oper_cd),
							S0T1.pr(S2W2.oper_seq),
							S0T1.pr(S2W2.bp_cd),
							S0T2.cst_cd,
							S0T2.dlv_cd,
							S0T2.dest_cd1,
							S0T2.dest_cd2,
							S0T2.dest_cd3,
							S0T1.pr(S2W2.stk_bp_cd),
							S0T1.pr(S2W2.po_no),
							S0T1.pr(S2W2.slo_no),
							S0T1.pr(S2W2.iv_no),
							S0T1.pr(S2W2.act_id),
							S0T1.pr(S2W2.act_id_sub),
							S0T2.sls_dpt_cd,
							S0T1.pr(S2W2.alc_dpt_cd),
							S0T1.pr(S2W2.other_dpt_cd),
							S0T2.sls_usr_cd,
							S0T2.cost_sls_cd1,
							S0T2.cost_sls_cd2,
							S0T2.cost_sls_cd3,
							S0T2.cost_sls_cd4,
							S0T2.cost_sls_cd5,
							S0T1.pr(S2W2.asst_typ),
							S0T1.pr("qty"),
							nvl(S0T3.qty, value(0)).as("inst_qty"),
							MAPA_XCHNG$F_GET_BASE_CUR_CD().as("base_cur_cd"),
							S0T1.pr("amt"),
							S0T1.pr("std_qty"),
							S0T1.pr("std_amt"),
							S0T1.pr(S2W2.cur_cd),
							S0T1.pr("cur_amt"),
							S0T1.pr("cur_std_amt"),
							S0T1.pr(S2W2.xrate),
							S0T1.pr(S2W2.std_xrate),
							S0T1.pr("upri_diff"),
							S0T1.pr("rate_diff"),
							S0T1.pr(S2W2.trd_grp),
							decode(S0T1.pr("qty"), value(0), value(0), S0T1.pr("act_cost").divide(S0T1.pr("qty"))).as("act_upri"),
							decode(S0T1.pr("qty"), value(0), value(0), S0T1.pr("std_cost").divide(S0T1.pr("qty"))).as("std_upri"),
							S0T1.pr("so_act_amt"),
							S0T1.pr("so_std_amt"),
							S0T1.pr(S2W2.per),
							S0T1.pr(S2W2.mfg_cost_ratio),
							S0T1.pr(S2W2.alc_ac_cd),
							S0T1.pr(S2W2.par_itm_cd),
							S0T1.pr(S2W2.par_itm_sub1),
							S0T1.pr(S2W2.par_itm_sub2),
							S0T1.pr(S2W2.par_itm_sub3),
							S0T1.pr(S2W2.gp_alc_cd),
							S0T1.pr("diff_qty"),
							S0T1.pr("diff_wk"),
							S0T1.pr("diff_up"),
							S0T1.pr("diff_rt"),
							S0T1.pr("diff_std"),
							S0T1.pr("diff_a"),
							S0T1.pr("diff_b"),
							S0T1.pr("diff_c"),
							S0T1.pr("diff_d"),
							S0T1.pr("diff_e"),
							nullValue().as("mfg_inpt_cost"),
							nullValue().as("std_mfg_inpt_cost"),
							S0T1.pr("sls_cost"),
							S0T1.pr("std_sls_cost"),
							S0T1.pr("sls_mng_cost"),
							S0T1.pr("std_sls_mng_cost"),
							S0T1.pr("fxd_cost"),
							S0T1.pr("var_cost"),
							S0T1.pr("dir_cost"),
							S0T1.pr("indir_cost"),
							S0T1.pr("act_cost"),
							S0T1.pr("act_cost1"),
							S0T1.pr("act_cost2"),
							S0T1.pr("act_cost3"),
							S0T1.pr("act_cost4"),
							S0T1.pr("act_cost5"),
							S0T1.pr("act_cost6"),
							S0T1.pr("act_cost7"),
							S0T1.pr("act_cost8"),
							S0T1.pr("act_cost9"),
							S0T1.pr("act_cost10"),
							S0T1.pr("act_cost11"),
							S0T1.pr("act_cost12"),
							S0T1.pr("act_cost13"),
							S0T1.pr("act_cost14"),
							S0T1.pr("act_cost15"),
							S0T1.pr("act_cost16"),
							S0T1.pr("act_cost17"),
							S0T1.pr("act_cost18"),
							S0T1.pr("act_cost19"),
							S0T1.pr("act_cost20"),
							S0T1.pr("act_cost21"),
							S0T1.pr("act_cost22"),
							S0T1.pr("act_cost23"),
							S0T1.pr("act_cost24"),
							S0T1.pr("act_cost25"),
							S0T1.pr("act_cost26"),
							S0T1.pr("act_cost27"),
							S0T1.pr("act_cost28"),
							S0T1.pr("act_cost29"),
							S0T1.pr("act_cost30"),
							S0T1.pr("act_cost31"),
							S0T1.pr("act_cost32"),
							S0T1.pr("act_cost33"),
							S0T1.pr("act_cost34"),
							S0T1.pr("act_cost35"),
							S0T1.pr("act_cost36"),
							S0T1.pr("act_cost37"),
							S0T1.pr("act_cost38"),
							S0T1.pr("act_cost39"),
							S0T1.pr("act_cost40"),
							S0T1.pr("act_cost41"),
							S0T1.pr("act_cost42"),
							S0T1.pr("act_cost43"),
							S0T1.pr("act_cost44"),
							S0T1.pr("act_cost45"),
							S0T1.pr("act_cost46"),
							S0T1.pr("act_cost47"),
							S0T1.pr("act_cost48"),
							S0T1.pr("act_cost49"),
							S0T1.pr("act_cost50"),
							S0T1.pr("act_cost51"),
							S0T1.pr("act_cost52"),
							S0T1.pr("act_cost53"),
							S0T1.pr("act_cost54"),
							S0T1.pr("act_cost55"),
							S0T1.pr("act_cost56"),
							S0T1.pr("act_cost57"),
							S0T1.pr("act_cost58"),
							S0T1.pr("act_cost59"),
							S0T1.pr("act_cost60"),
							S0T1.pr("act_cost61"),
							S0T1.pr("act_cost62"),
							S0T1.pr("act_cost63"),
							S0T1.pr("act_cost64"),
							S0T1.pr("act_cost65"),
							S0T1.pr("act_cost66"),
							S0T1.pr("act_cost67"),
							S0T1.pr("act_cost68"),
							S0T1.pr("act_cost69"),
							S0T1.pr("act_cost70"),
							S0T1.pr("act_cost71"),
							S0T1.pr("act_cost72"),
							S0T1.pr("act_cost73"),
							S0T1.pr("act_cost74"),
							S0T1.pr("act_cost75"),
							S0T1.pr("act_cost76"),
							S0T1.pr("act_cost77"),
							S0T1.pr("act_cost78"),
							S0T1.pr("act_cost79"),
							S0T1.pr("act_cost80"),
							S0T1.pr("act_cost81"),
							S0T1.pr("act_cost82"),
							S0T1.pr("act_cost83"),
							S0T1.pr("act_cost84"),
							S0T1.pr("act_cost85"),
							S0T1.pr("act_cost86"),
							S0T1.pr("act_cost87"),
							S0T1.pr("act_cost88"),
							S0T1.pr("act_cost89"),
							S0T1.pr("act_cost90"),
							S0T1.pr("act_cost91"),
							S0T1.pr("act_cost92"),
							S0T1.pr("act_cost93"),
							S0T1.pr("act_cost94"),
							S0T1.pr("act_cost95"),
							S0T1.pr("act_cost96"),
							S0T1.pr("act_cost97"),
							S0T1.pr("act_cost98"),
							S0T1.pr("act_cost99"),
							S0T1.pr("act_cost100"),
							S0T1.pr("std_cost"),
							S0T1.pr("std_cost1"),
							S0T1.pr("std_cost2"),
							S0T1.pr("std_cost3"),
							S0T1.pr("std_cost4"),
							S0T1.pr("std_cost5"),
							S0T1.pr("std_cost6"),
							S0T1.pr("std_cost7"),
							S0T1.pr("std_cost8"),
							S0T1.pr("std_cost9"),
							S0T1.pr("std_cost10"),
							S0T1.pr("std_cost11"),
							S0T1.pr("std_cost12"),
							S0T1.pr("std_cost13"),
							S0T1.pr("std_cost14"),
							S0T1.pr("std_cost15"),
							S0T1.pr("std_cost16"),
							S0T1.pr("std_cost17"),
							S0T1.pr("std_cost18"),
							S0T1.pr("std_cost19"),
							S0T1.pr("std_cost20"),
							S0T1.pr("std_cost21"),
							S0T1.pr("std_cost22"),
							S0T1.pr("std_cost23"),
							S0T1.pr("std_cost24"),
							S0T1.pr("std_cost25"),
							S0T1.pr("std_cost26"),
							S0T1.pr("std_cost27"),
							S0T1.pr("std_cost28"),
							S0T1.pr("std_cost29"),
							S0T1.pr("std_cost30"),
							S0T1.pr("std_cost31"),
							S0T1.pr("std_cost32"),
							S0T1.pr("std_cost33"),
							S0T1.pr("std_cost34"),
							S0T1.pr("std_cost35"),
							S0T1.pr("std_cost36"),
							S0T1.pr("std_cost37"),
							S0T1.pr("std_cost38"),
							S0T1.pr("std_cost39"),
							S0T1.pr("std_cost40"),
							S0T1.pr("std_cost41"),
							S0T1.pr("std_cost42"),
							S0T1.pr("std_cost43"),
							S0T1.pr("std_cost44"),
							S0T1.pr("std_cost45"),
							S0T1.pr("std_cost46"),
							S0T1.pr("std_cost47"),
							S0T1.pr("std_cost48"),
							S0T1.pr("std_cost49"),
							S0T1.pr("std_cost50"),
							S0T1.pr("std_cost51"),
							S0T1.pr("std_cost52"),
							S0T1.pr("std_cost53"),
							S0T1.pr("std_cost54"),
							S0T1.pr("std_cost55"),
							S0T1.pr("std_cost56"),
							S0T1.pr("std_cost57"),
							S0T1.pr("std_cost58"),
							S0T1.pr("std_cost59"),
							S0T1.pr("std_cost60"),
							S0T1.pr("std_cost61"),
							S0T1.pr("std_cost62"),
							S0T1.pr("std_cost63"),
							S0T1.pr("std_cost64"),
							S0T1.pr("std_cost65"),
							S0T1.pr("std_cost66"),
							S0T1.pr("std_cost67"),
							S0T1.pr("std_cost68"),
							S0T1.pr("std_cost69"),
							S0T1.pr("std_cost70"),
							S0T1.pr("std_cost71"),
							S0T1.pr("std_cost72"),
							S0T1.pr("std_cost73"),
							S0T1.pr("std_cost74"),
							S0T1.pr("std_cost75"),
							S0T1.pr("std_cost76"),
							S0T1.pr("std_cost77"),
							S0T1.pr("std_cost78"),
							S0T1.pr("std_cost79"),
							S0T1.pr("std_cost80"),
							S0T1.pr("std_cost81"),
							S0T1.pr("std_cost82"),
							S0T1.pr("std_cost83"),
							S0T1.pr("std_cost84"),
							S0T1.pr("std_cost85"),
							S0T1.pr("std_cost86"),
							S0T1.pr("std_cost87"),
							S0T1.pr("std_cost88"),
							S0T1.pr("std_cost89"),
							S0T1.pr("std_cost90"),
							S0T1.pr("std_cost91"),
							S0T1.pr("std_cost92"),
							S0T1.pr("std_cost93"),
							S0T1.pr("std_cost94"),
							S0T1.pr("std_cost95"),
							S0T1.pr("std_cost96"),
							S0T1.pr("std_cost97"),
							S0T1.pr("std_cost98"),
							S0T1.pr("std_cost99"),
							S0T1.pr("std_cost100"))
					.from(subQuery()
							.select(
									S1L1.pr(S2W2.calc_no),
									S1L1.pr(S2W2.calc_grp_cd),
									S1L1.pr(S2W1.fix_flg),
									S1L1.pr(S2W2.calc_rec_typ),
									S1L1.pr(S2W2.wg_cd),
									S1L1.pr(S2W1.term),
									S1L1.pr(S2W2.ym),
									S1L1.pr(S2W2.ac_dt),
									S1L1.pr(S2W2.mng_dpt_cd),
									S1L1.pr(S2W2.itm_cd),
									S1L1.pr(S2W2.itm_sub1),
									S1L1.pr(S2W2.itm_sub2),
									S1L1.pr(S2W2.itm_sub3),
									S1L1.pr(S2W2.mfg_purc_typ),
									S1L1.pr(S2W2.lot_no),
									S1L1.pr(S2W2.sublot_no),
									S1L1.pr(S2W2.sno1),
									S1L1.pr(S2W2.sno2),
									S1L1.pr(S2W2.sno3),
									S1L1.pr(S2W2.sno4),
									S1L1.pr(S2W2.cost_io_typ),
									S1L1.pr(S2W2.ac_slip_typ),
									S1L1.pr(S2W2.ac_rsn_cd),
									S1L1.pr(S2W2.itm_mfg_inst_no),
									S1L1.pr(S2W2.mfg_act_no),
									S1L1.pr(S2W2.loc_cd),
									S1L1.pr(S2W2.str_ln_cd),
									S1L1.pr(S2W2.oper_act_no),
									S1L1.pr(S2W2.oper_cd),
									S1L1.pr(S2W2.oper_seq),
									S1L1.pr(S2W2.bp_cd),
									S1L1.pr(S2W2.stk_bp_cd),
									S1L1.pr(S2W2.po_no),
									S1L1.pr(S2W2.slo_no),
									S1L1.pr(S2W2.iv_no),
									S1L1.pr(S2W2.act_id),
									S1L1.pr(S2W2.act_id_sub),
									S1L1.pr(S2W2.alc_dpt_cd),
									S1L1.pr(S2W2.other_dpt_cd),
									S1L1.pr(S2W2.asst_typ),
									S1L1.pr(S2W2.cur_cd),
									S1L1.pr(S2W2.xrate),
									S1L1.pr(S2W2.std_xrate),
									S1L1.pr(S2W2.trd_grp),
									S1L1.pr(S2W2.act_upri),
									S1L1.pr(S2W2.std_upri),
									S1L1.pr(S2W2.per),
									S1L1.pr(S2W2.mfg_cost_ratio),
									S1L1.pr(S2W2.alc_ac_cd),
									S1L1.pr(S2W2.par_itm_cd),
									S1L1.pr(S2W2.par_itm_sub1),
									S1L1.pr(S2W2.par_itm_sub2),
									S1L1.pr(S2W2.par_itm_sub3),
									S1L1.pr(S2W2.gp_alc_cd),
									sum(nvl(S1L1.pr(S2W2.qty), value(0))).as("qty"),
									sum(nvl(S1L1.pr(S2W2.amt), value(0))).as("amt"),
									sum(nvl(S1L1.pr(S2W2.std_qty), value(0))).as("std_qty"),
									sum(nvl(S1L1.pr(S2W2.std_amt), value(0))).as("std_amt"),
									sum(nvl(S1L1.pr(S2W2.cur_amt), value(0))).as("cur_amt"),
									sum(nvl(S1L1.pr(S2W2.cur_std_amt), value(0))).as("cur_std_amt"),
									sum(nvl(S1L1.pr(S2W2.upri_diff), value(0))).as("upri_diff"),
									sum(nvl(S1L1.pr(S2W2.rate_diff), value(0))).as("rate_diff"),
									sum(nvl(S1L1.pr(S2W2.so_act_amt), value(0))).as("so_act_amt"),
									sum(nvl(S1L1.pr(S2W2.so_std_amt), value(0))).as("so_std_amt"),
									sum(nvl(S1L1.pr("diff_qty"), value(0))).as("diff_qty"),
									sum(nvl(S1L1.pr("diff_wk"), value(0))).as("diff_wk"),
									sum(nvl(S1L1.pr("diff_up"), value(0))).as("diff_up"),
									sum(nvl(S1L1.pr("diff_rt"), value(0))).as("diff_rt"),
									sum(nvl(S1L1.pr("diff_std"), value(0))).as("diff_std"),
									sum(nvl(S1L1.pr("diff_a"), value(0))).as("diff_a"),
									sum(nvl(S1L1.pr("diff_b"), value(0))).as("diff_b"),
									sum(nvl(S1L1.pr("diff_c"), value(0))).as("diff_c"),
									sum(nvl(S1L1.pr("diff_d"), value(0))).as("diff_d"),
									sum(nvl(S1L1.pr("diff_e"), value(0))).as("diff_e"),
									sum(nvl(S1L1.pr("sls_cost"), value(0))).as("sls_cost"),
									sum(nvl(S1L1.pr("std_sls_cost"), value(0))).as("std_sls_cost"),
									sum(nvl(S1L1.pr("sls_mng_cost"), value(0))).as("sls_mng_cost"),
									sum(nvl(S1L1.pr("std_sls_mng_cost"), value(0))).as("std_sls_mng_cost"),
									sum(nvl(S1L1.pr("fxd_cost"), value(0))).as("fxd_cost"),
									sum(nvl(S1L1.pr("var_cost"), value(0))).as("var_cost"),
									sum(nvl(S1L1.pr("dir_cost"), value(0))).as("dir_cost"),
									sum(nvl(S1L1.pr("indir_cost"), value(0))).as("indir_cost"),
									sum(nvl(S1L1.pr("act_cost"), value(0))).as("act_cost"),
									sum(nvl(S1L1.pr("act_cost1"), value(0))).as("act_cost1"),
									sum(nvl(S1L1.pr("act_cost2"), value(0))).as("act_cost2"),
									sum(nvl(S1L1.pr("act_cost3"), value(0))).as("act_cost3"),
									sum(nvl(S1L1.pr("act_cost4"), value(0))).as("act_cost4"),
									sum(nvl(S1L1.pr("act_cost5"), value(0))).as("act_cost5"),
									sum(nvl(S1L1.pr("act_cost6"), value(0))).as("act_cost6"),
									sum(nvl(S1L1.pr("act_cost7"), value(0))).as("act_cost7"),
									sum(nvl(S1L1.pr("act_cost8"), value(0))).as("act_cost8"),
									sum(nvl(S1L1.pr("act_cost9"), value(0))).as("act_cost9"),
									sum(nvl(S1L1.pr("act_cost10"), value(0))).as("act_cost10"),
									sum(nvl(S1L1.pr("act_cost11"), value(0))).as("act_cost11"),
									sum(nvl(S1L1.pr("act_cost12"), value(0))).as("act_cost12"),
									sum(nvl(S1L1.pr("act_cost13"), value(0))).as("act_cost13"),
									sum(nvl(S1L1.pr("act_cost14"), value(0))).as("act_cost14"),
									sum(nvl(S1L1.pr("act_cost15"), value(0))).as("act_cost15"),
									sum(nvl(S1L1.pr("act_cost16"), value(0))).as("act_cost16"),
									sum(nvl(S1L1.pr("act_cost17"), value(0))).as("act_cost17"),
									sum(nvl(S1L1.pr("act_cost18"), value(0))).as("act_cost18"),
									sum(nvl(S1L1.pr("act_cost19"), value(0))).as("act_cost19"),
									sum(nvl(S1L1.pr("act_cost20"), value(0))).as("act_cost20"),
									sum(nvl(S1L1.pr("act_cost21"), value(0))).as("act_cost21"),
									sum(nvl(S1L1.pr("act_cost22"), value(0))).as("act_cost22"),
									sum(nvl(S1L1.pr("act_cost23"), value(0))).as("act_cost23"),
									sum(nvl(S1L1.pr("act_cost24"), value(0))).as("act_cost24"),
									sum(nvl(S1L1.pr("act_cost25"), value(0))).as("act_cost25"),
									sum(nvl(S1L1.pr("act_cost26"), value(0))).as("act_cost26"),
									sum(nvl(S1L1.pr("act_cost27"), value(0))).as("act_cost27"),
									sum(nvl(S1L1.pr("act_cost28"), value(0))).as("act_cost28"),
									sum(nvl(S1L1.pr("act_cost29"), value(0))).as("act_cost29"),
									sum(nvl(S1L1.pr("act_cost30"), value(0))).as("act_cost30"),
									sum(nvl(S1L1.pr("act_cost31"), value(0))).as("act_cost31"),
									sum(nvl(S1L1.pr("act_cost32"), value(0))).as("act_cost32"),
									sum(nvl(S1L1.pr("act_cost33"), value(0))).as("act_cost33"),
									sum(nvl(S1L1.pr("act_cost34"), value(0))).as("act_cost34"),
									sum(nvl(S1L1.pr("act_cost35"), value(0))).as("act_cost35"),
									sum(nvl(S1L1.pr("act_cost36"), value(0))).as("act_cost36"),
									sum(nvl(S1L1.pr("act_cost37"), value(0))).as("act_cost37"),
									sum(nvl(S1L1.pr("act_cost38"), value(0))).as("act_cost38"),
									sum(nvl(S1L1.pr("act_cost39"), value(0))).as("act_cost39"),
									sum(nvl(S1L1.pr("act_cost40"), value(0))).as("act_cost40"),
									sum(nvl(S1L1.pr("act_cost41"), value(0))).as("act_cost41"),
									sum(nvl(S1L1.pr("act_cost42"), value(0))).as("act_cost42"),
									sum(nvl(S1L1.pr("act_cost43"), value(0))).as("act_cost43"),
									sum(nvl(S1L1.pr("act_cost44"), value(0))).as("act_cost44"),
									sum(nvl(S1L1.pr("act_cost45"), value(0))).as("act_cost45"),
									sum(nvl(S1L1.pr("act_cost46"), value(0))).as("act_cost46"),
									sum(nvl(S1L1.pr("act_cost47"), value(0))).as("act_cost47"),
									sum(nvl(S1L1.pr("act_cost48"), value(0))).as("act_cost48"),
									sum(nvl(S1L1.pr("act_cost49"), value(0))).as("act_cost49"),
									sum(nvl(S1L1.pr("act_cost50"), value(0))).as("act_cost50"),
									sum(nvl(S1L1.pr("act_cost51"), value(0))).as("act_cost51"),
									sum(nvl(S1L1.pr("act_cost52"), value(0))).as("act_cost52"),
									sum(nvl(S1L1.pr("act_cost53"), value(0))).as("act_cost53"),
									sum(nvl(S1L1.pr("act_cost54"), value(0))).as("act_cost54"),
									sum(nvl(S1L1.pr("act_cost55"), value(0))).as("act_cost55"),
									sum(nvl(S1L1.pr("act_cost56"), value(0))).as("act_cost56"),
									sum(nvl(S1L1.pr("act_cost57"), value(0))).as("act_cost57"),
									sum(nvl(S1L1.pr("act_cost58"), value(0))).as("act_cost58"),
									sum(nvl(S1L1.pr("act_cost59"), value(0))).as("act_cost59"),
									sum(nvl(S1L1.pr("act_cost60"), value(0))).as("act_cost60"),
									sum(nvl(S1L1.pr("act_cost61"), value(0))).as("act_cost61"),
									sum(nvl(S1L1.pr("act_cost62"), value(0))).as("act_cost62"),
									sum(nvl(S1L1.pr("act_cost63"), value(0))).as("act_cost63"),
									sum(nvl(S1L1.pr("act_cost64"), value(0))).as("act_cost64"),
									sum(nvl(S1L1.pr("act_cost65"), value(0))).as("act_cost65"),
									sum(nvl(S1L1.pr("act_cost66"), value(0))).as("act_cost66"),
									sum(nvl(S1L1.pr("act_cost67"), value(0))).as("act_cost67"),
									sum(nvl(S1L1.pr("act_cost68"), value(0))).as("act_cost68"),
									sum(nvl(S1L1.pr("act_cost69"), value(0))).as("act_cost69"),
									sum(nvl(S1L1.pr("act_cost70"), value(0))).as("act_cost70"),
									sum(nvl(S1L1.pr("act_cost71"), value(0))).as("act_cost71"),
									sum(nvl(S1L1.pr("act_cost72"), value(0))).as("act_cost72"),
									sum(nvl(S1L1.pr("act_cost73"), value(0))).as("act_cost73"),
									sum(nvl(S1L1.pr("act_cost74"), value(0))).as("act_cost74"),
									sum(nvl(S1L1.pr("act_cost75"), value(0))).as("act_cost75"),
									sum(nvl(S1L1.pr("act_cost76"), value(0))).as("act_cost76"),
									sum(nvl(S1L1.pr("act_cost77"), value(0))).as("act_cost77"),
									sum(nvl(S1L1.pr("act_cost78"), value(0))).as("act_cost78"),
									sum(nvl(S1L1.pr("act_cost79"), value(0))).as("act_cost79"),
									sum(nvl(S1L1.pr("act_cost80"), value(0))).as("act_cost80"),
									sum(nvl(S1L1.pr("act_cost81"), value(0))).as("act_cost81"),
									sum(nvl(S1L1.pr("act_cost82"), value(0))).as("act_cost82"),
									sum(nvl(S1L1.pr("act_cost83"), value(0))).as("act_cost83"),
									sum(nvl(S1L1.pr("act_cost84"), value(0))).as("act_cost84"),
									sum(nvl(S1L1.pr("act_cost85"), value(0))).as("act_cost85"),
									sum(nvl(S1L1.pr("act_cost86"), value(0))).as("act_cost86"),
									sum(nvl(S1L1.pr("act_cost87"), value(0))).as("act_cost87"),
									sum(nvl(S1L1.pr("act_cost88"), value(0))).as("act_cost88"),
									sum(nvl(S1L1.pr("act_cost89"), value(0))).as("act_cost89"),
									sum(nvl(S1L1.pr("act_cost90"), value(0))).as("act_cost90"),
									sum(nvl(S1L1.pr("act_cost91"), value(0))).as("act_cost91"),
									sum(nvl(S1L1.pr("act_cost92"), value(0))).as("act_cost92"),
									sum(nvl(S1L1.pr("act_cost93"), value(0))).as("act_cost93"),
									sum(nvl(S1L1.pr("act_cost94"), value(0))).as("act_cost94"),
									sum(nvl(S1L1.pr("act_cost95"), value(0))).as("act_cost95"),
									sum(nvl(S1L1.pr("act_cost96"), value(0))).as("act_cost96"),
									sum(nvl(S1L1.pr("act_cost97"), value(0))).as("act_cost97"),
									sum(nvl(S1L1.pr("act_cost98"), value(0))).as("act_cost98"),
									sum(nvl(S1L1.pr("act_cost99"), value(0))).as("act_cost99"),
									sum(nvl(S1L1.pr("act_cost100"), value(0))).as("act_cost100"),
									sum(nvl(S1L1.pr("std_cost"), value(0))).as("std_cost"),
									sum(nvl(S1L1.pr("std_cost1"), value(0))).as("std_cost1"),
									sum(nvl(S1L1.pr("std_cost2"), value(0))).as("std_cost2"),
									sum(nvl(S1L1.pr("std_cost3"), value(0))).as("std_cost3"),
									sum(nvl(S1L1.pr("std_cost4"), value(0))).as("std_cost4"),
									sum(nvl(S1L1.pr("std_cost5"), value(0))).as("std_cost5"),
									sum(nvl(S1L1.pr("std_cost6"), value(0))).as("std_cost6"),
									sum(nvl(S1L1.pr("std_cost7"), value(0))).as("std_cost7"),
									sum(nvl(S1L1.pr("std_cost8"), value(0))).as("std_cost8"),
									sum(nvl(S1L1.pr("std_cost9"), value(0))).as("std_cost9"),
									sum(nvl(S1L1.pr("std_cost10"), value(0))).as("std_cost10"),
									sum(nvl(S1L1.pr("std_cost11"), value(0))).as("std_cost11"),
									sum(nvl(S1L1.pr("std_cost12"), value(0))).as("std_cost12"),
									sum(nvl(S1L1.pr("std_cost13"), value(0))).as("std_cost13"),
									sum(nvl(S1L1.pr("std_cost14"), value(0))).as("std_cost14"),
									sum(nvl(S1L1.pr("std_cost15"), value(0))).as("std_cost15"),
									sum(nvl(S1L1.pr("std_cost16"), value(0))).as("std_cost16"),
									sum(nvl(S1L1.pr("std_cost17"), value(0))).as("std_cost17"),
									sum(nvl(S1L1.pr("std_cost18"), value(0))).as("std_cost18"),
									sum(nvl(S1L1.pr("std_cost19"), value(0))).as("std_cost19"),
									sum(nvl(S1L1.pr("std_cost20"), value(0))).as("std_cost20"),
									sum(nvl(S1L1.pr("std_cost21"), value(0))).as("std_cost21"),
									sum(nvl(S1L1.pr("std_cost22"), value(0))).as("std_cost22"),
									sum(nvl(S1L1.pr("std_cost23"), value(0))).as("std_cost23"),
									sum(nvl(S1L1.pr("std_cost24"), value(0))).as("std_cost24"),
									sum(nvl(S1L1.pr("std_cost25"), value(0))).as("std_cost25"),
									sum(nvl(S1L1.pr("std_cost26"), value(0))).as("std_cost26"),
									sum(nvl(S1L1.pr("std_cost27"), value(0))).as("std_cost27"),
									sum(nvl(S1L1.pr("std_cost28"), value(0))).as("std_cost28"),
									sum(nvl(S1L1.pr("std_cost29"), value(0))).as("std_cost29"),
									sum(nvl(S1L1.pr("std_cost30"), value(0))).as("std_cost30"),
									sum(nvl(S1L1.pr("std_cost31"), value(0))).as("std_cost31"),
									sum(nvl(S1L1.pr("std_cost32"), value(0))).as("std_cost32"),
									sum(nvl(S1L1.pr("std_cost33"), value(0))).as("std_cost33"),
									sum(nvl(S1L1.pr("std_cost34"), value(0))).as("std_cost34"),
									sum(nvl(S1L1.pr("std_cost35"), value(0))).as("std_cost35"),
									sum(nvl(S1L1.pr("std_cost36"), value(0))).as("std_cost36"),
									sum(nvl(S1L1.pr("std_cost37"), value(0))).as("std_cost37"),
									sum(nvl(S1L1.pr("std_cost38"), value(0))).as("std_cost38"),
									sum(nvl(S1L1.pr("std_cost39"), value(0))).as("std_cost39"),
									sum(nvl(S1L1.pr("std_cost40"), value(0))).as("std_cost40"),
									sum(nvl(S1L1.pr("std_cost41"), value(0))).as("std_cost41"),
									sum(nvl(S1L1.pr("std_cost42"), value(0))).as("std_cost42"),
									sum(nvl(S1L1.pr("std_cost43"), value(0))).as("std_cost43"),
									sum(nvl(S1L1.pr("std_cost44"), value(0))).as("std_cost44"),
									sum(nvl(S1L1.pr("std_cost45"), value(0))).as("std_cost45"),
									sum(nvl(S1L1.pr("std_cost46"), value(0))).as("std_cost46"),
									sum(nvl(S1L1.pr("std_cost47"), value(0))).as("std_cost47"),
									sum(nvl(S1L1.pr("std_cost48"), value(0))).as("std_cost48"),
									sum(nvl(S1L1.pr("std_cost49"), value(0))).as("std_cost49"),
									sum(nvl(S1L1.pr("std_cost50"), value(0))).as("std_cost50"),
									sum(nvl(S1L1.pr("std_cost51"), value(0))).as("std_cost51"),
									sum(nvl(S1L1.pr("std_cost52"), value(0))).as("std_cost52"),
									sum(nvl(S1L1.pr("std_cost53"), value(0))).as("std_cost53"),
									sum(nvl(S1L1.pr("std_cost54"), value(0))).as("std_cost54"),
									sum(nvl(S1L1.pr("std_cost55"), value(0))).as("std_cost55"),
									sum(nvl(S1L1.pr("std_cost56"), value(0))).as("std_cost56"),
									sum(nvl(S1L1.pr("std_cost57"), value(0))).as("std_cost57"),
									sum(nvl(S1L1.pr("std_cost58"), value(0))).as("std_cost58"),
									sum(nvl(S1L1.pr("std_cost59"), value(0))).as("std_cost59"),
									sum(nvl(S1L1.pr("std_cost60"), value(0))).as("std_cost60"),
									sum(nvl(S1L1.pr("std_cost61"), value(0))).as("std_cost61"),
									sum(nvl(S1L1.pr("std_cost62"), value(0))).as("std_cost62"),
									sum(nvl(S1L1.pr("std_cost63"), value(0))).as("std_cost63"),
									sum(nvl(S1L1.pr("std_cost64"), value(0))).as("std_cost64"),
									sum(nvl(S1L1.pr("std_cost65"), value(0))).as("std_cost65"),
									sum(nvl(S1L1.pr("std_cost66"), value(0))).as("std_cost66"),
									sum(nvl(S1L1.pr("std_cost67"), value(0))).as("std_cost67"),
									sum(nvl(S1L1.pr("std_cost68"), value(0))).as("std_cost68"),
									sum(nvl(S1L1.pr("std_cost69"), value(0))).as("std_cost69"),
									sum(nvl(S1L1.pr("std_cost70"), value(0))).as("std_cost70"),
									sum(nvl(S1L1.pr("std_cost71"), value(0))).as("std_cost71"),
									sum(nvl(S1L1.pr("std_cost72"), value(0))).as("std_cost72"),
									sum(nvl(S1L1.pr("std_cost73"), value(0))).as("std_cost73"),
									sum(nvl(S1L1.pr("std_cost74"), value(0))).as("std_cost74"),
									sum(nvl(S1L1.pr("std_cost75"), value(0))).as("std_cost75"),
									sum(nvl(S1L1.pr("std_cost76"), value(0))).as("std_cost76"),
									sum(nvl(S1L1.pr("std_cost77"), value(0))).as("std_cost77"),
									sum(nvl(S1L1.pr("std_cost78"), value(0))).as("std_cost78"),
									sum(nvl(S1L1.pr("std_cost79"), value(0))).as("std_cost79"),
									sum(nvl(S1L1.pr("std_cost80"), value(0))).as("std_cost80"),
									sum(nvl(S1L1.pr("std_cost81"), value(0))).as("std_cost81"),
									sum(nvl(S1L1.pr("std_cost82"), value(0))).as("std_cost82"),
									sum(nvl(S1L1.pr("std_cost83"), value(0))).as("std_cost83"),
									sum(nvl(S1L1.pr("std_cost84"), value(0))).as("std_cost84"),
									sum(nvl(S1L1.pr("std_cost85"), value(0))).as("std_cost85"),
									sum(nvl(S1L1.pr("std_cost86"), value(0))).as("std_cost86"),
									sum(nvl(S1L1.pr("std_cost87"), value(0))).as("std_cost87"),
									sum(nvl(S1L1.pr("std_cost88"), value(0))).as("std_cost88"),
									sum(nvl(S1L1.pr("std_cost89"), value(0))).as("std_cost89"),
									sum(nvl(S1L1.pr("std_cost90"), value(0))).as("std_cost90"),
									sum(nvl(S1L1.pr("std_cost91"), value(0))).as("std_cost91"),
									sum(nvl(S1L1.pr("std_cost92"), value(0))).as("std_cost92"),
									sum(nvl(S1L1.pr("std_cost93"), value(0))).as("std_cost93"),
									sum(nvl(S1L1.pr("std_cost94"), value(0))).as("std_cost94"),
									sum(nvl(S1L1.pr("std_cost95"), value(0))).as("std_cost95"),
									sum(nvl(S1L1.pr("std_cost96"), value(0))).as("std_cost96"),
									sum(nvl(S1L1.pr("std_cost97"), value(0))).as("std_cost97"),
									sum(nvl(S1L1.pr("std_cost98"), value(0))).as("std_cost98"),
									sum(nvl(S1L1.pr("std_cost99"), value(0))).as("std_cost99"),
									sum(nvl(S1L1.pr("std_cost100"), value(0))).as("std_cost100"))
							.from(subQuery()
									.select(
											S2W2.calc_no,
											S2W2.calc_grp_cd,
											S2W2.top_rec_no,
											S2W1.fix_flg,
											S2W2.calc_rec_typ,
											S2W2.wg_cd,
											S2W1.term,
											S2W2.ym,
											S2W2.ac_dt,
											S2W2.mng_dpt_cd,
											S2W2.itm_cd,
											S2W2.itm_sub1,
											S2W2.itm_sub2,
											S2W2.itm_sub3,
											S2W2.mfg_purc_typ,
											S2W2.lot_no,
											S2W2.sublot_no,
											S2W2.sno1,
											S2W2.sno2,
											S2W2.sno3,
											S2W2.sno4,
											S2W2.cost_io_typ,
											S2W2.ac_slip_typ,
											S2W2.ac_rsn_cd,
											S2W2.itm_mfg_inst_no,
											S2W2.mfg_act_no,
											S2W2.loc_cd,
											S2W2.str_ln_cd,
											S2W2.oper_act_no,
											S2W2.oper_cd,
											S2W2.oper_seq,
											S2W2.bp_cd,
											S2W2.stk_bp_cd,
											S2W2.po_no,
											S2W2.slo_no,
											S2W2.iv_no,
											S2W2.act_id,
											S2W2.act_id_sub,
											S2W2.alc_dpt_cd,
											S2W2.other_dpt_cd,
											S2W2.asst_typ,
											S2W2.cur_cd,
											S2W2.xrate,
											S2W2.std_xrate,
											S2W2.trd_grp,
											S2W2.act_upri,
											S2W2.std_upri,
											S2W2.per,
											S2W2.mfg_cost_ratio,
											S2W2.alc_ac_cd,
											S2W2.par_itm_cd,
											S2W2.par_itm_sub1,
											S2W2.par_itm_sub2,
											S2W2.par_itm_sub3,
											S2W2.gp_alc_cd,
											S2W2.qty,
											S2W2.amt,
											S2W2.std_qty,
											S2W2.std_amt,
											S2W2.cur_amt,
											S2W2.cur_std_amt,
											S2W2.upri_diff,
											S2W2.rate_diff,
											S2W2.so_act_amt,
											S2W2.so_std_amt,
											sum(nvl(S2W3.diff_qty, value(0))).as("diff_qty"),
											sum(nvl(S2W3.diff_wk, value(0))).as("diff_wk"),
											sum(nvl(S2W3.diff_up, value(0))).as("diff_up"),
											sum(nvl(S2W3.diff_rt, value(0))).as("diff_rt"),
											sum(nvl(S2W3.diff_std, value(0))).as("diff_std"),
											sum(nvl(S2W3.diff_a, value(0))).as("diff_a"),
											sum(nvl(S2W3.diff_b, value(0))).as("diff_b"),
											sum(nvl(S2W3.diff_c, value(0))).as("diff_c"),
											sum(nvl(S2W3.diff_d, value(0))).as("diff_d"),
											sum(nvl(S2W3.diff_e, value(0))).as("diff_e"),
											sum(decode(S2W3.expns_typ, value(MAC_EXPNS_TYP.PROD.value()), nvl(S2W3.act_cost, value(0)), value(0))).as("sls_cost"),
											sum(decode(S2W3.expns_typ, value(MAC_EXPNS_TYP.PROD.value()), nvl(S2W3.std_cost, value(0)), value(0))).as("std_sls_cost"),
											sum(decode(S2W3.expns_typ, value(MAC_EXPNS_TYP.SGA.value()), nvl(S2W3.act_cost, value(0)), value(0))).as("sls_mng_cost"),
											sum(decode(S2W3.expns_typ, value(MAC_EXPNS_TYP.SGA.value()), nvl(S2W3.std_cost, value(0)), value(0))).as("std_sls_mng_cost"),
											sum(decode(S2M1.pr(S3MW1.var_typ), value(MAC_VAR_TYP.FXD.value()), nvl(S2W3.act_cost, value(0)), value(0))).as("fxd_cost"),
											sum(decode(S2M1.pr(S3MW1.var_typ), value(MAC_VAR_TYP.VAR.value()), nvl(S2W3.act_cost, value(0)), value(0))).as("var_cost"),
											sum(decode(S2M1.pr(S3MW1.direct_typ), value(MAC_DIRECT_TYP.DIRECT.value()), nvl(S2W3.act_cost, value(0)), value(0))).as("dir_cost"),
											sum(decode(S2M1.pr(S3MW1.direct_typ), value(MAC_DIRECT_TYP.INDIRECT.value()), nvl(S2W3.act_cost, value(0)), value(0))).as("indir_cost"),
											sum(nvl(S2W3.act_cost, value(0))).as("act_cost"),
											sum(decode(S2M1.pr("seq"), value(1), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost1"),
											sum(decode(S2M1.pr("seq"), value(2), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost2"),
											sum(decode(S2M1.pr("seq"), value(3), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost3"),
											sum(decode(S2M1.pr("seq"), value(4), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost4"),
											sum(decode(S2M1.pr("seq"), value(5), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost5"),
											sum(decode(S2M1.pr("seq"), value(6), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost6"),
											sum(decode(S2M1.pr("seq"), value(7), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost7"),
											sum(decode(S2M1.pr("seq"), value(8), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost8"),
											sum(decode(S2M1.pr("seq"), value(9), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost9"),
											sum(decode(S2M1.pr("seq"), value(10), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost10"),
											sum(decode(S2M1.pr("seq"), value(11), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost11"),
											sum(decode(S2M1.pr("seq"), value(12), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost12"),
											sum(decode(S2M1.pr("seq"), value(13), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost13"),
											sum(decode(S2M1.pr("seq"), value(14), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost14"),
											sum(decode(S2M1.pr("seq"), value(15), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost15"),
											sum(decode(S2M1.pr("seq"), value(16), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost16"),
											sum(decode(S2M1.pr("seq"), value(17), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost17"),
											sum(decode(S2M1.pr("seq"), value(18), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost18"),
											sum(decode(S2M1.pr("seq"), value(19), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost19"),
											sum(decode(S2M1.pr("seq"), value(20), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost20"),
											sum(decode(S2M1.pr("seq"), value(21), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost21"),
											sum(decode(S2M1.pr("seq"), value(22), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost22"),
											sum(decode(S2M1.pr("seq"), value(23), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost23"),
											sum(decode(S2M1.pr("seq"), value(24), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost24"),
											sum(decode(S2M1.pr("seq"), value(25), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost25"),
											sum(decode(S2M1.pr("seq"), value(26), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost26"),
											sum(decode(S2M1.pr("seq"), value(27), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost27"),
											sum(decode(S2M1.pr("seq"), value(28), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost28"),
											sum(decode(S2M1.pr("seq"), value(29), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost29"),
											sum(decode(S2M1.pr("seq"), value(30), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost30"),
											sum(decode(S2M1.pr("seq"), value(31), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost31"),
											sum(decode(S2M1.pr("seq"), value(32), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost32"),
											sum(decode(S2M1.pr("seq"), value(33), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost33"),
											sum(decode(S2M1.pr("seq"), value(34), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost34"),
											sum(decode(S2M1.pr("seq"), value(35), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost35"),
											sum(decode(S2M1.pr("seq"), value(36), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost36"),
											sum(decode(S2M1.pr("seq"), value(37), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost37"),
											sum(decode(S2M1.pr("seq"), value(38), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost38"),
											sum(decode(S2M1.pr("seq"), value(39), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost39"),
											sum(decode(S2M1.pr("seq"), value(40), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost40"),
											sum(decode(S2M1.pr("seq"), value(41), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost41"),
											sum(decode(S2M1.pr("seq"), value(42), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost42"),
											sum(decode(S2M1.pr("seq"), value(43), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost43"),
											sum(decode(S2M1.pr("seq"), value(44), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost44"),
											sum(decode(S2M1.pr("seq"), value(45), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost45"),
											sum(decode(S2M1.pr("seq"), value(46), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost46"),
											sum(decode(S2M1.pr("seq"), value(47), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost47"),
											sum(decode(S2M1.pr("seq"), value(48), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost48"),
											sum(decode(S2M1.pr("seq"), value(49), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost49"),
											sum(decode(S2M1.pr("seq"), value(50), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost50"),
											sum(decode(S2M1.pr("seq"), value(51), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost51"),
											sum(decode(S2M1.pr("seq"), value(52), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost52"),
											sum(decode(S2M1.pr("seq"), value(53), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost53"),
											sum(decode(S2M1.pr("seq"), value(54), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost54"),
											sum(decode(S2M1.pr("seq"), value(55), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost55"),
											sum(decode(S2M1.pr("seq"), value(56), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost56"),
											sum(decode(S2M1.pr("seq"), value(57), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost57"),
											sum(decode(S2M1.pr("seq"), value(58), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost58"),
											sum(decode(S2M1.pr("seq"), value(59), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost59"),
											sum(decode(S2M1.pr("seq"), value(60), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost60"),
											sum(decode(S2M1.pr("seq"), value(61), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost61"),
											sum(decode(S2M1.pr("seq"), value(62), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost62"),
											sum(decode(S2M1.pr("seq"), value(63), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost63"),
											sum(decode(S2M1.pr("seq"), value(64), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost64"),
											sum(decode(S2M1.pr("seq"), value(65), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost65"),
											sum(decode(S2M1.pr("seq"), value(66), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost66"),
											sum(decode(S2M1.pr("seq"), value(67), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost67"),
											sum(decode(S2M1.pr("seq"), value(68), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost68"),
											sum(decode(S2M1.pr("seq"), value(69), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost69"),
											sum(decode(S2M1.pr("seq"), value(70), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost70"),
											sum(decode(S2M1.pr("seq"), value(71), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost71"),
											sum(decode(S2M1.pr("seq"), value(72), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost72"),
											sum(decode(S2M1.pr("seq"), value(73), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost73"),
											sum(decode(S2M1.pr("seq"), value(74), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost74"),
											sum(decode(S2M1.pr("seq"), value(75), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost75"),
											sum(decode(S2M1.pr("seq"), value(76), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost76"),
											sum(decode(S2M1.pr("seq"), value(77), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost77"),
											sum(decode(S2M1.pr("seq"), value(78), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost78"),
											sum(decode(S2M1.pr("seq"), value(79), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost79"),
											sum(decode(S2M1.pr("seq"), value(80), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost80"),
											sum(decode(S2M1.pr("seq"), value(81), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost81"),
											sum(decode(S2M1.pr("seq"), value(82), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost82"),
											sum(decode(S2M1.pr("seq"), value(83), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost83"),
											sum(decode(S2M1.pr("seq"), value(84), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost84"),
											sum(decode(S2M1.pr("seq"), value(85), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost85"),
											sum(decode(S2M1.pr("seq"), value(86), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost86"),
											sum(decode(S2M1.pr("seq"), value(87), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost87"),
											sum(decode(S2M1.pr("seq"), value(88), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost88"),
											sum(decode(S2M1.pr("seq"), value(89), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost89"),
											sum(decode(S2M1.pr("seq"), value(90), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost90"),
											sum(decode(S2M1.pr("seq"), value(91), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost91"),
											sum(decode(S2M1.pr("seq"), value(92), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost92"),
											sum(decode(S2M1.pr("seq"), value(93), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost93"),
											sum(decode(S2M1.pr("seq"), value(94), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost94"),
											sum(decode(S2M1.pr("seq"), value(95), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost95"),
											sum(decode(S2M1.pr("seq"), value(96), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost96"),
											sum(decode(S2M1.pr("seq"), value(97), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost97"),
											sum(decode(S2M1.pr("seq"), value(98), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost98"),
											sum(decode(S2M1.pr("seq"), value(99), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost99"),
											sum(decode(S2M1.pr("seq"), value(100), nvl(S2W3.act_cost, value(0)), value(0))).as("act_cost100"),
											sum(nvl(S2W3.std_cost, value(0))).as("std_cost"),
											sum(decode(S2M1.pr("seq"), value(1), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost1"),
											sum(decode(S2M1.pr("seq"), value(2), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost2"),
											sum(decode(S2M1.pr("seq"), value(3), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost3"),
											sum(decode(S2M1.pr("seq"), value(4), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost4"),
											sum(decode(S2M1.pr("seq"), value(5), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost5"),
											sum(decode(S2M1.pr("seq"), value(6), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost6"),
											sum(decode(S2M1.pr("seq"), value(7), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost7"),
											sum(decode(S2M1.pr("seq"), value(8), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost8"),
											sum(decode(S2M1.pr("seq"), value(9), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost9"),
											sum(decode(S2M1.pr("seq"), value(10), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost10"),
											sum(decode(S2M1.pr("seq"), value(11), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost11"),
											sum(decode(S2M1.pr("seq"), value(12), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost12"),
											sum(decode(S2M1.pr("seq"), value(13), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost13"),
											sum(decode(S2M1.pr("seq"), value(14), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost14"),
											sum(decode(S2M1.pr("seq"), value(15), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost15"),
											sum(decode(S2M1.pr("seq"), value(16), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost16"),
											sum(decode(S2M1.pr("seq"), value(17), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost17"),
											sum(decode(S2M1.pr("seq"), value(18), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost18"),
											sum(decode(S2M1.pr("seq"), value(19), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost19"),
											sum(decode(S2M1.pr("seq"), value(20), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost20"),
											sum(decode(S2M1.pr("seq"), value(21), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost21"),
											sum(decode(S2M1.pr("seq"), value(22), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost22"),
											sum(decode(S2M1.pr("seq"), value(23), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost23"),
											sum(decode(S2M1.pr("seq"), value(24), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost24"),
											sum(decode(S2M1.pr("seq"), value(25), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost25"),
											sum(decode(S2M1.pr("seq"), value(26), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost26"),
											sum(decode(S2M1.pr("seq"), value(27), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost27"),
											sum(decode(S2M1.pr("seq"), value(28), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost28"),
											sum(decode(S2M1.pr("seq"), value(29), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost29"),
											sum(decode(S2M1.pr("seq"), value(30), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost30"),
											sum(decode(S2M1.pr("seq"), value(31), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost31"),
											sum(decode(S2M1.pr("seq"), value(32), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost32"),
											sum(decode(S2M1.pr("seq"), value(33), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost33"),
											sum(decode(S2M1.pr("seq"), value(34), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost34"),
											sum(decode(S2M1.pr("seq"), value(35), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost35"),
											sum(decode(S2M1.pr("seq"), value(36), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost36"),
											sum(decode(S2M1.pr("seq"), value(37), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost37"),
											sum(decode(S2M1.pr("seq"), value(38), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost38"),
											sum(decode(S2M1.pr("seq"), value(39), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost39"),
											sum(decode(S2M1.pr("seq"), value(40), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost40"),
											sum(decode(S2M1.pr("seq"), value(41), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost41"),
											sum(decode(S2M1.pr("seq"), value(42), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost42"),
											sum(decode(S2M1.pr("seq"), value(43), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost43"),
											sum(decode(S2M1.pr("seq"), value(44), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost44"),
											sum(decode(S2M1.pr("seq"), value(45), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost45"),
											sum(decode(S2M1.pr("seq"), value(46), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost46"),
											sum(decode(S2M1.pr("seq"), value(47), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost47"),
											sum(decode(S2M1.pr("seq"), value(48), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost48"),
											sum(decode(S2M1.pr("seq"), value(49), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost49"),
											sum(decode(S2M1.pr("seq"), value(50), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost50"),
											sum(decode(S2M1.pr("seq"), value(51), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost51"),
											sum(decode(S2M1.pr("seq"), value(52), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost52"),
											sum(decode(S2M1.pr("seq"), value(53), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost53"),
											sum(decode(S2M1.pr("seq"), value(54), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost54"),
											sum(decode(S2M1.pr("seq"), value(55), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost55"),
											sum(decode(S2M1.pr("seq"), value(56), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost56"),
											sum(decode(S2M1.pr("seq"), value(57), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost57"),
											sum(decode(S2M1.pr("seq"), value(58), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost58"),
											sum(decode(S2M1.pr("seq"), value(59), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost59"),
											sum(decode(S2M1.pr("seq"), value(60), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost60"),
											sum(decode(S2M1.pr("seq"), value(61), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost61"),
											sum(decode(S2M1.pr("seq"), value(62), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost62"),
											sum(decode(S2M1.pr("seq"), value(63), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost63"),
											sum(decode(S2M1.pr("seq"), value(64), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost64"),
											sum(decode(S2M1.pr("seq"), value(65), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost65"),
											sum(decode(S2M1.pr("seq"), value(66), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost66"),
											sum(decode(S2M1.pr("seq"), value(67), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost67"),
											sum(decode(S2M1.pr("seq"), value(68), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost68"),
											sum(decode(S2M1.pr("seq"), value(69), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost69"),
											sum(decode(S2M1.pr("seq"), value(70), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost70"),
											sum(decode(S2M1.pr("seq"), value(71), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost71"),
											sum(decode(S2M1.pr("seq"), value(72), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost72"),
											sum(decode(S2M1.pr("seq"), value(73), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost73"),
											sum(decode(S2M1.pr("seq"), value(74), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost74"),
											sum(decode(S2M1.pr("seq"), value(75), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost75"),
											sum(decode(S2M1.pr("seq"), value(76), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost76"),
											sum(decode(S2M1.pr("seq"), value(77), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost77"),
											sum(decode(S2M1.pr("seq"), value(78), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost78"),
											sum(decode(S2M1.pr("seq"), value(79), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost79"),
											sum(decode(S2M1.pr("seq"), value(80), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost80"),
											sum(decode(S2M1.pr("seq"), value(81), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost81"),
											sum(decode(S2M1.pr("seq"), value(82), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost82"),
											sum(decode(S2M1.pr("seq"), value(83), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost83"),
											sum(decode(S2M1.pr("seq"), value(84), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost84"),
											sum(decode(S2M1.pr("seq"), value(85), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost85"),
											sum(decode(S2M1.pr("seq"), value(86), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost86"),
											sum(decode(S2M1.pr("seq"), value(87), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost87"),
											sum(decode(S2M1.pr("seq"), value(88), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost88"),
											sum(decode(S2M1.pr("seq"), value(89), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost89"),
											sum(decode(S2M1.pr("seq"), value(90), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost90"),
											sum(decode(S2M1.pr("seq"), value(91), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost91"),
											sum(decode(S2M1.pr("seq"), value(92), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost92"),
											sum(decode(S2M1.pr("seq"), value(93), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost93"),
											sum(decode(S2M1.pr("seq"), value(94), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost94"),
											sum(decode(S2M1.pr("seq"), value(95), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost95"),
											sum(decode(S2M1.pr("seq"), value(96), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost96"),
											sum(decode(S2M1.pr("seq"), value(97), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost97"),
											sum(decode(S2M1.pr("seq"), value(98), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost98"),
											sum(decode(S2M1.pr("seq"), value(99), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost99"),
											sum(decode(S2M1.pr("seq"), value(100), nvl(S2W3.std_cost, value(0)), value(0))).as("std_cost100"))
									.from(S2W1.innerJoin(S2W2)
											.on(S2W1.calc_no.eq(S2W2.calc_no)
													.and(S2W1.calc_grp_cd.eq(S2W2.calc_grp_cd)))
											.leftOuterJoin(S2W3)
											.on(S2W2.calc_no.eq(S2W3.calc_no)
													.and(S2W2.calc_grp_cd.eq(S2W3.calc_grp_cd))
													.and(S2W2.top_rec_no.eq(S2W3.top_rec_no)))
											.leftOuterJoin(subQuery().select(
													S3MW2.expns_grp_seq,
													S3MW2.expns_grp_cd,
													S3MW1.expns_seq,
													S3MW1.expns_cd,
													S3MW1.var_typ,
													S3MW1.direct_typ,
													rank().over().orderBy(
															S3MW2.expns_grp_seq.asc(),
															S3MW2.expns_grp_cd.asc(),
															S3MW1.expns_seq.asc(),
															S3MW1.expns_cd.asc()).as("seq"))
													.from(S3MW1.innerJoin(S3MW2)
															.on(S3MW1.expns_grp_cd.eq(S3MW2.expns_grp_cd)))
													.view(S2M1))
											.on(S2W3.expns_cd.eq(S2M1.pr(S3MW1.expns_cd))))
									.where(value(0).eq(value(0))
											.and(S2W1.calc_no.eq(bind(Upd02_DtlR.$calc_no)))
											.and(S2W1.calc_grp_cd.eq(bind(Upd02_DtlR.$calc_grp_cd)))
											.cutoff$and(S2W2.ym.eq(bind(Upd02_DtlR.$ym))))
									.groupBy(S2W2.calc_no,
											S2W2.calc_grp_cd,
											S2W2.top_rec_no,
											S2W1.fix_flg,
											S2W2.calc_rec_typ,
											S2W2.wg_cd,
											S2W1.term,
											S2W2.ym,
											S2W2.ac_dt,
											S2W2.mng_dpt_cd,
											S2W2.itm_cd,
											S2W2.itm_sub1,
											S2W2.itm_sub2,
											S2W2.itm_sub3,
											S2W2.mfg_purc_typ,
											S2W2.lot_no,
											S2W2.sublot_no,
											S2W2.sno1,
											S2W2.sno2,
											S2W2.sno3,
											S2W2.sno4,
											S2W2.cost_io_typ,
											S2W2.ac_slip_typ,
											S2W2.ac_rsn_cd,
											S2W2.itm_mfg_inst_no,
											S2W2.mfg_act_no,
											S2W2.loc_cd,
											S2W2.str_ln_cd,
											S2W2.oper_act_no,
											S2W2.oper_cd,
											S2W2.oper_seq,
											S2W2.bp_cd,
											S2W2.stk_bp_cd,
											S2W2.po_no,
											S2W2.slo_no,
											S2W2.iv_no,
											S2W2.act_id,
											S2W2.act_id_sub,
											S2W2.alc_dpt_cd,
											S2W2.other_dpt_cd,
											S2W2.asst_typ,
											S2W2.cur_cd,
											S2W2.xrate,
											S2W2.std_xrate,
											S2W2.trd_grp,
											S2W2.act_upri,
											S2W2.std_upri,
											S2W2.per,
											S2W2.mfg_cost_ratio,
											S2W2.alc_ac_cd,
											S2W2.par_itm_cd,
											S2W2.par_itm_sub1,
											S2W2.par_itm_sub2,
											S2W2.par_itm_sub3,
											S2W2.gp_alc_cd,
											S2W2.qty,
											S2W2.amt,
											S2W2.std_qty,
											S2W2.std_amt,
											S2W2.cur_amt,
											S2W2.cur_std_amt,
											S2W2.upri_diff,
											S2W2.rate_diff,
											S2W2.so_act_amt,
											S2W2.so_std_amt)
									.view(S1L1))
							.groupBy(S1L1.pr(S2W2.calc_no),
									S1L1.pr(S2W2.calc_grp_cd),
									S1L1.pr(S2W1.fix_flg),
									S1L1.pr(S2W2.calc_rec_typ),
									S1L1.pr(S2W2.wg_cd),
									S1L1.pr(S2W1.term),
									S1L1.pr(S2W2.ym),
									S1L1.pr(S2W2.ac_dt),
									S1L1.pr(S2W2.mng_dpt_cd),
									S1L1.pr(S2W2.itm_cd),
									S1L1.pr(S2W2.itm_sub1),
									S1L1.pr(S2W2.itm_sub2),
									S1L1.pr(S2W2.itm_sub3),
									S1L1.pr(S2W2.mfg_purc_typ),
									S1L1.pr(S2W2.lot_no),
									S1L1.pr(S2W2.sublot_no),
									S1L1.pr(S2W2.sno1),
									S1L1.pr(S2W2.sno2),
									S1L1.pr(S2W2.sno3),
									S1L1.pr(S2W2.sno4),
									S1L1.pr(S2W2.cost_io_typ),
									S1L1.pr(S2W2.ac_slip_typ),
									S1L1.pr(S2W2.ac_rsn_cd),
									S1L1.pr(S2W2.itm_mfg_inst_no),
									S1L1.pr(S2W2.mfg_act_no),
									S1L1.pr(S2W2.loc_cd),
									S1L1.pr(S2W2.str_ln_cd),
									S1L1.pr(S2W2.oper_act_no),
									S1L1.pr(S2W2.oper_cd),
									S1L1.pr(S2W2.oper_seq),
									S1L1.pr(S2W2.bp_cd),
									S1L1.pr(S2W2.stk_bp_cd),
									S1L1.pr(S2W2.po_no),
									S1L1.pr(S2W2.slo_no),
									S1L1.pr(S2W2.iv_no),
									S1L1.pr(S2W2.act_id),
									S1L1.pr(S2W2.act_id_sub),
									S1L1.pr(S2W2.alc_dpt_cd),
									S1L1.pr(S2W2.other_dpt_cd),
									S1L1.pr(S2W2.asst_typ),
									S1L1.pr(S2W2.cur_cd),
									S1L1.pr(S2W2.xrate),
									S1L1.pr(S2W2.std_xrate),
									S1L1.pr(S2W2.trd_grp),
									S1L1.pr(S2W2.act_upri),
									S1L1.pr(S2W2.std_upri),
									S1L1.pr(S2W2.per),
									S1L1.pr(S2W2.mfg_cost_ratio),
									S1L1.pr(S2W2.alc_ac_cd),
									S1L1.pr(S2W2.par_itm_cd),
									S1L1.pr(S2W2.par_itm_sub1),
									S1L1.pr(S2W2.par_itm_sub2),
									S1L1.pr(S2W2.par_itm_sub3),
									S1L1.pr(S2W2.gp_alc_cd))
							.view(S0T1)
							.leftOuterJoin(S0T2).on(
									S0T1.pr(S2W2.calc_no).eq(S0T2.calc_no)
									.and(S0T1.pr(S2W2.calc_grp_cd).eq(S0T2.calc_grp_cd))
									.and(S0T1.pr(S2W2.act_id).eq(S0T2.act_sls_id))
									.and(S0T1.pr(S2W2.act_id_sub).eq(S0T2.act_sls_id_sub)))
							.leftOuterJoin(S0T3).on(
									S0T1.pr(S2W2.calc_no).eq(S0T3.calc_no)
									.and(S0T1.pr(S2W2.calc_grp_cd).eq(S0T3.calc_grp_cd))
									.and(S0T1.pr(S2W2.itm_cd).eq(S0T3.itm_cd))
									.and(S0T1.pr(S2W2.itm_sub1).eq(S0T3.itm_sub1))
									.and(S0T1.pr(S2W2.itm_sub2).eq(S0T3.itm_sub2))
									.and(S0T1.pr(S2W2.itm_sub3).eq(S0T3.itm_sub3))
									.and(S0T1.pr(S2W2.itm_mfg_inst_no).eq(S0T3.itm_mfg_inst_no))
									.and(S0T1.pr(S2W2.mfg_act_no).eq(S0T3.mfg_act_no))))
					.where(value(0).eq(value(0)));

			return subQuery;
		}
	}

	protected class MGT_ACC_SML_COST1_IF implements MGT_ACC_SML_COST_IF {
		@Override
		public String getDataRefCtl() {
			return "MGT_ACC_SML_COST1_IF";
		}
		@Override
		public String getIdS01() {
			return "MGLAL5010_MGT_ACC_SML_COST1_IF_S01";
		}
		@Override
		public String getIdS02() {
			return "MGLAL5010_MGT_ACC_SML_COST1_IF_S02";
		}
		@Override
		public String getIdS03() {
			return "MGLAL5010_MGT_ACC_SML_COST1_IF_S03";
		}
		@Override
		public String getIdI01() {
			return "MGLAL5010_MGT_ACC_SML_COST1_IF_I01";
		}
		@Override
		public String getIdU01() {
			return "MGLAL5010_MGT_ACC_SML_COST1_IF_U01";
		}
		@Override
		public String getIdU02() {
			return "MGLAL5010_MGT_ACC_SML_COST1_IF_U02";
		}
		@Override
		public String getClassPath() {
			return "mcframe.serverMG.dbc.MGT_ACC_SML_COST1_IF_R";
		}
		@Override
		public String getSequenceName() {
			return "MGS_ACC_SML_COST1_IF_DATA_LNO";
		}
		@Override
		public MCQueryApiBuilder buildQueryIfTblUpdBiNotSendFlg(String saTyp) {
			MGT_ACC_SML_COST1_IF_R r = MGT_ACC_SML_COST1_IF_R.create("T1");
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
		@Override
		public void insert(MCRow bind) {
			MGT_ACC_SML_COST1_IF_R r = MGT_ACC_SML_COST1_IF_R.create("T1");
			MCFMAGPermColumn[] cols = {
					r.data_lno, r.data_no, r.exe_sts_typ, r.data_crud_typ, r.ext_sys_cd,
					r.bi_not_send_flg, r.calc_no, r.calc_grp_cd, r.fix_flg,
					r.calc_rec_typ, r.wg_cd, r.term, r.ym, r.ac_dt, r.mng_dpt_cd,
					r.itm_cd, r.itm_sub1, r.itm_sub2, r.itm_sub3, r.mfg_purc_typ,
					r.lot_no, r.sublot_no, r.sno1, r.sno2, r.sno3, r.sno4, r.cost_io_typ,
					r.ac_slip_typ, r.ac_rsn_cd, r.itm_mfg_inst_no, r.mfg_act_no, r.loc_cd,
					r.str_ln_cd, r.oper_act_no, r.oper_cd, r.oper_seq, r.bp_cd, r.cst_cd,
					r.dlv_cd, r.dest_cd1, r.dest_cd2, r.dest_cd3, r.stk_bp_cd, r.po_no,
					r.slo_no, r.iv_no, r.act_id, r.act_id_sub, r.sls_dpt_cd, r.alc_dpt_cd,
					r.other_dpt_cd, r.sls_usr_cd, r.cost_sls_cd1, r.cost_sls_cd2,
					r.cost_sls_cd3, r.cost_sls_cd4, r.cost_sls_cd5, r.asst_typ, r.qty,
					r.inst_qty, r.base_cur_cd, r.amt, r.std_qty, r.std_amt, r.cur_cd,
					r.cur_amt, r.cur_std_amt, r.xrate, r.std_xrate, r.upri_diff,
					r.rate_diff, r.trd_grp, r.act_upri, r.std_upri, r.so_act_amt,
					r.so_std_amt, r.per, r.mfg_cost_ratio, r.alc_ac_cd, r.par_itm_cd,
					r.par_itm_sub1, r.par_itm_sub2, r.par_itm_sub3, r.gp_alc_cd,
					r.diff_qty, r.diff_wk, r.diff_up, r.diff_rt, r.diff_std, r.diff_a,
					r.diff_b, r.diff_c, r.diff_d, r.diff_e, r.mfg_inpt_cost,
					r.std_mfg_inpt_cost, r.sls_cost, r.std_sls_cost, r.sls_mng_cost,
					r.std_sls_mng_cost, r.fxd_cost, r.var_cost, r.dir_cost, r.indir_cost,
					r.act_cost, r.act_cost1, r.act_cost2, r.act_cost3, r.act_cost4,
					r.act_cost5, r.act_cost6, r.act_cost7, r.act_cost8, r.act_cost9,
					r.act_cost10, r.act_cost11, r.act_cost12, r.act_cost13, r.act_cost14,
					r.act_cost15, r.act_cost16, r.act_cost17, r.act_cost18, r.act_cost19,
					r.act_cost20, r.act_cost21, r.act_cost22, r.act_cost23, r.act_cost24,
					r.act_cost25, r.act_cost26, r.act_cost27, r.act_cost28, r.act_cost29,
					r.act_cost30, r.act_cost31, r.act_cost32, r.act_cost33, r.act_cost34,
					r.act_cost35, r.act_cost36, r.act_cost37, r.act_cost38, r.act_cost39,
					r.act_cost40, r.act_cost41, r.act_cost42, r.act_cost43, r.act_cost44,
					r.act_cost45, r.act_cost46, r.act_cost47, r.act_cost48, r.act_cost49,
					r.act_cost50, r.act_cost51, r.act_cost52, r.act_cost53, r.act_cost54,
					r.act_cost55, r.act_cost56, r.act_cost57, r.act_cost58, r.act_cost59,
					r.act_cost60, r.act_cost61, r.act_cost62, r.act_cost63, r.act_cost64,
					r.act_cost65, r.act_cost66, r.act_cost67, r.act_cost68, r.act_cost69,
					r.act_cost70, r.act_cost71, r.act_cost72, r.act_cost73, r.act_cost74,
					r.act_cost75, r.act_cost76, r.act_cost77, r.act_cost78, r.act_cost79,
					r.act_cost80, r.act_cost81, r.act_cost82, r.act_cost83, r.act_cost84,
					r.act_cost85, r.act_cost86, r.act_cost87, r.act_cost88, r.act_cost89,
					r.act_cost90, r.act_cost91, r.act_cost92, r.act_cost93, r.act_cost94,
					r.act_cost95, r.act_cost96, r.act_cost97, r.act_cost98, r.act_cost99,
					r.act_cost100, r.std_cost, r.std_cost1, r.std_cost2, r.std_cost3,
					r.std_cost4, r.std_cost5, r.std_cost6, r.std_cost7, r.std_cost8,
					r.std_cost9, r.std_cost10, r.std_cost11, r.std_cost12, r.std_cost13,
					r.std_cost14, r.std_cost15, r.std_cost16, r.std_cost17, r.std_cost18,
					r.std_cost19, r.std_cost20, r.std_cost21, r.std_cost22, r.std_cost23,
					r.std_cost24, r.std_cost25, r.std_cost26, r.std_cost27, r.std_cost28,
					r.std_cost29, r.std_cost30, r.std_cost31, r.std_cost32, r.std_cost33,
					r.std_cost34, r.std_cost35, r.std_cost36, r.std_cost37, r.std_cost38,
					r.std_cost39, r.std_cost40, r.std_cost41, r.std_cost42, r.std_cost43,
					r.std_cost44, r.std_cost45, r.std_cost46, r.std_cost47, r.std_cost48,
					r.std_cost49, r.std_cost50, r.std_cost51, r.std_cost52, r.std_cost53,
					r.std_cost54, r.std_cost55, r.std_cost56, r.std_cost57, r.std_cost58,
					r.std_cost59, r.std_cost60, r.std_cost61, r.std_cost62, r.std_cost63,
					r.std_cost64, r.std_cost65, r.std_cost66, r.std_cost67, r.std_cost68,
					r.std_cost69, r.std_cost70, r.std_cost71, r.std_cost72, r.std_cost73,
					r.std_cost74, r.std_cost75, r.std_cost76, r.std_cost77, r.std_cost78,
					r.std_cost79, r.std_cost80, r.std_cost81, r.std_cost82, r.std_cost83,
					r.std_cost84, r.std_cost85, r.std_cost86, r.std_cost87, r.std_cost88,
					r.std_cost89, r.std_cost90, r.std_cost91, r.std_cost92, r.std_cost93,
					r.std_cost94, r.std_cost95, r.std_cost96, r.std_cost97, r.std_cost98,
					r.std_cost99, r.std_cost100
			};
			sql(getIdI01()).insert(r).columns(cols)
					.query(buildInsertSubQuery(bind.getBooleanNE(Upd02_DtlR.$fix_flg)))
					.executeUpdate(bind);
		}
		@Override
		public int selectCount(MCRow bind) {
			MGT_ACC_SML_COST1_IF_R r = MGT_ACC_SML_COST1_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addCount(value("X"), "cnt");
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));

			MCRow result = MCRow.create();
			dbSelect(getIdS02(), result, builder, bind);
			return result.getNumber("cnt").intValue();
		}
		@Override
		public int updateLogKey(MCRow bind) {
			MGT_ACC_SML_COST1_IF_R r = MGT_ACC_SML_COST1_IF_R.create("T1");
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
	}

	protected class MGT_ACC_SML_COST2_IF implements MGT_ACC_SML_COST_IF {
		@Override
		public String getDataRefCtl() {
			return "MGT_ACC_SML_COST2_IF";
		}
		@Override
		public String getIdS01() {
			return "MGLAL5010_MGT_ACC_SML_COST2_IF_S01";
		}
		@Override
		public String getIdS02() {
			return "MGLAL5010_MGT_ACC_SML_COST2_IF_S02";
		}
		@Override
		public String getIdS03() {
			return "MGLAL5010_MGT_ACC_SML_COST2_IF_S03";
		}
		@Override
		public String getIdI01() {
			return "MGLAL5010_MGT_ACC_SML_COST2_IF_I01";
		}
		@Override
		public String getIdU01() {
			return "MGLAL5010_MGT_ACC_SML_COST2_IF_U01";
		}
		@Override
		public String getIdU02() {
			return "MGLAL5010_MGT_ACC_SML_COST2_IF_U02";
		}
		@Override
		public String getClassPath() {
			return "mcframe.serverMG.dbc.MGT_ACC_SML_COST2_IF_R";
		}
		@Override
		public String getSequenceName() {
			return "MGS_ACC_SML_COST2_IF_DATA_LNO";
		}
		@Override
		public MCQueryApiBuilder buildQueryIfTblUpdBiNotSendFlg(String saTyp) {
			MGT_ACC_SML_COST2_IF_R r = MGT_ACC_SML_COST2_IF_R.create("T1");
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
		@Override
		public void insert(MCRow bind) {
			MGT_ACC_SML_COST2_IF_R r = MGT_ACC_SML_COST2_IF_R.create("T1");
			MCFMAGPermColumn[] cols = {
					r.data_lno, r.data_no, r.exe_sts_typ, r.data_crud_typ, r.ext_sys_cd,
					r.bi_not_send_flg, r.calc_no, r.calc_grp_cd, r.fix_flg,
					r.calc_rec_typ, r.wg_cd, r.term, r.ym, r.ac_dt, r.mng_dpt_cd,
					r.itm_cd, r.itm_sub1, r.itm_sub2, r.itm_sub3, r.mfg_purc_typ,
					r.lot_no, r.sublot_no, r.sno1, r.sno2, r.sno3, r.sno4, r.cost_io_typ,
					r.ac_slip_typ, r.ac_rsn_cd, r.itm_mfg_inst_no, r.mfg_act_no, r.loc_cd,
					r.str_ln_cd, r.oper_act_no, r.oper_cd, r.oper_seq, r.bp_cd, r.cst_cd,
					r.dlv_cd, r.dest_cd1, r.dest_cd2, r.dest_cd3, r.stk_bp_cd, r.po_no,
					r.slo_no, r.iv_no, r.act_id, r.act_id_sub, r.sls_dpt_cd, r.alc_dpt_cd,
					r.other_dpt_cd, r.sls_usr_cd, r.cost_sls_cd1, r.cost_sls_cd2,
					r.cost_sls_cd3, r.cost_sls_cd4, r.cost_sls_cd5, r.asst_typ, r.qty,
					r.inst_qty, r.base_cur_cd, r.amt, r.std_qty, r.std_amt, r.cur_cd,
					r.cur_amt, r.cur_std_amt, r.xrate, r.std_xrate, r.upri_diff,
					r.rate_diff, r.trd_grp, r.act_upri, r.std_upri, r.so_act_amt,
					r.so_std_amt, r.per, r.mfg_cost_ratio, r.alc_ac_cd, r.par_itm_cd,
					r.par_itm_sub1, r.par_itm_sub2, r.par_itm_sub3, r.gp_alc_cd,
					r.diff_qty, r.diff_wk, r.diff_up, r.diff_rt, r.diff_std, r.diff_a,
					r.diff_b, r.diff_c, r.diff_d, r.diff_e, r.mfg_inpt_cost,
					r.std_mfg_inpt_cost, r.sls_cost, r.std_sls_cost, r.sls_mng_cost,
					r.std_sls_mng_cost, r.fxd_cost, r.var_cost, r.dir_cost, r.indir_cost,
					r.act_cost, r.act_cost1, r.act_cost2, r.act_cost3, r.act_cost4,
					r.act_cost5, r.act_cost6, r.act_cost7, r.act_cost8, r.act_cost9,
					r.act_cost10, r.act_cost11, r.act_cost12, r.act_cost13, r.act_cost14,
					r.act_cost15, r.act_cost16, r.act_cost17, r.act_cost18, r.act_cost19,
					r.act_cost20, r.act_cost21, r.act_cost22, r.act_cost23, r.act_cost24,
					r.act_cost25, r.act_cost26, r.act_cost27, r.act_cost28, r.act_cost29,
					r.act_cost30, r.act_cost31, r.act_cost32, r.act_cost33, r.act_cost34,
					r.act_cost35, r.act_cost36, r.act_cost37, r.act_cost38, r.act_cost39,
					r.act_cost40, r.act_cost41, r.act_cost42, r.act_cost43, r.act_cost44,
					r.act_cost45, r.act_cost46, r.act_cost47, r.act_cost48, r.act_cost49,
					r.act_cost50, r.act_cost51, r.act_cost52, r.act_cost53, r.act_cost54,
					r.act_cost55, r.act_cost56, r.act_cost57, r.act_cost58, r.act_cost59,
					r.act_cost60, r.act_cost61, r.act_cost62, r.act_cost63, r.act_cost64,
					r.act_cost65, r.act_cost66, r.act_cost67, r.act_cost68, r.act_cost69,
					r.act_cost70, r.act_cost71, r.act_cost72, r.act_cost73, r.act_cost74,
					r.act_cost75, r.act_cost76, r.act_cost77, r.act_cost78, r.act_cost79,
					r.act_cost80, r.act_cost81, r.act_cost82, r.act_cost83, r.act_cost84,
					r.act_cost85, r.act_cost86, r.act_cost87, r.act_cost88, r.act_cost89,
					r.act_cost90, r.act_cost91, r.act_cost92, r.act_cost93, r.act_cost94,
					r.act_cost95, r.act_cost96, r.act_cost97, r.act_cost98, r.act_cost99,
					r.act_cost100, r.std_cost, r.std_cost1, r.std_cost2, r.std_cost3,
					r.std_cost4, r.std_cost5, r.std_cost6, r.std_cost7, r.std_cost8,
					r.std_cost9, r.std_cost10, r.std_cost11, r.std_cost12, r.std_cost13,
					r.std_cost14, r.std_cost15, r.std_cost16, r.std_cost17, r.std_cost18,
					r.std_cost19, r.std_cost20, r.std_cost21, r.std_cost22, r.std_cost23,
					r.std_cost24, r.std_cost25, r.std_cost26, r.std_cost27, r.std_cost28,
					r.std_cost29, r.std_cost30, r.std_cost31, r.std_cost32, r.std_cost33,
					r.std_cost34, r.std_cost35, r.std_cost36, r.std_cost37, r.std_cost38,
					r.std_cost39, r.std_cost40, r.std_cost41, r.std_cost42, r.std_cost43,
					r.std_cost44, r.std_cost45, r.std_cost46, r.std_cost47, r.std_cost48,
					r.std_cost49, r.std_cost50, r.std_cost51, r.std_cost52, r.std_cost53,
					r.std_cost54, r.std_cost55, r.std_cost56, r.std_cost57, r.std_cost58,
					r.std_cost59, r.std_cost60, r.std_cost61, r.std_cost62, r.std_cost63,
					r.std_cost64, r.std_cost65, r.std_cost66, r.std_cost67, r.std_cost68,
					r.std_cost69, r.std_cost70, r.std_cost71, r.std_cost72, r.std_cost73,
					r.std_cost74, r.std_cost75, r.std_cost76, r.std_cost77, r.std_cost78,
					r.std_cost79, r.std_cost80, r.std_cost81, r.std_cost82, r.std_cost83,
					r.std_cost84, r.std_cost85, r.std_cost86, r.std_cost87, r.std_cost88,
					r.std_cost89, r.std_cost90, r.std_cost91, r.std_cost92, r.std_cost93,
					r.std_cost94, r.std_cost95, r.std_cost96, r.std_cost97, r.std_cost98,
					r.std_cost99, r.std_cost100
			};
			sql(getIdI01()).insert(r).columns(cols)
					.query(buildInsertSubQuery(bind.getBooleanNE(Upd02_DtlR.$fix_flg)))
					.executeUpdate(bind);
		}
		@Override
		public int selectCount(MCRow bind) {
			MGT_ACC_SML_COST2_IF_R r = MGT_ACC_SML_COST2_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addCount(value("X"), "cnt");
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));

			MCRow result = MCRow.create();
			dbSelect(getIdS02(), result, builder, bind);
			return result.getNumber("cnt").intValue();
		}
		@Override
		public int updateLogKey(MCRow bind) {
			MGT_ACC_SML_COST2_IF_R r = MGT_ACC_SML_COST2_IF_R.create("T1");
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
	}

	protected class MGT_ACC_SML_COST3_IF implements MGT_ACC_SML_COST_IF {
		@Override
		public String getDataRefCtl() {
			return "MGT_ACC_SML_COST3_IF";
		}
		@Override
		public String getIdS01() {
			return "MGLAL5010_MGT_ACC_SML_COST3_IF_S01";
		}
		@Override
		public String getIdS02() {
			return "MGLAL5010_MGT_ACC_SML_COST3_IF_S02";
		}
		@Override
		public String getIdS03() {
			return "MGLAL5010_MGT_ACC_SML_COST3_IF_S03";
		}
		@Override
		public String getIdI01() {
			return "MGLAL5010_MGT_ACC_SML_COST3_IF_I01";
		}
		@Override
		public String getIdU01() {
			return "MGLAL5010_MGT_ACC_SML_COST3_IF_U01";
		}
		@Override
		public String getIdU02() {
			return "MGLAL5010_MGT_ACC_SML_COST3_IF_U02";
		}
		@Override
		public String getClassPath() {
			return "mcframe.serverMG.dbc.MGT_ACC_SML_COST3_IF_R";
		}
		@Override
		public String getSequenceName() {
			return "MGS_ACC_SML_COST3_IF_DATA_LNO";
		}
		@Override
		public MCQueryApiBuilder buildQueryIfTblUpdBiNotSendFlg(String saTyp) {
			MGT_ACC_SML_COST3_IF_R r = MGT_ACC_SML_COST3_IF_R.create("T1");
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
		@Override
		public void insert(MCRow bind) {
			MGT_ACC_SML_COST3_IF_R r = MGT_ACC_SML_COST3_IF_R.create("T1");
			MCFMAGPermColumn[] cols = {
					r.data_lno, r.data_no, r.exe_sts_typ, r.data_crud_typ, r.ext_sys_cd,
					r.bi_not_send_flg, r.calc_no, r.calc_grp_cd, r.fix_flg,
					r.calc_rec_typ, r.wg_cd, r.term, r.ym, r.ac_dt, r.mng_dpt_cd,
					r.itm_cd, r.itm_sub1, r.itm_sub2, r.itm_sub3, r.mfg_purc_typ,
					r.lot_no, r.sublot_no, r.sno1, r.sno2, r.sno3, r.sno4, r.cost_io_typ,
					r.ac_slip_typ, r.ac_rsn_cd, r.itm_mfg_inst_no, r.mfg_act_no, r.loc_cd,
					r.str_ln_cd, r.oper_act_no, r.oper_cd, r.oper_seq, r.bp_cd, r.cst_cd,
					r.dlv_cd, r.dest_cd1, r.dest_cd2, r.dest_cd3, r.stk_bp_cd, r.po_no,
					r.slo_no, r.iv_no, r.act_id, r.act_id_sub, r.sls_dpt_cd, r.alc_dpt_cd,
					r.other_dpt_cd, r.sls_usr_cd, r.cost_sls_cd1, r.cost_sls_cd2,
					r.cost_sls_cd3, r.cost_sls_cd4, r.cost_sls_cd5, r.asst_typ, r.qty,
					r.inst_qty, r.base_cur_cd, r.amt, r.std_qty, r.std_amt, r.cur_cd,
					r.cur_amt, r.cur_std_amt, r.xrate, r.std_xrate, r.upri_diff,
					r.rate_diff, r.trd_grp, r.act_upri, r.std_upri, r.so_act_amt,
					r.so_std_amt, r.per, r.mfg_cost_ratio, r.alc_ac_cd, r.par_itm_cd,
					r.par_itm_sub1, r.par_itm_sub2, r.par_itm_sub3, r.gp_alc_cd,
					r.diff_qty, r.diff_wk, r.diff_up, r.diff_rt, r.diff_std, r.diff_a,
					r.diff_b, r.diff_c, r.diff_d, r.diff_e, r.mfg_inpt_cost,
					r.std_mfg_inpt_cost, r.sls_cost, r.std_sls_cost, r.sls_mng_cost,
					r.std_sls_mng_cost, r.fxd_cost, r.var_cost, r.dir_cost, r.indir_cost,
					r.act_cost, r.act_cost1, r.act_cost2, r.act_cost3, r.act_cost4,
					r.act_cost5, r.act_cost6, r.act_cost7, r.act_cost8, r.act_cost9,
					r.act_cost10, r.act_cost11, r.act_cost12, r.act_cost13, r.act_cost14,
					r.act_cost15, r.act_cost16, r.act_cost17, r.act_cost18, r.act_cost19,
					r.act_cost20, r.act_cost21, r.act_cost22, r.act_cost23, r.act_cost24,
					r.act_cost25, r.act_cost26, r.act_cost27, r.act_cost28, r.act_cost29,
					r.act_cost30, r.act_cost31, r.act_cost32, r.act_cost33, r.act_cost34,
					r.act_cost35, r.act_cost36, r.act_cost37, r.act_cost38, r.act_cost39,
					r.act_cost40, r.act_cost41, r.act_cost42, r.act_cost43, r.act_cost44,
					r.act_cost45, r.act_cost46, r.act_cost47, r.act_cost48, r.act_cost49,
					r.act_cost50, r.act_cost51, r.act_cost52, r.act_cost53, r.act_cost54,
					r.act_cost55, r.act_cost56, r.act_cost57, r.act_cost58, r.act_cost59,
					r.act_cost60, r.act_cost61, r.act_cost62, r.act_cost63, r.act_cost64,
					r.act_cost65, r.act_cost66, r.act_cost67, r.act_cost68, r.act_cost69,
					r.act_cost70, r.act_cost71, r.act_cost72, r.act_cost73, r.act_cost74,
					r.act_cost75, r.act_cost76, r.act_cost77, r.act_cost78, r.act_cost79,
					r.act_cost80, r.act_cost81, r.act_cost82, r.act_cost83, r.act_cost84,
					r.act_cost85, r.act_cost86, r.act_cost87, r.act_cost88, r.act_cost89,
					r.act_cost90, r.act_cost91, r.act_cost92, r.act_cost93, r.act_cost94,
					r.act_cost95, r.act_cost96, r.act_cost97, r.act_cost98, r.act_cost99,
					r.act_cost100, r.std_cost, r.std_cost1, r.std_cost2, r.std_cost3,
					r.std_cost4, r.std_cost5, r.std_cost6, r.std_cost7, r.std_cost8,
					r.std_cost9, r.std_cost10, r.std_cost11, r.std_cost12, r.std_cost13,
					r.std_cost14, r.std_cost15, r.std_cost16, r.std_cost17, r.std_cost18,
					r.std_cost19, r.std_cost20, r.std_cost21, r.std_cost22, r.std_cost23,
					r.std_cost24, r.std_cost25, r.std_cost26, r.std_cost27, r.std_cost28,
					r.std_cost29, r.std_cost30, r.std_cost31, r.std_cost32, r.std_cost33,
					r.std_cost34, r.std_cost35, r.std_cost36, r.std_cost37, r.std_cost38,
					r.std_cost39, r.std_cost40, r.std_cost41, r.std_cost42, r.std_cost43,
					r.std_cost44, r.std_cost45, r.std_cost46, r.std_cost47, r.std_cost48,
					r.std_cost49, r.std_cost50, r.std_cost51, r.std_cost52, r.std_cost53,
					r.std_cost54, r.std_cost55, r.std_cost56, r.std_cost57, r.std_cost58,
					r.std_cost59, r.std_cost60, r.std_cost61, r.std_cost62, r.std_cost63,
					r.std_cost64, r.std_cost65, r.std_cost66, r.std_cost67, r.std_cost68,
					r.std_cost69, r.std_cost70, r.std_cost71, r.std_cost72, r.std_cost73,
					r.std_cost74, r.std_cost75, r.std_cost76, r.std_cost77, r.std_cost78,
					r.std_cost79, r.std_cost80, r.std_cost81, r.std_cost82, r.std_cost83,
					r.std_cost84, r.std_cost85, r.std_cost86, r.std_cost87, r.std_cost88,
					r.std_cost89, r.std_cost90, r.std_cost91, r.std_cost92, r.std_cost93,
					r.std_cost94, r.std_cost95, r.std_cost96, r.std_cost97, r.std_cost98,
					r.std_cost99, r.std_cost100
			};
			sql(getIdI01()).insert(r).columns(cols)
					.query(buildInsertSubQuery(bind.getBooleanNE(Upd02_DtlR.$fix_flg)))
					.executeUpdate(bind);
		}
		@Override
		public int selectCount(MCRow bind) {
			MGT_ACC_SML_COST3_IF_R r = MGT_ACC_SML_COST3_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addCount(value("X"), "cnt");
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));

			MCRow result = MCRow.create();
			dbSelect(getIdS02(), result, builder, bind);
			return result.getNumber("cnt").intValue();
		}
		@Override
		public int updateLogKey(MCRow bind) {
			MGT_ACC_SML_COST3_IF_R r = MGT_ACC_SML_COST3_IF_R.create("T1");
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
	}

	protected class MGT_ACC_SML_COST4_IF implements MGT_ACC_SML_COST_IF {
		@Override
		public String getDataRefCtl() {
			return "MGT_ACC_SML_COST4_IF";
		}
		@Override
		public String getIdS01() {
			return "MGLAL5010_MGT_ACC_SML_COST4_IF_S01";
		}
		@Override
		public String getIdS02() {
			return "MGLAL5010_MGT_ACC_SML_COST4_IF_S02";
		}
		@Override
		public String getIdS03() {
			return "MGLAL5010_MGT_ACC_SML_COST4_IF_S03";
		}
		@Override
		public String getIdI01() {
			return "MGLAL5010_MGT_ACC_SML_COST4_IF_I01";
		}
		@Override
		public String getIdU01() {
			return "MGLAL5010_MGT_ACC_SML_COST4_IF_U01";
		}
		@Override
		public String getIdU02() {
			return "MGLAL5010_MGT_ACC_SML_COST4_IF_U02";
		}
		@Override
		public String getClassPath() {
			return "mcframe.serverMG.dbc.MGT_ACC_SML_COST4_IF_R";
		}
		@Override
		public String getSequenceName() {
			return "MGS_ACC_SML_COST4_IF_DATA_LNO";
		}
		@Override
		public MCQueryApiBuilder buildQueryIfTblUpdBiNotSendFlg(String saTyp) {
			MGT_ACC_SML_COST4_IF_R r = MGT_ACC_SML_COST4_IF_R.create("T1");
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
		@Override
		public void insert(MCRow bind) {
			MGT_ACC_SML_COST4_IF_R r = MGT_ACC_SML_COST4_IF_R.create("T1");
			MCFMAGPermColumn[] cols = {
					r.data_lno, r.data_no, r.exe_sts_typ, r.data_crud_typ, r.ext_sys_cd,
					r.bi_not_send_flg, r.calc_no, r.calc_grp_cd, r.fix_flg,
					r.calc_rec_typ, r.wg_cd, r.term, r.ym, r.ac_dt, r.mng_dpt_cd,
					r.itm_cd, r.itm_sub1, r.itm_sub2, r.itm_sub3, r.mfg_purc_typ,
					r.lot_no, r.sublot_no, r.sno1, r.sno2, r.sno3, r.sno4, r.cost_io_typ,
					r.ac_slip_typ, r.ac_rsn_cd, r.itm_mfg_inst_no, r.mfg_act_no, r.loc_cd,
					r.str_ln_cd, r.oper_act_no, r.oper_cd, r.oper_seq, r.bp_cd, r.cst_cd,
					r.dlv_cd, r.dest_cd1, r.dest_cd2, r.dest_cd3, r.stk_bp_cd, r.po_no,
					r.slo_no, r.iv_no, r.act_id, r.act_id_sub, r.sls_dpt_cd, r.alc_dpt_cd,
					r.other_dpt_cd, r.sls_usr_cd, r.cost_sls_cd1, r.cost_sls_cd2,
					r.cost_sls_cd3, r.cost_sls_cd4, r.cost_sls_cd5, r.asst_typ, r.qty,
					r.inst_qty, r.base_cur_cd, r.amt, r.std_qty, r.std_amt, r.cur_cd,
					r.cur_amt, r.cur_std_amt, r.xrate, r.std_xrate, r.upri_diff,
					r.rate_diff, r.trd_grp, r.act_upri, r.std_upri, r.so_act_amt,
					r.so_std_amt, r.per, r.mfg_cost_ratio, r.alc_ac_cd, r.par_itm_cd,
					r.par_itm_sub1, r.par_itm_sub2, r.par_itm_sub3, r.gp_alc_cd,
					r.diff_qty, r.diff_wk, r.diff_up, r.diff_rt, r.diff_std, r.diff_a,
					r.diff_b, r.diff_c, r.diff_d, r.diff_e, r.mfg_inpt_cost,
					r.std_mfg_inpt_cost, r.sls_cost, r.std_sls_cost, r.sls_mng_cost,
					r.std_sls_mng_cost, r.fxd_cost, r.var_cost, r.dir_cost, r.indir_cost,
					r.act_cost, r.act_cost1, r.act_cost2, r.act_cost3, r.act_cost4,
					r.act_cost5, r.act_cost6, r.act_cost7, r.act_cost8, r.act_cost9,
					r.act_cost10, r.act_cost11, r.act_cost12, r.act_cost13, r.act_cost14,
					r.act_cost15, r.act_cost16, r.act_cost17, r.act_cost18, r.act_cost19,
					r.act_cost20, r.act_cost21, r.act_cost22, r.act_cost23, r.act_cost24,
					r.act_cost25, r.act_cost26, r.act_cost27, r.act_cost28, r.act_cost29,
					r.act_cost30, r.act_cost31, r.act_cost32, r.act_cost33, r.act_cost34,
					r.act_cost35, r.act_cost36, r.act_cost37, r.act_cost38, r.act_cost39,
					r.act_cost40, r.act_cost41, r.act_cost42, r.act_cost43, r.act_cost44,
					r.act_cost45, r.act_cost46, r.act_cost47, r.act_cost48, r.act_cost49,
					r.act_cost50, r.act_cost51, r.act_cost52, r.act_cost53, r.act_cost54,
					r.act_cost55, r.act_cost56, r.act_cost57, r.act_cost58, r.act_cost59,
					r.act_cost60, r.act_cost61, r.act_cost62, r.act_cost63, r.act_cost64,
					r.act_cost65, r.act_cost66, r.act_cost67, r.act_cost68, r.act_cost69,
					r.act_cost70, r.act_cost71, r.act_cost72, r.act_cost73, r.act_cost74,
					r.act_cost75, r.act_cost76, r.act_cost77, r.act_cost78, r.act_cost79,
					r.act_cost80, r.act_cost81, r.act_cost82, r.act_cost83, r.act_cost84,
					r.act_cost85, r.act_cost86, r.act_cost87, r.act_cost88, r.act_cost89,
					r.act_cost90, r.act_cost91, r.act_cost92, r.act_cost93, r.act_cost94,
					r.act_cost95, r.act_cost96, r.act_cost97, r.act_cost98, r.act_cost99,
					r.act_cost100, r.std_cost, r.std_cost1, r.std_cost2, r.std_cost3,
					r.std_cost4, r.std_cost5, r.std_cost6, r.std_cost7, r.std_cost8,
					r.std_cost9, r.std_cost10, r.std_cost11, r.std_cost12, r.std_cost13,
					r.std_cost14, r.std_cost15, r.std_cost16, r.std_cost17, r.std_cost18,
					r.std_cost19, r.std_cost20, r.std_cost21, r.std_cost22, r.std_cost23,
					r.std_cost24, r.std_cost25, r.std_cost26, r.std_cost27, r.std_cost28,
					r.std_cost29, r.std_cost30, r.std_cost31, r.std_cost32, r.std_cost33,
					r.std_cost34, r.std_cost35, r.std_cost36, r.std_cost37, r.std_cost38,
					r.std_cost39, r.std_cost40, r.std_cost41, r.std_cost42, r.std_cost43,
					r.std_cost44, r.std_cost45, r.std_cost46, r.std_cost47, r.std_cost48,
					r.std_cost49, r.std_cost50, r.std_cost51, r.std_cost52, r.std_cost53,
					r.std_cost54, r.std_cost55, r.std_cost56, r.std_cost57, r.std_cost58,
					r.std_cost59, r.std_cost60, r.std_cost61, r.std_cost62, r.std_cost63,
					r.std_cost64, r.std_cost65, r.std_cost66, r.std_cost67, r.std_cost68,
					r.std_cost69, r.std_cost70, r.std_cost71, r.std_cost72, r.std_cost73,
					r.std_cost74, r.std_cost75, r.std_cost76, r.std_cost77, r.std_cost78,
					r.std_cost79, r.std_cost80, r.std_cost81, r.std_cost82, r.std_cost83,
					r.std_cost84, r.std_cost85, r.std_cost86, r.std_cost87, r.std_cost88,
					r.std_cost89, r.std_cost90, r.std_cost91, r.std_cost92, r.std_cost93,
					r.std_cost94, r.std_cost95, r.std_cost96, r.std_cost97, r.std_cost98,
					r.std_cost99, r.std_cost100
			};
			sql(getIdI01()).insert(r).columns(cols)
					.query(buildInsertSubQuery(bind.getBooleanNE(Upd02_DtlR.$fix_flg)))
					.executeUpdate(bind);
		}
		@Override
		public int selectCount(MCRow bind) {
			MGT_ACC_SML_COST4_IF_R r = MGT_ACC_SML_COST4_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addCount(value("X"), "cnt");
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));

			MCRow result = MCRow.create();
			dbSelect(getIdS02(), result, builder, bind);
			return result.getNumber("cnt").intValue();
		}
		@Override
		public int updateLogKey(MCRow bind) {
			MGT_ACC_SML_COST4_IF_R r = MGT_ACC_SML_COST4_IF_R.create("T1");
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
	}

	protected class MGT_ACC_SML_COST5_IF implements MGT_ACC_SML_COST_IF {
		@Override
		public String getDataRefCtl() {
			return "MGT_ACC_SML_COST5_IF";
		}
		@Override
		public String getIdS01() {
			return "MGLAL5010_MGT_ACC_SML_COST5_IF_S01";
		}
		@Override
		public String getIdS02() {
			return "MGLAL5010_MGT_ACC_SML_COST5_IF_S02";
		}
		@Override
		public String getIdS03() {
			return "MGLAL5010_MGT_ACC_SML_COST5_IF_S03";
		}
		@Override
		public String getIdI01() {
			return "MGLAL5010_MGT_ACC_SML_COST5_IF_I01";
		}
		@Override
		public String getIdU01() {
			return "MGLAL5010_MGT_ACC_SML_COST5_IF_U01";
		}
		@Override
		public String getIdU02() {
			return "MGLAL5010_MGT_ACC_SML_COST5_IF_U02";
		}
		@Override
		public String getClassPath() {
			return "mcframe.serverMG.dbc.MGT_ACC_SML_COST5_IF_R";
		}
		@Override
		public String getSequenceName() {
			return "MGS_ACC_SML_COST5_IF_DATA_LNO";
		}
		@Override
		public MCQueryApiBuilder buildQueryIfTblUpdBiNotSendFlg(String saTyp) {
			MGT_ACC_SML_COST5_IF_R r = MGT_ACC_SML_COST5_IF_R.create("T1");
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
		@Override
		public void insert(MCRow bind) {
			MGT_ACC_SML_COST5_IF_R r = MGT_ACC_SML_COST5_IF_R.create("T1");
			MCFMAGPermColumn[] cols = {
					r.data_lno, r.data_no, r.exe_sts_typ, r.data_crud_typ, r.ext_sys_cd,
					r.bi_not_send_flg, r.calc_no, r.calc_grp_cd, r.fix_flg,
					r.calc_rec_typ, r.wg_cd, r.term, r.ym, r.ac_dt, r.mng_dpt_cd,
					r.itm_cd, r.itm_sub1, r.itm_sub2, r.itm_sub3, r.mfg_purc_typ,
					r.lot_no, r.sublot_no, r.sno1, r.sno2, r.sno3, r.sno4, r.cost_io_typ,
					r.ac_slip_typ, r.ac_rsn_cd, r.itm_mfg_inst_no, r.mfg_act_no, r.loc_cd,
					r.str_ln_cd, r.oper_act_no, r.oper_cd, r.oper_seq, r.bp_cd, r.cst_cd,
					r.dlv_cd, r.dest_cd1, r.dest_cd2, r.dest_cd3, r.stk_bp_cd, r.po_no,
					r.slo_no, r.iv_no, r.act_id, r.act_id_sub, r.sls_dpt_cd, r.alc_dpt_cd,
					r.other_dpt_cd, r.sls_usr_cd, r.cost_sls_cd1, r.cost_sls_cd2,
					r.cost_sls_cd3, r.cost_sls_cd4, r.cost_sls_cd5, r.asst_typ, r.qty,
					r.inst_qty, r.base_cur_cd, r.amt, r.std_qty, r.std_amt, r.cur_cd,
					r.cur_amt, r.cur_std_amt, r.xrate, r.std_xrate, r.upri_diff,
					r.rate_diff, r.trd_grp, r.act_upri, r.std_upri, r.so_act_amt,
					r.so_std_amt, r.per, r.mfg_cost_ratio, r.alc_ac_cd, r.par_itm_cd,
					r.par_itm_sub1, r.par_itm_sub2, r.par_itm_sub3, r.gp_alc_cd,
					r.diff_qty, r.diff_wk, r.diff_up, r.diff_rt, r.diff_std, r.diff_a,
					r.diff_b, r.diff_c, r.diff_d, r.diff_e, r.mfg_inpt_cost,
					r.std_mfg_inpt_cost, r.sls_cost, r.std_sls_cost, r.sls_mng_cost,
					r.std_sls_mng_cost, r.fxd_cost, r.var_cost, r.dir_cost, r.indir_cost,
					r.act_cost, r.act_cost1, r.act_cost2, r.act_cost3, r.act_cost4,
					r.act_cost5, r.act_cost6, r.act_cost7, r.act_cost8, r.act_cost9,
					r.act_cost10, r.act_cost11, r.act_cost12, r.act_cost13, r.act_cost14,
					r.act_cost15, r.act_cost16, r.act_cost17, r.act_cost18, r.act_cost19,
					r.act_cost20, r.act_cost21, r.act_cost22, r.act_cost23, r.act_cost24,
					r.act_cost25, r.act_cost26, r.act_cost27, r.act_cost28, r.act_cost29,
					r.act_cost30, r.act_cost31, r.act_cost32, r.act_cost33, r.act_cost34,
					r.act_cost35, r.act_cost36, r.act_cost37, r.act_cost38, r.act_cost39,
					r.act_cost40, r.act_cost41, r.act_cost42, r.act_cost43, r.act_cost44,
					r.act_cost45, r.act_cost46, r.act_cost47, r.act_cost48, r.act_cost49,
					r.act_cost50, r.act_cost51, r.act_cost52, r.act_cost53, r.act_cost54,
					r.act_cost55, r.act_cost56, r.act_cost57, r.act_cost58, r.act_cost59,
					r.act_cost60, r.act_cost61, r.act_cost62, r.act_cost63, r.act_cost64,
					r.act_cost65, r.act_cost66, r.act_cost67, r.act_cost68, r.act_cost69,
					r.act_cost70, r.act_cost71, r.act_cost72, r.act_cost73, r.act_cost74,
					r.act_cost75, r.act_cost76, r.act_cost77, r.act_cost78, r.act_cost79,
					r.act_cost80, r.act_cost81, r.act_cost82, r.act_cost83, r.act_cost84,
					r.act_cost85, r.act_cost86, r.act_cost87, r.act_cost88, r.act_cost89,
					r.act_cost90, r.act_cost91, r.act_cost92, r.act_cost93, r.act_cost94,
					r.act_cost95, r.act_cost96, r.act_cost97, r.act_cost98, r.act_cost99,
					r.act_cost100, r.std_cost, r.std_cost1, r.std_cost2, r.std_cost3,
					r.std_cost4, r.std_cost5, r.std_cost6, r.std_cost7, r.std_cost8,
					r.std_cost9, r.std_cost10, r.std_cost11, r.std_cost12, r.std_cost13,
					r.std_cost14, r.std_cost15, r.std_cost16, r.std_cost17, r.std_cost18,
					r.std_cost19, r.std_cost20, r.std_cost21, r.std_cost22, r.std_cost23,
					r.std_cost24, r.std_cost25, r.std_cost26, r.std_cost27, r.std_cost28,
					r.std_cost29, r.std_cost30, r.std_cost31, r.std_cost32, r.std_cost33,
					r.std_cost34, r.std_cost35, r.std_cost36, r.std_cost37, r.std_cost38,
					r.std_cost39, r.std_cost40, r.std_cost41, r.std_cost42, r.std_cost43,
					r.std_cost44, r.std_cost45, r.std_cost46, r.std_cost47, r.std_cost48,
					r.std_cost49, r.std_cost50, r.std_cost51, r.std_cost52, r.std_cost53,
					r.std_cost54, r.std_cost55, r.std_cost56, r.std_cost57, r.std_cost58,
					r.std_cost59, r.std_cost60, r.std_cost61, r.std_cost62, r.std_cost63,
					r.std_cost64, r.std_cost65, r.std_cost66, r.std_cost67, r.std_cost68,
					r.std_cost69, r.std_cost70, r.std_cost71, r.std_cost72, r.std_cost73,
					r.std_cost74, r.std_cost75, r.std_cost76, r.std_cost77, r.std_cost78,
					r.std_cost79, r.std_cost80, r.std_cost81, r.std_cost82, r.std_cost83,
					r.std_cost84, r.std_cost85, r.std_cost86, r.std_cost87, r.std_cost88,
					r.std_cost89, r.std_cost90, r.std_cost91, r.std_cost92, r.std_cost93,
					r.std_cost94, r.std_cost95, r.std_cost96, r.std_cost97, r.std_cost98,
					r.std_cost99, r.std_cost100
			};
			sql(getIdI01()).insert(r).columns(cols)
					.query(buildInsertSubQuery(bind.getBooleanNE(Upd02_DtlR.$fix_flg)))
					.executeUpdate(bind);
		}
		@Override
		public int selectCount(MCRow bind) {
			MGT_ACC_SML_COST5_IF_R r = MGT_ACC_SML_COST5_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addCount(value("X"), "cnt");
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));

			MCRow result = MCRow.create();
			dbSelect(getIdS02(), result, builder, bind);
			return result.getNumber("cnt").intValue();
		}
		@Override
		public int updateLogKey(MCRow bind) {
			MGT_ACC_SML_COST5_IF_R r = MGT_ACC_SML_COST5_IF_R.create("T1");
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
	}

	//FMCB CUSTOM END
}