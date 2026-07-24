package mcframe.serverMSBH.MSBHB0010;

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
import mcframe.serverMSBH.MSBHB0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.requester.MCServerThreadManager;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;

import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService;
import mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR;
import mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;

import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHB_PaySchdClBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHB_PaySchdClBatch_MC extends MSBHB_PaySchdClBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * PaySchdClBatch_Upd01オペレーション.<p>
	 *
	 */
	public class PaySchdClBatch_Upd01 extends MSBHB_PaySchdClBatch_MC_A.PaySchdClBatch_Upd01 {
		
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
			logger().writeStartLog(MSBHL0019);
			pushStartLog(logger());
		}

		/**
		 * 例外処理
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
			logger().writeEndLog(MSBHL0020, _totalCnt, _successCnt, _errorCnt);
			pushEndLog(logger());
			logger().close();
		}

		/**
		 * メイン処理
		 */
		protected void execMain() {
			
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;

			if (isNull(up0().tgt_dt())) {
				up0().tgt_dt(getToday());
			}

			// 対象日が休日の場合は処理を終了する
			boolean wrkdayFlg = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_DT$F_IS_WRKDAY", "01"), MAPA_DT$F_IS_WRKDAY(
					value(up0().tgt_dt()),
					value(nvl(getCo().pay_schd_cl_cal_cd(), getCo().std_cal_cd()))));
			if (!wrkdayFlg) {
				return;
			}

			MCList<MAM_BP_R> bspplL = getBspplL();
			if (isNull(bspplL)) {
				return;
			}

			int paramIndex = 0;
			List<MSBHB_PaySchdClBatch.PaySchdClBatch_Upd02> opeL = new ArrayList<>();
			for (MAM_BP_R bspplR : bspplL) {
				MSBHB_PaySchdClBatch.PaySchdClBatch_Upd02 ope = MSBHB_PaySchdClBatch.crtPaySchdClBatch_Upd02();
				ope._paramIndex = ++paramIndex;
				ope.up0().tgt_dt(up0().tgt_dt());
				ope.up0().bsppl_cd(bspplR.bp_cd());
				opeL.add(ope);
			}

			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}

			for (MSBHB_PaySchdClBatch.PaySchdClBatch_Upd02 ope : opeL) {
				PaySchdClBatch_RsltR downR = ope.down0();
				_totalCnt += downR.total_cnt().intValue();
				_successCnt += downR.success_cnt().intValue();
				_errorCnt += downR.error_cnt().intValue();
			}

		}

		/**
		 * 支払予定管理先取得
		 */
		protected MCList<MAM_BP_R> getBspplL() {
			MAM_BP_R t1 = MAM_BP_R.create("T1");
			MST_AP_D_R S1T2 = MST_AP_D_R.create("T2");
			MCList<MAM_BP_R> l = MCList.create(MAM_BP_R.class);
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t1);
			
			l_bldr.setSelect(t1.bp_cd);
			
			l_bldr.addWhereWithAnd(t1.batch_pay_schd_cl_flg.eq(value(true)));
			l_bldr.addWhereWithAnd(t1.bsppl_flg.eq(value(true)));
			l_bldr.addWhereWithAnd(coalesce( t1.psppl_cl_day1, t1.psppl_cl_day2, t1.psppl_cl_day3, t1.psppl_cl_day4, t1.psppl_cl_day5).isNotNull());
			l_bldr.addWhereWithAnd(exists( subQuery() .select(value("X")) .from(S1T2) .where( S1T2.bsppl_cd.eq(t1.bp_cd) .and(S1T2.chk_flg.eq(value(false))) .and(S1T2.valid_flg.eq(value(true))) )));
			l_bldr.addWhereWithCutOffAnd(t1.bp_cd.eq(bind("bsppl_cd")));
			l_bldr.setOrderByAsc(t1.bp_cd);
			
			dbSelect("MSBHB0010_MAM_BP_S01", l, l_bldr, up0());
			
			return l;
		}

	}
	
	/**
	 * PaySchdClBatch_Upd02オペレーション.<p>
	 *
	 */
	public class PaySchdClBatch_Upd02 extends MSBHB_PaySchdClBatch_MC_A.PaySchdClBatch_Upd02 {
		
		/**
		 * バッチログのlogger<br>
		 * Upd01バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		protected MAM_BP_R _bspplR = null;
		
		/**
		 * マルチスレッドごとに別のparamIndexを設定する
		 */
		protected int _paramIndex;
		
		protected final String HDR_PEG_NO_COL = "hdr_peg_no";
		
		protected final String ERR_FLG_COL = "err_flg";
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initLogger();
				preProc();
				if (isExec()) {
					execMain();
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
		
		protected void preProc() {
			down0().success_cnt(0);
			down0().error_cnt(0);
			down0().total_cnt(0);
		}
		
		protected boolean isExec() {
			if (isNullOr(up0().tgt_dt(), up0().bsppl_cd())) {
				return false;
			}
			MAM_BP_R bspplR = getBspplR();
			return !isNull(bspplR.bp_cd()) && bspplR.batch_pay_schd_cl_flg();
		}
		
		/**
		 * 支払予定登録処理実行
		 */
		protected void execMain() {
			// 未照合の有効な買掛明細情報を取得する
			MCList<MST_AP_D_R> apDL = getApDL();
			
			// 処理対象の買掛明細情報を取得する
			MCList<MST_AP_D_R> tgtApDL = MCList.create(MST_AP_D_R.class);
			MCList<MST_AP_D_R> allApDL = MCList.create(MST_AP_D_R.class);
			setTgtApDL(apDL, tgtApDL, allApDL);
			
			// 支払予定情報を登録する
			MCList<PaySchd_HdrR> upHdrL = callPaySchdRegServiceIns01(tgtApDL);
			
			// 処理結果を書込する
			insPaySchdClBr(upHdrL);
			
			// 下り電文を設定する
			setDown(allApDL);
			
			// コミットする
			dbTran().commit();
		}
		
		/**
		 * 未照合の有効な買掛明細情報の取得
		 */
		protected MCList<MST_AP_D_R> getApDL() {
			MCList<MST_AP_D_R> l = MCList.create(MST_AP_D_R.class);
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addWhereWithAnd(t.bsppl_cd.eq(bind("1")), up0().bsppl_cd());
			l_bldr.addWhereWithAnd(t.chk_flg.eq(value(false)));
			l_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
			l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBHB0010_MST_AP_D_S01", l, l_bldr);
			return l;
		}
		
		protected MAM_BP_R getBspplR() {
			if (_bspplR == null) {
				MAM_BP_R t = MAM_BP_R.create("T");
				_bspplR = MAM_BP_R.create();
				MCQueryApiBuilder bspplR_bldr = MCQueryApiBuilder.create(t);
				bspplR_bldr.setSelect(t.bp_cd);
				bspplR_bldr.addSelect(t.batch_pay_schd_cl_flg);
				bspplR_bldr.addSelect(t.pay_schd_cl_delay_days);
				bspplR_bldr.addSelect(t.pay_schd_cl_ba_typ);
				bspplR_bldr.addSelect(t.tax_on_pay_flg);
				bspplR_bldr.addSelect(t.psppl_cd);
				dbSelectKey("MSBHB0010_MAM_BP_S02", _bspplR, bspplR_bldr, up0().bsppl_cd());
			}
			return _bspplR;
		}
		
		/**
		 * 処理対象の買掛明細情報を取得する
		 */
		protected void setTgtApDL(MCList<MST_AP_D_R> apDL, 
				MCList<MST_AP_D_R> tgtApDL, MCList<MST_AP_D_R> allApDL) {
			if (isNull(apDL)) {
				return ;
			}
			
			MCList<MST_AP_D_R> clDtL = MCList.create(MST_AP_D_R.class);
			HashMap<MCDate, MCList<MST_AP_D_R>> clDtMap = new HashMap<>();
			
			for (MCList<MST_AP_D_R> l : apDL.groupList(MST_AP_D_R.$bsppl_cl_dt)) {
				MST_AP_D_R r = l.get(0);
				MCDate clDt = r.bsppl_cl_dt();
				if (isNull(clDt)) {
					l.setBooleanNE(ERR_FLG_COL, true);
					allApDL.addAll(l);
				}
				else {
					clDtL.add(r);
					MCList<MST_AP_D_R> val = clDtMap.get(clDt);
					if (val == null) {
						clDtMap.put(clDt, l);
					}
					else {
						val.addAll(l);
					}
				}
			}
			
			if (!isNull(allApDL)) {
				MCMessagePool.add(new MCMessage(MSBHL0021, up0().bsppl_cd()));
			}
			
			// 支払予定管理先締日から処理日を算出する
			final String tgt_dt_col = "$tgt_dt";
			final String lt_col = "$lt";
			final String fw_flg_col = "$fw_flg";
			final String cal_cd_col = "$cal_cd";
			clDtL.addDateColumn(tgt_dt_col);
			clDtL.addNumberColumn(lt_col);
			clDtL.addBooleanColumn(fw_flg_col);
			clDtL.addStringColumn(cal_cd_col);
			MAM_BP_R bspplR = getBspplR();
			for (MST_AP_D_R r : clDtL) {
				r.setNumber(lt_col, bspplR.pay_schd_cl_delay_days());
				r.setBoolean(fw_flg_col, MAC_BA_TYP.isAF(bspplR.pay_schd_cl_ba_typ()));
				r.setString(cal_cd_col, nvl(getCo().pay_schd_cl_cal_cd(), getCo().std_cal_cd()));
			}
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DT$F_CAL_DATE_LT", "01"), MABCFunction.getFunctionExecuter("MAPA_DT$F_CAL_DATE_LT"), tgt_dt_col, clDtL, MST_AP_D_R.$bsppl_cl_dt, lt_col, fw_flg_col, cal_cd_col);
			
			for (MST_AP_D_R r : clDtL) {
				if (up0().tgt_dt().gte(r.getDateNE(tgt_dt_col))) {
					tgtApDL.addAll(clDtMap.get(r.bsppl_cl_dt()));
				}
			}
			
			allApDL.addAll(tgtApDL);
		}
		
		/**
		 * 支払予定登録サービスの支払予定登録を実行する。
		 */
		protected MCList<PaySchd_HdrR> callPaySchdRegServiceIns01(MCList<MST_AP_D_R> tgtApDL) {
			if (isNull(tgtApDL)) {
				return MCList.create(PaySchd_HdrR.class);
			}
			
			MCList<PaySchd_HdrR> upHdrL = MCList.create(PaySchd_HdrR.class);
			upHdrL.addStringColumn(MST_PAY_SCHD_CL_BR_R.$batch_log_no);
			upHdrL.addNumberColumn(MST_PAY_SCHD_CL_BR_R.$log_sub_key1);
			upHdrL.addNumberColumn(MST_PAY_SCHD_CL_BR_R.$log_sub_key2);
			MCList<PaySchd_DtlApdR> upApDL = MCList.create(PaySchd_DtlApdR.class);
			MCList<PaySchd_DtlSchdR> upPaySchdL = MCList.create(PaySchd_DtlSchdR.class);
			MCList<MST_AP_D_R> taxApDL = MCList.create(MST_AP_D_R.class);
			MCList<PaySchd_DtlActR> upDtlActL = MCList.create(PaySchd_DtlActR.class);
			MCList<PaySchd_AdvPayActR> upAdvPayActL = MCList.create(PaySchd_AdvPayActR.class);
			
			callPaySchdRegServiceSrch02(upHdrL, upApDL, tgtApDL);
			
			setLogKey(upHdrL);
			MCIndexKey tgtApdIdxkey = tgtApDL.createIndex(HDR_PEG_NO_COL);
			for (PaySchd_HdrR upHdrR : upHdrL) {
				MCDate xrateBaseDt = nvl(upHdrR.bsppl_cl_dt(), upHdrR.reg_dt());
				upHdrR.pay_xrate(
					MAUCL_AmtUtil.getDefXrateNE(
						upHdrR.trd_cur_cd(),
						getCo().base_cur_cd(),
						getCo().pay_xrate_cd(),
						xrateBaseDt));
				for (MST_AP_D_R apDR : tgtApDL.subList(tgtApdIdxkey, upHdrR.hdr_peg_no())) {
					apDR.setNumberNE(PaySchd_Srch05_CndR.$pay_xrate, upHdrR.pay_xrate());
					apDR.setDateNE(PaySchd_Srch05_CndR.$xrate_base_dt, xrateBaseDt);
					apDR.setAttributes(upHdrR);
				}
			}
			
			callPaySchdRegServiceLock(upHdrL);
			MSBHL_PaySchdRegService.initItm();
			try {
				callPaySchdRegServiceSrch07(upHdrL, upDtlActL);
				callPaySchdRegServiceSrch08(upHdrL, upAdvPayActL);
				callPaySchdRegServiceSrch05(upApDL, tgtApDL, upDtlActL, upAdvPayActL, taxApDL);
				callPaySchdRegServiceSrch01(upHdrL, upPaySchdL, tgtApDL, taxApDL);
			}
			catch (MCAppException ex) {
				MCMessage msg = ex.getMCMessage();
				MCMessageList msgL = ex.getCauseMessageList();
				MCMessagePool.add(msg);
				MCMessagePool.addAll(msgL);
				upHdrL.forEach(r -> r.err_flg(true));
				tgtApDL.forEach(r -> r.setBooleanNE(ERR_FLG_COL, true));
			}
			MCList<PaySchd_HdrR> upHdrChkL = upHdrL.subList(r->!r.err_flg());
			
			if (!isNull(upHdrChkL)) {
				
				MSBHL_PaySchdRegService.PaySchd_Chk01 chkOpe = MSBHL_PaySchdRegService.crtPaySchd_Chk01();
				MSBHL_PaySchdRegService.PaySchd_Ins01 insOpe = MSBHL_PaySchdRegService.crtPaySchd_Ins01();
				
				MCIndexKey hdrIdxkey = upHdrChkL.createIndex(PaySchd_HdrR.$hdr_peg_no);
				MCIndexKey apDIdxkey = upApDL.createIndex(PaySchd_DtlApdR.$hdr_peg_no);
				MCIndexKey paySchdIdxkey = upPaySchdL.createIndex(PaySchd_DtlSchdR.$hdr_peg_no);
				MCIndexKey actIdxKey = upDtlActL.createIndex(PaySchd_DtlActR.$hdr_peg_no);
				MCIndexKey advPayActIdxKey = upAdvPayActL.createIndex(PaySchd_AdvPayActR.$hdr_peg_no);
				
				setPegNo(upApDL);
				setPegNo(upPaySchdL);
				
				for (PaySchd_HdrR hdrR : upHdrChkL) {
					chkOpe.up0().add(hdrR);
					MCList<PaySchd_DtlApdR> upApDSubL = upApDL.subList(apDIdxkey, hdrR.hdr_peg_no());
					upApDSubL.setAttributes(hdrR);
					chkOpe.up1().addAll(upApDSubL);
					MCList<PaySchd_DtlSchdR> upPaySchdSubL = upPaySchdL.subList(paySchdIdxkey, hdrR.hdr_peg_no());
					upPaySchdSubL.setAttributes(hdrR);
					chkOpe.up2().addAll(upPaySchdSubL);
					MCList<PaySchd_DtlActR> upActSubL = upDtlActL.subList(actIdxKey, hdrR.hdr_peg_no());
					upActSubL.setAttributes(hdrR);
					chkOpe.up3().addAll(upActSubL);
					MCList<PaySchd_AdvPayActR> upAdvPayActSubL = upAdvPayActL.subList(advPayActIdxKey, hdrR.hdr_peg_no());
					upAdvPayActSubL.setAttributes(hdrR);
					chkOpe.up4().addAll(upAdvPayActSubL);
				}
				
				chkOpe.exec();
				
				for (PaySchd_HdrR downR : chkOpe.down0()) {
					if (downR.err_flg()) {
						for (MST_AP_D_R apDR : tgtApDL.subList(tgtApdIdxkey, downR.hdr_peg_no())) {
							apDR.setBooleanNE(ERR_FLG_COL, true);
						}
					}
					else {
						insOpe.up0().addAll(upHdrChkL.subList(hdrIdxkey, downR.hdr_peg_no()));
						insOpe.up1().addAll(upApDL.subList(apDIdxkey, downR.hdr_peg_no()));
						insOpe.up2().addAll(upPaySchdL.subList(paySchdIdxkey, downR.hdr_peg_no()));
						insOpe.up3().addAll(upDtlActL.subList(actIdxKey, downR.hdr_peg_no()));
						insOpe.up4().addAll(upAdvPayActL.subList(advPayActIdxKey, downR.hdr_peg_no()));
					}
				}
				
				if (!isNull(insOpe.up0())) {
					insOpe.exec();
				}
			}
			
			return upHdrL;
		}
		
		/**
		 * 支払予定登録サービスの買掛明細まとめを実行し、支払予定登録サービスの支払予定登録の電文を作成する。
		 * @param upHdrL 支払予定登録の上り電文（支払照合ヘッダ）
		 * @param upApDL 支払予定登録の上り電文（買掛明細）
		 * @param tgtApDL 支払予定作成対象の買掛明細
		 */
		protected void callPaySchdRegServiceSrch02(MCList<PaySchd_HdrR> upHdrL, MCList<PaySchd_DtlApdR> upApDL, MCList<MST_AP_D_R> tgtApDL) {
			
			MSBHL_PaySchdRegService.PaySchd_Srch02 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch02();
			
			for (MST_AP_D_R apDR : tgtApDL) {
				
				PaySchd_Srch02_CndR cndR = PaySchd_Srch02_CndR.create();
				
				cndR.ap_d_no(apDR.ap_d_no());
				cndR.sppl_cd(apDR.sppl_cd());
				cndR.bsppl_cd(apDR.bsppl_cd());
				cndR.bsppl_dpt_cd(apDR.bsppl_dpt_cd());
				cndR.purc_act_no(apDR.purc_act_no());
				cndR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
				cndR.rcpt_iv_no(apDR.rcpt_iv_no());
				cndR.trd_cur_cd(apDR.trd_cur_cd());
				cndR.pay_schd_dt(apDR.pay_schd_dt());
				cndR.bsppl_cl_dt(apDR.bsppl_cl_dt());
				cndR.bsppl_cl_day(apDR.bsppl_cl_day());
				cndR.wrk_no(apDR.wrk_no());
				cndR.trd_ptn_typ(apDR.trd_ptn_typ());
				cndR.itm_cd(apDR.itm_cd());
				cndR.itm_sub1(apDR.itm_sub1());
				cndR.itm_sub2(apDR.itm_sub2());
				cndR.itm_sub3(apDR.itm_sub3());
				cndR.trd_cur_amt(apDR.trd_cur_amt());
				cndR.trd_cur_tax_amt(apDR.trd_cur_tax_amt());
				cndR.reg_dt(up0().tgt_dt());
				cndR.cl_dt_grp_flg(true); // バッチの場合、締日違いをまとめる
				
				ope.up0().add(cndR);
			}
			
			setPegNo(ope.up0());
			ope.exec();
			
			for (PaySchd_Srch02_RsltR srch02RsltR : ope.down1()) {
				
				PaySchd_HdrR hdrR = PaySchd_HdrR.create();
				
				hdrR.hdr_peg_no(srch02RsltR.hdr_peg_no());
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdrR.reg_dt(up0().tgt_dt()); // バッチの場合、登録日はバッチの処理日とする
				hdrR.bsppl_cd(srch02RsltR.bsppl_cd());
				hdrR.bsppl_dpt_cd(srch02RsltR.bsppl_dpt_cd());
				hdrR.purc_act_no(srch02RsltR.purc_act_no());
				hdrR.rcpt_iv_mng_no(srch02RsltR.rcpt_iv_mng_no());
				hdrR.rcpt_iv_no(srch02RsltR.rcpt_iv_no());
				hdrR.wrk_no(srch02RsltR.wrk_no());
				hdrR.pay_spot_flg(srch02RsltR.pay_spot_flg());
				hdrR.bsppl_cl_day(srch02RsltR.bsppl_cl_day());
				hdrR.bsppl_cl_dt(srch02RsltR.bsppl_cl_dt());
				hdrR.trd_cur_cd(srch02RsltR.trd_cur_cd());
				hdrR.batch_pay_schd_cl_flg(true);
				
				upHdrL.add(hdrR);
			}
			
			MCIndexKey apDNoSrch02Idxkey = ope.down0().createIndex(MST_AP_D_R.$ap_d_no);
			
			for (MST_AP_D_R apDR : tgtApDL) {
				
				PaySchd_Srch02_CndR srch02CndR = ope.down0().getFirst(apDNoSrch02Idxkey, apDR.ap_d_no());
				
				apDR.setNumberNE(HDR_PEG_NO_COL, srch02CndR.hdr_peg_no());
				if (srch02CndR.err_flg()) {
					apDR.setBooleanNE(ERR_FLG_COL, true);
				}
				else {
					PaySchd_DtlApdR upApDR = PaySchd_DtlApdR.create();
					copyPaySchd_DtlApdR_MST_AP_D_R(upApDR, apDR);
					upApDL.add(upApDR);
				}
			}
		}
		
		protected void copyPaySchd_DtlApdR_MST_AP_D_R(PaySchd_DtlApdR dest, MST_AP_D_R src) {
			dest.hdr_peg_no(src.getNumberNE(HDR_PEG_NO_COL));
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.pay_mtd_typ(MSC_PAY_MTD_TYP.ALL_PAY.value());
			dest.ap_d_no(src.ap_d_no());
			dest.trd_ptn_typ(src.trd_ptn_typ());
			dest.slip_sts_typ(src.slip_sts_typ());
			dest.asppl_cd(src.asppl_cd());
			dest.ap_dpt_cd(src.ap_dpt_cd());
			dest.ap_typ(src.ap_typ());
			dest.interim_flg(src.interim_flg());
			dest.pay_amt(src.trd_cur_amt());
			dest.pay_tax_amt(src.trd_cur_tax_amt());
			dest.pay_wtax_amt(src.wtax_amt());
			dest.repurc_obli_flg(src.repurc_obli_flg());
			dest.pay_proc_amt(src.trd_cur_proc_amt());
			dest.pay_onr_prov_amt(src.trd_cur_onr_prov_amt());
		}
		
		protected void setLogKey(MCList<PaySchd_HdrR> upHdrL) {
			for (PaySchd_HdrR upHdrR : upHdrL) {
				upHdrR.setParamIndex(_paramIndex);
			}
			_logger.setLogKey(upHdrL, MST_PAY_SCHD_CL_BR_R.$batch_log_no, MST_PAY_SCHD_CL_BR_R.$log_sub_key1, MST_PAY_SCHD_CL_BR_R.$log_sub_key2);
		}
		
		/**
		 * 支払予定登録サービスのロック処理を実行する。
		 * @param upHdrL 支払予定登録の上り電文（支払照合ヘッダ）
		 */
		protected void callPaySchdRegServiceLock(MCList<PaySchd_HdrR> upHdrL) {
			if (isNull(upHdrL)) {
				return ;
			}
			
			MSBHL_PaySchdRegService.PaySchd_Lock_Upd01 ope = MSBHL_PaySchdRegService.crtPaySchd_Lock_Upd01();
			
			for (PaySchd_HdrR upHdrR : upHdrL) {
				
				MST_PAY_SCHD_LOCK_R cndR = MST_PAY_SCHD_LOCK_R.create();
				
				cndR.bsppl_cd(upHdrR.bsppl_cd());
				cndR.bsppl_dpt_cd(upHdrR.bsppl_dpt_cd());
				cndR.purc_act_no(upHdrR.purc_act_no());
				cndR.rcpt_iv_mng_no(upHdrR.rcpt_iv_mng_no());
				cndR.rcpt_iv_no(upHdrR.rcpt_iv_no());
				cndR.wrk_no(upHdrR.wrk_no());
				cndR.trd_cur_cd(upHdrR.trd_cur_cd());
				
				ope.up0().add(cndR);
			}
			
			ope.exec();
		}
		
		/**
		 * 支払予定登録サービスの消費税差額調整を実行し、消費税差額に対応するの電文を作成する。
		 * @param upPaySchdL 支払予定登録の上り電文（支払予定）
		 * @param tgtApDL 支払予定登録の上り電文（支払予定）
		 * @param upDtlActL 支払予定登録の上り電文（支払予定：支払実績）
		 * @param upAdvPayActL 支払予定登録の上り電文（支払予定：前渡金実績）
		 * @param taxDiffL 支払予定登録の上り電文（支払予定：消費税差額）
		 */
		protected void callPaySchdRegServiceSrch05(MCList<PaySchd_DtlApdR> upApDL, 
				MCList<MST_AP_D_R> tgtApDL, MCList<PaySchd_DtlActR> upDtlActL, 
				MCList<PaySchd_AdvPayActR> upAdvPayActL, MCList<MST_AP_D_R> taxApDL) {
			if (isNull(tgtApDL)) {
				return ;
			}
			
			MAM_BP_R bspplR = getBspplR();
			MCIndexKey actIdx = upDtlActL.createIndex(PaySchd_DtlActR.$hdr_peg_no);
			MCIndexKey advPayActIdx = upAdvPayActL.createIndex(PaySchd_AdvPayActR.$hdr_peg_no);
			
			MSBHL_PaySchdRegService.PaySchd_Srch05 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch05();
			
			for (MST_AP_D_R apDR : tgtApDL) {
				if (apDR.getBooleanNE(ERR_FLG_COL)) {
					continue;
				}
				// 支払税計算=OFF かつ 基準通貨換算しない場合は、税差額計算対象外
				if (!bspplR.tax_on_pay_flg() && isSame(apDR.trd_cur_cd(), getCo().base_cur_cd())) {
					continue;
				}
				PaySchd_Srch05_CndR cndR = PaySchd_Srch05_CndR.create();
				
				cndR.hdr_peg_no(apDR.getNumberNE(HDR_PEG_NO_COL));
				cndR.ap_d_no(apDR.ap_d_no());
				if (apDR.repurc_obli_flg()) {
					cndR.trd_cur_amt(apDR.trd_cur_proc_amt());
				}
				else {
					cndR.trd_cur_amt(apDR.trd_cur_amt());
				}
				cndR.trd_cur_tax_amt(apDR.trd_cur_tax_amt());
				cndR.base_cur_tax_amt(apDR.base_cur_amt());
				cndR.pay_xrate(apDR.getNumberNE(PaySchd_Srch05_CndR.$pay_xrate));
				cndR.xrate_base_dt(apDR.getDateNE(PaySchd_Srch05_CndR.$xrate_base_dt));
				cndR.setAttributes(apDR);
				
				ope.up0().add(cndR);
				MCList<PaySchd_DtlActR> cndActL = upDtlActL.subList(actIdx, cndR.hdr_peg_no());
				if (!isNull(cndActL) && !cndActL.isEmpty()) {
					MCList<PaySchd_Srch03_CndPayActR> opeUp1L = MCList.create(PaySchd_Srch03_CndPayActR.class);
					addAll(opeUp1L, cndActL, createMap_PaySchd_Srch03_CndPayActR_PaySchd_DtlActR());
					opeUp1L.forEach(r -> {
						r.pay_xrate(cndR.pay_xrate());
						r.xrate_base_dt(cndR.xrate_base_dt());
					});
					ope.up1().addAll(opeUp1L);
				}
				MCList<PaySchd_AdvPayActR> cndAdvPayActL = upAdvPayActL.subList(advPayActIdx, cndR.hdr_peg_no());
				if (!isNull(cndAdvPayActL) && !cndAdvPayActL.isEmpty()) {
					MCList<PaySchd_Srch03_CndAdvPayActR> opeUp2L = MCList.create(PaySchd_Srch03_CndAdvPayActR.class);
					addAll(opeUp2L, cndAdvPayActL, createMap_PaySchd_Srch03_CndAdvPayActR_PaySchd_AdvPayActR());
					opeUp2L.forEach(r -> {
						r.pay_xrate(cndR.pay_xrate());
						r.xrate_base_dt(cndR.xrate_base_dt());
					});
					ope.up2().addAll(opeUp2L);
				}
			}
			
			ope.exec();
			
			for (PaySchd_Srch05_RsltR r : ope.down0()) {
				PaySchd_DtlApdR upApDR = PaySchd_DtlApdR.create();
				MST_AP_D_R apDR = r.ap_d();
				apDR.setNumberNE(HDR_PEG_NO_COL, r.hdr_peg_no());
				copyPaySchd_DtlApdR_MST_AP_D_R(upApDR, apDR);
				upApDR.ref_ap_d_no(r.ref_ap_d_no());
				upApDL.add(upApDR);
				taxApDL.add(apDR);
			}
			
		}
		/**
		 * 支払予定登録サービスの支払実績取得を行う。
		 * @param upHdrL 支払予定登録の上り電文（支払予定：支払照合ヘッダ）
		 * @param upDtlActL 支払予定登録の上り電文（支払予定：支払実績）
		 */
		protected void callPaySchdRegServiceSrch07(MCList<PaySchd_HdrR> upHdrL, MCList<PaySchd_DtlActR> upDtlActL) {
			if (isNull(upHdrL)) {
				return ;
			}
			MSBHL_PaySchdRegService.PaySchd_Srch07 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch07();

			for (PaySchd_HdrR r : upHdrL) {
				PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();

				cndR.hdr_peg_no(r.hdr_peg_no());
				cndR.bsppl_cl_dt(r.bsppl_cl_dt());
				cndR.bsppl_cd(r.bsppl_cd());
				cndR.bsppl_dpt_cd(r.bsppl_dpt_cd());
				cndR.trd_cur_cd(r.trd_cur_cd());
				cndR.pay_spot_flg(false);
				cndR.reg_only_flg(false);
				cndR.setAttributes(r);
				ope.up0().add(cndR);
			}

			ope.exec();
			
			for (PaySchd_Srch07_RsltR r : ope.down0()) {
				PaySchd_DtlActR upActR = PaySchd_DtlActR.create();
				upActR.hdr_peg_no(r.hdr_peg_no());
				upActR.pay_act_d_no(r.pay_act_d_no());
				upActR.pay_act_d_seq(r.pay_act_d_seq());
				upDtlActL.add(upActR);
			}
		}
		/**
		 * 支払予定登録サービスの支払実績取得を行う。
		 * @param upHdrL 支払予定登録の上り電文（支払予定：支払照合ヘッダ）
		 * @param upAdvPayActL 支払予定登録の上り電文（支払予定：前渡金実績）
		 */
		protected void callPaySchdRegServiceSrch08(MCList<PaySchd_HdrR> upHdrL, MCList<PaySchd_AdvPayActR> upAdvPayActL) {
			if (isNull(upHdrL)) {
				return ;
			}
			MSBHL_PaySchdRegService.PaySchd_Srch08 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch08();
			
			String[] gpColumn = new String[] {
					PaySchd_HdrR.$bsppl_cd,
					PaySchd_HdrR.$bsppl_dpt_cd,
					PaySchd_HdrR.$trd_cur_cd
			};
			MCIndexKey idx = upHdrL.createIndex(gpColumn);
			
			for (PaySchd_HdrR r : upHdrL) {
				PaySchd_HdrR tgtRow= upHdrL.getFirst(idx, r.bsppl_cd(), r.bsppl_dpt_cd(), r.trd_cur_cd());
				PaySchd_Srch07_CndR cndR = PaySchd_Srch07_CndR.create();
				cndR.hdr_peg_no(tgtRow.hdr_peg_no());
				cndR.bsppl_cl_dt(tgtRow.bsppl_cl_dt());
				cndR.bsppl_cd(tgtRow.bsppl_cd());
				cndR.bsppl_dpt_cd(tgtRow.bsppl_dpt_cd());
				cndR.trd_cur_cd(tgtRow.trd_cur_cd());
				cndR.pay_spot_flg(false);
				cndR.reg_only_flg(false);
				cndR.setAttributes(tgtRow);
				ope.up0().add(cndR);
			}

			ope.exec();
			
			for (PaySchd_Srch08_RsltR r : ope.down0()) {
				PaySchd_AdvPayActR advPayActR = PaySchd_AdvPayActR.create();
				advPayActR.hdr_peg_no(r.hdr_peg_no());
				advPayActR.adv_pay_act_no(r.adv_pay_act_no());
				advPayActR.adv_pay_act_seq(r.adv_pay_act_seq());
				upAdvPayActL.add(advPayActR);
			}
		}
		
		/**
		 * 支払予定登録サービスの金額按分を実行し、支払予定登録サービスの支払予定登録の電文を作成する。
		 * @param upHdrL 支払予定登録の上り電文（支払照合ヘッダ）
		 * @param upPaySchdL 支払予定登録の上り電文（支払予定）
		 * @param tgtApDL 支払予定作成対象の買掛明細
		 */
		protected void callPaySchdRegServiceSrch01(MCList<PaySchd_HdrR> upHdrL, 
				MCList<PaySchd_DtlSchdR> upPaySchdL, MCList<MST_AP_D_R> tgtApDL, MCList<MST_AP_D_R> taxApDL) {
			
			MSBHL_PaySchdRegService.PaySchd_Srch01 ope = MSBHL_PaySchdRegService.crtPaySchd_Srch01();
			
			MCList<MST_AP_D_R> tmpApDL = MCList.create(MST_AP_D_R.class);
			tmpApDL.addAll(tgtApDL);
			tmpApDL.addAll(taxApDL);
			MCIndexKey hdrRIdxkey = upHdrL.createIndex(PaySchd_HdrR.$hdr_peg_no);
			
			for (MST_AP_D_R apDR : tmpApDL) {
				if (apDR.getBooleanNE(ERR_FLG_COL)) {
					continue;
				}
				
				PaySchd_Srch01_CndR cndR = PaySchd_Srch01_CndR.create();
				
				PaySchd_HdrR upHdrR = upHdrL.getFirst(hdrRIdxkey, apDR.getNumberNE(HDR_PEG_NO_COL));
				cndR.hdr_peg_no(apDR.getNumberNE(HDR_PEG_NO_COL));
				cndR.ap_d_no(apDR.ap_d_no());
				cndR.sppl_cd(apDR.sppl_cd());
				cndR.asppl_cd(apDR.asppl_cd());
				cndR.bsppl_cd(apDR.bsppl_cd());
				cndR.bsppl_dpt_cd(apDR.bsppl_dpt_cd());
				cndR.ap_dpt_cd(apDR.ap_dpt_cd());
				cndR.trd_ptn_typ(apDR.trd_ptn_typ());
				cndR.itm_cd(apDR.itm_cd());
				cndR.itm_sub1(apDR.itm_sub1());
				cndR.itm_sub2(apDR.itm_sub2());
				cndR.itm_sub3(apDR.itm_sub3());
				cndR.trd_cur_cd(apDR.trd_cur_cd());
				cndR.ac_dt(apDR.ac_dt());
				cndR.pay_basis_dt(apDR.pay_basis_dt());
				cndR.pay_schd_dt(apDR.pay_schd_dt());
				cndR.bsppl_cl_dt(upHdrR.bsppl_cl_dt());
				cndR.ap_typ(apDR.ap_typ());
				cndR.trd_cur_amt(apDR.trd_cur_amt());
				cndR.trd_cur_tax_amt(apDR.trd_cur_tax_amt());
				cndR.wtax_amt(apDR.wtax_amt());
				cndR.is_ref_xrate(true);
				cndR.zero_flg(true);
				cndR.base_dt(up0().tgt_dt()); // バッチの場合、登録日はバッチの処理日とする
				cndR.setAttributes(apDR);
				
				ope.up0().add(cndR);
			}
			
			ope.exec();
			
			HashSet<MCNumber> errSet = new HashSet<>();
			MCList<PaySchd_Srch01_RsltR> errPayDptL = MCList.create(PaySchd_Srch01_RsltR.class);
			
			for(PaySchd_Srch01_RsltR srch01RsltR : ope.down1()) {
				
				if (isNull(srch01RsltR.pay_schd_dt()) || isNull(srch01RsltR.pay_dpt_cd())) {
					errSet.add(srch01RsltR.hdr_peg_no());
					errPayDptL.add(srch01RsltR);
					continue;
				}
				
				PaySchd_DtlSchdR upPaySchdR = PaySchd_DtlSchdR.create();
				
				upPaySchdR.hdr_peg_no(srch01RsltR.hdr_peg_no());
				upPaySchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				upPaySchdR.asppl_cd(srch01RsltR.asppl_cd());
				upPaySchdR.ap_dpt_cd(srch01RsltR.ap_dpt_cd());
				upPaySchdR.pay_dpt_cd(srch01RsltR.pay_dpt_cd());
				upPaySchdR.ap_typ(srch01RsltR.ap_typ());
				upPaySchdR.ap_sttl_cd(srch01RsltR.ap_sttl_cd());
				upPaySchdR.ap_sttl_typ(srch01RsltR.ap_sttl_typ());
				upPaySchdR.pay_schd_dt(srch01RsltR.pay_schd_dt());
				upPaySchdR.pay_bank_ac_cd(srch01RsltR.pay_bank_ac_cd());
				upPaySchdR.bank_ac_cd(srch01RsltR.bank_ac_cd());
				upPaySchdR.ap_setoff_typ(srch01RsltR.ap_setoff_typ());
				upPaySchdR.setoff_cd(srch01RsltR.setoff_cd());
				upPaySchdR.setoff_nm(srch01RsltR.setoff_nm());
				upPaySchdR.so_dpt_cd(srch01RsltR.so_dpt_cd());
				upPaySchdR.trd_cur_amt(srch01RsltR.trd_cur_amt());
				upPaySchdR.trd_cur_com_paid_tax_cd(srch01RsltR.trd_cur_com_paid_tax_cd());
				upPaySchdR.xrate(srch01RsltR.xrate());
				
				upPaySchdL.add(upPaySchdR);
			}
			
			for (PaySchd_Srch01_CndR down0R : ope.down0()) {
				if (down0R.err_flg()) {
					errSet.add(down0R.hdr_peg_no());
				}
			}
			
			if (!errSet.isEmpty()) {
				MCIndexKey hdrIdxkey = upHdrL.createIndex(PaySchd_HdrR.$hdr_peg_no);
				MCIndexKey tmpIdxkey = tmpApDL.createIndex(HDR_PEG_NO_COL);
				MCIndexKey payDptKey = errPayDptL.createIndex(PaySchd_Srch01_RsltR.$hdr_peg_no, PaySchd_Srch01_RsltR.$pay_dpt_cd);
				
				for (MCNumber hdrPegNo : errSet) {
					PaySchd_HdrR hdrR = upHdrL.getFirst(hdrIdxkey, hdrPegNo);
					hdrR.err_flg(true);
					for (MST_AP_D_R apDR : tmpApDL.subList(tmpIdxkey, hdrPegNo)) {
						apDR.setBooleanNE(ERR_FLG_COL, true);
					}
					MCList<PaySchd_Srch01_RsltR> errPayDptSubL = errPayDptL.subList(payDptKey, hdrPegNo, null);
					if (!isNull(errPayDptSubL)) {
						for (PaySchd_Srch01_RsltR errR : errPayDptSubL.distinctNE(PaySchd_Srch01_RsltR.$pay_schd_dt)) {
							if (isNull(errR.pay_schd_dt())) {
								MCMessagePool.add(new MCMessage(hdrR, null, MSBHL0033, up0().bsppl_cd(), toDispGUIIndex(hdrR)));
							}
							else {
								MCMessagePool.add(new MCMessage(hdrR, null, MSBHL0034, getBspplR().psppl_cd(), toYMDString(errR.pay_schd_dt()), toDispGUIIndex(hdrR)));
							}
						}
					}
				}
			}
		}
		
		/**
		 * 支払予定登録バッチ結果確認を登録する
		 */
		protected void insPaySchdClBr(MCList<PaySchd_HdrR> upHdrL) {
			if (isNull(upHdrL)) {
				_logger.writeDataLog(MCMessagePool.getMessageList());
				return ;
			}
			
			_logger.writeDataLog(MCMessagePool.getMessageList());
			
			MCList<MST_PAY_SCHD_CL_BR_R> brL = MCList.create(MST_PAY_SCHD_CL_BR_R.class);
			
			doSeqCache(MAC_NUM_SYS_TYP.BATCH_DATA, upHdrL.size());
			
			for (PaySchd_HdrR upHdrR : upHdrL) {
				MST_PAY_SCHD_CL_BR_R tmpR = MST_PAY_SCHD_CL_BR_R.create();
				
				tmpR.batch_data_no(getStrSeq(MAC_NUM_SYS_TYP.BATCH_DATA));
				tmpR.batch_log_no(upHdrR.getStringNE(MST_PAY_SCHD_CL_BR_R.$batch_log_no));
				tmpR.log_sub_key1(upHdrR.getNumberNE(MST_PAY_SCHD_CL_BR_R.$log_sub_key1));
				tmpR.log_sub_key2(upHdrR.getNumberNE(MST_PAY_SCHD_CL_BR_R.$log_sub_key2));
				tmpR.bsppl_cd(upHdrR.bsppl_cd());
				tmpR.bsppl_dpt_cd(upHdrR.bsppl_dpt_cd());
				tmpR.wrk_no(upHdrR.wrk_no());
				tmpR.trd_cur_cd(upHdrR.trd_cur_cd());
				tmpR.bsppl_cl_dt(upHdrR.bsppl_cl_dt());
				tmpR.exe_sts_typ(upHdrR.err_flg() ? MAC_EXE_STS_TYP.ERR.value() : MAC_EXE_STS_TYP.OK.value());
				
				brL.add(tmpR);
			}
			MCQueryApiBuilder brL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_CL_BR_R.create("T"));
			dbInsertEx("MSBHB0010_MST_PAY_SCHD_CL_BR_I01", brL, brL_bldr);
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown(MCList<MST_AP_D_R> allApDL) {
			MCList<MST_AP_D_R> errApDL = allApDL.subList(r->r.getBooleanNE(ERR_FLG_COL));
			down0().success_cnt(allApDL.size() - errApDL.size());
			down0().error_cnt(errApDL.size());
			down0().total_cnt(allApDL.size());
		}
		
	}
	protected Map_PaySchd_Srch03_CndPayActR_PaySchd_DtlActR<PaySchd_Srch03_CndPayActR,PaySchd_DtlActR> createMap_PaySchd_Srch03_CndPayActR_PaySchd_DtlActR() {
		return new Map_PaySchd_Srch03_CndPayActR_PaySchd_DtlActR<PaySchd_Srch03_CndPayActR, PaySchd_DtlActR>();
	}
	public class Map_PaySchd_Srch03_CndPayActR_PaySchd_DtlActR<D extends PaySchd_Srch03_CndPayActR, S extends PaySchd_DtlActR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PaySchd_Srch03_CndPayActR.$hdr_peg_no, PaySchd_DtlActR.$hdr_peg_no);
			addColumnPathMap(PaySchd_Srch03_CndPayActR.$pay_act_d_no, PaySchd_DtlActR.$pay_act_d_no);
			addColumnPathMap(PaySchd_Srch03_CndPayActR.$pay_act_d_seq, PaySchd_DtlActR.$pay_act_d_seq);
		}
	}
	protected Map_PaySchd_Srch03_CndAdvPayActR_PaySchd_AdvPayActR<PaySchd_Srch03_CndAdvPayActR,PaySchd_AdvPayActR> createMap_PaySchd_Srch03_CndAdvPayActR_PaySchd_AdvPayActR() {
		return new Map_PaySchd_Srch03_CndAdvPayActR_PaySchd_AdvPayActR<PaySchd_Srch03_CndAdvPayActR, PaySchd_AdvPayActR>();
	}
	public class Map_PaySchd_Srch03_CndAdvPayActR_PaySchd_AdvPayActR<D extends PaySchd_Srch03_CndAdvPayActR, S extends PaySchd_AdvPayActR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PaySchd_Srch03_CndAdvPayActR.$hdr_peg_no, PaySchd_AdvPayActR.$hdr_peg_no);
			addColumnPathMap(PaySchd_Srch03_CndAdvPayActR.$adv_pay_act_no, PaySchd_AdvPayActR.$adv_pay_act_no);
			addColumnPathMap(PaySchd_Srch03_CndAdvPayActR.$adv_pay_act_seq, PaySchd_AdvPayActR.$adv_pay_act_seq);
		}
	}

	//FMCB CUSTOM END
}