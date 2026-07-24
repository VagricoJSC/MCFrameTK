package mcframe.serverMSBD.MSBDL5100;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5100.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBD.MSBDL5090.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBC.MSBCL6120.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBD.MSBDL5200.*;
import mcframe.serverMABC.MABCL5010.*;
import mcframe.serverMSUC.MSUCL0080.*;
import mcframe.serverMSBD.MSBDL5120.*;
import mcframe.serverMSBE.MSBEL5020.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.serverMSLA.MSLAL5020.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import java.util.ArrayList;
import mcframe.serverMSBG.MSBGL5080.*;
import java.util.*;
import mcframe.serverMSBD.MSBDL5030.*;
import mcframe.serverMSBC.MSBCL6130.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PoRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PoRegService_MC extends MSBDL_PoRegService_MC_A{
	//FMCB CUSTOM START
	String _sysParm = getSysParm("MASTER_DT_BASE");
	//-----------------------------------------------
	// IndexKey
	//-----------------------------------------------
	/** 受注 */
	MCIndexKey _idxCacheSlo = null;
	/** 発注予定（発注予定ＮＯ） */
	MCIndexKey _idxCachePoSchdPoSchdNo = null;
	/** 発注予定（発注明細ＮＯ） */
	MCIndexKey _idxCachePoSchdPoDNo = null;
	/** 品目製造指図 */
	MCIndexKey _idxCacheItmMfginst = null;
	/** 品目オーダ */
	MCIndexKey _idxCacheItmOrder = null;
	/** 入荷進捗 */
	MCIndexKey _idxCacheArrPr = null;
	/** 入荷予定 */
	MCIndexKey _idxCacheArrSchd = null;
	/** 場所 */
	MCIndexKey _idxCacheLoc = null;
	//-----------------------------------------------
	// Cache
	//-----------------------------------------------
	/** 受注 */
	protected MCList<MST_SLO_R> _cacheSlo = MCList.create(MST_SLO_R.class);
	/** 発注予定 */
	MCList<MST_PO_SCHD_R> _cachePoSchd = MCList.create(MST_PO_SCHD_R.class);
	/** 発注ヘッダ */
	protected FXUCL_MCDbcCache<MST_PO_R> _cachePo = null;
	/** 発注明細 */
	protected FXUCL_MCDbcCache<MST_PO_D_R> _cachePoD = null;
	/** 入荷進捗 */
	protected MCList<MST_ARR_PR_R> _cacheArrPr = MCList.create(MST_ARR_PR_R.class);
	/** 入荷予定 */
	protected MCList<MST_ARR_SCHD_R> _arrSchdCache = MCList.create(MST_ARR_SCHD_R.class);
	/** 品目オーダ */
	protected MCList<MST_ITM_ORDER_R> _cacheItmOrder = MCList.create(MST_ITM_ORDER_R.class);
	/** 品目 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;
	/** 取引先 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp = null;
	/** 伝票帳票 */
	protected FXUCL_MCDbcCache<MAM_SLIP_FORM_R> _cacheSlipForm = null;
	/** 場所 */
	protected MCList<MAM_LOC_R> _cacheLoc = MCList.create(MAM_LOC_R.class);
	/** 製造場所 */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheMfgLoc = null;
	/** オーダ登録サービス.オーダ更新チェック処理電文キャッシュ（ヘッダ）  */
	protected MCList<Ord_Upd01_Dtl1R> _ordChkDtl1Cache = null;
	
	protected FXUCL_MCDbcCacheStEnd<MAM_PURC_DDLV_LT_R> _cachePurcDdlvLt = null;

	protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = null;

	protected MCIndexKey _idxItmDtlCacheKey;

	protected void createPurcDdlvLtCache(MCList<Po_Ins01_DtlR> dtlL) {
		MCQueryApiBuilder purcDdlvLtCache_bldr = MCQueryApiBuilder.create(MAM_PURC_DDLV_LT_R.create("T"));
		_cachePurcDdlvLt = new FXUCL_MCDbcCacheStEnd<MAM_PURC_DDLV_LT_R>(purcDdlvLtCache_bldr, getPurcDdlvCacheTgt(dtlL),
				MAM_PURC_DDLV_LT_R.$sppl_cd, MAM_PURC_DDLV_LT_R.$lg_grp_cd, MAM_PURC_DDLV_LT_R.$itm_cd,
				MAM_PURC_DDLV_LT_R.$itm_sub1, MAM_PURC_DDLV_LT_R.$itm_sub2, MAM_PURC_DDLV_LT_R.$itm_sub3);
	}
	/** 支給予定キャッシュ */
	protected MCList<MST_PROV_SCHD_R> _provSchdL = null;
	/** 支給予定キャッシュ用インデックス */
	protected MCIndexKey _provSchdKey = null;
	protected void createProvSchdCache(MCList<Po_Ins01_DtlR> dtlL) {
		_provSchdL = MCList.create(MST_PROV_SCHD_R.class);
		MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
		MCQueryApiBuilder provSchdL_bldr = MCQueryApiBuilder.create(t);
		provSchdL_bldr.setWhere(t.prov_src_schd_no1.eq(bind("po_d_no")));
		provSchdL_bldr.addWhereWithAnd(t.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())));
		dbSelect("MSBDL5100_MST_PROV_SCHD_S01", _provSchdL, provSchdL_bldr, dtlL.groupBy(Po_Ins01_DtlR.$po_d_no));
		_provSchdKey = _provSchdL.createIndex(MST_PROV_SCHD_R.$prov_src_schd_no1);
	}
	protected static MST_PROV_SCHD_R getProvSchdCache(String poDNo) {
		return object(CLAZZ)._getProvSchdCache(poDNo);
	}
	protected MST_PROV_SCHD_R _getProvSchdCache(String poDNo) {
		return _provSchdL.getFirst(_provSchdKey, poDNo);
	}
	/** 製造指図ＮＯに紐付く入荷実績キャッシュ */
	protected MCList<MST_ARR_ACT_R> _arrActByMfgInstNoL = null;
	/** 製造指図ＮＯに紐付く入荷実績キャッシュ用インデックス */
	protected MCIndexKey _arrActByMfgInstNoKey = null;
	protected void createArrActCacheByMfgInstNo() {
		_arrActByMfgInstNoL = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder arrActByMfgInstNoL_bldr = MCQueryApiBuilder.create(t);
		MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
		arrActByMfgInstNoL_bldr.setSelect(t.arr_schd_no);
		arrActByMfgInstNoL_bldr.addSelect(t.arr_act_no);
		arrActByMfgInstNoL_bldr.addSelect(t.purc_act_io_no);
		arrActByMfgInstNoL_bldr.addSelect(t2.mfg_inst_no);
		arrActByMfgInstNoL_bldr.addInnerJoin(t2, bracket(t.arr_schd_no.eq(t2.arr_schd_no)));
		arrActByMfgInstNoL_bldr.setWhere(t2.mfg_inst_no.eq(bind("mfg_inst_no")));
		arrActByMfgInstNoL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBDL5100_MST_ARR_ACT_S01", _arrActByMfgInstNoL, arrActByMfgInstNoL_bldr, _arrSchdCache);
		_arrActByMfgInstNoKey = _arrActByMfgInstNoL.createIndex("mfg_inst_no");
	}
	protected static MCList<MST_ARR_ACT_R> getArrActCacheByMfgInstNo(String mfgInstNo) {
		return object(CLAZZ)._getArrActCacheByMfgInstNo(mfgInstNo);
	}
	protected MCList<MST_ARR_ACT_R> _getArrActCacheByMfgInstNo(String mfgInstNo) {
		return _arrActByMfgInstNoL.subList(_arrActByMfgInstNoKey, mfgInstNo);
	}

	protected MCList<MAM_PURC_DDLV_LT_R> getPurcDdlvCacheTgt(MCList<Po_Ins01_DtlR> dtlL) {
		MCList<MAM_PURC_DDLV_LT_R> bindL = MCList.create(MAM_PURC_DDLV_LT_R.class);
		for (Po_Ins01_DtlR dtlR : dtlL) {

			// 仕入直送
			if (!isNullAnd(dtlR.tdlv_cd(), dtlR.dlv_cd())) {
				MAM_BP_R bpR = getCacheBp(getPurcDdlvTgt(dtlR));
				MAM_PURC_DDLV_LT_R bindR = MAM_PURC_DDLV_LT_R.create();
				bindR.sppl_cd(dtlR.sppl_cd());
				bindR.itm_cd(dtlR.itm_cd());
				bindR.itm_sub1(dtlR.itm_sub1());
				bindR.itm_sub2(dtlR.itm_sub2());
				bindR.itm_sub3(dtlR.itm_sub3());
				if (!isNull(bpR)) {
					// 配送先あるいは納品先の物流G
					bindR.lg_grp_cd(bpR.lg_grp_cd());
				}
				bindL.add(bindR);
			}
			// 直送支給
			else {
				MAM_LOC_R locR = getCacheLoc(dtlR.in_to_loc_cd());
				if (!isNull(locR) && !isNull(locR.sppl_cd())) {
					MAM_PURC_DDLV_LT_R bindR = MAM_PURC_DDLV_LT_R.create();
					bindR.sppl_cd(dtlR.sppl_cd());
					bindR.itm_cd(dtlR.itm_cd());
					bindR.itm_sub1(dtlR.itm_sub1());
					bindR.itm_sub2(dtlR.itm_sub2());
					bindR.itm_sub3(dtlR.itm_sub3());
					// 場所の物流G
					bindR.lg_grp_cd(locR.lg_grp_cd());
					bindL.add(bindR);
				}
			}
		}
		return bindL;
	}

	protected MAM_PURC_DDLV_LT_R getCachePurcDdlvLt(Po_Ins01_DtlR dtlR){
		return object(CLAZZ)._getCachePurcDdlvLt(dtlR);
	}
	
	protected MAM_PURC_DDLV_LT_R _getCachePurcDdlvLt(Po_Ins01_DtlR dtlR) {
		if (_cachePurcDdlvLt == null) {
			return MAM_PURC_DDLV_LT_R.create();
		}

		String lgGrpCd = null;
		MAM_BP_R bpR = getCacheBp(getPurcDdlvTgt(dtlR));
		// 仕入直送
		if (!isNull(bpR) && !bpR.isEmpty()) {
			lgGrpCd = bpR.lg_grp_cd();
		}
		// 直送支給
		else {
			MAM_LOC_R locR = getCacheLoc(dtlR.in_to_loc_cd());
			if (!isNull(locR.sppl_cd())) {
				lgGrpCd = locR.lg_grp_cd();
			}
		}
		MAM_PURC_DDLV_LT_R purcDdlvR = _cachePurcDdlvLt.get(isSame(_sysParm, "1") ? dtlR.rqst_avl_rqst_dt() :dtlR.po_dt(), dtlR.sppl_cd(), lgGrpCd, dtlR.itm_cd(),
				dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
		if (purcDdlvR == null) {
			return MAM_PURC_DDLV_LT_R.create();
		}
		else {
			return purcDdlvR;
		}
	}

	protected String getPurcDdlvTgt(Po_Ins01_DtlR r) {
		return nvl(r.tdlv_cd(), r.dlv_cd());
	}
	
	protected void createCacheItmDtl(MCList<Po_Ins01_DtlR> dtlL) {
		MCList<MAM_ITM_DTL_R> bindL = MCList.create(MAM_ITM_DTL_R.class);
		_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);

		for (Po_Ins01_DtlR dtlR : dtlL) {
			bindL.add(createItmDtlBindRow(dtlR));
		}

		MAM_ITM_DTL_R cacheItmDtl_t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(cacheItmDtl_t);
		cacheItmDtl_bldr.setWhere(cacheItmDtl_t.itm_cd.eq(bind("itm_cd")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub1.eq(bind("itm_sub1")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub2.eq(bind("itm_sub2")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.itm_sub3.eq(bind("itm_sub3")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.sppl_cd.eq(bind("sppl_cd")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.maker_cd.eq(bind("maker_cd")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.wg_cd.eq(bind("wg_cd")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.bom_ptn.eq(bind("bom_ptn")));
		cacheItmDtl_bldr.addWhereWithAnd(cacheItmDtl_t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
		dbSelect("MSBDL5100_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr,
				bindL.groupBy(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1,
						MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3,
						MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$mfg_loc_cd,
						MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$wg_cd,
						MAM_ITM_DTL_R.$bom_ptn));
		_idxItmDtlCacheKey = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd,
				MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3,
				MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd,
				MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn);
	}
	
	protected MAM_ITM_DTL_R getItmDtl(Po_Ins01_DtlR dtlR) {
		MAM_ITM_DTL_R bindR = createItmDtlBindRow(dtlR);
		MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtlCacheKey, bindR.itm_cd(),
				bindR.itm_sub1(), bindR.itm_sub2(), bindR.itm_sub3(), bindR.wg_cd(), bindR.sppl_cd(), bindR.maker_cd(),
				bindR.mfg_loc_cd(), bindR.bom_ptn());
		for (MAM_ITM_DTL_R itmDtlR : itmDtlL) {
			if (bindR.st_dt().gte(itmDtlR.st_dt()) && bindR.st_dt().lte(itmDtlR.end_dt())) {
				return itmDtlR;
			}
		}
		return MAM_ITM_DTL_R.create();
	}
	
	protected MAM_ITM_DTL_R createItmDtlBindRow(Po_Ins01_DtlR dtlR) {
		MAM_ITM_DTL_R bindR = MAM_ITM_DTL_R.create();
		bindR.itm_cd(dtlR.itm_cd());
		bindR.itm_sub1(dtlR.itm_sub1());
		bindR.itm_sub2(dtlR.itm_sub2());
		bindR.itm_sub3(dtlR.itm_sub3());
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
	
		MAM_LOC_R locR = getCacheLoc(dtlR.in_to_loc_cd());
		if (!isNull(locR)) {
			bindR.wg_cd(locR.wg_cd());
		}
		
		// 適用開始日・終了日との比較に使用
		if (isSame(_sysParm, "1")) {
			bindR.st_dt(dtlR.rqst_avl_rqst_dt());
		}
		else {
			bindR.st_dt(dtlR.po_dt());
		}
		return bindR;
	}

	/** 支給単価 */
	protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _cacheProvUpri = null;
	
	protected static final Class<MSBDL_PoRegService> CLAZZ = MSBDL_PoRegService.class;
	
	/**
	 * キャッシュ取得（品目）
	 * @param dtlR
	 * @return
	 */
	protected MAM_ITM_R getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3){
		return object(CLAZZ)._getCacheItm(itmCd, itmSub1, itmSub2, itmSub3);
	}
	/**
	 * キャッシュ取得（場所）
	 * @param dtlR
	 * @return
	 */
	protected MAM_LOC_R getCacheLoc(String locCd){
		return object(CLAZZ)._getCacheLoc(locCd);
	}
	/**
	 * キャッシュ取得（製造場所）
	 */
	protected MAM_LOC_R getCacheMfgLoc(String mfgLocCd){
		return object(CLAZZ)._getCacheMfgLoc(mfgLocCd);
	}
	/**
	 * キャッシュ取得（取引先）
	 * @param dtlR
	 * @return
	 */
	protected MAM_BP_R getCacheBp(String bpCd){
		return object(CLAZZ)._getCacheBp(bpCd);
	}
	/**
	 * キャッシュ取得（伝票帳票）
	 */
	protected MAM_SLIP_FORM_R getCacheSlipForm(String formCd){
		return object(CLAZZ)._getCacheSlipForm(formCd);
	}
	/**
	 * キャッシュ取得（入荷進捗）
	 * @param dtlR
	 * @return
	 */
	protected static MST_ARR_PR_R getCacheArrPr(String po_d_no){
		return object(CLAZZ)._getCacheArrPr(po_d_no);
	}
	
	/**
	 * キャッシュ取得（入荷予定）
	 * @param dtlR
	 * @return
	 */
	protected static MCList<MST_ARR_SCHD_R> getCacheArrSchd(String arrPrNo){
		return object(CLAZZ)._getCacheArrSchd(arrPrNo);
	}

	/**
	 * キャッシュ取得（発注）
	 */
	protected static MST_PO_R getCachePo(String poNo) {
		return object(CLAZZ)._getCachePo(poNo);
	}
	
	/**
	 * キャッシュ取得（発注明細）
	 */
	protected static MST_PO_D_R getCachePoD(String poDNo) {
		return object(CLAZZ)._getCachePoD(poDNo);
	}
	//-----------------------------------------------
	// Cache作成
	//-----------------------------------------------
	/**
	 * キャッシュ作成（発注ヘッダ）
	 * @param dtl2L
	 */
	protected void createCachePo(MCList<Po_Ins01_HdrR> hdrL) {
		MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
		_cachePo = new FXUCL_MCDbcCache<MST_PO_R>(poL_bldr, -1, hdrL.groupBy(MST_PO_D_R.$po_no), MST_PO_R.$po_no);
	}
	/**
	 * キャッシュ作成（発注明細）
	 * @param dtl2L
	 */
	protected void createCachePoD(MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
		_cachePoD = new FXUCL_MCDbcCache<MST_PO_D_R>(poDL_bldr, -1, dtl2L.groupBy(MST_PO_D_R.$po_d_no), MST_PO_D_R.$po_d_no);
	}
	/**
	 * キャッシュ作成（品目）
	 * @param dtlL
	 */
	protected void createCacheItm(MCList<Po_Ins01_DtlR> dtlL) {
		
		MCList<Po_Ins01_DtlR> bindL = MCList.create(Po_Ins01_DtlR.class);
		for (Po_Ins01_DtlR r : dtlL) {
			if (isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
				MST_PO_D_R poDR = getCachePoD(r.po_d_no());
				if (!isNull(poDR)) {
					Po_Ins01_DtlR dtlR = Po_Ins01_DtlR.create();
					dtlR.itm_cd(poDR.itm_cd());
					dtlR.itm_sub1(poDR.itm_sub1());
					dtlR.itm_sub2(poDR.itm_sub2());
					dtlR.itm_sub3(poDR.itm_sub3());
					bindL.add(dtlR);
				}
			}
			else {
				bindL.add(r);
			}
		}
		
		MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, bindL, Po_Ins01_DtlR.$itm_cd, Po_Ins01_DtlR.$itm_sub1, Po_Ins01_DtlR.$itm_sub2, Po_Ins01_DtlR.$itm_sub3);
	}
	/**
	 * キャッシュ作成（取引先）
	 * @param dtlL
	 */
	protected void createCacheBp(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL) {
		MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
		for (MAM_LOC_R r : _cacheLoc.groupBy(MAM_LOC_R.$sppl_cd)) {
			MAM_BP_R bpR = MAM_BP_R.create();
			bpR.bp_cd(r.sppl_cd());
			bindL.add(bpR);
		}
		for (Po_Ins01_HdrR r : hdrL.groupBy(Po_Ins01_HdrR.$sppl_cd)) {
			MAM_BP_R bpR = MAM_BP_R.create();
			bpR.bp_cd(r.sppl_cd());
			bindL.add(bpR);
		}
		for (Po_Ins01_DtlR dtlR : dtlL) {
			if (!isNullAnd(dtlR.tdlv_cd(), dtlR.dlv_cd())) {
				bindL.add().bp_cd(getPurcDdlvTgt(dtlR));
			}
		}
		MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
		_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, bindL.groupBy(MAM_BP_R.$bp_cd), MAM_BP_R.$bp_cd);
	}
	protected void createCacheSlipForm(MCList<Po_Ins01_HdrR> hdrL) {
		MCList<MAM_SLIP_FORM_R> bindL = MCList.create(MAM_SLIP_FORM_R.class);
		for (Po_Ins01_HdrR r : hdrL.groupBy(Po_Ins01_HdrR.$sppl_cd)) {
			MAM_BP_R bpR = _cacheBp.get(r.sppl_cd());
			if (!isNull(bpR.sppl_ship_form_cd())) {
				bindL.add().slip_form_cd(bpR.sppl_ship_form_cd());
			}
		}
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MAM_SLIP_FORM_R.create("T"));
		_cacheSlipForm = new FXUCL_MCDbcCache<MAM_SLIP_FORM_R>(
			bldr, bindL.groupBy(MAM_SLIP_FORM_R.$slip_form_cd), MAM_SLIP_FORM_R.$slip_form_cd);
	}
	
	/**
	 * キャッシュ作成（場所）
	 * @param dtlL
	 */
	protected void createCacheLoc(MCList<Po_Ins01_DtlR> dtlL) {
		MCList<Po_Ins01_DtlR> bindL = MCList.create(Po_Ins01_DtlR.class);
		bindL.addAll(dtlL);
		
		// 訂正前の発注明細の納入場所をbindLに追加
		for (Po_Ins01_DtlR r : dtlL) {
			MST_PO_D_R poDR = getCachePoD(r.po_d_no());
			if (!isNull(poDR.in_to_loc_cd())) {
				Po_Ins01_DtlR dtlR = Po_Ins01_DtlR.create();
				dtlR.in_to_loc_cd(poDR.in_to_loc_cd());
				bindL.add(dtlR);
			}
		}
		
		// 発注予定の納入場所をbindLに追加
		for (MST_PO_SCHD_R poSchdR : _cachePoSchd) {
			Po_Ins01_DtlR dtlR = Po_Ins01_DtlR.create();
			dtlR.in_to_loc_cd(poSchdR.in_to_loc_cd());
			bindL.add(dtlR);
		}
		bindL = bindL.distinctNE(Po_Ins01_DtlR.$in_to_loc_cd);
		
		_cacheLoc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R cacheLoc_t = MAM_LOC_R.create("T");
		MCQueryApiBuilder cacheLoc_bldr = MCQueryApiBuilder.create(cacheLoc_t);
		cacheLoc_bldr.setWhere(cacheLoc_t.loc_cd.eq(bind("in_to_loc_cd")));
		dbSelect("MSBDL5100_MAM_LOC_S01", _cacheLoc, cacheLoc_bldr, bindL);
		_idxCacheLoc = _cacheLoc.createIndex(MAM_LOC_R.$loc_cd);
	}
	protected void createCacheMfgLoc(MCList<Po_Ins01_DtlR> dtlL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
		locL_bldr.setSelect(
				t.loc_cd,
				t.sppl_cd,
				t.maker_cd);
		_cacheMfgLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(
				locL_bldr,
				dtlL,
				Po_Ins01_DtlR.$mfg_loc_cd);
	}
	
	/**
	 * キャッシュ作成（支給単価）
	 * @param bindL
	 */
	protected void createCacheProvUpri(MCList<MAM_PROV_UPRI_R> bindL) {
		MCQueryApiBuilder provUpriL_bldr = MCQueryApiBuilder.create(MAM_PROV_UPRI_R.create("T"));
		_cacheProvUpri = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
				provUpriL_bldr,
				bindL,
				MAM_PROV_UPRI_R.$itm_cd,
				MAM_PROV_UPRI_R.$itm_sub1,
				MAM_PROV_UPRI_R.$itm_sub2,
				MAM_PROV_UPRI_R.$itm_sub3,
				MAM_PROV_UPRI_R.$prsppl_cd,
				MAM_PROV_UPRI_R.$cur_cd,
				MAM_PROV_UPRI_R.$wg_cd);
	}
	
	protected void createCachePoSchd(MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		object(CLAZZ)._createCachePoSchd(dtlL, dtl2L);
	}
	
	/**
	 * キャッシュ作成（発注予定）
	 * @param dtlL
	 * @param dtl2L
	 */
	protected void _createCachePoSchd(MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		// 明細に紐付く発注予定を取得
		MCList<MST_PO_SCHD_R> poSchdLByPoDNo = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R t1 = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder poSchdLByPoDNo_bldr = MCQueryApiBuilder.create(t1);
		poSchdLByPoDNo_bldr.setWhere(t1.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL5100_MST_PO_SCHD_S01", poSchdLByPoDNo, poSchdLByPoDNo_bldr, dtlL);
		_cachePoSchd.addAll(poSchdLByPoDNo);
		
		// まとめた場合の、まとめた明細に紐付く発注予定を取得
		MCList<MST_PO_SCHD_R> poSchdLByPoSchdDNo = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R t2 = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder poSchdLByPoSchdDNo_bldr = MCQueryApiBuilder.create(t2);
		poSchdLByPoSchdDNo_bldr.setWhere(t2.po_schd_no.eq(bind("po_schd_no")));
		dbSelect("MSBDL5100_MST_PO_SCHD_S02", poSchdLByPoSchdDNo, poSchdLByPoSchdDNo_bldr, dtl2L);
		
		// 発注予定ＮＯが重複しないようにキャッシュを作成
		MCList<MST_PO_SCHD_R> tmpL = poSchdLByPoSchdDNo.subList(new MCRowMatcher<MST_PO_SCHD_R>() {
			MCIndexKey _index = poSchdLByPoDNo.createIndex(MST_PO_SCHD_R.$po_schd_no);
			public boolean match (MST_PO_SCHD_R m) {
				if (poSchdLByPoDNo.subList(_index, m.po_schd_no()).size() > 0) {
					return false;
				}
				else {
					return true;
				}
			}
		});
		_cachePoSchd.addAll(tmpL);
		_idxCachePoSchdPoSchdNo = _cachePoSchd.createIndex(MST_PO_SCHD_R.$po_schd_no);
		_idxCachePoSchdPoDNo = _cachePoSchd.createIndex(MST_PO_SCHD_R.$po_d_no);
	}
	
	protected void createCacheSlo() {
		object(CLAZZ)._createCacheSlo();
	}

	/**
	 * キャッシュ作成（受注ヘッダ）
	 */
	protected void _createCacheSlo() {
		_cacheSlo = MCList.create(MST_SLO_R.class);
		MST_SLO_R cacheSlo_t = MST_SLO_R.create("T");
		MCQueryApiBuilder cacheSlo_bldr = MCQueryApiBuilder.create(cacheSlo_t);
		cacheSlo_bldr.setWhere(cacheSlo_t.slo_no.eq(bind("slo_no")));
		dbSelect("MSBDL5100_MST_SLO_S01", _cacheSlo, cacheSlo_bldr, _cachePoSchd);
		_idxCacheSlo = _cacheSlo.createIndex(MST_SLO_R.$slo_no);
	}
	/**
	 * キャッシュ作成（入荷進捗）
	 */
	protected void createCacheArrPr(MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		_cacheArrPr = MCList.create(MST_ARR_PR_R.class);
		MST_ARR_PR_R cacheArrPr_t = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder cacheArrPr_bldr = MCQueryApiBuilder.create(cacheArrPr_t);
		cacheArrPr_bldr.setWhere(cacheArrPr_t.po_d_no.eq(bind("po_d_no")));
		dbSelect("MSBDL5100_MST_ARR_PR_S01", _cacheArrPr, cacheArrPr_bldr, dtl2L);
		_idxCacheArrPr = _cacheArrPr.createIndex(MST_ARR_PR_R.$po_d_no);
	}
	/**
	 * キャッシュ作成（入荷予定）
	 */
	protected void createCacheArrSchd() {
		MST_PURC_SCHD_R purc = MST_PURC_SCHD_R.create("PURC");
		MST_PO_R po = MST_PO_R.create("PO");
		MST_PO_D_R poD = MST_PO_D_R.create("POD");
		MST_ARR_PR_R arrPr = MST_ARR_PR_R.create("ARRPR");
		MAM_BP_R bp = MAM_BP_R.create("M1");
		MST_ARR_SCHD_R arrSchdCache_t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder arrSchdCache_bldr = MCQueryApiBuilder.create(arrSchdCache_t);
		arrSchdCache_bldr.addSelect(purc.purc_schd_dt);
		arrSchdCache_bldr.addSelect(purc.purc_schd_no);
		arrSchdCache_bldr.addSelect(purc.trd_unit_schd_qty);
		arrSchdCache_bldr.addSelect(purc.base_unit_schd_qty);
		_arrSchdCache.addBooleanColumn("non_purc_flg");
		_arrSchdCache.addBooleanColumn("purc_abort_flg");
		_arrSchdCache.addBooleanColumn("sppl_iv_flg");
		arrSchdCache_bldr.addSelect(purc.base_unit_accpt_dfct_qty);
		arrSchdCache_bldr.addSelect(purc.non_purc_flg);
		arrSchdCache_bldr.addSelect(purc.abort_flg.as("purc_abort_flg"));
		arrSchdCache_bldr.addSelect(po.xrate);
		arrSchdCache_bldr.addSelect(bp.sppl_iv_flg);
		arrSchdCache_bldr.addSelect(po.ptax_xrate);
		arrSchdCache_bldr.addSelect(po.trd_cur_cd);
		arrSchdCache_bldr.addSelect(poD.trd_cur_upri);
		arrSchdCache_bldr.setWhere(arrSchdCache_t.arr_pr_no.eq(bind("arr_pr_no")));
		arrSchdCache_bldr.addLeftOuterJoin(purc, arrSchdCache_t.arr_schd_no.eq(purc.arr_schd_no));
		arrSchdCache_bldr.addLeftOuterJoin(arrPr, arrSchdCache_t.arr_pr_no.eq(arrPr.arr_pr_no));
		arrSchdCache_bldr.addLeftOuterJoin(poD, arrPr.po_d_no.eq(poD.po_d_no));
		arrSchdCache_bldr.addLeftOuterJoin(po, poD.po_no.eq(po.po_no));
		arrSchdCache_bldr.addLeftOuterJoin(bp, po.sppl_cd.eq(bp.bp_cd));
		dbSelect("MSBDL5100_MST_ARR_SCHD_S01", _arrSchdCache, arrSchdCache_bldr, _cacheArrPr);
		_idxCacheArrSchd = _arrSchdCache.createIndex(MST_ARR_SCHD_R.$arr_pr_no);
	}
	
	/**
	 * キャッシュ作成（品目オーダ）
	 * @param dtlL
	 */
	protected void createCacheItmOrder(MCList<Po_Ins01_Bndl_DtlR> dtlL) {
		// 検索条件を発注予定主キーワークに登録
		MCList<MST_PO_SCHD_R> wkL = MCList.create(MST_PO_SCHD_R.class);
		for (Po_Ins01_Bndl_DtlR r : dtlL) {
			if (isNull(r.po_schd_no())) {
				continue;
			}
			MST_PO_SCHD_R wkR = MST_PO_SCHD_R.create();
			wkR.po_schd_no(r.po_schd_no());
			wkL.add(wkR);
		}
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_SCHD_R.create("T"));
		dbWkDelete("MSBDL5100_MSW_PO_SCHD_D01", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBDL5100_MSW_PO_SCHD_I01", wkL, wkL_bldr.getBaseDbc());
		
		// 明細に紐付く発注予定を取得
		MST_PO_SCHD_R po_schd = MST_PO_SCHD_R.create("PO_SCHD");
		MSW_PO_SCHD_KEY_R w_po_schd = MSW_PO_SCHD_KEY_R.create("W_PO_SCHD");
		
		MCList<MST_ITM_ORDER_R> itmOrder = MCList.create(MST_ITM_ORDER_R.class);
		MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
		MCQueryApiBuilder itmOrder_bldr = MCQueryApiBuilder.create(t);
		itmOrder_bldr.addSelect(po_schd.po_schd_no);
		itmOrder_bldr.addInnerJoin(po_schd, po_schd.pln_itm_ord_no.eq(t.itm_ord_no));
		itmOrder_bldr.addInnerJoin(w_po_schd, po_schd.po_schd_no.eq(w_po_schd.po_schd_no));
		itmOrder_bldr.addWhereWithAnd(t.ord_gnrt_typ.neq(value(MSC_ORD_GNRT_TYP.UPLND.value())));
		dbSelect("MSBDL5100_MST_ITM_ORDER_S01", itmOrder, itmOrder_bldr);
		_cacheItmOrder.addAll(itmOrder);
		_idxCacheItmOrder = _cacheItmOrder.createIndex("po_schd_no");
	}
	//-----------------------------------------------
	// Cache取得
	//-----------------------------------------------
	/**
	 * キャッシュ取得（発注ヘッダ）
	 */
	protected MST_PO_R _getCachePo(String poNo) {
		return _cachePo.get(poNo);
	}
	/**
	 * キャッシュ取得（発注明細）
	 */
	protected MST_PO_D_R _getCachePoD(String poDNo) {
		return _cachePoD.get(poDNo);
	}
	/**
	 * キャッシュ取得（取引先）
	 */
	protected MAM_BP_R _getCacheBp(String bpCd) {
		return _cacheBp.get(bpCd);
	}
	/**
	 * キャッシュ取得（伝票帳票）
	 */
	protected MAM_SLIP_FORM_R _getCacheSlipForm(String formCd) {
		return _cacheSlipForm.get(formCd);
	}
	/**
	 * キャッシュ取得（場所）
	 */
	protected MAM_LOC_R _getCacheLoc(String locCd) {
		return _cacheLoc.getFirst(_idxCacheLoc, locCd);
	}
	/**
	 * キャッシュ取得（製造場所）
	 */
	protected MAM_LOC_R _getCacheMfgLoc(String mfgLocCd) {
		return _cacheMfgLoc.get(mfgLocCd);
	}
	
	protected MST_SLO_R getCacheSlo(String sloNo) {
		return object(CLAZZ)._getCacheSlo(sloNo);
	}
	
	/**
	 * キャッシュ取得（受注ヘッダ）
	 */
	protected MST_SLO_R _getCacheSlo(String sloNo) {
		MST_SLO_R sloR = _cacheSlo.getFirst(_idxCacheSlo, sloNo);
		if (sloR == null) {
			return MST_SLO_R.create();
		}
		else {
			return sloR;
		}
	}
	
	protected MCList<MST_PO_SCHD_R> getCachePoSchdByPoDNo(String poDNo){
		return object(CLAZZ)._getCachePoSchdByPoDNo(poDNo);
	}
	
	protected MST_PO_SCHD_R getCachePoSchdByPoSchdNo(String poSchdNo){
		return object(CLAZZ)._getCachePoSchdByPoSchdNo(poSchdNo);
	}
	
	/**
	 * キャッシュ取得（発注予定）
	 * @param poDNo
	 * @return
	 */
	protected MCList<MST_PO_SCHD_R> _getCachePoSchdByPoDNo(String poDNo){
		MCList<MST_PO_SCHD_R> poSchdL = _cachePoSchd.subList(_idxCachePoSchdPoDNo, poDNo);
		if (poSchdL == null) {
			return MCList.create(MST_PO_SCHD_R.class);
		}
		else {
			return poSchdL;
		}
	}
	/**
	 * キャッシュ取得（発注予定）
	 * @param poSchdNo
	 * @return
	 */
	protected MST_PO_SCHD_R _getCachePoSchdByPoSchdNo(String poSchdNo){
		MST_PO_SCHD_R poSchdR = _cachePoSchd.getFirst(_idxCachePoSchdPoSchdNo, poSchdNo);
		if (poSchdR == null) {
			return MST_PO_SCHD_R.create();
		}
		else {
			return poSchdR;
		}
	}
	/**
	 * キャッシュ取得（品目オーダ）
	 * @param poSchdNo
	 * @return
	 */
	protected MST_ITM_ORDER_R getCacheItmOrder(String poSchdNo){
		MST_ITM_ORDER_R itmOrderR = _cacheItmOrder.getFirst(_idxCacheItmOrder, poSchdNo);
		if (itmOrderR == null) {
			return MST_ITM_ORDER_R.create();
		}
		else {
			return itmOrderR;
		}
	}
	/**
	 * キャッシュ取得（入荷進捗）
	 * @param dtlR
	 * @return
	 */
	protected MST_ARR_PR_R _getCacheArrPr(String po_d_no){
		MST_ARR_PR_R arrPrR = _cacheArrPr.getFirst(_idxCacheArrPr, po_d_no);
		if (arrPrR == null) {
			return arrPrR;
		}
		else {
			return arrPrR;
		}
	}
	/**
	 * キャッシュ取得（入荷予定）
	 * @param dtlR
	 * @return
	 */
	protected MCList<MST_ARR_SCHD_R> _getCacheArrSchd(String arrPrNo){
		MCList<MST_ARR_SCHD_R> arrSchdL = _arrSchdCache.subList(_idxCacheArrSchd, arrPrNo);
		if (arrSchdL == null) {
			return MCList.create(MST_ARR_SCHD_R.class);
		}
		else {
			return arrSchdL;
		}
	}
	/**
	 * キャッシュ取得（品目）
	 * @param dtlR
	 * @return
	 */
	protected MAM_ITM_R _getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3){
		return _cacheItm.getEx(itmCd, itmSub1, itmSub2, itmSub3);
	}
	/**
	 * Po_Chk01オペレーション.<p>
	 *
	 * 更新前チェック<br>
	 */
	public class Po_Chk01 extends MSBDL_PoRegService_MC_A.Po_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			setHdrToDtl();
			doDataCache(up0(), up1(), up2());
			complete();
			chk();
			down0().addAll(up0());
			down1().addAll(up1());
		}
		
		protected void setHdrToDtl() {
			MCIndexKey _idxUp1 = up1().createIndex(Po_Ins01_DtlR.$hdr_peg_no);
			for (Po_Ins01_HdrR hdrR : up0()) {
				MCList<Po_Ins01_DtlR> dtlL = up1().subList(_idxUp1, hdrR.peg_no());
				for (Po_Ins01_DtlR dtlR : dtlL) {
					copyHdrToDtl(hdrR, dtlR);
				}
			}
		}
		
		/**
		 * キャッシュをリクエストスコープに保存します
		 * @param dtlL
		 */
		protected void doDataCache(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL,  MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
			object(CLAZZ).createCacheArrPr(dtl2L);
			object(CLAZZ).createCacheArrSchd();
			object(CLAZZ).createCachePo(hdrL);
			object(CLAZZ).createCachePoD(dtl2L);
			object(CLAZZ).createCacheItm(dtlL);
			createCachePoSchd(dtlL, dtl2L);
			object(CLAZZ).createCacheLoc(dtlL);
			object(CLAZZ).createCacheBp(hdrL, dtlL);
			object(CLAZZ).createCacheSlipForm(hdrL);
			object(CLAZZ).createCacheProvUpri(createBindProvUpri(dtlL));
			createCacheSlo();
			object(CLAZZ).createCacheMfgLoc(dtlL);
			object(CLAZZ).createPurcDdlvLtCache(dtlL);
			object(CLAZZ).createProvSchdCache(dtlL);
			object(CLAZZ).createArrActCacheByMfgInstNo();
			object(CLAZZ).createCacheSlipForm(hdrL);
		}

		protected void complete() {
			for (Po_Ins01_Bndl_DtlR dtl2R : up2()) {
				MST_PO_SCHD_R poSchdR = getCachePoSchdByPoSchdNo(dtl2R.po_schd_no());
				if (!isNull(poSchdR)) {
					MST_SLO_R sloR = getCacheSlo(poSchdR.slo_no());
					dtl2R.slo_no(sloR.slo_no());
					dtl2R.aprv_no(sloR.aprv_no());
				}
			}
			for (Po_Ins01_DtlR dtlR : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) && isNull(dtlR.po_schd_no()) 
						&& dtlR.outsrc_flg() && !dtlR.bndl_flg()) {
					dtlR.uplnd_outsrc_flg(true);
				}
			}
		}
		
		
		protected void chk() {
			callOrdRegChkSV();
			thisChk();
			callAprvChk();
			callOutsrcInstChk01();
			callArrSchdChk01();
			callSundryItmChk01();
			callAprvNextChk(up1(), up2());
		}
		protected void callOrdRegChkSV() {
			object(CLAZZ)._ordChkDtl1Cache = null;
			MCList<Po_Ins01_DtlR> tgtL = up1().subList(Po_Ins01_DtlR.$uplnd_outsrc_flg, true);
			if (tgtL.isEmpty()) {
				return;
			}
			
			MSBCL_OrdRegService.Ord_Chk01 ordChk01 = MSBCL_OrdRegService.crtOrd_Chk01();
			addAll(ordChk01.up0(), tgtL, createMap_Ord_Upd01_Dtl1R_Po_Ins01_DtlR());
			
			for (Po_Ins01_DtlR dtlR : up1()) {
				MSBCL_OrdRegService.Ord_Sprt03 calc = MSBCL_OrdRegService.crtOrd_Sprt03();
				if (dtlR.uplnd_outsrc_flg()) {
					// 予定日計算
					Ord_Sprt03_DtlR calcUp0 = Ord_Sprt03_DtlR.create();
					copy(calcUp0, dtlR, createMap_Ord_Sprt03_DtlR_Po_Ins01_DtlR());
					calc.up0().add(calcUp0);
					calc.exec();
					String[] destCols = new String[] {
							Ord_Upd01_Dtl1R.$purc_lt,
							Ord_Upd01_Dtl1R.$mfg_st_schd_dt,
							Ord_Upd01_Dtl1R.$mfg_end_schd_dt,
							Ord_Upd01_Dtl1R.$mfg_lt,
							Ord_Upd01_Dtl1R.$gi_schd_dt,
							Ord_Upd01_Dtl1R.$strg_schd_dt,
							Ord_Upd01_Dtl1R.$xfr_lt,
							Ord_Upd01_Dtl1R.$accpt_schd_dt,
							Ord_Upd01_Dtl1R.$accpt_insp_lt,
							Ord_Upd01_Dtl1R.$insp_st_schd_dt,
							Ord_Upd01_Dtl1R.$insp_end_schd_dt,
							Ord_Upd01_Dtl1R.$insp_lt,
							Ord_Upd01_Dtl1R.$insp_offst,
							Ord_Upd01_Dtl1R.$avl_schd_dt};
					
					String[] srcCols = new String[] {
							Ord_Sprt03_RsltR.$purc_lt,
							Ord_Sprt03_RsltR.$mfg_st_schd_dt,
							Ord_Sprt03_RsltR.$mfg_end_schd_dt,
							Ord_Sprt03_RsltR.$mfg_lt,
							Ord_Sprt03_RsltR.$gi_schd_dt,
							Ord_Sprt03_RsltR.$strg_schd_dt,
							Ord_Sprt03_RsltR.$xfr_lt,
							Ord_Sprt03_RsltR.$accpt_schd_dt,
							Ord_Sprt03_RsltR.$accpt_insp_lt,
							Ord_Sprt03_RsltR.$insp_st_schd_dt,
							Ord_Sprt03_RsltR.$insp_end_schd_dt,
							Ord_Sprt03_RsltR.$insp_lt,
							Ord_Sprt03_RsltR.$insp_offst,
							Ord_Sprt03_RsltR.$avl_schd_dt};
					copyByPegNo(ordChk01.up0(), destCols, calc.down0(), srcCols);
				}
			}
			
			if (!ordChk01.up0().isEmpty()) {
				ordChk01.exec();
			}
			// 結果をキャッシュ
			object(CLAZZ)._ordChkDtl1Cache = MCList.create(Ord_Upd01_Dtl1R.class);
			object(CLAZZ)._ordChkDtl1Cache.addAll(ordChk01.down0());
		}
		protected Map_Ord_Upd01_Dtl1R_Po_Ins01_DtlR<Ord_Upd01_Dtl1R, Po_Ins01_DtlR> createMap_Ord_Upd01_Dtl1R_Po_Ins01_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Po_Ins01_DtlR<Ord_Upd01_Dtl1R, Po_Ins01_DtlR>();
		}

		public class Map_Ord_Upd01_Dtl1R_Po_Ins01_DtlR<D extends Ord_Upd01_Dtl1R, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Po_Ins01_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Po_Ins01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Po_Ins01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Po_Ins01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Po_Ins01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Po_Ins01_DtlR.$ver_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Po_Ins01_DtlR.$in_to_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Po_Ins01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Po_Ins01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Po_Ins01_DtlR.$base_unit_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, Po_Ins01_DtlR.$base_unit_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, Po_Ins01_DtlR.$po_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Po_Ins01_DtlR.$po_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Po_Ins01_DtlR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Po_Ins01_DtlR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Po_Ins01_DtlR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Po_Ins01_DtlR.$sno4);
				addColumnPathMap(Ord_Upd01_Dtl1R.$uplnd_outsrc_flg, Po_Ins01_DtlR.$uplnd_outsrc_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.mrp_typ(MSC_MRP_TYP.MRP.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.oper_ord_pr_flg(true);
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				dest.ord_gnrt_typ(MSC_ORD_GNRT_TYP.UPLND.value());
				dest.mst_mfg_loc_cd(MAC_STR.NULL_VAL.value());
				dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				dest.oper_ptn(MAC_STR.NULL_VAL.value());
				dest.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				MAM_LOC_R locR = getCacheLoc(src.in_to_loc_cd());
				dest.wg_cd(locR.wg_cd());
			}
		}

		protected Map_Ord_Sprt03_DtlR_Po_Ins01_DtlR<Ord_Sprt03_DtlR,Po_Ins01_DtlR> createMap_Ord_Sprt03_DtlR_Po_Ins01_DtlR() {
			return new Map_Ord_Sprt03_DtlR_Po_Ins01_DtlR<Ord_Sprt03_DtlR, Po_Ins01_DtlR>();
		}
		public class Map_Ord_Sprt03_DtlR_Po_Ins01_DtlR<D extends Ord_Sprt03_DtlR, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, Po_Ins01_DtlR.$peg_no);
				addColumnPathMap(Ord_Sprt03_DtlR.$po_schd_dt, Po_Ins01_DtlR.$po_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$avl_schd_dt, Po_Ins01_DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, Po_Ins01_DtlR.$po_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, Po_Ins01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, Po_Ins01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, Po_Ins01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, Po_Ins01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, Po_Ins01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, Po_Ins01_DtlR.$sppl_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, Po_Ins01_DtlR.$maker_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, Po_Ins01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, Po_Ins01_DtlR.$in_to_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, Po_Ins01_DtlR.$base_unit_qty);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, Po_Ins01_DtlR.$rqst_dlv_rqst_tm);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			}
		}
		/**
		 * 本ＳＶのチェック処理
		 */
		protected void thisChk() {
			MCIndexKey idxUp2 = up2().createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			for (Po_Ins01_HdrR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 伝票ごとの合計金額を算出
					MCNumber ttlAmt = calcTtlAmt(r);
					if (ttlAmt.lt(MCNumber.ZERO)) {
						MCMessagePool.add(new MCMessage(r, null, MSBDL0153));
						r.err_flg(true);
					}
				}
			}
			for (Po_Ins01_DtlR dtlR : up1()) {
				if (isNull(dtlR.po_d_no()) && dtlR.outsrc_flg()) {
					MAM_LOC_R mfgLocR = getCacheMfgLoc(dtlR.mfg_loc_cd());
					if (!(isSame(mfgLocR.sppl_cd(), dtlR.sppl_cd())
							&& isSame(nvl(mfgLocR.maker_cd(), MAC_STR.NULL_VAL.value()),
									nvl(dtlR.maker_cd(), MAC_STR.NULL_VAL.value())))) {
						MCMessagePool.add(new MCMessage(dtlR, Po_Ins01_DtlR.$sppl_cd,
								MSBDL0202, dtlR.sppl_cd(), dtlR.maker_cd(),
								mfgLocR.sppl_cd(), mfgLocR.maker_cd(),
								toDispGUIIndex(dtlR)));
						dtlR.err_flg(true);
					}
				}
				if(dtlR.outsrc_flg() && !MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					// 単価≠有償支給単価＋加工単価の場合はエラー
					MCNumber upri = nvl(dtlR.trd_cur_proc_upri(), MCNumber.ZERO).add(nvl(dtlR.trd_cur_onr_prov_upri(), MCNumber.ZERO));
					if(!isSame(nvl(dtlR.trd_cur_upri(), MCNumber.ZERO), upri)) {
						MCMessagePool.add(new MCMessage(dtlR, Po_Ins01_DtlR.$trd_cur_upri , MSBDL0501, upri, dtlR.trd_cur_upri(), toDispGUIIndex(dtlR)));
						dtlR.err_flg(true);
					}
				}
				// 仕入直送発注（納品先 IS NOT NULL）かつデータ更新区分が新規の場合
				if (!isNull(dtlR.dlv_cd())
						&& MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					// 受注ヘッダを取得
					MST_SLO_R sloR = getCacheSlo(dtlR.slo_no());
					// 受注区分が「仮受注」の場合はエラー
					if (!isNull(sloR) && MSC_SLO_TYP.isPRE_SLO(sloR.slo_typ())) {
						MCMessagePool.add(new MCMessage(dtlR, null, MSBDL0204,
								dtlR.slo_no(), toDispGUIIndex(dtlR)));
						dtlR.err_flg(true);
					}
					if (MSC_ADV_SHIP_CTRL_TYP.isSHIP_STOP(sloR.adv_ship_ctrl_typ())) {
						if (sloR.adv_bill_amt().gt(MCNumber.ZERO)) {
							if (isNull(sloR.adv_rcv_amt())
									|| sloR.adv_rcv_amt().lt(sloR.adv_bill_amt())) {
								MCMessagePool.add(new MCMessage(dtlR, null, MSBDL0302,
										dtlR.slo_no(), toDispGUIIndex(dtlR)));
								dtlR.err_flg(true);
							}
						}
					}
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					MST_PO_D_R poDR = getCachePoD(dtlR.po_d_no());
					FXUCL_MCDbcCache<MAM_ITM_R> cacheItm = object(CLAZZ)._cacheItm;
					
					MAM_ITM_R itmR = cacheItm.get(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
					if (itmR.isEmpty()) {
						MCMessagePool.add(new MCMessage(dtlR, null, MAUAL0189
								, toDispItm(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3())
								, toDispGUIIndex(dtlR)));
						dtlR.err_flg(true);
					}
				}
				// 訂正・削除前の納入場所の論理削除チェック(発注明細)
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					MST_PO_D_R poDR = getCachePoD(dtlR.po_d_no());
					MAM_LOC_R locR = getCacheLoc(poDR.in_to_loc_cd());
					if (isNull(locR)) {
						if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							MCMessagePool.add(new MCMessage(dtlR, null, MSBDL0304, poDR.in_to_loc_cd(), toDispGUIIndex(dtlR)));
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							MCMessagePool.add(new MCMessage(dtlR, null, MSBDL0306, poDR.in_to_loc_cd(), toDispGUIIndex(dtlR)));
						}
						dtlR.err_flg(true);
					}
				}
				
				// 発注予定の納入場所の論理削除チェック
				MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.create());
				if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					poSchdL = getCachePoSchdByPoDNo(dtlR.po_d_no());
				}
				else {
					// 予定まとめを考慮
					for (Po_Ins01_Bndl_DtlR up2 : up2().subList(idxUp2, dtlR.peg_no())) {
						poSchdL.add(getCachePoSchdByPoSchdNo(up2.po_schd_no()));
					}
				}
				
				for (MST_PO_SCHD_R poSchdR : poSchdL) {
					if (isNull(poSchdR.in_to_loc_cd())) {
						continue;
					}
					MAM_LOC_R locR = getCacheLoc(poSchdR.in_to_loc_cd());
					if (isNull(locR)) {
						MCMessagePool.add(new MCMessage(dtlR, null, MSBDL0305, poSchdR.in_to_loc_cd(), toDispGUIIndex(dtlR)));
						dtlR.err_flg(true);
					}
				}
				
				// 仕入計上区分チェック
				if (!isNull(dtlR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(dtlR.purc_basis_typ())) {
					if (MAC_PURC_BASIS_TYP.isARR_BASIS(dtlR.purc_basis_typ())
							&& (isNullOr(dtlR.dlv_rqst_tm(), dtlR.purc_schd_dt())
									|| !dtlR.dlv_rqst_tm().eqDate(dtlR.purc_schd_dt()))) {
						MCMessagePool.add(new MCMessage(dtlR, null, MSBDL0410, toDispGUIIndex(dtlR)));
						dtlR.err_flg(true);
					}
					if (MAC_PURC_BASIS_TYP.isARR_BASIS(dtlR.purc_basis_typ()) && !dtlR.sync_flg()) {
						MCMessagePool.add(new MCMessage(dtlR, null, MSBDL0411, toDispGUIIndex(dtlR)));
						dtlR.err_flg(true);
					}
					if (MAC_PURC_BASIS_TYP.isIN_BASIS(dtlR.purc_basis_typ()) && dtlR.sync_flg()) {
						MCMessagePool.add(new MCMessage(dtlR, null, MSBDL0412, toDispGUIIndex(dtlR)));
						dtlR.err_flg(true);
					}
				}
			}
		}
		/**
		 * 承認サービスのチェック処理を呼び出します。
		 */
		protected void callAprvChk () {
			MBBAL_AprvService.Aprv_Chk01 opeUpd = MBBAL_AprvService.crtAprv_Chk01();
			MBBAL_AprvService.Aprv_Chk04 opeDel = MBBAL_AprvService.crtAprv_Chk04();
			for (Po_Ins01_HdrR r : up0()) {
				
				// 更新・削除時のみチェック
				if (isNull(r.po_no())) {
					continue;
				}
				
				// 承認ＮＯを取得
				MST_PO_R poR = getCachePo(r.po_no());
				if (isNull(poR.aprv_no())) {
					continue;
				}
				
				// 更新時、承認引戻ＦＬＧがオフの場合、承認状況区分が一次承認済か最終承認済ならチェックしない
				// 承認に関する項目は画面側で変更できないように制御する前提
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
						&& !r.aprv_rvrs_flg()
							&& (MAC_APRV_STS_TYP.isFIX(poR.aprv_sts_typ())
									|| MAC_APRV_STS_TYP.isACPT(poR.aprv_sts_typ()))) {
					continue;
				}
				
				//-----------------------------
				// 上り電文設定
				//-----------------------------
				r.bef_aprv_no(poR.aprv_no());
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.trd_cur_ttl_amt(calcTtlAmt(r));
					Aprv_Chk01_Rslt1R opeUp0R = Aprv_Chk01_Rslt1R.create();
					copy(opeUp0R, r, createMap_Aprv_Chk01_Rslt1R_Po_Ins01_HdrR());
					opeUpd.up0().add(opeUp0R);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.po_dt(poR.po_dt());
					Aprv_Chk04_Rslt1R opeUp0R = Aprv_Chk04_Rslt1R.create();
					copy(opeUp0R, r, createMapAprvChk04());
					opeDel.up0().add(opeUp0R);
				}
				

			}
			if (!opeUpd.up0().isEmpty()) {
				opeUpd.exec();
			}
			if (!opeDel.up0().isEmpty()) {
				opeDel.exec();
			}
		}
		
		/**
		 * 外注製造指図サービスのチェック処理を呼び出します。
		 */
		protected void callOutsrcInstChk01() {
			MSBCL_OutSrcInstService.OutSrcInst_Chk01 chk01 = MSBCL_OutSrcInstService.crtOutSrcInst_Chk01();
			MSBCL_OutSrcActService.OutSrcAct_Chk01 actChk01 = MSBCL_OutSrcActService.crtOutSrcAct_Chk01();
			MCList<OutSrcInst_Chk01_PoDR> upd1L = MCList.create(OutSrcInst_Chk01_PoDR.create());
			MCList<OutSrcInst_Chk01_SchdPoDR> upd2L = MCList.create(OutSrcInst_Chk01_SchdPoDR.create());
			MCList<OutSrcAct_Chk01_ActDR> updRemAbortL = MCList.create(OutSrcAct_Chk01_ActDR.create());
			MCList<Po_Ins01_DtlR>[] grpL = up1().groupList(Po_Ins01_DtlR.$hdr_peg_no);
			MCIndexKey idxup0 = up0().createIndex(Po_Ins01_HdrR.$peg_no);

			for (MCList<Po_Ins01_DtlR> dtlL : grpL) {
				// ヘッダ行を取得する
				MCNumber hdrPegNo = dtlL.get(0).hdr_peg_no();
				Po_Ins01_HdrR hdrR = up0().getFirst(idxup0, hdrPegNo);

				setOutsrcList(upd1L, upd2L, hdrR, dtlL);
				updRemAbortL.addAll(makeRemAbortList(hdrR, dtlL));
			}

			chk01.up0().addAll(upd1L);
			chk01.up1().addAll(upd2L);
			actChk01.up0().addAll(updRemAbortL);
			if (chk01.up0().size() > 0) {
				chk01.exec();
				copyErrFlg(up1(), chk01.down0());
			}
			if (actChk01.up0().size() > 0) {
				actChk01.exec();
				copyErrFlg(up1(), actChk01.down0());
			}
		}
		/**
		 * 入荷予定サービスのチェック処理を呼び出します。
		 * @param hdrL
		 * @param dtlL
		 */
		protected void callArrSchdChk01(){
			MSBEL_ArrSchdService.ArrSchd_Chk01 arrSchdChk01 = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			MSBEL_ArrSchdService.ArrSchd_Chk02 arrSchdChk02 = MSBEL_ArrSchdService
					.crtArrSchd_Chk02();
			MSBDL_PurcSchdRegService.PurcSchd_Chk01 purcSchdChk01 = MSBDL_PurcSchdRegService
					.crtPurcSchd_Chk01();
			// 削除新規行（つくりなおす行）
			MCList<ArrSchd_DtlR> delInsL = MCList.create(ArrSchd_DtlR.create());
			// 更新
			MCList<ArrSchd_DtlR> updL = MCList.create(ArrSchd_DtlR.create());
			MCList<ArrSchd_DtlR> updRemAbortL = MCList.create(ArrSchd_DtlR.create());
			MCList<ArrSchd_DtlR> updRemAbortArrL = MCList.create(ArrSchd_DtlR.create());
			MCList<PurcSchd_DtlR> updRemAbortPurcL = MCList.create(PurcSchd_DtlR.create());
			// 伝票単位で処理
			MCList<Po_Ins01_DtlR>[] grpL = up1().groupList(Po_Ins01_DtlR.$hdr_peg_no);
			MCIndexKey idxup0 = up0().createIndex(Po_Ins01_HdrR.$peg_no);
			
			for (MCList<Po_Ins01_DtlR> dtlL : grpL) {
				// ヘッダ行を取得する
				MCNumber hdrPegNo = dtlL.get(0).hdr_peg_no();
				Po_Ins01_HdrR hdrR = up0().getFirst(idxup0, hdrPegNo);
				
				// 打切・打切解除行に対応する入荷予定ブロックを作成
				updL.addAll(makeAbortList(hdrR, dtlL));
				
				setAbortList(updRemAbortL, updRemAbortArrL, updRemAbortPurcL, hdrR, dtlL);
				// 打切・打切解除以外の行に対応する入荷予定ブロックを作成
				delInsL.addAll(makeUpdList(hdrR, dtlL));
			}
			
			// 入荷予定チェック処理コール
			arrSchdChk01.up0().addAll(delInsL);
			arrSchdChk01.up0().addAll(updL);
			arrSchdChk01.up0().addAll(updRemAbortL);
			arrSchdChk02.up0().addAll(updRemAbortArrL);
			purcSchdChk01.up0().addAll(updRemAbortPurcL);
			if (arrSchdChk01.up0().size() > 0) {
				arrSchdChk01.exec();
				copyErrFlg(up1(), arrSchdChk01.down0());
			}
			if (arrSchdChk02.up0().size() > 0) {
				arrSchdChk02.exec();
				copyErrFlg(up1(), arrSchdChk02.down0());
			}
			if (purcSchdChk01.up0().size() > 0) {
				purcSchdChk01.exec();
				copyErrFlg(up0(), purcSchdChk01.down0());
			}
		}
		/**
		 * 合計金額を算出
		 * @param r
		 */
		protected MCNumber calcTtlAmt(Po_Ins01_HdrR r) {
			// 合計金額を取得
			MCList<Po_Ins01_DtlR> subL = up1().subList(Po_Ins01_DtlR.$hdr_peg_no, r.peg_no());
			MCNumber ttlAmt = MCNumber.ZERO;
			for (Po_Ins01_DtlR dtlR : subL) {
				// 打切でなければ、承認用に合計金額を算出
				if (!(dtlR.abort_flg() && !dtlR.arr_rem_abort_flg() && !dtlR.purc_rem_abort_flg()) && !MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					MCNumber trdCurAmt = nvl(dtlR.trd_cur_amt(), MCNumber.ZERO);
					MCNumber trdCurTaxAmt = nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO);
					MCNumber subTttlAmt = trdCurAmt.add(trdCurTaxAmt);
					if (getCacheItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()).dscnt_itm_flg()) {
						ttlAmt = ttlAmt.subtract(subTttlAmt);
					}
					else {
						ttlAmt = ttlAmt.add(subTttlAmt);
					}
				}
			}
			return ttlAmt;
		}
		/**
		 * 打切・打切解除行に対応する入荷予定サービスの電文を作成します
		 * @param dtlL
		 * @return
		 */
		protected MCList<ArrSchd_DtlR> makeAbortList(Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
			MCList<ArrSchd_DtlR> updL = MCList.create(ArrSchd_DtlR.create());
			//-----------------------------------
			// 打切・打切解除は更新とする
			//-----------------------------------
			MCList<Po_Ins01_DtlR> abortL = dtlL.subList(new MCRowMatcher<Po_Ins01_DtlR>() {
				public boolean match(Po_Ins01_DtlR m) {
					MST_ARR_PR_R arrPrR = getCacheArrPr(m.po_d_no());
					if (isNull(arrPrR) || arrPrR.isEmpty()) {
						return false;
					}
					if (!isSame(arrPrR.abort_flg(), m.abort_flg()) && !m.arr_rem_abort_flg() && !m.purc_rem_abort_flg()) {
						return true;
					}
					return false;

				}
			});
			// 更新でコールする
			for (Po_Ins01_DtlR dtlR : abortL) {
				MST_ARR_PR_R arrPrR = getCacheArrPr(dtlR.po_d_no());
				MCList<MST_ARR_SCHD_R> subArrSchdL = getCacheArrSchd(arrPrR.arr_pr_no());
				for (MST_ARR_SCHD_R arrSchdR : subArrSchdL) {
					ArrSchd_DtlR r = ArrSchd_DtlR.create();
					copy(r, dtlR, createMap_ArrSchd_DtlR_Po_Ins01_DtlR());
					r.mfg_inst_no(arrSchdR.mfg_inst_no());
					r.arr_schd_no(arrSchdR.arr_schd_no());
					updL.add(r);
				}
			}
			updL.setStringNE(ArrSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			updL.setStringNE(ArrSchd_DtlR.$trd_ptn_typ, hdrR.trd_ptn_typ());
			return updL;
		}
		
		protected void setAbortList(MCList<ArrSchd_DtlR> updRemAbortL,
				MCList<ArrSchd_DtlR> updRemAbortArrL,
				MCList<PurcSchd_DtlR> updRemAbortPurcL,
				Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
			
			MCList<Po_Ins01_DtlR> abortL = dtlL.subList(new MCRowMatcher<Po_Ins01_DtlR>() {
				public boolean match(Po_Ins01_DtlR m) {
					MST_ARR_PR_R arrPrR = getCacheArrPr(m.po_d_no());
					if (isNull(arrPrR) || arrPrR.isEmpty()) {
						return false;
					}
					if (!isSame(arrPrR.abort_flg(), m.abort_flg()) && (m.arr_rem_abort_flg() || m.purc_rem_abort_flg())) {
						return true;
					}
					return false;
				}
			});
			
			for (Po_Ins01_DtlR r : abortL) {
				MST_ARR_PR_R arrPrR = getCacheArrPr(r.po_d_no());
				MCList<MST_ARR_SCHD_R> subArrSchdL = getCacheArrSchd(arrPrR.arr_pr_no());
				for (MST_ARR_SCHD_R schdR : subArrSchdL) {
					if (!isArrRemAbort(schdR, arrPrR) && !isPurcRemAbort(schdR, arrPrR)) {
						continue;
					}
					
					// 全数打切の場合
					if (r.abort_flg() && (isArrRemAbort(schdR, arrPrR) || isPurcRemAbort(schdR, arrPrR))
							&& schdR.arr_qty().isZero() && schdR.purc_qty().isZero()) {
						// 同時に打切しない場合はエラー
						if (!(schdR.getBooleanNE("non_purc_flg") || schdR.arr_skip_flg() && isNull(getCachePoD(arrPrR.po_d_no()).dlv_cd())) && (!isPurcRemAbort(schdR, arrPrR) || !isArrRemAbort(schdR, arrPrR))) {
							MCMessagePool.add(new MCMessage(r, null, MSBDL0125, schdR.arr_schd_no(), toDispGUIIndex(r)));
							break;
						}
						else {
							if(!schdR.getNumberNE("base_unit_accpt_dfct_qty").isZero()) {
								MCMessagePool.add(new MCMessage(r, null, MSBDL0126, schdR.arr_schd_no(), toDispGUIIndex(r)));
								break;
							}
							// 入荷予定サービスの更新（入荷進捗・予定）の上り電文設定
							ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
							copy(arrSchdDtlR, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
							arrSchdDtlR.accpt_schd_dt(schdR.getDateNE("purc_schd_dt"));
							arrSchdDtlR.peg_no(r.peg_no());
							arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
							arrSchdDtlR.abort_flg(r.abort_flg());
							arrSchdDtlR.trd_ptn_typ(arrPrR.trd_ptn_typ());
							arrSchdDtlR.xrate(schdR.getNumberNE("xrate"));
							arrSchdDtlR.ptax_xrate(schdR.getNumberNE("ptax_xrate"));
							arrSchdDtlR.trd_cur_cd(schdR.getStringNE("trd_cur_cd"));
							arrSchdDtlR.trd_cur_upri(schdR.getNumberNE("trd_cur_upri"));
							
							MST_PROV_SCHD_R provSchdR = getProvSchdCache(arrPrR.po_d_no());
							if (!isNull(provSchdR)) {
								arrSchdDtlR.prov_typ(provSchdR.prov_typ());
								arrSchdDtlR.prov_basis_typ(provSchdR.prov_basis_typ());
							}
							updRemAbortL.add(arrSchdDtlR);
						}
					}
					// 全数打切でない場合
					else {
						// 入荷・仕入同時打切
						if(r.abort_flg() && isArrRemAbort(schdR, arrPrR) && isPurcRemAbort(schdR, arrPrR)) {
							// 残数が等しくない場合はエラー
							if (!isSame(schdR.arr_qty(), MCNumber.sum(schdR.purc_qty(),
									schdR.getNumberNE("base_unit_accpt_dfct_qty")))) {
								MCMessagePool.add(new MCMessage(r, null, MSBDL0127, schdR.arr_schd_no(), toDispGUIIndex(r)));
								break;
							}
							ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
							copy(updSchdDtlR, r, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02());
							updSchdDtlR.abort_flg(r.abort_flg());
							updSchdDtlR.rem_abort_flg(r.arr_rem_abort_flg());
							
							// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
							if (!isNullOrNullVal(updSchdDtlR.lot_no())) {
								MST_PO_D_R poDR = getCachePoD(r.po_d_no());
								FXUCL_MCDbcCache<MAM_ITM_R> cacheItm = object(CLAZZ)._cacheItm;
								MAM_ITM_R itmR = cacheItm.get(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
								if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
									updSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
								}
							}
							
							updSchdDtlR.mfg_inst_no(schdR.mfg_inst_no());
							updRemAbortArrL.add(updSchdDtlR);
							
							// 仕入予定サービスの実績更新　の上り電文設定
							PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
							copy(purcSchdDtlR, r, schdR, createMap_PurcSchd_DtlR_MST_ARR_SCHD_R());
							purcSchdDtlR.abort_flg(r.abort_flg());
							
							purcSchdDtlR.purc_schd_no(schdR.getStringNE("purc_schd_no"));
							purcSchdDtlR.base_unit_purc_qty(schdR.purc_qty());
							purcSchdDtlR.base_unit_accpt_dfct_qty(schdR.getNumberNE("base_unit_accpt_dfct_qty"));
							MST_PO_D_R poDR = getCachePoD(r.po_d_no());
							purcSchdDtlR.purc_ddlv_flg(!isNull(poDR.dlv_cd()));
							updRemAbortPurcL.add(purcSchdDtlR);
						}
						// 入荷予定のみの残数打切
						else if(r.abort_flg() && isArrRemAbort(schdR, arrPrR)) {
							// 仕入実績がある場合はエラー
							if(!schdR.purc_qty().isZero()) {
								MCMessagePool.add(new MCMessage(r, null, MSBDL0128, schdR.arr_schd_no(), toDispGUIIndex(r)));
								break;
							}
							ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
							copy(updSchdDtlR, r, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02());
							updSchdDtlR.abort_flg(r.abort_flg());
							updSchdDtlR.rem_abort_flg(r.arr_rem_abort_flg());
							
							// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
							if (!isNullOrNullVal(updSchdDtlR.lot_no())) {
								MST_PO_D_R poDR = getCachePoD(r.po_d_no());
								FXUCL_MCDbcCache<MAM_ITM_R> cacheItm = object(CLAZZ)._cacheItm;
								MAM_ITM_R itmR = cacheItm.get(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
								if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
									updSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
								}
							}
							
							updSchdDtlR.mfg_inst_no(schdR.mfg_inst_no());
							updRemAbortArrL.add(updSchdDtlR);
						}
						// 仕入予定のみの残数打切
						else if(r.abort_flg() && isPurcRemAbort(schdR, arrPrR)) {
							// 入荷実績がある場合はエラー
							if(!schdR.arr_qty().isZero()) {
								MCMessagePool.add(new MCMessage(r, null, MSBDL0128, schdR.arr_schd_no(), toDispGUIIndex(r)));
								break;
							}

							// 仕入予定サービスの実績更新前チェック　の上り電文設定
							PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
							copy(purcSchdDtlR, r, schdR, createMap_PurcSchd_DtlR_MST_ARR_SCHD_R());
							purcSchdDtlR.abort_flg(r.abort_flg());
							purcSchdDtlR.purc_schd_no(schdR.getStringNE("purc_schd_no"));
							purcSchdDtlR.base_unit_purc_qty(schdR.purc_qty());
							purcSchdDtlR.base_unit_accpt_dfct_qty(schdR.getNumberNE("base_unit_accpt_dfct_qty"));
							updRemAbortPurcL.add(purcSchdDtlR);
						}
						else {
							// 入荷進捗、入荷予定が打切済の場合は解除
							if(arrPrR.abort_flg() || schdR.abort_flg()) {
								// 全数打切の解除
								if(schdR.arr_qty().isZero()) {
									// 入荷予定サービスの更新（入荷進捗・予定）前チェックの上り電文設定
									ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
									copy(arrSchdDtlR, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
									arrSchdDtlR.accpt_schd_dt(schdR.getDateNE("purc_schd_dt"));
									arrSchdDtlR.peg_no(r.peg_no());
									arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
									arrSchdDtlR.abort_flg(r.abort_flg());
									arrSchdDtlR.trd_ptn_typ(arrPrR.trd_ptn_typ());
									arrSchdDtlR.xrate(schdR.getNumberNE("xrate"));
									arrSchdDtlR.ptax_xrate(schdR.getNumberNE("ptax_xrate"));
									arrSchdDtlR.trd_cur_cd(schdR.getStringNE("trd_cur_cd"));
									arrSchdDtlR.trd_cur_upri(schdR.getNumberNE("trd_cur_upri"));
									
									MST_PROV_SCHD_R provSchdR = getProvSchdCache(arrPrR.po_d_no());
									if (!isNull(provSchdR)) {
										arrSchdDtlR.prov_typ(provSchdR.prov_typ());
										arrSchdDtlR.prov_basis_typ(provSchdR.prov_basis_typ());
									}
									updRemAbortL.add(arrSchdDtlR);
								}
								// 残数打切の解除
								else {
									// 入荷予定サービスの更新（予定・実績）前チェック　の上り電文設定
									ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
									copy(updSchdDtlR, r, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02());
									updSchdDtlR.abort_flg(r.abort_flg());
									// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
									if (!isNullOrNullVal(updSchdDtlR.lot_no())) {
										MST_PO_D_R poDR = getCachePoD(r.po_d_no());
										FXUCL_MCDbcCache<MAM_ITM_R> cacheItm = object(CLAZZ)._cacheItm;
										MAM_ITM_R itmR = cacheItm.get(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
										if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
											updSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
										}
									}
									
									updSchdDtlR.mfg_inst_no(schdR.mfg_inst_no());
									updRemAbortArrL.add(updSchdDtlR);
								}
							}
						}
						
						// 前回仕入予定が残数打切の場合は仕入予定サービスに連携
						if(!r.abort_flg()) {
							if (schdR.getBooleanNE("purc_abort_flg")
									&& (!schdR.purc_qty().isZero()
											|| !schdR.getNumberNE("base_unit_accpt_dfct_qty").isZero())) {
								// 仕入予定サービスの実績更新前チェック　の上り電文設定
								PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
								copy(purcSchdDtlR, r, schdR, createMap_PurcSchd_DtlR_MST_ARR_SCHD_R());
								purcSchdDtlR.abort_flg(r.abort_flg());
								purcSchdDtlR.purc_schd_no(schdR.getStringNE("purc_schd_no"));
								purcSchdDtlR.base_unit_purc_qty(schdR.purc_qty());
								purcSchdDtlR.base_unit_accpt_dfct_qty(schdR.getNumberNE("base_unit_accpt_dfct_qty"));
								MST_PO_D_R poDR = getCachePoD(r.po_d_no());
								purcSchdDtlR.purc_ddlv_flg(!isNull(poDR.dlv_cd()));
								updRemAbortPurcL.add(purcSchdDtlR);
							}
						}
					}
				}
			}
		}
		
		protected void setOutsrcList(MCList<OutSrcInst_Chk01_PoDR> upd1L,
				MCList<OutSrcInst_Chk01_SchdPoDR> upd2L,
				Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
			MCIndexKey idx = up2().createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			
			MCList<Po_Ins01_DtlR> abortL = dtlL.subList(new MCRowMatcher<Po_Ins01_DtlR>() {
				public boolean match(Po_Ins01_DtlR m) {
					if (!m.outsrc_flg()) {
						return false;
					}
					if (m.arr_rem_abort_flg() || m.purc_rem_abort_flg()) {
						return false;
					}
					return true;
					
				}
			});
			
			for (Po_Ins01_DtlR dtlR : abortL) {
				OutSrcInst_Chk01_PoDR srvUpR = OutSrcInst_Chk01_PoDR.create();
				copy(srvUpR, dtlR, createMap_OutSrcInst_Chk01_PoDR_Po_Ins01_DtlR());
				upd1L.add(srvUpR);
				
				MCList<Po_Ins01_Bndl_DtlR> subL = up2().subList(idx, dtlR.peg_no());
				for (Po_Ins01_Bndl_DtlR dtl2R : subL) {
					OutSrcInst_Chk01_SchdPoDR srvUpDR = OutSrcInst_Chk01_SchdPoDR.create();
					copy(srvUpDR, dtl2R, createMap_OutSrcInst_Chk01_SchdPoDR_Po_Ins01_Bndl_DtlR());
					upd2L.add(srvUpDR);
				}
			}
		}
		
		protected MCList<OutSrcAct_Chk01_ActDR> makeRemAbortList(Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
			MCList<OutSrcAct_Chk01_ActDR> updL = MCList.create(OutSrcAct_Chk01_ActDR.create());
			//-----------------------------------
			// 打切・打切解除は更新とする
			//-----------------------------------
			MCList<Po_Ins01_DtlR> abortL = dtlL.subList(new MCRowMatcher<Po_Ins01_DtlR>() {
				public boolean match(Po_Ins01_DtlR m) {
					MST_ARR_PR_R arrPrR = getCacheArrPr(m.po_d_no());
					if (isNull(arrPrR) || arrPrR.isEmpty()) {
						return false;
					}
					if (!m.outsrc_flg()) {
						return false;
					}
					if (m.arr_rem_abort_flg() || m.purc_rem_abort_flg()) {
						return true;
					}
					return false;
					
				}
			});
			// 更新でコールする
			for (Po_Ins01_DtlR dtlR : abortL) {
				MST_ARR_PR_R arrPrR = getCacheArrPr(dtlR.po_d_no());
				MCList<MST_ARR_SCHD_R> subArrSchdL = getCacheArrSchd(arrPrR.arr_pr_no());
				for (MST_ARR_SCHD_R arrSchdR : subArrSchdL) {
					if (isSame(arrSchdR.arr_qty(), arrSchdR.base_unit_qty())) {
						continue;
					}
					MCList<MST_ARR_ACT_R> aaL = getArrActCacheByMfgInstNo(arrSchdR.mfg_inst_no());
					if (isNull(aaL)) {
						continue;
					}
					
					OutSrcAct_Chk01_ActDR srvUpR = OutSrcAct_Chk01_ActDR.create();
					copy(srvUpR, dtlR, createMap_OutSrcAct_Chk01_ActDR_Po_Ins01_DtlR());
					srvUpR.mfg_inst_no(arrSchdR.mfg_inst_no());
					
					if (!arrSchdR.abort_flg() && dtlR.abort_flg()) {
						// 今回打切する場合
						srvUpR.arr_schd_abort_flg(true);
					}
					else if (arrSchdR.abort_flg() && !dtlR.abort_flg()) {
						// 打切解除する場合
						srvUpR.arr_schd_abort_can_flg(true);
					}
					updL.add(srvUpR);
				}
			}
			return updL;
		}
		
		/**
		 * 打切・打切解除以外の行に対応する入荷予定サービスの電文を作成します
		 * @param dtlL
		 * @return
		 */
		protected MCList<ArrSchd_DtlR> makeUpdList(Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
			MCIndexKey idxUp2 = up2().createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			// 削除及び新規行
			MCList<ArrSchd_DtlR> delInsL = MCList.create(ArrSchd_DtlR.create());
			// 新規
			MCList<ArrSchd_DtlR> insL = MCList.create(ArrSchd_DtlR.create());
			// 削除
			MCList<ArrSchd_DtlR> delL = MCList.create(ArrSchd_DtlR.create());
			//-----------------------------------
			// 打切・打切解除以外の更新行
			//-----------------------------------
			MCList<Po_Ins01_DtlR> updPoDL = dtlL.subList(new MCRowMatcher<Po_Ins01_DtlR>() {
				public boolean match(Po_Ins01_DtlR m) {
					MST_ARR_PR_R arrPrR = getCacheArrPr(m.po_d_no());
					if (isNull(arrPrR) || arrPrR.isEmpty()) {
						return true;
					}
					if (isSame(arrPrR.abort_flg(), m.abort_flg())) {
						return true;
					}
					return false;
				}
			});
			
			for (Po_Ins01_DtlR podR : updPoDL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(podR.data_crud_typ())) {
					ArrSchd_DtlR arrSchdR = ArrSchd_DtlR.create();
					copy(arrSchdR, podR, createMap_ArrSchd_DtlR_Po_Ins01_DtlR());
					insL.add(arrSchdR);
				}
				
				// 自身にまとめ行が合った場合、まとめ行に対応する予定を削除する
				MCList<Po_Ins01_Bndl_DtlR> subL = up2().subList(idxUp2, podR.peg_no());
				for (Po_Ins01_Bndl_DtlR r : subL) {
					MST_ARR_PR_R arrPrR = getCacheArrPr(r.po_d_no());
					if (!isNull(arrPrR)) {
						MCList<MST_ARR_SCHD_R> subArrSchdL = getCacheArrSchd(arrPrR.arr_pr_no());
						for (MST_ARR_SCHD_R arrSchdR : subArrSchdL) {
							ArrSchd_DtlR tmpR = ArrSchd_DtlR.create();
							tmpR.peg_no(podR.peg_no());
							tmpR.arr_schd_no(arrSchdR.arr_schd_no());
							tmpR.trd_ptn_typ(hdrR.trd_ptn_typ());
							delL.add(tmpR);
						}
					}
				}
			}
			insL.setStringNE(ArrSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			delL.setStringNE(ArrSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			
			delInsL.addAll(delL);
			delInsL.addAll(insL);
			
			delInsL.setStringNE(ArrSchd_DtlR.$trd_ptn_typ, hdrR.trd_ptn_typ());
			
			return delInsL;
		}
		
		/**
		 * 諸口品登録サービスのチェック処理を呼び出します。
		 */
		protected void callSundryItmChk01() {
			MABCL_SundryItmRegService.SundryItm_Chk01 chk01 = MABCL_SundryItmRegService.crtSundryItm_Chk01();
			MCList<Po_Ins01_DtlR> subL = MCList.create(Po_Ins01_DtlR.class);
			MCIndexKey idxDtl2L = up2().createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			for (Po_Ins01_DtlR r : up1()) {
				boolean isTrgt = true;
				MCList<Po_Ins01_Bndl_DtlR> tmpL = up2().subList(idxDtl2L, r.peg_no());
				for (Po_Ins01_Bndl_DtlR tmpR : tmpL) {
					if (!isNull(tmpR.po_schd_no())) {
						isTrgt = false;
					}
				}
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					isTrgt = false;
				}
				if (isTrgt) {
					subL.add(r);
				}
			}
			addAll(chk01.up0(), subL.subList(Po_Ins01_DtlR.$sundry_itm_flg, true), createMap_SundryItm_Chk01_DtlR_Po_Ins01_DtlR());
			chk01.exec();
			copyErrFlg(up1(), chk01.down0());
		}
		
		protected MCList<MAM_PROV_UPRI_R> createBindProvUpri(MCList<Po_Ins01_DtlR> dtlL) {
			MCList<MAM_PROV_UPRI_R> bindL = MCList.create(MAM_PROV_UPRI_R.class);
			for (Po_Ins01_DtlR r : dtlL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MAM_PROV_UPRI_R bindR = MAM_PROV_UPRI_R.create();
				MAM_LOC_R locR = getCacheLoc(r.in_to_loc_cd());
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindR.prsppl_cd(locR.sppl_cd());
				bindR.cur_cd(r.trd_cur_cd());
				bindR.wg_cd(locR.wg_cd());
				bindL.add(bindR);
			}
			return bindL;
		}
	}
	/**
	 * Po_Ins01オペレーション.<p>
	 *
	 * 発注情報を登録・訂正・取消する。<br>
	 */
	public class Po_Ins01 extends MSBDL_PoRegService_MC_A.Po_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// オーダ登録サービス（計画外外注発注用）
			callOrdRegUpdSV(up1(), up2());
			// キャッシュ作成
			createCache(up0(), up1(), up2());
			// 補完処理
			completion(up0(), up1(), up2());
			// 発注ＮＯの発番
			setPoNo(up0());
			// 承認処理
			callAprvUpd01(up0());
			// 外注品のオーダ、支給品の受払予定を登録・訂正・削除する
			callOrdUpd01(up0(), up1(), up2());
			// 発注登録
			insPo(up0(), up1());
			// 発注予定更新
			callPoSchdUpd02(up0(), up1(), up2());
			// 外注製造指図サービス
			callOutSrcInstUpd01(up1());
			// 入荷予定サービス
			callSchdArrUpd01(up0(), up1(), up2());
			// 承認提供サービス（次処理済更新・次処理済解除）
			callAprvUpd(up1(), up2());
			// 受注状況更新サービス
			callSlsUpd(up1());
			// 購買納品書登録、発行サービス
			callPurcPrntUpd01(up0(), up1());
			// 購買帳票発行サービス
			callPurcPrnt01(up0(), up1());
			callPurcPrntUpd02(up0(), up1());
			// 諸口品マスタ更新
			callSundryItmUpd01(up1(), up2());
			callPoEDI(up0(), up1(), up2());
			// 与信更新サービス
			callCredUpd02(up0(), up1());
			setDown();
		}
		
		/**
		 * 承認提供サービス呼び出し処理
		 * @param hdrL
		 */
		protected void callAprvUpd01(MCList<Po_Ins01_HdrR> hdrL) {
			if (hdrL.size() > 0) {
				MBBAL_AprvService.Aprv_Upd01 aprvUpd01 = MBBAL_AprvService.crtAprv_Upd01();
				addAll(aprvUpd01.up0(), hdrL, createMap_Aprv_Chk01_Rslt1R_Po_Ins01_HdrR());
				aprvUpd01.exec();
				String[] destCols = new String[] { Po_Ins01_HdrR.$aprv_flg, Po_Ins01_HdrR.$aprv_no };
				String[] srcCols = new String[] { Aprv_Upd01_Dtl1R.$aprv_flg, Aprv_Upd01_Dtl1R.$aprv_no };
				copyByPegNo(hdrL, destCols, aprvUpd01.down0(), srcCols);
				hdrL.subList(Po_Ins01_HdrR.$aprv_flg, true).setValueNE(Po_Ins01_HdrR.$aprv_sts_typ, MAC_APRV_STS_TYP.OPN.value());
			}
		}
		
		protected void insPo(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL) {
			MCList<MST_PO_R> insPoL = MCList.create(MST_PO_R.class);
			MCList<MST_PO_D_R> insPoDL = MCList.create(MST_PO_D_R.class);
			
			// 受払進捗管理ＮＯの発番
			MCList<Po_Ins01_DtlR> subL = dtlL.subList(Po_Ins01_DtlR.$io_schd_pr_no, null);
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, subL.size());
			
			makePoList(hdrL, dtlL, insPoL, insPoDL);

			MCQueryApiBuilder insPoL_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
			dbInsert("MSBDL5100_MST_PO_I01", insPoL, insPoL_bldr);
			MCQueryApiBuilder insPoDL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
			dbInsert("MSBDL5100_MST_PO_D_I01", insPoDL, insPoDL_bldr);
			// 改訂履歴データ更新サービス呼出（発注改訂履歴テーブル更新）
			callRevDataServiceIns01(insPoL);
		}
		
		/**
		 * 発注ヘッダと発注明細のコンテナを作成します。
		 * @param poL
		 * @param poDL
		 * @param hdrL
		 * @param dtlL
		 */
		protected void makePoList(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL, MCList<MST_PO_R> poL, MCList<MST_PO_D_R> poDL) {
			MCIndexKey idx = dtlL.createIndex(Po_Ins01_DtlR.$hdr_peg_no);
			MCList<ElmArgsR> elmArgsL = MCList.create(ElmArgsR.create());

			for (Po_Ins01_HdrR hdrR : hdrL) {
				hdrR.po_rev(getPoRev(hdrR, dtlL));
				
				// ヘッダの設定
				MST_PO_R poR = MST_PO_R.create();
				MCRow.copyall(poR, hdrR.po());
				poR.po_print_flg(false);
				poL.add(poR);
				
				MCList<Po_Ins01_DtlR> subL = dtlL.subList(idx, hdrR.peg_no());
				for (Po_Ins01_DtlR dtlR : subL) {
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						ElmArgsR elm = ElmArgsR.create();
						elm.co_cd(getCo().co_cd());
						elm.wg_cd(hdrR.wg_cd());
						elm.trd_cd(hdrR.trd_cd());
						elm.dpt_cd(hdrR.purc_dpt_cd());
						elm.bp_cd(hdrR.sppl_cd());
						elm.dt(dtlR.po_dt().trunc(MCDateFieldType.DAY));
						elm.itm_cd(dtlR.itm_cd());
						elm.itm_sub1(dtlR.itm_sub1());
						elm.itm_sub2(dtlR.itm_sub2());
						elm.itm_sub3(dtlR.itm_sub3());
						elm.peg_no(dtlR.peg_no());
						elmArgsL.add(elm);
						
						if (isNull(dtlR.io_schd_pr_no())) {
							dtlR.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
						}
					}
					
					dtlR.po_no(hdrR.po_no());
					dtlR.po_rev(hdrR.po_rev());
				}
			}
			if (!elmArgsL.isEmpty()) {
				String[] srcCols = {ElmArgsR.$new_no};
				String[] destCols = {Po_Ins01_DtlR.$po_d_no};
				setNum(MAC_NUM_BIZ_TYP.POD, elmArgsL);
				copyByPegNo(dtlL, destCols, elmArgsL, srcCols);
			}
			for (Po_Ins01_DtlR dtlR : dtlL) {
				MST_PO_D_R poDR = MST_PO_D_R.create();
				MCRow.copyall(poDR, dtlR.pod());
				poDL.add(poDR);
			}
		}
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().addAll(up0());
			down1().addAll(up1());
		}
	}
	/**
	 * Po_Upd01オペレーション.<p>
	 *
	 * 発注情報を訂正する。<br>
	 */
	public class Po_Upd01 extends MSBDL_PoRegService_MC_A.Po_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 発注予定キャッシュ作成（計画外外注発注用）
			createCacheForUplndOutsrc(up1());
			// オーダ登録サービス（計画外外注発注用）
			callOrdRegUpdSV(up1(), up2());
			// キャッシュ作成
			createCache(up0(), up1(), up2());
			// 補完処理
			completion(up0(), up1(), up2());
			// 承認処理
			callAprvUpd01(up0());
			// 外注品のオーダ、支給品の受払予定を登録・訂正・削除する
			callOrdUpd01(up0(), up1(), up2());
			// 発注明細ＮＯ発番（外注製造指図サービス呼出より前に発番する必要がある）
			setPoDNo(up1());
			// 外注製造指図サービス
			callOutSrcInstUpd01(up1());
			// 発注更新
			updPo(up0(), up1());
			// 入荷予定サービス（発注予定ＮＯを入荷予定で見たいため、必ず発注予定更新の前に呼ぶ）
			callSchdArrUpd01(up0(), up1(), up2());
			// 外注製造実績サービスの更新を実行
			callOutSrcActUpdSrv(up0(), up1(), up2());
			// 発注予定更新
			callPoSchdUpd02(up0(), up1(), up2());
			//オーダ登録サービス（発注予定まとめ用）
			callOrdRegUpd04ForBndl(up0(), up1());
			// 購買納期調整登録サービス
			callPrmsDel01(up1(), up2());
			// 承認提供サービス（次処理済更新・次処理済解除）
			callAprvUpd(up1(), up2());
			// 受注状況更新サービス
			callSlsUpd(up1());
			// 購買納品書登録、発行サービス
			callPurcPrntUpd01(up0(), up1());
			// 購買帳票発行サービス
			callPurcPrnt01(up0(), up1());
			callPurcPrntUpd02(up0(), up1());
			// 諸口品マスタ登録サービス
			callSundryItmUpd01(up1(), up2());
			// オーダ登録サービス（計画外外注発注・削除用）
			callOrdRegUpdSVForDel(up1());
			callPoEDI(up0(), up1(), up2());
			// 与信更新サービス
			callCredUpd02(up0(), up1());
			// 下り電文設定
			setDown();
		}
		
		/**
		 * 承認提供サービス呼び出し処理
		 * @param hdrL
		 * @param dtlL
		 */
		protected void callAprvUpd01(MCList<Po_Ins01_HdrR> hdrL){
			// 前回承認対象外、未承認、一時承認済あるいは最終承認済かつ承認引戻オン
			MCList<Po_Ins01_HdrR> subL = hdrL.subList(new MCRowMatcher<Po_Ins01_HdrR>() {
				public boolean match(Po_Ins01_HdrR m) {
					if (isNull(m.bef_aprv_no())) {
						return true;
					}
					if (!(MAC_APRV_STS_TYP.isACPT(m.bef_aprv_sts_typ()) || MAC_APRV_STS_TYP.isFIX(m.bef_aprv_sts_typ()))) {
						return true;
					}
					if (m.aprv_rvrs_flg() && (MAC_APRV_STS_TYP.isACPT(m.bef_aprv_sts_typ()) || MAC_APRV_STS_TYP.isFIX(m.bef_aprv_sts_typ()))) {
						return true;
					}
					return false;

				}
			});
			if (subL.size() > 0) {
				MBBAL_AprvService.Aprv_Upd01 aprvUpd01 = MBBAL_AprvService.crtAprv_Upd01();
				addAll(aprvUpd01.up0(), subL, createMap_Aprv_Chk01_Rslt1R_Po_Ins01_HdrR());
				aprvUpd01.exec();
				String[] destCols = new String[] {Po_Ins01_HdrR.$aprv_flg, Po_Ins01_HdrR.$aprv_no};
				String[] srcCols = new String[] {Aprv_Upd01_Dtl1R.$aprv_flg, Aprv_Upd01_Dtl1R.$aprv_no};
				copyByPegNo(subL, destCols, aprvUpd01.down0(), srcCols);
				chkAprv(subL);
				subL.subList(Po_Ins01_HdrR.$aprv_flg, true).setValueNE(Po_Ins01_HdrR.$aprv_sts_typ, MAC_APRV_STS_TYP.OPN.value());
				subL.subList(Po_Ins01_HdrR.$aprv_flg, false).setValueNE(Po_Ins01_HdrR.$aprv_sts_typ, null);
			}
		}
		
		/**
		 * 次処理済のものが新たに承認対象となっていないか判定します。
		 */
		protected void chkAprv(MCList<Po_Ins01_HdrR> subL) {
			// 承認対象となったヘッダを抽出
			MCIndexKey idx = up1().createIndex(Po_Ins01_DtlR.$hdr_peg_no);
			for (Po_Ins01_HdrR hdrR : subL) {
				if (hdrR.aprv_flg()
						&& (isNull(hdrR.bef_aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(hdrR.bef_aprv_sts_typ()))) {
					MCList<Po_Ins01_DtlR> dtlL = up1().subList(idx, hdrR.peg_no());
					for (Po_Ins01_DtlR dtlR : dtlL) {						
						if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
							MST_ARR_PR_R prR = getCacheArrPr(dtlR.po_d_no());
							if (isAprvNextOpr(prR)) {
								throw new MCAppException(hdrR, null, MSBDL0101, toDispGUIIndex(hdrR));
							}
						}
					}
				}
			}
		}

		
		protected void setPoDNo(MCList<Po_Ins01_DtlR> dtlL) {
			// 新規行の発注明細ＮＯを発番
			MCList<Po_Ins01_DtlR> tgtL = dtlL.subList(Po_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			MCIndexKey idx = up0().createIndex(Po_Ins01_HdrR.$peg_no);
			MCList<ElmArgsR> elmArgsL = MCList.create(ElmArgsR.create());
			
			for (Po_Ins01_DtlR dtlR : tgtL) {
				Po_Ins01_HdrR hdrR = up0().getFirst(idx, dtlR.hdr_peg_no());
				ElmArgsR elm = ElmArgsR.create();
				elm.co_cd(getCo().co_cd());
				elm.wg_cd(hdrR.wg_cd());
				elm.trd_cd(hdrR.trd_cd());
				elm.dpt_cd(hdrR.purc_dpt_cd());
				elm.bp_cd(hdrR.sppl_cd());
				elm.dt(dtlR.po_dt().trunc(MCDateFieldType.DAY));
				elm.itm_cd(dtlR.itm_cd());
				elm.itm_sub1(dtlR.itm_sub1());
				elm.itm_sub2(dtlR.itm_sub2());
				elm.itm_sub3(dtlR.itm_sub3());
				elm.peg_no(dtlR.peg_no());
				elmArgsL.add(elm);
			}
			if (!elmArgsL.isEmpty()) {
				String[] srcCols = {ElmArgsR.$new_no};
				String[] destCols = {Po_Ins01_DtlR.$po_d_no};
				setNum(MAC_NUM_BIZ_TYP.POD, elmArgsL);
				copyByPegNo(tgtL, destCols, elmArgsL, srcCols);
			}
		}
		/**
		 * 発注情報を更新します
		 * @param hdrL
		 * @param dtlL
		 */
		protected void updPo(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL) {
			MCList<MST_PO_R> updPoL = MCList.create(MST_PO_R.class);
			MCList<MST_PO_R> updPoSubL = MCList.create(MST_PO_R.class);
			MCList<MST_PO_D_R> insPoDL = MCList.create(MST_PO_D_R.class);
			MCList<MST_PO_D_R> updPoDL = MCList.create(MST_PO_D_R.class);
			MCList<MST_PO_D_R> updPoDSubL = MCList.create(MST_PO_D_R.class);
			MCList<MST_PO_D_R> updPoDAbortL = MCList.create(MST_PO_D_R.class);
			MCList<MST_PO_D_R> delPoDL = MCList.create(MST_PO_D_R.class);
			
			// 受払進捗管理ＮＯの発番
			int ioPrCacheSize  = dtlL.subList(Po_Ins01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size();
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, ioPrCacheSize);
			
			makePoList(hdrL, dtlL, updPoL, updPoSubL, insPoDL, updPoDL, updPoDSubL, updPoDAbortL, delPoDL);
			
			if (updPoL.size() > 0) {
				MST_PO_R updPoL_t = MST_PO_R.create("T");
				MCQueryApiBuilder updPoL_bldr = MCQueryApiBuilder.create(updPoL_t);
				editUpdPoCol(updPoL, updPoL_bldr, updPoL_t);
				dbUpdateKey("MSBDL5100_MST_PO_U01", updPoL, updPoL_bldr);
			}
			if (updPoSubL.size() > 0) {
				MST_PO_R updPoSubL_t = MST_PO_R.create("T");
				MCQueryApiBuilder updPoSubL_bldr = MCQueryApiBuilder.create(updPoSubL_t);
				editUpdPoSubCol(updPoSubL, updPoSubL_bldr, updPoSubL_t);
				dbUpdateKey("MSBDL5100_MST_PO_U02", updPoSubL, updPoSubL_bldr);
			}
			if (insPoDL.size() > 0) {
				MCQueryApiBuilder insPoDL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
				dbInsert("MSBDL5100_MST_PO_D_I02", insPoDL, insPoDL_bldr);
			}
			if (updPoDL.size() > 0) {
				MST_PO_D_R updPoDL_t = MST_PO_D_R.create("T");
				MCQueryApiBuilder updPoDL_bldr = MCQueryApiBuilder.create(updPoDL_t);
				editUpdPoDCol(updPoDL, updPoDL_bldr, updPoDL_t);
				dbUpdateKey("MSBDL5100_MST_PO_D_U01", updPoDL, updPoDL_bldr);
			}
			if (updPoDSubL.size() > 0) {
				MST_PO_D_R updPoDSubL_t = MST_PO_D_R.create("T");
				MCQueryApiBuilder updPoDSubL_bldr = MCQueryApiBuilder.create(updPoDSubL_t);
				editUpdPoDColSub(updPoDSubL, updPoDSubL_bldr, updPoDSubL_t);
				dbUpdateKey("MSBDL5100_MST_PO_D_U02", updPoDSubL, updPoDSubL_bldr);
			}
			if (updPoDAbortL.size() > 0) {
				MST_PO_D_R updPoDAbortL_t = MST_PO_D_R.create("T");
				MCQueryApiBuilder updPoDAbortL_bldr = MCQueryApiBuilder.create(updPoDAbortL_t);
				editUpdPoDColAbort(updPoDAbortL, updPoDAbortL_bldr, updPoDAbortL_t);
				dbUpdateKey("MSBDL5100_MST_PO_D_U03", updPoDAbortL, updPoDAbortL_bldr);
			}
			if (delPoDL.size() > 0) {
				MST_PO_D_R delPoDL_t = MST_PO_D_R.create("T");
				MCQueryApiBuilder delPoDL_bldr = MCQueryApiBuilder.create(delPoDL_t);
				editDelPoDCol(delPoDL, delPoDL_bldr, delPoDL_t);
				dbUpdateKey("MSBDL5100_MST_PO_D_U04", delPoDL, delPoDL_bldr);
			}
			if (updPoL.size() > 0) {
				// 改訂履歴データ更新サービス呼出（発注改訂履歴テーブル更新）
				callRevDataServiceIns01(updPoL);
			}
			if (updPoSubL.size() > 0) {
				// 改訂履歴データ更新サービス呼出（発注改訂履歴テーブル更新）
				callRevDataServiceIns01(updPoSubL);
			}
		}
		
		protected void editDelPoDCol(MCList<MST_PO_D_R> poDL, MCQueryApiBuilder poDL_bldr, MST_PO_D_R t) {
			poDL_bldr.setSetVL(t.can_flg, value(true));
		}

		/**
		 * 発注ヘッダと発注明細のコンテナを作成します。
		 * @param hdrL
		 * @param dtlL
		 * @param poL
		 * @param insPoDL
		 * @param updPoDL
		 * @param delPoDL
		 */
		protected void makePoList(
				MCList<Po_Ins01_HdrR> hdrL
				, MCList<Po_Ins01_DtlR> dtlL
				, MCList<MST_PO_R> poL
				, MCList<MST_PO_R> updPoSubL
				, MCList<MST_PO_D_R> insPoDL
				, MCList<MST_PO_D_R> updPoDL
				, MCList<MST_PO_D_R> updPoDSubL
				, MCList<MST_PO_D_R> updAbortPoDL
				, MCList<MST_PO_D_R> delPoDL) {
			MCIndexKey idx = dtlL.createIndex(Po_Ins01_DtlR.$hdr_peg_no);
			for (Po_Ins01_HdrR hdrR : hdrL) {
				hdrR.po_rev(getPoRev(hdrR, dtlL));
				
				// ヘッダの設定
				MST_PO_R poR = MST_PO_R.create();
				MCRow.copyall(poR, hdrR.po());
				// 備考のみ更新可能な場合
				// 更新前が最終承認済あるいは一次承認済で、承認引き戻しがオフ
				if (!isNull(hdrR.bef_aprv_no()) && !hdrR.aprv_rvrs_flg() && 
						(MAC_APRV_STS_TYP.isACPT(hdrR.bef_aprv_sts_typ()) || MAC_APRV_STS_TYP.isFIX(hdrR.bef_aprv_sts_typ()))) {
					updPoSubL.add(poR);
				}
				else {
					MST_PO_R cachePoR = getCachePo(poR.po_no());
					if (isNoPrntPoTgt(hdrR)) {
						poR.po_print_flg(cachePoR.po_print_flg());
						poR.po_print_dt(cachePoR.po_print_dt());
					}
					else {
						poR.po_print_flg(false);
						poR.po_print_dt(null);
					}
		
					if (isNoSendEdiTgt(hdrR)) {
						poR.edi_flg(cachePoR.edi_flg());
					}
					
					poL.add(poR);
				}
				
				MCList<Po_Ins01_DtlR> subL = dtlL.subList(idx, hdrR.peg_no());
				for (Po_Ins01_DtlR dtlR : subL) {
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						dtlR.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
					}
					
					dtlR.po_no(hdrR.po_no());
					dtlR.po_rev(hdrR.po_rev());
					MST_PO_D_R poDR = MST_PO_D_R.create();
					MCRow.copyall(poDR, dtlR.pod());
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						insPoDL.add(poDR);
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						if (!isSame(dtlR.abort_flg(), dtlR.bef_abort_flg())) {
							updAbortPoDL.add(poDR);
						}
						else if (updOnlyPod(dtlR)) {
							updPoDSubL.add(poDR);
						}
						else {
							updPoDL.add(poDR);
						}
					}
					else {
						delPoDL.add(poDR);
					}
				}
			}
		}
		/**
		 * 更新項目を設定します(発注ヘッダ)
		 */
		protected void editUpdPoCol(MCList<MST_PO_R> poL, MCQueryApiBuilder poL_bldr, MST_PO_R t) {
			poL_bldr.setSet(t.po_no);
			poL_bldr.addSet(t.po_rev);
			poL_bldr.addSet(t.trd_cd);
			poL_bldr.addSet(t.trd_ptn_typ);
			poL_bldr.addSet(t.purc_dpt_cd);
			poL_bldr.addSet(t.wg_cd);
			poL_bldr.addSet(t.purc_usr_cd);
			poL_bldr.addSet(t.sppl_cd);
			poL_bldr.addSet(t.sppl_cntct_dpt);
			poL_bldr.addSet(t.sppl_cntct_psn);
			poL_bldr.addSet(t.sppl_zip_cd);
			poL_bldr.addSet(t.sppl_addr1);
			poL_bldr.addSet(t.sppl_addr2);
			poL_bldr.addSet(t.sppl_addr3);
			poL_bldr.addSet(t.sppl_addr4);
			poL_bldr.addSet(t.sppl_tel);
			poL_bldr.addSet(t.sppl_fax);
			poL_bldr.addSet(t.po_dt);
			poL_bldr.addSet(t.upd_po_print_schd_dt);
			poL_bldr.addSet(t.po_print_flg);
			poL_bldr.addSet(t.po_print_dt);
			poL_bldr.addSet(t.trd_cur_cd);
			poL_bldr.addSet(t.xrate);
			poL_bldr.addSet(t.xrate_inpt_flg);
			poL_bldr.addSet(t.ptax_xrate);
			poL_bldr.addSet(t.ptax_xrate_inpt_flg);
			poL_bldr.addSet(t.crct_rsn_cd);
			poL_bldr.addSet(t.po_print_cd);
			poL_bldr.addSet(t.wrk_no);
			poL_bldr.addSet(t.tterm_cd1);
			poL_bldr.addSet(t.tterm_rmrks1);
			poL_bldr.addSet(t.tterm_cd2);
			poL_bldr.addSet(t.tterm_rmrks2);
			poL_bldr.addSet(t.tterm_cd3);
			poL_bldr.addSet(t.tterm_rmrks3);
			poL_bldr.addSet(t.can_flg);
			poL_bldr.addSet(t.edi_flg);
			poL_bldr.addSet(t.aprv_flg);
			poL_bldr.addSet(t.aprv_no);
			poL_bldr.addSet(t.aprv_sts_typ);
			poL_bldr.addSet(t.dlv_slip_form_cd);
			poL_bldr.addSet(t.trd_rmrks);
			poL_bldr.addSet(t.intr_rmrks);
			poL_bldr.addSet(t.po_print_rmrks);
			poL_bldr.addSet(t.dlv_slip_rmrks);
			poL_bldr.addSet(t.sub_char1);
			poL_bldr.addSet(t.sub_char2);
			poL_bldr.addSet(t.sub_char3);
			poL_bldr.addSet(t.edi_sub_char1);
			poL_bldr.addSet(t.edi_sub_char2);
			poL_bldr.addSet(t.edi_sub_char3);
			poL_bldr.addSet(t.edi_sub_char4);
			poL_bldr.addSet(t.edi_sub_char5);
			poL_bldr.addSet(t.edi_sub_num1);
			poL_bldr.addSet(t.edi_sub_dt1);
		}
		/**
		 * 更新項目を設定します(発注ヘッダ)
		 */
		protected void editUpdPoSubCol(MCList<MST_PO_R> poL, MCQueryApiBuilder poL_bldr, MST_PO_R t) {
			poL_bldr.setSet(t.po_no);
			poL_bldr.addSet(t.po_rev);
			poL_bldr.addSet(t.dlv_slip_form_cd);
			poL_bldr.addSet(t.sgl_form_flg);
			
			poL_bldr.addSet(t.intr_rmrks);
			poL_bldr.addSet(t.sub_char1);
			poL_bldr.addSet(t.sub_char2);
			poL_bldr.addSet(t.sub_char3);
			poL_bldr.addSet(t.edi_sub_char1);
			poL_bldr.addSet(t.edi_sub_char2);
			poL_bldr.addSet(t.edi_sub_char3);
			poL_bldr.addSet(t.edi_sub_char4);
			poL_bldr.addSet(t.edi_sub_char5);
			poL_bldr.addSet(t.edi_sub_num1);
			poL_bldr.addSet(t.edi_sub_dt1);
		}
		/**
		 * 更新項目を設定します（発注明細）
		 */
		protected void editUpdPoDCol(MCList<MST_PO_D_R> poDL, MCQueryApiBuilder poDL_bldr, MST_PO_D_R t) {
			poDL_bldr.setSet(t.po_d_no);
			poDL_bldr.addSet(t.po_no);
			poDL_bldr.addSet(t.po_rev);
			poDL_bldr.addSet(t.po_schd_no);
			poDL_bldr.addSet(t.disp_seq);
			poDL_bldr.addSet(t.itm_cd);
			poDL_bldr.addSet(t.itm_sub1);
			poDL_bldr.addSet(t.itm_sub2);
			poDL_bldr.addSet(t.itm_sub3);
			poDL_bldr.addSet(t.ver_no);
			poDL_bldr.addSet(t.itm_nm);
			poDL_bldr.addSet(t.iv_itm_nm);
			poDL_bldr.addSet(t.sno1);
			poDL_bldr.addSet(t.sno2);
			poDL_bldr.addSet(t.sno3);
			poDL_bldr.addSet(t.sno4);
			poDL_bldr.addSet(t.purc_rsn_cd);
			poDL_bldr.addSet(t.purc_id_typ);
			poDL_bldr.addSet(t.sundry_itm_flg);
			poDL_bldr.addSet(t.sppl_itm_cd);
			poDL_bldr.addSet(t.sppl_itm_nm);
			poDL_bldr.addSet(t.ap_dpt_cd);
			poDL_bldr.addSet(t.maker_cd);
			poDL_bldr.addSet(t.bp_lot_no);
			poDL_bldr.addSet(t.in_to_loc_cd);
			poDL_bldr.addSet(t.str_ln_cd);
			poDL_bldr.addSet(t.dlv_cd);
			poDL_bldr.addSet(t.dlv_sundry_flg);
			poDL_bldr.addSet(t.dlv_nm);
			poDL_bldr.addSet(t.dlv_cntct_dpt);
			poDL_bldr.addSet(t.dlv_cntct_psn);
			poDL_bldr.addSet(t.dlv_zip_cd);
			poDL_bldr.addSet(t.dlv_addr1);
			poDL_bldr.addSet(t.dlv_addr2);
			poDL_bldr.addSet(t.dlv_addr3);
			poDL_bldr.addSet(t.dlv_addr4);
			poDL_bldr.addSet(t.dlv_tel);
			poDL_bldr.addSet(t.dlv_fax);
			poDL_bldr.addSet(t.tdlv_cd);
			poDL_bldr.addSet(t.tdlv_sundry_flg);
			poDL_bldr.addSet(t.tdlv_nm);
			poDL_bldr.addSet(t.tdlv_zip_cd);
			poDL_bldr.addSet(t.tdlv_cntct_dpt);
			poDL_bldr.addSet(t.tdlv_cntct_psn);
			poDL_bldr.addSet(t.tdlv_addr1);
			poDL_bldr.addSet(t.tdlv_addr2);
			poDL_bldr.addSet(t.tdlv_addr3);
			poDL_bldr.addSet(t.tdlv_addr4);
			poDL_bldr.addSet(t.tdlv_tel);
			poDL_bldr.addSet(t.tdlv_fax);
			poDL_bldr.addSet(t.dlv_rqst_tm);
			poDL_bldr.addSet(t.purc_lt);
			poDL_bldr.addSet(t.rqst_dlv_rqst_tm);
			poDL_bldr.addSet(t.rqst_avl_rqst_dt);
			poDL_bldr.addSet(t.purc_schd_dt);
			poDL_bldr.addSet(t.sync_flg);
			poDL_bldr.addSet(t.purc_upri_req_typ);
			poDL_bldr.addSet(t.trd_unit_qty);
			poDL_bldr.addSet(t.trd_unit_cd);
			poDL_bldr.addSet(t.base_unit_qty);
			poDL_bldr.addSet(t.base_unit_cd);
			poDL_bldr.addSet(t.interim_flg);
			poDL_bldr.addSet(t.upri_not_tgt_flg);
			poDL_bldr.addSet(t.trd_cur_upri);
			poDL_bldr.addSet(t.trd_cur_proc_upri);
			poDL_bldr.addSet(t.trd_cur_onr_prov_upri);
			poDL_bldr.addSet(t.trd_cur_amt);
			poDL_bldr.addSet(t.trd_cur_proc_amt);
			poDL_bldr.addSet(t.trd_cur_onr_prov_amt);
			poDL_bldr.addSet(t.trd_cur_tax_amt);
			poDL_bldr.addSet(t.trd_cur_dscnt_amt);
			poDL_bldr.addSet(t.dscnt_rsn_cd);
			poDL_bldr.addSet(t.tax_fix_flg);
			poDL_bldr.addSet(t.tax_cd);
			poDL_bldr.addSet(t.wtax_rate);
			poDL_bldr.addSet(t.wtax_amt);
			poDL_bldr.addSet(t.drct_dlv_typ);
			poDL_bldr.addSet(t.mfg_loc_cd);
			poDL_bldr.addSet(t.bom_ptn);
			poDL_bldr.addSet(t.bndl_flg);
			poDL_bldr.addSet(t.outsrc_itm_ord_no);
			poDL_bldr.addSet(t.outsrc_flg);
			poDL_bldr.addSet(t.uplnd_flg);
			poDL_bldr.addSet(t.schd_chg_flg);
			poDL_bldr.addSet(t.po_conf_rcpt_flg);
			poDL_bldr.addSet(t.po_conf_rcpt_dt);
			poDL_bldr.addSet(t.pri_print_flg);
			poDL_bldr.addSet(t.dlv_slip_invalid_flg);
			poDL_bldr.addSet(t.pay_crryovr_times);
			poDL_bldr.addSet(t.slo_no);
			poDL_bldr.addSet(t.slo_d_no);
			poDL_bldr.addSet(t.io_schd_pr_no);
			poDL_bldr.addSet(t.bd_itm_cd);
			poDL_bldr.addSet(t.bd_itm_sub1);
			poDL_bldr.addSet(t.bd_itm_sub2);
			poDL_bldr.addSet(t.bd_itm_sub3);
			poDL_bldr.addSet(t.bd_sno1);
			poDL_bldr.addSet(t.bd_sno2);
			poDL_bldr.addSet(t.bd_sno3);
			poDL_bldr.addSet(t.bd_sno4);
			poDL_bldr.addSet(t.bd_loc_cd);
			poDL_bldr.addSet(t.bd_lot_no);
			poDL_bldr.addSet(t.bd_sublot_no);
			poDL_bldr.addSet(t.bd_dpt_cd);
			poDL_bldr.addSet(t.bd_wg_cd);
			poDL_bldr.addSet(t.bd_ctg_cd);
			poDL_bldr.addSet(t.bd_oper_cd);
			poDL_bldr.addSet(t.bd_slo_no);
			poDL_bldr.addSet(t.bd_iv_no);
			poDL_bldr.addSet(t.bd_po_no);
			poDL_bldr.addSet(t.bd_bp_cd);
			poDL_bldr.addSet(t.intr_rmrks);
			poDL_bldr.addSet(t.trd_d_rmrks);
			poDL_bldr.addSet(t.po_print_d_rmrks);
			poDL_bldr.addSet(t.dlv_slip_d_rmrks);
			poDL_bldr.addSet(t.sub_char1);
			poDL_bldr.addSet(t.sub_char2);
			poDL_bldr.addSet(t.sub_char3);
			poDL_bldr.addSet(t.edi_sub_d_char1);
			poDL_bldr.addSet(t.edi_sub_d_char2);
			poDL_bldr.addSet(t.edi_sub_d_char3);
			poDL_bldr.addSet(t.edi_sub_d_char4);
			poDL_bldr.addSet(t.edi_sub_d_char5);
			poDL_bldr.addSet(t.edi_sub_d_num1);
			poDL_bldr.addSet(t.edi_sub_d_dt1);
			poDL_bldr.addSet(t.rqst_can_flg);
			poDL_bldr.addSet(t.purc_basis_typ);
		}
		/**
		 * 更新項目を設定します（発注明細）
		 */
		protected void editUpdPoDColSub(MCList<MST_PO_D_R> poDL, MCQueryApiBuilder poDL_bldr, MST_PO_D_R t) {
			poDL_bldr.setSet(t.po_d_no);
			poDL_bldr.addSet(t.po_rev);
			poDL_bldr.addSet(t.disp_seq);
			poDL_bldr.addSet(t.po_conf_rcpt_flg);
			poDL_bldr.addSet(t.po_conf_rcpt_dt);
			poDL_bldr.addSet(t.sub_char1);
			poDL_bldr.addSet(t.sub_char2);
			poDL_bldr.addSet(t.sub_char3);
			poDL_bldr.addSet(t.edi_sub_d_char1);
			poDL_bldr.addSet(t.edi_sub_d_char2);
			poDL_bldr.addSet(t.edi_sub_d_char3);
			poDL_bldr.addSet(t.edi_sub_d_char4);
			poDL_bldr.addSet(t.edi_sub_d_char5);
			poDL_bldr.addSet(t.edi_sub_d_num1);
			poDL_bldr.addSet(t.edi_sub_d_dt1);
			poDL_bldr.addSet(t.intr_rmrks);
			poDL_bldr.addSet(t.trd_d_rmrks);
			poDL_bldr.addSet(t.po_print_d_rmrks);
			poDL_bldr.addSet(t.dlv_slip_d_rmrks);
		}
		
		/**
		 * 更新項目を設定します（発注明細）
		 */
		protected void editUpdPoDColAbort(MCList<MST_PO_D_R> poDL, MCQueryApiBuilder poDL_bldr, MST_PO_D_R t) {
			poDL_bldr.setSet(t.po_d_no);
			poDL_bldr.addSet(t.po_rev);
		}
		
		protected void callOrdRegUpd04ForBndl(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL) {
			
			MCIndexKey hdrIdx = hdrL.createIndex(Po_Ins01_HdrR.$peg_no);
			MCList<Po_Ins01_DtlR> tgtDtlL = MCList.create(Po_Ins01_DtlR.class);
			for (Po_Ins01_DtlR r : dtlL) {
				Po_Ins01_HdrR hdrR = hdrL.getFirst(hdrIdx, r.hdr_peg_no());
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
						&& MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && r.bndl_flg()) {
					tgtDtlL.add(r);
				}
			}
			
			if (isNull(tgtDtlL)) {
				return;
			}
			
			MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();
			o.up0().addAll(getOrdUpd04Up0(tgtDtlL));
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected MCList<Ord_Upd04_DtlR> getOrdUpd04Up0(MCList<Po_Ins01_DtlR> bind) {
			MCList<MST_PO_SCHD_R> dbc = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.pln_itm_ord_no);
			dbc_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			dbc_bldr.addWhereWithAnd(t.pln_itm_ord_no.isNotNull());
			dbSelect("MSBDL5100_MST_PO_SCHD_S05", dbc, dbc_bldr, bind);
			if (dbc.isEmpty()) return null;

			MCList<Ord_Upd04_DtlR> l = MCList.create(Ord_Upd04_DtlR.class);
			setAll(l, dbc, createMap_Ord_Upd04_DtlR_MST_PO_SCHD_R());
			l.setString(Ord_Upd04_DtlR.$itm_ord_typ, MSC_ITM_ORD_TYP.PURC.value());
			return l;
		}
		
		protected Map_Ord_Upd04_DtlR_MST_PO_SCHD_R<Ord_Upd04_DtlR,MST_PO_SCHD_R> createMap_Ord_Upd04_DtlR_MST_PO_SCHD_R() {
			return new Map_Ord_Upd04_DtlR_MST_PO_SCHD_R<Ord_Upd04_DtlR, MST_PO_SCHD_R>();
		}

		public class Map_Ord_Upd04_DtlR_MST_PO_SCHD_R<D extends Ord_Upd04_DtlR, S extends MST_PO_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, MST_PO_SCHD_R.$pln_itm_ord_no);
			}
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().addAll(up0());
			down1().addAll(up1());
		}
	}
	protected void callOrdRegUpdSV(MCList<Po_Ins01_DtlR> up1L, MCList<Po_Ins01_Bndl_DtlR> up2L) {
		if (isNull(object(CLAZZ)._ordChkDtl1Cache)) {
			return;
		}
		MCIndexKey idxCache = object(CLAZZ)._ordChkDtl1Cache.createIndex(Ord_Upd01_Dtl1R.$peg_no);
		MSBCL_OrdRegService.Ord_Upd01 ordUpd01 = MSBCL_OrdRegService.crtOrd_Upd01();
		for (Po_Ins01_DtlR dtlR : up1L) {
			if (dtlR.err_flg()) {
				continue;
			}
			Ord_Upd01_Dtl1R tgtR = object(CLAZZ)._ordChkDtl1Cache.getFirst(idxCache, dtlR.peg_no());
			ordUpd01.up0().add(tgtR);
		}
		if (ordUpd01.up0().isEmpty()) {
			return;
		}
		
		ordUpd01.exec();
		
		MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
		poSchdL_bldr.setSelect(t.outsrc_itm_ord_no, t.po_schd_no);
		poSchdL_bldr.setWhere(t.outsrc_itm_ord_no.eq(bind("itm_ord_no")));
		dbSelect("MSBDL5100_MST_PO_SCHD_S03", poSchdL, poSchdL_bldr, ordUpd01.down0());
		
		String[] destCols = new String[] {Po_Ins01_DtlR.$outsrc_itm_ord_no};
		String[] srcCols = new String[] {Ord_Upd01_Rslt1R.$itm_ord_no};
		copyByPegNo(up1L, destCols, ordUpd01.down0(), srcCols);
		
		MCIndexKey idx = poSchdL.createIndex(MST_PO_SCHD_R.$outsrc_itm_ord_no);
		for (Po_Ins01_DtlR r : up1L) {
			if (isNull(r.outsrc_itm_ord_no())) {
				continue;
			}
			MST_PO_SCHD_R schdR = poSchdL.getFirst(idx, r.outsrc_itm_ord_no());
			if (isNull(schdR)) {
				continue;
			}
			r.po_schd_no(schdR.po_schd_no());
			MCList<Po_Ins01_Bndl_DtlR> subBDtlL = up2L.subList(Po_Ins01_Bndl_DtlR.$dtl_peg_no, r.peg_no());
			subBDtlL.setValue(Po_Ins01_Bndl_DtlR.$po_schd_no, r.po_schd_no());
		}
	}
	
	protected void callOrdRegUpdSVForDel(MCList<Po_Ins01_DtlR> up1L) {
		MSBCL_OrdRegService.Ord_Chk01 ordChk01 = MSBCL_OrdRegService.crtOrd_Chk01();
		MSBCL_OrdRegService.Ord_Upd01 ordUpd01 = MSBCL_OrdRegService.crtOrd_Upd01();
		for (Po_Ins01_DtlR dtlR : up1L) {
			if (dtlR.uplnd_outsrc_flg() && MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				Ord_Upd01_Dtl1R ordUpd01DtlR = Ord_Upd01_Dtl1R.create();
				ordUpd01DtlR.peg_no(dtlR.peg_no());
				ordUpd01DtlR.mrp_typ(MSC_MRP_TYP.MRP.value());
				ordUpd01DtlR.data_crud_typ(dtlR.data_crud_typ());
				ordUpd01DtlR.itm_ord_no(dtlR.outsrc_itm_ord_no());
				ordUpd01DtlR.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				ordUpd01DtlR.ord_gnrt_typ(MSC_ORD_GNRT_TYP.UPLND.value());
				ordUpd01DtlR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				ordUpd01DtlR.uplnd_outsrc_flg(dtlR.uplnd_outsrc_flg());
				ordUpd01DtlR.mfg_loc_cd(dtlR.mfg_loc_cd());
				ordUpd01.up0().add(ordUpd01DtlR);
				ordChk01.up0().add(ordUpd01DtlR);
			}
		}
		if (!ordUpd01.up0().isEmpty()) {
			// オーダ登録サービス.オーダ更新での後続処理（出荷・供給依頼サービスや発注予定登録サービスなど）では、
			// オーダ更新チェック処理が行われていることが前提のため（チェック処理でキャッシュしたマスタ情報を参照している）、
			// オーダ登録サービス.オーダ更新チェック処理を先に呼び出す
			// チェック処理の呼び出しでエラーになることはない
			// オーダ登録サービス.オーダ更新チェック
			ordChk01.exec();
			// オーダ登録サービス.オーダ更新
			ordUpd01.exec();
		}
	}
	protected MCList<MST_PO_SCHD_R> _cahcePoSchdForUplndOutsrc = MCList.create(MST_PO_SCHD_R.class);
	protected MCIndexKey _idxCahcePoSchdForUplndOutsrc = null;
	protected void createCacheForUplndOutsrc(MCList<Po_Ins01_DtlR> dtlL) {
		MST_PO_SCHD_R cahcePoSchdForUplndOutsrc_t = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder cahcePoSchdForUplndOutsrc_bldr = MCQueryApiBuilder.create(cahcePoSchdForUplndOutsrc_t);
		cahcePoSchdForUplndOutsrc_bldr.setSelect(
				cahcePoSchdForUplndOutsrc_t.po_schd_no,
				cahcePoSchdForUplndOutsrc_t.po_schd_src_typ,
				cahcePoSchdForUplndOutsrc_t.mfg_loc_cd,
				cahcePoSchdForUplndOutsrc_t.pln_itm_ord_no);
		dbSelectKey("MSBDL5100_MST_PO_SCHD_S04", _cahcePoSchdForUplndOutsrc, cahcePoSchdForUplndOutsrc_bldr, dtlL);
		_idxCahcePoSchdForUplndOutsrc = _cahcePoSchdForUplndOutsrc.createIndex(MST_PO_SCHD_R.$po_schd_no);
	}
	protected MST_PO_SCHD_R getCacheForUplndOutsrc(String poSchdNo) {
		return _cahcePoSchdForUplndOutsrc.getFirst(_idxCahcePoSchdForUplndOutsrc, poSchdNo);
	}
	/**
	 * Po_Del01オペレーション.<p>
	 *
	 * 発注情報を取り消す<br>
	 */
	public class Po_Del01 extends MSBDL_PoRegService_MC_A.Po_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 発注予定キャッシュ作成（計画外外注発注用）
			createCacheForUplndOutsrc(up1());
			// キャッシュ作成
			createCache(up0(), up1(), up2());
			// 補完処理
			completion(up0(), up1(), up2());
			// 承認処理
			callAprvDel01(up0());
			// 外注品のオーダ、支給品の受払予定を登録・訂正・削除する
			callOrdUpd01(up0(), up1(), up2());
			// 外注製造指図サービス
			callOutSrcInstUpd01(up1());
			// 発注削除
			delPo(up0(), up1());
			// 入荷予定サービス（発注予定ＮＯを入荷予定で見たいため、必ず発注予定更新の前に呼ぶ）
			callSchdArrUpd01(up0(), up1(), up2());
			// 発注予定更新
			callPoSchdUpd02(up1());
			// 品目オーダ実績項目更新
			callOrdUpd04(up1());
			// 購買納期調整登録
			callPrmsDel01(up1(), up2());
			// 承認提供サービス（次処理済更新・次処理済解除）
			callAprvUpd(up1(), up2());
			// 受注状況更新サービス
			callSlsUpd(up1());
			// 購買納品書登録、発行サービス
			callPurcPrntUpd01(up0(), up1());
			// 購買帳票発行サービス
			callPurcPrnt01(up0(), up1());
			callPurcPrntUpd02(up0(), up1());
			// オーダ登録サービス（計画外外注発注・削除用）
			callOrdRegUpdSVForDel(up1());
			callPoEDI(up0(), up1(), up2());
			// 与信更新サービス
			callCredUpd02(up0(), up1());

		}
		/**
		 * 発注予定サービス呼び出し処理(取消)
		 * @param hdrL
		 * @param dtlL
		 */
		protected void callPoSchdUpd02(MCList<Po_Ins01_DtlR> dtlL){
			MSBDL_PoSchdRegService.PoSchd_Upd02 poSchdUpd02 = MSBDL_PoSchdRegService.crtPoSchd_Upd02();
			for (Po_Ins01_DtlR dtlR : dtlL) {
				poSchdUpd02.up0().addAll(makePoSchdUpd02Clear(dtlR));
			}
			if (poSchdUpd02.up0().size() > 0) {
				poSchdUpd02.exec();
			}
		}
		protected void callOrdUpd04(MCList<Po_Ins01_DtlR> dtlL) {
			MSBCL_OrdRegService.Ord_Upd04 ordUpd04 = MSBCL_OrdRegService.crtOrd_Upd04();
			for (Po_Ins01_DtlR dtlR : dtlL) {
				MCList<MST_PO_SCHD_R> poSchdL = getCachePoSchdByPoDNo(dtlR.po_d_no());
				for (MST_PO_SCHD_R r : poSchdL) {
					if (isNull(r.pln_itm_ord_no())) {
						continue;
					}
					Ord_Upd04_DtlR ordUpd04DtlR = Ord_Upd04_DtlR.create();
					ordUpd04DtlR.itm_ord_no(r.pln_itm_ord_no());
					if (dtlR.outsrc_flg()) {
						ordUpd04DtlR.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
					}
					else {
						ordUpd04DtlR.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
					}
					ordUpd04.up0().add(ordUpd04DtlR);
				}
			}
			if (!ordUpd04.up0().isEmpty()) {
				ordUpd04.exec();
			}
		}
		
		/**
		 * 発注情報を削除します
		 * @param hdrL
		 * @param dtlL
		 */
		protected void delPo(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL) {
			MCList<MST_PO_R> delPoL = MCList.create(MST_PO_R.class);
			MCList<MST_PO_D_R> delPoDL = MCList.create(MST_PO_D_R.class);
			
			for (Po_Ins01_HdrR hdrR : hdrL) {
				hdrR.can_flg(true);
				hdrR.po_print_flg(false);
				hdrR.aprv_flg(false);
				hdrR.aprv_no(null);
				hdrR.aprv_sts_typ(null);
				delPoL.add(hdrR.po());
			}
			for (Po_Ins01_DtlR dtlR : dtlL) {
				delPoDL.add(dtlR.pod());
			}
			
			if (delPoL.size() > 0) {
				MST_PO_R delPoL_t = MST_PO_R.create("T");
				MCQueryApiBuilder delPoL_bldr = MCQueryApiBuilder.create(delPoL_t);
				editDelPoCol(delPoL, delPoL_bldr, delPoL_t);
				dbUpdateKey("MSBDL5100_MST_PO_U03", delPoL, delPoL_bldr);
			}
			if (delPoDL.size() > 0) {
				MST_PO_D_R delPoDL_t = MST_PO_D_R.create("T");
				MCQueryApiBuilder delPoDL_bldr = MCQueryApiBuilder.create(delPoDL_t);
				editDelPoDCol(delPoDL, delPoDL_bldr, delPoDL_t);
				dbUpdateKey("MSBDL5100_MST_PO_D_U05", delPoDL, delPoDL_bldr);
			}
			if (delPoL.size() > 0) {
				// 改訂履歴データ更新サービス呼出（発注改訂履歴テーブル更新）
				callRevDataServiceIns01(delPoL);
			}
		}
		
		/**
		 * 削除のための更新項目を設定します(発注ヘッダ)
		 */
		protected void editDelPoCol(MCList<MST_PO_R> poL, MCQueryApiBuilder poL_bldr, MST_PO_R t) {
			poL_bldr.setSet(t.po_no);
			poL_bldr.addSet(t.can_flg);
			poL_bldr.addSet(t.po_print_flg);
			poL_bldr.addSet(t.crct_rsn_cd);
			poL_bldr.addSet(t.po_print_cd);
			poL_bldr.addSet(t.edi_flg);
			poL_bldr.addSet(t.aprv_flg);
			poL_bldr.addSet(t.aprv_no);
			poL_bldr.addSet(t.aprv_sts_typ);
		}

		protected void editDelPoDCol(MCList<MST_PO_D_R> delPoDL, MCQueryApiBuilder delPoDL_bldr, MST_PO_D_R t) {
			delPoDL_bldr.setSetVL(t.can_flg, value(true));
		}
	}
	
	//----------------------------------------------------------
	// 以降共通メソッド
	//----------------------------------------------------------
	/**
	 * キャッシュ作成
	 * @param hdrL
	 * @param dtlL
	 */
	protected void createCache(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		// 品目オーダ
		createCacheItmOrder(dtl2L);
	}
	/**
	 * 補完処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void completion(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		MCIndexKey idx = dtlL.createIndex(Po_Ins01_DtlR.$hdr_peg_no);
		for (Po_Ins01_HdrR hdrR : hdrL) {
			MCList<Po_Ins01_DtlR> subL = dtlL.subList(idx, hdrR.peg_no()); 
			MCIndexKey dtlIdx = dtl2L.createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			MCNumber ttlAmt = MCNumber.ZERO;
			
			// 変更前の状態を比較値として保持
			if (!isNull(hdrR.po_no())) {
				MST_PO_R poR = getCachePo(hdrR.po_no());
				hdrR.bef_po_rev(poR.po_rev());
				hdrR.bef_aprv_sts_typ(poR.aprv_sts_typ());
				hdrR.bef_po_print_flg(poR.po_print_flg());
				hdrR.bef_aprv_no(poR.aprv_no());
				hdrR.bef_edi_flg(poR.edi_flg());
				// 更新時は伝票帳票コードなし→ありに変わった場合だけ、登録を許容する。
				// (納品書の番号体系が変わるので、伝票帳票コードの変更は許容しない）
				if (isNull(poR.dlv_slip_form_cd()) && !isNull(hdrR.sppl_ship_form_cd())) {
					MAM_SLIP_FORM_R slipFormR = getCacheSlipForm(hdrR.sppl_ship_form_cd());
					hdrR.dlv_slip_form_cd(hdrR.sppl_ship_form_cd());
					hdrR.sgl_form_flg(isSame(slipFormR.line_num(), MCNumber.valueOf(1)));
				}
				else {
					hdrR.dlv_slip_form_cd(poR.dlv_slip_form_cd());
					hdrR.sgl_form_flg(poR.sgl_form_flg());
				}
			}
			else {
				if (!isNull(hdrR.sppl_ship_form_cd())) {
					MAM_SLIP_FORM_R slipFormR = getCacheSlipForm(hdrR.sppl_ship_form_cd());
					hdrR.dlv_slip_form_cd(hdrR.sppl_ship_form_cd());
					hdrR.sgl_form_flg(isSame(slipFormR.line_num(), MCNumber.valueOf(1)));
				}
			}
			
			// ヘッダに対応する明細を取得し処理する。
			for (Po_Ins01_DtlR dtlR : subL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					
					// 打切でなければ、承認用に合計金額を算出
					if (!dtlR.abort_flg()) {
						MCNumber trdCurAmt = nvl(dtlR.trd_cur_amt(), MCNumber.ZERO);
						MCNumber trdCurTaxAmt = nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO);
						MCNumber subTttlAmt = trdCurAmt.add(trdCurTaxAmt);
						if (getCacheItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()).dscnt_itm_flg()) {
							ttlAmt = ttlAmt.subtract(subTttlAmt);
						}
						else {
							ttlAmt = ttlAmt.add(subTttlAmt);
						}
					}
					
					// 最終承認済あるいは一時承認済の発注訂正で、承認引戻がオフの場合は備考項目のみ更新とする
					if ((MAC_APRV_STS_TYP.isFIX(hdrR.bef_aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(hdrR.bef_aprv_sts_typ()))
							&& !hdrR.aprv_rvrs_flg()) {
						dtlR.only_upd_pod_flg(true);
					}
				}
				
				if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					MST_ARR_PR_R arrPr = getCacheArrPr(dtlR.po_d_no());
					if (!isNull(arrPr)) {
						// 打切処理は通常の更新処理とわけるため、今回打切処理かを判定するため、旧打切ＦＬＧを比較値として保持しておく。
						dtlR.bef_abort_flg(arrPr.abort_flg());
					}
				}
				
				// ヘッダ項目を明細にコピー
				copyHdrToDtl(hdrR, dtlR);
				
				// その他補完
				if (!dtlR.sundry_itm_flg()) {
					dtlR.itm_nm(null);
					dtlR.iv_itm_nm(null);
				}
				
				if (isNull(dtlR.po_d_no())) {
					// 計画の発注登録前
					// ※明細の発注明細ＮＯがNULLになるのは計画外新規と、まとめた場合
					//   ただし指図済みの場合はまとめられないため、この分岐に入った場合は、計画の登録行にしぼられる。
					MST_PO_SCHD_R poSchdR = getCachePoSchdByPoSchdNo(dtlR.po_schd_no());
					dtlR.bef_base_unit_qty(poSchdR.base_unit_qty());
					dtlR.bef_sno1(poSchdR.sno1());
					dtlR.bef_sno2(poSchdR.sno2());
					dtlR.bef_sno3(poSchdR.sno3());
					dtlR.bef_sno4(poSchdR.sno4());
				}
				else {
					MST_PO_D_R podR = getCachePoD(dtlR.po_d_no());
					dtlR.bef_base_unit_qty(podR.base_unit_qty());
					dtlR.bef_sno1(podR.sno1());
					dtlR.bef_sno2(podR.sno2());
					dtlR.bef_sno3(podR.sno3());
					dtlR.bef_sno4(podR.sno4());
					if (!dtlR.bndl_flg()) {
						// まとめＦＬＧはオンになった後オフになることはない
						dtlR.bndl_flg(podR.bndl_flg());
					}
					if (!dtlR.outsrc_flg()) {
						dtlR.outsrc_flg(podR.outsrc_flg());
					}
					// 削除の場合に受注状況更新サービスを呼びだすための項目
					complSloStsUpdParam(dtlR, podR);
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())
						&& !isNull(dtlR.po_schd_no())) {
					MST_PO_SCHD_R schdR = getCacheForUplndOutsrc(dtlR.po_schd_no());
					if (MSC_PO_SCHD_SRC_TYP.isPPLN(schdR.po_schd_src_typ())
							&& isNull(schdR.pln_itm_ord_no()) && dtlR.outsrc_flg() && !dtlR.bndl_flg()) {
						dtlR.mfg_loc_cd(schdR.mfg_loc_cd());
						dtlR.uplnd_outsrc_flg(true);
					}
				}
				MCList<Po_Ins01_Bndl_DtlR> subDtl2L = dtl2L.subList(dtlIdx, dtlR.peg_no());
				// 新規で計画外の場合
				if (subDtl2L.isEmpty()) {
					dtlR.uplnd_flg(true);
					dtlR.schd_chg_flg(true);
				}
				for (Po_Ins01_Bndl_DtlR dtl2R : subDtl2L) {
					// まとめ対象を補完。明細に対応するまとめ対象を処理。
					MST_PO_SCHD_R poSchdR = getCachePoSchdByPoSchdNo(dtl2R.po_schd_no());
					
					if (!poSchdR.isEmpty()) {
						// 更新処理時に、受注が承認対象であった場合は、次処理済ＦＬＧを更新するため各キーを控えておく。
						MST_SLO_R sloR = getCacheSlo(poSchdR.slo_no());
						dtl2R.slo_no(sloR.slo_no());
						// 紐切れではない受注紐付きの発注予定が1件でも存在すれば、発注明細の依頼元受注ＦＬＧをオンにする
						if (!isNull(dtl2R.slo_no()) && !poSchdR.rqst_can_flg()) {
							dtlR.rqst_slo_flg(true);
						}
						dtl2R.aprv_no(sloR.aprv_no());
						dtl2R.outsrc_itm_ord_no(poSchdR.outsrc_itm_ord_no());
					}
					
					// 品目オーダを元に計画外ＦＬＧ、計画変更ＦＬＧを設定
					MST_ITM_ORDER_R itmOrderR = getCacheItmOrder(dtl2R.po_schd_no());
					
					if (!itmOrderR.isEmpty()) {
						// 対応する品目オーダと予定日、数量が違う場合は計画変更をオン
						// まとめを行っている場合は常にオン
						if (!isSame(itmOrderR.inst_qty(), dtlR.base_unit_qty()) || !isSame(itmOrderR.po_schd_dt(), hdrR.po_dt())
								|| !isSame(itmOrderR.strg_schd_dt(), dtlR.dlv_rqst_tm().trunc(MCDateFieldType.DAY)) || dtlR.bndl_flg()) {
							dtlR.schd_chg_flg(true);
						}
						else {
							dtlR.schd_chg_flg(false);
						}
					}
					// 対応する品目オーダがない場合は計画外・計画変更ともにオン
					else {
						dtlR.uplnd_flg(true);
						dtlR.schd_chg_flg(true);
					}
				}
			}
			hdrR.trd_cur_ttl_amt(ttlAmt);
			setDlvSlip(hdrR);
		}
		// ヘッダ項目が明細に補完されている必要があるので、ここでキャッシュする
		createCacheItmDtl(dtlL);
		completeUp1(dtlL);
	}
	
	protected void completeUp1(MCList<Po_Ins01_DtlR> dtlL) {
		for (Po_Ins01_DtlR dtlR : dtlL) {
			setPurcLt(dtlR);
			setDlvSlip(dtlR);
		}
	}

	protected void setPurcLt(Po_Ins01_DtlR dtlR) {
		if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
			return;
		}
		MAM_ITM_DTL_R itmDtlR = getItmDtl(dtlR);
		MAM_PURC_DDLV_LT_R purcDdlvLtR = getCachePurcDdlvLt(dtlR);
		dtlR.purc_lt(getPurcLt(purcDdlvLtR, itmDtlR, dtlR.dlv_cd(),
				isNull(getCacheLoc(dtlR.in_to_loc_cd()).sppl_cd()) ? false : true, dtlR.base_unit_qty()));

	}
	protected void complSloStsUpdParam(Po_Ins01_DtlR dtlR, MST_PO_D_R podR) {
		dtlR.slo_d_no(podR.slo_d_no());
		dtlR.rqst_can_flg(podR.rqst_can_flg());
		dtlR.po_no(podR.po_no());
		dtlR.po_d_no(podR.po_d_no());
	}
	
	protected void setDlvSlip(Po_Ins01_HdrR hdrR) {
		if (!isNull(hdrR.dlv_slip_form_cd())) {
			return;
		}
		MAM_BP_R bpR = getCacheBp(hdrR.sppl_cd());
		if (!isNull(bpR.sppl_ship_form_cd())) {
			MAM_SLIP_FORM_R formR = getCacheSlipForm(bpR.sppl_ship_form_cd());
			hdrR.po().dlv_slip_form_cd(bpR.sppl_ship_form_cd());
			hdrR.po().sgl_form_flg(isSame(formR.line_num(), MCNumber.ONE));
		}
	}
	
	protected void setDlvSlip(Po_Ins01_DtlR dtlR) {
		if (!isNullOr(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3())) {
			MAM_ITM_R itmR = getCacheItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
			dtlR.pod().dlv_slip_invalid_flg(itmR.arr_skip_flg() && !itmR.purc_dlv_slip_flg());
		}
	}
	
	/**
	 * ヘッダ項目を明細にコピー
	 */
	protected void copyHdrToDtl(Po_Ins01_HdrR hdrR, Po_Ins01_DtlR dtlR) {
		// ヘッダ項目を明細にコピー
		dtlR.sppl_cd(hdrR.sppl_cd());
		dtlR.trd_cur_cd(hdrR.trd_cur_cd());
		dtlR.po_dt(hdrR.po_dt());
		dtlR.trd_cd(hdrR.trd_cd());
		dtlR.trd_ptn_typ(hdrR.trd_ptn_typ());
		dtlR.purc_dpt_cd(hdrR.purc_dpt_cd());
		dtlR.wg_cd(hdrR.wg_cd());
		dtlR.purc_usr_cd(hdrR.purc_usr_cd());
	}
	
	/**
	 * 発注ＮＯを一括発番します。
	 * @param hdrL
	 */
	protected void setPoNo(MCList<Po_Ins01_HdrR> hdrL) {
		MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
		for (Po_Ins01_HdrR hdrR : hdrL) {
			ElmArgsR argsR = ElmArgsR.create();
			argsR.peg_no(hdrR.peg_no());
			argsR.co_cd(getCo().co_cd());
			argsR.trd_cd(hdrR.trd_cd());
			argsR.dpt_cd(hdrR.purc_dpt_cd());
			argsR.co_cd(getCo().co_cd());
			argsR.bp_cd(hdrR.sppl_cd());
			argsR.wg_cd(hdrR.wg_cd());
			argsR.dt(hdrR.po_dt());
			argsL.add(argsR);
		}
		setNum(MAC_NUM_BIZ_TYP.PO, argsL);
		String[] srcCols = {ElmArgsR.$new_no};
		String[] destCols = {Po_Ins01_HdrR.$po_no};
		copyByPegNo(hdrL, destCols, argsL, srcCols);
	}
	/**
	 * 改訂番号を取得します。
	 * @param befRevNo
	 * @return
	 */
	protected MCNumber getPoRev(Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
		if (isNull(hdrR.bef_po_rev())) {
			return MCNumber.ONE;
		}
		if (isIncrementRevTgt(hdrR, dtlL)) {
			return hdrR.bef_po_rev().add(MCNumber.ONE);
		}
		else {
			return hdrR.bef_po_rev();
		}
	}
	
	protected boolean isIncrementRevTgt(Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
		return ((hdrR.bef_po_print_flg() && isPoRptChanged(hdrR, dtlL))
		|| (hdrR.bef_edi_flg() && isEDIChanged(hdrR, dtlL)));
	}
	
	protected boolean isPoRptChanged(Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
		
		MST_PO_R poR = getCachePo(hdrR.po_no());
		if (!isColSame(hdrR, poR, getPoRptChkCols())) {
			return true;
		}
		else {
			for (Po_Ins01_DtlR dtlR : dtlL) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) 
					|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					return true;
				}
				
				if (!isSame(dtlR.abort_flg(), dtlR.bef_abort_flg())) {
					return true;
				}
				
				MST_PO_D_R poDR = getCachePoD(dtlR.po_d_no());
				if (!isColSame(dtlR, poDR, getPoDRptChkCols())) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	protected boolean isEDIChanged(Po_Ins01_HdrR hdrR, MCList<Po_Ins01_DtlR> dtlL) {
		
		MST_PO_R poR = getCachePo(hdrR.po_no());
		if (!isColSame(hdrR, poR, getPoEDIChkCols())) {
			return true;
		}
		else {
			for (Po_Ins01_DtlR dtlR : dtlL) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) 
					|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					return true;
				}
				if (!isSame(dtlR.abort_flg(), dtlR.bef_abort_flg())) {
					return true;
				}
				MST_PO_D_R poDR = getCachePoD(dtlR.po_d_no());
				if (!isColSame(dtlR, poDR, getPoDEDIChkCols())) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	protected String[] getPoRptChkCols() {
		return new String[] {
			MST_PO_R.$po_dt,
			MST_PO_R.$sppl_cd,
			MST_PO_R.$sppl_zip_cd,
			MST_PO_R.$sppl_addr1,
			MST_PO_R.$sppl_addr2,
			MST_PO_R.$sppl_addr3,
			MST_PO_R.$sppl_addr4,
			MST_PO_R.$sppl_cntct_dpt,
			MST_PO_R.$sppl_cntct_psn,
			MST_PO_R.$sppl_tel,
			MST_PO_R.$sppl_fax,
			MST_PO_R.$purc_dpt_cd,
			MST_PO_R.$purc_usr_cd,
			MST_PO_R.$trd_cd,
			MST_PO_R.$sub_char1,
			MST_PO_R.$sub_char2,
			MST_PO_R.$sub_char3,
			MST_PO_R.$trd_cur_cd,
			MST_PO_R.$po_print_cd,
			MST_PO_R.$crct_rsn_cd,
			MST_PO_R.$upd_po_print_schd_dt,
			MST_PO_R.$wrk_no,
			MST_PO_R.$tterm_cd1,
			MST_PO_R.$tterm_rmrks1,
			MST_PO_R.$tterm_cd2,
			MST_PO_R.$tterm_rmrks2,
			MST_PO_R.$tterm_cd3,
			MST_PO_R.$tterm_rmrks3,
			MST_PO_R.$po_print_rmrks,
		};
	}
	
	protected String[] getPoDRptChkCols() {
		return new String[] {
			MST_PO_D_R.$itm_cd,
			MST_PO_D_R.$itm_sub1,
			MST_PO_D_R.$itm_sub2,
			MST_PO_D_R.$itm_sub3,
			MST_PO_D_R.$itm_nm,
			MST_PO_D_R.$iv_itm_nm,
			MST_PO_D_R.$sno1,
			MST_PO_D_R.$sno2,
			MST_PO_D_R.$sno3,
			MST_PO_D_R.$sno4,
			MST_PO_D_R.$ver_no,
			MST_PO_D_R.$trd_unit_qty,
			MST_PO_D_R.$trd_unit_cd,
			MST_PO_D_R.$base_unit_cd,
			MST_PO_D_R.$interim_flg,
			MST_PO_D_R.$trd_cur_upri,
			MST_PO_D_R.$trd_cur_amt,
			MST_PO_D_R.$trd_cur_dscnt_amt,
			MST_PO_D_R.$tax_cd,
			MST_PO_D_R.$trd_cur_tax_amt,
			MST_PO_D_R.$dlv_rqst_tm,
			MST_PO_D_R.$in_to_loc_cd,
			MST_PO_D_R.$sppl_itm_cd,
			MST_PO_D_R.$sppl_itm_nm,
			MST_PO_D_R.$bp_lot_no,
			MST_PO_D_R.$maker_cd,
			MST_PO_D_R.$po_print_d_rmrks,
			MST_PO_D_R.$trd_cur_proc_upri,
			MST_PO_D_R.$trd_cur_proc_amt,
			MST_PO_D_R.$trd_cur_onr_prov_upri,
			MST_PO_D_R.$trd_cur_onr_prov_amt,
			MST_PO_D_R.$outsrc_flg,
			MST_PO_D_R.$disp_seq,
			MST_PO_D_R.$sub_char1,
			MST_PO_D_R.$sub_char2,
			MST_PO_D_R.$sub_char3,
			MST_PO_D_R.$dlv_cd,
			MST_PO_D_R.$dlv_nm,
			MST_PO_D_R.$dlv_zip_cd,
			MST_PO_D_R.$dlv_addr1,
			MST_PO_D_R.$dlv_addr2,
			MST_PO_D_R.$dlv_addr3,
			MST_PO_D_R.$dlv_addr4,
			MST_PO_D_R.$dlv_tel,
			MST_PO_D_R.$dlv_fax,
			MST_PO_D_R.$dlv_cntct_dpt,
			MST_PO_D_R.$dlv_cntct_psn,
			MST_PO_D_R.$tdlv_cd,
			MST_PO_D_R.$tdlv_nm,
			MST_PO_D_R.$tdlv_zip_cd,
			MST_PO_D_R.$tdlv_addr1,
			MST_PO_D_R.$tdlv_addr2,
			MST_PO_D_R.$tdlv_addr3,
			MST_PO_D_R.$tdlv_addr4,
			MST_PO_D_R.$tdlv_tel,
			MST_PO_D_R.$tdlv_fax,
			MST_PO_D_R.$tdlv_cntct_dpt,
			MST_PO_D_R.$tdlv_cntct_psn
		};
	}
	protected String[] getPoEDIChkCols() {
		return new String[] {
			MST_PO_R.$purc_dpt_cd,
			MST_PO_R.$purc_usr_cd,
			MST_PO_R.$wg_cd,
			MST_PO_R.$sppl_cd,
			MST_PO_R.$po_dt,
			MST_PO_R.$upd_po_print_schd_dt,
			MST_PO_R.$crct_rsn_cd,
			MST_PO_R.$trd_cur_cd,
			MST_PO_R.$wrk_no,
			MST_PO_R.$tterm_cd1,
			MST_PO_R.$tterm_rmrks1,
			MST_PO_R.$tterm_cd2,
			MST_PO_R.$tterm_rmrks2,
			MST_PO_R.$tterm_cd3,
			MST_PO_R.$tterm_rmrks3,
			MST_PO_R.$po_print_rmrks,
			MST_PO_R.$dlv_slip_rmrks,
			MST_PO_R.$edi_sub_char1,
			MST_PO_R.$edi_sub_char2,
			MST_PO_R.$edi_sub_char3,
			MST_PO_R.$edi_sub_char4,
			MST_PO_R.$edi_sub_char5,
			MST_PO_R.$edi_sub_num1,
			MST_PO_R.$edi_sub_dt1
		};
	}
	
	protected String[] getPoDEDIChkCols() {
		return new String[] {
				MST_PO_D_R.$drct_dlv_typ,
				MST_PO_D_R.$dlv_cd,
				MST_PO_D_R.$in_to_loc_cd,
				MST_PO_D_R.$dlv_nm,
				MST_PO_D_R.$dlv_zip_cd,
				MST_PO_D_R.$dlv_addr1,
				MST_PO_D_R.$dlv_addr2,
				MST_PO_D_R.$dlv_addr3,
				MST_PO_D_R.$dlv_addr4,
				MST_PO_D_R.$dlv_cntct_dpt,
				MST_PO_D_R.$dlv_cntct_psn,
				MST_PO_D_R.$dlv_tel,
				MST_PO_D_R.$dlv_fax,
				MST_PO_D_R.$dlv_sundry_flg,
				MST_PO_D_R.$tdlv_cd,
				MST_PO_D_R.$tdlv_nm,
				MST_PO_D_R.$tdlv_zip_cd,
				MST_PO_D_R.$tdlv_addr1,
				MST_PO_D_R.$tdlv_addr2,
				MST_PO_D_R.$tdlv_addr3,
				MST_PO_D_R.$tdlv_addr4,
				MST_PO_D_R.$tdlv_cntct_dpt,
				MST_PO_D_R.$tdlv_cntct_psn,
				MST_PO_D_R.$tdlv_tel,
				MST_PO_D_R.$tdlv_fax,
				MST_PO_D_R.$tdlv_sundry_flg,
				MST_PO_D_R.$itm_cd,
				MST_PO_D_R.$itm_sub1,
				MST_PO_D_R.$itm_sub2,
				MST_PO_D_R.$itm_sub3,
				MST_PO_D_R.$sno1,
				MST_PO_D_R.$sno2,
				MST_PO_D_R.$sno3,
				MST_PO_D_R.$sno4,
				MST_PO_D_R.$itm_nm,
				MST_PO_D_R.$iv_itm_nm,
				MST_PO_D_R.$maker_cd,
				MST_PO_D_R.$sppl_itm_cd,
				MST_PO_D_R.$sppl_itm_nm,
				MST_PO_D_R.$bp_lot_no,
				MST_PO_D_R.$ver_no,
				MST_PO_D_R.$trd_unit_cd,
				MST_PO_D_R.$trd_unit_qty,
				MST_PO_D_R.$tax_cd,
				MST_PO_D_R.$trd_cur_upri,
				MST_PO_D_R.$trd_cur_amt,
				MST_PO_D_R.$trd_cur_dscnt_amt,
				MST_PO_D_R.$dscnt_rsn_cd,
				MST_PO_D_R.$interim_flg,
				MST_PO_D_R.$tax_fix_flg,
				MST_PO_D_R.$trd_cur_tax_amt,
				MST_PO_D_R.$dlv_rqst_tm,
				MST_PO_D_R.$purc_schd_dt,
				MST_PO_D_R.$po_print_d_rmrks,
				MST_PO_D_R.$dlv_slip_d_rmrks,
				MST_PO_D_R.$sundry_itm_flg,
				MST_PO_D_R.$purc_id_typ,
				MST_PO_D_R.$outsrc_flg,
				MST_PO_D_R.$pri_print_flg,
				MST_PO_D_R.$edi_sub_d_char1,
				MST_PO_D_R.$edi_sub_d_char2,
				MST_PO_D_R.$edi_sub_d_char3,
				MST_PO_D_R.$edi_sub_d_char4,
				MST_PO_D_R.$edi_sub_d_char5,
				MST_PO_D_R.$edi_sub_d_num1,
				MST_PO_D_R.$edi_sub_d_dt1
		};
	}
	/**
	 * 製造指図サービスを実行するか否かを判定します。
	 * @param dtlR
	 * @return
	 */
	protected boolean doExecOutSrcInstSv(Po_Ins01_DtlR dtlR) {
		if (!dtlR.outsrc_flg()) {
			// 外注品でない場合
			return false;
		}
		else if (!MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) && updOnlyPod(dtlR)) {
			// 自身の更新がなく、他の明細更新に引きずられた更新の場合はオーダを作り直さない。
			return false;
		}
		return true;
	}
	
	/**
	 * 入荷予定サービスを実行するか否かを判定します。
	 * @param dtlR
	 * @return
	 */
	protected boolean doExecSchdArrSv(Po_Ins01_DtlR dtlR) {
		if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
			if (updOnlyPod(dtlR)) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return true;
		}
	}
	/**
	 * 品目オーダサービスを実行するか否かを判定します。
	 * @param r
	 * @return
	 */
	protected boolean doExecItmOrdSv(Po_Ins01_DtlR r) {
		// 打切・打切解除の場合は実施しない
		if (!isSame(r.abort_flg(), r.bef_abort_flg())) {
			return false;
		}
		if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && updOnlyPod(r)) {
			// 自身の更新がなく、他の明細更新に引きずられた更新の場合はオーダを作り直さない。
			return false;
		}
		else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
				|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
			if (r.outsrc_flg() && r.bndl_flg()) {
				// 品目オーダを作成するのは、外注かつまとめ時 
				// 外注製造指図ＳＶは基準単位数量・手配ＮＯ・納入希望日が変わった場合に再作成するが、オーダまでは作り直さない。
				return true;
			}
		}
		return false;
	}
	protected boolean doExecPoSchdUpdSv(Po_Ins01_DtlR r) {
		if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
			// 新規登録行のときは実行する
			return true;
		}
		if (updOnlyPod(r)) {
			// 自身の更新がなく、他の明細更新に引きずられた更新の場合はオーダを作り直さない。
			return false;
		}
		else {
			return true;
		}
	}
	/**
	 * 発注予定と発注明細の紐付を解除します
	 * @param dtlR
	 * @param subBDtlL
	 * @return
	 */
	protected MCList<PoSchd_Upd02_DtlR> makePoSchdUpd02Clear(Po_Ins01_DtlR dtlR){
		MCList<PoSchd_Upd02_DtlR> poSchdUpd02List = MCList.create(PoSchd_Upd02_DtlR.class);
		
		MCList<MST_PO_SCHD_R> poSchdL = getCachePoSchdByPoDNo(dtlR.po_d_no());
		if (!isNull(poSchdL)) {
			// 上り電文設定
			for (MST_PO_SCHD_R r : poSchdL) {
				PoSchd_Upd02_DtlR poSchdUpd02DtlR = PoSchd_Upd02_DtlR.create();
				poSchdUpd02DtlR.po_schd_no(r.po_schd_no());
				poSchdUpd02DtlR.po_no(null);
				poSchdUpd02DtlR.po_d_no(null);
				poSchdUpd02DtlR.po_flg(false);
				poSchdUpd02DtlR.base_unit_po_qty(MCNumber.ZERO);
				poSchdUpd02DtlR.itm_cd(r.itm_cd());
				poSchdUpd02DtlR.itm_sub1(r.itm_sub1());
				poSchdUpd02DtlR.itm_sub2(r.itm_sub2());
				poSchdUpd02DtlR.itm_sub3(r.itm_sub3());
				poSchdUpd02DtlR.in_to_loc_cd(r.in_to_loc_cd());
				poSchdUpd02List.add(poSchdUpd02DtlR);
			}
		}
		return poSchdUpd02List;
	}

	/**
	 * 発注予定と発注明細の紐付を設定します
	 * ※複数の発注予定をまとめて1つの発注明細にした場合、発注明細の数量を発注予定の基準単位発注数量に引き当てる。
	 * @param dtlR　明細レコード
	 * @param subBDtlL　明細に対応する発注予定情報
	 * @return
	 */
	protected MCList<PoSchd_Upd02_DtlR> makePoSchdUpd02(Po_Ins01_DtlR dtlR, MCList<Po_Ins01_Bndl_DtlR> subBDtlL){
		if (isNull(subBDtlL)) {
			// 計画外発注行の場合
			return null;
		}
		MCList<PoSchd_Upd02_DtlR> poSchdUpd02List = MCList.create(PoSchd_Upd02_DtlR.class);
		
		if (dtlR.abort_flg()) {
			// 打切の場合、発注済数量は常にゼロ
			for (Po_Ins01_Bndl_DtlR r : subBDtlL) {
				if (isNull(r.po_schd_no())) {
					continue;
				}
				// 上り電文設定
				PoSchd_Upd02_DtlR poSchdUpd02DtlR = PoSchd_Upd02_DtlR.create();
				poSchdUpd02DtlR.po_schd_no(r.po_schd_no());
				poSchdUpd02DtlR.po_no(r.po_no());
				poSchdUpd02DtlR.po_d_no(r.po_d_no());
				poSchdUpd02DtlR.po_flg(true);
				poSchdUpd02DtlR.base_unit_po_qty(MCNumber.ZERO);
				poSchdUpd02List.add(poSchdUpd02DtlR);
			}
		}
		else {
			// 打ち切りで無い場合
			MCNumber qty = dtlR.base_unit_qty();
			for (Po_Ins01_Bndl_DtlR r : subBDtlL) {
				if (isNull(r.po_schd_no())) {
					continue;
				}
				// 発注明細に対応する発注予定の発注予定数量に発注数を引き当てる
				MCNumber baseUnitQty = MCNumber.ZERO;
				if (qty.gte(r.base_unit_qty())) {
					// 未引当数が対象の発注予定数量以上の場合
					baseUnitQty = r.base_unit_qty();
				}
				else {
					// 未引当数が対象の発注予定数量未満の場合
					baseUnitQty = qty;
				}
				
				// 上り電文設定
				PoSchd_Upd02_DtlR poSchdUpd02DtlR = PoSchd_Upd02_DtlR.create();
				poSchdUpd02DtlR.po_schd_no(r.po_schd_no());
				poSchdUpd02DtlR.po_no(r.po_no());
				poSchdUpd02DtlR.po_d_no(r.po_d_no());
				poSchdUpd02DtlR.po_flg(true);
				poSchdUpd02DtlR.base_unit_po_qty(baseUnitQty);
				poSchdUpd02List.add(poSchdUpd02DtlR);
				
				// 残数を減らす
				qty = qty.subtract(baseUnitQty);
			}
			
			if (qty.gt(0) && poSchdUpd02List.size() > 0) {
				// 残数は最後の行に積む。
				MCNumber tmpQty = poSchdUpd02List.get(poSchdUpd02List.size()-1).base_unit_po_qty().add(qty);
				poSchdUpd02List.get(poSchdUpd02List.size()-1).base_unit_po_qty(tmpQty);
			}
		}
		
		return poSchdUpd02List;
	}
	/**
	 * 発注明細のみ更新ＦＬＧ
	 * 特定項目のみ更新（発注改訂・表示順・備考）であるか否かを判定します
	 * @param dtlR 明細行
	 * @return
	 */
	protected boolean updOnlyPod(Po_Ins01_DtlR dtlR) {
		if (isNull(dtlR.po_d_no())) {
			return false;
		}
		if (!isSame(dtlR.abort_flg(), dtlR.bef_abort_flg())
				&& (dtlR.arr_rem_abort_flg() || dtlR.purc_rem_abort_flg())) {
			return false;
		}
		MST_ARR_PR_R arrPrR = getCacheArrPr(dtlR.po_d_no());
		// キャッシュなしで実行された場合を考慮
		boolean isPoNotUpd = isNull(arrPrR) ? isPoNotUpd(null, dtlR.po_d_no(), false) : chkPoNotUpd(arrPrR, false);
		if(isPoNotUpd){
			return true;
		}
		if (dtlR.only_upd_pod_flg()) {
			return true;
		}
		// 購買納期調整で予定の全数打切を行った明細も発注明細のみ更新にしたいのでここで抽出
		// ※isPoNotUpdでは打切りが考慮されていないため
		if(!isNull(arrPrR) && !arrPrR.abort_flg() && 
				(!arrPrR.arr_schd_abort_qty().isZero() && arrPrR.arr_cmpl_flg() || !arrPrR.purc_schd_abort_qty().isZero() && arrPrR.purc_cmpl_flg())) {
			return true;
		}
		return false;
	}
	

	/**
	 * 承認提供サービス呼び出し処理
	 * @param hdrL
	 */
	protected void callAprvDel01(MCList<Po_Ins01_HdrR> hdrL){
		MCList<Po_Ins01_HdrR> subL = hdrL.subList(new MCRowMatcher<Po_Ins01_HdrR>() {
			public boolean match(Po_Ins01_HdrR m) {

				if (!isNull(m.bef_aprv_no())) {
					return true;
				}
				else {
					return false;
				}

			}
		});
		if (subL.size() > 0) {
			MBBAL_AprvService.Aprv_Del01 aprvDel01 = MBBAL_AprvService.crtAprv_Del01();
			addAll(aprvDel01.up0(), subL, createMap_AprvDel());
			aprvDel01.exec();
			subL.setValueNE(Po_Ins01_HdrR.$aprv_sts_typ, null);
			subL.setValueNE(Po_Ins01_HdrR.$aprv_flg, false);
			subL.setValueNE(Po_Ins01_HdrR.$aprv_no, null);
		}
	}
	/**
	 * 発注予定サービス呼び出し処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callPoSchdUpd02(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> bndlDtlL){
		MSBDL_PoSchdRegService.PoSchd_Upd02 poSchdUpd02 = MSBDL_PoSchdRegService.crtPoSchd_Upd02();
		MCList<Po_Ins01_DtlR> subDtlL = MCList.create(Po_Ins01_DtlR.class);
		for (Po_Ins01_HdrR hdrR : hdrL) {
			// ヘッダに対応する明細を取得
			subDtlL = dtlL.subList(Po_Ins01_DtlR.$hdr_peg_no, hdrR.peg_no());
			for (Po_Ins01_DtlR dtlR : subDtlL) {
				if (!doExecPoSchdUpdSv(dtlR)) {
					continue;
				}
				// 明細に対応する発注予定レコードを取得
				MCList<Po_Ins01_Bndl_DtlR> subBDtlL = MCList.create(Po_Ins01_Bndl_DtlR.class);
				subBDtlL = bndlDtlL.subList(Po_Ins01_Bndl_DtlR.$dtl_peg_no, dtlR.peg_no());
				subBDtlL.setStringNE(Po_Ins01_Bndl_DtlR.$po_no, dtlR.po_no());
				subBDtlL.setStringNE(Po_Ins01_Bndl_DtlR.$po_d_no, dtlR.po_d_no());
				// 更新のための上り電文を作成する
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					poSchdUpd02.up0().addAll(makePoSchdUpd02Clear(dtlR));
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					poSchdUpd02.up0().addAll(makePoSchdUpd02(dtlR, subBDtlL));
				}
			}
		}
		if (poSchdUpd02.up0().size() > 0) {
			MCList<PoSchd_Upd02_DtlR> editL = MCList.create(PoSchd_Upd02_DtlR.class);
			MCList<PoSchd_Upd02_DtlR>[] grpL = poSchdUpd02.up0().groupList("po_schd_no");
			for (MCList<PoSchd_Upd02_DtlR> tmpL : grpL) {
				if (tmpL.size() > 1) {
					tmpL.sort(SortType.DESC, "base_unit_po_qty");
					editL.add(tmpL.get(0));
				}
				else {
					editL.addAll(tmpL);
				}
			}
			poSchdUpd02.up0().clear();
			poSchdUpd02.up0().addAll(editL);
			
			poSchdUpd02.exec();
		}
	}
	
	/**
	 * 外注品のオーダ、支給品の受払予定を登録・訂正・削除する
	 * @param hdrL
	 * @param dtlL
	 * @param dtl2L
	 */
	protected void callOrdUpd01(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L){
		MSBCL_OrdRegService.Ord_Upd01 ordUpd01 = MSBCL_OrdRegService.crtOrd_Upd01();
		MSBCL_OrdRegService.Ord_Sprt02 ordSprt02 = MSBCL_OrdRegService.crtOrd_Sprt02();
		MSBCL_OrdRegService.Ord_Sprt03 ordSprt03 = MSBCL_OrdRegService.crtOrd_Sprt03();
		MSBCL_OrdRegService.Ord_Sprt04 ordSprt4 = MSBCL_OrdRegService.crtOrd_Sprt04();
		MSBEL_IoSchdService.IoSchd_Ins01 ioSchdIns01 = MSBEL_IoSchdService.crtIoSchd_Ins01();
		MSBEL_IoSchdService.IoSchd_Del01 ioSchdDel01 = MSBEL_IoSchdService.crtIoSchd_Del01();
		MCList<Po_Ins01_DtlR> tmpInsUpdL = MCList.create(Po_Ins01_DtlR.class);
		MCIndexKey idx = dtlL.createIndex(Po_Ins01_DtlR.$hdr_peg_no);
		MCIndexKey dtlIdx = dtl2L.createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
		for (Po_Ins01_HdrR hdrR : hdrL) {
			// 外注の場合のみ行う
			MCList<Po_Ins01_DtlR>  subL = dtlL.subList(idx, hdrR.peg_no());
			for (Po_Ins01_DtlR r : subL) {
				boolean isTgt = doExecItmOrdSv(r); 
				if (!isTgt) {
					continue;
				}
				Ord_Upd01_Dtl1R ordUpd01DtlR = Ord_Upd01_Dtl1R.create();
				copy(ordUpd01DtlR, r, createMap_Ord_Upd01_Dtl1R_Po_Ins01_DtlR());
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 発注取消時、まとめにより発注が作成した品目オーダを削除する。
					// （計画で作成した品目オーダのことではない）。
					ordUpd01.up0().add(ordUpd01DtlR);
					
					// まとめ発注の取消時には外注品に対する発注予定に紐付く支給品の受払予定を作成
					MCList<Po_Ins01_Bndl_DtlR> subDtl2L = dtl2L.subList(dtlIdx, r.peg_no());
					for(Po_Ins01_Bndl_DtlR dtl2R : subDtl2L) {
						MST_PO_SCHD_R poSchdR = getCachePoSchdByPoSchdNo(dtl2R.po_schd_no());
						if (!poSchdR.isEmpty()) {
							Ord_Sprt03_DtlR ordSprt03DtlR = Ord_Sprt03_DtlR.create();
							copy(ordSprt03DtlR, poSchdR, createMap_Ord_Sprt03_DtlR_MST_PO_SCHD_R());
							ordSprt03DtlR.peg_no(dtl2R.peg_no());
							ordSprt03DtlR.setAttributes(dtl2R);
							ordSprt03.up0().add(ordSprt03DtlR);
							
							Ord_Sprt02_DtlR ordSprt02DtlR = Ord_Sprt02_DtlR.create();
							copy(ordSprt02DtlR, poSchdR, createMap_Ord_Sprt02_DtlR_MST_PO_SCHD_R());
							ordSprt02DtlR.peg_no(dtl2R.peg_no());
							ordSprt02DtlR.setAttributes(dtl2R);
							ordSprt02.up1().add(ordSprt02DtlR);
						}
					}
				}
				else {
					// 新規・更新の場合は品目オーダ補完を行ってから、オーダ更新サービスへ追加
					ordSprt4.up0().add(ordUpd01DtlR);
					tmpInsUpdL.add(r);
					
					// まとめ発注時には外注品に対する発注予定に紐付く支給品の受払予定を削除
					MCList<Po_Ins01_Bndl_DtlR> subDtl2L = dtl2L.subList(dtlIdx, r.peg_no());
					for(Po_Ins01_Bndl_DtlR dtl2R : subDtl2L) {
						MSW_IO_SCHD_DEL_R ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
						ioSchdDelR.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
						ioSchdDelR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
						ioSchdDelR.io_schd_no(dtl2R.outsrc_itm_ord_no());
						ioSchdDel01.up0().add(ioSchdDelR);
					}
				}
			}
		}
		if (ordSprt4.up0().size() > 0) {
			ordSprt4.exec();
		}
		
		// 電文編集
		editOrdUpd01Up1(ordSprt4.down0(), dtlL);
		ordUpd01.up0().addAll(ordSprt4.down0());	
		ordUpd01.exec();
		
		String[] destCols = new String[] {Po_Ins01_DtlR.$outsrc_itm_ord_no};
		String[] srcCols = new String[] {Ord_Upd01_Rslt1R.$itm_ord_no};
		copyByPegNo(dtlL, destCols, ordUpd01.down0(), srcCols);
		
		if (!ordSprt03.up0().isEmpty()) {
			ordSprt03.exec();
		}
		
		// 日付計算結果を構成展開の上り電文に反映
		MCIndexKey ordSprt03Key = ordSprt03.down0().createIndex(Ord_Sprt03_RsltR.$peg_no);
		for (Ord_Sprt02_DtlR r : ordSprt02.up1()) {
			Ord_Sprt03_RsltR ordSprt03DtlR = ordSprt03.down0().getFirst(ordSprt03Key, r.peg_no());				
			r.mfg_st_schd_dt(ordSprt03DtlR.mfg_st_schd_dt());
			r.st_schd_tm(ordSprt03DtlR.mfg_st_schd_dt());
			r.end_schd_tm(ordSprt03DtlR.mfg_end_schd_dt());
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
			dbSelect("MSBDL5100_MST_OPER_ORDER_S01", operOrderL, operOrderL_bldr, dtl2L.groupBy(Po_Ins01_Bndl_DtlR.$outsrc_itm_ord_no));
			MCIndexKey operOrderKey = operOrderL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			
			ordSprt02.exec();
			
			MCIndexKey dtl2Key = dtl2L.createIndex(Po_Ins01_Bndl_DtlR.$peg_no);
			for(Ord_Sprt02_RsltR ordSprt02RsltR : ordSprt02.down0()) {
				Po_Ins01_Bndl_DtlR dtl2R = dtl2L.getFirst(dtl2Key, ordSprt02RsltR.peg_no());
				MST_PO_SCHD_R poSchdR = getCachePoSchdByPoSchdNo(dtl2R.po_schd_no());
				if (isNull(poSchdR)) {
					continue;
				}
				
				// 受払予定サービスの上り電文に設定
				IoSchd_Ins01_DtlR ioSchdIns01DtlR = IoSchd_Ins01_DtlR.create();
				copy(ioSchdIns01DtlR, ordSprt02RsltR, createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR());
				ioSchdIns01DtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
				ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
				ioSchdIns01DtlR.io_schd_no(dtl2R.outsrc_itm_ord_no());
				ioSchdIns01DtlR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
				ioSchdIns01DtlR.io_schd_sub_no1(poSchdR.outsrc_itm_ord_no());
				MST_OPER_ORDER_R operOrderR = operOrderL.getFirst(operOrderKey, poSchdR.outsrc_itm_ord_no());
				if(!isNull(operOrderR)) {
					ioSchdIns01DtlR.oper_ord_no(operOrderR.oper_ord_no());
				}
				ioSchdIns01DtlR.io_schd_pr_no(poSchdR.io_schd_pr_no());
				ioSchdIns01.up0().add(ioSchdIns01DtlR);
			}

			if (!ioSchdIns01.up0().isEmpty()) {
				ioSchdIns01.exec();
			}			
		}
		if (!ioSchdDel01.up0().isEmpty()) {
			ioSchdDel01.exec();
		}
	}
	
	/**
	 * オーダ登録サービス上り電文（up0）を編集します
	 * @param list
	 * @param dtlL
	 */
	protected void editOrdUpd01Up1(MCList<Ord_Upd01_Dtl1R> list,  MCList<Po_Ins01_DtlR> dtlL) {
		// データ更新区分付与
		String[] destCols = new String[] {Ord_Upd01_Dtl1R.$data_crud_typ, Ord_Upd01_Dtl1R.$itm_ord_no};
		String[] srcCols = new String[] {Po_Ins01_DtlR.$data_crud_typ, Po_Ins01_DtlR.$outsrc_itm_ord_no};
		copyByPegNo(list, destCols, dtlL, srcCols);
		
		// 固定値
		list.setString(Ord_Upd01_Dtl1R.$mrp_typ, MSC_MRP_TYP.MRP.value());
		list.setString(Ord_Upd01_Dtl1R.$ord_gnrt_typ, MSC_ORD_GNRT_TYP.UPLND.value());
		list.setString(Ord_Upd01_Dtl1R.$itm_ord_sts_typ, MSC_ITM_ORD_STS_TYP.FIX.value());
		list.setBoolean(Ord_Upd01_Dtl1R.$not_fix_flg, false);
		list.setBoolean(Ord_Upd01_Dtl1R.$oper_ord_pr_flg, true);
		list.setBoolean(Ord_Upd01_Dtl1R.$io_schd_pr_flg, true);
	}
	
	/**
	 * 製造指図登録サービス呼び出し処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callOutSrcInstUpd01(MCList<Po_Ins01_DtlR> dtlL){
		MSBCL_OutSrcInstService.OutSrcInst_Upd01 outSrcInstUpd01 = MSBCL_OutSrcInstService.crtOutSrcInst_Upd01();
		for (Po_Ins01_DtlR r : dtlL) {
			if (!doExecOutSrcInstSv(r)) {
				continue;
			}
			if (r.arr_rem_abort_flg() || r.purc_rem_abort_flg()) {
				continue;
			}
			OutSrcInst_Chk01_PoDR outSrcInstUpd01PoDR = OutSrcInst_Chk01_PoDR.create();
			copy(outSrcInstUpd01PoDR, r, createMap_OutSrcInst_Chk01_PoDR_Po_Ins01_DtlR());
			outSrcInstUpd01.up0().add(outSrcInstUpd01PoDR);
		}
		if (outSrcInstUpd01.up0().size() > 0) {
			outSrcInstUpd01.exec();
		}
		
		String[] destCols = new String[] {Po_Ins01_DtlR.$mfg_inst_no, Po_Ins01_DtlR.$pre_outsrc_act_flg, Po_Ins01_DtlR.$lot_no, Po_Ins01_DtlR.$sublot_no};
		String[] srcCols = new String[] {OutSrcInst_Chk01_PoDR.$mfg_inst_no, OutSrcInst_Chk01_PoDR.$pre_outsrc_act_flg, OutSrcInst_Chk01_PoDR.$lot_no, OutSrcInst_Chk01_PoDR.$sublot_no};
		copyByPegNo(dtlL, destCols, outSrcInstUpd01.down0(), srcCols);
	}
	
	protected void callOutSrcActUpdSrv(MCList<Po_Ins01_HdrR> hdrL,
			MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		
		MSBCL_OutSrcActService.OutSrcAct_Upd01 srv = MSBCL_OutSrcActService.crtOutSrcAct_Upd01();
		Set<String> mfgInstNoSet = new HashSet<String>();
		MCIndexKey idx = dtl2L.createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
		
		for (Po_Ins01_DtlR r : dtlL) {
			if (!r.outsrc_flg()) {
				continue;
			}
			
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MCList<Po_Ins01_Bndl_DtlR> subL = dtl2L.subList(idx, r.peg_no());
			MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create();
			
			for (Po_Ins01_Bndl_DtlR dtl2R : subL.groupBy(Po_Ins01_Bndl_DtlR.$po_d_no)) {
				if (!isNull(dtl2R.po_d_no())) {
					arrPrR = getCacheArrPr(dtl2R.po_d_no());
					// 入荷進捗に対応するＮ件の入荷予定を取得
					if (!isNull(arrPrR)) {
						arrSchdL.addAll(getCacheArrSchd(arrPrR.arr_pr_no()));
					}
				}
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
					&& (r.abort_flg() || !isSame(r.abort_flg(), r.bef_abort_flg())) && (r.arr_rem_abort_flg() || r.purc_rem_abort_flg())) {
				
				arrPrR = getCacheArrPr(r.po_d_no());
				for (MST_ARR_SCHD_R schdR : arrSchdL) {
					if (!isArrRemAbort(schdR, arrPrR) && !isPurcRemAbort(schdR, arrPrR)) {
						continue;
					}
					
					MCList<MST_ARR_ACT_R> aaL = getArrActCacheByMfgInstNo(schdR.mfg_inst_no());
					if (isNull(aaL)) {
						continue;
					}
					if (mfgInstNoSet.contains(schdR.mfg_inst_no())) {
						// 既に追加済みの製造指図ＮＯの場合は処理しない
						continue;
					}
					mfgInstNoSet.add(schdR.mfg_inst_no());
					
					for (MST_ARR_ACT_R aaR : aaL) {
						OutSrcAct_Upd01_ActDR srvUpR = OutSrcAct_Upd01_ActDR.create();
						srvUpR.setAttributes(r);
						srvUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						srvUpR.mfg_inst_no(schdR.mfg_inst_no());
						if (!isNull(aaR.purc_act_io_no())) {
							srvUpR.purc_act_io_no(aaR.purc_act_io_no());
						}
						else {
							srvUpR.arr_act_no(aaR.arr_act_no());
						}
						srv.up0().add(srvUpR);
					}
				}
			}
		}
		if (srv.up0().size() > 0) {
			srv.exec();
		}
	}
	
	/**
	 * 入荷予定作成サービス呼び出し処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callSchdArrUpd01(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L){
		MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01 = MSBEL_ArrSchdService.crtArrSchd_Upd01();
		MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpd01Del = MSBEL_ArrSchdService.crtArrSchd_Upd01();
		MSBEL_ArrSchdService.ArrSchd_Upd01 arrSchdUpdTwo01 = MSBEL_ArrSchdService.crtArrSchd_Upd01();
		MSBEL_ArrSchdService.ArrSchd_Upd02 arrSchdUpd02 = MSBEL_ArrSchdService.crtArrSchd_Upd02();
		MSBEL_ArrSchdService.ArrSchd_Upd03 arrSchdUpd03 = MSBEL_ArrSchdService.crtArrSchd_Upd03();
		MSBDL_PurcSchdRegService.PurcSchd_Upd02 purcSchdUpd02 = MSBDL_PurcSchdRegService.crtPurcSchd_Upd02();
		// 更新
		MCList<ArrPr_DtlR> arrPrTwoUp0L = MCList.create(ArrPr_DtlR.create());
		MCList<ArrSchd_DtlR> arrSchdTwoUp1L = MCList.create(ArrSchd_DtlR.create());
		MCList<ArrSchd_DtlR> arrSchd02Up0L = MCList.create(ArrSchd_DtlR.create());
		MCList<ArrSchd_DtlR> arrSchd03Up0L = MCList.create(ArrSchd_DtlR.create());
		MCList<PurcSchd_DtlR> purcSchd02Up0L = MCList.create(PurcSchd_DtlR.create());
		
		MCIndexKey idx = dtl2L.createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
		MCIndexKey hdrIdx = hdrL.createIndex(Po_Ins01_HdrR.$peg_no);
		long pegNo = 0;
		long dtlPegNo = 0;
		long pegRemNo = 0;
		
		for (Po_Ins01_DtlR r : dtlL) {
			if (!doExecSchdArrSv(r)) {
				continue;
			}
			Po_Ins01_HdrR hdrR = hdrL.getFirst(hdrIdx, r.hdr_peg_no());
			// 明細行に対応する入荷進捗行（まとめ時にＮ件となる）
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			// 入荷進捗に対応する入荷予定行（納入指示済の場合Ｎ件となる）
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);

			// 前回発注時に作成した入荷進捗・予定を削除
			MCList<Po_Ins01_Bndl_DtlR> subL = dtl2L.subList(idx, r.peg_no());
			MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create();
			
			for (Po_Ins01_Bndl_DtlR dtl2R : subL.groupBy(Po_Ins01_Bndl_DtlR.$po_d_no)) {
				if (!isNull(dtl2R.po_d_no())) {
					// 明細に対応する入荷進捗を取得(明細をまとめた場合はsubLがN件となる)
					arrPrR = getCacheArrPr(dtl2R.po_d_no());
					arrPrL.add(arrPrR);
					// 入荷進捗に対応するＮ件の入荷予定を取得
					if (!isNull(arrPrR)) {
						arrSchdL.addAll(getCacheArrSchd(arrPrR.arr_pr_no()));
					}
				}
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
					&& (r.abort_flg() || !isSame(r.abort_flg(), r.bef_abort_flg()))) {
				
				arrPrR = getCacheArrPr(r.po_d_no());
				if (r.arr_rem_abort_flg() || r.purc_rem_abort_flg()) {
					if (!isSame(r.abort_flg(), r.bef_abort_flg())) {
						
						pegRemNo = pegNo++;
						setRemAbortList(arrPrTwoUp0L, arrSchdTwoUp1L, arrSchd02Up0L, arrSchd03Up0L, purcSchd02Up0L, arrPrR, arrSchdL, r, pegRemNo);
					}
				}
				else {
					// 打切更新（打切とまとめは同時に行えないので、明細レベルで処理する）
					ArrPr_DtlR arrPrDtlR = ArrPr_DtlR.create();
					arrPrDtlR.peg_no(pegNo++);
					arrPrDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					arrPrDtlR.arr_pr_no(arrPrR.arr_pr_no());
					arrPrDtlR.abort_flg(r.abort_flg());
					arrSchdUpd01.up0().add(arrPrDtlR);
					
					for (MST_ARR_SCHD_R schdR : arrSchdL) {
						ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
						updSchdDtlR.peg_no(arrPrDtlR.peg_no());
						updSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						updSchdDtlR.arr_pr_no(schdR.arr_pr_no());
						updSchdDtlR.arr_schd_no(schdR.arr_schd_no());
						updSchdDtlR.abort_flg(r.abort_flg());
						arrSchdUpd01.up1().add(updSchdDtlR);
					}
				}
			}
			else {
				
				// 更新で、入荷予定の項目（入荷予定サービスの上り電文）に変更がない場合は、
				// キャッシュの入荷予定をもとにして空更新する
				// ※更新カウンタをインクリメントする必要がある
				// ※発注で備考だけを更新した場合などに、納入指示・納期回答受領のデータを維持するため、空更新のパタンを設けている
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && arrPrL.size() == 1 && !isUpdArrSchd(hdrR, r, arrPrL.get(0), arrSchdL)) {
					r.not_upd_arr_schd_flg(true);
					ArrPr_DtlR arrPrDtlR = ArrPr_DtlR.create();
					MST_ARR_PR_R prR = arrPrL.get(0);
					arrPrDtlR.peg_no(pegNo++);
					arrPrDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					arrPrDtlR.arr_pr(prR);
					arrSchdUpd01.up0().add(arrPrDtlR);
					
					boolean isDlvSlipChng = isDlvSlipCng(hdrR, r, arrSchdL);
					for(MST_ARR_SCHD_R schdR: arrSchdL){
						ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
						updSchdDtlR.peg_no(arrPrDtlR.peg_no());
						updSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						updSchdDtlR.purc_schd_no(schdR.getStringNE("purc_schd_no"));
						updSchdDtlR.accpt_schd_dt(schdR.getDateNE("purc_schd_dt"));
						// 納品書の項目が変更された場合は、納品書ＮＯをクリア（紐づくすべての入荷予定からクリアする）
						if(isDlvSlipChng){
							schdR.dlv_slip_no(null);
						}
						// 入荷不要の場合は入荷予定の取引単位数量が2「0」で登録されているので、
						// 仕入予定の予定数量を設定しなおす。
						if (schdR.arr_skip_flg()) {
							schdR.trd_unit_qty(schdR.getNumberNE("trd_unit_schd_qty"));
							schdR.base_unit_qty(schdR.getNumberNE("base_unit_schd_qty"));
						}
						updSchdDtlR.arr_schd(schdR);
						arrSchdUpd01.up1().add(updSchdDtlR);	
					}
					
					continue;
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					
					// 明細単位で入荷進捗を作成する
					ArrPr_DtlR arrPrDtlR = ArrPr_DtlR.create();
					copy(arrPrDtlR, r, createMap_ArrPr_DtlR_Po_Ins01_DtlR());
					arrPrDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					arrPrDtlR.peg_no(pegNo++);
					arrSchdUpd01.up0().add(arrPrDtlR);
					
					// 明細単位で入荷予定を作成する
					ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
					copy(arrSchdDtlR, r, createMap_ArrSchd_DtlR_Po_Ins01_DtlR());
					arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					arrSchdDtlR.peg_no(arrPrDtlR.peg_no());
					// 納品書の項目が変更されていない場合は納品書ＮＯをクリアしない（入荷予定が1件の場合）
					// ここでは入荷予定の項目に変更があり再作成を行うので、更新後の入荷予定は1件になる
					// 元の入荷予定が複数件の場合は納品書ＮＯだけ維持できないため、クリアする
					if(arrPrL.size() == 1 && arrSchdL.size() == 1 && !isDlvSlipCng(hdrR, r, arrSchdL)){
						arrSchdDtlR.dlv_slip_no(arrSchdL.get(0).dlv_slip_no());
					}
					arrSchdUpd01.up1().add(arrSchdDtlR);
				}
				
				MCIndexKey schdIdx = arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_pr_no);
				// 旧入荷進捗・入荷予定を削除する
				for (MST_ARR_PR_R prR : arrPrL) {
					ArrPr_DtlR delPrR = ArrPr_DtlR.create();
					delPrR.peg_no(pegNo++);
					delPrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					delPrR.arr_pr_no(prR.arr_pr_no());
					arrSchdUpd01Del.up0().add(delPrR);
					
					MCList<MST_ARR_SCHD_R> subSchdL = arrSchdL.subList(schdIdx, prR.arr_pr_no());
					for (MST_ARR_SCHD_R delSchdR : subSchdL) {
						ArrSchd_DtlR delSchdDtlR = ArrSchd_DtlR.create();
						delSchdDtlR.peg_no(delPrR.peg_no());
						delSchdDtlR.peg_d_no(dtlPegNo++);
						delSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						delSchdDtlR.arr_schd_no(delSchdR.arr_schd_no());
						arrSchdUpd01Del.up1().add(delSchdDtlR);
					}
				}
			}
		}
		if (arrSchdUpd01Del.up0().size() > 0) {
			arrSchdUpd01Del.up1().setBoolean(ArrSchd_DtlR.$no_cred_upd_flg, true);
			arrSchdUpd01Del.exec();
		}
		if (arrSchdUpd01.up0().size() > 0) {
			arrSchdUpd01.up1().setBoolean(ArrSchd_DtlR.$no_cred_upd_flg, true);
			arrSchdUpd01.exec();
		}
		
		arrSchdUpdTwo01.up0().addAll(arrPrTwoUp0L);
		arrSchdUpdTwo01.up1().addAll(arrSchdTwoUp1L);
		arrSchdUpd02.up0().addAll(arrSchd02Up0L);
		arrSchdUpd03.up0().addAll(arrSchd03Up0L);
		purcSchdUpd02.up0().addAll(purcSchd02Up0L);
		
		if (arrSchdUpdTwo01.up0().size() > 0) {
			arrSchdUpdTwo01.exec();
		}
		if (arrSchdUpd02.up0().size() > 0) {
			arrSchdUpd02.exec();
		}
		if (purcSchdUpd02.up0().size() > 0) {
			purcSchdUpd02.exec();
		}
		if (arrSchdUpd03.up0().size() > 0) {
			arrSchdUpd03.exec();
		}
	}
	
	protected void setRemAbortList(MCList<ArrPr_DtlR> arrPrTwoUp0L,
			MCList<ArrSchd_DtlR> arrSchdTwoUp1L, MCList<ArrSchd_DtlR> arrSchd02Up0L,
			MCList<ArrSchd_DtlR> arrSchd03Up0L, MCList<PurcSchd_DtlR> purcSchd02Up0L,
			MST_ARR_PR_R arrPrR, MCList<MST_ARR_SCHD_R> arrSchdL, Po_Ins01_DtlR r, long pegRemNo) {
		
		MCList<ArrSchd_DtlR> arrSchdTwoUp1TmpL = MCList.create(ArrSchd_DtlR.create());
		
		for (MST_ARR_SCHD_R schdR : arrSchdL) {
			if (!isArrRemAbort(schdR, arrPrR) && !isPurcRemAbort(schdR, arrPrR)) {
				continue;
			}
			
			// 全数打切の場合
			if (r.abort_flg() && (isArrRemAbort(schdR, arrPrR) || isPurcRemAbort(schdR, arrPrR))
					&& schdR.arr_qty().isZero() && schdR.purc_qty().isZero()) {
				
				// 同時に打切しない場合はエラーとしているため、該当ケースなし
				if (!(schdR.getBooleanNE("non_purc_flg") || schdR.arr_skip_flg() && isNull(getCachePoD(arrPrR.po_d_no()).dlv_cd())) && (!isPurcRemAbort(schdR, arrPrR) || !isArrRemAbort(schdR, arrPrR))) {
					continue;
				}
				else {
					// 入荷予定サービスの更新（入荷進捗・予定）の上り電文設定
					setArrSchdTwoUp1List(arrSchdTwoUp1TmpL, arrPrR, schdR, r, pegRemNo);
				}
			}
			else {
				if(r.abort_flg() && isArrRemAbort(schdR, arrPrR) && isPurcRemAbort(schdR, arrPrR)) {
					// 数量が一致していない場合はエラーとしている
					setArrSchd02Up0List(arrSchd02Up0L, schdR, r);
					
					// 仕入予定サービスの実績更新の上り電文設定
					setPurcSchd02Up0List(purcSchd02Up0L, schdR, r);
					
					// 入荷予定サービスの更新（仕入・売上返品）の上り電文設定
					setArrSchd03Up0List(arrSchd03Up0L, schdR, r);
				}
				// 入荷予定のみの残数打切
				else if(r.abort_flg() && isArrRemAbort(schdR, arrPrR)) {
					setArrSchd02Up0List(arrSchd02Up0L, schdR, r);
				}
				// 仕入予定のみの残数打切
				else if(r.abort_flg() && isPurcRemAbort(schdR, arrPrR)) {
					ArrSchd_DtlR updSchdDtl1R = ArrSchd_DtlR.create();
					updSchdDtl1R.peg_no(pegRemNo);
					updSchdDtl1R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					updSchdDtl1R.arr_pr_no(schdR.arr_pr_no());
					updSchdDtl1R.arr_schd_no(schdR.arr_schd_no());
					updSchdDtl1R.abort_flg(r.abort_flg());
					arrSchdTwoUp1TmpL.add(updSchdDtl1R);
					
					// 仕入予定サービスの実績更新前チェックの上り電文設定
					setPurcSchd02Up0List(purcSchd02Up0L, schdR, r);
					
					// 入荷予定サービスの更新（仕入・売上返品）の上り電文設定
					ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
					copy(updSchdDtlR, r, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02());
					updSchdDtlR.abort_flg(r.abort_flg());
					updSchdDtlR.rem_abort_flg(r.purc_rem_abort_flg());
					updSchdDtlR.arr_ptn_typ(schdR.arr_ptn_typ());
					arrSchd03Up0L.add(updSchdDtlR);
				}
				else {
					// 入荷進捗、入荷予定が打切済の場合は解除
					if(arrPrR.abort_flg() || schdR.abort_flg()) {
						// 全数打切の解除
						if(schdR.arr_qty().isZero()) {
							// 入荷予定サービスの更新（入荷進捗・予定）の上り電文設定
							setArrSchdTwoUp1List(arrSchdTwoUp1TmpL, arrPrR, schdR, r, pegRemNo);
						}
						// 残数打切の解除
						else {
							// 入荷予定サービスの更新（予定・実績）前チェックの上り電文設定
							setArrSchd02Up0List(arrSchd02Up0L, schdR, r);
						}
					}
				}
				
				// 前回仕入予定が打切の場合は仕入予定サービスに連携
				if(!r.abort_flg()) {
					if (schdR.getBooleanNE("purc_abort_flg")
							&& (!schdR.purc_qty().isZero()
									|| !schdR.getNumberNE("base_unit_accpt_dfct_qty").isZero())) {
						
						// 仕入予定サービスの実績更新前チェックの上り電文設定
						setPurcSchd02Up0List(purcSchd02Up0L, schdR, r);
						
						// 入荷予定サービスの更新（仕入・売上返品）の上り電文設定
						ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
						copy(updSchdDtlR, r, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02());
						updSchdDtlR.arr_ptn_typ(schdR.arr_ptn_typ());
						arrSchd03Up0L.add(updSchdDtlR);
					}
				}
			}
		}
		
		if (arrSchdTwoUp1TmpL.size() > 0) {
			ArrPr_DtlR arrPrDtlR = ArrPr_DtlR.create();
			copy(arrPrDtlR, arrPrR, createMap_ArrPr_DtlR_MST_ARR_PR_R());
			arrPrDtlR.peg_no(pegRemNo);
			arrPrDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			arrPrDtlR.abort_flg(r.abort_flg());
			arrPrTwoUp0L.add(arrPrDtlR);
			arrSchdTwoUp1L.addAll(arrSchdTwoUp1TmpL);
		}
	}

	protected void setArrSchdTwoUp1List(MCList<ArrSchd_DtlR> arrSchdTwoUp1L, MST_ARR_PR_R arrPrR, MST_ARR_SCHD_R schdR, Po_Ins01_DtlR r, long pegRemNo) {
		
		ArrSchd_DtlR arrSchdDtlR = ArrSchd_DtlR.create();
		copy(arrSchdDtlR, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R());
		arrSchdDtlR.accpt_schd_dt(schdR.getDateNE("purc_schd_dt"));
		
		arrSchdDtlR.peg_no(pegRemNo);
		arrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		arrSchdDtlR.abort_flg(r.abort_flg());
		arrSchdDtlR.trd_ptn_typ(arrPrR.trd_ptn_typ());
		arrSchdDtlR.xrate(schdR.getNumberNE("xrate"));
		arrSchdDtlR.ptax_xrate(schdR.getNumberNE("ptax_xrate"));
		arrSchdDtlR.trd_cur_cd(schdR.getStringNE("trd_cur_cd"));
		arrSchdDtlR.trd_cur_upri(schdR.getNumberNE("trd_cur_upri"));
		
		MST_PROV_SCHD_R provSchdR = getProvSchdCache(arrPrR.po_d_no());
		if (!isNull(provSchdR)) {
			arrSchdDtlR.prov_typ(provSchdR.prov_typ());
			arrSchdDtlR.prov_basis_typ(provSchdR.prov_basis_typ());
		}
		arrSchdTwoUp1L.add(arrSchdDtlR);
	}
	protected void setArrSchd02Up0List(MCList<ArrSchd_DtlR> arrSchd02Up0L, MST_ARR_SCHD_R schdR, Po_Ins01_DtlR r) {
		
		ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
		copy(updSchdDtlR, r, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02());
		updSchdDtlR.abort_flg(r.abort_flg());
		updSchdDtlR.rem_abort_flg(r.arr_rem_abort_flg());
		
		// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
		if (!isNullOrNullVal(updSchdDtlR.lot_no())) {
			MST_PO_D_R poDR = getCachePoD(r.po_d_no());
			FXUCL_MCDbcCache<MAM_ITM_R> cacheItm = object(CLAZZ)._cacheItm;
			MAM_ITM_R itmR = cacheItm.get(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
				updSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
		
		updSchdDtlR.mfg_inst_no(schdR.mfg_inst_no());
		arrSchd02Up0L.add(updSchdDtlR);
	}
	protected void setPurcSchd02Up0List(MCList<PurcSchd_DtlR> purcSchd02Up0L, MST_ARR_SCHD_R schdR, Po_Ins01_DtlR r) {
		
		PurcSchd_DtlR purcSchdDtlR = PurcSchd_DtlR.create();
		copy(purcSchdDtlR, r, schdR, createMap_PurcSchd_DtlR_MST_ARR_SCHD_R());
		purcSchdDtlR.abort_flg(r.abort_flg());
		purcSchdDtlR.purc_schd_no(schdR.getStringNE("purc_schd_no"));
		purcSchdDtlR.base_unit_purc_qty(schdR.purc_qty());
		purcSchdDtlR.base_unit_accpt_dfct_qty(schdR.getNumberNE("base_unit_accpt_dfct_qty"));
		MST_PO_D_R poDR = getCachePoD(r.po_d_no());
		purcSchdDtlR.purc_ddlv_flg(!isNull(poDR.dlv_cd()));
		purcSchd02Up0L.add(purcSchdDtlR);
	}
	protected void setArrSchd03Up0List(MCList<ArrSchd_DtlR> arrSchd03Up0L, MST_ARR_SCHD_R schdR, Po_Ins01_DtlR r) {
		
		ArrSchd_DtlR updSchdDtlR = ArrSchd_DtlR.create();
		copy(updSchdDtlR, r, schdR, createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02());
		updSchdDtlR.abort_flg(r.abort_flg());
		updSchdDtlR.rem_abort_flg(r.arr_rem_abort_flg());
		// サブロット管理しない場合は、サブロットＮＯにNULL文字を補完
		if (!isNullOrNullVal(updSchdDtlR.lot_no())) {
			MST_PO_D_R poDR = getCachePoD(r.po_d_no());
			FXUCL_MCDbcCache<MAM_ITM_R> cacheItm = object(CLAZZ)._cacheItm;
			MAM_ITM_R itmR = cacheItm.get(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3());
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
				updSchdDtlR.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
		
		updSchdDtlR.mfg_inst_no(schdR.mfg_inst_no());
		updSchdDtlR.arr_ptn_typ(schdR.arr_ptn_typ());
		arrSchd03Up0L.add(updSchdDtlR);	
	}
	
	/**
	 * 購買納期調整登録サービス呼び出し処理
	 * @param dtl2L
	 */
	protected void callPrmsDel01(MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L){
		MCList<Po_Ins01_Bndl_DtlR> subBDtlL = MCList.create(Po_Ins01_Bndl_DtlR.class);
		MCIndexKey idxDtl2L = dtl2L.createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
		for (Po_Ins01_DtlR r : dtlL) {
			if(isSame(r.bef_abort_flg(), r.abort_flg())){
				// 入荷予定を更新していない場合は納入指示も更新しない
				if (!updOnlyPod(r) && !r.not_upd_arr_schd_flg()) {
					subBDtlL.addAll(dtl2L.subList(idxDtl2L, r.peg_no()));
				}
			}
		}
		MSBDL_PurcDlvDtAdjstRegService.DlvInst_Prms_Del01 ope = MSBDL_PurcDlvDtAdjstRegService.crtDlvInst_Prms_Del01();
		addAll(ope.up0(), subBDtlL, createMap_DlvInst_Chk01_HdrR_Po_Ins01_Bndl_DtlR());
		if (ope.up0().size() > 0) {
			ope.exec();
		}
	}
	
	/**
	 * 承認次処理済更新サービスチェック呼び出し処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callAprvNextChk(MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		// 次処理済更新
		MBBAL_AprvService.Aprv_Chk02 aprvChk02 = MBBAL_AprvService.crtAprv_Chk02();
		// 次処理済更新解除
		MBBAL_AprvService.Aprv_Chk03 aprvChk03 = MBBAL_AprvService.crtAprv_Chk03();

		crtAprvUp(dtlL, dtl2L, aprvChk02.up0(), aprvChk03.up0(), true);
		if (aprvChk02.up0().size() > 0) {
			aprvChk02.exec();
			copyErrFlg(dtlL, aprvChk02.down0());
		}
		if (aprvChk03.up0().size() > 0) {
			aprvChk03.exec();
			copyErrFlg(dtlL, aprvChk03.down0());
		}

	}

	/**
	 * 承認次処理済更新サービス呼び出し処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callAprvUpd(MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		// 次処理済更新
		MBBAL_AprvService.Aprv_Upd02 aprvUpd02 = MBBAL_AprvService.crtAprv_Upd02();
		// 次処理済更新解除
		MBBAL_AprvService.Aprv_Upd03 aprvUpd03 = MBBAL_AprvService.crtAprv_Upd03();

		crtAprvUp(dtlL, dtl2L, aprvUpd02.up0(), aprvUpd03.up0(), false);
		if (aprvUpd02.up0().size() > 0) {
			aprvUpd02.exec();
		}
		if (aprvUpd03.up0().size() > 0) {
			aprvUpd03.exec();
		}
	}
	
	/**
	 * 承認次処理済更新サービス引数作成
	 * @param hdrL
	 * @param dtlL
	 */
	protected void crtAprvUp(MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L, MCList<Aprv_Chk02_Rslt1R> chk2L, MCList<Aprv_Chk02_Rslt1R> chk3L, boolean check) {
	
		MCList<Po_Ins01_Bndl_DtlR>[] grpL = dtl2L.groupList(Po_Ins01_Bndl_DtlR.$slo_no);
		MCIndexKey idx = dtlL.createIndex(Po_Ins01_DtlR.$peg_no);
		MCIndexKey key = dtlL.createIndex(Po_Ins01_DtlR.$peg_no);

		for (MCList<Po_Ins01_Bndl_DtlR> subL : grpL) {
			MCList<Po_Ins01_DtlR> tgtL = MCList.create(Po_Ins01_DtlR.class);
			// 受注ＮＯ単位で、対象の明細を取得する。
			for (Po_Ins01_Bndl_DtlR r : subL) {
				tgtL.addAll(dtlL.subList(idx, r.dtl_peg_no()));
			}
			MCIndexKey tgtLIdx = tgtL.createIndex(Po_Ins01_DtlR.$data_crud_typ);
			
			if (tgtL.subList(tgtLIdx, MAC_DATA_CRUD_TYP.CRT.value()).size() > 0) {
				// 新規行があれば、次処理済ＦＬＧ更新
				if (!isNull(subL.get(0).aprv_no())) {
					for (Po_Ins01_Bndl_DtlR r : subL) {
						Aprv_Chk02_Rslt1R chk02Up0 = Aprv_Chk02_Rslt1R.create();
						Po_Ins01_DtlR dtl1R = dtlL.getFirst(key, r.dtl_peg_no());
						copy(chk02Up0, r, createMapAprv());
						chk02Up0.setAttributes(dtl1R);
						chk2L.add(chk02Up0);
					}
				}
			}
			else if (isSame(tgtL.size(), tgtL.subList(tgtLIdx, MAC_DATA_CRUD_TYP.DEL.value()).size())) {
				// 取消行のみなら解除確認し、解除可能であれば解除
				boolean doneNxtOper = MSUCL_SlsUtil.isSloNextOper(subL.get(0).slo_no());
				// チェック処理は承認対象なら常に実行（承認のトラン不整合でしかエラーにならない）
				if (!doneNxtOper || check) {
					// 次処理されていなければ、次処理済ＦＬＧを解除する
					Aprv_Chk02_Rslt1R chk03Up0 = Aprv_Chk02_Rslt1R.create();
					if (!isNull(subL.get(0).aprv_no())) {
						Po_Ins01_DtlR dtl1R = dtlL.getFirst(key, subL.get(0).dtl_peg_no());
						copy(chk03Up0, subL.get(0), createMapAprv());
						chk03Up0.setAttributes(dtl1R);
						chk3L.add(chk03Up0);
					}
				}
			}
		}
	}
	
	/**
	 * 受注状況更新サービス呼び出し処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callSlsUpd(MCList<Po_Ins01_DtlR> dtlL){
		// 受注に紐付く明細を取得する
		MCList<Po_Ins01_DtlR> subL = MCList.create(Po_Ins01_DtlR.class);
		for (Po_Ins01_DtlR r : dtlL) {
			if (!isNull(r.slo_d_no()) && !r.rqst_can_flg()) {
				subL.add(r);
			}
		}
		// 受注状況更新サービスの呼び出し
		MSBBL_SloStsRegService.SloSts_Ins01 sloStsIns01 = MSBBL_SloStsRegService.crtSloSts_Ins01();
		addAll(sloStsIns01.up0(), subL, createMap_SloSts_DtlR_Po_Ins01_DtlR());
		if (sloStsIns01.up0().size() > 0) {
			sloStsIns01.exec();
		}
	}
	
	/**
	 * 購買帳票登録サービス呼び出し処理
	 * @param hdrL
	 */
	protected void callPurcPrntUpd01(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL) {
		MSBDL_PurcPrntService.PurcPrnt_Upd01 purcPrntUpd01 = MSBDL_PurcPrntService.crtPurcPrnt_Upd01();
		addAll(purcPrntUpd01.up0(), hdrL, createMap_PurcPrnt_Upd01_HdrR_Po_Ins01_HdrR());
		purcPrntUpd01.up0().setStringNE(PurcPrnt_Upd01_HdrR.$purc_dlv_slip_src_typ, MSC_PURC_DLV_SLIP_SRC_TYP.PO.value());
		purcPrntUpd01.up1().indiv_prnt_flg(hdrL.get(0).indiv_prnt_flg());
		purcPrntUpd01.exec();
		MCIndexKey d1Idx= purcPrntUpd01.down1().createIndex(PurcPrnt_Upd01_DtlR.$po_d_no);
		
		for (Po_Ins01_DtlR dtlR : dtlL) {
			MCList<PurcPrnt_Upd01_DtlR> down1L = purcPrntUpd01.down1().subList(d1Idx, dtlR.po_d_no());
			if (isNull(down1L) || down1L.size() > 1) {
				dtlR.clear(
						Po_Ins01_DtlR.$dlv_slip_mng_no,
						Po_Ins01_DtlR.$dlv_slip_mng_seq,
						Po_Ins01_DtlR.$dlv_slip_no,
						Po_Ins01_DtlR.$dlv_slip_seq,
						Po_Ins01_DtlR.$dlv_slip_rev
				);
			}
			else {
				PurcPrnt_Upd01_DtlR down1R = down1L.get(0);
				dtlR.dlv_slip_mng_no(down1R.dlv_slip_mng_no());
				dtlR.dlv_slip_mng_seq(down1R.dlv_slip_mng_seq());
				dtlR.dlv_slip_no(down1R.dlv_slip_no());
				dtlR.dlv_slip_seq(down1R.dlv_slip_seq());
				dtlR.dlv_slip_rev(down1R.dlv_slip_rev());
			}
		}
	}
	
	/**
	 * 購買帳票発行サービス呼び出し処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callPurcPrnt01(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL){
		MSBDL_PurcPrntService.PurcPrnt_Prnt01 purcPrnt01 = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
		for (Po_Ins01_HdrR r : hdrL) {
				 // 注文書
				 if (r.prnt_po_flg()) {
					 if (isNoPrntPoTgt(r)) {
						 continue;
					 }
					 PurcPrnt_Prnt01_PoR poR = PurcPrnt_Prnt01_PoR.create();
					 copy(poR, r, createMap_PurcPrnt_Prnt01_PoR_Po_Ins01_HdrR());
					 purcPrnt01.up0().add(poR);
				 }
		}
		purcPrnt01.up3().indiv_prnt_flg(hdrL.get(0).indiv_prnt_flg());
		purcPrnt01.exec();
	}
	
	protected boolean isNoPrntPoTgt(Po_Ins01_HdrR hdrR) {
		return MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && hdrR.bef_po_print_flg() && isSame(hdrR.bef_po_rev(), hdrR.po_rev());
	}
	
	protected void callPurcPrntUpd02(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL) {
		MSBDL_PurcPrntService.PurcPrnt_Upd02 ope = MSBDL_PurcPrntService.crtPurcPrnt_Upd02();
		for (Po_Ins01_HdrR r : hdrL) {
			if (!r.aprv_flg()
			 || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
				&& (MAC_APRV_STS_TYP.isACPT(r.bef_aprv_sts_typ())
						&& r.aprv_rvrs_flg()
					|| isNull(r.bef_aprv_sts_typ())
						&& r.aprv_flg())) {
				
				// 承認対象外⇒納品伝票を作成する
				// 最終承認済みの引き戻し⇒納品伝票を削除する
				// 承認対象外から承認対象⇒納品伝票を削除する
				copy(ope.up0().add(), r, createMap_PurcPrnt_Upd02_HdrR_Po_Ins01_HdrR());
			}
		}
		ope.exec();
		
		// 仕入直送納品書NO、仕入直送納品書改訂番号を電文にコピー
		MCIndexKey idx = ope.down1().createIndex(PurcPrnt_Upd02_DtlR.$po_d_no);
		for (Po_Ins01_DtlR dtlR : dtlL) {
			MCList<PurcPrnt_Upd02_DtlR> downL = ope.down1().subList(idx, dtlR.po_d_no());
			if (isNull(downL) || downL.size() > 1) {
				dtlR.purc_ddlv_dlv_slip_no(null);
				dtlR.purc_ddlv_dlv_slip_rev(null);
			}
			else {
				dtlR.purc_ddlv_dlv_slip_no(downL.get(0).purc_ddlv_dlv_slip_no());
				dtlR.purc_ddlv_dlv_slip_rev(downL.get(0).purc_ddlv_dlv_slip_rev());
			}
		}
	}
	
	protected Map_PurcPrnt_Upd02_HdrR_Po_Ins01_HdrR<PurcPrnt_Upd02_HdrR,Po_Ins01_HdrR> createMap_PurcPrnt_Upd02_HdrR_Po_Ins01_HdrR() {
		return new Map_PurcPrnt_Upd02_HdrR_Po_Ins01_HdrR<PurcPrnt_Upd02_HdrR, Po_Ins01_HdrR>();
	}
	public class Map_PurcPrnt_Upd02_HdrR_Po_Ins01_HdrR<D extends PurcPrnt_Upd02_HdrR, S extends Po_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(src.peg_no());
			dest.po_no(src.po_no());
			
			if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				if (MAC_APRV_STS_TYP.isACPT(src.bef_aprv_sts_typ()) && src.aprv_rvrs_flg()) {
					// 承認引戻し
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if  (isNull(src.bef_aprv_sts_typ()) && src.aprv_flg()) {
					// 承認対象外から承認対象
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (!isNull(src.bef_aprv_sts_typ()) && !src.aprv_flg()) {
					// 承認対象から承認対象外
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
			else {
				dest.data_crud_typ(src.data_crud_typ());
			}
			
			dest.dlv_slip_prnt_flg(src.prnt_purc_ddlv_dlv_flg());
			dest.indiv_prnt_flg(src.indiv_prnt_flg());
		}
	}
	/**
	 * 諸口品更新リスト作成
	 */
	protected void callSundryItmUpd01(MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> dtl2L) {
		MCList<Po_Ins01_DtlR> subL = MCList.create(Po_Ins01_DtlR.class);
		MCIndexKey idxDtl2L = dtl2L.createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
		for (Po_Ins01_DtlR r : dtlL) {
			boolean isTrgt = true;
			MCList<Po_Ins01_Bndl_DtlR> tmpL = dtl2L.subList(idxDtl2L, r.peg_no());
			for (Po_Ins01_Bndl_DtlR tmpR : tmpL) {
				if (!isNull(tmpR.po_schd_no())) {
					isTrgt = false;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					isTrgt = false;
				}
			}
			if (isTrgt) {
				subL.add(r);
			}
		}
		
		MABCL_SundryItmRegService.SundryItm_Upd01 upd01 = MABCL_SundryItmRegService.crtSundryItm_Upd01();
		addAll(upd01.up0(), subL.subList(Po_Ins01_DtlR.$sundry_itm_flg, true), createMap_SundryItm_Upd01_DtlR_Po_Ins01_DtlR());
		upd01.exec();
	}
	/**
	 * ＥＤＩ発注送信サービス呼び出し処理
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callPoEDI(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL, MCList<Po_Ins01_Bndl_DtlR> bndlDtlL){
		MSLAL_PoSendIfService.PoSendIf_Upd01 o = MSLAL_PoSendIfService.crtPoSendIf_Upd01();
		
		MCIndexKey idx = dtlL.createIndex(Po_Ins01_DtlR.$hdr_peg_no);
		for (Po_Ins01_HdrR r : hdrL) {	
			if (r.edi_flg()) {
				// ＩＦデータを送信しない状態から送信しない状態へ遷移する場合は、発注送信ＩＦを実行しない。
				// (ＩＦデータを送信する状態から送信しない状態へ遷移する場合は、取消のデータを送信する場合があるので、発注送信ＩＦを実行する）
				// 却下 → 未承認
				// 否認 → 未承認
				if (MAC_APRV_STS_TYP.isRJCT(r.bef_aprv_sts_typ()) && MAC_APRV_STS_TYP.isOPN(r.aprv_sts_typ())
						|| MAC_APRV_STS_TYP.isLAST_RJCT(r.bef_aprv_sts_typ()) && MAC_APRV_STS_TYP.isOPN(r.aprv_sts_typ())) {
					continue;
				}
				if (isNoSendEdiTgt(r)) {
					 continue;
				}
				PoSendIf_Upd01_DtlR addR = PoSendIf_Upd01_DtlR.create();
				copy(addR, r, createMapPoSendIfH());
				o.up0().add(addR);
				MCList<PoSendIf_Upd01_Dtl2R> addL = MCList.create(PoSendIf_Upd01_Dtl2R.class);
				MCList<Po_Ins01_DtlR> tgtDtlL = dtlL.subList(idx, r.peg_no());
				addAll(addL, tgtDtlL, createMapPoSendIFD());
				o.up1().addAll(addL);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	
	protected boolean isNoSendEdiTgt(Po_Ins01_HdrR hdrR) {
		return MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && hdrR.bef_edi_flg() && isSame(hdrR.bef_po_rev(), hdrR.po_rev());
	}
	
	/**
	 * Po_Ins01/Po_Upd01/Po_Del01から呼出する共通処理
	 * 
	 * @param hdrL
	 * @param dtlL
	 */
	protected void callCredUpd02(MCList<Po_Ins01_HdrR> hdrL, MCList<Po_Ins01_DtlR> dtlL) {

		if (getCo().ap_no_use_flg()) {
			return;
		}
		
		MCList<MST_PO_D_R> bfDtlL = MCList.create(MST_PO_D_R.class);
		MCList<MST_PO_D_R> afDtlL = MCList.create(MST_PO_D_R.class);
		for (Po_Ins01_DtlR dtlR : dtlL) {
			if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				afDtlL.add(dtlR.pod());
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				if (!dtlR.bef_abort_flg()) {
					bfDtlL.add(getCachePoD(dtlR.po_d_no()));
				}
			}
			else {
				if(!dtlR.arr_rem_abort_flg() && !dtlR.purc_rem_abort_flg()) {
					if (!dtlR.bef_abort_flg()) {
						bfDtlL.add(getCachePoD(dtlR.po_d_no()));
					}
					if (!dtlR.abort_flg()) {
						afDtlL.add(dtlR.pod());
					}
				}
			}
		}

		FXUCL_Cache<Cred_Upd02_CndR> credCache = new FXUCL_Cache<>();
		ArrayList<Comparable<?>[]> keyL =  new ArrayList<>();

		for (MST_PO_D_R r : bfDtlL) {
			MST_PO_R hdrR = getCachePo(r.po_no());
			Comparable<?>[] key = {hdrR.sppl_cd(), hdrR.trd_cur_cd()};
			Cred_Upd02_CndR cndR = credCache.getCache(key);
			if (isNull(cndR)) {
				cndR = Cred_Upd02_CndR.create();
				cndR.sppl_cd(hdrR.sppl_cd());
				cndR.cur_cd(hdrR.trd_cur_cd());
				cndR.amt(0);
				credCache.putCache(key, cndR);
				keyL.add(key);
			}
			cndR.amt(MCNumber.sum(cndR.amt(), getTrdCurIncTaxAmt(r, true)));
		}

		MCIndexKey hdrIdxkey = hdrL.createIndex(Po_Ins01_HdrR.$po_no);

		for (MST_PO_D_R r : afDtlL) {
			Po_Ins01_HdrR hdrR = hdrL.getFirst(hdrIdxkey, r.po_no());
			Comparable<?>[] key = {hdrR.sppl_cd(), hdrR.trd_cur_cd()};
			Cred_Upd02_CndR cndR = credCache.getCache(key);
			if (isNull(cndR)) {
				cndR = Cred_Upd02_CndR.create();
				cndR.sppl_cd(hdrR.sppl_cd());
				cndR.cur_cd(hdrR.trd_cur_cd());
				cndR.amt(0);
				credCache.putCache(key, cndR);
				keyL.add(key);
			}	
			cndR.amt(MCNumber.sum(cndR.amt(), getTrdCurIncTaxAmt(r, false)));
		}

		MCList<Cred_Upd02_CndR> upL = MCList.create(Cred_Upd02_CndR.class);
		for (Comparable<?>[] key : keyL) {
			Cred_Upd02_CndR cndR = credCache.getCache(key);
			if (!MCNumber.ZERO.eq(cndR.amt())) {
				upL.add(cndR);
			}
		}

		if (!isNull(upL)) {
			MSBGL_CredService.Cred_Upd02 credUpd02 = MSBGL_CredService.crtCred_Upd02();
			credUpd02.up0().addAll(upL);
			credUpd02.exec();
		}
	}
	protected boolean isArrRemAbort(MST_ARR_SCHD_R r, MST_ARR_PR_R arrPrR) {
		return 	(arrPrR.purc_qty().gt(MCNumber.ZERO) || arrPrR.arr_qty().gt(MCNumber.ZERO)) && !(r.base_unit_qty().lte(r.arr_qty()));
	}

	protected boolean isPurcRemAbort(MST_ARR_SCHD_R r, MST_ARR_PR_R arrPrR) {
		return (arrPrR.purc_qty().gt(MCNumber.ZERO) || arrPrR.arr_qty().gt(MCNumber.ZERO))
				&& !(r.getNumberNE("base_unit_schd_qty").lte(r.purc_qty().add(r.getNumberNE("base_unit_accpt_dfct_qty"))));
	}
	
	protected MCNumber getTrdCurIncTaxAmt(MST_PO_D_R podR, boolean updBfFlg) {

		MCNumber ttlAmt = MCNumber.sum(MCNumber.ZERO, podR.trd_cur_amt(),
				podR.trd_cur_tax_amt());
		boolean minusFlg = updBfFlg == getCacheItm(podR.itm_cd(), podR.itm_sub1(),
				podR.itm_sub2(), podR.itm_sub3()).dscnt_itm_flg();

		if (minusFlg) {
			return ttlAmt.negate();
		}
		else {
			return ttlAmt;
		}
	}
	protected MapPoSendIfH<PoSendIf_Upd01_DtlR, Po_Ins01_HdrR> createMapPoSendIfH() {
		return new MapPoSendIfH<PoSendIf_Upd01_DtlR, Po_Ins01_HdrR>();
	}

	public class MapPoSendIfH<D extends PoSendIf_Upd01_DtlR, S extends Po_Ins01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PoSendIf_Upd01_DtlR.$po_no, Po_Ins01_HdrR.$po_no);
			addColumnPathMap(PoSendIf_Upd01_DtlR.$data_crud_typ, Po_Ins01_HdrR.$data_crud_typ);
			addColumnPathMap(PoSendIf_Upd01_DtlR.$bef_aprv_sts_typ, Po_Ins01_HdrR.$bef_aprv_sts_typ);
		}
	}

	protected MapPoSendIfD<PoSendIf_Upd01_Dtl2R, Po_Ins01_DtlR> createMapPoSendIFD() {
		return new MapPoSendIfD<PoSendIf_Upd01_Dtl2R, Po_Ins01_DtlR>();
	}

	public class MapPoSendIfD<D extends PoSendIf_Upd01_Dtl2R, S extends Po_Ins01_DtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PoSendIf_Upd01_Dtl2R.$po_no, Po_Ins01_DtlR.$po_no);
			addColumnPathMap(PoSendIf_Upd01_Dtl2R.$po_d_no, Po_Ins01_DtlR.$po_d_no);
			addColumnPathMap(PoSendIf_Upd01_Dtl2R.$data_crud_typ, Po_Ins01_DtlR.$data_crud_typ);
		}
	}
	
	protected MapAprvChk04<Aprv_Chk04_Rslt1R,Po_Ins01_HdrR> createMapAprvChk04() {
		return new MapAprvChk04<Aprv_Chk04_Rslt1R, Po_Ins01_HdrR>();
	}

	public class MapAprvChk04<D extends Aprv_Chk04_Rslt1R, S extends Po_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Aprv_Chk04_Rslt1R.$aprv_no, Po_Ins01_HdrR.$bef_aprv_no);
			addColumnPathMap(Aprv_Chk04_Rslt1R.$peg_no, Po_Ins01_HdrR.$peg_no);
		}
	}


	/** 承認提供ＳＶコール用MAP */
	protected Map_Aprv_Chk01_Rslt1R_Po_Ins01_HdrR<Aprv_Chk01_Rslt1R,Po_Ins01_HdrR> createMap_Aprv_Chk01_Rslt1R_Po_Ins01_HdrR() {
		return new Map_Aprv_Chk01_Rslt1R_Po_Ins01_HdrR<Aprv_Chk01_Rslt1R, Po_Ins01_HdrR>();
	}

	public class Map_Aprv_Chk01_Rslt1R_Po_Ins01_HdrR<D extends Aprv_Chk01_Rslt1R, S extends Po_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Aprv_Chk01_Rslt1R.$peg_no, Po_Ins01_HdrR.$peg_no);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$aprv_no, Po_Ins01_HdrR.$bef_aprv_no);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$biz_usr_cd, Po_Ins01_HdrR.$purc_usr_cd);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$master_dt, Po_Ins01_HdrR.$po_dt);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$src_dpt_cd, Po_Ins01_HdrR.$purc_dpt_cd);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$src_bp_cd, Po_Ins01_HdrR.$sppl_cd);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$src_cur_cd1, Po_Ins01_HdrR.$trd_cur_cd);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$src_amt1, Po_Ins01_HdrR.$trd_cur_ttl_amt);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$aprv_src_no1, Po_Ins01_HdrR.$po_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			if (MAC_TRD_PTN_TYP.isPURC(src.trd_ptn_typ())) {
				dest.aprv_func_typ(MAC_APRV_FUNC_TYP.PO.value());
			}
			else {
				dest.aprv_func_typ(MAC_APRV_FUNC_TYP.XPNS_PO.value());
			}
		}
	}
	
	/** オーダ登録ＳＶコール用MAP */
	protected Map_Ord_Upd01_Dtl1R_Po_Ins01_DtlR<Ord_Upd01_Dtl1R,Po_Ins01_DtlR> createMap_Ord_Upd01_Dtl1R_Po_Ins01_DtlR() {
		return new Map_Ord_Upd01_Dtl1R_Po_Ins01_DtlR<Ord_Upd01_Dtl1R, Po_Ins01_DtlR>();
	}

	public class Map_Ord_Upd01_Dtl1R_Po_Ins01_DtlR<D extends Ord_Upd01_Dtl1R, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			// 削除・新規共通
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Po_Ins01_DtlR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Po_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Po_Ins01_DtlR.$outsrc_itm_ord_no);
			// 新規時のみ必要
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Po_Ins01_DtlR.$itm_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Po_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Po_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Po_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, Po_Ins01_DtlR.$ver_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, Po_Ins01_DtlR.$in_to_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, Po_Ins01_DtlR.$mfg_loc_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sppl_cd, Po_Ins01_DtlR.$sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$maker_cd, Po_Ins01_DtlR.$maker_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, Po_Ins01_DtlR.$bom_ptn);
			addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, Po_Ins01_DtlR.$base_unit_qty);
			addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, Po_Ins01_DtlR.$rqst_avl_rqst_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, Po_Ins01_DtlR.$po_dt);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, Po_Ins01_DtlR.$sno1);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, Po_Ins01_DtlR.$sno2);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, Po_Ins01_DtlR.$sno3);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, Po_Ins01_DtlR.$sno4);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
		}
	}
	
	/** 外注製造指図ＳＶコール用MAP */
	protected Map_OutSrcInst_Chk01_PoDR_Po_Ins01_DtlR<OutSrcInst_Chk01_PoDR,Po_Ins01_DtlR> createMap_OutSrcInst_Chk01_PoDR_Po_Ins01_DtlR() {
		return new Map_OutSrcInst_Chk01_PoDR_Po_Ins01_DtlR<OutSrcInst_Chk01_PoDR, Po_Ins01_DtlR>();
	}

	public class Map_OutSrcInst_Chk01_PoDR_Po_Ins01_DtlR<D extends OutSrcInst_Chk01_PoDR, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$peg_no, Po_Ins01_DtlR.$peg_no);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$data_crud_typ, Po_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$po_d_no, Po_Ins01_DtlR.$po_d_no);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$outsrc_itm_ord_no, Po_Ins01_DtlR.$outsrc_itm_ord_no);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$base_unit_qty, Po_Ins01_DtlR.$base_unit_qty);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$sno1, Po_Ins01_DtlR.$sno1);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$sno2, Po_Ins01_DtlR.$sno2);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$sno3, Po_Ins01_DtlR.$sno3);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$sno4, Po_Ins01_DtlR.$sno4);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$rqst_dlv_rqst_tm, Po_Ins01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$abort_flg, Po_Ins01_DtlR.$abort_flg);
			addColumnPathMap(OutSrcInst_Chk01_PoDR.$po_dt, Po_Ins01_DtlR.$po_dt);
		}
	
	}
	
	protected Map_OutSrcInst_Chk01_SchdPoDR_Po_Ins01_Bndl_DtlR<OutSrcInst_Chk01_SchdPoDR,Po_Ins01_Bndl_DtlR> createMap_OutSrcInst_Chk01_SchdPoDR_Po_Ins01_Bndl_DtlR() {
		return new Map_OutSrcInst_Chk01_SchdPoDR_Po_Ins01_Bndl_DtlR<OutSrcInst_Chk01_SchdPoDR, Po_Ins01_Bndl_DtlR>();
	}
	public class Map_OutSrcInst_Chk01_SchdPoDR_Po_Ins01_Bndl_DtlR<D extends OutSrcInst_Chk01_SchdPoDR, S extends Po_Ins01_Bndl_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcInst_Chk01_SchdPoDR.$hdr_peg_no, Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			addColumnPathMap(OutSrcInst_Chk01_SchdPoDR.$outsrc_itm_ord_no, Po_Ins01_Bndl_DtlR.$outsrc_itm_ord_no);

		}
	}
	
	protected Map_OutSrcAct_Chk01_ActDR_Chk05_DtlR<OutSrcAct_Chk01_ActDR, Po_Ins01_DtlR> createMap_OutSrcAct_Chk01_ActDR_Po_Ins01_DtlR() {
		return new Map_OutSrcAct_Chk01_ActDR_Chk05_DtlR<OutSrcAct_Chk01_ActDR, Po_Ins01_DtlR>();
	}
	
	public class Map_OutSrcAct_Chk01_ActDR_Chk05_DtlR<D extends OutSrcAct_Chk01_ActDR, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcAct_Chk01_ActDR.$peg_no, Po_Ins01_DtlR.$peg_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
		
	}
	
	protected Map_ArrPr_DtlR_MST_ARR_PR_R<ArrPr_DtlR,MST_ARR_PR_R> createMap_ArrPr_DtlR_MST_ARR_PR_R() {
		return new Map_ArrPr_DtlR_MST_ARR_PR_R<ArrPr_DtlR, MST_ARR_PR_R>();
	}
	
	public class Map_ArrPr_DtlR_MST_ARR_PR_R<D extends ArrPr_DtlR, S extends MST_ARR_PR_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrPr_DtlR.$arr_pr_no, MST_ARR_PR_R.$arr_pr_no);
			addColumnPathMap(ArrPr_DtlR.$trd_cd, MST_ARR_PR_R.$trd_cd);
			addColumnPathMap(ArrPr_DtlR.$trd_ptn_typ, MST_ARR_PR_R.$trd_ptn_typ);
			addColumnPathMap(ArrPr_DtlR.$po_d_no, MST_ARR_PR_R.$po_d_no);
			addColumnPathMap(ArrPr_DtlR.$sls_ret_schd_d_no, MST_ARR_PR_R.$sls_ret_schd_d_no);
			addColumnPathMap(ArrPr_DtlR.$dlv_slip_d_no, MST_ARR_PR_R.$dlv_slip_d_no);
			addColumnPathMap(ArrPr_DtlR.$iv_d_no, MST_ARR_PR_R.$iv_d_no);
			addColumnPathMap(ArrPr_DtlR.$rqst_dpt_cd, MST_ARR_PR_R.$rqst_dpt_cd);
			addColumnPathMap(ArrPr_DtlR.$rqst_wg_cd, MST_ARR_PR_R.$rqst_wg_cd);
			addColumnPathMap(ArrPr_DtlR.$rqst_usr_cd, MST_ARR_PR_R.$rqst_usr_cd);
			addColumnPathMap(ArrPr_DtlR.$cst_cd, MST_ARR_PR_R.$cst_cd);
			addColumnPathMap(ArrPr_DtlR.$sret_fr_cd, MST_ARR_PR_R.$sret_fr_cd);
			addColumnPathMap(ArrPr_DtlR.$sppl_cd, MST_ARR_PR_R.$sppl_cd);
			addColumnPathMap(ArrPr_DtlR.$ret_dlv_slip_d_no, MST_ARR_PR_R.$ret_dlv_slip_d_no);
			addColumnPathMap(ArrPr_DtlR.$ret_stk_arrv_bp_cd, MST_ARR_PR_R.$ret_stk_arrv_bp_cd);
			addColumnPathMap(ArrPr_DtlR.$dlv_rqst_tm, MST_ARR_PR_R.$dlv_rqst_tm);
			addColumnPathMap(ArrPr_DtlR.$prms_rcpt_dt, MST_ARR_PR_R.$prms_rcpt_dt);
			addColumnPathMap(ArrPr_DtlR.$prms_dlv_dt, MST_ARR_PR_R.$prms_dlv_dt);
			addColumnPathMap(ArrPr_DtlR.$prms_refl_dt, MST_ARR_PR_R.$prms_refl_dt);
			addColumnPathMap(ArrPr_DtlR.$dlv_inst_dt, MST_ARR_PR_R.$dlv_inst_dt);
			addColumnPathMap(ArrPr_DtlR.$dlv_inst_prms_rcpt_dt, MST_ARR_PR_R.$dlv_inst_prms_rcpt_dt);
			addColumnPathMap(ArrPr_DtlR.$dlv_inst_prms_refl_dt, MST_ARR_PR_R.$dlv_inst_prms_refl_dt);
			addColumnPathMap(ArrPr_DtlR.$arr_schd_tm, MST_ARR_PR_R.$arr_schd_tm);
			addColumnPathMap(ArrPr_DtlR.$arr_tm, MST_ARR_PR_R.$arr_tm);
			addColumnPathMap(ArrPr_DtlR.$purc_dt, MST_ARR_PR_R.$purc_dt);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_qty, MST_ARR_PR_R.$trd_unit_qty);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_cd, MST_ARR_PR_R.$trd_unit_cd);
			addColumnPathMap(ArrPr_DtlR.$prms_rcpt_qty, MST_ARR_PR_R.$prms_rcpt_qty);
			addColumnPathMap(ArrPr_DtlR.$prms_refl_qty, MST_ARR_PR_R.$prms_refl_qty);
			addColumnPathMap(ArrPr_DtlR.$dlv_inst_qty, MST_ARR_PR_R.$dlv_inst_qty);
			addColumnPathMap(ArrPr_DtlR.$dlv_inst_prms_rcpt_qty, MST_ARR_PR_R.$dlv_inst_prms_rcpt_qty);
			addColumnPathMap(ArrPr_DtlR.$dlv_inst_prms_refl_qty, MST_ARR_PR_R.$dlv_inst_prms_refl_qty);
			addColumnPathMap(ArrPr_DtlR.$re_arr_schd_qty, MST_ARR_PR_R.$re_arr_schd_qty);
			addColumnPathMap(ArrPr_DtlR.$rcpt_iv_qty, MST_ARR_PR_R.$rcpt_iv_qty);
			addColumnPathMap(ArrPr_DtlR.$arr_qty, MST_ARR_PR_R.$arr_qty);
			addColumnPathMap(ArrPr_DtlR.$purc_qty, MST_ARR_PR_R.$purc_qty);
			addColumnPathMap(ArrPr_DtlR.$sls_ret_qty, MST_ARR_PR_R.$sls_ret_qty);
			addColumnPathMap(ArrPr_DtlR.$abort_flg, MST_ARR_PR_R.$abort_flg);
			addColumnPathMap(ArrPr_DtlR.$arr_schd_abort_qty, MST_ARR_PR_R.$arr_schd_abort_qty);
			addColumnPathMap(ArrPr_DtlR.$purc_schd_abort_qty, MST_ARR_PR_R.$purc_schd_abort_qty);
			addColumnPathMap(ArrPr_DtlR.$sls_ret_schd_abort_qty, MST_ARR_PR_R.$sls_ret_schd_abort_qty);
			addColumnPathMap(ArrPr_DtlR.$std_purc_lt, MST_ARR_PR_R.$std_purc_lt);
			addColumnPathMap(ArrPr_DtlR.$rsn_cd, MST_ARR_PR_R.$rsn_cd);
			addColumnPathMap(ArrPr_DtlR.$bd_dpt_cd, MST_ARR_PR_R.$bd_dpt_cd);
			addColumnPathMap(ArrPr_DtlR.$bd_wg_cd, MST_ARR_PR_R.$bd_wg_cd);
			addColumnPathMap(ArrPr_DtlR.$purc_ddlv_flg, MST_ARR_PR_R.$purc_ddlv_flg);
			addColumnPathMap(ArrPr_DtlR.$purc_sts_typ, MST_ARR_PR_R.$purc_sts_typ);
			addColumnPathMap(ArrPr_DtlR.$prms_dlv_dt_overdue_flg, MST_ARR_PR_R.$prms_dlv_dt_overdue_flg);
			addColumnPathMap(ArrPr_DtlR.$dlv_rqst_dt_overdue_flg, MST_ARR_PR_R.$dlv_rqst_dt_overdue_flg);
			addColumnPathMap(ArrPr_DtlR.$arr_schd_split_flg, MST_ARR_PR_R.$arr_schd_split_flg);
			addColumnPathMap(ArrPr_DtlR.$arr_cmpl_flg, MST_ARR_PR_R.$arr_cmpl_flg);
			addColumnPathMap(ArrPr_DtlR.$purc_cmpl_flg, MST_ARR_PR_R.$purc_cmpl_flg);
			addColumnPathMap(ArrPr_DtlR.$sls_ret_cmpl_flg, MST_ARR_PR_R.$sls_ret_cmpl_flg);
			addColumnPathMap(ArrPr_DtlR.$arr_cnt_rmrks, MST_ARR_PR_R.$arr_cnt_rmrks);
			addColumnPathMap(ArrPr_DtlR.$sub_char1, MST_ARR_PR_R.$sub_char1);
			addColumnPathMap(ArrPr_DtlR.$sub_char2, MST_ARR_PR_R.$sub_char2);
			addColumnPathMap(ArrPr_DtlR.$sub_char3, MST_ARR_PR_R.$sub_char3);
		}
	}
	
	protected Map_ArrSchd_DtlR_MST_ARR_SCHD_R<ArrSchd_DtlR,MST_ARR_SCHD_R> createMap_ArrSchd_DtlR_MST_ARR_SCHD_R() {
		return new Map_ArrSchd_DtlR_MST_ARR_SCHD_R<ArrSchd_DtlR, MST_ARR_SCHD_R>();
	}
	
	public class Map_ArrSchd_DtlR_MST_ARR_SCHD_R<D extends ArrSchd_DtlR, S extends MST_ARR_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, MST_ARR_SCHD_R.$arr_schd_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_pr_no, MST_ARR_SCHD_R.$arr_pr_no);
			addColumnPathMap(ArrSchd_DtlR.$prms_rcpt_d_no, MST_ARR_SCHD_R.$prms_rcpt_d_no);
			addColumnPathMap(ArrSchd_DtlR.$dlv_inst_d_no, MST_ARR_SCHD_R.$dlv_inst_d_no);
			addColumnPathMap(ArrSchd_DtlR.$purc_act_d_no, MST_ARR_SCHD_R.$purc_act_d_no);
			addColumnPathMap(ArrSchd_DtlR.$rcpt_iv_no, MST_ARR_SCHD_R.$rcpt_iv_no);
			addColumnPathMap(ArrSchd_DtlR.$rcpt_iv_mng_no, MST_ARR_SCHD_R.$rcpt_iv_mng_no);
			addColumnPathMap(ArrSchd_DtlR.$pr_sts_typ, MST_ARR_SCHD_R.$pr_sts_typ);
			addColumnPathMap(ArrSchd_DtlR.$wg_cd, MST_ARR_SCHD_R.$wg_cd);
			addColumnPathMap(ArrSchd_DtlR.$dlv_slip_no, MST_ARR_SCHD_R.$dlv_slip_no);
			addColumnPathMap(ArrSchd_DtlR.$iv_no, MST_ARR_SCHD_R.$iv_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_ptn_typ, MST_ARR_SCHD_R.$arr_ptn_typ);
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_tm, MST_ARR_SCHD_R.$arr_schd_tm);
			addColumnPathMap(ArrSchd_DtlR.$itm_cd, MST_ARR_SCHD_R.$itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub1, MST_ARR_SCHD_R.$itm_sub1);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub2, MST_ARR_SCHD_R.$itm_sub2);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub3, MST_ARR_SCHD_R.$itm_sub3);
			addColumnPathMap(ArrSchd_DtlR.$itm_nm, MST_ARR_SCHD_R.$itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$rcpt_iv_itm_nm, MST_ARR_SCHD_R.$rcpt_iv_itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$sundry_itm_flg, MST_ARR_SCHD_R.$sundry_itm_flg);
			addColumnPathMap(ArrSchd_DtlR.$purc_id_typ, MST_ARR_SCHD_R.$purc_id_typ);
			addColumnPathMap(ArrSchd_DtlR.$sno1, MST_ARR_SCHD_R.$sno1);
			addColumnPathMap(ArrSchd_DtlR.$sno2, MST_ARR_SCHD_R.$sno2);
			addColumnPathMap(ArrSchd_DtlR.$sno3, MST_ARR_SCHD_R.$sno3);
			addColumnPathMap(ArrSchd_DtlR.$sno4, MST_ARR_SCHD_R.$sno4);
			addColumnPathMap(ArrSchd_DtlR.$lot_no, MST_ARR_SCHD_R.$lot_no);
			addColumnPathMap(ArrSchd_DtlR.$sublot_no, MST_ARR_SCHD_R.$sublot_no);
			addColumnPathMap(ArrSchd_DtlR.$ver_no, MST_ARR_SCHD_R.$ver_no);
			addColumnPathMap(ArrSchd_DtlR.$stk_arrv_bp_cd, MST_ARR_SCHD_R.$stk_arrv_bp_cd);
			addColumnPathMap(ArrSchd_DtlR.$gd_cd, MST_ARR_SCHD_R.$gd_cd);
			addColumnPathMap(ArrSchd_DtlR.$quality_typ, MST_ARR_SCHD_R.$quality_typ);
			addColumnPathMap(ArrSchd_DtlR.$stk_insp_typ, MST_ARR_SCHD_R.$stk_insp_typ);
			addColumnPathMap(ArrSchd_DtlR.$stk_id_typ, MST_ARR_SCHD_R.$stk_id_typ);
			addColumnPathMap(ArrSchd_DtlR.$stk_bp_cd, MST_ARR_SCHD_R.$stk_bp_cd);
			addColumnPathMap(ArrSchd_DtlR.$sppl_itm_cd, MST_ARR_SCHD_R.$sppl_itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$sppl_itm_nm, MST_ARR_SCHD_R.$sppl_itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$maker_cd, MST_ARR_SCHD_R.$maker_cd);
			addColumnPathMap(ArrSchd_DtlR.$bp_lot_no, MST_ARR_SCHD_R.$bp_lot_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_loc_cd, MST_ARR_SCHD_R.$arr_loc_cd);
			addColumnPathMap(ArrSchd_DtlR.$str_ln_cd, MST_ARR_SCHD_R.$str_ln_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_qty, MST_ARR_SCHD_R.$trd_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_cd, MST_ARR_SCHD_R.$trd_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_qty, MST_ARR_SCHD_R.$base_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_cd, MST_ARR_SCHD_R.$base_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$arr_qty, MST_ARR_SCHD_R.$arr_qty);
			addColumnPathMap(ArrSchd_DtlR.$purc_qty, MST_ARR_SCHD_R.$purc_qty);
			addColumnPathMap(ArrSchd_DtlR.$sls_ret_qty, MST_ARR_SCHD_R.$sls_ret_qty);
			addColumnPathMap(ArrSchd_DtlR.$abort_qty, MST_ARR_SCHD_R.$abort_qty);
			addColumnPathMap(ArrSchd_DtlR.$abort_flg, MST_ARR_SCHD_R.$abort_flg);
			addColumnPathMap(ArrSchd_DtlR.$sls_ret_schd_abort_qty, MST_ARR_SCHD_R.$sls_ret_schd_abort_qty);
			addColumnPathMap(ArrSchd_DtlR.$sls_ret_schd_abort_flg, MST_ARR_SCHD_R.$sls_ret_schd_abort_flg);
			addColumnPathMap(ArrSchd_DtlR.$sync_flg, MST_ARR_SCHD_R.$sync_flg);
			addColumnPathMap(ArrSchd_DtlR.$cmpl_flg, MST_ARR_SCHD_R.$cmpl_flg);
			addColumnPathMap(ArrSchd_DtlR.$sls_ret_schd_cmpl_flg, MST_ARR_SCHD_R.$sls_ret_schd_cmpl_flg);
			addColumnPathMap(ArrSchd_DtlR.$arr_skip_flg, MST_ARR_SCHD_R.$arr_skip_flg);
			addColumnPathMap(ArrSchd_DtlR.$re_arr_schd_flg, MST_ARR_SCHD_R.$re_arr_schd_flg);
			addColumnPathMap(ArrSchd_DtlR.$outsrc_flg, MST_ARR_SCHD_R.$outsrc_flg);
			addColumnPathMap(ArrSchd_DtlR.$mfg_inst_no, MST_ARR_SCHD_R.$mfg_inst_no);
			addColumnPathMap(ArrSchd_DtlR.$pre_outsrc_act_flg, MST_ARR_SCHD_R.$pre_outsrc_act_flg);
			addColumnPathMap(ArrSchd_DtlR.$pre_mfg_act_no, MST_ARR_SCHD_R.$pre_mfg_act_no);
			addColumnPathMap(ArrSchd_DtlR.$intr_rmrks, MST_ARR_SCHD_R.$intr_rmrks);
			addColumnPathMap(ArrSchd_DtlR.$trd_rmrks, MST_ARR_SCHD_R.$trd_rmrks);
			addColumnPathMap(ArrSchd_DtlR.$trd_d_rmrks, MST_ARR_SCHD_R.$trd_d_rmrks);
			addColumnPathMap(ArrSchd_DtlR.$arr_cnt_rmrks, MST_ARR_SCHD_R.$arr_cnt_rmrks);
			addColumnPathMap(ArrSchd_DtlR.$io_schd_pr_no, MST_ARR_SCHD_R.$io_schd_pr_no);
			addColumnPathMap(ArrSchd_DtlR.$sub_char1, MST_ARR_SCHD_R.$sub_char1);
			addColumnPathMap(ArrSchd_DtlR.$sub_char2, MST_ARR_SCHD_R.$sub_char2);
			addColumnPathMap(ArrSchd_DtlR.$sub_char3, MST_ARR_SCHD_R.$sub_char3);
		}
	}
	
	protected Map_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02<ArrSchd_DtlR, Po_Ins01_DtlR, MST_ARR_SCHD_R> createMap_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02() {
		return new Map_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02<ArrSchd_DtlR, Po_Ins01_DtlR, MST_ARR_SCHD_R>();
	}
	
	public class Map_ArrSchd_DtlR_MST_ARR_SCHD_R_FOR02<D extends ArrSchd_DtlR, S extends Po_Ins01_DtlR, W extends MST_ARR_SCHD_R>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;
		
		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no());
			dest.arr_schd_no(_dtlR.arr_schd_no());
			dest.lot_no(_dtlR.lot_no());
			dest.sublot_no(_dtlR.sublot_no());
			dest.peg_no(src.peg_no());
			dest.bp_lot_no(_dtlR.bp_lot_no());
			dest.bp_lot_upd_flg(true);
			dest.is_src_purcdlvadjst_flg(true);
		}
	}
	
	protected Map_PurcSchd_DtlR_MST_ARR_SCHD_R<PurcSchd_DtlR, Po_Ins01_DtlR, MST_ARR_SCHD_R> createMap_PurcSchd_DtlR_MST_ARR_SCHD_R() {
		return new Map_PurcSchd_DtlR_MST_ARR_SCHD_R<PurcSchd_DtlR, Po_Ins01_DtlR, MST_ARR_SCHD_R>();
	}
	
	public class Map_PurcSchd_DtlR_MST_ARR_SCHD_R<D extends PurcSchd_DtlR, S extends Po_Ins01_DtlR, W extends MST_ARR_SCHD_R>
			extends MAUCC_RowMapperWith<D, S, W> {
		protected W _dtlR;
		
		@Override
		public void setWith(W dtlR) {
			this._dtlR = dtlR;
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no());
			dest.arr_schd_no(_dtlR.arr_schd_no());
		}
	}
			
	/** 入荷予定ＳＶコール用MAP（入荷進捗ブロック） */
	protected Map_ArrPr_DtlR_Po_Ins01_DtlR<ArrPr_DtlR,Po_Ins01_DtlR> createMap_ArrPr_DtlR_Po_Ins01_DtlR() {
		return new Map_ArrPr_DtlR_Po_Ins01_DtlR<ArrPr_DtlR, Po_Ins01_DtlR>();
	}

	public class Map_ArrPr_DtlR_Po_Ins01_DtlR<D extends ArrPr_DtlR, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			//　納期回答系は更新時にすべて消すので、常に設定しない
			//　納品書系は帳票発行ＳＶから呼ぶので、設定しない
			//　受領ＩＶ系はインボイス登録後更新不可にするため、設定しない
			addColumnPathMap(ArrPr_DtlR.$peg_no, Po_Ins01_DtlR.$peg_no);
			addColumnPathMap(ArrPr_DtlR.$data_crud_typ, Po_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(ArrPr_DtlR.$arr_pr_no, Po_Ins01_DtlR.$arr_pr_no);
			addColumnPathMap(ArrPr_DtlR.$trd_cd, Po_Ins01_DtlR.$trd_cd);
			addColumnPathMap(ArrPr_DtlR.$trd_ptn_typ, Po_Ins01_DtlR.$trd_ptn_typ);
			addColumnPathMap(ArrPr_DtlR.$po_d_no, Po_Ins01_DtlR.$po_d_no);
			addColumnPathMap(ArrPr_DtlR.$rqst_dpt_cd, Po_Ins01_DtlR.$purc_dpt_cd);
			addColumnPathMap(ArrPr_DtlR.$rqst_wg_cd, Po_Ins01_DtlR.$wg_cd);
			addColumnPathMap(ArrPr_DtlR.$rqst_usr_cd, Po_Ins01_DtlR.$purc_usr_cd);
			addColumnPathMap(ArrPr_DtlR.$sppl_cd, Po_Ins01_DtlR.$sppl_cd);
			addColumnPathMap(ArrPr_DtlR.$dlv_rqst_tm, Po_Ins01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_qty, Po_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_cd, Po_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(ArrPr_DtlR.$abort_flg, Po_Ins01_DtlR.$abort_flg);
			addColumnPathMap(ArrPr_DtlR.$rsn_cd,  Po_Ins01_DtlR.$purc_rsn_cd);
			addColumnPathMap(ArrPr_DtlR.$bd_dpt_cd, Po_Ins01_DtlR.$bd_dpt_cd);
			addColumnPathMap(ArrPr_DtlR.$bd_wg_cd, Po_Ins01_DtlR.$bd_wg_cd);
			addColumnPathMap(ArrPr_DtlR.$arr_cnt_rmrks, Po_Ins01_DtlR.$arr_cnt_rmrks);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (isNull(src.dlv_cd())) {
				dest.purc_ddlv_flg(false);
			}
			else {
				dest.purc_ddlv_flg(true);
			}
		}
	}
		
	/** 入荷予定ＳＶコール用MAP（入荷予定ブロック） */
	protected Map_ArrSchd_DtlR_Po_Ins01_DtlR<ArrSchd_DtlR,Po_Ins01_DtlR> createMap_ArrSchd_DtlR_Po_Ins01_DtlR() {
		return new Map_ArrSchd_DtlR_Po_Ins01_DtlR<ArrSchd_DtlR, Po_Ins01_DtlR>();
	}

	public class Map_ArrSchd_DtlR_Po_Ins01_DtlR<D extends ArrSchd_DtlR, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			//　納期回答関連の項目は更新時にすべて消すので、常に設定しない
			//　納品書関連の項目は帳票発行ＳＶから呼ぶので、設定しない
			//　受領ＩＶ関連の項目はインボイス登録後更新不可にするため、設定しない
			addColumnPathMap(ArrSchd_DtlR.$peg_no, Po_Ins01_DtlR.$peg_no);
			addColumnPathMap(ArrSchd_DtlR.$data_crud_typ, Po_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, Po_Ins01_DtlR.$arr_schd_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_pr_no, Po_Ins01_DtlR.$arr_pr_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_tm, Po_Ins01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(ArrSchd_DtlR.$itm_cd, Po_Ins01_DtlR.$itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub1, Po_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub2, Po_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub3, Po_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(ArrSchd_DtlR.$itm_nm, Po_Ins01_DtlR.$itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$rcpt_iv_itm_nm, Po_Ins01_DtlR.$iv_itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$sundry_itm_flg, Po_Ins01_DtlR.$sundry_itm_flg);
			addColumnPathMap(ArrSchd_DtlR.$purc_id_typ, Po_Ins01_DtlR.$purc_id_typ);
			addColumnPathMap(ArrSchd_DtlR.$sno1, Po_Ins01_DtlR.$sno1);
			addColumnPathMap(ArrSchd_DtlR.$sno2, Po_Ins01_DtlR.$sno2);
			addColumnPathMap(ArrSchd_DtlR.$sno3, Po_Ins01_DtlR.$sno3);
			addColumnPathMap(ArrSchd_DtlR.$sno4, Po_Ins01_DtlR.$sno4);
			addColumnPathMap(ArrSchd_DtlR.$lot_no, Po_Ins01_DtlR.$lot_no);
			addColumnPathMap(ArrSchd_DtlR.$sublot_no, Po_Ins01_DtlR.$sublot_no);
			addColumnPathMap(ArrSchd_DtlR.$ver_no, Po_Ins01_DtlR.$ver_no);
			addColumnPathMap(ArrSchd_DtlR.$sppl_itm_cd, Po_Ins01_DtlR.$sppl_itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$sppl_itm_nm, Po_Ins01_DtlR.$sppl_itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$maker_cd, Po_Ins01_DtlR.$maker_cd);
			addColumnPathMap(ArrSchd_DtlR.$bp_lot_no, Po_Ins01_DtlR.$bp_lot_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_loc_cd, Po_Ins01_DtlR.$in_to_loc_cd);
			addColumnPathMap(ArrSchd_DtlR.$str_ln_cd, Po_Ins01_DtlR.$str_ln_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_qty, Po_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_cd, Po_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_qty, Po_Ins01_DtlR.$base_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_cd, Po_Ins01_DtlR.$base_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$abort_flg, Po_Ins01_DtlR.$abort_flg);
			addColumnPathMap(ArrSchd_DtlR.$sync_flg, Po_Ins01_DtlR.$sync_flg);
			addColumnPathMap(ArrSchd_DtlR.$outsrc_flg, Po_Ins01_DtlR.$outsrc_flg);
			addColumnPathMap(ArrSchd_DtlR.$mfg_inst_no, Po_Ins01_DtlR.$mfg_inst_no);
			addColumnPathMap(ArrSchd_DtlR.$pre_outsrc_act_flg, Po_Ins01_DtlR.$pre_outsrc_act_flg);
			addColumnPathMap(ArrSchd_DtlR.$arr_cnt_rmrks, Po_Ins01_DtlR.$arr_cnt_rmrks);
			addColumnPathMap(ArrSchd_DtlR.$io_schd_pr_no, Po_Ins01_DtlR.$io_schd_pr_no);
			addColumnPathMap(ArrSchd_DtlR.$purc_schd_no, Po_Ins01_DtlR.$purc_schd_no);
			addColumnPathMap(ArrSchd_DtlR.$accpt_schd_dt, Po_Ins01_DtlR.$purc_schd_dt);
			addColumnPathMap(ArrSchd_DtlR.$trd_ptn_typ, Po_Ins01_DtlR.$trd_ptn_typ);
			addColumnPathMap(ArrSchd_DtlR.$dlv_slip_d_rmrks, Po_Ins01_DtlR.$dlv_slip_d_rmrks);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.wg_cd(getCacheLoc(src.in_to_loc_cd()).wg_cd());
			
			if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ()) || dest.abort_flg()) {
				return;
			}
			// 入荷パタン
			setArrPtnTyp(dest, src);
			
			// 格付ＣＤ
			dest.gd_cd(getDefaultFeedStkGd().gd_cd());
			
			// 良品区分
			dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			
			// 在庫着荷先ＣＤ
			setStkArrvBpCd(dest, src);
			
			// 在庫識別区分・在庫取引先ＣＤ
			setStkIdTyp(dest, src);
		}
		/**
		 * 入荷パタン区分を設定します。
		 * @param dest
		 * @param src
		 */
		protected void setArrPtnTyp(D dest, S src) {
			if (!isNull(src.purc_schd_dt()) && src.purc_schd_dt().ltDate(src.dlv_rqst_tm())) {
				dest.arr_ptn_typ(MSC_ARR_PTN_TYP.N_YET_ARR.value());
			}
			else {
				dest.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
			}			
		}
		/**
		 * 在庫着荷先ＣＤを設定します
		 * @param dest
		 * @param src
		 */
		protected void setStkArrvBpCd(D dest, S src) {
			dest.stk_arrv_bp_cd(null);
		}
		/**
		 * 在庫識別区分・在庫取引先を設定します
		 * @param dest
		 * @param src
		 */
		protected void setStkIdTyp(D dest, S src) {
			if (MAC_PURC_ID_TYP.isVMI(src.purc_id_typ())) {
				dest.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
				dest.stk_bp_cd(src.sppl_cd());
			}
			else if (MAC_PURC_ID_TYP.isFFR_RCV(src.purc_id_typ())) {
				dest.stk_id_typ(MSC_STK_ID_TYP.NCV_RCV.value());
				dest.stk_bp_cd(src.sppl_cd());
			}
			else {
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
	}
	
	/**
	 * 入荷予定の納品書ＮＯをクリアするか。
	 * @param hdrR 訂正後のヘッダ
	 * @param dtlR 訂正後の明細
	 * @return
	 */
	protected boolean isDlvSlipCng(Po_Ins01_HdrR hdrR, Po_Ins01_DtlR dtlR, MCList<MST_ARR_SCHD_R> schdL) {
		MST_PO_D_R podR = getCachePoD(dtlR.po_d_no());
		MST_PO_R poR = getCachePo(podR.po_no());
		return //////// 発注ヘッダ項目 ////////
				!isSame(hdrR.po_dt(), poR.po_dt()) || 
				!isSame(hdrR.purc_dpt_cd(), poR.purc_dpt_cd()) ||
				!isSame(hdrR.purc_usr_cd(), poR.purc_usr_cd()) ||
				// 直送支給除く
				isNull(getCacheLoc(dtlR.in_to_loc_cd()).sppl_cd()) && dtlR.pri_print_flg() && !isSame(hdrR.trd_cur_cd(), poR.trd_cur_cd()) ||
				!isSame(hdrR.dlv_slip_rmrks(), poR.dlv_slip_rmrks()) ||
				
				//////// 発注明細項目 ////////
				dtlR.sundry_itm_flg() && !isSame(dtlR.itm_nm(), podR.itm_nm()) ||
				!isSame(dtlR.dlv_rqst_tm(), podR.dlv_rqst_tm()) ||
				!isSame(dtlR.trd_unit_cd(), podR.trd_unit_cd()) ||
				isArrSchdDlvSlipChng(dtlR, schdL) ||
				!isSame(dtlR.dlv_slip_d_rmrks(), podR.dlv_slip_d_rmrks()) ||
				// 仕入直送除く
				isNull(dtlR.dlv_cd()) && !isSame(dtlR.in_to_loc_cd(), podR.in_to_loc_cd()) ||
				!isSame(dtlR.trd_unit_qty(), podR.trd_unit_qty()) ||
				!isSame(dtlR.pri_print_flg(), podR.pri_print_flg()) ||
				// 直送支給
				!isNull(getCacheLoc(dtlR.in_to_loc_cd()).sppl_cd()) && !isSame(dtlR.sppl_itm_nm(), podR.sppl_itm_nm()) ||
				!isNull(getCacheLoc(dtlR.in_to_loc_cd()).sppl_cd()) && !isSame(dtlR.sppl_itm_cd(), podR.sppl_itm_cd()) ||
				// 直送支給除く
				isNull(getCacheLoc(dtlR.in_to_loc_cd()).sppl_cd()) && dtlR.pri_print_flg() && !isSame(dtlR.trd_cur_upri(), podR.trd_cur_upri()) ||
				isNull(getCacheLoc(dtlR.in_to_loc_cd()).sppl_cd()) && dtlR.pri_print_flg() && !isSame(dtlR.trd_cur_dscnt_amt(), podR.trd_cur_dscnt_amt()) ||
				isNull(getCacheLoc(dtlR.in_to_loc_cd()).sppl_cd()) && dtlR.pri_print_flg() && !isSame(dtlR.tax_cd(), podR.tax_cd());			
	}
	
	protected boolean isArrSchdDlvSlipChng(Po_Ins01_DtlR dtlR, MCList<MST_ARR_SCHD_R> schdL) {
		// 入荷予定単位でチェックする場合はoverride
		return false;
	}
	
	/**
	 * 入荷予定を更新するか
	 * @param hdrR 訂正後のヘッダ
	 * @param dtlR 訂正後の明細
	 * @param prR 訂正前の入荷進捗
	 * @param schdR 訂正前の入荷予定
	 * @return
	 */
	protected boolean isUpdArrSchd(Po_Ins01_HdrR hdrR, Po_Ins01_DtlR dtlR, MST_ARR_PR_R prR, MCList<MST_ARR_SCHD_R> schdL) {
		MST_PO_D_R podR = getCachePoD(dtlR.po_d_no());
		return //////// 入荷進捗項目 ////////
				!isSame(prR.rqst_dpt_cd(), dtlR.purc_dpt_cd()) ||
				!isSame(prR.rqst_wg_cd(), dtlR.wg_cd()) ||
				!isSame(prR.rqst_usr_cd(), dtlR.purc_usr_cd()) ||
				!isSame(prR.dlv_rqst_tm(), dtlR.dlv_rqst_tm()) ||
				!isSame(prR.trd_unit_qty(), dtlR.trd_unit_qty()) ||
				!isSame(prR.trd_unit_cd(), dtlR.trd_unit_cd()) ||
				!isSame(prR.abort_flg(), dtlR.abort_flg()) ||
				!isSame(prR.rsn_cd(), dtlR.purc_rsn_cd()) ||
				!isSame(prR.bd_dpt_cd(), dtlR.bd_dpt_cd()) ||
				!isSame(prR.bd_wg_cd(), dtlR.bd_wg_cd()) ||
				!isSame(prR.arr_cnt_rmrks(), dtlR.arr_cnt_rmrks()) ||
				
				//////// 発注明細・入荷予定項目 ////////
				!isSame(podR.itm_nm(), dtlR.itm_nm()) || // MST_ARR_SCHD.itm_nm
				!isSame(podR.iv_itm_nm(), dtlR.iv_itm_nm()) || // MST_ARR_SCHD.rcpt_iv_itm_nm
				!isSame(podR.sundry_itm_flg(), dtlR.sundry_itm_flg()) || // MST_ARR_SCHD.sundry_itm_flg
				!isSame(podR.purc_id_typ(), dtlR.purc_id_typ()) || // MST_ARR_SCHD.purc_id_typ
				!isSame(podR.sno1(), dtlR.sno1()) || // MST_ARR_SCHD.sno1
				!isSame(podR.sno2(), dtlR.sno2()) || // MST_ARR_SCHD.sno2
				!isSame(podR.sno3(), dtlR.sno3()) || // MST_ARR_SCHD.sno3
				!isSame(podR.sno4(), dtlR.sno4()) || // MST_ARR_SCHD.sno4
				!isSame(podR.ver_no(), dtlR.ver_no()) || // MST_ARR_SCHD.ver_no
				!isSame(podR.sppl_itm_cd(), dtlR.sppl_itm_cd()) || // MST_ARR_SCHD.sppl_itm_cd
				!isSame(podR.sppl_itm_nm(), dtlR.sppl_itm_nm()) || // MST_ARR_SCHD.sppl_itm_nm
				!isSame(podR.maker_cd(), dtlR.maker_cd()) || // MST_ARR_SCHD.maker_cd
				!isSame(podR.bp_lot_no(), dtlR.bp_lot_no()) || // MST_ARR_SCHD.bp_lot_no 
				!isSame(podR.trd_unit_qty(), dtlR.trd_unit_qty()) || //MST_ARR_SCHD.trd_unit_qty
				!isSame(podR.io_schd_pr_no(), dtlR.io_schd_pr_no()) || // MST_ARR_SCHD.io_schd_pr_no
				!isSame(podR.purc_schd_dt(), dtlR.purc_schd_dt()) || 
				!isSame(podR.sync_flg(), dtlR.sync_flg()) || // MST_ARR_SCHD.sync_flg
				!isSame(podR.dlv_rqst_tm(), dtlR.dlv_rqst_tm()) || // MST_ARR_SCHD.arr_schd_tm
				!isSame(podR.in_to_loc_cd(), dtlR.in_to_loc_cd()) || // MST_ARR_SCHD.arr_loc_cd
				!isSame(podR.str_ln_cd(), dtlR.str_ln_cd()) || // MST_ARR_SCHD.str_ln_cd
				!isSame(podR.trd_unit_cd(), dtlR.trd_unit_cd()) || // MST_ARR_SCHD.trd_unit_cd
				!isSame(podR.dlv_slip_d_rmrks(), dtlR.dlv_slip_d_rmrks()) || // MST_ARR_SCHD.dlv_slip_d_rmrks
				isArrSchdChng(dtlR, schdL);
	}

	protected boolean isArrSchdChng(Po_Ins01_DtlR dtlR, MCList<MST_ARR_SCHD_R> schdL) {
		for (MST_ARR_SCHD_R schdR : schdL) {
			if (!isSame(schdR.pre_outsrc_act_flg(), dtlR.pre_outsrc_act_flg())) {
				return true;
			}
			if (!isSame(schdR.mfg_inst_no(), dtlR.mfg_inst_no())) {
				return true;
			}
		}
		return false;
	}
	
	
	/** 購買納期調整登録ＳＶ（削除）コール用MAP */
	protected Map_DlvInst_Chk01_HdrR_Po_Ins01_Bndl_DtlR<DlvInst_Chk01_HdrR,Po_Ins01_Bndl_DtlR> createMap_DlvInst_Chk01_HdrR_Po_Ins01_Bndl_DtlR() {
		return new Map_DlvInst_Chk01_HdrR_Po_Ins01_Bndl_DtlR<DlvInst_Chk01_HdrR, Po_Ins01_Bndl_DtlR>();
	}
	public class Map_DlvInst_Chk01_HdrR_Po_Ins01_Bndl_DtlR<D extends DlvInst_Chk01_HdrR, S extends Po_Ins01_Bndl_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DlvInst_Chk01_HdrR.$po_d_no, Po_Ins01_Bndl_DtlR.$po_d_no);
		}
	}
	
	/** 承認提供ＳＶ（次処理済更新・解除）コール用MAP */
	protected MapAprv<Aprv_Chk02_Rslt1R,Po_Ins01_Bndl_DtlR> createMapAprv() {
		return new MapAprv<Aprv_Chk02_Rslt1R, Po_Ins01_Bndl_DtlR>();
	}

	public class MapAprv<D extends Aprv_Chk02_Rslt1R, S extends Po_Ins01_Bndl_DtlR> extends MCRowMapper<D,S>{
				
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Aprv_Chk02_Rslt1R.$peg_no, Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			addColumnPathMap(Aprv_Chk02_Rslt1R.$aprv_no, Po_Ins01_Bndl_DtlR.$aprv_no);

		}
	
	}
	
	
	/** 受注状況更新SVコール用MAP */
	protected Map_SloSts_DtlR_Po_Ins01_DtlR<SloSts_DtlR,Po_Ins01_DtlR> createMap_SloSts_DtlR_Po_Ins01_DtlR() {
		return new Map_SloSts_DtlR_Po_Ins01_DtlR<SloSts_DtlR, Po_Ins01_DtlR>();
	}

	public class Map_SloSts_DtlR_Po_Ins01_DtlR<D extends SloSts_DtlR, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, Po_Ins01_DtlR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$po_no, Po_Ins01_DtlR.$po_no);
			addColumnPathMap(SloSts_DtlR.$po_d_no, Po_Ins01_DtlR.$po_d_no);
			addColumnPathMap(SloSts_DtlR.$unit_cd, Po_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(SloSts_DtlR.$qty, Po_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(SloSts_DtlR.$biz_tm, Po_Ins01_DtlR.$po_dt);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			setSloStsTyp(dest, src);
		}
		
		/**
		 * 受注状況区分を設定します
		 * @param dest
		 * @param src
		 */
		protected void setSloStsTyp (D dest, S src) {
			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.PO.value());
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				if (src.abort_flg()) {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.PO_ABORT.value());
				}
				else if (!isSame(src.abort_flg(), src.bef_abort_flg())){
					dest.slo_sts_typ(MSC_SLO_STS_TYP.PO_ABORT_CAN.value());
				}
				else {
					dest.slo_sts_typ(MSC_SLO_STS_TYP.PO_UPD.value());
				}
				dest.biz_tm(null);
			}
			else {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.PO_CAN.value());
				dest.biz_tm(null);
			}
		}
	}
	
	/** 購買帳票ＳＶコール用MAP（納品書ヘッダ更新ブロック） */
	protected Map_PurcPrnt_Upd01_HdrR_Po_Ins01_HdrR<PurcPrnt_Upd01_HdrR,Po_Ins01_HdrR> createMap_PurcPrnt_Upd01_HdrR_Po_Ins01_HdrR() {
		return new Map_PurcPrnt_Upd01_HdrR_Po_Ins01_HdrR<PurcPrnt_Upd01_HdrR, Po_Ins01_HdrR>();
	}

	public class Map_PurcPrnt_Upd01_HdrR_Po_Ins01_HdrR<D extends PurcPrnt_Upd01_HdrR, S extends Po_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Upd01_HdrR.$peg_no, Po_Ins01_HdrR.$peg_no);
			addColumnPathMap(PurcPrnt_Upd01_HdrR.$dlv_slip_prnt_flg, Po_Ins01_HdrR.$prnt_dlv_flg);
			addColumnPathMap(PurcPrnt_Upd01_HdrR.$data_crud_typ, Po_Ins01_HdrR.$data_crud_typ);
			addColumnPathMap(PurcPrnt_Upd01_HdrR.$po_no, Po_Ins01_HdrR.$po_no);
			addColumnPathMap(PurcPrnt_Upd01_HdrR.$po_rev, Po_Ins01_HdrR.$po_rev);
		}
	}
	/** 購買帳票ＳＶコール用MAP（注文書ブロック） */
	protected Map_PurcPrnt_Prnt01_PoR_Po_Ins01_HdrR<PurcPrnt_Prnt01_PoR,Po_Ins01_HdrR> createMap_PurcPrnt_Prnt01_PoR_Po_Ins01_HdrR() {
		return new Map_PurcPrnt_Prnt01_PoR_Po_Ins01_HdrR<PurcPrnt_Prnt01_PoR, Po_Ins01_HdrR>();
	}

	public class Map_PurcPrnt_Prnt01_PoR_Po_Ins01_HdrR<D extends PurcPrnt_Prnt01_PoR, S extends Po_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Prnt01_PoR.$peg_no, Po_Ins01_HdrR.$peg_no);
			addColumnPathMap(PurcPrnt_Prnt01_PoR.$po_no, Po_Ins01_HdrR.$po_no);
			addColumnPathMap(PurcPrnt_Prnt01_PoR.$po_rev, Po_Ins01_HdrR.$po_rev);
		}
	}
	
	/** 購買帳票ＳＶコール用MAP（納品書ブロック） */
	protected Map_PurcPrnt_Prnt01_DlvSlipR_Po_Ins01_HdrR<PurcPrnt_Prnt01_DlvSlipR,Po_Ins01_HdrR> createMap_PurcPrnt_Prnt01_DlvSlipR_Po_Ins01_HdrR() {
		return new Map_PurcPrnt_Prnt01_DlvSlipR_Po_Ins01_HdrR<PurcPrnt_Prnt01_DlvSlipR, Po_Ins01_HdrR>();
	}
	public class Map_PurcPrnt_Prnt01_DlvSlipR_Po_Ins01_HdrR<D extends PurcPrnt_Prnt01_DlvSlipR, S extends Po_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$peg_no, Po_Ins01_HdrR.$peg_no);
			addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$po_no, Po_Ins01_HdrR.$po_no);
		}
	}
	
	/** 諸口品マスタ登録ＳＶコール用MAP（CHK処理） */
	protected Map_SundryItm_Chk01_DtlR_Po_Ins01_DtlR<SundryItm_Chk01_DtlR,Po_Ins01_DtlR> createMap_SundryItm_Chk01_DtlR_Po_Ins01_DtlR() {
		return new Map_SundryItm_Chk01_DtlR_Po_Ins01_DtlR<SundryItm_Chk01_DtlR, Po_Ins01_DtlR>();
	}

	public class Map_SundryItm_Chk01_DtlR_Po_Ins01_DtlR<D extends SundryItm_Chk01_DtlR, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, Po_Ins01_DtlR.$peg_no);
			addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ, Po_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, Po_Ins01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1, Po_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2, Po_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3, Po_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, Po_Ins01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, Po_Ins01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, Po_Ins01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, Po_Ins01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, Po_Ins01_DtlR.$itm_nm);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if(!isNull(src.po_schd_no())){
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
	}
	
	/** 諸口品マスタ登録ＳＶコール用MAP（メイン処理） */
	protected Map_SundryItm_Upd01_DtlR_Po_Ins01_DtlR<SundryItm_Upd01_DtlR,Po_Ins01_DtlR> createMap_SundryItm_Upd01_DtlR_Po_Ins01_DtlR() {
		return new Map_SundryItm_Upd01_DtlR_Po_Ins01_DtlR<SundryItm_Upd01_DtlR, Po_Ins01_DtlR>();
	}

	public class Map_SundryItm_Upd01_DtlR_Po_Ins01_DtlR<D extends SundryItm_Upd01_DtlR, S extends Po_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, Po_Ins01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1, Po_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2, Po_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3, Po_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, Po_Ins01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, Po_Ins01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, Po_Ins01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, Po_Ins01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, Po_Ins01_DtlR.$itm_nm);

		}
	}

	protected Map_Aprv_Chk04_Rslt1R_Po_Ins01_HdrR<Aprv_Chk04_Rslt1R,Po_Ins01_HdrR> createMap_AprvDel() {
		return new Map_Aprv_Chk04_Rslt1R_Po_Ins01_HdrR<Aprv_Chk04_Rslt1R, Po_Ins01_HdrR>();
	}

	public class Map_Aprv_Chk04_Rslt1R_Po_Ins01_HdrR<D extends Aprv_Chk04_Rslt1R, S extends Po_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Aprv_Chk04_Rslt1R.$aprv_no, Po_Ins01_HdrR.$bef_aprv_no);
		}
	}

	protected Map_Ord_Sprt03_DtlR_MST_PO_SCHD_R<Ord_Sprt03_DtlR,MST_PO_SCHD_R> createMap_Ord_Sprt03_DtlR_MST_PO_SCHD_R() {
		return new Map_Ord_Sprt03_DtlR_MST_PO_SCHD_R<Ord_Sprt03_DtlR, MST_PO_SCHD_R>();
	}

	public class Map_Ord_Sprt03_DtlR_MST_PO_SCHD_R<D extends Ord_Sprt03_DtlR, S extends MST_PO_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, MST_PO_SCHD_R.$itm_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, MST_PO_SCHD_R.$itm_sub1);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, MST_PO_SCHD_R.$itm_sub2);
			addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, MST_PO_SCHD_R.$itm_sub3);
			addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, MST_PO_SCHD_R.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, MST_PO_SCHD_R.$bom_ptn);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, MST_PO_SCHD_R.$dlv_rqst_tm);
			addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, MST_PO_SCHD_R.$po_schd_dt);
			addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, MST_PO_SCHD_R.$in_to_loc_cd);
			addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, MST_PO_SCHD_R.$base_unit_qty);
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

	protected Map_Ord_Sprt02_DtlR_MST_PO_SCHD_R<Ord_Sprt02_DtlR,MST_PO_SCHD_R> createMap_Ord_Sprt02_DtlR_MST_PO_SCHD_R() {
		return new Map_Ord_Sprt02_DtlR_MST_PO_SCHD_R<Ord_Sprt02_DtlR, MST_PO_SCHD_R>();
	}

	public class Map_Ord_Sprt02_DtlR_MST_PO_SCHD_R<D extends Ord_Sprt02_DtlR, S extends MST_PO_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, MST_PO_SCHD_R.$itm_cd);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, MST_PO_SCHD_R.$itm_sub1);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, MST_PO_SCHD_R.$itm_sub2);
			addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, MST_PO_SCHD_R.$itm_sub3);
			addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, MST_PO_SCHD_R.$mfg_loc_cd);
			addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, MST_PO_SCHD_R.$bom_ptn);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno1, MST_PO_SCHD_R.$sno1);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno2, MST_PO_SCHD_R.$sno2);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno3, MST_PO_SCHD_R.$sno3);
			addColumnPathMap(Ord_Sprt02_DtlR.$sno4, MST_PO_SCHD_R.$sno4);
			addColumnPathMap(Ord_Sprt02_DtlR.$inst_qty, MST_PO_SCHD_R.$base_unit_qty);
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
	 * Po_RevUpd01オペレーション.<p>
	 *
	 * 発注改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class Po_RevUpd01 extends MSBDL_PoRegService_MC_A.Po_RevUpd01 {

		protected MCList<MST_PO_R> _hCurrentL = MCList.create(MST_PO_R.class);
		protected MCList<MST_PO_D_R> _dCurrentL = MCList.create(MST_PO_D_R.class);
		protected MCList<MST_PO_P_R> _hRevL = MCList.create(MST_PO_P_R.class);
		protected MCList<MST_PO_D_P_R> _dRevL = MCList.create(MST_PO_D_P_R.class);

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
			MCList<MST_PO_R> wkL = MCList.create(MST_PO_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_PO_R wkR = MST_PO_R.create();
				wkR.po_no(r.rev_data_src_no());
				wkR.po_rev(r.rev_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
			dbWkDelete("MSBDL5100_MSW_PO_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5100_MSW_PO_I01",
					wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());

			MCList<MST_PO_P_R> wkpL = MCList.create(MST_PO_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_PO_P_R wkpR = MST_PO_P_R.create();
				wkpR.po_no(r.rev_data_src_no());
				wkpR.po_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(MST_PO_P_R.create("T"));
			dbWkDelete("MSBDL5100_MSW_PO_P_D01", wkpL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5100_MSW_PO_P_I01",
					wkpL.groupBy(wkpL_bldr.getBaseDbc().getKeyColumn()), wkpL_bldr.getBaseDbc());
		}

		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		private void selectCurrent() {
			MSW_PO_KEY_R w1 = MSW_PO_KEY_R.create("W");
			MSW_PO_P_KEY_R w2 = MSW_PO_P_KEY_R.create("W");

			MST_PO_R hCurrentL_t = MST_PO_R.create("T");
			MCQueryApiBuilder hCurrentL_bldr = MCQueryApiBuilder.create(hCurrentL_t);
			hCurrentL_bldr.addInnerJoin(w1, hCurrentL_t.po_no.eq(w1.po_no));
			dbSelect("MSBDL5100_MST_PO_S01", _hCurrentL, hCurrentL_bldr);

			MST_PO_D_R dCurrentL_t = MST_PO_D_R.create("T");
			MCQueryApiBuilder dCurrentL_bldr = MCQueryApiBuilder.create(dCurrentL_t);
			dCurrentL_bldr.addInnerJoin(w1, dCurrentL_t.po_no.eq(w1.po_no));
			dbSelect("MSBDL5100_MST_PO_D_S01", _dCurrentL, dCurrentL_bldr);

			MST_PO_P_R hRevL_t = MST_PO_P_R.create("T");
			MCQueryApiBuilder hRevL_bldr = MCQueryApiBuilder.create(hRevL_t);
			hRevL_bldr.addInnerJoin(w2, hRevL_t.po_no.eq(w2.po_no)
					.and(hRevL_t.po_rev.eq(w2.po_rev)));
			dbSelect("MSBDL5100_MST_PO_P_S01", _hRevL, hRevL_bldr);

			MST_PO_D_P_R dRevL_t = MST_PO_D_P_R.create("T");
			MCQueryApiBuilder dRevL_bldr = MCQueryApiBuilder.create(dRevL_t);
			dRevL_bldr.addInnerJoin(w2, dRevL_t.po_no.eq(w2.po_no)
					.and(w2.po_rev.eq(w2.po_rev)));
			dbSelect("MSBDL5100_MST_PO_D_P_S01", _dRevL, dRevL_bldr);
		}

		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加または更新する。
		 */
		private void revisionInsOrUpd() {
			// ヘッダーの改訂履歴テーブルを追加または更新する。
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_PO_P_R.$po_no, MST_PO_P_R.$po_rev);
			MCList<MST_PO_P_R> hUpd = MCList.create(MST_PO_P_R.class);
			MCList<MST_PO_P_R> hIns = MCList.create(MST_PO_P_R.class);

			for (MST_PO_R hcurrentR : _hCurrentL) {
				MST_PO_P_R tempRevR = MST_PO_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.po_no(), hcurrentR.po_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			if (!isNull(hIns)) {
				MCQueryApiBuilder hIns_bldr = MCQueryApiBuilder.create(MST_PO_P_R.create("T"));
				dbInsert("MSBDL5100_MST_PO_P_I01", hIns, hIns_bldr);
			}
			MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(MST_PO_P_R.create("T"));
			if (!isNull(hUpd)) {
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBDL5100_MST_PO_P_U01", hUpd, hUpd_bldr);
			}

			// 明細の改訂履歴テーブルを追加または更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_PO_D_P_R.$po_d_no, MST_PO_D_P_R.$po_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_PO_D_P_R.$po_no);
			MCList<MST_PO_D_P_R> dUpd = MCList.create(MST_PO_D_P_R.class);
			MCList<MST_PO_D_P_R> dIns = MCList.create(MST_PO_D_P_R.class);

			for (MST_PO_D_R dcurrentR : _dCurrentL) {
				MST_PO_D_P_R tempRevR = MST_PO_D_P_R.create();
				tempRevR.setByName(dcurrentR);

				// ヘッダーより改訂番号を取得
				MST_PO_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, dcurrentR.po_no());
				tempRevR.po_rev(hCurrentR.po_rev());
				if (_dRevL == null ||isNull(_dRevL.getFirst(dRevIdx, tempRevR.po_d_no(), tempRevR.po_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
			}
			if (!isNull(dIns)) {
				MCQueryApiBuilder dIns_bldr = MCQueryApiBuilder.create(MST_PO_D_P_R.create("T"));
				dbInsert("MSBDL5100_MST_PO_D_P_I01", dIns, dIns_bldr);
			}
			if (!isNull(dUpd)) {
				MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(MST_PO_D_P_R.create("T"));
				dUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBDL5100_MST_PO_D_P_U01", dUpd, dUpd_bldr);
			}
		}
	}

	//FMCB CUSTOM END
}