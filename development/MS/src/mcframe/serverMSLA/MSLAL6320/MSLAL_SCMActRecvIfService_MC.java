package mcframe.serverMSLA.MSLAL6320;

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
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。

import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.sys.MCSys;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverMSUC.MSUCL0090.*;

import java.util.Set;
import java.util.HashSet;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverPF.dbc.*;
import mcframe.commonCore.sys.MCFactory;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_SCMActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_SCMActRecvIfService_MC extends MSLAL_SCMActRecvIfService_MC_A{
	//FMCB CUSTOM START
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_SCMActRecvIfService> CLAZZ = MSLAL_SCMActRecvIfService.class;

	/**
	 * Upd01から受信IFサービスを実行した際に付与する番号
	 * <p>
	 * 番号は以下のいずれかの場合にインクリメントされる<br>
	 * <li>本バッチから受信IFサービスを実行するとき
	 * <li>呼出先でマルチスレッド実行するとき
	 */
	public int _execNo = 0;

	/**
	 * SCMActRecvIf_Upd01オペレーション.<p>
	 *
	 * ＳＣＭで扱う実績受信ＩＦ取込を行う。（ＩＦデータ確認、およびＳＣＭ実績受信ＩＦ一括取込バッチから呼び出される）<br>
	 */
	public class SCMActRecvIf_Upd01 extends MSLAL_SCMActRecvIfService_MC_A.SCMActRecvIf_Upd01 {

		/** 処理対象件数 **/
		protected int _totalNum = 0;

		/** 登録件数（正常終了件数） **/
		protected int _okNum = 0;

		/** エラー件数 **/
		protected int _errNum = 0;

		/** スキップ **/
		protected int _skipNum = 0;

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg = false;

		/** ＭＥＳＩＦ **/
		protected MCList<MSVT_MES_IF_R> _recvIfL = null;
		protected MSVT_MES_IF_R _recvIfL_t = null;
		protected MCQueryApiBuilder _recvIfL_bldr = null;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			try {
				initProc();
				writeStartLog();

				preSrch();

				chkReqNoLock();
				reqNoLock();

				preSort();
				sort();
				exe();

				setDown();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				reqNoRelease();
				writeEndLog();
			}
		}

		/**
		 * 初期処理
		 */
		protected void initProc() {
			initLogger();

			if ( !(MAC_IF_UPD_TYP.isSKIP_ERROR(up1().if_upd_typ())
					|| MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())) ) {
				// 「エラーを無視して登録」または「エラー行まで登録」のいずれか以外の場合は、
				// 外部システムコードマスタの値を使用する
				up1().if_upd_typ(null);
			}
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			getConcurrentLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSLAL0156);
			pushStartLog(logger());
		}

		/**
		 * 例外処理
		 */
		protected void handleEx(Exception ex) {

			MCException mcEx;
			if (ex instanceof MCException) {
				mcEx = (MCException) ex;
			}
			else {
				mcEx = new MCException(ex);
			}
			logger().writeProcessLog(mcEx);

			_exceptionFlg = true;

			throw mcEx;
		}

		/**
		 * 終了ログを出力する。
		*/
		protected void writeEndLog() {

			if (_errNum > 0 || _exceptionFlg) {

				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalNum == 0) {

				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}

			logger().writeEndLog(MSLAL0157, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			logger().close();
		}

		/**
		 * ＭＥＳＩＦデータを取得する。
		 */
		protected void preSrch() {

			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			MAM_EXT_SYS_R m1 = MAM_EXT_SYS_R.create("M1");
			MST_YIELD_ACT_RECV_IF_R t3 = MST_YIELD_ACT_RECV_IF_R.create("T3");
			MST_WK_ACT_RECV_IF_R t4 = MST_WK_ACT_RECV_IF_R.create("T4");
			MST_YIELD_ACT_R t5 = MST_YIELD_ACT_R.create("T5");
			MST_ITM_MFG_INST_R t6 = MST_ITM_MFG_INST_R.create("T6");
			MST_MFG_INST_R S1W01 = MST_MFG_INST_R.create("W01");
			MST_ITM_MFG_INST_R S1W02 = MST_ITM_MFG_INST_R.create("W02");
			MST_OPER_INST_R S2W02 = MST_OPER_INST_R.create("W02");
			MST_WK_SCHD_R S3W03 = MST_WK_SCHD_R.create("W03");

			_recvIfL = MCList.create(MSVT_MES_IF_R.class);
			_recvIfL_t = MSVT_MES_IF_R.create("T");
			_recvIfL_bldr = MCQueryApiBuilder.create(_recvIfL_t);
			_recvIfL.addStringColumn("if_upd_typ");
			_recvIfL.addBooleanColumn("unschd_act_flg");
			_recvIfL.addStringColumn("mfg_loc_cd_for_wk");
			_recvIfL.addBooleanColumn("unschd_act_flg_for_wk");
			_recvIfL_bldr.setSelect(
					_recvIfL_t.data_no,
					_recvIfL_t.data_lno,
					_recvIfL_t.data_make_dt,
					_recvIfL_t.ext_sys_cd,
					_recvIfL_t.ext_data_no,
					_recvIfL_t.ext_data_lno,
					_recvIfL_t.recv_dt,
					_recvIfL_t.imp_flg,
					_recvIfL_t.if_proc_typ,
					_recvIfL_t.gi_lg_grp_cd,
					_recvIfL_t.gi_loc_cd,
					_recvIfL_t.gr_lg_grp_cd,
					_recvIfL_t.gr_loc_cd,
					_recvIfL_t.acxfr_lg_grp_cd,
					_recvIfL_t.acxfr_loc_cd,
					_recvIfL_t.data_crud_typ,
					_recvIfL_t.end_act_tm,
					cases().when(_recvIfL_t.if_proc_typ
							.eq(value(MAC_IF_PROC_TYP.MES_WK_ACT_RECV.value())))
							.then(subQuery()
									.select(S1W02.mfg_loc_cd)
									.from(S1W01
									.innerJoin(S1W02)
									.on(S1W02.itm_mfg_inst_no.eq(S1W01.itm_mfg_inst_no)
											.and(S1W02.can_flg.eq(value(false)))))
									.where(S1W01.mfg_inst_no.eq(nvl(
											_recvIfL_t.mfg_inst_no,
											nvl(bracket(subQuery()
													.select(S2W02.mfg_inst_no)
													.from(S2W02)
													.where(S2W02.oper_inst_no.eq(_recvIfL_t.oper_inst_no)
															.and(S2W02.can_flg.eq(value(false))))),
													bracket(subQuery()
															.select(S3W03.mfg_inst_no)
															.from(S3W03)
															.where(S3W03.wk_schd_no.eq(_recvIfL_t.wk_schd_no)
																	.and(S3W03.can_flg.eq(value(false))))))))
											.and(S1W01.can_flg.eq(value(false)))))
							.otherwise(_recvIfL_t.mfg_loc_cd).as("mfg_loc_cd"),
					_recvIfL_t.mfg_itm_cd,
					nvl(_recvIfL_t.mfg_itm_sub1, value(MAC_STR.NULL_VAL.value())).as("mfg_itm_sub1"),
					nvl(_recvIfL_t.mfg_itm_sub2, value(MAC_STR.NULL_VAL.value())).as("mfg_itm_sub2"),
					nvl(_recvIfL_t.mfg_itm_sub3, value(MAC_STR.NULL_VAL.value())).as("mfg_itm_sub3"),
					_recvIfL_t.oper_cd,
					_recvIfL_t.req_no,
					nvl(bind("if_upd_typ"), nvl(m1.if_upd_typ, value(MAC_IF_UPD_TYP.SKIP_ERROR.value()))).as("if_upd_typ"),
					t3.unschd_act_flg, t6.mfg_loc_cd.as("mfg_loc_cd_for_wk"),
					t6.unschd_act_flg.as("unschd_act_flg_for_wk"));
			_recvIfL_bldr.addLeftOuterJoin(t2, bracket(t2.data_no.eq(_recvIfL_t.data_no)));
			_recvIfL_bldr.addLeftOuterJoin(m1, bracket(m1.ext_sys_cd.eq(_recvIfL_t.ext_sys_cd)));
			_recvIfL_bldr.addLeftOuterJoin(t3, bracket(t3.data_no.eq(_recvIfL_t.data_no)));
			_recvIfL_bldr.addLeftOuterJoin(t4, bracket(t4.data_no.eq(_recvIfL_t.data_no)));
			_recvIfL_bldr.addLeftOuterJoin(t5, bracket(t5.ext_yield_act_no.eq(t4.ext_yield_act_no)));
			_recvIfL_bldr.addLeftOuterJoin(t6, bracket(t6.itm_mfg_inst_no.eq(t5.itm_mfg_inst_no)));
			_recvIfL_bldr.setWhere(value(0).eq(value(0)));
			_recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.data_lno.eq(bind("data_lno")));
			_recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.data_no.eq(bind("data_no")));
			_recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.if_proc_typ.eq(bind("if_proc_typ")));
			_recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.ext_data_no.eq(bind("ext_data_no")));
			_recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.ext_sys_cd.eq(bind("ext_sys_cd")));
			if (up0().isEmpty()) {
				_recvIfL_bldr.addWhereWithAnd((_recvIfL_t.imp_flg.eq(value(true))
						.and(t2.sdrv_sts_typ.isNull()
						.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))))));
				dbSelect("MSLAL6320_MSVT_MES_IF_S01", _recvIfL, _recvIfL_bldr, up1());
			}
			else {
				_recvIfL_bldr.addConstWhereWithAnd((_recvIfL_t.imp_flg.eq(value(true))
						.and(t2.sdrv_sts_typ.isNull()
						.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))))));
				dbSelect("MSLAL6320_MSVT_MES_IF_S02", _recvIfL, _recvIfL_bldr, up0(), up1());
			}

			// 取得したデータをロック（constWhereを使用する場合、ロック用のメソッドが提供されていないため、SQLを分ける）
			MST_SHIP_ACT_RECV_IF_R dbc_t2 = MST_SHIP_ACT_RECV_IF_R.create("T2");
			MST_ARR_ACT_RECV_IF_R dbc_t3 = MST_ARR_ACT_RECV_IF_R.create("T3");
			MST_XFR_ACT_RECV_IF_R dbc_t4 = MST_XFR_ACT_RECV_IF_R.create("T4");
			MST_YIELD_ACT_RECV_IF_R dbc_t5 = MST_YIELD_ACT_RECV_IF_R.create("T5");
			MST_OPER_ACT_RECV_IF_R dbc_t6 = MST_OPER_ACT_RECV_IF_R.create("T6");
			MST_INPT_ACT_RECV_IF_R dbc_t7 = MST_INPT_ACT_RECV_IF_R.create("T7");
			MST_WK_ACT_RECV_IF_R dbc_t8 = MST_WK_ACT_RECV_IF_R.create("T8");
			MST_ACXFR_ACT_RECV_IF_R dbc_t9 = MST_ACXFR_ACT_RECV_IF_R.create("T9");

			lockTbl("MSLAL6320_MST_SHIP_ACT_RECV_IF_S01", dbc_t2, _recvIfL.subList(r -> MAC_IF_PROC_TYP.isWMS_SHIP_ACT_RECV(r.if_proc_typ())));
			lockTbl("MSLAL6320_MST_ARR_ACT_RECV_IF_S01", dbc_t3, _recvIfL.subList(r -> MAC_IF_PROC_TYP.isWMS_ARR_ACT_RECV(r.if_proc_typ())));
			lockTbl("MSLAL6320_MST_XFR_ACT_RECV_IF_S01", dbc_t4, _recvIfL.subList(r -> MAC_IF_PROC_TYP.isWMS_XFR_ACT_RECV(r.if_proc_typ())));
			lockTbl("MSLAL6320_MST_YIELD_ACT_RECV_IF_S01", dbc_t5, _recvIfL.subList(r -> MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(r.if_proc_typ())));
			lockTbl("MSLAL6320_MST_OPER_ACT_RECV_IF_S01", dbc_t6, _recvIfL.subList(r -> MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(r.if_proc_typ())));
			lockTbl("MSLAL6320_MST_INPT_ACT_RECV_IF_S01", dbc_t7, _recvIfL.subList(r -> MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(r.if_proc_typ())));
			lockTbl("MSLAL6320_MST_WK_ACT_RECV_IF_S01", dbc_t8, _recvIfL.subList(r -> MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(r.if_proc_typ())));
			lockTbl("MSLAL6320_MST_ACXFR_ACT_RECV_IF_S01", dbc_t9, _recvIfL.subList(r -> MAC_IF_PROC_TYP.isWMS_ACXFR_ACT_RECV(r.if_proc_typ())));

			// SCMIF制御マスタを考慮
			removeRecvIfL();

		}
		
		protected void lockTbl(String sqlId, MCDBContainer dbc, MCList<MSVT_MES_IF_R> bindL) {
			if (!bindL.isEmpty()) {
				MCPermColumn dataLNo = dbc.getColumn$("data_lno");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSelect(dataLNo);
				builder.setOrderByAsc(dataLNo);
				dbSelectKeyForUpdateNoFetch(sqlId, builder, bindL);
			}
		}

		/**
		 * SCMIF制御マスタに登録されていないレコードを削除する
		 */
		protected void removeRecvIfL() {
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			MCNumber peg = MCNumber.ZERO;
			for (MSVT_MES_IF_R dtlR : _recvIfL) {
				dtlR.setNumberNE(SCMLinkUtil_Srch01_CndR.$peg_no, peg);

				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(dtlR.if_proc_typ());
				if (MAC_IF_PROC_TYP.isWMS_SHIP_ACT_RECV(r.if_proc_typ())
					|| MAC_IF_PROC_TYP.isWMS_XFR_ACT_RECV(r.if_proc_typ())) {
					r.lg_grp_cd(dtlR.gi_lg_grp_cd());
					r.loc_cd(dtlR.gi_loc_cd());
				}
				else if (MAC_IF_PROC_TYP.isWMS_ARR_ACT_RECV(r.if_proc_typ())) {
					r.lg_grp_cd(dtlR.gr_lg_grp_cd());
					r.loc_cd(dtlR.gr_loc_cd());
				}
				else if (MAC_IF_PROC_TYP.isWMS_ACXFR_ACT_RECV(r.if_proc_typ())) {
					r.lg_grp_cd(dtlR.acxfr_lg_grp_cd());
					r.loc_cd(dtlR.acxfr_loc_cd());
				}
				else {
					if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(r.if_proc_typ())
							&& dtlR.getBooleanNE("unschd_act_flg_for_wk")) {
						dtlR.setBooleanNE("unschd_act_flg", true);
						if (isNull(dtlR.mfg_loc_cd()) && !isNull(dtlR.getStringNE("mfg_loc_cd_for_wk"))) {
							dtlR.mfg_loc_cd(dtlR.getStringNE("mfg_loc_cd_for_wk"));
						}
					}
					
					r.loc_cd(dtlR.mfg_loc_cd());
					r.itm_cd(dtlR.mfg_itm_cd());
					r.itm_sub1(dtlR.mfg_itm_sub1());
					r.itm_sub2(dtlR.mfg_itm_sub2());
					r.itm_sub3(dtlR.mfg_itm_sub3());
					r.oper_cd(dtlR.oper_cd());
				}
				r.master_dt(dtlR.recv_dt());

				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();
	
				MCIndexKey idx = o.down0().createIndex(SCMLinkUtil_Srch01_CndR.$peg_no);
				for (MSVT_MES_IF_R dtlR : _recvIfL) {
					SCMLinkUtil_Srch01_CndR downR = o.down0().getFirst(idx, dtlR.getNumber(SCMLinkUtil_Srch01_CndR.$peg_no));
					if (isNull(downR) || isNull(downR.ext_sys_cd())) {
						// SCMIF制御マスタに有効なマスタが登録されていないレコードは除外する
						dtlR.setStatus(MCRow.DELETE);
					}
				}
			}

			_recvIfL.removeAll(_recvIfL.subList(MCRow.DELETE));
		}

		/**
		 * MSVT_MES_IFの処理対象レコードがreq_noでロックされているかチェックする。<br>
		 * req_noがNOTNULLで、実行中のサーバリクエストＮＯに含まれる場合はロック中と判断する。<br>
		 * 
		 * @return　true:req_noでロックがされている場合 / false:req_noでのロックがされていない場合
		 */
		protected void chkReqNoLock() {

			// 生きているリクエストNOの配列
			String[] sessionMapL = MCTransactionManager.getReqNoOfSeesionMap();
			String reqNo = MCSys.request.serverRequestNo();

			// req_noがNOTNULLで生きているリクエストＮＯに含まれる場合はロック中と判断する。
			for (MSVT_MES_IF_R gbR : _recvIfL.groupBy(MSVT_MES_IF_R.$req_no)) {
				if (!isNull(gbR.req_no())) {
					for (String session : sessionMapL) {
						if (isSame(session, reqNo)) {
							continue;	// 自身は対象外
						}
						if (isSame(session, gbR.req_no())) {
							// req_noでロック中
							throw new MCAppException(MSLAL0158);
						}
					}
				}
			}
		}

		/**
		 * リクエストNOによるロック
		 */
		protected void reqNoLock() {

			// MSVT_MES_IFのreq_no lock。
			// MSVT_MES_IFのロックは、処理単位でコミットする場合、
			// 通常のロック「select * for update」を使用できないため
			// 「req_no」の値の有無でロック中か判断する。
			// 「req_no」には自身のサーバリクエストＮＯを設定する。

			//ＰＧ実行状況区分、サーバリクエストＮＯ、ログ項目を更新する。
			for (MCList<MSVT_MES_IF_R> l : _recvIfL.groupList(MSVT_MES_IF_R.$if_proc_typ)) {
				MCUpdate q = getLockUpdSql(
					MAC_IF_PROC_TYP.upd_if_tbl(l.get(0).if_proc_typ()),
					MAC_EXE_STS_TYP.NOT_EXE.value(), 
					MCSys.request.serverRequestNo());
				q.executeBatchUpdate(l);
			}

			// リクエストNO更新済み
			up1().req_upd_flg(true);

			// 取込対象のレコードをキャッシュ（後続の更新カウンタチェックに使用する）
			initMesIfCache(_recvIfL);

			// 各受信IFサービスでもコミットされるので、事前にサーバリクエストＮＯを設定後一旦コミットする
			dbTran().commit();
		}
		protected MCUpdate getLockUpdSql(String tblNm, String exeStsTyp, String reqNo) {
			Class<?> clazz = createDbcClass(tblNm);
			MCDBContainer S0T = (MCDBContainer) MCFactory.invokeStatic(clazz,
					"create", new Class[] {
							String.class
					}, new Object[] {
							"T"
					});
			
			MCUpdate q = sql(createSqlId(LOGIC_ID, S0T, "U01"))
					.update(S0T)
					.set(S0T.getColumn$("exe_sts_typ")).eq(value(exeStsTyp))
					.set(S0T.getColumn$("req_no")).eq(value(reqNo))
					.where(MCQueryApiBuilder.makeEq(S0T.getColumn$("data_lno"), bind("data_lno"))
					);
			return q;
		}

		/**
		 * リクエストNOの解放
		 */
		protected void reqNoRelease() {
			if (!up1().req_upd_flg()) {
				// リクエストNOを更新していないので解放する必要なし
				return;
			}
			//ＰＧ実行状況区分、サーバリクエストＮＯ、ログ項目を更新する。
			for (MCList<MSVT_MES_IF_R> l : _recvIfL.groupList(MSVT_MES_IF_R.$if_proc_typ)) {
				MCUpdate q = getReleaseUpdSql(
					MAC_IF_PROC_TYP.upd_if_tbl(l.get(0).if_proc_typ()));
				q.executeBatchUpdate(l);
			}
		}
		protected MCUpdate getReleaseUpdSql(String tblNm) {
			Class<?> clazz = createDbcClass(tblNm);
			MCDBContainer S0T = (MCDBContainer) MCFactory.invokeStatic(clazz,
					"create", new Class[] {
							String.class
					}, new Object[] {
							"T"
					});
			
			MCUpdate q = sql(createSqlId(LOGIC_ID, S0T, "U02"))
					.update(S0T)
					.set(S0T.getColumn$("req_no")).eq(nullValue())
					.where(MCQueryApiBuilder.makeEq(S0T.getColumn$("data_lno"), bind("data_lno"))
					);
			return q;
		}

		/**
		 * 取込対象データを再取得する。
		 * 処理単位ごとにコミットされる時の再ロック、排他チェックをは呼出先で行う。<br>
		 * 呼出先でまとめて実行された場合の考慮。<br>
		 * @return true:取込対象の場合 / false：取込対象外の場合
		 */
		protected boolean reSrchForExeUnitCommit(MSVT_MES_IF_R r) {

			Class<?> clazz = createDbcClass(MAC_IF_PROC_TYP.upd_if_tbl(r.if_proc_typ()));
			MCDBContainer t2 = (MCDBContainer) MCFactory.invokeStatic(clazz,
					"create", new Class[] {
							String.class
					}, new Object[] {
							"T2"
					});

			MSVT_MES_IF_R reLockR = MSVT_MES_IF_R.create();
			MSVT_MES_IF_R t = MSVT_MES_IF_R.create("T");
			MCQueryApiBuilder reLockR_bldr = MCQueryApiBuilder.create(t);
			reLockR_bldr.setSelect(
					t.data_lno,
					t.data_no,
					t.exe_sts_typ,
					t.imp_flg,
					t.upd_srv_req_no,
					t.upd_cntr
			);
			reLockR_bldr.addInnerJoin(t2, MCQueryApiBuilder.makeEq(t.data_lno, t2.getColumn$("data_lno")));
			reLockR_bldr.setLockTable(t2.getColumn$("data_lno"));
// 呼出先の受信IFサービスをマルチスレッドで実行するため、ここでロックしない
//			reLockR.dbSelectKeyForUpdateNoWait(r);
			dbSelectKey("MSLAL6320_MSVT_MES_IF_S03", reLockR, reLockR_bldr, r);

			// 呼出先の受信IFサービスで外部システムCDによるまとめ登録などにより、
			// 同一リクエストNOで処理済みになる事があるので取込対象フラグを再設定する
			r.imp_flg(reLockR.imp_flg());

			// リクエストNO更新後のロウとチェックする
			MSVT_MES_IF_R updR = getMesIfR(r.data_lno(), r.data_no());

			if (isSame(reLockR.upd_srv_req_no(), MCSys.request.serverRequestNo())) {

				if (reLockR.imp_flg()
					&& MAC_EXE_STS_TYP.isERR(reLockR.exe_sts_typ())
					&& reLockR.upd_cntr().gt(updR.upd_cntr())) {
					// 処理済みであっても、エラーの場合は取込対象フラグはオンのままなので、
					// リクエストNO更新後のカウンタ値と比較して大きいときは	処理済みとみなして取込対象外とする
					r.imp_flg(false);
				}
			}
			else {
// 呼出先の受信IFサービスでチェックする
//				msgL.addAll(checkUpdCntrNE(updR, MSVT_MES_IF_R.$upd_cntr, reLockR));
			}

			return r.imp_flg();
		}

		/**
		 * ＩＦ処理区分（ソート用）
		 */
		protected final String _$sort_if_proc_typ = "__sort_if_proc_typ__";

		/**
		 * 並び替え前処理
		 */
		protected void preSort() {
			// ＩＦ処理区分の並び順を設定する
			_recvIfL.addNumberColumn(_$sort_if_proc_typ);
			for (MSVT_MES_IF_R r : _recvIfL) {
				int value = 1;
				if (isMes(r.if_proc_typ())) {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						// 取消データが連続する場合は、その連続するデータは投入、工数、出来高、工程の順で処理する
						if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(r.if_proc_typ())) {
							value = 3;
						}
						else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(r.if_proc_typ())) {
							value = 2;
						}
						else {
							value = 1;
						}
					}
					else {
						// 新規or更新データが連続する場合は、その連続するデータは工程(未完了)、投入、工数、出来高、工程(完了)の順で処理する
						if (MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(r.if_proc_typ())) {
							if (isNull(r.end_act_tm())) {
								value = 1;
							}
							else {
								value = 4;
							}
						}
						else if (MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(r.if_proc_typ())) {
							if (r.getBooleanNE("unschd_act_flg")) {
								value = 0;
							}
							else {
								value = 3;
							}
						}
						else {
							value = 2;
						}
					}
				}
				r.setNumber(_$sort_if_proc_typ, value);
			}
		}
		/**
		 * 並び替え<br>
		 * データ作成日時＋外部システムＣＤ＋外部システムデータＮＯ＋外部システムデータ行ＮＯ の順に<br>
		 * 後続の受信ＩＦサービスを実行する
		 */
		protected void sort() {
			_recvIfL.sort(
				MSVT_MES_IF_R.$data_make_dt,
				MSVT_MES_IF_R.$ext_sys_cd,
				MSVT_MES_IF_R.$ext_data_no,
				MSVT_MES_IF_R.$ext_data_lno
			);
			if (_recvIfL.size() <= 0) {
				return;
			}

			MCList<MSVT_MES_IF_R>
				recvIfL = _recvIfL.createInstance(), tmpL = _recvIfL.createInstance();

			// 同一のデータ作成日時、外部システムＣＤ、データ更新区分が連続しており、かつ製造系のＩＦ処理区分が連続している場合に限り、以下の順を考慮する
			// ・データ更新区分「登録」が連続している、もしくは「訂正」が連続している場合、工程(未完了)、投入、工数、出来高、工程(完了)の順
			// ・データ更新区分「取消」が連続している場合、投入、工数、出来高、工程の順
			String[] keys = {MSVT_MES_IF_R.$data_make_dt, MSVT_MES_IF_R.$ext_sys_cd, MSVT_MES_IF_R.$data_crud_typ};
			java.util.function.BiConsumer<MCList<MSVT_MES_IF_R>, MCList<MSVT_MES_IF_R>> addList = (t, r) -> {
				if (t.size() > 1) {
					// t の要素数が1より大きくなるのは製造系のＩＦ処理区分が連続している場合のみ
					t.sort(_$sort_if_proc_typ);
				}
				r.addAll(t);
				t.clear();
			};

			tmpL.add(_recvIfL.get(0));
			for (int i=1; i<_recvIfL.size(); i++) {
				MSVT_MES_IF_R r2 = _recvIfL.get(i), r1 = tmpL.get(tmpL.size() -1);

				if ( !(r2.equalColumns(r1, keys) && isMes(r1.if_proc_typ()) && isMes(r2.if_proc_typ())) ) {
					addList.accept(tmpL, recvIfL);
				}
				tmpL.add(r2);
			}
			addList.accept(tmpL, recvIfL);

			_recvIfL.setAll(recvIfL);
		}

		/**
		 * メイン処理
		 */
		protected void exe() {

			MCMessageList msgL = MCMessagePool.getMessageList();
			MCMessagePool.clear();

			// 処理単位区分に従ってサービスを実行する目印を設定
			setRegRowFlg();

			Set<String> stopErrSet = new HashSet<>();
			MCList<MSVT_MES_IF_R> exeL = MCList.create(MSVT_MES_IF_R.class);

			for (MSVT_MES_IF_R r : _recvIfL) {

				if (!stopErrSet.contains(r.ext_sys_cd())) {
					// マップに未登録(＝外部システムCD内でエラーが発生していない)の場合のみ、取込対象とする

					// 取込対象の再取得
					boolean impFlg = reSrchForExeUnitCommit(r);
					if (impFlg) {
						// 取込対象に追加
						exeL.add(r);
					}
				}

				// 実行対象の時にサービスを実行する
				if (r.getBoolean(_$reg_row_flg)) {
					MCList<MSVT_MES_IF_R> errL = callRecvIfService(exeL);
					if (!errL.isEmpty()) {
						if (MAC_IF_UPD_TYP.isSTOP_ERROR(r.getStringNE("if_upd_typ"))) {
							errL.forEach(errR -> {
								if (!stopErrSet.contains(errR.ext_sys_cd())) {
									// 「エラー行まで登録」の時は、チェックエラーまたは登録エラーを外部システムCDごとに制御する
									stopErrSet.add(errR.ext_sys_cd());
								}
							});
						}
						errL.clear();
					}
					exeL.clear();
				}
			}

			logger().writeDataLog(MCMessagePool.getMessageList());
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
		}

		/**
		 * 受信IFサービスを実行するレコードに目印を設定する<br>
		 * 目印のレコードが来るまではまとめて処理するリストに蓄積する
		 */
		protected final String _$reg_row_flg = "__reg_row_flg__";
		protected void setRegRowFlg() {

			_recvIfL.addBooleanColumn(_$reg_row_flg);

			// 処理単位フラグが「まとめない」
			if (!up1().exe_unit_lump_flg()) {
				// レコード単位にサービスを実行するので全レコードに目印を設定する
				_recvIfL.forEach(r -> r.setBoolean(_$reg_row_flg, true));
			}
			// 処理単位フラグが「まとめる」
			else {
				// 同一のMESIF取込区分が連続するレコードをひとまとめにサービスを実行するので
				// ひとまとめとする単位の最終レコードに目印を設定する
				int lastIdx = _recvIfL.size() - 1;
				for (int i=lastIdx; i>=0; i--) {
					MSVT_MES_IF_R r = _recvIfL.get(i);

					if (i == lastIdx) {
						 // 最終レコードは実行対象
						r.setBoolean(_$reg_row_flg, true);
					}
					int j = i - 1;
					if (j >= 0) {
						MSVT_MES_IF_R bfR = _recvIfL.get(j);
						if (!isSameMesIfInTyp(r, bfR)) {
							// ひとつ前のレコードが異なる場合、ひとつ前を実行対象に設定
							bfR.setBoolean(_$reg_row_flg, true);
						}
						if (j == 0) {
							break;
						}
					}
				}
			}
		}

		/**
		 * IF処理区分、If更新区分をもとに一括取込のまとめ単位(MESIF取込区分)が同じか判定する
		 */
		protected boolean isSameMesIfInTyp(MSVT_MES_IF_R r, MSVT_MES_IF_R bfR) {
			boolean isSameIfUpdTyp =
				isSame(r.getString("if_upd_typ"), bfR.getString("if_upd_typ"));

			if (isSame(r.if_proc_typ(), bfR.if_proc_typ())) {
				return isSameIfUpdTyp;
			}
			else if (isMes(bfR.if_proc_typ())) {
				// 製造系はIF処理区分が異なっても同じ(＝まとめて実行)とみなす
				if (isMes(r.if_proc_typ())) {
					return isSameIfUpdTyp;
				}
				return false;
			}
			else if (isWms(bfR.if_proc_typ())) {
				// WMS系はIF処理区分が同じでない場合はまとめない
				return false;
			}
			return false;
		}

		/**
		 * IF処理区分が製造系か
		 * @param ifProcTyp
		 * @return
		 */
		protected boolean isMes(String ifProcTyp) {
			return MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(ifProcTyp);
		}

		/**
		 * IF処理区分がWMS系か
		 */
		protected boolean isWms(String ifProcTyp) {
			return MAC_IF_PROC_TYP.isWMS_SHIP_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_ARR_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_ACXFR_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_XFR_ACT_RECV(ifProcTyp);
		}

		/**
		 * 受信IFサービスを実行する<br>
		 * 例外処理やトランザクション制御は呼出先の受信IFサービスに委ねるので<br>
		 * 本メソッドにtry~catchは実装しない
		 */
		protected MCList<MSVT_MES_IF_R> callRecvIfService(MCList<MSVT_MES_IF_R> recvIfL) {
			MCList<MSVT_MES_IF_R> errL = MCList.create(MSVT_MES_IF_R.class);

			if (recvIfL.isEmpty()) {
				return errL;
			}

			// サービスの実行番号
			++object(CLAZZ)._execNo;

			IfMBBEL_IfDataImpService_Upd01 o = createImpOperation(recvIfL.get(0).if_proc_typ());
			setAll(o.up0(), recvIfL, createMap_IfDataImp_Upd01_DtlR_MSVT_MES_IF_R());
			copy(o.up1(), up1(), recvIfL.get(0), createMap_IfDataImp_Upd01_CndR_SCMActRecvIf_Upd01_CndR());
			o.exec();

			_totalNum += o.down0().total_num().intValue();
			_okNum += o.down0().ok_num().intValue();
			_errNum += o.down0().err_num().intValue();
			_skipNum += o.down0().skip_num().intValue();

			// エラーのあった外部システムCDのリストを取得
			if (o.down0().err_num().isPositive() && MAC_IF_UPD_TYP.isSTOP_ERROR(o.up1().if_upd_typ())) {
				MSVT_MES_IF_R t = MSVT_MES_IF_R.create("T");
				MCQueryApiBuilder errL_bldr = MCQueryApiBuilder.create(t);
				errL_bldr.setDistinct();
				errL_bldr.setSelect(t.ext_sys_cd);
				errL_bldr.setWhere(t.data_no.eq(bind("data_no")));
				errL_bldr.addWhereWithAnd(t.data_lno.eq(bind("data_lno")));
				errL_bldr.addConstWhereWithAnd(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.ERR.value())));
				dbSelect("MSLAL6320_MSVT_MES_IF_S04", errL, errL_bldr, o.up0(), null);
			}

			return errL;
		}
		protected IfMBBEL_IfDataImpService_Upd01 createImpOperation(String ifProcTyp) {
			String opeId = getOpeId(ifProcTyp);
			String[] arr = isNull(opeId) ? null : opeId.split("\\.");
			if (arr == null || arr.length != 3) {
				throw new MCAppException(MSLAL0173, ifProcTyp, opeId);
			}
			IfMBBEL_IfDataImpService_Upd01
				o = createOperationWD(
					arr[0],		// moduleId
					arr[1],		// logicId
					arr[2],		// operationId
					IfMBBEL_IfDataImpService_Upd01.class);
			return o;
		}
		protected final String _MFG_ACT_RECV_IF = "MS.MSLAL6220.MfgActRecvIf_Upd02";
		protected String getOpeId(String ifProcTyp) {
			if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(ifProcTyp)) {
				// 工数実績は製造実績受信IFサービス経由で取り込む
				return _MFG_ACT_RECV_IF;
			}
			return MAC_IF_PROC_TYP.get(ifProcTyp).imp_ope2();
		}
		protected Map_IfDataImp_Upd01_DtlR_MSVT_MES_IF_R<IfDataImp_Upd01_DtlR,MSVT_MES_IF_R> createMap_IfDataImp_Upd01_DtlR_MSVT_MES_IF_R() {
			return new Map_IfDataImp_Upd01_DtlR_MSVT_MES_IF_R<IfDataImp_Upd01_DtlR, MSVT_MES_IF_R>();
		}
		public class Map_IfDataImp_Upd01_DtlR_MSVT_MES_IF_R<D extends IfDataImp_Upd01_DtlR, S extends MSVT_MES_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_lno, MSVT_MES_IF_R.$data_lno);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_no, MSVT_MES_IF_R.$data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$if_proc_typ, MSVT_MES_IF_R.$if_proc_typ);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_data_no, MSVT_MES_IF_R.$ext_data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_sys_cd, MSVT_MES_IF_R.$ext_sys_cd);
			}
		}
		protected Map_IfDataImp_Upd01_CndR_SCMActRecvIf_Upd01_CndR<IfDataImp_Upd01_CndR,SCMActRecvIf_Upd01_CndR, MSVT_MES_IF_R> createMap_IfDataImp_Upd01_CndR_SCMActRecvIf_Upd01_CndR() {
			return new Map_IfDataImp_Upd01_CndR_SCMActRecvIf_Upd01_CndR<IfDataImp_Upd01_CndR, SCMActRecvIf_Upd01_CndR, MSVT_MES_IF_R>();
		}
		public class Map_IfDataImp_Upd01_CndR_SCMActRecvIf_Upd01_CndR<D extends IfDataImp_Upd01_CndR, S extends SCMActRecvIf_Upd01_CndR, W extends MSVT_MES_IF_R> extends MAUCC_RowMapperWith<D,S,W>{
			protected MSVT_MES_IF_R _ifR;
			@Override
			public void setWith(W ifR) {
				_ifR = ifR;
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.exe_unit_lump_flg(src.exe_unit_lump_flg());
				dest.if_upd_typ(nvl(src.if_upd_typ(), _ifR.getString("if_upd_typ")));
				dest.src_actlumprecv_flg(true);
			}
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}
	}



//// キャッシュ関連
	/**
	 * 取込対象のレコードに対してリクエストNOを更新した後のレコードを退避するキャッシュ
	 */
	public class MesIfCache {
		protected MCList<MSVT_MES_IF_R> _dbc;
		protected MSVT_MES_IF_R _dbc_t;
		protected MCQueryApiBuilder _dbc_bldr;
		protected MCIndexKey _idx;
		public MesIfCache(MCList<MSVT_MES_IF_R> recvIfL) {
			_dbc = MCList.create(MSVT_MES_IF_R.class);
			_dbc_t = MSVT_MES_IF_R.create("T");
			_dbc_bldr = MCQueryApiBuilder.create(_dbc_t);
			_dbc_bldr.setSelect(
					_dbc_t.data_lno,
					_dbc_t.data_no,
					_dbc_t.if_proc_typ,
					_dbc_t.req_no,
					_dbc_t.upd_cntr
			);
			dbSelectKey("MSLAL6320_MSVT_MES_IF_S05", _dbc, _dbc_bldr,
					recvIfL.groupBy(MSVT_MES_IF_R.$data_lno, MSVT_MES_IF_R.$data_no)
			);
			_idx = _dbc.createIndex(MSVT_MES_IF_R.$data_lno, MSVT_MES_IF_R.$data_no);
		}
		protected MSVT_MES_IF_R get(MCNumber lno, MCNumber no) {
			return _dbc.getFirst(_idx, lno, no);
		}
	}
	protected MesIfCache _mesIfCache;
	protected void initMesIfCache(MCList<MSVT_MES_IF_R> recvIfL) {
		object(CLAZZ)._mesIfCache = new MesIfCache(recvIfL);
	}
	public static MSVT_MES_IF_R getMesIfR(MCNumber lno, MCNumber no) {
		return object(CLAZZ)._mesIfCache.get(lno, no);
	}

	//FMCB CUSTOM END
}