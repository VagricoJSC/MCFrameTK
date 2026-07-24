package mcframe.serverMSBD.MSBDL5090;

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
import mcframe.serverMSBD.MSBDL5090.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSUC.MSUCL0110.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMAUC.MAUCL0020.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMABC.MABCL5010.*;
import mcframe.serverMAUC.MAUCL0140.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PoSchdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PoSchdRegService_MC extends MSBDL_PoSchdRegService_MC_A{
	//FMCB CUSTOM START
	String _sysParm = getSysParm("MASTER_DT_BASE");
	//----------------------------------------
	//　IndexKey
	//----------------------------------------
	/** 発注予定 */
	MCIndexKey _idxPoSchdCacheBySchdNo = null;
	MCIndexKey _idxPoSchdCacheWithSrcNo = null;
	MCIndexKey _idxPoSchdCacheWithOrdNo = null;
	/** 品目詳細 */
	MCIndexKey _idxItmDtlCache = null;
	MCIndexKey _idxItmDtlCacheKey = null;
	/** 取引（取引ＣＤ） */
	MCIndexKey _idxTrdCdCache = null;
	/** 取引（取引パタン区分） */
	MCIndexKey _idxTrdPtnCache = null;
	/** 品目単位 */
	MCIndexKey _idxItmUnitCache = null;
	/** 版 */
	MCIndexKey _idxItmVerCache = null;
	/** 取引先 */
	MCIndexKey _idxBpCache = null;
	
	//----------------------------------------
	//　Cache
	//----------------------------------------
	/** 発注予定 */
	protected MCList<MST_PO_SCHD_R> _cachePoSchd = MCList.create(MST_PO_SCHD_R.class);
	/**　品目 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;
	/** 品目詳細 */
	protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
	/** 取引 */
	protected MCList<MAM_TRD_R> _cacheTrd = MCList.create(MAM_TRD_R.class);
	/** 仕入直送ＬＴマスタ */
	protected FXUCL_MCDbcCacheStEnd<MAM_PURC_DDLV_LT_R> _cachePurcDdlvLt = null;
	/**　品目単位 */
	protected MCList<MAVM_ITM_UNIT_R> _cacheItmUnit = null;
	/**　版 */
	protected MCList<MAM_ITM_VER_R> _cacheItmVer = MCList.create(MAM_ITM_VER_R.class);
	/** 場所（納入場所 + 製造場所） */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
	/** 為替レート */
	protected FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> _cacheCurXrate = null;
	/** 納税為替レート */
	protected FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R> _cachePtaxCurXrate = null;
	/** ＷＧ間依頼 */
	protected FXUCL_MCDbcCache<MST_WG_RQST_PRMS_R> _cacheWgRqstPrms = null;
	/** 税マスタ */
	protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax = null;
	/** 支給単価マスタ */
	protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _cacheProvUpri = null;
	/**　発注先品目マスタ */
	protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> _cacheBpItm = null;
	/** 取引先マスタ */
	protected MCList<MAM_BP_R> _cacheBp = MCList.create(MAM_BP_R.class);
	/** 通貨マスタ */
	protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCur = null;
	/** 発注先担当マスタ */
	protected FXUCL_MCDbcCacheStEnd<MAM_SPPL_USR_R> _cacheSpplUsr = null;
	/** 担当者権限マスタ */
	protected FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> _cacheUsrAcl = null;
	/** 部門マスタ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt = null;
	
	//----------------------------------------
	// Chk01とUpd01で共有するキャッシュの作成
	//----------------------------------------
	protected static final Class<MSBDL_PoSchdRegService> CLAZZ = MSBDL_PoSchdRegService.class;
	
	/**
	 * キャッシュ作成（品目マスタ）
	 * @param r
	 */
	protected void _initItmCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		_cacheItm = null;
		_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(
				MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dtlL, MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	/**
	 * キャッシュ作成（取引マスタ）
	 * @param dtlL
	 */
	protected void _initTrdCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		
		// 取引パタン指定の場合
		MCList<MAM_TRD_R> frTrdPtnL = MCList.create(MAM_TRD_R.class);
		MAM_TRD_R t1 = MAM_TRD_R.create("T");
		MCQueryApiBuilder frTrdPtnL_bldr = MCQueryApiBuilder.create(t1);
		frTrdPtnL_bldr.setWhere(t1.trd_ptn_typ.eq(bind("1")),
				MAC_TRD_PTN_TYP.PURC.value());
		frTrdPtnL_bldr.addWhereWithAnd(t1.auto_adopt_flg.eq(bind("1")),
				MCBooleanUtil.booleanToDBString(true));
		dbSelect("MSBDL5090_MAM_TRD_S01", frTrdPtnL, frTrdPtnL_bldr);

		// 取引ＣＤ指定の場合
		MCList<MAM_TRD_R> frTrdCdL = MCList.create(MAM_TRD_R.class);
		MAM_TRD_R t2 = MAM_TRD_R.create("T");
		MCQueryApiBuilder frTrdCdL_bldr = MCQueryApiBuilder.create(t2);
		frTrdCdL_bldr.setWhere(t2.trd_cd.eq(bind("trd_cd")));
		dbSelect("MSBDL5090_MAM_TRD_S02", frTrdCdL, frTrdCdL_bldr, dtlL);
		
		// 重複を除いてキャッシュする
		MCList<MAM_TRD_R> tmpL = MCList.create(MAM_TRD_R.class);
		tmpL.addAll(frTrdPtnL);
		tmpL.addAll(frTrdCdL);
		_cacheTrd.addAll(tmpL.groupBy(MAM_TRD_R.$trd_cd, MAM_TRD_R.$trd_ptn_typ, MAM_TRD_R.$auto_adopt_flg));
	}
	
	/**
	 * indexの作成
	 */
	protected void _initIdxTrdCache() {
		_idxTrdCdCache = _cacheTrd.createIndex(MAM_TRD_R.$trd_cd);
		_idxTrdPtnCache = _cacheTrd.createIndex(MAM_TRD_R.$trd_ptn_typ, MAM_TRD_R.$auto_adopt_flg);
	}
	
	/**
	 * キャッシュ作成（発注予定）
	 * @param dtlL
	 */
	protected void _initPoSchdCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		// 主に発注予定作成元ＮＯ指定でコールされるため、まず作成元ＮＯに対応する発注予定を取得する
		_cachePoSchd = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R cachePoSchd_t = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder cachePoSchd_bldr = MCQueryApiBuilder.create(cachePoSchd_t);
		
		cachePoSchd_bldr.setWhere(cachePoSchd_t.po_schd_src_typ.eq(bind("po_schd_src_typ")));
		cachePoSchd_bldr.addWhereWithAnd(cachePoSchd_t.po_schd_src_no.eq(bind("po_schd_src_no")));
		dbSelect("MSBDL5090_MST_PO_SCHD_S01", _cachePoSchd, cachePoSchd_bldr, dtlL);
		
		// 発注予定登録画面などからは発注予定ＮＯ指定で来るため、発注予定ＮＯに対応する発注予定を取得する。
		MCList<PoSchd_Upd01_DtlR> bindL = MCList.create(PoSchd_Upd01_DtlR.class);
		MCIndexKey idx = _cachePoSchd.createIndex(MST_PO_SCHD_R.$po_schd_no);
		for (PoSchd_Upd01_DtlR r : dtlL) {
			if (!isNull(r.po_schd_no()) && !_cachePoSchd.contains(idx, r.po_schd_no())) {
				bindL.add(r);
			}
		}
		
		MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
		poSchdL_bldr.setWhere(t.po_schd_no.eq(bind("po_schd_no")));
		dbSelect("MSBDL5090_MST_PO_SCHD_S02", poSchdL, poSchdL_bldr, bindL);
		_cachePoSchd.addAll(poSchdL);
	}
	/**
	 * indexの作成
	 */
	protected void _initIdxPoSchdCache() {
		_idxPoSchdCacheBySchdNo  =_cachePoSchd.createIndex(MST_PO_SCHD_R.$po_schd_no);
		_idxPoSchdCacheWithSrcNo = _cachePoSchd.createIndex(MST_PO_SCHD_R.$po_schd_src_typ, MST_PO_SCHD_R.$po_schd_src_no, MST_PO_SCHD_R.$rqst_can_flg, MST_PO_SCHD_R.$split_src_schd_no);
		_idxPoSchdCacheWithOrdNo = _cachePoSchd.createIndex(MST_PO_SCHD_R.$po_schd_src_typ, MST_PO_SCHD_R.$po_schd_src_no, MST_PO_SCHD_R.$outsrc_itm_ord_no);
	}

	/**
	 * キャッシュ作成（WG間依頼）
	 * @param r
	 */
	protected void _initWgRqstCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		MCList<PoSchd_Upd01_DtlR> bindL = dtlL.subList(PoSchd_Upd01_DtlR.$po_schd_src_typ, MSC_PO_SCHD_SRC_TYP.RQST.value());
		_cacheWgRqstPrms = null;
		_cacheWgRqstPrms = new FXUCL_MCDbcCache<MST_WG_RQST_PRMS_R>(
				MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T")), bindL,
				PoSchd_Upd01_DtlR.$po_schd_src_no);
	}
	/**
	 *　キャッシュ取得（発注予定）
	 * @param r
	 */
	protected MST_PO_SCHD_R _getPoSchd(PoSchd_Upd01_DtlR r) {
		MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create();
		if (!isNull(r.po_schd_no())) {
			// 発注予定ＮＯ指定の場合
			poSchdR = _cachePoSchd.getFirst(object(CLAZZ)._idxPoSchdCacheBySchdNo, r.po_schd_no());
		}
		else if (!isNull(r.outsrc_itm_ord_no())) {
			// 発注予定作成元区分＋ＮＯ＋外注品目オーダＮＯ指定の場合
			poSchdR = _cachePoSchd.getFirst(object(CLAZZ)._idxPoSchdCacheWithOrdNo, r.po_schd_src_typ(), r.po_schd_src_no(), r.outsrc_itm_ord_no());
		}
		else {
			// 発注予定作成元区分＋ＮＯ指定の場合は、紐切でなく分割されていない発注予定とする
			poSchdR = _cachePoSchd.getFirst(object(CLAZZ)._idxPoSchdCacheWithSrcNo, r.po_schd_src_typ(), r.po_schd_src_no(), false, null);
		}
		if (poSchdR == null) {
			return MST_PO_SCHD_R.create();
		}
		else {
			return poSchdR;
		}
	}
	/**
	 * キャッシュ取得（品目マスタ）
	 * @param dtlR
	 * @return
	 */
	protected MAM_ITM_R _getItmCache(PoSchd_Upd01_DtlR dtlR){
		return _cacheItm.get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
	}
	/**
	 * キャッシュ取得（取引マスタ）
	 * @param dtlL
	 */
	protected MAM_TRD_R _getTrdCache(PoSchd_Upd01_DtlR r) {
		MAM_TRD_R trdR = MAM_TRD_R.create();
		if (isNull(r.trd_cd())) {
			trdR = _cacheTrd.getFirst(object(CLAZZ)._idxTrdPtnCache, r.trd_ptn_typ(), true);
		}
		else {
			trdR = _cacheTrd.getFirst(object(CLAZZ)._idxTrdCdCache, r.trd_cd());
		}
		if (isNull(trdR)) {
			return MAM_TRD_R.create();
		}
		else {
			return trdR;
		}
	}
	/**
	 * キャッシュ取得（ＷＧ間依頼）
	 * @param dtlR
	 * @return
	 */
	protected MST_WG_RQST_PRMS_R _getCacheWgRqstPrms(PoSchd_Upd01_DtlR dtlR){
		return object(CLAZZ)._cacheWgRqstPrms.get(dtlR.po_schd_src_no());
	}
	/**
	 * キャッシュ取得（発注予定マスタ）
	 * @param dtlL
	 */
	protected static MST_PO_SCHD_R getPoSchd(PoSchd_Upd01_DtlR r) {
		return object(CLAZZ)._getPoSchd(r);
	}
	/**
	 * キャッシュ取得（品目マスタ）
	 * @param dtlL
	 */
	protected static MAM_ITM_R getItmCache(PoSchd_Upd01_DtlR dtlR) {
		return object(CLAZZ)._getItmCache(dtlR);
	}
	
	
	/**
	 * キャッシュ取得（取引マスタ）
	 * @param dtlL
	 */
	protected static MAM_TRD_R getTrdCache(PoSchd_Upd01_DtlR r) {
		return object(CLAZZ)._getTrdCache(r);
	}
	
	/**
	 * キャッシュをリクエストスコープに保存します
	 * @param dtlL
	 */
	protected static void doDataCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		// 発注予定
		object(CLAZZ)._initPoSchdCache(dtlL);
		object(CLAZZ)._initIdxPoSchdCache();
		
		// 取引マスタ
		object(CLAZZ)._initTrdCache(dtlL);
		object(CLAZZ)._initIdxTrdCache();
		
		// 品目マスタ
		object(CLAZZ)._initItmCache(dtlL);
		
		// ＷＧ間依頼
		object(CLAZZ)._initWgRqstCache(dtlL);
	}
	
	//----------------------------------------
	//　set(スコープまたぎなし)
	//----------------------------------------
	/**
	 * キャッシュ作成（品目詳細マスタ）
	 * @param list
	 */
	protected void createItmDtlCache(MCList<MAM_ITM_DTL_R> list) {
		_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
		
		MCList<MAM_ITM_DTL_R> bindL = list.groupBy(MAM_ITM_DTL_R.$itm_cd,
				MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
				MAM_ITM_DTL_R.$itm_sub3);
		
		MAM_ITM_DTL_R cacheItmDtl_t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(cacheItmDtl_t);
		cacheItmDtl_bldr.setWhere(cacheItmDtl_t.itm_cd.eq(bind("itm_cd")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub1.eq(bind("itm_sub1")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub2.eq(bind("itm_sub2")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBDL5090_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr, bindL);
		
		_idxItmDtlCache = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3);
		_idxItmDtlCacheKey = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1,
				MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$sppl_cd,
				MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn);
	}
	
	/**
	 * キャッシュ作成（仕入直送マスタ）
	 * @param r
	 */
	protected void createPurcDdlvLtCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		_cachePurcDdlvLt =  new FXUCL_MCDbcCacheStEnd<MAM_PURC_DDLV_LT_R>(
				MCQueryApiBuilder.create(MAM_PURC_DDLV_LT_R.create("T")),
				dtlL,
				PoSchd_Upd01_DtlR.$sppl_cd,
				PoSchd_Upd01_DtlR.$lg_grp_cd,
				PoSchd_Upd01_DtlR.$itm_cd,
				PoSchd_Upd01_DtlR.$itm_sub1,
				PoSchd_Upd01_DtlR.$itm_sub2,
				PoSchd_Upd01_DtlR.$itm_sub3
		);
	}
	/**
	 * キャッシュ作成（品目単位マスタ）
	 * @param r
	 */
	protected void createItmUnitCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		MCList<PoSchd_Upd01_DtlR> bindL = dtlL.groupBy(PoSchd_Upd01_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub2,PoSchd_Upd01_DtlR.$itm_sub3);
		_cacheItmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R cacheItmUnit_t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder cacheItmUnit_bldr = MCQueryApiBuilder.create(cacheItmUnit_t);
		
		cacheItmUnit_bldr.setWhere(cacheItmUnit_t.itm_cd.eq(bind("itm_cd")));
		cacheItmUnit_bldr.addWhereWithAnd(cacheItmUnit_t.itm_sub1.eq(bind("itm_sub1")));
		cacheItmUnit_bldr.addWhereWithAnd(cacheItmUnit_t.itm_sub2.eq(bind("itm_sub2")));
		cacheItmUnit_bldr.addWhereWithAnd(cacheItmUnit_t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBDL5090_MAVM_ITM_UNIT_S01", _cacheItmUnit, cacheItmUnit_bldr, bindL);
		_idxItmUnitCache = _cacheItmUnit.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3);
	}
	/**
	 * キャッシュ作成（版マスタ）
	 * @param list
	 */
	protected void createItmVerCache(MCList<MAM_ITM_VER_R> dtlL) {
		MCList<MAM_ITM_VER_R> bindL = dtlL.groupBy(MAM_ITM_VER_R.$itm_cd, MAM_ITM_VER_R.$itm_sub1, MAM_ITM_VER_R.$itm_sub2,MAM_ITM_VER_R.$itm_sub3,MAM_ITM_VER_R.$site_cd);
		MAM_ITM_VER_R cacheItmVer_t = MAM_ITM_VER_R.create("T");
		MCQueryApiBuilder cacheItmVer_bldr = MCQueryApiBuilder.create(cacheItmVer_t);
		cacheItmVer_bldr.setWhere(cacheItmVer_t.itm_cd.eq(bind("itm_cd")));
		cacheItmVer_bldr.addWhereWithAnd(cacheItmVer_t.itm_sub1.eq(bind("itm_sub1")));
		cacheItmVer_bldr.addWhereWithAnd(cacheItmVer_t.itm_sub2.eq(bind("itm_sub2")));
		cacheItmVer_bldr.addWhereWithAnd(cacheItmVer_t.itm_sub3.eq(bind("itm_sub3")));
		cacheItmVer_bldr.addWhereWithAnd(cacheItmVer_t.site_cd.eq(bind("site_cd")));
		dbSelect("MSBDL5090_MAM_ITM_VER_S01", _cacheItmVer, cacheItmVer_bldr, bindL);
		_idxItmVerCache = _cacheItmVer.createIndex(MAM_ITM_VER_R.$itm_cd, MAM_ITM_VER_R.$itm_sub1, MAM_ITM_VER_R.$itm_sub2,MAM_ITM_VER_R.$itm_sub3, MAM_ITM_VER_R.$site_cd);
	}
	/**
	 * キャッシュ作成（場所マスタ（納入場所 + 製造場所））
	 * @param r
	 */
	protected void createLocCache(MCList<?> dtlL) {
		_cacheLoc = null;
		MCList<MAM_LOC_R> bind = MCList.create(MAM_LOC_R.class);
		for (MCRow r : dtlL) {
			MAM_LOC_R bindRInToLoc = MAM_LOC_R.create();
			bindRInToLoc.loc_cd(r.getString("in_to_loc_cd"));
			bind.add(bindRInToLoc);
			if (isNullOrNullVal(r.getString("mfg_loc_cd"))) {
				MAM_LOC_R bindRMfgLocR = MAM_LOC_R.create();
				bindRMfgLocR.loc_cd(r.getString("mfg_loc_cd"));
				bind.add(bindRMfgLocR);
			}
		}
		// 受払予定削除時のために、旧納入場所に紐付くマスタ値も取得しておく
		for (MST_PO_SCHD_R poSchdR : _cachePoSchd) {
			MAM_LOC_R bindRMfgLocR = MAM_LOC_R.create();
			bindRMfgLocR.loc_cd(poSchdR.in_to_loc_cd());
			bind.add(bindRMfgLocR);
		}
		
		_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
				MCQueryApiBuilder.create(MAM_LOC_R.create("T")),
				bind.groupBy(MAM_LOC_R.$loc_cd), MAM_LOC_R.$loc_cd);
	}
	
	/**
	 * キャッシュ作成（為替レートマスタ）
	 * @param r
	 */
	protected void createCurXrateCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		_cacheCurXrate = null;
		_cacheCurXrate = new FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R>(
				MCQueryApiBuilder.create(MAM_CUR_XRATE_R.create("T")), dtlL,
				PoSchd_Upd01_DtlR.$trd_cur_cd, PoSchd_Upd01_DtlR.$base_cur_cd,
				PoSchd_Upd01_DtlR.$purc_xrate_cd);
	}
	/**
	 * キャッシュ作成（納税為替レートマスタ）
	 * @param r
	 */
	protected void createPtaxCurXrateCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		_cachePtaxCurXrate = null;
		_cachePtaxCurXrate = new FXUCL_MCDbcCacheStEnd<MAM_CUR_XRATE_R>(
				MCQueryApiBuilder.create(MAM_CUR_XRATE_R.create("T")), dtlL,
				PoSchd_Upd01_DtlR.$trd_cur_cd, PoSchd_Upd01_DtlR.$ptax_cur_cd,
				PoSchd_Upd01_DtlR.$purc_xrate_cd);
	}
	
	/**
	 * キャッシュ作成（税マスタ）
	 * @param r
	 */
	protected void createTaxCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		_cacheTax = null;
		_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(
				MCQueryApiBuilder.create(MAM_TAX_R.create("T")), dtlL,
				PoSchd_Upd01_DtlR.$tax_cd);
	}
	
	/**
	 * キャッシュ作成（支給単価マスタ）
	 * @param r
	 */
	protected void createProvUpriCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		for (PoSchd_Upd01_DtlR r : dtlL) {
			if (!isNull(r.outsrc_sppl_cd())) {
				MAM_BP_R outSrcSpplR = getCacheBp(r.outsrc_sppl_cd());
				if (!isNull(outSrcSpplR)) {
					r.outsrc_sppl_cur_cd(outSrcSpplR.cur_cd());
				}
			}
		}
		_cacheProvUpri = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
				MCQueryApiBuilder.create(MAM_PROV_UPRI_R.create("T")), dtlL,
				PoSchd_Upd01_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_sub1,
				PoSchd_Upd01_DtlR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub3,
				PoSchd_Upd01_DtlR.$outsrc_sppl_cd, PoSchd_Upd01_DtlR.$outsrc_sppl_cur_cd,
				PoSchd_Upd01_DtlR.$loc_wg_cd);
	}
	/**
	 * キャッシュ作成（発注先品目マスタ）
	 * @param r
	 */
	protected void createBpItmCache(MCList<PoSchd_Upd01_DtlR> dtlL){
		_cacheBpItm = new FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R>(
				MCQueryApiBuilder.create(MAM_BP_ITM_R.create("T")), dtlL,
				PoSchd_Upd01_DtlR.$sppl_cd, PoSchd_Upd01_DtlR.$itm_cd,
				PoSchd_Upd01_DtlR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub2,
				PoSchd_Upd01_DtlR.$itm_sub3);
	}
	/**
	 * キャッシュ作成（取引先マスタ）
	 * @param r
	 */
	protected void createBpCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		MCList<MAM_BP_R> spplBindL = MCList.create(MAM_BP_R.class);
		for (PoSchd_Upd01_DtlR r : dtlL) {
			if (!isNull(r.sppl_cd())) {
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR.bp_cd(r.sppl_cd());
				spplBindL.add(bpR);
			}
			if (!isNull(r.dlv_cd())) {
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR.bp_cd(getPurcDdlvTgt(r));
				spplBindL.add(bpR);
			}
			if (!isNull(r.outsrc_sppl_cd())) {
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR.bp_cd(r.outsrc_sppl_cd());
				spplBindL.add(bpR);
			}
		}
		_cacheBp = MCList.create(MAM_BP_R.class);
		MAM_BP_R cacheBp_t = MAM_BP_R.create("T");
		MCQueryApiBuilder cacheBp_bldr = MCQueryApiBuilder.create(cacheBp_t);
		cacheBp_bldr.setWhere(cacheBp_t.bp_cd.eq(bind("bp_cd")));
		dbSelect("MSBDL5090_MAM_BP_S01", _cacheBp, cacheBp_bldr, spplBindL);
		_idxBpCache = _cacheBp.createIndex(MAM_BP_R.$bp_cd);
	}
	/**
	 * キャッシュ作成（通貨マスタ）
	 * @param r
	 */
	protected void createCurCache(MCList<PoSchd_Upd01_DtlR> dtlL) {
		MCList<MAM_BP_R> bindL = _cacheBp.clone();
		MCList<MAM_BP_R> addBindL = MCList.create(MAM_BP_R.class);
		MCIndexKey idxBindL =  bindL.createIndex(MAM_BP_R.$cur_cd);
		
		MCList<PoSchd_Upd01_DtlR>[] grpL = dtlL.groupList(PoSchd_Upd01_DtlR.$trd_cur_cd);
		
		for (MCList<PoSchd_Upd01_DtlR> tmpL : grpL) {
			PoSchd_Upd01_DtlR r = tmpL.get(0);
			// 上り電文に通貨が設定されている場合で、キャッシュ取得対象に含まれていない場合、キャッシュ取得対象に追加
			if (bindL.subList(idxBindL, r.trd_cur_cd()).size() == 0) {
				MAM_BP_R bindR = MAM_BP_R.create();
				bindR.cur_cd(r.trd_cur_cd());
				addBindL.add(bindR);
			}
		}
		bindL.addAll(addBindL);
		_cacheCur = new FXUCL_MCDbcCache<MAM_CUR_R>(
				MCQueryApiBuilder.create(MAM_CUR_R.create("T")), bindL,
				MAM_CUR_R.$cur_cd);
	}
	/**
	 * 購買担当者・購買部門初期設定用各種マスタキャッシュ作成
	 * @param dtlL
	 */
	protected void createCacheToPurcUsrDpt(MCList<PoSchd_Upd01_DtlR> dtlL){
		
		// 発注先担当マスタキャッシュ
		MCList<MAM_SPPL_USR_R> spplUsrL = MCList.create(MAM_SPPL_USR_R.class);
		_cacheSpplUsr = new FXUCL_MCDbcCacheStEnd<MAM_SPPL_USR_R>(spplUsrL,
				MCQueryApiBuilder.create(MAM_SPPL_USR_R.create("T")), dtlL,
				PoSchd_Upd01_DtlR.$sppl_cd);
		
		// 発注先担当マスタの購買部門リスト取得
		MCList<MAM_DPT_R> tmpSpplUsrDptL = MCList.create(MAM_DPT_R.class);
		for (MAM_SPPL_USR_R spplUsrR : spplUsrL.groupBy(MAM_SPPL_USR_R.$purc_dpt_cd)) {
			if (!isNull(spplUsrR.purc_dpt_cd())) {
				MAM_DPT_R tmpDptR = MAM_DPT_R.create();
				tmpDptR.dpt_cd(spplUsrR.purc_dpt_cd());
				tmpSpplUsrDptL.add(tmpDptR);
			}
		}
		
		// 発注先担当マスタの購買担当者に対する担当者権限マスタキャッシュ
		MCList<MAM_USR_ACL_R> usrAclL = MCList.create(MAM_USR_ACL_R.class);
		_cacheUsrAcl = new FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R>(usrAclL,
				MCQueryApiBuilder.create(MAM_USR_ACL_R.create("T")), spplUsrL,
				MAM_SPPL_USR_R.$purc_usr_cd);
		
		// 担当者権限マスタの主部門リスト取得
		MCList<MAM_DPT_R> tmpUsrAclDptL = MCList.create(MAM_DPT_R.class);
		for (MAM_USR_ACL_R usrAclR : usrAclL.groupBy(MAM_USR_ACL_R.$dpt_cd)) {
			if (!isNull(usrAclR.dpt_cd())) {
				MAM_DPT_R tmpDptR = MAM_DPT_R.create();
				tmpDptR.dpt_cd(usrAclR.dpt_cd());
				tmpUsrAclDptL.add(tmpDptR);
			}
		}
		
		// 部門マスタ取得用部門リスト
		MCList<MAM_DPT_R> tmpDptL = MCList.create(MAM_DPT_R.class);
		tmpDptL.merge(tmpSpplUsrDptL, MAM_DPT_R.$dpt_cd);
		tmpDptL.merge(tmpUsrAclDptL, MAM_DPT_R.$dpt_cd);
		
		// 発注先担当マスタの購買部門と担当者権限マスタの主部門に対する部門マスタキャッシュ
		_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
				MCQueryApiBuilder.create(MAM_DPT_R.create("T")), tmpDptL,
				MAM_DPT_R.$dpt_cd);
	}
	
	//----------------------------------------
	//　get(スコープまたぎなし)
	//----------------------------------------
	/**
	 * キャッシュ取得（品目詳細マスタ）
	 * @param dtlR
	 * @return
	 */
	protected MCList<MAM_ITM_DTL_R> getCacheItmDtlL(MAM_ITM_DTL_R dtlR){
		MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtlCache, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
		return itmDtlL;
	}
	/**
	 * キャッシュ取得（品目詳細マスタ）
	 * @param dtlR
	 * @return
	 */
	protected MAM_ITM_DTL_R getCacheItmDtlR(String itmCd, String itmSub1, String itmSub2, String itmSub3
			, MCDate baseDt, String locWgCd, String spplCd, String makerCd){
		MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create();
		bindR.itm_cd(itmCd);
		bindR.itm_sub1(itmSub1);
		bindR.itm_sub2(itmSub3);
		bindR.itm_sub3(itmSub3);
		
		MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtlL(bindR);
		for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
			// 適用期間かつ、WGCDが一致かつ、発注先・メーカが一致しているレコードからLTを取得
			if (baseDt.gte(itmDtlR.st_dt()) && baseDt.lte(itmDtlR.end_dt())
					&& isSame(locWgCd, itmDtlR.wg_cd())
					&& isSame(spplCd, itmDtlR.sppl_cd()) && isSame(makerCd, itmDtlR.maker_cd())) {
				return itmDtlR;
			}
		}
		return MAM_ITM_DTL_R.create();
	}
	
	/**
	 * キャッシュ取得（仕入直送ＬＴマスタ）
	 * @param dtlR
	 * @return
	 */
	protected MAM_PURC_DDLV_LT_R getCachePurcDdlvLt(PoSchd_Upd01_DtlR dtlR){
		if (_cachePurcDdlvLt == null) {
			return MAM_PURC_DDLV_LT_R.create();
		}
		MAM_PURC_DDLV_LT_R purcDdlvR = _cachePurcDdlvLt.get(isSame(_sysParm, "1") ? dtlR.rqst_avl_rqst_dt() : dtlR.po_schd_dt(),  dtlR.sppl_cd(), dtlR.lg_grp_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
		if (purcDdlvR == null) {
			return MAM_PURC_DDLV_LT_R.create();
		}
		else {
			return purcDdlvR;
		}
	}
	/**
	 * キャッシュ取得（品目単位マスタ）
	 * @param dtlR
	 * @return
	 */
	protected MCList<MAVM_ITM_UNIT_R> getCacheItmUnit(PoSchd_Upd01_DtlR dtlR){
		return _cacheItmUnit.subList(_idxItmUnitCache, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
	}
	/**
	 * キャッシュ取得（版マスタ）
	 * @param dtlR
	 * @return
	 */
	protected MCList<MAM_ITM_VER_R> getCacheItmVer(MAM_ITM_VER_R row){
		MCList<MAM_ITM_VER_R> itmVerL = _cacheItmVer.subList(_idxItmVerCache, row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.site_cd());
		return itmVerL;
	}
	
	/**
	 * キャッシュ取得（為替レートマスタ（為替レート））
	 * @param dtlR
	 * @param trd_cur_cd
	 * @return
	 */
	protected MAM_CUR_XRATE_R getCacheXrate(MCDate baseDt, PoSchd_Upd01_DtlR dtlR){
		return _cacheCurXrate.get(baseDt, dtlR.trd_cur_cd(), getCo().base_cur_cd(), getCo().purc_xrate_cd());
	}
	
	/**
	 * キャッシュ取得（為替レートマスタ（納税為替レート））
	 * @param dtlR
	 * @param trd_cur_cd
	 * @return
	 */
	protected MAM_CUR_XRATE_R getCachePtaxXrate(MCDate baseDt, PoSchd_Upd01_DtlR dtlR){
		return _cachePtaxCurXrate.get(baseDt, dtlR.trd_cur_cd(), getCo().ptax_cur_cd(), getCo().purc_xrate_cd());
	}
	
	/**
	 * キャッシュ取得（場所マスタ）
	 * @param dtlR
	 * @return
	 */
	protected MAM_LOC_R getCacheLoc(String locCd){
		return _cacheLoc.get(locCd);
	}
	
	/**
	 * キャッシュ取得（税マスタ）
	 * @param dtlR
	 * @return
	 */
	protected MAM_TAX_R getCacheTax(String tax_cd){
		return _cacheTax.get(tax_cd);
	}
	
	/**
	 * キャッシュ取得（支給単価マスタ）
	 * @param r
	 * @return
	 */
	protected MAM_PROV_UPRI_R getCacheProvUpri(PoSchd_Upd01_DtlR r) {
		if (_cacheProvUpri == null) {
			return MAM_PROV_UPRI_R.create();
		}
		MAM_PROV_UPRI_R provUpriR = _cacheProvUpri.get(r.rqst_avl_rqst_dt(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
				r.itm_sub3(), r.outsrc_sppl_cd(), r.outsrc_sppl_cur_cd(), r.loc_wg_cd());
		if (provUpriR == null) {
			return MAM_PROV_UPRI_R.create();
		}
		else {
			return provUpriR;
		}
	}
	/**
	 * キャッシュ取得（発注先品目マスタ）
	 * @param r
	 * @return
	 */
	protected MAM_BP_ITM_R getCacheBpItm(PoSchd_Upd01_DtlR r) {
		if (_cacheBpItm == null) {
			return MAM_BP_ITM_R.create();
		}
		MAM_BP_ITM_R bpItmR = _cacheBpItm.get(r.reg_dt(), r.sppl_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
		if (bpItmR == null) {
			return MAM_BP_ITM_R.create();
		}
		else {
			return bpItmR;
		}
	}
	
	/**
	 * キャッシュ取得（取引先マスタ）
	 * @param r
	 * @return
	 */
	protected MAM_BP_R getCacheBp(String bpCd) {
		return _cacheBp.getFirst(_idxBpCache, bpCd);
	}
	
	/**
	 * キャッシュ取得（通貨マスタ）
	 * @param r
	 * @return
	 */
	protected MAM_CUR_R getCacheCur(String trdCurCd) {
		return _cacheCur.get(trdCurCd);
	}
	/**
	 * キャッシュ取得（発注先担当マスタ）
	 * @param baseDt
	 * @param spplCd
	 * @return
	 */
	protected MAM_SPPL_USR_R getCacheSpplUsr(MCDate baseDt, String spplCd) {
		if (_cacheSpplUsr == null) {
			return MAM_SPPL_USR_R.create();
		}
		MAM_SPPL_USR_R spplUsrR = _cacheSpplUsr.get(baseDt, spplCd);
		if (spplUsrR == null) {
			return MAM_SPPL_USR_R.create();
		}
		else {
			return spplUsrR;
		}
	}
	/**
	 * キャッシュ取得（担当者権限マスタ）
	 * @param baseDt
	 * @param usrCd
	 * @return
	 */
	protected MAM_USR_ACL_R getCacheUsrAcl(MCDate baseDt, String usrCd) {
		if (_cacheUsrAcl == null) {
			return MAM_USR_ACL_R.create();
		}
		MAM_USR_ACL_R usrAclR = _cacheUsrAcl.get(baseDt, usrCd);
		if (usrAclR == null) {
			return MAM_USR_ACL_R.create();
		}
		else {
			return usrAclR;
		}
	}
	/**
	 * キャッシュ取得（部門マスタ）
	 * @param baseDt
	 * @param dptCd
	 * @return
	 */
	protected MAM_DPT_R getCacheDpt(MCDate baseDt, String dptCd) {
		if (_cacheDpt == null) {
			return MAM_DPT_R.create();
		}
		MAM_DPT_R dptR = _cacheDpt.get(baseDt, dptCd);
		if (dptR == null) {
			return MAM_DPT_R.create();
		}
		else {
			return dptR;
		}
	}
	
	/**
	 * PoSchd_Chk01オペレーション.<p>
	 *
	 * 発注予定を登録・訂正・取消する。<br>
	 */
	public class PoSchd_Chk01 extends MSBDL_PoSchdRegService_MC_A.PoSchd_Chk01 {
		//---------------------------------------
		/** 発注 */
		protected MCList<MST_PO_R> _poL = MCList.create(MST_PO_R.class);
		/** 品目製造指図 */
		protected MCList<MST_ITM_MFG_INST_R> _cacheItmMfgInst = MCList.create(MST_ITM_MFG_INST_R.class);
		//---------------------------------------
		/** 発注 */
		MCIndexKey _idxPoL = null;
		/** 品目製造指図 */
		MCIndexKey _idxItmMfgInstCache = null;
		//---------------------------------------
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// リクエストスコープに保存するキャッシュを作成
			doDataCache(up0());
			// チェック処理内でのみ使用するキャッシュを作成
			crtItmMfgInstL(up0());
			crtPoL();
			// チェック処理
			thisCheck();
			// 下り電文設定
			setDown();
		}
		
		/**
		 * チェック処理
		 */
		protected void thisCheck(){
			for (PoSchd_Upd01_DtlR r : up0()) {
				thisChkMain(r);
			}
			callSundryItmChk01();
			lock();
		}
		
		/**
		 * チェック主処理
		 * @param r 上り電文（行単位）
		 */
		protected void thisChkMain(PoSchd_Upd01_DtlR r){
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				// 品目から資産管理区分を取得する
				MAM_ITM_R itmR = getItmCache(r);
				r.asset_mng_typ(itmR.asset_mng_typ());
				// 取引チェック
				setTrdInfo(r);
				if (isNullOr(r.trd_cd(), r.trd_ptn_typ())) {
					// 取引マスタなし
					MCMessagePool.add(new MCMessage(r, null, MSBDL0068, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())){
				MST_PO_SCHD_R rsltPoSchdR = getPoSchd(r);
				MST_ITM_MFG_INST_R rsltItmMfgInstR = getCacheItmMfgInst(rsltPoSchdR);
				
				if (!isNull(rsltPoSchdR.po_no())) {
					// 発注済
					MCMessagePool.add(new MCMessage(r, null, MSBDL0069, rsltPoSchdR.po_schd_no(), toDispGUIIndex(r)));
					r.po_flg(true);
					
					// 発注訂正不可な進捗であれば、実績済ＦＬＧをオンにして返す。
					MST_PO_R poR = getCachePo(rsltPoSchdR.po_no());
					if (poR.aprv_flg() && (MAC_APRV_STS_TYP.isFIX(poR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(poR.aprv_sts_typ()))) {
						r.act_flg(true);
					}
					if (MSBDL_PurcUtil.isPoNotUpd(rsltPoSchdR.po_no(), rsltPoSchdR.po_d_no(), false)) {
						r.act_flg(true);
					}
				}
				
				if (!r.fr_mfg_inst_flg() && !isNull(rsltItmMfgInstR.getStringNE(MST_ITM_MFG_INST_R.$itm_mfg_inst_no))) {
					// 製造指図からの更新であれば指図済みチェックは行わない。
					
					if (r.fr_pnl_flg()) {
						// 画面更新からであれば、打切以外の訂正であれば可能だが、
						// 打切に関する操作は不可。数量などの指図に関連する項目はサービスとしてチェックはしない（画面側で抑制することを前提とする）
						if (!isSame(r.abort_flg(), rsltPoSchdR.abort_flg())) {
							MCMessagePool.add(new MCMessage(r, null, MSBDL0070, rsltPoSchdR.po_schd_no(), toDispGUIIndex(r)));
							r.po_flg(true);
						}
					}
					else {
						// 製造指図からの更新でもなく、画面更新からでも無い場合、指図後の更新は不可
						MCMessagePool.add(new MCMessage(r, null, MSBDL0070, rsltPoSchdR.po_schd_no(), toDispGUIIndex(r)));
						r.po_flg(true);
					}
				}
				if (!r.fr_pnl_flg() && rsltPoSchdR.rqst_upd_stop_flg()){
					// 依頼元訂正不可
					MCMessagePool.add(new MCMessage(r, null, MSBDL0071, rsltPoSchdR.po_schd_no()));
					r.po_flg(true);
				}
				if (!r.fr_pnl_flg() && rsltPoSchdR.abort_flg()) {
					// 打切済
					MCMessagePool.add(new MCMessage(r, null, MSBDL0072, rsltPoSchdR.po_schd_no()));
					r.po_flg(true);
				}
				if (MSC_PO_SCHD_CHG_TYP.isDIV_DEL(rsltPoSchdR.po_schd_chg_typ())) {
					// 分割済
					MCMessagePool.add(new MCMessage(r, null, MSBDL0073, rsltPoSchdR.po_schd_no()));
					r.po_flg(true);
					
					MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
					poSchdL.addBooleanColumn("aprv_flg");
					MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
					MST_PO_R t2 = MST_PO_R.create("T2");
					MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
					poSchdL_bldr.setSelect(t.po_no, t.po_d_no, t2.aprv_flg, t2.aprv_sts_typ);
					poSchdL_bldr.addInnerJoin(t2, bracket(t.po_no.eq(t2.po_no)));
					poSchdL_bldr.setWhere(t.po_schd_src_typ.eq(bind("po_schd_src_typ")));
					poSchdL_bldr.addWhereWithAnd(t.po_schd_src_no.eq(bind("po_schd_src_no")));
					poSchdL_bldr.addWhereWithAnd(t.rqst_can_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(false));
					poSchdL_bldr.addWhereWithAnd(t.po_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(true));
					dbSelect("MSBDL5090_MST_PO_SCHD_S11", poSchdL, poSchdL_bldr, r);
					
					for (MST_PO_SCHD_R poSchdR : poSchdL) {
						// 発注訂正不可な進捗であれば、実績済ＦＬＧをオンにして返す。
						if (poSchdR.getBoolean("aprv_flg") && (MAC_APRV_STS_TYP.isFIX(poSchdR.getString("aprv_sts_typ")) || MAC_APRV_STS_TYP.isACPT(poSchdR.getString("aprv_sts_typ")))) {
							r.act_flg(true);
						}
						if (MSBDL_PurcUtil.isPoNotUpd(poSchdR.po_no(), poSchdR.po_d_no(), false)) {
							r.act_flg(true);
						}
					}
				}
			}
			// 発注予定一覧登録画面や製造指図画面などから発注予定の更新をしようとしたときは、次処理済みの場合はエラーとする。
			// (出荷供給依頼SVなどからのコールの場合は次処理済でもエラーとしない)
			if (r.fr_pnl_flg() || r.fr_mfg_inst_flg()) {
				if (r.po_flg()) {
					r.err_flg(true);
				}
			}
			// 削除以外で、加工単価もしくは有償支給単価ありで、単価 = 加工単価 + 有償支給単価とならない場合、エラー
			if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && (!isNull(r.trd_cur_proc_upri()) || !isNull(r.trd_cur_onr_prov_upri()))) {
				MCNumber upri = nvl(r.trd_cur_proc_upri(), MCNumber.ZERO).add(nvl(r.trd_cur_onr_prov_upri(), MCNumber.ZERO));
				if(!isSame(nvl(r.trd_cur_upri(), MCNumber.ZERO), upri)) {
					MCMessagePool.add(new MCMessage(r, PoSchd_Upd01_DtlR.$trd_cur_upri, MSBDL0501, upri, r.trd_cur_upri(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
		
		/**
		 * ロック処理
		 * 画面からコールされた場合は画面に対応するサービスがロックを行いますが、
		 * 他のサービスからコールされた場合にロックがとれないため、本サービスでもロックを行います。
		 */
		protected void lock() {
			MCList<MST_PO_SCHD_R> poSchdLocL = MCList.create(MST_PO_SCHD_R.class);
			
			MCList<PoSchd_Upd01_DtlR> list = getChkList(up0());
			MCList<MST_PO_SCHD_R> bindL = MCList.create(MST_PO_SCHD_R.class);
			for (PoSchd_Upd01_DtlR r : list) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					bindL.add(getPoSchd(r));
				}
			}
			dbSelectKeyForUpdate("MSBDL5090_MST_PO_SCHD_S03", poSchdLocL,
					MCQueryApiBuilder.create(MST_PO_SCHD_R.create("T")), bindL);
		}
		
		/**
		 * 諸口品登録サービスチェック処理
		 */
		protected void callSundryItmChk01() {
			MCList<PoSchd_Upd01_DtlR> dtlL = getChkList(up0());
			MABCL_SundryItmRegService.SundryItm_Chk01 chk01 = MABCL_SundryItmRegService.crtSundryItm_Chk01();
			MCIndexKey idx = dtlL.createIndex(PoSchd_Upd01_DtlR.$sundry_itm_flg, PoSchd_Upd01_DtlR.$po_schd_src_typ);
			addAll(chk01.up0(), dtlL.subList(idx, true, MSC_PO_SCHD_SRC_TYP.UPLND.value()), createMap_SundryItm_Chk01_DtlR_PoSchd_Upd01_DtlR());
			if (!chk01.up0().isEmpty()) {
				chk01.exec();
				copyErrFlg(dtlL, chk01.down0());
			}
		}
		
		protected Map_SundryItm_Chk01_DtlR_PoSchd_Upd01_DtlR<SundryItm_Chk01_DtlR,PoSchd_Upd01_DtlR> createMap_SundryItm_Chk01_DtlR_PoSchd_Upd01_DtlR() {
			return new Map_SundryItm_Chk01_DtlR_PoSchd_Upd01_DtlR<SundryItm_Chk01_DtlR, PoSchd_Upd01_DtlR>();
		}

		public class Map_SundryItm_Chk01_DtlR_PoSchd_Upd01_DtlR<D extends SundryItm_Chk01_DtlR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, PoSchd_Upd01_DtlR.$peg_no);
				addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ, PoSchd_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_cd);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3, PoSchd_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, PoSchd_Upd01_DtlR.$sno1);
				addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, PoSchd_Upd01_DtlR.$sno2);
				addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, PoSchd_Upd01_DtlR.$sno3);
				addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, PoSchd_Upd01_DtlR.$sno4);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, PoSchd_Upd01_DtlR.$itm_nm);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
			}
		}
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
		
		/**
		 * キャッシュ作成（品目製造指図）
		 * @param dtlL
		 */
		protected void crtItmMfgInstL(MCList<PoSchd_Upd01_DtlR> dtlL) {
			MCList<MST_PO_SCHD_R> bindL = MCList.create(MST_PO_SCHD_R.class);
			for (PoSchd_Upd01_DtlR r : dtlL) {
				MST_PO_SCHD_R bindR = getPoSchd(r);
				if (!isNull(bindR.outsrc_itm_ord_no())) {
					bindL.add(bindR);
				}
			}
			_cacheItmMfgInst = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R cacheItmMfgInst_t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder cacheItmMfgInst_bldr = MCQueryApiBuilder.create(cacheItmMfgInst_t);

			cacheItmMfgInst_bldr.setWhere(cacheItmMfgInst_t.itm_ord_no.eq(bind("outsrc_itm_ord_no")));
			cacheItmMfgInst_bldr.addWhereWithAnd(cacheItmMfgInst_t.can_flg.eq(bind("1")),
					MCBooleanUtil.booleanToDBString(false));
			dbSelect("MSBDL5090_MST_ITM_MFG_INST_S01", _cacheItmMfgInst, cacheItmMfgInst_bldr,
					bindL.groupBy(MST_PO_SCHD_R.$outsrc_itm_ord_no));
			_idxItmMfgInstCache = _cacheItmMfgInst.createIndex(MST_ITM_MFG_INST_R.$itm_ord_no);
		}
		/**
		 * キャッシュ作成（発注）
		 * @param dtlL
		 */
		protected void crtPoL() {
			_poL = MCList.create(MST_PO_R.class);
			MST_PO_R poL_t = MST_PO_R.create("T");
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(poL_t);
			poL_bldr.setWhere(poL_t.po_no.eq(bind("po_no")));
			poL_bldr.addWhereWithAnd(poL_t.can_flg.eq(bind("1")),
					MCBooleanUtil.booleanToDBString(false));
			dbSelect("MSBDL5090_MST_PO_S01", _poL, poL_bldr, object(CLAZZ)._cachePoSchd);
			_idxPoL = _poL.createIndex(MST_PO_R.$po_no);
		}
		/**
		 * キャッシュ取得（品目製造指図）
		 * @param dtlL
		 */
		protected MST_ITM_MFG_INST_R getCacheItmMfgInst(MST_PO_SCHD_R r) {
			MST_ITM_MFG_INST_R itmMfgInstR = _cacheItmMfgInst.getFirst(_idxItmMfgInstCache, r.outsrc_itm_ord_no());
			if (itmMfgInstR == null) {
				return MST_ITM_MFG_INST_R.create();
			} 
			else {
				return itmMfgInstR;
			}
		}
		/**
		 * キャッシュ取得（発注）
		 * @param poNo　発注ＮＯ
		 */
		protected MST_PO_R getCachePo(String poNo) {
			MST_PO_R poR = _poL.getFirst(_idxPoL, poNo);
			if (poR == null) {
				return MST_PO_R.create();
			} 
			else {
				return poR;
			}
		}
	}
	
	/**
	 * PoSchd_Chk02オペレーション.<p>
	 *
	 * 分割処理前チェック<br>
	 */
	public class PoSchd_Chk02 extends MSBDL_PoSchdRegService_MC_A.PoSchd_Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// ワークテーブルの作成
			crtWk();
			
			// チェック対象の発注予定を取得
			MCList<MST_PO_SCHD_R> rsltL = MCList.create(MST_PO_SCHD_R.class);
			MCMainQuery q = get_MST_PO_SCHD_sql();
			q.executeQuery(rsltL);
			
			MCIndexKey idxRslt = rsltL.createIndex(MST_PO_SCHD_R.$po_schd_no);
			
			for (PoSchd_Chk02_DtlR r : up0()) {
				MST_PO_SCHD_R rsltR = rsltL.getFirst(idxRslt, r.po_schd_no());
				if (rsltR.po_flg()) {
					MCMessagePool.add(new MCMessage(r, null, MSBDL0069, toDispGUIIndex(r)));
				}
				if (rsltR.abort_flg()) {
					MCMessagePool.add(new MCMessage(r, null, MSBDL0072, toDispGUIIndex(r)));
				}
				if (!isNull(rsltR.getStringNE(MST_ITM_MFG_INST_R.$itm_mfg_inst_no))) {
					MCMessagePool.add(new MCMessage(r, null, MSBDL0070, r.po_schd_no(), toDispGUIIndex(r)));
				}
			}
		}
		
		private MCMainQuery get_MST_PO_SCHD_sql() {
			MSW_PO_SCHD_KEY_R S0WK = MSW_PO_SCHD_KEY_R.create("WK");
			MST_PO_SCHD_R S0T1 = MST_PO_SCHD_R.create("T1");
			MST_ITM_ORDER_R S0T2 = MST_ITM_ORDER_R.create("T2");
			MST_ITM_MFG_INST_R S0T3 = MST_ITM_MFG_INST_R.create("T3");

			MCMainQuery q = sql("MSBDL5090_MST_PO_SCHD_S04")
				.mainQuery()
				.select(
					S0T1.po_schd_no,
					S0T1.po_flg,
					S0T1.outsrc_itm_ord_no,
					S0T1.abort_flg,
					S0T1.po_schd_chg_typ,
					S0T3.itm_mfg_inst_no
				)
				.from(S0T1
					.innerJoin(S0WK).on(S0T1.po_schd_no.eq(S0WK.po_schd_no))
					.leftOuterJoin(S0T2).on(S0T1.outsrc_itm_ord_no.eq(S0T2.itm_ord_no))
					.leftOuterJoin(S0T3).on(S0T2.itm_ord_no.eq(S0T3.itm_ord_no)
						.and(S0T3.can_flg.eq(value(false))))
				);
			return q;
		}

		/**
		 * チェック対象の発注予定ＮＯをワークテーブルに登録します。
		 */
		protected void crtWk() {
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			for (PoSchd_Chk02_DtlR r : up0()) {
				MST_PO_SCHD_R wkR = MST_PO_SCHD_R.create();
				wkR.po_schd_no(r.po_schd_no());
				poSchdL.add(wkR);
			}
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(MST_PO_SCHD_R.create("T"));
			dbWkDelete("MSBDL5090_MSW_PO_SCHD_D01", poSchdL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5090_MSW_PO_SCHD_I01", poSchdL, poSchdL_bldr.getBaseDbc());
		}
	}
	
	/**
	 * PoSchd_Upd01オペレーション.<p>
	 *
	 * 発注予定を登録・訂正・取消する。<br>
	 */
	public class PoSchd_Upd01 extends MSBDL_PoSchdRegService_MC_A.PoSchd_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		/**
		 * メイン処理
		 */
		@Override	
		protected void doIt() {
			completionBase();
			crtBaseCache();
			updPoSchd();
			callInspSchd();
			callIoSchd();
			callSlsSchd();
			callOrdUpd04();
			callSundryItmUpd01();
			down0().setAll(up0());
		}
		
		/**
		 * キャッシュ作成
		 */
		protected void crtBaseCache(){
			// 場所
			createLocCache(up0());
			
			// bind編集
			MCList<MAM_ITM_DTL_R> bindL = MCList.create(MAM_ITM_DTL_R.class);
			MCList<MAM_ITM_VER_R> verBindL = MCList.create(MAM_ITM_VER_R.class);
			for (PoSchd_Upd01_DtlR r : up0()) {
				// 品目詳細
				MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindL.add(bindR);
				
				// 版
				MAM_ITM_VER_R verBindR = MAM_ITM_VER_R.create();
				verBindR.itm_cd(r.itm_cd());
				verBindR.itm_sub1(r.itm_sub1());
				verBindR.itm_sub2(r.itm_sub2());
				verBindR.itm_sub3(r.itm_sub3());
				verBindR.site_cd(getCacheLoc(r.in_to_loc_cd()).site_cd());
				verBindL.add(verBindR);
			}
			// 為替レート
			up0().setStringNE(PoSchd_Upd01_DtlR.$base_cur_cd, getCo().base_cur_cd());
			up0().setStringNE(PoSchd_Upd01_DtlR.$purc_xrate_cd, getCo().purc_xrate_cd());
			up0().setStringNE(MAM_CO_R.$ptax_cur_cd, getCo().ptax_cur_cd());
			
			// 品目詳細
			createItmDtlCache(bindL);
			// 品目単位
			createItmUnitCache(up0());
			// 版
			createItmVerCache(verBindL);
		}
		/**
		 * 画面からコール時に必要な情報のキャッシュを作成します
		 * @param dtlL
		 */
		protected void createCacheFrPnl(MCList<PoSchd_Upd01_DtlR> dtlL) {
			// 取引先情報
			createBpCache(dtlL);
			// 通貨情報
			createCurCache(dtlL);
			// 支給単価情報
			createProvUpriCache(dtlL);
			// 仕入直送
			createPurcDdlvLtCache(dtlL);
			// 税情報
			createTaxCache(dtlL);
		}
		/**
		 * サービスからコール時に必要な情報のキャッシュを作成します
		 * @param dtlL
		 */
		protected void createCacheFrSv(MCList<PoSchd_Upd01_DtlR> dtlL) {
			// 取引先情報
			createBpCache(dtlL);
			
			// 通貨情報
			createCurCache(dtlL);
			
			// 発注先品目情報
			createBpItmCache(dtlL);
			
			// 購買担当者・購買部門初期設定用各種マスタ
			createCacheToPurcUsrDpt(dtlL);
		}
		
		/**
		 * 発注予定の登録・更新・削除処理
		 */
		protected void updPoSchd(){
			MCList<MST_PO_SCHD_R> insPoSchdL = MCList.create(MST_PO_SCHD_R.class);
			MCList<MST_PO_SCHD_R> updPoSchdL = MCList.create(MST_PO_SCHD_R.class);
			MCList<MST_PO_SCHD_R> abortPoSchdL = MCList.create(MST_PO_SCHD_R.class);
			MCList<MST_PO_SCHD_R> delPoSchdL = MCList.create(MST_PO_SCHD_R.class);
			
			// 発番準備
			MCList<PoSchd_Upd01_DtlR> crtL = up0().subList(PoSchd_Upd01_DtlR.$data_crud_typ,MAC_DATA_CRUD_TYP.CRT.value());
			
			int cacheSize = crtL.size();
			int ioSchdCacheSize = crtL.subList(PoSchd_Upd01_DtlR.$io_schd_pr_no, null).size();
			
			doSeqCache(MSC_NUM_SYS_TYP.POSCHD, cacheSize);
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, ioSchdCacheSize);
			
			for (PoSchd_Upd01_DtlR r : up0()) {
				
				// 補完処理
				if (r.fr_pnl_flg()) {
					updPoSchdFrPnl(r);
				}
				else {
					updPoSchdFrSv(r);
				}
				updPoSchdFrCmn(r);
			}
			
			// 上記による基本情報の補完後、さらに補完して更新リストを作成する
			makeList(up0(), insPoSchdL, updPoSchdL, abortPoSchdL, delPoSchdL);
			
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			if (insPoSchdL.size() > 0) {
				dbInsert("MSBDL5090_MST_PO_SCHD_I01", insPoSchdL, MCQueryApiBuilder.create(t));
			}
			if (updPoSchdL.size() > 0) {
				MCQueryApiBuilder updPoSchdL_bldr = MCQueryApiBuilder.create(t);
				editUpdCol(updPoSchdL, updPoSchdL_bldr, t);
				dbUpdateKey("MSBDL5090_MST_PO_SCHD_U01", updPoSchdL, updPoSchdL_bldr);
			}
			if (abortPoSchdL.size() > 0) {
				MCQueryApiBuilder abortPoSchdL_bldr = MCQueryApiBuilder.create(t);
				editAbortCol(abortPoSchdL, abortPoSchdL_bldr, t);
				dbUpdateKey("MSBDL5090_MST_PO_SCHD_U02", abortPoSchdL, abortPoSchdL_bldr);
			}
			if (delPoSchdL.size() > 0) {
				dbDeleteKey("MSBDL5090_MST_PO_SCHD_D01", delPoSchdL, MCQueryApiBuilder.create(t));
			}
		}
		/**
		 * 基礎的な補完処理
		 */
		protected void completionBase() {
			for (PoSchd_Upd01_DtlR dtlR : up0()) {
				// 品名
				if (!getItmCache(dtlR).sundry_itm_flg()) {
					dtlR.itm_nm(null);
					dtlR.iv_itm_nm(null);
				}
				// null補完
				setNullVal(dtlR);
			}
		}
		/**
		 * null文字補完
		 */
		protected void setNullVal(PoSchd_Upd01_DtlR r) {
			if (isNull(r.str_ln_cd())) {
				r.str_ln_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.maker_cd())) {
				r.maker_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.mfg_loc_cd())) {
				r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.bom_ptn())) {
				r.bom_ptn(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno1())) {
				r.sno1(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno2())) {
				r.sno2(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno3())) {
				r.sno3(MAC_STR.NULL_VAL.value());
			}
			if (isNull(r.sno4())) {
				r.sno4(MAC_STR.NULL_VAL.value());
			}
		}
		
		/**
		 * 発注予定の登録・更新のためにデータを補完します。
		 * （削除時は発注予定ＮＯのみ必要なため補完しません）
		 */
		protected PoSchd_Upd01_DtlR updPoSchdFrPnl(PoSchd_Upd01_DtlR dtlR){
			if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					// 新規
					insCompletionFrPnl(dtlR);
				} 
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					// 更新
					updCompletionFrPnl(dtlR);
				}
				
				// 購入ＬＴの取得
				setItmDtlInfo(dtlR);
				
				// 場所情報設定
				setLocInfo(dtlR);
			}
			return dtlR;
		}
		
		/**
		 * 発注予定の登録・更新・削除処理
		 */
		protected PoSchd_Upd01_DtlR updPoSchdFrSv(PoSchd_Upd01_DtlR dtlR){
			if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				// 品目情報設定
				setItmInfo(dtlR);
				
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					// 新規
					insCompletionFrSv(dtlR);
				} 
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					// 更新
					updCompletionFrSv(dtlR);
				}
				
				// 場所情報設定
				setLocInfo(dtlR);
				
				// 直送区分
				setDrctDlvTyp(dtlR);
				
				// 発注先
				setSpplInfo(dtlR);
				
				// 品目詳細情報の取得
				setItmDtlInfo(dtlR);
				
				// 版ＮＯ
				setItmVerInfo(dtlR);
				
				// ロット数量調整
				adjustLotQty(dtlR);
				
				// 依頼元から発注先などが変更されている可能性があるため、単価再取得ＦＬＧは無視する
				dtlR.upri_not_tgt_flg(false);
			}
			else {
				// 取消
				delCompletion(dtlR);
				// 受払のために場所情報設定
				setLocInfo(dtlR);
			}
			return dtlR;
		}
		
		/**
		 * 発注予定の登録・更新・削除処理
		 */
		protected PoSchd_Upd01_DtlR updPoSchdFrCmn(PoSchd_Upd01_DtlR dtlR){
			if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				// 仕入か経費購買かを判定
				setXpnsPurcFlg(dtlR);
			}
			return dtlR;
		}
		
		/**
		 * 更新リストを作成します
		 * @param dtlL
		 * @param insPoSchdL
		 * @param updPoSchdL
		 * @param abortPoSchdL
		 * @param delPoSchdL
		 */
		protected void makeList(MCList<PoSchd_Upd01_DtlR> dtlL,
				MCList<MST_PO_SCHD_R> insPoSchdL, MCList<MST_PO_SCHD_R> updPoSchdL,
				MCList<MST_PO_SCHD_R> abortPoSchdL, MCList<MST_PO_SCHD_R> delPoSchdL) {
			
			// サービスからコールされた場合に必要な処理
			makeListFrSv(dtlL.subList(PoSchd_Upd01_DtlR.$fr_pnl_flg, false));
			
			// 画面からコールされた場合に必要な処理
			makeListFrPnl(dtlL.subList(PoSchd_Upd01_DtlR.$fr_pnl_flg, true));
			
			// 上り電文を分配します。
			dvideList(dtlL, insPoSchdL, updPoSchdL, abortPoSchdL, delPoSchdL);
		}
		
		/**
		 * 画面からコールされた場合の処理
		 * @param dtlL
		 */
		protected void makeListFrPnl(MCList<PoSchd_Upd01_DtlR> allL){
			if (isNull(allL)) {
				return;
			}
			
			// キャッシュ取得
			prepareFrPnl(allL);
			
			// 新規または更新のときのみ以下補完処理
			MCList<PoSchd_Upd01_DtlR> dtlL = allL.subList(PoSchd_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			dtlL.addAll(allL.subList(PoSchd_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()));
			
			// 補完処理（共通）
			completionCmn(dtlL);
			// 支給先情報補完
			setProvInfo(dtlL);
			// 仕入直送の場合購入ＬＴを上書き
			setLt(dtlL);
			// 税情報補完
			setTaxInfo(dtlL);
		}
		
		/**
		 * サービスからコールされた場合の処理
		 * @param dtlL
		 */
		protected void makeListFrSv(MCList<PoSchd_Upd01_DtlR> allL){
			if (isNull(allL)) {
				return;
			}
			
			// キャッシュ取得
			prepareFrSv(allL);
			
			// 新規または更新のときのみ以下補完処理
			MCList<PoSchd_Upd01_DtlR> dtlL = allL.subList(PoSchd_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			dtlL.addAll(allL.subList(PoSchd_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()));
			
			// 補完処理（共通）
			completionCmn(dtlL);
			
			// 支給先情報補完
			createProvUpriCache(dtlL);
			setProvInfo(dtlL);
			
			// 購入ＬＴ補完
			createPurcDdlvLtCache(dtlL);
			setLt(dtlL);
			
			// 税ＣＤ判定
			getTaxCd(dtlL);
			// 単価補完
			setUpriInfo(dtlL);
			// 金額補完
			setAmtInfo(dtlL);
			// 購買担当者・購買部門の設定
			setDefUsrDpt(dtlL);
			
			// 棚・ラインCD補完
			setDefStrLnCd(dtlL);
		}
		
		/**
		 * 上り電文を更新更新対象のリストに分配します。
		 * @param dtlL
		 * @param insPoSchdL
		 * @param updPoSchdL
		 * @param abortPoSchdL
		 * @param delPoSchdL
		 */
		protected void dvideList(MCList<PoSchd_Upd01_DtlR> dtlL,
				MCList<MST_PO_SCHD_R> insPoSchdL, MCList<MST_PO_SCHD_R> updPoSchdL,
				MCList<MST_PO_SCHD_R> abortPoSchdL, MCList<MST_PO_SCHD_R> delPoSchdL) {
			for (PoSchd_Upd01_DtlR r : dtlL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 新規
					r.po_schd().base_unit_po_qty(MCNumber.ZERO);
					r.org_flg(true);
					trunkDt(r);
					insPoSchdL.add(r.po_schd());
				} 
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					// 更新
					if (isSame(r.bef_abort_flg(), r.abort_flg())) {
						// 打切以外
						trunkDt(r);
						updPoSchdL.add(r.po_schd());
					}
					else {
						// 打切
						abortPoSchdL.add(r.po_schd());
					}
				} 
				else {
					// 取消
					delPoSchdL.add(r.po_schd());
				}
			}
		}
		
		protected void trunkDt(PoSchd_Upd01_DtlR r){
			
			r.po_schd_dt(r.po_schd_dt().trunc(MCDateFieldType.DAY));
			if (!isNull(r.purc_schd_dt())) {
				r.purc_schd_dt(r.purc_schd_dt().trunc(MCDateFieldType.DAY));
			}
			r.rqst_avl_rqst_dt(r.rqst_avl_rqst_dt().trunc(MCDateFieldType.DAY));
		}
		
		/**
		 * コール元が画面の場合に必要な処理
		 */
		protected void prepareFrPnl(MCList<PoSchd_Upd01_DtlR> dtlL) {
			// 画面からコール時に必要な情報を補完する
			createCacheFrPnl(dtlL);
		}	
		/**
		 * コール元がサービスの場合に必要な処理
		 */
		protected void prepareFrSv(MCList<PoSchd_Upd01_DtlR> dtlL) {
			// ＳＶ経由時に必要な情報を補完する
			createCacheFrSv(dtlL);
		}
		
		/**
		 * 補完処理
		 * @param dtlL
		 */
		protected void completionCmn(MCList<PoSchd_Upd01_DtlR> dtlL)  {
			for (PoSchd_Upd01_DtlR r : dtlL) {
				MAM_BP_R spplR = getCacheBp(r.sppl_cd());
				MAM_BP_ITM_R bpItmR = getCacheBpItm(r);
				// 発注先情報
				if (!isNull(spplR)) {
					if (!r.fr_pnl_flg()){
						r.trd_cur_cd(spplR.cur_cd());
						String purcUpriReqTyp = spplR.purc_upri_req_typ();
						if (isNull(purcUpriReqTyp)) {
							r.purc_upri_req_typ(getCo().purc_upri_req_typ());
						}
						else {
							r.purc_upri_req_typ(purcUpriReqTyp);
						}
						r.sppl_itm_cd(bpItmR.bp_itm_cd());
						r.sppl_itm_nm(bpItmR.bp_itm_nm());
					}
					r.sppl_iv_flg(spplR.sppl_iv_flg());
					r.purc_amt_rnd_typ(spplR.purc_amt_rnd_typ());
					r.purc_tax_rnd_typ(spplR.purc_tax_rnd_typ());
				}
				
				// 直送
				if (!isNull(r.dlv_cd()) || !isNull(r.outsrc_sppl_cd())) {
					MAM_BP_R dlvR = getCacheBp(getPurcDdlvTgt(r));
					MAM_LOC_R locR = getCacheLoc(r.in_to_loc_cd());
					if (!isNull(dlvR)) {
						//　後続処理でＬＴ取得時に利用する
						r.lg_grp_cd(dlvR.lg_grp_cd());
					}
					else if (!isNull(locR)) {
						r.lg_grp_cd(locR.lg_grp_cd());
					}

					// 直送の場合は入荷・仕入同時となる
					r.purc_schd_dt(r.dlv_rqst_tm().trunc(MCDateFieldType.DAY)); 
				}
				
				// 通貨
				MAM_CUR_R curR = getCacheCur(r.trd_cur_cd());
				r.trd_cur_amt_dec_place(curR.amt_dec_place());
			}
		}

		/**
		 * 新規時補完処理
		 * @param upInfo
		 * @return
		 */
		protected PoSchd_Upd01_DtlR insCompletionFrPnl(PoSchd_Upd01_DtlR dtlR){
			// 発番
			dtlR.po_schd_no(getStrSeq(MSC_NUM_SYS_TYP.POSCHD));
			dtlR.po_schd_src_no(dtlR.po_schd_no());
			dtlR.io_schd_pr_no(getIoSchdPrNo());
						
			// 発注予定変更区分の設定
			dtlR.po_schd_chg_typ(MSC_PO_SCHD_CHG_TYP.NOT_CHG.value());
			
			return dtlR;
		}
		
		/**
		 * 新規時補完処理
		 * @param upInfo
		 * @return
		 */
		protected PoSchd_Upd01_DtlR insCompletionFrSv(PoSchd_Upd01_DtlR dtlR){
			// 発番
			dtlR.po_schd_no(getStrSeq(MSC_NUM_SYS_TYP.POSCHD));
			if (isNull(dtlR.po_schd_src_no())) {
				// 発注点在庫補充の場合、発注予定作成元ＮＯには発注予定ＮＯを設定する。
				dtlR.po_schd_src_no(dtlR.po_schd_no());
			}
			if (isNull(dtlR.io_schd_pr_no())) {
				// 受払進捗管理ＮＯが取得できない場合発番する。
				dtlR.io_schd_pr_no(getIoSchdPrNo());
			}
			
			// 取引情報の設定
			setTrdInfo(dtlR);
			
			// 発注予定変更区分の設定
			dtlR.po_schd_chg_typ(MSC_PO_SCHD_CHG_TYP.NOT_CHG.value());
			
			return dtlR;
		}
		
		/**
		 * 更新時補完処理
		 * @param dtlR
		 * @return
		 */
		protected PoSchd_Upd01_DtlR updCompletionFrPnl (PoSchd_Upd01_DtlR dtlR){
			MST_PO_SCHD_R poSchd = getPoSchd(dtlR);
			dtlR.po_schd_no(poSchd.po_schd_no());
			dtlR.bef_abort_flg(poSchd.abort_flg());
			
			// 打切更新の場合は補完処理を中断する
			if (!isSame(dtlR.bef_abort_flg(), dtlR.abort_flg())) {
				return dtlR;
			}
			
			return dtlR;
		}
		/**
		 * 更新時補完処理
		 * @param dtlR
		 * @return
		 */
		protected PoSchd_Upd01_DtlR updCompletionFrSv(PoSchd_Upd01_DtlR dtlR){
			MST_PO_SCHD_R poSchd = getPoSchd(dtlR);
			dtlR.po_schd_no(poSchd.po_schd_no());
			dtlR.bef_abort_flg(poSchd.abort_flg());
			// 打切更新の場合は補完処理を中断する
			if (!isSame(dtlR.bef_abort_flg(), dtlR.abort_flg())) {
				return dtlR;
			}
			
			// 更新不可項目は発注予定から上書
			copy(dtlR, poSchd, createMap_PoSchd_Upd01_DtlR_MST_PO_SCHD_R());
			
			return dtlR;
		}
		
		/**
		 * 削除時補完処理
		 * @param dtlR
		 * @return
		 */
		protected PoSchd_Upd01_DtlR delCompletion(PoSchd_Upd01_DtlR dtlR){
			MST_PO_SCHD_R poSchd = getPoSchd(dtlR);
			dtlR.po_schd_no(poSchd.po_schd_no());
			return dtlR;
		}
		
		/**
		 * 更新項目の決定(更新)
		 * @param t 
		 * @param poSchdL_bldr 
		 */
		protected void editUpdCol(MCList<MST_PO_SCHD_R> poSchdL, MCQueryApiBuilder poSchdL_bldr, MST_PO_SCHD_R t){
			poSchdL_bldr.setSet(t.po_schd_no);
			poSchdL_bldr.addSet(t.trd_cd);
			poSchdL_bldr.addSet(t.trd_ptn_typ);
			poSchdL_bldr.addSet(t.sundry_itm_flg);
			poSchdL_bldr.addSet(t.itm_nm);
			poSchdL_bldr.addSet(t.iv_itm_nm);
			poSchdL_bldr.addSet(t.ver_no);
			poSchdL_bldr.addSet(t.sppl_itm_cd);
			poSchdL_bldr.addSet(t.sppl_itm_nm);
			poSchdL_bldr.addSet(t.sno1);
			poSchdL_bldr.addSet(t.sno2);
			poSchdL_bldr.addSet(t.sno3);
			poSchdL_bldr.addSet(t.sno4);
			poSchdL_bldr.addSet(t.purc_rsn_cd);
			poSchdL_bldr.addSet(t.in_to_loc_cd);
			poSchdL_bldr.addSet(t.str_ln_cd);
			poSchdL_bldr.addSet(t.dlv_cd);
			poSchdL_bldr.addSet(t.dlv_sundry_flg);
			poSchdL_bldr.addSet(t.dlv_nm);
			poSchdL_bldr.addSet(t.dlv_cntct_dpt);
			poSchdL_bldr.addSet(t.dlv_cntct_psn);
			poSchdL_bldr.addSet(t.dlv_zip_cd);
			poSchdL_bldr.addSet(t.dlv_addr1);
			poSchdL_bldr.addSet(t.dlv_addr2);
			poSchdL_bldr.addSet(t.dlv_addr3);
			poSchdL_bldr.addSet(t.dlv_addr4);
			poSchdL_bldr.addSet(t.dlv_tel);
			poSchdL_bldr.addSet(t.dlv_fax);
			poSchdL_bldr.addSet(t.tdlv_cd);
			poSchdL_bldr.addSet(t.tdlv_sundry_flg);
			poSchdL_bldr.addSet(t.tdlv_nm);
			poSchdL_bldr.addSet(t.tdlv_cntct_dpt);
			poSchdL_bldr.addSet(t.tdlv_cntct_psn);
			poSchdL_bldr.addSet(t.tdlv_zip_cd);
			poSchdL_bldr.addSet(t.tdlv_addr1);
			poSchdL_bldr.addSet(t.tdlv_addr2);
			poSchdL_bldr.addSet(t.tdlv_addr3);
			poSchdL_bldr.addSet(t.tdlv_addr4);
			poSchdL_bldr.addSet(t.tdlv_tel);
			poSchdL_bldr.addSet(t.tdlv_fax);
			poSchdL_bldr.addSet(t.reg_dt);
			poSchdL_bldr.addSet(t.rqst_wg_cd);
			poSchdL_bldr.addSet(t.purc_usr_cd);
			poSchdL_bldr.addSet(t.purc_dpt_cd);
			poSchdL_bldr.addSet(t.wg_cd);
			poSchdL_bldr.addSet(t.sppl_cd);
			poSchdL_bldr.addSet(t.maker_cd);
			poSchdL_bldr.addSet(t.outsrc_itm_ord_no);
			poSchdL_bldr.addSet(t.mfg_loc_cd);
			poSchdL_bldr.addSet(t.bom_ptn);
			poSchdL_bldr.addSet(t.trd_unit_qty);
			poSchdL_bldr.addSet(t.trd_unit_cd);
			poSchdL_bldr.addSet(t.base_unit_qty);
			poSchdL_bldr.addSet(t.purc_upri_req_typ);
			poSchdL_bldr.addSet(t.trd_cur_cd);
			poSchdL_bldr.addSet(t.tax_cd);
			poSchdL_bldr.addSet(t.xrate_inpt_flg);
			poSchdL_bldr.addSet(t.xrate);
			poSchdL_bldr.addSet(t.ptax_xrate);
			poSchdL_bldr.addSet(t.ptax_xrate_inpt_flg);
			poSchdL_bldr.addSet(t.upri_not_tgt_flg);
			poSchdL_bldr.addSet(t.interim_flg);
			poSchdL_bldr.addSet(t.trd_cur_upri);
			poSchdL_bldr.addSet(t.trd_cur_proc_upri);
			poSchdL_bldr.addSet(t.trd_cur_onr_prov_upri);
			poSchdL_bldr.addSet(t.trd_cur_amt);
			poSchdL_bldr.addSet(t.trd_cur_proc_amt);
			poSchdL_bldr.addSet(t.trd_cur_onr_prov_amt);
			poSchdL_bldr.addSet(t.trd_cur_tax_amt);
			poSchdL_bldr.addSet(t.po_schd_dt);
			poSchdL_bldr.addSet(t.dlv_rqst_tm);
			poSchdL_bldr.addSet(t.rqst_dlv_rqst_tm);
			poSchdL_bldr.addSet(t.rqst_avl_rqst_dt);
			poSchdL_bldr.addSet(t.purc_schd_dt);
			poSchdL_bldr.addSet(t.purc_lt);
			poSchdL_bldr.addSet(t.drct_dlv_typ);
			poSchdL_bldr.addSet(t.rqst_upd_stop_flg);
			poSchdL_bldr.addSet(t.rqst_crrct_flg);
			poSchdL_bldr.addSet(t.bd_itm_cd);
			poSchdL_bldr.addSet(t.bd_itm_sub1);
			poSchdL_bldr.addSet(t.bd_itm_sub2);
			poSchdL_bldr.addSet(t.bd_itm_sub3);
			poSchdL_bldr.addSet(t.bd_sno1);
			poSchdL_bldr.addSet(t.bd_sno2);
			poSchdL_bldr.addSet(t.bd_sno3);
			poSchdL_bldr.addSet(t.bd_sno4);
			poSchdL_bldr.addSet(t.bd_lot_no);
			poSchdL_bldr.addSet(t.bd_sublot_no);
			poSchdL_bldr.addSet(t.bd_loc_cd);
			poSchdL_bldr.addSet(t.bd_dpt_cd);
			poSchdL_bldr.addSet(t.bd_wg_cd);
			poSchdL_bldr.addSet(t.bd_ctg_cd);
			poSchdL_bldr.addSet(t.bd_oper_cd);
			poSchdL_bldr.addSet(t.bd_slo_no);
			poSchdL_bldr.addSet(t.bd_iv_no);
			poSchdL_bldr.addSet(t.bd_po_no);
			poSchdL_bldr.addSet(t.bd_bp_cd);
			poSchdL_bldr.addSet(t.abort_flg);
			poSchdL_bldr.addSet(t.intr_rmrks);
			poSchdL_bldr.addSet(t.trd_d_rmrks);
			poSchdL_bldr.addSet(t.po_cnt_rmrks);
			poSchdL_bldr.addSet(t.sub_char1);
			poSchdL_bldr.addSet(t.sub_char2);
			poSchdL_bldr.addSet(t.sub_char3);
			poSchdL_bldr.addSet(t.rqst_fr_dpt_cd);
			poSchdL_bldr.addSet(t.rqst_fr_usr_cd);
		}

		/**
		 * 更新項目の決定(打切)
		 * @param t 
		 * @param poSchdL_bldr 
		 */
		protected void editAbortCol(MCList<MST_PO_SCHD_R> poSchdL, MCQueryApiBuilder poSchdL_bldr, MST_PO_SCHD_R t){
			poSchdL_bldr.setSet(t.po_schd_no);
			poSchdL_bldr.addSet(t.abort_flg);
		}

		
		
		/**
		 * 品目マスタ情報取得
		 */
		protected void setItmInfo(PoSchd_Upd01_DtlR dtlR){
			// 品目マスタから区分値の設定
			MAM_ITM_R itmR  = getItmCache(dtlR);
			dtlR.asset_mng_typ(itmR.asset_mng_typ());
			dtlR.sundry_itm_flg(itmR.sundry_itm_flg());
			dtlR.itm_dec_place(itmR.dec_place());
			dtlR.itm_rnd_typ(itmR.rnd_typ());
			dtlR.purc_unit_cd(itmR.po_schd_unit_cd());
			if (!dtlR.sundry_itm_flg()) {
				dtlR.itm_nm(null);
				dtlR.iv_itm_nm(null);
			}
		}
		
		/**
		 * 品目詳細マスタ情報取得
		 */
		protected void setItmDtlInfo(PoSchd_Upd01_DtlR dtlR){
			MAM_ITM_DTL_R itmDtlR = getCacheItmDtlR(
					dtlR.itm_cd()
					, dtlR.itm_sub1()
					, dtlR.itm_sub2()
					, dtlR.itm_sub3()
					, isSame(_sysParm,"1") ? dtlR.rqst_avl_rqst_dt() : dtlR.po_schd_dt()
					, dtlR.loc_wg_cd()
					, dtlR.sppl_cd()
					, dtlR.maker_cd());
			
			if (!itmDtlR.isEmpty()) {
				dtlR.min_lot_qty(itmDtlR.min_lot_qty());
				dtlR.batch_lot_qty(itmDtlR.batch_lot_qty());
			}
		}
		
		protected MAM_ITM_DTL_R createItmDtlBindRow(PoSchd_Upd01_DtlR dtlR) {
			MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create();
			bindR.itm_cd(dtlR.itm_cd());
			bindR.itm_sub1(dtlR.itm_sub1());
			bindR.itm_sub2(dtlR.itm_sub2());
			bindR.itm_sub3(dtlR.itm_sub3());
			MAM_LOC_R locR = getCacheLoc(dtlR.in_to_loc_cd());
			if (isNullOrNullVal(dtlR.mfg_loc_cd())) {
				// 購買品
				bindR.sppl_cd(dtlR.sppl_cd());
				bindR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				bindR.bom_ptn(MAC_STR.NULL_VAL.value());
				bindR.maker_cd(dtlR.maker_cd());
			}
			else {
				// 外注品
				bindR.sppl_cd(MAC_STR.NULL_VAL.value());
				bindR.mfg_loc_cd(dtlR.mfg_loc_cd());
				bindR.bom_ptn(dtlR.bom_ptn());
				bindR.maker_cd(MAC_STR.NULL_VAL.value());
			}

			bindR.wg_cd(locR.wg_cd());

			// 適用開始日・終了日との比較に使用
			if (isSame(_sysParm, "1")) {
				bindR.st_dt(dtlR.rqst_avl_rqst_dt());
			}
			else {
				bindR.st_dt(dtlR.po_schd_dt());
			}
			return bindR;
		}

		protected MAM_ITM_DTL_R getItmDtl(PoSchd_Upd01_DtlR dtlR) {
			MAM_ITM_DTL_R bindR = createItmDtlBindRow(dtlR);
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtlCacheKey, bindR.itm_cd(),
					bindR.itm_sub1(), bindR.itm_sub2(), bindR.itm_sub3(), bindR.wg_cd(), bindR.sppl_cd(),
					bindR.maker_cd(), bindR.mfg_loc_cd(), bindR.bom_ptn());
			for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
				if (bindR.st_dt().gte(itmDtlR.st_dt()) && bindR.st_dt().lte(itmDtlR.end_dt())) {
					return itmDtlR;
				}
			}
			return null;
		}
		/**
		 * 購入ＬＴ取得
		 * 仕入直送の場合は仕入直送ＬＴマスタから取得。
		 * @param dtlR
		 */
		protected void setLt(MCList<PoSchd_Upd01_DtlR> dtlL) {
			for (PoSchd_Upd01_DtlR dtlR: dtlL) {
				if (isNull(dtlR.sppl_cd())) {
					dtlR.purc_lt(null);
					continue;
				}
				MAM_ITM_DTL_R itmDtlR = getItmDtl(dtlR);
				if (isNull(itmDtlR)) {
					itmDtlR = MAM_ITM_DTL_R.create();
				}
				MAM_PURC_DDLV_LT_R purcDdlvLtR = getCachePurcDdlvLt(dtlR);
				dtlR.purc_lt(MSBDL_PurcUtil.getPurcLt(purcDdlvLtR, itmDtlR, dtlR.dlv_cd(), isNull(dtlR.outsrc_sppl_cd()) ? false : true, dtlR.base_unit_qty()));
			}
		}
		
		protected void setProvInfo(MCList<PoSchd_Upd01_DtlR> dtlL) {
			for (PoSchd_Upd01_DtlR r : dtlL) {
				// 支給先情報
				MAM_PROV_UPRI_R provUpriR = getCacheProvUpri(r);
				MAM_BP_R outSrcBpR = getCacheBp(r.outsrc_sppl_cd());
				if (!isNull(outSrcBpR)) {
					r.prov_basis_typ(outSrcBpR.prov_basis_typ());
					r.prov_typ(provUpriR.prov_typ());
				}
			}
		}
		
		/**
		 * 版情報取得
		 * @param row
		 */
		protected void setItmVerInfo(PoSchd_Upd01_DtlR dtlR){
			if (isNull(dtlR.ver_no())) {
				MAM_ITM_VER_R cndItmVerR = MAM_ITM_VER_R.create();
				cndItmVerR.itm_cd(dtlR.itm_cd());
				cndItmVerR.itm_sub1(dtlR.itm_sub1());
				cndItmVerR.itm_sub2(dtlR.itm_sub2());
				cndItmVerR.itm_sub3(dtlR.itm_sub3());
				cndItmVerR.site_cd(dtlR.site_cd());
				getItmVerInfo(cndItmVerR, dtlR.rqst_avl_rqst_dt());
				dtlR.ver_no(cndItmVerR.ver_no());
			}
		}

		/**
		 * 場所情報取得
		 * @param dtlR
		 */
		protected void setLocInfo(PoSchd_Upd01_DtlR dtlR){
			MAM_LOC_R locR  = getCacheLoc(dtlR.in_to_loc_cd());
			dtlR.loc_wg_cd(locR.wg_cd());
			dtlR.outsrc_sppl_cd(locR.sppl_cd());
			dtlR.site_cd(locR.site_cd());
		}
		
		/**
		 * 直納区分取得
		 * 支給直送または仕入直送の場合は直送とする。そうでない場合は経由とする。
		 * @param dtlR
		 */
		protected void setDrctDlvTyp(PoSchd_Upd01_DtlR dtlR){
			if (!isNull(dtlR.outsrc_sppl_cd()) || !isNull(dtlR.dlv_cd())) {
				dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
			} 
			else {
				dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
			}
		}
		/**
		 * 標準の棚・ラインCD取得
		 * 発注予定作成元が「生産計画・外注発注」または「発注点在庫補充」の場合のみ補完する
		 * @param dtlR
		 */		
		protected void setDefStrLnCd(MCList<PoSchd_Upd01_DtlR> dtlL){
			MCList<PoSchd_Upd01_DtlR> l = dtlL.subList(r -> MSC_PO_SCHD_SRC_TYP.isPPLN(r.po_schd_src_typ()) || MSC_PO_SCHD_SRC_TYP.isOP(r.po_schd_src_typ()));
			if (l.isEmpty()) {
				return;
			}
			MSUCL_StrLnUtil.StrLnUtil_Srch01 strLnUtilSrch01 = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			addAll(strLnUtilSrch01.up0(), l, createMap_StrLnUtil_Srch01_CndR_PoSchd_Upd01_DtlR());
			strLnUtilSrch01.exec();
			String[] srcCols = {StrLnUtil_Srch01_CndR.$str_ln_cd};
			String[] destCols = {PoSchd_Upd01_DtlR.$str_ln_cd};
			copyByPegNo(l, destCols, strLnUtilSrch01.down0(), srcCols);
		}

		/**
		 * 発注先情報取得
		 * @param row
		 */
		protected void setSpplInfo(PoSchd_Upd01_DtlR dtlR){
			if (!isNullOrNullVal(dtlR.sppl_cd())) {
				return;
			}
			MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create(); 
			bindR.itm_cd(dtlR.itm_cd());
			bindR.itm_sub1(dtlR.itm_sub1());
			bindR.itm_sub2(dtlR.itm_sub2());
			bindR.itm_sub3(dtlR.itm_sub3());
			bindR.wg_cd(dtlR.loc_wg_cd());
			
			MAM_ITM_DTL_R itmDtlR = getSpplInfo(bindR, dtlR.po_schd_dt());
			dtlR.sppl_cd(itmDtlR.sppl_cd());
			dtlR.maker_cd(itmDtlR.maker_cd());
		}

		/**
		 * 購買担当者・購買部門を初期設定する
		 * @param dtlR
		 */
		protected void setDefUsrDpt(MCList<PoSchd_Upd01_DtlR> dtlL) {
			
			for (PoSchd_Upd01_DtlR dtlR : dtlL) {
				// 発注先担当マスタキャッシュ取得
				MAM_SPPL_USR_R spplUsrR = getCacheSpplUsr(dtlR.reg_dt(), dtlR.sppl_cd());
				
				if (!isNull(spplUsrR)) {
					// 発注先担当マスタに購買担当者の設定があった場合
					if (!isNull(spplUsrR.purc_usr_cd())) {
						dtlR.purc_usr_cd(spplUsrR.purc_usr_cd());
						
						// 購買担当者に対する担当者権限マスタキャッシュ取得
						MAM_USR_ACL_R aclR = getCacheUsrAcl(dtlR.reg_dt(), dtlR.purc_usr_cd());
						
						if (!isNull(aclR) && !isNull(aclR.dpt_cd())) {
							// 担当者権限マスタの主部門に該当する部門マスタキャッシュ取得
							MAM_DPT_R dptR = getCacheDpt(dtlR.reg_dt(), aclR.dpt_cd());
							
							// 購買部門かつ上り電文のＷＧと等しいＷＧの部門の場合に購買部門として取得
							if (!isNull(dptR) && dptR.purc_dpt_flg() && isSame(dtlR.wg_cd(), dptR.wg_cd())) {
								dtlR.purc_dpt_cd(dptR.dpt_cd());
							}
						}
					}
					// 発注先担当マスタに購買部門の設定があった場合
					else if (!isNull(spplUsrR.purc_dpt_cd())) {
						// 発注先担当マスタの購買部門に該当する部門マスタキャッシュ取得
						MAM_DPT_R dptR = getCacheDpt(dtlR.reg_dt(), spplUsrR.purc_dpt_cd());
						
						// 上り電文のＷＧと等しいＷＧの部門の場合に購買部門として取得
						if (!isNull(dptR) && isSame(dtlR.wg_cd(), dptR.wg_cd())) {
							dtlR.purc_dpt_cd(dptR.dpt_cd());
						}
					}
				}
			}
 		}
		
		/**
		 * 基準単位数量を発注単位または取引単位に換算する
		 * @param r
		 */
		protected void setTrdUnitQty(PoSchd_Upd01_DtlR r){
			MCList<MAVM_ITM_UNIT_R> itmUnitL = getCacheItmUnit(r);
			MAVM_ITM_UNIT_R itmUnit = MAVM_ITM_UNIT_R.create();
			// 発注単位の取得
			for (MAVM_ITM_UNIT_R itmUnitR : itmUnitL) {
				if (isSame(itmUnitR.unit_cd(), r.purc_unit_cd())) {
					itmUnit = itmUnitR;
					break;
				}
			}
			
			// 発注単位変換を試みる
			if (!itmUnit.isEmpty()) {
				r.trd_unit_qty(rvrsBaseUnitConvAndChk(r, itmUnit, r.base_unit_qty()));
			}
			
			if (!itmUnit.isEmpty() && !isNull(r.trd_unit_qty())) {
				// 基準単位数が発注単位に変換可能な場合、取引単位ＣＤは発注単位ＣＤ
				r.trd_unit_cd(itmUnit.unit_cd());
			} 
			else {
				// 基準単位数が発注単位への変換が不可能な場合で取引単位数量が未設定のときは基準単位数量とする
				if (isNull(r.trd_unit_cd())) {
					r.trd_unit_qty(r.base_unit_qty());
					r.trd_unit_cd(r.base_unit_cd());
					return;
				}
				for (MAVM_ITM_UNIT_R itmUnitR : itmUnitL) {
					// 取引単位ＣＤの取得
					if (isSame(itmUnitR.unit_cd(), r.trd_unit_cd())) {
						itmUnit = itmUnitR;
						break;
					}
				}
				
				// 取引単位変換を試みる
				r.trd_unit_qty(rvrsBaseUnitConvAndChk(r, itmUnit, r.base_unit_qty()));
				
				if (!isNull(r.trd_unit_qty())) {
					// 取引単位に変換可能な場合は上り電文の取引単位ＣＤ・取引単位数量のままとする。
					r.trd_unit_cd(itmUnit.unit_cd());
				} 
				else {
					//　取引単位ＣＤに変換できない場合、
					r.trd_unit_qty(r.base_unit_qty());
					r.trd_unit_cd(r.base_unit_cd());
				}
			}
		}

		/**
		 * 経費購買ＦＬＧ取得
		 * 取引パタンが経費購買であるか、資産管理しない品目を発注する場合は経費購買とする。
		 * @param poSchd
		 */
		protected void setXpnsPurcFlg(PoSchd_Upd01_DtlR dtlR){
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ()) || MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())) {
				dtlR.xpns_purc_flg(true);
			} 
			else {
				dtlR.xpns_purc_flg(false);
			}
		}
		/**
		 * 金額関連項目の設定と金額計算処理
		 * @param dtlR
		 */
		protected void setAmtInfo(MCList<PoSchd_Upd01_DtlR> dtlL){
			// 為替レート
			createCurXrateCache(dtlL);
			// 納税為替レート
			createPtaxCurXrateCache(dtlL);
			// 税
			createTaxCache(dtlL);
			setTaxInfo(dtlL);
			// 金額補完
			for (PoSchd_Upd01_DtlR dtlR : dtlL) {
				// 為替レート
				if (!dtlR.xrate_inpt_flg()) {
					if (isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd())) {
						dtlR.xrate(MCNumber.ONE);
					}
					else {
						dtlR.xrate(getCacheXrate(dtlR.reg_dt(), dtlR).xrate());
					}
				}
				// 納税為替レート
				if (!dtlR.ptax_xrate_inpt_flg()) {
					if (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())) {
						dtlR.ptax_xrate(MCNumber.ONE);
					}
					else {
						dtlR.ptax_xrate(getCachePtaxXrate(dtlR.reg_dt(), dtlR).xrate());
					}
				}
				// 金額計算
				calcAmt(dtlR);
			}
		}

		/**
		 * 数量の調整
		 * @param dtlR
		 */
		protected void adjustLotQty(PoSchd_Upd01_DtlR dtlR){
			// 単位変換
			setTrdUnitQty(dtlR);
		}

		/**
		 * 荷姿ＣＤの単位に変換可能な場合、変換した数量を返す
		 * @param r
		 */
		protected MCNumber rvrsBaseUnitConvAndChk(PoSchd_Upd01_DtlR r, MAVM_ITM_UNIT_R itmUnit, MCNumber base_unit_qty){
			//基準単位数から入力単位数の計算
			MCNumber calcNum = rvrsBaseUnitConv(
					base_unit_qty,
					itmUnit.conv_base_qty(),
					itmUnit.conv_qty(),
					itmUnit.dec_place(),
					itmUnit.rnd_typ());
		
			//入力単位数から基準単位数への再計算
			MCNumber reCalcQty = convToBaseUnit(
					calcNum,
					itmUnit.conv_base_qty(),
					itmUnit.conv_qty(),
					r.itm_dec_place(),
					r.itm_rnd_typ());
		
			//端数処理のずれが無い場合は単位換算可とする
			//(再計算結果の基準単位数が元の基準単位数と同値かを比較)
			if (isSame(reCalcQty, base_unit_qty)) {
				//変換ＯＫ
				return calcNum;
			}
			return null;
		}
		/**
		 * 単価情報取得
		 * @param dtlL
		 */
		protected void setUpriInfo(MCList<PoSchd_Upd01_DtlR> dtlL){
			MCList<PoSchd_Upd01_DtlR> tmpL = MCList.create(PoSchd_Upd01_DtlR.class);
			for (PoSchd_Upd01_DtlR r : dtlL) {
				if (!isNullOr(
						  r.peg_no()
						, r.sppl_cd()
						, r.trd_cur_cd()
						, r.loc_wg_cd()
						, r.in_to_loc_cd()
						, r.itm_cd()
						, r.itm_sub1()
						, r.itm_sub2()
						, r.itm_sub3()
						, r.trd_unit_cd()
						, r.trd_unit_qty()
						, getUpriBaseDt(r)
						, r.tax_cd())) {
					
					if (r.outsrc_flg() 
							&& (isNullOr(r.mfg_loc_cd(), r.bom_ptn(), r.outsrc_itm_ord_no(), r.po_schd_dt(), r.rqst_avl_rqst_dt()))) {
						continue;
					}
					
					tmpL.add(r);
				}
			}
			
			// 単価取得対象がない場合は中断
			if (tmpL.size() == 0) {
				return;
			}
			
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			addAll(purcUtilSrch02.up0(), tmpL, createMap_PurcUtil_Srch02_DtlR_PoSchd_Upd01_DtlR());
			
			purcUtilSrch02.up0();
			purcUtilSrch02.exec();
			String[] destCols = {PoSchd_Upd01_DtlR.$trd_cur_upri, PoSchd_Upd01_DtlR.$trd_cur_proc_upri, PoSchd_Upd01_DtlR.$trd_cur_onr_prov_upri, PoSchd_Upd01_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(tmpL, destCols, purcUtilSrch02.down0(), srcCols);
		}
		/**
		 * 税ＣＤを取得します
		 * @param dtlL
		 */
		protected void getTaxCd(MCList<PoSchd_Upd01_DtlR> dtlL) {
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
					"tax_cd", dtlL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3",
					"sppl_cd", "po_schd_dt");
		}
		/**
		 * 税情報設定
		 * @param dtlL
		 */
		protected void setTaxInfo(MCList<PoSchd_Upd01_DtlR> dtlL){
			for (PoSchd_Upd01_DtlR r : dtlL) {
				MAM_TAX_R taxR = getCacheTax(r.tax_cd());
				r.inc_tax_flg(taxR.inc_tax_flg());
				r.tax_rate(taxR.tax_rate());
			}
		}
		
		/**
		 * 受払予定サービス呼び出し処理
		 * @param dtlL
		 */
		protected void callIoSchd(){
			
			MSBEL_IoSchdService.IoSchd_Del01 ioSchdDel01 = MSBEL_IoSchdService.crtIoSchd_Del01(); 
			MSBEL_IoSchdService.IoSchd_Ins01 ioSchdIns01 = MSBEL_IoSchdService.crtIoSchd_Ins01();
			
			MCList<PoSchd_Upd01_DtlR> crtList = up0().subList(PoSchd_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			MCList<PoSchd_Upd01_DtlR> updList = up0().subList(PoSchd_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			MCList<PoSchd_Upd01_DtlR> updNotAbortList = updList.subList(PoSchd_Upd01_DtlR.$abort_flg, false);
			MCList<PoSchd_Upd01_DtlR> delList = up0().subList(PoSchd_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			
			// 新規
			addAll(ioSchdIns01.up0(), crtList, createMap_IoSchd_Ins01_DtlR_PoSchd_Upd01_DtlR());
			
			// 更新（打切の場合再作成しない）
			addAll(ioSchdDel01.up0(), updList, createMap_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR());
			addAll(ioSchdIns01.up0(), updNotAbortList, createMap_IoSchd_Ins01_DtlR_PoSchd_Upd01_DtlR());
			
			// 削除
			addAll(ioSchdDel01.up0(), delList, createMap_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR());
			
			// 外注品に紐付く支給品の受払予定
			MCIndexKey inptKey = updList.createIndex(PoSchd_Upd01_DtlR.$outsrc_flg, PoSchd_Upd01_DtlR.$abort_flg, PoSchd_Upd01_DtlR.$bef_abort_flg);
			MCList<PoSchd_Upd01_DtlR> delInptList = updList.subList(inptKey, true, true, false);
			addAll(ioSchdDel01.up0(), delInptList, createMap_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR_For_OutsrcInpt());
			
			// 外注品に対する発注予定の打切解除時は、オーダ登録サービスの日付計算・構成展開を行い、外注品に紐付く支給品の受払予定を作成
			MCList<PoSchd_Upd01_DtlR> insInptList = updList.subList(inptKey, true, false, true);
			crtInsInptIoSchd(insInptList, ioSchdIns01);
			
			if (ioSchdDel01.up0().size() > 0) {
				// 仕入入庫・入荷などを削除するために上り電文を増やす
				for (MSW_IO_SCHD_DEL_R r : ioSchdDel01.up0().shallowClone()) {
					if (MSC_IO_SCHD_TYP.isPURC_GR(r.io_schd_typ())) {
						MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
						ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());
						ioSchdDel01.up0().add(ioSchdDelR);
					}
					else if (MSC_IO_SCHD_TYP.isPURC_GR_PROV(r.io_schd_typ())) {
						MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
						ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.ARR_PROV.value());
						ioSchdDel01.up0().add(ioSchdDelR);
					}
					else if (MSC_IO_SCHD_TYP.isARR(r.io_schd_typ())) {
						MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
						ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
						ioSchdDel01.up0().add(ioSchdDelR);
					}
					else if (MSC_IO_SCHD_TYP.isARR_PROV(r.io_schd_typ())) {
						MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
						ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
						ioSchdDel01.up0().add(ioSchdDelR);
					}
				}
				
				ioSchdDel01.exec();
			}
			if (ioSchdIns01.up0().size() > 0) {
				ioSchdIns01.exec();
			}
		}
		
		/**
		 * オーダ登録サービスの日付計算・構成展開を行い、支給品の受払予定の上り電文を作成
		 * @param insInptList　打切解除した外注品の発注予定のリスト
		 * @param ioSchdIns01　受払予定サービスの変数
		 */
		protected void crtInsInptIoSchd(MCList<PoSchd_Upd01_DtlR> insInptList, MSBEL_IoSchdService.IoSchd_Ins01 ioSchdIns01) {
			if (insInptList.isEmpty()) {
				return;
			}
			
			MSBCL_OrdRegService.Ord_Sprt02 ordSprt02 = MSBCL_OrdRegService.crtOrd_Sprt02();
			MSBCL_OrdRegService.Ord_Sprt03 ordSprt03 = MSBCL_OrdRegService.crtOrd_Sprt03();
			addAll(ordSprt03.up0(), insInptList, createMap_Ord_Sprt03_DtlR_PoSchd_Upd01_DtlR());
			ordSprt03.exec();
			
			MCIndexKey ordSprt03Key = ordSprt03.down0().createIndex(Ord_Sprt03_RsltR.$peg_no);
			for(PoSchd_Upd01_DtlR r : insInptList) {
				Ord_Sprt02_DtlR ordSprt02DtlR = Ord_Sprt02_DtlR.create();
				copy(ordSprt02DtlR, r, createMap_Ord_Sprt02_PoSchd_Upd01_DtlR());
				Ord_Sprt03_RsltR ordSprt03DtlR = ordSprt03.down0().getFirst(ordSprt03Key, r.peg_no());				
				ordSprt02DtlR.mfg_st_schd_dt(ordSprt03DtlR.mfg_st_schd_dt());
				ordSprt02DtlR.st_schd_tm(ordSprt03DtlR.mfg_st_schd_dt());
				ordSprt02DtlR.end_schd_tm(ordSprt03DtlR.mfg_end_schd_dt());
				ordSprt02.up1().add(ordSprt02DtlR);
			}

			if (!ordSprt02.up1().isEmpty()) {
				ordSprt02.up0().inst_exp_flg(false);
				ordSprt02.up0().get_prov_upri_flg(false);
				
				// 工程オーダＮＯを取得
				MCList<MST_OPER_ORDER_R> operOrderL = MCList.create(MST_OPER_ORDER_R.class);
				MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
				MCQueryApiBuilder operOrderL_bldr = MCQueryApiBuilder.create(t);
				operOrderL_bldr.setSelect(t.itm_ord_no);
				operOrderL_bldr.addSelect(t.oper_ord_no);
				operOrderL_bldr.setWhere(t.itm_ord_no.eq(bind("outsrc_itm_ord_no")));
				dbSelect("MSBDL5090_MST_OPER_ORDER_S01", operOrderL, operOrderL_bldr,
						insInptList.groupBy(PoSchd_Upd01_DtlR.$outsrc_itm_ord_no));
				
				MCIndexKey operOrderKey = operOrderL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
				
				ordSprt02.exec();
				
				MCIndexKey dtl2Key = insInptList.createIndex(PoSchd_Upd01_DtlR.$peg_no);
				for(Ord_Sprt02_RsltR ordSprt02RsltR : ordSprt02.down0()) {
					PoSchd_Upd01_DtlR insInptR = insInptList.getFirst(dtl2Key, ordSprt02RsltR.peg_no());
					
					// 受払予定サービスの上り電文に設定
					IoSchd_Ins01_DtlR ioSchdIns01DtlR = IoSchd_Ins01_DtlR.create();
					copy(ioSchdIns01DtlR, ordSprt02RsltR, createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR());
					ioSchdIns01DtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
					ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
					ioSchdIns01DtlR.io_schd_no(insInptR.outsrc_itm_ord_no());
					ioSchdIns01DtlR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
					ioSchdIns01DtlR.io_schd_sub_no1(insInptR.outsrc_itm_ord_no());
					MST_OPER_ORDER_R operOrderR = operOrderL.getFirst(operOrderKey, insInptR.outsrc_itm_ord_no());
					if(!isNull(operOrderR)) {
						ioSchdIns01DtlR.oper_ord_no(operOrderR.oper_ord_no());
					}
					ioSchdIns01DtlR.io_schd_pr_no(insInptR.io_schd_pr_no());
					ioSchdIns01.up0().add(ioSchdIns01DtlR);
				}
			}
		}
		
		/**
		 * 検査予定登録サービス呼び出し処理
		 * @param dtlL
		 */
		protected void callInspSchd(){
			MSBFL_InspSchdService.InspSchd_Srch03 inspSchdSrch03 = MSBFL_InspSchdService.crtInspSchd_Srch03();
			inspSchdSrch03.up0();
			addAll(inspSchdSrch03.up0(), up0(), createMap_InspSchd_Srch03_CndR_PoSchd_Upd01_DtlR());
			inspSchdSrch03.exec();
			String[] srcCols = {InspSchd_Srch03_CndR.$end_dt};
			String[] destCols = {PoSchd_Upd01_DtlR.$insp_schd_end_dt};
			copyByPegNo(up0(), destCols, inspSchdSrch03.down0(), srcCols);
			
		}
		
		/**
		 * 売上予定サービス呼び出し処理
		 * @param dtlL
		 */
		protected void callSlsSchd(){
			MSBBL_SlsSchdService.Sls_Schd_Upd04 slsSchdUpd04 = MSBBL_SlsSchdService.crtSls_Schd_Upd04();
			for (PoSchd_Upd01_DtlR r : up0()) {
				if (!isNull(r.dlv_cd())) {
					Sls_Schd_Upd04_DtlR slsSchdDtlR = Sls_Schd_Upd04_DtlR.create();
					copy(slsSchdDtlR, r, createMap_Sls_Schd_Upd04_DtlR_PoSchd_Upd01_DtlR());
					slsSchdUpd04.up0().add(slsSchdDtlR);
				}
			}
			if (slsSchdUpd04.up0().size() > 0) {
				slsSchdUpd04.exec();
			}
		}

		/**
		 * オーダ登録サービス呼び出し処理
		 * @param dtlL
		 */
		protected void callOrdUpd04(){
			MSBCL_OrdRegService.Ord_Upd04 ordUpd04 = MSBCL_OrdRegService.crtOrd_Upd04();
			MCList<PoSchd_Upd01_DtlR> subL = up0().subList(PoSchd_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			for (PoSchd_Upd01_DtlR r : subL) {
				if (!isNull(r.pln_itm_ord_no()) && !isSame(r.abort_flg(), r.bef_abort_flg())) {
					// 打切変更時のみオーダ状況を更新する。
					Ord_Upd04_DtlR ordDtlR = Ord_Upd04_DtlR.create();
					copy(ordDtlR, r, createMap_Ord_Upd04_DtlR_PoSchd_Upd01_DtlR());
					ordUpd04.up0().add(ordDtlR);
				}
			}
			if (ordUpd04.up0().size() > 0) {
				ordUpd04.exec();
			}
		}
		/**
		 * 諸口品更新リスト作成
		 */
		protected void callSundryItmUpd01() {
			MABCL_SundryItmRegService.SundryItm_Upd01 upd01 = MABCL_SundryItmRegService.crtSundryItm_Upd01();
			MCIndexKey idx = up0().createIndex(PoSchd_Upd01_DtlR.$sundry_itm_flg, PoSchd_Upd01_DtlR.$po_schd_src_typ);
			addAll(upd01.up0(), up0().subList(idx, true, MSC_PO_SCHD_SRC_TYP.UPLND.value()), createMap_SundryItm_Upd01_DtlR_PoSchd_Upd01_DtlR());			
			upd01.exec();
		}
		protected Map_PoSchd_Upd01_DtlR_MST_PO_SCHD_R<PoSchd_Upd01_DtlR,MST_PO_SCHD_R> createMap_PoSchd_Upd01_DtlR_MST_PO_SCHD_R() {
			return new Map_PoSchd_Upd01_DtlR_MST_PO_SCHD_R<PoSchd_Upd01_DtlR, MST_PO_SCHD_R>();
		}
		
		public class Map_PoSchd_Upd01_DtlR_MST_PO_SCHD_R<D extends PoSchd_Upd01_DtlR, S extends MST_PO_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				// 更新時に変更不可となる項目を更新前の発注予定の情報で上書きする
				addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cd, MST_PO_SCHD_R.$trd_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$trd_ptn_typ, MST_PO_SCHD_R.$trd_ptn_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, MST_PO_SCHD_R.$itm_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, MST_PO_SCHD_R.$itm_sub1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, MST_PO_SCHD_R.$itm_sub2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, MST_PO_SCHD_R.$itm_sub3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_flg, MST_PO_SCHD_R.$outsrc_flg);
				addColumnPathMap(PoSchd_Upd01_DtlR.$pln_itm_ord_no, MST_PO_SCHD_R.$pln_itm_ord_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$base_unit_cd, MST_PO_SCHD_R.$base_unit_cd);
			}
		}
	}

	/**
	 * PoSchd_Upd02オペレーション.<p>
	 *
	 * 発注状況を更新する。<br>
	 */
	public class PoSchd_Upd02 extends MSBDL_PoSchdRegService_MC_A.PoSchd_Upd02 {
		/** 支給単価マスタ */
		protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache = null;
		protected MCList<MST_PO_SCHD_R> _cachePoSchd = null;
		protected MCIndexKey _idxCachePoSchd = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			crtBaseCache();
			
			updPoSchd();
			
			MCList<PoSchd_Upd02_DtlR> delL = MCList.create(PoSchd_Upd02_DtlR.class);
			MCList<PoSchd_Upd02_DtlR> insL = MCList.create(PoSchd_Upd02_DtlR.class);
			
			// 発注予定から作成する受払予定の項目を補完する
			completion();
			
			for (PoSchd_Upd02_DtlR r : up0()) {
				if (isNull(r.po_no())) {
					insL.add(r);
				}
				else {
					delL.add(r);
				}
			}
			// 発注済の場合、発注予定に対応する受払の削除
			callIoSchdDel(delL);
			// 発注取消の場合、発注予定に対応する受払を作成
			callIoSchdIns(insL);
		}
		/**
		 * キャッシュ作成
		 */
		protected void crtBaseCache(){
			// 場所
			createLocCache(up0());
			
			// bind編集
			MCList<MAM_ITM_DTL_R> bindL = MCList.create(MAM_ITM_DTL_R.class);
			for (PoSchd_Upd02_DtlR r : up0()) {
				// 品目詳細
				MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindL.add(bindR);
			}
			// 品目詳細
			createItmDtlCache(bindL);
		}
		
		
		protected void crtRqstCache(MCList<MST_PO_SCHD_R> dtlL) {
			MCList<MST_PO_SCHD_R> bindL = dtlL.subList(MST_PO_SCHD_R.$po_schd_src_typ, MSC_PO_SCHD_SRC_TYP.RQST.value());
			_cacheWgRqstPrms = null;
			_cacheWgRqstPrms = new FXUCL_MCDbcCache<MST_WG_RQST_PRMS_R>(
					MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T")), bindL,
					MST_PO_SCHD_R.$po_schd_src_no);
		}
		
		/**
		 * 発注予定を更新します。
		 */
		protected void updPoSchd() {
			_cachePoSchd = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R cachePoSchd_t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder cachePoSchd_bldr = MCQueryApiBuilder.create(cachePoSchd_t);
			cachePoSchd_bldr.setWhere(cachePoSchd_t.po_schd_no.eq(bind("po_schd_no")));
			dbSelect("MSBDL5090_MST_PO_SCHD_S05", _cachePoSchd, cachePoSchd_bldr, up0());
			// 仕入直送のＷＧ間依頼で、依頼の発注予定（※）を削除するために使用する
			// ※依頼元更新不可で受注数量を増やすと、追加数量分の発注予定が作成される
			crtRqstCache(_cachePoSchd);
			_idxCachePoSchd = _cachePoSchd.createIndex(MST_PO_SCHD_R.$po_schd_no);
			
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			for (PoSchd_Upd02_DtlR r : up0()) {
				// 発注情報の設定
				if (!r.po_flg()) {
					r.po_no(null);
					r.po_d_no(null);
					r.base_unit_po_qty(MCNumber.ZERO);
				}
				//　打切ＦＬＧの設定
				MST_PO_SCHD_R poSchdR = _cachePoSchd.getFirst(_idxCachePoSchd, r.po_schd_no());
				if (r.po_flg() && poSchdR.base_unit_qty().gt(r.base_unit_po_qty())) {
					r.abort_flg(true);
				}
				else {
					r.abort_flg(false);
				}
				poSchdL.add(r.po_schd());
			}
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL_bldr.setSet(t.po_no);
			poSchdL_bldr.addSet(t.po_d_no);
			poSchdL_bldr.addSet(t.po_flg);
			poSchdL_bldr.addSet(t.abort_flg);
			poSchdL_bldr.addSet(t.base_unit_po_qty);
			dbUpdateKey("MSBDL5090_MST_PO_SCHD_U03", poSchdL, poSchdL_bldr);
		}
		
		/**
		 * 受払予定
		 */
		protected void callIoSchdDel(MCList<PoSchd_Upd02_DtlR> dtlL) {
			if (isNull(dtlL)) {
				return;
			}
			MSBEL_IoSchdService.IoSchd_Del01 ioSchdDel01 = MSBEL_IoSchdService.crtIoSchd_Del01(); 
			addAll(ioSchdDel01.up0(), dtlL, createMap_MSW_IO_SCHD_DEL_R_PoSchd_Upd02_DtlR());
			// 仕入入庫・入荷などを削除するために上り電文を増やす
			for (MSW_IO_SCHD_DEL_R r : ioSchdDel01.up0().shallowClone()) {
				if (MSC_IO_SCHD_TYP.isPURC_GR(r.io_schd_typ())) {
					MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());
					ioSchdDel01.up0().add(ioSchdDelR);
				}
				else if (MSC_IO_SCHD_TYP.isPURC_GR_PROV(r.io_schd_typ())) {
					MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.ARR_PROV.value());
					ioSchdDel01.up0().add(ioSchdDelR);
				}
				else if (MSC_IO_SCHD_TYP.isARR(r.io_schd_typ())) {
					MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
					ioSchdDel01.up0().add(ioSchdDelR);
				}
				else if (MSC_IO_SCHD_TYP.isARR_PROV(r.io_schd_typ())) {
					MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
					ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
					ioSchdDel01.up0().add(ioSchdDelR);
				}
				else if (MSC_IO_SCHD_TYP.isPURC_GR_DDLV(r.io_schd_typ())) {
					// io_schd_noにpo_schd_noがコピーされている
					MST_PO_SCHD_R poSchdR = _cachePoSchd.getFirst(_idxCachePoSchd, r.io_schd_no());
					if(MSC_PO_SCHD_SRC_TYP.isRQST(poSchdR.po_schd_src_typ())){
						// 発注予定作成元ＮＯにはＷＧ間回答ＮＯが設定されている
						MST_WG_RQST_PRMS_R wgR = _cacheWgRqstPrms.get(poSchdR.po_schd_src_no());
						MSW_IO_SCHD_DEL_R ioSchdDelR = r.clone();
						ioSchdDelR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
						ioSchdDelR.io_schd_no(wgR.wg_rqst_no());
						ioSchdDel01.up0().add(ioSchdDelR);						
						if (!isSame(nvl(wgR.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
							// 外注の場合、受注訂正時に作成される投入の受払を削除
							MSW_IO_SCHD_DEL_R ioSchdDelInptR = r.clone();
							ioSchdDelInptR.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
							ioSchdDelInptR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
							ioSchdDelInptR.io_schd_no(wgR.wg_rqst_no());
							ioSchdDel01.up0().add(ioSchdDelInptR);
						}
						
					}
				}
			}
			ioSchdDel01.exec();
		}
		
		/**
		 * 受払予定
		 */
		protected void callIoSchdIns(MCList<PoSchd_Upd02_DtlR> dtlL) {
			if (isNull(dtlL)) {
				return;
			}
			
			// 使用可能予定日の算出
			callInspSchd(dtlL);
			
			// 支給単価マスタを取得
			_provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
					MCQueryApiBuilder.create(MAM_PROV_UPRI_R.create("T")), up0(),
					PoSchd_Upd01_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_sub1,
					PoSchd_Upd01_DtlR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub3,
					PoSchd_Upd01_DtlR.$outsrc_sppl_cd, PoSchd_Upd01_DtlR.$trd_cur_cd,
					PoSchd_Upd01_DtlR.$loc_wg_cd);
			
			MSBEL_IoSchdService.IoSchd_Ins01 ioSchdIns01 = MSBEL_IoSchdService.crtIoSchd_Ins01();
			addAll(ioSchdIns01.up0(), dtlL, createMap_IoSchd_Ins01_DtlR_PoSchd_Upd02_DtlR());
			
			ioSchdIns01.exec();
		}
		/**
		 * 補完処理
		 */
		protected void completion() {
			// 発注予定情報を取得する
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t1 = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t1);
			poSchdL_bldr.setWhere(t1.po_schd_no.eq(bind("po_schd_no")));
			dbSelectKey("MSBDL5090_MST_PO_SCHD_S06", poSchdL, poSchdL_bldr, up0());
			
			// 場所情報を取得する
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t2 = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t2);
			locL_bldr.setWhere(t2.loc_cd.eq(bind("in_to_loc_cd")));
			dbSelect("MSBDL5090_MAM_LOC_S01", locL, locL_bldr, poSchdL);
			
			// 支給先情報を取得
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t3 = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t3);
			bpL_bldr.setWhere(t3.bp_cd.eq(bind("outsrc_sppl_cd")));
			dbSelect("MSBDL5090_MAM_BP_S02", bpL, bpL_bldr, locL);
			
			MCIndexKey poSchdIdx = poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_no);
			MCIndexKey locidx = locL.createIndex(MAM_LOC_R.$loc_cd);
			MCIndexKey bpIdx = bpL.createIndex(MAM_BP_R.$bp_cd);
			for (PoSchd_Upd02_DtlR r : up0()) {
				// 発注予定から補完
				MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdIdx, r.po_schd_no());
				r.po_schd(poSchdR);
				
				// 場所マスタから補完
				MAM_LOC_R locR = locL.getFirst(locidx, r.in_to_loc_cd());
				r.loc_wg_cd(locR.wg_cd());
				r.outsrc_sppl_cd(locR.sppl_cd());
				
				// 取引先マスタから補完
				MAM_BP_R bpR = bpL.getFirst(bpIdx, r.outsrc_sppl_cd());
				if (!isNull(bpR)) {
					r.prov_basis_typ(bpR.prov_basis_typ());
				}
			}
		}

		/**
		 * 検査予定登録サービス呼び出し処理
		 * @param dtlL
		 */
		protected void callInspSchd(MCList<PoSchd_Upd02_DtlR> dtlL){
			MSBFL_InspSchdService.InspSchd_Srch03 inspSchdSrch03 = MSBFL_InspSchdService.crtInspSchd_Srch03();
			setPegNo(dtlL);
			addAll(inspSchdSrch03.up0(), dtlL, createMap_InspSchd_Srch03_CndR_PoSchd_Upd02_DtlR());
			inspSchdSrch03.exec();
			String[] srcCols = {InspSchd_Srch03_CndR.$end_dt};
			String[] destCols = {PoSchd_Upd01_DtlR.$insp_schd_end_dt};
			copyByPegNo(dtlL, destCols, inspSchdSrch03.down0(), srcCols);
			
		}
		
		//-----------------------------------------
		// 検査予定
		//-----------------------------------------
		protected Map_InspSchd_Srch03_CndR_PoSchd_Upd02_DtlR<InspSchd_Srch03_CndR,PoSchd_Upd02_DtlR> createMap_InspSchd_Srch03_CndR_PoSchd_Upd02_DtlR() {
			return new Map_InspSchd_Srch03_CndR_PoSchd_Upd02_DtlR<InspSchd_Srch03_CndR, PoSchd_Upd02_DtlR>();
		}

		public class Map_InspSchd_Srch03_CndR_PoSchd_Upd02_DtlR<D extends InspSchd_Srch03_CndR, S extends PoSchd_Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch03_CndR.$peg_no, PoSchd_Upd02_DtlR.$peg_no);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_cd, PoSchd_Upd02_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub1, PoSchd_Upd02_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub2, PoSchd_Upd02_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub3, PoSchd_Upd02_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch03_CndR.$sppl_cd, PoSchd_Upd02_DtlR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$maker_cd, PoSchd_Upd02_DtlR.$maker_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$schd_gr_dt, PoSchd_Upd02_DtlR.$dlv_rqst_tm);
				addColumnPathMap(InspSchd_Srch03_CndR.$to_loc_cd, PoSchd_Upd02_DtlR.$in_to_loc_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$dlv_cd, PoSchd_Upd02_DtlR.$dlv_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			}
		}
		
		
		protected Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd02_DtlR<MSW_IO_SCHD_DEL_R,PoSchd_Upd02_DtlR> createMap_MSW_IO_SCHD_DEL_R_PoSchd_Upd02_DtlR() {
			return new Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd02_DtlR<MSW_IO_SCHD_DEL_R, PoSchd_Upd02_DtlR>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd02_DtlR<D extends MSW_IO_SCHD_DEL_R, S extends PoSchd_Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, PoSchd_Upd02_DtlR.$po_schd_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MAM_ITM_DTL_R itmDtlR = getCacheItmDtlR(
						src.itm_cd()
						, src.itm_sub1()
						, src.itm_sub2()
						, src.itm_sub3()
						, isSame(_sysParm, "1") ? src.rqst_avl_rqst_dt() : src.po_schd_dt()
						, src.loc_wg_cd()
						, src.sppl_cd()
						, src.maker_cd());
				String purcIdTyp = nvl(itmDtlR.purc_id_typ(), MAC_PURC_ID_TYP.PURC.value());
				if (!isNull(src.dlv_cd())) {
					purcIdTyp = MAC_PURC_ID_TYP.PURC.value();
				}
				dest.io_schd_typ(getIoSchdTyp(src.dlv_cd(), src.outsrc_sppl_cd(), purcIdTyp));
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			}
		}
		protected Map_IoSchd_Ins01_DtlR_PoSchd_Upd02_DtlR<IoSchd_Ins01_DtlR,PoSchd_Upd02_DtlR> createMap_IoSchd_Ins01_DtlR_PoSchd_Upd02_DtlR() {
			return new Map_IoSchd_Ins01_DtlR_PoSchd_Upd02_DtlR<IoSchd_Ins01_DtlR, PoSchd_Upd02_DtlR>();
		}

		public class Map_IoSchd_Ins01_DtlR_PoSchd_Upd02_DtlR<D extends IoSchd_Ins01_DtlR, S extends PoSchd_Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, PoSchd_Upd02_DtlR.$po_schd_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, PoSchd_Upd02_DtlR.$io_schd_pr_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, PoSchd_Upd02_DtlR.$dlv_rqst_tm);
				addColumnPathMap(IoSchd_Ins01_DtlR.$insp_cmpl_schd_dt, PoSchd_Upd02_DtlR.$insp_schd_end_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, PoSchd_Upd02_DtlR.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, PoSchd_Upd02_DtlR.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, PoSchd_Upd02_DtlR.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, PoSchd_Upd02_DtlR.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, PoSchd_Upd02_DtlR.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, PoSchd_Upd02_DtlR.$in_to_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, PoSchd_Upd02_DtlR.$str_ln_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sppl_cd, PoSchd_Upd02_DtlR.$sppl_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, PoSchd_Upd02_DtlR.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, PoSchd_Upd02_DtlR.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, PoSchd_Upd02_DtlR.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, PoSchd_Upd02_DtlR.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, PoSchd_Upd02_DtlR.$trd_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, PoSchd_Upd02_DtlR.$trd_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, PoSchd_Upd02_DtlR.$base_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, PoSchd_Upd02_DtlR.$base_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_char1, PoSchd_Upd02_DtlR.$sub_char1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_char2, PoSchd_Upd02_DtlR.$sub_char2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sub_char3, PoSchd_Upd02_DtlR.$sub_char3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_ptn_typ, PoSchd_Upd02_DtlR.$trd_ptn_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				// 場所情報設定
				setLocInfo(src);
				
				MAM_PROV_UPRI_R provUpriR = _provUpriCache.get(src.rqst_avl_rqst_dt(), src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.outsrc_sppl_cd(), src.trd_cur_cd(), src.loc_wg_cd());
				MAM_ITM_DTL_R itmDtlR = getCacheItmDtlR(
						src.itm_cd()
						, src.itm_sub1()
						, src.itm_sub2()
						, src.itm_sub3()
						, isSame(_sysParm, "1") ? src.rqst_avl_rqst_dt() : src.po_schd_dt()
						, src.loc_wg_cd()
						, src.sppl_cd()
						, src.maker_cd());
				String purcIdTyp = nvl(itmDtlR.purc_id_typ(), MAC_PURC_ID_TYP.PURC.value());
				if (!isNull(src.dlv_cd())) {
					purcIdTyp = MAC_PURC_ID_TYP.PURC.value();
				}
				dest.io_schd_typ(getIoSchdTyp(src.dlv_cd(), src.outsrc_sppl_cd(), purcIdTyp));
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.stk_arrv_bp_cd(setStkArrvBpCd(src.outsrc_sppl_cd(), src.prov_basis_typ(), provUpriR.prov_typ(), purcIdTyp));
				
				src.prov_typ(provUpriR.prov_typ());
				
				if (MAC_PURC_ID_TYP.isPURC(purcIdTyp)
						|| MAC_PURC_ID_TYP.isONR_RCV(purcIdTyp)
						|| (!isNull(src.outsrc_sppl_cd())
								&& MAC_PURC_ID_TYP.isVMI(purcIdTyp))) {
					dest.accpt_schd_dt(src.purc_schd_dt());
				}
				dest.stk_id_typ(setStkIdTyp(src.prov_basis_typ(), src.outsrc_sppl_cd(), src.prov_typ(), purcIdTyp));
				dest.stk_bp_cd(setStkBpCd(dest.stk_id_typ(), src.outsrc_sppl_cd(), src.sppl_cd()));
				
				dest.gd_cd(MAUCL_AppSys.getDefaultFeedStkGd().gd_cd());
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.lot_no(MAC_STR.NULL_VAL.value());
				dest.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
		/**
		 * 場所情報取得
		 * @param dtlR
		 */
		protected void setLocInfo(PoSchd_Upd02_DtlR dtlR){
			MAM_LOC_R locR  = getCacheLoc(dtlR.in_to_loc_cd());
			dtlR.loc_wg_cd(locR.wg_cd());
			dtlR.outsrc_sppl_cd(locR.sppl_cd());
		}
	}
	
	/**
	 * PoSchd_Upd03オペレーション.<p>
	 *
	 * 発注予定の分割・分割取消をする。<br>
	 */
	public class PoSchd_Upd03 extends MSBDL_PoSchdRegService_MC_A.PoSchd_Upd03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			updPoSchd();
		}
		
		protected void updPoSchd(){
			MCList<MST_PO_SCHD_R> dtlInsList = MCList.create(MST_PO_SCHD_R.class);
			MCList<MST_PO_SCHD_R> hdrUpdList = MCList.create(MST_PO_SCHD_R.class);
			MCList<MST_PO_SCHD_R> dtlDelList = MCList.create(MST_PO_SCHD_R.class);
			
			// 分割追加行の発注予定ＮＯを発番
			int cacheSize = up0().subList(PoSchd_Upd03_HdrR.$data_crud_typ,MAC_DATA_CRUD_TYP.DEL.value()).size();
			doSeqCache(MSC_NUM_SYS_TYP.POSCHD, cacheSize);
			
			for (PoSchd_Upd03_HdrR hdr : up0()) {
				MCList<PoSchd_Upd03_DtlR> subL = up1().subList(MST_PO_SCHD_R.$split_src_schd_no, hdr.po_schd_no());
				MCList<MST_PO_SCHD_R> poSchd = MCList.create(MST_PO_SCHD_R.class);
				
				if (MAC_DATA_CRUD_TYP.isDEL(hdr.data_crud_typ())) {
					// 分割処理の場合
					setDivParam(hdr, subL, poSchd);
					dtlInsList.addAll(poSchd);
				} 
				else {
					// 分割取消の場合
					setDivCanParam(hdr, subL, poSchd);
					dtlDelList.addAll(poSchd);
				}
				hdrUpdList.add(hdr.po_schd());
			}

			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			if (dtlInsList.size() > 0) {
				dbInsert("MSBDL5090_MST_PO_SCHD_I02", dtlInsList, MCQueryApiBuilder.create(t));
			}
			if (hdrUpdList.size() > 0) {
				MCQueryApiBuilder hdrUpdList_bldr = MCQueryApiBuilder.create(t);
				editUpdCol(hdrUpdList, hdrUpdList_bldr, t);
				dbUpdateKey("MSBDL5090_MST_PO_SCHD_U04", hdrUpdList, hdrUpdList_bldr);
			}
			if (dtlDelList.size() > 0) {
				dbDeleteKey("MSBDL5090_MST_PO_SCHD_D02", dtlDelList, MCQueryApiBuilder.create(t));
			}
			
			setDown();
		}
		
		/**
		 * 分割処理用の設定
		 * @param hdr
		 * @param dtlL
		 */
		protected void setDivParam(PoSchd_Upd03_HdrR hdr, MCList<PoSchd_Upd03_DtlR> dtlL, MCList<MST_PO_SCHD_R> poSchd){
			hdr.po_schd_chg_typ(MSC_PO_SCHD_CHG_TYP.DIV_DEL.value());
			hdr.can_flg(true);
			
			for (PoSchd_Upd03_DtlR dtlR : dtlL) {
				// 分割の場合
				dtlR.po_schd_no(getStrSeq(MSC_NUM_SYS_TYP.POSCHD));
				dtlR.po_schd_chg_typ(MSC_PO_SCHD_CHG_TYP.DIV_ADD.value());
				dtlR.org_flg(false);
				dtlR.base_unit_po_qty(MCNumber.ZERO);
				poSchd.add(dtlR.po_schd());
			}
		}

		/**
		 * 分割取消用の設定
		 * @param hdr
		 * @param dtlL
		 */
		protected void setDivCanParam(PoSchd_Upd03_HdrR hdr, MCList<PoSchd_Upd03_DtlR> dtlL, MCList<MST_PO_SCHD_R> poSchd){
			if (isNull(hdr.split_src_schd_no())) {
				hdr.po_schd_chg_typ(MSC_PO_SCHD_CHG_TYP.NOT_CHG.value());
			} 
			else {
				hdr.po_schd_chg_typ(MSC_PO_SCHD_CHG_TYP.DIV_ADD.value());
			}
			hdr.can_flg(false);
			for (PoSchd_Upd03_DtlR dtl : dtlL) {
				poSchd.add(dtl.po_schd());
			}
		}
		/**
		 * 更新項目の決定(更新)
		 * @param poSchdL
		 * @param t 
		 * @param poSchdL_bldr 
		 */
		protected void editUpdCol(MCList<MST_PO_SCHD_R> poSchdL, MCQueryApiBuilder poSchdL_bldr, MST_PO_SCHD_R t){
			poSchdL_bldr.setSet(t.po_schd_chg_typ);
			poSchdL_bldr.addSet(t.can_flg);
		}
		
		protected void setDown() {
			down0().setAll(up1());
		}
		
	}
	/**
	 * PoSchd_Upd04オペレーション.<p>
	 *
	 * 依頼元訂正ＦＬＧを更新する。<br>
	 */
	public class PoSchd_Upd04 extends MSBDL_PoSchdRegService_MC_A.PoSchd_Upd04 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 更新対象の発注予定を取得
			MCList<MST_PO_SCHD_R> poSchdL = srch();
			if (poSchdL.size() > 0) {
				// 発注予定更新
				updPoSchd(poSchdL);
				// 発注明細更新
				updPoD(poSchdL);
			}
		}
		
		/**
		 * 更新対象を検索します
		 * @param poSchdL
		 */
		protected MCList<MST_PO_SCHD_R> srch(){
			// 発注予定作成元ＮＯ指定の場合
			MCList<MST_PO_SCHD_R> myBindLByPoSchdSrcNo = MCList.create(MST_PO_SCHD_R.class);
			// 発注予定ＮＯ指定の場合
			MCList<MST_PO_SCHD_R> myBindLByPoSchdNo = MCList.create(MST_PO_SCHD_R.class);
			
			for (PoSchd_Upd04_DtlR r : up0()) {
				if (isNull(r.po_schd_no())) {
					// 発注予定作成元ＮＯから指定
					MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create();
					poSchdR.po_schd_src_typ(r.po_schd_src_typ());
					poSchdR.po_schd_src_no(r.po_schd_src_no());
					poSchdR.rqst_crrct_flg(r.rqst_crrct_flg());
					poSchdR.rqst_can_flg(r.rqst_can_flg());
					myBindLByPoSchdSrcNo.add(poSchdR);
				}
				else {
					// 発注予定ＮＯから指定
					MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create();
					poSchdR.po_schd_no(r.po_schd_no());
					poSchdR.rqst_crrct_flg(r.rqst_crrct_flg());
					poSchdR.rqst_can_flg(r.rqst_can_flg());
					myBindLByPoSchdNo.add(poSchdR);
				}
			}
			
			// 上り電文に対応する発注予定を取得する
			MCList<MST_PO_SCHD_R> myPoSchdL = MCList.create(MST_PO_SCHD_R.class);
			
			if (myBindLByPoSchdSrcNo.size() > 0) {
				MCIndexKey idx = myBindLByPoSchdSrcNo.createIndex(MST_PO_SCHD_R.$po_schd_src_typ, MST_PO_SCHD_R.$po_schd_src_no);
				MCList<MST_PO_SCHD_R> tmpPoSchdL = MCList.create(MST_PO_SCHD_R.class);
				MST_PO_SCHD_R t1 = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder tmpPoSchdL_bldr = MCQueryApiBuilder.create(t1);
				tmpPoSchdL_bldr.setSelect(t1.po_schd_no);
				tmpPoSchdL_bldr.addSelect(t1.po_schd_src_typ);
				tmpPoSchdL_bldr.addSelect(t1.po_schd_src_no);
				tmpPoSchdL_bldr.addSelect(t1.po_d_no);
				tmpPoSchdL_bldr.addSelect(t1.io_schd_pr_no);
				tmpPoSchdL_bldr.setWhere(t1.po_schd_src_typ.eq(bind("po_schd_src_typ")));
				tmpPoSchdL_bldr
						.addWhereWithAnd(t1.po_schd_src_no.eq(bind("po_schd_src_no")));
				tmpPoSchdL_bldr.addConstWhereWithAnd(t1.rqst_can_flg.eq(value(false)));
				tmpPoSchdL_bldr.addConstWhereWithAnd(t1.split_src_schd_no.isNull());
				dbSelect("MSBDL5090_MST_PO_SCHD_S07", tmpPoSchdL, tmpPoSchdL_bldr, myBindLByPoSchdSrcNo);
				tmpPoSchdL.forEach(r -> {
					MST_PO_SCHD_R poSchdR = myBindLByPoSchdSrcNo.getFirst(idx, r.po_schd_src_typ(), r.po_schd_src_no());
					r.rqst_crrct_flg(poSchdR.rqst_crrct_flg());
					r.rqst_can_flg(poSchdR.rqst_can_flg());
				});
				myPoSchdL.addAll(tmpPoSchdL);
			}
			// 発注予定ＮＯ指定の場合
			if (myBindLByPoSchdNo.size() > 0) {
				MCIndexKey idx = myBindLByPoSchdNo.createIndex(MST_PO_SCHD_R.$po_schd_no);
				MCList<MST_PO_SCHD_R> tmpPoSchdL = MCList.create(MST_PO_SCHD_R.class);
				MST_PO_SCHD_R t2 = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder tmpPoSchdL_bldr = MCQueryApiBuilder.create(t2);
				tmpPoSchdL_bldr.setSelect(t2.po_schd_no);
				tmpPoSchdL_bldr.addSelect(t2.po_schd_src_typ);
				tmpPoSchdL_bldr.addSelect(t2.po_schd_src_no);
				tmpPoSchdL_bldr.addSelect(t2.po_d_no);
				tmpPoSchdL_bldr.addSelect(t2.io_schd_pr_no);
				tmpPoSchdL_bldr.setWhere(t2.po_schd_no.eq(bind("po_schd_no")));
				dbSelect("MSBDL5090_MST_PO_SCHD_S08", tmpPoSchdL, tmpPoSchdL_bldr, myBindLByPoSchdNo);
				tmpPoSchdL.forEach(r -> {
					MST_PO_SCHD_R poSchdR = myBindLByPoSchdNo.getFirst(idx, r.po_schd_no());
					r.rqst_crrct_flg(poSchdR.rqst_crrct_flg());
					r.rqst_can_flg(poSchdR.rqst_can_flg());
				});
				myPoSchdL.addAll(tmpPoSchdL);
			}
			MCIndexKey idx = myPoSchdL.createIndex(MST_PO_SCHD_R.$po_schd_src_typ, MST_PO_SCHD_R.$po_schd_src_no); 
			
			// 自身のみ更新ＦＬＧがfalseの場合、分割先の発注予定も更新するため上り電文に対応する発注予定から受払進捗管理ＮＯを取得する
			MCList<PoSchd_Upd04_DtlR> subL = up0().subList(PoSchd_Upd04_DtlR.$only_own_upd_flg, false);
			if (subL.size() > 0) {
				MCList<MST_PO_SCHD_R> dvidBindL = MCList.create(MST_PO_SCHD_R.class);
				for (PoSchd_Upd04_DtlR r : subL) {
					MST_PO_SCHD_R tmpR = myPoSchdL.getFirst(idx, r.po_schd_src_typ(), r.po_schd_src_no());
					tmpR.rqst_can_flg(r.rqst_can_flg());
					tmpR.rqst_crrct_flg(r.rqst_crrct_flg());
					dvidBindL.add(tmpR);
				}
				MCIndexKey idxIoSchdPrNo = dvidBindL.createIndex(MST_PO_SCHD_R.$io_schd_pr_no);
				
				// 分割先の発注予定を取得する。
				MCList<MST_PO_SCHD_R> dvidPoSchdL = MCList.create(MST_PO_SCHD_R.class);
				MST_PO_SCHD_R t3 = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder dvidPoSchdL_bldr = MCQueryApiBuilder.create(t3);
				dvidPoSchdL_bldr.setSelect(t3.po_schd_no);
				dvidPoSchdL_bldr.addSelect(t3.po_schd_src_typ);
				dvidPoSchdL_bldr.addSelect(t3.po_schd_src_no);
				dvidPoSchdL_bldr.addSelect(t3.po_d_no);
				dvidPoSchdL_bldr.addSelect(t3.io_schd_pr_no);
				dvidPoSchdL_bldr.setWhere(t3.io_schd_pr_no.eq(bind("io_schd_pr_no")));
				dvidPoSchdL_bldr.addWhereWithAnd(t3.po_schd_no.neq(bind("po_schd_no")));
				dbSelect("MSBDL5090_MST_PO_SCHD_S09", dvidPoSchdL, dvidPoSchdL_bldr, dvidBindL);
				dvidPoSchdL.forEach(r -> {
					MST_PO_SCHD_R poSchdR = dvidBindL.getFirst(idxIoSchdPrNo, r.io_schd_pr_no());
					r.rqst_crrct_flg(poSchdR.rqst_crrct_flg());
					r.rqst_can_flg(poSchdR.rqst_can_flg());
				});
				
				// 上り電文に対応する発注予定と、分割先の発注予定も更新対象とする。
				myPoSchdL.addAll(dvidPoSchdL);
			}
			
			// ロック
			locPoSchd(myPoSchdL);
			
			return myPoSchdL;
		}
		
		protected void locPoSchd(MCList<MST_PO_SCHD_R> bindL) {
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL_bldr.setOrderByAsc(t.po_schd_no);
			dbSelectKeyForUpdate("MSBDL5090_MST_PO_SCHD_S10", poSchdL, poSchdL_bldr, bindL);
		}
		/**
		 * 発注予定更新
		 */
		protected void updPoSchd(MCList<MST_PO_SCHD_R> poSchdL) {
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			editUpdPoSchdCol(poSchdL, poSchdL_bldr, t);
			dbUpdateKey("MSBDL5090_MST_PO_SCHD_U05", poSchdL, poSchdL_bldr);
		}
		/**
		 * 発注明細更新
		 */
		protected void updPoD(MCList<MST_PO_SCHD_R> poSchdL) {
			// 紐付ＦＬＧは常にＯＦＦ⇒ＯＮとなる。ＯＮ⇒ＯＦＦに戻されることはない。
			MCList<MST_PO_SCHD_R> tmpL = poSchdL.subList(MST_PO_SCHD_R.$rqst_can_flg, true);
			
			// ロック処理
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKeyForUpdate("MSBDL5090_MST_PO_D_S01", poDL, poDL_bldr, tmpL.groupBy(MST_PO_SCHD_R.$po_d_no));
			
			// ロックが成功したら更新する
			for (MST_PO_D_R r : poDL) {
				r.po_d_no(r.po_d_no());
				r.rqst_can_flg(true);
			}
			editUpdColPod(poDL, poDL_bldr, t);
			dbUpdateKey("MSBDL5090_MST_PO_D_U01", poDL, poDL_bldr);

			//改訂履歴データ更新サービス呼出（発注改訂履歴テーブル更新）
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			for (MST_PO_D_R r : poDL) {
				MST_PO_R poR = MST_PO_R.create();
				poR.po_no(r.po_no());
				poR.po_rev(r.po_rev());
				if (!poL.contains(poR)) {
					poL.add(poR);
				}
			}
			if (poL.size() > 0) {
				//改訂履歴データ更新サービス呼出（発注改訂履歴テーブル更新）
				callRevDataServiceIns01(poL);
			}
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 発注改訂履歴テーブルを更新する。
		 * @param poL
		 */
		protected void callRevDataServiceIns01(MCList<MST_PO_R> poL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_PO_R r : poL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.po_no());
				opeR.rev_no(r.po_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_PO.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		
		/**
		 * 更新項目の決定
		 * @param t 
		 * @param poSchdL_bldr 
		 */
		protected void editUpdPoSchdCol(MCList<MST_PO_SCHD_R> poSchdL, MCQueryApiBuilder poSchdL_bldr, MST_PO_SCHD_R t){
			poSchdL_bldr.setSet(t.rqst_crrct_flg);
			poSchdL_bldr.addSet(t.rqst_can_flg);
		}
		/**
		 * 更新項目の決定
		 * @param t 
		 * @param poDL_bldr 
		 */
		protected void editUpdColPod(MCList<MST_PO_D_R> poDL, MCQueryApiBuilder poDL_bldr, MST_PO_D_R t){
			poDL_bldr.setSet(t.rqst_can_flg);
		}
	}
	
	/**
	 * 取引情報取得
	 * @param dtlR
	 */
	protected void setTrdInfo(PoSchd_Upd01_DtlR dtlR){
		if (isNull(dtlR.trd_cd()) && isNull(dtlR.trd_ptn_typ())) {
			// 取引が指定されていない場合
			dtlR.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC.value());
		}
		getTrdInfo(dtlR);
	}
	//-----------------------------------------------------------------------
	// 受払
	//-----------------------------------------------------------------------
	/**
	 * 受払予定区分を取得します。
	 * @param dlv_cd　納入先
	 * @param outsrc_sppl_cd 外注場所発注先
	 * @param purcIdTyp 購買識別区分（削除の場合はnullを渡すこと）
	 */
	protected String getIoSchdTyp(String dlv_cd, String outsrc_sppl_cd, String purcIdTyp) {
		//削除の場合はGR～にするため、購買識別区分にはnullを渡すこと。
		//後続の処理でGRなしの区分も削除対象となるようにしているため問題ない。
		if (!isNull(dlv_cd)) {
			return MSC_IO_SCHD_TYP.PURC_GR_DDLV.value();
		}
		else if (!isNull(outsrc_sppl_cd)) {
			// 支給品直送でVMIの場合は、仕入入庫
			if (MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
				return MSC_IO_SCHD_TYP.ARR_PROV.value();
			}
			else {
				return MSC_IO_SCHD_TYP.PURC_GR_PROV.value();				
			}
		}
		else {
			if (MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp) || MAC_PURC_ID_TYP.isVMI(purcIdTyp)) {
				return MSC_IO_SCHD_TYP.ARR.value();
			}
			else {
				return MSC_IO_SCHD_TYP.PURC_GR.value();
			}
		}
	}
	/**
	 * 在庫着荷先ＣＤを設定します
	 * @param dest
	 * @param src
	 */
	protected String setStkArrvBpCd(String outsrc_sppl_cd, String prov_basis_typ, String prov_typ, String purc_id_typ) {
		if (!isNull(outsrc_sppl_cd) && (!MAC_PROV_BASIS_TYP.isINPT(prov_basis_typ)
				|| !MAC_PROV_TYP.isONR_PROV(prov_typ)
				|| MAC_PURC_ID_TYP.isFFR_RCV(purc_id_typ))) {
			return outsrc_sppl_cd;
		} 
		else {
			return null;
		}
	}
	/**
	 * 在庫識別区分を設定します
	 */
	protected String setStkIdTyp(String prov_basis_typ, String outsrc_sppl_cd, String prov_typ, String purcIdTyp) {
		if (!isNull(outsrc_sppl_cd) && !MAC_PROV_BASIS_TYP.isINPT(prov_basis_typ)
				&& MAC_PROV_TYP.isONR_PROV(prov_typ)
				&& !MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
			return MSC_STK_ID_TYP.ONR_PROV.value();
		} 
		else {
			if (MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
				return MSC_STK_ID_TYP.NCV_RCV.value();
			}
			else if (isNull(outsrc_sppl_cd) && MAC_PURC_ID_TYP.isVMI(purcIdTyp)) {
				return MSC_STK_ID_TYP.RNT_RCV.value();
			}
			else {
				return MSC_STK_ID_TYP.COSTK.value();
			}
		}
	}
	/**
	 * 在庫取引先を設定します
	 * @param stkIdTyp
	 * @param outsrc_sppl_cd
	 * @param sppl_cd
	 * @return
	 */
	protected String setStkBpCd(String stkIdTyp, String outsrc_sppl_cd, String sppl_cd) {
		if (MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)) {
			return outsrc_sppl_cd;
		}
		else if (MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp) || MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)) {
			return sppl_cd;
		}
		else {
			return MAC_STR.NULL_VAL.value();
		}
	}
	//-----------------------------------------------------------------------
	/**
	 * 単価情報取得時の基準日を判定します。
	 * @param dtlR
	 * @return
	 */
	protected MCDate getUpriBaseDt(PoSchd_Upd01_DtlR dtlR) {
		MCDate baseDt = null;
		if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(dtlR.purc_upri_req_typ())) {
			baseDt = dtlR.po_schd_dt();
		}
		else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(dtlR.purc_upri_req_typ())) {
			baseDt = dtlR.dlv_rqst_tm();
		}
		else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(dtlR.purc_upri_req_typ())) {
			baseDt = dtlR.purc_schd_dt();
		}
		return baseDt;
	}
	/**
	 * 取引情報を取得する
	 * @param dtlR
	 * @return
	 */
	protected void getTrdInfo(PoSchd_Upd01_DtlR dtlR){
		if (isNull(dtlR.trd_cd())) {
			MAM_TRD_R trdR = getTrdCache(dtlR);
			dtlR.trd_cd(trdR.trd_cd());
		} 
		else if (isNull(dtlR.trd_ptn_typ())) {
			MAM_TRD_R trdR = getTrdCache(dtlR);
			dtlR.trd_ptn_typ(trdR.trd_ptn_typ());
		}
	}
	
	/**
	 * 発注先情報取得
	 * @param row
	 */
	protected MAM_ITM_DTL_R getSpplInfo(MAM_ITM_DTL_R row, MCDate baseDt){
		MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtlL(row);
		MCList<MAM_ITM_DTL_R> spplL = MCList.create(MAM_ITM_DTL_R.class); 
		for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
			if (baseDt.gte(itmDtlR.st_dt()) && baseDt.lte(itmDtlR.end_dt()) 
					&& !isNull(itmDtlR.sppl_cd()) 
					&& isSame(row.wg_cd(), itmDtlR.wg_cd())) {
				spplL.add(itmDtlR);
			}
		}
		if (!isNull(spplL)) {
			spplL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$st_dt);
			return spplL.get(0);
		}
		return MAM_ITM_DTL_R.create();
	}
	

	/**
	 * 版情報取得
	 * @param dtlR
	 */
	protected void getItmVerInfo(MAM_ITM_VER_R row, MCDate baseDt){
		MCList<MAM_ITM_VER_R> itmVerL = getCacheItmVer(row);
		if (isNull(itmVerL)) {
			return;
		}
		for (MAM_ITM_VER_R itmVerR : itmVerL) {
			if (baseDt.gte(itmVerR.purc_st_dt())) {
				row.ver_no(itmVerR.ver_no());
				return;
			}
		}
	}

	/**
	 * 受払進捗管理ＮＯ発番
	 * @return
	 */
	protected String getIoSchdPrNo(){
		return getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR);
	}

	/**
	 * 金額計算
	 */
	protected void calcAmt(PoSchd_Upd01_DtlR dtlR){
		MSBDL_PurcUtil.setTrdCurInfo(dtlR);
		if(dtlR.outsrc_flg()) {
			MAM_BP_R bpR = getCacheBp(dtlR.sppl_cd());
			// 外注かつ買戻し義務がオンの場合、加工金額を元に税額を再計算する
			if(bpR.repurc_obli_flg()) {
				MCNumber amt = MAUCL_AmtUtil.getAmt(dtlR.trd_cur_upri(),
						dtlR.trd_unit_qty(),
						dtlR.trd_cur_amt_dec_place(),
						dtlR.purc_amt_rnd_typ());
				if(dtlR.inc_tax_flg()) {
					// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
					MCNumber proc_inc_tax_amt = MAUCL_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							dtlR.trd_cur_amt_dec_place(),
							dtlR.purc_amt_rnd_typ());
					dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
					// 有償支給金額は金額-加工金額
					dtlR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
				}
				MCNumber trdCurTaxAmt = MAUCL_AmtUtil.getTaxAmt(
						dtlR.trd_cur_proc_amt(),
						dtlR.tax_rate(),
						dtlR.trd_cur_amt_dec_place(),
						dtlR.purc_tax_rnd_typ(),
						dtlR.inc_tax_flg()
						);
				dtlR.trd_cur_tax_amt(trdCurTaxAmt);
				if(dtlR.inc_tax_flg()) {
					amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
					MCNumber proc_amt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
					dtlR.trd_cur_amt(amt);
					dtlR.trd_cur_proc_amt(proc_amt);
				}
			}
		}
	}
	
	protected Map_InspSchd_Srch03_CndR_PoSchd_Upd01_DtlR<InspSchd_Srch03_CndR,PoSchd_Upd01_DtlR> createMap_InspSchd_Srch03_CndR_PoSchd_Upd01_DtlR() {
		return new Map_InspSchd_Srch03_CndR_PoSchd_Upd01_DtlR<InspSchd_Srch03_CndR, PoSchd_Upd01_DtlR>();
	}

	public class Map_InspSchd_Srch03_CndR_PoSchd_Upd01_DtlR<D extends InspSchd_Srch03_CndR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Srch03_CndR.$peg_no, PoSchd_Upd01_DtlR.$peg_no);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_cd, PoSchd_Upd01_DtlR.$itm_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub3, PoSchd_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(InspSchd_Srch03_CndR.$sppl_cd, PoSchd_Upd01_DtlR.$sppl_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$maker_cd, PoSchd_Upd01_DtlR.$maker_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$schd_gr_dt, PoSchd_Upd01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(InspSchd_Srch03_CndR.$to_loc_cd, PoSchd_Upd01_DtlR.$in_to_loc_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$dlv_cd, PoSchd_Upd01_DtlR.$dlv_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
		}
	}

	protected Map_IoSchd_Ins01_DtlR_PoSchd_Upd01_DtlR<IoSchd_Ins01_DtlR,PoSchd_Upd01_DtlR> createMap_IoSchd_Ins01_DtlR_PoSchd_Upd01_DtlR() {
		return new Map_IoSchd_Ins01_DtlR_PoSchd_Upd01_DtlR<IoSchd_Ins01_DtlR, PoSchd_Upd01_DtlR>();
	}
	public class Map_IoSchd_Ins01_DtlR_PoSchd_Upd01_DtlR<D extends IoSchd_Ins01_DtlR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, PoSchd_Upd01_DtlR.$po_schd_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, PoSchd_Upd01_DtlR.$io_schd_pr_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, PoSchd_Upd01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(IoSchd_Ins01_DtlR.$insp_cmpl_schd_dt, PoSchd_Upd01_DtlR.$insp_schd_end_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, PoSchd_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, PoSchd_Upd01_DtlR.$ver_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, PoSchd_Upd01_DtlR.$in_to_loc_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, PoSchd_Upd01_DtlR.$str_ln_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, PoSchd_Upd01_DtlR.$sno1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, PoSchd_Upd01_DtlR.$sno2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, PoSchd_Upd01_DtlR.$sno3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, PoSchd_Upd01_DtlR.$sno4);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, PoSchd_Upd01_DtlR.$trd_unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, PoSchd_Upd01_DtlR.$trd_unit_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, PoSchd_Upd01_DtlR.$base_unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, PoSchd_Upd01_DtlR.$base_unit_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sppl_cd, PoSchd_Upd01_DtlR.$sppl_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$rsn_cd, PoSchd_Upd01_DtlR.$purc_rsn_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAM_ITM_DTL_R itmDtlR = getCacheItmDtlR(
					src.itm_cd()
					, src.itm_sub1()
					, src.itm_sub2()
					, src.itm_sub3()
					, isSame(_sysParm, "1") ? src.rqst_avl_rqst_dt() : src.po_schd_dt()
					, src.loc_wg_cd()
					, src.sppl_cd()
					, src.maker_cd());
			String purcIdTyp = nvl(itmDtlR.purc_id_typ(), MAC_PURC_ID_TYP.PURC.value());
			if (!isNull(src.dlv_cd())) {
				purcIdTyp = MAC_PURC_ID_TYP.PURC.value();
			}
			dest.io_schd_typ(getIoSchdTyp(src.dlv_cd(), src.outsrc_sppl_cd(), purcIdTyp));
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			MAM_PROV_UPRI_R provUpriR = getCacheProvUpri(src);
			dest.stk_arrv_bp_cd(setStkArrvBpCd(src.outsrc_sppl_cd(), src.prov_basis_typ(), provUpriR.prov_typ(), purcIdTyp));
			if (MAC_PURC_ID_TYP.isPURC(purcIdTyp)
					|| MAC_PURC_ID_TYP.isONR_RCV(purcIdTyp)
					|| (!isNull(src.outsrc_sppl_cd())
							&& MAC_PURC_ID_TYP.isVMI(purcIdTyp))) {
				dest.accpt_schd_dt(src.purc_schd_dt());
			}
			dest.stk_id_typ(setStkIdTyp(src.prov_basis_typ(), src.outsrc_sppl_cd(), src.prov_typ(), purcIdTyp));
			dest.stk_bp_cd(setStkBpCd(dest.stk_id_typ(), src.outsrc_sppl_cd(), src.sppl_cd()));
			dest.gd_cd(MAUCL_AppSys.getDefaultFeedStkGd().gd_cd());
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			if (src.outsrc_flg()) {
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
				dest.io_schd_sub_no1(src.outsrc_itm_ord_no());
			}
		}
	}
	
	
	/**
	 * 受払予定ＤＥＬ上り電文　←　発注予定上り電文
	 * @return
	 */
	protected Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR<MSW_IO_SCHD_DEL_R,PoSchd_Upd01_DtlR> createMap_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR() {
		return new Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR<MSW_IO_SCHD_DEL_R, PoSchd_Upd01_DtlR>();
	}
	public class Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR<D extends MSW_IO_SCHD_DEL_R, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, PoSchd_Upd01_DtlR.$po_schd_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			// 更新前の発注予定に紐付く受払予定を削除する。
			MST_PO_SCHD_R poSchdR = getPoSchd(src);
			dest.io_schd_typ(getIoSchdTyp(poSchdR.dlv_cd(), getCacheLoc(poSchdR.in_to_loc_cd()).sppl_cd(), null));
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
		}
	}
	
	/**
	 * 受払予定ＤＥＬ上り電文　←　発注予定上り電文【外注品に紐付く支給品の投入予定用】
	 * @return
	 */
	protected Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR_For_OutsrcInpt<MSW_IO_SCHD_DEL_R,PoSchd_Upd01_DtlR> createMap_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR_For_OutsrcInpt() {
		return new Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR_For_OutsrcInpt<MSW_IO_SCHD_DEL_R, PoSchd_Upd01_DtlR>();
	}
	public class Map_MSW_IO_SCHD_DEL_R_PoSchd_Upd01_DtlR_For_OutsrcInpt<D extends MSW_IO_SCHD_DEL_R, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, PoSchd_Upd01_DtlR.$outsrc_itm_ord_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
		}
	}
	
	
	protected Map_Sls_Schd_Upd04_DtlR_PoSchd_Upd01_DtlR<Sls_Schd_Upd04_DtlR,PoSchd_Upd01_DtlR> createMap_Sls_Schd_Upd04_DtlR_PoSchd_Upd01_DtlR() {
		return new Map_Sls_Schd_Upd04_DtlR_PoSchd_Upd01_DtlR<Sls_Schd_Upd04_DtlR, PoSchd_Upd01_DtlR>();
	}

	public class Map_Sls_Schd_Upd04_DtlR_PoSchd_Upd01_DtlR<D extends Sls_Schd_Upd04_DtlR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$data_crud_typ, PoSchd_Upd01_DtlR.$data_crud_typ);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$po_schd_no, PoSchd_Upd01_DtlR.$po_schd_no);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$slo_d_no, PoSchd_Upd01_DtlR.$slo_d_no);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$sls_schd_dt, PoSchd_Upd01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$trd_unit_qty, PoSchd_Upd01_DtlR.$trd_unit_qty);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$trd_unit_cd, PoSchd_Upd01_DtlR.$trd_unit_cd);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$base_unit_qty, PoSchd_Upd01_DtlR.$base_unit_qty);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$base_unit_cd, PoSchd_Upd01_DtlR.$base_unit_cd);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$abort_flg, PoSchd_Upd01_DtlR.$abort_flg);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$cred_no_up_flg, PoSchd_Upd01_DtlR.$cred_no_up_flg);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PO_SCHD.value());
			if (MSC_PO_SCHD_SRC_TYP.isRQST(src.po_schd_src_typ())) {
				MST_WG_RQST_PRMS_R wgRwstPrmsR = _getCacheWgRqstPrms(src);
				dest.wg_rqst_no(wgRwstPrmsR.wg_rqst_no());
			}
			
		}
	}
	
	protected Map_Ord_Upd04_DtlR_PoSchd_Upd01_DtlR<Ord_Upd04_DtlR,PoSchd_Upd01_DtlR> createMap_Ord_Upd04_DtlR_PoSchd_Upd01_DtlR() {
		return new Map_Ord_Upd04_DtlR_PoSchd_Upd01_DtlR<Ord_Upd04_DtlR, PoSchd_Upd01_DtlR>();
	}

	public class Map_Ord_Upd04_DtlR_PoSchd_Upd01_DtlR<D extends Ord_Upd04_DtlR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, PoSchd_Upd01_DtlR.$pln_itm_ord_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (src.outsrc_flg()) {
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
			}
			else {
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
			}
		}
	}
	protected Map_PurcUtil_Srch02_DtlR_PoSchd_Upd01_DtlR<PurcUtil_Srch02_DtlR,PoSchd_Upd01_DtlR> createMap_PurcUtil_Srch02_DtlR_PoSchd_Upd01_DtlR() {
		return new Map_PurcUtil_Srch02_DtlR_PoSchd_Upd01_DtlR<PurcUtil_Srch02_DtlR, PoSchd_Upd01_DtlR>();
	}

	public class Map_PurcUtil_Srch02_DtlR_PoSchd_Upd01_DtlR<D extends PurcUtil_Srch02_DtlR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, PoSchd_Upd01_DtlR.$peg_no);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, PoSchd_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sppl_cd, PoSchd_Upd01_DtlR.$sppl_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, PoSchd_Upd01_DtlR.$maker_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, PoSchd_Upd01_DtlR.$trd_unit_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, PoSchd_Upd01_DtlR.$trd_unit_qty);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, PoSchd_Upd01_DtlR.$base_unit_qty);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$cur_cd, PoSchd_Upd01_DtlR.$trd_cur_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, PoSchd_Upd01_DtlR.$loc_wg_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, PoSchd_Upd01_DtlR.$in_to_loc_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$dlv_cd, PoSchd_Upd01_DtlR.$dlv_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, PoSchd_Upd01_DtlR.$tax_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, PoSchd_Upd01_DtlR.$mfg_loc_cd);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, PoSchd_Upd01_DtlR.$bom_ptn);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$outsrc_itm_ord_no, PoSchd_Upd01_DtlR.$outsrc_itm_ord_no);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, PoSchd_Upd01_DtlR.$sno1);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, PoSchd_Upd01_DtlR.$sno2);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, PoSchd_Upd01_DtlR.$sno3);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, PoSchd_Upd01_DtlR.$sno4);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt, PoSchd_Upd01_DtlR.$rqst_avl_rqst_dt);
			addColumnPathMap(PurcUtil_Srch02_DtlR.$itmdtl_base_dt, PoSchd_Upd01_DtlR.$po_schd_dt);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.grp_no(dest.peg_no().toString());
			dest.base_dt(getUpriBaseDt(src));
		}
	}
	protected Map_SundryItm_Upd01_DtlR_PoSchd_Upd01_DtlR<SundryItm_Upd01_DtlR,PoSchd_Upd01_DtlR> createMap_SundryItm_Upd01_DtlR_PoSchd_Upd01_DtlR() {
		return new Map_SundryItm_Upd01_DtlR_PoSchd_Upd01_DtlR<SundryItm_Upd01_DtlR, PoSchd_Upd01_DtlR>();
	}

	public class Map_SundryItm_Upd01_DtlR_PoSchd_Upd01_DtlR<D extends SundryItm_Upd01_DtlR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3, PoSchd_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, PoSchd_Upd01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, PoSchd_Upd01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, PoSchd_Upd01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, PoSchd_Upd01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, PoSchd_Upd01_DtlR.$itm_nm);

		}
	}
	
	protected Map_Ord_Sprt03_DtlR_PoSchd_Upd01_DtlR<Ord_Sprt03_DtlR,PoSchd_Upd01_DtlR> createMap_Ord_Sprt03_DtlR_PoSchd_Upd01_DtlR() {
		return new Map_Ord_Sprt03_DtlR_PoSchd_Upd01_DtlR<Ord_Sprt03_DtlR, PoSchd_Upd01_DtlR>();
	}

	public class Map_Ord_Sprt03_DtlR_PoSchd_Upd01_DtlR<D extends Ord_Sprt03_DtlR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, PoSchd_Upd01_DtlR.$peg_no);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, PoSchd_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, PoSchd_Upd01_DtlR.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, PoSchd_Upd01_DtlR.$bom_ptn);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, PoSchd_Upd01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, PoSchd_Upd01_DtlR.$po_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, PoSchd_Upd01_DtlR.$in_to_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, PoSchd_Upd01_DtlR.$base_unit_qty);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
			dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			dest.sppl_cd(MAC_STR.NULL_VAL.value());
			dest.maker_cd(MAC_STR.NULL_VAL.value());
		}
	}
	
	protected Map_Ord_Sprt02_DtlR_PoSchd_Upd01_DtlR<Ord_Sprt02_DtlR,PoSchd_Upd01_DtlR> createMap_Ord_Sprt02_PoSchd_Upd01_DtlR() {
		return new Map_Ord_Sprt02_DtlR_PoSchd_Upd01_DtlR<Ord_Sprt02_DtlR, PoSchd_Upd01_DtlR>();
	}

	public class Map_Ord_Sprt02_DtlR_PoSchd_Upd01_DtlR<D extends Ord_Sprt02_DtlR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt02_DtlR.$peg_no, PoSchd_Upd01_DtlR.$peg_no);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, PoSchd_Upd01_DtlR.$itm_cd);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, PoSchd_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, PoSchd_Upd01_DtlR.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, PoSchd_Upd01_DtlR.$bom_ptn);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno1, PoSchd_Upd01_DtlR.$sno1);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno2, PoSchd_Upd01_DtlR.$sno2);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno3, PoSchd_Upd01_DtlR.$sno3);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno4, PoSchd_Upd01_DtlR.$sno4);
			addColumnPathMap(Ord_Sprt02_DtlR.$inst_qty, PoSchd_Upd01_DtlR.$base_unit_qty);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.oper_cd(MAC_STR.NULL_VAL.value());		//　外注のため、デフォルト工程
			dest.oper_seq(MCNumber.ZERO);
		}
	}
	
	protected Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR,Ord_Sprt02_RsltR> createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR() {
		return new Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR, Ord_Sprt02_RsltR>();
	}

	public class Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<D extends IoSchd_Ins01_DtlR, S extends Ord_Sprt02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, Ord_Sprt02_RsltR.$schd_in_dt);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, Ord_Sprt02_RsltR.$itm_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, Ord_Sprt02_RsltR.$itm_sub3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Ord_Sprt02_RsltR.$ver_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_seq, Ord_Sprt02_RsltR.$alt_grp_seq);
			addColumnPathMap(IoSchd_Ins01_DtlR.$oper_ord_no, Ord_Sprt02_RsltR.$oper_ord_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_qty, Ord_Sprt02_RsltR.$alt_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_typ, Ord_Sprt02_RsltR.$alt_itm_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$alt_alloc_prio, Ord_Sprt02_RsltR.$alt_alloc_prio);
			addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Ord_Sprt02_RsltR.$loc_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, Ord_Sprt02_RsltR.$sno1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, Ord_Sprt02_RsltR.$sno2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, Ord_Sprt02_RsltR.$sno3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, Ord_Sprt02_RsltR.$sno4);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, Ord_Sprt02_RsltR.$rqmt_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, Ord_Sprt02_RsltR.$rqmt_qty);
			addColumnPathMap(IoSchd_Ins01_DtlR.$inpt_ctl_typ, Ord_Sprt02_RsltR.$inpt_ctl_typ);
			addColumnPathMap(IoSchd_Ins01_DtlR.$peg_no, Ord_Sprt02_RsltR.$peg_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
				dest.sno1_null_flg(true);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ2())) {
				dest.sno2_null_flg(true);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ3())) {
				dest.sno3_null_flg(true);
			}
			if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ4())) {
				dest.sno4_null_flg(true);
			}
			dest.alloc_flg(false);
		}
	}
	
	protected Map_StrLnUtil_Srch01_CndR_PoSchd_Upd01_DtlR<StrLnUtil_Srch01_CndR,PoSchd_Upd01_DtlR> createMap_StrLnUtil_Srch01_CndR_PoSchd_Upd01_DtlR() {
		return new Map_StrLnUtil_Srch01_CndR_PoSchd_Upd01_DtlR<StrLnUtil_Srch01_CndR, PoSchd_Upd01_DtlR>();
	}

	public class Map_StrLnUtil_Srch01_CndR_PoSchd_Upd01_DtlR<D extends StrLnUtil_Srch01_CndR, S extends PoSchd_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StrLnUtil_Srch01_CndR.$peg_no, PoSchd_Upd01_DtlR.$peg_no);
			addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_cd, PoSchd_Upd01_DtlR.$itm_cd);
			addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub1, PoSchd_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub2, PoSchd_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub3, PoSchd_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(StrLnUtil_Srch01_CndR.$loc_cd, PoSchd_Upd01_DtlR.$in_to_loc_cd);
		}
	}
	
	protected String getPurcDdlvTgt(PoSchd_Upd01_DtlR r) {
		return nvl(r.tdlv_cd(), r.dlv_cd());
	}

	//FMCB CUSTOM END
}