package mcframe.serverMSLC.MSLCL5060;

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
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLCL_NonMovStkSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLCL_NonMovStkSendIfService_MC extends MSLCL_NonMovStkSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルの登録処理を実行するオペレーションの基底クラスの実装<br>
	 */
	public class Upd01 extends MSLCL_NonMovStkSendIfService_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void chkUpItemsIndividual() {
			// 必須チェック
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
					Upd01_DtlR.$non_mov_base_days, Upd01_DtlR.$non_mov_cmp_dt
			};

			for (String col : cols) {
				msgL.addAll(check(up0(), col, new FXUCL_RequiredValidater()));
			}

			// IF処理区分指定値チェック
			if (!MAC_IF_PROC_TYP.isNON_MOV_STK_SEND(up0().if_proc_typ())) {
				msgL.add(new MCMessage(MSLCL0001, up0().if_proc_typ()));
			}

			// メッセージプールにメッセージ追加
			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}

		@Override
		protected void setUpd02Operation() {
			// オペレーション設定
			super._upd02ModuleId = "MS";
			super._upd02LogicId = "MSLCL5060";
			super._upd02OperationId = "Upd02";
		}
		
		@Override
		protected void writeStartLog() {
			MCMessagePool.add(MSLCL0025);
		}
		
		@Override
		protected void writeEndLog() {
			MCMessagePool.add(MSLCL0026);
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * ＩＦテーブルにレコードを登録する処理の流れを定義したオペレーションの基底クラスの実装<br>
	 */
	public class Upd02 extends MSLCL_NonMovStkSendIfService_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void writeStartLog() {
			// 開始ログを出力する
			writeLogForStartLog(MSLCL0012, getCo().co_cd(), up0().if_proc_typ());
		}

		@Override
		protected void setup() {
			// 1回のフェッチで何件のレコードを取得するか
			super._fetchSize = MCConst.app.getInteger("MS.MSLCL5060.fetch_size", 1000);
			// 1スレッド当たり何件のレコードを処理するか
			super._threadRecordCnt = MCConst.app.getInteger("MS.MSLCL5060.thread_record_cnt", 1000);

			// DBCクラスパス設定
			super._ifTblContainerClassPath = "mcframe.serverMS.dbc.MST_NON_MOV_STK_IF_R";
			super._trnTblContainerClassPath = "mcframe.serverMS.dbc.MST_NON_MOV_STK_R";
		}

		/**
		 * IFテーブルのＢＩ送信対象外ＦＬＧをtrueに更新を行う処理
		 */
		@Override
		protected boolean updBINotSendFlg() {
			// 滞留在庫情報送信IFサービスではupdBINotSendFlg()は不要なので、中身を空にしてオーバーライド
			return false;
		}

		/**
		 * IFテーブルにレコードを登録する処理に必要なデータをセット
		 */
		@Override
		protected boolean insRecordToIFTable() {
			// バインド値設定
			MCRow bind = MCRow.create();
			bind.setDateNE(Upd02_DtlR.$non_mov_stk_tm, MCDate.now());
			bind.setDateNE(Upd02_DtlR.$non_mov_cmp_dt, up0().non_mov_cmp_dt());
			bind.setNumberNE(Upd02_DtlR.$non_mov_base_days, up0().non_mov_base_days());
			bind.setStringNE(MAM_CO_R.$stk_std_upri_typ, getCo().stk_std_upri_typ());
			bind.setStringNE(MAM_CO_R.$base_cur_cd, getCo().base_cur_cd());

			//SQL設定
			MCInsert q = crtSql();

			// 対象データ抽出
			q.executeUpdate(bind);

			int rsltCnt = selectCount();
			int updCnt = updateLogKey();
			super._rsltTotalNum = rsltCnt;
			super._rsltOkNum = updCnt;
			super._rsltErrNum = rsltCnt - updCnt;
			if (rsltCnt != updCnt) {
				writeLogForProcessLog(MSLCL0014);
			}
			
			return false;
		}

		public int selectCount() {
			MST_NON_MOV_STK_IF_R r = MST_NON_MOV_STK_IF_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addCount(value("X"), "cnt");
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));

			MCRow bind = MCRow.create();
			bind.setNumberNE(Upd02_DtlR.$data_no, up0().data_no());

			MCRow result = MCRow.create();
			dbSelect("MSLCL5060_MST_NON_MOV_STK_IF_S01", result, builder, bind);
			return result.getNumber("cnt").intValue();
		}

		protected int updateLogKey() {
			MST_NON_MOV_STK_IF_R r = MST_NON_MOV_STK_IF_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(r);
			builder.addWhereWithAnd(r.data_no.eq(bind(Upd02_DtlR.$data_no)));
			// select用
			builder.setSelect(r.data_lno);
			// update用
			builder.setSet(r.batch_log_no);
			builder.addSet(r.log_sub_key1);
			builder.addSet(r.log_sub_key2);

			MCRow bind = MCRow.create();
			bind.setNumberNE(Upd02_DtlR.$data_no, up0().data_no());

			return executeUpdateLogKey(builder, bind);
		}

		protected int executeUpdateLogKey(MCQueryApiBuilder builder, MCRow bind) {
			final String sqlidS = "MSLCL5060_MST_NON_MOV_STK_IF_S02";
			MCCursor<MCRow> cursor = MCTransactionManager.dbTran().statement().openCursor(
					sqlidS, builder.buildSelect(sqlidS).toString(), bind, null, MCList.create(MCRow.class), MCRow.class);

			int fetchSize = MCConst.app.getInteger("MS.MSLCL5060.fetch_size", 1000);
			int updatedRecCnt = 0;
			try {
				while (cursor.dbFetch(fetchSize) > 0) {
					MCList<MCRow> rsltL = cursor.getList();
					logger().setLogKey(rsltL, "batch_log_no", "log_sub_key1", "log_sub_key2");
					dbUpdateKey("MSLCL5060_MST_NON_MOV_STK_IF_U01", rsltL, builder);
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

		@Override
		protected void writeEndLog() {
			if (super._rsltErrNum == 0 && !super._exceptionFlg) {
				if (_rsltTotalNum == 0) {
					writeLogForProcessLog(MAUDL0008);
				}
			}

			writeLogForEndLog(MSLCL0013, getCo().co_cd(), super._rsltTotalNum, super._rsltOkNum, super._rsltErrNum);
		}

		protected MCInsert crtSql() {
			MST_NON_MOV_STK_IF_R S0 = MST_NON_MOV_STK_IF_R.create();
			MCTempView S0T = createTempView("T");
			MAM_ITM_R S0M1 = MAM_ITM_R.create("M1");
			MAM_LOC_R S0M2 = MAM_LOC_R.create("M2");
			MCTempView S1V = createTempView("V");
			MST_IO_ACT_R S2T = MST_IO_ACT_R.create("T");
			MST_IO_ACT_R S3T = MST_IO_ACT_R.create("T");
			MSC_STK_ANLY_CTL_R S3CTL = MSC_STK_ANLY_CTL_R.create("CTL");
			MST_IO_ACT_R S4T = MST_IO_ACT_R.create("T");
			MSC_STK_ANLY_CTL_R S4CTL = MSC_STK_ANLY_CTL_R.create("CTL");
			MST_IO_ACT_R S5T1 = MST_IO_ACT_R.create("T1");
			MST_NON_MOV_STK_R S6T = MST_NON_MOV_STK_R.create("T");

			MCInsert q = sql("MSLCL5060_MST_NON_MOV_STK_IF_I01")
					.insert(S0)
					.columns(
							S0.data_lno,
							S0.data_no,
							S0.exe_sts_typ,
							S0.data_crud_typ,
							S0.ext_sys_cd,
							S0.itm_cd,
							S0.itm_sub1,
							S0.itm_sub2,
							S0.itm_sub3,
							S0.loc_cd,
							S0.str_ln_cd,
							S0.stk_arrv_bp_cd,
							S0.lot_no,
							S0.sublot_no,
							S0.sno1,
							S0.sno2,
							S0.sno3,
							S0.sno4,
							S0.pack_unit_cd,
							S0.gd_cd,
							S0.in_xfr_typ,
							S0.quality_typ,
							S0.asst_typ,
							S0.stk_insp_typ,
							S0.stk_id_typ,
							S0.stk_bp_cd,
							S0.pack_unit_qty,
							S0.base_unit_qty,
							S0.base_unit_cd,
							S0.std_unit_cost,
							S0.stk_amt,
							S0.base_cur_cd,
							S0.non_mov_base_dt,
							S0.non_mov_days,
							S0.non_mov_base_days,
							S0.non_mov_cmp_dt,
							S0.non_mov_stk_tm,
							S0.sub_char1,
							S0.sub_char2,
							S0.sub_char3
							)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MSC_NUM_SYS_TYP.NONMOVSTKIF.value())).as("data_lno"),
							value(up0().data_no()).as(MST_NON_MOV_STK_IF_R.$data_no),
							value(MAC_EXE_STS_TYP.NOT_EXE.value()).as(MST_NON_MOV_STK_IF_R.$exe_sts_typ),
							value(MAC_DATA_CRUD_TYP.CRT.value()).as(MST_NON_MOV_STK_IF_R.$data_crud_typ),
							value(up0().ext_sys_cd()).as(MST_NON_MOV_STK_IF_R.$ext_sys_cd),
							S0T.pr(S2T.itm_cd),
							S0T.pr(S2T.itm_sub1),
							S0T.pr(S2T.itm_sub2),
							S0T.pr(S2T.itm_sub3),
							S0T.pr(S2T.loc_cd),
							S0T.pr(S2T.str_ln_cd),
							S0T.pr(S2T.stk_arrv_bp_cd),
							S0T.pr(S2T.lot_no),
							S0T.pr(S2T.sublot_no),
							S0T.pr(S2T.sno1),
							S0T.pr(S2T.sno2),
							S0T.pr(S2T.sno3),
							S0T.pr(S2T.sno4),
							S0T.pr(S2T.pack_unit_cd),
							S0T.pr(S2T.gd_cd),
							S0T.pr(S2T.in_xfr_typ),
							S0T.pr(S2T.quality_typ),
							S0T.pr(S2T.asst_typ),
							S0T.pr(S2T.stk_insp_typ),
							S0T.pr(S2T.stk_id_typ),
							S0T.pr(S2T.stk_bp_cd),
							nvl(
								S0T.pr("io_act_pack_unit_qty"),
								S0T.pr("non_mov_stk_pack_unit_qty")
							).as("pack_unit_qty"),
							nvl(
								S0T.pr("io_act_base_unit_qty"),
								S0T.pr("non_mov_stk_base_unit_qty")
							).as("base_unit_qty"),
							S0M1.unit_cd.as("base_unit_cd"),
							MAPA_STD_COST$F_GET_STD_UPRI(
								S0T.pr(S2T.itm_cd),
								S0T.pr(S2T.itm_sub1),
								S0T.pr(S2T.itm_sub2),
								S0T.pr(S2T.itm_sub3),
								bind("non_mov_cmp_dt"),
								S0M2.wg_cd,
								bind("stk_std_upri_typ")
							).as("std_unit_cost"),
							nvl2(
								S0T.pr("io_act_pack_unit_qty"),
								MAPA_STD_COST$F_GET_STD_AMT(
									S0T.pr(S2T.itm_cd),
									S0T.pr(S2T.itm_sub1),
									S0T.pr(S2T.itm_sub2),
									S0T.pr(S2T.itm_sub3),
									bind("non_mov_cmp_dt"),
									S0M2.wg_cd,
									S0T.pr("io_act_base_unit_qty"),
									bind("stk_std_upri_typ")
								),
								MAPA_STD_COST$F_GET_STD_AMT(
									S0T.pr(S2T.itm_cd),
									S0T.pr(S2T.itm_sub1),
									S0T.pr(S2T.itm_sub2),
									S0T.pr(S2T.itm_sub3),
									bind("non_mov_cmp_dt"),
									S0M2.wg_cd,
									S0T.pr("non_mov_stk_base_unit_qty"),
									bind("stk_std_upri_typ")
								)
							).as("stk_amt"),
							bind("base_cur_cd"),
							nvl(
								S0T.pr("non_mov_base_dt"),
								bind("non_mov_cmp_dt").subtractDays(bind("non_mov_base_days"))
							).as("non_mov_base_dt"),
							bracket(
								cases()
									.when(S0T.pr("non_mov_base_dt").isNull())
										.then(bind("non_mov_base_days"))
									.when(
										bind("non_mov_cmp_dt").subtractDate(S0T.pr("non_mov_base_dt")).gt(bind("non_mov_base_days"))
									)
										.then(bind("non_mov_base_days"))
									.otherwise(
										bind("non_mov_cmp_dt").subtractDate(S0T.pr("non_mov_base_dt"))
									)
							).as("non_mov_days"),
							bind("non_mov_base_days").as("non_mov_base_days"),
							bind("non_mov_cmp_dt").as("non_mov_cmp_dt"),
							bind("non_mov_stk_tm").as("non_mov_stk_tm"),
							S0T.pr("sub_char1"),
							S0T.pr("sub_char2"),
							S0T.pr("sub_char3")
						)
						.from(
							subQuery()
							.select(
								S1V.pr(S2T.itm_cd),
								S1V.pr(S2T.itm_sub1),
								S1V.pr(S2T.itm_sub2),
								S1V.pr(S2T.itm_sub3),
								S1V.pr(S2T.loc_cd),
								S1V.pr(S2T.str_ln_cd),
								S1V.pr(S2T.stk_arrv_bp_cd),
								S1V.pr(S2T.lot_no),
								S1V.pr(S2T.sublot_no),
								S1V.pr(S2T.sno1),
								S1V.pr(S2T.sno2),
								S1V.pr(S2T.sno3),
								S1V.pr(S2T.sno4),
								S1V.pr(S2T.pack_unit_cd),
								S1V.pr(S2T.gd_cd),
								S1V.pr(S2T.in_xfr_typ),
								S1V.pr(S2T.quality_typ),
								S1V.pr(S2T.asst_typ),
								S1V.pr(S2T.stk_insp_typ),
								S1V.pr(S2T.stk_id_typ),
								S1V.pr(S2T.stk_bp_cd),
								sum(S1V.pr("io_act_pack_unit_qty")).as("io_act_pack_unit_qty"),
								sum(S1V.pr("io_act_base_unit_qty")).as("io_act_base_unit_qty"),
								sum(S1V.pr("non_mov_stk_pack_unit_qty")).as("non_mov_stk_pack_unit_qty"),
								sum(S1V.pr("non_mov_stk_base_unit_qty")).as("non_mov_stk_base_unit_qty"),
								max(S1V.pr("non_mov_base_dt")).as("non_mov_base_dt"),
								S1V.pr("sub_char1"),
								S1V.pr("sub_char2"),
								S1V.pr("sub_char3")
							)
							.from(
								subQuery()
								.select(
									S2T.itm_cd,
									S2T.itm_sub1,
									S2T.itm_sub2,
									S2T.itm_sub3,
									S2T.loc_cd,
									S2T.str_ln_cd,
									S2T.stk_arrv_bp_cd,
									S2T.lot_no,
									S2T.sublot_no,
									S2T.sno1,
									S2T.sno2,
									S2T.sno3,
									S2T.sno4,
									S2T.pack_unit_cd,
									S2T.gd_cd,
									S2T.in_xfr_typ,
									S2T.quality_typ,
									S2T.asst_typ,
									S2T.stk_insp_typ,
									S2T.stk_id_typ,
									S2T.stk_bp_cd,
									sum(
										decode(
											S2T.io_typ,
											value(MSC_IO_TYP.GR.value()),
											S2T.pack_unit_qty,
											value(0)
										)
									).subtract(
										sum(
											decode(
												S2T.io_typ,
												value(MSC_IO_TYP.GI.value()),
												S2T.pack_unit_qty,
												value(0)
											)
										)
									).as("io_act_pack_unit_qty"),
									sum(
										decode(
											S2T.io_typ,
											value(MSC_IO_TYP.GR.value()),
											S2T.base_unit_qty,
											value(0)
										)
									).subtract(
										sum(
											decode(
												S2T.io_typ,
												value(MSC_IO_TYP.GI.value()),
												S2T.base_unit_qty,
												value(0)
											)
										)
									).as("io_act_base_unit_qty"),
									nullValue().as("non_mov_stk_pack_unit_qty"),
									nullValue().as("non_mov_stk_base_unit_qty"),
									nullValue().as("non_mov_base_dt"),
									nullValue().as("sub_char1"),
									nullValue().as("sub_char2"),
									nullValue().as("sub_char3")
								)
								.from(S2T)
								.where(
									value(0).eq(value(0))
									.and(S2T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.and(S2T.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
									.and(S2T.trn_typ.neq(value(MSC_TRN_TYP.RCV_ACT.value())))
									.and(S2T.trn_typ.neq(value(MSC_TRN_TYP.PAY_SCHD.value())))
									.and(S2T.io_act_typ.neq(value(MSC_IO_ACT_TYP.INPT_SLF.value())))
									.and(S2T.io_act_typ.neq(value(MSC_IO_ACT_TYP.LOSS_SLF.value())))
									.and(
										S2T.act_tm.lt(bind("non_mov_cmp_dt").addDays(value(MCNumber.ONE)))
									)
								)
								.groupBy(
									S2T.itm_cd,
									S2T.itm_sub1,
									S2T.itm_sub2,
									S2T.itm_sub3,
									S2T.loc_cd,
									S2T.str_ln_cd,
									S2T.stk_arrv_bp_cd,
									S2T.lot_no,
									S2T.sublot_no,
									S2T.sno1,
									S2T.sno2,
									S2T.sno3,
									S2T.sno4,
									S2T.pack_unit_cd,
									S2T.gd_cd,
									S2T.in_xfr_typ,
									S2T.quality_typ,
									S2T.asst_typ,
									S2T.stk_insp_typ,
									S2T.stk_id_typ,
									S2T.stk_bp_cd
								)
								.unionAll(
									subQuery()
									.select(
										S3T.itm_cd,
										S3T.itm_sub1,
										S3T.itm_sub2,
										S3T.itm_sub3,
										S3T.loc_cd,
										S3T.str_ln_cd,
										S3T.stk_arrv_bp_cd,
										S3T.lot_no,
										S3T.sublot_no,
										S3T.sno1,
										S3T.sno2,
										S3T.sno3,
										S3T.sno4,
										S3T.pack_unit_cd,
										S3T.gd_cd,
										S3T.in_xfr_typ,
										S3T.quality_typ,
										S3T.asst_typ,
										S3T.stk_insp_typ,
										S3T.stk_id_typ,
										S3T.stk_bp_cd,
										nullValue().as("io_act_pack_unit_qty"),
										nullValue().as("io_act_base_unit_qty"),
										nullValue().as("non_mov_stk_pack_unit_qty"),
										nullValue().as("non_mov_stk_base_unit_qty"),
										trunc(max(S3T.act_tm), MCDateFmt.DD).as("non_mov_base_dt"),
										nullValue().as("sub_char1"),
										nullValue().as("sub_char2"),
										nullValue().as("sub_char3")
									)
									.from(
										S3T
										.innerJoin(S3CTL).on(
											S3CTL.ctl_tgt_typ.eq(value(MSC_CTL_TGT_TYP.NON_MOV.value()))
											.and(S3CTL.io_act_typ.eq(S3T.io_act_typ))
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S3T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										.and(S3T.io_typ.eq(value(MSC_IO_TYP.GI.value())))
										.and(S3T.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
										.and(
											S3T.act_tm.gte(bind("non_mov_cmp_dt").subtractDays(bind("non_mov_base_days")))
										)
										.and(
											S3T.act_tm.lt(bind("non_mov_cmp_dt").addDays(value(MCNumber.ONE)))
										)
									)
									.groupBy(
										S3T.itm_cd,
										S3T.itm_sub1,
										S3T.itm_sub2,
										S3T.itm_sub3,
										S3T.loc_cd,
										S3T.str_ln_cd,
										S3T.stk_arrv_bp_cd,
										S3T.lot_no,
										S3T.sublot_no,
										S3T.sno1,
										S3T.sno2,
										S3T.sno3,
										S3T.sno4,
										S3T.pack_unit_cd,
										S3T.gd_cd,
										S3T.in_xfr_typ,
										S3T.quality_typ,
										S3T.asst_typ,
										S3T.stk_insp_typ,
										S3T.stk_id_typ,
										S3T.stk_bp_cd
									)
									.unionAll(
										subQuery()
										.select(
											S4T.itm_cd,
											S4T.itm_sub1,
											S4T.itm_sub2,
											S4T.itm_sub3,
											S4T.loc_cd,
											S4T.str_ln_cd,
											S4T.stk_arrv_bp_cd,
											S4T.lot_no,
											S4T.sublot_no,
											S4T.sno1,
											S4T.sno2,
											S4T.sno3,
											S4T.sno4,
											S4T.pack_unit_cd,
											S4T.gd_cd,
											S4T.in_xfr_typ,
											S4T.quality_typ,
											S4T.asst_typ,
											S4T.stk_insp_typ,
											S4T.stk_id_typ,
											S4T.stk_bp_cd,
											nullValue().as("io_act_pack_unit_qty"),
											nullValue().as("io_act_base_unit_qty"),
											nullValue().as("non_mov_stk_pack_unit_qty"),
											nullValue().as("non_mov_stk_base_unit_qty"),
											trunc(max(S4T.act_tm), MCDateFmt.DD).as("non_mov_base_dt"),
											nullValue().as("sub_char1"),
											nullValue().as("sub_char2"),
											nullValue().as("sub_char3")
										)
										.from(
											S4T
											.innerJoin(S4CTL).on(
												S4CTL.ctl_tgt_typ.eq(value(MSC_CTL_TGT_TYP.NON_MOV.value()))
												.and(S4CTL.io_act_typ.eq(S4T.io_act_typ))
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S4T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S4T.io_typ.eq(value(MSC_IO_TYP.GR.value())))
											.and(S4T.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
											.and(
												S4T.act_tm.gte(bind("non_mov_cmp_dt").subtractDays(bind("non_mov_base_days")))
											)
											.and(
												S4T.act_tm.lt(bind("non_mov_cmp_dt").addDays(value(MCNumber.ONE)))
											)
											.and(
												subQuery()
												.select(
													nvl(
														sum(
															decode(
																S5T1.io_typ,
																value(MSC_IO_TYP.GR.value()),
																S5T1.base_unit_qty,
																value(0)
															)
														).subtract(
															sum(
																decode(
																	S5T1.io_typ,
																	value(MSC_IO_TYP.GI.value()),
																	S5T1.base_unit_qty,
																	value(0)
																)
															)
														),
														value(0)
													)
												)
												.from(S5T1)
												.where(
													value(0).eq(value(0))
													.and(
														S5T1.act_tm.lt(S4T.act_tm)
													)
													.and(S5T1.itm_cd.eq(S4T.itm_cd))
													.and(S5T1.itm_sub1.eq(S4T.itm_sub1))
													.and(S5T1.itm_sub2.eq(S4T.itm_sub2))
													.and(S5T1.itm_sub3.eq(S4T.itm_sub3))
													.and(S5T1.stk_mng_typ.eq(S4T.stk_mng_typ))
													.and(S5T1.loc_cd.eq(S4T.loc_cd))
													.and(S5T1.str_ln_cd.eq(S4T.str_ln_cd))
													.and(S5T1.stk_arrv_bp_cd.eq(S4T.stk_arrv_bp_cd))
													.and(S5T1.lot_no.eq(S4T.lot_no))
													.and(S5T1.sublot_no.eq(S4T.sublot_no))
													.and(S5T1.sno1.eq(S4T.sno1))
													.and(S5T1.sno2.eq(S4T.sno2))
													.and(S5T1.sno3.eq(S4T.sno3))
													.and(S5T1.sno4.eq(S4T.sno4))
													.and(S5T1.pack_unit_cd.eq(S4T.pack_unit_cd))
													.and(S5T1.gd_cd.eq(S4T.gd_cd))
													.and(S5T1.in_xfr_typ.eq(S4T.in_xfr_typ))
													.and(S5T1.quality_typ.eq(S4T.quality_typ))
													.and(S5T1.asst_typ.eq(S4T.asst_typ))
													.and(S5T1.stk_insp_typ.eq(S4T.stk_insp_typ))
													.and(S5T1.stk_id_typ.eq(S4T.stk_id_typ))
													.and(S5T1.stk_bp_cd.eq(S4T.stk_bp_cd))
												).eq(value(0))
											)
										)
										.groupBy(
											S4T.itm_cd,
											S4T.itm_sub1,
											S4T.itm_sub2,
											S4T.itm_sub3,
											S4T.loc_cd,
											S4T.str_ln_cd,
											S4T.stk_arrv_bp_cd,
											S4T.lot_no,
											S4T.sublot_no,
											S4T.sno1,
											S4T.sno2,
											S4T.sno3,
											S4T.sno4,
											S4T.pack_unit_cd,
											S4T.gd_cd,
											S4T.in_xfr_typ,
											S4T.quality_typ,
											S4T.asst_typ,
											S4T.stk_insp_typ,
											S4T.stk_id_typ,
											S4T.stk_bp_cd
										)
										.unionAll(
											subQuery()
											.select(
												S6T.itm_cd,
												S6T.itm_sub1,
												S6T.itm_sub2,
												S6T.itm_sub3,
												S6T.loc_cd,
												S6T.str_ln_cd,
												S6T.stk_arrv_bp_cd,
												S6T.lot_no,
												S6T.sublot_no,
												S6T.sno1,
												S6T.sno2,
												S6T.sno3,
												S6T.sno4,
												S6T.pack_unit_cd,
												S6T.gd_cd,
												S6T.in_xfr_typ,
												S6T.quality_typ,
												S6T.asst_typ,
												S6T.stk_insp_typ,
												S6T.stk_id_typ,
												S6T.stk_bp_cd,
												nullValue().as("io_act_pack_unit_qty"),
												nullValue().as("io_act_base_unit_qty"),
												S6T.pack_unit_qty.as("non_mov_stk_pack_unit_qty"),
												S6T.base_unit_qty.as("non_mov_stk_base_unit_qty"),
												S6T.non_mov_base_dt,
												S6T.sub_char1,
												S6T.sub_char2,
												S6T.sub_char3
											)
											.from(S6T)
											.where(
												value(0).eq(value(0))
												.and(
													S6T.non_mov_base_dt.lte(bind("non_mov_cmp_dt"))
												)
											)
										)
									)
								).view(S1V)
							)
							.groupBy(
								S1V.pr(S2T.itm_cd),
								S1V.pr(S2T.itm_sub1),
								S1V.pr(S2T.itm_sub2),
								S1V.pr(S2T.itm_sub3),
								S1V.pr(S2T.loc_cd),
								S1V.pr(S2T.str_ln_cd),
								S1V.pr(S2T.stk_arrv_bp_cd),
								S1V.pr(S2T.lot_no),
								S1V.pr(S2T.sublot_no),
								S1V.pr(S2T.sno1),
								S1V.pr(S2T.sno2),
								S1V.pr(S2T.sno3),
								S1V.pr(S2T.sno4),
								S1V.pr(S2T.pack_unit_cd),
								S1V.pr(S2T.gd_cd),
								S1V.pr(S2T.in_xfr_typ),
								S1V.pr(S2T.quality_typ),
								S1V.pr(S2T.asst_typ),
								S1V.pr(S2T.stk_insp_typ),
								S1V.pr(S2T.stk_id_typ),
								S1V.pr(S2T.stk_bp_cd),
								S1V.pr("sub_char1"),
								S1V.pr("sub_char2"),
								S1V.pr("sub_char3")
							).view(S0T)
							.leftOuterJoin(S0M1).on(S0T.pr(S2T.itm_cd).eq(S0M1.itm_cd)
									.and(S0T.pr(S2T.itm_sub1).eq(S0M1.itm_sub1))
									.and(S0T.pr(S2T.itm_sub2).eq(S0M1.itm_sub2))
									.and(S0T.pr(S2T.itm_sub3).eq(S0M1.itm_sub3)))
							.leftOuterJoin(S0M2).on(S0T.pr(S2T.loc_cd).eq(S0M2.loc_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(
								S0T.pr("io_act_pack_unit_qty").neq(value(0))
								.or(S0T.pr("io_act_pack_unit_qty").isNull())
								)
							)
						);

			return q;
		}
	}

	//FMCB CUSTOM END
}