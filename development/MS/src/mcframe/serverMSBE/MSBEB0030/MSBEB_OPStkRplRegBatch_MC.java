package mcframe.serverMSBE.MSBEB0030;

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
import mcframe.serverMSBE.MSBEB0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import java.util.*;
import mcframe.serverMSBE.MSBEL5070.*;
import static mcframe.serverMSBE.MSBEB0030.Query.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEB_OPStkRplRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEB_OPStkRplRegBatch_MC extends MSBEB_OPStkRplRegBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * OPStkRplReg_Ins01オペレーション.<p>
	 */
	public class OPStkRplReg_Ins01 extends MSBEB_OPStkRplRegBatch_MC_A.OPStkRplReg_Ins01 {
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
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				writeEndLog();
			}
		}

		/**
		 * バッチメイン処理
		 */
		protected void execMain() {
			editUp();
			MCList<OPStkRplReg_Ins02_DtlR> upL = srch();

			List<MSBEB_OPStkRplRegBatch.OPStkRplReg_Ins02> opeL = new ArrayList<>();

			for (MCList<OPStkRplReg_Ins02_DtlR> subL: upL.groupList(OPStkRplReg_Ins02_DtlR.$itm_cd,
					OPStkRplReg_Ins02_DtlR.$itm_sub1,
					OPStkRplReg_Ins02_DtlR.$itm_sub2,
					OPStkRplReg_Ins02_DtlR.$itm_sub3,
					OPStkRplReg_Ins02_DtlR.$sppl_cd)) {
				MSBEB_OPStkRplRegBatch.OPStkRplReg_Ins02 ope = MSBEB_OPStkRplRegBatch.crtOPStkRplReg_Ins02();
				ope.up0().setAll(subL);
				opeL.add(ope);
			}
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			for (MSBEB_OPStkRplRegBatch.OPStkRplReg_Ins02 ope : opeL) {
				_totalCnt += ope.down0().total_cnt().intValue();
				_successCnt += ope.down0().success_cnt().intValue();
				_errorCnt += ope.down0().error_cnt().intValue();
			}
		}

		/**
		 * 上り電文チェック
		 */
		protected void editUp(){
			if (isNull(up0().master_dt())) {
				up0().master_dt(getToday());
			}
			if (isNull(up0().st_schd_dt()) && isNull(up0().end_schd_dt())) {
				up0().st_schd_dt(getToday());
			}
		}

		/**
		 * 在庫補充対象検索
		 */
		protected MCList<OPStkRplReg_Ins02_DtlR> srch() {
			MCList<OPRqst_Srch01_CndR> rplL = srchStkRpl();
			return callSvcSrch(rplL);
		}

		/**
		 * 在庫補充マスタ検索
		 */
		protected MCList<OPRqst_Srch01_CndR> srchStkRpl () {
			MCList<OPRqst_Srch01_CndR> cndL = MCList.create(OPRqst_Srch01_CndR.class);
			executeQuery(cndL, MSBEB0030_MAM_STK_RPL_S01(), up0());
			cndL.setDate(OPRqst_Srch01_CndR.$master_dt, up0().master_dt());
			cndL.setDate(OPRqst_Srch01_CndR.$gr_schd_dt_to, up0().gr_schd_dt_to());
			cndL.setDate(OPRqst_Srch01_CndR.$gi_schd_dt_to, up0().gi_schd_dt_to());
			return cndL;
		}

		/**
		 * 発注点在庫補充サービス呼出（検索）
		 */
		protected MCList<OPStkRplReg_Ins02_DtlR> callSvcSrch(MCList<OPRqst_Srch01_CndR> rplL) {
			MCList<OPStkRplReg_Ins02_DtlR> rsltRL = MCList.create(OPStkRplReg_Ins02_DtlR.class);
			if (isNull(rplL)) {
				return rsltRL;
			}
			
			// 発注点在庫補充対象検索
			MSBEL_OPStkRplService.OPRqst_Srch01 svc1 = MSBEL_OPStkRplService.crtOPRqst_Srch01();
			svc1.up0().setAll(rplL);
			svc1.exec();
			MCList<OPRqst_Srch01_RsltR> downL = MCList.create(OPRqst_Srch01_RsltR.class);
			downL.setAll(svc1.down0().subList(OPRqst_Srch01_RsltR.$shortage_flg, true));
			if (isNull(downL)) {
				return rsltRL;
			}
			
			// 補充方法検索
			MSBEL_OPStkRplService.OPRqst_Srch02 svc2 = MSBEL_OPStkRplService.crtOPRqst_Srch02();
			String[] joinKeys = new String[]{
					OPRqst_Srch02_RsltR.$itm_cd,
					OPRqst_Srch02_RsltR.$itm_sub1,
					OPRqst_Srch02_RsltR.$itm_sub2,
					OPRqst_Srch02_RsltR.$itm_sub3,
					OPRqst_Srch02_RsltR.$strg_loc_cd};
			MCList<OPRqst_Srch02_RsltR> upL = MCList.create(OPRqst_Srch02_RsltR.class);
			addAll(upL, downL, createMap_OPRqst_Srch02_RsltR_OPRqst_Srch01_RsltR());
			MCJoinKey<MCList<OPRqst_Srch01_CndR>> jk = upL.join(joinKeys, rplL, joinKeys);
			join(upL, jk, createMap_OPRqst_Srch02_RsltR_OPRqst_Srch01_CndR());
			svc2.up0().setAll(upL);
			svc2.exec();
			for (OPRqst_Srch02_RsltR r: svc2.down0()) {
				if (isNull(r.op_rpl_mtd_typ())) {
					MCMessage msg = new MCMessage(MSBEL1014, r.strg_loc_cd(), toDispItm(
							r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()));
					MCMessagePool.add(msg);
					logger().writeDataLog(msg);
					_errorCnt++;
					_totalCnt++;
				}
				else if (MCNumber.ZERO.lt(r.rqst_qty())){
					OPStkRplReg_Ins02_DtlR rsltR = OPStkRplReg_Ins02_DtlR.create();
					copy(rsltR, r, createMap_OPStkRplReg_Ins02_DtlR_OPRqst_Srch02_RsltR());
					rsltR.master_dt(up0().master_dt());
					rsltR.st_schd_dt(up0().st_schd_dt());
					rsltR.end_schd_dt(up0().end_schd_dt());
					rsltRL.add(rsltR);
				}
			}
			return rsltRL;
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;
			getConcurrentLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBEL1012);
			pushStartLog(logger());
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
	        logger().writeEndLog(MSBEL1013, _totalCnt, _successCnt, _errorCnt);
			pushEndLog(logger());
			logger().close();
	    }

		/**
		 * 例外処理
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

        protected Map_OPRqst_Srch02_RsltR_OPRqst_Srch01_CndR<OPRqst_Srch02_RsltR,OPRqst_Srch01_CndR> createMap_OPRqst_Srch02_RsltR_OPRqst_Srch01_CndR() {
        	return new Map_OPRqst_Srch02_RsltR_OPRqst_Srch01_CndR<OPRqst_Srch02_RsltR, OPRqst_Srch01_CndR>();
        }
        public class Map_OPRqst_Srch02_RsltR_OPRqst_Srch01_CndR<D extends OPRqst_Srch02_RsltR, S extends OPRqst_Srch01_CndR> extends MCRowMapper<D,S>{
        	@Override
        	protected void setupColumnPathMap() {
        		addColumnPathMap(OPRqst_Srch02_RsltR.$master_dt, OPRqst_Srch01_CndR.$master_dt);
        	}
        	@Override
        	protected void valueCopy(D dest, S src) {
        		dest.rqst_loc_cd(src.getStringNE("rqst_loc_cd"));
        		dest.rqst_str_ln_cd(src.getStringNE("rqst_str_ln_cd"));
        		dest.rqst_wg_cd(src.getStringNE("rqst_wg_cd"));
        		dest.dec_place(src.getNumberNE("dec_place"));
        	}
        }

        protected Map_OPRqst_Srch02_RsltR_OPRqst_Srch01_RsltR<OPRqst_Srch02_RsltR,OPRqst_Srch01_RsltR> createMap_OPRqst_Srch02_RsltR_OPRqst_Srch01_RsltR() {
        	return new Map_OPRqst_Srch02_RsltR_OPRqst_Srch01_RsltR<OPRqst_Srch02_RsltR, OPRqst_Srch01_RsltR>();
        }
        public class Map_OPRqst_Srch02_RsltR_OPRqst_Srch01_RsltR<D extends OPRqst_Srch02_RsltR, S extends OPRqst_Srch01_RsltR> extends MCRowMapper<D,S>{
        	@Override
        	protected void setupColumnPathMap() {
        		addColumnPathMap(OPRqst_Srch02_RsltR.$itm_cd, OPRqst_Srch01_RsltR.$itm_cd);
        		addColumnPathMap(OPRqst_Srch02_RsltR.$itm_sub1, OPRqst_Srch01_RsltR.$itm_sub1);
        		addColumnPathMap(OPRqst_Srch02_RsltR.$itm_sub2, OPRqst_Srch01_RsltR.$itm_sub2);
        		addColumnPathMap(OPRqst_Srch02_RsltR.$itm_sub3, OPRqst_Srch01_RsltR.$itm_sub3);
        		addColumnPathMap(OPRqst_Srch02_RsltR.$strg_loc_cd, OPRqst_Srch01_RsltR.$strg_loc_cd);
        		addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_qty, OPRqst_Srch01_RsltR.$rqst_qty);
        	}
        }

        protected Map_OPStkRplReg_Ins02_DtlR_OPRqst_Srch02_RsltR<OPStkRplReg_Ins02_DtlR,OPRqst_Srch02_RsltR> createMap_OPStkRplReg_Ins02_DtlR_OPRqst_Srch02_RsltR() {
        	return new Map_OPStkRplReg_Ins02_DtlR_OPRqst_Srch02_RsltR<OPStkRplReg_Ins02_DtlR, OPRqst_Srch02_RsltR>();
        }
        public class Map_OPStkRplReg_Ins02_DtlR_OPRqst_Srch02_RsltR<D extends OPStkRplReg_Ins02_DtlR, S extends OPRqst_Srch02_RsltR> extends MCRowMapper<D,S>{
        	@Override
        	protected void setupColumnPathMap() {
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$itm_cd, OPRqst_Srch02_RsltR.$itm_cd);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$itm_sub1, OPRqst_Srch02_RsltR.$itm_sub1);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$itm_sub2, OPRqst_Srch02_RsltR.$itm_sub2);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$itm_sub3, OPRqst_Srch02_RsltR.$itm_sub3);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$bom_ptn, OPRqst_Srch02_RsltR.$bom_ptn);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$strg_loc_cd, OPRqst_Srch02_RsltR.$strg_loc_cd);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$op_rpl_mtd_typ, OPRqst_Srch02_RsltR.$op_rpl_mtd_typ);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$mfg_loc_cd, OPRqst_Srch02_RsltR.$mfg_loc_cd);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$sppl_cd, OPRqst_Srch02_RsltR.$sppl_cd);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$maker_cd, OPRqst_Srch02_RsltR.$maker_cd);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$rqst_loc_cd, OPRqst_Srch02_RsltR.$rqst_loc_cd);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$rqst_str_ln_cd, OPRqst_Srch02_RsltR.$rqst_str_ln_cd);
        		addColumnPathMap(OPStkRplReg_Ins02_DtlR.$rqst_qty, OPRqst_Srch02_RsltR.$rqst_qty);
        	}
        }
	}

	/**
	 * OPStkRplReg_Ins02オペレーション.<p>
	 *
	 */
	public class OPStkRplReg_Ins02 extends MSBEB_OPStkRplRegBatch_MC_A.OPStkRplReg_Ins02 {

		/** 下り電文に設定するエラー件数 */
		protected int _errorCnt;
		/** バッチログのlogger */
		protected FXBAL_BatchLogger _logger = null;
		/** 在庫補充登録対象 */
		protected MCList<OPRqst_Chk01_RsltR> _updL;

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
				handleSuccess();
			}
			finally {
				closeLogger();
			}
		}

		/**
		 * バッチメイン処理
		 */
		protected void execMain() {
			check();
			reg();
			writeErrLog();
		}

		/**
		 * 発注点在庫補充サービス（更新前チェック）呼出
		 */
		protected void check() {
			MSBEL_OPStkRplService.OPRqst_Chk01 chkSvc = MSBEL_OPStkRplService.crtOPRqst_Chk01();
			addAll( chkSvc.up0(), up0(), createMap_OPRqst_Chk01_RsltR_OPStkRplReg_Ins02_DtlR());
			setPegNo(chkSvc.up0());
			chkSvc.exec();
			_updL = chkSvc.down0().subList(OPRqst_Chk01_RsltR.$err_flg, false);
			if (_updL.size() != chkSvc.down0().size()) {
				_errorCnt = chkSvc.down0().size() - _updL.size();
			}
		}

		/**
		 * 発注点在庫補充登録
		 */
		protected void reg() {
			if (isNull(_updL)) {
				return;
			}
			MSBEL_OPStkRplService.OPRqst_Ins01 insSvc = MSBEL_OPStkRplService.crtOPRqst_Ins01();
			insSvc.up0().setAll(_updL);
			insSvc.exec();
			MCList<OPRqst_Chk01_RsltR> notErrL = insSvc.down0().subList(OPRqst_Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != _updL.size()) {
				_errorCnt += _updL.size() - notErrL.size();
			}
		}

		protected void writeErrLog() {
			if (_errorCnt > 0) {
				_logger.writeDataLog (MCMessagePool.getMessageList());
			}
		}

		/**
		 * 下り電文（処理件数）設定
		 */
		protected void setDown() {
			down0().total_cnt(up0().size());
			down0().success_cnt(up0().size() - _errorCnt);
			down0().error_cnt(_errorCnt);
		}

		/**
		 * バッチログのインスタンスを取得する
		 */
		protected void initLogger() {
			_errorCnt = 0;
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
		protected void handleSuccess() {
			dbTran().commit();
		}

		protected Map_OPRqst_Chk01_RsltR_OPStkRplReg_Ins02_DtlR<OPRqst_Chk01_RsltR,OPStkRplReg_Ins02_DtlR> createMap_OPRqst_Chk01_RsltR_OPStkRplReg_Ins02_DtlR() {
			return new Map_OPRqst_Chk01_RsltR_OPStkRplReg_Ins02_DtlR<OPRqst_Chk01_RsltR, OPStkRplReg_Ins02_DtlR>();
		}
		public class Map_OPRqst_Chk01_RsltR_OPStkRplReg_Ins02_DtlR<D extends OPRqst_Chk01_RsltR, S extends OPStkRplReg_Ins02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OPRqst_Chk01_RsltR.$master_dt, OPStkRplReg_Ins02_DtlR.$master_dt);
				addColumnPathMap(OPRqst_Chk01_RsltR.$itm_cd, OPStkRplReg_Ins02_DtlR.$itm_cd);
				addColumnPathMap(OPRqst_Chk01_RsltR.$itm_sub1, OPStkRplReg_Ins02_DtlR.$itm_sub1);
				addColumnPathMap(OPRqst_Chk01_RsltR.$itm_sub2, OPStkRplReg_Ins02_DtlR.$itm_sub2);
				addColumnPathMap(OPRqst_Chk01_RsltR.$itm_sub3, OPStkRplReg_Ins02_DtlR.$itm_sub3);
				addColumnPathMap(OPRqst_Chk01_RsltR.$bom_ptn, OPStkRplReg_Ins02_DtlR.$bom_ptn);
				addColumnPathMap(OPRqst_Chk01_RsltR.$strg_loc_cd, OPStkRplReg_Ins02_DtlR.$strg_loc_cd);
				addColumnPathMap(OPRqst_Chk01_RsltR.$op_rpl_mtd_typ, OPStkRplReg_Ins02_DtlR.$op_rpl_mtd_typ);
				addColumnPathMap(OPRqst_Chk01_RsltR.$mfg_loc_cd, OPStkRplReg_Ins02_DtlR.$mfg_loc_cd);
				addColumnPathMap(OPRqst_Chk01_RsltR.$sppl_cd, OPStkRplReg_Ins02_DtlR.$sppl_cd);
				addColumnPathMap(OPRqst_Chk01_RsltR.$maker_cd, OPStkRplReg_Ins02_DtlR.$maker_cd);
				addColumnPathMap(OPRqst_Chk01_RsltR.$rqst_loc_cd, OPStkRplReg_Ins02_DtlR.$rqst_loc_cd);
				addColumnPathMap(OPRqst_Chk01_RsltR.$rqst_str_ln_cd, OPStkRplReg_Ins02_DtlR.$rqst_str_ln_cd);
				addColumnPathMap(OPRqst_Chk01_RsltR.$rqst_qty, OPStkRplReg_Ins02_DtlR.$rqst_qty);
				addColumnPathMap(OPRqst_Chk01_RsltR.$st_schd_dt, OPStkRplReg_Ins02_DtlR.$st_schd_dt);
				addColumnPathMap(OPRqst_Chk01_RsltR.$end_schd_dt, OPStkRplReg_Ins02_DtlR.$end_schd_dt);
			}
		}
	}

	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	//FMCB CUSTOM END
}