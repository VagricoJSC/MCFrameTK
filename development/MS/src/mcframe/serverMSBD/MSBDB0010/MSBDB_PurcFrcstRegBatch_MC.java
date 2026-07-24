package mcframe.serverMSBD.MSBDB0010;

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
import mcframe.serverMSBD.MSBDB0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.commonFX.notice.FX_Msg.FXUDL0010;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverMSBD.MSBDB0010.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXUC.FXUCL0030.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDB_PurcFrcstRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDB_PurcFrcstRegBatch_MC extends MSBDB_PurcFrcstRegBatch_MC_A{
	//FMCB CUSTOM START
	/**
	 * PurcFrcstReg_Ins01オペレーション.<p>
	 *
	 * 購買内示情報を新規作成する。<br>
	 */
	public class PurcFrcstReg_Ins01 extends MSBDB_PurcFrcstRegBatch_MC_A.PurcFrcstReg_Ins01 {
		/** 対象件数 */
		protected int _totalCnt;
		/** 正常終了件数 */
		protected int _successCnt;
		/** エラー件数 */
		protected int _errorCnt;
		/** スキップ件数 */
		protected int _skipCnt;
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
		 * メイン処理
		 */
		protected void execMain() {
			checkUp();
			if (hasErr()) {
				return;
			}
			editUp(up0());
			MCList<PurcFrcstReg_Ins01_CndR> upL = srchSppl(up0());
			List<MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Ins02> opeL = new ArrayList<>();
			for (PurcFrcstReg_Ins01_CndR upR: upL) {
				MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Ins02 ope = MSBDB_PurcFrcstRegBatch.crtPurcFrcstReg_Ins02();
				MCRow.copyall(ope.up0(), upR);
				opeL.add(ope);
			}
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				MCServerThreadManager.setCommitAndRollback(true);
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			for (MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Ins02 ope : opeL) {
				_totalCnt += ope.down0().total_cnt().intValue();
				_successCnt += ope.down0().success_cnt().intValue();
				_errorCnt += ope.down0().error_cnt().intValue();
				_skipCnt += ope.down0().skip_cnt().intValue();
			}
		}
		

		protected void editUp(PurcFrcstReg_Ins01_CndR r) {
			r.pf_dt(r.pf_dt().trunc(MCDateFieldType.DAY));
			setNullVal(up0());
		}

		/**
		 * 上り電文チェック
		 */
		protected void checkUp(){
			MCMessagePool.addAll(check(up0(), PurcFrcstReg_Ins01_CndR.$pf_dt, new FXUCL_RequiredValidater()));
			MCMessagePool.addAll(check(up0(), PurcFrcstReg_Ins01_CndR.$wg_cd, new FXUCL_RequiredValidater()));
			MCMessagePool.addAll(checkWg());
			if(!MCMessagePool.getMessageList().isEmpty()) {
				logger().writeDataLog(MCMessagePool.getMessageList());
			}
		}

		/**
		 * ワーキンググループチェック
		 */
		protected MCMessageList checkWg() {
			MCMessageList msgL = new MCMessageList();
			if (!isNull(up0().wg_cd())) {
				MAM_WG_R dbcR = MAM_WG_R.create();
				MAM_WG_R t = MAM_WG_R.create("T");
				MCQueryApiBuilder dbcR_bldr = MCQueryApiBuilder.create(t);
				dbcR_bldr.setSelect(t.purc_flg);
				dbSelectKey("MSBDB0010_MAM_WG_S01", dbcR, dbcR_bldr, up0().wg_cd());
				if (!dbcR.purc_flg()) {
					msgL.add(new MCMessage(MSBDL0061, up0().wg_cd()));
				}
			}
			return msgL;
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;
			_skipCnt = 0;
			getConcurrentLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBDL0020);
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
			logger().writeEndLog(MSBDL0507, _totalCnt, _successCnt, _errorCnt, _skipCnt);
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

		/**
		 * 発注先検索
		 */
		protected MCList<PurcFrcstReg_Ins01_CndR> srchSppl(PurcFrcstReg_Ins01_CndR upR) {
			MCList<PurcFrcstReg_Ins01_CndR> upL = MCList.create(PurcFrcstReg_Ins01_CndR.class);
			executeQuery(upL, MSBDB0010_MAM_BP_ITM_S01(), upR);
			for (PurcFrcstReg_Ins01_CndR r: upL) {
				upR.sppl_cd(r.sppl_cd());
				MCRow.copyall(r, upR);
			}
			upL.sort(PurcFrcstReg_Ins01_CndR.$sppl_cd);
			return upL;
		}
	}

	/**
	 * PurcFrcstReg_Ins02オペレーション.<p>
	 *
	 * 発注先単位で購買内示情報を登録する。<br>
	 */
	public class PurcFrcstReg_Ins02 extends MSBDB_PurcFrcstRegBatch_MC_A.PurcFrcstReg_Ins02 {

		/** 品目マスタ・キャッシュ  */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
		/** 品目単位マスタ・キャッシュ */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit;
		/** 購買内示情報登録対象（取引先品目マスタ） */
		protected MCList<MAM_BP_ITM_R> _spplItmL;
		/** 購買内示データ枠 */
		protected Map<String, MCList<MST_PURC_FRCST_D_R>> _mapPfWk;
		/** 前回以前確定済明細データ */
		protected MCList<MST_PURC_FRCST_D_R> _fixedDtlL;
		/** 前回以前確定済明細データINDEX */
		protected MCIndexKey _fixedDtlIdx;
		/** 受払予定検索結果 */
		protected MCList<MST_IO_SCHD_R> _tmpIoSchdL;
		/** 内示データ・確定 */
		protected MCList<MST_PURC_FRCST_FIX_R> _pfFixL;
		/** 内示データ・明細 */
		protected MCList<MST_PURC_FRCST_D_R> _pfDtlL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain();
		}

		/**
		 * 登録バッチメイン処理
		 */
		protected void execMain() {
			editUp();
			initCache();
			regPurcFrcst();
		}

		/**
		 * 上り電文編集
		 */
		protected void editUp() {
			// 未確定オーダ除く
			String ordStsTyp_Opn = " ";
			if(!up0().except_opn_ord_flg()) {
				ordStsTyp_Opn = MSC_ITM_ORD_STS_TYP.OPN.value();
			}
			up0().addStringColumn("itm_ord_sts_typ_opn", ordStsTyp_Opn);
			// 保存オーダ除く
			String ordStsTyp_Sav = " ";
			if(!up0().except_sav_ord_flg()) {
				ordStsTyp_Sav = MSC_ITM_ORD_STS_TYP.SAV.value();
			}
			up0().addStringColumn("itm_ord_sts_typ_sav", ordStsTyp_Sav);
		}

		/**
		 * キャッシュ初期化
		 */
		protected void initCache() {
			// 取引先品目マスタ検索
			_spplItmL = MCList.create(MAM_BP_ITM_R.class);
			executeQuery(_spplItmL, MSBDB0010_MAM_BP_ITM_S02(), up0());

			// 購買内示グループマスタ検索
			MCList<MAM_PF_GRP_R> dbcPfGrpL = MCList.create(MAM_PF_GRP_R.class);
			MAW_PF_GRP_KEY_R wk = MAW_PF_GRP_KEY_R.create("WK");
			for (MAM_BP_ITM_R r: _spplItmL.groupBy(MAM_BP_ITM_R.$pf_grp_cd)) {
				MAM_PF_GRP_R pfR = MAM_PF_GRP_R.create();
				pfR.pf_grp_cd(r.pf_grp_cd());
				dbcPfGrpL.add(pfR);
			}
			MAM_PF_GRP_R dbcPfGrpL_t = MAM_PF_GRP_R.create("T");
			MCQueryApiBuilder dbcPfGrpL_bldr = MCQueryApiBuilder.create(dbcPfGrpL_t);
			dbWkDelete("MSBDB0010_MAW_PF_GRP_D01", dbcPfGrpL_bldr.getBaseDbc());
			dbWkInsert("MSBDB0010_MAW_PF_GRP_I01", dbcPfGrpL, dbcPfGrpL_bldr.getBaseDbc());
			dbcPfGrpL_bldr.setSelect(dbcPfGrpL_t.pf_grp_cd);
			dbcPfGrpL_bldr.addSelect(dbcPfGrpL_t.weekly_period_num);
			dbcPfGrpL_bldr.addSelect(dbcPfGrpL_t.weekly_period_st);
			dbcPfGrpL_bldr.addSelect(dbcPfGrpL_t.tendays_period_num);
			dbcPfGrpL_bldr.addSelect(dbcPfGrpL_t.tendays_period_st);
			dbcPfGrpL_bldr.addSelect(dbcPfGrpL_t.monthly_period_num);
			dbcPfGrpL_bldr.addSelect(dbcPfGrpL_t.monthly_period_st);
			dbcPfGrpL_bldr.addSelect(dbcPfGrpL_t.fix_period_num);
			dbcPfGrpL_bldr.addInnerJoin(wk, bracket(wk.pf_grp_cd.eq(dbcPfGrpL_t.pf_grp_cd)));
			dbSelect("MSBDB0010_MAM_PF_GRP_S01", dbcPfGrpL, dbcPfGrpL_bldr);
			_mapPfWk = new HashMap<String, MCList<MST_PURC_FRCST_D_R>>();
			MCDate pfStDt = up0().pf_dt();
			MCDate pfEndDt = up0().pf_dt();
			for (MAM_PF_GRP_R r : dbcPfGrpL) {
				MCList<MST_PURC_FRCST_D_R> pfL = crtPfDataWk(up0().pf_dt(), r);
				MCDate stDt = (MCDate)pfL.min(MST_PURC_FRCST_D_R.$pf_period_st_dt);
				MCDate endDt = (MCDate)pfL.max(MST_PURC_FRCST_D_R.$pf_period_end_dt);
				if (isNull(pfStDt) || stDt.lt(pfStDt)) {
					pfStDt = stDt;
				}
				if (isNull(pfEndDt) || endDt.gt(pfEndDt)) {
					pfEndDt = endDt;
				}
				_mapPfWk.put(r.pf_grp_cd(), pfL);
			}
			if (!isNull(pfEndDt)) {
				pfEndDt = pfEndDt.endTimeOfDay();
			}
			up0().addDateColumn("pf_st_dt", pfStDt);
			up0().addDateColumn("pf_end_dt", pfEndDt);

			// 品目マスタ・キャッシュ
			MCList<MAM_ITM_R> dbcItmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R dbcItmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(dbcItmL_t);
			dbcItmL_bldr.setSelect(dbcItmL_t.itm_cd);
			dbcItmL_bldr.addSelect(dbcItmL_t.itm_sub1);
			dbcItmL_bldr.addSelect(dbcItmL_t.itm_sub2);
			dbcItmL_bldr.addSelect(dbcItmL_t.itm_sub3);
			dbcItmL_bldr.addSelect(dbcItmL_t.unit_cd);
			dbcItmL_bldr.addSelect(dbcItmL_t.dec_place);
			dbcItmL_bldr.addSelect(dbcItmL_t.rnd_typ);
			dbcItmL_bldr.addSelect(dbcItmL_t.purc_unit_cd);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcItmL, dbcItmL_bldr, _spplItmL,
				new String[] {
					MAM_BP_ITM_R.$itm_cd,
					MAM_BP_ITM_R.$itm_sub1,
					MAM_BP_ITM_R.$itm_sub2,
					MAM_BP_ITM_R.$itm_sub3
				});

			// 品目単位マスタ・キャッシュ
			MAVM_ITM_UNIT_R dbcItemUnitL_t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbcItemUnitL_bldr = MCQueryApiBuilder.create(dbcItemUnitL_t);
			dbcItemUnitL_bldr.setSelect(dbcItemUnitL_t.itm_cd);
			dbcItemUnitL_bldr.addSelect(dbcItemUnitL_t.itm_sub1);
			dbcItemUnitL_bldr.addSelect(dbcItemUnitL_t.itm_sub2);
			dbcItemUnitL_bldr.addSelect(dbcItemUnitL_t.itm_sub3);
			dbcItemUnitL_bldr.addSelect(dbcItemUnitL_t.unit_cd);
			dbcItemUnitL_bldr.addSelect(dbcItemUnitL_t.conv_base_qty);
			dbcItemUnitL_bldr.addSelect(dbcItemUnitL_t.conv_qty);
			dbcItemUnitL_bldr.addSelect(dbcItemUnitL_t.dec_place);
			dbcItemUnitL_bldr.addSelect(dbcItemUnitL_t.rnd_typ);
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcItemUnitL_bldr, dbcItmL,
					new String[] {
						MAM_ITM_R.$itm_cd,
						MAM_ITM_R.$itm_sub1,
						MAM_ITM_R.$itm_sub2,
						MAM_ITM_R.$itm_sub3,
						MAM_ITM_R.$purc_unit_cd
					});
		}

		/**
		 * 購買内示情報作成処理
		 */
		protected void regPurcFrcst() {
			// 対象レコードをロック
			lock(up0());
			// 既存データ削除
			if (delPurcFrcst(up0())) {
				// コンテナ初期化
				intiDbc();
				// 購買内示情報（未発注データ）検索
				srchPurcFrcst();
				// 確定済データ検索
				srchFixedData();
				// 購買内示情報作成
				makePfDate();
				// 購買内示情報登録
				insPfDate();
			}
			if (hasErr()) {
				logger().writeDataLog(MSBDL0022, toYMDString(up0().pf_dt()), up0().sppl_cd(), up0().wg_cd());
				setDown(true);
			}
			else {
				setDown(false);
			}
		}

		/**
		 * データ初期化
		 */
		protected void intiDbc() {
			_pfFixL = MCList.create(MST_PURC_FRCST_FIX_R.class);
			_pfDtlL = MCList.create(MST_PURC_FRCST_D_R.class);
			_tmpIoSchdL = MCList.create(MST_IO_SCHD_R.class);
		}

	

		/**
		 * 購買内示予定データ検索
		 */
		protected void srchPurcFrcst() {
			String[] itmKey = new String[] {
					MAM_BP_ITM_R.$bp_cd,
					MAM_BP_ITM_R.$itm_cd,
					MAM_BP_ITM_R.$itm_sub1,
					MAM_BP_ITM_R.$itm_sub2,
					MAM_BP_ITM_R.$itm_sub3};
			MCQueryApiBuilder spplItmL_bldr = MCQueryApiBuilder.create(MAM_BP_ITM_R.create("T"));
			dbWkDelete("MSBDB0010_MAW_BP_ITM_D01", spplItmL_bldr.getBaseDbc());
			dbWkInsert("MSBDB0010_MAW_BP_ITM_I01", _spplItmL.groupBy(itmKey), spplItmL_bldr.getBaseDbc());

			_tmpIoSchdL.addAll(srchPoSchd());
			_tmpIoSchdL.addAll(srchItmOrder());
			_tmpIoSchdL.addAll(srchPrcdItmOrder());
		}

		protected MCList<MST_IO_SCHD_R> srchPoSchd() {
			MCList<MST_IO_SCHD_R> rsltL = MCList.create(MST_IO_SCHD_R.class);
			executeQuery(rsltL, MSBDB0010_MST_PO_SCHD_S01(), up0());
			return rsltL;
		}

		/**
		 * 品目オーダ情報検索
		 */
		protected MCList<MST_IO_SCHD_R> srchItmOrder() {
			MCList<MST_IO_SCHD_R> rsltL = MCList.create(MST_IO_SCHD_R.class);
			if (!up0().except_opn_ord_flg() || !up0().except_sav_ord_flg()) {
				executeQuery(rsltL, MSBDB0010_MST_ITM_ORDER_S01(), up0());
			}
			return rsltL;
		}

		/**
		 * 先行手配品目オーダ情報検索
		 */
		protected MCList<MST_IO_SCHD_R> srchPrcdItmOrder() {
			MCList<MST_IO_SCHD_R> rsltL = MCList.create(MST_IO_SCHD_R.class);
			if (!up0().except_prcd_ord_flg()) {
				executeQuery(rsltL, MSBDB0010_MST_PRCD_ITM_ORDER_S01(), up0());
			}
			return rsltL;
		}

		/**
		 * 前回以前の確定データ検索
		 */
		protected void srchFixedData() {
			_fixedDtlL = MCList.create(MST_PURC_FRCST_D_R.class);
			executeQuery(_fixedDtlL, MSBDB0010_MST_PURC_FRCST_D_S01(), up0());
			String[] fixedDtlKeys = new String[] {
					MST_PURC_FRCST_FIX_R.$itm_cd,
					MST_PURC_FRCST_FIX_R.$itm_sub1,
					MST_PURC_FRCST_FIX_R.$itm_sub2,
					MST_PURC_FRCST_FIX_R.$itm_sub3,
					MST_PURC_FRCST_D_R.$pf_period_typ,
					MST_PURC_FRCST_D_R.$pf_period_st_dt};
			_fixedDtlIdx = _fixedDtlL.createIndex(fixedDtlKeys);
		}

		/**
		 * 内示情報データワーク作成
		 */
		protected void makePfDate() {
			MCList<MAM_BP_ITM_R> itmL = _spplItmL.subList(MAM_BP_ITM_R.$bp_cd, up0().sppl_cd());
			for (MAM_BP_ITM_R itmR: itmL) {
				MCList<MST_PURC_FRCST_D_R> pfWkL = _mapPfWk.get(itmR.pf_grp_cd());
				if (isNull(pfWkL)) {
					continue;
				}
				MCList<MST_PURC_FRCST_D_R> dtlL = pfWkL.clone();
				dtlL.addStringColumn(MST_PURC_FRCST_FIX_R.$itm_cd, itmR.itm_cd());
				dtlL.addStringColumn(MST_PURC_FRCST_FIX_R.$itm_sub1, itmR.itm_sub1());
				dtlL.addStringColumn(MST_PURC_FRCST_FIX_R.$itm_sub2, itmR.itm_sub2());
				dtlL.addStringColumn(MST_PURC_FRCST_FIX_R.$itm_sub3, itmR.itm_sub3());

				MST_PURC_FRCST_FIX_R fixR = MST_PURC_FRCST_FIX_R.create();
				fixR.itm_cd(itmR.itm_cd());
				fixR.itm_sub1(itmR.itm_sub1());
				fixR.itm_sub2(itmR.itm_sub2());
				fixR.itm_sub3(itmR.itm_sub3());
				fixR.fix_flg(itmR.pf_fix_flg());

				MAM_ITM_R itm = getItm(fixR);
				if (isNull(itm)) {
					continue;
				}
				fixR.base_unit_cd(itm.unit_cd());
				fixR.trd_unit_cd(isNull(itm.purc_unit_cd()) ? itm.unit_cd() : itm.purc_unit_cd());

				setPfQtyFromDbc(dtlL, fixR);
				_pfDtlL.addAll(dtlL);
				_pfFixL.add(fixR);
			}
		}

		/**
		 * 検索結果より内示数量を結果リストにセット
		 */
		protected void setPfQtyFromDbc(MCList<MST_PURC_FRCST_D_R> dtlL, MST_PURC_FRCST_FIX_R fixR) {
			String[] keys = new String[] {
				MST_IO_SCHD_R.$itm_cd,
				MST_IO_SCHD_R.$itm_sub1,
				MST_IO_SCHD_R.$itm_sub2,
				MST_IO_SCHD_R.$itm_sub3,
				MST_IO_SCHD_R.$avl_schd_dt};
			MCIndexKey idxKey = _tmpIoSchdL.createIndex(keys);
			for (MST_PURC_FRCST_D_R r: dtlL) {
				MST_PURC_FRCST_D_R fixedDtlR = _fixedDtlL.getFirst(_fixedDtlIdx, getVals(_fixedDtlIdx.getKeys(), r));
				if (r.fix_period_flg() && !isNull(fixedDtlR)) { // 確定済データ存在する場合
					if (isSame(fixR.trd_unit_cd(), fixedDtlR.getStringNE("trd_unit_cd"))) {
						r.trd_unit_pf_qty(fixedDtlR.trd_unit_pf_qty());
						r.trd_unit_schd_qty(fixedDtlR.trd_unit_schd_qty());
						r.trd_unit_prms_qty(fixedDtlR.trd_unit_prms_qty());
						r.base_unit_pf_qty(fixedDtlR.base_unit_pf_qty());
						r.base_unit_schd_qty(fixedDtlR.base_unit_schd_qty());
						r.base_unit_prms_qty(fixedDtlR.base_unit_prms_qty());
					}
					else {
						r.trd_unit_pf_qty(convToTrdQty(fixedDtlR.base_unit_pf_qty(), fixR));
						r.trd_unit_schd_qty(convToTrdQty(fixedDtlR.base_unit_schd_qty(), fixR));
						r.trd_unit_prms_qty(convToTrdQty(fixedDtlR.base_unit_prms_qty(), fixR));
						r.base_unit_pf_qty(convToBaseQty(r.trd_unit_pf_qty(), fixR));
						r.base_unit_schd_qty(convToBaseQty(r.trd_unit_schd_qty(), fixR));
						r.base_unit_prms_qty(convToBaseQty(r.trd_unit_prms_qty(), fixR));
					}
					continue;
				}
				for (MCDate day = r.pf_period_st_dt();
						day.lte(r.pf_period_end_dt());
						day = day.addDay(MCNumber.ONE)) {
					Comparable[] vals = new Comparable[] {
							fixR.itm_cd(),
							fixR.itm_sub1(),
							fixR.itm_sub2(),
							fixR.itm_sub3(),
							day};
					for (MST_IO_SCHD_R ioR: _tmpIoSchdL.subList(idxKey, vals)) {
						r.base_unit_schd_qty(r.base_unit_schd_qty().add(ioR.base_unit_qty()));
						r.trd_unit_schd_qty(r.trd_unit_schd_qty().add(convToTrdQty(ioR.base_unit_qty(), fixR)));
					}
					r.trd_unit_pf_qty(r.trd_unit_schd_qty());
					r.base_unit_pf_qty(r.base_unit_schd_qty());
				}
			}
		}
		/**
		 * 購買内示情報DB登録
		 */
		protected void insPfDate() {
			if (isNull(_pfDtlL)) {
				return;
			}
			String[] keys = new String[] {
					MST_PURC_FRCST_FIX_R.$itm_cd,
					MST_PURC_FRCST_FIX_R.$itm_sub1,
					MST_PURC_FRCST_FIX_R.$itm_sub2,
					MST_PURC_FRCST_FIX_R.$itm_sub3};
			// ヘッダ項目
			MST_PURC_FRCST_H_R hdrR = insPfHdr();
			// 明細＆確定項目
			doSeqCache(MSC_NUM_SYS_TYP.PURCFCSTFIX, _pfFixL.size());
			doSeqCache(MSC_NUM_SYS_TYP.PURCFCSTD, _pfDtlL.size());
			for (MST_PURC_FRCST_FIX_R fixR: _pfFixL){
				fixR.purc_frcst_no(hdrR.purc_frcst_no());
				fixR.purc_frcst_fix_no(getStrSeq(MSC_NUM_SYS_TYP.PURCFCSTFIX));
				MCList<MST_PURC_FRCST_D_R> subDtlL = _pfDtlL.subList(keys, getVals(keys, fixR));
				subDtlL.sort(MST_PURC_FRCST_D_R.$pf_period_typ, MST_PURC_FRCST_D_R.$pf_period_st_dt);
				subDtlL.setString(MST_PURC_FRCST_D_R.$purc_frcst_no, hdrR.purc_frcst_no());
				subDtlL.setString(MST_PURC_FRCST_D_R.$purc_frcst_fix_no, fixR.purc_frcst_fix_no());
				for (MST_PURC_FRCST_D_R r:subDtlL){
					r.purc_frcst_d_no(getStrSeq(MSC_NUM_SYS_TYP.PURCFCSTD));
				}
			}
			MCQueryApiBuilder pfFixL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_FIX_R.create("T"));
			dbInsertEx("MSBDB0010_MST_PURC_FRCST_FIX_I01", _pfFixL, pfFixL_bldr);
			MCQueryApiBuilder pfDtlL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_D_R.create("T"));
			dbInsertEx("MSBDB0010_MST_PURC_FRCST_D_I01", _pfDtlL, pfDtlL_bldr);
		}

		/**
		 * 購買内示ヘッダ登録
		 */
		protected MST_PURC_FRCST_H_R insPfHdr() {
			MST_PURC_FRCST_H_R hdrR = MST_PURC_FRCST_H_R.create();
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder hdrR_bldr = MCQueryApiBuilder.create(t);
			hdrR_bldr.setWhere(t.pf_dt.eq(bind("1")), up0().pf_dt());
			hdrR_bldr.addWhereWithAnd(t.wg_cd.eq(bind("1")), up0().wg_cd());
			hdrR_bldr.addWhereWithAnd(t.sppl_cd.eq(bind("1")), up0().sppl_cd());
			dbSelect("MSBDB0010_MST_PURC_FRCST_H_S01", hdrR, hdrR_bldr);
			if (isNull(hdrR.purc_frcst_no())) {
				hdrR.purc_frcst_no(getStrSeq(MSC_NUM_SYS_TYP.PURCFCST));
				hdrR.pf_dt(up0().pf_dt());
				hdrR.sppl_cd(up0().sppl_cd());
				hdrR.wg_cd(up0().wg_cd());
				dbInsertEx("MSBDB0010_MST_PURC_FRCST_H_I01", hdrR, hdrR_bldr);
			}
			else {
				dbUpdate("MSBDB0010_MST_PURC_FRCST_H_U01", hdrR, hdrR_bldr);
			}
			return hdrR;
		}

		/**
		 * 下り電文（処理件数）設定
		 */
		protected void setDown(boolean errFlg) {
			down0().total_cnt(1);
			down0().success_cnt((errFlg || isNull(_pfDtlL))?0:1);
			down0().error_cnt(errFlg?1:0);
			down0().skip_cnt((errFlg || !isNull(_pfDtlL))?0:1);
		}

		/**
		 *　購買内示グループマスタによりワークデータを作成する。
		 */
		protected MCList<MST_PURC_FRCST_D_R> crtPfDataWk(MCDate pfDay, MAM_PF_GRP_R pfGrpMstR) {
			MCList<MST_PURC_FRCST_D_R> wkL = MCList.create(MST_PURC_FRCST_D_R.class);
			// 内示日を基準とし内示期間を判断する
			MCNumber fixPkt = pfGrpMstR.fix_period_num();
			MCNumber weeks = pfGrpMstR.weekly_period_num();
			MCNumber tendays = pfGrpMstR.tendays_period_num();
			MCNumber yms = pfGrpMstR.monthly_period_num();
			MCDate stDay = pfDay;
			MCDate minStDay = null;
			// 週次内示
			if (pfGrpMstR.weekly_period_num().gt(MCNumber.ZERO)) {
				MCNumber stWeek = pfGrpMstR.weekly_period_st();
				for (int i = stWeek.intValue(); i < stWeek.add(weeks).intValue() ; i++) {
					MST_PURC_FRCST_D_R wkR = MST_PURC_FRCST_D_R.create();
					if (setWeekPeriod(pfDay, i, wkR) >= 0) {
						wkR.fix_period_flg((i - stWeek.intValue() + 1) <= fixPkt.intValue());
						wkR.pf_period_typ(MAC_PERIOD_TYP.WEEKLY.value());
						wkR.trd_unit_schd_qty(MCNumber.ZERO);
						wkR.base_unit_schd_qty(MCNumber.ZERO);
						wkR.trd_unit_pf_qty(MCNumber.ZERO);
						wkR.base_unit_pf_qty(MCNumber.ZERO);
						wkL.add(wkR);
						stDay = wkR.pf_period_end_dt().addDay(1);
						if (i == stWeek.intValue()) {
							minStDay = wkR.pf_period_st_dt();
						}
					}
				}
			}
			// 旬次内示
			else if (pfGrpMstR.tendays_period_num().gt(MCNumber.ZERO)) {
				MCNumber stTenday = pfGrpMstR.tendays_period_st();
				for (int i = stTenday.intValue(); i < stTenday.add(tendays).intValue() ; i++) {
					MST_PURC_FRCST_D_R wkR = MST_PURC_FRCST_D_R.create();
					if (setTendaysPeriod(pfDay, i, wkR) >= 0) {
						wkR.fix_period_flg((i - stTenday.intValue() + 1) <= fixPkt.intValue());
						wkR.pf_period_typ(MAC_PERIOD_TYP.TENDAYS.value());
						wkR.trd_unit_schd_qty(MCNumber.ZERO);
						wkR.base_unit_schd_qty(MCNumber.ZERO);
						wkR.trd_unit_pf_qty(MCNumber.ZERO);
						wkR.base_unit_pf_qty(MCNumber.ZERO);
						wkL.add(wkR);
						stDay = wkR.pf_period_end_dt().addDay(1);
						if (i == stTenday.intValue()) {
							minStDay = wkR.pf_period_st_dt();
						}
					}
				}
			}
			// 月次内示
			if (pfGrpMstR.monthly_period_num().gt(MCNumber.ZERO)) {
				MCNumber stYm = pfGrpMstR.monthly_period_st();
				for (int i = stYm.intValue(); i < stYm.add(yms).intValue() ; i++) {
					MST_PURC_FRCST_D_R wkR = MST_PURC_FRCST_D_R.create();
					if (setYmPeriod(pfDay, stDay, i, wkR) >= 0) {
						// 週・旬パケットの最初開始日より早い月パケットは作成しない。
						if (!isNull(minStDay) && wkR.pf_period_st_dt().lt(minStDay)) {
							continue;
						}
						if (weeks.lte(MCNumber.ZERO) && tendays.lte(MCNumber.ZERO) ) {
							wkR.fix_period_flg((i - stYm.intValue() + 1) <= fixPkt.intValue());
						}
						wkR.pf_period_typ(MAC_PERIOD_TYP.MONTHLY.value());
						wkR.trd_unit_schd_qty(MCNumber.ZERO);
						wkR.base_unit_schd_qty(MCNumber.ZERO);
						wkR.trd_unit_pf_qty(MCNumber.ZERO);
						wkR.base_unit_pf_qty(MCNumber.ZERO);
						wkL.add(wkR);
					}
				}
			}
			return wkL;
		}

		/**
		 * 指定週の期間（開始日～終了日）取得
		 */
		protected long setWeekPeriod (MCDate stdDay, int offset, MST_PURC_FRCST_D_R wkR) {
			wkR.pf_period_st_dt(addPeriodStDt(stdDay, MAC_PERIOD_TYP.WEEKLY.value(), offset - 1));
			wkR.pf_period_end_dt(getPeriodEndDt(wkR.pf_period_st_dt(), MAC_PERIOD_TYP.WEEKLY.value()));
			return wkR.pf_period_end_dt().diffDay(stdDay);
		}

		/**
		 * 指定旬の期間（開始日～終了日）取得
		 */
		protected long setTendaysPeriod (MCDate stdDay, int offset, MST_PURC_FRCST_D_R wkR) {
			wkR.pf_period_st_dt(addPeriodStDt(stdDay, MAC_PERIOD_TYP.TENDAYS.value(), offset - 1));
			wkR.pf_period_end_dt(getPeriodEndDt(wkR.pf_period_st_dt(), MAC_PERIOD_TYP.TENDAYS.value()));
			return wkR.pf_period_end_dt().diffDay(stdDay);
		}

		/**
		 * 指定月の期間（開始日～終了日）取得
		 */
		protected long setYmPeriod (MCDate stdDay, MCDate stDay, int offset, MST_PURC_FRCST_D_R wkR) {
			wkR.pf_period_st_dt(addPeriodStDt(stdDay, MAC_PERIOD_TYP.MONTHLY.value(), offset - 1));
			wkR.pf_period_end_dt(getPeriodEndDt(wkR.pf_period_st_dt(), MAC_PERIOD_TYP.MONTHLY.value()));
			return wkR.pf_period_end_dt().diffDay(stDay);
		}

		/**
		 * 基準単位数量へ換算する
		 */
		protected MCNumber convToBaseQty(MCNumber trdQty, MST_PURC_FRCST_FIX_R fixR) {
			MCNumber rsltQty = trdQty;
			if (isNull(trdQty)) {
				rsltQty = MCNumber.ZERO;
			}
			if (isSame(fixR.base_unit_cd(), fixR.trd_unit_cd())) {
				return rsltQty;
			}
			MAM_ITM_R itmR = getItm(fixR);
			MAVM_ITM_UNIT_R unitR = getItmUnit(fixR.itm_cd(),
					fixR.itm_sub1(),
					fixR.itm_sub2(),
					fixR.itm_sub3(),
					fixR.trd_unit_cd());
			if (isNull(unitR.itm_cd())) {
				return trdQty;
			}
			rsltQty = convToBaseUnit(trdQty,
					unitR.conv_base_qty(),
					unitR.conv_qty(),
					itmR.dec_place(),
					itmR.rnd_typ());
			if (isNull(rsltQty)) {
				return MCNumber.ZERO;
			}
			return rsltQty;
		}
		/**
		 * 取引単位数量へ換算する
		 */
		protected MCNumber convToTrdQty(MCNumber baseQty, MST_PURC_FRCST_FIX_R fixR) {
			MCNumber rsltQty = baseQty;
			if (isNull(baseQty)) {
				rsltQty = MCNumber.ZERO;
			}
			if (isSame(fixR.base_unit_cd(), fixR.trd_unit_cd())) {
				return rsltQty;
			}
			MAVM_ITM_UNIT_R unitR = getItmUnit(fixR.itm_cd(),
					fixR.itm_sub1(),
					fixR.itm_sub2(),
					fixR.itm_sub3(),
					fixR.trd_unit_cd());
			if (isNull(unitR.itm_cd())) {
				return rsltQty;
			}
			rsltQty = rvrsBaseUnitConv(baseQty,
					unitR.conv_base_qty(),
					unitR.conv_qty(),
					unitR.dec_place(),
					unitR.rnd_typ());
			if (isNull(rsltQty)) {
				return MCNumber.ZERO;
			}
			return rsltQty;
		}

		/**
		 * 品目ＣＤ、枝番１～３から品目マスタの情報を取得する。
		 */
		protected MAM_ITM_R getItm(MCRow r) {
			MAM_ITM_R itmR =  _cacheItm.get(
					r.getString(MAM_ITM_R.$itm_cd),
					r.getString(MAM_ITM_R.$itm_sub1),
					r.getString(MAM_ITM_R.$itm_sub2),
					r.getString(MAM_ITM_R.$itm_sub3));
			if (isNull(itmR.itm_cd())) {
				return null;
			}
			return itmR;
		}

		/**
		 * 品目ＣＤ、単位ＣＤから品目単位マスタの情報を取得する。
		 */
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			return _cacheItmUnit.get(itmCd, itmSub1, itmSub2,itmSub3, unitCd);
		}
	}

	/**
	 * PurcFrcstReg_Del01オペレーション.<p>
	 *
	 * 購買内示情報を削除する。<br>
	 */
	public class PurcFrcstReg_Del01 extends MSBDB_PurcFrcstRegBatch_MC_A.PurcFrcstReg_Del01 {
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
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;
			getConcurrentLogger();
		}

		/**
		 * メイン処理
		 */
		protected void execMain() {
			checkUp();
			if (hasErr()) {
				return;
			}
			editUp(up0());
			MCList<PurcFrcstReg_Ins01_CndR> upL = srchSppl(up0());
			List<MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Del02> opeL = new ArrayList<>();
			for (PurcFrcstReg_Ins01_CndR upR: upL) {
				MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Del02 ope = MSBDB_PurcFrcstRegBatch.crtPurcFrcstReg_Del02();
				MCRow.copyall(ope.up0(), upR);
				opeL.add(ope);
			}
			if (!opeL.isEmpty()) {
				MCServerThreadManager.setCommitAndRollback(true);
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			for (MSBDB_PurcFrcstRegBatch.PurcFrcstReg_Del02 ope : opeL) {
				_totalCnt += ope.down0().total_cnt().intValue();
				_successCnt += ope.down0().success_cnt().intValue();
				_errorCnt += ope.down0().error_cnt().intValue();
			}
		}

		protected void editUp(PurcFrcstReg_Ins01_CndR r) {
			r.pf_dt(r.pf_dt().trunc(MCDateFieldType.DAY));
			setNullVal(up0());
		}
		
		/**
		 * 上り電文チェック
		 */
		protected void checkUp(){
			MCMessagePool.addAll(check(up0(), PurcFrcstReg_Ins01_CndR.$pf_dt, new FXUCL_RequiredValidater()));
			MCMessagePool.addAll(check(up0(), PurcFrcstReg_Ins01_CndR.$wg_cd, new FXUCL_RequiredValidater()));
			if(!MCMessagePool.getMessageList().isEmpty()) {
				logger().writeDataLog(MCMessagePool.getMessageList());
			}
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBDL0024);
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
			logger().writeEndLog(MSBDL0025, _totalCnt, _successCnt, _errorCnt);
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

		/**
		 * 発注先検索
		 */
		protected MCList<PurcFrcstReg_Ins01_CndR> srchSppl(PurcFrcstReg_Ins01_CndR upR) {
			MCList<PurcFrcstReg_Ins01_CndR> upL = MCList.create(PurcFrcstReg_Ins01_CndR.class);
			executeQuery(upL, MSBDB0010_MST_PURC_FRCST_H_S01(), upR);
			for (PurcFrcstReg_Ins01_CndR r: upL) {
				upR.sppl_cd(r.sppl_cd());
				MCRow.copyall(r, upR);
			}
			upL.sort(PurcFrcstReg_Ins01_CndR.$sppl_cd);
			return upL;
		}
	}

	/**
	 * PurcFrcstReg_Del02オペレーション.<p>
	 *
	 * 発注先単位で購買内示情報を削除する。<br>
	 */
	public class PurcFrcstReg_Del02 extends MSBDB_PurcFrcstRegBatch_MC_A.PurcFrcstReg_Del02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			execMain();
		}

		/**
		 * 登録バッチメイン処理
		 */
		protected void execMain() {
			lock(up0());
			delPurcFrcst(up0());
			if (hasErr()) {
				logger().writeDataLog(MSBDL0022, toYMDString(up0().pf_dt()), up0().sppl_cd(), up0().wg_cd());
				setDown(true);
			}
			else {
				setDown(false);
			}
		}

	
		/**
		 * 下り電文（処理件数）設定
		 */
		protected void setDown(boolean errFlg) {
			down0().total_cnt(1);
			down0().success_cnt(errFlg?0:1);
			down0().error_cnt(errFlg?1:0);
		}
	}

	/**
	 * 対象ワーキンググループ、発注先をロックする
	 */
	protected void lock(PurcFrcstReg_Ins01_CndR cnd){
		MST_PURC_FRCST_LOCK_R tgtR = MST_PURC_FRCST_LOCK_R.create();
		tgtR.wg_cd(cnd.wg_cd());
		tgtR.sppl_cd(cnd.sppl_cd());
		MCDBTransaction curTran = dbTran();
		try {
			createDBTran();
			MST_PURC_FRCST_LOCK_R lockedR = tryLock(tgtR);
			if (isNull(lockedR.sppl_cd())) {
				// レコードが存在しなかった場合、レコード追加後に再度ロックする
				try {
					MCQueryApiBuilder tgtR_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_LOCK_R.create("T"));
					dbInsertEx("MSBDB0010_MST_PURC_FRCST_LOCK_I01", tgtR, tgtR_bldr);
					dbTran().commit();
				}
				catch(MCException e) {
					// 同時に登録した場合は1度だけ再度ロックを試みる
					if (isSame(FXUDL0010, e.getID())) {
						dbTran().rollback();
					}
					else {
						throw e;
					}
				}
				lockedR = tryLock(tgtR);
				if (isNull(lockedR.sppl_cd())) {
					throw new MCAppException("FCBCC0110");
				}
			}
		}
		finally {
			setCurrentDBTran(curTran);
		}
	}

	/**
	 * 購買内示ロックテーブル登録
	 */
	protected MST_PURC_FRCST_LOCK_R tryLock(MST_PURC_FRCST_LOCK_R tgtR) {
		MST_PURC_FRCST_LOCK_R lockedR = MST_PURC_FRCST_LOCK_R.create();
		MST_PURC_FRCST_LOCK_R t = MST_PURC_FRCST_LOCK_R.create("T");
		MCQueryApiBuilder lockedR_bldr = MCQueryApiBuilder.create(t);
		lockedR_bldr.setSelect(t.sppl_cd, t.wg_cd);
		dbSelectKeyForUpdate("MSBDB0010_MST_PURC_FRCST_LOCK_S01", lockedR, lockedR_bldr, tgtR);
		return lockedR;
	}

	protected boolean isCanBeDelete(MST_PURC_FRCST_H_R hdrR) {
		if (hdrR.pf_rpt_flg() && !hdrR.del_pf_rpt_flg()) {
			logger().writeDataLog(MSBDL0023, toYMDString(hdrR.pf_dt()), hdrR.sppl_cd(), hdrR.wg_cd());
			MCMessagePool.add(new MCMessage(MSBDL0023, toYMDString(hdrR.pf_dt()), hdrR.sppl_cd(), hdrR.wg_cd()));
			return false;
		}
		return true;
	}

	/**
	 * エラー有無判断
	 */
	protected boolean hasErr() {
		return MCMessagePool.size() > 0;
	}

	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	/**
	 *  購買内示データ削除処理
	 */
	protected boolean delPurcFrcst(PurcFrcstReg_Ins01_CndR r) {
		// 引数のユニークキーで削除対象の購買内示ヘッダを取得
		MST_PURC_FRCST_H_R hdrR = srchDelTgtHdr(r);
		if (isCanBeDelete(hdrR)) {
			// 品目がNULLの場合はヘッダ単位で削除（品目CDがNULLなのに手配NOのみが指定された場合、手配NOは無視される）
			if (isNull(r.itm_cd())) {
				delPurcFrcstNoItm(hdrR);
			}
			else {
				delPurcFrcstByItm(hdrR, r);
			}
			return true;
		}
		return false;
	}
	
	protected MST_PURC_FRCST_H_R srchDelTgtHdr(PurcFrcstReg_Ins01_CndR r) {
		MST_PURC_FRCST_H_R hdrR = MST_PURC_FRCST_H_R.create();
		MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
		MCQueryApiBuilder hdrR_bldr = MCQueryApiBuilder.create(t);
		hdrR_bldr.setSelect(t.purc_frcst_no);
		hdrR_bldr.addSelect(t.pf_rpt_flg);
		hdrR_bldr.addSelect(t.del_pf_rpt_flg);
		hdrR_bldr.addSelect(t.pf_dt);
		hdrR_bldr.addSelect(t.wg_cd);
		hdrR_bldr.addSelect(t.sppl_cd);
		hdrR_bldr.setWhere(t.pf_dt.eq(bind("1")), r.pf_dt());
		hdrR_bldr.addWhereWithAnd(t.wg_cd.eq(bind("1")), r.wg_cd());
		hdrR_bldr.addWhereWithAnd(t.sppl_cd.eq(bind("1")), r.sppl_cd());
		dbSelect("MSBDB0010_MST_PURC_FRCST_H_S02", hdrR, hdrR_bldr);
		return hdrR;
	}
	
	

	protected void delPurcFrcstNoItm(MST_PURC_FRCST_H_R hdrR) {
		// 購買内示ヘッダに紐づく購買内示明細を削除
		executeUpdate(MSBDB0010_MST_PURC_FRCST_D_D02(), hdrR);
		// 購買内示ヘッダに紐づく購買内示確定を削除
		executeUpdate(MSBDB0010_MST_PURC_FRCST_FIX_D02(), hdrR);
		// 購買内示ヘッダを削除
		executeUpdate(MSBDB0010_MST_PURC_FRCST_H_D02(), hdrR);
	}

	protected void delPurcFrcstByItm(MST_PURC_FRCST_H_R hdrR, PurcFrcstReg_Ins01_CndR r) {
		r.addStringColumn("purc_frcst_no", hdrR.purc_frcst_no());
		// 条件に従って購買内示確定を削除
		executeUpdate(MSBDB0010_MST_PURC_FRCST_FIX_D01(), r);
		// 購買内示確定と紐づかない購買内示明細を削除
		executeUpdate(MSBDB0010_MST_PURC_FRCST_D_D01());
		// 購買内示明細が０件となった購買内示ヘッダを削除
		executeUpdate(MSBDB0010_MST_PURC_FRCST_H_D01());
	}

	protected void setNullVal(PurcFrcstReg_Ins01_CndR r) {
		if (!isNull(r.itm_cd())) {
			r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
		}
		else {
			r.itm_sub1(null);
			r.itm_sub2(null);
			r.itm_sub3(null);
		}
	}

	//FMCB CUSTOM END
}