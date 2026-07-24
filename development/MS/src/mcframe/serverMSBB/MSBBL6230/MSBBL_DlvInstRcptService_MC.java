package mcframe.serverMSBB.MSBBL6230;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6230.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBA.MSBAL5100.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSUC.MSUCL0080.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.serverMSBB.MSBBL6230.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_DlvInstRcptService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_DlvInstRcptService_MC extends MSBBL_DlvInstRcptService_MC_A{
	//FMCB CUSTOM START

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBBL_DlvInstRcptService> CLAZZ = MSBBL_DlvInstRcptService.class;

	/**
	 * 受注ヘッダのキャッシュ
	 */
	protected MST_SLO_R _cacheSloR = null;

	/**
	 * 受注明細のキャッシュ
	 */
	protected MCList<MST_SLO_D_R> _cacheSloDL = null;

	protected MCIndexKey _sloDKey = null;

	protected MCIndexKey _shipPrKey = null;

	protected MCIndexKey _dlvInstRcptKey = null;

	protected MCList<MST_DLV_INST_RCPT_R> _cacheDlvinstRcptL = null;

	/**
	 * 出荷進捗のキャッシュ
	 */
	protected MCList<MST_SHIP_PR_R> _cacheShipPrL = null;

	/**
	 * 出荷予定のキャッシュ
	 */
	protected MCList<MST_SHIP_SCHD_R> _cacheShipSchdL = null;

	/**
	 * 出荷引当状況のキャッシュ
	 */
	protected MCList<MST_SHIP_ALLOC_STS_R> _cacheShipAlocStsL = null;

	MCList<DlvInstRcv_Upd01_DtlR> _sloGrpL = null;
	MCList<DlvInstRcv_Upd01_DtlR> _sloGrpAllL = null;
	
	protected MCList<MST_SLO_R> _cacheSloL = null;
	
	protected MCIndexKey _sloKey = null;
	
	protected static void initSloCache(MCList<MST_SLO_D_R> sloDL) {
		object(CLAZZ)._initSloCache(sloDL);
	}

	protected static void initSloDCache(MCList<DlvInstRcv_Upd01_DtlR> dtlL) {
		object(CLAZZ)._initSloDCache(dtlL);
	}

	protected static void initShipPrCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		object(CLAZZ)._initShipPrCache(dL);
	}

	protected static void initShipSchdCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		object(CLAZZ)._initShipSchdCache(dL);
	}

	protected static void initShipAlocCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		object(CLAZZ)._initShipAlocCache(dL);
	}

	protected static void initDlvInstReptCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		object(CLAZZ)._initDlvInstReptCache(dL);
	}
	
	/**
	 * 受注引当格付マスタのキャッシュ
	 */
	protected MCList<MAM_SLO_ALLOC_GD_R> _cacheSloAllocGdL = null;

	protected MCIndexKey _sloAllocGdKey = null;
	
	protected static void initSloAllocGdCache(MCList<DlvInstRcv_Upd01_DtlR> dtlL) {
		object(CLAZZ)._initSloAllocGdCache(dtlL);
	}
	
	protected void _initSloAllocGdCache(MCList<DlvInstRcv_Upd01_DtlR> dtlL) {
		
		_cacheSloAllocGdL = MCList.create(MAM_SLO_ALLOC_GD_R.class);
		MAM_SLO_ALLOC_GD_R t = MAM_SLO_ALLOC_GD_R.create("T");
		MCQueryApiBuilder cacheSloAllocGdL_bldr = MCQueryApiBuilder.create(t);
		MST_SLO_R t1 = MST_SLO_R.create("T1");
		MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
		cacheSloAllocGdL_bldr.setSelect(t.cst_cd, t.dlv_cd, t.gd_cd);
		cacheSloAllocGdL_bldr.addInnerJoin(t1, t.cst_cd.eq(t1.cst_cd));
		cacheSloAllocGdL_bldr.addInnerJoin(t2, t1.slo_no.eq(t2.slo_no));
		cacheSloAllocGdL_bldr.setWhere(t2.slo_d_no.eq(bind("slo_d_no")));
		dbSelect("MSBBL6230_MAM_SLO_ALLOC_GD_S01",
				_cacheSloAllocGdL, cacheSloAllocGdL_bldr, dtlL.distinctNE(DlvInstRcv_Upd01_DtlR.$slo_d_no));
		
		_sloAllocGdKey = _cacheSloAllocGdL.createIndex(MAM_SLO_ALLOC_GD_R.$cst_cd, MAM_SLO_ALLOC_GD_R.$dlv_cd, MAM_SLO_ALLOC_GD_R.$gd_cd);
	}
	
	protected static MAM_SLO_ALLOC_GD_R getSloAllocGdCache(String... bind) {
		return object(CLAZZ)._getSloAllocGdCache(bind);
	}
	
	protected MAM_SLO_ALLOC_GD_R _getSloAllocGdCache(String... bind) {
		return _cacheSloAllocGdL.getFirst(_sloAllocGdKey, bind);
	}
	
	/**
	 * 売上予定のキャッシュ
	 */
	protected MCList<MST_SLS_SCHD_R> _cacheSlsSchdL = null;
	
	protected MCIndexKey _slsSchdKey = null;
	
	protected static void initSlsSchdCache(MCList<DlvInstRcv_Upd01_DtlR> dtlL) {
		object(CLAZZ)._initSlsSchdCache(dtlL);
	}
	
	protected void _initSlsSchdCache(MCList<DlvInstRcv_Upd01_DtlR> dtlL) {
		
		_cacheSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
		MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
		MCQueryApiBuilder cacheSlsSchdL_bldr = MCQueryApiBuilder.create(t);
		MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
		cacheSlsSchdL_bldr.setSelect(t.ship_schd_no);
		cacheSlsSchdL_bldr.addInnerJoin(t1, t.slo_d_no.eq(t1.slo_d_no));
		cacheSlsSchdL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
		cacheSlsSchdL_bldr.addWhereWithAnd(t.base_unit_sls_qty.gt(value(0)));
		cacheSlsSchdL_bldr.addWhereWithAnd(t1.sls_cststk_flg.eq(value(true)));
		dbSelect("MSBBL6230_MST_SLS_SCHD_S01",
				_cacheSlsSchdL, cacheSlsSchdL_bldr, dtlL.distinctNE(DlvInstRcv_Upd01_DtlR.$slo_d_no));
		
		_slsSchdKey = _cacheSlsSchdL.createIndex(MST_SLS_SCHD_R.$ship_schd_no);
	}
	
	protected static MST_SLS_SCHD_R getSlsSchdCache(String shipSchdNo) {
		return object(CLAZZ)._getSlsSchdCache(shipSchdNo);
	}
	
	protected MST_SLS_SCHD_R _getSlsSchdCache(String shipSchdNo) {
		return _cacheSlsSchdL.getFirst(_slsSchdKey, shipSchdNo);
	}

	/**
	 * 受注ヘッダコンテナキャッシュを初期化する。
	 * 
	 * @param sloDL キャッシュ条件
	 */
	protected void _initSloCache(MCList<MST_SLO_D_R> sloDL) {
		
		MCGroupByPolicy policy = new MCGroupByPolicy(MST_SLO_D_R.$slo_no);
		
		MCList<MST_SLO_D_R> bindL = sloDL.groupBy(policy);
		
		_cacheSloL = MCList.create(MST_SLO_R.class);
		dbSelectKeyForUpdateNoWait("MSBBL6230_MST_SLO_S01", _cacheSloL,
				MCQueryApiBuilder.create(MST_SLO_R.create("T")), bindL);
		
		_sloKey = _cacheSloL.createIndex(MST_SLO_R.$slo_no);
	}
	
	protected static MCList<MST_SLO_R> getAllSloCache() {
		return object(CLAZZ)._getAllSloCache();
	}	

	protected MCList<MST_SLO_R> _getAllSloCache() {
		
		return _cacheSloL;
	}

	protected void _initSloDCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		_cacheSloDL = srchSloD(dL);
		_sloDKey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
	}
	
	protected static void addSloDCache(String sloDNo) {
		MCList<DlvInstRcv_Upd01_DtlR> bindL = MCList.create(DlvInstRcv_Upd01_DtlR.class);
		DlvInstRcv_Upd01_DtlR bindR = DlvInstRcv_Upd01_DtlR.create();
		bindR.slo_d_no(sloDNo);
		bindL.add(bindR);
		
		object(CLAZZ)._addSloDCache(bindL);
	}
	
	protected void _addSloDCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		_cacheSloDL.addAll(srchSloD(dL));
		_sloDKey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
	}
	
	protected MCList<MST_SLO_D_R> srchSloD(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
		MCGroupByPolicy gp = new MCGroupByPolicy(DlvInstRcv_Upd01_DtlR.$slo_d_no);
		MCList<DlvInstRcv_Upd01_DtlR> bindL = dL.groupBy(gp);

		if (!bindL.isEmpty()) {
			bindL.sort(DlvInstRcv_Upd01_DtlR.$slo_d_no);
			MST_SLO_D_R sloR = MST_SLO_D_R.create("SLOD");
			MCQueryApiBuilder sloDBldr = MCQueryApiBuilder.create(sloR);
			MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
			sloDL.addStringColumn(MAM_ITM_R.$itm_ship_grp_cd);
			sloDBldr.addSelect(itmR.itm_ship_grp_cd);
			sloDBldr.addLeftOuterJoin(itmR,
					sloR.itm_cd.eq(itmR.itm_cd)
					.and(sloR.itm_sub1.eq(itmR.itm_sub1))
					.and(sloR.itm_sub2.eq(itmR.itm_sub2))
					.and(sloR.itm_sub3.eq(itmR.itm_sub3)));
			sloDBldr.setLockTable(sloR.slo_d_no);
			dbSelectKeyForUpdateNoWait("MSBBL6230_MST_SLO_D_S01", sloDL, sloDBldr, bindL);
		}
		return sloDL;
	}

	protected void _initShipPrCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		_cacheShipPrL = srchShipPr(dL);
		_shipPrKey = _cacheShipPrL.createIndex(MST_SHIP_PR_R.$slo_d_no);
	}
	
	protected static void addShipPrCache(String sloDNo) {
		MCList<DlvInstRcv_Upd01_DtlR> bindL = MCList.create(DlvInstRcv_Upd01_DtlR.class);
		DlvInstRcv_Upd01_DtlR bindR = DlvInstRcv_Upd01_DtlR.create();
		bindR.slo_d_no(sloDNo);
		bindL.add(bindR);
		
		object(CLAZZ)._addShipPrCache(bindL);
	}
	
	protected void _addShipPrCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		_cacheShipPrL.addAll(srchShipPr(dL));
		_shipPrKey = _cacheShipPrL.createIndex(MST_SLO_D_R.$slo_d_no);
	}
	
	protected MCList<MST_SHIP_PR_R> srchShipPr(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
		MCGroupByPolicy gp = new MCGroupByPolicy(DlvInstRcv_Upd01_DtlR.$slo_d_no);
		MCList<DlvInstRcv_Upd01_DtlR> bindL = dL.groupBy(gp);

		if (!bindL.isEmpty()) {
			bindL.sort(DlvInstRcv_Upd01_DtlR.$slo_d_no);
			MST_SHIP_PR_R shipPrR = MST_SHIP_PR_R.create("SHIPPR");
			MCQueryApiBuilder shipPrBldr = MCQueryApiBuilder.create(shipPrR);
			shipPrBldr.setWhere(shipPrR.slo_d_no.eq(bind("slo_d_no")));
			dbSelectForUpdateNoWait("MSBBL6230_MST_SHIP_PR_S01", shipPrL, shipPrBldr, bindL);
		}
		return shipPrL;
	}

	protected void _initShipSchdCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		String[] gCols = new String[] {
			DlvInstRcv_Upd01_DtlR.$slo_d_no
		};
		MCGroupByPolicy gp = new MCGroupByPolicy(gCols);
		MCList<DlvInstRcv_Upd01_DtlR> bindL = dL.groupBy(gp);
		if (!bindL.isEmpty()) {
			bindL.sort(DlvInstRcv_Upd01_DtlR.$slo_d_no);
			_cacheShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder cacheShipSchdL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			cacheShipSchdL_bldr.addInnerJoin(t1, bracket(t.ship_pr_no.eq(t1.ship_pr_no)));
			cacheShipSchdL_bldr.setWhere(t1.slo_d_no.eq(bind("slo_d_no")));
			dbSelect("MSBBL6230_MST_SHIP_SCHD_S01", _cacheShipSchdL, cacheShipSchdL_bldr, bindL);
		}
	}

	protected void _initShipAlocCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		String[] gCols = new String[] {
			DlvInstRcv_Upd01_DtlR.$slo_d_no
		};
		MCGroupByPolicy gp = new MCGroupByPolicy(gCols);
		MCList<DlvInstRcv_Upd01_DtlR> bindL = dL.groupBy(gp);
		if (!bindL.isEmpty()) {
			bindL.sort(DlvInstRcv_Upd01_DtlR.$slo_d_no);
			_cacheShipAlocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder cacheShipAlocStsL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			cacheShipAlocStsL_bldr.addInnerJoin(t1, bracket(t.ship_schd_no.eq(t1.ship_schd_no)));
			cacheShipAlocStsL_bldr.addInnerJoin(t2, bracket(t1.ship_pr_no.eq(t2.ship_pr_no)));
			cacheShipAlocStsL_bldr.setWhere(t2.slo_d_no.eq(bind("slo_d_no")));
			dbSelect("MSBBL6230_MST_SHIP_ALLOC_STS_S01", _cacheShipAlocStsL, cacheShipAlocStsL_bldr, bindL);
		}
	}

	protected void _initDlvInstReptCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		MCList<DlvInstRcv_Upd01_DtlR> bindL = MCList.create(DlvInstRcv_Upd01_DtlR.class);
		for (DlvInstRcv_Upd01_DtlR r : dL) {
			if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				bindL.add(r);
			}
		}

		if (!bindL.isEmpty()) {
			bindL.sort(DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_no);
			_cacheDlvinstRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
			dbSelectKeyForUpdateNoWait("MSBBL6230_MST_DLV_INST_RCPT_S01", _cacheDlvinstRcptL,
					MCQueryApiBuilder.create(MST_DLV_INST_RCPT_R.create("T")), bindL);
			_dlvInstRcptKey = _cacheDlvinstRcptL
					.createIndex(MST_DLV_INST_RCPT_R.$dlv_inst_rcpt_no);
		}		
	}

	protected static MST_SLO_R getSloCache(String sloNo) {
		return object(CLAZZ)._getSloCache(sloNo);
	}	

	protected MST_SLO_R _getSloCache(String sloNo) {
		
		_cacheSloR = _cacheSloL.getFirst(_sloKey, sloNo);
		return _cacheSloR;
	}
	
	protected static MCList<MST_SLO_D_R> getSloDCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		return object(CLAZZ)._getSloDCache(dL);
	}
	
	protected MCList<MST_SLO_D_R> _getSloDCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		if (_cacheSloDL == null) {
			initSloDCache(dL);
		}
		return _cacheSloDL;
	}	
	
	protected static MST_SLO_D_R getFirstSloDCache(String sloDNo) {		
		return object(CLAZZ)._getFirstSloDCache(sloDNo);
	}	
	
	protected MST_SLO_D_R _getFirstSloDCache(String sloDNo) {
		MST_SLO_D_R sloDR = _cacheSloDL.getFirst(_sloDKey, sloDNo);
		if (isNull(sloDR)) {
			addSloDCache(sloDNo);
		}
		return _cacheSloDL.getFirst(_sloDKey, sloDNo);
	}
	
	protected static MCList<MST_SHIP_PR_R> getShipPrCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		return object(CLAZZ)._getShipPrCache(dL);
	}

	protected MCList<MST_SHIP_PR_R> _getShipPrCache(MCList<DlvInstRcv_Upd01_DtlR> dL) {
		if (_cacheShipPrL == null) {
			initShipPrCache(dL);
		}
		return _cacheShipPrL;
	}

	protected static MST_SHIP_PR_R getFirstShipPrCache(String sloDNo) {
		return object(CLAZZ)._getFirstShipPrCache(sloDNo);
	}

	protected MST_SHIP_PR_R _getFirstShipPrCache(String sloDNo) {
		MST_SHIP_PR_R shipPrR = _cacheShipPrL.getFirst(_shipPrKey, sloDNo);
		if (isNull(shipPrR)) {
			addShipPrCache(sloDNo);
		}		return _cacheShipPrL.getFirst(_shipPrKey, sloDNo);
	}	
	
	protected static MCList<MST_SHIP_SCHD_R> getShipSchdCache(
			MCList<DlvInstRcv_Upd01_DtlR> dL) {
		return object(CLAZZ)._getShipSchdCache(dL);
	}

	protected MCList<MST_SHIP_SCHD_R> _getShipSchdCache(
			MCList<DlvInstRcv_Upd01_DtlR> dL) {
		if (_cacheShipAlocStsL == null) {
			initShipSchdCache(dL);
		}
		return _cacheShipSchdL;
	}
	
	protected static MCList<MST_SHIP_ALLOC_STS_R> getShipAlocCache(
			MCList<DlvInstRcv_Upd01_DtlR> dL) {
		return object(CLAZZ)._getShipAlocCache(dL);
	}

	protected MCList<MST_SHIP_ALLOC_STS_R> _getShipAlocCache(
			MCList<DlvInstRcv_Upd01_DtlR> dL) {
		if (_cacheShipAlocStsL == null) {
			initShipAlocCache(dL);
		}
		return _cacheShipAlocStsL;
	}
	

	protected static MCList<MST_DLV_INST_RCPT_R> getDlvInstReptCache(
			MCList<DlvInstRcv_Upd01_DtlR> dL) {
		return object(CLAZZ)._getDlvInstReptCache(dL);
	}
	
	protected MCList<MST_DLV_INST_RCPT_R> _getDlvInstReptCache(
			MCList<DlvInstRcv_Upd01_DtlR> dL) {
		if (_cacheDlvinstRcptL == null) {
			initDlvInstReptCache(dL);
		}
		return _cacheDlvinstRcptL;
	}


	/**
	 * DlvInstRcv_Chk01オペレーション.<p>
	 *
	 * 登録前のチェック処理、項目値の補完<br>
	 */
	public class DlvInstRcv_Chk01 extends MSBBL_DlvInstRcptService_MC_A.DlvInstRcv_Chk01 {
		
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

			setDown();
		}		

		protected void beforeProc(MCList<DlvInstRcv_Upd01_DtlR> dL) {
			String[] gCols = new String[] {
				DlvInstRcv_Upd01_DtlR.$slo_d_no
			};
			MCGroupByPolicy gp = new MCGroupByPolicy(gCols);
			_sloGrpL = dL.groupBy(gp);		
		}
		
		@Override
		protected MCMessageList updCntChkReq() {
			
			MCMessageList msgList = super.updCntChkReq();
			
			for (DlvInstRcv_Upd01_DtlR dlvInstRcvR : up0()) {
					
				msgList.addAll(check(dlvInstRcvR, DlvInstRcv_Upd01_DtlR.$slo_d_no, new FXUCL_RequiredValidater()));
			}
			
			return msgList;
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			initSloDCache(up0());
			initShipPrCache(up0());
			initShipSchdCache(up0());
			initShipAlocCache(up0());
			initDlvInstReptCache(up0());
			initSloAllocGdCache(up0()); 
			
			_cacheSloDL = getSloDCache(up0());
			_cacheShipPrL = getShipPrCache(up0());
			_cacheShipSchdL = getShipSchdCache(up0());	
			_cacheShipAlocStsL = getShipAlocCache(up0());
			_cacheDlvinstRcptL = getDlvInstReptCache(up0());
			if(!isNull(_cacheDlvinstRcptL)) {
				_dlvInstRcptKey = _cacheDlvinstRcptL.createIndex(MST_DLV_INST_RCPT_R.$dlv_inst_rcpt_no);
			}
			//受注ヘッダのロック、更新カウンタチェック、空更新
			if (!_cacheSloDL.isEmpty()) {
				
				initSloCache(_cacheSloDL);
				
				crretSlo();
				
				msgL.addAll(chkSlo());
			}
				
			//出荷進捗の排他処理を行う。
			msgL.addAll(chkShipPr());
			
			if (isNull(getChkList(up0()))) {
				_updCntrErr = true;
			}
			
			msgL.addAll(chkDptDac());
			
			//明細の項目値の補完
			crretDtl();
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			
			if (_updCntrErr) {
				return null;
			}
			
			MCMessageList msgList = super.doServerCheck();
			
			MCList<DlvInstRcv_Upd01_DtlR> notErrL = getChkList(up0());
			
			for (DlvInstRcv_Upd01_DtlR dlvInstRcvR : notErrL) {
				
				if (MAC_DATA_CRUD_TYP.isUPD(dlvInstRcvR.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isDEL(dlvInstRcvR.data_crud_typ())) {
					
					msgList.addAll(check(dlvInstRcvR, DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_no, new FXUCL_RequiredValidater()));
				}
				
				if(MAC_DATA_CRUD_TYP.isCRT(dlvInstRcvR.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isUPD(dlvInstRcvR.data_crud_typ())) {
					
					msgList.addAll(check(dlvInstRcvR, DlvInstRcv_Upd01_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
					msgList.addAll(check(dlvInstRcvR, DlvInstRcv_Upd01_DtlR.$dlv_rqst_tm, new FXUCL_RequiredValidater()));
					
					if (!isNull(dlvInstRcvR.dlv_cd()) && dlvInstRcvR.dlv_sundry_flg()){
						msgList.addAll(check(dlvInstRcvR, DlvInstRcv_Upd01_DtlR.$dlv_nm, new FXUCL_RequiredValidater()));
					}
					
					if (!isNull(dlvInstRcvR.tdlv_cd()) && dlvInstRcvR.tdlv_sundry_flg()){
						msgList.addAll(check(dlvInstRcvR, DlvInstRcv_Upd01_DtlR.$tdlv_nm, new FXUCL_RequiredValidater()));
					}
				}
			}
			
			return msgList;
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

			beforeProc(up0());
			
			msgL.addAll(chkIvNo());
			
			MCIndexKey shipSchdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no, MST_SHIP_SCHD_R.$re_ship_schd_flg);
			MCIndexKey shipSchdDlvInstRcptNoIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			MCIndexKey idxkey = up0().createIndex(DlvInstRcv_Upd01_DtlR.$slo_d_no, DlvInstRcv_Upd01_DtlR.$data_crud_typ);
			
			//出荷残数チェック
			//新規行 or 更新行の受注明細毎の納入指示数量合計　＞　未出荷（指図）数の場合、エラーとする。
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpL) {
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(grpR.slo_d_no());				
				//キャッシュから対応する更新前の出荷進捗を取得する。
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(grpR.slo_d_no());
				
				if (isNull(oldSloDR) || isNull(oldShipPrR)) {
					break;
				}
				
				//キャッシュから対応する更新前の出荷予定を取得する。
				MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(shipSchdIdxkey, oldShipPrR.ship_pr_no(), false);
				
				//受注明細毎の納入指示数量合計の算出
				MCList<DlvInstRcv_Upd01_DtlR> subDtl = MCList.create(DlvInstRcv_Upd01_DtlR.class);
				
				subDtl.addAll(up0().subList(idxkey, new Comparable<?>[] {grpR.slo_d_no(), MAC_DATA_CRUD_TYP.CRT.value()}));
				subDtl.addAll(up0().subList(idxkey, new Comparable<?>[] {grpR.slo_d_no(), MAC_DATA_CRUD_TYP.UPD.value()}));
				subDtl.addAll(up0().subList(idxkey, new Comparable<?>[] {grpR.slo_d_no(), null}));
				
				MCNumber dlvInspQtySum = subDtl.sum(DlvInstRcv_Upd01_DtlR.$trd_unit_qty);
						
				if (!isNull(dlvInspQtySum) && dlvInspQtySum.gt(oldSloDR.trd_unit_qty())) {
					// 納入指示受領の合計数量が受注明細数量を超える場合、チェックエラーにする。
					msgL.add(new MCMessage(subDtl.get(0), null, MSBBL0278, dlvInspQtySum, oldSloDR.trd_unit_qty()));
					continue;
				}
				
				MCNumber dlvInspQty = MCNumber.ZERO;
				
				MCList<DlvInstRcv_Upd01_DtlR> notErrL = getChkList(subDtl);
				
				MCIndexKey oldShipSchdIdxkey = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
				
				for (DlvInstRcv_Upd01_DtlR subR : notErrL) {
					
					if (MAC_DATA_CRUD_TYP.isCRT(subR.data_crud_typ())) {
						dlvInspQty = dlvInspQty.add(subR.base_unit_qty());
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(subR.data_crud_typ()) || isNull(subR.data_crud_typ())) {
						
						MCList<MST_SHIP_SCHD_R> oldDlvInstReptShipSchdL = oldShipSchdL.subList(oldShipSchdIdxkey, subR.dlv_inst_rcpt_no());
						
						boolean afterExeFlg = false;
						for (MST_SHIP_SCHD_R oldDlvInstReptShipSchdR : oldDlvInstReptShipSchdL) {
							
							if (oldDlvInstReptShipSchdR.ship_inst_qty().isPositive() || 
									oldDlvInstReptShipSchdR.ship_act_qty().isPositive() || 
									oldDlvInstReptShipSchdR.iv_schd_qty().isPositive() || 
									oldDlvInstReptShipSchdR.abort_flg()) {
								afterExeFlg = true;
							}
						}
						
						if (!afterExeFlg) {
							dlvInspQty = dlvInspQty.add(subR.base_unit_qty());
						}
					}
				}
				
				//未出荷（指図）数の算出

				MCNumber baseQty = oldShipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty);
				MCNumber notActQyt = MCNumber.ZERO;
				MCNumber instQty = MCNumber.ZERO;
				MCNumber instActQty = MCNumber.ZERO;
				MCNumber slsQty = MCNumber.ZERO;
				MCNumber ivSchdQty = MCNumber.ZERO;
				MCNumber abortQty = MCNumber.ZERO;

				MCList<MST_SHIP_SCHD_R> shipSchdLNullL = oldShipSchdL.subList(r -> isNull(r.dlv_inst_rcpt_no()));
				MCList<MST_SHIP_SCHD_R> shipSchdLNotNullL = oldShipSchdL.subList(r -> !isNull(r.dlv_inst_rcpt_no()));
				for (MCList<MST_SHIP_SCHD_R> shipSchdL : shipSchdLNotNullL.groupList(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no)) {
					if (shipSchdL.subList(r -> r.abort_qty().isPositive()).size() > 0) {
						abortQty = abortQty.add(shipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty));
					}
					if (shipSchdL.subList(r -> r.ship_inst_qty().isPositive()).size() > 0) {
						instQty = instQty.add(shipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty));
					}
					if (shipSchdL.subList(r -> r.ship_act_qty().isPositive()).size() > 0) {
						instActQty = instActQty.add(shipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty));
					}
					if (shipSchdL.subList(r -> r.sls_qty().isPositive()).size() > 0) {
						slsQty = slsQty.add(shipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty));
					}
					if (shipSchdL.subList(r -> r.iv_schd_qty().isPositive()).size() > 0) {
						ivSchdQty = ivSchdQty.add(shipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty));
					}
				}
				for (MST_SHIP_SCHD_R shipSchdR : shipSchdLNullL) {
					if (shipSchdR.abort_qty().isPositive()) {
						abortQty = abortQty.add(shipSchdR.base_unit_qty());
					}
					if (shipSchdR.ship_inst_qty().isPositive()) {
						instQty = instQty.add(shipSchdR.base_unit_qty());
					}
					if (shipSchdR.ship_act_qty().isPositive()) {
						instActQty = instActQty.add(shipSchdR.base_unit_qty());
					}
					if (shipSchdR.sls_qty().isPositive()) {
						slsQty = slsQty.add(shipSchdR.base_unit_qty());
					}
					if (shipSchdR.iv_schd_qty().isPositive()) {
						ivSchdQty = ivSchdQty.add(shipSchdR.base_unit_qty());
					}
				}
				if (isNull(instQty)){
					instQty = MCNumber.ZERO;
				}
				if (isNull(instActQty)){
					instActQty = MCNumber.ZERO;
				}
				if (isNull(slsQty)){
					slsQty = MCNumber.ZERO;
				}
				if (isNull(baseQty)){
					baseQty = MCNumber.ZERO;
				}
				if (isNull(ivSchdQty)){
					ivSchdQty = MCNumber.ZERO;
				}
				if (instQty.gt(0)) {
					notActQyt = baseQty.subtract(instQty);
				}
				else if (instActQty.gt(0)) {
					notActQyt = baseQty.subtract(instActQty);
				}
				else if (slsQty.gt(0) && (instQty.gt(0) || instActQty.gt(0))) {
					notActQyt = baseQty.subtract(slsQty);
				}
				else {
					notActQyt = baseQty;
				}
				if (abortQty.gt(0)) {
					notActQyt = notActQyt.subtract(abortQty);
				}
				if ((instQty.isPositive() || instActQty.isPositive() || slsQty.isPositive()) && dlvInspQty.gt(notActQyt)) {
					
					if (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())) {
						msgL.add(new MCMessage(notErrL.get(0), null, MSBBL0102, grpR.slo_d_no(), dlvInspQty, notActQyt, toDispGUIIndex(grpR)));
					}
				}
				//受注明細打切った場合登録不可のチェック
				MCList<DlvInstRcv_Upd01_DtlR> subDtlAll = MCList.create(DlvInstRcv_Upd01_DtlR.class);
				
				subDtlAll.addAll(up0().subList(idxkey, new Comparable<?>[] {grpR.slo_d_no(), MAC_DATA_CRUD_TYP.CRT.value()}));
				subDtlAll.addAll(up0().subList(idxkey, new Comparable<?>[] {grpR.slo_d_no(), MAC_DATA_CRUD_TYP.UPD.value()}));
				subDtlAll.addAll(up0().subList(idxkey, new Comparable<?>[] {grpR.slo_d_no(), MAC_DATA_CRUD_TYP.DEL.value()}));
				
				MCList<DlvInstRcv_Upd01_DtlR> notErrAllL = getChkList(subDtlAll);
				if (!notErrAllL.isEmpty()) {
					if (oldSloDR.abort_flg()) {
						msgL.add(new MCMessage(notErrAllL.get(0), null, MSBBL0104,
								toDispGUIIndex(grpR)));
					}
					else {
						boolean isAll = true;
						for (MST_SHIP_SCHD_R shipSchdR : oldShipSchdL) {
							if (!shipSchdR.abort_flg()) {
								isAll = false;
								break;
							}
						}
						
						//出荷予定全数打切った場合登録不可のチェック
						if (isAll && !oldShipSchdL.isEmpty()) {
							msgL.add(new MCMessage(notErrAllL.get(0), null, MSBBL0104,
									toDispGUIIndex(grpR)));
						}
							
						//出荷予定一部打切った場合納入指示数チェック
						if (instQty.isZero() && instActQty.isZero() && slsQty.isZero() && !isAll && !oldShipSchdL.isEmpty()) {
							//受注明細対応する出荷予定が一部打切った状態で、納入指示数が未打切数を超える場合はエラーとする。
							if (dlvInspQty.gt(notActQyt)) {
								msgL.add(new MCMessage(notErrAllL.get(0), null, MSBBL0105,
										toDispGUIIndex(grpR)));
							}
						}
					}
					//仕入直送で売上計上済みの場合登録不可のチェック
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())) {
						if (isSame(baseQty, slsQty.add(abortQty))) {
							msgL.add(new MCMessage(notErrAllL.get(0), null, MSBBL0106,
									toDispGUIIndex(grpR)));
						}
					}
				}
				if (ivSchdQty.isPositive() && dlvInspQty.gt(baseQty.subtract(ivSchdQty))) {
					msgL.add(new MCMessage(notErrL.get(0), null, MSBBL0206,
							toDispGUIIndex(grpR)));
				}
				
				msgL.addAll(chkShipSchdFix(oldShipSchdL, notErrL));
				
				msgL.addAll(chkShipToLgGrpChng(notErrL, oldSloDR));
				
				msgL.addAll(chkSloAllocGd(notErrL, oldSloDR));
			}
			
			MCList<DlvInstRcv_Upd01_DtlR> notErrL = getChkList(up0());
			
			//出荷済チェック
			for (DlvInstRcv_Upd01_DtlR dtlR : notErrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					//納入指示受領により作成された出荷予定は一部出荷指示または出荷実績が登録された場合、納入指示受領の変更は不可とする。
					//キャッシュから対応する更新前の出荷予定を取得する。
					MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL
							.subList(shipSchdDlvInstRcptNoIdxkey,
									dtlR.dlv_inst_rcpt_no());
					if (oldShipSchdL.isEmpty()){
						continue;
					}
					MCNumber baseQty = oldShipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty);
					MCNumber instQty = oldShipSchdL.sum(MST_SHIP_SCHD_R.$ship_inst_qty);
					MCNumber instActQty = oldShipSchdL.sum(MST_SHIP_SCHD_R.$ship_act_qty);
					MCNumber slsQty = oldShipSchdL.sum(MST_SHIP_SCHD_R.$sls_qty);
					MCNumber ivSchdQty = oldShipSchdL.sum(MST_SHIP_SCHD_R.$iv_schd_qty);
					MCNumber compQty = MCNumber.ZERO;
					if (isNull(baseQty)){
						baseQty = MCNumber.ZERO;
					}
					if (isNull(instQty)){
						instQty = MCNumber.ZERO;
					}
					if (isNull(instActQty)){
						instActQty = MCNumber.ZERO;
					}
					if (isNull(slsQty)){
						slsQty = MCNumber.ZERO;
					}
					if (!instQty.isZero()) {
						compQty = instQty;
					}
					else if (!instActQty.isZero()) {
						compQty = instActQty;
					}
					else if (!slsQty.isZero() && (instQty.gt(0) || instActQty.gt(0))) {
						compQty = slsQty;
					}
					
					// 納入指示受領に紐付く出荷予定が確定済みの場合数量・納入希望日時訂正不可とする。
					MCIndexKey oldShipSchdIdxkey = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$fix_flg);
					if (oldShipSchdL.contains(oldShipSchdIdxkey, true)) {
						
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							
							msgL.add(new MCMessage(dtlR, null, MSBBL0216,
									toDispGUIIndex(dtlR)));
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							
							MST_DLV_INST_RCPT_R oldDlvInstrcptR = _cacheDlvinstRcptL
									.getFirst(_dlvInstRcptKey, dtlR.dlv_inst_rcpt_no());
							
							if (!isSame(oldDlvInstrcptR.trd_unit_qty(), dtlR.trd_unit_qty())) {
								
								msgL.add(new MCMessage(dtlR, DlvInstRcv_Upd01_DtlR.$trd_unit_qty, MSBBL0217,
										toDispGUIIndex(dtlR)));
							}
							if (!isSame(oldDlvInstrcptR.dlv_rqst_tm(), dtlR.dlv_rqst_tm())) {
								
								msgL.add(new MCMessage(dtlR, DlvInstRcv_Upd01_DtlR.$dlv_rqst_tm, MSBBL0218,
										toDispGUIIndex(dtlR)));
							}
						}
					}
					
					// 納入指示受領に紐付く出荷予定が打切された場合、数量・納入希望日時訂正不可とする。
					MCIndexKey abortIdxkey = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$abort_flg);
					if (oldShipSchdL.contains(abortIdxkey, true)) {
						
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							
							msgL.add(new MCMessage(dtlR, null, MSBBL0275,
									toDispGUIIndex(dtlR)));
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							
							MST_DLV_INST_RCPT_R oldDlvInstrcptR = _cacheDlvinstRcptL
									.getFirst(_dlvInstRcptKey, dtlR.dlv_inst_rcpt_no());
							
							if (!isSame(oldDlvInstrcptR.trd_unit_qty(), dtlR.trd_unit_qty())) {
								
								msgL.add(new MCMessage(dtlR, DlvInstRcv_Upd01_DtlR.$trd_unit_qty, MSBBL0276,
										toDispGUIIndex(dtlR)));
							}
							if (!isSame(oldDlvInstrcptR.dlv_rqst_tm(), dtlR.dlv_rqst_tm())) {
								
								msgL.add(new MCMessage(dtlR, DlvInstRcv_Upd01_DtlR.$dlv_rqst_tm, MSBBL0277,
										toDispGUIIndex(dtlR)));
							}
						}
					}
					if (ivSchdQty.gt(0)) {
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							msgL.add(new MCMessage(dtlR, null, MSBBL0640,
									toDispGUIIndex(dtlR)));
						}
					}
					if (compQty.gt(MCNumber.ZERO)) {
						msgL.add(new MCMessage(dtlR, null, MSBBL0103,
								toDispGUIIndex(dtlR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 部門更新権限のチェック
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkDptDac() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<DlvInstRcv_Upd01_DtlR> notErrL = getChkList(up0());

			for (DlvInstRcv_Upd01_DtlR notErrR : notErrL) {
				if (!notErrR.is_src_batch_flg()) {
					MCMessageList l = checkWritableDptCdDac(notErrR,  DlvInstRcv_Upd01_DtlR.$sls_dpt_cd);
					if (!l.isEmpty()) {
						msgL.addAll(l);
					}
					msgL.addAll(l);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 受注時に、インボイスＮＯが指定されたかチェックする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkIvNo() {

			MCMessageList msgL = new MCMessageList();
			
			MCList<DlvInstRcv_Upd01_DtlR> notErrL = getChkList(up0());

			for (DlvInstRcv_Upd01_DtlR notErrR : notErrL) {
				
				MST_SLO_R sloR = getSloCache(notErrR.slo_no());
				
				if (!isNull(sloR) && !isNull(sloR.iv_no())) {
					
					msgL.add(new MCMessage(notErrR, null, MSBBL0228));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 引当解除可能な出荷予定が確定されているかどうか。
		 * @param oldShipSchdL 更新前出荷予定
		 * @param dlvInstRcvDtlL 納入指示受領リスト
		 * @return 確定されている場合はtrue
		 */
		protected MCMessageList chkShipSchdFix(MCList<MST_SHIP_SCHD_R> oldShipSchdL, MCList<DlvInstRcv_Upd01_DtlR> dlvInstRcvDtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey = oldShipSchdL.createIndex(
					MST_SHIP_SCHD_R.$re_ship_schd_flg,
					MST_SHIP_SCHD_R.$abort_flg, 
					MST_SHIP_SCHD_R.$ship_inst_qty,
					MST_SHIP_SCHD_R.$ship_act_qty,
					MST_SHIP_SCHD_R.$iv_schd_qty);
			
			MCIndexKey oldShipSchdIdxkey = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			
			Comparable<?>[] vals = new Comparable<?>[] {false, false, MCNumber.ZERO, MCNumber.ZERO, MCNumber.ZERO};
			// 引当解除可能な数量
			MCList<MST_SHIP_SCHD_R> relAblShipSchdL = oldShipSchdL.subList(idxkey, vals);
			
			MCNumber dlvInspQty = MCNumber.ZERO;
			for (DlvInstRcv_Upd01_DtlR dlvInstRcvR : dlvInstRcvDtlL) {
				
				if (MAC_DATA_CRUD_TYP.isCRT(dlvInstRcvR.data_crud_typ())) {
					dlvInspQty = dlvInspQty.add(dlvInstRcvR.base_unit_qty());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(dlvInstRcvR.data_crud_typ()) || isNull(dlvInstRcvR.data_crud_typ())) {
					
					MCList<MST_SHIP_SCHD_R> oldDlvInstReptShipSchdL = oldShipSchdL.subList(oldShipSchdIdxkey, dlvInstRcvR.dlv_inst_rcpt_no());
					
					boolean afterExeFlg = false;
					for (MST_SHIP_SCHD_R oldDlvInstReptShipSchdR : oldDlvInstReptShipSchdL) {
						
						if (oldDlvInstReptShipSchdR.ship_inst_qty().isPositive() || 
								oldDlvInstReptShipSchdR.ship_act_qty().isPositive() || 
								oldDlvInstReptShipSchdR.iv_schd_qty().isPositive() || 
								oldDlvInstReptShipSchdR.abort_qty().isPositive() || 
								oldDlvInstReptShipSchdR.fix_flg()) {
							
							afterExeFlg = true;
						}
					}
					
					if (!afterExeFlg) {
						dlvInspQty = dlvInspQty.add(dlvInstRcvR.base_unit_qty());
					}
				}
			}
			
			MCIndexKey fixIdxkey = relAblShipSchdL.createIndex(MST_SHIP_SCHD_R.$fix_flg);
			MCIndexKey fixNoInsttIdxkey = relAblShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no, MST_SHIP_SCHD_R.$fix_flg);
			if (dlvInspQty.isPositive() 
					&& dlvInspQty.gt(nvl(relAblShipSchdL.subList(fixIdxkey, false).sum(MST_SHIP_SCHD_R.$base_unit_qty), MCNumber.ZERO)) 
					&& relAblShipSchdL.contains(fixNoInsttIdxkey, null, true)) {
				msgL.add(new MCMessage(dlvInstRcvDtlL.get(0), null, MSBBL0220));
			}
			
			return msgL;
		}

		/**
		 * 受注ヘッダのロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkSlo() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<DlvInstRcv_Upd01_DtlR> notErrL = getChkList(up0());
			
			for (DlvInstRcv_Upd01_DtlR notErrR : notErrL) {
				
				MST_SLO_R sloR = getSloCache(notErrR.slo_no());
				
				//更新カウンタチェック
				MCMessageList l = checkUpdCntrNE(notErrR, DlvInstRcv_Upd01_DtlR.$slo_upd_cntr, sloR);
				if(!l.isEmpty()) {
					msgL.addAll(l);
				}
			}
			
			return msgL;
		}

		/**
		 * 出荷進捗のロック、更新カウンタチェック
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkShipPr() {
			MCMessageList msgL = new MCMessageList();

			MCList<DlvInstRcv_Upd01_DtlR> notErrL = getChkList(up0());
			
			for (DlvInstRcv_Upd01_DtlR notErrR : notErrL) {
				MST_SHIP_PR_R spR = getFirstShipPrCache(notErrR.slo_d_no());
				
				MCMessageList l = checkUpdCntrNE(notErrR, DlvInstRcv_Upd01_DtlR.$ship_pr_upd_cntr,
						spR);
				if(!l.isEmpty()) {
					msgL.addAll(l);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 納入指示受領の納品先、配送先が変更された場合、物流Ｇから出荷可能かチェックする。
		 * @param notErrL 納入指示受領リスト
		 * @param sloDR 受注明細
		 * @return  エラーメッセージ
		 */
		protected MCMessageList chkShipToLgGrpChng(MCList<DlvInstRcv_Upd01_DtlR> notErrL, MST_SLO_D_R sloDR) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<DlvInstRcv_Upd01_DtlR> chkL = MCList.create(DlvInstRcv_Upd01_DtlR.class);
			
			for (DlvInstRcv_Upd01_DtlR r : notErrL) {
				if (needChkShipToLgGrpChng(r, sloDR)) {
					chkL.add(r);
				}
			}
			
			if (!chkL.isEmpty()) {
				
				MST_SLO_R sloR = getSloCache(sloDR.slo_no());
				String strWgCd = sloR.wg_cd();
				MSUCL_SlsUtil.SrchSloAlloc srchSloAlloc = MSUCL_SlsUtil.crtSrchSloAlloc(strWgCd);
				for (DlvInstRcv_Upd01_DtlR r : chkL) {
					
					String strLgGrpCd;
					if (!isNull(r.tdlv_cd())) {
						strLgGrpCd = r.tdlv_lg_grp_cd();
					}
					else {
						strLgGrpCd = r.dlv_lg_grp_cd();
					}
					MCRow bindMsg = MCRow.create();
					MAM_SLO_ALLOC_R allInfR = srchSloAlloc.getSloAllocR(sloDR, strWgCd, strLgGrpCd, bindMsg);
					if (isNull(allInfR)) {
						msgL.add(new MCMessage(r, null, MSBBL0172, strLgGrpCd, sloDR.getStringNE("itm_ship_grp_cd"), strWgCd,
								bindMsg.getStringNE("loc_cd"),
								bindMsg.getStringNE("lg_grp_cd"),
								bindMsg.getStringNE("alloc_grp_cd"),
								toDispGUIIndex(r)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 物流Ｇのチェックを行う必要があるかを判定する。
		 * @param dtlR 納入指示受領
		 * @param sloDR 受注明細
		 * @return 納入指示受領の送付先物流Ｇと受注時の送付先物流Ｇが違う場合はtrue、ただし仕入直送の場合は常にfalse
		 */
		protected boolean needChkShipToLgGrpChng(DlvInstRcv_Upd01_DtlR dtlR, MST_SLO_D_R sloDR) {
			
			String sloLgGrpCd = nvl(sloDR.tdlv_lg_grp_cd(), sloDR.dlv_lg_grp_cd());
			String shipSchdLgGrpCd = nvl(dtlR.tdlv_lg_grp_cd(), dtlR.dlv_lg_grp_cd());
			
			if (!MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ())
					&& !isNull(shipSchdLgGrpCd)
					&& !isSame(sloLgGrpCd, shipSchdLgGrpCd)) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 受注引当マスタを取得する。
		 * @param sloR 受注ヘッダ
		 * @param sloDR 受注明細
		 * @return 受注引当マスタ
		 */
		protected MCList<MAM_SLO_ALLOC_R> getSloAlloc(MST_SLO_R sloR, MST_SLO_D_R sloDR) {
			
			MCList<MAM_SLO_ALLOC_R> sloAllocL = MCList.create(MAM_SLO_ALLOC_R.class);
			MAM_SLO_ALLOC_R t = MAM_SLO_ALLOC_R.create("T");
			MCQueryApiBuilder sloAllocL_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			
			sloAllocL.addStringColumn("loc_lg_grp_cd");
			
			sloAllocL_bldr.setSelect(t.to_lg_grp_cd, t.lg_grp_cd);
			sloAllocL_bldr.addSelect(m1.lg_grp_cd.as("loc_lg_grp_cd"));
			
			sloAllocL_bldr.setWhere(t.wg_cd.eq(bind("1")), sloR.wg_cd());
			sloAllocL_bldr.addWhereWithAnd(
					bracket(t.itm_ship_grp_cd.eq(bind("1"))
							.or(t.itm_ship_grp_cd.eq(bind("2")))),
					sloDR.getStringNE(MAM_ITM_R.$itm_ship_grp_cd),
					MAC_STR.NULL_VAL.value());
			
			sloAllocL_bldr.addLeftOuterJoin(m1, t.loc_cd.eq(m1.loc_cd));
			
			dbSelect("MSBBL6230_MAM_SLO_ALLOC_S01", sloAllocL, sloAllocL_bldr);
			
			return sloAllocL;
		}
		
		/**
		 * 変更後の物流Ｇへ出荷可能かを判定する。
		 * @param dtlR 納入指示受領
		 * @param sloAllocL 受注引当マスタ
		 * @param sloDR 受注明細
		 * @return  出荷可能の場合はtrue
		 */
		protected boolean shippableToNewLgGrp(DlvInstRcv_Upd01_DtlR dtlR, MCList<MAM_SLO_ALLOC_R> sloAllocL, MST_SLO_D_R sloDR) {
			
			String shipToLgGrpCd = nvl(dtlR.tdlv_lg_grp_cd(), dtlR.dlv_lg_grp_cd());
			
			MCList<MAM_SLO_ALLOC_R> subL = sloAllocL.subList(r -> (
					(isSame(r.to_lg_grp_cd(), shipToLgGrpCd) || MAC_STR.isNULL_VAL(r.to_lg_grp_cd())))
					&& (isSame(r.lg_grp_cd(), getShipFrLgGrpCd(sloDR))
							|| isSame(r.getStringNE("loc_lg_grp_cd"), getShipFrLgGrpCd(sloDR))
							|| (!isNull(r.lg_grp_cd()) && !isNull(r.alloc_grp_cd()))));
			
			if (!subL.isEmpty()) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 出荷元物流Ｇを取得する。
		 * @param sloDR 受注明細
		 * @return 出荷元物流Ｇ
		 */
		protected String getShipFrLgGrpCd(MST_SLO_D_R sloDR){
			
			return nvl(sloDR.ship_lg_grp_cd(), getLoc(nvl(sloDR.loc_cd(), sloDR.def_loc_cd())).lg_grp_cd());
		}
		
		protected MCMessageList chkSloAllocGd(MCList<DlvInstRcv_Upd01_DtlR> notErrL, MST_SLO_D_R sloDR) {
			
			MCMessageList msgL = new MCMessageList();
			
			MST_SLO_R sloR = getSloCache(sloDR.slo_no());
			
			for (DlvInstRcv_Upd01_DtlR r : notErrL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || isNull(sloDR.gd_cd())) {
					continue;
				}
				
				if (!isNull(r.dlv_cd()) 
						&& !isSame(r.dlv_cd(), sloDR.dlv_cd())
						&& (isNull(getSloAllocGdCache(sloR.cst_cd(), MAC_STR.NULL_VAL.value(), sloDR.gd_cd()))
						&& isNull(getSloAllocGdCache(sloR.cst_cd(), r.dlv_cd(), sloDR.gd_cd())))
						&& (!isNull(getSloAllocGdCache(sloR.cst_cd(), MAC_STR.NULL_VAL.value()))
								|| !isNull(getSloAllocGdCache(sloR.cst_cd(), r.dlv_cd())))) {
					msgL.add(new MCMessage(r, DlvInstRcv_Upd01_DtlR.$dlv_cd, MSBBL0403, sloR.cst_cd(), r.dlv_cd(), sloDR.gd_cd(), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 受注NOを補完する。
		 */
		protected void crretSlo() {
			
			//明細の項目値の補完
			for (DlvInstRcv_Upd01_DtlR dtlR : up0()) {
				
				MST_SLO_D_R sloDR = getFirstSloDCache(dtlR.slo_d_no());
				
				MST_SLO_R sloR = getSloCache(sloDR.slo_no());
				
				dtlR.slo_no(sloDR.slo_no());
				dtlR.sls_dpt_cd(sloR.sls_dpt_cd());
			}
		}

		/**
		 * 明細の項目値の補完
		 * @return
		 */
		protected void crretDtl() {
			
			MCList<DlvInstRcv_Upd01_DtlR> notErrL = getChkList(up0());
			
			MCList<MAM_ITM_R> errItmL = MCList.create(MAM_ITM_R.class);
			
			MAM_ITM_R itmR = null;
			MAVM_ITM_UNIT_R itmUnitR = null;
			
			createCacheBp(getBindBpL(notErrL));
			
			//明細の項目値の補完
			for (DlvInstRcv_Upd01_DtlR dtlR : notErrL) {
				
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
				//取引単位ＣＤ
				dtlR.trd_unit_cd(oldSloDR.trd_unit_cd());
				//基準単位ＣＤ
				dtlR.base_unit_cd(oldSloDR.base_unit_cd());
				
				itmR = MAM_ITM_R.create();
				MAM_ITM_R itmR_t = MAM_ITM_R.create("T");
				MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(itmR_t);
				itmR_bldr.setSelect(itmR_t.dec_place, itmR_t.rnd_typ, itmR_t.release_flg);
				dbSelectKey("MSBBL6230_MAM_ITM_S01", itmR, itmR_bldr, oldSloDR.itm_cd(),
						oldSloDR.itm_sub1(), oldSloDR.itm_sub2(), oldSloDR.itm_sub3());
				
				if (isNull(itmR) || itmR.isEmpty() || !itmR.release_flg()) {
					dtlR.err_flg(true);
					
					MCIndexKey idxkey = errItmL.createIndex(
							MAM_ITM_R.$itm_cd, 
							MAM_ITM_R.$itm_sub1, 
							MAM_ITM_R.$itm_sub2,
							MAM_ITM_R.$itm_sub3);
					
					if (!errItmL.contains(idxkey, oldSloDR.itm_cd(), oldSloDR.itm_sub1(), oldSloDR.itm_sub2(), oldSloDR.itm_sub3())) {
						
						MCMessagePool.add(dtlR, null, MAUAL0189, 
								toDispItm(oldSloDR.itm_cd(), oldSloDR.itm_sub1(), oldSloDR.itm_sub2(), oldSloDR.itm_sub3()), 
								toDispGUIIndex(MCRow.create()));
						
						itmR = MAM_ITM_R.create();
						itmR.itm_cd(oldSloDR.itm_cd());
						itmR.itm_sub1(oldSloDR.itm_sub1());
						itmR.itm_sub2(oldSloDR.itm_sub2());
						itmR.itm_sub3(oldSloDR.itm_sub3());
						errItmL.add(itmR);
					}
				}
				
				itmUnitR = MAVM_ITM_UNIT_R.create();
				itmUnitR.itm_cd(oldSloDR.itm_cd());
				itmUnitR.itm_sub1(oldSloDR.itm_sub1());
				itmUnitR.itm_sub2(oldSloDR.itm_sub2());
				itmUnitR.itm_sub3(oldSloDR.itm_sub3());
				itmUnitR.unit_cd(dtlR.trd_unit_cd());
				dbSelectKey("MSBBL6230_MAVM_ITM_UNIT_S01", itmUnitR,
						MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), itmUnitR);
				
				if (isNull(itmUnitR) || itmUnitR.isEmpty()) {
					dtlR.err_flg(true);
					MCMessagePool.add(dtlR, null, MAUAL0242, 
							toDispItm(oldSloDR.itm_cd(), oldSloDR.itm_sub1(), oldSloDR.itm_sub2(), oldSloDR.itm_sub3()), 
							toDispGUIIndex(dtlR));
				}
				
				MCNumber baseUnitQty = convToBaseUnit(dtlR.trd_unit_qty(), itmUnitR.conv_base_qty(),
						itmUnitR.conv_qty(), itmR.dec_place(), itmR.rnd_typ());
				
				dtlR.base_unit_qty(baseUnitQty);
				
				MCDate sloDt = getSloCache(oldSloDR.slo_no()).slo_dt();
				if (!isNull(dtlR.dlv_cd())) {
					compDlvInfo(dtlR, dtlR.dlv_cd(), sloDt);
				}
				if (!isNull(dtlR.tdlv_cd())) {
					compTdlvInfo(dtlR, dtlR.tdlv_cd(), sloDt);
				}
			}
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R> _cacheBpSub;
		protected void createCacheBp(MCList<MAM_BP_R> bindBpL) {
			if (bindBpL.isEmpty()) {
				return;
			}
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R bp = MAM_BP_R.create("T");
			MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(bp);
			bp_bldr.addSelect(bp.zip_cd);
			bp_bldr.addSelect(bp.addr1);
			bp_bldr.addSelect(bp.addr2);
			bp_bldr.addSelect(bp.addr3);
			bp_bldr.addSelect(bp.addr4);
			bp_bldr.addSelect(bp.tel);
			bp_bldr.addSelect(bp.fax);
			bp_bldr.addSelect(bp.dlv_cntct_dpt);
			bp_bldr.addSelect(bp.dlv_cntct_psn);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL, bp_bldr, bindBpL, MAM_BP_R.$bp_cd);
			
			_cacheBpSub = new FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R>(
					MCQueryApiBuilder.create(MAM_BP_SUB_R.create("T")),
					bindBpL, MAM_BP_R.$bp_cd);
		}
		
		protected MCList<MAM_BP_R> getBindBpL(MCList<DlvInstRcv_Upd01_DtlR> dlvInstRcvL) {
			MCList<MAM_BP_R> bindBpL = MCList.create(MAM_BP_R.class);
			for (DlvInstRcv_Upd01_DtlR r : dlvInstRcvL) {
				if (!isNull(r.dlv_cd())) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.dlv_cd());
					bindBpL.add(bpR);
				}
				if (!isNull(r.tdlv_cd())) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.tdlv_cd());
					bindBpL.add(bpR);
				}
			}
			return bindBpL.groupBy(MAM_BP_R.$bp_cd);
		}
		
		protected void setDlvAddr(DlvInstRcv_Upd01_DtlR r, MAM_BP_R bpR, MAM_BP_SUB_R bpSubR) {
			if (bpSubR.isEmpty()) {
				r.dlv_zip_cd(bpR.getStringNE("zip_cd"));
				r.dlv_addr1(bpR.getStringNE("addr1"));
				r.dlv_addr2(bpR.getStringNE("addr2"));
				r.dlv_addr3(bpR.getStringNE("addr3"));
				r.dlv_addr4(bpR.getStringNE("addr4"));
				r.dlv_tel(bpR.getStringNE("tel"));
				r.dlv_fax(bpR.getStringNE("fax"));
				r.dlv_cntct_dpt(bpR.getStringNE("dlv_cntct_dpt"));
				r.dlv_cntct_psn(bpR.getStringNE("dlv_cntct_psn"));
			}
			else {
				r.dlv_zip_cd(bpSubR.zip_cd());
				r.dlv_addr1(bpSubR.addr1());
				r.dlv_addr2(bpSubR.addr2());
				r.dlv_addr3(bpSubR.addr3());
				r.dlv_addr4(bpSubR.addr4());
				r.dlv_tel(bpSubR.tel());
				r.dlv_fax(bpSubR.fax());
				r.dlv_cntct_dpt(bpSubR.dlv_cntct_dpt());
				r.dlv_cntct_psn(bpSubR.dlv_cntct_psn());
			}
		}
		
		protected void setTdlvAddr(DlvInstRcv_Upd01_DtlR r, MAM_BP_R bpR, MAM_BP_SUB_R bpSubR) {
			if (bpSubR.isEmpty()) {
				r.tdlv_zip_cd(bpR.getStringNE("zip_cd"));
				r.tdlv_addr1(bpR.getStringNE("addr1"));
				r.tdlv_addr2(bpR.getStringNE("addr2"));
				r.tdlv_addr3(bpR.getStringNE("addr3"));
				r.tdlv_addr4(bpR.getStringNE("addr4"));
				r.tdlv_tel(bpR.getStringNE("tel"));
				r.tdlv_fax(bpR.getStringNE("fax"));
				r.tdlv_cntct_dpt(bpR.getStringNE("dlv_cntct_dpt"));
				r.tdlv_cntct_psn(bpR.getStringNE("dlv_cntct_psn"));
			}
			else {
				r.tdlv_zip_cd(bpSubR.zip_cd());
				r.tdlv_addr1(bpSubR.addr1());
				r.tdlv_addr2(bpSubR.addr2());
				r.tdlv_addr3(bpSubR.addr3());
				r.tdlv_addr4(bpSubR.addr4());
				r.tdlv_tel(bpSubR.tel());
				r.tdlv_fax(bpSubR.fax());
				r.tdlv_cntct_dpt(bpSubR.dlv_cntct_dpt());
				r.tdlv_cntct_psn(bpSubR.dlv_cntct_psn());
			}
		}
		
		protected void compDlvInfo(DlvInstRcv_Upd01_DtlR r, String bp, MCDate sloDt) {
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_SUB_R bpSubR = MAM_BP_SUB_R.create();
			bpR = _cacheBp.get(bp);
			if (!bpR.dlv_sundry_flg()) {
				bpSubR = _cacheBpSub.get(sloDt, bp);
				setDlvAddr(r, bpR, bpSubR);
			}
		}
		
		protected void compTdlvInfo(DlvInstRcv_Upd01_DtlR r, String bp, MCDate sloDt) {
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_SUB_R bpSubR = MAM_BP_SUB_R.create();
			bpR = _cacheBp.get(bp);
			if (!bpR.dlv_sundry_flg()) {
				bpSubR = _cacheBpSub.get(sloDt, bp);
				setTdlvAddr(r, bpR, bpSubR);
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * 取引単位CD,取引単位数を元に、基準単位数を取得する
	 * @param trd_unit_qty
	 * @param trd_unit_cd
	 * @param itm_cd
	 * @param itm_sub1
	 * @param itm_sub2
	 * @param itm_sub3
	 * @return
	 */
	protected MCNumber getBaseUnitQty(MCNumber trd_unit_qty, String trd_unit_cd,
			String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
		
		MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
		itmUnitR.itm_cd(itm_cd);
		itmUnitR.itm_sub1(itm_sub1);
		itmUnitR.itm_sub2(itm_sub2);
		itmUnitR.itm_sub3(itm_sub3);
		itmUnitR.unit_cd(trd_unit_cd);
		dbSelectKey("MSBBL6230_MAVM_ITM_UNIT_S02", itmUnitR,
				MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), itmUnitR);
		
		//基準単位の小数部有効桁数、基準単位の単位換算端数処理区分の取得
		MAVM_ITM_UNIT_R itmBaseUnitR = MAVM_ITM_UNIT_R.create();
		MAVM_ITM_UNIT_R itmBaseUnitR_t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmBaseUnitR_bldr = MCQueryApiBuilder.create(itmBaseUnitR_t);
		MAM_ITM_R t1 = MAM_ITM_R.create("T1");
		itmBaseUnitR_bldr.addInnerJoin(t1,
				bracket(itmBaseUnitR_t.itm_cd.eq(t1.itm_cd)
						.and(itmBaseUnitR_t.itm_sub1.eq(t1.itm_sub1))
						.and(itmBaseUnitR_t.itm_sub2.eq(t1.itm_sub2))
						.and(itmBaseUnitR_t.itm_sub3.eq(t1.itm_sub3))
						.and(itmBaseUnitR_t.unit_cd.eq(t1.unit_cd))));
		itmBaseUnitR_bldr.setWhere(t1.itm_cd.eq(bind("1")), itm_cd);
		itmBaseUnitR_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("1")), itm_sub1);
		itmBaseUnitR_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("1")), itm_sub2);
		itmBaseUnitR_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("1")), itm_sub3);
		dbSelect("MSBBL6230_MAVM_ITM_UNIT_S03", itmBaseUnitR, itmBaseUnitR_bldr);
		
		MCNumber base_unit_qty = convToBaseUnit(trd_unit_qty, itmUnitR.conv_base_qty(),
				itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
		return base_unit_qty;
	}

	/**
	 * DlvInstRcv_Upd01オペレーション.<p>
	 *
	 */
	public class DlvInstRcv_Upd01 extends MSBBL_DlvInstRcptService_MC_A.DlvInstRcv_Upd01 {

		/**
		 * 引当解除マップ（出荷物流Ｇ単位の引当解除数量合計）
		 */
		MCList<MST_SHIP_SCHD_R> _allocRelShipSchdL = null;
		
		/**
		 * 引当保留の出荷引当状況
		 */
		MCList<MST_SHIP_ALLOC_STS_R> _waitShipAllocStsL = null;
		
		/**
		 * 引当結果リスト
		 */
		protected MCList<Srch_RsltR> _allocRsltL = null;
		
		/**
		 * 引当結果リスト(引当保留分)
		 */
		protected MCList<Srch_RsltR> _waitAllocRsltL = null;
		
		/**
		 * 追加引当受注状況リスト
		 */
		protected MCList<SloSts_DtlR> _addAllocSloStsL = null;
		
		/**
		 * 引当解除オペレーション
		 */
		protected MSBEL_ShipSchdService.ShipSchd_Upd06 _stkAllocRelOpe = null;
		
		/**
		 * 引当オペレーション（引当解除分）
		 */
		protected MSBEL_AllocMngService.Alloc_Srch01 _stkAllocForRelOpe = null;
		
		/**
		 * 出荷進捗ＮＯと紐付けＮＯのマップ（納入指示無し出荷予定のみ）
		 */
		protected Map<String, MCNumber> _shipPrPegNoMap = null;
		
		/**
		 * 最大紐付けＮＯ
		 */
		protected MCNumber _maxPegNo = null;
		
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
			
			//前処理
			beforeProc();
			//納入指示受領ＮＯ発番
			setupNo();
			//出荷予定日計算
			callShipSchdDtService();
			//有効期限チェック、ロット逆転チェック
			checkLotLimitRevise();
			//品目の有効期限FROM,TOを取得
			getItmValidDt();
			//納入指示受領登録
			updDlvInstRcpt();
			//出荷進捗の納入指示受領日・納入指示受領数の更新
			updShipPr();
			//出荷進捗の販売状況区分の更新
			updSlsStsTyp();
			//引当処理の呼び出し
			callStkAlloc();
			//受注状況更新処理の呼び出し
			callSloStsReg();
			//出荷予定サービスを呼出
			callShipSchdService();
			//納入指示回答情報の更新
			updDlvInstPrms();
			//出荷予定の納入指示受領ＮＯを更新
			updShipSchd();
			//WG間依頼の納入指示受領FLGを更新
			updWgRqst();
			//受注ヘッダの空更新
			updSlo();
			//下り電文設定
			setDown();
			// ピッキングなしの明細が纏めるか確認する
			chkNoPick(up0().getString(DlvInstRcv_Upd01_DtlR.$slo_no));
		}

		protected void beforeProc() {
			String[] gCols = new String[] {
				DlvInstRcv_Upd01_DtlR.$slo_d_no
			};
			MCGroupByPolicy gp = new MCGroupByPolicy(gCols);
			MCIndexKey up0Idxkey = up0().createIndex(DlvInstRcv_Upd01_DtlR.$slo_upd_flg);
			_sloGrpL = up0().subList(up0Idxkey, false).groupBy(gp);				
			_sloGrpAllL = up0().groupBy(gp);			
			_cacheSloDL = getSloDCache(up0());
			_cacheShipPrL = getShipPrCache(up0());
			_cacheShipSchdL = getShipSchdCache(up0());
			_cacheShipAlocStsL = getShipAlocCache(up0());
			_cacheDlvinstRcptL = getDlvInstReptCache(up0());
			if(!isNull(_cacheDlvinstRcptL)) {
				_dlvInstRcptKey = _cacheDlvinstRcptL.createIndex(MST_DLV_INST_RCPT_R.$dlv_inst_rcpt_no);
			}
			initSlsSchdCache(up0());
		}
		
		/**
		 * 納入指示受領ＮＯ発番
		 * @param dtl
		 */
		protected void setupNo() {
			for (DlvInstRcv_Upd01_DtlR dtlR : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					dtlR.dlv_inst_rcpt_no(getStrSeq(MSC_NUM_SYS_TYP.DLVINSTRCPT));
					dtlR.dlv_inst_rcpt_rev(1);
				}
			}
		}

		/**
		 * 納入指示受領登録を行う
		 */
		protected void updDlvInstRcpt() {
			int idx = 0;
			MCList<MST_DLV_INST_RCPT_R> insL = MCList.create(MST_DLV_INST_RCPT_R.class);
			MCList<MST_DLV_INST_RCPT_R> updL = MCList.create(MST_DLV_INST_RCPT_R.class);
			MCList<MST_DLV_INST_RCPT_R> delL = MCList.create(MST_DLV_INST_RCPT_R.class);
			for (DlvInstRcv_Upd01_DtlR dtlR : up0()) {
				if (!dtlR.dlv_sundry_flg()) {
					dtlR.dlv_nm(null);
				}
				if (!dtlR.tdlv_sundry_flg()) {
					dtlR.tdlv_nm(null);
				}
				MST_DLV_INST_RCPT_R rcptR = up0().getInnerRow(idx, "rcpt",
						MST_DLV_INST_RCPT_R.class);
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					insL.add(rcptR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					rcptR.dlv_inst_rcpt_rev(rcptR.dlv_inst_rcpt_rev().add(1));
					updL.add(rcptR);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					rcptR.can_flg(true);
					delL.add(rcptR);
				}
				idx++;
			}
			if (insL.size() > 0) {
				dbInsert("MSBBL6230_MST_DLV_INST_RCPT_I01", insL,
						MCQueryApiBuilder.create(MST_DLV_INST_RCPT_R.create("T")));
			}
			if (updL.size() > 0) {
				dbUpdateKey("MSBBL6230_MST_DLV_INST_RCPT_U01", updL,
						MCQueryApiBuilder.create(MST_DLV_INST_RCPT_R.create("T")));
			}
			if (delL.size() > 0) {
				MST_DLV_INST_RCPT_R delL_t = MST_DLV_INST_RCPT_R.create("T");
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(delL_t);
				delL_bldr.setSet(delL_t.can_flg);
				dbUpdateKey("MSBBL6230_MST_DLV_INST_RCPT_U02", delL, delL_bldr);
			}
		}
		
		/**
		 * 出荷進捗の納入指示受領日を更新する。
		 */
		protected void updShipPr() {
			
			MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R shipPrL_t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder shipPrL_bldr = MCQueryApiBuilder.create(shipPrL_t);
			shipPrL_bldr.setSet(shipPrL_t.dlv_inst_rcpt_dt, shipPrL_t.dlv_inst_rcpt_qty);
			
			MST_SHIP_PR_R shipPrR = null;
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpAllL) {
				
				//受注明細に対応する納入指示明細を取得
				MCList<MST_DLV_INST_RCPT_R> instRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
				MST_DLV_INST_RCPT_R instRcptL_t = MST_DLV_INST_RCPT_R.create("T");
				MCQueryApiBuilder instRcptL_bldr = MCQueryApiBuilder.create(instRcptL_t);
				
				instRcptL_bldr.setWhere(instRcptL_t.slo_d_no.eq(bind("1")), grpR.slo_d_no());
				instRcptL_bldr.addWhereWithAnd(instRcptL_t.can_flg.eq(value(false)));
				dbSelect("MSBBL6230_MST_DLV_INST_RCPT_S02", instRcptL, instRcptL_bldr);
				
				MST_SHIP_PR_R cacheshipPrR = getFirstShipPrCache(grpR.slo_d_no());
				
				if (!isNull(cacheshipPrR) && !cacheshipPrR.isEmpty()) {
					
					shipPrR = MST_SHIP_PR_R.create();
					
					shipPrR.ship_pr_no(cacheshipPrR.ship_pr_no());
					
					shipPrR.dlv_inst_rcpt_dt(instRcptL.size() > 0 ? getToday() : null);
					shipPrR.dlv_inst_rcpt_qty(instRcptL.size() > 0 ? instRcptL.sum(MST_DLV_INST_RCPT_R.$base_unit_qty) : MCNumber.ZERO);
					
					shipPrL.add(shipPrR);
				}
			}
			
			if (!shipPrL.isEmpty()) {
				
				dbUpdateKey("MSBBL6230_MST_SHIP_PR_U02", shipPrL, shipPrL_bldr);
			}
		}
		
		/**
		 * 出荷進捗の納入指示回答情報を更新する。
		 */
		protected void updDlvInstPrms() {
			MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
			MCList<MST_SLO_PRMS_R> alPrmsL = getSloPrmsL();
			MCIndexKey idxAllPrmsL = alPrmsL.createIndex(MST_SLO_PRMS_R.$slo_d_no);
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpAllL) {
				// 出荷予定に紐付く納期回答情報を取得する。
				MCList<MST_SLO_PRMS_R> prmsL = alPrmsL.subList(idxAllPrmsL, grpR.slo_d_no());
				
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
				
				MST_SHIP_PR_R cacheshipPrR = getFirstShipPrCache(grpR.slo_d_no());
				
				if (!isNull(cacheshipPrR) && !cacheshipPrR.isEmpty()) {
					
					MST_SHIP_PR_R shipPrR = null;
					shipPrR = MST_SHIP_PR_R.create();
					
					shipPrR.ship_pr_no(cacheshipPrR.ship_pr_no());
					
					MCNumber baseUnitPrmsQty = prmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty);
					MCDate maxPrmsDlvTm = (MCDate)prmsL.max(MST_SLO_PRMS_R.$prms_dlv_tm);
					shipPrR.prms_dlv_dt(prmsL.size() > 0 && isSame(baseUnitPrmsQty, _cacheShipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty)) ? maxPrmsDlvTm : null);
					shipPrR.prms_dt(sloPrmsL.isEmpty() ? null : cacheshipPrR.prms_dt());
					shipPrR.prms_qty(sloPrmsL.size() > 0 ? sloPrmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty) : MCNumber.ZERO);
					shipPrR.dlv_inst_prms_dt(dlvInstPrmsL.isEmpty() ? null : cacheshipPrR.dlv_inst_prms_dt());
					shipPrR.dlv_inst_prms_qty(dlvInstPrmsL.size() > 0 ? dlvInstPrmsL.sum(MST_SLO_PRMS_R.$base_unit_prms_qty) : MCNumber.ZERO);
					
					shipPrL.add(shipPrR);
				}
			}
			
			if (!shipPrL.isEmpty()) {
				MST_SHIP_PR_R shipPrL_t = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder shipPrL_bldr = MCQueryApiBuilder.create(shipPrL_t);
				shipPrL_bldr.setSet(shipPrL_t.prms_dlv_dt, shipPrL_t.prms_qty, shipPrL_t.prms_dt,
						shipPrL_t.dlv_inst_prms_qty, shipPrL_t.dlv_inst_prms_dt);
				dbUpdateKey("MSBBL6230_MST_SHIP_PR_U03", shipPrL, shipPrL_bldr);
			}
		}
		/**
		 * 出荷予定の納入指示受領ＮＯを更新.
		 */
		protected void updShipSchd() {
			String[] gCols = new String[] {
					MST_SHIP_SCHD_R.$dlv_inst_rcpt_no
			};
			String[] sCols = new String[] {
					DlvInstRcv_Upd01_DtlR.$slo_upd_flg,
					DlvInstRcv_Upd01_DtlR.$data_crud_typ
			};
			Comparable<?>[] vals = new Comparable<?>[] {
					true,
					MAC_DATA_CRUD_TYP.DEL.value()
			};
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCList<DlvInstRcv_Upd01_DtlR> dL = up0().subList(sCols, vals).groupBy(gCols);
			MCIndexKey idxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			for (DlvInstRcv_Upd01_DtlR r : dL) {
				shipSchdL.addAll(_cacheShipSchdL.subList(idxkey, r.dlv_inst_rcpt_no()).clone());
			}
			if (!shipSchdL.isEmpty()) {
				MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
				MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(t);
				shipSchdL.setString(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no, null);
				shipSchdL_bldr.setSet(t.dlv_inst_rcpt_no);
				dbUpdateKey("MSBBL6230_MST_SHIP_SCHD_U01", shipSchdL, shipSchdL_bldr);
			}
		}
		
		/**
		 * 販売状況取得ユーティリティを利用して販売状況区分を更新する。
		 */
		protected void updSlsStsTyp() {
			
			MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
			shipPrL.addStringColumn("peg_no");
			
			MST_SHIP_PR_R shipPrR = null;
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpAllL) {
				
				MST_SHIP_PR_R cacheshipPrR = getFirstShipPrCache(grpR.slo_d_no());
				
				if (!isNull(cacheshipPrR) && !cacheshipPrR.isEmpty()) {
					shipPrR = MST_SHIP_PR_R.create();
					shipPrR.ship_pr_no(cacheshipPrR.ship_pr_no());
					shipPrR.slo_d_no(cacheshipPrR.slo_d_no());
					shipPrR.trd_ptn_typ(cacheshipPrR.trd_ptn_typ());
					shipPrL.add(shipPrR);
				}
			}
			setPegNo(shipPrL);

			MSUCL_SlsUtil.SlsUtil_Srch01 o = MSUCL_SlsUtil.crtSlsUtil_Srch01();
			for (MST_SHIP_PR_R r : shipPrL) {
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
					
					copy(o.up0().add(), r, createMap_SlsUtil_Srch01_CndR_MST_SHIP_PR_R());
				}
			}
			if (!o.up0().isEmpty()) {
				
				o.exec();
				copyByPegNo(shipPrL,
						new String[]{MST_SHIP_PR_R.$sls_sts_typ},
						o.down0(),
						new String[]{SlsUtil_Srch01_CndR.$sls_sts_typ});
				
				// 出荷進捗に反映
				MST_SHIP_PR_R dbc = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.sls_sts_typ);
				dbUpdateKey("MSBBL6230_MST_SHIP_PR_U04", shipPrL, builder);
			}
		}
		
		/**
		 * 売上部門CDを元に仕入直送中継場所を取得する。
		 * 
		 * @param detCd
		 * @param dt
		 * @return
		 */
		protected String getMidLocCd(String dptCd, MCDate dt) {
			String locCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_SLS_DPT_LOC_CD", "01"),
					MAPA_LOC$F_GET_SLS_DPT_LOC_CD(value(dptCd), value(dt)));
			return locCd;
		}
		
		protected String getShipFrLgGrpCd(MST_SLO_D_R oldSloDR){
			String locCd = "";
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ())) {
				// 売上部門で、場所マスタから場所CDを取得する
				MST_SLO_R cacheSloR = getSloCache(oldSloDR.slo_no());
				locCd = getMidLocCd(cacheSloR.sls_dpt_cd(), cacheSloR.slo_dt());
			}
			else{
				locCd = nvl(oldSloDR.loc_cd(), oldSloDR.def_loc_cd());
			}

			MAM_LOC_R locR = getLoc(locCd);
			return locR.lg_grp_cd();
		}

		/**
		 * 出荷予定日計算サービス実行
		 * @param hdr
		 * @param dL
		 */
		protected void callShipSchdDtService() {			
			//出荷予定日計算サービス.出荷予定日計算（ロット提案なし）
			MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 op = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
			
			for (DlvInstRcv_Upd01_DtlR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getFirstSloDCache(r.slo_d_no());
					MST_SLO_R cacheSloR = getSloCache(oldSloDR.slo_no());
					
					if (!MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) && !MAC_SHIP_INST_TYP.isNO_PICK(oldSloDR.ship_inst_typ())){					
						MSW_SHIP_SCHD_DT_CALC_R cndR = MSW_SHIP_SCHD_DT_CALC_R.create();
						copy(cndR,oldSloDR, r,createMap_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R_DlvInstRcv_Upd01_DtlR());
						//出荷物流グループＣＤ
						if (isNull(cndR.ship_fr_lg_grp_cd())){							
							cndR.ship_fr_lg_grp_cd(getShipFrLgGrpCd(oldSloDR));
						}
						
						
						cndR.base_dt(cacheSloR.slo_dt());
						op.up0().add(cndR);
					}					
				}
			}
			if (!op.up0().isEmpty()){
				op.exec();
			}
			//計算結果を一覧に設定する
			for (DlvInstRcv_Upd01_DtlR r : up0()) {
				for (MSW_SHIP_SCHD_DT_CALC_R dowR : op.down0()){
					if (isSame(r.peg_no(), dowR.peg_no())) {
						r.ship_schd_tm(dowR.ship_schd_tm());
						r.dlv_schd_tm(dowR.dlv_schd_tm());
						r.ship_wk_cd(dowR.ship_wk_cd());
					}
				}
			}
		}

		/**
		 * 有効期限チェック、ロット逆転チェック
		 */
		protected void checkLotLimitRevise() {
			//有効期限チェック,	ロット逆転チェックを実行する。
			MSBEL_ShipLotChkService.ShipLotChk_Chk01 shipLotChk = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
			for (DlvInstRcv_Upd01_DtlR dtlR : up0()) {
				//削除の場合、チェックしない
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
					MST_SLO_R cacheSloR = getSloCache(oldSloDR.slo_no());
					
					if (!isNullOrNullVal(oldSloDR.lot_no())) {
						
						//明細のロットを指定した場合、ロットの有効期限が有効期限制御の条件を満たすかチェックする。
						ShipLot_DtlR lotR = ShipLot_DtlR.create();
						lotR.peg_no(dtlR.peg_no()); //紐付けＮＯ
						lotR.cst_cd(cacheSloR.cst_cd()); //得意先ＣＤ
						lotR.dlv_cd(nvl(dtlR.dlv_cd(), oldSloDR.dlv_cd())); //納品先ＣＤ
						lotR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
						lotR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
						lotR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
						lotR.itm_sub3(oldSloDR.itm_sub3()); //枝番３
						lotR.base_dt(dtlR.dlv_schd_tm().startTimeOfDay()); //基準日	
						lotR.lot_no(oldSloDR.lot_no()); //ロットＮＯ
						lotR.sublot_no(oldSloDR.sublot_no()); //サブロットＮＯ
						if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
							lotR.slo_d_no(oldSloDR.slo_d_no());
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							lotR.dlv_inst_rcpt_no(dtlR.dlv_inst_rcpt_no());
						}
						shipLotChk.up0().add(lotR);
					}
				}
			}
			if (shipLotChk.up0().isEmpty()) {
				return;
			}
			shipLotChk.exec();
			throwUpdErr();
		}

		/**
		 * 品目の有効期限の取得
		 * @param hdr
		 * @param dtl
		 */
		protected void getItmValidDt() {
			//品目の有効期限の取得
			MSBEL_ShipLotChkService.ShipLotChk_Srch01 shipLotSv = MSBEL_ShipLotChkService
					.crtShipLotChk_Srch01();
			for (DlvInstRcv_Upd01_DtlR dtlR : up0()) {
				if (dtlR.slo_upd_flg() || MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())){
					continue;
				}
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
				MST_SLO_R cacheSloR = getSloCache(oldSloDR.slo_no());
				
				//手配区分＝在庫引当、引当後手配、手配依頼の場合のみ
				if (MAC_SLO_PROC_TYP.isALLOC(oldSloDR.proc_typ())
						|| MAC_SLO_PROC_TYP.isALLOC_PROC(oldSloDR.proc_typ())
						|| MAC_SLO_PROC_TYP.isPROC(oldSloDR.proc_typ())) {
					
					
					//明細のロットを指定した場合、ロットの有効期限が有効期限制御の条件を満たすかチェックする。
					ShipLot_DtlR lotR = ShipLot_DtlR.create();
					lotR.peg_no(dtlR.peg_no()); //紐付けＮＯ
					lotR.cst_cd(cacheSloR.cst_cd()); //得意先ＣＤ
					lotR.dlv_cd(nvl(dtlR.dlv_cd(), oldSloDR.dlv_cd())); //納品先ＣＤ
					lotR.itm_cd(oldSloDR.itm_cd()); //品目ＣＤ
					lotR.itm_sub1(oldSloDR.itm_sub1()); //枝番１
					lotR.itm_sub2(oldSloDR.itm_sub2()); //枝番２
					lotR.itm_sub3(oldSloDR.itm_sub3()); //枝番３
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
			
			MCIndexKey up0Idxkey = up0().createIndex(DlvInstRcv_Upd01_DtlR.$peg_no);
			for (ShipLot_DtlR retR : retDL) {
				//対応する受注明細を取得
				DlvInstRcv_Upd01_DtlR dlR = up0().subList(up0Idxkey,
						retR.peg_no()).get(0);
				//有効期限（下限）
				dlR.valid_dt_fr(retR.valid_dt_fr());
				//有効期限（下限）継承Ｇ
				dlR.valid_dt_fr_grp(retR.valid_dt_fr_grp());
				//有効期限（上限）
				dlR.valid_dt_to(retR.valid_dt_to());
			}
		}
		
		/**
		 * 引当処理を実行する。
		 */
		protected void callStkAlloc() {
			
			initStkAlloc();
			
			crtStkAllocRel();
			
			crtStkAllocForRel();
			
			callAllocLock();
			
			callStkAllocForWait();
			
			callStkAllocRelChk();
			
			callStkAllocRel();
			
			callStkAllocForRel();
		}
		
		/**
		 * 引当の初期化処理
		 */
		protected void initStkAlloc() {
			
			_allocRelShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			
			_allocRsltL = MCList.create(Srch_RsltR.class);
			
			_waitAllocRsltL = MCList.create(Srch_RsltR.class);
			
			_addAllocSloStsL = MCList.create(SloSts_DtlR.class);
			
			_shipPrPegNoMap = new HashMap<String, MCNumber>();
			
			_maxPegNo = nvl((MCNumber)up0().max(DlvInstRcv_Upd01_DtlR.$peg_no), MCNumber.ZERO);
		}
		
		/**
		 * 引当解除処理の上り電文を作成する。
		 */
		protected void crtStkAllocRel() {

			//出荷予定サービス.引当解除(MSBEL5500.ShipSchd_Upd06）のサービスを実行して、引当解除を行う。
			_stkAllocRelOpe = MSBEL_ShipSchdService.crtShipSchd_Upd06();
			
			MCIndexKey shipSchdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			MCIndexKey up0Idxkey = up0().createIndex(DlvInstRcv_Upd01_DtlR.$slo_d_no);
			
			for (DlvInstRcv_Upd01_DtlR dtlR : _sloGrpL) {
				
				//キャッシュから対応する更新前の出荷進捗を取得する。
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(dtlR.slo_d_no());
				
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());	
				
				//キャッシュから対応する更新前の出荷予定を取得する。
				MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(
						shipSchdIdxkey, oldShipPrR.ship_pr_no());
				
				MCList<DlvInstRcv_Upd01_DtlR> dtlDlvInstRcvL = up0().subList(up0Idxkey, dtlR.slo_d_no());
				
				if (needReAllocAndUpdShipSchd(dtlDlvInstRcvL, oldSloDR)) {
					
					//新規の場合、出荷予定の納入指示受領NO＝NULLとなっているをレコードを抽出、取消の対象とする。
					for (MST_SHIP_SCHD_R shipSchdR : oldShipSchdL) {
						
						if (isNull(shipSchdR.dlv_inst_rcpt_no())) {
							
							if (!isRelAblShipSchd(shipSchdR)) {
								continue;
							}
							_allocRelShipSchdL.add(shipSchdR);
						}
					}
				}
				
				MCList<DlvInstRcv_Upd01_DtlR> subUpdCanDtl = MCList.create(DlvInstRcv_Upd01_DtlR.class);
				
				MCIndexKey idxkey = dtlDlvInstRcvL.createIndex(DlvInstRcv_Upd01_DtlR.$data_crud_typ);
				
				subUpdCanDtl.addAll(dtlDlvInstRcvL.subList(idxkey, MAC_DATA_CRUD_TYP.UPD.value()));
				subUpdCanDtl.addAll(dtlDlvInstRcvL.subList(idxkey,  MAC_DATA_CRUD_TYP.DEL.value()));
				
				for (DlvInstRcv_Upd01_DtlR r : subUpdCanDtl) {
					
					if (r.slo_upd_flg()){
						continue;
					}
					
					//削除、更新の場合、出荷予定の納入指示受領NO＝上り電文の納入指示受領NOのものをレコードを抽出、取消の対象とする。
					for (MST_SHIP_SCHD_R shipSchdR : oldShipSchdL) {
						
						if (isSame(shipSchdR.dlv_inst_rcpt_no(), r.dlv_inst_rcpt_no())) {

							//数量、日付以外の項目の変更は取消対象外とする。
							if (!needReAllocAndUpdShipSchd(r, oldSloDR) || !isRelAblShipSchd(shipSchdR)) {
								continue;
							}
							
							_allocRelShipSchdL.add(shipSchdR);
							r.alloc_rel_flg(true);
						}
					}
				}
			}
			if (!_allocRelShipSchdL.isEmpty()) {
				int pegNO = 0;
				for (MST_SHIP_SCHD_R r : _allocRelShipSchdL) {
					
					ShipSchd_Upd06_DtlR alcCanR = ShipSchd_Upd06_DtlR.create();
					alcCanR.peg_no(pegNO);
					alcCanR.ship_schd_no(r.ship_schd_no());
					
					_stkAllocRelOpe.up0().add(alcCanR);
					
					pegNO++;
				}
			}
		}
		
		/**
		 * 指定された出荷予定が引当解除可能かどうか。
		 * @param shipSchdR 出荷予定
		 * @return 引当解除可能の場合はtrue
		 */
		protected boolean isRelAblShipSchd(MST_SHIP_SCHD_R shipSchdR) {

			if (shipSchdR.abort_flg() 
					|| !isNull(shipSchdR.sls_act_d_no())
					|| shipSchdR.alloc_qty().isZero()
					|| shipSchdR.ship_inst_qty().gt(0)
					|| shipSchdR.ship_act_qty().gt(0)
					|| shipSchdR.sls_qty().gt(0)
					|| shipSchdR.iv_schd_qty().gt(0)) {
				
				return false;
			}
			
			return true;
		}
		
		/**
		 * 引当処理の上り電文(引当解除分)を作成。<br>
		 * 出荷予定の変更前に引当数量を保持する。
		 */
		protected void crtStkAllocForRel() {
			
			_stkAllocForRelOpe = MSBEL_AllocMngService.crtAlloc_Srch01();
			_stkAllocForRelOpe.up1().addStringColumn("slo_d_no");
			
			MCList<Srch_TgtR> up1L = null;
			
			MCIndexKey updIdxkey = up0().createIndex(DlvInstRcv_Upd01_DtlR.$slo_d_no, DlvInstRcv_Upd01_DtlR.$data_crud_typ);
			MCIndexKey allocRelShipSchdIdxkey = _allocRelShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			MCIndexKey allocRelShipSchdDlvInstRcptIdxkey = _allocRelShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			MCIndexKey slsActShipSchdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpL) {
				
				up1L = MCList.create(Srch_TgtR.class);
				
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(grpR.slo_d_no());
				MST_SLO_R cacheSloR = getSloCache(oldSloDR.slo_no());
				
				//キャッシュから対応する更新前の出荷進捗を取得する。
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(grpR.slo_d_no());
				
				MCList<MST_SHIP_SCHD_R> allocRelShipSchdL = _allocRelShipSchdL.subList(allocRelShipSchdIdxkey, oldShipPrR.ship_pr_no());
				
				if (allocRelShipSchdL.isEmpty()) {
					
					continue;
				}
				
				// 物流Ｇ後との引当解除数量を算出する。
				MCGroupByPolicy policy = new MCGroupByPolicy(MST_SHIP_SCHD_R.$ship_fr_lg_grp_cd);
				policy.sum(MST_SHIP_SCHD_R.$alloc_qty);
				
				MCList<MST_SHIP_SCHD_R> allocRelGrpL = allocRelShipSchdL.groupBy(policy);
				MCIndexKey allocRelGrpIdxkey = allocRelGrpL.createIndex(MST_SHIP_SCHD_R.$ship_fr_lg_grp_cd);
				
				MCList<DlvInstRcv_Upd01_DtlR> updL = MCList.create(DlvInstRcv_Upd01_DtlR.class);
				updL.addAll(up0().subList(updIdxkey, new Comparable<?>[] {grpR.slo_d_no(), MAC_DATA_CRUD_TYP.UPD.value()}));
							
				for (DlvInstRcv_Upd01_DtlR dtlR : updL) {
						
					if (!dtlR.alloc_rel_flg()) {
						continue;
					}
						
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						
						//引当										
						Srch_TgtR alcR = Srch_TgtR.create();
						
						dtlR.setStringNE("trd_ptn_typ", cacheSloR.trd_ptn_typ());
						
						copy(alcR, oldSloDR, dtlR, createMap_Upd_Srch_TgtR_MST_SLO_D_R());
						
						alcR.cst_cd(cacheSloR.cst_cd());
						
						MCList<MST_SHIP_SCHD_R> subShipSchdL = _allocRelShipSchdL.subList(
								allocRelShipSchdDlvInstRcptIdxkey,
								dtlR.dlv_inst_rcpt_no());
						
						MCNumber allocRelQty = subShipSchdL.sum(MST_SHIP_SCHD_R.$alloc_qty);
						
						MCList<MST_SHIP_SCHD_R> slsActShipSchdL = _cacheShipSchdL.subList(slsActShipSchdIdxkey, dtlR.dlv_inst_rcpt_no());
						MCNumber slsActQty = nvl(slsActShipSchdL.sum(MST_SHIP_SCHD_R.$sls_qty), MCNumber.ZERO);
						MCNumber allocQty = dtlR.base_unit_qty().subtract(slsActQty);
						if (!allocQty.isPositive()) {
							continue;
						}
						alcR.base_unit_qty(allocRelQty.gte(allocQty) ? allocQty : allocRelQty);
						
						setPackUnitQty(alcR);
						
						up1L.add(alcR);
						
						// 引当解除数量を減算する。
						for (MST_SHIP_SCHD_R shipSchdR : subShipSchdL) {
							
							MST_SHIP_SCHD_R allocRelGrpR = allocRelGrpL.getFirst(allocRelGrpIdxkey, shipSchdR.ship_fr_lg_grp_cd());
								
							if (!isNull(allocRelGrpR) && !allocRelGrpR.isEmpty()) {
								allocRelGrpR.alloc_qty(allocRelGrpR.alloc_qty().subtract(alcR.base_unit_qty()));
							}
						}
					}
				}
				
				// 納入指示登録時に、出荷予定が作り直せるため、異なる出荷物流Ｇの引当をキープしないとする。
				MST_SHIP_SCHD_R allocRelGrpR = allocRelGrpL.getFirst(allocRelGrpIdxkey, nvl(oldSloDR.ship_lg_grp_cd(), getShipFrLgGrpCd(oldSloDR)));
				
				if (!isNull(allocRelGrpR) && !allocRelGrpR.isEmpty()) {
					
					MCIndexKey up1LIdxkey = up1L.createIndex(Srch_TgtR.$peg_no);
					
					// 引当解除した数量を按分する
					for (DlvInstRcv_Upd01_DtlR dtlR : updL) {
						
						Srch_TgtR alcR = up1L.getFirst(up1LIdxkey, dtlR.peg_no());
						
						if (isNull(alcR) || !isSame(alcR.gi_lg_grp_cd() , allocRelGrpR.ship_fr_lg_grp_cd())) {
							continue;						
						}
						
						if (!isNull(alcR) && !alcR.isEmpty() && !isSame(alcR.base_unit_qty(), dtlR.base_unit_qty())) {
							
							if (allocRelGrpR.alloc_qty().gte(dtlR.base_unit_qty().subtract(alcR.base_unit_qty()))) {
								
								allocRelGrpR.alloc_qty(allocRelGrpR.alloc_qty().subtract(dtlR.base_unit_qty().subtract(alcR.base_unit_qty())));
								alcR.base_unit_qty(dtlR.base_unit_qty());
							}
							else {
								
								alcR.base_unit_qty(sum(alcR.base_unit_qty(), allocRelGrpR.base_unit_qty()));
								
								allocRelGrpR.alloc_qty(MCNumber.ZERO);
							}
							
							setPackUnitQty(alcR);
						}
					}
					
					if (allocRelGrpR.alloc_qty().isPositive()) {
						// 引当解除した分を「新規」または「訂正かつ未引当」に按分する
						updL.addAll(up0().subList(updIdxkey, new Comparable<?>[] {grpR.slo_d_no(), MAC_DATA_CRUD_TYP.CRT.value()}));
						
						for (DlvInstRcv_Upd01_DtlR dtlR : updL) {
							
							if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) 
									|| (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) && !dtlR.alloc_rel_flg())) {
								
								Srch_TgtR alcR = Srch_TgtR.create();
								dtlR.setStringNE("trd_ptn_typ", cacheSloR.trd_ptn_typ());
								copy(alcR, oldSloDR, dtlR, createMap_Upd_Srch_TgtR_MST_SLO_D_R());
								
								alcR.cst_cd(cacheSloR.cst_cd());
								alcR.base_unit_qty(allocRelGrpR.alloc_qty().gte(dtlR.base_unit_qty()) ? dtlR.base_unit_qty() : allocRelGrpR.alloc_qty());
								setPackUnitQty(alcR);
								
								up1L.add(alcR);
								
								// 引当解除数量を減算する。
								allocRelGrpR.alloc_qty(allocRelGrpR.alloc_qty().subtract(alcR.base_unit_qty()));
							}
						}
					}
					
					if (allocRelGrpR.alloc_qty().isPositive()) {
						
						Srch_TgtR alcR = crtNoDlvInstShipSchdAlloc(cacheSloR, oldSloDR, oldShipPrR, allocRelGrpR.alloc_qty());
						
						up1L.add(alcR);
					}
				}
				
				up1L.setStringNE("slo_d_no", grpR.slo_d_no());
				_stkAllocForRelOpe.up1().addAll(up1L);
			}
			
			//引当を実行する
			if (!_stkAllocForRelOpe.up1().isEmpty()) {
				
				_stkAllocForRelOpe.up0().stk_flg(false);
				_stkAllocForRelOpe.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
				_stkAllocForRelOpe.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
				_stkAllocForRelOpe.up0().nm_srch_flg(false);
				_stkAllocForRelOpe.up0().except_alloc_wait_flg(true); //引当保留除外FLGをオンにする
			}
		}
		
		/**
		 * 引当処理の前にロック処理を実行する。
		 */
		protected void callAllocLock() {
			
			MSBEL_AllocMngService.Alloc_Lock_Upd01 ope = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			
			MSW_ALLOC_LOC_MAP_R lockR = null;
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpL) {
				
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(grpR.slo_d_no());
				
				lockR = MSW_ALLOC_LOC_MAP_R.create();
				copy(lockR, oldSloDR, createMap_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R());
				ope.up0().add(lockR);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 引当処理(引当保留分)を実行する。<br>
		 * 引当解除を行うと、受払予定が更新されるため、引当解除の前に実行する必要がある。
		 */
		protected void callStkAllocForWait() {
			
			MSBEL_AllocMngService.Alloc_Srch01 ope = MSBEL_AllocMngService.crtAlloc_Srch01();
			
			MCIndexKey stkAllocForRelOpeUp1IdxKey = _stkAllocForRelOpe.up1().createIndex(Srch_TgtR.$peg_no);
			MCIndexKey stkAllocForRelOpeUp1SloDIdxKey = _stkAllocForRelOpe.up1().createIndex("slo_d_no");
			MCIndexKey up0Idxkey = up0().createIndex(DlvInstRcv_Upd01_DtlR.$slo_d_no);
			MCIndexKey shipSchdIdxkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpL) {
				
				// 受注明細単位で引当を行うため、電文をクリアする。
				ope.up0().clear();
				ope.up1().clear();
				ope.up2().clear();
				ope.up3().clear();
				ope.up4().clear();
				
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(grpR.slo_d_no());
				MST_SLO_R cacheSloR = getSloCache(oldSloDR.slo_no());
				
				MAM_ITM_R itmR = MAM_ITM_R.create();
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(t);
				itmR_bldr.setSelect(t.stk_mng_typ);
				dbSelectKey("MSBBL6230_MAM_ITM_S02", itmR, itmR_bldr, oldSloDR);
				
				//在庫管理区分=在庫管理するの場合のみ引当の対象とする。
				if (!MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
					continue;
				}
				
				//即引当かつ手配区分=在庫引当OR引当後手配OR手配依頼の場合、再引当を行う。
				if (!MAC_ALLOC_TYP.isIMMED(oldSloDR.alloc_typ()) 
						|| (!MAC_SLO_PROC_TYP.isALLOC(oldSloDR.proc_typ())
								&& !MAC_SLO_PROC_TYP.isALLOC_PROC(oldSloDR.proc_typ())
								&& !MAC_SLO_PROC_TYP.isPROC(oldSloDR.proc_typ()))) {
					continue;
				}
				
				MCList<DlvInstRcv_Upd01_DtlR> dtlDlvInstRcvL = up0().subList(up0Idxkey, grpR.slo_d_no());
				
				if (!needReAllocAndUpdShipSchd(dtlDlvInstRcvL, oldSloDR)) {
					continue;
				}
				
				//キャッシュから対応する更新前の出荷進捗を取得する。
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(grpR.slo_d_no());
				
				//キャッシュから対応する更新前の出荷予定を取得する。
				MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(shipSchdIdxkey, oldShipPrR.ship_pr_no());
				
				MCNumber noChngQty = MCNumber.ZERO;
				// 新規引当（変更前一部引当または引当済み分）
				for (DlvInstRcv_Upd01_DtlR dtlR : dtlDlvInstRcvL) {
					
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						continue;
					}
					
					if (!needReAllocAndUpdShipSchd(dtlR, oldSloDR)) {
						noChngQty = noChngQty.add(dtlR.base_unit_qty());
						continue;
					}
							
					Srch_TgtR srchTgtForRelR = _stkAllocForRelOpe.up1().getFirst(stkAllocForRelOpeUp1IdxKey, dtlR.peg_no());
					
					if ((!isNull(srchTgtForRelR) && isSame(srchTgtForRelR.base_unit_qty(), dtlR.base_unit_qty()))) {
						
						continue;
					}
					
					Srch_TgtR alcR = Srch_TgtR.create();
					
					dtlR.setStringNE("trd_ptn_typ", cacheSloR.trd_ptn_typ());
					copy(alcR, oldSloDR, dtlR, createMap_Upd_Srch_TgtR_MST_SLO_D_R());
					alcR.cst_cd(cacheSloR.cst_cd());
					
					if (!isNull(srchTgtForRelR)) {
						
						alcR.base_unit_qty(dtlR.base_unit_qty().subtract(srchTgtForRelR.base_unit_qty()));
					}
					else {
						alcR.base_unit_qty(dtlR.base_unit_qty());
					}
					
					setPackUnitQty(alcR);
					
					ope.up1().add(alcR);
				}
				
				// 新規引当（変更前未引当分）
				MCNumber baseUnitQtySum = oldSloDR.base_unit_qty();	
				
				for (MST_SHIP_SCHD_R shipR : oldShipSchdL) {
					
					if (isNull(shipR.dlv_inst_rcpt_no()) 
							&& (shipR.abort_flg() 
							|| shipR.fix_flg()
							|| shipR.ship_inst_qty().isPositive()
							|| shipR.ship_act_qty().isPositive()
							|| shipR.sls_qty().isPositive()
							|| shipR.iv_schd_qty().isPositive())) {
						
						baseUnitQtySum = baseUnitQtySum.subtract(shipR.base_unit_qty());
					}
				}

				baseUnitQtySum = baseUnitQtySum.subtract(
						sum(noChngQty,
								nvl(ope.up1().sum(Srch_TgtR.$base_unit_qty), MCNumber.ZERO),
								nvl(_stkAllocForRelOpe.up1().subList(stkAllocForRelOpeUp1SloDIdxKey, grpR.slo_d_no()).sum(Srch_TgtR.$base_unit_qty), MCNumber.ZERO)));
				
				if (baseUnitQtySum.isPositive()) {
						
					Srch_TgtR alcR = crtNoDlvInstShipSchdAlloc(cacheSloR, oldSloDR, oldShipPrR, baseUnitQtySum);
						
					ope.up1().add(alcR);
				}
	
				adjAllocSlsAct(grpR.slo_d_no(), ope.up1());
				
				//引当を実行する
				if (!ope.up1().isEmpty()) {
					
					ope.up0().stk_flg(false);
					ope.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
					ope.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
					ope.up0().nm_srch_flg(false);
					ope.up0().except_alloc_wait_flg(false); //引当保留除外FLGをオンにする
					
					getWaitShipAllocSts(oldShipPrR);
					
					Srch_Io_SchdR up3R = null;
					
					for (MST_SHIP_ALLOC_STS_R waitR : _waitShipAllocStsL) {
						
						up3R = Srch_Io_SchdR.create();
						
						if (MAC_TRD_PTN_TYP.isSLS(cacheSloR.trd_ptn_typ())) {
							
							up3R.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value()); 
							up3R.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value());
						}
						else {
							up3R.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
							up3R.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
						}
						
						up3R.io_schd_no(waitR.ship_alloc_sts_no());
						
						ope.up3().add(up3R);
					}
					MCSavepoint sp = dbTran().setSavepoint();
					
					//引当前に、該当受注自身の引当保留となっている受払予定を削除する（引当対象のみ）
					delIoSchdAllocWait();
					
					ope.exec();
					dbTran().rollback(sp);
					
					// 追加引当分のみ出荷引当状況を作成する
					_waitAllocRsltL.setAll(ope.down0());
					createAllocSloSts(oldShipPrR);
					
					_allocRsltL.addAll(ope.down0());
				}
			}
		}
		
		/**
		 * 引当前に、該当受注自身の引当保留となっている受払予定を削除する。（引当対象のみ）
		 */
		protected void delIoSchdAllocWait() {
			
			MCList<MST_SHIP_ALLOC_STS_R> allocWaitL = getAllocWait();
			
			MCList<MSW_IO_SCHD_DEL_R> ioSchdDelL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			
			MSW_IO_SCHD_DEL_R ioSchdDelR = null;
			
			for (MST_SHIP_ALLOC_STS_R allocWaitR : allocWaitL) {
				
				MST_SLO_D_R oldSloDR = getFirstSloDCache(allocWaitR.getStringNE(MST_SLO_D_R.$slo_d_no));
				MST_SLO_R oldSloR = getSloCache(oldSloDR.slo_no());
				
				ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
				
				String trdPtnTyp = null;
				
				if (MAC_TRD_PTN_TYP.isSHIP(oldSloR.trd_ptn_typ()) 
						|| oldSloDR.vmi_flg()) {
					
					// 貸出出荷
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
					trdPtnTyp = MAC_TRD_PTN_TYP.SHIP.value();
				}
				else if (MAC_TRD_PTN_TYP.isSLS(oldSloR.trd_ptn_typ())) {
					
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
		protected MCList<MST_SHIP_ALLOC_STS_R> getAllocWait() {
			
			MCList<MST_SHIP_ALLOC_STS_R> allocWaitL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
			MCQueryApiBuilder allocWait_bldr = MCQueryApiBuilder.create(t);
			
			allocWaitL.addStringColumn(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			allocWaitL.addStringColumn(MST_SHIP_SCHD_R.$slo_prms_no);
			allocWaitL.addStringColumn(MST_SLO_D_R.$slo_d_no);
			
			allocWait_bldr.setSelect(t.ship_alloc_sts_no);
			allocWait_bldr.addSelect(t1.dlv_inst_rcpt_no);
			allocWait_bldr.addSelect(t1.slo_prms_no);
			allocWait_bldr.addSelect(t3.slo_d_no);
			
			allocWait_bldr.addInnerJoin(t1, t1.ship_schd_no.eq(t.ship_schd_no));
			allocWait_bldr.addInnerJoin(t2, t2.ship_pr_no.eq(t1.ship_pr_no));
			allocWait_bldr.addInnerJoin(t3, t3.slo_d_no.eq(t2.slo_d_no));
			
			allocWait_bldr.setWhere(t3.slo_d_no.eq(bind("slo_d_no")));
			allocWait_bldr.addWhereWithAnd(t.alloc_wait_flg.eq(value(true)));
			
			dbSelect("MSBBL6230_MST_SHIP_ALLOC_STS_S04", allocWaitL, allocWait_bldr, _sloGrpL);
			
			return allocWaitL;
		}

		/**
		 * 受注明細を元に 納入指示に紐付かない出荷予定の引当情報を作成する。
		 * @param sloR 受注
		 * @param sloDR 受注明細
		 * @param shipPrR 出荷進捗
		 * @param baseUnitQty 引当数量(基準単位)
		 * @return　引当情報
		 */
		protected Srch_TgtR crtNoDlvInstShipSchdAlloc(MST_SLO_R sloR, MST_SLO_D_R sloDR, MST_SHIP_PR_R shipPrR, MCNumber baseUnitQty) {

			Srch_TgtR alcR = Srch_TgtR.create();
			copy(alcR, sloDR, sloR, createMap_Srch_TgtR_MST_SLO_D_R());
			
			if (_shipPrPegNoMap.containsKey(shipPrR.ship_pr_no())) {
				alcR.peg_no(_shipPrPegNoMap.get(shipPrR.ship_pr_no()));
			}
			else {
				
				_maxPegNo = _maxPegNo.add(1);
				alcR.peg_no(_maxPegNo);
				_shipPrPegNoMap.put(shipPrR.ship_pr_no(), _maxPegNo);
			}
			
			if (sloDR.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				alcR.gi_schd_dt(sloDR.sls_schd_dt());
			}

			ShipSchd_DtlR schdR = crtNoDlvInstShipSchd(sloDR, shipPrR);
			
			if (!sloDR.sls_cststk_flg()) {
				alcR.gi_schd_dt(schdR.ship_schd_tm().startTimeOfDay());
			}
			alcR.gr_schd_dt(schdR.dlv_schd_tm().startTimeOfDay());
			
			alcR.vld_dt_fr(schdR.vld_dt_fr());
			alcR.vld_dt_fr_grp(schdR.getNumberNE("vld_dt_fr_grp"));
			alcR.vld_dt_to(schdR.vld_dt_to());
			
			alcR.base_unit_qty(baseUnitQty);
			
			setPackUnitQty(alcR);
			
			alcR.cst_cd(sloR.cst_cd());
			
			return alcR;
		}
		
		/**
		 * 引当解除前のチェック処理を実行する
		 */
		protected void callStkAllocRelChk() {
			
			MSBEL_ShipSchdService.ShipSchd_Chk06 opeChk = MSBEL_ShipSchdService.crtShipSchd_Chk06();
			
			if (!_stkAllocRelOpe.up0().isEmpty()) {
				
				opeChk.up0().addAll(_stkAllocRelOpe.up0());
				opeChk.exec();
				
				throwUpdErr();
			}
		}
		
		/**
		 * 引当解除を実行する
		 */
		protected void callStkAllocRel() {
			
			if (!_stkAllocRelOpe.up0().isEmpty()) {
				_stkAllocRelOpe.exec();
			}
		}
		
		/**
		 * 引当処理の実行(引当解除分)<br>
		 * 出荷予定の変更前に引当数量を保持する。
		 */
		protected void callStkAllocForRel() {

			//引当を実行する
			if (!_stkAllocForRelOpe.up1().isEmpty()) {
				
				_stkAllocForRelOpe.exec();
				
				_allocRsltL.addAll(_stkAllocForRelOpe.down0());
			}
		}
		
		/**
		 * 預り売上済みの明細は再引当しないように調整する。
		 * @param sloDNo 受注明細ＮＯ
		 * @param srchTgtR 引当情報
		 */
		protected void adjAllocSlsAct(String sloDNo, MCList<Srch_TgtR> srchTgtL) {
				
			MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(sloDNo);
			
			MCIndexKey shipSchdIdxKey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			
			MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(shipSchdIdxKey, oldShipPrR.ship_pr_no());
			
			MCList<MST_SHIP_SCHD_R> slsActShipSchdL = oldShipSchdL.createInstance(); 
			
			for (MST_SHIP_SCHD_R shipSchdR: _cacheShipSchdL) {
				if (!isNull(shipSchdR.sls_act_d_no())) {
					slsActShipSchdL.add(shipSchdR.clone());
				}
			}
			
			MCNumber slsActQty = nvl(slsActShipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty), MCNumber.ZERO);
			
			MCIndexKey idxkey = up0().createIndex(DlvInstRcv_Upd01_DtlR.$slo_d_no, DlvInstRcv_Upd01_DtlR.$data_crud_typ);
			
			slsActQty = slsActQty.subtract(nvl(up0().subList(idxkey, new Comparable<?>[] {sloDNo, null}).sum(DlvInstRcv_Upd01_DtlR.$base_unit_qty), MCNumber.ZERO));
			
			if (slsActQty.isPositive()) {
				
				MCList<Srch_TgtR> allocSrchTgtL = srchTgtL.createInstance();
				
				Srch_TgtR allocSrchTgtR = null;
				
				for (Srch_TgtR srchTgtR : srchTgtL) {
					
					if (slsActQty.gte(srchTgtR.base_unit_qty())) {
						
						slsActQty = slsActQty.subtract(srchTgtR.base_unit_qty());
						continue;
					}
					else{
						
						allocSrchTgtR = srchTgtR.clone();
						
						allocSrchTgtR.base_unit_qty(srchTgtR.base_unit_qty().subtract(slsActQty));
						
						if (!isNull(allocSrchTgtR.pack_unit_cd())) {
							
							if (!isSame(allocSrchTgtR.pack_unit_cd(), allocSrchTgtR.base_unit_cd())) {
								
								MAVM_ITM_UNIT_R itmUnitR = getItmUnit(
										allocSrchTgtR.itm_cd(), 
										allocSrchTgtR.itm_sub1(), 
										allocSrchTgtR.itm_sub2(), 
										allocSrchTgtR.itm_sub3(), 
										allocSrchTgtR.pack_unit_cd());
								
								allocSrchTgtR.pack_unit_qty(rvrsBaseUnitConv(
										allocSrchTgtR.base_unit_qty(), 
										itmUnitR.conv_base_qty(), 
										itmUnitR.conv_qty(), 
										itmUnitR.dec_place(), 
										itmUnitR.rnd_typ()));
							}
							else {
								allocSrchTgtR.pack_unit_qty(allocSrchTgtR.base_unit_qty());
							}	
						}
						
						allocSrchTgtL.add(allocSrchTgtR);
					}
				}
				
				srchTgtL.setAll(allocSrchTgtL);
			}
		}
		
		/**
		 * .出荷予定サービスの呼び出し
		 */
		protected void callShipSchdService() {
			
			//出荷予定、出荷引当状況の作成,出荷進捗を更新しないため、出荷予定サービス.更新（出荷予定）（MSBEL5500.ShipSchd_Upd02）を実行する。
			MSBEL_ShipSchdService.ShipSchd_Upd02 op = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			MSBEL_ShipSchdService.ShipSchd_Chk02 opChk = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			
			MCIndexKey up0Idxkey = up0().createIndex(DlvInstRcv_Upd01_DtlR.$slo_d_no);
			MCIndexKey shipSchd = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpL) {
				
				//キャッシュから対応する更新前の受注明細を取得する。
				MST_SLO_D_R oldSloDR = getFirstSloDCache(grpR.slo_d_no());
				MST_SLO_R cacheSloR = getSloCache(oldSloDR.slo_no());
				
				MCList<DlvInstRcv_Upd01_DtlR> dtlDlvInstRcvL = up0().subList(up0Idxkey, grpR.slo_d_no());
				//仕入直送の場合はこの処理は不要。
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(oldSloDR.proc_typ()) || !needReAllocAndUpdShipSchd(dtlDlvInstRcvL, oldSloDR)) {
					continue;
				}
				//キャッシュから対応する更新前の出荷進捗を取得する。
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(grpR.slo_d_no());				
				//キャッシュから対応する更新前の出荷予定を取得する。
				MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(shipSchd, oldShipPrR.ship_pr_no());
				MCIndexKey oldShipSchdIdxkey = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);

				//既存の出荷予定を削除してから、受注明細、納入指示受領を元に出荷予定再作成する。					
				MCNumber totalQty = oldSloDR.trd_unit_qty();
				
				for (MST_SHIP_SCHD_R shipSchdR : oldShipSchdL) {
					//打切したレコード、確定したレコードは対象外とする。
					if (!shipSchdR.abort_flg() 
							&& !shipSchdR.fix_flg()
							&& !shipSchdR.re_ship_schd_flg()
							&& shipSchdR.ship_inst_qty().isZero()
							&& shipSchdR.ship_act_qty().isZero()
							&& (oldSloDR.sls_cststk_flg() || shipSchdR.sls_qty().isZero())
							&& shipSchdR.iv_schd_qty().isZero()
							&& isNull(shipSchdR.dlv_inst_rcpt_no())) {
						
						//既存の出荷予定を削除するための上り電文の作成					
						ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
						_maxPegNo = _maxPegNo.add(1);
						schdR.peg_no(_maxPegNo);
						schdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						schdR.ship_pr_no(shipSchdR.ship_pr_no());
						schdR.ship_schd_no(shipSchdR.ship_schd_no());
						op.up1().add(schdR);
					}

					if (isNull(shipSchdR.dlv_inst_rcpt_no()) 
							&& (shipSchdR.abort_flg() 
							|| shipSchdR.fix_flg()
							|| shipSchdR.ship_inst_qty().isPositive()
							|| shipSchdR.ship_act_qty().isPositive()
							|| (!oldSloDR.sls_cststk_flg() && shipSchdR.sls_qty().isPositive())
							|| shipSchdR.iv_schd_qty().isPositive())) {
						
						totalQty = totalQty.subtract(shipSchdR.trd_unit_qty());
					}
				}

				//納入指示受領に対応する出荷予定を作成・更新・削除する。
				for (DlvInstRcv_Upd01_DtlR dtlR : up0()) {
					if (isSame(dtlR.slo_d_no(), grpR.slo_d_no())) {
						
						MCList<MST_SHIP_SCHD_R> oldDlvInstReptShipSchdL = null;
								
						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) 
								|| isNull(dtlR.data_crud_typ())
								|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							
							oldDlvInstReptShipSchdL = oldShipSchdL.subList(oldShipSchdIdxkey, dtlR.dlv_inst_rcpt_no());
							
							boolean afterExeFlg = false;
							for (MST_SHIP_SCHD_R shipSchdR : oldDlvInstReptShipSchdL) {
								
								if (shipSchdR.abort_flg() 
										|| shipSchdR.fix_flg()
										|| shipSchdR.ship_inst_qty().isPositive()
										|| shipSchdR.ship_act_qty().isPositive()
										|| (!oldSloDR.sls_cststk_flg() && shipSchdR.sls_qty().isPositive())
										|| shipSchdR.iv_schd_qty().isPositive()) {
									
									afterExeFlg = true;
									break;
								}
							}
							
							if (afterExeFlg) {
								totalQty = totalQty.subtract(dtlR.trd_unit_qty());
								continue;
							}
						}

						if (isNull(dtlR.data_crud_typ())) {
							dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						}
						if (!totalQty.isPositive() && !MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							continue;
						}
						
						ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
						copy(schdR, oldSloDR, dtlR, createMap_ShipSchd_DtlR_MST_SLO_D_R());
						schdR.not_dt_calc_flg();
						if (totalQty.gte(dtlR.trd_unit_qty())) {
							schdR.trd_unit_qty(dtlR.trd_unit_qty()); //取引単位数量
							schdR.base_unit_qty(dtlR.base_unit_qty()); //基準単位数量
						}
						else {
							schdR.trd_unit_qty(totalQty); //取引単位数量
							schdR.base_unit_qty(getBaseUnitQty(
									totalQty, dtlR.trd_unit_cd(), 
									oldSloDR.itm_cd(), 
									oldSloDR.itm_sub1(), 
									oldSloDR.itm_sub2(), 
									oldSloDR.itm_sub3())); //基準単位数量
						}
						
						//出荷物流グループＣＤ
						if (isNull(schdR.ship_fr_lg_grp_cd())){
							schdR.ship_fr_lg_grp_cd(getShipFrLgGrpCd(oldSloDR));
						}
						//ワーキンググループＣＤ
						MAM_LG_GRP_R lgGrpR = getLgGrp(schdR.ship_fr_lg_grp_cd());
						schdR.wg_cd(lgGrpR.wg_cd());
						
						schdR.ship_pr_no(oldShipPrR.ship_pr_no()); //出荷進捗ＮＯ
						schdR.trd_rmrks(cacheSloR.trd_rmrks()); //取引備考
						//出荷留めFLGの設定する:変更前の出荷予定レコードの中に、１件以上が留める場合、留めFLG＝オンとする
						boolean brockFlg = false;
						if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())){
							for (MST_SHIP_SCHD_R r : oldShipSchdL){
								if (isNull(r.dlv_inst_rcpt_no()) && r.ship_block_flg()){
									brockFlg = true;
									break;
								}
							}
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())){
							for (MST_SHIP_SCHD_R r : oldShipSchdL){
								if (isSame(r.dlv_inst_rcpt_no(), schdR.dlv_inst_rcpt_no()) && r.ship_block_flg()){
									brockFlg = true;
									break;
								}								
							}
						}
						schdR.ship_block_flg(brockFlg);
						
						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) 
								|| isNull(dtlR.data_crud_typ())
								|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							
							if (isNull(oldDlvInstReptShipSchdL) || oldDlvInstReptShipSchdL.isEmpty()) {
								// 納入指示受領に紐付く出荷予定が存在しない、出荷予定を新規作成する。
								if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
									dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								}
								else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
									continue;
								}
							}
							else {
								
								if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
									
									for (MST_SHIP_SCHD_R oldDlvInstReptShipSchdR : oldDlvInstReptShipSchdL) {
										
										ShipSchd_DtlR delShipSchdR = ShipSchd_DtlR.create();
										
										_maxPegNo = _maxPegNo.add(1);
										delShipSchdR.peg_no(_maxPegNo);
										delShipSchdR.ship_schd_no(oldDlvInstReptShipSchdR.ship_schd_no());
										delShipSchdR.ship_pr_no(schdR.ship_pr_no());
										delShipSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
										op.up1().add(delShipSchdR);
									}
								}
								else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
									
									MST_DLV_INST_RCPT_R oldDlvInstrcptR = _cacheDlvinstRcptL
											.getFirst(_dlvInstRcptKey, dtlR.dlv_inst_rcpt_no());
									
									// 確定してない、打切りではない、後続処理を行ってない出荷予定を抽出する。
									MCIndexKey idxkey = oldDlvInstReptShipSchdL.createIndex(
											MST_SHIP_SCHD_R.$fix_flg, 
											MST_SHIP_SCHD_R.$abort_flg, 
											MST_SHIP_SCHD_R.$ship_inst_qty,
											MST_SHIP_SCHD_R.$ship_act_qty,
											MST_SHIP_SCHD_R.$iv_schd_qty);
									Comparable<?>[] vals = new Comparable<?>[] {false, false, MCNumber.ZERO, MCNumber.ZERO};
									MCList<MST_SHIP_SCHD_R> subShipSchdL = oldDlvInstReptShipSchdL.subList(idxkey, vals).subList(
											r->(oldSloDR.sls_cststk_flg() || r.sls_qty().isZero()));
									subShipSchdL.sort(SortType.DESC_NULL_AHEAD, MST_SHIP_SCHD_R.$sls_act_d_no, MST_SHIP_SCHD_R.$alloc_qty);
									
									for (int i = 0; i < subShipSchdL.size(); i++) {
										
										MST_SHIP_SCHD_R subShipSchdR = subShipSchdL.get(i);
										if (i == 0) {
											schdR.ship_schd_no(subShipSchdR.ship_schd_no());
										}
										else {
											
											ShipSchd_DtlR delShipSchdR = ShipSchd_DtlR.create();
											
											_maxPegNo = _maxPegNo.add(1);
											delShipSchdR.peg_no(_maxPegNo);
											
											delShipSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
											delShipSchdR.ship_pr_no(subShipSchdR.ship_pr_no());
											delShipSchdR.ship_schd_no(subShipSchdR.ship_schd_no());
											
											op.up1().add(delShipSchdR);
										}
									}
									
									if (isNull(schdR.ship_schd_no())) {
										schdR.ship_schd_no(oldDlvInstReptShipSchdL.get(0).ship_schd_no());
									}
									
									if (oldDlvInstReptShipSchdL.size() == 1 
											&& isSame(dtlR.dlv_rqst_tm(), oldDlvInstrcptR.dlv_rqst_tm())
											&& oldDlvInstReptShipSchdL.get(0).not_dt_calc_flg()) {
										// 納入指示受領の納入希望日時が変更なし、かつ　納入指示後に出荷予定が分割されてない場合に、出荷予定日時、納品予定日時を保持する。
										
										schdR.not_dt_calc_flg(true);
										schdR.ship_schd_tm(oldDlvInstReptShipSchdL.get(0).ship_schd_tm());
										schdR.dlv_schd_tm(oldDlvInstReptShipSchdL.get(0).dlv_schd_tm());
									}
								}
							}
						}
						
						if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							op.up1().add(schdR);
							totalQty = totalQty.subtract(dtlR.trd_unit_qty());
						}
					}
				}
				//納入指示受領に対応しない出荷予定を新規作成のための上り電文の作成
				if (totalQty.gt(0)) {
					
					ShipSchd_DtlR schdR = crtNoDlvInstShipSchd(oldSloDR, oldShipPrR);
					
					if (_shipPrPegNoMap.containsKey(oldShipPrR.ship_pr_no())) {
						schdR.peg_no(_shipPrPegNoMap.get(oldShipPrR.ship_pr_no()));
					}
					else {
						_maxPegNo = _maxPegNo.add(1);
						schdR.peg_no(_maxPegNo);
						_shipPrPegNoMap.put(oldShipPrR.ship_pr_no(), _maxPegNo);
					}
					
					schdR.trd_unit_qty(totalQty); //取引単位数量
					//基準単位数量の算出
					MCNumber baseQty = getBaseUnitQty(totalQty, oldSloDR.trd_unit_cd(),
							oldSloDR.itm_cd(), oldSloDR.itm_sub1(), oldSloDR.itm_sub2(),
							oldSloDR.itm_sub3());
					schdR.base_unit_qty(baseQty); //基準単位数量
					schdR.trd_rmrks(cacheSloR.trd_rmrks()); //取引備考
					boolean brockFlg = false;
					for (MST_SHIP_SCHD_R r : oldShipSchdL){
						if (isSame(r.dlv_inst_rcpt_no(), schdR.dlv_inst_rcpt_no()) && r.ship_block_flg()){
							brockFlg = true;
							break;
						}
					}
					schdR.ship_block_flg(brockFlg);
					op.up1().add(schdR);
				}
			}
			
			divShipSchd(op.up1(), op.up2());
			divAllocRslt(op.up1(), op.up2());
			checkShipLotForslsCststk(op.up1(), op.up2());
			
			//チェックサービスを実行する。
			opChk.up0().addAll(op.up1());
			if (!opChk.up0().isEmpty()){
				opChk.exec();
				
				throwUpdErr();
			}
			
			delSloPrms(op.up1());
			op.up0().lot_chk_flg(false);
			op.exec();
		}
		
		
		/**
		 * 出荷予定に紐付く納期回答情報を取得する。
		 */
		protected MCList<MST_SLO_PRMS_R> getSloPrmsL() {
			MCList<MST_SLO_PRMS_R> allPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			MST_SLO_PRMS_R alPrmsL_t = MST_SLO_PRMS_R.create("T");
			MCQueryApiBuilder alPrmsL_bldr = MCQueryApiBuilder.create(alPrmsL_t);
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			alPrmsL_bldr.addInnerJoin(t2, alPrmsL_t.slo_prms_no.eq(t2.slo_prms_no));
			alPrmsL_bldr.setWhere(alPrmsL_t.slo_d_no.eq(bind("slo_d_no")));
			dbSelect("MSBBL6230_MST_SLO_PRMS_S01", allPrmsL, alPrmsL_bldr, _sloGrpAllL);
			
			return allPrmsL;
		}
		
		/**
		 * 出荷予定に紐づかない納期回答情報を削除し、インフォメーションを出力する。
		 */
		protected void delSloPrms(MCList<ShipSchd_DtlR> shipSchdDL) {
			MCList<MST_SLO_PRMS_R> delL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> lineDelL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> updL = MCList.create(MST_SLO_PRMS_R.class);
			MCList<MST_SLO_PRMS_R> allPrmsL = getSloPrmsL();
			setSloPrmsRev(allPrmsL);
			MCIndexKey idxKey = shipSchdDL.createIndex(ShipSchd_DtlR.$ship_pr_no);
			MCIndexKey idxPrmsKey = allPrmsL.createIndex(MST_SLO_PRMS_R.$slo_prms_no);
			MCIndexKey idxSloPrmsKey = allPrmsL.createIndex(MST_SLO_PRMS_R.$slo_d_no);
			MCIndexKey idxShipSchdkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			MCIndexKey idxShipSchdSloPrmskey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$slo_prms_no);
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpL) {
				
				MCList<MST_SLO_PRMS_R> shipSchdPrmsL = MCList.create(MST_SLO_PRMS_R.class);
				MST_SHIP_PR_R cacheshipPrR = getFirstShipPrCache(grpR.slo_d_no());
				MST_SLO_D_R oldSloDR = getFirstSloDCache(grpR.slo_d_no());
				MCList<ShipSchd_DtlR> shipSchdL = shipSchdDL.subList(idxKey, cacheshipPrR.ship_pr_no());
				MCList<MST_SLO_PRMS_R> sloPrmsGrpL = allPrmsL.subList(idxSloPrmsKey, grpR.slo_d_no());
				boolean delFlg = false;
				boolean updFlg = false;
				Set<String> sloPrmsNo = new HashSet<String>();
				
				for (ShipSchd_DtlR r : shipSchdL) {
					
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						MST_SHIP_SCHD_R shipSchdR = _cacheShipSchdL.getFirst(idxShipSchdkey, r.ship_schd_no());
						MST_SLO_PRMS_R shipSchdPrmsR = allPrmsL.getFirst(idxPrmsKey, shipSchdR.slo_prms_no());
						
						if (!isNull(shipSchdPrmsR)) {
							sloPrmsNo.add(shipSchdPrmsR.slo_prms_no());
						}
					}
				}
				
				for (MST_SLO_PRMS_R r : sloPrmsGrpL) {
					MST_SLO_PRMS_R updR = r.clone();
					MST_SLO_PRMS_R shipSchdPrmsR = r.clone();
					MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(idxShipSchdSloPrmskey, r.slo_prms_no());
					
					boolean afterExeFlg = false;
					for (MST_SHIP_SCHD_R oldShipSchdR : oldShipSchdL) {
						
						if (oldShipSchdR.abort_flg() 
								|| oldShipSchdR.fix_flg()
								|| oldShipSchdR.ship_inst_qty().isPositive()
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

					if (!sloPrmsNo.contains(r.slo_prms_no())) {
						updR.slo_prms_rev(_sloPrmsRevMap.get(updR.slo_d_no()));
						updL.add(updR);
						delFlg = true;
						updFlg = true;
					}
					
					shipSchdPrmsR.can_flg(true);
					shipSchdPrmsL.add(shipSchdPrmsR);
				}

				if (!shipSchdPrmsL.isEmpty()) {
					
					if (!updFlg) {
						delL.addAll(shipSchdPrmsL);
						delFlg = true;
					}
					else {
						for (MST_SLO_PRMS_R r : shipSchdPrmsL) {
							MST_SLO_PRMS_R delR = r.clone();

							if (sloPrmsNo.contains(r.slo_prms_no())) {
								delR.can_flg(true);
								lineDelL.add(delR);
								delFlg = true;
							}
						}
					}
				}
				
				if(delFlg) {
					MCMessagePool.add(new MCMessage(grpR, null, MSBBL0279, grpR.slo_d_no(), toDispGUIIndex(grpR)));
				}
			}
			
			if (!updL.isEmpty()) {
				MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
				execDbUpdate("MSBBL6230_MST_SLO_PRMS_U01", dbc, updL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
				updSloPrmsPR(updL);
				updSloPrmsH(updL, false);
			}
			
			if (!delL.isEmpty()) {
				MST_SLO_PRMS_R dbc = MST_SLO_PRMS_R.create("T");
				execDbUpdate("MSBBL6230_MST_SLO_PRMS_U02", dbc, delL, dbc.slo_prms_no.eq(bindEx("slo_prms_no")));
				updSloPrmsPR(delL);
				updSloPrmsH(delL, true);
			}
			
			if (!lineDelL.isEmpty()) {
				MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
				MCQueryApiBuilder lineDelL_bldr = MCQueryApiBuilder.create(t);
				lineDelL_bldr.setSet(t.can_flg);
				dbUpdateKey("MSBBL6230_MST_SLO_PRMS_U03", lineDelL, lineDelL_bldr);
			}
		}
		
		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 受注納期回答改訂履歴テーブルを更新する。
		 * @param sloPrmsL 受注納期回答リスト 
		 */
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
		
		protected void updSloPrmsH(MCList<MST_SLO_PRMS_R> sloPrmsL, boolean delFlg) {
			for (MST_SLO_PRMS_R r : sloPrmsL.groupBy("slo_d_no", "slo_prms_h_no")) {
				MST_SLO_PRMS_H_R sloPrmsHR = MST_SLO_PRMS_H_R.create();
				MST_SLO_PRMS_H_R t = MST_SLO_PRMS_H_R.create("T");
				MCQueryApiBuilder sloPrmsHR_bldr = MCQueryApiBuilder.create(t);
				sloPrmsHR_bldr.addWhereWithAnd(t.slo_d_no.eq(bind("slo_d_no")));
				sloPrmsHR_bldr.addWhereWithAnd(t.slo_prms_h_no.eq(bind("slo_prms_h_no")));
				sloPrmsHR_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
				dbSelect("MSBBL6230_MST_SLO_PRMS_H_S01", sloPrmsHR, sloPrmsHR_bldr, r);
				
				if (delFlg) {
					sloPrmsHR.can_flg(true);
					sloPrmsHR_bldr.addSet(t.can_flg);
					sloPrmsHR.prms_prnt_tm(null);
					sloPrmsHR_bldr.addSet(t.prms_prnt_tm);
					sloPrmsHR.slo_prms_prnt_flg(false);
					sloPrmsHR_bldr.addSet(t.slo_prms_prnt_flg);
				}
				else {
					sloPrmsHR.slo_prms_rev(_sloPrmsRevMap.get(r.slo_d_no()));
					sloPrmsHR_bldr.addSet(t.slo_prms_rev);
				}
				dbUpdateKey("MSBBL6230_MST_SLO_PRMS_H_U01", sloPrmsHR, sloPrmsHR_bldr);
			}
		}
		
		/**
		 * 受注納期回答改訂番号を設定する。
		 */
		protected void setSloPrmsRev(MCList<MST_SLO_PRMS_R> allPrmsL) {
			_sloPrmsRevMap = new HashMap<String, MCNumber>();
			
			for (DlvInstRcv_Upd01_DtlR dtlR : _sloGrpL) {
				MCNumber sloPrmsRev = getSloPrmsRev(dtlR);
				_sloPrmsRevMap.put(dtlR.slo_d_no(), sloPrmsRev);
			}
		}
		
		protected MCNumber getSloPrmsRev(DlvInstRcv_Upd01_DtlR dtlR) {
			
			MST_SLO_PRMS_R sloPrmsR = MST_SLO_PRMS_R.create();
			executeQuery(sloPrmsR, MSBBL6230_MST_SLO_PRMS_S01(), dtlR);
			MCNumber maxRev = nvl(sloPrmsR.slo_prms_rev(), MCNumber.ZERO);
			maxRev = maxRev.add(1);
			return maxRev;
		}
		
		/**
		 * 預り売上の場合、売上時にロットＮＯが設定されるため、有効期限チェック、ロット逆転チェックを行う。
		 */
		protected void checkShipLotForslsCststk(MCList<ShipSchd_DtlR> shipSchdL, MCList<Alloc_RsltR> allocRsltL) {
			
			MSBEL_ShipLotChkService.ShipLotChk_Chk01 shipLotChk = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
			
			MCIndexKey shipSchdIdxkey = shipSchdL.createIndex(ShipSchd_DtlR.$peg_no);
			MCIndexKey up0Idxket = up0().createIndex(DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_no);
			
			for (Alloc_RsltR allocRsltR : allocRsltL) {
				
				if (isNullOrNullVal(allocRsltR.lot_no()) && isNullOrNullVal(allocRsltR.sublot_no())) {
					continue;
				}
				
				ShipSchd_DtlR shipSchdR = shipSchdL.getFirst(shipSchdIdxkey, allocRsltR.peg_no());
				
				if (!isNull(shipSchdR) && !isNull(shipSchdR.sls_act_d_no()) 
						&& (MAC_DATA_CRUD_TYP.isCRT(shipSchdR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(shipSchdR.data_crud_typ()))) {
					DlvInstRcv_Upd01_DtlR dtlR = up0().getFirst(up0Idxket, shipSchdR.dlv_inst_rcpt_no());
					if (!isNull(dtlR)) {
						MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
						MST_SLO_R cacheSloR = getSloCache(oldSloDR.slo_no());
						
						if (oldSloDR.sls_cststk_flg() && !isNull(dtlR.dlv_cd())) {
							ShipLot_DtlR lotR = ShipLot_DtlR.create();
							lotR.peg_no(dtlR.peg_no());
							lotR.cst_cd(cacheSloR.cst_cd());
							lotR.dlv_cd(dtlR.dlv_cd());
							lotR.itm_cd(oldSloDR.itm_cd());
							lotR.itm_sub1(oldSloDR.itm_sub1());
							lotR.itm_sub2(oldSloDR.itm_sub2());
							lotR.itm_sub3(oldSloDR.itm_sub3());
							lotR.base_dt(dtlR.dlv_schd_tm().startTimeOfDay());
							lotR.lot_no(allocRsltR.lot_no());
							lotR.sublot_no(allocRsltR.sublot_no());
							shipLotChk.up0().add(lotR);
						}
					}
				}
			}
			if (!shipLotChk.up0().isEmpty()) {
				shipLotChk.exec();
				throwUpdErr();
			}
		}
		
		/**
		 * 受注明細を元に 納入指示に紐付かない出荷予定を作成する。
		 * @param sloDR 受注明細
		 * @param shipPrR 出荷進捗
		 * @return 出荷予定
		 */
		protected ShipSchd_DtlR crtNoDlvInstShipSchd(MST_SLO_D_R sloDR, MST_SHIP_PR_R shipPrR) {
			
			ShipSchd_DtlR schdR = ShipSchd_DtlR.create();
			
			copy(schdR, sloDR, shipPrR, createMap_Slo_ShipSchd_DtlR_MST_SLO_D_R());
			
			//出荷物流グループＣＤ
			if (isNull(schdR.ship_fr_lg_grp_cd())){
				schdR.ship_fr_lg_grp_cd(getShipFrLgGrpCd(sloDR));
			}
			//ワーキンググループＣＤ
			MAM_LG_GRP_R lgGrpR = getLgGrp(schdR.ship_fr_lg_grp_cd());
			schdR.wg_cd(lgGrpR.wg_cd());
			
			// 出荷予定日、納品予定日を計算する。
			callShipSchdDtServiceSrch02(sloDR, schdR);
			
			// 出荷予定の有効期限ＦＲＯＭ、有効期限ＴＯを算出する。
			callShipLotChkSrch01(sloDR, schdR);
			
			return schdR;
		}
		
		/**
		 * 引当保留の出荷引当状況を取得する。
		 * @param shipPrR 出荷進捗
		 */
		protected void getWaitShipAllocSts(MST_SHIP_PR_R shipPrR) {
			
			_waitShipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder waitShipAllocStsL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			
			waitShipAllocStsL_bldr.setSelect(t.ship_alloc_sts_no, t.io_schd_pr_no);
			
			waitShipAllocStsL_bldr.addInnerJoin(t1, t1.ship_schd_no.eq(t.ship_schd_no));
			
			waitShipAllocStsL_bldr.setWhere(t1.ship_pr_no.eq(bind("1")), shipPrR.ship_pr_no());
			waitShipAllocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(false)));
			waitShipAllocStsL_bldr.addWhereWithAnd(t.alloc_wait_flg.eq(value(true)));
			dbSelect("MSBBL6230_MST_SHIP_ALLOC_STS_S02", _waitShipAllocStsL, waitShipAllocStsL_bldr);
		}
		
		/**
		 * 荷姿単位数量を設定する。
		 * @param alcR 引当情報
		 */
		protected void setPackUnitQty(Srch_TgtR alcR) {
			
			if (!isNull(alcR.pack_unit_cd())) {
				
				if (!isSame(alcR.pack_unit_cd(), alcR.base_unit_cd())) {
					
					MAVM_ITM_UNIT_R packItmUnitR = getItmUnit(
							alcR.itm_cd(), 
							alcR.itm_sub1(), 
							alcR.itm_sub2(), 
							alcR.itm_sub3(), 
							alcR.pack_unit_cd());

					alcR.pack_unit_qty(rvrsBaseUnitConv(
							alcR.base_unit_qty(), 
							packItmUnitR.conv_base_qty(), 
							packItmUnitR.conv_qty(), 
							packItmUnitR.dec_place(), 
							packItmUnitR.rnd_typ()));
				}
				else {
					alcR.pack_unit_qty(alcR.base_unit_qty());
				}
			}
		}
		
		/**
		 * 出荷予定日計算サービスの出荷予定日計算を呼び出す。<br>
		 * 出荷予定に対して、出荷予定日、納品予定日を出荷予定日計算サービスで再計算する。
		 * @param sloDR 受注明細
		 * @param shipSchdR 出荷予定
		 */
		protected void callShipSchdDtServiceSrch02(MST_SLO_D_R sloDR, ShipSchd_DtlR shipSchdR) {
			
			MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 ope = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
			MST_SLO_R sloR = getSloCache(sloDR.slo_no());
			
			MSW_SHIP_SCHD_DT_CALC_R opeUp0R = MSW_SHIP_SCHD_DT_CALC_R.create();
			copy(opeUp0R, sloDR, createMap_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R());
			opeUp0R.base_dt(sloR.slo_dt());
			setPegNo(opeUp0R);
			ope.up0().add(opeUp0R);
			
			ope.exec();
			
			if (!ope.down0().isEmpty()) {
				
				if (!isNull(ope.down0().get(0).ship_schd_tm())) {
					shipSchdR.ship_schd_tm(ope.down0().get(0).ship_schd_tm());
				}
				
				if (!isNull(ope.down0().get(0).dlv_schd_tm())) {
					shipSchdR.dlv_schd_tm(ope.down0().get(0).dlv_schd_tm());
				}
				
				if (!isNull(ope.down0().get(0).ship_wk_cd())) {
					shipSchdR.ship_wk_cd(ope.down0().get(0).ship_wk_cd());
				}
			}	
		}
		
		/**
		 * 出荷予定の有効期限ＦＲＯＭ、有効期限ＴＯを算出する。
		 * @param sloDR 受注明細
		 * @param shipSchdR 出荷予定
		 */
		protected void callShipLotChkSrch01(MST_SLO_D_R sloDR, ShipSchd_DtlR shipSchdR) {
			
			MSBEL_ShipLotChkService.ShipLotChk_Srch01 shipLotSv = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
			MST_SLO_R cacheSloR = getSloCache(sloDR.slo_no());
				
			//手配区分＝在庫引当、引当後手配、手配依頼の場合のみ
			if (MAC_SLO_PROC_TYP.isALLOC(sloDR.proc_typ())
					|| MAC_SLO_PROC_TYP.isALLOC_PROC(sloDR.proc_typ())
					|| MAC_SLO_PROC_TYP.isPROC(sloDR.proc_typ())) {
				
				//明細のロットを指定した場合、ロットの有効期限が有効期限制御の条件を満たすかチェックする。
				ShipLot_DtlR lotR = ShipLot_DtlR.create();
				lotR.peg_no(0); //紐付けＮＯ
				lotR.cst_cd(cacheSloR.cst_cd()); //得意先ＣＤ
				lotR.dlv_cd(sloDR.dlv_cd()); //納品先ＣＤ
				lotR.itm_cd(sloDR.itm_cd()); //品目ＣＤ
				lotR.itm_sub1(sloDR.itm_sub1()); //枝番１
				lotR.itm_sub2(sloDR.itm_sub2()); //枝番２
				lotR.itm_sub3(sloDR.itm_sub3()); //枝番３
				lotR.base_dt(shipSchdR.dlv_schd_tm().startTimeOfDay()); //基準日
				lotR.lock_flg(false);
				lotR.lot_no(null);
				lotR.sublot_no(null);
				shipLotSv.up0().add(lotR);
			}
				
			if (shipLotSv.up0().size() > 0) {
				
				shipLotSv.exec();
				
				//下り電文を取得
				MCList<ShipLot_DtlR> retDL = shipLotSv.down0();
				if (retDL.size() > 0) {
					
					//有効期限（下限）
					shipSchdR.vld_dt_fr(retDL.get(0).valid_dt_fr());
					shipSchdR.setNumberNE("vld_dt_fr_grp", retDL.get(0).valid_dt_fr_grp());
					//有効期限（上限）
					shipSchdR.vld_dt_to(retDL.get(0).valid_dt_to());
				}
			}
		}
		
		/**
		 * 売上実績により、引当情報を分割する。
		 * @param shipSchdL 出荷予定リスト
		 */
		protected void divShipSchd(MCList<ShipSchd_DtlR> shipSchdL, MCList<Alloc_RsltR> allocRsltL) {
			
			shipSchdL.addNumberColumn("bef_peg_no");
			shipSchdL.setColumnValueNE("bef_peg_no", ShipSchd_DtlR.$peg_no);
			MCList<ShipSchd_DtlR> divShipSchdL = shipSchdL.createInstance();
			
			MCList<ShipSchd_DtlR> subDivShipSchdL = null;
			
			MCNumber maxPegNo = (MCNumber)shipSchdL.max(ShipSchd_DtlR.$peg_no);
			
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpL) {
				
				subDivShipSchdL = shipSchdL.createInstance();
				
				MST_SLO_D_R oldSloDR = getFirstSloDCache(grpR.slo_d_no());
				
				//キャッシュから対応する更新前の出荷進捗を取得する。
				MST_SHIP_PR_R oldShipPrR = getFirstShipPrCache(grpR.slo_d_no());
				
				//キャッシュから対応する更新前の出荷予定を取得する。
				MCList<ShipSchd_DtlR> shipPrShipSchdL = shipSchdL.subList(ShipSchd_DtlR.$ship_pr_no, oldShipPrR.ship_pr_no());
				MCList<MST_SHIP_SCHD_R> oldShipSchdL = getSlsShipSchdL(shipPrShipSchdL);
				MCIndexKey oldShipSchdIdxkey = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
				MCIndexKey oldShipSchdSlsActDIdxkey = oldShipSchdL.createIndex(MST_SHIP_SCHD_R.$sls_act_d_no);
				
				MCGroupByPolicy policy = new MCGroupByPolicy(MST_SHIP_SCHD_R.$sls_act_d_no);
				policy.sum(MST_SHIP_SCHD_R.$trd_unit_qty, MST_SHIP_SCHD_R.$base_unit_qty);
				
				MCList<MST_SHIP_SCHD_R> slsActGrpShipSchdL = oldShipSchdL.groupBy(policy);
				slsActGrpShipSchdL.sort(MST_SHIP_SCHD_R.$sls_act_d_no);
				
				MCNumber shipSchdQty = null;
				
				// 売上を計上したときの出荷予定ＮＯを保持するため、売上実績明細が設定されている出荷予定を優先に按分する。
				shipPrShipSchdL.setStringNE("sort", null);
				shipPrShipSchdL.forEach(r -> {
					MST_SHIP_SCHD_R oldShipSchdR = oldShipSchdL.getFirst(oldShipSchdIdxkey, r.ship_schd_no());
					if (!isNull(oldShipSchdR)) {
						r.setStringNE("sort", oldShipSchdR.sls_act_d_no());
					}
				});
				shipPrShipSchdL.sort("sort");
				
				for (ShipSchd_DtlR shipSchdR : shipPrShipSchdL) {
					
					if (MAC_DATA_CRUD_TYP.isDEL(shipSchdR.data_crud_typ())) {
						subDivShipSchdL.add(shipSchdR.clone());
						continue;
					}
					
					shipSchdQty = shipSchdR.base_unit_qty();
					// 売上を計上したときの出荷予定を優先に按分する。
					slsActGrpShipSchdL.setNumberNE("sort", null);
					slsActGrpShipSchdL.forEach(r -> {
						MST_SHIP_SCHD_R oldShipSchdR = oldShipSchdL.getFirst(oldShipSchdIdxkey, shipSchdR.ship_schd_no());
						if (!isNull(oldShipSchdR) && isSame(oldShipSchdR.sls_act_d_no(), r.sls_act_d_no())) {
							r.setNumberNE("sort", 1);
						}
					});
					slsActGrpShipSchdL.sort("sort", MST_SHIP_SCHD_R.$sls_act_d_no);
					
					for (MST_SHIP_SCHD_R slsActGrpShipSchdR : slsActGrpShipSchdL) {
						
						if (isNull(slsActGrpShipSchdR.sls_act_d_no()) || slsActGrpShipSchdR.base_unit_qty().isZero()) {
							continue;
						}
						
						if (shipSchdQty.isZero()) {
							break;
						}
						
						ShipSchd_DtlR divShipSchdR = shipSchdR.clone();
						maxPegNo = maxPegNo.add(1);
						divShipSchdR.peg_no(maxPegNo);
						
						divShipSchdR.sls_act_d_no(slsActGrpShipSchdR.sls_act_d_no());
						
						MST_SHIP_SCHD_R oldShipSchdR = oldShipSchdL.getFirst(oldShipSchdSlsActDIdxkey, slsActGrpShipSchdR.sls_act_d_no());
						divShipSchdR.stk_id_typ(oldShipSchdR.stk_id_typ());
						divShipSchdR.stk_bp_cd(oldShipSchdR.stk_bp_cd());
						
						if (shipSchdQty.gte(slsActGrpShipSchdR.base_unit_qty())) {
							
							divShipSchdR.trd_unit_qty(slsActGrpShipSchdR.trd_unit_qty());
							divShipSchdR.base_unit_qty(slsActGrpShipSchdR.base_unit_qty());
							
							shipSchdQty = shipSchdQty.subtract(slsActGrpShipSchdR.base_unit_qty());
							slsActGrpShipSchdR.trd_unit_qty(MCNumber.ZERO);
							slsActGrpShipSchdR.base_unit_qty(MCNumber.ZERO);
						}
						else {
							
							divShipSchdR.base_unit_qty(shipSchdQty);
							
							if (!isSame(divShipSchdR.trd_unit_cd(), divShipSchdR.base_unit_cd())) {
								
								MAVM_ITM_UNIT_R itmUnitR = getItmUnit(
										divShipSchdR.itm_cd(), 
										divShipSchdR.itm_sub1(), 
										divShipSchdR.itm_sub2(), 
										divShipSchdR.itm_sub3(), 
										divShipSchdR.trd_unit_cd());
								
								divShipSchdR.trd_unit_qty(rvrsBaseUnitConv(
										divShipSchdR.base_unit_qty(), 
										itmUnitR.conv_base_qty(), 
										itmUnitR.conv_qty(), 
										itmUnitR.dec_place(), 
										itmUnitR.rnd_typ()));
							}
							else {
								divShipSchdR.trd_unit_qty(divShipSchdR.base_unit_qty());
							}
							
							slsActGrpShipSchdR.trd_unit_qty(slsActGrpShipSchdR.trd_unit_qty().subtract(divShipSchdR.trd_unit_qty()));
							slsActGrpShipSchdR.base_unit_qty(slsActGrpShipSchdR.base_unit_qty().subtract(divShipSchdR.base_unit_qty()));
							shipSchdQty = MCNumber.ZERO;
						}
						// 同一出荷予定ＮＯが既に存在する場合、出荷予定を分割し、新規とする。
						if (!subDivShipSchdL.subList(r->!isNull(r.ship_schd_no()) 
								&& isSame(r.ship_schd_no(), shipSchdR.ship_schd_no()) 
								&& MAC_DATA_CRUD_TYP.isUPD(shipSchdR.data_crud_typ())).isEmpty()) {
							divShipSchdR.ship_schd_no(null);
							divShipSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
						
						subDivShipSchdL.add(divShipSchdR);
					}
					
					if (shipSchdQty.isPositive()) {
						
						ShipSchd_DtlR divShipSchdR = shipSchdR.clone();
						divShipSchdR.base_unit_qty(shipSchdQty);
						
						if (!isSame(divShipSchdR.trd_unit_cd(), divShipSchdR.base_unit_cd())) {
							
							MAVM_ITM_UNIT_R itmUnitR = getItmUnit(
									divShipSchdR.itm_cd(), 
									divShipSchdR.itm_sub1(), 
									divShipSchdR.itm_sub2(), 
									divShipSchdR.itm_sub3(), 
									divShipSchdR.trd_unit_cd());
							
							divShipSchdR.trd_unit_qty(rvrsBaseUnitConv(
									divShipSchdR.base_unit_qty(), 
									itmUnitR.conv_base_qty(), 
									itmUnitR.conv_qty(), 
									itmUnitR.dec_place(), 
									itmUnitR.rnd_typ()));
						}
						else {
							divShipSchdR.trd_unit_qty(divShipSchdR.base_unit_qty());
						}
						// 同一出荷予定ＮＯが既に存在する場合、出荷予定を分割し、新規とする。
						if (!subDivShipSchdL.subList(r->!isNull(r.ship_schd_no()) && isSame(r.ship_schd_no(), shipSchdR.ship_schd_no()) 
								&& MAC_DATA_CRUD_TYP.isUPD(shipSchdR.data_crud_typ())).isEmpty()) {
							divShipSchdR.ship_schd_no(null);
							divShipSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
						
						subDivShipSchdL.add(divShipSchdR);
					}
				}
				
				allocRsltL.addAll(getNoChngAllocSts(subDivShipSchdL, oldSloDR, oldShipPrR));
				// 売上を計上したときの出荷予定が「削除」と「新規」となっている場合、元の出荷予定を保持し、更新する形に調整する。
				// 売上を計上したときの出荷予定が「削除」と「更新」となっている場合、更新と削除の出荷予定ＮＯを入れ替わるように調整する。
				subDivShipSchdL.addBooleanColumn("remove");
				subDivShipSchdL.addBooleanColumn("done");
				for (ShipSchd_DtlR subDivShipSchdR : subDivShipSchdL) {
					if (MAC_DATA_CRUD_TYP.isDEL(subDivShipSchdR.data_crud_typ()) 
							&& isOriginalShipSchdSlsCststk(subDivShipSchdR.ship_schd_no())) {
						
						MST_SHIP_SCHD_R oldShipSchdR = oldShipSchdL.getFirst(oldShipSchdIdxkey, subDivShipSchdR.ship_schd_no());
						
						if (!isNull(oldShipSchdR)) {
							
							MCList<ShipSchd_DtlR> slsShipSchdL = subDivShipSchdL.subList(r->isSame(r.sls_act_d_no(), oldShipSchdR.sls_act_d_no()) 
									&& (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()))
									&& !r.getBooleanNE("done"));
							
							if (!slsShipSchdL.isEmpty()) {
								slsShipSchdL.sort(ShipSchd_DtlR.$peg_no);
								ShipSchd_DtlR slsSchdSchdR = slsShipSchdL.get(0);
								
								String originalShipSchdNo = subDivShipSchdR.ship_schd_no();
								if (MAC_DATA_CRUD_TYP.isUPD(slsSchdSchdR.data_crud_typ())) {
									subDivShipSchdR.ship_schd_no(slsSchdSchdR.ship_schd_no());
								}
								else {
									subDivShipSchdR.setBooleanNE("remove", true);
								}
								
								slsSchdSchdR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								slsSchdSchdR.ship_schd_no(originalShipSchdNo);
								slsSchdSchdR.setBooleanNE("done", true);
								slsSchdSchdR.dlv_upd_flg(true);
							}
						}
					}
				}
				MCIndexKey subDivShipSchdIdxkey = subDivShipSchdL.createIndex("remove");
				divShipSchdL.addAll(subDivShipSchdL.subList(subDivShipSchdIdxkey, false));
			}
			
			shipSchdL.setAll(divShipSchdL);
		}
		
		/**
		 * 引数に指定された出荷予定ＮＯが売上を計上したときの出荷予定かどうか。
		 * @param shipSchdNo 出荷予定ＮＯ
		 * @return 売上を計上したときの出荷予定の場合はtrue
		 */
		protected boolean isOriginalShipSchdSlsCststk(String shipSchdNo) {
			return !isNull(getSlsSchdCache(shipSchdNo));
		}
		
		protected MCList<MST_SHIP_SCHD_R> getSlsShipSchdL(MCList<ShipSchd_DtlR> shipSchdL) {
			
			MCIndexKey shipSchdIdx = shipSchdL.createIndex(ShipSchd_DtlR.$ship_schd_no);
			MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(
					r -> !isNull(shipSchdL.getFirst(shipSchdIdx, r.ship_schd_no())) && !isNull(r.sls_act_d_no()));
			
			// 出荷指図済または出荷済の売上実績を除外する
			MCList<MST_SHIP_SCHD_R> slsShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			for (MCList<MST_SHIP_SCHD_R> dlvInstGrpL : oldShipSchdL.groupList(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no)) {
				
				dlvInstGrpL.sort(SortType.DESC, MST_SHIP_SCHD_R.$ship_inst_qty, MST_SHIP_SCHD_R.$ship_act_qty);
				MST_SHIP_SCHD_R instGrpR = dlvInstGrpL.get(0);
				
				if (isNull(instGrpR.dlv_inst_rcpt_no())) {
					for (MST_SHIP_SCHD_R shipSchdR : dlvInstGrpL) {
						if (shipSchdR.ship_inst_qty().isZero() && shipSchdR.ship_act_qty().isZero()) {
							slsShipSchdL.add(shipSchdR);
						}
					}
				}
				else if (instGrpR.ship_inst_qty().isZero() && instGrpR.ship_act_qty().isZero()) {
					slsShipSchdL.addAll(dlvInstGrpL);
				}
			}
			
			return slsShipSchdL;
		}
		
		/**
		 * 変更なし出荷引当状況を返す。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @param sloDR 受注明細
		 * @param shipPrR 出荷進捗
		 * @return 出荷引当状況リスト
		 */
		protected MCList<Alloc_RsltR> getNoChngAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL, MST_SLO_D_R sloDR, MST_SHIP_PR_R shipPrR) {
			
			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);
			
			MCList<MST_SHIP_ALLOC_STS_R> allocStsL = getAllocSts(shipPrR);
			
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
				allocRsltL.addAll(getSlsActAllocSts(shipSchdDtlL, slsActAllocStsL, sloDR));
			}
			
			if (!shipSchdAllocStsL.isEmpty()) {
				allocRsltL.addAll(getShipSchdAllocSts(shipSchdDtlL, shipSchdAllocStsL, sloDR));
			}
			
			MCGroupByPolicy policy = new MCGroupByPolicy(getAllocGrpItm());
			policy.sum(Alloc_RsltR.$pack_unit_qty,
					Alloc_RsltR.$base_unit_qty);
			
			return allocRsltL.groupBy(policy);
		}
		
		/**
		 * 変更なし出荷予定の（預り売上実績済み以外)の出荷引当状況を分割する。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @param shipSchdAllocStsL 出荷引当状況リスト(預り売上済みを除く)
		 * @param sloDR 受注明細
		 * @return 出荷引当状況
		 */
		protected MCList<Alloc_RsltR> getShipSchdAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL, MCList<MST_SHIP_ALLOC_STS_R> shipSchdAllocStsL, MST_SLO_D_R sloDR) {
			
			MCList<Alloc_RsltR> allocRsltL = MCList.create(Alloc_RsltR.class);
			
			MCList<Alloc_RsltR> subAllocRsltL = null;
			
			MCIndexKey idxkey = _allocRsltL.createIndex(Srch_RsltR.$peg_no);
			MCIndexKey shipSchdAllocStsIdxkey = shipSchdAllocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
			
			for (ShipSchd_DtlR shipSchdDtlR : shipSchdDtlL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(shipSchdDtlR.data_crud_typ()) 
						|| !isNull(shipSchdDtlR.sls_act_d_no())
						|| _allocRsltL.contains(idxkey, shipSchdDtlR.peg_no())) {
					continue;
				}
				
				subAllocRsltL = MCList.create(Alloc_RsltR.class);
				
				setAll(subAllocRsltL, 
						shipSchdAllocStsL.subList(shipSchdAllocStsIdxkey, shipSchdDtlR.ship_schd_no()), 
						createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
				subAllocRsltL.setValueNE(Alloc_RsltR.$peg_no, shipSchdDtlR.peg_no());
				
				allocRsltL.addAll(subAllocRsltL);
			}
			
			allocRsltL.setValueNE(Alloc_RsltR.$itm_cd, sloDR.itm_cd());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub1, sloDR.itm_sub1());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub2, sloDR.itm_sub2());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub3, sloDR.itm_sub3());
			
			return allocRsltL;
		}
		
		/**
		 * 預り売上実績済みの出荷引当状況を分割する。
		 * @param shipSchdDtlL 出荷予定リスト
		 * @param slsActAllocStsL 売上済出荷引当状況リスト
		 * @param sloDR 受注明細
		 * @return 出荷引当状況
		 */
		protected MCList<Alloc_RsltR> getSlsActAllocSts(MCList<ShipSchd_DtlR> shipSchdDtlL, MCList<MST_SHIP_ALLOC_STS_R> slsActAllocStsL, MST_SLO_D_R sloDR) {
			
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
						allocStsR.pack_unit_qty(MCNumber.ZERO);
						allocStsR.base_unit_qty(MCNumber.ZERO);
					}
					else {
						
						allocRsltR.base_unit_qty(shipSchdQty);
						
						if (!isSame(allocRsltR.pack_unit_cd(), allocRsltR.base_unit_cd())) {
							
							MAVM_ITM_UNIT_R packItmUnitR = getItmUnit(
									sloDR.itm_cd(), 
									sloDR.itm_sub1(), 
									sloDR.itm_sub2(), 
									sloDR.itm_sub3(), 
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
			
			allocRsltL.setValueNE(Alloc_RsltR.$itm_cd, sloDR.itm_cd());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub1, sloDR.itm_sub1());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub2, sloDR.itm_sub2());
			allocRsltL.setValueNE(Alloc_RsltR.$itm_sub3, sloDR.itm_sub3());
			
			return allocRsltL;
		}
		
		/**
		 * 引当済の出荷引当状況を取得する。
		 * @param shipPrR 出荷進捗
		 * @return 出荷引当状況
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> getAllocSts(MST_SHIP_PR_R shipPrR) {
			
			MCList<MST_SHIP_ALLOC_STS_R> allocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocStsL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			
			allocStsL_bldr.addSelect(t2.ship_fr_lg_grp_cd);
			allocStsL_bldr.addSelect(t2.sls_act_d_no);
			allocStsL_bldr.setWhere(t2.ship_pr_no.eq(bind("1")), shipPrR.ship_pr_no());
			allocStsL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(true)));
			allocStsL_bldr.addWhereWithAnd(t2.ship_inst_qty.eq(value(0)));
			allocStsL_bldr.addWhereWithAnd(t2.ship_act_qty.eq(value(0)));
			allocStsL_bldr.addInnerJoin(t2, t2.ship_schd_no.eq(t.ship_schd_no));
			dbSelect("MSBBL6230_MST_SHIP_ALLOC_STS_S03", allocStsL, allocStsL_bldr);
			
			return allocStsL;
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
		 * 引当結果を分割する。
		 * @param shipSchdL 出荷予定リスト
		 * @param allocRsltL 引当状況区分リスト
		 */
		protected void divAllocRslt(MCList<ShipSchd_DtlR> shipSchdL, MCList<Alloc_RsltR> allocRsltL) {
			
			Alloc_RsltR allocRsltR = null;
			MCNumber allocQty = null;
			MCNumber allocQtySum = null;
			_allocRsltL.sort(Srch_RsltR.$peg_no);
			
			MCIndexKey idxkey = shipSchdL.createIndex(ShipSchd_DtlR.$ship_pr_no, ShipSchd_DtlR.$sls_act_d_no);
			MCIndexKey shipSchdIdxkey = shipSchdL.createIndex("bef_peg_no");
			MCIndexKey shipPrIdxkey = _cacheShipPrL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			MCIndexKey allocRsltIdxkey = _allocRsltL.createIndex(ShipSchd_DtlR.$peg_no);
			
			for (Srch_RsltR srchRsltR : _allocRsltL) {
				
				allocQty = srchRsltR.base_unit_qty();
				allocQtySum = nvl(_allocRsltL.subList(allocRsltIdxkey, srchRsltR.peg_no()).sum(Srch_RsltR.$base_unit_qty), MCNumber.ZERO);
						
				ShipSchd_DtlR allocShipSchdR = shipSchdL.getFirst(shipSchdIdxkey, srchRsltR.peg_no());
				
				String shipPrNo = null;
				
				if (!isNull(allocShipSchdR) && !allocShipSchdR.isEmpty()) {
					
					//キャッシュから対応する更新前の出荷進捗を取得する。
					shipPrNo = allocShipSchdR.ship_pr_no();
				}
				else {
					// peg_noで出荷進捗ＮＯを特定
					for(Map.Entry<String, MCNumber> entry : _shipPrPegNoMap.entrySet()){
						if (isSame(entry.getValue(), srchRsltR.peg_no())) {
							shipPrNo = entry.getKey();
							break;
						}
					}
				}
				
				MST_SHIP_PR_R shipPrR = _cacheShipPrL.getFirst(shipPrIdxkey, shipPrNo);
				
				MST_SLO_D_R sloDR = getFirstSloDCache(shipPrR.slo_d_no());
				
				if (!isNull(allocShipSchdR) && !allocShipSchdR.isEmpty() 
						&& isSame(allocShipSchdR.peg_no(), srchRsltR.peg_no()) 
						&& isNull(allocShipSchdR.sls_act_d_no())
						&& allocShipSchdR.base_unit_qty().gte(allocQtySum)) {
					
					allocRsltR = Alloc_RsltR.create();
					copy(allocRsltR, srchRsltR, createMap_Alloc_RsltR_Srch_RsltR());
					
					if ((MAC_ALLOC_SCOPE_TYP.isLOC(sloDR.alloc_scope_typ()) || MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(sloDR.alloc_scope_typ())) 
							&& allocRsltR.base_unit_qty().gt(0)) {
						
						allocRsltR.alloc_flg(true);
					}
					
					allocRsltL.add(allocRsltR);
				}
				else {
					MCList<ShipSchd_DtlR> allocShipSchdL = shipSchdL.subList(
							idxkey, shipPrNo, null);
					
					allocShipSchdL.sort(SortType.ASC, ShipSchd_DtlR.$dlv_inst_rcpt_no);
					
					for (ShipSchd_DtlR shipSchdR : allocShipSchdL) {
						MCIndexKey allocRsltIdxKey = allocRsltL.createIndex(Alloc_RsltR.$peg_no);
						
						if (MAC_DATA_CRUD_TYP.isDEL(shipSchdR.data_crud_typ()) || !isSame(shipSchdR.ship_fr_lg_grp_cd(), srchRsltR.stk_lg_grp_cd())) {
							continue;
						}
						
						MCNumber notAllocQty =  shipSchdR.base_unit_qty().subtract(
								nvl(allocRsltL.subList(allocRsltIdxKey, shipSchdR.peg_no()).sum(Alloc_RsltR.$base_unit_qty), MCNumber.ZERO));
						
						if (!notAllocQty.isPositive()) {
							continue;
						}
						
						if (allocQty.isZero()) {
							break;
						}
						
						allocRsltR = Alloc_RsltR.create();
						copy(allocRsltR, srchRsltR, createMap_Alloc_RsltR_Srch_RsltR());
						allocRsltR.peg_no(shipSchdR.peg_no());
						
						if ((MAC_ALLOC_SCOPE_TYP.isLOC(sloDR.alloc_scope_typ()) || MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(sloDR.alloc_scope_typ())) 
								&& allocRsltR.base_unit_qty().gt(0)) {
							allocRsltR.alloc_flg(true);
						}
						
						if (allocQty.gte(notAllocQty)) {
							
							allocQty = allocQty.subtract(notAllocQty);
							allocRsltR.base_unit_qty(notAllocQty);
						}
						else {
							
							allocRsltR.base_unit_qty(allocQty);
							
							allocQty = MCNumber.ZERO;
						}
						
						if (!isSame(allocRsltR.pack_unit_cd(), allocRsltR.base_unit_cd())) {
							
							MAVM_ITM_UNIT_R packItmUnitR = getItmUnit(
									sloDR.itm_cd(), 
									sloDR.itm_sub1(), 
									sloDR.itm_sub2(), 
									sloDR.itm_sub3(), 
									allocRsltR.pack_unit_cd());
							
							allocRsltR.pack_unit_qty(rvrsBaseUnitConv(
									allocRsltR.base_unit_qty(), 
									packItmUnitR.conv_base_qty(), 
									packItmUnitR.conv_qty(), 
									packItmUnitR.dec_place(), 
									packItmUnitR.rnd_typ()));
						}
						else {
							allocRsltR.pack_unit_qty(allocRsltR.base_unit_qty());
						}
						
						allocRsltL.add(allocRsltR);
					}
				}
			}
			
			divShipSchdByNotMixFlg(shipSchdL, allocRsltL);
		}

		/**
		 * 同一出荷予定内でロット、サブロットが混在しないように出荷予定を分割する
		 */
		protected void divShipSchdByNotMixFlg(MCList<ShipSchd_DtlR> shipSchdL, MCList<Alloc_RsltR> allocRsltL) {

			MCGroupByPolicy gp = new MCGroupByPolicy(Alloc_RsltR.$peg_no);
			ArrayList<String> key = new ArrayList<String>();
			key.add(Alloc_RsltR.$peg_no);

			for (ShipSchd_DtlR r :shipSchdL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (!r.not_lot_mix_flg() && !r.not_sublot_mix_flg()) {
						return;
					}
					else {
						if (r.not_lot_mix_flg()) {
							gp.addKey(Alloc_RsltR.$lot_no);
							key.add(Alloc_RsltR.$lot_no);
						}
						if (r.not_sublot_mix_flg()) {
							gp.addKey(Alloc_RsltR.$sublot_no);
							key.add(Alloc_RsltR.$sublot_no);
						}
						break;
					}
				}
			}
			gp.sum(Alloc_RsltR.$pack_unit_qty, Alloc_RsltR.$base_unit_qty);
			String[] idxKey = key.toArray(new String[0]);

			MCIndexKey shipSchdIdx = shipSchdL.createIndex(ShipSchd_DtlR.$peg_no);
			MCIndexKey allocRsltIdx = allocRsltL.createIndex(idxKey);

			MCList<ShipSchd_DtlR> shipSchdAddL = MCList.create(ShipSchd_DtlR.create());
			MCList<Alloc_RsltR> allocRsltGrpByL = allocRsltL.groupBy(gp);

			ShipSchd_DtlR dtlR = null;

			for (MCList<Alloc_RsltR> allocRsltGrpListL :allocRsltGrpByL.groupList(Alloc_RsltR.$peg_no)) {
				if (allocRsltGrpListL.size() == 1) {
					continue;
				}

				dtlR = null;
				for (Alloc_RsltR allocRsltR :allocRsltGrpListL) {
					if (isNull(dtlR)) {
						dtlR = shipSchdL.getFirst(shipSchdIdx, allocRsltR.peg_no());

						dtlR.base_unit_qty(allocRsltR.base_unit_qty());

						if (!isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
							MAVM_ITM_UNIT_R itmUnitR = getItmUnit(
									dtlR.itm_cd(), 
									dtlR.itm_sub1(), 
									dtlR.itm_sub2(), 
									dtlR.itm_sub3(), 
									dtlR.trd_unit_cd());
							
							dtlR.trd_unit_qty(rvrsBaseUnitConv(
									dtlR.base_unit_qty(), 
									itmUnitR.conv_base_qty(), 
									itmUnitR.conv_qty(), 
									itmUnitR.dec_place(), 
									itmUnitR.rnd_typ()));
						}
						else {
							dtlR.trd_unit_qty(dtlR.base_unit_qty());
						}
					}
					else {
						ShipSchd_DtlR addR = dtlR.clone();
						
						_maxPegNo = _maxPegNo.add(1);
						addR.peg_no(_maxPegNo);
						allocRsltL.subList(allocRsltIdx, allocRsltR.toArray(idxKey)).setNumber(Alloc_RsltR.$peg_no, _maxPegNo);
						_shipPrPegNoMap.put(dtlR.ship_pr_no(), _maxPegNo);
	
						addR.base_unit_qty(allocRsltR.base_unit_qty());

						if (!isSame(addR.trd_unit_cd(), addR.base_unit_cd())) {
							MAVM_ITM_UNIT_R itmUnitR = getItmUnit(
									addR.itm_cd(), 
									addR.itm_sub1(), 
									addR.itm_sub2(), 
									addR.itm_sub3(), 
									addR.trd_unit_cd());
							
							addR.trd_unit_qty(rvrsBaseUnitConv(
									addR.base_unit_qty(), 
									itmUnitR.conv_base_qty(), 
									itmUnitR.conv_qty(), 
									itmUnitR.dec_place(), 
									itmUnitR.rnd_typ()));
						}
						else {
							addR.trd_unit_qty(addR.base_unit_qty());
						}
						shipSchdAddL.add(addR);
					}
				}
			}
			shipSchdL.addAll(shipSchdAddL);
		}

		/**
		 * WG間依頼の納入指示受領FLGを更新
		 */
		protected void updWgRqst() {
			MSBAL_WgRqstService.WgRqst_Upd04 op = MSBAL_WgRqstService.crtWgRqst_Upd04();
			for (DlvInstRcv_Upd01_DtlR grpR : _sloGrpAllL) {
				
				//受注明細に対応する全ての納入指示明細を取得、
				MCList<MST_DLV_INST_RCPT_R> instRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
				MST_DLV_INST_RCPT_R instRcptL_t = MST_DLV_INST_RCPT_R.create("T");
				MCQueryApiBuilder instRcptL_bldr = MCQueryApiBuilder.create(instRcptL_t);
				instRcptL_bldr.setWhere(instRcptL_t.slo_d_no.eq(bind("1")), grpR.slo_d_no());
				instRcptL_bldr.addWhereWithAnd(instRcptL_t.can_flg.eq(value(false)));
				int iCnt = dbSelect("MSBBL6230_MST_DLV_INST_RCPT_S03", instRcptL, instRcptL_bldr);
				
				MCList<MST_WG_RQST_R> rqstL = MCList.create(MST_WG_RQST_R.class);
				MST_WG_RQST_R rqstL_t = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder rqstL_bldr = MCQueryApiBuilder.create(rqstL_t);
				rqstL_bldr.setSelect(rqstL_t.wg_rqst_no);
				rqstL_bldr.setWhere(rqstL_t.slo_d_no.eq(bind("1")), grpR.slo_d_no());
				rqstL_bldr.addWhereWithAnd(
						rqstL_t.wg_rqst_typ.in(value(MSC_WG_RQST_TYP.XFR.value()),
								value(MSC_WG_RQST_TYP.PURC.value())));
				rqstL_bldr.addWhereWithAnd(rqstL_t.can_flg.eq(value(false)));
				dbSelect("MSBBL6230_MST_WG_RQST_S01", rqstL, rqstL_bldr);
				
				//受注明細に対応する納入指示受領データを全て削除した場合、対応するWG間依頼の納入指示受領FLGをオフに更新する。
				if (iCnt == 0) {						
					for (MST_WG_RQST_R rqstR : rqstL) {
						WgRqst_Upd04_DtlR upR = WgRqst_Upd04_DtlR.create();
						upR.wg_rqst_no(rqstR.wg_rqst_no());
						upR.re_rqst_flg(false);
						upR.prms_uncn_flg(true);
						upR.dlv_inst_rcpt_flg(false);
						op.up0().add(upR);
					}
				}
				else {
					for (MST_WG_RQST_R rqstR : rqstL) {
						WgRqst_Upd04_DtlR upR = WgRqst_Upd04_DtlR.create();
						upR.wg_rqst_no(rqstR.wg_rqst_no());
						upR.re_rqst_flg(false);
						upR.prms_uncn_flg(true);
						upR.dlv_inst_rcpt_flg(true);
						op.up0().add(upR);
					}
				}
			}
			
			if (!op.up0().isEmpty()){
				op.exec();
			}
		}
		
		/**
		 * 受注ヘッダの空更新を行う。
		 */
		protected void updSlo() {
			
			MCList<MST_SLO_R> bindL = MCList.create(MST_SLO_R.class);

			for (MCList<DlvInstRcv_Upd01_DtlR> grpL : up0().groupList(DlvInstRcv_Upd01_DtlR.$slo_no)) {
				
				DlvInstRcv_Upd01_DtlR dltR = grpL.get(0);
				if (!dltR.slo_upd_flg()) {
					// 受注登録から呼ばれた場合、受注ヘッダを空更新しない
					MST_SLO_R sloR = getSloCache(dltR.slo_no());
					bindL.add(sloR);
				}
			}
			
			if (!bindL.isEmpty()) {
				//空更新
				dbTsUpdateKey("MSBBL6230_MST_SLO_U01", 
						bindL, MCQueryApiBuilder.create(MST_SLO_R.create("T")).getBaseDbc());
				
				// 改定履歴データ更新サービス呼出し
				callRevDataServiceIns01(bindL);
			}
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 受注改訂履歴テーブルを更新する。
		 * @param bindL 改定履歴更新対象の受注
		 */
		protected void callRevDataServiceIns01(MCList<MST_SLO_R> bindL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for(MST_SLO_R bindR : bindL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				
				opeR.rev_data_src_no(bindR.slo_no());
				opeR.rev_no(bindR.slo_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		
		/**
		 * 受注状況更新
		 * @param hdr
		 * @param dtl
		 */
		protected void callSloStsReg() {
			MSBBL_SloStsRegService.SloSts_Ins01 stsRegOp = MSBBL_SloStsRegService
					.crtSloSts_Ins01();
			for (DlvInstRcv_Upd01_DtlR dtlR : up0()) {
				if (!isNull(dtlR.data_crud_typ())) {
					//キャッシュから対応する更新前の受注明細を取得する。
					MST_SLO_D_R oldSloDR = getFirstSloDCache(dtlR.slo_d_no());
					SloSts_DtlR stsR = SloSts_DtlR.create();
					copy(stsR, oldSloDR, dtlR, createMap_SloSts_DtlR_MST_SLO_D_R());
					stsRegOp.up0().add(stsR);
				}
			}
			
			stsRegOp.up0().addAll(_addAllocSloStsL);
			
			stsRegOp.exec();
		}
		
		/**
		 * 引当に関連する受注状況を作成する。
		 * @param shipPrR 出荷進捗
		 */
		protected void createAllocSloSts(MST_SHIP_PR_R shipPrR) {
			
			if (!_waitAllocRsltL.isEmpty()) {
				
				List<String> grpColL = new ArrayList<>();
				
				grpColL.add(Srch_RsltR.$stk_lg_grp_cd);
				grpColL.add(Srch_RsltR.$stk_loc_cd);
				grpColL.add(Srch_RsltR.$pack_unit_cd);
				
				if (!isNull(shipPrR.alloc_grp_cd())) {
					grpColL.add(Srch_RsltR.$stk_alloc_grp_cd);
				}
	
				MCGroupByPolicy gp = new MCGroupByPolicy(grpColL.toArray(new String[0]));
				
				gp.sum(Srch_RsltR.$pack_unit_qty);
				MCList<Srch_RsltR> allocGrpL = _waitAllocRsltL.groupBy(gp);
				
				SloSts_DtlR sloStsR = null;
						
				for (Srch_RsltR rsltR : allocGrpL) {
					
					sloStsR = SloSts_DtlR.create();
					
					sloStsR.slo_sts_typ(MSC_SLO_STS_TYP.ALLOC.value());
					sloStsR.slo_d_no(shipPrR.slo_d_no());
					sloStsR.alloc_grp_cd(rsltR.stk_alloc_grp_cd());
					sloStsR.ship_lg_grp_cd(rsltR.stk_lg_grp_cd());
					sloStsR.loc_cd(rsltR.stk_loc_cd());
					sloStsR.unit_cd(rsltR.pack_unit_cd());
					sloStsR.qty(rsltR.pack_unit_qty());
				}
				
				_addAllocSloStsL.add(sloStsR);
			}
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
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
			dbWkDelete("MSBBL6230_MSW_SLO_D01", sloL_bldr.getBaseDbc());
			dbWkInsert("MSBBL6230_MSW_SLO_I01", sloL, sloL_bldr.getBaseDbc());
			
			MCList<MST_SLO_D_R> noPickL = MCList.create(MST_SLO_D_R.class);
			executeQuery(noPickL, MSBBL6230_MST_SLO_D_S01(), sloR);
			
			dbWkDelete("MSBBL6230_MSW_SLO_D02", sloL_bldr.getBaseDbc());
			
			for (MST_SLO_D_R noPickR : noPickL) {
				if (!isNull(noPickR.tdlv_cd())) {
					MCMessagePool.add(new MCMessage(MSBBL0404, noPickR.slo_no(), noPickR.slo_d_no(), noPickR.tdlv_cd()));
				}
				else {
					MCMessagePool.add(new MCMessage(MSBBL0405, noPickR.slo_no(), noPickR.slo_d_no(), noPickR.dlv_cd()));
				}
			}
		}
	}

	/**
	 * 再引当＆出荷予定の更新を行う必要かどうか。
	 * @param dlvInstRcvL 納入指示受領リスト
	 * @param sloDR 受注明細
	 * @return 納入指示受領数量または納入希望日時がかわった場合はtrue
	 */
	protected boolean needReAllocAndUpdShipSchd(MCList<DlvInstRcv_Upd01_DtlR> dlvInstRcvL, MST_SLO_D_R sloDR) {
		
		for (DlvInstRcv_Upd01_DtlR dlvInstRcv_Upd01_DtlR : dlvInstRcvL) {
			
			if (needReAllocAndUpdShipSchd(dlvInstRcv_Upd01_DtlR, sloDR)) {
				return true;
			}
		}

		return false;
	}
	
	/**
	 * 再引当＆出荷予定の更新を行う必要かどうか。
	 * @param dlvInstRcvR　納入指示受領
	 * @param sloDR 受注明細
	 * @return 納入指示受領数量または納入希望日時がかわった場合はtrue
	 */
	protected boolean needReAllocAndUpdShipSchd(DlvInstRcv_Upd01_DtlR dlvInstRcvR, MST_SLO_D_R sloDR) {
		
		if (MAC_DATA_CRUD_TYP.isCRT(dlvInstRcvR.data_crud_typ()) 
				|| MAC_DATA_CRUD_TYP.isDEL(dlvInstRcvR.data_crud_typ())) {
			return true;
		}
		else if (MAC_DATA_CRUD_TYP.isUPD(dlvInstRcvR.data_crud_typ())) {
			
			return isDlvInstRcvChng(dlvInstRcvR, sloDR);
		}
		
		return false;
	}
	
	/**
	 * 納入指示受領の数量・納入希望日時が変わったかどうか。
	 * @param dlvInstRcvR　納入指示受領
	 * @param sloDR 受注明細
	 * @return 数量・納入希望日時が変わった場合はtrue
	 */
	protected boolean isDlvInstRcvChng(DlvInstRcv_Upd01_DtlR dlvInstRcvR, MST_SLO_D_R sloDR) {
		
		MST_DLV_INST_RCPT_R oldDlvInstrcptR = _cacheDlvinstRcptL
				.getFirst(_dlvInstRcptKey, dlvInstRcvR.dlv_inst_rcpt_no());
		if (!isSame(oldDlvInstrcptR.trd_unit_qty(), dlvInstRcvR.trd_unit_qty())
				|| (!MAC_VIA_DLV_TYP.isVIA(nvl(dlvInstRcvR.via_dlv_typ(), sloDR.via_dlv_typ())) && !isSame(oldDlvInstrcptR.dlv_rqst_tm(), dlvInstRcvR.dlv_rqst_tm()))
				|| !isSame(oldDlvInstrcptR.dlv_cd(), dlvInstRcvR.dlv_cd())
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_nm(), dlvInstRcvR.dlv_nm()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_cntct_dpt(), dlvInstRcvR.dlv_cntct_dpt()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_cntct_psn(), dlvInstRcvR.dlv_cntct_psn()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_zip_cd(), dlvInstRcvR.dlv_zip_cd()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_addr1(), dlvInstRcvR.dlv_addr1()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_addr2(), dlvInstRcvR.dlv_addr2()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_addr3(), dlvInstRcvR.dlv_addr3()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_addr4(), dlvInstRcvR.dlv_addr4()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_tel(), dlvInstRcvR.dlv_tel()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_fax(), dlvInstRcvR.dlv_fax()))
				|| (oldDlvInstrcptR.dlv_sundry_flg() && !isSame(oldDlvInstrcptR.dlv_lg_grp_cd(), dlvInstRcvR.dlv_lg_grp_cd()))
				|| !isSame(oldDlvInstrcptR.pri_prnt_flg(), dlvInstRcvR.pri_prnt_flg())
				|| !isSame(oldDlvInstrcptR.tdlv_cd(), dlvInstRcvR.tdlv_cd())
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_nm(), dlvInstRcvR.tdlv_nm()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_cntct_dpt(), dlvInstRcvR.tdlv_cntct_dpt()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_cntct_psn(), dlvInstRcvR.tdlv_cntct_psn()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_zip_cd(), dlvInstRcvR.tdlv_zip_cd()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_addr1(), dlvInstRcvR.tdlv_addr1()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_addr2(), dlvInstRcvR.tdlv_addr2()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_addr3(), dlvInstRcvR.tdlv_addr3()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_addr4(), dlvInstRcvR.tdlv_addr4()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_tel(), dlvInstRcvR.tdlv_tel()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_fax(), dlvInstRcvR.tdlv_fax()))
				|| (oldDlvInstrcptR.tdlv_sundry_flg() && !isSame(oldDlvInstrcptR.tdlv_lg_grp_cd(), dlvInstRcvR.tdlv_lg_grp_cd()))
				|| !isSame(oldDlvInstrcptR.via_dlv_typ(), dlvInstRcvR.via_dlv_typ())
				|| !isSame(oldDlvInstrcptR.dlv_day_week_typ(), dlvInstRcvR.dlv_day_week_typ())) {
			return true;
		}
		
		return false;
	}

	/**
	 * 品目の取引単位は荷姿単位かを調べる
	 * @param itmCd
	 * @param itmSub1
	 * @param itmSub2
	 * @param itmSub3
	 * @param trdUnitCd
	 * @return
	 */
	protected boolean isPack(String itmCd, String itmSub1, String itmSub2,
			String itmSub3, String trdUnitCd) {
		MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
		itmUnitR.itm_cd(itmCd);
		itmUnitR.itm_sub1(itmSub1);
		itmUnitR.itm_sub2(itmSub2);
		itmUnitR.itm_sub3(itmSub3);
		itmUnitR.unit_cd(trdUnitCd);
		dbSelectKey("MSBBL6230_MAVM_ITM_UNIT_S04", itmUnitR,
				MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), itmUnitR);
		return itmUnitR.pack_flg();
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
	protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		
		MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
		itmUnitR.itm_cd(itmCd);
		itmUnitR.itm_sub1(itmSub1);
		itmUnitR.itm_sub2(itmSub2);
		itmUnitR.itm_sub3(itmSub3);
		itmUnitR.unit_cd(unitCd);
		
		dbSelectKey("MSBBL6230_MAVM_ITM_UNIT_S05", itmUnitR,
				MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), itmUnitR);
		
		return itmUnitR;
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
	
	protected Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R_DlvInstRcv_Upd01_DtlR<MSW_SHIP_SCHD_DT_CALC_R, MST_SLO_D_R, DlvInstRcv_Upd01_DtlR> createMap_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R_DlvInstRcv_Upd01_DtlR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R_DlvInstRcv_Upd01_DtlR<MSW_SHIP_SCHD_DT_CALC_R, MST_SLO_D_R, DlvInstRcv_Upd01_DtlR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R_DlvInstRcv_Upd01_DtlR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends MST_SLO_D_R, W extends DlvInstRcv_Upd01_DtlR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;

		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(_dtlR.peg_no());  //紐付けＮＯ
			if (!isNull(src.tdlv_cd()) || !isNull(_dtlR.tdlv_cd())) {
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());  //送付先識別区分
				dest.ship_to_id_cd(nvl(_dtlR.tdlv_cd(), src.tdlv_cd()));  //送付先識別ＣＤ
				dest.ship_to_lg_grp_cd(nvl(_dtlR.tdlv_lg_grp_cd(), src.tdlv_lg_grp_cd()));  //出荷先物流グループＣＤ
			}
			else {
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value());  //送付先識別区分
				dest.ship_to_id_cd(nvl(_dtlR.dlv_cd(), src.dlv_cd()));  //送付先識別ＣＤ
				dest.ship_to_lg_grp_cd(nvl(_dtlR.dlv_lg_grp_cd(), src.dlv_lg_grp_cd()));  //出荷先物流グループＣＤ
			}
			dest.ship_fr_lg_grp_cd(src.ship_lg_grp_cd());  //出荷元物流グループＣＤ
			dest.ship_term_cd(src.ship_term_cd());  //出荷条件ＣＤ
			if (!MAC_VIA_DLV_TYP.isVIA(nvl(_dtlR.via_dlv_typ(), src.via_dlv_typ()))) {
				dest.dlv_rqst_tm(_dtlR.dlv_rqst_tm());  //納入希望日時
				dest.ship_rqst_tm(null);  //出荷希望日時
			}
			else {
				dest.dlv_rqst_tm();  //納入希望日時
				dest.ship_rqst_tm(src.ship_rqst_tm());  //出荷希望日時
			}
			dest.dlv_day_week_typ(nvl(_dtlR.dlv_day_week_typ(), src.dlv_day_week_typ()));  //着曜日
			dest.ship_inst_typ(src.ship_inst_typ());  //出荷指図区分			
			dest.cl_time_chk_flg(true);  //締時間チェックＦＬＧ
			dest.ship_dt_chk_flg(true);  //出荷日チェックＦＬＧ
			dest.ship_cal_cd_chk_flg(true);
			dest.early_ship_dt_add_days_chk_flg(true);
		}
	}
			
	protected Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R<MSW_SHIP_SCHD_DT_CALC_R,MST_SLO_D_R> createMap_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R<MSW_SHIP_SCHD_DT_CALC_R, MST_SLO_D_R>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_MST_SLO_D_R<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends MST_SLO_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, MST_SLO_D_R.$ship_term_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$dlv_day_week_typ, MST_SLO_D_R.$dlv_day_week_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_rqst_tm, MST_SLO_D_R.$ship_rqst_tm);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ, MST_SLO_D_R.$ship_inst_typ);
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			if (!isNull(src.tdlv_cd())){
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());  //送付先識別区分
				dest.ship_to_id_cd(src.tdlv_cd());  //送付先識別ＣＤ
				dest.ship_to_lg_grp_cd(src.tdlv_lg_grp_cd());  //出荷先物流グループＣＤ
			}else{
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value());  //送付先識別区分
				dest.ship_to_id_cd(src.dlv_cd());  //送付先識別ＣＤ
				dest.ship_to_lg_grp_cd(src.dlv_lg_grp_cd());  //出荷先物流グループＣＤ
			}
			
			if (!MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())) {
				dest.dlv_rqst_tm(src.dlv_rqst_tm());
			}
			
			//出荷元物流グループＣＤ
			if (isNull(src.ship_lg_grp_cd())) {
				MAM_LOC_R locR = getLoc(nvl(src.loc_cd(), src.def_loc_cd()));
				
				dest.ship_fr_lg_grp_cd(locR.lg_grp_cd());
			}
			else {
				dest.ship_fr_lg_grp_cd(src.ship_lg_grp_cd());
			}		
			dest.cl_time_chk_flg(true);  //締時間チェックＦＬＧ
			dest.ship_dt_chk_flg(true);  //出荷日チェックＦＬＧ
			dest.ship_cal_cd_chk_flg(true);
			dest.early_ship_dt_add_days_chk_flg(true);
		}
	}

	protected Map_SloSts_DtlR_MST_SLO_D_R<SloSts_DtlR, MST_SLO_D_R, DlvInstRcv_Upd01_DtlR> createMap_SloSts_DtlR_MST_SLO_D_R() {
		return new Map_SloSts_DtlR_MST_SLO_D_R<SloSts_DtlR, MST_SLO_D_R, DlvInstRcv_Upd01_DtlR>();
	}

	public class Map_SloSts_DtlR_MST_SLO_D_R<D extends SloSts_DtlR, S extends MST_SLO_D_R, W extends DlvInstRcv_Upd01_DtlR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;

		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			if (MAC_DATA_CRUD_TYP.isCRT(_dtlR.data_crud_typ())) {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.DLV_INST_RCPT.value()); //受注状況区分
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(_dtlR.data_crud_typ())) {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.DLV_INST_RCPT_UPD.value()); //受注状況区分
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(_dtlR.data_crud_typ())) {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.DLV_INST_RCPT_CAN.value()); //受注状況区分
			}
			dest.unit_cd(_dtlR.trd_unit_cd()); //単位ＣＤ
			dest.qty(_dtlR.trd_unit_qty()); //数量
			dest.dlv_inst_rcpt_no(_dtlR.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
		}
	}

	protected Map_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, MST_SLO_D_R, DlvInstRcv_Upd01_DtlR> createMap_ShipSchd_DtlR_MST_SLO_D_R() {
		return new Map_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, MST_SLO_D_R, DlvInstRcv_Upd01_DtlR>();
	}

	public class Map_ShipSchd_DtlR_MST_SLO_D_R<D extends ShipSchd_DtlR, S extends MST_SLO_D_R, W extends DlvInstRcv_Upd01_DtlR>
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
			dest.ship_schd_no(null); //出荷予定ＮＯ
			dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
			dest.dlv_inst_rcpt_no(_dtlR.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
			dest.slo_prms_no(null); //受注納期回答ＮＯ
			dest.ship_fr_lg_grp_cd(src.ship_lg_grp_cd()); //出荷元物流グループＣＤ
			if (!MAC_VIA_DLV_TYP.isVIA(nvl(_dtlR.via_dlv_typ(), src.via_dlv_typ()))) {
				dest.pd_inst_dlv_tm(_dtlR.dlv_rqst_tm()); //納品依頼日時
			}
			dest.ship_rqst_tm(src.ship_rqst_tm()); //出荷希望日時
			dest.ship_schd_tm(_dtlR.ship_schd_tm());  //出荷予定日時
			dest.dlv_schd_tm(_dtlR.dlv_schd_tm());  //納品予定日時
			dest.ship_term_cd(src.ship_term_cd()); //出荷条件ＣＤ
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
			dest.trd_unit_cd(_dtlR.trd_unit_cd()); //取引単位ＣＤ
			dest.base_unit_cd(_dtlR.base_unit_cd()); //基準単位ＣＤ
			dest.abort_flg(false); //打切ＦＬＧ
			dest.fix_flg(false); //確定ＦＬＧ			
			dest.inst_bndl_flg(false); //指図まとめＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在ＦＬＧ
			dest.vld_dt_fr(_dtlR.valid_dt_fr()); //有効期限ＦＲＯＭ
			dest.vld_dt_to(_dtlR.valid_dt_to()); //有効期限ＴＯ
			dest.re_ship_schd_flg(false); //再出荷予定ＦＬＧ
			dest.trd_rmrks(null); //取引備考
			dest.trd_d_rmrks(src.trd_d_rmrks()); //取引明細備考
			dest.ship_cnt_rmrks(src.ship_cnt_rmrks()); //出荷連絡備考
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
			dest.inst_qty(null); //指図数量（基準単位）
			dest.inst_unit_cd(null); //指図単位ＣＤ
			dest.inst_ship_schd_tm(null); //指図出荷予定日時
			dest.inst_dlv_schd_tm(null); //指図納品予定日時
			if (MAC_SHIP_SCHD_SPLIT_TYP.isAUTO_SPLIT(src.ship_schd_split_typ())) {
				dest.ship_schd_split_flg(true); //出荷予定分割ＦＬＧ
			}
			else {
				dest.ship_schd_split_flg(false); //出荷予定分割ＦＬＧ
			}
		}
	}

	protected Map_Slo_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, MST_SLO_D_R, MST_SHIP_PR_R> createMap_Slo_ShipSchd_DtlR_MST_SLO_D_R() {
		return new Map_Slo_ShipSchd_DtlR_MST_SLO_D_R<ShipSchd_DtlR, MST_SLO_D_R, MST_SHIP_PR_R>();
	}

	public class Map_Slo_ShipSchd_DtlR_MST_SLO_D_R<D extends ShipSchd_DtlR, S extends MST_SLO_D_R, W extends MST_SHIP_PR_R>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _prR;

		@Override
		public void setWith(W prR) {
			this._prR = prR;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分
			dest.ship_schd_no(null); //出荷予定ＮＯ
			dest.ship_pr_no(_prR.ship_pr_no()); //出荷進捗ＮＯ
			dest.ship_inst_d_no(null); //出荷指図明細ＮＯ
			dest.dlv_inst_rcpt_no(null); //納入指示受領ＮＯ
			dest.slo_prms_no(null); //受注納期回答ＮＯ
			dest.ship_fr_lg_grp_cd(src.ship_lg_grp_cd()); //出荷元物流グループＣＤ
			if (!MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())) {
				dest.pd_inst_dlv_tm(src.dlv_rqst_tm()); //納品依頼日時
			}
			dest.ship_rqst_tm(src.ship_rqst_tm()); //出荷希望日時
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
			dest.abort_flg(false); //打切ＦＬＧ
			dest.fix_flg(false); //確定ＦＬＧ			
			dest.inst_bndl_flg(false); //指図まとめＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在ＦＬＧ
			dest.re_ship_schd_flg(false); //再出荷予定ＦＬＧ
			dest.trd_rmrks(null); //取引備考
			dest.trd_d_rmrks(src.trd_d_rmrks()); //取引明細備考
			dest.ship_cnt_rmrks(src.ship_cnt_rmrks()); //出荷連絡備考
			dest.inst_qty(null); //指図数量（基準単位）
			dest.inst_unit_cd(null); //指図単位ＣＤ
			dest.inst_ship_schd_tm(null); //指図出荷予定日時
			dest.inst_dlv_schd_tm(null); //指図納品予定日時
			dest.not_dt_calc_flg(false);
			if (MAC_SHIP_SCHD_SPLIT_TYP.isAUTO_SPLIT(src.ship_schd_split_typ())) {
				dest.ship_schd_split_flg(true); //出荷予定分割ＦＬＧ
			}
			else {
				dest.ship_schd_split_flg(false); //出荷予定分割ＦＬＧ
			}
		}
	}

	protected Map_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R<MSW_ALLOC_LOC_MAP_R, MST_SLO_D_R, MST_SLO_R> createMap_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R() {
		return new Map_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R<MSW_ALLOC_LOC_MAP_R, MST_SLO_D_R, MST_SLO_R>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_MST_SLO_D_R<D extends MSW_ALLOC_LOC_MAP_R, S extends MST_SLO_D_R, W extends MST_SLO_R>
			extends MCRowMapper<D, S> {

		@Override
		public void valueCopy(D dest, S src) {
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1(src.itm_sub1());
			dest.itm_sub2(src.itm_sub2());
			dest.itm_sub3(src.itm_sub3());
			dest.gi_loc_cd(src.loc_cd());
			dest.gi_lg_grp_cd(src.ship_lg_grp_cd());
			dest.alloc_grp_cd(src.alloc_grp_cd());
			dest.alloc_scope_typ(src.alloc_scope_typ()); //引当範囲区分
		}
	}

	protected Map_Srch_TgtR_MST_SLO_D_R<Srch_TgtR, MST_SLO_D_R, MST_SLO_R> createMap_Srch_TgtR_MST_SLO_D_R() {
		return new Map_Srch_TgtR_MST_SLO_D_R<Srch_TgtR, MST_SLO_D_R, MST_SLO_R>();
	}

	public class Map_Srch_TgtR_MST_SLO_D_R<D extends Srch_TgtR, S extends MST_SLO_D_R, W extends MST_SLO_R>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _hdr;

		@Override
		public void setWith(W hdr) {
			this._hdr = hdr;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.inpt_schd_dt(null); //投入予定日
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
			if (isPack(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(),
					src.trd_unit_cd())) {
				dest.pack_unit_cd(src.trd_unit_cd()); //荷姿単位ＣＤ
			}
			dest.base_unit_cd(src.base_unit_cd()); //基準単位ＣＤ
			dest.cont_qty(null); //有効成分

			dest.not_lot_fix_flg(isNull(src.lot_no()) ? true : false); //ロット指定なしＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在不可ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在不可ＦＬＧ
			dest.not_lg_mix_flg(src.not_lg_mix_flg()); //物流グループ混在不可ＦＬＧ
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

	protected Map_Upd_Srch_TgtR_MST_SLO_D_R<Srch_TgtR, MST_SLO_D_R, DlvInstRcv_Upd01_DtlR> createMap_Upd_Srch_TgtR_MST_SLO_D_R() {
		return new Map_Upd_Srch_TgtR_MST_SLO_D_R<Srch_TgtR, MST_SLO_D_R, DlvInstRcv_Upd01_DtlR>();
	}

	public class Map_Upd_Srch_TgtR_MST_SLO_D_R<D extends Srch_TgtR, S extends MST_SLO_D_R, W extends DlvInstRcv_Upd01_DtlR>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;

		@Override
		public void setWith(W dtl) {
			this._dtlR = dtl;
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(_dtlR.peg_no()); //紐付けＮＯ
			dest.inpt_schd_dt(null); //投入予定日
			
			if (src.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				dest.gi_schd_dt(src.sls_schd_dt());
			}
			else {
				dest.gi_schd_dt(_dtlR.ship_schd_tm().startTimeOfDay());
			}
			dest.gr_schd_dt(_dtlR.dlv_schd_tm().startTimeOfDay()); //入庫予定日
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
			if (isPack(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(),
					src.trd_unit_cd())) {
				dest.pack_unit_cd(_dtlR.trd_unit_cd()); //荷姿単位ＣＤ
			}
			dest.base_unit_cd(_dtlR.base_unit_cd()); //基準単位ＣＤ
			dest.cont_qty(null); //有効成分

			dest.not_lot_fix_flg(isNull(src.lot_no()) ? true : false); //ロット指定なしＦＬＧ
			dest.not_lot_mix_flg(src.not_lot_mix_flg()); //ロット混在不可ＦＬＧ
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg()); //サブロット混在不可ＦＬＧ
			dest.not_lg_mix_flg(src.not_lg_mix_flg()); //物流グループ混在不可ＦＬＧ
			dest.vld_dt_fr(_dtlR.valid_dt_fr()); //有効期限ＦＲＯＭ
			dest.vld_dt_fr_grp(_dtlR.valid_dt_fr_grp()); //有効期限ＦＲＯＭ継承Ｇ
			dest.vld_dt_to(_dtlR.valid_dt_to()); //有効期限ＴＯ
			if (MAC_TRD_PTN_TYP.isSLS(_dtlR.getString("trd_ptn_typ"))) {
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
	
	protected Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR,MST_SHIP_ALLOC_STS_R> createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R() {
		return new Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<D extends Alloc_RsltR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_RsltR.$ver_no, MST_SHIP_ALLOC_STS_R.$ver_no);
			
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
	
	protected Map_SlsUtil_Srch01_CndR_MST_SHIP_PR_R<SlsUtil_Srch01_CndR,MST_SHIP_PR_R> createMap_SlsUtil_Srch01_CndR_MST_SHIP_PR_R() {
		return new Map_SlsUtil_Srch01_CndR_MST_SHIP_PR_R<SlsUtil_Srch01_CndR, MST_SHIP_PR_R>();
	}
	public class Map_SlsUtil_Srch01_CndR_MST_SHIP_PR_R<D extends SlsUtil_Srch01_CndR, S extends MST_SHIP_PR_R> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.getNumber("peg_no"));
			dest.slo_d_no(src.slo_d_no());
		}
	}
	
	protected Map_Alloc_RsltR_Srch_RsltR<Alloc_RsltR,Srch_RsltR> createMap_Alloc_RsltR_Srch_RsltR() {
		return new Map_Alloc_RsltR_Srch_RsltR<Alloc_RsltR, Srch_RsltR>();
	}

	public class Map_Alloc_RsltR_Srch_RsltR<D extends Alloc_RsltR, S extends Srch_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_RsltR.$peg_no, Srch_RsltR.$peg_no);
			addColumnPathMap(Alloc_RsltR.$itm_cd, Srch_RsltR.$itm_cd);
			addColumnPathMap(Alloc_RsltR.$itm_sub1, Srch_RsltR.$itm_sub1);
			addColumnPathMap(Alloc_RsltR.$itm_sub2, Srch_RsltR.$itm_sub2);
			addColumnPathMap(Alloc_RsltR.$itm_sub3, Srch_RsltR.$itm_sub3);
			addColumnPathMap(Alloc_RsltR.$ver_no, Srch_RsltR.$ver_no);
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, Srch_RsltR.$stk_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, Srch_RsltR.$stk_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$stk_lg_grp_cd, Srch_RsltR.$stk_lg_grp_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, Srch_RsltR.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, Srch_RsltR.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, Srch_RsltR.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, Srch_RsltR.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, Srch_RsltR.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, Srch_RsltR.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, Srch_RsltR.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, Srch_RsltR.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, Srch_RsltR.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, Srch_RsltR.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, Srch_RsltR.$sno4);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, Srch_RsltR.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, Srch_RsltR.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, Srch_RsltR.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, Srch_RsltR.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, Srch_RsltR.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, Srch_RsltR.$vld_dt_to);

		}
	}

	//FMCB CUSTOM END
}