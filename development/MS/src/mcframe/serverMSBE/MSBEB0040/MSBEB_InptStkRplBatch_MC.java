package mcframe.serverMSBE.MSBEB0040;

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
import mcframe.serverMSBE.MSBEB0040.*;	// このimportはFrameManagerの自動生成で追加されました。

import mcframe.serverCore.sys.MCSys;
import static mcframe.commonCore.notice.Core_Msg.*;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;

import static mcframe.serverMSBE.MSBEB0040.Query.*;
import mcframe.serverMSBE.MSBEL5080.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEB_InptStkRplBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEB_InptStkRplBatch_MC extends MSBEB_InptStkRplBatch_MC_A{
	//FMCB CUSTOM START
	
	
	/**
	 * InptStkRpl_Upd01オペレーション.<p>
	 *
	 */
	public class InptStkRplBatch_Upd01 extends MSBEB_InptStkRplBatch_MC_A.InptStkRplBatch_Upd01 {
		
		/** 処理件数 */
		protected InptStkRpl_CntR _cntR;

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
			logger().writeStartLog(MSBEL1001);
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
					, _cntR.inpt_io_schd_cnt(), _cntR.lst_crt_cnt(), _cntR.xfr_crt_success_cnt()
					, _cntR.xfr_crt_error_cnt(), _cntR.lst_del_of_xfr_crt_cnt()))) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			logger().writeEndLog(MSBEL1003, _cntR.lst_del_cnt(), _cntR.xfr_del_cnt(),
					_cntR.inpt_io_schd_cnt(),
					_cntR.lst_crt_cnt().subtract(_cntR.lst_del_of_xfr_crt_cnt()),
					_cntR.xfr_crt_success_cnt(), _cntR.xfr_crt_error_cnt());
			pushEndLog(logger());
			logger().close();
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
			MCList<InptStkRplBatch_DtlR> locL = srchLoc(up0());
			if (isNull(locL)) {
				return ;
			}
			
			// 実行条件の出力
			writeArgLog(locL);
			
			// 投入品在庫補充サービスの呼出
			try {
				MCList<InptStkRplBatch_DtlR> errL = MCList.create(InptStkRplBatch_DtlR.class);
				lock(locL, errL);
				writeLockErrLog(errL);
				callInptStkRplService(locL);
			}
			finally {
				unlock();
			}
			
		}

		protected MCMessageList chkUpParam() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(check(up0(), new String[] {
					InptStkRplBatch_CndR.$opn_flg, InptStkRplBatch_CndR.$ord_sav_flg,
					InptStkRplBatch_CndR.$schd_flg, InptStkRplBatch_CndR.$fix_flg,
					InptStkRplBatch_CndR.$ord_flg, InptStkRplBatch_CndR.$mfg_sav_flg,
					InptStkRplBatch_CndR.$stt_flg
			}, new FXUCL_AtLeastOneValidater()));
			msgL.addAll(check(up0(), new String[] {
					InptStkRplBatch_CndR.$int_flg, InptStkRplBatch_CndR.$ext_flg
			}, new FXUCL_AtLeastOneValidater()));
			msgL.addAll(check(up0(), new String[] {
					InptStkRplBatch_CndR.$wg_cd, InptStkRplBatch_CndR.$loc_grp_cd,
					InptStkRplBatch_CndR.$loc_cd
			}, new FXUCL_AtLeastOneValidater()));
			msgL.addAll(check(up0(), InptStkRplBatch_CndR.$dt_fr, new FXUCL_RequiredValidater()));
			msgL.addAll(check(up0(), InptStkRplBatch_CndR.$dt_to, new FXUCL_RequiredValidater()));
			msgL.addAll(check(up0(), new String[] {
					InptStkRplBatch_CndR.$dt_fr, InptStkRplBatch_CndR.$dt_to
			}, new FXUCL_BeforeAfterValidater()));
			return msgL;
		}
		
		protected void writeArgLog(MCList<InptStkRplBatch_DtlR> locL) {
			logger().writeProcessLog(
					new MCMessage(MSBEL1002, toYMDString(up0().dt_fr()),
							toYMDString(up0().dt_to()),
							getBooleanString(up0().opn_flg()), getBooleanString(up0()
									.ord_sav_flg()), getBooleanString(up0().fix_flg()),
							getBooleanString(up0().schd_flg()), getBooleanString(up0()
									.mfg_sav_flg()), getBooleanString(up0().ord_flg()),
							getBooleanString(up0().stt_flg()), getBooleanString(true),
							getBooleanString(up0().xfr_schd_del_flg()),
							getBooleanString(true),
							getBooleanString(up0().xfr_schd_crt_flg()),
							getLocString(locL)));
		}

		protected void writeLockErrLog(MCList<InptStkRplBatch_DtlR> errL) {
			if (isNull(errL)) {
				return ;
			}
			
			logger().writeProcessLog(new MCMessage(MSBEL1007, getLocString(errL)));
			_exceptionFlg = true;
		}
		

		protected void callInptStkRplService(MCList<InptStkRplBatch_DtlR> locL) {
			// 投入品在庫補充サービスの呼出
			MSBEL_InptStkRplService.InptStkRpl_Ins01 ope = MSBEL_InptStkRplService.crtInptStkRpl_Ins01();
			copy(ope.up0(), up0(), createMap_InptStkRpl_CndR_InptStkRplBatch_CndR());
			ope.up0().batch_log_no(logger().getBatchLogNo());
			addAll(ope.up1(), locL, createMap_InptStkRpl_DtlR_InptStkRplBatch_DtlR());
			ope.exec();
			
			// 処理結果出力
			_cntR.lst_del_cnt(toInt(ope.down0().lst_del_cnt()));
			_cntR.xfr_del_cnt(toInt(ope.down0().xfr_del_cnt()));
			_cntR.inpt_io_schd_cnt(toInt(ope.down0().inpt_io_schd_cnt()));
			_cntR.lst_crt_cnt(toInt(ope.down0().lst_crt_cnt()));
			_cntR.xfr_crt_success_cnt(toInt(ope.down0().xfr_crt_success_cnt()));
			_cntR.xfr_crt_error_cnt(toInt(ope.down0().xfr_crt_error_cnt()));
			_cntR.lst_del_of_xfr_crt_cnt(toInt(ope.down0().lst_del_of_xfr_crt_cnt()));
			
		}
		
	}
	
	/**
	 * InptStkRplBatch_Del01オペレーション.<p>
	 *
	 */
	public class InptStkRplBatch_Del01 extends MSBEB_InptStkRplBatch_MC_A.InptStkRplBatch_Del01 {
		
		/** 処理件数 */
		protected InptStkRpl_CntR _cntR;
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
			logger().writeStartLog(MSBEL1004);
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
			logger().writeEndLog(MSBEL1006, _cntR.lst_del_cnt(), _cntR.xfr_del_cnt());
			pushEndLog(logger());
			logger().close();
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
			MCList<InptStkRplBatch_DtlR> locL = srchLoc(up0());
			if (isNull(locL)) {
				return ;
			}
			
			//　実行条件の出力
			writeArgLog(locL);
			
			// 投入品在庫補充サービスの呼出
			try {
				MCList<InptStkRplBatch_DtlR> errL = MCList.create(InptStkRplBatch_DtlR.class);
				lock(locL, errL);
				writeLockErrLog(errL);
				callInptStkRplService(locL);
			}
			finally {
				unlock();
			}
			

		}
		
		protected MCMessageList chkUpParam() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(check(up0(), new String[] {
					InptStkRplBatch_CndR.$int_flg, InptStkRplBatch_CndR.$ext_flg
			}, new FXUCL_AtLeastOneValidater()));
			msgL.addAll(check(up0(), new String[] {
					InptStkRplBatch_CndR.$wg_cd, InptStkRplBatch_CndR.$loc_grp_cd,
					InptStkRplBatch_CndR.$loc_cd
			}, new FXUCL_AtLeastOneValidater()));
			
			if (up0().xfr_schd_del_flg()) {
				msgL.addAll(check(up0(), InptStkRplBatch_CndR.$dt_fr, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), InptStkRplBatch_CndR.$dt_to, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), new String[] {
						InptStkRplBatch_CndR.$dt_fr, InptStkRplBatch_CndR.$dt_to
				}, new FXUCL_BeforeAfterValidater()));
			}
			
			return msgL;
		}

		protected void writeArgLog(MCList<InptStkRplBatch_DtlR> locL) {
			logger().writeProcessLog(
					new MCMessage(MSBEL1005, toYMDString(up0().dt_fr()),
							toYMDString(up0().dt_to()), getBooleanString(up0()
									.inpt_stk_rpl_lst_del_flg()), getBooleanString(up0()
									.xfr_schd_del_flg()), getLocString(locL)));
		}

		protected void writeLockErrLog(MCList<InptStkRplBatch_DtlR> errL) {
			if (isNull(errL)) {
				return ;
			}
			
			logger().writeProcessLog(new MCMessage(MSBEL1007, getLocString(errL)));
			_exceptionFlg = true;
		}
		
		protected void callInptStkRplService(MCList<InptStkRplBatch_DtlR> locL) {
			// 投入品在庫補充サービスの呼出
			MSBEL_InptStkRplService.InptStkRpl_Del01 ope = MSBEL_InptStkRplService.crtInptStkRpl_Del01();
			copy(ope.up0(), up0(), createMap_InptStkRpl_CndR_InptStkRplBatch_CndR());
			addAll(ope.up1(), locL, createMap_InptStkRpl_DtlR_InptStkRplBatch_DtlR());
			ope.exec();
			
			// 処理結果出力
			_cntR.lst_del_cnt(toInt(ope.down0().lst_del_cnt()));
			_cntR.xfr_del_cnt(toInt(ope.down0().xfr_del_cnt()));
		}
		
	}

	
	//////////////////////////////////////////////////////////////////////
	// 以下、共通処理 ////////////////////////////////////////////////////////
	
	protected InptStkRpl_CntR crtCntR() {
		InptStkRpl_CntR tmpR = InptStkRpl_CntR.create();
		tmpR.lst_del_cnt(0);
		tmpR.xfr_del_cnt(0);
		tmpR.inpt_io_schd_cnt(0);
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
	
	protected MCList<InptStkRplBatch_DtlR> srchLoc(InptStkRplBatch_CndR up) {
		// 処理対象の
		if (!(up.int_flg() && up.ext_flg())) {
			up.addStringColumn("INT_FLG_TRUE_STR", toTrueStr(up.int_flg()));
			up.addStringColumn("EXT_FLG_TRUE_STR", toTrueStr(up.ext_flg()));
		}
		
		MCList<InptStkRplBatch_DtlR> locL = MCList.create(InptStkRplBatch_DtlR.class);
		executeQuery(locL, MSBEB0010_MAM_LOC_S01(), up);
		
		if (isNull(locL)) {
			return locL;
		}
		
		// 棚・ラインＣＤがNULLのレコードはNULL棚行とする（棚・ライン管理対象でなくてもNULL棚にする）
		for (InptStkRplBatch_DtlR r : locL) {
			if (isNull(r.str_ln_cd())) {
				r.str_ln_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
		// 棚・ライン管理場所に対して、NULL棚行が存在しない場合に、NULL棚行を追加する
		MCList<InptStkRplBatch_DtlR> strLnL = locL.subList(InptStkRplBatch_DtlR.$str_ln_tgt_flg, true);
		for (MCList<InptStkRplBatch_DtlR> strLnGrpL : strLnL.groupList(InptStkRplBatch_DtlR.$loc_cd)) {
			boolean nullValFoundFlg = false;
			for (InptStkRplBatch_DtlR strLnGrpR : strLnGrpL) {
				if (MAC_STR.isNULL_VAL(strLnGrpR.str_ln_cd())) {
					nullValFoundFlg = true;
					break;
				}
			}
			if (!nullValFoundFlg) {
				InptStkRplBatch_DtlR tmpR = strLnGrpL.get(0).clone();
				tmpR.str_ln_cd(MAC_STR.NULL_VAL.value());
				locL.add(tmpR);
			}
		}
		
		// 棚・ラインの検索条件に合致するものを抽出する
		if (isNull(up.str_ln_cd())) {
			return locL;
		}
		locL = locL.subList(r->isSame(r.str_ln_cd(), up.str_ln_cd()));
		
		return locL;
	}
	
	protected String getBooleanString(boolean flg) {
		return flg ? MAC_STR.PRNT_CHK_TRUE.name(MCSys.user.locale())
				: MAC_STR.PRNT_CHK_FALSE.name(MCSys.user.locale());
	}

	protected String getLocString(MCList<InptStkRplBatch_DtlR> locL) {
		StringBuilder locStr = new StringBuilder();
		for (InptStkRplBatch_DtlR r : locL) {
			locStr.append("[" + r.loc_cd() + "," + r.str_ln_cd() + "]");
		}
		return locStr.toString();
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
	/**
	 * ロック用トランザクションを使用してロック情報を作成する
	 * 
	 * @param dtlL	場所、棚・ライン
	 * @param errL	ロックエラーのリスト
	 */
	protected void lock(
			MCList<InptStkRplBatch_DtlR> dtlL, MCList<InptStkRplBatch_DtlR> errL) {

		MCList<InptStkRplBatch_DtlR> locL = dtlL.shallowClone();
		locL.sort(InptStkRplBatch_DtlR.$loc_cd, InptStkRplBatch_DtlR.$str_ln_cd);

		MST_INPT_STK_RPL_LOCK_R lockR = MST_INPT_STK_RPL_LOCK_R.create();
		MCQueryApiBuilder lockR_bldr = MCQueryApiBuilder.create(MST_INPT_STK_RPL_LOCK_R.create("T"));

		boolean retryLock = false;
		for (InptStkRplBatch_DtlR dtlR : locL) {
			try {
				int cnt = dbSelectKeyForUpdateNoWait("MSBEB0040_MST_INPT_STK_RPL_LOCK_S01", lockR, lockR_bldr, dtlR);
				if (cnt > 0) {
					continue;
				}
				try {
					lockR.loc_cd(dtlR.loc_cd());
					lockR.str_ln_cd(dtlR.str_ln_cd());
					lockR_bldr.buildInsert("MSBEB0040_MST_INPT_STK_RPL_LOCK_I01").executeUpdate(getLockTran(), lockR, null);
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
			getLockTran().commit();
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

	protected Map_InptStkRpl_CndR_InptStkRplBatch_CndR<InptStkRpl_CndR,InptStkRplBatch_CndR> createMap_InptStkRpl_CndR_InptStkRplBatch_CndR() {
		return new Map_InptStkRpl_CndR_InptStkRplBatch_CndR<InptStkRpl_CndR, InptStkRplBatch_CndR>();
	}

	public class Map_InptStkRpl_CndR_InptStkRplBatch_CndR<D extends InptStkRpl_CndR, S extends InptStkRplBatch_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InptStkRpl_CndR.$xfr_schd_del_flg, InptStkRplBatch_CndR.$xfr_schd_del_flg);
			addColumnPathMap(InptStkRpl_CndR.$xfr_schd_crt_flg, InptStkRplBatch_CndR.$xfr_schd_crt_flg);
			addColumnPathMap(InptStkRpl_CndR.$inpt_stk_rpl_lst_del_flg, InptStkRplBatch_CndR.$inpt_stk_rpl_lst_del_flg);
			addColumnPathMap(InptStkRpl_CndR.$opn_flg, InptStkRplBatch_CndR.$opn_flg);
			addColumnPathMap(InptStkRpl_CndR.$ord_sav_flg, InptStkRplBatch_CndR.$ord_sav_flg);
			addColumnPathMap(InptStkRpl_CndR.$fix_flg, InptStkRplBatch_CndR.$fix_flg);
			addColumnPathMap(InptStkRpl_CndR.$schd_flg, InptStkRplBatch_CndR.$schd_flg);
			addColumnPathMap(InptStkRpl_CndR.$mfg_sav_flg, InptStkRplBatch_CndR.$mfg_sav_flg);
			addColumnPathMap(InptStkRpl_CndR.$ord_flg, InptStkRplBatch_CndR.$ord_flg);
			addColumnPathMap(InptStkRpl_CndR.$stt_flg, InptStkRplBatch_CndR.$stt_flg);
			addColumnPathMap(InptStkRpl_CndR.$dt_fr, InptStkRplBatch_CndR.$dt_fr);
			addColumnPathMap(InptStkRpl_CndR.$dt_to, InptStkRplBatch_CndR.$dt_to);

		}
	}

	protected Map_InptStkRpl_DtlR_InptStkRplBatch_DtlR<InptStkRpl_DtlR,InptStkRplBatch_DtlR> createMap_InptStkRpl_DtlR_InptStkRplBatch_DtlR() {
		return new Map_InptStkRpl_DtlR_InptStkRplBatch_DtlR<InptStkRpl_DtlR, InptStkRplBatch_DtlR>();
	}

	public class Map_InptStkRpl_DtlR_InptStkRplBatch_DtlR<D extends InptStkRpl_DtlR, S extends InptStkRplBatch_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InptStkRpl_DtlR.$loc_cd, InptStkRplBatch_DtlR.$loc_cd);
			addColumnPathMap(InptStkRpl_DtlR.$str_ln_cd, InptStkRplBatch_DtlR.$str_ln_cd);

		}
	}

	//FMCB CUSTOM END
}