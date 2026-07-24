package mcframe.serverMSBB.MSBBB0020;

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
import mcframe.serverMSBB.MSBBB0020.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.List;

import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSBE.MSBEL5010.MSBEL_IoActService;
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMSBE.MSBEL5710.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R;
import mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR;
import mcframe.serverMSUC.MSUCL0020.MSUCL_ConvQtyAmtUtil;

import mcframe.serverFXUC.FXUCL0030.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;

import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
import static mcframe.serverMSBB.MSBBB0020.Query.*;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBB_SlsActRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBB_SlsActRegBatch_MC extends MSBBB_SlsActRegBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * SlsActReg_Ins01オペレーション.<p>
	 *
	 * 売上実績を一括登録する。<br>
	 */
	public class SlsActReg_Ins01 extends MSBBB_SlsActRegBatch_MC_A.SlsActReg_Ins01 {
		
		/**
		 * 処理対象件数 
		 */
		protected int _totalNum = 0;
		
		/**
		 * 登録件数（正常終了件数）
		 */
		protected int _okNum = 0;
		
		/**
		 * エラー件数
		 */
		protected int _errNum = 0;
		
		/**
		 * 例外発生フラグ
		 */
		protected boolean _exceptionFlg = false;

		/**
		 * 得意先のリスト
		 */
		MCList<SlsActReg_Ins01_CndR> _lst = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			try {
				
				initProc();
				
				writeStartLog();
				
				if (checkCnd()) {
					
					editCnd();
					
					preSrch();
					
					exe();
				}
			}
			catch (Exception ex) {
				
				handleEx(ex);
			}
			finally {
				
				writeEndLog();
			}
		}
		
		/**
		 * 初期処理
		 */
		protected void initProc() {
			
			initLogger();
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
			
			logger().writeStartLog(MSBBL0503);
			pushStartLog(logger());
		}
		
		/**
		 * 例外処理
		 * @param ex 例外
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
			
			logger().writeEndLog(MSBBL0504, _totalNum, _okNum, _errNum);
			pushEndLog(logger());
		}
		
		/**
		 * 実行条件のチェック
		 * @return チェック結果がエラーなしの場合はtrue
		 */
		protected boolean checkCnd() {
			
			MCMessageList msgL = new MCMessageList();
			if (!isNull(up0().sls_schd_dt_fr()) && !isNull(up0().sls_schd_dt_to())) {
				msgL.addAll(check(up0(), new String[] {SlsActReg_Ins01_CndR.$sls_schd_dt_fr, SlsActReg_Ins01_CndR.$sls_schd_dt_to}, new FXUCL_BeforeTodayValidater()));
			}
			else if (!isNull(up0().sls_schd_dt_fr())) {
				msgL.addAll(check(up0(), SlsActReg_Ins01_CndR.$sls_schd_dt_fr, new FXUCL_BeforeTodayValidater()));
			}
			else if (!isNull(up0().sls_schd_dt_to())) {
				msgL.addAll(check(up0(), SlsActReg_Ins01_CndR.$sls_schd_dt_to, new FXUCL_BeforeTodayValidater()));
			}
			
			if (msgL.size() > 0) {
				logger().writeProcessLog(msgL);
				return false;
			}
			
			return true;
		}
		
		/**
		 * 実行条件の編集
		 */
		protected void editCnd() {
			
			if (isNull(up0().sls_schd_dt_to())) {
				up0().sls_schd_dt_to(getToday());
			}
		}
		
		/**
		 * 売上予定を取得する。
		 */
		protected void preSrch() {
			_lst = MCList.create(SlsActReg_Ins01_CndR.class);
			executeQuery(_lst, MSBBB0020_MST_SLS_SCHD_S01(), up0());
		}

		/**
		 * 売上計上処理のメイン処理
		 */
		protected void exe() {
			
			Sort();
		
			callSlsActRegIns02();
		}
		
		/**
		 * スレッドを分割し、スレッドごとに売上実績計上を実行する。
		 */
		protected void callSlsActRegIns02() {
			
			if (!_lst.isEmpty()) {
				
				MSBBB_SlsActRegBatch.SlsActReg_Ins02 ins02 = null;
				List<MSBBB_SlsActRegBatch.SlsActReg_Ins02> opeL = new ArrayList<MSBBB_SlsActRegBatch.SlsActReg_Ins02>();
					
				// 得意先でスレッドを分ける。
				for (SlsActReg_Ins01_CndR r : _lst) {
					
					ins02 = MSBBB_SlsActRegBatch.crtSlsActReg_Ins02();
					MCRow.copyvalue(ins02.up0(), up0());
					ins02.up0().cst_cd(r.cst_cd());
					
					opeL.add(ins02);	
				}
				
				if (MCServerThreadManager.getLimitThreadSize() <= 1) {
					
					MCServerThreadManager.setUseMainDBTran(true);
					MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class);
				}
				else {
					
					MCServerThreadManager.setCommitAndRollback(true);
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}
				
				for (MSBBB_SlsActRegBatch.SlsActReg_Ins02 ope : opeL) {
						
					_totalNum += ope.down0().total_num().intValue();
					_okNum += ope.down0().ok_num().intValue();
					_errNum += ope.down0().err_num().intValue();
				}
			}
		}
		
		/**
		 * 得意先で集計し、売上予定の件数が多い順から実行する。
		 */
		protected void Sort() {
			
			if (!_lst.isEmpty()) {
				
				String countColumn = "cnt";
				_lst.addNumberColumn(countColumn);
				
				MCGroupByPolicy cstGrp = new MCGroupByPolicy(SlsActReg_Ins01_CndR.$cst_cd);
				cstGrp.count(countColumn);
				_lst = _lst.groupBy(cstGrp);
				
				_lst.sort(SortType.DESC, countColumn);
			}
		}
	}
	/**
	 * SlsActReg_Ins02オペレーション.<p>
	 *
	 * マルチスレッドで売上実績を一括登録する。<br>
	 */
	public class SlsActReg_Ins02 extends MSBBB_SlsActRegBatch_MC_A.SlsActReg_Ins02 {
		
		protected int _loopCnt = MCConst.app.getInteger("MS.MSBBB0020.loop_size", 100);
		
		protected MCList<SlsActReg_Ins02_DtlR> _dtlL = null;
		
		protected MCList<SlsActReg_Ins02_IoR> _ioL = MCList.create(SlsActReg_Ins02_IoR.class);
		
		protected MCList<MST_SLS_SCHD_R> _schdQtyL = MCList.create(MST_SLS_SCHD_R.class);
		
		protected MCIndexKey _idxSlsSchd = null;
		
		protected MCList<MST_SLO_D_R> _sloDL = MCList.create(MST_SLO_D_R.class);
		
		protected MCIndexKey _idxSloD = null;
		
		protected MCList<ConvQtyAmtUtil_Calc01_HdrR> _calc01HdrL = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
		protected MCIndexKey _idxCalc01HdrKey;
		protected void initCalc01Hdr() {
			_calc01HdrL.addNumberColumn("sls_schd_qty");
			_calc01HdrL.addNumberColumn("base_unit_cmpl_qty");
			_calc01HdrL.addStringColumn("base_unit_cd");
			_calc01HdrL.addStringColumn("sls_schd_no");
		}
		
		/**
		 * バッチログのlogger
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		protected MCList<MST_SLS_SCHD_R> _slsSchdL;
		protected MCIndexKey _slsSchdIdxKey;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			try {
				
				initProc();
				
				exe();
			}
			finally {
				
				writeLog();
				
				closeLogger();
				
				setDown();
			}
		}
		
		protected void exe() {
			
			lock();
			
			crrctDataBefCheck();
			
			check();
			
			crrctData();
			
			setLoopGrp();
			
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			
			MCSavepoint sp = null;
			
			MCList<SlsActReg_Ins02_DtlR> noErrL = getNoErrList(_dtlL);
			for (MCList<SlsActReg_Ins02_DtlR> lopGrpL : noErrL.groupList(SlsActReg_Ins02_DtlR.$loop_grp_no)) {
				
				try {
					
					MCMessagePool.clear();
					
					sp = dbTran().setSavepoint();
					
					callPurcActRegSvChk03(lopGrpL);
					
					callExActSvChk02(lopGrpL);
					
					MCList<SlsActReg_Ins02_DtlR> dtlL = getNoErrList(lopGrpL);
					
					callPurcActSvUpd02(dtlL);
					
					callExActSvUpd02(dtlL);
					
					callCredSvUpd01(dtlL);
					
					callSlsActSvUpd01(dtlL);
					
					callIoActSvUpd01();
				}
				catch (Exception ex) {
					
					handleEx(ex, sp, lopGrpL);
				}
				finally {
					sp = null;
					msgList.addAll(MCMessagePool.getMessageList());
				}
			}
			
			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}
		
		/**
		 * ロック処理を行う。
		 */
		protected void lock() {
			
			lockSlsSchd();
			
			lockShipPr();
		}
		
		/**
		 * 売上予定のロック処理を行う。
		 */
		protected void lockSlsSchd() {
			
			_dtlL = MCList.create(SlsActReg_Ins02_DtlR.class);
			
			up0().addDateColumn("today", getToday());
			up0().addStringColumn("sls_xrate_cd", getCo().sls_xrate_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			
			executeQuery(_dtlL, MSBBB0020_MST_SLS_SCHD_S02(), up0());
		}
		
		/**
		 * 出荷進捗のロック処理を行う。
		 */
		protected void lockShipPr() {
			
			MCList<MST_SLO_D_R> wkSloDKeyL = MCList.create(MST_SLO_D_R.class);
			
			for (SlsActReg_Ins02_DtlR r : _dtlL) {
				if (!isNull(r.slo_d_no())) {
					MST_SLO_D_R wkSloDR = MST_SLO_D_R.create();
					wkSloDR.slo_d_no(r.slo_d_no());
					wkSloDKeyL.add(wkSloDR);
				}
			}
			if (!isNull(wkSloDKeyL)) {
				
				MCQueryApiBuilder wkSloDKeyL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
				
				dbWkDelete("MSBBB0020_MSW_SLO_D_D01", wkSloDKeyL_bldr.getBaseDbc());
				dbWkInsert("MSBBB0020_MSW_SLO_D_I01", wkSloDKeyL, wkSloDKeyL_bldr.getBaseDbc());
				
				executeQuery(MCList.create(MST_SHIP_PR_R.class), MSBBB0020_MST_SHIP_PR_S01());
				
				dbWkDelete("MSBBB0020_MSW_SLO_D_D02", wkSloDKeyL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * チェック処理を実行する前に、補完処理を行う。
		 */
		protected void crrctDataBefCheck() {
			
			setBcstCd();
		}
		
		/**
		 * 請求先を設定する。
		 */
		protected void setBcstCd() {
			
			MAM_BP_R cstR = getBpCache(up0().cst_cd());
			_dtlL.setValueNE(SlsActReg_Ins02_DtlR.$acst_cd, cstR.acst_cd());
			
			MAM_BP_R acstR = getBpCache(cstR.acst_cd());
			_dtlL.setValueNE(SlsActReg_Ins02_DtlR.$bcst_cd, acstR.bcst_cd());
		}
		
		/**
		 * チェック処理を行う。
		 */
		protected void check() {
			
			checkItmDel();
			
			checkItmStop();
			
			checkCstStop();
			
			checkRcvSchdDt();
		}
		
		/**
		 * 得意先の売上・出荷が禁止のチェック処理を行う。
		 */
		protected void checkCstStop() {
			
			String[] keys = {SlsActReg_Ins02_DtlR.$cst_cd, SlsActReg_Ins02_DtlR.$sls_dt};
			
			MCList<SlsActReg_Ins02_DtlR> cstGrpL = _dtlL.groupBy(keys);
			
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_SLS_STOP", "01"), 
					MABSFunction.getFunctionExecuter("MAPA_BP$F_IS_SLS_STOP"), SlsActReg_Ins02_DtlR.$cst_sls_stop_flg,
					cstGrpL, keys);
			
			MCIndexKey idxkey = _dtlL.createIndex(keys);
			
			for (SlsActReg_Ins02_DtlR dtlR : cstGrpL) {
				
				if (dtlR.cst_sls_stop_flg()) {
					MCMessagePool.add(new MCMessage(MSBBL0505, dtlR.cst_cd(), toYMDString(dtlR.sls_dt())));
					_dtlL.subList(idxkey, dtlR.cst_cd(), dtlR.sls_dt()).setValueNE(SlsActReg_Ins02_DtlR.$err_flg, true);
				}
			}
		}
		
		/**
		 * 品目の論理削除のチェック処理を行う。
		 */
		protected void checkItmDel() {
			
			String[] keys = {SlsActReg_Ins02_DtlR.$itm_cd, 
					SlsActReg_Ins02_DtlR.$itm_sub1, SlsActReg_Ins02_DtlR.$itm_sub2, SlsActReg_Ins02_DtlR.$itm_sub3};
			
			MCList<SlsActReg_Ins02_DtlR> itmGrpL = _dtlL.groupBy(keys);
			
			MCIndexKey idxkey = _dtlL.createIndex(keys);
			
			MAM_ITM_R itmT = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmBldr = MCQueryApiBuilder.create(itmT);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmBldr, itmGrpL, MAM_ITM_R.$itm_cd,
					MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
			
			for (SlsActReg_Ins02_DtlR dtlR : itmGrpL) {
				MAM_ITM_R itmR = getItmCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				if (itmR.isEmpty()) {
					MCMessagePool.add(new MCMessage(MAUAL0189, 
							toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()), ""));
					_dtlL.subList(idxkey, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()).setValueNE(SlsActReg_Ins02_DtlR.$err_flg, true);
				}
			}
		}
		
		/**
		 * 品目の売上・出荷が禁止のチェック処理を行う。
		 */
		protected void checkItmStop() {
			
			String[] keys = {SlsActReg_Ins02_DtlR.$itm_cd, 
					SlsActReg_Ins02_DtlR.$itm_sub1, SlsActReg_Ins02_DtlR.$itm_sub2, SlsActReg_Ins02_DtlR.$itm_sub3, SlsActReg_Ins02_DtlR.$sls_dt};
			
			MCList<SlsActReg_Ins02_DtlR> itmGrpL = _dtlL.groupBy(keys);
			
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_SLS_STOP", "01"),
					MABSFunction.getFunctionExecuter("MAPA_ITM$F_IS_SLS_STOP"),SlsActReg_Ins02_DtlR.$itm_sls_stop_flg,
					itmGrpL, keys);
			
			MCIndexKey idxkey = _dtlL.createIndex(keys);
			
			for (SlsActReg_Ins02_DtlR dtlR : itmGrpL) {
				
				if (dtlR.itm_sls_stop_flg()) {
					MCMessagePool.add(new MCMessage(MSBBL0509, 
							toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							toYMDString(dtlR.sls_dt())));
					_dtlL.subList(idxkey, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.sls_dt()).setValueNE(SlsActReg_Ins02_DtlR.$err_flg, true);
				}
			}
		}

		protected void checkLotSubLotNo() {
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				if (isNull(dtlR.purc_ddlv_po_no())) {
					continue;
				}
				if ((MAC_LOT_NO_TYP.isMANUAL(dtlR.lot_no_typ()) && isNull(dtlR.lot_no()))
						|| (MAC_LOT_NO_TYP.isMANUAL(dtlR.sublot_no_typ()) && isNullOrNullVal(dtlR.sublot_no()))) {
					MCMessagePool.add(new MCMessage(MSBBL0513, dtlR.slo_no(), dtlR.slo_d_no(),
							dtlR.purc_ddlv_po_no(), dtlR.purc_ddlv_po_d_no(), dtlR.cst_cd(),
							toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3())));
					dtlR.err_flg(true);
				}
			}
		}
		
		/**
		 * 入金予定日のチェック処理を行う。
		 */
		protected void checkRcvSchdDt() {
			
			for (MCList<SlsActReg_Ins02_DtlR> dtlL : _dtlL.groupList(
					SlsActReg_Ins02_DtlR.$cst_cd, SlsActReg_Ins02_DtlR.$slo_no, SlsActReg_Ins02_DtlR.$iv_no, SlsActReg_Ins02_DtlR.$rcv_schd_dt)) {
				
				SlsActReg_Ins02_DtlR dtlR = dtlL.get(0);
				
				MAM_BP_R bcstR = getBpCache(dtlR.bcst_cd());
				
				if (!isNullOrNullVal(dtlR.iv_no()) && MAC_BILL_CL_TYP.isEACH_SLS(bcstR.bill_cl_typ()) && isNull(dtlR.rcv_schd_dt())) {
					
					MCMessagePool.add(new MCMessage(MSBBL0506, dtlR.slo_no(), dtlR.iv_no(), dtlL.size()));
					dtlL.setValueNE(SlsActReg_Ins02_DtlR.$err_flg, true);
				}
			}
		}
		
		/**
		 * データの補完処理を行う。
		 */
		protected void crrctData() {
			
			if (_dtlL.isEmpty()) {
				return;
			}
			
			setPegNo(SlsActReg_Ins02_DtlR.$peg_no, _dtlL);
			
			setAcDt();
			
			setArDpt();
			
			setBillBasisDt();
			
			setBillCrryovrTimes();
			
			setSlsTgtTyp();
			
			setShipDlvSlipMultiFlg();
			
			calcQty();
			
			setDpt();
			
			setSlsActDIo();
			
			setCrtLotFlg();
			
			setLotNo();
			
			checkLotSubLotNo();
			
			setShipFrValidDt();
			
			calcPtaxCur();
			
			setPrntOutFlg();
		}
		
		/**
		 * 計上日を設定する。
		 */
		protected void setAcDt() {
			
			_dtlL.setColumnValue(SlsActReg_Ins02_DtlR.$ac_dt, SlsActReg_Ins02_DtlR.$sls_dt);
		}
		
		/**
		 * 債権部門を設定する。
		 */
		protected void setArDpt() {
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				if (isNull(dtlR.ar_dpt_cd())) {
					String arDptCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_AR_DPT_CD", "01"), MAPA_BP$F_GET_AR_DPT_CD(value(dtlR.cst_cd()), value(dtlR.ac_dt())));
					dtlR.ar_dpt_cd(arDptCd);
				}
			}
		}
		
		/**
		 * 請求起算日を設定する。
		 */
		protected void setBillBasisDt() {
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				MAM_BP_R bcstR = getBpCache(dtlR.bcst_cd());
				
				if (!MAC_BILL_CL_TYP.isEACH_SLS(bcstR.bill_cl_typ())) {
					dtlR.bill_basis_dt(dtlR.sls_dt());
				}
			}
		}
		
		/**
		 * 請求繰越回数を設定する。
		 */
		protected void setBillCrryovrTimes() {
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {	
				if (isNull(dtlR.bill_crryovr_times())) {
					MAM_ITM_R itmR = getItmCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
					if (!isNull(itmR.bill_crryovr_times())) {
						dtlR.bill_crryovr_times(dtlR.bill_crryovr_times());
					}
					else {
						MAM_BP_R cstR = getBpCache(dtlR.cst_cd());
						dtlR.bill_crryovr_times(cstR.bill_crryovr_times());
					}
				}
			}
		}
		
		/**
		 * 売上計上区分を設定する。
		 */
		protected void setSlsTgtTyp() {
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				if (!isNull(dtlR.purc_schd_no())) {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.DDLV_SLS.value());
				}
				else if (!isNull(dtlR.sls_basis_typ())) {
					if (MAC_SLS_BASIS_TYP.isIN_BASIS(dtlR.sls_basis_typ())) {
						dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.XFR_IN_SLS.value());
					}
					else if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(dtlR.sls_basis_typ())) {
						dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.ARRIVAL_SLS.value());
					}
				}
			}
		}
		
		/**
		 * 出荷時納品書明細複数を設定する。
		 */
		protected void setShipDlvSlipMultiFlg() {
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				
				if (!isNullOrNullVal(dtlR.iv_no()) && nvl(dtlR.dlv_slip_d_cnt(), MCNumber.ZERO).gt(1)) {
					dtlR.ship_dlv_slip_multi_flg(true);
					dtlR.ship_dlv_slip_d_no(null);
				}
			}
		}
		
		/**
		 * 売上数量を算出する。
		 */
		protected void calcQty() {
			
			MCList<MST_SLS_SCHD_R> shipRetL = getShipRetL();
			
			MCIndexKey ik = shipRetL.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {

				dtlR.base_unit_qty(dtlR.sls_schd_qty().subtract(dtlR.sls_qty()).subtract(dtlR.abort_qty()));
				
				MST_SLS_SCHD_R slsSchdR = shipRetL.getFirst(ik, dtlR.sls_schd_no());
				if (!isNull(slsSchdR)) {
					dtlR.base_unit_qty(dtlR.base_unit_qty().subtract(slsSchdR.getNumber("ship_ret_qty")));
				}
				
				MAVM_ITM_UNIT_R itmUnitR = getItmUnit(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				MAVM_ITM_UNIT_R itmBaseUnitR = getItmUnit(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.base_unit_cd());
				MCNumber convQty = rvrsBaseUnitConv(dtlR.base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ());
				// 取引単位数量→基準単位数量
				MCNumber baseUnitQty = convToBaseUnit(convQty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());

				if (isSame(dtlR.base_unit_qty(), baseUnitQty)) {
					dtlR.trd_unit_qty(convQty);
					dtlR.trd_unit_dec_place(itmUnitR.dec_place());
					dtlR.trd_unit_rnd_typ(itmUnitR.rnd_typ());
					dtlR.trd_unit_conv_base_qty(itmUnitR.conv_base_qty());
					dtlR.trd_unit_conv_qty(itmUnitR.conv_qty());
				}
				else {
					dtlR.trd_unit_qty(dtlR.base_unit_qty());
					dtlR.trd_unit_cd(itmBaseUnitR.unit_cd());
					dtlR.trd_unit_dec_place(itmBaseUnitR.dec_place());
					dtlR.trd_unit_rnd_typ(itmBaseUnitR.rnd_typ());
					dtlR.trd_unit_conv_base_qty(1);
					dtlR.trd_unit_conv_qty(1);
				}
			}
			
			MCIndexKey idxkey = _dtlL.createIndex(SlsActReg_Ins02_DtlR.$base_unit_qty);
			_dtlL.removeAll(_dtlL.subList(idxkey, MCNumber.ZERO));
		}
		
		/**
		 * 売上予定に紐づく出荷返品情報を取得する。
		 * @return 出荷返品リスト
		 */
		protected MCList<MST_SLS_SCHD_R> getShipRetL() {
			
			MCList<MST_SLS_SCHD_R> shipRetL = MCList.create(MST_SLS_SCHD_R.class);
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				if ((MSC_SLS_TGT_TYP.isXFR_IN_SLS(dtlR.sls_tgt_typ()) 
						|| MSC_SLS_TGT_TYP.isARRIVAL_SLS(dtlR.sls_tgt_typ()))) {
					shipRetL.add().sls_schd_no(dtlR.sls_schd_no());
				}
			}
			if (!shipRetL.isEmpty()) {
				MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
				dbWkDelete("MSBBB0020_MSW_SLS_SCHD_D01", slsSchdL_bldr.getBaseDbc());
				dbWkInsert("MSBBB0020_MSW_SLS_SCHD_I01", shipRetL, slsSchdL_bldr.getBaseDbc());
				
				shipRetL.addNumberColumn("ship_ret_qty");
				executeQuery(shipRetL, MSBBB0020_MST_SLS_SCHD_S08());
				
				dbWkDelete("MSBBB0020_MSW_SLS_SCHD_D02", slsSchdL_bldr.getBaseDbc());
			}
			
			return shipRetL;
		}
		
		/**
		 * ロット作成FLGを設定する。
		 */
		protected void setCrtLotFlg() {
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				if (MSC_SLS_TGT_TYP.isDDLV_SLS(dtlR.sls_tgt_typ()) && dtlR.sync_flg()) {
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ()) && isNull(dtlR.lot_no())) {
						dtlR.crt_lot_flg(true);
					}
				}
			}
		}
		
		/**
		 * 出荷元期限を設定する。
		 */
		protected void setShipFrValidDt() {
			
			initDbcCachePurcActD(_dtlL);
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				if (_cachePad != null) {
					MST_PURC_ACT_D_R padR = _cachePad.get(dtlR.purc_act_d_no(), dtlR.purc_act_d_seq());
					MCNumber cnt = padR.getNumberNE("valid_cnt");
					if (isNull(cnt) || !cnt.eq(1)) {
						dtlR.ship_fr_valid_dt(null);
					}
					else {
						dtlR.ship_fr_valid_dt(padR.getDate("ship_fr_valid_dt"));
					}
				}
			}
		}
		
		/**
		 * 部門の組織変更の対応を行う。
		 */
		protected void setDpt() {
			// 負担部門
			MAUCL_DptUtil.setDpt(_dtlL, SlsActReg_Ins02_DtlR.$bd_dpt_cd, SlsActReg_Ins02_DtlR.$ac_dt);
			
			// 売上部門
			MAUCL_DptUtil.setDpt(_dtlL, SlsActReg_Ins02_DtlR.$sls_dpt_cd, SlsActReg_Ins02_DtlR.$ac_dt);
			
			// 債権部門
			MAUCL_DptUtil.setDpt(_dtlL, SlsActReg_Ins02_DtlR.$ar_dpt_cd, SlsActReg_Ins02_DtlR.$ac_dt);
		}
		
		/**
		 * 納品書即時発行を設定する。
		 */
		protected void setPrntOutFlg() {
			
			_dtlL.setValueNE(SlsActReg_Ins02_DtlR.$prnt_out_flg, !up0().non_prnt_dlv_flg());
		}
		
		/**
		 * 納税通貨関連項目を設定する。
		 */
		protected void calcPtaxCur() {
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				
				if (!isNull(dtlR.ptax_cur_cd())) {
					
					dtlR.ptax_cur_upri(convCur(
							dtlR.trd_cur_upri(),
							dtlR.ptax_xrate(),
							dtlR.ptax_upri_dec_place(),
							dtlR.xrate_rnd_typ()));
					dtlR.ptax_cur_amt(convCur(
							dtlR.trd_cur_amt(),
							dtlR.ptax_xrate(),
							dtlR.ptax_amt_dec_place(),
							dtlR.xrate_rnd_typ()));
					dtlR.ptax_cur_tax_amt(convCur(
							dtlR.trd_cur_tax_amt(),
							dtlR.ptax_xrate(),
							dtlR.ptax_amt_dec_place(),
							dtlR.xrate_rnd_typ()));
					dtlR.ptax_cur_dscnt_amt(convCur(
							dtlR.trd_cur_dscnt_amt(),
							dtlR.ptax_xrate(),
							dtlR.ptax_amt_dec_place(),
							dtlR.xrate_rnd_typ()));
				}
			}
		}
		/**
		 * データ補完処理
		 */
		protected void setSlsActDIo() {
			int i = 0;
			int ioCnt = 0;
			
			MCList<MSW_SLS_ACT_R> wkL = MCList.create(MSW_SLS_ACT_R.class);
			MSW_SLS_ACT_R t_SlsAct = MSW_SLS_ACT_R.create("SLSACT");
			MCList<MST_SLS_SCHD_R> wkKeyL = MCList.create(MST_SLS_SCHD_R.class);
			execDbWkDelete("MSBBB0020_MSW_SLS_ACT_D01", t_SlsAct);
			
			initDptCache();
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				
				dtlR.wg_cd(getDptCache(dtlR.ac_dt(), dtlR.sls_dpt_cd()).wg_cd());
				// 売上実績WK
				MSW_SLS_ACT_R wkR = MSW_SLS_ACT_R.create();
				wkR.sls_schd_no(dtlR.sls_schd_no());
				wkR.unit_cd(dtlR.trd_unit_cd());
				wkR.tax_cd(dtlR.tax_cd());
				wkL.add(wkR);
				
				// 売上予定キーWK
				MST_SLS_SCHD_R wkKeyR = MST_SLS_SCHD_R.create();
				wkKeyR.sls_schd_no(dtlR.sls_schd_no());
				wkKeyL.add(wkKeyR);
			}
			dbInsert("MSBBB0020_MSW_SLS_ACT_I01", wkL, MCQueryApiBuilder.create(t_SlsAct));
			dbWkInsert("MSBBB0020_MSW_SLS_SCHD_I02", wkKeyL, MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("SLSSCHD")).getBaseDbc());
			
			MCList<SlsActReg_Ins02_DtlR> allTmpL = MCList.create(SlsActReg_Ins02_DtlR.class);
			executeQuery(allTmpL, MSBBB0020_MST_SLS_SCHD_S03());
			if (!allTmpL.isEmpty()) {
				MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
				for (SlsActReg_Ins02_DtlR r : allTmpL) {
					MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create();
					shipSchdR.ship_schd_no(r.ship_schd_no());
					shipSchdL.add(shipSchdR);
				}
				MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
				dbWkDelete("MSBBB0020_MSW_SHIP_SCHD_D01", shipSchdL_bldr.getBaseDbc());
				dbWkInsert("MSBBB0020_MSW_SHIP_SCHD_I01", shipSchdL, shipSchdL_bldr.getBaseDbc());
				
				MCList<SlsActReg_Ins02_DtlR> allTmp2L = MCList.create(SlsActReg_Ins02_DtlR.class);
				executeQuery(allTmp2L, MSBBB0020_MSW_SHIP_SCHD_KEY_S01());
				MCIndexKey shipSchdKey = allTmp2L.createIndex(SlsActReg_Ins02_DtlR.$ship_schd_no);
				for (SlsActReg_Ins02_DtlR r : allTmpL) {
					SlsActReg_Ins02_DtlR tgtR = allTmp2L.getFirst(shipSchdKey, r.ship_schd_no());
					if (!isNull(tgtR)) {
						r.sls_lot_no(tgtR.sls_lot_no());
						r.sls_sublot_no(tgtR.sls_sublot_no());
						r.ship_alloc_sts_no(tgtR.ship_alloc_sts_no());
						r.loc_cd(tgtR.loc_cd());
						r.str_ln_cd(tgtR.str_ln_cd());
					}
				}
			}
			MCIndexKey idxKey = allTmpL.createIndex(SlsActReg_Ins02_DtlR.$sls_schd_no);

			initCalc01Hdr();
			executeQuery(_calc01HdrL, MSBBB0020_MST_SLS_SCHD_S07());
			_idxCalc01HdrKey = _calc01HdrL.createIndex("sls_schd_no");
			
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				int rowIndex = dtlR.getParamRowIndex();
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				
				dtlR.base_cur_cd(getCo().base_cur_cd());
				dtlR.ptax_cur_cd(getCo().ptax_cur_cd());
				dtlR.xrate_cd(getCo().sls_xrate_cd());
				
				boolean multiFlg = false;
				MCList<SlsActReg_Ins02_DtlR> tmpL = allTmpL.subList(idxKey, dtlR.sls_schd_no());
				if (!isNull(tmpL) && tmpL.size() > 1) {
					createMap_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR_Multi().copyValue(dtlR, tmpL.get(0));
					multiFlg = true;
				}
				else {
					createMap_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR().copyValue(dtlR, tmpL.get(0));
				}
				dtlR.setParamRowIndex(rowIndex);
				
				dtlR.base_unit_qty(
						convToBaseUnit(
								dtlR.trd_unit_qty(),
								dtlR.trd_unit_conv_base_qty(),
								dtlR.trd_unit_conv_qty(),
								dtlR.base_unit_dec_place(),
								dtlR.base_unit_rnd_typ()
						)
				);
				// 元の単価を保持
				dtlR.org_trd_cur_upri(dtlR.trd_cur_upri());
				
				calcTrdCurUpri(dtlR);
				
				dtlR.cost_amt(MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), dtlR.base_amt_dec_place()));
				
				// 明細紐付けＮＯをセット
				dtlR.dtl_peg_no(++i);
				
				// 売上対象区分
				if (!isNull(dtlR.purc_schd_no()) || dtlR.ddlv_iv_grp_flg()) {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.DDLV_SLS.value());
					dtlR.ship_act_service_exec_flg(true);
					
					if (!dtlR.sync_flg()) {
						dtlR.sls_lot_no(dtlR.lot_no());
						dtlR.sls_sublot_no(dtlR.sublot_no());
					}
				}
				else if (!isNull(dtlR.sls_basis_typ()) && MAC_SLS_BASIS_TYP.isIN_BASIS(dtlR.sls_basis_typ())) {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.XFR_IN_SLS.value());
				}
				else if (!isNull(dtlR.sls_basis_typ()) && MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(dtlR.sls_basis_typ())) {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.ARRIVAL_SLS.value());
				}
				
				// 明細に紐づく詳細部を取得
				MCList<SlsActReg_Ins02_IoR> ioL = MCList.create(SlsActReg_Ins02_IoR.class);
				
				if (!isNull(dtlR.purc_ddlv_po_no()) || dtlR.ddlv_iv_grp_flg()) {
					// 仕入後の場合
					if (!dtlR.sync_flg() && !isNull(dtlR.purc_ddlv_po_no())) {
						executeQuery(ioL, MSBBB0020_MST_ARR_ACT_S01(), dtlR);
						ioL.setValue(SlsActReg_Ins02_IoR.$ship_alloc_sts_no, dtlR.ship_alloc_sts_no());
						
						if (ioL.size() == 1) {
							ioL.get(0).trd_unit_cd(dtlR.trd_unit_cd());
							ioL.get(0).trd_unit_qty(dtlR.trd_unit_qty());
							ioL.get(0).base_unit_cd(dtlR.base_unit_cd());
							ioL.get(0).base_unit_qty(dtlR.base_unit_qty());
							if (isNull(dtlR.loc_cd())) {
								dtlR.loc_cd(ioL.get(0).loc_cd());
							}
							if (isNull(dtlR.str_ln_cd())) {
								dtlR.str_ln_cd(ioL.get(0).str_ln_cd());
							}
							if (isNull(dtlR.lot_no())) {
								dtlR.lot_no(ioL.get(0).lot_no());
							}
							if (isNull(dtlR.sublot_no())) {
								dtlR.sublot_no(ioL.get(0).sublot_no());
							}
						}
					}
					else {
						SlsActReg_Ins02_IoR ioR = SlsActReg_Ins02_IoR.create();
						copy(ioR, dtlR, createMap_SlsActReg_Ins02_IoR_SlsActReg_Ins02_DtlR());
						ioL.add(ioR);
					}
				}
				else {
					if (!isNullOrNullVal(dtlR.iv_no()) || !isNull(dtlR.dlv_slip_d_no())) {
						if (!isNull(dtlR.dlv_slip_d_no())) {
							executeQuery(ioL, MSBBB0020_MST_SLS_SCHD_S06(), dtlR);
						}
						else {
							executeQuery(ioL, MSBBB0020_MST_SLS_SCHD_S04(), dtlR);
						}
						if (ioL.size() == 1) {
							ioL.get(0).base_unit_cd(dtlR.base_unit_cd());
							ioL.get(0).base_unit_qty(dtlR.base_unit_qty());
							if (isNull(dtlR.loc_cd())) {
								dtlR.loc_cd(ioL.get(0).loc_cd());
							}
							if (isNull(dtlR.str_ln_cd())) {
								dtlR.str_ln_cd(ioL.get(0).str_ln_cd());
							}
							if (isNull(dtlR.lot_no())) {
								dtlR.lot_no(ioL.get(0).lot_no());
							}
							if (isNull(dtlR.sublot_no())) {
								dtlR.sublot_no(ioL.get(0).sublot_no());
							}
							
							if (isNull(ioL.get(0).trd_unit_cd())) {
								ioL.get(0).trd_unit_cd(dtlR.trd_unit_cd());
								ioL.get(0).trd_unit_qty(dtlR.trd_unit_qty());
							}
							else if (isSame(ioL.get(0).trd_unit_cd(), dtlR.trd_unit_cd())) {
								ioL.get(0).trd_unit_qty(dtlR.trd_unit_qty());
							}
						}
					}
					else {
						for (SlsActReg_Ins02_DtlR tmpR : tmpL) {
							SlsActReg_Ins02_IoR ioR = SlsActReg_Ins02_IoR.create();
							ioR.sno1(dtlR.sno1());
							ioR.sno2(dtlR.sno2());
							ioR.sno3(dtlR.sno3());
							ioR.sno4(dtlR.sno4());
							ioR.gd_cd(dtlR.gd_cd());
							
							if (!isNull(tmpR.ship_alloc_sts_no())) {
								MST_SHIP_ALLOC_STS_R shipAllocStsR = MST_SHIP_ALLOC_STS_R.create();
								MST_SHIP_ALLOC_STS_R t_SAS = MST_SHIP_ALLOC_STS_R.create("SAS");
								MCQueryApiBuilder shipAllocStsR_bldr = MCQueryApiBuilder.create(t_SAS);
								shipAllocStsR_bldr.setWhere(t_SAS.ship_alloc_sts_no.eq(bind("1")), tmpR.ship_alloc_sts_no());
								dbSelect("MSBBB0020_MST_SHIP_ALLOC_STS_S01", shipAllocStsR, shipAllocStsR_bldr);
								
								ioR.loc_cd(shipAllocStsR.ship_loc_cd());
								ioR.str_ln_cd(shipAllocStsR.ship_str_ln_cd());
								if (!isNullOrNullVal(dtlR.sls_lot_no())) {
									ioR.lot_no(dtlR.sls_lot_no());
									ioR.sublot_no(dtlR.sls_sublot_no());
								}
								else {
									ioR.lot_no(nvl(shipAllocStsR.lot_no(), MAC_STR.NULL_VAL.value()));
									ioR.sublot_no(nvl(shipAllocStsR.sublot_no(), MAC_STR.NULL_VAL.value()));
								}
								
								if (multiFlg) {
									ioR.trd_unit_cd(shipAllocStsR.trd_unit_cd());
									ioR.trd_unit_qty(shipAllocStsR.trd_unit_qty());
									ioR.base_unit_cd(shipAllocStsR.base_unit_cd());
									ioR.base_unit_qty(shipAllocStsR.base_unit_qty());
								}
								else {
									ioR.trd_unit_cd(dtlR.trd_unit_cd());
									ioR.trd_unit_qty(dtlR.trd_unit_qty());
									ioR.base_unit_cd(dtlR.base_unit_cd());
									ioR.base_unit_qty(dtlR.base_unit_qty());
								}
								ioR.ship_alloc_sts_no(tmpR.ship_alloc_sts_no());
							}
							else {
								ioR.loc_cd(dtlR.loc_cd());
								ioR.str_ln_cd(dtlR.str_ln_cd());
								ioR.lot_no(dtlR.sls_lot_no());
								ioR.sublot_no(dtlR.sls_sublot_no());
								ioR.trd_unit_cd(dtlR.trd_unit_cd());
								ioR.trd_unit_qty(dtlR.trd_unit_qty());
								ioR.base_unit_cd(dtlR.base_unit_cd());
								ioR.base_unit_qty(dtlR.base_unit_qty());
							}
							ioL.add(ioR);
						}
					}
				}
				
				for (SlsActReg_Ins02_IoR tmpIoR : ioL){
					tmpIoR.sync_flg(dtlR.sync_flg());	// 同時計上ＦＬＧ
					tmpIoR.dtl_peg_no(dtlR.dtl_peg_no());
					tmpIoR.io_peg_no(++ioCnt);
				}
				
				_ioL.addAll(ioL);
			}
			// 荷姿単位・荷姿数量
			setItmUnitCache(_dtlL);
			MCIndexKey ik = _ioL.createIndex(SlsActReg_Ins02_IoR.$dtl_peg_no);
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				MCList<SlsActReg_Ins02_IoR> tmpIoL = _ioL.subList(ik, dtlR.dtl_peg_no());
				for (SlsActReg_Ins02_IoR tmpIoR : tmpIoL) {
					if (isPack(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), tmpIoR.trd_unit_cd())) {
						tmpIoR.pack_unit_cd(tmpIoR.trd_unit_cd());
						tmpIoR.pack_unit_qty(tmpIoR.trd_unit_qty());
					}
					else {
						tmpIoR.pack_unit_cd(tmpIoR.base_unit_cd());
						tmpIoR.pack_unit_qty(tmpIoR.base_unit_qty());
					}
				}
			}
			
			// ヘッダ紐付けＮＯの設定
			// 同一受注ＮＯ、売上日、計上日、請求起算日、売上担当者、売上部門、為替レート、納税為替レート、納品書ＮＯ、インボイスＮＯ
			// この場合、ヘッダ紐付けＮＯを同じにする（1ヘッダ、複数明細の形式）
			// 同一売上対象区分のもの
			String[] sameKeys = new String[] {
					SlsActReg_Ins02_DtlR.$sls_tgt_typ,
					SlsActReg_Ins02_DtlR.$ship_tm, SlsActReg_Ins02_DtlR.$dlv_tm,
					SlsActReg_Ins02_DtlR.$slo_no, SlsActReg_Ins02_DtlR.$sls_dt, SlsActReg_Ins02_DtlR.$ac_dt, SlsActReg_Ins02_DtlR.$bill_basis_dt,
					SlsActReg_Ins02_DtlR.$sls_usr_cd, SlsActReg_Ins02_DtlR.$sls_dpt_cd, SlsActReg_Ins02_DtlR.$ar_dpt_cd, 
					SlsActReg_Ins02_DtlR.$xrate, SlsActReg_Ins02_DtlR.$ptax_xrate, SlsActReg_Ins02_DtlR.$hdr_peg_no, SlsActReg_Ins02_DtlR.$dlv_slip_no, SlsActReg_Ins02_DtlR.$iv_no
					,SlsActReg_Ins02_DtlR.$purc_ddlv_dlv_slip_no
			};
			int hdrPegNo = 0;
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				if (isNull(dtlR.hdr_peg_no())) {
					
					dtlR.hdr_peg_no(++hdrPegNo);
					Comparable<?>[] sameVals = new Comparable[] {
							dtlR.sls_tgt_typ(),
							dtlR.ship_tm(), dtlR.dlv_tm(),
							dtlR.slo_no(), dtlR.sls_dt(), dtlR.ac_dt(), dtlR.bill_basis_dt(),
							dtlR.sls_usr_cd(), dtlR.sls_dpt_cd(), dtlR.ar_dpt_cd(), 
							dtlR.xrate(), dtlR.ptax_xrate(), null, dtlR.dlv_slip_no(), dtlR.iv_no()
							,dtlR.purc_ddlv_dlv_slip_no()
					};
					MCList<SlsActReg_Ins02_DtlR> tmpList = _dtlL.subList(sameKeys, sameVals);
					for (SlsActReg_Ins02_DtlR tmpR : tmpList) {
						if (tmpR.cst_iv_flg()) {
							tmpR.hdr_peg_no(++hdrPegNo);
						}
						else {
							tmpR.hdr_peg_no(dtlR.hdr_peg_no());
						}
					}
				}
			}
		}
		
		/**
		 * 取引通貨単価を算出する。
		 * @param dtlR 売上チェックRow
		 */
		protected void calcTrdCurUpri(SlsActReg_Ins02_DtlR dtlR) {
					
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			
			ConvQtyAmtUtil_Calc01_HdrR up0R = null;
			ConvQtyAmtUtil_Calc01_Dtl1R up1R = null;
			
			up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
			getCredSrcBySlsSchd(up0R, dtlR.sls_schd_no());
			
			up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			copy(up1R, dtlR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_SlsActReg_Ins02_DtlR());
			
			ope.up0().add(up0R);
			ope.up1().add(up1R);
		
			if (!ope.up0().isEmpty()) {
				
				setPegNo(ope.up0());
				
				setPegNo(ope.up1());
				setPegNo(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, ope.up1());
				
				ope.exec();
				
				dtlR.trd_cur_upri(ope.down0().get(0).trd_cur_upri());
				dtlR.trd_cur_dscnt_amt(ope.down0().get(0).trd_cur_dscnt_amt());
			}
		}
		
		/**
		 * ループグループを設定する。
		 */
		protected void setLoopGrp() {
			
			_dtlL.sort(SlsActReg_Ins02_DtlR.$hdr_peg_no);
			
			int cnt = 0;
			int loopGrpNo = 0;
			SlsActReg_Ins02_DtlR oldR = null;
			for (SlsActReg_Ins02_DtlR dtlR : _dtlL) {
				if (!isNull(oldR) && !isSame(dtlR.hdr_peg_no(), oldR.hdr_peg_no())) {
					if (_loopCnt <= cnt) {
						cnt = 0;
						loopGrpNo++; 
					}
				}
				oldR = dtlR;
				cnt++;
				dtlR.loop_grp_no(loopGrpNo);
			}
		}
		
		/**
		 * 仕入実績登録サービスの更新前チェック（共通）を呼び出す。
		 * @param dtlL 売上明細リスト
		 */
		protected void callPurcActRegSvChk03(MCList<SlsActReg_Ins02_DtlR> dtlL) {
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = makePurcActRegSvChk03(dtlL);
			
			if (!ope.up0().isEmpty()) {
				
				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();
				// ヘッダ、明細、詳細のいずれかでもエラーならばエラー
				copyErrFlg(dtlL, ope.down0());
				copyErrFlg(dtlL, ope.down1());
				copyErrFlg(dtlL, ope.down2());
			}
		}

		/**
		 * 仕入実績登録サービスの更新前チェック（共通）の電文を作成する。
		 * @param chkL 売上明細リスト
		 * @return 仕入実績登録サービスの更新前チェック（共通）のオペレーション
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 makePurcActRegSvChk03(MCList<SlsActReg_Ins02_DtlR> chkL) {
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			
			chkL.setDateNE("today", getToday());
			
			MCList<MST_SLS_SCHD_R> wkL = MCList.create(MST_SLS_SCHD_R.class);
			for (SlsActReg_Ins02_DtlR chkR : chkL) {
				if (chkR.sync_flg()) {
					MST_SLS_SCHD_R wkR = MST_SLS_SCHD_R.create();
					wkR.sls_schd_no(chkR.sls_schd_no());
					wkR.addDateColumn(SlsActReg_Ins02_DtlR.$sls_dt, chkR.sls_dt());
					wkL.add(wkR);
				}
			}
			if (wkL.isEmpty()) {
				return ope;
			}
			
			MCList<Purc_Chk03_HdrR> oUp0L = MCList.create(Purc_Chk03_HdrR.class);
			MCList<Purc_Chk03_DtlR> oUp1L = MCList.create(Purc_Chk03_DtlR.class);
			oUp1L.addNumberColumn("po_base_unit_qty");
			oUp1L.addStringColumn("purc_amt_rnd_typ");
			oUp1L.addStringColumn("ship_pr_loc_cd");
			oUp1L.addStringColumn("ship_pr_str_ln_cd");
			oUp1L.addStringColumn("pr_loc_wg_cd");
			MCIndexKey ikUp0 = null;
			MCIndexKey ikUp1 = null;

			for (MCList<MST_SLS_SCHD_R> tmpWkL : wkL.groupList(SlsActReg_Ins02_DtlR.$sls_dt)) {
				MCList<Purc_Chk03_HdrR> tmpOUp0L = oUp0L.shallowClone();
				MCList<Purc_Chk03_DtlR> tmpOUp1L = oUp1L.shallowClone();
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
				dbWkDelete("MSBBB0020_MSW_SLS_SCHD_D03", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBBB0020_MSW_SLS_SCHD_I03", tmpWkL, wkL_bldr.getBaseDbc());
				
				MCRow row = MCRow.create();
				row.addDateColumn("today", tmpWkL.getDate(0, SlsActReg_Ins02_DtlR.$sls_dt));

				executeQuery(tmpOUp0L, MSBBB0020_MST_SLS_SCHD_S05(), row);
				executeQuery(tmpOUp1L, MSBBB0020_MST_PO_D_S01(), row);
				
				dbWkDelete("MSBBB0020_MSW_SLS_SCHD_D04", wkL_bldr.getBaseDbc());
				
				oUp0L.addAll(tmpOUp0L);
				oUp1L.addAll(tmpOUp1L);
			}
			ikUp0 = oUp0L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
			ikUp1 = oUp1L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
			
			for (SlsActReg_Ins02_DtlR chkR : chkL) {
				if (chkR.sync_flg()) {
					Purc_Chk03_HdrR oUp0 = oUp0L.getFirst(ikUp0, chkR.sls_schd_no());	// ヘッダ
					Purc_Chk03_DtlR oUp1 = oUp1L.getFirst(ikUp1, chkR.sls_schd_no());	// 明細
					Purc_Chk03_IoR oUp2 = ope.up2().createRow();	// 詳細
					
					// ヘッダ情報の設定
					copy(oUp0, chkR, createMap_Purc_Chk03_HdrR_SlsActReg_Ins02_DtlR());
					oUp0.peg_no(chkR.peg_no());
					ope.up0().add(oUp0);
					chkR.po_no(oUp0.po_no());
					
					// 明細情報の設定
					copy(oUp1, chkR, createMap_Purc_Chk03_DtlR_SlsActReg_Ins02_DtlR());
					chkR.loc_cd(oUp1.dlv_loc_cd());
					chkR.str_ln_cd(oUp1.str_ln_cd());
					oUp1.hdr_peg_no(oUp0.peg_no());
					oUp1.peg_no(oUp0.peg_no());
					
					// 基準単位数
					if (isSame(oUp1.trd_unit_cd(), oUp1.base_unit_cd())) {
						oUp1.base_unit_qty(oUp1.trd_unit_qty());
					}
					else {
						oUp1.base_unit_qty(getBaseUnitQty(
								oUp1.trd_unit_qty(),
								oUp1.trd_unit_cd(),
								oUp1.base_unit_cd(),
								oUp1.itm_cd(),
								oUp1.itm_sub1(),
								oUp1.itm_sub2(),
								oUp1.itm_sub3()));
					}
					
					// 取引通貨明細値引金額
					MAM_CUR_R trdCurR = getCur(chkR.trd_cur_cd());
					if (!isNull(oUp1.trd_cur_dscnt_amt())) {
						oUp1.trd_cur_dscnt_amt(
							oUp1.trd_cur_dscnt_amt().multiply(oUp1.base_unit_qty())
							.divide(oUp1.getNumberNE("po_base_unit_qty"), trdCurR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(oUp1.getStringNE("purc_amt_rnd_typ")))
						);
					}
					ope.up1().add(oUp1);
					
					// 詳細情報の設定
					copy(oUp2, oUp1, createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR());
					
					// ロット作成
					if (chkR.crt_lot_flg()) {
						oUp2.crt_lot_flg(true);
					}
					
					oUp2.dtl_peg_no(oUp1.peg_no());
					oUp2.peg_no(oUp2.dtl_peg_no());
					
					if (isPack(oUp1.itm_cd(), oUp1.itm_sub1(), oUp1.itm_sub2(), oUp1.itm_sub3(), oUp1.trd_unit_cd())){
						oUp2.pack_unit_cd(oUp2.trd_unit_cd());
						oUp2.pack_unit_qty(oUp2.trd_unit_qty());
					}
					else {
						oUp2.pack_unit_cd(oUp2.base_unit_cd());
						oUp2.pack_unit_qty(oUp2.base_unit_qty());
					}
					
					oUp2.gi_loc_cd(oUp1.getStringNE("ship_pr_loc_cd"));
					oUp2.gi_str_ln_cd(oUp1.getStringNE("str_ln_cd"));
					oUp2.gi_wg_cd(oUp1.getStringNE("pr_loc_wg_cd"));
					oUp2.from_gd_cd(oUp1.gd_cd());
					
					ope.up2().add(oUp2);
				}
			}
			
			return ope;
		}
		
		/**
		 * 輸出実績サービスのインボイス更新前チェックを実行する。
		 * @param dtlL 売上明細リスト
		 */
		protected void callExActSvChk02(MCList<SlsActReg_Ins02_DtlR> dtlL) {
			
			MSBEL_ExActService.ExAct_Chk02 ope = makeExActSvChk02(dtlL);
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(dtlL, ope.down0());
			}
		}	
		
		/**
		 * 輸出実績サービスのインボイス更新前チェックの電文を作成する。
		 * @param chkL
		 * @return
		 */
		protected MSBEL_ExActService.ExAct_Chk02 makeExActSvChk02(MCList<SlsActReg_Ins02_DtlR> chkL) {
			MSBEL_ExActService.ExAct_Chk02 ope = MSBEL_ExActService.crtExAct_Chk02();
			ExAct_Upd02_DtlR oUp0;
			MCList<SlsActReg_Ins02_DtlR> ivGrL = chkL.groupBy(
					SlsActReg_Ins02_DtlR.$peg_no,
					SlsActReg_Ins02_DtlR.$sls_tgt_typ,
					SlsActReg_Ins02_DtlR.$cst_iv_flg,
					SlsActReg_Ins02_DtlR.$iv_no);
			for (SlsActReg_Ins02_DtlR chkR : ivGrL) {
				if (chkR.cst_iv_flg()
						&& !isNullOrNullVal(chkR.iv_no())
						&& !MAC_VIA_DLV_TYP.isVIA(chkR.via_dlv_typ())) {
					oUp0 = ExAct_Upd02_DtlR.create();
					oUp0.peg_no(chkR.peg_no());
					oUp0.iv_no(chkR.iv_no());
					oUp0.cmpl_flg(true);
					ope.up0().add(oUp0);
				}
			}
			
			return ope;
		}
		
		/**
		 * 仕入実績登録サービスの仕入実績更新を実行する。
		 * @param dtlL 売上明細リスト
		 */
		protected void callPurcActSvUpd02(MCList<SlsActReg_Ins02_DtlR> dtlL) {
			
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService.crtPurc_Upd02();
			
			for (SlsActReg_Ins02_DtlR chkR : dtlL) {
				// ヘッダ・明細・詳細は１：１：１となるためpeg_noはすべて同じ
				if (chkR.sync_flg() && !chkR.err_flg()) {
					Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
					opeHdr.peg_no(chkR.peg_no());
					ope.up1().add(opeHdr);
					
					Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
					opeDtl.peg_no(chkR.peg_no());
					ope.up2().add(opeDtl);
					
					Purc_Ins01_IoR opeIo = ope.up3().createRow();
					opeIo.peg_no(chkR.peg_no());
					ope.up3().add(opeIo);
				}
			}
			
			if (!ope.up1().isEmpty()) {
				
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.up0().amt_calc_flg(true);
				ope.exec();
				// 仕入実績サービスからの下り電文をコピーする
				String[] cols = new String[] {SlsActReg_Ins02_DtlR.$purc_act_no, SlsActReg_Ins02_DtlR.$purc_act_seq};
				copyByPegNo(dtlL, cols, ope.down0(), cols);
				
				cols = new String[] {SlsActReg_Ins02_DtlR.$purc_act_d_no, SlsActReg_Ins02_DtlR.$purc_act_d_seq};
				copyByPegNo(dtlL, cols, ope.down1(), cols);
				
				cols = new String[] {SlsActReg_Ins02_DtlR.$purc_act_io_no, SlsActReg_Ins02_DtlR.$purc_act_io_seq, SlsActReg_Ins02_DtlR.$arr_act_no};
				copyByPegNo(dtlL, cols, ope.down2(), cols);
			}
		}
		
		/**
		 * 輸出実績サービスの更新（Ｉ／Ｖ完了）を実行する。
		 * @param dtlL 売上明細リスト
		 */
		protected void callExActSvUpd02(MCList<SlsActReg_Ins02_DtlR> dtlL) {
			
			MSBEL_ExActService.ExAct_Upd02 ope = MSBEL_ExActService.crtExAct_Upd02();
			
			MCList<SlsActReg_Ins02_DtlR> ivGrL = dtlL.groupBy(
					SlsActReg_Ins02_DtlR.$peg_no,
					SlsActReg_Ins02_DtlR.$sls_tgt_typ,
					SlsActReg_Ins02_DtlR.$cst_iv_flg,
					SlsActReg_Ins02_DtlR.$iv_no,
					SlsActReg_Ins02_DtlR.$via_dlv_typ);
			
			for (SlsActReg_Ins02_DtlR dtlR : ivGrL) {
				
				if(dtlR.cst_iv_flg()
						&& !isNullOrNullVal(dtlR.iv_no())
						&& !MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ())) {
						ExAct_Upd02_DtlR up0 = ExAct_Upd02_DtlR.create();
						up0.peg_no(dtlR.peg_no());
						up0.iv_no(dtlR.iv_no());
						up0.cmpl_flg(true);
						ope.up0().add(up0);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 与信サービスの更新（Ｉ／Ｖ完了）を実行する。
		 * @param dtlL 売上明細リスト
		 */
		protected void callCredSvUpd01(MCList<SlsActReg_Ins02_DtlR> dtlL) {
			
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = null;
			MCNumber credAmtSum = null;
			MCNumber credAmt = null;
			
			MCIndexKey idxkey = dtlL.createIndex(SlsActReg_Ins02_DtlR.$cst_cd, SlsActReg_Ins02_DtlR.$trd_cur_cd, SlsActReg_Ins02_DtlR.$trd_ptn_typ);
			
			for (SlsActReg_Ins02_DtlR grpR : dtlL.groupBy(SlsActReg_Ins02_DtlR.$cst_cd, SlsActReg_Ins02_DtlR.$trd_cur_cd, SlsActReg_Ins02_DtlR.$trd_ptn_typ)) {
				
				credAmtSum = MCNumber.ZERO;
				up0R = Cred_Upd01_CndR.create();
				
				up0R.cst_cd(grpR.cst_cd());
				up0R.cur_cd(grpR.trd_cur_cd());
				up0R.trd_ptn_typ(grpR.trd_ptn_typ());
				up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				
				MCList<SlsActReg_Ins02_DtlR> subDtlL = dtlL.subList(idxkey, grpR.cst_cd(), grpR.trd_cur_cd(), grpR.trd_ptn_typ());
				
				for (SlsActReg_Ins02_DtlR dtlR : subDtlL) {
					
					if (!isNull(dtlR.sls_schd_no())) {
						
						credAmt = calcCredAmt(dtlR.sls_schd_no(), dtlR.base_unit_qty(), MCNumber.ZERO,
								dtlR.sync_flg(), dtlR.sls_tgt_typ(), dtlR.sls_act_no(), dtlR.slo_d_no(), false, false);
						
						credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
					}
				}
				
				up0R.amt(credAmtSum);
				
				ope.up0().add(up0R);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 売上実績サービスの登録を実行する。
		 * @param dtlL 売上明細リスト
		 */
		protected void callSlsActSvUpd01(MCList<SlsActReg_Ins02_DtlR> dtlL) {
			
			dtlL.sort(SlsActReg_Ins02_DtlR.$hdr_peg_no, SlsActReg_Ins02_DtlR.$dtl_peg_no);
			
			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			MCNumber preHdrPegNo = MCNumber.ZERO;
			
			for (SlsActReg_Ins02_DtlR dtlR : dtlL) {
				
				SlsAct_Upd01_HdrR up0 = SlsAct_Upd01_HdrR.create();
				MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
				
				if (!isSame(preHdrPegNo, dtlR.hdr_peg_no())) {
					up0 = makeSlsActHdr(dtlR);
					ope.up0().add(up0);
				}
				up1 = makeSlsActDtl(up0, dtlR , dtlL);
				ope.up1().addAll(up1);
				ope.up2().addAll(makeSlsActIo(up1, dtlL));
				
				preHdrPegNo = dtlR.hdr_peg_no();
			}
			
			if (ope.up0().size() > 0) {
				ope.exec();
			}
		}
		
		/**
		 * 登録対象の売上明細リストを取得する。
		 * @param dtlL 売上明細リスト
		 * @return 登録対象の売上明細リスト
		 */
		protected MCList<SlsActReg_Ins02_DtlR> getNoErrList(MCList<SlsActReg_Ins02_DtlR> dtlL) {

			return dtlL.subList(r->isRegTgt(r));
		}
		
		/**
		 * 引数に指定された売上明細が登録対象かどうかを判定する。
		 * @param dtlR 売上明細行
		 * @return エラーFLGがオフかつスキップFLGがオフの場合はtrue
		 */
		protected boolean isRegTgt(SlsActReg_Ins02_DtlR dtlR) {
			
			return !dtlR.err_flg();
		}
		
		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSvUpd01() {
			MSBEL_IoActService.crtIoAct_Upd01().exec();
		}
		
		/**
		 * 初期化処理
		 */
		protected void initProc() {

			initLogger();
		}
		
		/**
		 * バッチログのインスタンスを取得する。
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
		 * バッチログをクローズする。
		 */
		protected void closeLogger() {
			
			if (!MCServerThreadManager.isUseMainDBTran()) {
				
				if (_logger != null) {
					_logger.close();
				}
			}
		}
		
		/**
		 * メッセージを出力する。
		 */
		protected void writeLog() {
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			
			msgList.clear();
		}
		
		/**
		 * 例外処理
		 * @param ex 例外
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<SlsActReg_Ins02_DtlR> dtlL) {
			
			MCException mcEx;
			if (ex instanceof MCException) {
				mcEx = (MCException) ex;
			}
			else {
				mcEx = new MCException(ex);
			}
			logger().writeProcessLog(mcEx);
			
			dtlL.setValue(SlsActReg_Ins02_DtlR.$err_flg, true);
			
			if (sp != null) {
				
				dbTran().rollback(sp);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().total_num(_dtlL.size());
			down0().err_num(_dtlL.subList(SlsActReg_Ins02_DtlR.$err_flg, true).size());
			down0().ok_num(down0().total_num().subtract(down0().err_num()));
		}
		
		/**
		 * 売上実績SV呼出用電文作成（ヘッダ）
		 * 
		 * @param hdrR
		 * @return
		 */
		protected SlsAct_Upd01_HdrR makeSlsActHdr(SlsActReg_Ins02_DtlR dtlR) {
			SlsAct_Upd01_HdrR up0 = SlsAct_Upd01_HdrR.create();
			
			copy(up0, dtlR, createMap_SlsAct_Upd01_HdrR_SlsActReg_Ins02_DtlR());
			
			return up0;
		}
		
		protected MCList<SlsAct_Upd01_DtlR> makeSlsActDtl(SlsAct_Upd01_HdrR hdrR, SlsActReg_Ins02_DtlR dtlR, MCList<SlsActReg_Ins02_DtlR> dtlL) {
			MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
			
			// 同一ヘッダ紐付けＮＯのものを取得
			String[] keys = new String[] {
					SlsActReg_Ins02_DtlR.$hdr_peg_no
			};
			Comparable<?>[] vals = new Comparable[] {
					hdrR.hdr_peg_no()
			};
			MCList<SlsActReg_Ins02_DtlR> tmpList = dtlL.subList(keys, vals);
			int tmpDispSeq = 0;
			for (SlsActReg_Ins02_DtlR tmpR : tmpList) {
				SlsAct_Upd01_DtlR up1R = SlsAct_Upd01_DtlR.create();
				
				copy(up1R, tmpR, createMap_SlsAct_Upd01_DtlR_SlsActReg_Ins02_DtlR());
				up1R.disp_seq(++tmpDispSeq);
				up1R.setStatus(MCRow.CREATE);
				up1.add(up1R);
			}
			
			return up1;
		}
		
		protected MCList<SlsAct_Upd01_IoR> makeSlsActIo(MCList<SlsAct_Upd01_DtlR> slsDtlL, MCList<SlsActReg_Ins02_DtlR> dtlL) {
			// 明細紐付けＮＯに該当する_ioLより紐付く詳細を取得する
			MCList<SlsAct_Upd01_IoR> up2 = MCList.create(SlsAct_Upd01_IoR.class);
			
			MCIndexKey idxkey = dtlL.createIndex(SlsActReg_Ins02_DtlR.$hdr_peg_no, SlsActReg_Ins02_DtlR.$dtl_peg_no);
			
			for (SlsAct_Upd01_DtlR dtlR : slsDtlL) {
				MCList<SlsActReg_Ins02_IoR> tmpList = MCList.create(SlsActReg_Ins02_IoR.class);
				tmpList = _ioL.subList(SlsActReg_Ins02_IoR.$dtl_peg_no, dtlR.dtl_peg_no());
				
				for (SlsActReg_Ins02_IoR tmpR : tmpList) {
					SlsAct_Upd01_IoR up2R = SlsAct_Upd01_IoR.create();
					
					copy(up2R, tmpR, createMap_SlsAct_Upd01_IoR_SlsActReg_Ins02_IoR());
					up2R.setStatus(MCRow.CREATE);
					up2R.hdr_peg_no(dtlR.hdr_peg_no());
					up2R.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					
					SlsActReg_Ins02_DtlR upR = dtlL.getFirst(idxkey, dtlR.hdr_peg_no(), dtlR.dtl_peg_no());
					
					if (!isNull(upR) && upR.sync_flg()) {
						
						up2R.purc_act_io_no(upR.purc_act_io_no());
						up2R.arr_act_no(upR.arr_act_no());
						up2R.loc_cd(upR.loc_cd());
						up2R.str_ln_cd(upR.str_ln_cd());
						up2R.lot_no(upR.lot_no());
						up2R.sublot_no(upR.sublot_no());
					}
					
					up2.add(up2R);
				}
			}
			return up2;
		}
		
		/**
		 * 与信戻し金額を計算する。
		 * @param slsSchdNo 売上予定ＮＯ
		 * @param baseUnitQty 基準単位数量
		 * @param oldBaseUnitQty 基準単位数量（変更前）
		 * @param sync_flg 同時計上ＦＬＧ
		 * @param sls_tgt_typ 売上対象区分
		 * @param sls_act_no 売上実績ＮＯ
		 * @param slo_d_no 受注明細ＮＯ
		 * @param delFlg 取消からの呼出の場合true
		 * @param ajstFlg 取消時に処理対象の受注明細ＮＯが変わっていた場合true
		 * @return 与信戻し金額
		 */
		protected MCNumber calcCredAmt(String slsSchdNo, MCNumber baseUnitQty, MCNumber oldBaseUnitQty,
				boolean sync_flg, String sls_tgt_typ, String sls_act_no, String slo_d_no, boolean delFlg, boolean ajstFlg) {

			MCNumber credAmt = MCNumber.ZERO;
					
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			
			ConvQtyAmtUtil_Calc01_HdrR up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
			
			getCredSrcBySlsSchd(up0R, slsSchdNo);
			
			MCNumber retQty = MCNumber.ZERO;
			if (sync_flg && MSC_SLS_TGT_TYP.isDDLV_SLS(sls_tgt_typ)) {
				retQty = MCNumber.max(baseUnitQty, up0R.getNumber("sls_schd_qty"));
			}
			else {
				retQty = up0R.getNumber("sls_schd_qty");
			}
			
			MCNumber credRetQty = calcCredRetQty(retQty, up0R.getNumber("base_unit_cmpl_qty"), baseUnitQty, oldBaseUnitQty);
			
			if (!credRetQty.isZero()) {
					
				setPegNo(up0R);
				
				ConvQtyAmtUtil_Calc01_Dtl1R up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
				
				up1R.hdr_peg_no(up0R.peg_no());
				setPegNo(up1R);
				
				up1R.trd_unit_qty(credRetQty);
				up1R.trd_unit_cd(up0R.getString("base_unit_cd"));
				up1R.trd_unit_conv_base_qty(1);
				up1R.trd_unit_conv_qty(1);
				
				ope.up0().add(up0R);
				ope.up1().add(up1R);
				
				ope.exec();
				
				if (!ope.down0().isEmpty()) {
					credAmt = ope.down0().get(0).trd_cur_inc_tax_amt();
				}
			}
			
			return credAmt;
		}
		
		/**
		 * 与信金額戻し数量を算出する。
		 * @param slsSchdQty 売上予定数量（基準単位）
		 * @param cmplQty 完了数量（基準単位売上数量＋基準単位打切数量）
		 * @param baseUnitQty 基準単位数量
		 * @param oldBaseUnitQty 基準単位数量（変更前）
		 * @return 与信金額戻し数量
		 */
		protected MCNumber calcCredRetQty(MCNumber slsSchdQty, MCNumber cmplQty, MCNumber baseUnitQty, MCNumber oldBaseUnitQty) {
			
			MCNumber oldSlsRemQty = slsSchdQty.subtract(cmplQty);
			oldSlsRemQty = oldSlsRemQty.isNegative() ? MCNumber.ZERO : oldSlsRemQty;
			
			MCNumber slsRemQty = slsSchdQty.subtract(cmplQty.add(baseUnitQty.subtract(oldBaseUnitQty)));
			
			return slsRemQty.subtract(oldSlsRemQty);
		}

		/**
		 * 売上予定ＮＯで売上予定の元情報(インボイス明細⇒納品書明細⇒受注明細の優先順)を取得する。
		 * 
		 * @param calc01HdrR 単位・金額の計算ヘッダ（売上予定元情報を格納）
		 * @param slsSchdNo 売上予定ＮＯ
		 * @param trdUnitCd 取引単位ＣＤ
		 */
		protected void getCredSrcBySlsSchd(ConvQtyAmtUtil_Calc01_HdrR calc01HdrR, String slsSchdNo) {
			// 取得済リストより処理対象となる売上予定ＮＯのデータを取得
			ConvQtyAmtUtil_Calc01_HdrR tmpCalc01HdrR = _calc01HdrL.getFirst(_idxCalc01HdrKey, slsSchdNo);
			MCRow.copyvalue(calc01HdrR, tmpCalc01HdrR);
			calc01HdrR.trd_cur_inc_tax_amt(sum(tmpCalc01HdrR.trd_cur_amt(), tmpCalc01HdrR.trd_cur_tax_amt()));
			calc01HdrR.schd_base_unit_qty(convToBaseUnit(
					tmpCalc01HdrR.trd_unit_qty(),
					tmpCalc01HdrR.trd_unit_conv_base_qty(),
					tmpCalc01HdrR.trd_unit_conv_qty(),
					tmpCalc01HdrR.base_unit_dec_place(),
					tmpCalc01HdrR.base_unit_rnd_typ()));
		}
		
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		protected void setItmUnitCache(MCList<?> dtlL) {
			MAVM_ITM_UNIT_R t_itmUnit = MAVM_ITM_UNIT_R.create("ITMUNIT");
			MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t_itmUnit);
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr);
			_itmUnitCache.setFixMaxCacheSize(-1);

			// 全ての単位を取得する
			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
			itmUnitL_bldr.setWhere(t_itmUnit.itm_cd.eq(bind("itm_cd")));
			itmUnitL_bldr.addWhereWithAnd(t_itmUnit.itm_sub1.eq(bind("itm_sub1")));
			itmUnitL_bldr.addWhereWithAnd(t_itmUnit.itm_sub2.eq(bind("itm_sub2")));
			itmUnitL_bldr.addWhereWithAnd(t_itmUnit.itm_sub3.eq(bind("itm_sub3")));
			
			MCList<?> tmp = dtlL.groupBy("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			dbSelect("MSBBB0020_MAVM_ITM_UNIT_S01", itmUnitL, itmUnitL_bldr, tmp);

			for (MAVM_ITM_UNIT_R itmUnitR : itmUnitL) {
				Comparable<?>[] key = itmUnitR.toArray(itmUnitR.getKeyColumn());
				_itmUnitCache.putCache(key, itmUnitR);
			}
		}
		
		protected MCNumber getBaseUnitQty(MCNumber trd_unit_qty, String trd_unit_cd, String base_unit_cd,
				String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
			MAVM_ITM_UNIT_R itmUnitR = getItmUnit(itm_cd, itm_sub1, itm_sub2, itm_sub3, trd_unit_cd);
			MAVM_ITM_UNIT_R itmBaseUnitR = getItmUnit(itm_cd, itm_sub1, itm_sub2, itm_sub3, base_unit_cd);
			
			MCNumber base_unit_qty = convToBaseUnit(trd_unit_qty, itmUnitR.conv_base_qty(),
					itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
			return base_unit_qty;
		}
		
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			if (_itmUnitCache == null) {
				_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
						MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")));
				_itmUnitCache.setFixMaxCacheSize(-1);
			}
			
			return _itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		}
		
		protected boolean isPack(String itmCd, String itmSub1, String itmSub2,
				String itmSub3, String trdUnitCd) {
			MAVM_ITM_UNIT_R itmUnitR = getItmUnit(itmCd, itmSub1, itmSub2, itmSub3, trdUnitCd);
			return itmUnitR.pack_flg();
		}
		
		/**
		 * 	ロットＮＯ発番処理
		 */
		protected void setLotNo() {

			// ロットＮＯ、サブロットＮＯ発番対象リスト
			MCList<ElmArgsR> lotNoL = MCList.create(ElmArgsR.class);
			MCList<ElmArgsR> subLotNoL = MCList.create(ElmArgsR.class);
			
			MCList<SlsActReg_Ins02_DtlR> notErrL = _dtlL;
			// 明細のロットＮＯ・サブロットＮＯの発番対象の抽出
			for (SlsActReg_Ins02_DtlR rsltR : notErrL) {

				if (!MSC_SLS_TGT_TYP.isDDLV_SLS(rsltR.sls_tgt_typ())) {
					continue;
				}

				// 入荷予定にロットＮＯが設定されている場合、そのロットＮＯを採用するのでロットＮＯを発番しない
				MST_PURC_SCHD_R schdR = MST_PURC_SCHD_R.create();
				MST_PURC_SCHD_R t_PurcSchd = MST_PURC_SCHD_R.create("PURCSCHD");
				MST_ARR_SCHD_R arrschd = MST_ARR_SCHD_R.create("ARRSCHD");
				MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t_PurcSchd);
				schdR_bldr.setSelect(t_PurcSchd.purc_schd_no);
				schdR_bldr.addLeftOuterJoin(arrschd, bracket( t_PurcSchd.arr_schd_no.eq(arrschd.arr_schd_no)));
				schdR_bldr.addSelect(arrschd.lot_no.as("lot_no"), arrschd.sublot_no.as("sublot_no"),
						arrschd.arr_loc_cd.as("arr_loc_cd"), arrschd.bp_lot_no);
				
				schdR_bldr.setWhere(t_PurcSchd.purc_schd_no.eq(bind("1")), rsltR.purc_schd_no());
				dbSelect("MSBBB0020_MST_PURC_SCHD_S01", schdR, schdR_bldr);
				
				if (!isNull(schdR) && !isNull(schdR.getStringNE("lot_no"))) {
					rsltR.lot_no(schdR.getStringNE("lot_no"));
					rsltR.sublot_no(nvl(schdR.getStringNE("sublot_no"), MAC_STR.NULL_VAL.value()));
					rsltR.crt_lot_flg(false);
					continue;
				}
				
				// ロットＮＯ発番対象リスト登録
				if (isCrtLotNo(rsltR)) {
					ElmArgsR lotArgs = getLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.LOT, schdR);
					lotNoL.add(lotArgs);
				}
				
				// サブロットＮＯ発番対象リスト登録
				if (isCrtSubLotNo(rsltR)) {
					ElmArgsR subLotArgs = getSubLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.SUBLOT, schdR);
					subLotNoL.add(subLotArgs);
				}
				else if (isNull(rsltR.sublot_no())) {
					rsltR.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
			
			// ロットＮＯ発番・セット
			if (!isNull(lotNoL) && !lotNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.LOT, lotNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{SlsActReg_Ins02_DtlR.$lot_no};
				copyByPegNo(notErrL, lotNoL, SlsActReg_Ins02_DtlR.$dtl_peg_no, destCols, ElmArgsR.$peg_no, srcCols);
			}
			
			// サブロットＮＯ発番・セット
			if (!isNull(subLotNoL) && !subLotNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.SUBLOT, subLotNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{SlsActReg_Ins02_DtlR.$sublot_no};
				copyByPegNo(notErrL, subLotNoL, SlsActReg_Ins02_DtlR.$dtl_peg_no, destCols, ElmArgsR.$peg_no, srcCols);
			}
		}
		
		/**
		 * [ロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [ロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、ロットＮＯの発番対象とする。
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtLotNo(SlsActReg_Ins02_DtlR rstlR) {

			return !MAC_LOT_MNG_TYP.isNOT_MNG(rstlR.lot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.lot_no_typ())
					&& rstlR.crt_lot_flg()
					&& isNull(rstlR.lot_no());
		}
		
		/**
		 * [サブロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [サブロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、サブロットＮＯの発番対象とする。
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtSubLotNo(SlsActReg_Ins02_DtlR rstlR) {

			return 	!MAC_SUBLOT_MNG_TYP.isNOT_MNG(rstlR.sublot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.sublot_no_typ())
					&& (rstlR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(rstlR.sublot_mng_typ()))
					&& isNull(rstlR.sublot_no());
		}
		
		/**
		 * ロットＮＯの発番要素を取得する
		 * 
		 * @param r
		 * @param numBizTyp
		 * @return 発番要素
		 */
		protected ElmArgsR getLotElmArgs(SlsActReg_Ins02_DtlR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR) {

			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.lot_no_ptn_cd());
			arg.bp_cd(r.sppl_cd());
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(r.sls_dt());
			arg.bp_lot_no(r.bp_lot_no());
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.peg_no(r.dtl_peg_no());

			return arg;
		}
		
		/**
		 * サブロットＮＯの発番要素を取得する
		 * 
		 * @param r
		 * @param numBizTyp
		 * @return 発番要素
		 */
		protected ElmArgsR getSubLotElmArgs(SlsActReg_Ins02_DtlR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR) {
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.sublot_no_ptn_cd());
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(r.sls_dt());
			arg.bp_lot_no(schdR.getStringNE("bp_lot_no"));
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.lot_no(r.lot_no());
			arg.peg_no(r.dtl_peg_no());

			return arg;
		}
		
		/** 場所マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _loc;
		
		protected MAM_LOC_R getLocR(String locCd) {
			if (_loc == null) {
				_loc = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
			}
			return _loc.get(locCd);
		}
		
		/** 部門マスタのキャッシュ */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		protected MAM_DPT_R getDptCache(MCDate baseDt, String dptCd) {
			return _cacheDpt.get(baseDt, dptCd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> initDptCache() {
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			if (_cacheDpt == null){
				_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
						MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL, MAM_DPT_R.$dpt_cd);
			}
			return _cacheDpt;
		}
		
		/** 通貨マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache = null;
		protected MAM_CUR_R getCur(String curCd) {
			if (_curCache == null) {
				_curCache = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
			}
			return _curCache.get(curCd);
		}
		
		/** 仕入実績明細のキャッシュ */
		protected FXUCL_MCDbcCache<MST_PURC_ACT_D_R> _cachePad;
		protected void initDbcCachePurcActD(MCList<SlsActReg_Ins02_DtlR> down) {
			
			MST_PURC_ACT_D_R t_PurcActD = MST_PURC_ACT_D_R.create("PURCACTD");
			MST_PURC_ACT_IO_R t_PurcActIo = MST_PURC_ACT_IO_R.create("PURCACTIO");
			MST_ARR_ACT_R t_ArrAct = MST_ARR_ACT_R.create("ARRACT");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t_PurcActD);
			
			dbc_bldr.setSelect(t_PurcActIo.purc_act_d_no, t_PurcActIo.purc_act_d_seq, t_ArrAct.ship_fr_valid_dt,
					count(value("x")).over().partitionBy(t_PurcActIo.purc_act_d_no, t_PurcActIo.purc_act_d_seq)
							.as("valid_cnt"));
			dbc_bldr.addInnerJoin(t_PurcActIo, t_PurcActIo.purc_act_d_no.eq(t_PurcActD.purc_act_d_no)
					.and(t_PurcActIo.purc_act_d_seq.eq(t_PurcActD.purc_act_d_seq)));
			dbc_bldr.addInnerJoin(t_ArrAct, t_ArrAct.arr_act_no.eq(t_PurcActIo.arr_act_no));

			_cachePad = new FXUCL_MCDbcCache<MST_PURC_ACT_D_R>(dbc_bldr, down,
					SlsActReg_Ins02_DtlR.$purc_act_d_no, SlsActReg_Ins02_DtlR.$purc_act_d_seq);

		}
		
		/** 取引先マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected MAM_BP_R getBpCache(String bpCd) {
			if (_cacheBp == null){
				_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
			}
			return _cacheBp.get(bpCd);
		}
		
		/** 品目マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected MAM_ITM_R getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			if (_itmCache == null){
				_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")));
			}
			return _itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
		}
	}
	
	protected Map_Purc_Chk03_HdrR_SlsActReg_Ins02_DtlR<Purc_Chk03_HdrR,SlsActReg_Ins02_DtlR> createMap_Purc_Chk03_HdrR_SlsActReg_Ins02_DtlR() {
		return new Map_Purc_Chk03_HdrR_SlsActReg_Ins02_DtlR<Purc_Chk03_HdrR, SlsActReg_Ins02_DtlR>();
	}

	public class Map_Purc_Chk03_HdrR_SlsActReg_Ins02_DtlR<D extends Purc_Chk03_HdrR, S extends SlsActReg_Ins02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {

			addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, SlsActReg_Ins02_DtlR.$ac_dt);
			addColumnPathMap(Purc_Chk03_HdrR.$ptax_dt, SlsActReg_Ins02_DtlR.$ptax_dt);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

			dest.purc_dt(src.sls_dt());
			if (isNull(dest.pay_basis_dt()) && isNull(dest.pay_schd_dt())) {
				dest.pay_basis_dt(src.sls_dt());
			}
		}
	}
	
	protected Map_Purc_Chk03_DtlR_SlsActReg_Ins02_DtlR<Purc_Chk03_DtlR,SlsActReg_Ins02_DtlR> createMap_Purc_Chk03_DtlR_SlsActReg_Ins02_DtlR() {
		return new Map_Purc_Chk03_DtlR_SlsActReg_Ins02_DtlR<Purc_Chk03_DtlR, SlsActReg_Ins02_DtlR>();
	}
	
	public class Map_Purc_Chk03_DtlR_SlsActReg_Ins02_DtlR<D extends Purc_Chk03_DtlR, S extends SlsActReg_Ins02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, SlsActReg_Ins02_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, SlsActReg_Ins02_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_DtlR.$abort_flg, SlsActReg_Ins02_DtlR.$abort_flg);
			addColumnPathMap(Purc_Chk03_DtlR.$lot_no, SlsActReg_Ins02_DtlR.$lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, SlsActReg_Ins02_DtlR.$sublot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$ver_no, SlsActReg_Ins02_DtlR.$ver_no);
			addColumnPathMap(Purc_Chk03_DtlR.$ship_fr_valid_dt, SlsActReg_Ins02_DtlR.$ship_fr_valid_dt);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, SlsActReg_Ins02_DtlR.$bp_lot_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_no, SlsActReg_Ins02_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, SlsActReg_Ins02_DtlR.$bp_dlv_slip_d_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.disp_seq(1);
			dest.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
		}
	}
	
	protected Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<Purc_Chk03_IoR,Purc_Chk03_DtlR> createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR() {
		return new Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<Purc_Chk03_IoR, Purc_Chk03_DtlR>();
	}
	
	public class Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<D extends Purc_Chk03_IoR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, Purc_Chk03_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, Purc_Chk03_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, Purc_Chk03_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, Purc_Chk03_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Chk03_IoR.$ver_no, Purc_Chk03_DtlR.$ver_no);
			addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Purc_Chk03_DtlR.$gd_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, Purc_Chk03_DtlR.$dlv_loc_cd);
			addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, Purc_Chk03_DtlR.$dlv_loc_wg_cd);
			addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, Purc_Chk03_DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Chk03_IoR.$lot_no, Purc_Chk03_DtlR.$lot_no);
			addColumnPathMap(Purc_Chk03_IoR.$sublot_no, Purc_Chk03_DtlR.$sublot_no);
			addColumnPathMap(Purc_Chk03_IoR.$quality_typ, Purc_Chk03_DtlR.$quality_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, Purc_Chk03_DtlR.$stk_insp_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, Purc_Chk03_DtlR.$stk_id_typ);
			addColumnPathMap(Purc_Chk03_IoR.$stk_bp_cd, Purc_Chk03_DtlR.$stk_bp_cd);
			addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, Purc_Chk03_DtlR.$bp_lot_no);
			addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, Purc_Chk03_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, Purc_Chk03_DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Chk03_IoR.$ship_fr_valid_dt, Purc_Chk03_DtlR.$ship_fr_valid_dt);
			
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
		}
	}
	
	protected Map_SlsAct_Upd01_IoR_SlsActReg_Ins02_IoR<SlsAct_Upd01_IoR,SlsActReg_Ins02_IoR> createMap_SlsAct_Upd01_IoR_SlsActReg_Ins02_IoR() {
		return new Map_SlsAct_Upd01_IoR_SlsActReg_Ins02_IoR<SlsAct_Upd01_IoR, SlsActReg_Ins02_IoR>();
	}
	
	public class Map_SlsAct_Upd01_IoR_SlsActReg_Ins02_IoR<D extends SlsAct_Upd01_IoR, S extends SlsActReg_Ins02_IoR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, SlsActReg_Ins02_IoR.$hdr_peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, SlsActReg_Ins02_IoR.$dtl_peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$io_peg_no, SlsActReg_Ins02_IoR.$io_peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, SlsActReg_Ins02_IoR.$sls_act_io_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, SlsActReg_Ins02_IoR.$sls_act_io_seq);
			addColumnPathMap(SlsAct_Upd01_IoR.$data_crud_typ, SlsActReg_Ins02_IoR.$data_crud_typ);
			addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, SlsActReg_Ins02_IoR.$ship_act_d_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no, SlsActReg_Ins02_IoR.$iv_ship_act_d_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, SlsActReg_Ins02_IoR.$arr_act_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, SlsActReg_Ins02_IoR.$purc_act_io_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno1, SlsActReg_Ins02_IoR.$sno1);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno2, SlsActReg_Ins02_IoR.$sno2);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno3, SlsActReg_Ins02_IoR.$sno3);
			addColumnPathMap(SlsAct_Upd01_IoR.$sno4, SlsActReg_Ins02_IoR.$sno4);
			addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, SlsActReg_Ins02_IoR.$gd_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, SlsActReg_Ins02_IoR.$loc_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, SlsActReg_Ins02_IoR.$str_ln_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, SlsActReg_Ins02_IoR.$lot_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, SlsActReg_Ins02_IoR.$sublot_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, SlsActReg_Ins02_IoR.$trd_unit_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, SlsActReg_Ins02_IoR.$trd_unit_qty);
			addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, SlsActReg_Ins02_IoR.$base_unit_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, SlsActReg_Ins02_IoR.$base_unit_qty);
			addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, SlsActReg_Ins02_IoR.$pack_unit_cd);
			addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, SlsActReg_Ins02_IoR.$pack_unit_qty);
			addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, SlsActReg_Ins02_IoR.$sync_flg);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_schd_abort_flg, SlsActReg_Ins02_IoR.$sls_schd_abort_flg);
			addColumnPathMap(SlsAct_Upd01_IoR.$ship_alloc_sts_no, SlsActReg_Ins02_IoR.$ship_alloc_sts_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, SlsActReg_Ins02_IoR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, SlsActReg_Ins02_IoR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, SlsActReg_Ins02_IoR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_ret_schd_flg, SlsActReg_Ins02_IoR.$sls_ret_schd_flg);
			addColumnPathMap(SlsAct_Upd01_IoR.$new_hdr_peg_no, SlsActReg_Ins02_IoR.$new_hdr_peg_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_no, SlsActReg_Ins02_IoR.$sls_act_d_no);
			addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_seq, SlsActReg_Ins02_IoR.$sls_act_d_seq);
			addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_upri, SlsActReg_Ins02_IoR.$trd_cur_upri);
			addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_dscnt_amt, SlsActReg_Ins02_IoR.$trd_cur_dscnt_amt);
		}
	}
	
	protected Map_SlsAct_Upd01_DtlR_SlsActReg_Ins02_DtlR<SlsAct_Upd01_DtlR,SlsActReg_Ins02_DtlR> createMap_SlsAct_Upd01_DtlR_SlsActReg_Ins02_DtlR() {
		return new Map_SlsAct_Upd01_DtlR_SlsActReg_Ins02_DtlR<SlsAct_Upd01_DtlR, SlsActReg_Ins02_DtlR>();
	}
	
	public class Map_SlsAct_Upd01_DtlR_SlsActReg_Ins02_DtlR<D extends SlsAct_Upd01_DtlR, S extends SlsActReg_Ins02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no, SlsActReg_Ins02_DtlR.$hdr_peg_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, SlsActReg_Ins02_DtlR.$dtl_peg_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, SlsActReg_Ins02_DtlR.$sls_act_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, SlsActReg_Ins02_DtlR.$sls_act_d_seq);
			addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, SlsActReg_Ins02_DtlR.$disp_seq);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, SlsActReg_Ins02_DtlR.$dlv_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, SlsActReg_Ins02_DtlR.$dlv_sundry_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, SlsActReg_Ins02_DtlR.$dlv_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, SlsActReg_Ins02_DtlR.$dlv_zip_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, SlsActReg_Ins02_DtlR.$dlv_addr1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, SlsActReg_Ins02_DtlR.$dlv_addr2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, SlsActReg_Ins02_DtlR.$dlv_addr3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, SlsActReg_Ins02_DtlR.$dlv_addr4);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, SlsActReg_Ins02_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, SlsActReg_Ins02_DtlR.$dlv_cntct_psn);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, SlsActReg_Ins02_DtlR.$dlv_tel);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, SlsActReg_Ins02_DtlR.$dlv_fax);
			addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, SlsActReg_Ins02_DtlR.$pri_prnt_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, SlsActReg_Ins02_DtlR.$dest_cd1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, SlsActReg_Ins02_DtlR.$dest_cd2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, SlsActReg_Ins02_DtlR.$dest_cd3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, SlsActReg_Ins02_DtlR.$tdlv_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, SlsActReg_Ins02_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, SlsActReg_Ins02_DtlR.$tdlv_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, SlsActReg_Ins02_DtlR.$tdlv_zip_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, SlsActReg_Ins02_DtlR.$tdlv_addr1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, SlsActReg_Ins02_DtlR.$tdlv_addr2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, SlsActReg_Ins02_DtlR.$tdlv_addr3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, SlsActReg_Ins02_DtlR.$tdlv_addr4);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, SlsActReg_Ins02_DtlR.$tdlv_tel);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, SlsActReg_Ins02_DtlR.$tdlv_fax);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, SlsActReg_Ins02_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, SlsActReg_Ins02_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, SlsActReg_Ins02_DtlR.$itm_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, SlsActReg_Ins02_DtlR.$itm_sub1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, SlsActReg_Ins02_DtlR.$itm_sub2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, SlsActReg_Ins02_DtlR.$itm_sub3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, SlsActReg_Ins02_DtlR.$sno1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, SlsActReg_Ins02_DtlR.$sno2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, SlsActReg_Ins02_DtlR.$sno3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, SlsActReg_Ins02_DtlR.$sno4);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, SlsActReg_Ins02_DtlR.$itm_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, SlsActReg_Ins02_DtlR.$iv_itm_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, SlsActReg_Ins02_DtlR.$cntry_org_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, SlsActReg_Ins02_DtlR.$loc_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, SlsActReg_Ins02_DtlR.$str_ln_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, SlsActReg_Ins02_DtlR.$lot_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, SlsActReg_Ins02_DtlR.$sublot_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, SlsActReg_Ins02_DtlR.$gd_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, SlsActReg_Ins02_DtlR.$trd_unit_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, SlsActReg_Ins02_DtlR.$trd_unit_qty);
			addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, SlsActReg_Ins02_DtlR.$base_unit_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, SlsActReg_Ins02_DtlR.$base_unit_qty);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, SlsActReg_Ins02_DtlR.$trd_cur_upri);
			addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, SlsActReg_Ins02_DtlR.$interim_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, SlsActReg_Ins02_DtlR.$tax_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg, SlsActReg_Ins02_DtlR.$inc_tax_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, SlsActReg_Ins02_DtlR.$tax_rate);
			addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, SlsActReg_Ins02_DtlR.$tax_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, SlsActReg_Ins02_DtlR.$cost_upri);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, SlsActReg_Ins02_DtlR.$cost_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, SlsActReg_Ins02_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, SlsActReg_Ins02_DtlR.$bill_crryovr_times);
			addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, SlsActReg_Ins02_DtlR.$stk_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, SlsActReg_Ins02_DtlR.$sundry_itm_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, SlsActReg_Ins02_DtlR.$sno1_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, SlsActReg_Ins02_DtlR.$sno2_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, SlsActReg_Ins02_DtlR.$sno3_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, SlsActReg_Ins02_DtlR.$sno4_mng_typ);
			addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd, SlsActReg_Ins02_DtlR.$itm_jnl_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, SlsActReg_Ins02_DtlR.$cst_po_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, SlsActReg_Ins02_DtlR.$cst_itm_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, SlsActReg_Ins02_DtlR.$cst_itm_nm);
			addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, SlsActReg_Ins02_DtlR.$trd_d_rmrks);
			addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, SlsActReg_Ins02_DtlR.$intr_d_rmrks);
			addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, SlsActReg_Ins02_DtlR.$sls_rsn_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, SlsActReg_Ins02_DtlR.$bd_dpt_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, SlsActReg_Ins02_DtlR.$wtax_rate);
			addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, SlsActReg_Ins02_DtlR.$slo_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, SlsActReg_Ins02_DtlR.$slo_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, SlsActReg_Ins02_DtlR.$ship_schd_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, SlsActReg_Ins02_DtlR.$sls_schd_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, SlsActReg_Ins02_DtlR.$qtn_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, SlsActReg_Ins02_DtlR.$qtn_rev);
			addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, SlsActReg_Ins02_DtlR.$qtn_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, SlsActReg_Ins02_DtlR.$purc_ddlv_po_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, SlsActReg_Ins02_DtlR.$purc_ddlv_po_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, SlsActReg_Ins02_DtlR.$purc_act_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, SlsActReg_Ins02_DtlR.$purc_act_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, SlsActReg_Ins02_DtlR.$iv_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, SlsActReg_Ins02_DtlR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, SlsActReg_Ins02_DtlR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, SlsActReg_Ins02_DtlR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, SlsActReg_Ins02_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, SlsActReg_Ins02_DtlR.$dlv_slip_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_no, SlsActReg_Ins02_DtlR.$sls_act_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_seq, SlsActReg_Ins02_DtlR.$sls_act_seq);
			addColumnPathMap(SlsAct_Upd01_DtlR.$wrk_no, SlsActReg_Ins02_DtlR.$wrk_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_itm_flg, SlsActReg_Ins02_DtlR.$dscnt_itm_flg);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_d_no, SlsActReg_Ins02_DtlR.$ship_dlv_slip_d_no);
			addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_multi_flg, SlsActReg_Ins02_DtlR.$ship_dlv_slip_multi_flg);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.sls_schd_abort_flg(src.abort_flg());
			if (!isNull(src.purc_ddlv_dlv_slip_d_no())) {
				dest.dlv_slip_d_no(src.purc_ddlv_dlv_slip_d_no());
				dest.purc_ddlv_dlv_slip_d_no(src.purc_ddlv_dlv_slip_d_no());
			}
		}
	}
	
	protected Map_SlsAct_Upd01_HdrR_SlsActReg_Ins02_DtlR<SlsAct_Upd01_HdrR,SlsActReg_Ins02_DtlR> createMap_SlsAct_Upd01_HdrR_SlsActReg_Ins02_DtlR() {
		return new Map_SlsAct_Upd01_HdrR_SlsActReg_Ins02_DtlR<SlsAct_Upd01_HdrR, SlsActReg_Ins02_DtlR>();
	}
	
	public class Map_SlsAct_Upd01_HdrR_SlsActReg_Ins02_DtlR<D extends SlsAct_Upd01_HdrR, S extends SlsActReg_Ins02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no, SlsActReg_Ins02_DtlR.$hdr_peg_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, SlsActReg_Ins02_DtlR.$sls_act_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, SlsActReg_Ins02_DtlR.$sls_act_seq);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, SlsActReg_Ins02_DtlR.$sls_act_rev);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, SlsActReg_Ins02_DtlR.$trd_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, SlsActReg_Ins02_DtlR.$trd_ptn_typ);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, SlsActReg_Ins02_DtlR.$ac_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, SlsActReg_Ins02_DtlR.$can_ac_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, SlsActReg_Ins02_DtlR.$sls_usr_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, SlsActReg_Ins02_DtlR.$sls_dpt_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, SlsActReg_Ins02_DtlR.$wg_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, SlsActReg_Ins02_DtlR.$sls_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ship_tm, SlsActReg_Ins02_DtlR.$ship_tm);
			addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, SlsActReg_Ins02_DtlR.$dlv_tm);
			addColumnPathMap(SlsAct_Upd01_HdrR.$eta_dt, SlsActReg_Ins02_DtlR.$eta_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, SlsActReg_Ins02_DtlR.$cst_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, SlsActReg_Ins02_DtlR.$iv_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, SlsActReg_Ins02_DtlR.$ref_iv_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_mng_no, SlsActReg_Ins02_DtlR.$rcpt_iv_mng_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_no, SlsActReg_Ins02_DtlR.$rcpt_iv_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, SlsActReg_Ins02_DtlR.$tterm_cd1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, SlsActReg_Ins02_DtlR.$tterm_rmrks1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, SlsActReg_Ins02_DtlR.$tterm_cd2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, SlsActReg_Ins02_DtlR.$tterm_rmrks2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, SlsActReg_Ins02_DtlR.$tterm_cd3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, SlsActReg_Ins02_DtlR.$tterm_rmrks3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, SlsActReg_Ins02_DtlR.$lc_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, SlsActReg_Ins02_DtlR.$lc_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, SlsActReg_Ins02_DtlR.$lc_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, SlsActReg_Ins02_DtlR.$rcv_schd_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, SlsActReg_Ins02_DtlR.$bill_basis_dt);
			addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, SlsActReg_Ins02_DtlR.$cred_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, SlsActReg_Ins02_DtlR.$bcst_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, SlsActReg_Ins02_DtlR.$acst_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, SlsActReg_Ins02_DtlR.$ar_dpt_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, SlsActReg_Ins02_DtlR.$cst_po_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, SlsActReg_Ins02_DtlR.$trd_cur_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, SlsActReg_Ins02_DtlR.$base_cur_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, SlsActReg_Ins02_DtlR.$xrate_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, SlsActReg_Ins02_DtlR.$xrate);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, SlsActReg_Ins02_DtlR.$ptax_cur_cd);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, SlsActReg_Ins02_DtlR.$ptax_xrate);
			addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, SlsActReg_Ins02_DtlR.$trd_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, SlsActReg_Ins02_DtlR.$intr_rmrks);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_no, SlsActReg_Ins02_DtlR.$ship_act_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, SlsActReg_Ins02_DtlR.$slo_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, SlsActReg_Ins02_DtlR.$qtn_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, SlsActReg_Ins02_DtlR.$qtn_rev);
			addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, SlsActReg_Ins02_DtlR.$dlv_slip_no);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ, SlsActReg_Ins02_DtlR.$sls_basis_typ);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, SlsActReg_Ins02_DtlR.$sub_char1);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, SlsActReg_Ins02_DtlR.$sub_char2);
			addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, SlsActReg_Ins02_DtlR.$sub_char3);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_service_exec_flg, SlsActReg_Ins02_DtlR.$ship_act_service_exec_flg);
			addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_rnd_typ, SlsActReg_Ins02_DtlR.$xrate_rnd_typ);
			addColumnPathMap(SlsAct_Upd01_HdrR.$ship_dlv_slip_no, SlsActReg_Ins02_DtlR.$ship_dlv_slip_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (isNullOrNullVal(src.iv_no())) {
				dest.dlv_slip_prnt_flg(src.prnt_out_flg());
			}
			else {
				dest.dlv_slip_prnt_flg(false);
			}
			
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			if (!isNull(src.purc_ddlv_dlv_slip_no())) {
				dest.dlv_slip_no(src.purc_ddlv_dlv_slip_no());
				dest.purc_ddlv_dlv_slip_no(src.purc_ddlv_dlv_slip_no());
			}
			dest.amt_calc_flg(true);
		}
	}
	
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_SlsActReg_Ins02_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R,SlsActReg_Ins02_DtlR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_SlsActReg_Ins02_DtlR() {
		return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_SlsActReg_Ins02_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, SlsActReg_Ins02_DtlR>();
	}

	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_SlsActReg_Ins02_DtlR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends SlsActReg_Ins02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, SlsActReg_Ins02_DtlR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, SlsActReg_Ins02_DtlR.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, SlsActReg_Ins02_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, SlsActReg_Ins02_DtlR.$trd_unit_conv_base_qty);

		}
	}
	
	protected Map_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR_Multi<SlsActReg_Ins02_DtlR,SlsActReg_Ins02_DtlR> createMap_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR_Multi() {
		return new Map_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR_Multi<SlsActReg_Ins02_DtlR, SlsActReg_Ins02_DtlR>();
	}
	public class Map_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR_Multi<D extends SlsActReg_Ins02_DtlR, S extends SlsActReg_Ins02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_cd, SlsActReg_Ins02_DtlR.$trd_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_ptn_typ, SlsActReg_Ins02_DtlR.$trd_ptn_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_schd_dt, SlsActReg_Ins02_DtlR.$sls_schd_dt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$eta_dt, SlsActReg_Ins02_DtlR.$eta_dt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_cd, SlsActReg_Ins02_DtlR.$cst_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_cur_cd, SlsActReg_Ins02_DtlR.$trd_cur_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_amt_dec_place, SlsActReg_Ins02_DtlR.$trd_amt_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_upri_dec_place, SlsActReg_Ins02_DtlR.$trd_upri_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_cur_cd, SlsActReg_Ins02_DtlR.$base_cur_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_amt_dec_place, SlsActReg_Ins02_DtlR.$base_amt_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_upri_dec_place, SlsActReg_Ins02_DtlR.$base_upri_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ptax_cur_cd, SlsActReg_Ins02_DtlR.$ptax_cur_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ptax_amt_dec_place, SlsActReg_Ins02_DtlR.$ptax_amt_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ptax_upri_dec_place, SlsActReg_Ins02_DtlR.$ptax_upri_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_po_no, SlsActReg_Ins02_DtlR.$cst_po_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_slip_no, SlsActReg_Ins02_DtlR.$dlv_slip_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_slip_d_no, SlsActReg_Ins02_DtlR.$dlv_slip_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$iv_no, SlsActReg_Ins02_DtlR.$iv_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$iv_d_no, SlsActReg_Ins02_DtlR.$iv_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ref_iv_no, SlsActReg_Ins02_DtlR.$ref_iv_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$rcpt_iv_mng_no, SlsActReg_Ins02_DtlR.$rcpt_iv_mng_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$rcpt_iv_no, SlsActReg_Ins02_DtlR.$rcpt_iv_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_cd1, SlsActReg_Ins02_DtlR.$tterm_cd1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_rmrks1, SlsActReg_Ins02_DtlR.$tterm_rmrks1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_cd2, SlsActReg_Ins02_DtlR.$tterm_cd2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_rmrks2, SlsActReg_Ins02_DtlR.$tterm_rmrks2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_cd3, SlsActReg_Ins02_DtlR.$tterm_cd3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_rmrks3, SlsActReg_Ins02_DtlR.$tterm_rmrks3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lc_no, SlsActReg_Ins02_DtlR.$lc_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lc_dt, SlsActReg_Ins02_DtlR.$lc_dt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lc_rmrks, SlsActReg_Ins02_DtlR.$lc_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cred_cd, SlsActReg_Ins02_DtlR.$cred_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$bcst_cd, SlsActReg_Ins02_DtlR.$bcst_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_act_no, SlsActReg_Ins02_DtlR.$ship_act_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$slo_no, SlsActReg_Ins02_DtlR.$slo_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$slo_d_no, SlsActReg_Ins02_DtlR.$slo_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$qtn_no, SlsActReg_Ins02_DtlR.$qtn_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$qtn_rev, SlsActReg_Ins02_DtlR.$qtn_rev);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$qtn_d_no, SlsActReg_Ins02_DtlR.$qtn_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_ddlv_po_no, SlsActReg_Ins02_DtlR.$purc_ddlv_po_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sppl_cd, SlsActReg_Ins02_DtlR.$sppl_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$acst_cd, SlsActReg_Ins02_DtlR.$acst_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_rmrks, SlsActReg_Ins02_DtlR.$trd_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$intr_rmrks, SlsActReg_Ins02_DtlR.$intr_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sub_char1, SlsActReg_Ins02_DtlR.$sub_char1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sub_char2, SlsActReg_Ins02_DtlR.$sub_char2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sub_char3, SlsActReg_Ins02_DtlR.$sub_char3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_cd, SlsActReg_Ins02_DtlR.$dlv_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_sundry_flg, SlsActReg_Ins02_DtlR.$dlv_sundry_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_zip_cd, SlsActReg_Ins02_DtlR.$dlv_zip_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_addr1, SlsActReg_Ins02_DtlR.$dlv_addr1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_addr2, SlsActReg_Ins02_DtlR.$dlv_addr2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_addr3, SlsActReg_Ins02_DtlR.$dlv_addr3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_addr4, SlsActReg_Ins02_DtlR.$dlv_addr4);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_cntct_dpt, SlsActReg_Ins02_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_cntct_psn, SlsActReg_Ins02_DtlR.$dlv_cntct_psn);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_tel, SlsActReg_Ins02_DtlR.$dlv_tel);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_fax, SlsActReg_Ins02_DtlR.$dlv_fax);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cntry_cd, SlsActReg_Ins02_DtlR.$cntry_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$pri_prnt_flg, SlsActReg_Ins02_DtlR.$pri_prnt_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dest_cd1, SlsActReg_Ins02_DtlR.$dest_cd1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dest_cd2, SlsActReg_Ins02_DtlR.$dest_cd2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dest_cd3, SlsActReg_Ins02_DtlR.$dest_cd3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_cd, SlsActReg_Ins02_DtlR.$tdlv_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_sundry_flg, SlsActReg_Ins02_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_nm, SlsActReg_Ins02_DtlR.$tdlv_nm);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_zip_cd, SlsActReg_Ins02_DtlR.$tdlv_zip_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_addr1, SlsActReg_Ins02_DtlR.$tdlv_addr1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_addr2, SlsActReg_Ins02_DtlR.$tdlv_addr2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_addr3, SlsActReg_Ins02_DtlR.$tdlv_addr3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_addr4, SlsActReg_Ins02_DtlR.$tdlv_addr4);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_tel, SlsActReg_Ins02_DtlR.$tdlv_tel);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_fax, SlsActReg_Ins02_DtlR.$tdlv_fax);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_cntct_dpt, SlsActReg_Ins02_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_cntct_psn, SlsActReg_Ins02_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_cd, SlsActReg_Ins02_DtlR.$itm_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_sub1, SlsActReg_Ins02_DtlR.$itm_sub1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_sub2, SlsActReg_Ins02_DtlR.$itm_sub2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_sub3, SlsActReg_Ins02_DtlR.$itm_sub3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lot_mng_typ, SlsActReg_Ins02_DtlR.$lot_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lot_no_typ, SlsActReg_Ins02_DtlR.$lot_no_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lot_no_ptn_cd, SlsActReg_Ins02_DtlR.$lot_no_ptn_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sublot_mng_typ, SlsActReg_Ins02_DtlR.$sublot_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sublot_no_typ, SlsActReg_Ins02_DtlR.$sublot_no_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sublot_no_ptn_cd, SlsActReg_Ins02_DtlR.$sublot_no_ptn_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cntry_org_cd, SlsActReg_Ins02_DtlR.$cntry_org_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno1, SlsActReg_Ins02_DtlR.$sno1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno2, SlsActReg_Ins02_DtlR.$sno2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno3, SlsActReg_Ins02_DtlR.$sno3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno4, SlsActReg_Ins02_DtlR.$sno4);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$wrk_no, SlsActReg_Ins02_DtlR.$wrk_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$asset_mng_typ, SlsActReg_Ins02_DtlR.$asset_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sundry_itm_flg, SlsActReg_Ins02_DtlR.$sundry_itm_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_typ, SlsActReg_Ins02_DtlR.$itm_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_typ_d_cd, SlsActReg_Ins02_DtlR.$itm_typ_d_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_alloc_sts_cnt, SlsActReg_Ins02_DtlR.$ship_alloc_sts_cnt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_act_d_cnt, SlsActReg_Ins02_DtlR.$ship_act_d_cnt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$iv_ship_act_d_cnt, SlsActReg_Ins02_DtlR.$iv_ship_act_d_cnt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_unit_dec_place, SlsActReg_Ins02_DtlR.$trd_unit_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_unit_conv_base_qty, SlsActReg_Ins02_DtlR.$trd_unit_conv_base_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_unit_conv_qty, SlsActReg_Ins02_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_unit_rnd_typ, SlsActReg_Ins02_DtlR.$trd_unit_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_unit_cd, SlsActReg_Ins02_DtlR.$base_unit_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_unit_dec_place, SlsActReg_Ins02_DtlR.$base_unit_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_unit_rnd_typ, SlsActReg_Ins02_DtlR.$base_unit_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_schd_qty, SlsActReg_Ins02_DtlR.$sls_schd_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$abort_qty, SlsActReg_Ins02_DtlR.$abort_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_qty, SlsActReg_Ins02_DtlR.$sls_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$interim_flg, SlsActReg_Ins02_DtlR.$interim_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_cur_upri, SlsActReg_Ins02_DtlR.$trd_cur_upri);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tax_fix_flg, SlsActReg_Ins02_DtlR.$tax_fix_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tax_rate, SlsActReg_Ins02_DtlR.$tax_rate);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tax_typ, SlsActReg_Ins02_DtlR.$tax_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cost_amt, SlsActReg_Ins02_DtlR.$cost_amt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$stk_mng_typ, SlsActReg_Ins02_DtlR.$stk_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno1_mng_typ, SlsActReg_Ins02_DtlR.$sno1_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno2_mng_typ, SlsActReg_Ins02_DtlR.$sno2_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno3_mng_typ, SlsActReg_Ins02_DtlR.$sno3_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno4_mng_typ, SlsActReg_Ins02_DtlR.$sno4_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_jnl_cd, SlsActReg_Ins02_DtlR.$itm_jnl_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_schd_no, SlsActReg_Ins02_DtlR.$ship_schd_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_ddlv_po_d_no, SlsActReg_Ins02_DtlR.$purc_ddlv_po_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$gd_cd, SlsActReg_Ins02_DtlR.$gd_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_po_d_no, SlsActReg_Ins02_DtlR.$cst_po_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_itm_cd, SlsActReg_Ins02_DtlR.$cst_itm_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_itm_nm, SlsActReg_Ins02_DtlR.$cst_itm_nm);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_d_rmrks, SlsActReg_Ins02_DtlR.$trd_d_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$intr_d_rmrks, SlsActReg_Ins02_DtlR.$intr_d_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dtl_sub_char1, SlsActReg_Ins02_DtlR.$dtl_sub_char1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dtl_sub_char2, SlsActReg_Ins02_DtlR.$dtl_sub_char2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dtl_sub_char3, SlsActReg_Ins02_DtlR.$dtl_sub_char3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_iv_flg, SlsActReg_Ins02_DtlR.$cst_iv_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_amt_rnd_typ, SlsActReg_Ins02_DtlR.$sls_amt_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_tax_rnd_typ, SlsActReg_Ins02_DtlR.$sls_tax_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$xrate_rnd_typ, SlsActReg_Ins02_DtlR.$xrate_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$wtax_rnd_typ, SlsActReg_Ins02_DtlR.$wtax_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_basis_typ, SlsActReg_Ins02_DtlR.$sls_basis_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_cststk_flg, SlsActReg_Ins02_DtlR.$sls_cststk_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_inst_typ, SlsActReg_Ins02_DtlR.$ship_inst_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_schd_no, SlsActReg_Ins02_DtlR.$purc_schd_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ddlv_iv_grp_flg, SlsActReg_Ins02_DtlR.$ddlv_iv_grp_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$inc_tax_flg, SlsActReg_Ins02_DtlR.$inc_tax_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dscnt_itm_flg, SlsActReg_Ins02_DtlR.$dscnt_itm_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_act_d_no, SlsActReg_Ins02_DtlR.$purc_act_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_act_no, SlsActReg_Ins02_DtlR.$purc_act_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$aprv_no, SlsActReg_Ins02_DtlR.$aprv_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (src.sundry_itm_flg()) {
				dest.itm_nm(src.itm_nm());
				dest.iv_itm_nm(src.iv_itm_nm());
			}
			
			if (src.dlv_sundry_flg()) {
				dest.dlv_nm(src.dlv_nm());
			}
		}
	}
	
	protected Map_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR<SlsActReg_Ins02_DtlR,SlsActReg_Ins02_DtlR> createMap_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR() {
		return new Map_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR<SlsActReg_Ins02_DtlR, SlsActReg_Ins02_DtlR>();
	}
	public class Map_SlsActReg_Ins02_DtlR_SlsActReg_Ins02_DtlR<D extends SlsActReg_Ins02_DtlR, S extends SlsActReg_Ins02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_cd, SlsActReg_Ins02_DtlR.$trd_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_ptn_typ, SlsActReg_Ins02_DtlR.$trd_ptn_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_schd_dt, SlsActReg_Ins02_DtlR.$sls_schd_dt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$eta_dt, SlsActReg_Ins02_DtlR.$eta_dt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_cd, SlsActReg_Ins02_DtlR.$cst_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_cur_cd, SlsActReg_Ins02_DtlR.$trd_cur_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_amt_dec_place, SlsActReg_Ins02_DtlR.$trd_amt_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_upri_dec_place, SlsActReg_Ins02_DtlR.$trd_upri_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_cur_cd, SlsActReg_Ins02_DtlR.$base_cur_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_amt_dec_place, SlsActReg_Ins02_DtlR.$base_amt_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_upri_dec_place, SlsActReg_Ins02_DtlR.$base_upri_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ptax_cur_cd, SlsActReg_Ins02_DtlR.$ptax_cur_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ptax_amt_dec_place, SlsActReg_Ins02_DtlR.$ptax_amt_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ptax_upri_dec_place, SlsActReg_Ins02_DtlR.$ptax_upri_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_po_no, SlsActReg_Ins02_DtlR.$cst_po_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_slip_no, SlsActReg_Ins02_DtlR.$dlv_slip_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_slip_d_no, SlsActReg_Ins02_DtlR.$dlv_slip_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$iv_no, SlsActReg_Ins02_DtlR.$iv_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$iv_d_no, SlsActReg_Ins02_DtlR.$iv_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ref_iv_no, SlsActReg_Ins02_DtlR.$ref_iv_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$rcpt_iv_mng_no, SlsActReg_Ins02_DtlR.$rcpt_iv_mng_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$rcpt_iv_no, SlsActReg_Ins02_DtlR.$rcpt_iv_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_cd1, SlsActReg_Ins02_DtlR.$tterm_cd1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_rmrks1, SlsActReg_Ins02_DtlR.$tterm_rmrks1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_cd2, SlsActReg_Ins02_DtlR.$tterm_cd2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_rmrks2, SlsActReg_Ins02_DtlR.$tterm_rmrks2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_cd3, SlsActReg_Ins02_DtlR.$tterm_cd3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tterm_rmrks3, SlsActReg_Ins02_DtlR.$tterm_rmrks3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lc_no, SlsActReg_Ins02_DtlR.$lc_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lc_dt, SlsActReg_Ins02_DtlR.$lc_dt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lc_rmrks, SlsActReg_Ins02_DtlR.$lc_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cred_cd, SlsActReg_Ins02_DtlR.$cred_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$bcst_cd, SlsActReg_Ins02_DtlR.$bcst_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_act_no, SlsActReg_Ins02_DtlR.$ship_act_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$slo_no, SlsActReg_Ins02_DtlR.$slo_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$slo_d_no, SlsActReg_Ins02_DtlR.$slo_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$qtn_no, SlsActReg_Ins02_DtlR.$qtn_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$qtn_rev, SlsActReg_Ins02_DtlR.$qtn_rev);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$qtn_d_no, SlsActReg_Ins02_DtlR.$qtn_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_ddlv_po_no, SlsActReg_Ins02_DtlR.$purc_ddlv_po_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sppl_cd, SlsActReg_Ins02_DtlR.$sppl_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$acst_cd, SlsActReg_Ins02_DtlR.$acst_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_rmrks, SlsActReg_Ins02_DtlR.$trd_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$intr_rmrks, SlsActReg_Ins02_DtlR.$intr_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sub_char1, SlsActReg_Ins02_DtlR.$sub_char1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sub_char2, SlsActReg_Ins02_DtlR.$sub_char2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sub_char3, SlsActReg_Ins02_DtlR.$sub_char3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_cd, SlsActReg_Ins02_DtlR.$dlv_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_sundry_flg, SlsActReg_Ins02_DtlR.$dlv_sundry_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_zip_cd, SlsActReg_Ins02_DtlR.$dlv_zip_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_addr1, SlsActReg_Ins02_DtlR.$dlv_addr1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_addr2, SlsActReg_Ins02_DtlR.$dlv_addr2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_addr3, SlsActReg_Ins02_DtlR.$dlv_addr3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_addr4, SlsActReg_Ins02_DtlR.$dlv_addr4);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_cntct_dpt, SlsActReg_Ins02_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_cntct_psn, SlsActReg_Ins02_DtlR.$dlv_cntct_psn);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_tel, SlsActReg_Ins02_DtlR.$dlv_tel);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dlv_fax, SlsActReg_Ins02_DtlR.$dlv_fax);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cntry_cd, SlsActReg_Ins02_DtlR.$cntry_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$pri_prnt_flg, SlsActReg_Ins02_DtlR.$pri_prnt_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dest_cd1, SlsActReg_Ins02_DtlR.$dest_cd1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dest_cd2, SlsActReg_Ins02_DtlR.$dest_cd2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dest_cd3, SlsActReg_Ins02_DtlR.$dest_cd3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_cd, SlsActReg_Ins02_DtlR.$tdlv_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_sundry_flg, SlsActReg_Ins02_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_nm, SlsActReg_Ins02_DtlR.$tdlv_nm);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_zip_cd, SlsActReg_Ins02_DtlR.$tdlv_zip_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_addr1, SlsActReg_Ins02_DtlR.$tdlv_addr1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_addr2, SlsActReg_Ins02_DtlR.$tdlv_addr2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_addr3, SlsActReg_Ins02_DtlR.$tdlv_addr3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_addr4, SlsActReg_Ins02_DtlR.$tdlv_addr4);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_tel, SlsActReg_Ins02_DtlR.$tdlv_tel);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_fax, SlsActReg_Ins02_DtlR.$tdlv_fax);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_cntct_dpt, SlsActReg_Ins02_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tdlv_cntct_psn, SlsActReg_Ins02_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_cd, SlsActReg_Ins02_DtlR.$itm_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_sub1, SlsActReg_Ins02_DtlR.$itm_sub1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_sub2, SlsActReg_Ins02_DtlR.$itm_sub2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_sub3, SlsActReg_Ins02_DtlR.$itm_sub3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lot_mng_typ, SlsActReg_Ins02_DtlR.$lot_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lot_no_ptn_cd, SlsActReg_Ins02_DtlR.$lot_no_ptn_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$lot_no_typ, SlsActReg_Ins02_DtlR.$lot_no_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sublot_mng_typ, SlsActReg_Ins02_DtlR.$sublot_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sublot_no_typ, SlsActReg_Ins02_DtlR.$sublot_no_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sublot_no_ptn_cd, SlsActReg_Ins02_DtlR.$sublot_no_ptn_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cntry_org_cd, SlsActReg_Ins02_DtlR.$cntry_org_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno1, SlsActReg_Ins02_DtlR.$sno1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno2, SlsActReg_Ins02_DtlR.$sno2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno3, SlsActReg_Ins02_DtlR.$sno3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno4, SlsActReg_Ins02_DtlR.$sno4);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$loc_cd, SlsActReg_Ins02_DtlR.$loc_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$str_ln_cd, SlsActReg_Ins02_DtlR.$str_ln_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_lot_no, SlsActReg_Ins02_DtlR.$sls_lot_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_sublot_no, SlsActReg_Ins02_DtlR.$sls_sublot_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$wrk_no, SlsActReg_Ins02_DtlR.$wrk_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$asset_mng_typ, SlsActReg_Ins02_DtlR.$asset_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sundry_itm_flg, SlsActReg_Ins02_DtlR.$sundry_itm_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_typ, SlsActReg_Ins02_DtlR.$itm_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_typ_d_cd, SlsActReg_Ins02_DtlR.$itm_typ_d_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_alloc_sts_cnt, SlsActReg_Ins02_DtlR.$ship_alloc_sts_cnt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_act_d_cnt, SlsActReg_Ins02_DtlR.$ship_act_d_cnt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$iv_ship_act_d_cnt, SlsActReg_Ins02_DtlR.$iv_ship_act_d_cnt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_unit_dec_place, SlsActReg_Ins02_DtlR.$trd_unit_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_unit_conv_base_qty, SlsActReg_Ins02_DtlR.$trd_unit_conv_base_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_unit_conv_qty, SlsActReg_Ins02_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_unit_rnd_typ, SlsActReg_Ins02_DtlR.$trd_unit_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_unit_cd, SlsActReg_Ins02_DtlR.$base_unit_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_unit_dec_place, SlsActReg_Ins02_DtlR.$base_unit_dec_place);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$base_unit_rnd_typ, SlsActReg_Ins02_DtlR.$base_unit_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_schd_qty, SlsActReg_Ins02_DtlR.$sls_schd_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$abort_qty, SlsActReg_Ins02_DtlR.$abort_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_qty, SlsActReg_Ins02_DtlR.$sls_qty);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$interim_flg, SlsActReg_Ins02_DtlR.$interim_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_cur_upri, SlsActReg_Ins02_DtlR.$trd_cur_upri);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tax_fix_flg, SlsActReg_Ins02_DtlR.$tax_fix_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tax_rate, SlsActReg_Ins02_DtlR.$tax_rate);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$tax_typ, SlsActReg_Ins02_DtlR.$tax_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cost_amt, SlsActReg_Ins02_DtlR.$cost_amt);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$stk_mng_typ, SlsActReg_Ins02_DtlR.$stk_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno1_mng_typ, SlsActReg_Ins02_DtlR.$sno1_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno2_mng_typ, SlsActReg_Ins02_DtlR.$sno2_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno3_mng_typ, SlsActReg_Ins02_DtlR.$sno3_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sno4_mng_typ, SlsActReg_Ins02_DtlR.$sno4_mng_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$itm_jnl_cd, SlsActReg_Ins02_DtlR.$itm_jnl_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_schd_no, SlsActReg_Ins02_DtlR.$ship_schd_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_ddlv_po_d_no, SlsActReg_Ins02_DtlR.$purc_ddlv_po_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$gd_cd, SlsActReg_Ins02_DtlR.$gd_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_po_d_no, SlsActReg_Ins02_DtlR.$cst_po_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_itm_cd, SlsActReg_Ins02_DtlR.$cst_itm_cd);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_itm_nm, SlsActReg_Ins02_DtlR.$cst_itm_nm);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$trd_d_rmrks, SlsActReg_Ins02_DtlR.$trd_d_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$intr_d_rmrks, SlsActReg_Ins02_DtlR.$intr_d_rmrks);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dtl_sub_char1, SlsActReg_Ins02_DtlR.$dtl_sub_char1);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dtl_sub_char2, SlsActReg_Ins02_DtlR.$dtl_sub_char2);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dtl_sub_char3, SlsActReg_Ins02_DtlR.$dtl_sub_char3);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$cst_iv_flg, SlsActReg_Ins02_DtlR.$cst_iv_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_amt_rnd_typ, SlsActReg_Ins02_DtlR.$sls_amt_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_tax_rnd_typ, SlsActReg_Ins02_DtlR.$sls_tax_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$xrate_rnd_typ, SlsActReg_Ins02_DtlR.$xrate_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$wtax_rnd_typ, SlsActReg_Ins02_DtlR.$wtax_rnd_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_basis_typ, SlsActReg_Ins02_DtlR.$sls_basis_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$sls_cststk_flg, SlsActReg_Ins02_DtlR.$sls_cststk_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ship_inst_typ, SlsActReg_Ins02_DtlR.$ship_inst_typ);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_schd_no, SlsActReg_Ins02_DtlR.$purc_schd_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$ddlv_iv_grp_flg, SlsActReg_Ins02_DtlR.$ddlv_iv_grp_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$inc_tax_flg, SlsActReg_Ins02_DtlR.$inc_tax_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$dscnt_itm_flg, SlsActReg_Ins02_DtlR.$dscnt_itm_flg);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_act_d_no, SlsActReg_Ins02_DtlR.$purc_act_d_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$purc_act_no, SlsActReg_Ins02_DtlR.$purc_act_no);
			addColumnPathMap(SlsActReg_Ins02_DtlR.$aprv_no, SlsActReg_Ins02_DtlR.$aprv_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (src.sundry_itm_flg()) {
				dest.itm_nm(src.itm_nm());
				dest.iv_itm_nm(src.iv_itm_nm());
			}
			
			if (src.dlv_sundry_flg()) {
				dest.dlv_nm(src.dlv_nm());
			}
		}
	}
	
	protected Map_SlsActReg_Ins02_IoR_SlsActReg_Ins02_DtlR<SlsActReg_Ins02_IoR,SlsActReg_Ins02_DtlR> createMap_SlsActReg_Ins02_IoR_SlsActReg_Ins02_DtlR() {
		return new Map_SlsActReg_Ins02_IoR_SlsActReg_Ins02_DtlR<SlsActReg_Ins02_IoR, SlsActReg_Ins02_DtlR>();
	}
	
	public class Map_SlsActReg_Ins02_IoR_SlsActReg_Ins02_DtlR<D extends SlsActReg_Ins02_IoR, S extends SlsActReg_Ins02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsActReg_Ins02_IoR.$sno1, SlsActReg_Ins02_DtlR.$sno1);
			addColumnPathMap(SlsActReg_Ins02_IoR.$sno2, SlsActReg_Ins02_DtlR.$sno2);
			addColumnPathMap(SlsActReg_Ins02_IoR.$sno3, SlsActReg_Ins02_DtlR.$sno3);
			addColumnPathMap(SlsActReg_Ins02_IoR.$sno4, SlsActReg_Ins02_DtlR.$sno4);
			addColumnPathMap(SlsActReg_Ins02_IoR.$gd_cd, SlsActReg_Ins02_DtlR.$gd_cd);
			addColumnPathMap(SlsActReg_Ins02_IoR.$loc_cd, SlsActReg_Ins02_DtlR.$loc_cd);
			addColumnPathMap(SlsActReg_Ins02_IoR.$str_ln_cd, SlsActReg_Ins02_DtlR.$str_ln_cd);
			addColumnPathMap(SlsActReg_Ins02_IoR.$lot_no, SlsActReg_Ins02_DtlR.$lot_no);
			addColumnPathMap(SlsActReg_Ins02_IoR.$sublot_no, SlsActReg_Ins02_DtlR.$sublot_no);
			addColumnPathMap(SlsActReg_Ins02_IoR.$trd_unit_cd, SlsActReg_Ins02_DtlR.$trd_unit_cd);
			addColumnPathMap(SlsActReg_Ins02_IoR.$trd_unit_qty, SlsActReg_Ins02_DtlR.$trd_unit_qty);
			addColumnPathMap(SlsActReg_Ins02_IoR.$base_unit_cd, SlsActReg_Ins02_DtlR.$base_unit_cd);
			addColumnPathMap(SlsActReg_Ins02_IoR.$base_unit_qty, SlsActReg_Ins02_DtlR.$base_unit_qty);
			addColumnPathMap(SlsActReg_Ins02_IoR.$ship_alloc_sts_no, SlsActReg_Ins02_DtlR.$ship_alloc_sts_no);
		}
	}

	//FMCB CUSTOM END
}