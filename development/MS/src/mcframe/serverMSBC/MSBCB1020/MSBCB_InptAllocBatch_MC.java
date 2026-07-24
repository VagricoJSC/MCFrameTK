package mcframe.serverMSBC.MSBCB1020;

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
import java.util.List;

import static mcframe.serverMSBC.MSBCB1020.Query.*;
import mcframe.serverMSBC.MSBCL6000.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCB_InptAllocBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCB_InptAllocBatch_MC extends MSBCB_InptAllocBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * InptAlloc_Upd01オペレーション.<p>
	 *
	 * 内製・外注の製造指図によって作成された投入予定の引当を行う<br>
	 */
	public class InptAlloc_Upd01 extends MSBCB_InptAllocBatch_MC_A.InptAlloc_Upd01 {
		/** 対象件数 */
		protected int _totalCnt;
		/** 正常終了件数 */
		protected int _successCnt;
		/** エラー件数 */
		protected int _errorCnt;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
		/** バッチ結果出力のために対象データを保持するためのキャッシュ **/
		FXUCL_Cache<MfgInstReg_Upd02_Hdr1R> _tgtCache;

		
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
			logger().writeStartLog(MSBCL1078);
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
			logger().writeEndLog(MSBCL1079, _totalCnt, _successCnt, _totalCnt - _successCnt);
			pushEndLog(logger());
			logger().close();
		}

		protected void execMain() {
			
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;
			
			if (!isValidUp()) {
				logger().writeProcessLog(MSBCL1082);
				return;
			}

			List<MSBCL_MfgInstRegService.MfgInstReg_Upd02> opeL = new ArrayList<>();
			for (MCList<MfgInstReg_Upd02_Hdr1R> up2L : getTgtData()) {
				MSBCL_MfgInstRegService.MfgInstReg_Upd02 ope = MSBCL_MfgInstRegService.crtMfgInstReg_Upd02();
				ope.up0().oper_unit_flg(false);
				ope.up0().re_alloc_mode_flg(up0().re_alloc_mode_flg());
				ope.up0().is_src_alloc_flg(true);
				ope.up0().is_src_batch_flg(true);
				
				ope.up2().addAll(up2L);
			
				opeL.add(ope);
			}

			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				// オペレーション実行
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				
				// ログ書き込み
				logger().writeDataLog(MCMessagePool.getMessageList());
				
				// バッチ結果テーブル書き込み
				MCList<MST_INPT_ALLOC_BR_R> brL = MCList.create(MST_INPT_ALLOC_BR_R.class); 
				for (MSBCL_MfgInstRegService.MfgInstReg_Upd02 ope : opeL) {
					for (MfgInstReg_Upd02_Hdr1R downR : ope.down1()) {
						MfgInstReg_Upd02_Hdr1R tgtR = _tgtCache.getCache(downR.peg_no());
						MST_INPT_ALLOC_BR_R brR = MST_INPT_ALLOC_BR_R.create();
						brR.batch_data_no(tgtR.batch_data_no());
						brR.batch_log_no(tgtR.batch_log_no());
						brR.log_sub_key1(tgtR.log_sub_key1());
						brR.log_sub_key2(tgtR.log_sub_key2());
						brR.mfg_inst_no(tgtR.mfg_inst_no());
						brR.par_itm_cd(tgtR.itm_cd());
						brR.par_itm_sub1(tgtR.itm_sub1());
						brR.par_itm_sub2(tgtR.itm_sub2());
						brR.par_itm_sub3(tgtR.itm_sub3());
						brR.mfg_loc_cd(tgtR.mfg_loc_cd());
						brR.st_schd_tm(tgtR.st_schd_tm());
						brR.end_schd_tm(tgtR.end_schd_tm());
						brR.alloc_tgt_cnt(downR.alloc_tgt_cnt());
						brR.alloc_success_cnt(downR.alloc_success_cnt());
						brR.alloc_failure_cnt(downR.alloc_failure_cnt());
						
						if (MAC_RTN_STS_TYP.isERR(downR.rtn_sts_typ())) {
							_errorCnt ++;
							brR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
						}
						else {
							if (isSame(brR.alloc_tgt_cnt(), brR.alloc_success_cnt())) {
								_successCnt ++;
								brR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
							}
							else {
								if (up0().err_alloc_flg()) {
									_errorCnt ++;
								}
								brR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
							}
						}
						
						brL.add(brR);
					}
				}
				
				if (!brL.isEmpty()) {
					dbInsert("MSBCB1020_MST_INPT_ALLOC_BR_I01", brL,
							MCQueryApiBuilder.create(MST_INPT_ALLOC_BR_R.create("T")));
				}
			}
		}
		
		protected boolean isValidUp() {
			if (isNull(up0().wg_cd())) {
				return false;
			}
			return true;
		}

		protected List<MCList<MfgInstReg_Upd02_Hdr1R>> getTgtData() {
			editUp();
			MCList<MfgInstReg_Upd02_Hdr1R> tgtL = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
			
			executeQuery(tgtL, MSBCB1020_MST_MFG_INST_S01(), up0());
			
			//「社内」・「社外」のバッチ引数に応じて、対象を絞り込む
			if (!isNull(tgtL)) {
				if (up0().int_flg() && !up0().ext_flg()) {
					tgtL = tgtL.subList(r -> isNull(r.getStringNE("sppl_cd")));
				}
				else if (!up0().int_flg() && up0().ext_flg()) {
					tgtL = tgtL.subList(r -> !isNull(r.getStringNE("sppl_cd")));
				}
			}
			_totalCnt = tgtL.size();
			
			_tgtCache = new FXUCL_Cache<MfgInstReg_Upd02_Hdr1R>();
			_tgtCache.setFixMaxCacheSize(-1);
			
			if (!tgtL.isEmpty()) {
				setPegNo(tgtL);
				doSeqCache(MAC_NUM_SYS_TYP.BATCH_DATA, tgtL.size());
				for (MfgInstReg_Upd02_Hdr1R tgtR : tgtL) {
					tgtR.batch_data_no(getStrSeq(MAC_NUM_SYS_TYP.BATCH_DATA));
					_tgtCache.putCache(new MCNumber[]{tgtR.peg_no()}, tgtR);
				}
				logger().setLogKey(tgtL,
						MfgInstReg_Upd02_Hdr1R.$batch_log_no,
						MfgInstReg_Upd02_Hdr1R.$log_sub_key1,
						MfgInstReg_Upd02_Hdr1R.$log_sub_key2);
			}
			
			return splitTgt(tgtL);
		}
		
		protected List<MCList<MfgInstReg_Upd02_Hdr1R>> splitTgt(MCList<MfgInstReg_Upd02_Hdr1R> list) {
			List<MCList<MfgInstReg_Upd02_Hdr1R>> ret = new ArrayList<>();
			if (list.isEmpty()) {
				return ret;
			}
			int max = getThreadBatchSize(list.size());
			
			MCList<MfgInstReg_Upd02_Hdr1R>[] grpL = list.groupList(getGrpCols());
			MCList<MfgInstReg_Upd02_Hdr1R> tmp = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
			for (MCList<MfgInstReg_Upd02_Hdr1R> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
		
		protected String[] getGrpCols() {
			return new String[] {
					MfgInstReg_Upd02_Hdr1R.$itm_cd, MfgInstReg_Upd02_Hdr1R.$itm_sub1,
					MfgInstReg_Upd02_Hdr1R.$itm_sub2, MfgInstReg_Upd02_Hdr1R.$itm_sub3,
					MfgInstReg_Upd02_Hdr1R.$log_grp_cd
			};
		}
		
		protected void editUp() {
			if (!isNull(up0().st_schd_dt_to())) {
				// 23:59:59を設定
				up0().st_schd_dt_to(up0().st_schd_dt_to().endTimeOfDay());
			}
		}
	}

	//FMCB CUSTOM END
}