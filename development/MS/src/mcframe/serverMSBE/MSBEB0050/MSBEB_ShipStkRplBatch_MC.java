package mcframe.serverMSBE.MSBEB0050;

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
import mcframe.serverMSBE.MSBEB0050.*;	// このimportはFrameManagerの自動生成で追加されました。

import mcframe.serverCore.sys.MCSys;
import static mcframe.commonCore.notice.Core_Msg.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import static mcframe.serverMSBE.MSBEB0050.Query.*;
import mcframe.serverMSBE.MSBEL5090.*;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEB_ShipStkRplBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEB_ShipStkRplBatch_MC extends MSBEB_ShipStkRplBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * ShipStkRplBatch_Upd01オペレーション.<p>
	 *
	 */
	public class ShipStkRplBatch_Upd01 extends MSBEB_ShipStkRplBatch_MC_A.ShipStkRplBatch_Upd01 {
		/** 処理件数 */
		protected ShipStkRpl_CntR _cntR;

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
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBEL1022);
			pushStartLog(logger());
		}
		
		/**
		 * メイン処理
		 */
		protected void execMain() {
			_cntR = crtCntR();

			// 上り電文補完とチェック
			MCMessageList msgL = chkUpParam();
			if (!msgL.isEmpty()) {
				logger().writeProcessLog(msgL);
				throw new MCAppException(msgOpeErr());
			}

			// 処理対象場所取得
			MCList<ShipStkRplBatch_DtlR> locL = srchLoc(up0());
			if (isNull(locL)) {
				return ;
			}
			
			// 実行条件の出力
			writeArgLog(locL);
			
			// 出荷品在庫補充サービスの呼出
			try {
				MCList<ShipStkRplBatch_DtlR> errL = MCList.create(ShipStkRplBatch_DtlR.class);
				lock(locL, errL);
				writeLockErrLog(errL);
				callShipStkRplService(locL);
			}
			finally {
				unlock();
			}
		}
		
		protected MCMessageList chkUpParam() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(check(up0(), new String[] {
					ShipStkRplBatch_CndR.$schd_flg, ShipStkRplBatch_CndR.$slo_flg,
					ShipStkRplBatch_CndR.$prms_flg, ShipStkRplBatch_CndR.$dlv_inst_flg,
					ShipStkRplBatch_CndR.$ord_flg
			}, new FXUCL_AtLeastOneValidater()));
			msgL.addAll(check(up0(), new String[] {
					ShipStkRplBatch_CndR.$wg_cd, ShipStkRplBatch_CndR.$lg_grp_cd,
					ShipStkRplBatch_CndR.$loc_cd
			}, new FXUCL_AtLeastOneValidater()));
			msgL.addAll(check(up0(), new String[] {
					ShipStkRplBatch_CndR.$not_alloc_flg, ShipStkRplBatch_CndR.$alloc_flg
			}, new FXUCL_AtLeastOneValidater()));
			msgL.addAll(check(up0(), ShipStkRplBatch_CndR.$tm_fr, new FXUCL_RequiredValidater()));
			msgL.addAll(check(up0(), ShipStkRplBatch_CndR.$tm_to, new FXUCL_RequiredValidater()));
			msgL.addAll(check(up0(), new String[] {
					ShipStkRplBatch_CndR.$tm_fr, ShipStkRplBatch_CndR.$tm_to
			}, new FXUCL_BeforeAfterValidater()));
			return msgL;
		}
		
		protected void writeArgLog(MCList<ShipStkRplBatch_DtlR> locL) {
			logger().writeProcessLog(new MCMessage(MSBEL1023,
					toYMDHMString(up0().tm_fr()), toYMDHMString(up0().tm_to()),
					getBooleanString(up0().schd_flg()), getBooleanString(up0().slo_flg()),
					getBooleanString(up0().prms_flg()),
					getBooleanString(up0().dlv_inst_flg()),
					getBooleanString(up0().ord_flg()), getBooleanString(true),
					getBooleanString(up0().xfr_schd_del_flg()), getBooleanString(true),
					getBooleanString(up0().xfr_schd_crt_flg()),
					getBooleanString(up0().not_alloc_flg()),
					getBooleanString(up0().alloc_flg()), up0().ship_term_cd(),
					up0().ship_wk_cd(), getLocString(locL)));
		}
		
		protected void writeLockErrLog(MCList<ShipStkRplBatch_DtlR> errL) {
			if (isNull(errL)) {
				return ;
			}
			logger().writeProcessLog(new MCMessage(MSBEL1024, getLocString(errL)));
			_exceptionFlg = true;
		}
		
		protected void callShipStkRplService(MCList<ShipStkRplBatch_DtlR> locL) {
			// 出荷品在庫補充サービスの呼出
			MSBEL_ShipStkRplService.ShipStkRpl_Ins01 ope = MSBEL_ShipStkRplService.crtShipStkRpl_Ins01();
			copy(ope.up0(), up0(), createMap_ShipStkRpl_CndR_ShipStkRplBatch_CndR());
			ope.up0().batch_log_no(logger().getBatchLogNo());
			addAll(ope.up1(), locL, createMap_ShipStkRpl_DtlR_ShipStkRplBatch_DtlR());
			ope.exec();
			
			// 処理結果出力
			_cntR.lst_del_cnt(toInt(ope.down0().lst_del_cnt()));
			_cntR.xfr_del_cnt(toInt(ope.down0().xfr_del_cnt()));
			_cntR.ship_io_schd_cnt(toInt(ope.down0().ship_io_schd_cnt()));
			_cntR.lst_crt_cnt(toInt(ope.down0().lst_crt_cnt()));
			_cntR.xfr_crt_success_cnt(toInt(ope.down0().xfr_crt_success_cnt()));
			_cntR.xfr_crt_error_cnt(toInt(ope.down0().xfr_crt_error_cnt()));
			_cntR.lst_del_of_xfr_crt_cnt(toInt(ope.down0().lst_del_of_xfr_crt_cnt()));
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
			logger().writeProcessLog(MCMessagePool.getMessageList());
			
			if (_cntR == null) {
				_cntR = crtCntR();
			}
			if (_exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (MCNumber.ZERO.eq(MCNumber.sum(_cntR.lst_del_cnt(), _cntR.xfr_del_cnt()
					, _cntR.ship_io_schd_cnt(), _cntR.lst_crt_cnt(), _cntR.xfr_crt_success_cnt()
					, _cntR.xfr_crt_error_cnt(), _cntR.lst_del_of_xfr_crt_cnt()))) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			logger().writeEndLog(MSBEL1025, _cntR.lst_del_cnt(), _cntR.xfr_del_cnt(),
					_cntR.ship_io_schd_cnt(),
					_cntR.lst_crt_cnt().subtract(_cntR.lst_del_of_xfr_crt_cnt()),
					_cntR.xfr_crt_success_cnt(), _cntR.xfr_crt_error_cnt());
			pushEndLog(logger());
			logger().close();
		}
	}
	/**
	 * ShipStkRplBatch_Del01オペレーション.<p>
	 *
	 */
	public class ShipStkRplBatch_Del01 extends MSBEB_ShipStkRplBatch_MC_A.ShipStkRplBatch_Del01 {
		/** 処理件数 */
		protected ShipStkRpl_CntR _cntR;
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
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBEL1026);
			pushStartLog(logger());
		}
		
		/**
		 * メイン処理
		 */
		protected void execMain() {
			_cntR = crtCntR();
			
			// 上り電文補完とチェック
			MCMessageList msgL = chkUpParam();
			if (!msgL.isEmpty()) {
				logger().writeProcessLog(msgL);
				throw new MCAppException(msgOpeErr());
			}

			// 処理対象場所取得
			MCList<ShipStkRplBatch_DtlR> locL = srchLoc(up0());
			if (isNull(locL)) {
				return ;
			}
			
			//　実行条件の出力
			writeArgLog(locL);
			
			// 出荷品在庫補充サービスの呼出
			try {
				MCList<ShipStkRplBatch_DtlR> errL = MCList.create(ShipStkRplBatch_DtlR.class);
				lock(locL, errL);
				writeLockErrLog(errL);
				callShipStkRplService(locL);
			}
			finally {
				unlock();
			}
		}
		
		protected MCMessageList chkUpParam() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(check(up0(), new String[] {
					ShipStkRplBatch_CndR.$wg_cd, ShipStkRplBatch_CndR.$lg_grp_cd,
					ShipStkRplBatch_CndR.$loc_cd
			}, new FXUCL_AtLeastOneValidater()));
			
			if (up0().xfr_schd_del_flg()) {
				msgL.addAll(check(up0(), ShipStkRplBatch_CndR.$tm_fr, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), ShipStkRplBatch_CndR.$tm_to, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), new String[] {
						ShipStkRplBatch_CndR.$tm_fr, ShipStkRplBatch_CndR.$tm_to
				}, new FXUCL_BeforeAfterValidater()));
			}
			return msgL;
		}
		
		protected void writeArgLog(MCList<ShipStkRplBatch_DtlR> locL) {
			logger().writeProcessLog(new MCMessage(MSBEL1048,
					toYMDHMString(up0().tm_fr()), toYMDHMString(up0().tm_to()),
					getBooleanString(up0().ship_stk_rpl_lst_del_flg()),
					getBooleanString(up0().xfr_schd_del_flg()), getLocString(locL)));
		}
		
		protected void writeLockErrLog(MCList<ShipStkRplBatch_DtlR> errL) {
			if (isNull(errL)) {
				return ;
			}
			logger().writeProcessLog(new MCMessage(MSBEL1024, getLocString(errL)));
			_exceptionFlg = true;
		}
		
		protected void callShipStkRplService(MCList<ShipStkRplBatch_DtlR> locL) {
			// 出荷品在庫補充サービスの呼出
			MSBEL_ShipStkRplService.ShipStkRpl_Del01 ope = MSBEL_ShipStkRplService.crtShipStkRpl_Del01();
			copy(ope.up0(), up0(), createMap_ShipStkRpl_CndR_ShipStkRplBatch_CndR());
			addAll(ope.up1(), locL, createMap_ShipStkRpl_DtlR_ShipStkRplBatch_DtlR());
			ope.exec();
			
			// 処理結果出力
			_cntR.lst_del_cnt(toInt(ope.down0().lst_del_cnt()));
			_cntR.xfr_del_cnt(toInt(ope.down0().xfr_del_cnt()));
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
			logger().writeProcessLog(MCMessagePool.getMessageList());
			if (_cntR == null) {
				_cntR = crtCntR();
			}
			if (_exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (MCNumber.ZERO.eq(MCNumber.sum(_cntR.lst_del_cnt(), _cntR.xfr_del_cnt()))) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			logger().writeEndLog(MSBEL1027, _cntR.lst_del_cnt(), _cntR.xfr_del_cnt());
			pushEndLog(logger());
			logger().close();
		}
	}
	
	protected ShipStkRpl_CntR crtCntR() {
		ShipStkRpl_CntR tmpR = ShipStkRpl_CntR.create();
		tmpR.lst_del_cnt(0);
		tmpR.xfr_del_cnt(0);
		tmpR.ship_io_schd_cnt(0);
		tmpR.lst_crt_cnt(0);
		tmpR.xfr_crt_success_cnt(0);
		tmpR.xfr_crt_error_cnt(0);
		tmpR.lst_del_of_xfr_crt_cnt(0);
		return tmpR;
	}
	
	protected int toInt(MCNumber num) {
		if (isNull(num)) {
			return 0;
		}
		else {
			return num.intValue();
		}
	}
	
	/**
	 * バッチログを初期化する。
	 */
	protected void initLogger() {
		getConcurrentLogger();
	}

	/**
	 * ロック用トランザクションを使用してロック情報を作成する
	 * 
	 * @param dtlL	場所
	 * @param errL	ロックエラーのリスト
	 */
	protected void lock(
			MCList<ShipStkRplBatch_DtlR> dtlL, MCList<ShipStkRplBatch_DtlR> errL) {

		MCList<ShipStkRplBatch_DtlR> locL = dtlL.shallowClone();
		locL.sort(ShipStkRplBatch_DtlR.$loc_cd, ShipStkRplBatch_DtlR.$str_ln_cd);

		MCDBTransaction tran = getLockTran();
		MST_SHIP_STK_RPL_LOCK_R lockR = MST_SHIP_STK_RPL_LOCK_R.create();
		MST_SHIP_STK_RPL_LOCK_R t = MST_SHIP_STK_RPL_LOCK_R.create("T");
		MCQueryApiBuilder lockR_bldr = MCQueryApiBuilder.create(t);

		boolean retryLock = false;
		for (ShipStkRplBatch_DtlR dtlR : locL) {
			try {
				int cnt = dbSelectKeyForUpdateNoWait("MSBEB0050_MST_SHIP_STK_RPL_LOCK_S01", lockR, lockR_bldr, dtlR);
				if (cnt > 0) {
					continue;
				}
				try {
					lockR.loc_cd(dtlR.loc_cd());
					lockR.str_ln_cd(dtlR.str_ln_cd());
					lockR_bldr.buildInsert("MSBEB0050_MST_SHIP_STK_RPL_LOCK_I01").executeUpdate(tran, lockR, null);
					retryLock = true;
				}
				catch (MCException ex) {
					if (!isSame(ex.getID(), FCBCC0136)) {
						throw ex;
					}
					errL.add(dtlR);	// 対象から除外
				}
			}
			catch (MCException ex) {
				if (!isSame(ex.getID(), FCBCC0110)) {
					throw ex;
				}
				errL.add(dtlR);	// 対象から除外
			}
		}
		if (!errL.isEmpty()) {
			dtlL.removeAll(errL);
		}
		if (retryLock) {
			tran.commit();
			lock(dtlL, errL);
		}
	}
	
	/**
	 * ロック用トランザクションを解放する
	 */
	protected void unlock() {
		if (_tran != null) {
			_tran.rollback();
			MCTransactionManager.releaseDBTran(_tran);
			_tran = null;
		}
	}

	/**
	 * ロック用のトランザクション
	 */
	protected MCDBTransaction _tran = null;

	/**
	 * ロック用トランザクションを取得する
	 */
	protected MCDBTransaction getLockTran() {
		if (_tran == null) {
			_tran = MCTransactionManager.createDBTran(false);
		}
		return _tran;
	}

	protected MCList<ShipStkRplBatch_DtlR> srchLoc(ShipStkRplBatch_CndR up) {
		MCList<ShipStkRplBatch_DtlR> locL = MCList.create(ShipStkRplBatch_DtlR.class);
		executeQuery(locL, MSBEB0050_MAM_LOC_S01(), up);
		if (isNull(locL)) {
			return locL;
		}
		
		// 棚・ラインＣＤがNULLのレコードはNULL棚行とする（棚・ライン管理対象でなくてもNULL棚にする）
		for (ShipStkRplBatch_DtlR r : locL) {
			if (isNull(r.str_ln_cd())) {
				r.str_ln_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
		// 棚・ライン管理場所に対して、NULL棚行が存在しない場合に、NULL棚行を追加する
		MCList<ShipStkRplBatch_DtlR> strLnL = locL.subList(ShipStkRplBatch_DtlR.$str_ln_tgt_flg, true);
		for (MCList<ShipStkRplBatch_DtlR> strLnGrpL : strLnL.groupList(ShipStkRplBatch_DtlR.$loc_cd)) {
			boolean nullValFoundFlg = false;
			for (ShipStkRplBatch_DtlR strLnGrpR : strLnGrpL) {
				if (MAC_STR.isNULL_VAL(strLnGrpR.str_ln_cd())) {
					nullValFoundFlg = true;
					break;
				}
			}
			if (!nullValFoundFlg) {
				ShipStkRplBatch_DtlR tmpR = strLnGrpL.get(0).clone();
				tmpR.str_ln_cd(MAC_STR.NULL_VAL.value());
				locL.add(tmpR);
			}
		}

		return locL;
	}
	
	protected String getBooleanString(boolean flg) {
		return flg ? MAC_STR.PRNT_CHK_TRUE.name(MCSys.user.locale())
				: MAC_STR.PRNT_CHK_FALSE.name(MCSys.user.locale());
	}
	
	protected String getLocString(MCList<ShipStkRplBatch_DtlR> locL) {
		StringBuilder locStr = new StringBuilder();
		for (ShipStkRplBatch_DtlR r : locL) {
			locStr.append("[" + r.loc_cd() + "," + r.str_ln_cd() + "]");
		}
		return locStr.toString();
	}
	
	protected Map_ShipStkRpl_CndR_ShipStkRplBatch_CndR<ShipStkRpl_CndR,ShipStkRplBatch_CndR> createMap_ShipStkRpl_CndR_ShipStkRplBatch_CndR() {
		return new Map_ShipStkRpl_CndR_ShipStkRplBatch_CndR<ShipStkRpl_CndR, ShipStkRplBatch_CndR>();
	}

	public class Map_ShipStkRpl_CndR_ShipStkRplBatch_CndR<D extends ShipStkRpl_CndR, S extends ShipStkRplBatch_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipStkRpl_CndR.$xfr_schd_del_flg, ShipStkRplBatch_CndR.$xfr_schd_del_flg);
			addColumnPathMap(ShipStkRpl_CndR.$xfr_schd_crt_flg, ShipStkRplBatch_CndR.$xfr_schd_crt_flg);
			addColumnPathMap(ShipStkRpl_CndR.$ship_stk_rpl_lst_del_flg, ShipStkRplBatch_CndR.$ship_stk_rpl_lst_del_flg);
			addColumnPathMap(ShipStkRpl_CndR.$schd_flg, ShipStkRplBatch_CndR.$schd_flg);
			addColumnPathMap(ShipStkRpl_CndR.$slo_flg, ShipStkRplBatch_CndR.$slo_flg);
			addColumnPathMap(ShipStkRpl_CndR.$prms_flg, ShipStkRplBatch_CndR.$prms_flg);
			addColumnPathMap(ShipStkRpl_CndR.$dlv_inst_flg, ShipStkRplBatch_CndR.$dlv_inst_flg);
			addColumnPathMap(ShipStkRpl_CndR.$ord_flg, ShipStkRplBatch_CndR.$ord_flg);
			addColumnPathMap(ShipStkRpl_CndR.$tm_fr, ShipStkRplBatch_CndR.$tm_fr);
			addColumnPathMap(ShipStkRpl_CndR.$tm_to, ShipStkRplBatch_CndR.$tm_to);
			addColumnPathMap(ShipStkRpl_CndR.$not_alloc_flg, ShipStkRplBatch_CndR.$not_alloc_flg);
			addColumnPathMap(ShipStkRpl_CndR.$alloc_flg, ShipStkRplBatch_CndR.$alloc_flg);
			addColumnPathMap(ShipStkRpl_CndR.$ship_term_cd, ShipStkRplBatch_CndR.$ship_term_cd);
			addColumnPathMap(ShipStkRpl_CndR.$ship_wk_cd, ShipStkRplBatch_CndR.$ship_wk_cd);
		}
	}
	
	protected Map_ShipStkRpl_DtlR_ShipStkRplBatch_DtlR<ShipStkRpl_DtlR,ShipStkRplBatch_DtlR> createMap_ShipStkRpl_DtlR_ShipStkRplBatch_DtlR() {
		return new Map_ShipStkRpl_DtlR_ShipStkRplBatch_DtlR<ShipStkRpl_DtlR, ShipStkRplBatch_DtlR>();
	}

	public class Map_ShipStkRpl_DtlR_ShipStkRplBatch_DtlR<D extends ShipStkRpl_DtlR, S extends ShipStkRplBatch_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipStkRpl_DtlR.$loc_cd, ShipStkRplBatch_DtlR.$loc_cd);
			addColumnPathMap(ShipStkRpl_DtlR.$str_ln_cd, ShipStkRplBatch_DtlR.$str_ln_cd);
		}
	}

	//FMCB CUSTOM END
}