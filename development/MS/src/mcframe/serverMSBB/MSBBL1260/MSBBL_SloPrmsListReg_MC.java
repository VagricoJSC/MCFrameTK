package mcframe.serverMSBB.MSBBL1260;

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
import mcframe.serverMAUC.MAUCL5020.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL1260.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSLA.MSLAL5130.*;
import mcframe.serverMSBB.MSBBL6070.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverMSBB.MSBBL1260.Query.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import mcframe.commonCore.param.MCParam;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.commonCore.container.MCRow.Status;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.cache.MCJoinerList;
import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SloPrmsListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SloPrmsListReg_MC extends MSBBL_SloPrmsListReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBBL_SloPrmsListReg> CLAZZ = MSBBL_SloPrmsListReg.class;
	protected MCList<Chk01_RsltR> _upL = null;

	/**
	 * 受注
	 */
	protected MST_SLO_R _oldSloR = null;

	/**
	 * 受注明細
	 */
	protected MST_SLO_D_R _oldSloDR = null;

	/**
	 * 出荷進捗
	 */
	protected MST_SHIP_PR_R _oldShipPrR = null;

	/**
	 * 受注キャッシュ
	 */
	protected MCList<MST_SLO_R> _cacheSloL = null;
	protected MCIndexKey _sloKey = null;
	protected static void initSloCache(MCList<Chk01_RsltR> dtlL) {
		object(CLAZZ)._initSloCache(dtlL);
	}
	protected void _initSloCache(MCList<Chk01_RsltR> dtlL) {
		_cacheSloL = MCList.create(MST_SLO_R.class);
		MCQueryApiBuilder oldSloR_bldr = MCQueryApiBuilder.create(MST_SLO_R.create("T"));
		dbSelectKeyForUpdateNoWait("MSBBL1260_MST_SLO_S01", _cacheSloL, oldSloR_bldr, dtlL.groupBy(Chk01_RsltR.$slo_no));
		_sloKey = _cacheSloL.createIndex(MST_SLO_R.$slo_no);
	}
	protected static MST_SLO_R getOldSlo(Chk01_RsltR dtlR) {
		return object(CLAZZ)._getOldSlo(dtlR);
	}
	protected MST_SLO_R _getOldSlo(Chk01_RsltR dtlR) {
		return _cacheSloL.getFirst(_sloKey, dtlR.slo_no());
	}

	/**
	 * 受注明細キャッシュ
	 */
	protected MCList<MST_SLO_D_R> _cacheSloDL = null;
	protected MCIndexKey _sloDKey = null;
	protected static MST_SLO_D_R getOldSloD(Chk01_RsltR dtlR) {
		return object(CLAZZ)._getOldSloD(dtlR);
	}
	protected MST_SLO_D_R _getOldSloD(Chk01_RsltR dtlR) {
		return _cacheSloDL.getFirst(_sloDKey, dtlR.slo_d_no());
	}
	protected void _initSloDCache(MCList<Chk01_RsltR> dtlL) {
		_cacheSloDL = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder cacheSloDL_bldr = MCQueryApiBuilder.create(t);
		cacheSloDL_bldr.setLockTable(t.slo_d_no);
		dbSelectKeyForUpdateNoWait("MSBBL1260_MST_SLO_D_S01", _cacheSloDL, cacheSloDL_bldr, dtlL.groupBy(Chk01_RsltR.$slo_d_no));

		_sloDKey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
	}
	protected static void initSloDCache(MCList<Chk01_RsltR> dtlL) {
		object(CLAZZ)._initSloDCache(dtlL);
	}

	/**
	 * 出荷進捗キャッシュ
	 */
	protected MCList<MST_SHIP_PR_R> _cacheShipPrL = null;
	protected MCIndexKey _shipPrKey = null;
	protected static MST_SHIP_PR_R getOldShipPr(Chk01_RsltR dtlR) {
		return object(CLAZZ)._getOldShipPr(dtlR);
	}
	protected MST_SHIP_PR_R _getOldShipPr(Chk01_RsltR dtlR) {
		return _cacheShipPrL.getFirst(_shipPrKey, dtlR.slo_d_no());
	}
	protected void _initShipPrCache(MCList<Chk01_RsltR> dtlL) {

		crtSloDWk(dtlL.distinctNE(Chk01_RsltR.$slo_d_no).getStringNE(Chk01_RsltR.$slo_d_no));
		
		_cacheShipPrL = MCList.create(MST_SHIP_PR_R.class);
		MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIPPR");
		
		MCQueryApiBuilder cacheShipPrL_bldr = MCQueryApiBuilder.create(shipPr);
		MSW_SLO_D_KEY_R sloDKey = MSW_SLO_D_KEY_R.create("SLOD");
		cacheShipPrL_bldr.addInnerJoin(sloDKey, bracket(shipPr.slo_d_no.eq(sloDKey.slo_d_no)));
		
		cacheShipPrL_bldr.setLockTable(shipPr.ship_pr_no);
		dbSelectForUpdateNoWait("MSBBL1260_MST_SHIP_PR_S01", _cacheShipPrL, cacheShipPrL_bldr);

		_shipPrKey = _cacheShipPrL.createIndex(MST_SHIP_PR_R.$slo_d_no);
	}
	protected static void initShipPrCache(MCList<Chk01_RsltR> dtlL) {
		object(CLAZZ)._initShipPrCache(dtlL);
	}

	/**
	 * 出荷予定キャッシュ
	 */
	protected MCList<MST_SHIP_SCHD_R> _oldShipSchdL = null;
	protected MCIndexKey _shipSchdKey = null;
	protected static void initShipSchdCache(MCList<Chk01_RsltR> dtlL) {
		object(CLAZZ)._initShipSchdCache(dtlL);
	}
	protected void _initShipSchdCache(MCList<Chk01_RsltR> dtlL) {
		MCList<Chk01_RsltR> bindL = dtlL.subList(Status.MODIFY, Status.DELETE,
				Status.NONE);
		if (!bindL.isEmpty()) {
			_oldShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder oldShipSchdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));

			dbSelectKeyForUpdate("MSBBL1260_MST_SHIP_SCHD_S01", _oldShipSchdL, oldShipSchdL_bldr, bindL);
			_shipSchdKey = _oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
		}
	}
	protected static MST_SHIP_SCHD_R getFirstOldShipSchd(String ship_schd_no) {
		return object(CLAZZ)._getFirstOldShipSchd(ship_schd_no);
	}
	protected MST_SHIP_SCHD_R _getFirstOldShipSchd(String ship_schd_no) {
		return _oldShipSchdL.getFirst(_shipSchdKey, ship_schd_no);
	}

	/**
	 * 受注納期回答キャッシュ
	 */
	protected MCList<MST_SLO_PRMS_R> _sloPrmsL = null;
	protected MCIndexKey _sloPrmsKey = null;
	protected void initSloPrmsCache(MCList<Chk01_RsltR> dtlL) {
		_sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
		MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
		MCQueryApiBuilder sloPrmsBldr = MCQueryApiBuilder.create(t);
		sloPrmsBldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
		sloPrmsBldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBBL1260_MST_SLO_PRMS_S01", _sloPrmsL, sloPrmsBldr, dtlL);
		_sloPrmsKey = _sloPrmsL.createIndex(MST_SLO_PRMS_R.$slo_d_no);
	}

	protected MCList<MST_SHIP_SCHD_R> _shipSchdBySloDL = null;
	protected MCIndexKey _shipSchdBySloDKey = null;
	protected MCIndexKey _shipSchdBySloPrmsKey = null;
	protected void initShipSchdCacheBySloD(MCList<Chk01_RsltR> dtlL) {
		_shipSchdBySloDL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R shipSchd = MST_SHIP_SCHD_R.create("SHIP_SCHD");
		MCQueryApiBuilder shipSchdBldr = MCQueryApiBuilder.create(shipSchd);
		MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIP_PR");
		shipSchdBldr.addSelect(shipPr.slo_d_no.as("slo_d_no"));
		shipSchdBldr.addInnerJoin(shipPr, bracket(shipSchd.ship_pr_no.eq(shipPr.ship_pr_no)));
		shipSchdBldr.setWhere(shipPr.slo_d_no.eq(bind("slo_d_no")));
		dbSelect("MSBBL1260_MST_SHIP_SCHD_S03", _shipSchdBySloDL, shipSchdBldr, dtlL);
		_shipSchdBySloDKey = _shipSchdBySloDL.createIndex("slo_d_no");
		_shipSchdBySloPrmsKey = _shipSchdBySloDL.createIndex(MST_SHIP_SCHD_R.$slo_prms_no);
	}
	protected MCList<MST_SHIP_SCHD_R> getShipSchdLBySloD(String sloDNo) {
		return _shipSchdBySloDL.subList(_shipSchdBySloDKey, sloDNo);
	}
	protected MCList<MST_SHIP_SCHD_R> getShipSchdLBySloPrms(String sloPrmsNo) {
		return _shipSchdBySloDL.subList(_shipSchdBySloPrmsKey, sloPrmsNo);
	}

	protected MCList<MST_SLO_PRMS_R> _sloPrmsBySloDL = null;
	protected MCIndexKey _sloPrmsBySloDKey = null;
	protected void initSloPrmsCacheBySloD(MCList<Chk01_RsltR> dtlL) {
		_sloPrmsBySloDL = MCList.create(MST_SLO_PRMS_R.class);
		MST_SLO_PRMS_R sloPrms = MST_SLO_PRMS_R.create("SLO_PRMS");
		MCQueryApiBuilder sloPrmsBldr = MCQueryApiBuilder.create(sloPrms);
		sloPrmsBldr.setWhere(sloPrms.slo_d_no.eq(bind("slo_d_no")));
		sloPrmsBldr.addWhereWithAnd(sloPrms.can_flg.eq(value(false)));
		dbSelect("MSBBL1260_MST_SLO_PRMS_S04", _sloPrmsBySloDL, sloPrmsBldr, dtlL);
		_sloPrmsBySloDKey = _sloPrmsBySloDL.createIndex(MST_SLO_PRMS_R.$slo_d_no);
	}
	protected MCList<MST_SLO_PRMS_R> getSloPrmsLBySloD(String sloDNo) {
		return _sloPrmsBySloDL.subList(_sloPrmsBySloDKey, sloDNo);
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 出荷予定を検索する<br>
	 */
	public class Srch01 extends MSBBL_SloPrmsListReg_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();

			setGrpFlgTrue(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 上り電文を編集
			setUpTmpCol(up0());

			srch();
		}
		
		/**
		 * 未回答の出荷予定、回答済の受注納期回答を検索する。
		 */
		protected void srch() {
			
			if (up0().prms_flg()) {
				MCQueryPlan sql = MSBBL1260_MST_SLO_PRMS_S01();
				searchForDL(sql, up0(), down0());
			}
			if (doSrchSloPrms()) {
				MCQueryPlan sql = MSBBL1260_MST_SHIP_SCHD_S01();
				searchForDL(sql, up0(), down0());
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			editList();
		}
		
		/**
		 * 受注明細の検索結果を編集する。
		 */
		protected void editList() {
			
			if (isNull(down0())) {
				return;
			}
			
			crtShipPrWk(down0().distinctNE(Srch01_RsltR.$ship_pr_no).getStringNE(Srch01_RsltR.$ship_pr_no));
			MCList<MST_SHIP_SCHD_R> shipSchdL = getShipSchd();
			MCIndexKey idxPrkey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$slo_prms_no);
			for (Srch01_RsltR rsltR: down0()) {		
				if (!isNull(rsltR.slo_prms_no())) {
					MCList<MST_SHIP_SCHD_R> subShipSchdL = shipSchdL.subList(idxPrkey, rsltR.slo_prms_no());
					rsltR.after_exec_flg(isShipSchdAbort(subShipSchdL));
				}
			}
			setTrdUnitCd(down0(), shipSchdL);
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			sort();
		}
		
		/**
		 * 検索結果をソートする。
		 */
		protected void sort() {
			
			MCSortPolicy sortPolicy = new MCSortPolicy();
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$slo_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$slo_d_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$ship_schd_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$slo_prms_no);
			down0().sort(sortPolicy);
		}
		
		/**
		 * 未回答の出荷予定を検索する判定する。
		 * @return 受注納期回答未回答がオン かつEDIがオンとオフ両方選択した かつ 受注納期の条件が未指定の場合はtrue
		 */
		protected boolean doSrchSloPrms() {

			if (up0().not_prms_flg() && 
					isNullAnd(up0().prms_hm_fr(), up0().prms_hm_to(),
						up0().slo_prms_h_no(), up0().slo_prms_no(), up0().prms_rmrks(), 
						up0().intr_rmrks(), up0().sub_char1(), up0().sub_char2(), up0().sub_char3())) {
				return true;
			}
			
			return false;
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 納期回答を検索する<br>
	 */
	public class Srch02 extends MSBBL_SloPrmsListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();

			setGrpFlgTrue(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 上り電文を編集
			setUpTmpCol(up0());

			MCQueryPlan sql = MSBBL1260_MST_SLO_PRMS_S01();
			searchForDL(sql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			editList();
		}
		
		/**
		 * 納期回答の検索結果を編集する。
		 */
		protected void editList() {
			
			crtShipPrWk(down0().distinctNE(Srch01_RsltR.$ship_pr_no).getStringNE(Srch01_RsltR.$ship_pr_no));
			MCList<MST_SHIP_SCHD_R> shipSchdL = getShipSchd();
			MCIndexKey idxPrkey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$slo_prms_no);
			for (Srch01_RsltR rsltR: down0()) {		
				if (!isNull(rsltR.slo_prms_no())) {
					MCList<MST_SHIP_SCHD_R> subShipSchdL = shipSchdL.subList(idxPrkey, rsltR.slo_prms_no());
					rsltR.after_exec_flg(isShipSchdAbort(subShipSchdL));
				}
			}
			setTrdUnitCd(down0(), shipSchdL);
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェックを行います。<br>
	 */
	public class Chk01 extends MSBBL_SloPrmsListReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void init() {
			super.init();

			initShipSchdCacheBySloD(up0());
			initSloPrmsCacheBySloD(up0());
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			MCList<Chk01_RsltR>[] grpL = up0().groupList(Chk01_RsltR.$slo_d_no);
			for (MCList<Chk01_RsltR> grp : grpL) {
				boolean err_flg = false;
				for (Chk01_RsltR r : grp) {
					if (r.err_flg()) {
						err_flg = true;
						break;
					}
				}
				if (err_flg) {
					grp.setBoolean(Chk01_RsltR.$err_flg, true);
				}
			}
		}
		
		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			if (!isNull(notErrL)) {
				chkShipSchd(notErrL);
			}

			return (msgL);
		}

		/**
		 * .出荷予定サービスの呼び出し
		 */
		protected void chkShipSchd(MCList<Chk01_RsltR> notErrL) {
			//出荷予定、出荷引当状況の作成,出荷進捗を更新しないため、出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Chk02 op = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			
			for (Chk01_RsltR dtlR : notErrL) {
				
				if(isNull(dtlR.ship_schd_no())) {
					continue;
				}
				//対応する更新前の出荷予定を取得する。
				MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
				if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.slo_prms_data_crud_typ()) && 
						(oldShipR.ship_inst_qty().gt(0) || oldShipR.ship_act_qty().gt(0))) {
					continue;
				}
				
				if (dtlR.isStatusModify() || MAC_DATA_CRUD_TYP.isDEL(dtlR.slo_prms_data_crud_typ())) {
					MST_SLO_D_R oldSloDR = getOldSloD(dtlR);
					ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
					copy(schdR, oldSloDR, dtlR, createMap_ShipSchd_DtlR_MST_SLO_D_R());
					schdR.ship_inst_d_no(oldShipR.ship_inst_d_no()); //出荷指図明細ＮＯ
					schdR.inst_qty(oldShipR.ship_inst_qty()); //指図数量（基準単位）
					schdR.inst_unit_cd(oldShipR.base_unit_cd()); //指図単位ＣＤ
					
					// インボイス登録済みの場合、納期回答を登録可能にするため、インボイスチェック不要にする。
					schdR.iv_chk_skip_flg(true);
						
					schdR.is_src_sls_dlv_dt_adjst_flg(true);
					op.up0().add(schdR);
				}
			}

			op.exec();

			if (!op.down0().isEmpty()) {
				copyErrFlg(notErrL, op.down0());
			}
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			
			MCMessageList msgL = super.doServerCheckBase();
			
			// 更新カウンタチェック、排他ロック獲得
			lockShipSchd();
			msgL.addAll(chkShipPr());
			
			setErrFlg(msgL);
			
			// 補完処理
			crrDtl();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(chkSloPrms());

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			for (Chk01_RsltR notErrR : notErrL) {

				// DACチェック
				MCMessageList l = checkWritableDptCdDac(notErrR,  MST_SLO_R.$sls_dpt_cd);
				if (!l.isEmpty()) {
					msgL.addAll(l);
				}
				
				msgL.addAll(chkReq(notErrR));
			}

			return msgL;
		}

		/**
		 * 必須チェックを行う。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkReq(Chk01_RsltR chkR) {
			
			MCMessageList msgL = new MCMessageList();
			
			if (MAC_DATA_CRUD_TYP.isDEL(chkR.slo_prms_data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(chkR.slo_prms_data_crud_typ())) {
				msgL.addAll(check(chkR, Chk01_RsltR.$slo_prms_no, new FXUCL_RequiredValidater()));
			}
			
			if (MAC_DATA_CRUD_TYP.isCRT(chkR.slo_prms_data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(chkR.slo_prms_data_crud_typ())){
				msgL.addAll(check(chkR, Chk01_RsltR.$slo_d_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(chkR, Chk01_RsltR.$ship_schd_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(chkR, Chk01_RsltR.$ship_pr_no, new FXUCL_RequiredValidater()));
			}
			
			return msgL;
		}

		/**
		 * 出荷進捗のロック、更新カウンタチェック
		 * @return
		 */
		protected MCMessageList chkShipPr() {

			MCMessageList msgL = new MCMessageList();
			MCIndexKey idxkey = up0().createIndex(Chk01_RsltR.$slo_d_no);
			
			for (Chk01_RsltR chkR : up0()) {
				MCList<Chk01_RsltR> up0Lsub = up0().subList(idxkey, chkR.slo_d_no());
				
				for (Chk01_RsltR up0R : up0Lsub) {
					MST_SHIP_PR_R shipPr = getOldShipPr(up0R);
					// 更新カウンタチェック
					MCMessageList msg = checkUpdCntrNE(chkR, Chk01_RsltR.$ship_pr_upd_cntr, shipPr);
					if (!msg.isEmpty()) {
						msgL.addAll(msg);
						break;
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷予定と納期回答の関係が正しいかチェックする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkSloPrms() {
			
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			MCList<Chk01_RsltR> chkL = notErrL.statusChangedList();
			MCIndexKey chkLKey = chkL.createIndex(Chk01_RsltR.$slo_d_no);
			
			for (Chk01_RsltR chkR : chkL) {
				
				MCList<MST_SLO_PRMS_R> sloPrmsL = getSloPrmsLBySloD(chkR.slo_d_no());
				MCList<MST_SHIP_SCHD_R> shipSchdLBySloD = getShipSchdLBySloD(chkR.slo_d_no()).subList(MST_SHIP_SCHD_R.$abort_flg, false);
				MCList<Chk01_RsltR> chkSubL = chkL.subList(chkLKey, chkR.slo_d_no());
				
				if (sloPrmsL.size() == 0 || isSame(shipSchdLBySloD.size(), sloPrmsL.size())) {
					continue;
				}
				else if (sloPrmsL.size() < shipSchdLBySloD.size()) {
					msgL.addAll(chkMultiShipSchd(shipSchdLBySloD, chkR, chkSubL));
				}
				else if (shipSchdLBySloD.size() < sloPrmsL.size()) {
					msgL.addAll(chkMultiSloPrms(sloPrmsL, shipSchdLBySloD, chkR, chkSubL));
				}
			}
			
			return msgL;
		}
		
		/**
		 *  出荷予定：受注納期回答＝Ｎ：１のチェック
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkMultiShipSchd(MCList<MST_SHIP_SCHD_R> shipSchdLBySloD, Chk01_RsltR chkR, MCList<Chk01_RsltR> chkSubL) {
			MCMessageList msgL = new MCMessageList();
			
			for (MST_SHIP_SCHD_R shipSchdR : shipSchdLBySloD) {
				MCList<MST_SHIP_SCHD_R> shipSchdL = getShipSchdLBySloPrms(shipSchdR.slo_prms_no());
				if (shipSchdL.size() > 1 && !isSame(shipSchdLBySloD.size(), chkSubL.size())) {
					msgL.add(new MCMessage(chkR, null, MSBBL0643, chkR.slo_d_no(),
							MAC_DATA_CRUD_TYP.isCRT(chkR.slo_prms_data_crud_typ()) ? null: chkR.slo_prms_no(),
							toDispGUIIndex(chkR)));
					chkR.err_flg(true);
					return msgL;
				}
			}
			
			return msgL;
		}
		
		/**
		 *  出荷予定：受注納期回答＝０：Ｎのチェック
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkMultiSloPrms(MCList<MST_SLO_PRMS_R> sloPrmsL, MCList<MST_SHIP_SCHD_R> shipSchdLBySloD,
				Chk01_RsltR chkR, MCList<Chk01_RsltR> chkSubL) {
			
			MCMessageList msgL = new MCMessageList();
			MCIndexKey shipSchdLKey = shipSchdLBySloD.createIndex(Chk01_RsltR.$slo_prms_no);
			
			if (hasNoShipSchd(chkR)) {
				msgL.add(new MCMessage(chkR, null, MSBBL0644, chkR.slo_d_no(),
						chkR.slo_prms_no(), toDispGUIIndex(chkR)));
				chkR.err_flg(true);
				return msgL;
			}
			
			for (MST_SLO_PRMS_R sloPrmsR : sloPrmsL) {
				MST_SHIP_SCHD_R shipSchdR = shipSchdLBySloD.getFirst(shipSchdLKey, sloPrmsR.slo_prms_no());
				if (isNull(shipSchdR) && !isSame(sloPrmsL.size(), chkSubL.size())) {
					msgL.add(new MCMessage(chkR, null, MSBBL0643, chkR.slo_d_no(),
							chkR.slo_prms_no(), toDispGUIIndex(chkR)));
					chkR.err_flg(true);
					return msgL;
				}
			}
			
			return msgL;
		}
		
		protected boolean hasNoShipSchd(Chk01_RsltR chkR) {
			if (isNull(chkR.ship_schd_no()) && MAC_DATA_CRUD_TYP.isUPD(chkR.slo_prms_data_crud_typ())) {
				return true;
			}
			return false;
		}
		
		protected void lockShipSchd() {
			initShipSchdCache(up0());
		}

		/**
		 * 出荷予定の補完チェック
		 */
		protected void crrDtl() {

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			for (Chk01_RsltR r : notErrL) {
				MST_SLO_D_R oldSloDR = getOldSloD(r);
				MST_SHIP_SCHD_R oldShipSchdR = getFirstOldShipSchd(r.ship_schd_no());
				
				MAM_ITM_R itmR = MAM_ITM_R.create();
				MAM_ITM_R t1 = MAM_ITM_R.create("T");
				MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(t1);
				itmR_bldr.setSelect(t1.dec_place, t1.rnd_typ, t1.release_flg, t1.stk_mng_typ);
				dbSelectKey("MSBBL1260_MAM_ITM_S01", itmR, itmR_bldr, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

				if (isNull(itmR) || itmR.isEmpty() || !itmR.release_flg()) {
					r.setValue(Chk01_RsltR.$err_flg, true);
					MCMessagePool.add(MAUAL0189, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(MCRow.create()));
				}

				MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
				MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
				itmUnitR.itm_cd(r.itm_cd());
				itmUnitR.itm_sub1(r.itm_sub1());
				itmUnitR.itm_sub2(r.itm_sub2());
				itmUnitR.itm_sub3(r.itm_sub3());
				itmUnitR.unit_cd(r.trd_unit_cd());
				dbSelectKey("MSBBL1260_MAVM_ITM_UNIT_S01", itmUnitR, itmUnitR_bldr, itmUnitR);

				if (isNull(itmUnitR) || itmUnitR.isEmpty()) {
					r.setValue(Chk01_RsltR.$err_flg, true);
					MCMessagePool.add(MAUAL0242, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(MCRow.create()));
				}

				MCNumber convBaseQty = itmUnitR.conv_base_qty();
				MCNumber convQty = itmUnitR.conv_qty();
				
				if (!isSame(oldSloDR.trd_unit_cd(), r.trd_unit_cd())) {
					//出荷予定の品目単位
					MAVM_ITM_UNIT_R itmUnitR1 = MAVM_ITM_UNIT_R.create();
					MCQueryApiBuilder itmUnitR1_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
					itmUnitR1.itm_cd(oldSloDR.itm_cd());
					itmUnitR1.itm_sub1(oldSloDR.itm_sub1());
					itmUnitR1.itm_sub2(oldSloDR.itm_sub2());
					itmUnitR1.itm_sub3(oldSloDR.itm_sub3());
					itmUnitR1.unit_cd(r.trd_unit_cd());
					dbSelectKey("MSBBL1260_MAVM_ITM_UNIT_S02", itmUnitR1, itmUnitR1_bldr, itmUnitR1);
					
					convBaseQty = itmUnitR1.conv_base_qty();
					convQty = itmUnitR1.conv_qty();
				}
				
				MCNumber baseUnitQty = convToBaseUnit(r.trd_unit_prms_qty(), convBaseQty,
						convQty, itmR.dec_place(), itmR.rnd_typ());
				
				r.base_unit_cd(oldSloDR.base_unit_cd());
				r.base_unit_qty(baseUnitQty);
				
				if(!isNull(oldShipSchdR)) {
					r.ship_term_cd(oldShipSchdR.ship_term_cd());
					r.ship_wk_cd(oldShipSchdR.ship_wk_cd());
					r.sls_act_d_no(oldShipSchdR.sls_act_d_no());
					r.fix_flg(oldShipSchdR.fix_flg());
					r.re_ship_schd_flg(oldShipSchdR.re_ship_schd_flg());
					r.ship_block_flg(oldShipSchdR.ship_block_flg());
					r.trd_d_rmrks(oldShipSchdR.trd_d_rmrks());
					r.ship_cnt_rmrks(oldShipSchdR.ship_cnt_rmrks());
					r.not_dt_calc_flg(oldShipSchdR.not_dt_calc_flg());
					r.dlv_cd(oldShipSchdR.dlv_cd());
					r.dlv_sundry_flg(oldShipSchdR.dlv_sundry_flg());
					r.dlv_nm(oldShipSchdR.dlv_nm());
					r.dlv_cntct_dpt(oldShipSchdR.dlv_cntct_dpt());
					r.dlv_cntct_psn(oldShipSchdR.dlv_cntct_psn());
					r.dlv_zip_cd(oldShipSchdR.dlv_zip_cd());
					r.dlv_addr1(oldShipSchdR.dlv_addr1());
					r.dlv_addr2(oldShipSchdR.dlv_addr2());
					r.dlv_addr3(oldShipSchdR.dlv_addr3());
					r.dlv_addr4(oldShipSchdR.dlv_addr4());
					r.dlv_tel(oldShipSchdR.dlv_tel());
					r.dlv_fax(oldShipSchdR.dlv_fax());
					r.dlv_lg_grp_cd(oldShipSchdR.dlv_lg_grp_cd());
					r.pri_prnt_flg(oldShipSchdR.pri_prnt_flg());
					r.tdlv_cd(oldShipSchdR.tdlv_cd());
					r.tdlv_sundry_flg(oldShipSchdR.tdlv_sundry_flg());
					r.tdlv_nm(oldShipSchdR.tdlv_nm());
					r.via_dlv_typ(oldShipSchdR.via_dlv_typ());
					r.tdlv_cntct_dpt(oldShipSchdR.tdlv_cntct_dpt());
					r.tdlv_cntct_psn(oldShipSchdR.tdlv_cntct_psn());
					r.tdlv_zip_cd(oldShipSchdR.tdlv_zip_cd());
					r.tdlv_addr1(oldShipSchdR.tdlv_addr1());
					r.tdlv_addr2(oldShipSchdR.tdlv_addr2());
					r.tdlv_addr3(oldShipSchdR.tdlv_addr3());
					r.tdlv_addr4(oldShipSchdR.tdlv_addr4());
					r.tdlv_tel(oldShipSchdR.tdlv_tel());
					r.tdlv_fax(oldShipSchdR.tdlv_fax());
					r.tdlv_lg_grp_cd(oldShipSchdR.tdlv_lg_grp_cd());
					r.dlv_day_week_typ(oldShipSchdR.dlv_day_week_typ());
					r.ship_schd_sub_char1(oldShipSchdR.sub_char1());
					r.ship_schd_sub_char2(oldShipSchdR.sub_char2());
					r.ship_schd_sub_char3(oldShipSchdR.sub_char3());
				}
			}
		}

		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 納期回答を訂正する<br>
	 */
	public class Upd01 extends MSBBL_SloPrmsListReg_MC_A.Upd01 {

		/**
		 * 受注納期回答改訂番号マップ
		 */
		protected Map<String, MCNumber> _sloPrmsRevMap = null;

		/**
		 * 納期回答書発行対象
		 */
		protected MCList<SloPrms_Prnt01_HdrR> _printHdrL = null;

		/**
		 * 納期回答書対象の項目が変わったかを判定
		 */
		protected boolean _isUpdFlg =true;

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(chk01.down0());
			}
			catch (Exception e) {
				handleEx(e, chk01.down0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			doCache(up0());
			// 上り電文の編集
			editUp();

			// チェック・補完処理呼出
			callThisChk01();

			// 更新処理でメッセージプールが追加された後に例外となった際に元に戻すための設定
			saveMessagePool();

			// エラーのない行のみ登録
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				MCList<Chk01_RsltR> upL = notErrL.clone();

				for (MCList<Chk01_RsltR> sloPrmsGrpL : upL.groupList(Chk01_RsltR.$slo_d_no)) {
					Chk01_RsltR prmsR = sloPrmsGrpL.get(0);
					_oldSloR = getOldSlo(prmsR);
					_oldSloDR = getOldSloD(prmsR);
					_oldShipPrR = getOldShipPr(prmsR);
					
					up0().clear();
					up0().addAll(sloPrmsGrpL);
					
					//品目の有効期限FROM,TOを取得
					getItmValidDt();
					//受注納期回答の更新
					updSloPrms();
					//出荷進捗の更新
					updShipPr();
					//出荷予定サービスを呼出
					callShipSchdService();
					//受注納期回答ヘッダの更新処理
					updSloPrmsH();
					//EDI納期回答送信IFデータ作成
					createEdiSendData();
					//納期回答書対象データ補完
					setPrint();
					//受注状況の登録
					callSloStsRegServiceIns01();
				}
				//納期回答書発行
				callPrint();
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			setPegNo(up0());
			_upL = up0().clone();
			
			//データ更新区分の設定
			for (Chk01_RsltR r : up0()) {
				if (isNull(r.slo_prms_no())) {
					r.slo_prms_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (r.isStatusDelete() || MAC_DATA_CRUD_TYP.isDEL(r.slo_prms_data_crud_typ())) {
					r.slo_prms_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					
					if(!isNull(r.ship_schd_no())) {
						r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				else {
					r.slo_prms_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}

			//同一受注明細NOで上り電文にわたってない納期回答を追加する。
			//上り電文にわたってない納期回答にステータスを設定しない。
			MCList<Chk01_RsltR> sloPrmsL  = getSloPrmsExceptUpL();
			up0().addAll(sloPrmsL);
			
			setSloPrmsHNo();
			setSloPrmsNo();
			setSloPrmsRev();
		}
		
		/**
		 * 同一受注明細NOで上り電文にわたってない納期回答を取得する。
		 * @param dtlL  上り電文の納期回答リスト
		 * @return  同一受注明細NOの納期回答リスト（上り電文の納期回答を除外）
		 */
		protected MCList<Chk01_RsltR> getSloPrmsExceptUpL() {
			
			MCList<Chk01_RsltR> sloPrmsL = MCList.create(Chk01_RsltR.class);
			MCIndexKey idxkey = up0().createIndex(
					Chk01_RsltR.$slo_d_no, Chk01_RsltR.$slo_prms_no);
			MCList<Chk01_RsltR> rsltL = MCList.create(Chk01_RsltR.class);
			rsltL = getSloPrmsExceptUp(up0());
			
			if (!rsltL.isEmpty()) {
				
				int i = ((MCNumber)up0().max(Chk01_RsltR.$peg_no)).intValue();
				for (Chk01_RsltR r : rsltL) {
					
					Chk01_RsltR upR = up0().getFirst(idxkey, r.slo_d_no(), r.slo_prms_no());
					if(!isNull(upR)) {
						continue;
					}
					
					r.peg_no(++i);
					sloPrmsL.add(r);
				}
			}
			
			return sloPrmsL;
		}
		
		/**
		 * 品目の有効期限の取得
		 * @param hdr
		 * @param dtl
		 */
		protected void getItmValidDt() {

			if (MAC_SLO_PROC_TYP.isPURC_DDLV(_oldSloDR.proc_typ())) {
				return;
			}

			//品目の有効期限の取得
			MSBEL_ShipLotChkService.ShipLotChk_Srch01 shipLotSv = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
			for (Chk01_RsltR dtlR : up0()) {
				
				if(isNull(dtlR.ship_schd_no())) {
					continue;
				}
				
				//手配区分＝在庫引当、手配依頼、引当後手配の場合
				if (MAC_SLO_PROC_TYP.isALLOC(_oldSloDR.proc_typ())
						|| MAC_SLO_PROC_TYP.isPROC(_oldSloDR.proc_typ())
						|| MAC_SLO_PROC_TYP.isALLOC_PROC(_oldSloDR.proc_typ())) {
					ShipLot_DtlR lotR = ShipLot_DtlR.create();
					lotR.peg_no(dtlR.peg_no()); //紐付けＮＯ
					lotR.cst_cd(_oldSloR.cst_cd()); //得意先ＣＤ
					lotR.dlv_cd(nvl(dtlR.dlv_cd(), _oldSloDR.dlv_cd())); //納品先ＣＤ
					lotR.itm_cd(_oldSloDR.itm_cd()); //品目ＣＤ
					lotR.itm_sub1(_oldSloDR.itm_sub1()); //枝番１
					lotR.itm_sub2(_oldSloDR.itm_sub2()); //枝番２
					lotR.itm_sub3(_oldSloDR.itm_sub3()); //枝番３
					lotR.base_dt(dtlR.dlv_schd_tm().startTimeOfDay()); //基準日	
					lotR.lock_flg(false);
					lotR.lot_no(null);
					lotR.sublot_no(null);
					shipLotSv.up0().add(lotR);
				}
			}
			if (shipLotSv.up0().isEmpty()) {
				return;
			}
			shipLotSv.exec();
			//下り電文を取得
			MCList<ShipLot_DtlR> retDL = shipLotSv.down0();
			for (ShipLot_DtlR retR : retDL) {
				//対応する受注明細を取得
				Chk01_RsltR dlR = up0().subList(Chk01_RsltR.$peg_no, retR.peg_no()).get(0);
				//有効期限（下限）
				dlR.valid_dt_fr(retR.valid_dt_fr());
				//有効期限（下限）継承Ｇ
				dlR.valid_dt_fr_grp(retR.valid_dt_fr_grp());
				//有効期限（上限）
				dlR.valid_dt_to(retR.valid_dt_to());
			}
		}

		protected void updSloPrmsH() {

			Chk01_RsltR sloR = up0().get(0);
			MST_SLO_PRMS_H_R sloPrmsHR = MST_SLO_PRMS_H_R.create();
			MST_SLO_PRMS_H_R t = MST_SLO_PRMS_H_R.create("T");
			MCQueryApiBuilder sloPrmsHR_bldr = MCQueryApiBuilder.create(t);
			sloPrmsHR_bldr.addWhereWithAnd(t.slo_d_no.eq(bind("slo_d_no")));
			sloPrmsHR_bldr.addWhereWithAnd(t.slo_prms_h_no.eq(bind("slo_prms_h_no")));
			sloPrmsHR_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			int cnt = dbSelect("MSBBL1260_MST_SLO_PRMS_H_S02", sloPrmsHR, sloPrmsHR_bldr, sloR);
			if (cnt == 0) {
				_isUpdFlg  = true;
				sloPrmsHR.slo_prms_h_no(sloR.slo_prms_h_no());
				sloPrmsHR.slo_prms_rev(_sloPrmsRevMap.get(sloR.slo_d_no()));
				sloPrmsHR.slo_d_no(sloR.slo_d_no());
				sloPrmsHR.edi_prms_flg(sloR.edi_prms_flg());
				dbInsertEx("MSBBL1260_MST_SLO_PRMS_H_I01", sloPrmsHR, sloPrmsHR_bldr);
			}
			else {
				sloPrmsHR.edi_prms_flg(sloR.edi_prms_flg());
				sloPrmsHR_bldr.setSet(t.edi_prms_flg);

				_isUpdFlg = isUpdSloPrms(up0());
				if(_isUpdFlg) {
					sloPrmsHR.prms_prnt_tm(null);
					sloPrmsHR_bldr.addSet(t.prms_prnt_tm);
					sloPrmsHR.slo_prms_prnt_flg(false);
					sloPrmsHR_bldr.addSet(t.slo_prms_prnt_flg);
				}

				if (isCan()) {
					_isUpdFlg  = true;
					sloPrmsHR.can_flg(true);
					sloPrmsHR_bldr.addSet(t.can_flg);
					sloPrmsHR.prms_prnt_tm(null);
					sloPrmsHR_bldr.addSet(t.prms_prnt_tm);
					sloPrmsHR.slo_prms_prnt_flg(false);
					sloPrmsHR_bldr.addSet(t.slo_prms_prnt_flg);
				}
				else {
					sloPrmsHR.slo_prms_rev(_sloPrmsRevMap.get(sloR.slo_d_no()));
					sloPrmsHR_bldr.addSet(t.slo_prms_rev);
				}

				dbUpdateKey("MSBBL1260_MST_SLO_PRMS_H_U01", sloPrmsHR, sloPrmsHR_bldr);
			}
		}

		protected String[] _sloPrmsUpdCols;
		protected boolean isUpdSloPrms(MCList<Chk01_RsltR> upL) {
			
			if (_sloPrmsUpdCols == null) {
				_sloPrmsUpdCols = new String[] {
						MST_SLO_PRMS_R.$prms_dlv_tm,
						MST_SLO_PRMS_R.$trd_unit_prms_qty,
						MST_SLO_PRMS_R.$prms_rmrks 
				};
			}

			MCList<Chk01_RsltR> sloPrmsL = upL.subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.slo_prms_data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.slo_prms_data_crud_typ()));
			sloPrmsL.sort(Chk01_RsltR.$slo_prms_no);
			MCList<MST_SLO_PRMS_R> oldSloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			oldSloPrmsL.addAll(_sloPrmsL.subList(_sloPrmsKey, upL.get(0).slo_d_no()));
			oldSloPrmsL.sort(MST_SLO_PRMS_R.$slo_prms_no);
			
			if (!isSame(sloPrmsL.size(), oldSloPrmsL.size())) {
				return true;
			}
			
			for (int i = 0; i < sloPrmsL.size(); i++) {
				if (!isColSame(sloPrmsL.get(i), oldSloPrmsL.get(i), _sloPrmsUpdCols)) {
					return true;
				}
			}
			
			return false;
		}

		/**
		 * 受注明細に紐づく納期回答をすべて削除したか判断する。
		 * @return すべて削除した場合true
		 */
		protected boolean isCan() {
			MCList<MST_SLO_PRMS_R> prmsL = getSloPrmsL(_oldSloDR.slo_d_no());

			if (prmsL.subList(MST_SLO_PRMS_R.$can_flg,false).size() != 0) {
				return false;
			}
			return true;
		}

		/**
		 * 受注納期回答の更新をおこなう
		 */
		protected void updSloPrms() {
			MCList<MST_SLO_PRMS_R> insL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> updL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> delL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> lineDelL = MCList.create(MST_SLO_PRMS_R.class);

			MST_SLO_PRMS_R sloPrmsR = null;
			if (!up0().statusChangedList().isEmpty()) {
				for (Chk01_RsltR dtlR : up0()) {

					if(isNull(dtlR.slo_prms_no())) {
						continue;
					}

					sloPrmsR = MST_SLO_PRMS_R.create();
					copy(sloPrmsR, dtlR, createMap_MST_SLO_PRMS_R_Chk01_RsltR());

					if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.slo_prms_data_crud_typ())) {
						sloPrmsR.slo_prms_rev(_sloPrmsRevMap.get(dtlR.slo_d_no()));
					}

					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.slo_prms_data_crud_typ())) {
						insL.add(sloPrmsR);
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.slo_prms_data_crud_typ()))  {
						sloPrmsR.can_flg(true);
						boolean headDel = true;
						for (Chk01_RsltR tmpR : up0()) {
							if (!MAC_DATA_CRUD_TYP.isDEL(tmpR.slo_prms_data_crud_typ())
								&& isSame(dtlR.slo_d_no(), tmpR.slo_d_no())) {
								lineDelL.add(sloPrmsR);
								headDel = false;
								break;
							}
						}
						if (headDel) {
							delL.add(sloPrmsR);
						}
					}
					else if (dtlR.isStatusNone() || dtlR.isStatusModify()) {
						updL.add(sloPrmsR);
					}
				}

				if (!insL.isEmpty()) {
					MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_SLO_PRMS_R.create("T"));
					dbInsertEx("MSBBL1260_MST_SLO_PRMS_I01", insL, insL_bldr);
					// 改訂履歴データ更新サービス呼出（受注納期回答改訂履歴テーブル更新）
					updSloPrmsPR(insL);
				}

				if (!updL.isEmpty()) {
					MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
					MCList<MST_SLO_PRMS_R> updPrmsL = MCList.create(MST_SLO_PRMS_R.class);
					for (MCList<MST_SLO_PRMS_R> l : updL.groupList(Chk01_RsltR.$slo_d_no,
							Chk01_RsltR.$slo_prms_h_no, Chk01_RsltR.$slo_prms_no)) {
						MST_SLO_PRMS_R updR = MST_SLO_PRMS_R.create();
						MCRow.copyall(updR, l.get(0));
						updR.base_unit_prms_qty(l.sum(MST_SLO_PRMS_R.$base_unit_prms_qty));
						updR.trd_unit_prms_qty(l.sum(MST_SLO_PRMS_R.$trd_unit_prms_qty));
						updPrmsL.add(updR);
					}
					execDbUpdate("MSBBL1260_MST_SLO_PRMS_U01", dbc, updPrmsL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
					// 改訂履歴データ更新サービス呼出（受注納期回答改訂履歴テーブル更新）
					updSloPrmsPR(updPrmsL);
				}

				if (!delL.isEmpty()) {
					MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
					execDbUpdate("MSBBL1260_MST_SLO_PRMS_U02", dbc, delL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
					// 改訂履歴データ更新サービス呼出（受注納期回答改訂履歴テーブル更新）
					updSloPrmsPR(delL);
				}
				if (!lineDelL.isEmpty()) {
					MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
					MCQueryApiBuilder lineDelL_bldr = MCQueryApiBuilder.create(t);
					lineDelL_bldr.setSet(t.can_flg);
					dbUpdateKey("MSBBL1260_MST_SLO_PRMS_U03", lineDelL, lineDelL_bldr);
				}
			}
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 受注納期回答改訂履歴テーブルを更新する。
		 * @param sloPrmsL 受注納期回答リスト 
		 */
		protected void updSloPrmsPR(MCList<MST_SLO_PRMS_R> sloPrmsL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			if (sloPrmsL.size() > 0) {
				for (MST_SLO_PRMS_R r : sloPrmsL) {
					RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
					opeR.rev_data_src_no(r.slo_prms_no());
					opeR.rev_no(r.slo_prms_rev());
					opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO_PRMS.value());
					ope.up0().add(opeR);
					ope.exec();
				}
			}
		}

		/**
		 * 出荷進捗の納入指示受領日を更新する。
		 */
		protected void updShipPr() {
			if (_oldSloDR.can_flg()) {
				return;
			}

			MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder oldShipPrR_bldr = MCQueryApiBuilder.create(t);

			if (!up0().statusChangedList().isEmpty()) {
				// 納期回答情報を取得する。
				MCList<MST_SLO_PRMS_R> prmsL = getSloPrmsL(_oldSloDR.slo_d_no());

				// 受注/納入指示に対応する回答情報を抽出する。
				MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
				MCList<MST_SLO_PRMS_R> dlvInstPrmsL = MCList.create(MST_SLO_PRMS_R.class);
				for (MST_SLO_PRMS_R sloPrmsR : prmsL) {

					if (!isNull(sloPrmsR.dlv_inst_rcpt_no())) {
						dlvInstPrmsL.add(sloPrmsR.clone());
					}
					else {
						sloPrmsL.add(sloPrmsR.clone());
					}
				}

				if (!isNull(_oldShipPrR) && !_oldShipPrR.isEmpty()) {

					MCNumber baseUnitPrmsQty = prmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty);
					MCDate maxPrmsDlvTm = (MCDate) prmsL.max(MST_SLO_PRMS_R.$prms_dlv_tm);

					_oldShipPrR.ship_pr_no(_oldShipPrR.ship_pr_no());
					_oldShipPrR.prms_dlv_dt(prmsL.size() > 0 && isSame(baseUnitPrmsQty, up0().sum(Chk01_RsltR.$base_unit_qty)) ? maxPrmsDlvTm : null);
					oldShipPrR_bldr.setSet(t.prms_dlv_dt);

					// 受注に対する回答情報が変わっているか確認する。
					boolean sloPrmsChng = false;
					for (Chk01_RsltR upR : up0().statusChangedList()) {
						if (isNull(upR.dlv_inst_rcpt_no())) {
							sloPrmsChng = true;
							break;
						}
					}

					if (sloPrmsChng) {
						_oldShipPrR.prms_dt(sloPrmsL.size() > 0 ? getToday() : null);
						_oldShipPrR.prms_qty(sloPrmsL.size() > 0 ? sloPrmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty) : MCNumber.ZERO);
						oldShipPrR_bldr.addSet(t.prms_dt, t.prms_qty);
					}

					// 納入指示に対する回答情報が変わっているか確認する。
					boolean dlvInstRcptPrmsChng = false;
					for (Chk01_RsltR upR : up0().statusChangedList()) {
						if (!isNull(upR.dlv_inst_rcpt_no())) {
							dlvInstRcptPrmsChng = true;
							break;
						}
					}

					if (dlvInstRcptPrmsChng) {

						_oldShipPrR.dlv_inst_prms_dt(dlvInstPrmsL.size() > 0 ? getToday() : null);
						_oldShipPrR.dlv_inst_prms_qty(dlvInstPrmsL.size() > 0 ? dlvInstPrmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty) : MCNumber.ZERO);

						oldShipPrR_bldr.addSet(t.dlv_inst_prms_dt, t.dlv_inst_prms_qty);
					}
				}
				dbUpdateKey("MSBBL1260_MST_SHIP_PR_U01", _oldShipPrR, oldShipPrR_bldr);
			}
			else {
				dbTsUpdateKey("MSBBL1260_MST_SHIP_PR_U02", _oldShipPrR, oldShipPrR_bldr.getBaseDbc());
			}
		}

		/**
		 * 納期回答情報を取得する。
		 * @param sloDNo 受注ＮＯ
		 * @return
		 */
		protected MCList<MST_SLO_PRMS_R> getSloPrmsL(String sloDNo) {

			MCList<MST_SLO_PRMS_R> prmsL = MCList.create(MST_SLO_PRMS_R.class);
			MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
			MCQueryApiBuilder prmsL_bldr = MCQueryApiBuilder.create(t);
			prmsL_bldr.setWhere(t.slo_d_no.eq(bind("1")), sloDNo);
			prmsL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBBL1260_MST_SLO_PRMS_S02", prmsL, prmsL_bldr);

			return prmsL;
		}

		/**
		 * .出荷予定サービスの呼び出し
		 */
		protected void callShipSchdService() {
			//出荷予定、出荷引当状況の作成,出荷進捗を更新しないため、出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService.crtShipSchd_Upd02();

			for (Chk01_RsltR dtlR : up0()) {
				
				if(isNull(dtlR.ship_schd_no())) {
					continue;
				}

				//対応する更新前の出荷予定を取得する。
				MST_SHIP_SCHD_R oldShipR = getFirstOldShipSchd(dtlR.ship_schd_no());
				if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.slo_prms_data_crud_typ()) && 
						(oldShipR.ship_inst_qty().gt(0) || oldShipR.ship_act_qty().gt(0))) {
					continue;
				}

				if (dtlR.isStatusModify() 
						|| MAC_DATA_CRUD_TYP.isDEL(dtlR.slo_prms_data_crud_typ())
						|| (!isNull(dtlR.sls_act_d_no()) && oldShipR.ship_inst_qty().isZero() && oldShipR.ship_act_qty().isZero())) {

					// 売上済みの場合は、出荷引当状況のロットＮＯを調整するため、常に渡す。
					ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
					_oldSloDR.setStringNE("cst_cd", _oldSloR.cst_cd());
					copy(schdR, _oldSloDR, dtlR, createMap_ShipSchd_DtlR_MST_SLO_D_R());
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.slo_prms_data_crud_typ())) {
						schdR.slo_prms_no(null);
					}
					schdR.trd_rmrks(_oldSloR.trd_rmrks()); //取引備考

					if (!isNull(oldShipR)) {
						schdR.quality_typ(nvl(oldShipR.quality_typ(),MAC_QUALITY_TYP.GOOD.value())); //良品区分
						schdR.stk_id_typ(nvl(oldShipR.stk_id_typ(), MSC_STK_ID_TYP.COSTK.value())); //在庫識別区分
						schdR.stk_bp_cd(nvl(oldShipR.stk_bp_cd(), MAC_STR.NULL_VAL.value())); //在庫取引先ＣＤ
					}

					schdR.ship_inst_d_no(oldShipR.ship_inst_d_no()); //出荷指図明細ＮＯ
					schdR.inst_qty(oldShipR.ship_inst_qty()); //指図数量（基準単位）
					schdR.inst_unit_cd(oldShipR.base_unit_cd()); //指図単位ＣＤ
					op.up1().add(schdR);
				}
			}

			op.up2().addAll(getNoChngAllocSts(op.up1()));

			for (ShipSchd_DtlR shipSchdR : op.up1()) {
				shipSchdR.is_src_sls_dlv_dt_adjst_flg(true);

				Alloc_RsltR allocR = op.up2().getFirst(Alloc_RsltR.$peg_no,shipSchdR.peg_no());
				if (!isNull(allocR)) {
					shipSchdR.gd_cd(allocR.gd_cd());
					shipSchdR.quality_typ(allocR.quality_typ());
					shipSchdR.stk_id_typ(allocR.stk_id_typ());
					shipSchdR.stk_bp_cd(allocR.stk_bp_cd());
				}
			}

			checkShipLotForslsCststk(op.up1(), op.up2());

			op.up0().lot_chk_flg(false);
			op.exec();

			copyByPegNo(up0(), new String[] {Chk01_RsltR.$ship_schd_no}, op.down0(), new String[] {ShipSchd_DtlR.$ship_schd_no});
		}

		/**
		 * 預り売上の場合、売上時にロットＮＯが設定されるため、有効期限チェック、ロット逆転チェックを行う。
		 */
		protected void checkShipLotForslsCststk(MCList<ShipSchd_DtlR> shipSchdL, MCList<Alloc_RsltR> allocRsltL) {

			MSBEL_ShipLotChkService.ShipLotChk_Chk01 shipLotChk = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
			for (Alloc_RsltR allocRsltR : allocRsltL) {

				if (isNullOrNullVal(allocRsltR.lot_no()) && isNullOrNullVal(allocRsltR.sublot_no())) {
					continue;
				}

				ShipSchd_DtlR shipSchdR = shipSchdL.getFirst(ShipSchd_DtlR.$peg_no, allocRsltR.peg_no());

				if (!isNull(shipSchdR) && !isNull(shipSchdR.sls_act_d_no())
						&& (MAC_DATA_CRUD_TYP.isCRT(shipSchdR.data_crud_typ())
								|| MAC_DATA_CRUD_TYP.isUPD(shipSchdR.data_crud_typ()))) {

					if (_oldSloDR.sls_cststk_flg() && !isNull(shipSchdR.dlv_cd())) {
						ShipLot_DtlR lotR = ShipLot_DtlR.create();
						lotR.peg_no(shipSchdR.peg_no());
						lotR.cst_cd(_oldSloR.cst_cd());
						lotR.dlv_cd(shipSchdR.dlv_cd());
						lotR.itm_cd(_oldSloDR.itm_cd());
						lotR.itm_sub1(_oldSloDR.itm_sub1());
						lotR.itm_sub2(_oldSloDR.itm_sub2());
						lotR.itm_sub3(_oldSloDR.itm_sub3());
						lotR.base_dt(shipSchdR.dlv_schd_tm().startTimeOfDay());
						lotR.lot_no(allocRsltR.lot_no());
						lotR.sublot_no(allocRsltR.sublot_no());
						shipLotChk.up0().add(lotR);
					}
				}
			}
			if (!shipLotChk.up0().isEmpty()) {
				shipLotChk.exec();
				throwUpdErr();
			}
		}

		/**
		 * 変更なし出荷引当状況を返す。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @return 出荷引当状況リスト
		 */
		protected MCList<Alloc_RsltR> getNoChngAllocSts(
				MCList<ShipSchd_DtlR> shipSchdDtlL) {

			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);

			MCList<MST_SHIP_ALLOC_STS_R> allocStsL = getAllocSts();

			MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsL = allocStsL.createInstance();
			MCList<MST_SHIP_ALLOC_STS_R> shipSchdAllocStsL = allocStsL.createInstance();

			for (MST_SHIP_ALLOC_STS_R allocStsR : allocStsL) {
				if (!isNull(allocStsR.getStringNE("sls_act_d_no"))) {
					slsActAllocStsL.add(allocStsR.clone());
				}
				else {
					shipSchdAllocStsL.add(allocStsR.clone());
				}
			}

			if (!slsActAllocStsL.isEmpty()) {
				allocRsltL.addAll(getSlsActAllocSts(shipSchdDtlL, slsActAllocStsL));
			}

			if (!shipSchdAllocStsL.isEmpty()) {
				allocRsltL.addAll(getShipSchdAllocSts(shipSchdDtlL, shipSchdAllocStsL));
			}

			MCGroupByPolicy policy = new MCGroupByPolicy(getAllocGrpItm());
			policy.sum(Alloc_RsltR.$pack_unit_qty, Alloc_RsltR.$base_unit_qty);

			return allocRsltL.groupBy(policy);
		}

		/**
		 * 出荷引当状況の集計項目を返す。
		 * @return　出荷引当状況の集計項目
		 */
		protected String[] getAllocGrpItm() {

			return new String[] {
					Alloc_RsltR.$peg_no, Alloc_RsltR.$itm_cd, Alloc_RsltR.$itm_sub1,
					Alloc_RsltR.$itm_sub2, Alloc_RsltR.$itm_sub3, Alloc_RsltR.$stk_loc_cd,
					Alloc_RsltR.$stk_str_ln_cd, Alloc_RsltR.$stk_lg_grp_cd,
					Alloc_RsltR.$quality_typ, Alloc_RsltR.$stk_insp_typ,
					Alloc_RsltR.$stk_id_typ, Alloc_RsltR.$stk_arrv_bp_cd,
					Alloc_RsltR.$stk_bp_cd, Alloc_RsltR.$gd_cd, Alloc_RsltR.$lot_no,
					Alloc_RsltR.$sublot_no, Alloc_RsltR.$sno1, Alloc_RsltR.$sno2,
					Alloc_RsltR.$sno3, Alloc_RsltR.$sno4, Alloc_RsltR.$ver_no,
					Alloc_RsltR.$pack_unit_cd, Alloc_RsltR.$base_unit_cd,
					Alloc_RsltR.$vld_dt_fr, Alloc_RsltR.$vld_dt_to,
					Alloc_RsltR.$alloc_flg, Alloc_RsltR.$alloc_wait_flg,
					Alloc_RsltR.$alloc_scope_typ, Alloc_RsltR.$ent_unit_cd
			};
		}

		/**
		 * 変更なし出荷予定の（預り売上実績済み以外)の出荷引当状況を分割する。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @param shipSchdAllocStsL 出荷引当状況(預り売上済みを除く)
		 * @return 出荷引当状況
		 */
		protected MCList<Alloc_RsltR> getShipSchdAllocSts(
				MCList<ShipSchd_DtlR> shipSchdDtlL,
				MCList<MST_SHIP_ALLOC_STS_R> shipSchdAllocStsL) {

			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);

			MCList<Alloc_RsltR> subAllocRsltL = null;

			for (ShipSchd_DtlR shipSchdDtlR : shipSchdDtlL) {

				if (MAC_DATA_CRUD_TYP.isDEL(shipSchdDtlR.data_crud_typ())
						|| !isNull(shipSchdDtlR.sls_act_d_no())) {
					continue;
				}

				subAllocRsltL = MCList.create(Alloc_RsltR.class);

				setAll(subAllocRsltL,
						shipSchdAllocStsL.subList(MST_SHIP_ALLOC_STS_R.$ship_schd_no,
								shipSchdDtlR.ship_schd_no()),
						createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
				subAllocRsltL.setValueNE(Alloc_RsltR.$peg_no, shipSchdDtlR.peg_no());

				allocRsltL.addAll(subAllocRsltL);
			}

			allocRsltL.setValueNE(Alloc_RsltR.$itm_cd, _oldSloDR.itm_cd());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub1, _oldSloDR.itm_sub1());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub2, _oldSloDR.itm_sub2());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub3, _oldSloDR.itm_sub3());

			return allocRsltL;
		}

		/**
		 * 預り売上実績済みの出荷引当状況を分割する。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @param slsActAllocStsL 預り売上済み出荷引当状況
		 * @return 出荷引当状況
		 */
		protected MCList<Alloc_RsltR> getSlsActAllocSts(
				MCList<ShipSchd_DtlR> shipSchdDtlL,
				MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsL) {

			MCIndexKey idx = slsActAllocStsL.createIndex("sls_act_d_no");

			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);

			Alloc_RsltR allocRsltR = null;
			MCNumber shipSchdQty = null;

			shipSchdDtlL.sort(ShipSchd_DtlR.$ship_schd_tm);

			for (ShipSchd_DtlR shipSchdDtlR : shipSchdDtlL) {

				if (MAC_DATA_CRUD_TYP.isDEL(shipSchdDtlR.data_crud_typ())
						|| isNull(shipSchdDtlR.sls_act_d_no())) {
					continue;
				}

				shipSchdQty = shipSchdDtlR.base_unit_qty();

				MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsSubL = slsActAllocStsL
						.subList(idx, shipSchdDtlR.sls_act_d_no());
				slsActAllocStsSubL.sort(SortType.ASC, MST_SHIP_ALLOC_STS_R.$vld_dt_fr,
						MST_SHIP_ALLOC_STS_R.$vld_dt_to, MST_SHIP_ALLOC_STS_R.$lot_no);

				for (MST_SHIP_ALLOC_STS_R allocStsR : slsActAllocStsSubL) {

					if (allocStsR.base_unit_qty().isZero()) {
						continue;
					}

					if (shipSchdQty.isZero()) {
						break;
					}

					allocRsltR = Alloc_RsltR.create();
					copy(allocRsltR, allocStsR,
							createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
					allocRsltR.peg_no(shipSchdDtlR.peg_no());

					if (shipSchdQty.gte(allocStsR.base_unit_qty())) {

						shipSchdQty = shipSchdQty.subtract(allocStsR.base_unit_qty());
						allocStsR.trd_unit_qty(MCNumber.ZERO);
						allocStsR.base_unit_qty(MCNumber.ZERO);
					}
					else {

						allocRsltR.base_unit_qty(shipSchdQty);

						if (!isSame(allocRsltR.pack_unit_cd(),
								allocRsltR.base_unit_cd())) {

							MAVM_ITM_UNIT_R packItmUnitR = getItmUnit(_oldSloDR.itm_cd(),
									_oldSloDR.itm_sub1(), _oldSloDR.itm_sub2(),
									_oldSloDR.itm_sub3(), allocRsltR.pack_unit_cd());

							MCNumber packUnitQty = rvrsBaseUnitConv(
									allocRsltR.base_unit_qty(),
									packItmUnitR.conv_base_qty(), packItmUnitR.conv_qty(),
									packItmUnitR.dec_place(), packItmUnitR.rnd_typ(),
									true);

							if (isNull(packUnitQty)) {

								throw new MCAppException(MSBBL0235,
										shipSchdDtlR.ship_schd_no(),
										allocRsltR.base_unit_qty(),
										allocRsltR.pack_unit_cd(),
										packItmUnitR.conv_base_qty(),
										packItmUnitR.conv_qty(),
										packItmUnitR.dec_place());
							}
							else {
								allocRsltR.pack_unit_qty(packUnitQty);
							}
						}
						else {
							allocRsltR.pack_unit_qty(allocRsltR.base_unit_qty());
						}

						allocStsR.base_unit_qty(allocStsR.base_unit_qty()
								.subtract(allocRsltR.base_unit_qty()));
						allocStsR.pack_unit_qty(allocStsR.pack_unit_qty()
								.subtract(allocRsltR.pack_unit_qty()));

						shipSchdQty = MCNumber.ZERO;
					}

					allocRsltL.add(allocRsltR);
				}
			}

			allocRsltL.setValueNE(Alloc_RsltR.$itm_cd, _oldSloDR.itm_cd());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub1, _oldSloDR.itm_sub1());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub2, _oldSloDR.itm_sub2());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub3, _oldSloDR.itm_sub3());

			return allocRsltL;
		}

		/**
		 * 売上済の出荷引当状況を取得する。
		 * @return 出荷引当状況
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> getSlsActAllocSts() {

			MCList<MST_SHIP_ALLOC_STS_R> slsActShipAllocStsL = MCList
					.create(MST_SHIP_ALLOC_STS_R.class);

			if (!_oldSloDR.can_flg()) {
				MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
				MCQueryApiBuilder slsActShipAllocStsL_bldr = MCQueryApiBuilder.create(t);
				MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				slsActShipAllocStsL_bldr.addSelect(t2.ship_fr_lg_grp_cd);
				slsActShipAllocStsL_bldr.addSelect(t2.sls_act_d_no);
				slsActShipAllocStsL_bldr.setWhere(t2.ship_pr_no.eq(bind("1")),
						_oldShipPrR.ship_pr_no());
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.sls_act_d_no.isNotNull());
				slsActShipAllocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(false)));
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.ship_inst_qty.eq(value(0)));
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.ship_act_qty.eq(value(0)));
				slsActShipAllocStsL_bldr.addInnerJoin(t2,
						t2.ship_schd_no.eq(t.ship_schd_no));
				slsActShipAllocStsL_bldr.addLeftOuterJoin(m1,
						m1.loc_cd.eq(t.ship_loc_cd));
				dbSelect("MSBBL1260_MST_SHIP_ALLOC_STS_S01", slsActShipAllocStsL,
						slsActShipAllocStsL_bldr);
			}

			return slsActShipAllocStsL;
		}

		/**
		 * 引当済の出荷引当状況を取得する。
		 * @return 出荷引当状況
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> getAllocSts() {

			MCList<MST_SHIP_ALLOC_STS_R> allocStsL = MCList
					.create(MST_SHIP_ALLOC_STS_R.class);

			if (!_oldSloDR.can_flg()) {
				MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
				MCQueryApiBuilder allocStsL_bldr = MCQueryApiBuilder.create(t);
				MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				allocStsL_bldr.addSelect(t2.ship_fr_lg_grp_cd);
				allocStsL_bldr.addSelect(t2.sls_act_d_no);
				allocStsL_bldr.setWhere(t2.ship_pr_no.eq(bind("1")),
						_oldShipPrR.ship_pr_no());
				allocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(true)));
				allocStsL_bldr.addWhereWithAnd(t2.ship_inst_qty.eq(value(0)));
				allocStsL_bldr.addWhereWithAnd(t2.ship_act_qty.eq(value(0)));
				allocStsL_bldr.addInnerJoin(t2, t2.ship_schd_no.eq(t.ship_schd_no));
				allocStsL_bldr.addLeftOuterJoin(m1, m1.loc_cd.eq(t.ship_loc_cd));
				dbSelect("MSBBL1260_MST_SHIP_ALLOC_STS_S02", allocStsL, allocStsL_bldr);
			}

			return allocStsL;
		}
		
		/**
		 * 受注納期回答ＮＯを発番する。
		 */
		protected void setSloPrmsNo() {
			MCList<Chk01_RsltR> insL = up0().subList(Chk01_RsltR.$slo_prms_data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			
			if(!isNull(insL)) {
				MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
				for (Chk01_RsltR dtlR : insL) {
					
					MST_SLO_R hdrR = getOldSlo(dtlR);
					
					ElmArgsR argsR = ElmArgsR.create();
					argsR.bp_cd(hdrR.cst_cd());
					argsR.trd_cd(hdrR.trd_cd());
					argsR.dpt_cd(dtlR.sls_dpt_cd());
					argsR.co_cd(getCo().co_cd());
					argsR.dt(dtlR.prms_dlv_tm());
					argsR.wg_cd(hdrR.wg_cd());
					argsR.itm_cd(dtlR.itm_cd());
					argsR.itm_sub1(dtlR.itm_sub1());
					argsR.itm_sub2(dtlR.itm_sub2());
					argsR.itm_sub3(dtlR.itm_sub3());
					argsR.peg_no(dtlR.peg_no());
					argsL.add(argsR);
				}
				
				setNum(MAC_NUM_BIZ_TYP.SLOPRMS, argsL);
				String[] srcCols = {ElmArgsR.$new_no};
				String[] destCols = {Chk01_RsltR.$slo_prms_no};
				copyByPegNo(insL, destCols, argsL, srcCols);
			}
		}
		
		/**
		 * 受注納期回答改訂番号を設定する。
		 */
		protected void setSloPrmsRev() {
			MCList<Chk01_RsltR>[] upL = up0().groupList(Chk01_RsltR.$slo_d_no);
			_sloPrmsRevMap = new HashMap<String, MCNumber>();
			
			for (MCList<Chk01_RsltR> sloPrmsGrpL : upL) {
				String slodNo = sloPrmsGrpL.get(0).slo_d_no();
				MCNumber sloPrmsRev = getSloPrmsRev(sloPrmsGrpL);
				
				sloPrmsGrpL.subList(r->!isNull(r.slo_prms_no())).setValueNE(Chk01_RsltR.$slo_prms_rev, sloPrmsRev);
				_sloPrmsRevMap.put(slodNo, sloPrmsRev);
			}
		}

		/**
		 * 受注納期回答改訂番号を取得する。
		 * @return  受注納期回答改訂番号
		 */
		protected MCNumber getSloPrmsRev(MCList<Chk01_RsltR> prmsGrpL) {

			MST_SLO_PRMS_R sloPrmsR = MST_SLO_PRMS_R.create();
			Chk01_RsltR prmsR = prmsGrpL.get(0);
			executeQuery(sloPrmsR, MSBBL1260_MST_SLO_PRMS_S02(), prmsR);

			MCNumber maxRev = nvl(sloPrmsR.slo_prms_rev(), MCNumber.ZERO);

			if (prmsGrpL.subList(r->!MAC_DATA_CRUD_TYP.isDEL(r.slo_prms_data_crud_typ())).size() !=0) {

				maxRev = maxRev.add(1);

				for (Chk01_RsltR up0R : prmsGrpL) {

					if (!up0R.isStatusDelete()) {
						prmsR.slo_prms_rev(maxRev);
					}
				}
			}

			return maxRev;
		}

		/**
		 * 受注納期回答ヘッダＮＯを設定する。
		 */
		protected void setSloPrmsHNo() {

			MCList<Chk01_RsltR> insL = MCList.create(Chk01_RsltR.class);

			for (MCList<Chk01_RsltR> sloPrmsGrpL : up0().groupList(Chk01_RsltR.$slo_d_no)) {
				MCList<Chk01_RsltR> l = sloPrmsGrpL.subList(r->!isNull(r.org_slo_prms_h_no()));

				if(!isNull(l)) {
					sloPrmsGrpL.setStringNE(Chk01_RsltR.$slo_prms_h_no, l.get(0).org_slo_prms_h_no());
				}
				else {
					insL.addAll(sloPrmsGrpL);
				}
			}

			if (!isNull(insL)) {
				
				MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
				
				for (MCList<Chk01_RsltR> dtlL : insL.groupList(Chk01_RsltR.$slo_d_no)) {
					
					Chk01_RsltR dtlR = dtlL.get(0);
					MST_SLO_R hdrR = getOldSlo(dtlR);
					
					ElmArgsR argsR = ElmArgsR.create();
					argsR.bp_cd(hdrR.cst_cd());
					argsR.trd_cd(hdrR.trd_cd());
					argsR.dpt_cd(hdrR.sls_dpt_cd());
					argsR.co_cd(getCo().co_cd());
					argsR.dt(getToday());
					argsR.wg_cd(hdrR.wg_cd());
					argsR.peg_no(dtlR.peg_no());
					argsL.add(argsR);
				}
				
				setNum(MAC_NUM_BIZ_TYP.SLOPRMSH, argsL);
				String[] srcCols = {ElmArgsR.$new_no};
				String[] destCols = {Chk01_RsltR.$slo_prms_h_no};
				copyByPegNo(insL, destCols, argsL, srcCols);
				
				for (MCList<Chk01_RsltR> dtlL : insL.groupList(Chk01_RsltR.$slo_d_no)) {
					
					Chk01_RsltR dtlR = dtlL.subList(r -> !isNull(r.slo_d_no())).get(0);
					dtlL.setValueNE(Chk01_RsltR.$slo_prms_h_no, dtlR.slo_prms_h_no());
				}
			}
		}

		/**
		 * EDI納期回答送信
		 */
		protected void createEdiSendData() {
			Chk01_RsltR sloPrmsR = up0().get(0);
			
			//EDI納期回答送信ＩＦサービス.書込
			//MSBBL6110.PrmsSendIf_Upd01
			if (sloPrmsR.edi_prms_flg() && !up0().statusChangedList().isEmpty()) {

				for (Chk01_RsltR r : up0()) {
					r.data_crud_typ(r.slo_prms_data_crud_typ());
				}

				MSLAL_PrmsSendIfService.PrmsSendIf_Upd01 ope = MSLAL_PrmsSendIfService.crtPrmsSendIf_Upd01();

				PrmsSendIf_Upd01_DtlR upR = null;

				boolean delFlg = true;
				upR = PrmsSendIf_Upd01_DtlR.create();

				upR.slo_d_no(sloPrmsR.slo_d_no());

				//更新対象の受注納期回答NOのリストを取得する
				MCList<MST_SLO_PRMS_R> sloPrmsL = getSloPrms(sloPrmsR.slo_d_no());

				if (sloPrmsL.isEmpty()) {
					//更新対象外のみの場合、データの作成自体を行わないためスキップ
					return;
				}
				else {
					for (MST_SLO_PRMS_R r : sloPrmsL) {
						for (Chk01_RsltR r1 : up0()) {
							if (isSame(r.slo_prms_no(), r1.slo_prms_no())) {
								//更新対象行のデータ更新区分≠削除の場合、ＦＬＧ=オン
								if (!MAC_DATA_CRUD_TYP.isDEL(r1.data_crud_typ())) {
									delFlg = false;
									break;
								}
							}
						}
					}
					if (delFlg) {
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						upR.del_prms_rev(sloPrmsR.slo_prms_rev());
					}
					else {
						MCList<Chk01_RsltR> grpL = up0().groupBy(Chk01_RsltR.$data_crud_typ);

						if (grpL.size() > 1) {
							upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						}
						else if (grpL.size() == 1) {

							upR.data_crud_typ(grpL.get(0).data_crud_typ());

							if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
								upR.del_prms_rev(sloPrmsR.slo_prms_rev());
							}
						}
					}
				}

				ope.up0().add(upR);

				if (ope.up0().size() > 0) {
					ope.exec();
				}
			}
		}

		/**
		 * 受注納期回答を取得する。
		 */
		protected MCList<MST_SLO_PRMS_R> getSloPrms(String slo_d_no) {
			boolean flg;

			MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);

			//ヘッダの条件をチェックする
			MST_SLO_D_R sloDR = MST_SLO_D_R.create();
			MST_SLO_D_R t1 = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDR_bldr = MCQueryApiBuilder.create(t1);
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MST_SLO_PRMS_H_R t3 = MST_SLO_PRMS_H_R.create("T3");

			sloDR_bldr.setDistinct();
			sloDR_bldr.setSelect(t1.proc_typ);
			sloDR_bldr.addSelect(t1.slo_d_no);
			sloDR_bldr.addInnerJoin(t2, t1.slo_no.eq(t2.slo_no));
			sloDR_bldr.addInnerJoin(t3, t1.slo_d_no.eq(t3.slo_d_no));
			sloDR_bldr.setWhere(t1.can_flg.eq(value(false)));
			sloDR_bldr.addWhereWithAnd(t1.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())));
			sloDR_bldr.addWhereWithAnd(t3.edi_prms_flg.eq(value(true)));
			sloDR_bldr.addWhereWithAnd(t2.cst_po_no.isNotNull());
			sloDR_bldr.addWhereWithAnd(t1.slo_d_no.eq(bind("1")), slo_d_no);
			dbSelect("MSBBL1260_MST_SLO_D_S02", sloDR, sloDR_bldr);

			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder shipSchdR_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbSelectKey("MSBBL1260_MST_SHIP_SCHD_S04", shipSchdL, shipSchdR_bldr,up0());
			MCIndexKey idxkey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);

			//パラメータ行インデックスをキーに出荷予定情報を取得
			if (!sloDR.isEmpty()) {
				for (Chk01_RsltR r2 : up0()) {
					flg = false;

					MST_SHIP_SCHD_R shipSchdR = shipSchdL.getFirst(idxkey, r2.ship_schd_no());
					if (shipSchdR != null) {
						// インボイス登録後も納期回答送信ＩＦを作成するとする
						if (shipSchdR.ship_act_qty().eq(0) && !shipSchdR.abort_flg()) {
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.getStringNE(MST_SLO_D_R.$proc_typ))) {
								flg = true;
								MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
								MST_SLS_SCHD_R t5 = MST_SLS_SCHD_R.create("T");
								MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t5);
								slsSchdL_bldr.setWhere(t5.ship_schd_no.eq(bind("1")),r2.ship_schd_no());
								dbSelect("MSBBL1260_MST_SLS_SCHD_S01", slsSchdL, slsSchdL_bldr);
								for (MST_SLS_SCHD_R row : slsSchdL) {
									if (!isNull(row.purc_act_d_no())) {
										flg = false;
										break;
									}
								}
							}
							else {
								flg = true;
							}
						}
						if (flg) {
							MST_SLO_PRMS_R sloPrmsR = MST_SLO_PRMS_R.create();
							sloPrmsR.setStringNE(MST_SLO_PRMS_R.$slo_prms_no,r2.slo_prms_no());
							sloPrmsL.add(sloPrmsR);
						}
					}
				}
			}

			return sloPrmsL;
		}

		protected void callPrint() {
			if (isNull(_printHdrL)) {
				return;
			}
			MSBBL_SloPrmsPrntService.SloPrms_Prnt01 ope = MSBBL_SloPrmsPrntService.crtSloPrms_Prnt01();
			ope.up0().addAll(_printHdrL);
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());

			ope.exec();
		}

		protected void setPrint() {
			if (!up1().prnt_out_flg() || !_isUpdFlg) {
				return;
			}
			
			if (isNull(_printHdrL)) {
				_printHdrL = MCList.create(SloPrms_Prnt01_HdrR.class);
			}
			MCList<Chk01_RsltR> up0L = up0().subList(Chk01_RsltR.$edi_prms_flg, false);
			for (Chk01_RsltR r : up0L) {
				SloPrms_Prnt01_HdrR hdrR = SloPrms_Prnt01_HdrR.create();
				copy(hdrR, r, createMap_SloPrms_Prnt01_HdrR_Chk01_RsltR());
				_printHdrL.add(hdrR);
			}
		}

		/**
		 * 受注状況更新サービスの受注状況登録処理を呼び出す。
		 */
		protected void callSloStsRegServiceIns01() {
			MSBBL_SloStsRegService.SloSts_Ins01 op = MSBBL_SloStsRegService.crtSloSts_Ins01();

			createSloPrmsSloSts(op);

			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}

		/**
		 * 納期回答に関連する受注状況を作成する。
		 * @param ins01Serv 受注状況登録サービス
		 */
		protected void createSloPrmsSloSts(
				MSBBL_SloStsRegService.SloSts_Ins01 ins01Serv) {

			if (!up0().statusChangedList().isEmpty()) {

				// 納期回答
				SloSts_DtlR sloStsR = SloSts_DtlR.create();
				sloStsR.slo_d_no(_oldSloDR.slo_d_no());
				sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.SLO_PRMS.value());
				ins01Serv.up0().add(sloStsR);
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			chk01.up0().clear();
			chk01.clear();
			mapUpContainers(CALL_OPE);
			chk01.call();
			up0().setAll(chk01.down0());
		}

		protected void setDown() {
			MCIndexKey idxKey = _upL.createIndex(Chk01_RsltR.$peg_no);
			for (Chk01_RsltR dtlR : chk01.down0()) {
				Chk01_RsltR upR = _upL.getFirst(idxKey, dtlR.peg_no());

				if (!isNull(upR)) {
					down0().add(dtlR);
				}
			}
		}
		
		/**
		 * 品目単位を取得する。
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @param unitCd 単位ＣＤ 
		 * @return 品目単位マスタ
		 */
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2,
				String itmSub3, String unitCd) {

			MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
			MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			itmUnitR.itm_cd(itmCd);
			itmUnitR.itm_sub1(itmSub1);
			itmUnitR.itm_sub2(itmSub2);
			itmUnitR.itm_sub3(itmSub3);
			itmUnitR.unit_cd(unitCd);

			dbSelectKey("MSBBL1260_MAVM_ITM_UNIT_S05", itmUnitR, itmUnitR_bldr, itmUnitR);

			return itmUnitR;
		}

		protected Map_MST_SLO_PRMS_R_Upd01_Slo_PrmsR<MST_SLO_PRMS_R, Chk01_RsltR, MST_SLO_R> createMap_MST_SLO_PRMS_R_Chk01_RsltR() {
			return new Map_MST_SLO_PRMS_R_Upd01_Slo_PrmsR<MST_SLO_PRMS_R, Chk01_RsltR, MST_SLO_R>();
		}

		public class Map_MST_SLO_PRMS_R_Upd01_Slo_PrmsR<D extends MST_SLO_PRMS_R, S extends Chk01_RsltR, W extends MST_SLO_R>
				extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.slo_prms_no(src.slo_prms_no()); //受注納期回答ＮＯ
				dest.slo_prms_rev(src.slo_prms_rev()); //受注納期回答改訂番号
				dest.slo_no(src.slo_no()); //受注ＮＯ
				dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
				dest.slo_prms_h_no(src.slo_prms_h_no()); //受注納期回答ヘッダＮＯ
				dest.dlv_inst_rcpt_no(src.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
				dest.prms_dlv_tm(src.prms_dlv_tm()); //回答納入日時
				dest.trd_unit_prms_qty(src.trd_unit_prms_qty()); //取引単位回答数量
				dest.base_unit_prms_qty(src.base_unit_qty()); //基準単位回答数量
				dest.prms_rmrks(src.prms_rmrks()); //回答備考
				dest.intr_rmrks(src.intr_rmrks()); //内部備考
				dest.sub_char1(src.sub_char1()); //予備１
				dest.sub_char2(src.sub_char2()); //予備２
				dest.sub_char3(src.sub_char3()); //予備３
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 納期回答を取り消す<br>
	 */
	public class Del01 extends MSBBL_SloPrmsListReg_MC_A.Del01 {

		protected MSBBL_SloPrmsListReg.Chk01 _chkOpe = null;

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				rollbackMessagePool();
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();
			doCache(up0());

			callThisChk01(up0());

			callThisUpd01(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected void callThisChk01(MCList<Chk01_RsltR> up0L) {

			_chkOpe = MSBBL_SloPrmsListReg.crtChk01();
			_chkOpe.up0().setAll(up0L);

			_chkOpe.exec();
			
			if (!_chkOpe.down0().isEmpty()) {
				copyErrFlg(up0(), _chkOpe.down0());
			}
		}

		protected void callThisUpd01(MCList<Chk01_RsltR> up0L) {
			MCList<Chk01_RsltR> notErrL = _chkOpe.down0().subList(Chk01_RsltR.$err_flg, false);
			
			if (!notErrL.isEmpty()) {
				MSBBL_SloPrmsListReg.Upd01 updOpe = MSBBL_SloPrmsListReg.crtUpd01();
				updOpe.up0().setAll(notErrL);
				updOpe.up1().prnt_out_flg(up1().prnt_out_flg());
				updOpe.up1().indiv_prnt_flg(up1().indiv_prnt_flg());

				updOpe.exec();
			}
		}

		protected void editUp() {

			setPegNo(up0());
			MCList<Chk01_RsltR> sloPrmsL  = getShipSchdUpL();
			up0().clear();
			up0().addAll(sloPrmsL);

			//データ更新区分の設定
			for (Chk01_RsltR r : up0()) {
				r.slo_prms_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				
				if(!isNull(r.ship_schd_no())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		/**
		 * 受注納期回答に紐づく出荷予定情報を取得する。
		 * 例：受注納期回答：出荷予定は１：Ｎの場合、Ｎ件を取得。
		 */
		protected MCList<Chk01_RsltR> getShipSchdUpL() {
			
			MCList<Chk01_RsltR> sloPrmsL = MCList.create(Chk01_RsltR.class);
			MCList<Chk01_RsltR> rsltL = MCList.create(Chk01_RsltR.class);
			rsltL = getSloPrmsExceptUp(up0());
			
			if (!rsltL.isEmpty()) {
				
				MCIndexKey idxkey = rsltL.createIndex(Chk01_RsltR.$slo_d_no, Chk01_RsltR.$slo_prms_no);
				int i = ((MCNumber)up0().max(Chk01_RsltR.$peg_no)).intValue();
				for (Chk01_RsltR upR : up0()) {
					MCList<Chk01_RsltR> l = rsltL.subList(idxkey, upR.slo_d_no(), upR.slo_prms_no());
					
					if (!l.isEmpty()) {
						
						MCNumber pegNo = MCNumber.ZERO;
						for (Chk01_RsltR r : l) {
							Chk01_RsltR delR = Chk01_RsltR.create();
							MCRow.copyall(delR, upR);
							delR.ship_schd_no(r.ship_schd_no());
							delR.ship_pr_no(r.ship_pr_no());
							delR.ship_fr_lg_grp_cd(r.ship_fr_lg_grp_cd());
							delR.ship_fr_lg_grp_wg_cd(r.ship_fr_lg_grp_wg_cd());
							delR.ship_rqst_tm(r.ship_rqst_tm());
							delR.ship_schd_tm(r.ship_schd_tm());
							delR.pd_inst_dlv_tm(r.pd_inst_dlv_tm());
							delR.dlv_schd_tm(r.dlv_schd_tm());
							delR.trd_unit_qty(r.trd_unit_qty());
							
							if(pegNo.gt(MCNumber.ZERO)) {
								delR.peg_no(++i);
							}
							sloPrmsL.add(delR);
							pegNo = pegNo.add(MCNumber.ONE);
						}
					}
				}
			}
			
			return sloPrmsL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納期回答書を発行する。<br>
	 */
	public class Prnt01 extends MSBBL_SloPrmsListReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<SloPrms_Prnt01_HdrR> hdrL = MCList.create(SloPrms_Prnt01_HdrR.class);
			for (Prnt01_RsltR r : up0()) {
				SloPrms_Prnt01_HdrR hdrR = SloPrms_Prnt01_HdrR.create();
				copy(hdrR, r, createMap_SloPrms_Prnt01_HdrR_Prnt01_RsltR());
				hdrL.add(hdrR);
			}

			callSloPrmsPrntServicePrnt01(hdrL, up1().indiv_prnt_flg());
			setDown();
		}

		/**
		 * 納期回答書発行サービスの帳票出力処理を呼び出す。
		 */
		protected void callSloPrmsPrntServicePrnt01(MCList<SloPrms_Prnt01_HdrR> hdrL, Boolean indivPrntFlg) {
			MSBBL_SloPrmsPrntService.SloPrms_Prnt01 ope = MSBBL_SloPrmsPrntService.crtSloPrms_Prnt01();
			ope.up0().addAll(hdrL);
			ope.up1().indiv_prnt_flg(indivPrntFlg);

			ope.exec();

			MCIndexKey key = ope.down0().createIndex(SloPrms_Prnt01_HdrR.$slo_prms_no);
			for (Prnt01_RsltR upR : up0()) {
				SloPrms_Prnt01_HdrR r = ope.down0().getFirst(key, upR.slo_prms_no());
				upR.err_flg(r.err_flg());
				if (!upR.err_flg()) {
					upR.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
				else {
					upR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * RevUpd01オペレーション.<p>
	 *
	 * 受注納期回答改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class RevUpd01 extends MSBBL_SloPrmsListReg_MC_A.RevUpd01 {

		MCList<MST_SLO_PRMS_R> _dCurrentL = MCList.create(MST_SLO_PRMS_R.class);

		MCList<MST_SLO_PRMS_P_R> _dRevL = MCList.create(MST_SLO_PRMS_P_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			wkInsert();
			selectCurrent();
			revisionInsOrUpd();
		}

		/**
		 * 上り電文の項目を本体・改訂履歴明細のワークテーブルに設定
		 */
		protected void wkInsert() {
			MCList<MST_SLO_PRMS_R> wkL = MCList.create(MST_SLO_PRMS_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SLO_PRMS_R wkR = MST_SLO_PRMS_R.create();
				wkR.slo_prms_no(r.rev_data_src_no());
				wkR.slo_prms_rev(r.rev_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder
					.create(MST_SLO_PRMS_R.create("T"));
			dbWkDelete("MSBBL1260_MSW_SLO_PRMS_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1260_MSW_SLO_PRMS_I01",
					wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()),
					MCQueryApiBuilder.create(MST_SLO_PRMS_R.create("T")).getBaseDbc());

			MCList<MST_SLO_PRMS_P_R> wkpL = MCList.create(MST_SLO_PRMS_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SLO_PRMS_P_R wkpR = MST_SLO_PRMS_P_R.create();
				wkpR.slo_prms_no(r.rev_data_src_no());
				wkpR.slo_prms_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder
					.create(MST_SLO_PRMS_P_R.create("T"));
			dbWkDelete("MSBBL1260_MSW_SLO_PRMS_P_D01", wkpL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1260_MSW_SLO_PRMS_P_I01",
					wkpL.groupBy(wkpL_bldr.getBaseDbc().getKeyColumn()),
					MCQueryApiBuilder.create(MST_SLO_PRMS_P_R.create("T")).getBaseDbc());
		}

		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		protected void selectCurrent() {
			MST_SLO_PRMS_R t1 = MST_SLO_PRMS_R.create("T");
			MCQueryApiBuilder dCurrentL_bldr = MCQueryApiBuilder.create(t1);
			MSW_SLO_PRMS_KEY_R w1 = MSW_SLO_PRMS_KEY_R.create("W");
			dCurrentL_bldr.addInnerJoin(w1, bracket(t1.slo_prms_no.eq(w1.slo_prms_no)));
			dbSelect("MSBBL1260_MST_SLO_PRMS_S03", _dCurrentL, dCurrentL_bldr);

			MST_SLO_PRMS_P_R t2 = MST_SLO_PRMS_P_R.create("T");
			MCQueryApiBuilder dRevL_bldr = MCQueryApiBuilder.create(t2);
			MSW_SLO_PRMS_P_KEY_R w2 = MSW_SLO_PRMS_P_KEY_R.create("W");
			dRevL_bldr.addInnerJoin(w2, bracket(t2.slo_prms_no.eq(w2.slo_prms_no)
					.and(t2.slo_prms_rev.eq(w2.slo_prms_rev))));
			dbSelect("MSBBL1260_MST_SLO_PRMS_P_S01", _dRevL, dRevL_bldr);
		}

		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加または更新する。
		 */
		protected void revisionInsOrUpd() {
			// 明細の改訂履歴テーブルを追加または更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_SLO_PRMS_P_R.$slo_prms_no,
					MST_SLO_PRMS_P_R.$slo_prms_rev);
			MCList<MST_SLO_PRMS_P_R> dUpd = MCList.create(MST_SLO_PRMS_P_R.class);
			MCList<MST_SLO_PRMS_P_R> dIns = MCList.create(MST_SLO_PRMS_P_R.class);

			for (MST_SLO_PRMS_R dcurrentR : _dCurrentL) {
				MST_SLO_PRMS_P_R tempRevR = MST_SLO_PRMS_P_R.create();
				tempRevR.setByName(dcurrentR);
				if (_dRevL == null || isNull(_dRevL.getFirst(dRevIdx,
						tempRevR.slo_prms_no(), tempRevR.slo_prms_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
			}
			if (!isNull(dIns)) {
				MCQueryApiBuilder dIns_bldr = MCQueryApiBuilder
						.create(MST_SLO_PRMS_P_R.create("T"));
				dbInsert("MSBBL1260_MST_SLO_PRMS_P_I01", dIns, dIns_bldr);
			}
			if (!isNull(dUpd)) {
				MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder
						.create(MST_SLO_PRMS_P_R.create("T"));
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBBL1260_MST_SLO_PRMS_P_U01", dUpd, dUpd_bldr);
			}
		}
	}

	/**
	 * 同一処理単位で分割する(更新、削除用)。
	 * @param list 上り電文のリスト
	 * @param max １スレッドあたりの処理数
	 * @return 分割した電文
	 */
	protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
		List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
		MCList<Chk01_RsltR>[] grpL = list.groupList(getSplitColumn());
		MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
		for (MCList<Chk01_RsltR> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_RsltR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	protected String[] getSplitColumn(){
		return new String[]{Chk01_RsltR.$cst_cd};
	}

	protected void handleSuccess(MCList<Chk01_RsltR> l) {
		dbTran().commit();
		for (Chk01_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected void handleEx(Exception e, MCList<Chk01_RsltR> l) {
		dbTran().rollback();

		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException) e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (Chk01_RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}

	protected void doCache(MCList<Chk01_RsltR> up0L) {
		initSloCache(up0L);
		initSloDCache(up0L);
		initShipPrCache(up0L);
		initSloPrmsCache(up0L);
	}

	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up
	 */
	protected void setUpTmpCol(Srch01_CndR cndR) {

		// 運用日付
		cndR.addDateColumn("today", getToday());

		if (!isSame(cndR.not_edi_flg(), cndR.edi_flg())) {

			cndR.addStringColumn("edi_flg_str",
					MCBooleanUtil.booleanToDBString(cndR.edi_flg()));
		}

		if (isSame(cndR.ope(), "0") || isSame(cndR.ope(), "1")) {
			cndR.addStringColumn("trnst_flg_str", MCBooleanUtil.booleanToDBString(true));
		}
		else {
			cndR.addStringColumn("trnst_flg_str", MCBooleanUtil.booleanToDBString(false));
		}
		
		if (isSame(cndR.ope(), "0")) {
			cndR.addStringColumn("ship_schd_flg_str", MCBooleanUtil.booleanToDBString(true));
		}
	}

	/**
	 * 分類ＦＬＧを設定する。
	 * @param cndR 検索条件
	 */
	protected void setGrpFlgTrue(Srch01_CndR cndR) {
		// 得意先
		cndR.cst_grp_flg1(true);
		cndR.cst_grp_flg2(true);
		cndR.cst_grp_flg3(true);
		cndR.cst_grp_flg4(true);
		cndR.cst_grp_flg5(true);
		cndR.cst_grp_flg6(true);
		cndR.cst_grp_flg7(true);
		cndR.cst_grp_flg8(true);
		cndR.cst_grp_flg9(true);
		cndR.cst_grp_flg10(true);
		// 納品先
		cndR.dlv_grp_flg1(true);
		cndR.dlv_grp_flg2(true);
		cndR.dlv_grp_flg3(true);
		cndR.dlv_grp_flg4(true);
		cndR.dlv_grp_flg5(true);
		cndR.dlv_grp_flg6(true);
		cndR.dlv_grp_flg7(true);
		cndR.dlv_grp_flg8(true);
		cndR.dlv_grp_flg9(true);
		cndR.dlv_grp_flg10(true);
		// 品目
		cndR.itm_grp_flg1(true);
		cndR.itm_grp_flg2(true);
		cndR.itm_grp_flg3(true);
		cndR.itm_grp_flg4(true);
		cndR.itm_grp_flg5(true);
		cndR.itm_grp_flg6(true);
		cndR.itm_grp_flg7(true);
		cndR.itm_grp_flg8(true);
		cndR.itm_grp_flg9(true);
		cndR.itm_grp_flg10(true);
	}

	/**
	 * 出荷進捗のワークテーブルを作成する。
	 * @param shipPrNoL 出荷進捗NOリスト
	 */
	protected void crtShipPrWk(List<String> shipPrNoL) {
		
		MCList<MST_SHIP_PR_R> lst = MCList.create(MST_SHIP_PR_R.class);
		MST_SHIP_PR_R shipPrR = null;
		
		for (String shipPrNo :shipPrNoL) {
			
			shipPrR = MST_SHIP_PR_R.create();
			shipPrR.ship_pr_no(shipPrNo);
			
			lst.add(shipPrR);
		}

		MCQueryApiBuilder shipPr_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
		dbWkDelete("MSBBL1260_MSW_SHIP_PR_D01", shipPr_bldr.getBaseDbc());
		dbWkInsert("MSBBL1260_MSW_SHIP_PR_I01", lst, shipPr_bldr.getBaseDbc());
	}
	
	/**
	 * 受注明細のワークテーブルを作成する。
	 * @param sloDNoL 受注明細NOリスト
	 */
	protected void crtSloDWk(List<String> sloDNoL) {
		
		MCList<MST_SLO_D_R> lst = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R sloDR = null;
		
		for (String sloDNo : sloDNoL) {
			
			sloDR = MST_SLO_D_R.create();
			sloDR.slo_d_no(sloDNo);
			
			lst.add(sloDR);
		}

		MCQueryApiBuilder sloD_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
		dbWkDelete("MSBBL1260_MSW_SLO_D_D01", sloD_bldr.getBaseDbc());
		dbWkInsert("MSBBL1260_MSW_SLO_D_I01", lst, sloD_bldr.getBaseDbc());
	}
	
	/**
	 * 出荷予定を取得する。
	 * @return 出荷予定リスト
	 */
	protected MCList<MST_SHIP_SCHD_R> getShipSchd() {
		
		MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R shipSchdL_t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchdL_t);
		
		MSW_SHIP_PR_KEY_R w1 = MSW_SHIP_PR_KEY_R.create("W");
		shipSchdL_bldr.addInnerJoin(w1, bracket(shipSchdL_t.ship_pr_no.eq(w1.ship_pr_no)));
		
		dbSelect("MSBBL1260_MST_SHIP_SCHD_S02", shipSchdL, shipSchdL_bldr);
		
		return shipSchdL;
	}
	/**
	 * 受注納期回答を取得する。
	 * @return 受注納期回答リスト
	 */
	protected MCList<Chk01_RsltR> getSloPrmsExceptUp(MCList<Chk01_RsltR> upL) {
		crtSloDWk(upL.distinctNE(Chk01_RsltR.$slo_d_no).getStringNE(Chk01_RsltR.$slo_d_no));
		
		MCList<Chk01_RsltR> rsltL = MCList.create(Chk01_RsltR.class);
		executeQuery(rsltL, MSBBL1260_MST_SLO_PRMS_S03());
		
		return rsltL;
	}
	/**
	 * 納期回答に紐付く出荷予定が打切りかどうか。
	 * @param subShipSchdL 出荷予定リスト
	 * @return 打切の出荷予定が一つでもあった場合はtrue
	 */
	protected boolean isShipSchdAbort(MCList<MST_SHIP_SCHD_R> subShipSchdL) {
		
		for (MST_SHIP_SCHD_R shipSchdR : subShipSchdL) {
			if (shipSchdR.abort_flg()) {
				return true;
			}
		}
		return false;
	}

	protected void setTrdUnitCd(MCList<Srch01_RsltR> down0, MCList<MST_SHIP_SCHD_R> shipSchdL) {
		// 「出荷予定ＮＯ > 受注納期回答ＮＯ > 納入指示受領ＮＯ > 出荷進捗(受注明細)」の順で
		// 始めに取得できた出荷予定の取引単位を回答単位に設定する
		MCList<Srch01_RsltR> prmsUnitL = MCList.create(Srch01_RsltR.class);
		
		MCIndexKey idx = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
		for (Srch01_RsltR r : down0) {
			if (!isNull(r.trd_unit_cd())) {
				continue;
			}
			prmsUnitL.add(r);
			
			MCList<MST_SHIP_SCHD_R> subShipSchdL = shipSchdL.subList(idx, r.ship_pr_no());
			for (String key : new String[]{
					MST_SHIP_SCHD_R.$ship_schd_no,
					MST_SHIP_SCHD_R.$slo_prms_no,
					MST_SHIP_SCHD_R.$dlv_inst_rcpt_no}) {
				
				if (!isNull(r.getString(key))) {
					MST_SHIP_SCHD_R shipSchdR = subShipSchdL.getFirst(key, r.getString(key));
					if (!isNull(shipSchdR)) {
						r.trd_unit_cd(shipSchdR.trd_unit_cd());
						break;
					}
				}
			}
			if (isNull(r.trd_unit_cd())) {
				r.trd_unit_cd(r.slo_trd_unit_cd());
			}
		}
		
		if (!prmsUnitL.isEmpty()) {
			join(prmsUnitL);
		}
	}
	protected void join(MCList<Srch01_RsltR> down0) {
		MCJoinerList<Srch01_RsltR> joinList = new MCJoinerList<>();
		
		joinList
			.add(MAM_UNIT_R.class, r -> toCondition(
				r.trd_unit_cd()
			))
			.addSelect(m -> toArray(
				m.unit_nm
			))
			.addMap((r, m) -> {
				r.trd_unit_nm(m.unit_nm());
			});
		
		joinList
			.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
				r.itm_cd(), r.itm_sub1(), r.itm_sub2(),r.itm_sub3(), r.trd_unit_cd()
			))
			.addSelect(m -> toArray(
				m.dec_place
			))
			.addMap((r, m) -> {
				r.trd_unit_dec_place(m.dec_place());
			});
		
		joinList.join(down0);
	}
	
	protected Map_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, MST_SLO_D_R, Chk01_RsltR> createMap_ShipSchd_DtlR_MST_SLO_D_R() {
		return new Map_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, MST_SLO_D_R, Chk01_RsltR>();
	}

	public class Map_ShipSchd_DtlR_MST_SLO_D_R<D extends ShipSchd_DtlR, S extends MST_SLO_D_R, W extends Chk01_RsltR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;

		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}

		@Override
		public void valueCopy(D dest, S src) {

			dest.peg_no(_dtlR.peg_no()); //データ紐付けＮＯ
			dest.data_crud_typ(_dtlR.data_crud_typ()); //データ更新区分
			dest.ship_schd_no(_dtlR.ship_schd_no()); //出荷予定ＮＯ
			dest.ship_pr_no(_dtlR.ship_pr_no()); //出荷進捗ＮＯ
			dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
			dest.dlv_inst_rcpt_no(_dtlR.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
			dest.slo_prms_no(_dtlR.slo_prms_no()); //受注納期回答ＮＯ
			dest.sls_act_d_no(_dtlR.sls_act_d_no()); //売上実績明細ＮＯ
			dest.ship_fr_lg_grp_cd(_dtlR.ship_fr_lg_grp_cd()); //出荷元物流グループＣＤ
			dest.wg_cd(_dtlR.ship_fr_lg_grp_wg_cd());
			dest.pd_inst_dlv_tm(_dtlR.pd_inst_dlv_tm()); //納品依頼日時
			dest.ship_rqst_tm(_dtlR.ship_rqst_tm()); //出荷希望日時
			dest.ship_schd_tm(_dtlR.ship_schd_tm()); //出荷予定日時
			dest.dlv_schd_tm(_dtlR.dlv_schd_tm()); //納品予定日時
			dest.ship_term_cd(_dtlR.ship_term_cd()); //出荷条件ＣＤ
			dest.ship_wk_cd(_dtlR.ship_wk_cd()); //出荷作業ＣＤ
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.itm_nm(src.itm_nm()); //品名
			dest.iv_itm_nm(src.iv_itm_nm()); //インボイス表記用品名
			dest.sundry_itm_flg(src.sundry_itm_flg()); //諸口品ＦＬＧ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.ver_no(src.ver_no()); //版ＮＯ			
			dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value()); //在庫着荷先ＣＤ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分
			dest.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤ
			dest.trd_unit_qty(_dtlR.trd_unit_qty()); //取引単位数量
			dest.trd_unit_cd(_dtlR.trd_unit_cd()); //取引単位ＣＤ
			dest.base_unit_qty(_dtlR.base_unit_qty()); //基準単位数量
			dest.base_unit_cd(_dtlR.base_unit_cd()); //基準単位ＣＤ
			dest.fix_flg(_dtlR.fix_flg()); //確定ＦＬＧ		
			dest.ship_block_flg(_dtlR.ship_block_flg());
			dest.inst_bndl_flg(false); //指図まとめＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在ＦＬＧ
			dest.vld_dt_fr(_dtlR.valid_dt_fr()); //有効期限ＦＲＯＭ
			dest.vld_dt_to(_dtlR.valid_dt_to()); //有効期限ＴＯ
			dest.re_ship_schd_flg(_dtlR.re_ship_schd_flg()); //再出荷予定ＦＬＧ
			dest.intr_rmrks(src.intr_rmrks()); //内部備考
			dest.trd_rmrks(null); //取引備考
			dest.trd_d_rmrks(_dtlR.trd_d_rmrks()); //取引明細備考
			dest.ship_cnt_rmrks(_dtlR.ship_cnt_rmrks()); //出荷連絡備考
			dest.dlv_upd_flg(true);
			dest.dlv_cd(_dtlR.dlv_cd());
			dest.dlv_sundry_flg(_dtlR.dlv_sundry_flg());
			dest.dlv_nm(_dtlR.dlv_nm());
			dest.dlv_cntct_dpt(_dtlR.dlv_cntct_dpt());
			dest.dlv_cntct_psn(_dtlR.dlv_cntct_psn());
			dest.dlv_zip_cd(_dtlR.dlv_zip_cd());
			dest.dlv_addr1(_dtlR.dlv_addr1());
			dest.dlv_addr2(_dtlR.dlv_addr2());
			dest.dlv_addr3(_dtlR.dlv_addr3());
			dest.dlv_addr4(_dtlR.dlv_addr4());
			dest.dlv_tel(_dtlR.dlv_tel());
			dest.dlv_fax(_dtlR.dlv_fax());
			dest.dlv_lg_grp_cd(_dtlR.dlv_lg_grp_cd());
			dest.pri_prnt_flg(_dtlR.pri_prnt_flg());
			dest.tdlv_cd(_dtlR.tdlv_cd());
			dest.tdlv_sundry_flg(_dtlR.tdlv_sundry_flg());
			dest.tdlv_nm(_dtlR.tdlv_nm());
			dest.via_dlv_typ(_dtlR.via_dlv_typ());
			dest.tdlv_cntct_dpt(_dtlR.tdlv_cntct_dpt());
			dest.tdlv_cntct_psn(_dtlR.tdlv_cntct_psn());
			dest.tdlv_zip_cd(_dtlR.tdlv_zip_cd());
			dest.tdlv_addr1(_dtlR.tdlv_addr1());
			dest.tdlv_addr2(_dtlR.tdlv_addr2());
			dest.tdlv_addr3(_dtlR.tdlv_addr3());
			dest.tdlv_addr4(_dtlR.tdlv_addr4());
			dest.tdlv_tel(_dtlR.tdlv_tel());
			dest.tdlv_fax(_dtlR.tdlv_fax());
			dest.tdlv_lg_grp_cd(_dtlR.tdlv_lg_grp_cd());
			dest.dlv_day_week_typ(_dtlR.dlv_day_week_typ());
			dest.sub_char1(_dtlR.ship_schd_sub_char1()); //予備１
			dest.sub_char2(_dtlR.ship_schd_sub_char2()); //予備２
			dest.sub_char3(_dtlR.ship_schd_sub_char3()); //予備３
			dest.inst_qty(null); //指図数量（基準単位）
			dest.inst_unit_cd(null); //指図単位ＣＤ
			dest.inst_ship_schd_tm(null); //指図出荷予定日時
			dest.inst_dlv_schd_tm(null); //指図納品予定日時
			dest.not_dt_calc_flg(_dtlR.not_dt_calc_flg());
			dest.ship_schd_split_flg(false); //出荷予定分割ＦＬＧ
		}
	}

	protected Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR, MST_SHIP_ALLOC_STS_R> createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R() {
		return new Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<D extends Alloc_RsltR, S extends MST_SHIP_ALLOC_STS_R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {

			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, MST_SHIP_ALLOC_STS_R.$ship_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ,
					MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, MST_SHIP_ALLOC_STS_R.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, MST_SHIP_ALLOC_STS_R.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, MST_SHIP_ALLOC_STS_R.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, MST_SHIP_ALLOC_STS_R.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, MST_SHIP_ALLOC_STS_R.$sno4);
			addColumnPathMap(Alloc_RsltR.$ver_no, MST_SHIP_ALLOC_STS_R.$ver_no);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd,
					MST_SHIP_ALLOC_STS_R.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty,
					MST_SHIP_ALLOC_STS_R.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd,
					MST_SHIP_ALLOC_STS_R.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty,
					MST_SHIP_ALLOC_STS_R.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, MST_SHIP_ALLOC_STS_R.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, MST_SHIP_ALLOC_STS_R.$vld_dt_to);
			addColumnPathMap(Alloc_RsltR.$alloc_flg, MST_SHIP_ALLOC_STS_R.$alloc_flg);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.stk_lg_grp_cd(src.getStringNE("ship_fr_lg_grp_cd"));
		}
	}

	protected Map_SloPrms_Prnt01_HdrR_Chk01_RsltR<SloPrms_Prnt01_HdrR,Chk01_RsltR> createMap_SloPrms_Prnt01_HdrR_Chk01_RsltR() {
		return new Map_SloPrms_Prnt01_HdrR_Chk01_RsltR<SloPrms_Prnt01_HdrR, Chk01_RsltR>();
	}

	public class Map_SloPrms_Prnt01_HdrR_Chk01_RsltR<D extends SloPrms_Prnt01_HdrR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_h_no, Chk01_RsltR.$slo_prms_h_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_no, Chk01_RsltR.$slo_prms_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_rev, Chk01_RsltR.$slo_prms_rev);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_d_no, Chk01_RsltR.$slo_d_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_no, Chk01_RsltR.$slo_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$err_flg, Chk01_RsltR.$err_flg);
		}
	}

	protected Map_SloPrms_Prnt01_HdrR_Prnt01_RsltR<SloPrms_Prnt01_HdrR,Prnt01_RsltR> createMap_SloPrms_Prnt01_HdrR_Prnt01_RsltR() {
		return new Map_SloPrms_Prnt01_HdrR_Prnt01_RsltR<SloPrms_Prnt01_HdrR, Prnt01_RsltR>();
	}

	public class Map_SloPrms_Prnt01_HdrR_Prnt01_RsltR<D extends SloPrms_Prnt01_HdrR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_h_no, Prnt01_RsltR.$slo_prms_h_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_no, Prnt01_RsltR.$slo_prms_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_prms_rev, Prnt01_RsltR.$slo_prms_rev);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_d_no, Prnt01_RsltR.$slo_d_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$slo_no, Prnt01_RsltR.$slo_no);
			addColumnPathMap(SloPrms_Prnt01_HdrR.$err_flg, Prnt01_RsltR.$err_flg);
		}
	}

	//FMCB CUSTOM END
}