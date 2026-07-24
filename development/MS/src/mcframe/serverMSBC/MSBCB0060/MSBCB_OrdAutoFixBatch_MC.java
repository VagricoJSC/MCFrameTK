package mcframe.serverMSBC.MSBCB0060;

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
import mcframe.serverMSBC.MSBCB0060.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBC.MSBCL5010.*;
import static mcframe.serverMSBC.MSBCB0060.Query.*;

import java.util.List;
import java.util.ArrayList;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCB_OrdAutoFixBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCB_OrdAutoFixBatch_MC extends MSBCB_OrdAutoFixBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * OrdAutoFix_Upd01オペレーション.<p>
	 *
	 */
	public class OrdAutoFix_Upd01 extends MSBCB_OrdAutoFixBatch_MC_A.OrdAutoFix_Upd01 {
		
		/** 対象件数 */
		protected int _totalCnt;
		/** 正常終了件数 */
		protected int _successCnt;
		/** エラー件数 */
		protected int _errorCnt;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		/** 処理対象品目オーダリスト */
		protected MCList<OrdAutoFix_Upd02_DtlR> _tgtItmOrdList;

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
		 * オーダ自動確定処理
		 */
		protected void execMain() {
			_totalCnt = _successCnt = _errorCnt = 0;
			_exceptionFlg = false;

			if(chkEditUp()){
				//品目オーダ自動確定メイン処理
				callThisUpd02();
			}
		}

		/**
		 * 上り電文のチェック
		 */
		protected boolean chkEditUp() {
			MCMessagePool.addAll(check(up0(), OrdAutoFix_Upd01_CndR.$wg_cd, new FXUCL_RequiredValidater()));
			String [] ord_typ = {OrdAutoFix_Upd01_CndR.$mfg_flg,
								OrdAutoFix_Upd01_CndR.$purc_flg,
								OrdAutoFix_Upd01_CndR.$outsrc_flg,
								OrdAutoFix_Upd01_CndR.$xfr_flg,
								OrdAutoFix_Upd01_CndR.$wg_xfr_flg};
			MCMessagePool.addAll(check(up0(), ord_typ, new FXUCL_AtLeastOneValidater()));
			
			if(!MCMessagePool.getMessageList().isEmpty()) {
				logger().writeDataLog(MCMessagePool.getMessageList());
				return false;
			}
			return true;
		}

		/**
		 * 品目オーダ自動確定処理（メイン）を呼び出す
		 */
		protected void callThisUpd02() {

			//確定対象品目オーダを取得
			getTgtItmOrd();
			if (_tgtItmOrdList.isEmpty()) {
				return;
			}

			//マルチスレッド実行対応
			List<MSBCB_OrdAutoFixBatch.OrdAutoFix_Upd02> opeL = new ArrayList<>();
			for (MCList<OrdAutoFix_Upd02_DtlR> upL : splitUpListParm(_tgtItmOrdList)) {
				MSBCB_OrdAutoFixBatch.OrdAutoFix_Upd02 ope = MSBCB_OrdAutoFixBatch.crtOrdAutoFix_Upd02();
				ope.up0().wg_cd(up0().wg_cd());
				ope.up0().dt(up0().dt());
				ope.up1().setAll(upL);
				opeL.add(ope);
			}

			// マルチスレッドでない場合は呼出先のオペレーションにトランザクションを引き継ぐ
			if (MCServerThreadManager.getLimitThreadSize() == 1) {
				MCServerThreadManager.setUseMainDBTran(true);
			}
			MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);

			for (MSBCB_OrdAutoFixBatch.OrdAutoFix_Upd02 ope : opeL) {
				OrdAutoFix_Upd02_RsltR r = ope.down0();
				_totalCnt += nvl(r.total_cnt(), MCNumber.ZERO).intValue();
				_successCnt += nvl(r.success_cnt(), MCNumber.ZERO).intValue();
				_errorCnt += nvl(r.error_cnt(), MCNumber.ZERO).intValue();
			}
		}

		/** 確定対象の品目オーダ検索する */
		protected void getTgtItmOrd() {
			//マルチスレッド（別セッション）で実行される可能性があるので
			//ここ（OrdAutoFix_Upd01）でロックしてはいけない
			setBind();
			_tgtItmOrdList = MCList.create(OrdAutoFix_Upd02_DtlR.class);
			executeQuery(_tgtItmOrdList, MSBCB0060_MST_ITM_ORDER_S01(), up0());
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
			logger().writeStartLog(MSBCL0098);
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
			logger().writeEndLog(MSBCL0099, _totalCnt, _successCnt, _errorCnt);
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

		@Override
		protected int getSplitRowCount() {
			// マルチスレッド分割バッチサイズ
			// splitUpListParmで使用するためにO.R.
			if(isNull(_tgtItmOrdList)) {
				return super.getSplitRowCount();
			}
			else {
				return getThreadBatchSize(_tgtItmOrdList.size());
			}
		}
		
		/**
		 * 検索条件用のバインド変数を設定する
		 */
		protected void setBind() {
			// オーダ確定の基準日
			if (isNull(up0().dt())){
				up0().dt(getToday());
			}

			// 「品目オーダ区分」条件の設定
			up0().addStringColumn("wk_mfg", MSC_ITM_ORD_TYP.MFG.value());
			up0().addStringColumn("wk_purc", MSC_ITM_ORD_TYP.PURC.value());
			up0().addStringColumn("wk_outsrc", MSC_ITM_ORD_TYP.OUTSRC.value());
			up0().addStringColumn("wk_xfr", MSC_ITM_ORD_TYP.XFR.value());
			up0().addStringColumn("wk_wg_xfr", MSC_ITM_ORD_TYP.WG_XFR.value());

			// 「オーダ状況区分」条件の設定
			up0().addStringColumn("wk_opn", MSC_ITM_ORD_STS_TYP.OPN.value());
			up0().addStringColumn("wk_sav", MSC_ITM_ORD_STS_TYP.SAV.value());
		}
	}

	/**
	 * OrdAutoFix_Upd02オペレーション.<p>
	 *
	 */
	public class OrdAutoFix_Upd02 extends MSBCB_OrdAutoFixBatch_MC_A.OrdAutoFix_Upd02 {
		/** OrdAutoFix_Upd01から引き継ぐバッチログのlogger */
		protected FXBAL_BatchLogger _logger = null;
		/** 下り電文に設定する全処理件数 */
		protected int _totalCnt;
		/** 下り電文に設定する正常終了件数 */
		protected int _successCnt;
		/** 下り電文に設定するエラー件数 */
		protected int _errorCnt;
		/** 処理対象品目オーダリスト */
		protected MCList<OrdAutoFix_Upd02_DtlR> _tgtItmOrdList = MCList.create(OrdAutoFix_Upd02_DtlR.class);
		protected MCList<MST_OPER_ORDER_R> _cacheOperOrd = null;
		protected MCIndexKey _idxOperOrdkey;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				ini();
				execMain();
				setDown();
				handleSuccess();
			}
			finally {
				writeLog();
				closeLogger();
			}
		}

		protected void ini() {
			_totalCnt = _successCnt = _errorCnt = 0;
			initLogger();
		}

		protected void execMain() {

			// 処理対象品目オーダロック取得
			lockTgtItmOrd();

			_totalCnt = _tgtItmOrdList.size();
			if(_totalCnt == 0){
				return;
			}

			// 対象品目オーダリスト編集
			editTgtItmOrd();
			chkContainsUnfrozenOperOrd();
			// オーダ状況更新前チェックサービス
			callOrdStsUpdChkSrv();
			// オーダ状況更新サービス
			callOrdStsUpdSrv();

			_successCnt = _tgtItmOrdList.subList(OrdAutoFix_Upd02_DtlR.$err_flg, false).size();
			_errorCnt = _totalCnt - _successCnt ;
		}

		/** 品目オーダをロックする */
		protected void lockTgtItmOrd() {
			setWk();
			
			executeQuery(_tgtItmOrdList, MSBCB0060_MST_ITM_ORDER_S02(), up0());
		}

		protected void setWk() {
			execDbWkDelete("MSBCB0060_MSW_ITM_ORDER_D01", MSW_ITM_ORDER_R.create("T"));
			executeBatchUpdate(MSBCB0060_MSW_ITM_ORDER_I01(), null, up1());
		}

		/** 処理対象品目オーダリストを編集する */
		protected void editTgtItmOrd() {
			setPegNo(_tgtItmOrdList);
			//paramIndex,paramRowIndexを設定するため
			logger().setLogKey(_tgtItmOrdList);

			_tgtItmOrdList.setString(OrdAutoFix_Upd02_DtlR.$a_itm_ord_sts_typ, MSC_ITM_ORD_STS_TYP.FIX.value());
			_tgtItmOrdList.setString(OrdAutoFix_Upd02_DtlR.$mrp_typ, MSC_MRP_TYP.MRP.value());
			_tgtItmOrdList.setString(OrdAutoFix_Upd02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
		}

		protected void chkContainsUnfrozenOperOrd() {
			createCacheOperOrd();
			for (OrdAutoFix_Upd02_DtlR itmOrdR : _tgtItmOrdList) {

				MCList<MST_OPER_ORDER_R> operOrdL = _cacheOperOrd.subList(_idxOperOrdkey, itmOrdR.itm_ord_no());
				if (operOrdL.size() > 0) {

					MST_OPER_ORDER_R operOrdR = operOrdL.getFirst(MST_OPER_ORDER_R.$scheduler_frozen_flg, false);
					if (!isNull(operOrdR)) {
						MCMessagePool.add(new MCMessage(itmOrdR, null, MSLAL0906, itmOrdR.itm_ord_no()));
						itmOrdR.err_flg(true);
					}
					else {
						itmOrdR.for_scheduler_frozen_flg(true);
					}
				}
			}
		}

		protected void createCacheOperOrd() {
			_cacheOperOrd = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R operOrd = MST_OPER_ORDER_R.create("OPER_ORDER");
			MST_ITM_ORDER_R itmOrd = MST_ITM_ORDER_R.create("ITM_ORDER");
			MCQueryApiBuilder operOrdLBldr = MCQueryApiBuilder.create(operOrd);
			operOrdLBldr.addInnerJoin(itmOrd, operOrd.itm_ord_no.eq(itmOrd.itm_ord_no));
			operOrdLBldr.setWhere(itmOrd.for_scheduler_frozen_flg.eq(value(true)));
			operOrdLBldr.addWhereWithAnd(operOrd.itm_ord_no.eq(bind("itm_ord_no")));
			dbSelectForUpdate("MSBCB0060_MST_OPER_ORDER_S01", _cacheOperOrd, operOrdLBldr, _tgtItmOrdList);

			_idxOperOrdkey = _cacheOperOrd.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
		}

		/** オーダ状況更新前チェックサービスを実行する */
		protected void callOrdStsUpdChkSrv() {
			MSBCL_OrdRegService.Ord_Chk02 ope = MSBCL_OrdRegService.crtOrd_Chk02();
			addAll(ope.up0(), _tgtItmOrdList, createMap_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR());
			ope.exec();
			copyErrFlg(_tgtItmOrdList, ope.down0());

			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk = _tgtItmOrdList.join(OrdAutoFix_Upd02_DtlR.$peg_no, ope.down0(), Ord_Upd01_Dtl1R.$peg_no);
			join(_tgtItmOrdList, jk, createMap_OrdAutoFix_Upd02_DtlR_Ord_Upd01_Dtl1R());
		}

		/**
		 * オーダ状況更新サービスを実行する
		 */
		protected void callOrdStsUpdSrv() {
			MCList<OrdAutoFix_Upd02_DtlR> notErrL = _tgtItmOrdList.subList(OrdAutoFix_Upd02_DtlR.$err_flg, false);
			if (notErrL.isEmpty()) {
				return;
			}

			MSBCL_OrdRegService.Ord_Upd02 ope = MSBCL_OrdRegService.crtOrd_Upd02();
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR_2());
			ope.exec();
			checkDateAfterPoSchdInOdr(notErrL, ope.down0());
		}
		
		/**
		 * 確定された購買、外注オーダにおいて、
		 * 発注予定日が運用日付より過去である場合は、メッセージを表示する。
		 * @param notErrL 確定する対象のオーダのリスト
		 * @param fixedOdrL 確定で登録できた品目オーダＮＯが保持されているリスト
		 */
		protected void checkDateAfterPoSchdInOdr(MCList<OrdAutoFix_Upd02_DtlR> notErrL, MCList<Ord_Upd01_Dtl1R> fixedOdrL) {
			// 確定された購買、外注のオーダをチェックする
			MCList<OrdAutoFix_Upd02_DtlR> odrL = MCList.create(OrdAutoFix_Upd02_DtlR.class); 
			odrL.addAll(notErrL.subList(OrdAutoFix_Upd02_DtlR.$itm_ord_typ, MSC_ITM_ORD_TYP.PURC.value()));
			odrL.addAll(notErrL.subList(OrdAutoFix_Upd02_DtlR.$itm_ord_typ, MSC_ITM_ORD_TYP.OUTSRC.value()));
			
			MCIndexKey odrNoKey = odrL.createIndex(OrdAutoFix_Upd02_DtlR.$itm_ord_no);
			for(Ord_Upd01_Dtl1R dtl : fixedOdrL) {
				OrdAutoFix_Upd02_DtlR fixedOdr = odrL.getFirst(odrNoKey, dtl.itm_ord_no());
				if(isNull(fixedOdr)) {
					continue;
				}
				if(getToday().gt(fixedOdr.po_schd_dt())) {
					MCMessagePool.add(new MCMessage(MSBCL1310, fixedOdr.itm_ord_no(), toYMDString(fixedOdr.po_schd_dt()), toYMDString(getToday())));
				}
			}
		}

		/** 下り電文を設定する */
		protected void setDown() {
			down0().total_cnt(_totalCnt);
			down0().success_cnt(_successCnt);
			down0().error_cnt(_errorCnt);
		}

		/** バッチログのインスタンスを取得する */
		protected void initLogger() {
			if (MCServerThreadManager.isUseMainDBTran()) {
				_logger = logger();
			}
			else {
				_logger = logger().clone();
			}
		}

		protected void writeLog() {
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			
			msgList.clear();
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
		/////////////////////////////////////////////////////////////////

		/** OrdAutoFix_Upd02_DtlR → Ord_Upd01_Dtl1R (OrdAutoFix_Upd02 → Ord_Chk02) */
		protected Map_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR<Ord_Upd01_Dtl1R, OrdAutoFix_Upd02_DtlR> createMap_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR<Ord_Upd01_Dtl1R, OrdAutoFix_Upd02_DtlR>();
		}

		/** OrdAutoFix_Upd02_DtlR → Ord_Upd01_Dtl1R (OrdAutoFix_Upd02 → Ord_Chk02) */
		public class Map_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR<D extends Ord_Upd01_Dtl1R, S extends OrdAutoFix_Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, OrdAutoFix_Upd02_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, OrdAutoFix_Upd02_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, OrdAutoFix_Upd02_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$a_itm_ord_sts_typ, OrdAutoFix_Upd02_DtlR.$a_itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, OrdAutoFix_Upd02_DtlR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, OrdAutoFix_Upd02_DtlR.$itm_ord_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, OrdAutoFix_Upd02_DtlR.$ord_gnrt_typ);
			}
		}

		/** Ord_Upd01_Dtl1R → OrdAutoFix_Upd02_DtlR (Ord_Chk02 → OrdAutoFix_Upd02) */
		protected Map_OrdAutoFix_Upd02_DtlR_Ord_Upd01_Dtl1R<OrdAutoFix_Upd02_DtlR, Ord_Upd01_Dtl1R> createMap_OrdAutoFix_Upd02_DtlR_Ord_Upd01_Dtl1R() {
			return new Map_OrdAutoFix_Upd02_DtlR_Ord_Upd01_Dtl1R<OrdAutoFix_Upd02_DtlR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → OrdAutoFix_Upd02_DtlR (Ord_Chk02 → OrdAutoFix_Upd02) */
		public class Map_OrdAutoFix_Upd02_DtlR_Ord_Upd01_Dtl1R<D extends OrdAutoFix_Upd02_DtlR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$b_itm_ord_sts_typ, Ord_Upd01_Dtl1R.$b_itm_ord_sts_typ);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$itm_cd, Ord_Upd01_Dtl1R.$itm_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$itm_sub1, Ord_Upd01_Dtl1R.$itm_sub1);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$itm_sub2, Ord_Upd01_Dtl1R.$itm_sub2);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$itm_sub3, Ord_Upd01_Dtl1R.$itm_sub3);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$ver_no, Ord_Upd01_Dtl1R.$ver_no);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$inst_qty, Ord_Upd01_Dtl1R.$inst_qty);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$yield_schd_qty, Ord_Upd01_Dtl1R.$yield_schd_qty);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$bom_ptn, Ord_Upd01_Dtl1R.$bom_ptn);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$po_schd_dt, Ord_Upd01_Dtl1R.$po_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$mfg_st_schd_dt, Ord_Upd01_Dtl1R.$mfg_st_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$mfg_end_schd_dt, Ord_Upd01_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$gi_schd_dt, Ord_Upd01_Dtl1R.$gi_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$accpt_schd_dt, Ord_Upd01_Dtl1R.$accpt_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$insp_st_schd_dt, Ord_Upd01_Dtl1R.$insp_st_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$insp_end_schd_dt, Ord_Upd01_Dtl1R.$insp_end_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$strg_schd_dt, Ord_Upd01_Dtl1R.$strg_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$avl_schd_dt, Ord_Upd01_Dtl1R.$avl_schd_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$master_dt, Ord_Upd01_Dtl1R.$master_dt);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$mfg_loc_cd, Ord_Upd01_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sppl_cd, Ord_Upd01_Dtl1R.$sppl_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$maker_cd, Ord_Upd01_Dtl1R.$maker_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$strg_loc_cd, Ord_Upd01_Dtl1R.$strg_loc_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$rqst_wg_cd, Ord_Upd01_Dtl1R.$rqst_wg_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$rqst_loc_cd, Ord_Upd01_Dtl1R.$rqst_loc_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$wg_cd, Ord_Upd01_Dtl1R.$wg_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sno1, Ord_Upd01_Dtl1R.$sno1);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sno_typ1, Ord_Upd01_Dtl1R.$sno_typ1);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sno2, Ord_Upd01_Dtl1R.$sno2);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sno_typ2, Ord_Upd01_Dtl1R.$sno_typ2);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sno3, Ord_Upd01_Dtl1R.$sno3);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sno_typ3, Ord_Upd01_Dtl1R.$sno_typ3);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sno4, Ord_Upd01_Dtl1R.$sno4);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$sno_typ4, Ord_Upd01_Dtl1R.$sno_typ4);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$mfg_sppl_cd, Ord_Upd01_Dtl1R.$mfg_sppl_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$mfg_maker_cd, Ord_Upd01_Dtl1R.$mfg_maker_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$strg_sppl_cd, Ord_Upd01_Dtl1R.$strg_sppl_cd);
				addColumnPathMap(OrdAutoFix_Upd02_DtlR.$io_schd_pr_no, Ord_Upd01_Dtl1R.$io_schd_pr_no);
			}
		}

		/** OrdAutoFix_Upd02_DtlR → Ord_Upd01_Dtl1R (OrdAutoFix_Upd02 → Ord_Upd02) */
		protected Map_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR_2<Ord_Upd01_Dtl1R, OrdAutoFix_Upd02_DtlR> createMap_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR_2() {
			return new Map_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR_2<Ord_Upd01_Dtl1R, OrdAutoFix_Upd02_DtlR>();
		}

		/** OrdAutoFix_Upd02_DtlR → Ord_Upd01_Dtl1R (OrdAutoFix_Upd02 → Ord_Upd02) */
		public class Map_Ord_Upd01_Dtl1R_OrdAutoFix_Upd02_DtlR_2<D extends Ord_Upd01_Dtl1R, S extends OrdAutoFix_Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, OrdAutoFix_Upd02_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, OrdAutoFix_Upd02_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, OrdAutoFix_Upd02_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$a_itm_ord_sts_typ, OrdAutoFix_Upd02_DtlR.$a_itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$b_itm_ord_sts_typ, OrdAutoFix_Upd02_DtlR.$b_itm_ord_sts_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, OrdAutoFix_Upd02_DtlR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, OrdAutoFix_Upd02_DtlR.$itm_ord_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord_gnrt_typ, OrdAutoFix_Upd02_DtlR.$ord_gnrt_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, OrdAutoFix_Upd02_DtlR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, OrdAutoFix_Upd02_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, OrdAutoFix_Upd02_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, OrdAutoFix_Upd02_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, OrdAutoFix_Upd02_DtlR.$ver_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, OrdAutoFix_Upd02_DtlR.$inst_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, OrdAutoFix_Upd02_DtlR.$yield_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, OrdAutoFix_Upd02_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, OrdAutoFix_Upd02_DtlR.$po_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, OrdAutoFix_Upd02_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, OrdAutoFix_Upd02_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$gi_schd_dt, OrdAutoFix_Upd02_DtlR.$gi_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt, OrdAutoFix_Upd02_DtlR.$accpt_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt, OrdAutoFix_Upd02_DtlR.$insp_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt, OrdAutoFix_Upd02_DtlR.$insp_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt, OrdAutoFix_Upd02_DtlR.$strg_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, OrdAutoFix_Upd02_DtlR.$avl_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, OrdAutoFix_Upd02_DtlR.$master_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, OrdAutoFix_Upd02_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, OrdAutoFix_Upd02_DtlR.$sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, OrdAutoFix_Upd02_DtlR.$maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, OrdAutoFix_Upd02_DtlR.$strg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, OrdAutoFix_Upd02_DtlR.$rqst_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_loc_cd, OrdAutoFix_Upd02_DtlR.$rqst_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$wg_cd, OrdAutoFix_Upd02_DtlR.$wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, OrdAutoFix_Upd02_DtlR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ1, OrdAutoFix_Upd02_DtlR.$sno_typ1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, OrdAutoFix_Upd02_DtlR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ2, OrdAutoFix_Upd02_DtlR.$sno_typ2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, OrdAutoFix_Upd02_DtlR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ3, OrdAutoFix_Upd02_DtlR.$sno_typ3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, OrdAutoFix_Upd02_DtlR.$sno4);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno_typ4, OrdAutoFix_Upd02_DtlR.$sno_typ4);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, OrdAutoFix_Upd02_DtlR.$unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_sppl_cd, OrdAutoFix_Upd02_DtlR.$mfg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_maker_cd, OrdAutoFix_Upd02_DtlR.$mfg_maker_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd, OrdAutoFix_Upd02_DtlR.$strg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_no, OrdAutoFix_Upd02_DtlR.$io_schd_pr_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$for_scheduler_frozen_flg, OrdAutoFix_Upd02_DtlR.$for_scheduler_frozen_flg);
			}
		}
	}

	//FMCB CUSTOM END
}