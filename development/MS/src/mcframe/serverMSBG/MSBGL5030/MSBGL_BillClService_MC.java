package mcframe.serverMSBG.MSBGL5030;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBG.MSBGL5020.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR;
import mcframe.serverMSLA.MSLAL5210.MSLAL_BillSendIfService;
import mcframe.serverCore.requester.MCServerThreadManager;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverMSBG.MSBGL5030.Query.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillClService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillClService_MC extends MSBGL_BillClService_MC_A{
	//FMCB CUSTOM START
	
	protected static final Class<MSBGL_BillClService> CLAZZ = MSBGL_BillClService.class;

	// 発行区分
	// 発行区分：全発行 or 明細なし
	protected static final int PRNT_TYP_ALL_PRNT = 1;
	// 発行区分：全未発行
	protected static final int PRNT_TYP_ALL_NOT_PRNT = 2;
	// 発行区分：一部発行
	protected static final int PRNT_TYP_PART_PRNT = 3;

	// 売掛消込予定削除データ退避用リスト
	protected MCList<MST_AR_APPL_SCHD_R> _arApplSchdDelL = MCList.create(MST_AR_APPL_SCHD_R.class);

	protected MCQueryApiBuilder _arApplSchdDelL_bldr = MCQueryApiBuilder.create(MST_AR_APPL_SCHD_R.create("T"));
	
	// 売掛消込実績削除データ退避用リスト
	protected MCList<MST_BILL_ACST_R> _billAcstDelL = MCList.create(MST_BILL_ACST_R.class);

	protected MCQueryApiBuilder _billAcstDelL_bldr = MCQueryApiBuilder.create(MST_BILL_ACST_R.create("T"));
	
	protected FXUCL_MCDbcCache<MAM_STTL_R> _cacheSttl = null;
	/**
	 * BillCl_Upd01オペレーション.<p>
	 *
	 * バッチ用の請求締処理(BillCl_Upd03)を起動する<br>
	 */
	public class BillCl_Upd01 extends MSBGL_BillClService_MC_A.BillCl_Upd01 {

		/** 対象件数 */
		protected int _totalCnt;
		/** 正常終了件数 */
		protected int _successCnt;
		/** エラー件数 */
		protected int _errorCnt;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
		@Override
		protected void call() {
			super.call();
		}

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

			getConcurrentLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBGL0076);
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
			if (_errorCnt > 0 || _exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalCnt == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			logger().writeEndLog(MSBGL0077, _totalCnt, _successCnt, _errorCnt);
			pushEndLog(logger());
			logger().close();
		}

		/**
		 * バッチ用の請求締処理のメイン処理
		 */
		protected void execMain() {
			
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;

			if (isNull(up0().tgt_dt())) {
				up0().tgt_dt(getToday());
			}

			// 対象日が休日の場合は処理を終了する
			boolean wrkdayFlg = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_DT$F_IS_WRKDAY", "01"),
					MAPA_DT$F_IS_WRKDAY(value(up0().tgt_dt()), value(nvl(getCo().bill_cl_cal_cd(), getCo().std_cal_cd()))));
			if (!wrkdayFlg) {
				return;
			}

			MCList<MAM_BP_R> bcstL = getBcstL();
			if (bcstL.isEmpty()) {
				return;
			}

			setClDt(bcstL, up0().tgt_dt());

			List<MSBGL_BillClService.BillCl_Upd03> opeL = new ArrayList<>();
			for (MCList<BillCl_Upd03_CndR> cndL : splitTgt(bcstL)) {
				MSBGL_BillClService.BillCl_Upd03 ope = MSBGL_BillClService.crtBillCl_Upd03();
				ope.up0().addAll(cndL);
				opeL.add(ope);
			}

			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}

			for (MSBGL_BillClService.BillCl_Upd03 ope : opeL) {
				for (BillCl_Upd03_RsltR downR : ope.down0()) {
					_totalCnt += downR.total_cnt().intValue();
					_successCnt += downR.success_cnt().intValue();
					_errorCnt += downR.error_cnt().intValue();
				}
			}
		}
		
		/**
		 * スレッドサイズを考慮して上り電文を分割する
		 * @param list
		 * @return
		 */
		protected List<MCList<BillCl_Upd03_CndR>> splitTgt(MCList<MAM_BP_R> list) {
			List<MCList<BillCl_Upd03_CndR>> ret = new ArrayList<>();
			if (list.isEmpty()) {
				return ret;
			}

			int thread = MCServerThreadManager.getThreadCount(list.size());
			list.addNumberColumn("thred_num");
			int rowNum = 0;
			for (MAM_BP_R row : list) {
				row.setNumberNE("thred_num", MCNumber.valueOf(rowNum%thread));
				rowNum++;
			}

			MCList<BillCl_Upd03_CndR> tmp = MCList.create(BillCl_Upd03_CndR.class);
			for (int i = 0; i < thread; i++) {
				tmp = MCList.create(BillCl_Upd03_CndR.class);
				for (MAM_BP_R row : list.subList("thred_num", MCNumber.valueOf(i)) ) {
					BillCl_Upd03_CndR cndR = BillCl_Upd03_CndR.create();
					cndR.bcst_cd(row.bp_cd());
					cndR.bill_cl_dt(row.getDate("cl_dt"));
					cndR.tgt_dt(up0().tgt_dt());
					tmp.add(cndR);
				}
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 請求先取得<br />
		 * 
		 * 請求先を取得する
		 * 
		 * @return 請求先情報
		 */
		protected MCList<MAM_BP_R> getBcstL() {
			MCList<MAM_BP_R> l = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MST_BILL_R S1T2 = MST_BILL_R.create("T2");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);

			l_bldr.addWhereWithAnd(t.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.BATCH.value())));
			l_bldr.addWhereWithAnd(coalesce(t.bill_cl_day1, t.bill_cl_day2, t.bill_cl_day3, t.bill_cl_day4, t.bill_cl_day5).isNotNull());
			l_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1T2).where(S1T2.bcst_cd.eq(t.bp_cd)
							.and(S1T2.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()))))));
			l_bldr.addWhereWithAnd(t.bcst_flg.eq(value(true)));
			dbSelect("MSBGL5030_MAM_BP_S01", l, l_bldr);

			return l;
		}

		/**
		 * 締日設定<br />
		 * 
		 * 請求先ごとの請求締日を設定します
		 * 
		 * @param bcstL 請求先情報
		 */
		protected void setClDt(MCList<MAM_BP_R> bcstL, MCDate tgtDt) {

			MST_BILL_D_R r = MST_BILL_D_R.create();
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MST_BILL_R t2 = MST_BILL_R.create("T2");
			MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
			bill_bldr.setSelect(count(t.bill_d_no).as("cnt"));
			bill_bldr.addInnerJoin(t2, t2.bill_mng_no.eq(t.bill_mng_no));
			bill_bldr.addWhereWithAnd(t2.bcst_cd.eq(bind("bp_cd")));
			bill_bldr.addWhereWithAnd(t2.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			bill_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
			bill_bldr.addWhereWithAnd(
					MSPA_AR_UTIL$F_GET_BILL_CL_FLG1(bind("bp_cd"), t.bill_basis_dt, t.bill_crryovr_times, bind("cl_dt")).eq(value(true)));

			MCList<MAM_BP_R> rmL = MCList.create(MAM_BP_R.class);
			for (MAM_BP_R bcstR : bcstL) {
				MCDate clDt = getClDt(bcstR, tgtDt);
				if (isNull(clDt)) {
					rmL.add(bcstR);
				}
				else {
					bcstR.setDateNE("cl_dt", clDt);
					dbSelect("MSBGL5030_MST_BILL_D_S01", r, bill_bldr, bcstR);
					bcstR.setNumberNE("cnt", r.getNumber("cnt"));
				}
			}

			bcstL.removeAll(rmL);
			bcstL.sort(SortType.DESC, "cnt");
		}

		/**
		 * 請求締日取得<br />
		 * 
		 * 指定された請求先が締対象である場合、締日を返す
		 * 
		 * @param bcstR 得意先マスタ
		 * @return 締対象日（対象でない場合はnullを返す）
		 */
		protected MCDate getClDt(MAM_BP_R bcstR, MCDate tgtDt) {

			MCDate frDt = null;
			MCDate toDt = null;

			// 1.遅延日数がＮの場合
			//   締日がＮ営業日前から（Ｎ－１）営業日前－１（暦日）の間にあるものが対象となる。
			if (!isNull(bcstR.bill_cl_delay_days()) && !bcstR.bill_cl_delay_days().isZero()) {
				frDt = getCalDate(bcstR.bill_cl_delay_days().negate(), tgtDt);
				toDt = getCalDate(bcstR.bill_cl_delay_days().subtract(MCNumber.ONE).negate(), tgtDt)
							.addDay(MCNumber.ONE.negate());
			}
			// 2.前倒しの場合
			//   締日が当日から翌営業日－１（暦日）の間にあるものが対象となる。			
			else if (MAC_BA_TYP.isBF(bcstR.bill_cl_ba_typ())) {
				frDt = up0().tgt_dt();
				toDt = getCalDate(MCNumber.ONE, tgtDt).addDay(MCNumber.ONE.negate());
			}
			// 3.後倒しの場合
			//   締日が前営業日＋１（暦日）から当日の間にあるものが対象となる。
			else {
				frDt = getCalDate(MCNumber.ONE.negate(), tgtDt).addDay(MCNumber.ONE);
				toDt = up0().tgt_dt();
			}

			MCNumber clDay = getClDay(bcstR.bp_cd(), frDt.addDay(MCNumber.ONE.negate()));
			if (isNull(clDay)) {
				return null;
			}
			// 締日と締日の間に稼働日がない場合を考慮する
			else if (!isSame(frDt, toDt)) {
				// 非稼働日に入る前の次回請求締日を取得
				MCDate clDt = getClDt(frDt, toDt, clDay);
				// 条件に合う締日がない場合
				if (isNull(clDt)) {
					return null;
				}
				// 条件の期間内に未来の締日が含まれる場合、締日を更新する
				for (MCDate i = clDt; toDt.gt(i); i = i.addDay(1)) {
					// 次回請求予定の請求締日を取得
					clDay = getClDay(bcstR.bp_cd(), i);
					// 条件に合う締日を取得
					MCDate nextClDt = getClDt(frDt, toDt, clDay);
					if (isNull(nextClDt) || clDt.gt(nextClDt)) {
						break;
					}
					clDt = nextClDt;
				}
				return clDt;
			}
			else {
				return getClDt(frDt, toDt, clDay);
			}
		}

		protected FXUCL_MCFuncCache<MCDate> _calDateCache;
		/**
		 * リードタイム計算後日付取得<br />
		 * 
		 * 運用日付に対して、休日を含めたリードタイム計算を行い、その結果を返す
		 * 
		 * @param lt リードタイム日数
		 * 
		 * @return リードタイム計算後の日付
		 */
		protected MCDate getCalDate(MCNumber lt, MCDate tgtDt) {
			if (_calDateCache == null) {
				_calDateCache = new FXUCL_MCFuncCache<>(in -> {
					return MAPA_DT$F_CAL_DATE(value((MCDate) in[0]), value((MCNumber) in[1]), value(true),
							value(nvl(getCo().bill_cl_cal_cd(), getCo().std_cal_cd())), value(false));
				});
			}
			return _calDateCache.get(tgtDt, lt);
		}

		/**
		 * 締日取得<br />
		 * 
		 * 締日を取得する
		 * 
		 * @param bcstCd 締日を取得する請求先ＣＤ
		 * @param billDt 今回の請求日
		 * 
		 * @return 締日
		 */
		protected MCNumber getClDay(String bcstCd, MCDate billDt) {
			MCDate nextBillDt = MSBGL_ArUtil.getNextBillDt(bcstCd, billDt);
			if (isNull(nextBillDt)) {
				return null;
			}
			else {
				return MCNumber.valueOf(nextBillDt.getDay());
			}
		}

		/**
		 * 請求締日取得<br />
		 * 
		 * 条件に合う締日を求める。ない場合はnullを返す
		 * 
		 * @param frDt 条件開始日
		 * @param toDt 条件終了日
		 * @param clDay 締日
		 * 
		 * @return 暦日請求締日。対象で無い場合はnullを返す。
		 */
		protected MCDate getClDt(MCDate frDt, MCDate toDt, MCNumber clDay) {
			MCDate clTgDt = MSBGL_ArUtil.combineDt(frDt, clDay);
			if (!isNull(clTgDt)
					&& frDt.lte(clTgDt) && clTgDt.lte(toDt)) {
				return clTgDt;
			}

			// 条件期間が複数月をまたがっている場合は開始日の翌月で再度チェック
			// 例）期間 2010/4/25～2010/5/5で締日が3の場合、2010/4/3は×だが、2010/5/3なら対象になる。
			if (frDt.getMonth() != toDt.getMonth()) {
				clTgDt = MSBGL_ArUtil.combineDt(frDt.addMonth(MCNumber.ONE), clDay);
				if (!isNull(clTgDt)
						&& frDt.lte(clTgDt) && clTgDt.lte(toDt)) {
					return clTgDt;
				}
			}

			return null;
		}
	}

	/**
	 * BillCl_Upd02オペレーション.<p>
	 *
	 * 画面用の請求締処理<br>
	 */
	public class BillCl_Upd02 extends MSBGL_BillClService_MC_A.BillCl_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			for (BillCl_Upd02_HdrR up0 : up0()) {
				// 請求締処理を実行する
				billCl(up0.bcst_cd(), up0.bill_dpt_cd(), up0.iv_no(), up0.trd_cur_cd(),
						up0.wrk_no(), up0.bill_d_sel_flg(), MSC_BILL_CL_STS_TYP.CL_SCRN, null, up0);

				// 下り電文設定
				down0().add(up0);
			}
		}
	}

	/**
	 * BillCl_Upd03オペレーション.<p>
	 *
	 * バッチ用の請求締処理<br>
	 */
	public class BillCl_Upd03 extends MSBGL_BillClService_MC_A.BillCl_Upd03 {

		/** データカウンタ */
		protected MCNumber _dat_cntr;
		/** 下り電文に設定する全処理件数 */
		protected int _totalCnt;
		/** 下り電文に設定する正常終了件数 */
		protected int _successCnt;
		/** 下り電文に設定するエラー件数 */
		protected int _errorCnt;

		/**
		 * バッチログのlogger<br>
		 * Upd01バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			try {
				initLogger();
				initBpCache(up0());

				for (BillCl_Upd03_CndR cndR : up0()) {
					execMain(cndR);
					setDown();
				}
			}
			finally {
				closeLogger();
			}
		}

		/**
		 * バッチログのインスタンスを取得する
		 */
		protected void initLogger() {
			if (MCServerThreadManager.isUseMainDBTran()) {
				_logger = logger();
			}
			else {
				_logger = logger().clone();
			}
		}

		/**
		 * バッチログをクローズする
		 */
		protected void closeLogger() {
			if (!MCServerThreadManager.isUseMainDBTran()) {
				_logger.close();
			}
		}

		/**
		 * バッチ請求締処理実行<br />
		 * 
		 * バッチからの請求締処理のメイン処理を実行します
		 * 
		 * @param cndR 上り電文
		 */
		protected void execMain(BillCl_Upd03_CndR cndR) {
			_dat_cntr = MCNumber.ZERO;
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;

			MCList<MST_BILL_R> billL = getBillL(cndR.bcst_cd());
			lockRcvActL(billL);
			MCList<MST_BILL_R> processL = getProcessL(billL);
			doSeqCache(MSC_NUM_SYS_TYP.BILLMNG, MCNumber.valueOf(2).multiply(processL.size()).intValue());
			for (MST_BILL_R billR : processL) {
				_arApplSchdDelL.clear();
				_billAcstDelL.clear();
				boolean isError = false;
				boolean updFlg = false;
				MCSavepoint sp = dbTran().setSavepoint();
				
				int dataCnt = makeNotBillData(cndR.bcst_cd(), cndR.bill_cl_dt(),
						billR.bill_dpt_cd(), billR.trd_cur_cd(), billR.iv_no(), billR.wrk_no());

				if (dataCnt > 0) {
					_totalCnt++;

					try {
						chkBillDpt(cndR.bill_cl_dt(), billR, null);
						// 請求締処理
						updFlg = billCl(cndR.bcst_cd(), billR.bill_dpt_cd(), billR.iv_no(), billR.trd_cur_cd(),
								billR.wrk_no(), false, MSC_BILL_CL_STS_TYP.CL_BATCH, cndR.tgt_dt(), null);
						if (updFlg) {
							_successCnt++;
						}
					}
					catch (Exception ex) {
						MCException mcex;
						if (ex instanceof MCException) {
							mcex = (MCException) ex;
						}
						else {
							mcex = new MCException(ex);
						}
						dbTran().rollback(sp);
						MCLog.write(mcex);
						_logger.writeProcessLog(mcex);
						_errorCnt++;
						isError = true;
					}

					MST_BILL_CL_BR_R billClBrR = MST_BILL_CL_BR_R.create();
					insBillClBr(billClBrR, cndR, billR, isError);
				}
				delWkBill();
			}
			dbTran().commit();
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			BillCl_Upd03_RsltR downR = BillCl_Upd03_RsltR.create();
			downR.total_cnt(_totalCnt);
			downR.success_cnt(_successCnt);
			downR.error_cnt(_errorCnt);
			down0().add(downR);
		}

		/**
		 * 請求締バッチ結果確認の登録<br />
		 * 
		 * 請求締バッチ結果確認を登録
		 * 
		 * @param billClBrR 登録対象ＤＢコンテナ
		 * @param cndR 設定条件
		 * @param billR 締対象の請求情報
		 */
		protected void insBillClBr(MST_BILL_CL_BR_R billClBrR,
				BillCl_Upd03_CndR cndR, MST_BILL_R billR, boolean isError) {

			_logger.setLogKey(billClBrR,
					MST_BILL_CL_BR_R.$batch_log_no,
					MST_BILL_CL_BR_R.$log_sub_key1,
					MST_BILL_CL_BR_R.$log_sub_key2);

			// 請求締バッチ結果確認を作成
			billClBrR.bcst_cd(cndR.bcst_cd());
			billClBrR.bill_dpt_cd(billR.bill_dpt_cd());
			billClBrR.iv_no(billR.iv_no());
			billClBrR.trd_cur_cd(billR.trd_cur_cd());
			billClBrR.wrk_no(billR.wrk_no());
			billClBrR.bill_cl_dt(cndR.bill_cl_dt());
			if (isError) {
				billClBrR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
			}
			else {
				billClBrR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
			}
			billClBrR.batch_data_no(getStrSeq(MAC_NUM_SYS_TYP.BATCH_DATA));

			dbInsert("MSBGL5030_MST_BILL_CL_BR_I01", billClBrR, MCQueryApiBuilder.create(MST_BILL_CL_BR_R.create("T")));
		}

		/**
		 * 請求取得<br />
		 * 
		 * 請求をロックし、取得する
		 * 
		 * @param bcstCd 取得する請求先 
		 * 
		 * @return 引数で指定された請求先の請求
		 */
		protected MCList<MST_BILL_R> getBillL(String bcstCd) {
			MCList<MST_BILL_R> l = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
			// ロックするのは請求部門ＣＤ、通貨ＣＤ、インボイスＮＯ、案件ＮＯ、請求年月日順
			l_bldr.addOrderByAsc(t.bill_dpt_cd, t.trd_cur_cd, t.iv_no, t.wrk_no, t.bill_cl_dt);
			dbSelectForUpdateNoWait("MSBGL5030_MST_BILL_S01", l, l_bldr);
			return l;
		}

		/**
		 * 締処理対象請求取得<br />
		 * 
		 * 請求のうち、締処理を行う請求を返す。<br />
		 * 請求は「請求先」、「請求部門」、「通貨ＣＤ」、「インボイスＮＯ」、「案件ＮＯ」のみを含み、<BR>
		 * 「請求部門」、「通貨ＣＤ」、「インボイスＮＯ」、「案件ＮＯ」の順でソートされている。
		 * 
		 * @param billL 請求
		 * 
		 * @return 締処理対象の請求
		 */
		protected MCList<MST_BILL_R> getProcessL(MCList<MST_BILL_R> billL) {
			MCList<MST_BILL_R> notBillL =
				billL.subList(MST_BILL_R.$bill_cl_sts_typ, MSC_BILL_CL_STS_TYP.NOT_BILL.value());
			MCList<MST_BILL_R> retL =
				notBillL.groupBy(MST_BILL_R.$bcst_cd, MST_BILL_R.$bill_dpt_cd, MST_BILL_R.$iv_no,
						MST_BILL_R.$trd_cur_cd, MST_BILL_R.$wrk_no);
			retL.sort(MST_BILL_R.$bill_dpt_cd, MST_BILL_R.$trd_cur_cd, MST_BILL_R.$iv_no,
					MST_BILL_R.$wrk_no);
			return retL;
		}

		/**
		 * 未請求データ作成<br />
		 * 
		 * 未請求の請求・請求明細をワークテーブルに挿入する
		 * 
		 * @param bcstCd 請求先ＣＤ
		 * @param billDptCd 請求部門ＣＤ
		 * @param clDt 請求先に対する締日
		 * @param curCd 通貨ＣＤ
		 * @param ivNo インボイスＮＯ
		 * @param wrkNo 案件ＮＯ
		 * 
		 * @return 未請求のデータ件数
		 */
		protected int makeNotBillData(String bcstCd, MCDate clDt,
				String billDptCd, String curCd, String ivNo, String wrkNo) {
			// 請求ワークの作成
			makeWkBill(bcstCd, billDptCd, clDt, curCd, ivNo, wrkNo);
			// 請求明細ワークの作成
			makeWkBillD(bcstCd, clDt);
			// 入金実績明細ワークの作成
			makeWkRcvActD();

			return getNotBillCnt(bcstCd, clDt);
		}

		/**
		 * 請求ワーク作成<br />
		 * 
		 * 請求ワークを作成する
		 * 
		 * @param bcstCd 請求先ＣＤ
		 * @param billDptCd 請求先ＣＤ
		 * @param clDt 請求先に対する締日
		 * @param curCd 通貨ＣＤ
		 * @param ivNo インボイスＮＯ
		 */
		protected void makeWkBill(String bcstCd, String billDptCd, MCDate clDt, String curCd, String ivNo, String wrkNo) {
			MCList<MST_BILL_R> billL = getBillLForWkBill(bcstCd, billDptCd, curCd, ivNo, wrkNo);
			MCList<MSW_BILL_R> wkBillL = MCList.create(MSW_BILL_R.class);
			setAll(wkBillL, billL, createMap_MSW_BILL_R_MST_BILL_R());
			// 入力締年月はここで設定（マッパーで設定するのが煩雑なので）
			wkBillL.setDate(MSW_BILL_R.$inpt_bill_cl_dt, clDt);
			dbInsertEx("MSBGL5030_MSW_BILL_I01", wkBillL, MCQueryApiBuilder.create(MSW_BILL_R.create("T")));

			// データカウンタの設定
			setDatCntr(bcstCd);
		}

		/**
		 * 請求ワーク作成用請求取得<br />
		 * 
		 * 請求ワークを作成するための請求を取得する
		 * 
		 * @param bcstCd 請求先ＣＤ
		 * @param billDptCd 請求部門ＣＤ
		 * @param curCd 通貨ＣＤ
		 * @param ivNo インボイスＮＯ
		 * @param wrkCd 案件ＣＤ
		 * 
		 * @return 請求ワークを作成するための請求
		 */
		protected MCList<MST_BILL_R> getBillLForWkBill(String bcstCd, String billDptCd, String curCd, String ivNo, String wrkCd) {
			MCList<MST_BILL_R> l = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			// バッチ実行時は基準日で再取得したレートを使用する
			l_bldr.removeSelect(t.bill_xrate);
			l_bldr.addSelect(
				MAPA_XCHNG$F_GET_XRATE_NE(
					t.trd_cur_cd, bind("base_cur_cd"), bind("bill_xrate_cd"), t.base_dt
				).as("bill_xrate")
			);
			l_bldr.addLeftOuterJoin(m1, t.bcst_cd.eq(m1.bp_cd));
			l_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			l_bldr.addWhereWithAnd(bracket(bind("1").isNull()
					.or(t.bill_dpt_cd.eq(bind("1")))), billDptCd);
			l_bldr.addWhereWithAnd(bracket(bind("1").isNull()
					.or(t.trd_cur_cd.eq(bind("1")))), curCd);
			l_bldr.addWhereWithAnd(bracket(bind("1").isNull()
					.or(t.iv_no.eq(bind("1")))), ivNo);
			l_bldr.addWhereWithAnd(bracket(bind("1").isNull()
					.or(t.wrk_no.eq(bind("1")))), wrkCd);
			l_bldr.addWhereWithAnd(m1.bp_cd.eq(bind("1")), bcstCd);
			MCRow bind = MCRow.create();
			bind.setStringNE(MAM_CO_R.$base_cur_cd, getCo().base_cur_cd());
			bind.setStringNE(MAM_CO_R.$bill_xrate_cd, getCo().bill_xrate_cd());
			dbSelect("MSBGL5030_MST_BILL_S02", l, l_bldr, bind);
			return l;
		}

		/**
		 * データカウンタ設定<br />
		 * 
		 * 請求書単位でデータカウンタを設定する
		 * 
		 * @param bcstCd 請求先ＣＤ
		 */
		protected void setDatCntr(String bcstCd) {
			// 請求書単位でデータカウンタを付与
			
			MSW_BILL_R t = MSW_BILL_R.create("T");
			MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
			bill_bldr.setWhere(t.bcst_cd.eq(bindEx("bcst_cd")));
			bill_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bindEx("bill_dpt_cd")));
			bill_bldr.addWhereWithAnd(t.iv_no.eq(bindEx("iv_no")));
			bill_bldr.addWhereWithAnd(t.wrk_no.eq(bindEx("wrk_no"))
					.or(t.wrk_no.isNull())
					.and(bindEx("wrk_no").isNull()));
			bill_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bindEx("trd_cur_cd")));
			bill_bldr.setSetVL(t.dat_cntr, bindEx("dat_cntr"));

			for (MSW_BILL_R r : getMswBillL(bcstCd)) {
				r.setNumber("dat_cntr", _dat_cntr);
				dbUpdate("MSBGL5030_MSW_BILL_U01", r, bill_bldr);
				_dat_cntr.add(MCNumber.ONE);
			}
		}

		/**
		 * 請求書キー項目取得<br />
		 * 
		 * 請求書を作成する単位となるキー項目を取得する
		 * 
		 * @param bcstCd 請求先ＣＤ
		 * 
		 * @return 請求書キー項目（請求先ＣＤ、インボイスＮＯ、通貨ＣＤ、案件ＣＤ）のリスト
		 */
		protected MCList<MSW_BILL_R> getMswBillL(String bcstCd) {
			MCList<MSW_BILL_R> l = MCList.create(MSW_BILL_R.class);
			MSW_BILL_R t = MSW_BILL_R.create("T");
			MST_BILL_R t2 = MST_BILL_R.create("T2");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addInnerJoin(t2, t.bcst_cd.eq(t2.bcst_cd)
					.and(t.bill_dpt_cd.eq(t2.bill_dpt_cd))
					.and(t.iv_no.eq(t2.iv_no))
					.and(t.trd_cur_cd.eq(t2.trd_cur_cd))
					.and(t.wrk_no.eq(t2.wrk_no)
							.or(t.wrk_no.isNull())
							.and(t2.wrk_no.isNull())));
			l_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
			l_bldr.addWhereWithAnd(t2.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			dbSelect("MSBGL5030_MSW_BILL_S01", l, l_bldr);

			MCList<MSW_BILL_R> uniqueL = l.groupBy(MSW_BILL_R.$bcst_cd, MSW_BILL_R.$bill_dpt_cd, MSW_BILL_R.$iv_no, MSW_BILL_R.$trd_cur_cd,
					MSW_BILL_R.$wrk_no);
			return uniqueL;
		}

		/**
		 * 請求明細ワーク作成<br />
		 * 
		 * 請求明細ワークを作成する
		 * 
		 * @param clDt 請求先に対する締日
		 */
		protected void makeWkBillD(String bcstCd, MCDate clDt) {
			MCList<MST_BILL_D_R> billDL = getBillDLForWkBillD(clDt);
			MAM_BP_R bcstR = _bpCache.get(bcstCd);
			setBillPrntTgtFlg(billDL, bcstR);
			MCList<MSW_BILL_D_R> wkBillDL = MCList.create(MSW_BILL_D_R.class);
			setAll(wkBillDL, billDL, createMap_MSW_BILL_D_R_MST_BILL_D_R());
			dbInsertEx("MSBGL5030_MSW_BILL_D_I01", wkBillDL, MCQueryApiBuilder.create(MSW_BILL_D_R.create("T")));
		}

		/**
		 * 請求明細ワーク作成対象請求明細取得<br />
		 * 
		 * 請求明細ワーク作成対象の請求明細を取得する
		 * 
		 * @param clDt 請求先に対する締日
		 * 
		 * @return 請求明細ワーク作成対象請求明細
		 */
		protected MCList<MST_BILL_D_R> getBillDLForWkBillD(MCDate clDt) {
			MCList<MST_BILL_D_R> l = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MST_BILL_ACST_R billAcst = MST_BILL_ACST_R.create("BILLACST");
			MSW_BILL_R w1 = MSW_BILL_R.create("W1");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l.addBooleanColumn("cl_flg");
			l.addStringColumn("acst_cd");
			l_bldr.setSelect(t.bill_mng_no);
			l_bldr.addSelect(t.bill_d_no);
			l_bldr.addSelect(
					MSPA_AR_UTIL$F_GET_BILL_CL_FLG1(w1.bcst_cd, t.bill_basis_dt, t.bill_crryovr_times, bind("cl_dt")).as("cl_flg"));
			l_bldr.addSelect(w1.dat_cntr);
			l_bldr.addSelect(t.bill_mtd_typ);
			l_bldr.addSelect(t.trd_cur_amt);
			l_bldr.addSelect(t.trd_cur_tax_amt);
			l_bldr.addSelect(t.bill_prnt_tgt_flg);
			l_bldr.addSelect(t.bill_d_typ);
			l_bldr.addSelect(t.act_d_no);
			l_bldr.addSelect(t.act_d_seq);
			l_bldr.addSelect(t.slip_sts_typ);
			l_bldr.addSelect(
					cases()
					.when(t.crryovr_flg.eq(value(true)))
						.then(value(true))
					.when(t.bill_mtd_typ.eq(value(MSC_BILL_MTD_TYP.PART_BILL.value())))
						.then(value(true))
					.otherwise(value(false)).as("crryovr_flg"));
			l_bldr.addSelect(t.dlv_dt);
			l_bldr.addSelect(t.ac_dt);
			l_bldr.addSelect(t.dlv_slip_no);
			l_bldr.addSelect(t.itm_cd);
			l_bldr.addSelect(t.itm_sub1);
			l_bldr.addSelect(t.itm_sub2);
			l_bldr.addSelect(t.itm_sub3);
			l_bldr.addSelect(t.itm_nm);
			l_bldr.addSelect(t.cst_itm_cd);
			l_bldr.addSelect(t.cst_itm_nm);
			l_bldr.addSelect(t.trd_unit_qty);
			l_bldr.addSelect(t.trd_unit_cd);
			l_bldr.addSelect(t.trd_cur_upri);
			l_bldr.addSelect(t.tax_cd);
			l_bldr.addSelect(t.trd_d_rmrks);
			l_bldr.addSelect(t.bill_d_rmrks);
			l_bldr.addSelect(t.wrk_no);
			l_bldr.addSelect(t.cst_cd);
			l_bldr.addSelect(t.dlv_cd);
			l_bldr.addSelect(billAcst.acst_cd);
			l_bldr.addInnerJoin(billAcst, bracket(t.bill_acst_no.eq(billAcst.bill_acst_no)));
			l_bldr.addInnerJoin(w1, t.bill_mng_no.eq(w1.bill_mng_no));
			l_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));

			MCRow bind = MCRow.create();
			bind.setDateNE("cl_dt", clDt);

			dbSelect("MSBGL5030_MST_BILL_D_S02", l, l_bldr, bind);

			return l;
		}
		/**
		 * 入金実績ワーク作成<br />
		 */
		protected void makeWkRcvActD() {
			MCList<MST_RCV_ACT_D_R> rcvActDL = getRcvActDLForWkRcvActD();
			MCList<MSW_RCV_ACT_D_R> wkRcvActDL = MCList.create(MSW_RCV_ACT_D_R.class);
			setAll(wkRcvActDL, rcvActDL, createMap_MSW_RCV_ACT_D_R_MST_RCV_ACT_D_R());
			dbInsertEx(
				"MSBGL5030_MSW_RCV_ACT_D_I01",
				wkRcvActDL,
				MCQueryApiBuilder.create(MSW_RCV_ACT_D_R.create("T"))
			);
		}
		protected MCList<MST_RCV_ACT_D_R> getRcvActDLForWkRcvActD() {
			MSW_BILL_R t = MSW_BILL_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setOrderBy(t.bill_mng_no.asc());
			
			MCList<MSW_BILL_R> rsltL = MCList.create(MSW_BILL_R.class);
			dbSelect("MSBGL5030_MSW_BILL_S04", rsltL, bldr);
			
			MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
			for (MCList<MSW_BILL_R> advRcvKeyL : rsltL.groupList(getAdvGrpKey())) {
				MSW_BILL_R wkBillR = advRcvKeyL.get(0);
				MCList<MST_RCV_ACT_D_R> tgtL =
					MSBGL_ArUtil.getBillClAdvL(wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(), wkBillR.trd_cur_cd());
				tgtL.forEach(r -> {
					r.bill_mng_no(wkBillR.bill_mng_no());
					r.setNumberNE(MSW_RCV_ACT_D_R.$dat_cntr, wkBillR.dat_cntr());
				});
				
				rcvActDL.addAll(tgtL);
			}
			
			return rcvActDL;
		}
		
		protected String[] getAdvGrpKey() {
			return new String[] { MSW_BILL_R.$bcst_cd, MSW_BILL_R.$bill_dpt_cd, MSW_BILL_R.$trd_cur_cd };
		}
		
		/**
		 * 請求締対象となる前受金の入金実績をロックする
		 */
		protected void lockRcvActL(MCList<MST_BILL_R> billL) {
			String[] advGrpKey = {
				MST_BILL_R.$bcst_cd, MST_BILL_R.$bill_dpt_cd, MST_BILL_R.$trd_cur_cd
			};
			
			MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
			for (MST_BILL_R billR : billL.distinctNE(advGrpKey)) {
				rcvActDL.addAll(
					MSBGL_ArUtil.getBillClAdvL(billR.bcst_cd(), billR.bill_dpt_cd(), billR.trd_cur_cd())
				);
			}
			
			MST_RCV_ACT_R t = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			
			dbSelectKeyForUpdateNoWaitNoFetch(
				"MSBGL5030_MST_RCV_ACT_S01", bldr,
				rcvActDL.distinctNE(MST_RCV_ACT_R.$rcv_act_no, MST_RCV_ACT_R.$rcv_act_seq)
			);
		}

		/**
		 * 未請求データ件数取得<br />
		 * 
		 * 未請求のデータ件数を返す
		 * 
		 * @param bcstCd 請求先ＣＤ
		 * @param clDt 請求先に対する締日
		 * 
		 * @return 未請求のデータ件数
		 */
		protected int getNotBillCnt(String bcstCd, MCDate clDt) {
			MCList<MSW_BILL_R> l = MCList.create(MSW_BILL_R.class);
			MSW_BILL_R t = MSW_BILL_R.create("T");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MST_BILL_D_R S1T3 = MST_BILL_D_R.create("T3");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addInnerJoin(m1, m1.bp_cd.eq(bind("bcst_cd")));
			l_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("bcst_cd")));
			l_bldr.addWhereWithAnd(m1.bp_cd.eq(t.bcst_cd));
			// 画面と同じ条件で、締対象が存在するかをチェックする
			// すでにHW_BILLには存在しても、請求対象の明細が無く、前回請求額も0であれば締対象としてカウントしない
			// 請求対象の明細が存在する
			l_bldr.addWhereWithAnd(bracket(exists(subQuery().select(value("X")).from(S1T3)
					.where(S1T3.bill_mng_no.eq(t.bill_mng_no)
							.and(MSPA_AR_UTIL$F_GET_BILL_CL_FLG1(t.bcst_cd, S1T3.bill_basis_dt, S1T3.bill_crryovr_times, bind("cl_dt"))
									.eq(value(true)))
							.and(S1T3.valid_flg.eq(value(true)))))
									.or(MSPA_AR_UTIL$F_GET_LAST_BILL_AMT(t.bcst_cd, t.bill_dpt_cd, t.iv_no, t.trd_cur_cd, t.wrk_no)
											.neq(value(0)))));
			// 前回請求の請求額が存在する

			MCRow bind = MCRow.create();
			bind.setStringNE("bcst_cd", bcstCd);
			bind.setDateNE("cl_dt", clDt);
			dbSelect("MSBGL5030_MSW_BILL_S02", l, l_bldr, bind);
			return l.size();
		}
		// ------------------------MCRowMapper----------------------------
		protected Map_MSW_BILL_R_MST_BILL_R<MSW_BILL_R, MST_BILL_R> createMap_MSW_BILL_R_MST_BILL_R() {
			return new Map_MSW_BILL_R_MST_BILL_R<MSW_BILL_R, MST_BILL_R>();
		}

		public class Map_MSW_BILL_R_MST_BILL_R<D extends MSW_BILL_R, S extends MST_BILL_R> extends
				MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.bill_mng_no(src.bill_mng_no());
				dest.bill_cl_dt(src.bill_cl_dt());
				dest.bcst_cd(src.bcst_cd());
				dest.bill_dpt_cd(src.bill_dpt_cd());
				dest.iv_no(src.iv_no());
				dest.trd_cur_cd(src.trd_cur_cd());
				dest.bill_xrate(src.bill_xrate());
				dest.wrk_no(src.wrk_no());
				// 入力締年月、入力入金予定日は呼び出し元で設定
			}
		}

		protected Map_MSHW_BILL_D_R_MST_BILL_D_R<MSW_BILL_D_R, MST_BILL_D_R> createMap_MSW_BILL_D_R_MST_BILL_D_R() {
			return new Map_MSHW_BILL_D_R_MST_BILL_D_R<MSW_BILL_D_R, MST_BILL_D_R>();
		}

		public class Map_MSHW_BILL_D_R_MST_BILL_D_R<D extends MSW_BILL_D_R, S extends MST_BILL_D_R> extends
				MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.bill_d_no(src.bill_d_no());
				dest.bill_mng_no(src.bill_mng_no());
				dest.cl_flg(src.getBoolean("cl_flg"));
				dest.dat_cntr(src.getNumber("dat_cntr"));
				dest.bill_mtd_typ(src.bill_mtd_typ());
				dest.amt(src.trd_cur_amt());
				dest.tax_amt(src.trd_cur_tax_amt());
				dest.bill_prnt_tgt_flg(src.bill_prnt_tgt_flg());
			}
		}
		protected Map_MSW_RCV_ACT_D_R_MST_RCV_ACT_D_R<MSW_RCV_ACT_D_R, MST_RCV_ACT_D_R> createMap_MSW_RCV_ACT_D_R_MST_RCV_ACT_D_R() {
			return new Map_MSW_RCV_ACT_D_R_MST_RCV_ACT_D_R<MSW_RCV_ACT_D_R, MST_RCV_ACT_D_R>();
		}
		public class Map_MSW_RCV_ACT_D_R_MST_RCV_ACT_D_R<D extends MSW_RCV_ACT_D_R, S extends MST_RCV_ACT_D_R> extends
				MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.rcv_act_d_no(src.rcv_act_d_no());
				dest.rcv_act_d_seq(src.rcv_act_d_seq());
				dest.rcv_act_no(src.rcv_act_no());
				dest.rcv_act_seq(src.rcv_act_seq());
				dest.bill_mng_no(src.bill_mng_no());
				dest.dat_cntr(src.getNumber(MSW_RCV_ACT_D_R.$dat_cntr));
			}
		}
	}

	/**
	 * BillCl_Del01オペレーション.<p>
	 *
	 * 請求締解除を行う<br>
	 */
	public class BillCl_Del01 extends MSBGL_BillClService_MC_A.BillCl_Del01 {

		/**
		 * EDI IF制御マスタリスト
		 */
		MCList<MAM_EDI_IF_CTL_R> _ediIfCtrL = MCList.create(MAM_EDI_IF_CTL_R.class);
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			for (BillCl_Del01_CndR cndR : up0()) {
				execMain(cndR);
			}
		}

		/**
		 * 請求締解除実行<br />
		 * 
		 * 請求締解除のメイン処理を実行します
		 * 
		 * @param cndR 上り電文
		 */
		protected void execMain(BillCl_Del01_CndR cndR) {
			getEdiIf();
			// 取消可能な請求かチェック
			chkBillNo(cndR);
			// 前受金に対応する入金実績明細を更新する
			updRcvActDAdv(cndR.bill_mng_no());
			// 以降の処理で取り消されてしまうため、受注状況を更新するための情報をあらかじめ取得しておく
			MCList<MST_BILL_D_R> sloStsRegL = getSloStsRegL(cndR.bill_mng_no());
			// 消費税差額の伝票が存在する場合、取消、赤伝発行を行う
			callCanTaxDiff(cndR.bill_mng_no());
			// 請求を取り消す
			MST_BILL_R canBillR = canBill(cndR.bill_mng_no());
			// 未請求の請求を洗い替える
			MST_BILL_R lastBillR = updLastBill(canBillR);
			// 売掛先別請求を取り消す
			canBillAcst(canBillR, lastBillR);
			// 次月データを取り消す
			callBillCanNext(canBillR);
			// 受注状況を更新する
			callSloStsReg(sloStsRegL, MSC_SLO_STS_TYP.BILL_CL_CAN.value());
			// 請求書ヘッダ履歴の更新
			updBillHis(canBillR);
		}

		/**
		 * 取消可能な請求情報かチェックする
		 * 
		 * @param cndR 削除対象の上り電文
		 */
		protected void chkBillNo(BillCl_Del01_CndR cndR) {
			// 締解除対象の請求取得
			MST_BILL_R canBillR = getCanBill(cndR.bill_mng_no());

			String maxBillMngNo = getLastBillMngNo(canBillR, null);

			if (!isSame(canBillR.bill_mng_no(), maxBillMngNo)) {
				throw new MCAppException(MSBGL0078, canBillR.bcst_cd(), toYMDString(canBillR.bill_cl_dt()));
			}

			// 有効な請求先かチェックする
			MAM_BP_R bcstR = MSBGL_ArUtil.getBp(canBillR.bcst_cd());
			if (isNull(bcstR) || !bcstR.bcst_flg() || bcstR.del_flg()) {
				throw new MCException(MSBGL0079, canBillR.bcst_cd());
			}

			MCList<MST_BILL_D_R> partBillDL = getPartBillDL(cndR);
			if (crryovrBillDSwExists(partBillDL)) {
				throw new MCException(MSBGL0126, canBillR.bill_no());
			}
			if (rcvActDExists(partBillDL)) {
				throw new MCException(MSBGL0127, canBillR.bill_no());
			}
			if (invalidItmExists(cndR)) {
				throw new MCException(MSBGL0129, canBillR.bill_no());
			}
		}

		/**
		 * 一部請求の請求明細を取得する
		 */
		protected MCList<MST_BILL_D_R> getPartBillDL(BillCl_Del01_CndR cndR) {
			MCList<MST_BILL_D_R> partBillDL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder partBillDL_bldr = MCQueryApiBuilder.create(t);
			partBillDL_bldr.setWhere(t.bill_mng_no.eq(bind("1")), cndR.bill_mng_no());
			partBillDL_bldr.addWhereWithAnd(t.bill_mtd_typ.eq(value(MSC_BILL_MTD_TYP.PART_BILL.value())));
			partBillDL_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
			dbSelect("MSBGL5030_MST_BILL_D_S03", partBillDL, partBillDL_bldr);
			return partBillDL;
		}

		/**
		 * 請求書に含まれる一部請求に対応する繰越分の請求に、振替済みのデータがあるか判定する
		 */
		protected boolean crryovrBillDSwExists(MCList<MST_BILL_D_R> partBillDL) {

			for (MST_BILL_D_R billDR : partBillDL) {
				MST_BILL_D_R partBillDR = getBillD(billDR.bill_d_no());
				MST_BILL_D_R crryovrBillDR = getBillD(billDR.crryovr_bill_d_no());
				if (crryovrBillDR.isEmpty()) {
					continue;
				}
				// 以下のいずれかの項目が異なる場合、振替済みとみなす
				// インボイスＮＯは条件には含めない（一部請求で請求ヘッダ.インボイスＮＯにNULL文字以外が設定されることはないので）
				if ( !(isSame(partBillDR.ac_ym(), crryovrBillDR.ac_ym())
						&& isSame(partBillDR.getString(MST_BILL_ACST_R.$acst_cd), crryovrBillDR.getString(MST_BILL_ACST_R.$acst_cd))
						&& isSame(partBillDR.getString(MST_BILL_ACST_R.$ar_dpt_cd), crryovrBillDR.getString(MST_BILL_ACST_R.$ar_dpt_cd))
						&& isSame(partBillDR.getString(MST_BILL_ACST_R.$ar_typ), crryovrBillDR.getString(MST_BILL_ACST_R.$ar_typ))
						&& isSame(partBillDR.getString(MST_BILL_R.$trd_cur_cd), crryovrBillDR.getString(MST_BILL_R.$trd_cur_cd))
						&& isSame(partBillDR.getString(MST_BILL_R.$wrk_no), crryovrBillDR.getString(MST_BILL_R.$wrk_no))) ) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 請求書に含まれる一部請求に対応する繰越分の請求に、入金済みのデータがあるか判定する
		 */
		protected boolean rcvActDExists(MCList<MST_BILL_D_R> partBillDL) {
			for (MST_BILL_D_R billDR : partBillDL) {
				if (rcvActDExists(billDR.crryovr_bill_d_no())) {
					// 請求済残高振替が行われている
					return true;
				}
			}
			return false;
		}
		/**
		 * 請求書明細に無効な品目が含まれているか判定する
		 */
		protected boolean invalidItmExists(BillCl_Del01_CndR cndR) {
			MAM_ITM_R M1 = MAM_ITM_R.create("M1");
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			int cnt = execDbCount("MSBGL5030_MST_BILL_D_S04", t,
					t.bill_mng_no.eq(bind("bill_mng_no"))
							.and(notExists(subQuery().select(value("X")).from(M1)
									.where(M1.itm_cd.eq(t.itm_cd)
											.and(M1.itm_sub1.eq(t.itm_sub1))
											.and(M1.itm_sub2.eq(t.itm_sub2))
											.and(M1.itm_sub3.eq(t.itm_sub3)))))
											.and(t.valid_flg.eq(value(true)))
											.and(t.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value()))),
					cndR);
			if (cnt > 0) {
				return true;
			}
			return false;
		}

		/**
		 * 請求明細に対して入金（相殺や振替による入金も含む）が行われているか判定する
		 */
		protected boolean rcvActDExists(String billDNo) {
			MCList<MST_BILL_D_APPL_ACT_R> dbc = MCList.create(MST_BILL_D_APPL_ACT_R.class);
			MST_BILL_D_APPL_ACT_R t = MST_BILL_D_APPL_ACT_R.create("T");
			MST_RCV_ACT_D_R t2 = MST_RCV_ACT_D_R.create("T2");
			MST_RCV_ACT_R t3 = MST_RCV_ACT_R.create("T3");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t2.rcv_act_d_no, t2.rcv_act_d_seq);
			dbc_bldr.addInnerJoin(t2, bracket(t2.rcv_act_d_no.eq(t.rcv_act_d_no)));
			dbc_bldr.addInnerJoin(t3, bracket(t3.rcv_act_no.eq(t2.rcv_act_no)
					.and(t3.rcv_act_seq.eq(t2.rcv_act_seq))));
			dbc_bldr.setWhere(t.bill_d_no.eq(bind("1")), billDNo);
			dbc_bldr.addWhereWithAnd(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbc_bldr.addWhereWithAnd(t3.ar_trd_grp_typ.in(value(MAC_AR_TRD_GRP_TYP.RCV.value()), value(MAC_AR_TRD_GRP_TYP.SETOFF.value()),
					value(MAC_AR_TRD_GRP_TYP.ARSW.value())));

			dbSelect("MSBGL5030_MST_BILL_D_APPL_ACT_S01", dbc, dbc_bldr);
			return !dbc.isEmpty();
		}

		/**
		 * 締解除対象の請求取得<br />
		 * 
		 * 締解除対象の請求ヘッダを取得する
		 * 
		 * @param billMngNo 請求締解除対象の請求管理ＮＯ
		 * @return 締解除対象の請求ヘッダ情報
		 */
		protected MST_BILL_R getCanBill(String billMngNo) {
			MST_BILL_R r = MST_BILL_R.create();
			dbSelectKey("MSBGL5030_MST_BILL_S03", r, MCQueryApiBuilder.create(MST_BILL_R.create("T")), billMngNo);
			return r;
		}
		/**
		 * 前受金に対応する入金実績明細を更新する
		 */
		protected void updRcvActDAdv(String prntBillMngNo) {
			// 入金実績明細の請求管理ＮＯをクリアする
			MST_RCV_ACT_D_R t1 = MST_RCV_ACT_D_R.create("T1");
			MST_RCV_ACT_R t2 = MST_RCV_ACT_R.create("T2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.addInnerJoin(t2,
				t2.rcv_act_no.eq(t1.rcv_act_no)
				.and(t2.rcv_act_seq.eq(t1.rcv_act_seq))
			);
			bldr.setSetVL(t1.bill_mng_no, value(""));
			bldr.setWhere(t1.bill_mng_no.eq(bind("1")), prntBillMngNo);
			bldr.addWhereWithAnd(
				exists(subQuery()
					.select(value("x"))
					.from(t2)
					.where(
						t2.rcv_act_no.eq(t1.rcv_act_no)
						.and(t2.rcv_act_seq.eq(t1.rcv_act_seq))
						.and(
							t2.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.RCV_ADV.value()), 
								value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value()), 
								value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())
							)
						)
				)
			));
			
			MST_RCV_ACT_D_R bind = MST_RCV_ACT_D_R.create();
			bind.bill_mng_no(prntBillMngNo);
			
			dbUpdate("MSBGL5030_MST_RCV_ACT_D_U03", (MCRow)null, bldr);
		}

		/**
		 * 税差額調整取消処理呼び出し<br />
		 * 
		 * 入金実績共通サービスの税差額調整取消処理を呼び出す
		 * 
		 * @param billMngNo 取消対象の請求管理ＮＯ
		 */
		protected void callCanTaxDiff(String billMngNo) {
			MSBGL_RcvActCmnService.RcvActCmn_Del01 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Del01();
			RcvActCmn_Chk04_CndR r = RcvActCmn_Chk04_CndR.create();
			r.bill_mng_no(billMngNo);
			ope.up0().add(r);
			ope.exec();
		}

		/**
		 * 請求取消<br />
		 * 
		 * 請求を取り消す
		 * 
		 * @param billMngNo　取消対象の請求管理ＮＯ
		 * 
		 * @return 取り消した請求ヘッダ情報
		 */
		protected MST_BILL_R canBill(String billMngNo) {
			// 注意：消費税差額調整伝票の取消を行った場合、消費税額が変更されている可能性があるので
			// 請求を再度取得する
			MST_BILL_R canBillR = getCanBill(billMngNo);

			// 取り消した際に同じ請求締年月日で未請求のレコードを検索する
			MCDate billClDt = getBillClDt(canBillR);
			String billMngNoToBeMerged = getBillMngNoToBeMerged(canBillR, billClDt);

			// 請求済相殺額の更新
			canRcvBillSetoffAmt(billMngNo);

			// 未請求のレコードが存在しない場合
			if (isNull(billMngNoToBeMerged)) {
				updCanBill(canBillR, billClDt);
			}
			else {
				mergeCanBill(canBillR, billMngNoToBeMerged);
			}

			canBillR.setStringNE("merged_bill_mng_no", billMngNoToBeMerged);
			canBillR.setDateNE("used_bill_cl_dt", billClDt);

			return canBillR;
		}

		/**
		 * 入金予定マージ<br />
		 * 
		 * 締解除対象の入金予定をマージする
		 * 
		 * @param canBillMngNo 取消対象の請求管理ＮＯ
		 * @param mergeBillMngNo マージ先の請求管理ＮＯ
		 */
		protected void mergeRcvSchd(MST_BILL_R canBillR, String mergeBillMngNo) {
			// 取消対象の入金予定とマージ先の入金予定を検索
			MCList<MST_RCV_SCHD_R> canL = MSBGL_ArUtil.getRcvSchdL(canBillR.bill_mng_no());
			MCList<MST_RCV_SCHD_R> mergeL = MSBGL_ArUtil.getRcvSchdL(mergeBillMngNo);

			MCIndexKey idxkey = mergeL.createIndex(MST_RCV_SCHD_R.$rcv_mtd_cd, MST_RCV_SCHD_R.$rcv_schd_dt);

			// 取消対象の入金予定に紐付く入金予定消込実績を検索
			MCList<MST_RCV_SCHD_APPL_ACT_R> applActL = MCList.create(MST_RCV_SCHD_APPL_ACT_R.class);
			MST_RCV_SCHD_APPL_ACT_R t = MST_RCV_SCHD_APPL_ACT_R.create("T");
			MCQueryApiBuilder applActL_bldr = MCQueryApiBuilder.create(t);
			applActL_bldr.setWhere(t.bill_mng_no.eq(bind("bill_mng_no")));
			dbSelect("MSBGL5030_MST_RCV_SCHD_APPL_ACT_S01", applActL, applActL_bldr, canL);

			for (MST_RCV_SCHD_R canR : canL) {
				MST_RCV_SCHD_R mergeR = mergeL.getFirst(idxkey, canR.rcv_mtd_cd(), canR.rcv_schd_dt());
				if (isNull(mergeR)) {
					// マージ先に存在しないので新規登録
					canR.rcv_schd_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHD));
					canR.bill_mng_no(mergeBillMngNo);
					dbInsert("MSBGL5030_MST_RCV_SCHD_I01", canR, MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T")));
	
					// マージ先に同じ入金方法で、入金予定額がゼロのレコードがある場合は削除する
					MST_RCV_SCHD_R rcvMtdSameR = mergeL.getFirst(idxkey, canR.rcv_mtd_cd());
					if (!isNull(rcvMtdSameR) && rcvMtdSameR.rcv_schd_amt().isZero()) {
						dbDeleteKey("MSBGL5030_MST_RCV_SCHD_D01", rcvMtdSameR, MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T")));
					}
				}
				else {
					// マージ先に存在するので更新
					mergeR.rcv_schd_amt(mergeR.rcv_schd_amt().add(canR.rcv_schd_amt()));
					dbUpdateKey("MSBGL5030_MST_RCV_SCHD_U01", mergeR, MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T")));
				}
			}
			for (MST_RCV_SCHD_APPL_ACT_R canApplActR : applActL) {
				MCList<MST_RCV_SCHD_APPL_ACT_R> mergeApplActL = MCList.create(MST_RCV_SCHD_APPL_ACT_R.class);
				
				MST_RCV_SCHD_APPL_ACT_R t2 = MST_RCV_SCHD_APPL_ACT_R.create("T");
				
				MCQueryApiBuilder mergeApplActL_bldr = MCQueryApiBuilder.create(t2);
				mergeApplActL_bldr.setWhere(t2.bill_mng_no.eq(bind("1")), mergeBillMngNo);
				mergeApplActL_bldr.addWhereWithAnd(t2.rcv_act_dt.eq(bind("1")), canApplActR.rcv_act_dt());
				mergeApplActL_bldr.addWhereWithAnd(t2.rcv_mtd_cd.eq(bind("1")), canApplActR.rcv_mtd_cd());
				dbSelect("MSBGL5030_MST_RCV_SCHD_APPL_ACT_S02", mergeApplActL, mergeApplActL_bldr);
				// 同じ入金予定日、入金方法の入金予定消込実績が存在しない場合、請求管理ＮＯを更新する
				if (mergeApplActL.isEmpty()) {
					canApplActR.bill_mng_no(mergeBillMngNo);
					MST_RCV_SCHD_APPL_ACT_R t3 = MST_RCV_SCHD_APPL_ACT_R.create("T");
					MCQueryApiBuilder canApplActR_bldr = MCQueryApiBuilder.create(t3);
					canApplActR_bldr.setSet(t3.bill_mng_no);

					dbUpdateKey("MSBGL5030_MST_RCV_SCHD_APPL_ACT_U01", canApplActR, canApplActR_bldr);
				}
				// 同じ入金予定日、入金方法の入金予定消込実績が存在する場合、マージする
				else {
					MST_RCV_SCHD_APPL_ACT_R mergeApplActR = mergeApplActL.get(0);
					mergeApplActR.rcv_act_amt(mergeApplActR.rcv_act_amt().add(canApplActR.rcv_act_amt()));
					dbUpdateKey("MSBGL5030_MST_RCV_SCHD_APPL_ACT_U02", mergeApplActR, MCQueryApiBuilder.create(MST_RCV_SCHD_APPL_ACT_R.create("T")));
					
					dbDeleteKey("MSBGL5030_MST_RCV_SCHD_APPL_ACT_D01", canApplActR, MCQueryApiBuilder.create(MST_RCV_SCHD_APPL_ACT_R.create("T")));
				}
			}
		}

		/**
		 * 請求締年月日取得<br />
		 * 
		 * 取り消す請求締年月日を返す
		 * 
		 * @param canBillR 取消を行う請求
		 * 
		 * @return 取り消す請求締年月日
		 */
		protected MCDate getBillClDt(MST_BILL_R canBillR) {
			MCDate billClDt;
			if (MAC_BILL_CL_TYP.isSEL(canBillR.bill_cl_typ())
					|| MAC_BILL_CL_TYP.isEACH_SLS(canBillR.bill_cl_typ())) {
				billClDt = MAC_Y4M.NULL_VAL.value();
			}
			else {
				billClDt = canBillR.bill_cl_dt();
			}
			return billClDt;
		}

		/**
		 * マージ対象請求管理ＮＯ取得<br />
		 * 
		 * 請求取消時にマージする対象の請求の請求管理ＮＯを返す
		 * 
		 * @param canBillR 取消を行う請求
		 * @param billClDt　取消を行う請求締年月日
		 * 
		 * @return　マージ対象の請求管理ＮＯ。存在しないときはnull
		 */
		protected String getBillMngNoToBeMerged(MST_BILL_R canBillR, MCDate billClDt) {
			MST_BILL_R dupBillR = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder dupBillR_bldr = MCQueryApiBuilder.create(t);
			dupBillR_bldr.setSelect(t.bill_mng_no);
			dupBillR_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), canBillR.bcst_cd());
			dupBillR_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), canBillR.bill_dpt_cd());
			dupBillR_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), canBillR.iv_no());
			dupBillR_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), canBillR.trd_cur_cd());
			dupBillR_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())), canBillR.wrk_no());
			dupBillR_bldr.addWhereWithAnd(t.bill_cl_dt.eq(bind("1")), billClDt);
			dupBillR_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			dbSelect("MSBGL5030_MST_BILL_S04", dupBillR, dupBillR_bldr);
			if (dupBillR.isEmpty()) {
				return null;
			}
			else {
				return dupBillR.bill_mng_no();
			}
		}

		/**
		 * 請求取消<br />
		 * 
		 * 請求を取り消す
		 * 
		 * @param canBillR 取消を行う請求
		 * @param billClDt　取消を行う請求締年月日
		 */
		protected void updCanBill(MST_BILL_R canBillR, MCDate billClDt) {
			MCRow bind = MCRow.create();
			bind.setDateNE("bill_cl_dt", billClDt);
			bind.setStringNE("bill_mng_no", canBillR.bill_mng_no());
			if (isSame(billClDt, MAC_Y4M.NULL_VAL.value())) {
				bind.setDateNE("base_dt", getToday());
			}
			else {
				bind.setDateNE("base_dt", billClDt);
			}
			
			MAM_DPT_R dpt = getDpt(canBillR.bill_mng_no(), bind.getDateNE("base_dt"));
			bind.setStringNE("bill_dpt_cd", dpt.dpt_cd());
			bind.setStringNE("wg_cd", dpt.wg_cd());

			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
			bill_bldr.setSetVL(t.bill_dpt_cd, bindEx("bill_dpt_cd"));
			bill_bldr.addSetVL(t.wg_cd, bindEx("wg_cd"));
			bill_bldr.addSetVL(t.bill_no, value(MAC_STR.NULL_VAL.value()));
			bill_bldr.addSetVL(t.bill_rev, value(1));
			bill_bldr.addSetVL(t.bill_cl_dt, bindEx("bill_cl_dt"));
			bill_bldr.addSetVL(t.bill_dt, nullValue());
			bill_bldr.addSetVL(t.base_dt, bindEx("base_dt"));
			bill_bldr.addSetVL(t.bill_tax_calc_typ, value(MSC_BILL_TAX_CALC_TYP.NOT_BILL.value()));
			bill_bldr.addSetVL(t.bill_cl_sts_typ, value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()));
			bill_bldr.addSetVL(t.bill_cl_typ, nullValue());
			bill_bldr.addSetVL(t.prnt_flg, value(false));
			bill_bldr.addSetVL(t.adv_amt, value(0));
			bill_bldr.addSetVL(t.adv_setoff_amt, value(0));
			bill_bldr.addSetVL(t.adv_setoff_tax_amt, value(0));
			bill_bldr.addSetVL(t.bill_xrate, nullValue());
			dbUpdate("MSBGL5030_MST_BILL_U01", bind, bill_bldr);
			setBillClCan(canBillR);
			callBillSendIfSrv(canBillR);
		}

		/**
		 * 請求取消（マージ）<br />
		 * 
		 * 請求をマージし、取り消す
		 * 
		 * @param canBillR 取消を行う請求
		 * @param billMngNoToBeMerged マージする請求の請求管理ＮＯ
		 */
		protected void mergeCanBill(MST_BILL_R canBillR, String billMngNoToBeMerged) {
			// 請求のマージ
			mergeBill(canBillR, billMngNoToBeMerged);

			// 入金予定のマージ
			mergeRcvSchd(canBillR, billMngNoToBeMerged);

			// 請求明細の振替
			updBillDToMerge(canBillR, billMngNoToBeMerged);

			// 元データの削除
			delMergedBill(canBillR.bill_mng_no());
			
			setBillClCan(canBillR);
			callBillSendIfSrv(canBillR);
		}
		
		/**
		 * 請求締解除実績の登録
		 * 
		 * 請求締解除実績のデータをインサート。
		 * 
		 * @param canBillR 取消を行う請求
		 */
		protected void setBillClCan(MST_BILL_R canBillR) {
			MST_BILL_CL_CAN_R insR = MST_BILL_CL_CAN_R.create();
			if(canBillR.prnt_flg()) {
				copy(insR, canBillR, createMap_BILL_BILLCLCAN());
				dbInsertEx("MSBGL5030_MST_BILL_CL_CAN_I01", insR, MCQueryApiBuilder.create(MST_BILL_CL_CAN_R.create("T")));
			}
		}
		
		protected Map_BILL_BILLCLCAN< MST_BILL_CL_CAN_R,MST_BILL_R> createMap_BILL_BILLCLCAN() {
			return new Map_BILL_BILLCLCAN<MST_BILL_CL_CAN_R,MST_BILL_R>();
		}
		
		public class Map_BILL_BILLCLCAN<D extends MST_BILL_CL_CAN_R, S extends MST_BILL_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_mng_no, MST_BILL_R.$bill_mng_no);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bcst_cd, MST_BILL_R.$bcst_cd);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_cl_dt, MST_BILL_R.$bill_cl_dt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_no, MST_BILL_R.$bill_no);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_rev, MST_BILL_R.$bill_rev);
				addColumnPathMap(MST_BILL_CL_CAN_R.$pre_bill_no, MST_BILL_R.$bill_no);
				addColumnPathMap(MST_BILL_CL_CAN_R.$trd_cur_cd, MST_BILL_R.$trd_cur_cd);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_xrate, MST_BILL_R.$bill_xrate);
				addColumnPathMap(MST_BILL_CL_CAN_R.$iv_no, MST_BILL_R.$iv_no);
				addColumnPathMap(MST_BILL_CL_CAN_R.$wrk_no, MST_BILL_R.$wrk_no);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_dpt_cd, MST_BILL_R.$bill_dpt_cd);
				addColumnPathMap(MST_BILL_CL_CAN_R.$wg_cd, MST_BILL_R.$wg_cd);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_dt, MST_BILL_R.$bill_dt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$pre_bill_dt, MST_BILL_R.$bill_dt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$last_bill_amt, MST_BILL_R.$last_bill_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$xfr_amt, MST_BILL_R.$xfr_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$note_amt, MST_BILL_R.$note_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$cash_amt, MST_BILL_R.$cash_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$setoff_amt, MST_BILL_R.$setoff_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$setoff_tax_amt, MST_BILL_R.$setoff_tax_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$sw_amt, MST_BILL_R.$sw_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bfw_amt, MST_BILL_R.$bfw_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$sls_amt, MST_BILL_R.$sls_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$ret_amt, MST_BILL_R.$ret_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$dscnt_amt, MST_BILL_R.$dscnt_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$sw_to_amt, MST_BILL_R.$sw_to_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$tax_amt, MST_BILL_R.$tax_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_amt, MST_BILL_R.$bill_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$adv_amt_bal, MST_BILL_R.$adv_amt_bal);
				addColumnPathMap(MST_BILL_CL_CAN_R.$adv_amt, MST_BILL_R.$adv_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$adv_setoff_amt, MST_BILL_R.$adv_setoff_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$adv_setoff_tax_amt, MST_BILL_R.$adv_setoff_tax_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_each_sls_flg, MST_BILL_R.$bill_each_sls_flg);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_cl_typ, MST_BILL_R.$bill_cl_typ);
				addColumnPathMap(MST_BILL_CL_CAN_R.$foreign_flg, MST_BILL_R.$foreign_flg);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_tax_calc_typ, MST_BILL_R.$bill_tax_calc_typ);
				addColumnPathMap(MST_BILL_CL_CAN_R.$bill_rq_flg, MST_BILL_R.$bill_rq_flg);
				addColumnPathMap(MST_BILL_CL_CAN_R.$base_dt, MST_BILL_R.$base_dt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$rcv_schd_amt, MST_BILL_R.$rcv_schd_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$rcv_act_amt, MST_BILL_R.$rcv_act_amt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$not_appl_bal, MST_BILL_R.$not_appl_bal);
				addColumnPathMap(MST_BILL_CL_CAN_R.$last_rcv_dt, MST_BILL_R.$last_rcv_dt);
				addColumnPathMap(MST_BILL_CL_CAN_R.$rcv_schd_adjst_flg, MST_BILL_R.$rcv_schd_adjst_flg);
				addColumnPathMap(MST_BILL_CL_CAN_R.$sub_char1, MST_BILL_R.$sub_char1);
				addColumnPathMap(MST_BILL_CL_CAN_R.$sub_char2, MST_BILL_R.$sub_char2);
				addColumnPathMap(MST_BILL_CL_CAN_R.$sub_char3, MST_BILL_R.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {

				MCList<MST_BILL_D_R> partBillDL = MCList.create(MST_BILL_D_R.class);
				MST_BILL_D_R t = MST_BILL_D_R.create("T");
				MCQueryApiBuilder partBillDL_bldr = MCQueryApiBuilder.create(t);
				partBillDL_bldr.setWhere(t.bill_mng_no.eq(bind("1")), src.bill_mng_no());
				dbSelect("MSBGL5030_MST_BILL_D_S16", partBillDL, partBillDL_bldr);
				dest.dtl_cnt(partBillDL.size());

				partBillDL_bldr.setWhere(t.bill_mng_no.eq(bind("1")), src.bill_mng_no());
				partBillDL_bldr.addWhereWithAnd(t.interim_flg.eq(value(true)));
				partBillDL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
				dbSelect("MSBGL5030_MST_BILL_D_S17", partBillDL, partBillDL_bldr);
				dest.exists_interim_flg(partBillDL.size() > 0);
				
				MCIndexKey ik = _ediIfCtrL.createIndex(MAM_EDI_IF_CTL_R.$bp_cd);
				Boolean isEdi = !isNull(_ediIfCtrL.getFirst(ik, src.bcst_cd()));
				
				dest.bill_cl_sts_typ(MSC_BILL_CL_STS_TYP.CL_CAN.value());
				dest.prnt_flg(isEdi);
				dest.edi_flg(isEdi);
			}
		}
		
		/**
		 * 請求送信ＩＦサービス呼出
		 * 
		 * 請求締解除時の請求送信ＩＦサービス呼び出し。
		 * 
		 * @param canBillR 取消を行う請求
		 */
		protected void callBillSendIfSrv(MST_BILL_R canBillR) {
			if(canBillR.prnt_flg()) {
				MCIndexKey ik = _ediIfCtrL.createIndex(MAM_EDI_IF_CTL_R.$bp_cd);
				if (!isNull(_ediIfCtrL.getFirst(ik, canBillR.bcst_cd()))) {
					MSLAL_BillSendIfService.BillSendIf_Upd01 ope = MSLAL_BillSendIfService.crtBillSendIf_Upd01();
					Bill_Send01_HdrR billSendHdr = Bill_Send01_HdrR.create();
					billSendHdr.bill_mng_no(canBillR.bill_mng_no());
					billSendHdr.bill_print_flg(true);
					billSendHdr.bill_close_cancel_flg(true);
					ope.up0().add(billSendHdr);
					ope.exec();
				}
			}
		}
		
		/**
		 * ＥＤＩ ＩＦ制御マスタを取得する。
		 */
		protected void getEdiIf() {
			MAM_EDI_IF_CTL_R t = MAM_EDI_IF_CTL_R.create("T");
			MCQueryApiBuilder ediifctrL_bldr = MCQueryApiBuilder.create(t);
			ediifctrL_bldr.setSelect(t.if_proc_typ, t.bp_cd);
			ediifctrL_bldr.setWhere(t.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value()))
					.and(value(getToday()).between(t.st_dt, t.end_dt)));
			dbSelect("MSBGL5030_MAM_EDI_IF_CTL_S01", _ediIfCtrL, ediifctrL_bldr);
		}
		/**
		 * 請求マージ<br />
		 * 
		 * 取り消す請求と既存の請求をマージする
		 * 
		 * @param canBillR 取消を行う請求
		 * @param billMngNoToBeMerged マージする請求の請求管理ＮＯ
		 */
		protected void mergeBill(MST_BILL_R canBillR, String billMngNoToBeMerged) {
			MST_BILL_R bind = canBillR.clone();
			bind.bill_mng_no(billMngNoToBeMerged);
			bind.setNumberNE("rcv", canBillR.xfr_amt().add(canBillR.note_amt())
					.add(canBillR.cash_amt()).add(canBillR.sw_amt()));
			bind.setNumberNE("bill", canBillR.sls_amt().add(canBillR.ret_amt())
					.add(canBillR.dscnt_amt()).add(canBillR.sw_to_amt()).add(canBillR.tax_amt())
					.subtract(canBillR.setoff_amt()).subtract(canBillR.setoff_tax_amt()));
			bind.setDateNE("base_dt", canBillR.base_dt());
			bind.setNumberNE("rcv_schd_amt", canBillR.rcv_schd_amt());
			bind.setNumberNE("rcv_act_amt", canBillR.rcv_act_amt());
			bind.setNumberNE("not_appl_bal", canBillR.not_appl_bal());
			
			MAM_DPT_R dpt = getDpt(billMngNoToBeMerged, bind.getDateNE("base_dt"));
			bind.setStringNE("bill_dpt_cd", dpt.dpt_cd());
			bind.setStringNE("wg_cd", dpt.wg_cd());

			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder t_bldr = MCQueryApiBuilder.create(t);
			t_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
			t_bldr.setSetVL(t.bill_dpt_cd, bindEx("bill_dpt_cd"));
			t_bldr.addSetVL(t.wg_cd, bindEx("wg_cd"));
			t_bldr.addSetVL(t.xfr_amt, t.xfr_amt.add(bindEx("xfr_amt")));
			t_bldr.addSetVL(t.note_amt, t.note_amt.add(bindEx("note_amt")));
			t_bldr.addSetVL(t.cash_amt, t.cash_amt.add(bindEx("cash_amt")));
			t_bldr.addSetVL(t.setoff_amt, t.setoff_amt.add(bindEx("setoff_amt")));
			t_bldr.addSetVL(t.setoff_tax_amt, t.setoff_tax_amt.add(bindEx("setoff_tax_amt")));
			t_bldr.addSetVL(t.sw_amt, t.sw_amt.add(bindEx("sw_amt")));
			t_bldr.addSetVL(t.bfw_amt, t.bfw_amt.subtract(bindEx("rcv")));
			t_bldr.addSetVL(t.sls_amt, t.sls_amt.add(bindEx("sls_amt")));
			t_bldr.addSetVL(t.ret_amt, t.ret_amt.add(bindEx("ret_amt")));
			t_bldr.addSetVL(t.dscnt_amt, t.dscnt_amt.add(bindEx("dscnt_amt")));
			t_bldr.addSetVL(t.sw_to_amt, t.sw_to_amt.add(bindEx("sw_to_amt")));
			t_bldr.addSetVL(t.tax_amt, t.tax_amt.add(bindEx("tax_amt")));
			t_bldr.addSetVL(t.bill_amt, t.bill_amt.subtract(bindEx("rcv")).add(bindEx("bill")));
			t_bldr.addSetVL(t.rcv_schd_amt, t.rcv_schd_amt.add(bindEx("rcv_schd_amt")));
			t_bldr.addSetVL(t.rcv_act_amt, t.rcv_act_amt.add(bindEx("rcv_act_amt")));
			t_bldr.addSetVL(t.not_appl_bal, t.not_appl_bal.add(bindEx("not_appl_bal")));
			dbUpdate("MSBGL5030_MST_BILL_U02", bind, t_bldr);

		}

		/**
		 * 請求明細振替<br />
		 * 
		 * 取り消す請求に紐付く請求明細が参照する請求をマージ先のものに振り替える
		 * 
		 * @param canBillR 取消を行う請求
		 * @param billMngNoToBeMerged マージする請求の請求管理ＮＯ
		 */
		protected void updBillDToMerge(MST_BILL_R canBillR, String billMngNoToBeMerged) {
			MCRow bind = MCRow.create();
			bind.setStringNE("can_bill_mng_no", canBillR.bill_mng_no());
			bind.setStringNE("merged_bill_mng_no", billMngNoToBeMerged);

			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder t_bldr = MCQueryApiBuilder.create(t);
			t_bldr.setWhere(t.bill_mng_no.eq(bindEx("can_bill_mng_no")));
			t_bldr.setSetVL(t.bill_mng_no, bindEx("merged_bill_mng_no"));
			dbUpdate("MSBGL5030_MST_BILL_D_U01", bind, t_bldr);

			// 一部請求の請求明細を元に戻す
			updPartBillD(billMngNoToBeMerged);
		}
		
		/**
		 * 一部請求の請求明細を更新する
		 * 
		 * @param billMngNo マージする請求の請求管理ＮＯ
		 */
		protected void updPartBillD(String billMngNo) {
			MCList<MST_BILL_D_R> partBillDL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder partBillDL_bldr = MCQueryApiBuilder.create(t);
			partBillDL_bldr.setWhere(t.bill_mng_no.eq(bind("1")), billMngNo);
			partBillDL_bldr.addWhereWithAnd(t.bill_mtd_typ.eq(value(MSC_BILL_MTD_TYP.PART_BILL.value())));
			partBillDL_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
			partBillDL_bldr.setOrderByDesc(t.crryovr_bill_d_no);
			dbSelect("MSBGL5030_MST_BILL_D_S05", partBillDL, partBillDL_bldr);

			MCNumber amtDecPlace = getBaseCur().amt_dec_place();
			String rndMode = getCo().xrate_rnd_typ();
			
			MCQueryApiBuilder billDDeleteKey_bldr = MCQueryApiBuilder.create(MST_BILL_D_R.create("T"));
			MCQueryApiBuilder applBalDeleteKey_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_BAL_R.create("T"));

			for (MST_BILL_D_R partBillDR : partBillDL) {
				// ループ内で繰越請求明細ＮＯが変わることがあるので再取得する
				partBillDR = getBillD(partBillDR.bill_d_no());

				// 繰越先の請求明細ＮＯ
				String crryovrBillDNo = partBillDR.crryovr_bill_d_no();
				// 繰越元の請求明細ＮＯ
				String crryovrSrcBillDNo = partBillDR.crryovr_src_bill_d_no();

				// 繰越先の情報を検索
				MST_BILL_D_R crryovrBillDR = getBillD(partBillDR);
				MST_BILL_D_R t4 = MST_BILL_D_R.create("T");
				if (crryovrBillDR.isEmpty()
					|| execDbCount("MSBGL5030_MST_BILL_D_S14", t4, t4.crryovr_src_bill_d_no.eq(bind("1")), crryovrBillDR.bill_d_no()) > 0) {
					// 締年月日が異なる、または一部請求済みの場合はマージしない
					continue;
				}
				MCList<MST_BILL_D_APPL_BAL_R> crryovrApplBalL =
						getBillDApplBal(crryovrBillDNo);

				// 一部請求の情報を更新
				updPartBillD(partBillDR, crryovrBillDR, amtDecPlace, rndMode);
				MCList<MST_BILL_D_APPL_BAL_R> partApplBalL =
						getBillDApplBal(partBillDR.bill_d_no());
				updPartApplBal(partApplBalL, crryovrApplBalL);
				updPartApplAct(partApplBalL, crryovrApplBalL);

				// 繰越先の情報を削除
				dbDeleteKey("MSBGL5030_MST_BILL_D_D02", crryovrBillDR, billDDeleteKey_bldr);
				dbDeleteKey("MSBGL5030_MST_BILL_D_APPL_BAL_D01", crryovrApplBalL, applBalDeleteKey_bldr);

				// 一部請求明細の繰越元の請求明細が他の一部請求明細の繰越請求明細になっている場合、
				// 他の一部請求明細の繰越請求明細ＮＯを今回締解除対象の請求明細ＮＯに更新する
				MCRow bindR = MCRow.create();
				bindR.setStringNE("crryovr_src_bill_d_no", crryovrSrcBillDNo);
				bindR.setStringNE("crryovr_bill_d_no", partBillDR.bill_d_no());
				
				MST_BILL_D_R t2 = MST_BILL_D_R.create("T");
				MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t2);
				bill_bldr.setWhere(t2.crryovr_bill_d_no.eq(bindEx("crryovr_src_bill_d_no")));
				bill_bldr.setSetVL(t2.crryovr_bill_d_no, bindEx("crryovr_bill_d_no"));
				dbUpdate("MSBGL5030_MST_BILL_D_U02", bindR, bill_bldr);
				// 繰越元の請求明細を削除
				MST_BILL_D_R crryovrSrcBillDR = getBillD(crryovrSrcBillDNo);
				dbDeleteKey("MSBGL5030_MST_BILL_D_D03", crryovrSrcBillDR, billDDeleteKey_bldr);
			}
		}

		/**
		 * 繰越請求明細を検索する
		 * 
		 * @param billDNo 繰越請求明細ＮＯ
		 * 
		 * @return 繰越請求明細情報
		 */
		protected MST_BILL_D_R getBillD(String billDNo) {
			MST_BILL_D_R billDR = MST_BILL_D_R.create();
			MST_BILL_R t2 = MST_BILL_R.create("T2");
			MST_BILL_ACST_R t3 = MST_BILL_ACST_R.create("T3");
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDR_bldr = MCQueryApiBuilder.create(t);
			billDR_bldr.addSelect(t2.trd_cur_cd, t2.wrk_no, t3.acst_cd, t3.ar_dpt_cd, t3.ar_typ);
			billDR_bldr.addLeftOuterJoin(t2, t.bill_mng_no.eq(t2.bill_mng_no));
			billDR_bldr.addLeftOuterJoin(t3, t.bill_acst_no.eq(t3.bill_acst_no));
			dbSelectKey("MSBGL5030_MST_BILL_D_S06", billDR, billDR_bldr, billDNo);
			return billDR;
		}

		/**
		 * 繰越請求明細を検索する<br />
		 * 
		 * 繰越元と同じ請求年月の請求明細のみ取得する
		 * 
		 * @param partBillDR 繰越請求明細
		 * 
		 * @return 繰越請求明細情報
		 */
		protected MST_BILL_D_R getBillD(MST_BILL_D_R partBillDR) {
			MST_BILL_D_R billDR = MST_BILL_D_R.create();
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MST_BILL_R t2 = MST_BILL_R.create("T2");
			MST_BILL_R S1W1 = MST_BILL_R.create("W1");
			MCQueryApiBuilder billDR_bldr = MCQueryApiBuilder.create(t);
			billDR_bldr.addInnerJoin(t2, t.bill_mng_no.eq(t2.bill_mng_no));
			billDR_bldr.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(S1W1).where(t2.bill_cl_dt.eq(S1W1.bill_cl_dt)
							.and(S1W1.bill_mng_no.eq(bind("1"))))),
					partBillDR.bill_mng_no());
			billDR_bldr.addWhereWithAnd(t.bill_d_no.eq(bind("1")), partBillDR.crryovr_bill_d_no());
			dbSelect("MSBGL5030_MST_BILL_D_S07", billDR, billDR_bldr);
			return billDR;
		}

		/**
		 * 一部請求した請求明細を更新する
		 * 
		 * @param destR 更新対象の請求明細
		 * @param srcR 繰越請求明細
		 * @param amtDecPlace 金額小数部有効桁数
		 * @param rndMode 端数処理区分
		 */
		protected void updPartBillD(MST_BILL_D_R billDR, MST_BILL_D_R crryovrBillDR,
				MCNumber amtDecPlace, String rndMode) {
			billDR.bill_mtd_typ(MSC_BILL_MTD_TYP.ALL_BILL.value());
			billDR.crryovr_bill_d_no(null);
			MST_BILL_D_R crryovrSrcBillDR = getBillD(billDR.crryovr_src_bill_d_no());
			if (!isNull(crryovrSrcBillDR.crryovr_src_bill_d_no())) {
				// 繰越元の請求明細が繰越分の場合は、繰越元の値を引き継ぐ（繰越元は削除するので）
				billDR.bill_mtd_typ(crryovrSrcBillDR.bill_mtd_typ());
				billDR.crryovr_bill_d_no(crryovrSrcBillDR.crryovr_bill_d_no());
				billDR.crryovr_src_bill_d_no(crryovrSrcBillDR.crryovr_src_bill_d_no());
			}
			else {
				billDR.crryovr_src_bill_d_no(null);
			}
			billDR.trd_cur_amt(billDR.trd_cur_amt().add(crryovrBillDR.trd_cur_amt()));
			billDR.base_cur_amt(billDR.base_cur_amt().add(crryovrBillDR.base_cur_amt()));
			billDR.trd_cur_tax_amt(billDR.trd_cur_tax_amt().add(crryovrBillDR.trd_cur_tax_amt()));
			billDR.base_cur_tax_amt(billDR.base_cur_tax_amt().add(crryovrBillDR.base_cur_tax_amt()));

			dbUpdateKey("MSBGL5030_MST_BILL_D_U03", billDR, MCQueryApiBuilder.create(MST_BILL_D_R.create("T")));
		}

		/**
		 * 一部請求した請求明細消込残高を更新する
		 * 
		 * @param partBillDR 一部請求した請求明細情報
		 * @param crryovrApplBalR 繰越先の請求明細消込残高
		 */
		protected void updPartApplBal(MCList<MST_BILL_D_APPL_BAL_R> applBalL,
				MCList<MST_BILL_D_APPL_BAL_R> crryovrApplBalL) {
			
			MCQueryApiBuilder applBalR_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_BAL_R.create("T"));
			for (MST_BILL_D_APPL_BAL_R applBalR : applBalL) {
				// 繰越先からマージ先の親請求明細ＮＯが同じ情報を取得する
				MST_BILL_D_APPL_BAL_R crryovrApplBalR = crryovrApplBalL.getFirst(
						MST_BILL_D_APPL_BAL_R.$parent_bill_d_no, applBalR.parent_bill_d_no());
				// 請求振替残高をしている場合、親請求明細ＮＯが同じ情報を特定してマージする
				if (!isNull(crryovrApplBalR)) {
					applBalR.appl_tgt_amt(applBalR.appl_tgt_amt().add(crryovrApplBalR.appl_tgt_amt()));
					applBalR.appl_amt(applBalR.appl_amt().add(crryovrApplBalR.appl_amt()));
					applBalR.not_appl_bal(applBalR.not_appl_bal().add(crryovrApplBalR.not_appl_bal()));
					dbUpdateKey("MSBGL5030_MST_BILL_D_APPL_BAL_U01", applBalR, applBalR_bldr);
				}
				// それ以外の場合、請求明細消込残高は必ず1件のみとなるので、
				// リストの1件目から取得したデータをマージする
				else {
					applBalR.appl_tgt_amt(applBalR.appl_tgt_amt().add(crryovrApplBalL.get(0).appl_tgt_amt()));
					applBalR.appl_amt(applBalR.appl_amt().add(crryovrApplBalL.get(0).appl_amt()));
					applBalR.not_appl_bal(applBalR.not_appl_bal().add(crryovrApplBalL.get(0).not_appl_bal()));
					dbUpdateKey("MSBGL5030_MST_BILL_D_APPL_BAL_U02", applBalR, applBalR_bldr);
				}
			}
		}

		/**
		 * 繰越先の請求明細消込実績を一部請求の請求明細に付け替える
		 * 
		 * @param crryovrBillDNo
		 * @param partBillDNo
		 */
		protected void updPartApplAct(MCList<MST_BILL_D_APPL_BAL_R> applBalL, MCList<MST_BILL_D_APPL_BAL_R> crryovrApplBalL) {

			MCQueryApiBuilder applActR_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_ACT_R.create("T"));
			MCQueryApiBuilder crrovrApplActR_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_ACT_R.create("T"));

			for (MST_BILL_D_APPL_BAL_R applBalR : applBalL) {

				// 一部請求の請求明細消込実績を取得する
				MCList<MST_BILL_D_APPL_ACT_R> applActL =
						getBillDApplAct(applBalR);

				MST_BILL_D_APPL_BAL_R crryovrApplBalR = crryovrApplBalL.getFirst(
						MST_BILL_D_APPL_BAL_R.$parent_bill_d_no, applBalR.parent_bill_d_no());

				if (!isNull(crryovrApplBalR)) {
					// 繰越先の請求明細消込実績を習得する
					MCList<MST_BILL_D_APPL_ACT_R> crryovrApplActL =
							getBillDApplAct(crryovrApplBalR);

					
					for(MST_BILL_D_APPL_ACT_R applActR : applActL) {
						MST_BILL_D_APPL_ACT_R crrovrApplActR = crryovrApplActL.getFirst(
								MST_BILL_D_APPL_ACT_R.$rcv_act_d_no, applActR.rcv_act_d_no());
						if (!isNull(crrovrApplActR)) {
							applActR.appl_amt(applActR.appl_amt().add(
									crrovrApplActR.appl_amt()));
							dbUpdateKey("MSBGL5030_MST_BILL_D_APPL_ACT_U01", applActR, applActR_bldr);

							crryovrApplActL.remove(crrovrApplActR);
							dbDeleteKey("MSBGL5030_MST_BILL_D_APPL_ACT_D01", crrovrApplActR, crrovrApplActR_bldr);
						}
					}
					MCRow bindR = MCRow.create();
					bindR.setStringNE("c_bill_d_no", crryovrApplBalR.bill_d_no());
					bindR.setStringNE("c_parent_bill_d_no", crryovrApplBalR.parent_bill_d_no());
					bindR.setStringNE("p_bill_d_no", applBalR.bill_d_no());
					bindR.setStringNE("p_parent_bill_d_no", applBalR.parent_bill_d_no());
					
					MST_BILL_D_APPL_ACT_R t = MST_BILL_D_APPL_ACT_R.create("T");
					MCQueryApiBuilder billDApplAct_bldr = MCQueryApiBuilder.create(t);
					billDApplAct_bldr.setWhere(t.bill_d_no.eq(bindEx("c_bill_d_no"))
							.and(t.parent_bill_d_no.eq(bindEx("c_parent_bill_d_no"))));
					billDApplAct_bldr.setSetVL(t.bill_d_no, bindEx("p_bill_d_no"));
					billDApplAct_bldr.addSetVL(t.parent_bill_d_no, bindEx("p_parent_bill_d_no"));
					dbUpdate("MSBGL5030_MST_BILL_D_APPL_ACT_U02", bindR, billDApplAct_bldr);
				}
			}
		}

		/**
		 * マージ済み請求削除<br />
		 * 
		 * マージが完了した請求、入金予定を削除する
		 * 
		 * @param billMngNo 取り消した請求の請求管理ＮＯ
		 */
		protected void delMergedBill(String billMngNo) {
			MST_BILL_R t = MST_BILL_R.create("T");
			MST_RCV_SCHD_R t1 = MST_RCV_SCHD_R.create("T");
			execDbDelete("MSBGL5030_MST_BILL_D01", t, t.bill_mng_no.eq(bind("1")), billMngNo);
			execDbDelete("MSBGL5030_MST_RCV_SCHD_D02", t1, t1.bill_mng_no.eq(bind("1")), billMngNo);
		}

		/**
		 * 請求洗い替え<br />
		 * 
		 * 最新の締処理済請求か、未請求請求以降の未請求請求を洗い替える
		 * 
		 * @param canBillR 取り消した請求
		 * 
		 * @return 洗い替えた請求
		 */
		protected MST_BILL_R updLastBill(MST_BILL_R canBillR) {
			// 最新の締処理済請求を取得。
			// 取消後なので、取消を行った請求以外で最新の締処理済請求が存在している場合に取得できる。
			// 取得できない場合、最新の未請求請求を取得する。
			MST_BILL_R lastBillR = getLastBill(canBillR);
			if (isNull(lastBillR.bill_mng_no())) {
				lastBillR = getLastNotBill(canBillR.bcst_cd(), canBillR.bill_dpt_cd(),
						canBillR.iv_no(), canBillR.trd_cur_cd(), canBillR.wrk_no());
			}
			// 最新の締処理済請求か、未請求請求以降の未請求請求を洗い替え
			updFollowingBill(lastBillR.bill_mng_no(), canBillR.bill_cl_dt());

			return lastBillR;
		}

		/**
		 * 締処理済請求取得<br />
		 * 
		 * 最新の締処理済の請求を返す
		 * 
		 * @param cndR 条件となる請求（請求先ＣＤ、請求部門ＣＤ、インボイスＮＯ、通貨ＣＤ、請求管理ＮＯが使用される）
		 * 
		 * @return 最新の締処理済の請求。存在しなかった場合は空のコンテナを返す
		 */
		protected MST_BILL_R getLastBill(MST_BILL_R cndR) {
			MST_BILL_R r = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			String maxBillMngNo = getLastBillMngNo(cndR, null);
			if (!isNull(maxBillMngNo)) {
				r_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), maxBillMngNo);
				dbSelect("MSBGL5030_MST_BILL_S05", r, r_bldr);
			}
			return r;
		}

		/**
		 * 最新請求管理ＮＯ取得<br />
		 * 
		 * 最新の請求管理ＮＯを返す
		 * 
		 * @param cndR 条件となるコンテナ（請求先ＣＤ、請求部門ＣＤ、インボイスＮＯ、通貨ＣＤ、案件ＣＤを使用する）
		 * @param prntBillId 発番請求管理ＮＯ。指定しない場合はnull
		 * 
		 * @return 最新の請求管理ＮＯ
		 */
		protected String getLastBillMngNo(MCRow cndR, String prntBillMngNo) {
			MST_BILL_R r = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.addMax(t.bill_mng_no, "bill_mng_no");
			r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), cndR.getString("bcst_cd"));
			r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), cndR.getString("bill_dpt_cd"));
			r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), cndR.getString("iv_no"));
			r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), cndR.getString("trd_cur_cd"));
			r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())), cndR.getString("wrk_no"));
			r_bldr.addWhereWithAnd(
					t.bill_cl_sts_typ.in(value(MSC_BILL_CL_STS_TYP.CL_SCRN.value()), value(MSC_BILL_CL_STS_TYP.CL_BATCH.value())));
			r_bldr.addWhereWithCutOffAnd(t.bill_mng_no.neq(bind("1")), prntBillMngNo);
			dbSelect("MSBGL5030_MST_BILL_S06", r, r_bldr);
			return r.bill_mng_no();
		}

		/**
		 * 未請求請求取得<br />
		 * 
		 * 最新の未請求の請求を返す
		 * 
		 * @param bcstCd 検索条件となる請求先ＣＤ
		 * @param billDptCd 検索条件となる請求部門ＣＤ
		 * @param ivNo 検索条件となるインボイスＮＯ
		 * @param trdCurCd 検索条件となる通貨ＣＤ
		 * @param wrkNo 検索条件となる案件ＣＤ
		 * 
		 * @return 最新の未請求請求
		 */
		protected MST_BILL_R getLastNotBill(String bcstCd, String billDptCd, String ivNo, String trdCurCd, String wrkNo) {
			MCList<MST_BILL_R> l = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
			l_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), billDptCd);
			l_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), ivNo);
			l_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), trdCurCd);
			l_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())), wrkNo);
			l_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			l_bldr.addOrderByAsc(t.bill_cl_dt);
			dbSelect("MSBGL5030_MST_BILL_S07", l, l_bldr);
			return l.get(0);
		}

		/**
		 * 売掛先別請求取消<br />
		 * 
		 * 売掛先別請求を取り消す
		 * 
		 * @param canBillR 取り消した請求
		 * @param lastBillR 洗い替えた請求
		 */
		protected void canBillAcst(MST_BILL_R canBillR, MST_BILL_R lastBillR) {

			// マージした場合、canBillRのmerged_bill_mng_noという一時カラムにマージ先の請求管理ＮＯを
			// セットしている。マージしていない場合は請求を取り消しにするだけで売掛先別請求も紐付いたままなので、
			// 処理する必要なし。
			String mergedBillMngNo = canBillR.getString("merged_bill_mng_no");

			for (MST_BILL_ACST_R canBillAcstR : getCanBillAcstL(canBillR.bill_mng_no())) {
				if (!isNull(mergedBillMngNo)) {
					// 取消した際の重複チェック
					MST_BILL_ACST_R ids = getBillAcstIds(canBillAcstR, mergedBillMngNo);
					//  重複しない場合
					if (ids.isEmpty()) {
						updCanBillAcst(canBillAcstR, mergedBillMngNo);
					}
					// 重複する場合
					else {
						mergeCanBillAcst(canBillAcstR, ids);
					}
				}
				else {
					// 排他チェックのため空更新
					MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
					MCQueryApiBuilder applSchd_bldr = MCQueryApiBuilder.create(t);
					applSchd_bldr.setWhere(t.bill_acst_no.eq(bindEx("bill_acst_no")));
					applSchd_bldr.setSetVL(t.bill_acst_no, bindEx("bill_acst_no"));
					dbUpdate("MSBGL5030_MST_AR_APPL_SCHD_U01", canBillAcstR, applSchd_bldr);
				}
				// 未請求の売掛先別請求を洗い替える
				updLastBillAcst(lastBillR);
			}
		}

		/**
		 * 取消対象売掛先別請求取得<br />
		 * 
		 * 取消対象の売掛先別請求を返す
		 * 
		 * @param billMngNo　取り消した請求の請求ＩＤ
		 * 
		 * @return 取消対象の売掛先別請求
		 */
		protected MCList<MST_BILL_ACST_R> getCanBillAcstL(String billMngNo) {
			MCList<MST_BILL_ACST_R> l = MCList.create(MST_BILL_ACST_R.class);
			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), billMngNo);
			dbSelectForUpdateNoWait("MSBGL5030_MST_BILL_ACST_S01", l, l_bldr);
			return l;
		}

		/**
		 * マージ対象売掛別請求管理ＮＯ取得<br />
		 * 
		 * マージ対象の売掛先別請求の売掛別請求ＮＯを返す
		 * 
		 * @param canBillAcstR 取り消した請求
		 * @param mergedBillMngNo マージした請求の請求管理ＮＯ
		 * 
		 * @return マージ対象の売掛先別請求の売掛別請求ＮＯ。<br />
		 */
		protected MST_BILL_ACST_R getBillAcstIds(MST_BILL_ACST_R canBillAcstR, String mergedBillMngNo) {
			MST_BILL_ACST_R r = MST_BILL_ACST_R.create();
			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder t_bldr = MCQueryApiBuilder.create(t);

			t_bldr.setSelect(t.bill_acst_no);
			t_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), mergedBillMngNo);
			t_bldr.addWhereWithAnd(t.acst_cd.eq(bind("1")), canBillAcstR.acst_cd());
			t_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("1")), canBillAcstR.ar_dpt_cd());
			t_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), canBillAcstR.ar_typ());
			dbSelect("MSBGL5030_MST_BILL_ACST_S02", r, t_bldr);
			return r;
		}

		/**
		 * 売掛先別請求取消<br />
		 * 
		 * 売掛先別請求を取り消す
		 * 
		 * @param currentBillAcstR 取り消す売掛先別請求
		 * @param mergedBillMngNo 取り消した請求の請求管理ＮＯ
		 */
		protected void updCanBillAcst(MST_BILL_ACST_R currentBillAcstR,
				String mergedBillMngNo) {
			// 請求管理ＮＯの振替
			// 請求は取消を行った同月に存在するが、売掛先別請求は存在しなかった場合、
			// 該当の売掛先別請求は請求管理ＮＯを付け替える。
			// 請求明細は売掛先別請求に紐付いたままでよい。
			// （請求も取消した同月に存在しない場合は請求レコードを未請求状態にする処理
			// のみでよく、売掛先別請求、請求明細の紐付きを変更する必要がない。）
			MST_BILL_ACST_R updR = currentBillAcstR.clone();

			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);
			updR_bldr.setSet(t.bill_mng_no);
			updR.bill_mng_no(mergedBillMngNo);

			dbUpdateKey("MSBGL5030_MST_BILL_ACST_U01", updR, updR_bldr);
		}

		/**
		 * 売掛先別請求取消（マージ）<br />
		 * 
		 * 売掛先別請求をマージし取り消す
		 * 
		 * @param canBillAcstR 取り消す売掛先別請求
		 * @param ids 売掛別請求ＩＤを持ったコンテナ
		 */
		protected void mergeCanBillAcst(MST_BILL_ACST_R canBillAcstR,
				MST_BILL_ACST_R ids) {
			// 売掛先別請求のマージ
			mergeBillAcst(canBillAcstR, ids.bill_acst_no());
			// 請求明細の振替
			updBillDToMerge(canBillAcstR, ids.bill_acst_no());
			// 売掛消込予定のマージ
			mergeArApplSchd(canBillAcstR, ids.bill_acst_no());
			// 元データの削除
			delMergedBillAcst(canBillAcstR.bill_acst_no());
		}

		/**
		 * 売掛消込予定のマージ<br />
		 * 
		 * 取消対象の売掛消込予定をマージする
		 * 
		 * @param canBillAcstR 取消対象の売掛先別請求ＮＯ
		 * @param mergeBillAcstNo マージ先の売掛先別請求ＮＯ
		 */
		protected void mergeArApplSchd(MST_BILL_ACST_R canBillAcstR, String mergeBillAcstNo) {
			// 取消対象の売掛消込予定を検索
			MCList<MST_AR_APPL_SCHD_R> canL =
					getArApplSchd(canBillAcstR.bill_acst_no());
			// マージ先の売掛消込予定を検索
			MCList<MST_AR_APPL_SCHD_R> mergeL =
					getArApplSchd(mergeBillAcstNo);

			MCIndexKey idxkey = mergeL.createIndex(
					MST_AR_APPL_SCHD_R.$iv_no,
					MST_AR_APPL_SCHD_R.$ar_typ,
					MST_AR_APPL_SCHD_R.$rcv_mtd_cd,
					MST_AR_APPL_SCHD_R.$rcv_schd_dt);

			// 取消対象の売掛消込予定ＮＯに紐付く売掛消込実績を検索
			MCList<MST_AR_APPL_ACT_R> actL = MCList.create(MST_AR_APPL_ACT_R.class);
			MST_AR_APPL_ACT_R t = MST_AR_APPL_ACT_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
			actL_bldr.setWhere(t.ar_appl_schd_no.eq(bind("ar_appl_schd_no")));
			dbSelect("MSBGL5030_MST_AR_APPL_ACT_S01", actL, actL_bldr, canL.groupBy(MST_AR_APPL_SCHD_R.$ar_appl_schd_no));

			MCQueryApiBuilder applSchd_bldr = MCQueryApiBuilder.create(MST_AR_APPL_SCHD_R.create("T"));
			for (MST_AR_APPL_SCHD_R canR : canL) {
				MST_AR_APPL_SCHD_R mergeR =
						mergeL.getFirst(idxkey, canR.iv_no(), canR.ar_typ(),
								canR.rcv_mtd_cd(), canR.rcv_schd_dt());
				String canArApplSchdNo = canR.ar_appl_schd_no();
				String mergeArApplSchdNo;
				if (isNull(mergeR)) {
					// マージ先に存在しないので新規登録
					mergeArApplSchdNo = getStrSeq(MSC_NUM_SYS_TYP.ARAPPLSCHD);
					canR.ar_appl_schd_no(mergeArApplSchdNo);
					canR.bill_acst_no(mergeBillAcstNo);
					dbInsert("MSBGL5030_MST_AR_APPL_SCHD_I01", canR, applSchd_bldr);
				}
				else {
					// マージ先に存在するので更新
					mergeArApplSchdNo = mergeR.ar_appl_schd_no();
					mergeR.appl_tgt_amt(mergeR.appl_tgt_amt().add(canR.appl_tgt_amt()));
					mergeR.appl_amt(mergeR.appl_amt().add(canR.appl_amt()));
					mergeR.not_appl_bal(mergeR.appl_tgt_amt().subtract(mergeR.appl_amt()));
					dbUpdateKey("MSBGL5030_MST_AR_APPL_SCHD_U02", mergeR, applSchd_bldr);
				}
				// 売掛消込実績を付け替える
				MCList<MST_AR_APPL_ACT_R> subActL =
						actL.subList(MST_AR_APPL_ACT_R.$ar_appl_schd_no, canArApplSchdNo);
				if (!isNull(subActL)) {
					subActL.setString(MST_AR_APPL_ACT_R.$ar_appl_schd_no, mergeArApplSchdNo);
					
					MST_AR_APPL_ACT_R t2 = MST_AR_APPL_ACT_R.create("T");
					MCQueryApiBuilder subActL_bldr = MCQueryApiBuilder.create(t2);
					subActL_bldr.setSet(t2.ar_appl_schd_no);
					dbUpdateKey("MSBGL5030_MST_AR_APPL_ACT_U01", subActL, subActL_bldr);
				}
			}
		}

		/**
		 * 売掛消込予定の検索<br />
		 * 
		 * 売掛先別請求ＮＯをもとに売掛消込予定を検索する
		 * 
		 * @param billAcstNo 売掛先別請求ＮＯ
		 * @return 売掛消込予定
		 */
		protected MCList<MST_AR_APPL_SCHD_R> getArApplSchd(String billAcstNo) {
			MCList<MST_AR_APPL_SCHD_R> rsltL = MCList.create(MST_AR_APPL_SCHD_R.class);
			MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder rsltL_bldr = MCQueryApiBuilder.create(t);

			rsltL_bldr.setWhere(t.bill_acst_no.eq(bind("1")), billAcstNo);
			dbSelect("MSBGL5030_MST_AR_APPL_SCHD_S01", rsltL, rsltL_bldr);

			return rsltL;
		}

		/**
		 * 売掛先別請求マージ<br />
		 * 
		 * 取り消す売掛先別請求をマージする
		 * 
		 * @param canBillAcstR 取り消す売掛先別請求
		 * @param billAcstNo マージする売掛先別請求の売掛先別請求ＮＯ
		 */
		protected void mergeBillAcst(MST_BILL_ACST_R canBillAcstR, String billAcstNo) {
			MST_BILL_ACST_R bind = canBillAcstR.clone();

			bind.bill_acst_no(billAcstNo);
			bind.setNumberNE("rcv", canBillAcstR.xfr_amt().add(canBillAcstR.note_amt())
					.add(canBillAcstR.cash_amt()).add(canBillAcstR.sw_amt()));
			bind.setNumberNE("bill", canBillAcstR.sls_amt().add(canBillAcstR.ret_amt())
					.add(canBillAcstR.dscnt_amt()).add(canBillAcstR.sw_to_amt()).add(canBillAcstR.tax_amt())
					.subtract(canBillAcstR.setoff_amt()).subtract(canBillAcstR.setoff_tax_amt()));

			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder billAcst_bldr = MCQueryApiBuilder.create(t);
			billAcst_bldr.setWhere(t.bill_acst_no.eq(bindEx("bill_acst_no")));
			billAcst_bldr.setSetVL(t.xfr_amt, t.xfr_amt.add(bindEx("xfr_amt")));
			billAcst_bldr.addSetVL(t.note_amt, t.note_amt.add(bindEx("note_amt")));
			billAcst_bldr.addSetVL(t.cash_amt, t.cash_amt.add(bindEx("cash_amt")));
			billAcst_bldr.addSetVL(t.setoff_amt, t.setoff_amt.add(bindEx("setoff_amt")));
			billAcst_bldr.addSetVL(t.setoff_tax_amt, t.setoff_tax_amt.add(bindEx("setoff_tax_amt")));
			billAcst_bldr.addSetVL(t.sw_amt, t.sw_amt.add(bindEx("sw_amt")));
			billAcst_bldr.addSetVL(t.bfw_amt, t.bfw_amt.subtract(bindEx("rcv")));
			billAcst_bldr.addSetVL(t.sls_amt, t.sls_amt.add(bindEx("sls_amt")));
			billAcst_bldr.addSetVL(t.ret_amt, t.ret_amt.add(bindEx("ret_amt")));
			billAcst_bldr.addSetVL(t.dscnt_amt, t.dscnt_amt.add(bindEx("dscnt_amt")));
			billAcst_bldr.addSetVL(t.sw_to_amt, t.sw_to_amt.add(bindEx("sw_to_amt")));
			billAcst_bldr.addSetVL(t.tax_amt, t.tax_amt.add(bindEx("tax_amt")));
			billAcst_bldr.addSetVL(t.bill_amt, t.bill_amt.subtract(bindEx("rcv")).add(bindEx("bill")));
			dbUpdate("MSBGL5030_MST_BILL_ACST_U02", bind, billAcst_bldr);
		}

		/**
		 * 請求明細振替（売掛別請求ＮＯ）<br />
		 * 
		 * 売掛別請求ＮＯをマージ先のものに振り替える
		 * 
		 * @param canBillAcstR 取り消す売掛先別請求
		 * @param billAcstNo マージ先の売掛別請求ＮＯ
		 */
		protected void updBillDToMerge(MST_BILL_ACST_R canBillAcstR,
				String billAcstNo) {
			MCRow bind = MCRow.create();
			bind.setStringNE("old_bill_acst_no", canBillAcstR.bill_acst_no());
			bind.setStringNE("new_bill_acst_no", billAcstNo);

			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billD_bldr = MCQueryApiBuilder.create(t);
			billD_bldr.setWhere(t.bill_acst_no.eq(bindEx("old_bill_acst_no")));
			billD_bldr.setSetVL(t.bill_acst_no, bindEx("new_bill_acst_no"));
			dbUpdate("MSBGL5030_MST_BILL_D_U04", bind, billD_bldr);
		}

		/**
		 * マージ済み売掛先別請求、売掛消込予定削除<br />
		 * 
		 * マージが完了した売掛先別請求、売掛消込予定を削除する
		 * 
		 * @param billAcstNo 取消した売掛先別請求の売掛先別請求ＮＯ
		 */
		protected void delMergedBillAcst(String billAcstNo) {

			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MST_AR_APPL_SCHD_R t1 = MST_AR_APPL_SCHD_R.create("T");
			execDbDelete("MSBGL5030_MST_BILL_ACST_D01", t, t.bill_acst_no.eq(bind("1")), billAcstNo);
			execDbDelete("MSBGL5030_MST_AR_APPL_SCHD_D01", t1, t1.bill_acst_no.eq(bind("1")), billAcstNo);
		}

		/**
		 * 未請求売掛先別請求洗い替え
		 * 
		 * @param lastBillR 洗い替えた請求
		 */
		protected void updLastBillAcst(MST_BILL_R lastBillR) {
			updFollowingBillAcst(lastBillR.bill_mng_no());
		}

		/**
		 * 次月データ取消<br />
		 * 
		 * 次月データを作成していた場合、次月データを取り消す
		 * 
		 * @param canBillR 取消した請求
		 */
		protected void callBillCanNext(MST_BILL_R canBillR) {
			// 次月データを作成している可能性がある場合、次月データ取消処理を呼出す
			if (!MAC_Y4M.isNULL_VAL(canBillR.getDate("used_bill_cl_dt"))
					&& MAC_STR.isNULL_VAL(canBillR.iv_no())) {
				billCanNext(canBillR);
			}
		}

		/**
		 * 次月データ取消<br />
		 * 
		 * 次月データを作成していた場合、次月データを取り消す
		 * 
		 * @param canBillR 取消した請求
		 */
		protected void billCanNext(MST_BILL_R canBillR) {
			// 未発行の次月請求取得
			MST_BILL_R nextBillR = getNextBillR(canBillR);

			// 未発行の次月請求が存在しない場合は終了
			if (nextBillR.isEmpty()) {
				return;
			}

			// 売上や入金・前回入金が存在する場合は終了
			if (nextBillRelatedDataExist(nextBillR)) {
				return;
			}

			// 次月データを削除
			delNextBill(nextBillR.bill_mng_no());
		}

		/**
		 * 次月請求取得<br />
		 * 
		 * 次月の請求を返す
		 * 
		 * @param canBillR 条件とする取消した請求
		 * 
		 * @return 次月の請求
		 */
		protected MST_BILL_R getNextBillR(MST_BILL_R canBillR) {
			MST_BILL_R r = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MST_BILL_R S1W = MST_BILL_R.create("W");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), canBillR.bcst_cd());
			r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), canBillR.bill_dpt_cd());
			r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), canBillR.iv_no());
			r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), canBillR.trd_cur_cd());
			r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
					.or(t.wrk_no.isNull())
					.and(bind("1").isNull())), canBillR.wrk_no());
			r_bldr.addWhereWithAnd(t.bill_cl_dt.eq(subQuery().select(min(S1W.bill_cl_dt)).from(S1W)
					.where(S1W.bcst_cd.eq(bind("bcst_cd"))
							.and(S1W.bill_dpt_cd.eq(bind("bill_dpt_cd")))
							.and(S1W.iv_no.eq(bind("iv_no")))
							.and(S1W.trd_cur_cd.eq(bind("trd_cur_cd")))
							.and(S1W.wrk_no.eq(bind("wrk_no"))
									.or(S1W.wrk_no.isNull())
									.and(bind("wrk_no").isNull()))
									.and(S1W.bill_cl_dt.gt(bind("bill_cl_dt"))))),
					canBillR);
			r_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			r_bldr.addWhereWithAnd(t.cash_amt.eq(value(0)));
			r_bldr.addWhereWithAnd(t.note_amt.eq(value(0)));
			r_bldr.addWhereWithAnd(t.xfr_amt.eq(value(0)));
			r_bldr.addWhereWithAnd(t.setoff_amt.eq(value(0)));
			r_bldr.addWhereWithAnd(t.sw_amt.eq(value(0)));
			dbSelect("MSBGL5030_MST_BILL_S08", r, r_bldr);
			return r;
		}

		/**
		 * 次月請求関連データ存在判定<br />
		 * 
		 * 次月請求に紐づくデータが有るかを判定する
		 * 
		 * @param nextBillR　次月請求
		 * 
		 * @return 次月請求に紐づくデータが有る場合、true
		 */
		protected boolean nextBillRelatedDataExist(MST_BILL_R nextBillR) {

			// 売掛消込予定があるか？
			MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
			MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
			MCQueryApiBuilder arApplSchdR_bldr = MCQueryApiBuilder.create(t);
			arApplSchdR_bldr.setSelect(count(value(1)).as("cnt"));
			arApplSchdR_bldr.addInnerJoin(t2, t.bill_acst_no.eq(t2.bill_acst_no));
			arApplSchdR_bldr.addWhereWithAnd(t2.bill_mng_no.eq(bind("1")), nextBillR.bill_mng_no());
			arApplSchdR_bldr.addWhereWithAnd(t.appl_amt.neq(value(0)));
			MCRow result = MCRow.create();
			result.addNumberColumn("cnt");
			arApplSchdR_bldr.buildSelect("MSBGL5030_MST_AR_APPL_SCHD_S02").executeQuery(arApplSchdR_bldr.getMergeBind(), result);
			int cnt = result.getNumberNE("cnt").intValue();

			if (cnt != 0) {
				return true;
			}

			// 入金予定消込実績があるか？
			MST_RCV_SCHD_APPL_ACT_R t3 = MST_RCV_SCHD_APPL_ACT_R.create("T");
			cnt = execDbCount("MSBGL5030_MST_RCV_SCHD_APPL_ACT_S03", t3, t3.bill_mng_no.eq(bind("1"))
					.and(t3.rcv_act_amt.neq(value(0))),
					nextBillR.bill_mng_no());
			if (cnt != 0) {
				return true;
			}

			// 有効な請求明細があるか？
			MST_BILL_D_R t4 = MST_BILL_D_R.create("T");
			cnt = execDbCount("MSBGL5030_MST_BILL_D_S08", t4, t4.bill_mng_no.eq(bind("1"))
					.and(t4.valid_flg.eq(value(true))),
					nextBillR.bill_mng_no());
			if (cnt != 0) {
				return true;
			}

			return false;
		}

		/**
		 * 次月請求削除<br />
		 * 
		 * 次月請求、および、それに紐づく売掛先別請求、売掛消込予定、入金予定を削除する
		 * 
		 * @param billNo 次月請求の請求ＮＯ
		 */
		protected void delNextBill(String billMngNo) {
			// 売掛先別請求を検索
			MCList<MST_BILL_ACST_R> billAcstL = MCList.create(MST_BILL_ACST_R.class);
			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder billAcstL_bldr = MCQueryApiBuilder.create(t);
			billAcstL_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), billMngNo);
			dbSelect("MSBGL5030_MST_BILL_ACST_S03", billAcstL, billAcstL_bldr);
			
			MST_AR_APPL_SCHD_R t2 = MST_AR_APPL_SCHD_R.create("T");
			// 売掛消込予定を削除
			for (MST_BILL_ACST_R r : billAcstL) {
				execDbDelete("MSBGL5030_MST_AR_APPL_SCHD_D02", t2, t2.bill_acst_no.eq(bind("1")), r.bill_acst_no());
			}
			// 売掛先別請求を削除
			dbDeleteKey("MSBGL5030_MST_BILL_ACST_D02", billAcstL, MCQueryApiBuilder.create( MST_BILL_ACST_R.create("T")));
			// 請求ヘッダを削除
			MST_BILL_R t3 = MST_BILL_R.create("T");
			execDbDelete("MSBGL5030_MST_BILL_D02", t3, t3.bill_mng_no.eq(bind("1")), billMngNo);

			// 入金予定を削除
			MST_RCV_SCHD_R t4 = MST_RCV_SCHD_R.create("T");
			execDbDelete("MSBGL5030_MST_RCV_SCHD_D03", t4, t4.bill_mng_no.eq(bind("1")), billMngNo);
		}

		/**
		 * 請求書履歴テーブルの取消ＦＬＧを更新する
		 * @param billR 請求ヘッダ
		 */
		protected void updBillHis(MST_BILL_R billR) {
			
			// 請求書ヘッダ履歴の取得
			MST_BILL_HIS_R billHisR = getBillHisR(billR);
			
			// 取消ＦＬＧを設定する
			billHisR.can_flg(true);
			
			// 請求書ヘッダ履歴の更新
			MST_BILL_HIS_R t = MST_BILL_HIS_R.create("T");
			MCQueryApiBuilder billHisR_bldr = MCQueryApiBuilder.create(t);
			billHisR_bldr.setSet(t.can_flg);
			dbUpdateKey("MSBGL5030_MST_PAY_NTC_HIS_U01", billHisR, billHisR_bldr);
		}

		/**
		 * 請求書ヘッダ履歴を取得する
		 * @param billR 請求ヘッダ
		 * @return 請求書ヘッダ履歴
		 */
		protected MST_BILL_HIS_R getBillHisR(MST_BILL_R billR) {
			
			MST_BILL_HIS_R billHisR = MST_BILL_HIS_R.create();
			MST_BILL_HIS_R t = MST_BILL_HIS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.bill_his_no);
			dbc_bldr.setWhere(t.bill_no.eq(bind("bill_no")));
			dbc_bldr.addWhereWithAnd(t.bill_rev.eq(bind("bill_rev")));
			dbSelectForUpdate("MSBGL5030_MST_BILL_HIS_S01", billHisR, dbc_bldr, billR);
			return billHisR;
		}
	}

	/**
	 * 請求締処理<br />
	 * 
	 * 指定された請求先の請求締処理を行い、請求書を発行する
	 * 
	 * @param bcstCd 締対象の請求先ＣＤ
	 * @param billDptCd 締対象の請求部門ＣＤ
	 * @param ivNo 締対象のインボイスＮＯ
	 * @param trdCurCd 締対象の取引通貨ＣＤ
	 * @param wrkNo 締対象の案件ＮＯ
	 * @param billClStsTyp 請求締状況区分
	 * @Param tgtDt 対象日
	 * @param downR 今回締対象の請求書ＮＯ、請求管理ＮＯを取得するMCRow。取得する必要がない場合はnullを指定。
	 */
	protected boolean billCl(String bcstCd, String billDptCd, String ivNo, String trdCurCd,
			String wrkNo, boolean billDSelFlg, MSC_BILL_CL_STS_TYP billClStsTyp, MCDate tgtDt, BillCl_Upd02_HdrR downR) {

		initCache();

		// 画面からの場合、対象日が設定されないので運用日付を設定する
		if (isNull(tgtDt)) tgtDt = getToday();

		// 請求締対象の請求情報をワークから検索する
		MSW_BILL_R wkBillR = getWkBill(bcstCd, billDptCd, ivNo, trdCurCd, wrkNo);

		// チェック処理
		chkBill(wkBillR);

		// 締対象の請求管理ＮＯを発番する
		String prntBillMngNo = getStrSeq(MSC_NUM_SYS_TYP.BILLMNG);

		// 締対象の請求書ＮＯを発番する
		String prntBillNo = getBillNo(wkBillR);

		// 請求明細選択の結果を請求明細に反映する
		updPartBillD(wkBillR);

		// 請求明細の請求締
		updBillD(wkBillR, prntBillMngNo);

		// 請求ヘッダの請求締
		updBill(wkBillR, prntBillMngNo, prntBillNo, billDSelFlg, billClStsTyp, tgtDt, downR);

		// 売掛先別請求の請求締
		MCList<MST_BILL_ACST_R> tgtBillAcstL =
				updBillAcst(wkBillR, prntBillMngNo, prntBillNo, billClStsTyp);

		// 売掛消込予定、実績の請求締
		updArAppl(wkBillR, prntBillMngNo, tgtBillAcstL);

		// 請求ヘッダの再更新（請求ヘッダと入金予定消込実績を更新）
		updBill(prntBillMngNo, tgtBillAcstL, downR);
		// 前受金に対応する入金実績明細を更新する
		updRcvActDAdv(prntBillMngNo);

		// 税差額調整のため入金実績共通サービスを呼び出す
		calcTax(prntBillMngNo, bcstCd);

		// 次回請求分の繰越処理
		updFollowing(wkBillR, prntBillMngNo, ivNo, downR);

		// 受注状況更新
		callSloStsReg(getSloStsRegL(prntBillMngNo), MSC_SLO_STS_TYP.BILL_CL.value());

		// 請求書履歴テーブルの登録
		insBillHis(prntBillMngNo);

		// 下り電文の設定
		if (!isNull(downR)) {
			downR.bill_mng_no(prntBillMngNo);
			downR.bill_no(prntBillNo);
		}

		MST_BILL_R billR = getBillR(prntBillMngNo);
		return !billR.isEmpty();
	}

	/**
	 * 締対象の請求情報取得<br />
	 * 
	 * 請求ワークより締対象の請求情報を取得する
	 * 
	 * @param bcstCd 締対象の請求先ＣＤ
	 * @param billDptCd 締対象の請求部門ＣＤ
	 * @param ivNo 締対象のインボイスＮＯ
	 * @param trdCurCd 締対象の取引通貨ＣＤ
	 * @param wrkNo 締対象の案件ＮＯ
	 * 
	 * @return 検索結果の請求ワーク
	 */
	protected MSW_BILL_R getWkBill(String bcstCd, String billDptCd, String ivNo, String trdCurCd, String wrkNo) {
		MCList<MSW_BILL_R> billL = MCList.create(MSW_BILL_R.class);
		MSW_BILL_R t = MSW_BILL_R.create("T");
		MCQueryApiBuilder billL_bldr = MCQueryApiBuilder.create(t);
		MSW_BILL_R r = MSW_BILL_R.create();
		billL_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
		billL_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), billDptCd);
		billL_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), ivNo);
		billL_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), trdCurCd);
		billL_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
				.or(t.wrk_no.isNull())
				.and(bind("1").isNull())), wrkNo);
		dbSelect("MSBGL5030_MSW_BILL_S03", billL, billL_bldr);

		if (!billL.isEmpty()) {
			r = billL.get(0);
		}
		return r;
	}

	/**
	 * 請求情報チェック<br />
	 * 
	 * 締めることが可能な請求締年月日かをチェックする。以下の条件を満たすレコードが存在する場合エラー<br>
	 * <li>ワークから取得した請求と「請求締年月日」以外のキーが同じ</li>
	 * <li>「請求締年月日」がワークの「入力請求締年月日」より新しい（ワークの入力請求締年月日 < 請求締年月日）</li>
	 * <li>請求締済み</li>
	 * <br><br>
	 * 請求先の売上仮単価締ＦＬＧがオフで、仮単価の請求明細が存在する場合エラー<br>
	 * 請求先の請求書発行区分が「3：入金予定調整後」で、請求ヘッダの入金予定調整済ＦＬＧがオフの場合エラー<br>
	 * 請求明細に無効な品目が含まれている場合エラー<br>
	 * 
	 * @param wkBillR 締対象の請求情報
	 */
	protected void chkBill(MSW_BILL_R wkBillR) {
		
		MST_BILL_R t = MST_BILL_R.create("T");
		int cnt = execDbCount("MSBGL5030_MST_BILL_S09", t,
				t.bcst_cd.eq(bind("bcst_cd"))
				.and(t.bill_dpt_cd.eq(bind("bill_dpt_cd")))
				.and(t.iv_no.eq(bind("iv_no")))
				.and(t.trd_cur_cd.eq(bind("trd_cur_cd")))
				.and(t.wrk_no.eq(bind("wrk_no"))
						.or(t.wrk_no.isNull())
						.and(bind("wrk_no").isNull()))
						.and(t.bill_cl_dt.gt(bind("inpt_bill_cl_dt")))
						.and(t.bill_cl_sts_typ.in(value(MSC_BILL_CL_STS_TYP.CL_BATCH.value()), value(MSC_BILL_CL_STS_TYP.CL_SCRN.value()))),
				wkBillR);

		if (cnt > 0) {
			throw new MCAppException(MSBGL0074, wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(), 
					wkBillR.trd_cur_cd(), wkBillR.iv_no(), wkBillR.wrk_no(), toYMDString(wkBillR.inpt_bill_cl_dt()));
		}

		// 仮単価ＦＬＧがオンの請求明細を検索
		if (!MSBGL_ArUtil.getSlsInterimClFlg(wkBillR.bcst_cd())) {
			MST_BILL_R S1T2 = MST_BILL_R.create("T2");
			MSW_BILL_D_R S2W1 = MSW_BILL_D_R.create("W1");
			MST_BILL_D_R t2 = MST_BILL_D_R.create("T");
			cnt = execDbCount("MSBGL5030_MST_BILL_D_S09", t2,
					t2.bill_mng_no
							.in(subQuery().select(S1T2.bill_mng_no).from(S1T2)
									.where(S1T2.bcst_cd.eq(bind("bcst_cd"))
											.and(S1T2.bill_dpt_cd.eq(bind("bill_dpt_cd")))
											.and(S1T2.iv_no.eq(bind("iv_no")))
											.and(S1T2.trd_cur_cd.eq(bind("trd_cur_cd")))
											.and(S1T2.wrk_no.eq(bind("wrk_no"))
													.or(S1T2.wrk_no.isNull())
													.and(bind("wrk_no").isNull()))))
							.and(exists(subQuery().select(value("X")).from(S2W1)
									.where(S2W1.bill_d_no.eq(t2.bill_d_no)
											.and(S2W1.cl_flg.eq(value(true))))))
											.and(t2.valid_flg.eq(value(true)))
											.and(t2.interim_flg.eq(value(true)))
											.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))),
					wkBillR);

			if (cnt > 0) {
				throw new MCAppException(MSBGL0075,  wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(), 
						wkBillR.trd_cur_cd(), wkBillR.iv_no(), wkBillR.wrk_no(), toYMDString(wkBillR.inpt_bill_cl_dt()));
			}
		}
		
		MST_BILL_R S3T2 = MST_BILL_R.create("T2");
		MSW_BILL_D_R S3W1 = MSW_BILL_D_R.create("W1");
		MAM_ITM_R S3M1 = MAM_ITM_R.create("M1");
		MST_BILL_D_R t3 = MST_BILL_D_R.create("T");
		cnt = execDbCount("MSBGL5030_MST_BILL_D_S15", t3,
				t3.bill_mng_no
						.in(subQuery().select(S3T2.bill_mng_no).from(S3T2)
								.where(S3T2.bcst_cd.eq(bind("bcst_cd"))
										.and(S3T2.bill_dpt_cd.eq(bind("bill_dpt_cd")))
										.and(S3T2.iv_no.eq(bind("iv_no")))
										.and(S3T2.trd_cur_cd.eq(bind("trd_cur_cd")))
										.and(S3T2.wrk_no.eq(bind("wrk_no"))
												.or(S3T2.wrk_no.isNull())
												.and(bind("wrk_no").isNull()))))
						.and(exists(subQuery().select(value("X")).from(S3W1)
								.where(S3W1.bill_d_no.eq(t3.bill_d_no)
										.and(S3W1.cl_flg.eq(value(true))))))
						.and(notExists(subQuery().select(value("X")).from(S3M1)
								.where(S3M1.itm_cd.eq(t3.itm_cd)
										.and(S3M1.itm_sub1.eq(t3.itm_sub1))
										.and(S3M1.itm_sub2.eq(t3.itm_sub2))
										.and(S3M1.itm_sub3.eq(t3.itm_sub3)))))
										.and(t3.valid_flg.eq(value(true)))
										.and(t3.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value()))),
				wkBillR);
		
		if (cnt > 0) {
			throw new MCAppException(MSBGL0128, wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(), 
					wkBillR.trd_cur_cd(), wkBillR.iv_no(), wkBillR.wrk_no(), toYMDString(wkBillR.inpt_bill_cl_dt()));
		}
		
		checkSlsOrRcvForAdv(wkBillR);
		
	}

	// 締対象に前受金がある場合は、売上または入金の請求明細が含まれているか
	protected void checkSlsOrRcvForAdv(MSW_BILL_R wkBillR) {

		MSW_RCV_ACT_D_R rcvActDW = MSW_RCV_ACT_D_R.create("RCV_ACTD_W");
		int advCnt  = execDbCount("MSBGL5030_MSW_RCV_ACT_D_S01", rcvActDW);
		
		if (0 < advCnt) {
			MSW_BILL_D_R billDW = MSW_BILL_D_R.create("BILLD_W");
			// 締対象の請求明細（売上または入金）の件数
			int billDCnt = execDbCount("MSBGL5030_MSW_BILL_D_S02", billDW, billDW.cl_flg.eq(value(true)));
					
			if (billDCnt == 0) {
				throw new MCAppException(MSBGL0501, wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(), 
						wkBillR.trd_cur_cd(), wkBillR.iv_no(), wkBillR.wrk_no(), toYMDString(wkBillR.inpt_bill_cl_dt()));
			}
		}
	}
	
	/**
	 * 請求書ＮＯを発番する
	 * 
	 * @param insR 登録した請求ヘッダ
	 * @return 発番した請求書ＮＯ
	 */
	protected String getBillNo(MSW_BILL_R wkBillR) {
		ElmArgsR args = ElmArgsR.create();
		args.bp_cd(wkBillR.bcst_cd());
		args.dpt_cd(MSBGL_ArUtil.getBcstDpt(wkBillR.bcst_cd(), wkBillR.inpt_bill_cl_dt(), wkBillR.bill_dpt_cd(), wkBillR.bill_dpt_cd()));
		args.wg_cd(MSBGL_ArUtil.getWgCd(args.dpt_cd(), wkBillR.inpt_bill_cl_dt()));	
		args.co_cd(getCo().co_cd());
		args.dt(wkBillR.inpt_bill_cl_dt());
		return getNum(MAC_NUM_BIZ_TYP.BILL, args);
	}

	/**
	 * 一部請求の更新<br />
	 * 
	 * 一部請求の請求明細が存在する場合、一部請求分と繰越分に請求明細を分割する。<br>
	 * 元の請求明細については有効ＦＬＧをfalseに更新して無効扱いとする。<br>
	 * 一部請求分の請求明細が今回請求締対象となるようにワークテーブルにレコードを追加する<br>
	 * 
	 * @param wkBillR 締対象の請求情報
	 */
	protected void updPartBillD(MSW_BILL_R wkBillR) {

		MCList<MST_BILL_D_R> billDL = getPartBillD(wkBillR);

		if (billDL.isEmpty()) {
			return;
		}

		doSeqCache(MSC_NUM_SYS_TYP.BILLD, MCNumber.valueOf(2).multiply(billDL.size()).intValue());
		for (MST_BILL_D_R billDR : billDL) {
			// 繰越元の請求明細から一部請求、繰越請求の請求明細を作成する。
			MST_BILL_D_R partBillDR = billDR.clone();
			MST_BILL_D_R crryovrBillDR = billDR.clone();
			String partBillDNo = getStrSeq(MSC_NUM_SYS_TYP.BILLD);
			String crryovrBillDNo = getStrSeq(MSC_NUM_SYS_TYP.BILLD);

			// 一部請求の請求明細を作成
			insPartBillD(partBillDR, billDR, partBillDNo, crryovrBillDNo);
			// 繰越請求の請求明細を作成
			insCrryovrBillD(crryovrBillDR, billDR, crryovrBillDNo);
			// 請求明細消込残高を取得する
			MCList<MST_BILL_D_APPL_BAL_R> applBalL = getBillDApplBal(billDR.bill_d_no());

			// 今回の一部請求額(税込)を保持
			MCNumber partBillAmt = partBillDR.trd_cur_amt().add(partBillDR.trd_cur_tax_amt());

			MCQueryApiBuilder applActR_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_ACT_R.create("T"));
			MCQueryApiBuilder applBalR_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_BAL_R.create("T"));
	
			for (MST_BILL_D_APPL_BAL_R applBalR : applBalL) {
				MCNumber ttlPartApplAmt = MCNumber.ZERO;
				MCNumber ttlCrryovrApplAmt = MCNumber.ZERO;

				if (!applBalR.appl_amt().isZero()) {
					MCList<MST_BILL_D_APPL_ACT_R> applActL =
							getBillDApplAct(applBalR);

					for (MST_BILL_D_APPL_ACT_R applActR : applActL) {
						// 一部請求額 >= 請求明細消込実績の消込額の場合
						if (partBillAmt.gte(applActR.appl_amt())) {
							ttlPartApplAmt = ttlPartApplAmt.add(
									insBillDApplAct(applActR, partBillDNo, null));
							dbDeleteKey("MSBGL5030_MST_BILL_D_APPL_ACT_D02", applActR, applActR_bldr);
						}
						// 一部請求額 - 消込額が0以下になった場合
						else if (!partBillAmt.isPositive()) {
							ttlCrryovrApplAmt = ttlCrryovrApplAmt.add(
									insBillDApplAct(applActR, crryovrBillDNo, null));
							dbDeleteKey("MSBGL5030_MST_BILL_D_APPL_ACT_D03", applActR, applActR_bldr);
						}
						// 上記以外の場合
						// 一部請求分と繰越請求分に分割して登録する
						else {
							ttlPartApplAmt = ttlPartApplAmt.add(
									insBillDApplAct(applActR, partBillDNo, partBillAmt));
							ttlCrryovrApplAmt = ttlCrryovrApplAmt.add(
									insBillDApplAct(applActR, crryovrBillDNo,
									applActR.appl_amt().subtract(partBillAmt)));
							dbDeleteKey("MSBGL5030_MST_BILL_D_APPL_ACT_D04", applActR, applActR_bldr);
						}
						partBillAmt = partBillAmt.subtract(applActR.appl_amt());
					}
				}
				// 一部請求の請求明細に紐付く請求明細消込残高を作成する
				insBillDApplBal(applBalR, partBillDR, partBillDNo, ttlPartApplAmt);
				// 繰越請求の請求明細に紐付く請求明細消込残高を作成する
				insBillDApplBal(applBalR, crryovrBillDR, crryovrBillDNo, ttlCrryovrApplAmt);
				// 元の請求明細消込残高を削除する
				dbDeleteKey("MSBGL5030_MST_BILL_D_APPL_BAL_D02", applBalR, applBalR_bldr);
			}
			// 元の請求明細を無効とする
			updOrgBillD(billDR);
			// 請求明細ワークに一部請求用の情報を追加
			insWkBillD(billDR, partBillDNo, crryovrBillDNo);
		}
	}

	/**
	 * 一部請求用の請求ワーク登録<br />
	 * 
	 * 一部請求用と繰越請求用の請求明細ワークを作成する。<br>
	 * 繰越請求用は今回の締対象外なので締ＦＬＧはfalseを設定する。
	 * 
	 * @param billDR 元の請求明細情報
	 * @param partBillDNo 一部請求用の請求明細ＮＯ
	 * @param newBillDNo 繰越先の請求明細ＮＯ
	 */
	protected void insWkBillD(MST_BILL_D_R billDR,
			String partBillDNo, String crryovrBillDNo) {

		MSW_BILL_D_R wkBillDR = MSW_BILL_D_R.create();
		dbSelectKey("MSBGL5030_MSW_BILL_D_S01", wkBillDR, MCQueryApiBuilder.create(MSW_BILL_D_R.create("T")), billDR.bill_d_no());

		MSW_BILL_D_R partWkBillDR = wkBillDR.clone();
		MSW_BILL_D_R crryovrWkBillDR = wkBillDR.clone();

		partWkBillDR.bill_d_no(partBillDNo);
		dbInsert("MSBGL5030_MSW_BILL_D_I02", partWkBillDR, MCQueryApiBuilder.create(MSW_BILL_D_R.create("T")));

		crryovrWkBillDR.bill_d_no(crryovrBillDNo);
		crryovrWkBillDR.cl_flg(false);
		dbInsert("MSBGL5030_MSW_BILL_D_I03", crryovrWkBillDR, MCQueryApiBuilder.create(MSW_BILL_D_R.create("T")));

	}

	/**
	 * 一部請求の請求ワーク取得<br />
	 * 
	 * 請求明細ワークに一部請求として登録されている請求明細を取得する<br>
	 * 請求明細選択画面で一部請求にして請求締を行った場合に検索結果が取得できる。
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @return 検索結果
	 */
	protected MCList<MST_BILL_D_R> getPartBillD(MSW_BILL_R wkBillR) {
		MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MST_BILL_R t2 = MST_BILL_R.create("T2");
		MSW_BILL_D_R w1 = MSW_BILL_D_R.create("W1");
		MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(t);
		billDL_bldr.addSelect(w1.bill_mtd_typ.as("bill_mtd_typ_w"));
		billDL_bldr.addSelect(w1.amt.as("amt_w"));
		billDL_bldr.addSelect(w1.tax_amt.as("tax_amt_w"));
		billDL_bldr.addInnerJoin(t2, t.bill_mng_no.eq(t2.bill_mng_no));
		billDL_bldr.addInnerJoin(w1, t.bill_d_no.eq(w1.bill_d_no));
		billDL_bldr.addWhereWithAnd(t2.bcst_cd.eq(bind("bcst_cd")));
		billDL_bldr.addWhereWithAnd(t2.bill_dpt_cd.eq(bind("bill_dpt_cd")));
		billDL_bldr.addWhereWithAnd(t2.iv_no.eq(bind("iv_no")));
		billDL_bldr.addWhereWithAnd(t2.trd_cur_cd.eq(bind("trd_cur_cd")));
		billDL_bldr.addWhereWithAnd(bracket(t2.wrk_no.eq(bind("wrk_no"))
				.or(t2.wrk_no.isNull())
				.and(bind("wrk_no").isNull())));
		billDL_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
		billDL_bldr.addWhereWithAnd(w1.cl_flg.eq(value(true))
				.and(w1.bill_mtd_typ.eq(value(MSC_BILL_MTD_TYP.PART_BILL.value()))));
		dbSelect("MSBGL5030_MST_BILL_D_S10", billDL, billDL_bldr, wkBillR);
		return billDL;
	}

	/**
	 * 一部請求の請求明細登録<br />
	 * 
	 * 一部請求用の請求明細を新規登録する。
	 * 
	 * @param partBillDR 一部請求用の請求明細
	 * @param billDR 元の請求明細情報
	 * @param partBillDNo 一部請求用の請求明細ＮＯ
	 * @param newBillDNo 繰越先の請求明細ＮＯ
	 */
	protected void insPartBillD(MST_BILL_D_R partBillDR, MST_BILL_D_R billDR, 
			String partBillDNo, String crryovrBillDNo) {

		MCNumber amtDecPlace = getBaseCur().amt_dec_place();
		String rndMode = getCo().xrate_rnd_typ();

		partBillDR.bill_d_no(partBillDNo);
		partBillDR.bill_mtd_typ(MSC_BILL_MTD_TYP.PART_BILL.value());
		partBillDR.trd_cur_amt(billDR.getNumber("amt_w"));
		partBillDR.base_cur_amt(convToBaseCur(partBillDR.trd_cur_amt(), billDR.xrate(), amtDecPlace, rndMode));
		partBillDR.trd_cur_tax_amt(billDR.getNumber("tax_amt_w"));
		partBillDR.base_cur_tax_amt(convToBaseCur(partBillDR.trd_cur_tax_amt(), billDR.xrate(), amtDecPlace, rndMode));
		partBillDR.crryovr_bill_d_no(crryovrBillDNo);
		partBillDR.crryovr_src_bill_d_no(billDR.bill_d_no());
		partBillDR.valid_flg(true);
		// 請求残高振替の場合、金額1にも振替額が設定されているので一部請求額に変更しておく。
		if (MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(partBillDR.trd_ptn_typ())) {
			partBillDR.trd_cur_amt1(partBillDR.trd_cur_amt());
			partBillDR.base_cur_amt1(partBillDR.base_cur_amt());
		}
		dbInsert("MSBGL5030_MST_BILL_D_I01", partBillDR, MCQueryApiBuilder.create(MST_BILL_D_R.create("T")));
		billDR.setNumberNE("base_amt_w", partBillDR.base_cur_amt());
		billDR.setNumberNE("base_tax_amt_w", partBillDR.base_cur_tax_amt());
	}

	/**
	 * 繰越請求の請求明細登録<br />
	 * 
	 * 繰越請求用の請求明細を新規登録する。
	 * 
	 * @param crryovrBillDR 繰越請求用の請求明細
	 * @param billDR 元の請求明細情報
	 * @param crryovrBillDNo 繰越請求用の請求明細ＮＯ
	 */
	protected void insCrryovrBillD(MST_BILL_D_R crryovrBillDR, MST_BILL_D_R billDR,
			String crryovrBillDNo) {

		crryovrBillDR.bill_d_no(crryovrBillDNo);
		crryovrBillDR.bill_mtd_typ(MSC_BILL_MTD_TYP.ALL_BILL.value());
		crryovrBillDR.trd_cur_amt(crryovrBillDR.trd_cur_amt().subtract(billDR.getNumber("amt_w")));
		crryovrBillDR.base_cur_amt(crryovrBillDR.base_cur_amt().subtract(billDR.getNumberNE("base_amt_w")));
		crryovrBillDR.trd_cur_tax_amt(crryovrBillDR.trd_cur_tax_amt().subtract(billDR.getNumber("tax_amt_w")));
		crryovrBillDR.base_cur_tax_amt(crryovrBillDR.base_cur_tax_amt().subtract(billDR.getNumberNE("base_tax_amt_w")));
		crryovrBillDR.crryovr_flg(true);
		crryovrBillDR.crryovr_bill_d_no(null);
		crryovrBillDR.crryovr_src_bill_d_no(billDR.bill_d_no());
		crryovrBillDR.valid_flg(true);
		// 値引額、源泉税率、源泉税額は繰越先に引き継がない
		crryovrBillDR.trd_cur_dscnt_amt(MCNumber.ZERO);
		crryovrBillDR.base_cur_dscnt_amt(MCNumber.ZERO);
		crryovrBillDR.wtax_rate(null);
		crryovrBillDR.wtax_amt(MCNumber.ZERO);
		// 請求残高振替の場合、金額1にも振替額が設定されているので一部請求額に変更しておく。
		if (MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(crryovrBillDR.trd_ptn_typ())) {
			crryovrBillDR.trd_cur_amt1(crryovrBillDR.trd_cur_amt());
			crryovrBillDR.base_cur_amt1(crryovrBillDR.base_cur_amt());
		}
		dbInsert("MSBGL5030_MST_BILL_D_I02", crryovrBillDR, MCQueryApiBuilder.create(MST_BILL_D_R.create("T")));
	}

	/**
	 * 請求明細消込残高の取得<br />
	 * 
	 * 一部請求の請求明細に紐付く請求明細消込残高を取得する<br>
	 * ただし、請求残高振替の入金実績と紐付く請求明細消込残高は除外する
	 * 
	 * @param billDNo 一部請求対象の請求明細ＮＯ
	 * @return 請求明細消込残高情報
	 */
	protected MCList<MST_BILL_D_APPL_BAL_R> getBillDApplBal(String billDNo) {
		MCList<MST_BILL_D_APPL_BAL_R> applBalL = MCList.create(MST_BILL_D_APPL_BAL_R.class);
		MST_BILL_D_APPL_BAL_R t = MST_BILL_D_APPL_BAL_R.create("T");
		MST_BILL_D_APPL_ACT_R S1TB1 = MST_BILL_D_APPL_ACT_R.create("TB1");
		MST_RCV_ACT_D_R S1TB2 = MST_RCV_ACT_D_R.create("TB2");
		MST_RCV_ACT_R S1TB3 = MST_RCV_ACT_R.create("TB3");
		MCQueryApiBuilder applBalL_bldr = MCQueryApiBuilder.create(t);
		applBalL_bldr.addWhereWithAnd(t.bill_d_no.eq(bind("1")), billDNo);
		// 請求残高振替で作成されたデータを除外する条件
		applBalL_bldr.addWhereWithAnd(notExists(subQuery().select(value("X"))
				.from(S1TB1.innerJoin(S1TB2).on(bracket(S1TB1.rcv_act_d_no.eq(S1TB2.rcv_act_d_no))).innerJoin(S1TB3)
						.on(bracket(S1TB2.rcv_act_no.eq(S1TB3.rcv_act_no)
								.and(S1TB2.rcv_act_seq.eq(S1TB3.rcv_act_seq)))))
				.where(t.bill_d_no.eq(S1TB1.bill_d_no)
						.and(t.parent_bill_d_no.eq(S1TB1.parent_bill_d_no))
						.and(S1TB3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value()))))));
		dbSelect("MSBGL5030_MST_BILL_D_APPL_BAL_S01", applBalL, applBalL_bldr);
		return applBalL;
	}

	/**
	 * 請求明細消込実績の取得<br />
	 * 
	 * 請求明細消込残高に紐付く請求明細消込実績を取得する
	 * 
	 * @param balR 請求明細消込残高
	 * @return 請求明細消込実績
	 */
	protected MCList<MST_BILL_D_APPL_ACT_R> getBillDApplAct(MST_BILL_D_APPL_BAL_R balR) {
		MCList<MST_BILL_D_APPL_ACT_R> applActL = MCList.create(MST_BILL_D_APPL_ACT_R.class);
		MST_BILL_D_APPL_ACT_R t = MST_BILL_D_APPL_ACT_R.create("T");
		MCQueryApiBuilder applActL_bldr = MCQueryApiBuilder.create(t);
		applActL_bldr.addWhereWithAnd(t.bill_d_no.eq(bind("1")), balR.bill_d_no());
		applActL_bldr.addWhereWithAnd(t.parent_bill_d_no.eq(bind("1")), balR.parent_bill_d_no());
		dbSelect("MSBGL5030_MST_BILL_D_APPL_ACT_S02", applActL, applActL_bldr);
		return applActL;
	}

	/**
	 * 請求明細消込実績の登録<br />
	 * 
	 * 各種情報を元に請求明細消込実績を登録する
	 * 
	 * @param applActR コピー元の請求明細消込実績
	 * @param billDNo 登録対象の請求明細ＮＯ
	 * @param ttlApplAmt 請求明細消込残高用の消込額
	 * @param addApplAmt 今回対象となる消込額
	 */
	protected MCNumber insBillDApplAct(MST_BILL_D_APPL_ACT_R applActR,
			String billDNo, MCNumber addApplAmt) {

		MST_BILL_D_APPL_ACT_R insApplActR = applActR.clone();
		MCNumber applAmt = MCNumber.ZERO;
		if (isNull(addApplAmt)) {
			applAmt = applActR.appl_amt();
		}
		else {
			applAmt = addApplAmt;
			insApplActR.appl_amt(addApplAmt);
		}

		if (isSame(applActR.bill_d_no(), applActR.parent_bill_d_no())) {
			insApplActR.bill_d_no(billDNo);
			insApplActR.parent_bill_d_no(billDNo);
		}
		else {
			insApplActR.bill_d_no(billDNo);
		}
		dbInsert("MSBGL5030_MST_BILL_D_APPL_ACT_I01", insApplActR, MCQueryApiBuilder.create(MST_BILL_D_APPL_ACT_R.create("T")));
		return applAmt;
	}

	/**
	 * 請求明細消込残高の登録<br />
	 * 
	 * 各種情報を元に請求明細消込残高を登録する
	 * 
	 * @param applBalR コピー元の請求明細消込残高
	 * @param billDR 今回対象となる請求明細
	 * @param billDNo 登録対象の請求明細ＮＯ
	 * @param ttlApplAmt 消込額
	 */
	protected void insBillDApplBal(MST_BILL_D_APPL_BAL_R applBalR,
			MST_BILL_D_R billDR, String billDNo, MCNumber ttlApplAmt) {
		MST_BILL_D_APPL_BAL_R insApplBalR = applBalR.clone();
		if (isSame(applBalR.bill_d_no(), applBalR.parent_bill_d_no())) {
			insApplBalR.bill_d_no(billDNo);
			insApplBalR.parent_bill_d_no(billDNo);
		}
		else {
			insApplBalR.bill_d_no(billDNo);
		}
		MCNumber applTgtAmt = billDR.trd_cur_amt().add(billDR.trd_cur_tax_amt());
		insApplBalR.appl_tgt_amt(applTgtAmt);
		insApplBalR.appl_amt(ttlApplAmt);
		insApplBalR.not_appl_bal(applTgtAmt.subtract(ttlApplAmt));
		dbInsert("MSBGL5030_MST_BILL_D_APPL_BAL_I01", insApplBalR, MCQueryApiBuilder.create(MST_BILL_D_APPL_BAL_R.create("T")));
	}

	/**
	 * 繰越元の請求明細更新<br />
	 * 
	 * 繰越元の請求明細を無効に更新する
	 * 
	 * @param billDR 元の請求明細情報
	 */
	protected void updOrgBillD(MST_BILL_D_R billDR) {
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MCQueryApiBuilder billdR_bldr = MCQueryApiBuilder.create(t);
		billdR_bldr.setWhere(t.bill_d_no.eq(bindEx("bill_d_no")));
		billdR_bldr.setSetVL(t.valid_flg, value(false));
		dbUpdate("MSBGL5030_MST_BILL_D_U05", billDR, billdR_bldr);
	}

	/**
	 * 請求明細更新<br />
	 * 
	 * 請求明細ワークで請求締対象となっている明細に対応する請求明細の請求管理ＮＯを<br>
	 * 発番した請求管理ＮＯに更新する
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 */
	protected void updBillD(MSW_BILL_R wkBillR, String prntBillMngNo) {
		MCRow bindR = wkBillR.clone();
		bindR.setStringNE("prnt_bill_mng_no", prntBillMngNo);
		MST_BILL_D_R S0T = MST_BILL_D_R.create("T");
		MSW_BILL_D_R S1W2 = MSW_BILL_D_R.create("W2");
		MST_BILL_R S2T2 = MST_BILL_R.create("T2");
		MSW_BILL_D_R S3W1 = MSW_BILL_D_R.create("W1");

		MCUpdate q = sql("MSBGL5030_MST_BILL_D_U06")
				.update(S0T).set(S0T.bill_mng_no).eq(
						bindEx("prnt_bill_mng_no"))
				.set(S0T.bill_prnt_tgt_flg)
				.eq(subQuery().select(S1W2.bill_prnt_tgt_flg).from(S1W2)
						.where(S1W2.bill_d_no.eq(S0T.bill_d_no)
								.and(S1W2.cl_flg.eq(value(true)))))
				.where(S0T.bill_mng_no
						.in(subQuery().select(S2T2.bill_mng_no).from(S2T2)
								.where(S2T2.bcst_cd.eq(bindEx("bcst_cd"))
										.and(S2T2.bill_dpt_cd.eq(bindEx("bill_dpt_cd")))
										.and(S2T2.iv_no.eq(bindEx("iv_no")))
										.and(S2T2.trd_cur_cd.eq(bindEx("trd_cur_cd")))
										.and(S2T2.wrk_no.eq(bindEx("wrk_no"))
												.or(S2T2.wrk_no.isNull())
												.and(bindEx("wrk_no").isNull()))))
						.and(exists(subQuery().select(value("X")).from(S3W1)
								.where(S3W1.bill_d_no.eq(S0T.bill_d_no)
										.and(S3W1.cl_flg.eq(value(true)))))));
		q.executeUpdate(null,bindR);

		// 先に更新した請求明細に対する分割元の請求管理NOには、対応する請求明細と同じ値を設定する
		MST_BILL_D_R S10T = MST_BILL_D_R.create("T");
		MST_BILL_D_R S11W1 = MST_BILL_D_R.create("W1");
		MSW_BILL_D_R S11W2 = MSW_BILL_D_R.create("W2");
		MST_BILL_R S12T2 = MST_BILL_R.create("T2");
		MSW_BILL_D_R S13W1 = MSW_BILL_D_R.create("W1");
		MST_BILL_D_R S13W2 = MST_BILL_D_R.create("W2");
		MSW_BILL_D_R S13W3 = MSW_BILL_D_R.create("W3");

		MCUpdate q2 = sql("MSBGL5030_MST_BILL_D_U07")
			.update(S10T)
			.set(S10T.bill_mng_no).eq(subQuery()
				.select(min(S11W1.bill_mng_no))
				.from(
					S11W1
					.innerJoin(S11W2).on(
						S11W2.bill_d_no.eq(S11W1.bill_d_no)
						.and(S11W2.cl_flg.eq(value(true)))
					)
				)
				.where(
					S11W1.crryovr_src_bill_d_no.eq(S10T.bill_d_no)
				)
			)
			.where(
				S10T.bill_mng_no.in(
					subQuery()
					.select(S12T2.bill_mng_no)
					.from(S12T2)
					.where(
						S12T2.bcst_cd.eq(bindEx("bcst_cd"))
						.and(S12T2.bill_dpt_cd.eq(bindEx("bill_dpt_cd")))
						.and(S12T2.iv_no.eq(bindEx("iv_no")))
						.and(S12T2.trd_cur_cd.eq(bindEx("trd_cur_cd")))
						.and(
							S12T2.wrk_no.eq(bindEx("wrk_no"))
							.or(S12T2.wrk_no.isNull())
							.and(bindEx("wrk_no").isNull())
						)
					)
				)
				.and(
					exists(
						subQuery()
						.select(value("X"))
						.from(
							S13W1
							.innerJoin(S13W2).on(
								S13W1.bill_d_no.eq(S13W2.bill_d_no)
								.and(S13W2.crryovr_src_bill_d_no.eq(S10T.bill_d_no))
							)
							.innerJoin(S13W3).on(
								S13W3.bill_d_no.eq(S13W2.crryovr_src_bill_d_no)
								.and(S13W3.cl_flg.eq(value(false)))
							)
						)
						.where(
							S13W1.cl_flg.eq(value(true))
						)
					)
				)
				.and(S10T.valid_flg.eq(value(false)))
			);
		q2.executeUpdate(null,bindR);
	}

	/**
	 * 請求締処理<br />
	 * 
	 * 請求の締処理を行い、付随する入金予定・売掛先別請求の締処理を呼び出す
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param prntBillId 締対象の請求管理ＮＯ
	 * @param prntBillNo 締対象の請求書ＮＯ
	 * @param billClStsTyp 請求締処理区分
	 * @param tgtDt 対象日
	 * @param downR 下り電文
	 */
	protected void updBill(MSW_BILL_R wkBillR, String prntBillMngNo, String prntBillNo,
			boolean billDSelFlg, MSC_BILL_CL_STS_TYP billClStsTyp, MCDate tgtDt, BillCl_Upd02_HdrR downR) {

		boolean onceFlg = true;

		for (MST_BILL_R billR : getBillForUpdBill(wkBillR.dat_cntr())) {

			AddBillInfoR addBillInfoR =
					addBillAmt(billR.bill_cl_dt(), wkBillR, billR.bill_mng_no(), null, null, null);

			updRcvSchd(wkBillR, billR.bill_mng_no(), prntBillMngNo, billClStsTyp, addBillInfoR, tgtDt, downR);

			// バッチからで全未発行の場合、次のレコードへ
			if (isSame(addBillInfoR.prnt_typ(), PRNT_TYP_ALL_NOT_PRNT)
					&& MSC_BILL_CL_STS_TYP.isCL_BATCH(billClStsTyp)) {
				continue;
			}

			// 請求済相殺額の更新
			if (onceFlg) {
				updRcvBillSetoffAmt(prntBillMngNo);
				onceFlg = false;
			}

			regBill(wkBillR, prntBillMngNo, prntBillNo, addBillInfoR.add_bill(), billDSelFlg, billClStsTyp, tgtDt);

			updRcvActD(billR.bill_mng_no(), prntBillMngNo);

			if (isSame(addBillInfoR.prnt_typ(), PRNT_TYP_ALL_PRNT)) {
				MST_BILL_R t = MST_BILL_R.create("T");
				execDbDelete("MSBGL5030_MST_BILL_D03", t, t.bill_mng_no.eq(bind("1")), billR.bill_mng_no());
			}
			else {
				updNotBill(billR.bill_mng_no(), addBillInfoR.add_not_bill(), wkBillR.inpt_bill_cl_dt(), getSelBaseDt(billR));
			}
		}
	}

	/**
	 * 請求締予定の請求情報取得<br />
	 * 
	 * 請求ヘッダより請求締予定の請求情報を取得する
	 * 
	 * @param datCntr 条件とするデータカウンタ
	 * 
	 * @return 請求締予定の請求情報
	 */
	protected MCList<MST_BILL_R> getBillForUpdBill(MCNumber datCntr) {
		MCList<MST_BILL_R> l = MCList.create(MST_BILL_R.class);
		MST_BILL_R t = MST_BILL_R.create("T");
		MSW_BILL_R w1 = MSW_BILL_R.create("W1");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.addInnerJoin(w1,
				w1.bcst_cd.eq(t.bcst_cd)
				.and(w1.bill_dpt_cd.eq(t.bill_dpt_cd))
				.and(w1.iv_no.eq(t.iv_no))
				.and(w1.trd_cur_cd.eq(t.trd_cur_cd))
						.and(w1.wrk_no.eq(t.wrk_no)
								.or(w1.wrk_no.isNull())
								.and(t.wrk_no.isNull()))
						.and(w1.bill_cl_dt.eq(t.bill_cl_dt)));
		l_bldr.addWhereWithAnd(w1.dat_cntr.eq(bind("1")), datCntr);
		l_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
		l_bldr.addOrderByAsc(t.bill_cl_dt);
		dbSelect("MSBGL5030_MST_BILL_S10", l, l_bldr);
		return l;
	}

	/**
	 * 請求額加算<br />
	 * 
	 * 未請求用と請求用の請求額・入金額を計算する<br>
	 * 売掛先ＣＤか債権部門ＣＤが渡された場合はそのコードごとに計算する
	 * 
	 * @param billClDt 請求締年月日
	 * @param wkBillR 締対象の請求情報
	 * @param billMngNo 請求管理ＮＯ
	 * @param acstCd 売掛先ＣＤ（売掛先別の場合のみ指定）
	 * @param arDptCd 債権部門ＣＤ（債権部門別の場合のみ指定）
	 * @param arTyp 債権区分（債権区分別の場合のみ指定）
	 * 
	 * @return 請求額
	 */
	protected AddBillInfoR addBillAmt(MCDate billClDt, MSW_BILL_R wkBillR,
			String billMngNo, String acstCd, String arDptCd, String arTyp) {

		AddBillInfoR retR = initAddBillAmt();
		int prntQty = 0;
		int notPrntQty = 0;

		// 対象となる請求明細を取得
		MCList<MST_BILL_D_R> billDL =
				getBillD(wkBillR.dat_cntr(), billMngNo, acstCd, arDptCd, arTyp);
		// 値引品目を考慮して符号を反転する
		MSBGL_ArUtil.editUpForDscntItm(billDL);

		for (MST_BILL_D_R billDR : getBillDGroupL(billDL)) {
			// 締対象の請求情報の金額を計算
			if (billDR.getBoolean("cl_flg")) {
				setAddBill(billDR, retR.add_bill());
				prntQty++;
			}
			else {
				setAddBill(billDR, retR.add_not_bill());
				notPrntQty++;
			}
		}
		// 明細なし
		if (notPrntQty == 0 && prntQty == 0) {
			if (!MAC_Y4M.isNULL_VAL(billClDt)
					&& billClDt.gt(wkBillR.inpt_bill_cl_dt())) {
				// 全未発行
				retR.prnt_typ(PRNT_TYP_ALL_NOT_PRNT);
			}
			else {
				// 全発行
				retR.prnt_typ(PRNT_TYP_ALL_PRNT);
			}
		}
		else if (notPrntQty == 0) {
			// 全発行
			retR.prnt_typ(PRNT_TYP_ALL_PRNT);
		}
		else if (prntQty == 0) {
			// 全未発行
			retR.prnt_typ(PRNT_TYP_ALL_NOT_PRNT);
		}
		else {
			// 一部発行
			retR.prnt_typ(PRNT_TYP_PART_PRNT);
		}

		return retR;
	}

	/**
	 * 請求明細をグルーピングしたリストを取得する
	 * 
	 * @param billDL 請求明細
	 * @return グルーピングしたリスト
	 */
	protected MCList<MST_BILL_D_R> getBillDGroupL(
			MCList<MST_BILL_D_R> billDL) {
		MCList<MST_BILL_D_R> l = billDL.groupBy(getBillDGroupByPolicy());
		return l;
	}

	/**
	 * 請求明細をグルーピングするMCGroupByPolicyを取得する
	 * 
	 * @return 請求明細のグルーピングキー
	 */
	protected MCGroupByPolicy getBillDGroupByPolicy() {
		MCGroupByPolicy gp = new MCGroupByPolicy(_billDGroupByCols);
		gp.sum(MST_BILL_D_R.$trd_cur_amt,
				MST_BILL_D_R.$trd_cur_amt1,
				MST_BILL_D_R.$trd_cur_amt2,
				MST_BILL_D_R.$trd_cur_amt3,
				MST_BILL_D_R.$trd_cur_tax_amt,
				MST_RCV_ACT_D_R.$trd_cur_tax_amt1,
				MST_RCV_ACT_D_R.$trd_cur_tax_amt2,
				MST_RCV_ACT_D_R.$trd_cur_tax_amt3,
				MST_BILL_D_R.$wtax_amt);
		return gp;
	}
	protected String[] _billDGroupByCols = {
			MST_BILL_D_R.$ar_trd_grp_typ,
			MST_BILL_D_R.$trd_ptn_typ,
			MST_BILL_D_R.$rcv_typ,
			MSW_BILL_D_R.$cl_flg
			,MAM_STTL_R.$bill_tax_disp_flg
			};

	/**
	 * 請求額初期化<br />
	 * 
	 * 未請求用と請求用の請求額・入金額を表すコンテナを初期化する
	 * 
	 * @return 初期化されたコンテナ
	 */
	protected AddBillInfoR initAddBillAmt() {
		AddBillInfoR r = AddBillInfoR.create();
		initAddBillAmt(r.add_bill());
		initAddBillAmt(r.add_not_bill());
		return r;
	}

	/**
	 * 請求額初期化<br />
	 * 
	 * 請求額を全て0に初期化する
	 * 
	 * @param addBillInfo 初期化する請求額を表すコンテナ
	 */
	protected void initAddBillAmt(MST_BILL_ACST_R addBillInfo) {
		addBillInfo.xfr_amt(MCNumber.ZERO);
		addBillInfo.note_amt(MCNumber.ZERO);
		addBillInfo.cash_amt(MCNumber.ZERO);
		addBillInfo.setoff_amt(MCNumber.ZERO);
		addBillInfo.setoff_tax_amt(MCNumber.ZERO);
		addBillInfo.sw_amt(MCNumber.ZERO);
		addBillInfo.sls_amt(MCNumber.ZERO);
		addBillInfo.ret_amt(MCNumber.ZERO);
		addBillInfo.dscnt_amt(MCNumber.ZERO);
		addBillInfo.sw_to_amt(MCNumber.ZERO);
		addBillInfo.tax_amt(MCNumber.ZERO);
		addBillInfo.addNumberColumn("wtax_amt", MCNumber.ZERO);
	}

	/**
	 * 請求額計算対象取得<br />
	 * 
	 * 請求額を計算する対象を取得する
	 * 
	 * @param datCntr 条件のデータカウンタ
	 * @param billMngNo 条件の請求管理ＮＯ
	 * @param acstCd 条件の売掛先ＣＤ
	 * @param arDptCd 条件の債権部門ＣＤ
	 * 
	 * @return 請求額計算対象
	 */
	protected MCList<MST_BILL_D_R> getBillD(MCNumber datCntr, String billMngNo, String acstCd, String arDptCd, String arTyp) {

		MCList<MST_BILL_D_R> l = MCList.create(MST_BILL_D_R.class);
		l.addNumberColumn(MST_RCV_ACT_D_R.$trd_cur_tax_amt1);
		l.addNumberColumn(MST_RCV_ACT_D_R.$trd_cur_tax_amt2);
		l.addNumberColumn(MST_RCV_ACT_D_R.$trd_cur_tax_amt3);
		l.addStringColumn(MST_RCV_ACT_R.$ar_sttl_typ1);
		l.addStringColumn(MST_RCV_ACT_R.$ar_sttl_typ2);
		l.addStringColumn(MST_RCV_ACT_R.$ar_sttl_cd1);
		l.addStringColumn(MST_RCV_ACT_R.$ar_sttl_cd2);
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MSW_BILL_D_R t2 = MSW_BILL_D_R.create("T2");
		MST_BILL_ACST_R t3 = MST_BILL_ACST_R.create("T3");
		MST_RCV_ACT_D_R t4 = MST_RCV_ACT_D_R.create("t4");
		MST_RCV_ACT_R RCVACT = MST_RCV_ACT_R.create("RCVACT");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l.addBooleanColumn("cl_flg");
		l_bldr.addSelect(t2.cl_flg);
		l_bldr.addSelect(
			nvl(t4.trd_cur_tax_amt1, value(0)).as("trd_cur_tax_amt1"),
			nvl(t4.trd_cur_tax_amt2, value(0)).as("trd_cur_tax_amt2"),
			nvl(t4.trd_cur_tax_amt3, value(0)).as("trd_cur_tax_amt3")
		);
		l_bldr.addSelect(
			RCVACT.ar_sttl_typ1,
			RCVACT.ar_sttl_typ2,
			RCVACT.ar_sttl_cd1,
			RCVACT.ar_sttl_cd2
		);
		l_bldr.addInnerJoin(t2, t.bill_d_no.eq(t2.bill_d_no));
		// 売掛先、売掛部門別の場合のみ意味がある結合
		l_bldr.addInnerJoin(t3, t.bill_acst_no.eq(t3.bill_acst_no));
		l_bldr.addLeftOuterJoin(t4,
			t.act_d_no.eq(t4.rcv_act_d_no)
			.and(t.act_d_seq.eq(t4.rcv_act_d_seq))
			.and(t.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
		);
		l_bldr.addLeftOuterJoin(RCVACT,
			t4.rcv_act_no.eq(RCVACT.rcv_act_no)
			.and(t4.rcv_act_seq.eq(RCVACT.rcv_act_seq))
		);

		l_bldr.addWhereWithAnd(t2.dat_cntr.eq(bind("1")), datCntr);
		l_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
		// 売掛先、売掛部門別の場合、締対象の請求管理ＮＯで絞り込む（明細ワークの請求管理ＮＯが締対象の請求管理ＮＯに更新済みの為）
		// 請求単位の場合、締対象となる請求管理ＮＯで絞り込む(明細ワークの請求管理ＮＯが未更新の為）
		l_bldr.addWhereWithAnd(t2.bill_mng_no.eq(bind("1")), billMngNo);
		// 売掛先、売掛部門別の指定があれば、絞り込む
		l_bldr.addWhereWithCutOffAnd(t3.acst_cd.eq(bind("1")), acstCd);
		l_bldr.addWhereWithCutOffAnd(t3.ar_dpt_cd.eq(bind("1")), arDptCd);
		l_bldr.addWhereWithCutOffAnd(t3.ar_typ.eq(bind("1")), arTyp);

		dbSelect("MSBGL5030_MST_BILL_D_S11", l, l_bldr);
		if (!isNull(l)) {
			setBillTaxDispFlg(l);
		}
		return l;
	}
	protected void setBillTaxDispFlg(MCList<?> tgtL) {
		tgtL.addBooleanColumn(MAM_STTL_R.$bill_tax_disp_flg, false);
		for (MCRow tgtR : tgtL) {
			if (MAC_AR_STTL_TYP.isSETOFF_DR(tgtR.getStringNE(MST_RCV_ACT_R.$ar_sttl_typ1))) {
				MAM_STTL_R sttlR = _cacheSttl.get(tgtR.getStringNE(MST_RCV_ACT_R.$ar_sttl_cd1));
				if (!isNull(sttlR)) {
					tgtR.setBoolean(MAM_STTL_R.$bill_tax_disp_flg, sttlR.bill_tax_disp_flg());
				}
			}
			if (MAC_AR_STTL_TYP.isSETOFF_DR(tgtR.getStringNE(MST_RCV_ACT_R.$ar_sttl_typ2))) {
				MAM_STTL_R sttlR = _cacheSttl.get(tgtR.getStringNE(MST_RCV_ACT_R.$ar_sttl_cd2));
				if (!isNull(sttlR)) {
					tgtR.setBoolean(MAM_STTL_R.$bill_tax_disp_flg, sttlR.bill_tax_disp_flg());
				}
			}
		}
	}

	public static void setBillPrntTgtFlg(MCList<MST_BILL_D_R> billDL, MAM_BP_R bcstR) {
		object(CLAZZ)._setBillPrntTgtFlg(billDL, bcstR);
	}
	protected void _setBillPrntTgtFlg(MCList<MST_BILL_D_R> billDL, MAM_BP_R bcstR) {
		
		MCIndexKey billDLKey = billDL.createIndex(getBillDLKey());
		
		for (MST_BILL_D_R billDR : billDL) {
			
			if (!isSetBillPrntTgt(billDR)) {
				continue;
			}
			
			if (MAC_BILL_CAN_SLIP_TYP.isDISP_DIFF(bcstR.bill_can_slip_typ())){
				
				if (!isSame(billDR.act_d_seq(), MCNumber.ONE)
						&& (MAC_SLIP_STS_TYP.isCRT(billDR.slip_sts_typ()) || MAC_SLIP_STS_TYP.isDIS(billDR.slip_sts_typ()))) {
					MST_BILL_D_R canR = billDL.getFirst(billDLKey, getBillDLDisKeyVal(billDR));
					if (!isNull(canR)) {
						MST_BILL_D_R disR = billDL.getFirst(billDLKey, getBillDLDisKeyVal(canR));
						if (!isNull(disR)) {
							if (isSameData(billDR, disR, canR, bcstR)) {
								canR.bill_prnt_tgt_flg(false);
								billDR.bill_prnt_tgt_flg(false);
							}
						}
					}
				}
			}
			else if (MAC_BILL_CAN_SLIP_TYP.isNO_DISP(bcstR.bill_can_slip_typ())){
				if (MAC_SLIP_STS_TYP.isDIS(billDR.slip_sts_typ())) {
					if (isAllBill(billDR) && isCanSlipExist(billDR, billDL, billDLKey)) {
						billDR.bill_prnt_tgt_flg(false);
						continue;
					}
				}
				if (MAC_SLIP_STS_TYP.isCAN(billDR.slip_sts_typ())) {
					if (isAllBill(billDR) && isDisSlipExist(billDR, billDL, billDLKey)) {
						billDR.bill_prnt_tgt_flg(false);
						continue;
					}
				}
			}
		}
	}
	protected boolean isSetBillPrntTgt(MST_BILL_D_R billDR) {
		
		return MSC_BILL_D_TYP.isSLS(billDR.bill_d_typ());
	}
	protected boolean isSameData(MST_BILL_D_R crtR, MST_BILL_D_R disR, MST_BILL_D_R canR, MAM_BP_R bcstR) {
		
		boolean ret = true;
		if (!isSame(nvl(crtR.dlv_dt(), crtR.ac_dt()), nvl(disR.dlv_dt(), disR.ac_dt()))
				|| !isSame(crtR.base_sls_ac_dt(), disR.base_sls_ac_dt())
				|| !isSame(crtR.dlv_slip_no(), disR.dlv_slip_no())
				|| !isSame(crtR.itm_cd(), disR.itm_cd())
				|| !isSame(crtR.itm_sub1(), disR.itm_sub1())
				|| !isSame(crtR.itm_sub2(), disR.itm_sub2())
				|| !isSame(crtR.itm_sub3(), disR.itm_sub3())
				|| !isSame(crtR.itm_nm(), disR.itm_nm())
				|| !isSame(crtR.cst_itm_cd(), disR.cst_itm_cd())
				|| !isSame(crtR.cst_itm_nm(), disR.cst_itm_nm())
				|| !isSame(crtR.trd_unit_qty(), disR.trd_unit_qty())
				|| !isSame(crtR.trd_unit_cd(), disR.trd_unit_cd())
				|| !isSame(crtR.trd_cur_upri(), disR.trd_cur_upri())
				|| !isSame(crtR.trd_cur_amt(), disR.trd_cur_amt())
				|| !isSame(crtR.trd_cur_tax_amt(), disR.trd_cur_tax_amt())
				|| !isSame(crtR.tax_cd(), disR.tax_cd())
				|| !isSame(crtR.trd_d_rmrks(), disR.trd_d_rmrks())
				|| !isSame(crtR.bill_d_rmrks(), disR.bill_d_rmrks())) {
			ret = false;
		}
		if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_ACST(bcstR.bill_dtl_subttl_typ())) {
			if (!isSame(crtR.getStringNE("acst_cd"), disR.getStringNE("acst_cd"))) {
				ret = false;
			}
		}
		else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_CST(bcstR.bill_dtl_subttl_typ())) {
			if (!isSame(crtR.cst_cd(), disR.cst_cd())) {
				ret = false;
			}
		}
		else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_DLV(bcstR.bill_dtl_subttl_typ())) {
			if (!isSame(crtR.dlv_cd(), disR.dlv_cd())) {
				ret = false;
			}
		}
		else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_WRK(bcstR.bill_dtl_subttl_typ())) {
			if (!isSame(crtR.wrk_no(), disR.wrk_no())) {
				ret = false;
			}
		}
		
		if (MAC_SLS_DTL_OUTP_TYP.isEACH_CST(bcstR.sls_dtl_outp_typ())) {
			if (!isSame(crtR.cst_cd(), disR.cst_cd())) {
				ret = false;
			}
		}
		else if (MAC_SLS_DTL_OUTP_TYP.isEACH_ACST(bcstR.sls_dtl_outp_typ())) {
			if (!isSame(crtR.getStringNE("acst_cd"), disR.getStringNE("acst_cd"))) {
				ret = false;
			}
		}
		return ret;
	}
	protected boolean isAllBill(MST_BILL_D_R billDR) {
		if (MSC_BILL_MTD_TYP.isALL_BILL(billDR.bill_mtd_typ()) && !billDR.getBooleanNE("crryovr_flg")) {
			return true;
		}
		return false;
	}
	protected boolean isCanSlipExist(MST_BILL_D_R billDR, MCList<MST_BILL_D_R> billDL, MCIndexKey billDLKey) {
		if (!isNull(billDR.act_d_seq()) 
				&& billDL.subList(billDLKey, getBillDLCanKeyVal(billDR)).size() > 0) {
			return true;
		}
		return false;
	}
	protected boolean isDisSlipExist(MST_BILL_D_R billDR, MCList<MST_BILL_D_R> billDL, MCIndexKey billDLKey) {
		if (!isNull(billDR.act_d_seq()) 
				&& billDL.subList(billDLKey, getBillDLDisKeyVal(billDR)).size() > 0) {
			return true;
		}
		return false;
	}
	protected String[] getBillDLKey() {
		return new String[] {
				MST_BILL_D_R.$act_d_no,
				MST_BILL_D_R.$act_d_seq,
				MST_BILL_D_R.$bill_mtd_typ,
				MST_BILL_D_R.$crryovr_flg
		};
	}
	protected Comparable<?>[] getBillDLCanKeyVal(MST_BILL_D_R r) {
		return new Comparable<?>[] {
				r.act_d_no(),
				r.act_d_seq().add(1),
				r.bill_mtd_typ(),
				false
		};
	}
	protected Comparable<?>[] getBillDLDisKeyVal(MST_BILL_D_R r) {
		return new Comparable<?>[] {
				r.act_d_no(),
				r.act_d_seq().add(-1),
				r.bill_mtd_typ(),
				false
		};
	}

	/**
	 * 請求額設定<br />
	 * 
	 * 請求額を計算して設定する
	 * 
	 * @param billDR 請求額を計算する請求明細
	 * @param addBillInfo 請求額を計算した結果を格納するコンテナ
	 */
	protected void setAddBill(MST_BILL_D_R billDR, MST_BILL_ACST_R addBillInfo) {
		addBillInfo.xfr_amt(addBillInfo.xfr_amt().add(
				MSBGL_ArUtil.getXfrAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(), billDR.rcv_typ(),
				billDR.trd_cur_amt1(), billDR.trd_cur_amt2(), billDR.trd_cur_amt3())));
		addBillInfo.note_amt(addBillInfo.note_amt().add(
				MSBGL_ArUtil.getNoteAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(), billDR.rcv_typ(),
				billDR.trd_cur_amt1(), billDR.trd_cur_amt2(), billDR.trd_cur_amt3())));
		addBillInfo.cash_amt(addBillInfo.cash_amt().add(
				MSBGL_ArUtil.getCashAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(), billDR.rcv_typ(),
				billDR.trd_cur_amt1(), billDR.trd_cur_amt2(), billDR.trd_cur_amt3())));
		MCNumber setoffTaxAmt =
			MSBGL_ArUtil.getSetoffTaxAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(),
				billDR.getNumber("trd_cur_tax_amt1"), billDR.getNumber("trd_cur_tax_amt2"), billDR.getNumber("trd_cur_tax_amt3"),
				billDR.getBoolean("bill_tax_disp_flg"));
		addBillInfo.setoff_tax_amt(addBillInfo.setoff_tax_amt().add(setoffTaxAmt));
		addBillInfo.setoff_amt(addBillInfo.setoff_amt().add(
				MSBGL_ArUtil.getSetoffAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(),
				billDR.trd_cur_amt1(), billDR.trd_cur_amt2(), billDR.trd_cur_amt3())).subtract(setoffTaxAmt));
		addBillInfo.sw_amt(addBillInfo.sw_amt().add(
				MSBGL_ArUtil.getArSwAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(),
				billDR.trd_cur_amt1(), billDR.trd_cur_amt2(), billDR.trd_cur_amt3())));
		addBillInfo.sls_amt(addBillInfo.sls_amt().add(
				MSBGL_ArUtil.getSlsAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(), billDR.trd_cur_amt())));
		addBillInfo.ret_amt(addBillInfo.ret_amt().add(
				MSBGL_ArUtil.getRetAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(), billDR.trd_cur_amt())));
		addBillInfo.dscnt_amt(addBillInfo.dscnt_amt().add(
				MSBGL_ArUtil.getDscntAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(), billDR.trd_cur_amt())));
		addBillInfo.sw_to_amt(addBillInfo.sw_to_amt().add(
				MSBGL_ArUtil.getArSwToAmt(billDR.trd_ptn_typ(), billDR.ar_trd_grp_typ(),
				billDR.trd_cur_amt1(), billDR.trd_cur_amt2(), billDR.trd_cur_amt3())));
		addBillInfo.tax_amt(addBillInfo.tax_amt().add(
				MSBGL_ArUtil.getTaxAmt(billDR.trd_ptn_typ(), billDR.trd_cur_tax_amt())));
		addBillInfo.setNumberNE("wtax_amt", addBillInfo.getNumberNE("wtax_amt").add(
				MSBGL_ArUtil.getWtaxAmt(billDR.trd_ptn_typ(), billDR.wtax_amt())));
	}

	/**
	 * 入金予定の更新<br />
	 * 
	 * 今回請求分、未請求分のそれぞれに関連する入金予定を登録・更新する
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param billMngNo 登録済の請求管理ＮＯ
	 * @param prntBillMngNo 今回締対象の請求管理ＮＯ
	 * @param billClStsTyp 請求締処理区分
	 * @param addBillInfoR 請求額情報
	 * @param tgtDt 対象日
	 * @param downR 下り電文
	 */
	protected void updRcvSchd(MSW_BILL_R wkBillR, String billMngNo, String prntBillMngNo,
			MSC_BILL_CL_STS_TYP billClStsTyp, AddBillInfoR addBillInfoR, MCDate tgtDt, BillCl_Upd02_HdrR downR) {

		// 全未発行の場合は処理を行わない
		if (isSame(addBillInfoR.prnt_typ(), PRNT_TYP_ALL_NOT_PRNT)
				&& MSC_BILL_CL_STS_TYP.isCL_BATCH(billClStsTyp)) {
			return;
		}

		// 今回締対象のデータを検索
		MCList<MST_RCV_SCHD_R> srchL = MSBGL_ArUtil.getRcvSchdL(prntBillMngNo);

		// 入金予定対象の金額、源泉税額を取得する
		MCNumber rcvSchdAmt = getRcvSchdAmt(addBillInfoR.add_bill(), srchL);
		MCNumber wtaxAmt = getWtaxAmt(addBillInfoR.add_bill(), srchL);
		rcvSchdAmt = rcvSchdAmt.subtract(wtaxAmt);

		// ユーティリティの共通処理を呼出、入金予定レコードを作成する
		MCList<MST_RCV_SCHD_R> regRcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
		regRcvSchdL = MSBGL_ArUtil.getRcvSchd(wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(),
						wkBillR.trd_cur_cd(), rcvSchdAmt, wkBillR.inpt_bill_cl_dt());

		if (isNull(regRcvSchdL)) {
			MCMessage msg = new MCMessage(downR, null, MSBGL0073, wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(), wkBillR.trd_cur_cd());
			throw new MCAppException(msg);
		}
		chkRcvMtdCd(regRcvSchdL, downR);

		setWtaxInfo(regRcvSchdL, wtaxAmt);

		// 画面から入金予定日が設定された場合、その入金予定日で上書きする
		if (!isNull(wkBillR.inpt_rcv_schd_dt())) {
			regRcvSchdL.setDate(MST_RCV_SCHD_R.$rcv_schd_dt, wkBillR.inpt_rcv_schd_dt());
		}

		if (srchL.isEmpty()) {
			insRcvSchd(regRcvSchdL, prntBillMngNo);
		}
		else {
			updRcvSchd(srchL, regRcvSchdL, prntBillMngNo);
		}

		setDownRcvSchdDt(downR, regRcvSchdL, tgtDt);

		// 全発行の場合
		if (isSame(addBillInfoR.prnt_typ(), PRNT_TYP_ALL_PRNT)) {
			// 未発行の入金予定を削除する
			MST_RCV_SCHD_R t2 = MST_RCV_SCHD_R.create("T");
			execDbDelete("MSBGL5030_MST_RCV_SCHD_D04", t2, t2.bill_mng_no.eq(bind("1")), billMngNo);
		}
		// 一部発行の場合
		else {
			// 未請求で残る入金予定の再作成（入金予定制御マスタが変わっている場合を考慮）
			updRcvSchdAddNotBill(wkBillR, addBillInfoR.add_not_bill(), billMngNo);
		}
	}

	/**
	 * 入金予定日設定<br />
	 * 下り電文の入金予定日を設定する<br>
	 * 対象日より未来の入金予定日が存在する場合、対象日より未来方向に一番近い入金予定日を設定<br>
	 * 対象日より未来の入金予定日が存在しない場合、対象日より過去方向に一番近い入金予定日を設定
	 * 
	 * @param downR 下り電文
	 * @param regRcvSchdL 入金予定情報リスト
	 * @param tgtDt 対象日
	 */
	protected void setDownRcvSchdDt(BillCl_Upd02_HdrR downR, 
			MCList<MST_RCV_SCHD_R> regRcvSchdL, MCDate tgtDt) {
		if (!isNull(downR)) {
			MCList<MST_RCV_SCHD_R> bigL = MCList.create(MST_RCV_SCHD_R.class);
			for (MST_RCV_SCHD_R r : regRcvSchdL) {
				if (tgtDt.lte(r.rcv_schd_dt())) {
					bigL.add(r);
				}
			}
			if (bigL.isEmpty()) {
				downR.rcv_schd_dt((MCDate)regRcvSchdL.max(MST_RCV_SCHD_R.$rcv_schd_dt));
			}
			else {
				downR.rcv_schd_dt((MCDate)bigL.min(MST_RCV_SCHD_R.$rcv_schd_dt));
			}
		}
	}

	/**
	 * 入金予定の更新<br />
	 * 未請求分の入金予定額から入金予定情報を作成して登録・更新する
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param addNotBill 未請求分の請求額情報
	 * @param billMngNo 請求管理ＮＯ
	 */
	protected void updRcvSchdAddNotBill(MSW_BILL_R wkBillR,
			MST_BILL_ACST_R addNotBill, String billMngNo) {

		MCNumber rcvSchdAmt = getSlsAmt(addNotBill);
		MCNumber wtaxAmt = addNotBill.getNumber("wtax_amt");
		rcvSchdAmt = rcvSchdAmt.subtract(wtaxAmt);

		// ユーティリティの共通処理を呼出、入金予定レコードを作成する
		MCList<MST_RCV_SCHD_R> regRcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
		MST_BILL_R billR = getBillR(billMngNo);
		regRcvSchdL = MSBGL_ArUtil.getRcvSchd(billR.bcst_cd(), billR.bill_dpt_cd(),
				billR.trd_cur_cd(), rcvSchdAmt, MAC_Y4M.isNULL_VAL(billR.bill_cl_dt()) ? getToday() : billR.bill_cl_dt());

		setWtaxInfo(regRcvSchdL, wtaxAmt);

		// 今回締対象のデータを検索
		MCList<MST_RCV_SCHD_R> srchL = MSBGL_ArUtil.getRcvSchdL(billMngNo);

		updRcvSchd(srchL, regRcvSchdL, billMngNo);
	}

	/**
	 * 源泉税用の入金予定情報設定<br />
	 * 引数の入金予定情報リストに源泉税用の情報を作成して設定する<br>
	 * 入金予定情報リストには源泉税以外の入金方法で情報が設定されている前提
	 * 
	 * @param l 入金予定情報リスト
	 * @param wtaxAmt 源泉税額
	 */
	protected void setWtaxInfo(MCList<MST_RCV_SCHD_R> l, MCNumber wtaxAmt) {

		// 源泉税が設定されている場合、源泉税用の入金予定レコードを作成して登録用リストに追加する
		if (!wtaxAmt.isZero()) {
			if (isNull(MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.WTAX.value()).sttl_cd())) {
				throw new MCAppException(MSBGL0072);
			}
			// 源泉税用の入金予定レコードを追加する
			l.add(getWtax(l, wtaxAmt));
		}
	}

	/**
	 * 入金予定額の取得<br />
	 * 
	 * 既に登録済の入金予定情報がある場合、その入金予定額を加算する
	 * 
	 * @param addBillR 請求額情報
	 * @param rcvSchdL　既に登録済の入金予定情報
	 * 
	 * @return 今回取引で対象となる入金予定額
	 */
	protected MCNumber getRcvSchdAmt(MST_BILL_ACST_R addBillR, MCList<MST_RCV_SCHD_R> rcvSchdL) {
		if (rcvSchdL.isEmpty()) {
			return getSlsAmt(addBillR);
		}
		else {
			return getSlsAmt(addBillR).add(getRcvSchdAmt(rcvSchdL));
		}
	}

	/**
	 * 売上金額の取得<br />
	 * 
	 * 請求額情報より売上額を合計して返却する
	 * 
	 * @param addBillR 請求額情報
	 * 
	 * @return 売上金額
	 */
	protected MCNumber getSlsAmt(MST_BILL_ACST_R addBillR) {
		return addBillR.sls_amt().add(addBillR.ret_amt()).add(
				addBillR.dscnt_amt()).add(addBillR.sw_to_amt()).add(addBillR.tax_amt());
	}

	/**
	 * 登録済の入金予定額取得<br />
	 * 
	 * 既に登録済の入金予定情報より入金予定額の合計を取得し返却する
	 * 
	 * @param rcvSchdL 既に登録済の入金予定情報
	 * 
	 * @return 入金予定額の合計
	 */
	protected MCNumber getRcvSchdAmt(MCList<MST_RCV_SCHD_R> rcvSchdL) {
		return rcvSchdL.sum(MST_RCV_SCHD_R.$rcv_schd_amt);
	}

	/**
	 * 源泉税額の取得<br />
	 * 
	 * 既に登録済の源泉税の入金予定情報がある場合、その源泉税額を加算する
	 * 
	 * @param addBillR 請求額情報
	 * @param rcvSchdL 既に登録済の入金予定情報
	 * 
	 * @return　今回取引で対象となる源泉税額
	 */
	protected MCNumber getWtaxAmt(MST_BILL_ACST_R addBillR, MCList<MST_RCV_SCHD_R> rcvSchdL) {
		if (rcvSchdL.isEmpty()) {
			return addBillR.getNumber("wtax_amt");
		}
		else {
			MCNumber wtaxAmt = MCNumber.ZERO;
			// 既に登録済の源泉税額＋今回取引対象の源泉税額
			MCList<MST_RCV_SCHD_R> wtaxL = rcvSchdL.subList(
					MST_RCV_SCHD_R.$rcv_mtd_cd,
					MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.WTAX.value()).sttl_cd());
			if (!wtaxL.isEmpty()) {
				wtaxAmt = wtaxL.sum(MST_RCV_SCHD_R.$rcv_schd_amt).add(addBillR.getNumber("wtax_amt"));
			}
			return wtaxAmt.add(addBillR.getNumber("wtax_amt"));
		}
	}

	/**
	 * 入金予定の登録<br />
	 * 
	 * 入金予定レコードを登録する
	 * 
	 * @param regRcvSchdL 今回登録対象の入金予定情報
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 */
	protected void insRcvSchd(MCList<MST_RCV_SCHD_R> regRcvSchdL, String prntBillMngNo) {

		doSeqCache(MSC_NUM_SYS_TYP.RCVSCHD, regRcvSchdL.size());
		for (MST_RCV_SCHD_R r : regRcvSchdL) {
			r.rcv_schd_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHD));
			r.bill_mng_no(prntBillMngNo);
			dbInsert("MSBGL5030_MST_RCV_SCHD_I02", r, MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T")));
		}
	}

	/**
	 * 源泉税用入金予定レコード取得<br />
	 * 
	 * 源泉税用の入金予定レコードを作成し返却する
	 * 
	 * @param regRcvSchdL 今回登録対象の入金予定情報
	 * @param wtaxAmt 今回対象となる源泉税額
	 * 
	 * @return 源泉税用の入金予定レコード
	 */
	protected MST_RCV_SCHD_R getWtax(MCList<MST_RCV_SCHD_R> regRcvSchdL,
			MCNumber wtaxAmt) {
		MST_RCV_SCHD_R r = MST_RCV_SCHD_R.create();
		r.rcv_schd_dt((MCDate)regRcvSchdL.min(MST_RCV_SCHD_R.$rcv_schd_dt));
		r.rcv_schd_amt(wtaxAmt);
		r.rcv_mtd_cd(MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.WTAX.value()).sttl_cd());
		r.rcv_typ(MAC_AR_STTL_TYP.WTAX.value());
		return r;
	}

	/**
	 * 入金予定の更新<br />
	 * 
	 * 登録対象の入金予定情報をもとに入金予定を登録・更新する<br>
	 * 同じ入金方法、入金予定日のレコードが存在する場合は更新<br>
	 * 存在しない場合は新規登録する
	 * 
	 * @param srchL 登録済の入金予定情報
	 * @param regRcvSchdL 今回登録対象の入金予定情報
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 */
	protected void updRcvSchd(MCList<MST_RCV_SCHD_R> srchL,
			MCList<MST_RCV_SCHD_R> regRcvSchdL, String prntBillMngNo) {

		// 既に登録済の入金予定情報に存在して、新しく作成した入金予定情報に存在しない場合は削除する。
		MCList<MST_RCV_SCHD_R> delL = MCList.create(MST_RCV_SCHD_R.class);
		MCIndexKey regRcvSchdKey = regRcvSchdL.createIndex(MST_RCV_SCHD_R.$rcv_mtd_cd, MST_RCV_SCHD_R.$rcv_schd_dt);
		for (MST_RCV_SCHD_R delR : srchL) {
			MST_RCV_SCHD_R r = regRcvSchdL.getFirst(regRcvSchdKey, delR.rcv_mtd_cd(), delR.rcv_schd_dt());
			if (isNull(r)) {
				delL.add(delR);
			}
		}
		
		MCQueryApiBuilder rcvSchdR_bldr = MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T"));
		MCIndexKey srchKey = srchL.createIndex(MST_RCV_SCHD_R.$rcv_mtd_cd, MST_RCV_SCHD_R.$rcv_schd_dt);
		doSeqCache(MSC_NUM_SYS_TYP.RCVSCHD, regRcvSchdL.size());
		// 新しく作成した入金予定情報をもとに入金予定を登録・更新する
		for (MST_RCV_SCHD_R regR : regRcvSchdL) {
			MST_RCV_SCHD_R lockR = srchL.getFirst(srchKey, regR.rcv_mtd_cd(), regR.rcv_schd_dt());
			if (isNull(lockR)) {
				regR.rcv_schd_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHD));
				regR.bill_mng_no(prntBillMngNo);
				dbInsert("MSBGL5030_MST_RCV_SCHD_I03", regR, rcvSchdR_bldr);
			}
			else {
				regR.rcv_schd_no(lockR.rcv_schd_no());
				updRcvSchd(regR);
			}
		}
		if (!delL.isEmpty()) {
			dbDeleteKey("MSBGL5030_MST_RCV_SCHD_D05", delL, rcvSchdR_bldr);	
		}
	}

	/**
	 * 入金予定更新<br />
	 * 
	 * 入金予定を更新する。
	 * 
	 * @param updR 更新用の入金予定
	 */
	protected void updRcvSchd(MST_RCV_SCHD_R updR) {
		MST_RCV_SCHD_R t = MST_RCV_SCHD_R.create("T");
		MCQueryApiBuilder rcvSchdR_bldr = MCQueryApiBuilder.create(t);
		rcvSchdR_bldr.setWhere(t.rcv_schd_no.eq(bindEx("rcv_schd_no")));
		rcvSchdR_bldr.setSetVL(t.rcv_schd_amt, bindEx("rcv_schd_amt"));
		dbUpdate("MSBGL5030_MST_RCV_SCHD_U02", updR, rcvSchdR_bldr);
	}

	/**
	 * 請求ヘッダ登録<br />
	 * 
	 * 請求ヘッダを登録・更新する
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * @param prntBillNo 締対象の請求書ＮＯ
	 * @param addBill 請求額
	 * @param billClStsTyp 請求締状況区分
	 * @param tgtDt 対象日
	 */
	protected void regBill(MSW_BILL_R wkBillR, String prntBillMngNo, String prntBillNo,
			MST_BILL_ACST_R addBill, boolean billDSelFlg, MSC_BILL_CL_STS_TYP billClStsTyp, MCDate tgtDt) {

		MST_BILL_R billR = getBillR(prntBillMngNo);
		if (billR.isEmpty()) {
			// 今回請求締対象のデータが存在しない
			insBill(wkBillR, prntBillMngNo, prntBillNo, addBill, billDSelFlg, billClStsTyp, tgtDt);
		}
		else {
			// 今回請求締対象のデータが存在
			updBill(billR, addBill, wkBillR.inpt_bill_cl_dt());
		}
	}

	/**
	 * 請求ヘッダ取得<br />
	 * 
	 * 請求ヘッダを取得する
	 * 
	 * @param billMngNo 請求管理ＮＯ
	 * 
	 * @return 請求ヘッダ
	 */
	protected MST_BILL_R getBillR(String billMngNo) {
		MST_BILL_R r = MST_BILL_R.create();
		dbSelectKey("MSBGL5030_MST_BILL_S11", r, MCQueryApiBuilder.create(MST_BILL_R.create("T")), billMngNo);
		return r;
	}

	/**
	 * 請求登録<br />
	 * 
	 * 請求を登録する
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * @param prntBillNo 締対象の請求書ＮＯ
	 * @param addBill 請求額
	 * @param billClStsTyp 請求締状況区分
	 * @param tgtDt 対象日
	 */
	protected void insBill(MSW_BILL_R wkBillR, String prntBillMngNo, String prntBillNo, MST_BILL_ACST_R addBill,
			boolean billDSelFlg, MSC_BILL_CL_STS_TYP billClStsTyp, MCDate tgtDt) {
		MST_BILL_R insR = MST_BILL_R.create();


		// 請求部門の取得
		String billDptCd = MSBGL_ArUtil.getBcstDpt(wkBillR.bcst_cd(), wkBillR.inpt_bill_cl_dt(), wkBillR.bill_dpt_cd(),
				wkBillR.bill_dpt_cd());

		// 金額の設定
		// 最新の請求済み請求の請求額を取得し、挿入する請求の前回請求額とする
		MCNumber lastBillAmt = getLastBillAmt(wkBillR, billDptCd);
		insR.last_bill_amt(lastBillAmt);
		// 今回繰越額、今回請求額に初期値として前回請求額を設定しておく
		insR.bfw_amt(lastBillAmt);
		insR.bill_amt(lastBillAmt);
		setAmt(insR, addBill);
		insR.adv_amt_bal(MSBGL_ArUtil.getAdvAmtBal(wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(), wkBillR.trd_cur_cd()));
		setAdvAmt(insR);
		// 金額以外の項目の設定
		insR.bill_mng_no(prntBillMngNo);
		insR.bcst_cd(wkBillR.bcst_cd());
		insR.bill_cl_dt(wkBillR.inpt_bill_cl_dt());
		insR.bill_no(prntBillNo);
		insR.iv_no(wkBillR.iv_no());
		insR.trd_cur_cd(wkBillR.trd_cur_cd());
		insR.bill_rev(1);
		insR.bill_xrate(wkBillR.bill_xrate());
		insR.wrk_no(wkBillR.wrk_no());
		insR.bill_dpt_cd(billDptCd);
		insR.wg_cd(MSBGL_ArUtil.getWgCd(billDptCd, wkBillR.inpt_bill_cl_dt()));
		insR.bill_dt(tgtDt);
		insR.bill_cl_sts_typ(billClStsTyp.value());
		insR.bill_cl_typ(getBillClTypForBill(wkBillR.bcst_cd()));
		insR.bill_tax_calc_typ(MSC_BILL_TAX_CALC_TYP.NOT_BILL.value());
		insR.foreign_flg(MSBGL_ArUtil.isForeign(insR.bcst_cd()));
		if (isSame(wkBillR.inpt_bill_cl_dt(), MAC_Y4M.NULL_VAL.value())) {
			insR.base_dt(tgtDt);
		}
		else {
			insR.base_dt(wkBillR.inpt_bill_cl_dt());
		}
		// 入金予定関連の項目の設定
		MCNumber rcvActAmt = getRcvActAmt(prntBillMngNo);
		insR.rcv_schd_amt(getBillAmt(addBill));
		insR.rcv_act_amt(rcvActAmt);
		insR.not_appl_bal(getBillAmt(addBill).subtract(rcvActAmt));
		insR.last_rcv_dt(null);
		insR.rcv_schd_adjst_flg(false);
		insR.bill_d_sel_flg(billDSelFlg);

		dbInsertEx("MSBGL5030_MST_BILL_I01", insR, MCQueryApiBuilder.create(MST_BILL_R.create("T")));
	}

	/**
	 * 請求ヘッダに設定する請求締処理区分を取得する
	 */
	protected String getBillClTypForBill(String bcstCd) {
		MAM_BP_R bcstR = MSBGL_ArUtil.getBp(bcstCd);
		if (MAC_BILL_CL_TYP.isEACH_SLS(bcstR.bill_cl_typ())) {
			// 請求締サービスでは「売上都度請求」は発生しないので「マニュアル選択請求」に変換する
			return MAC_BILL_CL_TYP.SEL.value();
		}
		return bcstR.bill_cl_typ();
	}

	/**
	 * 入金予定消込実績の入金実績額取得<br />
	 * 
	 * 今回締対象の請求管理ＮＯに紐づく入金予定消込実績がある場合、
	 * その入金実績額の合計を取得する
	 * 
	 * @param prntBillMngNo 今回締対象の請求管理ＮＯ
	 * @return 入金実績額の合計
	 */
	protected MCNumber getRcvActAmt(String billMngNo) {
		MCList<MST_RCV_SCHD_APPL_ACT_R> l = MCList.create(MST_RCV_SCHD_APPL_ACT_R.class);
		MST_RCV_SCHD_APPL_ACT_R t = MST_RCV_SCHD_APPL_ACT_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), billMngNo);
		dbSelect("MSBGL5030_MST_RCV_SCHD_APPL_ACT_S06", l, l_bldr);
		return nvl(l.sum(MST_RCV_SCHD_APPL_ACT_R.$rcv_act_amt), MCNumber.ZERO);
	}

	/**
	 * 請求済み請求額取得<br />
	 * 
	 * 最新の請求済み請求の請求額を返す
	 * 
	 * @param wkBillR 締対象の請求
	 * 
	 * @return 最新の請求済み請求の請求額
	 */
	protected MCNumber getLastBillAmt(MSW_BILL_R wkBillR, String billDptCd) {
		MCNumber lastBillAmt = MSBGL_ArUtil.getLastBillAmt(
				wkBillR.bcst_cd(), billDptCd, wkBillR.iv_no(), wkBillR.trd_cur_cd(), wkBillR.wrk_no(), false);
		if (isNull(lastBillAmt)) {
			lastBillAmt = MCNumber.ZERO;
		}
		return lastBillAmt;
	}

	/**
	 * 金額設定<br />
	 * 
	 * 金額項目を設定する
	 * 
	 * @param r 金額項目を設定するコンテナ
	 * @param addBill 請求額
	 */
	protected void setAmt(MCRow r, MST_BILL_ACST_R addBill) {
		MCNumber rcvAmt = getRcvAmt4Bill(addBill);
		MCNumber billAmt = getBillAmt4Bill(addBill);

		r.setNumber("xfr_amt", nvl(r.getNumber("xfr_amt"), MCNumber.ZERO)
				.subtract(addBill.xfr_amt()));
		r.setNumber("note_amt", nvl(r.getNumber("note_amt"), MCNumber.ZERO)
				.subtract(addBill.note_amt()));
		r.setNumber("cash_amt", nvl(r.getNumber("cash_amt"), MCNumber.ZERO)
				.subtract(addBill.cash_amt()));
		r.setNumber("setoff_amt", nvl(r.getNumber("setoff_amt"), MCNumber.ZERO)
				.subtract(addBill.setoff_amt()));
		r.setNumber("setoff_tax_amt", nvl(r.getNumber("setoff_tax_amt"), MCNumber.ZERO)
				.subtract(addBill.setoff_tax_amt()));
		r.setNumber("sw_amt", nvl(r.getNumber("sw_amt"), MCNumber.ZERO)
				.subtract(addBill.sw_amt()));
		r.setNumber("bfw_amt", nvl(r.getNumber("bfw_amt"), MCNumber.ZERO)
				.add(rcvAmt));
		r.setNumber("sls_amt", nvl(r.getNumber("sls_amt"), MCNumber.ZERO)
				.add(addBill.sls_amt()));
		r.setNumber("ret_amt", nvl(r.getNumber("ret_amt"), MCNumber.ZERO)
				.add(addBill.ret_amt()));
		r.setNumber("dscnt_amt", nvl(r.getNumber("dscnt_amt"), MCNumber.ZERO)
				.add(addBill.dscnt_amt()));
		r.setNumber("sw_to_amt", nvl(r.getNumber("sw_to_amt"), MCNumber.ZERO)
				.add(addBill.sw_to_amt()));
		r.setNumber("tax_amt", nvl(r.getNumber("tax_amt"), MCNumber.ZERO)
				.add(addBill.tax_amt()));
		r.setNumber("bill_amt", nvl(r.getNumber("bill_amt"), MCNumber.ZERO)
				.add(rcvAmt).add(billAmt));
	}

	/**
	 * 入金予定関連の金額設定<br />
	 * 
	 * 入金予定額、未消込残高を設定する
	 * 
	 * @param r 金額項目を設定するコンテナ
	 * @param addBill 請求額
	 */
	protected void setRcvAmt(MCRow r, MST_BILL_ACST_R addBill) {
		MCNumber billAmt = getBillAmt(addBill);
		r.setNumber("rcv_schd_amt", nvl(r.getNumber("rcv_schd_amt"), MCNumber.ZERO)
				.add(billAmt));
		r.setNumber("rcv_act_amt", getRcvActAmt(r.getString("bill_mng_no")));
		
	}
	protected void setAdvAmt(MST_BILL_R r) {
		MSBGL_ArUtil.setAdvAmt(r, getBillAdvL());
	}
	protected MCList<MST_RCV_ACT_D_R> getBillAdvL() {
		MSW_RCV_ACT_D_R w1 = MSW_RCV_ACT_D_R.create("W1");
		MST_RCV_ACT_D_R t1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R t2 = MST_RCV_ACT_R.create("T2");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(w1);
		bldr.setSelect(
			t2.ar_trd_grp_typ, t2.trd_ptn_typ, t2.ar_sttl_typ1,
			t1.trd_cur_amt1, t1.trd_cur_amt2, t1.trd_cur_amt3,
			t1.trd_cur_tax_amt1, t1.trd_cur_tax_amt2, t1.trd_cur_tax_amt3
		);
		bldr.addSelect(
			t2.ar_sttl_typ2,
			t2.ar_sttl_cd1,
			t2.ar_sttl_cd2
		);
		bldr.addInnerJoin(t1,
			t1.rcv_act_d_no.eq(w1.rcv_act_d_no)
			.and(t1.rcv_act_d_seq.eq(w1.rcv_act_d_seq))
		);
		bldr.addInnerJoin(t2,
			t2.rcv_act_no.eq(t1.rcv_act_no)
			.and(t2.rcv_act_seq.eq(t1.rcv_act_seq))
		);
		
		MCList<MST_RCV_ACT_D_R> rsltL = MCList.create(MST_RCV_ACT_D_R.class);
		dbSelect("MSBGL5030_MST_RCV_ACT_D_S01", rsltL, bldr);
		if (!isNull(rsltL)) {
			setBillTaxDispFlg(rsltL);
		}
		
		return rsltL;
	}

	/**
	 * 入金額取得<br />
	 * 
	 * 入金額を計算して返す
	 * 
	 * @param addBill 請求額
	 * 
	 * @return 入金額
	 */
	protected MCNumber getRcvAmt(MST_BILL_ACST_R addBill) {
		return addBill.cash_amt().add(addBill.note_amt())
			.add(addBill.xfr_amt()).add(addBill.setoff_amt()).add(addBill.sw_amt());
	}
	/**
	 * 入金額取得（請求用）
	 * ※相殺額の扱いが異なる。相殺額は入金に含めず売掛から差し引く
	 */
	protected MCNumber getRcvAmt4Bill(MST_BILL_ACST_R addBill) {
		return addBill.cash_amt().add(addBill.note_amt())
			.add(addBill.xfr_amt()).add(addBill.sw_amt());
	}

	/**
	 * 請求額取得<br />
	 * 
	 * 請求額を計算して返す
	 * 
	 * @param addBill 請求額
	 * 
	 * @return 請求額
	 */
	protected MCNumber getBillAmt(MST_BILL_ACST_R addBill) {
		return addBill.sls_amt().add(addBill.ret_amt())
			.add(addBill.dscnt_amt()).add(addBill.sw_to_amt()).add(addBill.tax_amt());
	}
	/**
	 * 請求額取得（請求用）
	 * ※相殺額の扱いが異なる。相殺額は入金に含めず売掛から差し引く
	 */
	protected MCNumber getBillAmt4Bill(MST_BILL_ACST_R addBill) {
		return getBillAmt(addBill)
			.add(addBill.setoff_amt()).add(addBill.setoff_tax_amt());
	}

	/**
	 * 請求更新<br />
	 * 
	 * 請求を更新する
	 * 
	 * @param billR 今回締対象の請求
	 * @param addBill 請求額
	 */
	protected void updBill(MST_BILL_R billR, MST_BILL_ACST_R addBill, MCDate inputBillClDt) {
		MST_BILL_R bind = billR.clone();
		// 金額の設定
		setAmt(bind, addBill);
		setRcvAmt(bind, addBill);
		bind.bill_cl_dt(inputBillClDt);

		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(t);
		billR_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
		billR_bldr.setSetVL(t.bill_dpt_cd,
				MSPA_AR_UTIL$F_GET_BCST_DPT(t.bcst_cd, bindEx("bill_cl_dt"), bindEx("bill_dpt_cd"), bindEx("bill_dpt_cd")));
		billR_bldr.addSetVL(t.bill_xrate, bindEx("bill_xrate"));
		billR_bldr.addSetVL(t.xfr_amt, bindEx("xfr_amt"));
		billR_bldr.addSetVL(t.note_amt, bindEx("note_amt"));
		billR_bldr.addSetVL(t.cash_amt, bindEx("cash_amt"));
		billR_bldr.addSetVL(t.setoff_amt, bindEx("setoff_amt"));
		billR_bldr.addSetVL(t.setoff_tax_amt, bindEx("setoff_tax_amt"));
		billR_bldr.addSetVL(t.sw_amt, bindEx("sw_amt"));
		billR_bldr.addSetVL(t.bfw_amt, bindEx("bfw_amt"));
		billR_bldr.addSetVL(t.sls_amt, bindEx("sls_amt"));
		billR_bldr.addSetVL(t.ret_amt, bindEx("ret_amt"));
		billR_bldr.addSetVL(t.dscnt_amt, bindEx("dscnt_amt"));
		billR_bldr.addSetVL(t.sw_to_amt, bindEx("sw_to_amt"));
		billR_bldr.addSetVL(t.tax_amt, bindEx("tax_amt"));
		billR_bldr.addSetVL(t.bill_amt, bindEx("bill_amt"));
		billR_bldr.addSetVL(t.rcv_schd_amt, bindEx("rcv_schd_amt"));
		billR_bldr.addSetVL(t.rcv_act_amt, bindEx("rcv_act_amt"));
		billR_bldr.addSetVL(t.not_appl_bal, bindEx("rcv_schd_amt").subtract(bindEx("rcv_act_amt")));
		dbUpdate("MSBGL5030_MST_BILL_U03", bind, billR_bldr);
	}

	/**
	 * 入金実績明細更新<br />
	 * 
	 * 入金実績明細の請求管理ＮＯを更新する
	 * 
	 * @param billMngNo 登録済の請求管理ＮＯ
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 */
	protected void updRcvActD(String billMngNo, String prntBillMngNo) {
		MST_RCV_ACT_D_R bind = MST_RCV_ACT_D_R.create();
		
		bind.bill_mng_no(billMngNo);
		bind.addStringColumn("prnt_bill_mng_no", prntBillMngNo);

		MST_BILL_D_R S1T2 = MST_BILL_D_R.create("T2");
		MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
		MCQueryApiBuilder rcvActD_bldr = MCQueryApiBuilder.create(t);
		rcvActD_bldr.setWhere(exists(subQuery().select(value("X")).from(S1T2).where(S1T2.bill_mng_no.eq(bindEx("bill_mng_no"))
				.and(t.rcv_act_no.eq(S1T2.act_no))
				.and(t.rcv_act_seq.eq(S1T2.act_seq))
				.and(S1T2.valid_flg.eq(value(true))))));
		rcvActD_bldr.setSetVL(t.bill_mng_no, bindEx("prnt_bill_mng_no"));
		dbUpdate("MSBGL5030_MST_RCV_ACT_D_U01", bind, rcvActD_bldr);
	}

	/**
	 * 請求更新<br />
	 * 
	 * 請求の金額情報を更新する
	 * 
	 * @param billMngNo 請求管理ＮＯ
	 * @param addNotBill 未請求額
	 */
	protected void updNotBill(String billMngNo, MST_BILL_ACST_R addNotBill, MCDate inptBillClDt, MCDate baseDt) {
		MST_BILL_R bind = MST_BILL_R.create();
		bind.bill_mng_no(billMngNo);
		bind.bill_cl_dt(inptBillClDt);
		bind.base_dt(baseDt);

		// 金額の設定
		setAmt(bind, addNotBill);
		setRcvAmt(bind, addNotBill);
		
		MAM_DPT_R dpt = getDpt(billMngNo, baseDt);
		bind.setStringNE("bill_dpt_cd", dpt.dpt_cd());
		bind.setStringNE("wg_cd", dpt.wg_cd());

		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
		bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
		bill_bldr.setSetVL(t.bill_dpt_cd, bindEx("bill_dpt_cd"));
		bill_bldr.addSetVL(t.wg_cd, bindEx("wg_cd"));
		bill_bldr.addSetVL(t.base_dt, bindEx("base_dt"));
		bill_bldr.addSetVL(t.xfr_amt, bindEx("xfr_amt"));
		bill_bldr.addSetVL(t.note_amt, bindEx("note_amt"));
		bill_bldr.addSetVL(t.cash_amt, bindEx("cash_amt"));
		bill_bldr.addSetVL(t.setoff_amt, bindEx("setoff_amt"));
		bill_bldr.addSetVL(t.setoff_tax_amt, bindEx("setoff_tax_amt"));
		bill_bldr.addSetVL(t.sw_amt, bindEx("sw_amt"));
		bill_bldr.addSetVL(t.bfw_amt, t.last_bill_amt.add(bindEx("bfw_amt")));
		bill_bldr.addSetVL(t.sls_amt, bindEx("sls_amt"));
		bill_bldr.addSetVL(t.ret_amt, bindEx("ret_amt"));
		bill_bldr.addSetVL(t.dscnt_amt, bindEx("dscnt_amt"));
		bill_bldr.addSetVL(t.sw_to_amt, bindEx("sw_to_amt"));
		bill_bldr.addSetVL(t.tax_amt, bindEx("tax_amt"));
		bill_bldr.addSetVL(t.bill_amt, t.last_bill_amt.add(bindEx("bill_amt")));
		bill_bldr.addSetVL(t.rcv_schd_amt, bindEx("rcv_schd_amt"));
		bill_bldr.addSetVL(t.rcv_act_amt, bindEx("rcv_act_amt"));
		bill_bldr.addSetVL(t.not_appl_bal, bindEx("rcv_schd_amt").subtract(bindEx("rcv_act_amt")));
		dbUpdate("MSBGL5030_MST_BILL_U04", bind, bill_bldr);
	}

	/**
	 * 売掛先別請求更新<br />
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * @param prntBillNo 締対象の請求書ＮＯ
	 * @param billClStsTyp 請求締状況区分
	 * 
	 * @return 今回請求締の対象となる売掛先別請求
	 */
	protected MCList<MST_BILL_ACST_R> updBillAcst(MSW_BILL_R wkBillR,
			String prntBillMngNo, String prntBillNo, MSC_BILL_CL_STS_TYP billClStsTyp) {

		// 今回請求締の対象となる売掛先別請求を取得
		MCList<MST_BILL_ACST_R> tgtBillAcstL = getBillAcst(wkBillR.dat_cntr());
		doSeqCache(MSC_NUM_SYS_TYP.BILLACST, tgtBillAcstL.size());
		for (MST_BILL_ACST_R billAcstR : tgtBillAcstL) {
			MST_BILL_R billR = getBillR(prntBillMngNo);
			// 請求額加算処理
			AddBillInfoR addBillInfoR =
				addBillAmt(billAcstR.getDate("bill_cl_dt"), wkBillR, billAcstR.bill_mng_no(),
						billAcstR.acst_cd(), billAcstR.ar_dpt_cd(), billAcstR.ar_typ());

			// バッチからで全未発行の場合、次のレコードへ
			if (isSame(addBillInfoR.prnt_typ(), PRNT_TYP_ALL_NOT_PRNT)
					&& MSC_BILL_CL_STS_TYP.isCL_BATCH(billClStsTyp) && billR.isEmpty()) {
				continue;
			}

			regBillAcst(wkBillR, billAcstR, prntBillMngNo, addBillInfoR.add_bill());

			// 全行対象の場合、未発行の売掛先別請求、売掛消込予定を削除する
			if (isSame(addBillInfoR.prnt_typ(), PRNT_TYP_ALL_PRNT)) {
				_arApplSchdDelL.addAll(getArApplSchdDelL(billAcstR));
				_billAcstDelL.add(billAcstR);
			}
			// 一部行対象の場合、未請求で残る売掛先別請求を更新する
			else {
				updBillAcstNotBill(billAcstR, addBillInfoR.add_not_bill());
			}
			billAcstR.setNumberNE(AddBillInfoR.$prnt_typ, addBillInfoR.prnt_typ());
		}
		return tgtBillAcstL;
	}

	/**
	 * 削除対象の売掛消込予定を取得
	 * 
	 * @param r 売掛先別請求情報
	 * @return 削除対象の売掛消込予定
	 */
	protected MCList<MST_AR_APPL_SCHD_R> getArApplSchdDelL(MST_BILL_ACST_R r) {
		MCList<MST_AR_APPL_SCHD_R> delL = MCList.create(MST_AR_APPL_SCHD_R.class);
		MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
		MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
		delL_bldr.addWhereWithAnd(t.bill_acst_no.eq(bind("1")), r.bill_acst_no());
		dbSelect("MSBGL5030_MST_AR_APPL_SCHD_S03", delL, delL_bldr);
		return delL;
	}

	/**
	 * 今回請求締対象の請求管理ＮＯに紐づく売掛消込予定を取得
	 * 
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * @param billAcstR 売掛先別請求
	 * @param arApplSchdR 売掛消込予定
	 * @return
	 */
	protected MST_AR_APPL_SCHD_R getNewArApplSchdR(String prntBillMngNo, MST_BILL_ACST_R billAcstR, MST_AR_APPL_SCHD_R arApplSchdR) {
		MST_AR_APPL_SCHD_R r = MST_AR_APPL_SCHD_R.create();
		MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
		MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
		MST_BILL_R t3 = MST_BILL_R.create("T3");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.addInnerJoin(t2, bracket(t.bill_acst_no.eq(t2.bill_acst_no)));
		r_bldr.addInnerJoin(t3, bracket(t2.bill_mng_no.eq(t3.bill_mng_no)));
		r_bldr.addWhereWithAnd(t3.bill_mng_no.eq(bind("1")), prntBillMngNo);
		r_bldr.addWhereWithAnd(t2.acst_cd.eq(bind("1")), billAcstR.acst_cd());
		r_bldr.addWhereWithAnd(t2.ar_dpt_cd.eq(bind("1")), billAcstR.ar_dpt_cd());
		r_bldr.addWhereWithAnd(t2.ar_typ.eq(bind("1")), billAcstR.ar_typ());
		r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), arApplSchdR.iv_no());
		r_bldr.addWhereWithAnd(t.rcv_mtd_cd.eq(bind("1")), arApplSchdR.rcv_mtd_cd());
		r_bldr.addWhereWithAnd(t.rcv_schd_dt.eq(bind("1")), arApplSchdR.rcv_schd_dt());
		dbSelect("MSBGL5030_MST_AR_APPL_SCHD_S04", r, r_bldr);
		return r;
	}

	/**
	 * 売掛先別請求取得<br />
	 * 
	 * 金額情報を更新する売掛先別請求を返す
	 * 
	 * @param datCntr データカウンタ
	 * 
	 * @return 金額情報を更新する売掛先別請求
	 */
	protected MCList<MST_BILL_ACST_R> getBillAcst(MCNumber datCntr) {
		MCList<MST_BILL_ACST_R> l = MCList.create(MST_BILL_ACST_R.class);
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MSW_BILL_R w1 = MSW_BILL_R.create("W1");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.addSelect(w1.bill_cl_dt);
		l_bldr.addInnerJoin(w1, bracket(w1.bill_mng_no.eq(t.bill_mng_no)));
		l_bldr.addWhereWithAnd(w1.dat_cntr.eq(bind("1")), datCntr);
		l_bldr.addOrderByAsc(w1.bill_cl_dt, t.bill_acst_no);
		dbSelect("MSBGL5030_MST_BILL_ACST_S04", l, l_bldr);
		return l;
	}

	/**
	 * 売掛先別請求登録<br />
	 * 
	 * 売掛先別請求を登録・更新する
	 * 
	 * @param wkBillR　締対象の請求情報
	 * @param cndR 登録・更新する売掛先別請求のキーを持つコンテナ
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * @param addBill 請求額
	 */
	protected void regBillAcst(MSW_BILL_R wkBillR, MST_BILL_ACST_R cndR,
			String prntBillMngNo, MST_BILL_ACST_R addBill) {
		MST_BILL_ACST_R billAcstR = getBillAcstR(prntBillMngNo, cndR);
		if (billAcstR.isEmpty()) {
			insBillAcst(wkBillR, cndR, prntBillMngNo, addBill);
		}
		else {
			updBillAcst(billAcstR, addBill);
		}
	}

	/**
	 * 更新対象売掛先別請求取得<br />
	 * 
	 * 更新する売掛先別請求を返す
	 * 
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * @param cndR　登録・更新する売掛先別請求のキーを持つコンテナ
	 * 
	 * @return 更新する売掛先別請求
	 */
	protected MST_BILL_ACST_R getBillAcstR(String prntBillMngNo, MST_BILL_ACST_R cndR) {
		MST_BILL_ACST_R r = MST_BILL_ACST_R.create();
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), prntBillMngNo);
		r_bldr.addWhereWithAnd(t.acst_cd.eq(bind("1")), cndR.acst_cd());
		r_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("1")), cndR.ar_dpt_cd());
		r_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), cndR.ar_typ());
		dbSelect("MSBGL5030_MST_BILL_ACST_S05", r, r_bldr);
		return r;
	}

	/**
	 * 売掛先別請求登録<br />
	 * 
	 * 売掛先別請求を登録する
	 * 
	 * @param wkBillR　締対象の請求情報
	 * @param cndR　登録する売掛先別請求のキーを持つコンテナ
	 * @param prntBillId 締対象の請求管理ＮＯ
	 * @param addBill 請求額
	 */
	protected void insBillAcst(MSW_BILL_R wkBillR, MST_BILL_ACST_R cndR, String prntBillMngNo, MST_BILL_ACST_R addBill) {
		MST_BILL_ACST_R insR = MST_BILL_ACST_R.create();

		// 金額の設定
		MCNumber lastBillAmt = getLastBillAmt(wkBillR, cndR, prntBillMngNo);
		insR.last_bill_amt(lastBillAmt);
		// 今回繰越額、今回請求額に初期値として前回請求額を設定しておく
		insR.bfw_amt(lastBillAmt);
		insR.bill_amt(lastBillAmt);
		setAmt(insR, addBill);

		// 金額以外の項目の設定
		insR.bill_acst_no(getStrSeq(MSC_NUM_SYS_TYP.BILLACST));
		insR.bill_mng_no(prntBillMngNo);
		insR.acst_cd(cndR.acst_cd());
		insR.ar_dpt_cd(cndR.ar_dpt_cd());
		insR.wg_cd(cndR.wg_cd());
		insR.ar_typ(cndR.ar_typ());

		dbInsertEx("MSBGL5030_MST_BILL_ACST_I01", insR, MCQueryApiBuilder.create(MST_BILL_ACST_R.create("T")));

		// 請求明細のBILL_ACST_NOを更新
		updBillD(insR.bill_acst_no(), prntBillMngNo, cndR);
	}

	/**
	 * 最新請求額取得<br />
	 * 
	 * 最新の請求額を返す
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param cndR 登録する売掛先別請求のキーを持つコンテナ
	 * @param prntBillId 締対象の請求管理ＮＯ
	 * 
	 * @return 最新の請求額
	 */
	protected MCNumber getLastBillAmt(MSW_BILL_R wkBillR, MST_BILL_ACST_R cndR, String prntBillMngNo) {
		MST_BILL_ACST_R r = MST_BILL_ACST_R.create();
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MST_BILL_R bill1 = MST_BILL_R.create("BILL1");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.setSelect(nvl(sum(t.bill_amt), value(0)).as("bill_amt"));
		r_bldr.activeForeign(MST_BILL_ACST_R.$BILL1);
		r_bldr.addWhereWithAnd(bill1.bill_mng_no.eq(bind("1")), getLastBillMngNo(wkBillR, prntBillMngNo));
		r_bldr.addWhereWithAnd(t.acst_cd.eq(bind("1")), cndR.acst_cd());
		r_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("1")), cndR.ar_dpt_cd());
		r_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), cndR.ar_typ());
		dbSelect("MSBGL5030_MST_BILL_ACST_S06", r, r_bldr);
		return r.bill_amt();
	}

	/**
	 * 最新請求管理ＮＯ取得<br />
	 * 
	 * 最新の請求管理ＮＯを返す
	 * 
	 * @param cndR 条件となるコンテナ（請求先ＣＤ、請求部門ＣＤ、インボイスＮＯ、通貨ＣＤ、案件ＮＯを使用する）
	 * @param prntBillMngNo 締対象の請求管理ＮＯ。指定しない場合はnull
	 * 
	 * @return 最新の請求管理ＮＯ
	 */
	protected String getLastBillMngNo(MCRow cndR, String prntBillMngNo) {
		MST_BILL_R r = MST_BILL_R.create();
		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.addMax(t.bill_mng_no, "bill_mng_no");
		r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), cndR.getString("bcst_cd"));
		r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), cndR.getString("bill_dpt_cd"));
		r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), cndR.getString("iv_no"));
		r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), cndR.getString("trd_cur_cd"));
		r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
				.or(t.wrk_no.isNull())
				.and(bind("1").isNull())), cndR.getString("wrk_no"));
		r_bldr.addWhereWithAnd(
				t.bill_cl_sts_typ.in(value(MSC_BILL_CL_STS_TYP.CL_SCRN.value()), value(MSC_BILL_CL_STS_TYP.CL_BATCH.value())));
		r_bldr.addWhereWithCutOffAnd(t.bill_mng_no.neq(bind("1")), prntBillMngNo);
		dbSelect("MSBGL5030_MST_BILL_S12", r, r_bldr);
		return r.bill_mng_no();
	}

	/**
	 * 売掛先別請求更新<br />
	 * 
	 * 売掛先別請求の金額情報を更新する
	 * 
	 * @param billAcstR 更新する売掛先別請求
	 * @param addBill 請求額
	 */
	protected void updBillAcst(MST_BILL_ACST_R billAcstR, MST_BILL_ACST_R addBill) {
		MST_BILL_ACST_R bind = billAcstR.clone();

		// 金額の設定
		setAmt(bind, addBill);
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MCQueryApiBuilder billAcst_bldr = MCQueryApiBuilder.create(t);
		billAcst_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no"))
				.and(t.acst_cd.eq(bindEx("acst_cd")))
				.and(t.ar_dpt_cd.eq(bindEx("ar_dpt_cd")))
				.and(t.ar_typ.eq(bindEx("ar_typ"))));
		billAcst_bldr.setSetVL(t.xfr_amt, bindEx("xfr_amt"));
		billAcst_bldr.addSetVL(t.note_amt, bindEx("note_amt"));
		billAcst_bldr.addSetVL(t.cash_amt, bindEx("cash_amt"));
		billAcst_bldr.addSetVL(t.setoff_amt, bindEx("setoff_amt"));
		billAcst_bldr.addSetVL(t.setoff_tax_amt, bindEx("setoff_tax_amt"));
		billAcst_bldr.addSetVL(t.sw_amt, bindEx("sw_amt"));
		billAcst_bldr.addSetVL(t.bfw_amt, bindEx("bfw_amt"));
		billAcst_bldr.addSetVL(t.sls_amt, bindEx("sls_amt"));
		billAcst_bldr.addSetVL(t.ret_amt, bindEx("ret_amt"));
		billAcst_bldr.addSetVL(t.dscnt_amt, bindEx("dscnt_amt"));
		billAcst_bldr.addSetVL(t.sw_to_amt, bindEx("sw_to_amt"));

		billAcst_bldr.addSetVL(t.tax_amt, bindEx("tax_amt"));
		billAcst_bldr.addSetVL(t.bill_amt, bindEx("bill_amt"));
		dbUpdate("MSBGL5030_MST_BILL_ACST_U03", bind, billAcst_bldr);
	}

	/**
	 * 請求明細更新<br />
	 * 
	 * 請求明細の売掛別請求ＮＯを更新する
	 * 
	 * @param billAcstNo　売掛別請求ＮＯ
	 * @param prntBillMngNo 締対象の請求ＮＯ
	 * @param cndR 条件となる売掛先別請求（売掛先ＣＤ、売掛部門ＣＤが使用される）
	 */
	protected void updBillD(String billAcstNo, String prntBillNo,
			MST_BILL_ACST_R cndR) {
		MCRow bind = cndR.clone();
		bind.setStringNE("bill_acst_no", billAcstNo);
		bind.setStringNE("prnt_bill_mng_no", prntBillNo);

		MST_BILL_ACST_R S1T2 = MST_BILL_ACST_R.create("T2");
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MCQueryApiBuilder billD_bldr = MCQueryApiBuilder.create(t);
		billD_bldr.setWhere(t.bill_mng_no.eq(bindEx("prnt_bill_mng_no"))
				.and(exists(subQuery().select(value("X")).from(S1T2)
						.where(t.bill_acst_no.eq(S1T2.bill_acst_no)
								.and(S1T2.acst_cd.eq(bindEx("acst_cd")))
								.and(S1T2.ar_dpt_cd.eq(bindEx("ar_dpt_cd")))
								.and(S1T2.ar_typ.eq(bindEx("ar_typ")))))));
		billD_bldr.setSetVL(t.bill_acst_no, bindEx("bill_acst_no"));
		dbUpdate("MSBGL5030_MST_BILL_D_U08", bind, billD_bldr);

	}

	/**
	 * 売掛先別請求更新<br />
	 * 
	 * 売掛先別請求の金額情報を更新する
	 * 
	 * @param cndR 更新する売掛先別請求
	 * @param addNotBill 未請求額
	 */
	protected void updBillAcstNotBill(MST_BILL_ACST_R cndR, MST_BILL_ACST_R addNotBill) {
		MST_BILL_ACST_R bind = MST_BILL_ACST_R.create();
		bind.bill_mng_no(cndR.bill_mng_no());
		bind.acst_cd(cndR.acst_cd());
		bind.ar_dpt_cd(cndR.ar_dpt_cd());
		bind.ar_typ(cndR.ar_typ());

		// 金額の設定
		setAmt(bind, addNotBill);

		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no"))
				.and(t.acst_cd.eq(bindEx("acst_cd")))
				.and(t.ar_dpt_cd.eq(bindEx("ar_dpt_cd")))
				.and(t.ar_typ.eq(bindEx("ar_typ"))));
		r_bldr.setSetVL(t.xfr_amt, bindEx("xfr_amt"));
		r_bldr.addSetVL(t.note_amt, bindEx("note_amt"));
		r_bldr.addSetVL(t.cash_amt, bindEx("cash_amt"));
		r_bldr.addSetVL(t.setoff_amt, bindEx("setoff_amt"));
		r_bldr.addSetVL(t.setoff_tax_amt, bindEx("setoff_tax_amt"));
		r_bldr.addSetVL(t.sw_amt, bindEx("sw_amt"));
		r_bldr.addSetVL(t.bfw_amt, t.last_bill_amt.add(bindEx("bfw_amt")));
		r_bldr.addSetVL(t.sls_amt, bindEx("sls_amt"));
		r_bldr.addSetVL(t.ret_amt, bindEx("ret_amt"));
		r_bldr.addSetVL(t.dscnt_amt, bindEx("dscnt_amt"));
		r_bldr.addSetVL(t.sw_to_amt, bindEx("sw_to_amt"));
		r_bldr.addSetVL(t.tax_amt, bindEx("tax_amt"));
		r_bldr.addSetVL(t.bill_amt, t.last_bill_amt.add(bindEx("bill_amt")));
		dbUpdate("MSBGL5030_MST_BILL_ACST_U04", bind, r_bldr);
	}

	/**
	 * 売掛消込予定、売掛消込実績の更新
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param prntBillMngNo 締対象の請求ＮＯ
	 */
	protected void updArAppl(MSW_BILL_R wkBillR, String prntBillMngNo,
			MCList<MST_BILL_ACST_R> tgtBillAcstL) {

		// 売掛消込予定を登録・更新する
		regArApplSchd(wkBillR, prntBillMngNo);
		// 売掛消込実績を更新する
		updArApplAct(prntBillMngNo, _billAcstDelL, _arApplSchdDelL, tgtBillAcstL);

		// 全行対象の場合には未請求分が残らないので削除する
		// 前処理にて全行対象の場合のみリストに設定されている。
		if (!_arApplSchdDelL.isEmpty()) {
			dbDeleteKey("MSBGL5030_MST_AR_APPL_SCHD_D03", _arApplSchdDelL, _arApplSchdDelL_bldr);
		}
		if (!_billAcstDelL.isEmpty()) {
			dbDeleteKey("MSBGL5030_MST_BILL_ACST_D03", _billAcstDelL, _billAcstDelL_bldr);
		}

		for (MST_BILL_ACST_R tgtBillAcstR : tgtBillAcstL) {
			
			// 未請求の請求に紐付く売掛消込予定を更新する
			regArApplSchd(wkBillR, tgtBillAcstR.bill_mng_no(), true);

			// 未請求の売掛消込予定の消込額を更新する
			MCList<MST_AR_APPL_SCHD_R> applSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
			MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
			MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder applSchdL_bldr = MCQueryApiBuilder.create(t);
			applSchdL_bldr.addInnerJoin(t2, bracket(t.bill_acst_no.eq(t2.bill_acst_no)));
			applSchdL_bldr.setWhere(t2.bill_mng_no.eq(bind("1")), tgtBillAcstR.bill_mng_no());
			dbSelect("MSBGL5030_MST_AR_APPL_SCHD_S05", applSchdL, applSchdL_bldr);

			if (applSchdL.isEmpty()) {
				continue;
			}

			// 売掛消込実績を取得し、その消込額を売掛消込予定に反映する
			MCList<MST_AR_APPL_ACT_R> applActL = MCList.create(MST_AR_APPL_ACT_R.class);
			MST_AR_APPL_ACT_R t3 = MST_AR_APPL_ACT_R.create("T");
			MCQueryApiBuilder applActL_bldr = MCQueryApiBuilder.create(t3);
			applActL_bldr.setWhere(t3.ar_appl_schd_no.eq(bind("ar_appl_schd_no")));
			dbSelect("MSBGL5030_MST_AR_APPL_ACT_S02", applActL, applActL_bldr, applSchdL);

			for (MST_AR_APPL_SCHD_R schdR : applSchdL) {
				MCList<MST_AR_APPL_ACT_R> subApplActL = applActL.subList(MST_AR_APPL_ACT_R.$ar_appl_schd_no, schdR.ar_appl_schd_no());
				MCNumber applAmt = subApplActL.sum(MST_AR_APPL_ACT_R.$appl_amt);
				schdR.appl_amt(nvl(applAmt, MCNumber.ZERO));
				schdR.not_appl_bal(schdR.appl_tgt_amt().subtract(schdR.appl_amt()));
				dbUpdateKey("MSBGL5030_MST_AR_APPL_SCHD_U03", schdR, MCQueryApiBuilder.create(MST_AR_APPL_SCHD_R.create("T")));
			}
		}
	}

	/**
	 * 売掛消込予定の登録・更新<br />
	 * 
	 * 請求管理ＮＯに紐付く入金予定、売掛先別請求の情報をもとにして<br>
	 * 売掛消込予定の登録・更新する
	 * 
	 * @param wkBillR 締対象の請求情報
	 * @param billMngNo 締対象の請求管理ＮＯ
	 */
	protected void regArApplSchd(MSW_BILL_R wkBillR, String billMngNo) {
		regArApplSchd(wkBillR, billMngNo, false);
	}
	protected void regArApplSchd(MSW_BILL_R wkBillR, String billMngNo, boolean flg) {

		MST_BILL_R billR = MST_BILL_R.create();
		dbSelectKey("MSBGL5030_MST_BILL_S13", billR, MCQueryApiBuilder.create(MST_BILL_R.create("T")), billMngNo);

		MCList<MST_BILL_ACST_R> baL = MCList.create(MST_BILL_ACST_R.class);
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MCQueryApiBuilder baL_bldr = MCQueryApiBuilder.create(t);
		baL_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), billMngNo);
		dbSelect("MSBGL5030_MST_BILL_ACST_S07", baL, baL_bldr);
		MCList<MST_RCV_SCHD_R> rcvSchdL = MSBGL_ArUtil.getRcvSchdL(billMngNo);

		// 債権ユーティリティの共通処理を呼び出して売掛消込予定を登録する
		MSBGL_ArUtil.regArApplSchd(rcvSchdL, baL, billR, null, flg, null);
	}

	/**
	 * 売掛消込実績の更新<br />
	 * 
	 * 請求締対象に紐付く売掛消込実績が存在する場合、
	 * 今回作成する請求情報に付け替える。
	 * 
	 * @param billMngNo 新規発番した請求管理ＮＯ
	 * @param billAcstDelL 削除対象の売掛先別請求情報
	 * @param arApplSchdDelL 削除対象の売掛消込予定情報
	 * @param tgtBillAcstL 今回締対象となる売掛先別請求情報
	 */
	protected void updArApplAct(String billMngNo,
			MCList<MST_BILL_ACST_R> billAcstDelL,
			MCList<MST_AR_APPL_SCHD_R> arApplSchdDelL,
			MCList<MST_BILL_ACST_R> tgtBillAcstL) {

		// 今回請求締した請求に紐付く売掛先別請求
		MCList<MST_BILL_ACST_R> billAcstL = getBillAcstL(billMngNo);

		// 未請求の売掛先別請求毎に処理
		for (MST_BILL_ACST_R r : tgtBillAcstL) {
			if (billAcstL.isEmpty()) {
				continue;
			}
			// 売掛先別請求の削除対象リストから削除レコードを抽出
			MST_BILL_ACST_R billAcstDelR =
					billAcstDelL.getFirst(MST_BILL_ACST_R.$bill_acst_no, r.bill_acst_no());

			// 売掛先別請求のキー作成
			MCIndexKey indKey = billAcstL.createIndex(
					MST_BILL_ACST_R.$bill_mng_no,
					MST_BILL_ACST_R.$acst_cd,
					MST_BILL_ACST_R.$ar_dpt_cd,
					MST_BILL_ACST_R.$ar_typ);

			// 今回締対象の売掛先別請求リストから未請求の売掛先別請求に紐付くレコードを抽出する
			MST_BILL_ACST_R billAcstR = billAcstL.getFirst(
					indKey, billMngNo, r.acst_cd(), r.ar_dpt_cd(), r.ar_typ());

			// 今回締対象となる売掛消込予定リストを取得
			MCList<MST_AR_APPL_SCHD_R> billArApplSchdL =
					getArApplSchdL(billAcstR.bill_acst_no());

			// 一部行対象の場合（未請求分が残る場合）
			if (isNull(billAcstDelR)) {
				// 未請求分に紐付く売掛消込予定を取得する
				MCList<MST_AR_APPL_SCHD_R> notBillArApplSchdL =
						getArApplSchdL(r.bill_acst_no());

				if (isSame(r.getNumberNE(AddBillInfoR.$prnt_typ), PRNT_TYP_PART_PRNT)) {
					// 未請求分として残る売掛消込予定、今回締対象の売掛消込予定と売掛消込実績を紐付けし直す
					reCreateArAppl(notBillArApplSchdL, billArApplSchdL);
				}

			}
			// 全行対象の場合（未請求分を削除する場合）
			else {
				// 売掛消込予定の削除対象リストから対象を抽出する
				MCList<MST_AR_APPL_SCHD_R> subDelL =
						arApplSchdDelL.subList(MST_AR_APPL_SCHD_R.$bill_acst_no, r.bill_acst_no());

				// 今回締対象の売掛消込予定と売掛消込実績を紐付けし直す
				MSBGL_ArUtil.updArApplAct(subDelL, billArApplSchdL);
			}
		}
	}

	/**
	 * 請求管理ＮＯをもとに売掛先別請求を取得する
	 * 
	 * @param billMngNo 請求管理ＮＯ
	 * @return 売掛先別請求
	 */
	protected MCList<MST_BILL_ACST_R> getBillAcstL(String billMngNo) {
		MCList<MST_BILL_ACST_R> l = MCList.create(MST_BILL_ACST_R.class);
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), billMngNo);
		dbSelect("MSBGL5030_MST_BILL_ACST_S08", l, l_bldr);
		return l;
	}

	/**
	 * 売掛先請求ＮＯをもとに売掛消込予定を取得する
	 * 
	 * @param billAcstNo 売掛先請求ＮＯ
	 * @return 売掛消込予定
	 */
	protected MCList<MST_AR_APPL_SCHD_R> getArApplSchdL(String billAcstNo) {
		MCList<MST_AR_APPL_SCHD_R> l = MCList.create(MST_AR_APPL_SCHD_R.class);
		MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.addWhereWithAnd(t.bill_acst_no.eq(bind("1")), billAcstNo);
		dbSelect("MSBGL5030_MST_AR_APPL_SCHD_S06", l, l_bldr);
		return l;
	}

	protected void reCreateArAppl(MCList<MST_AR_APPL_SCHD_R> notBillArApplSchdL,
			MCList<MST_AR_APPL_SCHD_R> billArApplSchdL) {
		// 未請求分と請求分の金額を考慮して売掛消込実績を付け替える
		if (!billArApplSchdL.isEmpty()) {
			MSBGL_ArUtil.updArApplAct(notBillArApplSchdL, billArApplSchdL);
		}
	}
	
	/**
	 * 請求ヘッダと入金予定消込実績を更新<br />
	 * 
	 * 請求ヘッダと入金予定消込実績を更新する
	 * 
	 * @param prntBillMngNo 売掛先別請求
	 * @param tgtBillAcstL 売掛先別請求情報リスト
	 * @param downR 下り電文
	 */
	protected void updBill(String prntBillMngNo, MCList<MST_BILL_ACST_R> tgtBillAcstL, BillCl_Upd02_HdrR downR) {
		// 本メソッドを利用するときは事前に売掛消込実績が更新されていること
		// （請求ヘッダ、入金予定消込実績の更新には売掛消込実績を利用するため）
		MCList<MST_BILL_ACST_R> billAcstL = MCList.create(MST_BILL_ACST_R.class);
		billAcstL.addAll(getBillAcstL(prntBillMngNo));		// 今回請求締した請求に紐付く売掛先別請求
		billAcstL.addAll(tgtBillAcstL);		// 今回締対象となる売掛先別請求情報
		
		// 入金予定消込実績の更新
		updRcvSchdApplAct(billAcstL, downR);
		
		// 請求ヘッダの更新
		updBill4RcvActAmt(billAcstL);
	}
	
	/**
	 * 入金予定消込実績を更新<br />
	 * 
	 * 入金予定消込実績を更新する
	 * 
	 * @param billAcstL 売掛先別請求リスト
	 * @param downR 下り電文
	 */
	protected void updRcvSchdApplAct(MCList<MST_BILL_ACST_R> billAcstL, BillCl_Upd02_HdrR downR) {
		delRcvSchdApplAct(billAcstL);
		insRcvSchdApplAct(billAcstL, downR);
	}
	
	/**
	 * 売掛消込実績をもとに、入金予定消込実績を削除<br />
	 * 
	 * 売掛消込実績をもとに、入金予定消込実績を削除する
	 * 
	 * @param billAcstL 売掛先別請求リスト
	 */
	protected void delRcvSchdApplAct(MCList<MST_BILL_ACST_R> billAcstL) {
		// 削除対象を取得
		MCList<MST_RCV_SCHD_APPL_ACT_R> applActL = MCList.create(MST_RCV_SCHD_APPL_ACT_R.class);
		MST_RCV_SCHD_APPL_ACT_R t = MST_RCV_SCHD_APPL_ACT_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.setWhere(t.bill_mng_no.eq(bind("bill_mng_no")));
		dbSelect("MSBGL5030_MST_RCV_SCHD_APPL_ACT_S07", applActL, l_bldr, billAcstL.distinctNE(MST_BILL_ACST_R.$bill_mng_no));
		
		// 削除
		if (!applActL.isEmpty()) {
			dbDeleteKey("MSBGL5030_MST_RCV_SCHD_APPL_ACT_D02", applActL, MCQueryApiBuilder.create(MST_RCV_SCHD_APPL_ACT_R.create("T")));
		}
	}
	
	/**
	 * 売掛消込実績をもとに、入金予定消込実績を作成<br />
	 * 
	 * 売掛消込実績をもとに、入金予定消込実績を作成する
	 * 
	 * @param billAcstL 売掛先別請求リスト
	 * @param downR 下り電文
	 */
	protected void insRcvSchdApplAct(MCList<MST_BILL_ACST_R> billAcstL, BillCl_Upd02_HdrR downR) {
		// 登録対象となる売掛消込実績を取得
		MCList<MST_AR_APPL_SCHD_R> applSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
		MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
		MST_AR_APPL_ACT_R  t2 = MST_AR_APPL_ACT_R.create("T2");
		MST_BILL_ACST_R t3 = MST_BILL_ACST_R.create("T3");
		MAM_STTL_R m1 = MAM_STTL_R.create("M1");
		
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		applSchdL.addStringColumn("bill_mng_no");
		applSchdL.addDateColumn("rcv_act_dt");
		applSchdL.addStringColumn("ar_sttl_typ");
		applSchdL.addNumberColumn("rcv_act_amt");
		l_bldr.setWhere(t.bill_acst_no.eq(bind("bill_acst_no")));
		l_bldr.setGroupBy(t3.bill_mng_no, t2.rcv_act_dt, t2.rcv_mtd_cd, m1.ar_sttl_typ);
		l_bldr.addSum(t2.appl_amt, "rcv_act_amt");
		l_bldr.addInnerJoin(t2, t2.ar_appl_schd_no.eq(t.ar_appl_schd_no));
		l_bldr.addInnerJoin(t3, t3.bill_acst_no.eq(t.bill_acst_no));
		l_bldr.addLeftOuterJoin(m1, m1.sttl_cd.eq(t2.rcv_mtd_cd));
		dbSelect("MSBGL5030_MST_AR_APPL_SCHD_S07", applSchdL, l_bldr, billAcstL.distinctNE(MST_BILL_ACST_R.$bill_acst_no));
		
		if (!applSchdL.isEmpty()) {
			doSeqCache(MSC_NUM_SYS_TYP.RCVSCHDAPPLACT, 
					applSchdL.size());
			
			// 売掛消込実績をもとに、入金予定消込実績を作成
			MCList<MST_RCV_SCHD_APPL_ACT_R> insL = MCList.create(MST_RCV_SCHD_APPL_ACT_R.class);
			applSchdL.forEach(r -> {
				MST_RCV_SCHD_APPL_ACT_R applActR = insL.add();
				chkRcvMtdCd(r.rcv_mtd_cd(), downR);
				applActR.rcv_schd_appl_act_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHDAPPLACT));
				applActR.bill_mng_no(r.getStringNE("bill_mng_no"));
				applActR.rcv_act_dt(r.getDateNE("rcv_act_dt"));
				applActR.rcv_mtd_cd(r.getStringNE("rcv_mtd_cd"));
				applActR.rcv_typ(r.getStringNE("ar_sttl_typ"));
				applActR.rcv_act_amt(r.getNumberNE("rcv_act_amt"));
			});
			dbInsert("MSBGL5030_MST_RCV_SCHD_APPL_ACT_I01", insL, MCQueryApiBuilder.create(MST_RCV_SCHD_APPL_ACT_R.create("T")));
		}
	}
	
	/**
	 * 売掛消込実績をもとに、請求ヘッダを更新<br />
	 * 
	 * 売掛消込実績をもとに、請求ヘッダを更新する
	 * 
	 * @param billAcstL 売掛先別請求リスト
	 */
	protected void updBill4RcvActAmt(MCList<MST_BILL_ACST_R> billAcstL) {
		for (MST_BILL_ACST_R billAcstR : billAcstL.distinctNE(MST_BILL_ACST_R.$bill_mng_no)) {
			MST_BILL_R billR = getBillR(billAcstR.bill_mng_no());
			if (!isNull(billR.bill_mng_no())) {
				MCNumber rcvActAmt = getRcvActAmt(billAcstR.bill_mng_no());
				// 入金実績関連の項目の設定
				MCRow bind = MCRow.create();
				bind.setStringNE("bill_mng_no", billAcstR.bill_mng_no());
				bind.setNumberNE("rcv_act_amt", rcvActAmt);
				bind.setNumberNE("not_appl_bal", billR.rcv_schd_amt().subtract(rcvActAmt));
				
				// 入金実績額、未消込残高を更新
				MST_BILL_R t = MST_BILL_R.create("T");
				MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
				bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
				bill_bldr.setSetVL(t.rcv_act_amt, bindEx("rcv_act_amt"));
				bill_bldr.addSetVL(t.not_appl_bal, bindEx("not_appl_bal"));
				dbUpdate("MSBGL5030_MST_BILL_U08", bind, bill_bldr);
			}
		}
	}
	
	/**
	 * 前受金に対応する入金実績明細を更新する
	 */
	protected void updRcvActDAdv(String prntBillMngNo) {
		// 入金実績明細の請求管理ＮＯに、締対象の請求管理ＮＯを設定する
		MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
		MSW_RCV_ACT_D_R w = MSW_RCV_ACT_D_R.create("W");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSet(t.bill_mng_no);
		bldr.setWhere(
			exists(subQuery()
				.select(value("x"))
				.from(w)
				.where(
					w.rcv_act_d_no.eq(t.rcv_act_d_no)
					.and(w.rcv_act_d_seq.eq(t.rcv_act_d_seq))
			)
		));
		bldr.addConstWhereWithAnd(t.bill_mng_no.isNull());
		
		MST_RCV_ACT_D_R row = MST_RCV_ACT_D_R.create();
		row.bill_mng_no(prntBillMngNo);
		
		dbUpdate("MSBGL5030_MST_RCV_ACT_D_U02", row, bldr);
	}

	/**
	 * 消費税差額調整処理呼び出し<br />
	 * 
	 * 消費税差額調整処理を呼び出す
	 * 
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * @param bcstCd 締対象の請求先ＣＤ
	 */
	protected void calcTax(String prntBillMngNo, String bcstCd) {
		MCRow bind = MCRow.create();
		bind.setStringNE("bill_mng_no", prntBillMngNo);


			MSBGL_RcvActCmnService.RcvActCmn_Upd04 ope =
					MSBGL_RcvActCmnService.crtRcvActCmn_Upd04();

			RcvActCmn_Chk04_CndR up0 = RcvActCmn_Chk04_CndR.create();
			up0.bill_mng_no(prntBillMngNo);
			ope.up0().add(up0);
			ope.exec();

		if (MSBGL_ArUtil.getTaxOnBillFlg(bcstCd)) {
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
			bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
			bill_bldr.setSetVL(t.bill_tax_calc_typ, value(MSC_BILL_TAX_CALC_TYP.BILL.value()));
			dbUpdate("MSBGL5030_MST_BILL_U05", bind, bill_bldr);
		}
		else {
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
			bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
			bill_bldr.setSetVL(t.bill_tax_calc_typ, value(MSC_BILL_TAX_CALC_TYP.OTHR.value()));
			dbUpdate("MSBGL5030_MST_BILL_U06", bind, bill_bldr);
		}
	}

	/**
	 * 次月請求更新<br />
	 * 
	 * 次月の請求を更新する
	 * 
	 * @param wkBillR　締対象の請求情報
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * @param ivNo インボイスＮＯ
	 */
	protected void updFollowing(MSW_BILL_R wkBillR, String prntBillMngNo,
			String ivNo, BillCl_Upd02_HdrR downR) {
		// 都度請求でない場合、次月データを作成する
		if (!MSBGL_ArUtil.isEachSls(wkBillR.bcst_cd())) {
			makeNextData(wkBillR, prntBillMngNo, downR);
		}
		updFollowingBill(prntBillMngNo, wkBillR.inpt_bill_cl_dt());
		updFollowingBillAcst(prntBillMngNo);
	}

	/**
	 * 次月データ作成<br />
	 * 
	 * 次月の請求、売掛先別請求を作成する
	 * 
	 * @param wkBillR　締対象の請求情報
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 */
	protected void makeNextData(MSW_BILL_R wkBillR, String prntBillMngNo, BillCl_Upd02_HdrR downR) {
		// 次月データの請求締年月日、請求予定日（請求年月 + 締日）の取得
		// 請求締した請求の翌月、請求予定日を取得
		MCDate nextBillClDt = MSBGL_ArUtil.getNextBillDt(wkBillR.bcst_cd(), wkBillR.inpt_bill_cl_dt());
		if (isNull(nextBillClDt)) {
			nextBillClDt = MAC_Y4M.NULL_VAL.value();
		}

		MST_BILL_R billFrom = getBillR(prntBillMngNo);
		// 締対象の請求が検索できない場合は(明細全対象外による対象外のため)そのまま終了
		if (billFrom.isEmpty()) {
			return;
		}

		// 次月の請求の請求管理ＮＯの取得
		String nextBillMngNo = getNextBillMngNo(wkBillR, nextBillClDt);
		// 請求管理ＮＯが取得できなかった場合に次月データを作成
		if (isNull(nextBillMngNo)) {
			nextBillMngNo = regNextBill(wkBillR, nextBillClDt, billFrom, downR);
		}

		// 売掛先別の次月情報を作成
		for (MST_BILL_ACST_R billAcstR : getBillAcstLForMakeNextData(prntBillMngNo)) {
			// 次月の売掛先別請求が存在しない場合は作成する
			if (!nextBillAcstExists(billAcstR, nextBillMngNo, nextBillClDt)) {
				insNextBillAcst(billAcstR, nextBillMngNo, nextBillClDt);
			}
		}
		insNextArApplSchd(nextBillMngNo);
	}

	/**
	 * 次月請求請求管理ＮＯ取得<br />
	 * 
	 * 次月請求の請求管理ＮＯを返す
	 * 
	 * @param wkBillR　締対象の請求情報
	 * @param nextBillYmd 次月請求締年月
	 * 
	 * @return 次月請求の請求管理ＮＯ
	 */
	protected String getNextBillMngNo(MSW_BILL_R wkBillR, MCDate nextBillClDt) {
		MST_BILL_R r = MST_BILL_R.create();
		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.setSelect(t.bill_mng_no);
		r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), wkBillR.bcst_cd());
		MCDate baseDt = getBaseDt(nextBillClDt);
		String billDptCd = MSBGL_ArUtil.getBcstDpt(wkBillR.bcst_cd(), baseDt, wkBillR.bill_dpt_cd(), wkBillR.bill_dpt_cd());
		r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), MSBGL_ArUtil.getNewDptCd(billDptCd, baseDt));
		r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), wkBillR.iv_no());
		r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), wkBillR.trd_cur_cd());
		r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
				.or(t.wrk_no.isNull())
				.and(bind("1").isNull())), wkBillR.wrk_no());
		r_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
		r_bldr.addWhereWithAnd(t.bill_cl_dt.eq(bind("1")), nextBillClDt);
		dbSelect("MSBGL5030_MST_BILL_S14", r, r_bldr);
		if (r.isEmpty()) {
			return null;
		}
		else {
			return r.bill_mng_no();
		}
	}

	/**
	 * 次月請求登録<br />
	 * 
	 * 次月請求を登録する
	 * 
	 * @param wkBillR　締対象の請求情報
	 * @param nextBillClDt 次月請求締年月
	 * @param billFrom 当月請求
	 * 
	 * @return 次月請求の請求管理ＮＯ
	 */
	protected String regNextBill(MSW_BILL_R wkBillR, MCDate nextBillClDt,
			MST_BILL_R billFrom, BillCl_Upd02_HdrR downR) {
		// 次月の請求管理ＮＯの取得
		String nextBillMngNo = getStrSeq(MSC_NUM_SYS_TYP.BILLMNG);

		// 次月請求の登録
		insNextBill(nextBillClDt, billFrom, nextBillMngNo, downR);

		// 次月入金予定の登録
		insNextRcvSchd(wkBillR, nextBillClDt, nextBillMngNo);

		return nextBillMngNo;
	}

	/**
	 * 次月請求登録<br />
	 * 
	 * 次月の請求を登録する
	 * 
	 * @param nextBillClDt 次月請求締年月
	 * @param billFrom 当月請求
	 * @param nextBillMngNo 次月請求管理ＮＯ
	 */
	protected void insNextBill(MCDate nextBillClDt, MST_BILL_R billFrom,
			String nextBillMngNo, BillCl_Upd02_HdrR downR) {
		MST_BILL_R insR = MST_BILL_R.create();
		insR.bill_mng_no(nextBillMngNo);
		insR.bcst_cd(billFrom.bcst_cd());
		insR.bill_cl_dt(nextBillClDt);
		insR.bill_no(MAC_STR.NULL_VAL.value());
		insR.iv_no(billFrom.iv_no());
		insR.trd_cur_cd(billFrom.trd_cur_cd());
		insR.bill_rev(1);
		insR.wrk_no(billFrom.wrk_no());
		insR.last_bill_amt(MCNumber.ZERO);
		insR.xfr_amt(MCNumber.ZERO);
		insR.note_amt(MCNumber.ZERO);
		insR.cash_amt(MCNumber.ZERO);
		insR.setoff_amt(MCNumber.ZERO);
		insR.setoff_tax_amt(MCNumber.ZERO);
		insR.sw_amt(MCNumber.ZERO);
		insR.bfw_amt(MCNumber.ZERO);
		insR.sls_amt(MCNumber.ZERO);
		insR.ret_amt(MCNumber.ZERO);
		insR.dscnt_amt(MCNumber.ZERO);
		insR.sw_to_amt(MCNumber.ZERO);
		insR.tax_amt(MCNumber.ZERO);
		insR.bill_amt(MCNumber.ZERO);
		insR.adv_amt_bal(MCNumber.ZERO);
		insR.adv_amt(MCNumber.ZERO);
		insR.adv_setoff_amt(MCNumber.ZERO);
		insR.adv_setoff_tax_amt(MCNumber.ZERO);
		insR.bill_cl_sts_typ(MSC_BILL_CL_STS_TYP.NOT_BILL.value());
		insR.bill_tax_calc_typ(MSC_BILL_TAX_CALC_TYP.NOT_BILL.value());
		insR.foreign_flg(billFrom.foreign_flg());
		insR.rcv_schd_amt(MCNumber.ZERO);
		insR.rcv_act_amt(MCNumber.ZERO);
		insR.not_appl_bal(MCNumber.ZERO);
		insR.last_rcv_dt(null);
		insR.rcv_schd_adjst_flg(false);
		// 次月請求年月日に年月用定数：ＮＵＬＬ文字が設定されている場合、
		// 部門取得基準日には運用日付を設定しておく
		// 次月の請求が更新されるタイミングで請求起算日に更新される。
		insR.base_dt(getBaseDt(nextBillClDt));
		// 部門取得基準日より請求部門、ＷＧ ＣＤを取得する
		String billDptCd = MSBGL_ArUtil.getBcstDpt(billFrom.bcst_cd(),
				insR.base_dt(), billFrom.bill_dpt_cd(), billFrom.bill_dpt_cd());
		insR.bill_dpt_cd(MSBGL_ArUtil.getNewDptCd(billDptCd, insR.base_dt()));
		insR.wg_cd(MSBGL_ArUtil.getWgCd(insR.bill_dpt_cd(), insR.base_dt()));
		chkBillDpt(insR.base_dt(), insR, downR);
		dbInsertEx("MSBGL5030_MST_BILL_I02", insR, MCQueryApiBuilder.create(MST_BILL_R.create("T")));
	}

	/**
	 * 次月の入金予定情報を登録する
	 * 
	 * @param wkBillR
	 * @param nextBillClDt
	 * @param nextBillMngNo
	 */
	protected void insNextRcvSchd(MSW_BILL_R wkBillR, MCDate nextBillClDt, String nextBillMngNo) {

		// 基準日を取得する
		MCDate baseDt = getBaseDt(nextBillClDt);

		MCList<MST_RCV_SCHD_R> nextRcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
		String billDptCd = MSBGL_ArUtil.getNewDptCd(wkBillR.bill_dpt_cd(), baseDt);
		nextRcvSchdL = MSBGL_ArUtil.getRcvSchd(wkBillR.bcst_cd(), billDptCd, wkBillR.trd_cur_cd(), MCNumber.ZERO, baseDt);
		if (isNull(nextRcvSchdL)) {
			throw new MCAppException(MSBGL0073, wkBillR.bcst_cd(), wkBillR.bill_dpt_cd(), wkBillR.trd_cur_cd());
		}
		doSeqCache(MSC_NUM_SYS_TYP.RCVSCHD, nextRcvSchdL.size());
		for (MST_RCV_SCHD_R nextRcvSchdR : nextRcvSchdL) {
			nextRcvSchdR.rcv_schd_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHD));
			nextRcvSchdR.bill_mng_no(nextBillMngNo);
		}
		dbInsertEx("MSBGL5030_MST_RCV_SCHD_I04", nextRcvSchdL, MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T")));
	}

	/**
	 * 次月データ作成用売掛先別請求取得<br />
	 * 
	 * 次月データを作成するもととなる売掛先別請求を返す
	 * 
	 * @param prntBillMngNo 締対象の請求管理ＮＯ
	 * 
	 * @return 売掛先別請求
	 */
	protected MCList<MST_BILL_ACST_R> getBillAcstLForMakeNextData(String prntBillMngNo) {
		MCList<MST_BILL_ACST_R> l = MCList.create(MST_BILL_ACST_R.class);
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), prntBillMngNo);
		dbSelect("MSBGL5030_MST_BILL_ACST_S09", l, l_bldr);
		return l;
	}

	/**
	 * 未請求額取得<br />
	 * 
	 * 未請求額を取得する
	 * 
	 * @param billAcstR 売掛先別請求
	 * @param prntBillMngNo 発番請求管理ＮＯ
	 * @param nextBillClDt 次月請求締年月日
	 * 
	 * @return　未請求額
	 */
	protected MCNumber getNextLastBillAcstAmt(MST_BILL_ACST_R billAcstR, String prntBillMngNo, MCDate nextBillClDt) {
		MST_BILL_R r = MST_BILL_R.create();
		MST_BILL_R t = MST_BILL_R.create("T");
		MST_BILL_R t2 = MST_BILL_R.create("T2");
		MST_BILL_ACST_R t3 = MST_BILL_ACST_R.create("T3");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.setSelect(t3.bill_amt);
		r_bldr.addLeftOuterJoin(t2,
				t.bcst_cd.eq(t2.bcst_cd)
				.and(t.bill_dpt_cd.eq(t2.bill_dpt_cd))
				.and(t.trd_cur_cd.eq(t2.trd_cur_cd))
				.and(t.iv_no.eq(t2.iv_no))
						.and(t.wrk_no.eq(t2.wrk_no)
								.or(t.wrk_no.isNull())
								.and(t2.wrk_no.isNull()))
						.and(t.bill_cl_dt.eq(t2.bill_cl_dt)));
		r_bldr.addLeftOuterJoin(t3, t2.bill_mng_no.eq(t3.bill_mng_no));
		r_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), prntBillMngNo);
		r_bldr.addWhereWithAnd(t2.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
		r_bldr.addWhereWithAnd(t3.ar_dpt_cd.eq(bind("1")), MSBGL_ArUtil.getNewDptCd(billAcstR.ar_dpt_cd(), nextBillClDt));
		r_bldr.addWhereWithAnd(t3.acst_cd.eq(bind("1")), billAcstR.acst_cd());
		r_bldr.addWhereWithAnd(t3.ar_typ.eq(bind("1")), billAcstR.ar_typ());
		dbSelect("MSBGL5030_MST_BILL_S15", r, r_bldr);
		MCNumber ret = MCNumber.ZERO;
		if (!isNull(r.bill_amt())) {
			ret = r.bill_amt();
		}
		return ret;
	}

	/**
	 * 次月売掛先別請求存在判定<br />
	 * 
	 * 次月の売掛先別請求が存在するかを判定する
	 * 
	 * @param billAcstR 売掛先別請求
	 * @param nextBillMngNo 次月請求の請求管理ＮＯ
	 * @param nextBillClDt 次月請求締年月日
	 * 
	 * @return 次月の売掛先別請求が存在する場合、true
	 */
	protected boolean nextBillAcstExists(MST_BILL_ACST_R billAcstR, String nextBillMngNo, MCDate nextBillClDt) {
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		int cnt = execDbCount("MSBGL5030_MST_BILL_ACST_S10", t,
				t.bill_mng_no.eq(bind("1"))
				.and(t.acst_cd.eq(bind("2")))
				.and(t.ar_dpt_cd.eq(bind("3")))
				.and(t.ar_typ.eq(bind("4"))),
				nextBillMngNo, billAcstR.acst_cd(), MSBGL_ArUtil.getNewDptCd(billAcstR.ar_dpt_cd(), getBaseDt(nextBillClDt)),
				billAcstR.ar_typ());
		return cnt != 0;
	}

	/**
	 * 次月売掛先別請求登録<br />
	 * 
	 * 次月の売掛先別請求を登録する
	 * 
	 * @param billAcstR 売掛先別請求
	 * @param nextBillMngNo 次月請求の請求管理ＮＯ
	 * @param nextBillClDt 次月請求締年月日
	 */
	protected void insNextBillAcst(MST_BILL_ACST_R billAcstR, String nextBillNo, MCDate nextBillClDt) {
		MST_BILL_ACST_R insR = MST_BILL_ACST_R.create();
		insR.bill_acst_no(getStrSeq(MSC_NUM_SYS_TYP.BILLACST));
		insR.bill_mng_no(nextBillNo);
		insR.acst_cd(billAcstR.acst_cd());
		insR.ar_dpt_cd(MSBGL_ArUtil.getNewDptCd(billAcstR.ar_dpt_cd(), getBaseDt(nextBillClDt)));
		insR.wg_cd(billAcstR.wg_cd());
		insR.ar_typ(billAcstR.ar_typ());
		insR.last_bill_amt(MCNumber.ZERO);
		insR.cash_amt(MCNumber.ZERO);
		insR.note_amt(MCNumber.ZERO);
		insR.xfr_amt(MCNumber.ZERO);
		insR.setoff_amt(MCNumber.ZERO);
		insR.setoff_tax_amt(MCNumber.ZERO);
		insR.sw_amt(MCNumber.ZERO);
		insR.bfw_amt(MCNumber.ZERO);
		insR.sls_amt(MCNumber.ZERO);
		insR.ret_amt(MCNumber.ZERO);
		insR.dscnt_amt(MCNumber.ZERO);
		insR.sw_to_amt(MCNumber.ZERO);
		insR.tax_amt(MCNumber.ZERO);
		insR.bill_amt(MCNumber.ZERO);
		dbInsertEx("MSBGL5030_MST_BILL_ACST_I02", insR, MCQueryApiBuilder.create(MST_BILL_ACST_R.create("T")));
	}

	protected MCDate getBaseDt(MCDate nextBillClDt) {
		if (MAC_Y4M.isNULL_VAL(nextBillClDt)) {
			return getToday();
		}
		else {
			return nextBillClDt;
		}
	}

	protected MCDate getSelBaseDt(MST_BILL_R billR) {
		MCDate baseDt;
		if (isSame(billR.bill_cl_dt(), MAC_Y4M.NULL_VAL.value())) {
			baseDt = getToday();
		}
		else {
			baseDt = billR.base_dt();
		}
		return baseDt;
	}
	
	/**
	 * 次月売掛消込予定登録<br />
	 * 
	 * 次月の売掛消込予定を登録する
	 * 
	 * @param nextBillMngNo 次月請求管理ＮＯ
	 */
	protected void insNextArApplSchd(String nextBillMngNo) {

		// 次月の売掛先別請求を検索する
		MCList<MST_BILL_ACST_R> nextBillAcst = MCList.create(MST_BILL_ACST_R.class);
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MCQueryApiBuilder nextBillAcst_bldr = MCQueryApiBuilder.create(t);
		nextBillAcst_bldr.setWhere(t.bill_mng_no.eq(bind("1")), nextBillMngNo);
		dbSelect("MSBGL5030_MST_BILL_ACST_S11", nextBillAcst, nextBillAcst_bldr);

		// 次月の請求ヘッダを検索する
		MST_BILL_R nextBillR = MST_BILL_R.create();
		dbSelectKey("MSBGL5030_MST_BILL_S16", nextBillR, MCQueryApiBuilder.create(MST_BILL_R.create("T")), nextBillMngNo);

		MCList<MST_RCV_SCHD_R> rcvSchdL =
				MSBGL_ArUtil.getRcvSchdL(nextBillMngNo);

		// 次月の売掛消込予定登録
		MSBGL_ArUtil.regArApplSchd(rcvSchdL, nextBillAcst, nextBillR, null, false, null);
	}

	/**
	 * 請求テーブル更新<br />
	 * 
	 * 未請求の請求で請求締年月日が一番小さいレコードの前回請求額を、
	 * 締め処理を行った請求の今回請求額で更新する。それに伴い、
	 * 未請求レコード全てに対して今回繰越額、今回請求額、前回請求額を更新する。
	 * 
	 * @param billMngNo 最新の締処理済請求か、最古の未請求請求の請求管理ＮＯ
	 * @param inptBillClDt 入力請求締年月日
	 */
	protected void updFollowingBill(String billMngNo, MCDate billClDt) {
		MST_BILL_R prntBillR = getBillR(billMngNo);

		// 最新の請求済請求の次に来る未請求請求の前回請求額は、最新の請求済請求の今回請求額となる。
		// 請求取消時の洗い替え処理では、最新の請求済請求が存在しない場合、最古の未請求請求が検索され、
		// それ以前の請求が存在しないため、洗い替え対象ループの先頭に来る請求の前回請求額は「0」となる。
		MCNumber lastBillAmt = MCNumber.ZERO;
		if (!MAC_STR.isNULL_VAL(prntBillR.bill_no())) {
			lastBillAmt = prntBillR.bill_amt();
		}

		for (MST_BILL_R billR : getFollowingBillL(prntBillR)) {
			MCNumber diff = lastBillAmt.subtract(billR.last_bill_amt());

			// 請求締年月日の小さい順に、今回繰越額、今回請求額、前回請求額を洗い替え
			MCRow bind = MCRow.create();
			bind.setNumberNE("diff", diff);
			bind.setNumberNE("last_bill_amt", lastBillAmt);
			bind.setStringNE("bill_mng_no", billR.bill_mng_no());
			if (isSame(billClDt, MAC_Y4M.NULL_VAL.value())) {
				bind.setDateNE("base_dt", getToday());
			}
			else {
				bind.setDateNE("base_dt", billClDt);
			}
			
			MAM_DPT_R dpt = getDpt(billR.bill_mng_no(), bind.getDateNE("base_dt"));
			bind.setStringNE("bill_dpt_cd", dpt.dpt_cd());
			bind.setStringNE("wg_cd", dpt.wg_cd());

			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
			bill_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));
			bill_bldr.setSetVL(t.bill_dpt_cd, bindEx("bill_dpt_cd"));
			bill_bldr.addSetVL(t.wg_cd, bindEx("wg_cd"));
			bill_bldr.addSetVL(t.bfw_amt, t.bfw_amt.add(bindEx("diff")));
			bill_bldr.addSetVL(t.last_bill_amt, bindEx("last_bill_amt"));
			bill_bldr.addSetVL(t.bill_amt, t.bill_amt.add(bindEx("diff")));
			dbUpdate("MSBGL5030_MST_BILL_U07", bind, bill_bldr);

			// 次の請求にセットする前回請求額として保持
			lastBillAmt = billR.bill_amt().add(diff);
		}
	}

	/**
	 * 次月請求取得<br />
	 * 
	 * 次月の請求を返す
	 * 
	 * @param prntBillR 締対象の請求情報
	 * 
	 * @return 次月の請求
	 */
	protected MCList<MST_BILL_R> getFollowingBillL(MST_BILL_R prntBillR) {
		MCList<MST_BILL_R> l = MCList.create(MST_BILL_R.class);
		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), prntBillR.bcst_cd());
		l_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), prntBillR.bill_dpt_cd());
		l_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), prntBillR.trd_cur_cd());
		l_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), prntBillR.iv_no());
		l_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
				.or(t.wrk_no.isNull())
				.and(bind("1").isNull())), prntBillR.wrk_no());
		l_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));

		l_bldr.addSelect(decode(t.bill_cl_dt, value(MAC_Y4M.NULL_VAL.value()), value("99999999"),
				toChar(t.bill_cl_dt, MCDateTimeFmt.YYYY, MCDateTimeFmt.MM, MCDateTimeFmt.DD)).as("char_bill_cl_dt"));
		l_bldr.addOrderByAsc(pr("char_bill_cl_dt"));

		dbSelectForUpdateNoWait("MSBGL5030_MST_BILL_S17", l, l_bldr);
		return l;
	}
	
	/**
	 * 売掛先別請求洗い替え<br />
	 * 
	 * 売掛先別請求の前回請求額、今回繰越額、今回請求額の更新を行う。
	 * 
	 * @param billMngNo 最新の締処理済請求の請求管理ＮＯ
	 */
	protected void updFollowingBillAcst(String billMngNo) {
		// 更新対象をロックして取得する
		MCList<MST_BILL_ACST_R> allL = getUpdBillAcstAllL(billMngNo);

		for (MST_BILL_ACST_R r : getFollowingBillAcst(billMngNo)) {
			// 請求書ＮＯの取得
			String billNo = getBillR(billMngNo).bill_no();
			// 前回請求額の取得
			// 最新の請求済請求の次に来る未請求請求の前回請求額は、最新の請求済請求の今回請求額となる。
			// 請求取消時の洗い替え処理では、最新の請求済請求が存在しない場合、最古の未請求請求が検索され、
			// それ以前の請求が存在しないため、洗い替え対象の先頭に来る売掛先別請求の前回請求額は「0」となる。
			MCNumber lastBillAmt = MCNumber.ZERO;
			if (!MAC_STR.isNULL_VAL(billNo)) {
				lastBillAmt = getBillAcstR(billMngNo, r).bill_amt();
			}

			for (MST_BILL_ACST_R billAcstR
					: getUpdBillAcstL(allL, r.acst_cd(), r.ar_dpt_cd(), r.ar_typ())) {
				MCNumber diff = lastBillAmt.subtract(billAcstR.last_bill_amt());

				// 請求締年月日の小さい順に、今回繰越額、今回請求額、前回請求額を洗い替え
				MCRow bind = MCRow.create();
				bind.setNumberNE("diff", diff);
				bind.setNumberNE("last_bill_amt", lastBillAmt);
				bind.setStringNE("bill_acst_no", billAcstR.bill_acst_no());

				MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
				MCQueryApiBuilder billAcst_bldr = MCQueryApiBuilder.create(t);
				billAcst_bldr.setWhere(t.bill_acst_no.eq(bindEx("bill_acst_no")));
				billAcst_bldr.setSetVL(t.bfw_amt, t.bfw_amt.add(bindEx("diff")));
				billAcst_bldr.addSetVL(t.last_bill_amt, bindEx("last_bill_amt"));
				billAcst_bldr.addSetVL(t.bill_amt, t.bill_amt.add(bindEx("diff")));
				dbUpdate("MSBGL5030_MST_BILL_ACST_U05", bind, billAcst_bldr);

				// 次の請求にセットする前回請求額として保持
				lastBillAmt = billAcstR.bill_amt().add(diff);
			}
		}
	}

	/**
	 * 売掛先別請求洗い替え更新対象取得<br />
	 * 
	 * 売掛先別請求洗い替えで更新対象となる売掛先別請求をロックして返す
	 * 
	 * @param billMngNo 最新の締処理済請求の請求管理ＮＯ
	 * 
	 * @return 売掛先別請求
	 */
	protected MCList<MST_BILL_ACST_R> getUpdBillAcstAllL(String billMngNo) {
		MCList<MST_BILL_ACST_R> l = MCList.create(MST_BILL_ACST_R.class);
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MST_BILL_R t2 = MST_BILL_R.create("T2");
		MST_BILL_R t3 = MST_BILL_R.create("T3");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);

		l_bldr.addSelect(t2.bill_cl_dt);
		l_bldr.addInnerJoin(t2, t.bill_mng_no.eq(t2.bill_mng_no));
		l_bldr.addInnerJoin(t3, t2.bcst_cd.eq(t3.bcst_cd)
				.and(t2.bill_dpt_cd.eq(t3.bill_dpt_cd))
				.and(t2.iv_no.eq(t3.iv_no))
				.and(t2.trd_cur_cd.eq(t3.trd_cur_cd))
				.and(t2.wrk_no.eq(t3.wrk_no)
						.or(t2.wrk_no.isNull())
						.and(t3.wrk_no.isNull())));

		l_bldr.addWhereWithAnd(t2.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
		l_bldr.addWhereWithAnd(t3.bill_mng_no.eq(bind("1")), billMngNo);
		l_bldr.addOrderByAsc(t.acst_cd, t.ar_dpt_cd, t.ar_typ);
		l_bldr.addLockTable(t.acst_cd);

		dbSelectForUpdateNoWait("MSBGL5030_MST_BILL_ACST_S12", l, l_bldr);

		return l;
	}

	/**
	 * 売掛先別請求取得<br />
	 * 
	 * 売掛先別請求を返す
	 * 
	 * @param billMngNo 最新の締処理済請求の請求管理ＮＯ
	 * 
	 * @return 売掛先別請求
	 */
	protected MCList<MST_BILL_ACST_R> getFollowingBillAcst(String billMngNo) {
		MCList<MST_BILL_ACST_R> l = MCList.create(MST_BILL_ACST_R.class);
		MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), billMngNo);
		l_bldr.addOrderByAsc(t.acst_cd, t.ar_dpt_cd, t.ar_typ);
		dbSelect("MSBGL5030_MST_BILL_ACST_S13", l, l_bldr);
		return l;
	}

	/**
	 * 更新対象売掛先別請求抽出<br />
	 * 
	 * 前回請求額、今回繰越額、今回請求額の更新を行う売掛先別請求を抽出して返す
	 * 
	 * @param allL 売掛先別請求洗い替えで更新対象となる全ての売掛先別請求
	 * @param acstCd 売掛先ＣＤ
	 * @param ArDptCd 売掛部門ＣＤ
	 * @param arTyp
	 * 
	 * @return 前回請求額、今回繰越額、今回請求額の更新を行う売掛先別請求
	 */
	protected MCList<MST_BILL_ACST_R> getUpdBillAcstL(
			MCList<MST_BILL_ACST_R> allL, String acstCd, String arDptCd, String arTyp) {
		String[] keys = {MST_BILL_ACST_R.$acst_cd, MST_BILL_ACST_R.$ar_dpt_cd, MST_BILL_ACST_R.$ar_typ};
		Comparable<?>[] vals = {acstCd, arDptCd, arTyp};
		// 更新対象の売掛先別請求を抽出
		MCList<MST_BILL_ACST_R> l = allL.subList(keys, vals);

		// ソート（bill_ymdがCC_Y4M.NULL_VALのレコードを最後にしたいため以下のような実装となっている）
		MCList<MST_BILL_ACST_R> nullL = l.subList("bill_cl_dt", MAC_Y4M.NULL_VAL.value());
		l.removeAll(nullL);
		l.sort("bill_cl_dt");
		l.addAll(nullL);

		return l;
	}

	/**
	 * 請求済相殺額の更新<br />
	 * 
	 * 今回締対象の前受金相殺がある場合、その対象額を前受金入金の請求済相殺額に設定する
	 * 
	 * @param billMngNo 締対象の請求管理ＮＯ
	 */
	protected void updRcvBillSetoffAmt(String billMngNo) {
		// 今回締対象の請求明細から前受金相殺を検索
		MCList<MST_BILL_D_R> billDL = getBillSetoffAmt(billMngNo);

		MCGroupByPolicy gp = new MCGroupByPolicy(MST_RCV_ACT_R.$rcv_no);
		gp.sum(MST_BILL_D_R.$trd_cur_amt1);

		MST_RCV_R t = MST_RCV_R.create("T");
		MCQueryApiBuilder rcv_bldr = MCQueryApiBuilder.create(t);
		rcv_bldr.setWhere(t.rcv_no.eq(bindEx("rcv_no")));
		rcv_bldr.setSetVL(t.bill_setoff_amt, t.bill_setoff_amt.add(bindEx("trd_cur_amt1")));
		for (MST_BILL_D_R billDR : billDL.groupBy(gp)) {
			dbUpdate("MSBGL5030_MST_RCV_U01", billDR, rcv_bldr);
		}
	}

	/**
	 * 請求済相殺額の取消<br />
	 * 
	 * 今回締解除対象の前受金相殺がある場合、その対象額を前受金入金の請求済相殺額から減算する
	 * 
	 * @param billMngNo 締解除対象の請求管理ＮＯ
	 */
	protected void canRcvBillSetoffAmt(String billMngNo) {
		// 今回締解除対象の請求明細から前受金相殺を検索
		MCList<MST_BILL_D_R> billDL = getBillSetoffAmt(billMngNo);

		MCGroupByPolicy gp = new MCGroupByPolicy(MST_RCV_ACT_R.$rcv_no);
		gp.sum(MST_BILL_D_R.$trd_cur_amt1);

		MST_RCV_R t = MST_RCV_R.create("T");
		MCQueryApiBuilder rcv_bldr = MCQueryApiBuilder.create(t);
		rcv_bldr.setWhere(t.rcv_no.eq(bindEx("rcv_no")));
		rcv_bldr.setSetVL(t.bill_setoff_amt, t.bill_setoff_amt.subtract(bindEx("trd_cur_amt1")));

		for (MST_BILL_D_R billDR : billDL.groupBy(gp)) {
			dbUpdate("MSBGL5030_MST_RCV_U02", billDR, rcv_bldr);
		}
	}

	protected MCList<MST_BILL_D_R> getBillSetoffAmt(String billMngNo) {
		// 今回締対象の請求明細から前受金相殺を検索
		MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MST_RCV_ACT_R t2 = MST_RCV_ACT_R.create("T2");
		MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(t);
		billDL_bldr.setSelect(t.trd_cur_amt1);
		billDL_bldr.addSelect(t2.rcv_no);
		billDL_bldr.setWhere(t.bill_mng_no.eq(bind("1")), billMngNo);
		billDL_bldr.addWhereWithAnd(t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_AR.value())));
		billDL_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
		billDL_bldr.addInnerJoin(t2, bracket(t.act_no.eq(t2.rcv_act_no)
				.and(t.act_seq.eq(t2.rcv_act_seq))));
		dbSelect("MSBGL5030_MST_BILL_D_S12", billDL, billDL_bldr);
		return billDL;
	}

	/**
	 * 請求ワークデータ削除<br />
	 * 
	 * 請求書発行処理で使用したワークデータを削除する
	 */
	protected void delWkBill() {

		execDbWkDelete("MSBGL5030_MSW_BILL_D01", MSW_BILL_R.create("T"));
		execDbWkDelete("MSBGL5030_MSW_BILL_D_D01", MSW_BILL_D_R.create("T"));
		execDbWkDelete("MSBGL5030_MSW_RCV_ACT_D_D01", MSW_RCV_ACT_D_R.create("T"));
	}

	/**
	 * 受注状況更新<br />
	 * 
	 * 受注状況を更新する
	 * 
	 * @param regL 受注状況を更新する請求明細
	 * @param sloStsTyp 更新する受注状況区分
	 */
	protected void callSloStsReg(MCList<MST_BILL_D_R> regL, String sloStsTyp) {
		if (!regL.isEmpty()) {
			MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
			setAll(ope.up0(), regL, createMap_SloSts_DtlR_MST_BILL_D_R());
			ope.up0().setString(SloSts_DtlR.$slo_sts_typ, sloStsTyp);
			ope.exec();
		}
	}

	/**
	 * 受注状況更新対象取得<br />
	 * 
	 * 受注状況を更新する請求明細を取得する
	 * 
	 * @param billMngNo 受注状況を更新する請求の請求管理ＮＯ
	 * 
	 * @return 受注状況を更新する請求明細
	 */
	protected MCList<MST_BILL_D_R> getSloStsRegL(String billMngNo) {
		// 受注状況更新サービス
		MCList<MST_BILL_D_R> regL = MCList.create(MST_BILL_D_R.class);
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MST_BILL_R bill1 = MST_BILL_R.create("BILL1");
		MCQueryApiBuilder regL_bldr = MCQueryApiBuilder.create(t);
		regL_bldr.setSelect(t.slo_d_no);
		regL_bldr.addSelect(t.tax_cd);
		regL_bldr.addSelect(t.trd_unit_qty);
		regL_bldr.addSelect(t.trd_unit_cd);
		regL_bldr.addSelect(t.trd_cur_upri);
		regL_bldr.addSelect(t.trd_cur_amt);
		regL_bldr.addSelect(t.trd_cur_tax_amt);
		regL_bldr.addSelect(bill1.bill_no);
		regL_bldr.addSelect(bill1.trd_cur_cd);
		regL_bldr.activeForeign(MST_BILL_D_R.$BILL1);
		regL_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), billMngNo);
		regL_bldr.addWhereWithAnd(t.slo_d_no.isNotNull());
		regL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		regL_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
		dbSelect("MSBGL5030_MST_BILL_D_S13", regL, regL_bldr);
		return regL;
	}

	protected Map_SloSts_DtlR_MST_BILL_D_R<SloSts_DtlR,MST_BILL_D_R> createMap_SloSts_DtlR_MST_BILL_D_R() {
		return new Map_SloSts_DtlR_MST_BILL_D_R<SloSts_DtlR, MST_BILL_D_R>();
	}

	public class Map_SloSts_DtlR_MST_BILL_D_R<D extends SloSts_DtlR, S extends MST_BILL_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, MST_BILL_D_R.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$tax_cd, MST_BILL_D_R.$tax_cd);
			addColumnPathMap(SloSts_DtlR.$qty, MST_BILL_D_R.$trd_unit_qty);
			addColumnPathMap(SloSts_DtlR.$unit_cd, MST_BILL_D_R.$trd_unit_cd);
			addColumnPathMap(SloSts_DtlR.$upri, MST_BILL_D_R.$trd_cur_upri);
			addColumnPathMap(SloSts_DtlR.$amt, MST_BILL_D_R.$trd_cur_amt);
			addColumnPathMap(SloSts_DtlR.$tax_amt, MST_BILL_D_R.$trd_cur_tax_amt);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			dest.cur_cd(src.getString("trd_cur_cd"));
			dest.bill_no(src.getString("bill_no"));
		}
	}
	
	/**
	 * 請求ヘッダに登録されている部門ＣＤが存在するかをチェックし、存在する場合は部門情報を取得。
	 * @param bill_mng_no
	 * @param stDt
	 * @return
	 */
	protected MAM_DPT_R getDpt(String bill_mng_no, MCDate stDt) {
		MST_BILL_R dupBillR = MST_BILL_R.create();
		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder bill_bldr = MCQueryApiBuilder.create(t);
		
		// 請求ヘッダに登録されている部門ＣＤ・請求部門区分を取得
		bill_bldr.setSelect(t.bcst_cd, t.bill_dpt_cd);
		bill_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), bill_mng_no);
		dbSelect("MSBGL5030_MST_BILL_S18", dupBillR, bill_bldr);

		MCRow bind = MCRow.create();
		bind.setStringNE("bcst_cd", dupBillR.bcst_cd());
		bind.setStringNE("bill_dpt_cd", dupBillR.bill_dpt_cd());
		bind.setDateNE("base_dt", stDt);
		String billDptCd = execFuncString(createSqlId(LOGIC_ID, "MSPA_AR_UTIL$F_GET_BCST_DPT", "01"),
				MSPA_AR_UTIL$F_GET_BCST_DPT(bind("bcst_cd"), bind("base_dt"), bind("bill_dpt_cd"), bind("bill_dpt_cd")), bind);
		
		MAM_DPT_R mamDpt = MSBGL_ArUtil.getDpt(billDptCd, stDt);
		if (isNull(mamDpt) || isNull(mamDpt.dpt_cd()) || !mamDpt.ar_dpt_flg()) {
			throw new MCAppException(new MCMessage(MSBGL0122, billDptCd, toYMDString(stDt), toDispGUIIndex(t)));
		}
		
		return mamDpt;
	}

	/**
	 * 請求書履歴テーブルの登録
	 * @param billMngNo 請求管理ＮＯ
	 */
	protected void insBillHis(String billMngNo) {
		
		// 最新データの取得
		MST_BILL_R billR = getBillR(billMngNo);
		if (billR.isEmpty()) {
			return;
		}
		MCList<MST_BILL_D_R> billDL = getBillDL(billR);
		
		// 履歴ＮＯをキャッシュする
		doSeqCache(MSC_NUM_SYS_TYP.BILLDHISNO,
				billDL.size() + billDL.subList(r -> MAC_AR_STTL_TYP.isSETOFF_DR(r.getStringNE(MST_RCV_ACT_R.$ar_sttl_typ2))).size());
		
		// 請求書ヘッダ履歴の設定
		MST_BILL_HIS_R billHisR = MST_BILL_HIS_R.create();
		copy(billHisR, billR, createMap_MST_BILL_HIS_R_MST_BILL_R());
		
		// 請求書明細履歴の設定
		MCList<MST_BILL_D_HIS_R> billDHisL = setBillDHisL(billDL, billHisR);
		
		// 請求書ヘッダ履歴の登録
		MCQueryApiBuilder billHisR_bldr = MCQueryApiBuilder.create(MST_BILL_HIS_R.create("T"));
		dbInsertEx("MSBGL5030_MST_BILL_HIS_I01", billHisR, billHisR_bldr);
		
		// 請求書明細履歴の登録
		MCQueryApiBuilder billDHisL_bldr = MCQueryApiBuilder.create(MST_BILL_D_HIS_R.create("T"));
		dbInsertEx("MSBGL5030_MST_BILL_D_HIS_I01", billDHisL, billDHisL_bldr);
	}

	/**
	 * 請求明細取得<br />
	 * 請求明細を取得する
	 * @param billR 請求ヘッダ
	 * @return 請求明細
	 */
	protected MCList<MST_BILL_D_R> getBillDL(MST_BILL_R billR) {
		
		MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
		executeQuery(billDL, MSBGL5030_MST_BILL_D_S18(), billR);
		return billDL;
	}

	/**
	 * 請求書明細履歴を設定する
	 * @param billDL 請求明細
	 * @param billHisR 請求書ヘッダ履歴
	 * @return 請求書明細履歴
	 */
	protected MCList<MST_BILL_D_HIS_R> setBillDHisL(MCList<MST_BILL_D_R> billDL, MST_BILL_HIS_R billHisR) {
		
		MCList<MST_BILL_D_HIS_R> billDHisL = MCList.create(MST_BILL_D_HIS_R.class);
		
		doSeqCache(MSC_NUM_SYS_TYP.BILLDHISNO, billDL.size());
		for (MST_BILL_D_R billDR : billDL) {
			MST_BILL_D_HIS_R billDHisR = MST_BILL_D_HIS_R.create();
			copy(billDHisR, billDR, billHisR, createMap_MST_BILL_D_HIS_R_MST_BILL_D_R());
			
			if (MSC_BILL_D_TYP.isSLS(billDR.bill_d_typ())
					|| isTaxDiffOrArswTyp(billDR.trd_ptn_typ())) {
				billDHisR.bill_d_his_typ(MAC_BILL_D_HIS_TYP.SLS_ACT.value());
				billDHisL.add(billDHisR);
			}
			else if (MSC_BILL_D_TYP.isRCV(billDR.bill_d_typ())
					&& !isTaxDiffOrArswTyp(billDR.trd_ptn_typ())
					&& !isAdvTrdTyp(billDR.trd_ptn_typ())) {
				billDHisR.bill_d_his_typ(MAC_BILL_D_HIS_TYP.RCV_ACT.value());
				billDHisL.addAll(splitRcv(billDHisR, billDR));
			}
			else if (MSC_BILL_D_TYP.isRCV(billDR.bill_d_typ())
					&& isAdvTrdTyp(billDR.trd_ptn_typ())) {
				billDHisR.bill_d_his_typ(MAC_BILL_D_HIS_TYP.ADV_RCV_ACT.value());
				billDHisL.addAll(splitRcv(billDHisR, billDR));
			}
		}
		
		return billDHisL;
	}

	/**
	 * 税差額、残高振替に関連する取引かどうか判断する
	 */
	protected boolean isTaxDiffOrArswTyp(String trdTyp) {
		return MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(trdTyp)
				|| MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(trdTyp)
				|| MAC_TRD_PTN_TYP.isARSW_IN_NOT_BILL_BAL(trdTyp);
	}

	/**
	 * 前受金に関連する取引かどうか判断する
	 */
	protected boolean isAdvTrdTyp(String trdTyp) {
		return MAC_TRD_PTN_TYP.isRCV_ADV(trdTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdTyp);
	}

	/**
	 * 入金データから相殺分を分割する
	 * @param billDHisR 請求書明細履歴
	 * @param billDR 請求明細
	 * @return 分割後の請求書明細履歴
	 */
	protected MCList<MST_BILL_D_HIS_R> splitRcv(MST_BILL_D_HIS_R billDHisR, MST_BILL_D_R billDR) {
		
		MCList<MST_BILL_D_HIS_R> billDHisL = MCList.create(MST_BILL_D_HIS_R.class);
		
		if (MAC_AR_STTL_TYP.isSETOFF_DR(billDR.getStringNE(MST_RCV_ACT_R.$ar_sttl_typ1))) {
			// 相殺分
			MST_BILL_D_HIS_R setoffR = billDHisR.clone();
			setoffR.trd_cur_amt(billDR.trd_cur_amt1().subtract(billDR.getNumberNE(MST_RCV_ACT_D_R.$trd_cur_tax_amt1)));
			setoffR.trd_cur_tax_amt(billDR.getNumberNE(MST_RCV_ACT_D_R.$trd_cur_tax_amt1));
			setoffR.base_cur_amt(billDR.base_cur_amt1().subtract(billDR.getNumberNE(MST_RCV_ACT_D_R.$base_cur_tax_amt1)));
			setoffR.base_cur_tax_amt(billDR.getNumberNE(MST_RCV_ACT_D_R.$base_cur_tax_amt1));
			setoffR.tax_cd(billDR.getStringNE(MST_RCV_ACT_R.$tax_cd1));
			billDHisL.add(setoffR);
		}
		else if (MAC_AR_STTL_TYP.isSETOFF_DR(billDR.getStringNE(MST_RCV_ACT_R.$ar_sttl_typ2))) {
			// 入金分
			MST_BILL_D_HIS_R rcvR = billDHisR.clone();
			rcvR.trd_cur_amt(billDR.trd_cur_amt1());
			rcvR.trd_cur_tax_amt(0);
			rcvR.base_cur_amt(billDR.base_cur_amt1());
			rcvR.base_cur_tax_amt(0);
			rcvR.bill_d_rmrks(null);
			billDHisL.add(rcvR);
			
			// 相殺分
			MST_BILL_D_HIS_R setoffR = billDHisR.clone();
			setoffR.bill_d_his_no(getStrSeq(MSC_NUM_SYS_TYP.BILLDHISNO));
			setoffR.rcv_mtd_cd(billDR.getStringNE(MST_RCV_ACT_R.$ar_sttl_cd2));
			setoffR.trd_cur_amt(billDR.trd_cur_amt2().subtract(billDR.getNumberNE(MST_RCV_ACT_D_R.$trd_cur_tax_amt2)));
			setoffR.trd_cur_tax_amt(billDR.getNumberNE(MST_RCV_ACT_D_R.$trd_cur_tax_amt2));
			setoffR.base_cur_amt(billDR.base_cur_amt2().subtract(billDR.getNumberNE(MST_RCV_ACT_D_R.$base_cur_tax_amt2)));
			setoffR.base_cur_tax_amt(billDR.getNumberNE(MST_RCV_ACT_D_R.$base_cur_tax_amt2));
			setoffR.tax_cd(billDR.getStringNE(MST_RCV_ACT_R.$tax_cd2));
			billDHisL.add(setoffR);
		}
		else if (isAdvTrdTyp(billDR.trd_ptn_typ())) {
			MST_BILL_D_HIS_R rcvR = billDHisR.clone();
			rcvR.trd_cur_amt(billDR.trd_cur_amt1());
			rcvR.trd_cur_tax_amt(0);
			rcvR.base_cur_amt(billDR.base_cur_amt1());
			rcvR.base_cur_tax_amt(0);
			billDHisL.add(rcvR);
		}
		else {
			billDHisL.add(billDHisR);
		}
		
		return billDHisL;
	}

	// 請求書ヘッダ履歴設定用Mapper
	protected Map_MST_BILL_HIS_R_MST_BILL_R<MST_BILL_HIS_R,MST_BILL_R> createMap_MST_BILL_HIS_R_MST_BILL_R() {
		return new Map_MST_BILL_HIS_R_MST_BILL_R<MST_BILL_HIS_R, MST_BILL_R>();
	}
	public class Map_MST_BILL_HIS_R_MST_BILL_R<D extends MST_BILL_HIS_R, S extends MST_BILL_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_BILL_HIS_R.$bill_no, MST_BILL_R.$bill_no);
			addColumnPathMap(MST_BILL_HIS_R.$bill_rev, MST_BILL_R.$bill_rev);
			addColumnPathMap(MST_BILL_HIS_R.$bill_cl_dt, MST_BILL_R.$bill_cl_dt);
			addColumnPathMap(MST_BILL_HIS_R.$bill_each_sls_flg, MST_BILL_R.$bill_each_sls_flg);
			addColumnPathMap(MST_BILL_HIS_R.$iv_no, MST_BILL_R.$iv_no);
			addColumnPathMap(MST_BILL_HIS_R.$wrk_no, MST_BILL_R.$wrk_no);
			addColumnPathMap(MST_BILL_HIS_R.$bcst_cd, MST_BILL_R.$bcst_cd);
			addColumnPathMap(MST_BILL_HIS_R.$bill_dpt_cd, MST_BILL_R.$bill_dpt_cd);
			addColumnPathMap(MST_BILL_HIS_R.$bill_xrate, MST_BILL_R.$bill_xrate);
			addColumnPathMap(MST_BILL_HIS_R.$trd_cur_cd, MST_BILL_R.$trd_cur_cd);
			addColumnPathMap(MST_BILL_HIS_R.$last_bill_amt, MST_BILL_R.$last_bill_amt);
			addColumnPathMap(MST_BILL_HIS_R.$sw_amt, MST_BILL_R.$sw_amt);
			addColumnPathMap(MST_BILL_HIS_R.$bfw_amt, MST_BILL_R.$bfw_amt);
			addColumnPathMap(MST_BILL_HIS_R.$sls_amt, MST_BILL_R.$sls_amt);
			addColumnPathMap(MST_BILL_HIS_R.$dscnt_amt, MST_BILL_R.$dscnt_amt);
			addColumnPathMap(MST_BILL_HIS_R.$ret_amt, MST_BILL_R.$ret_amt);
			addColumnPathMap(MST_BILL_HIS_R.$sw_to_amt, MST_BILL_R.$sw_to_amt);
			addColumnPathMap(MST_BILL_HIS_R.$bill_amt, MST_BILL_R.$bill_amt);
			addColumnPathMap(MST_BILL_HIS_R.$adv_amt_bal, MST_BILL_R.$adv_amt_bal);
			addColumnPathMap(MST_BILL_HIS_R.$adv_amt, MST_BILL_R.$adv_amt);
			addColumnPathMap(MST_BILL_HIS_R.$adv_setoff_amt, MST_BILL_R.$adv_setoff_amt);
			addColumnPathMap(MST_BILL_HIS_R.$adv_setoff_tax_amt, MST_BILL_R.$adv_setoff_tax_amt);
			addColumnPathMap(MST_BILL_HIS_R.$sub_char1, MST_BILL_R.$sub_char1);
			addColumnPathMap(MST_BILL_HIS_R.$sub_char2, MST_BILL_R.$sub_char2);
			addColumnPathMap(MST_BILL_HIS_R.$sub_char3, MST_BILL_R.$sub_char3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.bill_his_no(getStrSeq(MSC_NUM_SYS_TYP.BILLHISNO));
			dest.latest_flg(true);
			dest.can_flg(false);
			dest.rcv_amt(sum(src.xfr_amt(), src.note_amt(), src.cash_amt()));
			dest.setoff_amt(nvl(src.setoff_amt(), MCNumber.ZERO).negate());
			dest.tax_amt(src.tax_amt().subtract(nvl(src.setoff_tax_amt(), MCNumber.ZERO)));
		}
	}

	// 請求書明細履歴設定用Mapper
	protected Map_MST_BILL_D_HIS_R_MST_BILL_D_R<MST_BILL_D_HIS_R,MST_BILL_D_R, MST_BILL_HIS_R> createMap_MST_BILL_D_HIS_R_MST_BILL_D_R() {
		return new Map_MST_BILL_D_HIS_R_MST_BILL_D_R<MST_BILL_D_HIS_R, MST_BILL_D_R, MST_BILL_HIS_R>();
	}
	public class Map_MST_BILL_D_HIS_R_MST_BILL_D_R<D extends MST_BILL_D_HIS_R, S extends MST_BILL_D_R, W extends MST_BILL_HIS_R> extends MAUCC_RowMapperWith<D,S,W>{
		
		protected W _billHis;
		
		@Override
		public void setWith(W _billHis) {
			this._billHis = _billHis;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_BILL_D_HIS_R.$bill_d_no, MST_BILL_D_R.$bill_d_no);
			addColumnPathMap(MST_BILL_D_HIS_R.$trd_cd, MST_BILL_D_R.$trd_cd);
			addColumnPathMap(MST_BILL_D_HIS_R.$slip_sts_typ, MST_BILL_D_R.$slip_sts_typ);
			addColumnPathMap(MST_BILL_D_HIS_R.$act_no, MST_BILL_D_R.$act_no);
			addColumnPathMap(MST_BILL_D_HIS_R.$act_seq, MST_BILL_D_R.$act_seq);
			addColumnPathMap(MST_BILL_D_HIS_R.$act_rev, MST_BILL_D_R.$act_rev);
			addColumnPathMap(MST_BILL_D_HIS_R.$act_d_no, MST_BILL_D_R.$act_d_no);
			addColumnPathMap(MST_BILL_D_HIS_R.$act_d_seq, MST_BILL_D_R.$act_d_seq);
			addColumnPathMap(MST_BILL_D_HIS_R.$rcv_mtd_cd, MST_BILL_D_R.$rcv_mtd_cd);
			addColumnPathMap(MST_BILL_D_HIS_R.$cst_cd, MST_BILL_D_R.$cst_cd);
			addColumnPathMap(MST_BILL_D_HIS_R.$dlv_cd, MST_BILL_D_R.$dlv_cd);
			addColumnPathMap(MST_BILL_D_HIS_R.$dlv_dt, MST_BILL_D_R.$dlv_dt);
			addColumnPathMap(MST_BILL_D_HIS_R.$base_sls_ac_dt, MST_BILL_D_R.$base_sls_ac_dt);
			addColumnPathMap(MST_BILL_D_HIS_R.$rcv_dt, MST_BILL_D_R.$rcv_dt);
			addColumnPathMap(MST_BILL_D_HIS_R.$itm_cd, MST_BILL_D_R.$itm_cd);
			addColumnPathMap(MST_BILL_D_HIS_R.$itm_sub1, MST_BILL_D_R.$itm_sub1);
			addColumnPathMap(MST_BILL_D_HIS_R.$itm_sub2, MST_BILL_D_R.$itm_sub2);
			addColumnPathMap(MST_BILL_D_HIS_R.$itm_sub3, MST_BILL_D_R.$itm_sub3);
			addColumnPathMap(MST_BILL_D_HIS_R.$itm_nm, MST_BILL_D_R.$itm_nm);
			addColumnPathMap(MST_BILL_D_HIS_R.$sundry_itm_flg, MST_BILL_D_R.$sundry_itm_flg);
			addColumnPathMap(MST_BILL_D_HIS_R.$cst_itm_cd, MST_BILL_D_R.$cst_itm_cd);
			addColumnPathMap(MST_BILL_D_HIS_R.$cst_itm_nm, MST_BILL_D_R.$cst_itm_nm);
			addColumnPathMap(MST_BILL_D_HIS_R.$trd_unit_cd, MST_BILL_D_R.$trd_unit_cd);
			addColumnPathMap(MST_BILL_D_HIS_R.$trd_unit_qty, MST_BILL_D_R.$trd_unit_qty);
			addColumnPathMap(MST_BILL_D_HIS_R.$trd_cur_upri, MST_BILL_D_R.$trd_cur_upri);
			addColumnPathMap(MST_BILL_D_HIS_R.$trd_cur_amt, MST_BILL_D_R.$trd_cur_amt);
			addColumnPathMap(MST_BILL_D_HIS_R.$trd_cur_dscnt_amt, MST_BILL_D_R.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_BILL_D_HIS_R.$interim_flg, MST_BILL_D_R.$interim_flg);
			addColumnPathMap(MST_BILL_D_HIS_R.$base_cur_upri, MST_BILL_D_R.$base_cur_upri);
			addColumnPathMap(MST_BILL_D_HIS_R.$base_cur_amt, MST_BILL_D_R.$base_cur_amt);
			addColumnPathMap(MST_BILL_D_HIS_R.$base_cur_dscnt_amt, MST_BILL_D_R.$base_cur_dscnt_amt);
			addColumnPathMap(MST_BILL_D_HIS_R.$tax_cd, MST_BILL_D_R.$tax_cd);
			addColumnPathMap(MST_BILL_D_HIS_R.$trd_cur_tax_amt, MST_BILL_D_R.$trd_cur_tax_amt);
			addColumnPathMap(MST_BILL_D_HIS_R.$base_cur_tax_amt, MST_BILL_D_R.$base_cur_tax_amt);
			addColumnPathMap(MST_BILL_D_HIS_R.$trd_d_rmrks, MST_BILL_D_R.$trd_d_rmrks);
			addColumnPathMap(MST_BILL_D_HIS_R.$bill_d_rmrks, MST_BILL_D_R.$bill_d_rmrks);
			addColumnPathMap(MST_BILL_D_HIS_R.$dlv_slip_no, MST_BILL_D_R.$dlv_slip_no);
			addColumnPathMap(MST_BILL_D_HIS_R.$dlv_slip_d_no, MST_BILL_D_R.$dlv_slip_d_no);
			addColumnPathMap(MST_BILL_D_HIS_R.$ship_dlv_slip_no, MST_BILL_D_R.$ship_dlv_slip_no);
			addColumnPathMap(MST_BILL_D_HIS_R.$ship_dlv_slip_d_no, MST_BILL_D_R.$ship_dlv_slip_d_no);
			addColumnPathMap(MST_BILL_D_HIS_R.$ship_dlv_slip_multi_flg, MST_BILL_D_R.$ship_dlv_slip_multi_flg);
			addColumnPathMap(MST_BILL_D_HIS_R.$bill_mtd_typ, MST_BILL_D_R.$bill_mtd_typ);
			addColumnPathMap(MST_BILL_D_HIS_R.$sub_char1, MST_BILL_D_R.$sub_char1);
			addColumnPathMap(MST_BILL_D_HIS_R.$sub_char2, MST_BILL_D_R.$sub_char2);
			addColumnPathMap(MST_BILL_D_HIS_R.$sub_char3, MST_BILL_D_R.$sub_char3);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.bill_d_his_no(getStrSeq(MSC_NUM_SYS_TYP.BILLDHISNO));
			dest.bill_his_no(_billHis.bill_his_no());
		}
	}
	protected void initCache() {
		initSttlCache();
	}
	protected MAM_STTL_R getSttlCache(String sttlCd) {
		return _cacheSttl.get(sttlCd);
	}
	protected void initSttlCache() {
		_cacheSttl = null;
		_cacheSttl = new FXUCL_MCDbcCache<MAM_STTL_R>(MCQueryApiBuilder.create(MAM_STTL_R.create("T")));
	}
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
	protected void initBpCache(MCList<BillCl_Upd03_CndR> bindL) {
		MAM_BP_R bp = MAM_BP_R.create("BP");
		MCQueryApiBuilder bpBldr = MCQueryApiBuilder.create(bp);
		bpBldr.setSelect(bp.bp_cd);
		bpBldr.addSelect(bp.bill_can_slip_typ);
		bpBldr.addSelect(bp.bill_dtl_subttl_typ);
		bpBldr.addSelect(bp.sls_dtl_outp_typ);
		_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpBldr,
				bindL.groupBy(BillCl_Upd03_CndR.$bcst_cd), BillCl_Upd03_CndR.$bcst_cd);
	}
	protected void chkBillDpt(MCDate baseDt, MST_BILL_R insR, BillCl_Upd02_HdrR downR) {
		MAM_DPT_R dptR = MSBGL_ArUtil.getDpt(insR.bill_dpt_cd(), baseDt);
		if (!dptR.ar_dpt_flg()) {
			MCMessage msg = new MCMessage(downR, null, MSBGL0133,
					toYMDString(baseDt), insR.bcst_cd(), insR.bill_dpt_cd());
			throw new MCAppException(msg);
		}
	}
	protected void chkRcvMtdCd(MCList<MST_RCV_SCHD_R> regRcvSchdL, BillCl_Upd02_HdrR downR) {
		for (MST_RCV_SCHD_R regRcvSchdR : regRcvSchdL) {
			chkRcvMtdCd(regRcvSchdR.rcv_mtd_cd(), downR);
		}
	}
	protected void chkRcvMtdCd(String rcvMtdCd, BillCl_Upd02_HdrR downR) {
		MAM_STTL_R sttlR = getSttlCache(rcvMtdCd);
		if (isNull(sttlR) || sttlR.isEmpty()) {
			MCMessage msg = getRecordNotFoundMsg("MA", sttlR.tableName(),
					sttlR.getKeyColumn(),
					new String[] {rcvMtdCd}, nvl(downR, BillCl_Upd02_HdrR.create())).get(0);
			throw new MCAppException(msg);
		}
	}

	//FMCB CUSTOM END
}