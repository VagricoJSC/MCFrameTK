package mcframe.serverMSBB.MSBBL6020;

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
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6020.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBA.MSBAL5130.*;
import mcframe.serverMSBF.MSBFL5110.*;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSBB.MSBBL6080.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBB.MSBBL6230.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.serverMSBB.MSBBL6020.Query.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnUtil;
import mcframe.serverMSUC.MSUCL0110.StrLnUtil_Srch01_CndR;
import mcframe.serverMSBF.MSBFL5100.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMABC.MABCL5010.MABCL_SundryItmRegService;
import mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR;
import mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL0080.MAUCL_StdUpriUtil;
import mcframe.serverMABS.MABSL5010.MABSL_SlsUpriService;
import mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SloRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SloRegService_MC extends MSBBL_SloRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * 引当結果リスト
	 */
	protected MCList<Srch_RsltR> _allocResultL = null;
	protected MCList<Srch_RsltR> _allocResultBkL = null;

	/**受注状況更新用の引当結果（通常の引当）*/
	protected MCList<Srch_RsltR> _allocResultLSloStsNrml = null;
	/**受注状況更新用の引当結果（供給依頼の入庫予定引当）*/
	protected MCList<Srch_RsltR> _allocResultLSloStsDmndRqst = null;
	
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBBL_SloRegService> CLAZZ = MSBBL_SloRegService.class;

	/**
	 * 受注ヘッダのキャッシュ
	 */
	protected MST_SLO_R _cacheSloR = null;
	protected MST_SLO_R _cacheSloR_t = null;
	protected MCQueryApiBuilder _cacheSloR_bldr = null;
	
	protected MCList<MST_SLO_R> _cacheSloList = null;
	protected MCIndexKey _sloListKey = null;

	/**
	 * 受注明細のキャッシュ
	 */
	protected MCList<MST_SLO_D_R> _cacheSloDL = null;
	protected MST_SLO_D_R _cacheSloDL_t = null;
	protected MCQueryApiBuilder _cacheSloDL_bldr = null;
	
	protected MCIndexKey _sloDKey = null;

	protected MCIndexKey _shipPrKey = null;

	/**
	 * 出荷進捗のキャッシュ
	 */
	protected MCList<MST_SHIP_PR_R> _cacheShipPrL = null;
	protected MCList<MST_SHIP_PR_R> _cacheUpd04ShipPrL = null;
	
	/**
	 * 出荷予定のキャッシュ
	 */
	protected MCList<MST_SHIP_SCHD_R> _cacheShipSchdL = null;
	protected MCList<MST_SHIP_SCHD_R> _cacheUpd04ShipSchdL = null;
	
	protected MCIndexKey _shipSchdKey = null;

	/**
	 * 出荷引当状況のキャッシュ
	 */
	protected MCList<MST_SHIP_ALLOC_STS_R> _cacheShipAlocStsL = null;
	/**
	 * 受注引当格付マスタのキャッシュ
	 */
	protected MCList<MAM_SLO_ALLOC_GD_R> _cacheSloAllocGdL = null;

	protected MCIndexKey _sloAllocGdKey = null;

	/**
	 * ロット・サブロットリストのキャッシュ
	 */
	protected MCList<MSVT_LOT_LIST_R> _cacheLotSublotL = null;
	
	protected MCIndexKey _lotSublotKey = null;

	/**
	 * 見積のキャッシュ
	 */
	protected MCList<MST_QTN_R> _cacheQtnList = null;
	
	/**
	 * 見積のインデックスキー
	 */
	protected MCIndexKey _qtnIdKey = null;
	protected String _sysParm = getSysParm("MASTER_DT_BASE");
	/**
	 * 物流制御のキャッシュ
	 */
	protected MCList<MAM_LG_CTL_R> _cacheLgCtlList = null;
	
	
	protected MCList<MAM_ITM_DTL_R> _itmDtlL = null;
	
	protected MCIndexKey _itmDtlWgIdxkey = null;
	
	protected MAM_ITM_DTL_R getItmDtlR(
		String itm_cd
		, String itm_sub1
		, String itm_sub2
		, String itm_sub3
		, String gr_loc_wg_cd
		, MCDate gr_rqst_tm
	) {
		MCList<MAM_ITM_DTL_R> itmDtlL = object(CLAZZ)._itmDtlL.subList(object(CLAZZ)._itmDtlWgIdxkey, itm_cd, itm_sub1, itm_sub2, itm_sub3, gr_loc_wg_cd);
		itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$rqst_loc_cd);
		for(MAM_ITM_DTL_R r : itmDtlL) {
			if(gr_rqst_tm.gte(r.st_dt()) && gr_rqst_tm.lte(r.end_dt())) {
				return r;
			}
		}
		return null;
	}

	protected MCIndexKey _lgCtlIdKey = null;
	/**
	 * ファイル取込
	 */
	protected boolean _fileImpFlg = false;
	/**
	 * 引当結果の変数の初期化
	 */
	protected void initAllocResult() {
		_allocResultL = MCList.create(Srch_RsltR.class);
		_allocResultBkL = MCList.create(Srch_RsltR.class);
		_allocResultLSloStsNrml = MCList.create(Srch_RsltR.class);
		_allocResultLSloStsDmndRqst = MCList.create(Srch_RsltR.class);
	}
	
	/**
	 * 受注ヘッダコンテナを取得する。
	 * 
	 * @param rsltL キャッシュ条件
	 * @return 場所マスタコンテナ
	 */
	protected static void initSloCache(MCRow hdr) {
		object(CLAZZ)._initSloCache(hdr);
	}
	
	protected static void initUpd04SloCache(MCList<Slo_Upd02_SloR> sloL) {
		object(CLAZZ)._initUpd04SloCache(sloL);
	}

	protected static void initSloDCache(MCRow hdr) {
		object(CLAZZ)._initSloDCache(hdr);
	}
	
	protected static void initShipPrCache(MCList<? extends MCRow> dL) {
		object(CLAZZ)._initShipPrCache(dL);
	}
	
	protected static void initUpd04ShipPrCache(MCList<Slo_Upd02_SloR> sloL) {
		object(CLAZZ)._initUpd04ShipPrCache(sloL);
	}

	protected static void initShipSchdCache(MCList<? extends MCRow> dL) {
		object(CLAZZ)._initShipSchdCache(dL);
	}
	
	protected static void initUpd04ShipSchdCache(MCList<Slo_Upd02_SloR> sloL) {
		object(CLAZZ)._initUpd04ShipSchdCache(sloL);
	}

	protected static void initShipAlocCache(MCList<Slo_Upd01_DtlR> dL) {
		object(CLAZZ)._initShipAlocCache(dL);
	}
	protected static void initSloAllocGdCache(MCList<Slo_Upd01_HdrR> sloL) {
		object(CLAZZ)._initSloAllocGdCache(sloL);
	}
	protected static void initLotSublotCache(MCList<Slo_Upd01_DtlR> dL) {
		object(CLAZZ)._initLotSublotCache(dL);
	}

	protected MCList<MST_WG_RQST_R> _wgRqstL = null;
	protected MCIndexKey _wgRqstKey = null;
	protected void initWgRqstCache(MCList<?> dL) {
		_wgRqstL = MCList.create(MST_WG_RQST_R.class);
		MST_WG_RQST_R wgRqstL_t = MST_WG_RQST_R.create("T");
		MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(wgRqstL_t);
		wgRqstL_bldr.setWhere(wgRqstL_t.wg_rqst_typ.eq(bind("1")), MSC_WG_RQST_TYP.PURC.value());
		wgRqstL_bldr.addWhereWithAnd(wgRqstL_t.wg_rqst_src_typ.eq(bind("1")), MSC_WG_RQST_SRC_TYP.SLO.value());
		wgRqstL_bldr.addWhereWithAnd(wgRqstL_t.wg_rqst_src_no.eq(bind("slo_d_no")));
		wgRqstL_bldr.addWhereWithAnd(wgRqstL_t.can_flg.eq(value(false)));
		dbSelect("MSBBL6020_MST_WG_RQST_S02", _wgRqstL, wgRqstL_bldr, dL);
		_wgRqstKey = _wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_src_no);
	}

	/**
	 * 受注ヘッダコンテナキャッシュを初期化する。
	 * 
	 * @param rsltL キャッシュ条件
	 */
	protected void _initSloCache(MCRow hdr) {
		_cacheSloR = MST_SLO_R.create();
		_cacheSloR_t = MST_SLO_R.create("T");
		_cacheSloR_bldr = MCQueryApiBuilder.create(_cacheSloR_t);
		dbSelectKeyForUpdateNoWait("MSBBL6020_MST_SLO_S01", _cacheSloR, _cacheSloR_bldr, hdr);
	}
	
	protected void _initUpd04SloCache(MCList<Slo_Upd02_SloR> sloL) {
		_cacheSloList = MCList.create(MST_SLO_R.class);
		dbSelectKeyForUpdate("MSBBL6020_MST_SLO_S02", _cacheSloList,
				MCQueryApiBuilder.create(MST_SLO_R.create("T")), sloL);
		_sloListKey = _cacheSloList.createIndex(MST_SLO_R.$slo_no);
	}

	protected void _initSloDCache(MCRow hdr) {
		_cacheSloDL = MCList.create(MST_SLO_D_R.class);
		_cacheSloDL_t = MST_SLO_D_R.create("T");
		_cacheSloDL_bldr = MCQueryApiBuilder.create(_cacheSloDL_t);
		_cacheSloDL_bldr.setWhere(_cacheSloDL_t.slo_no.eq(bind("1")), hdr.getString("slo_no"));
		_cacheSloDL_bldr.addWhereWithAnd(_cacheSloDL_t.can_flg.eq(value(false)));
		dbSelectForUpdate("MSBBL6020_MST_SLO_D_S01", _cacheSloDL, _cacheSloDL_bldr);
		_sloDKey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
	}

	protected void _initShipPrCache(MCList<? extends MCRow> dL) {
		MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
		for (MCRow r : dL) {
			if (!isNull(r.getString("ship_pr_no"))) {
				MST_SHIP_PR_R bindR = MST_SHIP_PR_R.create();
				bindR.ship_pr_no(r.getString("ship_pr_no"));
				shipPrL.add(bindR);
			}
		}
		if (!shipPrL.isEmpty()) {
			_cacheShipPrL = MCList.create(MST_SHIP_PR_R.class);
			dbSelectKeyForUpdateNoWait("MSBBL6020_MST_SHIP_PR_S01", _cacheShipPrL,
					MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T")), shipPrL);
			_shipPrKey = _cacheShipPrL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
		}
	}
	
	protected void _initUpd04ShipPrCache(MCList<Slo_Upd02_SloR> sloL) {
		_cacheUpd04ShipPrL = MCList.create(MST_SHIP_PR_R.class);
		MST_SHIP_PR_R cacheUpd04ShipPrL_t = MST_SHIP_PR_R.create("T");
		MCQueryApiBuilder cacheUpd04ShipPrL_bldr = MCQueryApiBuilder.create(cacheUpd04ShipPrL_t);
		MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
		cacheUpd04ShipPrL_bldr.addSelect(t1.slo_no);
		cacheUpd04ShipPrL_bldr.addInnerJoin(t1, bracket(cacheUpd04ShipPrL_t.slo_d_no.eq(t1.slo_d_no)));
		cacheUpd04ShipPrL_bldr.setWhere(t1.slo_no.eq(bind("slo_no")));	
		cacheUpd04ShipPrL_bldr.setLockTable(cacheUpd04ShipPrL_t.ship_pr_no);
		dbSelectForUpdate("MSBBL6020_MST_SHIP_PR_S02", _cacheUpd04ShipPrL, cacheUpd04ShipPrL_bldr, sloL);
	}

	protected void _initShipSchdCache(MCList<? extends MCRow> dL) {
		MCList<Slo_Upd01_DtlR> bindL = MCList.create(Slo_Upd01_DtlR.class);
		for (MCRow dtlR : dL) {
			if (!isNull(dtlR.getString("ship_pr_no"))) {
				Slo_Upd01_DtlR bindR = Slo_Upd01_DtlR.create();
				bindR.ship_pr_no(dtlR.getString("ship_pr_no"));
				bindL.add(bindR);
			}
		}
		if (!bindL.isEmpty()) {
			_cacheShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R cacheShipSchdL_t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder cacheShipSchdL_bldr = MCQueryApiBuilder.create(cacheShipSchdL_t);
			cacheShipSchdL_bldr.setWhere(cacheShipSchdL_t.ship_pr_no.eq(bind("ship_pr_no")));
			dbSelect("MSBBL6020_MST_SHIP_SCHD_S01", _cacheShipSchdL, cacheShipSchdL_bldr, bindL);
			_shipSchdKey = _cacheShipSchdL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
		}
	}
	
	protected void _initUpd04ShipSchdCache(MCList<Slo_Upd02_SloR> sloL) {
		_cacheUpd04ShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R cacheUpd04ShipSchdL_t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder cacheUpd04ShipSchdL_bldr = MCQueryApiBuilder.create(cacheUpd04ShipSchdL_t);
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
		cacheUpd04ShipSchdL_bldr.addSelect(t2.slo_no);
		cacheUpd04ShipSchdL_bldr.addInnerJoin(t1,
				bracket(cacheUpd04ShipSchdL_t.ship_pr_no.eq(t1.ship_pr_no)));
		cacheUpd04ShipSchdL_bldr.addInnerJoin(t2, bracket(t1.slo_d_no.eq(t2.slo_d_no)));
		cacheUpd04ShipSchdL_bldr.setWhere(t2.slo_no.eq(bind("slo_no")));
		cacheUpd04ShipSchdL_bldr
				.addWhereWithAnd(cacheUpd04ShipSchdL_t.abort_flg.eq(value(false)));
		dbSelect("MSBBL6020_MST_SHIP_SCHD_S02", _cacheUpd04ShipSchdL, cacheUpd04ShipSchdL_bldr, sloL);
	}

	protected void _initShipAlocCache(MCList<Slo_Upd01_DtlR> dL) {
		MCList<Slo_Upd01_DtlR> bindL = MCList.create(Slo_Upd01_DtlR.class);
		for (Slo_Upd01_DtlR dtlR : dL) {
			if (!isNull(dtlR.ship_pr_no())) {
				bindL.add(dtlR);
			}
		}
		if (!bindL.isEmpty()) {
			_cacheShipAlocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R cacheShipAlocStsL_t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder cacheShipAlocStsL_bldr = MCQueryApiBuilder.create(cacheShipAlocStsL_t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			cacheShipAlocStsL_bldr.addInnerJoin(t1,
					bracket(cacheShipAlocStsL_t.ship_schd_no.eq(t1.ship_schd_no)));
			cacheShipAlocStsL_bldr.addSelect(t1.ship_pr_no);
			cacheShipAlocStsL_bldr.setWhere(t1.ship_pr_no.eq(bind("ship_pr_no")));
			dbSelect("MSBBL6020_MST_SHIP_ALLOC_STS_S01", _cacheShipAlocStsL, cacheShipAlocStsL_bldr, bindL);
		}
	}
	protected void _initSloAllocGdCache(MCList<Slo_Upd01_HdrR> sloL) {
		_cacheSloAllocGdL = MCList.create(MAM_SLO_ALLOC_GD_R.class);
		MAM_SLO_ALLOC_GD_R cacheSloAllocGdL_t = MAM_SLO_ALLOC_GD_R.create("T");
		MCQueryApiBuilder cacheSloAllocGdL_bldr = MCQueryApiBuilder.create(cacheSloAllocGdL_t);
		cacheSloAllocGdL_bldr.setWhere(cacheSloAllocGdL_t.cst_cd.eq(bind("cst_cd")));
		dbSelect("MSBBL6020_MAM_SLO_ALLOC_GD_S01", _cacheSloAllocGdL, cacheSloAllocGdL_bldr, sloL);
		_sloAllocGdKey = _cacheSloAllocGdL.createIndex(MAM_SLO_ALLOC_GD_R.$cst_cd,
				MAM_SLO_ALLOC_GD_R.$dlv_cd, MAM_SLO_ALLOC_GD_R.$gd_cd);
	}

	protected void _initLotSublotCache(MCList<Slo_Upd01_DtlR> dL) {
		_cacheLotSublotL = MCList.create(MSVT_LOT_LIST_R.class);
		MSVT_LOT_LIST_R cacheLotSublotL_t = MSVT_LOT_LIST_R.create("T");
		MCQueryApiBuilder cacheLotSublotL_bldr = MCQueryApiBuilder.create(cacheLotSublotL_t);
		cacheLotSublotL_bldr.setWhere(cacheLotSublotL_t.itm_cd.eq(bind("itm_cd")));
		cacheLotSublotL_bldr.addWhereWithAnd(cacheLotSublotL_t.itm_sub1.eq(bind("itm_sub1")));
		cacheLotSublotL_bldr.addWhereWithAnd(cacheLotSublotL_t.itm_sub2.eq(bind("itm_sub2")));
		cacheLotSublotL_bldr.addWhereWithAnd(cacheLotSublotL_t.itm_sub3.eq(bind("itm_sub3")));
		cacheLotSublotL_bldr.addWhereWithAnd(cacheLotSublotL_t.lot_no.eq(bind("lot_no")));
		cacheLotSublotL_bldr.addWhereWithAnd(cacheLotSublotL_t.sublot_no.eq(bind("sublot_no")));
		dbSelect("MSBBL6020_MSVT_LOT_LIST_S01", _cacheLotSublotL, cacheLotSublotL_bldr, 
				dL.distinctNE(MSVT_LOT_LIST_R.$itm_cd, MSVT_LOT_LIST_R.$itm_sub1, MSVT_LOT_LIST_R.$itm_sub2, 
						MSVT_LOT_LIST_R.$itm_sub3,MSVT_LOT_LIST_R.$lot_no, MSVT_LOT_LIST_R.$sublot_no));
		_lotSublotKey = _cacheLotSublotL.createIndex(MSVT_LOT_LIST_R.$itm_cd,MSVT_LOT_LIST_R.$itm_sub1, MSVT_LOT_LIST_R.$itm_sub2, 
				MSVT_LOT_LIST_R.$itm_sub3, MSVT_LOT_LIST_R.$lot_no, MSVT_LOT_LIST_R.$sublot_no);
	}
	
	protected static void initQtnCache(MCList<? extends MCRow> sloL) {
		object(CLAZZ)._initQtnCache(sloL);
	}
	
	protected void _initQtnCache(MCList<? extends MCRow> sloL) {
		_cacheQtnList = MCList.create(MST_QTN_R.class);
		dbSelectKeyForUpdate("MSBBL6020_MST_QTN_S01", _cacheQtnList, 
				MCQueryApiBuilder.create(MST_QTN_R.create("T")), sloL);
		_qtnIdKey = _cacheQtnList.createIndex(MST_QTN_R.$qtn_no, MST_QTN_R.$qtn_rev);
	}
	
	protected static MST_QTN_R getQtnCache(String qtnNo, MCNumber qtnRev) {
		return object(CLAZZ)._getQtnCache(qtnNo, qtnRev);
	}	
	
	protected MST_QTN_R _getQtnCache(String qtnNo, MCNumber qtnRev) {
		return _cacheQtnList.getFirst(_qtnIdKey, qtnNo, qtnRev);
	}
	protected static void initLgCtlCache(MCList<Slo_Upd01_DtlR> sloL) {
		object(CLAZZ)._initLgCtlCache(sloL);
	}
	
	protected void _initLgCtlCache(MCList<Slo_Upd01_DtlR> sloL) {
		_cacheLgCtlList = MCList.create(MAM_LG_CTL_R.class);
		MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder lgCtlR_bldr = MCQueryApiBuilder.create(lgCtlR);
		MCList<Slo_Upd01_DtlR> dtlL = MCList.create(Slo_Upd01_DtlR.class);
		for (Slo_Upd01_DtlR r : sloL) {
			Slo_Upd01_DtlR dtlR = setLgGrpCd(r);
			dtlR.ship_term_cd(r.ship_term_cd());
			dtlL.add(dtlR);
		}
		lgCtlR_bldr.setSelect(lgCtlR.fr_lg_grp_cd, lgCtlR.to_lg_grp_cd,
				lgCtlR.ship_term_cd);
		lgCtlR_bldr.setWhere(lgCtlR.fr_lg_grp_cd.eq(bind("ship_lg_grp_cd"))
				.and(lgCtlR.to_lg_grp_cd.eq(bind("dlv_lg_grp_cd")))
				.and(lgCtlR.ship_term_cd.eq(bind("ship_term_cd"))
						.or(lgCtlR.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))));
		dbSelect("MSBBL6020_MAM_LG_CTL_S02", _cacheLgCtlList, lgCtlR_bldr, dtlL);

		_lgCtlIdKey = _cacheLgCtlList.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd,
				MAM_LG_CTL_R.$to_lg_grp_cd, MAM_LG_CTL_R.$ship_term_cd);
	}

	protected static MAM_LG_CTL_R getLgCtlCache(String frLgGrpCd, String toLgGrpCd,
			String shipTermCd) {
		return object(CLAZZ)._getLgCtlCache(frLgGrpCd, toLgGrpCd, shipTermCd);
	}

	protected MAM_LG_CTL_R _getLgCtlCache(String frLgGrpCd, String toLgGrpCd,
			String shipTermCd) {
		MAM_LG_CTL_R result = MAM_LG_CTL_R.create();
		result = _cacheLgCtlList.getFirst(_lgCtlIdKey, frLgGrpCd, toLgGrpCd, shipTermCd);
		if (isNull(result)) {
			result = _cacheLgCtlList.getFirst(_lgCtlIdKey, frLgGrpCd, toLgGrpCd,
					MAC_STR.NULL_VAL.value());
		}
		return result;
	}

	protected Slo_Upd01_DtlR setLgGrpCd(Slo_Upd01_DtlR r) {
		Slo_Upd01_DtlR dtlR = Slo_Upd01_DtlR.create();
		if (!isNull(r.tdlv_cd())) {
			dtlR.dlv_lg_grp_cd(r.tdlv_lg_grp_cd());
		}
		else {
			dtlR.dlv_lg_grp_cd(r.dlv_lg_grp_cd());
		}

		//出荷元物流グループＣＤ
		if (isNull(r.ship_lg_grp_cd())) {
			MAM_LOC_R locR = getLoc(nvl(r.loc_cd(), r.def_loc_cd()));
			dtlR.ship_lg_grp_cd(locR.lg_grp_cd());
		}
		else {
			dtlR.ship_lg_grp_cd(r.ship_lg_grp_cd());
		}
		return dtlR;
	}
	protected static MST_SLO_R getSloCache(MCRow hdr) {
		return object(CLAZZ)._getSloCache(hdr);
	}	

	protected MST_SLO_R _getSloCache(MCRow hdr) {
		if (_cacheSloR == null) {
			initSloCache(hdr);
		}
		return _cacheSloR;
	}
	
	protected static MCList<MST_SLO_R> getUpd04SloCache(MCList<Slo_Upd02_SloR> sloL) {
		return object(CLAZZ)._getUpd04SloCache(sloL);
	}	
	
	protected MCList<MST_SLO_R> _getUpd04SloCache(MCList<Slo_Upd02_SloR> sloL) {
		if (_cacheSloList == null) {
			initUpd04SloCache(sloL);
		}
		return _cacheSloList;
	}
	
	protected static MST_SLO_R getFirstUpd04SloCache(String sloNo) {
		return object(CLAZZ)._getFirstUpd04SloCache(sloNo);
	}	
	
	protected MST_SLO_R _getFirstUpd04SloCache(String sloNo) {
		return _cacheSloList.getFirst(_sloListKey, sloNo);		
	}
	
		
	protected static MCList<MST_SLO_D_R> getSloDCache(MCRow hdr) {
		return object(CLAZZ)._getSloDCache(hdr);
	}

	protected MCList<MST_SLO_D_R> _getSloDCache(MCRow hdr) {
		if (_cacheSloDL == null) {
			initSloDCache(hdr);
		}
		return _cacheSloDL;
	}	
	
	protected static MST_SLO_D_R getFirstSloDCache(String sloDNo) {		
		return object(CLAZZ)._getFirstSloDCache(sloDNo);
	}	
	
	protected MST_SLO_D_R _getFirstSloDCache(String sloDNo) {		
		return _cacheSloDL.getFirst(_sloDKey, sloDNo);
	}
	
	protected static MST_SHIP_PR_R getFirstShipPrCache(String shipPr) {
		return object(CLAZZ)._getFirstShipPrCache(shipPr);
	}

	protected MST_SHIP_PR_R _getFirstShipPrCache(String shipPr) {		
		return _cacheShipPrL.getFirst(_shipPrKey, shipPr);
	}
	
	protected static MCList<MST_SHIP_SCHD_R> subListShipSchdCache(String shipPr) {
		return object(CLAZZ)._subListShipSchdCache(shipPr);
	}

	protected MCList<MST_SHIP_SCHD_R> _subListShipSchdCache(String shipPr) {		
		return _cacheShipSchdL.subList(_shipSchdKey, shipPr);
	}
	
	protected static MCList<MST_SHIP_PR_R> getUpd04ShipPrCache(MCList<Slo_Upd02_SloR> sloL) {
		return object(CLAZZ)._getUpd04ShipPrCache(sloL);
	}

	protected MCList<MST_SHIP_PR_R> _getUpd04ShipPrCache(MCList<Slo_Upd02_SloR> sloL) {
		if (_cacheUpd04ShipPrL == null) {
			initUpd04ShipPrCache(sloL);
		}
		return _cacheUpd04ShipPrL;
	}
	
	protected static MCList<MST_SHIP_SCHD_R> getShipSchdCache(MCList<? extends MCRow> dL) {
		return object(CLAZZ)._getShipSchdCache(dL);
	}

	protected MCList<MST_SHIP_SCHD_R> _getShipSchdCache(MCList<? extends MCRow> dL) {
		if (_cacheShipSchdL == null) {
			initShipSchdCache(dL);
		}
		return _cacheShipSchdL;
	}
	
	protected static MCList<MST_SHIP_SCHD_R> getUpd04ShipSchdCache(MCList<Slo_Upd02_SloR> sloL) {
		return object(CLAZZ)._getUpd04ShipSchdCache(sloL);
	}

	protected MCList<MST_SHIP_SCHD_R> _getUpd04ShipSchdCache(MCList<Slo_Upd02_SloR> sloL) {
		if (_cacheUpd04ShipSchdL == null) {
			initUpd04ShipSchdCache(sloL);
		}
		return _cacheUpd04ShipSchdL;
	}
	
	protected static MCList<MST_SHIP_ALLOC_STS_R> getShipAlocCache(
			MCList<Slo_Upd01_DtlR> dL) {
		return object(CLAZZ)._getShipAlocCache(dL);
	}

	protected MCList<MST_SHIP_ALLOC_STS_R> _getShipAlocCache(
			MCList<Slo_Upd01_DtlR> dL) {
		if (_cacheShipAlocStsL == null) {
			initShipAlocCache(dL);
		}
		return _cacheShipAlocStsL;
	}
	protected static MAM_SLO_ALLOC_GD_R getSloAllocGdCache(
			String... bind) {
		return object(CLAZZ)._getSloAllocGdCache(bind);
	}

	protected MAM_SLO_ALLOC_GD_R _getSloAllocGdCache(String... bind) {
		return _cacheSloAllocGdL.getFirst(_sloAllocGdKey, bind);
	}

	protected static MSVT_LOT_LIST_R getLotSublotCache(String... bind) {
		return object(CLAZZ)._getLotSublotCache(bind);
	}

	protected MSVT_LOT_LIST_R _getLotSublotCache(String... bind) {
		return _cacheLotSublotL.getFirst(_lotSublotKey, bind);
	}

	protected FXUCL_MCDbcCache<MAM_BP_R> _bpR;
	
	protected static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}
	
	protected MAM_BP_R _getBp(String bpCd) {
		if (_bpR == null) {
			_bpR = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
		}
		return _bpR.get(bpCd);
	}
	
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmR;
	
	protected static MAM_ITM_R getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItm(itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	protected MAM_ITM_R _getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		if (_itmR == null) {
			_itmR = new FXUCL_MCDbcCache<MAM_ITM_R>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")));
		}
		return _itmR.get(itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	protected FXUCL_MCDbcCache<MAM_CUR_R> _curR;
	
	protected static MAM_CUR_R getCur(String curCd) {
		return object(CLAZZ)._getCur(curCd);
	}
	
	protected MAM_CUR_R _getCur(String curCd) {
		if (_curR == null) {
			_curR = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
		}
		return _curR.get(curCd);
	}
	
	/** 場所マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locR;
	/**
	 * 場所ＣＤから場所マスタ情報を取得する。
	 * 
	 * @param locCd
	 */
	protected static MAM_LOC_R getLoc(String locCd) {
		return object(CLAZZ)._getLoc(locCd);
	}
	
	protected MAM_LOC_R _getLoc(String locCd) {
		if (_locR == null) {
			_locR = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
		}
		return _locR.get(locCd);
	}

	/** 物流グループマスタ取得 */
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _lgGrpR;
	/**
	 * 物流グループＣＤから物流グループマスタ情報を取得する。
	 * 
	 * @param lgGrpCd
	 */
	protected static MAM_LG_GRP_R getLgGrp(String lgGrpCd) {
		return object(CLAZZ)._getLgGrp(lgGrpCd);
	}
	
	protected MAM_LG_GRP_R _getLgGrp(String lgGrpCd) {
		if (_lgGrpR == null) {
			_lgGrpR = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(MCQueryApiBuilder.create(MAM_LG_GRP_R.create("T")));
		}
		return _lgGrpR.get(lgGrpCd);
	}
	
	/** 総量引当場所グループマスタ取得 */
	protected FXUCL_MCDbcCache<MAM_ALLOC_GRP_R> _allocGrpR;
	/**
	 * 総量引当場所グループＣＤから総量引当場所グループマスタ情報を取得する。
	 * 
	 * @param allocGrpCd
	 */
	protected static MAM_ALLOC_GRP_R getAllocGrp(String allocGrpCd) {
		return object(CLAZZ)._getAllocGrp(allocGrpCd);
	}
	
	protected MAM_ALLOC_GRP_R _getAllocGrp(String allocGrpCd) {
		if (_allocGrpR == null) {
			_allocGrpR = new FXUCL_MCDbcCache<MAM_ALLOC_GRP_R>(MCQueryApiBuilder.create(MAM_ALLOC_GRP_R.create("T")));
		}
		return _allocGrpR.get(allocGrpCd);
	}
	
	protected MCList<MST_SLO_R> _cacheMultiSloL = null;
	
	protected MCList<MST_SLO_D_R> _cacheMultiSloDL = null;
	
	protected MCIndexKey _multiSloKey = null;
	
	protected MCIndexKey _multiSloDKey = null;
	
	protected MCIndexKey _multiSloDFirstKey = null;
	
	protected static void initMultiSloCache(MCList<? extends MCRow> sloL) {
		object(CLAZZ)._initMultiSloCache(sloL);
	}
	protected void _initMultiSloCache(MCList<? extends MCRow> sloL) {
		
		_cacheMultiSloL = MCList.create(MST_SLO_R.class);
		dbSelectKeyForUpdateNoWait("MSBBL6020_MST_SLO_S03", _cacheMultiSloL,
				MCQueryApiBuilder.create(MST_SLO_R.create("T")), sloL);

		_multiSloKey = _cacheMultiSloL.createIndex(MST_SLO_R.$slo_no);
	}
	
	protected static MCList<MST_SLO_R> getMultiAllSloCache() {
		return object(CLAZZ)._getMultiAllSloCache();
	}	

	protected MCList<MST_SLO_R> _getMultiAllSloCache() {
		
		return _cacheMultiSloL;
	}
	
	protected static MST_SLO_R getMultiSloCache(MCRow hdrR) {
		return object(CLAZZ)._getMultiSloCache(hdrR);
	}	

	protected MST_SLO_R _getMultiSloCache(MCRow hdrR) {
		
		_cacheSloR = _cacheMultiSloL.getFirst(_multiSloKey, hdrR.getStringNE("slo_no"));
		return _cacheSloR;
	}
	
	protected static void initMultiSloDCache(MCList<? extends MCRow> sloL) {
		object(CLAZZ)._initMultiSloDCache(sloL);
	}
	protected void _initMultiSloDCache(MCList<? extends MCRow> sloL) {
		
		_cacheMultiSloDL = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R cacheMultiSloDL_t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder cacheMultiSloDL_bldr = MCQueryApiBuilder.create(cacheMultiSloDL_t);
		cacheMultiSloDL_bldr.addConstWhereWithAnd(cacheMultiSloDL_t.can_flg.eq(value(false)));

		dbSelectColumnForUpdate("MSBBL6020_MST_SLO_D_S02", _cacheMultiSloDL, cacheMultiSloDL_bldr, MST_SLO_D_R.$slo_no, sloL, "slo_no");
		
		_multiSloDKey = _cacheMultiSloDL.createIndex(MST_SLO_D_R.$slo_no);
		_multiSloDFirstKey = _cacheMultiSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
	}
	
	protected static MCList<MST_SLO_D_R> getMultiSloDCache(MCRow hdrR) {
		return object(CLAZZ)._getMultiSloDCache(hdrR);
	}

	protected MCList<MST_SLO_D_R> _getMultiSloDCache(MCRow hdrR) {
		_cacheSloDL = _cacheMultiSloDL.subList(_multiSloDKey, hdrR.getStringNE("slo_no"));
		_sloDKey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
		
		return _cacheSloDL;
	}
	
	protected static MST_SLO_D_R getMultiFirstSloDCache(String sloDNo) {		
		return object(CLAZZ)._getMultiFirstSloDCache(sloDNo);
	}	
	
	protected MST_SLO_D_R _getMultiFirstSloDCache(String sloDNo) {	
		return _cacheMultiSloDL.getFirst(_multiSloDFirstKey, sloDNo);
	}
	
	/**
	 * Slo_Chk01オペレーション.<p>
	 *
	 */
	public class Slo_Chk01 extends MSBBL_SloRegService_MC_A.Slo_Chk01 {
		
		/**
		 * 上り電文（受注）のインデックス
		 */
		protected MCIndexKey _up0Idxkey = null;
		
		/**
		 * 上り電文（受注明細）のインデックス
		 */
		protected MCIndexKey _up1Idxkey = null;
		
		/**
		 * 更新カウンタチェックエラー
		 */
		protected boolean _updCntrErr = false;
		
		/**
		 * 取引先禁止マスタ
		 */
		protected MCList<MAM_BP_STOP_R> bpStopL = null;
		
		/**
		 * 品目禁止マスタ
		 */
		protected MCList<MAM_ITM_STOP_R> itmStopL = null;
		
		/**
		 * 輸出規制マスタ
		 */
		protected MCList<MAM_EX_CTRL_R> exCtrL = null;
		
		/**
		 * 引当禁止ロット情報
		 */
		protected MCList<MST_ALLOC_STOP_LOT_R> allocStopLotL = null;
		
		/**
		 * 見積ヘッダリスト（更新用）
		 */
		protected MCList<MST_QTN_R> _updQtnL = null;
		
		/**
		 * 見積明細リスト
		 */
		protected MCList<MST_QTN_D_R> _qtnDL = null;
		
		
		/**
		 * 見積明細のインデックス
		 */
		protected MCIndexKey _qtnDIdxkey = null;
		
		/**
		 * 案件手配紐付情報リスト
		 */
		protected MCList<MST_WRK_SNO_R> _wrkSnoL = null;
		
		/**
		 * 案件手配紐付情報のインデックス
		 */
		protected MCIndexKey _wrkSnoIdxkey = null;
		
		/**
		 * 品目詳細マスタのインデックス（依頼先場所）
		 */
		protected MCIndexKey _itmDtlLocIdxkey = null;
		
		/**
		 * 物流制御マスタリスト
		 */
		protected MCList<MAM_LG_CTL_R> _lgCtlL = null;
		
		/**
		 * 物流制御マスタのインデックス
		 */
		protected MCIndexKey _lgCtlIdxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			
			// リストロジックチェック時に、使用するため、ヘッダの受注日を明細にコピーする。
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				MCList<Slo_Upd01_DtlR> dtlL = getAllDtlByHdrPegNo(hdrR.peg_no());
				
				if (!isNull(dtlL)) {
					dtlL.setValueNE(Slo_Upd01_DtlR.$slo_dt, hdrR.slo_dt());
				}
			}
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callOtherRegUpdChkSrv();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			initMultiSloCache(up0());
			initMultiSloDCache(up0());
			initShipPrCache(up1());
			initShipSchdCache(up1());
			initShipAlocCache(up1());
			initSloAllocGdCache(up0());
			initWgRqstCache(up1());
			initQtnCache(up0());

			MCList<Slo_Upd01_DtlR> uplotSublotL = up1().clone();
			for (Slo_Upd01_DtlR r : uplotSublotL) {
				if (isNull(r.lot_no())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sublot_no())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
			initLotSublotCache(uplotSublotL);
			
			MCIndexKey idx = up1().createIndex(Slo_Upd01_DtlR.$hdr_peg_no);
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				_cacheSloR = getMultiSloCache(hdrR);
				_cacheSloDL = getMultiSloDCache(hdrR);
				
				MCList<Slo_Upd01_DtlR> dtlL = up1().subList(idx, hdrR.peg_no());
				
				for (Slo_Upd01_DtlR dtlR : dtlL) {
					if(dtlR.isStatusDelete()) {
						msgL.addAll(chkItm(dtlR));
					}
				}
				
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					msgL.addAll(chkItmDtl(dtlL));
				}
				if (!msgL.isEmpty()) {
					_updCntrErr = true;
				}
				
				//見積ヘッダのロック、更新カウンタチェック、空更新
				if (!isNull(hdrR.qtn_no())) {
					msgL.addAll(chkQtn(hdrR));
				}
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {

					//受注ヘッダのロック、更新カウンタチェック、空更新、インボイス取引ＦＬＧの値の補完				
					msgL.addAll(chkSlo(hdrR));
					//出荷進捗の排他処理を行う。
					msgL.addAll(chkShipPr(hdrR));
				}
			}
			
			updQtn();
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			
			MCMessageList msgL =  super.doServerCheck();
			
			if (!_updCntrErr) {
				
				for (Slo_Upd01_HdrR hdrR : up0()) {
					
					_cacheSloR = getMultiSloCache(hdrR);
					_cacheSloDL = getMultiSloDCache(hdrR);
					
					//受注明細の項目値の補完
					crretSloD(hdrR);
					// 後続業務が登録されているかつ備考、予備のみ更新する場合、フラグをキャッシュに保持し、チェック処理をスッキプする
					setOnlyUpdTrnstRmrksFlg(hdrR);
					
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (_updCntrErr) {
				return msgL;
			}
			
			_cacheShipSchdL = getShipSchdCache(up1());
			MCList<Slo_Upd01_HdrR> noErrHdrList = getChkList(up0());
			MSUCL_SlsUtil.SrchSloAlloc srchSloAlloc = MSUCL_SlsUtil.crtSrchSloAlloc(noErrHdrList);
			getItmDtl(up1());
			getLgCtl(up1());
			MCList<Slo_Upd01_DtlR> chkDtlList = MCList.create(Slo_Upd01_DtlR.class);
			for (Slo_Upd01_HdrR hdrR : noErrHdrList) {
				
				_cacheSloR = getMultiSloCache(hdrR);
				_cacheSloDL = getMultiSloDCache(hdrR);
				
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && !isSame(_cacheSloR.sls_dpt_cd(), hdrR.sls_dpt_cd())) {
					// 変更前の売上部門に対して、ＤＡＣチェックを行う。
					if (!hdrR.is_src_batch_flg()) {
						// バッチから実行した場合に、ＤＡＣの更新権限チェックを行わない
						msgL.addAll(checkWritableDptCdDac(_cacheSloR, MST_SLO_R.$sls_dpt_cd));
					}
				}
				
				// DACチェック
				if (!hdrR.is_src_batch_flg()) {
					// バッチから実行した場合に、ＤＡＣの更新権限チェックを行わない
					msgL.addAll(checkWritableDptCdDac(hdrR, Slo_Upd01_HdrR.$sls_dpt_cd));
				}
				msgL.addAll(checkAtLeastOneDtl(hdrR, getAllDtlByHdrPegNo(hdrR.peg_no())));
				msgL.addAll(setAllocTyp(hdrR, srchSloAlloc));
				
				chkDtlList.addAll(getChkList(getDtlByHdrPegNo(hdrR.peg_no())));
			}
			if (!noErrHdrList.isEmpty()) {
				// メッセージプールのメッセージを退避
				MCMessageList mL = (MCMessageList)MCMessagePool.getMessageList().clone();
				callShipSchdDtService(noErrHdrList, chkDtlList);
				// 退避していたメッセージを戻す（サービスで追加されたメッセージを無視するため）
				MCMessagePool.clear();
				MCMessagePool.addAll(mL);
				//有効期限チェック、ロット逆転チェック
				checkLotLimitRevise(noErrHdrList, chkDtlList);
				
				//出荷予定チェック
				chkShipSchd(noErrHdrList);
				setDefStrLnCd(noErrHdrList);
				
				msgL.addAll(chkModifiableByAbort(noErrHdrList, removeRmrksSubUpdRows(up1())));
			}

			initLgCtlCache(up1());
			callPlntAprvSrv(removeRmrksSubUpdRows(up1()));
			relDecChk(removeRmrksSubUpdRows(up1()));
			
			getWrkSnoCache(removeRmrksSubUpdRows(up1()));
			
			for (Slo_Upd01_DtlR r : removeRmrksSubUpdRows(up1())) {
				if (!isNull(r.sppl_cd()) && isNull(r.maker_cd())) {
					r.maker_cd(MAC_STR.NULL_VAL.value());
				}
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				if (r.not_dt_calc_flg()
						&& !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					Slo_Upd01_DtlR dtlR = setLgGrpCd(r);
					MAM_LG_CTL_R lgCtlR = getLgCtlCache(dtlR.ship_lg_grp_cd(), dtlR.dlv_lg_grp_cd(), r.ship_term_cd());
					if (isNull(lgCtlR)) {
						msgL.add(new MCMessage(r, null, MSBEL0155, dtlR.dlv_lg_grp_cd(),
								dtlR.ship_lg_grp_cd(), r.ship_term_cd()));
					}
				}
				String[] cols = new String []{Slo_Upd01_DtlR.$rqst_to_loc_cd, Slo_Upd01_DtlR.$sppl_cd};
				msgL.addAll(check(r, cols, new MAUDL_TooManyInputsValidater_NULL_VAL()));
				//依頼先WG_CDを補完する。
				setRqstToWgCd(r);
				//存在チェック
				//依頼先場所ＣＤ
				if (!isNull(r.rqst_to_loc_cd())){
					msgL.addAll(chkRqstToLocCd(r));
				}				
				//発注先ＣＤ、メーカＣＤ
				if (!isNull(r.sppl_cd())){
					msgL.addAll(chkSpplCdMakerCd(r));
				}
				msgL.addAll(setSpplCd(r));
				// 手配ＮＯ必須・存在・発番チェック
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					msgL.addAll(chkSno(r));
				}
				if(r.ver_flg()) {
					msgL.addAll(check(r, Slo_Upd01_DtlR.$ver_no, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.trd_cur_upri())) {
					if (r.trd_cur_upri().isZero() && isNull(r.sls_rsn_cd())) {
						msgL.add(new MCMessage(r, Slo_Upd01_DtlR.$sls_rsn_cd, MSBBL0293, toDispGUIIndex(r)));
					}
				}
			}
			//固有エラーチェック
			msgL.addAll(chkOther());
			return msgL;
		}	
		

		/**
		 * 工場出荷承認チェック
		 */
		protected void callPlntAprvSrv(MCList<Slo_Upd01_DtlR> dL) {

			MCList<PlntAprv_Chk02_RsltR> lst = MCList.create(PlntAprv_Chk02_RsltR.class);
			for (Slo_Upd01_DtlR dtlR : dL) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					if (!isNull(dtlR.lot_no())) {
						PlntAprv_Chk02_RsltR r = PlntAprv_Chk02_RsltR.create();
						r.peg_no(dtlR.peg_no());
						r.itm_cd(dtlR.itm_cd());
						r.itm_sub1(dtlR.itm_sub1());
						r.itm_sub2(dtlR.itm_sub2());
						r.itm_sub3(dtlR.itm_sub3());
						r.lot_no(dtlR.lot_no());
						r.sublot_no(dtlR.sublot_no());
						r.pre_inst_flg(true);
						lst.add(r);
					}
				}
			}
			if (!lst.isEmpty()) {
				MSBFL_PlntAprvService.PlntAprv_Chk02 op = MSBFL_PlntAprvService.crtPlntAprv_Chk02();
				op.up0().setAll(lst);
				op.exec();
				if (!isNull(op.down0())) {
					copyErrFlg(up1(), op.down0());
				}
			}		
		}
		
		/**
		 * 市場出荷判定チェック
		 */
		protected void relDecChk(MCList<Slo_Upd01_DtlR> dL) {

			MCList<MrktJudg_Chk02_RsltR> lst = MCList.create(MrktJudg_Chk02_RsltR.class);
			for (Slo_Upd01_DtlR dtlR : dL) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					if (!isNull(dtlR.lot_no())) {
						MrktJudg_Chk02_RsltR r = MrktJudg_Chk02_RsltR.create();
						r.peg_no(dtlR.peg_no());
						r.itm_cd(dtlR.itm_cd());
						r.itm_sub1(dtlR.itm_sub1());
						r.itm_sub2(dtlR.itm_sub2());
						r.itm_sub3(dtlR.itm_sub3());
						r.lot_no(dtlR.lot_no());
						r.pre_inst_flg(true);
						lst.add(r);
					}
				}
			}
			if (!lst.isEmpty()) {
				MSBFL_MrktJudgService.MrktJudg_Chk02 op = MSBFL_MrktJudgService.crtMrktJudg_Chk02();
				op.up0().setAll(lst);
				op.exec();
				if (!isNull(op.down0())) {
					copyErrFlg(up1(), op.down0());
				}
			}		
		}

		/**
		 * 手配ＮＯチェックを行う。<br>
		 *  手配ＮＯ必須チェック<br>
		 *  手配ＮＯ存在チェック<br>
		 *  手配ＮＯ発番チェック
		 *  
		 * @param dtlR 受注明細
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList chkSno(Slo_Upd01_DtlR dtlR) {
			
			MCMessageList msgL = new MCMessageList();
			
			Slo_Upd01_HdrR hdrR = getHdrByPegNo(dtlR.hdr_peg_no());
			
			if (!isNull(hdrR.wrk_no())) {
				// 手配ＮＯ必須チェック
				if (isNullOrNullVal(dtlR.sno1()) && (!dtlR.sno_num_flg() || MAC_SNO_NO_TYP.isMANUAL(dtlR.sno1_num_typ()))) {
					msgL.add(new MCMessage(dtlR, Slo_Upd01_DtlR.$sno1, MSBBL0016, toDispGUIIndex(dtlR)));
				}
				
				if (!dtlR.sno_num_flg() || !MAC_SNO_NO_TYP.isAUTO(dtlR.sno1_num_typ())) {
					// 自動発番の場合は、手配ＮＯが発番されるため、チェックしない
					
					// 手配ＮＯ存在チェック
					MST_WRK_SNO_R wrkSnoR = getWrkSno(dtlR.sno1());
					
					if (!isNull(wrkSnoR) && !isSame(hdrR.wrk_no(), wrkSnoR.wrk_no())) {
						msgL.add(new MCMessage(dtlR,
								Slo_Upd01_DtlR.$sno1, 
								MSBBL0017, 
								dtlR.sno1(),
								wrkSnoR.wrk_no(),
								toDispGUIIndex(dtlR)));
					}
				}
			}
			
			// 手配ＮＯ発番チェック
			// 手配ＮＯ管理区分：必須　手配ＮＯ発番区分：手動　の場合必須
			// 手配ＮＯ1
			if (dtlR.slo_sno1_flg() && MAC_SNO_NO_TYP.isMANUAL(dtlR.sno1_num_typ()) && isNullOrNullVal(dtlR.sno1())) {
				dtlR.sno1(null);
				msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sno1, new FXUCL_RequiredValidater()));
			}
			// 手配ＮＯ2
			if (dtlR.slo_sno2_flg() && MAC_SNO_NO_TYP.isMANUAL(dtlR.sno2_num_typ()) && isNullOrNullVal(dtlR.sno2())) {
				dtlR.sno2(null);
				msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sno2, new FXUCL_RequiredValidater()));
			}
			// 手配ＮＯ3
			if (dtlR.slo_sno3_flg() && MAC_SNO_NO_TYP.isMANUAL(dtlR.sno3_num_typ()) && isNullOrNullVal(dtlR.sno3())) {
				dtlR.sno3(null);
				msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sno3, new FXUCL_RequiredValidater()));
			}
			// 手配ＮＯ4
			if (dtlR.slo_sno4_flg() && MAC_SNO_NO_TYP.isMANUAL(dtlR.sno4_num_typ()) && isNullOrNullVal(dtlR.sno4())) {
				dtlR.sno4(null);
				msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sno4, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		protected MCMessageList chkModifiableByAbort(MCList<Slo_Upd01_HdrR> hdrList, MCList<Slo_Upd01_DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey sloNoIdxkey= dtlL.createIndex(Slo_Upd01_DtlR.$slo_no);
			
			boolean isAbortOrAbortCancel = false;
			
			for (Slo_Upd01_HdrR hdrR : hdrList) {
				MCList<Slo_Upd01_DtlR> dtlsubL = dtlL.subList(sloNoIdxkey, hdrR.slo_no());
				for (Slo_Upd01_DtlR dtlR : dtlsubL) {
					MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
					if (!isNull(oldSloDR)) {
						if (dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg())) {
							isAbortOrAbortCancel = true;
							break;
						}
					}
				}
				
				if (isAbortOrAbortCancel) {
					_cacheSloR = getMultiSloCache(hdrR);
					if (!isSame(hdrR.cst_cd(), _cacheSloR.cst_cd())
							|| !isSame(hdrR.sls_usr_cd(), _cacheSloR.sls_usr_cd())
							|| !isSame(hdrR.sls_dpt_cd(), _cacheSloR.sls_dpt_cd())) {
						msgL.add(new MCMessage(hdrR, null, MSBBL0515));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 仕入直送の場合、発注先を取得する。	
		 * @param dtlR 受注明細
		 */
		protected MCMessageList setSpplCd(Slo_Upd01_DtlR dtlR){
			MCMessageList msgL = new MCMessageList();
			
			Slo_Upd01_HdrR hdrR = getHdrByPegNo(dtlR.hdr_peg_no());
			
			//仕入直送の場合、発注先、仕入直送の中継場所を取得する。			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
				//発注先が未指定の場合、品目詳細マスタから、品目と売上部門のＷＧで、発注先を取得
				if (isNull(dtlR.sppl_cd())) {
					MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
					String midLocCd = "";
					//売上部門で、場所マスタから場所CDを取得し
					midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
					//場所マスタからWG_CDを取得する。
					MAM_LOC_R midlocR = getLoc(midLocCd);
					itmDtlR = getItmDtlInfo(hdrR, dtlR, midlocR.wg_cd());								
					if (!isNull(itmDtlR)) {
						//受注明細の発注先、メーカを設定する。
						dtlR.sppl_cd(itmDtlR.sppl_cd());
						dtlR.maker_cd(itmDtlR.maker_cd());
						if (isNull(itmDtlR.rqst_wg_cd())){
							dtlR.rqst_to_wg_cd(midlocR.wg_cd());
						}
						else{
							dtlR.rqst_to_wg_cd(itmDtlR.rqst_wg_cd());
						}
					}
					//取得できない場合は、下記のエラーメッセージを表示する。	
					else {
						msgL.add(new MCMessage(dtlR, Slo_Upd01_DtlR.$sppl_cd, MSBBL0167, toDispGUIIndex(dtlR)));
					}
				}
			}
			return msgL;
		}

		/**
		 * その他サービスのチェック処理を呼び出す。
		 */
		protected void callOtherRegUpdChkSrv() {
			
			chkAprvService();
			
			callAprvSvChk02();
		}
		
		/**
		 * 承認提供サービス.承認情報作成を呼び出す。
		 */
		protected void chkAprvService() {
			
			//承認提供サービス.承認情報作成(MBBAL5010.Aprv_Upd01)
			MBBAL_AprvService.Aprv_Chk01 op = MBBAL_AprvService.crtAprv_Chk01();
			
			boolean isCall = false;
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				_cacheSloR = getMultiSloCache(hdrR);
				_cacheSloDL = getMultiSloDCache(hdrR);
				
				isCall = false;
				
				//新規登録の場合
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					//承認モジュールを呼び出すか
					if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
						isCall = true;
					}
				}
				//更新の場合
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {				
					if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
						// 承認中、承認済の場合は「承認引戻ＦＬＧ＝オン」の時のみ承認モジュールの再呼出を行う
						// 承認に関する項目は画面側で変更できないように制御する前提
						if (MAC_APRV_STS_TYP.isACPT(hdrR.old_aprv_sts_typ())
								|| MAC_APRV_STS_TYP.isFIX(hdrR.old_aprv_sts_typ())) {
							if (hdrR.aprv_back_flg()) {
								isCall = true;
							}
						}
						else {
							isCall = true;
						}
					}			
				}			
				//承認モジュールを呼び出すか
				if (isCall) {
					Aprv_Chk01_Rslt1R cndR = Aprv_Chk01_Rslt1R.create();
					//サービス呼出す時の電文項目の設定
					copy(cndR, hdrR, createMap_Aprv_Chk01_Rslt1R_Slo_Upd01_HdrR());
					op.up0().add(cndR);
				}
			}
			
			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}
		
		/**
		 * 	見積が承認対象だった場合、承認提供サービスの承認次処理済チェック処理を実行する。
		 */
		protected void callAprvSvChk02() {

			MBBAL_AprvService.Aprv_Chk02 ope = MBBAL_AprvService.crtAprv_Chk02();
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				_cacheSloR = getMultiSloCache(hdrR);
				_cacheSloDL = getMultiSloDCache(hdrR);
				
				if (!hasQtn(hdrR) || !hdrR.qtn_aprv_flg()) {
					continue;
				}
				
				Aprv_Chk02_Rslt1R up = Aprv_Chk02_Rslt1R.create();
				up.aprv_no(hdrR.qtn_aprv_no());
				up.peg_no(hdrR.peg_no());
				up.setAttributes(hdrR);
				ope.up0().add(up);
			}
			
			if (!ope.up0().isEmpty()) {
				
				ope.exec();
				
				if (!isNull(ope.down0())) {
					copyErrFlg(up0(), ope.down0());
				}
			}
		}

		/**
		 * 受注ヘッダのロック、更新カウンタチェック、空更新、値の補完
		 * @param hdrR 受注ヘッダ
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkSlo(Slo_Upd01_HdrR hdrR) {
			
			MCMessageList msgL = new MCMessageList();	
			if (_updCntrErr) {
				return msgL;
			}
			//更新カウンタチェック
			if (!hdrR.upd_cntr_not_chk_flg()) {
				msgL.addAll(checkUpdCntrNE(hdrR, Slo_Upd01_HdrR.$slo_upd_cntr, _cacheSloR));
			}
			
			//空更新
			dbTsUpdateKey("MSBBL6020_MST_SLO_U01", _cacheSloR, MST_SLO_R.create("T"));
			
			//改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
			updSloPR(_cacheSloR);
			//値の補完			
			//元承認対象ＦＬＧ
			hdrR.old_aprv_flg(_cacheSloR.aprv_flg());
			//元承認ＮＯ
			hdrR.old_aprv_no(_cacheSloR.aprv_no());
			if (!isNull(_cacheSloR.aprv_no())) {
				//元承認状況区分
				hdrR.old_aprv_sts_typ(_cacheSloR.aprv_sts_typ());
				MBT_APRV_R aprvR = getAprvR(_cacheSloR.aprv_no());
				//元更新可能ＦＬＧ
				hdrR.old_can_upd_flg(aprvR.aprv_upd_flg());				
				//元取消可能ＦＬＧ
				hdrR.old_can_del_flg(aprvR.aprv_can_flg());
			}
			if (_cacheSloR.edi_flg()) {
				hdrR.edi_flg(_cacheSloR.edi_flg());
			}
			
			if (!msgL.isEmpty()) {
				_updCntrErr = true;
			}
			return msgL;
		}		
		
		/**
		 * 受注区分をチェックする。<br>
		 * 仕入直送の発注が登録されている場合、受注区分を仮受注に変更できないとする。
		 * @param hdrR 受注ヘッダ
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkSloTyp(Slo_Upd01_HdrR hdrR) {

			MCMessageList msgL = new MCMessageList();	
			
			if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
					&& MSC_SLO_TYP.isSLO(_cacheSloR.slo_typ()) 
					&& MSC_SLO_TYP.isPRE_SLO(hdrR.slo_typ())) {
				
				MCList<MST_SLO_R> rsltL = MCList.create(MST_SLO_R.class);
				
				MCMainQuery q = get_MST_PO_D_S01_sql();
				q.executeQuery( _cacheSloR, rsltL);
				
				if (rsltL.size() > 0) {
					msgL.add(new MCMessage(hdrR, Slo_Upd01_HdrR.$slo_typ, MSBBL0281, _cacheSloR.slo_no()));
				}
			}
			
			return msgL;
		}
		/**
		 * 出荷予定が変更されたかどうか。
		 * @param hdrR 受注ヘッダ
		 * @return 変更された場合はtrue
		 */
		protected boolean isShipSchdChanged(Slo_Upd01_HdrR hdrR) {
			
			if (isSame(_cacheSloR.cst_cd(), hdrR.cst_cd())
					&& isSame(_cacheSloR.wg_cd(), hdrR.wg_cd())
					&& isSame(_cacheSloR.sls_dpt_cd(), hdrR.sls_dpt_cd())
					&& isSame(_cacheSloR.sls_usr_cd(), hdrR.sls_usr_cd())
					&& isSame(_cacheSloR.trd_rmrks(), hdrR.trd_rmrks())
					&& isSame(_cacheSloR.slo_typ(), hdrR.slo_typ())
					&& isSame(_cacheSloR.assort_typ(), hdrR.assort_typ())
					&& isSame(_cacheSloR.sls_basis_typ(), hdrR.sls_basis_typ())) {
				return false;
			}
			return true;

		}

		/**
		 * 出荷予定をチェックする。
		 * @param hdrList 受注ヘッダリスト
		 */
		protected void chkShipSchd(MCList<Slo_Upd01_HdrR> hdrList) {
			
			//出荷進捗、出荷予定、出荷引当状況の作成のため、出荷予定サービス.チェック（出荷進捗・予定）（MSBEL5500.ShipSchd_Chk01）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Chk01 op = MSBEL_ShipSchdService.crtShipSchd_Chk01();
			//出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）のサービスを出荷判定モードで実行して、出荷可能を更新する。
			MSBEL_ShipSchdService.ShipSchd_Chk02 opShipJudge = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			
			for (Slo_Upd01_HdrR hdrR : hdrList) {
				
				_cacheSloR = getMultiSloCache(hdrR);
				_cacheSloDL = getMultiSloDCache(hdrR);
				
				// 受注明細にエラーが発生する場合
				if (hasErrFlgOn(getAllDtlByHdrPegNo(hdrR.peg_no())) ) {
					continue;
				}
			
				//新規登録の場合
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					for (Slo_Upd01_DtlR dtlR : getDtlByHdrPegNo(hdrR.peg_no())) {
						//上り電文（ShipPr_Dtl）の設定
						ShipPr_DtlR prR = ShipPr_DtlR.create();
						copy(prR, dtlR, hdrR, createMap_ShipPr_DtlR_Slo_Upd01_DtlR());
						if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
							// 売上部門で、場所マスタから場所CDを取得する
							String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
							MAM_LOC_R midlocR = getLoc(midLocCd);
							prR.ship_fr_lg_grp_cd(midlocR.lg_grp_cd());
							prR.wg_cd(midlocR.wg_cd());
						}
						op.up0().add(prR);
					}
				}
				//更新の場合
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					MCIndexKey shipSchdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
					for (Slo_Upd01_DtlR dtlR : getDtlByHdrPegNo(hdrR.peg_no())) {
						setDataCrudTyp(dtlR);
						//上り電文.受注明細.データ更新区分＝新規の場合、出荷予定サービスの上り電文の設定は新規登録と同じに設定。
						if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
							//上り電文（ShipPr_Dtl）の設定
							ShipPr_DtlR prR = ShipPr_DtlR.create();
							copy(prR, dtlR, hdrR, createMap_ShipPr_DtlR_Slo_Upd01_DtlR());
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
								// 売上部門で、場所マスタから場所CDを取得する
								String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
								MAM_LOC_R midlocR = getLoc(midLocCd);
								prR.ship_fr_lg_grp_cd(midlocR.lg_grp_cd());
								prR.wg_cd(midlocR.wg_cd()); // 場所のＷＧと物流ＧのＷＧは一致する仕様
							}
							op.up0().add(prR);
						}
						//上り電文.受注明細.データ更新区分＝削除の場合、
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							//出荷予定サービスの上り電文.ShipSchd_Dtlの削除レコードを作成する。						
							//キャッシュから対応する更新前の出荷進捗を取得する。
							MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
							//出荷予定サービスを呼ぶ際には、指図済・出荷済のレコードは渡さないようにする。
							if (oldShipPrR.ship_inst_qty().gt(0) || oldShipPrR.ship_act_qty().gt(0) || 
									oldShipPrR.iv_schd_qty().gt(0) || oldShipPrR.iv_act_qty().gt(0) ||
									oldShipPrR.sls_qty().gt(0)){
								continue;
							}
							//上り電文（ShipPr_Dtl）の設定
							ShipPr_DtlR prR = ShipPr_DtlR.create();
							prR.peg_no(dtlR.peg_no());
							prR.data_crud_typ(dtlR.data_crud_typ());
							prR.ship_pr_no(dtlR.ship_pr_no());
							prR.cred_no_up_flg(true);
							prR.setAttributes(dtlR);
							op.up0().add(prR);
						}
						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
								|| (isNull(dtlR.data_crud_typ()) && isShipSchdChanged(hdrR))) {
							//キャッシュから対応する更新前の受注明細を取得する。
							MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
							//キャッシュから対応する更新前の出荷進捗を取得する。
							MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
							if (dtlR.rem_abort_flg() && isAbortChanged(dtlR, oldSloDR)) {
								for (MST_SHIP_SCHD_R r : _cacheShipSchdL.subList(shipSchdIdxkey, dtlR.ship_pr_no())) {
									if (r.ship_inst_qty().gt(0) || r.ship_act_qty().gt(0)){
										continue;
									}
									ShipSchd_DtlR upR = ShipSchd_DtlR.create();
									copy(upR, dtlR, r, createMap_ShipSchd_DtlR_MST_SLO_D_R());
									upR.ship_inst_d_no(r.ship_inst_d_no());
									upR.inst_qty(r.ship_inst_qty());
									upR.inst_unit_cd(r.base_unit_cd());
									upR.is_src_sls_dlv_dt_adjst_flg(true);
									opShipJudge.up0().add(upR);
								}
							}
							else {
								//出荷予定サービスを呼ぶ際には、指図済・出荷済のレコードは渡さないようにする。
								if (oldShipPrR.ship_inst_qty().gt(0) || oldShipPrR.ship_act_qty().gt(0) || 
										oldShipPrR.iv_schd_qty().gt(0) || oldShipPrR.iv_act_qty().gt(0) ||
										oldShipPrR.sls_qty().gt(0)){
									continue;
								}
								//受注明細の打切、打切取消（上り電文.受注明細.打切ＦＬＧ=オフ、更新前の受注明細.打切ＦＬＧ＝オン）の場合
								if (dtlR.abort_flg()
										|| (!dtlR.abort_flg() && oldSloDR.abort_flg())) {
									//上り電文（ShipPr_Dtl）の設定
									ShipPr_DtlR prR = ShipPr_DtlR.create();
									prR.peg_no(dtlR.peg_no());
									prR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
									prR.ship_pr_no(dtlR.ship_pr_no());
									prR.abort_flg(dtlR.abort_flg());
									prR.rem_abort_flg(dtlR.rem_abort_flg());
									prR.cred_no_up_flg(true);
									prR.setAttributes(dtlR);
									op.up0().add(prR);
								}
								else {
									//仕入直送→仕入直送以外、或は仕入直送以外→仕入直送に変更した場合,削除、新規で呼ぶ。そうでない場合、更新で呼ぶ
									if (isProcTypChanged(oldSloDR, dtlR)) {
										//出荷予定サービスの上り電文.ShipSchd_Dtlの削除レコードを作成する。
										//上り電文（ShipPr_Dtl）の設定
										ShipPr_DtlR prR = ShipPr_DtlR.create();
										prR.peg_no(dtlR.peg_no());
										prR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
										prR.ship_pr_no(dtlR.ship_pr_no());
										prR.cred_no_up_flg(true);
										prR.setAttributes(dtlR);
										op.up0().add(prR);
		
										//新規の電文を作成
										//上り電文（ShipPr_Dtl）の設定
										prR = ShipPr_DtlR.create();
										copy(prR, dtlR, hdrR, createMap_ShipPr_DtlR_Slo_Upd01_DtlR());
										if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
											// 売上部門で、場所マスタから場所CDを取得する
											String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
											MAM_LOC_R midlocR = getLoc(midLocCd);
											prR.ship_fr_lg_grp_cd(midlocR.lg_grp_cd());
											prR.wg_cd(midlocR.wg_cd());
										}
										prR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
										op.up0().add(prR);								
									}
									else {
										//出荷予定の変更を伴う受注変更の場合のみ出荷予定を呼ぶ
										//上り電文（ShipPr_Dtl）の設定
										ShipPr_DtlR prR = ShipPr_DtlR.create();
										copy(prR, dtlR, createMap_Upd_ShipPr_DtlR_Slo_Upd01_DtlR(oldShipPrR, hdrR));
										
										prR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
										if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
											// 売上部門で、場所マスタから場所CDを取得する
											String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
											MAM_LOC_R midlocR = getLoc(midLocCd);
											prR.ship_fr_lg_grp_cd(midlocR.lg_grp_cd());
											prR.wg_cd(midlocR.wg_cd());
										}
										op.up0().add(prR);
									}
								}
							}
						}
						else if (isNull(dtlR.data_crud_typ()) && isShipJudgeChanged(hdrR)) {
							for (MST_SHIP_SCHD_R r : _cacheShipSchdL.subList(shipSchdIdxkey, dtlR.ship_pr_no())) {
								ShipSchd_DtlR upR = ShipSchd_DtlR.create();
								upR.ship_schd_no(r.ship_schd_no());
								upR.ship_pr_no(r.ship_pr_no());
								upR.peg_no(dtlR.peg_no());
								upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								upR.not_dt_calc_flg(r.not_dt_calc_flg());
								upR.ship_judge_flg(true);
								upR.iv_chk_skip_flg(true);
								upR.setAttributes(dtlR);
								opShipJudge.up0().add(upR);
							}
						}
					}
				}
			}
			if (!op.up0().isEmpty()) {
				op.exec();
				if (!isNull(op.down0())) {
					copyErrFlg(up1(), op.down0());
				}
			}
			if (!opShipJudge.up0().isEmpty()) {
				opShipJudge.exec();
				copyErrFlg(up1(), opShipJudge.down0());
			}
		}
		
		protected boolean isAbortChanged(Slo_Upd01_DtlR dtlR, MST_SLO_D_R oldSloDR) {
			return dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg());
		}

		protected void setDataCrudTyp(Slo_Upd01_DtlR dtlR) {
			MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
			if (isNull(dtlR.data_crud_typ()) && isShipSchdChanged(oldSloDR, dtlR)) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}

		protected boolean isShipSchdChanged(MST_SLO_D_R oldSloDR, Slo_Upd01_DtlR newSloDR) {
			if (isSame(oldSloDR.itm_cd(), newSloDR.itm_cd())
					&& isSame(oldSloDR.itm_sub1(), newSloDR.itm_sub1())
					&& isSame(oldSloDR.itm_sub2(), newSloDR.itm_sub2())
					&& isSame(oldSloDR.itm_sub3(), newSloDR.itm_sub3())
					&& isSame(oldSloDR.itm_nm(), newSloDR.itm_nm())
					&& isSame(oldSloDR.iv_itm_nm(), newSloDR.iv_itm_nm())
					&& isSame(oldSloDR.ship_rqst_tm(), newSloDR.ship_rqst_tm())
					&& isSame(oldSloDR.dlv_rqst_tm(), newSloDR.dlv_rqst_tm())
					&& isSame(oldSloDR.via_dlv_typ(), newSloDR.via_dlv_typ())
					&& isSame(oldSloDR.dlv_cd(), newSloDR.dlv_cd())
					&& isSame(oldSloDR.dlv_nm(), newSloDR.dlv_nm())
					&& isSame(oldSloDR.dlv_cntct_dpt(), newSloDR.dlv_cntct_dpt())
					&& isSame(oldSloDR.dlv_cntct_psn(), newSloDR.dlv_cntct_psn())
					&& isSame(oldSloDR.dlv_zip_cd(), newSloDR.dlv_zip_cd())
					&& isSame(oldSloDR.dlv_addr1(), newSloDR.dlv_addr1())
					&& isSame(oldSloDR.dlv_addr2(), newSloDR.dlv_addr2())
					&& isSame(oldSloDR.dlv_addr3(), newSloDR.dlv_addr3())
					&& isSame(oldSloDR.dlv_addr4(), newSloDR.dlv_addr4())
					&& isSame(oldSloDR.dlv_tel(), newSloDR.dlv_tel())
					&& isSame(oldSloDR.dlv_fax(), newSloDR.dlv_fax())
					&& isSame(oldSloDR.dlv_lg_grp_cd(), newSloDR.dlv_lg_grp_cd())
					&& isSame(oldSloDR.pri_prnt_flg(), newSloDR.pri_prnt_flg())
					&& isSame(oldSloDR.tdlv_cd(), newSloDR.tdlv_cd())
					&& isSame(oldSloDR.tdlv_nm(), newSloDR.tdlv_nm())
					&& isSame(oldSloDR.tdlv_cntct_dpt(), newSloDR.tdlv_cntct_dpt())
					&& isSame(oldSloDR.tdlv_cntct_psn(), newSloDR.tdlv_cntct_psn())
					&& isSame(oldSloDR.tdlv_zip_cd(), newSloDR.tdlv_zip_cd())
					&& isSame(oldSloDR.tdlv_addr1(), newSloDR.tdlv_addr1())
					&& isSame(oldSloDR.tdlv_addr2(), newSloDR.tdlv_addr2())
					&& isSame(oldSloDR.tdlv_addr3(), newSloDR.tdlv_addr3())
					&& isSame(oldSloDR.tdlv_addr4(), newSloDR.tdlv_addr4())
					&& isSame(oldSloDR.tdlv_tel(), newSloDR.tdlv_tel())
					&& isSame(oldSloDR.tdlv_fax(), newSloDR.tdlv_fax())
					&& isSame(oldSloDR.tdlv_lg_grp_cd(), newSloDR.tdlv_lg_grp_cd())
					&& isSame(oldSloDR.trd_unit_cd(), newSloDR.trd_unit_cd())
					&& isSame(oldSloDR.trd_unit_qty(), newSloDR.trd_unit_qty())
					&& isSame(oldSloDR.sls_rsn_cd(), newSloDR.sls_rsn_cd())
					&& isSame(oldSloDR.bd_dpt_cd(), newSloDR.bd_dpt_cd())
					&& isSame(oldSloDR.ver_no(), newSloDR.ver_no())
					&& isSame(oldSloDR.ship_term_cd(), newSloDR.ship_term_cd())
					&& isSame(oldSloDR.ship_inst_typ(), newSloDR.ship_inst_typ())
					&& isSame(oldSloDR.dlv_day_week_typ(), newSloDR.dlv_day_week_typ())
					&& isSame(oldSloDR.ship_schd_split_typ(), newSloDR.ship_schd_split_typ())
					&& isSame(oldSloDR.alloc_scope_typ(), newSloDR.alloc_scope_typ())
					&& isSame(oldSloDR.alloc_typ(), newSloDR.alloc_typ())
					&& isSame(oldSloDR.alloc_grp_cd(), newSloDR.alloc_grp_cd())
					&& isSame(oldSloDR.ship_lg_grp_cd(), newSloDR.ship_lg_grp_cd())
					&& isSame(oldSloDR.def_loc_cd(), newSloDR.def_loc_cd())
					&& isSame(oldSloDR.loc_cd(), newSloDR.loc_cd())
					&& isSame(oldSloDR.str_ln_cd(), newSloDR.str_ln_cd())
					&& isSame(oldSloDR.lot_no(), newSloDR.lot_no())
					&& isSame(oldSloDR.sublot_no(), newSloDR.sublot_no())
					&& isSame(oldSloDR.sno1(), newSloDR.sno1())
					&& isSame(oldSloDR.sno1_null_flg(), newSloDR.sno1_null_flg())
					&& isSame(oldSloDR.sno2(), newSloDR.sno2())
					&& isSame(oldSloDR.sno2_null_flg(), newSloDR.sno2_null_flg())
					&& isSame(oldSloDR.sno3(), newSloDR.sno3())
					&& isSame(oldSloDR.sno3_null_flg(), newSloDR.sno3_null_flg())
					&& isSame(oldSloDR.sno4(), newSloDR.sno4())
					&& isSame(oldSloDR.sno4_null_flg(), newSloDR.sno4_null_flg())
					&& isSame(oldSloDR.gd_cd(), newSloDR.gd_cd())
					&& isSame(oldSloDR.sls_cststk_flg(), newSloDR.sls_cststk_flg())
					&& isSame(oldSloDR.vmi_flg(), newSloDR.vmi_flg())
					&& isSame(oldSloDR.proc_typ(), newSloDR.proc_typ())
					&& isSame(oldSloDR.rqst_to_loc_cd(), newSloDR.rqst_to_loc_cd())
					&& isSame(oldSloDR.trd_d_rmrks(), newSloDR.trd_d_rmrks())
					&& isSame(oldSloDR.ship_cnt_rmrks(), newSloDR.ship_cnt_rmrks())
					&& isSame(oldSloDR.set_itm_grp_no(), newSloDR.set_itm_grp_no())
					&& isSame(oldSloDR.sls_schd_dt(), newSloDR.sls_schd_dt())
					&& isSame(oldSloDR.sppl_cd(), newSloDR.sppl_cd())
					&& isSame(oldSloDR.maker_cd(), newSloDR.maker_cd())
					&& !newSloDR.abort_flg()) {
				return false;
			}
			return true;
		}

		/**
		 * 標準の棚・ラインCDを設定します。
		 * @param hdrList 受注ヘッダリスト
		 */
		protected void setDefStrLnCd(MCList<Slo_Upd01_HdrR> hdrList) {
			MSUCL_StrLnUtil.StrLnUtil_Srch01 ope = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			for (Slo_Upd01_HdrR hdrR : hdrList) {
				MCList<Slo_Upd01_DtlR> dtlL = getDtlByHdrPegNo(hdrR.peg_no());
				for (Slo_Upd01_DtlR dtlR : dtlL) {
					StrLnUtil_Srch01_CndR cndR = StrLnUtil_Srch01_CndR.create();
					cndR.peg_no(dtlR.peg_no());
					cndR.itm_cd(dtlR.itm_cd());
					cndR.itm_sub1(dtlR.itm_sub1());
					cndR.itm_sub2(dtlR.itm_sub2());
					cndR.itm_sub3(dtlR.itm_sub3());
					cndR.loc_cd(dtlR.def_loc_cd());
					ope.up0().add(cndR);
				}
			}
			ope.exec();
			MCIndexKey idxkey = up1().createIndex(Slo_Upd01_DtlR.$peg_no);
			ope.down0().forEach(downR -> {
				Slo_Upd01_DtlR dtlR = up1().getFirst(idxkey, downR.peg_no());
				dtlR.def_str_ln_cd(nvl(downR.str_ln_cd(), MAC_STR.NULL_VAL.value()));
			});
		}
		
		/**
		 * 打切の明細は画面上変更された項目値を無視するため、変更する前の値に戻す。
		 * 
		 * @param dtlR 受注明細
		 * @param oldSloDR 変更前受注明細
		 * @param oldShipPrR 変更前出荷進捗
		 */
		protected void setAbortR(Slo_Upd01_DtlR dtlR, MST_SLO_D_R oldSloDR, MST_SHIP_PR_R oldShipPrR){
			MCList<MST_SHIP_SCHD_R> oldShipSchdL = subListShipSchdCache(dtlR.ship_pr_no());
			
			dtlR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
			dtlR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
			dtlR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
			dtlR.itm_sub3(oldSloDR.itm_sub3()); //枝番３
			dtlR.itm_nm(oldSloDR.itm_nm()); //品名
			dtlR.sundry_itm_flg(oldSloDR.sundry_itm_flg()); //諸口品
			dtlR.iv_itm_nm(oldSloDR.iv_itm_nm()); //Ｉ／Ｖ表記品名			
			dtlR.cntry_org_cd(oldSloDR.cntry_org_cd()); //原産地ＣＤ
			dtlR.vmi_flg(oldSloDR.vmi_flg()); //貸出
			dtlR.trd_unit_cd(oldSloDR.trd_unit_cd()); //取引単位ＣＤ
			dtlR.trd_unit_qty(oldSloDR.trd_unit_qty()); //取引単位数量
			dtlR.trd_cur_upri(oldSloDR.trd_cur_upri()); //取引通貨単価
			dtlR.interim_flg(oldSloDR.interim_flg()); //仮単価
			dtlR.upri_not_tgt_flg(oldSloDR.upri_not_tgt_flg()); //単価再取得対象外
			dtlR.cost_upri(oldSloDR.cost_upri()); //原価単価
			dtlR.trd_cur_amt(oldSloDR.trd_cur_amt()); //取引通貨金額
			dtlR.trd_cur_dscnt_amt(oldSloDR.trd_cur_dscnt_amt()); //取引通貨値引額
			dtlR.dscnt_rsn_cd(oldSloDR.dscnt_rsn_cd()); //値引理由ＣＤ
			dtlR.iv_upri(oldSloDR.iv_upri()); //Ｉ／Ｖ単価
			dtlR.iv_amt(oldSloDR.iv_amt()); //Ｉ／Ｖ金額
			dtlR.tax_fix_flg(oldSloDR.tax_fix_flg()); //税指定
			dtlR.tax_cd(oldSloDR.tax_cd()); //税ＣＤ
			dtlR.trd_cur_tax_amt(oldSloDR.trd_cur_tax_amt()); //税額
			dtlR.wtax_rate(oldSloDR.wtax_rate()); //源泉税率
			dtlR.wtax_amt(oldSloDR.wtax_amt()); //源泉税額
			dtlR.bill_crryovr_times(oldSloDR.bill_crryovr_times()); //請求繰越回数
			dtlR.gd_cd(oldSloDR.gd_cd()); //格付ＣＤ
			dtlR.sno_num_flg(false); //手配ＮＯ発番
			dtlR.sno1(oldSloDR.sno1()); //手配ＮＯ１
			dtlR.sno1_null_flg(oldSloDR.sno1_null_flg()); //手配ＮＯ１無し可
			dtlR.sno2(oldSloDR.sno2()); //手配ＮＯ２
			dtlR.sno2_null_flg(oldSloDR.sno2_null_flg()); //手配ＮＯ２無し可
			dtlR.sno3(oldSloDR.sno3()); //手配ＮＯ３
			dtlR.sno3_null_flg(oldSloDR.sno3_null_flg()); //手配ＮＯ３無し可
			dtlR.sno4(oldSloDR.sno4()); //手配ＮＯ４
			dtlR.sno4_null_flg(oldSloDR.sno4_null_flg()); //手配ＮＯ４無し可			
			dtlR.set_itm_grp_no(oldSloDR.set_itm_grp_no()); //品揃ＮＯ
			dtlR.ship_rqst_tm(oldSloDR.ship_rqst_tm()); //出荷希望日時
			dtlR.dlv_rqst_tm(oldSloDR.dlv_rqst_tm()); //納入希望日時
			dtlR.sls_schd_dt(oldSloDR.sls_schd_dt()); //売上予定日
			dtlR.accpt_schd_dt(oldSloDR.accpt_schd_dt()); //検収予定日
			dtlR.ship_schd_tm(oldShipPrR.ship_schd_tm()); //出荷予定日時
			dtlR.dlv_schd_tm(oldShipPrR.dlv_schd_tm()); //納品予定日時
			dtlR.dlv_cd(oldSloDR.dlv_cd()); //納品先ＣＤ
			dtlR.dlv_sundry_flg(oldSloDR.dlv_sundry_flg()); //納品先諸口
			dtlR.dlv_nm(oldSloDR.dlv_nm()); //納品先名
			dtlR.dlv_cntct_dpt(oldSloDR.dlv_cntct_dpt()); //納品先部署
			dtlR.dlv_cntct_psn(oldSloDR.dlv_cntct_psn()); //納品先担当者
			dtlR.dlv_zip_cd(oldSloDR.dlv_zip_cd()); //納品先郵便番号
			dtlR.dlv_addr1(oldSloDR.dlv_addr1()); //納品先住所1
			dtlR.dlv_addr2(oldSloDR.dlv_addr2()); //納品先住所2
			dtlR.dlv_addr3(oldSloDR.dlv_addr3()); //納品先住所3
			dtlR.dlv_addr4(oldSloDR.dlv_addr4()); //納品先住所4
			dtlR.dlv_tel(oldSloDR.dlv_tel()); //納品先ＴＥＬ
			dtlR.dlv_fax(oldSloDR.dlv_fax()); //納品先ＦＡＸ
			dtlR.dlv_lg_grp_cd(oldSloDR.dlv_lg_grp_cd()); //納品先物流ＧＣＤ
			dtlR.pri_prnt_flg(oldSloDR.pri_prnt_flg()); //価格印字
			dtlR.dest_cd1(oldSloDR.dest_cd1()); //仕向先ＣＤ１
			dtlR.dest_cd2(oldSloDR.dest_cd2()); //仕向先ＣＤ２
			dtlR.dest_cd3(oldSloDR.dest_cd3()); //仕向先ＣＤ３
			dtlR.tdlv_cd(oldSloDR.tdlv_cd()); //配送先ＣＤ
			dtlR.tdlv_sundry_flg(oldSloDR.tdlv_sundry_flg()); //配送先諸口
			dtlR.tdlv_nm(oldSloDR.tdlv_nm()); //配送先名
			dtlR.via_dlv_typ(oldSloDR.via_dlv_typ()); //配送先経由区分
			dtlR.tdlv_cntct_dpt(oldSloDR.tdlv_cntct_dpt()); //配送先部署
			dtlR.tdlv_cntct_psn(oldSloDR.tdlv_cntct_psn()); //配送先担当者
			dtlR.tdlv_zip_cd(oldSloDR.tdlv_zip_cd()); //配送先郵便番号
			dtlR.tdlv_addr1(oldSloDR.tdlv_addr1()); //配送先住所1
			dtlR.tdlv_addr2(oldSloDR.tdlv_addr2()); //配送先住所2
			dtlR.tdlv_addr3(oldSloDR.tdlv_addr3()); //配送先住所3
			dtlR.tdlv_addr4(oldSloDR.tdlv_addr4()); //配送先住所4
			dtlR.tdlv_tel(oldSloDR.tdlv_tel()); //配送先ＴＥＬ
			dtlR.tdlv_fax(oldSloDR.tdlv_fax()); //配送先ＦＡＸ
			dtlR.tdlv_lg_grp_cd(oldSloDR.tdlv_lg_grp_cd()); //配送先物流ＧＣＤ
			dtlR.dlv_day_week_typ(oldSloDR.dlv_day_week_typ()); //着曜日
			dtlR.sls_cststk_flg(oldSloDR.sls_cststk_flg()); //預り売上
			dtlR.proc_typ(oldSloDR.proc_typ()); //手配区分
			dtlR.ship_inst_typ(oldSloDR.ship_inst_typ()); //指図区分
			dtlR.ship_schd_split_typ(oldSloDR.ship_schd_split_typ()); //出荷予定分割区分
			dtlR.alloc_scope_typ(oldSloDR.alloc_scope_typ()); //引当範囲区分
			dtlR.alloc_typ(oldSloDR.alloc_typ()); //引当区分
			dtlR.rqst_to_loc_cd(oldSloDR.rqst_to_loc_cd()); //依頼先場所ＣＤ
			dtlR.sppl_cd(oldSloDR.sppl_cd()); //発注先ＣＤ
			dtlR.maker_cd(oldSloDR.maker_cd()); //メーカＣＤ
			dtlR.rqst_dt(oldSloDR.rqst_dt()); //依頼日
			dtlR.rqst_dlv_rqst_dt(oldSloDR.rqst_dlv_rqst_dt()); //依頼納入希望日
			dtlR.rqst_qty(oldSloDR.rqst_qty()); //依頼数
			dtlR.rqst_unit_cd(oldSloDR.rqst_unit_cd()); //依頼単位ＣＤ
			dtlR.wg_rqst_cnt_rmrks(oldSloDR.wg_rqst_cnt_rmrks()); //依頼先連絡備考			
			dtlR.alloc_grp_cd(oldSloDR.alloc_grp_cd()); //総量引当場所ＧＣＤ
			dtlR.ship_lg_grp_cd(oldSloDR.ship_lg_grp_cd()); //出荷物流ＧＣＤ
			dtlR.def_loc_cd(oldSloDR.def_loc_cd()); //通常出荷場所ＣＤ
			dtlR.loc_cd(oldSloDR.loc_cd()); //場所ＣＤ
			dtlR.str_ln_cd(oldSloDR.str_ln_cd()); //棚・ラインＣＤ
			dtlR.lot_no(oldSloDR.lot_no()); //ロットＮＯ
			dtlR.sublot_no(oldSloDR.sublot_no()); //サブロットＮＯ
			dtlR.ver_no(oldSloDR.ver_no()); //版ＮＯ
			dtlR.ship_term_cd(oldSloDR.ship_term_cd()); //出荷条件ＣＤ			
			dtlR.ship_cnt_rmrks(oldSloDR.ship_cnt_rmrks()); //出荷連絡備考
			dtlR.cst_po_d_no(oldSloDR.cst_po_d_no()); //得意先注文明細ＮＯ
			dtlR.cst_itm_cd(oldSloDR.cst_itm_cd()); //得意先品目ＣＤ
			dtlR.cst_itm_nm(oldSloDR.cst_itm_nm()); //得意先品名
			dtlR.cst_po_d_rmrks(oldSloDR.cst_po_d_rmrks()); //得意先注文明細備考
			dtlR.sls_rsn_cd(oldSloDR.sls_rsn_cd()); //売上理由ＣＤ			
			dtlR.bd_dpt_cd(oldSloDR.bd_dpt_cd()); //負担部門ＣＤ
			dtlR.sls_upri_req_typ(oldSloDR.sls_upri_req_typ()); //販売単価取得区分
			dtlR.trd_d_rmrks(oldSloDR.trd_d_rmrks()); //取引明細備考
			dtlR.intr_rmrks(oldSloDR.intr_rmrks()); //内部明細備考
			dtlR.sub_char1(oldSloDR.sub_char1()); //予備１
			dtlR.sub_char2(oldSloDR.sub_char2()); //予備２
			dtlR.sub_char3(oldSloDR.sub_char3()); //予備３
			dtlR.can_rsn_cd(oldSloDR.can_rsn_cd()); //取消理由ＣＤ
			dtlR.slo_d_can_rmkrs(oldSloDR.slo_d_can_rmkrs()); //明細取消備考
			dtlR.base_unit_cd(oldSloDR.base_unit_cd()); //基準単位ＣＤ
			dtlR.base_unit_qty(oldSloDR.base_unit_qty()); //基準単位数
			dtlR.qtn_d_no(oldSloDR.qtn_d_no()); //見積明細ＮＯ
			dtlR.slo_no(oldSloDR.slo_no()); //受注ＮＯ
			dtlR.slo_rev(oldSloDR.slo_rev()); //受注改訂番号			
			dtlR.sls_itm_no(oldSloDR.sls_itm_no()); //販売品目ＮＯ
			
			if (dtlR.abort_flg()) {
				dtlR.not_dt_calc_flg(true);
			}
			else {
				dtlR.not_dt_calc_flg(getSloDNotDtCalcFlg(oldShipSchdL));
			}
		}
		
		protected boolean getSloDNotDtCalcFlg(MCList<MST_SHIP_SCHD_R> shipSchdL) {
			return isNull(shipSchdL.getFirst(MST_SHIP_SCHD_R.$not_dt_calc_flg, true)) ? false : true;
		}

		/**
		 * 受注明細の項目値の補完
		 * @param hdrR　受注ヘッダ
		 */
		protected void crretSloD(Slo_Upd01_HdrR hdrR) {
			
			//打切,打切り取消の明細は変更された項目値を無視するため、変更する前の値に戻す。
			for (Slo_Upd01_DtlR dtlR : getAllDtlByHdrPegNo(hdrR.peg_no())) {
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
					//キャッシュから対応する更新前の出荷進捗を取得する。
					MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
					if (dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg())) {						
						setAbortR(dtlR, oldSloDR, oldShipPrR);
					}
				}
			}
			//受注明細の項目値の補完
			for (Slo_Upd01_DtlR dtlR : getAllDtlByHdrPegNo(hdrR.peg_no())) {
				if (!dtlR.sundry_itm_flg()) {
					dtlR.itm_nm(null);
					dtlR.iv_itm_nm(null);
				}
				if (!dtlR.dlv_sundry_flg()) {
					dtlR.dlv_nm(null);
				}
				if (!dtlR.tdlv_sundry_flg()) {
					dtlR.tdlv_nm(null);
				}
				if (needsGetMst(dtlR)) {
					
					if (!dtlR.dlv_sundry_flg()) {
						dtlR.dlv_cntct_dpt(dtlR.mst_dlv_cntct_dpt());
						dtlR.dlv_cntct_psn(dtlR.mst_dlv_cntct_psn());
						dtlR.dlv_zip_cd(dtlR.mst_dlv_zip_cd());
						dtlR.dlv_addr1(dtlR.mst_dlv_addr1());
						dtlR.dlv_addr2(dtlR.mst_dlv_addr2());
						dtlR.dlv_addr3(dtlR.mst_dlv_addr3());
						dtlR.dlv_addr4(dtlR.mst_dlv_addr4());
						dtlR.dlv_tel(dtlR.mst_dlv_tel());
						dtlR.dlv_fax(dtlR.mst_dlv_fax());
						dtlR.dlv_lg_grp_cd(dtlR.mst_dlv_lg_grp_cd());
					}
					if (!dtlR.tdlv_sundry_flg()) {
						dtlR.tdlv_cntct_dpt(dtlR.mst_tdlv_cntct_dpt());
						dtlR.tdlv_cntct_psn(dtlR.mst_tdlv_cntct_psn());
						dtlR.tdlv_zip_cd(dtlR.mst_tdlv_zip_cd());
						dtlR.tdlv_addr1(dtlR.mst_tdlv_addr1());
						dtlR.tdlv_addr2(dtlR.mst_tdlv_addr2());
						dtlR.tdlv_addr3(dtlR.mst_tdlv_addr3());
						dtlR.tdlv_addr4(dtlR.mst_tdlv_addr4());
						dtlR.tdlv_tel(dtlR.mst_tdlv_tel());
						dtlR.tdlv_fax(dtlR.mst_tdlv_fax());
						dtlR.tdlv_lg_grp_cd(dtlR.mst_tdlv_lg_grp_cd());
					}
					
					if (isNull(dtlR.data_crud_typ()) && isMstChanged(dtlR)) {
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				else {
					MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
					complSloDInfo(dtlR, oldSloDR);
				}
				MCNumber baseUnitQty = convToBaseUnit(dtlR.trd_unit_qty(), 
						dtlR.trd_unit_conv_base_qty(), 
						dtlR.trd_unit_conv_qty(), 
						dtlR.base_unit_dec_place(), 
						dtlR.base_unit_rnd_typ());
				
				dtlR.base_unit_qty(baseUnitQty);
				
				dtlR.slo_no(hdrR.slo_no());
				dtlR.slo_rev(hdrR.slo_rev());
				
				if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
					dtlR.rqst_dt(oldSloDR.rqst_dt());
					dtlR.rqst_dlv_rqst_dt(oldSloDR.rqst_dlv_rqst_dt());
					dtlR.rqst_qty(oldSloDR.rqst_qty());
					dtlR.rqst_unit_cd(oldSloDR.rqst_unit_cd());
					dtlR.io_schd_pr_no(oldSloDR.io_schd_pr_no());
				}
				
				if (!isNull(dtlR.loc_cd()) && dtlR.str_ln_tgt_flg() && dtlR.str_ln_cd_none_flg()) {
					dtlR.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		protected void complSloDInfo(Slo_Upd01_DtlR dtlR, MST_SLO_D_R oldSloDR){
			for (String col : getSloDSameCols()) {
				dtlR.setValue(col, oldSloDR.getValue(col));
			}
		}
		
		protected boolean needsGetMst(Slo_Upd01_DtlR dtlR) {
			
			if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				return true;
			}
			if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
					|| isNull(dtlR.data_crud_typ())) {
				
				MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
				
				if (dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg())) {
					return false;
				}
				if (!isTrnst(oldShipPrR)) {
					return true;
				}
			}
			
			return false;
		}
		
		protected boolean isMstChanged(Slo_Upd01_DtlR dtlR) {
			MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
			
			for (String col : getSloDSameCols()) {
				if (!isSame(dtlR.getValue(col), oldSloDR.getValue(col))) {
					return true;
				}
			}
			return false;
		}
		
		protected String[] getSloDSameCols() {
			return new String[] {
				MST_SLO_D_R.$itm_nm,
				MST_SLO_D_R.$iv_itm_nm,
				MST_SLO_D_R.$sundry_itm_flg,
				MST_SLO_D_R.$dlv_nm,
				MST_SLO_D_R.$dlv_sundry_flg,
				MST_SLO_D_R.$dlv_cntct_dpt,
				MST_SLO_D_R.$dlv_cntct_psn,
				MST_SLO_D_R.$dlv_zip_cd,
				MST_SLO_D_R.$dlv_addr1,
				MST_SLO_D_R.$dlv_addr2,
				MST_SLO_D_R.$dlv_addr3,
				MST_SLO_D_R.$dlv_addr4,
				MST_SLO_D_R.$dlv_tel,
				MST_SLO_D_R.$dlv_fax,
				MST_SLO_D_R.$dlv_lg_grp_cd,
				MST_SLO_D_R.$tdlv_nm,
				MST_SLO_D_R.$tdlv_sundry_flg,
				MST_SLO_D_R.$tdlv_cntct_dpt,
				MST_SLO_D_R.$tdlv_cntct_psn,
				MST_SLO_D_R.$tdlv_zip_cd,
				MST_SLO_D_R.$tdlv_addr1,
				MST_SLO_D_R.$tdlv_addr2,
				MST_SLO_D_R.$tdlv_addr3,
				MST_SLO_D_R.$tdlv_addr4,
				MST_SLO_D_R.$tdlv_tel,
				MST_SLO_D_R.$tdlv_fax,
				MST_SLO_D_R.$tdlv_lg_grp_cd
			};
		}
		
		/**
		 * 依頼先WG_CDを補完する。
		 * @param dtlR　受注明細
		 */
		protected void setRqstToWgCd(Slo_Upd01_DtlR dtlR){
			
			Slo_Upd01_HdrR hdrR = getHdrByPegNo(dtlR.hdr_peg_no());
			String oldRqstWgCd = "";
			//仕入直送の場合
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
				if (!isNull(dtlR.sppl_cd())) {
					//仕入直送の場合、売上部門で場所マスタから場所CDを取得する
					String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
					//場所マスタからWG_CDを取得する。
					MAM_LOC_R midlocR = getLoc(midLocCd);
					if (!isNull(midlocR) && !isNull(midlocR.wg_cd())) {
						if (isSame(_sysParm, "1")) {
							oldRqstWgCd = getRqstToWgCd(hdrR.slo_dt(), dtlR,
									midlocR.wg_cd());
						} else {
							oldRqstWgCd = getRqstToWgCd(hdrR.slo_dt(), dtlR,
							midlocR.wg_cd(), hdrR.sls_dpt_cd());
						}
						if (isSame(oldRqstWgCd, "") || isNull(oldRqstWgCd)) {
							oldRqstWgCd = midlocR.wg_cd();
						}
						//依頼先ワーキンググループＣＤ
						dtlR.rqst_to_wg_cd(oldRqstWgCd);
					}
				}
			}
			else {
				//明細の場所、或は通常場所のWG_CDを取得
				MAM_LOC_R locR = getLoc(nvl(dtlR.loc_cd(), dtlR.def_loc_cd()));
				oldRqstWgCd = locR.wg_cd();
				
				//手配区分が「手配依頼」「引当後手配」の場合、
				if (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ()) || 
						MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())) {
					String oldfrWgCd = oldRqstWgCd;
					//購買依頼の場合
					if (!isNull(dtlR.sppl_cd())) {
						if (!isNull(oldRqstWgCd)) {
							if (isSame(_sysParm, "1")) {
								oldRqstWgCd = getRqstToWgCd(hdrR.slo_dt(), dtlR, oldfrWgCd);
							} else {
								oldRqstWgCd = getRqstToWgCd(hdrR.slo_dt(), dtlR, oldfrWgCd, hdrR.sls_dpt_cd());
							}
							if (isSame(oldRqstWgCd, "") || isNull(oldRqstWgCd)) {
								oldRqstWgCd = oldfrWgCd;
							}
							//依頼先ワーキンググループＣＤ
							dtlR.rqst_to_wg_cd(oldRqstWgCd);
						}
					}
					//移送依頼の場合
					if (!isNull(dtlR.rqst_to_loc_cd())) {
						MAM_LOC_R rqstToLoc = getLoc(dtlR.rqst_to_loc_cd());
						oldRqstWgCd = rqstToLoc.wg_cd();
						//依頼先ワーキンググループＣＤ
						dtlR.rqst_to_wg_cd(oldRqstWgCd);
					}
				}
				//手配区分が「在庫引当」の場合
				if (MAC_SLO_PROC_TYP.isALLOC(dtlR.proc_typ())){
					//依頼先ワーキンググループＣＤ
					dtlR.rqst_to_wg_cd(oldRqstWgCd);
				}
			}
		}

		/**
		 * 見積ヘッダのロック、更新カウンタチェック、空更新
		 * @param hdrR 受注ヘッダ
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkQtn(Slo_Upd01_HdrR hdrR) {
			
			MCMessageList msgL = new MCMessageList();
			
			if (_updCntrErr) {
				return msgL;
			}
			
			MST_QTN_R qtn = getQtnCache(hdrR.qtn_no(), hdrR.qtn_rev());
			
			if (!hdrR.upd_cntr_not_chk_flg()) {
				msgL.addAll(checkUpdCntrNE(hdrR, Slo_Upd01_HdrR.$qtn_upd_cntr, qtn));
			}
			
			if (isNull(_updQtnL)) {
				_updQtnL = MCList.create(MST_QTN_R.class);
			}
			_updQtnL.add(qtn);
			
			if (!msgL.isEmpty()) {
				_updCntrErr = true;
			}
			
			if (!isNull(qtn) && !qtn.isEmpty()) {
				hdrR.qtn_aprv_flg(qtn.aprv_flg());
				hdrR.qtn_aprv_no(qtn.aprv_no());
			}

			return msgL;
		}
		
		/**
		 * 見積ヘッダの空更新
		 */
		protected void updQtn() {
			
			if (!isNull(_updQtnL)) {
				dbTsUpdateKey("MSBBL6020_MST_QTN_U01", _updQtnL, MST_QTN_R.create("T"));
			}
		}

		/**
		 * 出荷進捗のロック、更新カウンタチェック、空更新
		 * @param hdrR 受注ヘッダ
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkShipPr(Slo_Upd01_HdrR hdrR) {
			
			MCMessageList msgL = new MCMessageList();
			
			if (_updCntrErr) {
				return msgL;
			}
			
			for (Slo_Upd01_DtlR dtlR : getAllDtlByHdrPegNo(hdrR.peg_no())) {
				if (!isNull(dtlR.ship_pr_no())) {
					MST_SHIP_PR_R spR = getFirstShipPrCache(dtlR.ship_pr_no());
					if (!dtlR.upd_cntr_not_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(dtlR, Slo_Upd01_DtlR.$ship_pr_upd_cntr,spR));
					}
					spR.setAlias("T");
					dbTsUpdateKey("MSBBL6020_MST_SHIP_PR_U01", spR, spR);
				}
			}
			if (!msgL.isEmpty()) {
				_cacheShipPrL = null;
				_updCntrErr = true;
			}
			return msgL;
		}

		/**
		 * 引当範囲区分、引当区分、総量引当場所G、出荷物流G、出荷場所の設定
		 * @param hdrR 受注ヘッダ
		 * @param srchSloAlloc 受注引当マスタ取得用の変数
		 * @return エラーメッセージ
		 */
		protected MCMessageList setAllocTyp(Slo_Upd01_HdrR hdrR, MSUCL_SlsUtil.SrchSloAlloc srchSloAlloc) {
			
			MCMessageList msgL = new MCMessageList();
			//上り電文の引当範囲区分が設定されている場合は、引当範囲区分に応じて総量引当場所Ｇ、出荷物流G、出荷場所が設定されている前提とする。
			for (Slo_Upd01_DtlR dtlR : getDtlByHdrPegNo(hdrR.peg_no())) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					continue;
				}
				if (hdrR.err_flg() || dtlR.err_flg()) {
					continue;
				}
				
				String strLgGrpCd;
				if (!isNull(dtlR.tdlv_cd())) {
					strLgGrpCd = dtlR.tdlv_lg_grp_cd();
				}
				else {
					strLgGrpCd = dtlR.dlv_lg_grp_cd();
				}
				String strItmShipGrpCd = dtlR.itm_ship_grp_cd();
				String strWgCd = hdrR.wg_cd();
				if (isNull(strLgGrpCd)) {
					strLgGrpCd = MAC_STR.NULL_VAL.value();
				}
				if (isNull(strItmShipGrpCd)) {
					strItmShipGrpCd = MAC_STR.NULL_VAL.value();
				}
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
					dtlR.def_loc_cd(MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt()));
				}
				else if (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ())) {
					MCRow bindMsg = MCRow.create();
					MAM_SLO_ALLOC_R allInfR = setRowAllocTyp(hdrR, dtlR, bindMsg, srchSloAlloc);
					if (isNull(allInfR)) {
						//受注引当マスタから、受注明細の引当範囲、方法、場所を決定できません。
						if (isNull(dtlR.loc_cd()) && isNull(dtlR.ship_lg_grp_cd()) && isNull(dtlR.alloc_grp_cd())){
							msgL.add(new MCMessage(dtlR, null, MSBBL0166, strLgGrpCd,strItmShipGrpCd,strWgCd,
									bindMsg.getStringNE("loc_cd"),
									bindMsg.getStringNE("lg_grp_cd"),
									bindMsg.getStringNE("alloc_grp_cd"),
									toDispGUIIndex(dtlR)));
						}
						else{
							msgL.add(new MCMessage(dtlR, null, MSBBL0172, strLgGrpCd,strItmShipGrpCd,strWgCd,
									bindMsg.getStringNE("loc_cd"),
									bindMsg.getStringNE("lg_grp_cd"),
									bindMsg.getStringNE("alloc_grp_cd"),
									toDispGUIIndex(dtlR)));
						}
					}
					else {
						if (!isNullOrNullVal(allInfR.loc_cd())) {
							// 引当場所
							MAM_LOC_R locR = getLoc(allInfR.loc_cd());
							if (isNull(locR) || locR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0296, allInfR.loc_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (!isNullOrNullVal(allInfR.ship_loc_cd())) {
							// 出荷場所
							MAM_LOC_R locR = getLoc(allInfR.ship_loc_cd());
							if (isNull(locR)|| locR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0297, allInfR.ship_loc_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (!isNullOrNullVal(allInfR.lg_grp_cd())) {
							//　引当物流Ｇ
							MAM_LG_GRP_R lgGrpR = getLgGrp(allInfR.lg_grp_cd());
							if (isNull(lgGrpR)|| lgGrpR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0298, allInfR.lg_grp_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (!isNullOrNullVal(allInfR.alloc_grp_cd())) {
							// 総量引当場所Ｇ
							MAM_ALLOC_GRP_R allocGrpR = getAllocGrp(allInfR.alloc_grp_cd());
							if (isNull(allocGrpR)|| allocGrpR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0299, allInfR.alloc_grp_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (isNull(dtlR.alloc_scope_typ())) {
							//引当範囲区分
							dtlR.alloc_scope_typ(allInfR.alloc_scope_typ());
						}
						//引当区分
						dtlR.alloc_typ(MAC_ALLOC_TYP.IMMED.value());
						if (isNull(dtlR.loc_cd())) {
							//場所ＣＤ
							dtlR.loc_cd(allInfR.loc_cd());
						}
						if (isNull(dtlR.ship_lg_grp_cd())) {
							//物流グループ
							dtlR.ship_lg_grp_cd(allInfR.lg_grp_cd());
						}
						if (isNull(dtlR.alloc_grp_cd())) {
							//総量引当場所グループ
							dtlR.alloc_grp_cd(allInfR.alloc_grp_cd());
						}
						//デフォルト出荷場所
						dtlR.def_loc_cd(allInfR.ship_loc_cd());
					}
				}
				else if (MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())
						|| MAC_SLO_PROC_TYP.isALLOC(dtlR.proc_typ())) {
					MCRow bindMsg = MCRow.create();
					MAM_SLO_ALLOC_R allInfR = setRowAllocTyp(hdrR, dtlR, bindMsg, srchSloAlloc);

					if (isNull(allInfR)) {
						//受注引当マスタから、受注明細の引当範囲、方法、場所を決定できません。
						if (isNull(dtlR.loc_cd()) && isNull(dtlR.ship_lg_grp_cd()) && isNull(dtlR.alloc_grp_cd())){
							msgL.add(new MCMessage(dtlR, null, MSBBL0166, strLgGrpCd,strItmShipGrpCd,strWgCd,
									bindMsg.getStringNE("loc_cd"),
									bindMsg.getStringNE("lg_grp_cd"),
									bindMsg.getStringNE("alloc_grp_cd"),
									toDispGUIIndex(dtlR)));
						}
						else{
							msgL.add(new MCMessage(dtlR, null, MSBBL0172, strLgGrpCd,strItmShipGrpCd,strWgCd,
									bindMsg.getStringNE("loc_cd"),
									bindMsg.getStringNE("lg_grp_cd"),
									bindMsg.getStringNE("alloc_grp_cd"),
									toDispGUIIndex(dtlR)));
						}
					}
					else {
						if (!isNullOrNullVal(allInfR.loc_cd())) {
							// 引当場所
							MAM_LOC_R locR = getLoc(allInfR.loc_cd());
							if (isNull(locR) || locR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0296, allInfR.loc_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (!isNullOrNullVal(allInfR.ship_loc_cd())) {
							// 出荷場所
							MAM_LOC_R locR = getLoc(allInfR.ship_loc_cd());
							if (isNull(locR)|| locR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0297, allInfR.ship_loc_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (!isNullOrNullVal(allInfR.lg_grp_cd())) {
							//　引当物流Ｇ
							MAM_LG_GRP_R lgGrpR = getLgGrp(allInfR.lg_grp_cd());
							if (isNull(lgGrpR)|| lgGrpR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0298, allInfR.lg_grp_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (!isNullOrNullVal(allInfR.alloc_grp_cd())) {
							// 総量引当場所Ｇ
							MAM_ALLOC_GRP_R allocGrpR = getAllocGrp(allInfR.alloc_grp_cd());
							if (isNull(allocGrpR)|| allocGrpR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0299, allInfR.alloc_grp_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (isNull(dtlR.alloc_scope_typ())) {
							//引当範囲区分
							dtlR.alloc_scope_typ(allInfR.alloc_scope_typ());
						}
						if (isNull(dtlR.alloc_typ())) {
							//引当区分
							dtlR.alloc_typ(allInfR.alloc_typ());
						}
						if (isNull(dtlR.loc_cd())) {
							//場所ＣＤ
							dtlR.loc_cd(allInfR.loc_cd());
						}
						if (isNull(dtlR.ship_lg_grp_cd())) {
							//物流グループ
							dtlR.ship_lg_grp_cd(allInfR.lg_grp_cd());
						}
						if (isNull(dtlR.alloc_grp_cd())) {
							//総量引当場所グループ
							dtlR.alloc_grp_cd(allInfR.alloc_grp_cd());
						}
						//デフォルト出荷場所
						dtlR.def_loc_cd(allInfR.ship_loc_cd());
					}
				}
				// 手配区分：なしは非在庫品のケース
				else if (!MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())) {
					MCRow bindMsg = MCRow.create();
					MAM_SLO_ALLOC_R allInfR = setRowAllocTyp(hdrR, dtlR, bindMsg, srchSloAlloc);

					if (isNull(allInfR)) {
						//受注引当マスタから、受注明細の引当範囲、方法、場所を決定できません。
						if (isNull(dtlR.loc_cd()) && isNull(dtlR.ship_lg_grp_cd()) && isNull(dtlR.alloc_grp_cd())){
							msgL.add(new MCMessage(dtlR, null, MSBBL0166, strLgGrpCd,strItmShipGrpCd,strWgCd,
									bindMsg.getStringNE("loc_cd"),
									bindMsg.getStringNE("lg_grp_cd"),
									bindMsg.getStringNE("alloc_grp_cd"),
									toDispGUIIndex(dtlR)));
						}
						else{
							msgL.add(new MCMessage(dtlR, null, MSBBL0172, strLgGrpCd,strItmShipGrpCd,strWgCd,
									bindMsg.getStringNE("loc_cd"),
									bindMsg.getStringNE("lg_grp_cd"),
									bindMsg.getStringNE("alloc_grp_cd"),
									toDispGUIIndex(dtlR)));
						}
					}
					else {
						if (!isNullOrNullVal(allInfR.loc_cd())) {
							// 引当場所
							MAM_LOC_R locR = getLoc(allInfR.loc_cd());
							if (isNull(locR) || locR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0296, allInfR.loc_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (!isNullOrNullVal(allInfR.ship_loc_cd())) {
							// 出荷場所
							MAM_LOC_R locR = getLoc(allInfR.ship_loc_cd());
							if (isNull(locR)|| locR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0297, allInfR.ship_loc_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (!isNullOrNullVal(allInfR.lg_grp_cd())) {
							//　引当物流Ｇ
							MAM_LG_GRP_R lgGrpR = getLgGrp(allInfR.lg_grp_cd());
							if (isNull(lgGrpR)|| lgGrpR.isEmpty()) {
								msgL.add(new MCMessage(dtlR, null, MSBBL0298, allInfR.lg_grp_cd(), toDispGUIIndex(dtlR)));
								continue;
							}
						}
						if (isNull(dtlR.loc_cd())) {
							//場所ＣＤ
							dtlR.loc_cd(allInfR.loc_cd());
						}
						if (isNull(dtlR.ship_lg_grp_cd())) {
							//物流グループ
							dtlR.ship_lg_grp_cd(allInfR.lg_grp_cd());
						}
						//デフォルト出荷場所
						dtlR.def_loc_cd(allInfR.ship_loc_cd());
					}
				}
				// 指図区分：ピッキングなしは、場所やデフォルト出荷場所などをクリアする
				else {
					dtlR.loc_cd(null);
					dtlR.ship_lg_grp_cd(null);
					dtlR.def_loc_cd(null);
				}
			}
			setErrFlg(msgL);
			return msgL;
		}

		/**
		 * 依頼先場所CDの存在チェック
		 * @param dtlR 受注明細
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkRqstToLocCd(Slo_Upd01_DtlR dtlR) {
			MCMessageList msgL = new MCMessageList();
			
			//明細の場所、或は通常場所のWG_CDを取得
			MAM_LOC_R locR = getLoc(nvl(dtlR.loc_cd(), dtlR.def_loc_cd()));
			String oldRqstWgCd = locR.wg_cd();
			if (!isNull(oldRqstWgCd)) {
				// 物流制御マスタより移動ＬＴを取得
				MCNumber xfrLt = getXfrLt(dtlR, locR); 
				
				Comparable<?>[] vals = new Comparable[]{
						dtlR.itm_cd(), 
						dtlR.itm_sub1(), 
						dtlR.itm_sub2(),
						dtlR.itm_sub3(),
						oldRqstWgCd,
						dtlR.rqst_to_loc_cd()};
		
				MCList<MAM_ITM_DTL_R> itmDtlL = object(CLAZZ)._itmDtlL.subList(_itmDtlLocIdxkey, vals);
				itmDtlL.sort(SortType.DESC, MAM_ITM_DTL_R.$st_dt);

				if (isSame(_sysParm, "1")) {
					if (!itmDtlL.isEmpty()) {
						MCList<MAM_ITM_DTL_R> tmpItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
						for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
							// 適用範囲内チェック
							if (!isNull(dtlR.ship_schd_tm()) && itmDtlR.st_dt().lte(dtlR.ship_schd_tm()) && itmDtlR.end_dt().gte(dtlR.ship_schd_tm())) {
								tmpItmDtlL.add(itmDtlR);
							}
						}
						int iCnt = tmpItmDtlL.size();
						if (iCnt <= 0) {
							MCMessage msg = new MCMessage(dtlR, null, MSBBL0193,
									toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(),
											dtlR.itm_sub3()),
									dtlR.rqst_to_loc_cd(), oldRqstWgCd,
									toYMDString(dtlR.ship_schd_tm()), toDispGUIIndex(dtlR));
							msgL.add(msg);
						}
					}
				} else {
					if (!itmDtlL.isEmpty()) {
						for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
							// 品目詳細マスタ参照の基準日取得
							MCDate refBaseDt = getCalDateLoc(
									dtlR.ship_schd_tm(),
									xfrLt.multiply(-1),
									false,
									dtlR.rqst_to_loc_cd(),
									true);
							
							// 適用範囲内チェック
							if (!isNull(refBaseDt) && itmDtlR.st_dt().lte(refBaseDt) && itmDtlR.end_dt().gte(refBaseDt)) {
								return msgL;
							}
						}
					}
					
					// 対象となりえる品目詳細マスタが存在しない、あるいは、適用範囲外だった場合はエラー
					MCMessage msg = new MCMessage(dtlR, null, MSBBL0406,
							toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(),
									dtlR.itm_sub3()),
							dtlR.rqst_to_loc_cd(), oldRqstWgCd,
							toYMDString(dtlR.ship_schd_tm()), toDispGUIIndex(dtlR));
					msgL.add(msg);
				}
			}
			return msgL;
		}
		
		/**
		 * 物流制御マスタより移動ＬＴを取得
		 * 
		 * @param dtlR
		 * @param locR
		 * @return 移動ＬＴ
		 */
		protected MCNumber getXfrLt(Slo_Upd01_DtlR dtlR, MAM_LOC_R locR) {
			
			MAM_LOC_R rqstLocR = getLoc(dtlR.rqst_to_loc_cd());
			// 物流制御マスタより移動ＬＴを取得
			MAM_LG_CTL_R lgCtlR = _lgCtlL.getFirst(_lgCtlIdxkey, rqstLocR.lg_grp_cd(), locR.lg_grp_cd(), nvl(dtlR.ship_term_cd(), MAC_STR.NULL_VAL.value()));
			
			return !isNull(lgCtlR) && !isNull(lgCtlR.xfr_lt()) ? lgCtlR.xfr_lt() : MCNumber.ZERO;
		}
		
		/**
		 * 引数に指定された条件で物流制御マスタを取得する。
		 * @param dtlL 受注明細リスト
		 */
		protected void getLgCtl(MCList<Slo_Upd01_DtlR> dtlL) {
			
			MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
			for (Slo_Upd01_DtlR dtlR : dtlL.groupBy(Slo_Upd01_DtlR.$rqst_to_loc_cd)) {
				if (!isNull(dtlR.rqst_to_loc_cd())) {
					MAM_LOC_R rqstLocR = getLoc(dtlR.rqst_to_loc_cd());
					bindL.add(rqstLocR);
				}
			}
			
			if (!bindL.isEmpty()) {
				
				_lgCtlL = MCList.create(MAM_LG_CTL_R.class);
				
				MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create("T");
				MCQueryApiBuilder lgCtlR_bldr = MCQueryApiBuilder.create(lgCtlR);
				
				lgCtlR_bldr.setSelect(lgCtlR.xfr_lt, lgCtlR.fr_lg_grp_cd, lgCtlR.to_lg_grp_cd, lgCtlR.ship_term_cd);
				lgCtlR_bldr.setWhere(lgCtlR.fr_lg_grp_cd.eq(bind("lg_grp_cd")));
				
				dbSelect("MSBBL6020_MAM_LG_CTL_S01", _lgCtlL, lgCtlR_bldr, bindL);
				
				_lgCtlIdxkey = _lgCtlL.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd,
						MAM_LG_CTL_R.$to_lg_grp_cd,
						MAM_LG_CTL_R.$ship_term_cd);
			}
		}
		
		/**
		 * 発注先ＣＤ、メーカＣＤの存在チェック
		 * @param dtlR 受注明細
		 * @return　エラーメッセージ
		 */
		protected MCMessageList chkSpplCdMakerCd(Slo_Upd01_DtlR dtlR) {
			
			MCMessageList msgL = new MCMessageList();
			
			Slo_Upd01_HdrR hdrR = getHdrByPegNo(dtlR.hdr_peg_no());
			
			String oldRqstWgCd = "";
			MCDate tmpBaseDt = null;
			MCDate baseDt = null;
			//仕入直送の場合
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
				//仕入直送の場合、売上部門で場所マスタから場所CDを取得する
				String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
				//場所マスタからWG_CDを取得する。
				MAM_LOC_R midlocR = getLoc(midLocCd);
				oldRqstWgCd = midlocR.wg_cd();
				if (isSame(_sysParm, "1")) {
					baseDt = dtlR.dlv_rqst_tm();
				} else {
					tmpBaseDt = dtlR.dlv_rqst_tm();
				}
			}
			else {
				//明細の場所、或は通常場所のWG_CDを取得
				MAM_LOC_R locR = getLoc(nvl(dtlR.loc_cd(), dtlR.def_loc_cd()));
				oldRqstWgCd = locR.wg_cd();
				if (isSame(_sysParm, "1")) {
					baseDt = dtlR.ship_schd_tm();
				} else {
					tmpBaseDt = dtlR.ship_schd_tm();
				}
			}
			if (!isNull(oldRqstWgCd)) {
				if (!isSame(_sysParm, "1")) {
					// 購買ユーティリティ呼出
					baseDt = callPurcUtilSrch01(tmpBaseDt, dtlR, hdrR.slo_dt(), hdrR.sls_dpt_cd());
					if (isNull(baseDt)) {
						String msgId = null;
						if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
							msgId = MSBBL0408;
						}
						else {
							msgId = MSBBL0407;
						}
						boolean outsrcFlg = !isNullOrNullVal(dtlR.getStringNE("mfg_loc_cd"));
						MCMessage msg = new MCMessage(dtlR, null, msgId,
								toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(),
										dtlR.itm_sub3()),
								oldRqstWgCd,
								outsrcFlg ? dtlR.getStringNE("bom_ptn") : MAC_STR.NULL_VAL.value(),
								outsrcFlg ? dtlR.getStringNE("mfg_loc_cd") : MAC_STR.NULL_VAL.value(),
								outsrcFlg ? MAC_STR.NULL_VAL.value() : dtlR.sppl_cd(),
								nvl(dtlR.maker_cd(), MAC_STR.NULL_VAL.value()),
								toYMDString(tmpBaseDt), toDispGUIIndex(dtlR));
						msgL.add(msg);
						return msgL;
					}
				}
				// 外注発注先も対象と出来るよう、製造場所が発注先のレコードも対象とする。
				Comparable<?>[] vals = new Comparable[]{
						dtlR.itm_cd(), 
						dtlR.itm_sub1(), 
						dtlR.itm_sub2(),
						dtlR.itm_sub3(),
						oldRqstWgCd};
				MCList<MAM_ITM_DTL_R> itmDtlL = object(CLAZZ)._itmDtlL.subList(_itmDtlLocIdxkey, vals);
				itmDtlL.sort(SortType.DESC, MAM_ITM_DTL_R.$st_dt);
				if (!itmDtlL.isEmpty()) {
					MCList<MAM_ITM_DTL_R> tmpItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
					for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
						if ((MAC_STR.isNULL_VAL(itmDtlR.mfg_loc_cd()) && 
								isSame(itmDtlR.sppl_cd(), dtlR.sppl_cd()) &&
								isSame(itmDtlR.maker_cd(), nvl(dtlR.maker_cd(), MAC_STR.NULL_VAL.value()))) 
								|| (MAC_STR.isNULL_VAL(itmDtlR.sppl_cd()) && 
										isSame(itmDtlR.getStringNE("loc_sppl_cd"), dtlR.sppl_cd()) &&
										isSame(nvl(itmDtlR.getStringNE("loc_maker_cd"), MAC_STR.NULL_VAL.value()), nvl(dtlR.maker_cd(), MAC_STR.NULL_VAL.value())))) {
							// 適用範囲内チェック
							if (!isNull(baseDt) && itmDtlR.st_dt().lte(baseDt) && itmDtlR.end_dt().gte(baseDt)) {
								tmpItmDtlL.add(itmDtlR);
							}
						}
					}
					int iCnt = tmpItmDtlL.size();
					if (iCnt <= 0) {
						MCMessage msg = new MCMessage(dtlR, null, MSBBL0193,
								toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(),
										dtlR.itm_sub3()),
								dtlR.rqst_to_loc_cd(), oldRqstWgCd,
								toYMDString(dtlR.ship_schd_tm()), toDispGUIIndex(dtlR));
						msgL.add(msg);
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 承認ヘッダ情報が変更されたかどうか。
		 * @param hdrR 受注ヘッダ
		 * @return 変更された場合はtrue
		 */
		protected boolean isAprvHdrChanged(Slo_Upd01_HdrR hdrR){
			
			if (isSame(_cacheSloR.sls_usr_cd(), hdrR.sls_usr_cd())//業務担当者ＣＤ
					&& isSame(_cacheSloR.slo_dt(), hdrR.slo_dt()) //承認マスタ適用日
					&& isSame(_cacheSloR.sls_dpt_cd(), hdrR.sls_dpt_cd()) //承認作成元部門ＣＤ
					&& isSame(_cacheSloR.cst_cd(), hdrR.cst_cd()) //承認作成元取引先ＣＤ
					&& isSame(_cacheSloR.trd_cur_cd(), hdrR.trd_cur_cd()) //承認作成元通貨ＣＤ１					
			) {
				return false;
			}
			else {
				return true;
			}
		}
		
		/**
		 * 承認明細情報が変更されたかどうか。
		 * @param newSloDR 変更後受注明細
		 * @param oldSloDR 変更前受注明細
		 * @return 変更された場合はtrue
		 */
		protected boolean isAprvDtlChanged(Slo_Upd01_DtlR newSloDR, MST_SLO_D_R oldSloDR) {
			
			if (isSame(oldSloDR.abort_flg(), newSloDR.abort_flg())//打切ＦＬＧ
					&& isSame(oldSloDR.itm_cd(), newSloDR.itm_cd()) //品目ＣＤ
					&& isSame(oldSloDR.itm_sub1(), newSloDR.itm_sub1())
					&& isSame(oldSloDR.itm_sub2(), newSloDR.itm_sub2())
					&& isSame(oldSloDR.itm_sub3(), newSloDR.itm_sub3())
					&& isSame(oldSloDR.trd_unit_cd(), newSloDR.trd_unit_cd())
					&& isSame(oldSloDR.trd_unit_qty(), newSloDR.trd_unit_qty())
					&& isSame(oldSloDR.trd_cur_upri(), newSloDR.trd_cur_upri())
					&& isSame(oldSloDR.trd_cur_dscnt_amt(), newSloDR.trd_cur_dscnt_amt())
					&& isSame(oldSloDR.tax_cd(), newSloDR.tax_cd())
					&& isSame(oldSloDR.wtax_rate(), newSloDR.wtax_rate())
			) {
				return false;
			}
			else {
				return true;
			}
		}
		
		/**
		 * 承認情報が変更されたかどうか。
		 * @param hdrR 受注ヘッダ
		 * @return 変更された場合はtrue
		 */
		protected boolean isAprvChanged(Slo_Upd01_HdrR hdrR) {
			
			boolean isDtlChanged = false;
			for (Slo_Upd01_DtlR dtlR : getDtlByHdrPegNo(hdrR.peg_no())) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					isDtlChanged = true;
					break;
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())){
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
					if (isAprvDtlChanged(dtlR, oldSloDR)){
						//承認に絡む項目が変更された場合
						isDtlChanged = true;
						break;
					}
				}
			}
			if (isDtlChanged || isAprvHdrChanged(hdrR)){
				return true;
			}
			else{
				return false;
			}
		}
		
		protected MCList<MST_IV_D_R> _cacheIvDL = null;
		protected MCIndexKey _ivDListKey = null;
		
		/**
		 * 固有エラーチェック
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList chkOther() {
			
			MCMessageList msgL = new MCMessageList();
			
			getMstCache(up0(), up1());
			getQtnDCache(up1());
			_cacheShipSchdL = getShipSchdCache(up1());
			getIvDCache(up1());
			
			MCList<Slo_Upd01_HdrR> noErrHdrList = getChkList(up0());
			for (Slo_Upd01_HdrR hdrR : noErrHdrList) {
				
				_cacheSloR = getMultiSloCache(hdrR);
				_cacheSloDL = getMultiSloDCache(hdrR);
				
				// 条件付必須チェック
				//取引が売上のときは必須
				if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
					//売上計上区分
					msgL.addAll(check(hdrR, Slo_Upd01_HdrR.$sls_basis_typ,
							new FXUCL_RequiredValidater()));
					//取引通貨ＣＤ
					msgL.addAll(check(hdrR, Slo_Upd01_HdrR.$trd_cur_cd,
							new FXUCL_RequiredValidater()));
					// 為替レート
					msgL.addAll(check(hdrR, Slo_Upd01_HdrR.$xrate,
							new FXUCL_RequiredValidater()));
					// 納税通貨が設定されている場合
					if (!isNull(getCo().ptax_cur_cd())) {
						// 納税レート
						msgL.addAll(check(hdrR, Slo_Upd01_HdrR.$ptax_xrate,
								new FXUCL_RequiredValidater()));
					}
					//債権部門ＣＤ
					msgL.addAll(check(hdrR, Slo_Upd01_HdrR.$ar_dpt_cd,
							new FXUCL_RequiredValidater()));
				
					//前受金出荷制御区分に「出荷不可」を指定した場合
					if (MSC_ADV_SHIP_CTRL_TYP.isSHIP_STOP(hdrR.adv_ship_ctrl_typ())){
						//前受金請求額
						msgL.addAll(check(hdrR, Slo_Upd01_HdrR.$adv_bill_amt,
								new FXUCL_RequiredValidater()));
					}
				}
				//1.取引先禁止マスタ
				//取引先禁止マスタに、受注日　>=　受注禁止日、かつ取引先CD＝チェック対象の得意先ＣＤのレコードが存在すれば、エラーとする
				if (isBpStop(hdrR)){
					MCMessage msg = new MCMessage(hdrR, Slo_Upd01_HdrR.$cst_cd, MSBBL0194,hdrR.cst_cd());
					msgL.add(msg);
				}
				//6.船積予定日、船卸予定日
				//経由予定日がNULLの場合、船積予定日 <= 船卸予定日になっていない場合はエラーとする。
				// 船積予定日 <= 船卸予定日			
				String[] cols = new String []{Slo_Upd01_HdrR.$etd_dt, Slo_Upd01_HdrR.$eta_dt};
				msgL.addAll(check(up0(), cols, new FXUCL_BeforeAfterValidater()));			
				// 船積予定日 <= 経由予定日 <= 船卸予定日
				String[] cols1 = new String []{Slo_Upd01_HdrR.$etd_dt, Slo_Upd01_HdrR.$via_schd_dt};
				String[] cols2 = new String []{Slo_Upd01_HdrR.$via_schd_dt, Slo_Upd01_HdrR.$eta_dt};
				msgL.addAll(check(up0(), cols1, new FXUCL_BeforeAfterValidater()));
				msgL.addAll(check(up0(), cols2, new FXUCL_BeforeAfterValidater()));			
				
				//9.港の重複チェック
				//船積港＝船卸港、或は船積港＝経由地、或は船卸港＝経由地の場合はエラーとする。
				if ((!isNull(hdrR.load_port_cd()) && !isNull(hdrR.dschrg_port_cd()))
						|| (!isNull(hdrR.load_port_cd()) && !isNull(hdrR.via_port_cd()))
						|| (!isNull(hdrR.dschrg_port_cd()) && !isNull(hdrR.via_port_cd()))){
					if (isSame(hdrR.load_port_cd(), hdrR.dschrg_port_cd())
							|| isSame(hdrR.load_port_cd(), hdrR.via_port_cd())
							|| isSame(hdrR.dschrg_port_cd(), hdrR.via_port_cd())){
						MCMessage msg = new MCMessage(hdrR, Slo_Upd01_HdrR.$load_port_cd, MSBEL0077);
						msgL.add(msg);
					}
				}
				//33.承認状況チェック
				//更新対象の受注が一次承認済または最終承認済、かつ承認が更新不可の場合に,
				//承認に絡む項目の変更がある場合、エラーとする。
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())){
					if (MAC_APRV_STS_TYP.isACPT(hdrR.old_aprv_sts_typ())
							|| MAC_APRV_STS_TYP.isFIX(hdrR.old_aprv_sts_typ())){
						//引戻がオンの場合、後続作業が行ったら、エラーとする
						if (hdrR.aprv_back_flg()){
							if (MSUCL_SlsUtil.isSloNextOper(hdrR.slo_no())) {							
								MCMessage msg = new MCMessage(hdrR, null, MSBBL0168);
								msgL.add(msg);
							}
						}
						if (!hdrR.old_can_upd_flg()){
							if (isAprvChanged(hdrR)) {
								MCMessage msg = new MCMessage(hdrR, null, MSBBL0157);
								msgL.add(msg);
							}
						}
					}
				}
				//43.指図区分の組合せチェック
				//新規追加・更新時に、指図区分「2：ピッキングなし」の明細のみだった場合にエラーとする。
				//(「2：ピッキングなし」は、出荷指図時に「1：ピッキングあり」の明細とセットで指図対象とするため。）
				//指図区分「2：ピッキングなし」の明細の件数の取得
				int noPicking = 0;
				int noShipping = 0;
				int remAbort = 0;
				int others = 0;
				for (Slo_Upd01_DtlR dtlR : getAllDtlByHdrPegNo(hdrR.peg_no())) {
					//削除、打切りのレコードを除外する。
					if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && !(dtlR.abort_flg() && !dtlR.rem_abort_flg())){
						if (MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())){
							if(MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
								MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
								if (!isNull(oldShipPrR) && oldShipPrR.ship_inst_qty().gt(0)  && oldShipPrR.ship_inst_qty().lt(dtlR.base_unit_qty())){
									noShipping++;
								}
							}
							noPicking++;
							//ピッキングなしのレコードが預り売上だった場合、エラー出力
							if(dtlR.sls_cststk_flg()) {
								MCAppException ex = new MCAppException(new MCMessage(dtlR,
										Slo_Upd01_DtlR.$sls_cststk_flg, MSBBL0292, toDispGUIIndex(dtlR)));
								throw ex;
							}
						}
						else if (MAC_SHIP_INST_TYP.isPICK(dtlR.ship_inst_typ())){
							others++;
							if (dtlR.abort_flg() && dtlR.rem_abort_flg()){
								remAbort++;
							}
						}
					}
				}	
				if ((others == 0 && noPicking > 0) || (remAbort > 0 && noShipping > 0)){
					MCMessage msg = new MCMessage(hdrR, null, MSBBL0195);
					msgL.add(msg);
				}
				// 見積引継明細存在チェック
				if (hasQtn(hdrR)) {
					boolean isExists = false;
					MCList<Slo_Upd01_DtlR> list = getAllDtlByHdrPegNo(hdrR.peg_no());
					//全行打ち切りの場合はチェック不要
					if(list.subList(r->(r.abort_flg() == false) || (r.abort_flg() == true && r.rem_abort_flg())).size() !=0) {
						for (Slo_Upd01_DtlR dtlR : list) {
							//削除、打切りのレコードを除外する。
							if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && !(dtlR.abort_flg() && !dtlR.rem_abort_flg())){
								if (!isNull(dtlR.qtn_d_no())) {
									isExists = true;
									break;
								}
							}
						}
						if (!isExists) {
							msgL.add(new MCMessage(hdrR, null, MSBBL0095));
						}
					}
				}
				
				//受注時にインボイスNOが指定された場合のチェック			
				if (hdrR.iv_num_flg() || !isNull(hdrR.iv_no())){
					//明細の納品先、配送先の混在は不可
					MCList<Slo_Upd01_DtlR> grpL = MCList.create(Slo_Upd01_DtlR.class);
					boolean hasNewR = false;
					MCNumber totalIvSchdQty = MCNumber.ZERO;
					for (Slo_Upd01_DtlR dtlR : getAllDtlByHdrPegNo(hdrR.peg_no())) {
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) || dtlR.abort_flg()) {
							continue;
						}
						//手配区分：仕入直送は不可
						if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
							//インボイスNO指定した場合、仕入直送の受注明細が登録不可。
							MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$proc_typ, MSBBL0222, toDispGUIIndex(dtlR));
							msgL.add(msg);
						}
						//出荷予定分割区分は、分割しないで固定　
						if (MAC_SHIP_SCHD_SPLIT_TYP.isAUTO_SPLIT(dtlR.ship_schd_split_typ())){
							//インボイスNO指定した場合、出荷予定分割区分を「分割しない」で指定してください。
							MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$ship_schd_split_typ, MSBBL0223, toDispGUIIndex(dtlR));
							msgL.add(msg);
						}
						//出荷物流Ｇと場所の両方がNULLの場合エラーとする。
						if (isNull(dtlR.ship_lg_grp_cd()) && isNull(dtlR.loc_cd())){
							if (!MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())){
								MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$ship_lg_grp_cd, MSBBL0224, toDispGUIIndex(dtlR));
								msgL.add(msg);
							}
						}
						//47.インボイス登録後チェック  更新時の行追加行
						//受注時にインボイスNOを指定した受注で、出荷指図がされていたら行追加ではエラーとする。
						if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())){
							if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())){
								hasNewR = true;
							}
							else{
								//キャッシュから対応する更新前の出荷進捗を取得する。
								MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
								MCNumber ivSchdQty = oldShipPrR.iv_schd_qty();
								if (isNull(ivSchdQty)){
									ivSchdQty = MCNumber.ZERO;
								}
								totalIvSchdQty = totalIvSchdQty.add(ivSchdQty);
								
							}
						}
						grpL.add(dtlR);
					}
					
					if (totalIvSchdQty.gt(0) && hasNewR){
						for (Slo_Upd01_DtlR dtlR : getAllDtlByHdrPegNo(hdrR.peg_no())) {
							if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())){
								//インボイス登録済のため、受注明細を追加できません
								MCMessage msg = new MCMessage(dtlR, null, MSBBL0201, toDispGUIIndex(dtlR));
								msgL.add(msg);
							}
						}
					}
					
					//明細の納品先は混在不可
					String[] gColsDlvCd = new String[] {Slo_Upd01_DtlR.$dlv_cd};
					MCGroupByPolicy gpDlvCd = new MCGroupByPolicy(gColsDlvCd);
					MCList<Slo_Upd01_DtlR> dlvL = grpL.groupBy(gpDlvCd);
					if (dlvL.size() > 1){
						MCMessage msg = new MCMessage(MSBBL0226);
						msgL.add(msg);
					}
					
					//明細の配送先は混在不可
					String[] gColsTdlvCd = new String[] {Slo_Upd01_DtlR.$tdlv_cd};
					MCGroupByPolicy gpTdlvCd = new MCGroupByPolicy(gColsTdlvCd);
					MCList<Slo_Upd01_DtlR> tdlvL = grpL.groupBy(gpTdlvCd);
					if (tdlvL.size() > 1){
						MCMessage msg = new MCMessage(MSBBL0227);
						msgL.add(msg);
					}
					
					//出荷物流Gは混在不可
					MCList<Slo_Upd01_DtlR> lgGrpChkL = grpL.subList(Slo_Upd01_DtlR.$ship_inst_typ, MAC_SHIP_INST_TYP.PICK.value());
					lgGrpChkL.addAll(grpL.subList(Slo_Upd01_DtlR.$ship_inst_typ, MAC_SHIP_INST_TYP.NON.value()));
					String prevShipLgGrpCd = null;
					String thisShipLgGrpCd = null;
					for (Slo_Upd01_DtlR lgGrpChkR : lgGrpChkL) {
						if (isNull(lgGrpChkR.ship_lg_grp_cd())) {
							MAM_LOC_R locR = getLoc(lgGrpChkR.loc_cd());
							thisShipLgGrpCd = locR.lg_grp_cd();
						}
						else {
							thisShipLgGrpCd = lgGrpChkR.ship_lg_grp_cd();
						}
						if (!isNull(prevShipLgGrpCd) && !isSame(thisShipLgGrpCd, prevShipLgGrpCd)){
							MCMessage msg = new MCMessage(MSBBL0232);
							msgL.add(msg);
							break;
						}
						prevShipLgGrpCd = thisShipLgGrpCd;
					}
				}
				
				//ヘッダの品揃区分が品揃するとした場合は全明細、品揃GNOを設定した場合はそれらの明細で、
				//以下の項目は同じにするようチェックする。・出荷物流G・納品先・配送先
				if (MSC_SHIP_ASSORT_TYP.isAST(hdrR.assort_typ())) {
					MCList<Slo_Upd01_DtlR> grpL = MCList.create(Slo_Upd01_DtlR.class);
					for (Slo_Upd01_DtlR dtlR : getAllDtlByHdrPegNo(hdrR.peg_no())) {
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
								|| dtlR.abort_flg()
								|| MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())) {
							continue;
						}
						grpL.add(dtlR);
					}
					setShipLgGrpCd(grpL);
					String[] gColsChkCd = new String[] {Slo_Upd01_DtlR.$dlv_cd, Slo_Upd01_DtlR.$tdlv_cd, "shipLgGrpCd"};
					MCGroupByPolicy gpChkCd = new MCGroupByPolicy(gColsChkCd);
					MCList<Slo_Upd01_DtlR> gpChkL = grpL.groupBy(gpChkCd);
					if (gpChkL.size() > 1) {
						MCMessage msg = new MCMessage(MSBBL0310);
						msgL.add(msg);
					}
				}
				else {
					MCList<Slo_Upd01_DtlR> setGrpL = getDtlByHdrPegNo(hdrR.peg_no()).clone();
					setShipLgGrpCd(setGrpL);
					setGrpL.sort(Slo_Upd01_DtlR.$set_itm_grp_no);
					Slo_Upd01_DtlR chkR = null;
					for (Slo_Upd01_DtlR dtlR : setGrpL) {
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
								|| dtlR.abort_flg()
								|| MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())) {
							continue;
						}
						if (!isNull(dtlR.set_itm_grp_no())) {
							if (!isNull(chkR)) {
								if (isSame(dtlR.set_itm_grp_no(), chkR.set_itm_grp_no())) {
									if (!isSame(dtlR.getStringNE("shipLgGrpCd"), chkR.getStringNE("shipLgGrpCd"))
											|| !isSame(dtlR.dlv_cd(), chkR.dlv_cd())
											|| !isSame(dtlR.tdlv_cd(), chkR.tdlv_cd())) {
										MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$set_itm_grp_no, MSBBL0311,toDispGUIIndex(dtlR));
										msgL.add(msg);
									}
								}
							}
							chkR = dtlR;
						}
						
					}
				}
			
				msgL.addAll(chkSloTyp(hdrR));
				msgL.add(chkAdvShipCtrlTyp(hdrR));
				msgL.addAll(chkUnmodififiableColumnChange(hdrR, getDtlByHdrPegNo(hdrR.peg_no())));
				for (Slo_Upd01_DtlR dtlR : getDtlByHdrPegNo(hdrR.peg_no())) {
				
					MST_SLO_D_R oldSloDR = null;
					MST_SHIP_PR_R oldShipPrR = null;
					
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
						oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
					}
					
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						//預り売上
						if (dtlR.sls_cststk_flg()) {
							if (oldShipPrR.iv_schd_qty().gt(0) || oldShipPrR.iv_act_qty().gt(0)) {
								MCMessage msg = new MCMessage(dtlR, null, MSBBL0641,
										dtlR.slo_d_no(), toDispGUIIndex(dtlR));
								msgL.add(msg);
							}
							else if (oldShipPrR.sls_qty().gt(0)) {
								MCMessage msg = new MCMessage(dtlR, null, MSBBL0234,
										dtlR.slo_d_no(), toDispGUIIndex(dtlR));
								msgL.add(msg);
							}
						}
						//通常売上
						else {
							if (oldShipPrR.ship_inst_qty().gt(0) || oldShipPrR.ship_act_qty().gt(0) ||
									oldShipPrR.iv_schd_qty().gt(0) || oldShipPrR.iv_act_qty().gt(0) ||
									oldShipPrR.sls_qty().gt(0)){
								MCMessage msg = new MCMessage(dtlR, null, MSBBL0199, dtlR.slo_d_no());
								msgL.add(msg);
							}
						}
					}
					
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						continue;
					}
					
					// 出荷予定または売上予定で一部でも打切していたら、受注では打切できない
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
							&& !oldSloDR.abort_flg()
							&& dtlR.abort_flg() && !dtlR.rem_abort_flg()
							&& !isNull(oldShipPrR)
							&& !oldShipPrR.isEmpty()
							&& (oldShipPrR.ship_schd_abort_qty().isPositive() || oldShipPrR.sls_schd_abort_qty().isPositive())) {
						
						msgL.add(new MCMessage(dtlR, Slo_Upd01_DtlR.$abort_flg, MSBBL0215, dtlR.slo_d_no(), toDispGUIIndex(dtlR)));
					}
					//貸出と預りの両方がオンにできない
					if (dtlR.vmi_flg() && dtlR.sls_cststk_flg()){
						MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$vmi_flg,
								MSBBL0236, toDispGUIIndex(dtlR));
						msgL.add(msg);
					}
					//売上、貸出FLG＝オフの場合、必須
					if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ()) && !dtlR.vmi_flg()) {
						//単価
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$trd_cur_upri,
								new FXUCL_RequiredValidater()));
						// 税ＣＤ
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$tax_cd,
								new FXUCL_RequiredValidater()));
						//請求遅延回数
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$bill_crryovr_times,
								new FXUCL_RequiredValidater()));
						//販売単価取得区分					
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sls_upri_req_typ, new FXUCL_RequiredValidater()));						
					}
					//非在庫品だとNULLなので渡せない
					if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
						//格付ＣＤ:
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$gd_cd, new FXUCL_RequiredValidater()));	
						//手配区分
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$proc_typ, new FXUCL_RequiredValidater()));	
						//出荷予定分割区分
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$ship_schd_split_typ, new FXUCL_RequiredValidater()));	
					}
					//配送先ＣＤ
					//配送先経由区分＝「経由する」の場合は必須項目。もしくは納品先の配送先必須ＦＬＧがオンの場合に必須。
					if (!MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ()) && (MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ()) || dtlR.tdlv_req_flg())){
						//配送先ＣＤ
						if(needsGetMst(dtlR)) {
							msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$tdlv_cd, new FXUCL_RequiredValidater()));
						}
					}
					//インボイス対象取引でない得意先の場合は、配送先経由区分は「2：経由しない」で固定
					if (!hdrR.cst_iv_flg() && !MAC_VIA_DLV_TYP.isNOT_VIA(dtlR.via_dlv_typ())){ 					
						MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$tdlv_cd,
								MSBBL0221, toDispGUIIndex(dtlR));
						msgL.add(msg);				
					}				
					
					//販売単価取得区分が「納入希望日」の場合、納入希望日は入力必須にする。
					if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(dtlR.sls_upri_req_typ())){
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$dlv_rqst_tm, new FXUCL_RequiredValidater()));	
					}
					//販売単価取得区分が「売上予定日」または預り売上の場合、売上予定日は入力必須にする。
					if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(dtlR.sls_upri_req_typ()) || dtlR.sls_cststk_flg()){
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sls_schd_dt, new FXUCL_RequiredValidater()));	
					}				
					//2.品目禁止マスタ
					//品目禁止マスタに、受注日　>=　受注禁止日、かつ品目ＣＤ＝チェック対象の品目ＣＤのレコードが存在すれば、エラーとする。
					//※品目の発注禁止チェックは出荷・供給依頼サービス側にてチェックする。
					if (isItmStop(dtlR)){
						MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$itm_cd, MSBBL0196,toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(),
								dtlR.itm_sub2(), dtlR.itm_sub3()), toDispGUIIndex(dtlR));
						msgL.add(msg);
					}
					//3.ロット存在チェックチェック
					//ロット管理しない、在庫のみサブロット管理する品目の考慮のため、ロット・サブロットリストVでロットチェックを実施する。
					msgL.add(chkLot(dtlR));

					//4.引当禁止ロット情報T 引当禁止ロットチェック
					if (!isNull(dtlR.lot_no())){
						if (isAllocStopLot(dtlR)){
							MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$lot_no, MSBEL0019,toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(),
									dtlR.itm_sub2(), dtlR.itm_sub3()), dtlR.lot_no(),dtlR.sublot_no(), toDispGUIIndex(dtlR));
							msgL.add(msg);
						}
					}
					
					//5.輸出規制マスタ 輸出規制チェック
					//海外得意先の場合、品目ＣＤに対応するＨＳＣＤが輸出規制品目マスタに存在する場合、エラーとする。
					if (hdrR.cst_iv_flg()){ //インボイス取引
						if (!isNull(dtlR.hs_cd())){
							if (isExCtr(dtlR)){
								MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$itm_cd, MSBBL0015,toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(),
										dtlR.itm_sub2(), dtlR.itm_sub3()), dtlR.dlv_cntry_cd(), toYMDString(hdrR.slo_dt()), toDispGUIIndex(dtlR));
								msgL.add(msg);
							}
						}
					}
					//16.見積引継数を超えていないかをチェック
					//見積引続の場合、見積から引継可能な数量を超える場合、エラーとする		
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						if (!isNull(dtlR.qtn_d_no())) {
							MST_QTN_D_R qtnDR = getQtnD(dtlR.qtn_d_no());
							//引続き可能数の算出
							MCNumber trdCanQty = qtnDR.trd_unit_qty()
									.subtract(qtnDR.slo_trnst_qty());
							MCNumber trdQty = dtlR.trd_unit_qty();
							if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
								trdQty = trdQty.subtract(oldSloDR.trd_unit_qty());
							}
							if (trdQty.gt(trdCanQty)) {
								MCMessage msg = new MCMessage(dtlR,
										Slo_Upd01_DtlR.$trd_unit_qty, MSBBL0099,
										dtlR.qtn_d_no(), trdCanQty, toDispGUIIndex(dtlR));
								msgL.add(msg);
							}
						}
					}
					
					//18.品揃区分のチェック, 19.品揃ＮＯのチェック							
					if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
								|| isNull(dtlR.data_crud_typ())) {
							if (_cacheShipSchdL.subList(MST_SHIP_SCHD_R.$ship_pr_no,
									dtlR.ship_pr_no()).size() > 1) {
								//受注明細に対応する出荷予定が複数レコードが存在する、且つ、品揃区分が品揃するに設定された場合、エラーとする。	
								if (MSC_SHIP_ASSORT_TYP.isAST(hdrR.assort_typ()) && isNull(dtlR.set_itm_grp_no())) {							
									MCMessage msg = new MCMessage(dtlR, null, MSBBL0144,
											toDispGUIIndex(dtlR));
									msgL.add(msg);
								}
								//受注明細に対応する出荷予定が複数レコードが存在する、且つ、品揃NOが設定された場合、エラーとする。
								if (!isNull(dtlR.set_itm_grp_no())) {							
									MCMessage msg = new MCMessage(dtlR, null, MSBBL0145, dtlR.slo_d_no(),
											toDispGUIIndex(dtlR));
									msgL.add(msg);
								}
							}
						}
					}
					//23.諸口の納品先で納品先名が設定されていなかった場合、エラーとする。
					if (dtlR.dlv_sundry_flg()){
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$dlv_nm, new FXUCL_RequiredValidater()));	
					}
					//26.諸口の配送先で配送先名が設定されていなかった場合、エラーとする。
					if (dtlR.tdlv_sundry_flg()){
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$tdlv_nm, new FXUCL_RequiredValidater()));	
					}
					//30.貸出出荷で非在庫品が指定された場合、エラーとする。
					if (dtlR.vmi_flg()) {
						if (!MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())){
							MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$itm_cd, MSBBL0155,toDispGUIIndex(dtlR));
							msgL.add(msg);
						}
					}
					//31.諸口の品目の品名が設定されていない場合、エラーとする。
					if (dtlR.sundry_itm_flg()){
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$itm_nm, new FXUCL_RequiredValidater()));	
					}
					// インボイス取引　かつ　諸口品の場合に、インボイス表記名が設定されてない場合に、エラーとする。
					if (hdrR.cst_iv_flg() && dtlR.sundry_itm_flg()) {
						msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$iv_itm_nm, new FXUCL_RequiredValidater()));
					}
					//34.出荷予定の打切があるかのチェック
					//打切された出荷予定を含む明細の品目を変更しようとした。
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) && !dtlR.abort_flg()) {
						if (!_cacheShipSchdL
								.subList(MST_SHIP_SCHD_R.$ship_pr_no, dtlR.ship_pr_no())
								.subList(MST_SHIP_SCHD_R.$abort_flg, true).isEmpty()) {
							if (!isSame(oldSloDR.itm_cd(), dtlR.itm_cd())) {
								MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$itm_cd, MSBBL0158,
										toDispGUIIndex(dtlR));
								msgL.add(msg);
							}
							//打切された出荷予定を含む明細の単位を変更しようとした。
							else if (!isSame(oldSloDR.trd_unit_cd(), dtlR.trd_unit_cd())) {
								MCMessage msg = new MCMessage(dtlR, Slo_Upd01_DtlR.$trd_unit_cd, MSBBL0159,
										toDispGUIIndex(dtlR));
								msgL.add(msg);
							}
						}
					}
					//32.訂正可能チェック
					//出荷指図、出荷実績、インボイス、売上のいずれがが登録されているため、更新できません。
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						//預り売上
						if (dtlR.sls_cststk_flg()) {
							if (oldShipPrR.iv_schd_qty().gt(0) || oldShipPrR.iv_act_qty().gt(0)) {
								if(isNotAbortChk(dtlR, oldShipPrR)) {
									MCMessage msg = new MCMessage(dtlR, null, MSBBL0641,
											dtlR.slo_d_no(), toDispGUIIndex(dtlR));
									msgL.add(msg);
								}
							}
							else if (oldShipPrR.sls_qty().gt(0)) {
								if(isNotAbortChk(dtlR, oldShipPrR)) {
									MCMessage msg = new MCMessage(dtlR, null, MSBBL0234,
											dtlR.slo_d_no(), toDispGUIIndex(dtlR));
									msgL.add(msg);
								}
							}
						}
						//通常売上
						else {
							if (oldShipPrR.ship_inst_qty().gt(0) || oldShipPrR.ship_act_qty().gt(0) || 
									oldShipPrR.iv_schd_qty().gt(0) || oldShipPrR.iv_act_qty().gt(0) ||
									oldShipPrR.sls_qty().gt(0)){
								//打切可能のチェック,
								if (dtlR.abort_flg()){
									if(isNotAbortChk(dtlR, oldShipPrR)) {
										MCMessage msg = new MCMessage(dtlR, null, MSBBL0200, dtlR.slo_d_no());
										msgL.add(msg);
									}
								}
								//更新
								else if(!dtlR.abort_flg() && oldSloDR.abort_flg()) {
									if(!dtlR.rem_abort_flg()) {
										MCMessage msg = new MCMessage(dtlR, null, MSBBL0198, dtlR.slo_d_no());
										msgL.add(msg);
									}
								}
								else{
									MCMessage msg = new MCMessage(dtlR, null, MSBBL0198, dtlR.slo_d_no());
									msgL.add(msg);
								}
							}
						}
					}
					//45.受注日と出荷希望日時チェック
					//受注日＞出荷希望日時　（受注日よりも過去の出荷希望日時）だったら、エラーとする
					if (!isNull(dtlR.ship_rqst_tm())){
						FXUCL_BeforeAfterValidater validator = new FXUCL_BeforeAfterValidater();
						validator.setBefore(hdrR, Slo_Upd01_HdrR.$slo_dt);
						msgL.addAll(check(dtlR, new String[] {
								Slo_Upd01_DtlR.$ship_rqst_tm
						}, validator));
					}

					//46.受注日と納入希望日時チェック
					//受注日＞納入希望日時　（受注日よりも過去の納入希望日時）だったら、エラーとする
					if (!isNull(dtlR.dlv_rqst_tm())) {
						FXUCL_BeforeAfterValidater validator = new FXUCL_BeforeAfterValidater();
						validator.setBefore(hdrR, Slo_Upd01_HdrR.$slo_dt);
						msgL.addAll(check(dtlR, new String[] {
								Slo_Upd01_DtlR.$dlv_rqst_tm
						}, validator));
					}
					// 引当範囲区分とロットＮＯ、サブロットＮＯのチェック
					// 総量引当　かつ　ロットＮＯまたはサブロットＮＯが指定されている場合、エラーとする
					if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(dtlR.alloc_scope_typ())) {
						
						if (!isNull(dtlR.lot_no()) || !isNull(dtlR.sublot_no())) {
							
							msgL.add(new MCMessage(dtlR,
									isNullOrNullVal(dtlR.lot_no()) ? Slo_Upd01_DtlR.$sublot_no : Slo_Upd01_DtlR.$lot_no, MSBBL0282, toDispGUIIndex(dtlR)));
						}
					}
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) && !isSame(oldSloDR.vmi_flg(), dtlR.vmi_flg())) {
					msgL.add(new MCMessage(dtlR, Slo_Upd01_DtlR.$vmi_flg, MSBBL0283, oldSloDR.slo_no(), oldSloDR.slo_d_no(), toDispGUIIndex(dtlR)));
				}
					if (!isNull(dtlR.gd_cd())) {
						msgL.add(chkSloAllocGd(hdrR, dtlR));
					}
				}
			}
			
			return msgL;
		}
		
		protected void getIvDCache(MCList<Slo_Upd01_DtlR> dltL) {
			MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("SLOD"));
			dbWkDelete("MSBBL6020_MSW_SLO_D_D01", dtlL_bldr.getBaseDbc());
			dbWkInsert("MSBBL6020_MSW_SLO_D_I01", dltL, dtlL_bldr.getBaseDbc());
			
			_cacheIvDL = MCList.create(MST_IV_D_R.class);
			
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R ivH = MST_IV_R.create("IVH");
			MSW_SLO_D_KEY_R sloDKey = MSW_SLO_D_KEY_R.create("SLODKEY");
			
			MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(ivD);
			ivDL_bldr.setSelect(ivD.iv_d_no);
			ivDL_bldr.addSelect(ivD.slo_no);
			ivDL_bldr.addSelect(ivD.slo_d_no);
			ivDL_bldr.addInnerJoin(ivH, bracket(ivD.iv_mng_no.eq(ivH.iv_mng_no)));
			ivDL_bldr.addInnerJoin(sloDKey, bracket(ivD.slo_d_no.eq(sloDKey.slo_d_no)));
			ivDL_bldr.addWhereWithAnd(ivH.pre_rcpt_iv_flg.eq(value(true)));
			
			dbSelect("MSBBL6020_IV_D_S01", _cacheIvDL, ivDL_bldr);
			_ivDListKey = _cacheIvDL.createIndex(MST_IV_D_R.$slo_d_no);
			
			dbWkDelete("MSBBL6020_MSW_SLO_D_D02", dtlL_bldr.getBaseDbc());
		}
		
		protected MCMessageList chkUnmodififiableColumnChange(Slo_Upd01_HdrR hdrR, MCList<Slo_Upd01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			
			if (!MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
				return msgL;
			}
			
			MCList<Slo_Upd01_DtlR> chkTgtL = MCList.create(Slo_Upd01_DtlR.class);
			makeCheckTergetList(hdrR, dtlL, chkTgtL);
			if (isNull(chkTgtL)) {
				return msgL;
			}
			
			String errColumnForHdr = getHdrValueChangedErrStr(hdrR);
			if (!isNull(errColumnForHdr)) {
				for (Slo_Upd01_DtlR chkTgtR : chkTgtL) {
					msgL.add(new MCMessage(hdrR, null, MSBBL0518, errColumnForHdr, chkTgtR.slo_no(), chkTgtR.slo_d_no()));
				}
			}
			for (Slo_Upd01_DtlR chkTgtR : chkTgtL) {
				String errColumnForDtl = getDtlValueChangedErrStr(chkTgtR);
				if (!isNull(errColumnForDtl)) {
					msgL.add(new MCMessage(chkTgtR, null, MSBBL0519, errColumnForDtl, chkTgtR.slo_no(), chkTgtR.slo_d_no()));
				}
			}
			return msgL;
		}
		
		protected String[] _unModifiableColsAftRcptIvForHdr = {
				Slo_Upd01_HdrR.$sls_basis_typ, Slo_Upd01_HdrR.$trd_cur_cd,
				Slo_Upd01_HdrR.$xrate, Slo_Upd01_HdrR.$xrate_inpt_flg,
				Slo_Upd01_HdrR.$ptax_xrate, Slo_Upd01_HdrR.$ptax_xrate_inpt_flg,
				Slo_Upd01_HdrR.$cst_po_no, Slo_Upd01_HdrR.$ar_dpt_cd,
				Slo_Upd01_HdrR.$trnspt_cd, Slo_Upd01_HdrR.$vssl_flght,
				Slo_Upd01_HdrR.$load_port_cd, Slo_Upd01_HdrR.$etd_dt,
				Slo_Upd01_HdrR.$dschrg_port_cd, Slo_Upd01_HdrR.$eta_dt,
				Slo_Upd01_HdrR.$via_port_cd, Slo_Upd01_HdrR.$via_schd_dt,
				Slo_Upd01_HdrR.$trd_rmrks
		};
		protected String[] getUnModifiableColsAftRcptIvForHdr() {
			return _unModifiableColsAftRcptIvForHdr;
		}
		protected String[] _unModifiableColsAftRcptIvForDtl = {
				Slo_Upd01_DtlR.$iv_itm_nm, Slo_Upd01_DtlR.$cntry_org_cd,
				Slo_Upd01_DtlR.$gd_cd, Slo_Upd01_DtlR.$trd_cur_upri,
				Slo_Upd01_DtlR.$tax_cd, Slo_Upd01_DtlR.$trd_cur_dscnt_amt,
				Slo_Upd01_DtlR.$dscnt_rsn_cd, Slo_Upd01_DtlR.$iv_upri,
				Slo_Upd01_DtlR.$wtax_rate, Slo_Upd01_DtlR.$cst_po_d_no,
				Slo_Upd01_DtlR.$cst_itm_cd, Slo_Upd01_DtlR.$cst_itm_nm,
				Slo_Upd01_DtlR.$sls_rsn_cd, Slo_Upd01_DtlR.$bd_dpt_cd,
				Slo_Upd01_DtlR.$trd_d_rmrks
		};
		protected String[] getUnModifiableColsAftRcptIvForDtl() {
			return _unModifiableColsAftRcptIvForDtl;
		}
		
		protected String getHdrValueChangedErrStr(Slo_Upd01_HdrR hdrR) {
			StringBuilder errStr = new StringBuilder();
			
			for (String unModifiableColsAftRcptIvForHdr : getUnModifiableColsAftRcptIvForHdr()) {
				if (!isSame(_cacheSloR.getValueNE(unModifiableColsAftRcptIvForHdr),
							hdrR.getValueNE(unModifiableColsAftRcptIvForHdr))) {
					if (errStr.length() > 0) {
						errStr.append(" / ");
					}
					errStr.append(getLabel(hdrR, unModifiableColsAftRcptIvForHdr));
				}
			}
			return errStr.toString();
		}
		
		protected String getDtlValueChangedErrStr(Slo_Upd01_DtlR dtlR) {
			StringBuilder errStr = new StringBuilder();
			
			MCIndexKey sloDIndexLey = _cacheSloDL.createIndex(Slo_Upd01_DtlR.$slo_d_no);
			MST_SLO_D_R beforeSloDR = _cacheSloDL.getFirst(sloDIndexLey, dtlR.slo_d_no());
			for (String unModifiableColsAftRcptIvForDtl : getUnModifiableColsAftRcptIvForDtl()) {
				if (!isSame(beforeSloDR.getValueNE(unModifiableColsAftRcptIvForDtl),
						dtlR.getValueNE(unModifiableColsAftRcptIvForDtl))) {
					if (errStr.length() > 0) {
						errStr.append(" / ");
					}
					errStr.append(getLabel(dtlR, unModifiableColsAftRcptIvForDtl));
				}
			}
			return errStr.toString();
		}
		
		protected void makeCheckTergetList(Slo_Upd01_HdrR hdrR, MCList<Slo_Upd01_DtlR> dtlL, MCList<Slo_Upd01_DtlR> chkTgtL) {
			if (isNull(_cacheIvDL)) {
				return;
			}
		
			for (Slo_Upd01_DtlR dtlR : dtlL) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					continue;
				}
				MCList<MST_IV_D_R> ivDL = _cacheIvDL.subList(_ivDListKey, dtlR.slo_d_no());
				if (isNull(ivDL)) {
					continue;
				}
				chkTgtL.add(dtlR);
			}
		}
		
		protected boolean isNotAbortChk(Slo_Upd01_DtlR dtlR, MST_SHIP_PR_R oldShipPrR) {
			
			return !dtlR.rem_abort_flg() 
					&& !(oldShipPrR.ship_schd_abort_qty().isPositive() 
					|| oldShipPrR.sls_schd_abort_qty().isPositive());
		}
		
		protected void setShipLgGrpCd(MCList<Slo_Upd01_DtlR> grpL) {
			grpL.addStringColumn("shipLgGrpCd");
			for (Slo_Upd01_DtlR grpR : grpL) {
				if (isNull(grpR.ship_lg_grp_cd())) {
					MAM_LOC_R locR = getLoc(grpR.loc_cd());
					grpR.setStringNE("shipLgGrpCd", locR.lg_grp_cd());
				}
				else {
					grpR.setStringNE("shipLgGrpCd", grpR.ship_lg_grp_cd());
				}
			}
		}
		/**
		 * 前受金出荷制御区分チェックを行う。
		 * @param hdrR 上り電文の受注ヘッダ
		 * @return エラーメッセージ
		 */
		protected MCMessage chkAdvShipCtrlTyp(Slo_Upd01_HdrR hdrR) {
			if (MSC_ADV_SHIP_CTRL_TYP.isSHIP_ABL(hdrR.adv_ship_ctrl_typ())
					&& !isNull(_cacheSloR)
					&& MSC_ADV_SHIP_CTRL_TYP.isSHIP_STOP(_cacheSloR.adv_ship_ctrl_typ()) 
					&& !isNull(_cacheSloR.adv_rcv_amt()) && _cacheSloR.adv_rcv_amt().isPositive()) {
				return new MCMessage(hdrR, Slo_Upd01_HdrR.$adv_ship_ctrl_typ, MSBBL0306);
			}
			
			return null;
		}
		/**
		 * 受注引当可能格付チェック.
		 * @param hdrR 上り電文の受注ヘッダ
		 * @param dtlR 上り電文の受注明細
		 * @return エラーメッセージ
		 */
		protected MCMessage chkSloAllocGd(Slo_Upd01_HdrR hdrR, Slo_Upd01_DtlR dtlR) {
			if (!isNull(getSloAllocGdCache(hdrR.cst_cd(), MAC_STR.NULL_VAL.value(), dtlR.gd_cd()))
					|| !isNull(getSloAllocGdCache(hdrR.cst_cd(), dtlR.dlv_cd(), dtlR.gd_cd()))) {
				return null;
			}
			else if (!isNull(getSloAllocGdCache(hdrR.cst_cd(), MAC_STR.NULL_VAL.value()))
					|| !isNull(getSloAllocGdCache(hdrR.cst_cd(), dtlR.dlv_cd()))) {
				return new MCMessage(dtlR, Slo_Upd01_DtlR.$gd_cd, MSBBL0086, hdrR.cst_cd(), dtlR.dlv_cd(), toDispGUIIndex(dtlR));
			}
			return null;
		}
		/**
		 * ロットに関連するチェックを行う。
		 * @param dtlR 上り電文の受注明細
		 * @return エラーメッセージリスト
		 */
		protected MCMessage chkLot(Slo_Upd01_DtlR dtlR) {

			//ロットもサブロットもNULLの場合、チェックしない
			if (isNull(dtlR.lot_no()) && isNull(dtlR.sublot_no())) {
				return null;
			}

			//ロットもサブロットも管理しない品目の場合かつ、どちらもＮＵＬＬ文字が設定されている場合、チェックしない
			MAM_ITM_R itmR = getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(),
					dtlR.itm_sub3());
			if (!isNull(itmR) && MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())
					&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())
					&& isSame(dtlR.lot_no(), MAC_STR.NULL_VAL.value())
					&& isSame(dtlR.sublot_no(), MAC_STR.NULL_VAL.value())) {
				return null;
			}

			MSVT_LOT_LIST_R lotSublotR = getLotSublotCache(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(),
					nvl(dtlR.lot_no(), MAC_STR.NULL_VAL.value()), nvl(dtlR.sublot_no(), MAC_STR.NULL_VAL.value()));
			if (isNull(lotSublotR)) {
				return new MCMessage(dtlR, null, MSBBL0303,
						toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						nvl(dtlR.lot_no(), MAC_STR.NULL_VAL.value()), nvl(dtlR.sublot_no(), MAC_STR.NULL_VAL.value()),
						toDispGUIIndex(dtlR));
			}
			return null;
		}
		
		/**
		 * 仕入直送の場合、発注先が未指定の場合、発注先を取得する。
		 * @param hdr 受注ヘッダ
		 * @param dtlR 受注明細
		 * @param wgCd ワーキンググループCD
		 * @return 品目詳細マスタ
		 */
		protected MAM_ITM_DTL_R getItmDtlInfo(Slo_Upd01_HdrR hdr, Slo_Upd01_DtlR dtlR, String wgCd) {
			
			Comparable<?>[] vals = new Comparable[]{
					dtlR.itm_cd(), 
					dtlR.itm_sub1(), 
					dtlR.itm_sub2(),
					dtlR.itm_sub3(),
					wgCd};

			MCList<MAM_ITM_DTL_R> subItmDtlL = object(CLAZZ)._itmDtlL.subList(object(CLAZZ)._itmDtlWgIdxkey, vals);
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			
			for (MAM_ITM_DTL_R itmDtl : subItmDtlL) {
				if ((MAC_STR.isNULL_VAL(itmDtl.mfg_loc_cd()) && !MAC_STR.isNULL_VAL(itmDtl.sppl_cd()))
						|| (!MAC_STR.isNULL_VAL(itmDtl.mfg_loc_cd()) && MAC_STR.isNULL_VAL(itmDtl.sppl_cd()) && !isNull(itmDtl.getStringNE("loc_sppl_cd")))) {
					if (isSame(_sysParm, "1")) {
						if (!isNull(dtlR.dlv_rqst_tm()) && itmDtl.st_dt().lte(dtlR.dlv_rqst_tm()) && itmDtl.end_dt().gte(dtlR.dlv_rqst_tm())) {
							itmDtlL.add(itmDtl);
						}
					} else {
						itmDtlL.add(itmDtl);
					}
				}
			}
			
			if (itmDtlL.isEmpty()) {
				return null;
			}
			
			itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$rqst_wg_cd, MAM_ITM_DTL_R.$st_dt, MAM_ITM_DTL_R.$end_dt);
			if (isSame(_sysParm, "1")) {
				MAM_ITM_DTL_R tmpitmDtlR = MAM_ITM_DTL_R.create();
				MCRow.copyall(tmpitmDtlR, itmDtlL.get(0));
				tmpitmDtlR.sppl_cd(tmpitmDtlR.getStringNE("mst_sppl_cd"));
				tmpitmDtlR.maker_cd(tmpitmDtlR.getStringNE("mst_maker_cd"));
				return tmpitmDtlR;
			} else {
				Slo_Upd01_DtlR tmpDtlR = Slo_Upd01_DtlR.create();
				MCRow.copyall(tmpDtlR, dtlR);
				
				for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
					tmpDtlR.sppl_cd(itmDtlR.getStringNE("mst_sppl_cd"));
					tmpDtlR.maker_cd(itmDtlR.getStringNE("mst_maker_cd"));
					tmpDtlR.addStringColumn("mfg_loc_cd", itmDtlR.mfg_loc_cd());
					tmpDtlR.addStringColumn("bom_ptn", itmDtlR.bom_ptn());
					
					// 仮取得した発注先・メーカを用いて購買ユーティリティで日付取得
					MCDate baseDt = callPurcUtilSrch01(tmpDtlR.dlv_rqst_tm(), tmpDtlR, hdr.slo_dt(), hdr.sls_dpt_cd());
					
					// 取得した日付が処理対象の品目詳細マスタで適用開始・終了の範囲内ならばその品目詳細マスタを返す
					if (!isNull(baseDt) && itmDtlR.st_dt().lte(baseDt) && itmDtlR.end_dt().gte(baseDt)) {
						MAM_ITM_DTL_R tmpitmDtlR = MAM_ITM_DTL_R.create();
						MCRow.copyall(tmpitmDtlR, itmDtlR);
						tmpitmDtlR.sppl_cd(itmDtlR.getStringNE("mst_sppl_cd"));
						tmpitmDtlR.maker_cd(itmDtlR.getStringNE("mst_maker_cd"));
						return tmpitmDtlR;
					}
				}
			}
			
			return null;
		}
		
		/**
		 * 依頼先WG_CDの取得
		 * 
		 * @param sloDt 受注日
		 * @param dtlR 受注明細
		 * @param wgCd ワーキンググループCD
		 * @param slsDptCd 売上部門CD
		 * @return 依頼先のワーキンググループCD
		 */
		protected String getRqstToWgCd(MCDate sloDt, Slo_Upd01_DtlR dtlR, String wgCd, String slsDptCd) {
			String oldRqstWgCd = "";
			MCDate tmpBaseDt = null;
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.getStringNE("proc_typ"))) {
				tmpBaseDt = dtlR.getDateNE("dlv_rqst_tm");
			}
			else {
				tmpBaseDt = dtlR.getDateNE("ship_schd_tm");
			}
			
			Comparable<?>[] vals = new Comparable[]{
					dtlR.itm_cd(), 
					dtlR.itm_sub1(), 
					dtlR.itm_sub2(),
					dtlR.itm_sub3(),
					wgCd};
			
			MCList<MAM_ITM_DTL_R> subItmDtlL = object(CLAZZ)._itmDtlL.subList(object(CLAZZ)._itmDtlWgIdxkey, vals);
			MCList<MAM_ITM_DTL_R> tmpItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			
			for (MAM_ITM_DTL_R itmDtl : subItmDtlL) {
				if ((MAC_STR.isNULL_VAL(itmDtl.mfg_loc_cd()) && 
						isSame(itmDtl.sppl_cd(), dtlR.sppl_cd()) &&
						isSame(itmDtl.maker_cd(), nvl(dtlR.maker_cd(), MAC_STR.NULL_VAL.value()))) 
						|| (MAC_STR.isNULL_VAL(itmDtl.sppl_cd()) && 
								isSame(itmDtl.getStringNE("loc_sppl_cd"), dtlR.sppl_cd()) &&
								isSame(nvl(itmDtl.getStringNE("loc_maker_cd"), MAC_STR.NULL_VAL.value()), nvl(dtlR.maker_cd(), MAC_STR.NULL_VAL.value())))) {
					tmpItmDtlL.add(itmDtl);
				}
			}
			
			tmpItmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$st_dt, MAM_ITM_DTL_R.$end_dt);
			
			MCDate baseDt = null;
			for (MAM_ITM_DTL_R tmpItmDtlR : tmpItmDtlL) {
				// 購買ユーティリティ呼出
				dtlR.addStringColumn("mfg_loc_cd", tmpItmDtlR.mfg_loc_cd());
				dtlR.addStringColumn("bom_ptn", tmpItmDtlR.bom_ptn());
				
				baseDt = callPurcUtilSrch01(tmpBaseDt, dtlR, sloDt, slsDptCd);
				if (!isNull(baseDt) && tmpItmDtlR.st_dt().lte(baseDt) && tmpItmDtlR.end_dt().gte(baseDt)) {
					break;
				}
				else {
					baseDt = null;
				}
			}
			
			if (isNull(baseDt)) {
				String msgId = null;
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.getStringNE("proc_typ"))) {
					msgId = MSBBL0408;
				}
				else {
					msgId = MSBBL0407;
				}
				boolean outsrcFlg = !isNullOrNullVal(dtlR.getStringNE("mfg_loc_cd"));
				MCMessage msg = new MCMessage(dtlR, null, msgId,
						toDispItm(dtlR.getString("itm_cd"), dtlR.getString("itm_sub1"),
								dtlR.getString("itm_sub2"), dtlR.getString("itm_sub3")),
						wgCd,
						outsrcFlg ? dtlR.getStringNE("bom_ptn") : MAC_STR.NULL_VAL.value(),
						outsrcFlg ? dtlR.getStringNE("mfg_loc_cd") : MAC_STR.NULL_VAL.value(),
						outsrcFlg ? MAC_STR.NULL_VAL.value() : dtlR.getString("sppl_cd"),
						dtlR.getString("maker_cd"),
						toYMDString(tmpBaseDt), toDispGUIIndex(dtlR));
				throw new MCAppException(msg);
			}
			
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			for (MAM_ITM_DTL_R itmDtl : tmpItmDtlL) {
				if (baseDt.gte(itmDtl.st_dt()) && baseDt.lte(itmDtl.end_dt())) {
					itmDtlL.add(itmDtl);
				}
			}
			if (itmDtlL.size() > 0) {
				oldRqstWgCd = itmDtlL.get(0).rqst_wg_cd();
			}
			
			if (isNull(oldRqstWgCd)){
				oldRqstWgCd = "";
			}
			return oldRqstWgCd;
		}

		/**
		 * 依頼先WG_CDの取得(納期基準ベース用)
		 * 
		 * @param hdr
		 * @param dtlR
		 * @return
		 */
		protected String getRqstToWgCd(MCDate sloDt, Slo_Upd01_DtlR dtlR, String wgCd) {
			String oldRqstWgCd = "";
			MCDate baseDt = null;
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.getStringNE("proc_typ"))) {
				baseDt = dtlR.getDateNE("dlv_rqst_tm");
			}
			else {
				baseDt = dtlR.getDateNE("ship_schd_tm");
			}

			Comparable<?>[] vals = new Comparable[]{
					dtlR.itm_cd(), 
					dtlR.itm_sub1(), 
					dtlR.itm_sub2(),
					dtlR.itm_sub3(),
					wgCd};
			
			MCList<MAM_ITM_DTL_R> subItmDtlL = object(CLAZZ)._itmDtlL.subList(object(CLAZZ)._itmDtlWgIdxkey, vals);
			MCList<MAM_ITM_DTL_R> tmpItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			
			for (MAM_ITM_DTL_R itmDtl : subItmDtlL) {
				if ((MAC_STR.isNULL_VAL(itmDtl.mfg_loc_cd()) && 
						isSame(itmDtl.sppl_cd(), dtlR.sppl_cd()) &&
						isSame(itmDtl.maker_cd(), nvl(dtlR.maker_cd(), MAC_STR.NULL_VAL.value()))) 
						|| (MAC_STR.isNULL_VAL(itmDtl.sppl_cd()) && 
								isSame(itmDtl.getStringNE("loc_sppl_cd"), dtlR.sppl_cd()) &&
								isSame(nvl(itmDtl.getStringNE("loc_maker_cd"), MAC_STR.NULL_VAL.value()), nvl(dtlR.maker_cd(), MAC_STR.NULL_VAL.value())))) {
					if (!isNull(baseDt) && itmDtl.st_dt().lte(baseDt) && itmDtl.end_dt().gte(baseDt)) {
						tmpItmDtlL.add(itmDtl);
					}
				}
			}
			
			tmpItmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$st_dt, MAM_ITM_DTL_R.$end_dt);
			int iCnt = tmpItmDtlL.size();
			
			if (iCnt > 0) {
				oldRqstWgCd = tmpItmDtlL.get(0).rqst_wg_cd();
			}
			else {
				MCMessage msg = new MCMessage(MSBBL0183,
						toDispItm(dtlR.getString("itm_cd"), dtlR.getString("itm_sub1"),
								dtlR.getString("itm_sub2"), dtlR.getString("itm_sub3")),
						wgCd,dtlR.getString("sppl_cd"),dtlR.getString("maker_cd"),toYMDString(baseDt),
						toDispGUIIndex(dtlR));
				throw new MCAppException(msg);
			}
			
			if (isNull(oldRqstWgCd)){
				oldRqstWgCd = "";
			}
			return oldRqstWgCd;
		}

		/**
		 * 後続業務が登録されているかつ備考、予備のみ更新する場合、フラグをキャッシュに保持する。
		 * @param hdrR 上り電文の受注ヘッダ
		 */
		protected void setOnlyUpdTrnstRmrksFlg(Slo_Upd01_HdrR hdrR) {
			
			for (Slo_Upd01_DtlR dtlR : getAllDtlByHdrPegNo(hdrR.peg_no())) {
				
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
						|| isNull(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					
					MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
					MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
					
					if (isTrnst(oldShipPrR) && !isTrnstItmChanged(hdrR, dtlR, oldSloDR, oldShipPrR)) {
						oldSloDR.setValueNE("only_upd_trnst_rmrks_flg", true);
					}
				}
			}
		}
		/**
		 * 指定された比較配列の値が一致しないか評価する。
		 * @param cmp 比較配列
		 * @return 一つで一致しない場合はtrue
		 */
		protected boolean isValueChanged(Comparable<?>[][] cmp) {
			
			for (Comparable<?>[] c : cmp) {
				if (!isSame(c[0], c[1])) {
					return true;
				}
			}
			return false;
		}
		/**
		 * 備考、予備以外の更新が変わっているか評価する。
		 * @param hdrR 上り電文の受注ヘッダ
		 * @param dtlR 上り電文の受注明細
		 * @param oldSloDR ＤＢの受注明細
		 * @param oldShipPrR ＤＢの出荷進捗
		 * @return 備考、予備以外の更新が変わっている場合はtrue
		 */
		protected boolean isTrnstItmChanged(Slo_Upd01_HdrR hdrR, Slo_Upd01_DtlR dtlR, MST_SLO_D_R oldSloDR, MST_SHIP_PR_R oldShipPrR) {
			
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				return true;
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) 
					|| isNull(dtlR.data_crud_typ())) {
				
				if (isValueChanged(getCmpSloHdr(hdrR)) 
						|| isValueChanged(getCmpSloDtl(hdrR, dtlR, oldSloDR, oldShipPrR))) {
					return true;
				}
			}
			
			return false;
		}
		/**
		 * 受注ヘッダの比較する項目の配列を返す。
		 * @param hdrR 上り電文の受注ヘッダ
		 * @return 受注ヘッダの比較する項目の配列
		 */
		protected Comparable<?>[][] getCmpSloHdr(Slo_Upd01_HdrR hdrR) {
			
			return new Comparable[][] {
				{hdrR.trd_cd(), _cacheSloR.trd_cd()},
				{hdrR.slo_typ(), _cacheSloR.slo_typ()},
				{hdrR.aprv_back_flg(), false},
				{hdrR.slo_dt(), _cacheSloR.slo_dt()},
				{hdrR.cst_cd(), _cacheSloR.cst_cd()},
				{hdrR.sls_basis_typ(), _cacheSloR.sls_basis_typ()},
				{hdrR.sls_usr_cd(), _cacheSloR.sls_usr_cd()},
				{hdrR.sls_dpt_cd(), _cacheSloR.sls_dpt_cd()},
				{hdrR.assort_typ(), _cacheSloR.assort_typ()},
				{hdrR.trd_cur_cd(), _cacheSloR.trd_cur_cd()},
				{hdrR.xrate_inpt_flg(), _cacheSloR.xrate_inpt_flg()},
				{hdrR.xrate(), _cacheSloR.xrate()},
				{hdrR.ptax_xrate_inpt_flg(), _cacheSloR.ptax_xrate_inpt_flg()},
				{hdrR.ptax_xrate(), _cacheSloR.ptax_xrate()},
				{hdrR.wrk_no(), _cacheSloR.wrk_no()},
				{hdrR.trnspt_cd(), _cacheSloR.trnspt_cd()},
				{hdrR.vssl_flght(), _cacheSloR.vssl_flght()},
				{hdrR.load_port_cd(), _cacheSloR.load_port_cd()},
				{hdrR.etd_dt(), _cacheSloR.etd_dt()},
				{hdrR.dschrg_port_cd(), _cacheSloR.dschrg_port_cd()},
				{hdrR.eta_dt(), _cacheSloR.eta_dt()},
				{hdrR.via_port_cd(), _cacheSloR.via_port_cd()},
				{hdrR.via_schd_dt(), _cacheSloR.via_schd_dt()},
				{hdrR.iv_no(), _cacheSloR.iv_no()},
				{hdrR.iv_num_flg(), false},
				{hdrR.adv_ship_ctrl_typ(), _cacheSloR.adv_ship_ctrl_typ()},
				{hdrR.adv_bill_amt(), _cacheSloR.adv_bill_amt()},
				{hdrR.tterm_cd1(), _cacheSloR.tterm_cd1()},
				{hdrR.tterm_rmrks1(), _cacheSloR.tterm_rmrks1()},
				{hdrR.tterm_cd2(), _cacheSloR.tterm_cd2()},
				{hdrR.tterm_rmrks2(), _cacheSloR.tterm_rmrks2()},
				{hdrR.tterm_cd3(), _cacheSloR.tterm_cd3()},
				{hdrR.tterm_rmrks3(), _cacheSloR.tterm_rmrks3()},
				{hdrR.cst_po_no(), _cacheSloR.cst_po_no()},
				{hdrR.ar_dpt_cd(), _cacheSloR.ar_dpt_cd()},
				{hdrR.cst_po_rmrks(), _cacheSloR.cst_po_rmrks()},
				{hdrR.trd_rmrks(), _cacheSloR.trd_rmrks()}};
		}
		/**
		 * 受注明細の比較する項目の配列を返す。
		 * @param hdrR 上り電文の受注ヘッダ
		 * @param dtlR 上り電文の受注明細
		 * @param oldSloDR ＤＢの受注明細
		 * @param oldShipPrR ＤＢの出荷進捗
		 * @return
		 */
		protected Comparable<?>[][] getCmpSloDtl(Slo_Upd01_HdrR hdrR, Slo_Upd01_DtlR dtlR, MST_SLO_D_R oldSloDR, MST_SHIP_PR_R oldShipPrR) {
			
			_cacheShipSchdL = getShipSchdCache(up1());
			
			MCList<MST_SHIP_SCHD_R> shipSchdL = _cacheShipSchdL.subList(MST_SHIP_SCHD_R.$ship_pr_no, oldShipPrR.ship_pr_no());
			boolean oldShipBlockFlg = (boolean)shipSchdL.max(MST_SHIP_SCHD_R.$ship_block_flg);
			boolean oldNotCalcFlg = (boolean)shipSchdL.max(MST_SHIP_SCHD_R.$not_dt_calc_flg);
			
			Comparable<?>[][] cmp = new Comparable[][] {
				{dtlR.abort_flg(), oldSloDR.abort_flg()},
				{dtlR.itm_cd(), oldSloDR.itm_cd()},
				{dtlR.itm_sub1(), oldSloDR.itm_sub1()},
				{dtlR.itm_sub2(), oldSloDR.itm_sub2()},
				{dtlR.itm_sub3(), oldSloDR.itm_sub3()},
				{dtlR.itm_nm(), oldSloDR.itm_nm()},
				{dtlR.iv_itm_nm(), oldSloDR.iv_itm_nm()},
				{dtlR.cntry_org_cd(), oldSloDR.cntry_org_cd()},
				{dtlR.vmi_flg(), oldSloDR.vmi_flg()},
				{dtlR.trd_unit_cd(), oldSloDR.trd_unit_cd()},
				{dtlR.trd_unit_qty(), oldSloDR.trd_unit_qty()},
				{dtlR.trd_cur_upri(), oldSloDR.trd_cur_upri()},
				{dtlR.interim_flg(), oldSloDR.interim_flg()},
				{dtlR.upri_not_tgt_flg(), oldSloDR.upri_not_tgt_flg()},
				{dtlR.cost_upri(), oldSloDR.cost_upri()},
				{dtlR.trd_cur_dscnt_amt(), oldSloDR.trd_cur_dscnt_amt()},
				{dtlR.dscnt_rsn_cd(), oldSloDR.dscnt_rsn_cd()},
				{dtlR.tax_fix_flg(), oldSloDR.tax_fix_flg()},
				{dtlR.tax_cd(), oldSloDR.tax_cd()},
				{dtlR.wtax_rate(), oldSloDR.wtax_rate()},
				{dtlR.bill_crryovr_times(), oldSloDR.bill_crryovr_times()},
				{dtlR.gd_cd(), oldSloDR.gd_cd()},
				{dtlR.sno1(), oldSloDR.sno1()},
				{dtlR.sno1_null_flg(), oldSloDR.sno1_null_flg()},
				{dtlR.sno2(), oldSloDR.sno2()},
				{dtlR.sno2_null_flg(), oldSloDR.sno2_null_flg()},
				{dtlR.sno3(), oldSloDR.sno3()},
				{dtlR.sno3_null_flg(), oldSloDR.sno3_null_flg()},
				{dtlR.sno4(), oldSloDR.sno4()},
				{dtlR.sno4_null_flg(), oldSloDR.sno4_null_flg()},
				{dtlR.set_itm_grp_no(), oldSloDR.set_itm_grp_no()},
				{dtlR.ship_rqst_tm(), oldSloDR.ship_rqst_tm()},
				{dtlR.dlv_rqst_tm(), oldSloDR.dlv_rqst_tm()},
				{dtlR.sls_schd_dt(), oldSloDR.sls_schd_dt()},
				{dtlR.accpt_schd_dt(), oldSloDR.accpt_schd_dt()},
				{dtlR.dlv_cd(), oldSloDR.dlv_cd()},
				{dtlR.dlv_nm(), oldSloDR.dlv_nm()},
				{dtlR.dlv_cntct_dpt(), oldSloDR.dlv_cntct_dpt()},
				{dtlR.dlv_cntct_psn(), oldSloDR.dlv_cntct_psn()},
				{dtlR.dlv_zip_cd(), oldSloDR.dlv_zip_cd()},
				{dtlR.dlv_addr1(), oldSloDR.dlv_addr1()},
				{dtlR.dlv_addr2(), oldSloDR.dlv_addr2()},
				{dtlR.dlv_addr3(), oldSloDR.dlv_addr3()},
				{dtlR.dlv_addr4(), oldSloDR.dlv_addr4()},
				{dtlR.dlv_tel(), oldSloDR.dlv_tel()},
				{dtlR.dlv_fax(), oldSloDR.dlv_fax()},
				{dtlR.dlv_lg_grp_cd(), oldSloDR.dlv_lg_grp_cd()},
				{dtlR.pri_prnt_flg(), oldSloDR.pri_prnt_flg()},
				{dtlR.dest_cd1(), oldSloDR.dest_cd1()},
				{dtlR.dest_cd2(), oldSloDR.dest_cd2()},
				{dtlR.dest_cd3(), oldSloDR.dest_cd3()},
				{dtlR.tdlv_cd(), oldSloDR.tdlv_cd()},
				{dtlR.tdlv_nm(), oldSloDR.tdlv_nm()},
				{dtlR.via_dlv_typ(), oldSloDR.via_dlv_typ()},
				{dtlR.tdlv_cntct_dpt(), oldSloDR.tdlv_cntct_dpt()},
				{dtlR.tdlv_cntct_psn(), oldSloDR.tdlv_cntct_psn()},
				{dtlR.tdlv_zip_cd(), oldSloDR.tdlv_zip_cd()},
				{dtlR.tdlv_addr1(), oldSloDR.tdlv_addr1()},
				{dtlR.tdlv_addr2(), oldSloDR.tdlv_addr2()},
				{dtlR.tdlv_addr3(), oldSloDR.tdlv_addr3()},
				{dtlR.tdlv_addr4(), oldSloDR.tdlv_addr4()},
				{dtlR.tdlv_tel(), oldSloDR.tdlv_tel()},
				{dtlR.tdlv_fax(), oldSloDR.tdlv_fax()},
				{dtlR.tdlv_lg_grp_cd(), oldSloDR.tdlv_lg_grp_cd()},
				{dtlR.dlv_day_week_typ(), oldSloDR.dlv_day_week_typ()},
				{dtlR.sls_cststk_flg(), oldSloDR.sls_cststk_flg()},
				{dtlR.proc_typ(), oldSloDR.proc_typ()},
				{dtlR.ship_inst_typ(), oldSloDR.ship_inst_typ()},
				{dtlR.ship_schd_split_typ(), oldSloDR.ship_schd_split_typ()},
				{dtlR.alloc_scope_typ(), oldSloDR.alloc_scope_typ()},
				{dtlR.alloc_typ(), oldSloDR.alloc_typ()},
				{dtlR.rqst_to_loc_cd(), oldSloDR.rqst_to_loc_cd()},
				{dtlR.sppl_cd(), oldSloDR.sppl_cd()},
				{dtlR.maker_cd(), oldSloDR.maker_cd()},
				{dtlR.wg_rqst_cnt_rmrks(), oldSloDR.wg_rqst_cnt_rmrks()},
				{dtlR.alloc_grp_cd(), oldSloDR.alloc_grp_cd()},
				{dtlR.ship_lg_grp_cd(), oldSloDR.ship_lg_grp_cd()},
				{dtlR.loc_cd(), oldSloDR.loc_cd()},
				{dtlR.str_ln_cd(), oldSloDR.str_ln_cd()},
				{dtlR.lot_no(), oldSloDR.lot_no()},
				{dtlR.sublot_no(), oldSloDR.sublot_no()},
				{dtlR.ver_no(), oldSloDR.ver_no()},
				{dtlR.ship_term_cd(), oldSloDR.ship_term_cd()},
				{dtlR.ship_block_flg(), oldShipBlockFlg},
				{dtlR.ship_cnt_rmrks(), oldSloDR.ship_cnt_rmrks()},
				{dtlR.cst_po_d_no(), oldSloDR.cst_po_d_no()},
				{dtlR.cst_itm_cd(), oldSloDR.cst_itm_cd()},
				{dtlR.cst_itm_nm(), oldSloDR.cst_itm_nm()},
				{dtlR.cst_po_d_rmrks(), oldSloDR.cst_po_d_rmrks()},
				{dtlR.sls_rsn_cd(), oldSloDR.sls_rsn_cd()},
				{dtlR.bd_dpt_cd(), oldSloDR.bd_dpt_cd()},
				{dtlR.sls_upri_req_typ(), oldSloDR.sls_upri_req_typ()},
				{dtlR.trd_d_rmrks(), oldSloDR.trd_d_rmrks()},
				{dtlR.can_rsn_cd(), oldSloDR.can_rsn_cd()},
				{dtlR.slo_d_can_rmkrs(), oldSloDR.slo_d_can_rmkrs()},
				{dtlR.not_dt_calc_flg(), oldNotCalcFlg}};
			
			List<Comparable<?>[]> compL = new ArrayList<Comparable<?>[]>();
			compL.addAll(java.util.Arrays.asList(cmp));
				
			if (dtlR.not_dt_calc_flg()) {
				
				compL.add(new Comparable<?>[]{dtlR.ship_schd_tm(), oldShipPrR.ship_schd_tm()});
				compL.add(new Comparable<?>[]{dtlR.dlv_schd_tm(), oldShipPrR.dlv_schd_tm()});
			}
			if (hdrR.cst_iv_flg()) {
				// 受注受信時にインボイス取引でないの場合、上り電文のＩ／Ｖ単価がnull
				compL.add(new Comparable<?>[]{dtlR.iv_upri(), oldSloDR.iv_upri()});
			}
			
			return compL.toArray(new Comparable<?>[0][0]);
		}
		/**
		 * 後続業務が登録されているか評価する
		 * @param oldShipPrR ＤＢの出荷進捗
		 * @return 後続業務が登録されているはtrue
		 */
		protected boolean isTrnst(MST_SHIP_PR_R oldShipPrR) {
			
			return (!isNull(oldShipPrR.ship_inst_qty()) && oldShipPrR.ship_inst_qty().gt(0))
					|| (!isNull(oldShipPrR.ship_act_qty()) && oldShipPrR.ship_act_qty().gt(0))
					|| (!isNull(oldShipPrR.sls_qty()) && oldShipPrR.sls_qty().gt(0))
					|| (!isNull(oldShipPrR.iv_schd_qty()) && oldShipPrR.iv_schd_qty().gt(0));
		}
		
		/**
		 * 引数に指定された条件で見積明細を取得する。
		 * @param dltL 受注明細リスト
		 */
		protected void getQtnDCache(MCList<Slo_Upd01_DtlR> dltL) {
			
			_qtnDL = MCList.create(MST_QTN_D_R.class);
			
			MST_QTN_D_R qtnD_t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder qtnDR_bldr = MCQueryApiBuilder.create(qtnD_t);
			qtnDR_bldr.setSelect(qtnD_t.slo_trnst_qty);
			qtnDR_bldr.addSelect(qtnD_t.trd_unit_qty);
			qtnDR_bldr.addSelect(qtnD_t.qtn_d_no);
			dbSelectKey("MSBBL6020_MST_QTN_D_S01", _qtnDL, qtnDR_bldr, dltL);
			
			_qtnDIdxkey = _qtnDL.createIndex(MST_QTN_D_R.$qtn_d_no);
		}
		
		/**
		 * 引数に指定された見積明細NOで見積明細を取得する。
		 * @param qtnDNo 見積明細NO
		 * @return 見積明細
		 */
		protected MST_QTN_D_R getQtnD(String qtnDNo) {
			
			return _qtnDL.getFirst(_qtnDIdxkey, qtnDNo);
		}
		
		/**
		 * 引数に指定された条件で案件手配紐付情報を取得する。
		 * @param dltL 受注明細リスト
		 */
		protected void getWrkSnoCache(MCList<Slo_Upd01_DtlR> dltL) {
			
			_wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			
			MCList<Slo_Upd01_DtlR> bindL = dltL.subList(r->!isNull(r.sno1()));
			
			MST_WRK_SNO_R wrkSnoR = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder wrkSnoR_bldr = MCQueryApiBuilder.create(wrkSnoR);
			wrkSnoR_bldr.setSelect(wrkSnoR.wrk_no, wrkSnoR.sno1);
			wrkSnoR_bldr.setWhere(wrkSnoR.sno1.eq(bind("sno1")));
			dbSelect("MSBBL6020_MST_WRK_SNO_S01", _wrkSnoL, wrkSnoR_bldr, bindL);
			
			_wrkSnoIdxkey = _wrkSnoL.createIndex(MST_WRK_SNO_R.$sno1);
		}
		
		/**
		 * 引数に指定された手配NO１で案件手配紐付情報を取得する。
		 * @param sno1 手配NO１
		 * @return 案件手配紐付情報
		 */
		protected MST_WRK_SNO_R getWrkSno(String sno1) {
			
			return _wrkSnoL.getFirst(_wrkSnoIdxkey, sno1);
		}
		
		/**
		 * 引当範囲区分、引当区分、総量引当場所G、出荷物流G、出荷場所を行毎に設定
		 * @param dtlR 受注明細
		 * @param hdrR 受注ヘッダ
		 * @param srchSloAlloc 受注引当マスタ取得用の変数
		 * @return 受注引当マスタ
		 */
		protected MAM_SLO_ALLOC_R setRowAllocTyp(Slo_Upd01_HdrR hdrR, Slo_Upd01_DtlR dtlR, MCRow retR, MSUCL_SlsUtil.SrchSloAlloc srchSloAlloc) {
			//配送先経由区分より設定
			String strLgGrpCd;
			if (!isNull(dtlR.tdlv_cd())) {
				strLgGrpCd = dtlR.tdlv_lg_grp_cd();
			}
			else {
				strLgGrpCd = dtlR.dlv_lg_grp_cd();
			}
			
			return srchSloAlloc.getSloAllocR(dtlR, hdrR.wg_cd(), strLgGrpCd, retR);
		}
		
		/**
		 * 引数に指定された条件で品目詳細マスタを取得する。
		 * @param dtlL 受注明細リスト
		 */
		protected void getItmDtl(MCList<Slo_Upd01_DtlR> dtlL) {
			
			MCList<Slo_Upd01_DtlR> bindL = MCList.create(Slo_Upd01_DtlR.class);
			for (Slo_Upd01_DtlR dtlR : dtlL) {
				if (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ()) 
						|| MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())
						|| MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
					bindL.add(dtlR);
				}
			}
			
			if (!bindL.isEmpty()) {
				MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");

				object(CLAZZ)._itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
				MCQueryApiBuilder itmDtlL_bldr = MCQueryApiBuilder.create(t);
				
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				itmDtlL_bldr.addLeftOuterJoin(m1, bracket(t.mfg_loc_cd.eq(m1.loc_cd)));
				
				itmDtlL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.sppl_cd, t.maker_cd, t.wg_cd, t.prio, t.st_dt, t.end_dt, t.mfg_loc_cd, t.bom_ptn, t.rqst_loc_cd, t.rqst_wg_cd);
				itmDtlL_bldr.addSelect(decode(t.sppl_cd, value(MAC_STR.NULL_VAL.value()), m1.sppl_cd, t.sppl_cd).as("mst_sppl_cd"));
				itmDtlL_bldr.addSelect(decode(t.sppl_cd, value(MAC_STR.NULL_VAL.value()), m1.maker_cd, t.maker_cd).as("mst_maker_cd"));
				itmDtlL_bldr.addSelect(m1.sppl_cd.as("loc_sppl_cd"));
				itmDtlL_bldr.addSelect(m1.maker_cd.as("loc_maker_cd"));
				
				itmDtlL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
				itmDtlL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				itmDtlL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				itmDtlL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				
				dbSelect("MSBBL6020_MAM_ITM_DTL_S01", object(CLAZZ)._itmDtlL, itmDtlL_bldr, dtlL.groupBy(Slo_Upd01_DtlR.$itm_cd, Slo_Upd01_DtlR.$itm_sub1, Slo_Upd01_DtlR.$itm_sub2, Slo_Upd01_DtlR.$itm_sub3));
				
				_itmDtlLocIdxkey = object(CLAZZ)._itmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd,
						MAM_ITM_DTL_R.$itm_sub1,
						MAM_ITM_DTL_R.$itm_sub2,
						MAM_ITM_DTL_R.$itm_sub3,
						MAM_ITM_DTL_R.$wg_cd,
						MAM_ITM_DTL_R.$rqst_loc_cd);
				
				object(CLAZZ)._itmDtlWgIdxkey = object(CLAZZ)._itmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd,
						MAM_ITM_DTL_R.$itm_sub1,
						MAM_ITM_DTL_R.$itm_sub2,
						MAM_ITM_DTL_R.$itm_sub3,
						MAM_ITM_DTL_R.$wg_cd);
			}
		}
		
		/**
		 * 前処理
		 * @param hdrL 受注ヘッダ
		 * @param dltL 受注明細
		 */
		protected void getMstCache(MCList<Slo_Upd01_HdrR> hdrL, MCList<Slo_Upd01_DtlR> dltL) {
			
			getBpStopL(hdrL);
			
			getItmStopL(dltL);
			
			getExCtrL(dltL);
			
			getAllocStopLotL(dltL);
		}
		
		/**
		 * 取引先禁止マスタを取得する。
		 * @param hdrL 受注ヘッダ
		 */
		protected void getBpStopL(MCList<Slo_Upd01_HdrR> hdrL) {

			bpStopL = MCList.create(MAM_BP_STOP_R.class);
			MAM_BP_STOP_R bpStopL_t = MAM_BP_STOP_R.create("T");
			MCQueryApiBuilder bpStopL_bldr = MCQueryApiBuilder.create(bpStopL_t);
			bpStopL_bldr.setSelect(bpStopL_t.bp_cd, bpStopL_t.slo_stop_dt);

			dbSelectColumn("MSBBL6020_MAM_BP_STOP_S01", bpStopL, bpStopL_bldr,
					MAM_BP_STOP_R.$bp_cd, hdrL, Slo_Upd01_HdrR.$cst_cd);
		}
		
		/**
		 * 指定された得意先は受注禁止かどうか。
		 * @param hdrR 受注ヘッダ
		 * @return 受注禁止の場合はtrue
		 */
		protected boolean isBpStop(Slo_Upd01_HdrR hdrR) {

			boolean bpStopFlg = false;
			MCIndexKey idxkey = bpStopL.createIndex(MAM_BP_STOP_R.$bp_cd);
			
			for (MAM_BP_STOP_R bpStopR : bpStopL.subList(idxkey, hdrR.cst_cd())) {
				
				if (!isNull(bpStopR.slo_stop_dt()) && bpStopR.slo_stop_dt().lte(hdrR.slo_dt())) {
					
					bpStopFlg = true;
					break;
				}
			}
			
			return bpStopFlg;
		}
		
		/**
		 * 品目禁止マスタを取得する。
		 * @param dltL 受注明細
		 */
		protected void getItmStopL(MCList<Slo_Upd01_DtlR> dltL) {

			itmStopL = MCList.create(MAM_ITM_STOP_R.class);
			MAM_ITM_STOP_R itmStopL_t = MAM_ITM_STOP_R.create("T");
			MCQueryApiBuilder itmStopL_bldr = MCQueryApiBuilder.create(itmStopL_t);
			itmStopL_bldr.setSelect(itmStopL_t.itm_cd, itmStopL_t.itm_sub1,
					itmStopL_t.itm_sub2, itmStopL_t.itm_sub3, itmStopL_t.slo_stop_dt);

			dbSelectKey("MSBBL6020_MAM_ITM_STOP_S01", itmStopL, itmStopL_bldr, dltL);
		}
		
		/**
		 * 指定された品目は品目禁止かどうか。
		 * @param dtlR 受注明細
		 * @return 品目禁止の場合はtrue
		 */
		protected boolean isItmStop(Slo_Upd01_DtlR dtlR) {

			boolean itmStopFlg = false;
			
			MCIndexKey idxkey = itmStopL.createIndex(
					MAM_ITM_STOP_R.$itm_cd, 
					MAM_ITM_STOP_R.$itm_sub1, 
					MAM_ITM_STOP_R.$itm_sub2, 
					MAM_ITM_STOP_R.$itm_sub3);
			
			for (MAM_ITM_STOP_R itmStopR : itmStopL.subList(idxkey, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3())) {
				
				if (!isNull(itmStopR.slo_stop_dt()) && itmStopR.slo_stop_dt().lte(dtlR.slo_dt())) {
					
					itmStopFlg = true;
					break;
				}
			}
			
			return itmStopFlg;
		}
		
		/**
		 * 輸出規制マスタを取得する。
		 * @param dltL 受注明細
		 */
		protected void getExCtrL(MCList<Slo_Upd01_DtlR> dltL) {
			
			exCtrL = MCList.create(MAM_EX_CTRL_R.class);
			dbSelectColumn("MSBBL6020_MAM_EX_CTRL_S01", exCtrL,
					MCQueryApiBuilder.create(MAM_EX_CTRL_R.create("T")),
					new String[] {MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd},
					dltL, new String[] {Slo_Upd01_DtlR.$hs_cd, Slo_Upd01_DtlR.$dlv_cntry_cd});
		}
		
		/**
		 * 指定された品目は輸出規制かどうか。
		 * @param dtlR 受注明細
		 * @return 輸出規制の場合はtrue
		 */
		protected boolean isExCtr(Slo_Upd01_DtlR dtlR) {

			boolean exCtrFlg = false;
			
			MCIndexKey idxkey = exCtrL.createIndex(MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd);
			
			for (MAM_EX_CTRL_R exCtrR : exCtrL.subList(idxkey, dtlR.hs_cd(), dtlR.dlv_cntry_cd())) {
				
				if (exCtrR.st_dt().lte(dtlR.slo_dt()) && exCtrR.end_dt().gte(dtlR.slo_dt())) {
					
					exCtrFlg = true;
					break;
				}
			}
			
			return exCtrFlg;
		}
		
		/**
		 * 引当禁止ロット情報を取得する。
		 * @param dtlL 受注明細
		 */
		protected void getAllocStopLotL(MCList<Slo_Upd01_DtlR> dltL) {

			allocStopLotL = MCList.create(MST_ALLOC_STOP_LOT_R.class);
			dbSelectKey("MSBBL6020_MST_ALLOC_STOP_LOT_S01", allocStopLotL,
					MCQueryApiBuilder.create(MST_ALLOC_STOP_LOT_R.create("T")), dltL);
		}
		
		/**
		 * 指定されたロットは引当禁止ロットかどうか。
		 * @param dtlR 受注明細
		 * @return 引当禁止ロットの場合はtrue
		 */
		protected boolean isAllocStopLot(Slo_Upd01_DtlR dtlR) {

			boolean allocStopLotFlg = false;
			
			MCIndexKey idxkey = allocStopLotL.createIndex(
					MST_ALLOC_STOP_LOT_R.$itm_cd, 
					MST_ALLOC_STOP_LOT_R.$itm_sub1, 
					MST_ALLOC_STOP_LOT_R.$itm_sub2, 
					MST_ALLOC_STOP_LOT_R.$itm_sub3,
					MST_ALLOC_STOP_LOT_R.$lot_no,
					MST_ALLOC_STOP_LOT_R.$sublot_no);
			
			Comparable<?>[] vals = new Comparable<?>[] {
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(),
				dtlR.lot_no(),
				dtlR.sublot_no()};
			
			for (MST_ALLOC_STOP_LOT_R allocStopLotR : allocStopLotL.subList(idxkey, vals)) {
				
				if (allocStopLotR.stop_dt().lte(dtlR.slo_dt())
						&& (isNull(allocStopLotR.rel_dt()) || allocStopLotR.rel_dt().gt(dtlR.slo_dt()))) {
					
					allocStopLotFlg = true;
					break;
				}
			}
			
			return allocStopLotFlg;
		}
		
		/**
		 * 指定された紐付けＮＯで受注明細リストを取得して返す。
		 * @param hdrPegNo ヘッダ紐付けＮＯ
		 * @return　受注明細リスト
		 */
		protected MCList<Slo_Upd01_DtlR> getDtlByHdrPegNo(MCNumber hdrPegNo) {

			// 後続処理が登録されているかつ備考、予備のみ更新の明細を除外
			return removeRmrksSubUpdRows(getAllDtlByHdrPegNo(hdrPegNo));
		}
		/**
		 * 指定された紐付けＮＯで受注明細リストを取得して返す。
		 * @param hdrPegNo ヘッダ紐付けＮＯ
		 * @return　受注明細リスト
		 */
		protected MCList<Slo_Upd01_DtlR> getAllDtlByHdrPegNo(MCNumber hdrPegNo) {
			
			if (_up1Idxkey == null) {
				_up1Idxkey = up1().createIndex(Slo_Upd01_DtlR.$hdr_peg_no);
			}
			
			return  up1().subList(_up1Idxkey, hdrPegNo);
		}
		
		/**
		 * 指定されたヘッダ紐付けＮＯでヘッダを取得して返す。
		 * @param hdrPegNo ヘッダ紐付けＮＯ
		 * @return ヘッダ
		 */
		protected Slo_Upd01_HdrR getHdrByPegNo(MCNumber hdrPegNo) {
			
			if (_up0Idxkey == null) {
				_up0Idxkey = up0().createIndex(Slo_Upd01_HdrR.$peg_no);
			}
			
			return up0().getFirst(_up0Idxkey, hdrPegNo);
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Slo_Chk02オペレーション.<p>
	 *
	 */
	public class Slo_Chk02 extends MSBBL_SloRegService_MC_A.Slo_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chkSloDNo());
			return msgL;
		}

		/**
		 * 承認状況チェック
		 * 受注明細NOに対応する受注ヘッダの承認対象FLGがオン、かつ、承認状況区分が最終承認済でない場合、エラーとする。
		 * @return
		 */
		protected MCMessageList chkSloDNo() {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			MST_SLO_R t1 = MST_SLO_R.create("T1");
			sloDL_bldr.addInnerJoin(t1, bracket( t.slo_no.eq(t1.slo_no)));
			sloDL.addBooleanColumn("aprv_flg");
			sloDL_bldr.addSelect(t1.aprv_flg);
			sloDL_bldr.addSelect(t1.aprv_sts_typ);
			dbSelectKey("MSBBL6020_MST_SLO_D_S03", sloDL, sloDL_bldr, up0());
			for (MST_SLO_D_R sloDR : sloDL) {
				if (sloDR.getBooleanNE("aprv_flg")
						&& !MAC_APRV_STS_TYP.isACPT(sloDR.getString("aprv_sts_typ"))) {
					msgL.add(new MCMessage(MSBBL0053, sloDR.slo_no()));
				}
			}
			return msgL;
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Slo_Ins01オペレーション.<p>
	 *
	 */
	public class Slo_Ins01 extends MSBBL_SloRegService_MC_A.Slo_Ins01 {

		/**
		 * 上り電文（受注）のインデックス
		 */
		protected MCIndexKey _up0Idxkey = null;
		
		/**
		 * 上り電文（受注明細）のインデックス
		 */
		protected MCIndexKey _up1Idxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			//初期化・前処理
			beforeProc();
			//与信更新
			updCred();
			//受注NO発番
			setupNo();
			//承認提供サービス実行
			callAprvService();
			//手配ＮＯの設定
			setSeiban(up0(), up1());
			//諸口品登録サービスのチェック処理の呼び出し
			callSundryItmRegServiceChk01(up1());
			//諸口品登録サービスの登録処理の呼び出し
			callSundryItmRegServiceUpd01(up1());
			//案件・手配ＮＯ紐付け情報登録
			updWrkSno();
			//出荷予定日計算サービス実行
			callShipSchdDtService(up0(), up1());
			//品目の有効期限FROM,TOを取得
			getItmValidDt(up0(), up1());
			//受注トラン、受注明細トランの作成
			crtSloSloDMain();
			//受注状況更新処理の呼び出し
			callSloStsReg(up0(), up1());
			//引当処理の呼び出し
			callStkAlloc();
			//出荷予定サービスを呼出
			callShipSchdService();
			//受注状況更新処理の呼び出し（通常の引当）
			callSloStsRegNrmlAlloc(up1());
			//出荷・供給依頼処理の呼び出し
			callShipDmndRqstService();
			//受注状況更新処理の呼び出し（出荷供給依頼サービスの入庫予定に対する引当）
			callSloStsRegDmndRqstAlloc(up1());
			//売上予定更新
			updSlsSchd();
			//受注明細再更新（依頼先場所、発注先,依頼単位、依頼数量）
			updSloD(up0(), up1());
			//見積明細の更新
			updQtnD();
			//承認提供サービスの承認次処理済更新の呼び出し
			callAprvSvUpd02();
			//下り電文の作成
			setDown();
			
			// ピッキングなしの明細が纏めるか確認する
			chkNoPick(up0().getString(Slo_Upd01_HdrR.$slo_no));
		}
		
		/**
		 * 引数に指定された明細に対応する受注ヘッダを取得する。
		 */
		protected Slo_Upd01_HdrR getSloHdrR(Slo_Upd01_DtlR dtlR) {
			
			if (_up0Idxkey == null) {
				_up0Idxkey = up0().createIndex(Slo_Upd01_HdrR.$peg_no);
			}
			
			return up0().getFirst(_up0Idxkey, dtlR.hdr_peg_no());
		}
		
		/**
		 * 引数に指定された受注ヘッダに対応する受注明細を取得する。
		 */
		protected MCList<Slo_Upd01_DtlR> getSloDtlList(Slo_Upd01_HdrR hdrR) {
			
			if (_up1Idxkey == null) {
				_up1Idxkey = up1().createIndex(Slo_Upd01_DtlR.$hdr_peg_no);
			}
			
			return up1().subList(_up1Idxkey, hdrR.peg_no());
		}
		
		/**
		 * 初期化処理
		 */
		protected void beforeProc() {

			// 変数の初期化
			initAllocResult();
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				MCList<Slo_Upd01_DtlR> sloDtlL = getSloDtlList(hdrR);
				
				// 表示順の設定
				setDispSeq(sloDtlL);
				editUp(hdrR, sloDtlL);
			}
		}

		/**
		 * 与信更新処理
		 */
		protected void updCred() {
			for (Slo_Upd01_HdrR hdrR : up0()) {
				MCList<Slo_Upd01_DtlR> sloDtlL = getSloDtlList(hdrR);
				
				//取引区分が「売上」の場合、与信サービス.与信更新（売掛）（MSBGL5080.Cred_Upd01）を呼出し
				if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
					MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
					Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
					credR.cst_cd(hdrR.cst_cd());//得意先CD
					credR.cur_cd(hdrR.trd_cur_cd());//取引通貨ＣＤ.
					credR.trd_ptn_typ(hdrR.trd_ptn_typ());//取引パタン区分
					MCNumber amt = MCNumber.ZERO;
					for (Slo_Upd01_DtlR dtlR : sloDtlL) {
						if (dtlR.vmi_flg()){
							continue;
						}
						if (dtlR.dscnt_itm_flg()){
							amt = amt.add(dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt()).multiply(-1));
						}
						else{
							amt = amt.add(dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt()));
						}
					}
					credR.amt(amt);//与信額			
					credR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());
					ope.up0().add(credR);
					MCMessageList msgL = null;
					if (hdrR.is_src_batch_flg()) {		// ＩＦサービスから呼ばれた場合のみ
						msgL = new MCMessageList();
						msgL.addAll(MCMessagePool.getMessageList());
						MCMessagePool.clear();
					}
					ope.exec();
					if (!ope.down1().isEmpty()){
						MCMessage msg = new MCMessage(MSBBL0124, ope.down1().get(0).cred_cd(),
								ope.down1().get(0).cur_cd(), ope.down1().get(0).cred_amt(),ope.down1().get(0).cred_limit());
						throw new MCAppException(msg);
					}
					if (hdrR.is_src_batch_flg()) {
						if (MCMessagePool.size() > 0) {
							for (Slo_Upd01_DtlR dtlR : sloDtlL) {
								for (MCMessage msg : MCMessagePool.getMessageList()) {
									msgL.add(new MCMessage(dtlR, null, msg.getID(), (Object[])msg.getBindArray()));
								}
							}					
						}
						MCMessagePool.clear();
						MCMessagePool.addAll(msgL);
					}
				}
			}
		}
		
		/**
		 * 案件・手配ＮＯ紐付け情報を登録する。
		 */
		protected void updWrkSno() {
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				MCList<Slo_Upd01_DtlR> dtlL = getSloDtlList(hdrR);
				
				for (Slo_Upd01_DtlR dtlR : dtlL) {
						
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						if (!isNullOrNullVal(dtlR.sno1()) && !isNullOrNullVal(hdrR.wrk_no())) {
							regWrkNoSno1(dtlR.sno1(), hdrR.wrk_no(), dtlR);
						}
					}
				}
			}
		}

		/**
		 * 発番関連（受注NOを発番業務区分により発番、受注明細NOを発番システム区分により発番）
		 */
		protected void setupNo() {
			
			setupSloNo();
			setupSloDNO();
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				setupIVNo(hdrR);
			}
		}

		/**
		 * 受注ＮＯを設定する。
		 */
		protected void setupSloNo() {
			
			MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				ElmArgsR elm = ElmArgsR.create();
				elm.bp_cd(hdrR.cst_cd());			
				elm.trd_cd(hdrR.trd_cd());
				elm.dpt_cd(hdrR.sls_dpt_cd());
				elm.co_cd(getCo().co_cd());
				elm.dt(hdrR.slo_dt());
				elm.wg_cd(hdrR.wg_cd());
				elm.peg_no(hdrR.peg_no());
				
				argsL.add(elm);
			}
			
			setNum(MAC_NUM_BIZ_TYP.SLO, argsL);
			
			String[] srcCols = {ElmArgsR.$new_no};
			String[] destCols = {Slo_Upd01_HdrR.$slo_no};
			copyByPegNo(up0(), destCols, argsL, srcCols);
			
			up0().setValueNE(Slo_Upd01_HdrR.$slo_rev, MCNumber.valueOf(1));
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				MCList<Slo_Upd01_DtlR> dtlL = getSloDtlList(hdrR);
				dtlL.setValueNE(Slo_Upd01_DtlR.$slo_no, hdrR.slo_no());
				dtlL.setValueNE(Slo_Upd01_DtlR.$slo_rev, hdrR.slo_rev());
			}
		}
		
		/**
		 * 受注明細ＮＯを発番する。また、受払進捗管理ＮＯも合わせて発番する
		 */
		protected void setupSloDNO() {
			
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, up1().size());
			
			MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
			
			for (Slo_Upd01_DtlR dtlR : up1()) {
				
				Slo_Upd01_HdrR hdrR = getSloHdrR(dtlR);
				
				ElmArgsR argsR = ElmArgsR.create();
				argsR.bp_cd(hdrR.cst_cd());
				argsR.trd_cd(hdrR.trd_cd());
				argsR.dpt_cd(hdrR.sls_dpt_cd());
				argsR.co_cd(getCo().co_cd());
				argsR.dt(hdrR.slo_dt());
				argsR.wg_cd(hdrR.wg_cd());
				argsR.itm_cd(dtlR.itm_cd());
				argsR.itm_sub1(dtlR.itm_sub1());
				argsR.itm_sub2(dtlR.itm_sub2());
				argsR.itm_sub3(dtlR.itm_sub3());
				argsR.peg_no(dtlR.peg_no());
				argsL.add(argsR);
				
				dtlR.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
			}
			
			setNum(MAC_NUM_BIZ_TYP.SLOD, argsL);
			String[] srcCols = {ElmArgsR.$new_no};
			String[] destCols = {Slo_Upd01_DtlR.$slo_d_no};
			copyByPegNo(up1(), destCols, argsL, srcCols);
		}
		
		/**
		 * インボイスＮＯを発番する。
		 * @param hdrR 受注ヘッダ
		 */
		protected void setupIVNo(Slo_Upd01_HdrR hdrR){
			
			//得意先がインボイス取引対象の場合			
			if (hdrR.cst_iv_flg()) {
				if (hdrR.iv_num_flg()) {
					ElmArgsR elm = ElmArgsR.create();
					elm.co_cd(getCo().co_cd());
					elm.dt(getToday());
					//I/V_NO　の発番					
					hdrR.iv_no(getNumIv(elm, null));
				}
				else if (!isNull(hdrR.iv_no())) {
					//I/V_NO　の発番					
					hdrR.iv_no(getNumIv(null, hdrR.iv_no()));
				}
				else {							
					hdrR.iv_no(null);
				}
			}else{
				hdrR.iv_no(null);
			}
		}
		
		/**
		 * 承認提供サービス.承認情報作成を呼び出す。
		 */
		protected void callAprvService() {
			
			//承認提供サービス.承認情報作成(MBBAL5010.Aprv_Upd01)
			MBBAL_AprvService.Aprv_Upd01 op = MBBAL_AprvService.crtAprv_Upd01();
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				//承認モジュールを呼び出すか
				if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
					Aprv_Chk01_Rslt1R cndR = Aprv_Chk01_Rslt1R.create();
					//サービス呼出す時の電文項目の設定
					copy(cndR, hdrR, createMap_Aprv_Chk01_Rslt1R_Slo_Upd01_HdrR());
					op.up0().add(cndR);
				}
			}
			
			if (!op.up0().isEmpty()) {
				
				op.exec();
				
				String[] srcCols = {Aprv_Upd01_Dtl1R.$aprv_flg, Aprv_Upd01_Dtl1R.$aprv_no};
				String[] destCols = {Slo_Upd01_HdrR.$aprv_flg, Slo_Upd01_HdrR.$aprv_no};

				copyByPegNo(up0(), destCols, op.down0(), srcCols);

				for (Slo_Upd01_HdrR hdrR : up0()) {
					if (hdrR.aprv_flg()) {
						MBT_APRV_R aprvR = getAprvR(hdrR.aprv_no());
						hdrR.can_upd_flg(aprvR.aprv_upd_flg());
						hdrR.can_del_flg(aprvR.aprv_can_flg());
						hdrR.aprv_sts_typ(MAC_APRV_STS_TYP.OPN.value());
					}
					else {
						hdrR.can_upd_flg(false);
						hdrR.can_del_flg(false);
					}
				}
			}
		}

		/**
		 * 受注トラン、受注明細トランを作成する。
		 */
		protected void crtSloSloDMain() {

			MCList<MST_SLO_R> insSloL = MCList.create(MST_SLO_R.class);
			MCList<MST_SLO_D_R> insSloDL = MCList.create(MST_SLO_D_R.class);
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				MST_SLO_R insSloR = createInsSlo(hdrR);
				insSloR.setAlias("T");
				insSloL.add(insSloR);
				
				MCList<Slo_Upd01_DtlR> sloDtlL = getSloDtlList(hdrR);
				insSloDL.addAll(createInsSloD(insSloR, sloDtlL));
			}

			dbInsertEx("MSBBL6020_MST_SLO_I01", insSloL,
					MCQueryApiBuilder.create(MST_SLO_R.create("T")));
			dbInsertEx("MSBBL6020_MST_SLO_D_I01", insSloDL,
					MCQueryApiBuilder.create(MST_SLO_D_R.create("T")));
			// 改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
			updSloPL(insSloL);
		}

		/**
		 * 受注トランを作成する。
		 * @param hdrR 受注ヘッダ
		 * @return 受注トラン
		 */
		protected MST_SLO_R createInsSlo(Slo_Upd01_HdrR hdrR) {

			MST_SLO_R slo = MST_SLO_R.create();
			copy(slo, hdrR, createMap_MST_SLO_R_Slo_Upd01_HdrR());
			slo.slo_rev(1);
			return slo;
		}

		/**
		 * 引当処理を実行する。
		 */
		protected void callStkAlloc() {
			
			//引当処理の前に、対象テーブルのデータのロックを行う。
			MSBEL_AllocMngService.Alloc_Lock_Upd01 op = MSBEL_AllocMngService
					.crtAlloc_Lock_Upd01();
			//引当管理サービス.ロット提案サービス（MSBEL5040.Alloc_Srch01）
			MSBEL_AllocMngService.Alloc_Srch01 opAlc = MSBEL_AllocMngService
					.crtAlloc_Srch01();
			for (Slo_Upd01_DtlR dtlR : up1()) {
				//在庫管理区分=在庫管理するの場合のみ引当の対象とする。
				if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
					//・以下の条件に合致する明細は引当処理の対象とする。	
					//引当区分=即引当,手配区分=在庫引当OR引当後手配,引当解除したもの
					if (MAC_ALLOC_TYP.isIMMED(dtlR.alloc_typ()) && (MAC_SLO_PROC_TYP
							.isALLOC(dtlR.proc_typ()) || MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ()))) {
						
						Slo_Upd01_HdrR hdrR = getSloHdrR(dtlR);
						MSW_ALLOC_LOC_MAP_R lockR = MSW_ALLOC_LOC_MAP_R.create();
						//品目CD
						lockR.itm_cd(dtlR.itm_cd());
						lockR.itm_sub1(dtlR.itm_sub1());
						lockR.itm_sub2(dtlR.itm_sub2());
						lockR.itm_sub3(dtlR.itm_sub3());
						lockR.gi_loc_cd(dtlR.loc_cd());
						lockR.gi_lg_grp_cd(dtlR.ship_lg_grp_cd());
						lockR.alloc_grp_cd(dtlR.alloc_grp_cd());
						lockR.alloc_scope_typ(dtlR.alloc_scope_typ()); //引当範囲区分
						op.up0().add(lockR);
						//上り電文の定義
						Srch_TgtR alcR = Srch_TgtR.create();
						copy(alcR, dtlR, hdrR, createMap_Srch_TgtR_Slo_Upd01_DtlR());
						alcR.cst_cd(hdrR.cst_cd()); // 得意先
						alcR.except_alloc_wait_flg(false); //引当保留除外FLG							
						opAlc.up1().add(alcR);
					}
				}
			}
			//対象テーブルのデータのロックを行う。
			if (!op.up0().isEmpty()) {
				op.exec();
			}
			//引当を実行する
			if (!opAlc.up1().isEmpty()) {
				opAlc.up0().stk_flg(false);
				opAlc.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
				opAlc.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
				opAlc.up0().nm_srch_flg(false);
				opAlc.exec();
				//引当結果を取得し、一次変数に保存する。
				_allocResultL.addAll(opAlc.down0());
				_allocResultBkL.addAll(opAlc.down0().clone());
			}
		}

		/**
		 * 出荷予定サービスを呼び出す。
		 */
		protected void callShipSchdService() {
			//上り電文（Alloc_Rslt）の設定
			if (!_allocResultL.isEmpty()) {
				for (Srch_RsltR alRstR : _allocResultL) {
					Slo_Upd01_DtlR dlR = up1().subList(Slo_Upd01_DtlR.$peg_no,
							alRstR.peg_no()).get(0);
					//有効期限（下限）
					alRstR.vld_dt_fr(dlR.valid_dt_fr());
					//有効期限（上限）
					alRstR.vld_dt_to(dlR.valid_dt_to());
				}
			}
			//出荷進捗、出荷予定、出荷引当状況の作成のため、出荷予定サービス.更新（出荷進捗・予定）（MSBEL5500.ShipSchd_Upd01）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Upd01 op = MSBEL_ShipSchdService.crtShipSchd_Upd01();
			//引当余裕日数を取得する
			MCList<MAVM_ITM_WG_R> dbc = getItmMgnD(up1());
			MCIndexKey idx = dbc.createIndex(MAVM_ITM_WG_R.$itm_cd,
					MAVM_ITM_WG_R.$itm_sub1, MAVM_ITM_WG_R.$itm_sub2,
					MAVM_ITM_WG_R.$itm_sub3, "loc_cd");
			for (Slo_Upd01_DtlR dtlR : up1()) {
				
				Slo_Upd01_HdrR hdrR = getSloHdrR(dtlR);
				//上り電文（ShipPr_Dtl）の設定
				ShipPr_DtlR prR = ShipPr_DtlR.create();
				copy(prR, dtlR, hdrR, createMap_ShipPr_DtlR_Slo_Upd01_DtlR());
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
					// 売上部門で、場所マスタから場所CDを取得する
					String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
					MAM_LOC_R midlocR = getLoc(midLocCd);
					prR.ship_fr_lg_grp_cd(midlocR.lg_grp_cd());
				}
				op.up0().add(prR);
				//引当余裕日数の設定
				MAVM_ITM_WG_R itmR = dbc.getFirst(idx, dtlR.itm_cd(), dtlR.itm_sub1(),
						dtlR.itm_sub2(), dtlR.itm_sub3(), nvl(dtlR.loc_cd(), dtlR.def_loc_cd()));
				if(!isNull(itmR)) {
					dtlR.alloc_margin_days(itmR.alloc_margin_days());
					dtlR.setBooleanNE("not_xfr_flg", itmR.not_xfr_flg());
				}

				MCList<Srch_RsltR> allocL = setAllocStsRslt(dtlR, hdrR);	
				//上り電文（Alloc_Rslt）の設定
				if (!allocL.isEmpty()) {
					for (Srch_RsltR alRstR : allocL) {
						Alloc_RsltR alR = Alloc_RsltR.create();
						alR.alloc(alRstR);
						//引当数＞０の場合、場所引当ＦＬＧをオンにする。
						if (alRstR.base_unit_qty().gt(0)) {
							alR.alloc_flg(true);
						}
						else {
							alR.alloc_flg(false);
						}
						if (!isSetStrLn(dtlR)) {
							alR.stk_str_ln_cd(MAC_STR.NULL_VAL.value());
						}
						op.up1().add(alR);
					}
				}
			}
			
			if (op.up0().size() > 0) {
				
				op.exec();
				//出荷予定サービス実行後の出荷進捗NOを取得し、リストに設定する。
				MCList<ShipPr_DtlR> dnL = op.down0();
				for (Slo_Upd01_DtlR dtlR : up1()) {
					//上り電文.受注明細.データ更新区分＝新規の場合、出荷予定サービスの上り電文の設定は新規登録と同じに設定。
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						ShipPr_DtlR dnR = dnL.subList(ShipPr_DtlR.$peg_no, dtlR.peg_no()).get(0);
						dtlR.ship_pr_no(dnR.ship_pr_no());
					}
				}
			}
		}

		/**
		 * 出荷・供給依頼処理を呼び出す。
		 */
		protected void callShipDmndRqstService() {
			
			//出荷・供給依頼サービス.出荷・供給依頼登録（MSBAL5130.ShipDmndRqst_Upd01）を実行し、移送依頼、購買依頼を作成する。
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd01 op = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd01();
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Chk01 opChk = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Chk01();
			
			for (Slo_Upd01_DtlR dtlR : up1()) {
				
				Slo_Upd01_HdrR hdrR = getSloHdrR(dtlR);
				MST_SLO_R sloR = MST_SLO_R.create();
				sloR.wg_cd(hdrR.wg_cd());
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
					//仕入直送の場合、売上部門で場所マスタから場所を取得する
					String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
					ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
					copy(rqstR, dtlR, createMap_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR(hdrR, sloR));
					dtlR.rqst_dt(rqstR.rqst_dt());
					dtlR.rqst_dlv_rqst_dt(rqstR.gr_rqst_tm());
					
					dtlR.rqst_qty(rqstR.trd_unit_qty());
					dtlR.rqst_unit_cd(rqstR.trd_unit_cd());
					
					rqstR.wg_rqst_cnt_rmrks(dtlR.wg_rqst_cnt_rmrks());
					rqstR.gr_loc_cd(midLocCd);
					rqstR.gr_str_ln_cd(null);
					//得意先CD			
					rqstR.cst_cd(hdrR.cst_cd());
					//依頼元部門
					rqstR.rqst_fr_dpt_cd(hdrR.sls_dpt_cd());
					op.up0().add(rqstR);
					
					ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
					copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
					opChk.up0().add(rqstChkR);
				}
				else {
					// 手配依頼（購買依頼・移送依頼）の作成
					//手配区分が「手配依頼」の場合、
					if (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ())) {
						ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
						copy(rqstR, dtlR, createMap_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR(hdrR, sloR));
						rqstR.vld_dt_fr(dtlR.valid_dt_fr());
						dtlR.rqst_dt(rqstR.rqst_dt());
						dtlR.rqst_dlv_rqst_dt(rqstR.avl_schd_dt());
						
						dtlR.rqst_qty(rqstR.trd_unit_qty());
						dtlR.rqst_unit_cd(rqstR.trd_unit_cd());
						//依頼元部門
						rqstR.rqst_fr_dpt_cd(hdrR.sls_dpt_cd());
						if (isNull(dtlR.loc_cd())) {
							rqstR.gr_str_ln_cd(dtlR.def_str_ln_cd());
						}
						op.up0().add(rqstR);
						ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
						copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
						opChk.up0().add(rqstChkR);
					}
					//手配区分が「引当後手配」の場合、
					else if (MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())) {
						//引当数を取得する。
						MCNumber alcQty = _allocResultBkL.subList(Srch_RsltR.$peg_no, dtlR.peg_no()).sum(Srch_RsltR.$base_unit_qty);;
						if (isNull(alcQty)) {
							alcQty = MCNumber.ZERO;
						}
						//未引当分 >0の場合作成
						MCNumber notAlcQty = dtlR.base_unit_qty().subtract(alcQty);
						if (notAlcQty.isPositive()) {
							ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
							copy(rqstR, dtlR, createMap_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR(hdrR, sloR));
							rqstR.base_unit_qty(notAlcQty);
							rqstR.vld_dt_fr(dtlR.valid_dt_fr());	//有効期限ＦＲＯＭ
							//基準単位数を取引単位数に換算
							if (!isSame(rqstR.trd_unit_cd(), rqstR.base_unit_cd())) {
								MCNumber trdUnitQty = rvrsBaseUnitConv(notAlcQty, dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
										dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
								
								if (isNull(trdUnitQty)){
									rqstR.trd_unit_cd(rqstR.base_unit_cd()); //取引単位ＣＤ
									rqstR.trd_unit_qty(notAlcQty); //取引単位数量
								}
								else{
									rqstR.trd_unit_qty(trdUnitQty); //取引単位数量
								}
							}
							else {
								rqstR.trd_unit_cd(rqstR.base_unit_cd());
								rqstR.trd_unit_qty(rqstR.base_unit_qty());
							}
							dtlR.rqst_dt(rqstR.rqst_dt());
							dtlR.rqst_dlv_rqst_dt(rqstR.avl_schd_dt());
							
							dtlR.rqst_qty(rqstR.trd_unit_qty());
							dtlR.rqst_unit_cd(rqstR.trd_unit_cd());
							//依頼元部門
							rqstR.rqst_fr_dpt_cd(hdrR.sls_dpt_cd());
							if (isNull(dtlR.loc_cd())) {
								rqstR.gr_str_ln_cd(dtlR.def_str_ln_cd());
							}
							op.up0().add(rqstR);
							ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
							copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
							opChk.up0().add(rqstChkR);
						}
					}
				}
			}
			//出荷・供給依頼サービスを実行する。
			if (!opChk.up0().isEmpty()) {
				opChk.exec();
			}
			throwUpdErr();
			//出荷・供給依頼サービスを実行する。
			if (!op.up0().isEmpty()) {
				op.exec();				
			}
			//戻り値の取得と受注明細に設定する。
			MCList<ShipDmndRqst_Upd01_DtlR> dnL = op.down0();
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_Upd01_DtlR dtlR : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					MCList<ShipDmndRqst_Upd01_DtlR> dnSubL = dnL.subList(
							ShipDmndRqst_Upd01_DtlR.$peg_no, dtlR.peg_no());
					for (ShipDmndRqst_Upd01_DtlR dnR : dnSubL) {
						// 購買依頼が作られる場合はロット指定できないとする。
						if (MSC_WG_RQST_TYP.isPURC(dnR.wg_rqst_typ()) 
								&& (!isNull(dnR.lot_no()) || !isNull(dnR.sublot_no()))) {
							
							MCMessage msg = new MCMessage(dtlR, 
									!isNull(dtlR.lot_no()) ? Slo_Upd01_DtlR.$lot_no : Slo_Upd01_DtlR.$sublot_no,
									MSBBL0268, 
									toDispGUIIndex(dtlR));
							msgL.add(msg);
						}
						// 依頼のレコードを取得し、受注明細に設定する。
						else  {
							dtlR.rqst_to_loc_cd(nullValToNull(dnR.gi_loc_cd()));
							dtlR.sppl_cd(nullValToNull(dnR.sppl_cd()));
							if (!isNull(dtlR.sppl_cd())) {
								dtlR.maker_cd(dnR.maker_cd());
							}
							else {
								dtlR.maker_cd(null);
							}
						}
					}
				}
			}
			
			if (!msgL.isEmpty()) {
				MCAppException ex = new MCAppException(msgUpdErr());
				ex.addCauseMessageList(msgL);
				throw ex;
			}
		}

		/**
		 * 見積明細を更新する。
		 */
		protected void updQtnD() {
			
			// 見積引継の場合、見積明細を更新する
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				if (!hasQtn(hdrR)) {
					continue;
				}
				
				updQtnDSub();
				
				break;
			}
		}
		
		/**
		 * 見積が承認対象だった場合、承認提供サービスを実行し、承認次処理済ＦＬＧを更新する。
		 */
		protected void callAprvSvUpd02() {

			MBBAL_AprvService.Aprv_Upd02 ope = MBBAL_AprvService.crtAprv_Upd02();
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				if (!hasQtn(hdrR) || !hdrR.qtn_aprv_flg()) {
					continue;
				}
				Aprv_Chk02_Rslt1R up = Aprv_Chk02_Rslt1R.create();
				up.aprv_no(hdrR.qtn_aprv_no());
				
				ope.up0().add(up);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}

		/**
		 * 見積明細の更新の実処理
		 */
		protected void updQtnDSub() {
			
			MCList<MST_QTN_D_R> orgQtnd = MCList.create(MST_QTN_D_R.class);
			MST_QTN_D_R orgQtnd_t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder orgQtnd_bldr = MCQueryApiBuilder.create(orgQtnd_t);
			orgQtnd_bldr.setSelect(orgQtnd_t.qtn_d_no);
			orgQtnd_bldr.addSelect(orgQtnd_t.slo_trnst_qty);
			dbSelectKeyForUpdate("MSBBL6020_MST_QTN_D_S02", orgQtnd, orgQtnd_bldr, up1());
			MCJoinKey<MCList<MST_QTN_D_R>> jk;
			jk = up1().join("qtn_d_no", orgQtnd, MST_QTN_D_R.$qtn_d_no);
			
			MCList<MST_QTN_D_R> newQtnd = MCList.create(MST_QTN_D_R.class);
			for (Slo_Upd01_DtlR r : up1()) {
				// 見積引継の受注明細以外は対象外
				if (isNull(r.qtn_d_no())) {
					continue;
				}
				MST_QTN_D_R qtndR = r.getJoinedRow(jk);

				MCNumber oldQty = qtndR.slo_trnst_qty();
				if (oldQty == null) {
					oldQty = MCNumber.ZERO;
				}
				MCNumber newQty = oldQty.add(r.trd_unit_qty());
				qtndR.slo_trnst_qty(newQty);
				newQtnd.add(qtndR);
			}
			MST_QTN_D_R newQtnd_t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder newQtnd_bldr = MCQueryApiBuilder.create(newQtnd_t);
			newQtnd_bldr.setSet(newQtnd_t.slo_trnst_qty);
			dbUpdateKey("MSBBL6020_MST_QTN_D_U01", newQtnd, newQtnd_bldr);
		}
		
		/**
		 * 売上予定を更新する。
		 */
		protected void updSlsSchd() {
			
			MSBBL_SlsSchdService.Sls_Schd_Upd01 op = MSBBL_SlsSchdService.crtSls_Schd_Upd01();
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				MCList<Slo_Upd01_DtlR> dtlL = getSloDtlList(hdrR);
				
				//IV取引の場合、売上予定を作成する。
				if (hdrR.cst_iv_flg()) {
	
					for (Slo_Upd01_DtlR dtlR : dtlL) {
						//仕入直送の場合は対象外とする。
						if (!MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
							if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
									|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
									|| MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
								Sls_Schd_Upd01_DtlR slsSchdR = Sls_Schd_Upd01_DtlR.create();
								copy(slsSchdR, dtlR,
										createMap_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR());			
								op.up0().add(slsSchdR);
							}
						}
					}
				}
			}
			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			for (Slo_Upd01_HdrR hdrR : up0()) {
				
				Slo_Ins01_Rslt_HdrR down0R = Slo_Ins01_Rslt_HdrR.create();
				
				down0R.slo_no(hdrR.slo_no());
				down0R.slo_rev(hdrR.slo_rev());
				down0R.aprv_flg(hdrR.aprv_flg());
				down0R.aprv_no(hdrR.aprv_no());
				down0R.aprv_sts_typ(hdrR.aprv_sts_typ());
				down0R.aprv_can_flg(hdrR.can_del_flg());
				down0R.aprv_upd_flg(hdrR.can_upd_flg());
				down0R.iv_no(hdrR.iv_no());
				down0R.slo_dt(hdrR.slo_dt());
				down0R.cst_cd(hdrR.cst_cd());
				down0R.trd_cur_cd(hdrR.trd_cur_cd());
				down0R.wg_cd(hdrR.wg_cd());
				down0R.sls_dpt_cd(hdrR.sls_dpt_cd());
				down0R.wrk_no(hdrR.wrk_no());
				down0R.tterm_cd1(hdrR.tterm_cd1());
				down0R.tterm_cd2(hdrR.tterm_cd2());
				down0R.tterm_cd3(hdrR.tterm_cd3());
				down0R.edi_sub_char1(hdrR.edi_sub_char1());
				down0R.edi_sub_char2(hdrR.edi_sub_char2());
				down0R.edi_sub_char3(hdrR.edi_sub_char3());
				down0R.edi_sub_char4(hdrR.edi_sub_char4());
				down0R.edi_sub_char5(hdrR.edi_sub_char5());
				down0().add(down0R);
			}
			
			Slo_Ins01_Rslt_DtlR down1R = null;
			for (Slo_Upd01_DtlR r : up1()) {
				
				down1R = Slo_Ins01_Rslt_DtlR.create();
				
				down1R.disp_seq(r.disp_seq());  //表示順
				down1R.slo_d_no(r.slo_d_no());  //受注明細ＮＯ
				down1R.sno1(r.sno1());  //手配ＮＯ１
				down1R.sno2(r.sno2());  //手配ＮＯ２
				down1R.sno3(r.sno3());  //手配ＮＯ３
				down1R.sno4(r.sno4());  //手配ＮＯ４
				down1R.ship_schd_dt(r.ship_schd_tm());  //出荷予定日
				down1R.ship_schd_hm(r.ship_schd_tm());  //出荷予定時刻
				down1R.dlv_schd_dt(r.dlv_schd_tm());  //納品予定日
				down1R.dlv_schd_hm(r.dlv_schd_tm());  //納品予定時刻
				down1R.alloc_scope_typ(r.alloc_scope_typ());  //引当範囲区分
				down1R.alloc_typ(r.alloc_typ());  //引当区分
				down1R.rqst_to_loc_cd(r.rqst_to_loc_cd());  //依頼先場所ＣＤ
				down1R.sppl_cd(r.sppl_cd());  //発注先ＣＤ
				down1R.maker_cd(r.maker_cd());  //メーカＣＤ
				down1R.rqst_dt(r.rqst_dt());  //依頼日
				down1R.rqst_dlv_rqst_dt(r.rqst_dlv_rqst_dt());  //依頼納入希望日
				down1R.alloc_grp_cd(r.alloc_grp_cd());  //総量引当場所グループＣＤ
				down1R.def_loc_cd(r.def_loc_cd());  //通常出荷場所ＣＤ
				down1R.loc_cd(r.loc_cd());  //場所ＣＤ
				down1R.str_ln_cd(r.str_ln_cd());  //棚・ラインＣＤ
				down1R.str_ln_cd_none_flg(r.str_ln_cd_none_flg());  //棚・ライン無
				down1R.peg_no(r.peg_no());  //紐付けＮＯ
				down1R.hdr_peg_no(r.hdr_peg_no());  //紐付けＮＯ
				down1R.setAttributes(r); // 属性
				down1R.trd_cur_amt(r.trd_cur_amt());
				down1R.trd_cur_tax_amt(r.trd_cur_tax_amt());
				down1R.data_lno(r.data_lno());
				down1R.dlv_cd(r.dlv_cd());
				down1R.dest_cd1(r.dest_cd1());
				down1R.dest_cd2(r.dest_cd2());
				down1R.dest_cd3(r.dest_cd3());
				down1R.recv_dt(r.recv_dt());
				down1().add(down1R);
			}
		}
	}

	/**
	 * 上り電文の編集
	 * @param hdrR 受注ヘッダ
	 * @param dtlL 受注明細リスト
	 */
	protected void editUp(Slo_Upd01_HdrR hdrR, MCList<Slo_Upd01_DtlR> dtlL) {
		
		if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
			//電文の必要な項目に値を設定する。
			//明細の取引通貨金額、	Ｉ／Ｖ金額、税額、源泉税額、
			MCNumber trdAmt = MCNumber.ZERO;
			MCNumber trdTaxAmt = MCNumber.ZERO;

			for (Slo_Upd01_DtlR dtlR : dtlL) {
				if (dtlR.vmi_flg()){
					continue;
				}
				MCRow amtR = getAmtAndTax(dtlR.trd_cur_upri(), dtlR.trd_unit_qty(),
						dtlR.tax_rate(), dtlR.inc_tax_flg(), hdrR.amt_dec_place(), hdrR.sls_amt_rnd_typ(), hdrR.sls_tax_rnd_typ(),
						dtlR.trd_cur_dscnt_amt());
				
				//明細の取引通貨金額 
				MCNumber trdCurAmt = amtR.getNumber("amt");
				dtlR.trd_cur_amt(trdCurAmt);
				if (dtlR.dscnt_itm_flg()){
					trdCurAmt = trdCurAmt.multiply(-1);
				}
				if (!dtlR.abort_flg() && !MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {					
					trdAmt = trdAmt.add(trdCurAmt);
				}				
				//税額
				dtlR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
				if (!dtlR.abort_flg() && !MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					if (dtlR.dscnt_itm_flg()) {
						trdTaxAmt = trdTaxAmt.subtract(dtlR.trd_cur_tax_amt());
					}
					else {
						trdTaxAmt = trdTaxAmt.add(dtlR.trd_cur_tax_amt());
					}
				}
				
				//Ｉ／Ｖ金額:IV単価×数量　－　値引額
				MCNumber ivamt = getAmt(dtlR.iv_upri(), dtlR.trd_unit_qty(), hdrR.amt_dec_place(), hdrR.sls_amt_rnd_typ(), dtlR.trd_cur_dscnt_amt());
				dtlR.iv_amt(ivamt);
				//源泉税額:取引通貨＝基準通貨＝納税通貨」、もしくは「取引通貨＝基準通貨かつ納税通貨IS NULL場合のみ計算する。
				if (!isNull(dtlR.wtax_rate())) {
					if (isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd()) 
							&& (isSame(hdrR.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd()))) {
						
						dtlR.wtax_amt(trdCurAmt.multiply(dtlR.wtax_rate()).divide(100,
								hdrR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().wtax_rnd_typ())));
					}
				}
			}
			//ヘッダの取引通貨金額の算出		 
			hdrR.trd_cur_amt(trdAmt);
			//ヘッダの税額
			hdrR.trd_cur_tax_amt(trdTaxAmt);
		}
	}

	public MCMainQuery get_MST_PO_D_S01_sql() {
		MST_SLO_D_R S0T = MST_SLO_D_R.create("T");
		MST_PO_D_R S0T2 = MST_PO_D_R.create("T2");
		MCMainQuery q = sql("MSBBL6020_MST_SLO_D_S04")
			.mainQuery()
			.select(S0T.slo_no)
			.from(
				S0T
				.innerJoin(S0T2).on(
					bracket(
						S0T.slo_d_no.eq(S0T2.slo_d_no)
					)
				)
			)
			.where(
				value(0).eq(value(0))
				.and(S0T.slo_no.eq(bind("slo_no")))
				.and(S0T2.dlv_cd.isNotNull())
				.and(S0T2.can_flg.eq(value(false)))
			);
		return q;
	}

	/**
	 * 受注明細ＮＯを発番する。また、受払進捗管理ＮＯも合わせて発番する
	 * @param dtl
	 */
	protected void setupSloDNO(MCList<Slo_Upd01_DtlR> dtl, Slo_Upd01_HdrR hdr) {
		MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
		
		for (Slo_Upd01_DtlR dtlR : dtl) {
			if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				ElmArgsR argsR = ElmArgsR.create();
				argsR.bp_cd(hdr.cst_cd());
				argsR.trd_cd(hdr.trd_cd());
				argsR.dpt_cd(hdr.sls_dpt_cd());
				argsR.co_cd(getCo().co_cd());
				argsR.dt(hdr.slo_dt());
				argsR.wg_cd(hdr.wg_cd());
				argsR.itm_cd(dtlR.itm_cd());
				argsR.itm_sub1(dtlR.itm_sub1());
				argsR.itm_sub2(dtlR.itm_sub2());
				argsR.itm_sub3(dtlR.itm_sub3());
				argsR.peg_no(dtlR.peg_no());
				argsL.add(argsR);
				dtlR.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
			}
		}
		setNum(MAC_NUM_BIZ_TYP.SLOD, argsL);
		String[] srcCols = {ElmArgsR.$new_no};
		String[] destCols = {Slo_Upd01_DtlR.$slo_d_no};
		copyByPegNo(dtl, destCols, argsL, srcCols);
	}

	/**
	 * 発番対象行を取得する。
	 * @param dtlL
	 * @return
	 */
	protected MCList<Slo_Upd01_DtlR> getSetSno(MCList<Slo_Upd01_DtlR> dtlL) {
		MCList<Slo_Upd01_DtlR> l = MCList.create(Slo_Upd01_DtlR.class);
		
		// システムパラメータで 手配ＮＯ を使用しない設定になっている場合は対象なし。
		int use_att = Integer.parseInt(getSysParm("SNO_TYP"));
		if (!(1 <= use_att && use_att <= 4)) {
			return l;
		}
				
		l = dtlL.subList(Slo_Upd01_DtlR.$sno_num_flg, true);
		return l;
	}
	
	/**
	 * 手配ＮＯを設定する。
	 */
	protected void setSeiban(MCList<Slo_Upd01_HdrR> hdrL, MCList<Slo_Upd01_DtlR> dtlL) {
		
		MCIndexKey idxkey= dtlL.createIndex(Slo_Upd01_DtlR.$hdr_peg_no);
		
		for (Slo_Upd01_HdrR hdrR : hdrL) {
			MCList<Slo_Upd01_DtlR> subL = dtlL.subList(idxkey, hdrR.peg_no());
		
			MCList<Slo_Upd01_DtlR> l = getSetSno(subL);
			if (l.isEmpty()) {
				chkSno(subL, hdrR);
				continue;
			}
			
			for (Slo_Upd01_DtlR dtlR : l) {
				
				ElmArgsR argsR = ElmArgsR.create();
				
				argsR.dpt_cd(hdrR.sls_dpt_cd()); // 売上部門ＣＤ
				argsR.co_cd(getCo().co_cd()); // 自社ＣＤ
				argsR.bp_cd(hdrR.cst_cd()); // 得意先ＣＤ
				argsR.wg_cd(hdrR.wg_cd()); // WGCD
				argsR.trd_cd(hdrR.trd_cd()); // 取引ＣＤ
				argsR.dt(hdrR.slo_dt()); // 受注日
				argsR.str(hdrR.slo_no()); // 文字列（受注NO）
				argsR.str2(dtlR.slo_d_no()); // 文字列２（受注明細NO）
				argsR.str3(hdrR.wrk_no()); // 文字列３（案件ＮＯ）
				argsR.itm_cd(dtlR.itm_cd()); // 品目ＣＤ
				argsR.itm_sub1(dtlR.itm_sub1()); // 枝番１
				argsR.itm_sub2(dtlR.itm_sub2()); // 枝番２
				argsR.itm_sub3(dtlR.itm_sub3()); // 枝番３
	
				// 手配ＮＯ１
				//　手配ＮＯがNull文字の場合も発番しない。 新規登録時は発番したくない場合はNull文字を指定する。更新時に発番させたい場合はNull文字を消す。
				// 手配ＮＯ管理区分が「2:自動」の場合、常に発番する。
				// ただし、案件管理の場合に、手配ＮＯ１がNull文字の場合も発番する。
				if (!MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno1_mng_typ()) 
						&& !MAC_SNO_NO_TYP.isMANUAL(dtlR.sno1_num_typ()) 
						&& (isNull(dtlR.sno1()) || MAC_SNO_NO_TYP.isAUTO(dtlR.sno1_num_typ()) || (isNullOrNullVal(dtlR.sno1()) && !isNull(hdrR.wrk_no())))) {
					argsR.num_ptn_cd(dtlR.sno1_ptn_cd()); // 発番パタンＣＤ
					dtlR.sno1(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
				}
				// 手配ＮＯ２
				//　手配ＮＯがNull文字の場合も発番しない。 新規登録時は発番したくない場合はNull文字を指定する。更新時に発番させたい場合はNull文字を消す。
				// 手配ＮＯ管理区分が「2:自動」の場合、常に発番する。
				if (!MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno2_mng_typ()) 
						&& !MAC_SNO_NO_TYP.isMANUAL(dtlR.sno2_num_typ()) 
						&& (isNull(dtlR.sno2()) || MAC_SNO_NO_TYP.isAUTO(dtlR.sno2_num_typ()))) {
					argsR.num_ptn_cd(dtlR.sno2_ptn_cd()); // 発番パタンＣＤ
					dtlR.sno2(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
				}
				// 手配ＮＯ３
				//　手配ＮＯがNull文字の場合も発番しない。 新規登録時は発番したくない場合はNull文字を指定する。更新時に発番させたい場合はNull文字を消す。
				// 手配ＮＯ管理区分が「2:自動」の場合、常に発番する。
				if (!MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno3_mng_typ()) 
						&& !MAC_SNO_NO_TYP.isMANUAL(dtlR.sno3_num_typ()) 
						&& (isNull(dtlR.sno3()) || MAC_SNO_NO_TYP.isAUTO(dtlR.sno3_num_typ()))) {
					argsR.num_ptn_cd(dtlR.sno3_ptn_cd()); // 発番パタンＣＤ
					dtlR.sno3(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
				}
				// 手配ＮＯ４
				//　手配ＮＯがNull文字の場合も発番しない。 新規登録時は発番したくない場合はNull文字を指定する。更新時に発番させたい場合はNull文字を消す。
				// 手配ＮＯ管理区分が「2:自動」の場合、常に発番する。
				if (!MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno4_mng_typ()) 
						&& !MAC_SNO_NO_TYP.isMANUAL(dtlR.sno4_num_typ()) 
						&& (isNull(dtlR.sno4()) || MAC_SNO_NO_TYP.isAUTO(dtlR.sno4_num_typ()))) {
					argsR.num_ptn_cd(dtlR.sno4_ptn_cd()); // 発番パタンＣＤ
					dtlR.sno4(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
				}
			}
			
			chkSno(subL, hdrR);
		}
	}

	/**
	 * 手配ＮＯをチェックする。
	 * @param dtlL 見積明細
	 */
	protected void chkSno(MCList<Slo_Upd01_DtlR> dtlL, Slo_Upd01_HdrR hdrR) {
		
		MCMessageList msgL = new MCMessageList();
		
		for (Slo_Upd01_DtlR dtlR: dtlL) {
			// 手配ＮＯがNullになる場合はNUll文字を保管する。
			if (isNull(dtlR.sno1())) {
				dtlR.sno1(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dtlR.sno2())) {
				dtlR.sno2(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dtlR.sno3())) {
				dtlR.sno3(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dtlR.sno4())) {
				dtlR.sno4(MAC_STR.NULL_VAL.value());
			}
			//ヘッダの案件NOが入力された場合も、手配NO１が必須
			if ((dtlR.slo_sno1_flg() || !isNull(hdrR.wrk_no())) && isNullOrNullVal(dtlR.sno1())){
				dtlR.sno1(null);
				msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sno1, new FXUCL_RequiredValidater()));
			}
			if (dtlR.slo_sno2_flg() && isNullOrNullVal(dtlR.sno2())) {
				dtlR.sno2(null);
				msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sno2, new FXUCL_RequiredValidater()));
			}
			if (dtlR.slo_sno3_flg() && isNullOrNullVal(dtlR.sno3())) {
				dtlR.sno3(null);
				msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sno3, new FXUCL_RequiredValidater()));
			}
			if (dtlR.slo_sno4_flg() && isNullOrNullVal(dtlR.sno4())) {
				dtlR.sno4(null);
				msgL.addAll(check(dtlR, Slo_Upd01_DtlR.$sno4, new FXUCL_RequiredValidater()));
			}
		}		
		MCMessagePool.addAll(msgL);		
		throwUpdErr();
	}
	/**
	 * 後続処理が登録されているかつ備考、予備のみ更新の明細を除外して返す。
	 * @param dL 上り電文の受注明細
	 * @return 後続処理が登録されているかつ備考、予備のみ更新の明細を除外した受注明細リスト
	 */
	protected MCList<Slo_Upd01_DtlR> removeRmrksSubUpdRows(MCList<Slo_Upd01_DtlR> dL) {
		
		return dL.subList(r->!isOnlyUpdTrnstRmrks(r));
	}
	
	/**
	 * 引数で指定された行は後続処理が登録されているかつ備考、予備のみ更新の明細か評価する。
	 * @param dtlR 上り電文の受注明細
	 * @return 後続処理が登録されているかつ備考、予備のみ更新の明細の場合はtrue
	 */
	protected boolean isOnlyUpdTrnstRmrks(Slo_Upd01_DtlR dtlR) {
		
		MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
		
		if (isNull(oldSloDR) ) {
			return false;
		}
		
		return oldSloDR.getBooleanNE("only_upd_trnst_rmrks_flg");
	}

	/**
	 * 出荷予定日計算サービス実行
	 * @param hdr 受注ヘッダ
	 * @param dL 受注明細リスト
	 */
	protected void callShipSchdDtService(MCList<Slo_Upd01_HdrR> hdrL, MCList<Slo_Upd01_DtlR> dL) {
		//出荷予定日計算サービス.出荷予定日計算（ロット提案なし）
		MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 op = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
		
		MCIndexKey idxkey= hdrL.createIndex(Slo_Upd01_HdrR.$peg_no);
		for (Slo_Upd01_DtlR r : dL) {
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				if (!MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ()) && !MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())){
					//自動計算しないＦＬＧ=OFF
					if (!r.not_dt_calc_flg()) {
						Slo_Upd01_HdrR hdr = hdrL.getFirst(idxkey, r.hdr_peg_no());
						MSW_SHIP_SCHD_DT_CALC_R cndR = MSW_SHIP_SCHD_DT_CALC_R.create();
						copy(cndR, r, createMap_MSW_SHIP_SCHD_DT_CALC_R_Slo_Upd01_DtlR());
						cndR.base_dt(hdr.slo_dt());
						op.up0().add(cndR);
					}
				}
			}
		}
		if (!op.up0().isEmpty()){
			op.exec();
		}
		//計算結果を一覧に設定する
		for (Slo_Upd01_DtlR r : dL) {
			for (MSW_SHIP_SCHD_DT_CALC_R dowR : op.down0()){
				if (isSame(r.peg_no(), dowR.peg_no())) {
					r.ship_schd_tm(dowR.ship_schd_tm());
					r.dlv_schd_tm(dowR.dlv_schd_tm());
					r.ship_wk_cd(dowR.ship_wk_cd()); //出荷作業ＣＤ
				}
			}
		}
	}

	/**
	 * 有効期限チェック、ロット逆転チェック
	 */
	protected void checkLotLimitRevise(MCList<Slo_Upd01_HdrR> hdrL, MCList<Slo_Upd01_DtlR> dtl) {
		//有効期限チェック,	ロット逆転チェックを実行する。
		MSBEL_ShipLotChkService.ShipLotChk_Chk01 shipLotChk = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
		
		MCIndexKey idxkey= hdrL.createIndex(Slo_Upd01_HdrR.$peg_no);
		for (Slo_Upd01_DtlR dtlR : dtl) {
			//打切の場合、チェックしない
			if (dtlR.abort_flg()) {
				continue;
			}
			//削除の場合、チェックしない
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				continue;
			}
			if (!isNullOrNullVal(dtlR.lot_no())) {
				//明細のロットを指定した場合、ロットの有効期限が有効期限制御の条件を満たすかチェックする。
				Slo_Upd01_HdrR hdr = hdrL.getFirst(idxkey, dtlR.hdr_peg_no());
				ShipLot_DtlR lotR = ShipLot_DtlR.create();
				copy(lotR, dtlR, hdr, createMap_ShipLot_DtlR_Slo_Upd01_DtlR());
				shipLotChk.up0().add(lotR);
			}
		}
		if (shipLotChk.up0().isEmpty()) {
			return;
		}
		shipLotChk.exec();
		if (!isNull(shipLotChk.down0())) {
			copyErrFlg(dtl, shipLotChk.down0());
		}
		
	}

	/**
	 * 品目の有効期限の取得
	 * @param hdr 受注ヘッダ
	 * @param dtl 受注明細リスト
	 */
	protected void getItmValidDt(MCList<Slo_Upd01_HdrR> hdrL, MCList<Slo_Upd01_DtlR> dtl) {
		//品目の有効期限の取得
		MSBEL_ShipLotChkService.ShipLotChk_Srch01 shipLotSv = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
		MCIndexKey idxkey= hdrL.createIndex(Slo_Upd01_HdrR.$peg_no);
		for (Slo_Upd01_DtlR dtlR : dtl) {
			//打切の場合、チェックしない
			if (dtlR.abort_flg()) {
				continue;
			}
			//削除の場合、チェックしない
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				continue;
			}
			//手配区分＝在庫引当、引当後手配,手配依頼の場合のみ
			if (MAC_SLO_PROC_TYP.isALLOC(dtlR.proc_typ())
					|| MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())
					|| MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ())) {
				//明細のロットを指定した場合、ロットの有効期限が有効期限制御の条件を満たすかチェックする。
				Slo_Upd01_HdrR hdr = hdrL.getFirst(idxkey, dtlR.hdr_peg_no());
				ShipLot_DtlR lotR = ShipLot_DtlR.create();
				copy(lotR, dtlR, hdr, createMap_ShipLot_DtlR_Slo_Upd01_DtlR());
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
			Slo_Upd01_DtlR dlR = dtl.subList(Slo_Upd01_DtlR.$peg_no, retR.peg_no())
					.get(0);
			//有効期限（下限）
			dlR.valid_dt_fr(retR.valid_dt_fr());
			//有効期限（下限）継承Ｇ
			dlR.valid_dt_fr_grp(retR.valid_dt_fr_grp());
			//有効期限（上限）
			dlR.valid_dt_to(retR.valid_dt_to());
		}
	}

	/**
	 * Insert用の受注明細を作成する
	 */
	protected MCList<MST_SLO_D_R> createInsSloD(MST_SLO_R hdrR,
			MCList<? extends Slo_Upd01_DtlR> dtlL) {

		MCList<MST_SLO_D_R> slod = MCList.create(MST_SLO_D_R.class);
		setAll(slod, dtlL, hdrR, createMap_MST_SLO_D_R_Slo_Upd01_DtlR());
		return slod;
	}

	/**
	 * 受注状況更新
	 * @param hdr 受注ヘッダ
	 * @param dtl 受注明細リスト
	 */
	protected void callSloStsReg(MCList<Slo_Upd01_HdrR> hdrL, MCList<Slo_Upd01_DtlR> dtl) {
		MSBBL_SloStsRegService.SloSts_Ins01 stsRegOp = MSBBL_SloStsRegService
				.crtSloSts_Ins01();
		MCIndexKey idxkey= hdrL.createIndex(Slo_Upd01_HdrR.$peg_no);
		for (Slo_Upd01_DtlR dtlR : dtl) {
			if (!isNull(dtlR.data_crud_typ())) {
				SloSts_DtlR stsR = SloSts_DtlR.create();
				Slo_Upd01_HdrR hdr = hdrL.getFirst(idxkey, dtlR.hdr_peg_no());
				copy(stsR, dtlR, hdr, createMap_SloSts_DtlR_Slo_Upd01_DtlR());
				stsRegOp.up0().add(stsR);
			}
		}
		
		if (!stsRegOp.up0().isEmpty()){
			stsRegOp.exec();
		}
	}
	
	/**
	 * 受注状況更新（通常の引当結果）
	 * 受注登録・訂正時の引当処理結果の受注状況を書き込む
	 * 手配区分が手配依頼・引当後手配で発生した入庫予定に対する引当結果は、
	 * 出荷供給依頼サービスを実行後に別途書き込む
	 *
	 * @param dtl 受注明細リスト
	 */
	protected void callSloStsRegNrmlAlloc(MCList<Slo_Upd01_DtlR> dtl) {
		
		if (_allocResultLSloStsNrml.isEmpty()) {
			return;
		}
		MSBBL_SloStsRegService.SloSts_Ins01 stsRegOp = MSBBL_SloStsRegService.crtSloSts_Ins01();
		
		MCIndexKey ik = _allocResultLSloStsNrml.createIndex(Srch_RsltR.$peg_no);
		for (Slo_Upd01_DtlR dtlR : dtl) {
			if (!isNull(dtlR.data_crud_typ())) {
				MCList<Srch_RsltR> allocL = _allocResultLSloStsNrml.subList(ik, dtlR.peg_no());
				MCGroupByPolicy gp = new MCGroupByPolicy(Srch_RsltR.$pack_unit_cd);
				gp.sum(Srch_RsltR.$pack_unit_qty);
				MCList<Srch_RsltR> allocSumL = allocL.groupBy(gp);
				addAll(stsRegOp.up0(), allocSumL, dtlR, createMap_SloSts_DtlR_Srch_RsltR());
			}
		}
		
		if (!stsRegOp.up0().isEmpty()){
			stsRegOp.exec();
		}
	}
	
	/**
	 * 受注状況更新（出荷供給依頼サービスで作られた入庫予定に対する引当結果）
	 * @param dtl 受注明細リスト
	 */
	protected void callSloStsRegDmndRqstAlloc(MCList<Slo_Upd01_DtlR> dtl) {
		
		if (_allocResultLSloStsDmndRqst.isEmpty()) {
			return;
		}
		MSBBL_SloStsRegService.SloSts_Ins01 stsRegOp = MSBBL_SloStsRegService.crtSloSts_Ins01();
		
		MCIndexKey ik = _allocResultLSloStsDmndRqst.createIndex(Srch_RsltR.$peg_no);
		for (Slo_Upd01_DtlR dtlR : dtl) {
			if (!isNull(dtlR.data_crud_typ())) {
				MCList<Srch_RsltR> allocL = _allocResultLSloStsDmndRqst.subList(ik, dtlR.peg_no());
				MCGroupByPolicy gp = new MCGroupByPolicy(Srch_RsltR.$pack_unit_cd);
				gp.sum(Srch_RsltR.$pack_unit_qty);
				MCList<Srch_RsltR> allocSumL = allocL.groupBy(gp);
				addAll(stsRegOp.up0(), allocSumL, dtlR, createMap_SloSts_DtlR_Srch_RsltR());
			}
		}
		
		if (!stsRegOp.up0().isEmpty()){
			stsRegOp.exec();
		}
	}
	
	protected Map_SloSts_DtlR_Srch_RsltR<SloSts_DtlR,Srch_RsltR,Slo_Upd01_DtlR> createMap_SloSts_DtlR_Srch_RsltR() {
		return new Map_SloSts_DtlR_Srch_RsltR<SloSts_DtlR, Srch_RsltR,Slo_Upd01_DtlR>();
	}

	public class Map_SloSts_DtlR_Srch_RsltR<D extends SloSts_DtlR, S extends Srch_RsltR, W extends Slo_Upd01_DtlR>  extends MAUCC_RowMapperWith<D,S,W>{
		protected W _slo_Upd01_DtlR;
		@Override
		public void setWith(W _slo_Upd01_DtlR){
			this._slo_Upd01_DtlR = _slo_Upd01_DtlR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$unit_cd, Srch_RsltR.$pack_unit_cd);
			addColumnPathMap(SloSts_DtlR.$qty, Srch_RsltR.$pack_unit_qty);

		}
		@Override
		public void valueCopy(D dest, S src) {
			dest.slo_sts_typ(MSC_SLO_STS_TYP.ALLOC.value());
			dest.slo_d_no(_slo_Upd01_DtlR.slo_d_no());
			dest.alloc_grp_cd(_slo_Upd01_DtlR.alloc_grp_cd());
			dest.ship_lg_grp_cd(_slo_Upd01_DtlR.ship_lg_grp_cd());
			dest.loc_cd(_slo_Upd01_DtlR.loc_cd());
		}
	}

	/**
	 * 依頼先WG_CDの取得
	 * 
	 * @param sloDt
	 * @param dtlR
	 * @param wgCd
	 * @param slsDptCd
	 * @return
	 */
	protected String getRqstToWgCd(MCDate sloDt, MCRow dtlR, String wgCd, String slsDptCd) {
		String oldRqstWgCd = "";
		MCDate tmpBaseDt = null;
		if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.getStringNE("proc_typ"))) {
			tmpBaseDt = dtlR.getDateNE("dlv_rqst_tm");
		}
		else {
			tmpBaseDt = dtlR.getDateNE("ship_schd_tm");
		}
		
		MCList<MAM_ITM_DTL_R> tmpItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R tmpItmDtlL_t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder tmpItmDtlL_bldr = MCQueryApiBuilder.create(tmpItmDtlL_t);
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		tmpItmDtlL_bldr.setSelect(tmpItmDtlL_t.sppl_cd);
		tmpItmDtlL_bldr.addSelect(tmpItmDtlL_t.maker_cd);
		tmpItmDtlL_bldr.addSelect(tmpItmDtlL_t.st_dt);
		tmpItmDtlL_bldr.addSelect(tmpItmDtlL_t.end_dt);
		tmpItmDtlL_bldr.addSelect(tmpItmDtlL_t.mfg_loc_cd);
		tmpItmDtlL_bldr.addSelect(tmpItmDtlL_t.bom_ptn);
		tmpItmDtlL_bldr.addSelect(tmpItmDtlL_t.prio);
		tmpItmDtlL_bldr.addLeftOuterJoin(m1,
				bracket(tmpItmDtlL_t.mfg_loc_cd.eq(m1.loc_cd)));
		tmpItmDtlL_bldr.setWhere(tmpItmDtlL_t.itm_cd.eq(bind("1")),
				dtlR.getString("itm_cd"));
		tmpItmDtlL_bldr.addWhereWithAnd(tmpItmDtlL_t.itm_sub1.eq(bind("1")),
				dtlR.getString("itm_sub1"));
		tmpItmDtlL_bldr.addWhereWithAnd(tmpItmDtlL_t.itm_sub2.eq(bind("1")),
				dtlR.getString("itm_sub2"));
		tmpItmDtlL_bldr.addWhereWithAnd(tmpItmDtlL_t.itm_sub3.eq(bind("1")),
				dtlR.getString("itm_sub3"));
		tmpItmDtlL_bldr.addWhereWithAnd(tmpItmDtlL_t.wg_cd.eq(bind("1")), wgCd);
		tmpItmDtlL_bldr.addWhereWithAnd(
						bracket(bracket(tmpItmDtlL_t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
								.and(tmpItmDtlL_t.sppl_cd.eq(bind("1")))
								.and(tmpItmDtlL_t.maker_cd.eq(bind("2"))))
										.or(tmpItmDtlL_t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value()))
												.and(m1.sppl_cd.eq(bind("1")))
												.and(nvl(m1.maker_cd,value(MAC_STR.NULL_VAL.value())).eq(bind("2"))))),
						dtlR.getString("sppl_cd"),
						nvl(dtlR.getString("maker_cd"), MAC_STR.NULL_VAL.value()));
		dbSelect("MSBBL6020_MAM_ITM_DTL_S04", tmpItmDtlL, tmpItmDtlL_bldr);
		
		tmpItmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$st_dt, MAM_ITM_DTL_R.$end_dt);
		
		MCDate baseDt = null;
		for (MAM_ITM_DTL_R tmpItmDtlR : tmpItmDtlL) {
			// 購買ユーティリティ呼出
			dtlR.addStringColumn("mfg_loc_cd", tmpItmDtlR.mfg_loc_cd());
			dtlR.addStringColumn("bom_ptn", tmpItmDtlR.bom_ptn());
			
			baseDt = callPurcUtilSrch01(tmpBaseDt, dtlR, sloDt, slsDptCd);
			if (!isNull(baseDt) && tmpItmDtlR.st_dt().lte(baseDt) && tmpItmDtlR.end_dt().gte(baseDt)) {
				break;
			}
			else {
				baseDt = null;
			}
		}
		
		if (isNull(baseDt)) {
			String msgId = null;
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.getStringNE("proc_typ"))) {
				msgId = MSBBL0408;
			}
			else {
				msgId = MSBBL0407;
			}
			boolean outsrcFlg = !isNullOrNullVal(dtlR.getStringNE("mfg_loc_cd"));
			MCMessage msg = new MCMessage(dtlR, null, msgId,
					toDispItm(dtlR.getString("itm_cd"), dtlR.getString("itm_sub1"),
							dtlR.getString("itm_sub2"), dtlR.getString("itm_sub3")),
					wgCd,
					outsrcFlg ? dtlR.getStringNE("bom_ptn") : MAC_STR.NULL_VAL.value(),
					outsrcFlg ? dtlR.getStringNE("mfg_loc_cd") : MAC_STR.NULL_VAL.value(),
					outsrcFlg ? MAC_STR.NULL_VAL.value() : dtlR.getString("sppl_cd"),
					dtlR.getString("maker_cd"),
					toYMDString(tmpBaseDt), toDispGUIIndex(dtlR));
			throw new MCAppException(msg);
		}
		
		MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R itmDtlL_t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder itmDtlL_bldr = MCQueryApiBuilder.create(itmDtlL_t);
		itmDtlL_bldr.setSelect(itmDtlL_t.rqst_wg_cd);
		itmDtlL_bldr.addLeftOuterJoin(m1, bracket( itmDtlL_t.mfg_loc_cd.eq(m1.loc_cd)));
		itmDtlL_bldr.setWhere(itmDtlL_t.itm_cd.eq(bind("1")), dtlR.getString("itm_cd"));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub1.eq(bind("1")), dtlR.getString("itm_sub1"));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub2.eq(bind("1")), dtlR.getString("itm_sub2"));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub3.eq(bind("1")), dtlR.getString("itm_sub3"));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.wg_cd.eq(bind("1")), wgCd);
		itmDtlL_bldr.addWhereWithAnd(bind("1").between(itmDtlL_t.st_dt, itmDtlL_t.end_dt), baseDt);
		itmDtlL_bldr.addWhereWithAnd(
				bracket(bracket(itmDtlL_t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(itmDtlL_t.sppl_cd.eq(bind("1")))
							.and(itmDtlL_t.maker_cd.eq(bind("2"))))
						.or(itmDtlL_t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(m1.sppl_cd.eq(bind("1")))
							.and(nvl(m1.maker_cd, value(MAC_STR.NULL_VAL.value())).eq(bind("2"))))),
				dtlR.getString("sppl_cd"),
				nvl(dtlR.getString("maker_cd"), MAC_STR.NULL_VAL.value()));
		itmDtlL_bldr.setOrderByAsc(itmDtlL_t.prio);
		int iCnt = dbSelect("MSBBL6020_MAM_ITM_DTL_S05", itmDtlL, itmDtlL_bldr);
		if (iCnt > 0) {
			oldRqstWgCd = itmDtlL.get(0).rqst_wg_cd();
		}
		
		if (isNull(oldRqstWgCd)){
			oldRqstWgCd = "";
		}
		return oldRqstWgCd;
	}
	/**
	 * 依頼先WG_CDの取得(納期基準ベース用)
	 * 
	 * @param hdr
	 * @param dtlR
	 * @return
	 */
	protected String getRqstToWgCd(MCDate sloDt, MCRow dtlR, String wgCd) {
		String oldRqstWgCd = "";
		MCDate baseDt = null;
		if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.getStringNE("proc_typ"))) {
			baseDt = dtlR.getDateNE("dlv_rqst_tm");
		}
		else {
			baseDt = dtlR.getDateNE("ship_schd_tm");
		}
		// 外注発注先も対象と出来るよう、製造場所が発注先のレコードも対象とする。
		MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R itmDtlL_t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder itmDtlL_bldr = MCQueryApiBuilder.create(itmDtlL_t);
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		itmDtlL_bldr.setSelect(itmDtlL_t.rqst_wg_cd);
		itmDtlL_bldr.addLeftOuterJoin(m1, bracket( itmDtlL_t.mfg_loc_cd.eq(m1.loc_cd)));
		itmDtlL_bldr.setWhere(itmDtlL_t.itm_cd.eq(bind("1")), dtlR.getString("itm_cd"));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub1.eq(bind("1")), dtlR.getString("itm_sub1"));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub2.eq(bind("1")), dtlR.getString("itm_sub2"));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.itm_sub3.eq(bind("1")), dtlR.getString("itm_sub3"));
		itmDtlL_bldr.addWhereWithAnd(itmDtlL_t.wg_cd.eq(bind("1")), wgCd);
		itmDtlL_bldr.addWhereWithAnd(bind("1").between(itmDtlL_t.st_dt, itmDtlL_t.end_dt), baseDt);
		itmDtlL_bldr.addWhereWithAnd(
				bracket(bracket(itmDtlL_t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(itmDtlL_t.sppl_cd.eq(bind("1")))
							.and(itmDtlL_t.maker_cd.eq(bind("2"))))
						.or(itmDtlL_t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(m1.sppl_cd.eq(bind("1")))
							.and(nvl(m1.maker_cd, value(MAC_STR.NULL_VAL.value())).eq(bind("2"))))),
				dtlR.getString("sppl_cd"),
				nvl(dtlR.getString("maker_cd"), MAC_STR.NULL_VAL.value()));
		itmDtlL_bldr.setOrderByAsc(itmDtlL_t.prio);
		int iCnt = dbSelect("MSBBL6020_MAM_ITM_DTL_S06", itmDtlL, itmDtlL_bldr);
		if (iCnt > 0) {
			oldRqstWgCd = itmDtlL.get(0).rqst_wg_cd();
		}
		else {
			MCMessage msg = new MCMessage(MSBBL0183,
					toDispItm(dtlR.getString("itm_cd"), dtlR.getString("itm_sub1"),
							dtlR.getString("itm_sub2"), dtlR.getString("itm_sub3")),
					wgCd,dtlR.getString("sppl_cd"),dtlR.getString("maker_cd"),toYMDString(baseDt),
					toDispGUIIndex(dtlR));
			throw new MCAppException(msg);
		}
		
		if (isNull(oldRqstWgCd)){
			oldRqstWgCd = "";
		}
		return oldRqstWgCd;
	}
	/**
	 * 見積引継ぎ判定<br />
	 * 
	 * 見積引継ぎの受注かを鑑定する
	 * 
	 * @return 見積引継ぎの場合true
	 */
	protected boolean hasQtn(Slo_Upd01_HdrR hdr) {
		return !isNull(hdr.qtn_no());
	}	
	
	/**
	 * 受注明細の打切解除か判定する。
	 * @param dtlR 受注明細
	 * @param oldSloDR 変更前受注明細
	 * @return 打切解除の場合はtrue
	 */
	protected boolean isAbortRet(Slo_Upd01_DtlR dtlR, MST_SLO_D_R oldSloDR) {
		return (!dtlR.abort_flg() && oldSloDR.abort_flg());
	}

	/**
	 * 引当解除対象を判断する。
	 * @param oldSloDR
	 * @param oldShipPrR
	 * @param dtlR
	 * @return
	 */
	protected boolean isAllocCancel(MST_SLO_D_R oldSloDR, MST_SHIP_PR_R oldShipPrR,
			Slo_Upd01_DtlR dtlR, Slo_Upd01_HdrR hdrR) {
		//下記の場合、引当解除を行わない。
		//変更前と変更後の品目、数量、単位、在庫のキー項目、納入希望日等の日付項目、引当区分、引当範囲区分、手配区分が同一の明細。
		if (isSame(oldSloDR.itm_cd(), dtlR.itm_cd())
				&& isSame(oldSloDR.itm_sub1(), dtlR.itm_sub1())
				&& isSame(oldSloDR.itm_sub2(), dtlR.itm_sub2())
				&& isSame(oldSloDR.itm_sub3(), dtlR.itm_sub3())
				&& isSame(oldSloDR.trd_unit_qty(), dtlR.trd_unit_qty())
				&& isSame(oldSloDR.trd_unit_cd(), dtlR.trd_unit_cd())
				&& isSame(oldSloDR.loc_cd(), dtlR.loc_cd())
				&& isSame(oldSloDR.str_ln_cd(), dtlR.str_ln_cd())
				&& isSame(oldSloDR.lot_no(), dtlR.lot_no())
				&& isSame(oldSloDR.sublot_no(), dtlR.sublot_no())
				&& isSame(oldSloDR.ver_no(), dtlR.ver_no())
				&& isSame(oldSloDR.sno1(), dtlR.sno1())
				&& isSame(oldSloDR.sno2(), dtlR.sno2())
				&& isSame(oldSloDR.sno3(), dtlR.sno3())
				&& isSame(oldSloDR.sno4(), dtlR.sno4())
				&& isSame(oldSloDR.sno1_null_flg(), dtlR.sno1_null_flg())
				&& isSame(oldSloDR.sno2_null_flg(), dtlR.sno2_null_flg())
				&& isSame(oldSloDR.sno3_null_flg(), dtlR.sno3_null_flg())
				&& isSame(oldSloDR.sno4_null_flg(), dtlR.sno4_null_flg())
				&& isSame(oldSloDR.gd_cd(), dtlR.gd_cd())
				&& isSame(oldSloDR.ship_term_cd(), dtlR.ship_term_cd())
				&& isSame(oldSloDR.ship_rqst_tm(), dtlR.ship_rqst_tm())
				&& (MAC_VIA_DLV_TYP.isVIA(oldSloDR.via_dlv_typ()) ||
						(!MAC_VIA_DLV_TYP.isVIA(oldSloDR.via_dlv_typ()) 
								&& (isNullAnd(oldSloDR.dlv_rqst_tm(), dtlR.dlv_rqst_tm()) 
										|| (!isNull(oldSloDR.dlv_rqst_tm()) && !isNull(dtlR.dlv_rqst_tm()) && isSame(oldSloDR.dlv_rqst_tm().startTimeOfDay(), dtlR.dlv_rqst_tm().startTimeOfDay())))))
				&& ((oldSloDR.sls_cststk_flg() && dtlR.sls_cststk_flg() && isSame(oldSloDR.sls_schd_dt(), dtlR.sls_schd_dt()))
					|| (!oldSloDR.sls_cststk_flg() && dtlR.sls_cststk_flg() && !isNull(oldShipPrR.ship_schd_tm()) && isSame(oldShipPrR.ship_schd_tm().startTimeOfDay(), dtlR.sls_schd_dt()))
					|| (oldSloDR.sls_cststk_flg() && !dtlR.sls_cststk_flg() && !isNull(dtlR.ship_schd_tm()) && isSame(oldSloDR.sls_schd_dt(), dtlR.ship_schd_tm().startTimeOfDay()))
					|| (!oldSloDR.sls_cststk_flg() && !dtlR.sls_cststk_flg() && !isNull(dtlR.ship_schd_tm()) && !isNull(oldShipPrR.ship_schd_tm()) && isSame(oldShipPrR.ship_schd_tm().startTimeOfDay(), dtlR.ship_schd_tm().startTimeOfDay())))
				&& isSame(oldShipPrR.dlv_schd_tm().startTimeOfDay(), dtlR.dlv_schd_tm().startTimeOfDay())
				&& isSame(oldSloDR.proc_typ(), dtlR.proc_typ())
				&& isSame(oldSloDR.alloc_scope_typ(), dtlR.alloc_scope_typ())
				&& isSame(oldSloDR.ship_schd_split_typ(), dtlR.ship_schd_split_typ())
				&& isSame(oldSloDR.alloc_typ(), dtlR.alloc_typ())
				&& isSame(oldSloDR.alloc_grp_cd(), dtlR.alloc_grp_cd())
				&& isSame(oldSloDR.ship_lg_grp_cd(), dtlR.ship_lg_grp_cd())
				&& isSame(oldShipPrR.cst_cd(), hdrR.cst_cd())
				&& isSame(oldSloDR.dlv_cd(), dtlR.dlv_cd())
				&& isSame(oldShipPrR.ship_to_lg_grp_cd(), nvl(dtlR.tdlv_lg_grp_cd(), dtlR.dlv_lg_grp_cd()))
				&& isSame(oldSloDR.not_lot_mix_flg(), dtlR.not_lot_mix_flg())
				&& isSame(oldSloDR.not_sublot_mix_flg(), dtlR.not_sublot_mix_flg())
				&& isSame(oldSloDR.not_lg_mix_flg(), dtlR.not_lg_mix_flg())
				) {
			return false;
		}
		return true;
	}
	
	/**
	 * 在庫のキー項目が変わるかを判断する。
	 * @param oldSloDR
	 * @param oldShipPrR
	 * @param dtlR
	 * @return
	 */
	protected boolean isStkKeyChnaged(MST_SLO_D_R oldSloDR, Slo_Upd01_DtlR dtlR) {		
		if (isSame(oldSloDR.itm_cd(), dtlR.itm_cd())
				&& isSame(oldSloDR.itm_sub1(), dtlR.itm_sub1())
				&& isSame(oldSloDR.itm_sub2(), dtlR.itm_sub2())
				&& isSame(oldSloDR.itm_sub3(), dtlR.itm_sub3())				
				&& isSame(oldSloDR.trd_unit_cd(), dtlR.trd_unit_cd())
				&& isSame(oldSloDR.loc_cd(), dtlR.loc_cd())
				&& isSame(oldSloDR.str_ln_cd(), dtlR.str_ln_cd())
				&& isSame(oldSloDR.lot_no(), dtlR.lot_no())
				&& isSame(oldSloDR.sublot_no(), dtlR.sublot_no())				
				&& isSame(oldSloDR.sno1(), dtlR.sno1())
				&& isSame(oldSloDR.sno2(), dtlR.sno2())
				&& isSame(oldSloDR.sno3(), dtlR.sno3())
				&& isSame(oldSloDR.sno4(), dtlR.sno4())				
				&& isSame(oldSloDR.gd_cd(), dtlR.gd_cd())
				) {
			return false;
		}
		return true;
	}
	
	/**
	 * 出荷判定を伴う変更がされたかどうか。
	 * @param hdrR 受注ヘッダ
	 * @return 変更された場合はtrue
	 */
	protected boolean isShipJudgeChanged(Slo_Upd01_HdrR hdrR) {
		if (isSame(_cacheSloR.aprv_flg(), hdrR.aprv_flg())
				&& isSame(_cacheSloR.aprv_sts_typ(), hdrR.aprv_sts_typ())
				&& isSame(_cacheSloR.adv_ship_ctrl_typ(), hdrR.adv_ship_ctrl_typ())
				&& isSame(_cacheSloR.adv_bill_amt(), hdrR.adv_bill_amt())) {
			return false;
		}
		return true;
	}

	/**
	 * 受注明細を最更新（依頼先場所、発注先、メーカ）
	 */
	protected void updSloD(MCList<Slo_Upd01_HdrR> hdrL, MCList<Slo_Upd01_DtlR> dtlL) {
		// ステータスが新規作成と更新のサブリストを作成
		MCList<Slo_Upd01_DtlR> insUpdL = dtlL.subList(Status.CREATE, Status.MODIFY);
		MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
		dbSelectKey("MSBBL6020_MST_SLO_D_S05", sloDL, sloDL_bldr, insUpdL);
		
		MCIndexKey idxkey= hdrL.createIndex(Slo_Upd01_HdrR.$peg_no);
		for (Slo_Upd01_DtlR r : insUpdL) {
			MST_SLO_D_R sloR = sloDL.subList(MST_SLO_D_R.$slo_d_no, r.slo_d_no())
					.get(0);
			sloR.rqst_to_loc_cd(r.rqst_to_loc_cd());
			sloR.sppl_cd(r.sppl_cd());
			sloR.maker_cd(r.maker_cd());
			if (isNull(sloR.rqst_to_loc_cd()) && isNull(sloR.sppl_cd())) {
				// 供給依頼を作成しない場合は、依頼の項目をクリアする
				sloR.rqst_qty(null);
				sloR.rqst_unit_cd(null);
				sloR.rqst_dt(null);
				sloR.rqst_dlv_rqst_dt(null);
			}
			else {
				sloR.rqst_qty(r.rqst_qty());
				sloR.rqst_unit_cd(r.rqst_unit_cd());
				sloR.rqst_dt(r.rqst_dt());//運用日付で設定
				sloR.rqst_dlv_rqst_dt(r.rqst_dlv_rqst_dt()); //出荷予定日で設定する。
			}
			
			Slo_Upd01_HdrR hdr = hdrL.getFirst(idxkey, r.hdr_peg_no());
			if (MAC_TRD_PTN_TYP.isSLS(hdr.trd_ptn_typ()) && !r.vmi_flg()){
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())){
					sloR.slo_sum_base_dt(getSlsSchdDt(r.slo_d_no()));
				}
				//受注登録で、売上予定日が変更されうる更新をした場合のみ、受注集計基準日を更新する。
				else if (isSame(r.getStringNE("SLO_SUM_BASE_DT_FLG"), "1")){
					sloR.slo_sum_base_dt(getSlsSchdDt(r.slo_d_no()));
				}
			}
			else {
				sloR.slo_sum_base_dt(null);
			}
		}
		sloDL_bldr.setSet(t.rqst_to_loc_cd);
		sloDL_bldr.addSet(t.sppl_cd);
		sloDL_bldr.addSet(t.maker_cd);
		sloDL_bldr.addSet(t.rqst_qty);
		sloDL_bldr.addSet(t.rqst_unit_cd);
		sloDL_bldr.addSet(t.rqst_dt);
		sloDL_bldr.addSet(t.rqst_dlv_rqst_dt);
		sloDL_bldr.addSet(t.slo_sum_base_dt);
		dbUpdateKey("MSBBL6020_MST_SLO_D_U01", sloDL, sloDL_bldr);
	}	
	
	protected MCDate getSlsSchdDt(String sloDNo){
		MST_SLS_SCHD_R minDt = MST_SLS_SCHD_R.create("T");
		MCQueryApiBuilder minDt_bldr = MCQueryApiBuilder.create(minDt);
		minDt_bldr.setSelect(min(minDt.sls_schd_dt).as("sls_schd_dt"));
		minDt_bldr.setWhere(minDt.slo_d_no.eq(bind("1")), sloDNo);
		dbSelect("MSBBL6020_MST_SLS_SCHD_S01", minDt, minDt_bldr);
		return minDt.sls_schd_dt();
	}

	
	protected Srch_RsltR hasGroupAllocR(Srch_RsltR allocR, MCList<Srch_RsltR> allocL){
		for (Srch_RsltR r : allocL){
			if (isSame(r.itm_cd(), allocR.itm_cd())
					&& isSame(r.itm_sub1(), allocR.itm_sub1())
					&& isSame(r.itm_sub2(), allocR.itm_sub2())
					&& isSame(r.itm_sub3(), allocR.itm_sub3())
					&& isSame(r.stk_loc_cd(), allocR.stk_loc_cd())
					&& isSame(r.stk_str_ln_cd(), allocR.stk_str_ln_cd())
					&& isSame(r.stk_lg_grp_cd(), allocR.stk_lg_grp_cd())
					&& isSame(r.quality_typ(), allocR.quality_typ())
					&& isSame(r.stk_insp_typ(), allocR.stk_insp_typ())
					&& isSame(r.stk_id_typ(), allocR.stk_id_typ())
					&& isSame(r.stk_bp_cd(), allocR.stk_bp_cd())
					&& isSame(r.gd_cd(), allocR.gd_cd())
					&& isSame(r.lot_no(), allocR.lot_no())
					&& isSame(r.sublot_no(), allocR.sublot_no())
					&& isSame(r.sno1(), allocR.sno1())
					&& isSame(r.sno2(), allocR.sno2())
					&& isSame(r.sno3(), allocR.sno3())
					&& isSame(r.sno4(), allocR.sno4())
					&& isSame(r.ver_no(), allocR.ver_no())
					&& isSame(r.pack_unit_cd(), allocR.pack_unit_cd())					
					&& isSame(r.base_unit_cd(), allocR.base_unit_cd())					
					&& isSame(r.vld_dt_fr(), allocR.vld_dt_fr())
					&& isSame(r.vld_dt_to(), allocR.vld_dt_to())){
				return r;
			}
		}
		return null;
	}

	/**
	 * 引当結果を設定
	 * @param dtlR
	 * @return
	 */
	protected MCList<Srch_RsltR> setAllocStsRslt(Slo_Upd01_DtlR dtlR, Slo_Upd01_HdrR hdrR){

		MST_SLO_D_R oldSloDR = null;
		if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) || isHdrUpdOnly(dtlR)) {
			oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
		}

		//対応する引当結果明細を取得
		MCList<Srch_RsltR> allocL = MCList.create(Srch_RsltR.class);
		allocL.addStringColumn("ship_schd_no");
		if (MAC_SLO_PROC_TYP.isALLOC(dtlR.proc_typ()) 
				|| MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())){
			if (dtlR.getBooleanNE("NO_Alloc_ROW_FLG")){
				if (!isNull(oldSloDR) && isSame(dtlR.alloc_typ(), oldSloDR.alloc_typ())) {
					for (MST_SHIP_ALLOC_STS_R shipAlocStsR : _cacheShipAlocStsL) {
						if (isSame(shipAlocStsR.getStringNE("ship_pr_no"),
								dtlR.ship_pr_no()) && shipAlocStsR.alloc_flg()) {
							Srch_RsltR allocR = Srch_RsltR.create();
							copy(allocR, shipAlocStsR, dtlR,
									createMap_Srch_RsltR_MST_SHIP_ALLOC_STS_R());
							allocL.add(allocR);
						}
					}
				}
			}
		}
		allocL.addAll(_allocResultL.subList(Srch_RsltR.$peg_no, dtlR.peg_no()));
		_allocResultLSloStsNrml.addAll(allocL);
		
		MAM_ITM_R itmR = getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
		boolean isSetAllocStsRslt = true;
		if (itmR.lmt_ctl_flg() && (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ()) || MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ()))) {
			if (!isNull(oldSloDR) && !isNull(oldSloDR.sppl_cd())) {
				isSetAllocStsRslt = true;
			}
			else if (!isNull(oldSloDR) && !isNull(oldSloDR.rqst_to_loc_cd())) {
				isSetAllocStsRslt = false;
			}
			else {
				MAM_LOC_R locR = getLoc(nvl(dtlR.getString("loc_cd"), dtlR.getString("def_loc_cd")));
				if (!isNull(locR)) {
					MAM_ITM_DTL_R itmDtlR = null;
					if (isSame(_sysParm, "1")) {
						itmDtlR = getItmDtlR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), locR.wg_cd(), dtlR.ship_schd_tm());
						if (!isPurcTgt(itmDtlR)) {
							isSetAllocStsRslt = false;
						}
					} else {
						// マスタ参照日取得
						MCDate baseDt = getBaseDate(dtlR, locR);
						if (!isNull(baseDt)) {
							itmDtlR = getItmDtlR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), locR.wg_cd(), baseDt);
							if (!isPurcTgt(itmDtlR)) {
								isSetAllocStsRslt = false;
							}
						}
					}
				}
			}
		}
		// 手配依頼、引当後依頼で作られた入庫予定を引当結果として出荷予定に連携する
		// ただし、品目マスタの引当余裕日数がマイナスかつ、移動・移送引当対象外がオンの場合は、入庫予定引当しないので、
		// 手配依頼、引当後依頼で作られた入庫予定についても引当しないようにする。
		if ((isNull(dtlR.alloc_margin_days()) || !dtlR.alloc_margin_days().isNegative() || !dtlR.getBooleanNE("not_xfr_flg")) && isSetAllocStsRslt) {

			//手配依頼の場合
			if (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ())){
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) 
						&& !dtlR.abort_flg() && oldSloDR.abort_flg() 
						&& dtlR.rem_abort_flg()) {
					
					for (MST_SHIP_SCHD_R r : _cacheShipSchdL.subList(MST_SHIP_SCHD_R.$ship_pr_no, dtlR.ship_pr_no())) {
						if (r.ship_inst_qty().gt(0) || r.ship_act_qty().gt(0)){
							continue;
						}
						
						Srch_RsltR allocR = Srch_RsltR.create();
						copy(allocR, dtlR, hdrR,createMap_Srch_RsltR_Slo_Upd01_DtlR());
						allocR.setStringNE("ship_schd_no", r.ship_schd_no());
						allocR.base_unit_qty(r.base_unit_qty());
						if (dtlR.pack_flg()) {
							MCNumber trdUnitQty = rvrsBaseUnitConv(r.base_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
									dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
							if (isNull(trdUnitQty)){
								allocR.pack_unit_qty(r.base_unit_qty());
							}
							else{
								allocR.pack_unit_qty(trdUnitQty);
							}
						}
						else{
							allocR.pack_unit_qty(r.base_unit_qty());
						}
						
						allocL.add(allocR);
						_allocResultLSloStsDmndRqst.add(allocR);
					}
				}
				else {
					Srch_RsltR allocR = Srch_RsltR.create();
					copy(allocR, dtlR, hdrR,createMap_Srch_RsltR_Slo_Upd01_DtlR());
					allocL.add(allocR);
					_allocResultLSloStsDmndRqst.add(allocR);
				}
			}
			//引当後手配の場合
			else if (MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())){	
				//引当済みの数量を求める
				MCNumber alcQty = allocL.sum(Srch_RsltR.$base_unit_qty);;
				if (isNull(alcQty)){
					alcQty = MCNumber.ZERO;
				}
				//未引当分 >0の場合作成
				MCNumber notAlcQty = dtlR.base_unit_qty().subtract(alcQty);
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) 
						&& !dtlR.abort_flg() && oldSloDR.abort_flg() 
						&& dtlR.rem_abort_flg()) {
					notAlcQty = dtlR.rem_abort_qty().subtract(alcQty);
				}
				if (notAlcQty.gt(0)) {
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) 
							&& !dtlR.abort_flg() && oldSloDR.abort_flg() 
							&& dtlR.rem_abort_flg()) {
						
						for (MST_SHIP_SCHD_R schdR : _cacheShipSchdL.subList(MST_SHIP_SCHD_R.$ship_pr_no, dtlR.ship_pr_no())) {
							if (schdR.ship_inst_qty().gt(0) || schdR.ship_act_qty().gt(0)){
								continue;
							}
							
							Srch_RsltR allocR = Srch_RsltR.create();
							copy(allocR, dtlR, hdrR,createMap_Srch_RsltR_Slo_Upd01_DtlR());
							allocR.setStringNE("ship_schd_no", schdR.ship_schd_no());
							allocR.base_unit_qty(schdR.base_unit_qty());
							if (dtlR.pack_flg()) {
								MCNumber trdUnitQty = rvrsBaseUnitConv(schdR.base_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
										dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
								if (isNull(trdUnitQty)){
									allocR.pack_unit_qty(schdR.base_unit_qty());
								}
								else{
									allocR.pack_unit_qty(trdUnitQty);
								}
							}
							else{
								allocR.pack_unit_qty(schdR.base_unit_qty());
							}
							
							allocL.add(allocR);
							_allocResultLSloStsDmndRqst.add(allocR);
						}
					}
					else {
						Srch_RsltR allocR = Srch_RsltR.create();
						copy(allocR, dtlR, hdrR,createMap_Srch_RsltR_Slo_Upd01_DtlR());
						Srch_RsltR r = hasGroupAllocR(allocR, allocL);
						//まとめられるため、まとめる
						if (!isNull(r) && canConvPackUnit(r, dtlR, notAlcQty)) {
							r.base_unit_qty(r.base_unit_qty().add(notAlcQty));
							if (isSame(r.pack_unit_cd(), r.base_unit_cd())) {	
								r.pack_unit_qty(r.base_unit_qty()); //荷姿単位数量
							}
							else {
								MCNumber convRet = rvrsBaseUnitConv(notAlcQty, dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
										dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
								r.pack_unit_qty(r.pack_unit_qty().add(convRet)); //荷姿単位数量						
							}
						}
						else{
							allocR.base_unit_qty(notAlcQty);
							if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
								allocR.pack_unit_cd(allocR.base_unit_cd()); //荷姿単位ＣＤ
								allocR.pack_unit_qty(allocR.base_unit_qty()); //荷姿単位数量
							}
							else if (dtlR.pack_flg()) {						
								MCNumber convRet = rvrsBaseUnitConv(notAlcQty, dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
										dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
								if (isNull(convRet)){
									//換算不可の場合。取引単位CD取引単位数に基準単位数で設定する。	
									allocR.pack_unit_cd(allocR.base_unit_cd()); //荷姿単位ＣＤ
									allocR.pack_unit_qty(allocR.base_unit_qty()); //荷姿単位数量
								}
								else{
									//換算時に端数が発生しない場合、取引単位CD.取引単位数に換算結果値で設定する。	
									allocR.pack_unit_cd(dtlR.trd_unit_cd()); //荷姿単位ＣＤ
									allocR.pack_unit_qty(convRet); //荷姿単位数量
								}						
							}
							else {
								allocR.pack_unit_cd(allocR.base_unit_cd()); //荷姿単位ＣＤ
								allocR.pack_unit_qty(allocR.base_unit_qty()); //荷姿単位数量
							}
							allocL.add(allocR);
							_allocResultLSloStsDmndRqst.add(allocR);
						}
					}
				}
			}
		}
		return allocL;
	}
	
	protected boolean isPurcTgt(MAM_ITM_DTL_R itmDtlR) {
		if (isNullOrNullVal(itmDtlR.sppl_cd()) && isNullOrNullVal(itmDtlR.getString("loc_sppl_cd"))) {
			return false;
		}
		return true;
	}
	
	/**
	 * ヘッダのみ更新されるかを判定する
	 * @param dtlR
	 * @return ヘッダのみ更新される場合はtrue、ヘッダと明細の両方が更新される場合はfalse
	 */
	protected boolean isHdrUpdOnly(Slo_Upd01_DtlR dtlR) {
		if (isNull(dtlR.data_crud_typ())) {
			return true;
		}
		return false;
	}

	protected boolean canConvPackUnit(Srch_RsltR r, Slo_Upd01_DtlR dtlR, MCNumber notAlcQty) {
		if (isSame(r.pack_unit_cd(), r.base_unit_cd())) {	
			return true;
		}
		
		MCNumber trdUnitQty = rvrsBaseUnitConv(notAlcQty, dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
				dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
		if (isNull(trdUnitQty)){
			return false;
		}
		else{
			return true;
		}		
	}
	
	
	protected boolean isProcTypChanged(MST_SLO_D_R oldSloDR, Slo_Upd01_DtlR dtlR) {
		//仕入直送→仕入直送以外、或は仕入直送以外→仕入直送に変更した場合、Trueとする
		if ((MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) && !MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) 
				|| (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) && MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ()))){
			return true;				
		}
		return false;
	}
	

	/**
	 * Slo_Upd01オペレーション.<p>
	 *
	 */
	public class Slo_Upd01 extends MSBBL_SloRegService_MC_A.Slo_Upd01 {

		/**
		 * 引当前、受注に紐付く入庫予定（受払予定）を削除するため、サーブポイントを設定する。
		 */
		MCSavepoint sp = null;
		
		/**
		 * 与信管理先リスト
		 */
		protected MCList<MAM_BP_R> _arCredL = null;
		
		/**
		 * 出荷予定が確定済の納期回答情報
		 */
		protected MCList<MST_SLO_PRMS_R> _fixSloPrmsL = null;
		/**
		 * 「後続処理が登録されているかつ備考、予備のみ更新」の受注明細を含むリスト
		 */
		protected MCList<Slo_Upd01_DtlR> _upSloDL = null;
		/**
		 * 受注納期回答改訂番号
		 */
		protected Map<String, MCNumber> _sloPrmsRevMap = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			MCList<Slo_Upd01_HdrR> up0L = up0().clone();
			MCList<Slo_Upd01_DtlR> up1L = up1().clone();
			MCIndexKey up1Idxkey = up1L.createIndex(Slo_Upd01_DtlR.$hdr_peg_no);
			
			//　前処理
			preProc(up0L, up1L, getMultiAllSloCache());
			
			for (Slo_Upd01_HdrR hdrR : up0L) {
				
				up0().clear();
				up0().add(hdrR);
				
				_upSloDL = up1L.subList(up1Idxkey, hdrR.peg_no());
				// up1()に「後続処理が登録されているかつ備考、予備のみ更新」を除外したリストを設定する
				up1().setAll(removeRmrksSubUpdRows(_upSloDL));
				
				//初期化・前処理(受注伝票単位)
				preProc(hdrR, up1());
				//受注NO発番
				setupNo(hdrR);
				//手配ＮＯの設定
				setSeiban(up0(), up1());
				//諸口品登録サービスのチェック処理の呼び出し
				callSundryItmRegServiceChk01(up1());
				//諸口品登録サービスの登録処理の呼び出し
				callSundryItmRegServiceUpd01(up1());
				//承認提供サービス実行
				callAprvService(hdrR);
				//案件・手配ＮＯ紐付け情報登録
				updWrkSno(hdrR, up1());
				//出荷予定日計算サービス実行
				callShipSchdDtService(up0(), up1());
				//品目の有効期限FROM,TOを取得
				getItmValidDt(up0(), up1());
				//受注トラン、受注明細トランの作成
				updSloSloDMain(hdrR);
				//受注状況更新処理の呼び出し
				callSloStsReg(up0(), _upSloDL);
				//引当解除処理の実行
				cancelStkAlloc(hdrR);
				//引当前、受注明細に紐付く受払予定(入庫予定)の削除
				delIoSchd();
				//引当処理の呼び出し
				callStkAlloc(hdrR);
				//引当後、受注明細に紐付く手配依頼の受払予定(入庫予定)の削除をロールバックする。
				delIoSchdRollback();
				//出荷・供給依頼処理の呼び出し(取消)
				callShipDmndRqstService(hdrR, true);
				//出荷予定サービスを呼出(打切解除)
				callShipSchdServiceAbortRet(hdrR);
				//出荷予定サービスを呼出
				callShipSchdService(hdrR);
				//受注状況更新処理の呼び出し（通常の引当）
				callSloStsRegNrmlAlloc(up1());
				//出荷・供給依頼処理の呼び出し(新規・更新)
				callShipDmndRqstService(hdrR, false);
				//受注状況更新処理の呼び出し（出荷供給依頼サービスの入庫予定に対する引当）
				callSloStsRegDmndRqstAlloc(up1());
				//売上予定更新
				updSlsSchd(hdrR);
				updShipSchdBySlsSchd(hdrR);
				//受注明細再更新（依頼先場所、発注先）
				updSloD(up0(), up1());
				//見積明細の更新
				updQtnD(hdrR);
				//与信更新
				updCred(hdrR);
				//下り電文の作成
				setDown(hdrR);
			}
			
			// ピッキングなしの明細が纏めるか確認する
			chkNoPick(up0L.getString(Slo_Upd01_HdrR.$slo_no));
		}
		
		/**
		 * 前処理
		 * @param hdrL 受注ヘッダ
		 * @param dltL 受注明細
		 * @param sloL 変更前受注ヘッダ
		 */
		protected void preProc(MCList<Slo_Upd01_HdrR> hdrL, MCList<Slo_Upd01_DtlR> dltL, MCList<MST_SLO_R> sloL) {

			getArCredL(hdrL, sloL);
		}
		
		/**
		 * 変更前と変更後の得意先を元に与信管理先を取得する。
		 * @param hdrL　受注ヘッダ
		 * @param sloL 変更前受注ヘッダ
		 */
		protected void getArCredL(MCList<Slo_Upd01_HdrR> hdrL, MCList<MST_SLO_R> sloL) {
			
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			MAM_BP_R bindR = null;
			
			for (Slo_Upd01_HdrR hdrR : hdrL) {
				
				bindR = MAM_BP_R.create();
				bindR.bp_cd(hdrR.cst_cd());
				
				bindL.add(bindR);
			}
			
			for (MST_SLO_R sloR : sloL) {
				
				bindR = MAM_BP_R.create();
				bindR.bp_cd(sloR.cst_cd());
				
				bindL.add(bindR);
			}
			
			_arCredL = MCList.create(MAM_BP_R.class);
			MAM_BP_R arCredL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder arCredL_bldr = MCQueryApiBuilder.create(arCredL_t);
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MAM_BP_R m2 = MAM_BP_R.create("M2");
			arCredL_bldr.setSelect(arCredL_t.bp_cd);
			arCredL_bldr.addSelect(m2.ar_cred_cd);
			arCredL_bldr.addInnerJoin(m1, bracket(arCredL_t.acst_cd.eq(m1.bp_cd)));
			arCredL_bldr.addInnerJoin(m2, bracket(m1.bcst_cd.eq(m2.bp_cd)));
			dbSelectKey("MSBBL6020_MAM_BP_S01", _arCredL, arCredL_bldr, bindL.groupBy(MAM_BP_R.$bp_cd));
		}

		/**
		 * 初期化処理
		 * @param hdrR 受注ヘッダ
		 */
		protected void preProc(Slo_Upd01_HdrR hdrR, MCList<Slo_Upd01_DtlR> dtlL) {
			
			// 変数の初期化
			initAllocResult();
			// 表示順の設定
			setDispSeq(_upSloDL);
			//上り電文の編集
			editUp(hdrR, _upSloDL);
			
			_cacheSloR = getMultiSloCache(hdrR);
			_cacheSloDL = getMultiSloDCache(hdrR);
			_cacheShipSchdL = getShipSchdCache(up1());
			_cacheShipAlocStsL = getShipAlocCache(up1());
			_fixSloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			//更新前の与信額を算出する。
			calcOldCredAmt(dtlL);
			getFixSloPrmsL();
			setSloPrmsRev(dtlL);
		}

		/**
		 * 更新前の与信対象額を計算する。
		 */
		protected void calcOldCredAmt(MCList<Slo_Upd01_DtlR> dtlL) {
			//与信額の算出
			MCNumber amt = MCNumber.ZERO;
			MCIndexKey sloDIdxKey = dtlL.createIndex(Slo_Upd01_DtlR.$slo_d_no);
			for (MST_SLO_D_R oldSloDR : _cacheSloDL) {
				Slo_Upd01_DtlR dtlR = dtlL.getFirst(sloDIdxKey, oldSloDR.slo_d_no());
				if (oldSloDR.abort_flg() || (!isNull(dtlR) && dtlR.abort_flg() && dtlR.rem_abort_flg()) || oldSloDR.can_flg() || oldSloDR.vmi_flg()) {
					continue;
				}
				
				MCNumber crdAmt = getOldCrdAmt(_cacheSloR, oldSloDR);
				MAM_ITM_R itmR = getItm(oldSloDR.itm_cd(), oldSloDR.itm_sub1(), oldSloDR.itm_sub2(), oldSloDR.itm_sub3());
				if (itmR.dscnt_itm_flg()){
					crdAmt = crdAmt.multiply(-1);
				}
				amt = amt.add(crdAmt);
			}
			up0().setNumberNE("old_cred_amt", amt);
		}

		/**
		 * 与信更新処理
		 * @param hdrR 受注ヘッダ
		 */
		protected void updCred(Slo_Upd01_HdrR hdrR) {
			
			//取引区分が「売上」の場合、与信サービス.与信更新（売掛）（MSBGL5080.Cred_Upd01）を呼出し
			if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
				boolean isToCheck;
				
				MCIndexKey idxkey= _arCredL.createIndex(MAM_BP_R.$bp_cd);
				
				//・受注ヘッダの得意先CDが変更された場合、変更前の与信管理先CD、と変更後の与信管理先CDを取得する。
				String oldCredCd = "";
				MAM_BP_R newBcst = _arCredL.getFirst(idxkey, hdrR.cst_cd());
				String newCredCd = isNull(newBcst) ? "" : newBcst.ar_cred_cd();
				
				if (isSame(hdrR.cst_cd(), _cacheSloR.cst_cd())) {
					oldCredCd = newCredCd;
				}
				else {
					MAM_BP_R oldBcst = _arCredL.getFirst(idxkey, _cacheSloR.cst_cd());
					oldCredCd = isNull(oldBcst) ? "" : oldBcst.ar_cred_cd();
				}

				if (isNullAnd(newCredCd, oldCredCd)) {
					return;
				}
				//与信額の算出
				MCNumber amt = MCNumber.ZERO;
				for (Slo_Upd01_DtlR dtlR : _upSloDL) {
					if (dtlR.vmi_flg()){
						continue;
					}
					//取消の場合、与信額の計算対象外とする
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						continue;
					}
					//新規の場合、与信更新の対象とする
					else if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						if (dtlR.dscnt_itm_flg()){
							amt = amt.add(dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt()).multiply(-1));
						}
						else {
							amt = amt.add(dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt()));
						}					
					}
					else {
						//打切以外の場合、与信更新の対象とする.変更なしの行は与信更新の対象とする
						MST_SLO_D_R oldSloDR = getMultiFirstSloDCache(dtlR.slo_d_no());
						if (!(dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg() && dtlR.rem_abort_flg()))) {
							//売上予定から基準単位数を元に明細毎の与信額を算出
							MCNumber crdAmt = getCrdAmt(hdrR, dtlR);
							if (dtlR.dscnt_itm_flg()){
								crdAmt = crdAmt.multiply(-1);
							}
							amt = amt.add(crdAmt);
						}
					}
				}

				if (isSame(oldCredCd, newCredCd)
						&& isSame(_cacheSloR.trd_cur_cd(), hdrR.trd_cur_cd())) {
					if (isSame(hdrR.getNumber("old_cred_amt"), amt)) {
						return;
					}
					if (amt.gt(hdrR.getNumber("old_cred_amt"))) {
						isToCheck = true;
					}
					else {
						isToCheck = false;
					}
				}
				else {
					isToCheck = true;
				}

				MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
				Cred_Upd01_CndR credRevR = Cred_Upd01_CndR.create();
				credRevR.cred_cd(oldCredCd);//与信管理先CD
				credRevR.cur_cd(_cacheSloR.trd_cur_cd());//取引通貨ＣＤ.
				credRevR.trd_ptn_typ(_cacheSloR.trd_ptn_typ());//取引パタン区分				
				credRevR.amt(hdrR.getNumber("old_cred_amt").negate());//与信額×-1
				credRevR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				ope.up0().add(credRevR);
				if (!amt.isZero()) {
					Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
					credR.cred_cd(newCredCd);//与信管理先CD
					credR.cur_cd(hdrR.trd_cur_cd());//取引通貨ＣＤ.
					credR.trd_ptn_typ(hdrR.trd_ptn_typ());//取引パタン区分
					credR.amt(amt);//与信額
					if (isToCheck) {
						credR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());
					}
					else {
						credR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
					}
					ope.up0().add(credR);
				}
				MCMessageList msgL = null;
				if (hdrR.is_src_batch_flg()) {		// ＩＦサービスから呼ばれた場合のみ
					msgL = new MCMessageList();
					msgL.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
				}
				ope.exec();
				if (!ope.down1().isEmpty()){
					MCMessage msg = new MCMessage(MSBBL0124, ope.down1().get(0).cred_cd(),
							ope.down1().get(0).cur_cd(), ope.down1().get(0).cred_amt(),ope.down1().get(0).cred_limit());
					throw new MCAppException(msg);
				}
				if (hdrR.is_src_batch_flg()) {
					if (MCMessagePool.size() > 0) {
						for (Slo_Upd01_DtlR dtlR : up1()) {
							for (MCMessage msg : MCMessagePool.getMessageList()) {
								msgL.add(new MCMessage(dtlR, null, msg.getID(), (Object[])msg.getBindArray()));
							}
						}					
					}
					MCMessagePool.clear();
					MCMessagePool.addAll(msgL);
				}
			}
		}
		
		/**
		 * 売上予定から基準単位数を元に明細毎の与信額を算出
		 * @param hdrR 受注ヘッダ
		 * @param dtlR 受注明細
		 * @return　与信対象額
		 */
		protected MCNumber getCrdAmt(Slo_Upd01_HdrR hdrR, Slo_Upd01_DtlR dtlR) {
			
			//売上予定から基準単位売上予定数の取得：
			MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(slsSchdR);
			//売上予定.受注明細ＮＯ　=　Upd01_Dtl（受注明細).受注明細ＮＯ
			slsSchdR_bldr.addSum(slsSchdR.base_unit_qty.subtract(slsSchdR.base_unit_abort_qty), "base_unit_qty");
			slsSchdR_bldr.setWhere(slsSchdR.slo_d_no.eq(bind("1")), dtlR.slo_d_no());
			dbSelect("MSBBL6020_MST_SLS_SCHD_S02", slsSchdR, slsSchdR_bldr);
			MCNumber baseUnitQty = slsSchdR.base_unit_qty();
			//与信額＝(Upd01_Dtl（受注明細).取引通貨金額　＋　Upd01_Dtl（受注明細).取引通貨税額）　
			//÷　Upd01_Dtl（受注明細).基準単位数量　× 基準単位売上予定数
			MCNumber crdAmt = dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt());
			crdAmt = crdAmt.multiply(baseUnitQty).divide(dtlR.base_unit_qty(),
					hdrR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(hdrR.sls_amt_rnd_typ()));
			return crdAmt;
		}
		
		/**
		 * 案件・手配ＮＯ紐付け情報を登録する。
		 * @param hdrR 受注ヘッダ
		 * @param dtlL 受注明細リスト
		 */
		protected void updWrkSno(Slo_Upd01_HdrR hdrR, MCList<Slo_Upd01_DtlR> dtlL) {
			
			for (Slo_Upd01_DtlR r : dtlL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
						|| (!isSame(_cacheSloR.wrk_no(), hdrR.wrk_no()))) {
					if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						if (!isNullOrNullVal(r.sno1()) && !isNullOrNullVal(hdrR.wrk_no())) {
							regWrkNoSno1(r.sno1(), hdrR.wrk_no(), r);
						}
					}
				}
			}
		}

		/**
		 * 発番関連（受注明細NOを発番システム区分により発番）。
		 * @param hdrR　受注ヘッダ
		 */
		protected void setupNo(Slo_Upd01_HdrR hdrR) {
			setupIVNo(hdrR);
			setupSloDNO(up1(), hdrR);
		}

		/**
		 * インボイスＮＯを発番する。
		 * @param hdrR 受注ヘッダ
		 */
		protected void setupIVNo(Slo_Upd01_HdrR hdrR) {
			
			//得意先がインボイス取引対象の場合			
			if (!isSame(_cacheSloR.iv_no(), hdrR.iv_no()) || (isNull(_cacheSloR.iv_no()) && isNull(hdrR.iv_no()))) {
				if (!isNull(_cacheSloR.iv_no())){
					MST_IV_NO_R ivR = MST_IV_NO_R.create("T");
					ivR.iv_no(_cacheSloR.iv_no());
					dbDeleteKey("MSBBL6020_MST_IV_NO_D01", ivR, MCQueryApiBuilder.create(ivR));
				}
				if (hdrR.cst_iv_flg()) {
					if (hdrR.iv_num_flg()) {
						ElmArgsR elm = ElmArgsR.create();
						elm.co_cd(getCo().co_cd());
						elm.dt(getToday());
						//I/V_NO　の発番					
						hdrR.iv_no(getNumIv(elm, null));
					}
					else if (!isNull(hdrR.iv_no())) {
						//I/V_NO　の発番					
						hdrR.iv_no(getNumIv(null, hdrR.iv_no()));
					}
					else {
						hdrR.iv_no(null);
					}
				}
				else {
					hdrR.iv_no(null);
				}
			}
		}

		/**
		 * 承認提供サービス実行
		 */
		protected void callAprvService(Slo_Upd01_HdrR hdrR) {
			
			boolean isAprv = hdrR.old_aprv_flg();
			callAprvServiceSub(hdrR);

			// 後続業務を実施済で、承認対象外→承認対象に変わった場合はエラーとする
			if (!isAprv && hdrR.aprv_flg()) {
				if (MSUCL_SlsUtil.isSloNextOper(hdrR.slo_no())) {
					throw new MCAppException(hdrR, null, MSBBL0168);
				}
			}
		}
		
		/**
		 * 承認提供サービス.承認情報作成を呼び出す。
		 * @param hdrR 受注ヘッダ
		 */
		protected void callAprvServiceSub(Slo_Upd01_HdrR hdrR) {
			
			//承認モジュールを呼び出すか
			if (!isCallAprv(hdrR)) {
				
				hdrR.aprv_flg(hdrR.old_aprv_flg());
				hdrR.aprv_no(hdrR.old_aprv_no());
				hdrR.aprv_sts_typ(hdrR.old_aprv_sts_typ());
				hdrR.can_upd_flg(hdrR.old_can_upd_flg());
				hdrR.can_del_flg(hdrR.old_can_del_flg());
				return;
			}
			else {
				
				//承認提供サービス.承認情報作成(MBBAL5010.Aprv_Upd01)
				MBBAL_AprvService.Aprv_Upd01 op = MBBAL_AprvService.crtAprv_Upd01();
				Aprv_Chk01_Rslt1R cndR = Aprv_Chk01_Rslt1R.create();
				//サービス呼出す時の電文項目の設定
				copy(cndR, hdrR, createMap_Aprv_Chk01_Rslt1R_Slo_Upd01_HdrR());
				op.up0().add(cndR);
				op.exec();

				hdrR.aprv_flg(op.down0().get(0).aprv_flg());
				hdrR.aprv_no(op.down0().get(0).aprv_no());
				
				if (hdrR.aprv_flg()) {
					MBT_APRV_R aprvR = getAprvR(hdrR.aprv_no());
					hdrR.can_upd_flg(aprvR.aprv_upd_flg());
					hdrR.can_del_flg(aprvR.aprv_can_flg());
					hdrR.aprv_sts_typ(MAC_APRV_STS_TYP.OPN.value());
				}
				else {
					hdrR.can_upd_flg(false);
					hdrR.can_del_flg(false);
				}
			}
		}			

		/**
		 * 承認モジュールを実行する必要があるかどうか。
		 * @param hdrR 受注ヘッダ
		 * @return 実行する必要がある場合はtrue
		 */
		protected boolean isCallAprv(Slo_Upd01_HdrR hdrR) {
			
			boolean isCall = false;
			//取引パタン区分が売上の場合、承認提供サービス.承認情報作成を実行し、承認対象を判定、受注承認依頼をする。
			if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
				// 承認中、承認済の場合は「承認引戻ＦＬＧ＝オン」の時のみ承認モジュールの再呼出を行う
				// 承認に関する項目は画面側で変更できないように制御する前提
				if (MAC_APRV_STS_TYP.isACPT(hdrR.old_aprv_sts_typ())
						|| MAC_APRV_STS_TYP.isFIX(hdrR.old_aprv_sts_typ())) {
					if (hdrR.aprv_back_flg()) {
						isCall = true;
					}
				}
				else {
					isCall = true;
				}
			}			
			return isCall;
		}
		
		/**
		 * 受注トラン、受注明細トランの更新
		 * @param hdrR 受注ヘッダ
		 */
		protected void updSloSloDMain(Slo_Upd01_HdrR hdrR) {

			MST_SLO_R updSloR = createUpdSlo(hdrR);
			updSloR.setAlias("T");
			MCList<MST_SLO_D_R> insSloDL = createInsSloD(updSloR, up1().subList(Status.CREATE));
			MCList<MST_SLO_D_R> updSloDL = createUpdSloD(updSloR,
					up1().subList(Status.MODIFY).subList(MST_SLO_D_R.$abort_flg, false));
			
			MCList<MST_SLO_D_R> abortSloDL = createUpdSloD(updSloR,
					up1().subList(Status.MODIFY).subList(MST_SLO_D_R.$abort_flg, true));
			MCList<MST_SLO_D_R> delSloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R delSloDL_t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder delSloDL_bldr = MCQueryApiBuilder.create(delSloDL_t);
			createDelSloD(up1().subList(Status.DELETE), delSloDL, delSloDL_t, delSloDL_bldr);

			dbUpdateKey("MSBBL6020_MST_SLO_U02", updSloR,
					MCQueryApiBuilder.create(updSloR));
			dbInsertEx("MSBBL6020_MST_SLO_D_I02", insSloDL,
					MCQueryApiBuilder.create(MST_SLO_D_R.create("T")));
			dbUpdateKey("MSBBL6020_MST_SLO_D_U02", updSloDL,
					MCQueryApiBuilder.create(MST_SLO_D_R.create("T")));

			MST_SLO_D_R abortSloDL_t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder abortSloDL_bldr = MCQueryApiBuilder.create(abortSloDL_t);;
			abortSloDL_bldr.setSet(abortSloDL_t.abort_flg);
			abortSloDL_bldr.addSet(abortSloDL_t.disp_seq);
			abortSloDL_bldr.addSet(abortSloDL_t.slo_rev);
			dbUpdateKey("MSBBL6020_MST_SLO_D_U03", abortSloDL, abortSloDL_bldr);
			dbUpdateKey("MSBBL6020_MST_SLO_D_U04", delSloDL, delSloDL_bldr);

			MCList<MST_SLO_D_R> updTrnstRmrksSloDL = createUpdSloD(
					updSloR, _upSloDL.subList(r->r.isStatusModify() && isOnlyUpdTrnstRmrks(r)));
			MST_SLO_D_R updTrnstRmrksSloDL_t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder updTrnstRmrksSloDL_bldr = MCQueryApiBuilder.create(updTrnstRmrksSloDL_t);
			
			if (!updTrnstRmrksSloDL.isEmpty()) {
				updTrnstRmrksSloDL_bldr.setSet(updTrnstRmrksSloDL_t.slo_rev,
						updTrnstRmrksSloDL_t.disp_seq, updTrnstRmrksSloDL_t.intr_rmrks,
						updTrnstRmrksSloDL_t.sub_char1, updTrnstRmrksSloDL_t.sub_char2,
						updTrnstRmrksSloDL_t.sub_char3,
						updTrnstRmrksSloDL_t.edi_sub_d_char1,
						updTrnstRmrksSloDL_t.edi_sub_d_char2,
						updTrnstRmrksSloDL_t.edi_sub_d_char3,
						updTrnstRmrksSloDL_t.edi_sub_d_char4,
						updTrnstRmrksSloDL_t.edi_sub_d_char5,
						updTrnstRmrksSloDL_t.edi_sub_d_num1,
						updTrnstRmrksSloDL_t.edi_sub_d_dt1);
				dbUpdateKey("MSBBL6020_MST_SLO_D_U05", updTrnstRmrksSloDL, updTrnstRmrksSloDL_bldr);
			}
			// 改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
			updSloPR(updSloR);
		}

		/**
		 * 受注ヘッダ更新用のコンテナを作成する。
		 * @param hdrR 受注ヘッダ
		 * @return  受注ヘッダ更新用のコンテナ
		 */
		protected MST_SLO_R createUpdSlo(Slo_Upd01_HdrR hdrR) {

			MST_SLO_R sloR = MST_SLO_R.create();
			MCRow.copyvalue(sloR, _cacheSloR);
			copy(sloR, hdrR, createMap_MST_SLO_R_Slo_Upd01_HdrR());
			sloR.slo_rev(sloR.slo_rev().add(1));
			hdrR.slo_rev(sloR.slo_rev());
			return sloR;

		}

		/**
		 * 受注明細更新用のコンテナを作成する
		 * @param sloR 受注トラン
		 * @param dtlL 受注明細リスト
		 * @return 受注明細トラン
		 */
		protected MCList<MST_SLO_D_R> createUpdSloD(MST_SLO_R sloR, MCList<Slo_Upd01_DtlR> dtlL) {
			
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			for (Slo_Upd01_DtlR r : dtlL) {
				
				MST_SLO_D_R sloDR = MST_SLO_D_R.create();
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(r.slo_d_no());
				MCRow.copyvalue(sloDR, oldSloDR);
				copy(sloDR, r, sloR, createMap_MST_SLO_D_R_Slo_Upd01_DtlR());
				sloDL.add(sloDR);
			}
			return sloDL;
		}

		/**
		 * 受注明細論理削除用のコンテナを作成する
		 * @param dtlL 受注明細リスト
		 * @return 受注明細論理削除用のコンテナ
		 */
		protected void createDelSloD(MCList<Slo_Upd01_DtlR> dtlL,
				MCList<MST_SLO_D_R> sloDL, MST_SLO_D_R t, MCQueryApiBuilder sloDL_bldr) {

			for (Slo_Upd01_DtlR r : dtlL) {
				MST_SLO_D_R sloDR = MST_SLO_D_R.create();
				sloDR.slo_d_no(r.slo_d_no());
				sloDR.can_flg(true);
				sloDR.can_rsn_cd(r.can_rsn_cd());
				sloDR.slo_d_can_rmkrs(r.slo_d_can_rmkrs());
				sloDL.add(sloDR);
			}

			sloDL_bldr.setSet(t.can_flg);
			sloDL_bldr.addSet(t.can_rsn_cd);
			sloDL_bldr.addSet(t.slo_d_can_rmkrs);
		}

		/**
		 * 引当解除処理
		 */
		protected void cancelStkAlloc(Slo_Upd01_HdrR hdrR) {
			
			//出荷予定サービス.引当解除(MSBEL5500.ShipSchd_Upd06）のサービスを実行して、引当解除を行う。
			MSBEL_ShipSchdService.ShipSchd_Upd06 op = MSBEL_ShipSchdService.crtShipSchd_Upd06();
			//出荷予定サービス.引当解除前のチェック処理。
			MSBEL_ShipSchdService.ShipSchd_Chk06 opChk = MSBEL_ShipSchdService.crtShipSchd_Chk06();
			for (Slo_Upd01_DtlR dtlR : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
						|| !isSame(_cacheSloR.cst_cd(), hdrR.cst_cd())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
					//キャッシュから対応する更新前の出荷進捗を取得する。
					MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
					//キャッシュから対応する更新前の出荷予定を取得する。
					MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL
							.subList(MST_SHIP_SCHD_R.$ship_pr_no, dtlR.ship_pr_no());
					//引当数を算出
					MCNumber alcQty = oldShipSchdL.sum(MST_SHIP_SCHD_R.$alloc_qty);
					
					if (isNull(alcQty)){
						alcQty = MCNumber.ZERO;
					}
					
					MCNumber allocRelQty = MCNumber.ZERO;

					//削除明細が引当数＞０の場合、解除の対象とする。
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && alcQty.gt(0)) {
						for (MST_SHIP_SCHD_R r : oldShipSchdL) {
							if (r.abort_flg() || r.alloc_qty().isZero()) {
								continue;
							}
							ShipSchd_Upd06_DtlR alcCanR = ShipSchd_Upd06_DtlR.create();
							alcCanR.peg_no(dtlR.peg_no());
							alcCanR.ship_schd_no(r.ship_schd_no());
							allocRelQty = allocRelQty.add(r.alloc_qty());
							op.up0().add(alcCanR);
						}
					}
					if ((!isSame(_cacheSloR.cst_cd(), hdrR.cst_cd()) || MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) && alcQty.gt(0)) {
						if (oldSloDR.abort_flg() && !dtlR.abort_flg()) {
							//打切り取消の場合、引当対象外
							continue;
						}
						if (isAllocCancel(oldSloDR, oldShipPrR, dtlR, hdrR) || dtlR.abort_flg()){
							for (MST_SHIP_SCHD_R r : oldShipSchdL) {
								if (r.abort_flg() || r.alloc_qty().isZero()) {
									continue;
								}
								if (r.ship_inst_qty().gt(0) || r.ship_act_qty().gt(0) || r.sls_qty().gt(0)){
									continue;
								}
								ShipSchd_Upd06_DtlR alcCanR = ShipSchd_Upd06_DtlR
										.create();
								alcCanR.peg_no(dtlR.peg_no());
								alcCanR.ship_schd_no(r.ship_schd_no());
								allocRelQty = allocRelQty.add(r.alloc_qty());
								op.up0().add(alcCanR);
							}
							if (isAllocCancel(oldSloDR, oldShipPrR, dtlR, hdrR) && !dtlR.abort_flg()){
								if (MAC_ALLOC_TYP.isIMMED(dtlR.alloc_typ())
										|| (MAC_ALLOC_TYP.isNON(oldSloDR.alloc_typ()) && MAC_ALLOC_TYP.isNON(dtlR.alloc_typ()))
										|| (MAC_ALLOC_TYP.isLATER(oldSloDR.alloc_typ()) && MAC_ALLOC_TYP.isLATER(dtlR.alloc_typ()))){
									dtlR.setBooleanNE("retStkAlloc_flg", true);
									dtlR.setNumberNE("alloc_rel_qty", allocRelQty);
								}
							}
						}
						if (!isStkKeyChnaged(oldSloDR,dtlR)){
							//引当保留除外FLG
							dtlR.setBooleanNE("exceptAllocWait", true);
						}
					}
				}
			}
			//引当解除を実行する
			if (!op.up0().isEmpty()) {
				opChk.up0().addAll(op.up0());
				opChk.exec();
				op.exec();
			}
		}
		
		/**
		 * 引当処理の実行
		 * @param hdrR 受注ヘッダ
		 */
		protected void callStkAlloc(Slo_Upd01_HdrR hdrR) {
			
			//引当処理の前に、対象テーブルのデータのロックを行う。
			MSBEL_AllocMngService.Alloc_Lock_Upd01 op = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			//引当管理サービス.ロット提案サービス（MSBEL5040.Alloc_Srch01）
			MSBEL_AllocMngService.Alloc_Srch01 opAlc = MSBEL_AllocMngService
					.crtAlloc_Srch01();
			//引当前に、引当保留の受払予定を削除するため、対象の受注明細を格納する。
			MCList<MST_SLO_D_R> allocSloDL = MCList.create(MST_SLO_D_R.class);
			int i = 0;
			for (Slo_Upd01_DtlR dtlR : up1()) {
				
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
				
				if(MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					allocSloDL.add(oldSloDR);
					continue;
				}
				//在庫管理区分=在庫管理するの場合のみ引当の対象とする。
				if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
					
					if (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ())) {
						continue;
					}
					
					//・以下の条件に合致する明細は引当処理の対象とする。	
					//1.引当解除した再引当必要なもの（引当管理の項目が変更され、引当済み数＞０、打切りではないもの）
					if (dtlR.getBooleanNE("retStkAlloc_flg")){
						MSW_ALLOC_LOC_MAP_R lockR = MSW_ALLOC_LOC_MAP_R.create();
						//品目CD
						lockR.itm_cd(dtlR.itm_cd());
						lockR.itm_sub1(dtlR.itm_sub1());
						lockR.itm_sub2(dtlR.itm_sub2());
						lockR.itm_sub3(dtlR.itm_sub3());
						lockR.gi_loc_cd(dtlR.loc_cd());
						lockR.gi_lg_grp_cd(dtlR.ship_lg_grp_cd());
						lockR.alloc_grp_cd(dtlR.alloc_grp_cd());
						lockR.alloc_scope_typ(dtlR.alloc_scope_typ()); //引当範囲区分
						op.up0().add(lockR);

						//上り電文の定義
						Srch_TgtR alcR = Srch_TgtR.create();
						copy(alcR, dtlR, hdrR, createMap_Srch_TgtR_Slo_Upd01_DtlR());
						alcR.setNumberNE("dtl_peg_no", dtlR.peg_no());
						alcR.peg_no(i);
						alcR.cst_cd(hdrR.cst_cd()); // 得意先
						
						if (!MAC_ALLOC_TYP.isIMMED(dtlR.alloc_typ()) 
								|| (!MAC_SLO_PROC_TYP.isALLOC(dtlR.proc_typ()) && !MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ()))) {
							
							if (isStkKeyChnaged(oldSloDR, dtlR)) {
								// 後引当の場合は、在庫のキーが変わっていたら引当せず
								continue;
							}
							
							// 後引当の場合は、引当解除した数量のみ保持する。
							MCNumber allocQty = dtlR.getNumberNE("alloc_rel_qty");
							
							if (dtlR.base_unit_qty().gte(allocQty)) {
								
								if (dtlR.pack_flg()) {
									
									MCNumber trdUnitQty = rvrsBaseUnitConv(allocQty, dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
											dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ());
									alcR.pack_unit_qty(trdUnitQty);
								}
								
								alcR.base_unit_qty(allocQty);
							}
						}
						
						//引当保留除外ＦＬＧの設定
						if (dtlR.getBooleanNE("exceptAllocWait")){
							alcR.except_alloc_wait_flg(true); //引当保留除外FLGをオンにする
							if (MAC_ALLOC_TYP.isIMMED(dtlR.alloc_typ())) {
								
								MCNumber allocRelQty = dtlR.getNumberNE("alloc_rel_qty");
								if (dtlR.base_unit_qty().gt(allocRelQty)) {
									if (!dtlR.not_lot_mix_flg() && !dtlR.not_sublot_mix_flg() && !dtlR.not_lg_mix_flg()) {
										
										alcR.base_unit_qty(allocRelQty);
										
										if (dtlR.pack_flg()) {
											alcR.pack_unit_qty(rvrsBaseUnitConv(allocRelQty, dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
													dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ()));
										}
										
										Srch_TgtR alcWaitR = alcR.clone();
										alcWaitR.base_unit_qty(dtlR.base_unit_qty().subtract(allocRelQty));
										if (dtlR.pack_flg()) {
											alcWaitR.pack_unit_qty(rvrsBaseUnitConv(alcWaitR.base_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
													dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ()));
										}
										alcWaitR.except_alloc_wait_flg(false);
										opAlc.up1().add(alcWaitR);
									}
									else {
										alcR.except_alloc_wait_flg(false);
									}
								}
							}
						}else{
							alcR.except_alloc_wait_flg(false); //引当保留除外FLGをオフにする
						}					
						opAlc.up1().add(alcR);
						allocSloDL.add(oldSloDR);
					}
					//引当区分=即引当,手配区分=在庫引当OR引当後手配
					else if (MAC_ALLOC_TYP.isIMMED(dtlR.alloc_typ()) && (MAC_SLO_PROC_TYP
							.isALLOC(dtlR.proc_typ()) || MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ()))) {
						//更新の場合、所定の項目の変更あるときのみ引当処理の対象とする
						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							//打切りの場合は引当対象外とする。
							if (dtlR.abort_flg()){
								continue;
							}

							//キャッシュから対応する更新前の出荷進捗を取得する。
							MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
							if (!isAbortRet(dtlR, oldSloDR) && !isAllocCancel(oldSloDR, oldShipPrR, dtlR, hdrR)){
								//引当関連しない項目の変更の場合は引当解除しなく、再引当しない。
								dtlR.setBooleanNE("NO_Alloc_ROW_FLG", true);
								continue;
							}
						}

						//未変更の明細は引当対象外とする。
						if (isNull(dtlR.data_crud_typ()) && isSame(_cacheSloR.cst_cd(), hdrR.cst_cd())) {
							dtlR.setBooleanNE("NO_Alloc_ROW_FLG", true);
							continue;
						}
						
						MSW_ALLOC_LOC_MAP_R lockR = MSW_ALLOC_LOC_MAP_R.create();
						//品目CD
						lockR.itm_cd(dtlR.itm_cd());
						lockR.itm_sub1(dtlR.itm_sub1());
						lockR.itm_sub2(dtlR.itm_sub2());
						lockR.itm_sub3(dtlR.itm_sub3());
						lockR.gi_loc_cd(dtlR.loc_cd());
						lockR.gi_lg_grp_cd(dtlR.ship_lg_grp_cd());
						lockR.alloc_grp_cd(dtlR.alloc_grp_cd());
						lockR.alloc_scope_typ(dtlR.alloc_scope_typ()); //引当範囲区分
						op.up0().add(lockR);

						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) 
								&& !dtlR.abort_flg() && oldSloDR.abort_flg() 
								&& dtlR.rem_abort_flg()) {
							
							int j = 0;
							for (MST_SHIP_SCHD_R r : _cacheShipSchdL.subList(MST_SHIP_SCHD_R.$ship_pr_no, dtlR.ship_pr_no())) {
								if (r.ship_inst_qty().gt(0) || r.ship_act_qty().gt(0) || !isNull(r.sls_act_d_no())){
									continue;
								}
								
								//上り電文の定義
								Srch_TgtR alcR = Srch_TgtR.create();
								copy(alcR, dtlR, hdrR, createMap_Srch_TgtR_Slo_Upd01_DtlR());
								alcR.setNumberNE("dtl_peg_no", dtlR.peg_no());
								alcR.peg_no(i + j);
								alcR.setStringNE("ship_schd_no", r.ship_schd_no());
								alcR.cst_cd(hdrR.cst_cd()); // 得意先
								//引当保留除外ＦＬＧの設定
								if (dtlR.getBooleanNE("retStkAlloc_flg") && dtlR.getBooleanNE("exceptAllocWait")){
									alcR.except_alloc_wait_flg(true); //引当保留除外FLGをオンにする
								}else{
									alcR.except_alloc_wait_flg(false); //引当保留除外FLGをオンにする
								}
								
								alcR.base_unit_qty(r.base_unit_qty());
								if (dtlR.pack_flg()) {
									MCNumber trdUnitQty = rvrsBaseUnitConv(r.base_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
											dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
									if (isNull(trdUnitQty)){
										alcR.pack_unit_qty(r.base_unit_qty());
									}
									else{
										alcR.pack_unit_qty(trdUnitQty);
									}
								}
								opAlc.up1().add(alcR);
								j++;
							}
							i = i + j - 1;
						}
						else {
							//上り電文の定義
							Srch_TgtR alcR = Srch_TgtR.create();
							copy(alcR, dtlR, hdrR, createMap_Srch_TgtR_Slo_Upd01_DtlR());
							alcR.setNumberNE("dtl_peg_no", dtlR.peg_no());
							alcR.peg_no(i);
							alcR.cst_cd(hdrR.cst_cd()); // 得意先
							//引当保留除外ＦＬＧの設定
							if (dtlR.getBooleanNE("retStkAlloc_flg") && dtlR.getBooleanNE("exceptAllocWait")){
								alcR.except_alloc_wait_flg(true); //引当保留除外FLGをオンにする
							}else{
								alcR.except_alloc_wait_flg(false); //引当保留除外FLGをオンにする
							}
							opAlc.up1().add(alcR);
						}
						allocSloDL.add(oldSloDR);
					}
					else{
						dtlR.setBooleanNE("NO_Alloc_ROW_FLG", true);
					}
				}
				i++;
			}
			//対象テーブルのデータのロックを行う。
			if (!op.up0().isEmpty()) {
				op.exec();
			}
			//引当を実行する
			if (!opAlc.up1().isEmpty()) {
				delIoSchdAllocWait(allocSloDL);
				opAlc.up0().stk_flg(false);
				opAlc.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
				opAlc.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
				opAlc.up0().nm_srch_flg(false);
				opAlc.exec();
				//引当結果を取得し、一次変数に保存する。
				MCList<Srch_RsltR> dnL = opAlc.down0();
				for (Srch_RsltR dnR : dnL) {
					Srch_TgtR upR = opAlc.up1().getFirst(Srch_RsltR.$peg_no, dnR.peg_no());
					dnR.peg_no(upR.getNumberNE("dtl_peg_no"));
					dnR.setStringNE("ship_schd_no", upR.getStringNE("ship_schd_no"));
				}
				_allocResultL.addAll(opAlc.down0());
				_allocResultBkL.addAll(opAlc.down0().clone());
			}
		}
		
		/**
		 * 出荷予定が変更されたかどうか。
		 * @param hdrR 受注ヘッダ
		 * @return 変更されたはtrue
		 */
		protected boolean isShipSchdChanged(Slo_Upd01_HdrR hdrR) {
			
			if (isSame(_cacheSloR.cst_cd(), hdrR.cst_cd())
					&& isSame(_cacheSloR.wg_cd(), hdrR.wg_cd())
					&& isSame(_cacheSloR.sls_dpt_cd(), hdrR.sls_dpt_cd())
					&& isSame(_cacheSloR.sls_usr_cd(), hdrR.sls_usr_cd())
					&& isSame(_cacheSloR.sls_basis_typ(), hdrR.sls_basis_typ())
					&& isSame(_cacheSloR.slo_typ(), hdrR.slo_typ())
					&& isSame(_cacheSloR.trd_rmrks(), hdrR.trd_rmrks())
					&& isSame(_cacheSloR.assort_typ(), hdrR.assort_typ())) {
				return false;
			}
			return true;
		}
		
		/**
		 * 受注明細の変更レコードに出荷予定サービスに呼出しの対象かを判断する。
		 * @param hdrR 受注ヘッダ
		 * @param oldSloDR 変更前受注明細
		 * @param oldShipPrR 変更前出荷進捗
		 * @param dtlR 受注明細
		 * @return　対象となる場合はtrue
		 */
		protected boolean isShipSchdChanged(Slo_Upd01_HdrR hdrR, MST_SLO_D_R oldSloDR, MST_SHIP_PR_R oldShipPrR, Slo_Upd01_DtlR dtlR) {
			
			//変更前と変更後の下記の項目値が同一の場合、出荷予定を行わない。
			/*ヘッダ項目：売上部門CD、売上担当者CD、得意先ＣＤ、ワーキンググループＣＤ,売上計上区分
			明細項目：品目ＣＤ、枝番１、枝番２、枝番３、品名、Ｉ／Ｖ表記品名、出荷希望日時、納入希望日時、出荷予定時刻、納品予定時刻、配送先経由区分
			配送先物流ＧＣＤ、納品先物流ＧＣＤ、配送先ＣＤ、納品先ＣＤ、配送先名、納品先名、配送先郵便番号、納品先郵便番号、配送先住所１
			納品先住所１、配送先住所２、納品先住所２、配送先住所３、納品先住所３、配送先住所４、納品先住所４、配送先部署、納品先部署
			配送先担当者、納品先担当者、配送先TEL、納品先TEL、価格印字ＦＬＧ、取引単位数量、取引単位ＣＤ、売上理由ＣＤ、売上負担部門ＣＤ
			品揃ＮＯ、出荷条件ＣＤ,出荷指図区分,着曜日,出荷予定分割区分,引当範囲区分,引当区分,総量引当場所グループＣＤ,出荷物流グループＣＤ
			デフォルト場所ＣＤ,場所ＣＤ,棚・ラインＣＤ,ロットＮＯ,サブロットＮＯ,版ＮＯ,手配ＮＯ１,手配ＮＯ１無し可ＦＬＧ,手配ＮＯ２,手配ＮＯ２無し可ＦＬＧ,
			手配ＮＯ３,手配ＮＯ３無し可ＦＬＧ,手配ＮＯ４,手配ＮＯ４無し可ＦＬＧ,格付ＣＤ,預りFLG,貸出FLG,出荷留めＦＬＧ,
			手配区分、依頼先場所、依頼発注先,取引備考,取引明細備考,出荷連絡備考*/
			if (isSame(_cacheSloR.cst_cd(), hdrR.cst_cd())
					&& isSame(_cacheSloR.wg_cd(), hdrR.wg_cd())
					&& isSame(_cacheSloR.sls_dpt_cd(), hdrR.sls_dpt_cd())
					&& isSame(_cacheSloR.sls_usr_cd(), hdrR.sls_usr_cd())
					&& isSame(_cacheSloR.sls_basis_typ(), hdrR.sls_basis_typ())
					&& isSame(_cacheSloR.slo_typ(), hdrR.slo_typ())
					&& isSame(_cacheSloR.aprv_flg(), hdrR.aprv_flg())
					&& isSame(_cacheSloR.aprv_sts_typ(), hdrR.aprv_sts_typ())
					&& isSame(_cacheSloR.adv_ship_ctrl_typ(), hdrR.adv_ship_ctrl_typ())
					&& isSame(_cacheSloR.adv_bill_amt(), hdrR.adv_bill_amt())
					&& isSame(_cacheSloR.assort_typ(), hdrR.assort_typ())
					&& isSame(oldSloDR.itm_cd(), dtlR.itm_cd())
					&& isSame(oldSloDR.itm_sub1(), dtlR.itm_sub1())
					&& isSame(oldSloDR.itm_sub2(), dtlR.itm_sub2())
					&& isSame(oldSloDR.itm_sub3(), dtlR.itm_sub3())
					&& isSame(oldSloDR.itm_nm(), dtlR.itm_nm())
					&& isSame(oldSloDR.iv_itm_nm(), dtlR.iv_itm_nm())
					&& isSame(oldSloDR.ship_rqst_tm(), dtlR.ship_rqst_tm())
					&& (MAC_VIA_DLV_TYP.isVIA(oldSloDR.via_dlv_typ()) ||
							(!MAC_VIA_DLV_TYP.isVIA(oldSloDR.via_dlv_typ()) && isSame(oldSloDR.dlv_rqst_tm(), dtlR.dlv_rqst_tm())))
					&& isSame(oldShipPrR.ship_schd_tm(), dtlR.ship_schd_tm())
					&& isSame(oldShipPrR.dlv_schd_tm(), dtlR.dlv_schd_tm())
					&& isSame(oldSloDR.via_dlv_typ(), dtlR.via_dlv_typ())
					&& isSame(oldSloDR.dlv_cd(), dtlR.dlv_cd())
					&& isSame(oldSloDR.dlv_nm(), dtlR.dlv_nm())
					&& isSame(oldSloDR.dlv_cntct_dpt(), dtlR.dlv_cntct_dpt())
					&& isSame(oldSloDR.dlv_cntct_psn(), dtlR.dlv_cntct_psn())
					&& isSame(oldSloDR.dlv_zip_cd(), dtlR.dlv_zip_cd())
					&& isSame(oldSloDR.dlv_addr1(), dtlR.dlv_addr1())
					&& isSame(oldSloDR.dlv_addr2(), dtlR.dlv_addr2())
					&& isSame(oldSloDR.dlv_addr3(), dtlR.dlv_addr3())
					&& isSame(oldSloDR.dlv_addr4(), dtlR.dlv_addr4())
					&& isSame(oldSloDR.dlv_tel(), dtlR.dlv_tel())
					&& isSame(oldSloDR.dlv_fax(), dtlR.dlv_fax())
					&& isSame(oldSloDR.dlv_lg_grp_cd(), dtlR.dlv_lg_grp_cd())
					&& isSame(oldSloDR.pri_prnt_flg(), dtlR.pri_prnt_flg())
					&& isSame(oldSloDR.tdlv_cd(), dtlR.tdlv_cd())
					&& isSame(oldSloDR.tdlv_nm(), dtlR.tdlv_nm())					
					&& isSame(oldSloDR.tdlv_cntct_dpt(), dtlR.tdlv_cntct_dpt())
					&& isSame(oldSloDR.tdlv_cntct_psn(), dtlR.tdlv_cntct_psn())
					&& isSame(oldSloDR.tdlv_zip_cd(), dtlR.tdlv_zip_cd())
					&& isSame(oldSloDR.tdlv_addr1(), dtlR.tdlv_addr1())
					&& isSame(oldSloDR.tdlv_addr2(), dtlR.tdlv_addr2())
					&& isSame(oldSloDR.tdlv_addr3(), dtlR.tdlv_addr3())
					&& isSame(oldSloDR.tdlv_addr4(), dtlR.tdlv_addr4())
					&& isSame(oldSloDR.tdlv_tel(), dtlR.tdlv_tel())
					&& isSame(oldSloDR.tdlv_fax(), dtlR.tdlv_fax())
					&& isSame(oldSloDR.tdlv_lg_grp_cd(), dtlR.tdlv_lg_grp_cd())
					&& isSame(oldSloDR.trd_unit_cd(), dtlR.trd_unit_cd())
					&& isSame(oldSloDR.trd_unit_qty(), dtlR.trd_unit_qty())
					&& isSame(oldSloDR.sls_rsn_cd(), dtlR.sls_rsn_cd())
					&& isSame(oldSloDR.bd_dpt_cd(), dtlR.bd_dpt_cd())
					&& isSame(oldSloDR.ver_no(), dtlR.ver_no())
					&& isSame(oldSloDR.ship_term_cd(), dtlR.ship_term_cd())
					&& isSame(oldSloDR.ship_inst_typ(), dtlR.ship_inst_typ())
					&& isSame(oldSloDR.dlv_day_week_typ(), dtlR.dlv_day_week_typ())
					&& isSame(oldSloDR.ship_schd_split_typ(), dtlR.ship_schd_split_typ())
					&& isSame(oldSloDR.alloc_scope_typ(), dtlR.alloc_scope_typ())
					&& isSame(oldSloDR.alloc_typ(), dtlR.alloc_typ())
					&& isSame(oldSloDR.alloc_grp_cd(), dtlR.alloc_grp_cd())
					&& isSame(oldSloDR.ship_lg_grp_cd(), dtlR.ship_lg_grp_cd())
					&& isSame(oldSloDR.def_loc_cd(), dtlR.def_loc_cd())
					&& isSame(oldSloDR.loc_cd(), dtlR.loc_cd())
					&& isSame(oldSloDR.str_ln_cd(), dtlR.str_ln_cd())
					&& isSame(oldSloDR.lot_no(), dtlR.lot_no())
					&& isSame(oldSloDR.sublot_no(), dtlR.sublot_no())					
					&& isSame(oldSloDR.sno1(), dtlR.sno1())
					&& isSame(oldSloDR.sno1_null_flg(), dtlR.sno1_null_flg())
					&& isSame(oldSloDR.sno2(), dtlR.sno2())
					&& isSame(oldSloDR.sno2_null_flg(), dtlR.sno2_null_flg())
					&& isSame(oldSloDR.sno3(), dtlR.sno3())
					&& isSame(oldSloDR.sno3_null_flg(), dtlR.sno3_null_flg())
					&& isSame(oldSloDR.sno4(), dtlR.sno4())
					&& isSame(oldSloDR.sno4_null_flg(), dtlR.sno4_null_flg())
					&& isSame(oldSloDR.gd_cd(), dtlR.gd_cd())
					&& isSame(oldSloDR.sls_cststk_flg(), dtlR.sls_cststk_flg())
					&& isSame(oldSloDR.vmi_flg(), dtlR.vmi_flg())
					&& isSame(oldSloDR.proc_typ(), dtlR.proc_typ())
					&& isSame(oldSloDR.rqst_to_loc_cd(), dtlR.rqst_to_loc_cd())
					&& isSame(_cacheSloR.trd_rmrks(), hdrR.trd_rmrks())
					&& isSame(oldSloDR.trd_d_rmrks(), dtlR.trd_d_rmrks())
					&& isSame(oldSloDR.ship_cnt_rmrks(), dtlR.ship_cnt_rmrks())
					&& (isSame(oldSloDR.set_itm_grp_no(), dtlR.set_itm_grp_no()))
					&& (getBp(hdrR.cst_cd()).cst_iv_flg() 
							|| MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ()) 
							|| isSame(oldSloDR.sls_schd_dt(), dtlR.sls_schd_dt()))
					&& isSame(oldSloDR.not_lg_mix_flg(), dtlR.not_lg_mix_flg())
					&& isSame(oldSloDR.not_lot_mix_flg(), dtlR.not_lot_mix_flg())
					&& isSame(oldSloDR.not_sublot_mix_flg(), dtlR.not_sublot_mix_flg())
					&& !dtlR.abort_flg()) {
				
				// 以下の項目は仕入直送でない場合のみ判断する
				if (!MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
					MCList<MST_SHIP_SCHD_R> shipSchdL = _cacheShipSchdL.subList(MST_SHIP_SCHD_R.$ship_pr_no, oldShipPrR.ship_pr_no());
					boolean oldShipBlockFlg = (boolean)shipSchdL.max(MST_SHIP_SCHD_R.$ship_block_flg);
					boolean oldNotCalcFlg = (boolean)shipSchdL.max(MST_SHIP_SCHD_R.$not_dt_calc_flg);
					if (isSame(oldSloDR.sppl_cd(), dtlR.sppl_cd())
							&& isSame(oldShipBlockFlg, dtlR.ship_block_flg())
							&& isSame(oldNotCalcFlg, dtlR.not_dt_calc_flg())
							&& isSame(oldSloDR.maker_cd(), dtlR.maker_cd())) {
						return false;
					}
				}
				else {
					return false;
				}
			}
			return true;
		}

		/**
		 * 所定の項目変更があった場合、出荷・供給依頼サービスが更新モードで呼出す 
		 * @param hdrR 受注ヘッダ
		 * @param dtlR 受注明細
		 * @return 更新モードで呼び出す場合はtrue
		 */
		protected boolean isRqstUpdate(Slo_Upd01_HdrR hdrR, Slo_Upd01_DtlR dtlR) {
			
			//キャッシュから対応する更新前の受注明細を取得する。
			MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
			//キャッシュから対応する更新前の出荷進捗を取得する。
			MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
			
			if (isSame(_cacheSloR.cst_cd(), hdrR.cst_cd())
					&& isSame(_cacheSloR.wg_cd(), hdrR.wg_cd())
					&& isSame(_cacheSloR.sls_dpt_cd(), hdrR.sls_dpt_cd())
					&& isSame(_cacheSloR.sls_usr_cd(), hdrR.sls_usr_cd())
					&& isSame(_cacheSloR.slo_dt(), hdrR.slo_dt())
					&& isSame(oldSloDR.loc_cd(), dtlR.loc_cd())
					&& isSame(oldSloDR.str_ln_cd(), dtlR.str_ln_cd())
					&& isSame(oldSloDR.def_loc_cd(), dtlR.def_loc_cd())
					&& isSame(oldSloDR.ship_rqst_tm(), dtlR.ship_rqst_tm())
					&& isSame(oldShipPrR.ship_schd_tm(), dtlR.ship_schd_tm())
					&& ((MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ()) || isSame(oldSloDR.dlv_rqst_tm(), dtlR.dlv_rqst_tm())))
					&& isSame(oldSloDR.rqst_to_loc_cd(), dtlR.rqst_to_loc_cd())
					&& isSame(oldSloDR.itm_cd(), dtlR.itm_cd())
					&& isSame(oldSloDR.itm_sub1(), dtlR.itm_sub1())
					&& isSame(oldSloDR.itm_sub2(), dtlR.itm_sub2())
					&& isSame(oldSloDR.itm_sub3(), dtlR.itm_sub3())
					&& isSame(oldSloDR.itm_nm(), dtlR.itm_nm())
					&& isSame(oldSloDR.lot_no(), dtlR.lot_no())
					&& isSame(oldSloDR.sublot_no(), dtlR.sublot_no())
					&& isSame(oldSloDR.sno1(), dtlR.sno1())
					&& isSame(oldSloDR.sno1_null_flg(), dtlR.sno1_null_flg())
					&& isSame(oldSloDR.sno2(), dtlR.sno2())
					&& isSame(oldSloDR.sno2_null_flg(), dtlR.sno2_null_flg())
					&& isSame(oldSloDR.sno3(), dtlR.sno3())
					&& isSame(oldSloDR.sno3_null_flg(), dtlR.sno3_null_flg())
					&& isSame(oldSloDR.sno4(), dtlR.sno4())
					&& isSame(oldSloDR.sno4_null_flg(), dtlR.sno4_null_flg())
					&& isSame(oldSloDR.ver_no(), dtlR.ver_no())
					&& (!isNull(oldSloDR.sppl_cd()) || isSame(oldSloDR.gd_cd(), dtlR.gd_cd()))
					&& isSame(oldSloDR.trd_unit_qty(), dtlR.trd_unit_qty())
					&& isSame(oldSloDR.trd_unit_cd(), dtlR.trd_unit_cd())
					&& isSame(oldSloDR.base_unit_qty(), dtlR.base_unit_qty())
					&& isSame(oldSloDR.base_unit_cd(), dtlR.base_unit_cd())
					&& isSame(oldSloDR.sppl_cd(), dtlR.sppl_cd())
					&& (isSame(oldSloDR.maker_cd(), dtlR.maker_cd()) 
							|| (isNullOrNullVal(oldSloDR.maker_cd()) && isNullOrNullVal(dtlR.maker_cd())))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_cd(), dtlR.dlv_cd()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_sundry_flg(), dtlR.dlv_sundry_flg()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_nm(), dtlR.dlv_nm()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_cntct_dpt(), dtlR.dlv_cntct_dpt()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_cntct_psn(), dtlR.dlv_cntct_psn()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_zip_cd(), dtlR.dlv_zip_cd()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_addr1(), dtlR.dlv_addr1()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_addr2(), dtlR.dlv_addr2()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_addr3(), dtlR.dlv_addr3()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_addr4(), dtlR.dlv_addr4()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_tel(), dtlR.dlv_tel()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.dlv_fax(), dtlR.dlv_fax()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_cd(), dtlR.tdlv_cd()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_sundry_flg(), dtlR.tdlv_sundry_flg()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_nm(), dtlR.tdlv_nm()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_zip_cd(), dtlR.tdlv_zip_cd()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_addr1(), dtlR.tdlv_addr1()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_addr2(), dtlR.tdlv_addr2()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_addr3(), dtlR.tdlv_addr3()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_addr4(), dtlR.tdlv_addr4()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_cntct_dpt(), dtlR.tdlv_cntct_dpt()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_cntct_psn(), dtlR.tdlv_cntct_psn()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_tel(), dtlR.tdlv_tel()))
					&& (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || isSame(oldSloDR.tdlv_fax(), dtlR.tdlv_fax()))
					&&(isSame(getNotAlcQty(dtlR, oldSloDR, hdrR), 
							isSame(dtlR.base_unit_cd(), oldSloDR.rqst_unit_cd()) ? nvl(oldSloDR.rqst_qty(), MCNumber.ZERO) : 
								getBaseUnitQty(nvl(oldSloDR.rqst_qty(), MCNumber.ZERO),
									oldSloDR.rqst_unit_cd(), 
									oldSloDR.itm_cd(), oldSloDR.itm_sub1(), oldSloDR.itm_sub2(), oldSloDR.itm_sub3())))
					&& isSame(oldSloDR.wg_rqst_cnt_rmrks(), dtlR.wg_rqst_cnt_rmrks())
					&& isSame(oldSloDR.abort_flg(), dtlR.abort_flg())
					&& (!MAC_SLO_PROC_TYP.isALLOC_PROC(oldSloDR.proc_typ()) && !MAC_SLO_PROC_TYP.isPROC(oldSloDR.proc_typ())
							|| isSame(oldSloDR.not_lot_mix_flg(), dtlR.not_lot_mix_flg()) && isSame(oldSloDR.not_sublot_mix_flg(), dtlR.not_sublot_mix_flg()))) {
				return false;
			}
			else if ((dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg())) 
					&& dtlR.rem_abort_flg()) {
				return false;
			}
			return true;
		}

		/**
		 * 出荷予定サービスの呼び出し（引当戻しの場合のみ実行する） <br>
		 * 打切解除の場合、引当済にするため、出荷予定サービスを２回を呼び出す。
		 */
		protected void callShipSchdServiceAbortRet(Slo_Upd01_HdrR hdrR) {
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			MCIndexKey shipSchdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			
			int i = 0;
			for (Slo_Upd01_DtlR dtlR : up1()) {
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
						|| (isNull(dtlR.data_crud_typ()) && isShipSchdChanged(hdrR))) {
					
					MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
					MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
					ShipSchd_DtlR schdR = null;
					
					if ((dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg())) 
							&& dtlR.rem_abort_flg()) {
						for (MST_SHIP_SCHD_R r : _cacheShipSchdL.subList(shipSchdIdxkey, dtlR.ship_pr_no())) {
							if (r.ship_inst_qty().gt(0) || r.ship_act_qty().gt(0)) {
								continue;
							}
							if (!dtlR.abort_flg() && oldSloDR.abort_flg()) {
								schdR = ShipSchd_DtlR.create();
								copy(schdR, dtlR, r, createMap_ShipSchd_DtlR_MST_SLO_D_R());
								schdR.peg_no(i++);
								schdR.quality_typ(nvl(r.quality_typ(), MAC_QUALITY_TYP.GOOD.value())); //良品区分
								schdR.stk_id_typ(nvl(r.stk_id_typ(), MSC_STK_ID_TYP.COSTK.value())); //在庫識別区分
								schdR.stk_bp_cd(nvl(r.stk_bp_cd(), MAC_STR.NULL_VAL.value())); //在庫取引先ＣＤ
								op.up1().add(schdR);
							}
						}
						
						if (!op.up1().isEmpty()) {
							op.up0().lot_chk_flg(false);
							
							// 預り売上済みの場合、売上時に指定した情報を保持するため、出荷引当状況を渡すよ
							MCList<MST_SHIP_ALLOC_STS_R> slsActShipAllocStsL = getSlsActAllocSts(oldSloDR, oldShipPrR);
							
							Alloc_RsltR allocRsltR = null;
							
							for (ShipSchd_DtlR shipSchdDtlR : op.up1()) {
								
								shipSchdDtlR.is_src_sls_dlv_dt_adjst_flg(true);
								if (!isNull(shipSchdDtlR.sls_act_d_no())) {
									
									MCIndexKey idxkey = slsActShipAllocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
									
									MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsL = slsActShipAllocStsL.subList(idxkey, shipSchdDtlR.ship_schd_no());
									for (MST_SHIP_ALLOC_STS_R allocStsR : slsActAllocStsL) {
										
										allocRsltR = Alloc_RsltR.create();
										copy(allocRsltR, allocStsR, createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
										allocRsltR.alloc_flg(true);
										allocRsltR.peg_no(shipSchdDtlR.peg_no());
										op.up2().add(allocRsltR);
									}
								}
							}
						}
					}
				}
			}
			
			if (!op.up1().isEmpty()) {
				op.exec();
			}
		}
		/**
		 * 出荷予定サービスを呼び出す。
		 * @param hdrR 受注ヘッダ
		 */
		protected void callShipSchdService(Slo_Upd01_HdrR hdrR) {
			//上り電文（Alloc_Rslt）の設定
			if (!_allocResultL.isEmpty()) {
				for (Srch_RsltR alRstR : _allocResultL) {
					Slo_Upd01_DtlR dlR = up1().subList(Slo_Upd01_DtlR.$peg_no,
							alRstR.peg_no()).get(0);
					//有効期限（下限）
					alRstR.vld_dt_fr(dlR.valid_dt_fr());
					//有効期限（上限）
					alRstR.vld_dt_to(dlR.valid_dt_to());
				}
			}
			//出荷進捗、出荷予定、出荷引当状況の作成のため、出荷予定サービス.更新（出荷進捗・予定）（MSBEL5500.ShipSchd_Upd01）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Upd01 op = MSBEL_ShipSchdService.crtShipSchd_Upd01();
			MSBEL_ShipSchdService.ShipSchd_Upd01 opTwo = MSBEL_ShipSchdService.crtShipSchd_Upd01();
			//出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）のサービスを出荷判定モードで実行して、出荷可能を更新する。
			MSBEL_ShipSchdService.ShipSchd_Upd02 opShipJudge = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			MCIndexKey shipSchdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			MCIndexKey dlvInstshipSchdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			MCMessageList msgL = new MCMessageList();
			
			//引当余裕日数を取得する
			MCList<MAVM_ITM_WG_R> dbc = getItmMgnD(up1());
			MCIndexKey idx = dbc.createIndex(MAVM_ITM_WG_R.$itm_cd,
					MAVM_ITM_WG_R.$itm_sub1, MAVM_ITM_WG_R.$itm_sub2,
					MAVM_ITM_WG_R.$itm_sub3, "loc_cd");
			MSBBL_DlvInstRcptService.DlvInstRcv_Upd01 opDlv = MSBBL_DlvInstRcptService.crtDlvInstRcv_Upd01();
			
			int i = 0;
			
			for (Slo_Upd01_DtlR dtlR : up1()) {
				MCList<Srch_RsltR> allocL = MCList.create(Srch_RsltR.class);
				//引当余裕日数の設定
				MAVM_ITM_WG_R itmR = dbc.getFirst(idx, dtlR.itm_cd(), dtlR.itm_sub1(),
						dtlR.itm_sub2(), dtlR.itm_sub3(),nvl(dtlR.loc_cd(), dtlR.def_loc_cd()));
				if (!isNull(itmR)) {
					dtlR.alloc_margin_days(itmR.alloc_margin_days());
					dtlR.setBooleanNE("not_xfr_flg", itmR.not_xfr_flg());
				}
				//上り電文.受注明細.データ更新区分＝新規の場合、出荷予定サービスの上り電文の設定は新規登録と同じに設定。
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					//上り電文（ShipPr_Dtl）の設定
					ShipPr_DtlR prR = ShipPr_DtlR.create();
					copy(prR, dtlR, hdrR, createMap_ShipPr_DtlR_Slo_Upd01_DtlR());
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
						// 売上部門で、場所マスタから場所CDを取得する
						String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
						//場所マスタからWG_CDを取得する。
						MAM_LOC_R midlocR = getLoc(midLocCd);
						prR.ship_fr_lg_grp_cd(midlocR.lg_grp_cd());
					}
					op.up0().add(prR);
					allocL = setAllocStsRslt(dtlR, hdrR);
				}
				//上り電文.受注明細.データ更新区分＝削除の場合、
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					//出荷予定サービスの上り電文.ShipSchd_Dtlの削除レコードを作成する。
					//上り電文（ShipPr_Dtl）の設定
					ShipPr_DtlR prR = ShipPr_DtlR.create();
					prR.peg_no(dtlR.peg_no());
					prR.data_crud_typ(dtlR.data_crud_typ());
					prR.ship_pr_no(dtlR.ship_pr_no());
					prR.cred_no_up_flg(true);
					prR.setAttributes(dtlR);
					op.up0().add(prR);

					//受注明細に対応する納入指示受領にデータが存在するかを調べる。
					MCList<MST_DLV_INST_RCPT_R> dlvInstRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
					MST_DLV_INST_RCPT_R dlvInstRcptL_t = MST_DLV_INST_RCPT_R.create("T");
					MCQueryApiBuilder dlvInstRcptL_bldr = MCQueryApiBuilder.create(dlvInstRcptL_t);
					dlvInstRcptL_bldr.setWhere(dlvInstRcptL_t.slo_d_no.eq(bind("1")), dtlR.slo_d_no());
					dlvInstRcptL_bldr.addWhereWithAnd(dlvInstRcptL_t.can_flg.eq(value(false)));
					dbSelect("MSBBL6020_MST_DLV_INST_RCPT_S01", dlvInstRcptL, dlvInstRcptL_bldr);

					//納入指示受領を削除するため、納入指示受領サービスの上り電文作成
					for (MST_DLV_INST_RCPT_R r : dlvInstRcptL) {
						DlvInstRcv_Upd01_DtlR dlvR = DlvInstRcv_Upd01_DtlR.create();
						dlvR.data_crud_typ(dtlR.data_crud_typ());
						dlvR.dlv_inst_rcpt_no(r.dlv_inst_rcpt_no());
						dlvR.dlv_inst_rcpt_rev(r.dlv_inst_rcpt_rev());
						dlvR.slo_d_no(dtlR.slo_d_no());
						dlvR.slo_upd_flg(true);
						opDlv.up0().add(dlvR);
					}
				}
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) || (isNull(dtlR.data_crud_typ()) && isShipSchdChanged(hdrR))) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
					//キャッシュから対応する更新前の出荷進捗を取得する。
					MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
					//受注明細の打切、打切取消（上り電文.受注明細.打切ＦＬＧ=オフ、更新前の受注明細.打切ＦＬＧ＝オン）の場合
					if (dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg())) {
						//売上集計基準日更新するかどうかのFLGを設定する
						if (!hdrR.cst_iv_flg() && !MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())){
							dtlR.setStringNE("SLO_SUM_BASE_DT_FLG", "1");
						}
						
						if(dtlR.rem_abort_flg()) {
							MCList<ShipSchd_DtlR> up1L = MCList.create(ShipSchd_DtlR.class);
							MCList<Alloc_RsltR> up2L = MCList.create(Alloc_RsltR.class);
							MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
							
							for (MST_SHIP_SCHD_R r : _cacheShipSchdL.subList(shipSchdIdxkey, dtlR.ship_pr_no())) {
								if (r.ship_inst_qty().gt(0) || r.ship_act_qty().gt(0)){
									continue;
								}
								
								// 売上済みの場合は、出荷引当状況のロットＮＯを調整するため、常に渡す。
								ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
								oldSloDR.setStringNE("cst_cd", hdrR.cst_cd());
								copy(schdR, dtlR, r, createMap_ShipSchd_DtlR_MST_SLO_D_R());
								schdR.peg_no(i++);
								schdR.trd_rmrks(hdrR.trd_rmrks());
								schdR.rem_abort_flg(dtlR.rem_abort_flg());
								schdR.quality_typ(nvl(r.quality_typ(), MAC_QUALITY_TYP.GOOD.value()));
								schdR.stk_id_typ(nvl(r.stk_id_typ(), MSC_STK_ID_TYP.COSTK.value()));
								schdR.stk_bp_cd(nvl(r.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
								up1L.add(schdR);
								shipSchdL.add(r);
							}
							
							if (!dtlR.abort_flg() && oldSloDR.abort_flg()) {
								//引当結果を設定
								MCList<Srch_RsltR> allocLTwo = MCList.create(Srch_RsltR.class);
								allocLTwo = setAllocStsRslt(dtlR, hdrR);
								for (Srch_RsltR alRstR : allocLTwo) {
									ShipSchd_DtlR upR = up1L.getFirst(ShipSchd_DtlR.$ship_schd_no, alRstR.getStringNE("ship_schd_no"));
									if (!isNull(upR)) {
										Alloc_RsltR alR = Alloc_RsltR.create();
										alR.alloc(alRstR);
										alR.peg_no(upR.peg_no());
										if (alRstR.base_unit_qty().gt(0)) {
											alR.alloc_flg(true);
										}
										else {
											alR.alloc_flg(false);
										}
										up2L.add(alR);
									}
								}
							}
							
							up2L.addAll(getNoChngAllocSts(up1L, oldSloDR, oldShipPrR));
							for (ShipSchd_DtlR shipSchdR : up1L) {
								shipSchdR.is_src_sls_dlv_dt_adjst_flg(true);
								
								Alloc_RsltR allocR = opShipJudge.up2().getFirst(Alloc_RsltR.$peg_no, shipSchdR.peg_no());
								if (!isNull(allocR)) {
									shipSchdR.gd_cd(allocR.gd_cd());
									shipSchdR.quality_typ(allocR.quality_typ());
									shipSchdR.stk_id_typ(allocR.stk_id_typ());
									shipSchdR.stk_bp_cd(allocR.stk_bp_cd());
								}
							}
							
							checkShipLotForslsCststk(up1L, up2L, oldSloDR);
							opShipJudge.up0().lot_chk_flg(false);
							opShipJudge.up1().addAll(up1L);
							opShipJudge.up2().addAll(up2L);
							
							//受注明細に対応する納入指示受領にデータが存在するかを調べる。
							MCList<MST_DLV_INST_RCPT_R> dlvInstRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
							MST_DLV_INST_RCPT_R dlvInstRcptL_t = MST_DLV_INST_RCPT_R.create("T");
							MCQueryApiBuilder dlvInstRcptL_bldr = MCQueryApiBuilder.create(dlvInstRcptL_t);
							dlvInstRcptL_bldr.setWhere(dlvInstRcptL_t.dlv_inst_rcpt_no.eq(bind("dlv_inst_rcpt_no")));
							dlvInstRcptL_bldr.addWhereWithAnd(dlvInstRcptL_t.can_flg.eq(value(false)));
							dbSelect("MSBBL6020_MST_DLV_INST_RCPT_S06", dlvInstRcptL, dlvInstRcptL_bldr, shipSchdL);

							//納入指示受領を削除するため、納入指示受領サービスの上り電文作成
							for (MST_DLV_INST_RCPT_R r : dlvInstRcptL) {
								MCList<MST_SHIP_SCHD_R> dlvInstshipSchdL = _cacheShipSchdL.subList(dlvInstshipSchdIdxkey, r.dlv_inst_rcpt_no());
								if (!canDelDlvInstRcpt(dlvInstshipSchdL, oldSloDR)) {
									continue;
								}
								DlvInstRcv_Upd01_DtlR dlvR = DlvInstRcv_Upd01_DtlR.create();
								dlvR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								dlvR.dlv_inst_rcpt_no(r.dlv_inst_rcpt_no());
								dlvR.dlv_inst_rcpt_rev(r.dlv_inst_rcpt_rev());
								dlvR.slo_d_no(dtlR.slo_d_no());
								dlvR.slo_upd_flg(true);
								opDlv.up0().add(dlvR);
							}
						}
						else {
							//上り電文（ShipPr_Dtl）の設定
							ShipPr_DtlR prR = ShipPr_DtlR.create();
							prR.peg_no(dtlR.peg_no());						
							prR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							prR.ship_pr_no(dtlR.ship_pr_no());
							prR.abort_flg(dtlR.abort_flg());
							prR.cred_no_up_flg(true);
							if (!dtlR.abort_flg() && oldSloDR.abort_flg()) {
								prR.trd_rmrks(hdrR.trd_rmrks());
							}
							prR.setAttributes(dtlR);
							op.up0().add(prR);

							//受注明細に対応する納入指示受領にデータが存在するかを調べる。
							MCList<MST_DLV_INST_RCPT_R> dlvInstRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
							MST_DLV_INST_RCPT_R dlvInstRcptL_t = MST_DLV_INST_RCPT_R.create("T");
							MCQueryApiBuilder dlvInstRcptL_bldr = MCQueryApiBuilder.create(dlvInstRcptL_t);
							dlvInstRcptL_bldr.setWhere(dlvInstRcptL_t.slo_d_no.eq(bind("1")), dtlR.slo_d_no());
							dlvInstRcptL_bldr.addWhereWithAnd(dlvInstRcptL_t.can_flg.eq(value(false)));
							dbSelect("MSBBL6020_MST_DLV_INST_RCPT_S02", dlvInstRcptL, dlvInstRcptL_bldr);

							//納入指示受領を削除するため、納入指示受領サービスの上り電文作成
							for (MST_DLV_INST_RCPT_R r : dlvInstRcptL) {
								DlvInstRcv_Upd01_DtlR dlvR = DlvInstRcv_Upd01_DtlR.create();
								dlvR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								dlvR.dlv_inst_rcpt_no(r.dlv_inst_rcpt_no());
								dlvR.dlv_inst_rcpt_rev(r.dlv_inst_rcpt_rev());
								dlvR.slo_d_no(dtlR.slo_d_no());
								dlvR.slo_upd_flg(true);
								opDlv.up0().add(dlvR);
							}
							//明細の打切を解除した場合に、出荷予定日や出荷引当状況を引当済に更新するため、出荷予定サービスを2回呼ぶ。
							if (!dtlR.abort_flg() && oldSloDR.abort_flg()) {
								if (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ())
										|| MAC_SLO_PROC_TYP.isALLOC(dtlR.proc_typ())
										|| MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())) {
									prR = ShipPr_DtlR.create();
									copy(prR, dtlR, createMap_Upd_ShipPr_DtlR_Slo_Upd01_DtlR(
											oldShipPrR, hdrR));
									prR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());								
									//引当結果を設定
									MCList<Srch_RsltR> allocLTwo = MCList.create(Srch_RsltR.class);
									allocLTwo = setAllocStsRslt(dtlR, hdrR);
									opTwo.up0().add(prR);
									for (Srch_RsltR alRstR : allocLTwo) {
										Alloc_RsltR alR = Alloc_RsltR.create();
										alR.alloc(alRstR);						
										if (alRstR.base_unit_qty().gt(0)) {
											alR.alloc_flg(true);
										}
										else {
											alR.alloc_flg(false);
										}
										opTwo.up1().add(alR);
									}
								}
							}
						}
					}
					else {
						//出荷予定の変更を伴う受注変更の場合のみ出荷予定を呼ぶ						
						if (isShipSchdChanged(hdrR, oldSloDR, oldShipPrR, dtlR)) {
							//売上集計基準日更新するかどうかのFLGを設定する
							if (!hdrR.cst_iv_flg() && !MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())){
								dtlR.setStringNE("SLO_SUM_BASE_DT_FLG", "1");
							}
							//仕入直送→仕入直送以外、仕入直送以外→仕入直送、或は在庫品→非在庫品に変更した場合,削除、新規で呼ぶ。そうでない場合、更新で呼ぶ
							if (isProcTypChanged(oldSloDR, dtlR) || isStkChanged(oldSloDR, dtlR)) {
								//出荷予定サービスの上り電文.ShipSchd_Dtlの削除レコードを作成する。
								//上り電文（ShipPr_Dtl）の設定
								ShipPr_DtlR prR = ShipPr_DtlR.create();
								prR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								prR.ship_pr_no(dtlR.ship_pr_no());
								prR.cred_no_up_flg(true);
								prR.setAttributes(dtlR);
								op.up0().add(prR);

								//受注明細に対応する納入指示受領にデータが存在するかを調べる。
								MCList<MST_DLV_INST_RCPT_R> dlvInstRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
								MST_DLV_INST_RCPT_R dlvInstRcptL_t = MST_DLV_INST_RCPT_R.create("T");
								MCQueryApiBuilder dlvInstRcptL_bldr = MCQueryApiBuilder.create(dlvInstRcptL_t);
								dlvInstRcptL_bldr.setWhere(dlvInstRcptL_t.slo_d_no.eq(bind("1")), dtlR.slo_d_no());
								dlvInstRcptL_bldr.addWhereWithAnd(dlvInstRcptL_t.can_flg.eq(value(false)));
								dbSelect("MSBBL6020_MST_DLV_INST_RCPT_S03", dlvInstRcptL, dlvInstRcptL_bldr);

								//納入指示受領を削除するため、納入指示受領サービスの上り電文作成
								for (MST_DLV_INST_RCPT_R r : dlvInstRcptL) {
									DlvInstRcv_Upd01_DtlR dlvR = DlvInstRcv_Upd01_DtlR.create();
									dlvR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									dlvR.dlv_inst_rcpt_no(r.dlv_inst_rcpt_no());
									dlvR.dlv_inst_rcpt_rev(r.dlv_inst_rcpt_rev());
									dlvR.slo_d_no(dtlR.slo_d_no());
									dlvR.slo_upd_flg(true);
									opDlv.up0().add(dlvR);
								}
								//新規の電文を作成
								//上り電文（ShipPr_Dtl）の設定
								prR = ShipPr_DtlR.create();
								copy(prR, dtlR, hdrR, createMap_ShipPr_DtlR_Slo_Upd01_DtlR());
								if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
									// 売上部門で、場所マスタから場所CDを取得する
									String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());
									//場所マスタからWG_CDを取得する。
									MAM_LOC_R midlocR = getLoc(midLocCd);
									prR.ship_fr_lg_grp_cd(midlocR.lg_grp_cd());
								}
								prR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								op.up0().add(prR);
								allocL = setAllocStsRslt(dtlR, hdrR);
							}
							else {
								//上り電文（ShipPr_Dtl）の設定
								ShipPr_DtlR prR = ShipPr_DtlR.create();
								copy(prR, dtlR, createMap_Upd_ShipPr_DtlR_Slo_Upd01_DtlR(
										oldShipPrR, hdrR));
								prR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								
								if (!MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ()) && !MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())){
									if (isNull(dtlR.data_crud_typ())) {
										prR.ship_term_cd_restore_flg(true);
										prR.ship_wk_cd_restore_flg(true);
									}
									else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
										if (isSame(oldSloDR.ship_term_cd(), dtlR.ship_term_cd())) {
											prR.ship_term_cd_restore_flg(true);
										}
										if (dtlR.not_dt_calc_flg()) {
											prR.ship_wk_cd_restore_flg(true);
										}
									}
								}
								
								if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
									// 売上部門で、場所マスタから場所CDを取得する
									String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(),
											hdrR.slo_dt());
									//場所マスタからWG_CDを取得する。
									MAM_LOC_R midlocR = getLoc(midLocCd);
									prR.ship_fr_lg_grp_cd(midlocR.lg_grp_cd());
								}
								op.up0().add(prR);
								//引当結果を設定
								allocL = setAllocStsRslt(dtlR, hdrR);

								//受注明細に対応する納入指示受領にデータが存在するかを調べる。
								MCList<MST_DLV_INST_RCPT_R> dlvInstRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
								MST_DLV_INST_RCPT_R dlvInstRcptL_t = MST_DLV_INST_RCPT_R.create("T");
								MCQueryApiBuilder dlvInstRcptL_bldr = MCQueryApiBuilder.create(dlvInstRcptL_t);
								dlvInstRcptL_bldr.setWhere(dlvInstRcptL_t.slo_d_no.eq(bind("1")), dtlR.slo_d_no());
								dlvInstRcptL_bldr.addWhereWithAnd(dlvInstRcptL_t.can_flg.eq(value(false)));
								dbSelect("MSBBL6020_MST_DLV_INST_RCPT_S04", dlvInstRcptL, dlvInstRcptL_bldr);

								//納入指示受領を削除するため、納入指示受領サービスの上り電文作成
								for (MST_DLV_INST_RCPT_R r : dlvInstRcptL) {
									MCList<MST_SHIP_SCHD_R> dlvInstshipSchdL = _cacheShipSchdL.subList(dlvInstshipSchdIdxkey, r.dlv_inst_rcpt_no());
									if (!canDelDlvInstRcpt(dlvInstshipSchdL, oldSloDR)) {
										if (dlvInstshipSchdL.groupBy(MST_SHIP_SCHD_R.$fix_flg).size() > 1) {
											MCMessage msg = new MCMessage(dtlR, null, MSBBL0646, r.dlv_inst_rcpt_no());
											msgL.add(msg);
										}
										continue;
									}
									DlvInstRcv_Upd01_DtlR dlvR = DlvInstRcv_Upd01_DtlR
											.create();
									dlvR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									dlvR.dlv_inst_rcpt_no(r.dlv_inst_rcpt_no());
									dlvR.dlv_inst_rcpt_rev(r.dlv_inst_rcpt_rev());
									dlvR.slo_d_no(dtlR.slo_d_no());
									dlvR.slo_upd_flg(true);
									opDlv.up0().add(dlvR);
								}
							}
						}
					}
				}
				else if (isNull(dtlR.data_crud_typ()) && isShipJudgeChanged(hdrR)) {
					for (MST_SHIP_SCHD_R r : _cacheShipSchdL.subList(shipSchdIdxkey, dtlR.ship_pr_no())) {
						ShipSchd_DtlR upR = ShipSchd_DtlR.create();
						upR.ship_schd_no(r.ship_schd_no());
						upR.ship_pr_no(r.ship_pr_no());
						upR.peg_no(dtlR.peg_no());
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						upR.not_dt_calc_flg(r.not_dt_calc_flg());
						upR.ship_judge_flg(true);
						upR.setAttributes(dtlR);
						opShipJudge.up1().add(upR);
					}
				}
				
				//上り電文（Alloc_Rslt）の設定
				if (!allocL.isEmpty()) {
					for (Srch_RsltR alRstR : allocL) {
						Alloc_RsltR alR = Alloc_RsltR.create();
						alR.alloc(alRstR);
						alR.alloc_scope_typ(alRstR.getStringNE("alloc_scope_typ"));
						if (alRstR.base_unit_qty().gt(0)) {
							alR.alloc_flg(true);
						}
						else {
							alR.alloc_flg(false);
						}
						if (!isSetStrLn(dtlR)) {
							alR.stk_str_ln_cd(MAC_STR.NULL_VAL.value());
						}
						op.up1().add(alR);
					}
				}
			}
			
			if (!msgL.isEmpty()) {
				MCAppException ex = new MCAppException(msgUpdErr());
				ex.addCauseMessageList(msgL);
				throw ex;
			}
			
			if (!op.up0().isEmpty()) {
				
				updSloPrms(op.up0());
				
				op.exec();
					
				//出荷予定サービス実行後の出荷進捗NOを取得し、リストに設定する。
				MCList<ShipPr_DtlR> dnL = op.down0();
				for (Slo_Upd01_DtlR dtlR : up1()) {
					//上り電文.受注明細.データ更新区分＝新規の場合、出荷予定サービスの上り電文の設定は新規登録と同じに設定。
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						ShipPr_DtlR dnR = dnL.subList(ShipPr_DtlR.$peg_no, dtlR.peg_no()).get(0);
						dtlR.ship_pr_no(dnR.ship_pr_no());
					}
				}
			}
			if (!opShipJudge.up1().isEmpty()) {
				updSloPrmsRemAbort(opShipJudge.up1());
				opShipJudge.exec();
			}
			
			if (!opTwo.up0().isEmpty()) {
				opTwo.exec();
			}
			
			if (!opDlv.up0().isEmpty()) {
				opDlv.exec();
			}

			if (!op.up0().isEmpty() || !opTwo.up0().isEmpty()) {
				
				for (Slo_Upd01_DtlR dtlR : up1()) {
					
					if (!op.up0().subList(ShipPr_DtlR.$peg_no, dtlR.peg_no()).isEmpty()
							|| !opTwo.up0().subList(ShipPr_DtlR.$peg_no, dtlR.peg_no()).isEmpty()) {
						// 出荷予定サービスを実行した明細かの目印をつける。
						dtlR.setBooleanNE("exec_ship_schd_service_flg", true);
					}
				}
			}
		}
		
		protected boolean canDelDlvInstRcpt(MCList<MST_SHIP_SCHD_R> shipSchdL, MST_SLO_D_R sloDR) {
			
			boolean deldlvInstRcpt = true;
			for (MST_SHIP_SCHD_R shipSchdR : shipSchdL) {
				if (shipSchdR.fix_flg() || isTrnst(shipSchdR, sloDR)) {
					deldlvInstRcpt = false;
					break;
				}
			}
			
			return deldlvInstRcpt;
		}
		
		protected boolean isTrnst(MST_SHIP_SCHD_R shipSchdR, MST_SLO_D_R sloDR) {
			
			return shipSchdR.ship_inst_qty().isPositive()
					|| shipSchdR.ship_act_qty().isPositive()
					|| (sloDR.sls_cststk_flg() && shipSchdR.sls_qty().isPositive())
					|| shipSchdR.iv_schd_qty().isPositive();
		}
		
		protected void checkShipLotForslsCststk(MCList<ShipSchd_DtlR> shipSchdL, MCList<Alloc_RsltR> allocRsltL, MST_SLO_D_R oldSloDR) {
			
			MSBEL_ShipLotChkService.ShipLotChk_Chk01 shipLotChk = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
			for (Alloc_RsltR allocRsltR : allocRsltL) {
				
				if (isNullOrNullVal(allocRsltR.lot_no()) && isNullOrNullVal(allocRsltR.sublot_no())) {
					continue;
				}
				
				ShipSchd_DtlR shipSchdR = shipSchdL.getFirst(ShipSchd_DtlR.$peg_no, allocRsltR.peg_no());
				
				if (!isNull(shipSchdR) && !isNull(shipSchdR.sls_act_d_no()) 
						&& (MAC_DATA_CRUD_TYP.isCRT(shipSchdR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(shipSchdR.data_crud_typ()))) {
						
					if (oldSloDR.sls_cststk_flg() && !isNull(shipSchdR.dlv_cd())) {
						ShipLot_DtlR lotR = ShipLot_DtlR.create();
						lotR.peg_no(shipSchdR.peg_no());
						lotR.cst_cd(oldSloDR.getStringNE("cst_cd"));
						lotR.dlv_cd(shipSchdR.dlv_cd());
						lotR.itm_cd(oldSloDR.itm_cd());
						lotR.itm_sub1(oldSloDR.itm_sub1());
						lotR.itm_sub2(oldSloDR.itm_sub2());
						lotR.itm_sub3(oldSloDR.itm_sub3());
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
		 * 出荷・供給依頼の更新ＦＬＧを返す。
		 * @param hdrR　受注ヘッダ
		 * @param dtlR 受注明細
		 * @param oldSloDR 変更前受注明細
		 * @return 更新ＦＬＧ
		 */
		protected boolean isUpdFlg(Slo_Upd01_HdrR hdrR, Slo_Upd01_DtlR dtlR, MST_SLO_D_R oldSloDR){
			
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				return false;
			}
			//手配区分が在庫引当に変わったらfalseとする。
			if (!isSame(dtlR.proc_typ(), oldSloDR.proc_typ()) && MAC_SLO_PROC_TYP.isALLOC(dtlR.proc_typ())) {
				return false;
			}
			
			//依頼元WG_CDが変わったら、trueとする。
			if (!isSame(hdrR.wg_cd(),_cacheSloR.wg_cd())){
				return true;
			}
			//依頼先場所はNULL→NOT　NULL、或はNOT　NULL→NULLに変更した場合、trueとする。
			if (!isNull(dtlR.rqst_to_loc_cd()) && isNull(oldSloDR.rqst_to_loc_cd())) {
				return true;
			}
			if (isNull(dtlR.rqst_to_loc_cd()) && !isNull(oldSloDR.rqst_to_loc_cd())) {
				return true;
			}
			//発注先はNULL→NOT　NULL、或はNOT　NULL→NULLに変更した場合、trueとする。
			if (!isNull(dtlR.sppl_cd()) && isNull(oldSloDR.sppl_cd())) {
				return true;
			}
			if (isNull(dtlR.sppl_cd()) && !isNull(oldSloDR.sppl_cd())) {
				return true;
			}
			if (!isSame(dtlR.itm_cd(), oldSloDR.itm_cd()) 
					|| !isSame(dtlR.itm_sub1(), oldSloDR.itm_sub1())
					|| !isSame(dtlR.itm_sub2(), oldSloDR.itm_sub2())
					|| !isSame(dtlR.itm_sub3(), oldSloDR.itm_sub3())){
				return true;
			}

			return false;
		}
		
		/**
		 * 確定された出荷予定の納期回答情報を取得する。
		 */
		protected void getFixSloPrmsL() {
			
			_fixSloPrmsL.addStringColumn("ship_pr_no");
			MCMainQuery q = get_MST_SLO_PRMS_S01_sql();
			q.executeQuery( _cacheSloR, _fixSloPrmsL);
		}
		
		/**
		 * 確定された出荷予定の納期回答数量を計算し、出荷予定サービスに渡す。<br>
		 * 未確定の納期回答情報を削除し、インフォメーションを出力する。
		 * @param shipPrDtlL 出荷予定サービスの上り電文
		 */
		protected void updSloPrms(MCList<ShipPr_DtlR> shipPrDtlL) {
			
			MCList<MST_SHIP_PR_R> abortDelSloDL = MCList.create(MST_SHIP_PR_R.class);
			MCList<MST_SLO_PRMS_R> fixSloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			
			MCIndexKey idxkey = _fixSloPrmsL.createIndex("ship_pr_no");
			
			for (ShipPr_DtlR shipPrDtlR : shipPrDtlL) {
				
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(shipPrDtlR.ship_pr_no());
				
				if (MAC_DATA_CRUD_TYP.isUPD(shipPrDtlR.data_crud_typ())) {
					
					MCList<MST_SLO_PRMS_R> sloPrmsL = _fixSloPrmsL.subList(idxkey, shipPrDtlR.ship_pr_no());
					MCDate maxPrmsDlvTm = (MCDate)sloPrmsL.max(MST_SLO_PRMS_R.$prms_dlv_tm);
					MCNumber prmsQty = sloPrmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty);
					
					if (!isNull(sloPrmsL) && !shipPrDtlR.abort_flg()) {
						
						shipPrDtlR.prms_dlv_dt(isSame(prmsQty, shipPrDtlR.base_unit_qty()) ? maxPrmsDlvTm : null);
						shipPrDtlR.prms_dt(oldShipPrR.prms_dt());
						shipPrDtlR.prms_qty(prmsQty);
						fixSloPrmsL.addAll(sloPrmsL);
					}
					else {
						shipPrDtlR.prms_dlv_dt(null);
						shipPrDtlR.prms_dt(null);
						shipPrDtlR.prms_qty(0);
					}
				}
				if ((MAC_DATA_CRUD_TYP.isUPD(shipPrDtlR.data_crud_typ()) && shipPrDtlR.abort_flg() && !oldShipPrR.abort_flg()) 
						|| MAC_DATA_CRUD_TYP.isDEL(shipPrDtlR.data_crud_typ())) {
					
					abortDelSloDL.add(oldShipPrR);
				}
			}
			
			MCList<MST_SLO_PRMS_R> notFixSloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			MCMainQuery q = get_MST_SLO_PRMS_S02_sql();
			q.executeQuery( _cacheSloR, notFixSloPrmsL);
			
			// 変更された受注明細の納期回答のみ削除
			MCList<MST_SLO_PRMS_R> delSloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			
			MCIndexKey sloPrmsIdxKey = notFixSloPrmsL.createIndex(MST_SLO_PRMS_R.$slo_d_no);
			MCIndexKey shipPrIdxKey = shipPrDtlL.createIndex(ShipPr_DtlR.$slo_d_no);
			for (MST_SLO_PRMS_R sloPrmsR : notFixSloPrmsL.groupBy(MST_SLO_PRMS_R.$slo_d_no)) {
				
				if (!shipPrDtlL.contains(shipPrIdxKey, sloPrmsR.slo_d_no())) {
					continue;
				}
				delSloPrmsL.addAll(notFixSloPrmsL.subList(sloPrmsIdxKey, sloPrmsR.slo_d_no()));
				Slo_Upd01_DtlR dtlR = up1().getFirst(Slo_Upd01_DtlR.$slo_d_no, sloPrmsR.slo_d_no());
				
				MCMessagePool.add(new MCMessage(dtlR, null, MSBBL0279, sloPrmsR.slo_d_no(), toDispGUIIndex(dtlR)));
			}

			if (!delSloPrmsL.isEmpty()) {
				delSloPrms(delSloPrmsL, fixSloPrmsL, shipPrDtlL);
			}

			if (!abortDelSloDL.isEmpty()) {
				// 打切または行削除する場合、納期回答をすべて削除する
				MCList<MST_SLO_PRMS_R> abortDelSloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
				abortDelSloPrmsL = delSloPrms(abortDelSloDL, null, null);

				if (!abortDelSloPrmsL.isEmpty()) {

					for (MST_SLO_PRMS_R sloPrmsR : abortDelSloPrmsL.groupBy(MST_SLO_PRMS_R.$slo_d_no)) {
						Slo_Upd01_DtlR dtlR = up1().getFirst(Slo_Upd01_DtlR.$slo_d_no, sloPrmsR.slo_d_no());
						MCMessagePool.add(new MCMessage(dtlR, null, MSBBL0279,
								sloPrmsR.slo_d_no(), toDispGUIIndex(dtlR)));
					}
				}
			}
		}
		protected MCList<MST_SLO_PRMS_R> delSloPrms(MCList<?> delSloPrmsL, 
				MCList<MST_SLO_PRMS_R> fixSloPrmsL, MCList<ShipPr_DtlR> shipPrDtlL) {
			
			MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			MST_SLO_PRMS_R sloPrms = MST_SLO_PRMS_R.create("T");
			MCQueryApiBuilder sloPrmsBldr = MCQueryApiBuilder.create(sloPrms);
			sloPrmsBldr.setWhere(sloPrms.slo_d_no.eq(bind("slo_d_no")));
			sloPrmsBldr.addWhereWithAnd(sloPrms.can_flg.eq(value(false)));
			dbSelect("MSBBL6020_MST_SLO_PRMS_S01", sloPrmsL, sloPrmsBldr, delSloPrmsL);
			
			MCList<MST_SLO_PRMS_R> updL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> delL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> updHL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> delHL = MCList.create(MST_SLO_PRMS_R.class);
			
			if(!isNull(shipPrDtlL)) {
				MCIndexKey delSloIdxkey = delSloPrmsL.createIndex("slo_d_no");
				MCIndexKey fixSloIdxkey = fixSloPrmsL.createIndex("slo_d_no");
				MCIndexKey delIdxkey = delSloPrmsL.createIndex("slo_prms_no");
				MCIndexKey fixIdxkey = fixSloPrmsL.createIndex("slo_prms_no");
				
				for (MCList<MST_SLO_PRMS_R> l : sloPrmsL.groupList("slo_d_no")) {
					boolean delFlg = false;
					boolean updFlg = false;
					
					if (delSloPrmsL.contains(delSloIdxkey, l.get(0).getString("slo_d_no"))) {
						delFlg = true;
					}
					if (fixSloPrmsL.contains(fixSloIdxkey, l.get(0).getString("slo_d_no"))) {
						updFlg = true;
					}
					
					if(delFlg && updFlg) {
						l.setNumber("slo_prms_rev", _sloPrmsRevMap.get(l.get(0).getString("slo_d_no")));
						updHL.addAll(l);
					}
					else {
						delHL.addAll(l);
					}
					for(MST_SLO_PRMS_R r : l) {
						if (delSloPrmsL.contains(delIdxkey, r.getString("slo_prms_no"))) {
							r.can_flg(true);
							delL.add(r);
						}
						if (fixSloPrmsL.contains(fixIdxkey, r.getString("slo_prms_no"))) {
							updL.add(r);
						}
					}
				}
			}
			else {
				sloPrmsL.setBoolean(MST_SLO_PRMS_R.$can_flg, true);
				delL.addAll(sloPrmsL);
				delHL.addAll(sloPrmsL);
			}
			
			if (!updL.isEmpty()) {
				MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
				execDbUpdate("MSBBL6020_MST_SLO_PRMS_U01", dbc, updL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
				updSloPrmsPR(updL);
			}
			if (!delL.isEmpty()) {
				MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
				execDbUpdate("MSBBL6020_MST_SLO_PRMS_U02", dbc, delL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
				updSloPrmsPR(delL);
			}
			
			MCList<MST_SLO_PRMS_H_R> updSloPrmsHL = MCList.create(MST_SLO_PRMS_H_R.class);
			MST_SLO_PRMS_H_R updSloPrmsH = MST_SLO_PRMS_H_R.create("SLOPRMSH");
			MCQueryApiBuilder updSloPrmsHBldr = MCQueryApiBuilder.create(updSloPrmsH);
			updSloPrmsHBldr.setWhere(updSloPrmsH.slo_prms_h_no.eq(bind("slo_prms_h_no")));
			updSloPrmsHBldr.addWhereWithAnd(updSloPrmsH.can_flg.eq(value(false)));
			dbSelect("MSBBL6020_MST_SLO_PRMS_H_S01", updSloPrmsHL, updSloPrmsHBldr, updHL);
			MCIndexKey prmsIdxkey = updHL.createIndex(MST_SLO_PRMS_H_R.$slo_prms_h_no);
			
			MCList<MST_SLO_PRMS_H_R> delSloPrmsHL = MCList.create(MST_SLO_PRMS_H_R.class);
			MST_SLO_PRMS_H_R delSloPrmsH = MST_SLO_PRMS_H_R.create("SLOPRMSH");
			MCQueryApiBuilder delSloPrmsHBldr = MCQueryApiBuilder.create(delSloPrmsH);
			delSloPrmsHBldr.setWhere(delSloPrmsH.slo_prms_h_no.eq(bind("slo_prms_h_no")));
			delSloPrmsHBldr.addWhereWithAnd(delSloPrmsH.can_flg.eq(value(false)));
			dbSelect("MSBBL6020_MST_SLO_PRMS_H_S02", delSloPrmsHL, delSloPrmsHBldr, delHL);
			
			if (!updSloPrmsHL.isEmpty()) {
				for(MST_SLO_PRMS_H_R sloPrmsHR : updSloPrmsHL) {
					sloPrmsHR.slo_prms_rev(updHL.getFirst(prmsIdxkey, sloPrmsHR.slo_prms_h_no()).slo_prms_rev());
				}
				dbUpdateKey("MSBBL6020_MST_SLO_PRMS_H_U01", updSloPrmsHL, updSloPrmsHBldr);
			}
			
			if (!delSloPrmsHL.isEmpty()) {
				delSloPrmsHL.setBoolean(MST_SLO_PRMS_H_R.$can_flg, true);
				dbUpdateKey("MSBBL6020_MST_SLO_PRMS_H_U02", delSloPrmsHL, delSloPrmsHBldr);
			}
			
			return delL;
		}
		
		protected void updSloPrmsRemAbort(MCList<ShipSchd_DtlR> shipSchdDtlL) {
			MCList<MST_SLO_PRMS_R> updL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> delL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIPPR");
			MCQueryApiBuilder shipPrRBldr = MCQueryApiBuilder.create(shipPr);
			MCList<ShipSchd_DtlR> shipSchdL = shipSchdDtlL.subList(r -> r.abort_flg() && !isNull(r.slo_prms_no()));
			MCIndexKey shipSchdIdxkey = shipSchdL.createIndex(MST_SLO_PRMS_R.$slo_prms_no);
			MCIndexKey schdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$slo_prms_no);
			
			MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			MCMainQuery q = get_MST_SLO_PRMS_S03_sql();
			q.executeQuery( _cacheSloR, sloPrmsL);
			MCIndexKey idxkey = sloPrmsL.createIndex("ship_pr_no");

			for(ShipSchd_DtlR shipSchdR : shipSchdL.groupBy(ShipSchd_DtlR.$ship_pr_no)) {
				
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(shipSchdR.ship_pr_no());
				MST_SLO_D_R oldSloDR = getFirstSloDCache(oldShipPrR.slo_d_no());
				MST_SHIP_PR_R shipPrR = oldShipPrR.clone();
				MCList<MST_SLO_PRMS_R> sloPrmsGrpL = sloPrmsL.subList(idxkey, shipSchdR.ship_pr_no());
				MCNumber prmsQty = sloPrmsGrpL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty);
				boolean delFlg = false;
				
				for(MST_SLO_PRMS_R r : sloPrmsGrpL) {
					
					//キャッシュから対応する更新前の出荷予定を取得する。
					MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(schdIdxkey, r.slo_prms_no());
					
					boolean afterExeFlg = false;
					for (MST_SHIP_SCHD_R oldShipSchdR : oldShipSchdL) {
						
						if (oldShipSchdR.ship_inst_qty().isPositive()
								|| oldShipSchdR.ship_act_qty().isPositive()
								|| (oldSloDR.sls_cststk_flg() && oldShipSchdR.sls_qty().isPositive())
								|| oldShipSchdR.iv_schd_qty().isPositive()) {
							
							afterExeFlg = true;
							break;
						}
					}
					
					if (oldShipSchdL.size() > 1 && afterExeFlg) {
						continue;
					}
					
					delFlg = true;
					if (!shipSchdL.contains(shipSchdIdxkey, r.slo_prms_no())) {
						r.slo_prms_rev(_sloPrmsRevMap.get(r.slo_d_no()));
						updL.add(r);
					}
					else {
						r.can_flg(true);
						delL.add(r);
					}
				}
				
				MCNumber abortPrmsQty = delL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty);
				shipPrR.prms_dlv_dt(null);
				shipPrR.prms_qty(prmsQty.subtract(abortPrmsQty));
				
				shipPrL.add(shipPrR);
				
				if(delFlg) {
					Slo_Upd01_DtlR dtlR = up1().getFirst(Slo_Upd01_DtlR.$slo_d_no, shipPrR.slo_d_no());
					MCMessagePool.add(new MCMessage(dtlR, null, MSBBL0279, dtlR.slo_d_no(), toDispGUIIndex(dtlR)));
				}
			}
			
			if (!updL.isEmpty()) {
				MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
				execDbUpdate("MSBBL6020_MST_SLO_PRMS_U03", dbc, updL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
				// 改訂履歴データ更新サービス呼出（受注納期回答改訂履歴テーブル更新）
				updSloPrmsPR(updL);
			}
			
			if (!delL.isEmpty()) {
				MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
				execDbUpdate("MSBBL6020_MST_SLO_PRMS_U04", dbc, delL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
			}
			
			if (!updL.isEmpty()) {
				MCList<MST_SLO_PRMS_H_R> sloPrmsHL = MCList.create(MST_SLO_PRMS_H_R.class);
				MST_SLO_PRMS_H_R sloPrmsH = MST_SLO_PRMS_H_R.create("SLOPRMSH");
				MCQueryApiBuilder sloPrmsHBldr = MCQueryApiBuilder.create(sloPrmsH);
				sloPrmsHBldr.setWhere(sloPrmsH.slo_prms_h_no.eq(bind("slo_prms_h_no")));
				sloPrmsHBldr.addWhereWithAnd(sloPrmsH.can_flg.eq(value(false)));
				dbSelect("MSBBL6020_MST_SLO_PRMS_H_S03", sloPrmsHL, sloPrmsHBldr, updL);
				MCIndexKey prmsIdxkey = updL.createIndex(MST_SLO_PRMS_H_R.$slo_prms_h_no);
				
				for(MST_SLO_PRMS_H_R sloPrmsHR : sloPrmsHL) {
					sloPrmsHR.slo_prms_rev(updL.getFirst(prmsIdxkey, sloPrmsHR.slo_prms_h_no()).slo_prms_rev());
				}
				dbUpdateKey("MSBBL6020_MST_SLO_PRMS_H_U03", sloPrmsHL, sloPrmsHBldr);
				
				dbUpdateKey("MSBBL6020_MST_SHIP_PR_U03", shipPrL, shipPrRBldr);
			}
		}
		
		
		protected void updSloPrmsPR(MCList<MST_SLO_PRMS_R> sloPrmsL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_SLO_PRMS_R r : sloPrmsL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.slo_prms_no());
				opeR.rev_no(r.slo_prms_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO_PRMS.value());
				ope.up0().add(opeR);
				ope.exec();
			}
		}
		
		public MCMainQuery get_MST_SLO_PRMS_S03_sql() {
			MST_SLO_PRMS_R S0T1 = MST_SLO_PRMS_R.create("T1");
			MST_SHIP_SCHD_R S0T2 = MST_SHIP_SCHD_R.create("T2");
			MST_SHIP_PR_R S0T3 = MST_SHIP_PR_R.create("T3");
			
			MCMainQuery q = sql("MSBBL6020_MST_SLO_PRMS_S04")
				.mainQuery()
				.selectDistinct(
					S0T3.ship_pr_no,
					S0T1.slo_prms_no,
					S0T1.slo_prms_rev,
					S0T1.slo_no,
					S0T1.slo_d_no,
					S0T1.dlv_inst_rcpt_no,
					S0T1.prms_dlv_tm,
					S0T1.trd_unit_prms_qty,
					S0T1.base_unit_prms_qty,
					S0T1.prms_rmrks,
					S0T1.intr_rmrks,
					S0T1.slo_prms_h_no,
					S0T1.can_flg,
					S0T1.sub_char1,
					S0T1.sub_char2,
					S0T1.sub_char3
				)
				.from(
					S0T1
					.innerJoin(S0T2).on(S0T2.slo_prms_no.eq(S0T1.slo_prms_no))
					.innerJoin(S0T3).on(S0T2.ship_pr_no.eq(S0T3.ship_pr_no))
				)
				.where(
					value(0).eq(value(0))
					.and(S0T1.slo_no.eq(bind("slo_no")))
				);
			return q;
		}
		protected MCNumber getSloPrmsRev(Slo_Upd01_DtlR dtlR) {
			
			MST_SLO_PRMS_R sloPrmsR = MST_SLO_PRMS_R.create();
			executeQuery(sloPrmsR, MSBBL6020_MST_SLO_PRMS_S01(), dtlR);
			MCNumber maxRev = nvl(sloPrmsR.slo_prms_rev(), MCNumber.ZERO);
			maxRev = maxRev.add(1);
			return maxRev;
		}
		/**
		 * 受注納期回答改訂番号を設定する。
		 */
		protected void setSloPrmsRev(MCList<Slo_Upd01_DtlR> dtlL) {
			_sloPrmsRevMap = new HashMap<String, MCNumber>();
			MCIndexKey idxkey = _fixSloPrmsL.createIndex("ship_pr_no");
			
			for (Slo_Upd01_DtlR dtlR : dtlL) {
				MST_SLO_PRMS_R sloPrmsR = _fixSloPrmsL.getFirst(idxkey, dtlR.ship_pr_no());
				
				if ((dtlR.abort_flg() && dtlR.rem_abort_flg()) || (!isNull(sloPrmsR) && !dtlR.abort_flg())) {
					MCNumber sloPrmsRev = getSloPrmsRev(dtlR);
					_sloPrmsRevMap.put(dtlR.slo_d_no(), sloPrmsRev);
				}
			}
		}
		
		/**
		 * 売上済の出荷引当状況を取得する。
		 * @return 出荷引当状況
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> getSlsActAllocSts(MST_SLO_D_R oldSloDR, MST_SHIP_PR_R oldShipPR) {
			
			MCList<MST_SHIP_ALLOC_STS_R> slsActShipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			
			if (!oldSloDR.can_flg()) {
				MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
				MCQueryApiBuilder slsActShipAllocStsL_bldr = MCQueryApiBuilder.create(t);
				MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				slsActShipAllocStsL_bldr.addSelect(t2.ship_fr_lg_grp_cd);
				slsActShipAllocStsL_bldr.addSelect(t2.sls_act_d_no);
				slsActShipAllocStsL_bldr.setWhere(t2.ship_pr_no.eq(bind("1")), oldShipPR.ship_pr_no());
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.sls_act_d_no.isNotNull());
				slsActShipAllocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(false)));
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.ship_inst_qty.eq(value(0)));
				slsActShipAllocStsL_bldr.addWhereWithAnd(t2.ship_act_qty.eq(value(0)));
				slsActShipAllocStsL_bldr.addInnerJoin(t2, t2.ship_schd_no.eq(t.ship_schd_no));
				slsActShipAllocStsL_bldr.addLeftOuterJoin(m1, m1.loc_cd.eq(t.ship_loc_cd));
				dbSelect("MSBBL6020_MST_SHIP_ALLOC_STS_S03", slsActShipAllocStsL, slsActShipAllocStsL_bldr);
			}
			
			return slsActShipAllocStsL;
		}
		/**
		 * 変更なし出荷引当状況を返す。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @return 出荷引当状況リスト
		 */
		protected MCList<Alloc_RsltR> getNoChngAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL, MST_SLO_D_R oldSloDR, MST_SHIP_PR_R oldShipPR) {
			
			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);
			
			MCList<MST_SHIP_ALLOC_STS_R> allocStsL = getAllocSts(oldSloDR, oldShipPR);
			
			MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsL = allocStsL.createInstance();
			MCList<MST_SHIP_ALLOC_STS_R> shipSchdAllocStsL = allocStsL.createInstance();
			
			for (MST_SHIP_ALLOC_STS_R allocStsR: allocStsL) {
				if (!isNull(allocStsR.getStringNE("sls_act_d_no"))) {
					slsActAllocStsL.add(allocStsR.clone());
				}
				else {
					shipSchdAllocStsL.add(allocStsR.clone());
				}
			}
			
			if (!slsActAllocStsL.isEmpty()) {
				allocRsltL.addAll(getSlsActAllocSts(shipSchdDtlL, slsActAllocStsL, oldSloDR));
			}
			
			if (!shipSchdAllocStsL.isEmpty()) {
				allocRsltL.addAll(getShipSchdAllocSts(shipSchdDtlL, shipSchdAllocStsL, oldSloDR));
			}
			
			MCGroupByPolicy policy = new MCGroupByPolicy(getAllocGrpItm());
			policy.sum(Alloc_RsltR.$pack_unit_qty,
					Alloc_RsltR.$base_unit_qty);
			
			return allocRsltL.groupBy(policy);
		}
		
		protected MCList<MST_SHIP_ALLOC_STS_R> getAllocSts(MST_SLO_D_R oldSloDR, MST_SHIP_PR_R oldShipPR) {
			
			MCList<MST_SHIP_ALLOC_STS_R> allocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			
			if (!oldSloDR.can_flg()) {
				MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
				MCQueryApiBuilder allocStsL_bldr = MCQueryApiBuilder.create(t);
				MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				allocStsL_bldr.addSelect(t2.ship_fr_lg_grp_cd);
				allocStsL_bldr.addSelect(t2.sls_act_d_no);
				allocStsL_bldr.setWhere(t2.ship_pr_no.eq(bind("1")), oldShipPR.ship_pr_no());
				allocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(true)));
				allocStsL_bldr.addWhereWithAnd(t2.ship_inst_qty.eq(value(0)));
				allocStsL_bldr.addWhereWithAnd(t2.ship_act_qty.eq(value(0)));
				allocStsL_bldr.addInnerJoin(t2, t2.ship_schd_no.eq(t.ship_schd_no));
				allocStsL_bldr.addLeftOuterJoin(m1, m1.loc_cd.eq(t.ship_loc_cd));
				dbSelect("MSBBL6020_MST_SHIP_ALLOC_STS_S04", allocStsL, allocStsL_bldr);
			}
			
			return allocStsL;
		}
		
		protected MCList<Alloc_RsltR> getSlsActAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL, MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsL, MST_SLO_D_R oldSloDR) {
			
			slsActAllocStsL.sort(SortType.ASC,
					MST_SHIP_ALLOC_STS_R.$vld_dt_fr, 
					MST_SHIP_ALLOC_STS_R.$vld_dt_to,
					MST_SHIP_ALLOC_STS_R.$lot_no);
			
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
				
				for (MST_SHIP_ALLOC_STS_R allocStsR : slsActAllocStsL) {
					
					if (allocStsR.base_unit_qty().isZero()) {
						continue;
					}
					
					if (shipSchdQty.isZero()) {
						break;
					}
					
					allocRsltR = Alloc_RsltR.create();
					copy(allocRsltR, allocStsR, createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
					allocRsltR.peg_no(shipSchdDtlR.peg_no());
					
					if (shipSchdQty.gte(allocStsR.base_unit_qty())) {
						
						shipSchdQty = shipSchdQty.subtract(allocStsR.base_unit_qty());
						allocStsR.trd_unit_qty(MCNumber.ZERO);
						allocStsR.base_unit_qty(MCNumber.ZERO);
					}
					else {
						
						allocRsltR.base_unit_qty(shipSchdQty);
						
						if (!isSame(allocRsltR.pack_unit_cd(), allocRsltR.base_unit_cd())) {
							
							MAVM_ITM_UNIT_R packItmUnitR = getItmUnit(
									oldSloDR.itm_cd(), 
									oldSloDR.itm_sub1(), 
									oldSloDR.itm_sub2(), 
									oldSloDR.itm_sub3(), 
									allocRsltR.pack_unit_cd());
							
							MCNumber packUnitQty = rvrsBaseUnitConv(
									allocRsltR.base_unit_qty(), 
									packItmUnitR.conv_base_qty(), 
									packItmUnitR.conv_qty(), 
									packItmUnitR.dec_place(), 
									packItmUnitR.rnd_typ(), 
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
						
						allocStsR.base_unit_qty(allocStsR.base_unit_qty().subtract(allocRsltR.base_unit_qty()));
						allocStsR.pack_unit_qty(allocStsR.pack_unit_qty().subtract(allocRsltR.pack_unit_qty()));
						
						shipSchdQty = MCNumber.ZERO;
					}
					
					allocRsltL.add(allocRsltR);
				}
			}
			
			allocRsltL.setValueNE(Alloc_RsltR.$itm_cd, oldSloDR.itm_cd());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub1, oldSloDR.itm_sub1());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub2, oldSloDR.itm_sub2());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub3, oldSloDR.itm_sub3());
			
			return allocRsltL;
		}
		
		protected MCList<Alloc_RsltR> getShipSchdAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL, MCList<MST_SHIP_ALLOC_STS_R> shipSchdAllocStsL, MST_SLO_D_R oldSloDR) {
			
			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);
			
			MCList<Alloc_RsltR> subAllocRsltL = null;
			
			MCIndexKey idxkey = _allocResultL.createIndex(Srch_RsltR.$peg_no);
			for (ShipSchd_DtlR shipSchdDtlR : shipSchdDtlL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(shipSchdDtlR.data_crud_typ()) 
						|| !isNull(shipSchdDtlR.sls_act_d_no())
						|| _allocResultL.contains(idxkey, shipSchdDtlR.peg_no())) {
					continue;
				}
				
				subAllocRsltL = MCList.create(Alloc_RsltR.class);
				
				setAll(subAllocRsltL, 
						shipSchdAllocStsL.subList(MST_SHIP_ALLOC_STS_R.$ship_schd_no, shipSchdDtlR.ship_schd_no()), 
						createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
				subAllocRsltL.setValueNE(Alloc_RsltR.$peg_no, shipSchdDtlR.peg_no());
				
				allocRsltL.addAll(subAllocRsltL);
			}
			
			allocRsltL.setValueNE(Alloc_RsltR.$itm_cd, oldSloDR.itm_cd());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub1, oldSloDR.itm_sub1());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub2, oldSloDR.itm_sub2());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub3, oldSloDR.itm_sub3());
			
			return allocRsltL;
		}
		
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			
			MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
			MCQueryApiBuilder itmUnitR_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			itmUnitR.itm_cd(itmCd);
			itmUnitR.itm_sub1(itmSub1);
			itmUnitR.itm_sub2(itmSub2);
			itmUnitR.itm_sub3(itmSub3);
			itmUnitR.unit_cd(unitCd);
			
			dbSelectKey("MSBBL6020_MAVM_ITM_UNIT_S01", itmUnitR, itmUnitR_bldr, itmUnitR);
			
			return itmUnitR;
		}
		
		/**
		 * 出荷引当状況の集計項目を返す。
		 * @return　出荷引当状況の集計項目
		 */
		protected String[] getAllocGrpItm() {
			
			return new String [] {
					Alloc_RsltR.$peg_no,
					Alloc_RsltR.$itm_cd,
					Alloc_RsltR.$itm_sub1,
					Alloc_RsltR.$itm_sub2,
					Alloc_RsltR.$itm_sub3,
					Alloc_RsltR.$stk_loc_cd,
					Alloc_RsltR.$stk_str_ln_cd,
					Alloc_RsltR.$stk_lg_grp_cd,
					Alloc_RsltR.$quality_typ,
					Alloc_RsltR.$stk_insp_typ,
					Alloc_RsltR.$stk_id_typ,
					Alloc_RsltR.$stk_arrv_bp_cd,
					Alloc_RsltR.$stk_bp_cd,
					Alloc_RsltR.$gd_cd,
					Alloc_RsltR.$lot_no,
					Alloc_RsltR.$sublot_no,
					Alloc_RsltR.$sno1,
					Alloc_RsltR.$sno2,
					Alloc_RsltR.$sno3,
					Alloc_RsltR.$sno4,
					Alloc_RsltR.$ver_no,
					Alloc_RsltR.$pack_unit_cd,
					Alloc_RsltR.$base_unit_cd,
					Alloc_RsltR.$vld_dt_fr,
					Alloc_RsltR.$vld_dt_to,
					Alloc_RsltR.$alloc_flg,
					Alloc_RsltR.$alloc_wait_flg,
					Alloc_RsltR.$alloc_scope_typ,
					Alloc_RsltR.$ent_unit_cd };
		}
		/**
		 * 出荷・供給依頼処理を呼び出す。
		 * 
		 * @param hdrR 受注ヘッダ
		 * @param canFlg 取消のみ実行する場合に、trueを設定する
		 */
		protected void callShipDmndRqstService(Slo_Upd01_HdrR hdrR, boolean canFlg) {
			
			//出荷・供給依頼サービス.出荷・供給依頼登録（MSBAL5130.ShipDmndRqst_Upd01）を実行し、出荷回答依頼、移送依頼、購買依頼を作成する。
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd01 op = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd01();
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Chk01 opChk = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Chk01();
			for (Slo_Upd01_DtlR dtlR : up1()) {
				if (isRqstDel(dtlR, hdrR, _cacheSloR)) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());	
					//キャッシュから対応する更新前の出荷進捗を取得する。
					MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());	
					// 品目詳細マスタのチェック時に使用する
					oldSloDR.addDateColumn("ship_schd_tm", oldShipPrR.ship_schd_tm());
					String oldRqstWgCd = "";
					//仕入直送の場合
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())) {
						//仕入直送の場合、売上部門で、場所マスタから場所CDを取得する
						String midLocCd = MSUCL_SlsUtil.getMidLocCd(_cacheSloR.sls_dpt_cd(), _cacheSloR.slo_dt());
						//場所マスタからWG_CDを取得する。
						MAM_LOC_R midlocR = getLoc(midLocCd);
						if (isSame(_sysParm, "1")) {
							oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR, midlocR.wg_cd());
						} else {
							oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR, midlocR.wg_cd(), _cacheSloR.sls_dpt_cd());
						}
						if (isSame(oldRqstWgCd, "") || isNull(oldRqstWgCd)) {
							oldRqstWgCd = midlocR.wg_cd();
						}

						ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
						//データ更新区分
						rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						//紐付け番号
						rqstR.peg_no(dtlR.peg_no());
						//ＷＧ間依頼種類区分
						rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
						//ＷＧ間依頼作成元区分
						rqstR.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.SLO.value());
						//ＷＧ間依頼元識別ＮＯ
						rqstR.wg_rqst_src_no(oldSloDR.slo_d_no());
						rqstR.slo_d_no(oldSloDR.slo_d_no());
						//依頼元ワーキンググループＣＤ
						rqstR.rqst_fr_wg_cd(_cacheSloR.wg_cd());
						//依頼先ワーキンググループＣＤ
						rqstR.rqst_to_wg_cd(oldRqstWgCd);
						rqstR.cred_no_up_flg(true);
						//納品先CD
						rqstR.dlv_cd(oldSloDR.dlv_cd());
						//依頼先場所ＣＤ
						rqstR.gi_loc_cd(oldSloDR.rqst_to_loc_cd());
						//発注先ＣＤ
						rqstR.sppl_cd(oldSloDR.sppl_cd());
						//メーカＣＤ
						rqstR.maker_cd(oldSloDR.maker_cd());
						rqstR.gr_loc_cd(midLocCd); //入庫場所ＣＤ
						rqstR.gr_rqst_tm(oldSloDR.dlv_rqst_tm()); //入庫依頼日時
						rqstR.avl_schd_dt(oldSloDR.dlv_rqst_tm()); //使用可能予定日
						rqstR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
						rqstR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
						rqstR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
						rqstR.itm_sub3(oldSloDR.itm_sub3()); //枝番３
						//得意先CD			
						rqstR.cst_cd(_cacheSloR.cst_cd());
						//依頼元部門
						rqstR.rqst_fr_dpt_cd(_cacheSloR.sls_dpt_cd());
						rqstR.setAttributes(dtlR);
						op.up0().add(rqstR);
						ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
						copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
						rqstChkR.upd_flg(isUpdFlg(hdrR, dtlR, oldSloDR));
						opChk.up0().add(rqstChkR);
					}
					else {
						//明細の場所、或は通常場所のWG_CDを取得
						MAM_LOC_R locR = getLoc(nvl(oldSloDR.loc_cd(), oldSloDR.def_loc_cd()));
						oldRqstWgCd = locR.wg_cd();

						//手配区分が「手配依頼」の場合、
						if (MAC_SLO_PROC_TYP.isPROC(oldSloDR.proc_typ())) {
							ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
							//データ更新区分
							rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							//紐付け番号
							rqstR.peg_no(dtlR.peg_no());
							String oldfrWgCd = oldRqstWgCd;
							//購買依頼の場合
							if (!isNull(oldSloDR.sppl_cd())) {
								if (isSame(_sysParm, "1")) {
									oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR, oldfrWgCd);
								} else {
									oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR, oldfrWgCd, _cacheSloR.sls_dpt_cd());
								}
								//ＷＧ間依頼種類区分
								rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
								if (isSame(oldRqstWgCd, "") || isNull(oldRqstWgCd)) {
									oldRqstWgCd = oldfrWgCd;
								}
							}
							//移送依頼の場合
							if (!isNull(oldSloDR.rqst_to_loc_cd())) {
								MAM_LOC_R rqstToLoc = getLoc(oldSloDR.rqst_to_loc_cd());
								oldRqstWgCd = rqstToLoc.wg_cd();
								rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
								rqstR.gr_rqst_tm(oldShipPrR.ship_schd_tm()); //入庫依頼日時
							}
							
							//ＷＧ間依頼作成元区分
							rqstR.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.SLO.value());
							//ＷＧ間依頼元識別ＮＯ
							rqstR.wg_rqst_src_no(oldSloDR.slo_d_no());
							rqstR.slo_d_no(oldSloDR.slo_d_no());
							//依頼元ワーキンググループＣＤ
							rqstR.rqst_fr_wg_cd(_cacheSloR.wg_cd());
							//依頼先ワーキンググループＣＤ
							rqstR.rqst_to_wg_cd(oldRqstWgCd);
							rqstR.cred_no_up_flg(true);
							//依頼先場所ＣＤ
							rqstR.gi_loc_cd(oldSloDR.rqst_to_loc_cd());
							//発注先ＣＤ
							rqstR.sppl_cd(oldSloDR.sppl_cd());
							//メーカＣＤ
							rqstR.maker_cd(oldSloDR.maker_cd());
							rqstR.gr_loc_cd(nvl(oldSloDR.loc_cd(), oldSloDR.def_loc_cd())); //入庫場所ＣＤ
							rqstR.avl_schd_dt(oldShipPrR.ship_schd_tm()); //使用可能予定日
							rqstR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
							rqstR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
							rqstR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
							rqstR.itm_sub3(oldSloDR.itm_sub3()); //枝番３
							//依頼元部門
							rqstR.rqst_fr_dpt_cd(_cacheSloR.sls_dpt_cd());
							rqstR.setAttributes(dtlR);
							
							op.up0().add(rqstR);
							ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
							copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
							rqstChkR.upd_flg(isUpdFlg(hdrR, dtlR, oldSloDR));
							opChk.up0().add(rqstChkR);
						}
						//手配区分が「引当後手配」の場合、引当後在庫不足が存在する場合のみ作成
						if (MAC_SLO_PROC_TYP.isALLOC_PROC(oldSloDR.proc_typ())) {
							//更新前の依頼数を取得
							MCNumber notAlcQty = oldSloDR.rqst_qty();
							if (isNull(notAlcQty)){
								notAlcQty = MCNumber.ZERO;
							}
							if (notAlcQty.isPositive()) {
								ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
								//データ更新区分
								rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								//紐付け番号
								rqstR.peg_no(dtlR.peg_no());
								String oldfrWgCd = oldRqstWgCd;
								//購買依頼の場合
								if (!isNull(oldSloDR.sppl_cd())) {
									if (isSame(_sysParm, "1")) {
										oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR, oldfrWgCd);
									} else {
										oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR, oldfrWgCd, _cacheSloR.sls_dpt_cd());
									}
									//ＷＧ間依頼種類区分
									rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
									if (isSame(oldRqstWgCd, "") || isNull(oldRqstWgCd)) {
										oldRqstWgCd = oldfrWgCd;
									}
								}
								//移送依頼の場合
								if (!isNull(oldSloDR.rqst_to_loc_cd())) {
									MAM_LOC_R rqstLoc = getLoc(oldSloDR.rqst_to_loc_cd());
									oldRqstWgCd = rqstLoc.wg_cd();
									rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
									rqstR.gr_rqst_tm(oldShipPrR.ship_schd_tm()); //入庫依頼日時
								}
								//ＷＧ間依頼作成元区分
								rqstR.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.SLO.value());
								//ＷＧ間依頼元識別ＮＯ
								rqstR.wg_rqst_src_no(oldSloDR.slo_d_no());
								rqstR.slo_d_no(oldSloDR.slo_d_no());
								//依頼元ワーキンググループＣＤ
								rqstR.rqst_fr_wg_cd(_cacheSloR.wg_cd());
								//依頼先ワーキンググループＣＤ
								rqstR.rqst_to_wg_cd(oldRqstWgCd);
								rqstR.cred_no_up_flg(true);
								//依頼先場所ＣＤ
								rqstR.gi_loc_cd(oldSloDR.rqst_to_loc_cd());
								//発注先ＣＤ
								rqstR.sppl_cd(oldSloDR.sppl_cd());
								//メーカＣＤ
								rqstR.maker_cd(oldSloDR.maker_cd());
								rqstR.gr_loc_cd(nvl(oldSloDR.loc_cd(), oldSloDR.def_loc_cd())); //入庫場所ＣＤ
								rqstR.avl_schd_dt(oldShipPrR.ship_schd_tm()); //使用可能予定日
								rqstR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
								rqstR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
								rqstR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
								rqstR.itm_sub3(oldSloDR.itm_sub3()); //枝番３								
								//依頼元部門
								rqstR.rqst_fr_dpt_cd(_cacheSloR.sls_dpt_cd());
								rqstR.setAttributes(dtlR);
								
								op.up0().add(rqstR);
								ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
								copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
								rqstChkR.upd_flg(isUpdFlg(hdrR, dtlR, oldSloDR));
								opChk.up0().add(rqstChkR);
							}
						}
					}
				}

				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
						|| ((MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) || isNull(dtlR.data_crud_typ()))
								&& isRqstDel(dtlR, hdrR, _cacheSloR))
						|| ((MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) || isNull(dtlR.data_crud_typ()))
								&& !isRqstDel(dtlR, hdrR, _cacheSloR) && isRqstUpdate(hdrR, dtlR))) {	
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());	
					
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {	
						//売上集計基準日更新するかどうかのFLGを設定する						
						dtlR.setStringNE("SLO_SUM_BASE_DT_FLG", "1");
						
						//仕入直送の場合、発注先、仕入直送の中継場所を取得する						
						//売上部門で、場所マスタから場所CDを取得し
						String midLocCd = MSUCL_SlsUtil.getMidLocCd(hdrR.sls_dpt_cd(), hdrR.slo_dt());	
						//手配区分が「仕入直送」の場合、購買依頼の作成のための上り電文の作成。
						ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
						copy(rqstR, dtlR, createMap_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR(hdrR, _cacheSloR));
						rqstR.gr_loc_cd(midLocCd); //中継場所で設定する。
						rqstR.gr_str_ln_cd(null);
						dtlR.rqst_dt(rqstR.rqst_dt());//運用日付で設定
						dtlR.rqst_dlv_rqst_dt(rqstR.gr_rqst_tm()); //出荷予定日で設定する。							
						dtlR.rqst_qty(rqstR.trd_unit_qty());
						dtlR.rqst_unit_cd(rqstR.trd_unit_cd());
						//得意先CD			
						rqstR.cst_cd(hdrR.cst_cd());
						//依頼元部門
						rqstR.rqst_fr_dpt_cd(hdrR.sls_dpt_cd());
						
						op.up0().add(rqstR);
						ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
						copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
						rqstChkR.upd_flg(isUpdFlg(hdrR, dtlR, oldSloDR));
						opChk.up0().add(rqstChkR);
					}
					else {
						//手配区分が「手配依頼」の場合、
						if (MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ())) {
							ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
							copy(rqstR, dtlR, createMap_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR(hdrR, _cacheSloR));
							rqstR.vld_dt_fr(dtlR.valid_dt_fr());	//有効期限ＦＲＯＭ
							dtlR.rqst_dt(rqstR.rqst_dt());//運用日付で設定
							dtlR.rqst_dlv_rqst_dt(rqstR.avl_schd_dt()); //出荷予定日で設定する。	
							
							dtlR.rqst_qty(rqstR.trd_unit_qty());
							dtlR.rqst_unit_cd(rqstR.trd_unit_cd());
							//依頼元部門
							rqstR.rqst_fr_dpt_cd(hdrR.sls_dpt_cd());
							if (isNull(dtlR.loc_cd())) {
								rqstR.gr_str_ln_cd(dtlR.def_str_ln_cd());
							}
							
							op.up0().add(rqstR);
							ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
							copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
							rqstChkR.upd_flg(isUpdFlg(hdrR, dtlR, oldSloDR));
							opChk.up0().add(rqstChkR);
						}
						//手配区分が「引当後手配」の場合、引当後在庫不足が存在する場合のみ作成
						else if (MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())) {
							MCNumber notAlcQty = getNotAlcQty(dtlR, oldSloDR, hdrR);
							if (notAlcQty.isPositive()) {
								ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
								copy(rqstR, dtlR, createMap_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR(hdrR, _cacheSloR));
								rqstR.vld_dt_fr(dtlR.valid_dt_fr());	//有効期限ＦＲＯＭ
								if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())){
									rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分
								}
								else if (isRqstDel(dtlR, hdrR, _cacheSloR)) {
									rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分
								}
								else if (isNull(dtlR.data_crud_typ())){
									rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
								}
								else {
									//打切・打切取消の場合、依頼削除対象外
									if (dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg())) {
										rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
									}
									else {
										//更新前の依頼数を取得
										MCNumber oldRqstQty = oldSloDR.rqst_qty();
										if (isNull(oldRqstQty)){
											oldRqstQty = MCNumber.ZERO;
										}
										if (!oldRqstQty.isPositive()){
											rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分
										}
										else{
											rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
										}
									}
								}
								
								rqstR.base_unit_qty(notAlcQty);
								//基準単位数を取引単位数に換算
								if (!isSame(rqstR.trd_unit_cd(), rqstR.base_unit_cd())) {
									MCNumber trdUnitQty = rvrsBaseUnitConv(notAlcQty, dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
											dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
									if (isNull(trdUnitQty)){
										//換算不可の場合。取引単位CD取引単位数に基準単位数で設定する。
										rqstR.trd_unit_cd(rqstR.base_unit_cd());
										rqstR.trd_unit_qty(rqstR.base_unit_qty());
									}
									else{
										//換算時に端数が発生しない場合、取引単位CD.取引単位数に換算結果値で設定する。	
										rqstR.trd_unit_cd(dtlR.trd_unit_cd());
										rqstR.trd_unit_qty(trdUnitQty);
									}
								}
								else {
									rqstR.trd_unit_cd(rqstR.base_unit_cd());
									rqstR.trd_unit_qty(rqstR.base_unit_qty());
								}
								dtlR.rqst_dt(rqstR.rqst_dt());//運用日付で設定
								dtlR.rqst_dlv_rqst_dt(rqstR.avl_schd_dt()); //出荷予定日で設定する。
								dtlR.rqst_qty(rqstR.trd_unit_qty());
								dtlR.rqst_unit_cd(rqstR.trd_unit_cd());
								
								//依頼元部門
								rqstR.rqst_fr_dpt_cd(hdrR.sls_dpt_cd());
								if (isNull(dtlR.loc_cd())) {
									rqstR.gr_str_ln_cd(dtlR.def_str_ln_cd());
								}
								
								op.up0().add(rqstR);
								ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
								copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
								rqstChkR.upd_flg(isUpdFlg(hdrR, dtlR, oldSloDR));
								opChk.up0().add(rqstChkR);
							}
							else {
								dtlR.rqst_dt(null);
								dtlR.rqst_dlv_rqst_dt(null);
								dtlR.rqst_qty(null);
								dtlR.rqst_unit_cd(null);
							}
						}
						else {
							dtlR.rqst_dt(null);
							dtlR.rqst_dlv_rqst_dt(null);
							dtlR.rqst_qty(null);
							dtlR.rqst_unit_cd(null);
						}
					}
				}
			}
			
			if (canFlg) {
				opChk.up0().setAll(opChk.up0().subList(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()));
			}
			else {
				opChk.up0().removeAll(opChk.up0().subList(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()));
			}
			
			//出荷・供給依頼チェックサービスを実行する。
			if (!opChk.up0().isEmpty()) {
				opChk.exec();
			}
			throwUpdErr();
			//仕入直送の場合、発注済みの変更は売上予定が更新されていないため、データの整合性をとるための処理を行う。
			for (ShipDmndRqst_Chk01_DtlR dwnR : opChk.down0()){
				if (dwnR.inst_po_flg()){
					Slo_Upd01_DtlR dtlR = up1().subList(Slo_Upd01_DtlR.$peg_no, dwnR.peg_no()).get(0);
					dtlR.setBooleanNE("inst_po_flg", true);
				}
			}
			
			if (canFlg) {
				op.up0().setAll(op.up0().subList(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()));
			}
			else {
				op.up0().removeAll(op.up0().subList(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()));
			}
			//出荷・供給依頼サービスを実行する。
			if (!op.up0().isEmpty()) {
				op.exec();
			}
			//戻り値の取得と受注明細に設定する。
			MCList<ShipDmndRqst_Upd01_DtlR> dnL = op.down0();
			
			MCMessageList msgL = new MCMessageList();
			for (Slo_Upd01_DtlR dtlR : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					MCList<ShipDmndRqst_Upd01_DtlR> dnSubL = dnL.subList(
							ShipDmndRqst_Upd01_DtlR.$peg_no, dtlR.peg_no());
					for (ShipDmndRqst_Upd01_DtlR dnR : dnSubL) {
						
						// 購買依頼が作られる場合はロット指定できないとする。
						if (!canFlg && MSC_WG_RQST_TYP.isPURC(dnR.wg_rqst_typ()) 
								&& (!isNull(dnR.lot_no()) || !isNull(dnR.sublot_no()))) {
							
							MCMessage msg = new MCMessage(dtlR, 
									!isNull(dtlR.lot_no()) ? Slo_Upd01_DtlR.$lot_no : Slo_Upd01_DtlR.$sublot_no,
									MSBBL0268, 
									toDispGUIIndex(dtlR));
							msgL.add(msg);
						}
						// 依頼のレコードを取得し、受注明細に設定する。
						else if (!MAC_DATA_CRUD_TYP.isDEL(dnR.data_crud_typ())) {
							dtlR.rqst_to_loc_cd(nullValToNull(dnR.gi_loc_cd()));
							dtlR.sppl_cd(nullValToNull(dnR.sppl_cd()));
							if (!isNull(dtlR.sppl_cd())) {
								dtlR.maker_cd(dnR.maker_cd());
							}
							else {
								dtlR.maker_cd(null);
							}
						}
					}
				}
			}
			
			if (!msgL.isEmpty()) {
				MCAppException ex = new MCAppException(msgUpdErr());
				ex.addCauseMessageList(msgL);
				throw ex;
			}
		}
		
		/**
		 * 見積明細を更新する。
		 * @param hdrR　受注ヘッダ
		 */
		protected void updQtnD(Slo_Upd01_HdrR hdrR) {

			if (hasQtn(hdrR)) {
				updQtnDSub();
			}
		}

		/**
		 * 見積明細の更新の実処理
		 */
		protected void updQtnDSub() {

			MCList<MST_QTN_D_R> orgQtnDL = MCList.create(MST_QTN_D_R.class);
			MST_QTN_D_R orgQtnDL_t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder orgQtnDL_bldr = MCQueryApiBuilder.create(orgQtnDL_t);
			orgQtnDL_bldr.setSelect(orgQtnDL_t.qtn_d_no);
			orgQtnDL_bldr.addSelect(orgQtnDL_t.slo_trnst_qty);
			dbSelectKeyForUpdate("MSBBL6020_MST_QTN_D_S03", orgQtnDL, orgQtnDL_bldr, up1());

			MCJoinKey<MCList<MST_QTN_D_R>> jk = up1().join(Slo_Upd01_DtlR.$qtn_d_no,
					orgQtnDL, MST_QTN_D_R.$qtn_d_no);
			MCList<MST_QTN_D_R> updQtnDL = MCList.create(MST_QTN_D_R.class);

			for (Slo_Upd01_DtlR r : up1()) {
				// 見積引継の受注明細以外は対象外
				if (isNull(r.qtn_d_no())) {
					continue;
				}

				MST_QTN_D_R qtndR = r.getJoinedRow(jk);
				if (qtndR == null) {
					throw new MCAppException(r, null, MSBBL0173, r.slo_d_no(), r.qtn_d_no());
				}
				MCNumber oldQty = qtndR.slo_trnst_qty();
				if (oldQty == null) {
					oldQty = MCNumber.ZERO;
				}
				// 見積引継受注の更新は新規行追加ないから必ず取得できる
				MST_SLO_D_R oldSloDR = getFirstSloDCache(r.slo_d_no());
				MCNumber newQty = oldQty.subtract(oldSloDR.trd_unit_qty());
				if (Status.DELETE == r.getStatus()) {
					// 何もしない
				}
				else {
					newQty = newQty.add(r.trd_unit_qty());
				}
				qtndR.slo_trnst_qty(newQty);
				updQtnDL.add(qtndR);
			}

			MST_QTN_D_R updQtnDL_t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder updQtnDL_bldr = MCQueryApiBuilder.create(updQtnDL_t);
			updQtnDL_bldr.setSet(updQtnDL_t.slo_trnst_qty);
			dbUpdateKey("MSBBL6020_MST_QTN_D_U02", updQtnDL, updQtnDL_bldr);
		}
		
		/**
		 * 変更前の売上予定を削除する。
		 * @param op 出荷予定オペレーション
		 */
		protected void delIOSchdAndSLsSchd(MSBBL_SlsSchdService.Sls_Schd_Upd01 op) {
			
			MSBEL_IoSchdService.IoSchd_Del01 opeDel = MSBEL_IoSchdService.crtIoSchd_Del01();
			
			for (MST_SLO_D_R oldSloDR : _cacheSloDL) {
				//仕入直送、打切の場合は対象外とする。
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())
						|| oldSloDR.abort_flg() || oldSloDR.can_flg()) {
					continue;
				}
				String shipPrNo = up1().subList(Slo_Upd01_DtlR.$slo_d_no, oldSloDR.slo_d_no()).get(0).ship_pr_no();					
				MCList<MST_SHIP_SCHD_R> shipSchdL = _cacheShipSchdL.subList(MST_SHIP_SCHD_R.$ship_pr_no, shipPrNo);
				for (MST_SHIP_SCHD_R shipR : shipSchdL) {
					//打切の場合は対象外とする。
					if (shipR.abort_flg()) {
						continue;
					}
					Sls_Schd_Upd01_DtlR dest = Sls_Schd_Upd01_DtlR.create();
					dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_SCHD.value());//売上予定作成元区分
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					dest.ship_schd_no(shipR.ship_schd_no());//出荷予定ＮＯ
					dest.cred_no_up_flg(true);//与信更新無ＦＬＧ
					op.up0().add(dest);
					MCList<MST_SHIP_ALLOC_STS_R> shipAllocL = _cacheShipAlocStsL
							.subList(MST_SHIP_ALLOC_STS_R.$ship_schd_no,
									shipR.ship_schd_no());
					
					for (MST_SHIP_ALLOC_STS_R shipAllocR : shipAllocL){
						MSW_IO_SCHD_DEL_R cndR = MSW_IO_SCHD_DEL_R.create();
						//電文項目編集
						cndR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
						cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value());
						cndR.io_schd_no(shipAllocR.ship_alloc_sts_no());
						cndR.io_schd_seq(null);
						opeDel.up0().add(cndR);
					}
				}
			}
			
			if (!opeDel.up0().isEmpty()){
				opeDel.exec();
			}
		}
		
		/**
		 * 売上予定の更新（出荷予定との同期をとる）<br>
		 * 仕入直送受注の訂正で、出荷予定と売上予定で不整合な状態になることがあるので、売上予定サービスを受注登録から呼び出す。<br>
		 * ・出荷供給依頼サービスを実行したが発注済以降のケース（売上予定サービスが中で実行されない）<br>
		 * ・出荷予定サービスを実行したが出荷供給依頼サービスを実行しないケース<br>
		 * @param hdrR 受注ヘッダ
		 */
		protected void updShipSchdBySlsSchd(Slo_Upd01_HdrR hdrR) {
			
			MSBBL_SlsSchdService.Sls_Schd_Upd04 op = MSBBL_SlsSchdService.crtSls_Schd_Upd04();
			
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL_bldr.setSelect(t.slo_d_no, t.po_flg);
			poSchdL_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
			poSchdL_bldr.addConstWhereWithAnd(t.rqst_can_flg.eq(value(false)));
			dbSelectColumn("MSBBL6020_MST_PO_SCHD_S01", poSchdL, poSchdL_bldr,
					MST_PO_SCHD_R.$slo_d_no, up1(), Slo_Upd01_DtlR.$slo_d_no);
			
			MCIndexKey idxkey = poSchdL.createIndex(MST_PO_SCHD_R.$slo_d_no);
			
			MCList<Slo_Upd01_DtlR> bindL = up1().subList(Slo_Upd01_DtlR.$proc_typ, MAC_SLO_PROC_TYP.PURC_DDLV.value());
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R shipSchdL_t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchdL_t);
			shipSchdL_bldr.setWhere(shipSchdL_t.ship_pr_no.eq(bind(Slo_Upd01_DtlR.$ship_pr_no)));
			dbSelect("MSBBL6020_MST_SHIP_SCHD_S03", shipSchdL, shipSchdL_bldr, bindL);
			
			MCIndexKey shipSchdIdxkey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			MST_SLS_SCHD_R slsSchdL_t = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchdL_t);
			slsSchdL_bldr.setWhere(slsSchdL_t.slo_d_no.eq(bind(Slo_Upd01_DtlR.$slo_d_no)));
			dbSelect("MSBBL6020_MST_SLS_SCHD_S04", slsSchdL, slsSchdL_bldr, bindL);
			
			MCIndexKey slsSchdIdxkey = slsSchdL.createIndex(MST_SLS_SCHD_R.$slo_d_no);
			
			for (Slo_Upd01_DtlR dtlR : up1()) {
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ()) 
						&& (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) || isNull(dtlR.data_crud_typ()))) {
					
					boolean instPoFlg = dtlR.getBooleanNE("inst_po_flg");
					boolean isExecShipSchdServiceFlg = dtlR.getBooleanNE("exec_ship_schd_service_flg");
					if (instPoFlg) {
						Sls_Schd_Upd04_DtlR dest = Sls_Schd_Upd04_DtlR.create();
						dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value()); //売上予定作成元区分
						dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
						dest.slo_d_no(dtlR.slo_d_no()); //受注明細NO
						dest.inst_po_flg(true); //指図・発注済
						op.up0().add(dest);
					}
					else if (isExecShipSchdServiceFlg) {
						MCList<MST_SHIP_SCHD_R> subShipSchdL = shipSchdL.subList(shipSchdIdxkey, dtlR.ship_pr_no());
						MCList<MST_SLS_SCHD_R> subSlsSchdL = slsSchdL.subList(slsSchdIdxkey, dtlR.slo_d_no());
						if (!isSameShipSchdNo(subShipSchdL, subSlsSchdL)) {
							Sls_Schd_Upd04_DtlR dest = Sls_Schd_Upd04_DtlR.create();
							dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value()); //売上予定作成元区分
							dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
							dest.slo_d_no(dtlR.slo_d_no()); //受注明細NO
							
							MST_PO_SCHD_R poSchdR = poSchdL.getFirst(idxkey, dtlR.slo_d_no());
							
							if (!isNull(poSchdR)) {
								dest.inst_po_flg(poSchdR.po_flg()); //指図・発注済
							}
							op.up0().add(dest);
						}
					}
				}
			}
			if (!op.up0().isEmpty()){
				op.exec();
			}
		}
		
		/**
		 * 引数に指定された出荷予定と売上予定の出荷予定NOが一致するかチェックする。
		 * @param shipSchdL 出荷予定リスト
		 * @param slsSchdL 売上予定リスト
		 * @return 出荷予定NOが一致する場合はtrue
		 */
		protected boolean isSameShipSchdNo(MCList<MST_SHIP_SCHD_R> shipSchdL, MCList<MST_SLS_SCHD_R> slsSchdL) {
			
			shipSchdL.sort(MST_SHIP_SCHD_R.$ship_schd_no);
			slsSchdL.sort(MST_SHIP_SCHD_R.$ship_schd_no);
			
			return Arrays.equals(shipSchdL.getStringNE(MST_SHIP_SCHD_R.$ship_schd_no).toArray(new String[0]),
					slsSchdL.getStringNE(MST_SHIP_SCHD_R.$ship_schd_no).toArray(new String[0]));
		}
		
		/**
		 * 売上予定を更新する。
		 * 
		 * @param hdrR　受注ヘッダ
		 */
		protected void updSlsSchd(Slo_Upd01_HdrR hdrR) {
			
			MSBBL_SlsSchdService.Sls_Schd_Upd01 op = MSBBL_SlsSchdService.crtSls_Schd_Upd01();
			MAM_BP_R bpR = getBp(_cacheSloR.cst_cd());
			
			//IV取引→IV取引以外に変更した場合,有効な売上予定を削除
			if (bpR.cst_iv_flg() && !hdrR.cst_iv_flg()){
				for (MST_SLO_D_R oldSloDR : _cacheSloDL) {
					//仕入直送、打切の場合は対象外とする。
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())
							|| oldSloDR.abort_flg() || oldSloDR.can_flg()) {
						continue;
					}
					Sls_Schd_Upd01_DtlR dest = Sls_Schd_Upd01_DtlR.create();
					dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());//売上予定作成元区分
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					dest.slo_d_no(oldSloDR.slo_d_no());//受注明細ＮＯ
					dest.cred_no_up_flg(true);//与信更新無ＦＬＧ
					op.up0().add(dest);
				}
			}
			//IV取引以外→IV取引に変更した場合,有効な売上予定を新規、変更前の売上予定は削除。
			if (!bpR.cst_iv_flg() && hdrR.cst_iv_flg()){
				delIOSchdAndSLsSchd(op);
				for (Slo_Upd01_DtlR dtlR : up1()) {
					if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						//仕入直送、打切の場合は対象外とする。
						if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())
								|| dtlR.abort_flg()) {
							continue;
						}
						Sls_Schd_Upd01_DtlR slsSchdR = Sls_Schd_Upd01_DtlR.create();
						copy(slsSchdR, dtlR,
								createMap_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR());
						slsSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						op.up0().add(slsSchdR);
						
						//売上集計基準日更新するかどうかのFLGを設定する
						dtlR.setStringNE("SLO_SUM_BASE_DT_FLG", "1");
					}
				}
			}
			
			//IV取引外→IV取引外の場合、作成しない。
			if (!bpR.cst_iv_flg() && !hdrR.cst_iv_flg()) {
				
			}			
			
			//IV取引→IV取引の場合、売上予定を作成する。
			if (bpR.cst_iv_flg() && hdrR.cst_iv_flg()) {				
				for (Slo_Upd01_DtlR dtlR : up1()) {
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						//キャッシュから対応する更新前の受注明細を取得する。
						MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
						//変更前は仕入直送以外で打切る場合
						if (dtlR.abort_flg()) {
							if (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) && !dtlR.rem_abort_flg()) {
								//売上集計基準日更新するかどうかのFLGを設定する
								dtlR.setStringNE("SLO_SUM_BASE_DT_FLG", "1");
								Sls_Schd_Upd01_DtlR dest = Sls_Schd_Upd01_DtlR.create();
								copy(dest, dtlR, createMap_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR());
								dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());//売上予定作成元区分
								dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								dest.slo_d_no(oldSloDR.slo_d_no());//受注明細ＮＯ
								dest.abort_flg(dtlR.abort_flg());//打切ＦＬＧ
								dest.cred_no_up_flg(true);//与信更新無ＦＬＧ
								op.up0().add(dest);
								continue;
							}
						}
						else {
							//仕入直送→仕入直送以外　の場合、売上予定の新規を行う
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())
									&& !MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
								//売上集計基準日更新するかどうかのFLGを設定する
								dtlR.setStringNE("SLO_SUM_BASE_DT_FLG", "1");
								
								Sls_Schd_Upd01_DtlR slsSchdR = Sls_Schd_Upd01_DtlR
										.create();
								copy(slsSchdR, dtlR,
										createMap_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR());
								slsSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								op.up0().add(slsSchdR);
							}
							//仕入直送→仕入直送　の場合、何もしない。
							
							//仕入直送以外→仕入直送　の場合、売上予定の削除を行う
							if (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())
									&& MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
								Sls_Schd_Upd01_DtlR dest = Sls_Schd_Upd01_DtlR.create();
								dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());//売上予定作成元区分
								dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								dest.slo_d_no(oldSloDR.slo_d_no());//受注明細ＮＯ
								dest.cred_no_up_flg(true);//与信更新無ＦＬＧ
								op.up0().add(dest);
							}
							//仕入直送以外→仕入直送以外　の場合、売上予定更新を行う
							if (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())
									&& !MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
								if (dtlR.rem_abort_flg()) {
									continue;
								}
								//売上集計基準日更新するかどうかのFLGを設定する
								dtlR.setStringNE("SLO_SUM_BASE_DT_FLG", "1");
								
								Sls_Schd_Upd01_DtlR slsSchdR = Sls_Schd_Upd01_DtlR.create();
								copy(slsSchdR, dtlR,
										createMap_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR());
								op.up0().add(slsSchdR);
							}
						}
					}
					//削除の場合、
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
						if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())) {
							continue;
						}
						Sls_Schd_Upd01_DtlR dest = Sls_Schd_Upd01_DtlR.create();
						dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());//売上予定作成元区分
						dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						dest.slo_d_no(dtlR.slo_d_no());//受注明細ＮＯ
						dest.cred_no_up_flg(true);//与信更新無ＦＬＧ
						op.up0().add(dest);
					}
					//新規の場合
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
							continue;
						}
						Sls_Schd_Upd01_DtlR slsSchdR = Sls_Schd_Upd01_DtlR
								.create();
						copy(slsSchdR, dtlR,
								createMap_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR());
						slsSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						op.up0().add(slsSchdR);
					}
				}				
			}
			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}
		
		/**
		 * 下り電文を設定する。
		 * @param hdrR 受注ヘッダ
		 */
		protected void setDown(Slo_Upd01_HdrR hdrR) {
			
			Slo_Ins01_Rslt_HdrR down0R = Slo_Ins01_Rslt_HdrR.create();
			
			down0R.slo_no(hdrR.slo_no());
			down0R.slo_rev(hdrR.slo_rev());
			down0R.aprv_flg(hdrR.aprv_flg());
			down0R.aprv_no(hdrR.aprv_no());
			down0R.aprv_sts_typ(hdrR.aprv_sts_typ());
			down0R.aprv_can_flg(hdrR.can_del_flg());
			down0R.aprv_upd_flg(hdrR.can_upd_flg());
			down0R.iv_no(hdrR.iv_no());
			down0R.slo_dt(hdrR.slo_dt());
			down0R.cst_cd(hdrR.cst_cd());
			down0R.trd_cur_cd(hdrR.trd_cur_cd());
			down0R.wg_cd(hdrR.wg_cd());
			down0R.sls_dpt_cd(hdrR.sls_dpt_cd());
			down0R.wrk_no(hdrR.wrk_no());
			down0R.tterm_cd1(hdrR.tterm_cd1());
			down0R.tterm_cd2(hdrR.tterm_cd2());
			down0R.tterm_cd3(hdrR.tterm_cd3());
			down0R.edi_sub_char1(hdrR.edi_sub_char1());
			down0R.edi_sub_char2(hdrR.edi_sub_char2());
			down0R.edi_sub_char3(hdrR.edi_sub_char3());
			down0R.edi_sub_char4(hdrR.edi_sub_char4());
			down0R.edi_sub_char5(hdrR.edi_sub_char5());
			
			down0().add(down0R);
			
			for (Slo_Upd01_DtlR r : _upSloDL) {
				Slo_Ins01_Rslt_DtlR downR = Slo_Ins01_Rslt_DtlR.create();
				downR.disp_seq(r.disp_seq());  //表示順
				downR.slo_d_no(r.slo_d_no());  //受注明細ＮＯ
				downR.sno1(r.sno1());  //手配ＮＯ１
				downR.sno2(r.sno2());  //手配ＮＯ２
				downR.sno3(r.sno3());  //手配ＮＯ３
				downR.sno4(r.sno4());  //手配ＮＯ４
				downR.ship_schd_dt(r.ship_schd_tm());  //出荷予定日
				downR.ship_schd_hm(r.ship_schd_tm());  //出荷予定時刻
				downR.dlv_schd_dt(r.dlv_schd_tm());  //納品予定日
				downR.dlv_schd_hm(r.dlv_schd_tm());  //納品予定時刻
				downR.alloc_scope_typ(r.alloc_scope_typ());  //引当範囲区分
				downR.alloc_typ(r.alloc_typ());  //引当区分
				downR.rqst_to_loc_cd(r.rqst_to_loc_cd());  //依頼先場所ＣＤ
				downR.sppl_cd(r.sppl_cd());  //発注先ＣＤ
				downR.maker_cd(r.maker_cd());  //メーカＣＤ
				downR.rqst_dt(r.rqst_dt());  //依頼日
				downR.rqst_dlv_rqst_dt(r.rqst_dlv_rqst_dt());  //依頼納入希望日
				downR.alloc_grp_cd(r.alloc_grp_cd());  //総量引当場所グループＣＤ
				downR.def_loc_cd(r.def_loc_cd());  //通常出荷場所ＣＤ
				downR.loc_cd(r.loc_cd());  //場所ＣＤ
				downR.str_ln_cd(r.str_ln_cd());  //棚・ラインＣＤ
				downR.str_ln_cd_none_flg(r.str_ln_cd_none_flg());  //棚・ライン無
				downR.peg_no(r.peg_no());  //紐付けＮＯ
				downR.hdr_peg_no(r.hdr_peg_no());  //紐付けＮＯ
				downR.setAttributes(r); // 属性
				downR.trd_cur_amt(r.trd_cur_amt());
				downR.trd_cur_tax_amt(r.trd_cur_tax_amt());
				downR.data_lno(r.data_lno());
				downR.dlv_cd(r.dlv_cd());
				downR.dest_cd1(r.dest_cd1());
				downR.dest_cd2(r.dest_cd2());
				downR.dest_cd3(r.dest_cd3());
				downR.recv_dt(r.recv_dt());
				down1().add(downR);
			}
		}
		
		/**
		 * 引当前、受注明細に紐付く手配依頼の受払予定(入庫予定)を削除する。
		 */
		protected void delIoSchd() {
			
			sp = dbTran().setSavepoint();

			MCList<MSW_IO_SCHD_DEL_R> ioSchdDelL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			ioSchdDelL.addStringColumn("slo_d_no");
			
			getWgRqst(ioSchdDelL);
			
			getXfrSchd(ioSchdDelL);
			
			getPoSchd(ioSchdDelL);
			
			if (!ioSchdDelL.isEmpty()) {
				
				// 変更後の手配区分が在庫引当の場合は、発注済・指図済以降は削除しない。
				// 発注済・指図済以降の場合は紐切で依頼が残り、受払予定も残るため。
				// 変更後の手配区分が在庫引当以外の場合は、発注済・指図済以降であっても、
				// いくつ足りないかを判断したいので、受払予定は削除する。
				MCList<MSW_IO_SCHD_DEL_R> ioSchdDelLAlloc = MCList.create(MSW_IO_SCHD_DEL_R.class);
				MCList<MSW_IO_SCHD_DEL_R> ioSchdDelLNotAlloc = MCList.create(MSW_IO_SCHD_DEL_R.class);
				
				MCIndexKey ik = ioSchdDelL.createIndex("slo_d_no");
				for (Slo_Upd01_DtlR up1R : up1()) {
					MCList<MSW_IO_SCHD_DEL_R> tmp = ioSchdDelL.subList(ik, up1R.slo_d_no());
					if (MAC_SLO_PROC_TYP.isALLOC(up1R.proc_typ())) {
						ioSchdDelLAlloc.addAll(tmp);
					}
					else {
						ioSchdDelLNotAlloc.addAll(tmp);
					}
				}
				
				if (!ioSchdDelLAlloc.isEmpty()) {
					MSBEL_IoSchdService.IoSchd_Del02 ope = MSBEL_IoSchdService.crtIoSchd_Del02();
					
					ope.up0().setAll(ioSchdDelLAlloc);
					
					IoSchd_Del02_Cnd2R fixR = IoSchd_Del02_Cnd2R.create();
					fixR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
					ope.up1().add(fixR);
					
					IoSchd_Del02_Cnd2R schdR = IoSchd_Del02_Cnd2R.create();
					schdR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
					ope.up1().add(schdR);
					
					ope.exec();
				}
				
				if (!ioSchdDelLNotAlloc.isEmpty()) {
					MSBEL_IoSchdService.IoSchd_Del02 ope = MSBEL_IoSchdService.crtIoSchd_Del02();
					
					ope.up0().setAll(ioSchdDelLNotAlloc);
					
					ope.exec();
				}
			}
		}
		/**
		 * 引当前に、該当受注自身の引当保留となっている受払予定を削除する。（引当対象のみ）
		 * @param allocSloDL 引当対象の受注明細
		 */
		protected void delIoSchdAllocWait(MCList<MST_SLO_D_R> allocSloDL) {

			MCList<MST_SHIP_ALLOC_STS_R> allocWaitL = getAllocWait(allocSloDL);
			
			MCList<MSW_IO_SCHD_DEL_R> ioSchdDelL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			
			MSW_IO_SCHD_DEL_R ioSchdDelR = null;
			
			for (MST_SHIP_ALLOC_STS_R allocWaitR : allocWaitL) {
				
				MST_SLO_D_R oldSloDR = getFirstSloDCache(allocWaitR.getStringNE(MST_SLO_D_R.$slo_d_no));
				
				ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
				
				String trdPtnTyp = null;
				
				if (MAC_TRD_PTN_TYP.isSHIP(_cacheSloR.trd_ptn_typ()) 
						|| oldSloDR.vmi_flg()) {
					
					// 貸出出荷
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
					trdPtnTyp = MAC_TRD_PTN_TYP.SHIP.value();
				}
				else if (MAC_TRD_PTN_TYP.isSLS(_cacheSloR.trd_ptn_typ())) {
					
					// 売上
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
					trdPtnTyp = MAC_TRD_PTN_TYP.SLS.value();
				}
				
				// 仕入直送の場合、引当対象外（引当保留にならない）のため、引数のpurcDdlvFlgが必ずfalseになる
				ioSchdDelR.io_schd_sts_typ(getIoSchdStsTypForShip(
						trdPtnTyp, 
						allocWaitR.getStringNE(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no), 
						allocWaitR.getStringNE(MST_SHIP_SCHD_R.$slo_prms_no), 
						MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()),
						false, 
						false, 
						false));

				ioSchdDelR.io_schd_no(allocWaitR.ship_alloc_sts_no());
				
				ioSchdDelL.add(ioSchdDelR);
			}

			if (!ioSchdDelL.isEmpty()) {
				
				MSBEL_IoSchdService.IoSchd_Del01 ope = MSBEL_IoSchdService.crtIoSchd_Del01();
				
				ope.up0().setAll(ioSchdDelL);
				
				ope.exec();
			}
		}
		/**
		 * 引当保留の出荷引当状況を取得する。（引当対象のみ）<br>
		 * 引当解除を実行すると、引当保留が生じるため、再検索を行う。
		 * @param allocSloDL 引当対象の受注明細
		 * @return 引当保留の出荷引当状況リスト
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> getAllocWait(MCList<MST_SLO_D_R> allocSloDL) {
			MCList<MST_SHIP_ALLOC_STS_R> allocWaitL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			allocWaitL.addStringColumn(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			allocWaitL.addStringColumn(MST_SHIP_SCHD_R.$slo_prms_no);
			allocWaitL.addStringColumn(MST_SLO_D_R.$slo_d_no);

			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocWaitL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
			allocWaitL_bldr.setSelect(t.ship_alloc_sts_no);
			allocWaitL_bldr.addSelect(t1.dlv_inst_rcpt_no);
			allocWaitL_bldr.addSelect(t1.slo_prms_no);
			allocWaitL_bldr.addSelect(t3.slo_d_no);
			allocWaitL_bldr.addInnerJoin(t1, t.ship_schd_no.eq(t1.ship_schd_no));
			allocWaitL_bldr.addInnerJoin(t2, t1.ship_pr_no.eq(t2.ship_pr_no));
			allocWaitL_bldr.addInnerJoin(t3, t2.slo_d_no.eq(t3.slo_d_no));
			allocWaitL_bldr.setWhere(t3.slo_d_no.eq(bind("slo_d_no")));
			allocWaitL_bldr.addWhereWithAnd(t.alloc_wait_flg.eq(value(true)));

			dbSelect("MSBBL6020_MST_SHIP_ALLOC_STS_S02", allocWaitL, allocWaitL_bldr, allocSloDL.groupByNE(MST_SLO_D_R.$slo_d_no));
			
			return allocWaitL;
		}
		
		/**
		 * 引当後、受注明細に紐付く手配依頼の受払予定(入庫予定)の削除をロールバックする。
		 */
		protected void delIoSchdRollback() {

			dbTran().rollback(sp);
		}
		
		/**
		 * 受注明細に紐付くＷＧ間依頼を取得する。
		 * @param ioSchdDelL 受払予定削除リスト
		 */
		protected void getWgRqst(MCList<MSW_IO_SCHD_DEL_R> ioSchdDelL) {
			
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(t);
			wgRqstL_bldr.setSelect(t.slo_d_no, t.io_schd_pr_no);

			wgRqstL_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
			wgRqstL_bldr.addConstWhereWithAnd(
					bracket(t.wg_rqst_typ.eq(value(MSC_WG_RQST_TYP.XFR.value()))
							.or(t.wg_rqst_typ.eq(value(MSC_WG_RQST_TYP.PURC.value())))));

			dbSelectColumn("MSBBL6020_MST_WG_RQST_S01", wgRqstL, wgRqstL_bldr,
					MST_WG_RQST_R.$slo_d_no, up1(), Slo_Upd01_DtlR.$slo_d_no);
			
			MSW_IO_SCHD_DEL_R ioSchdDelR = null;
			for (MST_WG_RQST_R wgRqstR : wgRqstL) {
				
				ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
				
				ioSchdDelR.io_schd_pr_no(wgRqstR.io_schd_pr_no());
				ioSchdDelR.setValueNE("slo_d_no", wgRqstR.slo_d_no());
				
				ioSchdDelL.add(ioSchdDelR);
			}
		}
		
		/**
		 * 受注明細に紐付く移動・移送予定を取得する。
		 * @param ioSchdDelL 受払予定削除リスト
		 */
		protected void getXfrSchd(MCList<MSW_IO_SCHD_DEL_R> ioSchdDelL) {
			
			MCList<Slo_Upd01_DtlR> bindL = MCList.create(Slo_Upd01_DtlR.class);
			
			MCIndexKey idxkey = ioSchdDelL.createIndex("slo_d_no");
			
			for (Slo_Upd01_DtlR dtlR : up1()) {
				
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
				
				if (!ioSchdDelL.contains(idxkey, dtlR.slo_d_no()) && !isNull(oldSloDR) && !isNull(oldSloDR.rqst_to_loc_cd())) {
					
					bindL.add(dtlR.clone());
				}
			}
			
			if (!bindL.isEmpty()) {
				
				MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
				MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t);
				xfrSchdL_bldr.setSelect(t.slo_d_no, t.io_schd_pr_no);

				xfrSchdL_bldr.addConstWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				dbSelectColumn("MSBBL6020_MST_XFR_SCHD_S01", xfrSchdL, xfrSchdL_bldr,
						MST_WG_RQST_R.$slo_d_no, bindL, Slo_Upd01_DtlR.$slo_d_no);
				
				MSW_IO_SCHD_DEL_R ioSchdDelR = null;
				for (MST_XFR_SCHD_R xfrSchdR : xfrSchdL) {
					
					ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
					
					ioSchdDelR.io_schd_pr_no(xfrSchdR.io_schd_pr_no());
					ioSchdDelR.setValueNE("slo_d_no", xfrSchdR.slo_d_no());
					
					ioSchdDelL.add(ioSchdDelR);
				}
			}
		}
		
		/**
		 * 受注明細に紐付く発注予定を取得する。
		 * @param ioSchdDelL 受払予定削除リスト
		 */
		protected void getPoSchd(MCList<MSW_IO_SCHD_DEL_R> ioSchdDelL) {
			
			MCList<Slo_Upd01_DtlR> bindL = MCList.create(Slo_Upd01_DtlR.class);
			
			MCIndexKey idxkey = ioSchdDelL.createIndex("slo_d_no");
			
			for (Slo_Upd01_DtlR dtlR : up1()) {
				
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
				
				if (!ioSchdDelL.contains(idxkey, dtlR.slo_d_no()) && !isNull(oldSloDR) && !isNull(oldSloDR.sppl_cd())) {
					
					bindL.add(dtlR.clone());
				}
			}
			
			if (!bindL.isEmpty()) {
				
				MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
				MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);

				poSchdL_bldr.setSelect(t.slo_d_no, t.io_schd_pr_no);
				poSchdL_bldr.addConstWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				dbSelectColumn("MSBBL6020_MST_PO_SCHD_S02", poSchdL, poSchdL_bldr,
						MST_WG_RQST_R.$slo_d_no, bindL, Slo_Upd01_DtlR.$slo_d_no);
				
				MSW_IO_SCHD_DEL_R ioSchdDelR = null;
				for (MST_PO_SCHD_R poSchdR : poSchdL) {
					
					ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
					
					ioSchdDelR.io_schd_pr_no(poSchdR.io_schd_pr_no());
					ioSchdDelR.setValueNE("slo_d_no", poSchdR.slo_d_no());
					
					ioSchdDelL.add(ioSchdDelR);
				}
			}
		}
		
		protected boolean isStkChanged(MST_SLO_D_R oldSloDR, Slo_Upd01_DtlR dtlR) {
			//在庫品→非在庫品に変更した場合、Trueとする
			MAM_ITM_R itmR = getItm(oldSloDR.itm_cd(), oldSloDR.itm_sub1(), oldSloDR.itm_sub2(), oldSloDR.itm_sub3());
			if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ()) && !MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())){
				return true;
			}
			return false;
		}
	}



	/**
	 * 依頼削除の対象かを判断する
	 * @param dtlR
	 * @return
	 */
	protected boolean isRqstDel(Slo_Upd01_DtlR dtlR, Slo_Upd01_HdrR hdrR, MST_SLO_R sloR) {
		//依頼元WG_CDが変わったら、依頼削除対象とする。
		if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) && !isSame(hdrR.wg_cd(),sloR.wg_cd())) {
			return true;
		}
		if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
			return true;
		}
		if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
			//キャッシュから対応する更新前の受注明細を取得する。
			MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
			//打切・打切取消の場合、依頼削除対象外
			if (dtlR.abort_flg() || (!dtlR.abort_flg() && oldSloDR.abort_flg())) {
				return false;
			}
			//手配区分が変わったら、依頼削除対象
			if (!isSame(dtlR.proc_typ(), oldSloDR.proc_typ())) {
				return true;
			}
			else if (!isSame(dtlR.itm_cd(), oldSloDR.itm_cd()) 
					|| !isSame(dtlR.itm_sub1(), oldSloDR.itm_sub1())
					|| !isSame(dtlR.itm_sub2(), oldSloDR.itm_sub2())
					|| !isSame(dtlR.itm_sub3(), oldSloDR.itm_sub3())){
				return true;
			}			
			else {
				//依頼先場所はNULL→NOT　NULL、或はNOT　NULL→NULLに変更した場合、依頼削除対象
				if (!isNull(dtlR.rqst_to_loc_cd()) && isNull(oldSloDR.rqst_to_loc_cd())) {
					return true;
				}
				if (isNull(dtlR.rqst_to_loc_cd()) && !isNull(oldSloDR.rqst_to_loc_cd())) {
					return true;
				}
				//発注先はNULL→NOT　NULL、或はNOT　NULL→NULLに変更した場合、依頼削除対象
				if (!isNull(dtlR.sppl_cd()) && isNull(oldSloDR.sppl_cd())) {
					return true;
				}
				if (isNull(dtlR.sppl_cd()) && !isNull(oldSloDR.sppl_cd())) {
					return true;
				}
			}
			// 引当後手配で、数量変更時に依頼が不要になったら依頼削除対象
			MCNumber oldRqstQty = nvl(oldSloDR.rqst_qty(), MCNumber.ZERO);
			MCNumber notAlcQty = getNotAlcQty(dtlR, oldSloDR, hdrR);
			if (oldRqstQty.isPositive() && notAlcQty.isZero()) {
				return true;
			}
		}
		return false;
	}

	public MCMainQuery get_MST_SLO_PRMS_S01_sql() {
		MST_SLO_PRMS_R S0T1 = MST_SLO_PRMS_R.create("T1");
		MST_SHIP_SCHD_R S0T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_PR_R S0T3 = MST_SHIP_PR_R.create("T3");
		MST_SLO_D_R S0T4 = MST_SLO_D_R.create("T4");

		MCMainQuery q = sql("MSBBL6020_MST_SLO_PRMS_S02")
			.mainQuery()
			.select(
				S0T3.ship_pr_no,
				S0T1.slo_prms_no,
				S0T3.slo_d_no,
				S0T1.base_unit_prms_qty,
				S0T1.prms_dlv_tm
			)
			.from(
				S0T1
				.innerJoin(S0T2).on(S0T1.slo_prms_no.eq(S0T2.slo_prms_no))
				.innerJoin(S0T3).on(S0T2.ship_pr_no.eq(S0T3.ship_pr_no))
				.innerJoin(S0T4).on(S0T3.slo_d_no.eq(S0T4.slo_d_no))
			)
			.where(value(0).eq(value(0))
				.and(S0T2.fix_flg.eq(value(true)))
				.and(S0T4.slo_no.eq(bind("slo_no")))
			);

		return q;
	}

	public MCMainQuery get_MST_SLO_PRMS_S02_sql() {
		MST_SLO_PRMS_R S0T1 = MST_SLO_PRMS_R.create("T1");
		MST_SHIP_SCHD_R S1T2 = MST_SHIP_SCHD_R.create("T2");

		MCMainQuery q = sql("MSBBL6020_MST_SLO_PRMS_S03")
			.mainQuery()
			.select(
				S0T1.slo_prms_no,
				S0T1.slo_d_no
			)
			.from(S0T1)
			.where(
				value(0).eq(value(0))
				.and(S0T1.slo_no.eq(bind("slo_no")))
				.and(
					notExists(
						subQuery()
						.select(value("X"))
						.from(S1T2)
						.where(
							S0T1.slo_prms_no.eq(S1T2.slo_prms_no)
							.and(S1T2.fix_flg.eq(value(true)))
						)
					)
				)
			);
		return q;
	}

	public MCMainQuery get_MST_SLO_PRMS_S03_sql() {
		MST_SLO_PRMS_R S0T1 = MST_SLO_PRMS_R.create("T1");
		MST_SHIP_SCHD_R S0T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_PR_R S0T3 = MST_SHIP_PR_R.create("T3");

		MCMainQuery q = sql("MSBBL6020_MST_SLO_PRMS_S04")
			.mainQuery()
			.select(
				S0T3.ship_pr_no,
				S0T1.slo_prms_no,
				S0T1.slo_prms_rev,
				S0T1.slo_no,
				S0T1.slo_d_no,
				S0T1.dlv_inst_rcpt_no,
				S0T1.prms_dlv_tm,
				S0T1.trd_unit_prms_qty,
				S0T1.base_unit_prms_qty,
				S0T1.prms_rmrks,
				S0T1.intr_rmrks,
				S0T1.sub_char1,
				S0T1.sub_char2,
				S0T1.sub_char3
			)
			.from(
				S0T1
				.innerJoin(S0T2).on(S0T2.slo_prms_no.eq(S0T1.slo_prms_no))
				.innerJoin(S0T3).on(S0T2.ship_pr_no.eq(S0T3.ship_pr_no))
			)
			.where(
				value(0).eq(value(0))
				.and(S0T1.slo_no.eq(bind("slo_no")))
			);
		return q;
	}
	
	protected MCNumber getNotAlcQty(Slo_Upd01_DtlR dtlR, MST_SLO_D_R oldSloDR, Slo_Upd01_HdrR hdrR){
		
		MCNumber notAlcQty = MCNumber.ZERO;
		if (isNull(dtlR.data_crud_typ())){
			notAlcQty = dtlR.rqst_qty();
			if (isNull(notAlcQty)){
				notAlcQty = MCNumber.ZERO;
			}
			
			if (!isNull(dtlR.rqst_unit_cd())) {
				
				if (!isSame(dtlR.rqst_unit_cd(), dtlR.base_unit_cd())){	
					
					if (isSame(dtlR.rqst_unit_cd(), dtlR.trd_unit_cd())) {
						notAlcQty = convToBaseUnit(notAlcQty, 
								dtlR.trd_unit_conv_base_qty(), 
								dtlR.trd_unit_conv_qty(), 
								dtlR.base_unit_dec_place(), 
								dtlR.base_unit_rnd_typ());
					}
					else {
						notAlcQty = getBaseUnitQty(notAlcQty,
								dtlR.rqst_unit_cd(), dtlR.itm_cd(), dtlR.itm_sub1(),
								dtlR.itm_sub2(), dtlR.itm_sub3());
					}
				}
			}
		}
		//新規の場合
		if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
			//引当数を取得する。
			MCNumber alcQty = _allocResultBkL
					.subList(Srch_RsltR.$peg_no, dtlR.peg_no())
					.sum(Srch_RsltR.$base_unit_qty);
			if (isNull(alcQty)) {
				alcQty = MCNumber.ZERO;
			}
			//未引当分 >0の場合作成
			notAlcQty = dtlR.base_unit_qty().subtract(alcQty);
		}
		//更新の場合
		if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
			MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
			//元の引当情報を保持している（引当解除されてない）場合、更新前の値を採用する。それ以外の場合、引当結果から算出する
			if (_allocResultBkL.subList(Srch_RsltR.$peg_no, dtlR.peg_no()).isEmpty() 
					&& !isAbortRet(dtlR, oldSloDR)
					&& !isAllocCancel(oldSloDR, oldShipPrR, dtlR, hdrR)) {
				if (isSame(dtlR.proc_typ(), oldSloDR.proc_typ()) 
						&& isSame(dtlR.base_unit_qty(), oldSloDR.base_unit_qty())){
					notAlcQty = dtlR.rqst_qty();
					if (isNull(notAlcQty)){
						notAlcQty = MCNumber.ZERO;
					}
					else {
						if (!isSame(dtlR.rqst_unit_cd(),dtlR.base_unit_cd())) {
							
							if (isSame(dtlR.rqst_unit_cd(), dtlR.trd_unit_cd())) {
								
								notAlcQty = convToBaseUnit(notAlcQty, 
										dtlR.trd_unit_conv_base_qty(), 
										dtlR.trd_unit_conv_qty(), 
										dtlR.base_unit_dec_place(), 
										dtlR.base_unit_rnd_typ());
							}
							else {
								notAlcQty = getBaseUnitQty(notAlcQty,
										dtlR.rqst_unit_cd(), dtlR.itm_cd(),
										dtlR.itm_sub1(), dtlR.itm_sub2(),
										dtlR.itm_sub3());
							}
							if (isNull(notAlcQty)){
								notAlcQty = MCNumber.ZERO;
							}
						}
					}
				}
				else{
					notAlcQty = dtlR.base_unit_qty();
				}
			}
			else {
				//引当数を取得する。
				MCNumber alcQty = _allocResultBkL
						.subList(Srch_RsltR.$peg_no, dtlR.peg_no())
						.sum(Srch_RsltR.$base_unit_qty);
				if (isNull(alcQty)) {
					alcQty = MCNumber.ZERO;
				}
				
				//未引当分 >0の場合作成
				notAlcQty = dtlR.base_unit_qty().subtract(alcQty);
			}
		}
		
		return notAlcQty;
	}

	/**
	 * Slo_Upd02オペレーション.<p>
	 *
	 */
	public class Slo_Upd02 extends MSBBL_SloRegService_MC_A.Slo_Upd02 {		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			//キャッシュからデータ取得する
			getCacheData();
			//受注の前受金入金額を更新
			updSlo();
			//出荷可能な状態を更新
			callShipSchdService();

		}

		/**
		 * キャッシュからデータ取得する
		 */
		protected void getCacheData() {
			_cacheSloList = getUpd04SloCache(up0());
			_cacheUpd04ShipPrL = getUpd04ShipPrCache(up0());
			_cacheUpd04ShipSchdL = getUpd04ShipSchdCache(up0());
		}

		protected void updSlo() {
			MCList<MST_SLO_R> slo = MCList.create(MST_SLO_R.class);
			for (Slo_Upd02_SloR r : up0()) {
				//ロックした受注ヘッダ
				MST_SLO_R sloR = getFirstUpd04SloCache(r.slo_no());
				if (isNull(sloR.adv_rcv_amt()) && isNull(r.adv_rcv_amt())){
					sloR.adv_rcv_amt(null);
				}
				else {
					if (isNull(r.adv_rcv_amt())) {
						r.adv_rcv_amt(0);
					}
					if (isNull(sloR.adv_rcv_amt())) {
						sloR.adv_rcv_amt(0);
					}
					sloR.adv_rcv_amt(sloR.adv_rcv_amt().add(r.adv_rcv_amt()));
				}
				slo.add(sloR);
			}
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder slo_bldr = MCQueryApiBuilder.create(t);
			slo_bldr.setSet(t.adv_rcv_amt);
			dbUpdateKey("MSBBL6020_MST_SLO_U03", slo, slo_bldr);
			//改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
			updSloPL(slo);
		}

		/**
		 * 出荷予定サービスにより出荷判定をおこなう
		 */
		protected void callShipSchdService() {
			//出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）のサービスを出荷判定モードで実行して、出荷可能を更新する。
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService
					.crtShipSchd_Upd02();
			MCList<MST_SHIP_SCHD_R> shipSchdAllL = MCList.create(MST_SHIP_SCHD_R.class);
			MCIndexKey shipPrIdxkey = _cacheUpd04ShipPrL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			for (Slo_Upd02_SloR r : up0()) {
				for (MST_SHIP_SCHD_R shipSchdR : _cacheUpd04ShipSchdL) {
					MST_SHIP_PR_R shipPrR = _cacheUpd04ShipPrL.getFirst(shipPrIdxkey, shipSchdR.ship_pr_no());
					if (isSame(r.slo_no(), shipSchdR.getStringNE("slo_no")) && !isTrnst(shipPrR)){
						shipSchdAllL.add(shipSchdR);
					}					
				}
			}
			int pegNo = 1;
			for (MST_SHIP_SCHD_R r : shipSchdAllL) {
				ShipSchd_DtlR upR = ShipSchd_DtlR.create();
				upR.ship_schd_no(r.ship_schd_no());
				upR.ship_pr_no(r.ship_pr_no());
				upR.peg_no(pegNo);
				upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				upR.not_dt_calc_flg(r.not_dt_calc_flg());
				upR.ship_judge_flg(true);
				op.up1().add(upR);
				pegNo++;
			}
			if (!op.up1().isEmpty()) {
				op.exec();
			}
		}
		/**
		 * 後続業務が登録されているか評価する
		 * @param shipPrR ＤＢの出荷進捗
		 * @return 後続業務が登録されているはtrue
		 */
		protected boolean isTrnst(MST_SHIP_PR_R shipPrR) {
			
			return (!isNull(shipPrR.ship_inst_qty()) && shipPrR.ship_inst_qty().gt(0))
					|| (!isNull(shipPrR.ship_act_qty()) && shipPrR.ship_act_qty().gt(0));
		}
	}

	protected MCNumber getOldCrdAmt(MST_SLO_R oldSloR, MST_SLO_D_R oldSloDR) {
		if (MAC_TRD_PTN_TYP.isSLS(oldSloR.trd_ptn_typ())) {
			//売上予定から基準単位売上予定数の取得：
			MST_SLS_SCHD_R slsSchdR = MST_SLS_SCHD_R.create("T");
			MCQueryApiBuilder slsSchdR_bldr = MCQueryApiBuilder.create(slsSchdR);
			//売上予定.受注明細ＮＯ　=　Upd01_Dtl（受注明細).受注明細ＮＯ		
			slsSchdR_bldr.addSum(slsSchdR.base_unit_qty.subtract(slsSchdR.base_unit_abort_qty), "base_unit_qty");
			slsSchdR_bldr.setWhere(slsSchdR.slo_d_no.eq(bind("1")), oldSloDR.slo_d_no());
			dbSelect("MSBBL6020_MST_SLS_SCHD_S03", slsSchdR, slsSchdR_bldr);
			MCNumber baseUnitQty = slsSchdR.base_unit_qty();
			//与信額＝(Upd01_Dtl（受注明細).取引通貨金額　＋　Upd01_Dtl（受注明細).取引通貨税額）　
			//÷　Upd01_Dtl（受注明細).基準単位数量　× 基準単位売上予定数
			MCNumber crdAmt = oldSloDR.trd_cur_amt().add(oldSloDR.trd_cur_tax_amt());
			crdAmt = crdAmt.multiply(baseUnitQty).divide(oldSloDR.base_unit_qty(),
					getCur(_cacheSloR.trd_cur_cd()).amt_dec_place().intValue(), MAC_RND_TYP.toMC(getBp(_cacheSloR.cst_cd()).sls_amt_rnd_typ()));
			return crdAmt;
		}else{
			return MCNumber.ZERO;
		}		
	}

	/**
	 * Slo_Del01オペレーション.<p>
	 *
	 */
	public class Slo_Del01 extends MSBBL_SloRegService_MC_A.Slo_Del01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {	
			beforeProc();
			//インボイスNO削除
			delIVNo();
			//与信更新処理の呼び出し
			updCred();
			//受注承認取消処理の呼び出し
			callAprvService();
			// 納入指示受領登録サービスの呼出
			callDlvInstRcptService();
			//出荷・供給依頼処理の呼び出し
			callShipDmndRqstService();
			//出荷予定サービスの呼び出し
			callShipSchdService();
			//見積明細の更新
			updQtn();
			//売上予定の削除
			delSlsSchd();
			//受注状況更新処理の呼び出し			
			callSloStsReg();
			//受注・受注明細の論理削除
			delSloSloDMain();
			// 承認提供サービスの承認次処理済更新の呼び出し
			callAprvSvUpd03();
		}

		/**
		 * 削除前処理
		 */
		protected void beforeProc() {
			_cacheSloR = getSloCache(up0());
			_cacheSloDL = getSloDCache(up0());
			_cacheShipSchdL = getShipSchdCache(up1());
			
			initSlo();
		}

		protected void initSlo() {
			_cacheSloR_t = MST_SLO_R.create("T");
			_cacheSloR_bldr = MCQueryApiBuilder.create(_cacheSloR_t);
			_cacheSloDL_t = MST_SLO_D_R.create("T");
			_cacheSloDL_bldr = MCQueryApiBuilder.create(_cacheSloDL_t);
		}

		/**
		 * インボイスNO削除
		 * @param hdr
		 */
		protected void delIVNo() {
			//得意先がインボイス取引対象の場合			
			if (!isNullOrNullVal(_cacheSloR.iv_no())) {
				MST_IV_NO_R ivR = MST_IV_NO_R.create("T");
				ivR.iv_no(_cacheSloR.iv_no());
				dbDeleteKey("MSBBL6020_MST_IV_NO_D02", ivR, MCQueryApiBuilder.create(ivR));
			}
		}

		/**
		 * 与信戻す
		 */
		protected void updCred() {
			//取引区分が「売上」の場合、与信サービス.与信更新（売掛）（MSBGL5080.Cred_Upd01）を呼出し
			if (MAC_TRD_PTN_TYP.isSLS(_cacheSloR.trd_ptn_typ())) {
				//与信額の算出
				MCNumber amt = MCNumber.ZERO;
				for (MST_SLO_D_R oldSloDR : _cacheSloDL) {
					if (oldSloDR.abort_flg() || oldSloDR.can_flg() || oldSloDR.vmi_flg()) {
						continue;
					}
					MCNumber crdAmt = getOldCrdAmt(_cacheSloR, oldSloDR);
					MAM_ITM_R itmR = getItm(oldSloDR.itm_cd(), oldSloDR.itm_sub1(), oldSloDR.itm_sub2(), oldSloDR.itm_sub3());
					if (itmR.dscnt_itm_flg()){
						crdAmt = crdAmt.multiply(-1);
					}
					amt = amt.add(crdAmt);
				}
				MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
				Cred_Upd01_CndR credRevR = Cred_Upd01_CndR.create();
				credRevR.cst_cd(_cacheSloR.cst_cd());//得意先CD
				credRevR.cur_cd(_cacheSloR.trd_cur_cd());//取引通貨ＣＤ.
				credRevR.trd_ptn_typ(_cacheSloR.trd_ptn_typ());//取引パタン区分				
				credRevR.amt(amt.negate());//算出された与信額×-1
				credRevR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				ope.up0().add(credRevR);
				ope.exec();
			}
		}

		/**
		 * 承認情報削除
		 */
		protected void callAprvService() {
			//承認提供サービス.承認情報削除
			if (up0().aprv_flg()) {
				MBBAL_AprvService.Aprv_Del01 op = MBBAL_AprvService.crtAprv_Del01();
				Aprv_Chk04_Rslt1R cndR = Aprv_Chk04_Rslt1R.create();
				cndR.peg_no(1);
				cndR.aprv_no(up0().aprv_no());
				cndR.setAttributes(up0());
				op.up0().add(cndR);
				op.exec();
			}
		}

		/**
		 * 出荷・供給依頼処理の呼び出し
		 */
		protected void callShipDmndRqstService() {
			//出荷・供給依頼サービス.出荷・供給依頼登録（MSBAL5130.ShipDmndRqst_Upd01）を実行し、出荷回答依頼、移送依頼、購買依頼を作成する。
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd01 op = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd01();
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Chk01 opChk = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Chk01();
			for (Slo_Del01_DtlR dtlR : up1()) {
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
				//キャッシュから対応する更新前の出荷進捗を取得する。
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
				// 品目詳細マスタのチェック時に使用する
				oldSloDR.addDateColumn("ship_schd_tm", oldShipPrR.ship_schd_tm());
				String oldRqstWgCd = "";
				//仕入直送の場合
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())) {
					//仕入直送の場合、発注先、仕入直送の中継場所を取得する。
					String midLocCd = "";
					//売上部門で、場所マスタから場所CDを取得し
					midLocCd = MSUCL_SlsUtil.getMidLocCd(_cacheSloR.sls_dpt_cd(), _cacheSloR.slo_dt());
					//場所マスタからWG_CDを取得する。
					MAM_LOC_R midlocR = getLoc(midLocCd);
					if (isSame(_sysParm, "1")) {
						oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR, midlocR.wg_cd());
					} else {
						oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR, midlocR.wg_cd(), _cacheSloR.sls_dpt_cd());
					}
					if (isSame(oldRqstWgCd, "") || isNull(oldRqstWgCd)) {
						oldRqstWgCd = midlocR.wg_cd();
					}

					ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR.create();
					//データ更新区分
					rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					//紐付け番号
					rqstR.peg_no(dtlR.peg_no());
					//ＷＧ間依頼種類区分
					rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
					//ＷＧ間依頼作成元区分
					rqstR.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.SLO.value());
					//ＷＧ間依頼元識別ＮＯ
					rqstR.wg_rqst_src_no(oldSloDR.slo_d_no());
					rqstR.slo_d_no(oldSloDR.slo_d_no());
					//依頼元ワーキンググループＣＤ
					rqstR.rqst_fr_wg_cd(_cacheSloR.wg_cd());
					//依頼先ワーキンググループＣＤ
					rqstR.rqst_to_wg_cd(oldRqstWgCd);
					rqstR.cred_no_up_flg(true);
					//納品先ＣＤ
					rqstR.dlv_cd(oldSloDR.dlv_cd());
					//依頼先場所ＣＤ
					rqstR.gi_loc_cd(oldSloDR.rqst_to_loc_cd());
					//発注先ＣＤ
					rqstR.sppl_cd(oldSloDR.sppl_cd());
					//メーカＣＤ
					rqstR.maker_cd(oldSloDR.maker_cd());
					rqstR.gr_loc_cd(midLocCd); //入庫場所ＣＤ
					rqstR.gr_rqst_tm(oldSloDR.dlv_rqst_tm()); //入庫依頼日時
					rqstR.avl_schd_dt(oldSloDR.dlv_rqst_tm()); //使用可能予定日
					rqstR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
					rqstR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
					rqstR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
					rqstR.itm_sub3(oldSloDR.itm_sub3()); //枝番３
					//得意先CD			
					rqstR.cst_cd(_cacheSloR.cst_cd());
					//依頼元部門
					rqstR.rqst_fr_dpt_cd(_cacheSloR.sls_dpt_cd());
					rqstR.setAttributes(dtlR);
					op.up0().add(rqstR);
					ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
					copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
					opChk.up0().add(rqstChkR);
				}
				else {
					//手配依頼以外の場合、明細の場所、或は通常場所のWG_CDを取得
					MAM_LOC_R locR = getLoc(nvl(oldSloDR.loc_cd(), oldSloDR.def_loc_cd()));
					oldRqstWgCd = locR.wg_cd();

					//手配区分が「手配依頼」の場合、
					if (MAC_SLO_PROC_TYP.isPROC(oldSloDR.proc_typ())) {
						ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR
								.create();
						//データ更新区分
						rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						//紐付け番号
						rqstR.peg_no(dtlR.peg_no());
						
						String oldfrWgCd = oldRqstWgCd;
						//購買依頼の場合
						if (!isNull(oldSloDR.sppl_cd())) {
							if (isSame(_sysParm, "1")) {
								oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR,
								oldfrWgCd);
							} else {
								oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR,
								oldfrWgCd, _cacheSloR.sls_dpt_cd());
							}
							//ＷＧ間依頼種類区分
							rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
							if (isSame(oldRqstWgCd, "") || isNull(oldRqstWgCd)) {
								oldRqstWgCd = oldfrWgCd;
							}
						}
						//移送依頼の場合
						if (!isNull(oldSloDR.rqst_to_loc_cd())) {
							MAM_LOC_R rqstToLoc = getLoc(oldSloDR.rqst_to_loc_cd());
							oldRqstWgCd = rqstToLoc.wg_cd();
							rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
							rqstR.gr_rqst_tm(oldShipPrR.ship_schd_tm()); //入庫依頼日時
						}
						
						//ＷＧ間依頼作成元区分
						rqstR.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.SLO.value());
						//ＷＧ間依頼元識別ＮＯ
						rqstR.wg_rqst_src_no(oldSloDR.slo_d_no());
						rqstR.slo_d_no(oldSloDR.slo_d_no());
						//依頼元ワーキンググループＣＤ
						rqstR.rqst_fr_wg_cd(_cacheSloR.wg_cd());
						//依頼先ワーキンググループＣＤ
						rqstR.rqst_to_wg_cd(oldRqstWgCd);
						rqstR.cred_no_up_flg(true);
						//依頼先場所ＣＤ
						rqstR.gi_loc_cd(oldSloDR.rqst_to_loc_cd());
						//発注先ＣＤ
						rqstR.sppl_cd(oldSloDR.sppl_cd());
						//メーカＣＤ
						rqstR.maker_cd(oldSloDR.maker_cd());
						rqstR.gr_loc_cd(nvl(oldSloDR.loc_cd(), oldSloDR.def_loc_cd())); //入庫場所ＣＤ
						rqstR.avl_schd_dt(oldShipPrR.ship_schd_tm()); //使用可能予定日
						rqstR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
						rqstR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
						rqstR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
						rqstR.itm_sub3(oldSloDR.itm_sub3()); //枝番３
						
						//依頼元部門
						rqstR.rqst_fr_dpt_cd(_cacheSloR.sls_dpt_cd());
						rqstR.setAttributes(dtlR);
						op.up0().add(rqstR);
						ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR
								.create();
						copy(rqstChkR, rqstR,
								createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
						opChk.up0().add(rqstChkR);
					}
					//手配区分が「引当後手配」の場合、引当後在庫不足が存在する場合のみ作成
					if (MAC_SLO_PROC_TYP.isALLOC_PROC(oldSloDR.proc_typ())) {
						//更新前の依頼数を取得
						MCNumber notAlcQty = oldSloDR.rqst_qty();
						if (isNull(notAlcQty)){
							notAlcQty = MCNumber.ZERO;
						}
						if (notAlcQty.isPositive()) {
							ShipDmndRqst_Upd01_DtlR rqstR = ShipDmndRqst_Upd01_DtlR
									.create();
							//データ更新区分
							rqstR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							//紐付け番号
							rqstR.peg_no(dtlR.peg_no());
							String oldfrWgCd = oldRqstWgCd;
							//購買依頼の場合
							if (!isNull(oldSloDR.sppl_cd())) {
								if (isSame(_sysParm, "1")) {
									oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR,
									oldfrWgCd);
								} else {
									oldRqstWgCd = getRqstToWgCd(_cacheSloR.slo_dt(), oldSloDR,
									oldfrWgCd, _cacheSloR.sls_dpt_cd());
								}
								//ＷＧ間依頼種類区分
								rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
								if (isSame(oldRqstWgCd, "") || isNull(oldRqstWgCd)) {
									oldRqstWgCd = oldfrWgCd;
								}
							}
							//移送依頼の場合
							if (!isNull(oldSloDR.rqst_to_loc_cd())) {
								MAM_LOC_R rqstToLoc = getLoc(oldSloDR.rqst_to_loc_cd());
								oldRqstWgCd = rqstToLoc.wg_cd();
								rqstR.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
								rqstR.gr_rqst_tm(oldShipPrR.ship_schd_tm()); //入庫依頼日時
							}
							
							//ＷＧ間依頼作成元区分
							rqstR.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.SLO.value());
							//ＷＧ間依頼元識別ＮＯ
							rqstR.wg_rqst_src_no(oldSloDR.slo_d_no());
							rqstR.slo_d_no(oldSloDR.slo_d_no());
							//依頼元ワーキンググループＣＤ
							rqstR.rqst_fr_wg_cd(_cacheSloR.wg_cd());
							//依頼先ワーキンググループＣＤ
							rqstR.rqst_to_wg_cd(oldRqstWgCd);	
							rqstR.cred_no_up_flg(true);
							//依頼先場所ＣＤ
							rqstR.gi_loc_cd(oldSloDR.rqst_to_loc_cd());
							//発注先ＣＤ
							rqstR.sppl_cd(oldSloDR.sppl_cd());
							//メーカＣＤ
							rqstR.maker_cd(oldSloDR.maker_cd());
							rqstR.gr_loc_cd(nvl(oldSloDR.loc_cd(), oldSloDR.def_loc_cd())); //入庫場所ＣＤ
							rqstR.avl_schd_dt(oldShipPrR.ship_schd_tm()); //使用可能予定日
							rqstR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
							rqstR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
							rqstR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
							rqstR.itm_sub3(oldSloDR.itm_sub3()); //枝番３
							
							//依頼元部門
							rqstR.rqst_fr_dpt_cd(_cacheSloR.sls_dpt_cd());
							rqstR.setAttributes(dtlR);
							op.up0().add(rqstR);
							ShipDmndRqst_Chk01_DtlR rqstChkR = ShipDmndRqst_Chk01_DtlR.create();
							copy(rqstChkR, rqstR, createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR());
							opChk.up0().add(rqstChkR);
						}
					}
				}
			}
			//出荷・供給依頼チェックサービスを実行する。
			if (!opChk.up0().isEmpty()) {
				// 取消時はpeg_noが渡ってこないので振り直す。
				setPegNo(opChk.up0());
				opChk.exec();
			}
			throwUpdErr();
			//出荷・供給依頼サービスを実行する。
			if (!op.up0().isEmpty()) {
				// 取消時はpeg_noが渡ってこないので振り直す。
				setPegNo(op.up0());
				op.exec();
			}
		}

		/**
		 * .出荷予定サービスの呼び出し
		 */
		protected void callShipSchdService() {
			//出荷進捗、出荷予定、出荷引当状況の作成のため、出荷予定サービス.更新（出荷進捗・予定）（MSBEL5500.ShipSchd_Upd01）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Upd01 op = MSBEL_ShipSchdService.crtShipSchd_Upd01();
			for (Slo_Del01_DtlR dtlR : up1()) {
				//出荷予定サービスの上り電文.ShipSchd_Dtlの削除レコードを作成する。
				//上り電文（ShipPr_Dtl）の設定
				ShipPr_DtlR prR = ShipPr_DtlR.create();
				prR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				prR.ship_pr_no(dtlR.ship_pr_no());
				prR.trd_ptn_typ(_cacheSloR.trd_ptn_typ());
				prR.cred_no_up_flg(true);
				prR.setAttributes(dtlR);
				op.up0().add(prR);
			}
			
			if (op.up0().size() > 0) {
				op.exec();
			}
		}		
		
		/**
		 * 納入指示受領登録サービスを呼出す
		 */
		protected void callDlvInstRcptService(){
			MSBBL_DlvInstRcptService.DlvInstRcv_Upd01 opDlv = MSBBL_DlvInstRcptService
					.crtDlvInstRcv_Upd01();
			for (Slo_Del01_DtlR dtlR : up1()) {
				//受注明細に対応する納入指示受領にデータが存在するかを調べる。
				MCList<MST_DLV_INST_RCPT_R> dlvInstRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
				MST_DLV_INST_RCPT_R t = MST_DLV_INST_RCPT_R.create("T");
				MCQueryApiBuilder dlvInstRcptL_bldr = MCQueryApiBuilder.create(t);
				dlvInstRcptL_bldr.setWhere(t.slo_d_no.eq(bind("1")), dtlR.slo_d_no());
				dlvInstRcptL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
				dbSelect("MSBBL6020_MST_DLV_INST_RCPT_S05", dlvInstRcptL, dlvInstRcptL_bldr);

				//納入指示受領を削除するため、納入指示受領サービスの上り電文作成
				for (MST_DLV_INST_RCPT_R r : dlvInstRcptL) {
					DlvInstRcv_Upd01_DtlR dlvR = DlvInstRcv_Upd01_DtlR.create();
					dlvR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					dlvR.dlv_inst_rcpt_no(r.dlv_inst_rcpt_no());
					dlvR.dlv_inst_rcpt_rev(r.dlv_inst_rcpt_rev());
					dlvR.slo_d_no(dtlR.slo_d_no());
					dlvR.slo_upd_flg(true);
					opDlv.up0().add(dlvR);
				}
			}
					
			if (!opDlv.up0().isEmpty()) {
				opDlv.exec();
			}
		}
		

		/**
		 * インボイスNO発番
		 * @param hdr
		 */
		protected void setupIVNo(Slo_Upd01_HdrR hdr){
			//得意先がインボイス取引対象の場合			
			if (!isSame(_cacheSloR.iv_no(), hdr.iv_no())) {
				if (!isNull(_cacheSloR.iv_no())){
					MST_IV_NO_R ivR = MST_IV_NO_R.create("T");
					ivR.iv_no(_cacheSloR.iv_no());
					dbDeleteKey("MSBBL6020_MST_IV_NO_D03", ivR, MCQueryApiBuilder.create(ivR));
				}
				if (hdr.cst_iv_flg()) {
					if (hdr.iv_num_flg()) {
						ElmArgsR elm = ElmArgsR.create();
						elm.co_cd(getCo().co_cd());
						elm.dt(getToday());
						//I/V_NO　の発番					
						hdr.iv_no(getNumIv(elm, null));
					}
					else if (!isNull(hdr.iv_no())) {
						//I/V_NO　の発番					
						hdr.iv_no(getNumIv(null, hdr.iv_no()));
					}
					else {
						hdr.iv_no(null);
					}
				}
				else {
					hdr.iv_no(null);
				}
			}
		}
		

		/**
		 * 売上予定の更新
		 */
		protected void delSlsSchd() {
			//IV取引の場合、売上予定を作成する。
			MAM_BP_R bpR = getBp(_cacheSloR.cst_cd());
			if (bpR.cst_iv_flg()) {
				MSBBL_SlsSchdService.Sls_Schd_Upd01 op = MSBBL_SlsSchdService
						.crtSls_Schd_Upd01();
				for (Slo_Del01_DtlR dtlR : up1()) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
					//仕入直送の場合は対象外とする。
					if (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())) {
						Sls_Schd_Upd01_DtlR slsSchdR = Sls_Schd_Upd01_DtlR.create();
						slsSchdR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());//売上予定作成元区分
						slsSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						slsSchdR.slo_d_no(dtlR.slo_d_no());//受注明細ＮＯ
						slsSchdR.cred_no_up_flg(true);//与信更新無ＦＬＧ
						op.up0().add(slsSchdR);
					}
				}

				if (!op.up0().isEmpty()) {
					op.exec();
				}
			}
		}
		

		/**
		 * 受注状況更新
		 */
		protected void callSloStsReg() {			
			MSBBL_SloStsRegService.SloSts_Ins01 stsRegOp = MSBBL_SloStsRegService
					.crtSloSts_Ins01();
			for (Slo_Del01_DtlR dtlR : up1()) {
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
				SloSts_DtlR stsR = SloSts_DtlR.create();
				copy(stsR, oldSloDR, _cacheSloR, createMap_SloSts_DtlR_MST_SLO_R());
				stsRegOp.up0().add(stsR);
			}
			if (!stsRegOp.up0().isEmpty()) {
				stsRegOp.exec();
			}
		}

		protected void updQtn() {
			// 見積引継ぎの場合、登録対象の明細の電文の見積明細NOで、見積明細（MST_QTN_D）を更新する。
			// 更新項目は、受注引継数量（SLO_TRNSIT_QTY）。当該受注明細データの入力単位数量を減算する。
			// ※現時点の仕様では、見積引継ぎの場合、受注画面で引継ぎでない新規明細を追加できる仕様になっていない。したがって、必ず更新できるはずとなる。
			// 基本的には、更新できなければデータ不整合のエラーになる。
			if (!isNull(up0().qtn_no())) {
				updQtnDSub();
			}
		}

		/**
		 * 見積明細の更新の実処理
		 * 
		 */
		protected void updQtnDSub() {

			MCList<MST_QTN_D_R> orgQtnDL = MCList.create(MST_QTN_D_R.class);
			MST_QTN_D_R orgQtnDL_t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder orgQtnDL_bldr = MCQueryApiBuilder.create(orgQtnDL_t);
			orgQtnDL_bldr.setSelect(orgQtnDL_t.qtn_d_no);
			orgQtnDL_bldr.addSelect(orgQtnDL_t.slo_trnst_qty);
			dbSelectKeyForUpdate("MSBBL6020_MST_QTN_D_S04", orgQtnDL, orgQtnDL_bldr, _cacheSloDL);

			MCJoinKey<MCList<MST_QTN_D_R>> jk;
			jk = _cacheSloDL.join(MST_QTN_D_R.$qtn_d_no, orgQtnDL, MST_QTN_D_R.$qtn_d_no);

			MCList<MST_QTN_D_R> updQtnDL = MCList.create(MST_QTN_D_R.class);

			for (MST_SLO_D_R r : _cacheSloDL) {
				// 見積引継の受注明細以外は対象外
				if (isNull(r.qtn_d_no())) {
					continue;
				}

				MST_QTN_D_R qtndR = r.getJoinedRow(jk);
				if (qtndR == null) {
					throw new MCAppException(r, null, MSBBL0173, r.slo_d_no(), r.qtn_d_no());
				}
				MCNumber oldQty = qtndR.slo_trnst_qty();
				if (oldQty == null) {
					oldQty = MCNumber.ZERO;
				}
				MCNumber newQty = oldQty.subtract(r.trd_unit_qty());
				qtndR.slo_trnst_qty(newQty);
				updQtnDL.add(qtndR);
			}

			MST_QTN_D_R updQtnDL_t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder updQtnDL_bldr = MCQueryApiBuilder.create(updQtnDL_t);
			updQtnDL_bldr.setSet(updQtnDL_t.slo_trnst_qty);
			dbUpdateKey("MSBBL6020_MST_QTN_D_U03", updQtnDL, updQtnDL_bldr);
		}

		/**
		 * 受注情報及び受注明細情報の論理削除
		 */
		protected void delSloSloDMain() {
			delSlo();
			delSloD();
			// 改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
			updSloPR(_cacheSloR);
		}

		/**
		 * 受注情報を論理削除する
		 */
		protected void delSlo() {
			//ヘッダの削除ＦＬＧ更新
			_cacheSloR.can_flg(true);
			_cacheSloR.can_rsn_cd(up0().can_rsn_cd());
			_cacheSloR.can_rmrks(up0().can_rmrks());
			_cacheSloR_bldr.setSet(_cacheSloR_t.can_flg);
			_cacheSloR_bldr.addSet(_cacheSloR_t.can_rsn_cd);
			_cacheSloR_bldr.addSet(_cacheSloR_t.can_rmrks);
			dbUpdateKey("MSBBL6020_MST_SLO_U04", _cacheSloR, _cacheSloR_bldr);
		}

		/**
		 * 受注明細情報を論理削除する
		 */
		protected void delSloD() {
			//明細の削除ＦＬＧ更新
			_cacheSloDL.setBoolean("can_flg", true);
			_cacheSloDL_bldr.setSet(_cacheSloDL_t.can_flg);
			dbUpdateKey("MSBBL6020_MST_SLO_D_U06", _cacheSloDL, _cacheSloDL_bldr);
		}

		/**
		 * 受注明細ロック
		 * @return
		 */
		protected MCList<MST_SLO_D_R> lockSloD() {
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			sloDL_bldr.setWhere(t.slo_no.eq(bind("1")), up0().slo_no());
			sloDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelectForUpdate("MSBBL6020_MST_SLO_D_S06", sloDL, sloDL_bldr);
			return sloDL;
		}
		
		/**
		 * 	見積が承認対象だった場合、承認提供サービスを実行し、承認情報の承認次処理済ＦＬＧを更新する。
		 */
		protected void callAprvSvUpd03() {

			if (isNull(up0().qtn_no()) || !up0().qtn_aprv_flg()) {
				return;
			}
			
			if (!MSUCL_SlsUtil.isQtnNextOper(up0().qtn_no(), up0().qtn_rev())) {
				
				MBBAL_AprvService.Aprv_Upd03 ope = MBBAL_AprvService.crtAprv_Upd03();
				
				Aprv_Chk02_Rslt1R up = ope.up0().createRow();
				
				up.aprv_no(up0().qtn_aprv_no());
				ope.up0().add(up);
				
				ope.exec();
			}
		}
	}


	protected Map_Aprv_Chk01_Rslt1R_Slo_Upd01_HdrR<Aprv_Chk01_Rslt1R, Slo_Upd01_HdrR> createMap_Aprv_Chk01_Rslt1R_Slo_Upd01_HdrR() {
		return new Map_Aprv_Chk01_Rslt1R_Slo_Upd01_HdrR<Aprv_Chk01_Rslt1R, Slo_Upd01_HdrR>();
	}

	public class Map_Aprv_Chk01_Rslt1R_Slo_Upd01_HdrR<D extends Aprv_Chk01_Rslt1R, S extends Slo_Upd01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.aprv_no(src.old_aprv_no()); //承認ＮＯ
			dest.peg_no(src.peg_no()); //紐付けＮＯ
			dest.biz_usr_cd(src.sls_usr_cd()); //業務担当者ＣＤ
			dest.master_dt(src.slo_dt()); //承認マスタ適用日
			dest.aprv_func_typ(MAC_APRV_FUNC_TYP.SLO.value()); //承認機能区分
			dest.src_dpt_cd(src.sls_dpt_cd()); //承認作成元部門ＣＤ
			dest.src_bp_cd(src.cst_cd()); //承認作成元取引先ＣＤ
			dest.src_cur_cd1(src.trd_cur_cd()); //承認作成元通貨ＣＤ１
			if (!isNull(src.trd_cur_amt()) && !isNull(src.trd_cur_tax_amt())) {
				dest.src_amt1(src.trd_cur_amt().add(src.trd_cur_tax_amt())); //承認作成元金額１
			}
			dest.aprv_src_no1(src.slo_no()); //承認作成元ＮＯ１
		}
	}
	

	protected Map_SloSts_DtlR_MST_SLO_D_R<SloSts_DtlR, MST_SLO_D_R, MST_SLO_R> createMap_SloSts_DtlR_MST_SLO_R() {
		return new Map_SloSts_DtlR_MST_SLO_D_R<SloSts_DtlR, MST_SLO_D_R, MST_SLO_R>();
	}

	public class Map_SloSts_DtlR_MST_SLO_D_R<D extends SloSts_DtlR, S extends MST_SLO_D_R, W extends MST_SLO_R>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _hdrR;

		@Override
		public void setWith(W dtlR) {
			this._hdrR = dtlR;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			dest.slo_sts_typ(MSC_SLO_STS_TYP.SLO_CAN.value()); //受注状況区分		
		}
	}	

	protected Map_SloSts_DtlR_Slo_Upd01_DtlR<SloSts_DtlR, Slo_Upd01_DtlR, Slo_Upd01_HdrR> createMap_SloSts_DtlR_Slo_Upd01_DtlR() {
		return new Map_SloSts_DtlR_Slo_Upd01_DtlR<SloSts_DtlR, Slo_Upd01_DtlR, Slo_Upd01_HdrR>();
	}

	public class Map_SloSts_DtlR_Slo_Upd01_DtlR<D extends SloSts_DtlR, S extends Slo_Upd01_DtlR, W extends Slo_Upd01_HdrR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _hdrR;

		@Override
		public void setWith(W dtlR) {
			this._hdrR = dtlR;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.SLO.value()); //受注状況区分
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.SLO_CAN.value()); //受注状況区分
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				MST_SLO_D_R oldSloDR = getFirstSloDCache(src.slo_d_no());
				//受注打切り
				if (src.abort_flg()){
					dest.slo_sts_typ(MSC_SLO_STS_TYP.SLO_ABORT.value()); //受注状況区分
				}
				//受注打切り取消
				else if (oldSloDR.abort_flg()){
					dest.slo_sts_typ(MSC_SLO_STS_TYP.SLO_ABORT_CAN.value()); //受注状況区分
				}
				else {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.SLO_UPD.value()); //受注状況区分
				}
			}
			else{
				dest.slo_sts_typ(MSC_SLO_STS_TYP.SLO_UPD.value()); //受注状況区分
			}
			
			if (!(MSC_SLO_STS_TYP.isSLO_CAN(dest.slo_sts_typ()) ||
					MSC_SLO_STS_TYP.isSLO_ABORT(dest.slo_sts_typ()) ||
					MSC_SLO_STS_TYP.isSLO_ABORT_CAN(dest.slo_sts_typ()))) {
				dest.unit_cd(src.trd_unit_cd()); //単位ＣＤ
				dest.qty(src.trd_unit_qty()); //数量
				dest.upri(src.trd_cur_upri()); //単価
				dest.cur_cd(_hdrR.trd_cur_cd());
				dest.amt(src.trd_cur_amt()); //金額
				dest.tax_cd(src.tax_cd()); //税ＣＤ
				dest.tax_amt(src.trd_cur_tax_amt()); //税額	
				dest.slo_prms_rev(null); //受注納期回答改訂番号
				dest.iv_no(null); //インボイスＮＯ
				dest.iv_d_no(null); //インボイス明細ＮＯ
				dest.rcpt_iv_no(null); //受領インボイスＮＯ
				dest.dlv_slip_no(null); //納品書ＮＯ
				dest.dlv_slip_d_no(null); //納品書明細ＮＯ
				dest.bill_no(null); //請求書ＮＯ
				dest.ac_dt(null); //計上日
				dest.biz_tm(_hdrR.slo_dt()); //業務実施日時
				dest.st_schd_tm(null); //着手予定日時
				dest.end_schd_tm(null); //完了予定日時
				dest.st_act_tm(null); //着手実績日時
				dest.end_act_tm(null); //完了実績日時
				dest.ship_inst_no(null); //出荷指図ＮＯ
				dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
				dest.arr_act_no(null); //入荷実績NO
				dest.sls_act_no(null); //売上実績ＮＯ
				dest.sls_act_d_no(null); //売上実績明細ＮＯ
				dest.po_no(null); //発注ＮＯ
				dest.po_d_no(null); //発注明細ＮＯ
				dest.purc_act_no(null); //仕入実績ＮＯ
				dest.purc_act_d_no(null); //仕入実績明細ＮＯ
			}
		}
	}
			

	protected Map_MSW_SHIP_SCHD_DT_CALC_R_Slo_Upd01_DtlR<MSW_SHIP_SCHD_DT_CALC_R, Slo_Upd01_DtlR> createMap_MSW_SHIP_SCHD_DT_CALC_R_Slo_Upd01_DtlR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_Slo_Upd01_DtlR<MSW_SHIP_SCHD_DT_CALC_R, Slo_Upd01_DtlR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_Slo_Upd01_DtlR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends Slo_Upd01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no());  //紐付けＮＯ
			if (!isNull(src.tdlv_cd())){
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());  //送付先識別区分
				dest.ship_to_id_cd(src.tdlv_cd());  //送付先識別ＣＤ
				dest.ship_to_lg_grp_cd(src.tdlv_lg_grp_cd());  //出荷先物流グループＣＤ
			}else{
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value());  //送付先識別区分
				dest.ship_to_id_cd(src.dlv_cd());  //送付先識別ＣＤ
				dest.ship_to_lg_grp_cd(src.dlv_lg_grp_cd());  //出荷先物流グループＣＤ
			}
			
			//出荷元物流グループＣＤ
			if (isNull(src.ship_lg_grp_cd())) {
				MAM_LOC_R locR = getLoc(nvl(src.loc_cd(), src.def_loc_cd()));
				
				dest.ship_fr_lg_grp_cd(locR.lg_grp_cd());
			}
			else {
				dest.ship_fr_lg_grp_cd(src.ship_lg_grp_cd());
			}
			dest.ship_term_cd(src.ship_term_cd());  //出荷条件ＣＤ
			//配送先経由区分が「経由する」の場合は設定しない。
			if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())){
				dest.dlv_rqst_tm(null);  //納入希望日時
			}
			else {
				dest.dlv_rqst_tm(src.dlv_rqst_tm());  //納入希望日時
			}
			dest.dlv_day_week_typ(src.dlv_day_week_typ());  //着曜日
			dest.ship_rqst_tm(src.ship_rqst_tm());  //出荷希望日時
			dest.ship_inst_typ(src.ship_inst_typ());  //出荷指図区分			
			dest.cl_time_chk_flg(true);  //締時間チェックＦＬＧ
			dest.ship_dt_chk_flg(true);  //出荷日チェックＦＬＧ
			dest.ship_cal_cd_chk_flg(true);
			dest.early_ship_dt_add_days_chk_flg(true);
		}
	}

	protected Map_MST_SLO_R_Slo_Upd01_HdrR<MST_SLO_R, Slo_Upd01_HdrR> createMap_MST_SLO_R_Slo_Upd01_HdrR() {
		return new Map_MST_SLO_R_Slo_Upd01_HdrR<MST_SLO_R, Slo_Upd01_HdrR>();
	}

	public class Map_MST_SLO_R_Slo_Upd01_HdrR<D extends MST_SLO_R, S extends Slo_Upd01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SLO_R.$slo_no, Slo_Upd01_HdrR.$slo_no);
			addColumnPathMap(MST_SLO_R.$trd_cd, Slo_Upd01_HdrR.$trd_cd); //取引ＣＤ
			addColumnPathMap(MST_SLO_R.$trd_ptn_typ, Slo_Upd01_HdrR.$trd_ptn_typ); //取引パタン区分
			addColumnPathMap(MST_SLO_R.$slo_dt, Slo_Upd01_HdrR.$slo_dt); //受注日
			addColumnPathMap(MST_SLO_R.$slo_typ, Slo_Upd01_HdrR.$slo_typ); //受注区分
			addColumnPathMap(MST_SLO_R.$cst_cd, Slo_Upd01_HdrR.$cst_cd); //得意先ＣＤ
			addColumnPathMap(MST_SLO_R.$cst_po_no, Slo_Upd01_HdrR.$cst_po_no); //得意先注文ＮＯ
			addColumnPathMap(MST_SLO_R.$cst_po_rev, Slo_Upd01_HdrR.$cst_po_rev); //得意先注文改訂番号
			addColumnPathMap(MST_SLO_R.$trd_cur_cd, Slo_Upd01_HdrR.$trd_cur_cd); //取引通貨ＣＤ
			addColumnPathMap(MST_SLO_R.$xrate_inpt_flg, Slo_Upd01_HdrR.$xrate_inpt_flg); //為替レート指定ＦＬＧ
			addColumnPathMap(MST_SLO_R.$xrate, Slo_Upd01_HdrR.$xrate); //為替レート
			addColumnPathMap(MST_SLO_R.$ptax_xrate_inpt_flg,
					Slo_Upd01_HdrR.$ptax_xrate_inpt_flg); //納税為替レート指定ＦＬＧ
			addColumnPathMap(MST_SLO_R.$ptax_xrate, Slo_Upd01_HdrR.$ptax_xrate); //納税為替レート
			addColumnPathMap(MST_SLO_R.$sls_usr_cd, Slo_Upd01_HdrR.$sls_usr_cd); //売上担当者ＣＤ
			addColumnPathMap(MST_SLO_R.$sls_dpt_cd, Slo_Upd01_HdrR.$sls_dpt_cd); //売上部門ＣＤ
			addColumnPathMap(MST_SLO_R.$wg_cd, Slo_Upd01_HdrR.$wg_cd); //ワーキンググループＣＤ
			addColumnPathMap(MST_SLO_R.$iv_no, Slo_Upd01_HdrR.$iv_no); //インボイスＮＯ
			addColumnPathMap(MST_SLO_R.$tterm_cd1, Slo_Upd01_HdrR.$tterm_cd1); //取引条件ＣＤ１
			addColumnPathMap(MST_SLO_R.$tterm_rmrks1, Slo_Upd01_HdrR.$tterm_rmrks1); //取引条件備考１
			addColumnPathMap(MST_SLO_R.$tterm_cd2, Slo_Upd01_HdrR.$tterm_cd2); //取引条件ＣＤ２
			addColumnPathMap(MST_SLO_R.$tterm_rmrks2, Slo_Upd01_HdrR.$tterm_rmrks2); //取引条件備考２
			addColumnPathMap(MST_SLO_R.$tterm_cd3, Slo_Upd01_HdrR.$tterm_cd3); //取引条件ＣＤ３
			addColumnPathMap(MST_SLO_R.$tterm_rmrks3, Slo_Upd01_HdrR.$tterm_rmrks3); //取引条件備考３
			addColumnPathMap(MST_SLO_R.$trnspt_cd, Slo_Upd01_HdrR.$trnspt_cd); //輸送方法ＣＤ
			addColumnPathMap(MST_SLO_R.$vssl_flght, Slo_Upd01_HdrR.$vssl_flght); //船名／便名
			addColumnPathMap(MST_SLO_R.$load_port_cd, Slo_Upd01_HdrR.$load_port_cd); //船積港ＣＤ
			addColumnPathMap(MST_SLO_R.$etd_dt, Slo_Upd01_HdrR.$etd_dt); //船積予定日
			addColumnPathMap(MST_SLO_R.$dschrg_port_cd, Slo_Upd01_HdrR.$dschrg_port_cd); //船卸港ＣＤ
			addColumnPathMap(MST_SLO_R.$eta_dt, Slo_Upd01_HdrR.$eta_dt); //船卸予定日
			addColumnPathMap(MST_SLO_R.$via_port_cd, Slo_Upd01_HdrR.$via_port_cd); //経由地ＣＤ
			addColumnPathMap(MST_SLO_R.$via_schd_dt, Slo_Upd01_HdrR.$via_schd_dt); //経由予定日
			addColumnPathMap(MST_SLO_R.$assort_typ, Slo_Upd01_HdrR.$assort_typ); //品揃区分
			addColumnPathMap(MST_SLO_R.$sls_basis_typ, Slo_Upd01_HdrR.$sls_basis_typ); //売上計上区分
			addColumnPathMap(MST_SLO_R.$ar_dpt_cd, Slo_Upd01_HdrR.$ar_dpt_cd); //債権部門ＣＤ
			addColumnPathMap(MST_SLO_R.$wrk_no, Slo_Upd01_HdrR.$wrk_no); //案件ＮＯ
			addColumnPathMap(MST_SLO_R.$rcpt_dt, Slo_Upd01_HdrR.$rcpt_dt); //受付日
			addColumnPathMap(MST_SLO_R.$rcpt_usr_cd, Slo_Upd01_HdrR.$rcpt_usr_cd); //受付担当者ＣＤ
			addColumnPathMap(MST_SLO_R.$trd_rmrks, Slo_Upd01_HdrR.$trd_rmrks); //取引備考
			addColumnPathMap(MST_SLO_R.$intr_rmrks, Slo_Upd01_HdrR.$intr_rmrks); //内部備考
			addColumnPathMap(MST_SLO_R.$cst_po_rmrks, Slo_Upd01_HdrR.$cst_po_rmrks); //得意先注文備考
			addColumnPathMap(MST_SLO_R.$qtn_no, Slo_Upd01_HdrR.$qtn_no); //見積ＮＯ
			addColumnPathMap(MST_SLO_R.$qtn_rev, Slo_Upd01_HdrR.$qtn_rev); //見積改訂番号
			addColumnPathMap(MST_SLO_R.$adv_ship_ctrl_typ,
					Slo_Upd01_HdrR.$adv_ship_ctrl_typ); //前受金出荷制御区分
			addColumnPathMap(MST_SLO_R.$adv_bill_amt, Slo_Upd01_HdrR.$adv_bill_amt); //前受金請求額
			addColumnPathMap(MST_SLO_R.$sub_char1, Slo_Upd01_HdrR.$sub_char1); //予備１
			addColumnPathMap(MST_SLO_R.$sub_char2, Slo_Upd01_HdrR.$sub_char2); //予備２
			addColumnPathMap(MST_SLO_R.$sub_char3, Slo_Upd01_HdrR.$sub_char3); //予備３
			addColumnPathMap(MST_SLO_R.$aprv_flg, Slo_Upd01_HdrR.$aprv_flg); //承認対象ＦＬＧ
			addColumnPathMap(MST_SLO_R.$aprv_no, Slo_Upd01_HdrR.$aprv_no); //承認ＮＯ
			addColumnPathMap(MST_SLO_R.$aprv_sts_typ, Slo_Upd01_HdrR.$aprv_sts_typ); //承認状況区分
			addColumnPathMap(MST_SLO_R.$edi_flg, Slo_Upd01_HdrR.$edi_flg); //ＥＤＩ ＦＬＧ
			addColumnPathMap(MST_SLO_R.$edi_sub_char1, Slo_Upd01_HdrR.$edi_sub_char1);
			addColumnPathMap(MST_SLO_R.$edi_sub_char2, Slo_Upd01_HdrR.$edi_sub_char2);
			addColumnPathMap(MST_SLO_R.$edi_sub_char3, Slo_Upd01_HdrR.$edi_sub_char3);
			addColumnPathMap(MST_SLO_R.$edi_sub_char4, Slo_Upd01_HdrR.$edi_sub_char4);
			addColumnPathMap(MST_SLO_R.$edi_sub_char5, Slo_Upd01_HdrR.$edi_sub_char5);
			addColumnPathMap(MST_SLO_R.$edi_sub_num1, Slo_Upd01_HdrR.$edi_sub_num1);
			addColumnPathMap(MST_SLO_R.$edi_sub_dt1, Slo_Upd01_HdrR.$edi_sub_dt1);
		}
	}

	protected Map_MST_SLO_D_R_Slo_Upd01_DtlR<MST_SLO_D_R, Slo_Upd01_DtlR, MST_SLO_R> createMap_MST_SLO_D_R_Slo_Upd01_DtlR() {
		return new Map_MST_SLO_D_R_Slo_Upd01_DtlR<MST_SLO_D_R, Slo_Upd01_DtlR, MST_SLO_R>();
	}

	public class Map_MST_SLO_D_R_Slo_Upd01_DtlR<D extends MST_SLO_D_R, S extends Slo_Upd01_DtlR, W extends MST_SLO_R>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _hdr;

		@Override
		public void setWith(W hdr) {
			this._hdr = hdr;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			dest.slo_no(_hdr.slo_no()); //受注ＮＯ
			dest.slo_rev(_hdr.slo_rev()); //受注改訂番号
			dest.disp_seq(src.disp_seq()); //表示順
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.itm_nm(src.itm_nm()); //品名
			dest.iv_itm_nm(src.iv_itm_nm()); //インボイス表記品名
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			dest.ver_no(src.ver_no()); //版ＮＯ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.sundry_itm_flg(src.sundry_itm_flg()); //諸口品ＦＬＧ
			//dest.comp_spec_typ(src.comp_spec_typ()); //構成・仕様管理区分
			dest.sls_itm_no(src.sls_itm_no()); //販売品目ＮＯ
			dest.ship_inst_typ(src.ship_inst_typ()); //出荷指図区分
			dest.ship_schd_split_typ(src.ship_schd_split_typ()); //出荷予定分割区分
			dest.cntry_org_cd(src.cntry_org_cd()); //原産地ＣＤ
			dest.dlv_cd(src.dlv_cd()); //納品先ＣＤ
			dest.dlv_sundry_flg(src.dlv_sundry_flg()); //納品先諸口ＦＬＧ			

			dest.dlv_nm(src.dlv_nm()); //納品先名
			dest.dlv_cntct_dpt(src.dlv_cntct_dpt()); //納品先部署
			dest.dlv_cntct_psn(src.dlv_cntct_psn()); //納品先担当者
			dest.dlv_zip_cd(src.dlv_zip_cd()); //納品先郵便番号
			dest.dlv_addr1(src.dlv_addr1()); //納品先住所１
			dest.dlv_addr2(src.dlv_addr2()); //納品先住所２
			dest.dlv_addr3(src.dlv_addr3()); //納品先住所３
			dest.dlv_addr4(src.dlv_addr4()); //納品先住所４
			dest.dlv_tel(src.dlv_tel()); //納品先ＴＥＬ
			dest.dlv_fax(src.dlv_fax()); //納品先ＦＡＸ
			dest.dlv_lg_grp_cd(src.dlv_lg_grp_cd()); //納品先物流グループＣＤ

			dest.pri_prnt_flg(src.pri_prnt_flg()); //価格印字ＦＬＧ
			dest.dest_cd1(src.dest_cd1()); //仕向先ＣＤ１
			dest.dest_cd2(src.dest_cd2()); //仕向先ＣＤ２
			dest.dest_cd3(src.dest_cd3()); //仕向先ＣＤ３
			dest.tdlv_cd(src.tdlv_cd()); //配送先ＣＤ
			dest.tdlv_sundry_flg(src.tdlv_sundry_flg()); //配送先諸口ＦＬＧ

			dest.tdlv_nm(src.tdlv_nm()); //配送先名
			dest.via_dlv_typ(src.via_dlv_typ()); //配送先経由区分
			dest.tdlv_cntct_dpt(src.tdlv_cntct_dpt()); //配送先部署
			dest.tdlv_cntct_psn(src.tdlv_cntct_psn()); //配送先担当者
			dest.tdlv_zip_cd(src.tdlv_zip_cd()); //配送先郵便番号
			dest.tdlv_addr1(src.tdlv_addr1()); //配送先住所１
			dest.tdlv_addr2(src.tdlv_addr2()); //配送先住所２
			dest.tdlv_addr3(src.tdlv_addr3()); //配送先住所３
			dest.tdlv_addr4(src.tdlv_addr4()); //配送先住所４
			dest.tdlv_tel(src.tdlv_tel()); //配送先ＴＥＬ
			dest.tdlv_fax(src.tdlv_fax()); //配送先ＦＡＸ
			dest.tdlv_lg_grp_cd(src.tdlv_lg_grp_cd()); //配送先物流グループＣＤ

			dest.dlv_day_week_typ(src.dlv_day_week_typ()); //着曜日
			dest.sls_cststk_flg(src.sls_cststk_flg()); //預り売上ＦＬＧ
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.trd_cur_upri(src.trd_cur_upri()); //取引通貨単価
			dest.upri_not_tgt_flg(src.upri_not_tgt_flg()); //単価再取得対象外ＦＬＧ
			dest.cost_upri(src.cost_upri()); //原価単価
			dest.cost_amt(MSUCL_SlsUtil.getCostAmt(src.cost_upri(), src.base_unit_qty(), getBaseCur().amt_dec_place())); //原価金額
			dest.interim_flg(src.interim_flg()); //仮単価ＦＬＧ
			dest.trd_cur_amt(src.trd_cur_amt()); //取引通貨金額
			dest.trd_cur_dscnt_amt(src.trd_cur_dscnt_amt()); //取引通貨値引額
			dest.dscnt_rsn_cd(src.dscnt_rsn_cd()); //値引理由ＣＤ
			dest.iv_upri(src.iv_upri()); //インボイス表記単価
			dest.iv_amt(src.iv_amt()); //インボイス表記金額
			dest.tax_fix_flg(src.tax_fix_flg()); //税指定ＦＬＧ
			dest.tax_cd(src.tax_cd()); //税ＣＤ
			dest.trd_cur_tax_amt(src.trd_cur_tax_amt()); //取引通貨税額
			dest.proc_typ(src.proc_typ()); //手配区分
			dest.sls_upri_req_typ(src.sls_upri_req_typ()); //販売単価取得区分
			dest.set_itm_grp_no(src.set_itm_grp_no()); //品揃グループＮＯ
			dest.ship_rqst_tm(src.ship_rqst_tm()); //出荷希望日時
			dest.dlv_rqst_tm(src.dlv_rqst_tm()); //納入希望日時
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			dest.accpt_schd_dt(src.accpt_schd_dt()); //検収予定日
			dest.rqst_to_loc_cd(src.rqst_to_loc_cd()); //依頼先場所ＣＤ
			dest.sppl_cd(src.sppl_cd()); //発注先ＣＤ
			dest.maker_cd(src.maker_cd()); //メーカＣＤ
			dest.alloc_scope_typ(src.alloc_scope_typ()); //引当範囲区分
			dest.not_lg_mix_flg(src.not_lg_mix_flg());
			dest.alloc_typ(src.alloc_typ()); //引当区分
			dest.alloc_grp_cd(src.alloc_grp_cd()); //総量引当場所グループＣＤ
			dest.ship_lg_grp_cd(src.ship_lg_grp_cd()); //出荷物流グループＣＤ
			dest.def_loc_cd(src.def_loc_cd()); //デフォルト場所ＣＤ
			dest.loc_cd(src.loc_cd()); //場所ＣＤ
			dest.str_ln_cd(src.str_ln_cd()); //棚・ラインＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.not_lot_mix_flg(src.not_lot_mix_flg());
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg());
			dest.vmi_flg(src.vmi_flg()); //貸出ＦＬＧ
			dest.wtax_rate(src.wtax_rate()); //源泉税率
			dest.wtax_amt(src.wtax_amt()); //源泉税額
			dest.wg_rqst_cnt_rmrks(src.wg_rqst_cnt_rmrks()); //依頼連絡備考
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
			dest.bill_crryovr_times(src.bill_crryovr_times()); //請求繰越回数
			dest.cst_po_d_no(src.cst_po_d_no()); //得意先注文明細ＮＯ
			dest.cst_itm_cd(src.cst_itm_cd()); //得意先品目ＣＤ
			dest.cst_itm_nm(src.cst_itm_nm()); //得意先品名
			dest.cst_po_d_rmrks(src.cst_po_d_rmrks()); //得意先注文明細備考
			dest.sls_rsn_cd(src.sls_rsn_cd()); //売上理由ＣＤ
			dest.bd_dpt_cd(src.bd_dpt_cd()); //負担部門ＣＤ
			dest.rqst_dt(src.rqst_dt()); //依頼日
			dest.rqst_dlv_rqst_dt(src.rqst_dlv_rqst_dt()); //依頼納入希望日	
			dest.qtn_no(_hdr.qtn_no()); //見積ＮＯ
			dest.qtn_rev(_hdr.qtn_rev()); //見積改訂番号
			dest.qtn_d_no(src.qtn_d_no()); //見積明細ＮＯ
			dest.ship_cnt_rmrks(src.ship_cnt_rmrks()); //出荷連絡備考
			dest.trd_d_rmrks(src.trd_d_rmrks()); //取引明細備考
			dest.intr_rmrks(src.intr_rmrks()); //内部備考
			dest.io_schd_pr_no(src.io_schd_pr_no()); // 受払進捗管理ＮＯ
			dest.sub_char1(src.sub_char1()); //予備１
			dest.sub_char2(src.sub_char2()); //予備２
			dest.sub_char3(src.sub_char3()); //予備３
			dest.itm_comp_seq(null); //構成表連番
			dest.itm_spec_seq(null); //仕様表連番
			dest.abort_flg(src.abort_flg()); //打切ＦＬＧ
			dest.can_flg(false); //取消ＦＬＧ
			dest.can_rsn_cd(null); //取消理由ＣＤ
			dest.slo_d_can_rmkrs(null); //明細取消備考
			dest.edi_sub_d_char1(src.edi_sub_d_char1());
			dest.edi_sub_d_char2(src.edi_sub_d_char2());
			dest.edi_sub_d_char3(src.edi_sub_d_char3());
			dest.edi_sub_d_char4(src.edi_sub_d_char4());
			dest.edi_sub_d_char5(src.edi_sub_d_char5());
			dest.edi_sub_d_num1(src.edi_sub_d_num1());
			dest.edi_sub_d_dt1(src.edi_sub_d_dt1());
		}
	}

	protected Map_ShipLot_DtlR_Slo_Upd01_DtlR<ShipLot_DtlR, Slo_Upd01_DtlR, Slo_Upd01_HdrR> createMap_ShipLot_DtlR_Slo_Upd01_DtlR() {
		return new Map_ShipLot_DtlR_Slo_Upd01_DtlR<ShipLot_DtlR, Slo_Upd01_DtlR, Slo_Upd01_HdrR>();
	}

	public class Map_ShipLot_DtlR_Slo_Upd01_DtlR<D extends ShipLot_DtlR, S extends Slo_Upd01_DtlR, W extends Slo_Upd01_HdrR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _hdr;

		@Override
		public void setWith(W hdr) {
			this._hdr = hdr;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no()); //紐付けＮＯ
			dest.cst_cd(_hdr.cst_cd()); //得意先ＣＤ
			dest.dlv_cd(src.dlv_cd()); //納品先ＣＤ
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.base_dt(src.dlv_schd_tm().startTimeOfDay()); //基準日	
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.slo_d_no(src.slo_d_no());
		}
	}

	protected Map_Srch_TgtR_Slo_Upd01_DtlR<Srch_TgtR, Slo_Upd01_DtlR, Slo_Upd01_HdrR> createMap_Srch_TgtR_Slo_Upd01_DtlR() {
		return new Map_Srch_TgtR_Slo_Upd01_DtlR<Srch_TgtR, Slo_Upd01_DtlR, Slo_Upd01_HdrR>();
	}

	public class Map_Srch_TgtR_Slo_Upd01_DtlR<D extends Srch_TgtR, S extends Slo_Upd01_DtlR, W extends Slo_Upd01_HdrR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _hdr;

		@Override
		public void setWith(W hdr) {
			this._hdr = hdr;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no()); //紐付けＮＯ
			dest.inpt_schd_dt(null); //投入予定日
			if (src.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				dest.gi_schd_dt(src.sls_schd_dt());
			}
			else {
				dest.gi_schd_dt(src.ship_schd_tm().startTimeOfDay()); //出庫予定日
			}
			dest.gr_schd_dt(src.dlv_schd_tm().startTimeOfDay()); //入庫予定日
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.ver_no(src.ver_no()); //版ＮＯ			
			if (!isNull(src.tdlv_cd())) {
				dest.dlv_lg_grp_cd(src.tdlv_lg_grp_cd());
			} else {
				dest.dlv_lg_grp_cd(src.dlv_lg_grp_cd());
			}
			dest.alloc_grp_cd(src.alloc_grp_cd()); //総量引当場所グループＣＤ
			dest.gi_lg_grp_cd(src.ship_lg_grp_cd()); //出庫物流グループ
			dest.gi_loc_cd(src.loc_cd()); //出庫場所ＣＤ
			dest.gi_str_ln_cd(src.str_ln_cd()); //出庫棚・ラインＣＤ
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分
			dest.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			//荷姿かどうかを判断
			if (src.pack_flg()) {
				dest.pack_unit_cd(src.trd_unit_cd()); //荷姿単位ＣＤ
				dest.pack_unit_qty(src.trd_unit_qty()); //荷姿単位数量
			}
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.cont_qty(null); //有効成分

			dest.not_lot_fix_flg(isNull(src.lot_no()) ? true : false); //ロット指定なしＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在不可ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在不可ＦＬＧ
			dest.not_lg_mix_flg(src.not_lg_mix_flg()); //物流グループ混在不可ＦＬＧ
			dest.vld_dt_fr(src.valid_dt_fr()); //有効期限ＦＲＯＭ
			dest.vld_dt_fr_grp(src.valid_dt_fr_grp()); //有効期限ＦＲＯＭ継承Ｇ
			dest.vld_dt_to(src.valid_dt_to()); //有効期限ＴＯ
			if (MAC_TRD_PTN_TYP.isSLS(_hdr.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value()); //受払予定区分
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value()); //受払予定状況区分
			}
			else {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value()); //受払予定区分
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value()); //受払予定状況区分
			}
			dest.stk_alloc_flg(false); //在庫優先引当ＦＬＧ
			dest.alloc_scope_typ(src.alloc_scope_typ()); //引当範囲区分
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
			
			MAM_LOC_R defLocR = getLoc(src.def_loc_cd());
			dest.def_ship_lg_grp_cd(defLocR.lg_grp_cd()); // 通常出荷物流グループＣＤ
		}
	}

	protected Map_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR<ShipDmndRqst_Upd01_DtlR, Slo_Upd01_DtlR> createMap_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR(Slo_Upd01_HdrR hdr, MST_SLO_R sloR) {
		return new Map_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR<ShipDmndRqst_Upd01_DtlR, Slo_Upd01_DtlR>(hdr, sloR);
	}

	public class Map_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR<D extends ShipDmndRqst_Upd01_DtlR, S extends Slo_Upd01_DtlR>
			extends MCRowMapper<D, S> {
		Slo_Upd01_HdrR _hdr;
		MST_SLO_R _sloR;

		public Map_ShipDmndRqst_Upd01_DtlR_Slo_Upd01_DtlR(Slo_Upd01_HdrR hdr, MST_SLO_R sloR) {
			_hdr = hdr;
			_sloR = sloR;
		}

		@Override
		public void valueCopy(D dest, S src) {
			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())){
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分
			}			
			else if (isRqstDel(src, _hdr, _sloR)) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分
			}
			else if (isNull(src.data_crud_typ())){
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
			}
			else {
				dest.data_crud_typ(src.data_crud_typ()); //データ更新区分
			}
			dest.peg_no(src.peg_no()); //紐付け番号
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(src.proc_typ())) {
				dest.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value()); //ＷＧ間依頼種類区分
			}
			else {
				if (!isNull(src.sppl_cd())) {
					dest.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
				}
				else if (!isNull(src.rqst_to_loc_cd())) {
					dest.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
				}
			}
			dest.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.SLO.value()); //ＷＧ間依頼作成元区分
			dest.wg_rqst_src_no(src.slo_d_no()); //ＷＧ間依頼元識別ＮＯ
			dest.rqst_dt(getToday()); //依頼日
			dest.rqst_fr_wg_cd(_hdr.wg_cd()); //依頼元ワーキンググループＣＤ
			dest.rqst_to_wg_cd(src.rqst_to_wg_cd()); //依頼先ワーキンググループＣＤ
			dest.rqst_fr_dpt_cd(_hdr.sls_dpt_cd()); //依頼元部門ＣＤ
			dest.rqst_fr_usr_cd(_hdr.sls_usr_cd()); //依頼元担当者ＣＤ
			dest.gr_loc_cd(nvl(src.loc_cd(), src.def_loc_cd())); //入庫場所ＣＤ
			if (isNull(src.str_ln_cd())) {
				dest.gr_str_ln_cd(MAC_STR.NULL_VAL.value()); //入庫棚・ラインＣＤ
			}
			else {
				dest.gr_str_ln_cd(src.str_ln_cd()); //入庫棚・ラインＣＤ
			}
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(src.proc_typ())) {
				dest.gr_rqst_tm(src.dlv_rqst_tm()); //入庫依頼日時
				dest.avl_schd_dt(src.dlv_rqst_tm()); //使用可能予定日
			}
			else {
				if (!isNull(src.rqst_to_loc_cd())) {
					dest.gr_rqst_tm(src.ship_schd_tm()); //入庫依頼日時
				}
				dest.avl_schd_dt(src.ship_schd_tm()); //使用可能予定日
			}
			dest.gi_loc_cd(src.rqst_to_loc_cd()); //出庫場所ＣＤ
			dest.gi_str_ln_cd(null); //出庫棚・ラインＣＤ
			dest.gi_rqst_tm(null); //出庫依頼日時
			dest.itm_cd(src.itm_cd()); //品目ＣＤ
			dest.itm_sub1(src.itm_sub1()); //枝番１
			dest.itm_sub2(src.itm_sub2()); //枝番２
			dest.itm_sub3(src.itm_sub3()); //枝番３
			dest.itm_nm(src.sundry_itm_flg() ? src.itm_nm() : null); //品名
			dest.sundry_itm_flg(src.sundry_itm_flg()); //諸口品ＦＬＧ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.sno1(src.sno1()); //手配ＮＯ１
			dest.sno1_null_flg(src.sno1_null_flg()); //手配ＮＯ１無し可ＦＬＧ
			dest.sno2(src.sno2()); //手配ＮＯ２
			dest.sno2_null_flg(src.sno2_null_flg()); //手配ＮＯ２無し可ＦＬＧ
			dest.sno3(src.sno3()); //手配ＮＯ３
			dest.sno3_null_flg(src.sno3_null_flg()); //手配ＮＯ３無し可ＦＬＧ
			dest.sno4(src.sno4()); //手配ＮＯ４
			dest.sno4_null_flg(src.sno4_null_flg()); //手配ＮＯ４無し可ＦＬＧ
			dest.ver_no(src.ver_no()); //版ＮＯ
			dest.gd_cd(src.gd_cd()); //格付ＣＤ
			dest.rqst_to_wg_cd(src.rqst_to_wg_cd()); 
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.sppl_cd(nvl(src.sppl_cd(), MAC_STR.NULL_VAL.value())); //発注先ＣＤ
			dest.maker_cd(nvl(src.maker_cd(), MAC_STR.NULL_VAL.value())); //メーカＣＤ
			dest.mfg_loc_cd(MAC_STR.NULL_VAL.value());
			dest.bom_ptn(MAC_STR.NULL_VAL.value());
			dest.io_schd_pr_no(null); //受払進捗管理ＮＯ
			dest.slo_no(src.slo_no()); //受注ＮＯ
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			//以下の項目は仕入直送の購買依頼のみ設定する。
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(src.proc_typ())) {
				dest.dlv_cd(src.dlv_cd()); //納品先ＣＤ
				dest.dlv_sundry_flg(src.dlv_sundry_flg()); //納品先諸口ＦＬＧ
				dest.dlv_nm(src.dlv_nm()); //納品先名
				dest.dlv_cntct_dpt(src.dlv_cntct_dpt()); //納品先部署
				dest.dlv_cntct_psn(src.dlv_cntct_psn()); //納品先担当者
				dest.dlv_zip_cd(src.dlv_zip_cd()); //納品先郵便番号
				dest.dlv_addr1(src.dlv_addr1()); //納品先住所１
				dest.dlv_addr2(src.dlv_addr2()); //納品先住所２
				dest.dlv_addr3(src.dlv_addr3()); //納品先住所３
				dest.dlv_addr4(src.dlv_addr4()); //納品先住所４
				dest.dlv_tel(src.dlv_tel()); //納品先ＴＥＬ
				dest.dlv_fax(src.dlv_fax()); //納品先ＦＡＸ
				dest.tdlv_cd(src.tdlv_cd()); //配送先ＣＤ
				dest.tdlv_sundry_flg(src.tdlv_sundry_flg()); //配送先諸口ＦＬＧ
				dest.tdlv_nm(src.tdlv_nm()); //配送先名
				dest.tdlv_zip_cd(src.tdlv_zip_cd()); //配送先郵便番号
				dest.tdlv_addr1(src.tdlv_addr1()); //配送先住所１
				dest.tdlv_addr2(src.tdlv_addr2()); //配送先住所２
				dest.tdlv_addr3(src.tdlv_addr3()); //配送先住所３
				dest.tdlv_addr4(src.tdlv_addr4()); //配送先住所４
				dest.tdlv_cntct_dpt(src.tdlv_cntct_dpt()); //配送先部署
				dest.tdlv_cntct_psn(src.tdlv_cntct_psn()); //配送先担当者
				dest.tdlv_tel(src.tdlv_tel()); //配送先ＴＥＬ
				dest.tdlv_fax(src.tdlv_fax()); //配送先ＦＡＸ	
			}
			dest.wg_rqst_cnt_rmrks(src.wg_rqst_cnt_rmrks()); //依頼連絡備考
			dest.abort_flg(src.abort_flg()); //打切ＦＬＧ	
			if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())){
				MST_SLO_D_R oldSloDR = getFirstSloDCache(src.slo_d_no());
				if (oldSloDR != null && oldSloDR.abort_flg() && !src.abort_flg()) {
					dest.abort_can_flg(true); // 打切取消ＦＬＧ
				}
				if (src.abort_flg()){
					dest.cred_no_up_flg(false); //与信更新無しＦＬＧ		
				}
				else {
					dest.cred_no_up_flg(true); //与信更新無しＦＬＧ		
				}
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())){
				dest.cred_no_up_flg(false); //与信更新無しＦＬＧ	
			}
			else{
				dest.cred_no_up_flg(true); //与信更新無しＦＬＧ	
			}
		}
	}

	protected Map_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR<ShipDmndRqst_Chk01_DtlR, ShipDmndRqst_Upd01_DtlR> createMap_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR() {
		return new Map_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR<ShipDmndRqst_Chk01_DtlR, ShipDmndRqst_Upd01_DtlR>();
	}

	public class Map_ShipDmndRqst_Chk01_DtlR_ShipDmndRqst_Upd01_DtlR<D extends ShipDmndRqst_Chk01_DtlR, S extends ShipDmndRqst_Upd01_DtlR>
			extends MCRowMapper<D, S> {

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$data_crud_typ,
					ShipDmndRqst_Upd01_DtlR.$data_crud_typ); //データ更新区分
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$peg_no,
					ShipDmndRqst_Upd01_DtlR.$peg_no); //紐付け番号
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$wg_rqst_typ,
					ShipDmndRqst_Upd01_DtlR.$wg_rqst_typ); //ＷＧ間依頼種類区分
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_typ,
					ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_typ); //ＷＧ間依頼作成元区分
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_no,
					ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_no); //ＷＧ間依頼元識別ＮＯ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_dt,
					ShipDmndRqst_Upd01_DtlR.$rqst_dt); //依頼日
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_fr_wg_cd,
					ShipDmndRqst_Upd01_DtlR.$rqst_fr_wg_cd); //依頼元ワーキンググループＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_fr_dpt_cd,
					ShipDmndRqst_Upd01_DtlR.$rqst_fr_dpt_cd); //依頼元部門ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_fr_usr_cd,
					ShipDmndRqst_Upd01_DtlR.$rqst_fr_usr_cd); //依頼元担当者ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_loc_cd,
					ShipDmndRqst_Upd01_DtlR.$gr_loc_cd); //入庫場所ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_str_ln_cd,
					ShipDmndRqst_Upd01_DtlR.$gr_str_ln_cd); //入庫棚・ラインＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gr_rqst_tm,
					ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm); //入庫依頼日時
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$rqst_to_wg_cd,
					ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd); //依頼先ワーキンググループＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gi_loc_cd,
					ShipDmndRqst_Upd01_DtlR.$gi_loc_cd); //出庫場所ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gi_str_ln_cd,
					ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd); //出庫棚・ラインＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$gi_rqst_tm,
					ShipDmndRqst_Upd01_DtlR.$gi_rqst_tm); //出庫依頼日時
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_cd,
					ShipDmndRqst_Upd01_DtlR.$itm_cd); //品目ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub1,
					ShipDmndRqst_Upd01_DtlR.$itm_sub1); //枝番１
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub2,
					ShipDmndRqst_Upd01_DtlR.$itm_sub2); //枝番２
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_sub3,
					ShipDmndRqst_Upd01_DtlR.$itm_sub3); //枝番３
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_nm,
					ShipDmndRqst_Upd01_DtlR.$itm_nm); //品名
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno1, ShipDmndRqst_Upd01_DtlR.$sno1); //手配ＮＯ１
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno1_null_flg,
					ShipDmndRqst_Upd01_DtlR.$sno1_null_flg); //手配ＮＯ１無し可ＦＬＧ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno2, ShipDmndRqst_Upd01_DtlR.$sno2); //手配ＮＯ２
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno2_null_flg,
					ShipDmndRqst_Upd01_DtlR.$sno2_null_flg); //手配ＮＯ２無し可ＦＬＧ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno3, ShipDmndRqst_Upd01_DtlR.$sno3); //手配ＮＯ３
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno3_null_flg,
					ShipDmndRqst_Upd01_DtlR.$sno3_null_flg); //手配ＮＯ３無し可ＦＬＧ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno4, ShipDmndRqst_Upd01_DtlR.$sno4); //手配ＮＯ４
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sno4_null_flg,
					ShipDmndRqst_Upd01_DtlR.$sno4_null_flg); //手配ＮＯ４無し可ＦＬＧ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$ver_no,
					ShipDmndRqst_Upd01_DtlR.$ver_no); //版ＮＯ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$trd_unit_qty,
					ShipDmndRqst_Upd01_DtlR.$trd_unit_qty); //取引単位数量
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$trd_unit_cd,
					ShipDmndRqst_Upd01_DtlR.$trd_unit_cd); //取引単位ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$sppl_cd,
					ShipDmndRqst_Upd01_DtlR.$sppl_cd); //発注先ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$maker_cd,
					ShipDmndRqst_Upd01_DtlR.$maker_cd); //メーカＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$slo_no,
					ShipDmndRqst_Upd01_DtlR.$slo_no); //受注ＮＯ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$slo_d_no,
					ShipDmndRqst_Upd01_DtlR.$slo_d_no); //受注明細ＮＯ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$cst_cd,
					ShipDmndRqst_Upd01_DtlR.$cst_cd); //得意先ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_cd,
					ShipDmndRqst_Upd01_DtlR.$dlv_cd); //納品先ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_sundry_flg,
					ShipDmndRqst_Upd01_DtlR.$dlv_sundry_flg); //納品先諸口ＦＬＧ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_nm,
					ShipDmndRqst_Upd01_DtlR.$dlv_nm); //納品先名
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_cntct_dpt,
					ShipDmndRqst_Upd01_DtlR.$dlv_cntct_dpt); //納品先部署
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_cntct_psn,
					ShipDmndRqst_Upd01_DtlR.$dlv_cntct_psn); //納品先担当者
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_zip_cd,
					ShipDmndRqst_Upd01_DtlR.$dlv_zip_cd); //納品先郵便番号
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_addr1,
					ShipDmndRqst_Upd01_DtlR.$dlv_addr1); //納品先住所１
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_addr2,
					ShipDmndRqst_Upd01_DtlR.$dlv_addr2); //納品先住所２
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_addr3,
					ShipDmndRqst_Upd01_DtlR.$dlv_addr3); //納品先住所３
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_addr4,
					ShipDmndRqst_Upd01_DtlR.$dlv_addr4); //納品先住所４
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_tel,
					ShipDmndRqst_Upd01_DtlR.$dlv_tel); //納品先ＴＥＬ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$dlv_fax,
					ShipDmndRqst_Upd01_DtlR.$dlv_fax); //納品先ＦＡＸ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_cd,
					ShipDmndRqst_Upd01_DtlR.$tdlv_cd); //配送先ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_sundry_flg,
					ShipDmndRqst_Upd01_DtlR.$tdlv_sundry_flg); //配送先諸口ＦＬＧ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_nm,
					ShipDmndRqst_Upd01_DtlR.$tdlv_nm); //配送先名
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_zip_cd,
					ShipDmndRqst_Upd01_DtlR.$tdlv_zip_cd); //配送先郵便番号
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_addr1,
					ShipDmndRqst_Upd01_DtlR.$tdlv_addr1); //配送先住所１
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_addr2,
					ShipDmndRqst_Upd01_DtlR.$tdlv_addr2); //配送先住所２
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_addr3,
					ShipDmndRqst_Upd01_DtlR.$tdlv_addr3); //配送先住所３
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_addr4,
					ShipDmndRqst_Upd01_DtlR.$tdlv_addr4); //配送先住所４
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_cntct_dpt,
					ShipDmndRqst_Upd01_DtlR.$tdlv_cntct_dpt); //配送先部署
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_cntct_psn,
					ShipDmndRqst_Upd01_DtlR.$tdlv_cntct_psn); //配送先担当者
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_tel,
					ShipDmndRqst_Upd01_DtlR.$tdlv_tel); //配送先ＴＥＬ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$tdlv_fax,
					ShipDmndRqst_Upd01_DtlR.$tdlv_fax); //配送先ＦＡＸ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$itm_ord_no,
					ShipDmndRqst_Upd01_DtlR.$itm_ord_no); //品目オーダＮＯ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$mfg_loc_cd,
					ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd); //製造場所ＣＤ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$bom_ptn,
					ShipDmndRqst_Upd01_DtlR.$bom_ptn); //構成パタン
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$abort_flg,
					ShipDmndRqst_Upd01_DtlR.$abort_flg); //打切ＦＬＧ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$abort_can_flg,
					ShipDmndRqst_Upd01_DtlR.$abort_can_flg); //打切取消ＦＬＧ
			addColumnPathMap(ShipDmndRqst_Chk01_DtlR.$cred_no_up_flg,
					ShipDmndRqst_Upd01_DtlR.$cred_no_up_flg); //与信更新無しＦＬＧ
		}
		@Override
		public void valueCopy(D dest, S src) {
			// 手配依頼または引当後依頼の場合、入庫依頼日が設定できないため後続サービスで日付計算するために使用可能予定日(出荷予定日)が必要
			dest.setDateNE("avl_schd_dt", src.avl_schd_dt());
		}
	}

	protected Map_ShipPr_DtlR_Slo_Upd01_DtlR<ShipPr_DtlR, Slo_Upd01_DtlR, Slo_Upd01_HdrR> createMap_ShipPr_DtlR_Slo_Upd01_DtlR() {
		return new Map_ShipPr_DtlR_Slo_Upd01_DtlR<ShipPr_DtlR, Slo_Upd01_DtlR, Slo_Upd01_HdrR>();
	}

	public class Map_ShipPr_DtlR_Slo_Upd01_DtlR<D extends ShipPr_DtlR, S extends Slo_Upd01_DtlR, W extends Slo_Upd01_HdrR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _hdr;

		@Override
		public void setWith(W hdr) {
			this._hdr = hdr;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no()); //データ紐付けＮＯ
			dest.data_crud_typ(src.data_crud_typ()); //データ更新区分
			dest.ship_pr_no(src.ship_pr_no()); //出荷進捗ＮＯ
			dest.trd_cd(_hdr.trd_cd()); //取引ＣＤ
			dest.trd_ptn_typ(_hdr.trd_ptn_typ()); //取引パタン区分
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			dest.xfr_schd_no(null); //移動・移送予定ＮＯ
			dest.rqst_dpt_cd(_hdr.sls_dpt_cd()); //依頼元部門ＣＤ
			dest.rqst_usr_cd(_hdr.sls_usr_cd()); //依頼元担当者ＣＤ
			dest.cst_cd(_hdr.cst_cd()); //得意先ＣＤ
			dest.ship_rqst_tm(src.ship_rqst_tm()); //出荷希望日時
			if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())){
				dest.dlv_rqst_tm(null); //納入希望日時
			}
			else {
				dest.dlv_rqst_tm(src.dlv_rqst_tm()); //納入希望日時
			}
			dest.prms_dt(null); //納期回答日
			dest.prms_dlv_dt(null); //回答納入日
			dest.dlv_inst_rcpt_dt(null); //納入指示受領日
			dest.dlv_inst_prms_dt(null); //納入指示回答日
			if (!isNull(src.tdlv_cd())) {
				dest.ship_to_lg_grp_cd(src.tdlv_lg_grp_cd()); //出荷先物流グループＣＤ
			}
			else {
				dest.ship_to_lg_grp_cd(src.dlv_lg_grp_cd()); //出荷先物流グループＣＤ
			}
			dest.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value()); //納品先識別区分
			dest.dlv_id_cd(src.dlv_cd()); //納品先識別ＣＤ
			dest.dlv_id_nm(src.dlv_nm()); //納品先名
			dest.dlv_zip_cd(src.dlv_zip_cd());
			dest.dlv_addr1(src.dlv_addr1());
			dest.dlv_addr2(src.dlv_addr2());
			dest.dlv_addr3(src.dlv_addr3());
			dest.dlv_addr4(src.dlv_addr4());
			dest.dlv_cntct_dpt(src.dlv_cntct_dpt());
			dest.dlv_cntct_psn(src.dlv_cntct_psn());
			dest.dlv_tel(src.dlv_tel());
			dest.dlv_fax(src.dlv_fax());
			dest.dlv_sundry_flg(src.dlv_sundry_flg()); //納品先諸口ＦＬＧ
			dest.dlv_str_ln_cd(null); //納品先棚・ラインＣＤ
			if (!isNull(src.tdlv_cd())) {
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value()); //送付先識別区分
				dest.ship_to_id_cd(src.tdlv_cd()); //送付先識別ＣＤ
				dest.ship_to_id_nm(src.tdlv_nm()); //送付先名
				dest.ship_to_zip_cd(src.tdlv_zip_cd()); //送付先郵便番号
				dest.ship_to_addr1(src.tdlv_addr1()); //送付先住所1
				dest.ship_to_addr2(src.tdlv_addr2()); //送付先住所2
				dest.ship_to_addr3(src.tdlv_addr3()); //送付先住所3
				dest.ship_to_addr4(src.tdlv_addr4()); //送付先住所4
				dest.ship_to_cntct_dpt(src.tdlv_cntct_dpt()); //送付先部署
				dest.ship_to_cntct_psn(src.tdlv_cntct_psn()); //送付先担当者
				dest.ship_to_tel(src.tdlv_tel()); //送付先ＴＥＬ
				dest.ship_to_fax(src.tdlv_fax()); //送付先fax
				dest.ship_to_sundry_flg(src.tdlv_sundry_flg()); //送付先諸口ＦＬＧ
			}
			else {
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value()); //送付先識別区分
				dest.ship_to_id_cd(src.dlv_cd()); //送付先識別ＣＤ
				dest.ship_to_id_nm(src.dlv_nm()); //送付先名
				dest.ship_to_zip_cd(src.dlv_zip_cd()); //送付先郵便番号
				dest.ship_to_addr1(src.dlv_addr1()); //送付先住所1
				dest.ship_to_addr2(src.dlv_addr2()); //送付先住所2
				dest.ship_to_addr3(src.dlv_addr3()); //送付先住所3
				dest.ship_to_addr4(src.dlv_addr4()); //送付先住所4
				dest.ship_to_cntct_dpt(src.dlv_cntct_dpt()); //送付先部署
				dest.ship_to_cntct_psn(src.dlv_cntct_psn()); //送付先担当者
				dest.ship_to_tel(src.dlv_tel()); //送付先ＴＥＬ
				dest.ship_to_fax(src.dlv_fax()); //送付先fax
				dest.ship_to_sundry_flg(src.dlv_sundry_flg()); //送付先諸口ＦＬＧ
			}

			dest.via_dlv_typ(src.via_dlv_typ()); //配送先経由区分
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.prms_qty(null); //納期回答数量
			dest.dlv_inst_rcpt_qty(null); //納入指示受領数量
			dest.dlv_inst_prms_qty(null); //納入指示回答数量
			dest.abort_flg(false); //打切ＦＬＧ
			dest.rsn_cd(src.sls_rsn_cd()); //理由ＣＤ
			dest.bd_dpt_cd(src.bd_dpt_cd()); //負担部門ＣＤ
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
			dest.ship_wk_cd(src.ship_wk_cd()); //出荷作業ＣＤ
			dest.ship_inst_typ(src.ship_inst_typ()); //出荷指図区分
			dest.purc_ddlv_flg(MAC_SLO_PROC_TYP.isPURC_DDLV(src.proc_typ())); //仕入直送ＦＬＧ
			dest.ship_schd_split_typ(src.ship_schd_split_typ()); //出荷予定分割区分
			dest.alloc_scope_typ(src.alloc_scope_typ()); //引当範囲区分
			dest.not_lg_mix_flg(src.not_lg_mix_flg());
			dest.alloc_typ(src.alloc_typ()); //引当区分
			dest.alloc_grp_cd(src.alloc_grp_cd()); //総量引当場所グループＣＤ
			dest.ship_lg_grp_cd(src.ship_lg_grp_cd()); //出荷物流グループＣＤ
			dest.def_loc_cd(src.def_loc_cd()); //デフォルト場所ＣＤ
			dest.loc_cd(src.loc_cd()); //場所ＣＤ			
			dest.str_ln_cd(src.str_ln_cd()); //棚・ラインＣＤ
			dest.ship_cnt_rmrks(src.ship_cnt_rmrks()); //出荷連絡備考
			dest.trd_d_rmrks(src.trd_d_rmrks());
			dest.trd_rmrks(_hdr.trd_rmrks());
			dest.ss().trd_d_rmrks(src.trd_d_rmrks());
			dest.ss().trd_rmrks(_hdr.trd_rmrks());
			//出荷予定関連の情報
			dest.ship_schd_no(null); //出荷予定ＮＯ			
			dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
			dest.dlv_inst_rcpt_no(null); //納入指示受領ＮＯ
			dest.slo_prms_no(null); //受注納期回答ＮＯ
			if (!isNull(src.ship_lg_grp_cd())) {
				dest.ship_fr_lg_grp_cd(src.ship_lg_grp_cd());
				MAM_LG_GRP_R lgGrpR = getLgGrp(src.ship_lg_grp_cd());
				dest.wg_cd(lgGrpR.wg_cd());
			}
			else {
				MAM_LOC_R locR = getLoc(nvl(src.loc_cd(), src.def_loc_cd()));
				dest.ship_fr_lg_grp_cd(locR.lg_grp_cd());
				MAM_LG_GRP_R lgGrpR = getLgGrp(locR.lg_grp_cd());
				dest.wg_cd(lgGrpR.wg_cd());
			}
			dest.ship_schd_tm(src.ship_schd_tm()); //出荷予定日時
			dest.dlv_schd_tm(src.dlv_schd_tm()); //納品予定日時
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
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
			dest.ship_block_flg(src.ship_block_flg()); //出荷留めＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在不可ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在不可ＦＬＧ
			dest.vld_dt_fr(src.valid_dt_fr()); //有効期限ＦＲＯＭ			
			dest.vld_dt_to(src.valid_dt_to()); //有効期限ＴＯ			
			dest.io_schd_pr_no(src.io_schd_pr_no()); //受払進捗管理ＮＯ
			dest.vmi_flg(src.vmi_flg()); // 貸出ＦＬＧ
			dest.not_dt_calc_flg(src.not_dt_calc_flg()); //予定日計算ＦＬＧ
			dest.cred_no_up_flg(true);  //与信更新ＦＬＧ
		}
	}

	protected Map_Upd_ShipPr_DtlR_Slo_Upd01_DtlR<ShipPr_DtlR, Slo_Upd01_DtlR> createMap_Upd_ShipPr_DtlR_Slo_Upd01_DtlR(
			MST_SHIP_PR_R oldShipPrR, Slo_Upd01_HdrR hdrR) {
		return new Map_Upd_ShipPr_DtlR_Slo_Upd01_DtlR<ShipPr_DtlR, Slo_Upd01_DtlR>(
				oldShipPrR, hdrR);
	}

	public class Map_Upd_ShipPr_DtlR_Slo_Upd01_DtlR<D extends ShipPr_DtlR, S extends Slo_Upd01_DtlR>
			extends MCRowMapper<D, S> {
		protected Slo_Upd01_HdrR _hdr;

		protected MST_SHIP_PR_R _oldShipPrR;

		public Map_Upd_ShipPr_DtlR_Slo_Upd01_DtlR(MST_SHIP_PR_R oldShipPrR,
				Slo_Upd01_HdrR hdrR) {
			this._hdr = hdrR;
			this._oldShipPrR = oldShipPrR;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no()); //データ紐付けＮＯ
			dest.data_crud_typ(src.data_crud_typ()); //データ更新区分
			dest.ship_pr_no(src.ship_pr_no()); //出荷進捗ＮＯ
			dest.trd_cd(_hdr.trd_cd()); //取引ＣＤ
			dest.trd_ptn_typ(_hdr.trd_ptn_typ()); //取引パタン区分
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			dest.xfr_schd_no(_oldShipPrR.xfr_schd_no()); //移動・移送予定ＮＯ
			dest.rqst_dpt_cd(_hdr.sls_dpt_cd()); //依頼元部門ＣＤ
			dest.rqst_usr_cd(_hdr.sls_usr_cd()); //依頼元担当者ＣＤ
			dest.cst_cd(_hdr.cst_cd()); //得意先ＣＤ
			dest.ship_rqst_tm(src.ship_rqst_tm()); //出荷希望日時
			if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())){
				dest.dlv_rqst_tm(null); //納入希望日時
			}
			else {
				dest.dlv_rqst_tm(src.dlv_rqst_tm()); //納入希望日時
			}			
			dest.prms_dt(_oldShipPrR.prms_dt()); //納期回答日
			dest.prms_dlv_dt(_oldShipPrR.prms_dlv_dt()); //回答納入日
			dest.dlv_inst_rcpt_dt(_oldShipPrR.dlv_inst_rcpt_dt()); //納入指示受領日
			dest.dlv_inst_prms_dt(_oldShipPrR.dlv_inst_prms_dt()); //納入指示回答日			
			if (!isNull(src.tdlv_cd())) {
				dest.ship_to_lg_grp_cd(src.tdlv_lg_grp_cd()); //出荷先物流グループＣＤ
			}
			else {
				dest.ship_to_lg_grp_cd(src.dlv_lg_grp_cd()); //出荷先物流グループＣＤ
			}
			dest.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value()); //納品先識別区分
			dest.dlv_id_cd(src.dlv_cd()); //納品先識別ＣＤ
			dest.dlv_id_nm(src.dlv_nm()); //納品先名
			dest.dlv_zip_cd(src.dlv_zip_cd());
			dest.dlv_addr1(src.dlv_addr1());
			dest.dlv_addr2(src.dlv_addr2());
			dest.dlv_addr3(src.dlv_addr3());
			dest.dlv_addr4(src.dlv_addr4());
			dest.dlv_cntct_dpt(src.dlv_cntct_dpt());
			dest.dlv_cntct_psn(src.dlv_cntct_psn());
			dest.dlv_tel(src.dlv_tel());
			dest.dlv_fax(src.dlv_fax());
			dest.dlv_sundry_flg(src.dlv_sundry_flg()); //納品先諸口ＦＬＧ
			dest.dlv_str_ln_cd(null); //納品先棚・ラインＣＤ
			if (!isNull(src.tdlv_cd())) {
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value()); //送付先識別区分
				dest.ship_to_id_cd(src.tdlv_cd()); //送付先識別ＣＤ
				dest.ship_to_id_nm(src.tdlv_nm()); //送付先名
				dest.ship_to_zip_cd(src.tdlv_zip_cd()); //送付先郵便番号
				dest.ship_to_addr1(src.tdlv_addr1()); //送付先住所1
				dest.ship_to_addr2(src.tdlv_addr2()); //送付先住所2
				dest.ship_to_addr3(src.tdlv_addr3()); //送付先住所3
				dest.ship_to_addr4(src.tdlv_addr4()); //送付先住所4
				dest.ship_to_cntct_dpt(src.tdlv_cntct_dpt()); //送付先部署
				dest.ship_to_cntct_psn(src.tdlv_cntct_psn()); //送付先担当者
				dest.ship_to_tel(src.tdlv_tel()); //送付先ＴＥＬ
				dest.ship_to_fax(src.tdlv_fax()); //送付先fax
				dest.ship_to_sundry_flg(src.tdlv_sundry_flg()); //送付先諸口ＦＬＧ
			}
			else {
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value()); //送付先識別区分
				dest.ship_to_id_cd(src.dlv_cd()); //送付先識別ＣＤ
				dest.ship_to_id_nm(src.dlv_nm()); //送付先名
				dest.ship_to_zip_cd(src.dlv_zip_cd()); //送付先郵便番号
				dest.ship_to_addr1(src.dlv_addr1()); //送付先住所1
				dest.ship_to_addr2(src.dlv_addr2()); //送付先住所2
				dest.ship_to_addr3(src.dlv_addr3()); //送付先住所3
				dest.ship_to_addr4(src.dlv_addr4()); //送付先住所4
				dest.ship_to_cntct_dpt(src.dlv_cntct_dpt()); //送付先部署
				dest.ship_to_cntct_psn(src.dlv_cntct_psn()); //送付先担当者
				dest.ship_to_tel(src.dlv_tel()); //送付先ＴＥＬ
				dest.ship_to_fax(src.dlv_fax()); //送付先fax
				dest.ship_to_sundry_flg(src.dlv_sundry_flg()); //送付先諸口ＦＬＧ
			}

			dest.via_dlv_typ(src.via_dlv_typ()); //配送先経由区分

			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.prms_qty(_oldShipPrR.prms_qty()); //納期回答数量
			dest.dlv_inst_rcpt_qty(_oldShipPrR.dlv_inst_rcpt_qty()); //納入指示受領数量
			dest.dlv_inst_prms_qty(_oldShipPrR.dlv_inst_prms_qty()); //納入指示回答数量
			dest.abort_flg(false); //打切ＦＬＧ			
			dest.rsn_cd(src.sls_rsn_cd()); //理由ＣＤ
			dest.bd_dpt_cd(src.bd_dpt_cd()); //負担部門ＣＤ
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
			dest.ship_wk_cd(src.ship_wk_cd()); //出荷作業ＣＤ
			dest.ship_inst_typ(src.ship_inst_typ()); //出荷指図区分
			dest.purc_ddlv_flg(MAC_SLO_PROC_TYP.isPURC_DDLV(src.proc_typ())); //仕入直送ＦＬＧ
			dest.ship_schd_split_typ(src.ship_schd_split_typ()); //出荷予定分割区分
			dest.alloc_scope_typ(src.alloc_scope_typ()); //引当範囲区分
			dest.not_lg_mix_flg(src.not_lg_mix_flg());
			dest.alloc_typ(src.alloc_typ()); //引当区分
			dest.alloc_grp_cd(src.alloc_grp_cd()); //総量引当場所グループＣＤ
			dest.ship_lg_grp_cd(src.ship_lg_grp_cd()); //出荷物流グループＣＤ
			dest.def_loc_cd(src.def_loc_cd()); //デフォルト場所ＣＤ			
			dest.loc_cd(src.loc_cd()); //場所ＣＤ
			dest.str_ln_cd(src.str_ln_cd()); //棚・ラインＣＤ
			dest.ship_cnt_rmrks(src.ship_cnt_rmrks()); //出荷連絡備考
			dest.trd_d_rmrks(src.trd_d_rmrks());
			dest.trd_rmrks(_hdr.trd_rmrks());
			dest.ss().trd_d_rmrks(src.trd_d_rmrks());
			dest.ss().trd_rmrks(_hdr.trd_rmrks());
			
			//出荷予定の情報の設定
			if (!isNull(src.ship_lg_grp_cd())) {
				dest.ship_fr_lg_grp_cd(src.ship_lg_grp_cd());//出荷元物流グループＣＤ
				MAM_LG_GRP_R lgGrpR = getLgGrp(src.ship_lg_grp_cd());
				dest.wg_cd(lgGrpR.wg_cd());
			}
			else {
				MAM_LOC_R locR = getLoc(nvl(src.loc_cd(), src.def_loc_cd()));
				dest.ship_fr_lg_grp_cd(locR.lg_grp_cd());//出荷元物流グループＣＤ
				MAM_LG_GRP_R lgGrpR = getLgGrp(locR.lg_grp_cd());
				dest.wg_cd(lgGrpR.wg_cd());
			}
			dest.ship_schd_tm(src.ship_schd_tm()); //出荷予定日時
			dest.dlv_schd_tm(src.dlv_schd_tm()); //納品予定日時
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
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
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ				
			dest.ship_block_flg(src.ship_block_flg()); //出荷留めＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在不可ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在不可ＦＬＧ
			dest.vld_dt_fr(src.valid_dt_fr()); //有効期限ＦＲＯＭ			
			dest.vld_dt_to(src.valid_dt_to()); //有効期限ＴＯ			
			dest.io_schd_pr_no(src.io_schd_pr_no()); //受払進捗管理ＮＯ
			dest.vmi_flg(src.vmi_flg()); // 貸出ＦＬＧ
			dest.not_dt_calc_flg(src.not_dt_calc_flg()); //予定日計算ＦＬＧ
			dest.cred_no_up_flg(true);  //与信更新ＦＬＧ
		}
	}
			
	

	protected Map_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR<Sls_Schd_Upd01_DtlR, Slo_Upd01_DtlR> createMap_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR() {
		return new Map_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR<Sls_Schd_Upd01_DtlR, Slo_Upd01_DtlR>();
	}

	public class Map_Sls_Schd_Upd01_DtlR_Slo_Upd01_DtlR<D extends Sls_Schd_Upd01_DtlR, S extends Slo_Upd01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {			
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());//売上予定作成元区分
			dest.data_crud_typ(src.data_crud_typ());
			dest.slo_d_no(src.slo_d_no());//受注明細ＮＯ			
			dest.sls_schd_dt(src.sls_schd_dt());//売上予定日
			dest.ship_schd_dt(dest.sls_schd_dt());
			dest.dlv_schd_dt(dest.sls_schd_dt());
			dest.trd_unit_cd(src.trd_unit_cd());//取引単位ＣＤ
			dest.trd_unit_qty(src.trd_unit_qty());//取引単位数量
			dest.base_unit_cd(src.base_unit_cd());//基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty());//基準単位数量			
			dest.abort_flg(src.abort_flg());//打切ＦＬＧ
			dest.cred_no_up_flg(true);//与信更新無ＦＬＧ
		}
	}	
			
	protected Map_Srch_RsltR_MST_SHIP_ALLOC_STS_R<Srch_RsltR, MST_SHIP_ALLOC_STS_R, Slo_Upd01_DtlR> createMap_Srch_RsltR_MST_SHIP_ALLOC_STS_R() {
		return new Map_Srch_RsltR_MST_SHIP_ALLOC_STS_R<Srch_RsltR, MST_SHIP_ALLOC_STS_R, Slo_Upd01_DtlR>();
	}

	public class Map_Srch_RsltR_MST_SHIP_ALLOC_STS_R<D extends Srch_RsltR, S extends MST_SHIP_ALLOC_STS_R, W extends Slo_Upd01_DtlR>
		extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;

		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(_dtlR.peg_no());  //データ紐付けＮＯ
			dest.itm_cd(_dtlR.itm_cd());  //品目ＣＤ
			dest.itm_sub1(_dtlR.itm_sub1());  //枝番１
			dest.itm_sub2(_dtlR.itm_sub2());  //枝番２
			dest.itm_sub3(_dtlR.itm_sub3());  //枝番３
			dest.stk_loc_cd(src.ship_loc_cd());  //在庫場所ＣＤ
			dest.stk_str_ln_cd(src.ship_str_ln_cd()); //入庫棚・ラインＣＤ			
			dest.stk_lg_grp_cd(_dtlR.ship_lg_grp_cd());  //在庫物流グループＣＤ
			dest.quality_typ(src.quality_typ()); //良品区分
			dest.stk_insp_typ(src.stk_insp_typ());  //在庫検査区分			
			dest.stk_id_typ(src.stk_id_typ()); //在庫識別区分
			dest.stk_bp_cd(src.stk_bp_cd()); //在庫取引先ＣＤ			
			dest.gd_cd(src.gd_cd());  //格付ＣＤ
			dest.lot_no(src.lot_no());  //ロットＮＯ
			dest.sublot_no(src.sublot_no());  //サブロットＮＯ
			dest.sno1(src.sno1());  //手配ＮＯ１
			dest.sno2(src.sno2());  //手配ＮＯ２
			dest.sno3(src.sno3());  //手配ＮＯ３
			dest.sno4(src.sno4());  //手配ＮＯ４
			dest.ver_no(src.ver_no());  //版ＮＯ
			dest.pack_unit_cd(src.pack_unit_cd());  //荷姿単位ＣＤ
			dest.pack_unit_qty(src.pack_unit_qty());  //荷姿単位数量			
			dest.base_unit_cd(src.base_unit_cd());  //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty());  //基準単位数量
			dest.vld_dt_fr(_dtlR.valid_dt_fr());  //有効期限ＦＲＯＭ
			dest.vld_dt_to(_dtlR.valid_dt_to());  //有効期限ＴＯ
			dest.addStringColumn("alloc_scope_typ", src.alloc_scope_typ());  //引当範囲区分
			dest.addStringColumn("ship_schd_no", src.ship_schd_no());
		}
	}
			
			
	protected Map_Srch_RsltR_Slo_Upd01_DtlR<Srch_RsltR, Slo_Upd01_DtlR, Slo_Upd01_HdrR> createMap_Srch_RsltR_Slo_Upd01_DtlR() {
		return new Map_Srch_RsltR_Slo_Upd01_DtlR<Srch_RsltR, Slo_Upd01_DtlR, Slo_Upd01_HdrR>();
	}

	public class Map_Srch_RsltR_Slo_Upd01_DtlR<D extends Srch_RsltR, S extends Slo_Upd01_DtlR, W extends Slo_Upd01_HdrR>
		extends MAUCC_RowMapperWith<D, S, W> {
		protected W _hdr;

		@Override
		public void setWith(W hdr) {
			this._hdr = hdr;
		}
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no());  //データ紐付けＮＯ
			dest.itm_cd(src.itm_cd());  //品目ＣＤ
			dest.itm_sub1(src.itm_sub1());  //枝番１
			dest.itm_sub2(src.itm_sub2());  //枝番２
			dest.itm_sub3(src.itm_sub3());  //枝番３
			dest.stk_loc_cd(nvl(src.loc_cd(), src.def_loc_cd()));  //在庫場所ＣＤ
			if (isNull(src.str_ln_cd())) {
				dest.stk_str_ln_cd(MAC_STR.NULL_VAL.value()); //入庫棚・ラインＣＤ
			}
			else {
				dest.stk_str_ln_cd(src.str_ln_cd()); //入庫棚・ラインＣＤ
			}
			dest.stk_lg_grp_cd(src.ship_lg_grp_cd());  //在庫物流グループＣＤ
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());  //在庫検査区分
			
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分
			dest.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤ
			
			dest.gd_cd(src.gd_cd());  //格付ＣＤ
			dest.lot_no(src.lot_no());  //ロットＮＯ
			dest.sublot_no(src.sublot_no());  //サブロットＮＯ
			dest.sno1(src.sno1());  //手配ＮＯ１
			dest.sno2(src.sno2());  //手配ＮＯ２
			dest.sno3(src.sno3());  //手配ＮＯ３
			dest.sno4(src.sno4());  //手配ＮＯ４
			dest.ver_no(src.ver_no());  //版ＮＯ
			if (src.pack_flg()){
				dest.pack_unit_cd(src.trd_unit_cd());  //荷姿単位ＣＤ
				dest.pack_unit_qty(src.trd_unit_qty());  //荷姿単位数量
			}
			else{
				dest.pack_unit_cd(src.base_unit_cd());  //荷姿単位ＣＤ
				dest.pack_unit_qty(src.base_unit_qty());  //荷姿単位数量
			}
			dest.base_unit_cd(src.base_unit_cd());  //基準単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty());  //基準単位数量
			dest.vld_dt_fr(src.valid_dt_fr());  //有効期限ＦＲＯＭ
			dest.vld_dt_to(src.valid_dt_to());  //有効期限ＴＯ
		}
	}
		
	protected Map_Lot_Chk03_CndR_Slo_Upd01_DtlR<Lot_Chk03_CndR, Slo_Upd01_DtlR> createMap_Lot_Chk03_CndR_Slo_Upd01_DtlR() {
		return new Map_Lot_Chk03_CndR_Slo_Upd01_DtlR<Lot_Chk03_CndR, Slo_Upd01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_Slo_Upd01_DtlR<D extends Lot_Chk03_CndR, S extends Slo_Upd01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no());  //データ紐付けＮＯ
			dest.itm_cd(src.itm_cd());  //品目ＣＤ
			dest.itm_sub1(src.itm_sub1());  //枝番１
			dest.itm_sub2(src.itm_sub2());  //枝番２
			dest.itm_sub3(src.itm_sub3());  //枝番３
			dest.ver_no(src.ver_no());  //版ＮＯ
			dest.lot_no(src.lot_no());  //ロットＮＯ
			dest.sublot_no(src.sublot_no());  //サブロットＮＯ
		}
	}
	

	protected Map_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, Slo_Upd01_DtlR, MST_SHIP_SCHD_R> createMap_ShipSchd_DtlR_MST_SLO_D_R() {
		return new Map_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, Slo_Upd01_DtlR, MST_SHIP_SCHD_R>();
	}
	
	public class Map_ShipSchd_DtlR_MST_SLO_D_R<D extends ShipSchd_DtlR, S extends Slo_Upd01_DtlR, W extends MST_SHIP_SCHD_R>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;
		
		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			
			dest.data_crud_typ(src.data_crud_typ()); //データ更新区分
			dest.ship_schd_no(_dtlR.ship_schd_no()); //出荷予定ＮＯ
			dest.ship_pr_no(_dtlR.ship_pr_no()); //出荷進捗ＮＯ
			dest.abort_flg(_dtlR.abort_flg()); //打切ＦＬＧ
			dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
			dest.dlv_inst_rcpt_no(_dtlR.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
			dest.slo_prms_no(_dtlR.slo_prms_no()); //受注納期回答ＮＯ
			dest.sls_act_d_no(_dtlR.sls_act_d_no()); //売上実績明細ＮＯ
			dest.ship_fr_lg_grp_cd(_dtlR.ship_fr_lg_grp_cd()); //出荷元物流グループＣＤ
			MAM_LG_GRP_R lgGrpR = getLgGrp(_dtlR.ship_fr_lg_grp_cd());
			dest.wg_cd(lgGrpR.wg_cd());
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
			dest.abort_flg(src.abort_flg()); //打切ＦＬＧ
			dest.fix_flg(_dtlR.fix_flg()); //確定ＦＬＧ		
			dest.ship_block_flg(_dtlR.ship_block_flg());
			dest.inst_bndl_flg(false); //指図まとめＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在ＦＬＧ
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
			dest.sub_char1(_dtlR.sub_char1()); //予備１
			dest.sub_char2(_dtlR.sub_char2()); //予備２
			dest.sub_char3(_dtlR.sub_char3()); //予備３
			dest.inst_qty(null); //指図数量（基準単位）
			dest.inst_unit_cd(null); //指図単位ＣＤ
			dest.inst_ship_schd_tm(null); //指図出荷予定日時
			dest.inst_dlv_schd_tm(null); //指図納品予定日時
			dest.not_dt_calc_flg(_dtlR.not_dt_calc_flg());
			dest.ship_schd_split_flg(false); //出荷予定分割ＦＬＧ
		}
	}
	
	protected Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR,MST_SHIP_ALLOC_STS_R> createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R() {
		return new Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR, MST_SHIP_ALLOC_STS_R>();
	}
	
	public class Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<D extends Alloc_RsltR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, MST_SHIP_ALLOC_STS_R.$ship_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
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
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, MST_SHIP_ALLOC_STS_R.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, MST_SHIP_ALLOC_STS_R.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, MST_SHIP_ALLOC_STS_R.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, MST_SHIP_ALLOC_STS_R.$base_unit_qty);
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
	/**
	 * Slo_Chk03オペレーション.<p>
	 *
	 * 削除前のチェック処理、項目値の補完<br>
	 */
	public class Slo_Chk03 extends MSBBL_SloRegService_MC_A.Slo_Chk03 {
		
		/**
		 * 更新カウンタチェックエラー
		 */
		protected boolean _updCntrErr = false;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				chkAprvService();
				chkShipSchd();
				callAprvSvChk03();
			}
			setDown();
		}
		

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();	
			initSloCache(up0());
			initSloDCache(up0());
			initShipPrCache(up1());
			initShipSchdCache(up1());
			initWgRqstCache(up1());
			_cacheSloR = getSloCache(up0());
			for (Slo_Del01_DtlR dtlR : up1()) {
				msgL.addAll(chkItm(dtlR));
			}
			msgL.addAll(chkItmDtl(up1()));
			if(!msgL.isEmpty()) {
				_updCntrErr = true;
			}
			//受注ヘッダのロック、更新カウンタチェック、空更新、インボイス取引ＦＬＧの値の補完
			msgL.addAll(chkSlo());
			//見積ヘッダのロック、更新カウンタチェック、空更新
			if (!isNull(up0().qtn_no())) {
				msgL.addAll(chkQtn());
			}
			//出荷進捗の排他処理を行う。
			msgL.addAll(chkShipPr());
			return msgL;
		}

		/**
		 * コンテナ属性でできないチェック処理
		 */
		@Override
		protected MCMessageList doServerCheckSub() {
			
			if (_updCntrErr) {
				return null;
			}
			
			MCMessageList msgL = super.doServerCheckSub();
			// DACチェック
			if (!up0().is_src_batch_flg()) {
				// バッチから実行した場合に、ＤＡＣの更新権限チェックを行わない
				msgL.addAll(checkWritableDptCdDac(up0(), Slo_Del01_HdrR.$sls_dpt_cd));
			}
			//固有エラーチェック
			msgL.addAll(chkOther());
			return msgL;
		}

		/**
		 * 受注ヘッダのロック、更新カウンタチェック、空更新、値の補完
		 */
		protected MCMessageList chkSlo() {
			
			MCMessageList msgL = new MCMessageList();
			if (_updCntrErr) {
				return msgL;
			}
			
			_cacheSloR = getSloCache(up0());
			//更新カウンタチェック
			if (!up0().upd_cntr_not_chk_flg()) {
				msgL.addAll(checkUpdCntrNE(up0(), Slo_Del01_HdrR.$slo_upd_cntr, _cacheSloR));
			}
			//空更新
			dbTsUpdateKey("MSBBL6020_MST_SLO_U05", _cacheSloR, _cacheSloR);
			//改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
			updSloPR(_cacheSloR);
			//値の補完			
			//承認対象ＦＬＧ
			up0().aprv_flg(_cacheSloR.aprv_flg());
			//承認ＮＯ
			up0().aprv_no(_cacheSloR.aprv_no());
			//承認状況区分
			up0().aprv_sts_typ(_cacheSloR.aprv_sts_typ());
			//見積ＮＯ
			up0().qtn_no(_cacheSloR.qtn_no());
			//見積改訂番号
			up0().qtn_rev(_cacheSloR.qtn_rev());
			//売上部門ＣＤ
			up0().sls_dpt_cd(_cacheSloR.sls_dpt_cd());
			//受注改訂番号
			up0().slo_rev(_cacheSloR.slo_rev());
			//得意先ＣＤ
			up0().cst_cd(_cacheSloR.cst_cd());
			//取引通貨ＣＤ
			up0().trd_cur_cd(_cacheSloR.trd_cur_cd());
			//ワーキンググループＣＤ
			up0().wg_cd(_cacheSloR.wg_cd());
			//案件ＮＯ
			up0().wrk_no(_cacheSloR.wrk_no());
			//取引条件ＣＤ
			up0().tterm_cd1(_cacheSloR.tterm_cd1());
			up0().tterm_cd2(_cacheSloR.tterm_cd2());
			up0().tterm_cd3(_cacheSloR.tterm_cd3());
			//ＥＤＩ予備ＣＨＡＲ項目
			up0().edi_sub_char1(_cacheSloR.edi_sub_char1());
			up0().edi_sub_char2(_cacheSloR.edi_sub_char2());
			up0().edi_sub_char3(_cacheSloR.edi_sub_char3());
			up0().edi_sub_char4(_cacheSloR.edi_sub_char4());
			up0().edi_sub_char5(_cacheSloR.edi_sub_char5());
			for (Slo_Del01_DtlR r : up1()) {
				MST_SLO_D_R sloDR = getFirstSloDCache(r.slo_d_no());
				//取引通貨金額
				r.trd_cur_amt(sloDR.trd_cur_amt());
				//取引通貨税額
				r.trd_cur_tax_amt(sloDR.trd_cur_tax_amt());
				//仕向先ＣＤ１
				r.dest_cd1(sloDR.dest_cd1());
				r.dest_cd2(sloDR.dest_cd2());
				r.dest_cd3(sloDR.dest_cd3());
				//納品先ＣＤ
				r.dlv_cd(sloDR.dlv_cd());
			}
			//承認取消可能FLGの取得
			if (!isNull(up0().aprv_no())){
				MBT_APRV_R aprvR = getAprvR(up0().aprv_no());
				up0().can_del_flg(aprvR.aprv_can_flg());
			}
			
			if (!msgL.isEmpty()) {
				_updCntrErr = true;
			}
			return msgL;
		}

		/**
		 * 見積ヘッダのロック、更新カウンタチェック、空更新
		 */
		protected MCMessageList chkQtn() {
			
			MCMessageList msgL = new MCMessageList();
			if (_updCntrErr) {
				return msgL;
			}
			
			MST_QTN_R qtn = MST_QTN_R.create("T");
			MCQueryApiBuilder qtn_bldr = MCQueryApiBuilder.create(qtn);
			qtn.qtn_no(up0().qtn_no());
			qtn.qtn_rev(up0().qtn_rev());
			//見積ヘッダのロック
			dbSelectKeyForUpdateNoWait("MSBBL6020_MST_QTN_S02", qtn, qtn_bldr, qtn);
			//更新カウンタチェック
			if (!up0().upd_cntr_not_chk_flg()) {
				msgL.addAll(checkUpdCntrNE(up0(), Slo_Del01_HdrR.$qtn_upd_cntr, qtn));
			}
			//空更新
			dbTsUpdateKey("MSBBL6020_MST_QTN_U02", qtn, qtn_bldr.getBaseDbc());
			
			if (!msgL.isEmpty()) {
				_updCntrErr = true;
			}
			if (!isNull(qtn) && !qtn.isEmpty()) {
				up0().qtn_aprv_flg(qtn.aprv_flg());
				up0().qtn_aprv_no(qtn.aprv_no());
			}
			return msgL;
		}

		/**
		 * 出荷進捗のロック、更新カウンタチェック、空更新
		 * @param hdrR
		 * @return
		 */
		protected MCMessageList chkShipPr() {
			
			MCMessageList msgL = new MCMessageList();
			if (_updCntrErr) {
				return msgL;
			}
			
			for (Slo_Del01_DtlR dtlR : up1()) {
				if (!isNull(dtlR.ship_pr_no())) {
					MST_SHIP_PR_R spR = getFirstShipPrCache(dtlR.ship_pr_no());
					if (!dtlR.upd_cntr_not_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(dtlR, Slo_Del01_DtlR.$ship_pr_upd_cntr,spR));
					}
					spR.setAlias("T");
					dbTsUpdateKey("MSBBL6020_MST_SHIP_PR_U02", spR, spR);
				}
			}
			if (!msgL.isEmpty()) {
				_cacheShipPrL = null;
				_updCntrErr = true;
			}
			return msgL;
		}
		
		/**
		 * 固有エラーチェック
		 * @return
		 */
		protected MCMessageList chkOther() {
			MCMessageList msgL = new MCMessageList();
			//削除対象の受注が一次承認済または最終承認済、かつ承認が取消不可の場合
			if ((MAC_APRV_STS_TYP.isACPT(up0().aprv_sts_typ())
					|| MAC_APRV_STS_TYP.isFIX(up0().aprv_sts_typ()))
					&& !up0().can_del_flg()) {				
				MCMessage msg = new MCMessage(MSBBL0161);
				msgL.add(msg);
			}

			boolean hasAfterAction = false;
			for (Slo_Del01_DtlR dtlR : up1()) {
				//全受注明細の、1明細でも出荷指図、出荷実績、インボイス、売上のいずれがが登録されているため、削除できません。				
				//キャッシュから対応する更新前の出荷進捗を取得する。
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.ship_pr_no());
				if (oldShipPrR.ship_inst_qty().gt(0) || oldShipPrR.ship_act_qty().gt(0)
						|| oldShipPrR.iv_schd_qty().gt(0) || oldShipPrR.iv_act_qty().gt(0)
						|| oldShipPrR.sls_qty().gt(0)) {
					hasAfterAction = true;
					break;
				}
			}
			boolean hasAbort = false;
			for (Slo_Del01_DtlR dtlR : up1()) {
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
				//打切ＦＬＧがオンの受注明細がある場合
				if (oldSloDR.abort_flg()) {
					hasAbort = true;
					break;
				}
			}

			if (hasAfterAction) {				
				MCMessage msg = new MCMessage(up0(), null, MSBBL0202);
				msgL.add(msg);
			}
			if (hasAbort) {
				MCMessage msg = new MCMessage(up0(), null, MSBBL0203);
				msgL.add(msg);
			}
			msgL.add(chkAdvShipCtrlTyp());
			return msgL;
		}
		/**
		 * 前受金出荷制御区分チェックを行う。
		 * @return エラーメッセージ
		 */
		protected MCMessage chkAdvShipCtrlTyp() {
			if (MSC_ADV_SHIP_CTRL_TYP.isSHIP_STOP(_cacheSloR.adv_ship_ctrl_typ()) 
					&& !isNull(_cacheSloR.adv_rcv_amt()) && _cacheSloR.adv_rcv_amt().isPositive()) {
				return new MCMessage(up0(), null, MSBBL0307);
			}
			
			return null;
		}
		

		/**
		 * .出荷予定サービスの呼び出し
		 */
		protected void chkShipSchd() {
			//出荷進捗、出荷予定、出荷引当状況の作成のため、出荷予定サービス.更新（出荷進捗・予定）（MSBEL5500.ShipSchd_Upd01）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Chk01 op = MSBEL_ShipSchdService
					.crtShipSchd_Chk01();
			for (Slo_Del01_DtlR dtlR : up1()) {
				//出荷予定サービスの上り電文.ShipSchd_Dtlの削除レコードを作成する。
				//上り電文（ShipPr_Dtl）の設定
				ShipPr_DtlR prR = ShipPr_DtlR.create();
				prR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				prR.ship_pr_no(dtlR.ship_pr_no());
				prR.trd_ptn_typ(_cacheSloR.trd_ptn_typ());
				prR.cred_no_up_flg(true);
				prR.setAttributes(dtlR);
				op.up0().add(prR);
			}
			op.exec();
		}
		

		/**
		 * 承認情報削除前のチェック処理
		 */
		protected void chkAprvService() {
			//承認提供サービス.承認情報削除前のチェック処理			
			if (up0().aprv_flg()) {
				MBBAL_AprvService.Aprv_Chk04 op = MBBAL_AprvService.crtAprv_Chk04();
				Aprv_Chk04_Rslt1R cndR = Aprv_Chk04_Rslt1R.create();
				cndR.peg_no(1);
				cndR.aprv_no(up0().aprv_no());
				cndR.setAttributes(up0());
				op.up0().add(cndR);
				op.exec();					
			}
		}
		
		/**
		 * 	見積が承認対象だった場合、承認次処理済を解除する際のチェックを実行する。
		 */
		protected void callAprvSvChk03() {

			if (isNull(up0().qtn_no()) || !up0().qtn_aprv_flg()) {
				return;
			}
				
			MBBAL_AprvService.Aprv_Chk03 ope = MBBAL_AprvService.crtAprv_Chk03();
				
			Aprv_Chk02_Rslt1R up = ope.up0().createRow();
				
			up.aprv_no(up0().qtn_aprv_no());
			ope.up0().add(up);
				
			ope.exec();
		}
	}
	
	/**
	 * Slo_Chk04オペレーション.<p>
	 *
	 * 前受金入金額更新前チェック<br>
	 */
	public class Slo_Chk04 extends MSBBL_SloRegService_MC_A.Slo_Chk04 {
		/**
		 * 発注予定リスト
		 */
		protected MCList<MST_PO_SCHD_R> _poSchdL = null;
		
		/**
		 * 発注予定インデックス
		 */
		protected MCIndexKey _poSchdIdxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				chkShipSchd();
			}
			setDown();
		}
		
		protected void setDown() {
			down0().setAll(up0());			
		}		

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();	
			initUpd04SloCache(up0());			
			initUpd04ShipPrCache(up0());
			initUpd04ShipSchdCache(up0());			
			return msgL;
		}

		/**
		 * コンテナ属性でできないチェック処理
		 */
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			_cacheSloList = getUpd04SloCache(up0());
			_cacheUpd04ShipSchdL = getUpd04ShipSchdCache(up0());
			_cacheUpd04ShipPrL = getUpd04ShipPrCache(up0());
			getPoSchdL();
			//ロックした受注ヘッダの取引通貨ＣＤと上り電文の取引通貨がを比較し、
			//異なっていたら以下のメッセージを追加する。エラーＦＬＧはtrueにする
			for (Slo_Upd02_SloR sloR : up0()) {
				//ロックした受注ヘッダ
				MST_SLO_R oldR = getFirstUpd04SloCache(sloR.slo_no());
				if (!isSame(sloR.trd_cur_cd(), oldR.trd_cur_cd())) {					
					msgL.add(new MCMessage(sloR, null, MSBBL0176, sloR.slo_no(),
							oldR.trd_cur_cd(), sloR.trd_cur_cd(), toDispGUIIndex(sloR)));
					sloR.err_flg(true);
				}
				msgL.add(chkBcstCd(sloR, oldR));
				msgL.add(chkAdvRcvAmt(sloR, oldR));
			}
			return msgL;
		}
		
		
		/**
		 * 出荷予定サービスにより出荷判定をおこなう
		 */
		protected void chkShipSchd() {
			//出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）のサービスを出荷判定モードで実行して、出荷可能を更新する。
			MSBEL_ShipSchdService.ShipSchd_Chk02 op = MSBEL_ShipSchdService
					.crtShipSchd_Chk02();
			MCList<MST_SHIP_SCHD_R> shipSchdAllL = MCList.create(MST_SHIP_SCHD_R.class);
			MCIndexKey shipPridxkey = _cacheUpd04ShipPrL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			for (Slo_Upd02_SloR r : up0()) {
				for (MST_SHIP_SCHD_R shipSchdR : _cacheUpd04ShipSchdL) {
					MST_SHIP_PR_R shipPrR = _cacheUpd04ShipPrL.getFirst(shipPridxkey, shipSchdR.ship_pr_no());
					if (isSame(r.slo_no(), shipSchdR.getStringNE("slo_no")) && !isTrnst(shipPrR)) {
						shipSchdAllL.add(shipSchdR);
					}					
				}
			}
			int pegNo = 1;
			for (MST_SHIP_SCHD_R r : shipSchdAllL) {
				ShipSchd_DtlR upR = ShipSchd_DtlR.create();
				upR.ship_schd_no(r.ship_schd_no());
				upR.ship_pr_no(r.ship_pr_no());
				upR.peg_no(pegNo);
				upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				upR.not_dt_calc_flg(r.not_dt_calc_flg());
				upR.ship_judge_flg(true);
				upR.iv_chk_skip_flg(true);
				op.up0().add(upR);
				pegNo++;
			}
			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}
		/**
		 * 請求先チェックを行う。
		 * @param upR 上り電文の行
		 * @return エラーメッセージ
		 */
		protected MCMessage chkBcstCd(Slo_Upd02_SloR upR, MST_SLO_R sloR) {
			MAM_BP_R cstR = getBp(sloR.cst_cd());
			MAM_BP_R acstR = getBp(cstR.acst_cd());
			if (!isSame(upR.bcst_cd(), acstR.bcst_cd())) {
				upR.err_flg(true);
				return new MCMessage(upR, null, MSBBL0308, sloR.slo_no(), acstR.bcst_cd(), upR.bcst_cd());
			}
			
			return null;
		}
		/**
		 * 前受金入金額のチェックを行う。
		 * @param upR 上り電文の行
		 * @return エラーメッセージ
		 */
		protected MCMessage chkAdvRcvAmt(Slo_Upd02_SloR upR, MST_SLO_R sloR) {
			
			MCNumber advRcvAmt = nvl(sloR.adv_rcv_amt(), MCNumber.ZERO).add(upR.adv_rcv_amt());
			if (MSC_ADV_SHIP_CTRL_TYP.isSHIP_STOP(sloR.adv_ship_ctrl_typ()) && advRcvAmt.lt(sloR.adv_bill_amt())) {
				for (MST_SHIP_PR_R shipPrR : _cacheUpd04ShipPrL) {
					if (isTrnst(shipPrR) || (shipPrR.purc_ddlv_flg() && isPo(shipPrR))) {
						upR.err_flg(true);
						return new MCMessage(sloR, null, MSBBL0305, sloR.adv_bill_amt(), advRcvAmt);
					}
				}
			}
			
			return null;
		}
		/**
		 * 後続業務が登録されているか評価する
		 * @param shipPrR ＤＢの出荷進捗
		 * @return 後続業務が登録されているはtrue
		 */
		protected boolean isTrnst(MST_SHIP_PR_R shipPrR) {
			
			return (!isNull(shipPrR.ship_inst_qty()) && shipPrR.ship_inst_qty().gt(0))
					|| (!isNull(shipPrR.ship_act_qty()) && shipPrR.ship_act_qty().gt(0));
		}
		/**
		 * 仕入直送の発注予定情報を取得する。
		 */
		protected void getPoSchdL() {
			
			MCList<MST_SHIP_PR_R> bindL = MCList.create(MST_SHIP_PR_R.class);
			bindL.setAll(_cacheUpd04ShipPrL.subList(r->r.purc_ddlv_flg()));
			
			_poSchdL = MCList.create(MST_PO_SCHD_R.class);
			if (!bindL.isEmpty()) {
				MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
				poSchdL_bldr.setSelect(t.slo_d_no, t.po_flg);
				poSchdL_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
				poSchdL_bldr.addConstWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				
				dbSelectColumn("MSBBL6020_MST_PO_SCHD_S04", _poSchdL, poSchdL_bldr, MST_PO_SCHD_R.$slo_d_no, bindL, MST_SHIP_PR_R.$slo_d_no);
			}
			
			_poSchdIdxkey = _poSchdL.createIndex(MST_PO_SCHD_R.$slo_d_no);
		}
		/**
		 * 受注明細に紐づく発注予定が発注済か判定する。
		 * @param shipPrR 出荷進捗
		 * @return 発注済の場合はtrue
		 */
		protected boolean isPo(MST_SHIP_PR_R shipPrR) {
			
			MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_poSchdIdxkey, shipPrR.slo_d_no());
			
			return !isNull(poSchdR) && poSchdR.po_flg();
		}
	}
	
	/**
	 * 品目マスタのチェック
	 */
	protected MCMessageList chkItm(MCRow r) {
		
		MCMessageList msgL = new MCMessageList();
		
		MST_SLO_D_R SloDR = getFirstSloDCache(r.getString("slo_d_no"));
		
		MAM_ITM_R itmR = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(itmR);
		dbSelectKey("MSBBL6020_MAM_ITM_S01", itmR, itmR_bldr, SloDR.itm_cd(), SloDR.itm_sub1(), SloDR.itm_sub2(), SloDR.itm_sub3());
		
		if(isNull(itmR) || itmR.isEmpty()) {
			msgL.add(new MCMessage(r, null, MAUAL0189,
					toDispItm(SloDR.itm_cd(), SloDR.itm_sub1(), SloDR.itm_sub2(), SloDR.itm_sub3()),
					toDispGUIIndex(r)));
		}
		return msgL;
	}
	
	/**
	 * 品目詳細マスタのチェック
	 */
	protected MCMessageList chkItmDtl(MCList<?> sloL) {
		
		MCMessageList msgL = new MCMessageList();
		
		for (MCRow r : sloL) {

			MST_SLO_D_R SloDR = getFirstSloDCache(r.getString("slo_d_no"));
			
			if (!isNull(SloDR) && !isNull(SloDR.sppl_cd())) {
				String WgCd = "";
				MCDate baseDt = null;

				//仕入直送の場合
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(SloDR.proc_typ())) {
					//仕入直送の場合、売上部門で場所マスタから場所CDを取得する
					String midLocCd = MSUCL_SlsUtil.getMidLocCd(_cacheSloR.sls_dpt_cd(), _cacheSloR.slo_dt());
					//場所マスタからWG_CDを取得する。
					MAM_LOC_R midlocR = getLoc(midLocCd);
					WgCd = midlocR.wg_cd();
					if ( !isNull(r.getDateNE("dlv_rqst_tm")) && !r.getDateNE("dlv_rqst_tm").equals(SloDR.dlv_rqst_tm())) {
						baseDt = r.getDateNE("dlv_rqst_tm");
					} else {
						baseDt = SloDR.dlv_rqst_tm();
					}
				}
				else {
					//明細の場所、或は通常場所のWG_CDを取得
					MAM_LOC_R locR = getLoc(nvl(SloDR.loc_cd(), SloDR.def_loc_cd()));
					WgCd = locR.wg_cd();

					MST_SHIP_PR_R shipPrR = MST_SHIP_PR_R.create("T");
					MCQueryApiBuilder shipPrR_bldr = MCQueryApiBuilder.create(shipPrR);
					shipPrR_bldr.setWhere(shipPrR.slo_d_no.eq(bind("slo_d_no")));
					dbSelect("MSBBL6020_MST_SHIP_PR_S03", shipPrR, shipPrR_bldr, SloDR);

					baseDt = shipPrR.ship_schd_tm();
				}

				MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
				MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
				poSchdL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
				poSchdL_bldr.addWhereWithAnd(t.org_flg.eq(value(true)));
				poSchdL_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				dbSelect("MSBBL6020_MST_PO_SCHD_S03", poSchdL, poSchdL_bldr, SloDR);
				
				MST_WG_RQST_R wgRqstR = _wgRqstL.getFirst(_wgRqstKey, r.getString("slo_d_no"));
				if (poSchdL.isEmpty() && isNull(wgRqstR)) {
					continue;
				}
				MST_SLO_D_R tmpSloDR = SloDR.clone();
				String msgId = null;
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(tmpSloDR.proc_typ())) {
					msgId = MSBBL0408;
				}
				else {
					msgId = MSBBL0407;
				}
				boolean outsrcFlg = isOutSrc(wgRqstR, poSchdL);
				if (!poSchdL.isEmpty()) {
					for (MST_PO_SCHD_R poSchdR : poSchdL) {
						tmpSloDR.setStringNE(MST_PO_SCHD_R.$mfg_loc_cd, poSchdR.mfg_loc_cd());
						tmpSloDR.setStringNE(MST_PO_SCHD_R.$bom_ptn, poSchdR.bom_ptn());
						MCDate poSchdDt = callPurcUtilSrch01(baseDt, tmpSloDR, _cacheSloR.slo_dt(), _cacheSloR.sls_dpt_cd());
						if (isNull(poSchdDt) || chkOutsrcLoc(tmpSloDR, outsrcFlg)) {
							MCMessage msg = new MCMessage(r, null, msgId,
								toDispItm(tmpSloDR.itm_cd(), tmpSloDR.itm_sub1(), tmpSloDR.itm_sub2(), tmpSloDR.itm_sub3()),
								WgCd,
								outsrcFlg ? poSchdR.bom_ptn() : MAC_STR.NULL_VAL.value(),
								outsrcFlg ? poSchdR.mfg_loc_cd() : MAC_STR.NULL_VAL.value(),
								outsrcFlg ? MAC_STR.NULL_VAL.value(): tmpSloDR.sppl_cd(),
								nvl(tmpSloDR.maker_cd(), MAC_STR.NULL_VAL.value()),
								toYMDString(baseDt), toDispGUIIndex(r));
							msgL.add(msg);
						}
					}
				}
				else {
					tmpSloDR.setStringNE(MST_PO_SCHD_R.$mfg_loc_cd, wgRqstR.mfg_loc_cd());
					tmpSloDR.setStringNE(MST_PO_SCHD_R.$bom_ptn, wgRqstR.bom_ptn());
					MCDate poSchdDt = callPurcUtilSrch01(baseDt, tmpSloDR, _cacheSloR.slo_dt(), _cacheSloR.sls_dpt_cd());
					if (isNull(poSchdDt) || chkOutsrcLoc(tmpSloDR, outsrcFlg)) {
						MCMessage msg = new MCMessage(r, null, msgId,
							toDispItm(tmpSloDR.itm_cd(), tmpSloDR.itm_sub1(), tmpSloDR.itm_sub2(), tmpSloDR.itm_sub3()),
							WgCd,
							outsrcFlg ? wgRqstR.bom_ptn() : MAC_STR.NULL_VAL.value(),
							outsrcFlg ? wgRqstR.mfg_loc_cd() : MAC_STR.NULL_VAL.value(),
							outsrcFlg ? MAC_STR.NULL_VAL.value() : tmpSloDR.sppl_cd(),
							nvl(tmpSloDR.maker_cd(), MAC_STR.NULL_VAL.value()),
							toYMDString(baseDt), toDispGUIIndex(r));
						msgL.add(msg);
					}
				}
			}
		}
		return msgL;
	}
	
	protected boolean chkOutsrcLoc(MST_SLO_D_R tmpSloDR, boolean outsrcFlg) {
		if (!outsrcFlg) {
			return false;
		}
		
		//場所マスタから、発注先ＣＤとメーカＣＤを取得する。
		MAM_LOC_R midlocR = getLoc(tmpSloDR.getString(MST_PO_SCHD_R.$mfg_loc_cd));
		
		if (isSame(midlocR.sppl_cd(), tmpSloDR.sppl_cd())
				&& isSame(nvl(midlocR.maker_cd(), MAC_STR.NULL_VAL.value()), nvl(tmpSloDR.maker_cd(), MAC_STR.NULL_VAL.value()))) {
			return false;
		}
		else {
			return true;
		}
	}
	
	protected boolean isOutSrc(MST_WG_RQST_R wgRqstR, MCList<MST_PO_SCHD_R> poSchdL) {
		if (!poSchdL.isEmpty()) {
			if (poSchdL.get(0).outsrc_flg()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if (!isSame(wgRqstR.mfg_loc_cd(), MAC_STR.NULL_VAL.value())) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	/**
	 * 諸口品登録サービスの登録・更新前チェック処理を呼び出す。
	 * @param dtlL 見積明細
	 */
	protected void callSundryItmRegServiceChk01(MCList<Slo_Upd01_DtlR> dtlL) {

		MABCL_SundryItmRegService.SundryItm_Chk01 ope = MABCL_SundryItmRegService.crtSundryItm_Chk01();
		
		setAll(ope.up0(),
			dtlL.subList(r -> r.sundry_itm_flg() && MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())),
			createMap_SundryItm_Chk01_DtlR_Slo_Upd01_DtlR());
		if (ope.up0().isEmpty()) {
			return;
		}
		
		ope.exec();
		
		throwUpdErr();
	}
	
	/**
	 * 承認情報テーブルから更新可能、取消可能を取得する。 
	 * @param aprvNo 承認NO
	 * @return 承認の更新可能、取消可能
	 */
	protected MBT_APRV_R getAprvR(String aprvNo) {
		
		MBT_APRV_R aprvR = MBT_APRV_R.create("T");
		MCQueryApiBuilder aprvR_bldr = MCQueryApiBuilder.create(aprvR);
		aprvR_bldr.setSelect(aprvR.aprv_upd_flg);
		aprvR_bldr.addSelect(aprvR.aprv_can_flg);
		aprvR_bldr.setWhere(aprvR.aprv_no.eq(bind("1")), aprvNo);
		aprvR_bldr.addWhereWithAnd(aprvR.can_flg.eq(value(false)));
		dbSelect("MSBBL6020_MBT_APRV_S01", aprvR, aprvR_bldr);
		
		return aprvR;
	}
	
	/**
	 * 諸口品登録サービスの登録・更新処理を呼び出す。
	 * @param dtlL 見積明細
	 */
	protected void callSundryItmRegServiceUpd01(MCList<Slo_Upd01_DtlR> dtlL) {

		MABCL_SundryItmRegService.SundryItm_Upd01 ope = MABCL_SundryItmRegService.crtSundryItm_Upd01();
		
		setAll(ope.up0(),
			dtlL.subList(r -> r.sundry_itm_flg() && MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())),
			createMap_SundryItm_Upd01_DtlR_Slo_Upd01_DtlR());
		if (ope.up0().isEmpty()) {
			return;
		}
		
		ope.exec();
	}
	
	protected Map_SundryItm_Upd01_DtlR_Slo_Upd01_DtlR<SundryItm_Upd01_DtlR,Slo_Upd01_DtlR> createMap_SundryItm_Upd01_DtlR_Slo_Upd01_DtlR() {
		return new Map_SundryItm_Upd01_DtlR_Slo_Upd01_DtlR<SundryItm_Upd01_DtlR, Slo_Upd01_DtlR>();
	}

	public class Map_SundryItm_Upd01_DtlR_Slo_Upd01_DtlR<D extends SundryItm_Upd01_DtlR, S extends Slo_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, Slo_Upd01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1, Slo_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2, Slo_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3, Slo_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, Slo_Upd01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, Slo_Upd01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, Slo_Upd01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, Slo_Upd01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, Slo_Upd01_DtlR.$itm_nm);

		}
	}
	
	protected Map_SundryItm_Chk01_DtlR_Slo_Upd01_DtlR<SundryItm_Chk01_DtlR,Slo_Upd01_DtlR> createMap_SundryItm_Chk01_DtlR_Slo_Upd01_DtlR() {
		return new Map_SundryItm_Chk01_DtlR_Slo_Upd01_DtlR<SundryItm_Chk01_DtlR, Slo_Upd01_DtlR>();
	}

	public class Map_SundryItm_Chk01_DtlR_Slo_Upd01_DtlR<D extends SundryItm_Chk01_DtlR, S extends Slo_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, Slo_Upd01_DtlR.$peg_no);
			addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ, Slo_Upd01_DtlR.$data_crud_typ);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, Slo_Upd01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1, Slo_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2, Slo_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3, Slo_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, Slo_Upd01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, Slo_Upd01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, Slo_Upd01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, Slo_Upd01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, Slo_Upd01_DtlR.$itm_nm);

		}
	}	

	protected Map_Sls_Schd_Upd04_DtlR_MST_SLS_SCHD_R<Sls_Schd_Upd04_DtlR, MST_SLS_SCHD_R> createMap_Sls_Schd_Upd04_DtlR_MST_SLS_SCHD_R() {
		return new Map_Sls_Schd_Upd04_DtlR_MST_SLS_SCHD_R<Sls_Schd_Upd04_DtlR, MST_SLS_SCHD_R>();
	}

	public class Map_Sls_Schd_Upd04_DtlR_MST_SLS_SCHD_R<D extends Sls_Schd_Upd04_DtlR, S extends MST_SLS_SCHD_R>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value()); //売上予定作成元区分
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分
			dest.purc_schd_no(src.purc_schd_no()); //仕入予定ＮＯ
			dest.po_schd_no(src.po_schd_no()); //発注予定ＮＯ
			dest.slo_d_no(src.slo_d_no()); //受注明細NO
			dest.wg_rqst_no(src.wg_rqst_no()); //WG間依頼ＮＯ
			dest.sls_schd_dt(src.sls_schd_dt()); //売上予定日
			dest.trd_unit_qty(src.trd_unit_qty()); //取引単位数量
			dest.trd_unit_cd(src.trd_unit_cd()); //取引単位ＣＤ
			dest.base_unit_qty(src.base_unit_qty()); //基準単位数量
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.lot_no(src.lot_no()); //ロットＮＯ
			dest.sublot_no(src.sublot_no()); //サブロットＮＯ
			dest.abort_flg(src.abort_flg()); //打切ＦＬＧ
			dest.inst_po_flg(true); //指図・発注済
		}
	}
	/**
	* 品目マスタ(ＷＧ)、品目マスタ、ワーキンググループマスタの順で引当余裕日数を取得する。
	*/
	protected MCList<MAVM_ITM_WG_R> getItmMgnD(MCList<Slo_Upd01_DtlR> up1) {
		MCList<Slo_Upd01_DtlR> sloBindL = MCList.create(Slo_Upd01_DtlR.class);

		for (Slo_Upd01_DtlR r : up1) {
			Slo_Upd01_DtlR tmpR = Slo_Upd01_DtlR.create();
			tmpR.itm_cd(r.itm_cd());
			tmpR.itm_sub1(r.itm_sub1());
			tmpR.itm_sub2(r.itm_sub2());
			tmpR.itm_sub3(r.itm_sub3());
			tmpR.loc_cd(nvl(r.loc_cd(), r.def_loc_cd()));
			sloBindL.add(tmpR);
		}
		
		MCList<MAVM_ITM_WG_R> dbc = MCList.create(MAVM_ITM_WG_R.class);
		MAVM_ITM_WG_R t = MAVM_ITM_WG_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R m2 = MAM_LOC_R.create("M2");
		dbc_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.alloc_margin_days, t.not_xfr_flg, m2.loc_cd);
		dbc_bldr.addInnerJoin(m2, bracket(t.wg_cd.eq(m2.wg_cd)));
		dbc_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
		dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbc_bldr.addWhereWithAnd(m2.loc_cd.eq(bind("loc_cd")));
		dbSelect("MSBBL6020_MAVM_ITM_WG_S01", dbc, dbc_bldr,
				sloBindL.groupBy(Slo_Upd01_DtlR.$itm_cd, Slo_Upd01_DtlR.$itm_sub1,
						Slo_Upd01_DtlR.$itm_sub2, Slo_Upd01_DtlR.$itm_sub3,
						Slo_Upd01_DtlR.$loc_cd));

		return dbc;
	}
	
	/**
	 * 出荷指図に纏めない「2：ピッキングなし」の明細が存在するか確認する。
	 * @param sloNoL 受注ＮＯリスト
	 */
	protected void chkNoPick(List<String> sloNoL) {
		
		MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
		MST_SLO_R sloR = null;
		for (String sloNo : sloNoL) {
			sloR = MST_SLO_R.create();
			sloR.slo_no(sloNo);
			sloL.add(sloR);
		}

		MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(MST_SLO_R.create("T"));
		dbWkDelete("MSBBL6020_MSW_SLO_D01", sloL_bldr.getBaseDbc());
		dbWkInsert("MSBBL6020_MSW_SLO_I01", sloL, sloL_bldr.getBaseDbc());
		
		MCList<MST_SLO_D_R> noPickL = MCList.create(MST_SLO_D_R.class);

		executeQuery(noPickL, MSBBL6020_MST_SLO_D_S01(), sloR);
		
		dbWkDelete("MSBBL6020_MSW_SLO_D02", sloL_bldr.getBaseDbc());
		
		for (MST_SLO_D_R noPickR : noPickL) {
			if (!isNull(noPickR.tdlv_cd())) {
				MCMessagePool.add(new MCMessage(MSBBL0404, noPickR.slo_no(), noPickR.slo_d_no(), noPickR.tdlv_cd()));
			}
			else {
				MCMessagePool.add(new MCMessage(MSBBL0405, noPickR.slo_no(), noPickR.slo_d_no(), noPickR.dlv_cd()));
			}
		}
	}
	
	/**
	 * 購買共通ユーティリティ呼出
	 * 
	 * @param baseDt 算出元の納入希望日
	 * @param dtlR 処理対象明細行
	 * @param sloDt 受注日
	 * @param slsDptCd 売上部門
	 * @return 購買共通ユーティリティ取得結果（発注予定日）
	 */
	protected MCDate callPurcUtilSrch01(MCDate baseDt, MCRow dtlR, MCDate sloDt, String slsDptCd) {
		
		MAM_BP_R dlvR = getBp(dtlR.getString("dlv_cd"));
		MAM_BP_R spplR = getBp(dtlR.getString("sppl_cd"));
		MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
		
		// 購買共通ユーティリティへの電文設定
		PurcUtil_Srch01_DtlR purcSrchDtlR = PurcUtil_Srch01_DtlR.create();
		purcSrchDtlR.peg_no(MCNumber.ZERO);										// 紐付けＮＯ
		purcSrchDtlR.sppl_cd(dtlR.getString("sppl_cd"));						// 発注先ＣＤ
		purcSrchDtlR.itm_cd(dtlR.getString("itm_cd"));							// 品目ＣＤ
		purcSrchDtlR.itm_sub1(dtlR.getString("itm_sub1"));						// 枝番１
		purcSrchDtlR.itm_sub2(dtlR.getString("itm_sub2"));						// 枝番２
		purcSrchDtlR.itm_sub3(dtlR.getString("itm_sub3"));						// 枝番３
		purcSrchDtlR.maker_cd(dtlR.getString("maker_cd"));						// メーカＣＤ
		purcSrchDtlR.sppl_cal_cd(spplR.sppl_cal_cd());							// 発注先カレンダＣＤ
		if (!isNullOrNullVal(dtlR.getStringNE("mfg_loc_cd"))) {
			purcSrchDtlR.mfg_loc_cd(dtlR.getString("mfg_loc_cd"));
			purcSrchDtlR.bom_ptn(dtlR.getString("bom_ptn"));
		}
		
		// 仕入直送の場合
		if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.getString("proc_typ"))) {
			String midLocCd = MSUCL_SlsUtil.getMidLocCd(slsDptCd, sloDt);
			MAM_LOC_R midlocR = getLoc(midLocCd);
			purcSrchDtlR.dlv_cd(dtlR.getString("dlv_cd"));							// 納品先ＣＤ
			purcSrchDtlR.dlv_cal_cd(dlvR.dlv_cal_cd());								// 納品先カレンダＣＤ
			purcSrchDtlR.wg_cd(midlocR.wg_cd());									// ＷＧ　ＣＤ
			purcSrchDtlR.in_to_loc_cd(midlocR.loc_cd());							// 納入場所ＣＤ
			purcSrchDtlR.prov_ddlv_flg(isNull(midlocR.sppl_cd()) ? false : true);	// 支給直送ＦＬＧ
			purcSrchDtlR.site_cd(midlocR.site_cd());								// 工場・物流倉庫ＣＤ
			purcSrchDtlR.in_to_loc_cal_cd(midlocR.cal_cd());						// 納入場所カレンダＣＤ
			purcSrchDtlR.dlv_rqst_dt(baseDt);										// 納入希望日
		}
		else {
			MAM_LOC_R locR = getLoc(nvl(dtlR.getString("loc_cd"), dtlR.getString("def_loc_cd")));
			purcSrchDtlR.wg_cd(locR.wg_cd());										// ＷＧ　ＣＤ
			purcSrchDtlR.in_to_loc_cd(locR.loc_cd());								// 納入場所ＣＤ
			purcSrchDtlR.prov_ddlv_flg(isNull(locR.sppl_cd()) ? false : true);		// 支給直送ＦＬＧ
			purcSrchDtlR.site_cd(locR.site_cd());									// 工場・物流倉庫ＣＤ
			purcSrchDtlR.in_to_loc_cal_cd(locR.cal_cd());							// 納入場所カレンダＣＤ
			purcSrchDtlR.rqst_dlv_rqst_dt(baseDt);									// 依頼元納入希望日
		}
		
		// 物流グループＣＤ
		if (!isNull(dtlR.getString("tdlv_cd"))) {
			purcSrchDtlR.lg_grp_cd(dtlR.getString("tdlv_lg_grp_cd"));
		}
		else {
			purcSrchDtlR.lg_grp_cd(dtlR.getString("dlv_lg_grp_cd"));
		}
		purcSrchDtlR.base_unit_qty(dtlR.getNumber("base_unit_qty"));			// 基準単位数量
		
		purcUtilSrch01.up0().add(purcSrchDtlR);
		
		// 購買共通ユーティリティ呼出
		purcUtilSrch01.exec();
		
		// 購買ユーティリティで取得できなかった場合
		if (purcUtilSrch01.down0().get(0).err_flg()) {
			return null;
		}
		
		// 呼出結果の発注予定日を取得
		return purcUtilSrch01.down0().get(0).po_schd_dt();
	}

	/**
	 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
	 * 受注改訂履歴テーブルを更新する。
	 * @param sloR 受注ヘッダ
	 */
	protected void updSloPR(MST_SLO_R sloR) {
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
		opeR.rev_data_src_no(sloR.slo_no());
		opeR.rev_no(sloR.slo_rev());
		opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO.value());
		ope.up0().add(opeR);
		ope.exec();
	}

	/**
	 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
	 * 受注改訂履歴テーブルを更新する。
	 * @param sloL 受注ヘッダリスト
	 */
	protected void updSloPL(MCList<MST_SLO_R> sloL) {
		if (sloL.size() > 0) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_SLO_R r : sloL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.slo_no());
				opeR.rev_no(r.slo_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
	}

	/**
	 * Slo_RevUpd01オペレーション.<p>
	 *
	 * 受注改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class Slo_RevUpd01 extends MSBBL_SloRegService_MC_A.Slo_RevUpd01 {

		MCList<MST_SLO_R> _hCurrentL = MCList.create(MST_SLO_R.class);
		MCList<MST_SLO_D_R> _dCurrentL = MCList.create(MST_SLO_D_R.class);
		MCList<MST_SLO_P_R> _hRevL = MCList.create(MST_SLO_P_R.class);
		MCList<MST_SLO_D_P_R> _dRevL = MCList.create(MST_SLO_D_P_R.class);

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
		 * 上り電文の項目を本体・改訂履歴ヘッダーのワークテーブルに設定
		 */
		private void wkInsert() {
			MCList<MST_SLO_R> wkL = MCList.create(MST_SLO_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SLO_R wkR = MST_SLO_R.create();
				wkR.slo_no(r.rev_data_src_no());
				wkR.slo_rev(r.rev_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLO_R.create("T"));
			dbWkDelete("MSBBL6020_MSW_SLO_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBBL6020_MSW_SLO_I02", wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());

			MCList<MST_SLO_P_R> wkpL = MCList.create(MST_SLO_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SLO_P_R wkpR = MST_SLO_P_R.create();
				wkpR.slo_no(r.rev_data_src_no());
				wkpR.slo_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(MST_SLO_P_R.create("T"));
			dbWkDelete("MSBBL6020_MSW_SLO_P_D01", wkpL_bldr.getBaseDbc());
			dbWkInsert("MSBBL6020_MSW_SLO_P_I01", wkpL.groupBy(wkpL_bldr.getBaseDbc().getKeyColumn()), wkpL_bldr.getBaseDbc());
		}

		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		private void selectCurrent() {
			MST_SLO_R hCurrentL_t = MST_SLO_R.create("T");
			MCQueryApiBuilder hCurrentL_bldr = MCQueryApiBuilder.create(hCurrentL_t);
			MSW_SLO_KEY_R w1 = MSW_SLO_KEY_R.create("W");
			hCurrentL_bldr.addInnerJoin(w1, bracket(hCurrentL_t.slo_no.eq(w1.slo_no)));
			dbSelect("MSBBL6020_MST_SLO_S04", _hCurrentL, hCurrentL_bldr);

			MST_SLO_D_R dCurrentL_t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder dCurrentL_bldr = MCQueryApiBuilder.create(dCurrentL_t);
			dCurrentL_bldr.addInnerJoin(w1, bracket(dCurrentL_t.slo_no.eq(w1.slo_no)));
			dbSelect("MSBBL6020_MST_SLO_D_S07", _dCurrentL, dCurrentL_bldr);

			MST_SLO_P_R hRevL_t = MST_SLO_P_R.create("T");
			MCQueryApiBuilder hRevL_bldr = MCQueryApiBuilder.create(hRevL_t);
			MSW_SLO_P_KEY_R w2 = MSW_SLO_P_KEY_R.create("W");
			hRevL_bldr.addInnerJoin(w2, bracket(hRevL_t.slo_no.eq(w2.slo_no)
											.and(hRevL_t.slo_rev.eq(w2.slo_rev))));
			dbSelect("MSBBL6020_MST_SLO_P_S01", _hRevL, hRevL_bldr);

			MST_SLO_D_P_R dRevL_t = MST_SLO_D_P_R.create("T");
			MCQueryApiBuilder dRevL_bldr = MCQueryApiBuilder.create(dRevL_t);
			dRevL_bldr.addInnerJoin(w2, bracket(dRevL_t.slo_no.eq(w2.slo_no)
											.and(dRevL_t.slo_rev.eq(w2.slo_rev))));
			dbSelect("MSBBL6020_MST_SLO_D_P_S01", _dRevL, dRevL_bldr);
		}

		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加または更新する。
		 */
		private void revisionInsOrUpd() {
			// ヘッダーの改訂履歴テーブルを追加または更新する。
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_SLO_P_R.$slo_no, MST_SLO_P_R.$slo_rev);
			MCList<MST_SLO_P_R> hUpd = MCList.create(MST_SLO_P_R.class);
			MCList<MST_SLO_P_R> hIns = MCList.create(MST_SLO_P_R.class);

			for (MST_SLO_R hcurrentR : _hCurrentL) {
				MST_SLO_P_R tempRevR = MST_SLO_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.slo_no(), hcurrentR.slo_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			if (!isNull(hIns)) {
				dbInsert("MSBBL6020_MST_SLO_P_I01", hIns, MCQueryApiBuilder.create(MST_SLO_P_R.create("T")));
			}
			if (!isNull(hUpd)) {
				MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(MST_SLO_P_R.create("T"));
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBBL6020_MST_SLO_P_U01", hUpd, hUpd_bldr);
			}

			// 明細の改訂履歴テーブルを追加または更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_SLO_D_P_R.$slo_d_no, MST_SLO_D_P_R.$slo_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_SLO_D_P_R.$slo_no);
			MCList<MST_SLO_D_P_R> dUpd = MCList.create(MST_SLO_D_P_R.class);
			MCList<MST_SLO_D_P_R> dIns = MCList.create(MST_SLO_D_P_R.class);

			for (MST_SLO_D_R dcurrentR : _dCurrentL) {
				MST_SLO_D_P_R tempRevR = MST_SLO_D_P_R.create();
				tempRevR.setByName(dcurrentR);

				// ヘッダーより改訂番号を取得
				MST_SLO_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, dcurrentR.slo_no());
				tempRevR.slo_rev(hCurrentR.slo_rev());
				if (_dRevL == null ||isNull(_dRevL.getFirst(dRevIdx, tempRevR.slo_d_no(), tempRevR.slo_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
			}
			if (!isNull(dIns)) {
				dbInsert("MSBBL6020_MST_SLO_D_P_I01", dIns, MCQueryApiBuilder.create(MST_SLO_D_P_R.create("T")));
			}
			if (!isNull(dUpd)) {
				MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(MST_SLO_D_P_R.create("T"));
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBBL6020_MST_SLO_D_P_U01", dUpd, dUpd_bldr);
			}
		}
	}
	protected boolean isSetStrLn(Slo_Upd01_DtlR dtlR) {
		MAM_ITM_R itmR = getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
		if (isNullOrNullVal(dtlR.str_ln_cd())
				&& !MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())
						&& isNullOrNullVal(dtlR.lot_no())) {
			return false;
		}
		return true;
	}

	/**
	 * Slo_BulkImp_Chk01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の登録前のチェック処理、項目値の補完を行う。<br>
	 */
	public class Slo_BulkImp_Chk01 extends MSBBL_SloRegService_MC_A.Slo_BulkImp_Chk01 {
		/**
		 * 品目単位マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		
		/**
		 * 単位マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_UNIT_R> _unitCache = null;
		
		/** 
		 * 担当者マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_USR_R> _usrCache = null;
		
		/** 
		 * 部門マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCache = null;
		
		/** 
		 * 取引先品目マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> _bpItmCache = null;
		
		protected MCList<MAVM_USR_DPT_R> _usrDptCache = null;
		
		protected MCIndexKey _usrDptIdx = null;
		
		/** 
		 * 税マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
		
		/**
		 *  出荷条件マスタ取得
		 */
		protected FXUCL_MCDbcCache<MAM_SHIP_TERM_R> _shipTermCache = null;
		
		/**
		 * 源泉税率のリスト
		 */
		protected MCList<MCRow> _wtaxRate = null;
		/**
		 * 源泉税率のインデックス
		 */
		protected MCIndexKey _wtaxRateIdx = null;
		
		/** 
		 * 国マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_CNTRY_R> _cntryCache = null;
		
		/**
		 * 売上担当者と売上部門マップ
		 */
		protected Map<String, String> _slsUsrDptMap = null;
		
		/**
		 * 税ＣＤのリスト（マスタから算出）
		 */
		protected MCList<Slo_BulkImp_Chk01_DtlR> _slsTax = null;
		/**
		 * 税ＣＤのインデックス
		 */
		protected MCIndexKey _slsTaxIdx = null;
		
		/**
		 * 見積明細のキャッシュ
		 */
		protected MCList<MST_QTN_D_R> _cacheQtnDList = null;
		
		/**
		 * 見積明細のインデックスキー
		 */
		protected MCIndexKey _qtnDIdKey = null;
		
		/**
		 * 受注引当マスタ
		 */
		protected MCList<MAM_SLO_ALLOC_R> _sloAllocL = null;
		
		/**
		 * 受注引当マスタのインデックス(場所を特定するため)
		 */
		protected MCIndexKey _sloAllocLocIdxkey = null;
		
		/**
		 * 受注引当マスタのインデックス
		 */
		protected MCIndexKey _sloAllocIdxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			compl();
			setHdrErrFlg(up0());
			
			MCList<Slo_BulkImp_Chk01_DtlR> notErrL = getNotErrL();
			if (!notErrL.isEmpty()) {
				callSloServiceChk01(notErrL);
				setHdrErrFlg(notErrL);
			}
			
			// 関連エラーメッセージを追加
			MCMessagePool.addAll(getRelationErrMsg());
			
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			
			if (isSame(MCSys.request.logicId(), "MSBBL1220")) {
				_fileImpFlg = true;
			}
			
			up0().sort(getGrpKey());
			complQtn(up0());
			up0().setString(Slo_BulkImp_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			setPegNo(up0());
			setTm(up0());
			setItmSub(up0());
			
			MCList<Slo_BulkImp_Chk01_DtlR>[] grpL = up0().groupList(getGrpKey());
			int cnt = 0;
			for (MCList<Slo_BulkImp_Chk01_DtlR> l : grpL) {
				l.setNumber(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no, cnt++);
			}
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList causeMsgL = super.doServerCheck();
			MCMessageList msgL = new MCMessageList();
			
			causeMsgL.addAll(chkReq(up0()));
			
			if (!causeMsgL.isEmpty()) {
				
				for (MCMessage causeMsg : causeMsgL) {
					
					if (!isNull(causeMsg.getID())) {
						msgL.add(causeMsg);
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<Slo_BulkImp_Chk01_DtlR> notErrL = getNotErrL();
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			beforeChkCompl(notErrL);
			
			msgL.addAll(chkTrdPtn(notErrL));
			
			msgL.addAll(chkQtn(notErrL));
			
			msgL.addAll(chkSlsDpt(notErrL));
			
			msgL.addAll(chkItm(notErrL));
			
			msgL.addAll(chkGd(notErrL));
			
			msgL.addAll(chkQty(notErrL));
			
			msgL.addAll(chkDlv(notErrL));
			
			msgL.addAll(chkTdlv(notErrL));
			
			msgL.addAll(chkShipDlvSchdDt(notErrL));
			
			msgL.addAll(chkSlsSchdDt(notErrL));
			
			msgL.addAll(chkDlvRqstDt(notErrL));
			
			msgL.addAll(chkUpri(notErrL));
			
			msgL.addAll(chkXrate(notErrL));
			
			msgL.addAll(chkIvUpri(notErrL));
			
			msgL.addAll(chkDscntRsn(notErrL));
			
			msgL.addAll(chkSno(notErrL));
			
			msgL.addAll(chkSlsRsn(notErrL));
			
			msgL.addAll(chkBdDpt(notErrL));
			
			msgL.addAll(chkProc(notErrL));
			
			return msgL;
		}
		
		/**
		 * 取引パタンチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTrdPtn(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				if(!Arrays.asList(getAvailTrdTyp()).contains(MAC_TRD_PTN_TYP.getNE(sloRecvIfR.trd_ptn_typ()))) {
					msgL.add(new MCMessage(sloRecvIfR, null, MSBDL0613, sloRecvIfR.trd_cd(), createTrdPtnTypErrMsg(), toDispGUIIndex(sloRecvIfR)));
				}
			}
			
			return msgL;
		}
		
		protected MAC_TRD_PTN_TYP[] getAvailTrdTyp() {
			return new MAC_TRD_PTN_TYP[] {MAC_TRD_PTN_TYP.SLS,MAC_TRD_PTN_TYP.SHIP};
		}
		
		protected String createTrdPtnTypErrMsg() {
			StringBuffer bindSB = null;
			for (MAC_TRD_PTN_TYP r : getAvailTrdTyp()) {
				if (null == bindSB) {
					bindSB = new StringBuffer("");
					bindSB.append(r.name());
				}
				else {
					bindSB.append("、");
					bindSB.append(r.name());
				}
			}
			return bindSB.toString();
		}
		
		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);
			
			if (isSame(column, Slo_BulkImp_Chk01_DtlR.$cst_itm_cd)) {
				Slo_BulkImp_Chk01_DtlR DtlR = (Slo_BulkImp_Chk01_DtlR)data;
				if (MAC_TRD_PTN_TYP.isSHIP(DtlR.trd_ptn_typ())) {
					cnd.put(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
				}
				else if (MAC_TRD_PTN_TYP.isSLS(DtlR.trd_ptn_typ())) {
					cnd.put(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.value());
				}
			}
		}
		
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row,
				String column) {
			if (isSame(paramIndex, 0)) {
				// 得意先品目と品目の両方を設定した場合は得意先品目から品目を補完しない
				if (isSame(column, Slo_BulkImp_Chk01_DtlR.$itm_cd)) {
					if (!isNull(row.getString(Slo_BulkImp_Chk01_DtlR.$itm_cd))) {
						return false;
					}
				}
				if (isSame(column, Slo_BulkImp_Chk01_DtlR.$itm_sub1)) {
					if (!isNull(row.getString(Slo_BulkImp_Chk01_DtlR.$itm_sub1))) {
						return false;
					}
				}
				if (isSame(column, Slo_BulkImp_Chk01_DtlR.$itm_sub2)) {
					if (!isNull(row.getString(Slo_BulkImp_Chk01_DtlR.$itm_sub2))) {
						return false;
					}
				}
				if (isSame(column, Slo_BulkImp_Chk01_DtlR.$itm_sub3) ) {
					if (!isNull(row.getString(Slo_BulkImp_Chk01_DtlR.$itm_sub3))) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		/**
		 * 受注登録サービスの登録チェックを実行する。
		 * @param sloRecvIfL 
		 */
		protected void callSloServiceChk01(MCList<Slo_BulkImp_Chk01_DtlR> notErrL) {
			
			MSBBL_SloRegService.Slo_Chk01 chk01Serv = MSBBL_SloRegService.crtSlo_Chk01();
			
			for (MCList<Slo_BulkImp_Chk01_DtlR> l : notErrL.groupList(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no)) {
				Slo_BulkImp_Chk01_DtlR hdrR = l.get(0);
				
				Slo_Upd01_HdrR opeUp0R = chk01Serv.up0().createRow();
				copy(opeUp0R, hdrR, createMap_Slo_Upd01_HdrR_Slo_BulkImp_Chk01_DtlR());
				chk01Serv.up0().add(opeUp0R);
				
				addAll(chk01Serv.up1(), l, createMap_Slo_Upd01_DtlR_Slo_BulkImp_Chk01_DtlR());
			}
			
			chk01Serv.exec();
			
			MCList<Slo_Upd01_HdrR> down0L =chk01Serv.down0();
			MCList<Slo_Upd01_DtlR> down1L = chk01Serv.down1();
			MCIndexKey idxkey0 = down0L.createIndex(Slo_Upd01_DtlR.$peg_no);
			MCIndexKey idxkey1 = down1L.createIndex(Slo_Upd01_DtlR.$hdr_peg_no,Slo_Upd01_DtlR.$peg_no);
			for (Slo_BulkImp_Chk01_DtlR dtlR : notErrL) {
				Slo_Upd01_HdrR down0R = down0L.getFirst(idxkey0, dtlR.hdr_peg_no());
				Slo_Upd01_DtlR down1R = down1L.getFirst(idxkey1, dtlR.hdr_peg_no(), dtlR.peg_no());
				dtlR.trd_cd(down0R.trd_cd());
				dtlR.trd_ptn_typ(down0R.trd_ptn_typ());
				dtlR.slo_typ(down0R.slo_typ());
				dtlR.aprv_back_flg(down0R.aprv_back_flg());
				dtlR.slo_dt(down0R.slo_dt());
				dtlR.qtn_no(down0R.qtn_no());
				dtlR.qtn_rev(down0R.qtn_rev());
				dtlR.qtn_aprv_flg(down0R.qtn_aprv_flg());
				dtlR.qtn_aprv_no(down0R.qtn_aprv_no());
				dtlR.cst_cd(down0R.cst_cd());
				dtlR.sls_basis_typ(down0R.sls_basis_typ());
				dtlR.sls_usr_cd(down0R.sls_usr_cd());
				dtlR.sls_dpt_cd(down0R.sls_dpt_cd());
				dtlR.wg_cd(down0R.wg_cd());
				dtlR.assort_typ(down0R.assort_typ());
				dtlR.trd_cur_cd(down0R.trd_cur_cd());
				dtlR.xrate_inpt_flg(down0R.xrate_inpt_flg());
				dtlR.xrate(down0R.xrate());
				dtlR.ptax_xrate_inpt_flg(down0R.ptax_xrate_inpt_flg());
				dtlR.ptax_xrate(down0R.ptax_xrate());
				dtlR.wrk_no(down0R.wrk_no());
				dtlR.trnspt_cd(down0R.trnspt_cd());
				dtlR.vssl_flght(down0R.vssl_flght());
				dtlR.load_port_cd(down0R.load_port_cd());
				dtlR.etd_dt(down0R.etd_dt());
				dtlR.dschrg_port_cd(down0R.dschrg_port_cd());
				dtlR.eta_dt(down0R.eta_dt());
				dtlR.via_port_cd(down0R.via_port_cd());
				dtlR.via_schd_dt(down0R.via_schd_dt());
				dtlR.iv_no(down0R.iv_no());
				dtlR.iv_num_flg(down0R.iv_num_flg());
				dtlR.adv_ship_ctrl_typ(down0R.adv_ship_ctrl_typ());
				dtlR.adv_bill_amt(down0R.adv_bill_amt());
				dtlR.adv_rcv_amt(down0R.adv_rcv_amt());
				dtlR.tterm_cd1(down0R.tterm_cd1());
				dtlR.tterm_rmrks1(down0R.tterm_rmrks1());
				dtlR.tterm_cd2(down0R.tterm_cd2());
				dtlR.tterm_rmrks2(down0R.tterm_rmrks2());
				dtlR.tterm_cd3(down0R.tterm_cd3());
				dtlR.tterm_rmrks3(down0R.tterm_rmrks3());
				dtlR.cst_po_no(down0R.cst_po_no());
				dtlR.cst_po_rev(down0R.cst_po_rev());
				dtlR.ar_dpt_cd(down0R.ar_dpt_cd());
				dtlR.rcpt_dt(down0R.rcpt_dt());
				dtlR.rcpt_usr_cd(down0R.rcpt_usr_cd());
				dtlR.cst_po_rmrks(down0R.cst_po_rmrks());
				dtlR.trd_rmrks(down0R.trd_rmrks());
				dtlR.intr_rmrks(down0R.intr_rmrks());
				dtlR.sub_char1(down0R.sub_char1());
				dtlR.sub_char2(down0R.sub_char2());
				dtlR.sub_char3(down0R.sub_char3());
				dtlR.edi_flg(down0R.edi_flg());
				dtlR.cst_iv_flg(down0R.cst_iv_flg());
				dtlR.cntry_cd(down0R.cntry_cd());
				dtlR.sls_amt_rnd_typ(down0R.sls_amt_rnd_typ());
				dtlR.sls_tax_rnd_typ(down0R.sls_tax_rnd_typ());
				dtlR.amt_dec_place(down0R.amt_dec_place());
				dtlR.hdr_err_flg(down0R.err_flg());
				
				copy(dtlR, down1R, createMap_Slo_BulkImp_Chk01_DtlR_Slo_Upd01_DtlR());
			}
		}
		
		/***
		 * 関連エラーメッセージ取得
		 * 
		 * @param hdrL ヘッダレコードリスト
		 * @param dtlL 明細レコードリスト
		 * @return 関連エラーメッセージリスト
		 */
		protected MCMessageList getRelationErrMsg() {
			MCMessageList resultMsgL = new MCMessageList();
			MCList<Slo_BulkImp_Chk01_DtlR> upL = up0();
			MCList<Slo_BulkImp_Chk01_DtlR>[] grpL = upL.groupList(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no);
			for (MCList<Slo_BulkImp_Chk01_DtlR> l : grpL) {
				Slo_BulkImp_Chk01_DtlR hdrR = l.getFirst(Slo_BulkImp_Chk01_DtlR.$hdr_err_flg, true);
				Slo_BulkImp_Chk01_DtlR causeDtlR = l.getFirst(Slo_BulkImp_Chk01_DtlR.$dtl_err_flg, true);
				
				// ヘッダ、明細共に正常の場合、次のヘッダへ
				if (isNull(hdrR) && isNull(causeDtlR)) {
					continue;
				}
				
				for (Slo_BulkImp_Chk01_DtlR dtlR : l) {
					if (!isNull(hdrR) && hdrR.hdr_err_flg()) {
						if (!isSame(hdrR.getGUIIndex(), dtlR.getGUIIndex()) && !dtlR.hdr_err_flg()) {
							resultMsgL.add(new MCMessage(dtlR, null, MSUCL0020, hdrR.getGUIIndex() + 1, toDispGUIIndex(dtlR)));
						}
						
						// ヘッダエラーの場合、明細の関連メッセージは不要。
						continue;
					}
					
					// 明細エラーメッセージの追加
					if (!dtlR.dtl_err_flg() && !isNull(causeDtlR)) {
						resultMsgL.add(new MCMessage(dtlR, null, MSUCL0021, causeDtlR.getGUIIndex() + 1, toDispGUIIndex(dtlR)));
					}
				}
			}
			
			return resultMsgL;
		}
		
		/**
		 * 同一取込グループにエラーのないリストを返す
		 * @return
		 */
		protected MCList<Slo_BulkImp_Chk01_DtlR> getNotErrL() {
			
			if (hasErrFlgOn(up0())) {
				MCList<Slo_BulkImp_Chk01_DtlR> notErrL = up0().createInstance();
				for (MCList<Slo_BulkImp_Chk01_DtlR> list : up0().groupList(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no)) {
					if (!hasErrFlgOn(list)) {
						notErrL.addAll(list);
					}
				}
				return notErrL;
			}
			else {
				return up0();
			}
		}
		
		/**
		 * リストロジックチェックを行う前に、受注日とその他の日時を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setTm(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				sloRecvIfR.slo_dt(nvl(sloRecvIfR.slo_dt(), getToday()));
				
				if (!isNull(sloRecvIfR.ship_rqst_dt())) {
					sloRecvIfR.ship_rqst_tm(getYmdHm(sloRecvIfR.ship_rqst_dt(), sloRecvIfR.ship_rqst_hm()));
				}
				if (!isNull(sloRecvIfR.dlv_rqst_dt())) {
					sloRecvIfR.dlv_rqst_tm(getYmdHm(sloRecvIfR.dlv_rqst_dt(), sloRecvIfR.dlv_rqst_hm()));
				}
				if (!isNull(sloRecvIfR.ship_schd_dt())) {
					sloRecvIfR.ship_schd_tm(getYmdHm(sloRecvIfR.ship_schd_dt(), sloRecvIfR.ship_schd_hm()));
				}
				if (!isNull(sloRecvIfR.dlv_schd_dt())) {
					sloRecvIfR.dlv_schd_tm(getYmdHm(sloRecvIfR.dlv_schd_dt(), sloRecvIfR.dlv_schd_hm()));
				}
			}
		}
		
		/**
		 * リストロジックチェックを行う前に、品目の枝番を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setItmSub(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			if (_fileImpFlg) {
				
				for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
					
					if (!isNull(sloRecvIfR.itm_cd())) {
						
						sloRecvIfR.itm_sub1(nvl(sloRecvIfR.itm_sub1(), MAC_STR.NULL_VAL.value()));
						sloRecvIfR.itm_sub2(nvl(sloRecvIfR.itm_sub2(), MAC_STR.NULL_VAL.value()));
						sloRecvIfR.itm_sub3(nvl(sloRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value()));
					}
				}
			}
		}
		
		/**
		 * 見積引継の場合、見積情報を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void complQtn(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			initQtnCache(sloRecvIfL);
			initQtnDCache(sloRecvIfL);
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if(isNull(sloRecvIfR.qtn_no())) {
					continue;
				}
				
				MST_QTN_R qtn = getQtnCache(sloRecvIfR.qtn_no(), sloRecvIfR.qtn_rev());
				MST_QTN_D_R qtnD = getQtnDCache(sloRecvIfR.qtn_d_no());
				
				if (!isNull(qtnD) && isTrnst(qtn)) {
					
					// 見積ヘッダ
					sloRecvIfR.trd_cd(qtn.trd_cd());
					sloRecvIfR.qtn_no(qtn.qtn_no());
					sloRecvIfR.qtn_rev(qtn.qtn_rev());
					sloRecvIfR.aprv_flg(qtn.aprv_flg());
					sloRecvIfR.aprv_no(qtn.aprv_no());
					sloRecvIfR.aprv_sts_typ(qtn.aprv_sts_typ());
					sloRecvIfR.cst_cd(qtn.cst_cd());
					sloRecvIfR.sls_usr_cd(qtn.sls_usr_cd());
					sloRecvIfR.sls_dpt_cd(qtn.sls_dpt_cd());
					sloRecvIfR.trd_cur_cd(qtn.trd_cur_cd());
					sloRecvIfR.xrate(qtn.xrate());
					sloRecvIfR.wrk_no(qtn.wrk_no());
					sloRecvIfR.trnspt_cd(qtn.trnspt_cd());
					sloRecvIfR.tterm_cd1(qtn.tterm_cd1());
					sloRecvIfR.tterm_rmrks1(qtn.tterm_rmrks1());
					sloRecvIfR.tterm_cd2(qtn.tterm_cd2());
					sloRecvIfR.tterm_rmrks2(qtn.tterm_rmrks2());
					sloRecvIfR.tterm_cd3(qtn.tterm_cd3());
					sloRecvIfR.tterm_rmrks3(qtn.tterm_rmrks3());
					// 見積明細
					sloRecvIfR.qtn_d_no(qtnD.qtn_d_no());
					sloRecvIfR.cst_itm_cd(qtnD.cst_itm_cd());
					sloRecvIfR.cst_itm_nm(qtnD.cst_itm_nm());
					sloRecvIfR.itm_cd(qtnD.itm_cd());
					sloRecvIfR.itm_sub1(qtnD.itm_sub1());
					sloRecvIfR.itm_sub2(qtnD.itm_sub2());
					sloRecvIfR.itm_sub3(qtnD.itm_sub3());
					sloRecvIfR.itm_nm(qtnD.itm_nm());
					sloRecvIfR.iv_itm_nm(qtnD.iv_itm_nm());
					sloRecvIfR.cntry_org_cd(qtnD.cntry_org_cd());
					sloRecvIfR.trd_unit_cd(qtnD.trd_unit_cd());
					sloRecvIfR.upri_not_tgt_flg(true);
					sloRecvIfR.trd_cur_upri(qtnD.trd_cur_upri());
					sloRecvIfR.trd_cur_dscnt_amt(qtnD.trd_cur_dscnt_amt());
					sloRecvIfR.dscnt_rsn_cd(qtnD.dscnt_rsn_cd());
					sloRecvIfR.tax_fix_flg(qtnD.tax_fix_flg());
					sloRecvIfR.tax_cd(qtnD.tax_cd());
					sloRecvIfR.cost_upri(qtnD.cost_upri());
					sloRecvIfR.gd_cd(qtnD.gd_cd());
					sloRecvIfR.sno1(qtnD.sno1());
					sloRecvIfR.sno2(qtnD.sno2());
					sloRecvIfR.sno3(qtnD.sno3());
					sloRecvIfR.sno4(qtnD.sno4());
					sloRecvIfR.set_itm_grp_no(qtnD.set_itm_grp_no());
					sloRecvIfR.dlv_cd(qtnD.dlv_cd());
					sloRecvIfR.dlv_nm(qtnD.dlv_nm());
					sloRecvIfR.dlv_cntct_dpt(qtnD.dlv_cntct_dpt());
					sloRecvIfR.dlv_cntct_psn(qtnD.dlv_cntct_psn());
					sloRecvIfR.dlv_zip_cd(qtnD.dlv_zip_cd());
					sloRecvIfR.dlv_addr1(qtnD.dlv_addr1());
					sloRecvIfR.dlv_addr2(qtnD.dlv_addr2());
					sloRecvIfR.dlv_addr3(qtnD.dlv_addr3());
					sloRecvIfR.dlv_addr4(qtnD.dlv_addr4());
					sloRecvIfR.dlv_tel(qtnD.dlv_tel());
					sloRecvIfR.dlv_fax(qtnD.dlv_fax());
					sloRecvIfR.dest_cd1(qtnD.dest_cd1());
					sloRecvIfR.dest_cd2(qtnD.dest_cd2());
					sloRecvIfR.dest_cd3(qtnD.dest_cd3());
					sloRecvIfR.qtn_no_copy_flg(true);
				}
			}
		}
		
		/**
		 * 受注ファイルリストの補完を行う。
		 */
		protected void compl() {
			
			complHdr();
			complDtl();
		}
		
		/**
		 * 受注ファイルリストのヘッダ項目の補完を行う。
		 */
		protected void complHdr() {

			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : getNotErrL()) {
				
				setAssortTyp(sloRecvIfR);
				
				setAdv(sloRecvIfR);
				
				setArDpt(sloRecvIfR);
			}
		}
		
		/**
		 * 品揃区分を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setAssortTyp(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (isNull(sloRecvIfR.assort_typ())) {
				sloRecvIfR.assort_typ(MSC_SHIP_ASSORT_TYP.NON.value());
			}
			
			if (!isNull(sloRecvIfR.iv_no()) || sloRecvIfR.iv_num_flg()) {
				sloRecvIfR.assort_typ(MSC_SHIP_ASSORT_TYP.AST.value());
			}
		}
		
		/**
		 * 前受金に関連する項目を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setAdv(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (MAC_TRD_PTN_TYP.isSHIP(sloRecvIfR.trd_ptn_typ())) {
				sloRecvIfR.adv_ship_ctrl_typ(MSC_ADV_SHIP_CTRL_TYP.SHIP_ABL.value());
				sloRecvIfR.adv_bill_amt(null);
			}
			else {
				if (isNull(sloRecvIfR.adv_ship_ctrl_typ())) {
					sloRecvIfR.adv_ship_ctrl_typ(MSC_ADV_SHIP_CTRL_TYP.SHIP_ABL.value());
					sloRecvIfR.adv_bill_amt(null);
				}
				else if(MSC_ADV_SHIP_CTRL_TYP.isSHIP_ABL(sloRecvIfR.adv_ship_ctrl_typ())){
					sloRecvIfR.adv_bill_amt(null);
				}
			}
		}
		
		/**
		 * 債権部門を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setArDpt(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (MAC_TRD_PTN_TYP.isSLS(sloRecvIfR.trd_ptn_typ())) {
				if(isNull(sloRecvIfR.ar_dpt_cd())) {
					if (MAC_AR_DPT_TYP.isAR(sloRecvIfR.ar_dpt_typ())) {
						sloRecvIfR.ar_dpt_cd(sloRecvIfR.cst_ar_dpt_cd());
						sloRecvIfR.ar_dpt_nm(getDptR(sloRecvIfR.slo_dt(), sloRecvIfR.sls_dpt_cd()).dpt_nm());
					}
					else if (MAC_AR_DPT_TYP.isSLS(sloRecvIfR.ar_dpt_typ())) {
						sloRecvIfR.ar_dpt_cd(sloRecvIfR.sls_dpt_cd());
						sloRecvIfR.ar_dpt_nm(sloRecvIfR.sls_dpt_nm());
					}
				}
			}
			else if(MAC_TRD_PTN_TYP.isSHIP(sloRecvIfR.trd_ptn_typ())) {
				sloRecvIfR.ar_dpt_cd(null);
				sloRecvIfR.ar_dpt_nm(null);
			}
		}
		
		/**
		 * インボイス取引対象外の場合、設定不要の項目をクリアする。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void clearIv(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!sloRecvIfR.cst_iv_flg()) {
					
					sloRecvIfR.trnspt_cd(null);
					sloRecvIfR.trnspt_nm(null);
					sloRecvIfR.vssl_flght(null);
					sloRecvIfR.load_port_cd(null);
					sloRecvIfR.load_port_nm(null);
					sloRecvIfR.etd_dt(null);
					sloRecvIfR.dschrg_port_cd(null);
					sloRecvIfR.eta_dt(null);
					sloRecvIfR.via_port_cd(null);
					sloRecvIfR.via_port_nm(null);
					sloRecvIfR.via_schd_dt(null);
					sloRecvIfR.iv_no(null);
					sloRecvIfR.iv_num_flg(false);
					sloRecvIfR.iv_upri(null);
					sloRecvIfR.cntry_org_cd(null);
					sloRecvIfR.cntry_org_nm(null);
				}
			}
		}
		
		/**
		 * 受注ファイルリストの明細項目の補完を行う。
		 */
		protected void complDtl() {
			
			getWtaxRateSub(getNotErrL());
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : getNotErrL()) {
				
				setItmNm(sloRecvIfR);
				
				setIvItmNm(sloRecvIfR);
				
				setCntryOrg(sloRecvIfR);
				
				setAmt(sloRecvIfR);
				
				setCostUpri(sloRecvIfR);
				
				setWtaxRate(sloRecvIfR);
				
				setBillCrryovrTimes(sloRecvIfR);
				
				setSloSno(sloRecvIfR);
				
				setDest(sloRecvIfR);
				
				setPriPrntFlg(sloRecvIfR);
				
				setShipSchdSplitTyp(sloRecvIfR);
				
				setAllocScopeTyp(sloRecvIfR);
				
				setAllocTyp(sloRecvIfR);
				
				setShipTermCd(sloRecvIfR);
				
				setShipBlockFlg(sloRecvIfR);
				
				setShipCntRmrks(sloRecvIfR);
				
				setLotNo(sloRecvIfR);
				
				setVerNo(sloRecvIfR);
				
				setDlvDayWeekTyp(sloRecvIfR);
				
				setStrLnCdNonFlg(sloRecvIfR);
				
				clearVmi(sloRecvIfR);
				
				setNotLotMixFlg(sloRecvIfR);
			}
		}
		
		/**
		 * 品名を設定する。
		 *  @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setItmNm(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (!sloRecvIfR.sundry_itm_flg()) {
				sloRecvIfR.itm_nm(sloRecvIfR.mst_itm_nm());
			}
		}
		
		/**
		 * Ｉ／Ｖ表記品名を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setIvItmNm(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (sloRecvIfR.cst_iv_flg()) {
				
				if (sloRecvIfR.sundry_itm_flg() && isNull(sloRecvIfR.iv_itm_nm())) {
					sloRecvIfR.iv_itm_nm(sloRecvIfR.itm_nm());
				}
			}
			else {
				sloRecvIfR.iv_itm_nm(null);
			}
		}
		
		/**
		 * 原産地を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setCntryOrg(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (sloRecvIfR.cst_iv_flg()) {
				
				if (isNull(sloRecvIfR.cntry_org_cd())) {
					sloRecvIfR.cntry_org_cd(sloRecvIfR.itm_cntry_org_cd());
					sloRecvIfR.cntry_org_nm(getCntryR(sloRecvIfR.itm_cntry_org_cd()).cntry_nm());
				}
			}
		}
		
		/**
		 * 金額を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setAmt(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (sloRecvIfR.vmi_flg()) {
				return;
			}
			
			MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(sloRecvIfR.trd_cur_upri(), sloRecvIfR.trd_unit_qty(),
					sloRecvIfR.tax_rate(), sloRecvIfR.inc_tax_flg(), sloRecvIfR.amt_dec_place(), 
					sloRecvIfR.sls_amt_rnd_typ(), sloRecvIfR.sls_tax_rnd_typ(),
					sloRecvIfR.trd_cur_dscnt_amt());
			
			sloRecvIfR.trd_cur_amt(amtR.getNumber("amt"));
			sloRecvIfR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
			sloRecvIfR.trd_cur_inc_tax_amt(amtR.getNumber("inc_tax_amt"));
			
			if (sloRecvIfR.cst_iv_flg()) {
				
				if (isSame(sloRecvIfR.iv_upri(), sloRecvIfR.trd_cur_upri())) {
					sloRecvIfR.iv_amt(sloRecvIfR.trd_cur_amt());
				}
				else {
					MCNumber ivAmt = getAmt(sloRecvIfR.iv_upri(),
							sloRecvIfR.trd_unit_qty(), sloRecvIfR.amt_dec_place(),
							sloRecvIfR.sls_amt_rnd_typ(), sloRecvIfR.trd_cur_dscnt_amt());
					sloRecvIfR.iv_amt(ivAmt);
				}
			}
		}
		
		/**
		 * 原価単価に関連する項目を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setCostUpri(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (isNull(sloRecvIfR.cost_upri())) {
				sloRecvIfR.cost_upri(MAUCL_StdUpriUtil.getStdCost(
						sloRecvIfR.itm_cd(), 
						sloRecvIfR.itm_sub1(), 
						sloRecvIfR.itm_sub2(), 
						sloRecvIfR.itm_sub3(), 
						sloRecvIfR.slo_dt(), 
						sloRecvIfR.wg_cd(), 
						getCo().gm_std_upri_typ()));
			}
		}
		
		/**
		 * 源泉税率を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setWtaxRate(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (sloRecvIfR.vmi_flg()) {
				return;
			}
			
			if (isSame(sloRecvIfR.trd_cur_cd(), getCo().base_cur_cd()) 
					&& (isSame(sloRecvIfR.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd()))) {
				if(isNull(sloRecvIfR.wtax_rate())) {
					// 取引通貨＝基準通貨＝納税通貨、または「取引通貨＝基準通貨かつ納税通貨が未設定の場合のみ設定する
					sloRecvIfR.wtax_rate(getWtaxRate(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(),
							sloRecvIfR.itm_sub3(), sloRecvIfR.slo_dt()));
				}
				if(!isNull(sloRecvIfR.wtax_rate())) {
					sloRecvIfR.wtax_amt(sloRecvIfR.trd_cur_amt().multiply(sloRecvIfR.wtax_rate()).divide(100,
							sloRecvIfR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().wtax_rnd_typ())));
				}
			}
			else {
				sloRecvIfR.wtax_rate(null);
			}
		}
		
		/**
		 * 請求繰越回数を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setBillCrryovrTimes(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (isNull(sloRecvIfR.bill_crryovr_times())) {
				sloRecvIfR.bill_crryovr_times(nvl(sloRecvIfR.itm_bill_crryovr_times(), sloRecvIfR.cst_bill_crryovr_times()));
			}
		}
		
		/**
		 * 仕向先を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setDest(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (isNull(sloRecvIfR.dest_cd1())) {
				sloRecvIfR.dest_cd2(null);
				sloRecvIfR.dest_nm2(null);
			}
			if (isNull(sloRecvIfR.dest_cd2())) {
				sloRecvIfR.dest_cd3(null);
				sloRecvIfR.dest_nm3(null);
			}
		}
		
		/**
		 * 手配ＮＯに関連する項目を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setSloSno(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
	
			if (MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno1_num_typ()) || isNull(sloRecvIfR.sno1_num_typ())) {
				sloRecvIfR.sno1(null);
			}
			if (MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno2_num_typ()) || isNull(sloRecvIfR.sno2_num_typ())) {
				sloRecvIfR.sno2(null);
			}
			if (MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno3_num_typ()) || isNull(sloRecvIfR.sno3_num_typ())) {
				sloRecvIfR.sno3(null);
			}
			if (MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno4_num_typ()) || isNull(sloRecvIfR.sno4_num_typ())) {
				sloRecvIfR.sno4(null);
			}
			
			setSnoNumFlg(sloRecvIfR);
		}
		
		/**
		 * 手配ＮＯ発番を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setSnoNumFlg(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (isSnoNum(sloRecvIfR.sno1_num_typ(), sloRecvIfR.sno1(), null, sloRecvIfR.slo_sno1_flg(), true) 
					|| isSnoNum(sloRecvIfR.sno2_num_typ(), sloRecvIfR.sno2(), null, sloRecvIfR.slo_sno2_flg(), true) 
					|| isSnoNum(sloRecvIfR.sno3_num_typ(), sloRecvIfR.sno3(), null, sloRecvIfR.slo_sno3_flg(), true) 
					|| isSnoNum(sloRecvIfR.sno4_num_typ(), sloRecvIfR.sno4(), null, sloRecvIfR.slo_sno4_flg(), true)) {
				sloRecvIfR.sno_num_flg(true);
			}
		}
		
		protected boolean isAuto(String snoNumTyp, String sno, String sloSno) {
			return MAC_SNO_NO_TYP.isAUTO(snoNumTyp) && isNullOrNullVal(sno) && isNullOrNullVal(sloSno);
		}
		protected boolean isAutoManu(String snoNumTyp, String sno, String sloSno) {
			return MAC_SNO_NO_TYP.isAUTO_MANU(snoNumTyp) && isNullOrNullVal(sno) && isNullOrNullVal(sloSno);
		}
		protected boolean isAutoManuNotSnoPrior(String snoNumTyp, String sno) {
			return MAC_SNO_NO_TYP.isAUTO_MANU(snoNumTyp) && isNullOrNullVal(sno);
		}
		protected boolean isSnoNum(String snoNumTyp, String sno, String sloSno, boolean sloSnoFlg, boolean snoNumFlg) {
			if(snoNumFlg) {
				return sloSnoFlg && (MAC_SNO_NO_TYP.isAUTO(snoNumTyp) || isAutoManuNotSnoPrior(snoNumTyp, sno));
			}
			else {
				return sloSnoFlg && (isAuto(snoNumTyp, sno, sloSno) || isAutoManu(snoNumTyp, sno, sloSno));
			}
		}
		
		/**
		 * 価格印字を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setPriPrntFlg(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (MAC_PRI_PRNT_TYP.isNOT_PRNT(sloRecvIfR.pri_prnt_typ())) {
				sloRecvIfR.pri_prnt_flg(false);
			}
			else if (MAC_PRI_PRNT_TYP.isPRNT(sloRecvIfR.pri_prnt_typ())) {
				sloRecvIfR.pri_prnt_flg(true);
			}
		}
		
		/**
		 * 出荷予定分割区分を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setShipSchdSplitTyp(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {

			if (MAC_STK_MNG_TYP.isNOT_MNG(sloRecvIfR.stk_mng_typ()) 
					|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| !isNull(sloRecvIfR.set_itm_grp_no())) {
				
				sloRecvIfR.ship_schd_split_typ(MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
			}
			else {
				
				if (isNull(sloRecvIfR.ship_schd_split_typ())) {
					sloRecvIfR.ship_schd_split_typ(nvl(sloRecvIfR.cst_ship_schd_split_typ(), getCo().ship_schd_split_typ()));
				}
			}
		}
		
		/**
		 * 引当範囲区分を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setAllocScopeTyp(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (MAC_STK_MNG_TYP.isNOT_MNG(sloRecvIfR.stk_mng_typ())
					|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
				sloRecvIfR.alloc_scope_typ(null);
			}
		}
		
		/**
		 * 引当区分を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setAllocTyp(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {

			if (MAC_SLO_PROC_TYP.isPROC(sloRecvIfR.proc_typ()) || MAC_SLO_PROC_TYP.isALLOC_PROC(sloRecvIfR.proc_typ())) {
				sloRecvIfR.alloc_typ(MAC_ALLOC_TYP.IMMED.value());
			}
			else if (MAC_STK_MNG_TYP.isNOT_MNG(sloRecvIfR.stk_mng_typ())
					|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())){
				sloRecvIfR.alloc_typ(null);
			}
		}
		
		/**
		 * 出荷条件ＣＤを設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 * @param sloDR 受注明細
		 */
		protected void setShipTermCd(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {

			if (isNull(sloRecvIfR.ship_term_cd())) {
				
				sloRecvIfR.ship_term_cd(sloRecvIfR.itm_ship_term_cd());
				MAM_SHIP_TERM_R ShipTermR = getShipTerm(sloRecvIfR.itm_ship_term_cd());
				sloRecvIfR.ship_term_nm(ShipTermR.ship_term_nm());
			}
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
				
				sloRecvIfR.ship_term_cd(null);
				sloRecvIfR.ship_term_nm(null);
			}
		}
		
		/**
		 * 出荷留めを設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setShipBlockFlg(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {

			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
				
				sloRecvIfR.ship_block_flg(false);
			}
		}
		
		/**
		 * 出荷連絡備考を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setShipCntRmrks(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {

			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
				
				sloRecvIfR.ship_cnt_rmrks(null);
			}
		}
		
		/**
		 * ロットNO、サブロットNOの補完を行う。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setLotNo(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {

			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| isNull(sloRecvIfR.proc_typ()) || MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(sloRecvIfR.alloc_scope_typ())) {
				
				sloRecvIfR.lot_no(null);
				sloRecvIfR.sublot_no(null);
			}
			
			if (!isNull(sloRecvIfR.lot_no()) 
					&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(sloRecvIfR.sublot_mng_typ()) 
					&& isNull(sloRecvIfR.sublot_no())) {
				
				sloRecvIfR.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
		
		/**
		 * 版NOを設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setVerNo(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {

			if (!sloRecvIfR.ver_flg()) {
				
				sloRecvIfR.ver_no(null);
			}
		}
		
		/**
		 * 着曜日を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setDlvDayWeekTyp(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
				
				sloRecvIfR.dlv_day_week_typ(null);
				sloRecvIfR.dlv_day_week_typ_nm(null);
			}
		}
		
		/**
		 * 棚・ライン無を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void setStrLnCdNonFlg(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (!isNullOrNullVal(sloRecvIfR.str_ln_cd())) {
				
				sloRecvIfR.str_ln_cd_none_flg(false);
			}
		}
		
		/**
		 * 貸出の場合、設定不要の項目をクリアする。
		 * @param sloRecvIfR 受注ファイルリスト
		 */
		protected void clearVmi(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (sloRecvIfR.vmi_flg()) {
				
				sloRecvIfR.trd_cur_upri(null);
				sloRecvIfR.interim_flg(false);
				sloRecvIfR.upri_not_tgt_flg(false);
				sloRecvIfR.trd_cur_dscnt_amt(null);
				sloRecvIfR.dscnt_rsn_cd(null);
				sloRecvIfR.dscnt_rsn_nm(null);
				sloRecvIfR.iv_upri(null);
				sloRecvIfR.cost_upri(null);
				sloRecvIfR.tax_fix_flg(false);
				sloRecvIfR.tax_cd(null);
				sloRecvIfR.tax_nm(null);
				sloRecvIfR.wtax_rate(null);
				sloRecvIfR.bill_crryovr_times(null);
				sloRecvIfR.sls_schd_dt(null);
				sloRecvIfR.pri_prnt_flg(false);
				sloRecvIfR.pri_prnt_typ(null);
				sloRecvIfR.sls_rsn_cd(null);
				sloRecvIfR.sls_rsn_nm(null);
				sloRecvIfR.bd_dpt_cd(null);
				sloRecvIfR.bd_dpt_nm(null);
				sloRecvIfR.sls_upri_req_typ(null);
			}
		}
		
		protected void setNotLotMixFlg(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (MAC_LOT_MNG_TYP.isNOT_MNG(sloRecvIfR.lot_mng_typ())) {
				sloRecvIfR.not_lot_mix_flg(false);
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(sloRecvIfR.sublot_mng_typ())) {
				sloRecvIfR.not_sublot_mix_flg(false);
			}
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!isNull(sloRecvIfR.qtn_no())) {
					
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$qtn_rev, new FXUCL_RequiredValidater()));
				}
				
				if (!isNull(sloRecvIfR.qtn_d_no())) {
					
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$qtn_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$qtn_rev, new FXUCL_RequiredValidater()));
				}
				
				msgL.addAll(check(sloRecvIfR, new String[] {Slo_BulkImp_Chk01_DtlR.$itm_cd, Slo_BulkImp_Chk01_DtlR.$cst_itm_cd}, new FXUCL_AtLeastOneValidater()));
				
				if (!isNull(sloRecvIfR.itm_cd())) {
					
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$itm_sub1, new FXUCL_RequiredValidater()));
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$itm_sub2, new FXUCL_RequiredValidater()));
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$itm_sub3, new FXUCL_RequiredValidater()));
				}
				
				if (MAC_TRD_PTN_TYP.isSLS(sloRecvIfR.trd_ptn_typ())) {
					
					if (sloRecvIfR.xrate_inpt_flg()) {
						msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$xrate, new FXUCL_RequiredValidater()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * チェック時に、使われる項目を先に補完する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void beforeChkCompl(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			initDptCache();
			initBpItmCache();
			
			setSlsUsr(sloRecvIfL);
			
			initUsrDptCache(sloRecvIfL);
			
			setCstItm(sloRecvIfL);
			
			setVmi(sloRecvIfL);
			
			setSlsCststk(sloRecvIfL);
			
			setSloTyp(sloRecvIfL);
			
			setProcTyp(sloRecvIfL);
			
			setSlsBasisTyp(sloRecvIfL);
			
			setSlsUpriReqTyp(sloRecvIfL);
			
			setShipRqstTm(sloRecvIfL);
			
			setTax(sloRecvIfL);
			
			setShipInstTyp(sloRecvIfL);
			
			clearIv(sloRecvIfL);
		}
		
		protected void setSlsUsr(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				if (isNull(sloRecvIfR.sls_usr_cd())) {
					sloRecvIfR.sls_usr_cd(sloRecvIfR.cst_sls_usr_cd());
					
					String usrNm = getUsrR(sloRecvIfR.cst_sls_usr_cd()).usr_nm();
					sloRecvIfR.sls_usr_nm(usrNm);
				}
			}
		}
		
		/**
		 * 取引先品目を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setCstItm(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if(isNull(sloRecvIfR.cst_itm_cd())) {
					
					MAM_BP_ITM_R bpItmR = getBpItmR(sloRecvIfR.slo_dt(), sloRecvIfR.cst_cd(),
							sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),
							sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3());

					if(!bpItmR.isEmpty()) {
						sloRecvIfR.cst_itm_cd(bpItmR.bp_itm_cd());
						sloRecvIfR.cst_itm_nm(bpItmR.bp_itm_nm());
					}
				}
				
				if (!isNull(sloRecvIfR.cst_itm_cd()) && isNull(sloRecvIfR.cst_itm_nm())) {
					MAM_BP_ITM_R bpItmR = getBpItmR(sloRecvIfR.slo_dt(), sloRecvIfR.cst_cd(),
							sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),
							sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3());

					if(isSame(sloRecvIfR.cst_itm_cd(), bpItmR.bp_itm_cd())) {
						sloRecvIfR.cst_itm_nm(bpItmR.bp_itm_nm());
					}
				}
			}
		}
		
		/**
		 * 貸出を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setVmi(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_TRD_PTN_TYP.isSHIP(sloRecvIfR.trd_ptn_typ())) {
					sloRecvIfR.vmi_flg(true);
				}
			}
		}
		
		/**
		 * 預り売上を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setSlsCststk(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) || sloRecvIfR.vmi_flg()) {
					
					sloRecvIfR.sls_cststk_flg(false);
				}
			}
		}
		
		/**
		 * 受注区分を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setSloTyp(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isNull(sloRecvIfR.slo_typ())) {
					
					sloRecvIfR.slo_typ(MSC_SLO_TYP.SLO.value());
				}
			}
		}
		
		/**
		 * 手配区分を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setProcTyp(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_STK_MNG_TYP.isMNG(sloRecvIfR.stk_mng_typ())) {
					// 在庫管理品
					if(sloRecvIfR.slo_proc_flg()){
						sloRecvIfR.proc_typ(nvl(sloRecvIfR.proc_typ(), sloRecvIfR.itm_proc_typ()));
					}
					
					if (!sloRecvIfR.slo_proc_flg()
							|| (sloRecvIfR.slo_proc_flg() && isNull(sloRecvIfR.proc_typ()))
							|| (sloRecvIfR.vmi_flg() && MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()))
							|| (sloRecvIfR.sls_cststk_flg() && MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()))) {
						
						if (sloRecvIfR.vmi_flg() && MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
							// ＩＦテーブルの貸出ＦＬＧがオン　かつ　品目マスタの手配区分が「仕入直送」の場合は、品目マスタの出荷指図区分を参照しない（後続の処理で「ピッキングあり」に補完される）
							sloRecvIfR.ship_inst_typ(null);
						}
						sloRecvIfR.proc_typ(MAC_SLO_PROC_TYP.ALLOC.value());
					}
				}
				else if (MAC_STK_MNG_TYP.isNOT_MNG(sloRecvIfR.stk_mng_typ())) {
					// 非在庫品
					sloRecvIfR.proc_typ(sloRecvIfR.itm_proc_typ());

					if (!sloRecvIfR.slo_proc_flg() || sloRecvIfR.vmi_flg()) {
						// 受注手配品ではない　または　貸出出荷の場合、手配区分をクリア
						sloRecvIfR.proc_typ(null);
					}
				}
			}
		}
		
		/**
		 * 売上計上区分を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setSlsBasisTyp(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {

			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_TRD_PTN_TYP.isSHIP(sloRecvIfR.trd_ptn_typ())) {
					sloRecvIfR.sls_basis_typ(null);
				}
				else {
					if (isNull(sloRecvIfR.sls_basis_typ())) {
						sloRecvIfR.sls_basis_typ(nvl(sloRecvIfR.cst_sls_basis_typ(), getCo().sls_basis_typ()));
					}
				}
			}
		}
		
		/**
		 * 販売単価取得区分を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setSlsUpriReqTyp(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isNull(sloRecvIfR.sls_upri_req_typ())) {
					sloRecvIfR.sls_upri_req_typ(nvl(sloRecvIfR.cst_sls_upri_req_typ(), getCo().sls_upri_req_typ()));
				}
			}
		}
		
		/**
		 * 出荷希望日時を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setShipRqstTm(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {

			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
						|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
					sloRecvIfR.ship_rqst_tm(null);
				}
			}
		}
		
		/**
		 * 税に関連する項目を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setTax(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			String taxCd = null;
			
			getSlsTax(sloRecvIfL);
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				taxCd = null;
				
				String mstTaxCd = getDefSlsTax(sloRecvIfR);
				
				if (sloRecvIfR.vmi_flg()) {
					continue;
				}
				
				taxCd = sloRecvIfR.tax_cd();
				if (isNull(sloRecvIfR.tax_cd())) {
					taxCd = mstTaxCd;
				}
				if (MAC_TAX_TYP.isTAX_ABL(sloRecvIfR.tax_typ())) {
					if (sloRecvIfR.inc_tax_flg() || !isSame(taxCd, mstTaxCd)) {
						// 内税、またはマスタと異なる場合に税指定とする
						sloRecvIfR.tax_fix_flg(true);
					}
				}
				sloRecvIfR.tax_cd(taxCd);
				
				if (isNull(sloRecvIfR.tax_nm())) {
					String taxNm = getTaxR(sloRecvIfR.tax_cd()).tax_nm();
					sloRecvIfR.tax_nm(taxNm);
				}
			}
		}
		
		/**
		 * 出荷指図区分を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setShipInstTyp(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
					sloRecvIfR.ship_inst_typ(MAC_SHIP_INST_TYP.NON.value());
				}
				if (isNull(sloRecvIfR.ship_inst_typ())) {
					sloRecvIfR.ship_inst_typ(nvl(sloRecvIfR.itm_ship_inst_typ(), MAC_SHIP_INST_TYP.PICK.value()));
				}
			}
		}
		
		/**
		 * 見積引継チェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkQtn(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!isNull(sloRecvIfR.qtn_d_no()) && !sloRecvIfR.qtn_no_copy_flg()) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0633, sloRecvIfR.qtn_no(), sloRecvIfR.qtn_rev(), sloRecvIfR.qtn_d_no(), toDispGUIIndex(sloRecvIfR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 売上部門に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSlsDpt(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			String slsDptCd = null;
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!isNull(sloRecvIfR.sls_dpt_cd())) {
					// 受注ファイルリストの売上部門を優先に設定する。
					slsDptCd = sloRecvIfR.sls_dpt_cd();
				}
				else {
					if (!isNull(sloRecvIfR.sls_usr_cd())) {
						// 売上担当者を元に、売上部門を取得し設定する。
						slsDptCd = getSlsDptBySlsUsr(sloRecvIfR);
					}
					else if (!isNull(sloRecvIfR.cst_sls_dpt_cd())) {
						// 得意先担当マスタの売上部門を設定する。
						slsDptCd = sloRecvIfR.cst_sls_dpt_cd();
					}
				}
				
				if (isNull(slsDptCd)) {
					if (!isNullAnd(sloRecvIfR.sls_usr_cd(), sloRecvIfR.cst_sls_usr_cd())) {	
						sloRecvIfR.hdr_err_flg(true);
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0606, nvl(sloRecvIfR.sls_usr_cd(), sloRecvIfR.cst_sls_usr_cd()), toYMDString(sloRecvIfR.slo_dt()), toDispGUIIndex(sloRecvIfR)));
					}
					else {
						sloRecvIfR.hdr_err_flg(true);
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0605, sloRecvIfR.cst_cd(), toYMDString(sloRecvIfR.slo_dt()), toDispGUIIndex(sloRecvIfR)));
					}
				}
				else {
					sloRecvIfR.sls_dpt_cd(slsDptCd);
					// 後続のチェック処理では、売上部門の関連項目を使用するため、補完する。
					setSlsDptItm(sloRecvIfL);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 売上部門に関連する項目を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setSlsDptItm(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!isNull(sloRecvIfR.sls_dpt_cd())) {
					
					MAM_DPT_R dtpR = getDptR(sloRecvIfR.slo_dt(), sloRecvIfR.sls_dpt_cd());
					
					if (!isNull(dtpR)) {
						
						sloRecvIfR.sls_dpt_nm(dtpR.dpt_nm());
						sloRecvIfR.wg_cd(dtpR.wg_cd());
						sloRecvIfR.wg_nm(dtpR.wg_nm());
						sloRecvIfR.bd_dpt_flg(dtpR.bd_dpt_flg());
					}
				}
			}
		}
		
		/**
		 * 品目に関連するチェックを行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkItm(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isNull(sloRecvIfR.itm_cd())) {
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0632, toYMDString(sloRecvIfR.slo_dt()), sloRecvIfR.cst_cd(), sloRecvIfR.cst_itm_cd(), toDispGUIIndex(sloRecvIfR)));
				}
				
				if (sloRecvIfR.sundry_itm_flg() && isNull(sloRecvIfR.itm_nm())) {
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0607, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), toDispGUIIndex(sloRecvIfR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 格付に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkGd(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isNull(sloRecvIfR.gd_cd()) && MAC_STK_MNG_TYP.isMNG(sloRecvIfR.stk_mng_typ())) {
					
					// 在庫管理品かつ格付ＣＤが未指定の場合、デフォルト格付ＣＤが取得できるかチェックする。
					
					try {
						if (isNull(getDefaultFeedStkGd().gd_cd())) {
							msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0608, toDispGUIIndex(sloRecvIfR)));
						}
						else {
							sloRecvIfR.gd_cd(getDefaultFeedStkGd().gd_cd());
							sloRecvIfR.gd_nm(getDefaultFeedStkGd().gd_nm());
						}
					}
					catch (Exception e) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0608, toDispGUIIndex(sloRecvIfR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 取引単位数量に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkQty(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				MCNumber decPlace = null;
				
				if (!isNull(sloRecvIfR.trd_unit_cd())) {
					decPlace = sloRecvIfR.trd_unit_dec_place();
				}
				else {
					decPlace = getItmUnit(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3(), sloRecvIfR.itm_trd_unit_cd()).dec_place();
					sloRecvIfR.trd_unit_cd(sloRecvIfR.itm_trd_unit_cd());
					
					MAM_UNIT_R unitR = getUnit(sloRecvIfR.itm_trd_unit_cd());
					sloRecvIfR.trd_unit_nm(unitR.unit_nm());
				}
				
				if (!isNull(decPlace) && sloRecvIfR.trd_unit_qty().scale() > decPlace.intValue()) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0609, sloRecvIfR.trd_unit_qty(), decPlace, toDispGUIIndex(sloRecvIfR)));
				}
				
				if (sloRecvIfR.dscnt_itm_flg()) {
					sloRecvIfR.trd_unit_qty(MCNumber.ONE);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 品目単位マスタを取得する。
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番1
		 * @param itmSub2 枝番2
		 * @param itmSub3 枝番3
		 * @param unitCd 品目単位ＣＤ
		 * @return 品目単位マスタ
		 */
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			if (_itmUnitCache == null) {
				_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")));
			}
			
			return _itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		}
		
		/**
		 * 単位マスタを取得する。
		 * @param unitCd 単位ＣＤ
		 * @return 単位マスタ
		 */
		protected MAM_UNIT_R getUnit(String unitCd) {
			if (_unitCache == null) {
				_unitCache = new FXUCL_MCDbcCache<MAM_UNIT_R>(MCQueryApiBuilder.create(MAM_UNIT_R.create("T")));
			}
			
			return _unitCache.get(unitCd);
		}
		
		/**
		 * 納品先に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDlv(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			setDlv(sloRecvIfL);
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (sloRecvIfR.dlv_sundry_flg() && isNull(sloRecvIfR.dlv_nm())) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0612, sloRecvIfR.dlv_cd(), toDispGUIIndex(sloRecvIfR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 納品先に関連する項目を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setDlv(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				if (!sloRecvIfR.dlv_sundry_flg()) {
					
					sloRecvIfR.dlv_nm(sloRecvIfR.mst_dlv_nm());
					sloRecvIfR.dlv_cntct_dpt(sloRecvIfR.mst_dlv_cntct_dpt());
					sloRecvIfR.dlv_cntct_psn(sloRecvIfR.mst_dlv_cntct_psn());
					sloRecvIfR.dlv_zip_cd(sloRecvIfR.mst_dlv_zip_cd());
					sloRecvIfR.dlv_addr1(sloRecvIfR.mst_dlv_addr1());
					sloRecvIfR.dlv_addr2(sloRecvIfR.mst_dlv_addr2());
					sloRecvIfR.dlv_addr3(sloRecvIfR.mst_dlv_addr3());
					sloRecvIfR.dlv_addr4(sloRecvIfR.mst_dlv_addr4());
					sloRecvIfR.dlv_tel(sloRecvIfR.mst_dlv_tel());
					sloRecvIfR.dlv_fax(sloRecvIfR.mst_dlv_fax());
					sloRecvIfR.dlv_lg_grp_cd(sloRecvIfR.mst_dlv_lg_grp_cd());
				}
				else {
					if (isNull(sloRecvIfR.dlv_lg_grp_cd())) {
						sloRecvIfR.dlv_lg_grp_cd(sloRecvIfR.mst_dlv_lg_grp_cd());
					}
				}
				if (!isNull(sloRecvIfR.dlv_lg_grp_cd())) {
					MAM_LG_GRP_R lgGrpR = getLgGrp(sloRecvIfR.dlv_lg_grp_cd());
					sloRecvIfR.dlv_lg_grp_nm(lgGrpR.lg_grp_nm());
				}
			}
		}
		
		/**
		 * 配送先に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTdlv(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			setTdlv(sloRecvIfL);
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (sloRecvIfR.tdlv_sundry_flg() && isNull(sloRecvIfR.tdlv_nm())) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0613, sloRecvIfR.tdlv_cd(), toDispGUIIndex(sloRecvIfR)));
				}
				
				if (sloRecvIfR.tdlv_req_flg() && isNull(sloRecvIfR.tdlv_cd())) {
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0618, sloRecvIfR.dlv_cd(), toDispGUIIndex(sloRecvIfR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷予定日、納品予定日のチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkShipDlvSchdDt(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
						|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
					
					sloRecvIfR.not_dt_calc_flg(false);
				}
				
				if (sloRecvIfR.not_dt_calc_flg()) {
					
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$ship_schd_dt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$dlv_schd_dt, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 売上予定日のチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSlsSchdDt(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!isNull(sloRecvIfR.sls_schd_dt())) {
					continue;
				}
				
				if (sloRecvIfR.sls_cststk_flg()) {
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sls_schd_dt, new FXUCL_RequiredValidater()));
					continue;
				}
				
				if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(sloRecvIfR.sls_upri_req_typ())) {
					
					if ((MAC_SLS_BASIS_TYP.isIN_BASIS(sloRecvIfR.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(sloRecvIfR.sls_basis_typ())) 
							&& !isNull(sloRecvIfR.dlv_rqst_tm())) {
						sloRecvIfR.sls_schd_dt(sloRecvIfR.dlv_rqst_tm().startTimeOfDay());
					}
					else {
						msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sls_schd_dt, new FXUCL_RequiredValidater()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 納入希望日のチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDlvRqstDt(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(sloRecvIfR.sls_upri_req_typ()) || MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
					
					if(isNull(sloRecvIfR.dlv_rqst_tm()) && isNull(sloRecvIfR.dlv_rqst_dt())) {
						
						msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$dlv_rqst_dt, new FXUCL_RequiredValidater()));
					}
				}
				else {
					if (MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
						sloRecvIfR.dlv_rqst_dt(null);
					}
				}
				
				if (MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
					sloRecvIfR.dlv_rqst_hm(null);
					sloRecvIfR.dlv_rqst_tm(getYmdHm(sloRecvIfR.dlv_rqst_dt(), sloRecvIfR.dlv_rqst_hm()));
				}
				
				if (!MAC_VIA_DLV_TYP.isVIA(sloRecvIfR.via_dlv_typ())) {
					
					if((!isNull(sloRecvIfR.dlv_rqst_tm()) && !isNull(sloRecvIfR.ship_rqst_tm())) || (!isNull(sloRecvIfR.dlv_rqst_dt()) && !isNull(sloRecvIfR.ship_rqst_dt()))) {
						
						msgL.addAll(check(sloRecvIfR, new String[]{Slo_BulkImp_Chk01_DtlR.$ship_rqst_dt, Slo_BulkImp_Chk01_DtlR.$dlv_rqst_dt},
								new FXUCL_TooManyInputsValidater()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 単価に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkUpri(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			setTrdCur(sloRecvIfL);
			
			setMstTrdCurUpri(sloRecvIfL);
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (sloRecvIfR.vmi_flg()) {
					continue;
				}
				
				if (sloRecvIfR.upri_not_tgt_flg()) {
					if (!sloRecvIfR.cst_sls_upri_cng_flg() && !sloRecvIfR.itm_sls_upri_cng_flg()) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0623, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), sloRecvIfR.cst_cd(), toDispGUIIndex(sloRecvIfR)));
					}
				}
				
				if (isNull(sloRecvIfR.trd_cur_upri())) {
					sloRecvIfR.trd_cur_upri(sloRecvIfR.mst_trd_cur_upri());
					sloRecvIfR.interim_flg(sloRecvIfR.mst_interim_flg());
				}
				
				if (isNull(sloRecvIfR.trd_cur_upri())) {
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
					continue;
				}
				
				if (sloRecvIfR.trd_cur_upri().scale() > sloRecvIfR.upri_dec_place().intValue()) {
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0610, sloRecvIfR.trd_cur_upri(), sloRecvIfR.upri_dec_place(), toDispGUIIndex(sloRecvIfR)));
				}
				//値の正負チェック
				if (sloRecvIfR.dscnt_itm_flg()) {
					//値引き品の場合、単価に絶対値をセットしなおす
					sloRecvIfR.trd_cur_upri(sloRecvIfR.trd_cur_upri().abs());
					if (!isNull(sloRecvIfR.trd_cur_amt())) {
						sloRecvIfR.trd_cur_amt(sloRecvIfR.trd_cur_amt().abs());
					}
					if (!isNull(sloRecvIfR.trd_cur_tax_amt())) {
						sloRecvIfR.trd_cur_tax_amt(sloRecvIfR.trd_cur_tax_amt().abs());
					}
				}
				else {
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$trd_cur_upri, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
				}
				
				// 単価チェック
				if (!sloRecvIfR.upri_not_tgt_flg()) {
					
					if (!isSame(sloRecvIfR.trd_cur_upri(), sloRecvIfR.mst_trd_cur_upri()) && sloRecvIfR.trd_unit_qty().isPositive()) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0611, sloRecvIfR.trd_cur_upri(), sloRecvIfR.mst_trd_cur_upri(), toDispGUIIndex(sloRecvIfR)));
					}
					
					if (!isSame(sloRecvIfR.interim_flg(), sloRecvIfR.mst_interim_flg())) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0619, sloRecvIfR.interim_flg(), sloRecvIfR.mst_interim_flg(), toDispGUIIndex(sloRecvIfR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 為替に関連する項目を設定する。
		 * @param sloRecvIfR 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkXrate(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {

			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_TRD_PTN_TYP.isSHIP(sloRecvIfR.trd_ptn_typ())) {
					sloRecvIfR.xrate_inpt_flg(false);
					sloRecvIfR.xrate(null);
					sloRecvIfR.ptax_xrate_inpt_flg(false);
					sloRecvIfR.ptax_xrate(null);
				}
				else {
					if (isSame(sloRecvIfR.trd_cur_cd(), getCo().base_cur_cd())) {
						sloRecvIfR.xrate_inpt_flg(false);
					}
					
					if (!sloRecvIfR.xrate_inpt_flg()) {
						sloRecvIfR.xrate(MAUCL_AmtUtil.getDefXrateNE(sloRecvIfR.trd_cur_cd(), getCo().base_cur_cd(), getCo().sls_xrate_cd(), sloRecvIfR.slo_dt()));
					}
					
					if(!isNull(getCo().ptax_cur_cd()) && !isSame(sloRecvIfR.trd_cur_cd(), getCo().ptax_cur_cd())) {
						
						if (sloRecvIfR.ptax_xrate_inpt_flg()) {
							msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$ptax_xrate, new FXUCL_RequiredValidater()));
						}
						else {
							sloRecvIfR.ptax_xrate(MAUCL_AmtUtil.getDefXrateNE(sloRecvIfR.trd_cur_cd(), getCo().ptax_cur_cd(), getCo().sls_xrate_cd(), sloRecvIfR.slo_dt()));
						}
					}
					else {
						sloRecvIfR.ptax_xrate_inpt_flg(false);
						sloRecvIfR.ptax_xrate(null);
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * インボイス単価に関連するチェックを行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkIvUpri(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (sloRecvIfR.vmi_flg()) {
					continue;
				}
				
				if (sloRecvIfR.cst_iv_flg())  {
					
					if (!isNull(sloRecvIfR.trd_cur_upri()) && !sloRecvIfR.trd_cur_upri().isZero()) {
						sloRecvIfR.iv_upri(sloRecvIfR.trd_cur_upri());
					}
					else {
						if(isNull(sloRecvIfR.iv_upri())) {
							if (isNull(sloRecvIfR.mst_trd_cur_upri())) {
								msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0620, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), toDispGUIIndex(sloRecvIfR)));
							}
							else {
								sloRecvIfR.iv_upri(sloRecvIfR.mst_trd_cur_upri());
							}
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 値引理由に関連するチェックを行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDscntRsn(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Slo_BulkImp_Chk01_DtlR> chkL = sloRecvIfL.subList(r -> !r.vmi_flg() && !isNull(r.trd_cur_dscnt_amt()) && isNull(r.dscnt_rsn_cd()));
			
			String defDscntRsnCd = null;
			
			if (!chkL.isEmpty()) {
				
				MAM_BIZ_RSN_R bizRsnR = getDefDscntRsnCd();
				
				if (!isNull(bizRsnR)) {
					defDscntRsnCd = bizRsnR.biz_rsn_cd();
				}
			}
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (sloRecvIfR.vmi_flg()) {
					continue;
				}
				
				if (!isNull(sloRecvIfR.trd_cur_dscnt_amt()) && isNull(sloRecvIfR.dscnt_rsn_cd())) {
					
					if (isNull(defDscntRsnCd)) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0614, toDispGUIIndex(sloRecvIfR)));
					}
					else {
						sloRecvIfR.dscnt_rsn_cd(defDscntRsnCd);
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 業務理由マスタからデフォルト値引理由を取得する。
		 * @return 業務理由マスタ
		 */
		protected MAM_BIZ_RSN_R getDefDscntRsnCd() {
			
			MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");

			MCList<MAM_BIZ_RSN_R> bizRsnL = MCList.create(MAM_BIZ_RSN_R.class);
			MCQueryApiBuilder bizRsnL_bldr = MCQueryApiBuilder.create(t);
			bizRsnL_bldr.setWhere(t.sls_dscnt_flg.eq(value(true)));
			bizRsnL_bldr.setOrderByAsc(t.sls_dscnt_sort_seq, t.biz_rsn_cd);
			
			dbSelect("MSBBL6020_MAM_BIZ_RSN_S02", bizRsnL, bizRsnL_bldr);
			
			if (!bizRsnL.isEmpty()) {
				return  bizRsnL.get(0);
			}
			
			return null;
		}
		
		/**
		 * 手配ＮＯに関連するチェックを行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSno(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				//手配NO１
				if (isNotEditSno(sloRecvIfR.sno1_mng_typ())) {
					if (!isNull(nullValToNull(sloRecvIfR.sno1()))) {
						msgL.add(new MCMessage(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno1,
								MSBBL0624, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()),
								sloRecvIfR.sno1(), toDispGUIIndex(sloRecvIfR)));
					}
				}
				if (isReqSno(sloRecvIfR.sno1_mng_typ(), sloRecvIfR.sno1_num_typ(), sloRecvIfR.slo_sno1_flg())) {
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno1, new FXUCL_RequiredValidater()));
				}
				if (isNotEditSnoNullFLg(sloRecvIfR.sno1_mng_typ())) {
					if (sloRecvIfR.sno1_null_flg()) {
						msgL.add(new MCMessage(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno1,
								MSBBL0628, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), toDispGUIIndex(sloRecvIfR)));
					}
				}
				//手配NO2
				if (isNotEditSno(sloRecvIfR.sno2_mng_typ())) {
					if (!isNull(nullValToNull(sloRecvIfR.sno2()))) {
						msgL.add(new MCMessage(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno2,
								MSBBL0625, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()),
								sloRecvIfR.sno2(), toDispGUIIndex(sloRecvIfR)));
					}
				}
				if (isReqSno(sloRecvIfR.sno2_mng_typ(), sloRecvIfR.sno2_num_typ(), sloRecvIfR.slo_sno2_flg())) {
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno2, new FXUCL_RequiredValidater()));
				}
				if (isNotEditSnoNullFLg(sloRecvIfR.sno2_mng_typ())) {
					if (sloRecvIfR.sno2_null_flg()) {
						msgL.add(new MCMessage(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno2,
								MSBBL0629, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), toDispGUIIndex(sloRecvIfR)));
					}
				}
				//手配NO3
				if (isNotEditSno(sloRecvIfR.sno3_mng_typ())) {
					if (!isNull(nullValToNull(sloRecvIfR.sno3()))) {
						msgL.add(new MCMessage(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno3,
								MSBBL0626, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()),
								sloRecvIfR.sno3(), toDispGUIIndex(sloRecvIfR)));
					}
				}
				if (isReqSno(sloRecvIfR.sno3_mng_typ(), sloRecvIfR.sno3_num_typ(), sloRecvIfR.slo_sno3_flg())) {
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno3, new FXUCL_RequiredValidater()));
				}
				if (isNotEditSnoNullFLg(sloRecvIfR.sno3_mng_typ())) {
					if (sloRecvIfR.sno3_null_flg()) {
						msgL.add(new MCMessage(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno3,
								MSBBL0630, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), toDispGUIIndex(sloRecvIfR)));
					}
				}
				//手配NO4
				if (isNotEditSno(sloRecvIfR.sno4_mng_typ())) {
					if (!isNull(nullValToNull(sloRecvIfR.sno4()))) {
						msgL.add(new MCMessage(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno4,
								MSBBL0627, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()),
								sloRecvIfR.sno4(), toDispGUIIndex(sloRecvIfR)));
					}
				}
				if (isReqSno(sloRecvIfR.sno4_mng_typ(), sloRecvIfR.sno4_num_typ(), sloRecvIfR.slo_sno4_flg())) {
					msgL.addAll(check(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno4, new FXUCL_RequiredValidater()));
				}
				if (isNotEditSnoNullFLg(sloRecvIfR.sno4_mng_typ())) {
					if (sloRecvIfR.sno4_null_flg()) {
						msgL.add(new MCMessage(sloRecvIfR, Slo_BulkImp_Chk01_DtlR.$sno4,
								MSBBL0631, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(),sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), toDispGUIIndex(sloRecvIfR)));
					}
				}
			}
			
			return msgL;
		}
		
		protected boolean isNotEditSno(String mngTyp) {
			// 管理しない
			if (MAC_SNO_MNG_TYP.isNOT_MNG(mngTyp)) {
				return true;
			}
			return false;
		}
		protected boolean isReqSno(String mngTyp, String numTyp, Boolean snoFlg) {
			// 管理する（必須）
			if (MAC_SNO_MNG_TYP.isMNG_REQ(mngTyp)) {
				// 手配ＮＯ発番区分（自動）
				// 手配ＮＯ発番区分（手動_未指定：自動）
				if (MAC_SNO_NO_TYP.isAUTO(numTyp) || MAC_SNO_NO_TYP.isAUTO_MANU(numTyp)) {
					return false;
				}
				else {
					return true;
				}
			}
			// 管理する（任意）/管理する（任意：在庫対象外）
			else if (MAC_SNO_MNG_TYP.isMNG_ARB(mngTyp) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(mngTyp)) {
				// 手配ＮＯ発番区分（自動）
				// 手配ＮＯ発番区分（手動_未指定：自動）
				if (MAC_SNO_NO_TYP.isAUTO(numTyp) || MAC_SNO_NO_TYP.isAUTO_MANU(numTyp)) {
					return false;
				}
				else {
					// 手配ＮＯ必須ＦＬＧ（オン）
					if (snoFlg) {
						return true;
					}
				}
			}
			return false;
		}
		protected boolean isNotEditSnoNullFLg(String mngTyp) {
			// 管理しない
			if (MAC_SNO_MNG_TYP.isNOT_MNG(mngTyp)) {
				return true;
			}
			// 管理する（必須）
			else if (MAC_SNO_MNG_TYP.isMNG_REQ(mngTyp)) {
				return true;
			}
			return false;
		}
		
		protected boolean isTrnst(MST_QTN_R qtn) {
			
			return !qtn.can_flg() && !qtn.failure_flg() && MSC_QTN_TYP.isQTN(qtn.qtn_typ()) 
					&& (!qtn.aprv_flg() || MAC_APRV_STS_TYP.isACPT(qtn.aprv_sts_typ()));
		}
		
		/**
		 * 売上理由に関連するチェックを行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSlsRsn(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Slo_BulkImp_Chk01_DtlR> chkL = sloRecvIfL.subList(r -> !r.vmi_flg());
			
			if (chkL.isEmpty()) return msgL;
			
			MCList<MAM_BIZ_RSN_R> slsRsnL = getDefSlsRsn();
			MCIndexKey idxkey = slsRsnL.createIndex(MAM_BIZ_RSN_R.$sls_acxfr_flg);
			MCIndexKey slsRsnCdIdxKey = slsRsnL.createIndex(MAM_BIZ_RSN_R.$biz_rsn_cd);
			
			boolean slsAcxfrFlg = false;
			MCList<MAM_BIZ_RSN_R> subSlsRsnL = null;
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
			
				slsAcxfrFlg = false;
				subSlsRsnL = null;
				
				if (sloRecvIfR.vmi_flg()) {
					continue;
				}
				
				if (isNull(sloRecvIfR.sls_rsn_cd())) {
			
					if (!isNull(sloRecvIfR.trd_cur_upri()) && sloRecvIfR.trd_cur_upri().isZero()) {
						
						if (MAC_ASSET_MNG_TYP.isMNG(sloRecvIfR.asset_mng_typ())) {
							// 資産管理する場合は、販売他勘定がオンの業務理由を取得する。
							slsAcxfrFlg = true;
						}
						else if (MAC_ASSET_MNG_TYP.isNOT_MNG(sloRecvIfR.asset_mng_typ())) {
							// 資産管理しない場合は、販売他勘定がオフの業務理由を取得する。
							slsAcxfrFlg = false;
						}
						
						subSlsRsnL = slsRsnL.subList(idxkey, slsAcxfrFlg);
						
						if (subSlsRsnL.isEmpty()) {
							
							if (slsAcxfrFlg) {
								msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0615, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), toDispGUIIndex(sloRecvIfR)));
							}
							else {
								msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0616, toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()), toDispGUIIndex(sloRecvIfR)));
							}
						}
						else {
							subSlsRsnL.sort(SortType.ASC, MAM_BIZ_RSN_R.$sls_sort_seq, MAM_BIZ_RSN_R.$biz_rsn_cd);
							sloRecvIfR.sls_rsn_cd(subSlsRsnL.get(0).biz_rsn_cd());
							sloRecvIfR.sls_rsn_nm(subSlsRsnL.get(0).biz_rsn_nm());
							sloRecvIfR.sls_acxfr_flg(slsAcxfrFlg);
						}
					}
				}
				else {
					
					if (!isNull(sloRecvIfR.trd_cur_upri()) && !sloRecvIfR.trd_cur_upri().isZero()) {
						
						MAM_BIZ_RSN_R subSlsRsnR = slsRsnL.getFirst(slsRsnCdIdxKey, sloRecvIfR.sls_rsn_cd());
						
						if (subSlsRsnR.sls_acxfr_flg()) {
							msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0703, sloRecvIfR.trd_cur_upri(), sloRecvIfR.sls_rsn_cd(), toDispGUIIndex(sloRecvIfR)));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 業務理由マスタからデフォルト売上理由を取得する。
		 * @return 業務理由マスタリスト
		 */
		protected MCList<MAM_BIZ_RSN_R> getDefSlsRsn() {
			
			MCList<MAM_BIZ_RSN_R> bizRsnL = MCList.create(MAM_BIZ_RSN_R.class);
			MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
			MCQueryApiBuilder bizRsnL_bldr = MCQueryApiBuilder.create(t);
			bizRsnL_bldr.setWhere(t.sls_flg.eq(value(true)));
			
			dbSelect("MSBBL6020_MAM_BIZ_RSN_S01", bizRsnL, bizRsnL_bldr);
			
			return bizRsnL;
		}
		
		/**
		 * 販売他勘定の場合、負担部門に関連するチェックを行う。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkBdDpt(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (sloRecvIfR.vmi_flg() || !isNull(sloRecvIfR.bd_dpt_cd())) {
					continue;
				}
				
				if (sloRecvIfR.sls_acxfr_flg()) {
					
					if (!sloRecvIfR.bd_dpt_flg()) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0617,
								toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()),
								sloRecvIfR.sls_dpt_cd(), toDispGUIIndex(sloRecvIfR)));
					}
					else {
						sloRecvIfR.bd_dpt_cd(sloRecvIfR.sls_dpt_cd());
						sloRecvIfR.bd_dpt_nm(sloRecvIfR.sls_dpt_nm());
					}
				}
				else {
					sloRecvIfR.bd_dpt_cd(null);
					sloRecvIfR.bd_dpt_nm(null);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 受注引当マスタを取得する。
		 */
		protected void getSloAlloc() {
			
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			_sloAllocL = MCList.create(MAM_SLO_ALLOC_R.class);
			MAM_SLO_ALLOC_R t = MAM_SLO_ALLOC_R.create("T");
			MCQueryApiBuilder sloAllocL_bldr = MCQueryApiBuilder.create(t);
			sloAllocL_bldr.addSelect(m1.wg_cd.as("loc_wg_cd"));
			sloAllocL_bldr.addSelect(m1.lg_grp_cd.as("loc_lg_grp_cd"));
			sloAllocL_bldr.addLeftOuterJoin(m1, nvl( t.loc_cd, t.ship_loc_cd).eq(m1.loc_cd));
			dbSelectColumn("MSBBL6020_MAM_SLO_ALLOC_S01", _sloAllocL, sloAllocL_bldr, MAM_SLO_ALLOC_R.$wg_cd, getNotErrL(), Slo_BulkImp_Chk01_DtlR.$wg_cd);
		}
		
		/**
		 * 引数で指定された受注ファイルリストに紐付く受注引当マスタを返す。
		 * @param sloRecvIfR 受注ファイルリスト
		 * @return 受注引当マスタ
		 */
		protected MAM_SLO_ALLOC_R getSloAlloc(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			if (isNull(_sloAllocL)) {
				
				getSloAlloc();
			}
			
			if (_sloAllocIdxkey == null) {
				_sloAllocIdxkey = _sloAllocL.createIndex(
						MAM_SLO_ALLOC_R.$to_lg_grp_cd, 
						MAM_SLO_ALLOC_R.$itm_ship_grp_cd,
						MAM_SLO_ALLOC_R.$wg_cd,
						MAM_SLO_ALLOC_R.$def_flg);
			}
			
			String toLgGrpCd = sloRecvIfR.dlv_lg_grp_cd();
			
			Comparable<?>[] vals = new Comparable[]{toLgGrpCd, sloRecvIfR.itm_ship_grp_cd(), sloRecvIfR.wg_cd(), true};
			
			MCList<MAM_SLO_ALLOC_R> subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = MAC_STR.NULL_VAL.value();
				vals[1] = sloRecvIfR.itm_ship_grp_cd();
				subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			}
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = toLgGrpCd;
				vals[1] = MAC_STR.NULL_VAL.value();
				subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			}
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = MAC_STR.NULL_VAL.value();
				vals[1] = MAC_STR.NULL_VAL.value();
				subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			}
			
			if (!subsloAllocL.isEmpty()) {
				
				return subsloAllocL.get(0);
			}
			
			return null;
		}
		
		/**
		 * 手配依頼に関する項目をチェックする。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkProc(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_SLO_PROC_TYP.isALLOC(sloRecvIfR.proc_typ()) || isNull(sloRecvIfR.proc_typ())) {
					sloRecvIfR.sppl_cd(null);
					sloRecvIfR.sppl_nm(null);
					sloRecvIfR.maker_cd(null);
					sloRecvIfR.maker_nm(null);
				}
				
				if (MAC_SLO_PROC_TYP.isALLOC(sloRecvIfR.proc_typ())
						|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())
						|| isNull(sloRecvIfR.proc_typ())) {
					sloRecvIfR.rqst_to_loc_cd(null);
					sloRecvIfR.rqst_to_loc_nm(null);
				}
				
				if (MAC_SLO_PROC_TYP.isALLOC(sloRecvIfR.proc_typ()) || isNull(sloRecvIfR.proc_typ())) {
					sloRecvIfR.wg_rqst_cnt_rmrks(null);
				}
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
						|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
					
					sloRecvIfR.alloc_grp_cd(null);
					sloRecvIfR.alloc_grp_nm(null);
					sloRecvIfR.ship_lg_grp_cd(null);
					sloRecvIfR.ship_lg_grp_nm(null);
				}
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
						|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())
						|| MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(sloRecvIfR.alloc_scope_typ())) {
					
					sloRecvIfR.loc_cd(null);
					sloRecvIfR.loc_nm(null);
				}
				
				if (!MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())
						&& MAC_STK_MNG_TYP.isMNG(sloRecvIfR.stk_mng_typ())) {
					
					if (MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
						
						msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0635, toDispGUIIndex(sloRecvIfR)));
					}
				}
				
				if (!isNull(sloRecvIfR.rqst_to_loc_cd()) && !isNull(sloRecvIfR.sppl_cd())) {
					msgL.add(new MCMessage(sloRecvIfR, null, MSBBL0622, sloRecvIfR.rqst_to_loc_cd(), sloRecvIfR.sppl_cd(), toDispGUIIndex(sloRecvIfR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 配送先に関連する項目を設定する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setTdlv(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isNull(sloRecvIfR.tdlv_cd())) {
					
					if (sloRecvIfR.tdlv_req_flg()) {
						
						MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
						MAM_BP_R m1 = MAM_BP_R.create("M1");
							
							MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create();
							MCQueryApiBuilder lgCtlR_bldr = MCQueryApiBuilder.create(t);
							lgCtlR_bldr.setSelect(t.def_tdlv_cd);
							lgCtlR_bldr.addSelect(m1.bp_nm);
							lgCtlR_bldr.addSelect(m1.via_dlv_typ);
							lgCtlR_bldr.addSelect(m1.lg_grp_cd);
							lgCtlR_bldr.addSelect(m1.cntry_cd);
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())).as("cntct_dpt"));
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())).as("cntct_psn"));
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
							lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("slo_dt"), value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
							lgCtlR_bldr.addInnerJoin(m1, t.def_tdlv_cd.eq(m1.bp_cd));
							
							MAM_LG_CTL_R bindR = MAM_LG_CTL_R.create();
							bindR.fr_lg_grp_cd(getFrLgGrpCd(sloRecvIfR));
							bindR.to_lg_grp_cd(sloRecvIfR.dlv_lg_grp_cd());
							bindR.ship_term_cd(MAC_STR.NULL_VAL.value());
							bindR.addDateColumn("slo_dt", sloRecvIfR.slo_dt());
							
							dbSelectKey("MSBBL6020_MAM_LG_CTL_S01", lgCtlR, lgCtlR_bldr, bindR);
							
						if (!lgCtlR.isEmpty()) {
							
							sloRecvIfR.tdlv_cd(lgCtlR.def_tdlv_cd());
							sloRecvIfR.tdlv_nm(lgCtlR.getStringNE("bp_nm"));
							sloRecvIfR.via_dlv_typ(lgCtlR.getStringNE("via_dlv_typ"));
							sloRecvIfR.tdlv_cntct_dpt(lgCtlR.getStringNE("cntct_dpt"));
							sloRecvIfR.tdlv_cntct_psn(lgCtlR.getStringNE("cntct_psn"));
							sloRecvIfR.tdlv_zip_cd(lgCtlR.getStringNE("zip_cd"));
							sloRecvIfR.tdlv_addr1(lgCtlR.getStringNE("addr1"));
							sloRecvIfR.tdlv_addr2(lgCtlR.getStringNE("addr2"));
							sloRecvIfR.tdlv_addr3(lgCtlR.getStringNE("addr3"));
							sloRecvIfR.tdlv_addr4(lgCtlR.getStringNE("addr4"));
							sloRecvIfR.tdlv_tel(lgCtlR.getStringNE("tel"));
							sloRecvIfR.tdlv_fax(lgCtlR.getStringNE("fax"));
							sloRecvIfR.tdlv_lg_grp_cd(lgCtlR.getStringNE("lg_grp_cd"));
							sloRecvIfR.tdlv_cntry_cd(lgCtlR.getStringNE("cntry_cd"));
						}
					}
				}
				else {
					
					if (!sloRecvIfR.tdlv_sundry_flg()) {
						
						sloRecvIfR.tdlv_nm(sloRecvIfR.mst_tdlv_nm());
						sloRecvIfR.tdlv_cntct_dpt(sloRecvIfR.mst_tdlv_cntct_dpt());
						sloRecvIfR.tdlv_cntct_psn(sloRecvIfR.mst_tdlv_cntct_psn());
						sloRecvIfR.tdlv_zip_cd(sloRecvIfR.mst_tdlv_zip_cd());
						sloRecvIfR.tdlv_addr1(sloRecvIfR.mst_tdlv_addr1());
						sloRecvIfR.tdlv_addr2(sloRecvIfR.mst_tdlv_addr2());
						sloRecvIfR.tdlv_addr3(sloRecvIfR.mst_tdlv_addr3());
						sloRecvIfR.tdlv_addr4(sloRecvIfR.mst_tdlv_addr4());
						sloRecvIfR.tdlv_tel(sloRecvIfR.mst_tdlv_tel());
						sloRecvIfR.tdlv_fax(sloRecvIfR.mst_tdlv_fax());
						sloRecvIfR.tdlv_lg_grp_cd(sloRecvIfR.mst_tdlv_lg_grp_cd());
					}
					if (isNull(sloRecvIfR.tdlv_lg_grp_cd())) {
						sloRecvIfR.tdlv_lg_grp_cd(sloRecvIfR.mst_tdlv_lg_grp_cd());
					}
				}
				if (!isNull(sloRecvIfR.tdlv_lg_grp_cd())) {
					MAM_LG_GRP_R lgGrpR = getLgGrp(sloRecvIfR.tdlv_lg_grp_cd());
					sloRecvIfR.tdlv_lg_grp_nm(lgGrpR.lg_grp_nm());
				}
				if (!isNull(sloRecvIfR.tdlv_cntry_cd())) {
					MAM_CNTRY_R cntryR = getCntryR(sloRecvIfR.tdlv_cntry_cd());
					sloRecvIfR.tdlv_cntry_nm(cntryR.cntry_nm());
				}
				
				if (isNull(sloRecvIfR.tdlv_cd()) || !sloRecvIfR.cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
					sloRecvIfR.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
				}
				else {
					if (isNull(sloRecvIfR.via_dlv_typ())) {
						sloRecvIfR.via_dlv_typ(sloRecvIfR.mst_via_dlv_typ());
					}
				}
			}
		}
		
		/**
		 * 出荷元物流グループを取得する。
		 * @param sloRecvIfR 受注ファイルリスト
		 * @return 出荷元物流グループ
		 */
		protected String getFrLgGrpCd(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			String frLgGrpCd = null;
			
			if (!isNull(sloRecvIfR.ship_lg_grp_cd())) {
				frLgGrpCd = sloRecvIfR.ship_lg_grp_cd();
			}
			else {
				MAM_SLO_ALLOC_R sloAllocR = getSloAlloc(sloRecvIfR);
				if (!isNull(sloAllocR)) {
					frLgGrpCd = nvl(sloAllocR.lg_grp_cd(), sloAllocR.getString("loc_lg_grp_cd"));
				}
			}
			return frLgGrpCd;
		}
		
		/**
		 * 見積明細を取得する。
		 * @return 見積明細
		 */
		protected void initQtnDCache(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			_cacheQtnDList = MCList.create(MST_QTN_D_R.class);
			
			MST_QTN_D_R qtnD_t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder qtnDR_bldr = MCQueryApiBuilder.create(qtnD_t);
			
			qtnDR_bldr.setWhere(qtnD_t.qtn_no.eq(bind("qtn_no")));
			qtnDR_bldr.addWhereWithAnd(qtnD_t.qtn_rev.eq(bind("qtn_rev")));
			qtnDR_bldr.addWhereWithAnd(qtnD_t.trd_unit_qty.gt(qtnD_t.slo_trnst_qty.add(qtnD_t.sls_trnst_qty)));
			dbSelect("MSBBL6020_MST_QTN_D_S05", _cacheQtnDList, qtnDR_bldr, sloRecvIfL);
			_qtnDIdKey = _cacheQtnDList.createIndex(MST_QTN_D_R.$qtn_d_no);
		}
		
		protected MST_QTN_D_R getQtnDCache(String qtnDNo) {
			return _cacheQtnDList.getFirst(_qtnDIdKey, qtnDNo);
		}
		
		/**
		 * 担当者マスタを取得する。
		 * @return 担当者マスタ
		 */
		protected MAM_USR_R getUsrR(String usrCd){
			
			if (_usrCache == null) {
				_usrCache = new FXUCL_MCDbcCache<MAM_USR_R>(MCQueryApiBuilder.create(MAM_USR_R.create("T")));
			}
			
			return _usrCache.get(usrCd);
		}
		
		/**
		 * 部門マスタを取得する。
		 * @return 部門マスタ
		 */
		protected MAM_DPT_R getDptR(MCDate baseDt, String dptCd) {
			return _dptCache.get(baseDt, dptCd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> initDptCache() {
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			if (_dptCache == null){
				MAM_DPT_R t = MAM_DPT_R.create("T");
				MAM_WG_R t2 = MAM_WG_R.create("T2");
				MCQueryApiBuilder dptL_bldr = MCQueryApiBuilder.create(t);
				
				dptL_bldr.setSelect(t.dpt_nm, t.wg_cd, t.bd_dpt_flg, t2.wg_nm);
				dptL_bldr.addLeftOuterJoin(t2, bracket(t2.wg_cd.eq(t.wg_cd)));
				_dptCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dptL_bldr, bindL, MAM_DPT_R.$dpt_cd);
			}
			return _dptCache;
		}
		
		/**
		 * 取引先品目マスタを取得する。
		 * @return 取引先品目マスタ
		 */
		protected MAM_BP_ITM_R getBpItmR(MCDate baseDt, String bpCd, String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _bpItmCache.get(baseDt, bpCd, itmCd, itmSub1, itmSub2, itmSub3);
		}
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> initBpItmCache() {
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			if (_bpItmCache == null){
				MAM_BP_ITM_R t = MAM_BP_ITM_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
				
				builder.setSelect(t.bp_cd);
				builder.addSelect(t.itm_cd);
				builder.addSelect(t.itm_sub1);
				builder.addSelect(t.itm_sub2);
				builder.addSelect(t.itm_sub3);
				builder.addSelect(t.bp_itm_cd);
				builder.addSelect(t.bp_itm_nm);
				builder.addWhereWithAnd(t.bp_cd.eq(bind("bp_cd")));
				builder.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
				builder.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				builder.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				builder.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				_bpItmCache = new FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R>(builder, bindL, MAM_BP_ITM_R.$bp_cd, MAM_BP_ITM_R.$itm_cd, MAM_BP_ITM_R.$itm_sub1, MAM_BP_ITM_R.$itm_sub2, MAM_BP_ITM_R.$itm_sub3);
			}
			return _bpItmCache;
		}
		
		protected MCList<MAVM_USR_DPT_R> getUsrDptL(String usrCd) {
			if (!isNull(_usrDptCache)) {
				return _usrDptCache.subList(_usrDptIdx, usrCd);
			}
			else {
				return null;
			}
		}
		protected void initUsrDptCache(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			MAVM_USR_DPT_R usrDptT = MAVM_USR_DPT_R.create("usrDptT");
			MAM_DPT_R dptM = MAM_DPT_R.create("dptM");
			
			MCList<MAVM_USR_DPT_R> usrDptL = MCList.create(MAVM_USR_DPT_R.class);
			usrDptL.addDateColumn("dpt_st_dt");
			usrDptL.addDateColumn("dpt_end_dt");
			MCQueryApiBuilder usrDptLBldr = MCQueryApiBuilder.create(usrDptT);
			
			usrDptLBldr.setSelect(usrDptT.usr_cd, usrDptT.dpt_cd, usrDptT.main_flg, usrDptT.st_dt, usrDptT.end_dt,
					dptM.st_dt.as("dpt_st_dt"), dptM.end_dt.as("dpt_end_dt"));
			
			usrDptLBldr.addInnerJoin(dptM, usrDptT.dpt_cd.eq(dptM.dpt_cd).and(dptM.sls_dpt_flg.eq(value(true))));
			usrDptLBldr.setWhere(usrDptT.usr_cd.eq(bind(Slo_BulkImp_Chk01_DtlR.$sls_usr_cd)));
			usrDptLBldr.addWhereWithAnd(usrDptT.st_dt.lte(bind(Slo_BulkImp_Chk01_DtlR.$slo_dt)));
			usrDptLBldr.addWhereWithAnd(usrDptT.end_dt.gte(bind(Slo_BulkImp_Chk01_DtlR.$slo_dt)));
			usrDptLBldr.addWhereWithAnd(dptM.st_dt.lte(bind(Slo_BulkImp_Chk01_DtlR.$slo_dt)));
			usrDptLBldr.addWhereWithAnd(dptM.end_dt.gte(bind(Slo_BulkImp_Chk01_DtlR.$slo_dt)));
			dbSelect("MSBBL6020_MAVM_USR_DPT_S01", usrDptL, usrDptLBldr, sloRecvIfL);
			if (!isNull(usrDptL)) {
				_usrDptCache = usrDptL;
				_usrDptIdx = _usrDptCache.createIndex(MAVM_USR_DPT_R.$usr_cd);
			}
		}
		
		/**
		 * 税マスタを取得する。
		 * @return 税マスタ
		 */
		protected MAM_TAX_R getTaxR(String taxCd){
			
			if (_taxCache == null) {
				_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(MCQueryApiBuilder.create(MAM_TAX_R.create("T")));
			}
			
			return _taxCache.get(taxCd);
		}
		
		/**
		 * 出荷条件マスタを取得する。
		 * @return 出荷条件マスタ
		 */
		protected MAM_SHIP_TERM_R getShipTerm(String shipTermCd) {
			
			if (_shipTermCache == null) {
				_shipTermCache = new FXUCL_MCDbcCache<MAM_SHIP_TERM_R>(MCQueryApiBuilder.create(MAM_SHIP_TERM_R.create("T")));
			}
			
			return _shipTermCache.get(shipTermCd);
		}
		
		/**
		 * 源泉税率を取得する。
		 * @param itmCd　品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @param sloDt 受注日
		 * @return 源泉税率
		 */
		protected MCNumber getWtaxRate(String itmCd, String itmSub1, String itmSub2, String itmSub3, MCDate sloDt){
			
			MCNumber wtaxRate = null;
			
			MCRow wtaxRateR = _wtaxRate.getFirst(_wtaxRateIdx, itmCd, itmSub1, itmSub2, itmSub3, sloDt);
			if (!isNull(wtaxRateR)) {
				wtaxRate = wtaxRateR.getNumber("wtaxRate");
			}
			
			return wtaxRate;
		}
		protected void getWtaxRateSub(MCList<?> wtaxL) {
			String[] key = new String[]{
					"itm_cd",
					"itm_sub1",
					"itm_sub2",
					"itm_sub3",
					"slo_dt"};
			if (isNull(_wtaxRate)) {
				_wtaxRate = MCList.create(MCRow.class);
			}
			MCList<?> grpL = wtaxL.groupBy(key);
			grpL.addNumberColumn("wtaxRate");
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE"),
					"wtaxRate", grpL, key);
			_wtaxRate.addAll(grpL);
			_wtaxRateIdx = _wtaxRate.createIndex(key);
		}
		
		/**
		 * 国マスタを取得する。
		 * @return 国マスタ
		 */
		protected MAM_CNTRY_R getCntryR(String cntryCd){
			
			if (_cntryCache == null) {
				_cntryCache = new FXUCL_MCDbcCache<MAM_CNTRY_R>(MCQueryApiBuilder.create(MAM_CNTRY_R.create("T")));
			}
			
			return _cntryCache.get(cntryCd);
		}
		
		/**
		 * 取引通貨に関連する項目を補完する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setTrdCur(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			for (Slo_BulkImp_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (MAC_TRD_PTN_TYP.isSHIP(sloRecvIfR.trd_ptn_typ())) {
					sloRecvIfR.trd_cur_cd(null);
					sloRecvIfR.trd_cur_nm(null);
					sloRecvIfR.upri_dec_place(null);
					sloRecvIfR.amt_dec_place(null);
				}
				else {
					if (isNull(sloRecvIfR.trd_cur_cd())) {
						
						sloRecvIfR.trd_cur_cd(sloRecvIfR.cst_trd_cur_cd());
						sloRecvIfR.upri_dec_place(sloRecvIfR.cst_upri_dec_place());
						sloRecvIfR.amt_dec_place(sloRecvIfR.cst_amt_dec_place());
						
						String curNm = getCur(sloRecvIfR.cst_trd_cur_cd()).cur_nm();
						sloRecvIfR.trd_cur_nm(curNm);
					}
				}
			}
		}
		
		/**
		 * マスタから取引通貨単価を算出する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void setMstTrdCurUpri(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MABSL_SlsUpriService.SlsUpri_Sprt01 ope = MABSL_SlsUpriService.crtSlsUpri_Sprt01();
			
			setGrpNo(sloRecvIfL);
			setAll(ope.up0(), sloRecvIfL.subList(r -> 
							 !r.vmi_flg()
							 && !r.upri_not_tgt_flg()
							 && !isNull(r.wg_cd()) 
							 && !isNull(r.trd_unit_cd()) 
							 && !isNull(r.trd_cur_cd())), createMap_SlsUpri_Sprt01_DtlR_Slo_BulkImp_Chk01_DtlR());
			if (ope.up0().isEmpty()) {
				return;
			}
			ope.exec();
			
			copyByPegNo(up0(), new String[] {
					Slo_BulkImp_Chk01_DtlR.$mst_trd_cur_upri, Slo_BulkImp_Chk01_DtlR.$mst_interim_flg}, 
					ope.down0(), 
					new String[] {SlsUpri_Sprt01_DtlR.$sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg});
		}
		
		/**
		 * 単価取得用のgrp_noを設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setGrpNo(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			sloRecvIfL.addStringColumn("grp_no");
			int grpNo = 0;
			for (MCList<Slo_BulkImp_Chk01_DtlR> grpL : sloRecvIfL.groupList(getGrpKey())) {
				grpL.setStringNE("grp_no", Integer.toString(grpNo++));
			}
		}
		
		/**
		 * 品目と得意先を元に税ＣＤを算出する。
		 * @param sloRecvIfR 受注ファイルリスト
		 * @return 税ＣＤ
		 */
		protected String getDefSlsTax(Slo_BulkImp_Chk01_DtlR sloRecvIfR){
			
			String taxCd = null;
			
			Slo_BulkImp_Chk01_DtlR slsTaxR = _slsTax.getFirst(_slsTaxIdx, sloRecvIfR.toArray(_slsTaxIdx.getKeys()));
			if (!isNull(slsTaxR)) {
				taxCd = slsTaxR.tax_cd();
			}
			
			return taxCd;
		}
		protected void getSlsTax(MCList<Slo_BulkImp_Chk01_DtlR> taxL) {
			String[] key = new String[]{
					Slo_BulkImp_Chk01_DtlR.$itm_cd,
					Slo_BulkImp_Chk01_DtlR.$itm_sub1,
					Slo_BulkImp_Chk01_DtlR.$itm_sub2,
					Slo_BulkImp_Chk01_DtlR.$itm_sub3,
					Slo_BulkImp_Chk01_DtlR.$cst_cd,
					"baseDt"};

			taxL.addDateColumn("baseDt");
			for (Slo_BulkImp_Chk01_DtlR taxR : taxL) {
				taxR.setDate("baseDt", getBaseDt(taxR));
			}

			_slsTax = MCList.create(Slo_BulkImp_Chk01_DtlR.class);
			MCList<Slo_BulkImp_Chk01_DtlR> grpL = taxL.groupBy(key);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_SLS_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_SLS_TAX_CD"),
					Slo_BulkImp_Chk01_DtlR.$tax_cd, grpL, key);
			_slsTax.addAll(grpL);
			_slsTaxIdx = _slsTax.createIndex(key);
		}

		protected MCDate getBaseDt(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			MCDate baseDt = null;
			
			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(sloRecvIfR.sls_basis_typ())) {
				baseDt = nvl(sloRecvIfR.sls_schd_dt(), nvl(sloRecvIfR.ship_rqst_tm(), sloRecvIfR.slo_dt()));
			}
			else if(MAC_SLS_BASIS_TYP.isIN_BASIS(sloRecvIfR.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(sloRecvIfR.sls_basis_typ())) {
				baseDt = nvl(sloRecvIfR.sls_schd_dt(), nvl(sloRecvIfR.dlv_rqst_tm(), sloRecvIfR.slo_dt()));
			}
			return baseDt;
		}
		
		/**
		 * 売上担当者で売上部門を取得する。
		 * @param sloRecvIfR　取込対象行
		 * @return 売上部門ＣＤ
		 */
		protected String getSlsDptBySlsUsr(Slo_BulkImp_Chk01_DtlR sloRecvIfR) {
			
			String slsDptCd = null;
			
			MCList<MAVM_USR_DPT_R> usrDptAllL = getUsrDptL(sloRecvIfR.sls_usr_cd());
			if (isNull(usrDptAllL)) {
				return null;
			}
			MCList<MAVM_USR_DPT_R> usrDptL = MCList.create(MAVM_USR_DPT_R.class);
			for (MAVM_USR_DPT_R usrDptR : usrDptAllL) {
				if (usrDptR.st_dt().lte(sloRecvIfR.slo_dt()) && sloRecvIfR.slo_dt().lte(usrDptR.end_dt())
						&& usrDptR.getDateNE("dpt_st_dt").lte(sloRecvIfR.slo_dt()) && sloRecvIfR.slo_dt().lte(usrDptR.getDateNE("dpt_end_dt"))) {
					usrDptL.add(usrDptR);
				}
			}
			
			MCIndexKey dptIdxkey = usrDptL.createIndex(MAVM_USR_DPT_R.$dpt_cd);
			MCIndexKey mainIdxkey = usrDptL.createIndex(MAVM_USR_DPT_R.$main_flg);
			
			if (!usrDptL.isEmpty()) {
				
				if (usrDptL.contains(dptIdxkey, sloRecvIfR.cst_sls_dpt_cd())) {
					
					slsDptCd = sloRecvIfR.cst_sls_dpt_cd();
				}
				else if (usrDptL.contains(mainIdxkey, true)) {
					
					slsDptCd = usrDptL.getFirst(mainIdxkey, true).dpt_cd();
				}
				else {
					usrDptL.sort(SortType.ASC, MAVM_USR_DPT_R.$dpt_cd);
					
					slsDptCd = usrDptL.get(0).dpt_cd();
				}
			}
			
			return slsDptCd;
		}
		
		/**
		 * 同一取込グループのキーを返す。
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			
			return new String[] {
					Slo_BulkImp_Chk01_DtlR.$trd_cd,
					Slo_BulkImp_Chk01_DtlR.$slo_dt,
					Slo_BulkImp_Chk01_DtlR.$slo_typ,
					Slo_BulkImp_Chk01_DtlR.$cst_cd,
					Slo_BulkImp_Chk01_DtlR.$cst_po_no,
					Slo_BulkImp_Chk01_DtlR.$cst_po_rev,
					Slo_BulkImp_Chk01_DtlR.$trd_cur_cd,
					Slo_BulkImp_Chk01_DtlR.$xrate,
					Slo_BulkImp_Chk01_DtlR.$ptax_xrate,
					Slo_BulkImp_Chk01_DtlR.$sls_usr_cd,
					Slo_BulkImp_Chk01_DtlR.$sls_dpt_cd,
					Slo_BulkImp_Chk01_DtlR.$iv_no,
					Slo_BulkImp_Chk01_DtlR.$tterm_cd1,
					Slo_BulkImp_Chk01_DtlR.$tterm_rmrks1,
					Slo_BulkImp_Chk01_DtlR.$tterm_cd2,
					Slo_BulkImp_Chk01_DtlR.$tterm_rmrks2,
					Slo_BulkImp_Chk01_DtlR.$tterm_cd3,
					Slo_BulkImp_Chk01_DtlR.$tterm_rmrks3,
					Slo_BulkImp_Chk01_DtlR.$trnspt_cd,
					Slo_BulkImp_Chk01_DtlR.$vssl_flght,
					Slo_BulkImp_Chk01_DtlR.$load_port_cd,
					Slo_BulkImp_Chk01_DtlR.$etd_dt,
					Slo_BulkImp_Chk01_DtlR.$dschrg_port_cd,
					Slo_BulkImp_Chk01_DtlR.$eta_dt,
					Slo_BulkImp_Chk01_DtlR.$via_port_cd,
					Slo_BulkImp_Chk01_DtlR.$via_schd_dt,
					Slo_BulkImp_Chk01_DtlR.$assort_typ,
					Slo_BulkImp_Chk01_DtlR.$sls_basis_typ,
					Slo_BulkImp_Chk01_DtlR.$ar_dpt_cd,
					Slo_BulkImp_Chk01_DtlR.$wrk_no,
					Slo_BulkImp_Chk01_DtlR.$rcpt_dt,
					Slo_BulkImp_Chk01_DtlR.$rcpt_usr_cd,
					Slo_BulkImp_Chk01_DtlR.$trd_rmrks,
					Slo_BulkImp_Chk01_DtlR.$intr_rmrks,
					Slo_BulkImp_Chk01_DtlR.$cst_po_rmrks,
					Slo_BulkImp_Chk01_DtlR.$qtn_no,
					Slo_BulkImp_Chk01_DtlR.$qtn_rev,
					Slo_BulkImp_Chk01_DtlR.$adv_ship_ctrl_typ,
					Slo_BulkImp_Chk01_DtlR.$adv_bill_amt,
					Slo_BulkImp_Chk01_DtlR.$sub_char1,
					Slo_BulkImp_Chk01_DtlR.$sub_char2,
					Slo_BulkImp_Chk01_DtlR.$sub_char3,
					Slo_BulkImp_Chk01_DtlR.$edi_flg,
					Slo_BulkImp_Chk01_DtlR.$edi_sub_char1,
					Slo_BulkImp_Chk01_DtlR.$edi_sub_char2,
					Slo_BulkImp_Chk01_DtlR.$edi_sub_char3,
					Slo_BulkImp_Chk01_DtlR.$edi_sub_char4,
					Slo_BulkImp_Chk01_DtlR.$edi_sub_char5,
					Slo_BulkImp_Chk01_DtlR.$edi_sub_num1,
					Slo_BulkImp_Chk01_DtlR.$edi_sub_dt1,
					Slo_BulkImp_Chk01_DtlR.$hdr_grp_no};
			
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
		}
		
		/***
		 * エラーフラグ設定</br>
		 */
		protected void setHdrErrFlg(MCList<Slo_BulkImp_Chk01_DtlR> notErrL) {
			// 明細に１件でもエラーが存在した場合、同一ヘッダのレコードは全てエラーとする
			MCList<Slo_BulkImp_Chk01_DtlR>[] grpL = notErrL.groupList(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no);
			for (MCList<Slo_BulkImp_Chk01_DtlR> l : grpL) {
				boolean hdr_err_flg = !isNull(l.getFirst(Slo_BulkImp_Chk01_DtlR.$hdr_err_flg, true));
				boolean err_flg = !isNull(l.getFirst(Slo_BulkImp_Chk01_DtlR.$err_flg, true));
				
				for(Slo_BulkImp_Chk01_DtlR r : l) {
					if(!r.hdr_err_flg()) {
						r.dtl_err_flg(r.err_flg());
					}
				}
				l.setBooleanNE(Slo_BulkImp_Chk01_DtlR.$err_flg, hdr_err_flg || err_flg);
			}
		}
		
		protected Map_SlsUpri_Sprt01_DtlR_Slo_BulkImp_Chk01_DtlR<SlsUpri_Sprt01_DtlR, Slo_BulkImp_Chk01_DtlR> createMap_SlsUpri_Sprt01_DtlR_Slo_BulkImp_Chk01_DtlR() {
			return new Map_SlsUpri_Sprt01_DtlR_Slo_BulkImp_Chk01_DtlR<SlsUpri_Sprt01_DtlR, Slo_BulkImp_Chk01_DtlR>();
		}
		
		public class Map_SlsUpri_Sprt01_DtlR_Slo_BulkImp_Chk01_DtlR<D extends SlsUpri_Sprt01_DtlR, S extends Slo_BulkImp_Chk01_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$peg_no, Slo_BulkImp_Chk01_DtlR.$peg_no);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$wg_cd, Slo_BulkImp_Chk01_DtlR.$wg_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_cd, Slo_BulkImp_Chk01_DtlR.$itm_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub1, Slo_BulkImp_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub2, Slo_BulkImp_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub3, Slo_BulkImp_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$cst_cd, Slo_BulkImp_Chk01_DtlR.$cst_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dlv_cd, Slo_BulkImp_Chk01_DtlR.$dlv_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$unit_cd, Slo_BulkImp_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$qty, Slo_BulkImp_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$cur_cd, Slo_BulkImp_Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dt, Slo_BulkImp_Chk01_DtlR.$slo_dt);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd1, Slo_BulkImp_Chk01_DtlR.$dest_cd1);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd2, Slo_BulkImp_Chk01_DtlR.$dest_cd2);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dest_cd3, Slo_BulkImp_Chk01_DtlR.$dest_cd3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.sls_upri_flg(true);
				
				if (MAC_SLS_UPRI_REQ_TYP.isSLO_DT(src.sls_upri_req_typ())) {
					dest.dt(src.slo_dt());
				}
				else if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(src.sls_upri_req_typ())) {
					dest.dt(src.dlv_rqst_tm());
				}
				else if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(src.sls_upri_req_typ())) {
					dest.dt(src.sls_schd_dt());
				}
				dest.not_err_flg(true);
				dest.grp_no(src.getStringNE("grp_no"));
			}
		}
		
		protected Map_Slo_BulkImp_Chk01_DtlR_Slo_Upd01_DtlR<Slo_BulkImp_Chk01_DtlR, Slo_Upd01_DtlR> createMap_Slo_BulkImp_Chk01_DtlR_Slo_Upd01_DtlR() {
			return new Map_Slo_BulkImp_Chk01_DtlR_Slo_Upd01_DtlR<Slo_BulkImp_Chk01_DtlR, Slo_Upd01_DtlR>();
		}
		
		public class Map_Slo_BulkImp_Chk01_DtlR_Slo_Upd01_DtlR<D extends Slo_BulkImp_Chk01_DtlR, S extends Slo_Upd01_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$data_crud_typ,Slo_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$abort_flg,Slo_Upd01_DtlR.$abort_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$itm_cd,Slo_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$itm_sub1,Slo_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$itm_sub2,Slo_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$itm_sub3,Slo_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sundry_itm_flg,Slo_Upd01_DtlR.$sundry_itm_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dscnt_itm_flg,Slo_Upd01_DtlR.$dscnt_itm_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$stk_mng_typ,Slo_Upd01_DtlR.$stk_mng_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$cntry_org_cd,Slo_Upd01_DtlR.$cntry_org_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$vmi_flg,Slo_Upd01_DtlR.$vmi_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$trd_unit_cd,Slo_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$trd_unit_qty,Slo_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$trd_cur_upri,Slo_Upd01_DtlR.$trd_cur_upri);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$interim_flg,Slo_Upd01_DtlR.$interim_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$upri_not_tgt_flg,Slo_Upd01_DtlR.$upri_not_tgt_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$cost_upri,Slo_Upd01_DtlR.$cost_upri);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$trd_cur_dscnt_amt,Slo_Upd01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dscnt_rsn_cd,Slo_Upd01_DtlR.$dscnt_rsn_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$iv_upri,Slo_Upd01_DtlR.$iv_upri);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tax_fix_flg,Slo_Upd01_DtlR.$tax_fix_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tax_cd,Slo_Upd01_DtlR.$tax_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tax_rate,Slo_Upd01_DtlR.$tax_rate);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$inc_tax_flg,Slo_Upd01_DtlR.$inc_tax_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$wtax_rate,Slo_Upd01_DtlR.$wtax_rate);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$bill_crryovr_times,Slo_Upd01_DtlR.$bill_crryovr_times);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$gd_cd,Slo_Upd01_DtlR.$gd_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno_num_flg,Slo_Upd01_DtlR.$sno_num_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno1,Slo_Upd01_DtlR.$sno1);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno1_null_flg,Slo_Upd01_DtlR.$sno1_null_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno2,Slo_Upd01_DtlR.$sno2);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno2_null_flg,Slo_Upd01_DtlR.$sno2_null_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno3,Slo_Upd01_DtlR.$sno3);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno3_null_flg,Slo_Upd01_DtlR.$sno3_null_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno4,Slo_Upd01_DtlR.$sno4);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno4_null_flg,Slo_Upd01_DtlR.$sno4_null_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno1_num_typ,Slo_Upd01_DtlR.$sno1_num_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno2_num_typ,Slo_Upd01_DtlR.$sno2_num_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno3_num_typ,Slo_Upd01_DtlR.$sno3_num_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sno4_num_typ,Slo_Upd01_DtlR.$sno4_num_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_sno1_flg,Slo_Upd01_DtlR.$slo_sno1_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_sno2_flg,Slo_Upd01_DtlR.$slo_sno2_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_sno3_flg,Slo_Upd01_DtlR.$slo_sno3_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_sno4_flg,Slo_Upd01_DtlR.$slo_sno4_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$set_itm_grp_no,Slo_Upd01_DtlR.$set_itm_grp_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_rqst_tm,Slo_Upd01_DtlR.$ship_rqst_tm);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_rqst_tm,Slo_Upd01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sls_schd_dt,Slo_Upd01_DtlR.$sls_schd_dt);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$accpt_schd_dt,Slo_Upd01_DtlR.$accpt_schd_dt);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_schd_tm,Slo_Upd01_DtlR.$ship_schd_tm);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_schd_tm,Slo_Upd01_DtlR.$dlv_schd_tm);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_cd,Slo_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_sundry_flg,Slo_Upd01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_cntct_dpt,Slo_Upd01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_cntct_psn,Slo_Upd01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_zip_cd,Slo_Upd01_DtlR.$dlv_zip_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_addr1,Slo_Upd01_DtlR.$dlv_addr1);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_addr2,Slo_Upd01_DtlR.$dlv_addr2);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_addr3,Slo_Upd01_DtlR.$dlv_addr3);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_addr4,Slo_Upd01_DtlR.$dlv_addr4);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_tel,Slo_Upd01_DtlR.$dlv_tel);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_fax,Slo_Upd01_DtlR.$dlv_fax);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_cntry_cd,Slo_Upd01_DtlR.$dlv_cntry_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_lg_grp_cd,Slo_Upd01_DtlR.$dlv_lg_grp_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$pri_prnt_flg,Slo_Upd01_DtlR.$pri_prnt_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dest_cd1,Slo_Upd01_DtlR.$dest_cd1);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dest_cd2,Slo_Upd01_DtlR.$dest_cd2);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dest_cd3,Slo_Upd01_DtlR.$dest_cd3);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_cd,Slo_Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_sundry_flg,Slo_Upd01_DtlR.$tdlv_sundry_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$via_dlv_typ,Slo_Upd01_DtlR.$via_dlv_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_cntct_dpt,Slo_Upd01_DtlR.$tdlv_cntct_dpt);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_cntct_psn,Slo_Upd01_DtlR.$tdlv_cntct_psn);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_zip_cd,Slo_Upd01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_addr1,Slo_Upd01_DtlR.$tdlv_addr1);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_addr2,Slo_Upd01_DtlR.$tdlv_addr2);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_addr3,Slo_Upd01_DtlR.$tdlv_addr3);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_addr4,Slo_Upd01_DtlR.$tdlv_addr4);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_tel,Slo_Upd01_DtlR.$tdlv_tel);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_fax,Slo_Upd01_DtlR.$tdlv_fax);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$tdlv_lg_grp_cd,Slo_Upd01_DtlR.$tdlv_lg_grp_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dlv_day_week_typ,Slo_Upd01_DtlR.$dlv_day_week_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sls_cststk_flg,Slo_Upd01_DtlR.$sls_cststk_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$proc_typ,Slo_Upd01_DtlR.$proc_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_inst_typ,Slo_Upd01_DtlR.$ship_inst_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_schd_split_typ,Slo_Upd01_DtlR.$ship_schd_split_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$alloc_scope_typ,Slo_Upd01_DtlR.$alloc_scope_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$alloc_typ,Slo_Upd01_DtlR.$alloc_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$not_lg_mix_flg,Slo_Upd01_DtlR.$not_lg_mix_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$rqst_to_loc_cd,Slo_Upd01_DtlR.$rqst_to_loc_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sppl_cd,Slo_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$maker_cd,Slo_Upd01_DtlR.$maker_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$wg_rqst_cnt_rmrks,Slo_Upd01_DtlR.$wg_rqst_cnt_rmrks);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$alloc_grp_cd,Slo_Upd01_DtlR.$alloc_grp_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_lg_grp_cd,Slo_Upd01_DtlR.$ship_lg_grp_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$def_loc_cd,Slo_Upd01_DtlR.$def_loc_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$loc_cd,Slo_Upd01_DtlR.$loc_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$str_ln_cd,Slo_Upd01_DtlR.$str_ln_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$str_ln_cd_none_flg,Slo_Upd01_DtlR.$str_ln_cd_none_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$lot_no,Slo_Upd01_DtlR.$lot_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sublot_no,Slo_Upd01_DtlR.$sublot_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$not_lot_mix_flg,Slo_Upd01_DtlR.$not_lot_mix_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$not_sublot_mix_flg,Slo_Upd01_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ver_flg,Slo_Upd01_DtlR.$ver_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ver_no,Slo_Upd01_DtlR.$ver_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_term_cd,Slo_Upd01_DtlR.$ship_term_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_block_flg,Slo_Upd01_DtlR.$ship_block_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_cnt_rmrks,Slo_Upd01_DtlR.$ship_cnt_rmrks);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$cst_po_d_no,Slo_Upd01_DtlR.$cst_po_d_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$cst_itm_cd,Slo_Upd01_DtlR.$cst_itm_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$cst_itm_nm,Slo_Upd01_DtlR.$cst_itm_nm);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$cst_po_d_rmrks,Slo_Upd01_DtlR.$cst_po_d_rmrks);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sls_rsn_cd,Slo_Upd01_DtlR.$sls_rsn_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sls_acxfr_flg,Slo_Upd01_DtlR.$sls_acxfr_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$bd_dpt_cd,Slo_Upd01_DtlR.$bd_dpt_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$sls_upri_req_typ,Slo_Upd01_DtlR.$sls_upri_req_typ);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$trd_d_rmrks,Slo_Upd01_DtlR.$trd_d_rmrks);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_d_intr_rmrks,Slo_Upd01_DtlR.$intr_rmrks);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_d_sub_char1,Slo_Upd01_DtlR.$sub_char1);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_d_sub_char2,Slo_Upd01_DtlR.$sub_char2);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_d_sub_char3,Slo_Upd01_DtlR.$sub_char3);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$can_rsn_cd,Slo_Upd01_DtlR.$can_rsn_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_d_can_rmkrs,Slo_Upd01_DtlR.$slo_d_can_rmkrs);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$qtn_d_no,Slo_Upd01_DtlR.$qtn_d_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$ship_pr_no,Slo_Upd01_DtlR.$ship_pr_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_dt,Slo_Upd01_DtlR.$slo_dt);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$itm_ship_grp_cd,Slo_Upd01_DtlR.$itm_ship_grp_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$not_dt_calc_flg,Slo_Upd01_DtlR.$not_dt_calc_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$trd_unit_dec_place,Slo_Upd01_DtlR.$trd_unit_dec_place);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$base_unit_cd,Slo_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$base_unit_qty,Slo_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$peg_no,Slo_Upd01_DtlR.$peg_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no,Slo_Upd01_DtlR.$hdr_peg_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$err_flg,Slo_Upd01_DtlR.$err_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$dtl_err_flg,Slo_Upd01_DtlR.$err_flg);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$rqst_to_wg_cd,Slo_Upd01_DtlR.$rqst_to_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (_fileImpFlg) {
					
					MAM_LG_GRP_R lgGrpR = getLgGrp(src.ship_lg_grp_cd());
					dest.ship_lg_grp_nm(lgGrpR.lg_grp_nm());
					MAM_LOC_R locR = getLoc(src.def_loc_cd());
					dest.def_loc_nm(locR.loc_nm());
					
					if (!isNull(src.sppl_cd())) {
						
						MAM_BP_R bpR = getBp(src.sppl_cd());
						dest.sppl_nm(bpR.bp_nm());
					}
					if (!isNull(src.maker_cd())) {
						
						MAM_BP_R makerR = getBp(src.maker_cd());
						dest.maker_nm(makerR.bp_nm());
					}
					if (!isNull(src.cost_upri())) {
						
						dest.cost_amt(MSUCL_SlsUtil.getCostAmt(src.cost_upri(),
								src.base_unit_qty(), getBaseCur().amt_dec_place()));
					}
				}
			}
		}
	}
	
	/**
	 * Slo_BulkImp_Chk02オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の削除前のチェック処理、項目値の補完を行う。<br>
	 */
	public class Slo_BulkImp_Chk02 extends MSBBL_SloRegService_MC_A.Slo_BulkImp_Chk02 {
		/**
		 * 受注ヘッダリスト
		 */
		protected MCList<MST_SLO_R> _sloL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUp() {
			super.initUp();
			
			up0().setStatus(Status.DELETE);
			setPegNo(up0());
			getSloInfo();
		}
		
		/**
		 * 受注関連情報を取得する。
		 */
		protected void getSloInfo() {
			
			getSlo();
			getSloD(up0());
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<Slo_BulkImp_Chk02_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callSloServiceChk03(notErrL);
			}
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgL = super.doServerCheckSub();
			
			doComp();
			msgL.addAll(chkAprv(up0()));
			msgL.addAll(checkExists(up0()));
			
			return msgL;
		}
		
		/***
		 * 補完処理
		 */
		protected void doComp() {
			MCIndexKey sloIdxkey = _sloL.createIndex(MST_SLO_R.$slo_no);
			
			for (Slo_BulkImp_Chk02_DtlR r : up0()) {
				MST_SLO_R sloR = _sloL.getFirst(sloIdxkey, r.slo_no());
				
				if (isNull(sloR)) {
					continue;
				}
				
				r.aprv_flg(sloR.aprv_flg());
				r.aprv_no(sloR.aprv_no());
				r.aprv_sts_typ(sloR.aprv_sts_typ());
				r.qtn_no(sloR.qtn_no());
				r.qtn_rev(sloR.qtn_rev());
				r.sls_dpt_cd(sloR.sls_dpt_cd());
				r.slo_upd_cntr(sloR.upd_cntr());
				r.qtn_upd_cntr(sloR.getNumberNE("qtn_upd_cntr"));
			}
		}
		
		/**
		 * 承認済かどうかチェックする。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAprv(MCList<Slo_BulkImp_Chk02_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Slo_BulkImp_Chk02_DtlR> noErrL = sloRecvIfL.subList(Slo_BulkImp_Chk02_DtlR.$err_flg, false);
			for (Slo_BulkImp_Chk02_DtlR r : noErrL) {
				
				if (MAC_APRV_STS_TYP.isFIX(r.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ())) {
					
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBBL0621, r.slo_no(), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * データが存在するかチェックする。
		 * @param sloRecvIfL 受注ファイルリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkExists(MCList<Slo_BulkImp_Chk02_DtlR> sloRecvIfL) {
			MCMessageList msgL = new MCMessageList();

			MCList<Slo_BulkImp_Chk02_DtlR> noErrL = sloRecvIfL.subList(Slo_BulkImp_Chk02_DtlR.$err_flg, false);
			MCIndexKey sloIdxkey = _sloL.createIndex(MST_SLO_R.$slo_no);
			
			for (Slo_BulkImp_Chk02_DtlR r : noErrL) {
				MST_SLO_R sloR = _sloL.getFirst(sloIdxkey, r.slo_no());
				
				if(isNull(sloR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), MST_SLO_R.create("T").tableName(), 
							new String [] {MST_SLO_R.$slo_no}, new Comparable[] {r.slo_no()}, r));
				}
			}

			return msgL;
		}
		
		/**
		 * 受注ヘッダを取得する。
		 */
		protected void getSlo() {
			
			_sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MST_QTN_R t2 = MST_QTN_R.create("T2");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			
			_sloL.addNumberColumn("qtn_upd_cntr");
			sloL_bldr.addSelect(t2.upd_cntr.as("qtn_upd_cntr"));
			sloL_bldr.addLeftOuterJoin(t2, t2.qtn_no.eq(t.qtn_no).and(t2.qtn_rev.eq(t.qtn_rev)));
			sloL_bldr.setWhere(t.slo_no.eq(bind("slo_no")));
			sloL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			dbSelect("MSBBL6020_MST_SLO_S05", _sloL, sloL_bldr, up0().groupBy(Slo_BulkImp_Chk02_DtlR.$slo_no));
		}
		
		/**
		 * 受注登録サービスの削除前チェックを実行する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void callSloServiceChk03(MCList<Slo_BulkImp_Chk02_DtlR> notErrL) {
			
			MSBBL_SloRegService.Slo_Chk03 chk03Serv = null;
			
			for (Slo_BulkImp_Chk02_DtlR r : notErrL) {
				chk03Serv = MSBBL_SloRegService.crtSlo_Chk03();
				copy(chk03Serv.up0(), r, createMap_Slo_Del01_HdrR_Slo_BulkImp_Chk02_DtlR());
				
				MCList<MST_SLO_D_R> sloDL = getSloD(r.slo_no());
				MCList<Slo_Del01_DtlR> upL = MCList.create(Slo_Del01_DtlR.create());
				addAll(upL, sloDL, createMap_Slo_Del01_DtlR_MST_SLO_D_R());
				upL.setNumber(Slo_Del01_DtlR.$peg_no, r.peg_no());
				chk03Serv.up1().addAll(upL);
				
				chk03Serv.exec();
			}
		}
	}

	/**
	 * Slo_BulkImp_Ins01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の登録を行う。<br>
	 */
	public class Slo_BulkImp_Ins01 extends MSBBL_SloRegService_MC_A.Slo_BulkImp_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			proc();
			setDown();
		}
		
		@Override
		protected void doEditDown(MCContainer container) {
			super.doEditDown(container);
			doCompTime(container, false);
		}
		
		/**
		 * 登録処理
		 */
		protected void proc() {
			
			if (isSame(MCSys.request.logicId(), "MSBBL1220")) {
				_fileImpFlg = true;
			}
			
			up0().sort(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no);
			MCList<Slo_BulkImp_Chk01_DtlR>[] grp = up0().groupList(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no);
			
			for (MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL : grp) {
				callSloServiceIns01(sloRecvIfL);
			}
		}
		
		/**
		 * 受注登録サービスの受注登録を実行する。
		 * @param sloRecvIfL 受注ファイルリスト
		 */
		protected void callSloServiceIns01(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL) {
			
			MSBBL_SloRegService.Slo_Ins01 ins01Serv = MSBBL_SloRegService.crtSlo_Ins01();
			
			Slo_BulkImp_Chk01_DtlR hdrR = sloRecvIfL.get(0);
			Slo_Upd01_HdrR opeUp0R = ins01Serv.up0().createRow();
			copy(opeUp0R, hdrR, createMap_Slo_Upd01_HdrR_Slo_BulkImp_Chk01_DtlR());
			ins01Serv.up0().add(opeUp0R);
			addAll(ins01Serv.up1(), sloRecvIfL, createMap_Slo_Upd01_DtlR_Slo_BulkImp_Chk01_DtlR());
			
			ins01Serv.exec();
			
			Slo_Ins01_Rslt_HdrR down0R = ins01Serv.down0().get(0);
			MCList<Slo_Ins01_Rslt_DtlR> down1L = ins01Serv.down1();
			for (Slo_BulkImp_Chk01_DtlR dtlR : sloRecvIfL) {
				dtlR.slo_no(down0R.slo_no());
				dtlR.slo_rev(down0R.slo_rev());
				dtlR.aprv_flg(down0R.aprv_flg());
				dtlR.aprv_no(down0R.aprv_no());
				dtlR.aprv_sts_typ(down0R.aprv_sts_typ());
				dtlR.aprv_sts_typ_nm(down0R.aprv_sts_typ_nm());
				dtlR.iv_no(down0R.iv_no());
			}
			
			if (_fileImpFlg) {
				srchSlo(sloRecvIfL, down0R, down1L);
			}
		}
		
		/** 下り電文設定 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 受注を検索する。
		 * @param hdrR 受注ヘッダ
		 * @param dtlL 受注明細
		 * @param servSloDRsltL 受注登録サービスの下り電文
		 */
		protected void srchSlo(MCList<Slo_BulkImp_Chk01_DtlR> sloRecvIfL, Slo_Ins01_Rslt_HdrR down0R, MCList<Slo_Ins01_Rslt_DtlR> down1L) {
			
			MCList<Slo_BulkImp_Chk01_DtlR> sloDL = MCList.create(Slo_BulkImp_Chk01_DtlR.class);
			
			executeQuery(sloDL, MSBBL6020_MST_SLO_D_S02(), down0R);
			
			crtSloDWk(sloDL);
			
			setAllocWaitQty(sloDL);
			
			MCIndexKey idxkey = sloDL.createIndex(Slo_BulkImp_Chk01_DtlR.$slo_d_no);
			
			Slo_BulkImp_Chk01_DtlR downR = null;
			for (Slo_Ins01_Rslt_DtlR dtlR : down1L) {
				
				downR = sloDL.getFirst(idxkey, dtlR.slo_d_no());
				Slo_BulkImp_Chk01_DtlR sloRecvIfR = sloRecvIfL.getFirst(Slo_Ins01_Rslt_DtlR.$peg_no, dtlR.peg_no());
				
				if (isNull(downR) || downR.isEmpty()) {
					downR = Slo_BulkImp_Chk01_DtlR.create();
				}
				
				copy(sloRecvIfR, dtlR, downR, createMap_Slo_BulkImp_Chk01_DtlR_Slo_Ins01_Rslt_DtlR());
			}
		}
		
		/**
		 * 受注明細のワークテーブルを作成する。
		 * @param dtlL 受注明細
		 */
		protected void crtSloDWk(MCList<Slo_BulkImp_Chk01_DtlR> dtlL) {
			
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R sloDR = null;
			
			for (Slo_BulkImp_Chk01_DtlR rsltR : dtlL.groupBy(Slo_BulkImp_Chk01_DtlR.$slo_d_no)) {
				
				if (!isNull(rsltR.slo_d_no())) {
					
					sloDR = MST_SLO_D_R.create();
					sloDR.slo_d_no(rsltR.slo_d_no());
					
					sloDL.add(sloDR);
				}
			}
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBBL6020_MSW_SLO_D_D01", sloDL_bldr.getBaseDbc());
			dbWkInsert("MSBBL6020_MSW_SLO_D_I01", sloDL, sloDL_bldr.getBaseDbc());
		}
		
		/**
		 * 引当数・保留数を設定する。
		 * @param dtlL 受注明細
		 */
		protected void setAllocWaitQty(MCList<Slo_BulkImp_Chk01_DtlR> sloDL) {
			
			MCList<Slo_BulkImp_Chk01_DtlR> rsltL = MCList.create(Slo_BulkImp_Chk01_DtlR.class);
			executeQuery(rsltL, MSBBL6020_MST_SHIP_SCHD_S01());
			
			MCIndexKey idxkey = rsltL.createIndex(Slo_BulkImp_Chk01_DtlR.$slo_d_no);
			
			for (Slo_BulkImp_Chk01_DtlR sloDR : sloDL) {
				
				Slo_BulkImp_Chk01_DtlR rsltR = rsltL.getFirst(idxkey, sloDR.slo_d_no());
				
				if (!isNull(rsltR)) {
					
					sloDR.alloc_qty(nvl(rsltR.alloc_qty(), MCNumber.ZERO));
					sloDR.wait_qty(nvl(rsltR.wait_qty(), MCNumber.ZERO));
				}
				else {
					
					sloDR.alloc_qty(0);
					sloDR.wait_qty(0);
				}
				sloDR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp( sloDR.alloc_typ(), sloDR.ship_pr_base_unit_qty(), 
						sloDR.alloc_qty(), MCNumber.ZERO, false));
			}
		}
		
		protected Map_Slo_BulkImp_Chk01_DtlR_Slo_Ins01_Rslt_DtlR<Slo_BulkImp_Chk01_DtlR, Slo_Ins01_Rslt_DtlR, Slo_BulkImp_Chk01_DtlR> createMap_Slo_BulkImp_Chk01_DtlR_Slo_Ins01_Rslt_DtlR() {
			return new Map_Slo_BulkImp_Chk01_DtlR_Slo_Ins01_Rslt_DtlR<Slo_BulkImp_Chk01_DtlR, Slo_Ins01_Rslt_DtlR, Slo_BulkImp_Chk01_DtlR>();
		}
		
		public class Map_Slo_BulkImp_Chk01_DtlR_Slo_Ins01_Rslt_DtlR<D extends Slo_BulkImp_Chk01_DtlR, S extends Slo_Ins01_Rslt_DtlR, W extends Slo_BulkImp_Chk01_DtlR> extends MAUCC_RowMapperWith<D,S,W>{
			protected W _down;
			@Override
			public void setWith(W _down){
				this._down = _down;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$disp_seq, Slo_Ins01_Rslt_DtlR.$disp_seq);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$slo_d_no, Slo_Ins01_Rslt_DtlR.$slo_d_no);
				addColumnPathMap(Slo_BulkImp_Chk01_DtlR.$str_ln_cd_none_flg, Slo_Ins01_Rslt_DtlR.$str_ln_cd_none_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.sno1(_down.sno1());
				dest.sno2(_down.sno2());
				dest.sno3(_down.sno3());
				dest.sno4(_down.sno4());
				dest.sls_schd_dt(_down.sls_schd_dt());
				dest.ship_schd_split_flg(_down.ship_schd_split_flg());
				dest.ship_schd_dt(_down.ship_schd_dt());
				dest.ship_schd_hm(_down.ship_schd_hm());
				dest.dlv_schd_dt(_down.dlv_schd_dt());
				dest.dlv_schd_hm(_down.dlv_schd_hm());
				dest.alloc_scope_typ(_down.alloc_scope_typ());
				dest.alloc_typ(_down.alloc_typ());
				dest.rqst_to_loc_cd(_down.rqst_to_loc_cd());
				dest.sppl_cd(_down.sppl_cd());
				dest.maker_cd(_down.maker_cd());
				dest.rqst_dt(_down.rqst_dt());
				dest.rqst_dlv_rqst_dt(_down.rqst_dlv_rqst_dt());
				dest.alloc_grp_cd(_down.alloc_grp_cd());
				dest.loc_cd(_down.loc_cd());
				dest.str_ln_cd(_down.str_ln_cd());
				dest.alloc_sts_typ(_down.alloc_sts_typ());
				dest.alloc_qty(_down.alloc_qty());
				dest.wait_qty(_down.wait_qty());
				MAM_LOC_R rqstToLoc = getLoc(src.rqst_to_loc_cd());
				dest.rqst_to_loc_nm(rqstToLoc.loc_nm());
				MAM_LOC_R locR = getLoc(src.loc_cd());
				dest.loc_nm(locR.loc_nm());
				
				if (!isNull(src.sppl_cd())) {
					
					MAM_BP_R bpR = getBp(src.sppl_cd());
					dest.sppl_nm(bpR.bp_nm());
				}
				if (!isNull(src.maker_cd())) {
					
					MAM_BP_R makerR = getBp(src.maker_cd());
					dest.maker_nm(makerR.bp_nm());
				}
			}
		}
	}
	
	/**
	 * Slo_BulkImp_Del01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の削除を行う。<br>
	 */
	public class Slo_BulkImp_Del01 extends MSBBL_SloRegService_MC_A.Slo_BulkImp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			getSloD(up0());
			callSloServiceDel01();
		}
		
		/**
		 * 受注登録サービスの受注削除を実行する。
		 */
		protected void callSloServiceDel01() {
			MSBBL_SloRegService.Slo_Del01 del01Serv = null;
			MSBBL_SloRegService.Slo_Chk03 chk03Serv = null;
			
			for (Slo_BulkImp_Chk02_DtlR r : up0()) {
				chk03Serv = MSBBL_SloRegService.crtSlo_Chk03();
				copy(chk03Serv.up0(), r, createMap_Slo_Del01_HdrR_Slo_BulkImp_Chk02_DtlR());
				
				MCList<MST_SLO_D_R> sloDL = getSloD(r.slo_no());
				MCList<Slo_Del01_DtlR> upL = MCList.create(Slo_Del01_DtlR.create());
				addAll(upL, sloDL, createMap_Slo_Del01_DtlR_MST_SLO_D_R());
				upL.setNumber(Slo_Del01_DtlR.$peg_no, r.peg_no());
				chk03Serv.up1().addAll(upL);
				
				chk03Serv.exec();
				
				del01Serv = MSBBL_SloRegService.crtSlo_Del01();
				MCRow.copyall(del01Serv.up0(), chk03Serv.down0());
				del01Serv.up1().setAll(chk03Serv.down1());
				
				del01Serv.exec();
			}
		}
	}
	
	/**
	 * 受注明細リスト
	 */
	protected MCList<MST_SLO_D_R> _sloDL = null;
	
	/**
	 * 受注明細のインデックス
	 */
	protected MCIndexKey _sloDIdxkey = null;
	
	/**
	 * 受注明細を取得する。
	 */
	protected void getSloD(MCList<Slo_BulkImp_Chk02_DtlR> upL) {
		
		_sloDL = MCList.create(MST_SLO_D_R.class);
		_sloDL.addStringColumn(MST_SHIP_PR_R.$ship_pr_no);
		MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
		
		_sloDL.addStringColumn("ship_pr_no");
		_sloDL.addNumberColumn("ship_pr_upd_cntr");
		sloDL_bldr.addSelect(t2.ship_pr_no, t2.upd_cntr.as("ship_pr_upd_cntr"));
		sloDL_bldr.addInnerJoin(t2, t.slo_d_no.eq(t2.slo_d_no));
		sloDL_bldr.setWhere(t.slo_no.eq(bind("slo_no")));
		dbSelect("MSBBL6020_MST_SLO_D_S08", _sloDL, sloDL_bldr, upL.groupBy(Slo_BulkImp_Chk02_DtlR.$slo_no));
		
		_sloDIdxkey = _sloDL.createIndex(MST_SLO_D_R.$slo_no);
	}
	
	/**
	 * 引数に指定された受注明細ＮＯで受注明細を取得する。
	 * @param sloDNo 受注明細ＮＯ
	 * @return 受注明細
	 */
	protected MCList<MST_SLO_D_R> getSloD(String sloNo) {
		
		return _sloDL.subList(_sloDIdxkey, sloNo);
	}
	
	protected Map_Slo_Upd01_HdrR_Slo_BulkImp_Chk01_DtlR<Slo_Upd01_HdrR, Slo_BulkImp_Chk01_DtlR> createMap_Slo_Upd01_HdrR_Slo_BulkImp_Chk01_DtlR() {
		return new Map_Slo_Upd01_HdrR_Slo_BulkImp_Chk01_DtlR<Slo_Upd01_HdrR, Slo_BulkImp_Chk01_DtlR>();
	}
	
	public class Map_Slo_Upd01_HdrR_Slo_BulkImp_Chk01_DtlR<D extends Slo_Upd01_HdrR, S extends Slo_BulkImp_Chk01_DtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Slo_Upd01_HdrR.$data_crud_typ, Slo_BulkImp_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Slo_Upd01_HdrR.$trd_cd, Slo_BulkImp_Chk01_DtlR.$trd_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$trd_ptn_typ, Slo_BulkImp_Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(Slo_Upd01_HdrR.$slo_typ, Slo_BulkImp_Chk01_DtlR.$slo_typ);
			addColumnPathMap(Slo_Upd01_HdrR.$aprv_back_flg, Slo_BulkImp_Chk01_DtlR.$aprv_back_flg);
			addColumnPathMap(Slo_Upd01_HdrR.$slo_dt, Slo_BulkImp_Chk01_DtlR.$slo_dt);
			addColumnPathMap(Slo_Upd01_HdrR.$qtn_no, Slo_BulkImp_Chk01_DtlR.$qtn_no);
			addColumnPathMap(Slo_Upd01_HdrR.$qtn_rev, Slo_BulkImp_Chk01_DtlR.$qtn_rev);
			addColumnPathMap(Slo_Upd01_HdrR.$cst_cd, Slo_BulkImp_Chk01_DtlR.$cst_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$cst_iv_flg, Slo_BulkImp_Chk01_DtlR.$cst_iv_flg);
			addColumnPathMap(Slo_Upd01_HdrR.$sls_basis_typ, Slo_BulkImp_Chk01_DtlR.$sls_basis_typ);
			addColumnPathMap(Slo_Upd01_HdrR.$sls_usr_cd, Slo_BulkImp_Chk01_DtlR.$sls_usr_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$sls_dpt_cd, Slo_BulkImp_Chk01_DtlR.$sls_dpt_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$assort_typ, Slo_BulkImp_Chk01_DtlR.$assort_typ);
			addColumnPathMap(Slo_Upd01_HdrR.$trd_cur_cd, Slo_BulkImp_Chk01_DtlR.$trd_cur_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$xrate_inpt_flg, Slo_BulkImp_Chk01_DtlR.$xrate_inpt_flg);
			addColumnPathMap(Slo_Upd01_HdrR.$xrate, Slo_BulkImp_Chk01_DtlR.$xrate);
			addColumnPathMap(Slo_Upd01_HdrR.$ptax_xrate_inpt_flg, Slo_BulkImp_Chk01_DtlR.$ptax_xrate_inpt_flg);
			addColumnPathMap(Slo_Upd01_HdrR.$ptax_xrate, Slo_BulkImp_Chk01_DtlR.$ptax_xrate);
			addColumnPathMap(Slo_Upd01_HdrR.$wrk_no, Slo_BulkImp_Chk01_DtlR.$wrk_no);
			addColumnPathMap(Slo_Upd01_HdrR.$trnspt_cd, Slo_BulkImp_Chk01_DtlR.$trnspt_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$vssl_flght, Slo_BulkImp_Chk01_DtlR.$vssl_flght);
			addColumnPathMap(Slo_Upd01_HdrR.$load_port_cd, Slo_BulkImp_Chk01_DtlR.$load_port_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$etd_dt, Slo_BulkImp_Chk01_DtlR.$etd_dt);
			addColumnPathMap(Slo_Upd01_HdrR.$dschrg_port_cd, Slo_BulkImp_Chk01_DtlR.$dschrg_port_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$eta_dt, Slo_BulkImp_Chk01_DtlR.$eta_dt);
			addColumnPathMap(Slo_Upd01_HdrR.$via_port_cd, Slo_BulkImp_Chk01_DtlR.$via_port_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$via_schd_dt, Slo_BulkImp_Chk01_DtlR.$via_schd_dt);
			addColumnPathMap(Slo_Upd01_HdrR.$iv_no, Slo_BulkImp_Chk01_DtlR.$iv_no);
			addColumnPathMap(Slo_Upd01_HdrR.$iv_num_flg, Slo_BulkImp_Chk01_DtlR.$iv_num_flg);
			addColumnPathMap(Slo_Upd01_HdrR.$adv_ship_ctrl_typ, Slo_BulkImp_Chk01_DtlR.$adv_ship_ctrl_typ);
			addColumnPathMap(Slo_Upd01_HdrR.$adv_bill_amt, Slo_BulkImp_Chk01_DtlR.$adv_bill_amt);
			addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd1, Slo_BulkImp_Chk01_DtlR.$tterm_cd1);
			addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks1, Slo_BulkImp_Chk01_DtlR.$tterm_rmrks1);
			addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd2, Slo_BulkImp_Chk01_DtlR.$tterm_cd2);
			addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks2, Slo_BulkImp_Chk01_DtlR.$tterm_rmrks2);
			addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd3, Slo_BulkImp_Chk01_DtlR.$tterm_cd3);
			addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks3, Slo_BulkImp_Chk01_DtlR.$tterm_rmrks3);
			addColumnPathMap(Slo_Upd01_HdrR.$cst_po_no, Slo_BulkImp_Chk01_DtlR.$cst_po_no);
			addColumnPathMap(Slo_Upd01_HdrR.$cst_po_rev, Slo_BulkImp_Chk01_DtlR.$cst_po_rev);
			addColumnPathMap(Slo_Upd01_HdrR.$ar_dpt_cd, Slo_BulkImp_Chk01_DtlR.$ar_dpt_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$rcpt_dt, Slo_BulkImp_Chk01_DtlR.$rcpt_dt);
			addColumnPathMap(Slo_Upd01_HdrR.$rcpt_usr_cd, Slo_BulkImp_Chk01_DtlR.$rcpt_usr_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$cst_po_rmrks, Slo_BulkImp_Chk01_DtlR.$cst_po_rmrks);
			addColumnPathMap(Slo_Upd01_HdrR.$trd_rmrks, Slo_BulkImp_Chk01_DtlR.$trd_rmrks);
			addColumnPathMap(Slo_Upd01_HdrR.$intr_rmrks, Slo_BulkImp_Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(Slo_Upd01_HdrR.$sub_char1, Slo_BulkImp_Chk01_DtlR.$sub_char1);
			addColumnPathMap(Slo_Upd01_HdrR.$sub_char2, Slo_BulkImp_Chk01_DtlR.$sub_char2);
			addColumnPathMap(Slo_Upd01_HdrR.$sub_char3, Slo_BulkImp_Chk01_DtlR.$sub_char3);
			addColumnPathMap(Slo_Upd01_HdrR.$edi_flg, Slo_BulkImp_Chk01_DtlR.$edi_flg);
			addColumnPathMap(Slo_Upd01_HdrR.$wg_cd, Slo_BulkImp_Chk01_DtlR.$wg_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$cntry_cd, Slo_BulkImp_Chk01_DtlR.$cntry_cd);
			addColumnPathMap(Slo_Upd01_HdrR.$sls_amt_rnd_typ, Slo_BulkImp_Chk01_DtlR.$sls_amt_rnd_typ);
			addColumnPathMap(Slo_Upd01_HdrR.$sls_tax_rnd_typ, Slo_BulkImp_Chk01_DtlR.$sls_tax_rnd_typ);
			addColumnPathMap(Slo_Upd01_HdrR.$amt_dec_place, Slo_BulkImp_Chk01_DtlR.$amt_dec_place);
			addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char1, Slo_BulkImp_Chk01_DtlR.$edi_sub_char1);
			addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char2, Slo_BulkImp_Chk01_DtlR.$edi_sub_char2);
			addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char3, Slo_BulkImp_Chk01_DtlR.$edi_sub_char3);
			addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char4, Slo_BulkImp_Chk01_DtlR.$edi_sub_char4);
			addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char5, Slo_BulkImp_Chk01_DtlR.$edi_sub_char5);
			addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_num1, Slo_BulkImp_Chk01_DtlR.$edi_sub_num1);
			addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_dt1, Slo_BulkImp_Chk01_DtlR.$edi_sub_dt1);
			addColumnPathMap(Slo_Upd01_HdrR.$peg_no, Slo_BulkImp_Chk01_DtlR.$hdr_peg_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.upd_cntr_not_chk_flg(true);
		}
	}
	
	protected Map_Slo_Upd01_DtlR_Slo_BulkImp_Chk01_DtlR<Slo_Upd01_DtlR, Slo_BulkImp_Chk01_DtlR> createMap_Slo_Upd01_DtlR_Slo_BulkImp_Chk01_DtlR() {
		return new Map_Slo_Upd01_DtlR_Slo_BulkImp_Chk01_DtlR<Slo_Upd01_DtlR, Slo_BulkImp_Chk01_DtlR>();
	}
	
	public class Map_Slo_Upd01_DtlR_Slo_BulkImp_Chk01_DtlR<D extends Slo_Upd01_DtlR, S extends Slo_BulkImp_Chk01_DtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Slo_Upd01_DtlR.$data_crud_typ,Slo_BulkImp_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$itm_cd,Slo_BulkImp_Chk01_DtlR.$itm_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$itm_sub1,Slo_BulkImp_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Slo_Upd01_DtlR.$itm_sub2,Slo_BulkImp_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Slo_Upd01_DtlR.$itm_sub3,Slo_BulkImp_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Slo_Upd01_DtlR.$itm_nm,Slo_BulkImp_Chk01_DtlR.$itm_nm);
			addColumnPathMap(Slo_Upd01_DtlR.$iv_itm_nm,Slo_BulkImp_Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(Slo_Upd01_DtlR.$cntry_org_cd,Slo_BulkImp_Chk01_DtlR.$cntry_org_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$vmi_flg,Slo_BulkImp_Chk01_DtlR.$vmi_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_cd,Slo_BulkImp_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_qty,Slo_BulkImp_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_cur_upri,Slo_BulkImp_Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(Slo_Upd01_DtlR.$interim_flg,Slo_BulkImp_Chk01_DtlR.$interim_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$upri_not_tgt_flg,Slo_BulkImp_Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$cost_upri,Slo_BulkImp_Chk01_DtlR.$cost_upri);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_cur_dscnt_amt,Slo_BulkImp_Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Slo_Upd01_DtlR.$dscnt_rsn_cd,Slo_BulkImp_Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$iv_upri,Slo_BulkImp_Chk01_DtlR.$iv_upri);
			addColumnPathMap(Slo_Upd01_DtlR.$tax_fix_flg,Slo_BulkImp_Chk01_DtlR.$tax_fix_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$tax_cd,Slo_BulkImp_Chk01_DtlR.$tax_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$tax_rate,Slo_BulkImp_Chk01_DtlR.$tax_rate);
			addColumnPathMap(Slo_Upd01_DtlR.$inc_tax_flg,Slo_BulkImp_Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$wtax_rate,Slo_BulkImp_Chk01_DtlR.$wtax_rate);
			addColumnPathMap(Slo_Upd01_DtlR.$bill_crryovr_times,Slo_BulkImp_Chk01_DtlR.$bill_crryovr_times);
			addColumnPathMap(Slo_Upd01_DtlR.$gd_cd,Slo_BulkImp_Chk01_DtlR.$gd_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$sno_num_flg,Slo_BulkImp_Chk01_DtlR.$sno_num_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$sno1,Slo_BulkImp_Chk01_DtlR.$sno1);
			addColumnPathMap(Slo_Upd01_DtlR.$sno1_null_flg,Slo_BulkImp_Chk01_DtlR.$sno1_null_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$sno2,Slo_BulkImp_Chk01_DtlR.$sno2);
			addColumnPathMap(Slo_Upd01_DtlR.$sno2_null_flg,Slo_BulkImp_Chk01_DtlR.$sno2_null_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$sno3,Slo_BulkImp_Chk01_DtlR.$sno3);
			addColumnPathMap(Slo_Upd01_DtlR.$sno3_null_flg,Slo_BulkImp_Chk01_DtlR.$sno3_null_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$sno4,Slo_BulkImp_Chk01_DtlR.$sno4);
			addColumnPathMap(Slo_Upd01_DtlR.$sno4_null_flg,Slo_BulkImp_Chk01_DtlR.$sno4_null_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$sno1_mng_typ,Slo_BulkImp_Chk01_DtlR.$sno1_mng_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sno2_mng_typ,Slo_BulkImp_Chk01_DtlR.$sno2_mng_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sno3_mng_typ,Slo_BulkImp_Chk01_DtlR.$sno3_mng_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sno4_mng_typ,Slo_BulkImp_Chk01_DtlR.$sno4_mng_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sno1_num_typ,Slo_BulkImp_Chk01_DtlR.$sno1_num_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sno2_num_typ,Slo_BulkImp_Chk01_DtlR.$sno2_num_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sno3_num_typ,Slo_BulkImp_Chk01_DtlR.$sno3_num_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sno4_num_typ,Slo_BulkImp_Chk01_DtlR.$sno4_num_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sno1_ptn_cd,Slo_BulkImp_Chk01_DtlR.$sno1_ptn_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$sno2_ptn_cd,Slo_BulkImp_Chk01_DtlR.$sno2_ptn_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$sno3_ptn_cd,Slo_BulkImp_Chk01_DtlR.$sno3_ptn_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$sno4_ptn_cd,Slo_BulkImp_Chk01_DtlR.$sno4_ptn_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$slo_sno1_flg,Slo_BulkImp_Chk01_DtlR.$slo_sno1_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$slo_sno2_flg,Slo_BulkImp_Chk01_DtlR.$slo_sno2_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$slo_sno3_flg,Slo_BulkImp_Chk01_DtlR.$slo_sno3_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$slo_sno4_flg,Slo_BulkImp_Chk01_DtlR.$slo_sno4_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$set_itm_grp_no,Slo_BulkImp_Chk01_DtlR.$set_itm_grp_no);
			addColumnPathMap(Slo_Upd01_DtlR.$sls_schd_dt,Slo_BulkImp_Chk01_DtlR.$sls_schd_dt);
			addColumnPathMap(Slo_Upd01_DtlR.$accpt_schd_dt,Slo_BulkImp_Chk01_DtlR.$accpt_schd_dt);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_cd,Slo_BulkImp_Chk01_DtlR.$dlv_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_nm,Slo_BulkImp_Chk01_DtlR.$dlv_nm);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_cntct_dpt,Slo_BulkImp_Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_cntct_psn,Slo_BulkImp_Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_zip_cd,Slo_BulkImp_Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr1,Slo_BulkImp_Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr2,Slo_BulkImp_Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr3,Slo_BulkImp_Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr4,Slo_BulkImp_Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_tel,Slo_BulkImp_Chk01_DtlR.$dlv_tel);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_fax,Slo_BulkImp_Chk01_DtlR.$dlv_fax);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_lg_grp_cd,Slo_BulkImp_Chk01_DtlR.$dlv_lg_grp_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$pri_prnt_flg,Slo_BulkImp_Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$dest_cd1,Slo_BulkImp_Chk01_DtlR.$dest_cd1);
			addColumnPathMap(Slo_Upd01_DtlR.$dest_cd2,Slo_BulkImp_Chk01_DtlR.$dest_cd2);
			addColumnPathMap(Slo_Upd01_DtlR.$dest_cd3,Slo_BulkImp_Chk01_DtlR.$dest_cd3);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cd,Slo_BulkImp_Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_nm,Slo_BulkImp_Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(Slo_Upd01_DtlR.$via_dlv_typ,Slo_BulkImp_Chk01_DtlR.$via_dlv_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cntct_dpt,Slo_BulkImp_Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cntct_psn,Slo_BulkImp_Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_zip_cd,Slo_BulkImp_Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr1,Slo_BulkImp_Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr2,Slo_BulkImp_Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr3,Slo_BulkImp_Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr4,Slo_BulkImp_Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_tel,Slo_BulkImp_Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_fax,Slo_BulkImp_Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_lg_grp_cd,Slo_BulkImp_Chk01_DtlR.$tdlv_lg_grp_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_day_week_typ,Slo_BulkImp_Chk01_DtlR.$dlv_day_week_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sls_cststk_flg,Slo_BulkImp_Chk01_DtlR.$sls_cststk_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$proc_typ,Slo_BulkImp_Chk01_DtlR.$proc_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_inst_typ,Slo_BulkImp_Chk01_DtlR.$ship_inst_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_schd_split_typ,Slo_BulkImp_Chk01_DtlR.$ship_schd_split_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$alloc_scope_typ,Slo_BulkImp_Chk01_DtlR.$alloc_scope_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$alloc_typ,Slo_BulkImp_Chk01_DtlR.$alloc_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$not_lg_mix_flg,Slo_BulkImp_Chk01_DtlR.$not_lg_mix_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$rqst_to_loc_cd,Slo_BulkImp_Chk01_DtlR.$rqst_to_loc_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$sppl_cd,Slo_BulkImp_Chk01_DtlR.$sppl_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$maker_cd,Slo_BulkImp_Chk01_DtlR.$maker_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$wg_rqst_cnt_rmrks,Slo_BulkImp_Chk01_DtlR.$wg_rqst_cnt_rmrks);
			addColumnPathMap(Slo_Upd01_DtlR.$alloc_grp_cd,Slo_BulkImp_Chk01_DtlR.$alloc_grp_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_lg_grp_cd,Slo_BulkImp_Chk01_DtlR.$ship_lg_grp_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$def_loc_cd,Slo_BulkImp_Chk01_DtlR.$def_loc_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$loc_cd,Slo_BulkImp_Chk01_DtlR.$loc_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$str_ln_cd,Slo_BulkImp_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$str_ln_cd_none_flg,Slo_BulkImp_Chk01_DtlR.$str_ln_cd_none_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$lot_no,Slo_BulkImp_Chk01_DtlR.$lot_no);
			addColumnPathMap(Slo_Upd01_DtlR.$sublot_no,Slo_BulkImp_Chk01_DtlR.$sublot_no);
			addColumnPathMap(Slo_Upd01_DtlR.$not_lot_mix_flg,Slo_BulkImp_Chk01_DtlR.$not_lot_mix_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$not_sublot_mix_flg,Slo_BulkImp_Chk01_DtlR.$not_sublot_mix_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$ver_no,Slo_BulkImp_Chk01_DtlR.$ver_no);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_term_cd,Slo_BulkImp_Chk01_DtlR.$ship_term_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_block_flg,Slo_BulkImp_Chk01_DtlR.$ship_block_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_cnt_rmrks,Slo_BulkImp_Chk01_DtlR.$ship_cnt_rmrks);
			addColumnPathMap(Slo_Upd01_DtlR.$cst_po_d_no,Slo_BulkImp_Chk01_DtlR.$cst_po_d_no);
			addColumnPathMap(Slo_Upd01_DtlR.$cst_itm_cd,Slo_BulkImp_Chk01_DtlR.$cst_itm_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$cst_itm_nm,Slo_BulkImp_Chk01_DtlR.$cst_itm_nm);
			addColumnPathMap(Slo_Upd01_DtlR.$cst_po_d_rmrks,Slo_BulkImp_Chk01_DtlR.$cst_po_d_rmrks);
			addColumnPathMap(Slo_Upd01_DtlR.$sls_rsn_cd,Slo_BulkImp_Chk01_DtlR.$sls_rsn_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$bd_dpt_cd,Slo_BulkImp_Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$sls_upri_req_typ,Slo_BulkImp_Chk01_DtlR.$sls_upri_req_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_d_rmrks,Slo_BulkImp_Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(Slo_Upd01_DtlR.$intr_rmrks,Slo_BulkImp_Chk01_DtlR.$slo_d_intr_rmrks);
			addColumnPathMap(Slo_Upd01_DtlR.$sub_char1,Slo_BulkImp_Chk01_DtlR.$slo_d_sub_char1);
			addColumnPathMap(Slo_Upd01_DtlR.$sub_char2,Slo_BulkImp_Chk01_DtlR.$slo_d_sub_char2);
			addColumnPathMap(Slo_Upd01_DtlR.$sub_char3,Slo_BulkImp_Chk01_DtlR.$slo_d_sub_char3);
			addColumnPathMap(Slo_Upd01_DtlR.$base_unit_cd,Slo_BulkImp_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$base_unit_qty,Slo_BulkImp_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Slo_Upd01_DtlR.$can_rsn_cd,Slo_BulkImp_Chk01_DtlR.$can_rsn_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$slo_d_can_rmkrs,Slo_BulkImp_Chk01_DtlR.$slo_d_can_rmkrs);
			addColumnPathMap(Slo_Upd01_DtlR.$qtn_d_no,Slo_BulkImp_Chk01_DtlR.$qtn_d_no);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_pr_no,Slo_BulkImp_Chk01_DtlR.$ship_pr_no);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_pr_upd_cntr,Slo_BulkImp_Chk01_DtlR.$ship_pr_upd_cntr);
			addColumnPathMap(Slo_Upd01_DtlR.$not_dt_calc_flg,Slo_BulkImp_Chk01_DtlR.$not_dt_calc_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$peg_no,Slo_BulkImp_Chk01_DtlR.$peg_no);
			addColumnPathMap(Slo_Upd01_DtlR.$hdr_peg_no,Slo_BulkImp_Chk01_DtlR.$hdr_peg_no);
			addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char1,Slo_BulkImp_Chk01_DtlR.$edi_sub_d_char1);
			addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char2,Slo_BulkImp_Chk01_DtlR.$edi_sub_d_char2);
			addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char3,Slo_BulkImp_Chk01_DtlR.$edi_sub_d_char3);
			addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char4,Slo_BulkImp_Chk01_DtlR.$edi_sub_d_char4);
			addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char5,Slo_BulkImp_Chk01_DtlR.$edi_sub_d_char5);
			addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_num1,Slo_BulkImp_Chk01_DtlR.$edi_sub_d_num1);
			addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_dt1,Slo_BulkImp_Chk01_DtlR.$edi_sub_d_dt1);
			addColumnPathMap(Slo_Upd01_DtlR.$sundry_itm_flg,Slo_BulkImp_Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_rqst_tm,Slo_BulkImp_Chk01_DtlR.$ship_rqst_tm);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_rqst_tm,Slo_BulkImp_Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(Slo_Upd01_DtlR.$ship_schd_tm,Slo_BulkImp_Chk01_DtlR.$ship_schd_tm);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_schd_tm,Slo_BulkImp_Chk01_DtlR.$dlv_schd_tm);
			addColumnPathMap(Slo_Upd01_DtlR.$dscnt_itm_flg,Slo_BulkImp_Chk01_DtlR.$dscnt_itm_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$alloc_margin_days,Slo_BulkImp_Chk01_DtlR.$alloc_margin_days);
			addColumnPathMap(Slo_Upd01_DtlR.$stk_mng_typ,Slo_BulkImp_Chk01_DtlR.$stk_mng_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$sls_acxfr_flg,Slo_BulkImp_Chk01_DtlR.$sls_acxfr_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$itm_ship_grp_cd,Slo_BulkImp_Chk01_DtlR.$itm_ship_grp_cd);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_conv_base_qty,Slo_BulkImp_Chk01_DtlR.$trd_unit_conv_base_qty);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_conv_qty,Slo_BulkImp_Chk01_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_dec_place,Slo_BulkImp_Chk01_DtlR.$trd_unit_dec_place);
			addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_rnd_typ,Slo_BulkImp_Chk01_DtlR.$trd_unit_rnd_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$pack_flg,Slo_BulkImp_Chk01_DtlR.$pack_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$base_unit_dec_place,Slo_BulkImp_Chk01_DtlR.$base_unit_dec_place);
			addColumnPathMap(Slo_Upd01_DtlR.$base_unit_rnd_typ,Slo_BulkImp_Chk01_DtlR.$base_unit_rnd_typ);
			addColumnPathMap(Slo_Upd01_DtlR.$dlv_sundry_flg ,Slo_BulkImp_Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$tdlv_sundry_flg,Slo_BulkImp_Chk01_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(Slo_Upd01_DtlR.$rqst_to_wg_cd,Slo_BulkImp_Chk01_DtlR.$rqst_to_wg_cd);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.upd_cntr_not_chk_flg(true);
			
			if (!dest.sundry_itm_flg()) {
				dest.itm_nm(null);
				dest.iv_itm_nm(null);
			}
			if (!dest.dlv_sundry_flg()) {
				dest.dlv_nm(null);
			}
			if (!dest.tdlv_sundry_flg()) {
				dest.tdlv_nm(null);
			}
		}
	}
	
	protected Map_Slo_Del01_HdrR_Slo_BulkImp_Chk02_DtlR<Slo_Del01_HdrR, Slo_BulkImp_Chk02_DtlR> createMap_Slo_Del01_HdrR_Slo_BulkImp_Chk02_DtlR() {
		return new Map_Slo_Del01_HdrR_Slo_BulkImp_Chk02_DtlR<Slo_Del01_HdrR, Slo_BulkImp_Chk02_DtlR>();
	}
	
	public class Map_Slo_Del01_HdrR_Slo_BulkImp_Chk02_DtlR<D extends Slo_Del01_HdrR, S extends Slo_BulkImp_Chk02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Slo_Del01_HdrR.$slo_no, Slo_BulkImp_Chk02_DtlR.$slo_no);
			addColumnPathMap(Slo_Del01_HdrR.$aprv_flg, Slo_BulkImp_Chk02_DtlR.$aprv_flg);
			addColumnPathMap(Slo_Del01_HdrR.$aprv_no, Slo_BulkImp_Chk02_DtlR.$aprv_no);
			addColumnPathMap(Slo_Del01_HdrR.$aprv_sts_typ, Slo_BulkImp_Chk02_DtlR.$aprv_sts_typ);
			addColumnPathMap(Slo_Del01_HdrR.$qtn_no, Slo_BulkImp_Chk02_DtlR.$qtn_no);
			addColumnPathMap(Slo_Del01_HdrR.$qtn_rev, Slo_BulkImp_Chk02_DtlR.$qtn_rev);
			addColumnPathMap(Slo_Del01_HdrR.$sls_dpt_cd, Slo_BulkImp_Chk02_DtlR.$sls_dpt_cd);
			addColumnPathMap(Slo_Del01_HdrR.$slo_upd_cntr, Slo_BulkImp_Chk02_DtlR.$slo_upd_cntr);
			addColumnPathMap(Slo_Del01_HdrR.$qtn_upd_cntr, Slo_BulkImp_Chk02_DtlR.$qtn_upd_cntr);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.upd_cntr_not_chk_flg(true);
		}
	}
	
	protected Map_Slo_Del01_DtlR_MST_SLO_D_R<Slo_Del01_DtlR, MST_SLO_D_R> createMap_Slo_Del01_DtlR_MST_SLO_D_R() {
		return new Map_Slo_Del01_DtlR_MST_SLO_D_R<Slo_Del01_DtlR, MST_SLO_D_R>();
	}
	
	public class Map_Slo_Del01_DtlR_MST_SLO_D_R<D extends Slo_Del01_DtlR, S extends MST_SLO_D_R> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Slo_Del01_DtlR.$disp_seq, MST_SLO_D_R.$disp_seq);
			addColumnPathMap(Slo_Del01_DtlR.$slo_d_no, MST_SLO_D_R.$slo_d_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ship_pr_no(src.getStringNE("ship_pr_no"));
			dest.ship_pr_upd_cntr(src.getNumberNE("ship_pr_upd_cntr"));
			dest.upd_cntr_not_chk_flg(true);
		}
	}

	
	protected MCDate getBaseDate(Slo_Upd01_DtlR dtlR, MAM_LOC_R locR) {
		MCDate baseDt = null;
		MCList<MAM_ITM_DTL_R> tmpItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		
		for (MAM_ITM_DTL_R itmDtlR : object(CLAZZ)._itmDtlL.subList(object(CLAZZ)._itmDtlWgIdxkey, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), locR.wg_cd())) {
			if (isNullOrNullVal(itmDtlR.mfg_loc_cd()) || (!isNullOrNullVal(itmDtlR.mfg_loc_cd()) && !isNullOrNullVal(itmDtlR.getString("loc_sppl_cd")))) {
				tmpItmDtlL.add(itmDtlR);
			}
		}
		
		if (!tmpItmDtlL.isEmpty()) {
			tmpItmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$rqst_loc_cd);
			for (MAM_ITM_DTL_R tmpItmDtlR : tmpItmDtlL) {
				if (!isSame(nvl(tmpItmDtlR.sppl_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())
						|| !isSame(nvl(tmpItmDtlR.getStringNE("loc_sppl_cd"), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
					Slo_Upd01_DtlR cndR = dtlR.clone();
					cndR.sppl_cd(nvl(tmpItmDtlR.getString("loc_sppl_cd"), tmpItmDtlR.sppl_cd()));
					cndR.maker_cd(nvl(tmpItmDtlR.getString("loc_maker_cd"), tmpItmDtlR.maker_cd()));
					cndR.addStringColumn("mfg_loc_cd", tmpItmDtlR.mfg_loc_cd());
					cndR.addStringColumn("bom_ptn", tmpItmDtlR.bom_ptn());

					// 購買ユーティリティで算出した日付で処理
					baseDt = callPurcUtilSrch01(dtlR.ship_schd_tm(), cndR, null, null);
				}
				// 依頼先場所が指定されている場合＝「依頼」
				else if(!isSame(tmpItmDtlR.rqst_loc_cd(), MAC_STR.NULL_VAL.value())) {
					// ＬＴを加味したマスタ参照基準日取得
					MCNumber diffLt = getDiffLT(dtlR, locR, tmpItmDtlR.rqst_loc_cd());
					baseDt = getCalDateLoc(dtlR.ship_schd_tm(), diffLt, false, nvl(dtlR.loc_cd(), dtlR.def_loc_cd()), true);
				}
				
				// 取得した日付が処理対象の品目詳細マスタで適用開始・終了の範囲内ならばその日付を返す
				if (!isNull(baseDt) && tmpItmDtlR.st_dt().lte(baseDt) && tmpItmDtlR.end_dt().gte(baseDt)) {
					break;
				}
				else {
					baseDt = null;
				}
			}
		}
		
		return baseDt;
	}

	protected MCNumber getDiffLT(Slo_Upd01_DtlR dtlR, MAM_LOC_R locR, String rqstLocCd) {

		// 物流制御マスタより移動ＬＴを取得
		MAM_LOC_R rqstLocR = getLoc(rqstLocCd);
		MAM_LG_CTL_R lgCtlR = getLgCtl(rqstLocR.lg_grp_cd(), locR.lg_grp_cd(), nvl(dtlR.ship_term_cd(), MAC_STR.NULL_VAL.value()));		

		return nvl(lgCtlR.xfr_lt(), MCNumber.ZERO).multiply(-1);
	}

	protected FXUCL_MCDbcCache<MAM_LG_CTL_R> _lgCtlR;
	protected static MAM_LG_CTL_R getLgCtl(String fr_lg_grp_cd, String to_lg_grp_cd, String ship_term_cd) {
		return object(CLAZZ)._getLgCtl(fr_lg_grp_cd, to_lg_grp_cd, ship_term_cd);
	} 
	protected MAM_LG_CTL_R _getLgCtl(String fr_lg_grp_cd, String to_lg_grp_cd, String ship_term_cd) {
		if (_lgCtlR == null) {
			MCQueryApiBuilder lgCtlR_bldr = MCQueryApiBuilder.create(MAM_LG_CTL_R.create("T"));
			_lgCtlR = new FXUCL_MCDbcCache<MAM_LG_CTL_R>(lgCtlR_bldr);
		}
		return _lgCtlR.get(fr_lg_grp_cd, to_lg_grp_cd, ship_term_cd);
	}
	//FMCB CUSTOM END
}