package mcframe.serverMSBG.MSBGB0090;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverMSBG.MSBGB0090.Query.*;
import mcframe.commonFXUC.FXUCC0030.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverMSBG.MSBGL5020.*;
import mcframe.serverMAUC.MAUCL1060.*;
import mcframe.serverMSBI.MSBIL5010.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGB_RcvAutoAppl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGB_RcvAutoAppl_MC extends MSBGB_RcvAutoAppl_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSBGB_RcvAutoAppl> CLAZZ = MSBGB_RcvAutoAppl.class;
	
	/**
	 * RcvAutoAppl_Upd01オペレーション.<p>
	 *
	 */
	public class RcvAutoAppl_Upd01 extends MSBGB_RcvAutoAppl_MC_A.RcvAutoAppl_Upd01 {
		
		/** 対象件数 */
		protected int _totalCnt;
		/** エラー件数 */
		protected int _errorCnt;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;

		/** 金額一致で完了した件数 */
		protected int _cmplCnt;
		/** 手数料込で完了した件数 */
		protected int _cmplIncCompCnt;
		/** 過入金で完了した件数 */
		protected int _cmplOverCnt;
		/** 入金額不足で完了した件数 */
		protected int _cmplShortCnt;
		/** 自動消込不可件数 */
		protected int _notApplCnt;

		
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
			logger().writeStartLog(MSBGL0106);
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
			logger().writeEndLog(MSBGL0107,
					_totalCnt, _cmplCnt, _cmplIncCompCnt, _cmplOverCnt,
					_cmplShortCnt, _notApplCnt, _errorCnt);
			pushEndLog(logger());
		}
		
		/**
		 * 入金自動消込のメイン処理
		 */
		protected void execMain() {
			
			_totalCnt = 0;
			_errorCnt = 0;
			_cmplCnt = 0;
			_cmplIncCompCnt = 0;
			_cmplOverCnt = 0;
			_cmplShortCnt = 0;
			_notApplCnt = 0;

			if (!checkRcvCl()) {
				return;
			}
			
			MCList<MST_RCV_R> rcstL = getRcstL();
			rcstL.sort(MST_RCV_R.$rcst_cd);

			List<MSBGB_RcvAutoAppl.RcvAutoAppl_Upd02> opeL = new ArrayList<>();
			for (MCList<RcvAutoAppl_Upd02_CndR> cndL : splitTgt(rcstL)) {
				MSBGB_RcvAutoAppl.RcvAutoAppl_Upd02 ope = MSBGB_RcvAutoAppl.crtRcvAutoAppl_Upd02();
				ope.up0().addAll(cndL);
				opeL.add(ope);
			}
			
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}

			for (MSBGB_RcvAutoAppl.RcvAutoAppl_Upd02 ope : opeL) {
				for (RcvAutoAppl_Upd02_RsltR downR : ope.down0()) {
					_totalCnt += downR.total_cnt().intValue();
					_errorCnt += downR.error_cnt().intValue();
					
					_cmplCnt += downR.cmpl_cnt().intValue();
					_cmplIncCompCnt += downR.cmpl_inc_comp_cnt().intValue();
					_cmplOverCnt += downR.cmpl_over_cnt().intValue();
					_cmplShortCnt += downR.cmpl_short_cnt().intValue();
					_notApplCnt += downR.not_appl_cnt().intValue();
				}
			}
		}
		
		protected boolean checkRcvCl() {
			// 運用日付に対し入金締チェックを行う
			MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
			cndR.ac_dt(getToday());
			cndR.rcv_cls_chk_flg(true);
			op.up0().add(cndR);
			op.exec();
			
			if (op.down0().get(0).err_flg()) {
				logger().writeProcessLog(MCMessagePool.getMessageList());
				return false;
			}
			
			return true;
		}
		
		/**
		 * 入金先取得<br />
		 * 
		 * 入金先を取得する
		 * 
		 * @return 入金情報
		 */
		protected MCList<MST_RCV_R> getRcstL() {

			MCList<MST_RCV_R> l = MCList.create(MST_RCV_R.class);
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);

			l_bldr.setWhere(value(0).lt(t.not_proc_bal));
			l_bldr.addWhereWithAnd(t.dat_typ.eq(value(MSC_RCV_DAT_TYP.RCV.value())));
			l_bldr.addWhereWithAnd(t.rcv_auto_appl_tgt_flg.eq(value(true)));
			l_bldr.addWhereWithAnd(t.auto_appl_sts_typ.neq(value(MSC_AUTO_APPL_STS_TYP.EXCLD.value()))); 
			l_bldr.setGroupBy(t.rcst_cd);
			dbSelect("MSBGB0090_MST_RCV_S01", l, l_bldr);
			
			return l;
		}
		
		/**
		 * スレッドサイズを考慮して上り電文を分割する
		 * @param list
		 * @return
		 */
		protected List<MCList<RcvAutoAppl_Upd02_CndR>> splitTgt(MCList<MST_RCV_R> list) {
			List<MCList<RcvAutoAppl_Upd02_CndR>> ret = new ArrayList<>();
			if (list.isEmpty()) {
				return ret;
			}
			int max = getThreadBatchSize(list.size());
			MCList<RcvAutoAppl_Upd02_CndR> tmp = MCList.create(RcvAutoAppl_Upd02_CndR.class);
			for (MST_RCV_R row : list) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(RcvAutoAppl_Upd02_CndR.class);
				}
				RcvAutoAppl_Upd02_CndR cndR = RcvAutoAppl_Upd02_CndR.create();
				cndR.rcst_cd(row.rcst_cd());
				tmp.add(cndR);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}

	/**
	 * RcvAutoAppl_Upd02オペレーション.<p>
	 *
	 */
	public class RcvAutoAppl_Upd02 extends MSBGB_RcvAutoAppl_MC_A.RcvAutoAppl_Upd02 {

		/** 対象件数 */
		protected int _totalCnt;
		/** 金額一致で完了した件数 */
		protected int _cmplCnt;
		/** 手数料込で完了した件数 */
		protected int _cmplIncCompCnt;
		/** 過入金で完了した件数 */
		protected int _cmplOverCnt;
		/** 入金額不足で完了した件数 */
		protected int _cmplShortCnt;
		/** 自動消込不可件数 */
		protected int _notApplCnt;
		/** エラー件数 */
		protected int _errorCnt;

		/** 処理対象の入金ＤＢコンテナ */
		protected MCList<MST_RCV_R> _rcvL = MCList.create(MST_RCV_R.class);
		protected MST_RCV_R _rcvL_t = MST_RCV_R.create("T");
		protected MCQueryApiBuilder _rcvL_bldr = MCQueryApiBuilder.create(_rcvL_t);

		protected final String _INCL_COM_PAID = "incl_com_paid";

		protected final String _SCHD_APPL_AMT = "schd_appl_amt";

		protected MCRowMatcher<MST_RCV_R> _rcvComPaidMatcher = createRcvComPaidMatcher();

		protected MCRowMatcher<MST_RCV_R> _rcvSpecifiedComPaidMatcher = createSpecifiedRcvComPaidMatcher();

		// 税マスタのキャッシュ
		protected FXUCL_MCDbcCache<MAM_TAX_R> _taxL;

		// 取引先マスタのキャッシュ
		protected FXUCL_MCDbcCache<MAM_BP_R> _rcstL;

		MCList<RcvAutoAppl_Upd02_Appl_BillDR> _noDtlApplBillDL = null;

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
				execMain();
				setDown();
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
		 * 下り電文を設定する
		 */
		protected void setDown() {
			RcvAutoAppl_Upd02_RsltR downR = RcvAutoAppl_Upd02_RsltR.create();
			downR.total_cnt(_totalCnt);
			downR.error_cnt(_errorCnt);
			downR.cmpl_cnt(_cmplCnt);
			downR.cmpl_inc_comp_cnt(_cmplIncCompCnt);
			downR.cmpl_over_cnt(_cmplOverCnt);
			downR.cmpl_short_cnt(_cmplShortCnt);
			downR.not_appl_cnt(_notApplCnt);
			down0().add(downR);
		}

		/**
		 * メイン処理を実行する
		 */
		protected void execMain() {
			_totalCnt = 0;
			_cmplCnt = 0;
			_cmplIncCompCnt = 0;
			_cmplOverCnt = 0;
			_cmplShortCnt = 0;
			_notApplCnt = 0;
			_errorCnt = 0;

			srchRcv();
			callRcvApplMain();
		}

		/**
		 * 処理対象の入金情報を検索する
		 */
		protected void srchRcv() {
			setSelect();
			doSrch();
		}

		/**
		 * 検索処理を実行する
		 */
		protected void doSrch() {
			// ロックを取得した状態から処理を開始
			dbSelectForUpdate("MSBGB0090_MST_RCV_S02", _rcvL, _rcvL_bldr, up0());
			lockNote();
			// 振込手数料込みとする場合にtrueにする。後からの処理で使用するのでカラムを追加しておく。
			_rcvL.addBooleanColumn(_INCL_COM_PAID, false);
		}

		/**
		 * 入金を検索するためのSELECT文を設定する
		 */
		protected void setSelect() {
			MST_NOTE_R t2 = MST_NOTE_R.create("T2");

			_rcvL_bldr.addLeftOuterJoin(t2, bracket(_rcvL_t.note_mng_no.eq(t2.note_mng_no)));
			_rcvL_bldr.setWhere(value(0).lt(_rcvL_t.not_proc_bal));
			_rcvL_bldr.addWhereWithAnd(_rcvL_t.rcst_cd.eq(bind("rcst_cd")));
			_rcvL_bldr.addWhereWithAnd(_rcvL_t.dat_typ.eq(value(MSC_RCV_DAT_TYP.RCV.value())));
			_rcvL_bldr.addWhereWithAnd(_rcvL_t.rcv_auto_appl_tgt_flg.eq(value(true)));
			_rcvL_bldr.addWhereWithAnd(_rcvL_t.auto_appl_sts_typ.neq(value(MSC_AUTO_APPL_STS_TYP.EXCLD.value())));
			_rcvL_bldr.addSelect(t2.note_no);
			_rcvL_bldr.setLockTable(_rcvL_t.rcv_no);
			_rcvL_bldr.setOrderByAsc(_rcvL_t.bcst_cd, _rcvL_t.trd_cur_cd,
					_rcvL_t.auto_appl_basis_dt, _rcvL_t.rcv_dt, _rcvL_t.rcv_typ,
					_rcvL_t.rcv_mtd_cd, _rcvL_t.rcv_no);
		}

		protected void lockNote() {
			MCList<MST_NOTE_R> noteBindL = MCList.create(MST_NOTE_R.class);
			for (MST_RCV_R rcvR : _rcvL) {
				if (!isNull(rcvR.note_mng_no())) {
					MST_NOTE_R tmp = MST_NOTE_R.create();
					tmp.note_mng_no(rcvR.note_mng_no());
					noteBindL.add(tmp);
				}
			}
			if (!noteBindL.isEmpty()) {
				MST_NOTE_R t = MST_NOTE_R.create("T");
				MCQueryApiBuilder noteBuilder = MCQueryApiBuilder.create(t);
				noteBuilder.setSelect(t.note_mng_no);
				noteBuilder.setOrderByAsc(t.note_mng_no);
				dbSelectKeyForUpdateNoFetch("MSBGB0090_MST_NOTE_S01", noteBuilder, noteBindL);
			}
		}
		
		/**
		 * 入金自動消込メイン処理
		 */
		protected void callRcvApplMain() {

			MCList<MST_RCV_R> rcstGrp = _rcvL.groupBy(MST_RCV_R.$rcst_cd,
					MST_RCV_R.$bcst_cd, MST_RCV_R.$bill_dpt_cd, MST_RCV_R.$trd_cur_cd);

			rcstGrp.sort(MST_RCV_R.$bill_dpt_cd, MST_RCV_R.$bcst_cd, MST_RCV_R.$rcst_cd, MST_RCV_R.$trd_cur_cd);
			
			MCIndexKey key = _rcvL.createIndex(MST_RCV_R.$rcst_cd,
					MST_RCV_R.$bcst_cd, MST_RCV_R.$bill_dpt_cd, MST_RCV_R.$trd_cur_cd);
			
			crtRcstCache();

			for (MST_RCV_R grpR : rcstGrp) {
				MCSavepoint sp = dbTran().setSavepoint();
				MCList<MST_RCV_R> rcvAutoApplL = MCList.create(MST_RCV_R.class);

				// 入金先、請求先、請求部門が全てＮＵＬＬ
				if (isNull(grpR.rcst_cd()) && isNull(grpR.bcst_cd()) && isNull(grpR.bill_dpt_cd())) {
					continue;
				}
				// ここを通るのは以下のパターン
				// 入金先：設定あり、請求先：設定なし、請求部門：設定なし
				// 入金先：設定あり、請求先：設定あり、請求部門：設定なし
				// 入金先：設定あり、請求先：設定あり、請求部門：設定あり
				else {
					rcvAutoApplL = _rcvL.subList(key,
							grpR.rcst_cd(), grpR.bcst_cd(), grpR.bill_dpt_cd(), grpR.trd_cur_cd());
				}
				MAM_BP_R rcstR = getRcstCache(grpR.rcst_cd());

				try {
					// 処理対象件数
					_totalCnt = _totalCnt + rcvAutoApplL.size();
					rcvApplMain(rcvAutoApplL, rcstR, grpR.trd_cur_cd());
				}
				catch (MCAppException e) {
					logger().writeDataLog(MSBGL0105, grpR.rcst_cd());
					logger().writeProcessLog(e.getMCMessage());

					dbTran().rollback(sp);
					_errorCnt = _errorCnt + rcvAutoApplL.size();
					continue;
				}
				dbTran().commit();
			}
		}

		/**
		 * 入金自動消込のメイン処理<br />
		 * <li>入金１レコード毎にマッチング処理を実行して消し込む</li>
		 * <li>同じ入金方法の入金を集約してマッチング処理を実行して消し込む</li>
		 * <li>すべての入金を集約してマッチング処理を実行して消し込む</li>
		 * 
		 * @param rcvAutoApplL
		 * @param rcstR
		 * @param curCd
		 */
		protected void rcvApplMain(MCList<MST_RCV_R> rcvAutoApplL, MAM_BP_R rcstR, String curCd) {

			/*******************************/
			/* 入金1レコードでのマッチング */
			/*******************************/
			// 入金1レコードで消込できなかったレコード保持用
			MCList<MST_RCV_R> notApplL = MCList.create(MST_RCV_R.class);
			for (MST_RCV_R r : rcvAutoApplL) {
				// 売掛消込予定抽出
				MCList<MST_AR_APPL_SCHD_R> applSchdL = srchApplSchd(
						rcstR, r.rcst_cd(), r.bcst_cd(), r.bill_dpt_cd(),
						r.trd_cur_cd(), r.auto_appl_basis_dt(), r.rcv_mtd_cd());
				if (match(r, applSchdL, rcstR, isRcvSchdAmtByArSttlTyp(rcstR) ? r.rcv_mtd_cd() : null)) {
					continue;
				}
				notApplL.add(r);
			}
			// 入金1レコードで消込できなかったレコード無し
			if (notApplL.isEmpty()) {
				return;
			}

			// 「金種考慮：オフ、金額考慮：オフ」、「金種考慮：オン、金額考慮：オフ」のパターンは複数入金の扱いなし→ここで終了
			// 残っている入金が1件の場合はこれ以降の処理で複数入金を集約しても消込できない→ここで終了
			if (isNotAmtAndArSttlMatch(rcstR) || isArSttlMatch(rcstR) || notApplL.size() == 1) {
				for (MST_RCV_R r : notApplL) {
					_notApplCnt++;
					updRcvAutoApplSts(r, MSC_AUTO_APPL_STS_TYP.NOT_APPL.value());
				}
				return;
			}
			/**ここを通るパターン**/
			/**金種考慮：オン、金額考慮：オン**/
			/**金種考慮：オフ、金額考慮：オン**/
			/**********************************************/
			/* 同じ入金方法の入金を集約してマッチング */
			/**********************************************/
			// 同じ入金方法の入金を集約して消込できなかったレコード保持用
			MCList<MST_RCV_R> notApplSttlL = MCList.create(MST_RCV_R.class);

			// 「金種考慮：オフ、金額考慮：オン」の場合はすべての入金を集約して入金予定とマッチングするため
			// 同じ入金方法の入金を集約してのマッチングは行わない。
			if (isAmtAndArSttlMatch(rcstR)) {
				MCIndexKey arSttlKey = notApplL.createIndex(getArSttlGrpKeys());
				// 入金を入金方法ごとにグループ化した際、MAX(自動消込基準日)の昇順で入金方法をソートしたリスト
				MCList<MST_RCV_R> arSttlGrp = getArSttlGrpL(notApplL);

				for (MST_RCV_R r : arSttlGrp) {
					MCList<MST_RCV_R> arSttlL = notApplL.subList(arSttlKey,
							r.rcv_mtd_cd(), r.rcst_cd(), r.bcst_cd(), 
							r.bill_dpt_cd(), r.trd_cur_cd());

					// 入金方法毎の入金が2件の場合に複数入金を集約してマッチング
					if (1 < arSttlL.size()) {
						// 売掛消込予定抽出
						MCList<MST_AR_APPL_SCHD_R> applSchdL =
								srchApplSchd(rcstR, r.rcst_cd(), r.bcst_cd(), r.bill_dpt_cd(),
										r.trd_cur_cd(), r.auto_appl_basis_dt(), r.rcv_mtd_cd());

						if (match(arSttlL, applSchdL, rcstR,
								isRcvSchdAmtByArSttlTyp(rcstR) ? r.rcv_mtd_cd() : null)) {
							continue;
						}
					}
					notApplSttlL.addAll(arSttlL);
				}
			}
			else {
				/**ここを通るパターン**/
				/**金種考慮：オフ、金額考慮：オン**/
				notApplSttlL.addAll(notApplL);
			}
			// 同じ入金方法の入金を集約して消込できなかったレコード無し
			if (notApplSttlL.isEmpty()) {
				return;
			}
			// 「金種考慮：オフ、金額考慮：オフ」、「金種考慮：オン、金額考慮：オフ」→ここを通らない
			// 「金種考慮：オン、金額考慮：オン」のパターンはすべての入金を集約しない→ここで終了
			// 残っている入金が1件の場合はこれ以降の処理ですべての入金を集約しても消込できない→ここで終了
			if (isAmtAndArSttlMatch(rcstR) || notApplSttlL.size() == 1) {
				for (MST_RCV_R r : notApplSttlL) {
					_notApplCnt++;
					updRcvAutoApplSts(r, MSC_AUTO_APPL_STS_TYP.NOT_APPL.value());
				}
				return;
			}
			/************************************/
			/* すべての入金を集約してマッチング */
			/************************************/
			/**ここを通るパターン**/
			/**金種考慮：オフ、金額考慮：オン**/
			// 売掛消込予定抽出
			MCList<MST_AR_APPL_SCHD_R> applSchdL = srchApplSchd(rcstR, rcstR.bp_cd(),
					notApplSttlL.get(0).bcst_cd(), notApplSttlL.get(0).bill_dpt_cd(), curCd,
					(MCDate)notApplSttlL.max(MST_RCV_R.$auto_appl_basis_dt), null);

			if (match(notApplSttlL, applSchdL, rcstR, null)) {
				// マッチしたら終了
				return;
			}

			// 消込できなかった入金のステータス更新
			for (MST_RCV_R r : notApplSttlL) {
				_notApplCnt++;
				updRcvAutoApplSts(r, MSC_AUTO_APPL_STS_TYP.NOT_APPL.value());
			}
		}

		/**
		 * 売掛消込予定取得<br />
		 * 入金先、請求先、請求部門を条件に売掛消込予定を取得する。<br>
		 * 条件として、以下の点を考慮している。<br>
		 * <li>入金先の金種考慮ＦＬＧがオンの場合、入金方法で絞り込む</li>
		 * <li>請求先が設定されていない場合、入金先から請求先を特定して条件に設定</li>
		 * <li>入金先の金種考慮ＦＬＧがオンの場合、入金方法を絞り込む条件を設定</li>
		 * 
		 * @param r 入金情報
		 * @param rcstR 入金先情報
		 * @return 売掛消込予定リスト
		 */
		protected MCList<MST_AR_APPL_SCHD_R> srchApplSchd(
				MAM_BP_R rcstR, String rcstCd, String bcstCd,
				String billDptCd, String curCd, MCDate maxDt, String rcvMtdCd) {

			MCList<MST_AR_APPL_SCHD_R> srchL =MCList.create(MST_AR_APPL_SCHD_R.class);

			// 請求先が設定されていない場合、入金先から請求先を取得する
			MCList<MAM_BP_R> bcstL = MCList.create(MAM_BP_R.class);
			if (isNull(bcstCd)) {
				bcstL = getBcst(rcstCd);
				// 入金先から請求先が取得できな場合は処理終了
				if (bcstL.isEmpty()) {
					return srchL;
				}
			}

			MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder srchL_bldr = MCQueryApiBuilder.create(t);
			MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
			MST_BILL_R t3 = MST_BILL_R.create("T3");
			srchL_bldr.addSelect(t2.acst_cd);
			srchL_bldr.addSelect(t2.ar_dpt_cd);
			srchL_bldr.addSelect(t2.ar_typ);
			srchL_bldr.addSelect(t3.bcst_cd);
			srchL_bldr.addSelect(t3.bill_dpt_cd);
			srchL_bldr.addSelect(t3.wrk_no);
			srchL_bldr.addSelect(t3.bill_mng_no);
			srchL_bldr.addInnerJoin(t2, bracket(t.bill_acst_no.eq(t2.bill_acst_no)));
			srchL_bldr.addInnerJoin(t3, bracket(t2.bill_mng_no.eq(t3.bill_mng_no)));

			srchL_bldr.setWhere(t.rcv_schd_dt.lte(bind("1")), maxDt);
			if (isNull(bcstCd)) {
				if (bcstL.size() == 1) {
					srchL_bldr.addWhereWithAnd(t3.bcst_cd.eq(bind("1")), bcstL.get(0).bp_cd());
				}
				else {
					srchL_bldr.addWhereInWithAnd(t3.bcst_cd, getBcstInL(bcstL));
				}
			}
			else {
				srchL_bldr.addWhereWithAnd(t3.bcst_cd.eq(bind("1")), bcstCd);
			}
			srchL_bldr.addWhereWithCutOffAnd(t3.bill_dpt_cd.eq(bind("1")), billDptCd);
			srchL_bldr.addWhereWithAnd(t3.trd_cur_cd.eq(bind("1")), curCd);
			srchL_bldr.addWhereWithAnd(t3.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			srchL_bldr.addWhereWithAnd(t.not_appl_bal.neq(value(0)));
			String wtaxSttlCd = MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.WTAX.value()).sttl_cd();
			if (!isNull(wtaxSttlCd)) {
				srchL_bldr.addWhereWithAnd(t.rcv_mtd_cd.neq(bind("1")), wtaxSttlCd);
			}
			if (rcstR.ar_sttl_typ_match_flg()) {
				srchL_bldr.addWhereWithAnd(t.rcv_mtd_cd.eq(bind("1")), rcvMtdCd);
			}
			srchL_bldr.addOrderByAsc(t.rcv_schd_dt, t3.bcst_cd,  t3.bill_dpt_cd, t.rcv_mtd_cd, t.iv_no, t.ar_typ, t.ar_appl_schd_no);
			dbSelectForUpdateNoWait("MSBGB0090_MST_AR_APPL_SCHD_S01", srchL, srchL_bldr);
			return srchL;
		}

		/**
		 * ＩＮ句用の請求先のリスト取得
		 * 
		 * @param bcstL 請求先情報
		 * @return 請求先リスト
		 */
		protected List<String> getBcstInL(MCList<MAM_BP_R> bcstL) {
			List<String> bcstInL = new ArrayList<String>();
			for (MAM_BP_R bcstR : bcstL) {
				bcstInL.add(bcstR.bp_cd());
			}
			return bcstInL;
		}

		/**
		 * 入金予定額を計算する際に指定した入金方法の入金予定額のみ取得する場合はtrue。<br>
		 * すべての入金予定額を合計して取得する場合はfalse。
		 * 
		 * @return 判定結果
		 */
		protected boolean isRcvSchdAmtByArSttlTyp(MAM_BP_R bpR) {
			return isAmtAndArSttlMatch(bpR) || isArSttlMatch(bpR);
		}

		/**
		 * 入金方法、入金先、請求先、請求部門、通貨でグルーピングした入金リスト取得
		 * 
		 * @param rcvL 入金リスト
		 * @return グルーピングした入金リスト
		 */
		protected MCList<MST_RCV_R> getArSttlGrpL(MCList<MST_RCV_R> rcvL) {
			MCList<MST_RCV_R> arSttlGrp = rcvL.groupBy(getRcvCdGroupByPolicy());
			arSttlGrp.sort(MST_RCV_R.$auto_appl_basis_dt);
			return arSttlGrp;
		}

		/**
		 * 入金方法、入金先、請求先、請求部門、通貨のグループポリシー取得
		 * 
		 * @return グループポリシー
		 */
		protected MCGroupByPolicy getRcvCdGroupByPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(getArSttlGrpKeys());
			gp.max(MST_RCV_R.$auto_appl_basis_dt);

			return gp;
		}

		/**
		 * 入金方法、入金先、請求先、請求部門、通貨のグルーピングキー取得
		 * 
		 * @return グルーピングのキー
		 */
		protected String[] getArSttlGrpKeys() {
			return new String[] {
					MST_RCV_R.$rcv_mtd_cd, MST_RCV_R.$rcst_cd, MST_RCV_R.$bcst_cd,
					MST_RCV_R.$bill_dpt_cd, MST_RCV_R.$trd_cur_cd
			};
		}

		/**
		 * 「金種考慮：オフ、金額考慮：オン」の場合true。それ以外の場合false。
		 * 
		 * @param bpR 取引先情報
		 * @return 判定結果
		 */
		protected boolean isAmtMatch(MAM_BP_R bpR) {
			return bpR.rcv_amt_match_flg() && !bpR.ar_sttl_typ_match_flg();
		}

		/**
		 * 「金種考慮：オン、金額考慮：オフ」の場合true。それ以外の場合false。
		 * 
		 * @param bpR 取引先情報
		 * @return 判定結果
		 */
		protected boolean isArSttlMatch(MAM_BP_R bpR) {
			return !bpR.rcv_amt_match_flg() && bpR.ar_sttl_typ_match_flg();
		}

		/**
		 * 「金種考慮：オン、金額考慮：オン」の場合true。それ以外の場合false。
		 * 
		 * @param bpR 取引先情報
		 * @return 判定結果
		 */
		protected boolean isAmtAndArSttlMatch(MAM_BP_R bpR) {
			return bpR.rcv_amt_match_flg() && bpR.ar_sttl_typ_match_flg();
		}

		/**
		 * 「金種考慮：オフ、金額考慮：オフ」の場合true。それ以外の場合false。
		 * 
		 * @param bpR 取引先情報
		 * @return 判定結果
		 */
		protected boolean isNotAmtAndArSttlMatch(MAM_BP_R bpR) {
			return !bpR.rcv_amt_match_flg() && !bpR.ar_sttl_typ_match_flg();
		}

		/**
		 * マッチング処理
		 * 
		 * @param rcvR
		 * @param applSchdL
		 * @param rcstR
		 * @param rcvMtdCd
		 * @return
		 */
		protected boolean match(MST_RCV_R rcvR, MCList<MST_AR_APPL_SCHD_R> applSchdL,
				MAM_BP_R rcstR, String rcvMtdCd) {
			MCList<MST_RCV_R> rcvL = MCList.create(MST_RCV_R.class);
			rcvL.add(rcvR);
			return match(rcvL, applSchdL, rcstR, rcvMtdCd);
		}

		/**
		 * マッチング処理
		 * 
		 * @param rcvL
		 * @param applSchdL
		 * @param rcstR
		 * @param rcvMtdCd
		 * @return
		 */
		protected boolean match(MCList<MST_RCV_R> rcvL,
				MCList<MST_AR_APPL_SCHD_R> applSchdL, MAM_BP_R rcstR, String rcvMtdCd) {

			MCNumber ttlRcvAmt = rcvL.sum(MST_RCV_R.$not_proc_bal);

			// 「金種考慮：オン、金額考慮：オン」、「金種考慮：オフ、金額考慮：オン」
			if (isAmtAndArSttlMatch(rcstR) || isAmtMatch(rcstR)) {
				// 複数入金予定の金額を合計
				MCNumber ttlSchdAmt = MCNumber.ZERO;
				/**********************************************/
				/* 入金予定1レコードでマッチング */
				/**********************************************/
				for (MST_AR_APPL_SCHD_R applSchdR : applSchdL) {
					MCNumber applSchdAmt = getRcvSchdAmt(applSchdR, rcvMtdCd);
					// 複数入金予定の合計予定額
					ttlSchdAmt = ttlSchdAmt.add(applSchdAmt);
					// 金額一致
					if (isSame(ttlRcvAmt, applSchdAmt)) {
						// 「金種考慮：オン、金額考慮：オン」
						if (isAmtAndArSttlMatch(rcstR)) {
							// 入金予定残高 < 入金額 の場合は消込しない
							MCNumber allSchdAmt = getRcvSchdAmtNoSet(applSchdR, null);
							if (allSchdAmt.lt(ttlRcvAmt)) {
								continue;
							}
						}
						applBillD(rcvL, applSchdR, null, MSC_AUTO_APPL_STS_TYP.CMPL.value(), rcstR);
						return true;
					}
					// 手数料込で一致
					else {
						List<MCList<MST_RCV_R>> comPaidL = getComPaidTgt(rcstR, rcvL);
						if (existsComPaidTgt(comPaidL)) {
							MCNumber[] comPaids = getComPaid(rcstR.bp_cd(), rcvL, comPaidL.get(0), comPaidL.get(1),
									applSchdAmt);
							if (!comPaids[0].isZero() || !comPaids[1].isZero()) {
								setInclComPaidFlgTrue(comPaidL);
								applBillD(rcvL, applSchdR, comPaids[0], null, rcstR);
								return true;
							}
						}
					}
				}
				/**********************************************/
				/* 複数入金予定をすべて集約してマッチング */
				/**********************************************/
				if (1 < applSchdL.size()) {
					// 売掛消込予定を集約して金額が一致
					if (isSame(ttlRcvAmt, ttlSchdAmt)) {
						applBillD(rcvL, applSchdL, null, MSC_AUTO_APPL_STS_TYP.CMPL.value(), rcstR);
						return true;
					}
					// 売掛消込予定を集約して手数料込で一致
					else {
						List<MCList<MST_RCV_R>> comPaidL = getComPaidTgt(rcstR, rcvL);
						if (existsComPaidTgt(comPaidL)) {
							MCNumber[] comPaids = getComPaid(rcstR.bp_cd(), rcvL, comPaidL.get(0), comPaidL.get(1),
									ttlSchdAmt);
							if (!comPaids[0].isZero() || !comPaids[1].isZero()) {
								setInclComPaidFlgTrue(comPaidL);
								applBillD(rcvL, applSchdL, comPaids[0], null, rcstR);
								return true;
							}
						}
					}
				}
			}
			// 「金種考慮：オン、金額考慮：オフ」、「金種考慮：オフ、金額考慮：オフ」
			else if (isArSttlMatch(rcstR) || isNotAmtAndArSttlMatch(rcstR)) {
				MCList<MST_AR_APPL_SCHD_R> tgtApplSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
				MCNumber ttlSchdAmt = MCNumber.ZERO;
				/**********************************************/
				/* 対象の入金で消込可能なところまで消しこむ */
				/**********************************************/
				
				// すべての未消込残高の合計
				MCNumber allNotApplBal = applSchdL.sum(MST_AR_APPL_SCHD_R.$not_appl_bal);
				
				if (!isNull(allNotApplBal) && allNotApplBal.gt(0)) {
					for (MST_AR_APPL_SCHD_R applSchdR : applSchdL) {
						MCNumber applSchdAmt = getRcvSchdAmt(applSchdR, rcvMtdCd);
						// 「金種考慮：オン、金額考慮：オフ」の場合は、指定した金種の売掛消込予定があれば消しこむ
						// 「金種考慮：オフ、金額考慮：オフ」の場合は、売掛消込予定があれば消しこむ
						if (!applSchdAmt.isZero()) {
							tgtApplSchdL.add(applSchdR);
							ttlSchdAmt = ttlSchdAmt.add(applSchdAmt);
							// 入金額 ＝＜ 入金予定の合計 となったら終了
							if (ttlSchdAmt.gte(ttlRcvAmt)) {
								break;
							}
						}
					}
					if (!tgtApplSchdL.isEmpty()) {
						// 自動消込状況区分を決定する
						String autoApplStsTyp;
						MCNumber rcvAmt = rcvL.sum(MST_RCV_R.$not_proc_bal);
						MCNumber schdAmt = tgtApplSchdL.sum(_SCHD_APPL_AMT);
						if (isSame(rcvAmt, schdAmt)) {
							autoApplStsTyp = MSC_AUTO_APPL_STS_TYP.CMPL.value();
						}
						else if (rcvAmt.gt(schdAmt)) {
							// 入金額のほうが大きい場合は複数入金予定を消しこんでも入金額があまるので過入金の
							// ステータスとする
							autoApplStsTyp = MSC_AUTO_APPL_STS_TYP.CMPL_OVER.value();
						}
						else {
							// 入金予定額のほうが大きい場合で複数の入金予定を消しこむ場合は、どこかの入金予定
							// の途中まで消しこんで終わる、というパターンなので、入金額不足とする。
							autoApplStsTyp = MSC_AUTO_APPL_STS_TYP.CMPL_SHORT.value();
						}
						applBillD(rcvL, tgtApplSchdL, null, autoApplStsTyp, rcstR);
						return true;
					}
				}
			}
			return false;
		}

		/**
		 * 請求先情報の取得<br />
		 * 入金先ＣＤをもとに、その入金先に属する請求先情報を取得する
		 * 
		 * @param rcstCd 入金先ＣＤ
		 * @return 請求先情報
		 */
		protected MCList<MAM_BP_R> getBcst(String rcstCd) {
			MCList<MAM_BP_R> bcstL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bcstL_bldr = MCQueryApiBuilder.create(t);
			bcstL_bldr.setSelect(t.bp_cd);
			bcstL_bldr.setWhere(t.bcst_flg.eq(value(true)));
			bcstL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
			bcstL_bldr.addWhereWithAnd(t.rcst_cd.eq(bind("1")), rcstCd);
			dbSelect("MSBGB0090_MAM_BP_S01", bcstL, bcstL_bldr);
			return bcstL;
		}

		/**
		 * 入金の更新<br />
		 * 入金の自動消込状況区分、入金自動消込対象ＦＬＧを更新する
		 * 
		 * @param rcvR 入金情報
		 * @param typ 自動消込状況区分
		 */
		protected void updRcvAutoApplSts(MST_RCV_R rcvR, String typ) {
			MST_RCV_R updR = MST_RCV_R.create();
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);
			updR.rcv_no(rcvR.rcv_no());
			updR.auto_appl_sts_typ(typ);
			updR_bldr.setSetVL(t.auto_appl_sts_typ, bindEx("auto_appl_sts_typ"));
			if (isUpdRcvAutoApplTgtFlg(rcvR.rcv_auto_appl_tgt_flg(), typ)) {
				updR.rcv_auto_appl_tgt_flg(true);
				updR_bldr.addSetVL(t.rcv_auto_appl_tgt_flg, bindEx("rcv_auto_appl_tgt_flg"));
			}
			dbUpdateKey("MSBGB0090_MST_RCV_U01", updR, updR_bldr);
		}

		/**
		 * 指定された債権決済区分の入金予定額－入金実績額を取得する。
		 * 引数のapplSchdRに「_SCHD_APPL_AMT」の名称でカラムを追加し、入金予定額をセットする。
		 * @param applSchdR
		 * @param rcvMtdCd
		 * @return
		 */
		protected MCNumber getRcvSchdAmt(MST_AR_APPL_SCHD_R applSchdR, String rcvMtdCd) {
			MCList<MST_AR_APPL_SCHD_R> applSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
			applSchdL.add(applSchdR);
			MCNumber rcvSchdAmt = getRcvSchdAmt(applSchdL, rcvMtdCd);
			applSchdR.setNumberNE(_SCHD_APPL_AMT, rcvSchdAmt);
			return rcvSchdAmt;
		}

		/**
		 * 指定された債権決済区分の未消込残高を取得する。
		 * 引数のschdRに値をセットしない。
		 * @param applSchdR
		 * @param rcvMtdCd
		 * @return
		 */
		protected MCNumber getRcvSchdAmtNoSet(MST_AR_APPL_SCHD_R applSchdR, String rcvMtdCd) {
			MCList<MST_AR_APPL_SCHD_R> applSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
			applSchdL.add(applSchdR);
			MCNumber rcvSchdAmt = getRcvSchdAmt(applSchdL, rcvMtdCd);
			return rcvSchdAmt;
		}

		/**
		 * 指定された入金方法ごとの未消込残高を返す。
		 * 入金方法がNULLの場合、すべての入金方法の未消込残高を返す。
		 * @param schdL
		 * @param arSttlTyp
		 * @return
		 */
		protected MCNumber getRcvSchdAmt(MCList<MST_AR_APPL_SCHD_R> applSchdL,
				String rcvMtdCd) {
			// すべての入金方法の未消込残高
			if (isNull(rcvMtdCd)) {
				return applSchdL.sum(MST_AR_APPL_SCHD_R.$not_appl_bal);
			}
			// 特定の入金方法の未消込残高
			else {
				return applSchdL.subList(MST_AR_APPL_SCHD_R.$rcv_mtd_cd, rcvMtdCd)
						.sum(MST_AR_APPL_SCHD_R.$not_appl_bal);
			}
		}

		/**
		 * 入金の入金自動消込対象ＦＬＧをオンに更新する場合はtrue。<BR>
		 * 入金自動消込対象ではなかった入金で、本オペレーションの引数に入金ＮＯを指定されて消込が完了した場合に
		 * は入金自動消込対象であるとみなす為、フラグを更新する。
		 * @param flg
		 * @param typ 
		 * @return
		 */
		protected boolean isUpdRcvAutoApplTgtFlg(boolean flg, String typ) {
			return (!flg && MSC_AUTO_APPL_STS_TYP.isCMPL(typ)
					|| MSC_AUTO_APPL_STS_TYP.isCMPL_INC_COMP(typ)
					|| MSC_AUTO_APPL_STS_TYP.isCMPL_OVER(typ) 
					|| MSC_AUTO_APPL_STS_TYP.isCMPL_SHORT(typ));
		}

		/**
		 * 振込手数料計算対象を取得する
		 * @param bcstR 請求先
		 * @param arSttlR 債権決済方法
		 * @return
		 */
		protected List<MCList<MST_RCV_R>> getComPaidTgt(MAM_BP_R rcstR, MCList<MST_RCV_R> rcvL) {
			// 取引先マスタの手数料計算ＦＬＧが最優先
			if (!rcstR.calc_com_paid_flg()) {
				return null;
			}
			// 金額を考慮しないパターンは手数料の計算を行わない
			// 「金種考慮：オン、金額考慮：オフ」、「金種考慮：オフ、金額考慮：オフ」
			if (isArSttlMatch(rcstR) || isNotAmtAndArSttlMatch(rcstR)) {
				return null;
			}
			MCList<MST_RCV_R> comPaidL = MCList.create(MST_RCV_R.class);
			// 振込手数料が設定されている入金
			MCList<MST_RCV_R> specifiedL = getSpecifiedComPaidTgtR(rcvL);
			// 振込手数料計算対象の入金
			MCList<MST_RCV_R> calcL = getCalcComPaidTgtR(rcvL);
			// 振込手数料計算対象の入金が複数件存在する場合は振込手数料の計算を行わない
			if(1 < calcL.size()){
				return null;
			}
			comPaidL.addAll(specifiedL);
			comPaidL.addAll(calcL);
			if (comPaidL.isEmpty()) {
				return null;
			}
			// 入金の債権決済方法で指定されている通常相殺方法が存在しない場合は手数料計算を行わない（想定外）
			for (MST_RCV_R r : comPaidL) {
				MAM_STTL_R rcvArSttlR = MSBGL_ArUtil.getArSttl(r.rcv_mtd_cd());
				MAM_STTL_R setoffArSttlR = MSBGL_ArUtil.getArSttl(rcvArSttlR.ar_setoff_cd());
				if (isNull(setoffArSttlR)) {
					return null;
				}
			}
			List<MCList<MST_RCV_R>> ret = new ArrayList<MCList<MST_RCV_R>>();
			ret.add(calcL);
			ret.add(specifiedL);
			return ret;
		}

		/**
		 * 手数料込判定用のＦＬＧ設定
		 * 
		 * @param lst
		 */
		protected void setInclComPaidFlgTrue(List<MCList<MST_RCV_R>> lst) {
			MCList<MST_RCV_R> calcL = lst.get(0);
			MCList<MST_RCV_R> specifiedL = lst.get(1);
			// 後から手数料込みの金額を取得する判定に使用する
			calcL.setBooleanNE(_INCL_COM_PAID, true);
			specifiedL.setBooleanNE(_INCL_COM_PAID, true);
		}

		/**
		 * 振込手数料が指定されている入金を返す。
		 * @param rcvL
		 * @return
		 */
		protected MCList<MST_RCV_R> getSpecifiedComPaidTgtR(MCList<MST_RCV_R> rcvL) {

			MCList<MST_RCV_R> comPaidTgtL = MCList.create(MST_RCV_R.class);
			comPaidTgtL = rcvL.subList(_rcvSpecifiedComPaidMatcher);
			return comPaidTgtL;
		}

		protected <T extends MST_RCV_R> MCRowMatcher<T> createSpecifiedRcvComPaidMatcher() {
			return new SpecifiedRcvComPaidMatcher<T>();
		}
		/**
		 * 手数料計算を行う入金方法で、入金に振込手数料が指定されている場合にtrueを返す。
		 */
		protected class SpecifiedRcvComPaidMatcher<T extends MST_RCV_R> implements MCRowMatcher<T> {
			@Override
			public boolean match(T row) {
				if (MSBGL_ArUtil.getArSttl(row.rcv_mtd_cd()).calc_com_paid_flg()
						&& !isNull(row.com_paid()) && row.rcv_proc_amt().isZero()) {
					return true;
				}
				return false;
			}
		}

		/**
		 * 振込手数料マスタで振込手数料を計算する対象の入金を返す。
		 * @param rcvL
		 * @return
		 */
		protected MCList<MST_RCV_R> getCalcComPaidTgtR(MCList<MST_RCV_R> rcvL) {
			MCList<MST_RCV_R> comPaidTgtL = MCList.create(MST_RCV_R.class);
			comPaidTgtL = rcvL.subList(_rcvComPaidMatcher);
			return comPaidTgtL;
		}

		protected <T extends MST_RCV_R> MCRowMatcher<T> createRcvComPaidMatcher() {
			return new RcvComPaidMatcher<T>();
		}

		/**
		 * 手数料を振込手数料マスタから検索する入金の場合にtrueを返す。
		 * 債権決済方法マスタの振込手数料計算がオフで、入金情報に振込手数料が指定されていない場合にtrue
		 */
		protected class RcvComPaidMatcher<T extends MST_RCV_R> implements MCRowMatcher<T> {
			@Override
			public boolean match(T row) {
				if (MSBGL_ArUtil.getArSttl(row.rcv_mtd_cd()).calc_com_paid_flg()
						&& isNull(row.com_paid()) && row.rcv_proc_amt().isZero()) {
					return true;
				}
				return false;
			}
		}

		protected boolean existsComPaidTgt(List<MCList<MST_RCV_R>> lst) {
			if (null == lst) {
				return false;
			}
			if (lst.size() != 2) {
				return false;
			}
			MCList<MST_RCV_R> calcL = lst.get(0);
			MCList<MST_RCV_R> specifiedL = lst.get(1);
			if (calcL.isEmpty() && specifiedL.isEmpty()) {
				return false;
			}
			return true;
		}

		/**
		 * 振込手数料を取得する。<BR>
		 * @param rcstCd 入金先ＣＤ 
		 * @param allL すべての入金
		 * @param calcL 振込手数料マスタで振込手数料を計算する対象の入金
		 * @param inclL 振込手数料が指定されている入金
		 * @param schdAmt 入金予定額
		 * @return 振込手数料[振込手数料マスタから取得した振込手数料, 入金に指定された振込手数料合計]<BR>
		 * [0]：入金に指定された振込手数料のみで消込できず、振込手数料マスタを検索したが取得できた振込手数料が無い場合と、
		 * 入金に指定された振込手数料のみで消込を行う場合は0となる<BR>
		 * [1]：振込手数料マスタ検索対象の入金がなく、入金に指定された振込手数料のみでは消込できない場合は0となる
		 */
		protected MCNumber[] getComPaid(String rcstCd, MCList<MST_RCV_R> allL, MCList<MST_RCV_R> calcL,
				MCList<MST_RCV_R> inclL, MCNumber schdAmt) {
			MCNumber[] ret = new MCNumber[] {
					MCNumber.ZERO, MCNumber.ZERO
			};
			MCNumber ttlNotApplBal = allL.sum(MST_RCV_R.$not_proc_bal);

			// 差額 （入金予定額  － 入金額）
			MCNumber diffAmt = schdAmt.subtract(ttlNotApplBal);
			// 入金に指定された振込手数料合計を取得
			MCNumber ttlSpecifiedComPaid = nvl(inclL.sum(MST_RCV_R.$com_paid), MCNumber.ZERO);
			// 手数料計算対象の入金が無い場合は入金に設定されている振込手数料で消込可能かを判定する
			//　差額(diffAmt)が振込手数料の合計と一致すれば、手数料込みで消込可能とし、手数料合計額を返す
			if (calcL.isEmpty()) {
				if (isSame(diffAmt, ttlSpecifiedComPaid)) {
					ret[1] = ttlSpecifiedComPaid;
				}
				return ret;
			}
			// 振込手数料をマスタから計算する対象の入金は1件
			MST_RCV_R calcR = calcL.get(0);
			MCList<MAM_COM_PAID_R> comL = MCList.create(MAM_COM_PAID_R.class);
			MAM_COM_PAID_R t = MAM_COM_PAID_R.create("T");
			MCQueryApiBuilder comL_bldr = MCQueryApiBuilder.create(t);
			MCRow bind = MCRow.create();
			bind.addNumberColumn("amt", calcR.not_proc_bal());
			bind.addStringColumn("cur_cd", calcR.trd_cur_cd());
			bind.addStringColumn("rcst_cd", rcstCd);
			comL_bldr.setSelect(t.rcst_cd, t.com_paid);

			// 下限、上限が同じ場合は対象金額と一致すれば抽出する
			// 上限、下限両方NULLの場合は金額に関わらず抽出する
			comL_bldr.setWhere(bracket(t.min_amt.eq(t.max_amt)
					.and(t.min_amt.eq(bind("amt")))
					.or(t.min_amt.isNull())
					.and(t.max_amt.isNull())
					.or(t.min_amt.lte(bind("amt")))
					.and(bind("amt").lt(t.max_amt))
					.or(t.min_amt.lte(bind("amt")))
					.and(t.max_amt.isNull())
					.or(t.min_amt.isNull())
					.and(bind("amt").lt(t.max_amt))));
			comL_bldr.addWhereWithAnd(bracket(t.rcst_cd.isNull()
					.or(t.rcst_cd.eq(bind("rcst_cd")))));
			comL_bldr.addWhereWithAnd(t.cur_cd.eq(bind("cur_cd")));
			dbSelect("MSBGB0090_MAM_COM_PAID_S01", comL, comL_bldr, bind);
			if (!comL.isEmpty()) {
				MCList<MAM_COM_PAID_R> bcstL = comL.subList("rcst_cd", rcstCd);
				// 差額残高。入金予定と入金額の差額から、入金に指定されている振込手数料合計を引いた金額。
				// この金額が振込手数料マスタから手数料として取得できれば手数料込みで消込可能となる。
				MCNumber diffAmtBal = diffAmt.subtract(ttlSpecifiedComPaid);
				// 請求先が設定されているレコードが存在する場合
				if (!isNull(bcstL)) {
					// 請求先が設定されているレコードを優先
					if (!isNull(bcstL.getFirst("com_paid", diffAmtBal))) {
						ret[0] = diffAmtBal;
					}
				}
				else if (!isNull(comL.getFirst("com_paid", diffAmtBal))) {
					ret[0] = diffAmtBal;
				}
			}
			return ret;
		}

		protected void applBillD(MCList<MST_RCV_R> rcvL, MST_AR_APPL_SCHD_R applSchdR, MCNumber comPaid,
				String autoApplStsTyp, MAM_BP_R rcstR) {
			MCList<MST_AR_APPL_SCHD_R> schdL = MCList.create(MST_AR_APPL_SCHD_R.class);
			schdL.add(applSchdR);
			applBillD(rcvL, schdL, comPaid, autoApplStsTyp, rcstR);
		}

		/**
		 * 明細消込情報を作成し、入金実績共通サービスを呼び出す。
		 * 
		 * @param rcvL
		 * @param applSchdL
		 * @param comPaid 振込手数料。入金が複数存在する場合、振込手数料計算対象の入金にのみ、適用される。
		 * @param autoApplStsTyp 入金ごとに決定する場合はnull（ただし、金額一致か手数料込で完了の場合のみ）。
		 * 値が渡された場合はリストrcvLのすべてに同じ自動消込状況区分が設定される。
		 * @param rcstR
		 */
		protected void applBillD(MCList<MST_RCV_R> rcvL,
				MCList<MST_AR_APPL_SCHD_R> applSchdL, MCNumber comPaid,
				String autoApplStsTyp, MAM_BP_R rcstR) {

			Map<String, MCList<RcvAutoAppl_Upd02_Appl_BillDR>> applMap = new HashMap<String, MCList<RcvAutoAppl_Upd02_Appl_BillDR>>();

			// 未消込額合計
			MCNumber allRcvNotProcBal = rcvL.sum(MST_RCV_R.$not_proc_bal);
			// 全入金の手数料を合計
			MCNumber allCompaid = calcAllComPaid(rcvL, comPaid);
			
			// 売掛消込予定に対して消し込む金額の総額
			MCNumber allSchdApplAmt = applSchdL.sum(_SCHD_APPL_AMT);

			// マッチングで消込対象となった入金ごとに、消せるところまで消しこんでいく
			for (int j = 0; j < rcvL.size(); j++) {
				_noDtlApplBillDL = MCList.create(RcvAutoAppl_Upd02_Appl_BillDR.class);

				MST_RCV_R rcvR = rcvL.get(j);

				// この入金に対する振込手数料
				MCNumber comPaidForRcvR = setInputComPaid(rcvR, comPaid);

				// 消込対象額 ＝ 未消込額＋振込手数料(手数料計算対象の場合のみ）
				MCNumber rcvNotApplBal = MCNumber.sum(rcvR.not_proc_bal(), comPaidForRcvR);

				// 入金ごとの明細消込情報
				MCList<RcvAutoAppl_Upd02_Appl_BillDR> arApplL = MCList.create(RcvAutoAppl_Upd02_Appl_BillDR.class);

				// 入金未消込総額と消込対象の入金予定残高+振込手数料が等しい場合にtrue
				boolean isAmtMatch = isSame(allSchdApplAmt, sum(allRcvNotProcBal, allCompaid));

				for (int i = 0; i < applSchdL.size(); i++) {

					MST_AR_APPL_SCHD_R applSchdR = applSchdL.get(i);

					// 途中まで消込を行っている請求明細消込情報があれば取得する
					// (未消込の明細と、消込を行って未消込額が0の明細はマップに格納されていない）
					MCList<RcvAutoAppl_Upd02_Appl_BillDR> applDtlInfo = applMap.get(applSchdR.bill_acst_no());
					if (isNull(applDtlInfo)) {
						applDtlInfo = getApplBillDInfo(applSchdR, rcvR.not_proc_bal());
					}
					else {
						// キャッシュから残を取得する場合は、対応する売掛消込予定の情報に置き換える
						applDtlInfo.setStringNE(RcvAutoAppl_Upd02_Appl_BillDR.$ar_appl_schd_no, applSchdR.ar_appl_schd_no());
					}

					// 売掛消込予定ごと、金種ごとで消込予定額として設定した値まで消込可能
					MCNumber schdApplAmt = applSchdR.getNumber(_SCHD_APPL_AMT);

					// この売掛消込予定、金種でこれ以上の消込はできない場合
					if (schdApplAmt.isZero() && !applSchdR.appl_tgt_amt().isZero()) {
						continue;
					}
					MCNumber applAmt;
					MCList<RcvAutoAppl_Upd02_Appl_BillDR> applDtlList = MCList.create(RcvAutoAppl_Upd02_Appl_BillDR.class);

					// 売掛消込予定がすべて0で、明細が存在する場合（赤、取消のセットのみで合計が0の場合など）、
					// すべて消込する（消さないと残ってしまうため）
					if (applSchdR.appl_tgt_amt().isZero() && !applDtlInfo.isEmpty()) {
						applDtlInfo.setColumnValueNE(RcvAutoAppl_Upd02_Appl_BillDR.$appl_amt,
								RcvAutoAppl_Upd02_Appl_BillDR.$not_appl_bal);
						applAmt = MCNumber.ZERO;
						applDtlList = applDtlInfo.clone();
					}
					else {
						// 最後の入金処理中　AND 金額を考慮する場合 AND 入金未消込総額と消込対象の入金予定残高が等しい
						// 処理中の売掛消込予定に対して消込予定の額まで消しこむ。この時点での入金の未消込残高のほうが
						// 小さいことがあるが、金額を考慮してマッチしているため、次以降のループで処理する入金予定で
						// マイナスの金額がくるなど、残りの入金予定消込額のトータルと、入金の未処理残高が一致するため
						if (j == rcvL.size() - 1 && isAmtMatch
								&& (isAmtAndArSttlMatch(rcstR) || isAmtMatch(rcstR))) {
							applAmt = schdApplAmt;
						}
						else {
							// 消込予定額、入金未消込残高、入金予定残高のうち、最も小さいほうの金額まで、入金予定を消し込む
							applAmt =  MCNumber.min(schdApplAmt, rcvNotApplBal, applSchdR.not_appl_bal());
						}

						// 消込処理の実行
						if (isNull(applDtlInfo)) {
							addNoDtlApplBillDR(applSchdR, applAmt);
						}
						else {
							MCNumber applDtlNotApplBal = applDtlInfo.sum(RcvAutoAppl_Upd02_Appl_BillDR.$not_appl_bal);
							if (canApplAllBal(applSchdR, applAmt, applDtlNotApplBal)) {
								for (RcvAutoAppl_Upd02_Appl_BillDR r : applDtlInfo) {
									r.appl_amt(r.not_appl_bal());
								}
								applDtlList.addAll(applDtlInfo);
							}
							else {
								IfDivideInSeqInfo<RcvAutoAppl_Upd02_Appl_BillDR> divRslt = FXUCC_Divide.inSeq(
										applDtlInfo, applAmt, RcvAutoAppl_Upd02_Appl_BillDR.$not_appl_bal,
										RcvAutoAppl_Upd02_Appl_BillDR.$appl_amt);
								applDtlList.addAll(divRslt.allocated());
								// 割当残数がある場合、消込情報の最終行の金額を調整する
								if (!divRslt.remainder().isZero()) {
									int applDtlSize = applDtlList.size() - 1;
									applDtlList.get(applDtlSize).appl_amt(
											applDtlInfo.get(applDtlSize).appl_amt().add(divRslt.remainder()));
								}
							}
						}
					}
					arApplL.addAll(applDtlList.clone());
					// 消込情報を保持しているマップを更新
					createApplDtlMap(applMap, applDtlList, applDtlInfo, applSchdR);
					// 処理中の入金の未消込残高を更新
					rcvNotApplBal = rcvNotApplBal.subtract(applAmt);
					// 次の入金で処理できる金額を減らす
					// 入金予定の消込予定額よりも入金額が大きい場合、次の入金でこの入金予定を消しこむことはできない
					// (次の入金予定から消し込む）
					applSchdR.setNumber(_SCHD_APPL_AMT, schdApplAmt.subtract(applAmt));
					// ループの最後の入金処理中 AND 入金予定のループの最後で無い AND 金額を考慮
					// この場合は入金の未消込残高が0でも残りの入金予定で消込を継続する
					// ・次のようなケースに対応するため
					// 入金額100円でここまでに100円消しており未消込残高が0円
					// 処理中の入金予定の消込予定額が5円残っており、次の入金予定の
					// 消込予定額が-5円（次の入金予定と足して0円となるケース）
					// この場合、次の入金予定まで処理可能なため、入金の未消込残高が0円でも次の入金予定を処理する
					if (j == rcvL.size() - 1 && i != applSchdL.size() - 1
							&& (isAmtAndArSttlMatch(rcstR) || isAmtMatch(rcstR))) {
						continue;
					}
					// 入金額すべて消込した OR 入金額の一部を消込し、これ以上消し込む入金予定が無い
					// 債権共通呼び出し情報作成を行う
					if (rcvNotApplBal.isZero() || i == applSchdL.size() - 1) {
						// 自動消込状況区分が渡されなかった場合は入金ごとに「完了（金額一致）」「完了（手数料込）」
						// のどちらかを設定する
						String autoApplStsTypForRcvR;
						if (isNull(autoApplStsTyp)) {
							if (comPaidForRcvR.isZero()) {
								autoApplStsTypForRcvR = MSC_AUTO_APPL_STS_TYP.CMPL.value();
							}
							else {
								autoApplStsTypForRcvR = MSC_AUTO_APPL_STS_TYP.CMPL_INC_COMP.value();
							}
						}
						else {
							autoApplStsTypForRcvR = autoApplStsTyp;
						}
						execRcvCmnService(arApplL, rcvR, comPaidForRcvR, autoApplStsTypForRcvR);
						setCnt(autoApplStsTypForRcvR);
						break;
					}
				}
			}
		}

		protected void setCnt(String autoApplStsTyp) {
			if (MSC_AUTO_APPL_STS_TYP.isCMPL(autoApplStsTyp)) {
				_cmplCnt++;
			}
			else if (MSC_AUTO_APPL_STS_TYP.isCMPL_INC_COMP(autoApplStsTyp)) {
				_cmplIncCompCnt++;
			}
			else if (MSC_AUTO_APPL_STS_TYP.isCMPL_OVER(autoApplStsTyp)) {
				_cmplOverCnt++;
			}
			else if (MSC_AUTO_APPL_STS_TYP.isCMPL_SHORT(autoApplStsTyp)) {
				_cmplShortCnt++;
			}
		}

		protected void addNoDtlApplBillDR(MST_AR_APPL_SCHD_R applSchdR, MCNumber applAmt) {
			RcvAutoAppl_Upd02_Appl_BillDR noDtlApplBillDR = RcvAutoAppl_Upd02_Appl_BillDR.create();
			
			noDtlApplBillDR.acst_cd(applSchdR.getStringNE("acst_cd"));
			noDtlApplBillDR.ar_dpt_cd(applSchdR.getStringNE("ar_dpt_cd"));
			noDtlApplBillDR.bcst_cd(applSchdR.getStringNE("bcst_cd"));
			noDtlApplBillDR.bill_dpt_cd(applSchdR.getStringNE("bill_dpt_cd"));
			noDtlApplBillDR.ar_sttl_cd1(applSchdR.rcv_mtd_cd());
			noDtlApplBillDR.ar_sttl_typ1(MSBGL_ArUtil.getArSttl(noDtlApplBillDR.ar_sttl_cd1()).ar_sttl_typ());
			noDtlApplBillDR.iv_no(applSchdR.iv_no());
			noDtlApplBillDR.wrk_no(applSchdR.getStringNE("wrk_no"));
			noDtlApplBillDR.bill_mng_no(applSchdR.getStringNE("bill_mng_no"));
			noDtlApplBillDR.ar_typ(applSchdR.ar_typ());
			noDtlApplBillDR.ar_appl_schd_no(applSchdR.ar_appl_schd_no());
			noDtlApplBillDR.appl_amt(applAmt);
			
			_noDtlApplBillDL.add(noDtlApplBillDR);
		}

		/**
		 * 引数の入金に適用する振込手数料を返す。
		 * 
		 * @param rcvR 入金情報
		 * @param comPaid 振込手数料（手数料込みで消込する場合は値が入ってくる）
		 * @return
		 */
		protected MCNumber setInputComPaid(MST_RCV_R rcvR, MCNumber comPaid) {
			// 引数のcomPaidは振込手数料マスタから取得した値
			if (rcvR.getBooleanNE(_INCL_COM_PAID)) {
				return isNull(rcvR.com_paid()) ? comPaid : rcvR.com_paid();
			}
			// 入金に手数料が指定されていたが、手数料の消込を行わなかった場合にメッセージを出力
			else if (!isNull(rcvR.com_paid()) && !rcvR.com_paid().isZero()) {
				logger().writeDataLog(MSBGL0048, rcvR.rcv_no(), rcvR.rcv_amt(), rcvR.com_paid());
			}
			return MCNumber.ZERO;
		}

		protected MCList<RcvAutoAppl_Upd02_Appl_BillDR> getApplBillDInfo(MST_AR_APPL_SCHD_R applSchdR,
				MCNumber applAmt) {
			MCList<RcvAutoAppl_Upd02_Appl_BillDR> applL = MCList.create(RcvAutoAppl_Upd02_Appl_BillDR.class);
			MCList<RcvAutoAppl_Upd02_Appl_BillDR> sortL = MCList.create(RcvAutoAppl_Upd02_Appl_BillDR.class);

			executeQuery(applL, MSBGB0090_MST_BILL_D_APPL_BAL_S01(), applSchdR);

			applL.sort(RcvAutoAppl_Upd02_Appl_BillDR.$rcv_schd_dt);
			// 債権決済方法取得
			for (RcvAutoAppl_Upd02_Appl_BillDR applR : applL) {
				applR.ar_sttl_typ1(MSBGL_ArUtil.getArSttl(applR.ar_sttl_cd1()).ar_sttl_typ());
			}
			
			sortL = MSBGL_ArUtil.sortRedCanSlipFirst(applL, applAmt);
			return sortL;
		}

		/**
		 * 今回消込を行った後、未消込残高があり次の入金によって消込予定となる明細をマップに追加する。
		 * @param applMap 消込情報を保持するマップ
		 * @param applL 消込を行った明細（消込額が0の明細は含まれない）
		 * @param allL  すべての明細（消込額が0の明細が含まれる）
		 * @param schdR 消込対象となる入金予定
		 */
		protected void createApplDtlMap(Map<String, MCList<RcvAutoAppl_Upd02_Appl_BillDR>> applMap,
				MCList<RcvAutoAppl_Upd02_Appl_BillDR> applL, MCList<RcvAutoAppl_Upd02_Appl_BillDR> allL, MST_AR_APPL_SCHD_R applSchdR) {
			//次に消込を行うリスト
			MCList<RcvAutoAppl_Upd02_Appl_BillDR> remainL = MCList.create(RcvAutoAppl_Upd02_Appl_BillDR.class);
			MCIndexKey key = applL.createIndex(RcvAutoAppl_Upd02_Appl_BillDR.$bill_d_no,
					RcvAutoAppl_Upd02_Appl_BillDR.$parent_bill_d_no);
			// 入金が複数ある場合に既に取得している明細消込情報を再利用するため、消込した金額を保持している
			// 明細消込情報に反映する
			for (RcvAutoAppl_Upd02_Appl_BillDR r : applL) {
				r.not_appl_bal(r.not_appl_bal().subtract(r.appl_amt()));
			}
			for (RcvAutoAppl_Upd02_Appl_BillDR tgtR : allL) {
				RcvAutoAppl_Upd02_Appl_BillDR applR = applL.getFirst(key, tgtR.bill_d_no(),
						tgtR.parent_bill_d_no());
				// 消込されていない OR 消込されたが、未消込残高がある
				if (isNull(applR) || !isNull(applR) && !applR.not_appl_bal().isZero()) {
					remainL.add(tgtR);
				}
			}
			// 現時点で消込可能な明細リストで置き換える
			applMap.put(applSchdR.bill_acst_no(), remainL);
		}

		/**
		 * 入金実績共通サービスを実行する。
		 * 
		 * @param applL
		 * @param rcvR
		 * @param comPaid
		 * @param autoApplStsTyp
		 */
		protected void execRcvCmnService(MCList<RcvAutoAppl_Upd02_Appl_BillDR> applL, MST_RCV_R rcvR,
				MCNumber comPaid, String autoApplStsTyp) {
			createArApplInfo(applL, rcvR, comPaid);
			callArReg();
			// 入金更新
			updRcvAutoApplSts(rcvR, autoApplStsTyp);
		}

		/**
		 * 入金実績共通サービスの上り電文を作成する。
		 * 
		 * @param applL
		 * @param rcvR
		 * @param comPaid
		 */
		protected void createArApplInfo(MCList<RcvAutoAppl_Upd02_Appl_BillDR> applL, MST_RCV_R rcvR,
				MCNumber comPaid) {
			MCList<RcvAutoAppl_Upd02_Appl_BillDR> arApplGrpKeyL = null;
			if (!isNull(_noDtlApplBillDL)) {
				MCList<RcvAutoAppl_Upd02_Appl_BillDR> allApplL = applL.clone();
				allApplL.addAll(_noDtlApplBillDL);
				arApplGrpKeyL = allApplL.groupBy(getArApplPolicy());
			}
			else {
				arApplGrpKeyL = applL.groupBy(getArApplPolicy());
			}
			MCIndexKey key = applL.createIndex(getArApplKey());
			MCList<RcvAutoAppl_Upd02_DtlR> regSlipDL = MCList.create(RcvAutoAppl_Upd02_DtlR.class);
			Map_Upd01_DtlR_Upd01_Appl_BillDR<RcvAutoAppl_Upd02_DtlR, RcvAutoAppl_Upd02_Appl_BillDR> slipDMpr = createMap_Upd01_DtlR_Upd01_Appl_BillDR();
			int grpCnt = 0;
			boolean rcvAutoApplRcvDtFlg = isSame(getSysParm("RCV_AUTO_APPL_RCV_DT_FLG"), "1");
			for (RcvAutoAppl_Upd02_Appl_BillDR arApplGrpKeyR : arApplGrpKeyL) {
				MCList<RcvAutoAppl_Upd02_Appl_BillDR> arApplGrpL = applL.subList(key,
						getArApplKeyVal(arApplGrpKeyR));
				// 売掛明細消込情報と入金実績明細情報の紐付け
				arApplGrpL.setNumber(RcvAutoAppl_Upd02_Appl_BillDR.$grp_seq, grpCnt);
				arApplGrpKeyR.grp_seq(grpCnt);
				RcvAutoAppl_Upd02_DtlR regSlipDR = RcvAutoAppl_Upd02_DtlR.create();
				copy(regSlipDR, arApplGrpKeyR, slipDMpr);
				if (rcvAutoApplRcvDtFlg) {
					regSlipDR.wg_cd(MSBGL_ArUtil.getWgCd(arApplGrpKeyR.ar_dpt_cd(), rcvR.rcv_dt()));
				}
				else {
					regSlipDR.wg_cd(MSBGL_ArUtil.getWgCd(arApplGrpKeyR.ar_dpt_cd(), getToday()));
				}
				regSlipDL.add(regSlipDR);
				grpCnt++;
			}
			if (!isNull(comPaid) && !comPaid.isZero()) {
				// 振込手数料案分
				FXUCC_Divide.prop(regSlipDL, comPaid, MSBGL_ArUtil.getCur(rcvR.trd_cur_cd()).amt_dec_place()
						.intValue(), RcvAutoAppl_Upd02_DtlR.$ttl_appl_amt, RcvAutoAppl_Upd02_DtlR.$amt2);
			}
			// 入金額に、「消込合計額 － 相殺額」をセットする
			for (RcvAutoAppl_Upd02_DtlR r : regSlipDL) {
				r.amt1(r.ttl_appl_amt().subtract(r.amt2()));
			}
			createArRegInfo(rcvR, regSlipDL, applL, comPaid);
		}

		/**
		 * 入金実績共通サービスを実行する
		 */
		protected void callArReg() {
			c0.exec();
		}

		/**
		 * 債権共通の電文を作成する
		 * @param rcvR 入金情報
		 * @param dtlL 売掛消込情報
		 * @param applL 売掛明細消込情報
		 * @param comPaid 手数料
		 */
		protected void createArRegInfo(MST_RCV_R rcvR, MCList<RcvAutoAppl_Upd02_DtlR> dtlL,
				MCList<RcvAutoAppl_Upd02_Appl_BillDR> applL, MCNumber comPaid) {
			c0.up0().clear();
			c0.up1().clear();
			c0.up2().clear();
			// 振込手数料がある場合は相殺の債権決済方法として、入金の債権決済方法の通常相殺方法ＣＤ
			// で債権決済方法を取得する
			MAM_STTL_R setoffArSttlR = isNull(comPaid) || comPaid.isZero() ? null
					: MSBGL_ArUtil.getArSttl(MSBGL_ArUtil.getArSttl(rcvR.rcv_mtd_cd()).ar_setoff_cd());
			if (isNull(setoffArSttlR)) {
				c0.up0().add(setSlipHdrInfo(rcvR, setoffArSttlR));
				up_UPD02_c0_1(c0.up1(), dtlL);
				up_UPD02_c0_0(c0.up2(), applL);
			}
			else {
				// 請求先と請求部門を相殺情報として設定するため、請求先と請求部門ごとにヘッダを分ける。
				int cnt = 1;
				for (MCList<RcvAutoAppl_Upd02_DtlR> grpDtlL : dtlL.groupList(RcvAutoAppl_Upd02_DtlR.$bcst_cd, 
						RcvAutoAppl_Upd02_DtlR.$bill_dpt_cd)) {
					
					RcvAutoAppl_Upd02_DtlR grpDtlR = grpDtlL.get(0);
					RcvActCmn_Chk01_HdrR grpHdrR = setSlipHdrInfo(rcvR, setoffArSttlR);
					grpHdrR.debt_cred_id_cd(grpDtlR.bcst_cd());
					grpHdrR.bd_dpt_cd(grpDtlR.bill_dpt_cd());
					grpHdrR.hdr_dtl_peg(cnt);
					c0.up0().add(grpHdrR);
					
					grpDtlL.setNumber(RcvAutoAppl_Upd02_DtlR.$hdr_dtl_peg, cnt);
					up_UPD02_c0_1(c0.up1(), grpDtlL);
					
					cnt++;
				}
				up_UPD02_c0_0(c0.up2(), applL);
			}
		}

		protected RcvActCmn_Chk01_HdrR setSlipHdrInfo(
				MST_RCV_R rcvR, MAM_STTL_R setoffArSttlR) {
			RcvActCmn_Chk01_HdrR up0R = RcvActCmn_Chk01_HdrR.create();
			copy(up0R, rcvR, setoffArSttlR, createMap_RcvActCmn_Chk01_HdrR_MST_RCV_R());
			return up0R;
		}

		protected MCGroupByPolicy getArApplPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(getArApplKey());
			gp.sum(RcvAutoAppl_Upd02_Appl_BillDR.$appl_amt);
			return gp;
		}

		protected String[] getArApplKey() {
			return new String[] {
					RcvAutoAppl_Upd02_Appl_BillDR.$acst_cd,
					RcvAutoAppl_Upd02_Appl_BillDR.$ar_dpt_cd,
					RcvAutoAppl_Upd02_Appl_BillDR.$bcst_cd,
					RcvAutoAppl_Upd02_Appl_BillDR.$bill_dpt_cd,
					RcvAutoAppl_Upd02_Appl_BillDR.$iv_no,
					RcvAutoAppl_Upd02_Appl_BillDR.$wrk_no,
					RcvAutoAppl_Upd02_Appl_BillDR.$ar_typ,
					RcvAutoAppl_Upd02_Appl_BillDR.$ar_sttl_cd1,
					RcvAutoAppl_Upd02_Appl_BillDR.$ar_sttl_typ1,
					RcvAutoAppl_Upd02_Appl_BillDR.$ar_appl_schd_no,
					RcvAutoAppl_Upd02_Appl_BillDR.$bill_mng_no
			};
		}

		protected Comparable<?>[] getArApplKeyVal(RcvAutoAppl_Upd02_Appl_BillDR r) {
			return new Comparable<?>[] {
					r.acst_cd(),
					r.ar_dpt_cd(),
					r.bcst_cd(),
					r.bill_dpt_cd(),
					r.iv_no(),
					r.wrk_no(),
					r.ar_typ(),
					r.ar_sttl_cd1(),
					r.ar_sttl_typ1(),
					r.ar_appl_schd_no(),
					r.bill_mng_no()
			};
		}

		// 売掛消込の入金実績明細情報用Mapper
		protected Map_Upd01_DtlR_Upd01_Appl_BillDR<RcvAutoAppl_Upd02_DtlR, RcvAutoAppl_Upd02_Appl_BillDR> createMap_Upd01_DtlR_Upd01_Appl_BillDR() {
			return new Map_Upd01_DtlR_Upd01_Appl_BillDR<RcvAutoAppl_Upd02_DtlR, RcvAutoAppl_Upd02_Appl_BillDR>();
		}
		public class Map_Upd01_DtlR_Upd01_Appl_BillDR<D extends RcvAutoAppl_Upd02_DtlR, S extends RcvAutoAppl_Upd02_Appl_BillDR> extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$grp_seq, RcvAutoAppl_Upd02_Appl_BillDR.$grp_seq);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$acst_cd, RcvAutoAppl_Upd02_Appl_BillDR.$acst_cd);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$ar_dpt_cd, RcvAutoAppl_Upd02_Appl_BillDR.$ar_dpt_cd);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$bcst_cd, RcvAutoAppl_Upd02_Appl_BillDR.$bcst_cd);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$bill_dpt_cd, RcvAutoAppl_Upd02_Appl_BillDR.$bill_dpt_cd);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$ar_typ, RcvAutoAppl_Upd02_Appl_BillDR.$ar_typ);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$ar_appl_schd_no, RcvAutoAppl_Upd02_Appl_BillDR.$ar_appl_schd_no);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$iv_no, RcvAutoAppl_Upd02_Appl_BillDR.$iv_no);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$wrk_no, RcvAutoAppl_Upd02_Appl_BillDR.$wrk_no);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$bill_mng_no, RcvAutoAppl_Upd02_Appl_BillDR.$bill_mng_no);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$ar_sttl_cd1, RcvAutoAppl_Upd02_Appl_BillDR.$ar_sttl_cd1);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$ar_sttl_typ1, RcvAutoAppl_Upd02_Appl_BillDR.$ar_sttl_typ1);
				addColumnPathMap(RcvAutoAppl_Upd02_DtlR.$ttl_appl_amt, RcvAutoAppl_Upd02_Appl_BillDR.$appl_amt);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.amt1(0);
				dest.amt2(0);
				dest.hdr_dtl_peg(1);
			}
		}

		// 売掛消込の入金実績ヘッダ情報用Mapper
		protected Map_RcvActCmn_Chk01_HdrR_MST_RCV_R<RcvActCmn_Chk01_HdrR, MST_RCV_R, MAM_STTL_R> createMap_RcvActCmn_Chk01_HdrR_MST_RCV_R() {
			return new Map_RcvActCmn_Chk01_HdrR_MST_RCV_R<RcvActCmn_Chk01_HdrR, MST_RCV_R, MAM_STTL_R>();
		}
		public class Map_RcvActCmn_Chk01_HdrR_MST_RCV_R<D extends RcvActCmn_Chk01_HdrR, S extends MST_RCV_R, W extends MAM_STTL_R>
				extends MAUCC_RowMapperWith<D, S, W> {

			protected W _setoffArSttlR;

			@Override
			public void setWith(W setoffArSttlR) {
				this._setoffArSttlR = setoffArSttlR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcst_cd, MST_RCV_R.$rcst_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$bcst_cd, MST_RCV_R.$bcst_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$bill_dpt_cd, MST_RCV_R.$bill_dpt_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_no, MST_RCV_R.$rcv_no);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_dt, MST_RCV_R.$rcv_dt);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$bank_ac_cd, MST_RCV_R.$bank_ac_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$xfr_psn, MST_RCV_R.$xfr_psn);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_mng_no, MST_RCV_R.$note_mng_no);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$trd_cur_cd, MST_RCV_R.$trd_cur_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$xrate, MST_RCV_R.$xrate);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$xrate_cd, MST_RCV_R.$xrate_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$ar_sttl_cd1, MST_RCV_R.$rcv_mtd_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$ar_sttl_typ1, MST_RCV_R.$rcv_typ);
			}

			@Override
			public void valueCopy(D dest, S src) {
				if (isSame(getSysParm("RCV_AUTO_APPL_RCV_DT_FLG"),"1")) {
					dest.ac_dt(getAcDt(src.rcv_dt()));
				}
				else {
					dest.ac_dt(getToday());
				}
				dest.note_no(src.getString("note_no"));
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.dpt_cd(getRcvActDptCd(src));
				dest.wg_cd(MSBGL_ArUtil.getWgCd(dest.dpt_cd(), dest.ac_dt()));
				dest.usr_cd(getRcvActUsrCd(src));
				// 手数料相殺を行う場合、相殺方法、消費税を設定
				if (!isNull(_setoffArSttlR)) {
					dest.ar_sttl_cd2(_setoffArSttlR.sttl_cd());
					dest.ar_sttl_typ2(_setoffArSttlR.ar_sttl_typ());
					dest.tax_cd2(getTaxCd(dest.rcv_dt(), _setoffArSttlR));
					dest.tax_typ2(getTax(dest.tax_cd2()).tax_typ());
					dest.tax_rate2(getTax(dest.tax_cd2()).tax_rate());
					dest.debt_cred_id_typ(MAC_DEBT_CRED_ID_TYP.BCST.value());
					dest.debt_cred_id_cd(src.bcst_cd());
					dest.bd_dpt_cd(MSBGL_ArUtil.getBcstDpt(src.bcst_cd(), dest.ac_dt(), null, null));
				}
				dest.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.RCV_AR.value()));
				dest.ar_trd_grp_typ(MAC_TRD_PTN_TYP.RCV_AR.ar_trd_grp_typ());
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.RCV_AR.value());
				dest.bill_basis_dt(dest.ac_dt());
				dest.rcv_auto_appl_flg(true);
				dest.hdr_dtl_peg(1);
			}
		}

		/**
		 * 税ＣＤの取得
		 * 決済方法マスタの売上仕入税区分に従い、会社マスタから売上税ＣＤまたは仕入税ＣＤを取得する。
		 * 
		 * @param baseDt 基準日
		 * @param arSttlR 決済方法マスタ情報
		 * @return 税ＣＤ
		 */
		protected String getTaxCd(MCDate baseDt, MAM_STTL_R arSttlR) {
			String taxCd;
			if (MAC_SLS_PURC_TYP.isSLS(arSttlR.sls_purc_typ())) {
				taxCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_SLS_TAX_CD", "01"),
						MAPA_TAX$F_GET_SLS_TAX_CD(nullValue(), nullValue(), nullValue(), nullValue(), nullValue(), value(baseDt)));
				MAM_TAX_R taxR = getTax(taxCd);
				if (!taxR.inc_tax_flg() && MAC_TAX_TYP.isTAX_ABL(taxR.tax_typ())) {
					taxCd = srchTaxCd(taxR.tax_rate(), true);
				}
			}
			else if (MAC_SLS_PURC_TYP.isPURC(arSttlR.sls_purc_typ())) {
				taxCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_SLS_TAX_CD", "02"),
						MAPA_TAX$F_GET_PURC_TAX_CD(nullValue(), nullValue(), nullValue(), nullValue(), nullValue(), value(baseDt)));
				MAM_TAX_R taxR = getTax(taxCd);
				if (!taxR.inc_tax_flg() && MAC_TAX_TYP.isTAX_ABL(taxR.tax_typ())) {
					taxCd = srchTaxCd(taxR.tax_rate(), false);
				}
			}
			else {
				throw new MCAppException(MSBGL0047);
			}
			return taxCd;
		}

		/**
		 * 税率が同じ内税の税ＣＤを取得する
		 * 
		 * @param taxRate 税率
		 * @param slsFlg 売上ＦＬＧ
		 * @return 税ＣＤ
		 */
		protected String srchTaxCd(MCNumber taxRate, boolean slsFlg) {

			MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(t);
			taxL_bldr.setSelect(t.tax_cd);
			taxL_bldr.setWhere(t.inc_tax_flg.eq(value(true)));
			if (slsFlg) {
				taxL_bldr.addWhereWithAnd(t.sls_flg.eq(value(true)));
			}
			else {
				taxL_bldr.addWhereWithAnd(t.purc_flg.eq(value(true)));
			}
			taxL_bldr.addWhereWithAnd(t.tax_rate.eq(bind("1")), taxRate);
			taxL_bldr.setOrderByAsc(t.tax_cd);
			dbSelect("MSBGB0090_MAM_TAX_S01", taxL, taxL_bldr);
			if (taxL.isEmpty()) {
				throw new MCAppException(MSBGL0029);
			}
			return taxL.get(0).tax_cd();
		}

		/**
		 * 税マスタの取得（キャッシュ）
		 * 
		 * @param taxCd 税ＣＤ
		 * @return 税マスタ情報
		 */
		protected MAM_TAX_R getTax(String taxCd) {
			if (null == _taxL) {
				_taxL = new FXUCL_MCDbcCache<MAM_TAX_R>(MCQueryApiBuilder.create(MAM_TAX_R.create("T")));
			}
			return _taxL.get(taxCd);
		}

		/**
		 * 自動で作成する入金実績の部門を取得する
		 * @param r 消込を行った入金情報
		 */
		protected String getRcvActDptCd(MST_RCV_R r) {
			return r.rcv_dpt_cd();
		}

		/**
		 * 自動で作成する入金実績の担当者を取得する
		 * @param r 消込を行った入金情報
		 */
		protected String getRcvActUsrCd(MST_RCV_R r) {
			return r.rcv_usr_cd();
		}
		
		/**
		 * 取引先マスタの取得（入金先）
		 * @param rcst_cd
		 * @return
		 */
		protected MAM_BP_R getRcstCache(String rcst_cd) {
			return _rcstL.get(rcst_cd);
		}
		
		protected void crtRcstCache() {
			_rcstL = null;
			_rcstL = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("BP")),
					_rcvL.groupBy(MST_RCV_R.$rcst_cd), MST_RCV_R.$rcst_cd);
		}
		
		/**
		 * 入金情報の手数料を合計する。
		 * @param rcvL 入金情報
		 * @param comPaid 振込手数料マスタの振込手数料
		 * @return 手数料合計
		 */
		protected MCNumber calcAllComPaid(MCList<MST_RCV_R> rcvL, MCNumber comPaid) {
			MCNumber allCompaid = MCNumber.ZERO;
			for (MST_RCV_R rcvR : rcvL) {
				allCompaid = allCompaid.add(setInputComPaid(rcvR, comPaid));
			}
			return allCompaid;
		}
		
		/**
		 * 売掛消込予定の全額が消込可能かつ、売掛明細消込残高の全額が消込可能であるかを判定する。
		 * @param applSchdR 売掛消込予定
		 * @param applAmt 消込額
		 * @param applDtlNotApplBal 売掛明細消込残高の合計
		 * @return 消込可能の場合にtrue,消込不可能の場合にfalse
		 */
		protected boolean canApplAllBal(MST_AR_APPL_SCHD_R applSchdR, MCNumber applAmt, MCNumber applDtlNotApplBal) {
			return applSchdR.not_appl_bal().signum() * applSchdR.not_appl_bal().subtract(applAmt).signum() <= 0
					&& applDtlNotApplBal.signum() * applDtlNotApplBal.subtract(applAmt).signum() == 0;
		}
	}

	protected Map<MCDate, Boolean> _acDtMap = new HashMap<>();
	protected static MCDate getAcDt(MCDate baseDt) {
		return object(CLAZZ)._getAcDt(baseDt);
	}
	protected MCDate _getAcDt(MCDate baseDt) {
		
		MCDate acYM = getAcYm(baseDt);
		Boolean clFlg = _acDtMap.get(acYM);
		
		if (isNull(clFlg)) {
			// 引数の日付に対し締めチェックを行う
			MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
			cndR.ac_dt(baseDt);
			cndR.rcv_cls_chk_flg(true);
			op.up0().add(cndR);
			op.up1().no_msg_flg(true);
			op.exec();
			
			if (op.down0().get(0).err_flg()) {
				// 締済の場合
				_acDtMap.put(acYM, true);
				return getToday();
			}
			else {
				// 未締の場合
				_acDtMap.put(acYM, false);
				return baseDt;
			}
		}
		
		if (clFlg) {
			return getToday();
		}
		return baseDt;
	}

	//FMCB CUSTOM END
}