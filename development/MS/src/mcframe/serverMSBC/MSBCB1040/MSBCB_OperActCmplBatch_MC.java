package mcframe.serverMSBC.MSBCB1040;

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

import static mcframe.serverMSBC.MSBCB1040.Query.*;
import mcframe.serverMSBC.MSBCL6050.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCB_OperActCmplBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCB_OperActCmplBatch_MC extends MSBCB_OperActCmplBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * OperActCmpl_Upd01オペレーション.<p>
	 *
	 * 製造実績受信ＩＦで自動作成された工程実績のステータスを一括で完了にする。<br>
	 */
	public class OperActCmpl_Upd01 extends MSBCB_OperActCmplBatch_MC_A.OperActCmpl_Upd01 {
		/** 対象件数 */
		protected int _totalCnt;
		/** 正常終了件数 */
		protected int _successCnt;
		/** エラー件数 */
		protected int _errorCnt;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
		/** バッチ結果出力のために対象データを保持するためのキャッシュ **/
		FXUCL_Cache<MfgActReg_Upd04_DtlOperR> _tgtCache;

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
			logger().writeStartLog(MSBCL1202);
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
			logger().writeEndLog(MSBCL1203, _totalCnt, _successCnt, _errorCnt);
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

			List<MSBCL_MfgActRegService.MfgActReg_Upd04> opeL = new ArrayList<>();
			for (MCList<MfgActReg_Upd04_DtlOperR> upL : getTgtData()) {
				MSBCL_MfgActRegService.MfgActReg_Upd04 ope = MSBCL_MfgActRegService.crtMfgActReg_Upd04();
				ope.up0().is_src_batch_flg(true);
				ope.up0().not_commit_flg(false);
				ope.up0().upd_cntr_chk_flg(false);
				ope.up0().not_wk_cost_upd_calc_flg(up0().not_wk_cost_upd_calc_flg());
				ope.up1().addAll(upL);
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
				for (MSBCL_MfgActRegService.MfgActReg_Upd04 ope : opeL) {
					for (MfgActReg_Upd04_DtlOperR downR : ope.down0()) {
						if (MAC_RTN_STS_TYP.isERR(downR.rtn_sts_typ())) {
							_errorCnt ++;
						}
						else if (MAC_RTN_STS_TYP.isNOT_EXE(downR.rtn_sts_typ())) {
							_totalCnt --;
						}
						else {
							_successCnt ++;
						}
					}
				}
			}
		}
		
		protected boolean isValidUp() {
			if (isNull(up0().wg_cd())) {
				return false;
			}
			return true;
		}

		protected List<MCList<MfgActReg_Upd04_DtlOperR>> getTgtData() {
			MCList<MfgActReg_Upd04_DtlOperR> tgtL = MCList.create(MfgActReg_Upd04_DtlOperR.class);
			
			executeQuery(tgtL, MSBCB1040_MST_OPER_ACT_S01(), up0());
			
			_totalCnt = tgtL.size();
			
			_tgtCache = new FXUCL_Cache<MfgActReg_Upd04_DtlOperR>();
			_tgtCache.setFixMaxCacheSize(-1);
			
			if (!tgtL.isEmpty()) {
				setPegNo(tgtL);
			}
			
			return splitTgt(tgtL);
		}
		
		protected List<MCList<MfgActReg_Upd04_DtlOperR>> splitTgt(MCList<MfgActReg_Upd04_DtlOperR> list) {
	        List<MCList<MfgActReg_Upd04_DtlOperR>> ret = new ArrayList<>();
	        if (list.isEmpty()) {
	        	return ret;
	        }
			int max = getThreadBatchSize(list.size());
	        
	        MCList<MfgActReg_Upd04_DtlOperR>[] grpL = list.groupList(getGrpCols());
	        MCList<MfgActReg_Upd04_DtlOperR> tmp = MCList.create(MfgActReg_Upd04_DtlOperR.class);
	        for (MCList<MfgActReg_Upd04_DtlOperR> grp : grpL) {
                if (tmp.size() >= max) {
                    ret.add(tmp);
                    tmp = MCList.create(MfgActReg_Upd04_DtlOperR.class);
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
					MfgActReg_Upd04_DtlOperR.$mfg_inst_no
			};
		}
	}

	//FMCB CUSTOM END
}